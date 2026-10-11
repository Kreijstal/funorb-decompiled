/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gm extends hf {
    static he[] field_L;
    static String field_K;
    static int field_O;
    private qi field_I;
    private int field_N;
    static int field_J;
    static boolean field_M;

    final void a(vg param0, int param1, int param2, byte param3) {
        try {
          this.field_N = this.field_N + 1;
          super.a(param0, param1, param2, (byte) -128);
          if (param3 >= -127) {
            gm.h(-80);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "gm.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, float param1, String param2, boolean param3) {
        try {
          if (param0 < 3) {
            field_J = 66;
          }
          if (af.field_g == null) {
            af.field_g = new tf(ng.field_c, mf.field_u);
            ng.field_c.a((byte) -111, (vg) (af.field_g));
          }
          af.field_g.a(param2, param3, 6, param1);
          wj.c();
          a.a((byte) -121, true);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "gm.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        od var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          var4 = (od) null;
          gm.a((byte) -17, (od) null, 126);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(byte param0, od param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param1.k(7021);
            if (var3_int > param2) {
              var3_int = param2;
            }
            var4 = new byte[var3_int];
            param1.field_j = param1.field_j + pa.field_e.a(var3_int, param1.field_h, 0, param1.field_j, 0, var4);
            var6 = 88 / ((param0 - 18) / 39);
            var5 = p.a(var3_int, (byte) 79, var4, 0);
            stackIn_3_0 = var5;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_5_0 = "Cabbage";
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("gm.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final String e(int param0) {
        if (param0 >= -39) {
          return (String) null;
        }
        if (!this.field_n) {
          return null;
        }
        return this.field_I.b(-16034);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        vh var8;
        int var9;
        int var10;
        int var11;
        nh var12;
        nh var13;
        nh var14;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        var5 = param0 + this.field_o + (this.field_w >> 1);
        var6 = param3 - (-this.field_m - (this.field_k >> 1));
        var8 = this.field_I.a(param2 - 12296);
        if (var8 != ai.field_A &&
          var8 != nd.field_P) {
          if (u.field_b == var8) {
            var14 = ja.field_n[2];
            var14.a(var5 - (var14.field_y >> 1), -(var14.field_w >> 1) + var6, 256);
          } else if (var8 == ce.field_e) {
            var13 = ja.field_n[1];
            var13.a(var5 - (var13.field_y >> 1), var6 - (var13.field_w >> 1), 256);
          }
        } else {
          var12 = ja.field_n[0];
          var9 = var12.field_z << 1;
          var10 = var12.field_C << 1;
          if (null != mj.field_v &&
            var9 <= mj.field_v.field_y &&
            mj.field_v.field_w >= var10) {
            aj.a(mj.field_v, (byte) 91);
            wj.c();
          } else {
            mj.field_v = new nh(var9, var10);
            aj.a(mj.field_v, (byte) 125);
          }
          var12.b(112, 144, var12.field_z << 4, var12.field_C << 4, -this.field_N << 10, 4096);
          cl.d((byte) -80);
          mj.field_v.a(var5 - var12.field_z, -var12.field_C + var6, 256);
        }
    }

    gm(qi param0) {
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static nh a(nh param0, int param1, int param2, he param3, int param4, boolean param5) {
        nh stackIn_23_0 = null;
        nh stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        nh var25 = null;
        nh var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var6_int = param3.field_d;
          var7 = param3.field_k;
          var8 = param0.field_y;
          var9 = param0.field_w;
          if (var8 != var6_int ||
            var7 != var9 ||
            !(var6_int * var7 <= param3.field_m.length) ||
            !(param0.field_B.length >= var8 * var9)) {
            var25 = new nh(var6_int, var7);
            var25.c();
            param0.a(0, 0);
            lb.field_C.a(114);
            param0 = var25;
          }
          var26 = param0;
          var28 = var26.field_B;
          var27 = var28;
          var11 = var27;
          var12 = var6_int * (param2 * var7) / 10000;
          var13 = 1;
          var14 = 1;
          var15 = 0;
          while (var12 > 0) {
            var13Lifetime1 = hi.a(var6_int - 2, 4, jf.field_nb) + 1;
            var14Lifetime1 = hi.a(-2 + var7, 4, jf.field_nb) + 1;
            var15Lifetime1 = var13Lifetime1 + var14Lifetime1 * var6_int;
            if (param3.field_m[var15Lifetime1] == 0) {
              continue;
            }
            var12--;
            var11[var15Lifetime1] = li.a(param4, hi.a(255, 4, jf.field_nb) * param1);
          }
          var15Lifetime2 = var6_int + 1;
          for (var16 = -var7 + 2; 0 > var16; var16++) {
            var17 = var11[-1 + var15Lifetime2];
            var18 = var28[var15Lifetime2];
            var19 = var11[1 + var15Lifetime2];
            for (var20 = -var6_int + 2; var20 < 0; var20++) {
              var21 = var11[-var6_int + var15Lifetime2];
              var22 = (65280 & var19) + (65280 & var21) + (var17 & 65280) + (65280 & var18) >> 2;
              var23 = (var19 & 16711935) + (var18 & 16711935) + ((var17 & 16711935) + (16711935 & var21)) >> 2;
              var11[-var6_int + var15Lifetime2] = rk.a(var23, 16711935) + rk.a(var22, 65280);
              var17 = var18;
              var15Lifetime2++;
              var18 = var19;
              var19 = var11[1 + var15Lifetime2];
            }
            var15Lifetime2 += 2;
          }
          for (var16Lifetime1 = var28.length - 1; var16Lifetime1 >= 0; var16Lifetime1--) {
            var17Lifetime1 = var28[var16Lifetime1];
            var18Lifetime1 = var17Lifetime1 >> 16;
            var19Lifetime1 = var17Lifetime1 >> 8 & 255;
            var20Lifetime1 = var17Lifetime1 & 255;
            var11[var16Lifetime1] = (var20Lifetime1 * 63627 >> 16) + (rk.a(63627 * var19Lifetime1, 16711893) >> 8) + rk.a(var18Lifetime1 * 63627, 16711680);
          }
          if (param5) {
            stackIn_25_0 = var26;
            return stackIn_25_0;
          }
          stackIn_23_0 = (nh) null;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("gm.O(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_L = null;
        if (param0 > -67) {
          field_K = (String) null;
        }
        field_K = null;
    }

    static {
        field_K = "This game has been updated! Please reload this page.";
        field_O = 0;
        field_J = 0;
    }
}
