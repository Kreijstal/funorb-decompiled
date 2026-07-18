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
        field_m = null;
        field_n = null;
        field_o = null;
        if (param0 != 16763049) {
            int[] discarded$0 = a.a(-43, -100, -66, 126);
        }
    }

    final static int[] a(int param0, int param1, int param2, int param3) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var21 = BachelorFridge.field_y;
        var26 = new int[param1];
        var25 = var26;
        var24 = var25;
        var23 = var24;
        var22 = var23;
        var4 = var22;
        var5 = 255 & param0 >> 16;
        var6 = (param0 & 65280) >> 8;
        var7 = param0 & 255;
        var8 = (double)(((param3 & 16711680) >> 16) - var5) / (double)param1;
        var10 = (double)((255 & param3 >> 8) + -var6) / (double)param1;
        var26[0] = param0;
        var12 = (double)((255 & param3) - var7) / (double)param1;
        var22[param1 - 1] = param3;
        var14 = (double)var5;
        var16 = (double)var6;
        var18 = (double)var7;
        var20 = 1;
        L0: while (true) {
          if (-1 + param1 <= var20) {
            if (param2 != 16763049) {
              a.c(-96);
              return var4;
            } else {
              return var4;
            }
          } else {
            var14 = var14 + var8;
            var18 = var18 + var12;
            var16 = var16 + var10;
            var22[var20] = mp.a(mp.a(dda.a((int)Math.round(var14) << 16, 16763049), dda.a((int)Math.round(var16), -1526726401) << 8), dda.a(255, (int)Math.round(var18)));
            var20++;
            continue L0;
          }
        }
    }

    a(int param0, int param1, int param2, String param3, String param4, int param5, int param6, int param7) {
        super(3, param0, param1, param2, param5, 0);
        try {
            ((a) this).field_q = param7;
            ((a) this).field_k = param4;
            ((a) this).field_r = param6;
            ((a) this).field_f = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "a.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Use this alternative as your account name";
    }
}
