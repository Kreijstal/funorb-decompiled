/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static int[] field_d;
    static boolean field_b;
    static int field_e;
    static boolean field_c;
    static String field_a;

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 == 68) {
          if (null == aa.field_j) {
            if (null == aa.field_j) {
              if (!pj.field_c.a(param0, param1, (byte) -120)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (!aa.field_j.a(param0, param1, (byte) -66)) {
              if (null == aa.field_j) {
                if (!pj.field_c.a(param0, param1, (byte) -120)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          boolean discarded$7 = d.a(9, -76, (byte) 7);
          if (null != aa.field_j) {
            if (!aa.field_j.a(param0, param1, (byte) -66)) {
              if (null == aa.field_j) {
                if (!pj.field_c.a(param0, param1, (byte) -120)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (null == aa.field_j) {
              if (!pj.field_c.a(param0, param1, (byte) -120)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (0 <= param0) {
          if (param0 < 65536) {
            L0: {
              if (256 <= param0) {
                param0 = param0 >>> 8;
                var2 += 8;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param0 < 16) {
                break L1;
              } else {
                param0 = param0 >>> 4;
                var2 += 4;
                break L1;
              }
            }
            L2: {
              if (param0 >= 4) {
                param0 = param0 >>> 2;
                var2 += 2;
                break L2;
              } else {
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
            return var2 - -param0;
          } else {
            L4: {
              var2 += 16;
              param0 = param0 >>> 16;
              if (256 <= param0) {
                param0 = param0 >>> 8;
                var2 += 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 < 16) {
                break L5;
              } else {
                param0 = param0 >>> 4;
                var2 += 4;
                break L5;
              }
            }
            L6: {
              if (param0 >= 4) {
                param0 = param0 >>> 2;
                var2 += 2;
                break L6;
              } else {
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
            return var2 - -param0;
          }
        } else {
          L8: {
            var2 += 16;
            param0 = param0 >>> 16;
            if (256 <= param0) {
              param0 = param0 >>> 8;
              var2 += 8;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (param0 < 16) {
              break L9;
            } else {
              param0 = param0 >>> 4;
              var2 += 4;
              break L9;
            }
          }
          L10: {
            if (param0 >= 4) {
              param0 = param0 >>> 2;
              var2 += 2;
              break L10;
            } else {
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
          return var2 - -param0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_c = false;
        field_e = 32;
        field_a = "Unfortunately we are unable to create an account for you at this time.";
    }
}
