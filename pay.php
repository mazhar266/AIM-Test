<?php
require_once 'anet_php_sdk/AuthorizeNet.php'; // Make sure this path is correct.
$transaction = new AuthorizeNetAIM('YOUR_API_LOGIN_ID', 'YOUR_TRANSACTION_KEY');
$transaction->amount = '1.00';
$transaction->card_num = '4007000000027';
$transaction->exp_date = '10/16';

$response = $transaction->authorizeAndCapture();

if ($response->approved) {
  echo "<h1>Success! The test credit card has been charged!</h1>";
  echo "Transaction ID: " . $response->transaction_id;
} else {
  echo $response->error_message;
}
?>