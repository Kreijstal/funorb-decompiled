/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends wp {
    static jn field_E;
    static ci field_G;
    static int field_F;

    wr(String param0, qm param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_C = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private wr(String param0, mh param1, qm param2) {
        super(param0, param1, param2);
        try {
          this.field_w = ks.field_x.field_i;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, ah param1) {
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = 588;
          var3 = 428;
          var4 = param1.field_C >> 8;
          var5 = param1.field_z >> 8;
          var6 = param1.field_m >> 8;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = ro.a(var4, var2_int, 26, 614, var5, false, 26, var6, 26);
          if (var10 != -1) {
            if (-1.5707963267948966 < param1.field_s) {
              stackIn_8_0 = (param1.field_s < 1.5707963267948966) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var7 = stackIn_8_0;
            var9 = 26;
            var8 = var10;
          }
          if (var10 == -1) {
            var10 = ro.a(var4, var2_int, 454, 614, var5, false, 454, var6, 26);
            if (-1 != var10) {
              var8 = var10;
              var9 = 454;
              if (-1.5707963267948966 > param1.field_s) {
                stackIn_19_0 = 1;
              } else {
                stackIn_19_0 = (param1.field_s > 1.5707963267948966) ? 1 : 0;
              }
              var7 = stackIn_19_0;
            }
          }
          if (var10 == -1) {
            var10 = ro.a(var4, var3, 26, 26, var5, false, 454, var6, 26);
            if (var10 != -1) {
              stackIn_26_0 = (!(param1.field_s > 0.0)) ? 0 : 1;
              var7 = stackIn_26_0;
              var8 = 26;
              var9 = var10;
            }
          }
          if (param0 == var10) {
            var10 = ro.a(var4, var3, 26, 614, var5, false, 454, var6, 614);
            if (var10 != -1) {
              var9 = var10;
              var8 = 614;
              stackIn_32_0 = (!(param1.field_s < 0.0)) ? 0 : 1;
              var7 = stackIn_32_0;
            }
          }
          var11 = var4 - var8;
          var12 = -var9 + var5;
          var13 = Math.sqrt((double)(var11 * var11 + var12 * var12));
          Math.asin((double)var11 / var13);
          if (!param1.a(true)) {
            if (var7 == 0) {
              ro.a(param1, (byte) 113);
              return;
            }
            if (param1.field_p == 0) {
              ro.a(param1, (byte) 113);
              return;
            }
          }
          if (var4 <= 26 &&
            0 > param1.field_E) {
            param1.field_E = -param1.field_E;
            if (param1.field_E == 0) {
              param1.field_E = 256;
            }
          } else {
            if (rj.field_c - 52 < var4 &&
              param1.field_E > 0) {
              param1.field_E = -param1.field_E;
              if (param1.field_E == 0) {
                param1.field_E = -256;
              }
            }
          }
          if (var5 <= 26 &&
            param1.field_A < 0) {
            param1.field_A = -param1.field_A;
            if (param1.field_A != 0) {
              return;
            }
            param1.field_A = 256;
            return;
          }
          if (-52 + rl.field_k < var5) {
            if (param1.field_A <= 0) {
              return;
            }
            param1.field_A = -param1.field_A;
            if (0 == param1.field_A) {
              param1.field_A = 256;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_63_0 = var2;
          stackIn_63_1 = new StringBuilder().append("wr.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 454) {
          field_E = (jn) null;
        }
        field_E = null;
    }

    private wr(String param0, qm param1) {
        this(param0, ks.field_x.field_h, param1);
        try {
          this.field_w = ks.field_x.field_i;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          vr.a((java.awt.Component) ((Object) param1), -1);
          pl.a((java.awt.Component) ((Object) param1), 7);
          if (!param0) {
            field_F = -67;
          }
          if (as.field_w != null) {
            as.field_w.a((java.awt.Component) ((Object) param1), (byte) 76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("wr.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        this.field_C = !this.field_C ? true : false;
        super.b(param0, param1, param2, param3);
    }

    final static wc a(boolean param0, fs param1, boolean param2) {
        int var9 = 0;
        int incrementValue$0 = 0;
        int stackIn_11_0 = 0;
        fs stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        fs stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        wc stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        ah[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ah var15 = null;
        int var16 = 0;
        ah[] var17 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!param0) {
            param1.field_p = 0;
          }
          var17 = new ah[100];
          var3 = var17;
          var4 = 1;
          var5 = param1.e(-31302);
          var6 = 0;
          if (var5 > 1) {
            var6 = param1.e(-31302);
          }
          var7 = param2 ? 1 : 0;
          if (var5 > 3) {
            stackIn_11_0 = (param1.e(-31302) == 1) ? 1 : 0;
            var7 = stackIn_11_0;
          }
          var8 = param1.e(-31302);
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param1.e(-31302);
            var11 = param1.e(-31302);
            stackIn_16_0 = (fs) (param1);
            stackIn_17_1 = !(param2);
            var12 = ((fs) (Object) stackIn_16_0).c(stackIn_17_1);
            var13 = param1.c(true);
            stackIn_19_0 = (fs) (param1);
            stackIn_20_1 = !(param2);
            ((fs) (Object) stackIn_19_0).d(stackIn_20_1);
            var14 = 0;
            if (var5 > 4) {
              var14 = param1.e(-31302);
            }
            if (var10 >= 0 &&
              var10 < 8 &&
              var11 >= 0 &&
              var11 < 7) {
              var15 = uj.a(var10, var12, var11, (byte) 84, var13);
              var15.field_F = var14;
              incrementValue$0 = var4;
              var4++;
              var3[incrementValue$0] = var15;
            }
          }
          stackIn_37_0 = new wc(var17, var6, var7 != 0);
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_40_0 = var3_ref;
          stackIn_40_1 = new StringBuilder().append("wr.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(')').toString());
        }
    }

    final static vk a(fr param0, int param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        vk stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -24674) {
            stackIn_2_0 = (vk) null;
            return stackIn_2_0;
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param1, var4_int);
          jaggl.OpenGL.glProgramStringARB(param1, 34933, param2);
          jaggl.OpenGL.glGetIntegerv(34379, mb.field_h, 0);
          if (mb.field_h[0] == -1) {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            stackIn_7_0 = new vk(param0, param1, var4_int);
            return stackIn_7_0;
          }
          jaggl.OpenGL.glBindProgramARB(param1, 0);
          stackIn_5_0 = null;
          return (vk) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("wr.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_E = new jn();
    }
}
