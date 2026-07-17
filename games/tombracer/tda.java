/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tda extends jg {
    private int[] field_c;
    static String field_b;

    final static int a(int param0, int param1) {
        param1 = (param1 & 1431655765) + ((-1431655765 & param1) >>> 1);
        param1 = (param1 & 858993459) + (param1 >>> 2 & -1288490189);
        param1 = param1 - -(param1 >>> 4) & 252645135;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        int var2 = 1 % ((-12 - param0) / 44);
        return param1 & 255;
    }

    public static void c() {
        int var1 = 0;
        field_b = null;
    }

    tda(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((tda) this).field_c = new int[512];
        Random var7 = new Random((long)param0);
        Random var2 = var7;
        for (var3 = 0; var3 < 256; var3++) {
            ((tda) this).field_c[var3 + 256] = var3;
            ((tda) this).field_c[var3] = var3;
        }
        int var8 = 0;
        var3 = var8;
        while (256 > var8) {
            var4 = 255 & var7.nextInt();
            var5 = ((tda) this).field_c[var4];
            ((tda) this).field_c[var4 - -256] = ((tda) this).field_c[var8];
            ((tda) this).field_c[var4] = ((tda) this).field_c[var8];
            ((tda) this).field_c[256 + var8] = var5;
            ((tda) this).field_c[var8] = var5;
            var8++;
        }
    }

    final void a(float param0, float param1, float param2, int param3, float[] param4, float param5, int param6, int param7, int param8, int param9, int param10) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        float var35 = 0.0f;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var40 = 0.0f;
        int var41 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var41 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var12_int = (int)((float)param10 * param2 - 1.0f);
            var12_int = var12_int & 255;
            var13 = (int)(-1.0f + (float)param8 * param5);
            var13 = var13 & 255;
            var14 = (int)(-1.0f + param1 * (float)param3);
            var14 = var14 & 255;
            var15 = param1 * (float)param9;
            var16 = (int)var15;
            var17 = var16 + 1;
            var18 = var15 - (float)var16;
            var19 = -var18 + (float)param6;
            var17 = var17 & var14;
            var20 = nk.a((byte) 14, var18);
            var16 = var16 & var14;
            var21 = ((tda) this).field_c[var16];
            var22 = ((tda) this).field_c[var17];
            var23 = 0;
            L1: while (true) {
              if (param8 <= var23) {
                break L0;
              } else {
                var24 = param5 * (float)var23;
                var25 = (int)var24;
                var26 = 1 + var25;
                var27 = var24 - (float)var25;
                var28 = -var27 + 1.0f;
                var29 = nk.a((byte) 14, var27);
                var26 = var26 & var13;
                var25 = var25 & var13;
                var30 = ((tda) this).field_c[var21 + var25];
                var31 = ((tda) this).field_c[var21 + var26];
                var32 = ((tda) this).field_c[var25 + var22];
                var33 = ((tda) this).field_c[var22 + var26];
                var34 = 0;
                L2: while (true) {
                  if (param10 <= var34) {
                    var23++;
                    continue L1;
                  } else {
                    var35 = (float)var34 * param2;
                    var36 = (int)var35;
                    var37 = 1 + var36;
                    var38 = var35 - (float)var36;
                    var39 = -var38 + 1.0f;
                    var37 = var37 & var12_int;
                    var40 = nk.a((byte) 14, var38);
                    var36 = var36 & var12_int;
                    int incrementValue$1 = param7;
                    param7++;
                    param4[incrementValue$1] = lr.a(var20, 5122, lr.a(var29, 5122, lr.a(var40, 5122, hp.a(var18, var27, (byte) 26, var38, sea.c(((tda) this).field_c[var33 + var37], 7)), hp.a(var18, var27, (byte) 26, var39, sea.c(((tda) this).field_c[var33 + var36], 7))), lr.a(var40, kha.b(param6, 5123), hp.a(var18, var28, (byte) 26, var38, sea.c(((tda) this).field_c[var37 - -var32], 7)), hp.a(var18, var28, (byte) 26, var39, sea.c(7, ((tda) this).field_c[var32 + var36])))), lr.a(var29, 5122, lr.a(var40, 5122, hp.a(var19, var27, (byte) 26, var38, sea.c(((tda) this).field_c[var31 + var37], 7)), hp.a(var19, var27, (byte) 26, var39, sea.c(7, ((tda) this).field_c[var31 + var36]))), lr.a(var40, 5122, hp.a(var19, var28, (byte) 26, var38, sea.c(((tda) this).field_c[var37 - -var30], 7)), hp.a(var19, var28, (byte) 26, var39, sea.c(((tda) this).field_c[var30 + var36], 7))))) * param0;
                    var34++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var12 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var12;
            stackOut_8_1 = new StringBuilder().append("tda.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 41);
        }
    }

    final static void a() {
        ara.field_xb = 0;
        sd.field_K = 200;
        wea.field_d = new gqa[3000];
        baa.field_b = new int[3];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "4th";
    }
}
