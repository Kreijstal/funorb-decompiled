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
        if (fk.field_Q != ma.field_d) {
          if (field_d != ma.field_d) {
            if (param0 >= 126) {
              return null;
            } else {
              return (sj) null;
            }
          } else {
            ma.field_d = fk.field_Q;
            return va.field_n;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void b(int param0) {
        byte[] var2;
        if (param0 != -137) {
          var2 = (byte[]) null;
          ik.a((byte[]) null, false, -83);
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static Object a(byte[] param0, boolean param1, int param2) {
        la var3 = null;
        RuntimeException var3_ref = null;
        la stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (param2 <= (param0.length ^ -1)) {
                if (param1) {
                  stackIn_10_0 = ak.a(-14074, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = (byte[]) (param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var3 = new la();
                ((jd) ((Object) var3)).a(-10543, param0);
                stackIn_5_0 = (la) (var3);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ik.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    static {
        field_d = new uf();
        field_b = Math.atan2(1.0, 0.0);
    }
}
