Feature: Purchase an item on BangGood app

  @RecommendedTest
  Scenario Outline:  Searching and purchasing an item on BangGood app
    Given That Brandon opens the app BangGood
    When  Brandon interacts with the elements and adds them to cart
    Then  he sees the <items> on the cart list
    Examples:
      | items                                                                                                             |
      | 7/12/18PCS Set Nail Clipper Set Durable Nail File Nose Trimmer Toenail Clipper Beauty Nail Manicure Pedicure Tool |

  @CategoriesTest
  Scenario Outline:  Searching and purchasing by category
    Given That Brandon opens the app BangGood
    When  Brandon selects a category and goes to water sports to purchase a pair of fins
    Then  he sees the <items> on the cart list
    Examples:
      | items                                                                                                             |
      | 7/12/18PCS Set Nail Clipper Set Durable Nail File Nose Trimmer Toenail Clipper Beauty Nail Manicure Pedicure Tool |
