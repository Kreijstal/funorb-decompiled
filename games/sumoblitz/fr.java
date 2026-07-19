/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fr extends ha {
    private int field_s;
    private long field_ob;
    private java.awt.Canvas field_ab;
    int field_Ec;
    private int field_I;
    private long field_rb;
    jaggl.OpenGL field_y;
    private Hashtable field_Gb;
    private int field_Z;
    static String field_lb;
    private ic field_O;
    private kk field_Pb;
    int field_X;
    private eb field_D;
    private iv field_Kb;
    int field_Bc;
    private gq field_U;
    private jn field_oc;
    jaclib.memory.heap.NativeHeap field_pb;
    int field_Ac;
    private boolean field_jc;
    b field_Sb;
    private cs field_H;
    private int field_qc;
    private int field_Jb;
    private mw[] field_m;
    private mw field_Fb;
    private mw[] field_Hc;
    private int field_w;
    private ro field_Db;
    private cm field_Tb;
    private mw field_hc;
    private mw[] field_dc;
    private te field_nc;
    int field_p;
    int field_Xb;
    private int field_V;
    private int field_ic;
    private jn field_fb;
    private jn field_j;
    private jn field_q;
    private jn field_tc;
    private jn field_fc;
    private jn field_qb;
    private jn field_cc;
    private int field_nb;
    private long field_vc;
    private int field_Ab;
    private int field_zb;
    private boolean field_S;
    private boolean field_x;
    private boolean field_tb;
    private boolean field_A;
    dl field_M;
    dl field_mc;
    private float[] field_eb;
    private boolean field_Zb;
    private float field_l;
    boolean field_xc;
    private String field_E;
    private int field_t;
    private fk field_Rb;
    private bt field_Y;
    private int field_gc;
    cs field_G;
    boolean field_vb;
    private int field_Vb;
    private boolean field_J;
    private boolean field_gb;
    private int field_Yb;
    float[] field_o;
    int field_L;
    int field_yb;
    private int field_pc;
    private float field_Lb;
    int field_k;
    float field_bc;
    private float field_ub;
    private int field_wc;
    boolean field_B;
    private boolean field_ec;
    boolean field_Ob;
    private int field_db;
    boolean field_Cc;
    int field_u;
    private int field_Ub;
    private int field_Wb;
    boolean field_Ib;
    boolean field_Ic;
    private int field_lc;
    private int field_Q;
    private ht[] field_ib;
    private boolean field_r;
    private int field_yc;
    private fk field_zc;
    private int field_Eb;
    int field_Mb;
    private boolean field_R;
    private boolean field_hb;
    private int field_P;
    private boolean field_uc;
    private float field_Qb;
    private String field_Dc;
    private int field_sb;
    private int field_Nb;
    private int field_Cb;
    private boolean field_rc;
    private int field_v;
    private float field_i;
    float field_z;
    float field_ac;
    boolean field_W;
    private int field_sc;
    private boolean field_Gc;
    private int field_jb;
    int field_kc;
    boolean field_C;
    private boolean field_K;
    private int field_xb;
    us field_n;
    boolean field_N;
    float field_cb;
    private boolean field_Bb;
    boolean field_Hb;
    boolean field_wb;
    int field_T;
    private boolean field_mb;
    private float field_kb;
    private int field_bb;
    float field_Fc;

    private final int d(int param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        NumberFormatException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int[] var9 = null;
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          var2 = 0;
          this.field_E = jaggl.OpenGL.glGetString(7936).toLowerCase();
          this.field_Dc = jaggl.OpenGL.glGetString(7937).toLowerCase();
          if (this.field_E.indexOf("microsoft") == -1) {
            break L0;
          } else {
            var2 = var2 | 1;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != (this.field_E.indexOf("brian paul") ^ -1)) {
              break L2;
            } else {
              if ((this.field_E.indexOf("mesa") ^ -1) == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var2 = var2 | 1;
          break L1;
        }
        L3: {
          L4: {
            var3 = jaggl.OpenGL.glGetString(7938);
            var4 = cn.a(' ', var3.replace('.', ' '), -27224);
            if (param0 <= var4.length) {
              break L4;
            } else {
              var2 = var2 | 4;
              if (!Sumoblitz.field_L) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          try {
            L5: {
              var5_int = no.a((byte) -128, (CharSequence) ((Object) var4[0]));
              var6 = no.a((byte) -127, (CharSequence) ((Object) var4[1]));
              this.field_Yb = var5_int * 10 + var6;
              break L5;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L6: {
              var5 = (NumberFormatException) (Object) decompiledCaughtException;
              var2 = var2 | 4;
              break L6;
            }
          }
          break L3;
        }
        L7: {
          if (-13 >= (this.field_Yb ^ -1)) {
            break L7;
          } else {
            var2 = var2 | 2;
            break L7;
          }
        }
        L8: {
          if (!this.field_y.a("GL_ARB_multitexture")) {
            var2 = var2 | 8;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (this.field_y.a("GL_ARB_texture_env_combine")) {
            break L9;
          } else {
            var2 = var2 | 32;
            break L9;
          }
        }
        L10: {
          L11: {
            var9 = new int[1];
            jaggl.OpenGL.glGetIntegerv(34018, var9, 0);
            this.field_T = var9[0];
            jaggl.OpenGL.glGetIntegerv(34929, var9, 0);
            this.field_Ub = var9[0];
            jaggl.OpenGL.glGetIntegerv(34930, var9, 0);
            this.field_xb = var9[0];
            if (-3 < (this.field_T ^ -1)) {
              break L11;
            } else {
              if (-3 < (this.field_Ub ^ -1)) {
                break L11;
              } else {
                if ((this.field_xb ^ -1) <= -3) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
          }
          var2 = var2 | 16;
          break L10;
        }
        L12: {
          this.field_R = jaclib.memory.Stream.b();
          this.field_Gc = this.field_y.arePbuffersAvailable();
          this.field_J = this.field_y.a("GL_ARB_vertex_buffer_object");
          this.field_hb = this.field_y.a("GL_ARB_multisample");
          this.field_Ib = this.field_y.a("GL_ARB_vertex_program");
          discarded$1 = this.field_y.a("GL_ARB_fragment_program");
          this.field_N = this.field_y.a("GL_ARB_vertex_shader");
          this.field_wb = this.field_y.a("GL_ARB_fragment_shader");
          this.field_Ic = this.field_y.a("GL_EXT_texture3D");
          this.field_C = this.field_y.a("GL_ARB_texture_rectangle");
          this.field_Ob = this.field_y.a("GL_ARB_texture_cube_map");
          this.field_Hb = this.field_y.a("GL_ARB_texture_float");
          this.field_Cc = false;
          this.field_xc = this.field_y.a("GL_EXT_framebuffer_object");
          this.field_B = this.field_y.a("GL_EXT_framebuffer_blit");
          this.field_vb = this.field_y.a("GL_EXT_framebuffer_multisample");
          this.field_W = en.field_h.startsWith("mac");
          jaggl.OpenGL.glGetFloatv(2834, lu.field_g, 0);
          if (var2 != 0) {
            stackOut_25_0 = var2;
            stackIn_26_0 = stackOut_25_0;
            break L12;
          } else {
            stackOut_24_0 = 0;
            stackIn_26_0 = stackOut_24_0;
            break L12;
          }
        }
        return stackIn_26_0;
    }

    private final void k(byte param0) {
        if (!(1 == this.field_nb)) {
            this.t(1);
            this.d(3, false);
            this.b(-69, false);
            this.a(65, false);
            this.a(false, (byte) -94);
            this.a(106, (ht) null);
            this.a((byte) 123, -2);
            this.c(1, true);
            this.field_nb = 1;
        }
        int var2 = -67 % ((39 - param0) / 49);
    }

    private final void b(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_eb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        int var2 = -104 % ((14 - param0) / 61);
    }

    private final void c(byte param0) {
        int incrementValue$2 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          var2 = 0;
          if (param0 > 73) {
            break L0;
          } else {
            this.field_mc = (dl) null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (this.field_y.b()) {
              break L2;
            } else {
              if (var3 != 0) {
                break L2;
              } else {
                incrementValue$2 = var2;
                var2++;
                if ((incrementValue$2 ^ -1) < -6) {
                  throw new RuntimeException("");
                } else {
                  tg.a(1000L, (byte) 87);
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void a(float param0, float param1, float param2, int param3) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (this.field_mb) {
            jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param2, param0, param1);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_mb = true;
        if (param3 != 32151) {
            this.field_nb = 10;
        }
    }

    final void g(int param0, int param1) {
        if (param1 < 79) {
            this.b(false);
        }
        if (!(param0 == this.field_Vb)) {
            jaggl.OpenGL.glActiveTexture(33984 - -param0);
            this.field_Vb = param0;
        }
    }

    private final void d(boolean param0) {
        java.awt.Dimension var2 = null;
        L0: {
          L1: {
            if (this.field_ab != null) {
              break L1;
            } else {
              this.field_s = 0;
              this.field_I = 0;
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = this.field_ab.getSize();
          this.field_s = var2.width;
          this.field_I = var2.height;
          break L0;
        }
        L2: {
          if (null == this.field_Fb) {
            this.field_Ec = this.field_I;
            this.field_Z = this.field_s;
            this.h((byte) -55);
            break L2;
          } else {
            break L2;
          }
        }
        this.g((byte) -81);
        if (param0) {
          this.j(-1303);
          return;
        } else {
          return;
        }
    }

    final void K(int[] param0) {
        try {
            param0[2] = this.field_jb;
            param0[0] = this.field_yc;
            param0[1] = this.field_Wb;
            param0[3] = this.field_Eb;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fr.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.k((byte) -121);
        this.c(25189, param4);
        float var6 = 0.3499999940395355f + (float)param0;
        float var7 = (float)param1 + 0.3499999940395355f;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 1290700816), (byte)(param3 >> -654750392), (byte)param3, (byte)(param3 >> -1965587976));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f((float)param2 + var6, var7);
        jaggl.OpenGL.glEnd();
    }

    final synchronized void b(int param0, int param1, int param2) {
        ge var4 = new ge(param2);
        var4.field_h = (long)param0;
        this.field_fc.a((ms) (var4), (byte) 39);
        int var5 = 33 % ((param1 - 32) / 38);
    }

    public static void d(byte param0) {
        if (param0 != 66) {
            return;
        }
        field_lb = null;
    }

    private final void f(byte param0) {
        if (param0 >= -103) {
            this.field_zb = 95;
        }
        this.field_eb[10] = this.field_i;
        this.field_eb[14] = this.field_Qb;
    }

    private final void c(mw param0, int param1) {
        int fieldTemp$2 = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_qc < 0) {
                break L1;
              } else {
                if (this.field_m[this.field_qc] == param0) {
                  fieldTemp$2 = this.field_qc;
                  this.field_qc = this.field_qc - 1;
                  this.field_m[fieldTemp$2] = null;
                  if (param1 >= 68) {
                    L2: {
                      L3: {
                        param0.a(-20745);
                        if (-1 < (this.field_qc ^ -1)) {
                          break L3;
                        } else {
                          this.field_hc = this.field_m[this.field_qc];
                          this.field_hc.c(195);
                          if (!Sumoblitz.field_L) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_hc = null;
                      break L2;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("fr.QB(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a() {
        return this.field_U != null && this.field_U.a(118);
    }

    final da a(ta param0, ri[] param1, boolean param2) {
        RuntimeException var4 = null;
        qh stackIn_1_0 = null;
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
        qh stackOut_0_0 = null;
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
            stackOut_0_0 = new qh((fr) (this), param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("fr.DF(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return (da) ((Object) stackIn_1_0);
    }

    final void a(int param0, float param1, float param2, float param3, float param4) {
        lu.field_g[2] = param2;
        if (param0 != 31322) {
            this.field_Xb = 70;
        }
        lu.field_g[0] = param3;
        lu.field_g[1] = param1;
        lu.field_g[3] = param4;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, lu.field_g, 0);
    }

    final void a(int param0, ht param1) {
        RuntimeException runtimeException = null;
        ht var3 = null;
        int var4 = 0;
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
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 8) {
                break L1;
              } else {
                this.r(75);
                break L1;
              }
            }
            L2: {
              var3 = this.field_ib[this.field_Vb];
              if (param1 != var3) {
                L3: {
                  L4: {
                    if (param1 == null) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            if (param1.field_c == var3.field_c) {
                              break L5;
                            } else {
                              jaggl.OpenGL.glDisable(var3.field_c);
                              jaggl.OpenGL.glEnable(param1.field_c);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        jaggl.OpenGL.glEnable(param1.field_c);
                        break L5;
                      }
                      jaggl.OpenGL.glBindTexture(param1.field_c, param1.c(-113));
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  jaggl.OpenGL.glDisable(var3.field_c);
                  break L3;
                }
                this.field_ib[this.field_Vb] = param1;
                break L2;
              } else {
                break L2;
              }
            }
            this.field_nb = this.field_nb & -2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("fr.L(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final int b(int param0, byte param1) {
        L0: {
          if (param1 == -14) {
            break L0;
          } else {
            this.a((byte) 16, (mw) null);
            break L0;
          }
        }
        if ((param0 ^ -1) == -2) {
          return 7681;
        } else {
          if (-1 != (param0 ^ -1)) {
            if ((param0 ^ -1) != -3) {
              if (-4 != (param0 ^ -1)) {
                if ((param0 ^ -1) != -5) {
                  throw new IllegalArgumentException();
                } else {
                  return 34023;
                }
              } else {
                return 260;
              }
            } else {
              return 34165;
            }
          } else {
            return 8448;
          }
        }
    }

    final nr a(int param0, int param1) {
        return null;
    }

    final void q(int param0) {
        if (!(2 == this.field_nb)) {
            this.t(1);
            this.d(3, false);
            this.b(-74, false);
            this.a(99, false);
            this.a(false, (byte) -89);
            this.a((byte) 119, -2);
            this.field_nb = 2;
        }
        if (param0 > -49) {
            this.a((hr) null, true);
        }
    }

    private final void n(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -105) {
            break L0;
          } else {
            this.field_wb = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_S) {
              break L2;
            } else {
              if (!this.field_Zb) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        jaggl.OpenGL.glDepthMask(stackIn_6_0 != 0);
    }

    fr(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        dl discarded$5 = null;
        dl discarded$6 = null;
        dl discarded$7 = null;
        cw discarded$8 = null;
        long dupTemp$9 = 0L;
        Throwable var4 = null;
        RuntimeException var4_ref = null;
        int var4_int = 0;
        Throwable var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object[] var8 = null;
        String[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        String var10_ref = null;
        Exception var11 = null;
        int var12 = 0;
        Object var13 = null;
        int[] var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        CharSequence var21 = null;
        CharSequence var22 = null;
        CharSequence var23 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        String var13_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Sumoblitz.field_L ? 1 : 0;
                    var18 = null;
                    var19 = null;
                    var20 = null;
                    this.field_Gb = new Hashtable();
                    this.field_X = 128;
                    this.field_O = new ic();
                    discarded$5 = new dl();
                    discarded$6 = new dl();
                    this.field_jc = false;
                    this.field_oc = new jn();
                    this.field_Jb = -1;
                    this.field_qc = -1;
                    this.field_m = new mw[4];
                    this.field_Hc = new mw[4];
                    this.field_w = -1;
                    this.field_dc = new mw[4];
                    this.field_Db = new ro();
                    this.field_nc = new te(16);
                    this.field_fb = new jn();
                    this.field_j = new jn();
                    this.field_q = new jn();
                    this.field_tc = new jn();
                    this.field_fc = new jn();
                    this.field_qb = new jn();
                    this.field_cc = new jn();
                    discarded$7 = new dl();
                    this.field_M = new dl();
                    this.field_mc = new dl();
                    this.field_t = 0;
                    this.field_l = 0.0f;
                    this.field_gc = 8448;
                    this.field_o = new float[4];
                    this.field_Zb = true;
                    this.field_eb = new float[16];
                    this.field_pc = 0;
                    this.field_db = 0;
                    this.field_lc = 0;
                    this.field_sb = 512;
                    this.field_Wb = 0;
                    this.field_Cb = 3584;
                    this.field_ub = 1.0f;
                    this.field_k = -1;
                    this.field_Eb = 0;
                    this.field_v = 8448;
                    this.field_u = -1;
                    this.field_sc = 50;
                    this.field_ac = 1.0f;
                    this.field_Mb = 0;
                    this.field_gb = false;
                    this.field_z = 1.0f;
                    this.field_Nb = 512;
                    this.field_P = -1;
                    this.field_kc = -1;
                    this.field_yc = 0;
                    this.field_jb = 0;
                    this.field_kb = 1.0f;
                    this.field_bb = 0;
                    this.field_Fc = 1.0f;
                    discarded$8 = new cw(8192);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_Bc = param2;
                        this.field_ab = param0;
                        if (mc.b((byte) -107, "jaclib")) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (mc.b((byte) 97, "jaggl")) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_y = new jaggl.OpenGL();
                        dupTemp$9 = this.field_y.init(param0, 8, 8, 8, 24, 0, this.field_Bc);
                        this.field_ob = dupTemp$9;
                        this.field_rb = dupTemp$9;
                        if ((this.field_ob ^ -1L) != -1L) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.c((byte) 117);
                        var4_int = this.d(2);
                        if (0 == var4_int) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (this.field_R) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 5121;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = this;
                        stackOut_11_1 = 33639;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((fr) (this)).field_L = stackIn_12_1;
                        if (-1 == this.field_Dc.indexOf("radeon")) {
                            statePc = 48;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        var7 = 0;
                        var8_array = cn.a(' ', this.field_Dc.replace('/', ' '), -27224);
                        var9 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8_array.length <= var9) {
                            statePc = 36;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var13_ref = var8_array[var9];
                        var10_ref = var13_ref;
                        var10_ref = var13_ref;
                        var10_ref = var13_ref;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = -1;
                        stackOut_16_1 = var13_ref.length() ^ -1;
                        stackIn_49_0 = stackOut_16_0;
                        stackIn_49_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (var12 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 > stackIn_17_1) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var12 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var13_ref.charAt(0) != 120) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = ((Object) stateCaught_19 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (3 > var13_ref.length()) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var21 = (CharSequence) ((Object) var13_ref.substring(1, 3));
                        if (!jf.a(-13181, var21)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = 1;
                        var10_ref = var13_ref.substring(1);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var10_ref.equals("hd")) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = ((Object) stateCaught_23 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = ((Object) stateCaught_24 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var12 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!var10_ref.startsWith("hd")) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var10_ref = var10_ref.substring(2);
                        var6 = 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = ((Object) stateCaught_28 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (4 > var10_ref.length()) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var22 = (CharSequence) ((Object) var10_ref.substring(0, 4));
                        if (!jf.a(-13181, var22)) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var23 = (CharSequence) ((Object) var10_ref.substring(0, 4));
                        var5_int = no.a((byte) -128, var23);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof Exception ? 34 : 64);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var12 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var11 = (Exception) ((Object) caughtException);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var7 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var6 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (7000 > var5_int) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_int > 7999) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_J = false;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var5_int ^ -1) > -7001) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5_int > 9250) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.field_Ic = false;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var6 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var5_int >= 4000) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_Hb = false;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.field_C = this.field_C & this.field_y.a("GL_ARB_half_float_pixel");
                        this.field_K = this.field_J;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = this.field_E.indexOf("intel");
                        stackOut_48_1 = -1;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 == stackIn_49_1) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_xc = false;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = this;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_52_0 = stackOut_51_0;
                        if (this.field_E.equals("s3 graphics")) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = this;
                        stackOut_52_1 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_54_1 = stackOut_52_1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = this;
                        stackOut_53_1 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((fr) (this)).field_ec = stackIn_54_1 != 0;
                        if (this.field_J) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var17 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var5 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        kr.a(true, -107, false);
                        this.field_jc = true;
                        this.field_Pb = new kk((fr) (this), this.field_h);
                        this.i((byte) -93);
                        this.field_Sb = new b((fr) (this));
                        this.field_D = new eb((fr) (this));
                        if (!this.field_D.a(550267135)) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        this.field_U = new gq((fr) (this));
                        if (this.field_U.d(-8111)) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        this.field_U.c(50);
                        this.field_U = null;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_Kb = new iv((fr) (this));
                        this.l(0);
                        this.d(true);
                        this.e();
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var4 = caughtException;
                        var4.printStackTrace();
                        this.d();
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackOut_65_0 = (RuntimeException) (var4_ref);
                    stackOut_65_1 = new StringBuilder().append("fr.<init>(");
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (param0 == null) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackOut_66_2 = "{...}";
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    stackIn_68_2 = stackOut_66_2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackOut_67_2 = "null";
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    stackIn_68_2 = stackOut_67_2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_70_1 = stackOut_68_1;
                    stackIn_69_0 = stackOut_68_0;
                    stackIn_69_1 = stackOut_68_1;
                    if (param1 == null) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackOut_69_2 = "{...}";
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_71_1 = stackOut_69_1;
                    stackIn_71_2 = stackOut_69_2;
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackOut_70_2 = "null";
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    stackIn_71_2 = stackOut_70_2;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    throw qo.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ',' + param2 + ')');
                }
                case 72: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        if (param0 == 20685) {
          L0: {
            L1: {
              if (-1 != (this.field_Vb ^ -1)) {
                break L1;
              } else {
                L2: {
                  var4 = 0;
                  if (param2 != this.field_gc) {
                    jaggl.OpenGL.glTexEnvi(8960, 34161, param2);
                    this.field_gc = param2;
                    var4 = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_v ^ -1) == (param1 ^ -1)) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
                    var4 = 1;
                    this.field_v = param1;
                    break L3;
                  }
                }
                L4: {
                  if (var4 == 0) {
                    break L4;
                  } else {
                    this.field_nb = this.field_nb & -30;
                    break L4;
                  }
                }
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            jaggl.OpenGL.glTexEnvi(8960, 34161, param2);
            jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0, byte param1) {
        if ((!this.field_rc ? 1 : 0) == (param0 ? 1 : 0)) {
            this.field_rc = param0 ? true : false;
            this.b(true);
        }
        if (param1 >= -63) {
            this.field_yb = 22;
        }
    }

    final int[] Y() {
        return new int[]{this.field_t, this.field_db, this.field_Nb, this.field_sb};
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.field_Ub = 26;
        }
        ge var4 = new ge(param2);
        var4.field_h = (long)param0;
        this.field_j.a((ms) (var4), (byte) 39);
    }

    final void d() {
        ms var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var1 = this.field_oc.b(79);
        L0: while (true) {
          L1: {
            L2: {
              if (var1 == null) {
                break L2;
              } else {
                ((ad) ((Object) var1)).a(-4009);
                var1 = this.field_oc.d((byte) 18);
                if (var4 != 0) {
                  break L1;
                } else {
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (this.field_D == null) {
              break L1;
            } else {
              this.field_D.a((byte) 113);
              break L1;
            }
          }
          L3: {
            if (null != this.field_y) {
              this.h(-27782);
              var1_ref = this.field_Gb.keys();
              L4: while (true) {
                L5: {
                  L6: {
                    if (!var1_ref.hasMoreElements()) {
                      break L6;
                    } else {
                      var2 = (java.awt.Canvas) (var1_ref.nextElement());
                      var3 = (Long) (this.field_Gb.get(var2));
                      this.field_y.releaseSurface(var2, var3.longValue());
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  this.field_y.release();
                  break L5;
                }
                this.field_y = null;
                break L3;
              }
            } else {
              break L3;
            }
          }
          L7: {
            if (!this.field_jc) {
              break L7;
            } else {
              pt.a(false, true, -1);
              this.field_jc = false;
              break L7;
            }
          }
          return;
        }
    }

    final void a(vc param0) {
    }

    final hr a(ri param0, boolean param1) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        hr var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        hr stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        hr stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var12 = new int[param0.field_i * param0.field_h];
                var11 = var12;
                var10 = var11;
                var3_array = var10;
                var4 = 0;
                var5 = 0;
                if (param0.field_a != null) {
                  break L2;
                } else {
                  var6_int = 0;
                  L3: while (true) {
                    L4: {
                      if ((param0.field_i ^ -1) >= (var6_int ^ -1)) {
                        break L4;
                      } else {
                        if (var9 != 0) {
                          break L1;
                        } else {
                          var7 = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if ((param0.field_h ^ -1) >= (var7 ^ -1)) {
                                  break L7;
                                } else {
                                  incrementValue$3 = var4;
                                  var4++;
                                  var8 = param0.field_g[255 & param0.field_e[incrementValue$3]];
                                  if (var9 != 0) {
                                    break L6;
                                  } else {
                                    L8: {
                                      incrementValue$4 = var5;
                                      var5++;
                                      stackOut_8_0 = (int[]) (var10);
                                      stackOut_8_1 = incrementValue$4;
                                      stackIn_10_0 = stackOut_8_0;
                                      stackIn_10_1 = stackOut_8_1;
                                      stackIn_9_0 = stackOut_8_0;
                                      stackIn_9_1 = stackOut_8_1;
                                      if (var8 != 0) {
                                        stackOut_10_0 = (int[]) ((Object) stackIn_10_0);
                                        stackOut_10_1 = stackIn_10_1;
                                        stackOut_10_2 = ic.a(-16777216, var8);
                                        stackIn_11_0 = stackOut_10_0;
                                        stackIn_11_1 = stackOut_10_1;
                                        stackIn_11_2 = stackOut_10_2;
                                        break L8;
                                      } else {
                                        stackOut_9_0 = (int[]) ((Object) stackIn_9_0);
                                        stackOut_9_1 = stackIn_9_1;
                                        stackOut_9_2 = 0;
                                        stackIn_11_0 = stackOut_9_0;
                                        stackIn_11_1 = stackOut_9_1;
                                        stackIn_11_2 = stackOut_9_2;
                                        break L8;
                                      }
                                    }
                                    stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                                    var7++;
                                    if (var9 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var6_int++;
                              break L6;
                            }
                            if (var9 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var6_int = 0;
              L9: while (true) {
                if ((param0.field_i ^ -1) >= (var6_int ^ -1)) {
                  break L1;
                } else {
                  var7 = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (param0.field_h <= var7) {
                          break L12;
                        } else {
                          incrementValue$5 = var5;
                          var5++;
                          var10[incrementValue$5] = ic.a(param0.field_g[eb.a((int) param0.field_e[var4], 255)], param0.field_a[var4] << 1413514584);
                          var4++;
                          var7++;
                          if (var9 != 0) {
                            break L11;
                          } else {
                            if (var9 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var6_int++;
                      break L11;
                    }
                    if (var9 == 0) {
                      continue L9;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var6 = this.a(0, -2, param0.field_i, param0.field_h, param0.field_h, var12);
            var6.a(param0.field_c, param0.field_d, param0.field_b, param0.field_f);
            stackOut_24_0 = (hr) (var6);
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("fr.RA(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L13;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_25_0;
    }

    private final void h(int param0) {
        if (param0 != -27782) {
            this.b();
        }
        boolean discarded$0 = this.field_y.a();
    }

    final boolean c() {
        return true;
    }

    private final void c(boolean param0) {
        if (!(!this.field_mb)) {
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            this.field_mb = false;
        }
        if (param0) {
            this.field_cc = (jn) null;
        }
    }

    final void DA(int param0, int param1, int param2, int param3) {
        L0: {
          L1: {
            this.field_Nb = param2;
            this.field_db = param1;
            this.field_sb = param3;
            this.field_t = param0;
            this.o(770);
            this.m(-117);
            if ((this.field_Q ^ -1) == -4) {
              break L1;
            } else {
              if (-3 == (this.field_Q ^ -1)) {
                this.b((byte) -108);
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L0;
              }
            }
          }
          this.p(-15048);
          break L0;
        }
    }

    final vc a(bu param0, nr param1) {
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
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("fr.OF(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return (vc) ((Object) stackIn_1_0);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            this.t(1);
            this.a(88, (ht) null);
            this.c(25189, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_L, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fr.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void g(byte param0) {
        if (param0 != -81) {
            return;
        }
        if (0 != this.field_Q) {
            this.field_Q = 0;
            this.field_nb = this.field_nb & -32;
        }
    }

    final boolean s(int param0) {
        int var2 = 35 / ((-45 - param0) / 58);
        return this.field_Kb.a(3, (byte) 71);
    }

    final void c(int param0, boolean param1) {
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            this.field_Ec = -84;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-2 == (param0 ^ -1)) {
              break L2;
            } else {
              L3: {
                if (-1 != (param0 ^ -1)) {
                  break L3;
                } else {
                  this.a(20685, 8448, 8448);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if ((param0 ^ -1) == -3) {
                    break L5;
                  } else {
                    L6: {
                      if (-4 == (param0 ^ -1)) {
                        break L6;
                      } else {
                        if (4 == param0) {
                          this.a(20685, 34023, 34023);
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    this.a(20685, 8448, 260);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                this.a(20685, 7681, 34165);
                if (var4 == 0) {
                  break L4;
                } else {
                  break L2;
                }
              }
              break L1;
            }
          }
          this.a(20685, 7681, 7681);
          break L1;
        }
    }

    final synchronized void a(int param0, byte param1) {
        ms var3 = new ms();
        var3.field_h = (long)param0;
        int var4 = -109 / ((25 - param1) / 42);
        this.field_qb.a(var3, (byte) 39);
    }

    final synchronized void b(byte param0, int param1) {
        ge var3 = new ge(param1);
        if (param0 > -1) {
            this.field_bb = -108;
        }
        this.field_tc.a((ms) (var3), (byte) 39);
    }

    final void b() {
        boolean discarded$4 = false;
        L0: {
          L1: {
            if (this.field_xc) {
              break L1;
            } else {
              if (this.field_Gc) {
                this.field_Tb.b(0, this.field_Ec, 0, 0, 0, this.field_Z, -3773);
                discarded$4 = this.field_y.setSurface(this.field_rb);
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                throw new RuntimeException("");
              }
            }
          }
          if (this.field_Fb == this.field_H) {
            this.field_H.a(0, 17012);
            this.field_H.a(8, 17012);
            this.a((byte) -123, (mw) (this.field_H));
            break L0;
          } else {
            throw new RuntimeException();
          }
        }
        this.field_Tb = null;
        this.field_Ec = this.field_I;
        this.field_Z = this.field_s;
        this.g((byte) -81);
        this.h((byte) -81);
        this.j(-1303);
    }

    final void a(za param0) {
        jq discarded$2 = null;
        jq discarded$3 = null;
        RuntimeException var2 = null;
        cw var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              this.field_pb = ((ad) ((Object) param0)).field_m;
              if (null == this.field_Rb) {
                L2: {
                  L3: {
                    var3 = new cw(80);
                    if (this.field_R) {
                      break L3;
                    } else {
                      var3.c((byte) -36, -1.0f);
                      var3.c((byte) -36, -1.0f);
                      var3.c((byte) -36, 0.0f);
                      var3.c((byte) -36, 0.0f);
                      var3.c((byte) -36, 1.0f);
                      var3.c((byte) -36, 1.0f);
                      var3.c((byte) -36, -1.0f);
                      var3.c((byte) -36, 0.0f);
                      var3.c((byte) -36, 1.0f);
                      var3.c((byte) -36, 1.0f);
                      var3.c((byte) -36, 1.0f);
                      var3.c((byte) -36, 1.0f);
                      var3.c((byte) -36, 0.0f);
                      var3.c((byte) -36, 1.0f);
                      var3.c((byte) -36, 0.0f);
                      var3.c((byte) -36, -1.0f);
                      var3.c((byte) -36, 1.0f);
                      var3.c((byte) -36, 0.0f);
                      var3.c((byte) -36, 0.0f);
                      var3.c((byte) -36, 0.0f);
                      if (!Sumoblitz.field_L) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3.b((byte) 87, -1.0f);
                  var3.b((byte) -69, -1.0f);
                  var3.b((byte) -120, 0.0f);
                  var3.b((byte) 87, 0.0f);
                  var3.b((byte) -108, 1.0f);
                  var3.b((byte) 108, 1.0f);
                  var3.b((byte) 93, -1.0f);
                  var3.b((byte) 125, 0.0f);
                  var3.b((byte) 76, 1.0f);
                  var3.b((byte) 72, 1.0f);
                  var3.b((byte) 74, 1.0f);
                  var3.b((byte) 109, 1.0f);
                  var3.b((byte) 123, 0.0f);
                  var3.b((byte) -77, 1.0f);
                  var3.b((byte) 121, 0.0f);
                  var3.b((byte) 90, -1.0f);
                  var3.b((byte) 121, 1.0f);
                  var3.b((byte) 86, 0.0f);
                  var3.b((byte) -66, 0.0f);
                  var3.b((byte) 95, 0.0f);
                  break L2;
                }
                this.field_Rb = this.a(20, false, (byte) -23, var3.field_p, var3.field_n);
                discarded$2 = new jq(this.field_Rb, 5126, 3, 0);
                discarded$3 = new jq(this.field_Rb, 5126, 2, 12);
                this.field_O.a((fr) (this), false);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("fr.OB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    private final void o(int param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float[] var8 = null;
        var8 = this.field_eb;
        var2 = var8;
        var3 = (float)(-this.field_t * this.field_sc) / (float)this.field_Nb;
        var4 = (float)((this.field_Z + -this.field_t) * this.field_sc) / (float)this.field_Nb;
        if (param0 == 770) {
          L0: {
            L1: {
              L2: {
                var5 = (float)(this.field_db * this.field_sc) / (float)this.field_sb;
                var6 = (float)((this.field_db + -this.field_Ec) * this.field_sc) / (float)this.field_sb;
                if (var3 == var4) {
                  break L2;
                } else {
                  if (var6 != var5) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8[15] = 1.0f;
              var8[13] = 0.0f;
              var8[9] = 0.0f;
              var8[2] = 0.0f;
              var8[5] = 1.0f;
              var8[10] = 1.0f;
              var8[11] = 0.0f;
              var8[7] = 0.0f;
              var8[14] = 0.0f;
              var8[6] = 0.0f;
              var8[1] = 0.0f;
              var8[4] = 0.0f;
              var8[8] = 0.0f;
              var8[0] = 1.0f;
              var8[12] = 0.0f;
              var8[3] = 0.0f;
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
            var7 = (float)this.field_sc * 2.0f;
            var8[6] = 0.0f;
            var8[4] = 0.0f;
            var8[8] = (var3 + var4) / (var4 - var3);
            var8[3] = 0.0f;
            var8[12] = 0.0f;
            var8[15] = 0.0f;
            var8[9] = (var5 + var6) / (var5 - var6);
            var8[1] = 0.0f;
            var8[2] = 0.0f;
            this.field_Qb = -(var7 * (float)this.field_Cb) / (float)(-this.field_sc + this.field_Cb);
            var8[14] = -(var7 * (float)this.field_Cb) / (float)(-this.field_sc + this.field_Cb);
            var8[0] = var7 / (var4 - var3);
            var8[11] = -1.0f;
            var8[7] = 0.0f;
            this.field_i = (float)(-(this.field_sc + this.field_Cb)) / (float)(-this.field_sc + this.field_Cb);
            var8[10] = (float)(-(this.field_sc + this.field_Cb)) / (float)(-this.field_sc + this.field_Cb);
            var8[5] = var7 / (-var6 + var5);
            var8[13] = 0.0f;
            break L0;
          }
          this.f((byte) -127);
          return;
        } else {
          return;
        }
    }

    final void a(float param0, int param1, float param2) {
        this.field_l = param2;
        this.field_ub = param0;
        this.i(param1 + 3074);
        if (param1 != 15) {
            this.i((byte) -17);
        }
    }

    private final void p(int param0) {
        float var2 = this.field_kb * (float)(-this.field_t) / (float)this.field_Nb;
        float var3 = this.field_kb * (float)(-this.field_db) / (float)this.field_sb;
        float var4 = this.field_kb * (float)(-this.field_t + this.field_Z) / (float)this.field_Nb;
        float var5 = this.field_kb * (float)(-this.field_db + this.field_Ec) / (float)this.field_sb;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (var4 != var2) {
            if (!(var5 == var3)) {
                jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field_sc, (double)this.field_Cb);
            }
        }
        if (param0 != -15048) {
            return;
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var5 = -72 % ((53 - param2) / 38);
        ge var4 = new ge(param1);
        var4.field_h = (long)param0;
        this.field_q.a((ms) (var4), (byte) 39);
    }

    private final void g(int param0) {
        L0: {
          L1: {
            if (!this.field_r) {
              break L1;
            } else {
              if (-1 < (this.field_kc ^ -1)) {
                break L1;
              } else {
                jaggl.OpenGL.glEnable(2912);
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          jaggl.OpenGL.glDisable(2912);
          break L0;
        }
        L2: {
          if (param0 == 16) {
            break L2;
          } else {
            this.k(-114);
            break L2;
          }
        }
    }

    final void k(int param0) {
        if (param0 != -25462) {
            this.field_m = (mw[]) null;
        }
        if (!((this.field_nb ^ -1) == -5)) {
            this.t(1);
            this.d(param0 + 25465, false);
            this.b(-55, false);
            this.a(param0 ^ -25409, false);
            this.a(false, (byte) -101);
            this.a((byte) 110, -2);
            this.c(25189, 1);
            this.field_nb = 4;
        }
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (!((this.field_yc ^ -1) <= (param0 ^ -1))) {
            this.field_yc = param0;
        }
        if (!(param2 >= this.field_jb)) {
            this.field_jb = param2;
        }
        if (param1 > this.field_Wb) {
            this.field_Wb = param1;
        }
        if (!((this.field_Eb ^ -1) >= (param3 ^ -1))) {
            this.field_Eb = param3;
        }
        jaggl.OpenGL.glEnable(3089);
        this.m(-124);
        this.r(0);
    }

    final za c(int param0) {
        ad var2 = new ad(param0);
        this.field_oc.a((ms) (var2), (byte) 39);
        return (za) ((Object) var2);
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = (float)param0 + 0.3499999940395355f;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = var7 + (float)param2;
        this.k((byte) -36);
        float var10 = var8 + (float)param3;
        this.c(25189, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 578849936), (byte)(param4 >> -243644312), (byte)param4, (byte)(param4 >> -1853843016));
        if (!(!this.field_hb)) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (this.field_hb) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void a(byte param0, int param1) {
        this.a(true, param1, (byte) -102);
        if (param0 < 109) {
            this.field_Mb = 30;
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (!((this.field_Ec ^ -1) <= (param3 ^ -1))) {
            param3 = this.field_Ec;
        }
        if ((param1 ^ -1) > -1) {
            param1 = 0;
        }
        if (!((this.field_Z ^ -1) <= (param2 ^ -1))) {
            param2 = this.field_Z;
        }
        this.field_Wb = param1;
        this.field_Eb = param3;
        this.field_jb = param2;
        this.field_yc = param0;
        jaggl.OpenGL.glEnable(3089);
        this.m(-122);
        this.r(0);
    }

    final void b(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, param2 + 34176, param0);
        jaggl.OpenGL.glTexEnvi(8960, param2 + 34192, param1);
        int var5 = 42 % ((param3 - -69) / 47);
    }

    final synchronized void a(long param0, byte param1) {
        ms var4 = new ms();
        int var5 = 35 / ((-24 - param1) / 54);
        var4.field_h = param0;
        this.field_cc.a(var4, (byte) 39);
    }

    private final void b(int param0, mw param1) {
        int fieldTemp$0 = 0;
        try {
            if (3 <= this.field_qc) {
                throw new RuntimeException();
            }
            if (param0 != 30369) {
                this.field_Fc = -0.9330850839614868f;
            }
            if (this.field_qc >= 0) {
                this.field_m[this.field_qc].a(-20745);
            }
            fieldTemp$0 = this.field_qc + 1;
            this.field_qc = this.field_qc + 1;
            this.field_m[fieldTemp$0] = param1;
            this.field_hc = param1;
            this.field_hc.c(195);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fr.HB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(int param0) {
        this.field_Wb = 0;
        this.field_yc = 0;
        this.field_Eb = this.field_Ec;
        if (param0 != -1303) {
            return;
        }
        this.field_jb = this.field_Z;
        jaggl.OpenGL.glDisable(3089);
        this.m(-117);
    }

    private final void d(int param0, boolean param1) {
        if (!(this.field_r == param1)) {
            this.field_r = param1 ? true : false;
            this.g(16);
            this.field_nb = this.field_nb & -32;
        }
        if (param0 != 3) {
            this.field_R = false;
        }
    }

    final void b(int param0, int param1) throws rf {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            this.field_y.swapBuffers();
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = (Exception) (Object) decompiledCaughtException;
            break L1;
          }
        }
    }

    final int[] b(int param0, int param1, int param2, int param3, int param4) {
        hr discarded$2 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        L0: {
          var8 = Sumoblitz.field_L ? 1 : 0;
          if (param2 == 1) {
            break L0;
          } else {
            discarded$2 = this.a((ri) null, true);
            break L0;
          }
        }
        var9 = new int[param1 * param4];
        var6 = var9;
        var7 = 0;
        L1: while (true) {
          L2: {
            if ((param4 ^ -1) >= (var7 ^ -1)) {
              break L2;
            } else {
              jaggl.OpenGL.glReadPixelsi(param3, this.field_Ec - (param0 - -var7), param1, 1, 32993, this.field_L, var9, param1 * var7);
              var7++;
              if (var8 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var9;
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        this.a((byte) 111, -2);
        var2 = this.field_T + -1;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 < 0) {
                break L2;
              } else {
                this.g(var2, 90);
                this.a(param0 + 111, (ht) null);
                jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
                var2--;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.a(param0 + 20685, 8448, 8448);
            this.b(34168, 770, 2, 10);
            this.c(false);
            this.field_Ab = 1;
            jaggl.OpenGL.glEnable(3042);
            jaggl.OpenGL.glBlendFunc(770, 771);
            this.field_zb = 1;
            jaggl.OpenGL.glEnable(3008);
            jaggl.OpenGL.glAlphaFunc(516, 0.0f);
            this.field_A = true;
            jaggl.OpenGL.glColorMask(true, true, true, true);
            this.field_tb = true;
            this.d(param0 ^ 3, true);
            this.b(-44, true);
            this.a(84, true);
            this.a(true, (byte) -76);
            this.g((byte) -81);
            this.field_y.setSwapInterval(0);
            jaggl.OpenGL.glShadeModel(7425);
            jaggl.OpenGL.glClearDepth(1.0f);
            jaggl.OpenGL.glDepthFunc(515);
            jaggl.OpenGL.glPolygonMode(1028, 6914);
            jaggl.OpenGL.glEnable(2884);
            jaggl.OpenGL.glCullFace(1029);
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glColorMaterial(1028, 5634);
            jaggl.OpenGL.glEnable(2903);
            break L1;
          }
          var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
          var3 = param0;
          L3: while (true) {
            L4: {
              L5: {
                if (-9 >= (var3 ^ -1)) {
                  break L5;
                } else {
                  var4 = 16384 + var3;
                  jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
                  jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
                  jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
                  var3++;
                  if (var5 != 0) {
                    break L4;
                  } else {
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              jaggl.OpenGL.glEnable(16384);
              jaggl.OpenGL.glEnable(16385);
              jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
              jaggl.OpenGL.glFogi(2917, 9729);
              jaggl.OpenGL.glHint(3156, 4353);
              this.field_P = -1;
              this.j(param0 + -1303);
              break L4;
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        L0: {
          L1: {
            this.k((byte) -99);
            this.c(25189, param5);
            var7 = (float)(-param0) + (float)param2;
            var8 = (float)param3 - (float)param1;
            if (0.0f != var7) {
              break L1;
            } else {
              if (0.0f != var8) {
                break L1;
              } else {
                var7 = 1.0f;
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          var9 = (float)(1.0 / Math.sqrt((double)(var8 * var8 + var7 * var7)));
          var8 = var8 * var9;
          var7 = var7 * var9;
          break L0;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> -934269296), (byte)(param4 >> -963075224), (byte)param4, (byte)(param4 >> 1714339160));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param0, (float)param1 + 0.3499999940395355f);
        jaggl.OpenGL.glVertex2f(var7 + (float)param2 + 0.3499999940395355f, 0.3499999940395355f + (var8 + (float)param3));
        jaggl.OpenGL.glEnd();
    }

    private final void b(int param0, boolean param1) {
        if ((!this.field_Bb ? 1 : 0) == (param1 ? 1 : 0)) {
            this.field_Bb = param1 ? true : false;
            this.b(true);
            this.field_nb = this.field_nb & -8;
        }
        if (param0 > -8) {
            this.field_nc = (te) null;
        }
    }

    private final void a(boolean param0, byte param1) {
        if (param1 >= -73) {
            return;
        }
        if (!((!param0 ? 1 : 0) != (this.field_S ? 1 : 0))) {
            this.field_S = param0 ? true : false;
            this.n(-112);
            this.field_nb = this.field_nb & -32;
        }
    }

    final int XA() {
        return this.field_Cb;
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 - -param1, param2);
        jaggl.OpenGL.glTexEnvi(8960, param1 + 34200, param3);
        if (param0 < 108) {
            this.h((byte) -89);
        }
    }

    private final void r(int param0) {
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.T(-87, -86, 40, 96);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if ((this.field_jb ^ -1) > (this.field_yc ^ -1)) {
                break L3;
              } else {
                if (this.field_Wb <= this.field_Eb) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            jaggl.OpenGL.glScissor(0, 0, 0, 0);
            if (!Sumoblitz.field_L) {
              break L1;
            } else {
              break L2;
            }
          }
          jaggl.OpenGL.glScissor(this.field_yc + this.field_pc, -this.field_Eb + this.field_Ec + this.field_bb, this.field_jb + -this.field_yc, -this.field_Wb + this.field_Eb);
          break L1;
        }
    }

    final hp j(byte param0) {
        if (param0 != 62) {
            this.field_r = false;
        }
        return null == this.field_Y ? null : this.field_Y.b((byte) 113);
    }

    final synchronized void f(int param0) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var2 = 0;
        int var4 = 0;
        ge var5 = null;
        ge var6 = null;
        ge var7 = null;
        ge var8 = null;
        ge var9 = null;
        ms var10 = null;
        ms var11 = null;
        ge var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        param0 = param0 & 2147483647;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_j.a((byte) -119)) {
                break L2;
              } else {
                var5 = (ge) ((Object) this.field_j.c(9));
                incrementValue$4 = var2;
                var2++;
                gr.field_h[incrementValue$4] = (int)var5.field_h;
                this.field_Xb = this.field_Xb - var5.field_m;
                stackOut_2_0 = var2;
                stackOut_2_1 = 1000;
                stackIn_7_0 = stackOut_2_0;
                stackIn_7_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                      break L3;
                    } else {
                      jaggl.OpenGL.glDeleteBuffersARB(var2, gr.field_h, 0);
                      var2 = 0;
                      break L3;
                    }
                  }
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackOut_6_1 = var2 ^ -1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          }
          L4: {
            if (stackIn_7_0 <= stackIn_7_1) {
              break L4;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, gr.field_h, 0);
              var2 = 0;
              break L4;
            }
          }
          L5: while (true) {
            L6: {
              L7: {
                if (this.field_q.a((byte) -101)) {
                  break L7;
                } else {
                  var6 = (ge) ((Object) this.field_q.c(9));
                  incrementValue$5 = var2;
                  var2++;
                  gr.field_h[incrementValue$5] = (int)var6.field_h;
                  this.field_p = this.field_p - var6.field_m;
                  stackOut_11_0 = var2 ^ -1;
                  stackOut_11_1 = -1001;
                  stackIn_16_0 = stackOut_11_0;
                  stackIn_16_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (var4 != 0) {
                    break L6;
                  } else {
                    L8: {
                      if (stackIn_12_0 != stackIn_12_1) {
                        break L8;
                      } else {
                        jaggl.OpenGL.glDeleteTextures(var2, gr.field_h, 0);
                        var2 = 0;
                        break L8;
                      }
                    }
                    if (var4 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              stackOut_15_0 = var2 ^ -1;
              stackOut_15_1 = -1;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L6;
            }
            L9: {
              if (stackIn_16_0 < stackIn_16_1) {
                jaggl.OpenGL.glDeleteTextures(var2, gr.field_h, 0);
                var2 = 0;
                break L9;
              } else {
                break L9;
              }
            }
            L10: while (true) {
              L11: {
                L12: {
                  if (this.field_tc.a((byte) -93)) {
                    break L12;
                  } else {
                    var7 = (ge) ((Object) this.field_tc.c(9));
                    incrementValue$6 = var2;
                    var2++;
                    gr.field_h[incrementValue$6] = var7.field_m;
                    stackOut_20_0 = 1000;
                    stackOut_20_1 = var2;
                    stackIn_26_0 = stackOut_20_0;
                    stackIn_26_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (var4 != 0) {
                      break L11;
                    } else {
                      L13: {
                        if (stackIn_21_0 == stackIn_21_1) {
                          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gr.field_h, 0);
                          var2 = 0;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      if (var4 == 0) {
                        continue L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                stackOut_25_0 = -1;
                stackOut_25_1 = var2 ^ -1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                break L11;
              }
              L14: {
                if (stackIn_26_0 <= stackIn_26_1) {
                  break L14;
                } else {
                  jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gr.field_h, 0);
                  var2 = 0;
                  break L14;
                }
              }
              L15: while (true) {
                L16: {
                  L17: {
                    if (this.field_fc.a((byte) -78)) {
                      break L17;
                    } else {
                      var8 = (ge) ((Object) this.field_fc.c(9));
                      incrementValue$7 = var2;
                      var2++;
                      gr.field_h[incrementValue$7] = (int)var8.field_h;
                      this.field_V = this.field_V - var8.field_m;
                      stackOut_30_0 = 1000;
                      stackOut_30_1 = var2;
                      stackIn_35_0 = stackOut_30_0;
                      stackIn_35_1 = stackOut_30_1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      if (var4 != 0) {
                        break L16;
                      } else {
                        L18: {
                          if (stackIn_31_0 != stackIn_31_1) {
                            break L18;
                          } else {
                            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gr.field_h, 0);
                            var2 = 0;
                            break L18;
                          }
                        }
                        if (var4 == 0) {
                          continue L15;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  stackOut_34_0 = -1;
                  stackOut_34_1 = var2 ^ -1;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L16;
                }
                L19: {
                  if (stackIn_35_0 > stackIn_35_1) {
                    jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gr.field_h, 0);
                    var2 = 0;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: while (true) {
                  L21: {
                    L22: {
                      L23: {
                        L24: {
                          L25: {
                            L26: {
                              if (this.field_fb.a((byte) -119)) {
                                break L26;
                              } else {
                                var9 = (ge) ((Object) this.field_fb.c(9));
                                jaggl.OpenGL.glDeleteLists((int)var9.field_h, var9.field_m);
                                if (var4 != 0) {
                                  break L25;
                                } else {
                                  if (var4 == 0) {
                                    continue L20;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            L27: while (true) {
                              if (this.field_qb.a((byte) -124)) {
                                break L25;
                              } else {
                                var10 = this.field_qb.c(9);
                                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_h);
                                if (var4 != 0) {
                                  break L23;
                                } else {
                                  if (var4 == 0) {
                                    continue L27;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                          }
                          break L24;
                        }
                        L28: while (true) {
                          if (this.field_cc.a((byte) -67)) {
                            break L23;
                          } else {
                            var11 = this.field_cc.c(9);
                            jaggl.OpenGL.glDeleteObjectARB(var11.field_h);
                            if (var4 != 0) {
                              break L21;
                            } else {
                              if (var4 == 0) {
                                continue L28;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                      }
                      break L22;
                    }
                    L29: while (true) {
                      L30: {
                        if (this.field_fb.a((byte) -96)) {
                          break L30;
                        } else {
                          var12 = (ge) ((Object) this.field_fb.c(9));
                          jaggl.OpenGL.glDeleteLists((int)var12.field_h, var12.field_m);
                          if (var4 != 0) {
                            break L21;
                          } else {
                            if (var4 == 0) {
                              continue L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      this.field_Pb.a(122);
                      break L21;
                    }
                  }
                  L31: {
                    if (100663296 >= this.e((byte) 7)) {
                      break L31;
                    } else {
                      if (wq.a(-64) > this.field_vc - -60000L) {
                        System.gc();
                        this.field_vc = wq.a(-78);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                  }
                  this.field_Ac = param0;
                  return;
                }
              }
            }
          }
        }
    }

    final fk a(int param0, boolean param1, byte param2, int param3, byte[] param4) {
        RuntimeException var6 = null;
        hn stackIn_7_0 = null;
        sl stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hn stackOut_6_0 = null;
        sl stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -23) {
                break L1;
              } else {
                this.field_jb = -14;
                break L1;
              }
            }
            L2: {
              if (!this.field_J) {
                break L2;
              } else {
                L3: {
                  if (!param1) {
                    break L3;
                  } else {
                    if (this.field_K) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = new hn((fr) (this), param0, param4, param3, param1);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackOut_8_0 = new sl((fr) (this), param0, param4, param3);
            stackIn_9_0 = stackOut_8_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("fr.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fk) ((Object) stackIn_7_0);
        } else {
          return (fk) ((Object) stackIn_9_0);
        }
    }

    final void e(int param0, int param1) {
        lu.field_g[0] = (float)eb.a(param1, 16711680) / 16711680.0f;
        lu.field_g[2] = (float)eb.a(255, param1) / 255.0f;
        lu.field_g[1] = (float)eb.a(65280, param1) / 65280.0f;
        lu.field_g[3] = (float)(param1 >>> 2030469848) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, lu.field_g, param0);
    }

    final void a(mw param0, int param1) {
        int fieldTemp$2 = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_B) {
                  break L2;
                } else {
                  this.b(30369, param0);
                  this.a(4608, param0);
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (this.field_Jb < 3) {
                L3: {
                  if (0 > this.field_Jb) {
                    break L3;
                  } else {
                    this.field_dc[this.field_Jb].e(-65);
                    break L3;
                  }
                }
                fieldTemp$2 = this.field_Jb + 1;
                this.field_Jb = this.field_Jb + 1;
                this.field_dc[fieldTemp$2] = param0;
                this.field_Fb = param0;
                this.field_hc = param0;
                this.field_hc.b(30352);
                break L1;
              } else {
                throw new RuntimeException();
              }
            }
            L4: {
              if (param1 < -70) {
                break L4;
              } else {
                this.field_R = true;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("fr.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (param0 != this.field_sc) {
              break L1;
            } else {
              if ((this.field_Cb ^ -1) == (param1 ^ -1)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            this.field_sc = param0;
            this.field_Cb = param1;
            this.o(770);
            this.i(3089);
            if ((this.field_Q ^ -1) == -4) {
              break L2;
            } else {
              L3: {
                if ((this.field_Q ^ -1) != -3) {
                  break L3;
                } else {
                  this.b((byte) -110);
                  if (!Sumoblitz.field_L) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              break L0;
            }
          }
          this.p(-15048);
          break L0;
        }
    }

    private final void i(byte param0) {
        cs discarded$13 = null;
        int var2 = 9 / ((param0 - 14) / 61);
        this.field_ib = new ht[this.field_T];
        this.field_n = new us((fr) (this), 3553, 6408, 1, 1);
        us discarded$0 = new us((fr) (this), 3553, 6408, 1, 1);
        us discarded$1 = new us((fr) (this), 3553, 6408, 1, 1);
        lf discarded$2 = new lf((fr) (this));
        lf discarded$3 = new lf((fr) (this));
        lf discarded$4 = new lf((fr) (this));
        lf discarded$5 = new lf((fr) (this));
        lf discarded$6 = new lf((fr) (this));
        lf discarded$7 = new lf((fr) (this));
        lf discarded$8 = new lf((fr) (this));
        lf discarded$9 = new lf((fr) (this));
        lf discarded$10 = new lf((fr) (this));
        lf discarded$12 = new lf((fr) (this));
        if (this.field_xc) {
            this.field_G = new cs((fr) (this));
            discarded$13 = new cs((fr) (this));
        }
    }

    final void a(byte param0, mw param1) {
        int fieldTemp$3 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var3_int = -102 % ((62 - param0) / 55);
                  if (!this.field_B) {
                    break L3;
                  } else {
                    this.c(param1, 71);
                    this.b(param1, -963075224);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (this.field_Jb < 0) {
                    break L4;
                  } else {
                    if (this.field_dc[this.field_Jb] == param1) {
                      L5: {
                        fieldTemp$3 = this.field_Jb;
                        this.field_Jb = this.field_Jb - 1;
                        this.field_dc[fieldTemp$3] = null;
                        param1.e(-98);
                        if (-1 >= (this.field_Jb ^ -1)) {
                          break L5;
                        } else {
                          this.field_Fb = null;
                          this.field_hc = null;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_Fb = this.field_dc[this.field_Jb];
                      this.field_hc = this.field_dc[this.field_Jb];
                      this.field_hc.b(30352);
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                throw new RuntimeException();
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("fr.SB(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    private final void a(boolean param0, int param1, byte param2) {
        if (param2 > -65) {
            return;
        }
        this.a(param1, 118, true, param0);
    }

    private final void t(int param0) {
        if (param0 != this.field_Q) {
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glLoadIdentity();
            if ((this.field_Z ^ -1) < -1) {
                if (-1 > (this.field_Ec ^ -1)) {
                    jaggl.OpenGL.glOrtho(0.0, (double)this.field_Z, (double)this.field_Ec, 0.0, -1.0, 1.0);
                }
            }
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            this.field_Q = 1;
            this.field_nb = this.field_nb & -25;
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          if (-1 >= (param2 ^ -1)) {
            break L0;
          } else {
            param2 = -param2;
            break L0;
          }
        }
        if ((this.field_yc ^ -1) < (param0 - -param2 ^ -1)) {
          return;
        } else {
          L1: {
            if (-param2 + param0 > this.field_jb) {
              break L1;
            } else {
              if (param1 - -param2 < this.field_Wb) {
                break L1;
              } else {
                if ((this.field_Eb ^ -1) <= (param1 - param2 ^ -1)) {
                  this.k((byte) 127);
                  this.c(25189, param4);
                  jaggl.OpenGL.glColor4ub((byte)(param3 >> -909999984), (byte)(param3 >> -1160176568), (byte)param3, (byte)(param3 >> 1717235000));
                  if (-2 <= (param2 ^ -1)) {
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glVertex2f((float)(param0 + 1), (float)(param1 - -1));
                    jaggl.OpenGL.glVertex2f((float)(param0 + 1), (float)(param1 - 1));
                    jaggl.OpenGL.glVertex2f((float)(-1 + param0), (float)(param1 + -1));
                    jaggl.OpenGL.glVertex2f((float)(-1 + param0), (float)(param1 + 1));
                    jaggl.OpenGL.glEnd();
                    return;
                  } else {
                    L2: {
                      L3: {
                        var6 = 0.3499999940395355f + (float)param0;
                        var7 = (float)param1 + 0.3499999940395355f;
                        jaggl.OpenGL.glBegin(2);
                        var8 = 262144 / (6 * param2);
                        if (64 >= var8) {
                          break L3;
                        } else {
                          if (-513 <= (var8 ^ -1)) {
                            break L2;
                          } else {
                            var8 = 512;
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var8 = 64;
                      break L2;
                    }
                    var8 = jo.a(var8, false);
                    jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
                    var9 = 16384 - var8;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var9 <= 0) {
                            break L6;
                          } else {
                            jaggl.OpenGL.glVertex2f((float)param2 * dh.field_M[var9] + var6, dh.field_N[var9] * (float)param2 + var7);
                            var9 = var9 - var8;
                            if (var10 != 0) {
                              break L5;
                            } else {
                              if (var10 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        jaggl.OpenGL.glEnd();
                        break L5;
                      }
                      return;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    final int d(int param0, int param1) {
        L0: {
          if (param1 <= -6) {
            break L0;
          } else {
            this.field_K = false;
            break L0;
          }
        }
        if ((param0 ^ -1) == -6407) {
          return 1;
        } else {
          if (6409 != param0) {
            L1: {
              if (param0 == 6410) {
                break L1;
              } else {
                if (-34847 == (param0 ^ -1)) {
                  break L1;
                } else {
                  if (param0 != 34844) {
                    if (6407 != param0) {
                      L2: {
                        if (-6409 == (param0 ^ -1)) {
                          break L2;
                        } else {
                          if (param0 == 34847) {
                            break L2;
                          } else {
                            if ((param0 ^ -1) == -34844) {
                              return 6;
                            } else {
                              if (param0 == 34842) {
                                return 8;
                              } else {
                                if ((param0 ^ -1) == -6403) {
                                  return 3;
                                } else {
                                  if (-6402 != (param0 ^ -1)) {
                                    throw new IllegalArgumentException("");
                                  } else {
                                    return 1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      return 4;
                    } else {
                      return 3;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            return 2;
          } else {
            return 1;
          }
        }
    }

    final hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        cm stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cm stackOut_0_0 = null;
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
            stackOut_0_0 = new cm((fr) (this), param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("fr.TB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (hr) ((Object) stackIn_1_0);
    }

    final void a(hr param0, boolean param1) {
        RuntimeException var3 = null;
        wh var3_ref = null;
        kf var3_ref2 = null;
        pj var4 = null;
        int var6 = 0;
        wh var7 = null;
        wh var8 = null;
        kf var9 = null;
        kf var10 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_Tb = (cm) ((Object) param0);
              if (this.field_xc) {
                L2: {
                  if (null != this.field_H) {
                    break L2;
                  } else {
                    this.field_H = new cs((fr) (this));
                    break L2;
                  }
                }
                if (this.field_Fb == this.field_H) {
                  throw new RuntimeException();
                } else {
                  L3: {
                    this.a(this.field_H, -125);
                    if (param1) {
                      L4: {
                        L5: {
                          var3_ref2 = (kf) ((Object) this.field_nc.a(127, (long)(this.field_Tb.c() << -218281392 | this.field_Tb.a())));
                          if (var3_ref2 != null) {
                            break L5;
                          } else {
                            var9 = new kf((fr) (this), 6402, this.field_Tb.c(), this.field_Tb.a());
                            var3_ref2 = var9;
                            this.field_ic = this.field_ic + var9.field_s;
                            L6: while (true) {
                              L7: {
                                if (-2097153 <= (this.field_ic ^ -1)) {
                                  break L7;
                                } else {
                                  var4 = this.field_Db.c((byte) 126);
                                  if (var6 != 0) {
                                    break L4;
                                  } else {
                                    if (var4 == null) {
                                      break L7;
                                    } else {
                                      var10 = (kf) ((Object) var4);
                                      var10.c(-5106);
                                      var10.b(false);
                                      var10.g(-127);
                                      this.field_ic = this.field_ic - var10.field_s;
                                      if (var6 == 0) {
                                        continue L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_nc.a(var9, -1, (long)(this.field_Tb.c() << 462343888 | this.field_Tb.a()));
                              break L5;
                            }
                          }
                        }
                        this.field_Db.a(var3_ref2, -4);
                        break L4;
                      }
                      this.field_H.a(var3_ref2, 8, -14269);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_H.a(this.field_Tb.field_g, -4610, 0);
                  break L1;
                }
              } else {
                L8: {
                  if (!this.field_Gc) {
                    break L8;
                  } else {
                    L9: {
                      L10: {
                        var3_ref = (wh) ((Object) this.field_nc.a(117, (long)(this.field_Tb.c() << -904794352 | this.field_Tb.a())));
                        if (var3_ref == null) {
                          var7 = new wh((fr) (this), this.field_Tb.c(), this.field_Tb.a());
                          var3_ref = var7;
                          this.field_ic = this.field_ic + var7.field_v * 4;
                          L11: while (true) {
                            L12: {
                              if (this.field_ic <= 2097152) {
                                break L12;
                              } else {
                                var4 = this.field_Db.c((byte) 126);
                                if (var6 != 0) {
                                  break L9;
                                } else {
                                  if (var4 == null) {
                                    break L12;
                                  } else {
                                    var8 = (wh) ((Object) var4);
                                    var8.c(-5106);
                                    var8.b(false);
                                    this.field_y.releasePbuffer(var8.e(-99));
                                    this.field_ic = this.field_ic - var8.field_v;
                                    if (var6 == 0) {
                                      continue L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            this.field_nc.a(var7, -1, (long)(this.field_Tb.c() << 999637776 | this.field_Tb.a()));
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      this.field_Db.a(var3_ref, -4);
                      this.field_y.setPbuffer(var3_ref.e(-106));
                      break L9;
                    }
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            }
            this.field_Z = param0.c();
            this.field_Ec = param0.a();
            this.g((byte) -81);
            this.h((byte) -98);
            this.j(-1303);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var3);
            stackOut_33_1 = new StringBuilder().append("fr.MF(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L13;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
    }

    final void a(fk param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0 == this.field_zc) {
                break L1;
              } else {
                L2: {
                  if (!this.field_J) {
                    break L2;
                  } else {
                    jaggl.OpenGL.glBindBufferARB(34962, param0.a(2721));
                    break L2;
                  }
                }
                this.field_zc = param0;
                break L1;
              }
            }
            L3: {
              if (param1 <= -110) {
                break L3;
              } else {
                this.field_Tb = (cm) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("fr.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        jaggl.OpenGL.glViewport(this.field_pc, this.field_bb, this.field_Z, this.field_Ec);
        if (param0 >= -16) {
            this.field_qb = (jn) null;
        }
    }

    private final int e(byte param0) {
        if (param0 != 7) {
            this.field_vb = true;
        }
        return this.field_V + (this.field_p + this.field_Xb);
    }

    private final void a(int param0, mw param1) {
        int fieldTemp$0 = 0;
        if (param0 != 4608) {
            return;
        }
        try {
            if ((this.field_w ^ -1) <= -4) {
                throw new RuntimeException();
            }
            if (!(-1 < (this.field_w ^ -1))) {
                this.field_Hc[this.field_w].a(false);
            }
            fieldTemp$0 = this.field_w + 1;
            this.field_w = this.field_w + 1;
            this.field_Hc[fieldTemp$0] = param1;
            this.field_Fb = param1;
            this.field_Fb.d(param0 ^ 4725);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fr.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int i() {
        return this.field_sc;
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 25189) {
            break L0;
          } else {
            this.field_pb = (jaclib.memory.heap.NativeHeap) null;
            break L0;
          }
        }
        L1: {
          if (param1 == this.field_Ab) {
            break L1;
          } else {
            L2: {
              L3: {
                if (1 == param1) {
                  break L3;
                } else {
                  L4: {
                    if (2 != param1) {
                      break L4;
                    } else {
                      var3 = 1;
                      var5 = 2;
                      var4 = 0;
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if ((param1 ^ -1) != -129) {
                      break L5;
                    } else {
                      var5 = 3;
                      var4 = 1;
                      var3 = 1;
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 = 1;
                  var4 = 0;
                  var5 = 0;
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = 1;
              var3 = 1;
              var5 = 1;
              break L2;
            }
            L6: {
              if ((this.field_tb ? 1 : 0) == var3) {
                break L6;
              } else {
                L7: {
                  jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
                  stackOut_11_0 = this;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var3 == 0) {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L7;
                  } else {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    break L7;
                  }
                }
                ((fr) (this)).field_tb = stackIn_14_1 != 0;
                break L6;
              }
            }
            L8: {
              if (this.field_A) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L8;
              } else {
                stackOut_16_0 = 1;
                stackIn_18_0 = stackOut_16_0;
                break L8;
              }
            }
            L9: {
              stackOut_18_0 = stackIn_18_0;
              stackIn_20_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (var4 != 0) {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L9;
              } else {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                break L9;
              }
            }
            L10: {
              if (stackIn_21_0 != stackIn_21_1) {
                L11: {
                  L12: {
                    if (var4 == 0) {
                      break L12;
                    } else {
                      jaggl.OpenGL.glEnable(3008);
                      if (var6 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  jaggl.OpenGL.glDisable(3008);
                  break L11;
                }
                L13: {
                  stackOut_27_0 = this;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (var4 == 0) {
                    stackOut_29_0 = this;
                    stackOut_29_1 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    break L13;
                  } else {
                    stackOut_28_0 = this;
                    stackOut_28_1 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    break L13;
                  }
                }
                ((fr) (this)).field_A = stackIn_30_1 != 0;
                break L10;
              } else {
                break L10;
              }
            }
            L14: {
              if (var5 == this.field_zb) {
                break L14;
              } else {
                L15: {
                  L16: {
                    if (-2 == (var5 ^ -1)) {
                      break L16;
                    } else {
                      L17: {
                        if (2 != var5) {
                          break L17;
                        } else {
                          jaggl.OpenGL.glEnable(3042);
                          jaggl.OpenGL.glBlendFunc(1, 1);
                          if (var6 == 0) {
                            break L15;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        if (var5 == 3) {
                          break L18;
                        } else {
                          jaggl.OpenGL.glDisable(3042);
                          if (var6 == 0) {
                            break L15;
                          } else {
                            break L18;
                          }
                        }
                      }
                      jaggl.OpenGL.glEnable(3042);
                      jaggl.OpenGL.glBlendFunc(774, 1);
                      if (var6 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  jaggl.OpenGL.glEnable(3042);
                  jaggl.OpenGL.glBlendFunc(770, 771);
                  break L15;
                }
                this.field_zb = var5;
                break L14;
              }
            }
            this.field_Ab = param1;
            this.field_nb = this.field_nb & -29;
            break L1;
          }
        }
    }

    private final void b(boolean param0) {
        vc discarded$2 = null;
        L0: {
          if (param0) {
            break L0;
          } else {
            discarded$2 = this.a((bu) null, (nr) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (!this.field_Bb) {
                break L3;
              } else {
                if (!this.field_rc) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            jaggl.OpenGL.glDisable(2896);
            if (!Sumoblitz.field_L) {
              break L1;
            } else {
              break L2;
            }
          }
          jaggl.OpenGL.glEnable(2896);
          break L1;
        }
    }

    private final void m(int param0) {
        if (param0 >= -116) {
            this.h(80);
        }
    }

    final void e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (!this.field_ec) {
          return;
        } else {
          L0: {
            if (0 >= this.field_Z) {
              break L0;
            } else {
              if ((this.field_Ec ^ -1) < -1) {
                var1 = this.field_yc;
                var2 = this.field_jb;
                var3 = this.field_Wb;
                var4 = this.field_Eb;
                this.j(-1303);
                jaggl.OpenGL.glReadBuffer(1028);
                jaggl.OpenGL.glDrawBuffer(1029);
                this.g((byte) -81);
                this.d(3, false);
                this.b(-119, false);
                this.a(108, false);
                this.a(false, (byte) -115);
                this.a(83, (ht) null);
                this.a((byte) 124, -2);
                this.c(1, true);
                this.c(25189, 0);
                jaggl.OpenGL.glMatrixMode(5889);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                jaggl.OpenGL.glMatrixMode(5888);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glRasterPos2i(0, 0);
                jaggl.OpenGL.glCopyPixels(0, 0, this.field_Z, this.field_Ec, 6144);
                jaggl.OpenGL.glFlush();
                jaggl.OpenGL.glReadBuffer(1029);
                jaggl.OpenGL.glDrawBuffer(1029);
                this.KA(var1, var3, var2, var4);
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    final void GA(int param0) {
        this.c(25189, 0);
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 1986867960) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    private final void a(int param0, int param1, boolean param2, boolean param3) {
        int discarded$1 = 0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wm var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          L1: {
            if ((this.field_wc ^ -1) != (param0 ^ -1)) {
              break L1;
            } else {
              L2: {
                if (this.field_uc) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L2;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  break L2;
                }
              }
              if (stackIn_4_0 != (this.field_gb ? 1 : 0)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            var5 = null;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (!this.field_uc) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L3;
            } else {
              stackOut_6_0 = 3;
              stackIn_8_0 = stackOut_6_0;
              break L3;
            }
          }
          L4: {
            var9 = stackIn_8_0;
            if ((param0 ^ -1) > -1) {
              this.c(false);
              break L4;
            } else {
              L5: {
                L6: {
                  L7: {
                    var5 = this.field_Pb.a(0, param0);
                    var10 = this.field_h.a(-29193, param0);
                    if (var10.field_c != 0) {
                      break L7;
                    } else {
                      if (var10.field_u == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var10.field_n) {
                      stackOut_14_0 = 64;
                      stackIn_15_0 = stackOut_14_0;
                      break L8;
                    } else {
                      stackOut_13_0 = 128;
                      stackIn_15_0 = stackOut_13_0;
                      break L8;
                    }
                  }
                  var11 = stackIn_15_0;
                  var12 = 50 * var11;
                  this.a((float)(var10.field_u * (this.field_Ac % var12)) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_Ac % var12)) / (float)var12, 32151);
                  if (!Sumoblitz.field_L) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
                this.c(false);
                break L5;
              }
              L9: {
                if (this.field_uc) {
                  break L9;
                } else {
                  var9 = var10.field_d;
                  var8 = var10.field_h;
                  var7 = var10.field_j;
                  break L9;
                }
              }
              var6 = var10.field_q;
              break L4;
            }
          }
          L10: {
            this.field_Kb.a(param2, var8, 125, var7, param3, var9);
            if (!this.field_Kb.a(var6, (byte) 71, (ht) (var5))) {
              this.a(103, (ht) (var5));
              this.c(var6, true);
              break L10;
            } else {
              break L10;
            }
          }
          this.field_gb = this.field_uc;
          this.field_wc = param0;
          break L0;
        }
        L11: {
          this.field_nb = this.field_nb & -8;
          if (param1 > 109) {
            break L11;
          } else {
            discarded$1 = this.b(-42, (byte) -3);
            break L11;
          }
        }
    }

    private final void b(mw param0, int param1) {
        int fieldTemp$2 = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_w < 0) {
                break L1;
              } else {
                if (this.field_Hc[this.field_w] != param0) {
                  break L1;
                } else {
                  L2: {
                    if (param1 == -963075224) {
                      break L2;
                    } else {
                      this.field_ac = -0.3817848265171051f;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      fieldTemp$2 = this.field_w;
                      this.field_w = this.field_w - 1;
                      this.field_Hc[fieldTemp$2] = null;
                      param0.a(false);
                      if (-1 < (this.field_w ^ -1)) {
                        break L4;
                      } else {
                        this.field_Fb = this.field_Hc[this.field_w];
                        this.field_Fb.d(param1 + 963075341);
                        if (!Sumoblitz.field_L) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_Fb = null;
                    break L3;
                  }
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("fr.AB(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          if (param1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (this.field_x) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          if (stackIn_6_0 != stackIn_6_1) {
            L3: {
              L4: {
                if (!param1) {
                  break L4;
                } else {
                  jaggl.OpenGL.glEnable(2929);
                  if (!Sumoblitz.field_L) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              jaggl.OpenGL.glDisable(2929);
              break L3;
            }
            L5: {
              stackOut_12_0 = this;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (!param1) {
                stackOut_14_0 = this;
                stackOut_14_1 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L5;
              } else {
                stackOut_13_0 = this;
                stackOut_13_1 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                break L5;
              }
            }
            ((fr) (this)).field_x = stackIn_15_1 != 0;
            this.field_nb = this.field_nb & -32;
            break L2;
          } else {
            break L2;
          }
        }
        L6: {
          if (param0 > 52) {
            break L6;
          } else {
            this.field_oc = (jn) null;
            break L6;
          }
        }
    }

    private final void i(int param0) {
        this.field_Lb = (float)(-this.field_lc + this.field_Cb) - this.field_l;
        this.field_bc = -((float)this.field_kc * this.field_ub) + this.field_Lb;
        if (!(this.field_bc >= (float)this.field_sc)) {
            this.field_bc = (float)this.field_sc;
        }
        jaggl.OpenGL.glFogf(2915, this.field_bc);
        if (param0 != 3089) {
            return;
        }
        jaggl.OpenGL.glFogf(2916, this.field_Lb);
        lu.field_g[1] = (float)eb.a(this.field_P, 65280) / 65280.0f;
        lu.field_g[2] = (float)eb.a(255, this.field_P) / 255.0f;
        lu.field_g[0] = (float)eb.a(this.field_P, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, lu.field_g, 0);
    }

    static {
        field_lb = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
