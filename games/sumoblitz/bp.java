/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bp implements ed {
    private ji field_a;
    private boolean field_d;
    int field_h;
    on field_e;
    private int field_f;
    io field_g;
    iw field_c;
    private int field_b;

    final void a(int param0, int param1, int[] param2, int param3, int param4) {
        int var24 = 0;
        int var25 = 0;
        int incrementValue$9 = 0;
        int var6_int = 0;
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
        int stackIn_14_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var26 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (~param1 < param4 &&
            !rm.a(param1, -108)) {
            throw new IllegalArgumentException("");
          }
          if (param0 > 0 &&
            !rm.a(param0, -127)) {
            throw new IllegalArgumentException("");
          }
          if (this.field_c != nl.field_p) {
            throw new IllegalArgumentException("");
          }
          var6_int = 0;
          stackIn_14_0 = (param0 <= param1) ? param0 : param1;
          var7 = stackIn_14_0;
          var8 = param1 >> 1;
          var9 = param0 >> 1;
          var10 = param2;
          var11 = new int[var9 * var8];
          while (true) {
            jaggl.OpenGL.glTexImage2Di(param3, var6_int, this.e(param4 + 101), param1, param0, 0, 32993, this.field_e.field_Ec, var10, 0);
            if (var7 <= 1) {
              return;
            }
            var13 = 0;
            var22 = 0;
            var23 = var22 + param1;
            var12 = var11;
            for (var24 = 0; var9 > var24; var24++) {
              for (var25 = 0; var8 > var25; var25++) {
                var14 = var10[var22++];
                var16 = var10[var23++];
                var15 = var10[var22++];
                var21 = 255 & var14 >> 24;
                var18 = 255 & var14 >> 16;
                var20 = 255 & var14;
                var17 = var10[var23++];
                var19 = (65493 & var14) >> 8;
                var20 = var20 + (255 & var15);
                var18 = var18 + ((16770131 & var15) >> 16);
                var21 = var21 + (var15 >> 24 & 255);
                var19 = var19 + (var15 >> 8 & 255);
                var18 = var18 + (var16 >> 16 & 255);
                var21 = var21 + (255 & var16 >> 24);
                var20 = var20 + (255 & var16);
                var19 = var19 + (255 & var16 >> 8);
                var20 = var20 + (255 & var17);
                var19 = var19 + ((var17 & 65361) >> 8);
                var18 = var18 + ((var17 & 16719727) >> 16);
                var21 = var21 + (var17 >> 24 & 255);
                incrementValue$9 = var13;
                var13++;
                var11[incrementValue$9] = ic.a(eb.a(1020, var20) >> 2, ic.a(eb.a(1020, var19) << 6, ic.a(eb.a(16711680, var18 << 14), eb.a(var21, 1020) << 22)));
              }
              var22 = var22 + param1;
              var23 = var23 + param1;
            }
            var11 = var10;
            param0 = var9;
            param1 = var8;
            var10 = var12;
            var6_int++;
            var7 = var7 >> 1;
            var8 = var8 >> 1;
            var9 = var9 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_27_0 = var6;
          stackIn_27_1 = new StringBuilder().append("bp.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int g(int param0) {
        if (2 > mp.field_a) {
          return 0;
        }
        if (param0 != 14296) {
          return -117;
        }
        if (dk.field_c == 0) {
          if (!wd.field_j.b((byte) 127)) {
            return 20;
          }
          if (!wd.field_j.a("commonui", 100)) {
            return 40;
          }
          if (!eb.field_f.b((byte) 127)) {
            return 50;
          }
          if (!eb.field_f.a("commonui", 100)) {
            return 60;
          }
          if (!hw.field_a.b((byte) 127)) {
            return 70;
          }
          if (!hw.field_a.a(true)) {
            return 80;
          }
        } else {
          if (null != hd.field_H) {
            if (!hd.field_H.b((byte) 127)) {
              return 14;
            }
            if (!hd.field_H.b((byte) -98, "")) {
              return 29;
            }
            if (!hd.field_H.a("", 100)) {
              return 29;
            }
          }
          if (!wd.field_j.b((byte) 127)) {
            return 43;
          }
          if (!wd.field_j.a("commonui", param0 ^ 14268)) {
            return 57;
          }
          if (!eb.field_f.b((byte) 127)) {
            return 71;
          }
          if (!eb.field_f.a("commonui", 100)) {
            return 80;
          }
          if (!hw.field_a.b((byte) 127)) {
            return 82;
          }
          if (!hw.field_a.a(true)) {
            return 86;
          }
        }
        return 100;
    }

    final void a(int param0, int param1, int param2, int param3, float[] param4) {
        int var16 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
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
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param3 > 0 &&
            !rm.a(param3, -102)) {
            throw new IllegalArgumentException("");
          }
          if (param1 > 0 &&
            !rm.a(param1, -102)) {
            throw new IllegalArgumentException("");
          }
          var6_int = this.field_c.field_c;
          var7 = 0;
          stackIn_12_0 = (param1 <= param3) ? param1 : param3;
          var8 = stackIn_12_0;
          var9 = param3 >> 1;
          if (param2 >= -115) {
            return;
          }
          var10 = param1 >> 1;
          var11 = param4;
          var12 = new float[var6_int * (var9 * var10)];
          while (true) {
            jaggl.OpenGL.glTexImage2Df(param0, var7, this.e(-107), param3, param1, 0, te.a(-21339, this.field_c), 5126, var11, 0);
            if (var8 <= 1) {
              return;
            }
            var15 = var6_int * param3;
            var13 = var12;
            for (var16 = 0; var6_int > var16; var16++) {
              var17 = var16;
              var18 = var16;
              var19 = var15 + var18;
              for (var20 = 0; var20 < var10; var20++) {
                for (var21 = 0; var9 > var21; var21++) {
                  var14 = var11[var18];
                  var18 = var18 + var6_int;
                  var14 = var14 + var11[var18];
                  var18 = var18 + var6_int;
                  var14 = var14 + var11[var19];
                  var19 = var19 + var6_int;
                  var14 = var14 + var11[var19];
                  var12[var17] = var14 * 0.25f;
                  var19 = var19 + var6_int;
                  var17 = var17 + var6_int;
                }
                var18 = var18 + var15;
                var19 = var19 + var15;
              }
            }
            var12 = var11;
            param1 = var10;
            var11 = var13;
            param3 = var9;
            var10 = var10 >> 1;
            var9 = var9 >> 1;
            var8 = var8 >> 1;
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("bp.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3, int param4) {
        int var16 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_13_0 = 0;
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
        int[] var23 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 > 0 &&
            !rm.a(param1, -102)) {
            throw new IllegalArgumentException("");
          }
          if (param3 > 0 &&
            !rm.a(param3, -116)) {
            throw new IllegalArgumentException("");
          }
          var6_int = this.field_c.field_c;
          if (param4 < 33) {
            var23 = (int[]) null;
            this.a(30, -125, (int[]) null, 92, 74);
          }
          var7 = 0;
          stackIn_13_0 = (param3 <= param1) ? param3 : param1;
          var8 = stackIn_13_0;
          var9 = param1 >> 1;
          var10 = param3 >> 1;
          var11 = param0;
          var12 = new byte[var6_int * (var10 * var9)];
          while (true) {
            jaggl.OpenGL.glTexImage2Dub(param2, var7, this.e(-89), param1, param3, 0, te.a(-21339, this.field_c), 5121, var11, 0);
            if (1 >= var8) {
              return;
            }
            var15 = var6_int * param1;
            for (var16 = 0; var6_int > var16; var16++) {
              var17 = var16;
              var18 = var16;
              var19 = var18 + var15;
              for (var20 = 0; var20 < var10; var20++) {
                for (var21 = 0; var21 < var9; var21++) {
                  var14 = var11[var18];
                  var18 = var18 + var6_int;
                  var14 = var14 + var11[var18];
                  var14 = var14 + var11[var19];
                  var18 = var18 + var6_int;
                  var19 = var19 + var6_int;
                  var14 = var14 + var11[var19];
                  var12[var17] = (byte)(var14 >> 2);
                  var19 = var19 + var6_int;
                  var17 = var17 + var6_int;
                }
                var19 = var19 + var15;
                var18 = var18 + var15;
              }
            }
            var13 = var12;
            var12 = var11;
            var11 = var13;
            param1 = var9;
            param3 = var10;
            var9 = var9 >> 1;
            var7++;
            var8 = var8 >> 1;
            var10 = var10 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("bp.L(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        this.d(22989);
        super.finalize();
    }

    private final void b(int param0, int param1) {
        this.field_e.field_Cb = this.field_e.field_Cb - param0;
        if (param1 != 25109) {
          this.field_c = (iw) null;
        }
        this.field_e.field_Cb = this.field_e.field_Cb + this.f(3);
    }

    public void a(ji param0, int param1) {
        ji var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 15149) {
            var4 = (ji) null;
            this.a((ji) null, 12);
          }
          if (this.field_a != param0) {
            this.field_a = param0;
            this.b((byte) -122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("bp.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(byte param0) {
        this.field_e.a((ed) (this), 112);
        if (ao.field_y == this.field_a) {
          jaggl.OpenGL.glTexParameteri(this.field_h, 10241, this.field_d ? 9987 : 9729);
          jaggl.OpenGL.glTexParameteri(this.field_h, 10240, 9729);
        } else {
          jaggl.OpenGL.glTexParameteri(this.field_h, 10241, !this.field_d ? 9728 : 9984);
          jaggl.OpenGL.glTexParameteri(this.field_h, 10240, 9728);
        }
        int var2 = 110 / ((param0 + 69) / 49);
    }

    final int e(int param0) {
        int var2;
        var2 = -58 / ((param0 - 57) / 34);
        if (this.field_g == io.field_g) {
          if (this.field_c == m.field_X) {
            return 6407;
          }
          if (this.field_c == nl.field_p) {
            return 6408;
          }
          if (te.field_f == this.field_c) {
            return 6406;
          }
          if (kd.field_b == this.field_c) {
            return 6409;
          }
          if (ps.field_c == this.field_c) {
            return 6410;
          }
          if (rg.field_A == this.field_c) {
            return 6145;
          }
        } else {
          if (io.field_e == this.field_g) {
            if (m.field_X == this.field_c) {
              return 34843;
            }
            if (nl.field_p == this.field_c) {
              return 34842;
            }
            if (this.field_c == te.field_f) {
              return 34844;
            }
            if (kd.field_b == this.field_c) {
              return 34846;
            }
            if (ps.field_c == this.field_c) {
              return 34847;
            }
            if (this.field_c == rg.field_A) {
              return 6145;
            }
          } else {
            if (this.field_g == io.field_d) {
              if (this.field_c == m.field_X) {
                return 34837;
              }
              if (nl.field_p == this.field_c) {
                return 34836;
              }
              if (this.field_c == te.field_f) {
                return 34838;
              }
              if (kd.field_b == this.field_c) {
                return 34840;
              }
              if (this.field_c == ps.field_c) {
                return 34841;
              }
              if (this.field_c == rg.field_A) {
                return 6145;
              }
            }
          }
        }
        throw new IllegalStateException();
    }

    private final void d(int param0) {
        if (this.field_f > 0) {
          this.field_e.a(this.f(3), this.field_f, (byte) 23);
          this.field_f = 0;
        }
        if (param0 != 22989) {
          int[] var3 = (int[]) null;
          this.a(-4, 71, (int[]) null, -10, -31);
        }
    }

    public void a(int param0) {
        int var2 = this.field_e.t(param0 - 8983);
        int var3 = this.field_e.field_Hc[var2];
        if (this.field_h != var3) {
          if (var3 != 0) {
            jaggl.OpenGL.glBindTexture(var3, 0);
            jaggl.OpenGL.glDisable(var3);
          }
          jaggl.OpenGL.glEnable(this.field_h);
          this.field_e.field_Hc[var2] = this.field_h;
        }
        jaggl.OpenGL.glBindTexture(this.field_h, this.field_f);
        if (param0 != 8905) {
          this.a(-104);
        }
    }

    final static void a(int param0, int param1) {
        pj.field_p = 1000000000L / (long)param0;
        if (param1 != 26175) {
          bp.a(92, -56);
        }
    }

    bp(on param0, int param1, iw param2, io param3, int param4, boolean param5) {
        this.field_a = ao.field_y;
        try {
          this.field_g = param3;
          this.field_d = param5 ? true : false;
          this.field_h = param1;
          this.field_e = param0;
          this.field_c = param2;
          this.field_b = param4;
          jaggl.OpenGL.glGenTextures(1, dq.field_s, 0);
          this.field_f = dq.field_s[0];
          this.b((byte) 78);
          this.b(0, 25109);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "bp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int f(int param0) {
        int var2 = this.field_g.field_j * this.field_c.field_c * this.field_b;
        if (param0 != 3) {
          this.field_c = (iw) null;
        }
        return this.field_d ? 4 * var2 / 3 : var2;
    }

    static {
    }
}
