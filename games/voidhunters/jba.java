/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jba implements wwa {
    private int field_i;
    private int field_a;
    private int field_f;
    private no field_g;
    private int field_d;
    static llb field_b;
    private int field_c;
    static llb field_h;
    private int field_e;

    final static wfb a(int[][] param0, long param1, int param2, Random param3, int param4, long param5) {
        int var18 = 0;
        wfb stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var8 = null;
        int var9_int = 0;
        int[][] var9 = null;
        int var10 = 0;
        Object var10_ref = null;
        int var11_int = 0;
        Random var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Random var15 = null;
        int[] var16 = null;
        int var17 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[][] var23 = null;
        wfb var24 = null;
        int[] var25 = null;
        int[][] var26 = null;
        int[] var27 = null;
        int var9_intLifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var17Lifetime1;
        int var10Lifetime2;
        var19 = VoidHunters.field_G;
        try {
          var8 = null;
          if (param0 != null) {
            var20 = param0[0];
            var22 = var20;
            var8 = var22;
            for (var9_int = 0; var9_int < var20.length / 2; var9_int += 2) {
              var10 = var20[var9_int];
              var11_int = var20[1 + var9_int];
              var12 = var20.length - (2 + var9_int);
              var13 = var20[var12];
              var14 = var20[var12 + 1];
              var20[var9_int] = var13;
              var20[1 + var9_int] = var14;
              var20[var12] = var10;
              var20[var12 + 1] = var11_int;
            }
            for (var9_intLifetime1 = 0; var9_intLifetime1 < var22.length; var9_intLifetime1++) {
              ((int[]) (var8))[var9_intLifetime1] = ((int[]) (var8))[var9_intLifetime1] >> 4;
            }
            var26 = new int[-1 + param0.length][];
            var23 = var26;
            var21 = var23;
            var9 = var21;
            for (var10Lifetime2 = 0; var26.length > var10Lifetime2; var10Lifetime2++) {
              var21[var10Lifetime2] = param0[1 + var10Lifetime2];
            }
            param0 = var9;
          }
          if (var8 == null) {
            var8 = tka.a(param1, (byte) 55, param5, param2, param3);
          }
          var24 = new wfb((int[]) (var8), 0, 0);
          var24.a(4, 102, false);
          if (param0 == null) {
            var24.field_w = new int[3][];
            var10_ref = var8;
            var11 = new Random((long)((int[]) (var8))[0]);
            var12Lifetime1 = hob.a(var11, (int)param5, 121) - ((int)param5 >> 1) << 3;
            var13Lifetime1 = hob.a(var11, (int)param5, 119) - ((int)param5 >> 1) << 3;
            for (var14Lifetime1 = 0; 3 > var14Lifetime1; var14Lifetime1++) {
              var15 = new Random((long)((int[]) (var10_ref))[1]);
              var27 = tka.a(param1, (byte) 55, param5 * 2L / (long)(2 + var14Lifetime1), param2, var15);
              var25 = var27;
              var16 = var25;
              for (var17 = 0; var17 < var27.length; var17++) {
                var16[var17] = var16[var17] << 4;
              }
              for (var17Lifetime1 = 0; var17Lifetime1 < var27.length; var17Lifetime1 += 2) {
                var16[var17Lifetime1] = var16[var17Lifetime1] + var12Lifetime1 * (var14Lifetime1 + 1);
                var16[1 + var17Lifetime1] = var16[1 + var17Lifetime1] + var13Lifetime1 * (1 + var14Lifetime1);
                for (var18 = 0; var18 < 100; var18++) {
                  if (!fra.a((int[]) (var10_ref), var16[var17Lifetime1 + 1], 2, var27[var17Lifetime1])) {
                    var16[var17Lifetime1] = var27[var17Lifetime1] * 200 >> 8;
                    var16[1 + var17Lifetime1] = var16[var17Lifetime1 + 1] * 200 >> 8;
                    continue;
                  }
                  break;
                }
              }
              var24.field_w[var14Lifetime1] = var27;
              var10_ref = var16;
            }
          } else {
            var24.field_w = param0;
          }
          var24.field_m = true;
          var24.field_k = false;
          var10Lifetime1 = 71 / ((param4 - 45) / 63);
          var24.a(121, 8);
          var24.field_B = 16;
          var24.field_r = true;
          stackIn_32_0 = var24;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_35_0 = var8;
          stackIn_35_1 = new StringBuilder().append("jba.C(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        shb stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        v var13 = null;
        var12 = VoidHunters.field_G;
        try {
          if (!(param1 instanceof v)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (shb) (param1);
          }
          var13 = (v) (stackIn_4_0);
          dma.d(param2 + param1.field_g, param1.field_r + param3, param1.field_h, param1.field_f, this.field_e);
          if (var13 == null) {
          }
          var7 = param1.field_h - var13.field_C * 2;
          var8 = var13.field_C + (param1.field_g + param2);
          var9 = var13.field_F + (param1.field_r + param3);
          dma.a(var8, var9, var8 + var7, var9, this.field_f);
          var10 = var13.a(0) - 1;
          var11 = 112 / ((-27 - param0) / 35);
          while (0 <= var10) {
            dma.f(var8 + var7 * var13.a(-115, var10) / var13.e(-111), var9, this.field_c, this.field_d);
            var10--;
          }
          if (null != this.field_g) {
            this.field_g.a(var13.field_j, var7 / 2 + var8, var13.field_F + (this.field_g.field_H + var9), this.field_a, this.field_i);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("jba.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_b = null;
        if (!param0) {
          field_b = (llb) null;
        }
    }

    jba(no param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_e = param4;
          this.field_g = param0;
          this.field_c = param5;
          this.field_f = param3;
          this.field_i = param2;
          this.field_d = param6;
          this.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
