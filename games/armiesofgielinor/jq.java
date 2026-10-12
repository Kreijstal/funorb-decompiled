/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends dr {
    static String field_E;
    static RgbSprite[] kalphiteSprites;
    static int field_F;
    static String[][] field_I;
    static int[] field_H;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_2_0 = null;
        nd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -24872) {
            stackIn_4_0 = new nd(ClientUiNode.a(param0 + 24994, (String) (param1[0].field_c)));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nd) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static RgbSprite[] a(boolean param0, int param1, int param2, int param3, boolean param4, int param5) {
        RgbSprite var13 = null;
        RgbSprite var14 = null;
        int[] var16 = SoftwareRaster.pixels;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = SoftwareRaster.width;
        int var8 = SoftwareRaster.height;
        RgbSprite var9 = new RgbSprite(16, param3);
        var9.b();
        SoftwareRaster.a(0, 0, 16, param3, param5, param1);
        Object var10 = null;
        Object var11 = null;
        if (param0) {
          var13 = var9.g();
          var10 = var13;
          var13.b();
          SoftwareRaster.e(0, 0, 5, 0);
          SoftwareRaster.e(0, 1, 3, 0);
          SoftwareRaster.e(0, 2, 2, 0);
          SoftwareRaster.e(0, 3, 1, 0);
          SoftwareRaster.e(0, 4, 1, 0);
        }
        if (param4) {
          var14 = var9.g();
          var11 = var14;
          var14.b();
          SoftwareRaster.e(11, 0, 5, 0);
          SoftwareRaster.e(13, 1, 3, 0);
          SoftwareRaster.e(14, 2, 2, 0);
          SoftwareRaster.e(15, 3, 1, 0);
          SoftwareRaster.e(15, 4, 1, 0);
        }
        if (param2 == -20600) {
          SoftwareRaster.setTarget(var16, var7, var8);
          return new RgbSprite[]{null, null, null, (RgbSprite) (var10), var9, (RgbSprite) (var11), null, null, null};
        }
        field_I = (String[][]) null;
        SoftwareRaster.setTarget(var16, var7, var8);
        return new RgbSprite[]{null, null, null, (RgbSprite) (var10), var9, (RgbSprite) (var11), null, null, null};
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if ((param0 & param1) != 0) {
          var2 = 8 - (7 & param1);
        }
        int var3 = param1 + var2;
        return var3;
    }

    jq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        if (param0 < -2) {
          field_E = null;
          kalphiteSprites = null;
          field_H = null;
          field_I = (String[][]) null;
          return;
        }
        field_I = (String[][]) null;
        field_E = null;
        kalphiteSprites = null;
        field_H = null;
        field_I = (String[][]) null;
    }

    static {
        field_F = -1;
        field_E = "Suggest muting this player";
        field_H = new int[]{61, 62, 70};
        field_I = new String[][]{new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "walk_a"}, new String[]{"death_a", "defend_a", "jeer_a", "ranged_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"bear_new_attack", "bear_new_death", "defend_a", "jeer_a", "ready_b", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ranged_a", "ready_a", "walk_a"}, new String[]{"death_c", "defend_c", "jeer_c", "ranged_b", "ready_c", "run_b", "walk_c"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_b", "death_a", "death_b", "defend_b", "jeer_a", "ready_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ranged_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "attack_b", "attack_c", "attack_d", "death_a", "death_b", "defend_a", "defend_b", "defend_c", "jeer_a", "ready_a", "run_b", "run_c", "run_e", "run_f", "walk_a", "walk_b", "walk_c", "walk_d"}, new String[]{"attack_a", "attack_b", "death_a", "defend_a", "hammer_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ranged_a", "ready_a", "walk_a"}, new String[]{"attack_a", "break_a", "build_a", "death_a", "defend_a", "hammer_a", "jeer_a", "ranged_a", "ready_a", "walk_a"}, new String[]{"attack_a", "attack_b", "death_a", "defend_a", "jeer_a", "ready_a", "walk_a"}, new String[]{"attack_a", "attack_b", "death_a", "defend_a", "jeer_a", "ranged_a", "ready_a", "run_a", "walk_a"}, new String[]{"death_a", "defend_a", "ranged_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_b", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "attack_b", "attack_c", "attack_d", "attack_e", "attack_f", "attack_g", "attack_h", "attack_i", "attack_j", "bury_a", "death_a", "death_b", "defend_a", "defend_b", "defend_d", "jeer_a", "jeer_b", "jeer_c", "jeer_e", "jeer_f", "ranged_a", "ranged_b", "ranged_c", "ranged_d", "ranged_e", "ready_a", "ready_b", "ready_c", "ready_e", "ready_f", "run_a", "run_b", "run_c", "run_d", "run_e", "summon_a", "special_f", "sacrifice_a", "walk_a", "walk_b", "walk_c", "walk_d"}, new String[]{"attack_a", "death_a", "defend_a", "growth_a", "jeer_a", "ready_a", "recede_a"}, new String[]{"attack_a", "death_a", "defend_a", "defend_b", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "walk_a"}, new String[]{"attack_b", "death_b", "defend_b", "jeer_b", "ready_b", "walk_b"}, new String[]{"attack_b", "death_b", "defend_b", "jeer_b", "ready_b", "walk_b"}, new String[]{"attack_b", "death_c", "defend_c", "jeer_b", "ranged_b", "ready_c", "run_a", "walk_c"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "death_b", "defend_b", "jeer_a", "ready_b", "run_a", "run_b", "walk_a"}, new String[]{"attack_a", "death_a", "defend_b", "jeer_a", "ready_b", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "defend_b", "jeer_a", "ready_b", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_c", "run_a", "walk_a"}, new String[]{"attack_b", "death_b", "defend_b", "jeer_b", "ready_b", "walk_b"}, new String[]{"attack_z", "death_z", "defend_z", "jeer_z", "ranged_z", "ready_z", "run_z", "walk_z"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "idle_a", "teleport_in", "teleport_out"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"attack_a", "death_a", "defend_a", "jeer_a", "ready_a", "run_a", "walk_a"}, new String[]{"portal", "portal_grow", "portal_shrink"}, new String[]{"ahrim_ready", "ahrim_attack", "ahrim_ranged", "ahrim_death", "ahrim_defend", "ahrim_jeer", "ahrim_run", "ahrim_walk"}, new String[]{"dharok_ready", "dharok_attack_a", "dharok_attack_b", "dharok_death", "dharok_defend", "dharok_jeer", "dharok_run", "dharok_walk"}, new String[]{"guthan_ready", "guthan_attack_a", "guthan_attack_b", "guthan_death", "guthan_defend", "guthan_jeer", "guthan_run", "guthan_walk"}, new String[]{"karil_ready", "karil_attack", "karil_ranged", "karil_death", "karil_defend", "karil_jeer", "karil_run", "karil_walk"}, new String[]{"torag_ready", "torag_attack", "torag_death", "torag_defend", "torag_jeer", "torag_run", "torag_walk"}, new String[]{"verac_ready", "verac_attack", "verac_death", "verac_defend", "verac_jeer", "verac_run", "verac_walk"}, new String[]{"zemo_zemouregal_ready", "zemo_zemouregal_attack", "zemo_zemouregal_death", "zemo_zemouregal_defend", "zemo_zemouregal_jeer", "zemo_zemouregal_walk"}};
    }
}
