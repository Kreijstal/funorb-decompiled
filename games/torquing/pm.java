/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm extends q {
    rc[] field_u;
    int[] field_q;
    byte[][][] field_o;
    rc[] field_n;
    int field_l;
    static int[] field_s;
    static String field_p;
    static long field_r;
    static sm[] field_m;
    int[] field_k;
    int[] field_t;
    int field_j;

    final static void a(kh param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        short[] var11 = null;
        short[] var12 = null;
        mp var13 = null;
        byte[] var14 = null;
        short[] var15 = null;
        rm var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        short[] var22 = null;
        short[] var23 = null;
        byte[] var24 = null;
        short[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        short[] var31 = null;
        short[] var32 = null;
        byte[] var33 = null;
        short[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        byte[] var38 = null;
        byte[] var39 = null;
        short[] var40 = null;
        short[] var41 = null;
        byte[] var42 = null;
        short[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        byte[] var47 = null;
        byte[] var48 = null;
        short[] var49 = null;
        short[] var50 = null;
        byte[] var51 = null;
        short[] var52 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var16 = param0.field_l;
            L1: {
              if (param2 + var16.field_g <= var16.field_o.length) {
                break L1;
              } else {
                var4 = var16.field_g;
                var5 = 3 * (param2 + var4) / 2;
                var44 = new int[var5];
                var35 = var44;
                var26 = var35;
                var17 = var26;
                var6 = var17;
                var45 = new int[var5];
                var36 = var45;
                var27 = var36;
                var18 = var27;
                var7 = var18;
                var46 = new int[var5];
                var37 = var46;
                var28 = var37;
                var19 = var28;
                var8 = var19;
                var47 = new byte[var5];
                var38 = var47;
                var29 = var38;
                var20 = var29;
                var9 = var20;
                var48 = new byte[var5];
                var39 = var48;
                var30 = var39;
                var21 = var30;
                var10 = var21;
                var49 = new short[var5];
                var40 = var49;
                var31 = var40;
                var22 = var31;
                var11 = var22;
                dk.a(var16.field_o, 0, var44, 0, var4);
                var50 = new short[var5];
                var41 = var50;
                var32 = var41;
                var23 = var32;
                var12 = var23;
                dk.a(var16.field_y, 0, var45, 0, var4);
                dk.a(var16.field_q, 0, var46, 0, var4);
                dk.a(var16.field_j, 0, var47, 0, var4);
                dk.a(var16.field_D, 0, var48, 0, var4);
                dk.a(var16.field_m, 0, var49, 0, var4);
                dk.a(var16.field_A, 0, var50, 0, var4);
                var16.field_q = var8;
                var16.field_y = var7;
                var16.field_m = var11;
                var16.field_j = var9;
                var16.field_D = var10;
                var16.field_o = var6;
                var16.field_A = var12;
                var13 = param0.field_q;
                if (var13.field_u == null) {
                  break L1;
                } else {
                  var51 = new byte[var5];
                  var42 = var51;
                  var33 = var42;
                  var24 = var33;
                  var14 = var24;
                  var52 = new short[var5];
                  var43 = var52;
                  var34 = var43;
                  var25 = var34;
                  var15 = var25;
                  dk.a(var13.field_u, 0, var51, 0, var4);
                  dk.a(var13.field_q, 0, var52, 0, var4);
                  var13.field_u = var14;
                  var13.field_q = var15;
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("pm.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + -27226 + 44 + param2 + 41);
        }
    }

    final static void a(byte param0) {
        if (param0 < 73) {
            return;
        }
        int discarded$0 = 84;
        oh.a();
    }

    public static void a() {
        field_p = null;
        field_s = null;
        field_m = null;
    }

    pm() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Please wait...";
        field_s = new int[8192];
    }
}
