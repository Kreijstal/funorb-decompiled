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
                if (-257 >= (param1 ^ -1)) {
                  param1 = param1 >>> 8;
                  var2 += 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-17 < (param1 ^ -1)) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >>> 4;
                  break L2;
                }
              }
              L3: {
                if (-5 < (param1 ^ -1)) {
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
              if (param0 > -47) {
                return 110;
              } else {
                return var2 - -param1;
              }
            }
          }
        }
        L5: {
          if (-257 >= (param1 ^ -1)) {
            param1 = param1 >>> 8;
            var2 += 8;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (-17 < (param1 ^ -1)) {
            break L6;
          } else {
            var2 += 4;
            param1 = param1 >>> 4;
            break L6;
          }
        }
        L7: {
          if (-5 < (param1 ^ -1)) {
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
        if (param0 > -47) {
          return 110;
        } else {
          return var2 - -param1;
        }
    }

    final static String b(int param0) {
        if (!(mg.field_m != qc.field_g)) {
            return of.field_H;
        }
        if (param0 != 4) {
            return (String) null;
        }
        return wd.field_p;
    }

    private uh() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        if (param0 != -5) {
            field_b = -19;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_c = "IRONO";
    }
}
