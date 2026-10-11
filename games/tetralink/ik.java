/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static uf field_d;
    static double field_b;
    static int field_e;
    static int field_a;
    static java.applet.Applet field_c;
    static String field_f;

    final static sj a(int param0) {
        if (fk.field_Q == ma.field_d) {
          throw new IllegalStateException();
        }
        if (field_d == ma.field_d) {
          ma.field_d = fk.field_Q;
          return va.field_n;
        }
        if (param0 < 126) {
          return (sj) null;
        }
        return null;
    }

    public static void b(int param0) {
        if (param0 == -137) {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        ik.a((byte[]) null, false, -83);
        field_f = null;
        field_d = null;
        field_c = null;
    }

    final static Object a(byte[] param0, boolean param1, int param2) {
        la var3 = null;
        RuntimeException var3_ref = null;
        la stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param2 > ~param0.length) {
            var3 = new la();
            ((jd) ((Object) var3)).a(-10543, param0);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (param1) {
            stackIn_10_0 = ak.a(-14074, param0);
            return stackIn_10_0;
          }
          stackIn_8_0 = (byte[]) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ik.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = new uf();
        field_b = Math.atan2(1.0, 0.0);
    }
}
