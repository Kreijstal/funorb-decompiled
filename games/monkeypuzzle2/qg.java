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
          if (-1 != param1) {
            if (param1 < -1) {
              L0: {
                var2 = 1;
                if (param1 <= 65535) {
                  break L0;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L0;
                }
              }
              L1: {
                if ((param1 ^ -1) >= -256) {
                  break L1;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L1;
                }
              }
              L2: {
                if (param1 > 15) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1 <= 3) {
                  break L3;
                } else {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L3;
                }
              }
              L4: {
                if (param1 > 1) {
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
                var2 = 2;
                if (65535 <= param1) {
                  break L5;
                } else {
                  param1 = param1 >> 16;
                  var2 += 16;
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
                if (15 <= param1) {
                  break L7;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L7;
                }
              }
              L8: {
                if ((param1 ^ -1) > 3) {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if ((param1 ^ -1) > 1) {
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
            if (param1 < -1) {
              L10: {
                var2 = 1;
                if (param1 <= 65535) {
                  break L10;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L10;
                }
              }
              L11: {
                if ((param1 ^ -1) >= -256) {
                  break L11;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L11;
                }
              }
              L12: {
                if (param1 > 15) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (param1 <= 3) {
                  break L13;
                } else {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L13;
                }
              }
              L14: {
                if (param1 > 1) {
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
                var2 = 2;
                if (65535 <= param1) {
                  break L15;
                } else {
                  param1 = param1 >> 16;
                  var2 += 16;
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
                if (15 <= param1) {
                  break L17;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L17;
                }
              }
              L18: {
                if ((param1 ^ -1) > 3) {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L18;
                } else {
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
        r var7 = null;
        java.awt.Frame var8 = null;
        var8 = pd.a(0, param5, param3, param0, param2, param1);
        var6 = var8;
        if (var8 != null) {
          var7 = new r();
          var7.field_c = var8;
          java.awt.Component discarded$8 = var7.field_c.add((java.awt.Component) (Object) var7);
          if (param4 != -73) {
            field_c = 104;
            var7.setBounds(0, 0, param0, param1);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          } else {
            var7.setBounds(0, 0, param0, param1);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "OFF";
    }
}
