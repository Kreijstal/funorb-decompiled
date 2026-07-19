/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static String field_c;
    static hb field_h;
    static int field_e;
    static String[] field_b;
    static int field_d;
    static int field_g;
    static String field_f;
    static mi field_a;

    final static boolean a(byte param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var1 = ik.a(4);
        var3 = -wg.field_i + var1;
        if (var3 <= 30000L) {
          var5 = 3000;
          if (af.field_d < 7) {
            if (af.field_d < 5) {
              L0: {
                if (af.field_d < 3) {
                  break L0;
                } else {
                  var5 = 6000;
                  break L0;
                }
              }
              if ((long)var5 < var3) {
                wg.field_i = var1;
                af.field_d = af.field_d + 1;
                return true;
              } else {
                return false;
              }
            } else {
              var5 = 9000;
              if ((long)var5 < var3) {
                wg.field_i = var1;
                af.field_d = af.field_d + 1;
                return true;
              } else {
                return false;
              }
            }
          } else {
            var5 = 12000;
            if ((long)var5 < var3) {
              wg.field_i = var1;
              af.field_d = af.field_d + 1;
              return true;
            } else {
              return false;
            }
          }
        } else {
          af.field_d = 0;
          wg.field_i = var1;
          return true;
        }
    }

    final static a a(int param0) {
        if (!(null != sm.field_c)) {
            sm.field_c = new a(bj.field_f, 20, 0, 0, 0, 11579568, -1, 0, 0, bj.field_f.field_R, -1, 2147483647, true);
        }
        return sm.field_c;
    }

    public static void a(boolean param0) {
        field_h = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int discarded$2 = 0;
        if (~hk.field_j <= ~(param2 + param3)) {
          return param3;
        } else {
          if (-param2 + param3 + param0 >= 0) {
            return param0 + param3 + -param2;
          } else {
            if (param1 != -18265) {
              discarded$2 = vh.a(-78, -105, 117, -8);
              return hk.field_j - param2;
            } else {
              return hk.field_j - param2;
            }
          }
        }
    }

    static {
        field_c = "Asking for or providing contact information";
        field_e = 15;
        field_g = 0;
        field_b = new String[]{"By rating", "By win percentage"};
    }
}
