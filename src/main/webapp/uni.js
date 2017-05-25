function getAll() {
    var uniDiv = $("#uni");
    uniDiv.empty();

    $.ajax({
        url: '/uni',
        method: 'GET',
        dataType: 'json',
        success: function (data) {
            var unis = data;

            for (var i in unis) {
                var item = unis[i].name;

                var link = document.createElement("a");
                link.setAttribute("href", "student.html?uid=" + unis[i].id);
                link.appendChild(document.createTextNode(unis[i].name));

                uniDiv.append(link);
                uniDiv.append("<br>");


            }
        }
    });
}

function addUni() {
    var text = $("#text").val();

    $.ajax({
        url: '/uni',
        method: 'POST',
        dataType: 'json',
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8;',
        data: {text:text}
    });

    getAll();
}
