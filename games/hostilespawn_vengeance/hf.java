/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static jf field_g;
    static bd field_b;
    static int field_i;
    static wm field_c;
    static int field_a;
    static bd field_j;
    static String[] field_d;
    static bd field_e;
    static int field_h;
    static String field_f;

    final static pg a(byte param0, gb param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (rl.a(2884, param1, param2, param3)) {
            return rg.b(0);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("hf.A(").append(119).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_g = null;
        field_d = null;
        field_c = null;
        field_j = null;
        field_e = null;
        field_b = null;
    }

    final synchronized static byte[] a(boolean param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (mb.field_i <= 0) {
              break L0;
            } else {
              byte[][] fieldTemp$8 = rf.field_i;
              int fieldTemp$9 = mb.field_i - 1;
              mb.field_i = mb.field_i - 1;
              var2_ref_byte__ = fieldTemp$8[fieldTemp$9];
              rf.field_i[mb.field_i] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param1 != 5000) {
            break L1;
          } else {
            if (gn.field_t > 0) {
              int fieldTemp$10 = gn.field_t - 1;
              gn.field_t = gn.field_t - 1;
              var2_ref_byte__ = pl.field_i[fieldTemp$10];
              pl.field_i[gn.field_t] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param1 != 30000) {
            break L2;
          } else {
            if (gm.field_f <= 0) {
              break L2;
            } else {
              int fieldTemp$11 = gm.field_f - 1;
              gm.field_f = gm.field_f - 1;
              var2_ref_byte__ = cn.field_m[fieldTemp$11];
              cn.field_m[gm.field_f] = null;
              return var2_ref_byte__;
            }
          }
        }
        L3: {
          if (null == c.field_c) {
            break L3;
          } else {
            var2 = 0;
            L4: while (true) {
              if (var2 >= ni.field_a.length) {
                break L3;
              } else {
                if (param1 == ni.field_a[var2]) {
                  if (mg.field_e[var2] > 0) {
                    mg.field_e[var2] = mg.field_e[var2] - 1;
                    var3 = c.field_c[var2][mg.field_e[var2] - 1];
                    c.field_c[var2][mg.field_e[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          }
        }
        return new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
        field_g = new jf();
        field_f = "Retry";
    }
}
