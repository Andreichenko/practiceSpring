var app = angular.module("springRest", []);

app.controller("AppCtrl", function ($scope) {

    $scope.websites=[];

    $http.get('http://localhost:8090/api/stack').success(function (data) {
        $scope.websites = data;
    })


});