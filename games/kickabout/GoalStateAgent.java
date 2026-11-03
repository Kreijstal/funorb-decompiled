/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GoalStateAgent extends MatchAgent {
    static long field_g;
    int goalScorer;
    static String field_h;
    int[] score;
    static String field_i;
    static UiLayoutNode field_k;
    static String field_f;
    int goalCount;
    static int field_l;

    final void readState(CipherPacketBuffer param0, byte param1) {
        if (!ContentTransitionDialog.a(param0, (byte) -39)) {
          return;
        }
        try {
          this.score[0] = hq.a(22531, 7, param0, 0);
          this.score[1] = hq.a(22531, 7, param0, 0);
          this.goalCount = hq.a(22531, 10, param0, 0);
          int var3_int = -57 % ((25 - param1) / 63);
          this.goalScorer = -1 + param0.readBits(2, 59);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ua.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void detectGoal(BallAgent param0, int param1) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (param1 > -116) {
            return;
          }
          if (this.goalCount > 0) {
            this.goalCount = this.goalCount + 1;
            return;
          }
          if (param0.possessorTeam == -1 &&
            param0.pixelX(true) >= 370) {
            if (param0.pixelX(true) > 525) {
              return;
            }
            if (param0.positionY < 0) {
              this.goalCount = 1;
              this.goalScorer = 0;
              return;
            }
            if (param0.positionY <= 88080384) {
              return;
            }
            this.goalCount = 1;
            this.goalScorer = 1;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("ua.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 == -30) {
          field_k = null;
          field_f = null;
          return;
        }
        GoalStateAgent.releaseStatics((byte) 106);
        field_k = null;
        field_f = null;
    }

    public final String toString() {
        return "AgentGoalState\tscore=[" + this.score[0] + "," + this.score[1] + "]\tgoal_count=" + this.goalCount + "\tgoal_scorer=" + this.goalScorer;
    }

    final static IndexedSprite[] a(int param0, int param1, ResourceArchive param2, boolean param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        IndexedSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cu.a(param1, param2, param0, 114)) {
            stackIn_2_0 = null;
            return (IndexedSprite[]) (stackIn_2_0);
          }
          if (param3) {
            field_h = (String) null;
          }
          stackIn_6_0 = NumericDateInputWidget.i((byte) 83);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ua.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void copyStateFrom(byte param0, MatchAgent param1) {
        GoalStateAgent var4 = null;
        GoalStateAgent var3 = null;
        if (param0 >= -52) {
          return;
        }
        try {
          var4 = (GoalStateAgent) (param1);
          var3 = var4;
          this.goalCount = var3.goalCount;
          this.score[0] = var4.score[0];
          this.goalScorer = var3.goalScorer;
          this.score[1] = var4.score[1];
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ua.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int computeChecksum(int param0) {
        int var2 = 0;
        var2 = fj.a(-40, this.score[param0] ^ var2);
        var2 = fj.a(-40, this.score[1] ^ var2);
        var2 = fj.a(-40, var2 ^ this.goalCount);
        var2 = fj.a(-40, var2 ^ this.goalScorer);
        return var2;
    }

    public GoalStateAgent() {
        this.score = new int[2];
        this.goalCount = 0;
    }

    static {
        field_h = "Passwords can only contain letters and numbers";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_f = "Player Name: ";
    }
}
