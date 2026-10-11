/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    int field_c;
    static df field_a;
    static int field_f;
    int field_b;
    int field_g;
    static String field_e;
    static boolean field_i;
    static String field_d;
    int field_h;

    final static String a(boolean param0) {
        if (fk.field_q == hg.field_ub) {
          return ol.field_j;
        }
        if (param0) {
          return (String) null;
        }
        return nd.field_K;
    }

    public static void a(int param0) {
        if (param0 > 42) {
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        }
        field_f = -71;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static boolean b(int param0) {
        if (param0 < 6) {
          field_a = (df) null;
          return kc.field_k;
        }
        return kc.field_k;
    }

    final static boolean a(int param0, vj param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -98) {
            fl.a(true);
          }
          var5 = param1.a(param2, param0, (byte) 35);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          lk.a(var5, param3 ^ -55);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_e = "Email is valid";
        field_i = true;
    }
}
