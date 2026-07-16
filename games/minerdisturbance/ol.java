/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static ea field_a;
    static String[][] field_b;
    static ea field_c;
    static String field_d;

    final static void a(byte param0) {
        int var1 = 0;
        if (param0 != -94) {
          L0: {
            field_d = null;
            if (ee.field_J < 224) {
              var1 = ee.field_J % 32;
              fc.a(-var1 + (ee.field_J - -32), (byte) 52);
              break L0;
            } else {
              fc.a(256, (byte) 72);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (ee.field_J < 224) {
              var1 = ee.field_J % 32;
              fc.a(-var1 + (ee.field_J - -32), (byte) 52);
              break L1;
            } else {
              fc.a(256, (byte) 72);
              break L1;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
          field_b = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        if (param2 >= 31) {
          var3 = 1;
          L0: while (true) {
            if ((param1 ^ -1) >= -2) {
              if (param1 == 1) {
                return var3 * param0;
              } else {
                return var3;
              }
            } else {
              L1: {
                if (0 != (param1 & 1)) {
                  var3 = var3 * param0;
                  break L1;
                } else {
                  break L1;
                }
              }
              param0 = param0 * param0;
              param1 = param1 >> 1;
              continue L0;
            }
          }
        } else {
          field_b = null;
          var3 = 1;
          L2: while (true) {
            if ((param1 ^ -1) >= -2) {
              if (param1 == 1) {
                return var3 * param0;
              } else {
                return var3;
              }
            } else {
              L3: {
                if (0 != (param1 & 1)) {
                  var3 = var3 * param0;
                  break L3;
                } else {
                  break L3;
                }
              }
              param0 = param0 * param0;
              param1 = param1 >> 1;
              continue L2;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 != param0) {
          if (0 >= param0) {
            L0: {
              var2 = 2;
              if (65535 < (param0 ^ -1)) {
                param0 = param0 >> 16;
                var2 += 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param0 >= -256) {
                break L1;
              } else {
                var2 += 8;
                param0 = param0 >> 8;
                break L1;
              }
            }
            L2: {
              if (-16 <= param0) {
                break L2;
              } else {
                param0 = param0 >> 4;
                var2 += 4;
                break L2;
              }
            }
            L3: {
              if (3 >= (param0 ^ -1)) {
                break L3;
              } else {
                param0 = param0 >> 2;
                var2 += 2;
                break L3;
              }
            }
            if (param1 == 8) {
              L4: {
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              return var2;
            } else {
              L5: {
                field_c = null;
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              return var2;
            }
          } else {
            L6: {
              var2 = 1;
              if (param0 <= 65535) {
                break L6;
              } else {
                var2 += 16;
                param0 = param0 >> 16;
                break L6;
              }
            }
            L7: {
              if (-256 <= (param0 ^ -1)) {
                break L7;
              } else {
                var2 += 8;
                param0 = param0 >> 8;
                break L7;
              }
            }
            L8: {
              if (-16 > (param0 ^ -1)) {
                var2 += 4;
                param0 = param0 >> 4;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((param0 ^ -1) < -4) {
                var2 += 2;
                param0 = param0 >> 2;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if ((param0 ^ -1) < -2) {
                var2++;
                param0 = param0 >> 1;
                break L10;
              } else {
                break L10;
              }
            }
            return var2;
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Grandma's Finest Dwarven Woolly Jumper. You'll make her very proud wearing this; what's more, it will keep you safe from the cold.";
        field_b = new String[][]{new String[5], new String[4], new String[7], new String[1], new String[3], new String[5], new String[1]};
    }
}
