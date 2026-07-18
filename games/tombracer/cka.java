/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cka extends ha {
    static int[] field_Mc;
    private long field_dd;
    static jea field_fd;
    private int field_R;
    static int field_ab;
    int field_I;
    static int field_Z;
    private int field_C;
    static float field_jc;
    private Hashtable field_p;
    private long field_n;
    jaggl.OpenGL field_l;
    static int field_H;
    private java.awt.Canvas field_ad;
    private int field_Y;
    private doa field_Ec;
    int field_gb;
    private hsa field_hd;
    private uua field_Hb;
    private uv field_T;
    int field_dc;
    private cw field_L;
    private oba field_fc;
    oba field_mc;
    private boolean field_Ob;
    mq field_zc;
    jaclib.memory.heap.NativeHeap field_md;
    int field_Oc;
    private vna field_qb;
    private ks field_Qb;
    private int field_A;
    private ks[] field_M;
    private ks[] field_kd;
    private ks[] field_ub;
    private jja field_Mb;
    private vj field_F;
    private cb field_bb;
    private int field_Zc;
    private ks field_t;
    private int field_x;
    private ji field_Wc;
    private vna field_Lc;
    int field_jb;
    int field_mb;
    private int field_rc;
    private int field_Tb;
    private vna field_pd;
    private vna field_K;
    private vna field_cc;
    private vna field_Vb;
    private vna field_Fc;
    private vna field_rb;
    private boolean field_lb;
    private long field_Lb;
    private boolean field_d;
    private int field_ld;
    private boolean field_q;
    private boolean field_Nc;
    oba field_jd;
    private int field_y;
    private int field_Jb;
    oba field_j;
    oba field_Tc;
    private boolean field_pb;
    int field_Gc;
    int field_P;
    private String field_k;
    private float field_yc;
    float field_Db;
    int field_vb;
    tj field_Rb;
    private float[] field_Ab;
    private float field_zb;
    boolean field_V;
    private int field_g;
    private int field_pc;
    np field_w;
    private int field_db;
    np field_Ub;
    private boolean field_nc;
    np field_sc;
    private float[] field_Bb;
    private boolean field_Ac;
    np field_i;
    private float field_oc;
    float field_Uc;
    float field_wc;
    private float field_Zb;
    boolean field_id;
    private boolean field_U;
    private boolean field_bd;
    boolean field_z;
    boolean field_Cc;
    private int field_o;
    tj field_Bc;
    float field_bc;
    boolean field_hc;
    private boolean field_S;
    private int field_Xc;
    cb field_ic;
    private int field_ac;
    boolean field_Gb;
    private int field_gd;
    private int field_r;
    private boolean field_Jc;
    boolean field_O;
    private int field_uc;
    int field_N;
    private int field_Ib;
    private int field_J;
    private boolean field_hb;
    np field_Xb;
    np field_yb;
    private float field_xb;
    private int field_fb;
    float field_nd;
    rt field_lc;
    np field_Nb;
    float field_m;
    int field_Kb;
    float field_u;
    private int field_Yb;
    float field_tc;
    private float field_ec;
    float field_od;
    private va field_X;
    int field_xc;
    private String field_h;
    private float field_Cb;
    private kl[] field_vc;
    boolean field_Vc;
    boolean field_G;
    float[] field_Wb;
    private float[] field_ib;
    boolean field_wb;
    private boolean field_v;
    private int field_B;
    private int field_Pc;
    private int field_Hc;
    private boolean field_Q;
    private int field_sb;
    private int field_kc;
    int field_nb;
    float field_cd;
    int field_kb;
    float field_Sb;
    private boolean field_qc;
    private sca field_Rc;
    qf field_cb;
    np field_eb;
    private int field_f;
    np field_D;
    private int field_e;
    boolean field_Kc;
    private jp field_Sc;
    private ob[] field_Dc;
    boolean field_Eb;
    np field_E;
    float field_s;
    private int field_ob;
    boolean field_ed;
    float field_Fb;
    int field_W;
    private int field_gc;
    int field_Ic;
    private float field_Qc;
    private va field_tb;
    private boolean field_Yc;
    private float[] field_Pb;

    final void a(int param0, int param1) throws qva {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            ((cka) this).field_l.swapBuffers();
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

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.i((byte) -118);
        ((cka) this).a((byte) 50, param4);
        float var6 = 0.3499999940395355f + (float)param0;
        float var7 = (float)param1 + 0.3499999940395355f;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
        jaggl.OpenGL.glEnd();
    }

    final gda b() {
        return (gda) (Object) new oba();
    }

    final void a(jca param0) {
    }

    final ka a(oc param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        np stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        np stackOut_0_0 = null;
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
            stackOut_0_0 = new np((cka) this, param0, param1, param3, param4, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("cka.MB(");
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
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (ka) (Object) stackIn_1_0;
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = (float)param2 + var7;
        this.i((byte) -116);
        float var10 = (float)param3 + var8;
        ((cka) this).a((byte) 40, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        if (!(!((cka) this).field_S)) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (((cka) this).field_S) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void c(int param0, boolean param1) {
        if ((!param1 ? 1 : 0) != (!((cka) this).field_d ? 1 : 0)) {
            if (param1) {
                jaggl.OpenGL.glEnable(2929);
            } else {
                jaggl.OpenGL.glDisable(2929);
            }
            ((cka) this).field_y = ((cka) this).field_y & -32;
            ((cka) this).field_d = param1 ? true : false;
        }
    }

    final void d() {
        L0: {
          if (((cka) this).field_id) {
            if ((Object) (Object) ((cka) this).field_Qb == (Object) (Object) ((cka) this).field_bb) {
              ((cka) this).field_bb.a(-92, 0);
              ((cka) this).field_bb.a(-120, 8);
              ((cka) this).b((ks) (Object) ((cka) this).field_bb, 0);
              break L0;
            } else {
              throw new RuntimeException();
            }
          } else {
            if (!((cka) this).field_Yc) {
              throw new RuntimeException("");
            } else {
              ((cka) this).field_Mb.b(((cka) this).field_I, 0, 0, 0, ((cka) this).field_Y, 8448, 0);
              boolean discarded$14 = ((cka) this).field_l.setSurface(((cka) this).field_n);
              break L0;
            }
          }
        }
        ((cka) this).field_I = ((cka) this).field_C;
        ((cka) this).field_Mb = null;
        ((cka) this).field_Y = ((cka) this).field_R;
        this.s(3682);
        this.h((byte) 114);
        ((cka) this).la();
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (!(param2 >= ((cka) this).field_B)) {
            ((cka) this).field_B = param2;
        }
        if (param3 < ((cka) this).field_kc) {
            ((cka) this).field_kc = param3;
        }
        if (((cka) this).field_f < param1) {
            ((cka) this).field_f = param1;
        }
        if (!(((cka) this).field_Ib >= param0)) {
            ((cka) this).field_Ib = param0;
        }
        jaggl.OpenGL.glEnable(3089);
        this.r((byte) -115);
        this.q((byte) 123);
    }

    final void b(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 - -param2, param0);
        if (param1 != 3) {
            ((cka) this).field_k = null;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34200 - -param2, param3);
    }

    final void a(int param0, int param1, int param2) {
        ((cka) this).field_Pc = param1;
        ((cka) this).field_g = param2;
        this.h((byte) -114);
        this.q((byte) 83);
        if (param0 != 4) {
            ((cka) this).field_od = 2.034196376800537f;
        }
    }

    final va a(int param0, byte[] param1, int param2, boolean param3, byte param4) {
        RuntimeException var6 = null;
        wo stackIn_5_0 = null;
        lra stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        wo stackOut_4_0 = null;
        lra stackOut_8_0 = null;
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
              if (!((cka) this).field_Q) {
                break L1;
              } else {
                L2: {
                  if (!param3) {
                    break L2;
                  } else {
                    if (!((cka) this).field_bd) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_4_0 = new wo((cka) this, param2, param1, param0, param3);
                stackIn_5_0 = stackOut_4_0;
                return (va) (Object) stackIn_5_0;
              }
            }
            L3: {
              if (param4 >= 40) {
                break L3;
              } else {
                za discarded$2 = ((cka) this).a(89);
                break L3;
              }
            }
            stackOut_8_0 = new lra((cka) this, param2, param1, param0);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("cka.JC(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (va) (Object) stackIn_9_0;
    }

    private final void m(byte param0) {
        L0: {
          L1: {
            if (!((cka) this).field_Ac) {
              break L1;
            } else {
              if (((cka) this).field_v) {
                break L1;
              } else {
                jaggl.OpenGL.glEnable(2896);
                break L0;
              }
            }
          }
          jaggl.OpenGL.glDisable(2896);
          break L0;
        }
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = 0.3499999940395355f + (float)param1;
        float var9 = var7 + (float)param2 - 1.0f;
        float var10 = var8 + (float)param3 - 1.0f;
        this.i((byte) -119);
        ((cka) this).a((byte) 21, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        if (((cka) this).field_S) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(2);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (!(!((cka) this).field_S)) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void l(int param0) {
        float var2 = (float)(-((cka) this).field_o) * ((cka) this).field_yc / (float)((cka) this).field_W;
        float var3 = ((cka) this).field_yc * (float)(-((cka) this).field_db) / (float)((cka) this).field_kb;
        float var4 = ((cka) this).field_yc * (float)(-((cka) this).field_o + ((cka) this).field_Y) / (float)((cka) this).field_W;
        float var5 = ((cka) this).field_yc * (float)(((cka) this).field_I - ((cka) this).field_db) / (float)((cka) this).field_kb;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (var4 != var2) {
            if (!(var5 == var3)) {
                jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)((cka) this).field_Gc, (double)((cka) this).field_ob);
            }
        }
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0 != -4709) {
            ((cka) this).c(true);
        }
    }

    private final void q(byte param0) {
        L0: {
          if (param0 > 1) {
            break L0;
          } else {
            ((cka) this).field_nc = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((cka) this).field_B < ((cka) this).field_Ib) {
              break L2;
            } else {
              if (((cka) this).field_f <= ((cka) this).field_kc) {
                jaggl.OpenGL.glScissor(((cka) this).field_Ib + ((cka) this).field_g, -((cka) this).field_kc + (((cka) this).field_Pc - -((cka) this).field_I), ((cka) this).field_B - ((cka) this).field_Ib, -((cka) this).field_f + ((cka) this).field_kc);
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

    final void a(boolean param0, kl param1) {
        kl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = ((cka) this).field_vc[((cka) this).field_r];
              if (var3 != param1) {
                L2: {
                  if (param1 == null) {
                    jaggl.OpenGL.glDisable(var3.field_e);
                    break L2;
                  } else {
                    L3: {
                      if (var3 != null) {
                        if (param1.field_e != var3.field_e) {
                          jaggl.OpenGL.glDisable(var3.field_e);
                          jaggl.OpenGL.glEnable(param1.field_e);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        jaggl.OpenGL.glEnable(param1.field_e);
                        break L3;
                      }
                    }
                    jaggl.OpenGL.glBindTexture(param1.field_e, param1.f(0));
                    break L2;
                  }
                }
                ((cka) this).field_vc[((cka) this).field_r] = param1;
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              ((cka) this).field_y = ((cka) this).field_y & -2;
              if (param0) {
                break L4;
              } else {
                ((cka) this).field_Vb = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("cka.GC(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    private final void a(float param0, int param1, float param2, float param3) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (!(!((cka) this).field_U)) {
            jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param3, param0, param2);
        jaggl.OpenGL.glMatrixMode(5888);
        ((cka) this).field_U = true;
    }

    final void a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (!((cka) this).field_nc) {
          return;
        } else {
          L0: {
            if (((cka) this).field_Y <= 0) {
              break L0;
            } else {
              if (((cka) this).field_I <= 0) {
                break L0;
              } else {
                var1 = ((cka) this).field_Ib;
                var2 = ((cka) this).field_B;
                var3 = ((cka) this).field_f;
                var4 = ((cka) this).field_kc;
                ((cka) this).la();
                jaggl.OpenGL.glReadBuffer(1028);
                jaggl.OpenGL.glDrawBuffer(1029);
                this.s(3682);
                this.b(16363, false);
                ((cka) this).a(81, false);
                this.c(3742, false);
                this.a(false, 0);
                ((cka) this).a(true, (kl) null);
                ((cka) this).c(-2, 32677);
                ((cka) this).d(1, 1);
                ((cka) this).a((byte) 57, 0);
                jaggl.OpenGL.glMatrixMode(5889);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                jaggl.OpenGL.glMatrixMode(5888);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glRasterPos2i(0, 0);
                jaggl.OpenGL.glCopyPixels(0, 0, ((cka) this).field_Y, ((cka) this).field_I, 6144);
                jaggl.OpenGL.glFlush();
                jaggl.OpenGL.glReadBuffer(1029);
                jaggl.OpenGL.glDrawBuffer(1029);
                ((cka) this).KA(var1, var3, var2, var4);
                return;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, va param1) {
        RuntimeException var3 = null;
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
              if (((cka) this).field_tb == param1) {
                break L1;
              } else {
                L2: {
                  if (((cka) this).field_Q) {
                    jaggl.OpenGL.glBindBufferARB(34962, param1.a(true));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((cka) this).field_tb = param1;
                break L1;
              }
            }
            L3: {
              if (param0 > 74) {
                break L3;
              } else {
                ((cka) this).field_fc = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("cka.IC(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final void o(int param0) {
        int var2 = -116 / ((14 - param0) / 62);
        if (4 != ((cka) this).field_y) {
            this.r(0);
            this.b(16363, false);
            ((cka) this).a(104, false);
            this.c(3742, false);
            this.a(false, 0);
            ((cka) this).c(-2, 32677);
            ((cka) this).a((byte) 110, 1);
            ((cka) this).field_y = 4;
        }
    }

    final void a(gda param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((cka) this).field_jd.a(param0, 124);
              ((cka) this).field_j.a((gda) (Object) ((cka) this).field_jd, -66);
              ((cka) this).field_j.c((byte) 57);
              ((cka) this).field_Tc.a((gda) (Object) ((cka) this).field_j, (byte) 112);
              if (((cka) this).field_e == 1) {
                break L1;
              } else {
                this.b(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cka.W(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        this.a(param2, true, param1, param0 + -71);
        if (param0 != 70) {
            this.h(115);
        }
    }

    private final void j(int param0) {
        int var2 = -100 % ((param0 - 61) / 57);
        ((cka) this).field_Bb[14] = ((cka) this).field_Zb;
        ((cka) this).field_Bb[10] = ((cka) this).field_zb;
        ((cka) this).field_m = (float)((cka) this).field_ob;
        ((cka) this).field_u = ((float)(-((cka) this).field_ob) + ((cka) this).field_Bb[14]) / ((cka) this).field_Bb[10];
    }

    final boolean j() {
        return true;
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        int var4 = 0;
        al var5 = null;
        al var6 = null;
        al var7 = null;
        al var8 = null;
        al var9 = null;
        vg var10 = null;
        vg var11 = null;
        al var12 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          if (((cka) this).field_pd.d((byte) 14)) {
            L1: {
              if (0 < var2) {
                jaggl.OpenGL.glDeleteBuffersARB(var2, qo.field_k, 0);
                var2 = 0;
                L2: while (true) {
                  if (((cka) this).field_K.d((byte) 14)) {
                    break L1;
                  } else {
                    var6 = (al) (Object) ((cka) this).field_K.c(63);
                    int incrementValue$7 = var2;
                    var2++;
                    qo.field_k[incrementValue$7] = (int)var6.field_d;
                    ((cka) this).field_jb = ((cka) this).field_jb - var6.field_i;
                    if (1000 != var2) {
                      continue L2;
                    } else {
                      jaggl.OpenGL.glDeleteTextures(var2, qo.field_k, 0);
                      var2 = 0;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: while (true) {
                  if (((cka) this).field_K.d((byte) 14)) {
                    break L1;
                  } else {
                    var6 = (al) (Object) ((cka) this).field_K.c(63);
                    int incrementValue$8 = var2;
                    var2++;
                    qo.field_k[incrementValue$8] = (int)var6.field_d;
                    ((cka) this).field_jb = ((cka) this).field_jb - var6.field_i;
                    if (1000 != var2) {
                      continue L3;
                    } else {
                      jaggl.OpenGL.glDeleteTextures(var2, qo.field_k, 0);
                      var2 = 0;
                      continue L3;
                    }
                  }
                }
              }
            }
            L4: {
              L5: {
                if (var2 > 0) {
                  jaggl.OpenGL.glDeleteTextures(var2, qo.field_k, 0);
                  var2 = 0;
                  break L5;
                } else {
                  L6: while (true) {
                    if (((cka) this).field_cc.d((byte) 14)) {
                      break L4;
                    } else {
                      var7 = (al) (Object) ((cka) this).field_cc.c(-103);
                      int incrementValue$9 = var2;
                      var2++;
                      qo.field_k[incrementValue$9] = var7.field_i;
                      if (var2 != 1000) {
                        continue L6;
                      } else {
                        jaggl.OpenGL.glDeleteFramebuffersEXT(var2, qo.field_k, 0);
                        var2 = 0;
                        break L5;
                      }
                    }
                  }
                }
              }
              L7: while (true) {
                if (((cka) this).field_cc.d((byte) 14)) {
                  break L4;
                } else {
                  var7 = (al) (Object) ((cka) this).field_cc.c(-103);
                  int incrementValue$10 = var2;
                  var2++;
                  qo.field_k[incrementValue$10] = var7.field_i;
                  if (var2 == 1000) {
                    jaggl.OpenGL.glDeleteFramebuffersEXT(var2, qo.field_k, 0);
                    var2 = 0;
                    continue L7;
                  } else {
                    continue L7;
                  }
                }
              }
            }
            L8: {
              L9: {
                if (var2 > 0) {
                  jaggl.OpenGL.glDeleteFramebuffersEXT(var2, qo.field_k, 0);
                  var2 = 0;
                  break L9;
                } else {
                  L10: while (true) {
                    if (((cka) this).field_Vb.d((byte) 14)) {
                      break L8;
                    } else {
                      var8 = (al) (Object) ((cka) this).field_Vb.c(-117);
                      int incrementValue$11 = var2;
                      var2++;
                      qo.field_k[incrementValue$11] = (int)var8.field_d;
                      ((cka) this).field_Tb = ((cka) this).field_Tb - var8.field_i;
                      if (var2 != 1000) {
                        continue L10;
                      } else {
                        jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
                        var2 = 0;
                        break L9;
                      }
                    }
                  }
                }
              }
              L11: while (true) {
                if (((cka) this).field_Vb.d((byte) 14)) {
                  break L8;
                } else {
                  var8 = (al) (Object) ((cka) this).field_Vb.c(-117);
                  int incrementValue$12 = var2;
                  var2++;
                  qo.field_k[incrementValue$12] = (int)var8.field_d;
                  ((cka) this).field_Tb = ((cka) this).field_Tb - var8.field_i;
                  if (var2 == 1000) {
                    jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
                    var2 = 0;
                    continue L11;
                  } else {
                    continue L11;
                  }
                }
              }
            }
            L12: {
              if (var2 > 0) {
                jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
                var2 = 0;
                L13: while (true) {
                  if (!((cka) this).field_Lc.d((byte) 14)) {
                    var9 = (al) (Object) ((cka) this).field_Lc.c(30);
                    jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                    continue L13;
                  } else {
                    L14: while (true) {
                      if (((cka) this).field_Fc.d((byte) 14)) {
                        L15: while (true) {
                          if (!((cka) this).field_rb.d((byte) 14)) {
                            var11 = ((cka) this).field_rb.c(50);
                            jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
                            continue L15;
                          } else {
                            L16: while (true) {
                              if (!((cka) this).field_Lc.d((byte) 14)) {
                                var12 = (al) (Object) ((cka) this).field_Lc.c(-99);
                                jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
                                continue L16;
                              } else {
                                ((cka) this).field_hd.c(-29413);
                                if (this.f(-44) <= 100663296) {
                                  break L12;
                                } else {
                                  if (~bva.b((byte) -107) >= ~(60000L + ((cka) this).field_Lb)) {
                                    break L12;
                                  } else {
                                    System.gc();
                                    ((cka) this).field_Lb = bva.b((byte) -107);
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var10 = ((cka) this).field_Fc.c(80);
                        jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
                        continue L14;
                      }
                    }
                  }
                }
              } else {
                L17: while (true) {
                  if (((cka) this).field_Lc.d((byte) 14)) {
                    L18: while (true) {
                      if (!((cka) this).field_Fc.d((byte) 14)) {
                        var10 = ((cka) this).field_Fc.c(80);
                        jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
                        continue L18;
                      } else {
                        L19: while (true) {
                          if (((cka) this).field_rb.d((byte) 14)) {
                            L20: while (true) {
                              if (!((cka) this).field_Lc.d((byte) 14)) {
                                var12 = (al) (Object) ((cka) this).field_Lc.c(-99);
                                jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
                                continue L20;
                              } else {
                                ((cka) this).field_hd.c(-29413);
                                if (this.f(-44) <= 100663296) {
                                  break L12;
                                } else {
                                  if (~bva.b((byte) -107) >= ~(60000L + ((cka) this).field_Lb)) {
                                    break L12;
                                  } else {
                                    System.gc();
                                    ((cka) this).field_Lb = bva.b((byte) -107);
                                    break L12;
                                  }
                                }
                              }
                            }
                          } else {
                            var11 = ((cka) this).field_rb.c(50);
                            jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
                            continue L19;
                          }
                        }
                      }
                    }
                  } else {
                    var9 = (al) (Object) ((cka) this).field_Lc.c(30);
                    jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                    continue L17;
                  }
                }
              }
            }
            ((cka) this).field_Oc = param0;
            return;
          } else {
            var5 = (al) (Object) ((cka) this).field_pd.c(-108);
            int incrementValue$13 = var2;
            var2++;
            qo.field_k[incrementValue$13] = (int)var5.field_d;
            ((cka) this).field_mb = ((cka) this).field_mb - var5.field_i;
            if (var2 != 1000) {
              continue L0;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, qo.field_k, 0);
              var2 = 0;
              continue L0;
            }
          }
        }
    }

    final gda e() {
        return (gda) (Object) ((cka) this).field_fc;
    }

    final void h(int param0, int param1) {
        gp.field_d[0] = (float)sea.c(param1, 16711680) / 16711680.0f;
        gp.field_d[1] = (float)sea.c(65280, param1) / 65280.0f;
        gp.field_d[2] = (float)sea.c(255, param1) / 255.0f;
        gp.field_d[3] = (float)(param1 >>> 24) / 255.0f;
        if (param0 != 1104971864) {
            return;
        }
        jaggl.OpenGL.glTexEnvfv(8960, 8705, gp.field_d, 0);
    }

    final void a(za param0) {
        RuntimeException var2 = null;
        qf var3 = null;
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
              ((cka) this).field_md = ((cp) (Object) param0).field_h;
              if (null == ((cka) this).field_X) {
                L2: {
                  var3 = new qf(80);
                  if (((cka) this).field_O) {
                    var3.a(17133, -1.0f);
                    var3.a(17133, -1.0f);
                    var3.a(17133, 0.0f);
                    var3.a(17133, 0.0f);
                    var3.a(17133, 1.0f);
                    var3.a(17133, 1.0f);
                    var3.a(17133, -1.0f);
                    var3.a(17133, 0.0f);
                    var3.a(17133, 1.0f);
                    var3.a(17133, 1.0f);
                    var3.a(17133, 1.0f);
                    var3.a(17133, 1.0f);
                    var3.a(17133, 0.0f);
                    var3.a(17133, 1.0f);
                    var3.a(17133, 0.0f);
                    var3.a(17133, -1.0f);
                    var3.a(17133, 1.0f);
                    var3.a(17133, 0.0f);
                    var3.a(17133, 0.0f);
                    var3.a(17133, 0.0f);
                    break L2;
                  } else {
                    var3.a((byte) 114, -1.0f);
                    var3.a((byte) 114, -1.0f);
                    var3.a((byte) 114, 0.0f);
                    var3.a((byte) 114, 0.0f);
                    var3.a((byte) 114, 1.0f);
                    var3.a((byte) 114, 1.0f);
                    var3.a((byte) 114, -1.0f);
                    var3.a((byte) 114, 0.0f);
                    var3.a((byte) 114, 1.0f);
                    var3.a((byte) 114, 1.0f);
                    var3.a((byte) 114, 1.0f);
                    var3.a((byte) 114, 1.0f);
                    var3.a((byte) 114, 0.0f);
                    var3.a((byte) 114, 1.0f);
                    var3.a((byte) 114, 0.0f);
                    var3.a((byte) 114, -1.0f);
                    var3.a((byte) 114, 1.0f);
                    var3.a((byte) 114, 0.0f);
                    var3.a((byte) 114, 0.0f);
                    var3.a((byte) 114, 0.0f);
                    break L2;
                  }
                }
                ((cka) this).field_X = ((cka) this).a(var3.field_h, var3.field_g, 20, false, (byte) 108);
                ((cka) this).field_Bc = new tj(((cka) this).field_X, 5126, 3, 0);
                ((cka) this).field_Rb = new tj(((cka) this).field_X, 5126, 2, 12);
                ((cka) this).field_Ec.a(22091, (cka) this);
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
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("cka.FB(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (~((cka) this).field_Gc != ~param0) {
              break L1;
            } else {
              if (~param1 != ~((cka) this).field_ob) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ((cka) this).field_Gc = param0;
          ((cka) this).field_ob = param1;
          this.g(0);
          this.m(2916);
          if (((cka) this).field_e != 3) {
            if (((cka) this).field_e != 2) {
              break L0;
            } else {
              this.l((byte) -37);
              break L0;
            }
          } else {
            this.l(-4709);
            break L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, sca param3, int param4) {
        int var6_int = 0;
        try {
            var6_int = param3.c(-1771);
            param0 = param0 * this.b((byte) -10, var6_int);
            if (param2 != -513) {
                this.r((byte) 90);
            }
            ((cka) this).a(param3, param2 + 35476);
            jaggl.OpenGL.glDrawElements(param1, param4, var6_int, (long)param0 + param3.b(19135));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cka.TB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(byte param0, float param1) {
        if (!(param1 == ((cka) this).field_yc)) {
            ((cka) this).field_yc = param1;
            if (!(((cka) this).field_e != 3)) {
                this.l(param0 ^ -4669);
            }
        }
        if (param0 != 88) {
            ((cka) this).field_N = -56;
        }
    }

    final jca a(nha param0, mw param1) {
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
            stackOut_2_1 = new StringBuilder().append("cka.NB(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return (jca) (Object) stackIn_1_0;
    }

    private final void l(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(((cka) this).field_Bb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void a(ks param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (((cka) this).field_A < 0) {
                break L1;
              } else {
                if (param0 == ((cka) this).field_kd[((cka) this).field_A]) {
                  L2: {
                    int fieldTemp$2 = ((cka) this).field_A;
                    ((cka) this).field_A = ((cka) this).field_A - 1;
                    ((cka) this).field_kd[fieldTemp$2] = null;
                    param0.a(4245);
                    if (((cka) this).field_A < 0) {
                      ((cka) this).field_Qb = null;
                      break L2;
                    } else {
                      ((cka) this).field_Qb = ((cka) this).field_kd[((cka) this).field_A];
                      ((cka) this).field_Qb.c((byte) 111);
                      break L2;
                    }
                  }
                  L3: {
                    if (param1 == -1090) {
                      break L3;
                    } else {
                      this.h((byte) -8);
                      break L3;
                    }
                  }
                  break L0;
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("cka.QC(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    private final void r(byte param0) {
        if (param0 > -111) {
            return;
        }
        ((cka) this).field_od = (float)(-((cka) this).field_o + ((cka) this).field_B);
        ((cka) this).field_nd = (float)(-((cka) this).field_db + ((cka) this).field_f);
        ((cka) this).field_Db = (float)(-((cka) this).field_db + ((cka) this).field_kc);
        ((cka) this).field_s = (float)(-((cka) this).field_o + ((cka) this).field_Ib);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        if (param0 >= -2) {
            return;
        }
        al var4 = new al(param2);
        var4.field_d = (long)param1;
        ((cka) this).field_K.b((byte) -110, (vg) (Object) var4);
    }

    final void a(float param0, float param1, float param2, byte param3, float param4) {
        gp.field_d[0] = param1;
        gp.field_d[1] = param0;
        gp.field_d[2] = param2;
        if (param3 != -76) {
            ((cka) this).field_f = 81;
        }
        gp.field_d[3] = param4;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, gp.field_d, 0);
    }

    private final void e(byte param0) {
        if (!(!((cka) this).field_U)) {
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            ((cka) this).field_U = false;
        }
    }

    final int[] a(int param0, int param1, byte param2, int param3, int param4) {
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        int[] var9 = new int[param0 * param1];
        int[] var6 = var9;
        for (var7 = 0; var7 < param1; var7++) {
            jaggl.OpenGL.glReadPixelsi(param4, -param3 + (((cka) this).field_I - var7), param0, 1, 32993, ((cka) this).field_P, var9, var7 * param0);
        }
        if (param2 != -81) {
            ((cka) this).e(-23, 77);
        }
        return var6;
    }

    final boolean h() {
        if (((cka) this).field_T != null) {
            if (((cka) this).field_T.b((byte) -127)) {
                return true;
            }
            if (!((cka) this).field_L.a(1, (oga) (Object) ((cka) this).field_T)) {
                return false;
            }
            ((cka) this).field_hd.a(10659);
            return true;
        }
        return false;
    }

    final int l() {
        return 4;
    }

    final synchronized void e(int param0, int param1) {
        if (param0 != 2) {
            return;
        }
        al var3 = new al(param1);
        ((cka) this).field_cc.b((byte) -91, (vg) (Object) var3);
    }

    final nh a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        jja stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        jja stackOut_0_0 = null;
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
            stackOut_0_0 = new jja((cka) this, param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("cka.C(");
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
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (nh) (Object) stackIn_1_0;
    }

    final boolean f() {
        return ((cka) this).field_T != null && ((cka) this).field_T.b((byte) -128);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        jaggl.OpenGL.glDrawArrays(param2, param0, param1);
        if (!param3) {
            ((cka) this).field_n = -57L;
        }
    }

    final int g(int param0, int param1) {
        Object var4 = null;
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            var4 = null;
            ((cka) this).da(-3, -46, 112, (int[]) null);
            break L0;
          }
        }
        if (param1 != 1) {
          if (param1 != 0) {
            if (param1 != 2) {
              if (3 == param1) {
                return 260;
              } else {
                if (4 == param1) {
                  return 34023;
                } else {
                  throw new IllegalArgumentException();
                }
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

    final void j(byte param0) {
        if (!(((cka) this).field_y == 16)) {
            this.d((byte) -71);
            this.b(16363, true);
            this.c(3742, true);
            this.a(true, 0);
            ((cka) this).a((byte) 105, 1);
            ((cka) this).field_y = 16;
        }
        if (param0 > -77) {
            ((cka) this).c(93, -69, 80);
        }
    }

    final void a(oba param0, int param1) {
        try {
            jaggl.OpenGL.glLoadMatrixf(param0.e(-45), param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cka.CC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void K(int[] param0) {
        try {
            param0[3] = ((cka) this).field_kc;
            param0[1] = ((cka) this).field_f;
            param0[0] = ((cka) this).field_Ib;
            param0[2] = ((cka) this).field_B;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cka.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          if (0 > param2) {
            param2 = -param2;
            break L0;
          } else {
            break L0;
          }
        }
        if (~(param2 + param0) > ~((cka) this).field_Ib) {
          return;
        } else {
          L1: {
            if (~(param0 - param2) < ~((cka) this).field_B) {
              break L1;
            } else {
              if (~((cka) this).field_f < ~(param1 + param2)) {
                break L1;
              } else {
                if (~((cka) this).field_kc <= ~(-param2 + param1)) {
                  this.i((byte) -112);
                  ((cka) this).a((byte) 94, param4);
                  jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
                  if (1 < param2) {
                    L2: {
                      var6 = (float)param0 + 0.3499999940395355f;
                      var7 = (float)param1 + 0.3499999940395355f;
                      jaggl.OpenGL.glBegin(2);
                      var8 = 262144 / (6 * param2);
                      if (var8 > 64) {
                        if (var8 > 512) {
                          var8 = 512;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8 = 64;
                        break L2;
                      }
                    }
                    var8 = b.a(var8, (byte) -118);
                    jaggl.OpenGL.glVertex2f((float)param2 + var6, var7);
                    var9 = -var8 + 16384;
                    L3: while (true) {
                      if (0 >= var9) {
                        jaggl.OpenGL.glEnd();
                        return;
                      } else {
                        jaggl.OpenGL.glVertex2f(var6 + (float)param2 * hu.field_c[var9], (float)param2 * hu.field_b[var9] + var7);
                        var9 = var9 - var8;
                        continue L3;
                      }
                    }
                  } else {
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glVertex2f((float)(param0 + 1), (float)(1 + param1));
                    jaggl.OpenGL.glVertex2f((float)(param0 + 1), (float)(param1 - 1));
                    jaggl.OpenGL.glVertex2f((float)(param0 + -1), (float)(-1 + param1));
                    jaggl.OpenGL.glVertex2f((float)(-1 + param0), (float)(1 + param1));
                    jaggl.OpenGL.glEnd();
                    return;
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

    final void la() {
        ((cka) this).field_Ib = 0;
        ((cka) this).field_kc = ((cka) this).field_I;
        ((cka) this).field_B = ((cka) this).field_Y;
        ((cka) this).field_f = 0;
        jaggl.OpenGL.glDisable(3089);
        this.r((byte) -120);
    }

    final void e(int param0, boolean param1) {
        if (!param1) {
            return;
        }
        if (((cka) this).field_r != param0) {
            jaggl.OpenGL.glActiveTexture(param0 + 33984);
            ((cka) this).field_r = param0;
        }
    }

    final mw b(int param0, int param1) {
        return null;
    }

    private final void g(int param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float[] var8 = null;
        L0: {
          L1: {
            var8 = ((cka) this).field_Bb;
            var2 = var8;
            var3 = (float)(-((cka) this).field_o * ((cka) this).field_Gc) / (float)((cka) this).field_W;
            var4 = (float)((-((cka) this).field_o + ((cka) this).field_Y) * ((cka) this).field_Gc) / (float)((cka) this).field_W;
            var5 = (float)(((cka) this).field_db * ((cka) this).field_Gc) / (float)((cka) this).field_kb;
            var6 = (float)(((cka) this).field_Gc * (-((cka) this).field_I + ((cka) this).field_db)) / (float)((cka) this).field_kb;
            if (var3 == var4) {
              break L1;
            } else {
              if (var6 == var5) {
                break L1;
              } else {
                var7 = 2.0f * (float)((cka) this).field_Gc;
                var8[3] = 0.0f;
                var8[13] = 0.0f;
                var8[12] = 0.0f;
                ((cka) this).field_Zb = -(var7 * (float)((cka) this).field_ob) / (float)(-((cka) this).field_Gc + ((cka) this).field_ob);
                var8[14] = -(var7 * (float)((cka) this).field_ob) / (float)(-((cka) this).field_Gc + ((cka) this).field_ob);
                var8[5] = var7 / (var5 - var6);
                var8[6] = 0.0f;
                var8[9] = (var5 + var6) / (var5 - var6);
                var8[8] = (var4 + var3) / (var4 - var3);
                var8[0] = var7 / (var4 - var3);
                var8[11] = -1.0f;
                var8[2] = 0.0f;
                var8[15] = 0.0f;
                var8[1] = 0.0f;
                var8[7] = 0.0f;
                ((cka) this).field_zb = (float)(-(((cka) this).field_Gc + ((cka) this).field_ob)) / (float)(-((cka) this).field_Gc + ((cka) this).field_ob);
                var8[10] = (float)(-(((cka) this).field_Gc + ((cka) this).field_ob)) / (float)(-((cka) this).field_Gc + ((cka) this).field_ob);
                var8[4] = 0.0f;
                break L0;
              }
            }
          }
          var8[5] = 1.0f;
          var8[0] = 1.0f;
          var8[4] = 0.0f;
          var8[3] = 0.0f;
          var8[9] = 0.0f;
          var8[8] = 0.0f;
          var8[15] = 1.0f;
          var8[1] = 0.0f;
          var8[6] = 0.0f;
          var8[10] = 1.0f;
          var8[11] = 0.0f;
          var8[7] = 0.0f;
          var8[2] = 0.0f;
          var8[12] = 0.0f;
          var8[14] = 0.0f;
          var8[13] = 0.0f;
          break L0;
        }
        this.j(122);
    }

    final void d(int param0, boolean param1) {
        if (!((!((cka) this).field_v ? 1 : 0) != (param1 ? 1 : 0))) {
            ((cka) this).field_v = param1 ? true : false;
            this.m((byte) -52);
        }
        if (param0 >= -48) {
            Object var4 = null;
            ((cka) this).a(29, (va) null);
        }
    }

    private final void h(byte param0) {
        int var2 = -68 / ((-5 - param0) / 35);
        jaggl.OpenGL.glViewport(((cka) this).field_g, ((cka) this).field_Pc, ((cka) this).field_Y, ((cka) this).field_I);
    }

    private final void d(byte param0) {
        if (((cka) this).field_e != 3) {
            ((cka) this).field_e = 3;
            this.l(-4709);
            this.b(false);
            ((cka) this).field_y = ((cka) this).field_y & -8;
        }
    }

    private final void a(boolean param0, int param1) {
        if (!((!param0 ? 1 : 0) != (((cka) this).field_Nc ? 1 : 0))) {
            ((cka) this).field_Nc = param0 ? true : false;
            this.c((byte) 13);
            ((cka) this).field_y = ((cka) this).field_y & -32;
        }
    }

    private final void c(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            if (!((cka) this).field_Nc) {
              break L1;
            } else {
              if (!((cka) this).field_Jc) {
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
        jaggl.OpenGL.glDepthMask(stackIn_4_0 != 0);
    }

    final void a(sca param0, int param1) {
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
              if (((cka) this).field_Rc == param0) {
                break L1;
              } else {
                L2: {
                  if (!((cka) this).field_Q) {
                    break L2;
                  } else {
                    jaggl.OpenGL.glBindBufferARB(34963, param0.a(9624));
                    break L2;
                  }
                }
                ((cka) this).field_Rc = param0;
                break L1;
              }
            }
            L3: {
              if (param1 == 34963) {
                break L3;
              } else {
                za discarded$2 = ((cka) this).a(-127);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("cka.UA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        boolean discarded$0 = ((cka) this).field_l.b();
    }

    final da a(qla param0, jpa[] param1, boolean param2) {
        RuntimeException var4 = null;
        eg stackIn_1_0 = null;
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
        eg stackOut_0_0 = null;
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
            stackOut_0_0 = new eg((cka) this, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("cka.I(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
        return (da) (Object) stackIn_1_0;
    }

    final void b(oba param0, int param1) {
        try {
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glMultMatrixf(param0.e(96), 0);
            int var3_int = -49 / ((52 - param1) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cka.SC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized void a(byte param0, long param1) {
        if (param0 != -105) {
            ((cka) this).field_Lc = null;
        }
        vg var4 = new vg();
        var4.field_d = param1;
        ((cka) this).field_rb.b((byte) -58, var4);
    }

    private final void p(byte param0) {
        L0: {
          L1: {
            if (!((cka) this).field_qc) {
              break L1;
            } else {
              if (((cka) this).field_Kb >= 0) {
                jaggl.OpenGL.glEnable(2912);
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glDisable(2912);
          break L0;
        }
    }

    private final void v(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        ((cka) this).c(-2, 32677);
        var2 = -1 + ((cka) this).field_Ic;
        L0: while (true) {
          if (0 > var2) {
            ((cka) this).b(8448, 8960, 8448);
            ((cka) this).c(2, 0, 34168, 770);
            this.e((byte) 112);
            ((cka) this).field_ld = 1;
            jaggl.OpenGL.glEnable(3042);
            jaggl.OpenGL.glBlendFunc(770, 771);
            ((cka) this).field_Jb = 1;
            jaggl.OpenGL.glEnable(3008);
            jaggl.OpenGL.glAlphaFunc(516, 0.0f);
            ((cka) this).field_lb = true;
            jaggl.OpenGL.glColorMask(true, true, true, true);
            ((cka) this).field_q = true;
            this.b(16363, true);
            ((cka) this).a(95, true);
            this.c(3742, true);
            this.a(true, 0);
            this.s(3682);
            ((cka) this).field_l.setSwapInterval(0);
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
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                jaggl.OpenGL.glEnable(16384);
                jaggl.OpenGL.glEnable(16385);
                jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                jaggl.OpenGL.glFogi(2917, 9729);
                jaggl.OpenGL.glHint(3156, 4353);
                ((cka) this).field_gc = -1;
                ((cka) this).field_ac = -1;
                ((cka) this).la();
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
            ((cka) this).e(var2, true);
            ((cka) this).a(true, (kl) null);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            var2--;
            continue L0;
          }
        }
    }

    final void xa(float param0) {
        if (((cka) this).field_tc != param0) {
            ((cka) this).field_tc = param0;
            this.h(16);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.i((byte) -114);
        ((cka) this).a((byte) 29, param9);
        jaggl.OpenGL.glBegin(4);
        jaggl.OpenGL.glColor4ub((byte)(param6 >> 16), (byte)(param6 >> 8), (byte)param6, (byte)(param6 >> 24));
        jaggl.OpenGL.glVertex2f((float)param0 + 0.3499999940395355f, 0.3499999940395355f + (float)param1);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param2, 0.3499999940395355f + (float)param3);
        jaggl.OpenGL.glColor4ub((byte)(param8 >> 16), (byte)(param8 >> 8), (byte)param8, (byte)(param8 >> 24));
        jaggl.OpenGL.glVertex2f((float)param4 + 0.3499999940395355f, (float)param5 + 0.3499999940395355f);
        jaggl.OpenGL.glEnd();
    }

    final int i() {
        return ((cka) this).field_Gc;
    }

    final void c(boolean param0) {
        if (((cka) this).field_y != 8) {
            this.a((byte) -10);
            this.b(16363, true);
            this.c(3742, true);
            this.a(true, 0);
            ((cka) this).a((byte) 65, 1);
            ((cka) this).field_y = 8;
        }
        if (param0) {
            ((cka) this).field_O = true;
        }
    }

    final void a(int param0, boolean param1) {
        if (!((!param1 ? 1 : 0) == (!((cka) this).field_Ac ? 1 : 0))) {
            ((cka) this).field_Ac = param1 ? true : false;
            this.m((byte) -52);
            ((cka) this).field_y = ((cka) this).field_y & -8;
        }
        if (param0 < 29) {
            ((cka) this).field_nc = false;
        }
    }

    final static String a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; param1 > var4; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    final synchronized void i(int param0, int param1) {
        vg var3 = new vg();
        var3.field_d = (long)param0;
        ((cka) this).field_Fc.b((byte) -114, var3);
        if (param1 != -1) {
            ((cka) this).field_wb = true;
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (((cka) this).field_ld != param1) {
            L1: {
              if (1 != param1) {
                if (param1 != 2) {
                  if (128 != param1) {
                    var4 = 0;
                    var5 = 0;
                    var3 = 1;
                    break L1;
                  } else {
                    var5 = 3;
                    var3 = 1;
                    var4 = 1;
                    break L1;
                  }
                } else {
                  var3 = 1;
                  var4 = 0;
                  var5 = 2;
                  break L1;
                }
              } else {
                var4 = 1;
                var5 = 1;
                var3 = 1;
                break L1;
              }
            }
            L2: {
              stackOut_9_0 = var3;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (((cka) this).field_q) {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              } else {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_12_0 == stackIn_12_1) {
                L4: {
                  jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var3 == 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L4;
                  }
                }
                ((cka) this).field_q = stackIn_17_1 != 0;
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              if (((cka) this).field_lb) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L5;
              } else {
                stackOut_19_0 = 1;
                stackIn_21_0 = stackOut_19_0;
                break L5;
              }
            }
            L6: {
              stackOut_21_0 = stackIn_21_0;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (var4 != 0) {
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L6;
              } else {
                stackOut_22_0 = stackIn_22_0;
                stackOut_22_1 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L6;
              }
            }
            L7: {
              if (stackIn_24_0 != stackIn_24_1) {
                L8: {
                  if (var4 != 0) {
                    jaggl.OpenGL.glEnable(3008);
                    break L8;
                  } else {
                    jaggl.OpenGL.glDisable(3008);
                    break L8;
                  }
                }
                L9: {
                  stackOut_29_0 = this;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (var4 == 0) {
                    stackOut_31_0 = this;
                    stackOut_31_1 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    break L9;
                  } else {
                    stackOut_30_0 = this;
                    stackOut_30_1 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    break L9;
                  }
                }
                ((cka) this).field_lb = stackIn_32_1 != 0;
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (~((cka) this).field_Jb == ~var5) {
                break L10;
              } else {
                L11: {
                  if (var5 != 1) {
                    if (var5 == 2) {
                      jaggl.OpenGL.glEnable(3042);
                      jaggl.OpenGL.glBlendFunc(1, 1);
                      break L11;
                    } else {
                      if (var5 == 3) {
                        jaggl.OpenGL.glEnable(3042);
                        jaggl.OpenGL.glBlendFunc(774, 1);
                        break L11;
                      } else {
                        jaggl.OpenGL.glDisable(3042);
                        break L11;
                      }
                    }
                  } else {
                    jaggl.OpenGL.glEnable(3042);
                    jaggl.OpenGL.glBlendFunc(770, 771);
                    break L11;
                  }
                }
                ((cka) this).field_Jb = var5;
                break L10;
              }
            }
            ((cka) this).field_y = ((cka) this).field_y & -29;
            ((cka) this).field_ld = param1;
            break L0;
          } else {
            break L0;
          }
        }
        L12: {
          if (param0 > 18) {
            break L12;
          } else {
            this.o((byte) -128);
            break L12;
          }
        }
    }

    cka(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        String var13_ref = null;
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
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_49_0 = null;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var13_ref = null;
        var18 = null;
        var19 = null;
        var20 = null;
        ((cka) this).field_p = new Hashtable();
        ((cka) this).field_dc = 128;
        ((cka) this).field_Ec = new doa();
        ((cka) this).field_fc = new oba();
        ((cka) this).field_mc = new oba();
        ((cka) this).field_Ob = false;
        ((cka) this).field_qb = new vna();
        ((cka) this).field_A = -1;
        ((cka) this).field_ub = new ks[4];
        ((cka) this).field_Zc = -1;
        ((cka) this).field_M = new ks[4];
        ((cka) this).field_x = -1;
        ((cka) this).field_kd = new ks[4];
        ((cka) this).field_F = new vj();
        ((cka) this).field_Wc = new ji(16);
        ((cka) this).field_Lc = new vna();
        ((cka) this).field_pd = new vna();
        ((cka) this).field_K = new vna();
        ((cka) this).field_cc = new vna();
        ((cka) this).field_Vb = new vna();
        ((cka) this).field_Fc = new vna();
        ((cka) this).field_rb = new vna();
        ((cka) this).field_jd = new oba();
        ((cka) this).field_j = new oba();
        ((cka) this).field_Tc = new oba();
        ((cka) this).field_Gc = 50;
        ((cka) this).field_db = 0;
        ((cka) this).field_bc = 1.0f;
        ((cka) this).field_wc = 1.0f;
        ((cka) this).field_g = 0;
        ((cka) this).field_oc = 1.0f;
        ((cka) this).field_m = 3584.0f;
        ((cka) this).field_ec = 0.0f;
        ((cka) this).field_Xc = 0;
        ((cka) this).field_Bb = new float[16];
        ((cka) this).field_Kb = -1;
        ((cka) this).field_vb = -1;
        ((cka) this).field_yc = 1.0f;
        ((cka) this).field_Ab = new float[4];
        ((cka) this).field_xc = -1;
        ((cka) this).field_Jc = true;
        ((cka) this).field_B = 0;
        ((cka) this).field_Sb = -1.0f;
        ((cka) this).field_nb = 0;
        ((cka) this).field_Wb = new float[4];
        ((cka) this).field_Ib = 0;
        ((cka) this).field_uc = 8448;
        ((cka) this).field_cd = -1.0f;
        ((cka) this).field_ib = new float[4];
        ((cka) this).field_ac = -1;
        ((cka) this).field_Dc = new ob[tj.field_a];
        ((cka) this).field_Pc = 0;
        ((cka) this).field_kb = 512;
        ((cka) this).field_hb = false;
        ((cka) this).field_ob = 3584;
        ((cka) this).field_Fb = 1.0f;
        ((cka) this).field_f = 0;
        ((cka) this).field_Cb = -1.0f;
        ((cka) this).field_gd = 8448;
        ((cka) this).field_W = 512;
        ((cka) this).field_o = 0;
        ((cka) this).field_u = 3584.0f;
        ((cka) this).field_Qc = -1.0f;
        ((cka) this).field_kc = 0;
        ((cka) this).field_gc = -1;
        ((cka) this).field_Pb = new float[4];
        ((cka) this).field_cb = new qf(8192);
        try {
          L0: {
            ((cka) this).field_gb = param2;
            ((cka) this).field_ad = param0;
            if (in.a("jaclib", 480)) {
              if (in.a("jaggl", 480)) {
                try {
                  L1: {
                    ((cka) this).field_l = new jaggl.OpenGL();
                    long dupTemp$1 = ((cka) this).field_l.init(param0, 8, 8, 8, 24, 0, ((cka) this).field_gb);
                    ((cka) this).field_dd = dupTemp$1;
                    ((cka) this).field_n = dupTemp$1;
                    if (((cka) this).field_dd != 0L) {
                      this.f((byte) -68);
                      var4_int = this.k((byte) 108);
                      if (var4_int == 0) {
                        L2: {
                          stackOut_9_0 = this;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (!((cka) this).field_O) {
                            stackOut_11_0 = this;
                            stackOut_11_1 = 5121;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            break L2;
                          } else {
                            stackOut_10_0 = this;
                            stackOut_10_1 = 33639;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            break L2;
                          }
                        }
                        L3: {
                          ((cka) this).field_P = stackIn_12_1;
                          if (-1 == ((cka) this).field_h.indexOf("radeon")) {
                            break L3;
                          } else {
                            var5_int = 0;
                            var6 = 0;
                            var7 = 0;
                            var8_array = rga.a(32287, ((cka) this).field_h.replace('/', ' '), ' ');
                            var9 = 0;
                            L4: while (true) {
                              L5: {
                                if (var9 >= var8_array.length) {
                                  break L5;
                                } else {
                                  var13_ref = var8_array[var9];
                                  var10_ref = var13_ref;
                                  var10_ref = var13_ref;
                                  try {
                                    L6: {
                                      L7: {
                                        if (var13_ref.length() <= 0) {
                                          break L7;
                                        } else {
                                          L8: {
                                            if (var13_ref.charAt(0) != 120) {
                                              break L8;
                                            } else {
                                              if (var13_ref.length() < 3) {
                                                break L8;
                                              } else {
                                                var21 = (CharSequence) (Object) var13_ref.substring(1, 3);
                                                if (!sqa.a(var21, -3)) {
                                                  break L8;
                                                } else {
                                                  var10_ref = var13_ref.substring(1);
                                                  var7 = 1;
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                          if (var10_ref.equals((Object) (Object) "hd")) {
                                            var6 = 1;
                                            break L7;
                                          } else {
                                            L9: {
                                              if (!var10_ref.startsWith("hd")) {
                                                break L9;
                                              } else {
                                                var6 = 1;
                                                var10_ref = var10_ref.substring(2);
                                                break L9;
                                              }
                                            }
                                            if (var10_ref.length() < 4) {
                                              break L7;
                                            } else {
                                              var22 = (CharSequence) (Object) var10_ref.substring(0, 4);
                                              if (!sqa.a(var22, -3)) {
                                                break L7;
                                              } else {
                                                var23 = (CharSequence) (Object) var10_ref.substring(0, 4);
                                                var5_int = jb.a(var23, (byte) 70);
                                                decompiledRegionSelector0 = 1;
                                                break L6;
                                              }
                                            }
                                          }
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
                                L12: {
                                  if (var6 == 0) {
                                    break L12;
                                  } else {
                                    if (var5_int >= 4000) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                ((cka) this).field_z = false;
                                break L11;
                              }
                              L13: {
                                if (var7 != 0) {
                                  break L13;
                                } else {
                                  if (var6 != 0) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (var5_int < 7000) {
                                        break L14;
                                      } else {
                                        if (var5_int > 7999) {
                                          break L14;
                                        } else {
                                          ((cka) this).field_Q = false;
                                          break L14;
                                        }
                                      }
                                    }
                                    if (7000 > var5_int) {
                                      break L13;
                                    } else {
                                      if (var5_int > 9250) {
                                        break L13;
                                      } else {
                                        ((cka) this).field_V = false;
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              ((cka) this).field_Cc = ((cka) this).field_Cc & ((cka) this).field_l.a("GL_ARB_half_float_pixel");
                              ((cka) this).field_bd = ((cka) this).field_Q;
                              break L3;
                            }
                          }
                        }
                        L15: {
                          if (((cka) this).field_k.indexOf("intel") == -1) {
                            break L15;
                          } else {
                            ((cka) this).field_id = false;
                            break L15;
                          }
                        }
                        L16: {
                          stackOut_49_0 = this;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_50_0 = stackOut_49_0;
                          if (((cka) this).field_k.equals((Object) (Object) "s3 graphics")) {
                            stackOut_51_0 = this;
                            stackOut_51_1 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            break L16;
                          } else {
                            stackOut_50_0 = this;
                            stackOut_50_1 = 1;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_52_1 = stackOut_50_1;
                            break L16;
                          }
                        }
                        L17: {
                          ((cka) this).field_nc = stackIn_52_1 != 0;
                          if (((cka) this).field_Q) {
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
                          ija.a(true, (byte) 99, false);
                          ((cka) this).field_Ob = true;
                          ((cka) this).field_hd = new hsa((cka) this, ((cka) this).field_c);
                          this.o((byte) 124);
                          ((cka) this).field_zc = new mq((cka) this);
                          ((cka) this).field_L = new cw((cka) this);
                          if (!((cka) this).field_L.b((byte) -43)) {
                            break L19;
                          } else {
                            ((cka) this).field_T = new uv((cka) this);
                            if (((cka) this).field_T.e(34842)) {
                              break L19;
                            } else {
                              ((cka) this).field_T.d((byte) -60);
                              ((cka) this).field_T = null;
                              break L19;
                            }
                          }
                        }
                        ((cka) this).field_Hb = new uua((cka) this);
                        this.v(-3159);
                        this.b((byte) -99);
                        ((cka) this).a();
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
                  ((cka) this).k();
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
            stackOut_63_0 = (RuntimeException) var4_ref;
            stackOut_63_1 = new StringBuilder().append("cka.<init>(");
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L20;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L20;
            }
          }
          L21: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L21;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L21;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ',' + param2 + ')');
        }
    }

    final void b(ks param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 == 81) {
                break L1;
              } else {
                this.j(-22);
                break L1;
              }
            }
            L2: {
              if (!((cka) this).field_hc) {
                if (((cka) this).field_x < 3) {
                  L3: {
                    if (((cka) this).field_x < 0) {
                      break L3;
                    } else {
                      ((cka) this).field_ub[((cka) this).field_x].b((byte) -36);
                      break L3;
                    }
                  }
                  int fieldTemp$2 = ((cka) this).field_x + 1;
                  ((cka) this).field_x = ((cka) this).field_x + 1;
                  ((cka) this).field_ub[fieldTemp$2] = param0;
                  ((cka) this).field_Qb = param0;
                  ((cka) this).field_t = param0;
                  ((cka) this).field_t.b(13109);
                  break L2;
                } else {
                  throw new RuntimeException();
                }
              } else {
                ((cka) this).c(param0, -4);
                ((cka) this).a(0, param0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("cka.VC(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        L0: {
          L1: {
            this.i((byte) -114);
            ((cka) this).a((byte) 52, param5);
            var7 = (float)param2 - (float)param0;
            var8 = (float)(-param1) + (float)param3;
            if (var7 != 0.0f) {
              break L1;
            } else {
              if (0.0f == var8) {
                var7 = 1.0f;
                break L0;
              } else {
                break L1;
              }
            }
          }
          var9 = (float)(1.0 / Math.sqrt((double)(var8 * var8 + var7 * var7)));
          var7 = var7 * var9;
          var8 = var8 * var9;
          break L0;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f((float)param0 + 0.3499999940395355f, (float)param1 + 0.3499999940395355f);
        jaggl.OpenGL.glVertex2f((float)param2 + var7 + 0.3499999940395355f, 0.3499999940395355f + ((float)param3 + var8));
        jaggl.OpenGL.glEnd();
    }

    private final int f(int param0) {
        return ((cka) this).field_jb + (((cka) this).field_mb + ((cka) this).field_Tb);
    }

    final void c(ks param0, int param1) {
        try {
            if (param1 >= ~((cka) this).field_Zc) {
                throw new RuntimeException();
            }
            if (((cka) this).field_Zc >= 0) {
                ((cka) this).field_M[((cka) this).field_Zc].d((byte) 93);
            }
            int fieldTemp$0 = ((cka) this).field_Zc + 1;
            ((cka) this).field_Zc = ((cka) this).field_Zc + 1;
            ((cka) this).field_M[fieldTemp$0] = param0;
            ((cka) this).field_t = param0;
            ((cka) this).field_t.a((byte) -120);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cka.GE(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ob a(int param0, int param1, int param2, int param3, int param4, float param5) {
        return (ob) (Object) new wba(param0, param1, param2, param3, param4, param5);
    }

    final boolean i(int param0) {
        if (param0 != 7085) {
            return true;
        }
        return ((cka) this).field_Hb.a(2147483647, 3);
    }

    private final void r(int param0) {
        if (-2 != ((cka) this).field_e) {
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glLoadIdentity();
            if (0 < ((cka) this).field_Y) {
                if (!(-1 >= ((cka) this).field_I)) {
                    jaggl.OpenGL.glOrtho(0.0, (double)((cka) this).field_Y, (double)((cka) this).field_I, 0.0, -1.0, 1.0);
                }
            }
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            ((cka) this).field_e = 1;
            ((cka) this).field_y = ((cka) this).field_y & -25;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        ob var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (((cka) this).field_sb <= var2) {
            return;
          } else {
            var3 = ((cka) this).field_Dc[var2];
            vh.field_h[0] = (float)var3.d(13437);
            var4 = 16386 + var2;
            vh.field_h[1] = (float)var3.a(19848);
            vh.field_h[2] = (float)var3.b((byte) 11);
            vh.field_h[3] = 1.0f;
            jaggl.OpenGL.glLightfv(var4, 4611, vh.field_h, 0);
            var5 = var3.c(-124);
            var6 = var3.b(0) / 255.0f;
            vh.field_h[1] = (float)(sea.c(65532, var5) >> 8) * var6;
            vh.field_h[0] = var6 * (float)sea.c(var5 >> 16, 255);
            vh.field_h[2] = (float)sea.c(255, var5) * var6;
            jaggl.OpenGL.glLightfv(var4, 4609, vh.field_h, 0);
            jaggl.OpenGL.glLightf(var4, 4617, 1.0f / (float)(var3.a((byte) -126) * var3.a((byte) -126)));
            jaggl.OpenGL.glEnable(var4);
            var2++;
            continue L0;
          }
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        if (param0 != -31014) {
            field_H = -33;
        }
        al var4 = new al(param2);
        var4.field_d = (long)param1;
        ((cka) this).field_pd.b((byte) -96, (vg) (Object) var4);
    }

    final void c(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, param0 + 34176, param2);
        if (param1 != 0) {
            this.q((byte) 53);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34192 - -param0, param3);
    }

    private final void a(int param0, boolean param1, boolean param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        dw var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          L1: {
            var13 = TombRacer.field_G ? 1 : 0;
            if (param0 != ((cka) this).field_Yb) {
              break L1;
            } else {
              if (((cka) this).field_pb != ((cka) this).field_hb) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            var5 = null;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (((cka) this).field_pb) {
              stackOut_5_0 = 3;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            } else {
              stackOut_4_0 = 0;
              stackIn_6_0 = stackOut_4_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_6_0;
            if (0 <= param0) {
              L4: {
                L5: {
                  var5 = (Object) (Object) ((cka) this).field_hd.a(param0, 0);
                  var10 = ((cka) this).field_c.a((byte) 14, param0);
                  if (var10.field_s != 0) {
                    break L5;
                  } else {
                    if (var10.field_o == 0) {
                      this.e((byte) 112);
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var10.field_g) {
                    stackOut_13_0 = 64;
                    stackIn_14_0 = stackOut_13_0;
                    break L6;
                  } else {
                    stackOut_12_0 = 128;
                    stackIn_14_0 = stackOut_12_0;
                    break L6;
                  }
                }
                var11 = stackIn_14_0;
                var12 = var11 * 50;
                this.a((float)(var10.field_o * (((cka) this).field_Oc % var12)) / (float)var12, 25380, 0.0f, (float)(var10.field_s * (((cka) this).field_Oc % var12)) / (float)var12);
                break L4;
              }
              L7: {
                if (!((cka) this).field_pb) {
                  var8 = var10.field_t;
                  var9 = var10.field_h;
                  var7 = var10.field_a;
                  break L7;
                } else {
                  break L7;
                }
              }
              var6 = var10.field_q;
              break L3;
            } else {
              this.e((byte) 112);
              break L3;
            }
          }
          L8: {
            ((cka) this).field_Hb.a(param3 ^ -71, var8, true, param2, var7, var9);
            if (!((cka) this).field_Hb.a(var6, 9, (kl) var5)) {
              ((cka) this).a(true, (kl) var5);
              ((cka) this).d(param3 ^ -2, var6);
              break L8;
            } else {
              break L8;
            }
          }
          ((cka) this).field_hb = ((cka) this).field_pb;
          ((cka) this).field_Yb = param0;
          break L0;
        }
        L9: {
          if (param3 == -1) {
            break L9;
          } else {
            var14 = null;
            nh discarded$1 = ((cka) this).a((jpa) null, false);
            break L9;
          }
        }
        ((cka) this).field_y = ((cka) this).field_y & -8;
    }

    private final int k(byte param0) {
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        NumberFormatException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var15 = null;
        int stackIn_27_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          ((cka) this).field_k = jaggl.OpenGL.glGetString(7936).toLowerCase();
          var2 = 0;
          ((cka) this).field_h = jaggl.OpenGL.glGetString(7937).toLowerCase();
          if (((cka) this).field_k.indexOf("microsoft") != -1) {
            var2 = var2 | 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (((cka) this).field_k.indexOf("brian paul") != -1) {
              break L2;
            } else {
              if (((cka) this).field_k.indexOf("mesa") == -1) {
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
          var4 = rga.a(32287, var3.replace('.', ' '), ' ');
          if (var4.length < 2) {
            var2 = var2 | 4;
            break L3;
          } else {
            try {
              L4: {
                var5_int = jb.a((CharSequence) (Object) var4[0], (byte) 70);
                var6 = jb.a((CharSequence) (Object) var4[1], (byte) 70);
                ((cka) this).field_fb = var6 + 10 * var5_int;
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var5 = (NumberFormatException) (Object) decompiledCaughtException;
                var2 = var2 | 4;
                break L5;
              }
            }
            break L3;
          }
        }
        L6: {
          if (((cka) this).field_fb >= 12) {
            break L6;
          } else {
            var2 = var2 | 2;
            break L6;
          }
        }
        L7: {
          if (((cka) this).field_l.a("GL_ARB_multitexture")) {
            break L7;
          } else {
            var2 = var2 | 8;
            break L7;
          }
        }
        L8: {
          if (!((cka) this).field_l.a("GL_ARB_texture_env_combine")) {
            var2 = var2 | 32;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          L10: {
            var14 = new int[1];
            var12 = var14;
            var10 = var12;
            var8 = var10;
            var7 = var8;
            var15 = var7;
            jaggl.OpenGL.glGetIntegerv(34018, var14, 0);
            ((cka) this).field_Ic = var14[0];
            jaggl.OpenGL.glGetIntegerv(34929, var14, 0);
            ((cka) this).field_J = var14[0];
            jaggl.OpenGL.glGetIntegerv(34930, var15, 0);
            var6 = -1;
            ((cka) this).field_Hc = var14[0];
            if (2 > ((cka) this).field_Ic) {
              break L10;
            } else {
              if (((cka) this).field_J < 2) {
                break L10;
              } else {
                if (((cka) this).field_Hc >= 2) {
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
          ((cka) this).field_O = jaclib.memory.Stream.b();
          ((cka) this).field_Yc = ((cka) this).field_l.arePbuffersAvailable();
          ((cka) this).field_Q = ((cka) this).field_l.a("GL_ARB_vertex_buffer_object");
          ((cka) this).field_S = ((cka) this).field_l.a("GL_ARB_multisample");
          ((cka) this).field_G = ((cka) this).field_l.a("GL_ARB_vertex_program");
          boolean discarded$1 = ((cka) this).field_l.a("GL_ARB_fragment_program");
          ((cka) this).field_wb = ((cka) this).field_l.a("GL_ARB_vertex_shader");
          ((cka) this).field_Vc = ((cka) this).field_l.a("GL_ARB_fragment_shader");
          ((cka) this).field_V = ((cka) this).field_l.a("GL_EXT_texture3D");
          ((cka) this).field_Cc = ((cka) this).field_l.a("GL_ARB_texture_rectangle");
          ((cka) this).field_Kc = ((cka) this).field_l.a("GL_ARB_texture_cube_map");
          ((cka) this).field_z = ((cka) this).field_l.a("GL_ARB_texture_float");
          ((cka) this).field_Gb = false;
          ((cka) this).field_id = ((cka) this).field_l.a("GL_EXT_framebuffer_object");
          ((cka) this).field_hc = ((cka) this).field_l.a("GL_EXT_framebuffer_blit");
          ((cka) this).field_ed = ((cka) this).field_l.a("GL_EXT_framebuffer_multisample");
          ((cka) this).field_Eb = oj.field_vb.startsWith("mac");
          jaggl.OpenGL.glGetFloatv(2834, gp.field_d, 0);
          ((cka) this).field_Cb = gp.field_d[1];
          ((cka) this).field_Qc = gp.field_d[0];
          if (0 == var2) {
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L11;
          } else {
            stackOut_25_0 = var2;
            stackIn_27_0 = stackOut_25_0;
            break L11;
          }
        }
        return stackIn_27_0;
    }

    private final void g(byte param0) {
        gp.field_d[3] = 1.0f;
        gp.field_d[1] = ((cka) this).field_cd * ((cka) this).field_Fb;
        gp.field_d[0] = ((cka) this).field_cd * ((cka) this).field_wc;
        gp.field_d[2] = ((cka) this).field_cd * ((cka) this).field_bc;
        jaggl.OpenGL.glLightfv(16384, 4609, gp.field_d, 0);
        gp.field_d[2] = -((cka) this).field_Sb * ((cka) this).field_bc;
        gp.field_d[1] = -((cka) this).field_Sb * ((cka) this).field_Fb;
        gp.field_d[0] = ((cka) this).field_wc * -((cka) this).field_Sb;
        gp.field_d[3] = 1.0f;
        jaggl.OpenGL.glLightfv(16385, 4609, gp.field_d, 0);
    }

    final void n(byte param0) {
        if (param0 > -58) {
            Object var3 = null;
            ((cka) this).HA(1, -122, 13, 3, (int[]) null);
        }
        jaggl.OpenGL.glPopMatrix();
    }

    private final void p(int param0) {
        jaggl.OpenGL.glLightfv(16384, 4611, ((cka) this).field_Wb, 0);
        jaggl.OpenGL.glLightfv(16385, 4611, ((cka) this).field_Ab, 0);
    }

    private final void h(int param0) {
        gp.field_d[3] = 1.0f;
        gp.field_d[2] = ((cka) this).field_bc * ((cka) this).field_tc;
        if (param0 != 16) {
            return;
        }
        gp.field_d[0] = ((cka) this).field_tc * ((cka) this).field_wc;
        gp.field_d[1] = ((cka) this).field_tc * ((cka) this).field_Fb;
        jaggl.OpenGL.glLightModelfv(2899, gp.field_d, 0);
    }

    final void HA(int param0, int param1, int param2, int param3, int[] param4) {
        float var6_float = 0.0f;
        RuntimeException var6 = null;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
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
        try {
          L0: {
            L1: {
              var6_float = ((cka) this).field_jd.field_q * (float)param2 + (((cka) this).field_jd.field_j * (float)param0 + ((cka) this).field_jd.field_h * (float)param1) + ((cka) this).field_jd.field_o;
              if (var6_float < (float)((cka) this).field_Gc) {
                break L1;
              } else {
                if ((float)((cka) this).field_ob >= var6_float) {
                  L2: {
                    L3: {
                      var7 = (int)((float)((cka) this).field_W * (((cka) this).field_jd.field_m + (((cka) this).field_jd.field_s * (float)param2 + ((float)param1 * ((cka) this).field_jd.field_k + (float)param0 * ((cka) this).field_jd.field_l))) / (float)param3);
                      var8 = (int)((float)((cka) this).field_kb * ((float)param2 * ((cka) this).field_jd.field_g + (((cka) this).field_jd.field_i * (float)param0 + (float)param1 * ((cka) this).field_jd.field_r) + ((cka) this).field_jd.field_p) / (float)param3);
                      if (((cka) this).field_s > (float)var7) {
                        break L3;
                      } else {
                        if (((cka) this).field_od < (float)var7) {
                          break L3;
                        } else {
                          if (((cka) this).field_nd > (float)var8) {
                            break L3;
                          } else {
                            if ((float)var8 <= ((cka) this).field_Db) {
                              param4[1] = (int)(-((cka) this).field_nd + (float)var8);
                              param4[0] = (int)((float)var7 - ((cka) this).field_s);
                              param4[2] = (int)var6_float;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    var9 = param4;
                    param4[2] = -1;
                    var10 = param4;
                    var10[1] = -1;
                    var9[0] = -1;
                    break L2;
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var7_ref_int__ = param4;
            param4[2] = -1;
            var8_ref_int__ = param4;
            var8_ref_int__[1] = -1;
            var7_ref_int__[0] = -1;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("cka.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (!(param0 >= 0)) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (!(((cka) this).field_I >= param3)) {
            param3 = ((cka) this).field_I;
        }
        if (!(~param2 >= ~((cka) this).field_Y)) {
            param2 = ((cka) this).field_Y;
        }
        ((cka) this).field_kc = param3;
        ((cka) this).field_Ib = param0;
        ((cka) this).field_f = param1;
        ((cka) this).field_B = param2;
        jaggl.OpenGL.glEnable(3089);
        this.r((byte) -124);
        this.q((byte) 68);
    }

    final void b(int param0) {
    }

    final void d(int param0, int param1) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          L0: {
            if (param1 != 1) {
              if (param1 == 0) {
                ((cka) this).b(8448, 8960, 8448);
                break L0;
              } else {
                if (param1 != 2) {
                  if (param1 != 3) {
                    if (param1 != 4) {
                      break L0;
                    } else {
                      ((cka) this).b(34023, param0 + 8959, 34023);
                      break L0;
                    }
                  } else {
                    ((cka) this).b(260, 8960, 8448);
                    break L0;
                  }
                } else {
                  ((cka) this).b(34165, 8960, 7681);
                  break L0;
                }
              }
            } else {
              ((cka) this).b(7681, 8960, 7681);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void k() {
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        vg var1 = ((cka) this).field_qb.f(-80);
        while (var1 != null) {
            ((cp) (Object) var1).b((byte) 87);
            var1 = ((cka) this).field_qb.e(125);
        }
        if (!(null == ((cka) this).field_L)) {
            ((cka) this).field_L.a(-110);
        }
        if (((cka) this).field_l != null) {
            this.k(19770);
            var1_ref = ((cka) this).field_p.keys();
            while (var1_ref.hasMoreElements()) {
                var2 = (java.awt.Canvas) var1_ref.nextElement();
                var3 = (Long) ((cka) this).field_p.get((Object) (Object) var2);
                ((cka) this).field_l.releaseSurface(var2, var3.longValue());
            }
            ((cka) this).field_l.release();
            ((cka) this).field_l = null;
        }
        if (!(!((cka) this).field_Ob)) {
            rpa.a(true, false, true);
            ((cka) this).field_Ob = false;
        }
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        int var7 = 0;
        float var8 = 0.0f;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (param0 == ((cka) this).field_ac) {
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
          L2: {
            var7 = stackIn_3_0;
            if (var7 != 0) {
              break L2;
            } else {
              if (((cka) this).field_cd != param1) {
                break L2;
              } else {
                if (param2 == ((cka) this).field_Sb) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            ((cka) this).field_ac = param0;
            ((cka) this).field_Sb = param2;
            ((cka) this).field_cd = param1;
            if (var7 == 0) {
              break L3;
            } else {
              ((cka) this).field_bc = (float)(((cka) this).field_ac & 255) / 255.0f;
              ((cka) this).field_wc = (float)(((cka) this).field_ac & 16711680) / 16711680.0f;
              ((cka) this).field_Fb = (float)(((cka) this).field_ac & 65280) / 65280.0f;
              this.h(16);
              break L3;
            }
          }
          this.g((byte) -30);
          break L1;
        }
        L4: {
          L5: {
            if (param3 != ((cka) this).field_Pb[0]) {
              break L5;
            } else {
              if (((cka) this).field_Pb[1] != param4) {
                break L5;
              } else {
                if (param5 != ((cka) this).field_Pb[2]) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
          }
          ((cka) this).field_Pb[1] = param4;
          ((cka) this).field_Pb[0] = param3;
          ((cka) this).field_Pb[2] = param5;
          ((cka) this).field_ib[1] = -param4;
          ((cka) this).field_ib[2] = -param5;
          ((cka) this).field_ib[0] = -param3;
          var8 = (float)(1.0 / Math.sqrt((double)(param5 * param5 + (param4 * param4 + param3 * param3))));
          ((cka) this).field_Wb[1] = param4 * var8;
          ((cka) this).field_Wb[2] = param5 * var8;
          ((cka) this).field_Wb[0] = var8 * param3;
          ((cka) this).field_Ab[2] = -((cka) this).field_Wb[2];
          ((cka) this).field_Ab[1] = -((cka) this).field_Wb[1];
          ((cka) this).field_Ab[0] = -((cka) this).field_Wb[0];
          this.p(0);
          break L4;
        }
    }

    final void da(int param0, int param1, int param2, int[] param3) {
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
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
        try {
          L0: {
            L1: {
              var5_float = ((cka) this).field_jd.field_o + ((float)param2 * ((cka) this).field_jd.field_q + (((cka) this).field_jd.field_h * (float)param1 + ((cka) this).field_jd.field_j * (float)param0));
              if ((float)((cka) this).field_Gc > var5_float) {
                break L1;
              } else {
                if (var5_float <= (float)((cka) this).field_ob) {
                  L2: {
                    L3: {
                      var6 = (int)((float)((cka) this).field_W * (((cka) this).field_jd.field_l * (float)param0 + (float)param1 * ((cka) this).field_jd.field_k + ((cka) this).field_jd.field_s * (float)param2 + ((cka) this).field_jd.field_m) / var5_float);
                      var7 = (int)((float)((cka) this).field_kb * (((cka) this).field_jd.field_g * (float)param2 + ((float)param0 * ((cka) this).field_jd.field_i + (float)param1 * ((cka) this).field_jd.field_r) + ((cka) this).field_jd.field_p) / var5_float);
                      if (((cka) this).field_s > (float)var6) {
                        break L3;
                      } else {
                        if (((cka) this).field_od < (float)var6) {
                          break L3;
                        } else {
                          if ((float)var7 < ((cka) this).field_nd) {
                            break L3;
                          } else {
                            if (((cka) this).field_Db >= (float)var7) {
                              param3[1] = (int)((float)var7 - ((cka) this).field_nd);
                              param3[2] = (int)var5_float;
                              param3[0] = (int)((float)var6 - ((cka) this).field_s);
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    var8 = param3;
                    param3[2] = -1;
                    var9 = param3;
                    var8[0] = -1;
                    var9[1] = -1;
                    break L2;
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6_ref_int__ = param3;
            param3[2] = -1;
            var7_ref_int__ = param3;
            var7_ref_int__[1] = -1;
            var6_ref_int__[0] = -1;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("cka.da(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        if (param0 != 16363) {
            ((cka) this).c(31, -99);
        }
        if (!((!param1 ? 1 : 0) == (!((cka) this).field_qc ? 1 : 0))) {
            ((cka) this).field_qc = param1 ? true : false;
            this.p((byte) -87);
            ((cka) this).field_y = ((cka) this).field_y & -32;
        }
    }

    final void a(ks param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (0 > ((cka) this).field_Zc) {
                break L1;
              } else {
                if (((cka) this).field_M[((cka) this).field_Zc] == param0) {
                  L2: {
                    int fieldTemp$2 = ((cka) this).field_Zc;
                    ((cka) this).field_Zc = ((cka) this).field_Zc - 1;
                    ((cka) this).field_M[fieldTemp$2] = null;
                    param0.d((byte) 60);
                    if (((cka) this).field_Zc >= 0) {
                      ((cka) this).field_t = ((cka) this).field_M[((cka) this).field_Zc];
                      ((cka) this).field_t.a((byte) -124);
                      break L2;
                    } else {
                      ((cka) this).field_t = null;
                      break L2;
                    }
                  }
                  L3: {
                    if (param1 == -38) {
                      break L3;
                    } else {
                      ((cka) this).field_l = null;
                      break L3;
                    }
                  }
                  break L0;
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("cka.KC(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = ((cka) this).field_L.a(param2, param0, param3, param1, 0);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          if (((cka) this).field_r != 0) {
            jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
            jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
            break L0;
          } else {
            L1: {
              var4 = 0;
              if (param0 == ((cka) this).field_gd) {
                break L1;
              } else {
                jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
                ((cka) this).field_gd = param0;
                var4 = 1;
                break L1;
              }
            }
            L2: {
              if (((cka) this).field_uc != param2) {
                jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
                var4 = 1;
                ((cka) this).field_uc = param2;
                break L2;
              } else {
                break L2;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              ((cka) this).field_y = ((cka) this).field_y & -30;
              break L0;
            }
          }
        }
        L3: {
          if (param1 == 8960) {
            break L3;
          } else {
            ((cka) this).field_Tc = null;
            break L3;
          }
        }
    }

    final void a(float param0, float param1, float param2) {
        ql.field_l = param0;
        fra.field_p = param1;
        vba.field_v = param2;
    }

    private final void f(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        while (!((cka) this).field_l.a()) {
            int incrementValue$0 = var2;
            var2++;
            if (!(5 >= incrementValue$0)) {
                throw new RuntimeException("");
            }
            vja.a(0, 1000L);
        }
    }

    final void a(tj param0, tj param1, tj param2, int param3, tj param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                jaggl.OpenGL.glDisableClientState(32884);
                break L1;
              } else {
                ((cka) this).a(91, param4.field_d);
                jaggl.OpenGL.glVertexPointer((int) param4.field_f, (int) param4.field_e, ((cka) this).field_tb.a(26653), ((cka) this).field_tb.b(121) + (long)param4.field_g);
                jaggl.OpenGL.glEnableClientState(32884);
                break L1;
              }
            }
            L2: {
              if (param2 != null) {
                ((cka) this).a(126, param2.field_d);
                jaggl.OpenGL.glNormalPointer((int) param2.field_e, ((cka) this).field_tb.a(26653), ((cka) this).field_tb.b(-82) - -(long)param2.field_g);
                jaggl.OpenGL.glEnableClientState(32885);
                break L2;
              } else {
                jaggl.OpenGL.glDisableClientState(32885);
                break L2;
              }
            }
            if (param3 <= -102) {
              L3: {
                if (param0 == null) {
                  jaggl.OpenGL.glDisableClientState(32886);
                  break L3;
                } else {
                  ((cka) this).a(105, param0.field_d);
                  jaggl.OpenGL.glColorPointer((int) param0.field_f, (int) param0.field_e, ((cka) this).field_tb.a(26653), ((cka) this).field_tb.b(-115) + (long)param0.field_g);
                  jaggl.OpenGL.glEnableClientState(32886);
                  break L3;
                }
              }
              L4: {
                if (param1 == null) {
                  jaggl.OpenGL.glDisableClientState(32888);
                  break L4;
                } else {
                  ((cka) this).a(87, param1.field_d);
                  jaggl.OpenGL.glTexCoordPointer((int) param1.field_f, (int) param1.field_e, ((cka) this).field_tb.a(26653), ((cka) this).field_tb.b(89) - -(long)param1.field_g);
                  jaggl.OpenGL.glEnableClientState(32888);
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("cka.HC(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param3).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    final void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((cka) this).a((byte) 88, (float)param6);
        this.d((byte) -71);
        this.b(16363, false);
        ((cka) this).a(116, false);
        this.c(3742, false);
        this.a(false, 0);
        ((cka) this).a(true, (kl) null);
        ((cka) this).c(-2, 32677);
        ((cka) this).d(1, 1);
        ((cka) this).a((byte) 91, param8);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex3f((float)param0, (float)param1, (float)param2);
        jaggl.OpenGL.glVertex3f((float)param3, (float)param4, (float)param5);
        jaggl.OpenGL.glEnd();
    }

    public static void t(int param0) {
        field_fd = null;
        field_Mc = null;
    }

    final void q(int param0) {
        if (!(param0 == ((cka) this).field_y)) {
            this.r(0);
            this.b(param0 ^ 16361, false);
            ((cka) this).a(109, false);
            this.c(3742, false);
            this.a(false, 0);
            ((cka) this).c(-2, 32677);
            ((cka) this).field_y = 2;
        }
    }

    final za a(int param0) {
        cp var2 = new cp(param0);
        ((cka) this).field_qb.b((byte) -97, (vg) (Object) var2);
        return (za) (Object) var2;
    }

    final void c(int param0, int param1) {
        if (param1 != 32677) {
            ((cka) this).field_ic = null;
        }
        ((cka) this).a((byte) 70, true, param0);
    }

    final void a(nh param0, boolean param1) {
        RuntimeException var3 = null;
        cla var3_ref = null;
        kba var3_ref2 = null;
        od var4 = null;
        int var6 = 0;
        cla var7 = null;
        cla var8 = null;
        kba var9 = null;
        kba var10 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ((cka) this).field_Mb = (jja) (Object) param0;
              if (((cka) this).field_id) {
                L2: {
                  if (null == ((cka) this).field_bb) {
                    ((cka) this).field_bb = new cb((cka) this);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if ((Object) (Object) ((cka) this).field_bb == (Object) (Object) ((cka) this).field_Qb) {
                  throw new RuntimeException();
                } else {
                  L3: {
                    ((cka) this).b((ks) (Object) ((cka) this).field_bb, (byte) 81);
                    if (!param1) {
                      break L3;
                    } else {
                      L4: {
                        var3_ref2 = (kba) (Object) ((cka) this).field_Wc.a((byte) -106, (long)(((cka) this).field_Mb.a() << 16 | ((cka) this).field_Mb.c()));
                        if (var3_ref2 == null) {
                          var9 = new kba((cka) this, 6402, ((cka) this).field_Mb.a(), ((cka) this).field_Mb.c());
                          var3_ref2 = var9;
                          ((cka) this).field_rc = ((cka) this).field_rc + var9.field_o;
                          L5: while (true) {
                            L6: {
                              if (((cka) this).field_rc <= 2097152) {
                                break L6;
                              } else {
                                var4 = ((cka) this).field_F.b(-125);
                                if (var4 != null) {
                                  var10 = (kba) (Object) var4;
                                  var10.c(-7975);
                                  var10.p(125);
                                  var10.g(77);
                                  ((cka) this).field_rc = ((cka) this).field_rc - var10.field_o;
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            ((cka) this).field_Wc.a((long)(((cka) this).field_Mb.a() << 16 | ((cka) this).field_Mb.c()), 124, (vg) (Object) var9);
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      ((cka) this).field_F.a(97, (od) (Object) var3_ref2);
                      ((cka) this).field_bb.a(8, var3_ref2, true);
                      break L3;
                    }
                  }
                  ((cka) this).field_bb.a(true, (rt) (Object) ((cka) this).field_Mb.field_a, 0);
                  break L1;
                }
              } else {
                if (((cka) this).field_Yc) {
                  L7: {
                    var3_ref = (cla) (Object) ((cka) this).field_Wc.a((byte) -109, (long)(((cka) this).field_Mb.a() << 16 | ((cka) this).field_Mb.c()));
                    if (var3_ref != null) {
                      break L7;
                    } else {
                      var7 = new cla((cka) this, ((cka) this).field_Mb.a(), ((cka) this).field_Mb.c());
                      var3_ref = var7;
                      ((cka) this).field_rc = ((cka) this).field_rc + 4 * var7.field_p;
                      L8: while (true) {
                        L9: {
                          if (2097152 >= ((cka) this).field_rc) {
                            break L9;
                          } else {
                            var4 = ((cka) this).field_F.b(-119);
                            if (var4 != null) {
                              var8 = (cla) (Object) var4;
                              var8.c(-7975);
                              var8.p(21);
                              ((cka) this).field_l.releasePbuffer(var8.a((byte) 101));
                              ((cka) this).field_rc = ((cka) this).field_rc - var8.field_p;
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((cka) this).field_Wc.a((long)(((cka) this).field_Mb.a() << 16 | ((cka) this).field_Mb.c()), 112, (vg) (Object) var7);
                        break L7;
                      }
                    }
                  }
                  ((cka) this).field_F.a(75, (od) (Object) var3_ref);
                  ((cka) this).field_l.setPbuffer(var3_ref.a((byte) 101));
                  break L1;
                } else {
                  throw new RuntimeException("");
                }
              }
            }
            ((cka) this).field_Y = param0.a();
            ((cka) this).field_I = param0.c();
            this.s(3682);
            this.h((byte) 115);
            ((cka) this).la();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("cka.AE(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
        }
    }

    final int XA() {
        return ((cka) this).field_ob;
    }

    private final void b(boolean param0) {
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMultMatrixf(((cka) this).field_j.e(-112), 0);
        if (((cka) this).field_hb) {
            ((cka) this).field_Hb.field_h.a((byte) -120);
        }
        this.p(0);
        this.d(-1);
    }

    final synchronized void c(int param0, int param1, int param2) {
        if (param0 != 2) {
            ((cka) this).a(92, true);
        }
        al var4 = new al(param1);
        var4.field_d = (long)param2;
        ((cka) this).field_Vb.b((byte) -84, (vg) (Object) var4);
    }

    final void a(int param0, ks param1) {
        try {
            if (3 <= ((cka) this).field_A) {
                throw new RuntimeException();
            }
            if (param0 <= ((cka) this).field_A) {
                ((cka) this).field_kd[((cka) this).field_A].a(4245);
            }
            int fieldTemp$0 = ((cka) this).field_A + 1;
            ((cka) this).field_A = ((cka) this).field_A + 1;
            ((cka) this).field_kd[fieldTemp$0] = param1;
            ((cka) this).field_Qb = param1;
            ((cka) this).field_Qb.c((byte) 86);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cka.MC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void m(int param0) {
        ((cka) this).field_xb = -((cka) this).field_ec + (float)(((cka) this).field_ob + -((cka) this).field_Xc);
        ((cka) this).field_Uc = -(((cka) this).field_oc * (float)((cka) this).field_Kb) + ((cka) this).field_xb;
        if (((cka) this).field_Uc < (float)((cka) this).field_Gc) {
            ((cka) this).field_Uc = (float)((cka) this).field_Gc;
        }
        jaggl.OpenGL.glFogf(2915, ((cka) this).field_Uc);
        jaggl.OpenGL.glFogf(2916, ((cka) this).field_xb);
        gp.field_d[0] = (float)sea.c(((cka) this).field_gc, 16711680) / 16711680.0f;
        gp.field_d[1] = (float)sea.c(65280, ((cka) this).field_gc) / 65280.0f;
        gp.field_d[2] = (float)sea.c(255, ((cka) this).field_gc) / 255.0f;
        jaggl.OpenGL.glFogfv(2918, gp.field_d, 0);
    }

    final void DA(int param0, int param1, int param2, int param3) {
        ((cka) this).field_o = param0;
        ((cka) this).field_W = param2;
        ((cka) this).field_db = param1;
        ((cka) this).field_kb = param3;
        this.g(0);
        this.r((byte) -126);
        if (((cka) this).field_e == 3) {
            this.l(-4709);
        } else {
            if (!(2 != ((cka) this).field_e)) {
                this.l((byte) -37);
            }
        }
    }

    final void ya() {
        this.a(true, 0);
        jaggl.OpenGL.glClear(256);
    }

    final void c() {
        ((cka) this).field_L.a((byte) -112);
    }

    final void za(int param0, int param1, int param2, int param3, int param4) {
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param2 < 0) {
            param2 = -param2;
            break L0;
          } else {
            break L0;
          }
        }
        if (((cka) this).field_Ib > param2 + param0) {
          return;
        } else {
          L1: {
            if (((cka) this).field_B < -param2 + param0) {
              break L1;
            } else {
              if (((cka) this).field_f > param2 + param1) {
                break L1;
              } else {
                if (param1 - param2 <= ((cka) this).field_kc) {
                  this.i((byte) -110);
                  ((cka) this).a((byte) 120, param4);
                  jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
                  var6 = 0.3499999940395355f + (float)param0;
                  var7 = (float)param1 + 0.3499999940395355f;
                  var8 = param2 << 1;
                  if ((float)var8 < ((cka) this).field_Qc) {
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glVertex2f(var6 + 1.0f, 1.0f + var7);
                    jaggl.OpenGL.glVertex2f(1.0f + var6, var7 - 1.0f);
                    jaggl.OpenGL.glVertex2f(var6 - 1.0f, -1.0f + var7);
                    jaggl.OpenGL.glVertex2f(-1.0f + var6, 1.0f + var7);
                    jaggl.OpenGL.glEnd();
                    return;
                  } else {
                    L2: {
                      if ((float)var8 <= ((cka) this).field_Cb) {
                        jaggl.OpenGL.glEnable(2832);
                        jaggl.OpenGL.glPointSize((float)var8);
                        jaggl.OpenGL.glBegin(0);
                        jaggl.OpenGL.glVertex2f(var6, var7);
                        jaggl.OpenGL.glEnd();
                        jaggl.OpenGL.glDisable(2832);
                        break L2;
                      } else {
                        L3: {
                          jaggl.OpenGL.glBegin(6);
                          jaggl.OpenGL.glVertex2f(var6, var7);
                          var9 = 262144 / (6 * param2);
                          if (var9 > 64) {
                            if (var9 <= 512) {
                              break L3;
                            } else {
                              var9 = 512;
                              break L3;
                            }
                          } else {
                            var9 = 64;
                            break L3;
                          }
                        }
                        var9 = b.a(var9, (byte) -101);
                        jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
                        var10 = -var9 + 16384;
                        L4: while (true) {
                          if (var10 <= 0) {
                            jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
                            jaggl.OpenGL.glEnd();
                            break L2;
                          } else {
                            jaggl.OpenGL.glVertex2f(var6 + (float)param2 * hu.field_c[var10], (float)param2 * hu.field_b[var10] + var7);
                            var10 = var10 - var9;
                            continue L4;
                          }
                        }
                      }
                    }
                    return;
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

    private final void s(int param0) {
        if (0 != ((cka) this).field_e) {
            ((cka) this).field_e = 0;
            ((cka) this).field_y = ((cka) this).field_y & -32;
        }
    }

    final void b(ks param0, int param1) {
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
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 0) {
              L1: {
                if (((cka) this).field_hc) {
                  ((cka) this).a(param0, (byte) -38);
                  ((cka) this).a(param0, param1 + -1090);
                  break L1;
                } else {
                  L2: {
                    if (0 > ((cka) this).field_x) {
                      break L2;
                    } else {
                      if (param0 == ((cka) this).field_ub[((cka) this).field_x]) {
                        int fieldTemp$5 = ((cka) this).field_x;
                        ((cka) this).field_x = ((cka) this).field_x - 1;
                        ((cka) this).field_ub[fieldTemp$5] = null;
                        param0.b((byte) -36);
                        if (((cka) this).field_x >= 0) {
                          ((cka) this).field_Qb = ((cka) this).field_ub[((cka) this).field_x];
                          ((cka) this).field_t = ((cka) this).field_ub[((cka) this).field_x];
                          ((cka) this).field_t.b(param1 + 13109);
                          break L1;
                        } else {
                          ((cka) this).field_Qb = null;
                          ((cka) this).field_t = null;
                          break L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("cka.TC(");
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.a((byte) -10);
        this.b(16363, false);
        ((cka) this).a(52, false);
        this.c(3742, false);
        this.a(false, 0);
        ((cka) this).a(true, (kl) null);
        ((cka) this).c(-2, 32677);
        ((cka) this).d(1, 1);
        ((cka) this).a((byte) 44, param7);
        jaggl.OpenGL.glColor4ub((byte)(param6 >> 16), (byte)(param6 >> 8), (byte)param6, (byte)(param6 >> 24));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex3f((float)param0, (float)param1, (float)param2);
        jaggl.OpenGL.glVertex3f((float)param3, (float)param4, (float)param5);
        jaggl.OpenGL.glEnd();
    }

    final void u(int param0) {
        jaggl.OpenGL.glPushMatrix();
        if (param0 != 28630) {
            ((cka) this).field_lc = null;
        }
    }

    final void L(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (((cka) this).field_gc != param0) {
              break L1;
            } else {
              if (param1 != ((cka) this).field_Kb) {
                break L1;
              } else {
                if (param2 == ((cka) this).field_Xc) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((cka) this).field_gc = param0;
          ((cka) this).field_Xc = param2;
          ((cka) this).field_Kb = param1;
          this.m(2916);
          this.p((byte) -87);
          break L0;
        }
    }

    private final void a(byte param0) {
        if (!(((cka) this).field_e == 2)) {
            ((cka) this).field_e = 2;
            this.l((byte) -37);
            this.b(false);
            ((cka) this).field_y = ((cka) this).field_y & -8;
        }
    }

    final int a(int param0, byte param1) {
        L0: {
          if (param1 <= -53) {
            break L0;
          } else {
            ((cka) this).field_uc = -62;
            break L0;
          }
        }
        L1: {
          if (param0 == 6406) {
            break L1;
          } else {
            if (param0 == 6409) {
              break L1;
            } else {
              L2: {
                if (param0 == 6410) {
                  break L2;
                } else {
                  if (param0 == 34846) {
                    break L2;
                  } else {
                    if (34844 != param0) {
                      if (param0 == 6407) {
                        return 3;
                      } else {
                        L3: {
                          if (param0 == 6408) {
                            break L3;
                          } else {
                            if (param0 != 34847) {
                              if (param0 != 34843) {
                                if (param0 != 34842) {
                                  if (param0 == 6402) {
                                    return 3;
                                  } else {
                                    if (param0 != 6401) {
                                      throw new IllegalArgumentException("");
                                    } else {
                                      return 1;
                                    }
                                  }
                                } else {
                                  return 8;
                                }
                              } else {
                                return 6;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        return 4;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return 2;
            }
          }
        }
        return 1;
    }

    final void a(int param0, ob[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param0) {
                L2: {
                  ((cka) this).field_sb = param0;
                  if (((cka) this).field_e != 1) {
                    this.d(-1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                ((cka) this).field_Dc[var3_int] = param1[var3_int];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("cka.JB(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        ((cka) this).field_Jc = param0 ? true : false;
        this.c((byte) 13);
        if (param1) {
            ((cka) this).field_t = null;
        }
    }

    private final void b(byte param0) {
        java.awt.Dimension var2 = null;
        if (null == ((cka) this).field_ad) {
            ((cka) this).field_R = 0;
            ((cka) this).field_C = 0;
        } else {
            var2 = ((cka) this).field_ad.getSize();
            ((cka) this).field_R = var2.width;
            ((cka) this).field_C = var2.height;
        }
        if (!(((cka) this).field_Qb != null)) {
            ((cka) this).field_I = ((cka) this).field_C;
            ((cka) this).field_Y = ((cka) this).field_R;
            this.h((byte) -117);
        }
        this.s(3682);
        ((cka) this).la();
    }

    final hoa n(int param0) {
        if (param0 != 16664) {
            ((cka) this).field_Zb = -2.1042897701263428f;
        }
        if (((cka) this).field_Sc == null) {
            return null;
        }
        return ((cka) this).field_Sc.b(5995);
    }

    private final int b(byte param0, int param1) {
        if (param1 == 5121) {
          return 1;
        } else {
          if (param1 != 5120) {
            L0: {
              if (param1 == 5123) {
                break L0;
              } else {
                if (param1 == 5122) {
                  break L0;
                } else {
                  L1: {
                    if (param1 == 5125) {
                      break L1;
                    } else {
                      if (param1 == 5124) {
                        break L1;
                      } else {
                        if (param1 != 5126) {
                          throw new IllegalArgumentException("");
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  return 4;
                }
              }
            }
            return 2;
          } else {
            return 1;
          }
        }
    }

    private final void i(byte param0) {
        if (param0 >= -106) {
            ((cka) this).field_d = true;
        }
        if (!(1 == ((cka) this).field_y)) {
            this.r(0);
            this.b(16363, false);
            ((cka) this).a(36, false);
            this.c(3742, false);
            this.a(false, 0);
            ((cka) this).a(true, (kl) null);
            ((cka) this).c(-2, 32677);
            ((cka) this).d(1, 1);
            ((cka) this).field_y = 1;
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            this.r(0);
            ((cka) this).a(true, (kl) null);
            ((cka) this).a((byte) 44, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((cka) this).field_P, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cka.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final int[] Y() {
        return new int[]{((cka) this).field_o, ((cka) this).field_db, ((cka) this).field_W, ((cka) this).field_kb};
    }

    final void GA(int param0) {
        ((cka) this).a((byte) 65, 0);
        jaggl.OpenGL.glClearColor((float)(16711680 & param0) / 16711680.0f, (float)(65280 & param0) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final nh a(jpa param0, boolean param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        nh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        nh stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        nh stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new int[param0.field_a * param0.field_i];
              var14 = var10;
              var13 = var14;
              var12 = var13;
              var11 = var12;
              var3_array = var11;
              var4 = 0;
              var5 = 0;
              if (param0.field_h != null) {
                var6_int = 0;
                L2: while (true) {
                  if (param0.field_a <= var6_int) {
                    break L1;
                  } else {
                    var7 = 0;
                    L3: while (true) {
                      if (param0.field_i <= var7) {
                        var6_int++;
                        continue L2;
                      } else {
                        int incrementValue$3 = var5;
                        var5++;
                        var3_array[incrementValue$3] = fh.a(param0.field_h[var4] << 24, param0.field_g[sea.c((int) param0.field_f[var4], 255)]);
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
                  if (param0.field_a <= var6_int) {
                    break L1;
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= param0.field_i) {
                        var6_int++;
                        continue L4;
                      } else {
                        L6: {
                          int incrementValue$4 = var4;
                          var4++;
                          var8 = param0.field_g[255 & param0.field_f[incrementValue$4]];
                          int incrementValue$5 = var5;
                          var5++;
                          stackOut_6_0 = (int[]) var10;
                          stackOut_6_1 = incrementValue$5;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (0 != var8) {
                            stackOut_8_0 = (int[]) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = fh.a(-16777216, var8);
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L6;
                          } else {
                            stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = 0;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
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
            var6 = ((cka) this).a(var14, param0.field_a, 96, param0.field_i, param0.field_i, 0);
            var6.b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
            stackOut_17_0 = (nh) var6;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("cka.EB(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    private final void o(byte param0) {
        ((cka) this).field_vc = new kl[((cka) this).field_Ic];
        ((cka) this).field_lc = new rt((cka) this, 3553, 6408, 1, 1);
        rt discarded$0 = new rt((cka) this, 3553, 6408, 1, 1);
        rt discarded$1 = new rt((cka) this, 3553, 6408, 1, 1);
        ((cka) this).field_w = new np((cka) this);
        ((cka) this).field_Nb = new np((cka) this);
        ((cka) this).field_Ub = new np((cka) this);
        ((cka) this).field_E = new np((cka) this);
        if (param0 < 17) {
            return;
        }
        ((cka) this).field_yb = new np((cka) this);
        ((cka) this).field_i = new np((cka) this);
        ((cka) this).field_eb = new np((cka) this);
        ((cka) this).field_sc = new np((cka) this);
        ((cka) this).field_D = new np((cka) this);
        ((cka) this).field_Xb = new np((cka) this);
        if (((cka) this).field_id) {
            ((cka) this).field_ic = new cb((cka) this);
            cb discarded$2 = new cb((cka) this);
        }
    }

    final sca a(int param0, int param1, int param2, boolean param3, byte[] param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        nm stackIn_8_0 = null;
        o stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_7_0 = null;
        o stackOut_9_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 <= -49) {
              L1: {
                if (!((cka) this).field_Q) {
                  break L1;
                } else {
                  L2: {
                    if (!param3) {
                      break L2;
                    } else {
                      if (((cka) this).field_bd) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_7_0 = new nm((cka) this, param2, param4, param1, param3);
                  stackIn_8_0 = stackOut_7_0;
                  return (sca) (Object) stackIn_8_0;
                }
              }
              stackOut_9_0 = new o((cka) this, param2, param4, param1);
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (sca) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("cka.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return (sca) (Object) stackIn_10_0;
    }

    final void a(float param0, boolean param1, float param2) {
        ((cka) this).field_ec = param0;
        ((cka) this).field_oc = param2;
        if (!param1) {
            return;
        }
        this.m(2916);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = 22238;
        field_ab = 0;
    }
}
