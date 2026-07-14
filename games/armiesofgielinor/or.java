/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or implements kh {
    static int field_c;
    private int field_d;
    private int field_m;
    static String[] field_f;
    private int field_i;
    private int field_h;
    static String field_a;
    private int field_l;
    static String field_e;
    private int field_b;
    private ka field_g;
    static String field_j;
    private int field_k;

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ws var14 = null;
        kb stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        kb stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof ws)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (kb) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (kb) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (ws) (Object) stackIn_3_0;
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        qn.f(param1 + param0.field_B, param4 + param0.field_p, param0.field_l, param0.field_w, ((or) this).field_b);
        var7 = var14.field_S + param0.field_B + param1;
        if (param2 > -79) {
          L2: {
            field_e = null;
            var8 = param0.field_p + param4 - -var14.field_M;
            qn.a(var7, var8, var14.field_Q, ((or) this).field_i);
            if (var14.field_N != -1) {
              var9 = 2.0 * ((double)var14.field_N * 3.141592653589793) / (double)var14.field_L;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
              var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
              qn.a(var11 + var7, var12 + var8, 1, ((or) this).field_k);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            qn.a(var7, var8, 2, 1);
            var9 = (double)var14.field_R * 3.141592653589793 * 2.0 / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
            var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
            qn.h(var7, var8, var11 + var7, var8 - -var12, 1);
            if (((or) this).field_g == null) {
              break L3;
            } else {
              var13 = ((or) this).field_h + var14.field_Q + var14.field_S;
              int discarded$2 = ((or) this).field_g.a(param0.field_v, param1 + param0.field_B - -var13, ((or) this).field_d + param4 - -param0.field_p, param0.field_l + -((or) this).field_h + -var13, param0.field_w + -(((or) this).field_h << -974891807), ((or) this).field_m, ((or) this).field_l, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            var8 = param0.field_p + param4 - -var14.field_M;
            qn.a(var7, var8, var14.field_Q, ((or) this).field_i);
            if (var14.field_N != -1) {
              var9 = 2.0 * ((double)var14.field_N * 3.141592653589793) / (double)var14.field_L;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
              var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
              qn.a(var11 + var7, var12 + var8, 1, ((or) this).field_k);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            qn.a(var7, var8, 2, 1);
            var9 = (double)var14.field_R * 3.141592653589793 * 2.0 / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
            var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
            qn.h(var7, var8, var11 + var7, var8 - -var12, 1);
            if (((or) this).field_g == null) {
              break L5;
            } else {
              var13 = ((or) this).field_h + var14.field_Q + var14.field_S;
              int discarded$3 = ((or) this).field_g.a(param0.field_v, param1 + param0.field_B - -var13, ((or) this).field_d + param4 - -param0.field_p, param0.field_l + -((or) this).field_h + -var13, param0.field_w + -(((or) this).field_h << -974891807), ((or) this).field_m, ((or) this).field_l, 1, 1, 0);
              break L5;
            }
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        field_j = null;
        if (param0) {
            field_f = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    or(ka param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((or) this).field_g = param0;
        ((or) this).field_k = param6;
        ((or) this).field_l = param4;
        ((or) this).field_m = param3;
        ((or) this).field_i = param5;
        ((or) this).field_h = param1;
        ((or) this).field_d = param2;
        ((or) this).field_b = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"attack_gorillla", "aviansie", "birds", "black_bear", "black_demon", "centaur", "commander_zilyana", "crocodile", "cyclops", "dagannoth", "dogs", "dwarf_black_guard", "dwarf_mounted_battle_tortoise", "dwarf_multicannon", "ent", "gargoyle", "gnome_copter", "gnome_rider", "goblin", "goblin_high_priest", "grenwall", "hobgoblin", "human", "jade_vine", "jogre", "kalphite_queen", "kalphite_soldier", "kalphite_worker", "king_black_dragon", "lion", "locust", "morge", "moss_giant", "mummy", "ogre", "ogre_shaman", "ogress", "ork", "ourg", "barbarian_female", "pyrelord", "scabarite_mage", "sea_slug", "shapeshifter", "skeleton_warrior", "sphinx", "tzhaar-ket_warrior", "unicorn", "werewolf", "portal", "human", "human", "human", "human", "human", "human", "zemo"};
        field_a = "Decline invitation to <%0>'s game";
        field_j = "Equipment";
        field_c = 2;
        field_e = "Team chat on";
    }
}
