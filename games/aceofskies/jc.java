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
        RuntimeException var7 = null;
        mh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -93) {
                break L1;
              } else {
                ((jc) this).field_Ac = null;
                break L1;
              }
            }
            stackOut_2_0 = new mh((jc) this, param3, param2, param0, param4, param5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("jc.UA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param4).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return (bp) (Object) stackIn_3_0;
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
        int var5_int = 0;
        RuntimeException var5 = null;
        qp stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        qp stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5_int = 123 % ((param1 - 18) / 51);
            stackOut_0_0 = new qp((jc) this, param0, param2, param3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("jc.FD(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return (go) (Object) stackIn_1_0;
    }

    final Object a(int param0, java.awt.Canvas param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Long stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Long stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == -15083) {
              var3_long = ((jc) this).field_Ac.prepareSurface(param1);
              if (var3_long == -1L) {
                throw new RuntimeException();
              } else {
                stackOut_6_0 = new Long(var3_long);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("jc.P(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return (Object) (Object) stackIn_7_0;
    }

    final qi a(float[] param0, int param1, hd param2, boolean param3, int param4, int param5, int param6, boolean param7) {
        RuntimeException var9 = null;
        ed var10 = null;
        ed stackIn_7_0 = null;
        ed stackIn_10_0 = null;
        ik stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ik stackOut_11_0 = null;
        ed stackOut_9_0 = null;
        ed stackOut_6_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                ((jc) this).field_Tc = -76;
                break L1;
              }
            }
            L2: {
              if (((jc) this).field_zc) {
                break L2;
              } else {
                L3: {
                  if (!mg.a(param1, (byte) 114)) {
                    break L3;
                  } else {
                    if (!mg.a(param5, (byte) 105)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((jc) this).field_tc) {
                  stackOut_11_0 = new ik((jc) this, param2, param1, param5, param0, param6, param4);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var10 = new ed((jc) this, param2, la.field_i, fk.a(param1, 57), fk.a(param5, 118));
                  var10.a(param0, (byte) -124, 0, 0, param6, param4, param5, param2, param1);
                  stackOut_9_0 = (ed) var10;
                  stackIn_10_0 = stackOut_9_0;
                  return (qi) (Object) stackIn_10_0;
                }
              }
            }
            stackOut_6_0 = new ed((jc) this, param2, param1, param5, param7, param0, param6, param4);
            stackIn_7_0 = stackOut_6_0;
            return (qi) (Object) stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var9;
            stackOut_13_1 = new StringBuilder().append("jc.LC(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        return (qi) (Object) stackIn_12_0;
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
        try {
            if (param0 != 1) {
                ((jc) this).field_Oc = true;
            }
            ((jc) this).field_Gc[param2] = (cg) (Object) param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "jc.TB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void I(int param0) {
        int var2 = 60 % ((27 - param0) / 38);
        jaggl.OpenGL.glScissor(((jc) this).field_R + ((jc) this).field_Rb, -((jc) this).field_V + (((jc) this).field_Ib - -((jc) this).field_jb), ((jc) this).field_gc + -((jc) this).field_R, ((jc) this).field_V - ((jc) this).field_Nb);
    }

    final void g(int param0) {
        np.field_d[1] = (float)pg.a(65280, ((jc) this).field_cc) / 65280.0f;
        np.field_d[2] = (float)pg.a(((jc) this).field_cc, 255) / 255.0f;
        np.field_d[0] = (float)pg.a(((jc) this).field_cc, 16711680) / 16711680.0f;
        np.field_d[3] = (float)(((jc) this).field_cc >>> 24) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, np.field_d, param0);
    }

    final void b(boolean param0) {
        Object var3 = null;
        L0: {
          L1: {
            if (!((jc) this).field_I) {
              break L1;
            } else {
              if (!((jc) this).field_o) {
                break L1;
              } else {
                if (((jc) this).field_p < 0) {
                  break L1;
                } else {
                  jaggl.OpenGL.glEnable(2912);
                  break L0;
                }
              }
            }
          }
          jaggl.OpenGL.glDisable(2912);
          break L0;
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            var3 = null;
            ((jc) this).a(true, (ia) null, 20, 74);
            break L2;
          }
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
            ((jc) this).field_Sc = null;
        }
    }

    final void a(jb param0, int param1, boolean param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glTexEnvi(8960, 34184 - -param1, ii.a((byte) 79, param0));
              stackOut_0_0 = 8960;
              stackOut_0_1 = param1 + 34200;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (!param2) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 770;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 771;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              jaggl.OpenGL.glTexEnvi(stackIn_3_0, stackIn_3_1, stackIn_3_2);
              if (param3 >= 90) {
                break L2;
              } else {
                ((jc) this).field_Wc = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("jc.LB(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        ed stackIn_8_0 = null;
        ik stackIn_11_0 = null;
        ed stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_12_0 = null;
        ik stackOut_10_0 = null;
        ed stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param1 == 8) {
              L1: {
                if (((jc) this).field_zc) {
                  break L1;
                } else {
                  L2: {
                    if (!mg.a(param3, (byte) -58)) {
                      break L2;
                    } else {
                      if (!mg.a(param2, (byte) -64)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (!((jc) this).field_tc) {
                    stackOut_12_0 = new ed((jc) this, param4, param0, fk.a(param3, 67), fk.a(param2, 78));
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = new ik((jc) this, param4, param0, param3, param2);
                    stackIn_11_0 = stackOut_10_0;
                    return (qi) (Object) stackIn_11_0;
                  }
                }
              }
              stackOut_7_0 = new ed((jc) this, param4, param0, param3, param2);
              stackIn_8_0 = stackOut_7_0;
              return (qi) (Object) stackIn_8_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("jc.FB(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return (qi) (Object) stackIn_13_0;
    }

    jc(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, gk param4, int param5) {
        super(param1, (Object) (Object) new Long(param2), param3, param4, param5, 1);
        String var21_ref = null;
        Throwable var8 = null;
        RuntimeException var8_ref = null;
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
        Object var16 = null;
        String var16_ref = null;
        Exception var17 = null;
        String var20 = null;
        Object var21 = null;
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
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var21_ref = null;
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
        try {
          L0: {
            try {
              L1: {
                L2: {
                  ((jc) this).field_Ac = param0;
                  boolean discarded$6 = ((jc) this).field_Ac.b();
                  ((jc) this).field_Ic = jaggl.OpenGL.glGetString(7936).toLowerCase();
                  ((jc) this).field_sc = jaggl.OpenGL.glGetString(7937).toLowerCase();
                  if (((jc) this).field_Ic.indexOf("microsoft") != -1) {
                    break L2;
                  } else {
                    if (((jc) this).field_Ic.indexOf("brian paul") != -1) {
                      break L2;
                    } else {
                      if (((jc) this).field_Ic.indexOf("mesa") == -1) {
                        var20 = jaggl.OpenGL.glGetString(7938);
                        var9 = ee.a((byte) 10, ' ', var20.replace('.', ' '));
                        if (var9.length < 2) {
                          throw new RuntimeException("");
                        } else {
                          try {
                            L3: {
                              int discarded$7 = 38;
                              var10_int = td.a((CharSequence) (Object) var9[0]);
                              int discarded$8 = 38;
                              var11_int = td.a((CharSequence) (Object) var9[1]);
                              ((jc) this).field_Tc = 10 * var10_int - -var11_int;
                              break L3;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            var10 = (NumberFormatException) (Object) decompiledCaughtException;
                            throw new RuntimeException("");
                          }
                          if (12 <= ((jc) this).field_Tc) {
                            if (((jc) this).field_Ac.a("GL_ARB_multitexture")) {
                              if (((jc) this).field_Ac.a("GL_ARB_texture_env_combine")) {
                                var26 = new int[1];
                                jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                                ((jc) this).field_h = var26[0];
                                if (((jc) this).field_h >= 2) {
                                  L4: {
                                    ((jc) this).field_fc = 8;
                                    ((jc) this).field_Cc = ((jc) this).field_Ac.a("GL_ARB_vertex_buffer_object");
                                    boolean discarded$9 = ((jc) this).field_Ac.a("GL_ARB_multisample");
                                    ((jc) this).field_tc = ((jc) this).field_Ac.a("GL_ARB_texture_rectangle");
                                    ((jc) this).field_Pb = ((jc) this).field_Ac.a("GL_ARB_texture_cube_map");
                                    ((jc) this).field_zc = ((jc) this).field_Ac.a("GL_ARB_texture_non_power_of_two");
                                    ((jc) this).field_J = ((jc) this).field_Ac.a("GL_EXT_texture3D");
                                    ((jc) this).field_rc = ((jc) this).field_Ac.a("GL_ARB_vertex_shader");
                                    ((jc) this).field_Vc = ((jc) this).field_Ac.a("GL_ARB_vertex_program");
                                    ((jc) this).field_Nc = ((jc) this).field_Ac.a("GL_ARB_fragment_shader");
                                    boolean discarded$10 = ((jc) this).field_Ac.a("GL_ARB_fragment_program");
                                    ((jc) this).field_Hc = new int[((jc) this).field_h];
                                    stackOut_18_0 = this;
                                    stackIn_20_0 = stackOut_18_0;
                                    stackIn_19_0 = stackOut_18_0;
                                    if (!jaclib.memory.Stream.b()) {
                                      stackOut_20_0 = this;
                                      stackOut_20_1 = 5121;
                                      stackIn_21_0 = stackOut_20_0;
                                      stackIn_21_1 = stackOut_20_1;
                                      break L4;
                                    } else {
                                      stackOut_19_0 = this;
                                      stackOut_19_1 = 33639;
                                      stackIn_21_0 = stackOut_19_0;
                                      stackIn_21_1 = stackOut_19_1;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    ((jc) this).field_Bc = stackIn_21_1;
                                    if (((jc) this).field_sc.indexOf("radeon") == -1) {
                                      break L5;
                                    } else {
                                      var11_int = 0;
                                      var12 = 0;
                                      var13 = 0;
                                      var14_array = ee.a((byte) 10, ' ', ((jc) this).field_sc.replace('/', ' '));
                                      var15 = 0;
                                      L6: while (true) {
                                        L7: {
                                          if (~var14_array.length >= ~var15) {
                                            break L7;
                                          } else {
                                            var21_ref = var14_array[var15];
                                            var16_ref = var21_ref;
                                            var16_ref = var21_ref;
                                            try {
                                              L8: {
                                                L9: {
                                                  if (var21_ref.length() > 0) {
                                                    L10: {
                                                      if (var21_ref.charAt(0) != 120) {
                                                        break L10;
                                                      } else {
                                                        if (var21_ref.length() < 3) {
                                                          break L10;
                                                        } else {
                                                          var31 = (CharSequence) (Object) var21_ref.substring(1, 3);
                                                          if (!vl.a(10, var31)) {
                                                            break L10;
                                                          } else {
                                                            var16_ref = var21_ref.substring(1);
                                                            var13 = 1;
                                                            break L10;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (!var16_ref.equals((Object) (Object) "hd")) {
                                                      L11: {
                                                        if (!var16_ref.startsWith("hd")) {
                                                          break L11;
                                                        } else {
                                                          var16_ref = var16_ref.substring(2);
                                                          var12 = 1;
                                                          break L11;
                                                        }
                                                      }
                                                      if (var16_ref.length() < 4) {
                                                        break L9;
                                                      } else {
                                                        var32 = (CharSequence) (Object) var16_ref.substring(0, 4);
                                                        if (!vl.a(10, var32)) {
                                                          break L9;
                                                        } else {
                                                          var33 = (CharSequence) (Object) var16_ref.substring(0, 4);
                                                          int discarded$11 = 38;
                                                          var11_int = td.a(var33);
                                                          decompiledRegionSelector0 = 1;
                                                          break L8;
                                                        }
                                                      }
                                                    } else {
                                                      var12 = 1;
                                                      break L9;
                                                    }
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                                decompiledRegionSelector0 = 0;
                                                break L8;
                                              }
                                            } catch (java.lang.Exception decompiledCaughtParameter1) {
                                              decompiledCaughtException = decompiledCaughtParameter1;
                                              L12: {
                                                var17 = (Exception) (Object) decompiledCaughtException;
                                                decompiledRegionSelector0 = 0;
                                                break L12;
                                              }
                                            }
                                            if (decompiledRegionSelector0 == 0) {
                                              var15++;
                                              continue L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        L13: {
                                          if (var13 != 0) {
                                            break L13;
                                          } else {
                                            if (var12 != 0) {
                                              break L13;
                                            } else {
                                              L14: {
                                                if (var11_int < 7000) {
                                                  break L14;
                                                } else {
                                                  if (var11_int > 7999) {
                                                    break L14;
                                                  } else {
                                                    ((jc) this).field_Cc = false;
                                                    break L14;
                                                  }
                                                }
                                              }
                                              if (var11_int < 7000) {
                                                break L13;
                                              } else {
                                                if (var11_int > 9250) {
                                                  break L13;
                                                } else {
                                                  ((jc) this).field_J = false;
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        ((jc) this).field_tc = ((jc) this).field_tc & ((jc) this).field_Ac.a("GL_ARB_half_float_pixel");
                                        break L5;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (-1 == ((jc) this).field_Ic.indexOf("intel")) {
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (((jc) this).field_Cc) {
                                      try {
                                        L17: {
                                          var27 = new int[1];
                                          jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                                          break L17;
                                        }
                                      } catch (java.lang.Throwable decompiledCaughtParameter2) {
                                        decompiledCaughtException = decompiledCaughtParameter2;
                                        var11 = decompiledCaughtException;
                                        throw new RuntimeException("");
                                      }
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  break L1;
                                } else {
                                  throw new RuntimeException("");
                                }
                              } else {
                                throw new RuntimeException("");
                              }
                            } else {
                              throw new RuntimeException("");
                            }
                          } else {
                            throw new RuntimeException("");
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var8 = decompiledCaughtException;
              var8.printStackTrace();
              ((jc) this).a(-9);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L18: {
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var8_ref;
            stackOut_58_1 = new StringBuilder().append("jc.<init>(");
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param0 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L18;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L18;
            }
          }
          L19: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L19;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L19;
            }
          }
          L20: {
            stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(44).append(param2).append(44);
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param3 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L20;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L20;
            }
          }
          L21: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param4 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 44 + param5 + 41);
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
        int var15 = 0;
        rl var16 = null;
        int var17 = 0;
        pl[] var18 = null;
        int stackIn_27_0 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        Object stackOut_43_0 = null;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var17 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var18 = ((tq) (Object) param0).field_g;
            var4 = 0;
            var5 = 0;
            if (param1 == 75) {
              var6 = 0;
              var7 = 0;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var18.length) {
                  L2: {
                    if (((jc) this).field_Jc) {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      break L2;
                    } else {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L2;
                    }
                  }
                  L3: {
                    if (stackIn_27_0 != var7) {
                      break L3;
                    } else {
                      L4: {
                        if (var7 != 0) {
                          jaggl.OpenGL.glEnableClientState(32884);
                          break L4;
                        } else {
                          jaggl.OpenGL.glDisableClientState(32884);
                          break L4;
                        }
                      }
                      L5: {
                        stackOut_31_0 = this;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_32_0 = stackOut_31_0;
                        if (var7 == 0) {
                          stackOut_33_0 = this;
                          stackOut_33_1 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          break L5;
                        } else {
                          stackOut_32_0 = this;
                          stackOut_32_1 = 1;
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_34_1 = stackOut_32_1;
                          break L5;
                        }
                      }
                      ((jc) this).field_Jc = stackIn_34_1 != 0;
                      break L3;
                    }
                  }
                  L6: {
                    if (var6 != 0) {
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L6;
                    } else {
                      stackOut_36_0 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      break L6;
                    }
                  }
                  L7: {
                    if (stackIn_38_0 == (((jc) this).field_Oc ? 1 : 0)) {
                      L8: {
                        if (var6 == 0) {
                          jaggl.OpenGL.glDisableClientState(32885);
                          break L8;
                        } else {
                          jaggl.OpenGL.glEnableClientState(32885);
                          break L8;
                        }
                      }
                      L9: {
                        stackOut_43_0 = this;
                        stackIn_45_0 = stackOut_43_0;
                        stackIn_44_0 = stackOut_43_0;
                        if (var6 == 0) {
                          stackOut_45_0 = this;
                          stackOut_45_1 = 0;
                          stackIn_46_0 = stackOut_45_0;
                          stackIn_46_1 = stackOut_45_1;
                          break L9;
                        } else {
                          stackOut_44_0 = this;
                          stackOut_44_1 = 1;
                          stackIn_46_0 = stackOut_44_0;
                          stackIn_46_1 = stackOut_44_1;
                          break L9;
                        }
                      }
                      ((jc) this).field_Oc = stackIn_46_1 != 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L10: {
                    stackOut_47_0 = var5;
                    stackIn_49_0 = stackOut_47_0;
                    stackIn_48_0 = stackOut_47_0;
                    if (((jc) this).field_Xc) {
                      stackOut_49_0 = stackIn_49_0;
                      stackOut_49_1 = 0;
                      stackIn_50_0 = stackOut_49_0;
                      stackIn_50_1 = stackOut_49_1;
                      break L10;
                    } else {
                      stackOut_48_0 = stackIn_48_0;
                      stackOut_48_1 = 1;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_50_1 = stackOut_48_1;
                      break L10;
                    }
                  }
                  L11: {
                    if (stackIn_50_0 != stackIn_50_1) {
                      break L11;
                    } else {
                      L12: {
                        if (var5 == 0) {
                          jaggl.OpenGL.glDisableClientState(32886);
                          break L12;
                        } else {
                          jaggl.OpenGL.glEnableClientState(32886);
                          break L12;
                        }
                      }
                      L13: {
                        stackOut_54_0 = this;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_55_0 = stackOut_54_0;
                        if (var5 == 0) {
                          stackOut_56_0 = this;
                          stackOut_56_1 = 0;
                          stackIn_57_0 = stackOut_56_0;
                          stackIn_57_1 = stackOut_56_1;
                          break L13;
                        } else {
                          stackOut_55_0 = this;
                          stackOut_55_1 = 1;
                          stackIn_57_0 = stackOut_55_0;
                          stackIn_57_1 = stackOut_55_1;
                          break L13;
                        }
                      }
                      ((jc) this).field_Xc = stackIn_57_1 != 0;
                      break L11;
                    }
                  }
                  L14: {
                    if (((jc) this).field_yc < var4) {
                      var8 = ((jc) this).field_yc;
                      L15: while (true) {
                        if (var4 <= var8) {
                          ((jc) this).field_yc = var4;
                          break L14;
                        } else {
                          jaggl.OpenGL.glClientActiveTexture(var8 + 33984);
                          jaggl.OpenGL.glEnableClientState(32888);
                          var8++;
                          continue L15;
                        }
                      }
                    } else {
                      if (var4 < ((jc) this).field_yc) {
                        var8 = var4;
                        L16: while (true) {
                          if (var8 >= ((jc) this).field_yc) {
                            ((jc) this).field_yc = var4;
                            break L14;
                          } else {
                            jaggl.OpenGL.glClientActiveTexture(33984 - -var8);
                            jaggl.OpenGL.glDisableClientState(32888);
                            var8++;
                            continue L16;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  break L0;
                } else {
                  var9 = var18[var8];
                  var10 = ((jc) this).field_Gc[var8];
                  var11 = 0;
                  var12 = var10.c((byte) 56);
                  var13 = var10.b((byte) 96);
                  var10.b(-17310);
                  var15 = 0;
                  L17: while (true) {
                    if (var9.a((byte) 90) <= var15) {
                      var8++;
                      continue L1;
                    } else {
                      L18: {
                        var16 = var9.b(var15, 121);
                        if (rl.field_b != var16) {
                          if (var16 == rl.field_m) {
                            var6 = 1;
                            jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                            break L18;
                          } else {
                            if (var16 == rl.field_c) {
                              var5 = 1;
                              jaggl.OpenGL.glColorPointer(4, 5121, var12, var13 - -(long)var11);
                              break L18;
                            } else {
                              if (rl.field_k == var16) {
                                int incrementValue$4 = var4;
                                var4++;
                                jaggl.OpenGL.glClientActiveTexture(incrementValue$4 + 33984);
                                jaggl.OpenGL.glTexCoordPointer(1, 5126, var12, var13 - -(long)var11);
                                break L18;
                              } else {
                                if (rl.field_j == var16) {
                                  int incrementValue$5 = var4;
                                  var4++;
                                  jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$5);
                                  jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                                  break L18;
                                } else {
                                  if (rl.field_g == var16) {
                                    int incrementValue$6 = var4;
                                    var4++;
                                    jaggl.OpenGL.glClientActiveTexture(incrementValue$6 + 33984);
                                    jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, (long)var11 + var13);
                                    break L18;
                                  } else {
                                    if (var16 == rl.field_n) {
                                      int incrementValue$7 = var4;
                                      var4++;
                                      jaggl.OpenGL.glClientActiveTexture(incrementValue$7 + 33984);
                                      jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 - -(long)var11);
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          jaggl.OpenGL.glVertexPointer(3, 5126, var12, var13 + (long)var11);
                          var7 = 1;
                          break L18;
                        }
                      }
                      var11 = var11 + var16.field_l;
                      var15++;
                      continue L17;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var3;
            stackOut_70_1 = new StringBuilder().append("jc.BC(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L19;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L19;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + param1 + 41);
        }
    }

    final boolean d() {
        return false;
    }

    final void C(int param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        if (param0 >= -51) {
            ((jc) this).field_Wc = null;
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
            ((jc) this).field_Ic = null;
            break L0;
          }
        }
        var3 = param0;
        if (var3 != 3) {
          if (4 != var3) {
            if (var3 != 8) {
              return super.b(param0, (byte) 58);
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
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((jc) this).field_yc = 45;
                break L1;
              }
            }
            L2: {
              if (b.field_b == param0) {
                jaggl.OpenGL.glDisable(3168);
                jaggl.OpenGL.glDisable(3169);
                jaggl.OpenGL.glDisable(3170);
                break L2;
              } else {
                int discarded$3 = 0;
                var3_int = np.a(param0);
                jaggl.OpenGL.glTexGeni(8192, 9472, var3_int);
                jaggl.OpenGL.glEnable(3168);
                jaggl.OpenGL.glTexGeni(8193, 9472, var3_int);
                jaggl.OpenGL.glEnable(3169);
                jaggl.OpenGL.glTexGeni(8194, 9472, var3_int);
                jaggl.OpenGL.glEnable(3170);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("jc.MB(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final fa a(pl[] param0, int param1) {
        RuntimeException var3 = null;
        tq stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        tq stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -126) {
                break L1;
              } else {
                ((jc) this).l((byte) 68);
                break L1;
              }
            }
            stackOut_2_0 = new tq(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jc.RA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return (fa) (Object) stackIn_3_0;
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
              if (var2 > 0) {
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
                      if (var2 <= 0) {
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
                          if (var2 > 0) {
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
                                          if (((jc) this).i((byte) -91) <= 100663296) {
                                            break L12;
                                          } else {
                                            if (~kh.a(-72) >= ~(60000L + ((jc) this).field_xc)) {
                                              break L12;
                                            } else {
                                              System.gc();
                                              ((jc) this).field_xc = kh.a(-59);
                                              break L12;
                                            }
                                          }
                                        }
                                        super.b(param0);
                                        return;
                                      } else {
                                        var12 = (iq) (Object) ((jc) this).field_uc.e(124);
                                        jaggl.OpenGL.glDeleteLists((int)var12.field_b, var12.field_f);
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var11 = ((jc) this).field_Uc.e(121);
                                    jaggl.OpenGL.glDeleteObjectARB(var11.field_b);
                                    continue L10;
                                  }
                                }
                              } else {
                                var10 = ((jc) this).field_Sc.e(125);
                                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_b);
                                continue L9;
                              }
                            }
                          } else {
                            var9 = (iq) (Object) ((jc) this).field_uc.e(120);
                            jaggl.OpenGL.glDeleteLists((int)var9.field_b, var9.field_f);
                            continue L8;
                          }
                        }
                      } else {
                        L13: {
                          var8 = (iq) (Object) ((jc) this).field_vc.e(124);
                          int incrementValue$4 = var2;
                          var2++;
                          ac.field_e[incrementValue$4] = (int)var8.field_b;
                          ((jc) this).field_qb = ((jc) this).field_qb - var8.field_f;
                          if (var2 != 1000) {
                            break L13;
                          } else {
                            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, ac.field_e, 0);
                            var2 = 0;
                            break L13;
                          }
                        }
                        continue L6;
                      }
                    }
                  } else {
                    var7 = (iq) (Object) ((jc) this).field_Wc.e(121);
                    int incrementValue$5 = var2;
                    var2++;
                    ac.field_e[incrementValue$5] = var7.field_f;
                    if (var2 == 1000) {
                      jaggl.OpenGL.glDeleteFramebuffersEXT(var2, ac.field_e, 0);
                      var2 = 0;
                      continue L4;
                    } else {
                      continue L4;
                    }
                  }
                }
              } else {
                L14: {
                  var6 = (iq) (Object) ((jc) this).field_Lc.e(124);
                  int incrementValue$6 = var2;
                  var2++;
                  ac.field_e[incrementValue$6] = (int)var6.field_b;
                  ((jc) this).field_jc = ((jc) this).field_jc - var6.field_f;
                  if (1000 != var2) {
                    break L14;
                  } else {
                    jaggl.OpenGL.glDeleteTextures(var2, ac.field_e, 0);
                    var2 = 0;
                    break L14;
                  }
                }
                continue L2;
              }
            }
          } else {
            L15: {
              var5 = (iq) (Object) ((jc) this).field_Ec.e(126);
              int incrementValue$7 = var2;
              var2++;
              ac.field_e[incrementValue$7] = (int)var5.field_b;
              ((jc) this).field_j = ((jc) this).field_j - var5.field_f;
              if (var2 != 1000) {
                break L15;
              } else {
                jaggl.OpenGL.glDeleteBuffersARB(var2, ac.field_e, 0);
                var2 = 0;
                break L15;
              }
            }
            continue L0;
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
        Long var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4 = (Long) param2;
              ((jc) this).field_Ac.releaseSurface(param1, var4.longValue());
              if (param0 == 0) {
                break L1;
              } else {
                field_wc = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4_ref;
            stackOut_3_1 = new StringBuilder().append("jc.RC(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final boolean a(byte param0, la param1, hd param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == -13) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("jc.JB(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final void m(byte param0) {
        if (param0 >= -124) {
            ((jc) this).field_Uc = null;
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
            Object var4 = null;
            sm discarded$0 = ((jc) this).a((ra) null, (gd) null);
        }
        return (ti) (Object) new ro((jc) this, la.field_b, param0);
    }

    final qi a(int param0, boolean param1, hd param2, int param3, byte param4, int param5, int param6, byte[] param7) {
        RuntimeException var9 = null;
        ed var10 = null;
        ed stackIn_8_0 = null;
        ik stackIn_10_0 = null;
        ed stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ik stackOut_9_0 = null;
        ed stackOut_7_0 = null;
        ed stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param4 >= 73) {
                break L1;
              } else {
                field_Rc = null;
                break L1;
              }
            }
            L2: {
              if (((jc) this).field_zc) {
                break L2;
              } else {
                L3: {
                  if (!mg.a(param0, (byte) -112)) {
                    break L3;
                  } else {
                    if (mg.a(param3, (byte) -41)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((jc) this).field_tc) {
                  stackOut_9_0 = new ik((jc) this, param2, param0, param3, param7, param6, param5);
                  stackIn_10_0 = stackOut_9_0;
                  return (qi) (Object) stackIn_10_0;
                } else {
                  var10 = new ed((jc) this, param2, la.field_h, fk.a(param0, 40), fk.a(param3, 103));
                  var10.a(0, param0, param6, param3, (byte) -29, param7, param2, 0, param5);
                  stackOut_7_0 = (ed) var10;
                  stackIn_8_0 = stackOut_7_0;
                  return (qi) (Object) stackIn_8_0;
                }
              }
            }
            stackOut_11_0 = new ed((jc) this, param2, param0, param3, param1, param7, param6, param5);
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var9;
            stackOut_13_1 = new StringBuilder().append("jc.JC(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param7 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return (qi) (Object) stackIn_12_0;
    }

    final tl a(boolean param0, byte param1) {
        if (param1 < 72) {
            ((jc) this).l(-122);
        }
        return (tl) (Object) new cg((jc) this, param0);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            ((jc) this).c(true);
            ((jc) this).a((jj) null, -9135);
            ((jc) this).e(true, 0);
            ((jc) this).a((byte) 108);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((jc) this).field_Bc, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "jc.SA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
        }
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
          if (var3_int < 0) {
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
                super.G(-127);
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
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("jc.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return (sm) (Object) stackIn_1_0;
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
        RuntimeException var8 = null;
        ed var9 = null;
        Object stackIn_2_0 = null;
        ed stackIn_9_0 = null;
        ik stackIn_11_0 = null;
        ed stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ik stackOut_10_0 = null;
        ed stackOut_8_0 = null;
        ed stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param1) {
              L1: {
                if (((jc) this).field_zc) {
                  break L1;
                } else {
                  L2: {
                    if (!mg.a(param6, (byte) 32)) {
                      break L2;
                    } else {
                      if (mg.a(param3, (byte) 123)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((jc) this).field_tc) {
                    stackOut_10_0 = new ik((jc) this, param6, param3, param5, param0, param4);
                    stackIn_11_0 = stackOut_10_0;
                    return (qi) (Object) stackIn_11_0;
                  } else {
                    var9 = new ed((jc) this, lc.field_g, la.field_h, fk.a(param6, 25), fk.a(param3, 30));
                    var9.a((byte) -106, param0, 0, param4, param6, param3, 0, param5);
                    stackOut_8_0 = (ed) var9;
                    stackIn_9_0 = stackOut_8_0;
                    return (qi) (Object) stackIn_9_0;
                  }
                }
              }
              stackOut_12_0 = new ed((jc) this, param6, param3, param2, param5, param0, param4);
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("jc.VC(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param6 + 41);
        }
        return (qi) (Object) stackIn_13_0;
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
        if (!(var2 == 0)) {
            ((jc) this).field_Hc[((jc) this).field_F] = 0;
            jaggl.OpenGL.glBindTexture(var2, 0);
            jaggl.OpenGL.glDisable(var2);
        }
    }

    final boolean a(la param0, int param1, hd param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              float discarded$2 = ((jc) this).o((byte) -62);
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("jc.KB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0 != 0;
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
        super.c();
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
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glTexEnvi(8960, 34176 - -param1, ii.a((byte) 73, param3));
              if (param0) {
                L2: {
                  stackOut_5_0 = 8960;
                  stackOut_5_1 = 34192 + param1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (!param4) {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 770;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L2;
                  } else {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 771;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L2;
                  }
                }
                jaggl.OpenGL.glTexEnvi(stackIn_8_0, stackIn_8_1, stackIn_8_2);
                break L1;
              } else {
                L3: {
                  stackOut_1_0 = 8960;
                  stackOut_1_1 = param1 + 34192;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_3_1 = stackOut_1_1;
                  stackIn_2_0 = stackOut_1_0;
                  stackIn_2_1 = stackOut_1_1;
                  if (!param4) {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = 768;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    break L3;
                  } else {
                    stackOut_2_0 = stackIn_2_0;
                    stackOut_2_1 = stackIn_2_1;
                    stackOut_2_2 = 769;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_4_2 = stackOut_2_2;
                    break L3;
                  }
                }
                jaggl.OpenGL.glTexEnvi(stackIn_4_0, stackIn_4_1, stackIn_4_2);
                break L1;
              }
            }
            L4: {
              if (param2) {
                break L4;
              } else {
                ((jc) this).field_Nc = true;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("jc.CD(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
        }
    }

    final void a(sm param0) {
    }

    final void a(boolean param0, ia param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0) {
              L1: {
                if (param1 != wt.field_m) {
                  if (param1 == bm.field_x) {
                    var5_int = 3;
                    var6 = 1 + param2;
                    break L1;
                  } else {
                    if (tm.field_h == param1) {
                      var5_int = 4;
                      var6 = 3 * param2;
                      break L1;
                    } else {
                      if (qp.field_j != param1) {
                        if (gh.field_i != param1) {
                          var6 = param2;
                          var5_int = 0;
                          break L1;
                        } else {
                          var6 = param2 + 2;
                          var5_int = 5;
                          break L1;
                        }
                      } else {
                        var5_int = 6;
                        var6 = param2 + 2;
                        break L1;
                      }
                    }
                  }
                } else {
                  var5_int = 1;
                  var6 = 2 * param2;
                  break L1;
                }
              }
              jaggl.OpenGL.glDrawArrays(var5_int, param3, var6);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("jc.DB(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void p(byte param0) {
        if (((jc) this).field_Db) {
            jaggl.OpenGL.glEnable(3042);
        } else {
            jaggl.OpenGL.glDisable(3042);
        }
        if (param0 > -127) {
            ((jc) this).field_Fc = null;
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
                super.k((byte) 124);
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
            np.field_d[1] = var6 * (float)pg.a(255, var4 >> 8);
            np.field_d[0] = var6 * (float)pg.a(255, var4 >> 16);
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
