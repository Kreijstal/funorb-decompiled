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
        this.C((byte) 92);
        if (param0 < 106) {
            boolean discarded$0 = ((pf) this).q();
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if ((param0 ^ -1) >= -1) {
            if (-1 + ((pf) this).field_db <= param2) {
                if (param1 <= 0) {
                    if (!(param3 < -1 + ((pf) this).field_i)) {
                        ((pf) this).v(-120);
                        return;
                    }
                }
            }
        }
        ((pf) this).field_xc = -1 >= (param1 ^ -1) ? param1 : 0;
        ((pf) this).field_F = param2 > ((pf) this).field_db ? 0 : param2;
        ((pf) this).field_Bb = ((pf) this).field_db >= param3 ? param3 : 0;
        ((pf) this).field_H = param0 >= 0 ? param0 : 0;
        if (!((pf) this).field_ac) {
            ((pf) this).field_ac = true;
            ((pf) this).o((byte) 81);
        }
        ((pf) this).A((byte) -99);
        this.b((byte) -114);
    }

    final void r(byte param0) {
        if (param0 > -51) {
            ((pf) this).field_kc = null;
        }
        this.a(0, bk.field_v, 2);
    }

    final oj A(int param0) {
        if (param0 != 11) {
            Object var3 = null;
            ((pf) this).a(-91, (byte) 122, (slb) null);
        }
        return ((pf) this).field_O;
    }

    final void xa(float param0) {
        if (param0 != ((pf) this).field_Rb) {
            ((pf) this).field_Rb = param0;
            ((pf) this).field_Zb.setAmbient(param0);
            ((pf) this).h(true);
            ((pf) this).i((byte) 44);
        }
    }

    abstract void a(boolean param0, byte param1, slb param2, int param3);

    abstract void v(byte param0);

    abstract void G(byte param0);

    final void c(byte param0, boolean param1) {
        if (!((!((pf) this).field_Xb ? 1 : 0) == (!param1 ? 1 : 0))) {
            ((pf) this).field_Xb = param1 ? true : false;
            ((pf) this).B(-78);
            ((pf) this).field_V = ((pf) this).field_V & -8;
        }
        if (param0 >= -11) {
            ((pf) this).field_ob = 42;
        }
    }

    private final void l(int param0) {
        float var2 = 0.0f;
        if (param0 != 0) {
            return;
        }
        if (vl.field_p == ((pf) this).field_pb) {
            var2 = ((pf) this).f((byte) -128);
            ((pf) this).field_O.a(0.0f, var2, var2, (byte) 13);
        }
        ((pf) this).field_wb = false;
        ((pf) this).p((byte) 98);
        if (((pf) this).field_E != null) {
            ((pf) this).field_E.c(5);
        }
    }

    final oj E(int param0) {
        if (!((pf) this).field_wb) {
            ((pf) this).field_vc.a((pw) (Object) ((pf) this).field_O, (pw) (Object) ((pf) this).field_gb, true);
            ((pf) this).field_wb = true;
        }
        if (param0 != 0) {
            ((pf) this).field_ab = 111;
        }
        return ((pf) this).field_vc;
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.d(false);
        ((pf) this).e(-126, param4);
        ((pf) this).a(0, pea.field_d, 7);
        ((pf) this).a(0, (byte) -108, pea.field_d);
        ((pf) this).c(99, param5);
        ((pf) this).field_O.a(5557, (float)param2, (float)param3, 1.0f);
        ((pf) this).field_O.a(param1, 16383, 0, param0);
        ((pf) this).h(20837);
        ((pf) this).a(-44, false);
        ((pf) this).r((byte) -64);
        ((pf) this).a(-86, true);
        ((pf) this).a(0, (byte) -53, qcb.field_q);
        ((pf) this).a(0, qcb.field_q, 7);
    }

    private final void d(int param0) {
        if (null != ((pf) this).field_E) {
            ((pf) this).field_E.b(true);
        }
        if (param0 <= 105) {
            ((pf) this).field_S = null;
        }
        ((pf) this).j(8);
    }

    abstract void j(int param0);

    abstract void o(byte param0);

    final void a(int param0, byte param1, slb param2) {
        if (param1 >= -48) {
            ((pf) this).field_oc = -0.04896149784326553f;
        }
        ((pf) this).a(false, (byte) 94, param2, param0);
    }

    abstract float f(byte param0);

    private final void C(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        ((pf) this).h(true);
        ((pf) this).G((byte) 65);
        ((pf) this).B(-51);
        ((pf) this).f(68);
        ((pf) this).m(3);
        ((pf) this).i((byte) -119);
        ((pf) this).e(false);
        ((pf) this).F(12614);
        ((pf) this).y(-43);
        ((pf) this).w(1);
        ((pf) this).j(8);
        if (param0 <= 14) {
            ((pf) this).field_wb = false;
        }
        ((pf) this).j((byte) -56);
        ((pf) this).s((byte) -39);
        ((pf) this).I(17634);
        for (var2 = -1 + ((pf) this).field_L; var2 >= 0; var2--) {
            ((pf) this).g(var2, -63);
            ((pf) this).o(-88);
            ((pf) this).l((byte) 116);
            ((pf) this).F((byte) 112);
        }
        ((pf) this).v((byte) -109);
        ((pf) this).m((byte) 107);
        ((pf) this).y((byte) -65);
        ((pf) this).p((byte) 114);
        ((pf) this).G(17891);
    }

    abstract void B(int param0);

    final eb a(int param0, boolean param1, int param2, byte param3, int[] param4) {
        int var6 = -43 / ((23 - param3) / 56);
        return ((pf) this).a(param0, param1, param4, param2, 0, true, 0);
    }

    final boolean x() {
        return false;
    }

    private final void b(byte param0) {
        if (param0 >= -61) {
            int discarded$0 = ((pf) this).g(-117);
        }
    }

    final oj p(int param0) {
        if (param0 != 0) {
            ((pf) this).field_sb = false;
        }
        return ((pf) this).field_Eb[((pf) this).field_ab];
    }

    final void za(int param0, int param1, int param2, int param3, int param4) {
        this.d(false);
        ((pf) this).e(-128, param3);
        ((pf) this).a(0, pea.field_d, 7);
        ((pf) this).a(0, (byte) -65, pea.field_d);
        ((pf) this).c(83, param4);
        ((pf) this).field_O.a(5557, (float)param2, (float)param2, 1.0f);
        ((pf) this).field_O.a(param1, 16383, 0, param0);
        ((pf) this).h(20837);
        ((pf) this).a(-114, false);
        ((pf) this).a((byte) -6, ((pf) this).field_P, 0);
        ((pf) this).a(-51, ((pf) this).field_G);
        ((pf) this).a(bk.field_v, 0, 256, 66);
        ((pf) this).a(-82, true);
        ((pf) this).a(0, (byte) -122, qcb.field_q);
        ((pf) this).a(0, qcb.field_q, 7);
    }

    abstract void I(int param0);

    final void h(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = VoidHunters.field_G;
            if (param1 == 1) {
              ((pf) this).a(et.field_c, true, et.field_c);
              break L1;
            } else {
              if (param1 == 0) {
                ((pf) this).a(asa.field_a, true, asa.field_a);
                break L1;
              } else {
                if (param1 == 2) {
                  ((pf) this).a(et.field_c, true, df.field_o);
                  break L1;
                } else {
                  if (param1 == 3) {
                    ((pf) this).a(asa.field_a, true, je.field_c);
                    break L1;
                  } else {
                    if (-5 == (param1 ^ -1)) {
                      ((pf) this).a(feb.field_a, true, feb.field_a);
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
        ((pf) this).field_bb = ((pf) this).field_Kb;
        if (param0 < 66) {
            return;
        }
        ((pf) this).field_Kb = 0;
    }

    private final void u(int param0) {
        float[] var2 = null;
        float[] var3 = null;
        L0: {
          if (param0 == 1761) {
            break L0;
          } else {
            ((pf) this).v((byte) -73);
            break L0;
          }
        }
        L1: {
          if (!((pf) this).field_sb) {
            L2: {
              L3: {
                var3 = ((pf) this).field_l;
                var2 = var3;
                if (-1 == (((pf) this).field_db ^ -1)) {
                  break L3;
                } else {
                  if (((pf) this).field_i != 0) {
                    var2[9] = 0.0f;
                    var2[11] = 0.0f;
                    var2[3] = 0.0f;
                    var2[1] = 0.0f;
                    var2[10] = 0.5f;
                    var2[14] = 0.5f;
                    var2[5] = -2.0f / (float)((pf) this).field_i;
                    var2[8] = 0.0f;
                    var2[2] = 0.0f;
                    var2[0] = 2.0f / (float)((pf) this).field_db;
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
            ((pf) this).field_sb = true;
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
          if (((pf) this).field_tb == param0) {
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
              if (param1 != ((pf) this).field_oc) {
                break L2;
              } else {
                if (((pf) this).field_tc == param2) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            ((pf) this).field_oc = param1;
            ((pf) this).field_tc = param2;
            ((pf) this).field_tb = param0;
            if (var7 == 0) {
              break L3;
            } else {
              ((pf) this).field_Sb = (float)(16711680 & ((pf) this).field_tb) / 16711680.0f;
              ((pf) this).field_u = (float)(((pf) this).field_tb & 65280) / 65280.0f;
              ((pf) this).field_x = (float)(255 & ((pf) this).field_tb) / 255.0f;
              ((pf) this).h(true);
              break L3;
            }
          }
          ((pf) this).field_Zb.setSunColour(((pf) this).field_Sb, ((pf) this).field_u, ((pf) this).field_x, param1, param2);
          ((pf) this).G((byte) 56);
          break L1;
        }
        L4: {
          L5: {
            if (((pf) this).field_Db[0] != param3) {
              break L5;
            } else {
              if (((pf) this).field_Db[1] != param4) {
                break L5;
              } else {
                if (((pf) this).field_Db[2] != param5) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
          }
          ((pf) this).field_Db[1] = param4;
          ((pf) this).field_Db[2] = param5;
          ((pf) this).field_Db[0] = param3;
          ((pf) this).field_fb[2] = -param5;
          ((pf) this).field_fb[1] = -param4;
          ((pf) this).field_fb[0] = -param3;
          var8 = (float)(1.0 / Math.sqrt((double)(param5 * param5 + (param4 * param4 + param3 * param3))));
          ((pf) this).field_wc[1] = var8 * param4;
          ((pf) this).field_wc[0] = var8 * param3;
          ((pf) this).field_wc[2] = var8 * param5;
          ((pf) this).field_cb[0] = -((pf) this).field_wc[0];
          ((pf) this).field_cb[1] = -((pf) this).field_wc[1];
          ((pf) this).field_cb[2] = -((pf) this).field_wc[2];
          ((pf) this).field_Zb.setSunDirection(((pf) this).field_wc[0], ((pf) this).field_wc[1], ((pf) this).field_wc[2]);
          ((pf) this).m(3);
          break L4;
        }
        ((pf) this).i((byte) -120);
    }

    final int i() {
        return ((pf) this).field_h;
    }

    private final void s(int param0) {
        if (param0 != 0) {
            ((pf) this).field_mc = -87;
        }
        ((pf) this).field_wb = false;
        if (((pf) this).field_E != null) {
            ((pf) this).field_E.c((byte) 15);
        }
        ((pf) this).G(17891);
    }

    private final void f(boolean param0) {
        ((pf) this).field_Ub = false;
        this.k((byte) 97);
        if (tib.field_h == ((pf) this).field_pb) {
            this.x(17975);
        }
        if (!param0) {
            this.d(27);
        }
    }

    pf(java.awt.Canvas param0, Object param1, d param2, asb param3, int param4, int param5) {
        super(param2);
        Throwable var7 = null;
        int var8 = 0;
        opa var9 = null;
        java.awt.Dimension var11 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((pf) this).field_s = new ij();
                    ((pf) this).field_ec = true;
                    ((pf) this).field_O = new oj();
                    ((pf) this).field_t = new oj();
                    ((pf) this).field_f = new oj();
                    ((pf) this).field_gb = new oj();
                    ((pf) this).field_yb = new oj();
                    ((pf) this).field_vc = new oj();
                    ((pf) this).field_Hb = false;
                    ((pf) this).field_X = false;
                    ((pf) this).field_Y = 0;
                    ((pf) this).field_v = -1;
                    ((pf) this).field_h = 50;
                    ((pf) this).field_l = new float[16];
                    ((pf) this).field_wb = false;
                    ((pf) this).field_Bb = 0;
                    ((pf) this).field_c = new float[16];
                    ((pf) this).field_M = true;
                    ((pf) this).field_Db = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
                    ((pf) this).field_Rb = 1.0f;
                    ((pf) this).field_ab = 0;
                    ((pf) this).field_B = 1.0f;
                    ((pf) this).field_H = 0;
                    ((pf) this).field_Qb = 0;
                    ((pf) this).field_J = new float[16];
                    ((pf) this).field_k = 512;
                    ((pf) this).field_fb = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
                    ((pf) this).field_u = 1.0f;
                    ((pf) this).field_q = false;
                    ((pf) this).field_j = -1;
                    ((pf) this).field_d = 0;
                    ((pf) this).field_F = 0;
                    ((pf) this).field_Gb = 0;
                    ((pf) this).field_tc = -1.0f;
                    ((pf) this).field_ib = -1;
                    ((pf) this).field_x = 1.0f;
                    ((pf) this).field_Xb = false;
                    ((pf) this).field_hc = false;
                    ((pf) this).field_lb = 512;
                    ((pf) this).field_lc = -1;
                    ((pf) this).field_nb = 0;
                    ((pf) this).field_nc = false;
                    ((pf) this).field_K = 0;
                    ((pf) this).field_Wb = 3584;
                    ((pf) this).field_dc = new uda[10];
                    ((pf) this).field_cb = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
                    ((pf) this).field_sb = false;
                    ((pf) this).field_g = true;
                    ((pf) this).field_gc = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                    ((pf) this).field_pb = pob.field_c;
                    ((pf) this).field_Cb = 0;
                    ((pf) this).field_mc = 1;
                    ((pf) this).field_Fb = ((pf) this).field_gc;
                    ((pf) this).field_wc = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
                    ((pf) this).field_W = -1;
                    ((pf) this).field_N = false;
                    ((pf) this).field_Ub = false;
                    ((pf) this).field_tb = 16777215;
                    ((pf) this).field_eb = true;
                    ((pf) this).field_cc = true;
                    ((pf) this).field_Ob = 0;
                    ((pf) this).field_y = 0;
                    ((pf) this).field_oc = -1.0f;
                    ((pf) this).field_Sb = 1.0f;
                    ((pf) this).field_zb = true;
                    ((pf) this).field_xc = 0;
                    ((pf) this).field_fc = to.field_o;
                    ((pf) this).field_n = 128;
                    ((pf) this).field_kb = new jaclib.memory.Stream();
                    oj discarded$1 = new oj();
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((pf) this).field_Ab = param3;
                        ((pf) this).field_rc = param4;
                        ((pf) this).field_qc = param1;
                        var11 = param0.getSize();
                        ((pf) this).field_e = param5;
                        ((pf) this).field_i = var11.height;
                        ((pf) this).field_db = var11.width;
                        ocb.a(false, (byte) 33, true);
                        if (((pf) this).field_a == null) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((pf) this).field_I = new atb((pf) this, ((pf) this).field_a);
                        ((pf) this).field_Zb = new jagex3.graphics2.hw.NativeInterface(((pf) this).field_a.a(11316), ((pf) this).field_e);
                        var8 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var8 >= ((pf) this).field_a.a(11316)) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9 = ((pf) this).field_a.a(-20292, var8);
                        if (var9 == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((pf) this).field_Zb.initTextureMetrics(var8, var9.field_b, var9.field_g);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((pf) this).field_Zb = new jagex3.graphics2.hw.NativeInterface(0, ((pf) this).field_e);
                        ((pf) this).field_I = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var7 = caughtException;
                    var7.printStackTrace();
                    ((pf) this).a((byte) 30);
                    throw new RuntimeException("");
                }
                case 10: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int XA() {
        return ((pf) this).field_Wb;
    }

    final boolean r() {
        return false;
    }

    final void c(byte param0) {
        int var2 = 42 % ((param0 - -29) / 36);
        if (((pf) this).field_V != 4) {
            ((pf) this).h((byte) 6);
            ((pf) this).d(false, -30305);
            ((pf) this).c((byte) -35, false);
            ((pf) this).b(false, -1700);
            ((pf) this).b((byte) -74, false);
            ((pf) this).a(false, (byte) 18, false, -2);
            ((pf) this).c(92, 1);
            ((pf) this).h(87, 0);
            ((pf) this).field_V = 4;
        }
    }

    abstract void a(byte param0, uja param1);

    final eb a(int param0, kb param1, int param2, int param3, boolean param4, byte[] param5) {
        if (param2 != 0) {
            int discarded$0 = ((pf) this).t((byte) -110);
        }
        return ((pf) this).a(0, param5, param1, 0, param0, param3, param4, param2 + 11);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
    }

    private final void d(boolean param0) {
        if (param0) {
            ((pf) this).field_vc = null;
        }
        if (((pf) this).field_V != 1) {
            ((pf) this).h((byte) -124);
            ((pf) this).d(false, -30305);
            ((pf) this).c((byte) -58, false);
            ((pf) this).b(false, -1700);
            ((pf) this).b((byte) -74, false);
            ((pf) this).a(false, (byte) 125, false, -2);
            ((pf) this).h(32, 1);
            ((pf) this).a(((pf) this).field_Q, -123);
            ((pf) this).field_V = 1;
        }
    }

    abstract void A(byte param0);

    private final void g(boolean param0) {
        ((pf) this).field_c[10] = ((pf) this).field_xb;
        ((pf) this).field_c[14] = ((pf) this).field_Z;
        if (!param0) {
            oj discarded$0 = ((pf) this).z((byte) -70);
        }
    }

    final void c(boolean param0) {
        ((pf) this).field_O.c(1);
        ((pf) this).field_ec = param0 ? true : false;
        this.l(0);
    }

    final da a(sw param0, ima[] param1, boolean param2) {
        return (da) (Object) new rp((pf) this, param0, param1, param2);
    }

    final boolean n() {
        return true;
    }

    private final void x(int param0) {
        ((pf) this).y((byte) -66);
        if (param0 != 17975) {
            return;
        }
        if (null != ((pf) this).field_E) {
            ((pf) this).field_E.a(true);
        }
    }

    abstract void e(boolean param0);

    final void z(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        ((pf) this).field_bc = new ura[((pf) this).field_L];
        ((pf) this).field_A = new kba[((pf) this).field_L];
        ((pf) this).field_z = new aba[((pf) this).field_L];
        ((pf) this).field_Eb = new oj[((pf) this).field_L];
        ((pf) this).field_U = new aba[((pf) this).field_L];
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((pf) this).field_L) {
            L1: {
              ((pf) this).field_Lb = new fsb[-2 + ((pf) this).field_qb];
              ((pf) this).field_Q = (ura) (Object) ((pf) this).a(125, 1, 1, qua.field_d, mj.field_f);
              ((pf) this).a((za) (Object) new cba(262144));
              ((pf) this).field_Vb = ((pf) this).a(10, new qma[1]);
              vmb discarded$8 = ((pf) this).a(10, new qma[1]);
              vmb discarded$9 = ((pf) this).a(param0 ^ -31099, new qma[4]);
              vmb discarded$10 = ((pf) this).a(10, new qma[3]);
              roa discarded$11 = new roa((pf) this, 0, 0, false, false);
              ((pf) this).field_R = new roa((pf) this, 0, 0, true, true);
              roa discarded$12 = new roa((pf) this, 0, 0, false, false);
              ((pf) this).field_D = new roa((pf) this, 0, 0, true, true);
              roa discarded$13 = new roa((pf) this, 0, 0, false, false);
              ((pf) this).field_hb = new roa((pf) this, 0, 0, true, true);
              roa discarded$14 = new roa((pf) this, 0, 0, false, false);
              ((pf) this).field_Jb = new roa((pf) this, 0, 0, true, true);
              roa discarded$15 = new roa((pf) this, 0, 0, false, false);
              ((pf) this).field_w = new roa((pf) this, 0, 0, true, true);
              ((pf) this).field_Ib = new je((pf) this);
              ((pf) this).field_T = ((pf) this).a((byte) -19, true);
              ((pf) this).i(param0 ^ -31089);
              ((pf) this).field_Mb = new rga((pf) this);
              ((pf) this).field_dc[1] = ((pf) this).a((byte) -123, 1);
              ((pf) this).field_dc[2] = ((pf) this).a((byte) 33, 2);
              ((pf) this).field_dc[4] = ((pf) this).a((byte) 119, 4);
              ((pf) this).field_dc[5] = ((pf) this).a((byte) -114, 5);
              ((pf) this).field_dc[6] = ((pf) this).a((byte) 35, 6);
              ((pf) this).field_dc[7] = ((pf) this).a((byte) -97, 7);
              ((pf) this).field_dc[3] = ((pf) this).a((byte) 115, 3);
              ((pf) this).field_dc[8] = ((pf) this).a((byte) -114, 8);
              ((pf) this).field_dc[9] = ((pf) this).a((byte) -114, 9);
              if (!((pf) this).field_dc[2].a((byte) -89)) {
                ((pf) this).field_dc[2] = ((pf) this).a((byte) -115, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((pf) this).field_dc[4].a((byte) -40)) {
                break L2;
              } else {
                ((pf) this).field_dc[4] = ((pf) this).field_dc[2];
                break L2;
              }
            }
            L3: {
              if (!((pf) this).field_dc[8].a((byte) 127)) {
                ((pf) this).field_dc[8] = ((pf) this).field_dc[4];
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!((pf) this).field_dc[9].a((byte) 110)) {
                ((pf) this).field_dc[9] = ((pf) this).field_dc[8];
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 == -31089) {
                break L5;
              } else {
                ((pf) this).field_wc = null;
                break L5;
              }
            }
            ((pf) this).n(125);
            ((pf) this).v(param0 + 31003);
            ((pf) this).v();
            return;
          } else {
            ((pf) this).field_U[var2] = asa.field_a;
            ((pf) this).field_z[var2] = asa.field_a;
            ((pf) this).field_A[var2] = fsa.field_o;
            ((pf) this).field_Eb[var2] = new oj();
            var2++;
            continue L0;
          }
        }
    }

    abstract void p(byte param0);

    final void c(boolean param0, int param1) {
        if (!((param0 ? 1 : 0) != (!((pf) this).field_Hb ? 1 : 0))) {
            ((pf) this).field_Hb = param0 ? true : false;
            ((pf) this).B(-118);
        }
        if (param1 < 32) {
            ((pf) this).l((byte) -50);
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
            ((pf) this).field_hb = null;
            break L0;
          }
        }
        L1: {
          if (((pf) this).field_Ub) {
            break L1;
          } else {
            L2: {
              L3: {
                var9 = ((pf) this).field_J;
                var2 = var9;
                var3 = (float)((pf) this).field_h;
                var4 = (float)((pf) this).field_Wb;
                var5 = ((pf) this).field_B * (float)(-((pf) this).field_Gb) / (float)((pf) this).field_k;
                var6 = ((pf) this).field_B * (float)(-((pf) this).field_K) / (float)((pf) this).field_lb;
                var7 = (float)(-((pf) this).field_K + ((pf) this).field_db) * ((pf) this).field_B / (float)((pf) this).field_lb;
                var8 = (float)(((pf) this).field_i + -((pf) this).field_Gb) * ((pf) this).field_B / (float)((pf) this).field_k;
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
            ((pf) this).field_Ub = true;
            break L1;
          }
        }
    }

    abstract vmb a(int param0, qma[] param1);

    abstract void o(int param0);

    private final boolean a(float param0, float param1, byte param2, float param3, float param4, float param5, float param6) {
        jaclib.memory.Buffer var10 = ((pf) this).field_S.a(true, (byte) 87);
        if (var10 == null) {
            return false;
        }
        jaclib.memory.Stream var9 = ((pf) this).a(var10, false);
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
            ((pf) this).field_Bb = -117;
        }
        var9.b();
        return ((pf) this).field_S.b(-20836);
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        int var8 = 0;
        Object var9 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          if (!param1) {
            break L0;
          } else {
            var9 = null;
            gf discarded$1 = ((pf) this).a(-31, -99, (byte[]) null, (kb) null, -65, -32);
            break L0;
          }
        }
        L1: {
          param0 = param0 & ((pf) this).e();
          if (param0) {
            break L1;
          } else {
            L2: {
              if (-5 == param2) {
                break L2;
              } else {
                if (param2 == 8) {
                  break L2;
                } else {
                  if (-10 == param2) {
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
          if (((pf) this).field_nb != param2) {
            L6: {
              if (((pf) this).field_nb == 0) {
                break L6;
              } else {
                ((pf) this).field_dc[2147483647 & ((pf) this).field_nb].a(2543);
                break L6;
              }
            }
            L7: {
              if (param2 == 0) {
                ((pf) this).field_E = null;
                break L7;
              } else {
                ((pf) this).field_E = ((pf) this).field_dc[2147483647 & param2];
                ((pf) this).field_E.a(5, param5);
                ((pf) this).field_E.b(5, param5);
                ((pf) this).field_E.a(param4, param3, 5);
                break L7;
              }
            }
            ((pf) this).field_nb = param2;
            ((pf) this).field_y = param3;
            ((pf) this).field_d = param4;
            break L5;
          } else {
            if (((pf) this).field_nb == 0) {
              break L5;
            } else {
              L8: {
                ((pf) this).field_dc[((pf) this).field_nb & 2147483647].b(5, param5);
                if (param3 != ((pf) this).field_y) {
                  break L8;
                } else {
                  if (param4 == ((pf) this).field_d) {
                    break L5;
                  } else {
                    break L8;
                  }
                }
              }
              ((pf) this).field_dc[2147483647 & ((pf) this).field_nb].a(param4, param3, 5);
              ((pf) this).field_d = param4;
              ((pf) this).field_y = param3;
              break L5;
            }
          }
        }
    }

    abstract void F(int param0);

    final void a(boolean param0, boolean param1) {
        if ((!((pf) this).field_cc ? 1 : 0) != (!param0 ? 1 : 0)) {
            ((pf) this).field_cc = param0 ? true : false;
            ((pf) this).w(1);
        }
        if (param1) {
            ((pf) this).s(-21, -6, -111, -17, -121);
        }
    }

    abstract void t(int param0);

    final void v(int param0) {
        ((pf) this).field_Bb = ((pf) this).field_i;
        ((pf) this).field_H = 0;
        ((pf) this).field_F = ((pf) this).field_db;
        ((pf) this).field_xc = 0;
        if (!(!((pf) this).field_ac)) {
            ((pf) this).field_ac = false;
            ((pf) this).o((byte) 81);
        }
        this.b((byte) -114);
        if (param0 > -53) {
            Object var3 = null;
            eb discarded$0 = ((pf) this).a(-67, false, 114, (byte) 35, (int[]) null);
        }
    }

    final void c(int param0, int param1) {
        int var4 = 0;
        clb var3 = null;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (param0 < 53) {
            return;
        }
        if (((pf) this).field_mc == param1) {
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
            if ((var5 == 0 ? 1 : 0) != (!((pf) this).field_eb ? 1 : 0)) {
                ((pf) this).field_eb = var5 != 0 ? true : false;
                ((pf) this).I(17634);
            }
            if (!((!((pf) this).field_zb ? 1 : 0) == (var4 == 0 ? 1 : 0))) {
                ((pf) this).field_zb = var4 != 0 ? true : false;
                ((pf) this).j((byte) -56);
            }
            if (var3 != ((pf) this).field_fc) {
                ((pf) this).field_fc = var3;
                ((pf) this).s((byte) -39);
            }
            ((pf) this).field_mc = param1;
            ((pf) this).field_V = ((pf) this).field_V & -29;
        }
    }

    final void h(byte param0) {
        mma var3 = null;
        int var2 = -109 / ((param0 - -65) / 34);
        if (!(((pf) this).field_pb == vl.field_p)) {
            var3 = ((pf) this).field_pb;
            ((pf) this).field_pb = vl.field_p;
            if (!(!var3.a(-12178))) {
                this.s(0);
            }
            this.u(1761);
            ((pf) this).field_Fb = ((pf) this).field_l;
            this.x(17975);
            ((pf) this).field_V = ((pf) this).field_V & -25;
        }
    }

    final void e(int param0, int param1) {
        if (param0 > -121) {
            ((pf) this).e(-49, -58);
        }
        if (((pf) this).field_jb != param1) {
            ((pf) this).field_jb = param1;
            ((pf) this).v((byte) -109);
        }
    }

    abstract hdb a(boolean param0, int param1, int[][] param2, int param3);

    final ka a(cbb param0, int param1, int param2, int param3, int param4) {
        return (ka) (Object) new roa((pf) this, param0, param1, param3, param4, param2);
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
          ((pf) this).e(-128, param4);
          ((pf) this).a(0, pea.field_d, 7);
          ((pf) this).a(0, (byte) -118, pea.field_d);
          ((pf) this).c(72, param5);
          ((pf) this).c(true);
          ((pf) this).a(-75, false);
          this.k(126);
          ((pf) this).a(-101, true);
          ((pf) this).a(0, (byte) -70, qcb.field_q);
          ((pf) this).a(0, qcb.field_q, 7);
          return;
        } else {
          return;
        }
    }

    final int[] Y() {
        return new int[]{((pf) this).field_K, ((pf) this).field_Gb, ((pf) this).field_lb, ((pf) this).field_k};
    }

    final void w(byte param0) {
        mma var2 = null;
        if (!(pob.field_c == ((pf) this).field_pb)) {
            var2 = ((pf) this).field_pb;
            ((pf) this).field_pb = pob.field_c;
            if (!(!var2.a(-12178))) {
                this.s(0);
            }
            ((pf) this).field_V = ((pf) this).field_V & -32;
            ((pf) this).field_Fb = ((pf) this).field_gc;
        }
        if (param0 != -101) {
            ((pf) this).field_S = null;
        }
    }

    abstract eb a(int param0, byte[] param1, kb param2, int param3, int param4, int param5, boolean param6, int param7);

    void o() {
        ksa var1 = null;
        java.awt.Canvas var2 = null;
        int var3 = VoidHunters.field_G;
        if (!(((pf) this).field_hc)) {
            var1 = ((pf) this).field_s.d(0);
            while (var1 != null) {
                ((cba) (Object) var1).a(true);
                var1 = ((pf) this).field_s.a((byte) 116);
            }
            var1 = (ksa) (Object) ((pf) this).field_rb.keys();
            while (((Enumeration) (Object) var1).hasMoreElements()) {
                var2 = (java.awt.Canvas) ((Enumeration) (Object) var1).nextElement();
                ((pf) this).a(var2, ((pf) this).field_rb.get((Object) (Object) var2), 0);
            }
            uhb.a((byte) 104, true, false);
            ((pf) this).field_Zb.release();
            ((pf) this).field_hc = true;
        }
    }

    abstract void d(int param0, int param1);

    abstract eb a(int param0, int param1, int param2, kb param3, mj param4);

    abstract void G(int param0);

    final boolean l() {
        return true;
    }

    final eb a(int param0, int param1, float[] param2, boolean param3, int param4, kb param5) {
        if (param4 != -1) {
            hdb discarded$0 = ((pf) this).a(false, -91, (int[][]) null, -127);
        }
        return ((pf) this).a(param5, param2, param3, 0, param1, 0, true, param0);
    }

    final void E(byte param0) {
        if (!(((pf) this).field_V == 2)) {
            ((pf) this).h((byte) -121);
            ((pf) this).d(false, param0 + -30416);
            ((pf) this).c((byte) -112, false);
            ((pf) this).b(false, -1700);
            ((pf) this).b((byte) -74, false);
            ((pf) this).a(false, (byte) -128, false, -2);
            ((pf) this).field_V = 2;
        }
        if (param0 != 111) {
            ((pf) this).l((byte) -103);
        }
    }

    final jaclib.memory.heap.NativeHeapBuffer a(boolean param0, int param1, int param2) {
        int var4 = -73 % ((param1 - 37) / 38);
        return ((pf) this).field_jc.a(param2, param0);
    }

    final void T(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(((pf) this).field_H >= param0)) {
            var5 = 1;
            ((pf) this).field_H = param0;
        }
        if (!(param2 >= ((pf) this).field_F)) {
            ((pf) this).field_F = param2;
            var5 = 1;
        }
        if (!(param1 <= ((pf) this).field_xc)) {
            ((pf) this).field_xc = param1;
            var5 = 1;
        }
        if (param3 < ((pf) this).field_Bb) {
            ((pf) this).field_Bb = param3;
            var5 = 1;
        }
        if (var5 != 0) {
            if (!((pf) this).field_ac) {
                ((pf) this).field_ac = true;
                ((pf) this).o((byte) 81);
            }
            ((pf) this).A((byte) -104);
            this.b((byte) -89);
        }
    }

    final oj g(byte param0) {
        if (param0 <= 5) {
            boolean discarded$0 = ((pf) this).l();
        }
        return ((pf) this).field_gb;
    }

    abstract void y(byte param0);

    final int t() {
        return -2 + ((pf) this).field_qb;
    }

    final void P(int param0, int param1, int param2, int param3, int param4) {
        ((pf) this).b(param0, param1, param0, param2 + param1, param3, param4);
    }

    final pw d() {
        return (pw) (Object) new oj();
    }

    private final void b(boolean param0) {
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (param0) {
          ((pf) this).field_C = ((pf) this).a(false, 3);
          boolean discarded$1 = ((pf) this).field_C.a(28, 140, 126);
          var2 = 0;
          L0: while (true) {
            L1: {
              if (4 <= var2) {
                break L1;
              } else {
                var3 = ((pf) this).field_C.a(true, (byte) 119);
                if (var3 != null) {
                  L2: {
                    var4 = ((pf) this).a(var3, false);
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
                  if (((pf) this).field_C.b(-20836)) {
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
            ((pf) this).field_ic = ((pf) this).a(10, new qma[1]);
            return;
          }
        } else {
          return;
        }
    }

    final jaclib.memory.Stream a(jaclib.memory.Buffer param0, boolean param1) {
        if (param1) {
            ((pf) this).field_Eb = null;
        }
        ((pf) this).field_kb.a(param0);
        return ((pf) this).field_kb;
    }

    final float[] a(int param0, float[] param1) {
        param1[8] = ((pf) this).field_Fb[2];
        param1[0] = ((pf) this).field_Fb[0];
        param1[4] = ((pf) this).field_Fb[1];
        param1[12] = ((pf) this).field_Fb[3];
        if (param0 < 98) {
            ((pf) this).field_x = -0.8953596949577332f;
        }
        param1[13] = ((pf) this).field_Fb[7];
        param1[2] = ((pf) this).field_Fb[8];
        param1[1] = ((pf) this).field_Fb[4];
        param1[5] = ((pf) this).field_Fb[5];
        param1[9] = ((pf) this).field_Fb[6];
        param1[7] = ((pf) this).field_Fb[13];
        param1[6] = ((pf) this).field_Fb[9];
        param1[3] = ((pf) this).field_Fb[12];
        param1[14] = ((pf) this).field_Fb[11];
        param1[10] = ((pf) this).field_Fb[10];
        param1[11] = ((pf) this).field_Fb[14];
        param1[15] = ((pf) this).field_Fb[15];
        return param1;
    }

    abstract void a(int param0, vmb param1);

    final void a(int param0, slb param1, int param2) {
        ((pf) this).a(false, param2 + -21122, false, param1, param0);
        if (param2 != 7) {
            boolean discarded$0 = ((pf) this).a();
        }
    }

    private final void B(byte param0) {
        ((pf) this).C(0);
        if (param0 != 96) {
            ((pf) this).field_Db = null;
        }
        if (((pf) this).field_E != null) {
            ((pf) this).field_E.d(8);
        }
    }

    final void F(byte param0) {
        if (param0 <= 63) {
            ((pf) this).field_yb = null;
        }
        if (((pf) this).field_A[((pf) this).field_ab] != fsa.field_o) {
            ((pf) this).field_A[((pf) this).field_ab] = fsa.field_o;
            ((pf) this).field_Eb[((pf) this).field_ab].c(1);
            this.B((byte) 96);
        }
    }

    abstract void m(byte param0);

    final boolean f() {
        return ((pf) this).field_sc;
    }

    uda a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var3 = 79 % ((param0 - -34) / 63);
        var4 = param1;
        if (-7 == (var4 ^ -1)) {
          return (uda) (Object) new sv((pf) this);
        } else {
          if (var4 != 1) {
            if (var4 == 2) {
              return (uda) (Object) new wu((pf) this, ((pf) this).field_Mb);
            } else {
              if (var4 != 7) {
                return (uda) (Object) new bib((pf) this);
              } else {
                return (uda) (Object) new hab((pf) this);
              }
            }
          } else {
            return (uda) (Object) new qr((pf) this);
          }
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        this.d(false);
        ((pf) this).e(-126, param3);
        ((pf) this).a(0, pea.field_d, 7);
        ((pf) this).a(0, (byte) -65, pea.field_d);
        ((pf) this).c(58, param4);
        ((pf) this).field_O.a(5557, (float)param2, (float)param2, 1.0f);
        ((pf) this).field_O.a(param1, 16383, 0, param0);
        ((pf) this).h(20837);
        ((pf) this).a(-112, false);
        ((pf) this).a((byte) -6, ((pf) this).field_P, 0);
        ((pf) this).a(115, ((pf) this).field_G);
        ((pf) this).a(era.field_o, 1, 256, -114);
        ((pf) this).a(-27, true);
        ((pf) this).a(0, (byte) -97, qcb.field_q);
        ((pf) this).a(0, qcb.field_q, 7);
    }

    abstract boolean a(int param0, kb param1, mj param2);

    abstract Object a(byte param0, java.awt.Canvas param1);

    abstract void a(int param0, boolean param1);

    abstract vca a(byte param0, boolean param1);

    final void f(int param0, int param1) {
        if (param0 == ((pf) this).field_h) {
            // if_icmpne L19
        } else {
            ((pf) this).field_h = param0;
            ((pf) this).field_Wb = param1;
            this.x((byte) 20);
            this.f(true);
            this.d(112);
        }
    }

    void c(int param0) {
        if (null != ((pf) this).field_I) {
            ((pf) this).field_I.a((byte) -106);
        }
        ((pf) this).field_pc = param0 & 2147483647;
    }

    final void h(int param0) {
        if (param0 != 20837) {
            return;
        }
        ((pf) this).field_ec = false;
        this.l(0);
    }

    final void a(ura param0, int param1) {
        if (param1 > -105) {
            aja discarded$0 = ((pf) this).a(91, -101, true);
        }
        if (param0 != ((pf) this).field_bc[((pf) this).field_ab]) {
            ((pf) this).field_bc[((pf) this).field_ab] = param0;
            if (param0 == null) {
                ((pf) this).r(3);
            } else {
                param0.b(-27445);
            }
            ((pf) this).field_V = ((pf) this).field_V & -2;
        }
    }

    abstract mkb a(boolean param0, int param1);

    final void b(byte param0, boolean param1) {
        if (param0 != -74) {
            this.B((byte) 123);
        }
        if (!((!param1 ? 1 : 0) != (((pf) this).field_X ? 1 : 0))) {
            ((pf) this).field_X = param1 ? true : false;
            ((pf) this).y(param0 ^ 22);
            ((pf) this).field_V = ((pf) this).field_V & -32;
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
        ((pf) this).field_P = ((pf) this).a(false, param0 + -3093);
        boolean discarded$2 = ((pf) this).field_P.a(12, param0, 86);
        var2 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= 4) {
              break L1;
            } else {
              var3 = ((pf) this).field_P.a(true, (byte) 52);
              if (var3 != null) {
                var4 = ((pf) this).a(var3, false);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var5 = 0;
                L2: while (true) {
                  if ((var5 ^ -1) < -257) {
                    var4.b();
                    if (((pf) this).field_P.b(param0 ^ -23932)) {
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
          ((pf) this).field_G = ((pf) this).a(10, new qma[1]);
          return;
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        ((pf) this).b(param0, param1, param2 + param0, param1, param3, param4);
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
        param0[1] = ((pf) this).field_xc;
        param0[0] = ((pf) this).field_H;
        param0[3] = ((pf) this).field_Bb;
        param0[2] = ((pf) this).field_F;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        ((pf) this).field_lb = param2;
        ((pf) this).field_Gb = param1;
        ((pf) this).field_k = param3;
        ((pf) this).field_K = param0;
        this.f(true);
        this.x((byte) 54);
        ((pf) this).w((byte) -101);
        this.b((byte) -103);
    }

    abstract gf a(int param0, int param1, byte[] param2, kb param3, int param4, int param5);

    final oj H(byte param0) {
        int var2 = 34 % ((param0 - -63) / 51);
        return ((pf) this).field_Eb[((pf) this).field_ab];
    }

    final void g(int param0, int param1) {
        if (param1 >= -38) {
            ((pf) this).field_sc = true;
        }
        if (!(param0 == ((pf) this).field_ab)) {
            ((pf) this).field_ab = param0;
            ((pf) this).t(12);
        }
    }

    private final void x(byte param0) {
        int var2 = -18 % ((param0 - -54) / 63);
        ((pf) this).field_N = false;
        this.e((byte) -94);
        if (!(pia.field_x != ((pf) this).field_pb)) {
            this.x(17975);
        }
    }

    abstract void w(int param0);

    final aja a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        return (aja) (Object) new mjb((pf) this, param3, param4, param0, param1, param2);
    }

    final boolean w() {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        float var8 = (float)param2 - (float)param0;
        float var9 = (float)param3 - (float)param1;
        float var10 = 0.0f;
        float var11 = 1.0f;
        if (var8 == 0.0f) {
            // ifeq L68
        }
        var11 = (float)Math.sqrt((double)(var9 * var9 + var8 * var8));
        var10 = (float)Math.atan2((double)var9, (double)var8);
        this.d(false);
        ((pf) this).e(-125, param4);
        ((pf) this).a(0, pea.field_d, 7);
        ((pf) this).a(0, (byte) -71, pea.field_d);
        ((pf) this).c(99, param6);
        ((pf) this).field_O.a(5557, var11, (float)param5, 1.0f);
        ((pf) this).field_O.a(-param5 / 2, 16383, 0, 0);
        ((pf) this).field_O.a((int)((double)var10 * 2607.5945876176133) & 16383, 3);
        ((pf) this).field_O.a(param1, 16383, 0, param0);
        ((pf) this).h(20837);
        ((pf) this).a(-72, false);
        ((pf) this).r((byte) -54);
        ((pf) this).a(-59, true);
        ((pf) this).a(0, (byte) -117, qcb.field_q);
        ((pf) this).a(0, qcb.field_q, 7);
    }

    final aja a(int param0, int param1, boolean param2) {
        return (aja) (Object) new mjb((pf) this, param0, param1, param2);
    }

    abstract void r(int param0);

    abstract void a(boolean param0, int param1, boolean param2, slb param3, int param4);

    final hdb J(int param0) {
        if (param0 != 10) {
            ((pf) this).field_Lb = null;
        }
        return ((pf) this).field_kc == null ? null : ((pf) this).field_kc.a((byte) -118);
    }

    final int D(int param0) {
        if (param0 < 78) {
            ((pf) this).h(true);
        }
        return ((pf) this).field_ib;
    }

    final void a(boolean param0, byte param1, boolean param2, int param3) {
        eb var5_ref = null;
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
            if (param3 != ((pf) this).field_W) {
              break L1;
            } else {
              L2: {
                if (((pf) this).field_Tb) {
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
                if (((pf) this).field_q) {
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
            if (!((pf) this).field_Tb) {
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
              ((pf) this).F((byte) 126);
              break L5;
            } else {
              L6: {
                L7: {
                  var5_ref = ((pf) this).field_I.a(-1, param3);
                  var10 = ((pf) this).field_a.a(-20292, param3);
                  if (var10.field_p != 0) {
                    break L7;
                  } else {
                    if (-1 == (var10.field_d ^ -1)) {
                      ((pf) this).F((byte) 75);
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
                var13 = ((pf) this).H((byte) 24);
                var13.a((float)(var10.field_p * (((pf) this).field_pc % var12)) / (float)var12, (float)(((pf) this).field_pc % var12 * var10.field_d) / (float)var12, 49, 0.0f);
                ((pf) this).a(vf.field_a, true);
                break L6;
              }
              var6 = var10.field_f;
              if (((pf) this).field_Tb) {
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
            if (null == ((pf) this).field_E) {
              ((pf) this).a((ura) (Object) var5_ref, -113);
              ((pf) this).h(-119, var6);
              break L9;
            } else {
              ((pf) this).field_E.a((byte) 106, var6, (ura) (Object) var5_ref);
              break L9;
            }
          }
          ((pf) this).field_W = param3;
          ((pf) this).field_q = ((pf) this).field_Tb;
          break L0;
        }
        ((pf) this).field_V = ((pf) this).field_V & -8;
        var5 = -90 % ((-66 - param1) / 45);
    }

    final void b(boolean param0, int param1) {
        if (param1 != -1700) {
            ((pf) this).E((byte) 77);
        }
        if (!(param0 == ((pf) this).field_nc)) {
            ((pf) this).field_nc = param0 ? true : false;
            ((pf) this).F(param1 ^ -14310);
            ((pf) this).field_V = ((pf) this).field_V & -32;
        }
    }

    final void d(boolean param0, int param1) {
        if (param1 != -30305) {
            ((pf) this).field_nc = true;
        }
        if (!((((pf) this).field_ub ? 1 : 0) != (!param0 ? 1 : 0))) {
            ((pf) this).field_ub = param0 ? true : false;
            ((pf) this).w(1);
            ((pf) this).field_V = ((pf) this).field_V & -32;
        }
    }

    private final void a(int param0, jra param1, int param2) {
        ((pf) this).a((byte) -6, ((pf) this).field_C, param0);
        ((pf) this).a(101, ((pf) this).field_ic);
        ((pf) this).a(param1, 0, param2, -114);
    }

    final int g(int param0) {
        if (param0 != 3554) {
            return -16;
        }
        return ((pf) this).field_Nb + ((pf) this).field_ob + ((pf) this).field_mb;
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = ((pf) this).f((byte) -95);
        this.d(false);
        ((pf) this).e(-123, param4);
        ((pf) this).a(0, pea.field_d, 7);
        ((pf) this).a(0, (byte) -113, pea.field_d);
        ((pf) this).c(103, param5);
        ((pf) this).field_O.a(5557, (float)(-1 + param2), (float)(param3 - 1), 1.0f);
        ((pf) this).field_O.a(0.0f, (float)param0 - var7, -var7 + (float)param1, (byte) 13);
        ((pf) this).h(20837);
        ((pf) this).a(-118, false);
        this.a(0, era.field_o, 4);
        ((pf) this).a(-110, true);
        ((pf) this).a(0, (byte) -67, qcb.field_q);
        ((pf) this).a(0, qcb.field_q, 7);
    }

    abstract void m(int param0);

    final oj z(byte param0) {
        if (param0 < 70) {
            ((pf) this).field_pb = null;
        }
        return ((pf) this).field_yb;
    }

    final boolean c() {
        return false;
    }

    final int t(byte param0) {
        if (param0 != 9) {
            return -4;
        }
        return ((pf) this).field_ab;
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
          if (((pf) this).field_N) {
            break L0;
          } else {
            L1: {
              L2: {
                var8 = ((pf) this).field_c;
                var2 = var8;
                var3 = (float)(((pf) this).field_h * -((pf) this).field_K) / (float)((pf) this).field_lb;
                var4 = (float)(((pf) this).field_h * (((pf) this).field_db - ((pf) this).field_K)) / (float)((pf) this).field_lb;
                var5 = (float)(((pf) this).field_Gb * ((pf) this).field_h) / (float)((pf) this).field_k;
                var6 = (float)(((pf) this).field_h * (-((pf) this).field_i + ((pf) this).field_Gb)) / (float)((pf) this).field_k;
                if (var4 == var3) {
                  break L2;
                } else {
                  if (var5 == var6) {
                    break L2;
                  } else {
                    var7 = (float)((pf) this).field_h * 2.0f;
                    var8[1] = 0.0f;
                    var8[7] = 0.0f;
                    var8[6] = 0.0f;
                    var8[3] = 0.0f;
                    var8[2] = 0.0f;
                    var8[12] = 0.0f;
                    ((pf) this).field_xb = (float)((pf) this).field_Wb / (float)(-((pf) this).field_Wb + ((pf) this).field_h);
                    var8[10] = (float)((pf) this).field_Wb / (float)(-((pf) this).field_Wb + ((pf) this).field_h);
                    var8[0] = var7 / (var4 - var3);
                    var8[5] = var7 / (-var6 + var5);
                    var8[9] = (var5 + var6) / (-var6 + var5);
                    ((pf) this).field_Z = (float)(((pf) this).field_h * ((pf) this).field_Wb) / (float)(((pf) this).field_h - ((pf) this).field_Wb);
                    var8[14] = (float)(((pf) this).field_h * ((pf) this).field_Wb) / (float)(((pf) this).field_h - ((pf) this).field_Wb);
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
            ((pf) this).field_N = true;
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
        ((pf) this).a((byte) -6, ((pf) this).field_S, 0);
        if (param0 <= 102) {
            Object var3 = null;
            eb discarded$0 = ((pf) this).a(-65, true, (int[]) null, -35, -49, false, 126);
        }
        ((pf) this).a(124, ((pf) this).field_o);
        ((pf) this).a(tu.field_b, 0, 1, -93);
    }

    abstract void s(byte param0);

    abstract void a(byte param0, mkb param1, int param2);

    final int D(byte param0) {
        if (param0 > -109) {
            boolean discarded$0 = this.a(-0.3812601566314697f, 0.24077846109867096f, (byte) 10, 0.3140295147895813f, 0.6470803022384644f, 1.3212025165557861f, 0.2246333807706833f);
        }
        return ((pf) this).field_v;
    }

    abstract eb a(int param0, boolean param1, int[] param2, int param3, int param4, boolean param5, int param6);

    final void n(byte param0) {
        java.awt.Canvas var3_ref_java_awt_Canvas = null;
        int var4 = VoidHunters.field_G;
        Enumeration var2 = ((pf) this).field_rb.keys();
        while (var2.hasMoreElements()) {
            var3_ref_java_awt_Canvas = (java.awt.Canvas) var2.nextElement();
            ((pf) this).a(var3_ref_java_awt_Canvas, ((pf) this).field_rb.get((Object) (Object) var3_ref_java_awt_Canvas), 0);
        }
        ((pf) this).field_C.a(-96);
        ((pf) this).field_S.a(-103);
        ((pf) this).field_P.a(-117);
        int var3 = 19 % ((47 - param0) / 45);
        ((pf) this).field_R.a(26385);
        ((pf) this).field_D.a(26385);
        ((pf) this).field_hb.a(26385);
        ((pf) this).field_Jb.a(26385);
        ((pf) this).field_w.a(26385);
        ((pf) this).field_Ib.a(false);
        ((pf) this).field_T.a(-127);
    }

    final boolean p() {
        return true;
    }

    final void a(kba param0, boolean param1) {
        ((pf) this).field_A[((pf) this).field_ab] = param0;
        if (!param1) {
            ((pf) this).field_pc = 121;
        }
        this.B((byte) 96);
    }

    private final void q(byte param0) {
        if (param0 < 66) {
            this.k(12);
        }
    }

    abstract void i(byte param0);

    private final void q(int param0) {
        ((pf) this).field_S = ((pf) this).a(true, 3);
        boolean discarded$0 = ((pf) this).field_S.a(12, 24, 95);
        ((pf) this).field_o = ((pf) this).a(10, new qma[1]);
        if (param0 != 27191) {
            ((pf) this).field_E = null;
        }
    }

    final void a(aba param0, boolean param1, aba param2) {
        int var4 = 0;
        if (!param1) {
            return;
        }
        if (!(((pf) this).field_z[((pf) this).field_ab] == param2)) {
            ((pf) this).field_z[((pf) this).field_ab] = param2;
            var4 = 1;
            ((pf) this).o(-97);
        }
        if (((pf) this).field_U[((pf) this).field_ab] != param0) {
            ((pf) this).field_U[((pf) this).field_ab] = param0;
            ((pf) this).l((byte) 122);
            var4 = 1;
        }
        if (var4 != 0) {
            ((pf) this).field_V = ((pf) this).field_V & -30;
        }
    }

    abstract void l(byte param0);

    public static void d(byte param0) {
        field_Yb = null;
        if (param0 != -101) {
            field_Yb = null;
        }
    }

    final void i(int param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = VoidHunters.field_G;
        Hashtable var2 = new Hashtable();
        if (((pf) this).field_rb != null) {
            if (!(((pf) this).field_rb.isEmpty())) {
                var3 = ((pf) this).field_rb.keys();
                while (var3.hasMoreElements()) {
                    var4 = (java.awt.Canvas) var3.nextElement();
                    Object discarded$0 = var2.put((Object) (Object) var4, ((pf) this).a((byte) -53, var4));
                }
            }
        }
        ((pf) this).field_rb = var2;
        this.b(true);
        if (param0 != 0) {
            ((pf) this).field_Xb = false;
        }
        this.q(param0 ^ 27191);
        this.H(3096);
        ((pf) this).field_Ib.a(24, (pf) this);
    }

    final aja a(ima param0, boolean param1) {
        aja var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          L1: {
            var10 = VoidHunters.field_G;
            if (-1 == (param0.field_f ^ -1)) {
              break L1;
            } else {
              if (param0.field_e != 0) {
                L2: {
                  var14 = new int[param0.field_e * param0.field_f];
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var4 = var11;
                  var5 = 0;
                  var6 = 0;
                  if (param0.field_a != null) {
                    var7 = 0;
                    L3: while (true) {
                      if (var7 >= param0.field_e) {
                        break L2;
                      } else {
                        var8 = 0;
                        L4: while (true) {
                          if (param0.field_f <= var8) {
                            var7++;
                            continue L3;
                          } else {
                            var6++;
                            var4[var6] = knb.a(param0.field_b[dla.a(255, (int) param0.field_h[var5])], param0.field_a[var5] << 2005880152);
                            var5++;
                            var8++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (param0.field_e <= var7) {
                        break L2;
                      } else {
                        var8 = 0;
                        L6: while (true) {
                          if (param0.field_f <= var8) {
                            var7++;
                            continue L5;
                          } else {
                            L7: {
                              var5++;
                              var9 = param0.field_b[param0.field_h[var5] & 255];
                              var6++;
                              stackOut_9_0 = (int[]) var4;
                              stackOut_9_1 = var6;
                              stackIn_11_0 = stackOut_9_0;
                              stackIn_11_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var9 != 0) {
                                stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                                stackOut_11_1 = stackIn_11_1;
                                stackOut_11_2 = knb.a(-16777216, var9);
                                stackIn_12_0 = stackOut_11_0;
                                stackIn_12_1 = stackOut_11_1;
                                stackIn_12_2 = stackOut_11_2;
                                break L7;
                              } else {
                                stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                                stackOut_10_1 = stackIn_10_1;
                                stackOut_10_2 = 0;
                                stackIn_12_0 = stackOut_10_0;
                                stackIn_12_1 = stackOut_10_1;
                                stackIn_12_2 = stackOut_10_2;
                                break L7;
                              }
                            }
                            stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                }
                var3 = ((pf) this).a(param0.field_f, param0.field_f, var14, 0, (byte) 70, param0.field_e);
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3 = ((pf) this).a(1, 1, new int[1], 0, (byte) 92, 1);
          break L0;
        }
        var3.a(param0.field_c, param0.field_g, param0.field_i, param0.field_d);
        return var3;
    }

    final boolean k() {
        return true;
    }

    abstract void h(boolean param0);

    final boolean e() {
        return ((pf) this).field_dc[3].a((byte) 111);
    }

    abstract void j(byte param0);

    final za e(int param0) {
        cba var2 = new cba(param0);
        ((pf) this).field_s.b(-10258, (ksa) (Object) var2);
        return (za) (Object) var2;
    }

    final int a(boolean param0) {
        if (param0) {
            ((pf) this).field_nb = -18;
        }
        return ((pf) this).field_Ob;
    }

    abstract eb a(kb param0, float[] param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7);

    final int u(byte param0) {
        if (param0 <= 78) {
            ((pf) this).field_Z = -0.38502317667007446f;
        }
        return ((pf) this).field_Pb;
    }

    final void a(pw param0) {
        ((pf) this).field_t = (oj) (Object) param0;
        ((pf) this).field_gb.a((pw) (Object) ((pf) this).field_t, 16383);
        ((pf) this).field_gb.a(16489);
        ((pf) this).field_yb.a(-25609, (pw) (Object) ((pf) this).field_gb);
        ((pf) this).field_f.a(-25609, (pw) (Object) ((pf) this).field_t);
        if (!(!((pf) this).field_pb.a(-12178))) {
            this.s(0);
        }
    }

    final void a(za param0) {
        ((pf) this).field_jc = ((cba) (Object) param0).field_f;
        ((pf) this).field_m = ((pf) this).field_jc.a(32768, false);
    }

    abstract void a(java.awt.Canvas param0, Object param1, int param2);

    abstract boolean a(mj param0, kb param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Yb = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
