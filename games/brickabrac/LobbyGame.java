/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyGame extends UiComponent {
    boolean directJoinEnabled;
    int removalStatus;
    static String field_rc;
    boolean directJoinAvailable;
    int playerCount;
    static int field_oc;
    int concludedDurationMillis;
    UiComponent field_Vb;
    static String field_Xb;
    UiComponent field_sc;
    byte[] settings;
    boolean joinRequestPending;
    UiComponent field_tc;
    int protocolWord16;
    static String field_pc;
    UiComponent field_nc;
    UiComponent field_lc;
    long activityTimeMillis;
    boolean rated;
    UiComponent field_Bc;
    UiComponent field_zc;
    String[] playerNames;
    UiComponent field_ic;
    boolean protocolFlag8;
    UiComponent[] field_Ec;
    UiComponent field_Cc;
    UiComponent field_Ac;
    int statusChangeTick;
    String displayName;
    UiComponent field_Ub;
    boolean invitationPending;
    int joinSortPriority;
    UiComponent field_mc;
    static RgbSprite spaceNearSprite;
    static int field_hc;
    UiComponent field_gc;
    UiComponent field_ec;
    UiComponent field_Yb;
    int spectatorMode;
    long protocolId64;
    int maxPlayers;
    boolean started;
    UiComponent field_Sb;

    final boolean isUnindexed(int obfuscationGuard) {
        int var2 = -35 / ((74 - obfuscationGuard) / 32);
        return !this.isSecondaryLinked(2) ? true : false;
    }

    final boolean comesBeforeGame(LobbyGame other, boolean obfuscationGuard) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_22_0 = false;
        boolean stackIn_29_0 = false;
        int stackIn_33_0 = 0;
        boolean stackIn_37_0 = false;
        boolean stackIn_42_0 = false;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_61_0 = 0;
        boolean stackIn_65_0 = false;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int thisInvitationPriority = 0;
        RuntimeException failure = null;
        int otherInvitationPriority = 0;
        int thisStartedPriority = 0;
        int otherStartedPriority = 0;
        try {
          if (!this.invitationPending) {
            stackIn_6_0 = (6 == this.removalStatus) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          thisInvitationPriority = stackIn_6_0;
          if (!other.invitationPending) {
            stackIn_12_0 = (other.removalStatus == 6) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          otherInvitationPriority = stackIn_12_0;
          if (!obfuscationGuard) {
            this.getGameId((byte) -123);
          }
          if (otherInvitationPriority != thisInvitationPriority) {
            stackIn_17_0 = thisInvitationPriority;
            return stackIn_17_0 != 0;
          }
          if (thisInvitationPriority == 0) {
            if (other.directJoinAvailable != this.directJoinAvailable) {
              stackIn_22_0 = this.directJoinAvailable;
              return stackIn_22_0;
            }
            if (this.directJoinAvailable &&
              other.joinSortPriority != this.joinSortPriority) {
              stackIn_29_0 = !(other.joinSortPriority <= this.joinSortPriority);
              return stackIn_29_0;
            }
          }
          stackIn_33_0 = (this.started) ? 0 : 1;
          if (stackIn_33_0 == (other.started ? 1 : 0)) {
            stackIn_37_0 = !(this.started);
            return stackIn_37_0;
          }
          if (!this.started) {
            stackIn_42_0 = !(other.activityTimeMillis <= this.activityTimeMillis);
            return stackIn_42_0;
          }
          if (this.protocolFlag8) {
            stackIn_49_0 = 1;
          } else {
            stackIn_49_0 = (this.spectatorMode == 2) ? 1 : 0;
          }
          thisStartedPriority = stackIn_49_0;
          if (!other.protocolFlag8) {
            stackIn_55_0 = (2 == other.spectatorMode) ? 1 : 0;
          } else {
            stackIn_55_0 = 1;
          }
          otherStartedPriority = stackIn_55_0;
          stackIn_57_0 = thisStartedPriority;
          if (otherStartedPriority != 0) {
            stackIn_58_1 = 0;
          } else {
            stackIn_58_1 = 1;
          }
          if (stackIn_57_0 == stackIn_58_1) {
            stackIn_61_0 = thisStartedPriority;
            return stackIn_61_0 != 0;
          }
          stackIn_65_0 = !(this.activityTimeMillis <= other.activityTimeMillis);
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_68_0 = failure;
          stackIn_68_1 = new StringBuilder().append("om.B(");
          if (other == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, int param2, boolean param3, PlayerBoard param4, int param5, int param6, boolean param7, MultiplayerMatch param8) {
        int stackIn_3_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        RgbSprite var11 = null;
        int var12_int = 0;
        RgbSprite[] var12 = null;
        int var13_int = 0;
        RgbSprite var13 = null;
        int var14_int = 0;
        String var14 = null;
        int var15_int = 0;
        Object var15 = null;
        String var15_ref = null;
        String var16_ref_String = null;
        int var16 = 0;
        RgbSprite var17 = null;
        RgbSprite var18 = null;
        int var10Lifetime1;
        try {
          stackIn_3_0 = ((1 << param6 & (param8.playerMaskTwo | param8.playerMaskOne | param8.playerMaskThree)) == 0) ? 0 : 1;
          var9_int = stackIn_3_0;
          if (var9_int == 0 &&
            param3 &&
            param4.simulationTick < 150) {
            var10 = param4.simulationTick / 50;
            var17 = ed.field_b[var10];
            var12_int = param4.simulationTick - 50 * var10;
            var13_int = (50 + var12_int * 2) * var17.canvasWidth / 50;
            var14_int = var17.canvasHeight * (50 + var12_int * 3) / 50;
            var15_int = var12_int;
            if (4 * var12_int < 150) {
              var15_int = var12_int / 2;
            }
            var17.b(param2 + (306 - var13_int) / 2, 300 + param5 - (var14_int / 2 + param4.simulationTick / 5), var13_int, var14_int, (12800 - 256 * var15_int) / 50);
          }
          param2 -= 7;
          param5 -= 7;
          var10Lifetime1 = 445 + param5;
          Rasterizer2D.fillRectangleAlpha(7 + param2, var10Lifetime1, 306, 28, 0, 96);
          nh.paintNineSliceFrame(322, 482, -40, param2 - 1, LoginCredentialKind.field_h, param5 - 1);
          nh.paintNineSliceFrame(322, 44, -40, param2 - 1, LoginCredentialKind.field_h, -7 + var10Lifetime1 - 1);
          param2 += 7;
          PowerUpWarning.a(5 + param2, param4, param8, -34, 4 + var10Lifetime1);
          param2 += 306;
          var18 = ef.field_e[param4.characterIndex];
          var11 = var18;
          var11.drawTransparent(-var18.canvasWidth + param2 + 5, 480 - var18.canvasHeight);
          if (param4.characterIndex != 2) {
            if (param4.characterIndex != 5) {
              var12 = cn.field_e;
            } else {
              var12 = AccountMessageDialog.field_yb;
            }
          } else {
            var12 = ScorePopup.field_r;
          }
          var13 = var12[QuickChatHelpDialog.a(param8, param6, 87, param4)];
          var13.drawTransparent(-8 + param2 - (var18.canvasWidth + var13.canvasWidth) / 2, -var13.canvasHeight + 480 + 10);
          if (param1 != -103) {
            field_hc = 38;
          }
          var14 = TextFont.truncateText(ce.field_e, param8.playerNames[param6], 73);
          var15 = null;
          if (!param7 ||
            var9_int != 0 ||
            param4.displayedMessage == null) {
            if (param0 &&
              var9_int != 0) {
              if (param4.resultWord < 0) {
                var15_ref = Integer.toString(param4.resultWord);
              } else {
                var15_ref = rd.a(hh.field_e, new String[]{Integer.toString(param4.resultWord)}, (byte) 103);
              }
            } else {
              if (!param8.configuration.repeats) {
                var15_ref = rd.a(rm.field_e, new String[]{Integer.toString(pp.a(param4, (byte) 66, param8) + 1), Integer.toString(param8.configuration.getPeriod(-103))}, (byte) 103);
              } else {
                var15_ref = rd.a(MouseInput.field_a, new String[]{Integer.toString(1 + pp.a(param4, (byte) 97, param8))}, (byte) 103);
              }
            }
            var16_ref_String = rd.a(BrickABrac.field_H, new String[]{var14, var15_ref}, (byte) 103);
            ce.field_e.drawRight(var16_ref_String, -var18.canvasWidth + (param2 - 9), ce.field_e.ascent + var10Lifetime1, 2, -1);
          }
          if (param7 &&
            var9_int == 0) {
            if (param4.displayedMessage == null) {
              return;
            }
            var16 = ContextActionController.field_g.measureText(param4.displayedMessage) + 20;
            nh.paintNineSliceFrame(var16, 24, param1 + 63, param2 + (-var18.canvasWidth + (-9 - var16)), MultiValueSliderWidget.field_K, 2 + var10Lifetime1);
            AlignedIconLabel.field_Sb.drawTransparent(param2 - var18.canvasWidth - 13, 6 + var10Lifetime1);
            PasswordFieldRenderer.field_D.drawCentered(param4.displayedMessage, -(var16 / 2) + param2 + (-var18.canvasWidth - 9), 6 + (var10Lifetime1 + PasswordFieldRenderer.field_D.ascent), 6, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_37_0 = var9;
          stackIn_37_1 = new StringBuilder().append("om.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_rc = null;
        field_Xb = null;
        if (param0 != -32) {
          MultiplayerMatch var2 = (MultiplayerMatch) null;
          LobbyGame.$cfr$intArgs$a$687785aae666(true, -24, 25, true, (PlayerBoard) null, 48, -120, false, (MultiplayerMatch) null);
        }
        spaceNearSprite = null;
        field_pc = null;
    }

    final int getGameId(byte obfuscationGuard) {
        int var2 = -51 % ((obfuscationGuard - 66) / 35);
        return (int)this.getSecondaryKey(-19451);
    }

    LobbyGame(int settingCount) {
        super(0L, (UiComponent) null);
        this.settings = new byte[settingCount];
    }

    static {
        field_Xb = "Invalid name";
        field_rc = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$687785aae666(boolean param0, int param1, int param2, boolean param3, PlayerBoard param4, int param5, int param6, boolean param7, MultiplayerMatch param8) {
        int stackIn_3_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        RgbSprite var11 = null;
        int var12_int = 0;
        RgbSprite[] var12 = null;
        int var13_int = 0;
        RgbSprite var13 = null;
        int var14_int = 0;
        String var14 = null;
        int var15_int = 0;
        Object var15 = null;
        String var15_ref = null;
        String var16_ref_String = null;
        int var16 = 0;
        RgbSprite var17 = null;
        RgbSprite var18 = null;
        int var10Lifetime1;
        try {
          stackIn_3_0 = ((1 << param6 & (param8.playerMaskTwo | param8.playerMaskOne | param8.playerMaskThree)) == 0) ? 0 : 1;
          var9_int = stackIn_3_0;
          if (var9_int == 0 &&
            param3 &&
            param4.simulationTick < 150) {
            var10 = param4.simulationTick / 50;
            var17 = ed.field_b[var10];
            var12_int = param4.simulationTick - 50 * var10;
            var13_int = (50 + var12_int * 2) * var17.canvasWidth / 50;
            var14_int = var17.canvasHeight * (50 + var12_int * 3) / 50;
            var15_int = var12_int;
            if (4 * var12_int < 150) {
              var15_int = var12_int / 2;
            }
            var17.b(param2 + (306 - var13_int) / 2, 300 + param5 - (var14_int / 2 + param4.simulationTick / 5), var13_int, var14_int, (12800 - 256 * var15_int) / 50);
          }
          param2 -= 7;
          param5 -= 7;
          var10Lifetime1 = 445 + param5;
          Rasterizer2D.fillRectangleAlpha(7 + param2, var10Lifetime1, 306, 28, 0, 96);
          nh.paintNineSliceFrame(322, 482, -40, param2 - 1, LoginCredentialKind.field_h, param5 - 1);
          nh.paintNineSliceFrame(322, 44, -40, param2 - 1, LoginCredentialKind.field_h, -7 + var10Lifetime1 - 1);
          param2 += 7;
          PowerUpWarning.a(5 + param2, param4, param8, -34, 4 + var10Lifetime1);
          param2 += 306;
          var18 = ef.field_e[param4.characterIndex];
          var11 = var18;
          var11.drawTransparent(-var18.canvasWidth + param2 + 5, 480 - var18.canvasHeight);
          if (param4.characterIndex != 2) {
            if (param4.characterIndex != 5) {
              var12 = cn.field_e;
            } else {
              var12 = AccountMessageDialog.field_yb;
            }
          } else {
            var12 = ScorePopup.field_r;
          }
          var13 = var12[QuickChatHelpDialog.a(param8, param6, 87, param4)];
          var13.drawTransparent(-8 + param2 - (var18.canvasWidth + var13.canvasWidth) / 2, -var13.canvasHeight + 480 + 10);
          if (param1 != -103) {
            field_hc = 38;
          }
          var14 = TextFont.truncateText(ce.field_e, param8.playerNames[param6], 73);
          var15 = null;
          if (!param7 ||
            var9_int != 0 ||
            param4.displayedMessage == null) {
            if (param0 &&
              var9_int != 0) {
              if (param4.resultWord < 0) {
                var15_ref = Integer.toString(param4.resultWord);
              } else {
                var15_ref = rd.a(hh.field_e, new String[]{Integer.toString(param4.resultWord)}, (byte) 103);
              }
            } else {
              if (!param8.configuration.repeats) {
                var15_ref = rd.a(rm.field_e, new String[]{Integer.toString(pp.a(param4, (byte) 66, param8) + 1), Integer.toString(param8.configuration.getPeriod(-103))}, (byte) 103);
              } else {
                var15_ref = rd.a(MouseInput.field_a, new String[]{Integer.toString(1 + pp.a(param4, (byte) 97, param8))}, (byte) 103);
              }
            }
            var16_ref_String = rd.a(BrickABrac.field_H, new String[]{var14, var15_ref}, (byte) 103);
            ce.field_e.drawRight(var16_ref_String, -var18.canvasWidth + (param2 - 9), ce.field_e.ascent + var10Lifetime1, 2, -1);
          }
          if (param7 &&
            var9_int == 0) {
            if (param4.displayedMessage == null) {
              return;
            }
            var16 = ContextActionController.field_g.measureText(param4.displayedMessage) + 20;
            nh.paintNineSliceFrame(var16, 24, param1 + 63, param2 + (-var18.canvasWidth + (-9 - var16)), MultiValueSliderWidget.field_K, 2 + var10Lifetime1);
            AlignedIconLabel.field_Sb.drawTransparent(param2 - var18.canvasWidth - 13, 6 + var10Lifetime1);
            PasswordFieldRenderer.field_D.drawCentered(param4.displayedMessage, -(var16 / 2) + param2 + (-var18.canvasWidth - 9), 6 + (var10Lifetime1 + PasswordFieldRenderer.field_D.ascent), 6, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_37_0 = var9;
          stackIn_37_1 = new StringBuilder().append("om.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }
}
