/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static kc[] field_c;
    static int field_a;
    static String field_b;
    static int[] field_f;
    static String[] field_d;
    static int field_e;

    final static boolean a() {
        if (s.field_d == null) {
            return false;
        }
        if (null == s.field_d.d((byte) 94)) {
            return false;
        }
        return true;
    }

    final static int b() {
        return 1;
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (param0 >= 0) {
          if (param0 < 65536) {
            L0: {
              if (param0 < 256) {
                break L0;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L0;
              }
            }
            L1: {
              if (param0 >= 16) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 < 4) {
                break L2;
              } else {
                var2 += 2;
                param0 = param0 >>> 2;
                break L2;
              }
            }
            L3: {
              if (1 <= param0) {
                param0 = param0 >>> 1;
                var2++;
                break L3;
              } else {
                break L3;
              }
            }
            return var2 - -param0;
          } else {
            L4: {
              param0 = param0 >>> 16;
              var2 += 16;
              if (param0 < 256) {
                break L4;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L4;
              }
            }
            L5: {
              if (param0 >= 16) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 < 4) {
                break L6;
              } else {
                var2 += 2;
                param0 = param0 >>> 2;
                break L6;
              }
            }
            L7: {
              if (1 <= param0) {
                param0 = param0 >>> 1;
                var2++;
                break L7;
              } else {
                break L7;
              }
            }
            return var2 - -param0;
          }
        } else {
          L8: {
            param0 = param0 >>> 16;
            var2 += 16;
            if (param0 < 256) {
              break L8;
            } else {
              param0 = param0 >>> 8;
              var2 += 8;
              break L8;
            }
          }
          L9: {
            if (param0 >= 16) {
              var2 += 4;
              param0 = param0 >>> 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param0 < 4) {
              break L10;
            } else {
              var2 += 2;
              param0 = param0 >>> 2;
              break L10;
            }
          }
          L11: {
            if (1 <= param0) {
              param0 = param0 >>> 1;
              var2++;
              break L11;
            } else {
              break L11;
            }
          }
          return var2 - -param0;
        }
    }

    static {
    }
}
