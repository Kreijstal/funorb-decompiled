/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gk extends fb {
    private boolean field_D;
    static String field_H;
    static int field_G;
    private boolean field_E;
    static String field_F;
    private boolean field_J;
    static String field_I;

    final void a(byte param0, wk param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ZombieDawn.field_J;
        try {
          if (param0 > -76) {
            return;
          }
          var3_int = param1.a(this.a(true) - 24, (byte) -106);
          var4 = param1.a(-24 + this.f(237239984), 0);
          if (var3_int >= -48 &&
            var4 >= -48 &&
            qj.field_d >= var3_int &&
            var4 <= me.field_Bb) {
            if (!this.field_D) {
              if (!this.field_E) {
                if (this.field_J) {
                  o.field_d[this.field_t].f(var3_int, var4);
                } else {
                  o.field_d[this.field_t].b(var3_int, var4);
                }
              } else {
                o.field_d[this.field_t].c(var3_int, var4);
              }
            } else {
              o.field_d[this.field_t].h(var3_int, var4, 2105376);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("gk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    gk(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, param2);
        this.field_E = false;
        this.field_J = false;
        this.field_D = false;
        this.field_D = param3 ? true : false;
        int var5 = pb.a(so.field_a, 2, 1);
        if (var5 == 1) {
          this.field_E = true;
        } else {
          if (var5 == 2) {
            this.field_J = true;
          }
        }
    }

    public static void i(int param0) {
        field_I = null;
        field_F = null;
        if (param0 <= 110) {
          return;
        }
        field_H = null;
    }

    final static void a(int param0, vn[] param1, boolean param2) {
        byte[] var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          kd.field_Fb[param0] = param1;
          kd.field_Fb[param0][-2 + kd.field_Fb[param0].length].a();
          if (!ng.field_e) {
            bi.d();
          }
          if (!param2) {
            var4 = (byte[]) null;
            gk.a((byte) 57, (byte[]) null);
            cn.field_f.b(57);
          } else {
            cn.field_f.b(57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void j(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        gd var4_ref_gd = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        gd var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = ZombieDawn.field_J;
        try {
          bn.field_b = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ic.field_W.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          if (param0 != 30549) {
            field_H = (String) null;
          }
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_gd = ic.field_W[var3];
            var4_ref_gd.b(32767);
            sl.a(true, var3);
            var5 = var4_ref_gd.field_s + var4_ref_gd.field_o >> 1;
            var6 = var4_ref_gd.field_L + var4_ref_gd.field_E >> 1;
            var7 = var4_ref_gd.field_a + var4_ref_gd.field_b >> 1;
            var8 = bn.field_b[9] >> 2;
            var9 = bn.field_b[10] >> 2;
            var10_int = bn.field_b[11] >> 2;
            var11 = var8 * jc.field_n[3] - (-(jc.field_n[4] * var9) - jc.field_n[5] * var10_int) >> 14;
            var12 = jc.field_n[8] * var10_int + (jc.field_n[6] * var8 + jc.field_n[7] * var9) >> 14;
            var13 = var10_int * jc.field_n[11] + (jc.field_n[10] * var9 + jc.field_n[9] * var8) >> 14;
            var2[var3] = var7 * var13 + (var11 * var5 + var12 * var6) >> 16;
          }
          var3Lifetime1 = bn.field_b[9] >> 8;
          var4 = bn.field_b[10] >> 8;
          var5Lifetime1 = bn.field_b[11] >> 8;
          var6Lifetime1 = ej.field_x << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = rd.a(true, var6Lifetime1) >> 8;
          var9Lifetime1 = fb.a(1311979239, var6Lifetime1) >> 8;
          if (ha.field_b != -1 &&
            -1 != ei.field_K) {
            var7Lifetime1 = ha.field_b - 320;
            var9Lifetime1 = -128;
            var8Lifetime1 = 240 - ei.field_K;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1)));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + (var12Lifetime1 * var12Lifetime1 + var14 * var14)));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; var15 < ic.field_W.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < ic.field_W.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var2[var16] = -2147483648;
            var17 = ic.field_W[var16];
            sl.a(true, var16);
            for (var18 = 0; 3 > var18; var18++) {
              jc.field_n[var18] = jc.field_n[var18] + eg.field_o[var15][var18];
            }
            ad.a(true, jc.field_n, var17, (byte) 50, false, false, bn.field_b);
            rc.a((byte) -111, var14, var13Lifetime1, var17, var7Lifetime1, var8Lifetime1, var9Lifetime1, var12Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "gk.F(" + param0 + ')');
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = ZombieDawn.field_J;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (param2 & 16718014) >> 16;
        int var5 = param2 >> 8 & 255;
        int var6 = param2 & 255;
        int var7 = 255 & param0 >> 16;
        int var8 = (65282 & param0) >> 8;
        if (param1 > -35) {
          return (int[]) null;
        }
        int var9 = param0 & 255;
        for (var10 = 0; 256 > var10; var10++) {
          var11 = 256 - var10;
          var13[var10] = ((var4 * var10 >> 8) + (var7 * var11 >> 8) << 16) + (((var11 * var8 >> 8) + (var5 * var10 >> 8) << 8) + (var11 * var9 >> 8)) + (var6 * var10 >> 8);
        }
        return var3;
    }

    final void g(int param0) {
        if (param0 < 95) {
          wk var3 = (wk) null;
          this.a((byte) -5, (wk) null);
        }
    }

    final static on a(byte param0, byte[] param1) {
        int var6 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var7 = 0;
        on stackIn_3_0 = null;
        on stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          if (param0 > -67) {
            stackIn_3_0 = (on) null;
            return stackIn_3_0;
          }
          var2_int = 90000;
          var3 = 10;
          var4 = 0;
          var5 = new byte[12 + param1.length];
          fb.a(0, var5, (byte) 67, md.a(0, param1, 74));
          fb.a(1, var5, (byte) -87, var4);
          fb.a(2, var5, (byte) 70, var2_int);
          fb.a(3, var5, (byte) -109, var3);
          for (var6 = 1; param1.length / 4 > var6; var6++) {
            fb.a(var6 + 3, var5, (byte) -125, md.a(var6, param1, 85));
          }
          stackIn_8_0 = fc.a(var5, (byte) 126);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("gk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_H = "Log in";
        field_G = 600;
        field_I = "Confirm Password: ";
        field_F = null;
    }
}
