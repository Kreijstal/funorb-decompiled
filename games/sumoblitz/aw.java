/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import jaclib.memory.Stream;

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
        float[] var2 = null;
        float[] var3 = null;
        float[] var4 = null;
        float[] var5 = null;
        float[] var6 = null;
        float[] var7 = null;
        L0: {
          if (param0 == -88) {
            break L0;
          } else {
            aw.j((byte) -98);
            break L0;
          }
        }
        L1: {
          if (!((aw) this).field_zb) {
            L2: {
              L3: {
                var3 = ((aw) this).field_fc;
                var7 = var3;
                var6 = var7;
                var5 = var6;
                var4 = var5;
                var2 = var4;
                if (0 == ((aw) this).field_rb) {
                  break L3;
                } else {
                  if (((aw) this).field_Sb != 0) {
                    var7[12] = -1.0f;
                    var7[10] = 0.5f;
                    var2[5] = -2.0f / (float)((aw) this).field_Sb;
                    var2[2] = 0.0f;
                    var2[4] = 0.0f;
                    var2[7] = 0.0f;
                    var2[11] = 0.0f;
                    var2[15] = 1.0f;
                    var2[6] = 0.0f;
                    var2[8] = 0.0f;
                    var7[14] = 0.5f;
                    var2[13] = 1.0f;
                    var2[0] = 2.0f / (float)((aw) this).field_rb;
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
            ((aw) this).field_zb = true;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void c(int param0, boolean param1) {
        if (!((!((aw) this).field_p ? 1 : 0) == (!param1 ? 1 : 0))) {
            ((aw) this).field_p = param1 ? true : false;
            ((aw) this).q(79);
            ((aw) this).field_ic = ((aw) this).field_ic & -32;
        }
        if (param0 <= 32) {
            ((aw) this).field_K = null;
        }
    }

    abstract void N(int param0);

    final ru a(byte[] param0, int param1, int param2, iw param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        ru stackIn_3_0 = null;
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
        ru stackOut_2_0 = null;
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
              if (param4 == 0) {
                break L1;
              } else {
                ((aw) this).field_mc = 3;
                break L1;
              }
            }
            stackOut_2_0 = ((aw) this).a(param3, param1, param2, 0, param0, (byte) 97, 0, param5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("aw.TD(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_3_0;
    }

    final ut c(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((aw) this).field_sb;
    }

    private final void h(byte param0) {
        if (param0 > -77) {
            ((aw) this).field_lc = null;
        }
    }

    final void k(int param0) {
        ((aw) this).field_Lb.a(param0);
        ((aw) this).field_Db = true;
        this.z(-29654);
    }

    abstract void f(boolean param0);

    abstract cr e(int param0, boolean param1);

    abstract Object a(java.awt.Canvas param0, int param1);

    final int M(int param0) {
        int var2 = -35 / ((param0 - 54) / 59);
        return ((aw) this).field_Pb;
    }

    final static String a(String param0, String param1, String param2, boolean param3) {
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (!param3) {
            field_t = null;
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
            return null;
        }
        return ((aw) this).field_V[((aw) this).field_mc];
    }

    final void d(boolean param0) {
        hv var2 = null;
        if (param0) {
            this.n((byte) 96);
        }
        if (mb.field_k != ((aw) this).field_s) {
            var2 = ((aw) this).field_s;
            ((aw) this).field_s = mb.field_k;
            if (!(!var2.a(-20011))) {
                this.W(16);
            }
            ((aw) this).field_ic = ((aw) this).field_ic & -32;
            ((aw) this).field_A = ((aw) this).field_w;
        }
    }

    final void U(int param0) {
        ((aw) this).field_Db = false;
        if (param0 != 0) {
            return;
        }
        this.z(-29654);
    }

    abstract void bb(int param0);

    final void m(int param0) {
        ((aw) this).field_vb = 0;
        ((aw) this).field_v = 0;
        if (param0 != -16088) {
            ((aw) this).field_Ob = -12;
        }
        ((aw) this).field_F = ((aw) this).field_rb;
        ((aw) this).field_yc = ((aw) this).field_Sb;
        if (((aw) this).field_wc) {
            ((aw) this).field_wc = false;
            ((aw) this).A(-121);
        }
        this.h((byte) -128);
    }

    abstract ef a(int param0, byte param1, int[][] param2, boolean param3);

    abstract float b(byte param0);

    private final void z(int param0) {
        float var2 = 0.0f;
        if (vu.field_h == ((aw) this).field_s) {
            var2 = ((aw) this).b((byte) 127);
            ((aw) this).field_Lb.a((byte) 96, 0.0f, var2, var2);
        }
        ((aw) this).field_R = false;
        ((aw) this).x(0);
        if (!(null == ((aw) this).field_m)) {
            ((aw) this).field_m.c((byte) 37);
        }
    }

    final int t(int param0) {
        int var2 = 39 % ((param0 - -20) / 54);
        return ((aw) this).field_mc;
    }

    final void d(int param0, boolean param1) {
        if (!(((aw) this).field_I == param1)) {
            ((aw) this).field_I = param1 ? true : false;
            ((aw) this).f(false);
            ((aw) this).field_ic = ((aw) this).field_ic & -8;
        }
        int var3 = -80 % ((35 - param0) / 54);
    }

    abstract nh a(boolean param0, iw param1, int param2, int param3, byte[] param4, int param5);

    abstract void l(byte param0);

    final void T(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(param0 <= ((aw) this).field_v)) {
            var5 = 1;
            ((aw) this).field_v = param0;
        }
        if (!(param2 >= ((aw) this).field_F)) {
            var5 = 1;
            ((aw) this).field_F = param2;
        }
        if (!(((aw) this).field_vb >= param1)) {
            ((aw) this).field_vb = param1;
            var5 = 1;
        }
        if (!(param3 >= ((aw) this).field_yc)) {
            ((aw) this).field_yc = param3;
            var5 = 1;
        }
        if (var5 != 0) {
            if (!(((aw) this).field_wc)) {
                ((aw) this).field_wc = true;
                ((aw) this).A(-57);
            }
            ((aw) this).F(4);
            this.h((byte) -122);
        }
    }

    abstract void F(int param0);

    public static void G(int param0) {
        field_t = null;
        field_j = null;
    }

    abstract void a(byte param0, int param1, boolean param2, boolean param3, mi param4);

    abstract void E(int param0);

    abstract void ab(int param0);

    final hr a(ri param0, boolean param1) {
        RuntimeException var3 = null;
        hr var3_ref = null;
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
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        hr stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        hr stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
                      var14 = new int[param0.field_h * param0.field_i];
                      var13 = var14;
                      var12 = var13;
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
                                  int incrementValue$3 = var5;
                                  var5++;
                                  var9 = param0.field_g[param0.field_e[incrementValue$3] & 255];
                                  int incrementValue$4 = var6;
                                  var6++;
                                  stackOut_16_0 = (int[]) var4;
                                  stackOut_16_1 = incrementValue$4;
                                  stackIn_18_0 = stackOut_16_0;
                                  stackIn_18_1 = stackOut_16_1;
                                  stackIn_17_0 = stackOut_16_0;
                                  stackIn_17_1 = stackOut_16_1;
                                  if (var9 == 0) {
                                    stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                                    stackOut_18_1 = stackIn_18_1;
                                    stackOut_18_2 = 0;
                                    stackIn_19_0 = stackOut_18_0;
                                    stackIn_19_1 = stackOut_18_1;
                                    stackIn_19_2 = stackOut_18_2;
                                    break L6;
                                  } else {
                                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                                    stackOut_17_1 = stackIn_17_1;
                                    stackOut_17_2 = ic.a(var9, -16777216);
                                    stackIn_19_0 = stackOut_17_0;
                                    stackIn_19_1 = stackOut_17_1;
                                    stackIn_19_2 = stackOut_17_2;
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
                                int incrementValue$5 = var6;
                                var6++;
                                var4[incrementValue$5] = ic.a(param0.field_a[var5] << 24, param0.field_g[eb.a(255, (int) param0.field_e[var5])]);
                                var5++;
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3_ref = ((aw) this).a(0, -2, param0.field_i, param0.field_h, param0.field_h, var14);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_ref = ((aw) this).a(0, -2, 1, 1, 1, new int[1]);
              break L1;
            }
            var3_ref.a(param0.field_c, param0.field_d, param0.field_b, param0.field_f);
            stackOut_22_0 = (hr) var3_ref;
            stackIn_23_0 = stackOut_22_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("aw.RA(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 41);
        }
        return stackIn_23_0;
    }

    private final void g(boolean param0) {
        ((aw) this).a(0, 119, ((aw) this).field_Wb);
        ((aw) this).a(-77, ((aw) this).field_xc);
        ((aw) this).a(0, 0, 1, tc.field_g);
    }

    final ru a(int param0, iw param1, byte param2, boolean param3, int param4, float[] param5) {
        RuntimeException var7 = null;
        ru stackIn_3_0 = null;
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
        ru stackOut_2_0 = null;
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
              if (param2 > 84) {
                break L1;
              } else {
                ((aw) this).field_kc = 90;
                break L1;
              }
            }
            stackOut_2_0 = ((aw) this).a(0, param4, param3, 0, param5, param0, (byte) -125, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("aw.IC(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final jaclib.memory.Stream a(boolean param0, jaclib.memory.Buffer param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        jaclib.memory.Stream stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jaclib.memory.Stream stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0) {
              ((aw) this).field_cb.a(param1);
              stackOut_3_0 = ((aw) this).field_cb;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (jaclib.memory.Stream) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("aw.NE(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(mi param0, int param1, boolean param2) {
        try {
            if (!param2) {
                this.c((byte) -34);
            }
            ((aw) this).a(param1, false, (byte) 54, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "aw.ID(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    abstract void p(byte param0);

    private final void a(int param0, ck param1, int param2) {
        try {
            ((aw) this).a(0, 86, ((aw) this).field_x);
            ((aw) this).a(125, ((aw) this).field_nb);
            ((aw) this).a(param0, param0, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "aw.VE(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(tf param0, int param1) {
        try {
            if (param1 != 28880) {
                ((aw) this).N(-123);
            }
            ((aw) this).field_wb[((aw) this).field_mc] = param0;
            this.j(param1 ^ 28752);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "aw.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        ((aw) this).field_V = new ut[((aw) this).field_cc];
        ((aw) this).field_Zb = new ed[((aw) this).field_cc];
        ((aw) this).field_wb = new tf[((aw) this).field_cc];
        ((aw) this).field_K = new tg[((aw) this).field_cc];
        ((aw) this).field_B = new tg[((aw) this).field_cc];
        var2 = 0;
        L0: while (true) {
          if (((aw) this).field_cc <= var2) {
            L1: {
              ((aw) this).field_pb = new ko[-2 + ((aw) this).field_bc];
              ((aw) this).field_D = (ed) (Object) ((aw) this).a(io.field_g, nl.field_p, 1, 1, (byte) -110);
              ((aw) this).a((za) (Object) new he(262144));
              ((aw) this).field_jc = ((aw) this).a(new hu[1], (byte) 78);
              hq discarded$8 = ((aw) this).a(new hu[1], (byte) 70);
              hq discarded$9 = ((aw) this).a(new hu[4], (byte) 14);
              hq discarded$10 = ((aw) this).a(new hu[3], (byte) 100);
              gu discarded$11 = new gu((aw) this, 0, 0, false, false);
              ((aw) this).field_gc = new gu((aw) this, 0, 0, true, true);
              gu discarded$12 = new gu((aw) this, 0, 0, false, false);
              ((aw) this).field_qc = new gu((aw) this, 0, 0, true, true);
              gu discarded$13 = new gu((aw) this, 0, 0, false, false);
              ((aw) this).field_hc = new gu((aw) this, 0, 0, true, true);
              gu discarded$14 = new gu((aw) this, 0, 0, false, false);
              ((aw) this).field_Fb = new gu((aw) this, 0, 0, true, true);
              gu discarded$15 = new gu((aw) this, 0, 0, false, param0);
              ((aw) this).field_ib = new gu((aw) this, 0, 0, true, true);
              ((aw) this).field_yb = new jl((aw) this);
              ((aw) this).field_M = ((aw) this).e(3, true);
              ((aw) this).P(-55);
              ((aw) this).field_Mb = new sk((aw) this);
              ((aw) this).field_X[1] = ((aw) this).d(0, 1);
              ((aw) this).field_X[2] = ((aw) this).d(0, 2);
              ((aw) this).field_X[4] = ((aw) this).d(0, 4);
              ((aw) this).field_X[5] = ((aw) this).d(0, 5);
              ((aw) this).field_X[6] = ((aw) this).d(0, 6);
              ((aw) this).field_X[7] = ((aw) this).d(0, 7);
              ((aw) this).field_X[3] = ((aw) this).d(0, 3);
              ((aw) this).field_X[8] = ((aw) this).d(0, 8);
              ((aw) this).field_X[9] = ((aw) this).d(0, 9);
              if (!((aw) this).field_X[2].b((byte) -82)) {
                ((aw) this).field_X[2] = ((aw) this).d(0, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((aw) this).field_X[4].b((byte) -67)) {
                break L2;
              } else {
                ((aw) this).field_X[4] = ((aw) this).field_X[2];
                break L2;
              }
            }
            L3: {
              if (!((aw) this).field_X[8].b((byte) -42)) {
                ((aw) this).field_X[8] = ((aw) this).field_X[4];
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((aw) this).field_X[9].b((byte) -43)) {
                break L4;
              } else {
                ((aw) this).field_X[9] = ((aw) this).field_X[8];
                break L4;
              }
            }
            ((aw) this).D(1);
            ((aw) this).m(-16088);
            ((aw) this).e();
            return;
          } else {
            ((aw) this).field_B[var2] = vi.field_v;
            ((aw) this).field_K[var2] = vi.field_v;
            ((aw) this).field_wb[var2] = ar.field_L;
            ((aw) this).field_V[var2] = new ut();
            var2++;
            continue L0;
          }
        }
    }

    abstract void a(java.awt.Canvas param0, Object param1, int param2);

    private final void u(int param0) {
        ((aw) this).field_Jb = false;
        this.R(-61);
        if (!(pd.field_m != ((aw) this).field_s)) {
            this.g(1);
        }
    }

    final void a(boolean param0, int param1) {
        if (param0) {
            return;
        }
        if (!(param1 == ((aw) this).field_Ub)) {
            ((aw) this).field_Ub = param1;
            ((aw) this).r(1);
        }
    }

    final ut B(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((aw) this).field_V[((aw) this).field_mc];
    }

    final static void C(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6 = rg.field_C;
            var1 = var6;
            var3 = -20;
            var2 = 0;
            var4 = var6.length;
            L1: while (true) {
              if (var4 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var6[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var6[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var6[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var6[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var6[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var6[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var6[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var6[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1_ref, "aw.N(" + -114 + 41);
        }
    }

    private final void W(int param0) {
        ((aw) this).field_R = false;
        if (!(((aw) this).field_m == null)) {
            ((aw) this).field_m.b(-74);
        }
        ((aw) this).N(-26911);
    }

    abstract void a(int param0, hq param1);

    abstract boolean a(byte param0, io param1, iw param2);

    void D(int param0) {
        this.T(-1);
        if (param0 != 1) {
            Object var3 = null;
            nh discarded$0 = ((aw) this).a(true, (iw) null, -62, 114, (byte[]) null, 71);
        }
    }

    abstract void i(byte param0);

    abstract boolean a(io param0, iw param1, int param2);

    final void a(za param0) {
        try {
            ((aw) this).field_gb = ((he) (Object) param0).field_p;
            ((aw) this).field_z = ((aw) this).field_gb.a(32768, false);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "aw.OB(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    void d() {
        ms var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (!(((aw) this).field_H)) {
            var1 = ((aw) this).field_lb.b(-66);
            while (var1 != null) {
                ((he) (Object) var1).c(-14365);
                var1 = ((aw) this).field_lb.d((byte) 18);
            }
            var1_ref = ((aw) this).field_Q.keys();
            while (var1_ref.hasMoreElements()) {
                var2 = (java.awt.Canvas) var1_ref.nextElement();
                ((aw) this).a(var2, ((aw) this).field_Q.get((Object) (Object) var2), 0);
            }
            pt.a(false, true, -1);
            ((aw) this).field_nc.release();
            ((aw) this).field_H = true;
        }
    }

    abstract void i(int param0);

    final void K(int[] param0) {
        try {
            param0[0] = ((aw) this).field_v;
            param0[3] = ((aw) this).field_yc;
            param0[2] = ((aw) this).field_F;
            param0[1] = ((aw) this).field_vb;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "aw.K(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    abstract void a(int param0, int param1, int param2, ck param3);

    final void s(int param0, int param1, int param2, int param3, int param4) {
        this.f((byte) 117);
        ((aw) this).a(false, param3);
        ((aw) this).a(mm.field_h, 0, 0);
        ((aw) this).a(mm.field_h, 0, true);
        ((aw) this).e(param4, 13);
        ((aw) this).field_Lb.b((float)param2, (float)param2, 0, 1.0f);
        ((aw) this).field_Lb.a(param1, param0, (byte) 103, 0);
        ((aw) this).U(0);
        ((aw) this).a(1, false);
        ((aw) this).a(0, 121, ((aw) this).field_Qb);
        ((aw) this).a(-64, ((aw) this).field_n);
        ((aw) this).a(1, 0, 256, rv.field_b);
        ((aw) this).a(1, true);
        ((aw) this).a(jq.field_a, 0, true);
        ((aw) this).a(jq.field_a, 0, 0);
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
        return new int[]{((aw) this).field_P, ((aw) this).field_Hb, ((aw) this).field_sc, ((aw) this).field_rc};
    }

    abstract void r(int param0);

    abstract void J(int param0);

    final za c(int param0) {
        he var2 = new he(param0);
        ((aw) this).field_lb.a((ms) (Object) var2, (byte) 39);
        return (za) (Object) var2;
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
              param1[0] = ((aw) this).field_A[0];
              param1[8] = ((aw) this).field_A[2];
              param1[12] = ((aw) this).field_A[3];
              param1[4] = ((aw) this).field_A[1];
              param1[5] = ((aw) this).field_A[5];
              param1[1] = ((aw) this).field_A[4];
              param1[13] = ((aw) this).field_A[7];
              param1[9] = ((aw) this).field_A[6];
              param1[2] = ((aw) this).field_A[8];
              param1[14] = ((aw) this).field_A[11];
              param1[10] = ((aw) this).field_A[10];
              param1[6] = ((aw) this).field_A[9];
              param1[3] = ((aw) this).field_A[12];
              param1[7] = ((aw) this).field_A[13];
              param1[15] = ((aw) this).field_A[15];
              param1[11] = ((aw) this).field_A[14];
              if (param0 <= -44) {
                break L1;
              } else {
                ((aw) this).field_peer = -100L;
                break L1;
              }
            }
            stackOut_2_0 = (float[]) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("aw.TC(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    abstract void q(byte param0);

    final boolean c() {
        return true;
    }

    private final void r(byte param0) {
        ((aw) this).field_Wb = ((aw) this).a((byte) 51, true);
        boolean discarded$0 = ((aw) this).field_Wb.a(12, (byte) -35, 24);
        ((aw) this).field_xc = ((aw) this).a(new hu[1], (byte) 118);
    }

    private final void f(byte param0) {
        int var2 = 90 / ((param0 - 40) / 56);
        if (((aw) this).field_ic != 1) {
            ((aw) this).L(-25);
            ((aw) this).c(false, -32);
            ((aw) this).d(123, false);
            ((aw) this).c(90, false);
            ((aw) this).b(false, 4);
            ((aw) this).a(-2, false, 50, false);
            ((aw) this).h(57, 1);
            ((aw) this).a(((aw) this).field_D, 117);
            ((aw) this).field_ic = 1;
        }
    }

    abstract void I(int param0);

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (param0 != ((aw) this).field_oc) {
              break L1;
            } else {
              if (param1 != ((aw) this).field_Yb) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ((aw) this).field_Yb = param1;
          ((aw) this).field_oc = param0;
          this.u(2);
          this.Q(13);
          this.n((byte) -78);
          break L0;
        }
    }

    abstract ru a(io param0, iw param1, int param2, int param3, byte param4);

    final void b(int param0, boolean param1) {
        if (!((!param1 ? 1 : 0) == (!((aw) this).field_Rb ? 1 : 0))) {
            ((aw) this).field_Rb = param1 ? true : false;
            ((aw) this).i((byte) -119);
        }
        if (param0 != 0) {
            ((aw) this).field_oc = -100;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
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
          ((aw) this).a(false, param4);
          ((aw) this).a(mm.field_h, 0, 0);
          ((aw) this).a(mm.field_h, 0, true);
          ((aw) this).e(param5, 13);
          ((aw) this).k(1);
          ((aw) this).a(1, false);
          this.g(false);
          ((aw) this).a(1, true);
          ((aw) this).a(jq.field_a, 0, true);
          ((aw) this).a(jq.field_a, 0, 0);
          return;
        }
    }

    private final void O(int param0) {
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        ((aw) this).field_x = ((aw) this).a((byte) 51, false);
        boolean discarded$1 = ((aw) this).field_x.a(28, (byte) -35, 140);
        var2 = 0;
        L0: while (true) {
          L1: {
            if (4 <= var2) {
              break L1;
            } else {
              var3 = ((aw) this).field_x.a(7454, true);
              if (var3 != null) {
                L2: {
                  var4 = ((aw) this).a(true, var3);
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
                if (((aw) this).field_x.a(22957)) {
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
            ((aw) this).field_nb = ((aw) this).a(new hu[1], (byte) 99);
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
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 89) {
                break L1;
              } else {
                boolean discarded$3 = this.a(-0.810268759727478f, 2.1692757606506348f, false, -2.797441005706787f, 1.3712314367294312f, 0.6615611910820007f, 0.5074755549430847f);
                break L1;
              }
            }
            L2: {
              if (((aw) this).field_Zb[((aw) this).field_mc] != param0) {
                L3: {
                  ((aw) this).field_Zb[((aw) this).field_mc] = param0;
                  if (param0 != null) {
                    param0.a(8905);
                    break L3;
                  } else {
                    ((aw) this).l((byte) 9);
                    break L3;
                  }
                }
                ((aw) this).field_ic = ((aw) this).field_ic & -2;
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("aw.BA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    private final void y(int param0) {
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        var10 = Sumoblitz.field_L ? 1 : 0;
        ((aw) this).field_Qb = ((aw) this).a((byte) 51, false);
        boolean discarded$2 = ((aw) this).field_Qb.a(12, (byte) -35, 3096);
        var2 = 0;
        L0: while (true) {
          L1: {
            if (4 <= var2) {
              break L1;
            } else {
              var3 = ((aw) this).field_Qb.a(7454, true);
              if (var3 != null) {
                var4 = ((aw) this).a(true, var3);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var5 = 0;
                L2: while (true) {
                  if (var5 > 256) {
                    var4.a();
                    if (((aw) this).field_Qb.a(22957)) {
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
          return;
        }
    }

    final static ha a(d param0, java.awt.Canvas param1, int param2, int param3) {
        RuntimeException var4 = null;
        fr stackIn_1_0 = null;
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
        fr stackOut_0_0 = null;
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
            stackOut_0_0 = new fr(param1, param0, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("aw.CB(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + 27541 + 41);
        }
        return (ha) (Object) stackIn_1_0;
    }

    private final void g(int param0) {
        ((aw) this).o(-2);
        if (null != ((aw) this).field_m) {
            ((aw) this).field_m.b(false);
        }
        if (param0 != 1) {
            ((aw) this).field_ac = 74;
        }
    }

    final void e(int param0, int param1) {
        il var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          if (param1 == 13) {
            break L0;
          } else {
            ((aw) this).field_cb = null;
            break L0;
          }
        }
        L1: {
          if (param0 != ((aw) this).field_N) {
            L2: {
              if (param0 != 1) {
                if (param0 == 2) {
                  var5 = 0;
                  var4 = 1;
                  var3 = lh.field_n;
                  break L2;
                } else {
                  if (param0 == 128) {
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
              if (((aw) this).field_u) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                break L3;
              }
            }
            L4: {
              stackOut_14_0 = stackIn_14_0;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var5 != 0) {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L4;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L4;
              }
            }
            L5: {
              if (stackIn_17_0 == stackIn_17_1) {
                break L5;
              } else {
                L6: {
                  stackOut_18_0 = this;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var5 == 0) {
                    stackOut_20_0 = this;
                    stackOut_20_1 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L6;
                  } else {
                    stackOut_19_0 = this;
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L6;
                  }
                }
                ((aw) this).field_u = stackIn_21_1 != 0;
                ((aw) this).s(102);
                break L5;
              }
            }
            L7: {
              if (var4 != 0) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L7;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L7;
              }
            }
            L8: {
              if (stackIn_25_0 != (((aw) this).field_ob ? 1 : 0)) {
                break L8;
              } else {
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
                ((aw) this).field_ob = stackIn_29_1 != 0;
                ((aw) this).p((byte) -4);
                break L8;
              }
            }
            L10: {
              if (var3 == ((aw) this).field_l) {
                break L10;
              } else {
                ((aw) this).field_l = var3;
                ((aw) this).bb(-19519);
                break L10;
              }
            }
            ((aw) this).field_N = param0;
            ((aw) this).field_ic = ((aw) this).field_ic & -29;
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final boolean a(float param0, float param1, boolean param2, float param3, float param4, float param5, float param6) {
        jaclib.memory.Buffer var10 = ((aw) this).field_Wb.a(7454, param2);
        if (var10 == null) {
            return false;
        }
        jaclib.memory.Stream var9 = ((aw) this).a(param2, var10);
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
        return ((aw) this).field_Wb.a(22957);
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.f((byte) -104);
        ((aw) this).a(false, param4);
        ((aw) this).a(mm.field_h, 0, 0);
        ((aw) this).a(mm.field_h, 0, true);
        ((aw) this).e(param5, 13);
        ((aw) this).field_Lb.b((float)param3, (float)param2, 0, 1.0f);
        ((aw) this).field_Lb.a(param1, param0, (byte) 107, 0);
        ((aw) this).U(0);
        ((aw) this).a(1, false);
        ((aw) this).n(2);
        ((aw) this).a(1, true);
        ((aw) this).a(jq.field_a, 0, true);
        ((aw) this).a(jq.field_a, 0, 0);
    }

    final void b(boolean param0, int param1) {
        if (param1 != 4) {
            this.f((byte) -69);
        }
        if ((!param0 ? 1 : 0) != (!((aw) this).field_i ? 1 : 0)) {
            ((aw) this).field_i = param0 ? true : false;
            ((aw) this).eb(120);
            ((aw) this).field_ic = ((aw) this).field_ic & -32;
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        ((aw) this).a(param0, param1, param2 + param0, param1, param3, param4);
    }

    final int i() {
        return ((aw) this).field_oc;
    }

    final da a(ta param0, ri[] param1, boolean param2) {
        RuntimeException var4 = null;
        mv stackIn_1_0 = null;
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
        mv stackOut_0_0 = null;
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
            stackOut_0_0 = new mv((aw) this, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("aw.DF(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
        return (da) (Object) stackIn_1_0;
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 <= 0) {
            if (((aw) this).field_rb - 1 <= param2) {
                if (param1 <= 0) {
                    if (!(((aw) this).field_Sb - 1 > param3)) {
                        ((aw) this).m(-16088);
                        return;
                    }
                }
            }
        }
        ((aw) this).field_vb = 0 > param1 ? 0 : param1;
        ((aw) this).field_yc = ((aw) this).field_rb < param3 ? 0 : param3;
        ((aw) this).field_F = ((aw) this).field_rb >= param2 ? param2 : 0;
        ((aw) this).field_v = param0 >= 0 ? param0 : 0;
        if (!(((aw) this).field_wc)) {
            ((aw) this).field_wc = true;
            ((aw) this).A(-87);
        }
        ((aw) this).F(4);
        this.h((byte) -82);
    }

    abstract void s(int param0);

    private final void Q(int param0) {
        ((aw) this).field_O = false;
        this.Z(0);
        if (!(mo.field_w != ((aw) this).field_s)) {
            this.g(1);
        }
    }

    private final void T(int param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        ((aw) this).ab(7);
        ((aw) this).db(0);
        ((aw) this).f(false);
        ((aw) this).Y(-95);
        ((aw) this).E(-76);
        ((aw) this).J(0);
        ((aw) this).I(0);
        ((aw) this).q(58);
        ((aw) this).eb(119);
        ((aw) this).i((byte) -119);
        ((aw) this).b(true);
        ((aw) this).p((byte) -4);
        ((aw) this).bb(-19519);
        ((aw) this).s(-92);
        for (var2 = ((aw) this).field_cc - 1; var2 >= 0; var2--) {
            ((aw) this).g(var2, -114);
            ((aw) this).q((byte) -128);
            ((aw) this).X(-86);
            ((aw) this).l(0);
        }
        ((aw) this).r(1);
        ((aw) this).i(0);
        ((aw) this).o(-2);
        ((aw) this).x(0);
        ((aw) this).N(-26911);
    }

    final void a(byte param0, tg param1, tg param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (param2 == ((aw) this).field_K[((aw) this).field_mc]) {
                break L1;
              } else {
                ((aw) this).field_K[((aw) this).field_mc] = param2;
                var4_int = 1;
                ((aw) this).q((byte) -93);
                break L1;
              }
            }
            L2: {
              if (param1 == ((aw) this).field_B[((aw) this).field_mc]) {
                break L2;
              } else {
                ((aw) this).field_B[((aw) this).field_mc] = param1;
                ((aw) this).X(-126);
                var4_int = 1;
                break L2;
              }
            }
            L3: {
              if (var4_int == 0) {
                break L3;
              } else {
                ((aw) this).field_ic = ((aw) this).field_ic & -30;
                break L3;
              }
            }
            L4: {
              if (param0 == -83) {
                break L4;
              } else {
                boolean discarded$2 = ((aw) this).c();
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("aw.FF(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          L6: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    abstract void X(int param0);

    aw(java.awt.Canvas param0, Object param1, d param2, ki param3, int param4, int param5) {
        super(param2);
        Throwable var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        wm var9 = null;
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
        ((aw) this).field_lb = new jn();
        ((aw) this).field_Db = true;
        ((aw) this).field_Lb = new ut();
        ut discarded$3 = new ut();
        ut discarded$4 = new ut();
        ((aw) this).field_Gb = new ut();
        ((aw) this).field_sb = new ut();
        ((aw) this).field_vc = new ut();
        ((aw) this).field_mc = 0;
        ((aw) this).field_ac = 0;
        ((aw) this).field_O = false;
        ((aw) this).field_tb = false;
        ((aw) this).field_qb = 1.0f;
        ((aw) this).field_L = 0;
        ((aw) this).field_G = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        ((aw) this).field_oc = 50;
        ((aw) this).field_mb = 0;
        ((aw) this).field_Hb = 0;
        ((aw) this).field_vb = 0;
        ((aw) this).field_I = false;
        ((aw) this).field_Vb = -1;
        ((aw) this).field_Rb = true;
        ((aw) this).field_bb = false;
        ((aw) this).field_Yb = 3584;
        ((aw) this).field_Ob = -1;
        ((aw) this).field_jb = 1.0f;
        ((aw) this).field_xb = 0;
        ((aw) this).field_C = -1;
        ((aw) this).field_F = 0;
        ((aw) this).field_yc = 0;
        ((aw) this).field_w = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        ((aw) this).field_sc = 512;
        ((aw) this).field_fc = new float[16];
        ((aw) this).field_l = sr.field_a;
        ((aw) this).field_zb = false;
        ((aw) this).field_Z = true;
        ((aw) this).field_y = 0;
        ((aw) this).field_A = ((aw) this).field_w;
        ((aw) this).field_S = -1.0f;
        ((aw) this).field_Kb = -1;
        ((aw) this).field_N = 1;
        ((aw) this).field_u = true;
        ((aw) this).field_X = new rq[10];
        ((aw) this).field_p = false;
        ((aw) this).field_tc = 128;
        ((aw) this).field_i = false;
        ((aw) this).field_db = true;
        ((aw) this).field_P = 0;
        ((aw) this).field_eb = new float[16];
        ((aw) this).field_ec = new float[16];
        ((aw) this).field_hb = -1.0f;
        ((aw) this).field_R = false;
        ((aw) this).field_Jb = false;
        ((aw) this).field_T = 1.0f;
        ((aw) this).field_Xb = 1.0f;
        ((aw) this).field_U = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
        ((aw) this).field_rc = 512;
        ((aw) this).field_v = 0;
        ((aw) this).field_ob = true;
        ((aw) this).field_r = 0;
        ((aw) this).field_s = mb.field_k;
        ((aw) this).field_H = false;
        ((aw) this).field_k = -1;
        ((aw) this).field_Nb = 0;
        ((aw) this).field_J = 1.0f;
        ((aw) this).field_cb = new jaclib.memory.Stream();
        ut discarded$5 = new ut();
        try {
          L0: {
            try {
              L1: {
                L2: {
                  ((aw) this).field_Ib = param1;
                  ((aw) this).field_ab = param3;
                  ((aw) this).field_Y = param4;
                  var11 = param0.getSize();
                  ((aw) this).field_dc = param5;
                  ((aw) this).field_Sb = var11.height;
                  ((aw) this).field_rb = var11.width;
                  kr.a(true, -107, false);
                  if (null != ((aw) this).field_h) {
                    ((aw) this).field_lc = new mr((aw) this, ((aw) this).field_h);
                    ((aw) this).field_nc = new jagex3.graphics2.hw.NativeInterface(((aw) this).field_h.a(32075), ((aw) this).field_dc);
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= ((aw) this).field_h.a(32075)) {
                        break L2;
                      } else {
                        L4: {
                          var9 = ((aw) this).field_h.a(-29193, var8);
                          if (var9 == null) {
                            break L4;
                          } else {
                            ((aw) this).field_nc.initTextureMetrics(var8, var9.field_t, var9.field_g);
                            break L4;
                          }
                        }
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    ((aw) this).field_nc = new jagex3.graphics2.hw.NativeInterface(0, ((aw) this).field_dc);
                    ((aw) this).field_lc = null;
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = decompiledCaughtException;
              var7.printStackTrace();
              ((aw) this).a((byte) -60);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var7_ref;
            stackOut_10_1 = new StringBuilder().append("aw.<init>(");
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(boolean param0, boolean param1) {
        if (!((!((aw) this).field_tb ? 1 : 0) != (param0 ? 1 : 0))) {
            ((aw) this).field_tb = param0 ? true : false;
            ((aw) this).f(!param1 ? true : false);
        }
        if (!param1) {
            ((aw) this).field_kc = -110;
        }
    }

    abstract void A(int param0);

    final hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        pu stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        pu stackOut_0_0 = null;
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
            stackOut_0_0 = new pu((aw) this, param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("aw.TB(");
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
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return (hr) (Object) stackIn_1_0;
    }

    final void a(mi param0, int param1, int param2) {
        if (param2 != 0) {
            return;
        }
        try {
            ((aw) this).a((byte) 72, param1, false, false, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "aw.PB(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    abstract hq a(hu[] param0, byte param1);

    private final void j(int param0) {
        if (param0 != 128) {
            ((aw) this).field_vb = -58;
        }
        ((aw) this).V(26803);
        if (!(((aw) this).field_m == null)) {
            ((aw) this).field_m.a((byte) -92);
        }
    }

    final void DA(int param0, int param1, int param2, int param3) {
        ((aw) this).field_P = param0;
        ((aw) this).field_Hb = param1;
        ((aw) this).field_sc = param2;
        ((aw) this).field_rc = param3;
        this.Q(13);
        this.u(2);
        ((aw) this).d(false);
        this.h((byte) -128);
    }

    private final void n(byte param0) {
        if (((aw) this).field_m != null) {
            ((aw) this).field_m.a(260);
        }
        if (param0 > -25) {
            return;
        }
        ((aw) this).b(true);
    }

    void Y(int param0) {
        ((aw) this).field_Ab = ((aw) this).field_ub;
        if (param0 >= -83) {
            ((aw) this).field_vb = -113;
        }
        ((aw) this).field_ub = 0;
    }

    final jaclib.memory.heap.NativeHeapBuffer a(boolean param0, boolean param1, int param2) {
        if (param0) {
            ((aw) this).field_C = -95;
        }
        return ((aw) this).field_gb.a(param2, param1);
    }

    final ut k(byte param0) {
        if (!(((aw) this).field_R)) {
            ((aw) this).field_vc.a((eu) (Object) ((aw) this).field_Gb, (byte) 77, (eu) (Object) ((aw) this).field_Lb);
            ((aw) this).field_R = true;
        }
        if (param0 < 58) {
            return null;
        }
        return ((aw) this).field_vc;
    }

    abstract void a(int param0, int param1, pv param2);

    final void K(int param0) {
        if (!(4 == ((aw) this).field_ic)) {
            ((aw) this).L(-25);
            ((aw) this).c(false, -32);
            ((aw) this).d(111, false);
            ((aw) this).c(80, false);
            ((aw) this).b(false, 4);
            ((aw) this).a(-2, false, 50, false);
            ((aw) this).e(1, 13);
            ((aw) this).h(96, 0);
            ((aw) this).field_ic = 4;
        }
        if (param0 != 0) {
            ((aw) this).field_Zb = null;
        }
    }

    final int XA() {
        return ((aw) this).field_Yb;
    }

    void f(int param0) {
        if (((aw) this).field_lc != null) {
            ((aw) this).field_lc.a(125);
        }
        ((aw) this).field_kc = 2147483647 & param0;
    }

    final void L(int param0) {
        hv var2 = null;
        if (param0 != -25) {
            za discarded$0 = ((aw) this).c(-125);
        }
        if (!(((aw) this).field_s == vu.field_h)) {
            var2 = ((aw) this).field_s;
            ((aw) this).field_s = vu.field_h;
            if (!(!var2.a(-20011))) {
                this.W(16);
            }
            this.c((byte) -88);
            ((aw) this).field_A = ((aw) this).field_fc;
            this.g(param0 ^ -26);
            ((aw) this).field_ic = ((aw) this).field_ic & -25;
        }
    }

    final ut d(int param0) {
        if (param0 <= 57) {
            return null;
        }
        return ((aw) this).field_Lb;
    }

    final void l(int param0) {
        if (param0 != 0) {
            ((aw) this).a(true, -85);
        }
        if (!(ar.field_L == ((aw) this).field_wb[((aw) this).field_mc])) {
            ((aw) this).field_wb[((aw) this).field_mc] = ar.field_L;
            ((aw) this).field_V[((aw) this).field_mc].a(1);
            this.j(128);
        }
    }

    final ru a(int[] param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        ru stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ru stackOut_2_0 = null;
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
              if (param3 < -88) {
                break L1;
              } else {
                ((aw) this).field_Wb = null;
                break L1;
              }
            }
            stackOut_2_0 = ((aw) this).a(param2, 0, param0, param4, -64, 0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("aw.CE(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
        if (!(param0 == ((aw) this).field_mc)) {
            ((aw) this).field_mc = param0;
            ((aw) this).cb(-31);
        }
    }

    abstract void x(int param0);

    private final void p(int param0) {
        if (param0 != 5) {
            ((aw) this).field_k = -39;
        }
    }

    final int v(int param0) {
        if (param0 != 15) {
            return -11;
        }
        return ((aw) this).field_k;
    }

    abstract void c(int param0, int param1);

    final int S(int param0) {
        int var2 = -108 / ((64 - param0) / 32);
        return ((aw) this).field_Ob;
    }

    private final boolean o(byte param0) {
        return ((aw) this).field_X[3].b((byte) -59);
    }

    abstract void q(int param0);

    abstract void eb(int param0);

    private final void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var8 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 2147483647) {
            break L0;
          } else {
            ((aw) this).field_m = null;
            break L0;
          }
        }
        L1: {
          param3 = param3 & this.o((byte) 24);
          if (param3) {
            break L1;
          } else {
            L2: {
              if (param5 == 4) {
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
              if (param5 == 4) {
                stackOut_9_0 = 1 & param4;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
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
          if (~param5 == ~((aw) this).field_L) {
            if (((aw) this).field_L != 0) {
              L6: {
                ((aw) this).field_X[((aw) this).field_L & 2147483647].a(param1, (byte) -127);
                if (~param4 != ~((aw) this).field_xb) {
                  break L6;
                } else {
                  if (((aw) this).field_ac != param2) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              ((aw) this).field_X[2147483647 & ((aw) this).field_L].a(34023, param2, param4);
              ((aw) this).field_xb = param4;
              ((aw) this).field_ac = param2;
              break L5;
            } else {
              break L5;
            }
          } else {
            L7: {
              if (((aw) this).field_L != 0) {
                ((aw) this).field_X[((aw) this).field_L & 2147483647].c(false);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param5 != 0) {
                ((aw) this).field_m = ((aw) this).field_X[2147483647 & param5];
                ((aw) this).field_m.a(param1, 20186);
                ((aw) this).field_m.a(param1, (byte) -79);
                ((aw) this).field_m.a(param0 ^ 2147449624, param2, param4);
                break L8;
              } else {
                ((aw) this).field_m = null;
                break L8;
              }
            }
            ((aw) this).field_L = param5;
            ((aw) this).field_ac = param2;
            ((aw) this).field_xb = param4;
            break L5;
          }
        }
    }

    abstract void db(int param0);

    final void w(int param0) {
        if (!(2 == ((aw) this).field_ic)) {
            ((aw) this).L(-25);
            ((aw) this).c(false, -32);
            ((aw) this).d(param0 + 109, false);
            ((aw) this).c(83, false);
            ((aw) this).b(false, 4);
            ((aw) this).a(-2, false, param0 + 40, false);
            ((aw) this).field_ic = 2;
        }
        if (param0 != 10) {
            ((aw) this).a(-53, true, 73, false);
        }
    }

    final int e(byte param0) {
        if (param0 < 5) {
            Object var3 = null;
            ru discarded$0 = ((aw) this).a((io) null, (iw) null, -127, 20, (byte) -94);
        }
        return ((aw) this).field_mb;
    }

    final void h(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 > 28) {
            break L0;
          } else {
            ((aw) this).field_R = true;
            break L0;
          }
        }
        L1: {
          if (param1 == 1) {
            ((aw) this).a((byte) -83, lf.field_e, lf.field_e);
            break L1;
          } else {
            if (0 == param1) {
              ((aw) this).a((byte) -83, vi.field_v, vi.field_v);
              break L1;
            } else {
              if (param1 == 2) {
                ((aw) this).a((byte) -83, lf.field_e, ua.field_n);
                break L1;
              } else {
                if (param1 == 3) {
                  ((aw) this).a((byte) -83, vi.field_v, cv.field_F);
                  break L1;
                } else {
                  if (param1 == 4) {
                    ((aw) this).a((byte) -83, bj.field_c, bj.field_c);
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
        return ((aw) this).field_Cb + (((aw) this).field_o + ((aw) this).field_pc);
    }

    final void a(int param0, boolean param1, int param2, boolean param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wm var10 = null;
        int var11 = 0;
        int var12 = 0;
        ut var13 = null;
        int var14 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var14 = Sumoblitz.field_L ? 1 : 0;
          if (param2 == 50) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((aw) this).field_Vb != param0) {
              break L2;
            } else {
              L3: {
                if (((aw) this).field_fb) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L3;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L3;
                }
              }
              L4: {
                stackOut_6_0 = stackIn_6_0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (((aw) this).field_bb) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L4;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L4;
                }
              }
              if (stackIn_9_0 != stackIn_9_1) {
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
            if (!((aw) this).field_fb) {
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L5;
            } else {
              stackOut_12_0 = 3;
              stackIn_14_0 = stackOut_12_0;
              break L5;
            }
          }
          L6: {
            var9 = stackIn_14_0;
            if (0 > param0) {
              ((aw) this).l(0);
              break L6;
            } else {
              L7: {
                L8: {
                  var5 = (Object) (Object) ((aw) this).field_lc.a(param2 + 37, param0);
                  var10 = ((aw) this).field_h.a(-29193, param0);
                  if (var10.field_c != 0) {
                    break L8;
                  } else {
                    if (var10.field_u != 0) {
                      break L8;
                    } else {
                      ((aw) this).l(0);
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var10.field_n) {
                    stackOut_20_0 = 64;
                    stackIn_21_0 = stackOut_20_0;
                    break L9;
                  } else {
                    stackOut_19_0 = 128;
                    stackIn_21_0 = stackOut_19_0;
                    break L9;
                  }
                }
                var11 = stackIn_21_0;
                var12 = var11 * 50;
                var13 = ((aw) this).B(0);
                var13.a((float)(((aw) this).field_kc % var12 * var10.field_u) / (float)var12, 0.0f, (float)(var10.field_c * (((aw) this).field_kc % var12)) / (float)var12, param2 + -50);
                ((aw) this).a(rs.field_c, param2 + 28830);
                break L7;
              }
              var6 = var10.field_q;
              if (!((aw) this).field_fb) {
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
            if (null == ((aw) this).field_m) {
              ((aw) this).a((ed) var5, 117);
              ((aw) this).h(45, var6);
              break L10;
            } else {
              ((aw) this).field_m.a(var6, 18834, (ed) var5);
              break L10;
            }
          }
          ((aw) this).field_bb = ((aw) this).field_fb;
          ((aw) this).field_Vb = param0;
          break L1;
        }
        ((aw) this).field_ic = ((aw) this).field_ic & -8;
    }

    abstract void b(boolean param0);

    final ut g(byte param0) {
        if (param0 != -28) {
            return null;
        }
        return ((aw) this).field_Gb;
    }

    abstract void a(int param0, boolean param1);

    final void s(byte param0) {
        java.awt.Canvas var3_ref_java_awt_Canvas = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        Enumeration var2 = ((aw) this).field_Q.keys();
        while (var2.hasMoreElements()) {
            var3_ref_java_awt_Canvas = (java.awt.Canvas) var2.nextElement();
            ((aw) this).a(var3_ref_java_awt_Canvas, ((aw) this).field_Q.get((Object) (Object) var3_ref_java_awt_Canvas), 0);
        }
        int var3 = 82 % ((11 - param0) / 51);
        ((aw) this).field_x.b(12001);
        ((aw) this).field_Wb.b(12001);
        ((aw) this).field_Qb.b(12001);
        ((aw) this).field_gc.b((byte) 100);
        ((aw) this).field_qc.b((byte) 20);
        ((aw) this).field_hc.b((byte) -128);
        ((aw) this).field_Fb.b((byte) 7);
        ((aw) this).field_ib.b((byte) -123);
        ((aw) this).field_yb.b(-19073);
        ((aw) this).field_M.b(12001);
    }

    final void c(boolean param0, int param1) {
        if (param1 != -32) {
            ut discarded$0 = ((aw) this).g((byte) -79);
        }
        if (param0 != ((aw) this).field_Bb) {
            ((aw) this).field_Bb = param0 ? true : false;
            ((aw) this).i((byte) -119);
            ((aw) this).field_ic = ((aw) this).field_ic & -32;
        }
    }

    abstract void V(int param0);

    private final void m(byte param0) {
        ((aw) this).field_ec[10] = ((aw) this).field_q;
        ((aw) this).field_ec[14] = ((aw) this).field_kb;
    }

    final void P(int param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        Hashtable var2 = new Hashtable();
        if (param0 >= -26) {
            return;
        }
        if (null != ((aw) this).field_Q) {
            if (!((aw) this).field_Q.isEmpty()) {
                var3 = ((aw) this).field_Q.keys();
                while (var3.hasMoreElements()) {
                    var4 = (java.awt.Canvas) var3.nextElement();
                    Object discarded$0 = var2.put((Object) (Object) var4, ((aw) this).a(var4, 3));
                }
            }
        }
        ((aw) this).field_Q = var2;
        this.O(5);
        this.r((byte) 121);
        this.y(-101);
        ((aw) this).field_yb.a(117, (aw) this);
    }

    private final void Z(int param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float[] var9 = null;
        L0: {
          if (!((aw) this).field_O) {
            L1: {
              var9 = ((aw) this).field_eb;
              var2 = var9;
              var3 = (float)((aw) this).field_oc;
              var4 = (float)((aw) this).field_Yb;
              var5 = (float)(-((aw) this).field_Hb) * ((aw) this).field_qb / (float)((aw) this).field_rc;
              var6 = (float)(-((aw) this).field_P) * ((aw) this).field_qb / (float)((aw) this).field_sc;
              var7 = (float)(-((aw) this).field_P + ((aw) this).field_rb) * ((aw) this).field_qb / (float)((aw) this).field_sc;
              var8 = (float)(((aw) this).field_Sb - ((aw) this).field_Hb) * ((aw) this).field_qb / (float)((aw) this).field_rc;
              if (var6 == var7) {
                break L1;
              } else {
                if (var5 == var8) {
                  break L1;
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
                  this.p(5);
                  ((aw) this).field_O = true;
                  break L0;
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
            this.p(5);
            ((aw) this).field_O = true;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final ef d(byte param0) {
        if (param0 != 122) {
            aw.j((byte) 73);
        }
        if (((aw) this).field_uc == null) {
            return null;
        }
        return ((aw) this).field_uc.b(param0 ^ 37);
    }

    abstract ru a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, iw param7);

    abstract void a(int param0, boolean param1, byte param2, mi param3);

    rq d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            var5 = null;
            hq discarded$2 = ((aw) this).a((hu[]) null, (byte) -48);
            break L0;
          }
        }
        var3 = param1;
        if (var3 != 6) {
          if (var3 == 1) {
            return (rq) (Object) new ng((aw) this);
          } else {
            if (2 == var3) {
              return (rq) (Object) new ib((aw) this, ((aw) this).field_Mb);
            } else {
              if (7 != var3) {
                return (rq) (Object) new ni((aw) this);
              } else {
                return (rq) (Object) new uo((aw) this);
              }
            }
          }
        } else {
          return (rq) (Object) new oc((aw) this);
        }
    }

    abstract void cb(int param0);

    abstract ru a(boolean param0, int param1, int[] param2, int param3, int param4, int param5, int param6);

    private final void R(int param0) {
        int var2 = 0;
        float[] var3 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float[] var9 = null;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        L0: {
          var2 = 115 / ((39 - param0) / 47);
          if (((aw) this).field_Jb) {
            break L0;
          } else {
            L1: {
              L2: {
                var12 = ((aw) this).field_ec;
                var11 = var12;
                var10 = var11;
                var9 = var10;
                var3 = var9;
                var4 = (float)(((aw) this).field_oc * -((aw) this).field_P) / (float)((aw) this).field_sc;
                var5 = (float)(((aw) this).field_oc * (-((aw) this).field_P + ((aw) this).field_rb)) / (float)((aw) this).field_sc;
                var6 = (float)(((aw) this).field_Hb * ((aw) this).field_oc) / (float)((aw) this).field_rc;
                var7 = (float)(((aw) this).field_oc * (((aw) this).field_Hb + -((aw) this).field_Sb)) / (float)((aw) this).field_rc;
                if (var5 == var4) {
                  break L2;
                } else {
                  if (var7 != var6) {
                    var8 = (float)((aw) this).field_oc * 2.0f;
                    var3[0] = var8 / (-var4 + var5);
                    var3[1] = 0.0f;
                    var3[4] = 0.0f;
                    var3[9] = (var6 + var7) / (var6 - var7);
                    var3[15] = 0.0f;
                    var3[5] = var8 / (-var7 + var6);
                    var3[8] = (var5 + var4) / (-var4 + var5);
                    ((aw) this).field_kb = (float)(((aw) this).field_Yb * ((aw) this).field_oc) / (float)(-((aw) this).field_Yb + ((aw) this).field_oc);
                    var3[14] = (float)(((aw) this).field_Yb * ((aw) this).field_oc) / (float)(-((aw) this).field_Yb + ((aw) this).field_oc);
                    var3[6] = 0.0f;
                    var3[2] = 0.0f;
                    var12[11] = -1.0f;
                    var3[12] = 0.0f;
                    var3[7] = 0.0f;
                    var3[13] = 0.0f;
                    var3[3] = 0.0f;
                    ((aw) this).field_q = (float)((aw) this).field_Yb / (float)(((aw) this).field_oc - ((aw) this).field_Yb);
                    var3[10] = (float)((aw) this).field_Yb / (float)(((aw) this).field_oc - ((aw) this).field_Yb);
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
            ((aw) this).field_Jb = true;
            break L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new tf();
    }
}
