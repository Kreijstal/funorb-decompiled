/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends bf {
    static pt field_Pc;
    private jaggl.OpenGL field_Ac;
    static String field_wc;
    private kp field_uc;
    static String field_Mc;
    private kp field_Ec;
    private kp field_Lc;
    private kp field_Wc;
    static String[] field_Rc;
    private kp field_vc;
    private kp field_Sc;
    private kp field_Uc;
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
        if (param1 >= -93) {
            ((jc) this).field_Ac = (jaggl.OpenGL) null;
        }
        return (bp) (Object) new mh((jc) this, param3, param2, param0, param4, param5);
    }

    final void Q(int param0) {
        jaggl.OpenGL.glViewport(((jc) this).field_Rb, ((jc) this).field_Ib, ((jc) this).field_Z, ((jc) this).field_jb);
        if (param0 < 52) {
            ((jc) this).field_zc = true;
        }
    }

    final void N(int param0) {
        if (param0 != 0) {
            ((jc) this).field_Jc = true;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, kp.a(-84, ((jc) this).field_H[((jc) this).field_F]));
    }

    final void h(byte param0) {
        ((jc) this).field_y = (float)(((jc) this).field_x + -((jc) this).field_q);
        ((jc) this).field_Xb = ((jc) this).field_y - (float)((jc) this).field_p;
        if (!(((jc) this).field_Xb >= (float)((jc) this).field_Mb)) {
            ((jc) this).field_Xb = (float)((jc) this).field_Mb;
        }
        jaggl.OpenGL.glFogf(2915, ((jc) this).field_Xb);
        jaggl.OpenGL.glFogf(2916, ((jc) this).field_y);
        np.field_d[2] = (float)pg.a(((jc) this).field_X, 255) / 255.0f;
        np.field_d[0] = (float)pg.a(((jc) this).field_X, 16711680) / 16711680.0f;
        if (param0 > -98) {
            ((jc) this).field_Vc = false;
        }
        np.field_d[1] = (float)pg.a(((jc) this).field_X, 65280) / 65280.0f;
        jaggl.OpenGL.glFogfv(2918, np.field_d, 0);
    }

    final go a(int param0, int param1, boolean param2, int[][] param3) {
        int var5 = 123 % ((param1 - 18) / 51);
        return (go) (Object) new qp((jc) this, param0, param2, param3);
    }

    final Object a(int param0, java.awt.Canvas param1) {
        if (param0 != -15083) {
            return (Object) null;
        }
        long var3 = ((jc) this).field_Ac.prepareSurface(param1);
        if (!((var3 ^ -1L) != 0L)) {
            throw new RuntimeException();
        }
        return (Object) (Object) new Long(var3);
    }

    final qi a(float[] param0, int param1, hd param2, boolean param3, int param4, int param5, int param6, boolean param7) {
        ed var10 = null;
        L0: {
          if (!param3) {
            break L0;
          } else {
            ((jc) this).field_Tc = -76;
            break L0;
          }
        }
        L1: {
          if (((jc) this).field_zc) {
            break L1;
          } else {
            L2: {
              if (!mg.a(param1, (byte) 114)) {
                break L2;
              } else {
                if (!mg.a(param5, (byte) 105)) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (((jc) this).field_tc) {
              return (qi) (Object) new ik((jc) this, param2, param1, param5, param0, param6, param4);
            } else {
              var10 = new ed((jc) this, param2, la.field_i, fk.a(param1, 57), fk.a(param5, 118));
              var10.a(param0, (byte) -124, 0, 0, param6, param4, param5, param2, param1);
              return (qi) (Object) var10;
            }
          }
        }
        return (qi) (Object) new ed((jc) this, param2, param1, param5, param7, param0, param6, param4);
    }

    final void r(int param0) {
        if (((jc) this).field_Cb) {
            jaggl.OpenGL.glEnable(3089);
        } else {
            jaggl.OpenGL.glDisable(3089);
        }
        if (param0 != 0) {
            ((jc) this).field_Nc = true;
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        iq var4 = new iq(param1);
        if (param0 != 3) {
            ((jc) this).g(91);
        }
        var4.field_b = (long)param2;
        ((jc) this).field_Lc.a(81, (wf) (Object) var4);
    }

    final void s(byte param0) {
        if (param0 != -94) {
            ((jc) this).field_Cc = false;
        }
    }

    final void a(int param0, tl param1, int param2) {
        if (param0 != 1) {
            ((jc) this).field_Oc = true;
        }
        ((jc) this).field_Gc[param2] = (cg) param1;
    }

    final void I(int param0) {
        int var2 = 60 % ((27 - param0) / 38);
        jaggl.OpenGL.glScissor(((jc) this).field_R + ((jc) this).field_Rb, -((jc) this).field_V + (((jc) this).field_Ib - -((jc) this).field_jb), ((jc) this).field_gc + -((jc) this).field_R, ((jc) this).field_V - ((jc) this).field_Nb);
    }

    final void g(int param0) {
        np.field_d[1] = (float)pg.a(65280, ((jc) this).field_cc) / 65280.0f;
        np.field_d[2] = (float)pg.a(((jc) this).field_cc, 255) / 255.0f;
        np.field_d[0] = (float)pg.a(((jc) this).field_cc, 16711680) / 16711680.0f;
        np.field_d[3] = (float)(((jc) this).field_cc >>> 158645464) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, np.field_d, param0);
    }

    final void b(boolean param0) {
        if (((jc) this).field_I) {
            // ifeq L30
            // iflt L30
            jaggl.OpenGL.glEnable(2912);
        } else {
            jaggl.OpenGL.glDisable(2912);
        }
        if (param0) {
            ia var3 = (ia) null;
            ((jc) this).a(true, (ia) null, 20, 74);
        }
    }

    final void b(byte param0) {
        int var2 = 109 % ((param0 - 9) / 48);
        this.X(2);
    }

    private final void X(int param0) {
        int var3 = 0;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (((jc) this).field_Kc) {
            jaggl.OpenGL.glPopMatrix();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!((jc) this).field_bb.b((byte) -92)) {
            if (!((jc) this).field_Lb) {
              jaggl.OpenGL.glLoadMatrixf(((jc) this).field_ec.a(qg.field_a, true), 0);
              ((jc) this).field_Kc = false;
              break L1;
            } else {
              jaggl.OpenGL.glLoadIdentity();
              ((jc) this).field_Kc = false;
              break L1;
            }
          } else {
            L2: {
              if (!((jc) this).field_Dc) {
                jaggl.OpenGL.glLoadMatrixf(((jc) this).field_t.a(qg.field_a, true), 0);
                ((jc) this).field_Dc = true;
                ((jc) this).V(0);
                ((jc) this).k((byte) 126);
                break L2;
              } else {
                break L2;
              }
            }
            if (((jc) this).field_Lb) {
              ((jc) this).field_Kc = false;
              break L1;
            } else {
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glMultMatrixf(((jc) this).field_ec.a(qg.field_a, true), 0);
              ((jc) this).field_Kc = true;
              break L1;
            }
          }
        }
        L3: {
          if (param0 == 2) {
            break L3;
          } else {
            ((jc) this).d(true);
            break L3;
          }
        }
    }

    final void v(int param0) {
        if (param0 != 5) {
            return;
        }
        ((jc) this).field_Dc = false;
        this.X(param0 + -3);
    }

    final void V(int param0) {
        jaggl.OpenGL.glLightfv(16384, 4611, ((jc) this).field_Jb, param0);
        jaggl.OpenGL.glLightfv(16385, 4611, ((jc) this).field_Gb, 0);
    }

    final void d(boolean param0) {
        if (((jc) this).field_ib) {
            jaggl.OpenGL.glEnable(2929);
        } else {
            jaggl.OpenGL.glDisable(2929);
        }
        if (param0) {
            ((jc) this).field_Sc = (kp) null;
        }
    }

    final void a(jb param0, int param1, boolean param2, byte param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 - -param1, ii.a((byte) 79, param0));
        jaggl.OpenGL.glTexEnvi(8960, param1 + 34200, param2 ? 771 : 770);
        if (param3 < 90) {
            ((jc) this).field_Wc = (kp) null;
        }
    }

    final void e() {
        if (-1 <= ((jc) this).field_Z) {
            if (-1 >= ((jc) this).field_jb) {
                return;
            }
        }
        int var1 = ((jc) this).field_R;
        int var2 = ((jc) this).field_gc;
        int var3 = ((jc) this).field_Nb;
        int var4 = ((jc) this).field_V;
        ((jc) this).U(0);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((jc) this).S(-32);
        ((jc) this).a(false, false);
        ((jc) this).b(false, 256);
        ((jc) this).a((byte) -1, false);
        ((jc) this).a(-32, false);
        ((jc) this).a((jj) null, -9135);
        ((jc) this).a(false, false, -2, 3);
        ((jc) this).b(1, false);
        ((jc) this).e(true, 0);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, ((jc) this).field_Z, ((jc) this).field_jb, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((jc) this).KA(var1, var3, var2, var4);
    }

    final qi a(la param0, int param1, int param2, int param3, hd param4) {
        if (param1 == 8) {
          L0: {
            if (((jc) this).field_zc) {
              break L0;
            } else {
              L1: {
                if (!mg.a(param3, (byte) -58)) {
                  break L1;
                } else {
                  if (!mg.a(param2, (byte) -64)) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              if (!((jc) this).field_tc) {
                return (qi) (Object) new ed((jc) this, param4, param0, fk.a(param3, 67), fk.a(param2, 78));
              } else {
                return (qi) (Object) new ik((jc) this, param4, param0, param3, param2);
              }
            }
          }
          return (qi) (Object) new ed((jc) this, param4, param0, param3, param2);
        } else {
          return (qi) null;
        }
    }

    jc(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, gk param4, int param5) {
        super(param1, (Object) (Object) new Long(param2), param3, param4, param5, 1);
        Throwable var8 = null;
        String[] var9 = null;
        NumberFormatException var10 = null;
        int var10_int = 0;
        Throwable var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        Object[] var14 = null;
        String[] var14_array = null;
        int var15 = 0;
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
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var28 = null;
                    var29 = null;
                    var30 = null;
                    ((jc) this).field_uc = new kp();
                    ((jc) this).field_Ec = new kp();
                    ((jc) this).field_Lc = new kp();
                    ((jc) this).field_Wc = new kp();
                    ((jc) this).field_vc = new kp();
                    ((jc) this).field_Sc = new kp();
                    ((jc) this).field_Uc = new kp();
                    ((jc) this).field_Gc = new cg[16];
                    ((jc) this).field_Qc = new jaggl.MapBuffer();
                    ((jc) this).field_Fc = new jaggl.MapBuffer();
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((jc) this).field_Ac = param0;
                        boolean discarded$3 = ((jc) this).field_Ac.b();
                        ((jc) this).field_Ic = jaggl.OpenGL.glGetString(7936).toLowerCase();
                        ((jc) this).field_sc = jaggl.OpenGL.glGetString(7937).toLowerCase();
                        if ((((jc) this).field_Ic.indexOf("microsoft") ^ -1) != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((jc) this).field_Ic.indexOf("brian paul") != -1) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((jc) this).field_Ic.indexOf("mesa") ^ -1) == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var20 = jaggl.OpenGL.glGetString(7938);
                        var9 = ee.a((byte) 10, ' ', var20.replace('.', ' '));
                        if ((var9.length ^ -1) > -3) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10_int = td.a((CharSequence) (Object) var9[0], (byte) 38);
                        var11_int = td.a((CharSequence) (Object) var9[1], (byte) 38);
                        ((jc) this).field_Tc = 10 * var10_int - -var11_int;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof NumberFormatException ? 8 : 57);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = (NumberFormatException) (Object) caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (12 <= ((jc) this).field_Tc) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((jc) this).field_Ac.a("GL_ARB_multitexture")) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((jc) this).field_Ac.a("GL_ARB_texture_env_combine")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var26 = new int[1];
                        jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                        ((jc) this).field_h = var26[0];
                        if (-3 >= (((jc) this).field_h ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((jc) this).field_fc = 8;
                        ((jc) this).field_Cc = ((jc) this).field_Ac.a("GL_ARB_vertex_buffer_object");
                        boolean discarded$4 = ((jc) this).field_Ac.a("GL_ARB_multisample");
                        ((jc) this).field_tc = ((jc) this).field_Ac.a("GL_ARB_texture_rectangle");
                        ((jc) this).field_Pb = ((jc) this).field_Ac.a("GL_ARB_texture_cube_map");
                        ((jc) this).field_zc = ((jc) this).field_Ac.a("GL_ARB_texture_non_power_of_two");
                        ((jc) this).field_J = ((jc) this).field_Ac.a("GL_EXT_texture3D");
                        ((jc) this).field_rc = ((jc) this).field_Ac.a("GL_ARB_vertex_shader");
                        ((jc) this).field_Vc = ((jc) this).field_Ac.a("GL_ARB_vertex_program");
                        ((jc) this).field_Nc = ((jc) this).field_Ac.a("GL_ARB_fragment_shader");
                        boolean discarded$5 = ((jc) this).field_Ac.a("GL_ARB_fragment_program");
                        ((jc) this).field_Hc = new int[((jc) this).field_h];
                        stackOut_18_0 = this;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (!jaclib.memory.Stream.b()) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = this;
                        stackOut_19_1 = 33639;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = this;
                        stackOut_20_1 = 5121;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((jc) this).field_Bc = stackIn_21_1;
                        if (0 == (((jc) this).field_sc.indexOf("radeon") ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11_int = 0;
                        var12 = 0;
                        var13 = 0;
                        var14_array = ee.a((byte) 10, ' ', ((jc) this).field_sc.replace('/', ' '));
                        var15 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var14_array.length <= var15) {
                            statePc = 42;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var21 = var14_array[var15];
                        var16 = var21;
                        var16 = var21;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-1 > (var21.length() ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var21.charAt(0) != 120) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var21.length() < 3) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var31 = (CharSequence) var21.substring(1, 3);
                        if (!vl.a(10, var31)) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var16 = var21.substring(1);
                        var13 = 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!var16.equals((Object) (Object) "hd")) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12 = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!var16.startsWith("hd")) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var16 = var16.substring(2);
                        var12 = 1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var16.length() < 4) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var32 = (CharSequence) var16.substring(0, 4);
                        if (!vl.a(10, var32)) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var33 = (CharSequence) var16.substring(0, 4);
                        var11_int = td.a(var33, (byte) 38);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 40 : 57);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var17 = (Exception) (Object) caughtException;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var15++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var13 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var12 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var11_int < 7000) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-8000 > var11_int) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((jc) this).field_Cc = false;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var11_int < 7000) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-9251 < var11_int) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((jc) this).field_J = false;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((jc) this).field_tc = ((jc) this).field_tc & ((jc) this).field_Ac.a("GL_ARB_half_float_pixel");
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (-1 == ((jc) this).field_Ic.indexOf("intel")) {
                            statePc = 52;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (((jc) this).field_Cc) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var27 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var11 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var8 = caughtException;
                    var8.printStackTrace();
                    ((jc) this).a(-9);
                    throw new RuntimeException("");
                }
                case 58: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void l(int param0) {
        if (param0 != -30535) {
            return;
        }
        if (((jc) this).field_Ab) {
            jaggl.OpenGL.glEnable(16384);
            jaggl.OpenGL.glEnable(16385);
        } else {
            jaggl.OpenGL.glDisable(16384);
            jaggl.OpenGL.glDisable(16385);
        }
    }

    final void a() {
    }

    final void a(pa param0, boolean param1) {
    }

    final void a(fa param0, byte param1) {
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
        int var15 = 0;
        rl var16 = null;
        int var17 = 0;
        pl[] var18 = null;
        int stackIn_26_0 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        Object stackOut_53_0 = null;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        var17 = AceOfSkies.field_G ? 1 : 0;
        var18 = ((tq) param0).field_g;
        var4 = 0;
        var5 = 0;
        if (param1 == 75) {
          var6 = 0;
          var7 = 0;
          var8 = 0;
          L0: while (true) {
            if (var8 >= var18.length) {
              L1: {
                if (((jc) this).field_Jc) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L1;
                } else {
                  stackOut_24_0 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  break L1;
                }
              }
              L2: {
                if (stackIn_26_0 != var7) {
                  break L2;
                } else {
                  L3: {
                    if (var7 != 0) {
                      jaggl.OpenGL.glEnableClientState(32884);
                      break L3;
                    } else {
                      jaggl.OpenGL.glDisableClientState(32884);
                      break L3;
                    }
                  }
                  L4: {
                    stackOut_30_0 = this;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (var7 == 0) {
                      stackOut_32_0 = this;
                      stackOut_32_1 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      break L4;
                    } else {
                      stackOut_31_0 = this;
                      stackOut_31_1 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_33_1 = stackOut_31_1;
                      break L4;
                    }
                  }
                  ((jc) this).field_Jc = stackIn_33_1 != 0;
                  break L2;
                }
              }
              L5: {
                if (var6 != 0) {
                  stackOut_36_0 = 0;
                  stackIn_37_0 = stackOut_36_0;
                  break L5;
                } else {
                  stackOut_35_0 = 1;
                  stackIn_37_0 = stackOut_35_0;
                  break L5;
                }
              }
              L6: {
                if (stackIn_37_0 == (((jc) this).field_Oc ? 1 : 0)) {
                  L7: {
                    if (var6 == 0) {
                      jaggl.OpenGL.glDisableClientState(32885);
                      break L7;
                    } else {
                      jaggl.OpenGL.glEnableClientState(32885);
                      break L7;
                    }
                  }
                  L8: {
                    stackOut_42_0 = this;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_43_0 = stackOut_42_0;
                    if (var6 == 0) {
                      stackOut_44_0 = this;
                      stackOut_44_1 = 0;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      break L8;
                    } else {
                      stackOut_43_0 = this;
                      stackOut_43_1 = 1;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      break L8;
                    }
                  }
                  ((jc) this).field_Oc = stackIn_45_1 != 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              L9: {
                stackOut_46_0 = var5;
                stackIn_48_0 = stackOut_46_0;
                stackIn_47_0 = stackOut_46_0;
                if (((jc) this).field_Xc) {
                  stackOut_48_0 = stackIn_48_0;
                  stackOut_48_1 = 0;
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  break L9;
                } else {
                  stackOut_47_0 = stackIn_47_0;
                  stackOut_47_1 = 1;
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  break L9;
                }
              }
              L10: {
                if (stackIn_49_0 != stackIn_49_1) {
                  break L10;
                } else {
                  L11: {
                    if (var5 == 0) {
                      jaggl.OpenGL.glDisableClientState(32886);
                      break L11;
                    } else {
                      jaggl.OpenGL.glEnableClientState(32886);
                      break L11;
                    }
                  }
                  L12: {
                    stackOut_53_0 = this;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_54_0 = stackOut_53_0;
                    if (var5 == 0) {
                      stackOut_55_0 = this;
                      stackOut_55_1 = 0;
                      stackIn_56_0 = stackOut_55_0;
                      stackIn_56_1 = stackOut_55_1;
                      break L12;
                    } else {
                      stackOut_54_0 = this;
                      stackOut_54_1 = 1;
                      stackIn_56_0 = stackOut_54_0;
                      stackIn_56_1 = stackOut_54_1;
                      break L12;
                    }
                  }
                  ((jc) this).field_Xc = stackIn_56_1 != 0;
                  break L10;
                }
              }
              L13: {
                if (((jc) this).field_yc < var4) {
                  var8 = ((jc) this).field_yc;
                  L14: while (true) {
                    if (var4 <= var8) {
                      ((jc) this).field_yc = var4;
                      break L13;
                    } else {
                      jaggl.OpenGL.glClientActiveTexture(var8 + 33984);
                      jaggl.OpenGL.glEnableClientState(32888);
                      var8++;
                      continue L14;
                    }
                  }
                } else {
                  if (var4 < ((jc) this).field_yc) {
                    var8 = var4;
                    L15: while (true) {
                      if (var8 >= ((jc) this).field_yc) {
                        ((jc) this).field_yc = var4;
                        break L13;
                      } else {
                        jaggl.OpenGL.glClientActiveTexture(33984 - -var8);
                        jaggl.OpenGL.glDisableClientState(32888);
                        var8++;
                        continue L15;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              return;
            } else {
              var9 = var18[var8];
              var10 = ((jc) this).field_Gc[var8];
              var11 = 0;
              var12 = var10.c((byte) 56);
              var13 = var10.b((byte) 96);
              var10.b(-17310);
              var15 = 0;
              L16: while (true) {
                if (var9.a((byte) 90) <= var15) {
                  var8++;
                  continue L0;
                } else {
                  L17: {
                    var16 = var9.b(var15, 121);
                    if (rl.field_b != var16) {
                      if (var16 == rl.field_m) {
                        var6 = 1;
                        jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                        break L17;
                      } else {
                        if (var16 == rl.field_c) {
                          var5 = 1;
                          jaggl.OpenGL.glColorPointer(4, 5121, var12, var13 - -(long)var11);
                          break L17;
                        } else {
                          if (rl.field_k == var16) {
                            var4++;
                            jaggl.OpenGL.glClientActiveTexture(var4 + 33984);
                            jaggl.OpenGL.glTexCoordPointer(1, 5126, var12, var13 - -(long)var11);
                            break L17;
                          } else {
                            if (rl.field_j == var16) {
                              var4++;
                              jaggl.OpenGL.glClientActiveTexture(33984 + var4);
                              jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                              break L17;
                            } else {
                              if (rl.field_g == var16) {
                                var4++;
                                jaggl.OpenGL.glClientActiveTexture(var4 + 33984);
                                jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, (long)var11 + var13);
                                break L17;
                              } else {
                                if (var16 == rl.field_n) {
                                  var4++;
                                  jaggl.OpenGL.glClientActiveTexture(var4 + 33984);
                                  jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 - -(long)var11);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      jaggl.OpenGL.glVertexPointer(3, 5126, var12, var13 + (long)var11);
                      var7 = 1;
                      break L17;
                    }
                  }
                  var11 = var11 + ((rl) var16).field_l;
                  var15++;
                  continue L16;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean d() {
        return false;
    }

    final void C(int param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        if (param0 >= -51) {
            ((jc) this).field_Wc = (kp) null;
        }
        jaggl.OpenGL.glLoadMatrixf(((jc) this).field_N, 0);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final float o(byte param0) {
        if (param0 != 42) {
            ((jc) this).w(107);
        }
        return 0.0f;
    }

    final sk b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          if (param1 >= 31) {
            break L0;
          } else {
            ((jc) this).field_Ic = (String) null;
            break L0;
          }
        }
        var3 = param0;
        if ((var3 ^ -1) != -4) {
          if (4 != var3) {
            if ((var3 ^ -1) != -9) {
              return this.b(param0, (byte) 58);
            } else {
              return (sk) (Object) new lo((jc) this, ((jc) this).field_d, ((jc) this).field_Tb);
            }
          } else {
            return (sk) (Object) new fm((jc) this, ((jc) this).field_d, ((jc) this).field_Tb);
          }
        } else {
          return (sk) (Object) new kf((jc) this, ((jc) this).field_d);
        }
    }

    final void a(nf param0, boolean param1) {
        int var3 = 0;
        if (param1) {
            ((jc) this).field_yc = 45;
        }
        if (b.field_b != param0) {
            var3 = np.a(param0, false);
            jaggl.OpenGL.glTexGeni(8192, 9472, var3);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glTexGeni(8193, 9472, var3);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glTexGeni(8194, 9472, var3);
            jaggl.OpenGL.glEnable(3170);
        } else {
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
        }
    }

    final fa a(pl[] param0, int param1) {
        if (param1 > -126) {
            ((jc) this).l((byte) 68);
        }
        return (fa) (Object) new tq(param0);
    }

    final synchronized void b(int param0) {
        int var2 = 0;
        int var4 = 0;
        iq var5 = null;
        iq var6 = null;
        iq var7 = null;
        iq var8 = null;
        iq var9 = null;
        wf var10 = null;
        wf var11 = null;
        iq var12 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          if (((jc) this).field_Ec.a(true)) {
            L1: {
              if ((var2 ^ -1) < -1) {
                jaggl.OpenGL.glDeleteBuffersARB(var2, ac.field_e, 0);
                var2 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: while (true) {
              if (((jc) this).field_Lc.a(true)) {
                L3: {
                  if (0 >= var2) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glDeleteTextures(var2, ac.field_e, 0);
                    var2 = 0;
                    break L3;
                  }
                }
                L4: while (true) {
                  if (((jc) this).field_Wc.a(true)) {
                    L5: {
                      if (-1 >= var2) {
                        break L5;
                      } else {
                        jaggl.OpenGL.glDeleteFramebuffersEXT(var2, ac.field_e, 0);
                        var2 = 0;
                        break L5;
                      }
                    }
                    L6: while (true) {
                      if (((jc) this).field_vc.a(true)) {
                        L7: {
                          if (-1 < var2) {
                            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, ac.field_e, 0);
                            var2 = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: while (true) {
                          if (((jc) this).field_uc.a(true)) {
                            L9: while (true) {
                              if (((jc) this).field_Sc.a(true)) {
                                L10: while (true) {
                                  if (((jc) this).field_Uc.a(true)) {
                                    L11: while (true) {
                                      if (((jc) this).field_uc.a(true)) {
                                        L12: {
                                          if ((((jc) this).i((byte) -91) ^ -1) >= -100663297) {
                                            break L12;
                                          } else {
                                            if ((kh.a(-72) ^ -1L) >= (60000L + ((jc) this).field_xc ^ -1L)) {
                                              break L12;
                                            } else {
                                              System.gc();
                                              ((jc) this).field_xc = kh.a(-59);
                                              break L12;
                                            }
                                          }
                                        }
                                        this.b(param0);
                                        return;
                                      } else {
                                        var12 = (iq) ((jc) this).field_uc.e(124);
                                        jaggl.OpenGL.glDeleteLists((int)((iq) var12).field_b, ((iq) var12).field_f);
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var11 = ((jc) this).field_Uc.e(121);
                                    jaggl.OpenGL.glDeleteObjectARB(((wf) var11).field_b);
                                    continue L10;
                                  }
                                }
                              } else {
                                var10 = ((jc) this).field_Sc.e(125);
                                jaggl.OpenGL.glDeleteProgramARB((int)((wf) var10).field_b);
                                continue L9;
                              }
                            }
                          } else {
                            var9 = (iq) ((jc) this).field_uc.e(120);
                            jaggl.OpenGL.glDeleteLists((int)((iq) var9).field_b, ((iq) var9).field_f);
                            continue L8;
                          }
                        }
                      } else {
                        var8 = (iq) ((jc) this).field_vc.e(124);
                        var2++;
                        ac.field_e[var2] = (int)((iq) var8).field_b;
                        ((jc) this).field_qb = ((jc) this).field_qb - ((iq) var8).field_f;
                        if (var2 != -1001) {
                          continue L6;
                        } else {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, ac.field_e, 0);
                          var2 = 0;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var7 = (iq) ((jc) this).field_Wc.e(121);
                    var2++;
                    ac.field_e[var2] = ((iq) var7).field_f;
                    if (-1001 == var2) {
                      jaggl.OpenGL.glDeleteFramebuffersEXT(var2, ac.field_e, 0);
                      var2 = 0;
                      continue L4;
                    } else {
                      continue L4;
                    }
                  }
                }
              } else {
                var6 = (iq) ((jc) this).field_Lc.e(124);
                var2++;
                ac.field_e[var2] = (int)((iq) var6).field_b;
                ((jc) this).field_jc = ((jc) this).field_jc - ((iq) var6).field_f;
                if (1000 != var2) {
                  continue L2;
                } else {
                  jaggl.OpenGL.glDeleteTextures(var2, ac.field_e, 0);
                  var2 = 0;
                  continue L2;
                }
              }
            }
          } else {
            var5 = (iq) ((jc) this).field_Ec.e(126);
            var2++;
            ac.field_e[var2] = (int)((iq) var5).field_b;
            ((jc) this).field_j = ((jc) this).field_j - ((iq) var5).field_f;
            if (var2 != 1000) {
              continue L0;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, ac.field_e, 0);
              var2 = 0;
              continue L0;
            }
          }
        }
    }

    final void p(int param0) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (mq.field_g != ((jc) this).field_f[((jc) this).field_F]) {
            jaggl.OpenGL.glLoadMatrixf(((jc) this).field_L[((jc) this).field_F].a(qg.field_a, true), 0);
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
        wf var3 = new wf();
        var3.field_b = (long)param1;
        ((jc) this).field_Sc.a(113, var3);
    }

    final void l(byte param0) {
        int var3 = 0;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (pi.field_x == ((jc) this).field_zb) {
            jaggl.OpenGL.glBlendFunc(770, 771);
            break L0;
          } else {
            if (ne.field_i == ((jc) this).field_zb) {
              jaggl.OpenGL.glBlendFunc(1, 1);
              break L0;
            } else {
              if (((jc) this).field_zb == uc.field_l) {
                jaggl.OpenGL.glBlendFunc(774, 1);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 >= 39) {
            break L1;
          } else {
            ((jc) this).p(127);
            break L1;
          }
        }
    }

    final void a(int param0, java.awt.Canvas param1, Object param2) {
        Long var4 = (Long) param2;
        ((jc) this).field_Ac.releaseSurface(param1, var4.longValue());
        if (param0 != 0) {
            field_wc = (String) null;
        }
    }

    final boolean a(byte param0, la param1, hd param2) {
        if (param0 != -13) {
            return false;
        }
        return true;
    }

    final void m(byte param0) {
        if (param0 >= -124) {
            ((jc) this).field_Uc = (kp) null;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34162, kp.a(61, ((jc) this).field_w[((jc) this).field_F]));
    }

    final void t(byte param0) {
        np.field_d[0] = ((jc) this).field_g * ((jc) this).field_fb;
        np.field_d[3] = 1.0f;
        np.field_d[1] = ((jc) this).field_rb * ((jc) this).field_fb;
        np.field_d[2] = ((jc) this).field_Hb * ((jc) this).field_fb;
        int var2 = 36 % ((17 - param0) / 37);
        jaggl.OpenGL.glLightfv(16384, 4609, np.field_d, 0);
        np.field_d[3] = 1.0f;
        np.field_d[0] = ((jc) this).field_g * -((jc) this).field_ub;
        np.field_d[2] = ((jc) this).field_Hb * -((jc) this).field_ub;
        np.field_d[1] = -((jc) this).field_ub * ((jc) this).field_rb;
        jaggl.OpenGL.glLightfv(16385, 4609, np.field_d, 0);
    }

    final ti c(boolean param0, int param1) {
        if (param1 != 8762) {
            gd var4 = (gd) null;
            sm discarded$0 = ((jc) this).a((ra) null, (gd) null);
        }
        return (ti) (Object) new ro((jc) this, la.field_b, param0);
    }

    final qi a(int param0, boolean param1, hd param2, int param3, byte param4, int param5, int param6, byte[] param7) {
        ed var10 = null;
        if (param4 < 73) {
            field_Rc = (String[]) null;
        }
        if (!((jc) this).field_zc) {
            if (mg.a(param0, (byte) -112)) {
                // ifne L121
            }
            if (!((jc) this).field_tc) {
                var10 = new ed((jc) this, param2, la.field_h, fk.a(param0, 40), fk.a(param3, 103));
                var10.a(0, param0, param6, param3, (byte) -29, param7, param2, 0, param5);
                return (qi) (Object) var10;
            }
            return (qi) (Object) new ik((jc) this, param2, param0, param3, param7, param6, param5);
        }
        return (qi) (Object) new ed((jc) this, param2, param0, param3, param1, param7, param6, param5);
    }

    final tl a(boolean param0, byte param1) {
        if (param1 < 72) {
            ((jc) this).l(-122);
        }
        return (tl) (Object) new cg((jc) this, param0);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        ((jc) this).c(true);
        ((jc) this).a((jj) null, -9135);
        ((jc) this).e(true, 0);
        ((jc) this).a((byte) 108);
        jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
        jaggl.OpenGL.glRasterPos2i(param0, param1);
        jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((jc) this).field_Bc, param4, param5);
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
    }

    final void G(int param0) {
        int var2 = 0;
        int var3_int = 0;
        float[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        var2 = -58 % ((param0 - -65) / 51);
        var3_int = -1 + ((jc) this).field_h;
        L0: while (true) {
          if (-1 < (var3_int ^ -1)) {
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
            var3 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
            var4 = 0;
            L1: while (true) {
              if (var4 >= 8) {
                jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                jaggl.OpenGL.glFogi(2917, 9729);
                jaggl.OpenGL.glHint(3156, 4353);
                ((jc) this).field_Ac.setSwapInterval(0);
                this.G(-127);
                return;
              } else {
                var5 = var4 + 16384;
                jaggl.OpenGL.glLightfv(var5, 4608, var3, 0);
                jaggl.OpenGL.glLightf(var5, 4615, 0.0f);
                jaggl.OpenGL.glLightf(var5, 4616, 0.0f);
                var4++;
                continue L1;
              }
            }
          } else {
            jaggl.OpenGL.glActiveTexture(33984 - -var3_int);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            jaggl.OpenGL.glTexEnvi(8960, 34161, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34178, 34166);
            jaggl.OpenGL.glTexEnvi(8960, 34162, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34186, 34166);
            var3_int--;
            continue L0;
          }
        }
    }

    final sm a(ra param0, gd param1) {
        return null;
    }

    final void T(int param0) {
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((jc) this).field_Nc = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((jc) this).field_ob) {
              break L2;
            } else {
              if (!((jc) this).field_pc) {
                jaggl.OpenGL.glEnable(2896);
                break L1;
              } else {
                break L2;
              }
            }
          }
          jaggl.OpenGL.glDisable(2896);
          break L1;
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        iq var4 = new iq(param0);
        if (param1 != 9841) {
            ((jc) this).field_zc = true;
        }
        var4.field_b = (long)param2;
        ((jc) this).field_Ec.a(113, (wf) (Object) var4);
    }

    final void b(int param0, int param1) throws lp {
        ((jc) this).field_Ac.swapBuffers();
    }

    final void w(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            if (!((jc) this).field_mb) {
              break L1;
            } else {
              if (!((jc) this).field_Y) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          jaggl.OpenGL.glDepthMask(stackIn_4_0 != 0);
          if (param0 == 0) {
            break L2;
          } else {
            ((jc) this).l((byte) -59);
            break L2;
          }
        }
    }

    final synchronized void a(int param0, long param1) {
        if (param0 != -25160) {
            ((jc) this).h((byte) 1);
        }
        wf var4 = new wf();
        var4.field_b = param1;
        ((jc) this).field_Uc.a(90, var4);
    }

    final qi a(int param0, boolean param1, boolean param2, int param3, int param4, int[] param5, int param6) {
        ed var9 = null;
        if (!param1) {
            return (qi) null;
        }
        if (!((jc) this).field_zc) {
            if (mg.a(param6, (byte) 32)) {
                // ifne L116
            }
            if (!((jc) this).field_tc) {
                var9 = new ed((jc) this, lc.field_g, la.field_h, fk.a(param6, 25), fk.a(param3, 30));
                var9.a((byte) -106, param0, 0, param4, param6, param3, 0, param5);
                return (qi) (Object) var9;
            }
            return (qi) (Object) new ik((jc) this, param6, param3, param5, param0, param4);
        }
        return (qi) (Object) new ed((jc) this, param6, param3, param2, param5, param0, param4);
    }

    final void b(byte param0, boolean param1) {
        if (param1) {
            jaggl.OpenGL.glEnable(32925);
        } else {
            jaggl.OpenGL.glDisable(32925);
        }
        if (param0 > -113) {
            ((jc) this).a(-43, -4L);
        }
    }

    final void j(int param0) {
        if (param0 != 1) {
            return;
        }
        int var2 = ((jc) this).field_Hc[((jc) this).field_F];
        if (!(-1 == (var2 ^ -1))) {
            ((jc) this).field_Hc[((jc) this).field_F] = 0;
            jaggl.OpenGL.glBindTexture(var2, 0);
            jaggl.OpenGL.glDisable(var2);
        }
    }

    final boolean a(la param0, int param1, hd param2) {
        if (param1 != 0) {
            float discarded$0 = ((jc) this).o((byte) -62);
            return true;
        }
        return true;
    }

    final void u(byte param0) {
        if (param0 >= -29) {
            ((jc) this).r(-74);
        }
        if (((jc) this).field_Vb) {
            jaggl.OpenGL.glEnable(3008);
        } else {
            jaggl.OpenGL.glDisable(3008);
        }
    }

    final gd a(int param0, int param1) {
        return null;
    }

    final void c() {
        this.c();
        if (((jc) this).field_Ac != null) {
            boolean discarded$0 = ((jc) this).field_Ac.a();
            ((jc) this).field_Ac.release();
            ((jc) this).field_Ac = null;
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
        jaggl.OpenGL.glTexEnvi(8960, 34176 - -param1, ii.a((byte) 73, param3));
        if (!param0) {
            jaggl.OpenGL.glTexEnvi(8960, param1 + 34192, param4 ? 769 : 768);
        } else {
            jaggl.OpenGL.glTexEnvi(8960, 34192 + param1, param4 ? 771 : 770);
        }
        if (!param2) {
            ((jc) this).field_Nc = true;
        }
    }

    final void a(sm param0) {
    }

    final void a(boolean param0, ia param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        if (param0) {
          L0: {
            if (param1 != wt.field_m) {
              if (param1 == bm.field_x) {
                var5 = 3;
                var6 = 1 + param2;
                break L0;
              } else {
                if (tm.field_h == param1) {
                  var5 = 4;
                  var6 = 3 * param2;
                  break L0;
                } else {
                  if (qp.field_j != param1) {
                    if (gh.field_i != param1) {
                      var6 = param2;
                      var5 = 0;
                      break L0;
                    } else {
                      var6 = param2 + 2;
                      var5 = 5;
                      break L0;
                    }
                  } else {
                    var5 = 6;
                    var6 = param2 + 2;
                    break L0;
                  }
                }
              }
            } else {
              var5 = 1;
              var6 = 2 * param2;
              break L0;
            }
          }
          jaggl.OpenGL.glDrawArrays(var5, param3, var6);
          return;
        } else {
          return;
        }
    }

    final void p(byte param0) {
        if (((jc) this).field_Db) {
            jaggl.OpenGL.glEnable(3042);
        } else {
            jaggl.OpenGL.glDisable(3042);
        }
        if (param0 > -127) {
            ((jc) this).field_Fc = (jaggl.MapBuffer) null;
        }
    }

    final void c(int param0, byte param1) {
        if (param1 >= -76) {
            ((jc) this).Q(98);
        }
    }

    final void m(int param0) {
        np.field_d[2] = ((jc) this).field_Hb * ((jc) this).field_Wb;
        np.field_d[0] = ((jc) this).field_g * ((jc) this).field_Wb;
        np.field_d[1] = ((jc) this).field_Wb * ((jc) this).field_rb;
        np.field_d[3] = 1.0f;
        if (param0 >= -108) {
            ((jc) this).g(29);
        }
        jaggl.OpenGL.glLightModelfv(2899, np.field_d, 0);
    }

    final void k(byte param0) {
        int var2 = 0;
        sf var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        L0: {
          var7 = AceOfSkies.field_G ? 1 : 0;
          ((jc) this).a((byte) 82);
          if (param0 >= 123) {
            break L0;
          } else {
            ((jc) this).V(93);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= ((jc) this).field_B) {
            L2: while (true) {
              if (var2 >= ((jc) this).field_ic) {
                this.k((byte) 124);
                return;
              } else {
                jaggl.OpenGL.glDisable(var2 + 16386);
                var2++;
                continue L2;
              }
            }
          } else {
            var3 = ((jc) this).field_D[var2];
            var4 = var3.a(105);
            var5 = 16386 + var2;
            var6 = var3.a(false) / 255.0f;
            np.field_d[0] = (float)var3.c((byte) -96);
            np.field_d[1] = (float)var3.a((byte) -111);
            np.field_d[2] = (float)var3.e(0);
            np.field_d[3] = 1.0f;
            jaggl.OpenGL.glLightfv(var5, 4611, np.field_d, 0);
            np.field_d[1] = var6 * (float)pg.a(255, var4 >> 387622344);
            np.field_d[0] = var6 * (float)pg.a(255, var4 >> 1114366992);
            np.field_d[2] = (float)pg.a(255, var4) * var6;
            np.field_d[3] = 1.0f;
            jaggl.OpenGL.glLightfv(var5, 4609, np.field_d, 0);
            jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.d(0) * var3.d(0)));
            jaggl.OpenGL.glEnable(var5);
            var2++;
            continue L1;
          }
        }
    }

    final void w(byte param0) {
        if (param0 > -40) {
            return;
        }
        jaggl.OpenGL.glActiveTexture(33984 - -((jc) this).field_F);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wc = "Use this alternative as your account name";
        field_Pc = new pt();
        field_Rc = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_Mc = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
