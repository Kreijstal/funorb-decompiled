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
        ef.field_d[4] = IntrusiveNode.field_c;
        ef.field_d[15] = ig.field_r;
        if (param0 == 7670) {
          ef.field_d[5] = sa.field_f;
          return;
        }
    }

    final static void a(Battlefield param0, byte param1, boolean param2) {
        if (param0 == null ||
          param0.field_b) {
          return;
        }
        try {
          if (param1 != 9) {
            field_e = (String) null;
          }
          param0.a(true, param0.localPlayer);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "hf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, RgbSprite[] param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var3_int = param2; param1.length > var3_int; var3_int++) {
            fn.a(8678, param0, 0, param1[var3_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
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
