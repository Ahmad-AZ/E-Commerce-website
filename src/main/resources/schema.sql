CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
SELECT gen_random_uuid();

CREATE TABLE IF NOT EXISTS order_details(
    order_id uuid DEFAULT  gen_random_uuid() PRIMARY KEY,
    itemID BIGINT REFERENCES item(item_id),
    itemQyt INT NOT NULL

);

create sequence if not exists cart_seq;
create table cart(
  cart_id  BIGINT unique NOT NULL DEFAULT  nextval('cart_seq') PRIMARY KEY


);