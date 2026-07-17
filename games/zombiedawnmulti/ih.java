/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String[] field_e;
    static cj field_d;
    static String field_b;
    static String field_c;
    static String field_a;

    final static void a() {
        int var1_int = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (dl.field_h == null) {
            return;
        }
        try {
            if (!(null != ud.field_P)) {
                ud.field_P = new ja(512, 512);
            }
            ud.field_P.a();
            for (var1_int = 256; 0 < var1_int; var1_int--) {
                oo.d(256, 256, var1_int, -var1_int + 256);
            }
            dl.field_h.b((byte) 125);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ih.C(" + 256 + 41);
        }
    }

    final static void a(boolean param0, int param1, ug param2) {
        try {
            nc.a(param0, 256, 92, param2);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ih.D(" + param0 + 44 + 256 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b() {
        field_b = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        L0: {
          if (cr.a((byte) -115)) {
            cn.a(13, param5, param6, (byte) -120);
            if (pk.field_b == null) {
              m.a(param5, 0, 13);
              cf.a(14, param5, true);
              param5 = false;
              return param5;
            } else {
              if (pk.field_b.a(11, 0, (byte) -8, param5, 13)) {
                param5 = false;
                q.b(89);
                m.a(param5, 0, 13);
                cf.a(14, param5, true);
                param5 = false;
                break L0;
              } else {
                m.a(param5, 0, 13);
                cf.a(14, param5, true);
                param5 = false;
                return param5;
              }
            }
          } else {
            break L0;
          }
        }
        return param5;
    }

    final static void a(n param0) {
        ga var5 = null;
        int var4 = 0;
        try {
            var5 = ma.field_a;
            var5.b((byte) -35, 6);
            var5.field_j = var5.field_j + 1;
            var4 = var5.field_j;
            var5.a(113, 1);
            if (null == param0.field_f) {
                var5.a(-92, 0);
            } else {
                var5.a(-33, param0.field_f.length);
                var5.a(param0.field_f, param0.field_f.length, 0, 115);
            }
            int discarded$0 = var5.f(var4, 121);
            var5.field_j = var5.field_j - 4;
            param0.field_h = var5.i(-1478490344);
            var5.e(41, -var4 + var5.field_j);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ih.F(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 44 + 6 + 41);
        }
    }

    final static void a(byte param0, ab param1) {
        ga var6 = null;
        int var4 = 0;
        try {
            var6 = ma.field_a;
            var6.b((byte) -35, 4);
            int var5 = 62;
            var6.field_j = var6.field_j + 1;
            var4 = var6.field_j;
            var6.a(118, 1);
            var6.a(-128, param1.field_i);
            var6.a(-109, param1.field_f);
            var6.b(-104, param1.field_m);
            var6.b(91, param1.field_l);
            var6.b(43, param1.field_g);
            var6.b(-99, param1.field_n);
            int discarded$0 = var6.f(var4, 117);
            var6.e(35, var6.field_j - var4);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ih.B(" + 99 + 44 + (param1 != null ? "{...}" : "null") + 44 + 4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Win a Rated game", "Win 10 Rated games", "Win 50 Rated games", "Win 100 Rated games", "Win a game using only one kind of powerup, having a Rating of at least 1500", "Win without equipping any powerups, having a Rating of at least 2000", "Win a game having captured more humans than zombies (at least 10)", "Master the entire Zombie research tree", "Master the entire Overlord research tree", "Master the entire Planetary research tree", "Curse back a cursed zombie", "Have an enemy overlord target one of your phantoms with a powerup", "Win a game with no traits equipped, having a Rating of at least 2500", "Spread the zombie virus by defeating someone who has this Achievement, while having a Rating of at least 1337", "Lose 30 of your zombies, but still win", "Win a four-player match, having a Rating of at least 2000", "Win a game having captured a live pumpkin-head", "Kill 80 enemy zombies in one match", "Kill the enemy's last zombie", "Capture a human that was near an enemy's portal", "Zombify 10 humans using a single super-sped zombie", "Master half of all research items", "Breach an enemy's Miasma", "Win a battle on every map"};
        field_d = new cj();
        field_b = "Your science will advance more from any humans you capture alive.";
        field_c = "Rematch!";
    }
}
