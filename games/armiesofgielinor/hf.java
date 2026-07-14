/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static int field_a;
    static boolean field_c;
    static String field_g;
    static String field_e;
    static int field_h;
    static String field_b;
    static String field_i;
    static je field_f;
    static String[] field_d;

    public static void a(byte param0) {
        if (param0 != 19) {
            return;
        }
        field_d = null;
        field_i = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_f = null;
    }

    final static void a(int param0) {
        ef.field_d = new String[cq.field_F];
        ef.field_d[9] = wt.field_E;
        ef.field_d[18] = sf.field_Q;
        ef.field_d[17] = qc.field_b;
        ef.field_d[19] = ih.field_X;
        ef.field_d[11] = pf.field_f;
        ef.field_d[6] = bs.field_c;
        ef.field_d[13] = tb.field_b;
        ef.field_d[7] = vs.field_d;
        ef.field_d[21] = dq.field_f;
        ef.field_d[20] = dm.field_d;
        ef.field_d[16] = tv.field_e;
        ef.field_d[4] = tc.field_c;
        ef.field_d[15] = ig.field_r;
        if (param0 != 7670) {
          return;
        } else {
          ef.field_d[5] = sa.field_f;
          return;
        }
    }

    final static void a(ha param0, byte param1, boolean param2) {
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (!param0.field_b) {
              if (param1 != 9) {
                field_e = null;
                int discarded$4 = param0.a(true, param0.field_sb);
                return;
              } else {
                int discarded$5 = param0.a(true, param0.field_sb);
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0, wk[] param1, int param2) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var3 = param2; param1.length > var3; var3++) {
            fn.a(8678, param0, 0, param1[var3]);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Magic";
        field_a = 0;
        field_e = "Prestige Level: <%0>";
        field_b = "+<MANA>% mana per turn";
        field_c = true;
        field_i = "Options Menu";
        field_d = new String[]{"BARBARIAN", "AVIANSIE", "GORILLA", "BARBARIANSPEARWOMAN", "DRAGON", "TXHAARKET", "DAGANNOTH", "PORTALMAGE", "PALADIN", "SARADOMINOWL", "MONK", "SARADOMINMAGE", "WHITEKNIGHT", "UNICORN", "CENTAURBOWMAN", "LION", "SARADOMINRANGER", "PRIEST", "ICYENE", "WEREWOLF", "SKELETON", "NECROMANCER", "ZAMORAKMAGE", "BLACKKNIGHT", "BLACKDEMON", "ZAMORAKRANGER", "HELLHOUND", "SEASLUG", "VYREWATCH", "PYRELORD", "TERRORBIRDGNOME", "WOLF", "DRUID", "BLACKGUARDDWARF", "DWARFCANNON", "MOSSGIANT", "VOIDKNIGHT", "TORTOISEGNOME", "GLIDERGNOME", "JADEVINE", "ENT", "FALCON", "BLACKBEAR", "ELFSONGSTRESS", "ELFSHIELDMAIDEN", "GRENWALL", "DIREWOLF", "ELVENPIKEMEN", "ELVENARCHER", "ELFLORD", "ELFLADY", "SHADOWCREATURE", "GOBLIN", "GOBLINHIGHPRIEST", "OGRE", "JOGRE", "MOGRE", "HOBGOBLIN", "OGRESHAMAN", "CYCLOPS", "ORK", "OGRESS", "OURG", "KALPHITEQUEEN", "JACKAL", "MUMMY", "LOCUST", "BEBADINNOMAD", "MENAPHITETHUG", "WARRIOROFICTHLARIN", "CROCODILE", "SCARABITEMAGE", "SPHINX", "ELIDINISELEMENTAL", "KINGBLACKDRAGON", "DWARFCANNON(cannon)", "PORTALMAGE(portal)", "Elf_songstress(dagger)"};
        field_h = 5;
    }
}
