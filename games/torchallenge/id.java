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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_d = (int[][]) null;
          }
          stackIn_3_0 = df.a(-2184, false, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("id.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static nf a(byte[] param0, ge[] param1, int param2) {
        int var8 = 0;
        nf stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
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
          if (param1.length != 256) {
            throw new IllegalArgumentException();
          }
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
          for (var8 = 0; 256 > var8; var8++) {
            var10[var8] = param1[var8].field_f;
            var4[var8] = param1[var8].field_g;
            var5[var8] = param1[var8].field_b;
            var6[var8] = param1[var8].field_a;
            var7[var8] = param1[var8].field_k;
          }
          stackIn_7_0 = new nf(param0, var16, var17, var18, var19, var20);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("id.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
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
        int var1_intLifetime1;
        try {
          hl.field_b.a(65280);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            cj.field_l[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            ij.field_A[var1_intLifetime1] = 0L;
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
