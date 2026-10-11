/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static int field_b;
    static kc[] field_a;
    static String field_c;

    public static void a(byte param0) {
        field_c = null;
        if (param0 < -82) {
          field_a = null;
          return;
        }
        qk var2 = (qk) null;
        tc.a(51, -63, -35, (qk) null);
        field_a = null;
    }

    final static void a(int param0, kc[] param1, int param2, int param3) {
        try {
          ij.field_f = new vg(param1);
          eg.field_d = param3;
          dh.field_k = param2;
          rl.a(false);
          if (param0 != -17185) {
            tc.a((byte) 82);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "tc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, qk param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 25479) {
            field_c = (String) null;
          }
          var5 = param3.a(param0, (byte) -115, param1);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          db.a(true, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("tc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_c = "Retry";
    }
}
