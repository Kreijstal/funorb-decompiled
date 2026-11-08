/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadSequence {
    static GlowSprite[] field_e;
    private int stepCount;
    static int field_a;
    private int currentStepIndex;
    static java.math.BigInteger field_l;
    private int progressScale;
    static int[] field_b;
    static int field_f;
    static int field_g;
    String statusText;
    float scaledProgress;
    static Sprite[] field_d;
    static String[] instructionsPages;
    private ArchiveLoadStep[] steps;

    final static void c(int param0, int param1) {
        CipherPacketBuffer var2 = JaggrabDownloader.field_j;
        var2.writeCipheredOpcode(false, param0);
        if (param1 == 100) {
          var2.writeByte(1, false);
          var2.writeByte(0, false);
          return;
        }
    }

    private final void updateStepProgress(ArchiveLoadStep param0, boolean param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var5 = (String) null;
            ArchiveLoadSequence.a((String) null, (String) null, (String) null, 64, -116, 103);
          }
          var4_float = (float)param2 / 100.0f + (float)(this.currentStepIndex + 1);
          this.scaledProgress = (float)this.progressScale * var4_float / (float)(1 + this.stepCount);
          if (param2 == 0) {
            this.statusText = param0.waitingText;
            return;
          }
          this.statusText = param0.loadingText + " - " + param2 + "%";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("rb.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 > 102) {
          instructionsPages = null;
          field_e = null;
          field_b = null;
          field_d = null;
          field_l = null;
          return;
        }
        ArchiveLoadSequence.releaseStatics((byte) 33);
        instructionsPages = null;
        field_e = null;
        field_b = null;
        field_d = null;
        field_l = null;
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    final boolean pollLoaded(byte param0) {
        ArchiveLoadStep var2;
        int var3;
        ArchiveLoadStep var4;
        var3 = Pool.field_O;
        while (this.stepCount > this.currentStepIndex) {
          var4 = this.steps[this.currentStepIndex];
          var2 = var4;
          if (!var4.archive.isIndexReady(-114)) {
            this.updateStepProgress(var4, false, 0);
            return false;
          }
          if (0 <= var4.groupId &&
            !var4.archive.loadGroup(var4.groupId, (byte) -114)) {
            this.updateStepProgress(var2, false, var4.archive.getGroupProgress(-29867, var4.groupId));
            return false;
          }
          if (var4.groupName != null &&
            !var4.archive.ensureGroupAvailableByName(var4.groupName, 0)) {
            this.updateStepProgress(var2, false, var4.archive.getGroupProgressByName(100, var4.groupName));
            return false;
          }
          if (var4.groupId < 0 &&
            var4.groupName == null &&
            var4.loadingText != null &&
            !var4.archive.ensureAllGroupsAvailable(-63)) {
            this.updateStepProgress(var2, false, var4.archive.getOverallProgress(0));
            return false;
          }
          this.currentStepIndex = this.currentStepIndex + 1;
        }
        if (param0 > -44) {
        }
        return true;
    }

    final static void a(String param0, String param1, String param2, int param3, int param4, int param5) {
        try {
          if (null == LobbyGame.field_Vb) {
            MessageDialog.o((byte) -125);
          }
          int var6_int = 102 % ((-49 - param3) / 58);
          ScreenProjectionSupport.field_a = param5;
          NanoTickClock.field_t.text = param2;
          EmailAvailabilityValidator.field_n = param4;
          rl.field_b.text = param1;
          LobbyGame.field_Vb.text = param0;
          FreePlayRules.c((byte) -86);
          GzipDecoder.field_h = true;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "rb.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static LobbyGame a(int param0, int param1) {
        int var2 = 8 / ((73 - param1) / 46);
        return lf.field_a == null ? null : (LobbyGame) (lf.field_a.findFirst((long)param0, false));
    }

    private ArchiveLoadSequence() throws Throwable {
        throw new Error();
    }

    static {
        field_l = new java.math.BigInteger("65537");
        instructionsPages = new String[]{"The object of eight-ball pool is to pot the 8 ball (the black ball) after you have potted all the balls in your group. You start by breaking, then players take it in turns to try and pot a ball. The first ball (a spot or stripe) you pot without fouling determines your group. If you legally pot a ball on your shot, your \"visit\" continues with another shot. Once you have potted all of your balls, you may pot the 8 ball to win the game.", "<col=ffffff>A foul is any one of the following:</col><br><img=16> Potting the 8 ball and any other ball in the same shot (loses the game).<br><img=16> Potting one of your opponent's balls.<br><img=16> Potting the cue ball.<br><img=16> Hitting the 8 ball or one of your opponent's balls first (with the cue ball).<br><img=16> Failing to hit any ball at all (with the cue ball).<br><img=16> Failing to take your shot in the time limit.", "On conceding a foul, your opponent will get an extra visit. If you have an extra visit and pot a ball, you will still have that extra visit. <br><br><col=ffffff>Special cases</col>:<br>If you foul and leave your opponent snookered (meaning they cannot hit one of their own balls directly), they will get a ball-in-hand (they can move the cue ball anywhere behind the head string). If you foul on break, your opponent gets to break again, and has an extra visit. ", "The objective of nine-ball pool is to pot the 9 ball. You must always hit the lowest ball on the table first (with the cue ball) or that is a foul. You may pot the 9 ball on any shot in the game to win, but if you pot it and foul, you lose! On a foul, your opponent does not get any extra shots, however, they get a ball-in-hand, and may move the cue ball anywhere on the table.", "The objective of the time trial is to pot all of the object balls and the black ball last. There are no groups assigned, so you may pot spots and stripes in any order. Hitting the black first, or potting the cue ball is a foul. Fouls incur a 15-second time penalty. Pot the balls as fast as you can to earn a place on the Highscores table!", "Killer Pool is a simple elimination game for two to eight players. Each player takes a single shot in turn, except when breaking – that player has a free shot to break. You start with 3 lives: <br><img=16> If you fail to pot a ball on your shot, you lose a life! <br><img=16> If you pot the cue ball or fail to hit any balls, you lose a life (or another life, if you failed to pot a ball as well)! <br><img=16> If you pot the black, you gain an extra life! <br>Run out of lives and you are out of the game. If all the balls are potted and there are players still in the game, the balls are re-racked and play continues with another break. ", "<img=2> or <img=9>+<img=0>: Rotate view.<br><img=0> Click on table to look at that point.<br><img=0> Drag the cue ball to move it (when allowed).<br><img=0> Click on the cue ball to enter shot mode.<br><img=4>: Enter shot mode.<br><img=6>/<img=5> or <img=13>/<img=15>: Adjust aim.<br><img=8>/<img=7> or <img=12>/<img=14>: Adjust power.<br><img=1>, or <img=11>+<img=0>: Zoom.", "<img=2> or <img=9>+<img=0>: Aim cue<br><img=0> Click on the table to look at that point and leave shot mode.<br><img=0> Drag the cue ball to move it (when allowed) and leave shot mode.<br><img=0> Click on the cue ball to take your shot.<br><img=4>: Switch out of shot mode to top-view.<br><img=6>/<img=5> or <img=13>/<img=15>: Adjust aim.<br><img=8>/<img=7> or <img=12>/<img=14>: Adjust power.<br><img=1>, or <img=11>+<img=0>: Set power.", "<img=16> When the cue ball is against a cushion, you will only be able to hit the top of the ball, unless you angle the cue downwards.<br><img=16> Use <img=4> repeatedly to switch between top-view and shot mode to help line up your shot.<br><img=16> Try to plan your shots ahead to think about where the balls will end up for your next shot.<br>", "<img=16> <col=ffffff>Visit</col>: One turn at the table, which may be several shots. <br><img=16> <col=ffffff>Perfect break</col>: Having potted no balls before in the game, potting all of your balls and winning the game in one visit (without missing a shot).<br><img=16> <col=ffffff>Cover</col>: When your ball is very close to a pocket so it's difficult or impossible for your opponent to pot in it without potting yours.<br><img=16> <col=ffffff>Snooker</col>: When you cannot hit any target ball directly without fouling.<br><img=16> <col=ffffff>Plant</col>: Hitting a ball which hits another ball into a pocket (a chain reaction).<br><img=16> <col=ffffff>Head string</col>: The line going across the table that the cue ball initially sits on."};
    }
}
