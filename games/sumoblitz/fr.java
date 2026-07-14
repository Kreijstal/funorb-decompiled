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
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        NumberFormatException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int[] var9 = null;
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = 0;
                    ((fr) this).field_E = jaggl.OpenGL.glGetString(7936).toLowerCase();
                    ((fr) this).field_Dc = jaggl.OpenGL.glGetString(7937).toLowerCase();
                    if (((fr) this).field_E.indexOf("microsoft") == -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var2 = var2 | 1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (0 != (((fr) this).field_E.indexOf("brian paul") ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if ((((fr) this).field_E.indexOf("mesa") ^ -1) == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2 = var2 | 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var3 = jaggl.OpenGL.glGetString(7938);
                    var4 = cn.a(' ', var3.replace('.', ' '), -27224);
                    if (param0 <= var4.length) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var2 = var2 | 4;
                    statePc = 11;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        var5_int = no.a((byte) -128, (CharSequence) (Object) var4[0]);
                        var6 = no.a((byte) -127, (CharSequence) (Object) var4[1]);
                        ((fr) this).field_Yb = var5_int * 10 + var6;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var5 = (NumberFormatException) (Object) caughtException;
                    var2 = var2 | 4;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (-13 >= (((fr) this).field_Yb ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2 = var2 | 2;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (!((fr) this).field_y.a("GL_ARB_multitexture")) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var2 = var2 | 8;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((fr) this).field_y.a("GL_ARB_texture_env_combine")) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var2 = var2 | 32;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var9 = new int[1];
                    jaggl.OpenGL.glGetIntegerv(34018, var9, 0);
                    ((fr) this).field_T = var9[0];
                    jaggl.OpenGL.glGetIntegerv(34929, var9, 0);
                    ((fr) this).field_Ub = var9[0];
                    jaggl.OpenGL.glGetIntegerv(34930, var9, 0);
                    ((fr) this).field_xb = var9[0];
                    if (-3 < ((fr) this).field_T) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (-3 > ((fr) this).field_Ub) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if ((((fr) this).field_xb ^ -1) <= -3) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var2 = var2 | 16;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    ((fr) this).field_R = jaclib.memory.Stream.b();
                    ((fr) this).field_Gc = ((fr) this).field_y.arePbuffersAvailable();
                    ((fr) this).field_J = ((fr) this).field_y.a("GL_ARB_vertex_buffer_object");
                    ((fr) this).field_hb = ((fr) this).field_y.a("GL_ARB_multisample");
                    ((fr) this).field_Ib = ((fr) this).field_y.a("GL_ARB_vertex_program");
                    boolean discarded$2 = ((fr) this).field_y.a("GL_ARB_fragment_program");
                    ((fr) this).field_N = ((fr) this).field_y.a("GL_ARB_vertex_shader");
                    ((fr) this).field_wb = ((fr) this).field_y.a("GL_ARB_fragment_shader");
                    ((fr) this).field_Ic = ((fr) this).field_y.a("GL_EXT_texture3D");
                    ((fr) this).field_C = ((fr) this).field_y.a("GL_ARB_texture_rectangle");
                    ((fr) this).field_Ob = ((fr) this).field_y.a("GL_ARB_texture_cube_map");
                    ((fr) this).field_Hb = ((fr) this).field_y.a("GL_ARB_texture_float");
                    ((fr) this).field_Cc = false;
                    ((fr) this).field_xc = ((fr) this).field_y.a("GL_EXT_framebuffer_object");
                    ((fr) this).field_B = ((fr) this).field_y.a("GL_EXT_framebuffer_blit");
                    ((fr) this).field_vb = ((fr) this).field_y.a("GL_EXT_framebuffer_multisample");
                    ((fr) this).field_W = en.field_h.startsWith("mac");
                    jaggl.OpenGL.glGetFloatv(2834, lu.field_g, 0);
                    if (var2 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = 0;
                    stackIn_26_0 = stackOut_24_0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = var2;
                    stackIn_26_0 = stackOut_25_0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    return stackIn_26_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void k(byte param0) {
        if (!(1 == ((fr) this).field_nb)) {
            this.t(1);
            this.d(3, false);
            this.b(-69, false);
            this.a(65, false);
            this.a(false, (byte) -94);
            ((fr) this).a(106, (ht) null);
            this.a((byte) 123, -2);
            ((fr) this).c(1, true);
            ((fr) this).field_nb = 1;
        }
        int var2 = -67 % ((39 - param0) / 49);
    }

    private final void b(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(((fr) this).field_eb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        int var2 = -104 % ((14 - param0) / 61);
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          var2 = 0;
          if (param0 > 73) {
            break L0;
          } else {
            ((fr) this).field_mc = null;
            break L0;
          }
        }
        L1: while (true) {
          if (!((fr) this).field_y.b()) {
            var2++;
            if ((var2 ^ -1) < -6) {
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
        if (((fr) this).field_mb) {
            jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param2, param0, param1);
        jaggl.OpenGL.glMatrixMode(5888);
        ((fr) this).field_mb = true;
        if (param3 != 32151) {
            ((fr) this).field_nb = 10;
        }
    }

    final void g(int param0, int param1) {
        if (param1 < 79) {
            this.b(false);
        }
        if (!(param0 == ((fr) this).field_Vb)) {
            jaggl.OpenGL.glActiveTexture(33984 - -param0);
            ((fr) this).field_Vb = param0;
        }
    }

    private final void d(boolean param0) {
        java.awt.Dimension var2 = null;
        L0: {
          if (((fr) this).field_ab != null) {
            var2 = ((fr) this).field_ab.getSize();
            ((fr) this).field_s = var2.width;
            ((fr) this).field_I = var2.height;
            break L0;
          } else {
            ((fr) this).field_s = 0;
            ((fr) this).field_I = 0;
            break L0;
          }
        }
        L1: {
          if (null == ((fr) this).field_Fb) {
            ((fr) this).field_Ec = ((fr) this).field_I;
            ((fr) this).field_Z = ((fr) this).field_s;
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
        param0[2] = ((fr) this).field_jb;
        param0[0] = ((fr) this).field_yc;
        param0[1] = ((fr) this).field_Wb;
        param0[3] = ((fr) this).field_Eb;
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.k((byte) -121);
        ((fr) this).c(25189, param4);
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
        ((fr) this).field_fc.a((ms) (Object) var4, (byte) 39);
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
            ((fr) this).field_zb = 95;
        }
        ((fr) this).field_eb[10] = ((fr) this).field_i;
        ((fr) this).field_eb[14] = ((fr) this).field_Qb;
    }

    private final void c(mw param0, int param1) {
        L0: {
          if (((fr) this).field_qc < 0) {
            break L0;
          } else {
            if (((fr) this).field_m[((fr) this).field_qc] == param0) {
              ((fr) this).field_qc = ((fr) this).field_qc - 1;
              ((fr) this).field_m[((fr) this).field_qc] = null;
              if (param1 < 68) {
                return;
              } else {
                L1: {
                  param0.a(-20745);
                  if (-1 < (((fr) this).field_qc ^ -1)) {
                    ((fr) this).field_hc = null;
                    break L1;
                  } else {
                    ((fr) this).field_hc = ((fr) this).field_m[((fr) this).field_qc];
                    ((fr) this).field_hc.c(195);
                    break L1;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    final boolean a() {
        return ((fr) this).field_U != null && ((fr) this).field_U.a(118);
    }

    final da a(ta param0, ri[] param1, boolean param2) {
        return (da) (Object) new qh((fr) this, param0, param1, param2);
    }

    final void a(int param0, float param1, float param2, float param3, float param4) {
        lu.field_g[2] = param2;
        if (param0 != 31322) {
            ((fr) this).field_Xb = 70;
        }
        lu.field_g[0] = param3;
        lu.field_g[1] = param1;
        lu.field_g[3] = param4;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, lu.field_g, 0);
    }

    final void a(int param0, ht param1) {
        ht var3 = null;
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 >= 8) {
            break L0;
          } else {
            this.r(75);
            break L0;
          }
        }
        L1: {
          var3 = ((fr) this).field_ib[((fr) this).field_Vb];
          if (param1 != var3) {
            L2: {
              if (param1 == null) {
                jaggl.OpenGL.glDisable(var3.field_c);
                break L2;
              } else {
                if (var3 == null) {
                  jaggl.OpenGL.glEnable(param1.field_c);
                  jaggl.OpenGL.glBindTexture(param1.field_c, param1.c(-113));
                  break L2;
                } else {
                  if (param1.field_c == var3.field_c) {
                    jaggl.OpenGL.glBindTexture(param1.field_c, param1.c(-113));
                    break L2;
                  } else {
                    jaggl.OpenGL.glDisable(var3.field_c);
                    jaggl.OpenGL.glEnable(param1.field_c);
                    jaggl.OpenGL.glBindTexture(param1.field_c, param1.c(-113));
                    break L2;
                  }
                }
              }
            }
            ((fr) this).field_ib[((fr) this).field_Vb] = param1;
            break L1;
          } else {
            break L1;
          }
        }
        ((fr) this).field_nb = ((fr) this).field_nb & -2;
    }

    final int b(int param0, byte param1) {
        Object var4 = null;
        L0: {
          if (param1 == -14) {
            break L0;
          } else {
            var4 = null;
            ((fr) this).a((byte) 16, (mw) null);
            break L0;
          }
        }
        if (param0 != -2) {
          if (-1 != param0) {
            if (param0 != -3) {
              if (-4 != param0) {
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
        if (!(2 == ((fr) this).field_nb)) {
            this.t(1);
            this.d(3, false);
            this.b(-74, false);
            this.a(99, false);
            this.a(false, (byte) -89);
            this.a((byte) 119, -2);
            ((fr) this).field_nb = 2;
        }
        if (param0 > -49) {
            Object var3 = null;
            ((fr) this).a((hr) null, true);
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
            ((fr) this).field_wb = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((fr) this).field_S) {
              break L2;
            } else {
              if (!((fr) this).field_Zb) {
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
        String var13_ref = null;
        Throwable var4 = null;
        int var4_int = 0;
        Throwable var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object[] var8 = null;
        String[] var8_array = null;
        int var9 = 0;
        String var10 = null;
        Exception var11 = null;
        Object var13 = null;
        int[] var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        CharSequence var21 = null;
        CharSequence var22 = null;
        CharSequence var23 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        var13_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = null;
                    var20 = null;
                    ((fr) this).field_Gb = new Hashtable();
                    ((fr) this).field_X = 128;
                    ((fr) this).field_O = new ic();
                    dl discarded$4 = new dl();
                    dl discarded$5 = new dl();
                    ((fr) this).field_jc = false;
                    ((fr) this).field_oc = new jn();
                    ((fr) this).field_Jb = -1;
                    ((fr) this).field_qc = -1;
                    ((fr) this).field_m = new mw[4];
                    ((fr) this).field_Hc = new mw[4];
                    ((fr) this).field_w = -1;
                    ((fr) this).field_dc = new mw[4];
                    ((fr) this).field_Db = new ro();
                    ((fr) this).field_nc = new te(16);
                    ((fr) this).field_fb = new jn();
                    ((fr) this).field_j = new jn();
                    ((fr) this).field_q = new jn();
                    ((fr) this).field_tc = new jn();
                    ((fr) this).field_fc = new jn();
                    ((fr) this).field_qb = new jn();
                    ((fr) this).field_cc = new jn();
                    dl discarded$6 = new dl();
                    ((fr) this).field_M = new dl();
                    ((fr) this).field_mc = new dl();
                    ((fr) this).field_t = 0;
                    ((fr) this).field_l = 0.0f;
                    ((fr) this).field_gc = 8448;
                    ((fr) this).field_o = new float[4];
                    ((fr) this).field_Zb = true;
                    ((fr) this).field_eb = new float[16];
                    ((fr) this).field_pc = 0;
                    ((fr) this).field_db = 0;
                    ((fr) this).field_lc = 0;
                    ((fr) this).field_sb = 512;
                    ((fr) this).field_Wb = 0;
                    ((fr) this).field_Cb = 3584;
                    ((fr) this).field_ub = 1.0f;
                    ((fr) this).field_k = -1;
                    ((fr) this).field_Eb = 0;
                    ((fr) this).field_v = 8448;
                    ((fr) this).field_u = -1;
                    ((fr) this).field_sc = 50;
                    ((fr) this).field_ac = 1.0f;
                    ((fr) this).field_Mb = 0;
                    ((fr) this).field_gb = false;
                    ((fr) this).field_z = 1.0f;
                    ((fr) this).field_Nb = 512;
                    ((fr) this).field_P = -1;
                    ((fr) this).field_kc = -1;
                    ((fr) this).field_yc = 0;
                    ((fr) this).field_jb = 0;
                    ((fr) this).field_kb = 1.0f;
                    ((fr) this).field_bb = 0;
                    ((fr) this).field_Fc = 1.0f;
                    cw discarded$7 = new cw(8192);
                    ((fr) this).field_Bc = param2;
                    ((fr) this).field_ab = param0;
                    if (mc.b((byte) -107, "jaclib")) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    throw new RuntimeException("");
                }
                case 2: {
                    if (mc.b((byte) 97, "jaggl")) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    throw new RuntimeException("");
                }
                case 4: {
                    try {
                        ((fr) this).field_y = new jaggl.OpenGL();
                        ((fr) this).field_ob = ((fr) this).field_y.init(param0, 8, 8, 8, 24, 0, ((fr) this).field_Bc);
                        ((fr) this).field_rb = ((fr) this).field_y.init(param0, 8, 8, 8, 24, 0, ((fr) this).field_Bc);
                        if ((((fr) this).field_ob ^ -1L) != -1L) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.c((byte) 117);
                        var4_int = this.d(2);
                        if (0 == var4_int) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (((fr) this).field_R) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 5121;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 33639;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((fr) this).field_L = stackIn_11_1;
                        if (-1 == ((fr) this).field_Dc.indexOf("radeon")) {
                            statePc = 45;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        var7 = 0;
                        var8_array = cn.a(' ', ((fr) this).field_Dc.replace('/', ' '), -27224);
                        var9 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8_array.length <= var9) {
                            statePc = 33;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var13_ref = var8_array[var9];
                        var10 = var13_ref;
                        var10 = var13_ref;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-1 > (var13_ref.length() ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var13_ref.charAt(0) != 120) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (3 > var13_ref.length()) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var21 = (CharSequence) (Object) var13_ref.substring(1, 3);
                        if (!jf.a(-13181, var21)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = 1;
                        var10 = var13_ref.substring(1);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var10.equals((Object) (Object) "hd")) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!var10.startsWith("hd")) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10 = var10.substring(2);
                        var6 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = (stateCaught_26 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (4 > var10.length()) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var22 = (CharSequence) (Object) var10.substring(0, 4);
                        if (!jf.a(-13181, var22)) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var23 = (CharSequence) (Object) var10.substring(0, 4);
                        var5_int = no.a((byte) -128, var23);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 31 : 60);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = (Exception) (Object) caughtException;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var7 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var6 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (7000 > var5_int) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var5_int > 7999) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((fr) this).field_J = false;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var5_int ^ -1) > -7001) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_int > 9250) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((fr) this).field_Ic = false;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var6 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5_int >= 4000) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((fr) this).field_Hb = false;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((fr) this).field_C = ((fr) this).field_C & ((fr) this).field_y.a("GL_ARB_half_float_pixel");
                        ((fr) this).field_K = ((fr) this).field_J;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((fr) this).field_E.indexOf("intel") == -1) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((fr) this).field_xc = false;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = this;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_48_0 = stackOut_47_0;
                        if (((fr) this).field_E.equals((Object) (Object) "s3 graphics")) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = this;
                        stackOut_48_1 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = this;
                        stackOut_49_1 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((fr) this).field_ec = stackIn_50_1 != 0;
                        if (((fr) this).field_J) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var17 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var5 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        kr.a(true, -107, false);
                        ((fr) this).field_jc = true;
                        ((fr) this).field_Pb = new kk((fr) this, ((fr) this).field_h);
                        this.i((byte) -93);
                        ((fr) this).field_Sb = new b((fr) this);
                        ((fr) this).field_D = new eb((fr) this);
                        if (!((fr) this).field_D.a(550267135)) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ((fr) this).field_U = new gq((fr) this);
                        if (((fr) this).field_U.d(-8111)) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ((fr) this).field_U.c(50);
                        ((fr) this).field_U = null;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ((fr) this).field_Kb = new iv((fr) this);
                        this.l(0);
                        this.d(true);
                        ((fr) this).e();
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    var4 = caughtException;
                    var4.printStackTrace();
                    ((fr) this).d();
                    throw new RuntimeException("");
                }
                case 61: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        if (param0 != 20685) {
          return;
        } else {
          L0: {
            if (-1 != (((fr) this).field_Vb ^ -1)) {
              jaggl.OpenGL.glTexEnvi(8960, 34161, param2);
              jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
              break L0;
            } else {
              L1: {
                var4 = 0;
                if (param2 != ((fr) this).field_gc) {
                  jaggl.OpenGL.glTexEnvi(8960, 34161, param2);
                  ((fr) this).field_gc = param2;
                  var4 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (((fr) this).field_v == param1) {
                  break L2;
                } else {
                  jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
                  var4 = 1;
                  ((fr) this).field_v = param1;
                  break L2;
                }
              }
              if (var4 == 0) {
                break L0;
              } else {
                ((fr) this).field_nb = ((fr) this).field_nb & -30;
                break L0;
              }
            }
          }
          return;
        }
    }

    final void b(boolean param0, byte param1) {
        if ((!((fr) this).field_rc ? 1 : 0) == (param0 ? 1 : 0)) {
            ((fr) this).field_rc = param0 ? true : false;
            this.b(true);
        }
        if (param1 >= -63) {
            ((fr) this).field_yb = 22;
        }
    }

    final int[] Y() {
        return new int[]{((fr) this).field_t, ((fr) this).field_db, ((fr) this).field_Nb, ((fr) this).field_sb};
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((fr) this).field_Ub = 26;
        }
        ge var4 = new ge(param2);
        var4.field_h = (long)param0;
        ((fr) this).field_j.a((ms) (Object) var4, (byte) 39);
    }

    final void d() {
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        ms var1 = ((fr) this).field_oc.b(79);
        while (var1 != null) {
            ((ad) (Object) var1).a(-4009);
            var1 = ((fr) this).field_oc.d((byte) 18);
        }
        if (((fr) this).field_D != null) {
            ((fr) this).field_D.a((byte) 113);
        }
        if (!(null == ((fr) this).field_y)) {
            this.h(-27782);
            var1 = (ms) (Object) ((fr) this).field_Gb.keys();
            while (((Enumeration) (Object) var1).hasMoreElements()) {
                var2 = (java.awt.Canvas) ((Enumeration) (Object) var1).nextElement();
                var3 = (Long) ((fr) this).field_Gb.get((Object) (Object) var2);
                ((fr) this).field_y.releaseSurface(var2, var3.longValue());
            }
            ((fr) this).field_y.release();
            ((fr) this).field_y = null;
        }
        if (((fr) this).field_jc) {
            pt.a(false, true, -1);
            ((fr) this).field_jc = false;
        }
    }

    final void a(vc param0) {
    }

    final hr a(ri param0, boolean param1) {
        int[] var3 = null;
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
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          var9 = Sumoblitz.field_L ? 1 : 0;
          var10 = new int[param0.field_i * param0.field_h];
          var14 = var10;
          var13 = var14;
          var12 = var13;
          var11 = var12;
          var3 = var11;
          var4 = 0;
          var5 = 0;
          if (param0.field_a != null) {
            var6_int = 0;
            L1: while (true) {
              if (param0.field_i <= var6_int) {
                break L0;
              } else {
                var7 = 0;
                L2: while (true) {
                  if (param0.field_h <= var7) {
                    var6_int++;
                    continue L1;
                  } else {
                    var5++;
                    var3[var5] = ic.a(param0.field_g[eb.a((int) param0.field_e[var4], 255)], param0.field_a[var4] << 1413514584);
                    var4++;
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var6_int = 0;
            L3: while (true) {
              if (param0.field_i <= var6_int) {
                break L0;
              } else {
                var7 = 0;
                L4: while (true) {
                  if (param0.field_h <= var7) {
                    var6_int++;
                    continue L3;
                  } else {
                    L5: {
                      var4++;
                      var8 = param0.field_g[255 & param0.field_e[var4]];
                      var5++;
                      stackOut_5_0 = (int[]) var10;
                      stackOut_5_1 = var5;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var8 != 0) {
                        stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = ic.a(-16777216, var8);
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        break L5;
                      } else {
                        stackOut_6_0 = (int[]) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 0;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L5;
                      }
                    }
                    stackIn_8_0[stackIn_8_1] = stackIn_8_2;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        var6 = ((fr) this).a(0, -2, param0.field_i, param0.field_h, param0.field_h, var14);
        var6.a(param0.field_c, param0.field_d, param0.field_b, param0.field_f);
        return var6;
    }

    private final void h(int param0) {
        if (param0 != -27782) {
            ((fr) this).b();
        }
        boolean discarded$0 = ((fr) this).field_y.a();
    }

    final boolean c() {
        return true;
    }

    private final void c(boolean param0) {
        if (!(!((fr) this).field_mb)) {
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            ((fr) this).field_mb = false;
        }
        if (param0) {
            ((fr) this).field_cc = null;
        }
    }

    final void DA(int param0, int param1, int param2, int param3) {
        L0: {
          ((fr) this).field_Nb = param2;
          ((fr) this).field_db = param1;
          ((fr) this).field_sb = param3;
          ((fr) this).field_t = param0;
          this.o(770);
          this.m(-117);
          if (((fr) this).field_Q == -4) {
            this.p(-15048);
            break L0;
          } else {
            if (-3 == ((fr) this).field_Q) {
              this.b((byte) -108);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    final vc a(bu param0, nr param1) {
        return null;
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        this.t(1);
        ((fr) this).a(88, (ht) null);
        ((fr) this).c(25189, 0);
        jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
        jaggl.OpenGL.glRasterPos2i(param0, param1);
        jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((fr) this).field_L, param4, param5);
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
    }

    private final void g(byte param0) {
        if (param0 != -81) {
          return;
        } else {
          L0: {
            if (0 == ((fr) this).field_Q) {
              break L0;
            } else {
              ((fr) this).field_Q = 0;
              ((fr) this).field_nb = ((fr) this).field_nb & -32;
              break L0;
            }
          }
          return;
        }
    }

    final boolean s(int param0) {
        int var2 = 35 / ((-45 - param0) / 58);
        return ((fr) this).field_Kb.a(3, (byte) 71);
    }

    final void c(int param0, boolean param1) {
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            ((fr) this).field_Ec = -84;
            break L0;
          }
        }
        L1: {
          if (-2 == param0) {
            ((fr) this).a(20685, 7681, 7681);
            break L1;
          } else {
            if (-1 != param0) {
              if (param0 == -3) {
                ((fr) this).a(20685, 7681, 34165);
                break L1;
              } else {
                if (-4 == param0) {
                  ((fr) this).a(20685, 8448, 260);
                  break L1;
                } else {
                  if (4 == param0) {
                    ((fr) this).a(20685, 34023, 34023);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            } else {
              ((fr) this).a(20685, 8448, 8448);
              break L1;
            }
          }
        }
    }

    final synchronized void a(int param0, byte param1) {
        ms var3 = new ms();
        var3.field_h = (long)param0;
        int var4 = -109 / ((25 - param1) / 42);
        ((fr) this).field_qb.a(var3, (byte) 39);
    }

    final synchronized void b(byte param0, int param1) {
        ge var3 = new ge(param1);
        if (param0 > -1) {
            ((fr) this).field_bb = -108;
        }
        ((fr) this).field_tc.a((ms) (Object) var3, (byte) 39);
    }

    final void b() {
        if (((fr) this).field_xc) {
          if ((Object) (Object) ((fr) this).field_Fb != (Object) (Object) ((fr) this).field_H) {
            throw new RuntimeException();
          } else {
            ((fr) this).field_H.a(0, 17012);
            ((fr) this).field_H.a(8, 17012);
            ((fr) this).a((byte) -123, (mw) (Object) ((fr) this).field_H);
            ((fr) this).field_Tb = null;
            ((fr) this).field_Ec = ((fr) this).field_I;
            ((fr) this).field_Z = ((fr) this).field_s;
            this.g((byte) -81);
            this.h((byte) -81);
            this.j(-1303);
            return;
          }
        } else {
          if (((fr) this).field_Gc) {
            ((fr) this).field_Tb.b(0, ((fr) this).field_Ec, 0, 0, 0, ((fr) this).field_Z, -3773);
            boolean discarded$1 = ((fr) this).field_y.setSurface(((fr) this).field_rb);
            ((fr) this).field_Tb = null;
            ((fr) this).field_Ec = ((fr) this).field_I;
            ((fr) this).field_Z = ((fr) this).field_s;
            this.g((byte) -81);
            this.h((byte) -81);
            this.j(-1303);
            return;
          } else {
            throw new RuntimeException("");
          }
        }
    }

    final void a(za param0) {
        cw var3 = null;
        L0: {
          ((fr) this).field_pb = ((ad) (Object) param0).field_m;
          if (null == ((fr) this).field_Rb) {
            L1: {
              var3 = new cw(80);
              if (((fr) this).field_R) {
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
                break L1;
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
                break L1;
              }
            }
            ((fr) this).field_Rb = ((fr) this).a(20, false, (byte) -23, var3.field_p, var3.field_n);
            jq discarded$2 = new jq(((fr) this).field_Rb, 5126, 3, 0);
            jq discarded$3 = new jq(((fr) this).field_Rb, 5126, 2, 12);
            ((fr) this).field_O.a((fr) this, false);
            break L0;
          } else {
            break L0;
          }
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
        var8 = ((fr) this).field_eb;
        var2 = var8;
        var3 = (float)(-((fr) this).field_t * ((fr) this).field_sc) / (float)((fr) this).field_Nb;
        var4 = (float)((((fr) this).field_Z + -((fr) this).field_t) * ((fr) this).field_sc) / (float)((fr) this).field_Nb;
        if (param0 == 770) {
          L0: {
            L1: {
              var5 = (float)(((fr) this).field_db * ((fr) this).field_sc) / (float)((fr) this).field_sb;
              var6 = (float)((((fr) this).field_db + -((fr) this).field_Ec) * ((fr) this).field_sc) / (float)((fr) this).field_sb;
              if (var3 == var4) {
                break L1;
              } else {
                if (var6 != var5) {
                  var7 = (float)((fr) this).field_sc * 2.0f;
                  var2[6] = 0.0f;
                  var2[4] = 0.0f;
                  var2[8] = (var3 + var4) / (var4 - var3);
                  var2[3] = 0.0f;
                  var2[12] = 0.0f;
                  var2[15] = 0.0f;
                  var2[9] = (var5 + var6) / (var5 - var6);
                  var2[1] = 0.0f;
                  var2[2] = 0.0f;
                  ((fr) this).field_Qb = -(var7 * (float)((fr) this).field_Cb) / (float)(-((fr) this).field_sc + ((fr) this).field_Cb);
                  var2[14] = -(var7 * (float)((fr) this).field_Cb) / (float)(-((fr) this).field_sc + ((fr) this).field_Cb);
                  var2[0] = var7 / (var4 - var3);
                  var2[11] = -1.0f;
                  var2[7] = 0.0f;
                  ((fr) this).field_i = (float)(-(((fr) this).field_sc + ((fr) this).field_Cb)) / (float)(-((fr) this).field_sc + ((fr) this).field_Cb);
                  var2[10] = (float)(-(((fr) this).field_sc + ((fr) this).field_Cb)) / (float)(-((fr) this).field_sc + ((fr) this).field_Cb);
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
        ((fr) this).field_l = param2;
        ((fr) this).field_ub = param0;
        this.i(param1 + 3074);
        if (param1 != 15) {
            this.i((byte) -17);
        }
    }

    private final void p(int param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        L0: {
          var2 = ((fr) this).field_kb * (float)(-((fr) this).field_t) / (float)((fr) this).field_Nb;
          var3 = ((fr) this).field_kb * (float)(-((fr) this).field_db) / (float)((fr) this).field_sb;
          var4 = ((fr) this).field_kb * (float)(-((fr) this).field_t + ((fr) this).field_Z) / (float)((fr) this).field_Nb;
          var5 = ((fr) this).field_kb * (float)(-((fr) this).field_db + ((fr) this).field_Ec) / (float)((fr) this).field_sb;
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          if (var4 == var2) {
            break L0;
          } else {
            if (var5 != var3) {
              jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)((fr) this).field_sc, (double)((fr) this).field_Cb);
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
        ((fr) this).field_q.a((ms) (Object) var4, (byte) 39);
    }

    private final void g(int param0) {
        if (((fr) this).field_r) {
            // if_icmplt L26
            jaggl.OpenGL.glEnable(2912);
        } else {
            jaggl.OpenGL.glDisable(2912);
        }
        if (param0 != 16) {
            ((fr) this).k(-114);
        }
    }

    final void k(int param0) {
        if (param0 != -25462) {
            ((fr) this).field_m = null;
        }
        if (!((((fr) this).field_nb ^ -1) == -5)) {
            this.t(1);
            this.d(param0 + 25465, false);
            this.b(-55, false);
            this.a(param0 ^ -25409, false);
            this.a(false, (byte) -101);
            this.a((byte) 110, -2);
            ((fr) this).c(25189, 1);
            ((fr) this).field_nb = 4;
        }
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (!(((fr) this).field_yc >= param0)) {
            ((fr) this).field_yc = param0;
        }
        if (!(param2 >= ((fr) this).field_jb)) {
            ((fr) this).field_jb = param2;
        }
        if (param1 > ((fr) this).field_Wb) {
            ((fr) this).field_Wb = param1;
        }
        if (!(((fr) this).field_Eb <= param3)) {
            ((fr) this).field_Eb = param3;
        }
        jaggl.OpenGL.glEnable(3089);
        this.m(-124);
        this.r(0);
    }

    final za c(int param0) {
        ad var2 = new ad(param0);
        ((fr) this).field_oc.a((ms) (Object) var2, (byte) 39);
        return (za) (Object) var2;
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = (float)param0 + 0.3499999940395355f;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = var7 + (float)param2;
        this.k((byte) -36);
        float var10 = var8 + (float)param3;
        ((fr) this).c(25189, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 578849936), (byte)(param4 >> -243644312), (byte)param4, (byte)(param4 >> -1853843016));
        if (!(!((fr) this).field_hb)) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (((fr) this).field_hb) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void a(byte param0, int param1) {
        this.a(true, param1, (byte) -102);
        if (param0 < 109) {
            ((fr) this).field_Mb = 30;
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (!(((fr) this).field_Ec >= param3)) {
            param3 = ((fr) this).field_Ec;
        }
        if ((param1 ^ -1) > -1) {
            param1 = 0;
        }
        if (!(((fr) this).field_Z >= param2)) {
            param2 = ((fr) this).field_Z;
        }
        ((fr) this).field_Wb = param1;
        ((fr) this).field_Eb = param3;
        ((fr) this).field_jb = param2;
        ((fr) this).field_yc = param0;
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
        ((fr) this).field_cc.a(var4, (byte) 39);
    }

    private final void b(int param0, mw param1) {
        if (3 <= ((fr) this).field_qc) {
          throw new RuntimeException();
        } else {
          L0: {
            if (param0 == 30369) {
              break L0;
            } else {
              ((fr) this).field_Fc = -0.9330850839614868f;
              break L0;
            }
          }
          L1: {
            if (((fr) this).field_qc < 0) {
              break L1;
            } else {
              ((fr) this).field_m[((fr) this).field_qc].a(-20745);
              break L1;
            }
          }
          ((fr) this).field_qc = ((fr) this).field_qc + 1;
          ((fr) this).field_m[((fr) this).field_qc + 1] = param1;
          ((fr) this).field_hc = param1;
          ((fr) this).field_hc.c(195);
          return;
        }
    }

    private final void j(int param0) {
        ((fr) this).field_Wb = 0;
        ((fr) this).field_yc = 0;
        ((fr) this).field_Eb = ((fr) this).field_Ec;
        if (param0 != -1303) {
          return;
        } else {
          ((fr) this).field_jb = ((fr) this).field_Z;
          jaggl.OpenGL.glDisable(3089);
          this.m(-117);
          return;
        }
    }

    private final void d(int param0, boolean param1) {
        if (!(((fr) this).field_r == param1)) {
            ((fr) this).field_r = param1 ? true : false;
            this.g(16);
            ((fr) this).field_nb = ((fr) this).field_nb & -32;
        }
        if (param0 != 3) {
            ((fr) this).field_R = false;
        }
    }

    final void b(int param0, int param1) throws rf {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          ((fr) this).field_y.swapBuffers();
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (Exception) (Object) decompiledCaughtException;
    }

    final int[] b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        if (param2 != 1) {
            Object var9 = null;
            hr discarded$0 = ((fr) this).a((ri) null, true);
        }
        int[] var10 = new int[param1 * param4];
        int[] var6 = var10;
        for (var7 = 0; param4 > var7; var7++) {
            jaggl.OpenGL.glReadPixelsi(param3, ((fr) this).field_Ec - (param0 - -var7), param1, 1, 32993, ((fr) this).field_L, var10, param1 * var7);
        }
        return var10;
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        this.a((byte) 111, -2);
        var2 = ((fr) this).field_T + -1;
        L0: while (true) {
          if (var2 < 0) {
            ((fr) this).a(param0 + 20685, 8448, 8448);
            ((fr) this).b(34168, 770, 2, 10);
            this.c(false);
            ((fr) this).field_Ab = 1;
            jaggl.OpenGL.glEnable(3042);
            jaggl.OpenGL.glBlendFunc(770, 771);
            ((fr) this).field_zb = 1;
            jaggl.OpenGL.glEnable(3008);
            jaggl.OpenGL.glAlphaFunc(516, 0.0f);
            ((fr) this).field_A = true;
            jaggl.OpenGL.glColorMask(true, true, true, true);
            ((fr) this).field_tb = true;
            this.d(param0 ^ 3, true);
            this.b(-44, true);
            this.a(84, true);
            this.a(true, (byte) -76);
            this.g((byte) -81);
            ((fr) this).field_y.setSwapInterval(0);
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
            var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
            var3 = param0;
            L1: while (true) {
              if (-9 >= (var3 ^ -1)) {
                jaggl.OpenGL.glEnable(16384);
                jaggl.OpenGL.glEnable(16385);
                jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                jaggl.OpenGL.glFogi(2917, 9729);
                jaggl.OpenGL.glHint(3156, 4353);
                ((fr) this).field_P = -1;
                this.j(param0 + -1303);
                return;
              } else {
                var4 = 16384 + var3;
                jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
                jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
                jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
                var3++;
                continue L1;
              }
            }
          } else {
            ((fr) this).g(var2, 90);
            ((fr) this).a(param0 + 111, (ht) null);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            var2--;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var9 = 0.0f;
        this.k((byte) -99);
        ((fr) this).c(25189, param5);
        float var7 = (float)(-param0) + (float)param2;
        float var8 = (float)param3 - (float)param1;
        if (0.0f == var7) {
            // ifne L51
            var7 = 1.0f;
        } else {
            var9 = (float)(1.0 / Math.sqrt((double)(var8 * var8 + var7 * var7)));
            var8 = var8 * var9;
            var7 = var7 * var9;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> -934269296), (byte)(param4 >> -963075224), (byte)param4, (byte)(param4 >> 1714339160));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param0, (float)param1 + 0.3499999940395355f);
        jaggl.OpenGL.glVertex2f(var7 + (float)param2 + 0.3499999940395355f, 0.3499999940395355f + (var8 + (float)param3));
        jaggl.OpenGL.glEnd();
    }

    private final void b(int param0, boolean param1) {
        if ((!((fr) this).field_Bb ? 1 : 0) == (param1 ? 1 : 0)) {
            ((fr) this).field_Bb = param1 ? true : false;
            this.b(true);
            ((fr) this).field_nb = ((fr) this).field_nb & -8;
        }
        if (param0 > -8) {
            ((fr) this).field_nc = null;
        }
    }

    private final void a(boolean param0, byte param1) {
        int stackIn_4_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        if (param1 >= -73) {
          return;
        } else {
          L0: {
            if (param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            if (stackIn_4_0 == (((fr) this).field_S ? 1 : 0)) {
              L2: {
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (!param0) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              ((fr) this).field_S = stackIn_9_1 != 0;
              this.n(-112);
              ((fr) this).field_nb = ((fr) this).field_nb & -32;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int XA() {
        return ((fr) this).field_Cb;
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
            ((fr) this).T(-87, -86, 40, 96);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((fr) this).field_jb < ((fr) this).field_yc) {
              break L2;
            } else {
              if (((fr) this).field_Wb <= ((fr) this).field_Eb) {
                jaggl.OpenGL.glScissor(((fr) this).field_yc + ((fr) this).field_pc, -((fr) this).field_Eb + ((fr) this).field_Ec + ((fr) this).field_bb, ((fr) this).field_jb + -((fr) this).field_yc, -((fr) this).field_Wb + ((fr) this).field_Eb);
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
            ((fr) this).field_r = false;
        }
        return null == ((fr) this).field_Y ? null : ((fr) this).field_Y.b((byte) 113);
    }

    final synchronized void f(int param0) {
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
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        param0 = param0 & 2147483647;
        L0: while (true) {
          if (((fr) this).field_j.a((byte) -119)) {
            L1: {
              if (-1 > (var2 ^ -1)) {
                jaggl.OpenGL.glDeleteBuffersARB(var2, gr.field_h, 0);
                var2 = 0;
                L2: while (true) {
                  if (((fr) this).field_q.a((byte) -101)) {
                    break L1;
                  } else {
                    var6 = (ge) (Object) ((fr) this).field_q.c(9);
                    var2++;
                    gr.field_h[var2] = (int)var6.field_h;
                    ((fr) this).field_p = ((fr) this).field_p - var6.field_m;
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
                  if (((fr) this).field_q.a((byte) -101)) {
                    break L1;
                  } else {
                    var6 = (ge) (Object) ((fr) this).field_q.c(9);
                    var2++;
                    gr.field_h[var2] = (int)var6.field_h;
                    ((fr) this).field_p = ((fr) this).field_p - var6.field_m;
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
              if (((fr) this).field_tc.a((byte) -93)) {
                L6: {
                  if (-1 > (var2 ^ -1)) {
                    jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gr.field_h, 0);
                    var2 = 0;
                    L7: while (true) {
                      if (((fr) this).field_fc.a((byte) -78)) {
                        break L6;
                      } else {
                        var8 = (ge) (Object) ((fr) this).field_fc.c(9);
                        var2++;
                        gr.field_h[var2] = (int)var8.field_h;
                        ((fr) this).field_V = ((fr) this).field_V - var8.field_m;
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
                      if (((fr) this).field_fc.a((byte) -78)) {
                        break L6;
                      } else {
                        var8 = (ge) (Object) ((fr) this).field_fc.c(9);
                        var2++;
                        gr.field_h[var2] = (int)var8.field_h;
                        ((fr) this).field_V = ((fr) this).field_V - var8.field_m;
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
                  if (!((fr) this).field_fb.a((byte) -119)) {
                    var9 = (ge) (Object) ((fr) this).field_fb.c(9);
                    jaggl.OpenGL.glDeleteLists((int)var9.field_h, var9.field_m);
                    continue L10;
                  } else {
                    L11: while (true) {
                      if (((fr) this).field_qb.a((byte) -124)) {
                        L12: while (true) {
                          if (!((fr) this).field_cc.a((byte) -67)) {
                            var11 = ((fr) this).field_cc.c(9);
                            jaggl.OpenGL.glDeleteObjectARB(var11.field_h);
                            continue L12;
                          } else {
                            L13: while (true) {
                              if (((fr) this).field_fb.a((byte) -96)) {
                                L14: {
                                  ((fr) this).field_Pb.a(122);
                                  if (100663296 >= this.e((byte) 7)) {
                                    break L14;
                                  } else {
                                    if (wq.a(-64) > ((fr) this).field_vc - -60000L) {
                                      System.gc();
                                      ((fr) this).field_vc = wq.a(-78);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                ((fr) this).field_Ac = param0;
                                return;
                              } else {
                                var12 = (ge) (Object) ((fr) this).field_fb.c(9);
                                jaggl.OpenGL.glDeleteLists((int)var12.field_h, var12.field_m);
                                continue L13;
                              }
                            }
                          }
                        }
                      } else {
                        var10 = ((fr) this).field_qb.c(9);
                        jaggl.OpenGL.glDeleteProgramARB((int)var10.field_h);
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                var7 = (ge) (Object) ((fr) this).field_tc.c(9);
                var2++;
                gr.field_h[var2] = var7.field_m;
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
            var5 = (ge) (Object) ((fr) this).field_j.c(9);
            var2++;
            gr.field_h[var2] = (int)var5.field_h;
            ((fr) this).field_Xb = ((fr) this).field_Xb - var5.field_m;
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
        if (param2 != -23) {
            ((fr) this).field_jb = -14;
        }
        if (!((fr) this).field_J) {
            return (fk) (Object) new sl((fr) this, param0, param4, param3);
        }
        if (param1) {
            // ifne L50
        } else {
            return (fk) (Object) new hn((fr) this, param0, param4, param3, param1);
        }
        return (fk) (Object) new sl((fr) this, param0, param4, param3);
    }

    final void e(int param0, int param1) {
        lu.field_g[0] = (float)eb.a(param1, 16711680) / 16711680.0f;
        lu.field_g[2] = (float)eb.a(255, param1) / 255.0f;
        lu.field_g[1] = (float)eb.a(65280, param1) / 65280.0f;
        lu.field_g[3] = (float)(param1 >>> 2030469848) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, lu.field_g, param0);
    }

    final void a(mw param0, int param1) {
        if (!((fr) this).field_B) {
          if (((fr) this).field_Jb >= 3) {
            throw new RuntimeException();
          } else {
            L0: {
              if (0 > ((fr) this).field_Jb) {
                break L0;
              } else {
                ((fr) this).field_dc[((fr) this).field_Jb].e(-65);
                break L0;
              }
            }
            L1: {
              ((fr) this).field_Jb = ((fr) this).field_Jb + 1;
              ((fr) this).field_dc[((fr) this).field_Jb + 1] = param0;
              ((fr) this).field_Fb = param0;
              ((fr) this).field_hc = param0;
              ((fr) this).field_hc.b(30352);
              if (param1 < -70) {
                break L1;
              } else {
                ((fr) this).field_R = true;
                break L1;
              }
            }
            return;
          }
        } else {
          this.b(30369, param0);
          this.a(4608, param0);
          L2: {
            if (param1 < -70) {
              break L2;
            } else {
              ((fr) this).field_R = true;
              break L2;
            }
          }
          return;
        }
    }

    final void f(int param0, int param1) {
        if (param0 == ((fr) this).field_sc) {
            // if_icmpeq L84
        }
        ((fr) this).field_sc = param0;
        ((fr) this).field_Cb = param1;
        this.o(770);
        this.i(3089);
        if ((((fr) this).field_Q ^ -1) != -4) {
            // if_icmpne L84
            this.b((byte) -110);
        } else {
            this.p(-15048);
        }
    }

    private final void i(byte param0) {
        int var2 = 9 / ((param0 - 14) / 61);
        ((fr) this).field_ib = new ht[((fr) this).field_T];
        ((fr) this).field_n = new us((fr) this, 3553, 6408, 1, 1);
        us discarded$0 = new us((fr) this, 3553, 6408, 1, 1);
        us discarded$1 = new us((fr) this, 3553, 6408, 1, 1);
        lf discarded$2 = new lf((fr) this);
        lf discarded$3 = new lf((fr) this);
        lf discarded$4 = new lf((fr) this);
        lf discarded$5 = new lf((fr) this);
        lf discarded$6 = new lf((fr) this);
        lf discarded$7 = new lf((fr) this);
        lf discarded$8 = new lf((fr) this);
        lf discarded$9 = new lf((fr) this);
        lf discarded$10 = new lf((fr) this);
        lf discarded$12 = new lf((fr) this);
        if (((fr) this).field_xc) {
            ((fr) this).field_G = new cs((fr) this);
            cs discarded$13 = new cs((fr) this);
        }
    }

    final void a(byte param0, mw param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = -102 % ((62 - param0) / 55);
        if (!((fr) this).field_B) {
          if (((fr) this).field_Jb >= 0) {
            if (((fr) this).field_dc[((fr) this).field_Jb] != param1) {
              throw new RuntimeException();
            } else {
              L0: {
                ((fr) this).field_Jb = ((fr) this).field_Jb - 1;
                ((fr) this).field_dc[((fr) this).field_Jb] = null;
                param1.e(-98);
                if (-1 >= (((fr) this).field_Jb ^ -1)) {
                  ((fr) this).field_Fb = ((fr) this).field_dc[((fr) this).field_Jb];
                  ((fr) this).field_hc = ((fr) this).field_dc[((fr) this).field_Jb];
                  ((fr) this).field_hc.b(30352);
                  break L0;
                } else {
                  ((fr) this).field_Fb = null;
                  ((fr) this).field_hc = null;
                  break L0;
                }
              }
              return;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          this.c(param1, 71);
          this.b(param1, -963075224);
          return;
        }
    }

    private final void a(boolean param0, int param1, byte param2) {
        if (param2 > -65) {
            return;
        }
        this.a(param1, 118, true, param0);
    }

    private final void t(int param0) {
        if (param0 != ((fr) this).field_Q) {
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glLoadIdentity();
            if (((fr) this).field_Z < -1) {
                if (-1 < ((fr) this).field_Ec) {
                    jaggl.OpenGL.glOrtho(0.0, (double)((fr) this).field_Z, (double)((fr) this).field_Ec, 0.0, -1.0, 1.0);
                }
            }
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            ((fr) this).field_Q = 1;
            ((fr) this).field_nb = ((fr) this).field_nb & -25;
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
        if (((fr) this).field_yc <= param0 - -param2) {
          L1: {
            if (-param2 + param0 > ((fr) this).field_jb) {
              break L1;
            } else {
              if (param1 - -param2 < ((fr) this).field_Wb) {
                break L1;
              } else {
                if (((fr) this).field_Eb >= param1 - param2) {
                  this.k((byte) 127);
                  ((fr) this).c(25189, param4);
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
            ((fr) this).field_K = false;
            break L0;
          }
        }
        if (param0 != -6407) {
          if (6409 != param0) {
            L1: {
              if (param0 == 6410) {
                break L1;
              } else {
                if (-34847 == param0) {
                  break L1;
                } else {
                  if (param0 != 34844) {
                    if (6407 != param0) {
                      if (-6409 != (param0 ^ -1)) {
                        if (param0 != 34847) {
                          if ((param0 ^ -1) != -34844) {
                            if (param0 != 34842) {
                              if (param0 != -6403) {
                                if (-6402 == param0) {
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
        return (hr) (Object) new cm((fr) this, param3, param4, param0, param1, param2);
    }

    final void a(hr param0, boolean param1) {
        wh var3 = null;
        wh var3_ref = null;
        kf var3_ref2 = null;
        pj var4 = null;
        int var6 = 0;
        wh var7 = null;
        wh var8 = null;
        kf var9 = null;
        kf var10 = null;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          ((fr) this).field_Tb = (cm) (Object) param0;
          if (((fr) this).field_xc) {
            L1: {
              if (null != ((fr) this).field_H) {
                break L1;
              } else {
                ((fr) this).field_H = new cs((fr) this);
                break L1;
              }
            }
            if ((Object) (Object) ((fr) this).field_Fb == (Object) (Object) ((fr) this).field_H) {
              throw new RuntimeException();
            } else {
              L2: {
                ((fr) this).a((mw) (Object) ((fr) this).field_H, -125);
                if (param1) {
                  L3: {
                    var3_ref2 = (kf) (Object) ((fr) this).field_nc.a(127, (long)(((fr) this).field_Tb.c() << -218281392 | ((fr) this).field_Tb.a()));
                    if (var3_ref2 != null) {
                      break L3;
                    } else {
                      var9 = new kf((fr) this, 6402, ((fr) this).field_Tb.c(), ((fr) this).field_Tb.a());
                      var3_ref = (wh) (Object) var9;
                      ((fr) this).field_ic = ((fr) this).field_ic + var9.field_s;
                      L4: while (true) {
                        L5: {
                          if (-2097153 <= (((fr) this).field_ic ^ -1)) {
                            break L5;
                          } else {
                            var4 = ((fr) this).field_Db.c((byte) 126);
                            if (var4 == null) {
                              break L5;
                            } else {
                              var10 = (kf) (Object) var4;
                              var10.c(-5106);
                              var10.b(false);
                              var10.g(-127);
                              ((fr) this).field_ic = ((fr) this).field_ic - var10.field_s;
                              continue L4;
                            }
                          }
                        }
                        ((fr) this).field_nc.a((ms) (Object) var9, -1, (long)(((fr) this).field_Tb.c() << 462343888 | ((fr) this).field_Tb.a()));
                        break L3;
                      }
                    }
                  }
                  ((fr) this).field_Db.a((pj) (Object) var3_ref, -4);
                  ((fr) this).field_H.a((kf) (Object) var3_ref, 8, -14269);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((fr) this).field_H.a((us) (Object) ((fr) this).field_Tb.field_g, -4610, 0);
              break L0;
            }
          } else {
            if (!((fr) this).field_Gc) {
              throw new RuntimeException("");
            } else {
              L6: {
                var3 = (wh) (Object) ((fr) this).field_nc.a(117, (long)(((fr) this).field_Tb.c() << -904794352 | ((fr) this).field_Tb.a()));
                if (var3 == null) {
                  var7 = new wh((fr) this, ((fr) this).field_Tb.c(), ((fr) this).field_Tb.a());
                  var3_ref = var7;
                  ((fr) this).field_ic = ((fr) this).field_ic + var7.field_v * 4;
                  L7: while (true) {
                    L8: {
                      if (((fr) this).field_ic <= 2097152) {
                        break L8;
                      } else {
                        var4 = ((fr) this).field_Db.c((byte) 126);
                        if (var4 == null) {
                          break L8;
                        } else {
                          var8 = (wh) (Object) var4;
                          var8.c(-5106);
                          var8.b(false);
                          ((fr) this).field_y.releasePbuffer(var8.e(-99));
                          ((fr) this).field_ic = ((fr) this).field_ic - var8.field_v;
                          continue L7;
                        }
                      }
                    }
                    ((fr) this).field_nc.a((ms) (Object) var7, -1, (long)(((fr) this).field_Tb.c() << 999637776 | ((fr) this).field_Tb.a()));
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              ((fr) this).field_Db.a((pj) (Object) var3_ref, -4);
              ((fr) this).field_y.setPbuffer(var3_ref.e(-106));
              break L0;
            }
          }
        }
        ((fr) this).field_Z = param0.c();
        ((fr) this).field_Ec = param0.a();
        this.g((byte) -81);
        this.h((byte) -98);
        this.j(-1303);
    }

    final void a(fk param0, int param1) {
        if (param0 != ((fr) this).field_zc) {
            if (((fr) this).field_J) {
                jaggl.OpenGL.glBindBufferARB(34962, param0.a(2721));
            }
            ((fr) this).field_zc = param0;
        }
        if (param1 > -110) {
            ((fr) this).field_Tb = null;
        }
    }

    private final void h(byte param0) {
        jaggl.OpenGL.glViewport(((fr) this).field_pc, ((fr) this).field_bb, ((fr) this).field_Z, ((fr) this).field_Ec);
        if (param0 >= -16) {
            ((fr) this).field_qb = null;
        }
    }

    private final int e(byte param0) {
        if (param0 != 7) {
            ((fr) this).field_vb = true;
        }
        return ((fr) this).field_V + (((fr) this).field_p + ((fr) this).field_Xb);
    }

    private final void a(int param0, mw param1) {
        if (param0 == 4608) {
          if (((fr) this).field_w <= -4) {
            throw new RuntimeException();
          } else {
            L0: {
              if (-1 <= ((fr) this).field_w) {
                ((fr) this).field_Hc[((fr) this).field_w].a(false);
                break L0;
              } else {
                break L0;
              }
            }
            ((fr) this).field_w = ((fr) this).field_w + 1;
            ((fr) this).field_Hc[((fr) this).field_w + 1] = param1;
            ((fr) this).field_Fb = param1;
            ((fr) this).field_Fb.d(param0 ^ 4725);
            return;
          }
        } else {
          return;
        }
    }

    final int i() {
        return ((fr) this).field_sc;
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
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
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
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 25189) {
            break L0;
          } else {
            ((fr) this).field_pb = null;
            break L0;
          }
        }
        L1: {
          if (param1 == ((fr) this).field_Ab) {
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
              if ((((fr) this).field_tb ? 1 : 0) == var3) {
                break L3;
              } else {
                L4: {
                  jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
                  stackOut_11_0 = this;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var3 == 0) {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L4;
                  } else {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    break L4;
                  }
                }
                ((fr) this).field_tb = stackIn_14_1 != 0;
                break L3;
              }
            }
            L5: {
              if (((fr) this).field_A) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = 1;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            L6: {
              stackOut_18_0 = stackIn_18_0;
              stackIn_20_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (var4 != 0) {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L6;
              } else {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                break L6;
              }
            }
            L7: {
              if (stackIn_21_0 != stackIn_21_1) {
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
                  stackOut_26_0 = this;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (var4 == 0) {
                    stackOut_28_0 = this;
                    stackOut_28_1 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    break L9;
                  } else {
                    stackOut_27_0 = this;
                    stackOut_27_1 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    break L9;
                  }
                }
                ((fr) this).field_A = stackIn_29_1 != 0;
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (var5 == ((fr) this).field_zb) {
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
                ((fr) this).field_zb = var5;
                break L10;
              }
            }
            ((fr) this).field_Ab = param1;
            ((fr) this).field_nb = ((fr) this).field_nb & -29;
            break L1;
          }
        }
    }

    private final void b(boolean param0) {
        Object var3 = null;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = null;
            vc discarded$2 = ((fr) this).a((bu) null, (nr) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((fr) this).field_Bb) {
              break L2;
            } else {
              if (!((fr) this).field_rc) {
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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (((fr) this).field_ec) {
          if (0 < ((fr) this).field_Z) {
            if ((((fr) this).field_Ec ^ -1) >= -1) {
              return;
            } else {
              var1 = ((fr) this).field_yc;
              var2 = ((fr) this).field_jb;
              var3 = ((fr) this).field_Wb;
              var4 = ((fr) this).field_Eb;
              this.j(-1303);
              jaggl.OpenGL.glReadBuffer(1028);
              jaggl.OpenGL.glDrawBuffer(1029);
              this.g((byte) -81);
              this.d(3, false);
              this.b(-119, false);
              this.a(108, false);
              this.a(false, (byte) -115);
              ((fr) this).a(83, (ht) null);
              this.a((byte) 124, -2);
              ((fr) this).c(1, true);
              ((fr) this).c(25189, 0);
              jaggl.OpenGL.glMatrixMode(5889);
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
              jaggl.OpenGL.glMatrixMode(5888);
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glRasterPos2i(0, 0);
              jaggl.OpenGL.glCopyPixels(0, 0, ((fr) this).field_Z, ((fr) this).field_Ec, 6144);
              jaggl.OpenGL.glFlush();
              jaggl.OpenGL.glReadBuffer(1029);
              jaggl.OpenGL.glDrawBuffer(1029);
              ((fr) this).KA(var1, var3, var2, var4);
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
        ((fr) this).c(25189, 0);
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 1986867960) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    private final void a(int param0, int param1, boolean param2, boolean param3) {
        us var5 = null;
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
            if (((fr) this).field_wc != param0) {
              break L1;
            } else {
              L2: {
                if (((fr) this).field_uc) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L2;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  break L2;
                }
              }
              if (stackIn_4_0 != (((fr) this).field_gb ? 1 : 0)) {
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
            if (!((fr) this).field_uc) {
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
                  var5 = ((fr) this).field_Pb.a(0, param0);
                  var10 = ((fr) this).field_h.a(-29193, param0);
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
                    stackOut_14_0 = 64;
                    stackIn_15_0 = stackOut_14_0;
                    break L7;
                  } else {
                    stackOut_13_0 = 128;
                    stackIn_15_0 = stackOut_13_0;
                    break L7;
                  }
                }
                var11 = stackIn_15_0;
                var12 = 50 * var11;
                this.a((float)(var10.field_u * (((fr) this).field_Ac % var12)) / (float)var12, 0.0f, (float)(var10.field_c * (((fr) this).field_Ac % var12)) / (float)var12, 32151);
                break L5;
              }
              L8: {
                if (((fr) this).field_uc) {
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
            ((fr) this).field_Kb.a(param2, var8, 125, var7, param3, var9);
            if (!((fr) this).field_Kb.a(var6, (byte) 71, (ht) (Object) var5)) {
              ((fr) this).a(103, (ht) (Object) var5);
              ((fr) this).c(var6, true);
              break L9;
            } else {
              break L9;
            }
          }
          ((fr) this).field_gb = ((fr) this).field_uc;
          ((fr) this).field_wc = param0;
          break L0;
        }
        L10: {
          ((fr) this).field_nb = ((fr) this).field_nb & -8;
          if (param1 > 109) {
            break L10;
          } else {
            int discarded$1 = ((fr) this).b(-42, (byte) -3);
            break L10;
          }
        }
    }

    private final void b(mw param0, int param1) {
        if (((fr) this).field_w >= 0) {
            // if_acmpne L23
        } else {
            throw new RuntimeException();
        }
        if (param1 != -963075224) {
            ((fr) this).field_ac = -0.3817848265171051f;
        }
        ((fr) this).field_w = ((fr) this).field_w - 1;
        ((fr) this).field_Hc[((fr) this).field_w] = null;
        param0.a(false);
        if (-1 >= (((fr) this).field_w ^ -1)) {
            ((fr) this).field_Fb = ((fr) this).field_Hc[((fr) this).field_w];
            ((fr) this).field_Fb.d(param1 + 963075341);
        } else {
            ((fr) this).field_Fb = null;
        }
    }

    private final void a(int param0, boolean param1) {
        if ((!param1 ? 1 : 0) == (!((fr) this).field_x ? 1 : 0)) {
        } else {
            if (param1) {
                jaggl.OpenGL.glEnable(2929);
            } else {
                jaggl.OpenGL.glDisable(2929);
            }
            ((fr) this).field_x = param1 ? true : false;
            ((fr) this).field_nb = ((fr) this).field_nb & -32;
        }
        if (param0 <= 52) {
            ((fr) this).field_oc = null;
        }
    }

    private final void i(int param0) {
        ((fr) this).field_Lb = (float)(-((fr) this).field_lc + ((fr) this).field_Cb) - ((fr) this).field_l;
        ((fr) this).field_bc = -((float)((fr) this).field_kc * ((fr) this).field_ub) + ((fr) this).field_Lb;
        if (!(((fr) this).field_bc >= (float)((fr) this).field_sc)) {
            ((fr) this).field_bc = (float)((fr) this).field_sc;
        }
        jaggl.OpenGL.glFogf(2915, ((fr) this).field_bc);
        if (param0 != 3089) {
            return;
        }
        jaggl.OpenGL.glFogf(2916, ((fr) this).field_Lb);
        lu.field_g[1] = (float)eb.a(((fr) this).field_P, 65280) / 65280.0f;
        lu.field_g[2] = (float)eb.a(255, ((fr) this).field_P) / 255.0f;
        lu.field_g[0] = (float)eb.a(((fr) this).field_P, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, lu.field_g, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
