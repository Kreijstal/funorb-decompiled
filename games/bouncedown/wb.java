/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static boolean field_b;
    static tg[] field_e;
    static int[] field_c;
    static String field_d;
    static int field_a;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (param1 < 0) {
            var2 += 16;
            param1 = param1 >>> 16;
            break L0;
          } else {
            if ((param1 ^ -1) > -65537) {
              break L0;
            } else {
              L1: {
                var2 += 16;
                param1 = param1 >>> 16;
                if (param1 < 256) {
                  break L1;
                } else {
                  var2 += 8;
                  param1 = param1 >>> 8;
                  break L1;
                }
              }
              L2: {
                if ((param1 ^ -1) > -17) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >>> 4;
                  break L2;
                }
              }
              if (param0 == 100) {
                L3: {
                  if (-5 >= (param1 ^ -1)) {
                    var2 += 2;
                    param1 = param1 >>> 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 < 1) {
                    break L4;
                  } else {
                    var2++;
                    param1 = param1 >>> 1;
                    break L4;
                  }
                }
                return var2 - -param1;
              } else {
                return -116;
              }
            }
          }
        }
        L5: {
          if (param1 < 256) {
            break L5;
          } else {
            var2 += 8;
            param1 = param1 >>> 8;
            break L5;
          }
        }
        L6: {
          if ((param1 ^ -1) > -17) {
            break L6;
          } else {
            var2 += 4;
            param1 = param1 >>> 4;
            break L6;
          }
        }
        if (param0 == 100) {
          L7: {
            if (-5 >= (param1 ^ -1)) {
              var2 += 2;
              param1 = param1 >>> 2;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (param1 < 1) {
              break L8;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L8;
            }
          }
          return var2 - -param1;
        } else {
          return -116;
        }
    }

    final static rg a(int param0, int param1, String param2) {
        rg var3 = null;
        if (param1 != 1) {
          return null;
        } else {
          var3 = new rg(false);
          var3.field_c = param2;
          var3.field_g = param0;
          return var3;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        int var1 = -38 % ((-58 - param0) / 38);
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new int[8192];
    }
}
