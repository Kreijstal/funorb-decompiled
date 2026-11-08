/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SellPlayerDialog extends MessageDialog {
    static String field_H;
    private int field_I;
    static int field_F;
    static int field_G;

    final static void g(int param0) {
        int fieldTemp$0 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        FootballerAgent var4_ref_nl = null;
        int var5_int = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var8 = 0;
        boolean[] var9 = null;
        boolean[] var10 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var4Lifetime3Lifetime1;
        var8 = Kickabout.field_G;
        try {
          if (null != et.field_d &&
            et.field_d.phase == 4 &&
            HuffmanCodec.field_e == 14 &&
            0 < AnimationSkeleton.field_m) {
            fieldTemp$0 = AnimationSkeleton.field_m - 1;
            AnimationSkeleton.field_m = AnimationSkeleton.field_m - 1;
            if (fieldTemp$0 == 0) {
              RenderedFootballer.a(GameKeyHandler.field_a, true, (byte) -118);
            }
          }
          if (null == et.field_d) {
            return;
          }
          if (HoverTooltip.field_Eb) {
            if (QuickChatCategoryCache.advanceScriptedTutorialPlayers(105)) {
              HoverTooltip.field_Eb = false;
              et.field_d.participantStatus[0].controlledSlot = vb.field_d;
              LoggedPossession.a(false);
              mk.b(-1622);
              LeagueWinnerDialog.g(99);
            }
          } else {
            if (ButtonMenuScreen.d(-8)) {
              CheckboxLabelWidget.c(HuffmanCodec.field_e + 1, false);
            }
          }
          var1_int = AnimationSkeleton.a(false);
          var2 = RenderedBall.a(var1_int, -128);
          if (TickClock.field_a != var2) {
            AnimationPlayer.field_f = 60;
            var3 = -TickClock.field_a + (TickClock.field_a + var2 >> 1);
            if (0 == var3) {
              stackIn_25_0 = (TickClock.field_a < var2) ? 1 : -1;
              var3 = stackIn_25_0;
            }
            var3 = Math.min(Math.max(-30, var3), 30);
            TickClock.field_a = TickClock.field_a + var3;
            if (var3 > 0 &&
              TickClock.field_a > var2 ||
              var3 < 0 &&
              !(var2 <= TickClock.field_a)) {
              TickClock.field_a = var2;
            }
          } else {
            if (AnimationPlayer.field_f > 0) {
              AnimationPlayer.field_f = AnimationPlayer.field_f - 1;
            }
          }
          var3Lifetime1 = 640;
          if (HuffmanCodec.field_e == 1 &&
            !HoverTooltip.field_Eb &&
            (1050 > EmailAvailabilityValidator.field_k.pixelY(true) ||
            640 != AuctionLogEntry.field_g) ||
            (2 == HuffmanCodec.field_e ||
            HuffmanCodec.field_e == 3)) {
            var3Lifetime1 = 470;
          }
          if (var3Lifetime1 != AuctionLogEntry.field_g) {
            var4 = var3Lifetime1 - AuctionLogEntry.field_g >> 2;
            if (var4 == 0) {
              stackIn_47_0 = (AuctionLogEntry.field_g >= var3Lifetime1) ? -1 : 1;
              var4 = stackIn_47_0;
            }
            AuctionLogEntry.field_g = AuctionLogEntry.field_g + var4;
          }
          ul.b(11);
          ReceivedAuctionItem.h((byte) 125);
          if (HuffmanCodec.field_e == 6) {
            DualLinkDeque.a((byte) -127);
          }
          boolean decompiledFrameRemainder0 = true;
          if (HuffmanCodec.field_e == 7) {
            for (var4Lifetime1 = 1; var4Lifetime1 < 4; var4Lifetime1++) {
              ig.moveTutorialPlayerToLineup(true, (byte) 85, var4Lifetime1, 1);
            }
            ig.moveTutorialPlayerToLineup(false, (byte) 23, 1, 0);
            var4_ref_nl = et.field_d.field_P[1][4];
            if (0 == et.field_d.field_V.possessorTeam &&
              var4_ref_nl.action == 0) {
              var5_int = var4_ref_nl.pixelX(-111) - AccountInputValidationResult.field_f.pixelX(-124);
              var6 = var4_ref_nl.pixelY(true) - AccountInputValidationResult.field_f.pixelY(true);
              if (!(var5_int * var5_int + var6 * var6 >= 3600)) {
                var4_ref_nl.startTackle(0, -1);
                var4_ref_nl.directionMask = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (1 == et.field_d.field_V.possessorTeam &&
                var4_ref_nl.action == 0) {
                QuickChatCategory.advanceToPoint(12, (byte) 109, 11796480, var4_ref_nl, 36044800);
                if (HoverTooltip.field_Eb &&
                  AccountInputValidationResult.field_f.action == 0) {
                  AccountInputValidationResult.field_f.directionMask = 0;
                  AccountInputValidationResult.field_f.setDirectionFromMask(1, 26214);
                }
              }
            }
          }
          if (HuffmanCodec.field_e == 8) {
            if (!HoverTooltip.field_Eb) {
              et.field_d.participantStatus[1].controlledSlot = 0;
              var4Lifetime2 = et.field_d.field_V.pixelX(true);
              var5_intLifetime1 = et.field_d.field_V.pixelY(879306160);
              IntDoubleCommand.a((byte) -109, var4Lifetime2, 400, var5_intLifetime1, 100, 348, 0, 648);
              IntDoubleCommand.a((byte) -107, var4Lifetime2, 810, var5_intLifetime1, 510, 258, 1, 558);
              IntDoubleCommand.a((byte) -118, var4Lifetime2, 1200, var5_intLifetime1, 900, 298, 2, 748);
              IntDoubleCommand.a((byte) 45, var4Lifetime2, 1200, var5_intLifetime1, 900, 298, 3, 748);
            } else {
              ig.moveTutorialPlayerToLineup(false, (byte) 109, 4, 1);
            }
          }
          if (HuffmanCodec.field_e == 9) {
            for (var4Lifetime3 = 1; var4Lifetime3 < 3; var4Lifetime3++) {
              ig.moveTutorialPlayerToLineup(true, (byte) 83, var4Lifetime3, 1);
            }
            for (var4Lifetime3Lifetime1 = 3; var4Lifetime3Lifetime1 < 5; var4Lifetime3Lifetime1++) {
              if (!HoverTooltip.field_Eb &&
                et.field_d.field_P[1][var4Lifetime3Lifetime1].action == 0) {
                et.field_d.field_P[1][var4Lifetime3Lifetime1].setDirectionFromMask(1, 26214);
              }
            }
            AuctionsHelpScreen.d(true);
          }
          var4Lifetime4 = -97 / ((param0 - 88) / 34);
          if (HuffmanCodec.field_e == 10) {
            ig.moveTutorialPlayerToLineup(false, (byte) 124, 3, 1);
            ig.moveTutorialPlayerToLineup(false, (byte) 90, 4, 1);
            ig.moveTutorialPlayerToLineup(false, (byte) 52, 3, 0);
          }
          if (HuffmanCodec.field_e == 11) {
            ig.moveTutorialPlayerToLineup(false, (byte) 85, 1, 0);
          }
          if (HuffmanCodec.field_e == 12 &&
            et.field_d.field_X.goalCount > 25) {
            et.field_d.field_X.goalCount = 0;
            if (et.field_d.field_V.horizontalSpeedSquared(-1) == 0) {
              CheckboxLabelWidget.c(13, false);
            }
          }
          if (HuffmanCodec.field_e == 13) {
            if (!HoverTooltip.field_Eb) {
              if (et.field_d.field_X.goalCount > 25) {
                et.field_d.field_X.goalCount = 0;
                if (et.field_d.field_V.horizontalSpeedSquared(44) == 0) {
                  CheckboxLabelWidget.c(14, false);
                }
              }
            } else {
              et.field_d.field_X.goalCount = 0;
              if (et.field_d.field_P[1][0].positionY < 0) {
                RasterStateSnapshot.a(2235, 2949120, 4, 29360128);
              }
              if (et.field_d.field_V.possessorTeam == 0) {
                et.field_d.field_V.possessorTeam = -1;
              }
              et.field_d.participantStatus[0].controlledSlot = 0;
            }
          }
          if (HuffmanCodec.field_e == 14 &&
            MyKitScreen.field_O &&
            et.field_d.phase == 4) {
            MyKitScreen.field_O = false;
            var10 = GameLoopApplet.field_E.field_J;
            var9 = var10;
            var5 = var9;
            if (!var5[0]) {
              var5[0] = true;
              if (PlayArea.a(100)) {
                return;
              }
              var6Lifetime1 = 0;
              for (var7 = 0; var7 < var10.length; var7++) {
                if (var5[var7]) {
                  var6Lifetime1 = var6Lifetime1 | 1 << var7;
                }
              }
              or.field_d.b(69, (byte) 78);
              or.field_d.writeInt(-78, var6Lifetime1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "ie.C(" + param0 + ')');
        }
    }

    final void handleResult(int param0, int param1) {
        super.handleResult(97, param1);
        if (param1 == 0) {
          PasswordFieldPainter.a(65536, this.field_I);
        }
        if (param0 < 60) {
          field_G = 77;
        }
    }

    final static AccountInputValidationResult a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        AccountInputValidationResult var7 = null;
        int var8 = 0;
        AccountInputValidationResult stackIn_3_0 = null;
        AccountInputValidationResult stackIn_7_0 = null;
        AccountInputValidationResult stackIn_10_0 = null;
        AccountInputValidationResult stackIn_15_0 = null;
        AccountInputValidationResult stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = AccountInputValidationResult.field_b;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = CachedTextLayout.field_j;
            return stackIn_7_0;
          }
          var3 = FormationAgent.a(param0, 2, '.');
          if (var3.length < 2) {
            stackIn_10_0 = AccountInputValidationResult.field_b;
            return stackIn_10_0;
          }
          var4 = var3;
          var5 = param1;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_18_0 = ValidatedTextWidget.a(param1 + 6, var3[var3.length - 1]);
              return stackIn_18_0;
            }
            var6 = var4[var5];
            var7 = LeagueWinnerDialog.a(var6, param1 ^ 134217728);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_15_0 = var7;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ie.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 != 24342) {
          SellPlayerDialog.h(-101);
        }
        field_H = null;
    }

    SellPlayerDialog(int param0, PlayerStats param1) {
        super(34, param1);
        String var6 = null;
        String var4 = null;
        String var5 = null;
        try {
          this.field_I = param0;
          var6 = param1.getDisplayName(100);
          String var3 = var6;
          var4 = LocalizedTextLoader.formatCurrencyAmount(ImageProducerRasterBuffer.a(param1, true), 26300);
          var5 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ListingRowCache.field_e[34], new String[]{var6, var4});
          this.a(var5, this.field_t, this.field_D, -71, this.field_u);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ie.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = "Chat is currently disabled.";
    }
}
