/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class id {
    static int[][] field_d;
    static String field_c;
    static pa field_b;
    static Random field_a;

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_d = (int[][]) null;
                break L1;
              }
            }
            stackIn_3_0 = df.a(-2184, false, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("id.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static nf a(byte[] param0, ge[] param1, int param2) {
        nf stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if ((param1.length ^ -1) == -257) {
              var16 = new int[param2];
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
              L1: while (true) {
                if (256 <= var8) {
                  stackIn_7_0 = new nf(param0, var16, var17, var18, var19, var20);
                  break L0;
                } else {
                  var10[var8] = param1[var8].field_f;
                  var4[var8] = param1[var8].field_g;
                  var5[var8] = param1[var8].field_b;
                  var6[var8] = param1[var8].field_a;
                  var7[var8] = param1[var8].field_k;
                  var8++;
                  continue L1;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("id.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(boolean param0) {
        field_d = (int[][]) null;
        field_a = null;
        if (param0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = TorChallenge.field_F ? 1 : 0;
        try {
            hl.field_b.a(65280);
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                cj.field_l[var1_int] = 0L;
            }
            for (var1_int = 0; (var1_int ^ -1) > -33; var1_int++) {
                ij.field_A[var1_int] = 0L;
            }
            if (param0 < 45) {
                field_c = (String) null;
            }
            k.field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "id.D(" + param0 + ')');
        }
    }

    static {
        field_d = (int[][]) null;
        field_c = "Create";
        field_a = new Random();
    }
}
