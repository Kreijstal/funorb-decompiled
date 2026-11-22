/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountServiceResult {
    static String field_c;
    static am field_e;
    int statusCode;
    String message;
    boolean field_f;
    String[] suggestions;
    static String field_a;
    boolean success;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        if (param0 == 14403) {
          return;
        }
        AccountServiceResult.a(-109, true);
    }

    final static void a(int param0, boolean param1) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ca var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = CrazyCrystals.field_B;
        try {
          var4 = (ca) (gn.field_Q.beginForward(32073));
          while (var4 != null) {
            nh.a(param0, (byte) -99, var4);
            var4 = (ca) (gn.field_Q.nextForward(false));
          }
          var2 = pm.field_c.beginForward(32073);
          while (var2 != null) {
            eq.b(2, param0);
            var2 = pm.field_c.nextForward(param1);
          }
          if (!param1) {
            return;
          }
          AccountServiceResult.a(98, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2_ref), "si.A(" + param0 + ',' + param1 + ')');
        }
    }

    AccountServiceResult(boolean param0) {
        this.success = param0 ? true : false;
    }

    static {
        field_c = "Confirm Password: ";
        field_a = "Log in / Create account";
    }
}
