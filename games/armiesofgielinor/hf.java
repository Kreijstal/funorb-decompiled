/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static int field_a;
    static boolean textChatActive;
    static String field_g;
    static String field_e;
    static int consoleCharacterKind;
    static String field_b;
    static String field_i;
    static ClientUiComponent field_f;
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
        ConsoleParseException.field_d = new String[CampaignMenuEntry.field_F];
        ConsoleParseException.field_d[9] = GiveTileConsoleCommand.field_E;
        ConsoleParseException.field_d[18] = ResizableModalDialog.field_Q;
        ConsoleParseException.field_d[17] = qc.field_b;
        ConsoleParseException.field_d[19] = MidiPcmStream.field_X;
        ConsoleParseException.field_d[11] = pf.field_f;
        ConsoleParseException.field_d[6] = bs.field_c;
        ConsoleParseException.field_d[13] = EffectPresentation.field_b;
        ConsoleParseException.field_d[7] = vs.field_d;
        ConsoleParseException.field_d[21] = HuffmanCodec.field_f;
        ConsoleParseException.field_d[20] = MatchSetupPanel.field_d;
        ConsoleParseException.field_d[16] = tv.field_e;
        ConsoleParseException.field_d[4] = IntrusiveNode.field_c;
        ConsoleParseException.field_d[15] = AnimationSkeleton.field_r;
        if (param0 == 7670) {
          ConsoleParseException.field_d[5] = ClientConnectionState.field_f;
          return;
        }
    }

    final static void recomputeClientStateChecksum(Battlefield battlefield, byte obfuscationGuard, boolean unusedFlag) {
        if (battlefield == null ||
          battlefield.field_b) {
          return;
        }
        try {
          if (obfuscationGuard != 9) {
            field_e = (String) null;
          }
          battlefield.computeStateChecksum(true, battlefield.localPlayer);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hf.C(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + unusedFlag + ')');
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
            EditableTextWidget.a(8678, param0, 0, param1[var3_int]);
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_g = "Magic";
        field_a = 0;
        field_e = "Prestige Level: <%0>";
        field_b = "+<MANA>% mana per turn";
        textChatActive = true;
        field_i = "Options Menu";
        field_d = new String[]{"BARBARIAN", "AVIANSIE", "GORILLA", "BARBARIANSPEARWOMAN", "DRAGON", "TXHAARKET", "DAGANNOTH", "PORTALMAGE", "PALADIN", "SARADOMINOWL", "MONK", "SARADOMINMAGE", "WHITEKNIGHT", "UNICORN", "CENTAURBOWMAN", "LION", "SARADOMINRANGER", "PRIEST", "ICYENE", "WEREWOLF", "SKELETON", "NECROMANCER", "ZAMORAKMAGE", "BLACKKNIGHT", "BLACKDEMON", "ZAMORAKRANGER", "HELLHOUND", "SEASLUG", "VYREWATCH", "PYRELORD", "TERRORBIRDGNOME", "WOLF", "DRUID", "BLACKGUARDDWARF", "DWARFCANNON", "MOSSGIANT", "VOIDKNIGHT", "TORTOISEGNOME", "GLIDERGNOME", "JADEVINE", "ENT", "FALCON", "BLACKBEAR", "ELFSONGSTRESS", "ELFSHIELDMAIDEN", "GRENWALL", "DIREWOLF", "ELVENPIKEMEN", "ELVENARCHER", "ELFLORD", "ELFLADY", "SHADOWCREATURE", "GOBLIN", "GOBLINHIGHPRIEST", "OGRE", "JOGRE", "MOGRE", "HOBGOBLIN", "OGRESHAMAN", "CYCLOPS", "ORK", "OGRESS", "OURG", "KALPHITEQUEEN", "JACKAL", "MUMMY", "LOCUST", "BEBADINNOMAD", "MENAPHITETHUG", "WARRIOROFICTHLARIN", "CROCODILE", "SCARABITEMAGE", "SPHINX", "ELIDINISELEMENTAL", "KINGBLACKDRAGON", "DWARFCANNON(cannon)", "PORTALMAGE(portal)", "Elf_songstress(dagger)"};
        consoleCharacterKind = 5;
    }
}
