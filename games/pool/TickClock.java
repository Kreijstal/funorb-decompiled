/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TickClock {
    static int[] field_d;
    static String mpYouofferrematch;
    static String gameopt1moreratedgame;
    static vh field_h;
    static String loadingFonts;
    static int field_e;
    static String secretachievement;
    static vh field_i;
    static int[] field_g;

    final static int a(int param0, LoginTextValue param1, LoginTextValue param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 9539) {
            TickClock.a((byte) -60);
          }
          var4 = (String) null;
          stackIn_3_0 = ih.a((String) null, (byte) 107, 0, false, param2, param1, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    abstract void resetTiming(byte param0);

    final int waitAndAdvance(long param0, byte param1) {
        long var4 = 0L;
        long var4Lifetime1;
        if (param1 == 39) {
          var4 = this.delayMillis(31);
          if (0L < var4) {
            cf.a(param1 ^ -124, var4);
          }
          return this.advanceTicks(param0, (byte) 113);
        }
        this.waitAndAdvance(1L, (byte) 114);
        var4Lifetime1 = this.delayMillis(31);
        if (0L < var4Lifetime1) {
          cf.a(param1 ^ -124, var4Lifetime1);
        }
        return this.advanceTicks(param0, (byte) 113);
    }

    final static void a(byte param0, PcmSampleStream param1) {
        try {
          int var2_int = 59 % ((param0 + 75) / 33);
          qf.field_d.a(param1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "kb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        mpYouofferrematch = null;
        loadingFonts = null;
        field_d = null;
        field_h = null;
        secretachievement = null;
        field_g = null;
        gameopt1moreratedgame = null;
        field_i = null;
        if (param0 != 111) {
          LoginTextValue var2 = (LoginTextValue) null;
          TickClock.a(-28, (LoginTextValue) null, (LoginTextValue) null);
        }
    }

    abstract long delayMillis(int param0);

    final static re a(boolean param0, String param1, int param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        re stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          if (param2 != -5790) {
            mpYouofferrematch = (String) null;
          }
          var6 = null;
          if (param1.indexOf('@') != -1) {
            var6 = param1;
          } else {
            var7 = (CharSequence) ((Object) param1);
            var4_long = td.a((byte) 52, var7);
          }
          stackIn_6_0 = bi.a(var4_long, param2 - 10805, param3, param0, (String) (var6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("kb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    abstract int advanceTicks(long param0, byte param1);

    static {
        mpYouofferrematch = "You are offering a rematch.";
        field_d = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        loadingFonts = "Loading fonts";
        gameopt1moreratedgame = "You need to play 1 more rated game to unlock this option.";
        secretachievement = "Secret achievement";
    }
}
