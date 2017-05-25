$(document).ready(function() {
    var uniDiv = $("#uni");

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
})







/*$(document).ready(function() {
    var uniDiv = $("#uni");

    $.ajax({
        url: '/uni',
        method: 'GET',
        dataType: 'json',
        success: function (data) {
            for (var key in data) {
                var item = data[key];

                var span = document.createElement("span");
                span.setAttribute("id", key);

                var elem = document.createElement("p");
                elem.innerHTML = item;


                span.append(elem);
                uniDiv.append(span);

            }
        }
    });
})*/

