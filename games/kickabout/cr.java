/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr implements gj {
    private hu field_h;
    private int field_a;
    static ff field_b;
    private int field_i;
    static String field_g;
    static int field_c;
    static vd field_d;
    static String field_f;
    static dg field_e;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_g = null;
        field_e = null;
        if (param0 != 18086) {
          cr.a(-74);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    public cr() {
        ((cr) this).field_h = gf.field_a;
        ((cr) this).field_i = 1;
        ((cr) this).field_a = 1;
    }

    cr(hu param0, int param1, int param2) {
        try {
            ((cr) this).field_h = param0;
            ((cr) this).field_a = param1;
            ((cr) this).field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "cr.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static boolean b() {
        if (null == op.field_y) {
            return false;
        }
        if (!un.field_c.a((byte) -96)) {
            return false;
        }
        return true;
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var7 = 43 / ((59 - param0) / 53);
                if (param3.field_m) {
                  break L2;
                } else {
                  if (!param3.b(45)) {
                    stackOut_5_0 = 2188450;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            var6_int = stackIn_6_0;
            int discarded$1 = ((cr) this).field_h.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_q + "</u>", param4 - -param3.field_t, param3.field_g + param2, param3.field_n, param3.field_i, var6_int, -1, ((cr) this).field_a, ((cr) this).field_i, ((cr) this).field_h.field_p + ((cr) this).field_h.field_G);
            if (param3.b(93)) {
              L3: {
                var8 = ((cr) this).field_h.a(param3.field_q);
                var9 = ((cr) this).field_h.field_p + ((cr) this).field_h.field_G;
                var10 = param4 - -param3.field_t;
                var11 = param2 - -param3.field_g;
                if (((cr) this).field_a == 2) {
                  var10 = var10 + (-var8 + param3.field_n);
                  break L3;
                } else {
                  if (((cr) this).field_a == 1) {
                    var10 = var10 + (-var8 + param3.field_n >> 1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (((cr) this).field_i == 2) {
                  var11 = var11 + (-var9 + param3.field_i);
                  break L4;
                } else {
                  if (((cr) this).field_i == 1) {
                    var11 = var11 + (-var9 + param3.field_i >> 1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              ob.b(2, var8 + 4, 2 + var11, var9, var10 + -2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("cr.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Cancel";
        field_b = new ff(12, 0, 1, 0);
        field_d = new vd();
        field_f = "Concluded";
    }
}
