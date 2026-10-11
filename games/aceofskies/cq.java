/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cq implements jj {
    private boolean field_f;
    private int field_d;
    jc field_g;
    hd field_h;
    la field_c;
    private int field_b;
    int field_e;
    private ke field_a;

    protected final void finalize() throws Throwable {
        this.b(-1);
        super.finalize();
    }

    private final int c(int param0) {
        if (param0 > -1) {
          this.field_d = 80;
        }
        int var2 = this.field_b * (this.field_h.field_b * this.field_c.field_c);
        return this.field_f ? 4 * var2 / 3 : var2;
    }

    private final void a(int param0, int param1) {
        this.field_g.field_jc = this.field_g.field_jc - param0;
        this.field_g.field_jc = this.field_g.field_jc + this.c(-19);
        if (param1 != 4) {
          this.a(false);
        }
    }

    public void a(byte param0) {
        if (param0 != -50) {
          this.field_c = (la) null;
        }
        int var2 = this.field_g.M(7693);
        int var3 = this.field_g.field_Hc[var2];
        if (var3 != this.field_e) {
          if (var3 != 0) {
            jaggl.OpenGL.glBindTexture(var3, 0);
            jaggl.OpenGL.glDisable(var3);
          }
          jaggl.OpenGL.glEnable(this.field_e);
          this.field_g.field_Hc[var2] = this.field_e;
        }
        jaggl.OpenGL.glBindTexture(this.field_e, this.field_d);
    }

    final void a(float[] param0, boolean param1, int param2, int param3, int param4) {
        int var16 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
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
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param2 > 0 &&
            !mg.a(param2, (byte) 0)) {
            throw new IllegalArgumentException("");
          }
          if (param3 > 0 &&
            !mg.a(param3, (byte) 103)) {
            throw new IllegalArgumentException("");
          }
          if (!param1) {
            return;
          }
          var6_int = this.field_h.field_b;
          var7 = 0;
          stackIn_13_0 = (param3 <= param2) ? param3 : param2;
          var8 = stackIn_13_0;
          var9 = param2 >> 1;
          var10 = param3 >> 1;
          var11 = param0;
          var12 = new float[var6_int * var9 * var10];
          while (true) {
            jaggl.OpenGL.glTexImage2Df(param4, var7, this.a(false), param2, param3, 0, gq.a(this.field_h, -29824), 5126, var11, 0);
            if (1 >= var8) {
              return;
            }
            var15 = var6_int * param2;
            var13 = var12;
            for (var16 = 0; var16 < var6_int; var16++) {
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
                  var19 = var19 + var6_int;
                  var12[var17] = var14 * 0.25f;
                  var17 = var17 + var6_int;
                }
                var19 = var19 + var15;
                var18 = var18 + var15;
              }
            }
            var12 = var11;
            param2 = var9;
            param3 = var10;
            var11 = var13;
            var10 = var10 >> 1;
            var8 = var8 >> 1;
            var7++;
            var9 = var9 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("cq.H(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void d(byte param0) {
        this.field_g.a((jj) (this), -9135);
        int var2 = 122 / ((param0 - 86) / 39);
        if (fg.field_A == this.field_a) {
          jaggl.OpenGL.glTexParameteri(this.field_e, 10241, this.field_f ? 9987 : 9729);
          jaggl.OpenGL.glTexParameteri(this.field_e, 10240, 9729);
        } else {
          jaggl.OpenGL.glTexParameteri(this.field_e, 10241, this.field_f ? 9984 : 9728);
          jaggl.OpenGL.glTexParameteri(this.field_e, 10240, 9728);
        }
    }

    private final void b(int param0) {
        if (param0 > ~this.field_d) {
          this.field_g.b(param0 + 4, this.c(-88), this.field_d);
          this.field_d = 0;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3, byte param4) {
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
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (0 < param3 &&
            !mg.a(param3, (byte) 114)) {
            throw new IllegalArgumentException("");
          }
          if (param1 > 0 &&
            !mg.a(param1, (byte) -117)) {
            throw new IllegalArgumentException("");
          }
          var6_int = this.field_h.field_b;
          var7 = 0;
          if (param4 != 107) {
            return;
          }
          stackIn_13_0 = (param3 < param1) ? param3 : param1;
          var8 = stackIn_13_0;
          var9 = param3 >> 1;
          var10 = param1 >> 1;
          var11 = param2;
          var12 = new byte[var10 * (var9 * var6_int)];
          while (true) {
            jaggl.OpenGL.glTexImage2Dub(param0, var7, this.a(false), param3, param1, 0, gq.a(this.field_h, -29824), 5121, var11, 0);
            if (var8 <= 1) {
              return;
            }
            var15 = param3 * var6_int;
            for (var16 = 0; var6_int > var16; var16++) {
              var17 = var16;
              var18 = var16;
              var19 = var15 + var18;
              for (var20 = 0; var10 > var20; var20++) {
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
                var18 = var18 + var15;
                var19 = var19 + var15;
              }
            }
            var13 = var12;
            var12 = var11;
            param3 = var9;
            param1 = var10;
            var11 = var13;
            var9 = var9 >> 1;
            var10 = var10 >> 1;
            var8 = var8 >> 1;
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("cq.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int[] param3, int param4) {
        int var24 = 0;
        int var25 = 0;
        int incrementValue$4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
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
        var26 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param2 > 0 &&
            !mg.a(param2, (byte) -12)) {
            throw new IllegalArgumentException("");
          }
          if (param1 > 0 &&
            !mg.a(param1, (byte) 118)) {
            throw new IllegalArgumentException("");
          }
          if (lc.field_g != this.field_h) {
            throw new IllegalArgumentException("");
          }
          var6_int = 0;
          stackIn_14_0 = (param1 > param2) ? param2 : param1;
          var7 = stackIn_14_0;
          var8 = param2 >> 1;
          var9 = param1 >> 1;
          var10 = param3;
          var11 = new int[var8 * var9];
          if (param0 != -110) {
            return;
          }
          while (true) {
            jaggl.OpenGL.glTexImage2Di(param4, var6_int, this.a(false), param2, param1, 0, 32993, this.field_g.field_Bc, var10, 0);
            if (var7 <= 1) {
              return;
            }
            var13 = 0;
            var22 = 0;
            var23 = param2 + var22;
            for (var24 = 0; var24 < var9; var24++) {
              for (var25 = 0; var8 > var25; var25++) {
                var14 = var10[var22++];
                var16 = var10[var23++];
                var15 = var10[var22++];
                var20 = var14 & 255;
                var19 = 255 & var14 >> 8;
                var21 = var14 >> 24 & 255;
                var18 = 255 & var14 >> 16;
                var17 = var10[var23++];
                var18 = var18 + (var15 >> 16 & 255);
                var19 = var19 + (255 & var15 >> 8);
                var21 = var21 + (var15 >> 24 & 255);
                var20 = var20 + (var15 & 255);
                var18 = var18 + ((16731470 & var16) >> 16);
                var19 = var19 + ((65356 & var16) >> 8);
                var20 = var20 + (var16 & 255);
                var21 = var21 + (var16 >> 24 & 255);
                var21 = var21 + (255 & var17 >> 24);
                var20 = var20 + (255 & var17);
                var19 = var19 + (var17 >> 8 & 255);
                var18 = var18 + (255 & var17 >> 16);
                incrementValue$4 = var13;
                var13++;
                var11[incrementValue$4] = vo.a(pg.a(255, var20 >> 2), vo.a(vo.a(pg.a(1020, var18) << 14, pg.a(var21, 1020) << 22), pg.a(var19 << 6, 65280)));
              }
              var23 = var23 + param2;
              var22 = var22 + param2;
            }
            var12 = var11;
            var11 = var10;
            var10 = var12;
            param1 = var9;
            param2 = var8;
            var9 = var9 >> 1;
            var6_int++;
            var8 = var8 >> 1;
            var7 = var7 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("cq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.a(true);
        }
        if (this.field_c != la.field_h) {
          if (this.field_c == la.field_d) {
            if (this.field_h == wo.field_n) {
              return 34843;
            }
            if (this.field_h == lc.field_g) {
              return 34842;
            }
            if (this.field_h == ro.field_o) {
              return 34844;
            }
            if (this.field_h == wf.field_d) {
              return 34846;
            }
            if (hh.field_c == this.field_h) {
              return 34847;
            }
            if (this.field_h == aj.field_r) {
              return 6145;
            }
          } else {
            if (this.field_c == la.field_i) {
              if (this.field_h == wo.field_n) {
                return 34837;
              }
              if (lc.field_g == this.field_h) {
                return 34836;
              }
              if (ro.field_o == this.field_h) {
                return 34838;
              }
              if (wf.field_d == this.field_h) {
                return 34840;
              }
              if (hh.field_c == this.field_h) {
                return 34841;
              }
              if (this.field_h == aj.field_r) {
                return 6145;
              }
            }
          }
        } else {
          if (wo.field_n == this.field_h) {
            return 6407;
          }
          if (lc.field_g == this.field_h) {
            return 6408;
          }
          if (this.field_h == ro.field_o) {
            return 6406;
          }
          if (this.field_h == wf.field_d) {
            return 6409;
          }
          if (this.field_h == hh.field_c) {
            return 6410;
          }
          if (this.field_h == aj.field_r) {
            return 6145;
          }
        }
        throw new IllegalStateException();
    }

    cq(jc param0, int param1, hd param2, la param3, int param4, boolean param5) {
        this.field_a = fg.field_A;
        try {
          this.field_e = param1;
          this.field_h = param2;
          this.field_g = param0;
          this.field_f = param5 ? true : false;
          this.field_b = param4;
          this.field_c = param3;
          jaggl.OpenGL.glGenTextures(1, tn.field_w, 0);
          this.field_d = tn.field_w[0];
          this.d((byte) 127);
          this.a(0, 4);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "cq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public void a(ke param0, int param1) {
        ke var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_a != param0) {
            this.field_a = param0;
            this.d((byte) 127);
          }
          if (param1 != -31662) {
            var4 = (ke) null;
            this.a((ke) null, 89);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cq.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
