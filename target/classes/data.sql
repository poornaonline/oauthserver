-- insert client details
INSERT INTO oauth_client_details
   (client_id, client_secret, scope, authorized_grant_types,
   authorities, access_token_validity, refresh_token_validity)
VALUES
   ('client', '$2a$10$Oz6IgViDPniXQjDMYZUDee7KhXWH/RuV9ZNhQKtCn12mRNuHJjPGK', 'read,write,trust', 'password,refresh_token',
   'ROLE_CLIENT,ROLE_TRUSTED_CLIENT', 900, 2592000);