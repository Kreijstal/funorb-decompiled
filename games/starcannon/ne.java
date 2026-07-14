/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ne {
    int field_g;
    int field_f;
    static long field_d;
    static td field_l;
    int field_h;
    static String field_i;
    static rk field_c;
    int field_b;
    int field_k;
    int field_e;
    static String field_a;
    static long field_j;

    final static void a(boolean param0, String param1, String param2, int param3) {
        if (param3 != 150) {
          ne.a(-9, -29);
          lc.field_hb = param2;
          sd.field_b = param1;
          sc.a(param0, (byte) 93, bl.field_c);
          return;
        } else {
          lc.field_hb = param2;
          sd.field_b = param1;
          sc.a(param0, (byte) 93, bl.field_c);
          return;
        }
    }

    abstract void c(int param0, int param1);

    final static void b(int param0, int param1) {
        Object var3 = null;
        if (param1 != 150) {
          var3 = null;
          ne.a(false, (String) null, (String) null, 49);
          int discarded$4 = mg.a((byte) -78);
          return;
        } else {
          int discarded$5 = mg.a((byte) -78);
          return;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_l = null;
        field_c = null;
        if (param0 > -83) {
          var2 = null;
          ne.a(false, (String) null, (String) null, -118);
          field_i = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        if (param1 < 6) {
          field_l = null;
          kk.field_a = param0 * 100 / 150;
          kk.field_c = param0 * 400 / 150;
          kk.field_e = (param0 << 1164553424) / 150;
          return;
        } else {
          kk.field_a = param0 * 100 / 150;
          kk.field_c = param0 * 400 / 150;
          kk.field_e = (param0 << 1164553424) / 150;
          return;
        }
    }

    abstract void a(int param0, int param1, int param2);

    final static int a(boolean param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        var2 = param1.length();
        var3 = 0;
        if (param0) {
          return -84;
        } else {
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = ma.a(-128, param1.charAt(var4)) + -var3 + (var3 << -427390427);
              var4++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Game over";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = new rk();
    }
}
