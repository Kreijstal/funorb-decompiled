/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static int[] field_f;
    static int field_g;
    static int field_d;
    static kc field_b;
    static String field_e;
    static int field_j;
    static volatile int field_i;
    static String field_a;
    static dn field_h;
    static hb field_c;

    final static boolean a(int param0, String param1, String param2) {
        if (!ko.a(63, param1)) {
          if (!e.b(-12055, param1)) {
            if (bd.a((byte) -117, param1)) {
              return false;
            } else {
              if (param2.length() == 0) {
                return true;
              } else {
                if (hm.a(param1, param2, param0 + -100)) {
                  return false;
                } else {
                  if (param0 == 99) {
                    if (!sm.a(22230, param1, param2)) {
                      if (!w.a(param2, param1, 0)) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_f = null;
        if (param0 != -5451) {
          dd.a(-95);
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1, qb[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        if (param2 != null) {
          if (param3 <= 0) {
            return;
          } else {
            var5 = param2[0].field_n;
            var6 = param2[param0].field_n;
            var7 = param2[1].field_n;
            param2[0].c(param4, param1);
            param2[2].c(param3 + (param4 - var6), param1);
            de.a(sl.field_H);
            de.a(param4 - -var5, param1, -var6 + (param4 - -param3), param2[1].field_w + param1);
            var8 = param4 + var5;
            var9 = -var6 + param3 + param4;
            param4 = var8;
            L0: while (true) {
              if (var9 <= param4) {
                de.b(sl.field_H);
                return;
              } else {
                param2[1].c(param4, param1);
                param4 = param4 + var7;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        sf.a(param0, param1, var3, 0, var2);
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{72, 132, 73, 133, 74, 134, 75, 135, 77, 137, 76, 136, 0, 7, 1, 8, 2, 9, 3, 10, 4, 11, 5, 6, 36, 43, 37, 44, 38, 45, 39, 46, 40, 47, 41, 42, 24, 31, 25, 32, 26, 33, 27, 34, 28, 35, 29, 30, 12, 19, 13, 20, 14, 21, 15, 22, 16, 23, 17, 18, 48, 55, 49, 56, 50, 57, 51, 58, 52, 59, 53, 54, 71, 67, 61, 68, 62, 69, 63, 70, 64, 60, 65, 66, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 138, 139, 140, 141, 142, 143, 78, 79, 12, 89, 81, 82, 24, 92, 93, 94, 83, 49, 74, 25, 33, 71, 55, 80, 88, 90, 138, 139, 140, 141, 142, 143, 130, 131, 128, 129, 84, 85, 127, 126, 130, 131};
        field_d = 20;
        field_e = "Close";
        field_a = "Unable to connect to the data server. Please check any firewall you are using.";
        field_i = -1;
    }
}
