/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static int field_c;
    static long field_d;
    static ic field_a;

    final static int a(byte param0, int param1) {
        int var2;
        if (param0 >= 84) {
          if (-1 != (param1 ^ -1)) {
            if ((param1 ^ -1) >= -1) {
              L0: {
                var2 = 2;
                if (65535 >= (param1 ^ -1)) {
                  break L0;
                } else {
                  param1 = param1 >> 16;
                  var2 += 16;
                  break L0;
                }
              }
              L1: {
                if ((param1 ^ -1) <= 255) {
                  break L1;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L1;
                }
              }
              L2: {
                if (15 >= (param1 ^ -1)) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L2;
                }
              }
              L3: {
                if ((param1 ^ -1) > 3) {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if ((param1 ^ -1) > 1) {
                  var2++;
                  param1 = param1 >> 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              return var2;
            } else {
              L5: {
                var2 = 1;
                if (param1 <= 65535) {
                  break L5;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L5;
                }
              }
              L6: {
                if ((param1 ^ -1) >= -256) {
                  break L6;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L6;
                }
              }
              L7: {
                if (param1 > 15) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param1 <= 3) {
                  break L8;
                } else {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L8;
                }
              }
              L9: {
                if (param1 > 1) {
                  var2++;
                  param1 = param1 >> 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            }
          } else {
            return 0;
          }
        } else {
          qg.a(-76);
          if (-1 != (param1 ^ -1)) {
            if ((param1 ^ -1) >= -1) {
              L10: {
                var2 = 2;
                if (65535 >= (param1 ^ -1)) {
                  break L10;
                } else {
                  param1 = param1 >> 16;
                  var2 += 16;
                  break L10;
                }
              }
              L11: {
                if ((param1 ^ -1) <= 255) {
                  break L11;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L11;
                }
              }
              L12: {
                if (15 >= (param1 ^ -1)) {
                  break L12;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L12;
                }
              }
              L13: {
                if ((param1 ^ -1) > 3) {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if ((param1 ^ -1) > 1) {
                  var2++;
                  param1 = param1 >> 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              return var2;
            } else {
              L15: {
                var2 = 1;
                if (param1 <= 65535) {
                  break L15;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L15;
                }
              }
              L16: {
                if ((param1 ^ -1) >= -256) {
                  break L16;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L16;
                }
              }
              L17: {
                if (param1 > 15) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (param1 <= 3) {
                  break L18;
                } else {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L18;
                }
              }
              L19: {
                if (param1 > 1) {
                  var2++;
                  param1 = param1 >> 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              return var2;
            }
          } else {
            return 0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1) {
            field_b = (String) null;
        }
    }

    final static r a(int param0, int param1, int param2, md param3, byte param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        r var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        r stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = pd.a(0, param5, param3, param0, param2, param1);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new r();
                var7.field_c = var8;
                var7.field_c.add((java.awt.Component) ((Object) var7));
                if (param4 == -73) {
                  break L1;
                } else {
                  field_c = 104;
                  break L1;
                }
              }
              var7.setBounds(0, 0, param0, param1);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackIn_6_0 = (r) (var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("qg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (r) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_c = 0;
        field_b = "OFF";
    }
}
