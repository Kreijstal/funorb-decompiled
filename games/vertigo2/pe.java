/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends li {
    static boolean field_r;
    int field_x;
    int field_n;
    int field_G;
    int field_C;
    int field_H;
    int field_y;
    int field_F;
    static String field_t;
    al field_K;
    static String field_u;
    gl field_p;
    int field_q;
    int field_A;
    int field_o;
    int field_s;
    int field_B;
    static String field_L;
    ae field_z;
    int field_I;
    ra field_J;
    int field_E;
    int field_w;
    int field_D;
    int field_v;

    final static wp a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wp stackIn_3_0 = null;
        wp stackIn_6_0 = null;
        wp stackIn_16_0 = null;
        wp stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_15_0 = null;
        wp stackOut_18_0 = null;
        wp stackOut_5_0 = null;
        wp stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (var2_int <= 63) {
              var3 = 0;
              L0: while (true) {
                if (var3 < var2_int) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 == 45) {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (-1 + var2_int == var3) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_15_0 = bp.field_A;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (ke.field_d.indexOf(var4) != -1) {
                        break L1;
                      } else {
                        stackOut_18_0 = bp.field_A;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_5_0 = cg.field_a;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } else {
            stackOut_2_0 = ab.field_a;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("pe.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 1 + 41);
        }
    }

    final void a(int param0) {
        ((pe) this).field_p = null;
        ((pe) this).field_z = null;
        ((pe) this).field_J = null;
        if (param0 > -93) {
            ((pe) this).field_q = -49;
        }
        ((pe) this).field_K = null;
    }

    final static void a(ud param0, int param1) {
        param0.field_z = new int[]{-1};
        if (param1 <= 82) {
            return;
        }
        try {
            param0.field_u = new char[]{'?'};
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "pe.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(boolean param0) {
        field_u = null;
        field_L = null;
        field_t = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param4 > 10) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param3 < param5) {
              break L2;
            } else {
              if (param3 >= param6 + param5) {
                break L2;
              } else {
                if (param2 < param1) {
                  break L2;
                } else {
                  if (param2 >= param0 + param1) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    pe() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "red died";
        field_L = "You won! <br><%0>% of the level was <%1>";
        field_u = "Status";
        field_r = true;
    }
}
