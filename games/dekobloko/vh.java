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
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = client.field_A ? 1 : 0;
        if (param0 <= 50) {
          return false;
        }
        var1 = ik.a(4);
        var3 = -wg.field_i + var1;
        if (var3 > 30000L) {
          af.field_d = 0;
          wg.field_i = var1;
          return true;
        }
        var5 = 3000;
        if (af.field_d >= 7) {
          var5 = 12000;
        } else {
          if (af.field_d >= 5) {
            var5 = 9000;
          } else {
            if (af.field_d >= 3) {
              var5 = 6000;
            }
          }
        }
        if ((long)var5 >= var3) {
          return false;
        }
        wg.field_i = var1;
        af.field_d = af.field_d + 1;
        return true;
    }

    final static a a(int param0) {
        if (param0 == 1424) {
          if (null == sm.field_c) {
            sm.field_c = new a(bj.field_f, 20, 0, 0, 0, 11579568, -1, 0, 0, bj.field_f.field_R, -1, 2147483647, true);
          }
          return sm.field_c;
        }
        return (a) null;
    }

    public static void a(boolean param0) {
        field_h = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_c = null;
        if (!param0) {
          field_a = (mi) null;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (!(hk.field_j < param2 + param3)) {
          return param3;
        }
        if (-param2 + param3 + param0 >= 0) {
          return param0 + param3 - param2;
        }
        if (param1 == -18265) {
          return hk.field_j - param2;
        }
        vh.a(-78, -105, 117, -8);
        return hk.field_j - param2;
    }

    static {
        field_c = "Asking for or providing contact information";
        field_e = 15;
        field_g = 0;
        field_b = new String[]{"By rating", "By win percentage"};
    }
}
