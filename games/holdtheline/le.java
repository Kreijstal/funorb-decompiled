/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le extends rd {
    static float[] field_s;
    private int[] field_q;
    static e field_u;
    static int field_r;
    static int[][] field_o;
    static ah field_n;
    static String field_p;
    static int field_t;
    static hj field_m;

    le(int param0, float param1, int[] param2) {
        try {
          this.field_c = param0 / 2;
          this.field_h = param0 - this.field_c;
          this.field_q = param2;
          this.field_i = this.field_q.length;
          this.field_k = (float)this.field_i * param1;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "le.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_s = null;
        field_u = null;
        field_m = null;
        field_p = null;
        if (!param0) {
          return;
        }
        field_o = (int[][]) null;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        float var12Lifetime1;
        float var13Lifetime1;
        float var14Lifetime1;
        float var15Lifetime1;
        int var16Lifetime1;
        var17 = HoldTheLine.field_D;
        try {
          var18 = new int[param3.length + param0.length];
          var20 = var18;
          var19 = var20;
          var5 = var19;
          for (var6 = 0; param0.length > var6; var6++) {
            var18[var6] = param0[var6];
          }
          if (param2 > -49) {
            return;
          }
          for (var6Lifetime1 = 0; param3.length / 2 > var6Lifetime1; var6Lifetime1++) {
            var5[param0.length + var6Lifetime1 * 2] = param3[-2 + (param3.length - 2 * var6Lifetime1)];
            var5[param0.length + 2 * var6Lifetime1 + 1] = param3[-(var6Lifetime1 * 2) + (param3.length - 1)];
          }
          var7 = this.field_q[param1 % this.field_i];
          if (var7 == 0) {
            return;
          }
          gf.a(var20, var7);
          var8 = param0[0];
          var9 = param0[1];
          for (var6Lifetime2 = 2; param0.length > var6Lifetime2; var6Lifetime2 += 2) {
            var10 = param0[var6Lifetime2];
            var11 = param0[1 + var6Lifetime2];
            var12 = (float)(var10 - var8);
            var13 = (float)(-var9 + var11);
            var14 = (float)Math.sqrt((double)(var12 * var12 + var13 * var13));
            var13 = var13 / var14;
            var12 = var12 / var14;
            var15 = (var12 - var13 + 4.0f) * 0.25f;
            var16 = lk.a(var15, -1, var7);
            tc.d(var8, var9, var10, var11, var16);
            var9 = var11;
            var8 = var10;
          }
          var9Lifetime1 = param3[1];
          var8Lifetime1 = param3[0];
          for (var6Lifetime3 = 2; var6Lifetime3 < param3.length; var6Lifetime3 += 2) {
            var10Lifetime1 = param3[var6Lifetime3];
            var11Lifetime1 = param3[var6Lifetime3 + 1];
            var12Lifetime1 = (float)(var10Lifetime1 - var8Lifetime1);
            var13Lifetime1 = (float)(var11Lifetime1 - var9Lifetime1);
            var14Lifetime1 = (float)Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1));
            var12Lifetime1 = var12Lifetime1 / var14Lifetime1;
            var13Lifetime1 = var13Lifetime1 / var14Lifetime1;
            var15Lifetime1 = (4.0f - var12Lifetime1 + var13Lifetime1) * 0.25f;
            var16Lifetime1 = lk.a(var15Lifetime1, -1, var7);
            tc.d(var8Lifetime1, var9Lifetime1, var10Lifetime1, var11Lifetime1, var16Lifetime1);
            var8Lifetime1 = var10Lifetime1;
            var9Lifetime1 = var11Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("le.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static hj[] a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hj[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -59 / ((-61 - param1) / 34);
          stackIn_1_0 = si.a(fb.field_i, 33, param0, "");
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("le.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          da var4 = null;
          da var5 = null;
          int stackIn_12_0 = 0;
          Throwable decompiledCaughtException = null;
          if (param1 != 105) {
            return true;
          }
          if (null == gg.field_N) {
            gg.field_N = na.field_s.a(0, bo.field_e, uj.field_f);
          }
          if (gg.field_N.field_d == 0) {
            return false;
          }
          dupTemp$1 = bb.b(-1);
          qf.field_l = dupTemp$1;
          cm.field_b = dupTemp$1;
          if (gg.field_N.field_d != 1) {
            d.field_f = vh.field_a;
          } else {
            try {
              lk.field_h = new nn((java.net.Socket) (gg.field_N.field_b), na.field_s);
              var4 = rd.field_e;
              var5 = var4;
              da.field_p.field_l = 0;
              var5.field_l = 0;
              d.field_f = a.field_S;
              stackIn_12_0 = (!param0) ? -1 : -2;
              ab.field_pb = stackIn_12_0;
              hc.field_e = stackIn_12_0;
              rd.field_l = stackIn_12_0;
              ui.a(de.field_L, (byte) -95, da.field_p, ci.field_n, ce.field_m);
              qn.a(-1, 0);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              d.field_f = vh.field_a;
              gg.field_N = null;
              return true;
            }
          }
          gg.field_N = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static qm a(wc[] param0, float param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        qm stackIn_5_0 = null;
        qm stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = (int)param1;
          if (param2 > -53) {
            le.a((wc[]) null, 0.40464261174201965f, (byte) 29);
          }
          var4 = (float)(-var3_int) + param1;
          if (var4 == 0.0f &&
            param0.length == var3_int) {
            stackIn_5_0 = param0[var3_int - 1].a(false, 1.0f);
            return stackIn_5_0;
          }
          stackIn_7_0 = param0[var3_int].a(false, var4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("le.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_u = new e(6, 0, 4, 2);
        field_o = new int[][]{new int[]{200, 2}, new int[]{500, 5}, new int[]{100, 1}, new int[]{100, 1}, new int[]{100, 1}, new int[]{100, 1}, new int[]{100, 1}, new int[]{200, 2}, new int[]{200, 2}, new int[]{200, 2}, new int[]{200, 2}, new int[]{300, 3}, new int[]{200, 2}, new int[]{300, 3}, new int[]{200, 2}, new int[]{300, 3}};
        field_p = "This password contains your Player Name, and would be easy to guess";
        field_n = new ah();
    }
}
