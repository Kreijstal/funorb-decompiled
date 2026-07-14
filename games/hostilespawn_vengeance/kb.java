/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kb {
    static String[] field_c;
    static String field_a;
    static String field_b;
    static int field_d;

    final static void a(int param0, int param1, int param2, vh param3) {
        ac.field_a = param2;
        if (param1 <= 123) {
            field_b = null;
            ac.field_g = param0;
            ne.field_j = param3;
            return;
        }
        ac.field_g = param0;
        ne.field_j = param3;
    }

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(byte param0);

    public static void c(byte param0) {
        field_a = null;
        field_c = null;
        int var1 = 71 % ((param0 - -8) / 46);
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, vm param5, int param6) {
        int var7 = 0;
        int var8 = HostileSpawn.field_I ? 1 : 0;
        for (var7 = param3; param4.length() > var7; var7++) {
            param5.a(param4.charAt(var7), param6, param1, param2);
            param6 = param6 + param0;
        }
    }

    final static void b(byte param0) {
        if (im.field_e == null) {
          L0: {
            if (null != hj.field_t) {
              hj.field_t.f((byte) -79);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != -43) {
            return;
          } else {
            ch.a((byte) 115);
            return;
          }
        } else {
          L1: {
            im.field_e.l(-115);
            if (null != hj.field_t) {
              hj.field_t.f((byte) -79);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 != -43) {
            return;
          } else {
            ch.a((byte) 115);
            return;
          }
        }
    }

    final static pg a(pg param0, int[] param1, byte param2) {
        pg var3 = null;
        var3 = new pg(0, 0, 0);
        var3.field_h = param0.field_h;
        var3.field_j = param0.field_j;
        var3.field_i = param0.field_i;
        var3.field_b = param0.field_b;
        if (param2 < 98) {
          field_d = 34;
          var3.field_a = param0.field_a;
          var3.field_f = param0.field_f;
          var3.field_c = param0.field_c;
          var3.field_k = param1;
          return var3;
        } else {
          var3.field_a = param0.field_a;
          var3.field_f = param0.field_f;
          var3.field_c = param0.field_c;
          var3.field_k = param1;
          return var3;
        }
    }

    abstract void a(java.awt.Component param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_a = "Blast doors and turrets are invulnerable to small arms fire, but can be destroyed with heavier weapons.";
    }
}
