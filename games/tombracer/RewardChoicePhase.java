/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RewardChoicePhase extends MatchPhase {
    private int field_q;
    private int field_r;
    private int field_v;
    private int field_s;
    private int selectedColumn;
    static String field_w;
    static int[] field_t;
    private CommonChooseReward rewardChoice;
    private int selectedRow;
    static sq field_n;
    private RewardChoiceSlot[][] field_p;

    public static void releaseStatics(int param0) {
        field_t = null;
        field_w = null;
        if (param0 != 6153) {
          return;
        }
        field_n = null;
    }

    final boolean handleKey(char param0, int param1, int param2) {
        if (param1 != 25) {
          return false;
        }
        if (this.field_v != 0 &&
          !this.isLocalPlayersTurn(true)) {
          if (param2 != 84 &&
            83 != param2) {
            return false;
          }
          this.confirmSelection(12721);
          return true;
        }
        return false;
    }

    RewardChoicePhase(MatchScreen param0, MatchProtocol param1) {
        super(param0, param1);
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        this.field_r = -1;
        this.field_v = 0;
        try {
          this.rewardChoice = this.matchState.rewardChoice;
          this.rewardChoice.field_g = new SoundEventPlayer();
          var3_int = this.rewardChoice.getRewardCount(-28958);
          this.field_q = 3;
          this.field_s = 1;
          this.field_p = new RewardChoiceSlot[this.field_q][this.field_s];
          var4 = 0;
          var5 = aaa.a(false) - this.field_q * 100 + (100 - (this.field_q - 1) * 20);
          var5 = var5 / 2 + 0;
          var6 = -50 + (SwitchLinkList.b(0) + 100) + (-(this.field_s * 100) - 16 * (this.field_s - 1));
          var6 = var6 / 2 + 16;
          for (var7 = 0; var7 < this.field_q; var7++) {
            for (var8 = 0; var8 < this.field_s; var8++) {
              if (var4 >= var3_int) {
                this.field_p[var7][var8] = null;
              } else {
                var9 = var5;
                var10 = var6;
                if (var7 > 0) {
                  var9 = var9 + var7 * 120;
                }
                if (var8 > 0) {
                  var10 = var10 + 116 * var8;
                }
                var11 = 100;
                var9 = var9 - var11 / 2;
                var12 = 100;
                var10 = var10 - var12 / 2;
                this.field_p[var7][var8] = new RewardChoiceSlot(this, var4, var9, var10, var11, var12);
                var4++;
              }
            }
          }
          this.selectColumn(0);
          TripBeamComponent.playMusicTrack(1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ab.<init>(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void draw(int param0, boolean param1) {
        int var11_int = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var11;
        RewardChoiceSlot var12_ref_fv;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var16 = TombRacer.field_G ? 1 : 0;
        Room.field_j.a(0, 0);
        var3 = 0;
        var4 = this.rewardChoice.getCurrentPlayerId(-1);
        if (!this.screen.isSpectating((byte) 63) &&
          this.screen.localPlayerIndex == var4) {
          var3 = 1;
        }
        var5 = 160;
        var6 = aaa.a(false) / 2;
        var7 = SwitchLinkList.b(0) / 2;
        ura.a(-10985);
        var5Lifetime1 = 128;
        if (var4 >= 0) {
          var8 = (aaa.a(false) >> 1) - (gg.field_f.width() >> 1);
          var9 = (SwitchLinkList.b(0) >> 1) - (gg.field_f.height() >> 1);
          gg.field_f.a(var8, var9);
          if (var3 == 0) {
            SocketConnector.a(LegacyOpenGlFlowingWaterEffect.formatText(83, cba.field_c, new String[]{this.screen.getColouredPlayerName(var4, 9)}).toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, 32 + var9, var8, 1, (byte) 60, gg.field_f.width());
          } else {
            SocketConnector.a(us.field_c.toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, var9 + 32, var8, 1, (byte) 60, gg.field_f.width());
            var10 = (-this.rewardChoice.getCurrentPlayerTicks(-1) + 750) / 50 + 1;
            if (var10 < 0) {
              var10 = 0;
            }
            SocketConnector.a(LegacyOpenGlFlowingWaterEffect.formatText(108, tla.field_h, new String[]{Integer.toString(var10)}).toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, var9 + 200, var8, 1, (byte) 60, gg.field_f.width());
          }
          for (var10 = 0; this.field_q > var10; var10++) {
            for (var11_int = 0; var11_int < this.field_s; var11_int++) {
              var12_ref_fv = this.field_p[var10][var11_int];
              if (var12_ref_fv != null) {
                if (this.isLocalPlayersTurn(true) &&
                  var10 == this.selectedRow &&
                  var11_int == this.selectedColumn) {
                  tga.field_a.c(SoundEvent.withFullAlpha(false, wga.field_a[this.screen.localPlayerIndex]), var12_ref_fv.field_g, var12_ref_fv.field_j, var12_ref_fv.field_c, -22971, var12_ref_fv.field_i);
                }
                var12_ref_fv.drawSlot(1);
              }
            }
          }
        }
        var17 = 0;
        var8Lifetime1 = var17;
        if (param0 > -50) {
          this.draw(-64, false);
        }
        while (this.matchState.players.length > var17) {
          var9Lifetime1 = -(this.matchState.players.length * var5Lifetime1 / 2) + var6 + var5Lifetime1 * var17;
          var10 = -200 + var7;
          SocketConnector.a(this.screen.getPlayerName(var17, false).toUpperCase(), 1, kn.field_p, wga.field_a[var17], 0, 32, 1, var10, var9Lifetime1, 1, (byte) 60, var5Lifetime1);
          if (!this.matchState.hasFinishedCourse((byte) 90, var17)) {
            var11 = cs.field_b;
            var12 = 8947848;
          } else {
            var13 = this.matchState.players[var17].getChosenReward(115);
            if (var13 == -1) {
              var14 = this.matchState.standings.positions[var17];
              var15 = this.rewardChoice.getCurrentPos((byte) 50);
              if (var14 >= var15) {
                if (var14 != var15) {
                  var12 = 12303291;
                  var11 = RoomDefinition.field_i;
                } else {
                  var12 = 16777215;
                  var11 = RoundWinnerPhase.field_o;
                }
              } else {
                var11 = cga.field_l;
                var12 = 8947848;
              }
            } else {
              var12 = 16777215;
              var11 = sla.field_b[var13];
            }
          }
          SocketConnector.a(var11.toUpperCase(), 1, kn.field_p, var12, 0, 32, 1, 32 + var10, var9Lifetime1, 1, (byte) 60, var5Lifetime1);
          var17++;
        }
        RemovedFromGameMenu.f((byte) -6);
        this.drawMenuButton(-27142);
    }

    final static boolean isPrivateChatTarget(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -4) {
            return false;
          }
          if (!ni.field_c) {
            return false;
          }
          if (OpenGlUnderwaterEffect.field_q == 2 &&
            null != mn.field_n) {
            var3 = (CharSequence) ((Object) param0);
            if (mn.field_n.equals(jd.normalizeDisplayName(1, var3))) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ab.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean selectCell(int param0, int param1, byte param2) {
        RewardChoiceSlot var4;
        if (!this.isLocalPlayersTurn(true)) {
          return false;
        }
        if (param1 >= 0 &&
          param0 >= 0 &&
          this.field_q > param1) {
          if (param0 >= this.field_s) {
            return false;
          }
          var4 = this.field_p[param1][param0];
          if (param2 < 78) {
            this.moveSelection(32, 41, (byte) 103);
          }
          if (var4 == null) {
            return false;
          }
          if (!this.rewardChoice.isRewardAvailable((byte) 119, var4.field_f)) {
            return false;
          }
          this.selectedColumn = param0;
          this.selectedRow = param1;
          return true;
        }
        return false;
    }

    final boolean allowsChat(int param0) {
        if (param0 != -9202) {
          return true;
        }
        return true;
    }

    final void announceChoice(int param0, boolean param1, int param2) {
        int var4 = 0;
        FloatingMessage var5 = null;
        FloatingMessage var6 = null;
        if (this.rewardChoice.getCurrentPlayerId(-1) == param0) {
          if (param2 == -1) {
            var6 = RewardChoicePhase.createTextMessage(-9, LegacyOpenGlFlowingWaterEffect.formatText(86, OpenGlTransform3D.field_n, new String[]{this.matchState.getColouredPlayerName(param0, 23807)}));
            iqa.field_c.addMessageNow(0, var6);
            this.rewardChoice.takeReward(param2, (byte) 112);
          } else {
            var4 = this.rewardChoice.getReward(-108, param2);
            this.rewardChoice.takeReward(param2, (byte) 119);
            this.selectColumn(0);
            var5 = RewardChoicePhase.createTextMessage(-58, LegacyOpenGlFlowingWaterEffect.formatText(125, RecursiveBacktrackerMazeGenerator.field_b, new String[]{this.matchState.getColouredPlayerName(param0, 23807), sla.field_b[var4]}));
            iqa.field_c.addMessageNow(0, var5);
          }
        }
        if (!param1) {
          RewardChoicePhase.isPointInRect(-52, 79, -8, 36, 97, 39, -99);
        }
    }

    private final void handleInput(int param0) {
        if (this.field_v == 0) {
          return;
        }
        if (ProceduralTextureProvider.field_c &&
          this.selectAt(GridWidgetContainer.field_B, 25006, AgeValidator.field_j) &&
          PlayerModel.field_b == 1) {
          this.confirmSelection(12721);
        }
        if (this.screen.isActionJustPressed(param0, 2)) {
          this.moveSelection(0, -1, (byte) 56);
        }
        if (this.screen.isActionJustPressed(0, 3)) {
          this.moveSelection(0, 1, (byte) 80);
        }
        if (this.screen.isActionJustPressed(0, 0)) {
          this.moveSelection(-1, 0, (byte) 51);
        }
        if (this.screen.isActionJustPressed(0, 1)) {
          this.moveSelection(1, 0, (byte) 73);
        }
        if (this.screen.isActionJustPressed(0, 4)) {
          this.confirmSelection(12721);
        }
    }

    private final boolean isLocalPlayersTurn(boolean param0) {
        boolean stackIn_6_0 = false;
        if (!param0) {
          field_n = (sq) null;
        }
        stackIn_6_0 = (!this.screen.isSpectating((byte) 98)) && (this.screen.localPlayerIndex == this.rewardChoice.getCurrentPlayerId(-1));
        return stackIn_6_0;
    }

    private final void confirmSelection(int param0) {
        if (!this.isLocalPlayersTurn(true)) {
          return;
        }
        int var2 = this.field_p[this.selectedRow][this.selectedColumn].field_f;
        if (!this.rewardChoice.isRewardAvailable((byte) 127, var2)) {
          return;
        }
        if (param0 != 12721) {
          return;
        }
        if (null != this.protocol) {
          this.protocol.sendRewardChoice(var2, 1);
        } else {
          this.rewardChoice.takeReward(var2, (byte) 102);
        }
    }

    final void update(int param0, boolean param1) {
        if (this.field_r > 0) {
          this.field_r = this.field_r - 1;
          return;
        }
        this.rewardChoice.tickChooser((byte) -124);
        if (param1 &&
          this.isLocalPlayersTurn(true)) {
          this.handleInput(param0 - 80);
        }
        if (param0 != 80) {
          this.allowsChat(-116);
        }
        if (this.rewardChoice.isFinished(param0 ^ -28956)) {
          this.field_r = 100;
        }
        if (param1) {
          this.updateMenuButton(7);
        }
        this.field_v = this.field_v + 1;
        if (this.rewardChoice.getCurrentPlayerId(-1) == this.screen.localPlayerIndex &&
          !(this.rewardChoice.getCurrentPlayerTicks(-1) <= 500) &&
          (750 - this.rewardChoice.getCurrentPlayerTicks(-1)) % 50 == 0) {
          this.rewardChoice.clearRewards((byte) -124);
        }
    }

    private final void selectColumn(int param0) {
        this.selectedColumn = param0;
        this.selectedRow = 0;
    }

    final CommonChooseReward getRewardChoice(byte param0) {
        int var2 = -72 / ((35 - param0) / 62);
        return this.rewardChoice;
    }

    private final boolean selectAt(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        RewardChoiceSlot var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param1 != 25006) {
          this.selectColumn(-51);
        }
        for (var4 = 0; this.field_q > var4; var4++) {
          for (var5 = 0; this.field_s > var5; var5++) {
            var6 = this.field_p[var4][var5];
            if (var6 != null &&
              var6.containsPoint(param0, false, param2)) {
              return this.selectCell(var5, var4, (byte) 122);
            }
          }
        }
        return false;
    }

    final static boolean isPointInRect(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param6 <= 100) {
          field_t = (int[]) null;
        }
        stackIn_8_0 = (param5 <= param1) && (param1 <= param4) && (param3 >= param0) && (param3 <= param2);
        return stackIn_8_0;
    }

    final static FloatingMessage createTextMessage(int param0, String param1) {
        RuntimeException var2 = null;
        FloatingMessage stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -4) {
            RewardChoicePhase.releaseStatics(-54);
          }
          stackIn_3_0 = new FloatingMessage(1, (String) null, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ab.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void moveSelection(int param0, int param1, byte param2) {
        int var4;
        RewardChoiceSlot var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (!this.isLocalPlayersTurn(true)) {
          return;
        }
        var4 = 0;
        if (param2 < 9) {
          this.field_v = 58;
        }
        while (var4 == 0) {
          this.selectedColumn = this.selectedColumn + param1;
          this.selectedRow = this.selectedRow + param0;
          if (this.selectedColumn >= 0) {
            if (this.field_s <= this.selectedColumn) {
              this.selectedColumn = 0;
            }
          } else {
            this.selectedColumn = this.field_s - 1;
          }
          if (this.selectedRow >= 0) {
            if (this.selectedRow >= this.field_q) {
              this.selectedRow = 0;
            }
          } else {
            this.selectedRow = -1 + this.field_q;
          }
          var5 = this.field_p[this.selectedRow][this.selectedColumn];
          if (var5 == null) {
            var4 = 0;
            continue;
          }
          if (this.rewardChoice.isRewardAvailable((byte) -64, var5.field_f)) {
            var4 = 1;
            continue;
          }
          var4 = 0;
        }
    }

    static {
        field_w = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
        field_t = new int[]{135, 230, 520};
    }
}
