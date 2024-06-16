#[yyyy/MM/dd] new task hear
...
\n
#2024/06/16 We need a database ledge, a front-end, ledger writer, balance reader, transaction history
System components:
+ 1. loadgen 
+ 2. frontend
+ 3. user service 
+ 4. contacts
+ 5. ledger writer
+ 6. balance reader
+ 7. transaction history
+ 8. accounts db
+ 9. ledger db

Follow: https://github.com/GoogleCloudPlatform/bank-of-anthos
HTTP-based web app that simulates a bank's payment processing network, allowing users to create artificial bank accounts and complete transactions.
>Service	>Language	>Description
>frontend	>Python	>Exposes an HTTP server to serve the website. Contains login page, signup page, and home page.
>ledger-writer	>Java	>Accepts and validates incoming transactions before writing them to the ledger.
>balance-reader	>Java	>Provides efficient readable cache of user balances, as read from ledger-db.
transaction-history	Java	Provides efficient readable cache of past transactions, as read from ledger-db.
>ledger-db	>PostgreSQL	>Ledger of all transactions. Option to pre-populate with transactions for demo users.
>user-service	>Python	>Manages user accounts and authentication. Signs JWTs used for authentication by other services.
>contacts	>Python	Stores >list of other accounts associated with a user. Used for drop down in "Send Payment" and "Deposit" forms.
>accounts-db	>PostgreSQL	>Database for user accounts and associated data. Option to pre-populate with demo users.
>loadgenerator	>Python/Locust	>Continuously sends requests imitating users to the frontend. Periodically creates new accounts and simulates transactions between them.