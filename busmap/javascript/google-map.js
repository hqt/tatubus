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
	
function showmap(){
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
google.maps.event.addListener(marker, 'click', function() {
    infowindow.open(map,marker);
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
	var autocomplete;
  // Create the autocomplete object, restricting the search
  // to geographical location types.
	autocomplete = new google.maps.places.Autocomplete(
      /** @type {HTMLInputElement} */(document.getElementById('autocomplete')),
      { types: ['geocode'] });
  // When the user selects an address from the dropdown
}
