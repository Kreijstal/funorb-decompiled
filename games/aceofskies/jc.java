/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends bf {
    static pt field_Pc;
    private jaggl.OpenGL field_Ac;
    static String field_wc;
    private IntrusiveDeque field_uc;
    static String field_Mc;
    private IntrusiveDeque field_Ec;
    private IntrusiveDeque field_Lc;
    private IntrusiveDeque field_Wc;
    static String[] field_Rc;
    private IntrusiveDeque field_vc;
    private IntrusiveDeque field_Sc;
    private IntrusiveDeque field_Uc;
    private boolean field_Xc;
    private boolean field_Dc;
    jaggl.MapBuffer field_Qc;
    private int field_yc;
    private boolean field_Jc;
    private boolean field_Kc;
    private long field_xc;
    private boolean field_Oc;
    private cg[] field_Gc;
    jaggl.MapBuffer field_Fc;
    boolean field_Nc;
    boolean field_Vc;
    private String field_Ic;
    int[] field_Hc;
    boolean field_Cc;
    int field_Bc;
    private boolean field_zc;
    private int field_Tc;
    boolean field_rc;
    private String field_sc;
    private boolean field_tc;

    final bp a(int param0, int param1, int param2, hd param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        mh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -93) {
            this.field_Ac = (jaggl.OpenGL) null;
          }
          stackIn_3_0 = new mh(this, param3, param2, param0, param4, param5);
          return (bp) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("jc.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void Q(int param0) {
        jaggl.OpenGL.glViewport(this.field_Rb, this.field_Ib, this.field_Z, this.field_jb);
        if (param0 < 52) {
          this.field_zc = true;
        }
    }

    final void N(int param0) {
        if (param0 != 0) {
          this.field_Jc = true;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, IntrusiveDeque.a(-84, this.field_H[this.field_F]));
    }

    final void h(byte param0) {
        this.field_y = (float)(this.field_x - this.field_q);
        this.field_Xb = this.field_y - (float)this.field_p;
        if (this.field_Xb < (float)this.field_Mb) {
          this.field_Xb = (float)this.field_Mb;
        }
        jaggl.OpenGL.glFogf(2915, this.field_Xb);
        jaggl.OpenGL.glFogf(2916, this.field_y);
        np.field_d[2] = (float)pg.a(this.field_X, 255) / 255.0f;
        np.field_d[0] = (float)pg.a(this.field_X, 16711680) / 16711680.0f;
        if (param0 > -98) {
          this.field_Vc = false;
        }
        np.field_d[1] = (float)pg.a(this.field_X, 65280) / 65280.0f;
        jaggl.OpenGL.glFogfv(2918, np.field_d, 0);
    }

    final go a(int param0, int param1, boolean param2, int[][] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        qp stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 123 % ((param1 - 18) / 51);
          stackIn_1_0 = new qp(this, param0, param2, param3);
          return (go) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("jc.FD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final Object a(int param0, java.awt.Canvas param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Long stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15083) {
            stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          var3_long = this.field_Ac.prepareSurface(param1);
          if (var3_long == -1L) {
            throw new RuntimeException();
          }
          stackIn_7_0 = new Long(var3_long);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jc.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final qi a(float[] param0, int param1, hd param2, boolean param3, int param4, int param5, int param6, boolean param7) {
        RuntimeException var9 = null;
        ed var10 = null;
        ed stackIn_7_0 = null;
        ed stackIn_10_0 = null;
        ik stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            this.field_Tc = -76;
          }
          if (!this.field_zc && (!mg.a(param1, (byte) 114) ||
            !mg.a(param5, (byte) 105))) {
            if (this.field_tc) {
              stackIn_12_0 = new ik(this, param2, param1, param5, param0, param6, param4);
              return (qi) ((Object) stackIn_12_0);
            }
            var10 = new ed(this, param2, la.field_i, fk.a(param1, 57), fk.a(param5, 118));
            var10.a(param0, (byte) -124, 0, 0, param6, param4, param5, param2, param1);
            stackIn_10_0 = var10;
            return (qi) ((Object) stackIn_10_0);
          }
          stackIn_7_0 = new ed(this, param2, param1, param5, param7, param0, param6, param4);
          return (qi) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_15_0 = var9;
          stackIn_15_1 = new StringBuilder().append("jc.LC(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void r(int param0) {
        if (this.field_Cb) {
          jaggl.OpenGL.glEnable(3089);
        } else {
          jaggl.OpenGL.glDisable(3089);
        }
        if (param0 != 0) {
          this.field_Nc = true;
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        iq var4 = new iq(param1);
        if (param0 != 3) {
          this.g(91);
        }
        var4.key = (long)param2;
        this.field_Lc.addLast(81, var4);
    }

    final void s(byte param0) {
        if (param0 != -94) {
          this.field_Cc = false;
        }
    }

    final void a(int param0, tl param1, int param2) {
        try {
          if (param0 != 1) {
            this.field_Oc = true;
          }
          this.field_Gc[param2] = (cg) (param1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "jc.TB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void I(int param0) {
        int var2 = 60 % ((27 - param0) / 38);
        jaggl.OpenGL.glScissor(this.field_R + this.field_Rb, -this.field_V + (this.field_Ib + this.field_jb), this.field_gc - this.field_R, this.field_V - this.field_Nb);
    }

    final void g(int param0) {
        np.field_d[1] = (float)pg.a(65280, this.field_cc) / 65280.0f;
        np.field_d[2] = (float)pg.a(this.field_cc, 255) / 255.0f;
        np.field_d[0] = (float)pg.a(this.field_cc, 16711680) / 16711680.0f;
        np.field_d[3] = (float)(this.field_cc >>> 24) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, np.field_d, param0);
    }

    final void b(boolean param0) {
        ia var3;
        if (this.field_I &&
          this.field_o &&
          this.field_p >= 0) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
        if (param0) {
          var3 = (ia) null;
          this.a(true, (ia) null, 20, 74);
        }
    }

    final void b(byte param0) {
        int var2 = 109 % ((param0 - 9) / 48);
        this.X(2);
    }

    private final void X(int param0) {
        int var3;
        var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_Kc) {
          jaggl.OpenGL.glPopMatrix();
        }
        if (!this.field_bb.b((byte) -92)) {
          if (!this.field_Lb) {
            jaggl.OpenGL.glLoadMatrixf(this.field_ec.a(qg.field_a, true), 0);
          } else {
            jaggl.OpenGL.glLoadIdentity();
          }
          this.field_Kc = false;
        } else {
          if (!this.field_Dc) {
            jaggl.OpenGL.glLoadMatrixf(this.field_t.a(qg.field_a, true), 0);
            this.field_Dc = true;
            this.V(0);
            this.k((byte) 126);
          }
          if (this.field_Lb) {
            this.field_Kc = false;
          } else {
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glMultMatrixf(this.field_ec.a(qg.field_a, true), 0);
            this.field_Kc = true;
          }
        }
        if (param0 != 2) {
          this.d(true);
        }
    }

    final void v(int param0) {
        if (param0 != 5) {
          return;
        }
        this.field_Dc = false;
        this.X(param0 - 3);
    }

    final void V(int param0) {
        jaggl.OpenGL.glLightfv(16384, 4611, this.field_Jb, param0);
        jaggl.OpenGL.glLightfv(16385, 4611, this.field_Gb, 0);
    }

    final void d(boolean param0) {
        if (this.field_ib) {
          jaggl.OpenGL.glEnable(2929);
        } else {
          jaggl.OpenGL.glDisable(2929);
        }
        if (param0) {
          this.field_Sc = (IntrusiveDeque) null;
        }
    }

    final void a(jb param0, int param1, boolean param2, byte param3) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          jaggl.OpenGL.glTexEnvi(8960, 34184 + param1, ii.a((byte) 79, param0));
          stackIn_2_0 = 8960;
          stackIn_2_1 = param1 + 34200;
          if (!param2) {
            stackIn_3_2 = 770;
          } else {
            stackIn_3_2 = 771;
          }
          jaggl.OpenGL.glTexEnvi(stackIn_2_0, stackIn_2_1, stackIn_3_2);
          if (param3 < 90) {
            this.field_Wc = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jc.LB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void e() {
        if (this.field_Z <= 0 &&
          this.field_jb <= 0) {
          return;
        }
        int var1 = this.field_R;
        int var2 = this.field_gc;
        int var3 = this.field_Nb;
        int var4 = this.field_V;
        this.U(0);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.S(-32);
        this.a(false, false);
        this.b(false, 256);
        this.a((byte) -1, false);
        this.a(-32, false);
        this.a((jj) null, -9135);
        this.a(false, false, -2, 3);
        this.b(1, false);
        this.e(true, 0);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, this.field_Z, this.field_jb, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.KA(var1, var3, var2, var4);
    }

    final qi a(la param0, int param1, int param2, int param3, hd param4) {
        RuntimeException var6 = null;
        qi stackIn_2_0 = null;
        ed stackIn_8_0 = null;
        ik stackIn_11_0 = null;
        ed stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8) {
            stackIn_2_0 = (qi) null;
            return stackIn_2_0;
          }
          if (!this.field_zc && (!mg.a(param3, (byte) -58) ||
            !mg.a(param2, (byte) -64))) {
            if (!this.field_tc) {
              stackIn_13_0 = new ed(this, param4, param0, fk.a(param3, 67), fk.a(param2, 78));
              return (qi) ((Object) stackIn_13_0);
            }
            stackIn_11_0 = new ik(this, param4, param0, param3, param2);
            return (qi) ((Object) stackIn_11_0);
          }
          stackIn_8_0 = new ed(this, param4, param0, param3, param2);
          return (qi) ((Object) stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("jc.FB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    jc(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, ResourceArchive param4, int param5) {
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
        this.field_uc = new IntrusiveDeque();
        this.field_Ec = new IntrusiveDeque();
        this.field_Lc = new IntrusiveDeque();
        this.field_Wc = new IntrusiveDeque();
        this.field_vc = new IntrusiveDeque();
        this.field_Sc = new IntrusiveDeque();
        this.field_Uc = new IntrusiveDeque();
        this.field_Gc = new cg[16];
        this.field_Qc = new jaggl.MapBuffer();
        this.field_Fc = new jaggl.MapBuffer();
        try {
          try {
            this.field_Ac = param0;
            this.field_Ac.b();
            this.field_Ic = jaggl.OpenGL.glGetString(7936).toLowerCase();
            this.field_sc = jaggl.OpenGL.glGetString(7937).toLowerCase();
            if (this.field_Ic.indexOf("microsoft") == -1 &&
              this.field_Ic.indexOf("brian paul") == -1 &&
              this.field_Ic.indexOf("mesa") == -1) {
              var20 = jaggl.OpenGL.glGetString(7938);
              var9 = ee.a((byte) 10, ' ', var20.replace('.', ' '));
              if (var9.length < 2) {
                throw new RuntimeException("");
              }
              try {
                var10_int = td.a((CharSequence) ((Object) var9[0]), (byte) 38);
                var11_int = td.a((CharSequence) ((Object) var9[1]), (byte) 38);
                this.field_Tc = 10 * var10_int + var11_int;
              } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10 = (NumberFormatException) (Object) decompiledCaughtException;
                throw new RuntimeException("");
              }
              if (12 > this.field_Tc) {
                throw new RuntimeException("");
              }
              if (!this.field_Ac.a("GL_ARB_multitexture")) {
                throw new RuntimeException("");
              }
              if (!this.field_Ac.a("GL_ARB_texture_env_combine")) {
                throw new RuntimeException("");
              }
              var26 = new int[1];
              jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
              this.field_h = var26[0];
              if (this.field_h < 2) {
                throw new RuntimeException("");
              }
              this.field_fc = 8;
              this.field_Cc = this.field_Ac.a("GL_ARB_vertex_buffer_object");
              this.field_Ac.a("GL_ARB_multisample");
              this.field_tc = this.field_Ac.a("GL_ARB_texture_rectangle");
              this.field_Pb = this.field_Ac.a("GL_ARB_texture_cube_map");
              this.field_zc = this.field_Ac.a("GL_ARB_texture_non_power_of_two");
              this.field_J = this.field_Ac.a("GL_EXT_texture3D");
              this.field_rc = this.field_Ac.a("GL_ARB_vertex_shader");
              this.field_Vc = this.field_Ac.a("GL_ARB_vertex_program");
              this.field_Nc = this.field_Ac.a("GL_ARB_fragment_shader");
              this.field_Ac.a("GL_ARB_fragment_program");
              this.field_Hc = new int[this.field_h];
              if (!jaclib.memory.Stream.b()) {
                stackIn_21_1 = 5121;
              } else {
                stackIn_21_1 = 33639;
              }
              this.field_Bc = stackIn_21_1;
              if (this.field_sc.indexOf("radeon") != -1) {
                var11_int = 0;
                var12 = 0;
                var13 = 0;
                var14 = ee.a((byte) 10, ' ', this.field_sc.replace('/', ' '));
                for (var15 = 0; var14.length > var15; var15++) {
                  var21 = var14[var15];
                  var16 = var21;
                  var16 = var21;
                  var16 = var21;
                  try {
                    boolean decompiledFrameRemainder0 = true;
                    if (var21.length() > 0) {
                      if (var21.charAt(0) == 120 &&
                        var21.length() >= 3) {
                        var31 = (CharSequence) ((Object) var21.substring(1, 3));
                        if (vl.a(10, var31)) {
                          var16 = var21.substring(1);
                          var13 = 1;
                        }
                      }
                      if (!var16.equals("hd")) {
                        if (var16.startsWith("hd")) {
                          var16 = var16.substring(2);
                          var12 = 1;
                        }
                        if (var16.length() >= 4) {
                          var32 = (CharSequence) ((Object) var16.substring(0, 4));
                          if (vl.a(10, var32)) {
                            var33 = (CharSequence) ((Object) var16.substring(0, 4));
                            var11_int = td.a(var33, (byte) 38);
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
                    var11_int <= 7999) {
                    this.field_Cc = false;
                  }
                  if (var11_int >= 7000 &&
                    var11_int <= 9250) {
                    this.field_J = false;
                  }
                }
                this.field_tc = this.field_tc & this.field_Ac.a("GL_ARB_half_float_pixel");
              }
              if (-1 == this.field_Ic.indexOf("intel")) {
              }
              if (this.field_Cc) {
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
            this.a(-9);
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var8_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_60_0 = var8_ref;
          stackIn_60_1 = new StringBuilder().append("jc.<init>(");
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
          throw pn.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param5).append(')').toString());
        }
    }

    final void l(int param0) {
        if (param0 != -30535) {
          return;
        }
        if (this.field_Ab) {
          jaggl.OpenGL.glEnable(16384);
          jaggl.OpenGL.glEnable(16385);
        } else {
          jaggl.OpenGL.glDisable(16384);
          jaggl.OpenGL.glDisable(16385);
        }
    }

    final void a() {
    }

    final void a(RenderSprite param0, boolean param1) {
    }

    final void a(fa param0, byte param1) {
        int var15 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_34_1 = false;
        int stackIn_38_0 = 0;
        boolean stackIn_46_1 = false;
        int stackIn_49_0 = 0;
        int stackIn_50_1 = 0;
        boolean stackIn_57_1 = false;
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
        pl var9 = null;
        cg var10 = null;
        int var11 = 0;
        int var12 = 0;
        long var13 = 0L;
        rl var16 = null;
        int var17 = 0;
        pl[] var18 = null;
        int var8Lifetime1;
        int var8Lifetime2;
        var17 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var18 = ((tq) (param0)).field_g;
          var4 = 0;
          var5 = 0;
          if (param1 != 75) {
            return;
          }
          var6 = 0;
          var7 = 0;
          for (var8 = 0; var8 < var18.length; var8++) {
            var9 = var18[var8];
            var10 = this.field_Gc[var8];
            var11 = 0;
            var12 = var10.c((byte) 56);
            var13 = var10.b((byte) 96);
            var10.b(-17310);
            for (var15 = 0; var9.a((byte) 90) > var15; var15++) {
              var16 = var9.b(var15, 121);
              if (rl.field_b != var16) {
                if (var16 == rl.field_m) {
                  var6 = 1;
                  jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                } else {
                  if (var16 == rl.field_c) {
                    var5 = 1;
                    jaggl.OpenGL.glColorPointer(4, 5121, var12, var13 + (long)var11);
                  } else {
                    if (rl.field_k == var16) {
                      incrementValue$0 = var4;
                      var4++;
                      jaggl.OpenGL.glClientActiveTexture(incrementValue$0 + 33984);
                      jaggl.OpenGL.glTexCoordPointer(1, 5126, var12, var13 + (long)var11);
                    } else {
                      if (rl.field_j == var16) {
                        incrementValue$1 = var4;
                        var4++;
                        jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$1);
                        jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                      } else {
                        if (rl.field_g == var16) {
                          incrementValue$2 = var4;
                          var4++;
                          jaggl.OpenGL.glClientActiveTexture(incrementValue$2 + 33984);
                          jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, (long)var11 + var13);
                        } else {
                          if (var16 == rl.field_n) {
                            incrementValue$3 = var4;
                            var4++;
                            jaggl.OpenGL.glClientActiveTexture(incrementValue$3 + 33984);
                            jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 + (long)var11);
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                jaggl.OpenGL.glVertexPointer(3, 5126, var12, var13 + (long)var11);
                var7 = 1;
              }
              var11 = var11 + var16.field_l;
            }
          }
          stackIn_27_0 = (this.field_Jc) ? 0 : 1;
          if (stackIn_27_0 == var7) {
            if (var7 != 0) {
              jaggl.OpenGL.glEnableClientState(32884);
            } else {
              jaggl.OpenGL.glDisableClientState(32884);
            }
            stackIn_34_1 = (var7 != 0);
            this.field_Jc = stackIn_34_1;
          }
          stackIn_38_0 = (var6 != 0) ? 0 : 1;
          if (stackIn_38_0 == (this.field_Oc ? 1 : 0)) {
            if (var6 == 0) {
              jaggl.OpenGL.glDisableClientState(32885);
            } else {
              jaggl.OpenGL.glEnableClientState(32885);
            }
            stackIn_46_1 = (var6 != 0);
            this.field_Oc = stackIn_46_1;
          }
          stackIn_49_0 = var5;
          if (this.field_Xc) {
            stackIn_50_1 = 0;
          } else {
            stackIn_50_1 = 1;
          }
          if (stackIn_49_0 == stackIn_50_1) {
            if (var5 == 0) {
              jaggl.OpenGL.glDisableClientState(32886);
            } else {
              jaggl.OpenGL.glEnableClientState(32886);
            }
            stackIn_57_1 = (var5 != 0);
            this.field_Xc = stackIn_57_1;
          }
          if (this.field_yc < var4) {
            for (var8Lifetime1 = this.field_yc; var4 > var8Lifetime1; var8Lifetime1++) {
              jaggl.OpenGL.glClientActiveTexture(var8Lifetime1 + 33984);
              jaggl.OpenGL.glEnableClientState(32888);
            }
            this.field_yc = var4;
            return;
          }
          if (var4 < this.field_yc) {
            for (var8Lifetime2 = var4; var8Lifetime2 < this.field_yc; var8Lifetime2++) {
              jaggl.OpenGL.glClientActiveTexture(33984 + var8Lifetime2);
              jaggl.OpenGL.glDisableClientState(32888);
            }
            this.field_yc = var4;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_72_0 = var3;
          stackIn_72_1 = new StringBuilder().append("jc.BC(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean d() {
        return false;
    }

    final void C(int param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        if (param0 >= -51) {
          this.field_Wc = (IntrusiveDeque) null;
        }
        jaggl.OpenGL.glLoadMatrixf(this.field_N, 0);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final float o(byte param0) {
        if (param0 != 42) {
          this.w(107);
        }
        return 0.0f;
    }

    final sk b(int param0, byte param1) {
        int var3;
        int var4;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param1 < 31) {
          this.field_Ic = (String) null;
        }
        var3 = param0;
        if (var3 == 3) {
          return (sk) ((Object) new kf(this, this.field_d));
        }
        if (4 == var3) {
          return (sk) ((Object) new fm(this, this.field_d, this.field_Tb));
        }
        if (var3 != 8) {
          return super.b(param0, (byte) 58);
        }
        return (sk) ((Object) new lo(this, this.field_d, this.field_Tb));
    }

    final void a(nf param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1) {
            this.field_yc = 45;
          }
          if (b.field_b == param0) {
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
          } else {
            var3_int = np.a(param0, false);
            jaggl.OpenGL.glTexGeni(8192, 9472, var3_int);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glTexGeni(8193, 9472, var3_int);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glTexGeni(8194, 9472, var3_int);
            jaggl.OpenGL.glEnable(3170);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jc.MB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final fa a(pl[] param0, int param1) {
        RuntimeException var3 = null;
        tq stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -126) {
            this.l((byte) 68);
          }
          stackIn_3_0 = new tq(param0);
          return (fa) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jc.RA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void b(int param0) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int var2;
        int var4;
        iq var5;
        iq var6;
        iq var7;
        iq var8;
        iq var9;
        IntrusiveNode var10;
        IntrusiveNode var11;
        iq var12;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        while (!this.field_Ec.isEmpty(true)) {
          var5 = (iq) (this.field_Ec.removeFirst(126));
          incrementValue$3 = var2;
          var2++;
          ac.field_e[incrementValue$3] = (int)var5.key;
          this.field_j = this.field_j - var5.field_f;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteBuffersARB(var2, ac.field_e, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteBuffersARB(var2, ac.field_e, 0);
          var2 = 0;
        }
        while (!this.field_Lc.isEmpty(true)) {
          var6 = (iq) (this.field_Lc.removeFirst(124));
          incrementValue$2 = var2;
          var2++;
          ac.field_e[incrementValue$2] = (int)var6.key;
          this.field_jc = this.field_jc - var6.field_f;
          if (1000 != var2) {
            continue;
          }
          jaggl.OpenGL.glDeleteTextures(var2, ac.field_e, 0);
          var2 = 0;
        }
        if (0 < var2) {
          jaggl.OpenGL.glDeleteTextures(var2, ac.field_e, 0);
          var2 = 0;
        }
        while (!this.field_Wc.isEmpty(true)) {
          var7 = (iq) (this.field_Wc.removeFirst(121));
          incrementValue$1 = var2;
          var2++;
          ac.field_e[incrementValue$1] = var7.field_f;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, ac.field_e, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, ac.field_e, 0);
          var2 = 0;
        }
        while (!this.field_vc.isEmpty(true)) {
          var8 = (iq) (this.field_vc.removeFirst(124));
          incrementValue$0 = var2;
          var2++;
          ac.field_e[incrementValue$0] = (int)var8.key;
          this.field_qb = this.field_qb - var8.field_f;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, ac.field_e, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, ac.field_e, 0);
          var2 = 0;
        }
        while (!this.field_uc.isEmpty(true)) {
          var9 = (iq) (this.field_uc.removeFirst(120));
          jaggl.OpenGL.glDeleteLists((int)var9.key, var9.field_f);
        }
        while (!this.field_Sc.isEmpty(true)) {
          var10 = this.field_Sc.removeFirst(125);
          jaggl.OpenGL.glDeleteProgramARB((int)var10.key);
        }
        while (!this.field_Uc.isEmpty(true)) {
          var11 = this.field_Uc.removeFirst(121);
          jaggl.OpenGL.glDeleteObjectARB(var11.key);
        }
        while (!this.field_uc.isEmpty(true)) {
          var12 = (iq) (this.field_uc.removeFirst(124));
          jaggl.OpenGL.glDeleteLists((int)var12.key, var12.field_f);
        }
        if (this.i((byte) -91) > 100663296 &&
          kh.a(-72) > (60000L + this.field_xc)) {
          System.gc();
          this.field_xc = kh.a(-59);
        }
        super.b(param0);
    }

    final void p(int param0) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (mq.field_g != this.field_f[this.field_F]) {
          jaggl.OpenGL.glLoadMatrixf(this.field_L[this.field_F].a(qg.field_a, true), 0);
        } else {
          jaggl.OpenGL.glLoadIdentity();
        }
        if (param0 > -111) {
          return;
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final synchronized void c(int param0, int param1) {
        if (param0 <= 105) {
          return;
        }
        IntrusiveNode var3 = new IntrusiveNode();
        var3.key = (long)param1;
        this.field_Sc.addLast(113, var3);
    }

    final void l(byte param0) {
        int var3;
        var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (pi.field_x == this.field_zb) {
          jaggl.OpenGL.glBlendFunc(770, 771);
        } else {
          if (ne.field_i == this.field_zb) {
            jaggl.OpenGL.glBlendFunc(1, 1);
          } else {
            if (this.field_zb == uc.field_l) {
              jaggl.OpenGL.glBlendFunc(774, 1);
            }
          }
        }
        if (param0 < 39) {
          this.p(127);
        }
    }

    final void a(int param0, java.awt.Canvas param1, Object param2) {
        Long var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = (Long) (param2);
          this.field_Ac.releaseSurface(param1, var4.longValue());
          if (param0 != 0) {
            field_wc = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("jc.RC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(byte param0, la param1, hd param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -13) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("jc.JB(").append(param0).append(',');
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
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void m(byte param0) {
        if (param0 >= -124) {
          this.field_Uc = (IntrusiveDeque) null;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34162, IntrusiveDeque.a(61, this.field_w[this.field_F]));
    }

    final void t(byte param0) {
        np.field_d[0] = this.field_g * this.field_fb;
        np.field_d[3] = 1.0f;
        np.field_d[1] = this.field_rb * this.field_fb;
        np.field_d[2] = this.field_Hb * this.field_fb;
        int var2 = 36 % ((17 - param0) / 37);
        jaggl.OpenGL.glLightfv(16384, 4609, np.field_d, 0);
        np.field_d[3] = 1.0f;
        np.field_d[0] = this.field_g * -this.field_ub;
        np.field_d[2] = this.field_Hb * -this.field_ub;
        np.field_d[1] = -this.field_ub * this.field_rb;
        jaggl.OpenGL.glLightfv(16385, 4609, np.field_d, 0);
    }

    final ti c(boolean param0, int param1) {
        if (param1 != 8762) {
          gd var4 = (gd) null;
          this.a((ra) null, (gd) null);
        }
        return (ti) ((Object) new ro(this, la.field_b, param0));
    }

    final qi a(int param0, boolean param1, hd param2, int param3, byte param4, int param5, int param6, byte[] param7) {
        RuntimeException var9 = null;
        ed var10 = null;
        ed stackIn_8_0 = null;
        ik stackIn_10_0 = null;
        ed stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 73) {
            field_Rc = (String[]) null;
          }
          if (!this.field_zc && (!mg.a(param0, (byte) -112) ||
            !mg.a(param3, (byte) -41))) {
            if (this.field_tc) {
              stackIn_10_0 = new ik(this, param2, param0, param3, param7, param6, param5);
              return (qi) ((Object) stackIn_10_0);
            }
            var10 = new ed(this, param2, la.field_h, fk.a(param0, 40), fk.a(param3, 103));
            var10.a(0, param0, param6, param3, (byte) -29, param7, param2, 0, param5);
            stackIn_8_0 = var10;
            return (qi) ((Object) stackIn_8_0);
          }
          stackIn_12_0 = new ed(this, param2, param0, param3, param1, param7, param6, param5);
          return (qi) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_15_0 = var9;
          stackIn_15_1 = new StringBuilder().append("jc.JC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final tl a(boolean param0, byte param1) {
        if (param1 < 72) {
          this.l(-122);
        }
        return (tl) ((Object) new cg(this, param0));
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
          this.c(true);
          this.a((jj) null, -9135);
          this.e(true, 0);
          this.a((byte) 108);
          jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
          jaggl.OpenGL.glRasterPos2i(param0, param1);
          jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_Bc, param4, param5);
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "jc.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void G(int param0) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var2 = -58 % ((param0 + 65) / 51);
        for (var3_int = -1 + this.field_h; var3_int >= 0; var3_int--) {
          jaggl.OpenGL.glActiveTexture(33984 + var3_int);
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
        float[] var3 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        for (var4 = 0; var4 < 8; var4++) {
          var5 = var4 + 16384;
          jaggl.OpenGL.glLightfv(var5, 4608, var3, 0);
          jaggl.OpenGL.glLightf(var5, 4615, 0.0f);
          jaggl.OpenGL.glLightf(var5, 4616, 0.0f);
        }
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.field_Ac.setSwapInterval(0);
        super.G(-127);
    }

    final sm a(ra param0, gd param1) {
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
          return (sm) (stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("jc.G(");
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
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void T(int param0) {
        if (param0 != 0) {
          this.field_Nc = true;
        }
        if (this.field_ob &&
          !this.field_pc) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        iq var4 = new iq(param0);
        if (param1 != 9841) {
          this.field_zc = true;
        }
        var4.key = (long)param2;
        this.field_Ec.addLast(113, var4);
    }

    final void b(int param0, int param1) throws lp {
        this.field_Ac.swapBuffers();
    }

    final void w(int param0) {
        boolean stackIn_4_0 = false;
        stackIn_4_0 = (this.field_mb) && (this.field_Y);
        jaggl.OpenGL.glDepthMask(stackIn_4_0);
        if (param0 != 0) {
          this.l((byte) -59);
        }
    }

    final synchronized void a(int param0, long param1) {
        if (param0 != -25160) {
          this.h((byte) 1);
        }
        IntrusiveNode var4 = new IntrusiveNode();
        var4.key = param1;
        this.field_Uc.addLast(90, var4);
    }

    final qi a(int param0, boolean param1, boolean param2, int param3, int param4, int[] param5, int param6) {
        RuntimeException var8 = null;
        ed var9 = null;
        qi stackIn_2_0 = null;
        ed stackIn_9_0 = null;
        ik stackIn_11_0 = null;
        ed stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (qi) null;
            return stackIn_2_0;
          }
          if (!this.field_zc && (!mg.a(param6, (byte) 32) ||
            !mg.a(param3, (byte) 123))) {
            if (this.field_tc) {
              stackIn_11_0 = new ik(this, param6, param3, param5, param0, param4);
              return (qi) ((Object) stackIn_11_0);
            }
            var9 = new ed(this, lc.field_g, la.field_h, fk.a(param6, 25), fk.a(param3, 30));
            var9.a((byte) -106, param0, 0, param4, param6, param3, 0, param5);
            stackIn_9_0 = var9;
            return (qi) ((Object) stackIn_9_0);
          }
          stackIn_13_0 = new ed(this, param6, param3, param2, param5, param0, param4);
          return (qi) ((Object) stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("jc.VC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(')').toString());
        }
    }

    final void b(byte param0, boolean param1) {
        if (param1) {
          jaggl.OpenGL.glEnable(32925);
        } else {
          jaggl.OpenGL.glDisable(32925);
        }
        if (param0 > -113) {
          this.a(-43, -4L);
        }
    }

    final void j(int param0) {
        if (param0 != 1) {
          return;
        }
        int var2 = this.field_Hc[this.field_F];
        if (var2 != 0) {
          this.field_Hc[this.field_F] = 0;
          jaggl.OpenGL.glBindTexture(var2, 0);
          jaggl.OpenGL.glDisable(var2);
        }
    }

    final boolean a(la param0, int param1, hd param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return true;
          }
          this.o((byte) -62);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jc.KB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void u(byte param0) {
        if (param0 >= -29) {
          this.r(-74);
        }
        if (this.field_Vb) {
          jaggl.OpenGL.glEnable(3008);
        } else {
          jaggl.OpenGL.glDisable(3008);
        }
    }

    final gd a(int param0, int param1) {
        return null;
    }

    final void c() {
        super.c();
        if (this.field_Ac != null) {
          this.field_Ac.a();
          this.field_Ac.release();
          this.field_Ac = null;
        }
    }

    public static void W(int param0) {
        field_Rc = null;
        field_Mc = null;
        field_wc = null;
        field_Pc = null;
        int var1 = 10 / ((50 - param0) / 52);
    }

    final void a(boolean param0, int param1, boolean param2, jb param3, boolean param4) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          jaggl.OpenGL.glTexEnvi(8960, 34176 + param1, ii.a((byte) 73, param3));
          if (param0) {
            stackIn_7_0 = 8960;
            stackIn_7_1 = 34192 + param1;
            if (!param4) {
              stackIn_8_2 = 770;
            } else {
              stackIn_8_2 = 771;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_7_0, stackIn_7_1, stackIn_8_2);
          } else {
            stackIn_3_0 = 8960;
            stackIn_3_1 = param1 + 34192;
            if (!param4) {
              stackIn_4_2 = 768;
            } else {
              stackIn_4_2 = 769;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_3_0, stackIn_3_1, stackIn_4_2);
          }
          if (!param2) {
            this.field_Nc = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("jc.CD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(sm param0) {
    }

    final void a(boolean param0, ia param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!param0) {
            return;
          }
          if (param1 != wt.field_m) {
            if (param1 == bm.field_x) {
              var5_int = 3;
              var6 = 1 + param2;
            } else {
              if (tm.field_h == param1) {
                var5_int = 4;
                var6 = 3 * param2;
              } else {
                if (qp.field_j != param1) {
                  if (gh.field_i != param1) {
                    var6 = param2;
                    var5_int = 0;
                  } else {
                    var6 = param2 + 2;
                    var5_int = 5;
                  }
                } else {
                  var5_int = 6;
                  var6 = param2 + 2;
                }
              }
            }
          } else {
            var5_int = 1;
            var6 = 2 * param2;
          }
          jaggl.OpenGL.glDrawArrays(var5_int, param3, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("jc.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void p(byte param0) {
        if (this.field_Db) {
          jaggl.OpenGL.glEnable(3042);
        } else {
          jaggl.OpenGL.glDisable(3042);
        }
        if (param0 > -127) {
          this.field_Fc = (jaggl.MapBuffer) null;
        }
    }

    final void c(int param0, byte param1) {
        if (param1 >= -76) {
          this.Q(98);
        }
    }

    final void m(int param0) {
        np.field_d[2] = this.field_Hb * this.field_Wb;
        np.field_d[0] = this.field_g * this.field_Wb;
        np.field_d[1] = this.field_Wb * this.field_rb;
        np.field_d[3] = 1.0f;
        if (param0 >= -108) {
          this.g(29);
        }
        jaggl.OpenGL.glLightModelfv(2899, np.field_d, 0);
    }

    final void k(byte param0) {
        sf var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.a((byte) 82);
        if (param0 < 123) {
          this.V(93);
        }
        for (var2 = 0; var2 < this.field_B; var2++) {
          var3 = this.field_D[var2];
          var4 = var3.a(105);
          var5 = 16386 + var2;
          var6 = var3.a(false) / 255.0f;
          np.field_d[0] = (float)var3.c((byte) -96);
          np.field_d[1] = (float)var3.a((byte) -111);
          np.field_d[2] = (float)var3.e(0);
          np.field_d[3] = 1.0f;
          jaggl.OpenGL.glLightfv(var5, 4611, np.field_d, 0);
          np.field_d[1] = var6 * (float)pg.a(255, var4 >> 8);
          np.field_d[0] = var6 * (float)pg.a(255, var4 >> 16);
          np.field_d[2] = (float)pg.a(255, var4) * var6;
          np.field_d[3] = 1.0f;
          jaggl.OpenGL.glLightfv(var5, 4609, np.field_d, 0);
          jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.d(0) * var3.d(0)));
          jaggl.OpenGL.glEnable(var5);
        }
        while (var2 < this.field_ic) {
          jaggl.OpenGL.glDisable(var2 + 16386);
          var2++;
        }
        super.k((byte) 124);
    }

    final void w(byte param0) {
        if (param0 > -40) {
          return;
        }
        jaggl.OpenGL.glActiveTexture(33984 + this.field_F);
    }

    static {
        field_wc = "Use this alternative as your account name";
        field_Pc = new pt();
        field_Rc = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_Mc = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
