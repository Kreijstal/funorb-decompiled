/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountServiceResult {
    String[] suggestions;
    boolean success;
    static String field_b;
    static String field_e;
    int statusCode;
    String message;
    boolean field_a;

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -31) {
          AccountServiceResult.b((byte) 118);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static void b(byte param0) {
        ta.a((byte) -118, vi.b(0));
        if (param0 >= -60) {
          field_e = (String) null;
        }
    }

    final static void a(int param0, String param1, String param2) {
        try {
          d.a(param2, false, param1, 0);
          if (param0 != -8742) {
            AccountServiceResult.a((byte) -58);
          }
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "rg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    AccountServiceResult(boolean param0) {
        this.success = param0 ? true : false;
    }

    static {
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_e = "Go Back";
    }
}
