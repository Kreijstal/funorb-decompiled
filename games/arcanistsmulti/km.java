/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    private String field_h;
    static int field_c;
    static vn field_a;
    private boolean field_f;
    private boolean field_d;
    static String field_b;
    static qb field_e;
    static String field_g;

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (1 < param1) {
          if (0 != param0) {
            var5 = param0 * 256 / (param1 + -1);
            var6 = 255;
            var7 = var6 & var5 * (var6 & param4) + (-var5 + 256) * (param3 & var6) >> -1221780184;
            var6 = var6 << 8;
            var7 = var7 + ((param4 & var6) * var5 - -((var6 & param3) * (256 + -var5)) >> 1866305000 & var6);
            if (param2 != -1422079448) {
              field_g = null;
              var6 = var6 << 8;
              var7 = var7 + ((param4 & var6) * var5 - -((var6 & param3) * (256 + -var5)) >> -1422079448 & var6);
              return var7;
            } else {
              var6 = var6 << 8;
              var7 = var7 + ((param4 & var6) * var5 - -((var6 & param3) * (256 + -var5)) >> -1422079448 & var6);
              return var7;
            }
          } else {
            return param3;
          }
        } else {
          return param3;
        }
    }

    final boolean a(int param0) {
        if (param0 != -21813) {
            return false;
        }
        return ((km) this).field_f;
    }

    final void a(boolean param0, byte param1) {
        if (param1 >= -24) {
            return;
        }
        ((km) this).field_d = true;
        ((km) this).field_f = param0 ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, dj param4, int param5, byte param6, int param7, boolean param8, qb[] param9, int param10, qb[] param11) {
        wj.a(param9, param3, 113, param1, param2, param0, param8, param7, param11, param10, param10, param5, param4, param4, param7);
        if (param6 != 40) {
            int discarded$0 = km.a(-75, -88, -28, -51, 45);
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((km) this).field_h;
    }

    final static void a(int param0, int param1) {
        vf.field_q = (param1 << 526304784) / 150;
        vf.field_m = 400 * param1 / 150;
        vf.field_o = param0 * param1 / 150;
    }

    final boolean a(byte param0) {
        if (param0 >= -70) {
            field_c = -47;
            return ((km) this).field_d;
        }
        return ((km) this).field_d;
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        field_e = null;
        field_a = null;
        if (param0 != 400) {
            int discarded$0 = km.a(16, -52, 108, -102, -114);
        }
    }

    km(String param0) {
        ((km) this).field_d = false;
        ((km) this).field_f = false;
        ((km) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "  You earn wands when you compete against other players in Rated games. There are more wands available in larger games and you will get more wands depending on how many of the following factors you do best at:";
        field_a = new vn();
        field_g = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
