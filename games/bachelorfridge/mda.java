/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mda {
    static sna field_b;
    static du field_a;
    static sna field_c;

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (-1 >= (param0 ^ -1)) {
          if ((param0 ^ -1) <= -65537) {
            L0: {
              var2 += 16;
              param0 = param0 >>> 16;
              if (256 > param0) {
                break L0;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L0;
              }
            }
            L1: {
              if (param0 >= param1) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((param0 ^ -1) > -5) {
                break L2;
              } else {
                param0 = param0 >>> 2;
                var2 += 2;
                break L2;
              }
            }
            L3: {
              if (param0 >= 1) {
                param0 = param0 >>> 1;
                var2++;
                break L3;
              } else {
                break L3;
              }
            }
            return var2 + param0;
          } else {
            L4: {
              if (256 > param0) {
                break L4;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L4;
              }
            }
            L5: {
              if (param0 >= param1) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((param0 ^ -1) > -5) {
                break L6;
              } else {
                param0 = param0 >>> 2;
                var2 += 2;
                break L6;
              }
            }
            L7: {
              if (param0 >= 1) {
                param0 = param0 >>> 1;
                var2++;
                break L7;
              } else {
                break L7;
              }
            }
            return var2 + param0;
          }
        } else {
          L8: {
            var2 += 16;
            param0 = param0 >>> 16;
            if (256 > param0) {
              break L8;
            } else {
              param0 = param0 >>> 8;
              var2 += 8;
              break L8;
            }
          }
          L9: {
            if (param0 >= param1) {
              var2 += 4;
              param0 = param0 >>> 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if ((param0 ^ -1) > -5) {
              break L10;
            } else {
              param0 = param0 >>> 2;
              var2 += 2;
              break L10;
            }
          }
          L11: {
            if (param0 >= 1) {
              param0 = param0 >>> 1;
              var2++;
              break L11;
            } else {
              break L11;
            }
          }
          return var2 + param0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 15) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new du(15, 0, 1, 0);
    }
}
