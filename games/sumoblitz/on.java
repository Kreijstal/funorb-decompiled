/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends aw {
    private jaggl.OpenGL field_Yc;
    private jn field_Kc;
    private jn field_Gc;
    private jn field_Zc;
    private jn field_Xc;
    private jn field_Vc;
    private jn field_Pc;
    private jn field_Fc;
    private boolean field_Dc;
    private boolean field_Lc;
    private sc[] field_zc;
    jaggl.MapBuffer field_Qc;
    private int field_ad;
    private long field_Cc;
    private boolean field_Sc;
    private boolean field_Tc;
    private boolean field_Uc;
    jaggl.MapBuffer field_Bc;
    int[] field_Hc;
    boolean field_Jc;
    private boolean field_bd;
    int field_Ec;
    boolean field_Nc;
    private boolean field_Ic;
    boolean field_Mc;
    private String field_Rc;
    boolean field_Ac;
    private String field_Wc;
    private int field_Oc;

    final void Y(int param0) {
        ko var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        this.k(1);
        for (var2 = 0; this.field_ub > var2; var2++) {
          var3 = this.field_pb[var2];
          var4 = var3.c((byte) 50);
          var5 = 16386 + var2;
          var6 = var3.a(0) / 255.0f;
          fv.field_v[0] = (float)var3.a((byte) 97);
          fv.field_v[1] = (float)var3.d((byte) 109);
          fv.field_v[2] = (float)var3.c(true);
          fv.field_v[3] = 1.0f;
          jaggl.OpenGL.glLightfv(var5, 4611, fv.field_v, 0);
          fv.field_v[0] = var6 * (float)eb.a(var4 >> 16, 255);
          fv.field_v[3] = 1.0f;
          fv.field_v[1] = (float)eb.a(var4 >> 8, 255) * var6;
          fv.field_v[2] = var6 * (float)eb.a(255, var4);
          jaggl.OpenGL.glLightfv(var5, 4609, fv.field_v, 0);
          jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.c(0) * var3.c(0)));
          jaggl.OpenGL.glEnable(var5);
        }
        while (var2 < this.field_Ab) {
          jaggl.OpenGL.glDisable(16386 + var2);
          var2++;
        }
        if (param0 >= -83) {
          this.field_Ac = true;
        }
        super.Y(-120);
    }

    final Object a(java.awt.Canvas param0, int param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        iw var5 = null;
        Long stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_long = this.field_Yc.prepareSurface(param0);
          if (param1 != 3) {
            var5 = (iw) null;
            this.a((io) null, (iw) null, -119, -113, (byte) -97);
          }
          if (var3_long == -1L) {
            throw new RuntimeException();
          }
          stackIn_6_0 = new Long(var3_long);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("on.EA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1, boolean param2, boolean param3, mi param4) {
        int var6_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          jaggl.OpenGL.glTexEnvi(8960, 34176 + param1, kq.a(81, param4));
          var6_int = 45 / ((16 - param0) / 56);
          if (!param2) {
            stackIn_7_0 = 8960;
            stackIn_7_1 = param1 + 34192;
            if (param3) {
              stackIn_8_2 = 769;
            } else {
              stackIn_8_2 = 768;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_7_0, stackIn_7_1, stackIn_8_2);
          } else {
            stackIn_3_0 = 8960;
            stackIn_3_1 = param1 + 34192;
            if (!param3) {
              stackIn_4_2 = 770;
            } else {
              stackIn_4_2 = 771;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_3_0, stackIn_3_1, stackIn_4_2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("on.ED(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void db(int param0) {
        fv.field_v[3] = 1.0f;
        fv.field_v[1] = this.field_jb * this.field_S;
        fv.field_v[0] = this.field_S * this.field_J;
        fv.field_v[2] = this.field_Xb * this.field_S;
        jaggl.OpenGL.glLightfv(16384, 4609, fv.field_v, 0);
        fv.field_v[3] = 1.0f;
        fv.field_v[1] = -this.field_hb * this.field_jb;
        fv.field_v[0] = this.field_J * -this.field_hb;
        fv.field_v[2] = this.field_Xb * -this.field_hb;
        jaggl.OpenGL.glLightfv(16385, 4609, fv.field_v, param0);
    }

    final void X(int param0) {
        jaggl.OpenGL.glTexEnvi(8960, 34162, rq.a(-9267, this.field_B[this.field_mc]));
        if (param0 >= -80) {
          this.b(true);
        }
    }

    final synchronized void a(int param0, long param1) {
        ms var4 = new ms();
        if (param0 != 33984) {
          int[] var5 = (int[]) null;
          this.SA(-105, -54, 124, -38, (int[]) null, -85, -29);
        }
        var4.field_h = param1;
        this.field_Fc.a(var4, (byte) 39);
    }

    final void i(byte param0) {
        if (this.field_Rb &&
          this.field_Bb &&
          this.field_Kb >= 0) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
        if (param0 != -119) {
          this.field_Uc = true;
        }
    }

    final synchronized void f(int param0) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        int var2;
        int var4;
        ge var5;
        ge var6;
        ge var7;
        ge var8;
        ge var9;
        ms var10;
        ms var11;
        ge var12;
        var4 = Sumoblitz.field_L ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        while (!this.field_Gc.a((byte) -100)) {
          var5 = (ge) (this.field_Gc.c(9));
          incrementValue$5 = var2;
          var2++;
          gw.field_A[incrementValue$5] = (int)var5.field_h;
          this.field_o = this.field_o - var5.field_m;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteBuffersARB(var2, gw.field_A, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteBuffersARB(var2, gw.field_A, 0);
          var2 = 0;
        }
        while (!this.field_Zc.a((byte) -105)) {
          var6 = (ge) (this.field_Zc.c(9));
          incrementValue$4 = var2;
          var2++;
          gw.field_A[incrementValue$4] = (int)var6.field_h;
          this.field_Cb = this.field_Cb - var6.field_m;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteTextures(var2, gw.field_A, 0);
          var2 = 0;
        }
        if (var2 <= 0) {
          while (!this.field_Xc.a((byte) -73)) {
            var7 = (ge) (this.field_Xc.c(9));
            incrementValue$1 = var2;
            var2++;
            gw.field_A[incrementValue$1] = var7.field_m;
            if (1000 != var2) {
              continue;
            }
            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
            var2 = 0;
          }
        } else {
          jaggl.OpenGL.glDeleteTextures(var2, gw.field_A, 0);
          var2 = 0;
          while (!this.field_Xc.a((byte) -73)) {
            var7 = (ge) (this.field_Xc.c(9));
            incrementValue$0 = var2;
            var2++;
            gw.field_A[incrementValue$0] = var7.field_m;
            if (1000 != var2) {
              continue;
            }
            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
            var2 = 0;
          }
        }
        if (var2 <= 0) {
          while (!this.field_Vc.a((byte) -123)) {
            var8 = (ge) (this.field_Vc.c(9));
            incrementValue$3 = var2;
            var2++;
            gw.field_A[incrementValue$3] = (int)var8.field_h;
            this.field_pc = this.field_pc - var8.field_m;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
            var2 = 0;
          }
        } else {
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
          var2 = 0;
          while (!this.field_Vc.a((byte) -123)) {
            var8 = (ge) (this.field_Vc.c(9));
            incrementValue$2 = var2;
            var2++;
            gw.field_A[incrementValue$2] = (int)var8.field_h;
            this.field_pc = this.field_pc - var8.field_m;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
            var2 = 0;
          }
        }
        if (var2 <= 0) {
          while (!this.field_Kc.a((byte) -88)) {
            var9 = (ge) (this.field_Kc.c(9));
            jaggl.OpenGL.glDeleteLists((int)var9.field_h, var9.field_m);
          }
          while (!this.field_Pc.a((byte) -68)) {
            var10 = this.field_Pc.c(9);
            jaggl.OpenGL.glDeleteProgramARB((int)var10.field_h);
          }
          while (!this.field_Fc.a((byte) -95)) {
            var11 = this.field_Fc.c(9);
            jaggl.OpenGL.glDeleteObjectARB(var11.field_h);
          }
          while (!this.field_Kc.a((byte) -68)) {
            var12 = (ge) (this.field_Kc.c(9));
            jaggl.OpenGL.glDeleteLists((int)var12.field_h, var12.field_m);
          }
          if (!(this.h(64) <= 100663296) &&
            !(wq.a(-117) <= 60000L + this.field_Cc)) {
            System.gc();
            this.field_Cc = wq.a(-39);
          }
        } else {
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
          var2 = 0;
          while (!this.field_Kc.a((byte) -88)) {
            var9 = (ge) (this.field_Kc.c(9));
            jaggl.OpenGL.glDeleteLists((int)var9.field_h, var9.field_m);
          }
          while (!this.field_Pc.a((byte) -68)) {
            var10 = this.field_Pc.c(9);
            jaggl.OpenGL.glDeleteProgramARB((int)var10.field_h);
          }
          while (!this.field_Fc.a((byte) -95)) {
            var11 = this.field_Fc.c(9);
            jaggl.OpenGL.glDeleteObjectARB(var11.field_h);
          }
          while (!this.field_Kc.a((byte) -68)) {
            var12 = (ge) (this.field_Kc.c(9));
            jaggl.OpenGL.glDeleteLists((int)var12.field_h, var12.field_m);
          }
          if (!(this.h(64) <= 100663296) &&
            !(wq.a(-117) <= 60000L + this.field_Cc)) {
            System.gc();
            this.field_Cc = wq.a(-39);
          }
        }
        super.f(param0);
    }

    final ru a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, iw param7) {
        RuntimeException var9 = null;
        sa var10 = null;
        sa stackIn_7_0 = null;
        or stackIn_10_0 = null;
        sa stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 > -61) {
            this.a(66, false);
          }
          if (!this.field_Ic && (!rm.a(param1, -116) ||
            !rm.a(param5, -122))) {
            if (this.field_bd) {
              stackIn_10_0 = new or(this, param7, param1, param5, param4, param0, param3);
              return (ru) ((Object) stackIn_10_0);
            }
            var10 = new sa(this, param7, io.field_d, hn.a(false, param1), hn.a(false, param5));
            var10.a(0, param7, param5, 0, 14137, param0, param1, param4, param3);
            stackIn_12_0 = var10;
            return (ru) ((Object) stackIn_12_0);
          }
          stackIn_7_0 = new sa(this, param7, param1, param5, param2, param4, param0, param3);
          return (ru) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_15_0 = var9;
          stackIn_15_1 = new StringBuilder().append("on.SC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        this.field_Tb = (float)(-this.field_Nb + this.field_Yb);
        this.field_E = this.field_Tb - (float)this.field_Kb;
        if (this.field_E < (float)this.field_oc) {
          this.field_E = (float)this.field_oc;
        }
        jaggl.OpenGL.glFogf(2915, this.field_E);
        jaggl.OpenGL.glFogf(2916, this.field_Tb);
        fv.field_v[1] = (float)eb.a(65280, this.field_C) / 65280.0f;
        if (!param0) {
          return;
        }
        fv.field_v[2] = (float)eb.a(255, this.field_C) / 255.0f;
        fv.field_v[0] = (float)eb.a(this.field_C, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, fv.field_v, 0);
    }

    final void GA(int param0) {
        jaggl.OpenGL.glClearColor((float)(16711680 & param0) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void i(int param0) {
        if (param0 != 0) {
          ck var3 = (ck) null;
          this.a(-111, -93, -40, (ck) null);
        }
        jaggl.OpenGL.glViewport(this.field_r, this.field_y, this.field_rb, this.field_Sb);
    }

    final boolean a(byte param0, io param1, iw param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -85 / ((70 - param0) / 42);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("on.HC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
          jaggl.OpenGL.glDisable(32925);
        } else {
          jaggl.OpenGL.glEnable(32925);
        }
        if (param0 != 1) {
          byte[] var4 = (byte[]) null;
          this.a((iw) null, -18, -125, 65, (byte[]) null, (byte) -115, -5, true);
        }
    }

    final void I(int param0) {
        if (param0 != 0) {
          this.field_Ic = false;
        }
        if (!this.field_Z) {
          jaggl.OpenGL.glDisable(16384);
          jaggl.OpenGL.glDisable(16385);
        } else {
          jaggl.OpenGL.glEnable(16384);
          jaggl.OpenGL.glEnable(16385);
        }
    }

    final void a(int param0, hq param1) {
        int var16 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_24_0 = 0;
        boolean stackIn_31_1 = false;
        int stackIn_35_0 = 0;
        int stackIn_38_1 = 0;
        boolean stackIn_45_1 = false;
        boolean stackIn_53_1 = false;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hu var10 = null;
        sc var11 = null;
        int var12 = 0;
        int var13 = 0;
        long var14 = 0L;
        ls var17 = null;
        int var18 = 0;
        hu[] var19 = null;
        int var9Lifetime1;
        int var9Lifetime2;
        var18 = Sumoblitz.field_L ? 1 : 0;
        try {
          var19 = ((fq) (param1)).field_g;
          var4 = 0;
          var6 = 82 / ((param0 - 71) / 45);
          var5 = 0;
          var7 = 0;
          var8 = 0;
          for (var9 = 0; var9 < var19.length; var9++) {
            var10 = var19[var9];
            var11 = this.field_zc[var9];
            var12 = 0;
            var13 = var11.g(34962);
            var14 = var11.c(-24168);
            var11.e(1175993800);
            for (var16 = 0; var10.a(44115) > var16; var16++) {
              var17 = var10.a(-80, var16);
              if (var17 == ls.field_b) {
                jaggl.OpenGL.glVertexPointer(3, 5126, var13, var14 + (long)var12);
                var8 = 1;
              } else {
                if (ls.field_c == var17) {
                  var7 = 1;
                  jaggl.OpenGL.glNormalPointer(5126, var13, (long)var12 + var14);
                } else {
                  if (var17 != ls.field_g) {
                    if (ls.field_j == var17) {
                      incrementValue$0 = var4;
                      var4++;
                      jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$0);
                      jaggl.OpenGL.glTexCoordPointer(1, 5126, var13, var14 + (long)var12);
                    } else {
                      if (var17 == ls.field_e) {
                        incrementValue$1 = var4;
                        var4++;
                        jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$1);
                        jaggl.OpenGL.glTexCoordPointer(2, 5126, var13, var14 + (long)var12);
                      } else {
                        if (ls.field_d != var17) {
                          if (var17 == ls.field_a) {
                            incrementValue$2 = var4;
                            var4++;
                            jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$2);
                            jaggl.OpenGL.glTexCoordPointer(4, 5126, var13, (long)var12 + var14);
                          }
                        } else {
                          incrementValue$3 = var4;
                          var4++;
                          jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$3);
                          jaggl.OpenGL.glTexCoordPointer(3, 5126, var13, var14 + (long)var12);
                        }
                      }
                    }
                  } else {
                    jaggl.OpenGL.glColorPointer(4, 5121, var13, var14 + (long)var12);
                    var5 = 1;
                  }
                }
              }
              var12 = var12 + var17.field_k;
            }
          }
          stackIn_24_0 = (this.field_Lc) ? 0 : 1;
          if (stackIn_24_0 == var8) {
            if (var8 != 0) {
              jaggl.OpenGL.glEnableClientState(32884);
            } else {
              jaggl.OpenGL.glDisableClientState(32884);
            }
            stackIn_31_1 = (var8 != 0);
            this.field_Lc = stackIn_31_1;
          }
          stackIn_35_0 = (var7 != 0) ? 0 : 1;
          if (this.field_Sc) {
            stackIn_38_1 = 0;
          } else {
            stackIn_38_1 = 1;
          }
          if (stackIn_35_0 != stackIn_38_1) {
            if (var7 == 0) {
              jaggl.OpenGL.glDisableClientState(32885);
            } else {
              jaggl.OpenGL.glEnableClientState(32885);
            }
            stackIn_45_1 = (var7 != 0);
            this.field_Sc = stackIn_45_1;
          }
          if (var5 != (this.field_Tc ? 1 : 0)) {
            if (var5 != 0) {
              jaggl.OpenGL.glEnableClientState(32886);
            } else {
              jaggl.OpenGL.glDisableClientState(32886);
            }
            stackIn_53_1 = (var5 != 0);
            this.field_Tc = stackIn_53_1;
          }
          if (this.field_ad < var4) {
            for (var9Lifetime1 = this.field_ad; var4 > var9Lifetime1; var9Lifetime1++) {
              jaggl.OpenGL.glClientActiveTexture(var9Lifetime1 + 33984);
              jaggl.OpenGL.glEnableClientState(32888);
            }
            this.field_ad = var4;
            return;
          }
          if (var4 < this.field_ad) {
            for (var9Lifetime2 = var4; var9Lifetime2 < this.field_ad; var9Lifetime2++) {
              jaggl.OpenGL.glClientActiveTexture(var9Lifetime2 + 33984);
              jaggl.OpenGL.glDisableClientState(32888);
            }
            this.field_ad = var4;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_68_0 = var3;
          stackIn_68_1 = new StringBuilder().append("on.AE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
        }
    }

    final void q(byte param0) {
        if (param0 >= -74) {
          this.field_ad = 99;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, rq.a(-9267, this.field_K[this.field_mc]));
    }

    final void b() {
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
          this.L(-25);
          this.a((ed) null, 126);
          this.e(0, 13);
          this.k(1);
          jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
          jaggl.OpenGL.glRasterPos2i(param0, param1);
          jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_Ec, param4, param5);
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "on.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean a() {
        return false;
    }

    final void V(int param0) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (param0 != 26803) {
          this.field_Zc = (jn) null;
        }
        if (ar.field_L != this.field_wb[this.field_mc]) {
          jaggl.OpenGL.glLoadMatrixf(this.field_V[this.field_mc].b(-107, pq.field_y), 0);
        } else {
          jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void a(vc param0) {
    }

    final ef a(int param0, byte param1, int[][] param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        rc stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 57 % ((-23 - param1) / 48);
          stackIn_1_0 = new rc(this, param0, param3, param2);
          return (ef) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("on.SD(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(')').toString());
        }
    }

    on(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, ki param4, int param5) {
        super(param1, new Long(param2), param3, param4, param5, 1);
        int var15 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Throwable var8 = null;
        RuntimeException var8_ref = null;
        String[] var9 = null;
        int var10_int = 0;
        NumberFormatException var10 = null;
        int var11_int = 0;
        Throwable var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        String var16 = null;
        Exception var17 = null;
        String var20 = null;
        String var21 = null;
        int[] var26 = null;
        int[] var27 = null;
        Object var28 = null;
        Object var29 = null;
        Object var30 = null;
        CharSequence var31 = null;
        CharSequence var32 = null;
        CharSequence var33 = null;
        var28 = null;
        var29 = null;
        var30 = null;
        this.field_Kc = new jn();
        this.field_Gc = new jn();
        this.field_Zc = new jn();
        this.field_Xc = new jn();
        this.field_Vc = new jn();
        this.field_Pc = new jn();
        this.field_Fc = new jn();
        this.field_zc = new sc[16];
        this.field_Qc = new jaggl.MapBuffer();
        this.field_Bc = new jaggl.MapBuffer();
        try {
          try {
            this.field_Yc = param0;
            this.field_Yc.b();
            this.field_Wc = jaggl.OpenGL.glGetString(7936).toLowerCase();
            this.field_Rc = jaggl.OpenGL.glGetString(7937).toLowerCase();
            if (this.field_Wc.indexOf("microsoft") == -1 &&
              -1 == this.field_Wc.indexOf("brian paul") &&
              -1 == this.field_Wc.indexOf("mesa")) {
              var20 = jaggl.OpenGL.glGetString(7938);
              var9 = cn.a(' ', var20.replace('.', ' '), -27224);
              if (var9.length < 2) {
                throw new RuntimeException("");
              }
              try {
                var10_int = no.a((byte) -128, (CharSequence) ((Object) var9[0]));
                var11_int = no.a((byte) -128, (CharSequence) ((Object) var9[1]));
                this.field_Oc = var11_int + 10 * var10_int;
              } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10 = (NumberFormatException) (Object) decompiledCaughtException;
                throw new RuntimeException("");
              }
              if (this.field_Oc < 12) {
                throw new RuntimeException("");
              }
              if (!this.field_Yc.a("GL_ARB_multitexture")) {
                throw new RuntimeException("");
              }
              if (!this.field_Yc.a("GL_ARB_texture_env_combine")) {
                throw new RuntimeException("");
              }
              var26 = new int[1];
              jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
              this.field_cc = var26[0];
              if (2 > this.field_cc) {
                throw new RuntimeException("");
              }
              this.field_bc = 8;
              this.field_Nc = this.field_Yc.a("GL_ARB_vertex_buffer_object");
              this.field_Yc.a("GL_ARB_multisample");
              this.field_bd = this.field_Yc.a("GL_ARB_texture_rectangle");
              this.field_W = this.field_Yc.a("GL_ARB_texture_cube_map");
              this.field_Ic = this.field_Yc.a("GL_ARB_texture_non_power_of_two");
              this.field_Eb = this.field_Yc.a("GL_EXT_texture3D");
              this.field_Jc = this.field_Yc.a("GL_ARB_vertex_shader");
              this.field_Ac = this.field_Yc.a("GL_ARB_vertex_program");
              this.field_Mc = this.field_Yc.a("GL_ARB_fragment_shader");
              this.field_Yc.a("GL_ARB_fragment_program");
              this.field_Hc = new int[this.field_cc];
              if (jaclib.memory.Stream.b()) {
                stackIn_21_1 = 33639;
              } else {
                stackIn_21_1 = 5121;
              }
              this.field_Ec = stackIn_21_1;
              if (this.field_Rc.indexOf("radeon") != -1) {
                var11_int = 0;
                var12 = 0;
                var13 = 0;
                var14 = cn.a(' ', this.field_Rc.replace('/', ' '), -27224);
                for (var15 = 0; var14.length > var15; var15++) {
                  var21 = var14[var15];
                  var16 = var21;
                  var16 = var21;
                  var16 = var21;
                  try {
                    boolean decompiledFrameRemainder0 = true;
                    if (0 < var21.length()) {
                      if (120 == var21.charAt(0) &&
                        3 <= var21.length()) {
                        var31 = (CharSequence) ((Object) var21.substring(1, 3));
                        if (jf.a(-13181, var31)) {
                          var16 = var21.substring(1);
                          var13 = 1;
                        }
                      }
                      if (var16.equals("hd")) {
                        var12 = 1;
                      } else {
                        if (var16.startsWith("hd")) {
                          var12 = 1;
                          var16 = var16.substring(2);
                        }
                        if (var16.length() >= 4) {
                          var32 = (CharSequence) ((Object) var16.substring(0, 4));
                          if (jf.a(-13181, var32)) {
                            var33 = (CharSequence) ((Object) var16.substring(0, 4));
                            var11_int = no.a((byte) -127, var33);
                            decompiledRegionSelector0 = 1;
                            decompiledFrameRemainder0 = false;
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      decompiledRegionSelector0 = 0;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var17 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                  }
                  if (decompiledRegionSelector0 == 0) {
                    continue;
                  }
                  break;
                }
                if (var13 == 0 &&
                  var12 == 0) {
                  if (var11_int >= 7000 &&
                    var11_int <= 7999) {
                    this.field_Nc = false;
                  }
                  if (var11_int >= 7000 &&
                    var11_int <= 9250) {
                    this.field_Eb = false;
                  }
                }
                this.field_bd = this.field_bd & this.field_Yc.a("GL_ARB_half_float_pixel");
              }
              if (-1 != this.field_Wc.indexOf("intel")) {
              }
              if (this.field_Nc) {
                try {
                  var27 = new int[1];
                  jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                } catch (java.lang.Throwable decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var11 = decompiledCaughtException;
                  throw new RuntimeException("");
                }
              }
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.Throwable decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var8 = decompiledCaughtException;
            var8.printStackTrace();
            this.a((byte) -98);
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var8_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var8_ref;
          stackIn_61_1 = new StringBuilder().append("on.<init>(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param4 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param5).append(')').toString());
        }
    }

    final void q(int param0) {
        if (this.field_p) {
          jaggl.OpenGL.glEnable(2929);
        } else {
          jaggl.OpenGL.glDisable(2929);
        }
        if (param0 <= 19) {
          this.field_Fc = (jn) null;
        }
    }

    final void a(hr param0, boolean param1) {
    }

    final void J(int param0) {
        if (param0 != 0) {
          this.field_Oc = 37;
        }
    }

    final void a(int param0, mp param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != lf.field_c) {
            var3_int = ka.a(param1, -116);
            jaggl.OpenGL.glTexGeni(8192, 9472, var3_int);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glTexGeni(8193, 9472, var3_int);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glTexGeni(8194, 9472, var3_int);
            jaggl.OpenGL.glEnable(3170);
          } else {
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
          }
          if (param0 != 13754) {
            this.eb(122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("on.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        ge var4 = new ge(param1);
        var4.field_h = (long)param2;
        this.field_Gc.a((ms) (var4), (byte) 39);
        if (param0 != -99) {
          this.GA(-33);
        }
    }

    final void ab(int param0) {
        fv.field_v[3] = 1.0f;
        fv.field_v[2] = this.field_T * this.field_Xb;
        fv.field_v[1] = this.field_T * this.field_jb;
        fv.field_v[0] = this.field_J * this.field_T;
        jaggl.OpenGL.glLightModelfv(2899, fv.field_v, 0);
        if (param0 != 7) {
          int[] var3 = (int[]) null;
          this.SA(-42, 12, 8, 123, (int[]) null, 81, 90);
        }
    }

    final ru a(io param0, iw param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        or stackIn_8_0 = null;
        sa stackIn_10_0 = null;
        sa stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -99) {
            this.b();
          }
          if (!this.field_Ic && (!rm.a(param3, -124) ||
            !rm.a(param2, -128))) {
            if (!this.field_bd) {
              stackIn_10_0 = new sa(this, param1, param0, hn.a(false, param3), hn.a(false, param2));
              return (ru) ((Object) stackIn_10_0);
            }
            stackIn_8_0 = new or(this, param1, param0, param3, param2);
            return (ru) ((Object) stackIn_8_0);
          }
          stackIn_12_0 = new sa(this, param1, param0, param3, param2);
          return (ru) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("on.NB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void A(int param0) {
        if (this.field_wc) {
          jaggl.OpenGL.glEnable(3089);
        } else {
          jaggl.OpenGL.glDisable(3089);
        }
        int var2 = 104 / ((0 - param0) / 55);
    }

    final void f(boolean param0) {
        if (param0) {
          return;
        }
        if (this.field_I &&
          !this.field_tb) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
    }

    final pv a(byte param0, boolean param1) {
        if (param0 != 51) {
          this.d(83, -4);
        }
        return (pv) ((Object) new sc(this, param1));
    }

    final void F(int param0) {
        jaggl.OpenGL.glScissor(this.field_v + this.field_r, -this.field_yc + (this.field_y + this.field_Sb), this.field_F - this.field_v, this.field_yc - this.field_vb);
        if (param0 != 4) {
          this.field_Oc = -14;
        }
    }

    final void D(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        for (var2 = this.field_cc - 1; var2 >= 0; var2--) {
          jaggl.OpenGL.glActiveTexture(33984 + var2);
          jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
          jaggl.OpenGL.glTexEnvi(8960, 34161, 8448);
          jaggl.OpenGL.glTexEnvi(8960, 34178, 34166);
          jaggl.OpenGL.glTexEnvi(8960, 34162, 8448);
          jaggl.OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34186, 34168);
        jaggl.OpenGL.glShadeModel(7425);
        jaggl.OpenGL.glClearDepth(1.0f);
        jaggl.OpenGL.glDepthFunc(515);
        jaggl.OpenGL.glPolygonMode(1028, 6914);
        jaggl.OpenGL.glEnable(2884);
        jaggl.OpenGL.glCullFace(1029);
        jaggl.OpenGL.glAlphaFunc(516, 0.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glColorMaterial(1028, 5634);
        jaggl.OpenGL.glEnable(2903);
        float[] var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        for (var3 = 0; var3 < 8; var3++) {
          var4 = 16384 + var3;
          jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
          jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
          jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.field_Yc.setSwapInterval(0);
        super.D(param0);
    }

    final synchronized void a(int param0, byte param1) {
        ms var3 = new ms();
        var3.field_h = (long)param0;
        if (param1 != -96) {
          this.b((byte) -39);
        }
        this.field_Pc.a(var3, (byte) 39);
    }

    final void c(int param0, int param1) {
        if (param1 < 83) {
          this.field_Jc = false;
        }
    }

    final void a(int param0, int param1, int param2, ck param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 != 0) {
            this.field_Pc = (jn) null;
          }
          if (param3 == tc.field_g) {
            var6 = 2 * param2;
            var5_int = 1;
          } else {
            if (rv.field_b != param3) {
              if (np.field_h == param3) {
                var6 = 3 * param2;
                var5_int = 4;
              } else {
                if (an.field_d == param3) {
                  var5_int = 6;
                  var6 = param2 + 2;
                } else {
                  if (fq.field_d != param3) {
                    var6 = param2;
                    var5_int = 0;
                  } else {
                    var5_int = 5;
                    var6 = param2 + 2;
                  }
                }
              }
            } else {
              var5_int = 3;
              var6 = param2 + 1;
            }
          }
          jaggl.OpenGL.glDrawArrays(var5_int, param0, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("on.UC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean a(io param0, iw param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 6) {
            return true;
          }
          this.field_Dc = false;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("on.SE(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 != 23) {
          return;
        }
        ge var4 = new ge(param0);
        var4.field_h = (long)param1;
        this.field_Zc.a((ms) (var4), (byte) 39);
    }

    final void x(int param0) {
        this.t((byte) 68);
        if (param0 != 0) {
          this.field_Gc = (jn) null;
        }
    }

    final cr e(int param0, boolean param1) {
        if (param0 != 3) {
          this.a(-106, (byte) -119, (int[][]) null, false);
        }
        return (cr) ((Object) new ju(this, io.field_k, param1));
    }

    final void r(int param0) {
        fv.field_v[3] = (float)(this.field_Ub >>> 24) / 255.0f;
        fv.field_v[2] = (float)eb.a(255, this.field_Ub) / 255.0f;
        fv.field_v[0] = (float)eb.a(16711680, this.field_Ub) / 16711680.0f;
        fv.field_v[param0] = (float)eb.a(this.field_Ub, 65280) / 65280.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, fv.field_v, 0);
    }

    final void a(int param0, boolean param1, byte param2, mi param3) {
        try {
          jaggl.OpenGL.glTexEnvi(8960, 34184 + param0, kq.a(127, param3));
          jaggl.OpenGL.glTexEnvi(8960, param0 + 34200, !param1 ? 770 : 771);
          int var5_int = -37 % ((param2 - 1) / 45);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "on.BF(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(java.awt.Canvas param0, Object param1, int param2) {
        Long var4 = null;
        try {
          if (param2 != 0) {
            this.s(30);
          }
          var4 = (Long) (param1);
          this.field_Yc.releaseSurface(param0, var4.longValue());
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "on.JE(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final nr a(int param0, int param1) {
        return null;
    }

    final float b(byte param0) {
        if (param0 < 125) {
          this.field_Yc = (jaggl.OpenGL) null;
        }
        return 0.0f;
    }

    final void l(byte param0) {
        int var2 = this.field_Hc[this.field_mc];
        if (0 != var2) {
          this.field_Hc[this.field_mc] = 0;
          jaggl.OpenGL.glBindTexture(var2, 0);
          jaggl.OpenGL.glDisable(var2);
        }
        if (param0 != 9) {
          this.field_bd = false;
        }
    }

    final hq a(hu[] param0, byte param1) {
        RuntimeException var3 = null;
        fq stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 6) {
            this.field_Kc = (jn) null;
          }
          stackIn_3_0 = new fq(param0);
          return (hq) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("on.V(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final ru a(boolean param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        sa var9 = null;
        sa stackIn_7_0 = null;
        or stackIn_10_0 = null;
        sa stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -41) {
            this.l((byte) 14);
          }
          if (!this.field_Ic && (!rm.a(param3, -118) ||
            !rm.a(param6, -113))) {
            if (this.field_bd) {
              stackIn_10_0 = new or(this, param3, param6, param2, param5, param1);
              return (ru) ((Object) stackIn_10_0);
            }
            var9 = new sa(this, nl.field_p, io.field_g, hn.a(false, param3), hn.a(false, param6));
            var9.a(param6, false, param5, param3, param1, param2, 0, 0);
            stackIn_12_0 = var9;
            return (ru) ((Object) stackIn_12_0);
          }
          stackIn_7_0 = new sa(this, param3, param6, param0, param2, param5, param1);
          return (ru) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("on.WD(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void p(byte param0) {
        if (param0 != -4) {
          return;
        }
        if (this.field_ob) {
          jaggl.OpenGL.glEnable(3042);
        } else {
          jaggl.OpenGL.glDisable(3042);
        }
    }

    final ru a(iw param0, int param1, int param2, int param3, byte[] param4, byte param5, int param6, boolean param7) {
        int var9_int = 0;
        RuntimeException var9 = null;
        sa var10 = null;
        sa stackIn_5_0 = null;
        or stackIn_8_0 = null;
        sa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9_int = 108 % ((50 - param5) / 44);
          if (!this.field_Ic && (!rm.a(param1, -107) ||
            !rm.a(param2, -111))) {
            if (this.field_bd) {
              stackIn_8_0 = new or(this, param0, param1, param2, param4, param6, param3);
              return (ru) ((Object) stackIn_8_0);
            }
            var10 = new sa(this, param0, io.field_g, hn.a(false, param1), hn.a(false, param2));
            var10.a(param0, 0, (byte) 77, param6, param4, param2, param1, 0, param3);
            stackIn_10_0 = var10;
            return (ru) ((Object) stackIn_10_0);
          }
          stackIn_5_0 = new sa(this, param0, param1, param2, param7, param4, param6, param3);
          return (ru) ((Object) stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_13_0 = var9;
          stackIn_13_1 = new StringBuilder().append("on.UA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void cb(int param0) {
        if (param0 > -7) {
          this.field_zc = (sc[]) null;
        }
        jaggl.OpenGL.glActiveTexture(this.field_mc + 33984);
    }

    final void E(int param0) {
        if (param0 >= -47) {
          this.I(-20);
        }
        jaggl.OpenGL.glLightfv(16384, 4611, this.field_G, 0);
        jaggl.OpenGL.glLightfv(16385, 4611, this.field_U, 0);
    }

    final void a(int param0, int param1, pv param2) {
        try {
          this.field_zc[param0] = (sc) (param2);
          if (param1 < 62) {
            this.A(-86);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "on.BE(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void s(int param0) {
        if (!this.field_u) {
          jaggl.OpenGL.glDisable(3008);
        } else {
          jaggl.OpenGL.glEnable(3008);
        }
        int var2 = -24 / ((-6 - param0) / 54);
    }

    final rq d(int param0, int param1) {
        int var3;
        if (param0 != 0) {
          this.field_Pc = (jn) null;
        }
        var3 = param1;
        if (var3 == 3) {
          return (rq) ((Object) new pn(this, this.field_ab));
        }
        if (var3 == 4) {
          return (rq) ((Object) new wj(this, this.field_ab, this.field_Mb));
        }
        if (var3 == 8) {
          return (rq) ((Object) new ej(this, this.field_ab, this.field_Mb));
        }
        return super.d(0, param1);
    }

    final void N(int param0) {
        this.field_Uc = false;
        if (param0 != -26911) {
          this.field_Wc = (String) null;
        }
        this.t((byte) 68);
    }

    final void o(int param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_A, 0);
        if (param0 != -2) {
          this.field_Wc = (String) null;
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void bb(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_l == sr.field_a) {
          jaggl.OpenGL.glBlendFunc(770, 771);
        } else {
          if (this.field_l == lh.field_n) {
            jaggl.OpenGL.glBlendFunc(1, 1);
          } else {
            if (gb.field_t == this.field_l) {
              jaggl.OpenGL.glBlendFunc(774, 1);
            }
          }
        }
        if (param0 != -19519) {
          this.field_ad = -66;
        }
    }

    final void eb(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 < 113) {
          this.field_Tc = true;
        }
        stackIn_6_0 = (this.field_db) && (this.field_i);
        jaggl.OpenGL.glDepthMask(stackIn_6_0);
    }

    private final void t(byte param0) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_Dc) {
          jaggl.OpenGL.glPopMatrix();
        }
        if (param0 != 68) {
          return;
        }
        if (!this.field_s.a(-20011)) {
          if (!this.field_Db) {
            jaggl.OpenGL.glLoadMatrixf(this.field_Lb.b(-110, pq.field_y), 0);
          } else {
            jaggl.OpenGL.glLoadIdentity();
          }
          this.field_Dc = false;
        } else {
          if (!this.field_Uc) {
            jaggl.OpenGL.glLoadMatrixf(this.field_Gb.b(-63, pq.field_y), 0);
            this.field_Uc = true;
            this.E(-114);
            this.Y(param0 ^ -25);
          }
          if (!this.field_Db) {
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glMultMatrixf(this.field_Lb.b(-79, pq.field_y), 0);
            this.field_Dc = true;
          } else {
            this.field_Dc = false;
          }
        }
    }

    final void d() {
        super.d();
        if (this.field_Yc != null) {
          this.field_Yc.a();
          this.field_Yc.release();
          this.field_Yc = null;
        }
    }

    final void b(int param0, int param1) throws rf {
        this.field_Yc.swapBuffers();
    }

    final vc a(bu param0, nr param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = null;
          return (vc) (stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("on.OF(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final nh a(boolean param0, iw param1, int param2, int param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        go stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_Wc = (String) null;
          }
          stackIn_3_0 = new go(this, param1, param5, param3, param2, param4);
          return (nh) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("on.PE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(')').toString());
        }
    }

    final void e() {
        if (this.field_rb <= 0 &&
          !(this.field_Sb > 0)) {
          return;
        }
        int var1 = this.field_v;
        int var2 = this.field_F;
        int var3 = this.field_vb;
        int var4 = this.field_yc;
        this.m(-16088);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.d(false);
        this.c(false, -32);
        this.d(101, false);
        this.c(47, false);
        this.b(false, 4);
        this.a((ed) null, 120);
        this.a(-2, false, 50, false);
        this.h(40, 1);
        this.e(0, 13);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, this.field_rb, this.field_Sb, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.KA(var1, var3, var2, var4);
    }

    static {
    }
}
