/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RoundWinnerPhase extends MatchPhase {
    private int field_n;
    static String field_o;
    static Sprite[] field_m;
    static SpriteData[] field_p;

    final boolean allowsChat(int param0) {
        if (param0 != -9202) {
          this.field_n = 85;
          return false;
        }
        return false;
    }

    final void draw(int param0, boolean param1) {
        int var9 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        var11 = TombRacer.field_G ? 1 : 0;
        if (0 > this.matchState.getRoundWinner(2)) {
          return;
        }
        if (param0 > -50) {
          this.field_n = 30;
        }
        var3 = this.screen.getViewedPlayerIndex(100);
        var4 = 160;
        var5 = 80 + this.matchState.players.length * 20;
        var6 = 16776960;
        var7 = 11184810;
        SecondaryNodeDequeIterator.a(192, var5, 3145728, 340, (byte) 39, var4, 150);
        WhiteLightShooterComponent.a(150, (byte) -85, var4, 5242880, 2, var5, 340);
        var8 = var4 + 20 + 8;
        MembersUpsellMenu.drawCentredTextWithShadow(LegacyOpenGlFlowingWaterEffect.formatText(113, ru.field_a, new String[]{this.screen.getPlayerName(this.matchState.getRoundWinner(2), false)}).toUpperCase(), 16777215, eda.field_f, -1, var8, 320, 0);
        var8 += 40;
        MembersUpsellMenu.drawCentredTextWithShadow(nsa.field_f + ":", 16777215, TooltipRenderer.field_p, -1, var8, 320, 0);
        var8 += 20;
        for (var9 = 0; var9 < this.matchState.players.length; var9++) {
          if (this.matchState.players[var9] != null) {
            if (var3 == var9) {
              var10 = var6;
            } else {
              var10 = var7;
            }
            MembersUpsellMenu.drawCentredTextWithShadow(this.screen.getPlayerName(var9, false).toUpperCase() + ": " + this.matchState.roundWins[var9], var10, TooltipRenderer.field_p, -1, var8, 320, 0);
            var8 += 20;
          }
        }
        return;
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        if (param0 != 0) {
          RoundWinnerPhase.releaseStatics(69);
        }
        field_p = null;
        field_m = null;
    }

    RoundWinnerPhase(MatchScreen param0, MatchProtocol param1) {
        super(param0, param1);
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_n = 200;
        try {
          if (this.matchState.gameMode == 1) {
            this.screen.addOverlay(new FinishOrderOverlay(this.screen), 680);
          } else {
            this.matchState.scoreStandings.update(false);
            this.screen.addOverlay(new TreasureValuesOverlay(this.screen), 680);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bp.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean handleKey(char param0, int param1, int param2) {
        if (param1 != 25) {
          this.update(68, false);
        }
        return false;
    }

    final void update(int param0, boolean param1) {
        int var3 = 0;
        if (param0 != 80) {
          this.handleKey('￦', 110, -67);
        }
        if (0 >= this.field_n) {
        } else {
          this.field_n = this.field_n - 1;
          if (this.field_n == 0) {
            var3 = this.matchState.getMatchWinner((byte) 98);
            if (-1 != var3) {
              this.screen.showMatchResult(var3, 85);
            } else {
              this.screen.startNextRound((byte) -115);
            }
          }
        }
    }

    static {
        field_o = "Choosing Now";
    }
}
