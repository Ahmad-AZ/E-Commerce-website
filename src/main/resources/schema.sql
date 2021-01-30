
create sequence if not exists cart_seq;
create table cart(
  cart_id  BIGINT unique NOT NULL DEFAULT  nextval('cart_seq') PRIMARY KEY


);