/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb implements ub {
    private int field_d;
    private dh field_b;
    private int field_f;
    static int field_e;
    static me field_c;
    static String field_a;

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3.field_q) {
                  break L2;
                } else {
                  if (param3.f(-67)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_5_0;
              int discarded$1 = ((bb) this).field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_A + "</u>", param3.field_o + param2, param3.field_w + param4, param3.field_t, param3.field_s, var6_int, -1, ((bb) this).field_d, ((bb) this).field_f, ((bb) this).field_b.field_P + ((bb) this).field_b.field_F);
              if (param1 == -20618) {
                break L3;
              } else {
                field_a = null;
                break L3;
              }
            }
            if (param3.f(-54)) {
              L4: {
                var7 = ((bb) this).field_b.c(param3.field_A);
                var8 = ((bb) this).field_b.field_P + ((bb) this).field_b.field_F;
                var9 = param3.field_o + param2;
                if (((bb) this).field_d == 2) {
                  var9 = var9 + (-var7 + param3.field_t);
                  break L4;
                } else {
                  if (((bb) this).field_d == 1) {
                    var9 = var9 + (-var7 + param3.field_t >> 1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var10 = param3.field_w + param4;
                if (((bb) this).field_f == 2) {
                  var10 = var10 + (-var8 + param3.field_s);
                  break L5;
                } else {
                  if (1 != ((bb) this).field_f) {
                    break L5;
                  } else {
                    var10 = var10 + (-var8 + param3.field_s >> 1);
                    break L5;
                  }
                }
              }
              hj.a(var10 + 2, var9 - 2, param1 ^ -20727, var8, var7 + 4);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("bb.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 41);
        }
    }

    public bb() {
        ((bb) this).field_d = 1;
        ((bb) this).field_b = a.field_u;
        ((bb) this).field_f = 1;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
    }

    bb(dh param0, int param1, int param2) {
        try {
            ((bb) this).field_d = param1;
            ((bb) this).field_b = param0;
            ((bb) this).field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "bb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new me("");
        field_a = "Loading instruments";
    }
}
