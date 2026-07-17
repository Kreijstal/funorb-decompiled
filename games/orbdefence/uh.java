/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static int field_a;
    static int field_b;
    static String field_c;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (0 > param1) {
            var2 += 16;
            param1 = param1 >>> 16;
            break L0;
          } else {
            if (65536 > param1) {
              break L0;
            } else {
              L1: {
                var2 += 16;
                param1 = param1 >>> 16;
                if (param1 >= 256) {
                  param1 = param1 >>> 8;
                  var2 += 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 < 16) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >>> 4;
                  break L2;
                }
              }
              L3: {
                if (param1 < 4) {
                  break L3;
                } else {
                  param1 = param1 >>> 2;
                  var2 += 2;
                  break L3;
                }
              }
              L4: {
                if (param1 >= 1) {
                  var2++;
                  param1 = param1 >>> 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (param0 <= -47) {
                return var2 - -param1;
              } else {
                return 110;
              }
            }
          }
        }
        L5: {
          if (param1 >= 256) {
            param1 = param1 >>> 8;
            var2 += 8;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param1 < 16) {
            break L6;
          } else {
            var2 += 4;
            param1 = param1 >>> 4;
            break L6;
          }
        }
        L7: {
          if (param1 < 4) {
            break L7;
          } else {
            param1 = param1 >>> 2;
            var2 += 2;
            break L7;
          }
        }
        L8: {
          if (param1 >= 1) {
            var2++;
            param1 = param1 >>> 1;
            break L8;
          } else {
            break L8;
          }
        }
        if (param0 <= -47) {
          return var2 - -param1;
        } else {
          return 110;
        }
    }

    final static String b(int param0) {
        if (!(mg.field_m != qc.field_g)) {
            return of.field_H;
        }
        if (param0 != 4) {
            return null;
        }
        return wd.field_p;
    }

    private uh() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "IRONO";
    }
}
