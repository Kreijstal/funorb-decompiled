/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tfa implements iva {
    una field_a;
    static int[][] field_e;
    private hs field_g;
    private boolean field_b;
    kda field_j;
    private int field_h;
    private int field_c;
    ft field_f;
    static int[] field_d;
    int field_i;

    private final int c(byte param0) {
        if (param0 != -120) {
          field_e = (int[][]) null;
        }
        int var2 = this.field_f.field_b * this.field_a.field_e * this.field_h;
        return !this.field_b ? var2 : var2 * 4 / 3;
    }

    final void a(int param0, float[] param1, int param2, int param3, int param4) {
        int var16 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var22 = 0;
        var22 = TombRacer.field_G ? 1 : 0;
        try {
          if (~param4 < param0 &&
            !cla.a(9181, param4)) {
            throw new IllegalArgumentException("");
          }
          if (0 < param2 &&
            !cla.a(param0 + 9182, param2)) {
            throw new IllegalArgumentException("");
          }
          var6_int = this.field_f.field_b;
          var7 = 0;
          stackIn_11_0 = (param2 <= param4) ? param2 : param4;
          var8 = stackIn_11_0;
          var9 = param4 >> 1;
          var10 = param2 >> 1;
          var11 = param1;
          var12 = new float[var9 * (var10 * var6_int)];
          while (true) {
            jaggl.OpenGL.glTexImage2Df(param3, var7, this.d(124), param4, param2, 0, waa.a(this.field_f, param0 + 1384), 5126, var11, 0);
            if (var8 <= 1) {
              return;
            }
            var15 = param4 * var6_int;
            var13 = var12;
            for (var16 = 0; var16 < var6_int; var16++) {
              var17 = var16;
              var18 = var16;
              var19 = var18 + var15;
              for (var20 = 0; var20 < var10; var20++) {
                for (var21 = 0; var9 > var21; var21++) {
                  var14 = var11[var18];
                  var18 = var18 + var6_int;
                  var14 = var14 + var11[var18];
                  var14 = var14 + var11[var19];
                  var18 = var18 + var6_int;
                  var19 = var19 + var6_int;
                  var14 = var14 + var11[var19];
                  var19 = var19 + var6_int;
                  var12[var17] = 0.25f * var14;
                  var17 = var17 + var6_int;
                }
                var18 = var18 + var15;
                var19 = var19 + var15;
              }
            }
            var12 = var11;
            param2 = var10;
            param4 = var9;
            var11 = var13;
            var7++;
            var8 = var8 >> 1;
            var9 = var9 >> 1;
            var10 = var10 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("tfa.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void f(byte param0) {
        if (0 < this.field_c) {
          this.field_j.a(this.field_c, this.c((byte) -120), 2);
          this.field_c = 0;
        }
        int var2 = -75 % ((16 - param0) / 61);
    }

    public void a(int param0, hs param1) {
        float[] var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != this.field_g) {
            this.field_g = param1;
            this.d((byte) -114);
          }
          if (param0 != 7672) {
            var4 = (float[]) null;
            this.a(-102, (float[]) null, -122, 31, 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("tfa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        this.f((byte) 114);
        super.finalize();
    }

    public void b(byte param0) {
        int var2 = this.field_j.o((byte) 106);
        if (param0 < 32) {
          return;
        }
        int var3 = this.field_j.field_Sc[var2];
        if (this.field_i != var3) {
          if (var3 != 0) {
            jaggl.OpenGL.glBindTexture(var3, 0);
            jaggl.OpenGL.glDisable(var3);
          }
          jaggl.OpenGL.glEnable(this.field_i);
          this.field_j.field_Sc[var2] = this.field_i;
        }
        jaggl.OpenGL.glBindTexture(this.field_i, this.field_c);
    }

    final int d(int param0) {
        if (una.field_g == this.field_a) {
          if (it.field_b == this.field_f) {
            return 6407;
          }
          if (this.field_f == gpa.field_a) {
            return 6408;
          }
          if (rp.field_g == this.field_f) {
            return 6406;
          }
          if (qr.field_w == this.field_f) {
            return 6409;
          }
          if (wo.field_i == this.field_f) {
            return 6410;
          }
          if (js.field_g == this.field_f) {
            return 6145;
          }
        } else {
          if (una.field_l != this.field_a) {
            if (this.field_a == una.field_h) {
              if (this.field_f == it.field_b) {
                return 34837;
              }
              if (this.field_f == gpa.field_a) {
                return 34836;
              }
              if (rp.field_g == this.field_f) {
                return 34838;
              }
              if (qr.field_w == this.field_f) {
                return 34840;
              }
              if (wo.field_i == this.field_f) {
                return 34841;
              }
              if (this.field_f == js.field_g) {
                return 6145;
              }
            }
          } else {
            if (this.field_f == it.field_b) {
              return 34843;
            }
            if (gpa.field_a == this.field_f) {
              return 34842;
            }
            if (rp.field_g == this.field_f) {
              return 34844;
            }
            if (this.field_f == qr.field_w) {
              return 34846;
            }
            if (wo.field_i == this.field_f) {
              return 34847;
            }
            if (js.field_g == this.field_f) {
              return 6145;
            }
          }
        }
        if (param0 > 43) {
          throw new IllegalStateException();
        }
        return -92;
    }

    final static ija a(int param0, int param1, java.awt.Canvas param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          ija var5 = null;
          iga var5_ref = null;
          ija stackIn_3_0 = null;
          iga stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param3 != 0) {
                field_d = (int[]) null;
              }
              var4 = Class.forName("ec");
              var5 = (ija) (var4.newInstance());
              var5.a(param2, param1, 11329, param0);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new iga();
              ((ija) ((Object) var5_ref)).a(param2, param1, 11329, param0);
              stackIn_5_0 = var5_ref;
              return (ija) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("tfa.R(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        this.field_j.a(true, (iva) (this));
        if (this.field_g != aw.field_G) {
          jaggl.OpenGL.glTexParameteri(this.field_i, 10241, !this.field_b ? 9728 : 9984);
          jaggl.OpenGL.glTexParameteri(this.field_i, 10240, 9728);
        } else {
          jaggl.OpenGL.glTexParameteri(this.field_i, 10241, this.field_b ? 9987 : 9729);
          jaggl.OpenGL.glTexParameteri(this.field_i, 10240, 9729);
        }
        if (param0 > -34) {
          this.field_h = -50;
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_e = (int[][]) null;
        if (param0 != 0) {
          field_e = (int[][]) null;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3, int param4) {
        int var16 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var22 = 0;
        var22 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 > 0 &&
            !cla.a(9181, param1)) {
            throw new IllegalArgumentException("");
          }
          if (param4 > 0 &&
            !cla.a(9181, param4)) {
            throw new IllegalArgumentException("");
          }
          var6_int = this.field_f.field_b;
          var7 = 0;
          if (param3 > -113) {
            this.field_i = 5;
          }
          stackIn_14_0 = (param1 < param4) ? param1 : param4;
          var8 = stackIn_14_0;
          var9 = param1 >> 1;
          var10 = param4 >> 1;
          var11 = param2;
          var12 = new byte[var10 * var9 * var6_int];
          while (true) {
            jaggl.OpenGL.glTexImage2Dub(param0, var7, this.d(115), param1, param4, 0, waa.a(this.field_f, 1383), 5121, var11, 0);
            if (var8 <= 1) {
              return;
            }
            var15 = param1 * var6_int;
            var13 = var12;
            for (var16 = 0; var6_int > var16; var16++) {
              var17 = var16;
              var18 = var16;
              var19 = var18 + var15;
              for (var20 = 0; var20 < var10; var20++) {
                for (var21 = 0; var21 < var9; var21++) {
                  var14 = var11[var18];
                  var18 = var18 + var6_int;
                  var14 = var14 + var11[var18];
                  var18 = var18 + var6_int;
                  var14 = var14 + var11[var19];
                  var19 = var19 + var6_int;
                  var14 = var14 + var11[var19];
                  var19 = var19 + var6_int;
                  var12[var17] = (byte)(var14 >> 2);
                  var17 = var17 + var6_int;
                }
                var19 = var19 + var15;
                var18 = var18 + var15;
              }
            }
            var12 = var11;
            var11 = var13;
            param4 = var10;
            param1 = var9;
            var8 = var8 >> 1;
            var10 = var10 >> 1;
            var9 = var9 >> 1;
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("tfa.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int[] param3, int param4) {
        int var24 = 0;
        int var25 = 0;
        int incrementValue$4 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
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
        int var26 = 0;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          if (param4 > 0 &&
            !cla.a(9181, param4)) {
            throw new IllegalArgumentException("");
          }
          if (0 < param2 &&
            !cla.a(9181, param2)) {
            throw new IllegalArgumentException("");
          }
          if (this.field_f != gpa.field_a) {
            throw new IllegalArgumentException("");
          }
          if (param0 != 99) {
            this.field_b = true;
          }
          var6_int = 0;
          stackIn_17_0 = (param4 < param2) ? param4 : param2;
          var7 = stackIn_17_0;
          var8 = param4 >> 1;
          var9 = param2 >> 1;
          var10 = param3;
          var11 = new int[var8 * var9];
          while (true) {
            jaggl.OpenGL.glTexImage2Di(param1, var6_int, this.d(param0 ^ 94), param4, param2, 0, 32993, this.field_j.field_od, var10, 0);
            if (1 >= var7) {
              return;
            }
            var13 = 0;
            var22 = 0;
            var23 = param4 + var22;
            var12 = var11;
            for (var24 = 0; var9 > var24; var24++) {
              for (var25 = 0; var25 < var8; var25++) {
                var14 = var10[var22++];
                var16 = var10[var23++];
                var15 = var10[var22++];
                var21 = 255 & var14 >> 24;
                var20 = 255 & var14;
                var17 = var10[var23++];
                var19 = 255 & var14 >> 8;
                var18 = 255 & var14 >> 16;
                var19 = var19 + (var15 >> 8 & 255);
                var18 = var18 + (255 & var15 >> 16);
                var20 = var20 + (255 & var15);
                var21 = var21 + (var15 >> 24 & 255);
                var18 = var18 + (255 & var16 >> 16);
                var20 = var20 + (255 & var16);
                var19 = var19 + ((65420 & var16) >> 8);
                var21 = var21 + (var16 >> 24 & 255);
                var20 = var20 + (255 & var17);
                var18 = var18 + ((var17 & 16738139) >> 16);
                var21 = var21 + (var17 >> 24 & 255);
                var19 = var19 + ((var17 & 65316) >> 8);
                incrementValue$4 = var13;
                var13++;
                var11[incrementValue$4] = fh.a(sea.c(255, var20 >> 2), fh.a(fh.a(sea.c(var18, 1020) << 14, sea.c(1020, var21) << 22), sea.c(var19 << 6, 65280)));
              }
              var23 = var23 + param4;
              var22 = var22 + param4;
            }
            var11 = var10;
            param2 = var9;
            param4 = var8;
            var10 = var12;
            var8 = var8 >> 1;
            var7 = var7 >> 1;
            var9 = var9 >> 1;
            var6_int++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("tfa.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void e(byte param0) {
        if (param0 > -113) {
          return;
        }
        ko.c((byte) 57);
    }

    private final void a(byte param0, int param1) {
        this.field_j.field_Xb = this.field_j.field_Xb - param1;
        this.field_j.field_Xb = this.field_j.field_Xb + this.c((byte) -120);
        if (param0 > -88) {
          this.b((byte) 93);
        }
    }

    tfa(kda param0, int param1, ft param2, una param3, int param4, boolean param5) {
        this.field_g = aw.field_G;
        try {
          this.field_a = param3;
          this.field_j = param0;
          this.field_b = param5 ? true : false;
          this.field_i = param1;
          this.field_h = param4;
          this.field_f = param2;
          jaggl.OpenGL.glGenTextures(1, pra.field_a, 0);
          this.field_c = pra.field_a[0];
          this.d((byte) -97);
          this.a((byte) -128, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tfa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_d = new int[]{0, 512, 0};
    }
}
