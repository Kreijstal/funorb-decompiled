/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gg extends be {
    int field_K;
    static Random field_A;
    int field_H;
    int field_z;
    static int field_B;
    static w field_y;
    int field_I;
    int field_F;
    int field_C;
    static String field_E;
    static w field_G;

    final static lm a(pi[] param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        byte[][] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        lm stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        lm stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.length != 256) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                if (param1 > 48) {
                  break L1;
                } else {
                  gg.c(-68);
                  break L1;
                }
              }
              var26 = new int[256];
              var21 = var26;
              var16 = var21;
              var11 = var16;
              var10 = var11;
              var3_array = var10;
              var27 = new int[256];
              var22 = var27;
              var17 = var22;
              var12 = var17;
              var4 = var12;
              var28 = new int[256];
              var23 = var28;
              var18 = var23;
              var13 = var18;
              var5 = var13;
              var29 = new int[256];
              var24 = var29;
              var19 = var24;
              var14 = var19;
              var6 = var14;
              var30 = new byte[256][];
              var25 = var30;
              var20 = var25;
              var15 = var20;
              var7 = var15;
              var8 = 0;
              L2: while (true) {
                if (256 <= var8) {
                  stackOut_9_0 = new lm(param2, var26, var27, var28, var29, var30);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var10[var8] = param0[var8].field_d;
                  var4[var8] = param0[var8].field_c;
                  var5[var8] = param0[var8].field_b;
                  var6[var8] = param0[var8].field_i;
                  var7[var8] = param0[var8].field_k;
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("gg.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    final static int b(int param0, int param1) {
        return 5 * ((param0 - -1) * param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        uh.a(-9074);
        hk.f(param3, param0, param2, param4);
    }

    public static void c(int param0) {
        field_E = null;
        field_A = null;
        field_G = null;
        field_y = null;
        if (param0 != 0) {
            gg.c(-109);
        }
    }

    gg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new Random();
        field_E = "Disruptive behaviour";
    }
}
