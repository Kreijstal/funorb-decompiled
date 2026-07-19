/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static ci field_b;
    static int[] field_c;
    static long[] field_d;
    static boolean field_a;

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = qd.a(false);
        var2 = nj.b(3);
        de.field_c.a(vh.field_g + -o.field_f, (o.field_f << 1324516449) + var1, var2 + (bb.field_b << -393711775), true, -bb.field_b + id.field_c);
        le.a((byte) -115);
        if (param0 != 6) {
          field_b = (ci) null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (param0 == -393711775) {
          if (pi.field_d != null) {
            if (null == pi.field_d.field_k) {
              ud.field_d = null;
              pi.field_d = null;
              return;
            } else {
              pi.field_d.field_k.field_gb = false;
              ud.field_d = null;
              pi.field_d = null;
              return;
            }
          } else {
            ud.field_d = null;
            pi.field_d = null;
            return;
          }
        } else {
          field_b = (ci) null;
          if (pi.field_d == null) {
            ud.field_d = null;
            pi.field_d = null;
            return;
          } else {
            L0: {
              if (null != pi.field_d.field_k) {
                pi.field_d.field_k.field_gb = false;
                break L0;
              } else {
                break L0;
              }
            }
            ud.field_d = null;
            pi.field_d = null;
            return;
          }
        }
    }

    final static boolean a(int param0, p param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.i(-111);
              if ((var2_int ^ -1) != param0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("fi.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 < 123) {
            field_b = (ci) null;
        }
    }

    static {
        field_d = new long[32];
    }
}
