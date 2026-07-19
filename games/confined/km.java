/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static String field_a;
    static String field_b;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if ((param1 ^ -1) <= -1) {
          if (65536 <= param1) {
            L0: {
              var2 += 16;
              param1 = param1 >>> 16;
              if (-257 < (param1 ^ -1)) {
                break L0;
              } else {
                param1 = param1 >>> 8;
                var2 += 8;
                break L0;
              }
            }
            L1: {
              if (param1 >= 16) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 <= param1) {
                param1 = param1 >>> 2;
                var2 += 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-2 < (param1 ^ -1)) {
                break L3;
              } else {
                param1 = param1 >>> 1;
                var2++;
                break L3;
              }
            }
            return param1 + var2;
          } else {
            L4: {
              if (-257 < (param1 ^ -1)) {
                break L4;
              } else {
                param1 = param1 >>> 8;
                var2 += 8;
                break L4;
              }
            }
            L5: {
              if (param1 >= 16) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 <= param1) {
                param1 = param1 >>> 2;
                var2 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-2 < (param1 ^ -1)) {
                break L7;
              } else {
                param1 = param1 >>> 1;
                var2++;
                break L7;
              }
            }
            return param1 + var2;
          }
        } else {
          L8: {
            var2 += 16;
            param1 = param1 >>> 16;
            if (-257 < (param1 ^ -1)) {
              break L8;
            } else {
              param1 = param1 >>> 8;
              var2 += 8;
              break L8;
            }
          }
          L9: {
            if (param1 >= 16) {
              param1 = param1 >>> 4;
              var2 += 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param0 <= param1) {
              param1 = param1 >>> 2;
              var2 += 2;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (-2 < (param1 ^ -1)) {
              break L11;
            } else {
              param1 = param1 >>> 1;
              var2++;
              break L11;
            }
          }
          return param1 + var2;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 11645) {
            km.a(66);
        }
    }

    static {
        field_b = "No highscores";
        field_a = "Invincibility";
    }
}
