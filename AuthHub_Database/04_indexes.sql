ALTER TABLE auth_tokens ADD INDEX idx_user_id (user_id);
ALTER TABLE otp_codes ADD INDEX idx_otp_user_id (user_id);