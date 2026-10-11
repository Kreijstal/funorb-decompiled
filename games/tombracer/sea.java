/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sea extends nv {
    static String field_q;
    static String field_o;
    private aia[] field_n;
    static String field_p;

    final int a(int param0, up param1, pc param2) {
        int var10 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        aia var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = this.field_g.d(3);
          var5 = this.field_g.e(9648);
          var6 = param2.field_d - var4_int;
          if (param0 >= -85) {
            field_p = (String) null;
          }
          var7 = -var4_int + param2.field_e;
          var8 = -var5 + param2.field_k;
          var9 = -var5 + param2.field_a;
          for (var10 = 0; var10 < this.field_n.length; var10++) {
            var11 = this.field_n[var10];
            var12 = var4_int + var11.a((byte) 110);
            var13 = var5 + var11.f(0);
            var14 = eha.a(var11.g(0), 12, var13, var11.g(0), param2, var12, 2);
            if (var14 > 0) {
              var15 = wm.a(4096, var14, 15);
              this.a(var8 + gqa.a(-var8 + var9, (byte) 24, var15), var6 + gqa.a(var7 - var6, (byte) 24, var15), var11, (byte) -102, param1);
            }
          }
          stackIn_10_0 = 0;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("sea.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int a(int param0, ep param1, up param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25940) {
            stackIn_2_0 = 123;
            return stackIn_2_0;
          }
          var4_int = param1.i(-1);
          stackIn_4_0 = this.a(var4_int, var4_int, param2, param1.d(param0 ^ 25943), (byte) 125, param1.e(param0 ^ 16612));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("sea.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final aia b(int param0, int param1) {
        int var3 = 15 / ((-50 - param0) / 56);
        return this.field_n[param1];
    }

    final void a(boolean param0, fsa param1) {
        try {
          super.a(param0, param1);
          this.d(param0);
          param1.a(26492, true, 3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sea.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 27508) {
          field_o = (String) null;
        }
        field_o = null;
        field_p = null;
        field_q = null;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          return 91;
        }
        return param0;
    }

    final void h(int param0) {
        int var3 = 0;
        aia var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        super.h(param0);
        aia[] var6 = this.field_n;
        aia[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.c(126);
        }
    }

    final void k(int param0) {
        int var5 = 0;
        int var4 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var4Lifetime1;
        if (param0 != 5418) {
          return;
        }
        int var2 = this.field_g.d(3);
        int var3 = this.field_g.e(9648);
        for (var4 = 0; this.field_n.length > var4; var4++) {
          this.field_n[var4].a(var2, this.field_g.c(-112), this.field_g.a((byte) 55), var3, (byte) -80, this.field_g.r(0), this.field_g.f((byte) 77));
        }
        var4Lifetime1 = this.d(8031) ? 1 : 0;
        for (var5 = 0; var5 < this.field_n.length; var5++) {
          this.field_n[var5].a(111, var4Lifetime1 != 0, var3, var2, this.m((byte) 19));
        }
    }

    final int a(boolean param0) {
        if (param0) {
          field_p = (String) null;
        }
        return 15;
    }

    final static boolean l(int param0) {
        int var2 = 0;
        aj var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        aj var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          var4 = (aj) (al.field_g.f(-80));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 != 10371) {
            sea.l(41);
          }
          for (var2 = 0; var1.field_f > var2; var2++) {
            if (null != var4.field_j[var2] &&
              var4.field_j[var2].field_b == 0) {
              return false;
            }
            if (null != var4.field_k[var2] &&
              var4.field_k[var2].field_b == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "sea.P(" + param0 + ')');
        }
    }

    sea(la param0, boolean param1) {
        super(param0, param1);
    }

    private final void a(int param0, int param1, aia param2, byte param3, up param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param3 > -34) {
            sea.a(0.6912761926651001f, -0.5952900052070618f, -96, -20, 0.25126492977142334f, -40, 39, 3);
          }
          if (param4.field_j == 3) {
            param2.a(param1, param4.field_b, param0, true);
          } else {
            if (param4.field_j == 4) {
              param2.a(param1, param0, param4.field_b, (byte) 99);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("sea.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 != 3) {
          up var3 = (up) null;
          this.a(-115, (ep) null, (up) null);
        }
        return this.field_n.length;
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var9 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        aia var10_ref_aia = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          var7_int = this.field_g.d(3);
          var8 = this.field_g.e(9648);
          for (var9 = 0; this.field_n.length > var9; var9++) {
            var10_ref_aia = this.field_n[var9];
            var11 = var10_ref_aia.a((byte) 91) + var7_int;
            var12 = var8 + var10_ref_aia.f(0);
            if (io.a(param1, var12, (byte) -61, param0, var11, param5, var10_ref_aia.g(0), var10_ref_aia.g(0), param3)) {
              this.a(-this.field_g.e(9648) + param5, -this.field_g.d(3) + param3, var10_ref_aia, (byte) -115, param2);
            }
          }
          var10 = -90 / ((param4 - 62) / 52);
          stackIn_8_0 = 0;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("sea.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static float[] a(float param0, float param1, int param2, int param3, float param4, int param5, int param6, int param7) {
        float[] var8;
        float[] var9;
        float var10;
        float var11;
        float var12;
        float[] var13;
        float var14;
        float var15;
        float var16;
        float[] var17;
        float[] var18;
        float[] var19;
        float[] var20;
        float[] var21;
        float[] var22;
        float var10Lifetime1;
        float var11Lifetime1;
        float var12Lifetime1;
        var21 = new float[9];
        var19 = var21;
        var17 = var19;
        var8 = var17;
        var18 = new float[9];
        var9 = var18;
        var10 = (float)Math.cos((double)((float)param5 * 0.02454369328916073f));
        if (param2 != 16486) {
          sea.a(1.2596310377120972f, 1.2713145017623901f, -99, -49, -0.6455500721931458f, 23, -23, -74);
        }
        var11 = (float)Math.sin((double)((float)param5 * 0.02454369328916073f));
        var17[3] = 0.0f;
        var21[0] = var10;
        var17[7] = 0.0f;
        var21[8] = var10;
        var17[6] = -var11;
        var12 = -var10 + 1.0f;
        var17[1] = 0.0f;
        var17[5] = 0.0f;
        var17[4] = 1.0f;
        var21[2] = var11;
        var22 = new float[9];
        var20 = var22;
        var13 = var20;
        var14 = 1.0f;
        var10Lifetime1 = (float)param7 / 32767.0f;
        var15 = 0.0f;
        var12Lifetime1 = -var10Lifetime1 + 1.0f;
        var11Lifetime1 = -(float)Math.sqrt((double)(-(var10Lifetime1 * var10Lifetime1) + 1.0f));
        var16 = (float)Math.sqrt((double)(param3 * param3 + param6 * param6));
        if (0.0f == var16 &&
          var10Lifetime1 == 0.0f) {
          var9 = var17;
        } else {
          if (var16 != 0.0f) {
            var14 = (float)(-param3) / var16;
            var15 = (float)param6 / var16;
          }
          var13[8] = var10Lifetime1 + var15 * var15 * var12Lifetime1;
          var13[6] = var14 * var15 * var12Lifetime1;
          var13[0] = var10Lifetime1 + var12Lifetime1 * (var14 * var14);
          var13[5] = var14 * var11Lifetime1;
          var13[1] = var11Lifetime1 * var15;
          var13[7] = var11Lifetime1 * -var14;
          var13[2] = var12Lifetime1 * (var14 * var15);
          var22[4] = var10Lifetime1;
          var13[3] = -var15 * var11Lifetime1;
          var18[0] = var21[2] * var22[6] + (var22[3] * var21[1] + var21[0] * var22[0]);
          var18[1] = var21[2] * var22[7] + (var22[1] * var21[0] + var22[4] * var21[1]);
          var18[3] = var21[4] * var22[3] + var22[0] * var21[3] + var22[6] * var21[5];
          var18[2] = var21[0] * var22[2] + var22[5] * var21[1] + var21[2] * var22[8];
          var18[4] = var22[7] * var21[5] + (var22[4] * var21[4] + var21[3] * var22[1]);
          var18[5] = var22[8] * var21[5] + (var22[2] * var21[3] + var21[4] * var22[5]);
          var18[6] = var21[6] * var22[0] + var21[7] * var22[3] + var21[8] * var22[6];
          var18[7] = var21[8] * var22[7] + (var21[7] * var22[4] + var22[1] * var21[6]);
          var18[8] = var22[2] * var21[6] + var21[7] * var22[5] + var21[8] * var22[8];
        }
        var9[2] = var9[2] * param4;
        var9[1] = var9[1] * param4;
        var9[7] = var9[7] * param1;
        var9[3] = var9[3] * param0;
        var9[8] = var9[8] * param1;
        var9[6] = var9[6] * param1;
        var9[5] = var9[5] * param0;
        var9[4] = var9[4] * param0;
        var9[0] = var9[0] * param4;
        return var9;
    }

    static int c(int param0, int param1) {
        return param0 & param1;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
          this.a(false);
          return true;
        }
        return true;
    }

    sea(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
    }

    private final void d(boolean param0) {
        int var6 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var9;
        int var7;
        int var8;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_g.c(-33);
        var3 = this.field_g.a((byte) 55);
        if (!param0) {
          this.field_n = (aia[]) null;
        }
        var4 = 1572864;
        var5 = (var2 >> 16) * (var3 >> 16) / ((var4 >> 16) * (var4 >> 16)) >> 2;
        if (50 < var5) {
          var5 = 50;
        }
        if (-var4 + var2 > 0 &&
          -var4 + var3 > 0) {
          this.field_n = new aia[var5];
          for (var6 = 0; var5 > var6; var6++) {
            var7 = var4 / 2 + this.o((byte) 46).a(-var4 + var2, 0) - var2 / 2;
            var8 = -(var3 / 2) + (this.o((byte) 46).a(var3 - var4, 0) + var4 / 2);
            this.field_n[var6] = new aia(var7, var8, var4);
          }
        } else {
          this.field_n = new aia[]{};
        }
    }

    static {
        field_q = "Instructions";
        field_o = null;
        field_p = "+15 Coins";
    }
}
