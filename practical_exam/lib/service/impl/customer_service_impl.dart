import 'dart:convert';

import 'package:practical_exam/model/customer.dart';
import 'package:practical_exam/service/customer_service.dart';
import 'package:http/http.dart' as http;

class CustomerServiceImpl implements CustomerService{
  final String baseUrl = "http://localhost:8080/api/customer";

  @override
  Future<Customer?> addCustomer(Customer customer) async {
    try{
      final response = await http.post(
          Uri.parse("$baseUrl/add"),
          headers: {"Content-Type": "application/json"},
          body: jsonEncode(customer.toJson()));
      if (response.statusCode == 200) {
        var data = jsonDecode(response.body);
        return Customer.valueFromJson(data);
      }
    }catch(ex){
      print(ex);
    }
    return null;
  }

  @override
  Future<List<Customer>> getAllCustomer() async {
    try {
      final response = await http.get(Uri.parse("$baseUrl/list"));
      if (response.statusCode == 200) {
        var data = jsonDecode(response.body) as List;
        return data.map((item) => Customer.valueFromJson(item)).toList();
      }
    } catch(e) {
      print(e);
    }
    return <Customer>[];
  }
}