/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pf extends ha {
    private jaclib.memory.heap.NativeHeap field_jc;
    static String[] field_Yb;
    rga field_Mb;
    private ij field_s;
    Object field_qc;
    private Hashtable field_rb;
    int field_db;
    long field_peer;
    int field_i;
    private jagex3.graphics2.hw.NativeInterface field_Zb;
    asb field_Ab;
    jaclib.memory.heap.NativeHeapBuffer field_m;
    boolean field_ec;
    int field_Nb;
    oj field_O;
    int field_mb;
    int field_ob;
    private oj field_t;
    private oj field_f;
    oj field_gb;
    private oj field_yb;
    private oj field_vc;
    int field_Bb;
    int field_pc;
    boolean field_X;
    float field_Rb;
    int field_Qb;
    aba[] field_z;
    float field_u;
    private float[] field_l;
    boolean field_M;
    int field_L;
    float field_Sb;
    boolean field_uc;
    private int field_v;
    boolean field_Hb;
    private boolean field_wb;
    private int field_lb;
    private ura[] field_bc;
    int field_Y;
    private int field_W;
    private float[] field_fb;
    int field_ab;
    private float[] field_J;
    int field_h;
    private float[] field_Db;
    int field_lc;
    private float[] field_c;
    float[] field_Fb;
    private int field_Pb;
    float field_p;
    fsb[] field_Lb;
    private boolean field_Ub;
    private int field_nb;
    float[] field_cb;
    float[] field_wc;
    private uda[] field_dc;
    private atb field_I;
    aba[] field_U;
    private float field_B;
    int field_bb;
    int field_H;
    boolean field_sc;
    private boolean field_hc;
    private boolean field_q;
    private uda field_E;
    int field_F;
    private int field_k;
    int field_xc;
    private int field_Ob;
    private int field_V;
    private je field_Ib;
    private jaclib.memory.Stream field_kb;
    boolean field_Xb;
    private as field_kc;
    private int field_e;
    float field_tc;
    private int field_d;
    int field_Wb;
    float field_r;
    private int field_tb;
    private int field_Gb;
    boolean field_nc;
    float field_x;
    int field_j;
    boolean field_g;
    private int field_ib;
    private int field_K;
    boolean field_eb;
    private float field_Z;
    boolean field_vb;
    private float[] field_gc;
    int field_Cb;
    ura field_Q;
    private float field_xb;
    private boolean field_sb;
    oj[] field_Eb;
    private boolean field_N;
    boolean field_cc;
    boolean field_ub;
    mma field_pb;
    int field_qb;
    private int field_mc;
    kba[] field_A;
    private int field_y;
    int field_Kb;
    int field_jb;
    int field_n;
    float field_oc;
    boolean field_zb;
    int field_rc;
    private boolean field_Tb;
    clb field_fc;
    private mkb field_C;
    private vmb field_G;
    private roa field_w;
    private vmb field_ic;
    private vmb field_o;
    vmb field_Vb;
    private roa field_D;
    private mkb field_P;
    private roa field_hb;
    private roa field_Jb;
    private roa field_R;
    private mkb field_S;
    private vca field_T;
    boolean field_ac;

    final boolean q() {
        return true;
    }

    abstract void y(int param0);

    void n(int param0) {
        boolean discarded$0 = false;
        this.C((byte) 92);
        if (param0 < 106) {
            discarded$0 = this.q();
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if ((param0 ^ -1) >= -1) {
            if (-1 + this.field_db <= param2) {
                if (param1 <= 0) {
                    if (!(param3 < -1 + this.field_i)) {
                        this.v(-120);
                        return;
                    }
                }
            }
        }
        this.field_xc = -1 >= (param1 ^ -1) ? param1 : 0;
        this.field_F = param2 > this.field_db ? 0 : param2;
        this.field_Bb = this.field_db >= param3 ? param3 : 0;
        this.field_H = param0 >= 0 ? param0 : 0;
        if (!this.field_ac) {
            this.field_ac = true;
            this.o((byte) 81);
        }
        this.A((byte) -99);
        this.b((byte) -114);
    }

    final void r(byte param0) {
        if (param0 > -51) {
            this.field_kc = (as) null;
        }
        this.a(0, bk.field_v, 2);
    }

    final oj A(int param0) {
        if (param0 != 11) {
            slb var3 = (slb) null;
            this.a(-91, (byte) 122, (slb) null);
        }
        return this.field_O;
    }

    final void xa(float param0) {
        if (param0 != this.field_Rb) {
            this.field_Rb = param0;
            this.field_Zb.setAmbient(param0);
            this.h(true);
            this.i((byte) 44);
        }
    }

    abstract void a(boolean param0, byte param1, slb param2, int param3);

    abstract void v(byte param0);

    abstract void G(byte param0);

    final void c(byte param0, boolean param1) {
        if (!((!this.field_Xb ? 1 : 0) == (!param1 ? 1 : 0))) {
            this.field_Xb = param1 ? true : false;
            this.B(-78);
            this.field_V = this.field_V & -8;
        }
        if (param0 >= -11) {
            this.field_ob = 42;
        }
    }

    private final void l(int param0) {
        float var2 = 0.0f;
        if (param0 != 0) {
            return;
        }
        if (vl.field_p == this.field_pb) {
            var2 = this.f((byte) -128);
            this.field_O.a(0.0f, var2, var2, (byte) 13);
        }
        this.field_wb = false;
        this.p((byte) 98);
        if (this.field_E != null) {
            this.field_E.c(5);
        }
    }

    final oj E(int param0) {
        if (!this.field_wb) {
            this.field_vc.a(this.field_O, this.field_gb, true);
            this.field_wb = true;
        }
        if (param0 != 0) {
            this.field_ab = 111;
        }
        return this.field_vc;
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.d(false);
        this.e(-126, param4);
        this.a(0, pea.field_d, 7);
        this.a(0, (byte) -108, pea.field_d);
        this.c(99, param5);
        this.field_O.a(5557, (float)param2, (float)param3, 1.0f);
        this.field_O.a(param1, 16383, 0, param0);
        this.h(20837);
        this.a(-44, false);
        this.r((byte) -64);
        this.a(-86, true);
        this.a(0, (byte) -53, qcb.field_q);
        this.a(0, qcb.field_q, 7);
    }

    private final void d(int param0) {
        if (null != this.field_E) {
            this.field_E.b(true);
        }
        if (param0 <= 105) {
            this.field_S = (mkb) null;
        }
        this.j(8);
    }

    abstract void j(int param0);

    abstract void o(byte param0);

    final void a(int param0, byte param1, slb param2) {
        try {
            if (param1 >= -48) {
                this.field_oc = -0.04896149784326553f;
            }
            this.a(false, (byte) 94, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pf.SE(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract float f(byte param0);

    private final void C(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        this.h(true);
        this.G((byte) 65);
        this.B(-51);
        this.f(68);
        this.m(3);
        this.i((byte) -119);
        this.e(false);
        this.F(12614);
        this.y(-43);
        this.w(1);
        this.j(8);
        if (param0 <= 14) {
            this.field_wb = false;
        }
        this.j((byte) -56);
        this.s((byte) -39);
        this.I(17634);
        for (var2 = -1 + this.field_L; var2 >= 0; var2--) {
            this.g(var2, -63);
            this.o(-88);
            this.l((byte) 116);
            this.F((byte) 112);
        }
        this.v((byte) -109);
        this.m((byte) 107);
        this.y((byte) -65);
        this.p((byte) 114);
        this.G(17891);
    }

    abstract void B(int param0);

    final eb a(int param0, boolean param1, int param2, byte param3, int[] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        eb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        eb stackOut_0_0 = null;
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
            var6_int = -43 / ((23 - param3) / 56);
            stackOut_0_0 = this.a(param0, param1, param4, param2, 0, true, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("pf.IE(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param4 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final boolean x() {
        return false;
    }

    private final void b(byte param0) {
        int discarded$0 = 0;
        if (param0 >= -61) {
            discarded$0 = this.g(-117);
        }
    }

    final oj p(int param0) {
        if (param0 != 0) {
            this.field_sb = false;
        }
        return this.field_Eb[this.field_ab];
    }

    final void za(int param0, int param1, int param2, int param3, int param4) {
        this.d(false);
        this.e(-128, param3);
        this.a(0, pea.field_d, 7);
        this.a(0, (byte) -65, pea.field_d);
        this.c(83, param4);
        this.field_O.a(5557, (float)param2, (float)param2, 1.0f);
        this.field_O.a(param1, 16383, 0, param0);
        this.h(20837);
        this.a(-114, false);
        this.a((byte) -6, this.field_P, 0);
        this.a(-51, this.field_G);
        this.a(bk.field_v, 0, 256, 66);
        this.a(-82, true);
        this.a(0, (byte) -122, qcb.field_q);
        this.a(0, qcb.field_q, 7);
    }

    abstract void I(int param0);

    final void h(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = VoidHunters.field_G;
            if (param1 == 1) {
              this.a(et.field_c, true, et.field_c);
              break L1;
            } else {
              if (param1 == 0) {
                this.a(asa.field_a, true, asa.field_a);
                break L1;
              } else {
                if (param1 == 2) {
                  this.a(et.field_c, true, df.field_o);
                  break L1;
                } else {
                  if (param1 == 3) {
                    this.a(asa.field_a, true, je.field_c);
                    break L1;
                  } else {
                    if (-5 == (param1 ^ -1)) {
                      this.a(feb.field_a, true, feb.field_a);
                      break L1;
                    } else {
                      var3 = 106 / ((-56 - param0) / 59);
                      break L0;
                    }
                  }
                }
              }
            }
          }
          var3 = 106 / ((-56 - param0) / 59);
          break L0;
        }
    }

    void f(int param0) {
        this.field_bb = this.field_Kb;
        if (param0 < 66) {
            return;
        }
        this.field_Kb = 0;
    }

    private final void u(int param0) {
        float[] var2 = null;
        float[] var3 = null;
        L0: {
          if (param0 == 1761) {
            break L0;
          } else {
            this.v((byte) -73);
            break L0;
          }
        }
        L1: {
          if (!this.field_sb) {
            L2: {
              L3: {
                var3 = this.field_l;
                var2 = var3;
                if (-1 == (this.field_db ^ -1)) {
                  break L3;
                } else {
                  if (this.field_i != 0) {
                    var2[9] = 0.0f;
                    var2[11] = 0.0f;
                    var2[3] = 0.0f;
                    var2[1] = 0.0f;
                    var2[10] = 0.5f;
                    var2[14] = 0.5f;
                    var2[5] = -2.0f / (float)this.field_i;
                    var2[8] = 0.0f;
                    var2[2] = 0.0f;
                    var2[0] = 2.0f / (float)this.field_db;
                    var2[6] = 0.0f;
                    var2[13] = 1.0f;
                    var2[7] = 0.0f;
                    var2[15] = 1.0f;
                    var2[4] = 0.0f;
                    var2[12] = -1.0f;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3[2] = 0.0f;
              var3[4] = 0.0f;
              var3[12] = 0.0f;
              var3[8] = 0.0f;
              var3[1] = 0.0f;
              var3[6] = 0.0f;
              var3[0] = 1.0f;
              var3[14] = 0.0f;
              var3[5] = 1.0f;
              var3[9] = 0.0f;
              var3[7] = 0.0f;
              var3[15] = 1.0f;
              var3[13] = 0.0f;
              var3[11] = 0.0f;
              var3[10] = 1.0f;
              var3[3] = 0.0f;
              break L2;
            }
            this.field_sb = true;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        int var7 = 0;
        float var8 = 0.0f;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (this.field_tb == param0) {
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
              if (param1 != this.field_oc) {
                break L2;
              } else {
                if (this.field_tc == param2) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            this.field_oc = param1;
            this.field_tc = param2;
            this.field_tb = param0;
            if (var7 == 0) {
              break L3;
            } else {
              this.field_Sb = (float)(16711680 & this.field_tb) / 16711680.0f;
              this.field_u = (float)(this.field_tb & 65280) / 65280.0f;
              this.field_x = (float)(255 & this.field_tb) / 255.0f;
              this.h(true);
              break L3;
            }
          }
          this.field_Zb.setSunColour(this.field_Sb, this.field_u, this.field_x, param1, param2);
          this.G((byte) 56);
          break L1;
        }
        L4: {
          L5: {
            if (this.field_Db[0] != param3) {
              break L5;
            } else {
              if (this.field_Db[1] != param4) {
                break L5;
              } else {
                if (this.field_Db[2] != param5) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
          }
          this.field_Db[1] = param4;
          this.field_Db[2] = param5;
          this.field_Db[0] = param3;
          this.field_fb[2] = -param5;
          this.field_fb[1] = -param4;
          this.field_fb[0] = -param3;
          var8 = (float)(1.0 / Math.sqrt((double)(param5 * param5 + (param4 * param4 + param3 * param3))));
          this.field_wc[1] = var8 * param4;
          this.field_wc[0] = var8 * param3;
          this.field_wc[2] = var8 * param5;
          this.field_cb[0] = -this.field_wc[0];
          this.field_cb[1] = -this.field_wc[1];
          this.field_cb[2] = -this.field_wc[2];
          this.field_Zb.setSunDirection(this.field_wc[0], this.field_wc[1], this.field_wc[2]);
          this.m(3);
          break L4;
        }
        this.i((byte) -120);
    }

    final int i() {
        return this.field_h;
    }

    private final void s(int param0) {
        if (param0 != 0) {
            this.field_mc = -87;
        }
        this.field_wb = false;
        if (this.field_E != null) {
            this.field_E.c((byte) 15);
        }
        this.G(17891);
    }

    private final void f(boolean param0) {
        this.field_Ub = false;
        this.k((byte) 97);
        if (tib.field_h == this.field_pb) {
            this.x(17975);
        }
        if (!param0) {
            this.d(27);
        }
    }

    pf(java.awt.Canvas param0, Object param1, d param2, asb param3, int param4, int param5) {
        super(param2);
        Throwable var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        opa var9 = null;
        java.awt.Dimension var11 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        this.field_s = new ij();
        this.field_ec = true;
        this.field_O = new oj();
        this.field_t = new oj();
        this.field_f = new oj();
        this.field_gb = new oj();
        this.field_yb = new oj();
        this.field_vc = new oj();
        this.field_Hb = false;
        this.field_X = false;
        this.field_Y = 0;
        this.field_v = -1;
        this.field_h = 50;
        this.field_l = new float[16];
        this.field_wb = false;
        this.field_Bb = 0;
        this.field_c = new float[16];
        this.field_M = true;
        this.field_Db = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_Rb = 1.0f;
        this.field_ab = 0;
        this.field_B = 1.0f;
        this.field_H = 0;
        this.field_Qb = 0;
        this.field_J = new float[16];
        this.field_k = 512;
        this.field_fb = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_u = 1.0f;
        this.field_q = false;
        this.field_j = -1;
        this.field_d = 0;
        this.field_F = 0;
        this.field_Gb = 0;
        this.field_tc = -1.0f;
        this.field_ib = -1;
        this.field_x = 1.0f;
        this.field_Xb = false;
        this.field_hc = false;
        this.field_lb = 512;
        this.field_lc = -1;
        this.field_nb = 0;
        this.field_nc = false;
        this.field_K = 0;
        this.field_Wb = 3584;
        this.field_dc = new uda[10];
        this.field_cb = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
        this.field_sb = false;
        this.field_g = true;
        this.field_gc = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.field_pb = pob.field_c;
        this.field_Cb = 0;
        this.field_mc = 1;
        this.field_Fb = this.field_gc;
        this.field_wc = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_W = -1;
        this.field_N = false;
        this.field_Ub = false;
        this.field_tb = 16777215;
        this.field_eb = true;
        this.field_cc = true;
        this.field_Ob = 0;
        this.field_y = 0;
        this.field_oc = -1.0f;
        this.field_Sb = 1.0f;
        this.field_zb = true;
        this.field_xc = 0;
        this.field_fc = to.field_o;
        this.field_n = 128;
        this.field_kb = new jaclib.memory.Stream();
        oj discarded$1 = new oj();
        try {
          L0: {
            try {
              L1: {
                L2: {
                  this.field_Ab = param3;
                  this.field_rc = param4;
                  this.field_qc = param1;
                  var11 = param0.getSize();
                  this.field_e = param5;
                  this.field_i = var11.height;
                  this.field_db = var11.width;
                  ocb.a(false, (byte) 33, true);
                  if (this.field_a == null) {
                    this.field_Zb = new jagex3.graphics2.hw.NativeInterface(0, this.field_e);
                    this.field_I = null;
                    break L2;
                  } else {
                    this.field_I = new atb((pf) (this), this.field_a);
                    this.field_Zb = new jagex3.graphics2.hw.NativeInterface(this.field_a.a(11316), this.field_e);
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= this.field_a.a(11316)) {
                        break L2;
                      } else {
                        L4: {
                          var9 = this.field_a.a(-20292, var8);
                          if (var9 == null) {
                            break L4;
                          } else {
                            this.field_Zb.initTextureMetrics(var8, var9.field_b, var9.field_g);
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
              this.a((byte) 30);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var7_ref);
            stackOut_10_1 = new StringBuilder().append("pf.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
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
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
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
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int XA() {
        return this.field_Wb;
    }

    final boolean r() {
        return false;
    }

    final void c(byte param0) {
        int var2 = 42 % ((param0 - -29) / 36);
        if (this.field_V != 4) {
            this.h((byte) 6);
            this.d(false, -30305);
            this.c((byte) -35, false);
            this.b(false, -1700);
            this.b((byte) -74, false);
            this.a(false, (byte) 18, false, -2);
            this.c(92, 1);
            this.h(87, 0);
            this.field_V = 4;
        }
    }

    abstract void a(byte param0, uja param1);

    final eb a(int param0, kb param1, int param2, int param3, boolean param4, byte[] param5) {
        int discarded$2 = 0;
        RuntimeException var7 = null;
        eb stackIn_3_0 = null;
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
        eb stackOut_2_0 = null;
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
              if (param2 == 0) {
                break L1;
              } else {
                discarded$2 = this.t((byte) -110);
                break L1;
              }
            }
            stackOut_2_0 = this.a(0, param5, param1, 0, param0, param3, param4, param2 + 11);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("pf.AH(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
    }

    private final void d(boolean param0) {
        if (param0) {
            this.field_vc = (oj) null;
        }
        if (this.field_V != 1) {
            this.h((byte) -124);
            this.d(false, -30305);
            this.c((byte) -58, false);
            this.b(false, -1700);
            this.b((byte) -74, false);
            this.a(false, (byte) 125, false, -2);
            this.h(32, 1);
            this.a(this.field_Q, -123);
            this.field_V = 1;
        }
    }

    abstract void A(byte param0);

    private final void g(boolean param0) {
        oj discarded$0 = null;
        this.field_c[10] = this.field_xb;
        this.field_c[14] = this.field_Z;
        if (!param0) {
            discarded$0 = this.z((byte) -70);
        }
    }

    final void c(boolean param0) {
        this.field_O.c(1);
        this.field_ec = param0 ? true : false;
        this.l(0);
    }

    final da a(sw param0, ima[] param1, boolean param2) {
        RuntimeException var4 = null;
        rp stackIn_1_0 = null;
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
        rp stackOut_0_0 = null;
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
            stackOut_0_0 = new rp((pf) (this), param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("pf.BA(");
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return (da) ((Object) stackIn_1_0);
    }

    final boolean n() {
        return true;
    }

    private final void x(int param0) {
        this.y((byte) -66);
        if (param0 != 17975) {
            return;
        }
        if (null != this.field_E) {
            this.field_E.a(true);
        }
    }

    abstract void e(boolean param0);

    final void z(int param0) {
        vmb discarded$8 = null;
        vmb discarded$9 = null;
        vmb discarded$10 = null;
        roa discarded$11 = null;
        roa discarded$12 = null;
        roa discarded$13 = null;
        roa discarded$14 = null;
        roa discarded$15 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        this.field_bc = new ura[this.field_L];
        this.field_A = new kba[this.field_L];
        this.field_z = new aba[this.field_L];
        this.field_Eb = new oj[this.field_L];
        this.field_U = new aba[this.field_L];
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_L) {
            L1: {
              this.field_Lb = new fsb[-2 + this.field_qb];
              this.field_Q = (ura) ((Object) this.a(125, 1, 1, qua.field_d, mj.field_f));
              this.a(new cba(262144));
              this.field_Vb = this.a(10, new qma[]{new qma(new pb[]{pb.field_k, pb.field_l})});
              discarded$8 = this.a(10, new qma[]{new qma(new pb[]{pb.field_k, pb.field_d})});
              discarded$9 = this.a(param0 ^ -31099, new qma[]{new qma(pb.field_k), new qma(pb.field_d), new qma(pb.field_l), new qma(pb.field_g)});
              discarded$10 = this.a(10, new qma[]{new qma(pb.field_k), new qma(pb.field_d), new qma(pb.field_l)});
              discarded$11 = new roa((pf) (this), 0, 0, false, false);
              this.field_R = new roa((pf) (this), 0, 0, true, true);
              discarded$12 = new roa((pf) (this), 0, 0, false, false);
              this.field_D = new roa((pf) (this), 0, 0, true, true);
              discarded$13 = new roa((pf) (this), 0, 0, false, false);
              this.field_hb = new roa((pf) (this), 0, 0, true, true);
              discarded$14 = new roa((pf) (this), 0, 0, false, false);
              this.field_Jb = new roa((pf) (this), 0, 0, true, true);
              discarded$15 = new roa((pf) (this), 0, 0, false, false);
              this.field_w = new roa((pf) (this), 0, 0, true, true);
              this.field_Ib = new je((pf) (this));
              this.field_T = this.a((byte) -19, true);
              this.i(param0 ^ -31089);
              this.field_Mb = new rga((pf) (this));
              this.field_dc[1] = this.a((byte) -123, 1);
              this.field_dc[2] = this.a((byte) 33, 2);
              this.field_dc[4] = this.a((byte) 119, 4);
              this.field_dc[5] = this.a((byte) -114, 5);
              this.field_dc[6] = this.a((byte) 35, 6);
              this.field_dc[7] = this.a((byte) -97, 7);
              this.field_dc[3] = this.a((byte) 115, 3);
              this.field_dc[8] = this.a((byte) -114, 8);
              this.field_dc[9] = this.a((byte) -114, 9);
              if (!this.field_dc[2].a((byte) -89)) {
                this.field_dc[2] = this.a((byte) -115, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_dc[4].a((byte) -40)) {
                break L2;
              } else {
                this.field_dc[4] = this.field_dc[2];
                break L2;
              }
            }
            L3: {
              if (!this.field_dc[8].a((byte) 127)) {
                this.field_dc[8] = this.field_dc[4];
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!this.field_dc[9].a((byte) 110)) {
                this.field_dc[9] = this.field_dc[8];
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 == -31089) {
                break L5;
              } else {
                this.field_wc = (float[]) null;
                break L5;
              }
            }
            this.n(125);
            this.v(param0 + 31003);
            this.v();
            return;
          } else {
            this.field_U[var2] = asa.field_a;
            this.field_z[var2] = asa.field_a;
            this.field_A[var2] = fsa.field_o;
            this.field_Eb[var2] = new oj();
            var2++;
            continue L0;
          }
        }
    }

    abstract void p(byte param0);

    final void c(boolean param0, int param1) {
        if (!((param0 ? 1 : 0) != (!this.field_Hb ? 1 : 0))) {
            this.field_Hb = param0 ? true : false;
            this.B(-118);
        }
        if (param1 < 32) {
            this.l((byte) -50);
        }
    }

    final boolean a() {
        return true;
    }

    private final void k(byte param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float[] var9 = null;
        L0: {
          if (param0 == 97) {
            break L0;
          } else {
            this.field_hb = (roa) null;
            break L0;
          }
        }
        L1: {
          if (this.field_Ub) {
            break L1;
          } else {
            L2: {
              L3: {
                var9 = this.field_J;
                var2 = var9;
                var3 = (float)this.field_h;
                var4 = (float)this.field_Wb;
                var5 = this.field_B * (float)(-this.field_Gb) / (float)this.field_k;
                var6 = this.field_B * (float)(-this.field_K) / (float)this.field_lb;
                var7 = (float)(-this.field_K + this.field_db) * this.field_B / (float)this.field_lb;
                var8 = (float)(this.field_i + -this.field_Gb) * this.field_B / (float)this.field_k;
                if (var6 == var7) {
                  break L3;
                } else {
                  if (var5 != var8) {
                    var2[11] = 0.0f;
                    var2[6] = 0.0f;
                    var2[4] = 0.0f;
                    var2[10] = 1.0f / (var3 - var4);
                    var2[12] = (var7 + var6) / (-var7 + var6);
                    var2[3] = 0.0f;
                    var2[7] = 0.0f;
                    var2[8] = 0.0f;
                    var2[1] = 0.0f;
                    var2[9] = 0.0f;
                    var2[13] = (var5 + var8) / (var8 - var5);
                    var2[14] = var3 / (-var4 + var3);
                    var2[15] = 1.0f;
                    var2[5] = 2.0f / (var8 - var5);
                    var2[2] = 0.0f;
                    var2[0] = 2.0f / (-var6 + var7);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var9[13] = 0.0f;
              var9[5] = 1.0f;
              var9[11] = 0.0f;
              var9[2] = 0.0f;
              var9[10] = 1.0f;
              var9[8] = 0.0f;
              var9[14] = 0.0f;
              var9[4] = 0.0f;
              var9[1] = 0.0f;
              var9[15] = 1.0f;
              var9[12] = 0.0f;
              var9[7] = 0.0f;
              var9[0] = 1.0f;
              var9[3] = 0.0f;
              var9[9] = 0.0f;
              var9[6] = 0.0f;
              break L2;
            }
            this.q((byte) 72);
            this.field_Ub = true;
            break L1;
          }
        }
    }

    abstract vmb a(int param0, qma[] param1);

    abstract void o(int param0);

    private final boolean a(float param0, float param1, byte param2, float param3, float param4, float param5, float param6) {
        jaclib.memory.Buffer var10 = this.field_S.a(true, (byte) 87);
        if (var10 == null) {
            return false;
        }
        jaclib.memory.Stream var9 = this.a(var10, false);
        if (!jaclib.memory.Stream.a()) {
            var9.a(param5);
            var9.a(param1);
            var9.a(param0);
            var9.a(param4);
            var9.a(param3);
            var9.a(param6);
        } else {
            var9.b(param5);
            var9.b(param1);
            var9.b(param0);
            var9.b(param4);
            var9.b(param3);
            var9.b(param6);
        }
        if (param2 >= -58) {
            this.field_Bb = -117;
        }
        var9.b();
        return this.field_S.b(-20836);
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        gf discarded$1 = null;
        int var8 = 0;
        kb var9 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          if (!param1) {
            break L0;
          } else {
            var9 = (kb) null;
            discarded$1 = this.a(-31, -99, (byte[]) null, (kb) null, -65, -32);
            break L0;
          }
        }
        L1: {
          param0 = param0 & this.e();
          if (param0) {
            break L1;
          } else {
            L2: {
              if (-5 == (param2 ^ -1)) {
                break L2;
              } else {
                if (param2 == 8) {
                  break L2;
                } else {
                  if (-10 == (param2 ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              param2 = 2;
              if (param2 != 4) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = param3 & 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            param4 = stackIn_10_0;
            param3 = 0;
            break L1;
          }
        }
        L4: {
          if (param2 == 0) {
            break L4;
          } else {
            if (!param5) {
              break L4;
            } else {
              param2 = param2 | -2147483648;
              break L4;
            }
          }
        }
        L5: {
          if (this.field_nb != param2) {
            L6: {
              if (this.field_nb == 0) {
                break L6;
              } else {
                this.field_dc[2147483647 & this.field_nb].a(2543);
                break L6;
              }
            }
            L7: {
              if (param2 == 0) {
                this.field_E = null;
                break L7;
              } else {
                this.field_E = this.field_dc[2147483647 & param2];
                this.field_E.a(5, param5);
                this.field_E.b(5, param5);
                this.field_E.a(param4, param3, 5);
                break L7;
              }
            }
            this.field_nb = param2;
            this.field_y = param3;
            this.field_d = param4;
            break L5;
          } else {
            if (this.field_nb == 0) {
              break L5;
            } else {
              L8: {
                this.field_dc[this.field_nb & 2147483647].b(5, param5);
                if (param3 != this.field_y) {
                  break L8;
                } else {
                  if (param4 == this.field_d) {
                    break L5;
                  } else {
                    break L8;
                  }
                }
              }
              this.field_dc[2147483647 & this.field_nb].a(param4, param3, 5);
              this.field_d = param4;
              this.field_y = param3;
              break L5;
            }
          }
        }
    }

    abstract void F(int param0);

    final void a(boolean param0, boolean param1) {
        if ((!this.field_cc ? 1 : 0) != (!param0 ? 1 : 0)) {
            this.field_cc = param0 ? true : false;
            this.w(1);
        }
        if (param1) {
            this.s(-21, -6, -111, -17, -121);
        }
    }

    abstract void t(int param0);

    final void v(int param0) {
        eb discarded$0 = null;
        this.field_Bb = this.field_i;
        this.field_H = 0;
        this.field_F = this.field_db;
        this.field_xc = 0;
        if (!(!this.field_ac)) {
            this.field_ac = false;
            this.o((byte) 81);
        }
        this.b((byte) -114);
        if (param0 > -53) {
            int[] var3 = (int[]) null;
            discarded$0 = this.a(-67, false, 114, (byte) 35, (int[]) null);
        }
    }

    final void c(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        clb var3 = null;
        int var6 = VoidHunters.field_G;
        if (param0 < 53) {
            return;
        }
        if (this.field_mc == param1) {
        } else {
            if (param1 == 1) {
                var5 = 1;
                var4 = 1;
                var3 = to.field_o;
            } else {
                if (2 == param1) {
                    var3 = oj.field_b;
                    var4 = 1;
                    var5 = 0;
                } else {
                    if (param1 != 128) {
                        var4 = 0;
                        var3 = ajb.field_f;
                        var5 = 0;
                    } else {
                        var5 = 1;
                        var3 = ub.field_e;
                        var4 = 1;
                    }
                }
            }
            if ((var5 == 0 ? 1 : 0) != (!this.field_eb ? 1 : 0)) {
                this.field_eb = var5 != 0 ? true : false;
                this.I(17634);
            }
            if (!((!this.field_zb ? 1 : 0) == (var4 == 0 ? 1 : 0))) {
                this.field_zb = var4 != 0 ? true : false;
                this.j((byte) -56);
            }
            if (var3 != this.field_fc) {
                this.field_fc = var3;
                this.s((byte) -39);
            }
            this.field_mc = param1;
            this.field_V = this.field_V & -29;
        }
    }

    final void h(byte param0) {
        mma var3 = null;
        int var2 = -109 / ((param0 - -65) / 34);
        if (!(this.field_pb == vl.field_p)) {
            var3 = this.field_pb;
            this.field_pb = vl.field_p;
            if (!(!var3.a(-12178))) {
                this.s(0);
            }
            this.u(1761);
            this.field_Fb = this.field_l;
            this.x(17975);
            this.field_V = this.field_V & -25;
        }
    }

    final void e(int param0, int param1) {
        if (param0 > -121) {
            this.e(-49, -58);
        }
        if (this.field_jb != param1) {
            this.field_jb = param1;
            this.v((byte) -109);
        }
    }

    abstract hdb a(boolean param0, int param1, int[][] param2, int param3);

    final ka a(cbb param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        roa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        roa stackOut_0_0 = null;
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
            stackOut_0_0 = new roa((pf) (this), param0, param1, param3, param4, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("pf.H(");
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
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (ka) ((Object) stackIn_1_0);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        L0: {
          L1: {
            var7 = (float)param2 - (float)param0;
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
          var8 = var8 * var9;
          var7 = var7 * var9;
          break L0;
        }
        if (this.a(0.0f, (float)param1, (byte) -126, (float)param3 + var8, (float)param2 + var7, (float)param0, 0.0f)) {
          this.d(false);
          this.e(-128, param4);
          this.a(0, pea.field_d, 7);
          this.a(0, (byte) -118, pea.field_d);
          this.c(72, param5);
          this.c(true);
          this.a(-75, false);
          this.k(126);
          this.a(-101, true);
          this.a(0, (byte) -70, qcb.field_q);
          this.a(0, qcb.field_q, 7);
          return;
        } else {
          return;
        }
    }

    final int[] Y() {
        return new int[]{this.field_K, this.field_Gb, this.field_lb, this.field_k};
    }

    final void w(byte param0) {
        mma var2 = null;
        if (!(pob.field_c == this.field_pb)) {
            var2 = this.field_pb;
            this.field_pb = pob.field_c;
            if (!(!var2.a(-12178))) {
                this.s(0);
            }
            this.field_V = this.field_V & -32;
            this.field_Fb = this.field_gc;
        }
        if (param0 != -101) {
            this.field_S = (mkb) null;
        }
    }

    abstract eb a(int param0, byte[] param1, kb param2, int param3, int param4, int param5, boolean param6, int param7);

    void o() {
        ksa var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        int var3 = VoidHunters.field_G;
        if (!(this.field_hc)) {
            var1 = this.field_s.d(0);
            while (var1 != null) {
                ((cba) ((Object) var1)).a(true);
                var1 = this.field_s.a((byte) 116);
            }
            var1_ref = this.field_rb.keys();
            while (var1_ref.hasMoreElements()) {
                var2 = (java.awt.Canvas) (var1_ref.nextElement());
                this.a(var2, this.field_rb.get(var2), 0);
            }
            uhb.a((byte) 104, true, false);
            this.field_Zb.release();
            this.field_hc = true;
        }
    }

    abstract void d(int param0, int param1);

    abstract eb a(int param0, int param1, int param2, kb param3, mj param4);

    abstract void G(int param0);

    final boolean l() {
        return true;
    }

    final eb a(int param0, int param1, float[] param2, boolean param3, int param4, kb param5) {
        hdb discarded$2 = null;
        RuntimeException var7 = null;
        eb stackIn_3_0 = null;
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
        eb stackOut_2_0 = null;
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
              if (param4 == -1) {
                break L1;
              } else {
                discarded$2 = this.a(false, -91, (int[][]) null, -127);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param5, param2, param3, 0, param1, 0, true, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("pf.JF(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void E(byte param0) {
        if (!(this.field_V == 2)) {
            this.h((byte) -121);
            this.d(false, param0 + -30416);
            this.c((byte) -112, false);
            this.b(false, -1700);
            this.b((byte) -74, false);
            this.a(false, (byte) -128, false, -2);
            this.field_V = 2;
        }
        if (param0 != 111) {
            this.l((byte) -103);
        }
    }

    final jaclib.memory.heap.NativeHeapBuffer a(boolean param0, int param1, int param2) {
        int var4 = -73 % ((param1 - 37) / 38);
        return this.field_jc.a(param2, param0);
    }

    final void T(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(this.field_H >= param0)) {
            var5 = 1;
            this.field_H = param0;
        }
        if (!(param2 >= this.field_F)) {
            this.field_F = param2;
            var5 = 1;
        }
        if (!(param1 <= this.field_xc)) {
            this.field_xc = param1;
            var5 = 1;
        }
        if (param3 < this.field_Bb) {
            this.field_Bb = param3;
            var5 = 1;
        }
        if (var5 != 0) {
            if (!this.field_ac) {
                this.field_ac = true;
                this.o((byte) 81);
            }
            this.A((byte) -104);
            this.b((byte) -89);
        }
    }

    final oj g(byte param0) {
        boolean discarded$0 = false;
        if (param0 <= 5) {
            discarded$0 = this.l();
        }
        return this.field_gb;
    }

    abstract void y(byte param0);

    final int t() {
        return -2 + this.field_qb;
    }

    final void P(int param0, int param1, int param2, int param3, int param4) {
        this.b(param0, param1, param0, param2 + param1, param3, param4);
    }

    final pw d() {
        return (pw) ((Object) new oj());
    }

    private final void b(boolean param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (param0) {
          this.field_C = this.a(false, 3);
          discarded$1 = this.field_C.a(28, 140, 126);
          var2 = 0;
          L0: while (true) {
            L1: {
              if (4 <= var2) {
                break L1;
              } else {
                var3 = this.field_C.a(true, (byte) 119);
                if (var3 != null) {
                  L2: {
                    var4 = this.a(var3, false);
                    if (jaclib.memory.Stream.a()) {
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
                    } else {
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
                    }
                  }
                  var4.b();
                  if (this.field_C.b(-20836)) {
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
            this.field_ic = this.a(10, new qma[]{new qma(new pb[]{pb.field_k, pb.field_l, pb.field_l})});
            return;
          }
        } else {
          return;
        }
    }

    final jaclib.memory.Stream a(jaclib.memory.Buffer param0, boolean param1) {
        RuntimeException var3 = null;
        jaclib.memory.Stream stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jaclib.memory.Stream stackOut_2_0 = null;
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
              if (!param1) {
                break L1;
              } else {
                this.field_Eb = (oj[]) null;
                break L1;
              }
            }
            this.field_kb.a(param0);
            stackOut_2_0 = this.field_kb;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("pf.IF(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final float[] a(int param0, float[] param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
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
              param1[8] = this.field_Fb[2];
              param1[0] = this.field_Fb[0];
              param1[4] = this.field_Fb[1];
              param1[12] = this.field_Fb[3];
              if (param0 >= 98) {
                break L1;
              } else {
                this.field_x = -0.8953596949577332f;
                break L1;
              }
            }
            param1[13] = this.field_Fb[7];
            param1[2] = this.field_Fb[8];
            param1[1] = this.field_Fb[4];
            param1[5] = this.field_Fb[5];
            param1[9] = this.field_Fb[6];
            param1[7] = this.field_Fb[13];
            param1[6] = this.field_Fb[9];
            param1[3] = this.field_Fb[12];
            param1[14] = this.field_Fb[11];
            param1[10] = this.field_Fb[10];
            param1[11] = this.field_Fb[14];
            param1[15] = this.field_Fb[15];
            stackOut_2_0 = (float[]) (param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("pf.TG(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract void a(int param0, vmb param1);

    final void a(int param0, slb param1, int param2) {
        boolean discarded$2 = false;
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
              this.a(false, param2 + -21122, false, param1, param0);
              if (param2 == 7) {
                break L1;
              } else {
                discarded$2 = this.a();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("pf.LF(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final void B(byte param0) {
        this.C(0);
        if (param0 != 96) {
            this.field_Db = (float[]) null;
        }
        if (this.field_E != null) {
            this.field_E.d(8);
        }
    }

    final void F(byte param0) {
        if (param0 <= 63) {
            this.field_yb = (oj) null;
        }
        if (this.field_A[this.field_ab] != fsa.field_o) {
            this.field_A[this.field_ab] = fsa.field_o;
            this.field_Eb[this.field_ab].c(1);
            this.B((byte) 96);
        }
    }

    abstract void m(byte param0);

    final boolean f() {
        return this.field_sc;
    }

    uda a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var3 = 79 % ((param0 - -34) / 63);
        var4 = param1;
        if (-7 == (var4 ^ -1)) {
          return (uda) ((Object) new sv((pf) (this)));
        } else {
          if (var4 != 1) {
            if (var4 == 2) {
              return (uda) ((Object) new wu((pf) (this), this.field_Mb));
            } else {
              if (var4 != 7) {
                return (uda) ((Object) new bib((pf) (this)));
              } else {
                return (uda) ((Object) new hab((pf) (this)));
              }
            }
          } else {
            return (uda) ((Object) new qr((pf) (this)));
          }
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        this.d(false);
        this.e(-126, param3);
        this.a(0, pea.field_d, 7);
        this.a(0, (byte) -65, pea.field_d);
        this.c(58, param4);
        this.field_O.a(5557, (float)param2, (float)param2, 1.0f);
        this.field_O.a(param1, 16383, 0, param0);
        this.h(20837);
        this.a(-112, false);
        this.a((byte) -6, this.field_P, 0);
        this.a(115, this.field_G);
        this.a(era.field_o, 1, 256, -114);
        this.a(-27, true);
        this.a(0, (byte) -97, qcb.field_q);
        this.a(0, qcb.field_q, 7);
    }

    abstract boolean a(int param0, kb param1, mj param2);

    abstract Object a(byte param0, java.awt.Canvas param1);

    abstract void a(int param0, boolean param1);

    abstract vca a(byte param0, boolean param1);

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (param0 != this.field_h) {
              break L1;
            } else {
              if (param1 != this.field_Wb) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          this.field_h = param0;
          this.field_Wb = param1;
          this.x((byte) 20);
          this.f(true);
          this.d(112);
          break L0;
        }
    }

    void c(int param0) {
        if (null != this.field_I) {
            this.field_I.a((byte) -106);
        }
        this.field_pc = param0 & 2147483647;
    }

    final void h(int param0) {
        if (param0 != 20837) {
            return;
        }
        this.field_ec = false;
        this.l(0);
    }

    final void a(ura param0, int param1) {
        aja discarded$2 = null;
        RuntimeException runtimeException = null;
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
              if (param1 <= -105) {
                break L1;
              } else {
                discarded$2 = this.a(91, -101, true);
                break L1;
              }
            }
            L2: {
              if (param0 == this.field_bc[this.field_ab]) {
                break L2;
              } else {
                L3: {
                  this.field_bc[this.field_ab] = param0;
                  if (param0 != null) {
                    param0.b(-27445);
                    break L3;
                  } else {
                    this.r(3);
                    break L3;
                  }
                }
                this.field_V = this.field_V & -2;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("pf.HF(");
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
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    abstract mkb a(boolean param0, int param1);

    final void b(byte param0, boolean param1) {
        if (param0 != -74) {
            this.B((byte) 123);
        }
        if (!((!param1 ? 1 : 0) != (this.field_X ? 1 : 0))) {
            this.field_X = param1 ? true : false;
            this.y(param0 ^ 22);
            this.field_V = this.field_V & -32;
        }
    }

    private final void H(int param0) {
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        this.field_P = this.a(false, param0 + -3093);
        boolean discarded$2 = this.field_P.a(12, param0, 86);
        var2 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= 4) {
              break L1;
            } else {
              var3 = this.field_P.a(true, (byte) 52);
              if (var3 != null) {
                var4 = this.a(var3, false);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var5 = 0;
                L2: while (true) {
                  if ((var5 ^ -1) < -257) {
                    var4.b();
                    if (this.field_P.b(param0 ^ -23932)) {
                      break L1;
                    } else {
                      var2++;
                      continue L0;
                    }
                  } else {
                    var6 = 3.141592653589793 * (double)(var5 * 2) / 256.0;
                    var8 = (float)Math.cos(var6);
                    var9 = (float)Math.sin(var6);
                    if (jaclib.memory.Stream.a()) {
                      var4.b(var9);
                      var4.b(var8);
                      var4.b(0.0f);
                      var5++;
                      continue L2;
                    } else {
                      var4.a(var9);
                      var4.a(var8);
                      var4.a(0.0f);
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
          this.field_G = this.a(10, new qma[]{new qma(pb.field_k)});
          return;
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.b(param0, param1, param2 + param0, param1, param3, param4);
    }

    final boolean m() {
        return false;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (!eja.a(param1, (byte) -120, param2)) {
            return false;
        }
        if (rc.a(param2, (byte) 91, param1) | (param0 != (param1 & 36864) ? true : false) | uoa.a(param2, param1, (byte) 9)) {
            return true;
        }
        return (bla.a(param1, false, param2) | ((param1 & 8192) != 0 ? true : false) | hsb.a(param2, 65536, param1)) & ((55 & param2) == 0 ? true : false);
    }

    abstract void a(jra param0, int param1, int param2, int param3);

    abstract void C(int param0);

    final void K(int[] param0) {
        try {
            param0[1] = this.field_xc;
            param0[0] = this.field_H;
            param0[3] = this.field_Bb;
            param0[2] = this.field_F;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pf.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_lb = param2;
        this.field_Gb = param1;
        this.field_k = param3;
        this.field_K = param0;
        this.f(true);
        this.x((byte) 54);
        this.w((byte) -101);
        this.b((byte) -103);
    }

    abstract gf a(int param0, int param1, byte[] param2, kb param3, int param4, int param5);

    final oj H(byte param0) {
        int var2 = 34 % ((param0 - -63) / 51);
        return this.field_Eb[this.field_ab];
    }

    final void g(int param0, int param1) {
        if (param1 >= -38) {
            this.field_sc = true;
        }
        if (!(param0 == this.field_ab)) {
            this.field_ab = param0;
            this.t(12);
        }
    }

    private final void x(byte param0) {
        int var2 = -18 % ((param0 - -54) / 63);
        this.field_N = false;
        this.e((byte) -94);
        if (!(pia.field_x != this.field_pb)) {
            this.x(17975);
        }
    }

    abstract void w(int param0);

    final aja a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        mjb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        mjb stackOut_0_0 = null;
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
            stackOut_0_0 = new mjb((pf) (this), param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("pf.W(");
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
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (aja) ((Object) stackIn_1_0);
    }

    final boolean w() {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        L0: {
          L1: {
            var8 = (float)param2 - (float)param0;
            var9 = (float)param3 - (float)param1;
            var10 = 0.0f;
            var11 = 1.0f;
            if (var8 != 0.0f) {
              break L1;
            } else {
              if (var9 == 0.0f) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var11 = (float)Math.sqrt((double)(var9 * var9 + var8 * var8));
          var10 = (float)Math.atan2((double)var9, (double)var8);
          break L0;
        }
        this.d(false);
        this.e(-125, param4);
        this.a(0, pea.field_d, 7);
        this.a(0, (byte) -71, pea.field_d);
        this.c(99, param6);
        this.field_O.a(5557, var11, (float)param5, 1.0f);
        this.field_O.a(-param5 / 2, 16383, 0, 0);
        this.field_O.a((int)((double)var10 * 2607.5945876176133) & 16383, 3);
        this.field_O.a(param1, 16383, 0, param0);
        this.h(20837);
        this.a(-72, false);
        this.r((byte) -54);
        this.a(-59, true);
        this.a(0, (byte) -117, qcb.field_q);
        this.a(0, qcb.field_q, 7);
    }

    final aja a(int param0, int param1, boolean param2) {
        return (aja) ((Object) new mjb((pf) (this), param0, param1, param2));
    }

    abstract void r(int param0);

    abstract void a(boolean param0, int param1, boolean param2, slb param3, int param4);

    final hdb J(int param0) {
        if (param0 != 10) {
            this.field_Lb = (fsb[]) null;
        }
        return this.field_kc == null ? null : this.field_kc.a((byte) -118);
    }

    final int D(int param0) {
        if (param0 < 78) {
            this.h(true);
        }
        return this.field_ib;
    }

    final void a(boolean param0, byte param1, boolean param2, int param3) {
        Object var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        opa var10 = null;
        int var11 = 0;
        int var12 = 0;
        oj var13 = null;
        int var14 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          L1: {
            var14 = VoidHunters.field_G;
            if (param3 != this.field_W) {
              break L1;
            } else {
              L2: {
                if (this.field_Tb) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L2;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  break L2;
                }
              }
              L3: {
                stackOut_4_0 = stackIn_4_0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (this.field_q) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              if (stackIn_7_0 != stackIn_7_1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L4: {
            var5_ref = null;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (!this.field_Tb) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L4;
            } else {
              stackOut_10_0 = 3;
              stackIn_12_0 = stackOut_10_0;
              break L4;
            }
          }
          L5: {
            var9 = stackIn_12_0;
            if (param3 < 0) {
              this.F((byte) 126);
              break L5;
            } else {
              L6: {
                L7: {
                  var5_ref = this.field_I.a(-1, param3);
                  var10 = this.field_a.a(-20292, param3);
                  if (var10.field_p != 0) {
                    break L7;
                  } else {
                    if (-1 == (var10.field_d ^ -1)) {
                      this.F((byte) 75);
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var10.field_h) {
                    stackOut_18_0 = 64;
                    stackIn_19_0 = stackOut_18_0;
                    break L8;
                  } else {
                    stackOut_17_0 = 128;
                    stackIn_19_0 = stackOut_17_0;
                    break L8;
                  }
                }
                var11 = stackIn_19_0;
                var12 = 50 * var11;
                var13 = this.H((byte) 24);
                var13.a((float)(var10.field_p * (this.field_pc % var12)) / (float)var12, (float)(this.field_pc % var12 * var10.field_d) / (float)var12, 49, 0.0f);
                this.a(vf.field_a, true);
                break L6;
              }
              var6 = var10.field_f;
              if (this.field_Tb) {
                break L5;
              } else {
                var8 = var10.field_o;
                var9 = var10.field_c;
                var7 = var10.field_n;
                break L5;
              }
            }
          }
          L9: {
            this.a(param2, false, var9, var7, var8, param0);
            if (null == this.field_E) {
              this.a((ura) (var5_ref), -113);
              this.h(-119, var6);
              break L9;
            } else {
              this.field_E.a((byte) 106, var6, (ura) (var5_ref));
              break L9;
            }
          }
          this.field_W = param3;
          this.field_q = this.field_Tb;
          break L0;
        }
        this.field_V = this.field_V & -8;
        var5 = -90 % ((-66 - param1) / 45);
    }

    final void b(boolean param0, int param1) {
        if (param1 != -1700) {
            this.E((byte) 77);
        }
        if (!(param0 == this.field_nc)) {
            this.field_nc = param0 ? true : false;
            this.F(param1 ^ -14310);
            this.field_V = this.field_V & -32;
        }
    }

    final void d(boolean param0, int param1) {
        if (param1 != -30305) {
            this.field_nc = true;
        }
        if (!((this.field_ub ? 1 : 0) != (!param0 ? 1 : 0))) {
            this.field_ub = param0 ? true : false;
            this.w(1);
            this.field_V = this.field_V & -32;
        }
    }

    private final void a(int param0, jra param1, int param2) {
        try {
            this.a((byte) -6, this.field_C, param0);
            this.a(101, this.field_ic);
            this.a(param1, 0, param2, -114);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pf.FH(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int g(int param0) {
        if (param0 != 3554) {
            return -16;
        }
        return this.field_Nb + this.field_ob + this.field_mb;
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = this.f((byte) -95);
        this.d(false);
        this.e(-123, param4);
        this.a(0, pea.field_d, 7);
        this.a(0, (byte) -113, pea.field_d);
        this.c(103, param5);
        this.field_O.a(5557, (float)(-1 + param2), (float)(param3 - 1), 1.0f);
        this.field_O.a(0.0f, (float)param0 - var7, -var7 + (float)param1, (byte) 13);
        this.h(20837);
        this.a(-118, false);
        this.a(0, era.field_o, 4);
        this.a(-110, true);
        this.a(0, (byte) -67, qcb.field_q);
        this.a(0, qcb.field_q, 7);
    }

    abstract void m(int param0);

    final oj z(byte param0) {
        if (param0 < 70) {
            this.field_pb = (mma) null;
        }
        return this.field_yb;
    }

    final boolean c() {
        return false;
    }

    final int t(byte param0) {
        if (param0 != 9) {
            return -4;
        }
        return this.field_ab;
    }

    private final void e(byte param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float[] var8 = null;
        L0: {
          if (this.field_N) {
            break L0;
          } else {
            L1: {
              L2: {
                var8 = this.field_c;
                var2 = var8;
                var3 = (float)(this.field_h * -this.field_K) / (float)this.field_lb;
                var4 = (float)(this.field_h * (this.field_db - this.field_K)) / (float)this.field_lb;
                var5 = (float)(this.field_Gb * this.field_h) / (float)this.field_k;
                var6 = (float)(this.field_h * (-this.field_i + this.field_Gb)) / (float)this.field_k;
                if (var4 == var3) {
                  break L2;
                } else {
                  if (var5 == var6) {
                    break L2;
                  } else {
                    var7 = (float)this.field_h * 2.0f;
                    var8[1] = 0.0f;
                    var8[7] = 0.0f;
                    var8[6] = 0.0f;
                    var8[3] = 0.0f;
                    var8[2] = 0.0f;
                    var8[12] = 0.0f;
                    this.field_xb = (float)this.field_Wb / (float)(-this.field_Wb + this.field_h);
                    var8[10] = (float)this.field_Wb / (float)(-this.field_Wb + this.field_h);
                    var8[0] = var7 / (var4 - var3);
                    var8[5] = var7 / (-var6 + var5);
                    var8[9] = (var5 + var6) / (-var6 + var5);
                    this.field_Z = (float)(this.field_h * this.field_Wb) / (float)(this.field_h - this.field_Wb);
                    var8[14] = (float)(this.field_h * this.field_Wb) / (float)(this.field_h - this.field_Wb);
                    var8[8] = (var3 + var4) / (-var3 + var4);
                    var8[4] = 0.0f;
                    var8[13] = 0.0f;
                    var8[11] = -1.0f;
                    var8[15] = 0.0f;
                    break L1;
                  }
                }
              }
              var8[5] = 1.0f;
              var8[9] = 0.0f;
              var8[3] = 0.0f;
              var8[12] = 0.0f;
              var8[4] = 0.0f;
              var8[14] = 0.0f;
              var8[2] = 0.0f;
              var8[1] = 0.0f;
              var8[6] = 0.0f;
              var8[13] = 0.0f;
              var8[11] = 0.0f;
              var8[15] = 1.0f;
              var8[10] = 1.0f;
              var8[8] = 0.0f;
              var8[0] = 1.0f;
              var8[7] = 0.0f;
              break L1;
            }
            this.g(true);
            this.field_N = true;
            break L0;
          }
        }
        L3: {
          if (param0 < -80) {
            break L3;
          } else {
            this.s(-105);
            break L3;
          }
        }
    }

    final boolean h() {
        return false;
    }

    private final void k(int param0) {
        eb discarded$0 = null;
        this.a((byte) -6, this.field_S, 0);
        if (param0 <= 102) {
            int[] var3 = (int[]) null;
            discarded$0 = this.a(-65, true, (int[]) null, -35, -49, false, 126);
        }
        this.a(124, this.field_o);
        this.a(tu.field_b, 0, 1, -93);
    }

    abstract void s(byte param0);

    abstract void a(byte param0, mkb param1, int param2);

    final int D(byte param0) {
        boolean discarded$0 = false;
        if (param0 > -109) {
            discarded$0 = this.a(-0.3812601566314697f, 0.24077846109867096f, (byte) 10, 0.3140295147895813f, 0.6470803022384644f, 1.3212025165557861f, 0.2246333807706833f);
        }
        return this.field_v;
    }

    abstract eb a(int param0, boolean param1, int[] param2, int param3, int param4, boolean param5, int param6);

    final void n(byte param0) {
        java.awt.Canvas var3_ref_java_awt_Canvas = null;
        int var4 = VoidHunters.field_G;
        Enumeration var2 = this.field_rb.keys();
        while (var2.hasMoreElements()) {
            var3_ref_java_awt_Canvas = (java.awt.Canvas) (var2.nextElement());
            this.a(var3_ref_java_awt_Canvas, this.field_rb.get(var3_ref_java_awt_Canvas), 0);
        }
        this.field_C.a(-96);
        this.field_S.a(-103);
        this.field_P.a(-117);
        int var3 = 19 % ((47 - param0) / 45);
        this.field_R.a(26385);
        this.field_D.a(26385);
        this.field_hb.a(26385);
        this.field_Jb.a(26385);
        this.field_w.a(26385);
        this.field_Ib.a(false);
        this.field_T.a(-127);
    }

    final boolean p() {
        return true;
    }

    final void a(kba param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              this.field_A[this.field_ab] = param0;
              if (!param1) {
                this.field_pc = 121;
                this.B((byte) 96);
                break L1;
              } else {
                this.B((byte) 96);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("pf.VF(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void q(byte param0) {
        if (param0 < 66) {
            this.k(12);
        }
    }

    abstract void i(byte param0);

    private final void q(int param0) {
        this.field_S = this.a(true, 3);
        boolean discarded$0 = this.field_S.a(12, 24, 95);
        this.field_o = this.a(10, new qma[]{new qma(pb.field_k)});
        if (param0 != 27191) {
            this.field_E = (uda) null;
        }
    }

    final void a(aba param0, boolean param1, aba param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            var4_int = 0;
            if (param1) {
              L1: {
                if (this.field_z[this.field_ab] != param2) {
                  this.field_z[this.field_ab] = param2;
                  var4_int = 1;
                  this.o(-97);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_U[this.field_ab] == param0) {
                  break L2;
                } else {
                  this.field_U[this.field_ab] = param0;
                  this.l((byte) 122);
                  var4_int = 1;
                  break L2;
                }
              }
              L3: {
                if (var4_int == 0) {
                  break L3;
                } else {
                  this.field_V = this.field_V & -30;
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
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("pf.FF(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void l(byte param0);

    public static void d(byte param0) {
        field_Yb = null;
        if (param0 != -101) {
            field_Yb = (String[]) null;
        }
    }

    final void i(int param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        Object discarded$0 = null;
        int var5 = VoidHunters.field_G;
        Hashtable var2 = new Hashtable();
        if (this.field_rb != null) {
            if (!(this.field_rb.isEmpty())) {
                var3 = this.field_rb.keys();
                while (var3.hasMoreElements()) {
                    var4 = (java.awt.Canvas) (var3.nextElement());
                    discarded$0 = var2.put(var4, this.a((byte) -53, var4));
                }
            }
        }
        this.field_rb = var2;
        this.b(true);
        if (param0 != 0) {
            this.field_Xb = false;
        }
        this.q(param0 ^ 27191);
        this.H(3096);
        this.field_Ib.a(24, (pf) (this));
    }

    final aja a(ima param0, boolean param1) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var3 = null;
        aja var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        aja stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        aja stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 == (param0.field_f ^ -1)) {
                  break L2;
                } else {
                  if (param0.field_e != 0) {
                    L3: {
                      var12 = new int[param0.field_e * param0.field_f];
                      var11 = var12;
                      var4 = var11;
                      var5 = 0;
                      var6 = 0;
                      if (param0.field_a != null) {
                        var7 = 0;
                        L4: while (true) {
                          if (var7 >= param0.field_e) {
                            break L3;
                          } else {
                            var8 = 0;
                            L5: while (true) {
                              if (param0.field_f <= var8) {
                                var7++;
                                continue L4;
                              } else {
                                incrementValue$3 = var6;
                                var6++;
                                var4[incrementValue$3] = knb.a(param0.field_b[dla.a(255, (int) param0.field_h[var5])], param0.field_a[var5] << 2005880152);
                                var5++;
                                var8++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          if (param0.field_e <= var7) {
                            break L3;
                          } else {
                            var8 = 0;
                            L7: while (true) {
                              if (param0.field_f <= var8) {
                                var7++;
                                continue L6;
                              } else {
                                L8: {
                                  incrementValue$4 = var5;
                                  var5++;
                                  var9 = param0.field_b[param0.field_h[incrementValue$4] & 255];
                                  incrementValue$5 = var6;
                                  var6++;
                                  stackOut_10_0 = (int[]) (var4);
                                  stackOut_10_1 = incrementValue$5;
                                  stackIn_12_0 = stackOut_10_0;
                                  stackIn_12_1 = stackOut_10_1;
                                  stackIn_11_0 = stackOut_10_0;
                                  stackIn_11_1 = stackOut_10_1;
                                  if (var9 != 0) {
                                    stackOut_12_0 = (int[]) ((Object) stackIn_12_0);
                                    stackOut_12_1 = stackIn_12_1;
                                    stackOut_12_2 = knb.a(-16777216, var9);
                                    stackIn_13_0 = stackOut_12_0;
                                    stackIn_13_1 = stackOut_12_1;
                                    stackIn_13_2 = stackOut_12_2;
                                    break L8;
                                  } else {
                                    stackOut_11_0 = (int[]) ((Object) stackIn_11_0);
                                    stackOut_11_1 = stackIn_11_1;
                                    stackOut_11_2 = 0;
                                    stackIn_13_0 = stackOut_11_0;
                                    stackIn_13_1 = stackOut_11_1;
                                    stackIn_13_2 = stackOut_11_2;
                                    break L8;
                                  }
                                }
                                stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                                var8++;
                                continue L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3_ref = this.a(param0.field_f, param0.field_f, var12, 0, (byte) 70, param0.field_e);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_ref = this.a(1, 1, new int[]{0}, 0, (byte) 92, 1);
              break L1;
            }
            var3_ref.a(param0.field_c, param0.field_g, param0.field_i, param0.field_d);
            stackOut_22_0 = (aja) (var3_ref);
            stackIn_23_0 = stackOut_22_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("pf.AB(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    final boolean k() {
        return true;
    }

    abstract void h(boolean param0);

    final boolean e() {
        return this.field_dc[3].a((byte) 111);
    }

    abstract void j(byte param0);

    final za e(int param0) {
        cba var2 = new cba(param0);
        this.field_s.b(-10258, var2);
        return (za) ((Object) var2);
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_nb = -18;
        }
        return this.field_Ob;
    }

    abstract eb a(kb param0, float[] param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7);

    final int u(byte param0) {
        if (param0 <= 78) {
            this.field_Z = -0.38502317667007446f;
        }
        return this.field_Pb;
    }

    final void a(pw param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              this.field_t = (oj) ((Object) param0);
              this.field_gb.a(this.field_t, 16383);
              this.field_gb.a(16489);
              this.field_yb.a(-25609, this.field_gb);
              this.field_f.a(-25609, this.field_t);
              if (this.field_pb.a(-12178)) {
                this.s(0);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("pf.FB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void a(za param0) {
        try {
            this.field_jc = ((cba) ((Object) param0)).field_f;
            this.field_m = this.field_jc.a(32768, false);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pf.GB(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(java.awt.Canvas param0, Object param1, int param2);

    abstract boolean a(mj param0, kb param1, int param2);

    static {
        field_Yb = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
