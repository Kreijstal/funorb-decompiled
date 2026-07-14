/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fla extends td {
    static String field_p;
    static kv field_s;
    static boolean field_q;
    static float field_r;
    static String[] field_t;

    fla(int param0, aga param1) {
        super(param0, param1);
    }

    final static void b(int param0) {
        wca.field_n = wca.field_n + 1;
        gha.a(8, wca.field_n);
        if (param0 != 23621) {
            return;
        }
        if (!(!o.d((byte) 119))) {
            ua.field_b = false;
            af.field_a = false;
            return;
        }
        aga.d(false);
        bf.field_h[wca.field_n].a(-123);
    }

    public static void c(int param0) {
        field_t = null;
        field_p = null;
        field_s = null;
        int var1 = -110 / ((30 - param0) / 51);
    }

    final ii a(op param0, int param1) {
        pba var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        L0: {
          var8 = BachelorFridge.field_y;
          var9 = ((fla) this).field_h.a(32, param0);
          if (param1 == 3) {
            break L0;
          } else {
            fla.b(51);
            break L0;
          }
        }
        var4 = new pba(((fla) this).field_g, new nq(var9));
        var5 = 0;
        L1: while (true) {
          if (var5 >= param0.field_z) {
            return (ii) (Object) var4;
          } else {
            var6 = 0;
            L2: while (true) {
              if (param0.field_B <= var6) {
                var5++;
                continue L1;
              } else {
                if (param0.field_a[var5][var6].field_l != null) {
                  var7 = param0.field_a[var5][var6].field_l;
                  var4.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, 0, 3), true);
                  var6++;
                  continue L2;
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "You must be a member to play with the current options.";
        field_t = new String[]{"SOUND_ARIBA", "SOUND_BASH", "SOUND_BLOOD_SUCKER", "SOUND_BOOT_OF_DOOM", "SOUND_BOUNCING_BOMB", "SOUND_BUFF_SPATK", "SOUND_CHUCK", "SOUND_CHUNDER_HOWITZER", "SOUND_CRANE_KICK", "SOUND_CURSE_ATTACK", "SOUND_CURSE_SPATK", "SOUND_CURSE_SPEED", "SOUND_DIVE_BOMB", "SOUND_BUFF1", "SOUND_BUFF2", "SOUND_BUFF3", "SOUND_FREIGHT_TRAIN", "SOUND_GOO_DAGGER", "SOUND_GOO_DART", "SOUND_GOO_SPEAR", "SOUND_GOO_THROW", "SOUND_GRASSHOPPER_KICK", "SOUND_HAYMAKER", "SOUND_HEAL1", "SOUND_HEAL2", "SOUND_HEAL3", "SOUND_HURL", "SOUND_JUMP", "SOUND_JUMP1", "SOUND_JUMP2", "SOUND_JUMP3", "SOUND_JUMPING_BOMB", "SOUND_KNOCKOUT", "SOUND_LEADEN_FIST", "SOUND_LEVITATE", "SOUND_LIFE_DRAINER", "SOUND_LOB", "SOUND_MAD_DASH", "SOUND_MEGA_POO", "SOUND_MEGA_PUKE", "SOUND_PINCH", "SOUND_POKE", "SOUND_POO", "SOUND_POO_CANNON", "SOUND_POO_HOWITZER", "SOUND_POO_MORTAR", "SOUND_PROD", "SOUND_PUKE", "SOUND_PUKE_CANNON", "SOUND_PUNCH", "SOUND_PUSH", "SOUND_REALLY_POO", "SOUND_SHOULDER_BARGE", "SOUND_SHOULDER_CHARGE", "SOUND_SHOULDER_DESTROYER", "SOUND_SHOVE", "SOUND_SPECIAL_ATTACK_BOOSTER", "SOUND_STEAM_ROLLER", "SOUND_SWING", "SOUND_SWIPE", "SOUND_TELEPORT", "SOUND_UPPERCUT", "SOUND_VAMPIRE", "SOUND_VAN_DAM", "SOUND_VAN_DAMAGED", "SOUND_VAN_DAMED", "SOUND_VOMIT", "SOUND_VOMIT_MORTAR", "SOUND_WALK_OVER", "SOUND_WAX_ON", "SOUND_WHACK"};
    }
}
