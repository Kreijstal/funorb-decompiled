/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static int field_c;
    static long field_d;
    static ic field_a;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param0 >= 84) {
          if (param1 != 0) {
            if (param1 <= 0) {
              L0: {
                var2 = 2;
                if (param1 >= -65536) {
                  break L0;
                } else {
                  param1 = param1 >> 16;
                  var2 += 16;
                  break L0;
                }
              }
              L1: {
                if (param1 >= -256) {
                  break L1;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L1;
                }
              }
              L2: {
                if (param1 >= -16) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L2;
                }
              }
              L3: {
                if (param1 < -4) {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param1 < -2) {
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
                if (param1 <= 255) {
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
          if (param1 != 0) {
            if (param1 <= 0) {
              L10: {
                var2 = 2;
                if (param1 >= -65536) {
                  break L10;
                } else {
                  param1 = param1 >> 16;
                  var2 += 16;
                  break L10;
                }
              }
              L11: {
                if (param1 >= -256) {
                  break L11;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L11;
                }
              }
              L12: {
                if (param1 >= -16) {
                  break L12;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L12;
                }
              }
              L13: {
                if (param1 < -4) {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (param1 < -2) {
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
                if (param1 <= 255) {
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
            field_b = null;
        }
    }

    final static r a(int param0, int param1, int param2, md param3, byte param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        r var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        r stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        r stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var8 = pd.a(0, 0, param3, param0, param2, param1);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new r();
                var7.field_c = var8;
                java.awt.Component discarded$9 = var7.field_c.add((java.awt.Component) (Object) var7);
                if (param4 == -73) {
                  break L1;
                } else {
                  field_c = 104;
                  break L1;
                }
              }
              var7.setBounds(0, 0, param0, param1);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_5_0 = (r) var7;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (r) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6_ref;
            stackOut_7_1 = new StringBuilder().append("qg.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param4 + 44 + 0 + 41);
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "OFF";
    }
}
