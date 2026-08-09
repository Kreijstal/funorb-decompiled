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
        lm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
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
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if ((param0.length ^ -1) != -257) {
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
              var16 = new int[256];
              var11 = var16;
              var10 = var11;
              var3 = var10;
              var17 = new int[256];
              var12 = var17;
              var4 = var12;
              var18 = new int[256];
              var13 = var18;
              var5 = var13;
              var19 = new int[256];
              var14 = var19;
              var6 = var14;
              var20 = new byte[256][];
              var15 = var20;
              var7 = var15;
              var8 = 0;
              L2: while (true) {
                L3: {
                  if (256 <= var8) {
                    break L3;
                  } else {
                    var10[var8] = param0[var8].field_d;
                    var4[var8] = param0[var8].field_c;
                    var5[var8] = param0[var8].field_b;
                    var6[var8] = param0[var8].field_i;
                    var7[var8] = param0[var8].field_k;
                    var8++;
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_10_0 = new lm(param2, var16, var17, var18, var19, var20);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("gg.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final static int b(int param0, int param1) {
        if (param1 != 27935) {
            return 72;
        }
        return 5 * ((param0 - -1) * param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        uh.a(-9074);
        if (param1 != 20763) {
          gg.b(119, 2);
          hk.f(param3, param0, param2, param4);
          return;
        } else {
          hk.f(param3, param0, param2, param4);
          return;
        }
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
        field_A = new Random();
        field_E = "Disruptive behaviour";
    }
}
