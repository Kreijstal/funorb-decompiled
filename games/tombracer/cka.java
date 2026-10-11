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
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        try {
          this.field_l.swapBuffers();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.i((byte) -118);
        this.a((byte) 50, param4);
        float var6 = 0.3499999940395355f + (float)param0;
        float var7 = (float)param1 + 0.3499999940395355f;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new np(this, param0, param1, param3, param4, param2);
          return (ka) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("cka.MB(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = (float)param2 + var7;
        this.i((byte) -116);
        float var10 = (float)param3 + var8;
        this.a((byte) 40, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        if (this.field_S) {
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
        if ((!param1 ? 1 : 0) != (!this.field_d ? 1 : 0)) {
          if (param1) {
            jaggl.OpenGL.glEnable(2929);
          } else {
            jaggl.OpenGL.glDisable(2929);
          }
          this.field_y = this.field_y & -32;
          this.field_d = param1 ? true : false;
        }
        if (param0 != 3742) {
          this.field_vb = -64;
        }
    }

    final void d() {
        if (this.field_id) {
          if (this.field_Qb != this.field_bb) {
            throw new RuntimeException();
          }
          this.field_bb.a(-92, 0);
          this.field_bb.a(-120, 8);
          this.b(this.field_bb, 0);
        } else {
          if (!this.field_Yc) {
            throw new RuntimeException("");
          }
          this.field_Mb.b(this.field_I, 0, 0, 0, this.field_Y, 8448, 0);
          this.field_l.setSurface(this.field_n);
        }
        this.field_I = this.field_C;
        this.field_Mb = null;
        this.field_Y = this.field_R;
        this.s(3682);
        this.h((byte) 114);
        this.la();
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (param2 < this.field_B) {
          this.field_B = param2;
        }
        if (param3 < this.field_kc) {
          this.field_kc = param3;
        }
        if (this.field_f < param1) {
          this.field_f = param1;
        }
        if (this.field_Ib < param0) {
          this.field_Ib = param0;
        }
        jaggl.OpenGL.glEnable(3089);
        this.r((byte) -115);
        this.q((byte) 123);
    }

    final void b(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 + param2, param0);
        if (param1 != 3) {
          this.field_k = (String) null;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34200 + param2, param3);
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
        RuntimeException var6 = null;
        wo stackIn_5_0 = null;
        lra stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Q && (!param3 ||
            this.field_bd)) {
            stackIn_5_0 = new wo(this, param2, param1, param0, param3);
            return (va) ((Object) stackIn_5_0);
          }
          if (param4 < 40) {
            this.a(89);
          }
          stackIn_9_0 = new lra(this, param2, param1, param0);
          return (va) ((Object) stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("cka.JC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void m(byte param0) {
        if (this.field_Ac &&
          !this.field_v) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
        if (param0 != -52) {
          this.field_Rc = (sca) null;
        }
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = 0.3499999940395355f + (float)param1;
        float var9 = var7 + (float)param2 - 1.0f;
        float var10 = var8 + (float)param3 - 1.0f;
        this.i((byte) -119);
        this.a((byte) 21, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        if (this.field_S) {
          jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(2);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (this.field_S) {
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
        if (var4 != var2 &&
          var5 != var3) {
          jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field_Gc, (double)this.field_ob);
        }
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0 != -4709) {
          this.c(true);
        }
    }

    private final void q(byte param0) {
        if (param0 <= 1) {
          this.field_nc = false;
        }
        if (this.field_B >= this.field_Ib &&
          this.field_f <= this.field_kc) {
          jaggl.OpenGL.glScissor(this.field_Ib + this.field_g, -this.field_kc + (this.field_Pc + this.field_I), this.field_B - this.field_Ib, -this.field_f + this.field_kc);
        } else {
          jaggl.OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    final void a(boolean param0, kl param1) {
        kl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var3 = this.field_vc[this.field_r];
          if (var3 != param1) {
            if (param1 == null) {
              jaggl.OpenGL.glDisable(var3.field_e);
            } else {
              if (var3 != null) {
                if (param1.field_e != var3.field_e) {
                  jaggl.OpenGL.glDisable(var3.field_e);
                  jaggl.OpenGL.glEnable(param1.field_e);
                }
              } else {
                jaggl.OpenGL.glEnable(param1.field_e);
              }
              jaggl.OpenGL.glBindTexture(param1.field_e, param1.f(0));
            }
            this.field_vc[this.field_r] = param1;
          }
          this.field_y = this.field_y & -2;
          if (!param0) {
            this.field_Vb = (vna) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("cka.GC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(float param0, int param1, float param2, float param3) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (this.field_U) {
          jaggl.OpenGL.glLoadIdentity();
        }
        if (param1 != 25380) {
          za var6 = (za) null;
          this.a((za) null);
        }
        jaggl.OpenGL.glTranslatef(param3, param0, param2);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_U = true;
    }

    final void a() {
        int var1;
        int var2;
        int var3;
        int var4;
        if (!this.field_nc) {
          return;
        }
        if (this.field_Y > 0 &&
          this.field_I > 0) {
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

    final void a(int param0, va param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_tb != param1) {
            if (this.field_Q) {
              jaggl.OpenGL.glBindBufferARB(34962, param1.a(true));
            }
            this.field_tb = param1;
          }
          if (param0 <= 74) {
            this.field_fc = (oba) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("cka.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
          if (this.field_e != 1) {
            this.b(false);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cka.W(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        this.a(param2, true, param1, param0 - 71);
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
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
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
        var4 = TombRacer.field_G ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        while (!this.field_pd.d((byte) 14)) {
          var5 = (al) (this.field_pd.c(-108));
          incrementValue$6 = var2;
          var2++;
          qo.field_k[incrementValue$6] = (int)var5.field_d;
          this.field_mb = this.field_mb - var5.field_i;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteBuffersARB(var2, qo.field_k, 0);
          var2 = 0;
        }
        if (0 >= var2) {
          while (!this.field_K.d((byte) 14)) {
            var6 = (al) (this.field_K.c(63));
            incrementValue$1 = var2;
            var2++;
            qo.field_k[incrementValue$1] = (int)var6.field_d;
            this.field_jb = this.field_jb - var6.field_i;
            if (1000 != var2) {
              continue;
            }
            jaggl.OpenGL.glDeleteTextures(var2, qo.field_k, 0);
            var2 = 0;
          }
        } else {
          jaggl.OpenGL.glDeleteBuffersARB(var2, qo.field_k, 0);
          var2 = 0;
          while (!this.field_K.d((byte) 14)) {
            var6 = (al) (this.field_K.c(63));
            incrementValue$0 = var2;
            var2++;
            qo.field_k[incrementValue$0] = (int)var6.field_d;
            this.field_jb = this.field_jb - var6.field_i;
            if (1000 != var2) {
              continue;
            }
            jaggl.OpenGL.glDeleteTextures(var2, qo.field_k, 0);
            var2 = 0;
          }
        }
        boolean decompiledFrameCompleted1 = true;
        L6: {
          if (var2 <= 0) {
            do {
              if (this.field_cc.d((byte) 14)) {
                decompiledFrameCompleted1 = false;
                break;
              }
              var7 = (al) (this.field_cc.c(-103));
              incrementValue$2 = var2;
              var2++;
              qo.field_k[incrementValue$2] = var7.field_i;
              stackIn_19_0 = var2;
              stackIn_19_1 = 1000;
            } while (stackIn_19_0 != stackIn_19_1);
            if (decompiledFrameCompleted1) {
              jaggl.OpenGL.glDeleteFramebuffersEXT(var2, qo.field_k, 0);
              var2 = 0;
              break L6;
            }
          }
          if (decompiledFrameCompleted1) {
            jaggl.OpenGL.glDeleteTextures(var2, qo.field_k, 0);
            var2 = 0;
          }
        }
        if (decompiledFrameCompleted1) {
          while (!this.field_cc.d((byte) 14)) {
            var7 = (al) (this.field_cc.c(-103));
            incrementValue$3 = var2;
            var2++;
            qo.field_k[incrementValue$3] = var7.field_i;
            stackIn_28_0 = var2;
            stackIn_28_1 = 1000;
            if (stackIn_28_0 != stackIn_28_1) {
              continue;
            }
            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, qo.field_k, 0);
            var2 = 0;
          }
        }
        boolean decompiledFrameCompleted0 = true;
        L10: {
          if (var2 <= 0) {
            do {
              if (this.field_Vb.d((byte) 14)) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var8 = (al) (this.field_Vb.c(-117));
              incrementValue$4 = var2;
              var2++;
              qo.field_k[incrementValue$4] = (int)var8.field_d;
              this.field_Tb = this.field_Tb - var8.field_i;
              stackIn_37_0 = var2;
              stackIn_37_1 = 1000;
            } while (stackIn_37_0 != stackIn_37_1);
            if (decompiledFrameCompleted0) {
              jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
              var2 = 0;
              break L10;
            }
          }
          if (decompiledFrameCompleted0) {
            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, qo.field_k, 0);
            var2 = 0;
          }
        }
        if (decompiledFrameCompleted0) {
          while (!this.field_Vb.d((byte) 14)) {
            var8 = (al) (this.field_Vb.c(-117));
            incrementValue$5 = var2;
            var2++;
            qo.field_k[incrementValue$5] = (int)var8.field_d;
            this.field_Tb = this.field_Tb - var8.field_i;
            stackIn_46_0 = var2;
            stackIn_46_1 = 1000;
            if (stackIn_46_0 != stackIn_46_1) {
              continue;
            }
            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
            var2 = 0;
          }
        }
        if (var2 <= 0) {
          while (!this.field_Lc.d((byte) 14)) {
            var9 = (al) (this.field_Lc.c(30));
            jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
          }
          while (!this.field_Fc.d((byte) 14)) {
            var10 = this.field_Fc.c(80);
            jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
          }
          while (!this.field_rb.d((byte) 14)) {
            var11 = this.field_rb.c(50);
            jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
          }
          while (!this.field_Lc.d((byte) 14)) {
            var12 = (al) (this.field_Lc.c(-99));
            jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
          }
          this.field_hd.c(-29413);
          if (!(this.f(-44) <= 100663296) &&
            !(bva.b((byte) -107) <= (60000L + this.field_Lb))) {
            System.gc();
            this.field_Lb = bva.b((byte) -107);
          }
        } else {
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, qo.field_k, 0);
          var2 = 0;
          while (!this.field_Lc.d((byte) 14)) {
            var9 = (al) (this.field_Lc.c(30));
            jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
          }
          while (!this.field_Fc.d((byte) 14)) {
            var10 = this.field_Fc.c(80);
            jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
          }
          while (!this.field_rb.d((byte) 14)) {
            var11 = this.field_rb.c(50);
            jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
          }
          while (!this.field_Lc.d((byte) 14)) {
            var12 = (al) (this.field_Lc.c(-99));
            jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
          }
          this.field_hd.c(-29413);
          if (!(this.f(-44) <= 100663296) &&
            !(bva.b((byte) -107) <= (60000L + this.field_Lb))) {
            System.gc();
            this.field_Lb = bva.b((byte) -107);
          }
        }
        this.field_Oc = param0;
    }

    final gda e() {
        return (gda) ((Object) this.field_fc);
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
        qf var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_md = ((cp) (param0)).field_h;
          if (null == this.field_X) {
            var3 = new qf(80);
            if (this.field_O) {
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
            }
            this.field_X = this.a(var3.field_h, var3.field_g, 20, false, (byte) 108);
            this.field_Bc = new tj(this.field_X, 5126, 3, 0);
            this.field_Rb = new tj(this.field_X, 5126, 2, 12);
            this.field_Ec.a(22091, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("cka.FB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        if (this.field_Gc != param0 ||
          param1 != this.field_ob) {
          this.field_Gc = param0;
          this.field_ob = param1;
          this.g(0);
          this.m(2916);
          if (this.field_e != 3) {
            if (this.field_e == 2) {
              this.l((byte) -37);
            }
          } else {
            this.l(-4709);
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
        if (param1 != this.field_yc) {
          this.field_yc = param1;
          if (this.field_e == 3) {
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
          stackIn_4_1 = new StringBuilder().append("cka.NB(");
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

    private final void l(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_Bb, 0);
        if (param0 != -37) {
          return;
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void a(ks param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_A >= 0 &&
            param0 == this.field_kd[this.field_A]) {
            fieldTemp$1 = this.field_A;
            this.field_A = this.field_A - 1;
            this.field_kd[fieldTemp$1] = null;
            param0.a(4245);
            if (this.field_A < 0) {
              this.field_Qb = null;
            } else {
              this.field_Qb = this.field_kd[this.field_A];
              this.field_Qb.c((byte) 111);
            }
            if (param1 != -1090) {
              this.h((byte) -8);
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cka.QC(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
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
        if (this.field_U) {
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
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        int[] var9 = new int[param0 * param1];
        int[] var6 = var9;
        for (var7 = 0; var7 < param1; var7++) {
          jaggl.OpenGL.glReadPixelsi(param4, -param3 + (this.field_I - var7), param0, 1, 32993, this.field_P, var9, var7 * param0);
        }
        if (param2 != -81) {
          this.e(-23, 77);
        }
        return var6;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new jja(this, param3, param4, param0, param1, param2);
          return (nh) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("cka.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
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
        int[] var4;
        if (param0 != 1) {
          var4 = (int[]) null;
          this.da(-3, -46, 112, (int[]) null);
        }
        if (param1 == 1) {
          return 7681;
        }
        if (param1 == 0) {
          return 8448;
        }
        if (param1 == 2) {
          return 34165;
        }
        if (3 == param1) {
          return 260;
        }
        if (4 == param1) {
          return 34023;
        }
        throw new IllegalArgumentException();
    }

    final void j(byte param0) {
        if (this.field_y != 16) {
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
        int var9 = 0;
        float var6;
        float var7;
        int var8;
        int var10;
        var10 = TombRacer.field_G ? 1 : 0;
        if (0 > param2) {
          param2 = -param2;
        }
        if (param2 + param0 < this.field_Ib) {
          return;
        }
        if (param0 - param2 <= this.field_B &&
          this.field_f <= param1 + param2 &&
          this.field_kc >= -param2 + param1) {
          this.i((byte) -112);
          this.a((byte) 94, param4);
          jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
          if (1 >= param2) {
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glVertex2f((float)(param0 + 1), (float)(1 + param1));
            jaggl.OpenGL.glVertex2f((float)(param0 + 1), (float)(param1 - 1));
            jaggl.OpenGL.glVertex2f((float)(param0 - 1), (float)(-1 + param1));
            jaggl.OpenGL.glVertex2f((float)(-1 + param0), (float)(1 + param1));
            jaggl.OpenGL.glEnd();
            return;
          }
          var6 = (float)param0 + 0.3499999940395355f;
          var7 = (float)param1 + 0.3499999940395355f;
          jaggl.OpenGL.glBegin(2);
          var8 = 262144 / (6 * param2);
          if (var8 > 64) {
            if (var8 > 512) {
              var8 = 512;
            }
          } else {
            var8 = 64;
          }
          var8 = b.a(var8, (byte) -118);
          jaggl.OpenGL.glVertex2f((float)param2 + var6, var7);
          for (var9 = -var8 + 16384; 0 < var9; var9 = var9 - var8) {
            jaggl.OpenGL.glVertex2f(var6 + (float)param2 * hu.field_c[var9], (float)param2 * hu.field_b[var9] + var7);
          }
          jaggl.OpenGL.glEnd();
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
        if (this.field_r != param0) {
          jaggl.OpenGL.glActiveTexture(param0 + 33984);
          this.field_r = param0;
        }
    }

    final mw b(int param0, int param1) {
        return null;
    }

    private final void g(int param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float[] var8;
        var8 = this.field_Bb;
        var2 = var8;
        var3 = (float)(-this.field_o * this.field_Gc) / (float)this.field_W;
        var4 = (float)((-this.field_o + this.field_Y) * this.field_Gc) / (float)this.field_W;
        var5 = (float)(this.field_db * this.field_Gc) / (float)this.field_kb;
        var6 = (float)(this.field_Gc * (-this.field_I + this.field_db)) / (float)this.field_kb;
        if (var3 != var4 &&
          var6 != var5) {
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
        } else {
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
        }
        this.j(param0 ^ 122);
        if (param0 != 0) {
          this.field_cd = 0.06654822826385498f;
        }
    }

    final void d(int param0, boolean param1) {
        if ((!this.field_v ? 1 : 0) == (param1 ? 1 : 0)) {
          this.field_v = param1 ? true : false;
          this.m((byte) -52);
        }
        if (param0 >= -48) {
          va var4 = (va) null;
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
        if (this.field_e != 3) {
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
        if ((!param0 ? 1 : 0) == (this.field_Nc ? 1 : 0)) {
          this.field_Nc = param0 ? true : false;
          this.c((byte) 13);
          this.field_y = this.field_y & -32;
        }
    }

    private final void c(byte param0) {
        boolean stackIn_4_0 = false;
        stackIn_4_0 = (this.field_Nc) && (this.field_Jc);
        jaggl.OpenGL.glDepthMask(stackIn_4_0);
        if (param0 != 13) {
          this.d(-41, 18, -45, -90, 51, -122);
        }
    }

    final void a(sca param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_Rc != param0) {
            if (this.field_Q) {
              jaggl.OpenGL.glBindBufferARB(34963, param0.a(9624));
            }
            this.field_Rc = param0;
          }
          if (param1 != 34963) {
            this.a(-127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("cka.UA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void k(int param0) {
        this.field_l.b();
        if (param0 != 19770) {
          this.a(true, true);
        }
    }

    final da a(qla param0, jpa[] param1, boolean param2) {
        RuntimeException var4 = null;
        eg stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new eg(this, param0, param1, param2);
          return (da) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("cka.I(");
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
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
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
        if (this.field_qc &&
          this.field_Kb >= 0) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
        if (param0 != -87) {
          this.DA(90, 39, -12, 39);
        }
    }

    private final void v(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        this.c(-2, 32677);
        for (var2 = -1 + this.field_Ic; 0 <= var2; var2--) {
          this.e(var2, true);
          this.a(true, (kl) null);
          jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
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
        float[] var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        for (var3 = 0; var3 < 8; var3++) {
          var4 = 16384 + var3;
          jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
          jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
          jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        jaggl.OpenGL.glEnable(16384);
        jaggl.OpenGL.glEnable(16385);
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        if (param0 != -3159) {
          return;
        }
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.field_gc = -1;
        this.field_ac = -1;
        this.la();
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
        jaggl.OpenGL.glColor4ub((byte)(param6 >> 16), (byte)(param6 >> 8), (byte)param6, (byte)(param6 >> 24));
        jaggl.OpenGL.glVertex2f((float)param0 + 0.3499999940395355f, 0.3499999940395355f + (float)param1);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param2, 0.3499999940395355f + (float)param3);
        jaggl.OpenGL.glColor4ub((byte)(param8 >> 16), (byte)(param8 >> 8), (byte)param8, (byte)(param8 >> 24));
        jaggl.OpenGL.glVertex2f((float)param4 + 0.3499999940395355f, (float)param5 + 0.3499999940395355f);
        jaggl.OpenGL.glEnd();
    }

    final int i() {
        return this.field_Gc;
    }

    final void c(boolean param0) {
        if (this.field_y != 8) {
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
        if ((!param1 ? 1 : 0) != (!this.field_Ac ? 1 : 0)) {
          this.field_Ac = param1 ? true : false;
          this.m((byte) -52);
          this.field_y = this.field_y & -8;
        }
        if (param0 < 29) {
          this.field_nc = false;
        }
    }

    final static String a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        if (param2 > -13) {
          return (String) null;
        }
        for (var4 = 0; param1 > var4; var4++) {
          var6[var4] = param0;
        }
        return new String(var6);
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
        int stackIn_11_0 = 0;
        int stackIn_12_1 = 0;
        boolean stackIn_17_1 = false;
        int stackIn_21_0 = 0;
        int stackIn_24_1 = 0;
        boolean stackIn_32_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.field_ld != param1) {
          if (1 != param1) {
            if (param1 != 2) {
              if (128 != param1) {
                var4 = 0;
                var5 = 0;
                var3 = 1;
              } else {
                var5 = 3;
                var3 = 1;
                var4 = 1;
              }
            } else {
              var3 = 1;
              var4 = 0;
              var5 = 2;
            }
          } else {
            var4 = 1;
            var5 = 1;
            var3 = 1;
          }
          stackIn_11_0 = var3;
          stackIn_12_1 = (this.field_q) ? 0 : 1;
          if (stackIn_11_0 == stackIn_12_1) {
            jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
            stackIn_17_1 = (var3 != 0);
            this.field_q = stackIn_17_1;
          }
          stackIn_21_0 = (this.field_lb) ? 0 : 1;
          stackIn_24_1 = (var4 != 0) ? 0 : 1;
          if (stackIn_21_0 != stackIn_24_1) {
            if (var4 != 0) {
              jaggl.OpenGL.glEnable(3008);
            } else {
              jaggl.OpenGL.glDisable(3008);
            }
            stackIn_32_1 = (var4 != 0);
            this.field_lb = stackIn_32_1;
          }
          if (this.field_Jb != var5) {
            if (var5 != 1) {
              if (var5 == 2) {
                jaggl.OpenGL.glEnable(3042);
                jaggl.OpenGL.glBlendFunc(1, 1);
              } else {
                if (var5 == 3) {
                  jaggl.OpenGL.glEnable(3042);
                  jaggl.OpenGL.glBlendFunc(774, 1);
                } else {
                  jaggl.OpenGL.glDisable(3042);
                }
              }
            } else {
              jaggl.OpenGL.glEnable(3042);
              jaggl.OpenGL.glBlendFunc(770, 771);
            }
            this.field_Jb = var5;
          }
          this.field_y = this.field_y & -29;
          this.field_ld = param1;
        }
        if (param0 <= 18) {
          this.o((byte) -128);
        }
    }

    cka(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        long dupTemp$0 = 0L;
        int var9 = 0;
        int stackIn_12_1 = 0;
        boolean stackIn_52_1 = false;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
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
        try {
          this.field_gb = param2;
          this.field_ad = param0;
          if (!in.a("jaclib", 480)) {
            throw new RuntimeException("");
          }
          if (!in.a("jaggl", 480)) {
            throw new RuntimeException("");
          }
          try {
            this.field_l = new jaggl.OpenGL();
            dupTemp$0 = this.field_l.init(param0, 8, 8, 8, 24, 0, this.field_gb);
            this.field_dd = dupTemp$0;
            this.field_n = dupTemp$0;
            if (this.field_dd == 0L) {
              throw new RuntimeException("");
            }
            this.f((byte) -68);
            var4_int = this.k((byte) 108);
            if (var4_int != 0) {
              throw new RuntimeException("");
            }
            if (!this.field_O) {
              stackIn_12_1 = 5121;
            } else {
              stackIn_12_1 = 33639;
            }
            this.field_P = stackIn_12_1;
            if (-1 != this.field_h.indexOf("radeon")) {
              var5_int = 0;
              var6 = 0;
              var7 = 0;
              var8 = rga.a(32287, this.field_h.replace('/', ' '), ' ');
              for (var9 = 0; var9 < var8.length; var9++) {
                var13 = var8[var9];
                var10 = var13;
                var10 = var13;
                var10 = var13;
                try {
                  boolean decompiledFrameRemainder0 = true;
                  if (var13.length() > 0) {
                    if (var13.charAt(0) == 120 &&
                      var13.length() >= 3) {
                      var21 = (CharSequence) ((Object) var13.substring(1, 3));
                      if (sqa.a(var21, -3)) {
                        var10 = var13.substring(1);
                        var7 = 1;
                      }
                    }
                    if (var10.equals("hd")) {
                      var6 = 1;
                    } else {
                      if (var10.startsWith("hd")) {
                        var6 = 1;
                        var10 = var10.substring(2);
                      }
                      if (var10.length() >= 4) {
                        var22 = (CharSequence) ((Object) var10.substring(0, 4));
                        if (sqa.a(var22, -3)) {
                          var23 = (CharSequence) ((Object) var10.substring(0, 4));
                          var5_int = jb.a(var23, (byte) 70);
                          decompiledRegionSelector0 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                      }
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    decompiledRegionSelector0 = 0;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var11 = (Exception) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 0;
                }
                if (decompiledRegionSelector0 == 0) {
                  continue;
                }
                break;
              }
              if (var6 == 0 ||
                var5_int < 4000) {
                this.field_z = false;
              }
              if (var7 == 0 &&
                var6 == 0) {
                if (var5_int >= 7000 &&
                  var5_int <= 7999) {
                  this.field_Q = false;
                }
                if (7000 <= var5_int &&
                  var5_int <= 9250) {
                  this.field_V = false;
                }
              }
              this.field_Cc = this.field_Cc & this.field_l.a("GL_ARB_half_float_pixel");
              this.field_bd = this.field_Q;
            }
            if (this.field_k.indexOf("intel") != -1) {
              this.field_id = false;
            }
            stackIn_52_1 = !(this.field_k.equals("s3 graphics"));
            this.field_nc = stackIn_52_1;
            if (this.field_Q) {
              try {
                var17 = new int[1];
                jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
              } catch (java.lang.Throwable decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5 = decompiledCaughtException;
                throw new RuntimeException("");
              }
            }
            ija.a(true, (byte) 99, false);
            this.field_Ob = true;
            this.field_hd = new hsa(this, this.field_c);
            this.o((byte) 124);
            this.field_zc = new mq(this);
            this.field_L = new cw(this);
            if (this.field_L.b((byte) -43)) {
              this.field_T = new uv(this);
              if (!this.field_T.e(34842)) {
                this.field_T.d((byte) -60);
                this.field_T = null;
              }
            }
            this.field_Hb = new uua(this);
            this.v(-3159);
            this.b((byte) -99);
            this.a();
            return;
          } catch (java.lang.Throwable decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var4 = decompiledCaughtException;
            var4.printStackTrace();
            this.k();
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_65_0 = var4_ref;
          stackIn_65_1 = new StringBuilder().append("cka.<init>(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(ks param0, byte param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 81) {
            this.j(-22);
          }
          if (!this.field_hc) {
            if (this.field_x >= 3) {
              throw new RuntimeException();
            }
            if (this.field_x >= 0) {
              this.field_ub[this.field_x].b((byte) -36);
            }
            fieldTemp$1 = this.field_x + 1;
            this.field_x = this.field_x + 1;
            this.field_ub[fieldTemp$1] = param0;
            this.field_Qb = param0;
            this.field_t = param0;
            this.field_t.b(13109);
          } else {
            this.c(param0, -4);
            this.a(0, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cka.VC(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7;
        float var8;
        float var9;
        this.i((byte) -114);
        this.a((byte) 52, param5);
        var7 = (float)param2 - (float)param0;
        var8 = (float)(-param1) + (float)param3;
        if (var7 == 0.0f &&
          0.0f == var8) {
          var7 = 1.0f;
        } else {
          var9 = (float)(1.0 / Math.sqrt((double)(var8 * var8 + var7 * var7)));
          var7 = var7 * var9;
          var8 = var8 * var9;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
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
          if (param1 >= ~this.field_Zc) {
            throw new RuntimeException();
          }
          if (this.field_Zc >= 0) {
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
          ks var3 = (ks) null;
          this.a((ks) null, 54);
        }
        if (this.field_e != 1) {
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          if (0 < this.field_Y &&
            this.field_I > 0) {
            jaggl.OpenGL.glOrtho(0.0, (double)this.field_Y, (double)this.field_I, 0.0, -1.0, 1.0);
          }
          jaggl.OpenGL.glMatrixMode(5888);
          jaggl.OpenGL.glLoadIdentity();
          this.field_e = 1;
          this.field_y = this.field_y & -25;
        }
    }

    private final void d(int param0) {
        ob var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; this.field_sb > var2; var2++) {
          var3 = this.field_Dc[var2];
          vh.field_h[0] = (float)var3.d(13437);
          var4 = 16386 + var2;
          vh.field_h[1] = (float)var3.a(19848);
          vh.field_h[2] = (float)var3.b((byte) 11);
          vh.field_h[3] = 1.0f;
          jaggl.OpenGL.glLightfv(var4, 4611, vh.field_h, 0);
          var5 = var3.c(param0 ^ 123);
          var6 = var3.b(0) / 255.0f;
          vh.field_h[1] = (float)(sea.c(65532, var5) >> 8) * var6;
          vh.field_h[0] = var6 * (float)sea.c(var5 >> 16, 255);
          vh.field_h[2] = (float)sea.c(255, var5) * var6;
          jaggl.OpenGL.glLightfv(var4, 4609, vh.field_h, 0);
          jaggl.OpenGL.glLightf(var4, 4617, 1.0f / (float)(var3.a((byte) -126) * var3.a((byte) -126)));
          jaggl.OpenGL.glEnable(var4);
        }
        if (param0 != -1) {
          return;
        }
        while (this.field_pc > var2) {
          jaggl.OpenGL.glDisable(16386 + var2);
          var2++;
        }
        this.field_pc = this.field_sb;
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
        jaggl.OpenGL.glTexEnvi(8960, 34192 + param0, param3);
    }

    private final void a(int param0, boolean param1, boolean param2, int param3) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        dw var10;
        int var11;
        int var12;
        int var13;
        jpa var14;
        var13 = TombRacer.field_G ? 1 : 0;
        if (param0 != this.field_Yb ||
          this.field_pb != this.field_hb) {
          var5 = null;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          stackIn_6_0 = (this.field_pb) ? 3 : 0;
          var9 = stackIn_6_0;
          if (0 <= param0) {
            var5 = this.field_hd.a(param0, 0);
            var10 = this.field_c.a((byte) 14, param0);
            if (var10.field_s == 0 &&
              var10.field_o == 0) {
              this.e((byte) 112);
            } else {
              stackIn_14_0 = (var10.field_g) ? 64 : 128;
              var11 = stackIn_14_0;
              var12 = var11 * 50;
              this.a((float)(var10.field_o * (this.field_Oc % var12)) / (float)var12, 25380, 0.0f, (float)(var10.field_s * (this.field_Oc % var12)) / (float)var12);
            }
            if (!this.field_pb) {
              var8 = var10.field_t;
              var9 = var10.field_h;
              var7 = var10.field_a;
            }
            var6 = var10.field_q;
          } else {
            this.e((byte) 112);
          }
          this.field_Hb.a(param3 ^ -71, var8, param1, param2, var7, var9);
          if (!this.field_Hb.a(var6, 9, (kl) (var5))) {
            this.a(true, (kl) (var5));
            this.d(param3 ^ -2, var6);
          }
          this.field_hb = this.field_pb;
          this.field_Yb = param0;
        }
        if (param3 != -1) {
          var14 = (jpa) null;
          this.a((jpa) null, false);
        }
        this.field_y = this.field_y & -8;
    }

    private final int k(byte param0) {
        int stackIn_27_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        int var5_int = 0;
        NumberFormatException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var10 = null;
        int[] var13 = null;
        this.field_k = jaggl.OpenGL.glGetString(7936).toLowerCase();
        var2 = 0;
        this.field_h = jaggl.OpenGL.glGetString(7937).toLowerCase();
        if (this.field_k.indexOf("microsoft") != -1) {
          var2 = var2 | 1;
        }
        if (this.field_k.indexOf("brian paul") != -1 ||
          this.field_k.indexOf("mesa") != -1) {
          var2 = var2 | 1;
        }
        var3 = jaggl.OpenGL.glGetString(7938);
        var4 = rga.a(32287, var3.replace('.', ' '), ' ');
        if (var4.length < 2) {
          var2 = var2 | 4;
        } else {
          try {
            var5_int = jb.a((CharSequence) ((Object) var4[0]), (byte) 70);
            var6 = jb.a((CharSequence) ((Object) var4[1]), (byte) 70);
            this.field_fb = var6 + 10 * var5_int;
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (NumberFormatException) (Object) decompiledCaughtException;
            var2 = var2 | 4;
          }
        }
        if (this.field_fb < 12) {
          var2 = var2 | 2;
        }
        if (!this.field_l.a("GL_ARB_multitexture")) {
          var2 = var2 | 8;
        }
        if (!this.field_l.a("GL_ARB_texture_env_combine")) {
          var2 = var2 | 32;
        }
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
        if (2 > this.field_Ic ||
          this.field_J < 2 ||
          this.field_Hc < 2) {
          var2 = var2 | 16;
        }
        this.field_O = jaclib.memory.Stream.b();
        this.field_Yc = this.field_l.arePbuffersAvailable();
        this.field_Q = this.field_l.a("GL_ARB_vertex_buffer_object");
        this.field_S = this.field_l.a("GL_ARB_multisample");
        this.field_G = this.field_l.a("GL_ARB_vertex_program");
        this.field_l.a("GL_ARB_fragment_program");
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
        stackIn_27_0 = (0 == var2) ? 0 : var2;
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
          int[] var3 = (int[]) null;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var6_float = 0.0f;
        RuntimeException var6 = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int[] var8_ref_int__ = null;
        int[] var9 = null;
        int[] var10 = null;
        try {
          var6_float = this.field_jd.field_q * (float)param2 + (this.field_jd.field_j * (float)param0 + this.field_jd.field_h * (float)param1) + this.field_jd.field_o;
          if (!(var6_float < (float)this.field_Gc) &&
            !((float)this.field_ob < var6_float)) {
            var7 = (int)((float)this.field_W * (this.field_jd.field_m + (this.field_jd.field_s * (float)param2 + ((float)param1 * this.field_jd.field_k + (float)param0 * this.field_jd.field_l))) / (float)param3);
            var8 = (int)((float)this.field_kb * ((float)param2 * this.field_jd.field_g + (this.field_jd.field_i * (float)param0 + (float)param1 * this.field_jd.field_r) + this.field_jd.field_p) / (float)param3);
            if (this.field_s <= (float)var7 &&
              this.field_od >= (float)var7 &&
              this.field_nd <= (float)var8 &&
              (float)var8 <= this.field_Db) {
              param4[1] = (int)(-this.field_nd + (float)var8);
              param4[0] = (int)((float)var7 - this.field_s);
              param4[2] = (int)var6_float;
              return;
            }
            var9 = param4;
            param4[2] = -1;
            var10 = param4;
            var10[1] = -1;
            var9[0] = -1;
            return;
          }
          var7_ref_int__ = param4;
          param4[2] = -1;
          var8_ref_int__ = param4;
          var8_ref_int__[1] = -1;
          var7_ref_int__[0] = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("cka.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        if (this.field_I < param3) {
          param3 = this.field_I;
        }
        if (param2 > this.field_Y) {
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
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        if (param1 != 1) {
          if (param1 == 0) {
            this.b(8448, 8960, 8448);
          } else {
            if (param1 != 2) {
              if (param1 != 3) {
                if (param1 == 4) {
                  this.b(34023, param0 + 8959, 34023);
                }
              } else {
                this.b(260, 8960, 8448);
              }
            } else {
              this.b(34165, 8960, 7681);
            }
          }
        } else {
          this.b(7681, 8960, 7681);
        }
    }

    final void k() {
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        vg var1 = this.field_qb.f(-80);
        while (var1 != null) {
          ((cp) (var1)).b((byte) 87);
          var1 = this.field_qb.e(125);
        }
        if (null != this.field_L) {
          this.field_L.a(-110);
        }
        if (this.field_l != null) {
          this.k(19770);
          var1_ref = this.field_p.keys();
          while (var1_ref.hasMoreElements()) {
            var2 = (java.awt.Canvas) (var1_ref.nextElement());
            var3 = (Long) (this.field_p.get(var2));
            this.field_l.releaseSurface(var2, var3.longValue());
          }
          this.field_l.release();
          this.field_l = null;
        }
        if (this.field_Ob) {
          rpa.a(true, false, true);
          this.field_Ob = false;
        }
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        int stackIn_3_0 = 0;
        int var7;
        float var8;
        stackIn_3_0 = (param0 == this.field_ac) ? 0 : 1;
        var7 = stackIn_3_0;
        if (var7 != 0 ||
          this.field_cd != param1 ||
          param2 != this.field_Sb) {
          this.field_ac = param0;
          this.field_Sb = param2;
          this.field_cd = param1;
          if (var7 != 0) {
            this.field_bc = (float)(this.field_ac & 255) / 255.0f;
            this.field_wc = (float)(this.field_ac & 16711680) / 16711680.0f;
            this.field_Fb = (float)(this.field_ac & 65280) / 65280.0f;
            this.h(16);
          }
          this.g((byte) -30);
        }
        if (param3 != this.field_Pb[0] ||
          this.field_Pb[1] != param4 ||
          param5 != this.field_Pb[2]) {
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
        }
    }

    final void da(int param0, int param1, int param2, int[] param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int[] var8 = null;
        int[] var9 = null;
        try {
          var5_float = this.field_jd.field_o + ((float)param2 * this.field_jd.field_q + (this.field_jd.field_h * (float)param1 + this.field_jd.field_j * (float)param0));
          if (!((float)this.field_Gc > var5_float) &&
            !(var5_float > (float)this.field_ob)) {
            var6 = (int)((float)this.field_W * (this.field_jd.field_l * (float)param0 + (float)param1 * this.field_jd.field_k + this.field_jd.field_s * (float)param2 + this.field_jd.field_m) / var5_float);
            var7 = (int)((float)this.field_kb * (this.field_jd.field_g * (float)param2 + ((float)param0 * this.field_jd.field_i + (float)param1 * this.field_jd.field_r) + this.field_jd.field_p) / var5_float);
            if (this.field_s <= (float)var6 &&
              this.field_od >= (float)var6 &&
              (float)var7 >= this.field_nd &&
              this.field_Db >= (float)var7) {
              param3[1] = (int)((float)var7 - this.field_nd);
              param3[2] = (int)var5_float;
              param3[0] = (int)((float)var6 - this.field_s);
              return;
            }
            var8 = param3;
            param3[2] = -1;
            var9 = param3;
            var8[0] = -1;
            var9[1] = -1;
            return;
          }
          var6_ref_int__ = param3;
          param3[2] = -1;
          var7_ref_int__ = param3;
          var7_ref_int__[1] = -1;
          var6_ref_int__[0] = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("cka.da(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void b(int param0, boolean param1) {
        if (param0 != 16363) {
          this.c(31, -99);
        }
        if ((!param1 ? 1 : 0) != (!this.field_qc ? 1 : 0)) {
          this.field_qc = param1 ? true : false;
          this.p((byte) -87);
          this.field_y = this.field_y & -32;
        }
    }

    final void a(ks param0, byte param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (0 <= this.field_Zc &&
            this.field_M[this.field_Zc] == param0) {
            fieldTemp$1 = this.field_Zc;
            this.field_Zc = this.field_Zc - 1;
            this.field_M[fieldTemp$1] = null;
            param0.d((byte) 60);
            if (this.field_Zc >= 0) {
              this.field_t = this.field_M[this.field_Zc];
              this.field_t.a((byte) -124);
            } else {
              this.field_t = null;
            }
            if (param1 != -38) {
              this.field_l = (jaggl.OpenGL) null;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cka.KC(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_L.a(param2, param0, param3, param1, 0);
    }

    final void b(int param0, int param1, int param2) {
        int var4;
        if (this.field_r != 0) {
          jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
          jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
        } else {
          var4 = 0;
          if (param0 != this.field_gd) {
            jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
            this.field_gd = param0;
            var4 = 1;
          }
          if (this.field_uc != param2) {
            jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
            var4 = 1;
            this.field_uc = param2;
          }
          if (var4 != 0) {
            this.field_y = this.field_y & -30;
          }
        }
        if (param1 != 8960) {
          this.field_Tc = (oba) null;
        }
    }

    final void a(float param0, float param1, float param2) {
        ql.field_l = param0;
        fra.field_p = param1;
        vba.field_v = param2;
    }

    private final void f(byte param0) {
        int incrementValue$0 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        if (param0 != -68) {
          return;
        }
        while (!this.field_l.a()) {
          incrementValue$0 = var2;
          var2++;
          if (5 < incrementValue$0) {
            throw new RuntimeException("");
          }
          vja.a(0, 1000L);
        }
    }

    final void a(tj param0, tj param1, tj param2, int param3, tj param4) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param4 == null) {
            jaggl.OpenGL.glDisableClientState(32884);
          } else {
            this.a(91, param4.field_d);
            jaggl.OpenGL.glVertexPointer((int) param4.field_f, (int) param4.field_e, this.field_tb.a(26653), this.field_tb.b(121) + (long)param4.field_g);
            jaggl.OpenGL.glEnableClientState(32884);
          }
          if (param2 != null) {
            this.a(126, param2.field_d);
            jaggl.OpenGL.glNormalPointer((int) param2.field_e, this.field_tb.a(26653), this.field_tb.b(-82) + (long)param2.field_g);
            jaggl.OpenGL.glEnableClientState(32885);
          } else {
            jaggl.OpenGL.glDisableClientState(32885);
          }
          if (param3 > -102) {
            return;
          }
          if (param0 == null) {
            jaggl.OpenGL.glDisableClientState(32886);
          } else {
            this.a(105, param0.field_d);
            jaggl.OpenGL.glColorPointer((int) param0.field_f, (int) param0.field_e, this.field_tb.a(26653), this.field_tb.b(-115) + (long)param0.field_g);
            jaggl.OpenGL.glEnableClientState(32886);
          }
          if (param1 == null) {
            jaggl.OpenGL.glDisableClientState(32888);
          } else {
            this.a(87, param1.field_d);
            jaggl.OpenGL.glTexCoordPointer((int) param1.field_f, (int) param1.field_e, this.field_tb.a(26653), this.field_tb.b(89) + (long)param1.field_g);
            jaggl.OpenGL.glEnableClientState(32888);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("cka.HC(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
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
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
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
        if (param0 != this.field_y) {
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        kba var3 = null;
        cla var3_ref = null;
        RuntimeException var3_ref2 = null;
        od var4 = null;
        int var6 = 0;
        cla var7 = null;
        cla var8 = null;
        kba var9 = null;
        kba var10 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_Mb = (jja) (param0);
          if (this.field_id) {
            if (null == this.field_bb) {
              this.field_bb = new cb(this);
            }
            if (this.field_bb == this.field_Qb) {
              throw new RuntimeException();
            }
            this.b((ks) (this.field_bb), (byte) 81);
            if (param1) {
              var3 = (kba) (this.field_Wc.a((byte) -106, (long)(this.field_Mb.a() << 16 | this.field_Mb.c())));
              if (var3 == null) {
                var9 = new kba(this, 6402, this.field_Mb.a(), this.field_Mb.c());
                var3 = var9;
                this.field_rc = this.field_rc + var9.field_o;
                while (this.field_rc > 2097152) {
                  var4 = this.field_F.b(-125);
                  if (var4 != null) {
                    var10 = (kba) (var4);
                    var10.c(-7975);
                    var10.p(125);
                    var10.g(77);
                    this.field_rc = this.field_rc - var10.field_o;
                    continue;
                  }
                  break;
                }
                this.field_Wc.a((long)(this.field_Mb.a() << 16 | this.field_Mb.c()), 124, var9);
              }
              this.field_F.a(97, var3);
              this.field_bb.a(8, var3, true);
            }
            this.field_bb.a(true, this.field_Mb.field_a, 0);
          } else {
            if (!this.field_Yc) {
              throw new RuntimeException("");
            }
            var3_ref = (cla) (this.field_Wc.a((byte) -109, (long)(this.field_Mb.a() << 16 | this.field_Mb.c())));
            if (var3_ref == null) {
              var7 = new cla(this, this.field_Mb.a(), this.field_Mb.c());
              var3_ref = var7;
              this.field_rc = this.field_rc + 4 * var7.field_p;
              while (2097152 < this.field_rc) {
                var4 = this.field_F.b(-119);
                if (var4 != null) {
                  var8 = (cla) (var4);
                  var8.c(-7975);
                  var8.p(21);
                  this.field_l.releasePbuffer(var8.a((byte) 101));
                  this.field_rc = this.field_rc - var8.field_p;
                  continue;
                }
                break;
              }
              this.field_Wc.a((long)(this.field_Mb.a() << 16 | this.field_Mb.c()), 112, var7);
            }
            this.field_F.a(75, var3_ref);
            this.field_l.setPbuffer(var3_ref.a((byte) 101));
          }
          this.field_Y = param0.a();
          this.field_I = param0.c();
          this.s(3682);
          this.h((byte) 115);
          this.la();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_33_0 = var3_ref2;
          stackIn_33_1 = new StringBuilder().append("cka.AE(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
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
        this.field_xb = -this.field_ec + (float)(this.field_ob - this.field_Xc);
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
        this.field_o = param0;
        this.field_W = param2;
        this.field_db = param1;
        this.field_kb = param3;
        this.g(0);
        this.r((byte) -126);
        if (this.field_e == 3) {
          this.l(-4709);
        } else {
          if (2 == this.field_e) {
            this.l((byte) -37);
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
        int var10 = 0;
        float var6;
        float var7;
        int var8;
        int var9;
        int var11;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param2 < 0) {
          param2 = -param2;
        }
        if (this.field_Ib > param2 + param0) {
          return;
        }
        if (this.field_B >= -param2 + param0 &&
          this.field_f <= param2 + param1 &&
          param1 - param2 <= this.field_kc) {
          this.i((byte) -110);
          this.a((byte) 120, param4);
          jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
          var6 = 0.3499999940395355f + (float)param0;
          var7 = (float)param1 + 0.3499999940395355f;
          var8 = param2 << 1;
          if ((float)var8 < this.field_Qc) {
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glVertex2f(var6 + 1.0f, 1.0f + var7);
            jaggl.OpenGL.glVertex2f(1.0f + var6, var7 - 1.0f);
            jaggl.OpenGL.glVertex2f(var6 - 1.0f, -1.0f + var7);
            jaggl.OpenGL.glVertex2f(-1.0f + var6, 1.0f + var7);
            jaggl.OpenGL.glEnd();
            return;
          }
          if (!((float)var8 <= this.field_Cb)) {
            jaggl.OpenGL.glBegin(6);
            jaggl.OpenGL.glVertex2f(var6, var7);
            var9 = 262144 / (6 * param2);
            if (var9 > 64) {
              if (var9 > 512) {
                var9 = 512;
              }
            } else {
              var9 = 64;
            }
            var9 = b.a(var9, (byte) -101);
            jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
            for (var10 = -var9 + 16384; var10 > 0; var10 = var10 - var9) {
              jaggl.OpenGL.glVertex2f(var6 + (float)param2 * hu.field_c[var10], (float)param2 * hu.field_b[var10] + var7);
            }
            jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
            jaggl.OpenGL.glEnd();
            return;
          }
          jaggl.OpenGL.glEnable(2832);
          jaggl.OpenGL.glPointSize((float)var8);
          jaggl.OpenGL.glBegin(0);
          jaggl.OpenGL.glVertex2f(var6, var7);
          jaggl.OpenGL.glEnd();
          jaggl.OpenGL.glDisable(2832);
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
        ks dupTemp$4 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 0) {
            return;
          }
          if (!this.field_hc) {
            if (0 <= this.field_x &&
              param0 == this.field_ub[this.field_x]) {
              fieldTemp$3 = this.field_x;
              this.field_x = this.field_x - 1;
              this.field_ub[fieldTemp$3] = null;
              param0.b((byte) -36);
              if (this.field_x < 0) {
                this.field_Qb = null;
                this.field_t = null;
                return;
              }
              dupTemp$4 = this.field_ub[this.field_x];
              this.field_Qb = dupTemp$4;
              this.field_t = dupTemp$4;
              this.field_t.b(param1 + 13109);
              return;
            }
            throw new RuntimeException();
          }
          this.a(param0, (byte) -38);
          this.a(param0, param1 - 1090);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("cka.TC(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
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
        jaggl.OpenGL.glColor4ub((byte)(param6 >> 16), (byte)(param6 >> 8), (byte)param6, (byte)(param6 >> 24));
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
        if (this.field_gc != param0 ||
          param1 != this.field_Kb ||
          param2 != this.field_Xc) {
          this.field_gc = param0;
          this.field_Xc = param2;
          this.field_Kb = param1;
          this.m(2916);
          this.p((byte) -87);
        }
    }

    private final void a(byte param0) {
        if (this.field_e != 2) {
          this.field_e = 2;
          this.l((byte) -37);
          this.b(false);
          this.field_y = this.field_y & -8;
        }
        if (param0 != -10) {
          this.i();
        }
    }

    final int a(int param0, byte param1) {
        if (param1 > -53) {
          this.field_uc = -62;
        }
        if (param0 != 6406 &&
          param0 != 6409) {
          if (param0 != 6410 &&
            param0 != 34846 &&
            34844 != param0) {
            if (param0 == 6407) {
              return 3;
            }
            if (param0 != 6408 &&
              param0 != 34847) {
              if (param0 == 34843) {
                return 6;
              }
              if (param0 == 34842) {
                return 8;
              }
              if (param0 == 6402) {
                return 3;
              }
              if (param0 != 6401) {
                throw new IllegalArgumentException("");
              }
              return 1;
            }
            return 4;
          }
          return 2;
        }
        return 1;
    }

    final void a(int param0, ob[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          for (var3_int = 0; var3_int < param0; var3_int++) {
            this.field_Dc[var3_int] = param1[var3_int];
          }
          this.field_sb = param0;
          if (this.field_e != 1) {
            this.d(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("cka.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
        if (null == this.field_ad) {
          this.field_R = 0;
          this.field_C = 0;
        } else {
          var2 = this.field_ad.getSize();
          this.field_R = var2.width;
          this.field_C = var2.height;
        }
        if (this.field_Qb == null) {
          this.field_I = this.field_C;
          this.field_Y = this.field_R;
          this.h((byte) -117);
        }
        this.s(3682);
        if (param0 > -68) {
          return;
        }
        this.la();
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
        }
        if (param1 == 5120) {
          return 1;
        }
        if (param1 != 5123 &&
          param1 != 5122) {
          if (param1 != 5125 &&
            param1 != 5124 &&
            param1 != 5126) {
            if (param0 != -10) {
              this.field_Ic = 78;
            }
            throw new IllegalArgumentException("");
          }
          return 4;
        }
        return 2;
    }

    private final void i(byte param0) {
        if (param0 >= -106) {
          this.field_d = true;
        }
        if (1 != this.field_y) {
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
        jaggl.OpenGL.glClearColor((float)(16711680 & param0) / 16711680.0f, (float)(65280 & param0) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final nh a(jpa param0, boolean param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        nh stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
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
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var10 = new int[param0.field_a * param0.field_i];
          var12 = var10;
          var11 = var12;
          var3 = var11;
          var4 = 0;
          var5 = 0;
          if (param0.field_h != null) {
            for (var6_int = 0; param0.field_a > var6_int; var6_int++) {
              for (var7 = 0; param0.field_i > var7; var7++) {
                incrementValue$0 = var5;
                var5++;
                var3[incrementValue$0] = fh.a(param0.field_h[var4] << 24, param0.field_g[sea.c((int) param0.field_f[var4], 255)]);
                var4++;
              }
            }
          } else {
            for (var6_int = 0; param0.field_a > var6_int; var6_int++) {
              for (var7 = 0; var7 < param0.field_i; var7++) {
                incrementValue$1 = var4;
                var4++;
                var8 = param0.field_g[255 & param0.field_f[incrementValue$1]];
                incrementValue$2 = var5;
                var5++;
                stackIn_8_0 = var10;
                stackIn_8_1 = incrementValue$2;
                if (0 != var8) {
                  stackIn_9_2 = fh.a(-16777216, var8);
                } else {
                  stackIn_9_2 = 0;
                }
                stackIn_8_0[stackIn_8_1] = stackIn_9_2;
              }
            }
          }
          var6 = this.a(var12, param0.field_a, 96, param0.field_i, param0.field_i, 0);
          var6.b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
          stackIn_18_0 = var6;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("cka.EB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void o(byte param0) {
        cb discarded$2 = null;
        this.field_vc = new kl[this.field_Ic];
        this.field_lc = new rt(this, 3553, 6408, 1, 1);
        rt discarded$0 = new rt(this, 3553, 6408, 1, 1);
        rt discarded$1 = new rt(this, 3553, 6408, 1, 1);
        this.field_w = new np(this);
        this.field_Nb = new np(this);
        this.field_Ub = new np(this);
        this.field_E = new np(this);
        if (param0 < 17) {
          return;
        }
        this.field_yb = new np(this);
        this.field_i = new np(this);
        this.field_eb = new np(this);
        this.field_sc = new np(this);
        this.field_D = new np(this);
        this.field_Xb = new np(this);
        if (this.field_id) {
          this.field_ic = new cb(this);
          discarded$2 = new cb(this);
        }
    }

    final sca a(int param0, int param1, int param2, boolean param3, byte[] param4) {
        RuntimeException var6 = null;
        sca stackIn_2_0 = null;
        nm stackIn_8_0 = null;
        o stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -49) {
            stackIn_2_0 = (sca) null;
            return stackIn_2_0;
          }
          if (this.field_Q && (!param3 ||
            this.field_bd)) {
            stackIn_8_0 = new nm(this, param2, param4, param1, param3);
            return (sca) ((Object) stackIn_8_0);
          }
          stackIn_10_0 = new o(this, param2, param4, param1);
          return (sca) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("cka.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
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
