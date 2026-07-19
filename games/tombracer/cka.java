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
            this.field_l.swapBuffers();
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
        this.a((byte) 50, param4);
        float var6 = 0.3499999940395355f + (float)param0;
        float var7 = (float)param1 + 0.3499999940395355f;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> -707746608), (byte)(param3 >> 1087690792), (byte)param3, (byte)(param3 >> -1078207400));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
        jaggl.OpenGL.glEnd();
    }

    final gda b() {
        return (gda) ((Object) new oba());
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
            stackOut_0_0 = new np((cka) (this), param0, param1, param3, param4, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("cka.MB(");
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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (ka) ((Object) stackIn_1_0);
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = (float)param2 + var7;
        this.i((byte) -116);
        float var10 = (float)param3 + var8;
        this.a((byte) 40, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> -878910384), (byte)(param4 >> 1424663176), (byte)param4, (byte)(param4 >> 1854935800));
        if (!(!this.field_S)) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (this.field_S) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void c(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
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
          if (this.field_d) {
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
          if (stackIn_6_0 == stackIn_6_1) {
            break L2;
          } else {
            L3: {
              L4: {
                if (!param1) {
                  break L4;
                } else {
                  jaggl.OpenGL.glEnable(2929);
                  if (!TombRacer.field_G) {
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
              this.field_y = this.field_y & -32;
              stackOut_11_0 = this;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (!param1) {
                stackOut_13_0 = this;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L5;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L5;
              }
            }
            ((cka) (this)).field_d = stackIn_14_1 != 0;
            break L2;
          }
        }
        L6: {
          if (param0 == 3742) {
            break L6;
          } else {
            this.field_vb = -64;
            break L6;
          }
        }
    }

    final void d() {
        boolean discarded$4 = false;
        L0: {
          if (this.field_id) {
            if (this.field_Qb == this.field_bb) {
              this.field_bb.a(-92, 0);
              this.field_bb.a(-120, 8);
              this.b(this.field_bb, 0);
              break L0;
            } else {
              throw new RuntimeException();
            }
          } else {
            L1: {
              if (!this.field_Yc) {
                break L1;
              } else {
                this.field_Mb.b(this.field_I, 0, 0, 0, this.field_Y, 8448, 0);
                discarded$4 = this.field_l.setSurface(this.field_n);
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException("");
          }
        }
        this.field_I = this.field_C;
        this.field_Mb = null;
        this.field_Y = this.field_R;
        this.s(3682);
        this.h((byte) 114);
        this.la();
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (!(param2 >= this.field_B)) {
            this.field_B = param2;
        }
        if (param3 < this.field_kc) {
            this.field_kc = param3;
        }
        if ((this.field_f ^ -1) > (param1 ^ -1)) {
            this.field_f = param1;
        }
        if (!((this.field_Ib ^ -1) <= (param0 ^ -1))) {
            this.field_Ib = param0;
        }
        jaggl.OpenGL.glEnable(3089);
        this.r((byte) -115);
        this.q((byte) 123);
    }

    final void b(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 - -param2, param0);
        if (param1 != 3) {
            this.field_k = (String) null;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34200 - -param2, param3);
    }

    final void a(int param0, int param1, int param2) {
        this.field_Pc = param1;
        this.field_g = param2;
        this.h((byte) -114);
        this.q((byte) 83);
        if (param0 != 4) {
            this.field_od = 2.034196376800537f;
        }
    }

    final va a(int param0, byte[] param1, int param2, boolean param3, byte param4) {
        za discarded$2 = null;
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
        int decompiledRegionSelector0 = 0;
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
              if (!this.field_Q) {
                break L1;
              } else {
                L2: {
                  if (!param3) {
                    break L2;
                  } else {
                    if (!this.field_bd) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_4_0 = new wo((cka) (this), param2, param1, param0, param3);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L3: {
              if (param4 >= 40) {
                break L3;
              } else {
                discarded$2 = this.a(89);
                break L3;
              }
            }
            stackOut_8_0 = new lra((cka) (this), param2, param1, param0);
            stackIn_9_0 = stackOut_8_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("cka.JC(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (va) ((Object) stackIn_5_0);
        } else {
          return (va) ((Object) stackIn_9_0);
        }
    }

    private final void m(byte param0) {
        L0: {
          L1: {
            if (!this.field_Ac) {
              break L1;
            } else {
              if (this.field_v) {
                break L1;
              } else {
                jaggl.OpenGL.glEnable(2896);
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          jaggl.OpenGL.glDisable(2896);
          break L0;
        }
        L2: {
          if (param0 == -52) {
            break L2;
          } else {
            this.field_Rc = (sca) null;
            break L2;
          }
        }
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = 0.3499999940395355f + (float)param1;
        float var9 = var7 + (float)param2 - 1.0f;
        float var10 = var8 + (float)param3 - 1.0f;
        this.i((byte) -119);
        this.a((byte) 21, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 1111579376), (byte)(param4 >> 482588904), (byte)param4, (byte)(param4 >> 101935800));
        if (this.field_S) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(2);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (!(!this.field_S)) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void l(int param0) {
        float var2 = (float)(-this.field_o) * this.field_yc / (float)this.field_W;
        float var3 = this.field_yc * (float)(-this.field_db) / (float)this.field_kb;
        float var4 = this.field_yc * (float)(-this.field_o + this.field_Y) / (float)this.field_W;
        float var5 = this.field_yc * (float)(this.field_I - this.field_db) / (float)this.field_kb;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (var4 != var2) {
            if (!(var5 == var3)) {
                jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field_Gc, (double)this.field_ob);
            }
        }
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0 != -4709) {
            this.c(true);
        }
    }

    private final void q(byte param0) {
        L0: {
          if (param0 > 1) {
            break L0;
          } else {
            this.field_nc = false;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if ((this.field_B ^ -1) > (this.field_Ib ^ -1)) {
                break L3;
              } else {
                if (this.field_f <= this.field_kc) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            jaggl.OpenGL.glScissor(0, 0, 0, 0);
            if (!TombRacer.field_G) {
              break L1;
            } else {
              break L2;
            }
          }
          jaggl.OpenGL.glScissor(this.field_Ib + this.field_g, -this.field_kc + (this.field_Pc - -this.field_I), this.field_B - this.field_Ib, -this.field_f + this.field_kc);
          break L1;
        }
    }

    final void a(boolean param0, kl param1) {
        kl var3 = null;
        RuntimeException var3_ref = null;
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
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = this.field_vc[this.field_r];
              if (var3 != param1) {
                L2: {
                  L3: {
                    if (param1 == null) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          if (var3 != null) {
                            break L5;
                          } else {
                            jaggl.OpenGL.glEnable(param1.field_e);
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (param1.field_e != var3.field_e) {
                          jaggl.OpenGL.glDisable(var3.field_e);
                          jaggl.OpenGL.glEnable(param1.field_e);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      jaggl.OpenGL.glBindTexture(param1.field_e, param1.f(0));
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  jaggl.OpenGL.glDisable(var3.field_e);
                  break L2;
                }
                this.field_vc[this.field_r] = param1;
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              this.field_y = this.field_y & -2;
              if (param0) {
                break L6;
              } else {
                this.field_Vb = (vna) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("cka.GC(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    private final void a(float param0, int param1, float param2, float param3) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (!(!this.field_U)) {
            jaggl.OpenGL.glLoadIdentity();
        }
        if (param1 != 25380) {
            this.a((za) null);
        }
        jaggl.OpenGL.glTranslatef(param3, param0, param2);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_U = true;
    }

    final void a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (!this.field_nc) {
          return;
        } else {
          L0: {
            if (-1 <= (this.field_Y ^ -1)) {
              break L0;
            } else {
              if ((this.field_I ^ -1) >= -1) {
                break L0;
              } else {
                var1 = this.field_Ib;
                var2 = this.field_B;
                var3 = this.field_f;
                var4 = this.field_kc;
                this.la();
                jaggl.OpenGL.glReadBuffer(1028);
                jaggl.OpenGL.glDrawBuffer(1029);
                this.s(3682);
                this.b(16363, false);
                this.a(81, false);
                this.c(3742, false);
                this.a(false, 0);
                this.a(true, (kl) null);
                this.c(-2, 32677);
                this.d(1, 1);
                this.a((byte) 57, 0);
                jaggl.OpenGL.glMatrixMode(5889);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                jaggl.OpenGL.glMatrixMode(5888);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glRasterPos2i(0, 0);
                jaggl.OpenGL.glCopyPixels(0, 0, this.field_Y, this.field_I, 6144);
                jaggl.OpenGL.glFlush();
                jaggl.OpenGL.glReadBuffer(1029);
                jaggl.OpenGL.glDrawBuffer(1029);
                this.KA(var1, var3, var2, var4);
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
              if (this.field_tb == param1) {
                break L1;
              } else {
                L2: {
                  if (this.field_Q) {
                    jaggl.OpenGL.glBindBufferARB(34962, param1.a(true));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_tb = param1;
                break L1;
              }
            }
            L3: {
              if (param0 > 74) {
                break L3;
              } else {
                this.field_fc = (oba) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("cka.IC(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void o(int param0) {
        int var2 = -116 / ((14 - param0) / 62);
        if (4 != this.field_y) {
            this.r(0);
            this.b(16363, false);
            this.a(104, false);
            this.c(3742, false);
            this.a(false, 0);
            this.c(-2, 32677);
            this.a((byte) 110, 1);
            this.field_y = 4;
        }
    }

    final void a(gda param0) {
        try {
            this.field_jd.a(param0, 124);
            this.field_j.a(this.field_jd, -66);
            this.field_j.c((byte) 57);
            this.field_Tc.a((gda) (this.field_j), (byte) 112);
            if ((this.field_e ^ -1) != -2) {
                this.b(false);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cka.W(" + (param0 != null ? "{...}" : "null") + ')');
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
        this.field_Bb[14] = this.field_Zb;
        this.field_Bb[10] = this.field_zb;
        this.field_m = (float)this.field_ob;
        this.field_u = ((float)(-this.field_ob) + this.field_Bb[14]) / this.field_Bb[10];
    }

    final boolean j() {
        return true;
    }

    final synchronized void c(int param0) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
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
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
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
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_pd.d((byte) 14)) {
                break L2;
              } else {
                var5 = (al) ((Object) this.field_pd.c(-108));
                incrementValue$6 = var2;
                var2++;
                qo.field_k[incrementValue$6] = (int)var5.field_d;
                this.field_mb = this.field_mb - var5.field_i;
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
                      jaggl.OpenGL.glDeleteBuffersARB(var2, qo.field_k, 0);
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
            stackOut_6_0 = 0;
            stackOut_6_1 = var2;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          }
          L4: {
            if (stackIn_7_0 >= stackIn_7_1) {
              break L4;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, qo.field_k, 0);
              var2 = 0;
              break L4;
            }
          }
          L5: while (true) {
            L6: {
              L7: {
                if (this.field_K.d((byte) 14)) {
                  break L7;
                } else {
                  var6 = (al) ((Object) this.field_K.c(63));
                  incrementValue$7 = var2;
                  var2++;
                  qo.field_k[incrementValue$7] = (int)var6.field_d;
                  this.field_jb = this.field_jb - var6.field_i;
                  stackOut_11_0 = 1000;
                  stackOut_11_1 = var2;
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
                        jaggl.OpenGL.glDeleteTextures(var2, qo.field_k, 0);
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
              stackOut_15_0 = -1;
              stackOut_15_1 = var2 ^ -1;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L6;
            }
            L9: {
              if (stackIn_16_0 <= stackIn_16_1) {
                break L9;
              } else {
                jaggl.OpenGL.glDeleteTextures(var2, qo.field_k, 0);
                var2 = 0;
                break L9;
              }
            }
            L10: while (true) {
              L11: {
                L12: {
                  if (this.field_cc.d((byte) 14)) {
                    break L12;
                  } else {
                    var7 = (al) ((Object) this.field_cc.c(-103));
                    incrementValue$8 = var2;
                    var2++;
                    qo.field_k[incrementValue$8] = var7.field_i;
                    stackOut_20_0 = var2;
                    stackOut_20_1 = 1000;
                    stackIn_70_0 = stackOut_20_0;
                    stackIn_70_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (var4 != 0) {
                      break L11;
                    } else {
                      L13: {
                        if (stackIn_21_0 == stackIn_21_1) {
                          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, qo.field_k, 0);
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
                L14: {
                  L15: {
                    if (var2 > 0) {
                      jaggl.OpenGL.glDeleteFramebuffersEXT(var2, qo.field_k, 0);
                      var2 = 0;
                      L16: while (true) {
                        if (this.field_Vb.d((byte) 14)) {
                          break L14;
                        } else {
                          var8 = (al) ((Object) this.field_Vb.c(-117));
                          incrementValue$9 = var2;
                          var2++;
                          qo.field_k[incrementValue$9] = (int)var8.field_d;
                          this.field_Tb = this.field_Tb - var8.field_i;
                          stackOut_35_0 = var2;
                          stackOut_35_1 = 1000;
                          stackIn_70_0 = stackOut_35_0;
                          stackIn_70_1 = stackOut_35_1;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          if (var4 != 0) {
                            break L11;
                          } else {
                            L17: {
                              if (stackIn_36_0 == stackIn_36_1) {
                                jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
                                var2 = 0;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var4 == 0) {
                              continue L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    } else {
                      L18: while (true) {
                        if (this.field_Vb.d((byte) 14)) {
                          break L14;
                        } else {
                          var8 = (al) ((Object) this.field_Vb.c(-117));
                          incrementValue$10 = var2;
                          var2++;
                          qo.field_k[incrementValue$10] = (int)var8.field_d;
                          this.field_Tb = this.field_Tb - var8.field_i;
                          stackOut_27_0 = var2;
                          stackOut_27_1 = 1000;
                          stackIn_70_0 = stackOut_27_0;
                          stackIn_70_1 = stackOut_27_1;
                          stackIn_28_0 = stackOut_27_0;
                          stackIn_28_1 = stackOut_27_1;
                          if (var4 != 0) {
                            break L11;
                          } else {
                            L19: {
                              if (stackIn_28_0 == stackIn_28_1) {
                                jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
                                var2 = 0;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            if (var4 == 0) {
                              continue L18;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                  }
                  jaggl.OpenGL.glDeleteFramebuffersEXT(var2, qo.field_k, 0);
                  var2 = 0;
                  L20: while (true) {
                    if (this.field_Vb.d((byte) 14)) {
                      break L14;
                    } else {
                      var8 = (al) ((Object) this.field_Vb.c(-117));
                      incrementValue$11 = var2;
                      var2++;
                      qo.field_k[incrementValue$11] = (int)var8.field_d;
                      this.field_Tb = this.field_Tb - var8.field_i;
                      stackOut_42_0 = var2;
                      stackOut_42_1 = 1000;
                      stackIn_70_0 = stackOut_42_0;
                      stackIn_70_1 = stackOut_42_1;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      if (var4 != 0) {
                        break L11;
                      } else {
                        L21: {
                          if (stackIn_43_0 == stackIn_43_1) {
                            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
                            var2 = 0;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        if (var4 == 0) {
                          continue L20;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                }
                L22: {
                  if (var2 <= 0) {
                    break L22;
                  } else {
                    jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
                    var2 = 0;
                    break L22;
                  }
                }
                L23: while (true) {
                  L24: {
                    L25: {
                      L26: {
                        L27: {
                          L28: {
                            L29: {
                              if (this.field_Lc.d((byte) 14)) {
                                break L29;
                              } else {
                                var9 = (al) ((Object) this.field_Lc.c(30));
                                jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                                if (var4 != 0) {
                                  break L28;
                                } else {
                                  if (var4 == 0) {
                                    continue L23;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                            }
                            L30: while (true) {
                              if (this.field_Fc.d((byte) 14)) {
                                break L28;
                              } else {
                                var10 = this.field_Fc.c(80);
                                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
                                if (var4 != 0) {
                                  break L26;
                                } else {
                                  if (var4 == 0) {
                                    continue L30;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                          }
                          break L27;
                        }
                        L31: while (true) {
                          if (this.field_rb.d((byte) 14)) {
                            break L26;
                          } else {
                            var11 = this.field_rb.c(50);
                            jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
                            if (var4 != 0) {
                              break L24;
                            } else {
                              if (var4 == 0) {
                                continue L31;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      break L25;
                    }
                    L32: while (true) {
                      L33: {
                        if (this.field_Lc.d((byte) 14)) {
                          break L33;
                        } else {
                          var12 = (al) ((Object) this.field_Lc.c(-99));
                          jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
                          if (var4 != 0) {
                            break L24;
                          } else {
                            if (var4 == 0) {
                              continue L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      this.field_hd.c(-29413);
                      break L24;
                    }
                  }
                  stackOut_69_0 = this.f(-44) ^ -1;
                  stackOut_69_1 = -100663297;
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  break L11;
                }
              }
              L34: {
                if (stackIn_70_0 >= stackIn_70_1) {
                  break L34;
                } else {
                  if ((bva.b((byte) -107) ^ -1L) >= (60000L + this.field_Lb ^ -1L)) {
                    break L34;
                  } else {
                    System.gc();
                    this.field_Lb = bva.b((byte) -107);
                    break L34;
                  }
                }
              }
              this.field_Oc = param0;
              return;
            }
          }
        }
    }

    final gda e() {
        return (gda) ((Object) this.field_fc);
    }

    final void h(int param0, int param1) {
        gp.field_d[0] = (float)sea.c(param1, 16711680) / 16711680.0f;
        gp.field_d[1] = (float)sea.c(65280, param1) / 65280.0f;
        gp.field_d[2] = (float)sea.c(255, param1) / 255.0f;
        gp.field_d[3] = (float)(param1 >>> 1104971864) / 255.0f;
        if (param0 != 1104971864) {
            return;
        }
        jaggl.OpenGL.glTexEnvfv(8960, 8705, gp.field_d, 0);
    }

    final void a(za param0) {
        RuntimeException var2 = null;
        qf var3 = null;
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
              this.field_md = ((cp) ((Object) param0)).field_h;
              if (null == this.field_X) {
                L2: {
                  L3: {
                    var3 = new qf(80);
                    if (this.field_O) {
                      break L3;
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
                      if (!TombRacer.field_G) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
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
                }
                this.field_X = this.a(var3.field_h, var3.field_g, 20, false, (byte) 108);
                this.field_Bc = new tj(this.field_X, 5126, 3, 0);
                this.field_Rb = new tj(this.field_X, 5126, 2, 12);
                this.field_Ec.a(22091, (cka) (this));
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
            stackOut_8_1 = new StringBuilder().append("cka.FB(");
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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if ((this.field_Gc ^ -1) != (param0 ^ -1)) {
              break L1;
            } else {
              if ((param1 ^ -1) != (this.field_ob ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            this.field_Gc = param0;
            this.field_ob = param1;
            this.g(0);
            this.m(2916);
            if ((this.field_e ^ -1) != -4) {
              break L2;
            } else {
              this.l(-4709);
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L2;
              }
            }
          }
          if (-3 != (this.field_e ^ -1)) {
            break L0;
          } else {
            this.l((byte) -37);
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
            this.a(param3, param2 + 35476);
            jaggl.OpenGL.glDrawElements(param1, param4, var6_int, (long)param0 + param3.b(19135));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cka.TB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(byte param0, float param1) {
        if (!(param1 == this.field_yc)) {
            this.field_yc = param1;
            if (!(-4 != (this.field_e ^ -1))) {
                this.l(param0 ^ -4669);
            }
        }
        if (param0 != 88) {
            this.field_N = -56;
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
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("cka.NB(");
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return (jca) ((Object) stackIn_1_0);
    }

    private final void l(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_Bb, 0);
        if (param0 != -37) {
            return;
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void a(ks param0, int param1) {
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
              if (this.field_A < 0) {
                break L1;
              } else {
                if (param0 == this.field_kd[this.field_A]) {
                  L2: {
                    L3: {
                      fieldTemp$2 = this.field_A;
                      this.field_A = this.field_A - 1;
                      this.field_kd[fieldTemp$2] = null;
                      param0.a(4245);
                      if (this.field_A < 0) {
                        break L3;
                      } else {
                        this.field_Qb = this.field_kd[this.field_A];
                        this.field_Qb.c((byte) 111);
                        if (!TombRacer.field_G) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_Qb = null;
                    break L2;
                  }
                  L4: {
                    if (param1 == -1090) {
                      break L4;
                    } else {
                      this.h((byte) -8);
                      break L4;
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
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("cka.QC(");
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
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    private final void r(byte param0) {
        if (param0 > -111) {
            return;
        }
        this.field_od = (float)(-this.field_o + this.field_B);
        this.field_nd = (float)(-this.field_db + this.field_f);
        this.field_Db = (float)(-this.field_db + this.field_kc);
        this.field_s = (float)(-this.field_o + this.field_Ib);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        if (param0 >= -2) {
            return;
        }
        al var4 = new al(param2);
        var4.field_d = (long)param1;
        this.field_K.b((byte) -110, var4);
    }

    final void a(float param0, float param1, float param2, byte param3, float param4) {
        gp.field_d[0] = param1;
        gp.field_d[1] = param0;
        gp.field_d[2] = param2;
        if (param3 != -76) {
            this.field_f = 81;
        }
        gp.field_d[3] = param4;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, gp.field_d, 0);
    }

    private final void e(byte param0) {
        if (!(!this.field_U)) {
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            this.field_U = false;
        }
        if (param0 != 112) {
            this.field_Gb = true;
        }
    }

    final int[] a(int param0, int param1, byte param2, int param3, int param4) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        var9 = new int[param0 * param1];
        var6 = var9;
        var7 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var7 >= param1) {
                break L2;
              } else {
                jaggl.OpenGL.glReadPixelsi(param4, -param3 + (this.field_I - var7), param0, 1, 32993, this.field_P, var9, var7 * param0);
                var7++;
                if (var8 != 0) {
                  break L1;
                } else {
                  if (var8 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param2 == -81) {
              break L1;
            } else {
              this.e(-23, 77);
              break L1;
            }
          }
          return var9;
        }
    }

    final boolean h() {
        if (this.field_T != null) {
            if (this.field_T.b((byte) -127)) {
                return true;
            }
            if (!this.field_L.a(1, this.field_T)) {
                return false;
            }
            this.field_hd.a(10659);
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
        this.field_cc.b((byte) -91, var3);
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
            stackOut_0_0 = new jja((cka) (this), param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("cka.C(");
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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (nh) ((Object) stackIn_1_0);
    }

    final boolean f() {
        return this.field_T != null && this.field_T.b((byte) -128);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        jaggl.OpenGL.glDrawArrays(param2, param0, param1);
        if (!param3) {
            this.field_n = -57L;
        }
    }

    final int g(int param0, int param1) {
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            this.da(-3, -46, 112, (int[]) null);
            break L0;
          }
        }
        if (-2 != (param1 ^ -1)) {
          if ((param1 ^ -1) != -1) {
            if (-3 != (param1 ^ -1)) {
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
        if (!(-17 == (this.field_y ^ -1))) {
            this.d((byte) -71);
            this.b(16363, true);
            this.c(3742, true);
            this.a(true, 0);
            this.a((byte) 105, 1);
            this.field_y = 16;
        }
        if (param0 > -77) {
            this.c(93, -69, 80);
        }
    }

    final void a(oba param0, int param1) {
        try {
            jaggl.OpenGL.glLoadMatrixf(param0.e(-45), param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cka.CC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void K(int[] param0) {
        try {
            param0[3] = this.field_kc;
            param0[1] = this.field_f;
            param0[0] = this.field_Ib;
            param0[2] = this.field_B;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cka.K(" + (param0 != null ? "{...}" : "null") + ')');
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
        if ((param2 + param0 ^ -1) > (this.field_Ib ^ -1)) {
          return;
        } else {
          L1: {
            if ((param0 - param2 ^ -1) < (this.field_B ^ -1)) {
              break L1;
            } else {
              if ((this.field_f ^ -1) < (param1 + param2 ^ -1)) {
                break L1;
              } else {
                if ((this.field_kc ^ -1) <= (-param2 + param1 ^ -1)) {
                  this.i((byte) -112);
                  this.a((byte) 94, param4);
                  jaggl.OpenGL.glColor4ub((byte)(param3 >> -331665008), (byte)(param3 >> 1634555720), (byte)param3, (byte)(param3 >> 394653592));
                  if (1 < param2) {
                    L2: {
                      L3: {
                        var6 = (float)param0 + 0.3499999940395355f;
                        var7 = (float)param1 + 0.3499999940395355f;
                        jaggl.OpenGL.glBegin(2);
                        var8 = 262144 / (6 * param2);
                        if (-65 > (var8 ^ -1)) {
                          break L3;
                        } else {
                          var8 = 64;
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (-513 > (var8 ^ -1)) {
                        var8 = 512;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var8 = b.a(var8, (byte) -118);
                    jaggl.OpenGL.glVertex2f((float)param2 + var6, var7);
                    var9 = -var8 + 16384;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (0 >= var9) {
                            break L6;
                          } else {
                            jaggl.OpenGL.glVertex2f(var6 + (float)param2 * hu.field_c[var9], (float)param2 * hu.field_b[var9] + var7);
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
        this.field_Ib = 0;
        this.field_kc = this.field_I;
        this.field_B = this.field_Y;
        this.field_f = 0;
        jaggl.OpenGL.glDisable(3089);
        this.r((byte) -120);
    }

    final void e(int param0, boolean param1) {
        if (!param1) {
            return;
        }
        if ((this.field_r ^ -1) != (param0 ^ -1)) {
            jaggl.OpenGL.glActiveTexture(param0 + 33984);
            this.field_r = param0;
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
            var8 = this.field_Bb;
            var2 = var8;
            var3 = (float)(-this.field_o * this.field_Gc) / (float)this.field_W;
            var4 = (float)((-this.field_o + this.field_Y) * this.field_Gc) / (float)this.field_W;
            var5 = (float)(this.field_db * this.field_Gc) / (float)this.field_kb;
            var6 = (float)(this.field_Gc * (-this.field_I + this.field_db)) / (float)this.field_kb;
            if (var3 == var4) {
              break L1;
            } else {
              if (var6 == var5) {
                break L1;
              } else {
                var7 = 2.0f * (float)this.field_Gc;
                var8[3] = 0.0f;
                var8[13] = 0.0f;
                var8[12] = 0.0f;
                this.field_Zb = -(var7 * (float)this.field_ob) / (float)(-this.field_Gc + this.field_ob);
                var8[14] = -(var7 * (float)this.field_ob) / (float)(-this.field_Gc + this.field_ob);
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
                this.field_zb = (float)(-(this.field_Gc + this.field_ob)) / (float)(-this.field_Gc + this.field_ob);
                var8[10] = (float)(-(this.field_Gc + this.field_ob)) / (float)(-this.field_Gc + this.field_ob);
                var8[4] = 0.0f;
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
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
        L2: {
          this.j(param0 ^ 122);
          if (param0 == 0) {
            break L2;
          } else {
            this.field_cd = 0.06654822826385498f;
            break L2;
          }
        }
    }

    final void d(int param0, boolean param1) {
        if (!((!this.field_v ? 1 : 0) != (param1 ? 1 : 0))) {
            this.field_v = param1 ? true : false;
            this.m((byte) -52);
        }
        if (param0 >= -48) {
            this.a(29, (va) null);
        }
    }

    private final void h(byte param0) {
        int var2 = -68 / ((-5 - param0) / 35);
        jaggl.OpenGL.glViewport(this.field_g, this.field_Pc, this.field_Y, this.field_I);
    }

    private final void d(byte param0) {
        if (param0 != -71) {
            this.field_v = true;
        }
        if ((this.field_e ^ -1) != -4) {
            this.field_e = 3;
            this.l(-4709);
            this.b(false);
            this.field_y = this.field_y & -8;
        }
    }

    private final void a(boolean param0, int param1) {
        if (param1 != 0) {
            this.field_Zb = 0.5239377021789551f;
        }
        if (!((!param0 ? 1 : 0) != (this.field_Nc ? 1 : 0))) {
            this.field_Nc = param0 ? true : false;
            this.c((byte) 13);
            this.field_y = this.field_y & -32;
        }
    }

    private final void c(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            if (!this.field_Nc) {
              break L1;
            } else {
              if (!this.field_Jc) {
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
          if (param0 == 13) {
            break L2;
          } else {
            this.d(-41, 18, -45, -90, 51, -122);
            break L2;
          }
        }
    }

    final void a(sca param0, int param1) {
        za discarded$2 = null;
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
              if (this.field_Rc == param0) {
                break L1;
              } else {
                L2: {
                  if (!this.field_Q) {
                    break L2;
                  } else {
                    jaggl.OpenGL.glBindBufferARB(34963, param0.a(9624));
                    break L2;
                  }
                }
                this.field_Rc = param0;
                break L1;
              }
            }
            L3: {
              if (param1 == 34963) {
                break L3;
              } else {
                discarded$2 = this.a(-127);
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
            stackOut_7_1 = new StringBuilder().append("cka.UA(");
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        boolean discarded$5 = this.field_l.b();
        if (param0 != 19770) {
            this.a(true, true);
        }
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
            stackOut_0_0 = new eg((cka) (this), param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("cka.I(");
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return (da) ((Object) stackIn_1_0);
    }

    final void b(oba param0, int param1) {
        try {
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glMultMatrixf(param0.e(96), 0);
            int var3_int = -49 / ((52 - param1) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cka.SC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized void a(byte param0, long param1) {
        if (param0 != -105) {
            this.field_Lc = (vna) null;
        }
        vg var4 = new vg();
        var4.field_d = param1;
        this.field_rb.b((byte) -58, var4);
    }

    private final void p(byte param0) {
        L0: {
          L1: {
            L2: {
              if (!this.field_qc) {
                break L2;
              } else {
                if (this.field_Kb >= 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            jaggl.OpenGL.glDisable(2912);
            if (!TombRacer.field_G) {
              break L0;
            } else {
              break L1;
            }
          }
          jaggl.OpenGL.glEnable(2912);
          break L0;
        }
        L3: {
          if (param0 == -87) {
            break L3;
          } else {
            this.DA(90, 39, -12, 39);
            break L3;
          }
        }
    }

    private final void v(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        this.c(-2, 32677);
        var2 = -1 + this.field_Ic;
        L0: while (true) {
          L1: {
            L2: {
              if (0 > var2) {
                break L2;
              } else {
                this.e(var2, true);
                this.a(true, (kl) null);
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
            this.b(8448, 8960, 8448);
            this.c(2, 0, 34168, 770);
            this.e((byte) 112);
            this.field_ld = 1;
            jaggl.OpenGL.glEnable(3042);
            jaggl.OpenGL.glBlendFunc(770, 771);
            this.field_Jb = 1;
            jaggl.OpenGL.glEnable(3008);
            jaggl.OpenGL.glAlphaFunc(516, 0.0f);
            this.field_lb = true;
            jaggl.OpenGL.glColorMask(true, true, true, true);
            this.field_q = true;
            this.b(16363, true);
            this.a(param0 ^ -3082, true);
            this.c(3742, true);
            this.a(true, 0);
            this.s(param0 + 6841);
            this.field_l.setSwapInterval(0);
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
          var3 = 0;
          L3: while (true) {
            L4: {
              L5: {
                if ((var3 ^ -1) <= -9) {
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
              break L4;
            }
            if (param0 == -3159) {
              jaggl.OpenGL.glFogi(2917, 9729);
              jaggl.OpenGL.glHint(3156, 4353);
              this.field_gc = -1;
              this.field_ac = -1;
              this.la();
              return;
            } else {
              return;
            }
          }
        }
    }

    final void xa(float param0) {
        if (this.field_tc != param0) {
            this.field_tc = param0;
            this.h(16);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.i((byte) -114);
        this.a((byte) 29, param9);
        jaggl.OpenGL.glBegin(4);
        jaggl.OpenGL.glColor4ub((byte)(param6 >> -427751760), (byte)(param6 >> -781737496), (byte)param6, (byte)(param6 >> -1303777224));
        jaggl.OpenGL.glVertex2f((float)param0 + 0.3499999940395355f, 0.3499999940395355f + (float)param1);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> -553032784), (byte)(param7 >> 1545725384), (byte)param7, (byte)(param7 >> 2008543416));
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param2, 0.3499999940395355f + (float)param3);
        jaggl.OpenGL.glColor4ub((byte)(param8 >> -51364688), (byte)(param8 >> 323599560), (byte)param8, (byte)(param8 >> 1178547032));
        jaggl.OpenGL.glVertex2f((float)param4 + 0.3499999940395355f, (float)param5 + 0.3499999940395355f);
        jaggl.OpenGL.glEnd();
    }

    final int i() {
        return this.field_Gc;
    }

    final void c(boolean param0) {
        if (-9 != (this.field_y ^ -1)) {
            this.a((byte) -10);
            this.b(16363, true);
            this.c(3742, true);
            this.a(true, 0);
            this.a((byte) 65, 1);
            this.field_y = 8;
        }
        if (param0) {
            this.field_O = true;
        }
    }

    final void a(int param0, boolean param1) {
        if (!((!param1 ? 1 : 0) == (!this.field_Ac ? 1 : 0))) {
            this.field_Ac = param1 ? true : false;
            this.m((byte) -52);
            this.field_y = this.field_y & -8;
        }
        if (param0 < 29) {
            this.field_nc = false;
        }
    }

    final static String a(char param0, int param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = new char[param1];
        var3 = var6;
        if (param2 <= -13) {
          var4 = 0;
          L0: while (true) {
            L1: {
              if (param1 <= var4) {
                break L1;
              } else {
                var6[var4] = param0;
                var4++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return new String(var6);
          }
        } else {
          return (String) null;
        }
    }

    final synchronized void i(int param0, int param1) {
        vg var3 = new vg();
        var3.field_d = (long)param0;
        this.field_Fc.b((byte) -114, var3);
        if (param1 != -1) {
            this.field_wb = true;
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
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
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
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (this.field_ld != param1) {
            L1: {
              L2: {
                if (1 != param1) {
                  break L2;
                } else {
                  var4 = 1;
                  var5 = 1;
                  var3 = 1;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((param1 ^ -1) != -3) {
                  break L3;
                } else {
                  var3 = 1;
                  var4 = 0;
                  var5 = 2;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (128 != param1) {
                  break L4;
                } else {
                  var5 = 3;
                  var3 = 1;
                  var4 = 1;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              var4 = 0;
              var5 = 0;
              var3 = 1;
              break L1;
            }
            L5: {
              stackOut_9_0 = var3;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (this.field_q) {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L5;
              } else {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L5;
              }
            }
            L6: {
              if (stackIn_12_0 == stackIn_12_1) {
                L7: {
                  jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var3 == 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L7;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L7;
                  }
                }
                ((cka) (this)).field_q = stackIn_17_1 != 0;
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (this.field_lb) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L8;
              } else {
                stackOut_19_0 = 1;
                stackIn_21_0 = stackOut_19_0;
                break L8;
              }
            }
            L9: {
              stackOut_21_0 = stackIn_21_0;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (var4 != 0) {
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L9;
              } else {
                stackOut_22_0 = stackIn_22_0;
                stackOut_22_1 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L9;
              }
            }
            L10: {
              if (stackIn_24_0 != stackIn_24_1) {
                L11: {
                  L12: {
                    if (var4 != 0) {
                      break L12;
                    } else {
                      jaggl.OpenGL.glDisable(3008);
                      if (var6 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  jaggl.OpenGL.glEnable(3008);
                  break L11;
                }
                L13: {
                  stackOut_30_0 = this;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (var4 == 0) {
                    stackOut_32_0 = this;
                    stackOut_32_1 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L13;
                  } else {
                    stackOut_31_0 = this;
                    stackOut_31_1 = 1;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L13;
                  }
                }
                ((cka) (this)).field_lb = stackIn_33_1 != 0;
                break L10;
              } else {
                break L10;
              }
            }
            L14: {
              if ((this.field_Jb ^ -1) == (var5 ^ -1)) {
                break L14;
              } else {
                L15: {
                  L16: {
                    if ((var5 ^ -1) != -2) {
                      break L16;
                    } else {
                      jaggl.OpenGL.glEnable(3042);
                      jaggl.OpenGL.glBlendFunc(770, 771);
                      if (var6 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if ((var5 ^ -1) == -3) {
                      break L17;
                    } else {
                      L18: {
                        if (-4 == (var5 ^ -1)) {
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
                        break L17;
                      }
                    }
                  }
                  jaggl.OpenGL.glEnable(3042);
                  jaggl.OpenGL.glBlendFunc(1, 1);
                  break L15;
                }
                this.field_Jb = var5;
                break L14;
              }
            }
            this.field_y = this.field_y & -29;
            this.field_ld = param1;
            break L0;
          } else {
            break L0;
          }
        }
        L19: {
          if (param0 > 18) {
            break L19;
          } else {
            this.o((byte) -128);
            break L19;
          }
        }
    }

    cka(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        long dupTemp$1 = 0L;
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
        int stackIn_38_0 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_37_0 = 0;
        Object stackOut_52_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        String var13_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = TombRacer.field_G ? 1 : 0;
                    var18 = null;
                    var19 = null;
                    var20 = null;
                    this.field_p = new Hashtable();
                    this.field_dc = 128;
                    this.field_Ec = new doa();
                    this.field_fc = new oba();
                    this.field_mc = new oba();
                    this.field_Ob = false;
                    this.field_qb = new vna();
                    this.field_A = -1;
                    this.field_ub = new ks[4];
                    this.field_Zc = -1;
                    this.field_M = new ks[4];
                    this.field_x = -1;
                    this.field_kd = new ks[4];
                    this.field_F = new vj();
                    this.field_Wc = new ji(16);
                    this.field_Lc = new vna();
                    this.field_pd = new vna();
                    this.field_K = new vna();
                    this.field_cc = new vna();
                    this.field_Vb = new vna();
                    this.field_Fc = new vna();
                    this.field_rb = new vna();
                    this.field_jd = new oba();
                    this.field_j = new oba();
                    this.field_Tc = new oba();
                    this.field_Gc = 50;
                    this.field_db = 0;
                    this.field_bc = 1.0f;
                    this.field_wc = 1.0f;
                    this.field_g = 0;
                    this.field_oc = 1.0f;
                    this.field_m = 3584.0f;
                    this.field_ec = 0.0f;
                    this.field_Xc = 0;
                    this.field_Bb = new float[16];
                    this.field_Kb = -1;
                    this.field_vb = -1;
                    this.field_yc = 1.0f;
                    this.field_Ab = new float[4];
                    this.field_xc = -1;
                    this.field_Jc = true;
                    this.field_B = 0;
                    this.field_Sb = -1.0f;
                    this.field_nb = 0;
                    this.field_Wb = new float[4];
                    this.field_Ib = 0;
                    this.field_uc = 8448;
                    this.field_cd = -1.0f;
                    this.field_ib = new float[4];
                    this.field_ac = -1;
                    this.field_Dc = new ob[tj.field_a];
                    this.field_Pc = 0;
                    this.field_kb = 512;
                    this.field_hb = false;
                    this.field_ob = 3584;
                    this.field_Fb = 1.0f;
                    this.field_f = 0;
                    this.field_Cb = -1.0f;
                    this.field_gd = 8448;
                    this.field_W = 512;
                    this.field_o = 0;
                    this.field_u = 3584.0f;
                    this.field_Qc = -1.0f;
                    this.field_kc = 0;
                    this.field_gc = -1;
                    this.field_Pb = new float[4];
                    this.field_cb = new qf(8192);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_gb = param2;
                        this.field_ad = param0;
                        if (in.a("jaclib", 480)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (in.a("jaggl", 480)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_l = new jaggl.OpenGL();
                        dupTemp$1 = this.field_l.init(param0, 8, 8, 8, 24, 0, this.field_gb);
                        this.field_dd = dupTemp$1;
                        this.field_n = dupTemp$1;
                        if (this.field_dd != 0L) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.f((byte) -68);
                        var4_int = this.k((byte) 108);
                        if ((var4_int ^ -1) == -1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (!this.field_O) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 33639;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = this;
                        stackOut_11_1 = 5121;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((cka) (this)).field_P = stackIn_12_1;
                        if (-1 == this.field_h.indexOf("radeon")) {
                            statePc = 50;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        var7 = 0;
                        var8_array = rga.a(32287, this.field_h.replace('/', ' '), ' ');
                        var9 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 >= var8_array.length) {
                            statePc = 37;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 65;
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
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = var13_ref.length();
                        stackIn_38_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var12 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 <= 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var12 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var13_ref.charAt(0) != 120) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-4 < (var13_ref.length() ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var21 = (CharSequence) ((Object) var13_ref.substring(1, 3));
                        if (!sqa.a(var21, -3)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var10_ref = var13_ref.substring(1);
                        var7 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = ((Object) stateCaught_23 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var10_ref.equals("hd")) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = ((Object) stateCaught_24 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var6 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var12 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!var10_ref.startsWith("hd")) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = ((Object) stateCaught_28 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6 = 1;
                        var10_ref = var10_ref.substring(2);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-5 < (var10_ref.length() ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var22 = (CharSequence) ((Object) var10_ref.substring(0, 4));
                        if (!sqa.a(var22, -3)) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var23 = (CharSequence) ((Object) var10_ref.substring(0, 4));
                        var5_int = jb.a(var23, (byte) 70);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof Exception ? 35 : 65);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var12 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var11 = (Exception) ((Object) caughtException);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = var6;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_int >= 4000) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_z = false;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var7 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var6 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_int ^ -1) > -7001) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-8000 > (var5_int ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_Q = false;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (7000 > var5_int) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var5_int ^ -1) < -9251) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_V = false;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_Cc = this.field_Cc & this.field_l.a("GL_ARB_half_float_pixel");
                        this.field_bd = this.field_Q;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((this.field_k.indexOf("intel") ^ -1) == 0) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.field_id = false;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = this;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_53_0 = stackOut_52_0;
                        if (this.field_k.equals("s3 graphics")) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = this;
                        stackOut_53_1 = 1;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_55_1 = stackOut_53_1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = this;
                        stackOut_54_1 = 0;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((cka) (this)).field_nc = stackIn_55_1 != 0;
                        if (this.field_Q) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var17 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var5 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ija.a(true, (byte) 99, false);
                        this.field_Ob = true;
                        this.field_hd = new hsa((cka) (this), this.field_c);
                        this.o((byte) 124);
                        this.field_zc = new mq((cka) (this));
                        this.field_L = new cw((cka) (this));
                        if (!this.field_L.b((byte) -43)) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        this.field_T = new uv((cka) (this));
                        if (this.field_T.e(34842)) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_T.d((byte) -60);
                        this.field_T = null;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        this.field_Hb = new uua((cka) (this));
                        this.v(-3159);
                        this.b((byte) -99);
                        this.a();
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var4 = caughtException;
                        var4.printStackTrace();
                        this.k();
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackOut_66_0 = (RuntimeException) (var4_ref);
                    stackOut_66_1 = new StringBuilder().append("cka.<init>(");
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    if (param0 == null) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackOut_67_2 = "{...}";
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_69_1 = stackOut_67_1;
                    stackIn_69_2 = stackOut_67_2;
                    statePc = 69;
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackOut_68_2 = "null";
                    stackIn_69_0 = stackOut_68_0;
                    stackIn_69_1 = stackOut_68_1;
                    stackIn_69_2 = stackOut_68_2;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_71_1 = stackOut_69_1;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    if (param1 == null) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackOut_70_2 = "{...}";
                    stackIn_72_0 = stackOut_70_0;
                    stackIn_72_1 = stackOut_70_1;
                    stackIn_72_2 = stackOut_70_2;
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackOut_71_2 = "null";
                    stackIn_72_0 = stackOut_71_0;
                    stackIn_72_1 = stackOut_71_1;
                    stackIn_72_2 = stackOut_71_2;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    throw tba.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param2 + ')');
                }
                case 73: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(ks param0, byte param1) {
        int fieldTemp$2 = 0;
        RuntimeException runtimeException = null;
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
              if (param1 == 81) {
                break L1;
              } else {
                this.j(-22);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.field_hc) {
                  break L3;
                } else {
                  this.c(param0, -4);
                  this.a(0, param0);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if ((this.field_x ^ -1) > -4) {
                L4: {
                  if ((this.field_x ^ -1) > -1) {
                    break L4;
                  } else {
                    this.field_ub[this.field_x].b((byte) -36);
                    break L4;
                  }
                }
                fieldTemp$2 = this.field_x + 1;
                this.field_x = this.field_x + 1;
                this.field_ub[fieldTemp$2] = param0;
                this.field_Qb = param0;
                this.field_t = param0;
                this.field_t.b(13109);
                break L2;
              } else {
                throw new RuntimeException();
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("cka.VC(");
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
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        L0: {
          L1: {
            L2: {
              this.i((byte) -114);
              this.a((byte) 52, param5);
              var7 = (float)param2 - (float)param0;
              var8 = (float)(-param1) + (float)param3;
              if (var7 != 0.0f) {
                break L2;
              } else {
                if (0.0f == var8) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var9 = (float)(1.0 / Math.sqrt((double)(var8 * var8 + var7 * var7)));
            var7 = var7 * var9;
            var8 = var8 * var9;
            if (!TombRacer.field_G) {
              break L0;
            } else {
              break L1;
            }
          }
          var7 = 1.0f;
          break L0;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 1674612080), (byte)(param4 >> 2051948840), (byte)param4, (byte)(param4 >> 474632600));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f((float)param0 + 0.3499999940395355f, (float)param1 + 0.3499999940395355f);
        jaggl.OpenGL.glVertex2f((float)param2 + var7 + 0.3499999940395355f, 0.3499999940395355f + ((float)param3 + var8));
        jaggl.OpenGL.glEnd();
    }

    private final int f(int param0) {
        if (param0 >= -13) {
            return -118;
        }
        return this.field_jb + (this.field_mb + this.field_Tb);
    }

    final void c(ks param0, int param1) {
        int fieldTemp$0 = 0;
        try {
            if (param1 >= (this.field_Zc ^ -1)) {
                throw new RuntimeException();
            }
            if ((this.field_Zc ^ -1) <= -1) {
                this.field_M[this.field_Zc].d((byte) 93);
            }
            fieldTemp$0 = this.field_Zc + 1;
            this.field_Zc = this.field_Zc + 1;
            this.field_M[fieldTemp$0] = param0;
            this.field_t = param0;
            this.field_t.a((byte) -120);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cka.GE(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ob a(int param0, int param1, int param2, int param3, int param4, float param5) {
        return (ob) ((Object) new wba(param0, param1, param2, param3, param4, param5));
    }

    final boolean i(int param0) {
        if (param0 != 7085) {
            return true;
        }
        return this.field_Hb.a(2147483647, 3);
    }

    private final void r(int param0) {
        if (param0 != 0) {
            this.a((ks) null, 54);
        }
        if (-2 != (this.field_e ^ -1)) {
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glLoadIdentity();
            if (0 < this.field_Y) {
                if (!(-1 <= (this.field_I ^ -1))) {
                    jaggl.OpenGL.glOrtho(0.0, (double)this.field_Y, (double)this.field_I, 0.0, -1.0, 1.0);
                }
            }
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            this.field_e = 1;
            this.field_y = this.field_y & -25;
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
          L1: {
            L2: {
              if (this.field_sb <= var2) {
                break L2;
              } else {
                var3 = this.field_Dc[var2];
                vh.field_h[0] = (float)var3.d(13437);
                var4 = 16386 + var2;
                vh.field_h[1] = (float)var3.a(19848);
                vh.field_h[2] = (float)var3.b((byte) 11);
                vh.field_h[3] = 1.0f;
                jaggl.OpenGL.glLightfv(var4, 4611, vh.field_h, 0);
                var5 = var3.c(param0 ^ 123);
                var6 = var3.b(0) / 255.0f;
                vh.field_h[1] = (float)(sea.c(65532, var5) >> 2072193736) * var6;
                vh.field_h[0] = var6 * (float)sea.c(var5 >> -1803001232, 255);
                vh.field_h[2] = (float)sea.c(255, var5) * var6;
                jaggl.OpenGL.glLightfv(var4, 4609, vh.field_h, 0);
                jaggl.OpenGL.glLightf(var4, 4617, 1.0f / (float)(var3.a((byte) -126) * var3.a((byte) -126)));
                jaggl.OpenGL.glEnable(var4);
                var2++;
                if (var7 != 0) {
                  break L1;
                } else {
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == -1) {
              break L1;
            } else {
              return;
            }
          }
          L3: while (true) {
            L4: {
              L5: {
                if ((this.field_pc ^ -1) >= (var2 ^ -1)) {
                  break L5;
                } else {
                  jaggl.OpenGL.glDisable(16386 + var2);
                  var2++;
                  if (var7 != 0) {
                    break L4;
                  } else {
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              this.field_pc = this.field_sb;
              break L4;
            }
            return;
          }
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        if (param0 != -31014) {
            field_H = -33;
        }
        al var4 = new al(param2);
        var4.field_d = (long)param1;
        this.field_pd.b((byte) -96, var4);
    }

    final void c(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, param0 + 34176, param2);
        if (param1 != 0) {
            this.q((byte) 53);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34192 - -param0, param3);
    }

    private final void a(int param0, boolean param1, boolean param2, int param3) {
        nh discarded$1 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        dw var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          L1: {
            var13 = TombRacer.field_G ? 1 : 0;
            if ((param0 ^ -1) != (this.field_Yb ^ -1)) {
              break L1;
            } else {
              if (this.field_pb != this.field_hb) {
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
            if (this.field_pb) {
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
            L4: {
              var9 = stackIn_6_0;
              if (0 <= param0) {
                break L4;
              } else {
                this.e((byte) 112);
                if (var13 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                L7: {
                  var5 = this.field_hd.a(param0, 0);
                  var10 = this.field_c.a((byte) 14, param0);
                  if ((var10.field_s ^ -1) != -1) {
                    break L7;
                  } else {
                    if (var10.field_o == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var10.field_g) {
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
                var12 = var11 * 50;
                this.a((float)(var10.field_o * (this.field_Oc % var12)) / (float)var12, 25380, 0.0f, (float)(var10.field_s * (this.field_Oc % var12)) / (float)var12);
                if (var13 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
              this.e((byte) 112);
              break L5;
            }
            L9: {
              if (!this.field_pb) {
                var8 = var10.field_t;
                var9 = var10.field_h;
                var7 = var10.field_a;
                break L9;
              } else {
                break L9;
              }
            }
            var6 = var10.field_q;
            break L3;
          }
          L10: {
            this.field_Hb.a(param3 ^ -71, var8, param1, param2, var7, var9);
            if (!this.field_Hb.a(var6, 9, (kl) (var5))) {
              this.a(true, (kl) (var5));
              this.d(param3 ^ -2, var6);
              break L10;
            } else {
              break L10;
            }
          }
          this.field_hb = this.field_pb;
          this.field_Yb = param0;
          break L0;
        }
        L11: {
          if (param3 == -1) {
            break L11;
          } else {
            discarded$1 = this.a((jpa) null, false);
            break L11;
          }
        }
        this.field_y = this.field_y & -8;
    }

    private final int k(byte param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        NumberFormatException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var10 = null;
        int[] var13 = null;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          this.field_k = jaggl.OpenGL.glGetString(7936).toLowerCase();
          var2 = 0;
          this.field_h = jaggl.OpenGL.glGetString(7937).toLowerCase();
          if ((this.field_k.indexOf("microsoft") ^ -1) != 0) {
            var2 = var2 | 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_k.indexOf("brian paul") != -1) {
              break L2;
            } else {
              if ((this.field_k.indexOf("mesa") ^ -1) == 0) {
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
            var4 = rga.a(32287, var3.replace('.', ' '), ' ');
            if (var4.length < 2) {
              break L4;
            } else {
              try {
                L5: {
                  var5_int = jb.a((CharSequence) ((Object) var4[0]), (byte) 70);
                  var6 = jb.a((CharSequence) ((Object) var4[1]), (byte) 70);
                  this.field_fb = var6 + 10 * var5_int;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L6: {
                  var5 = (NumberFormatException) (Object) decompiledCaughtException;
                  var2 = var2 | 4;
                  if (!TombRacer.field_G) {
                    decompiledRegionSelector0 = 0;
                    break L6;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L6;
                  }
                }
              }
              if (decompiledRegionSelector0 == 0) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          var2 = var2 | 4;
          break L3;
        }
        L7: {
          if ((this.field_fb ^ -1) <= -13) {
            break L7;
          } else {
            var2 = var2 | 2;
            break L7;
          }
        }
        L8: {
          if (this.field_l.a("GL_ARB_multitexture")) {
            break L8;
          } else {
            var2 = var2 | 8;
            break L8;
          }
        }
        L9: {
          if (!this.field_l.a("GL_ARB_texture_env_combine")) {
            var2 = var2 | 32;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          L11: {
            var10 = new int[1];
            var8 = var10;
            var7 = var8;
            var13 = var7;
            jaggl.OpenGL.glGetIntegerv(34018, var10, 0);
            this.field_Ic = var10[0];
            jaggl.OpenGL.glGetIntegerv(34929, var10, 0);
            this.field_J = var10[0];
            jaggl.OpenGL.glGetIntegerv(34930, var13, 0);
            var6 = -109 % ((-49 - param0) / 48);
            this.field_Hc = var10[0];
            if (2 > this.field_Ic) {
              break L11;
            } else {
              if (-3 < (this.field_J ^ -1)) {
                break L11;
              } else {
                if ((this.field_Hc ^ -1) <= -3) {
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
          this.field_O = jaclib.memory.Stream.b();
          this.field_Yc = this.field_l.arePbuffersAvailable();
          this.field_Q = this.field_l.a("GL_ARB_vertex_buffer_object");
          this.field_S = this.field_l.a("GL_ARB_multisample");
          this.field_G = this.field_l.a("GL_ARB_vertex_program");
          discarded$1 = this.field_l.a("GL_ARB_fragment_program");
          this.field_wb = this.field_l.a("GL_ARB_vertex_shader");
          this.field_Vc = this.field_l.a("GL_ARB_fragment_shader");
          this.field_V = this.field_l.a("GL_EXT_texture3D");
          this.field_Cc = this.field_l.a("GL_ARB_texture_rectangle");
          this.field_Kc = this.field_l.a("GL_ARB_texture_cube_map");
          this.field_z = this.field_l.a("GL_ARB_texture_float");
          this.field_Gb = false;
          this.field_id = this.field_l.a("GL_EXT_framebuffer_object");
          this.field_hc = this.field_l.a("GL_EXT_framebuffer_blit");
          this.field_ed = this.field_l.a("GL_EXT_framebuffer_multisample");
          this.field_Eb = oj.field_vb.startsWith("mac");
          jaggl.OpenGL.glGetFloatv(2834, gp.field_d, 0);
          this.field_Cb = gp.field_d[1];
          this.field_Qc = gp.field_d[0];
          if (0 == var2) {
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L12;
          } else {
            stackOut_25_0 = var2;
            stackIn_27_0 = stackOut_25_0;
            break L12;
          }
        }
        return stackIn_27_0;
    }

    private final void g(byte param0) {
        gp.field_d[3] = 1.0f;
        gp.field_d[1] = this.field_cd * this.field_Fb;
        gp.field_d[0] = this.field_cd * this.field_wc;
        gp.field_d[2] = this.field_cd * this.field_bc;
        jaggl.OpenGL.glLightfv(16384, 4609, gp.field_d, 0);
        if (param0 != -30) {
            this.field_S = true;
        }
        gp.field_d[2] = -this.field_Sb * this.field_bc;
        gp.field_d[1] = -this.field_Sb * this.field_Fb;
        gp.field_d[0] = this.field_wc * -this.field_Sb;
        gp.field_d[3] = 1.0f;
        jaggl.OpenGL.glLightfv(16385, 4609, gp.field_d, 0);
    }

    final void n(byte param0) {
        if (param0 > -58) {
            this.HA(1, -122, 13, 3, (int[]) null);
        }
        jaggl.OpenGL.glPopMatrix();
    }

    private final void p(int param0) {
        jaggl.OpenGL.glLightfv(16384, 4611, this.field_Wb, param0);
        jaggl.OpenGL.glLightfv(16385, 4611, this.field_Ab, 0);
    }

    private final void h(int param0) {
        gp.field_d[3] = 1.0f;
        gp.field_d[2] = this.field_bc * this.field_tc;
        if (param0 != 16) {
            return;
        }
        gp.field_d[0] = this.field_tc * this.field_wc;
        gp.field_d[1] = this.field_tc * this.field_Fb;
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
        int decompiledRegionSelector0 = 0;
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
              var6_float = this.field_jd.field_q * (float)param2 + (this.field_jd.field_j * (float)param0 + this.field_jd.field_h * (float)param1) + this.field_jd.field_o;
              if (var6_float < (float)this.field_Gc) {
                break L1;
              } else {
                if ((float)this.field_ob >= var6_float) {
                  L2: {
                    L3: {
                      L4: {
                        var7 = (int)((float)this.field_W * (this.field_jd.field_m + (this.field_jd.field_s * (float)param2 + ((float)param1 * this.field_jd.field_k + (float)param0 * this.field_jd.field_l))) / (float)param3);
                        var8 = (int)((float)this.field_kb * ((float)param2 * this.field_jd.field_g + (this.field_jd.field_i * (float)param0 + (float)param1 * this.field_jd.field_r) + this.field_jd.field_p) / (float)param3);
                        if (this.field_s > (float)var7) {
                          break L4;
                        } else {
                          if (this.field_od < (float)var7) {
                            break L4;
                          } else {
                            if (this.field_nd > (float)var8) {
                              break L4;
                            } else {
                              if ((float)var8 <= this.field_Db) {
                                break L3;
                              } else {
                                break L4;
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
                      if (!TombRacer.field_G) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                    param4[1] = (int)(-this.field_nd + (float)var8);
                    param4[0] = (int)((float)var7 - this.field_s);
                    param4[2] = (int)var6_float;
                    break L2;
                  }
                  decompiledRegionSelector0 = 1;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("cka.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (!((param0 ^ -1) <= -1)) {
            param0 = 0;
        }
        if (-1 < (param1 ^ -1)) {
            param1 = 0;
        }
        if (!(this.field_I >= param3)) {
            param3 = this.field_I;
        }
        if (!((param2 ^ -1) >= (this.field_Y ^ -1))) {
            param2 = this.field_Y;
        }
        this.field_kc = param3;
        this.field_Ib = param0;
        this.field_f = param1;
        this.field_B = param2;
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
            L1: {
              if (-2 != (param1 ^ -1)) {
                break L1;
              } else {
                this.b(7681, 8960, 7681);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param1 != 2) {
                      break L4;
                    } else {
                      this.b(34165, 8960, 7681);
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param1 != 3) {
                      break L5;
                    } else {
                      this.b(260, 8960, 8448);
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if ((param1 ^ -1) != -5) {
                    break L3;
                  } else {
                    this.b(34023, param0 + 8959, 34023);
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                break L0;
              }
            }
            this.b(8448, 8960, 8448);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void k() {
        vg var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var1 = this.field_qb.f(-80);
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                if (var1 == null) {
                  break L3;
                } else {
                  ((cp) ((Object) var1)).b((byte) 87);
                  var1 = this.field_qb.e(125);
                  if (var4 != 0) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (null != this.field_L) {
                break L2;
              } else {
                break L1;
              }
            }
            this.field_L.a(-110);
            break L1;
          }
          L4: {
            if (this.field_l == null) {
              break L4;
            } else {
              this.k(19770);
              var1_ref = this.field_p.keys();
              L5: while (true) {
                L6: {
                  L7: {
                    if (!var1_ref.hasMoreElements()) {
                      break L7;
                    } else {
                      var2 = (java.awt.Canvas) (var1_ref.nextElement());
                      var3 = (Long) (this.field_p.get(var2));
                      this.field_l.releaseSurface(var2, var3.longValue());
                      if (var4 != 0) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  this.field_l.release();
                  break L6;
                }
                this.field_l = null;
                break L4;
              }
            }
          }
          L8: {
            if (this.field_Ob) {
              rpa.a(true, false, true);
              this.field_Ob = false;
              break L8;
            } else {
              break L8;
            }
          }
          return;
        }
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        int var7 = 0;
        float var8 = 0.0f;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if ((param0 ^ -1) == (this.field_ac ^ -1)) {
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
              if (this.field_cd != param1) {
                break L2;
              } else {
                if (param2 == this.field_Sb) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            this.field_ac = param0;
            this.field_Sb = param2;
            this.field_cd = param1;
            if (var7 == 0) {
              break L3;
            } else {
              this.field_bc = (float)(this.field_ac & 255) / 255.0f;
              this.field_wc = (float)(this.field_ac & 16711680) / 16711680.0f;
              this.field_Fb = (float)(this.field_ac & 65280) / 65280.0f;
              this.h(16);
              break L3;
            }
          }
          this.g((byte) -30);
          break L1;
        }
        L4: {
          L5: {
            if (param3 != this.field_Pb[0]) {
              break L5;
            } else {
              if (this.field_Pb[1] != param4) {
                break L5;
              } else {
                if (param5 != this.field_Pb[2]) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
          }
          this.field_Pb[1] = param4;
          this.field_Pb[0] = param3;
          this.field_Pb[2] = param5;
          this.field_ib[1] = -param4;
          this.field_ib[2] = -param5;
          this.field_ib[0] = -param3;
          var8 = (float)(1.0 / Math.sqrt((double)(param5 * param5 + (param4 * param4 + param3 * param3))));
          this.field_Wb[1] = param4 * var8;
          this.field_Wb[2] = param5 * var8;
          this.field_Wb[0] = var8 * param3;
          this.field_Ab[2] = -this.field_Wb[2];
          this.field_Ab[1] = -this.field_Wb[1];
          this.field_Ab[0] = -this.field_Wb[0];
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
        int decompiledRegionSelector0 = 0;
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
              var5_float = this.field_jd.field_o + ((float)param2 * this.field_jd.field_q + (this.field_jd.field_h * (float)param1 + this.field_jd.field_j * (float)param0));
              if ((float)this.field_Gc > var5_float) {
                break L1;
              } else {
                if (var5_float <= (float)this.field_ob) {
                  L2: {
                    L3: {
                      L4: {
                        var6 = (int)((float)this.field_W * (this.field_jd.field_l * (float)param0 + (float)param1 * this.field_jd.field_k + this.field_jd.field_s * (float)param2 + this.field_jd.field_m) / var5_float);
                        var7 = (int)((float)this.field_kb * (this.field_jd.field_g * (float)param2 + ((float)param0 * this.field_jd.field_i + (float)param1 * this.field_jd.field_r) + this.field_jd.field_p) / var5_float);
                        if (this.field_s > (float)var6) {
                          break L4;
                        } else {
                          if (this.field_od < (float)var6) {
                            break L4;
                          } else {
                            if ((float)var7 < this.field_nd) {
                              break L4;
                            } else {
                              if (this.field_Db >= (float)var7) {
                                break L3;
                              } else {
                                break L4;
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
                      if (!TombRacer.field_G) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                    param3[1] = (int)((float)var7 - this.field_nd);
                    param3[2] = (int)var5_float;
                    param3[0] = (int)((float)var6 - this.field_s);
                    break L2;
                  }
                  decompiledRegionSelector0 = 1;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("cka.da(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, boolean param1) {
        if (param0 != 16363) {
            this.c(31, -99);
        }
        if (!((!param1 ? 1 : 0) == (!this.field_qc ? 1 : 0))) {
            this.field_qc = param1 ? true : false;
            this.p((byte) -87);
            this.field_y = this.field_y & -32;
        }
    }

    final void a(ks param0, byte param1) {
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
              if (0 > this.field_Zc) {
                break L1;
              } else {
                if (this.field_M[this.field_Zc] == param0) {
                  L2: {
                    L3: {
                      fieldTemp$2 = this.field_Zc;
                      this.field_Zc = this.field_Zc - 1;
                      this.field_M[fieldTemp$2] = null;
                      param0.d((byte) 60);
                      if ((this.field_Zc ^ -1) <= -1) {
                        break L3;
                      } else {
                        this.field_t = null;
                        if (!TombRacer.field_G) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_t = this.field_M[this.field_Zc];
                    this.field_t.a((byte) -124);
                    break L2;
                  }
                  L4: {
                    if (param1 == -38) {
                      break L4;
                    } else {
                      this.field_l = (jaggl.OpenGL) null;
                      break L4;
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
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("cka.KC(");
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
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = this.field_L.a(param2, param0, param3, param1, 0);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          L1: {
            if (-1 != (this.field_r ^ -1)) {
              break L1;
            } else {
              L2: {
                var4 = 0;
                if (param0 == this.field_gd) {
                  break L2;
                } else {
                  jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
                  this.field_gd = param0;
                  var4 = 1;
                  break L2;
                }
              }
              L3: {
                if (this.field_uc != param2) {
                  jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
                  var4 = 1;
                  this.field_uc = param2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var4 == 0) {
                  break L4;
                } else {
                  this.field_y = this.field_y & -30;
                  break L4;
                }
              }
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
          jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
          break L0;
        }
        L5: {
          if (param1 == 8960) {
            break L5;
          } else {
            this.field_Tc = (oba) null;
            break L5;
          }
        }
    }

    final void a(float param0, float param1, float param2) {
        ql.field_l = param0;
        fra.field_p = param1;
        vba.field_v = param2;
    }

    private final void f(byte param0) {
        int incrementValue$2 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 == -68) {
          L0: while (true) {
            L1: {
              if (this.field_l.a()) {
                break L1;
              } else {
                if (var3 != 0) {
                  break L1;
                } else {
                  incrementValue$2 = var2;
                  var2++;
                  if (5 < incrementValue$2) {
                    throw new RuntimeException("");
                  } else {
                    vja.a(0, 1000L);
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(tj param0, tj param1, tj param2, int param3, tj param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4 == null) {
                  break L2;
                } else {
                  this.a(91, param4.field_d);
                  jaggl.OpenGL.glVertexPointer((int) param4.field_f, (int) param4.field_e, this.field_tb.a(26653), this.field_tb.b(121) + (long)param4.field_g);
                  jaggl.OpenGL.glEnableClientState(32884);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jaggl.OpenGL.glDisableClientState(32884);
              break L1;
            }
            L3: {
              L4: {
                if (param2 != null) {
                  break L4;
                } else {
                  jaggl.OpenGL.glDisableClientState(32885);
                  if (var7 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.a(126, param2.field_d);
              jaggl.OpenGL.glNormalPointer((int) param2.field_e, this.field_tb.a(26653), this.field_tb.b(-82) - -(long)param2.field_g);
              jaggl.OpenGL.glEnableClientState(32885);
              break L3;
            }
            if (param3 <= -102) {
              L5: {
                L6: {
                  if (param0 == null) {
                    break L6;
                  } else {
                    this.a(105, param0.field_d);
                    jaggl.OpenGL.glColorPointer((int) param0.field_f, (int) param0.field_e, this.field_tb.a(26653), this.field_tb.b(-115) + (long)param0.field_g);
                    jaggl.OpenGL.glEnableClientState(32886);
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                jaggl.OpenGL.glDisableClientState(32886);
                break L5;
              }
              L7: {
                L8: {
                  if (param1 == null) {
                    break L8;
                  } else {
                    this.a(87, param1.field_d);
                    jaggl.OpenGL.glTexCoordPointer((int) param1.field_f, (int) param1.field_e, this.field_tb.a(26653), this.field_tb.b(89) - -(long)param1.field_g);
                    jaggl.OpenGL.glEnableClientState(32888);
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                jaggl.OpenGL.glDisableClientState(32888);
                break L7;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("cka.HC(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          L10: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          L11: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          L12: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.a((byte) 88, (float)param6);
        this.d((byte) -71);
        this.b(16363, false);
        this.a(116, false);
        this.c(3742, false);
        this.a(false, 0);
        this.a(true, (kl) null);
        this.c(-2, 32677);
        this.d(1, 1);
        this.a((byte) 91, param8);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 597764880), (byte)(param7 >> -599658808), (byte)param7, (byte)(param7 >> -1164258088));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex3f((float)param0, (float)param1, (float)param2);
        jaggl.OpenGL.glVertex3f((float)param3, (float)param4, (float)param5);
        jaggl.OpenGL.glEnd();
    }

    public static void t(int param0) {
        field_fd = null;
        field_Mc = null;
        if (param0 != 7312) {
            field_H = -15;
        }
    }

    final void q(int param0) {
        if (!(param0 == this.field_y)) {
            this.r(0);
            this.b(param0 ^ 16361, false);
            this.a(109, false);
            this.c(3742, false);
            this.a(false, 0);
            this.c(-2, 32677);
            this.field_y = 2;
        }
    }

    final za a(int param0) {
        cp var2 = new cp(param0);
        this.field_qb.b((byte) -97, var2);
        return (za) ((Object) var2);
    }

    final void c(int param0, int param1) {
        if (param1 != 32677) {
            this.field_ic = (cb) null;
        }
        this.a((byte) 70, true, param0);
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
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_Mb = (jja) ((Object) param0);
                if (this.field_id) {
                  break L2;
                } else {
                  if (this.field_Yc) {
                    L3: {
                      L4: {
                        var3_ref = (cla) ((Object) this.field_Wc.a((byte) -109, (long)(this.field_Mb.a() << 1113319248 | this.field_Mb.c())));
                        if (var3_ref != null) {
                          break L4;
                        } else {
                          var7 = new cla((cka) (this), this.field_Mb.a(), this.field_Mb.c());
                          var3_ref = var7;
                          this.field_rc = this.field_rc + 4 * var7.field_p;
                          L5: while (true) {
                            L6: {
                              if (2097152 >= this.field_rc) {
                                break L6;
                              } else {
                                var4 = this.field_F.b(-119);
                                if (var6 != 0) {
                                  break L3;
                                } else {
                                  L7: {
                                    if (var4 != null) {
                                      break L7;
                                    } else {
                                      if (var6 == 0) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var8 = (cla) ((Object) var4);
                                  var8.c(-7975);
                                  var8.p(21);
                                  this.field_l.releasePbuffer(var8.a((byte) 101));
                                  this.field_rc = this.field_rc - var8.field_p;
                                  if (var6 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            this.field_Wc.a((long)(this.field_Mb.a() << 1671997200 | this.field_Mb.c()), 112, var7);
                            break L4;
                          }
                        }
                      }
                      this.field_F.a(75, var3_ref);
                      this.field_l.setPbuffer(var3_ref.a((byte) 101));
                      break L3;
                    }
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    throw new RuntimeException("");
                  }
                }
              }
              L8: {
                if (null == this.field_bb) {
                  this.field_bb = new cb((cka) (this));
                  break L8;
                } else {
                  break L8;
                }
              }
              if (this.field_bb == this.field_Qb) {
                throw new RuntimeException();
              } else {
                L9: {
                  this.b((ks) (this.field_bb), (byte) 81);
                  if (!param1) {
                    break L9;
                  } else {
                    L10: {
                      L11: {
                        var3_ref2 = (kba) ((Object) this.field_Wc.a((byte) -106, (long)(this.field_Mb.a() << 538462544 | this.field_Mb.c())));
                        if (var3_ref2 == null) {
                          var9 = new kba((cka) (this), 6402, this.field_Mb.a(), this.field_Mb.c());
                          var3_ref2 = var9;
                          this.field_rc = this.field_rc + var9.field_o;
                          L12: while (true) {
                            L13: {
                              if (-2097153 <= (this.field_rc ^ -1)) {
                                break L13;
                              } else {
                                var4 = this.field_F.b(-125);
                                if (var6 != 0) {
                                  break L10;
                                } else {
                                  L14: {
                                    if (var4 != null) {
                                      break L14;
                                    } else {
                                      if (var6 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var10 = (kba) ((Object) var4);
                                  var10.c(-7975);
                                  var10.p(125);
                                  var10.g(77);
                                  this.field_rc = this.field_rc - var10.field_o;
                                  if (var6 == 0) {
                                    continue L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            this.field_Wc.a((long)(this.field_Mb.a() << 534113712 | this.field_Mb.c()), 124, var9);
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                      this.field_F.a(97, var3_ref2);
                      break L10;
                    }
                    this.field_bb.a(8, var3_ref2, true);
                    break L9;
                  }
                }
                this.field_bb.a(true, this.field_Mb.field_a, 0);
                break L1;
              }
            }
            this.field_Y = param0.a();
            this.field_I = param0.c();
            this.s(3682);
            this.h((byte) 115);
            this.la();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("cka.AE(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L15;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L15;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ')');
        }
    }

    final int XA() {
        return this.field_ob;
    }

    private final void b(boolean param0) {
        jaggl.OpenGL.glLoadIdentity();
        if (param0) {
            this.r((byte) 74);
        }
        jaggl.OpenGL.glMultMatrixf(this.field_j.e(-112), 0);
        if (this.field_hb) {
            this.field_Hb.field_h.a((byte) -120);
        }
        this.p(0);
        this.d(-1);
    }

    final synchronized void c(int param0, int param1, int param2) {
        if (param0 != 2) {
            this.a(92, true);
        }
        al var4 = new al(param1);
        var4.field_d = (long)param2;
        this.field_Vb.b((byte) -84, var4);
    }

    final void a(int param0, ks param1) {
        int fieldTemp$0 = 0;
        try {
            if (3 <= this.field_A) {
                throw new RuntimeException();
            }
            if (param0 <= this.field_A) {
                this.field_kd[this.field_A].a(4245);
            }
            fieldTemp$0 = this.field_A + 1;
            this.field_A = this.field_A + 1;
            this.field_kd[fieldTemp$0] = param1;
            this.field_Qb = param1;
            this.field_Qb.c((byte) 86);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cka.MC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void m(int param0) {
        this.field_xb = -this.field_ec + (float)(this.field_ob + -this.field_Xc);
        this.field_Uc = -(this.field_oc * (float)this.field_Kb) + this.field_xb;
        if (this.field_Uc < (float)this.field_Gc) {
            this.field_Uc = (float)this.field_Gc;
        }
        jaggl.OpenGL.glFogf(2915, this.field_Uc);
        jaggl.OpenGL.glFogf(param0, this.field_xb);
        gp.field_d[0] = (float)sea.c(this.field_gc, 16711680) / 16711680.0f;
        gp.field_d[1] = (float)sea.c(65280, this.field_gc) / 65280.0f;
        gp.field_d[2] = (float)sea.c(255, this.field_gc) / 255.0f;
        jaggl.OpenGL.glFogfv(2918, gp.field_d, 0);
    }

    final void DA(int param0, int param1, int param2, int param3) {
        L0: {
          L1: {
            this.field_o = param0;
            this.field_W = param2;
            this.field_db = param1;
            this.field_kb = param3;
            this.g(0);
            this.r((byte) -126);
            if (this.field_e != 3) {
              break L1;
            } else {
              this.l(-4709);
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (2 == this.field_e) {
            this.l((byte) -37);
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void ya() {
        this.a(true, 0);
        jaggl.OpenGL.glClear(256);
    }

    final void c() {
        this.field_L.a((byte) -112);
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
          if ((param2 ^ -1) > -1) {
            param2 = -param2;
            break L0;
          } else {
            break L0;
          }
        }
        if (this.field_Ib > param2 + param0) {
          return;
        } else {
          L1: {
            if (this.field_B < -param2 + param0) {
              break L1;
            } else {
              if (this.field_f > param2 + param1) {
                break L1;
              } else {
                if ((param1 - param2 ^ -1) >= (this.field_kc ^ -1)) {
                  this.i((byte) -110);
                  this.a((byte) 120, param4);
                  jaggl.OpenGL.glColor4ub((byte)(param3 >> -1754086704), (byte)(param3 >> -371442520), (byte)param3, (byte)(param3 >> 1070784312));
                  var6 = 0.3499999940395355f + (float)param0;
                  var7 = (float)param1 + 0.3499999940395355f;
                  var8 = param2 << 1461435009;
                  if ((float)var8 < this.field_Qc) {
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glVertex2f(var6 + 1.0f, 1.0f + var7);
                    jaggl.OpenGL.glVertex2f(1.0f + var6, var7 - 1.0f);
                    jaggl.OpenGL.glVertex2f(var6 - 1.0f, -1.0f + var7);
                    jaggl.OpenGL.glVertex2f(-1.0f + var6, 1.0f + var7);
                    jaggl.OpenGL.glEnd();
                    return;
                  } else {
                    L2: {
                      L3: {
                        if ((float)var8 <= this.field_Cb) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              jaggl.OpenGL.glBegin(6);
                              jaggl.OpenGL.glVertex2f(var6, var7);
                              var9 = 262144 / (6 * param2);
                              if (var9 > 64) {
                                break L5;
                              } else {
                                var9 = 64;
                                if (var11 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (-513 <= (var9 ^ -1)) {
                              break L4;
                            } else {
                              var9 = 512;
                              break L4;
                            }
                          }
                          var9 = b.a(var9, (byte) -101);
                          jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
                          var10 = -var9 + 16384;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (var10 <= 0) {
                                  break L8;
                                } else {
                                  jaggl.OpenGL.glVertex2f(var6 + (float)param2 * hu.field_c[var10], (float)param2 * hu.field_b[var10] + var7);
                                  var10 = var10 - var9;
                                  if (var11 != 0) {
                                    break L7;
                                  } else {
                                    if (var11 == 0) {
                                      continue L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
                              jaggl.OpenGL.glEnd();
                              break L7;
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      jaggl.OpenGL.glEnable(2832);
                      jaggl.OpenGL.glPointSize((float)var8);
                      jaggl.OpenGL.glBegin(0);
                      jaggl.OpenGL.glVertex2f(var6, var7);
                      jaggl.OpenGL.glEnd();
                      jaggl.OpenGL.glDisable(2832);
                      break L2;
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
        if (param0 != 3682) {
            this.c(-29);
        }
        if (0 != this.field_e) {
            this.field_e = 0;
            this.field_y = this.field_y & -32;
        }
    }

    final void b(ks param0, int param1) {
        int fieldTemp$3 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (param1 == 0) {
              L1: {
                L2: {
                  if (this.field_hc) {
                    break L2;
                  } else {
                    L3: {
                      if (0 > this.field_x) {
                        break L3;
                      } else {
                        if (param0 == this.field_ub[this.field_x]) {
                          L4: {
                            L5: {
                              fieldTemp$3 = this.field_x;
                              this.field_x = this.field_x - 1;
                              this.field_ub[fieldTemp$3] = null;
                              param0.b((byte) -36);
                              if (-1 >= (this.field_x ^ -1)) {
                                break L5;
                              } else {
                                this.field_Qb = null;
                                this.field_t = null;
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            this.field_Qb = this.field_ub[this.field_x];
                            this.field_t = this.field_ub[this.field_x];
                            this.field_t.b(param1 + 13109);
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L2;
                            }
                          }
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                }
                this.a(param0, (byte) -38);
                this.a(param0, param1 + -1090);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("cka.TC(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.a((byte) -10);
        this.b(16363, false);
        this.a(52, false);
        this.c(3742, false);
        this.a(false, 0);
        this.a(true, (kl) null);
        this.c(-2, 32677);
        this.d(1, 1);
        this.a((byte) 44, param7);
        jaggl.OpenGL.glColor4ub((byte)(param6 >> -665931888), (byte)(param6 >> -1357513624), (byte)param6, (byte)(param6 >> -980684808));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex3f((float)param0, (float)param1, (float)param2);
        jaggl.OpenGL.glVertex3f((float)param3, (float)param4, (float)param5);
        jaggl.OpenGL.glEnd();
    }

    final void u(int param0) {
        jaggl.OpenGL.glPushMatrix();
        if (param0 != 28630) {
            this.field_lc = (rt) null;
        }
    }

    final void L(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (this.field_gc != param0) {
              break L1;
            } else {
              if ((param1 ^ -1) != (this.field_Kb ^ -1)) {
                break L1;
              } else {
                if (param2 == this.field_Xc) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_gc = param0;
          this.field_Xc = param2;
          this.field_Kb = param1;
          this.m(2916);
          this.p((byte) -87);
          break L0;
        }
    }

    private final void a(byte param0) {
        int discarded$0 = 0;
        if (!((this.field_e ^ -1) == -3)) {
            this.field_e = 2;
            this.l((byte) -37);
            this.b(false);
            this.field_y = this.field_y & -8;
        }
        if (param0 != -10) {
            discarded$0 = this.i();
        }
    }

    final int a(int param0, byte param1) {
        L0: {
          if (param1 <= -53) {
            break L0;
          } else {
            this.field_uc = -62;
            break L0;
          }
        }
        L1: {
          if ((param0 ^ -1) == -6407) {
            break L1;
          } else {
            if (-6410 == (param0 ^ -1)) {
              break L1;
            } else {
              L2: {
                if (-6411 == (param0 ^ -1)) {
                  break L2;
                } else {
                  if ((param0 ^ -1) == -34847) {
                    break L2;
                  } else {
                    if (34844 != param0) {
                      if (-6408 == (param0 ^ -1)) {
                        return 3;
                      } else {
                        L3: {
                          if (param0 == 6408) {
                            break L3;
                          } else {
                            if ((param0 ^ -1) != -34848) {
                              if (param0 != 34843) {
                                if (-34843 != (param0 ^ -1)) {
                                  if ((param0 ^ -1) == -6403) {
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
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3_int ^ -1) <= (param0 ^ -1)) {
                    break L3;
                  } else {
                    this.field_Dc[var3_int] = param1[var3_int];
                    var3_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_sb = param0;
                break L2;
              }
              L4: {
                if (this.field_e != 1) {
                  this.d(-1);
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("cka.JB(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_Jc = param0 ? true : false;
        this.c((byte) 13);
        if (param1) {
            this.field_t = (ks) null;
        }
    }

    private final void b(byte param0) {
        java.awt.Dimension var2 = null;
        L0: {
          L1: {
            if (null != this.field_ad) {
              break L1;
            } else {
              this.field_R = 0;
              this.field_C = 0;
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = this.field_ad.getSize();
          this.field_R = var2.width;
          this.field_C = var2.height;
          break L0;
        }
        L2: {
          if (this.field_Qb == null) {
            this.field_I = this.field_C;
            this.field_Y = this.field_R;
            this.h((byte) -117);
            break L2;
          } else {
            break L2;
          }
        }
        this.s(3682);
        if (param0 <= -68) {
          this.la();
          return;
        } else {
          return;
        }
    }

    final hoa n(int param0) {
        if (param0 != 16664) {
            this.field_Zb = -2.1042897701263428f;
        }
        if (this.field_Sc == null) {
            return null;
        }
        return this.field_Sc.b(5995);
    }

    private final int b(byte param0, int param1) {
        if (param1 == 5121) {
          return 1;
        } else {
          if (-5121 != (param1 ^ -1)) {
            L0: {
              if (-5124 == (param1 ^ -1)) {
                break L0;
              } else {
                if ((param1 ^ -1) == -5123) {
                  break L0;
                } else {
                  L1: {
                    if ((param1 ^ -1) == -5126) {
                      break L1;
                    } else {
                      if (-5125 == (param1 ^ -1)) {
                        break L1;
                      } else {
                        if ((param1 ^ -1) != -5127) {
                          L2: {
                            if (param0 == -10) {
                              break L2;
                            } else {
                              this.field_Ic = 78;
                              break L2;
                            }
                          }
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
            this.field_d = true;
        }
        if (!(1 == this.field_y)) {
            this.r(0);
            this.b(16363, false);
            this.a(36, false);
            this.c(3742, false);
            this.a(false, 0);
            this.a(true, (kl) null);
            this.c(-2, 32677);
            this.d(1, 1);
            this.field_y = 1;
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            this.r(0);
            this.a(true, (kl) null);
            this.a((byte) 44, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_P, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cka.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final int[] Y() {
        return new int[]{this.field_o, this.field_db, this.field_W, this.field_kb};
    }

    final void GA(int param0) {
        this.a((byte) 65, 0);
        jaggl.OpenGL.glClearColor((float)(16711680 & param0) / 16711680.0f, (float)(65280 & param0) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> -23781544) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final nh a(jpa param0, boolean param1) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
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
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        nh stackIn_25_0 = null;
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
        nh stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var12 = new int[param0.field_a * param0.field_i];
                var11 = var12;
                var10 = var11;
                var3_array = var10;
                var4 = 0;
                var5 = 0;
                if (param0.field_h != null) {
                  break L2;
                } else {
                  var6_int = 0;
                  L3: while (true) {
                    L4: {
                      if ((param0.field_a ^ -1) >= (var6_int ^ -1)) {
                        break L4;
                      } else {
                        if (var9 != 0) {
                          break L1;
                        } else {
                          var7 = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (var7 >= param0.field_i) {
                                  break L7;
                                } else {
                                  incrementValue$3 = var4;
                                  var4++;
                                  var8 = param0.field_g[255 & param0.field_f[incrementValue$3]];
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
                                      if (0 != var8) {
                                        stackOut_10_0 = (int[]) ((Object) stackIn_10_0);
                                        stackOut_10_1 = stackIn_10_1;
                                        stackOut_10_2 = fh.a(-16777216, var8);
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
                if (param0.field_a <= var6_int) {
                  break L1;
                } else {
                  var7 = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if ((param0.field_i ^ -1) >= (var7 ^ -1)) {
                          break L12;
                        } else {
                          incrementValue$5 = var5;
                          var5++;
                          var10[incrementValue$5] = fh.a(param0.field_h[var4] << 957572024, param0.field_g[sea.c((int) param0.field_f[var4], 255)]);
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
            var6 = this.a(var12, param0.field_a, 96, param0.field_i, param0.field_i, 0);
            var6.b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
            stackOut_24_0 = (nh) (var6);
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("cka.EB(");
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
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_25_0;
    }

    private final void o(byte param0) {
        cb discarded$2 = null;
        this.field_vc = new kl[this.field_Ic];
        this.field_lc = new rt((cka) (this), 3553, 6408, 1, 1);
        rt discarded$0 = new rt((cka) (this), 3553, 6408, 1, 1);
        rt discarded$1 = new rt((cka) (this), 3553, 6408, 1, 1);
        this.field_w = new np((cka) (this));
        this.field_Nb = new np((cka) (this));
        this.field_Ub = new np((cka) (this));
        this.field_E = new np((cka) (this));
        if (param0 < 17) {
            return;
        }
        this.field_yb = new np((cka) (this));
        this.field_i = new np((cka) (this));
        this.field_eb = new np((cka) (this));
        this.field_sc = new np((cka) (this));
        this.field_D = new np((cka) (this));
        this.field_Xb = new np((cka) (this));
        if (this.field_id) {
            this.field_ic = new cb((cka) (this));
            discarded$2 = new cb((cka) (this));
        }
    }

    final sca a(int param0, int param1, int param2, boolean param3, byte[] param4) {
        RuntimeException var6 = null;
        sca stackIn_2_0 = null;
        nm stackIn_8_0 = null;
        o stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_7_0 = null;
        o stackOut_9_0 = null;
        sca stackOut_1_0 = null;
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
                if (!this.field_Q) {
                  break L1;
                } else {
                  L2: {
                    if (!param3) {
                      break L2;
                    } else {
                      if (this.field_bd) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_7_0 = new nm((cka) (this), param2, param4, param1, param3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackOut_9_0 = new o((cka) (this), param2, param4, param1);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_1_0 = (sca) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("cka.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (sca) ((Object) stackIn_8_0);
          } else {
            return (sca) ((Object) stackIn_10_0);
          }
        }
    }

    final void a(float param0, boolean param1, float param2) {
        this.field_ec = param0;
        this.field_oc = param2;
        if (!param1) {
            return;
        }
        this.m(2916);
    }

    static {
        field_Z = 22238;
        field_ab = 0;
    }
}
