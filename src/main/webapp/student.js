$(document).ready(function() {
    var studentsDiv = $("#students");

    var urluid = window.location.search.substring(1);
    var uid = urluid.split("=")[1];

    //if more element:
    //var url = window.location.search.substring(1);
    //var splittedurl = url.split("&");
    //for (var i=0;i<splittedurl.length;i++) {
    //   var value = splittedurl[i].split("=")[1];
    //    alert(value);
    //}

    alert(uid);

    $.ajax({
        url: '/student',
        method: 'GET',
        dataType: 'json',
        data: {id:uid},
        success: function (data) {
            var students = data;

            for (var i in students) {
                var item = students[i].name;

                var paragraph = document.createElement("p");
                paragraph.appendChild(document.createTextNode(students[i].name));

                studentsDiv.append(paragraph);
            }
        }
    });
})
