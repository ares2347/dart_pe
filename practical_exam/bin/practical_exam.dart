import 'dart:io';

import 'package:practical_exam/model/customer.dart';
import 'package:practical_exam/service/customer_service.dart';
import 'package:practical_exam/service/impl/customer_service_impl.dart';

void main(List<String> arguments) async {
  CustomerService customerService = CustomerServiceImpl();
  String? option = "";
  do{
    //Print out options
    stdout.writeln();
    stdout.writeln("Please select your action:");
    stdout.writeln("1. Add new customer");
    stdout.writeln("2. View list customer");
    stdout.writeln("0. Exit");
    option = stdin.readLineSync();

    switch (option) {
      case "1":
        //add new customer
        stdout.writeln("Input full name:");
        String? name = stdin.readLineSync();
        stdout.writeln("Input birthday:");
        String? birthday = stdin.readLineSync();
        stdout.writeln("Input address:");
        String? address = stdin.readLineSync();
        stdout.writeln("Input phone number:");
        String? phoneNumber = stdin.readLineSync();
        try{
          Customer customer = Customer(
              fullName: name,
              address: address,
              birthday: birthday,
              phoneNumber: phoneNumber);
          await customerService.addCustomer(customer);
          stdout.writeln("Add new customer successfully!");
        }catch(ex){
          stdout.writeln("Failed to add new customer");
        }
        break;
      case "2":
      //get all customer
        List<Customer> customers = await customerService.getAllCustomer();
        stdout.writeln("Customer list: ");
        for (var value in customers) {
          stdout.writeln("$value");
        }
        break;
      case "0":
        break;
      default:
        stdout.writeln("Selection invalid!");
    }
    stdout.writeln();
    stdout.writeln("Press any key to continue");
    stdin.readLineSync();
  }while(option != "0");

}
