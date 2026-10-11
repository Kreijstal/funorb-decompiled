/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends oha {
    static int[][] field_m;
    static String field_p;
    int field_r;
    int field_q;
    static kv field_o;
    static kv[] field_n;

    public static void c(int param0) {
        field_p = null;
        field_m = (int[][]) null;
        field_n = null;
        field_o = null;
        if (param0 != 16763049) {
          a.a(-43, -100, -66, 126);
        }
    }

    final static int[] a(int param0, int param1, int param2, int param3) {
        int var20 = 0;
        int var21 = BachelorFridge.field_y;
        int[] var24 = new int[param1];
        int[] var23 = var24;
        int[] var22 = var23;
        int[] var4 = var22;
        int var5 = 255 & param0 >> 16;
        int var6 = (param0 & 65280) >> 8;
        int var7 = param0 & 255;
        double var8 = (double)(((param3 & 16711680) >> 16) - var5) / (double)param1;
        double var10 = (double)((255 & param3 >> 8) - var6) / (double)param1;
        var24[0] = param0;
        double var12 = (double)((255 & param3) - var7) / (double)param1;
        var22[param1 - 1] = param3;
        double var14 = (double)var5;
        double var16 = (double)var6;
        double var18 = (double)var7;
        for (var20 = 1; -1 + param1 > var20; var20++) {
          var14 = var14 + var8;
          var18 = var18 + var12;
          var16 = var16 + var10;
          var22[var20] = mp.a(mp.a(dda.a((int)Math.round(var14) << 16, 16763049), dda.a((int)Math.round(var16), -1526726401) << 8), dda.a(255, (int)Math.round(var18)));
        }
        if (param2 == 16763049) {
          return var4;
        }
        a.c(-96);
        return var4;
    }

    a(int param0, int param1, int param2, String param3, String param4, int param5, int param6, int param7) {
        super(3, param0, param1, param2, param5, 0);
        try {
          this.field_q = param7;
          this.field_k = param4;
          this.field_r = param6;
          this.field_f = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "a.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_p = "Use this alternative as your account name";
    }
}
