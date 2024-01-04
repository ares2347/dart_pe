class Customer {
  int? id;
  String? fullName;
  String? birthday;
  String? address;
  String? phoneNumber;

  Customer({this.id, this.fullName, this.birthday, this.address, this.phoneNumber});

  factory Customer.valueFromJson(Map<String, dynamic> json){
    return Customer(
      id: json["id"] as int,
      fullName: json["fullName"] as String,
      birthday: json["birthday"] as String,
      address: json["address"] as String,
      phoneNumber: json["phoneNumber"] as String,
    );
  }

  @override
  String toString(){
    return "id: $id, Full Name: $fullName, Birthday: $birthday, Address: $address, Phone Number: $phoneNumber";
  }

  Map<String, dynamic> toJson() =>
      {
        'fullName': fullName,
        'birthday': birthday,
        'address': address,
        'phoneNumber': phoneNumber
      };

}