/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FinishOrderOverlay extends MatchOverlay {
    FinishOrderOverlay(MatchScreen param0) {
        super(param0);
    }

    final void update(byte param0) {
        if (param0 >= -107) {
          return;
        }
    }

    final boolean pausesGame(boolean param0) {
        if (!param0) {
          this.pausesGame(true);
          return false;
        }
        return false;
    }

    final void draw(byte param0) {
        int var11 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        int var14;
        int var13;
        var14 = TombRacer.field_G ? 1 : 0;
        var2 = (aaa.a(false) - SwitchLinkList.b(0) / 2) / 2;
        if (param0 >= -13) {
          return;
        }
        var3 = (SwitchLinkList.b(0) + 130) / 2;
        var4 = this.field_i.getViewedPlayerIndex(93);
        var5 = 10309393;
        var6 = 11184810;
        var7 = 20;
        var8 = var7 * this.field_g.playersRemaining + 50;
        var9 = var3;
        var10 = 40 + var9;
        PlayerViewport.a(var8, 300, (byte) 65, -150 + var2, aq.field_a, var9 - 16);
        MembersUpsellMenu.a(PowerUpItemBehaviour.field_v.toUpperCase(), 16777215, qf.field_j, -1, 4 + var9, var2, 0);
        for (var11 = 0; this.field_g.standings.order.length > var11; var11++) {
          var12 = this.field_g.standings.order[var11];
          if (var12 != -1) {
            if (var12 == var4) {
              var13 = var5;
            } else {
              var13 = var6;
            }
            if (this.field_g.simulations[var12].isFinished(0)) {
              MembersUpsellMenu.a((dta.field_b[var11] + "  " + this.field_i.getPlayerName(var12, false) + "  " + dea.a(this.field_g.simulations[var12].tick, (byte) -8)).toUpperCase(), var13, qf.field_j, -1, var7 * var11 + var10, var2, 0);
            } else {
              if (!this.field_g.simulations[var12].hasTimedOut(-31170) &&
                this.field_i.matchState.getRoundWinner(2) < 0) {
                MembersUpsellMenu.a((dta.field_b[var11] + "  ...").toUpperCase(), 16777215, qf.field_j, -1, var11 * var7 + var10, var2, 0);
                return;
              }
              MembersUpsellMenu.a((re.field_b + "  " + this.field_i.getPlayerName(var12, false)).toUpperCase(), var13, qf.field_j, -1, var10 + var11 * var7, var2, 0);
            }
          }
        }
    }

    final boolean handleKey(int param0, char param1, byte param2) {
        int var4 = 42 / ((param2 - 29) / 57);
        return false;
    }

    static {
    }
}
