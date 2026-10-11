/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kda extends eo {
    static String field_gd;
    static boolean field_pd;
    private vna field_bd;
    static int field_hd;
    private jaggl.OpenGL field_Mc;
    static String field_cd;
    static char field_td;
    private vna field_dd;
    private vna field_Rc;
    private vna field_Oc;
    private vna field_ad;
    private vna field_nd;
    private vna field_kd;
    private boolean field_rd;
    private boolean field_ld;
    jaggl.MapBuffer field_Qc;
    private og[] field_id;
    private boolean field_Vc;
    private long field_Xc;
    private int field_ed;
    private boolean field_Zc;
    private boolean field_Yc;
    jaggl.MapBuffer field_Tc;
    boolean field_Uc;
    int[] field_Sc;
    private boolean field_Wc;
    private boolean field_sd;
    boolean field_qd;
    boolean field_Pc;
    int field_od;
    boolean field_fd;
    private String field_Nc;
    private String field_jd;
    private int field_md;

    final void a(int param0, int param1, qm param2) {
        try {
          this.field_id[param1] = (og) (param2);
          if (param0 >= -124) {
            this.field_Xc = 121L;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kda.QD(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void k() {
        super.k();
        if (null != this.field_Mc) {
          this.field_Mc.b();
          this.field_Mc.release();
          this.field_Mc = null;
        }
    }

    final void f(int param0) {
        if (param0 != -3485) {
          java.awt.Canvas var3 = (java.awt.Canvas) null;
          this.a((Object) null, false, (java.awt.Canvas) null);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, oj.a((byte) 126, this.field_mc[this.field_Cc]));
    }

    final boolean f() {
        return false;
    }

    final void a(eja param0, int param1, int param2, int param3, iw param4, int param5, int param6) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        una var10 = null;
        sf var11 = null;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          if (io.field_c == param4) {
            var9 = param6 * 2;
            var8_int = 1;
          } else {
            if (di.field_d == param4) {
              var8_int = 3;
              var9 = 1 + param6;
            } else {
              if (fma.field_f != param4) {
                if (param4 != vs.field_T) {
                  if (param4 == nb.field_b) {
                    var9 = param6 + 2;
                    var8_int = 5;
                  } else {
                    var9 = param6;
                    var8_int = 0;
                  }
                } else {
                  var8_int = 6;
                  var9 = param6 + 2;
                }
              } else {
                var9 = 3 * param6;
                var8_int = 4;
              }
            }
          }
          var10 = param0.b(param1 ^ 13611);
          var11 = (sf) (param0);
          var11.c(-3);
          jaggl.OpenGL.glDrawElements(var8_int, var9, lr.a(var10, 5126), var11.b(true) + (long)(param3 * var10.field_e));
          if (param1 != -19394) {
            this.N(76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_17_0 = var8;
          stackIn_17_1 = new StringBuilder().append("kda.MD(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final gf a(int[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        hm var9 = null;
        hm stackIn_6_0 = null;
        pe stackIn_8_0 = null;
        hm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 82 / ((param6 - 13) / 46);
          if (!this.field_Wc && (!cla.a(9181, param3) ||
            !cla.a(9181, param5))) {
            if (this.field_sd) {
              stackIn_8_0 = new pe(this, param3, param5, param0, param1, param4);
              return (gf) ((Object) stackIn_8_0);
            }
            var9 = new hm(this, gpa.field_a, una.field_g, lla.a(false, param3), lla.a(false, param5));
            var9.a(param1, param5, param4, 113, 0, param0, param3, 0);
            stackIn_6_0 = var9;
            return (gf) ((Object) stackIn_6_0);
          }
          stackIn_10_0 = new hm(this, param3, param5, param2, param0, param1, param4);
          return (gf) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("kda.FC(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final qm c(int param0, boolean param1) {
        if (param0 != 6) {
          this.field_dd = (vna) null;
        }
        return (qm) ((Object) new og(this, param1));
    }

    final mna a(ne[] param0, int param1) {
        RuntimeException var3 = null;
        dqa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.a(-57, 53, 67);
          }
          stackIn_3_0 = new dqa(param0);
          return (mna) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kda.WD(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        for (var2 = -1 + this.field_Vb; var2 >= 0; var2--) {
          jaggl.OpenGL.glActiveTexture(var2 + 33984);
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
        for (var3 = 0; 8 > var3; var3++) {
          var4 = var3 + 16384;
          jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
          jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
          jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.field_Mc.setSwapInterval(0);
        super.h(param0);
    }

    final void I(int param0) {
        this.field_Hc = (float)(-this.field_Ac + this.field_k);
        this.field_B = (float)(-this.field_J) + this.field_Hc;
        if (this.field_B < (float)this.field_D) {
          this.field_B = (float)this.field_D;
        }
        jaggl.OpenGL.glFogf(2915, this.field_B);
        jaggl.OpenGL.glFogf(2916, this.field_Hc);
        dia.field_r[2] = (float)sea.c(this.field_g, 255) / 255.0f;
        dia.field_r[param0] = (float)sea.c(65280, this.field_g) / 65280.0f;
        dia.field_r[0] = (float)sea.c(16711680, this.field_g) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, dia.field_r, 0);
    }

    final na a(byte param0, int[][] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        dma stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 7) {
            field_hd = 36;
          }
          stackIn_3_0 = new dma(this, param3, param2, param1);
          return (na) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("kda.VC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a() {
        if (this.field_Hb <= 0 &&
          this.field_jc <= 0) {
          return;
        }
        int var1 = this.field_A;
        int var2 = this.field_C;
        int var3 = this.field_K;
        int var4 = this.field_jb;
        this.la();
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.O(256);
        this.b(false, -70);
        this.d(0, false);
        this.f(0, false);
        this.b(false, (byte) 81);
        this.a(true, (iva) null);
        this.a((byte) -80, false, false, -2);
        this.a((byte) 118, 1);
        this.c(0, 1);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, this.field_Hb, this.field_jc, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.KA(var1, var3, var2, var4);
    }

    final void B(byte param0) {
        if (param0 != -116) {
          this.field_id = (og[]) null;
        }
        jaggl.OpenGL.glViewport(this.field_i, this.field_Kc, this.field_Hb, this.field_jc);
    }

    final eja a(int param0, boolean param1) {
        if (param0 != 26) {
          this.field_rd = true;
        }
        return (eja) ((Object) new sf(this, una.field_f, param1));
    }

    final void g(byte param0) {
        ob var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        this.i((byte) 123);
        for (var2 = 0; this.field_Bc > var2; var2++) {
          var3 = this.field_ib[var2];
          var4 = var3.c(param0 ^ -43);
          var5 = 16386 + var2;
          var6 = var3.b(0) / 255.0f;
          dia.field_r[0] = (float)var3.d(13437);
          dia.field_r[1] = (float)var3.a(19848);
          dia.field_r[2] = (float)var3.b((byte) 11);
          dia.field_r[3] = 1.0f;
          jaggl.OpenGL.glLightfv(var5, 4611, dia.field_r, 0);
          dia.field_r[3] = 1.0f;
          dia.field_r[1] = var6 * (float)sea.c(255, var4 >> 8);
          dia.field_r[2] = var6 * (float)sea.c(var4, 255);
          dia.field_r[0] = (float)sea.c(255, var4 >> 16) * var6;
          jaggl.OpenGL.glLightfv(var5, 4609, dia.field_r, 0);
          jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.a((byte) -23) * var3.a((byte) -84)));
          jaggl.OpenGL.glEnable(var5);
        }
        while (var2 < this.field_S) {
          jaggl.OpenGL.glDisable(var2 + 16386);
          var2++;
        }
        super.g(param0);
    }

    final jca a(nha param0, mw param1) {
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
          return (jca) (stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("kda.NB(");
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
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void r(int param0) {
        dia.field_r[3] = 1.0f;
        dia.field_r[param0] = this.field_fc * this.field_sc;
        dia.field_r[2] = this.field_Kb * this.field_fc;
        dia.field_r[1] = this.field_yb * this.field_fc;
        jaggl.OpenGL.glLightModelfv(2899, dia.field_r, 0);
    }

    final boolean h() {
        return false;
    }

    final gf a(int param0, int param1, ft param2, byte param3, una param4) {
        RuntimeException var6 = null;
        pe stackIn_8_0 = null;
        hm stackIn_10_0 = null;
        hm stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -63) {
            this.field_Uc = false;
          }
          if (!this.field_Wc && (!cla.a(9181, param0) ||
            !cla.a(9181, param1))) {
            if (!this.field_sd) {
              stackIn_10_0 = new hm(this, param2, param4, lla.a(false, param0), lla.a(false, param1));
              return (gf) ((Object) stackIn_10_0);
            }
            stackIn_8_0 = new pe(this, param2, param4, param0, param1);
            return (gf) ((Object) stackIn_8_0);
          }
          stackIn_12_0 = new hm(this, param2, param4, param0, param1);
          return (gf) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("kda.SC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void M(int param0) {
        if (!this.field_Yb) {
          jaggl.OpenGL.glDisable(3042);
        } else {
          jaggl.OpenGL.glEnable(3042);
        }
        if (param0 != -27581) {
          this.field_Nc = (String) null;
        }
    }

    final void GA(int param0) {
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void b(byte param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = -30 % ((param0 + 67) / 53);
        stackIn_4_0 = (this.field_Nb) && (this.field_qc);
        jaggl.OpenGL.glDepthMask(stackIn_4_0);
    }

    final boolean a(boolean param0, una param1, ft param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.i(102);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("kda.VD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final gf a(boolean param0, byte[] param1, int param2, int param3, int param4, int param5, ft param6, int param7) {
        RuntimeException var9 = null;
        hm var10 = null;
        hm stackIn_7_0 = null;
        pe stackIn_10_0 = null;
        hm stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 1) {
            this.field_id = (og[]) null;
          }
          if (!this.field_Wc && (!cla.a(9181, param7) ||
            !cla.a(9181, param3))) {
            if (this.field_sd) {
              stackIn_10_0 = new pe(this, param6, param7, param3, param1, param2, param5);
              return (gf) ((Object) stackIn_10_0);
            }
            var10 = new hm(this, param6, una.field_g, lla.a(false, param7), lla.a(false, param3));
            var10.a(0, (byte) -124, param3, param1, param5, param2, param6, param7, 0);
            stackIn_12_0 = var10;
            return (gf) ((Object) stackIn_12_0);
          }
          stackIn_7_0 = new hm(this, param6, param7, param3, param0, param1, param2, param5);
          return (gf) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_15_0 = var9;
          stackIn_15_1 = new StringBuilder().append("kda.VB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param7).append(')').toString());
        }
    }

    final void z(int param0) {
        if (param0 != 0) {
          field_cd = (String) null;
        }
        jaggl.OpenGL.glMatrixMode(5890);
        if (od.field_h == this.field_v[this.field_Cc]) {
          jaggl.OpenGL.glLoadIdentity();
        } else {
          jaggl.OpenGL.glLoadMatrixf(this.field_hc[this.field_Cc].a(jba.field_k, (byte) -37), 0);
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final synchronized void a(long param0, int param1) {
        vg var4 = new vg();
        if (param1 != -6115) {
          this.field_ad = (vna) null;
        }
        var4.field_d = param0;
        this.field_kd.b((byte) -65, var4);
    }

    final void d(int param0) {
        if (param0 != 1) {
          this.a((byte) 9, (int[][]) null, false, -5);
        }
        int var2 = this.field_Sc[this.field_Cc];
        if (var2 != 0) {
          this.field_Sc[this.field_Cc] = 0;
          jaggl.OpenGL.glBindTexture(var2, 0);
          jaggl.OpenGL.glDisable(var2);
        }
    }

    final void v(int param0) {
        dia.field_r[3] = 1.0f;
        dia.field_r[2] = this.field_j * this.field_Kb;
        dia.field_r[1] = this.field_j * this.field_yb;
        dia.field_r[0] = this.field_j * this.field_sc;
        jaggl.OpenGL.glLightfv(16384, 4609, dia.field_r, 0);
        dia.field_r[0] = -this.field_pc * this.field_sc;
        dia.field_r[3] = 1.0f;
        dia.field_r[2] = -this.field_pc * this.field_Kb;
        if (param0 <= 19) {
          return;
        }
        dia.field_r[1] = this.field_yb * -this.field_pc;
        jaggl.OpenGL.glLightfv(16385, 4609, dia.field_r, 0);
    }

    final void a(jca param0) {
    }

    final void a(float param0, float param1, float param2) {
    }

    final void d(byte param0) {
        if (!this.field_Wb) {
          jaggl.OpenGL.glDisable(3089);
        } else {
          jaggl.OpenGL.glEnable(3089);
        }
        int var2 = 43 % ((param0 - 69) / 50);
    }

    final void h(byte param0) {
        if (param0 != -102) {
          return;
        }
        if (this.field_l &&
          !this.field_yc) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
    }

    final void z(byte param0) {
        if (param0 != -73) {
          this.a();
        }
        this.i(false);
    }

    final void f(byte param0) {
        if (param0 != -69) {
          this.field_ed = -103;
        }
        if (!this.field_wc) {
          jaggl.OpenGL.glDisable(2929);
        } else {
          jaggl.OpenGL.glEnable(2929);
        }
    }

    final void a(int param0, int param1) throws qva {
        this.field_Mc.swapBuffers();
    }

    final void a(int param0, iw param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (io.field_c == param1) {
            var6 = param0 * 2;
            var5_int = 1;
          } else {
            if (param1 != di.field_d) {
              if (param1 != fma.field_f) {
                if (param1 == vs.field_T) {
                  var5_int = 6;
                  var6 = param0 + 2;
                } else {
                  if (nb.field_b == param1) {
                    var6 = param0 + 2;
                    var5_int = 5;
                  } else {
                    var5_int = 0;
                    var6 = param0;
                  }
                }
              } else {
                var6 = 3 * param0;
                var5_int = 4;
              }
            } else {
              var6 = param0 + 1;
              var5_int = 3;
            }
          }
          if (param3 != 0) {
            this.i(false);
          }
          jaggl.OpenGL.glDrawArrays(var5_int, param2, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("kda.HC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void d() {
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
          this.J(19822);
          this.a(true, (iva) null);
          this.c(0, 1);
          this.i((byte) 126);
          jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
          jaggl.OpenGL.glRasterPos2i(param0, param1);
          jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_od, param4, param5);
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kda.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final synchronized void c(int param0) {
        int incrementValue$5 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int var2;
        int var4;
        al var5;
        al var6;
        al var7;
        al var8;
        al var9;
        vg var10;
        vg var11;
        al var12;
        al var9Lifetime1;
        vg var10Lifetime1;
        vg var11Lifetime1;
        al var12Lifetime1;
        al var9Lifetime2;
        vg var10Lifetime2;
        var4 = TombRacer.field_G ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        while (!this.field_dd.d((byte) 14)) {
          var5 = (al) (this.field_dd.c(61));
          incrementValue$5 = var2;
          var2++;
          csa.field_i[incrementValue$5] = (int)var5.field_d;
          this.field_X = this.field_X - var5.field_i;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteBuffersARB(var2, csa.field_i, 0);
          var2 = 0;
        }
        if (var2 <= 0) {
          while (!this.field_Rc.d((byte) 14)) {
            var6 = (al) (this.field_Rc.c(-96));
            incrementValue$1 = var2;
            var2++;
            csa.field_i[incrementValue$1] = (int)var6.field_d;
            this.field_Xb = this.field_Xb - var6.field_i;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
            var2 = 0;
          }
        } else {
          jaggl.OpenGL.glDeleteBuffersARB(var2, csa.field_i, 0);
          var2 = 0;
          while (!this.field_Rc.d((byte) 14)) {
            var6 = (al) (this.field_Rc.c(-96));
            incrementValue$0 = var2;
            var2++;
            csa.field_i[incrementValue$0] = (int)var6.field_d;
            this.field_Xb = this.field_Xb - var6.field_i;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
            var2 = 0;
          }
        }
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameRemainder1 = true;
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
          var2 = 0;
          while (!this.field_Oc.d((byte) 14)) {
            var7 = (al) (this.field_Oc.c(62));
            incrementValue$2 = var2;
            var2++;
            csa.field_i[incrementValue$2] = var7.field_i;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
            var2 = 0;
          }
        } else {
          if (!this.field_Oc.d((byte) 14)) {
            var7 = (al) (this.field_Oc.c(62));
            incrementValue$3 = var2;
            var2++;
            csa.field_i[incrementValue$3] = var7.field_i;
            if (var2 == 1000) {
              jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
              var2 = 0;
              decompiledFrameRemainder1 = false;
            }
            else {
              while (!this.field_bd.d((byte) 14)) {
                var9 = (al) (this.field_bd.c(-101));
                jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
              }
              while (!this.field_nd.d((byte) 14)) {
                var10 = this.field_nd.c(-120);
                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
              }
              while (!this.field_kd.d((byte) 14)) {
                var11 = this.field_kd.c(61);
                jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
              }
              while (!this.field_bd.d((byte) 14)) {
                var12 = (al) (this.field_bd.c(-99));
                jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
              }
              if ((!(this.Q(10) <= 100663296)) &&
                (!(bva.b((byte) -107) <= this.field_Xc + 60000L))) {
                System.gc();
                this.field_Xc = bva.b((byte) -107);
              }
              decompiledFrameRemainder2 = false;
            }
          }
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1)) {
          if (0 < var2) {
            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
            var2 = 0;
          }
          while (!this.field_ad.d((byte) 14)) {
            var8 = (al) (this.field_ad.c(30));
            incrementValue$4 = var2;
            var2++;
            csa.field_i[incrementValue$4] = (int)var8.field_d;
            this.field_Fb = this.field_Fb - var8.field_i;
            stackIn_33_0 = 1000;
            stackIn_33_1 = var2;
            if (stackIn_33_0 != stackIn_33_1) {
              continue;
            }
            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
            var2 = 0;
          }
          if (var2 > 0) {
            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
            var2 = 0;
            while (!this.field_bd.d((byte) 14)) {
              var9Lifetime2 = (al) (this.field_bd.c(-101));
              jaggl.OpenGL.glDeleteLists((int)var9Lifetime2.field_d, var9Lifetime2.field_i);
            }
            while (!this.field_nd.d((byte) 14)) {
              var10Lifetime2 = this.field_nd.c(-120);
              jaggl.OpenGL.glDeleteProgramARB((int)var10Lifetime2.field_d);
            }
            decompiledFrameRemainder0 = false;
          }
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder0)) {
          while (!this.field_bd.d((byte) 14)) {
            var9Lifetime1 = (al) (this.field_bd.c(-101));
            jaggl.OpenGL.glDeleteLists((int)var9Lifetime1.field_d, var9Lifetime1.field_i);
          }
          while (!this.field_nd.d((byte) 14)) {
            var10Lifetime1 = this.field_nd.c(-120);
            jaggl.OpenGL.glDeleteProgramARB((int)var10Lifetime1.field_d);
          }
        }
        if (decompiledFrameRemainder2) {
          while (!this.field_kd.d((byte) 14)) {
            var11Lifetime1 = this.field_kd.c(61);
            jaggl.OpenGL.glDeleteObjectARB(var11Lifetime1.field_d);
          }
          while (!this.field_bd.d((byte) 14)) {
            var12Lifetime1 = (al) (this.field_bd.c(-99));
            jaggl.OpenGL.glDeleteLists((int)var12Lifetime1.field_d, var12Lifetime1.field_i);
          }
          if (!(this.Q(10) <= 100663296) &&
            !(bva.b((byte) -107) <= this.field_Xc + 60000L)) {
            System.gc();
            this.field_Xc = bva.b((byte) -107);
          }
        }
        super.c(param0);
    }

    final void q(byte param0) {
        if (param0 != -78) {
          this.field_Vc = true;
        }
    }

    final void ya() {
        this.b(true, (byte) 81);
        jaggl.OpenGL.glClear(256);
    }

    final void h(boolean param0) {
        this.field_Zc = param0 ? true : false;
        this.i(param0);
    }

    public static void T(int param0) {
        if (param0 != 32885) {
          return;
        }
        field_cd = null;
        field_gd = null;
    }

    final void u(byte param0) {
        if (param0 != -23) {
          this.f(47);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34162, oj.a((byte) 101, this.field_db[this.field_Cc]));
    }

    final mw b(int param0, int param1) {
        return null;
    }

    final void N(int param0) {
        if (param0 >= -10) {
          this.b(20, (byte) 35);
        }
        dia.field_r[3] = (float)(this.field_bc >>> 24) / 255.0f;
        dia.field_r[2] = (float)sea.c(this.field_bc, 255) / 255.0f;
        dia.field_r[1] = (float)sea.c(65280, this.field_bc) / 65280.0f;
        dia.field_r[0] = (float)sea.c(16711680, this.field_bc) / 16711680.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, dia.field_r, 0);
    }

    final float c(byte param0) {
        if (param0 >= -39) {
          this.field_Oc = (vna) null;
        }
        return 0.0f;
    }

    final boolean a(una param0, int param1, ft param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kda.FD(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final gf a(ft param0, int param1, int param2, boolean param3, int param4, int param5, float[] param6, int param7) {
        RuntimeException var9 = null;
        hm var10 = null;
        gf stackIn_2_0 = null;
        hm stackIn_9_0 = null;
        pe stackIn_11_0 = null;
        hm stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            stackIn_2_0 = (gf) null;
            return stackIn_2_0;
          }
          if (!this.field_Wc && (!cla.a(9181, param4) ||
            !cla.a(9181, param7))) {
            if (this.field_sd) {
              stackIn_11_0 = new pe(this, param0, param4, param7, param6, param5, param1);
              return (gf) ((Object) stackIn_11_0);
            }
            var10 = new hm(this, param0, una.field_h, lla.a(false, param4), lla.a(false, param7));
            var10.a(0, param6, 0, param4, param7, param5, param1, param0, true);
            stackIn_9_0 = var10;
            return (gf) ((Object) stackIn_9_0);
          }
          stackIn_13_0 = new hm(this, param0, param4, param7, param3, param6, param5, param1);
          return (gf) ((Object) stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_16_0 = var9;
          stackIn_16_1 = new StringBuilder().append("kda.UC(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param7).append(')').toString());
        }
    }

    final void a(mna param0, int param1) {
        int var15 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_26_1 = 0;
        boolean stackIn_33_1 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_44_1 = false;
        int stackIn_48_0 = 0;
        int stackIn_51_1 = 0;
        boolean stackIn_58_1 = false;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ne var9 = null;
        og var10 = null;
        int var11 = 0;
        int var12 = 0;
        long var13 = 0L;
        gj var16 = null;
        int var17 = 0;
        ne[] var18 = null;
        int var8Lifetime1;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          var18 = ((dqa) (param0)).field_f;
          var4 = 0;
          var5 = 0;
          if (param1 != -32) {
            this.field_id = (og[]) null;
          }
          var6 = 0;
          var7 = 0;
          for (var8 = 0; var18.length > var8; var8++) {
            var9 = var18[var8];
            var10 = this.field_id[var8];
            var11 = 0;
            var12 = var10.a((byte) -111);
            var13 = var10.b(true);
            var10.c(-3);
            for (var15 = 0; var9.b((byte) -77) > var15; var15++) {
              var16 = var9.b(0, var15);
              if (var16 == gj.field_p) {
                jaggl.OpenGL.glVertexPointer(3, 5126, var12, var13 + (long)var11);
                var7 = 1;
              } else {
                if (gj.field_e == var16) {
                  jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                  var6 = 1;
                } else {
                  if (var16 != gj.field_b) {
                    if (var16 != gj.field_m) {
                      if (var16 == gj.field_n) {
                        incrementValue$0 = var4;
                        var4++;
                        jaggl.OpenGL.glClientActiveTexture(incrementValue$0 + 33984);
                        jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                      } else {
                        if (gj.field_k == var16) {
                          incrementValue$1 = var4;
                          var4++;
                          jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$1);
                          jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, var13 + (long)var11);
                        } else {
                          if (gj.field_j == var16) {
                            incrementValue$2 = var4;
                            var4++;
                            jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$2);
                            jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 + (long)var11);
                          }
                        }
                      }
                    } else {
                      incrementValue$3 = var4;
                      var4++;
                      jaggl.OpenGL.glClientActiveTexture(incrementValue$3 + 33984);
                      jaggl.OpenGL.glTexCoordPointer(1, 5126, var12, (long)var11 + var13);
                    }
                  } else {
                    var5 = 1;
                    jaggl.OpenGL.glColorPointer(4, 5121, var12, (long)var11 + var13);
                  }
                }
              }
              var11 = var11 + var16.field_l;
            }
          }
          stackIn_25_0 = this.field_Vc;
          if (var7 != 0) {
            stackIn_26_1 = 0;
          } else {
            stackIn_26_1 = 1;
          }
          if ((stackIn_25_0 ? 1 : 0) == stackIn_26_1) {
            if (var7 == 0) {
              jaggl.OpenGL.glDisableClientState(32884);
            } else {
              jaggl.OpenGL.glEnableClientState(32884);
            }
            stackIn_33_1 = (var7 != 0);
            this.field_Vc = stackIn_33_1;
          }
          stackIn_37_0 = (var6 != 0) ? 0 : 1;
          if (stackIn_37_0 == (this.field_Yc ? 1 : 0)) {
            if (var6 != 0) {
              jaggl.OpenGL.glEnableClientState(32885);
            } else {
              jaggl.OpenGL.glDisableClientState(32885);
            }
            stackIn_44_1 = (var6 != 0);
            this.field_Yc = stackIn_44_1;
          }
          stackIn_48_0 = (this.field_ld) ? 0 : 1;
          if (var5 != 0) {
            stackIn_51_1 = 0;
          } else {
            stackIn_51_1 = 1;
          }
          if (stackIn_48_0 != stackIn_51_1) {
            if (var5 == 0) {
              jaggl.OpenGL.glDisableClientState(32886);
            } else {
              jaggl.OpenGL.glEnableClientState(32886);
            }
            stackIn_58_1 = (var5 != 0);
            this.field_ld = stackIn_58_1;
          }
          if (this.field_ed < var4) {
            for (var8Lifetime1 = this.field_ed; var4 > var8Lifetime1; var8Lifetime1++) {
              jaggl.OpenGL.glClientActiveTexture(33984 + var8Lifetime1);
              jaggl.OpenGL.glEnableClientState(32888);
            }
            this.field_ed = var4;
          } else {
            if (var4 < this.field_ed) {
              for (var8Lifetime1 = var4; var8Lifetime1 < this.field_ed; var8Lifetime1++) {
                jaggl.OpenGL.glClientActiveTexture(33984 + var8Lifetime1);
                jaggl.OpenGL.glDisableClientState(32888);
              }
              this.field_ed = var4;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_72_0 = var3;
          stackIn_72_1 = new StringBuilder().append("kda.OC(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(boolean param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0) {
          this.field_Vc = true;
        }
        if (this.field_lb != dfa.field_b) {
          if (this.field_lb == mp.field_a) {
            jaggl.OpenGL.glBlendFunc(1, 1);
          } else {
            if (bma.field_w == this.field_lb) {
              jaggl.OpenGL.glBlendFunc(774, 1);
            }
          }
        } else {
          jaggl.OpenGL.glBlendFunc(770, 771);
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = -91 / ((-67 - param1) / 47);
        return 0 != (32 & param0) ? true : false;
    }

    final void e(boolean param0) {
        jaggl.OpenGL.glActiveTexture(this.field_Cc + 33984);
        if (param0) {
          this.field_Mc = (jaggl.OpenGL) null;
        }
    }

    final synchronized void b(int param0, byte param1) {
        vg var3 = new vg();
        var3.field_d = (long)param0;
        if (param1 != 18) {
          return;
        }
        this.field_nd.b((byte) -124, var3);
    }

    final Object a(boolean param0, java.awt.Canvas param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        Long stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_long = this.field_Mc.prepareSurface(param1);
          if (var3_long == -1L) {
            throw new RuntimeException();
          }
          if (param0) {
            this.v(42);
          }
          stackIn_6_0 = new Long(var3_long);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kda.DE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(dn param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != kga.field_o) {
            var3_int = dk.a(param0, 0);
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
          if (param1 != 0) {
            this.v(82);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("kda.EC(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final lv a(byte[] param0, ft param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        jd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -1) {
            this.i(true);
          }
          stackIn_3_0 = new jd(this, param1, param4, param3, param5, param0);
          return (lv) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("kda.TD(");
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final vw e(int param0, int param1) {
        int var3;
        int var4;
        dn var5;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 < 37) {
          var5 = (dn) null;
          this.a((dn) null, (byte) 83);
        }
        var3 = param0;
        if (var3 == 3) {
          return (vw) ((Object) new bta(this, this.field_I));
        }
        if (var3 == 4) {
          return (vw) ((Object) new pja(this, this.field_I, this.field_Mb));
        }
        if (var3 != 8) {
          return super.e(param0, 115);
        }
        return (vw) ((Object) new dp(this, this.field_I, this.field_Mb));
    }

    final void w(byte param0) {
        if (!this.field_Zb) {
          jaggl.OpenGL.glDisable(16384);
          jaggl.OpenGL.glDisable(16385);
        } else {
          jaggl.OpenGL.glEnable(16384);
          jaggl.OpenGL.glEnable(16385);
        }
        if (param0 != -21) {
          this.field_id = (og[]) null;
        }
    }

    final void w(int param0) {
        if (param0 > -30) {
          return;
        }
        if (!this.field_m) {
          jaggl.OpenGL.glDisable(3008);
        } else {
          jaggl.OpenGL.glEnable(3008);
        }
    }

    kda(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, cn param4, int param5) {
        super(param1, new Long(param2), param3, param4, param5, 1);
        int var15 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
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
        this.field_bd = new vna();
        this.field_dd = new vna();
        this.field_Rc = new vna();
        this.field_Oc = new vna();
        this.field_ad = new vna();
        this.field_nd = new vna();
        this.field_kd = new vna();
        this.field_id = new og[16];
        this.field_Qc = new jaggl.MapBuffer();
        this.field_Tc = new jaggl.MapBuffer();
        try {
          try {
            this.field_Mc = param0;
            this.field_Mc.a();
            this.field_Nc = jaggl.OpenGL.glGetString(7936).toLowerCase();
            this.field_jd = jaggl.OpenGL.glGetString(7937).toLowerCase();
            if (this.field_Nc.indexOf("microsoft") == -1 &&
              -1 == this.field_Nc.indexOf("brian paul") &&
              this.field_Nc.indexOf("mesa") == -1) {
              var20 = jaggl.OpenGL.glGetString(7938);
              var9 = rga.a(32287, var20.replace('.', ' '), ' ');
              if (2 > var9.length) {
                throw new RuntimeException("");
              }
              try {
                var10_int = jb.a((CharSequence) ((Object) var9[0]), (byte) 70);
                var11_int = jb.a((CharSequence) ((Object) var9[1]), (byte) 70);
                this.field_md = var10_int * 10 + var11_int;
              } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10 = (NumberFormatException) (Object) decompiledCaughtException;
                throw new RuntimeException("");
              }
              if (this.field_md < 12) {
                throw new RuntimeException("");
              }
              if (!this.field_Mc.a("GL_ARB_multitexture")) {
                throw new RuntimeException("");
              }
              if (!this.field_Mc.a("GL_ARB_texture_env_combine")) {
                throw new RuntimeException("");
              }
              var26 = new int[1];
              jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
              this.field_Vb = var26[0];
              if (this.field_Vb < 2) {
                throw new RuntimeException("");
              }
              this.field_e = 8;
              this.field_fd = this.field_Mc.a("GL_ARB_vertex_buffer_object");
              this.field_Mc.a("GL_ARB_multisample");
              this.field_sd = this.field_Mc.a("GL_ARB_texture_rectangle");
              this.field_Ob = this.field_Mc.a("GL_ARB_texture_cube_map");
              this.field_Wc = this.field_Mc.a("GL_ARB_texture_non_power_of_two");
              this.field_x = this.field_Mc.a("GL_EXT_texture3D");
              this.field_Uc = this.field_Mc.a("GL_ARB_vertex_shader");
              this.field_qd = this.field_Mc.a("GL_ARB_vertex_program");
              this.field_Pc = this.field_Mc.a("GL_ARB_fragment_shader");
              this.field_Mc.a("GL_ARB_fragment_program");
              this.field_Sc = new int[this.field_Vb];
              if (!jaclib.memory.Stream.b()) {
                stackIn_21_1 = 5121;
              } else {
                stackIn_21_1 = 33639;
              }
              this.field_od = stackIn_21_1;
              if (this.field_jd.indexOf("radeon") != -1) {
                var11_int = 0;
                var12 = 0;
                var13 = 0;
                var14 = rga.a(32287, this.field_jd.replace('/', ' '), ' ');
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
                        if (sqa.a(var31, -3)) {
                          var13 = 1;
                          var16 = var21.substring(1);
                        }
                      }
                      if (!var16.equals("hd")) {
                        if (var16.startsWith("hd")) {
                          var12 = 1;
                          var16 = var16.substring(2);
                        }
                        if (var16.length() >= 4) {
                          var32 = (CharSequence) ((Object) var16.substring(0, 4));
                          if (sqa.a(var32, -3)) {
                            var33 = (CharSequence) ((Object) var16.substring(0, 4));
                            var11_int = jb.a(var33, (byte) 70);
                            decompiledRegionSelector0 = 1;
                            decompiledFrameRemainder0 = false;
                          }
                        }
                      } else {
                        var12 = 1;
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
                    9250 >= var11_int) {
                    this.field_x = false;
                  }
                  if (var11_int >= 7000 &&
                    var11_int <= 7999) {
                    this.field_fd = false;
                  }
                }
                this.field_sd = this.field_sd & this.field_Mc.a("GL_ARB_half_float_pixel");
              }
              if (this.field_Nc.indexOf("intel") != -1) {
              }
              if (this.field_fd) {
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
            this.a(true);
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var8_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_60_0 = var8_ref;
          stackIn_60_1 = new StringBuilder().append("kda.<init>(");
          if (param0 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param4 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param5).append(')').toString());
        }
    }

    final void S(int param0) {
        jaggl.OpenGL.glScissor(this.field_A + this.field_i, -this.field_jb + this.field_Kc + this.field_jc, this.field_C - this.field_A, -this.field_K + this.field_jb);
        if (param0 != -3335) {
          field_pd = false;
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        al var4 = new al(param0);
        var4.field_d = (long)param1;
        if (param2 <= 41) {
          return;
        }
        this.field_dd.b((byte) -80, var4);
    }

    final void a(int param0, byte param1) {
        if (param1 < 27) {
          this.a(-22, 75, 26, 3);
        }
    }

    final void a(nh param0, boolean param1) {
    }

    private final void i(boolean param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_rd) {
          jaggl.OpenGL.glPopMatrix();
        }
        if (param0) {
          this.field_ld = true;
        }
        if (this.field_r.a(-43)) {
          if (!this.field_Zc) {
            jaggl.OpenGL.glLoadMatrixf(this.field_Qb.a(jba.field_k, (byte) -37), 0);
            this.field_Zc = true;
            this.i(70);
            this.g((byte) 92);
          }
          if (this.field_gb) {
            this.field_rd = false;
          } else {
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glMultMatrixf(this.field_q.a(jba.field_k, (byte) -37), 0);
            this.field_rd = true;
          }
        } else {
          if (this.field_gb) {
            jaggl.OpenGL.glLoadIdentity();
          } else {
            jaggl.OpenGL.glLoadMatrixf(this.field_q.a(jba.field_k, (byte) -37), 0);
          }
          this.field_rd = false;
        }
    }

    final void D(int param0) {
        if (this.field_U &&
          this.field_Bb &&
          0 <= this.field_J) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
        if (param0 != 2) {
          this.field_Zc = true;
        }
    }

    final void a(fp param0, int param1, int param2, boolean param3, boolean param4) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          jaggl.OpenGL.glTexEnvi(8960, param1 + 34176, bma.a(param0, true));
          if (param2 != -6219) {
            this.field_Tc = (jaggl.MapBuffer) null;
          }
          if (!param3) {
            stackIn_9_0 = 8960;
            stackIn_9_1 = param1 + 34192;
            if (param4) {
              stackIn_10_2 = 769;
            } else {
              stackIn_10_2 = 768;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_9_0, stackIn_9_1, stackIn_10_2);
          } else {
            stackIn_5_0 = 8960;
            stackIn_5_1 = param1 + 34192;
            if (param4) {
              stackIn_6_2 = 771;
            } else {
              stackIn_6_2 = 770;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_5_0, stackIn_5_1, stackIn_6_2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("kda.TC(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void b(int param0, boolean param1) {
        if (!param1) {
          jaggl.OpenGL.glDisable(32925);
        } else {
          jaggl.OpenGL.glEnable(32925);
        }
        if (param0 != 1) {
          field_cd = (String) null;
        }
    }

    final void a(fp param0, int param1, boolean param2, int param3) {
        try {
          if (param1 != 15802) {
            this.N(120);
          }
          jaggl.OpenGL.glTexEnvi(8960, param3 + 34184, bma.a(param0, true));
          jaggl.OpenGL.glTexEnvi(8960, 34200 + param3, !param2 ? 770 : 771);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kda.AC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void i(int param0) {
        jaggl.OpenGL.glLightfv(16384, 4611, this.field_Gb, 0);
        int var2 = 73 / ((-11 - param0) / 56);
        jaggl.OpenGL.glLightfv(16385, 4611, this.field_M, 0);
    }

    final void c() {
    }

    final synchronized void a(int param0, int param1, int param2) {
        if (param2 != 2) {
          return;
        }
        al var4 = new al(param1);
        var4.field_d = (long)param0;
        this.field_Rc.b((byte) -67, var4);
    }

    final void a(Object param0, boolean param1, java.awt.Canvas param2) {
        Long var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = (Long) (param0);
          this.field_Mc.releaseSurface(param2, var4.longValue());
          if (param1) {
            this.I(-84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("kda.SB(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void e(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_T, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0 < 26) {
          this.d();
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    static {
        field_pd = false;
        field_cd = "Invite only";
        field_hd = 48;
        field_gd = "Go Back";
    }
}
