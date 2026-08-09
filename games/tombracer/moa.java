/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class moa {
    static int field_b;
    static int field_a;

    final static String a(gqa param0, int param1) {
        String stackIn_33_0 = null;
        String stackIn_35_0 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        Object stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param0.field_g != null) {
                L2: {
                  var5 = param0.field_g;
                  var2 = var5;
                  var2 = var5;
                  var2 = var5;
                  if ((param0.field_n ^ -1) == -2) {
                    var2 = "<img=0>" + var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if ((param0.field_n ^ -1) != -3) {
                  break L1;
                } else {
                  var2 = "<img=1>" + (String) (var2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              var3 = "";
              if (-3 == (param0.field_d ^ -1)) {
                if (!param0.field_m) {
                  L4: {
                    if (param0.field_c != 0) {
                      break L4;
                    } else {
                      if (param0.field_o == 0) {
                        var3 = gl.a((byte) 114, wha.field_G, new String[]{(String) (var2)});
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 = gl.a((byte) 112, li.field_a, new String[]{(String) (var2)});
                  break L3;
                } else {
                  break L3;
                }
              } else {
                L5: {
                  if (param0.field_d != 0) {
                    break L5;
                  } else {
                    if (kq.field_c) {
                      var3 = "[" + cla.field_o + "] ";
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (-2 != (param0.field_d ^ -1)) {
                    break L6;
                  } else {
                    var3 = "[" + gl.a((byte) 96, jea.field_nb, new String[]{param0.field_b}) + "] ";
                    break L6;
                  }
                }
                L7: {
                  if (4 != param0.field_d) {
                    break L7;
                  } else {
                    if (null == tla.field_f) {
                      break L7;
                    } else {
                      var3 = "[" + tla.field_f + "] ";
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param0.field_d == 3) {
                    var3 = "[#" + param0.field_b + "] ";
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (!param0.field_m) {
                  var3 = var3 + (String) (var2) + ": ";
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (param1 >= 78) {
              stackIn_35_0 = (String) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_33_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = var2;

            stackIn_38_1 = new StringBuilder().append("moa.A(");

            if (param0 == null) {
              stackIn_39_0 = stackIn_38_0;
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L9;
            } else {
              stackIn_39_0 = stackIn_38_0;
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_33_0;
        } else {
          return stackIn_35_0;
        }
    }

    static {
        field_a = 0;
        field_b = -1;
    }
}
