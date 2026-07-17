/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class moa {
    static int field_b;
    static int field_a;

    final static String a(gqa param0, int param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = null;
            if (param0.field_g != null) {
              L1: {
                var5 = param0.field_g;
                var2 = (Object) (Object) var5;
                var2 = (Object) (Object) var5;
                if (param0.field_n == 1) {
                  var2 = (Object) (Object) ("<img=0>" + var5);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param0.field_n != 2) {
                break L0;
              } else {
                var2 = (Object) (Object) ("<img=1>" + var2);
                break L0;
              }
            } else {
              break L0;
            }
          }
          L2: {
            var3 = "";
            if (param0.field_d == 2) {
              if (!param0.field_m) {
                L3: {
                  if (param0.field_c != 0) {
                    break L3;
                  } else {
                    if (param0.field_o == 0) {
                      var3 = gl.a((byte) 114, wha.field_G, new String[1]);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var3 = gl.a((byte) 112, li.field_a, new String[1]);
                break L2;
              } else {
                break L2;
              }
            } else {
              L4: {
                if (param0.field_d != 0) {
                  break L4;
                } else {
                  if (kq.field_c) {
                    var3 = "[" + cla.field_o + "] ";
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (param0.field_d != 1) {
                  break L5;
                } else {
                  var3 = "[" + gl.a((byte) 96, jea.field_nb, new String[1]) + "] ";
                  break L5;
                }
              }
              L6: {
                if (4 != param0.field_d) {
                  break L6;
                } else {
                  if (null == tla.field_f) {
                    break L6;
                  } else {
                    var3 = "[" + tla.field_f + "] ";
                    break L6;
                  }
                }
              }
              L7: {
                if (param0.field_d == 3) {
                  var3 = "[#" + param0.field_b + "] ";
                  break L7;
                } else {
                  break L7;
                }
              }
              if (!param0.field_m) {
                var3 = var3 + var2 + ": ";
                break L2;
              } else {
                break L2;
              }
            }
          }
          return var3;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_33_0 = var2;
            stackOut_33_1 = new StringBuilder().append("moa.A(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + 94 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = -1;
    }
}
