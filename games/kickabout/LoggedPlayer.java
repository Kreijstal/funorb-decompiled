/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoggedPlayer {
    static Sprite[] field_g;
    boolean home;
    int field_c;
    int field_q;
    int field_n;
    private int totalGoals;
    static UiLayoutNode field_r;
    int field_a;
    int field_m;
    static String field_l;
    static String field_k;
    int crosses;
    int field_i;
    private boolean reward;
    private boolean member;
    int resignTime;
    int field_f;
    static String[] field_e;
    int headers;

    public final String toString() {
        StringBuilder var2 = new StringBuilder();
        StringBuilder discarded$0 = var2.append(this.home ? "home" : "away");
        StringBuilder discarded$1 = var2.append(" resigntime=" + this.resignTime);
        StringBuilder discarded$2 = var2.append(" reward=" + this.reward);
        StringBuilder discarded$3 = var2.append(" member=" + this.member);
        StringBuilder discarded$4 = var2.append(" tackles=" + this.field_m + "." + this.field_c + "." + this.field_n + "." + this.field_a);
        StringBuilder discarded$5 = var2.append(" kicks=" + this.field_i + "." + this.field_f + "." + this.field_q);
        StringBuilder discarded$6 = var2.append(" crosses=" + this.crosses);
        StringBuilder discarded$7 = var2.append(" headers=" + this.headers);
        StringBuilder discarded$8 = var2.append(" tot_goals=" + this.totalGoals);
        return "LoggedPlayer{" + var2.toString() + "}";
    }

    final static long a(CharSequence param0, boolean param1) {
        int var5 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          if (param1) {
            LoggedPlayer.a(-79, true);
          }
          var2_long = 0L;
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(var6 + 1 - 65);
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(-97 + (1 + var6));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(27 + (var6 - 48));
              }
            }
            if (177917621779460413L > var2_long) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("jc.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1) {
        if (!param1) {
          field_g = (Sprite[]) null;
        }
        return 2 * param0;
    }

    final void copyFrom(boolean param0, LoggedPlayer param1) {
        this.field_c = param1.field_c;
        this.totalGoals = param1.totalGoals;
        this.member = param1.member;
        this.home = param1.home;
        this.crosses = param1.crosses;
        this.headers = param1.headers;
        this.resignTime = param1.resignTime;
        this.field_a = param1.field_a;
        this.reward = param1.reward;
        this.field_f = param1.field_f;
        this.field_i = param1.field_i;
        this.field_n = param1.field_n;
        this.field_m = param1.field_m;
        if (!param0) {
          return;
        }
        try {
          this.field_q = param1.field_q;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != -3197) {
          field_k = (String) null;
        }
        return TournamentChampionDialog.a(false, PlayerStatSortCriterion.field_o, IntDoubleCommand.field_A);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 48) {
          return;
        }
        field_e = null;
        field_l = null;
        field_g = null;
        field_k = null;
        field_r = null;
    }

    public LoggedPlayer() {
        this.resignTime = -1;
    }

    static {
        field_l = "Shortcut Reference";
        field_k = "Buyout";
        field_e = new String[]{"live feed", "overview", "game stats"};
    }
}
