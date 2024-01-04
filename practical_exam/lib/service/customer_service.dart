import 'package:practical_exam/model/customer.dart';

abstract class CustomerService {
  Future<List<Customer>> getAllCustomer();
  Future<Customer?> addCustomer(Customer customer);
}