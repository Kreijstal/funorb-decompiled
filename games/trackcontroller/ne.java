/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne implements t {
    static ja field_b;
    private oh field_e;
    private int field_c;
    static bk field_d;
    private int field_f;
    static la field_a;

    public static void a() {
        field_a = null;
        field_b = null;
        field_d = null;
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == -24969) {
              L1: {
                L2: {
                  if (param1.field_q) {
                    break L2;
                  } else {
                    if (param1.h(-84)) {
                      break L2;
                    } else {
                      stackOut_5_0 = 2188450;
                      stackIn_7_0 = stackOut_5_0;
                      break L1;
                    }
                  }
                }
                stackOut_6_0 = 3249872;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              }
              L3: {
                var6_int = stackIn_7_0;
                int discarded$1 = ((ne) this).field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_s + "</u>", param4 - -param1.field_p, param1.field_m + param2, param1.field_x, param1.field_u, var6_int, -1, ((ne) this).field_c, ((ne) this).field_f, ((ne) this).field_e.field_u + ((ne) this).field_e.field_G);
                if (!param1.h(-95)) {
                  break L3;
                } else {
                  L4: {
                    var7 = ((ne) this).field_e.a(param1.field_s);
                    var8 = ((ne) this).field_e.field_u + ((ne) this).field_e.field_G;
                    var9 = param4 - -param1.field_p;
                    var10 = param2 + param1.field_m;
                    if (((ne) this).field_c == 2) {
                      var9 = var9 + (-var7 + param1.field_x);
                      break L4;
                    } else {
                      if (((ne) this).field_c != 1) {
                        break L4;
                      } else {
                        var9 = var9 + (-var7 + param1.field_x >> 1);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (((ne) this).field_f != 2) {
                      if (((ne) this).field_f == 1) {
                        var10 = var10 + (param1.field_u - var8 >> 1);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      var10 = var10 + (param1.field_u - var8);
                      break L5;
                    }
                  }
                  bc.a(var8, -28846, 4 + var7, 2 + var10, var9 - 2);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("ne.L(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public ne() {
        ((ne) this).field_e = gk.field_c;
        ((ne) this).field_c = 1;
        ((ne) this).field_f = 1;
    }

    ne(oh param0, int param1, int param2) {
        try {
            ((ne) this).field_c = param1;
            ((ne) this).field_e = param0;
            ((ne) this).field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ne.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ja();
    }
}
