/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll implements uk {
    private int field_f;
    private int field_e;
    private bd field_a;
    static int field_b;
    static hl field_c;
    static int field_d;

    final static void c(int param0) {
        Object var2 = null;
        mj.a((String) null, "", 99);
        if (param0 != 32270) {
            field_b = 127;
        }
    }

    public ll() {
        ((ll) this).field_f = 1;
        ((ll) this).field_a = si.field_V;
        ((ll) this).field_e = 1;
    }

    public static void b(int param0) {
        field_c = null;
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = stellarshard.field_B;
        try {
          L0: {
            if (param4 == 4549) {
              L1: {
                L2: {
                  if (param3.field_q) {
                    break L2;
                  } else {
                    if (!param3.e(0)) {
                      stackOut_7_0 = 2188450;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 3249872;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
              var6_int = stackIn_8_0;
              int discarded$1 = ((ll) this).field_a.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_m + "</u>", param3.field_w + param1, param3.field_k + param2, param3.field_p, param3.field_t, var6_int, -1, ((ll) this).field_e, ((ll) this).field_f, ((ll) this).field_a.field_N + ((ll) this).field_a.field_r);
              if (param3.e(0)) {
                L3: {
                  var7 = ((ll) this).field_a.b(param3.field_m);
                  var8 = ((ll) this).field_a.field_N + ((ll) this).field_a.field_r;
                  var9 = param3.field_w + param1;
                  var10 = param3.field_k + param2;
                  if (((ll) this).field_e == 2) {
                    var9 = var9 + (-var7 + param3.field_p);
                    break L3;
                  } else {
                    if (1 != ((ll) this).field_e) {
                      break L3;
                    } else {
                      var9 = var9 + (param3.field_p + -var7 >> 1);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (((ll) this).field_f != 2) {
                    if (((ll) this).field_f == 1) {
                      var10 = var10 + (-var8 + param3.field_t >> 1);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    var10 = var10 + (-var8 + param3.field_t);
                    break L4;
                  }
                }
                og.a(var9 - 2, (byte) 105, 4 + var7, var8, var10 - -2);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("ll.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param4 + 41);
        }
    }

    ll(bd param0, int param1, int param2) {
        try {
            ((ll) this).field_f = param2;
            ((ll) this).field_a = param0;
            ((ll) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ll.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0) {
        jg.field_pb = 512;
        wh.field_c = 0;
    }

    static {
    }
}
