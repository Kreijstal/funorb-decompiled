/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameProgressUpdate extends IntrusiveNode {
    static String playTheGameWithoutText;
    int eventType;
    int field_n;
    static float[] field_l;
    int field_s;
    static lg field_o;
    static float[] field_k;
    int field_p;
    int field_r;
    int eventValue;
    static int[] field_m;

    final static RendererPreference[] rendererPreferences(int guard, int[] backends) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RendererPreference[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        RendererPreference[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          stackIn_4_0 = (0 != backends[backends.length - 1]) ? 0 : 1;
          var2_int = stackIn_4_0;
          if (var2_int != 0) {
            stackIn_7_0 = backends.length;
          } else {
            stackIn_7_0 = backends.length + 1;
          }
          var3 = new RendererPreference[stackIn_7_0];
          var4 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < backends.length; var4Lifetime1++) {
            var3[var4Lifetime1] = new RendererPreference(backends[var4Lifetime1], 2);
          }
          if (var4Lifetime1 < var3.length) {
            var3[var4Lifetime1] = new RendererPreference(0, 2);
          }
          var5 = 34 / ((57 - guard) / 53);
          stackIn_14_0 = var3;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("hg.A(").append(guard).append(',');
          if (backends == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_m = null;
        field_l = null;
        if (param0 != 12) {
          int[] var2 = (int[]) null;
          GameProgressUpdate.rendererPreferences(-33, (int[]) null);
        }
        playTheGameWithoutText = null;
        field_k = null;
        field_o = null;
    }

    GameProgressUpdate(int type, int value, int param2, int param3, int param4, int param5) {
        this.field_n = param4;
        this.field_r = param2;
        this.field_s = param3;
        this.eventValue = value;
        this.eventType = type;
        this.field_p = param5;
    }

    static {
        int var2 = 0;
        playTheGameWithoutText = "Play the game without logging in just yet";
        field_k = new float[16384];
        field_l = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
          field_k[var2] = (float)Math.sin((double)var2 * var0);
          field_l[var2] = (float)Math.cos(var0 * (double)var2);
        }
        field_m = new int[1];
    }
}
