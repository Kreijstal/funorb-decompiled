/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginCredentialType {
    static int field_b;
    static int field_a;
    int wireId;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void showAccountSignupPrompt(boolean guard) {
        SlowBurstParticle.field_y.transitionToContent((byte) -107, new AccountSignupPrompt());
        if (!guard) {
          LoginCredentialType.showAccountSignupPrompt(false);
        }
    }

    LoginCredentialType(int encoding) {
        this.wireId = encoding;
    }

    static {
        field_a = 0;
    }
}
