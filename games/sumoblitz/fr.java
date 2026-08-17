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
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        int var5_int = 0;
        NumberFormatException var5 = null;
        int var6 = 0;
        int[] var9 = null;
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
          var3 = jaggl.OpenGL.glGetString(7938);
          var4 = cn.a(' ', var3.replace('.', ' '), -27224);
          if (param0 <= var4.length) {
            try {
              L4: {
                var5_int = no.a((byte) -128, (CharSequence) ((Object) var4[0]));
                var6 = no.a((byte) -127, (CharSequence) ((Object) var4[1]));
                this.field_Yb = var5_int * 10 + var6;
                break L4;
              }
            } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var5 = (NumberFormatException) (Object) decompiledCaughtException;
                var2 = var2 | 4;
                break L5;
              }
            }
            break L3;
          } else {
            var2 = var2 | 4;
            break L3;
          }
        }
        L6: {
          if (-13 >= (this.field_Yb ^ -1)) {
            break L6;
          } else {
            var2 = var2 | 2;
            break L6;
          }
        }
        L7: {
          if (!this.field_y.a("GL_ARB_multitexture")) {
            var2 = var2 | 8;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (this.field_y.a("GL_ARB_texture_env_combine")) {
            break L8;
          } else {
            var2 = var2 | 32;
            break L8;
          }
        }
        L9: {
          L10: {
            var9 = new int[1];
            jaggl.OpenGL.glGetIntegerv(34018, var9, 0);
            this.field_T = var9[0];
            jaggl.OpenGL.glGetIntegerv(34929, var9, 0);
            this.field_Ub = var9[0];
            jaggl.OpenGL.glGetIntegerv(34930, var9, 0);
            this.field_xb = var9[0];
            if (-3 < (this.field_T ^ -1)) {
              break L10;
            } else {
              if (-3 < (this.field_Ub ^ -1)) {
                break L10;
              } else {
                if ((this.field_xb ^ -1) <= -3) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
          }
          var2 = var2 | 16;
          break L9;
        }
        L11: {
          this.field_R = jaclib.memory.Stream.b();
          this.field_Gc = this.field_y.arePbuffersAvailable();
          this.field_J = this.field_y.a("GL_ARB_vertex_buffer_object");
          this.field_hb = this.field_y.a("GL_ARB_multisample");
          this.field_Ib = this.field_y.a("GL_ARB_vertex_program");
          this.field_y.a("GL_ARB_fragment_program");
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
            stackIn_26_0 = var2;
            break L11;
          } else {
            stackIn_26_0 = 0;
            break L11;
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
        int incrementValue$1 = 0;
        int var2;
        int var3;
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
          if (!this.field_y.b()) {
            incrementValue$1 = var2;
            var2++;
            if ((incrementValue$1 ^ -1) < -6) {
              throw new RuntimeException("");
            } else {
              tg.a(1000L, (byte) 87);
              continue L1;
            }
          } else {
            return;
          }
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
        java.awt.Dimension var2;
        L0: {
          if (this.field_ab != null) {
            var2 = this.field_ab.getSize();
            this.field_s = var2.width;
            this.field_I = var2.height;
            break L0;
          } else {
            this.field_s = 0;
            this.field_I = 0;
            break L0;
          }
        }
        L1: {
          if (null == this.field_Fb) {
            this.field_Ec = this.field_I;
            this.field_Z = this.field_s;
            this.h((byte) -55);
            break L1;
          } else {
            break L1;
          }
        }
        this.g((byte) -81);
        if (!param0) {
          return;
        } else {
          this.j(-1303);
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
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_qc < 0) {
                break L1;
              } else {
                if (this.field_m[this.field_qc] == param0) {
                  fieldTemp$1 = this.field_qc;
                  this.field_qc = this.field_qc - 1;
                  this.field_m[fieldTemp$1] = null;
                  if (param1 >= 68) {
                    L2: {
                      param0.a(-20745);
                      if (-1 < (this.field_qc ^ -1)) {
                        this.field_hc = null;
                        break L2;
                      } else {
                        this.field_hc = this.field_m[this.field_qc];
                        this.field_hc.c(195);
                        break L2;
                      }
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("fr.QB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = new qh((fr) (this), param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("fr.DF(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
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
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                  if (param1 == null) {
                    jaggl.OpenGL.glDisable(var3.field_c);
                    break L3;
                  } else {
                    L4: {
                      if (var3 == null) {
                        jaggl.OpenGL.glEnable(param1.field_c);
                        break L4;
                      } else {
                        if (param1.field_c == var3.field_c) {
                          break L4;
                        } else {
                          jaggl.OpenGL.glDisable(var3.field_c);
                          jaggl.OpenGL.glEnable(param1.field_c);
                          break L4;
                        }
                      }
                    }
                    jaggl.OpenGL.glBindTexture(param1.field_c, param1.c(-113));
                    break L3;
                  }
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
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (runtimeException);

            stackIn_17_1 = new StringBuilder().append("fr.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final int b(int param0, byte param1) {
        mw var4;
        L0: {
          if (param1 == -14) {
            break L0;
          } else {
            var4 = (mw) null;
            this.a((byte) 16, (mw) null);
            break L0;
          }
        }
        if ((param0 ^ -1) != -2) {
          if (-1 != (param0 ^ -1)) {
            if ((param0 ^ -1) != -3) {
              if (-4 != (param0 ^ -1)) {
                if ((param0 ^ -1) == -5) {
                  return 34023;
                } else {
                  throw new IllegalArgumentException();
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
        } else {
          return 7681;
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
            hr var3 = (hr) null;
            this.a((hr) null, true);
        }
    }

    private final void n(int param0) {
        int stackIn_6_0 = 0;
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        jaggl.OpenGL.glDepthMask(stackIn_6_0 != 0);
    }

    fr(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        long dupTemp$4 = 0L;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        Throwable var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        Throwable var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        String var10 = null;
        Exception var11 = null;
        String var13 = null;
        int[] var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        CharSequence var21 = null;
        CharSequence var22 = null;
        CharSequence var23 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        this.field_Gb = new Hashtable();
        this.field_X = 128;
        this.field_O = new ic();
        dl discarded$0 = new dl();
        dl discarded$1 = new dl();
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
        dl discarded$2 = new dl();
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
        cw discarded$3 = new cw(8192);
        try {
          L0: {
            this.field_Bc = param2;
            this.field_ab = param0;
            if (mc.b((byte) -107, "jaclib")) {
              if (mc.b((byte) 97, "jaggl")) {
                try {
                  L1: {
                    this.field_y = new jaggl.OpenGL();
                    dupTemp$4 = this.field_y.init(param0, 8, 8, 8, 24, 0, this.field_Bc);
                    this.field_ob = dupTemp$4;
                    this.field_rb = dupTemp$4;
                    if ((this.field_ob ^ -1L) != -1L) {
                      this.c((byte) 117);
                      var4_int = this.d(2);
                      if (0 == var4_int) {
                        L2: {
                          stackIn_11_0 = this;

                          if (this.field_R) {
                            stackIn_12_0 = this;
                            stackIn_12_1 = 33639;
                            break L2;
                          } else {
                            stackIn_12_0 = this;
                            stackIn_12_1 = 5121;
                            break L2;
                          }
                        }
                        L3: {
                          ((fr) (this)).field_L = stackIn_12_1;
                          if (-1 == this.field_Dc.indexOf("radeon")) {
                            break L3;
                          } else {
                            var5_int = 0;
                            var6 = 0;
                            var7 = 0;
                            var8 = cn.a(' ', this.field_Dc.replace('/', ' '), -27224);
                            var9 = 0;
                            L4: while (true) {
                              L5: {
                                if (var8.length <= var9) {
                                  break L5;
                                } else {
                                  var13 = var8[var9];
                                  var10 = var13;
                                  var10 = var13;
                                  var10 = var13;
                                  try {
                                    L6: {
                                      L7: {
                                        if (-1 > (var13.length() ^ -1)) {
                                          L8: {
                                            if (var13.charAt(0) != 120) {
                                              break L8;
                                            } else {
                                              if (3 > var13.length()) {
                                                break L8;
                                              } else {
                                                var21 = (CharSequence) ((Object) var13.substring(1, 3));
                                                if (!jf.a(-13181, var21)) {
                                                  break L8;
                                                } else {
                                                  var7 = 1;
                                                  var10 = var13.substring(1);
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                          if (var10.equals("hd")) {
                                            var6 = 1;
                                            break L7;
                                          } else {
                                            L9: {
                                              if (!var10.startsWith("hd")) {
                                                break L9;
                                              } else {
                                                var10 = var10.substring(2);
                                                var6 = 1;
                                                break L9;
                                              }
                                            }
                                            if (4 > var10.length()) {
                                              break L7;
                                            } else {
                                              var22 = (CharSequence) ((Object) var10.substring(0, 4));
                                              if (!jf.a(-13181, var22)) {
                                                break L7;
                                              } else {
                                                var23 = (CharSequence) ((Object) var10.substring(0, 4));
                                                var5_int = no.a((byte) -128, var23);
                                                decompiledRegionSelector0 = 1;
                                                break L6;
                                              }
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      decompiledRegionSelector0 = 0;
                                      break L6;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L10: {
                                      var11 = (Exception) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 0;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var9++;
                                    continue L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L11: {
                                if (var7 != 0) {
                                  break L11;
                                } else {
                                  if (var6 != 0) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (7000 > var5_int) {
                                        break L12;
                                      } else {
                                        if (var5_int > 7999) {
                                          break L12;
                                        } else {
                                          this.field_J = false;
                                          break L12;
                                        }
                                      }
                                    }
                                    if ((var5_int ^ -1) > -7001) {
                                      break L11;
                                    } else {
                                      if (var5_int > 9250) {
                                        break L11;
                                      } else {
                                        this.field_Ic = false;
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                              L13: {
                                L14: {
                                  if (var6 == 0) {
                                    break L14;
                                  } else {
                                    if (var5_int >= 4000) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                this.field_Hb = false;
                                break L13;
                              }
                              this.field_C = this.field_C & this.field_y.a("GL_ARB_half_float_pixel");
                              this.field_K = this.field_J;
                              break L3;
                            }
                          }
                        }
                        L15: {
                          if (this.field_E.indexOf("intel") == -1) {
                            break L15;
                          } else {
                            this.field_xc = false;
                            break L15;
                          }
                        }
                        L16: {
                          stackIn_50_0 = this;

                          if (this.field_E.equals("s3 graphics")) {
                            stackIn_51_0 = this;
                            stackIn_51_1 = 0;
                            break L16;
                          } else {
                            stackIn_51_0 = this;
                            stackIn_51_1 = 1;
                            break L16;
                          }
                        }
                        L17: {
                          ((fr) (this)).field_ec = stackIn_51_1 != 0;
                          if (this.field_J) {
                            try {
                              L18: {
                                var17 = new int[1];
                                jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
                                break L18;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              var5 = decompiledCaughtException;
                              throw new RuntimeException("");
                            }
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L19: {
                          kr.a(true, -107, false);
                          this.field_jc = true;
                          this.field_Pb = new kk((fr) (this), this.field_h);
                          this.i((byte) -93);
                          this.field_Sb = new b((fr) (this));
                          this.field_D = new eb((fr) (this));
                          if (!this.field_D.a(550267135)) {
                            break L19;
                          } else {
                            this.field_U = new gq((fr) (this));
                            if (this.field_U.d(-8111)) {
                              break L19;
                            } else {
                              this.field_U.c(50);
                              this.field_U = null;
                              break L19;
                            }
                          }
                        }
                        this.field_Kb = new iv((fr) (this));
                        this.l(0);
                        this.d(true);
                        this.e();
                        break L1;
                      } else {
                        throw new RuntimeException("");
                      }
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var4 = decompiledCaughtException;
                  var4.printStackTrace();
                  this.d();
                  throw new RuntimeException("");
                }
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          L20: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_64_0 = (RuntimeException) (var4_ref);

            stackIn_64_1 = new StringBuilder().append("fr.<init>(");

            if (param0 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L20;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_67_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');

            if (param1 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L21;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L21;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_65_0), stackIn_68_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        if (param0 != 20685) {
          return;
        } else {
          L0: {
            if (-1 != (this.field_Vb ^ -1)) {
              jaggl.OpenGL.glTexEnvi(8960, 34161, param2);
              jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
              break L0;
            } else {
              L1: {
                var4 = 0;
                if (param2 != this.field_gc) {
                  jaggl.OpenGL.glTexEnvi(8960, 34161, param2);
                  this.field_gc = param2;
                  var4 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_v == param1) {
                  break L2;
                } else {
                  jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
                  var4 = 1;
                  this.field_v = param1;
                  break L2;
                }
              }
              if (var4 == 0) {
                break L0;
              } else {
                this.field_nb = this.field_nb & -30;
                break L0;
              }
            }
          }
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
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        ms var1 = this.field_oc.b(79);
        while (var1 != null) {
            ((ad) ((Object) var1)).a(-4009);
            var1 = this.field_oc.d((byte) 18);
        }
        if (this.field_D != null) {
            this.field_D.a((byte) 113);
        }
        if (!(null == this.field_y)) {
            this.h(-27782);
            var1_ref = this.field_Gb.keys();
            while (var1_ref.hasMoreElements()) {
                var2 = (java.awt.Canvas) (var1_ref.nextElement());
                var3 = (Long) (this.field_Gb.get(var2));
                this.field_y.releaseSurface(var2, var3.longValue());
            }
            this.field_y.release();
            this.field_y = null;
        }
        if (this.field_jc) {
            pt.a(false, true, -1);
            this.field_jc = false;
        }
    }

    final void a(vc param0) {
    }

    final hr a(ri param0, boolean param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        hr stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
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
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new int[param0.field_i * param0.field_h];
              var12 = var10;
              var11 = var12;
              var3 = var11;
              var4 = 0;
              var5 = 0;
              if (param0.field_a != null) {
                var6_int = 0;
                L2: while (true) {
                  if (param0.field_i <= var6_int) {
                    break L1;
                  } else {
                    var7 = 0;
                    L3: while (true) {
                      if (param0.field_h <= var7) {
                        var6_int++;
                        continue L2;
                      } else {
                        incrementValue$0 = var5;
                        var5++;
                        var3[incrementValue$0] = ic.a(param0.field_g[eb.a((int) param0.field_e[var4], 255)], param0.field_a[var4] << 1413514584);
                        var4++;
                        var7++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var6_int = 0;
                L4: while (true) {
                  if (param0.field_i <= var6_int) {
                    break L1;
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (param0.field_h <= var7) {
                        var6_int++;
                        continue L4;
                      } else {
                        L6: {
                          incrementValue$1 = var4;
                          var4++;
                          var8 = param0.field_g[255 & param0.field_e[incrementValue$1]];
                          incrementValue$2 = var5;
                          var5++;
                          stackIn_8_0 = (int[]) (var10);

                          stackIn_8_1 = incrementValue$2;

                          if (var8 != 0) {
                            stackIn_9_0 = (int[]) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = ic.a(-16777216, var8);
                            break L6;
                          } else {
                            stackIn_9_0 = (int[]) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = 0;
                            break L6;
                          }
                        }
                        stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            var6 = this.a(0, -2, param0.field_i, param0.field_h, param0.field_h, var12);
            var6.a(param0.field_c, param0.field_d, param0.field_b, param0.field_f);
            stackIn_18_0 = (hr) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("fr.RA(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    private final void h(int param0) {
        if (param0 != -27782) {
            this.b();
        }
        this.field_y.a();
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
          this.field_Nb = param2;
          this.field_db = param1;
          this.field_sb = param3;
          this.field_t = param0;
          this.o(770);
          this.m(-117);
          if ((this.field_Q ^ -1) == -4) {
            this.p(-15048);
            break L0;
          } else {
            if (-3 == (this.field_Q ^ -1)) {
              this.b((byte) -108);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    final vc a(bu param0, nr param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("fr.OF(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
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
        } else {
          L0: {
            if (0 == this.field_Q) {
              break L0;
            } else {
              this.field_Q = 0;
              this.field_nb = this.field_nb & -32;
              break L0;
            }
          }
          return;
        }
    }

    final boolean s(int param0) {
        int var2 = 35 / ((-45 - param0) / 58);
        return this.field_Kb.a(3, (byte) 71);
    }

    final void c(int param0, boolean param1) {
        int var4;
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
          if (-2 == (param0 ^ -1)) {
            this.a(20685, 7681, 7681);
            break L1;
          } else {
            if (-1 != (param0 ^ -1)) {
              if ((param0 ^ -1) == -3) {
                this.a(20685, 7681, 34165);
                break L1;
              } else {
                if (-4 == (param0 ^ -1)) {
                  this.a(20685, 8448, 260);
                  break L1;
                } else {
                  if (4 == param0) {
                    this.a(20685, 34023, 34023);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            } else {
              this.a(20685, 8448, 8448);
              break L1;
            }
          }
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
        if (!this.field_xc) {
            if (!this.field_Gc) {
                throw new RuntimeException("");
            }
            this.field_Tb.b(0, this.field_Ec, 0, 0, 0, this.field_Z, -3773);
            this.field_y.setSurface(this.field_rb);
        } else {
            if (this.field_Fb == this.field_H) {
                this.field_H.a(0, 17012);
                this.field_H.a(8, 17012);
                this.a((byte) -123, (mw) (this.field_H));
                this.field_Tb = null;
                this.field_Ec = this.field_I;
                this.field_Z = this.field_s;
                this.g((byte) -81);
                this.h((byte) -81);
                this.j(-1303);
                return;
            }
            throw new RuntimeException();
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
        cw var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_pb = ((ad) ((Object) param0)).field_m;
              if (null == this.field_Rb) {
                L2: {
                  var3 = new cw(80);
                  if (this.field_R) {
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
                    break L2;
                  }
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
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("fr.OB(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    private final void o(int param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float[] var8;
        float var7;
        var8 = this.field_eb;
        var2 = var8;
        var3 = (float)(-this.field_t * this.field_sc) / (float)this.field_Nb;
        var4 = (float)((this.field_Z + -this.field_t) * this.field_sc) / (float)this.field_Nb;
        if (param0 == 770) {
          L0: {
            L1: {
              var5 = (float)(this.field_db * this.field_sc) / (float)this.field_sb;
              var6 = (float)((this.field_db + -this.field_Ec) * this.field_sc) / (float)this.field_sb;
              if (var3 == var4) {
                break L1;
              } else {
                if (var6 != var5) {
                  var7 = (float)this.field_sc * 2.0f;
                  var2[6] = 0.0f;
                  var2[4] = 0.0f;
                  var2[8] = (var3 + var4) / (var4 - var3);
                  var2[3] = 0.0f;
                  var2[12] = 0.0f;
                  var2[15] = 0.0f;
                  var2[9] = (var5 + var6) / (var5 - var6);
                  var2[1] = 0.0f;
                  var2[2] = 0.0f;
                  this.field_Qb = -(var7 * (float)this.field_Cb) / (float)(-this.field_sc + this.field_Cb);
                  var2[14] = -(var7 * (float)this.field_Cb) / (float)(-this.field_sc + this.field_Cb);
                  var2[0] = var7 / (var4 - var3);
                  var2[11] = -1.0f;
                  var2[7] = 0.0f;
                  this.field_i = (float)(-(this.field_sc + this.field_Cb)) / (float)(-this.field_sc + this.field_Cb);
                  var2[10] = (float)(-(this.field_sc + this.field_Cb)) / (float)(-this.field_sc + this.field_Cb);
                  var2[5] = var7 / (-var6 + var5);
                  var2[13] = 0.0f;
                  break L0;
                } else {
                  break L1;
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
        float var2;
        float var3;
        float var4;
        float var5;
        L0: {
          var2 = this.field_kb * (float)(-this.field_t) / (float)this.field_Nb;
          var3 = this.field_kb * (float)(-this.field_db) / (float)this.field_sb;
          var4 = this.field_kb * (float)(-this.field_t + this.field_Z) / (float)this.field_Nb;
          var5 = this.field_kb * (float)(-this.field_db + this.field_Ec) / (float)this.field_sb;
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          if (var4 == var2) {
            break L0;
          } else {
            if (var5 != var3) {
              jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field_sc, (double)this.field_Cb);
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param0 != -15048) {
          return;
        } else {
          jaggl.OpenGL.glMatrixMode(5888);
          return;
        }
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
                break L0;
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
        if (!(this.field_yc >= param0)) {
            this.field_yc = param0;
        }
        if (!(param2 >= this.field_jb)) {
            this.field_jb = param2;
        }
        if (param1 > this.field_Wb) {
            this.field_Wb = param1;
        }
        if (!(this.field_Eb <= param3)) {
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
        if (!(this.field_Ec >= param3)) {
            param3 = this.field_Ec;
        }
        if ((param1 ^ -1) > -1) {
            param1 = 0;
        }
        if (!(this.field_Z >= param2)) {
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
        } else {
          this.field_jb = this.field_Z;
          jaggl.OpenGL.glDisable(3089);
          this.m(-117);
          return;
        }
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
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
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
        int var7 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        if (param2 != 1) {
            ri var9 = (ri) null;
            this.a((ri) null, true);
        }
        int[] var10 = new int[param1 * param4];
        int[] var6 = var10;
        for (var7 = 0; param4 > var7; var7++) {
            jaggl.OpenGL.glReadPixelsi(param3, this.field_Ec - (param0 - -var7), param1, 1, 32993, this.field_L, var10, param1 * var7);
        }
        return var10;
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        this.a((byte) 111, -2);
        for (var2 = this.field_T + -1; var2 >= 0; var2--) {
            this.g(var2, 90);
            this.a(param0 + 111, (ht) null);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
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
        float[] var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        for (var3 = param0; -9 < (var3 ^ -1); var3++) {
            var4 = 16384 + var3;
            jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
            jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
            jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        jaggl.OpenGL.glEnable(16384);
        jaggl.OpenGL.glEnable(16385);
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.field_P = -1;
        this.j(param0 + -1303);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7;
        float var8;
        float var9;
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
                break L0;
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
        int stackIn_4_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        if (param1 >= -73) {
          return;
        } else {
          L0: {
            if (param0) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          L1: {
            if (stackIn_4_0 == (this.field_S ? 1 : 0)) {
              L2: {
                stackIn_8_0 = this;

                if (!param0) {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 1;
                  break L2;
                }
              }
              ((fr) (this)).field_S = stackIn_9_1 != 0;
              this.n(-112);
              this.field_nb = this.field_nb & -32;
              break L1;
            } else {
              break L1;
            }
          }
          return;
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
            if (this.field_jb < this.field_yc) {
              break L2;
            } else {
              if (this.field_Wb <= this.field_Eb) {
                jaggl.OpenGL.glScissor(this.field_yc + this.field_pc, -this.field_Eb + this.field_Ec + this.field_bb, this.field_jb + -this.field_yc, -this.field_Wb + this.field_Eb);
                break L1;
              } else {
                break L2;
              }
            }
          }
          jaggl.OpenGL.glScissor(0, 0, 0, 0);
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
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
        var2 = 0;
        param0 = param0 & 2147483647;
        L0: while (true) {
          if (this.field_j.a((byte) -119)) {
            L1: {
              if (-1 > (var2 ^ -1)) {
                jaggl.OpenGL.glDeleteBuffersARB(var2, gr.field_h, 0);
                var2 = 0;
                L2: while (true) {
                  if (this.field_q.a((byte) -101)) {
                    break L1;
                  } else {
                    var6 = (ge) ((Object) this.field_q.c(9));
                    incrementValue$0 = var2;
                    var2++;
                    gr.field_h[incrementValue$0] = (int)var6.field_h;
                    this.field_p = this.field_p - var6.field_m;
                    if ((var2 ^ -1) != -1001) {
                      continue L2;
                    } else {
                      jaggl.OpenGL.glDeleteTextures(var2, gr.field_h, 0);
                      var2 = 0;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: while (true) {
                  if (this.field_q.a((byte) -101)) {
                    break L1;
                  } else {
                    var6 = (ge) ((Object) this.field_q.c(9));
                    incrementValue$1 = var2;
                    var2++;
                    gr.field_h[incrementValue$1] = (int)var6.field_h;
                    this.field_p = this.field_p - var6.field_m;
                    if ((var2 ^ -1) != -1001) {
                      continue L3;
                    } else {
                      jaggl.OpenGL.glDeleteTextures(var2, gr.field_h, 0);
                      var2 = 0;
                      continue L3;
                    }
                  }
                }
              }
            }
            L4: {
              if ((var2 ^ -1) < -1) {
                jaggl.OpenGL.glDeleteTextures(var2, gr.field_h, 0);
                var2 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            L5: while (true) {
              if (this.field_tc.a((byte) -93)) {
                L6: {
                  if (-1 > (var2 ^ -1)) {
                    jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gr.field_h, 0);
                    var2 = 0;
                    L7: while (true) {
                      if (this.field_fc.a((byte) -78)) {
                        break L6;
                      } else {
                        var8 = (ge) ((Object) this.field_fc.c(9));
                        incrementValue$2 = var2;
                        var2++;
                        gr.field_h[incrementValue$2] = (int)var8.field_h;
                        this.field_V = this.field_V - var8.field_m;
                        if (1000 != var2) {
                          continue L7;
                        } else {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gr.field_h, 0);
                          var2 = 0;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    L8: while (true) {
                      if (this.field_fc.a((byte) -78)) {
                        break L6;
                      } else {
                        var8 = (ge) ((Object) this.field_fc.c(9));
                        incrementValue$3 = var2;
                        var2++;
                        gr.field_h[incrementValue$3] = (int)var8.field_h;
                        this.field_V = this.field_V - var8.field_m;
                        if (1000 != var2) {
                          continue L8;
                        } else {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gr.field_h, 0);
                          var2 = 0;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                L9: {
                  if (-1 > (var2 ^ -1)) {
                    jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gr.field_h, 0);
                    var2 = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: while (true) {
                  if (!this.field_fb.a((byte) -119)) {
                    var9 = (ge) ((Object) this.field_fb.c(9));
                    jaggl.OpenGL.glDeleteLists((int)var9.field_h, var9.field_m);
                    continue L10;
                  } else {
                    L11: while (true) {
                      if (this.field_qb.a((byte) -124)) {
                        L12: while (true) {
                          if (!this.field_cc.a((byte) -67)) {
                            var11 = this.field_cc.c(9);
                            jaggl.OpenGL.glDeleteObjectARB(var11.field_h);
                            continue L12;
                          } else {
                            L13: while (true) {
                              if (this.field_fb.a((byte) -96)) {
                                L14: {
                                  this.field_Pb.a(122);
                                  if (100663296 >= this.e((byte) 7)) {
                                    break L14;
                                  } else {
                                    if (wq.a(-64) > this.field_vc - -60000L) {
                                      System.gc();
                                      this.field_vc = wq.a(-78);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                this.field_Ac = param0;
                                return;
                              } else {
                                var12 = (ge) ((Object) this.field_fb.c(9));
                                jaggl.OpenGL.glDeleteLists((int)var12.field_h, var12.field_m);
                                continue L13;
                              }
                            }
                          }
                        }
                      } else {
                        var10 = this.field_qb.c(9);
                        jaggl.OpenGL.glDeleteProgramARB((int)var10.field_h);
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                var7 = (ge) ((Object) this.field_tc.c(9));
                incrementValue$4 = var2;
                var2++;
                gr.field_h[incrementValue$4] = var7.field_m;
                if (1000 == var2) {
                  jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gr.field_h, 0);
                  var2 = 0;
                  continue L5;
                } else {
                  continue L5;
                }
              }
            }
          } else {
            var5 = (ge) ((Object) this.field_j.c(9));
            incrementValue$5 = var2;
            var2++;
            gr.field_h[incrementValue$5] = (int)var5.field_h;
            this.field_Xb = this.field_Xb - var5.field_m;
            if (var2 != 1000) {
              continue L0;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, gr.field_h, 0);
              var2 = 0;
              continue L0;
            }
          }
        }
    }

    final fk a(int param0, boolean param1, byte param2, int param3, byte[] param4) {
        RuntimeException var6 = null;
        hn stackIn_7_0 = null;
        sl stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_7_0 = new hn((fr) (this), param0, param4, param3, param1);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackIn_9_0 = new sl((fr) (this), param0, param4, param3);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("fr.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (!this.field_B) {
                if (this.field_Jb < 3) {
                  L2: {
                    if (0 > this.field_Jb) {
                      break L2;
                    } else {
                      this.field_dc[this.field_Jb].e(-65);
                      break L2;
                    }
                  }
                  fieldTemp$1 = this.field_Jb + 1;
                  this.field_Jb = this.field_Jb + 1;
                  this.field_dc[fieldTemp$1] = param0;
                  this.field_Fb = param0;
                  this.field_hc = param0;
                  this.field_hc.b(30352);
                  break L1;
                } else {
                  throw new RuntimeException();
                }
              } else {
                this.b(30369, param0);
                this.a(4608, param0);
                break L1;
              }
            }
            L3: {
              if (param1 < -70) {
                break L3;
              } else {
                this.field_R = true;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("fr.E(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (param0 != this.field_sc) {
              break L1;
            } else {
              if (this.field_Cb == param1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_sc = param0;
          this.field_Cb = param1;
          this.o(770);
          this.i(3089);
          if ((this.field_Q ^ -1) == -4) {
            this.p(-15048);
            break L0;
          } else {
            if ((this.field_Q ^ -1) != -3) {
              break L0;
            } else {
              this.b((byte) -110);
              break L0;
            }
          }
        }
    }

    private final void i(byte param0) {
        cs discarded$14 = null;
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
        lf discarded$13 = new lf((fr) (this));
        if (this.field_xc) {
            this.field_G = new cs((fr) (this));
            discarded$14 = new cs((fr) (this));
        }
    }

    final void a(byte param0, mw param1) {
        int fieldTemp$2 = 0;
        mw dupTemp$3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -102 % ((62 - param0) / 55);
              if (!this.field_B) {
                L2: {
                  if (this.field_Jb < 0) {
                    break L2;
                  } else {
                    if (this.field_dc[this.field_Jb] == param1) {
                      fieldTemp$2 = this.field_Jb;
                      this.field_Jb = this.field_Jb - 1;
                      this.field_dc[fieldTemp$2] = null;
                      param1.e(-98);
                      if (-1 >= (this.field_Jb ^ -1)) {
                        dupTemp$3 = this.field_dc[this.field_Jb];
                        this.field_Fb = dupTemp$3;
                        this.field_hc = dupTemp$3;
                        this.field_hc.b(30352);
                        break L1;
                      } else {
                        this.field_Fb = null;
                        this.field_hc = null;
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                this.c(param1, 71);
                this.b(param1, -963075224);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("fr.SB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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
            if ((this.field_Z ^ -1) < -1 && -1 > (this.field_Ec ^ -1)) {
                jaggl.OpenGL.glOrtho(0.0, (double)this.field_Z, (double)this.field_Ec, 0.0, -1.0, 1.0);
            }
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            this.field_Q = 1;
            this.field_nb = this.field_nb & -25;
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        float var6;
        float var7;
        int var8;
        int var9;
        int var10;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          if (-1 >= (param2 ^ -1)) {
            break L0;
          } else {
            param2 = -param2;
            break L0;
          }
        }
        if (this.field_yc <= param0 - -param2) {
          L1: {
            if (-param2 + param0 > this.field_jb) {
              break L1;
            } else {
              if (param1 - -param2 < this.field_Wb) {
                break L1;
              } else {
                if (this.field_Eb >= param1 - param2) {
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
                      var6 = 0.3499999940395355f + (float)param0;
                      var7 = (float)param1 + 0.3499999940395355f;
                      jaggl.OpenGL.glBegin(2);
                      var8 = 262144 / (6 * param2);
                      if (64 >= var8) {
                        var8 = 64;
                        break L2;
                      } else {
                        if (-513 <= (var8 ^ -1)) {
                          break L2;
                        } else {
                          var8 = 512;
                          break L2;
                        }
                      }
                    }
                    var8 = jo.a(var8, false);
                    jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
                    var9 = 16384 - var8;
                    L3: while (true) {
                      if (var9 <= 0) {
                        jaggl.OpenGL.glEnd();
                        return;
                      } else {
                        jaggl.OpenGL.glVertex2f((float)param2 * dh.field_M[var9] + var6, dh.field_N[var9] * (float)param2 + var7);
                        var9 = var9 - var8;
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        } else {
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
        if ((param0 ^ -1) != -6407) {
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
                      if (-6409 != (param0 ^ -1)) {
                        if (param0 != 34847) {
                          if ((param0 ^ -1) != -34844) {
                            if (param0 != 34842) {
                              if ((param0 ^ -1) != -6403) {
                                if (-6402 == (param0 ^ -1)) {
                                  return 1;
                                } else {
                                  throw new IllegalArgumentException("");
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              return 8;
                            }
                          } else {
                            return 6;
                          }
                        } else {
                          return 4;
                        }
                      } else {
                        return 4;
                      }
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
        } else {
          return 1;
        }
    }

    final hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        cm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = new cm((fr) (this), param3, param4, param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("fr.TB(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (hr) ((Object) stackIn_1_0);
    }

    final void a(hr param0, boolean param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf var3 = null;
        wh var3_ref = null;
        RuntimeException var3_ref2 = null;
        pj var4 = null;
        int var6 = 0;
        wh var7 = null;
        wh var8 = null;
        kf var9 = null;
        kf var10 = null;
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
                        var3 = (kf) ((Object) this.field_nc.a(127, (long)(this.field_Tb.c() << -218281392 | this.field_Tb.a())));
                        if (var3 != null) {
                          break L4;
                        } else {
                          var9 = new kf((fr) (this), 6402, this.field_Tb.c(), this.field_Tb.a());
                          var3 = var9;
                          this.field_ic = this.field_ic + var9.field_s;
                          L5: while (true) {
                            L6: {
                              if (-2097153 <= (this.field_ic ^ -1)) {
                                break L6;
                              } else {
                                var4 = this.field_Db.c((byte) 126);
                                if (var4 == null) {
                                  break L6;
                                } else {
                                  var10 = (kf) ((Object) var4);
                                  var10.c(-5106);
                                  var10.b(false);
                                  var10.g(-127);
                                  this.field_ic = this.field_ic - var10.field_s;
                                  continue L5;
                                }
                              }
                            }
                            this.field_nc.a(var9, -1, (long)(this.field_Tb.c() << 462343888 | this.field_Tb.a()));
                            break L4;
                          }
                        }
                      }
                      this.field_Db.a(var3, -4);
                      this.field_H.a(var3, 8, -14269);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_H.a(this.field_Tb.field_g, -4610, 0);
                  break L1;
                }
              } else {
                if (!this.field_Gc) {
                  throw new RuntimeException("");
                } else {
                  L7: {
                    var3_ref = (wh) ((Object) this.field_nc.a(117, (long)(this.field_Tb.c() << -904794352 | this.field_Tb.a())));
                    if (var3_ref == null) {
                      var7 = new wh((fr) (this), this.field_Tb.c(), this.field_Tb.a());
                      var3_ref = var7;
                      this.field_ic = this.field_ic + var7.field_v * 4;
                      L8: while (true) {
                        L9: {
                          if (this.field_ic <= 2097152) {
                            break L9;
                          } else {
                            var4 = this.field_Db.c((byte) 126);
                            if (var4 == null) {
                              break L9;
                            } else {
                              var8 = (wh) ((Object) var4);
                              var8.c(-5106);
                              var8.b(false);
                              this.field_y.releasePbuffer(var8.e(-99));
                              this.field_ic = this.field_ic - var8.field_v;
                              continue L8;
                            }
                          }
                        }
                        this.field_nc.a(var7, -1, (long)(this.field_Tb.c() << 999637776 | this.field_Tb.a()));
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  this.field_Db.a(var3_ref, -4);
                  this.field_y.setPbuffer(var3_ref.e(-106));
                  break L1;
                }
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
          L10: {
            var3_ref2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3_ref2);

            stackIn_31_1 = new StringBuilder().append("fr.MF(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
    }

    final void a(fk param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("fr.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
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
              if (1 == param1) {
                var4 = 1;
                var3 = 1;
                var5 = 1;
                break L2;
              } else {
                if (2 != param1) {
                  if ((param1 ^ -1) != -129) {
                    var3 = 1;
                    var4 = 0;
                    var5 = 0;
                    break L2;
                  } else {
                    var5 = 3;
                    var4 = 1;
                    var3 = 1;
                    break L2;
                  }
                } else {
                  var3 = 1;
                  var5 = 2;
                  var4 = 0;
                  break L2;
                }
              }
            }
            L3: {
              if ((this.field_tb ? 1 : 0) == var3) {
                break L3;
              } else {
                L4: {
                  jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
                  stackIn_13_0 = this;

                  if (var3 == 0) {
                    stackIn_14_0 = this;
                    stackIn_14_1 = 0;
                    break L4;
                  } else {
                    stackIn_14_0 = this;
                    stackIn_14_1 = 1;
                    break L4;
                  }
                }
                ((fr) (this)).field_tb = stackIn_14_1 != 0;
                break L3;
              }
            }
            L5: {
              if (this.field_A) {
                stackIn_18_0 = 0;
                break L5;
              } else {
                stackIn_18_0 = 1;
                break L5;
              }
            }
            L6: {


              if (var4 != 0) {

                stackIn_21_1 = 0;
                break L6;
              } else {

                stackIn_21_1 = 1;
                break L6;
              }
            }
            L7: {
              if (stackIn_18_0 != stackIn_21_1) {
                L8: {
                  if (var4 == 0) {
                    jaggl.OpenGL.glDisable(3008);
                    break L8;
                  } else {
                    jaggl.OpenGL.glEnable(3008);
                    break L8;
                  }
                }
                L9: {
                  stackIn_28_0 = this;

                  if (var4 == 0) {
                    stackIn_29_0 = this;
                    stackIn_29_1 = 0;
                    break L9;
                  } else {
                    stackIn_29_0 = this;
                    stackIn_29_1 = 1;
                    break L9;
                  }
                }
                ((fr) (this)).field_A = stackIn_29_1 != 0;
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (var5 == this.field_zb) {
                break L10;
              } else {
                L11: {
                  if (-2 == (var5 ^ -1)) {
                    jaggl.OpenGL.glEnable(3042);
                    jaggl.OpenGL.glBlendFunc(770, 771);
                    break L11;
                  } else {
                    if (2 != var5) {
                      if (var5 == 3) {
                        jaggl.OpenGL.glEnable(3042);
                        jaggl.OpenGL.glBlendFunc(774, 1);
                        break L11;
                      } else {
                        jaggl.OpenGL.glDisable(3042);
                        break L11;
                      }
                    } else {
                      jaggl.OpenGL.glEnable(3042);
                      jaggl.OpenGL.glBlendFunc(1, 1);
                      break L11;
                    }
                  }
                }
                this.field_zb = var5;
                break L10;
              }
            }
            this.field_Ab = param1;
            this.field_nb = this.field_nb & -29;
            break L1;
          }
        }
    }

    private final void b(boolean param0) {
        nr var3;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = (nr) null;
            this.a((bu) null, (nr) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_Bb) {
              break L2;
            } else {
              if (!this.field_rc) {
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

    private final void m(int param0) {
        if (param0 >= -116) {
            this.h(80);
        }
    }

    final void e() {
        int var1;
        int var2;
        int var3;
        int var4;
        if (this.field_ec) {
          if (0 < this.field_Z) {
            if ((this.field_Ec ^ -1) >= -1) {
              return;
            } else {
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
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void GA(int param0) {
        this.c(25189, 0);
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 1986867960) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    private final void a(int param0, int param1, boolean param2, boolean param3) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        wm var10;
        int var11;
        int var12;
        L0: {
          L1: {
            if (this.field_wc != param0) {
              break L1;
            } else {
              L2: {
                if (this.field_uc) {
                  stackIn_4_0 = 0;
                  break L2;
                } else {
                  stackIn_4_0 = 1;
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
              stackIn_8_0 = 0;
              break L3;
            } else {
              stackIn_8_0 = 3;
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
                  var5 = this.field_Pb.a(0, param0);
                  var10 = this.field_h.a(-29193, param0);
                  if (var10.field_c != 0) {
                    break L6;
                  } else {
                    if (var10.field_u == 0) {
                      this.c(false);
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var10.field_n) {
                    stackIn_15_0 = 64;
                    break L7;
                  } else {
                    stackIn_15_0 = 128;
                    break L7;
                  }
                }
                var11 = stackIn_15_0;
                var12 = 50 * var11;
                this.a((float)(var10.field_u * (this.field_Ac % var12)) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_Ac % var12)) / (float)var12, 32151);
                break L5;
              }
              L8: {
                if (this.field_uc) {
                  break L8;
                } else {
                  var9 = var10.field_d;
                  var8 = var10.field_h;
                  var7 = var10.field_j;
                  break L8;
                }
              }
              var6 = var10.field_q;
              break L4;
            }
          }
          L9: {
            this.field_Kb.a(param2, var8, 125, var7, param3, var9);
            if (!this.field_Kb.a(var6, (byte) 71, (ht) (var5))) {
              this.a(103, (ht) (var5));
              this.c(var6, true);
              break L9;
            } else {
              break L9;
            }
          }
          this.field_gb = this.field_uc;
          this.field_wc = param0;
          break L0;
        }
        L10: {
          this.field_nb = this.field_nb & -8;
          if (param1 > 109) {
            break L10;
          } else {
            this.b(-42, (byte) -3);
            break L10;
          }
        }
    }

    private final void b(mw param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                    fieldTemp$1 = this.field_w;
                    this.field_w = this.field_w - 1;
                    this.field_Hc[fieldTemp$1] = null;
                    param0.a(false);
                    if (-1 < (this.field_w ^ -1)) {
                      this.field_Fb = null;
                      break L3;
                    } else {
                      this.field_Fb = this.field_Hc[this.field_w];
                      this.field_Fb.d(param1 + 963075341);
                      break L3;
                    }
                  }
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("fr.AB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        if ((!param1 ? 1 : 0) == (!this.field_x ? 1 : 0)) {
        } else {
            if (param1) {
                jaggl.OpenGL.glEnable(2929);
            } else {
                jaggl.OpenGL.glDisable(2929);
            }
            this.field_x = param1 ? true : false;
            this.field_nb = this.field_nb & -32;
        }
        if (param0 <= 52) {
            this.field_oc = (jn) null;
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
