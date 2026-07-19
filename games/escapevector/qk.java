/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static dn field_e;
    String field_i;
    int field_b;
    static int field_j;
    String field_d;
    mf field_h;
    static String field_a;
    static la field_g;
    static int[] field_f;
    String field_c;

    public static void a(byte param0) {
        int var1 = -8 / ((4 - param0) / 38);
        field_e = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    final static void a(boolean param0, int param1) {
        di.field_d = null;
        mj.field_d = 0;
        int var2 = -17 % ((-17 - param1) / 39);
        pl.field_q.b(-26480, param0);
        gi.a((byte) -123);
    }

    final static void a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if ((nk.field_n ^ -1) == -98) {
                  break L2;
                } else {
                  if (nk.field_n == 99) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var2_int = di.field_d.field_h;
                var2_int++;
                if (var2_int < param0.length) {
                  break L3;
                } else {
                  var2_int = 0;
                  break L3;
                }
              }
              di.field_d.a(false, var2_int);
              break L1;
            }
            L4: {
              if (param1 == 0) {
                break L4;
              } else {
                field_e = (dn) null;
                break L4;
              }
            }
            L5: {
              if (96 == nk.field_n) {
                break L5;
              } else {
                if (98 == nk.field_n) {
                  break L5;
                } else {
                  return;
                }
              }
            }
            L6: {
              var2_int = di.field_d.field_h;
              var2_int--;
              if (0 > var2_int) {
                var2_int = -1 + param0.length;
                break L6;
              } else {
                break L6;
              }
            }
            di.field_d.a(false, var2_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("qk.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "To server list";
    }
}
