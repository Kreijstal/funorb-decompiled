/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq extends IntrusiveNode {
    private int field_l;
    private int field_p;
    static String field_n;
    private int field_m;
    static String field_o;
    static String field_s;
    private IntrusiveNode field_q;
    static int field_k;
    private String field_r;

    final static boolean c(byte param0) {
        int var1 = 52 / ((-9 - param0) / 42);
        if (!fs.a(false)) {
          return false;
        }
        if ((uk.field_n & 8) == 0) {
          return true;
        }
        return false;
    }

    final static String defeatPlayerWithMetricsForConsole(int damageTaken, byte obfuscationGuard, int playerId, int turnsTaken) {
        int guardQuotient = -110 / ((obfuscationGuard + 76) / 36);
        GameplayController controller = rd.gameplayController;
        if (controller == null) {
          return "No game in progress.";
        }
        if (playerId < 0) {
          return "Please choose a player, 0-based.";
        }
        if (controller.battlefield.playerCount >= playerId) {
          controller.battlefield.eliminatePlayer(10001, playerId, false);
          controller.battlefield.playerTurnCounts[controller.controlledPlayerId] = turnsTaken;
          controller.battlefield.damageTakenByPlayer[controller.controlledPlayerId] = damageTaken;
          controller.trackCampaignMetrics(true);
          return "Done.";
        }
        return "Please choose a player, 0-based.";
    }

    final void b(int param0, int param1) {
        int var3;
        if (0 < this.field_m &&
          this.field_l > this.field_m) {
          var3 = (int)(127.0 * (1.0 - Math.cos((double)this.field_m * 3.141592653589793 / (double)(this.field_l / 2))));
          SoftwareRaster.a(-(this.field_p >> 1) + 320, param1 + (-this.field_m - 14), this.field_p, 20, 5, 0, var3);
          rs.field_n.drawCenteredWithAlpha(this.field_r, 320, param1 - this.field_m, 16777215, 0, var3);
        }
        if (null != this.next &&
          this.next != this.field_q &&
          ((sq) (this.next)).field_m > 0) {
          ((sq) (this.next)).b(500, param1);
        }
        if (param0 == 500) {
          return;
        }
        sq.a(false);
    }

    public static void a(boolean param0) {
        field_o = null;
        field_n = null;
        field_s = null;
        if (param0) {
          sq.defeatPlayerWithMetricsForConsole(24, (byte) 101, 43, 1);
        }
    }

    sq(String param0, boolean param1, NodeDeque param2) {
        try {
          this.field_m = 0;
          this.field_r = param0;
          this.field_p = 8 + rs.field_n.textWidth(this.field_r);
          this.field_q = param2.sentinel;
          this.field_l = !param1 ? 128 : 500;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) {
        this.field_m = this.field_m + 1;
        if (this.field_m >= 16 &&
          null != this.next &&
          this.field_q != this.next) {
          ((sq) (this.next)).a((byte) 66);
        }
        if (param0 != 66) {
          sq.c((byte) -116);
        }
        if (this.field_l > this.field_m) {
          return;
        }
        this.unlink(-122);
    }

    static {
        field_o = "Add <%0> to ignore list";
        field_n = "You are invited to <%0>'s game.";
        field_s = "Clone <%0> cannot be used on a level <%1> unit.";
    }
}
