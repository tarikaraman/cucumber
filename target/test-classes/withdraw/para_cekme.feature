# language: en
Feature:
  Scenario Outline: Para Çekme
    Given Bankada şu kadar param var <Bakiye>
    When <Tutar> miktarında para çekersem
    Then Hesabımda da kalan miktarında bu olması beklerim : <Hesabımda kalan>

  Examples:
  | Bakiye    | Tutar     | Hesabımda kalan |
  | 500TRY   | 50TRY      | 450TRY          |
  | 500TRY   | 100TRY     | 400TRY          |
  | 500TRY   | 200TRY     | 300TRY          |


