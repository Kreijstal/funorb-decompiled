/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class eo extends ha {
    private vna field_ic;
    cn field_I;
    Object field_Ub;
    static fta field_w;
    long field_peer;
    int field_jc;
    hk field_Mb;
    jaclib.memory.heap.NativeHeapBuffer field_o;
    private jaclib.memory.heap.NativeHeap field_t;
    jagex3.graphics2.hw.NativeInterface field_P;
    int field_Hb;
    private Hashtable field_oc;
    int field_X;
    asa field_q;
    int field_Xb;
    boolean field_gb;
    int field_Fb;
    asa field_bb;
    asa field_Y;
    asa field_Qb;
    private asa field_rc;
    private asa field_xc;
    int field_Vb;
    private boolean field_Fc;
    float field_fc;
    boolean field_m;
    int field_C;
    float field_Cb;
    int field_K;
    private boolean field_ab;
    private float[] field_dc;
    boolean field_Nb;
    private int field_Jc;
    float[] field_Gb;
    float field_j;
    int field_J;
    int field_Ic;
    private ld field_eb;
    private boolean field_V;
    int field_Sb;
    private vw field_pb;
    private float field_lc;
    private float[] field_Eb;
    ob[] field_ib;
    boolean field_qc;
    gb field_lb;
    int field_i;
    mla field_r;
    private int field_ac;
    private float[] field_Lb;
    private int field_F;
    ica[] field_db;
    int field_Ac;
    float field_yb;
    float field_zc;
    boolean field_Bb;
    int field_D;
    int field_Dc;
    int field_jb;
    private int field_nb;
    private ni field_kb;
    float field_Kb;
    int field_S;
    float field_H;
    private boolean field_L;
    ura[] field_v;
    int field_k;
    private int field_Lc;
    boolean field_Zb;
    private float field_G;
    private float[] field_vc;
    int field_Bc;
    ica[] field_mc;
    boolean field_l;
    private iva[] field_N;
    private int field_rb;
    iva field_Jb;
    boolean field_Yb;
    float field_pc;
    float[] field_M;
    private int field_kc;
    asa[] field_hc;
    float field_sc;
    private boolean field_s;
    private boolean field_p;
    int field_Gc;
    private int field_qb;
    private int field_Q;
    float field_f;
    int field_bc;
    int field_e;
    boolean field_yc;
    float field_Hc;
    private int field_vb;
    boolean field_x;
    private float[] field_R;
    float field_d;
    private int field_Tb;
    private int field_Rb;
    private float[] field_Ib;
    boolean field_U;
    float[] field_T;
    int field_Kc;
    float field_uc;
    private jaclib.memory.Stream field_y;
    float field_B;
    private int field_u;
    int field_A;
    private boolean field_zb;
    private int field_wb;
    int field_Cc;
    boolean field_wc;
    int field_g;
    boolean field_Ob;
    int field_h;
    private float field_Pb;
    private kp field_Ec;
    private vw[] field_sb;
    gja field_W;
    private asa field_Ab;
    gja field_n;
    gja field_ec;
    private qm field_cb;
    mna field_Db;
    gja field_E;
    gja field_gc;
    private mna field_ub;
    private eja field_z;
    gja field_O;
    mna field_nc;
    mna field_ob;
    private qm field_hb;
    private mna field_mb;
    gja field_fb;
    gja field_cc;
    gja field_tc;
    gja field_tb;
    private qm field_xb;
    private mna field_Z;
    boolean field_Wb;

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        int stackIn_3_0 = 0;
        int var7;
        float var8;
        L0: {
          if (this.field_Tb == param0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          L2: {
            var7 = stackIn_3_0;
            if (var7 != 0) {
              break L2;
            } else {
              if (param1 != this.field_j) {
                break L2;
              } else {
                if (param2 == this.field_pc) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            this.field_j = param1;
            this.field_pc = param2;
            this.field_Tb = param0;
            if (var7 != 0) {
              this.field_Kb = (float)(255 & this.field_Tb) / 255.0f;
              this.field_sc = (float)(16711680 & this.field_Tb) / 16711680.0f;
              this.field_yb = (float)(65280 & this.field_Tb) / 65280.0f;
              this.r(0);
              break L3;
            } else {
              break L3;
            }
          }
          this.field_P.setSunColour(this.field_sc, this.field_yb, this.field_Kb, param1, param2);
          this.v(86);
          break L1;
        }
        L4: {
          L5: {
            if (this.field_Eb[0] != param3) {
              break L5;
            } else {
              if (param4 != this.field_Eb[1]) {
                break L5;
              } else {
                if (this.field_Eb[2] != param5) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
          }
          this.field_Eb[1] = param4;
          this.field_Eb[2] = param5;
          this.field_Eb[0] = param3;
          this.field_dc[0] = -param3;
          this.field_dc[2] = -param5;
          this.field_dc[1] = -param4;
          var8 = (float)(1.0 / Math.sqrt((double)(param5 * param5 + (param3 * param3 + param4 * param4))));
          this.field_Gb[2] = var8 * param5;
          this.field_Gb[1] = var8 * param4;
          this.field_Gb[0] = param3 * var8;
          this.field_M[0] = -this.field_Gb[0];
          this.field_M[1] = -this.field_Gb[1];
          this.field_M[2] = -this.field_Gb[2];
          this.field_P.setSunDirection(this.field_Gb[0], this.field_Gb[1], this.field_Gb[2]);
          this.i(-88);
          break L4;
        }
        this.q((byte) -78);
    }

    abstract void a(fp param0, int param1, boolean param2, int param3);

    abstract void h(boolean param0);

    final void j(byte param0) {
        if (param0 != 102) {
            this.field_o = (jaclib.memory.heap.NativeHeapBuffer) null;
        }
        if (!(this.field_rb == 16)) {
            this.G(22);
            this.b(true, -69);
            this.f(0, true);
            this.b(true, (byte) 81);
            this.c(1, 1);
            this.field_rb = 16;
        }
    }

    final void J(int param0) {
        mla var2 = null;
        if (this.field_r != nr.field_d) {
            var2 = this.field_r;
            this.field_r = nr.field_d;
            if (var2.a(-101)) {
                this.v((byte) 94);
            }
            this.P(0);
            this.field_T = this.field_Lb;
            this.l((byte) 26);
            this.field_rb = this.field_rb & -25;
        }
        if (param0 != 19822) {
            this.r(87);
        }
    }

    final za a(int param0) {
        to var2 = new to(param0);
        this.field_ic.b((byte) -68, var2);
        return (za) ((Object) var2);
    }

    final void c(int param0, int param1) {
        gb var3;
        int var4;
        int var5;
        int var6;
        int stackIn_11_0 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 == this.field_wb) {
            break L0;
          } else {
            L1: {
              if (1 == param0) {
                var3 = dfa.field_b;
                var5 = 1;
                var4 = 1;
                break L1;
              } else {
                if (2 == param0) {
                  var4 = 1;
                  var5 = 0;
                  var3 = mp.field_a;
                  break L1;
                } else {
                  if ((param0 ^ -1) != -129) {
                    var4 = 0;
                    var5 = 0;
                    var3 = vv.field_q;
                    break L1;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    var3 = bma.field_w;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (var5 != 0) {
                stackIn_11_0 = 0;
                break L2;
              } else {
                stackIn_11_0 = 1;
                break L2;
              }
            }
            L3: {
              if (stackIn_11_0 != (this.field_m ? 1 : 0)) {
                break L3;
              } else {
                L4: {
                  stackIn_14_0 = this;

                  if (var5 == 0) {
                    stackIn_15_0 = this;
                    stackIn_15_1 = 0;
                    break L4;
                  } else {
                    stackIn_15_0 = this;
                    stackIn_15_1 = 1;
                    break L4;
                  }
                }
                ((eo) (this)).field_m = stackIn_15_1 != 0;
                this.w(param1 ^ -128);
                break L3;
              }
            }
            L5: {
              if (var4 != (this.field_Yb ? 1 : 0)) {
                L6: {
                  stackIn_20_0 = this;

                  if (var4 == 0) {
                    stackIn_21_0 = this;
                    stackIn_21_1 = 0;
                    break L6;
                  } else {
                    stackIn_21_0 = this;
                    stackIn_21_1 = 1;
                    break L6;
                  }
                }
                ((eo) (this)).field_Yb = stackIn_21_1 != 0;
                this.M(-27581);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (var3 == this.field_lb) {
                break L7;
              } else {
                this.field_lb = var3;
                this.b(false);
                break L7;
              }
            }
            this.field_rb = this.field_rb & -29;
            this.field_wb = param0;
            break L0;
          }
        }
        L8: {
          if (param1 == 1) {
            break L8;
          } else {
            this.field_fc = 1.0839076042175293f;
            break L8;
          }
        }
    }

    final void a(int param0, boolean param1, fp param2) {
        try {
            this.a(param2, 15802, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eo.QH(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void k() {
        vg var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!this.field_Fc) {
            var1 = this.field_ic.f(-80);
            while (var1 != null) {
                ((to) ((Object) var1)).b((byte) 30);
                var1 = this.field_ic.e(110);
            }
            var1_ref = this.field_oc.keys();
            while (var1_ref.hasMoreElements()) {
                var2 = (java.awt.Canvas) (var1_ref.nextElement());
                this.a(this.field_oc.get(var2), false, var2);
            }
            rpa.a(true, false, true);
            this.field_P.release();
            this.field_Fc = true;
        }
    }

    abstract void w(int param0);

    final gda b() {
        return (gda) ((Object) new asa());
    }

    final void a(byte param0, int param1) {
        int var3;
        int var4;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var3 = 14 % ((param0 - 61) / 46);
          if (-2 != (param1 ^ -1)) {
            if (-1 != (param1 ^ -1)) {
              if (-3 == (param1 ^ -1)) {
                this.a(ln.field_F, (byte) -110, r.field_m);
                break L0;
              } else {
                if (-4 != (param1 ^ -1)) {
                  if (-5 != (param1 ^ -1)) {
                    break L0;
                  } else {
                    this.a(gq.field_w, (byte) -110, gq.field_w);
                    break L0;
                  }
                } else {
                  this.a(iw.field_c, (byte) -110, jv.field_m);
                  break L0;
                }
              }
            } else {
              this.a(iw.field_c, (byte) -110, iw.field_c);
              break L0;
            }
          } else {
            this.a(ln.field_F, (byte) -110, ln.field_F);
            break L0;
          }
        }
    }

    abstract void I(int param0);

    abstract boolean a(una param0, int param1, ft param2);

    final void H(int param0) {
        if (4 != this.field_rb) {
            this.J(19822);
            this.b(false, -52);
            this.d(0, false);
            this.f(0, false);
            this.b(false, (byte) 81);
            this.a((byte) -80, false, false, -2);
            this.c(1, 1);
            this.a((byte) -68, 0);
            this.field_rb = 4;
        }
        if (param0 >= -104) {
            this.field_peer = 17L;
        }
    }

    final void a(float param0, int param1) {
        if (param1 != -229) {
            this.field_cb = (qm) null;
        }
        if (!(param0 == this.field_Pb)) {
            this.field_Pb = param0;
            this.R(param1 ^ -229);
        }
    }

    final static boolean d(int param0, int param1) {
        int var2 = 74 / ((-6 - param0) / 32);
        return param1 >= 2 ? true : false;
    }

    private final void G(int param0) {
        mla var2_ref_mla = null;
        if (this.field_r != cha.field_d) {
            var2_ref_mla = this.field_r;
            this.field_r = cha.field_d;
            if (!(var2_ref_mla.a(-114))) {
                this.v((byte) 94);
            }
            this.t((byte) 83);
            this.field_T = this.field_Ib;
            this.l((byte) 26);
            this.field_rb = this.field_rb & -8;
        }
        int var2 = 110 % ((-25 - param0) / 46);
    }

    abstract void i(int param0);

    abstract Object a(boolean param0, java.awt.Canvas param1);

    final void d(int param0, boolean param1) {
        if (!(this.field_l == param1)) {
            this.field_l = param1 ? true : false;
            this.h((byte) -102);
            this.field_rb = this.field_rb & -8;
        }
        if (param0 != 0) {
            this.field_Pb = 0.3918037712574005f;
        }
    }

    abstract eja a(int param0, boolean param1);

    abstract void q(byte param0);

    private final void l(byte param0) {
        if (param0 != 26) {
            this.field_Yb = true;
        }
        this.e((byte) 119);
        if (!(null == this.field_pb)) {
            this.field_pb.b(param0 + 62);
        }
    }

    final void b(boolean param0, byte param1) {
        if (!(this.field_qc == param0)) {
            this.field_qc = param0 ? true : false;
            this.b((byte) -128);
            this.field_rb = this.field_rb & -32;
        }
        if (param1 != 81) {
            this.field_e = 64;
        }
    }

    private final void j(int param0) {
        if (param0 != -30801) {
            return;
        }
        this.field_R[10] = this.field_lc;
        this.field_R[14] = this.field_G;
        this.field_d = ((float)(-this.field_k) + this.field_R[14]) / this.field_R[10];
    }

    final void F(int param0) {
        this.field_gb = false;
        if (param0 != -1662) {
            this.field_Wb = true;
        }
        this.o(16);
    }

    final nh a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        gh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = new gh((eo) (this), param3, param4, param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("eo.C(");

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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (nh) ((Object) stackIn_1_0);
    }

    final void O(int param0) {
        mla var2 = null;
        if (param0 != 256) {
            this.j(-116);
        }
        if (!(tb.field_p == this.field_r)) {
            var2 = this.field_r;
            this.field_r = tb.field_p;
            if (!(!var2.a(-65))) {
                this.v((byte) 94);
            }
            this.field_rb = this.field_rb & -32;
            this.field_T = this.field_vc;
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.a(param0, param1, param0 + param2, param1, param3, param4);
    }

    private final void o(int param0) {
        float var2 = 0.0f;
        if (param0 != 16) {
            this.b(107);
        }
        if (nr.field_d == this.field_r) {
            var2 = this.c((byte) -61);
            this.field_q.a(var2, param0 ^ -128, var2, 0.0f);
        }
        this.field_p = false;
        this.z((byte) -73);
        if (!(this.field_pb == null)) {
            this.field_pb.b((byte) 107);
        }
    }

    abstract void B(byte param0);

    final gda e() {
        return (gda) ((Object) this.field_Ab);
    }

    abstract void e(boolean param0);

    final int d(boolean param0) {
        if (param0) {
            return 107;
        }
        return this.field_vb;
    }

    public static void x(byte param0) {
        if (param0 != 3) {
            return;
        }
        field_w = null;
    }

    abstract void r(int param0);

    abstract void v(int param0);

    private final void t(byte param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float var8;
        float[] var10;
        int[] var9;
        L0: {
          if (!this.field_ab) {
            L1: {
              L2: {
                var10 = this.field_Ib;
                var2 = var10;
                var3 = (float)this.field_D;
                var4 = (float)this.field_k;
                var5 = (float)(-this.field_kc) * this.field_Pb / (float)this.field_h;
                var6 = this.field_Pb * (float)(-this.field_Q) / (float)this.field_Ic;
                var7 = (float)(-this.field_Q + this.field_Hb) * this.field_Pb / (float)this.field_Ic;
                var8 = (float)(-this.field_kc + this.field_jc) * this.field_Pb / (float)this.field_h;
                if (var6 == var7) {
                  break L2;
                } else {
                  if (var8 != var5) {
                    var2[11] = 0.0f;
                    var2[6] = 0.0f;
                    var2[12] = (var7 + var6) / (var6 - var7);
                    var2[10] = 1.0f / (var3 - var4);
                    var2[9] = 0.0f;
                    var2[14] = var3 / (var3 - var4);
                    var2[0] = 2.0f / (-var6 + var7);
                    var2[3] = 0.0f;
                    var2[1] = 0.0f;
                    var2[4] = 0.0f;
                    var2[7] = 0.0f;
                    var2[15] = 1.0f;
                    var2[5] = 2.0f / (-var5 + var8);
                    var2[2] = 0.0f;
                    var2[8] = 0.0f;
                    var2[13] = (var8 + var5) / (var8 - var5);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var10[14] = 0.0f;
              var10[3] = 0.0f;
              var10[6] = 0.0f;
              var10[5] = 1.0f;
              var10[15] = 1.0f;
              var10[4] = 0.0f;
              var10[1] = 0.0f;
              var10[2] = 0.0f;
              var10[11] = 0.0f;
              var10[10] = 1.0f;
              var10[12] = 0.0f;
              var10[9] = 0.0f;
              var10[0] = 1.0f;
              var10[8] = 0.0f;
              var10[13] = 0.0f;
              var10[7] = 0.0f;
              break L1;
            }
            this.L(param0 + -73);
            this.field_ab = true;
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == 83) {
            break L3;
          } else {
            var9 = (int[]) null;
            this.da(-58, 96, -43, (int[]) null);
            break L3;
          }
        }
    }

    private final void L(int param0) {
        this.field_Cb = (float)this.field_k;
        if (param0 != 10) {
            int[] var3 = (int[]) null;
            this.da(-108, 67, -5, (int[]) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
    }

    final gf a(boolean param0, int param1, boolean param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        gf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.c(-115);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param4, 0, param2, param3, 0, param1, 75);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("eo.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final asa E(int param0) {
        if (param0 < 1) {
            this.field_Jb = (iva) null;
        }
        return this.field_Qb;
    }

    final na n(int param0) {
        int var2 = -92 / ((-33 - param0) / 36);
        if (this.field_eb == null) {
            return null;
        }
        return this.field_eb.b(68);
    }

    final void xa(float param0) {
        if (!(this.field_fc == param0)) {
            this.field_fc = param0;
            this.field_P.setAmbient(param0);
            this.r(0);
            this.q((byte) -78);
        }
    }

    final void s(int param0) {
        if (this.field_rb != 8) {
            this.A((byte) -74);
            this.b(true, -91);
            this.f(0, true);
            this.b(true, (byte) 81);
            this.c(1, 1);
            this.field_rb = 8;
        }
        if (param0 != 11) {
            field_w = (fta) null;
        }
    }

    abstract void f(int param0);

    abstract void a(dn param0, byte param1);

    abstract void a(Object param0, boolean param1, java.awt.Canvas param2);

    private final void P(int param0) {
        float[] var2;
        float[] var3;
        if (param0 == 0) {
          L0: {
            if (this.field_zb) {
              break L0;
            } else {
              L1: {
                var3 = this.field_Lb;
                var2 = var3;
                this.field_zb = true;
                if (0 == this.field_Hb) {
                  break L1;
                } else {
                  if (-1 == (this.field_jc ^ -1)) {
                    break L1;
                  } else {
                    var3[6] = 0.0f;
                    var3[8] = 0.0f;
                    var3[7] = 0.0f;
                    var3[3] = 0.0f;
                    var3[12] = -1.0f;
                    var3[10] = 0.5f;
                    var3[4] = 0.0f;
                    var3[13] = 1.0f;
                    var3[11] = 0.0f;
                    var3[15] = 1.0f;
                    var3[0] = 2.0f / (float)this.field_Hb;
                    var3[9] = 0.0f;
                    var3[14] = 0.5f;
                    var3[1] = 0.0f;
                    var3[5] = -2.0f / (float)this.field_jc;
                    var3[2] = 0.0f;
                    break L0;
                  }
                }
              }
              var2[10] = 1.0f;
              var2[11] = 0.0f;
              var2[6] = 0.0f;
              var2[13] = 0.0f;
              var2[5] = 1.0f;
              var2[4] = 0.0f;
              var2[2] = 0.0f;
              var2[15] = 1.0f;
              var2[12] = 0.0f;
              var2[7] = 0.0f;
              var2[3] = 0.0f;
              var2[14] = 0.0f;
              var2[1] = 0.0f;
              var2[8] = 0.0f;
              var2[9] = 0.0f;
              var2[0] = 1.0f;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        int stackIn_10_0 = 0;
        int var8;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          param4 = param4 & this.p(-112);
          if (param5 == -25) {
            break L0;
          } else {
            this.field_eb = (ld) null;
            break L0;
          }
        }
        L1: {
          if (param4) {
            break L1;
          } else {
            L2: {
              if ((param0 ^ -1) == -5) {
                break L2;
              } else {
                if (8 == param0) {
                  break L2;
                } else {
                  if (-10 == (param0 ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              param0 = 2;
              if ((param0 ^ -1) != -5) {
                stackIn_10_0 = 1;
                break L3;
              } else {
                stackIn_10_0 = param1 & 1;
                break L3;
              }
            }
            param2 = stackIn_10_0;
            param1 = 0;
            break L1;
          }
        }
        L4: {
          if (param0 == 0) {
            break L4;
          } else {
            if (param3) {
              param0 = param0 | -2147483648;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (this.field_qb == param0) {
            L6: {
              if (this.field_qb == 0) {
                break L6;
              } else {
                L7: {
                  this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                  if (this.field_Lc != param1) {
                    break L7;
                  } else {
                    if (this.field_Rb != param2) {
                      break L7;
                    } else {
                      break L5;
                    }
                  }
                }
                this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                this.field_Rb = param2;
                this.field_Lc = param1;
                break L6;
              }
            }
            break L5;
          } else {
            L8: {
              if (0 == this.field_qb) {
                break L8;
              } else {
                this.field_sb[this.field_qb & 2147483647].a(-79);
                break L8;
              }
            }
            L9: {
              if (param0 == 0) {
                this.field_pb = null;
                break L9;
              } else {
                this.field_pb = this.field_sb[2147483647 & param0];
                this.field_pb.a(-112, param3);
                this.field_pb.a(param3, 5744);
                this.field_pb.a((byte) 55, param1, param2);
                break L9;
              }
            }
            this.field_qb = param0;
            this.field_Rb = param2;
            this.field_Lc = param1;
            break L5;
          }
        }
    }

    final asa y(byte param0) {
        if (param0 != -77) {
            this.field_pb = (vw) null;
        }
        return this.field_q;
    }

    vw e(int param0, int param1) {
        int var3;
        int var4;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param1 > 37) {
            break L0;
          } else {
            this.field_Qb = (asa) null;
            break L0;
          }
        }
        var3 = param0;
        if (6 != var3) {
          if (-2 == (var3 ^ -1)) {
            return (vw) ((Object) new em((eo) (this)));
          } else {
            if ((var3 ^ -1) != -3) {
              if ((var3 ^ -1) != -8) {
                return (vw) ((Object) new vu((eo) (this)));
              } else {
                return (vw) ((Object) new sl((eo) (this)));
              }
            } else {
              return (vw) ((Object) new fn((eo) (this), this.field_Mb));
            }
          }
        } else {
          return (vw) ((Object) new vta((eo) (this)));
        }
    }

    final void a(int param0, ob[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param0) {
                L2: {
                  this.field_Bc = param0;
                  if (this.field_r.a(-89)) {
                    this.g((byte) 92);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                this.field_ib[var3_int] = param1[var3_int];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("eo.JB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    void c(int param0) {
        if (null != this.field_Ec) {
            this.field_Ec.a(5);
        }
        this.field_Dc = param0 & 2147483647;
    }

    final void b(boolean param0, int param1) {
        if (!(this.field_Bb == param0)) {
            this.field_Bb = param0 ? true : false;
            this.D(2);
            this.field_rb = this.field_rb & -32;
        }
        if (param1 >= -51) {
            this.field_Bb = false;
        }
    }

    final jaclib.memory.heap.NativeHeapBuffer a(boolean param0, int param1, boolean param2) {
        if (param0) {
            return (jaclib.memory.heap.NativeHeapBuffer) null;
        }
        return this.field_t.a(param1, param2);
    }

    private final void A(byte param0) {
        mla var2 = null;
        if (param0 != -74) {
            this.field_T = (float[]) null;
        }
        if (coa.field_s != this.field_r) {
            var2 = this.field_r;
            this.field_r = coa.field_s;
            if (!var2.a(-109)) {
                this.v((byte) 94);
            }
            this.x(7);
            this.field_T = this.field_R;
            this.l((byte) 26);
            this.field_rb = this.field_rb & -8;
        }
    }

    final void g(int param0, int param1) {
        if (param0 != 3625) {
            return;
        }
        if (this.field_bc != param1) {
            this.field_bc = param1;
            this.N(-95);
        }
    }

    final static roa D(byte param0) {
        roa var1 = new roa();
        var1.field_f = new up(0, 5);
        var1.field_f.b(1, 11);
        var1.field_c = true;
        var1.field_d = 0;
        var1.field_p = -1;
        var1.field_n = 655360;
        var1.field_h = 25;
        var1.field_k = 150;
        var1.field_o = 26;
        var1.field_t = 27;
        if (param0 >= -14) {
            return (roa) null;
        }
        var1.field_b = 0;
        return var1;
    }

    abstract void f(byte param0);

    final int[] Y() {
        return new int[]{this.field_Q, this.field_kc, this.field_Ic, this.field_h};
    }

    final void K(int[] param0) {
        try {
            param0[3] = this.field_jb;
            param0[1] = this.field_K;
            param0[2] = this.field_C;
            param0[0] = this.field_A;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eo.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final float[] a(float[] param0, boolean param1) {
        RuntimeException var3 = null;
        float[] stackIn_2_0 = null;
        float[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0[12] = this.field_T[3];
            param0[0] = this.field_T[0];
            param0[4] = this.field_T[1];
            param0[8] = this.field_T[2];
            if (!param1) {
              param0[5] = this.field_T[5];
              param0[9] = this.field_T[6];
              param0[13] = this.field_T[7];
              param0[2] = this.field_T[8];
              param0[1] = this.field_T[4];
              param0[10] = this.field_T[10];
              param0[14] = this.field_T[11];
              param0[6] = this.field_T[9];
              param0[7] = this.field_T[13];
              param0[3] = this.field_T[12];
              param0[15] = this.field_T[15];
              param0[11] = this.field_T[14];
              stackIn_4_0 = (float[]) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (float[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("eo.JG(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract void u(byte param0);

    final void i(byte param0) {
        this.field_q.a();
        this.field_gb = true;
        this.o(16);
        if (param0 < 97) {
            this.a(36, false);
        }
    }

    private final void B(int param0) {
        if (param0 != -7840) {
            this.field_mb = (mna) null;
        }
        if (!(this.field_pb == null)) {
            this.field_pb.a(true);
        }
        this.I(1);
    }

    abstract void z(int param0);

    abstract void z(byte param0);

    abstract qm c(int param0, boolean param1);

    private final void R(int param0) {
        if (param0 != 0) {
            return;
        }
        this.field_ab = false;
        this.t((byte) 83);
        if (!(this.field_r != cha.field_d)) {
            this.l((byte) 26);
        }
    }

    private final void k(int param0) {
        this.field_s = false;
        this.x(7);
        if (param0 != -19320) {
            this.field_Mb = (hk) null;
        }
        if (this.field_r == coa.field_s) {
            this.l((byte) 26);
        }
    }

    final void a(fp param0, int param1, int param2) {
        try {
            this.a(param0, param1, -6219, false, false);
            if (param2 >= -13) {
                this.field_qb = 22;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eo.GF(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(gda param0) {
        try {
            this.field_bb = (asa) ((Object) param0);
            this.field_Qb.a(this.field_bb, 1);
            this.field_Qb.a((byte) 42);
            this.field_rc.a((gda) (this.field_Qb), (byte) 127);
            this.field_Y.a((gda) (this.field_bb), (byte) -31);
            if (this.field_r.a(-38)) {
                this.v((byte) 94);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eo.W(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.g(114);
        this.g(3625, param4);
        this.a(pea.field_c, 0, -117);
        this.a(0, false, pea.field_c);
        this.c(param5, 1);
        this.field_q.a(1.0f, (float)param2, false, (float)param3);
        this.field_q.a(param0, param1, 0);
        this.F(-1662);
        this.b(1, false);
        this.y(2);
        this.b(1, true);
        this.a(0, false, ej.field_c);
        this.a(ej.field_c, 0, -119);
    }

    private final void f(boolean param0) {
        this.field_cb = this.c(6, param0);
        this.field_cb.a(24, 12, param0);
        this.field_mb = this.a(new ne[]{new ne(gj.field_p)}, 0);
    }

    final void a(boolean param0, int param1) {
        this.field_Nb = param0 ? true : false;
        this.b((byte) 117);
        if (param1 != 0) {
            this.field_S = -102;
        }
    }

    abstract void M(int param0);

    final void y(int param0) {
        this.a(vs.field_T, (byte) -32, param0);
    }

    final int Q(int param0) {
        if (param0 != 10) {
            this.xa(-0.16009120643138885f);
        }
        return this.field_X - -this.field_Xb - -this.field_Fb;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_kc = param1;
        this.field_Ic = param2;
        this.field_Q = param0;
        this.field_h = param3;
        this.R(0);
        this.k(-19320);
        this.O(256);
        this.r((byte) -115);
    }

    final void HA(int param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException runtimeException = null;
        float var6_float = 0.0f;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6_float = this.field_bb.a((float)param2, (float)param0, (byte) -105, (float)param1);
              if ((float)this.field_D > var6_float) {
                break L1;
              } else {
                if (var6_float > (float)this.field_k) {
                  break L1;
                } else {
                  var7 = (int)((float)this.field_Ic * this.field_bb.a(1, (float)param0, (float)param1, (float)param2) / (float)param3);
                  var8 = (int)((float)this.field_h * this.field_bb.a((float)param0, (float)param2, (float)param1, (byte) 123) / (float)param3);
                  param4[1] = (int)((float)var8 - this.field_zc);
                  param4[2] = (int)var6_float;
                  param4[0] = (int)(-this.field_f + (float)var7);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            var7_ref_int__ = param4;
            var8_ref_int__ = param4;
            param4[2] = -1;
            var8_ref_int__[1] = -1;
            var7_ref_int__[0] = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("eo.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        this.g(118);
        this.g(3625, param3);
        this.a(pea.field_c, 0, -71);
        this.a(0, false, pea.field_c);
        this.c(param4, 1);
        this.field_q.a(1.0f, (float)param2, false, (float)param2);
        this.field_q.a(param0, param1, 0);
        this.F(-1662);
        this.b(1, false);
        this.a(-125, 0, this.field_hb);
        this.a(this.field_Z, -32);
        this.a(256, di.field_d, 1, 0);
        this.b(1, true);
        this.a(0, false, ej.field_c);
        this.a(ej.field_c, 0, -104);
    }

    final void a(byte param0, boolean param1, boolean param2, int param3) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        dw var10;
        int var11;
        int var12;
        asa var13;
        int var14;
        L0: {
          L1: {
            var14 = TombRacer.field_G ? 1 : 0;
            if (param3 != this.field_Jc) {
              break L1;
            } else {
              L2: {
                stackIn_3_0 = this.field_L;

                if (this.field_V) {
                  stackIn_4_0 = stackIn_3_0;
                  stackIn_4_1 = 0;
                  break L2;
                } else {
                  stackIn_4_0 = stackIn_3_0;
                  stackIn_4_1 = 1;
                  break L2;
                }
              }
              if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
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
            if (this.field_L) {
              stackIn_8_0 = 3;
              break L3;
            } else {
              stackIn_8_0 = 0;
              break L3;
            }
          }
          L4: {
            var9 = stackIn_8_0;
            if ((param3 ^ -1) <= -1) {
              L5: {
                L6: {
                  var5 = this.field_Ec.a(param3, 111);
                  var10 = this.field_c.a((byte) -47, param3);
                  if (0 != var10.field_s) {
                    break L6;
                  } else {
                    if (var10.field_o != 0) {
                      break L6;
                    } else {
                      this.p((byte) -80);
                      break L5;
                    }
                  }
                }
                L7: {
                  if (!var10.field_g) {
                    stackIn_16_0 = 128;
                    break L7;
                  } else {
                    stackIn_16_0 = 64;
                    break L7;
                  }
                }
                var11 = stackIn_16_0;
                var12 = 50 * var11;
                var13 = this.C(0);
                var13.a((byte) 126, (float)(var10.field_o * (this.field_Dc % var12)) / (float)var12, 0.0f, (float)(var10.field_s * (this.field_Dc % var12)) / (float)var12);
                this.a(pfa.field_i, false);
                break L5;
              }
              var6 = var10.field_q;
              if (!this.field_L) {
                var7 = var10.field_a;
                var9 = var10.field_h;
                var8 = var10.field_t;
                break L4;
              } else {
                break L4;
              }
            } else {
              this.p((byte) 88);
              break L4;
            }
          }
          L8: {
            this.a(var9, var7, var8, param1, param2, -25);
            if (null == this.field_pb) {
              this.a(true, (iva) (var5));
              this.a((byte) -37, var6);
              break L8;
            } else {
              this.field_pb.a(var6, (iva) (var5), 24595);
              break L8;
            }
          }
          this.field_Jc = param3;
          this.field_V = this.field_L;
          break L0;
        }
        L9: {
          this.field_rb = this.field_rb & -8;
          if (param0 == -80) {
            break L9;
          } else {
            this.field_Tb = 57;
            break L9;
          }
        }
    }

    final void a(boolean param0, iva param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_N[this.field_Cc] == param1) {
                break L1;
              } else {
                L2: {
                  this.field_N[this.field_Cc] = param1;
                  if (param1 != null) {
                    param1.b((byte) 89);
                    break L2;
                  } else {
                    this.d(1);
                    break L2;
                  }
                }
                this.field_rb = this.field_rb & -2;
                break L1;
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                this.field_wb = 77;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("eo.LF(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    abstract gf a(int[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6);

    final void a(asa param0, byte param1) {
        try {
            this.field_q.a(param0, 1);
            this.field_gb = false;
            int var3_int = 127 % ((param1 - 23) / 33);
            this.o(16);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eo.IG(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        if (param0 < 105) {
            return;
        }
        if (!(this.field_rb == 1)) {
            this.J(19822);
            this.b(false, -63);
            this.d(0, false);
            this.f(0, false);
            this.b(false, (byte) 81);
            this.a((byte) -80, false, false, -2);
            this.a((byte) 118, 1);
            this.a(true, this.field_Jb);
            this.field_rb = 1;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7;
        float var8;
        float var9;
        L0: {
          L1: {
            var7 = (float)(-param0) + (float)param2;
            var8 = (float)(-param1) + (float)param3;
            if (0.0f != var7) {
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
          var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var7 = var7 * var9;
          var8 = var8 * var9;
          break L0;
        }
        if (this.a((float)param1, 0.0f, (float)param2 + var7, (float)param3 + var8, 0.0f, (float)param0, (byte) 126)) {
          this.g(121);
          this.g(3625, param4);
          this.a(pea.field_c, 0, -61);
          this.a(0, false, pea.field_c);
          this.c(param5, 1);
          this.i((byte) 106);
          this.b(1, false);
          this.C((byte) -70);
          this.b(1, true);
          this.a(0, false, ej.field_c);
          this.a(ej.field_c, 0, -77);
          return;
        } else {
          return;
        }
    }

    final int A(int param0) {
        if (param0 != -2903) {
            return 28;
        }
        return this.field_nb;
    }

    final void a(byte param0, boolean param1) {
        if ((!param1 ? 1 : 0) == (this.field_U ? 1 : 0)) {
            this.field_U = param1 ? true : false;
            this.D(2);
        }
        if (param0 <= 42) {
            this.field_Yb = true;
        }
    }

    abstract lv a(byte[] param0, ft param1, byte param2, int param3, int param4, int param5);

    abstract void N(int param0);

    abstract void b(boolean param0);

    final gf a(float[] param0, ft param1, boolean param2, boolean param3, int param4, int param5) {
        RuntimeException var7 = null;
        ft var8 = null;
        gf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                var8 = (ft) null;
                this.a((float[]) null, (ft) null, false, false, 69, -89);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, 0, 0, param3, param4, 0, param0, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("eo.FF(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    abstract void D(int param0);

    abstract void d(byte param0);

    private final boolean a(float param0, float param1, float param2, float param3, float param4, float param5, byte param6) {
        jaclib.memory.Buffer var11 = this.field_cb.a(-15730, true);
        if (var11 == null) {
            return false;
        }
        jaclib.memory.Stream var9 = this.a(var11, 125);
        if (jaclib.memory.Stream.b()) {
            var9.b(param5);
            var9.b(param0);
            var9.b(param1);
            var9.b(param2);
            var9.b(param3);
            var9.b(param4);
        } else {
            var9.a(param5);
            var9.a(param0);
            var9.a(param1);
            var9.a(param2);
            var9.a(param3);
            var9.a(param4);
        }
        var9.a();
        int var10 = 16 % ((param6 - 72) / 44);
        return this.field_cb.a(true);
    }

    abstract void b(byte param0);

    private final void C(byte param0) {
        this.a(-126, 0, this.field_cb);
        if (param0 != -70) {
            this.e((byte) -46);
        }
        this.a(this.field_mb, -32);
        this.a(1, io.field_c, 0, param0 + 70);
    }

    final void da(int param0, int param1, int param2, int[] param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        float var7 = 0.0f;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var7 = this.field_bb.a((float)param2, (float)param0, (byte) -50, (float)param1);
                if (var7 < -0.0078125f) {
                  break L2;
                } else {
                  if (0.0078125f < var7) {
                    break L2;
                  } else {
                    var6 = this.field_kc;
                    var5_int = this.field_Q;
                    break L1;
                  }
                }
              }
              var5_int = (int)((float)this.field_Ic * this.field_bb.a(1, (float)param0, (float)param1, (float)param2) / var7);
              var6 = (int)((float)this.field_h * this.field_bb.a((float)param0, (float)param2, (float)param1, (byte) 126) / var7);
              break L1;
            }
            param3[0] = (int)((float)var5_int - this.field_f);
            param3[2] = (int)var7;
            param3[1] = (int)((float)var6 - this.field_zc);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("eo.da(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void p(byte param0) {
        if (od.field_h != this.field_v[this.field_Cc]) {
            this.field_v[this.field_Cc] = od.field_h;
            this.field_hc[this.field_Cc].a();
            this.u(0);
        }
        int var2 = -62 % ((param0 - 28) / 46);
    }

    final void s(byte param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        Hashtable var2 = new Hashtable();
        if (this.field_oc != null && !this.field_oc.isEmpty()) {
            var3 = this.field_oc.keys();
            while (var3.hasMoreElements()) {
                var4 = (java.awt.Canvas) (var3.nextElement());
                var2.put(var4, this.a(false, var4));
            }
        }
        if (param0 != 6) {
            return;
        }
        this.field_oc = var2;
        this.l(param0 ^ 138);
        this.f(true);
        this.E((byte) 15);
        this.field_kb.a(-120, (eo) (this));
    }

    private final void l(int param0) {
        int var2;
        jaclib.memory.Buffer var3;
        int var5;
        jaclib.memory.Stream var4;
        var5 = TombRacer.field_G ? 1 : 0;
        this.field_xb = this.c(6, false);
        this.field_xb.a(param0, 28, true);
        var2 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= 4) {
              break L1;
            } else {
              var3 = this.field_xb.a(param0 + -15870, true);
              if (var3 != null) {
                L2: {
                  var4 = this.a(var3, param0 + -14);
                  if (!jaclib.memory.Stream.b()) {
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    break L2;
                  } else {
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    break L2;
                  }
                }
                var4.a();
                if (this.field_xb.a(true)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
          this.field_ub = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n, gj.field_n})}, 0);
          return;
        }
    }

    final void L(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (this.field_g != param0) {
              break L1;
            } else {
              if (this.field_J != param1) {
                break L1;
              } else {
                if (param2 != this.field_Ac) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          this.field_J = param1;
          this.field_Ac = param2;
          this.field_g = param0;
          this.B(-7840);
          this.D(2);
          break L0;
        }
    }

    abstract void a(eja param0, int param1, int param2, int param3, iw param4, int param5, int param6);

    private final boolean p(int param0) {
        if (param0 > -41) {
            iw var3 = (iw) null;
            this.a(-55, (iw) null, 17, -88);
        }
        return this.field_sb[3].c(1185);
    }

    void h(int param0) {
        if (param0 != -29040) {
            this.U(-18, -45, 101, 121, 112);
        }
        this.m((byte) 97);
    }

    abstract void d(int param0);

    final void a(boolean param0, byte param1) {
        if (param1 < 53) {
            return;
        }
        if (!((!param0 ? 1 : 0) != (this.field_yc ? 1 : 0))) {
            this.field_yc = param0 ? true : false;
            this.h((byte) -102);
        }
    }

    abstract void a(int param0, byte param1);

    final asa c(boolean param0) {
        if (!param0) {
            this.field_zb = true;
        }
        return this.field_rc;
    }

    private final void a(iw param0, byte param1, int param2) {
        try {
            this.a(-128, 0, this.field_xb);
            this.a(this.field_ub, -32);
            this.a(param2, param0, 0, 0);
            if (param1 != -32) {
                this.u(-14);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eo.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract gf a(int param0, int param1, ft param2, byte param3, una param4);

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = this.c((byte) -76);
        this.g(119);
        this.g(3625, param4);
        this.a(pea.field_c, 0, -126);
        this.a(0, false, pea.field_c);
        this.c(param5, 1);
        this.field_q.a(1.0f, (float)(param2 + -1), false, (float)(param3 - 1));
        this.field_q.a(-var7 + (float)param1, -39, (float)param0 - var7, 0.0f);
        this.F(-1662);
        this.b(1, false);
        this.a(di.field_d, (byte) -32, 4);
        this.b(1, true);
        this.a(0, false, ej.field_c);
        this.a(ej.field_c, 0, -31);
    }

    final asa a(byte param0) {
        if (param0 <= 75) {
            return (asa) null;
        }
        return this.field_hc[this.field_Cc];
    }

    abstract na a(byte param0, int[][] param1, boolean param2, int param3);

    final void za(int param0, int param1, int param2, int param3, int param4) {
        this.g(118);
        this.g(3625, param3);
        this.a(pea.field_c, 0, -74);
        this.a(0, false, pea.field_c);
        this.c(param4, 1);
        this.field_q.a(1.0f, (float)param2, false, (float)param2);
        this.field_q.a(param0, param1, 0);
        this.F(-1662);
        this.b(1, false);
        this.a(-125, 0, this.field_hb);
        this.a(this.field_Z, -32);
        this.a(256, vs.field_T, 0, 0);
        this.b(1, true);
        this.a(0, false, ej.field_c);
        this.a(ej.field_c, 0, -93);
    }

    final void k(byte param0) {
        if (!(this.field_rb == 2)) {
            this.J(19822);
            this.b(false, -99);
            this.d(0, false);
            this.f(0, false);
            this.b(false, (byte) 81);
            this.a((byte) -80, false, false, -2);
            this.field_rb = 2;
        }
        if (param0 < 104) {
            this.field_ob = (mna) null;
        }
    }

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (this.field_D != param0) {
              break L1;
            } else {
              if (param1 != this.field_k) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          this.field_D = param0;
          this.field_k = param1;
          this.k(-19320);
          this.R(0);
          this.B(-7840);
          break L0;
        }
    }

    abstract boolean a(boolean param0, una param1, ft param2);

    abstract void w(byte param0);

    abstract float c(byte param0);

    final void K(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_N = new iva[this.field_Vb];
        this.field_hc = new asa[this.field_Vb];
        this.field_db = new ica[this.field_Vb];
        this.field_v = new ura[this.field_Vb];
        this.field_mc = new ica[this.field_Vb];
        int var2 = 0;
        if (param0 > -70) {
            this.field_zb = false;
        }
        while (var2 < this.field_Vb) {
            this.field_db[var2] = iw.field_c;
            this.field_mc[var2] = iw.field_c;
            this.field_v[var2] = od.field_h;
            this.field_hc[var2] = new asa();
            var2++;
        }
        this.field_ib = new ob[-2 + this.field_e];
        this.field_Jb = (iva) ((Object) this.a(1, 1, gpa.field_a, (byte) -63, una.field_g));
        this.a(new to(262144));
        this.field_Db = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n})}, 0);
        this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_b})}, 0);
        this.field_nc = this.a(new ne[]{new ne(gj.field_p), new ne(gj.field_b), new ne(gj.field_n), new ne(gj.field_e)}, 0);
        this.field_ob = this.a(new ne[]{new ne(gj.field_p), new ne(gj.field_b), new ne(gj.field_n)}, 0);
        this.field_cc = new gja((eo) (this), 0, 0, false, false);
        this.field_tb = new gja((eo) (this), 0, 0, true, true);
        this.field_gc = new gja((eo) (this), 0, 0, false, false);
        this.field_W = new gja((eo) (this), 0, 0, true, true);
        this.field_fb = new gja((eo) (this), 0, 0, false, false);
        this.field_E = new gja((eo) (this), 0, 0, true, true);
        this.field_O = new gja((eo) (this), 0, 0, false, false);
        this.field_n = new gja((eo) (this), 0, 0, true, true);
        this.field_ec = new gja((eo) (this), 0, 0, false, false);
        this.field_tc = new gja((eo) (this), 0, 0, true, true);
        this.field_kb = new ni((eo) (this));
        this.field_z = this.a(26, true);
        this.s((byte) 6);
        this.field_Mb = new hk((eo) (this));
        this.field_sb[1] = this.e(1, 56);
        this.field_sb[2] = this.e(2, 48);
        this.field_sb[4] = this.e(4, 46);
        this.field_sb[5] = this.e(5, 53);
        this.field_sb[6] = this.e(6, 70);
        this.field_sb[7] = this.e(7, 54);
        this.field_sb[3] = this.e(3, 66);
        this.field_sb[8] = this.e(8, 100);
        this.field_sb[9] = this.e(9, 76);
        if (!this.field_sb[2].c(1185)) {
            this.field_sb[2] = this.e(0, 105);
        }
        if (!this.field_sb[4].c(1185)) {
            this.field_sb[4] = this.field_sb[2];
        }
        if (!this.field_sb[8].c(1185)) {
            this.field_sb[8] = this.field_sb[4];
        }
        if (!this.field_sb[9].c(1185)) {
            this.field_sb[9] = this.field_sb[8];
        }
        this.h(-29040);
        this.la();
        this.a();
    }

    abstract void a(fp param0, int param1, int param2, boolean param3, boolean param4);

    private final void E(byte param0) {
        int var2;
        jaclib.memory.Buffer var3;
        jaclib.memory.Stream var4;
        int var5;
        double var6;
        float var8;
        float var9;
        int var10;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          this.field_hb = this.c(6, false);
          this.field_hb.a(3096, 12, true);
          if (param0 >= 14) {
            break L0;
          } else {
            this.field_B = -1.9750553369522095f;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          L2: {
            if (var2 >= 4) {
              break L2;
            } else {
              var3 = this.field_hb.a(-15730, true);
              if (var3 != null) {
                var4 = this.a(var3, 125);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var5 = 0;
                L3: while (true) {
                  if (var5 > 256) {
                    var4.a();
                    if (this.field_hb.a(true)) {
                      break L2;
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var6 = (double)(var5 * 2) * 3.141592653589793 / 256.0;
                    var8 = (float)Math.cos(var6);
                    var9 = (float)Math.sin(var6);
                    if (jaclib.memory.Stream.b()) {
                      var4.b(var9);
                      var4.b(var8);
                      var4.b(0.0f);
                      var5++;
                      continue L3;
                    } else {
                      var4.a(var9);
                      var4.a(var8);
                      var4.a(0.0f);
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
          this.field_Z = this.a(new ne[]{new ne(gj.field_p)}, 0);
          return;
        }
    }

    final void f(int param0, boolean param1) {
        if ((!this.field_wc ? 1 : 0) == (param1 ? 1 : 0)) {
            this.field_wc = param1 ? true : false;
            this.f((byte) -69);
            this.field_rb = this.field_rb & -32;
        }
        if (param0 != 0) {
            this.c(0, 83);
        }
    }

    void g(byte param0) {
        this.field_S = this.field_Bc;
        if (param0 != 92) {
            return;
        }
        this.field_Bc = 0;
    }

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = -104 / ((-46 - param1) / 50);
        return (param2 & 1024) != 0 ? true : false;
    }

    final void b(int param0) {
    }

    abstract void a(mna param0, int param1);

    final asa n(byte param0) {
        if (!(this.field_p)) {
            this.field_xc.a(this.field_Qb, this.field_q, (byte) 127);
            this.field_p = true;
        }
        int var2 = 30 / ((param0 - 51) / 41);
        return this.field_xc;
    }

    private final void r(byte param0) {
        this.field_f = (float)(-this.field_Q + this.field_A);
        this.field_zc = (float)(this.field_K - this.field_kc);
        int var2 = -90 % ((-57 - param0) / 57);
        this.field_H = (float)(this.field_jb + -this.field_kc);
        this.field_uc = (float)(-this.field_Q + this.field_C);
    }

    final int l() {
        return -2 + this.field_e;
    }

    eo(java.awt.Canvas param0, Object param1, d param2, cn param3, int param4, int param5) {
        super(param2);
        int var8 = 0;
        dw var9 = null;
        java.awt.Dimension var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        Throwable var7 = null;
        RuntimeException var7_ref = null;
        this.field_ic = new vna();
        this.field_gb = true;
        this.field_q = new asa();
        this.field_bb = new asa();
        this.field_Y = new asa();
        this.field_Qb = new asa();
        this.field_rc = new asa();
        this.field_xc = new asa();
        this.field_C = 0;
        this.field_Jc = -1;
        this.field_Lb = new float[16];
        this.field_Eb = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_i = 0;
        this.field_ac = -1;
        this.field_Gb = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_fc = 1.0f;
        this.field_qc = false;
        this.field_vc = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.field_k = 3584;
        this.field_Kb = 1.0f;
        this.field_sc = 1.0f;
        this.field_dc = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_V = false;
        this.field_p = false;
        this.field_J = -1;
        this.field_m = true;
        this.field_Fc = false;
        this.field_Q = 0;
        this.field_M = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
        this.field_Zb = true;
        this.field_Lc = 0;
        this.field_Sb = 128;
        this.field_s = false;
        this.field_nb = 0;
        this.field_ab = false;
        this.field_lb = dfa.field_b;
        this.field_Rb = 0;
        this.field_K = 0;
        this.field_D = 50;
        this.field_Ib = new float[16];
        this.field_pc = -1.0f;
        this.field_d = 3584.0f;
        this.field_Yb = true;
        this.field_r = tb.field_p;
        this.field_Ac = 0;
        this.field_jb = 0;
        this.field_yb = 1.0f;
        this.field_yc = false;
        this.field_j = -1.0f;
        this.field_R = new float[16];
        this.field_kc = 0;
        this.field_u = -1;
        this.field_T = this.field_vc;
        this.field_U = true;
        this.field_Nb = true;
        this.field_wb = 1;
        this.field_Kc = 0;
        this.field_Cc = 0;
        this.field_h = 512;
        this.field_qb = 0;
        this.field_zb = false;
        this.field_Cb = 3584.0f;
        this.field_A = 0;
        this.field_sb = new vw[10];
        this.field_Ic = 512;
        this.field_Pb = 1.0f;
        this.field_l = false;
        this.field_wc = false;
        this.field_g = -1;
        this.field_Tb = 16777215;
        this.field_y = new jaclib.memory.Stream();
        this.field_Ab = new asa();
        try {
          L0: {
            try {
              L1: {
                L2: {
                  this.field_Ub = param1;
                  this.field_I = param3;
                  this.field_Gc = param4;
                  var11 = param0.getSize();
                  this.field_Hb = var11.width;
                  this.field_jc = var11.height;
                  this.field_F = param5;
                  ija.a(true, (byte) 107, false);
                  if (this.field_c == null) {
                    this.field_P = new jagex3.graphics2.hw.NativeInterface(0, this.field_F);
                    this.field_Ec = null;
                    break L2;
                  } else {
                    this.field_Ec = new kp((eo) (this), this.field_c);
                    this.field_P = new jagex3.graphics2.hw.NativeInterface(this.field_c.a(-15061), this.field_F);
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= this.field_c.a(-15061)) {
                        break L2;
                      } else {
                        L4: {
                          var9 = this.field_c.a((byte) -79, var8);
                          if (var9 == null) {
                            break L4;
                          } else {
                            this.field_P.initTextureMetrics(var8, var9.field_c, var9.field_i);
                            break L4;
                          }
                        }
                        var8++;
                        continue L3;
                      }
                    }
                  }
                }
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = decompiledCaughtException;
              var7.printStackTrace();
              this.a(true);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var7_ref);

            stackIn_12_1 = new StringBuilder().append("eo.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(ura param0, boolean param1) {
        try {
            if (param1) {
                this.field_Zb = false;
            }
            this.field_v[this.field_Cc] = param0;
            this.u(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eo.SG(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (!this.a((float)param1, (float)param2, (float)param3, (float)param4, (float)param5, (float)param0, (byte) -70)) {
            return;
        }
        this.G(-89);
        this.a((float)param6, -229);
        this.b(false, -103);
        this.d(0, false);
        this.f(0, false);
        this.b(false, (byte) 81);
        this.c(param8, 1);
        this.a((byte) -80, false, false, -2);
        this.g(3625, param7);
        this.a(true, this.field_Jb);
        this.a((byte) -95, 1);
        this.a(pea.field_c, 0, -87);
        this.a(0, false, pea.field_c);
        this.i((byte) 104);
        this.b(1, false);
        this.C((byte) -70);
        this.b(1, true);
        this.a(0, false, ej.field_c);
        this.a(ej.field_c, 0, -14);
    }

    final void e(int param0, boolean param1) {
        if (param1) {
            this.field_F = -91;
        }
        if (!(param0 == this.field_Cc)) {
            this.field_Cc = param0;
            this.e(false);
        }
    }

    abstract mna a(ne[] param0, int param1);

    private final void x(int param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float[] var8;
        L0: {
          if (!this.field_s) {
            L1: {
              L2: {
                var8 = this.field_R;
                var2 = var8;
                var3 = (float)(this.field_D * -this.field_Q) / (float)this.field_Ic;
                var4 = (float)(this.field_D * (this.field_Hb + -this.field_Q)) / (float)this.field_Ic;
                var5 = (float)(this.field_kc * this.field_D) / (float)this.field_h;
                var6 = (float)((this.field_kc + -this.field_jc) * this.field_D) / (float)this.field_h;
                if (var3 == var4) {
                  break L2;
                } else {
                  if (var5 == var6) {
                    break L2;
                  } else {
                    var7 = 2.0f * (float)this.field_D;
                    var8[13] = 0.0f;
                    this.field_lc = (float)this.field_k / (float)(this.field_D + -this.field_k);
                    var8[10] = (float)this.field_k / (float)(this.field_D + -this.field_k);
                    var8[9] = (var6 + var5) / (var5 - var6);
                    var8[7] = 0.0f;
                    this.field_G = (float)(this.field_D * this.field_k) / (float)(-this.field_k + this.field_D);
                    var8[14] = (float)(this.field_D * this.field_k) / (float)(-this.field_k + this.field_D);
                    var8[6] = 0.0f;
                    var8[3] = 0.0f;
                    var8[2] = 0.0f;
                    var8[1] = 0.0f;
                    var8[4] = 0.0f;
                    var8[0] = var7 / (-var3 + var4);
                    var8[15] = 0.0f;
                    var8[12] = 0.0f;
                    var8[11] = -1.0f;
                    var8[5] = var7 / (-var6 + var5);
                    var8[8] = (var4 + var3) / (var4 - var3);
                    break L1;
                  }
                }
              }
              var8[13] = 0.0f;
              var8[8] = 0.0f;
              var8[4] = 0.0f;
              var8[15] = 1.0f;
              var8[3] = 0.0f;
              var8[10] = 1.0f;
              var8[6] = 0.0f;
              var8[0] = 1.0f;
              var8[7] = 0.0f;
              var8[9] = 0.0f;
              var8[2] = 0.0f;
              var8[11] = 0.0f;
              var8[14] = 0.0f;
              var8[5] = 1.0f;
              var8[1] = 0.0f;
              var8[12] = 0.0f;
              break L1;
            }
            this.j(-30801);
            this.field_s = true;
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == 7) {
            break L3;
          } else {
            this.field_M = (float[]) null;
            break L3;
          }
        }
    }

    abstract gf a(boolean param0, byte[] param1, int param2, int param3, int param4, int param5, ft param6, int param7);

    final void la() {
        this.field_K = 0;
        this.field_A = 0;
        this.field_C = this.field_Hb;
        this.field_jb = this.field_jc;
        if (!(!this.field_Wb)) {
            this.field_Wb = false;
            this.d((byte) -24);
        }
        this.r((byte) -120);
    }

    final boolean j() {
        return true;
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (-1 <= (param0 ^ -1) && -1 + this.field_Hb <= param2 && -1 <= (param1 ^ -1)) {
            if (!(this.field_jc - 1 > param3)) {
                this.la();
                return;
            }
        }
        this.field_C = param2 <= this.field_Hb ? param2 : 0;
        this.field_A = param0 < 0 ? 0 : param0;
        this.field_jb = param3 > this.field_Hb ? 0 : param3;
        this.field_K = 0 > param1 ? 0 : param1;
        if (!(this.field_Wb)) {
            this.field_Wb = true;
            this.d((byte) 123);
        }
        this.S(-3335);
        this.r((byte) 80);
    }

    private final void m(byte param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        this.r(0);
        this.v(40);
        this.h((byte) -102);
        this.g((byte) 92);
        this.i(-71);
        this.q((byte) -78);
        this.w((byte) -21);
        this.f((byte) -69);
        this.b((byte) -126);
        this.D(2);
        this.I(1);
        if (param0 < 83) {
            this.field_nb = 104;
        }
        this.M(-27581);
        this.b(false);
        this.w(-104);
        for (var2 = -1 + this.field_Vb; -1 >= (var2 ^ -1); var2--) {
            this.e(var2, false);
            this.f(-3485);
            this.u((byte) -23);
            this.p((byte) 114);
        }
        this.N(-48);
        this.B((byte) -116);
        this.e((byte) 119);
        this.z((byte) -73);
        this.h(false);
    }

    final static void q(int param0) {
        jsa.a(false, 17);
        int var1 = 36 % ((param0 - -38) / 62);
    }

    final int t(int param0) {
        if (param0 != 65280) {
            this.field_tc = (gja) null;
        }
        return this.field_ac;
    }

    final da a(qla param0, jpa[] param1, boolean param2) {
        RuntimeException var4 = null;
        ca stackIn_1_0 = null;
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
            stackIn_1_0 = new ca((eo) (this), param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("eo.I(");

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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return (da) ((Object) stackIn_1_0);
    }

    final ob a(int param0, int param1, int param2, int param3, int param4, float param5) {
        return (ob) ((Object) new jq(param0, param1, param2, param3, param4, param5));
    }

    final int o(byte param0) {
        if (param0 <= 82) {
            this.field_Lc = 103;
        }
        return this.field_Cc;
    }

    final asa C(int param0) {
        if (param0 != 0) {
            this.a(-0.6965478658676147f, 12);
        }
        return this.field_hc[this.field_Cc];
    }

    final void T(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(this.field_A >= param0)) {
            var5 = 1;
            this.field_A = param0;
        }
        if (this.field_C > param2) {
            var5 = 1;
            this.field_C = param2;
        }
        if (!(param1 <= this.field_K)) {
            this.field_K = param1;
            var5 = 1;
        }
        if (!(this.field_jb <= param3)) {
            this.field_jb = param3;
            var5 = 1;
        }
        if (var5 != 0) {
            if (!(this.field_Wb)) {
                this.field_Wb = true;
                this.d((byte) 125);
            }
            this.S(-3335);
            this.r((byte) -125);
        }
    }

    final jaclib.memory.Stream a(jaclib.memory.Buffer param0, int param1) {
        RuntimeException var3 = null;
        jaclib.memory.Stream stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 124) {
                break L1;
              } else {
                this.d(false);
                break L1;
              }
            }
            this.field_y.a(param0);
            stackIn_3_0 = this.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("eo.RA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    abstract void a(int param0, iw param1, int param2, int param3);

    final int i() {
        return this.field_D;
    }

    final ka a(oc param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        gja stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = new gja((eo) (this), param0, param1, param3, param4, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("eo.MB(");

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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (ka) ((Object) stackIn_1_0);
    }

    final void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (!(this.a((float)param1, (float)param2, (float)param3, (float)param4, (float)param5, (float)param0, (byte) -40))) {
            return;
        }
        this.A((byte) -74);
        this.b(false, -68);
        this.d(0, false);
        this.f(0, false);
        this.b(false, (byte) 81);
        this.c(param7, 1);
        this.a((byte) -80, false, false, -2);
        this.g(3625, param6);
        this.a(true, this.field_Jb);
        this.a((byte) -12, 1);
        this.a(pea.field_c, 0, -117);
        this.a(0, false, pea.field_c);
        this.i((byte) 119);
        this.b(1, false);
        this.C((byte) -70);
        this.b(1, true);
        this.a(0, false, ej.field_c);
        this.a(ej.field_c, 0, -85);
    }

    final void a(ica param0, byte param1, ica param2) {
        int var4_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            var4_int = 0;
            if (param1 == -110) {
              L1: {
                if (this.field_mc[this.field_Cc] == param2) {
                  break L1;
                } else {
                  this.field_mc[this.field_Cc] = param2;
                  var4_int = 1;
                  this.f(-3485);
                  break L1;
                }
              }
              L2: {
                if (param0 == this.field_db[this.field_Cc]) {
                  break L2;
                } else {
                  this.field_db[this.field_Cc] = param0;
                  this.u((byte) -23);
                  var4_int = 1;
                  break L2;
                }
              }
              L3: {
                if (var4_int == 0) {
                  break L3;
                } else {
                  this.field_rb = this.field_rb & -30;
                  break L3;
                }
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
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("eo.UF(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void h(byte param0);

    private final void v(byte param0) {
        this.field_p = false;
        if (!(null == this.field_pb)) {
            this.field_pb.b(true);
        }
        this.h(false);
        if (param0 != 94) {
            this.i();
        }
    }

    abstract void b(int param0, boolean param1);

    final int g(boolean param0) {
        if (param0) {
            this.field_nc = (mna) null;
        }
        return this.field_u;
    }

    abstract gf a(ft param0, int param1, int param2, boolean param3, int param4, int param5, float[] param6, int param7);

    private final void u(int param0) {
        this.z(param0);
        if (!(null == this.field_pb)) {
            this.field_pb.c(true);
        }
    }

    abstract void e(byte param0);

    final void m(int param0) {
        java.awt.Canvas var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        Enumeration var2 = this.field_oc.keys();
        while (var2.hasMoreElements()) {
            var3 = (java.awt.Canvas) (var2.nextElement());
            this.a(this.field_oc.get(var3), false, var3);
        }
        this.field_xb.a(12574);
        this.field_cb.a(12574);
        if (param0 != 6) {
            this.b(false, (byte) -31);
        }
        this.field_hb.a(12574);
        this.field_tb.e((byte) 112);
        this.field_W.e((byte) 126);
        this.field_E.e((byte) 112);
        this.field_n.e((byte) 114);
        this.field_tc.e((byte) 122);
        this.field_kb.a((byte) 86);
        this.field_z.a(param0 ^ 12568);
    }

    final gf a(int param0, byte[] param1, boolean param2, ft param3, int param4, int param5) {
        RuntimeException var7 = null;
        gf stackIn_2_0 = null;
        gf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 < -71) {
              stackIn_4_0 = this.a(param2, param1, 0, param0, 1, 0, param3, param5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (gf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("eo.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final nh a(jpa param0, boolean param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        nh stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        nh var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 == (param0.field_i ^ -1)) {
                  break L2;
                } else {
                  if (param0.field_a != 0) {
                    L3: {
                      var12 = new int[param0.field_i * param0.field_a];
                      var11 = var12;
                      var4 = var11;
                      var5 = 0;
                      var6 = 0;
                      if (null == param0.field_h) {
                        var7 = 0;
                        L4: while (true) {
                          if (var7 >= param0.field_a) {
                            break L3;
                          } else {
                            var8 = 0;
                            L5: while (true) {
                              if (var8 >= param0.field_i) {
                                var7++;
                                continue L4;
                              } else {
                                L6: {
                                  incrementValue$0 = var5;
                                  var5++;
                                  var9 = param0.field_g[255 & param0.field_f[incrementValue$0]];
                                  incrementValue$1 = var6;
                                  var6++;
                                  stackIn_18_0 = (int[]) (var4);

                                  stackIn_18_1 = incrementValue$1;

                                  if (0 == var9) {
                                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                                    stackIn_19_1 = stackIn_18_1;
                                    stackIn_19_2 = 0;
                                    break L6;
                                  } else {
                                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                                    stackIn_19_1 = stackIn_18_1;
                                    stackIn_19_2 = fh.a(-16777216, var9);
                                    break L6;
                                  }
                                }
                                stackIn_19_0[stackIn_19_1] = stackIn_19_2;
                                var8++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var7 = 0;
                        L7: while (true) {
                          if (param0.field_a <= var7) {
                            break L3;
                          } else {
                            var8 = 0;
                            L8: while (true) {
                              if (param0.field_i <= var8) {
                                var7++;
                                continue L7;
                              } else {
                                incrementValue$2 = var6;
                                var6++;
                                var4[incrementValue$2] = fh.a(param0.field_h[var5] << -1530467880, param0.field_g[sea.c((int) param0.field_f[var5], 255)]);
                                var5++;
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3 = this.a(var12, param0.field_a, 117, param0.field_i, param0.field_i, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = this.a(new int[]{0}, 1, 81, 1, 1, 0);
              break L1;
            }
            var3.b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
            stackIn_23_0 = (nh) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("eo.EB(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    final void a(za param0) {
        try {
            this.field_t = ((to) ((Object) param0)).field_h;
            this.field_o = this.field_t.a(32768, false);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eo.FB(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void S(int param0);

    final int XA() {
        return this.field_k;
    }

    abstract void a(int param0, int param1, qm param2);

    static {
        field_w = new fta();
    }
}
