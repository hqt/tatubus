function initialize() {
    var mapOptions = {
        zoom: 15,
        center: new google.maps.LatLng(10.833333, 106.616669),
        mapTypeId: google.maps.MapTypeId.ROADMAP//TERRAIN
    };
    var mapCanvas = document.getElementById('map-canvas');
    var map = new google.maps.Map(mapCanvas, mapOptions);
}

google.maps.event.addDomListener(window, 'load', initialize);

function showmap() {
    var mapOptions = {
        zoom: 15,
        center: new google.maps.LatLng(10.833333, 106.616669),
        mapTypeId: google.maps.MapTypeId.ROADMAP//TERRAIN
    };
    var mapCanvas = document.getElementById('map-canvas');
    var map = new google.maps.Map(mapCanvas, mapOptions);
    var myLatlng = new google.maps.LatLng(10.853132, 106.62628940000002);
    var contentString = '<div id="content">' + 'Hello World' + '</div>';
    var infowindow = new google.maps.InfoWindow({
        content: contentString
    });
    var marker = new google.maps.Marker({
        position: myLatlng,
        map: map,
        title: 'TRUNGHD'
    });
    google.maps.event.addListener(marker, 'click', function () {
        infowindow.open(map, marker);
    });
    var flightPlanCoordinates = [
        new google.maps.LatLng(10.833333, 106.616669),
        new google.maps.LatLng(10.834433, 106.617779),
        new google.maps.LatLng(10.833533, 106.618889),
        new google.maps.LatLng(10.833633, 106.619999)
    ];
    var flightPath = new google.maps.Polyline({
        path: flightPlanCoordinates,
        geodesic: true,
        strokeColor: '#FF0000',
        strokeOpacity: 1.0,
        strokeWeight: 2
    });

    flightPath.setMap(map);
    google.maps.event.addDomListener(window, 'load', initialize);
}

function autocompleteAddress() {
    var autocomplete1, autocomplete2;
    // Create the autocomplete object, restricting the search
    // to geographical location types.
    autocomplete1 = new google.maps.places.Autocomplete(
            /** @type {HTMLInputElement} */(document.getElementById('autocomplete1')),
            {types: ['geocode']});
    autocomplete2 = new google.maps.places.Autocomplete(
            /** @type {HTMLInputElement} */(document.getElementById('autocomplete2')),
            {types: ['geocode']});
    // When the user selects an address from the dropdown
}

var geocoderA, geocoderB;
document.addEventListener("DOMContentLoaded", function (event) {
    geocoderA = new google.maps.Geocoder();
    geocoderB = new google.maps.Geocoder();
});
var latitudeA, longitudeA, latitudeB, longitudeB;
function getAddressLocation() {
    var searchValueA = document.getElementById("autocomplete1").value;
    var searchValueB = document.getElementById("autocomplete2").value;
    geocoderA.geocode({'address': searchValueA}, function (results, status) {

        if (status === google.maps.GeocoderStatus.OK) {
            latitudeA = results[0].geometry.location.lat();
            longitudeA = results[0].geometry.location.lng();
            console.log("A:" + latitudeA + " " + longitudeA);
        }
        
        geocoderB.geocode({'address': searchValueB}, function (results, status) {

        if (status === google.maps.GeocoderStatus.OK) {
            latitudeB = results[0].geometry.location.lat();
            longitudeB = results[0].geometry.location.lng();
            console.log("B:" + latitudeB + " " + longitudeB);
            
             console.log('fuck');
    var xmlhttp=new XMLHttpRequest();
    xmlhttp.onreadystatechange=function(){
        if (xmlhttp.readyState===4 && xmlhttp.status===200){
              var response = xmlhttp.responseText;
              console.log(response);
        }
        xmlhttp.open("GET","/ControllerServlet?latA=10&longA=10&latB=10&longB=10",true);
        xmlhttp.send();
        console.log('send');
    }
        }
        });
    });
    
    
    // code nay sai het roi. mai sua lai ;(
   
    
   /* var form = document.createElement("form");
    form.setAttribute("method", "POST");
    form.setAttribute("action", "ControllerServlet");
    var hiddenField = document.createElement("input");
    hiddenField.setAttribute("type", "hidden");
    hiddenField.setAttribute("name", "latitudeA");
    hiddenField.setAttribute("value", latitudeA.toString());

    form.appendChild(hiddenField);
    document.body.appendChild(form);
    form.submit();*/
    
    
    
//    $.ajax({
//        url: '//ControllerServlet',
//        data:{
//            'latitudeA': latitudeA,
//            'longtitudeA': longitudeA,
//            'latitudeB': latitudeB,
//            'longitudeB': longitudeB
//        }
//    });
}
