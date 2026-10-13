/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLineLayout {
    static String field_k;
    static String field_a;
    static boolean field_m;
    static String field_g;
    static NodeDeque additionalSoundHandles;
    int top;
    int[] caretXs;
    static long field_h;
    static SpellMenuGroup currentSpellMenu;
    static String field_f;
    int bottom;
    static boolean field_l;
    static String field_b;
    static String[] field_d;

    final int nearestCaret(int x, byte obfuscationGuard) {
        int caretIndex;
        int obfuscationControl;
        int guardedCaretIndex;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null == this.caretXs) {
          return 0;
        }
        if (0 == this.caretXs.length) {
          return 0;
        }
        if (obfuscationGuard == 29) {
          for (caretIndex = 1; this.caretXs.length > caretIndex; caretIndex++) {
            if ((this.caretXs[caretIndex] + this.caretXs[-1 + caretIndex] >> 1) > x) {
              return -1 + caretIndex;
            }
          }
          return -1 + this.caretXs.length;
        }
        TextLineLayout.a((String) null, 64, -17, 10, 101, -122, -53, 45, 110);
        for (guardedCaretIndex = 1; this.caretXs.length > guardedCaretIndex; guardedCaretIndex++) {
          if ((this.caretXs[guardedCaretIndex] + this.caretXs[-1 + guardedCaretIndex] >> 1) > x) {
            return -1 + guardedCaretIndex;
          }
        }
        return -1 + this.caretXs.length;
    }

    final static void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          DateOfBirthValidator.field_i.text = param0;
          if (rs.outgoingChatChannel != 2) {
            ed.field_e.text = FixedQuaternion.field_c;
          } else {
            ed.field_e.text = bq.field_d;
          }
          var9_int = 495;
          var10 = 5;
          SummonEvent.field_F.setBounds(param5, -20500, -10 + var9_int, var10, 5);
          UpkeepEvent.field_z.setBounds(param5, -20500, -DebouncedValidator.field_b.width + SummonEvent.field_F.width, 0, 0);
          var10 = var10 + (param5 + param2);
          DebouncedValidator.field_b.setBounds(param5, -20500, DebouncedValidator.field_b.width, 0, UpkeepEvent.field_z.width);
          qf.field_e.setBounds(param4, -20500, qf.field_e.getPreferredWidth(param7 - 15550), var10, 5);
          var11 = ed.field_e.getPreferredWidth(param7 ^ 15717);
          ed.field_e.setBounds(param4, -20500, var11, var10, -5 + (var9_int - var11));
          if (param7 != 15676) {
            TextLineLayout.b(-109);
          }
          DateOfBirthValidator.field_i.setBounds(param3, -20500, var9_int, 0, 0);
          var12 = 5 + param4 + var10;
          StrongCacheEntry.field_C.setBounds(var12, -20500, var9_int, param3, 0);
          StrongCacheEntry.field_C.skinSprites = tq.a(11579568, false, StrongCacheEntry.field_C.height, 2105376, 3, 8421504);
          var12 = var12 + param3;
          UnitCycler.field_g.setBounds(var12, -20500, var9_int, param8 - var12 / 2, -(var9_int / 2) + param1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ts.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(byte param0) {
        LinkButtonPainter.field_f = new BattleGraphicsAssets(iw.field_l);
        if (param0 < -36) {
          LinkButtonPainter.field_f.selectTheme(0, 0);
          LinkButtonPainter.field_f.loadBasicSprites(0);
          return;
        }
        currentSpellMenu = (SpellMenuGroup) null;
        LinkButtonPainter.field_f.selectTheme(0, 0);
        LinkButtonPainter.field_f.loadBasicSprites(0);
    }

    final int getRightEdge(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return -103;
        }
        if (this.caretXs == null) {
          return 0;
        }
        if (this.caretXs.length != 0) {
          return this.caretXs[this.caretXs.length - 1];
        }
        return 0;
    }

    final static void startCampaignMission(CampaignMission mission, int obfuscationGuard, CampaignQuicksave quicksave) {
        GameplayController stackIn_4_0;
        GameplayController stackIn_4_1;
        boolean stackIn_4_2;
        int stackIn_4_3;
        String[] stackIn_4_4;
        int stackIn_4_5;
        boolean stackIn_4_6;
        BattleGraphicsAssets stackIn_4_7;
        int stackIn_4_8;
        int stackIn_4_9;
        int stackIn_4_10;
        boolean stackIn_4_11;
        int stackIn_4_12;
        int stackIn_4_13;
        GameplayController stackIn_5_0;
        GameplayController stackIn_5_1;
        boolean stackIn_5_14;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        Throwable decompiledCaughtException = null;
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        Exception var5 = null;
        Unit var6 = null;
        CampaignParticipant var6_ref = null;
        int var7 = 0;
        String[] var8 = null;
        CampaignParticipant var9 = null;
        GameplayController stackIn_4_0Lifetime1;
        GameplayController stackIn_4_1Lifetime1;
        GameplayController stackIn_5_0Lifetime1;
        GameplayController stackIn_5_1Lifetime1;
        int var5_intLifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          regionExit1: {
            l.activeCampaignMission = mission;
            PointerInputHandler.field_f = null;
            var8 = mission.getParticipantNames(-23209);
            var3 = var8;
            r.field_B = var8.length;
            var4 = mission.playerSlot;
            ByteStorage.field_g = obfuscationGuard + r.field_B;
            LinkButtonPainter.field_f.selectTheme(mission.mapTheme, 0);
            stackIn_4_0 = null;
            stackIn_4_1 = null;
            stackIn_4_2 = false;
            stackIn_4_3 = 0;
            stackIn_4_4 = var3;
            stackIn_4_5 = var4;
            stackIn_4_6 = false;
            stackIn_4_7 = LinkButtonPainter.field_f;
            stackIn_4_8 = mission.mapSizeSetting;
            stackIn_4_9 = ArmiesOfGielinor.field_K;
            stackIn_4_10 = mission.mapTheme;
            stackIn_4_11 = false;
            stackIn_4_12 = 4;
            stackIn_4_13 = 0;
            if (!QuickChatPhraseRepository.a(27875)) {
              stackIn_4_0Lifetime1 = null;
              stackIn_4_1Lifetime1 = null;
              if (BufferedSocket.field_j >= 2) {
                stackIn_5_0 = null;
                stackIn_5_1 = null;
                stackIn_5_14 = true;
                break regionExit1;
              }
            }
            stackIn_5_0Lifetime1 = null;
            stackIn_5_1Lifetime1 = null;
            stackIn_5_14 = false;
          }
          FullscreenFocusCanvas.gameplayController = new GameplayController(stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_4_6, stackIn_4_7, stackIn_4_8, stackIn_4_9, stackIn_4_10, stackIn_4_11, stackIn_4_12, stackIn_4_13, stackIn_5_14, mission);
          FullscreenFocusCanvas.gameplayController.battlefield.field_F = true;
          FullscreenFocusCanvas.gameplayController.battlefield.playerCoats = new CoatOfArms[mission.participantIds.length];
          for (var5_int = 0; FullscreenFocusCanvas.gameplayController.battlefield.playerCoats.length > var5_int; var5_int++) {
            if (~var5_int == ~mission.playerSlot) {
              FullscreenFocusCanvas.gameplayController.battlefield.playerCoats[var5_int] = ah.localCoat;
            } else {
              var9 = mission.campaign.participants[mission.participantIds[var5_int]];
              var6_ref = var9;
              FullscreenFocusCanvas.gameplayController.battlefield.playerCoats[var5_int] = var9.coatOfArms;
            }
          }
          if ((1 & mission.flags) != 0) {
            var5_intLifetime1 = -1 + mission.participantIds.length;
            var6 = (Unit) (FullscreenFocusCanvas.gameplayController.battlefield.getUnitsForPlayer(var5_intLifetime1, ~obfuscationGuard).first((byte) 97));
            while (var6 != null) {
              if (var6.strength > 10) {
                var6.strength = 10;
              }
              var6 = (Unit) (FullscreenFocusCanvas.gameplayController.battlefield.getUnitsForPlayer(var5_intLifetime1, ~obfuscationGuard).next((byte) 123));
            }
          }
          if (quicksave == null) {
            return;
          }
          try {
            FullscreenFocusCanvas.gameplayController.restoreCampaignQuicksave((byte) -121, quicksave, mission);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (Exception) (Object) decompiledCaughtException;
            af.a((Throwable) ((Object) var5), -74, "Error loading quicksave.");
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_28_0 = var3_ref;
          stackIn_28_1 = new StringBuilder().append("ts.E(");
          if (mission == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(obfuscationGuard).append(',');
          if (quicksave == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        additionalSoundHandles = null;
        currentSpellMenu = null;
        field_k = null;
        if (param0 == -26908) {
          field_a = null;
          field_d = null;
          field_f = null;
          field_g = null;
          field_b = null;
          return;
        }
        field_l = false;
        field_a = null;
        field_d = null;
        field_f = null;
        field_g = null;
        field_b = null;
    }

    TextLineLayout(int top, int bottom, int characterCount) {
        this.top = top;
        this.caretXs = new int[1 + characterCount];
        this.bottom = bottom;
    }

    static {
        field_a = null;
        additionalSoundHandles = null;
        field_k = "<%0> is already on your ignore list.";
        field_f = "to return to the normal view.";
        field_g = "Won";
        field_b = "\"Slow but sure moves the might of the gods.\"<br>     - Euripides (484 - 406 BC)";
        field_d = new String[]{"OPEN", "TRACK", "MOUNTAINS", "FOREST", "RIVER", "SWAMP", "SEA", "CIRCLE", "HOUSE", "CASTLE", "BRIDGE"};
    }
}
