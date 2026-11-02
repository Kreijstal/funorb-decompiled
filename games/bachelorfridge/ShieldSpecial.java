/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShieldSpecial extends SpecialOrder {
    static String field_p;
    static Sprite field_s;
    static boolean field_q;
    static float field_r;
    static String[] field_t;

    ShieldSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    final static void b(int param0) {
        CreatureType.field_n = CreatureType.field_n + 1;
        gha.a(8, CreatureType.field_n);
        if (param0 != 23621) {
          return;
        }
        if (o.d((byte) 119)) {
          ua.field_b = false;
          af.field_a = false;
          return;
        }
        BattleCreature.d(false);
        bf.field_h[CreatureType.field_n].a(-123);
    }

    public static void c(int param0) {
        field_t = null;
        field_p = null;
        field_s = null;
        int var1 = -110 / ((30 - param0) / 51);
    }

    final CreatureEvent a(BattleState param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        RuntimeException var3 = null;
        ShieldEvent var4 = null;
        BattleCreature var7 = null;
        int var8 = 0;
        BattleCreature var9 = null;
        ShieldEvent stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          var9 = this.creature.a(32, param0);
          if (param1 != 3) {
            ShieldSpecial.b(51);
          }
          var4 = new ShieldEvent(this.moveId, new CreatureRef(var9));
          for (var5 = 0; var5 < param0.width; var5++) {
            for (var6 = 0; param0.height > var6; var6++) {
              if (param0.tiles[var5][var6].occupant != null) {
                var7 = param0.tiles[var5][var6].occupant;
                var4.effects.a(new DamageEffect(new CreatureRef(var7), false, 1, 0, 3), true);
              }
            }
          }
          stackIn_13_0 = var4;
          return (CreatureEvent) ((Object) stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("fla.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "You must be a member to play with the current options.";
        field_t = new String[]{"SOUND_ARIBA", "SOUND_BASH", "SOUND_BLOOD_SUCKER", "SOUND_BOOT_OF_DOOM", "SOUND_BOUNCING_BOMB", "SOUND_BUFF_SPATK", "SOUND_CHUCK", "SOUND_CHUNDER_HOWITZER", "SOUND_CRANE_KICK", "SOUND_CURSE_ATTACK", "SOUND_CURSE_SPATK", "SOUND_CURSE_SPEED", "SOUND_DIVE_BOMB", "SOUND_BUFF1", "SOUND_BUFF2", "SOUND_BUFF3", "SOUND_FREIGHT_TRAIN", "SOUND_GOO_DAGGER", "SOUND_GOO_DART", "SOUND_GOO_SPEAR", "SOUND_GOO_THROW", "SOUND_GRASSHOPPER_KICK", "SOUND_HAYMAKER", "SOUND_HEAL1", "SOUND_HEAL2", "SOUND_HEAL3", "SOUND_HURL", "SOUND_JUMP", "SOUND_JUMP1", "SOUND_JUMP2", "SOUND_JUMP3", "SOUND_JUMPING_BOMB", "SOUND_KNOCKOUT", "SOUND_LEADEN_FIST", "SOUND_LEVITATE", "SOUND_LIFE_DRAINER", "SOUND_LOB", "SOUND_MAD_DASH", "SOUND_MEGA_POO", "SOUND_MEGA_PUKE", "SOUND_PINCH", "SOUND_POKE", "SOUND_POO", "SOUND_POO_CANNON", "SOUND_POO_HOWITZER", "SOUND_POO_MORTAR", "SOUND_PROD", "SOUND_PUKE", "SOUND_PUKE_CANNON", "SOUND_PUNCH", "SOUND_PUSH", "SOUND_REALLY_POO", "SOUND_SHOULDER_BARGE", "SOUND_SHOULDER_CHARGE", "SOUND_SHOULDER_DESTROYER", "SOUND_SHOVE", "SOUND_SPECIAL_ATTACK_BOOSTER", "SOUND_STEAM_ROLLER", "SOUND_SWING", "SOUND_SWIPE", "SOUND_TELEPORT", "SOUND_UPPERCUT", "SOUND_VAMPIRE", "SOUND_VAN_DAM", "SOUND_VAN_DAMAGED", "SOUND_VAN_DAMED", "SOUND_VOMIT", "SOUND_VOMIT_MORTAR", "SOUND_WALK_OVER", "SOUND_WAX_ON", "SOUND_WHACK"};
    }
}
