/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class aw extends ha {
    sk field_Mb;
    private Hashtable field_Q;
    Object field_Ib;
    int field_Sb;
    jaclib.memory.heap.NativeHeapBuffer field_z;
    static tf field_t;
    ki field_ab;
    private jagex3.graphics2.hw.NativeInterface field_nc;
    private jn field_lb;
    int field_rb;
    long field_peer;
    private jaclib.memory.heap.NativeHeap field_gb;
    int field_pc;
    ut field_Lb;
    boolean field_Db;
    static Boolean field_j;
    int field_Cb;
    int field_o;
    ut field_Gb;
    private ut field_sb;
    private ut field_vc;
    private boolean field_fb;
    boolean field_Z;
    private float field_qb;
    private int field_Pb;
    int field_mc;
    int field_bc;
    private int field_ac;
    int field_ub;
    private boolean field_O;
    private boolean field_bb;
    float field_E;
    int field_oc;
    int field_vb;
    ut[] field_V;
    int field_Kb;
    boolean field_tb;
    private rq[] field_X;
    float[] field_G;
    int field_F;
    private int field_L;
    private int field_Vb;
    private int field_xb;
    int field_kc;
    private mr field_lc;
    tg[] field_K;
    boolean field_Bb;
    boolean field_I;
    private int field_mb;
    int field_Y;
    boolean field_Rb;
    private rq field_m;
    private jaclib.memory.Stream field_cb;
    private int field_Hb;
    tg[] field_B;
    private int field_k;
    float field_T;
    float field_jb;
    private float[] field_eb;
    float field_Tb;
    private int field_P;
    int field_cc;
    int field_C;
    int field_Yb;
    private int field_Ob;
    private float[] field_w;
    private float[] field_fc;
    int field_r;
    boolean field_db;
    private boolean field_zb;
    int field_yc;
    private boolean field_R;
    boolean field_i;
    boolean field_Eb;
    private int field_sc;
    boolean field_p;
    int field_Ub;
    int field_y;
    il field_l;
    float field_S;
    private ed[] field_Zb;
    float field_Xb;
    boolean field_u;
    private float[] field_ec;
    float[] field_U;
    ko[] field_pb;
    private float field_q;
    float field_J;
    int field_tc;
    private jl field_yb;
    private em field_uc;
    private int field_N;
    private int field_dc;
    float[] field_A;
    boolean field_ob;
    int field_Nb;
    private boolean field_Jb;
    float field_hb;
    hv field_s;
    private int field_rc;
    int field_v;
    private int field_ic;
    int field_Ab;
    boolean field_W;
    private float field_kb;
    private boolean field_H;
    ed field_D;
    tf[] field_wb;
    private gu field_ib;
    private pv field_Wb;
    private cr field_M;
    private gu field_Fb;
    hq field_jc;
    private gu field_gc;
    private pv field_x;
    private hq field_xc;
    private gu field_qc;
    private gu field_hc;
    private hq field_nb;
    private pv field_Qb;
    private hq field_n;
    boolean field_wc;

    abstract ru a(iw param0, int param1, int param2, int param3, byte[] param4, byte param5, int param6, boolean param7);

    private final void c(byte param0) {
        float[] var2;
        float[] var3;
        float[] var4;
        float[] var5;
        L0: {
          if (param0 == -88) {
            break L0;
          } else {
            aw.j((byte) -98);
            break L0;
          }
        }
        L1: {
          if (!this.field_zb) {
            L2: {
              L3: {
                var3 = this.field_fc;
                var5 = var3;
                var4 = var5;
                var2 = var4;
                if (0 == this.field_rb) {
                  break L3;
                } else {
                  if (this.field_Sb != 0) {
                    var5[12] = -1.0f;
                    var5[10] = 0.5f;
                    var2[5] = -2.0f / (float)this.field_Sb;
                    var2[2] = 0.0f;
                    var2[4] = 0.0f;
                    var2[7] = 0.0f;
                    var2[11] = 0.0f;
                    var2[15] = 1.0f;
                    var2[6] = 0.0f;
                    var2[8] = 0.0f;
                    var5[14] = 0.5f;
                    var2[13] = 1.0f;
                    var2[0] = 2.0f / (float)this.field_rb;
                    var2[9] = 0.0f;
                    var2[3] = 0.0f;
                    var2[1] = 0.0f;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3[14] = 0.0f;
              var3[3] = 0.0f;
              var3[12] = 0.0f;
              var3[10] = 1.0f;
              var3[1] = 0.0f;
              var3[0] = 1.0f;
              var3[9] = 0.0f;
              var3[15] = 1.0f;
              var3[4] = 0.0f;
              var3[7] = 0.0f;
              var3[13] = 0.0f;
              var3[6] = 0.0f;
              var3[8] = 0.0f;
              var3[11] = 0.0f;
              var3[5] = 1.0f;
              var3[2] = 0.0f;
              break L2;
            }
            this.field_zb = true;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void c(int param0, boolean param1) {
        if (!((!this.field_p ? 1 : 0) == (!param1 ? 1 : 0))) {
            this.field_p = param1 ? true : false;
            this.q(79);
            this.field_ic = this.field_ic & -32;
        }
        if (param0 <= 32) {
            this.field_K = (tg[]) null;
        }
    }

    abstract void N(int param0);

    final ru a(byte[] param0, int param1, int param2, iw param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        ru stackIn_3_0 = null;
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
              if (param4 == 0) {
                break L1;
              } else {
                this.field_mc = 3;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param3, param1, param2, 0, param0, (byte) 97, 0, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("aw.TD(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final ut c(boolean param0) {
        if (!param0) {
            return (ut) null;
        }
        return this.field_sb;
    }

    private final void h(byte param0) {
        if (param0 > -77) {
            this.field_lc = (mr) null;
        }
    }

    final void k(int param0) {
        this.field_Lb.a(param0);
        this.field_Db = true;
        this.z(-29654);
    }

    abstract void f(boolean param0);

    abstract cr e(int param0, boolean param1);

    abstract Object a(java.awt.Canvas param0, int param1);

    final int M(int param0) {
        int var2 = -35 / ((param0 - 54) / 59);
        return this.field_Pb;
    }

    final static String a(String param0, String param1, String param2, boolean param3) {
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (!param3) {
            field_t = (tf) null;
        }
        int var4 = param1.indexOf(param0);
        while (-1 != var4) {
            param1 = param1.substring(0, var4) + param2 + param1.substring(param0.length() + var4);
            var4 = param1.indexOf(param0, param2.length() + var4);
        }
        return param1;
    }

    final ut H(int param0) {
        if (param0 != 26453) {
            return (ut) null;
        }
        return this.field_V[this.field_mc];
    }

    final void d(boolean param0) {
        hv var2 = null;
        if (param0) {
            this.n((byte) 96);
        }
        if (mb.field_k != this.field_s) {
            var2 = this.field_s;
            this.field_s = mb.field_k;
            if (!(!var2.a(-20011))) {
                this.W(16);
            }
            this.field_ic = this.field_ic & -32;
            this.field_A = this.field_w;
        }
    }

    final void U(int param0) {
        this.field_Db = false;
        if (param0 != 0) {
            return;
        }
        this.z(-29654);
    }

    abstract void bb(int param0);

    final void m(int param0) {
        this.field_vb = 0;
        this.field_v = 0;
        if (param0 != -16088) {
            this.field_Ob = -12;
        }
        this.field_F = this.field_rb;
        this.field_yc = this.field_Sb;
        if (this.field_wc) {
            this.field_wc = false;
            this.A(-121);
        }
        this.h((byte) -128);
    }

    abstract ef a(int param0, byte param1, int[][] param2, boolean param3);

    abstract float b(byte param0);

    private final void z(int param0) {
        float var2 = 0.0f;
        if (vu.field_h == this.field_s) {
            var2 = this.b((byte) 127);
            this.field_Lb.a((byte) 96, 0.0f, var2, var2);
        }
        if (param0 != -29654) {
            this.field_Y = -4;
        }
        this.field_R = false;
        this.x(0);
        if (!(null == this.field_m)) {
            this.field_m.c((byte) 37);
        }
    }

    final int t(int param0) {
        int var2 = 39 % ((param0 - -20) / 54);
        return this.field_mc;
    }

    final void d(int param0, boolean param1) {
        if (!(this.field_I == param1)) {
            this.field_I = param1 ? true : false;
            this.f(false);
            this.field_ic = this.field_ic & -8;
        }
        int var3 = -80 % ((35 - param0) / 54);
    }

    abstract nh a(boolean param0, iw param1, int param2, int param3, byte[] param4, int param5);

    abstract void l(byte param0);

    final void T(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(param0 <= this.field_v)) {
            var5 = 1;
            this.field_v = param0;
        }
        if (!(param2 >= this.field_F)) {
            var5 = 1;
            this.field_F = param2;
        }
        if (!(this.field_vb >= param1)) {
            this.field_vb = param1;
            var5 = 1;
        }
        if (!(param3 >= this.field_yc)) {
            this.field_yc = param3;
            var5 = 1;
        }
        if (var5 != 0) {
            if (!(this.field_wc)) {
                this.field_wc = true;
                this.A(-57);
            }
            this.F(4);
            this.h((byte) -122);
        }
    }

    abstract void F(int param0);

    public static void G(int param0) {
        field_t = null;
        if (param0 != 8) {
            field_t = (tf) null;
        }
        field_j = null;
    }

    abstract void a(byte param0, int param1, boolean param2, boolean param3, mi param4);

    abstract void E(int param0);

    abstract void ab(int param0);

    final hr a(ri param0, boolean param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        hr stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        hr var3 = null;
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
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == param0.field_h) {
                  break L2;
                } else {
                  if (0 != param0.field_i) {
                    L3: {
                      var12 = new int[param0.field_h * param0.field_i];
                      var11 = var12;
                      var4 = var11;
                      var5 = 0;
                      var6 = 0;
                      if (null == param0.field_a) {
                        var7 = 0;
                        L4: while (true) {
                          if (var7 >= param0.field_i) {
                            break L3;
                          } else {
                            var8 = 0;
                            L5: while (true) {
                              if (param0.field_h <= var8) {
                                var7++;
                                continue L4;
                              } else {
                                L6: {
                                  incrementValue$0 = var5;
                                  var5++;
                                  var9 = param0.field_g[param0.field_e[incrementValue$0] & 255];
                                  incrementValue$1 = var6;
                                  var6++;
                                  stackIn_18_0 = (int[]) (var4);

                                  stackIn_18_1 = incrementValue$1;

                                  if (var9 == 0) {
                                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                                    stackIn_19_1 = stackIn_18_1;
                                    stackIn_19_2 = 0;
                                    break L6;
                                  } else {
                                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                                    stackIn_19_1 = stackIn_18_1;
                                    stackIn_19_2 = ic.a(var9, -16777216);
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
                          if (var7 >= param0.field_i) {
                            break L3;
                          } else {
                            var8 = 0;
                            L8: while (true) {
                              if (var8 >= param0.field_h) {
                                var7++;
                                continue L7;
                              } else {
                                incrementValue$2 = var6;
                                var6++;
                                var4[incrementValue$2] = ic.a(param0.field_a[var5] << 1453984952, param0.field_g[eb.a(255, (int) param0.field_e[var5])]);
                                var5++;
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3 = this.a(0, -2, param0.field_i, param0.field_h, param0.field_h, var12);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = this.a(0, -2, 1, 1, 1, new int[]{0});
              break L1;
            }
            var3.a(param0.field_c, param0.field_d, param0.field_b, param0.field_f);
            stackIn_23_0 = (hr) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("aw.RA(");

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
          throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    private final void g(boolean param0) {
        if (param0) {
            this.field_Hb = -20;
        }
        this.a(0, 119, this.field_Wb);
        this.a(-77, this.field_xc);
        this.a(0, 0, 1, tc.field_g);
    }

    final ru a(int param0, iw param1, byte param2, boolean param3, int param4, float[] param5) {
        RuntimeException var7 = null;
        ru stackIn_3_0 = null;
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
              if (param2 > 84) {
                break L1;
              } else {
                this.field_kc = 90;
                break L1;
              }
            }
            stackIn_3_0 = this.a(0, param4, param3, 0, param5, param0, (byte) -125, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("aw.IC(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final jaclib.memory.Stream a(boolean param0, jaclib.memory.Buffer param1) {
        RuntimeException var3 = null;
        jaclib.memory.Stream stackIn_2_0 = null;
        jaclib.memory.Stream stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              this.field_cb.a(param1);
              stackIn_4_0 = this.field_cb;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (jaclib.memory.Stream) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("aw.NE(").append(param0).append(',');

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
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(mi param0, int param1, boolean param2) {
        try {
            if (!param2) {
                this.c((byte) -34);
            }
            this.a(param1, false, (byte) 54, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "aw.ID(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void p(byte param0);

    private final void a(int param0, ck param1, int param2) {
        try {
            this.a(0, 86, this.field_x);
            this.a(125, this.field_nb);
            this.a(param0, param0 ^ 0, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "aw.VE(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(tf param0, int param1) {
        try {
            if (param1 != 28880) {
                this.N(-123);
            }
            this.field_wb[this.field_mc] = param0;
            this.j(param1 ^ 28752);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "aw.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void e(boolean param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        this.field_V = new ut[this.field_cc];
        this.field_Zb = new ed[this.field_cc];
        this.field_wb = new tf[this.field_cc];
        this.field_K = new tg[this.field_cc];
        this.field_B = new tg[this.field_cc];
        for (var2 = 0; this.field_cc > var2; var2++) {
            this.field_B[var2] = vi.field_v;
            this.field_K[var2] = vi.field_v;
            this.field_wb[var2] = ar.field_L;
            this.field_V[var2] = new ut();
        }
        this.field_pb = new ko[-2 + this.field_bc];
        this.field_D = (ed) ((Object) this.a(io.field_g, nl.field_p, 1, 1, (byte) -110));
        this.a(new he(262144));
        this.field_jc = this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_e})}, (byte) 78);
        this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_g})}, (byte) 70);
        this.a(new hu[]{new hu(ls.field_b), new hu(ls.field_g), new hu(ls.field_e), new hu(ls.field_c)}, (byte) 14);
        this.a(new hu[]{new hu(ls.field_b), new hu(ls.field_g), new hu(ls.field_e)}, (byte) 100);
        gu discarded$0 = new gu((aw) (this), 0, 0, false, false);
        this.field_gc = new gu((aw) (this), 0, 0, true, true);
        gu discarded$1 = new gu((aw) (this), 0, 0, false, false);
        this.field_qc = new gu((aw) (this), 0, 0, true, true);
        gu discarded$2 = new gu((aw) (this), 0, 0, false, false);
        this.field_hc = new gu((aw) (this), 0, 0, true, true);
        gu discarded$3 = new gu((aw) (this), 0, 0, false, false);
        this.field_Fb = new gu((aw) (this), 0, 0, true, true);
        gu discarded$4 = new gu((aw) (this), 0, 0, false, param0);
        this.field_ib = new gu((aw) (this), 0, 0, true, true);
        this.field_yb = new jl((aw) (this));
        this.field_M = this.e(3, true);
        this.P(-55);
        this.field_Mb = new sk((aw) (this));
        this.field_X[1] = this.d(0, 1);
        this.field_X[2] = this.d(0, 2);
        this.field_X[4] = this.d(0, 4);
        this.field_X[5] = this.d(0, 5);
        this.field_X[6] = this.d(0, 6);
        this.field_X[7] = this.d(0, 7);
        this.field_X[3] = this.d(0, 3);
        this.field_X[8] = this.d(0, 8);
        this.field_X[9] = this.d(0, 9);
        if (!(this.field_X[2].b((byte) -82))) {
            this.field_X[2] = this.d(0, 0);
        }
        if (!this.field_X[4].b((byte) -67)) {
            this.field_X[4] = this.field_X[2];
        }
        if (!(this.field_X[8].b((byte) -42))) {
            this.field_X[8] = this.field_X[4];
        }
        if (!this.field_X[9].b((byte) -43)) {
            this.field_X[9] = this.field_X[8];
        }
        this.D(1);
        this.m(-16088);
        this.e();
    }

    abstract void a(java.awt.Canvas param0, Object param1, int param2);

    private final void u(int param0) {
        this.field_Jb = false;
        if (param0 != 2) {
            return;
        }
        this.R(param0 ^ -63);
        if (!(pd.field_m != this.field_s)) {
            this.g(param0 ^ 3);
        }
    }

    final void a(boolean param0, int param1) {
        if (param0) {
            return;
        }
        if (!(param1 == this.field_Ub)) {
            this.field_Ub = param1;
            this.r(1);
        }
    }

    final ut B(int param0) {
        if (param0 != 0) {
            return (ut) null;
        }
        return this.field_V[this.field_mc];
    }

    final static void C(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6 = rg.field_C;
            var1 = var6;
            var3 = -20 / ((-66 - param0) / 42);
            var2 = 0;
            var4 = var6.length;
            L1: while (true) {
              if (var4 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var6[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var6[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var6[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var6[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var6[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var6[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var6[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var6[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "aw.N(" + param0 + ')');
        }
    }

    private final void W(int param0) {
        this.field_R = false;
        if (param0 != 16) {
            this.field_Kb = 40;
        }
        if (!(this.field_m == null)) {
            this.field_m.b(param0 ^ -90);
        }
        this.N(-26911);
    }

    abstract void a(int param0, hq param1);

    abstract boolean a(byte param0, io param1, iw param2);

    void D(int param0) {
        this.T(-1);
        if (param0 != 1) {
            byte[] var3 = (byte[]) null;
            this.a(true, (iw) null, -62, 114, (byte[]) null, 71);
        }
    }

    abstract void i(byte param0);

    abstract boolean a(io param0, iw param1, int param2);

    final void a(za param0) {
        try {
            this.field_gb = ((he) ((Object) param0)).field_p;
            this.field_z = this.field_gb.a(32768, false);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "aw.OB(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    void d() {
        ms var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (!(this.field_H)) {
            var1 = this.field_lb.b(-66);
            while (var1 != null) {
                ((he) ((Object) var1)).c(-14365);
                var1 = this.field_lb.d((byte) 18);
            }
            var1_ref = this.field_Q.keys();
            while (var1_ref.hasMoreElements()) {
                var2 = (java.awt.Canvas) (var1_ref.nextElement());
                this.a(var2, this.field_Q.get(var2), 0);
            }
            pt.a(false, true, -1);
            this.field_nc.release();
            this.field_H = true;
        }
    }

    abstract void i(int param0);

    final void K(int[] param0) {
        try {
            param0[0] = this.field_v;
            param0[3] = this.field_yc;
            param0[2] = this.field_F;
            param0[1] = this.field_vb;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "aw.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(int param0, int param1, int param2, ck param3);

    final void s(int param0, int param1, int param2, int param3, int param4) {
        this.f((byte) 117);
        this.a(false, param3);
        this.a(mm.field_h, 0, 0);
        this.a(mm.field_h, 0, true);
        this.e(param4, 13);
        this.field_Lb.b((float)param2, (float)param2, 0, 1.0f);
        this.field_Lb.a(param1, param0, (byte) 103, 0);
        this.U(0);
        this.a(1, false);
        this.a(0, 121, this.field_Qb);
        this.a(-64, this.field_n);
        this.a(1, 0, 256, rv.field_b);
        this.a(1, true);
        this.a(jq.field_a, 0, true);
        this.a(jq.field_a, 0, 0);
    }

    final static void j(byte param0) {
        hq.field_b = -1;
        qf.field_a = 0;
        za.field_k = -1;
        up.field_d = false;
        hp.field_l = null;
        int var1 = 47 / ((9 - param0) / 43);
    }

    final int[] Y() {
        return new int[]{this.field_P, this.field_Hb, this.field_sc, this.field_rc};
    }

    abstract void r(int param0);

    abstract void J(int param0);

    final za c(int param0) {
        he var2 = new he(param0);
        this.field_lb.a((ms) (var2), (byte) 39);
        return (za) ((Object) var2);
    }

    final float[] a(int param0, float[] param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1[0] = this.field_A[0];
              param1[8] = this.field_A[2];
              param1[12] = this.field_A[3];
              param1[4] = this.field_A[1];
              param1[5] = this.field_A[5];
              param1[1] = this.field_A[4];
              param1[13] = this.field_A[7];
              param1[9] = this.field_A[6];
              param1[2] = this.field_A[8];
              param1[14] = this.field_A[11];
              param1[10] = this.field_A[10];
              param1[6] = this.field_A[9];
              param1[3] = this.field_A[12];
              param1[7] = this.field_A[13];
              param1[15] = this.field_A[15];
              param1[11] = this.field_A[14];
              if (param0 <= -44) {
                break L1;
              } else {
                this.field_peer = -100L;
                break L1;
              }
            }
            stackIn_3_0 = (float[]) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("aw.TC(").append(param0).append(',');

            if (param1 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract void q(byte param0);

    final boolean c() {
        return true;
    }

    private final void r(byte param0) {
        this.field_Wb = this.a((byte) 51, true);
        this.field_Wb.a(12, (byte) -35, 24);
        if (param0 < 102) {
            this.field_db = false;
        }
        this.field_xc = this.a(new hu[]{new hu(ls.field_b)}, (byte) 118);
    }

    private final void f(byte param0) {
        int var2 = 90 / ((param0 - 40) / 56);
        if (-2 != (this.field_ic ^ -1)) {
            this.L(-25);
            this.c(false, -32);
            this.d(123, false);
            this.c(90, false);
            this.b(false, 4);
            this.a(-2, false, 50, false);
            this.h(57, 1);
            this.a(this.field_D, 117);
            this.field_ic = 1;
        }
    }

    abstract void I(int param0);

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (param0 != this.field_oc) {
              break L1;
            } else {
              if (param1 != this.field_Yb) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          this.field_Yb = param1;
          this.field_oc = param0;
          this.u(2);
          this.Q(13);
          this.n((byte) -78);
          break L0;
        }
    }

    abstract ru a(io param0, iw param1, int param2, int param3, byte param4);

    final void b(int param0, boolean param1) {
        if (!((!param1 ? 1 : 0) == (!this.field_Rb ? 1 : 0))) {
            this.field_Rb = param1 ? true : false;
            this.i((byte) -119);
        }
        if (param0 != 0) {
            this.field_oc = -100;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7;
        float var8;
        float var9;
        L0: {
          L1: {
            var7 = (float)(-param0) + (float)param2;
            var8 = (float)param3 - (float)param1;
            if (0.0f != var7) {
              break L1;
            } else {
              if (var8 == 0.0f) {
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
        if (!this.a(0.0f, (float)param3 + var8, true, (float)param2 + var7, (float)param0, (float)param1, 0.0f)) {
          return;
        } else {
          this.f((byte) -57);
          this.a(false, param4);
          this.a(mm.field_h, 0, 0);
          this.a(mm.field_h, 0, true);
          this.e(param5, 13);
          this.k(1);
          this.a(1, false);
          this.g(false);
          this.a(1, true);
          this.a(jq.field_a, 0, true);
          this.a(jq.field_a, 0, 0);
          return;
        }
    }

    private final void O(int param0) {
        int var2;
        jaclib.memory.Buffer var3;
        int var5;
        jaclib.memory.Stream var4;
        var5 = Sumoblitz.field_L ? 1 : 0;
        this.field_x = this.a((byte) 51, false);
        this.field_x.a(28, (byte) -35, 140);
        var2 = 0;
        L0: while (true) {
          L1: {
            if (4 <= var2) {
              break L1;
            } else {
              var3 = this.field_x.a(7454, true);
              if (var3 != null) {
                L2: {
                  var4 = this.a(true, var3);
                  if (jaclib.memory.Stream.b()) {
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
                if (this.field_x.a(22957)) {
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
          L3: {
            this.field_nb = this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_e, ls.field_e})}, (byte) 99);
            if (param0 == 5) {
              break L3;
            } else {
              this.j(-25);
              break L3;
            }
          }
          return;
        }
    }

    final void a(ed param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 > 89) {
                break L1;
              } else {
                discarded$1 = this.a(-0.810268759727478f, 2.1692757606506348f, false, -2.797441005706787f, 1.3712314367294312f, 0.6615611910820007f, 0.5074755549430847f);
                break L1;
              }
            }
            L2: {
              if (this.field_Zb[this.field_mc] != param0) {
                L3: {
                  this.field_Zb[this.field_mc] = param0;
                  if (param0 != null) {
                    param0.a(8905);
                    break L3;
                  } else {
                    this.l((byte) 9);
                    break L3;
                  }
                }
                this.field_ic = this.field_ic & -2;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("aw.BA(");

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
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    private final void y(int param0) {
        int var2;
        jaclib.memory.Buffer var3;
        int var10;
        jaclib.memory.Stream var4;
        int var5;
        double var6;
        float var8;
        float var9;
        var10 = Sumoblitz.field_L ? 1 : 0;
        this.field_Qb = this.a((byte) 51, false);
        this.field_Qb.a(12, (byte) -35, 3096);
        var2 = 0;
        L0: while (true) {
          L1: {
            if (4 <= var2) {
              break L1;
            } else {
              var3 = this.field_Qb.a(7454, true);
              if (var3 != null) {
                var4 = this.a(true, var3);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var5 = 0;
                L2: while (true) {
                  if (-257 > (var5 ^ -1)) {
                    var4.a();
                    if (this.field_Qb.a(22957)) {
                      break L1;
                    } else {
                      var2++;
                      continue L0;
                    }
                  } else {
                    var6 = (double)(var5 * 2) * 3.141592653589793 / 256.0;
                    var8 = (float)Math.cos(var6);
                    var9 = (float)Math.sin(var6);
                    if (jaclib.memory.Stream.b()) {
                      var4.a(var9);
                      var4.a(var8);
                      var4.a(0.0f);
                      var5++;
                      continue L2;
                    } else {
                      var4.b(var9);
                      var4.b(var8);
                      var4.b(0.0f);
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
          if (param0 < -97) {
            this.field_n = this.a(new hu[]{new hu(ls.field_b)}, (byte) 50);
            return;
          } else {
            return;
          }
        }
    }

    final static ha a(d param0, java.awt.Canvas param1, int param2, int param3) {
        RuntimeException var4 = null;
        String var5 = null;
        fr stackIn_3_0 = null;
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
              if (param3 == 27541) {
                break L1;
              } else {
                var5 = (String) null;
                aw.a((String) null, (String) null, (String) null, false);
                break L1;
              }
            }
            stackIn_3_0 = new fr(param1, param0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("aw.CB(");

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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (ha) ((Object) stackIn_3_0);
    }

    private final void g(int param0) {
        this.o(-2);
        if (null != this.field_m) {
            this.field_m.b(false);
        }
        if (param0 != 1) {
            this.field_ac = 74;
        }
    }

    final void e(int param0, int param1) {
        il var3;
        int var4;
        int var5;
        int var6;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          if (param1 == 13) {
            break L0;
          } else {
            this.field_cb = (jaclib.memory.Stream) null;
            break L0;
          }
        }
        L1: {
          if (param0 != this.field_N) {
            L2: {
              if (param0 != 1) {
                if (param0 == 2) {
                  var5 = 0;
                  var4 = 1;
                  var3 = lh.field_n;
                  break L2;
                } else {
                  if ((param0 ^ -1) == -129) {
                    var3 = gb.field_t;
                    var5 = 1;
                    var4 = 1;
                    break L2;
                  } else {
                    var5 = 0;
                    var3 = av.field_B;
                    var4 = 0;
                    break L2;
                  }
                }
              } else {
                var5 = 1;
                var4 = 1;
                var3 = sr.field_a;
                break L2;
              }
            }
            L3: {
              if (this.field_u) {
                stackIn_14_0 = 0;
                break L3;
              } else {
                stackIn_14_0 = 1;
                break L3;
              }
            }
            L4: {


              if (var5 != 0) {

                stackIn_17_1 = 0;
                break L4;
              } else {

                stackIn_17_1 = 1;
                break L4;
              }
            }
            L5: {
              if (stackIn_14_0 == stackIn_17_1) {
                break L5;
              } else {
                L6: {
                  stackIn_20_0 = this;

                  if (var5 == 0) {
                    stackIn_21_0 = this;
                    stackIn_21_1 = 0;
                    break L6;
                  } else {
                    stackIn_21_0 = this;
                    stackIn_21_1 = 1;
                    break L6;
                  }
                }
                ((aw) (this)).field_u = stackIn_21_1 != 0;
                this.s(102);
                break L5;
              }
            }
            L7: {
              if (var4 != 0) {
                stackIn_25_0 = 0;
                break L7;
              } else {
                stackIn_25_0 = 1;
                break L7;
              }
            }
            L8: {
              if (stackIn_25_0 != (this.field_ob ? 1 : 0)) {
                break L8;
              } else {
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
                ((aw) (this)).field_ob = stackIn_29_1 != 0;
                this.p((byte) -4);
                break L8;
              }
            }
            L10: {
              if (var3 == this.field_l) {
                break L10;
              } else {
                this.field_l = var3;
                this.bb(-19519);
                break L10;
              }
            }
            this.field_N = param0;
            this.field_ic = this.field_ic & -29;
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final boolean a(float param0, float param1, boolean param2, float param3, float param4, float param5, float param6) {
        jaclib.memory.Buffer var10 = this.field_Wb.a(7454, param2);
        if (var10 == null) {
            return false;
        }
        jaclib.memory.Stream var9 = this.a(param2, var10);
        if (!jaclib.memory.Stream.b()) {
            var9.b(param4);
            var9.b(param5);
            var9.b(param6);
            var9.b(param3);
            var9.b(param1);
            var9.b(param0);
        } else {
            var9.a(param4);
            var9.a(param5);
            var9.a(param6);
            var9.a(param3);
            var9.a(param1);
            var9.a(param0);
        }
        var9.a();
        return this.field_Wb.a(22957);
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.f((byte) -104);
        this.a(false, param4);
        this.a(mm.field_h, 0, 0);
        this.a(mm.field_h, 0, true);
        this.e(param5, 13);
        this.field_Lb.b((float)param3, (float)param2, 0, 1.0f);
        this.field_Lb.a(param1, param0, (byte) 107, 0);
        this.U(0);
        this.a(1, false);
        this.n(2);
        this.a(1, true);
        this.a(jq.field_a, 0, true);
        this.a(jq.field_a, 0, 0);
    }

    final void b(boolean param0, int param1) {
        if (param1 != 4) {
            this.f((byte) -69);
        }
        if ((!param0 ? 1 : 0) != (!this.field_i ? 1 : 0)) {
            this.field_i = param0 ? true : false;
            this.eb(120);
            this.field_ic = this.field_ic & -32;
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.a(param0, param1, param2 + param0, param1, param3, param4);
    }

    final int i() {
        return this.field_oc;
    }

    final da a(ta param0, ri[] param1, boolean param2) {
        RuntimeException var4 = null;
        mv stackIn_1_0 = null;
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
            stackIn_1_0 = new mv((aw) (this), param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("aw.DF(");

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

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 <= 0 && this.field_rb - 1 <= param2 && param1 <= 0) {
            if (!(this.field_Sb - 1 > param3)) {
                this.m(-16088);
                return;
            }
        }
        this.field_vb = 0 > param1 ? 0 : param1;
        this.field_yc = this.field_rb < param3 ? 0 : param3;
        this.field_F = this.field_rb >= param2 ? param2 : 0;
        this.field_v = param0 >= 0 ? param0 : 0;
        if (!(this.field_wc)) {
            this.field_wc = true;
            this.A(-87);
        }
        this.F(4);
        this.h((byte) -82);
    }

    abstract void s(int param0);

    private final void Q(int param0) {
        this.field_O = false;
        if (param0 != 13) {
            this.O(109);
        }
        this.Z(0);
        if (!(mo.field_w != this.field_s)) {
            this.g(1);
        }
    }

    private final void T(int param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        this.ab(7);
        this.db(0);
        this.f(false);
        this.Y(-95);
        this.E(param0 + -75);
        this.J(0);
        this.I(0);
        this.q(param0 + 59);
        this.eb(param0 + 120);
        this.i((byte) -119);
        this.b(true);
        this.p((byte) -4);
        this.bb(param0 + -19518);
        this.s(-92);
        if (param0 != -1) {
            this.field_Lb = (ut) null;
        }
        for (var2 = this.field_cc - 1; -1 >= (var2 ^ -1); var2--) {
            this.g(var2, -114);
            this.q((byte) -128);
            this.X(-86);
            this.l(0);
        }
        this.r(1);
        this.i(param0 + 1);
        this.o(-2);
        this.x(param0 + 1);
        this.N(-26911);
    }

    final void a(byte param0, tg param1, tg param2) {
        int var4_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (param2 == this.field_K[this.field_mc]) {
                break L1;
              } else {
                this.field_K[this.field_mc] = param2;
                var4_int = 1;
                this.q((byte) -93);
                break L1;
              }
            }
            L2: {
              if (param1 == this.field_B[this.field_mc]) {
                break L2;
              } else {
                this.field_B[this.field_mc] = param1;
                this.X(-126);
                var4_int = 1;
                break L2;
              }
            }
            L3: {
              if (var4_int == 0) {
                break L3;
              } else {
                this.field_ic = this.field_ic & -30;
                break L3;
              }
            }
            L4: {
              if (param0 == -83) {
                break L4;
              } else {
                this.c();
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("aw.FF(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    abstract void X(int param0);

    aw(java.awt.Canvas param0, Object param1, d param2, ki param3, int param4, int param5) {
        super(param2);
        int var8 = 0;
        wm var9 = null;
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
        this.field_lb = new jn();
        this.field_Db = true;
        this.field_Lb = new ut();
        ut discarded$3 = new ut();
        ut discarded$4 = new ut();
        this.field_Gb = new ut();
        this.field_sb = new ut();
        this.field_vc = new ut();
        this.field_mc = 0;
        this.field_ac = 0;
        this.field_O = false;
        this.field_tb = false;
        this.field_qb = 1.0f;
        this.field_L = 0;
        this.field_G = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_oc = 50;
        this.field_mb = 0;
        this.field_Hb = 0;
        this.field_vb = 0;
        this.field_I = false;
        this.field_Vb = -1;
        this.field_Rb = true;
        this.field_bb = false;
        this.field_Yb = 3584;
        this.field_Ob = -1;
        this.field_jb = 1.0f;
        this.field_xb = 0;
        this.field_C = -1;
        this.field_F = 0;
        this.field_yc = 0;
        this.field_w = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.field_sc = 512;
        this.field_fc = new float[16];
        this.field_l = sr.field_a;
        this.field_zb = false;
        this.field_Z = true;
        this.field_y = 0;
        this.field_A = this.field_w;
        this.field_S = -1.0f;
        this.field_Kb = -1;
        this.field_N = 1;
        this.field_u = true;
        this.field_X = new rq[10];
        this.field_p = false;
        this.field_tc = 128;
        this.field_i = false;
        this.field_db = true;
        this.field_P = 0;
        this.field_eb = new float[16];
        this.field_ec = new float[16];
        this.field_hb = -1.0f;
        this.field_R = false;
        this.field_Jb = false;
        this.field_T = 1.0f;
        this.field_Xb = 1.0f;
        this.field_U = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
        this.field_rc = 512;
        this.field_v = 0;
        this.field_ob = true;
        this.field_r = 0;
        this.field_s = mb.field_k;
        this.field_H = false;
        this.field_k = -1;
        this.field_Nb = 0;
        this.field_J = 1.0f;
        this.field_cb = new jaclib.memory.Stream();
        ut discarded$5 = new ut();
        try {
          L0: {
            try {
              L1: {
                L2: {
                  this.field_Ib = param1;
                  this.field_ab = param3;
                  this.field_Y = param4;
                  var11 = param0.getSize();
                  this.field_dc = param5;
                  this.field_Sb = var11.height;
                  this.field_rb = var11.width;
                  kr.a(true, -107, false);
                  if (null != this.field_h) {
                    this.field_lc = new mr((aw) (this), this.field_h);
                    this.field_nc = new jagex3.graphics2.hw.NativeInterface(this.field_h.a(32075), this.field_dc);
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= this.field_h.a(32075)) {
                        break L2;
                      } else {
                        L4: {
                          var9 = this.field_h.a(-29193, var8);
                          if (var9 == null) {
                            break L4;
                          } else {
                            this.field_nc.initTextureMetrics(var8, var9.field_t, var9.field_g);
                            break L4;
                          }
                        }
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_nc = new jagex3.graphics2.hw.NativeInterface(0, this.field_dc);
                    this.field_lc = null;
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = decompiledCaughtException;
              var7.printStackTrace();
              this.a((byte) -60);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var7_ref);

            stackIn_12_1 = new StringBuilder().append("aw.<init>(");

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
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        if (!((!this.field_tb ? 1 : 0) != (param0 ? 1 : 0))) {
            this.field_tb = param0 ? true : false;
            this.f(!param1 ? true : false);
        }
        if (!param1) {
            this.field_kc = -110;
        }
    }

    abstract void A(int param0);

    final hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        pu stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = new pu((aw) (this), param3, param4, param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("aw.TB(");

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

    final void a(mi param0, int param1, int param2) {
        if (param2 != 0) {
            return;
        }
        try {
            this.a((byte) 72, param1, false, false, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "aw.PB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract hq a(hu[] param0, byte param1);

    private final void j(int param0) {
        if (param0 != 128) {
            this.field_vb = -58;
        }
        this.V(26803);
        if (!(this.field_m == null)) {
            this.field_m.a((byte) -92);
        }
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_P = param0;
        this.field_Hb = param1;
        this.field_sc = param2;
        this.field_rc = param3;
        this.Q(13);
        this.u(2);
        this.d(false);
        this.h((byte) -128);
    }

    private final void n(byte param0) {
        if (this.field_m != null) {
            this.field_m.a(260);
        }
        if (param0 > -25) {
            return;
        }
        this.b(true);
    }

    void Y(int param0) {
        this.field_Ab = this.field_ub;
        if (param0 >= -83) {
            this.field_vb = -113;
        }
        this.field_ub = 0;
    }

    final jaclib.memory.heap.NativeHeapBuffer a(boolean param0, boolean param1, int param2) {
        if (param0) {
            this.field_C = -95;
        }
        return this.field_gb.a(param2, param1);
    }

    final ut k(byte param0) {
        if (!(this.field_R)) {
            this.field_vc.a(this.field_Gb, (byte) 77, this.field_Lb);
            this.field_R = true;
        }
        if (param0 < 58) {
            return (ut) null;
        }
        return this.field_vc;
    }

    abstract void a(int param0, int param1, pv param2);

    final void K(int param0) {
        if (!(4 == this.field_ic)) {
            this.L(-25);
            this.c(false, -32);
            this.d(111, false);
            this.c(80, false);
            this.b(false, 4);
            this.a(-2, false, 50, false);
            this.e(1, 13);
            this.h(96, 0);
            this.field_ic = 4;
        }
        if (param0 != 0) {
            this.field_Zb = (ed[]) null;
        }
    }

    final int XA() {
        return this.field_Yb;
    }

    void f(int param0) {
        if (this.field_lc != null) {
            this.field_lc.a(125);
        }
        this.field_kc = 2147483647 & param0;
    }

    final void L(int param0) {
        hv var2 = null;
        if (param0 != -25) {
            this.c(-125);
        }
        if (!(this.field_s == vu.field_h)) {
            var2 = this.field_s;
            this.field_s = vu.field_h;
            if (!(!var2.a(-20011))) {
                this.W(16);
            }
            this.c((byte) -88);
            this.field_A = this.field_fc;
            this.g(param0 ^ -26);
            this.field_ic = this.field_ic & -25;
        }
    }

    final ut d(int param0) {
        if (param0 <= 57) {
            return (ut) null;
        }
        return this.field_Lb;
    }

    final void l(int param0) {
        if (param0 != 0) {
            this.a(true, -85);
        }
        if (!(ar.field_L == this.field_wb[this.field_mc])) {
            this.field_wb[this.field_mc] = ar.field_L;
            this.field_V[this.field_mc].a(1);
            this.j(128);
        }
    }

    final ru a(int[] param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        ru stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 < -88) {
                break L1;
              } else {
                this.field_Wb = (pv) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param2, 0, param0, param4, -64, 0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("aw.CE(");

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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    abstract void o(int param0);

    abstract void a(int param0, mp param1);

    abstract pv a(byte param0, boolean param1);

    final void n(int param0) {
        this.a(0, an.field_d, param0);
    }

    final void g(int param0, int param1) {
        if (param1 > -107) {
            return;
        }
        if (!(param0 == this.field_mc)) {
            this.field_mc = param0;
            this.cb(-31);
        }
    }

    abstract void x(int param0);

    private final void p(int param0) {
        if (param0 != 5) {
            this.field_k = -39;
        }
    }

    final int v(int param0) {
        if (param0 != 15) {
            return -11;
        }
        return this.field_k;
    }

    abstract void c(int param0, int param1);

    final int S(int param0) {
        int var2 = -108 / ((64 - param0) / 32);
        return this.field_Ob;
    }

    private final boolean o(byte param0) {
        if (param0 != 24) {
            this.cb(83);
        }
        return this.field_X[3].b((byte) -59);
    }

    abstract void q(int param0);

    abstract void eb(int param0);

    private final void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int var8;
        L0: {
          var8 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 2147483647) {
            break L0;
          } else {
            this.field_m = (rq) null;
            break L0;
          }
        }
        L1: {
          param3 = param3 & this.o((byte) 24);
          if (param3) {
            break L1;
          } else {
            L2: {
              if ((param5 ^ -1) == -5) {
                break L2;
              } else {
                if (8 == param5) {
                  break L2;
                } else {
                  if (9 != param5) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              param5 = 2;
              if ((param5 ^ -1) == -5) {
                stackIn_10_0 = 1 & param4;
                break L3;
              } else {
                stackIn_10_0 = 1;
                break L3;
              }
            }
            param2 = stackIn_10_0;
            param4 = 0;
            break L1;
          }
        }
        L4: {
          if (param5 == 0) {
            break L4;
          } else {
            if (param1) {
              param5 = param5 | -2147483648;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (param5 == this.field_L) {
            if (-1 != (this.field_L ^ -1)) {
              L6: {
                this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                if (param4 != this.field_xb) {
                  break L6;
                } else {
                  if (this.field_ac != param2) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
              this.field_xb = param4;
              this.field_ac = param2;
              break L5;
            } else {
              break L5;
            }
          } else {
            L7: {
              if (-1 != (this.field_L ^ -1)) {
                this.field_X[this.field_L & 2147483647].c(false);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param5 != 0) {
                this.field_m = this.field_X[2147483647 & param5];
                this.field_m.a(param1, 20186);
                this.field_m.a(param1, (byte) -79);
                this.field_m.a(param0 ^ 2147449624, param2, param4);
                break L8;
              } else {
                this.field_m = null;
                break L8;
              }
            }
            this.field_L = param5;
            this.field_ac = param2;
            this.field_xb = param4;
            break L5;
          }
        }
    }

    abstract void db(int param0);

    final void w(int param0) {
        if (!(2 == this.field_ic)) {
            this.L(-25);
            this.c(false, -32);
            this.d(param0 + 109, false);
            this.c(83, false);
            this.b(false, 4);
            this.a(-2, false, param0 + 40, false);
            this.field_ic = 2;
        }
        if (param0 != 10) {
            this.a(-53, true, 73, false);
        }
    }

    final int e(byte param0) {
        if (param0 < 5) {
            iw var3 = (iw) null;
            this.a((io) null, (iw) null, -127, 20, (byte) -94);
        }
        return this.field_mb;
    }

    final void h(int param0, int param1) {
        int var4;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 > 28) {
            break L0;
          } else {
            this.field_R = true;
            break L0;
          }
        }
        L1: {
          if (param1 == 1) {
            this.a((byte) -83, lf.field_e, lf.field_e);
            break L1;
          } else {
            if (0 == param1) {
              this.a((byte) -83, vi.field_v, vi.field_v);
              break L1;
            } else {
              if ((param1 ^ -1) == -3) {
                this.a((byte) -83, lf.field_e, ua.field_n);
                break L1;
              } else {
                if (param1 == 3) {
                  this.a((byte) -83, vi.field_v, cv.field_F);
                  break L1;
                } else {
                  if (param1 == 4) {
                    this.a((byte) -83, bj.field_c, bj.field_c);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    final int h(int param0) {
        int var2 = 21 % ((-37 - param0) / 47);
        return this.field_Cb + (this.field_o + this.field_pc);
    }

    final void a(int param0, boolean param1, int param2, boolean param3) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        wm var10;
        int var11;
        int var12;
        ut var13;
        int var14;
        L0: {
          var14 = Sumoblitz.field_L ? 1 : 0;
          if (param2 == 50) {
            break L0;
          } else {
            field_t = (tf) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_Vb != param0) {
              break L2;
            } else {
              L3: {
                if (this.field_fb) {
                  stackIn_6_0 = 0;
                  break L3;
                } else {
                  stackIn_6_0 = 1;
                  break L3;
                }
              }
              L4: {


                if (this.field_bb) {

                  stackIn_9_1 = 0;
                  break L4;
                } else {

                  stackIn_9_1 = 1;
                  break L4;
                }
              }
              if (stackIn_6_0 != stackIn_9_1) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L5: {
            var5 = null;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (!this.field_fb) {
              stackIn_14_0 = 0;
              break L5;
            } else {
              stackIn_14_0 = 3;
              break L5;
            }
          }
          L6: {
            var9 = stackIn_14_0;
            if (0 > param0) {
              this.l(0);
              break L6;
            } else {
              L7: {
                L8: {
                  var5 = this.field_lc.a(param2 + 37, param0);
                  var10 = this.field_h.a(-29193, param0);
                  if (var10.field_c != 0) {
                    break L8;
                  } else {
                    if (var10.field_u != 0) {
                      break L8;
                    } else {
                      this.l(0);
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var10.field_n) {
                    stackIn_21_0 = 64;
                    break L9;
                  } else {
                    stackIn_21_0 = 128;
                    break L9;
                  }
                }
                var11 = stackIn_21_0;
                var12 = var11 * 50;
                var13 = this.B(0);
                var13.a((float)(this.field_kc % var12 * var10.field_u) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_kc % var12)) / (float)var12, param2 + -50);
                this.a(rs.field_c, param2 + 28830);
                break L7;
              }
              var6 = var10.field_q;
              if (!this.field_fb) {
                var9 = var10.field_d;
                var8 = var10.field_h;
                var7 = var10.field_j;
                break L6;
              } else {
                break L6;
              }
            }
          }
          L10: {
            this.a(2147483647, param1, var8, param3, var7, var9);
            if (null == this.field_m) {
              this.a((ed) (var5), 117);
              this.h(45, var6);
              break L10;
            } else {
              this.field_m.a(var6, 18834, (ed) (var5));
              break L10;
            }
          }
          this.field_bb = this.field_fb;
          this.field_Vb = param0;
          break L1;
        }
        this.field_ic = this.field_ic & -8;
    }

    abstract void b(boolean param0);

    final ut g(byte param0) {
        if (param0 != -28) {
            return (ut) null;
        }
        return this.field_Gb;
    }

    abstract void a(int param0, boolean param1);

    final void s(byte param0) {
        java.awt.Canvas var3_ref_java_awt_Canvas = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        Enumeration var2 = this.field_Q.keys();
        while (var2.hasMoreElements()) {
            var3_ref_java_awt_Canvas = (java.awt.Canvas) (var2.nextElement());
            this.a(var3_ref_java_awt_Canvas, this.field_Q.get(var3_ref_java_awt_Canvas), 0);
        }
        int var3 = 82 % ((11 - param0) / 51);
        this.field_x.b(12001);
        this.field_Wb.b(12001);
        this.field_Qb.b(12001);
        this.field_gc.b((byte) 100);
        this.field_qc.b((byte) 20);
        this.field_hc.b((byte) -128);
        this.field_Fb.b((byte) 7);
        this.field_ib.b((byte) -123);
        this.field_yb.b(-19073);
        this.field_M.b(12001);
    }

    final void c(boolean param0, int param1) {
        if (param1 != -32) {
            this.g((byte) -79);
        }
        if (param0 != this.field_Bb) {
            this.field_Bb = param0 ? true : false;
            this.i((byte) -119);
            this.field_ic = this.field_ic & -32;
        }
    }

    abstract void V(int param0);

    private final void m(byte param0) {
        this.field_ec[10] = this.field_q;
        this.field_ec[14] = this.field_kb;
        if (param0 != -83) {
            this.field_Tb = 1.2932486534118652f;
        }
    }

    final void P(int param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        Hashtable var2 = new Hashtable();
        if (param0 >= -26) {
            return;
        }
        if (null != this.field_Q && !this.field_Q.isEmpty()) {
            var3 = this.field_Q.keys();
            while (var3.hasMoreElements()) {
                var4 = (java.awt.Canvas) (var3.nextElement());
                var2.put(var4, this.a(var4, 3));
            }
        }
        this.field_Q = var2;
        this.O(5);
        this.r((byte) 121);
        this.y(-101);
        this.field_yb.a(117, (aw) (this));
    }

    private final void Z(int param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float var8;
        float[] var9;
        L0: {
          if (!this.field_O) {
            L1: {
              L2: {
                var9 = this.field_eb;
                var2 = var9;
                var3 = (float)this.field_oc;
                var4 = (float)this.field_Yb;
                var5 = (float)(-this.field_Hb) * this.field_qb / (float)this.field_rc;
                var6 = (float)(-this.field_P) * this.field_qb / (float)this.field_sc;
                var7 = (float)(-this.field_P + this.field_rb) * this.field_qb / (float)this.field_sc;
                var8 = (float)(this.field_Sb - this.field_Hb) * this.field_qb / (float)this.field_rc;
                if (var6 == var7) {
                  break L2;
                } else {
                  if (var5 == var8) {
                    break L2;
                  } else {
                    var9[14] = var3 / (var3 - var4);
                    var9[1] = 0.0f;
                    var9[10] = 1.0f / (-var4 + var3);
                    var9[6] = 0.0f;
                    var9[15] = 1.0f;
                    var9[8] = 0.0f;
                    var9[9] = 0.0f;
                    var9[2] = 0.0f;
                    var9[7] = 0.0f;
                    var9[11] = 0.0f;
                    var9[5] = 2.0f / (-var5 + var8);
                    var9[12] = (var7 + var6) / (-var7 + var6);
                    var9[0] = 2.0f / (-var6 + var7);
                    var9[3] = 0.0f;
                    var9[4] = 0.0f;
                    var9[13] = (var8 + var5) / (-var5 + var8);
                    break L1;
                  }
                }
              }
              var2[9] = 0.0f;
              var2[5] = 1.0f;
              var2[3] = 0.0f;
              var2[15] = 1.0f;
              var2[6] = 0.0f;
              var2[12] = 0.0f;
              var2[14] = 0.0f;
              var2[11] = 0.0f;
              var2[7] = 0.0f;
              var2[0] = 1.0f;
              var2[8] = 0.0f;
              var2[1] = 0.0f;
              var2[13] = 0.0f;
              var2[10] = 1.0f;
              var2[2] = 0.0f;
              var2[4] = 0.0f;
              break L1;
            }
            this.p(param0 + 5);
            this.field_O = true;
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == 0) {
            break L3;
          } else {
            this.i();
            break L3;
          }
        }
    }

    final ef d(byte param0) {
        if (param0 != 122) {
            aw.j((byte) 73);
        }
        if (this.field_uc == null) {
            return null;
        }
        return this.field_uc.b(param0 ^ 37);
    }

    abstract ru a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, iw param7);

    abstract void a(int param0, boolean param1, byte param2, mi param3);

    rq d(int param0, int param1) {
        int var3;
        int var4;
        hu[] var5;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            var5 = (hu[]) null;
            this.a((hu[]) null, (byte) -48);
            break L0;
          }
        }
        var3 = param1;
        if (var3 != 6) {
          if ((var3 ^ -1) == -2) {
            return (rq) ((Object) new ng((aw) (this)));
          } else {
            if (2 == var3) {
              return (rq) ((Object) new ib((aw) (this), this.field_Mb));
            } else {
              if (7 != var3) {
                return (rq) ((Object) new ni((aw) (this)));
              } else {
                return (rq) ((Object) new uo((aw) (this)));
              }
            }
          }
        } else {
          return (rq) ((Object) new oc((aw) (this)));
        }
    }

    abstract void cb(int param0);

    abstract ru a(boolean param0, int param1, int[] param2, int param3, int param4, int param5, int param6);

    private final void R(int param0) {
        int var2;
        float[] var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float[] var9;
        float[] var10;
        float var8;
        L0: {
          var2 = 115 / ((39 - param0) / 47);
          if (this.field_Jb) {
            break L0;
          } else {
            L1: {
              L2: {
                var10 = this.field_ec;
                var9 = var10;
                var3 = var9;
                var4 = (float)(this.field_oc * -this.field_P) / (float)this.field_sc;
                var5 = (float)(this.field_oc * (-this.field_P + this.field_rb)) / (float)this.field_sc;
                var6 = (float)(this.field_Hb * this.field_oc) / (float)this.field_rc;
                var7 = (float)(this.field_oc * (this.field_Hb + -this.field_Sb)) / (float)this.field_rc;
                if (var5 == var4) {
                  break L2;
                } else {
                  if (var7 != var6) {
                    var8 = (float)this.field_oc * 2.0f;
                    var3[0] = var8 / (-var4 + var5);
                    var3[1] = 0.0f;
                    var3[4] = 0.0f;
                    var3[9] = (var6 + var7) / (var6 - var7);
                    var3[15] = 0.0f;
                    var3[5] = var8 / (-var7 + var6);
                    var3[8] = (var5 + var4) / (-var4 + var5);
                    this.field_kb = (float)(this.field_Yb * this.field_oc) / (float)(-this.field_Yb + this.field_oc);
                    var3[14] = (float)(this.field_Yb * this.field_oc) / (float)(-this.field_Yb + this.field_oc);
                    var3[6] = 0.0f;
                    var3[2] = 0.0f;
                    var10[11] = -1.0f;
                    var3[12] = 0.0f;
                    var3[7] = 0.0f;
                    var3[13] = 0.0f;
                    var3[3] = 0.0f;
                    this.field_q = (float)this.field_Yb / (float)(this.field_oc - this.field_Yb);
                    var3[10] = (float)this.field_Yb / (float)(this.field_oc - this.field_Yb);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3[5] = 1.0f;
              var3[11] = 0.0f;
              var3[9] = 0.0f;
              var3[8] = 0.0f;
              var3[12] = 0.0f;
              var3[0] = 1.0f;
              var3[6] = 0.0f;
              var3[2] = 0.0f;
              var3[7] = 0.0f;
              var3[3] = 0.0f;
              var3[15] = 1.0f;
              var3[13] = 0.0f;
              var3[10] = 1.0f;
              var3[14] = 0.0f;
              var3[4] = 0.0f;
              var3[1] = 0.0f;
              break L1;
            }
            this.m((byte) -83);
            this.field_Jb = true;
            break L0;
          }
        }
    }

    static {
        field_t = new tf();
    }
}
