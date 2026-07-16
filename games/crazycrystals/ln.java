/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ln {
    int field_b;
    static dl field_d;
    static am field_f;
    int field_c;
    int field_e;
    String field_a;

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = CrazyCrystals.field_B;
        if (param0 != -17512) {
          var8 = null;
          ln.a(46, (db) null);
          var5 = 0;
          L0: while (true) {
            if (ga.field_J.length <= var5) {
              return;
            } else {
              param1 = ga.field_J[var5];
              var6 = var5 << -719032380;
              L1: while (true) {
                int incrementValue$8 = param1;
                param1--;
                if (incrementValue$8 == 0) {
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  int incrementValue$9 = var6;
                  var6++;
                  param4 = gh.field_E[incrementValue$9];
                  param3[param2[param4]] = param3[param2[param4]] + 1;
                  gh.field_E[param3[param2[param4]]] = param4;
                  continue L1;
                }
              }
            }
          }
        } else {
          var5 = 0;
          L2: while (true) {
            if (ga.field_J.length <= var5) {
              return;
            } else {
              param1 = ga.field_J[var5];
              var6 = var5 << -719032380;
              L3: while (true) {
                int incrementValue$10 = param1;
                param1--;
                if (incrementValue$10 == 0) {
                  var5++;
                  var5++;
                  continue L2;
                } else {
                  int incrementValue$11 = var6;
                  var6++;
                  param4 = gh.field_E[incrementValue$11];
                  param3[param2[param4]] = param3[param2[param4]] + 1;
                  gh.field_E[param3[param2[param4]]] = param4;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= -127) {
            field_f = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    abstract int a(int param0, byte param1);

    final static void a(int param0, db param1) {
        Object var3 = null;
        if (param0 != 0) {
          var3 = null;
          ln.a(46, (db) null);
          fm.field_s = bf.a(-1, "sprites_player_death_electrocution_player", "", param1);
          mj.field_f = bf.a(-1, "sprites_player_death_electrocution_skeleton", "", param1);
          ro.field_u = bf.a(param0 ^ -1, "sprites_player_death_electrocution_halo", "", param1);
          return;
        } else {
          fm.field_s = bf.a(-1, "sprites_player_death_electrocution_player", "", param1);
          mj.field_f = bf.a(-1, "sprites_player_death_electrocution_skeleton", "", param1);
          ro.field_u = bf.a(param0 ^ -1, "sprites_player_death_electrocution_halo", "", param1);
          return;
        }
    }

    ln(String param0, int param1, int param2, int param3) {
        ((ln) this).field_e = param1;
        ((ln) this).field_c = param2;
        ((ln) this).field_a = param0;
        ((ln) this).field_b = param3;
    }

    static {
    }
}
