/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends ms {
    static String field_t;
    int field_u;
    int field_n;
    static float[] field_l;
    int field_s;
    static lg field_o;
    static float[] field_k;
    int field_p;
    int field_r;
    int field_q;
    static int[] field_m;

    final static nj[] a(int param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        nj[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        nj[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          stackIn_4_0 = (0 != param1[param1.length - 1]) ? 0 : 1;
          var2_int = stackIn_4_0;
          if (var2_int != 0) {
            stackIn_7_0 = param1.length;
          } else {
            stackIn_7_0 = param1.length + 1;
          }
          var3 = new nj[stackIn_7_0];
          var4 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < param1.length; var4Lifetime1++) {
            var3[var4Lifetime1] = new nj(param1[var4Lifetime1], 2);
          }
          if (var4Lifetime1 < var3.length) {
            var3[var4Lifetime1] = new nj(0, 2);
          }
          var5 = 34 / ((57 - param0) / 53);
          stackIn_14_0 = var3;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("hg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_l = null;
        if (param0 != 12) {
          int[] var2 = (int[]) null;
          hg.a(-33, (int[]) null);
        }
        field_t = null;
        field_k = null;
        field_o = null;
    }

    hg(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_n = param4;
        this.field_r = param2;
        this.field_s = param3;
        this.field_q = param1;
        this.field_u = param0;
        this.field_p = param5;
    }

    static {
        int var2 = 0;
        field_t = "Play the game without logging in just yet";
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
