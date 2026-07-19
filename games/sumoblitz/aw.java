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
        float[] var2 = null;
        float[] var3 = null;
        float[] var4 = null;
        float[] var5 = null;
        if (param0 == -88) {
          if (!this.field_zb) {
            var5 = this.field_fc;
            var4 = var5;
            var3 = var4;
            var2 = var3;
            if (0 == this.field_rb) {
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
              if (Sumoblitz.field_L) {
                var5[12] = -1.0f;
                var5[10] = 0.5f;
                var3[5] = -2.0f / (float)this.field_Sb;
                var3[2] = 0.0f;
                var3[4] = 0.0f;
                var3[7] = 0.0f;
                var3[11] = 0.0f;
                var3[15] = 1.0f;
                var3[6] = 0.0f;
                var3[8] = 0.0f;
                var5[14] = 0.5f;
                var3[13] = 1.0f;
                var3[0] = 2.0f / (float)this.field_rb;
                var3[9] = 0.0f;
                var3[3] = 0.0f;
                var3[1] = 0.0f;
                this.field_zb = true;
                return;
              } else {
                this.field_zb = true;
                return;
              }
            } else {
              if (this.field_Sb != 0) {
                var5[12] = -1.0f;
                var5[10] = 0.5f;
                var3[5] = -2.0f / (float)this.field_Sb;
                var3[2] = 0.0f;
                var3[4] = 0.0f;
                var3[7] = 0.0f;
                var3[11] = 0.0f;
                var3[15] = 1.0f;
                var3[6] = 0.0f;
                var3[8] = 0.0f;
                var5[14] = 0.5f;
                var3[13] = 1.0f;
                var3[0] = 2.0f / (float)this.field_rb;
                var3[9] = 0.0f;
                var3[3] = 0.0f;
                var3[1] = 0.0f;
                this.field_zb = true;
                return;
              } else {
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
                if (!Sumoblitz.field_L) {
                  this.field_zb = true;
                  return;
                } else {
                  var5[12] = -1.0f;
                  var5[10] = 0.5f;
                  var3[5] = -2.0f / (float)this.field_Sb;
                  var3[2] = 0.0f;
                  var3[4] = 0.0f;
                  var3[7] = 0.0f;
                  var3[11] = 0.0f;
                  var3[15] = 1.0f;
                  var3[6] = 0.0f;
                  var3[8] = 0.0f;
                  var5[14] = 0.5f;
                  var3[13] = 1.0f;
                  var3[0] = 2.0f / (float)this.field_rb;
                  var3[9] = 0.0f;
                  var3[3] = 0.0f;
                  var3[1] = 0.0f;
                  this.field_zb = true;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          aw.j((byte) -98);
          if (!this.field_zb) {
            L0: {
              var5 = this.field_fc;
              var4 = var5;
              var3 = var4;
              var2 = var3;
              if (0 == this.field_rb) {
                break L0;
              } else {
                if (this.field_Sb == 0) {
                  break L0;
                } else {
                  var5[12] = -1.0f;
                  var5[10] = 0.5f;
                  var3[5] = -2.0f / (float)this.field_Sb;
                  var3[2] = 0.0f;
                  var3[4] = 0.0f;
                  var3[7] = 0.0f;
                  var3[11] = 0.0f;
                  var3[15] = 1.0f;
                  var3[6] = 0.0f;
                  var3[8] = 0.0f;
                  var5[14] = 0.5f;
                  var3[13] = 1.0f;
                  var3[0] = 2.0f / (float)this.field_rb;
                  var3[9] = 0.0f;
                  var3[3] = 0.0f;
                  var3[1] = 0.0f;
                  this.field_zb = true;
                  return;
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
            if (!Sumoblitz.field_L) {
              this.field_zb = true;
              return;
            } else {
              var5[12] = -1.0f;
              var5[10] = 0.5f;
              var3[5] = -2.0f / (float)this.field_Sb;
              var3[2] = 0.0f;
              var3[4] = 0.0f;
              var3[7] = 0.0f;
              var3[11] = 0.0f;
              var3[15] = 1.0f;
              var3[6] = 0.0f;
              var3[8] = 0.0f;
              var5[14] = 0.5f;
              var3[13] = 1.0f;
              var3[0] = 2.0f / (float)this.field_rb;
              var3[9] = 0.0f;
              var3[3] = 0.0f;
              var3[1] = 0.0f;
              this.field_zb = true;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void c(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          if (this.field_p) {
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
          if (param1) {
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
          if (stackIn_6_0 != stackIn_6_1) {
            L3: {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (!param1) {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L3;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L3;
              }
            }
            ((aw) (this)).field_p = stackIn_11_1 != 0;
            this.q(79);
            this.field_ic = this.field_ic & -32;
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 <= 32) {
          this.field_K = (tg[]) null;
          return;
        } else {
          return;
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
                this.field_mc = 3;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param3, param1, param2, 0, param0, (byte) 97, 0, param5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("aw.TD(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ')');
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
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        String stackOut_12_0 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param3) {
          var4 = param1.indexOf(param0);
          L0: while (true) {
            L1: {
              L2: {
                if (-1 == var4) {
                  break L2;
                } else {
                  param1 = param1.substring(0, var4) + param2 + param1.substring(param0.length() + var4);
                  stackOut_4_0 = (String) (param1);
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    var4 = ((String) (Object) stackIn_5_0).indexOf(param0, param2.length() + var4);
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_6_0 = (String) (param1);
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            return stackIn_7_0;
          }
        } else {
          field_t = (tf) null;
          var4 = param1.indexOf(param0);
          L3: while (true) {
            L4: {
              L5: {
                if (-1 == var4) {
                  break L5;
                } else {
                  param1 = param1.substring(0, var4) + param2 + param1.substring(param0.length() + var4);
                  stackOut_10_0 = (String) (param1);
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var5 != 0) {
                    break L4;
                  } else {
                    var4 = ((String) (Object) stackIn_11_0).indexOf(param0, param2.length() + var4);
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              stackOut_12_0 = (String) (param1);
              stackIn_13_0 = stackOut_12_0;
              break L4;
            }
            return stackIn_13_0;
          }
        }
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
          L0: {
            this.n((byte) 96);
            if (mb.field_k == this.field_s) {
              break L0;
            } else {
              L1: {
                var2 = this.field_s;
                this.field_s = mb.field_k;
                if (var2.a(-20011)) {
                  this.W(16);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_ic = this.field_ic & -32;
              this.field_A = this.field_w;
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (mb.field_k == this.field_s) {
              break L2;
            } else {
              L3: {
                var2 = this.field_s;
                this.field_s = mb.field_k;
                if (var2.a(-20011)) {
                  this.W(16);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_ic = this.field_ic & -32;
              this.field_A = this.field_w;
              break L2;
            }
          }
          return;
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
        if (param0 == -16088) {
          this.field_F = this.field_rb;
          this.field_yc = this.field_Sb;
          if (this.field_wc) {
            this.field_wc = false;
            this.A(-121);
            this.h((byte) -128);
            return;
          } else {
            this.h((byte) -128);
            return;
          }
        } else {
          this.field_Ob = -12;
          this.field_F = this.field_rb;
          this.field_yc = this.field_Sb;
          if (!this.field_wc) {
            this.h((byte) -128);
            return;
          } else {
            this.field_wc = false;
            this.A(-121);
            this.h((byte) -128);
            return;
          }
        }
    }

    abstract ef a(int param0, byte param1, int[][] param2, boolean param3);

    abstract float b(byte param0);

    private final void z(int param0) {
        float var2 = 0.0f;
        L0: {
          if (vu.field_h != this.field_s) {
            break L0;
          } else {
            var2 = this.b((byte) 127);
            this.field_Lb.a((byte) 96, 0.0f, var2, var2);
            break L0;
          }
        }
        if (param0 != -29654) {
          L1: {
            this.field_Y = -4;
            this.field_R = false;
            this.x(0);
            if (null != this.field_m) {
              this.field_m.c((byte) 37);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            this.field_R = false;
            this.x(0);
            if (null != this.field_m) {
              this.field_m.c((byte) 37);
              break L2;
            } else {
              break L2;
            }
          }
          return;
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
            field_j = null;
            return;
        }
        field_j = null;
    }

    abstract void a(byte param0, int param1, boolean param2, boolean param3, mi param4);

    abstract void E(int param0);

    abstract void ab(int param0);

    final hr a(ri param0, boolean param1) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
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
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        hr stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        hr stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (0 == param0.field_h) {
                    break L3;
                  } else {
                    if (0 != param0.field_i) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var3_ref = this.a(0, -2, 1, 1, 1, new int[]{0});
                if (var10 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              L4: {
                L5: {
                  var12 = new int[param0.field_h * param0.field_i];
                  var11 = var12;
                  var4 = var11;
                  var5 = 0;
                  var6 = 0;
                  if (null == param0.field_a) {
                    break L5;
                  } else {
                    var7 = 0;
                    L6: while (true) {
                      L7: {
                        if (var7 >= param0.field_i) {
                          break L7;
                        } else {
                          if (var10 != 0) {
                            break L4;
                          } else {
                            var8 = 0;
                            L8: while (true) {
                              L9: {
                                L10: {
                                  if (var8 >= param0.field_h) {
                                    break L10;
                                  } else {
                                    incrementValue$3 = var6;
                                    var6++;
                                    var4[incrementValue$3] = ic.a(param0.field_a[var5] << 1453984952, param0.field_g[eb.a(255, (int) param0.field_e[var5])]);
                                    var5++;
                                    var8++;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (var10 == 0) {
                                        continue L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                var7++;
                                break L9;
                              }
                              if (var10 == 0) {
                                continue L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      if (var10 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var7 = 0;
                L11: while (true) {
                  if (var7 >= param0.field_i) {
                    break L4;
                  } else {
                    var8 = 0;
                    L12: while (true) {
                      L13: {
                        L14: {
                          if (param0.field_h <= var8) {
                            break L14;
                          } else {
                            incrementValue$4 = var5;
                            var5++;
                            var9 = param0.field_g[param0.field_e[incrementValue$4] & 255];
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L15: {
                                incrementValue$5 = var6;
                                var6++;
                                stackOut_22_0 = (int[]) (var4);
                                stackOut_22_1 = incrementValue$5;
                                stackIn_24_0 = stackOut_22_0;
                                stackIn_24_1 = stackOut_22_1;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                if (var9 == 0) {
                                  stackOut_24_0 = (int[]) ((Object) stackIn_24_0);
                                  stackOut_24_1 = stackIn_24_1;
                                  stackOut_24_2 = 0;
                                  stackIn_25_0 = stackOut_24_0;
                                  stackIn_25_1 = stackOut_24_1;
                                  stackIn_25_2 = stackOut_24_2;
                                  break L15;
                                } else {
                                  stackOut_23_0 = (int[]) ((Object) stackIn_23_0);
                                  stackOut_23_1 = stackIn_23_1;
                                  stackOut_23_2 = ic.a(var9, -16777216);
                                  stackIn_25_0 = stackOut_23_0;
                                  stackIn_25_1 = stackOut_23_1;
                                  stackIn_25_2 = stackOut_23_2;
                                  break L15;
                                }
                              }
                              stackIn_25_0[stackIn_25_1] = stackIn_25_2;
                              var8++;
                              if (var10 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        var7++;
                        break L13;
                      }
                      if (var10 == 0) {
                        continue L11;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              var3_ref = this.a(0, -2, param0.field_i, param0.field_h, param0.field_h, var12);
              break L1;
            }
            var3_ref.a(param0.field_c, param0.field_d, param0.field_b, param0.field_f);
            stackOut_29_0 = (hr) (var3_ref);
            stackIn_30_0 = stackOut_29_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("aw.RA(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L16;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L16;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        return stackIn_30_0;
    }

    private final void g(boolean param0) {
        if (param0) {
          this.field_Hb = -20;
          this.a(0, 119, this.field_Wb);
          this.a(-77, this.field_xc);
          this.a(0, 0, 1, tc.field_g);
          return;
        } else {
          this.a(0, 119, this.field_Wb);
          this.a(-77, this.field_xc);
          this.a(0, 0, 1, tc.field_g);
          return;
        }
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
                this.field_kc = 90;
                break L1;
              }
            }
            stackOut_2_0 = this.a(0, param4, param3, 0, param5, param0, (byte) -125, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("aw.IC(").append(param0).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final jaclib.memory.Stream a(boolean param0, jaclib.memory.Buffer param1) {
        RuntimeException var3 = null;
        jaclib.memory.Stream stackIn_2_0 = null;
        jaclib.memory.Stream stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jaclib.memory.Stream stackOut_3_0 = null;
        jaclib.memory.Stream stackOut_1_0 = null;
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
              this.field_cb.a(param1);
              stackOut_3_0 = this.field_cb;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (jaclib.memory.Stream) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("aw.NE(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
        hq discarded$16 = null;
        hq discarded$17 = null;
        hq discarded$18 = null;
        gu discarded$19 = null;
        gu discarded$20 = null;
        gu discarded$21 = null;
        gu discarded$22 = null;
        gu discarded$23 = null;
        hq discarded$24 = null;
        hq discarded$25 = null;
        hq discarded$26 = null;
        gu discarded$27 = null;
        gu discarded$28 = null;
        gu discarded$29 = null;
        gu discarded$30 = null;
        gu discarded$31 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        this.field_V = new ut[this.field_cc];
        this.field_Zb = new ed[this.field_cc];
        this.field_wb = new tf[this.field_cc];
        this.field_K = new tg[this.field_cc];
        this.field_B = new tg[this.field_cc];
        var2 = 0;
        L0: while (true) {
          L1: {
            if (this.field_cc <= var2) {
              this.field_pb = new ko[-2 + this.field_bc];
              this.field_D = (ed) ((Object) this.a(io.field_g, nl.field_p, 1, 1, (byte) -110));
              this.a(new he(262144));
              this.field_jc = this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_e})}, (byte) 78);
              discarded$16 = this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_g})}, (byte) 70);
              discarded$17 = this.a(new hu[]{new hu(ls.field_b), new hu(ls.field_g), new hu(ls.field_e), new hu(ls.field_c)}, (byte) 14);
              discarded$18 = this.a(new hu[]{new hu(ls.field_b), new hu(ls.field_g), new hu(ls.field_e)}, (byte) 100);
              discarded$19 = new gu((aw) (this), 0, 0, false, false);
              this.field_gc = new gu((aw) (this), 0, 0, true, true);
              discarded$20 = new gu((aw) (this), 0, 0, false, false);
              this.field_qc = new gu((aw) (this), 0, 0, true, true);
              discarded$21 = new gu((aw) (this), 0, 0, false, false);
              this.field_hc = new gu((aw) (this), 0, 0, true, true);
              discarded$22 = new gu((aw) (this), 0, 0, false, false);
              this.field_Fb = new gu((aw) (this), 0, 0, true, true);
              discarded$23 = new gu((aw) (this), 0, 0, false, param0);
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
              break L1;
            } else {
              this.field_B[var2] = vi.field_v;
              this.field_K[var2] = vi.field_v;
              this.field_wb[var2] = ar.field_L;
              this.field_V[var2] = new ut();
              var2++;
              if (var3 != 0) {
                break L1;
              } else {
                if (var3 == 0) {
                  continue L0;
                } else {
                  L2: {
                    this.field_pb = new ko[-2 + this.field_bc];
                    this.field_D = (ed) ((Object) this.a(io.field_g, nl.field_p, 1, 1, (byte) -110));
                    this.a(new he(262144));
                    this.field_jc = this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_e})}, (byte) 78);
                    discarded$24 = this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_g})}, (byte) 70);
                    discarded$25 = this.a(new hu[]{new hu(ls.field_b), new hu(ls.field_g), new hu(ls.field_e), new hu(ls.field_c)}, (byte) 14);
                    discarded$26 = this.a(new hu[]{new hu(ls.field_b), new hu(ls.field_g), new hu(ls.field_e)}, (byte) 100);
                    discarded$27 = new gu((aw) (this), 0, 0, false, false);
                    this.field_gc = new gu((aw) (this), 0, 0, true, true);
                    discarded$28 = new gu((aw) (this), 0, 0, false, false);
                    this.field_qc = new gu((aw) (this), 0, 0, true, true);
                    discarded$29 = new gu((aw) (this), 0, 0, false, false);
                    this.field_hc = new gu((aw) (this), 0, 0, true, true);
                    discarded$30 = new gu((aw) (this), 0, 0, false, false);
                    this.field_Fb = new gu((aw) (this), 0, 0, true, true);
                    discarded$31 = new gu((aw) (this), 0, 0, false, param0);
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
                    if (!this.field_X[2].b((byte) -82)) {
                      this.field_X[2] = this.d(0, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (!this.field_X[4].b((byte) -67)) {
                    L3: {
                      this.field_X[4] = this.field_X[2];
                      if (!this.field_X[8].b((byte) -42)) {
                        this.field_X[8] = this.field_X[4];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (this.field_X[9].b((byte) -43)) {
                      this.D(1);
                      this.m(-16088);
                      this.e();
                      return;
                    } else {
                      this.field_X[9] = this.field_X[8];
                      this.D(1);
                      this.m(-16088);
                      this.e();
                      return;
                    }
                  } else {
                    L4: {
                      if (!this.field_X[8].b((byte) -42)) {
                        this.field_X[8] = this.field_X[4];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (this.field_X[9].b((byte) -43)) {
                      this.D(1);
                      this.m(-16088);
                      this.e();
                      return;
                    } else {
                      this.field_X[9] = this.field_X[8];
                      this.D(1);
                      this.m(-16088);
                      this.e();
                      return;
                    }
                  }
                }
              }
            }
          }
          L5: {
            if (!this.field_X[2].b((byte) -82)) {
              this.field_X[2] = this.d(0, 0);
              break L5;
            } else {
              break L5;
            }
          }
          if (this.field_X[4].b((byte) -67)) {
            L6: {
              if (!this.field_X[8].b((byte) -42)) {
                this.field_X[8] = this.field_X[4];
                break L6;
              } else {
                break L6;
              }
            }
            if (this.field_X[9].b((byte) -43)) {
              this.D(1);
              this.m(-16088);
              this.e();
              return;
            } else {
              this.field_X[9] = this.field_X[8];
              this.D(1);
              this.m(-16088);
              this.e();
              return;
            }
          } else {
            L7: {
              this.field_X[4] = this.field_X[2];
              if (!this.field_X[8].b((byte) -42)) {
                this.field_X[8] = this.field_X[4];
                break L7;
              } else {
                break L7;
              }
            }
            if (this.field_X[9].b((byte) -43)) {
              this.D(1);
              this.m(-16088);
              this.e();
              return;
            } else {
              this.field_X[9] = this.field_X[8];
              this.D(1);
              this.m(-16088);
              this.e();
              return;
            }
          }
        }
    }

    abstract void a(java.awt.Canvas param0, Object param1, int param2);

    private final void u(int param0) {
        this.field_Jb = false;
        if (param0 != 2) {
          return;
        } else {
          L0: {
            this.R(param0 ^ -63);
            if (pd.field_m == this.field_s) {
              this.g(param0 ^ 3);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void a(boolean param0, int param1) {
        if (param0) {
          return;
        } else {
          L0: {
            if (param1 != this.field_Ub) {
              this.field_Ub = param1;
              this.r(1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final ut B(int param0) {
        if (param0 != 0) {
            return (ut) null;
        }
        return this.field_V[this.field_mc];
    }

    final static void C(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
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
            var3 = -20 / ((-66 - param0) / 42);
            var2 = 0;
            var4 = var6.length;
            L1: while (true) {
              if (var4 <= var2) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var6[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var6[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var6[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var6[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var6[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var6[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var6[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var6[incrementValue$47] = 0;
                if (var5 == 0) {
                  continue L1;
                } else {
                  return;
                }
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
          L0: {
            this.field_Kb = 40;
            if (this.field_m != null) {
              this.field_m.b(param0 ^ -90);
              break L0;
            } else {
              break L0;
            }
          }
          this.N(-26911);
          return;
        } else {
          L1: {
            if (this.field_m != null) {
              this.field_m.b(param0 ^ -90);
              break L1;
            } else {
              break L1;
            }
          }
          this.N(-26911);
          return;
        }
    }

    abstract void a(int param0, hq param1);

    abstract boolean a(byte param0, io param1, iw param2);

    void D(int param0) {
        nh discarded$0 = null;
        this.T(-1);
        if (param0 != 1) {
            byte[] var3 = (byte[]) null;
            discarded$0 = this.a(true, (iw) null, -62, 114, (byte[]) null, 71);
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
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (!this.field_H) {
          var1 = this.field_lb.b(-66);
          L0: while (true) {
            if (var1 == null) {
              var1_ref = this.field_Q.keys();
              L1: while (true) {
                if (var1_ref.hasMoreElements()) {
                  var2 = (java.awt.Canvas) (var1_ref.nextElement());
                  this.a(var2, this.field_Q.get(var2), 0);
                  if (var3 != 0) {
                    this.field_H = true;
                    return;
                  } else {
                    continue L1;
                  }
                } else {
                  pt.a(false, true, -1);
                  this.field_nc.release();
                  this.field_H = true;
                  return;
                }
              }
            } else {
              ((he) ((Object) var1)).c(-14365);
              var1 = this.field_lb.d((byte) 18);
              if (var3 == 0) {
                continue L0;
              } else {
                return;
              }
            }
          }
        } else {
          return;
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
            stackOut_2_0 = (float[]) (param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("aw.TC(").append(param0).append(',');
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
        boolean discarded$9 = this.field_Wb.a(12, (byte) -35, 24);
        if (param0 < 102) {
          this.field_db = false;
          this.field_xc = this.a(new hu[]{new hu(ls.field_b)}, (byte) 118);
          return;
        } else {
          this.field_xc = this.a(new hu[]{new hu(ls.field_b)}, (byte) 118);
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        var2 = 90 / ((param0 - 40) / 56);
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
          return;
        } else {
          return;
        }
    }

    abstract void I(int param0);

    final void f(int param0, int param1) {
        if (param0 == this.field_oc) {
          if (param1 == this.field_Yb) {
            return;
          } else {
            this.field_Yb = param1;
            this.field_oc = param0;
            this.u(2);
            this.Q(13);
            this.n((byte) -78);
            return;
          }
        } else {
          this.field_Yb = param1;
          this.field_oc = param0;
          this.u(2);
          this.Q(13);
          this.n((byte) -78);
          return;
        }
    }

    abstract ru a(io param0, iw param1, int param2, int param3, byte param4);

    final void b(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
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
          if (this.field_Rb) {
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
          if (stackIn_6_0 != stackIn_6_1) {
            L3: {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (!param1) {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L3;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L3;
              }
            }
            ((aw) (this)).field_Rb = stackIn_11_1 != 0;
            this.i((byte) -119);
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 != 0) {
          this.field_oc = -100;
          return;
        } else {
          return;
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
              var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
              var7 = var7 * var9;
              var8 = var8 * var9;
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            } else {
              if (var8 == 0.0f) {
                break L1;
              } else {
                L2: {
                  var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
                  var7 = var7 * var9;
                  var8 = var8 * var9;
                  if (!Sumoblitz.field_L) {
                    break L2;
                  } else {
                    var7 = 1.0f;
                    break L2;
                  }
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
            }
          }
          var7 = 1.0f;
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
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        this.field_x = this.a((byte) 51, false);
        boolean discarded$1 = this.field_x.a(28, (byte) -35, 140);
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            this.field_nb = this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_e, ls.field_e})}, (byte) 99);
            if (param0 == 5) {
              return;
            } else {
              this.j(-25);
              return;
            }
          } else {
            var3 = this.field_x.a(7454, true);
            if (var5 != 0) {
              if (param0 != 5) {
                this.j(-25);
                return;
              } else {
                return;
              }
            } else {
              L1: {
                L2: {
                  if (var3 != null) {
                    break L2;
                  } else {
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    var4 = this.a(true, var3);
                    if (jaclib.memory.Stream.b()) {
                      break L4;
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
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
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
                  break L3;
                }
                var4.a();
                if (this.field_x.a(22957)) {
                  this.field_nb = this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_e, ls.field_e})}, (byte) 99);
                  if (param0 == 5) {
                    return;
                  } else {
                    this.j(-25);
                    return;
                  }
                } else {
                  break L1;
                }
              }
              var2++;
              if (var5 == 0) {
                continue L0;
              } else {
                this.field_nb = this.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_e, ls.field_e})}, (byte) 99);
                if (param0 != 5) {
                  this.j(-25);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(ed param0, int param1) {
        boolean discarded$3 = false;
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
              if (param1 > 89) {
                break L1;
              } else {
                discarded$3 = this.a(-0.810268759727478f, 2.1692757606506348f, false, -2.797441005706787f, 1.3712314367294312f, 0.6615611910820007f, 0.5074755549430847f);
                break L1;
              }
            }
            L2: {
              if (this.field_Zb[this.field_mc] != param0) {
                L3: {
                  L4: {
                    this.field_Zb[this.field_mc] = param0;
                    if (param0 != null) {
                      break L4;
                    } else {
                      this.l((byte) 9);
                      if (!Sumoblitz.field_L) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param0.a(8905);
                  break L3;
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
          L5: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("aw.BA(");
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
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
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
        boolean stackIn_12_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackOut_18_0 = false;
        boolean stackOut_11_0 = false;
        var10 = Sumoblitz.field_L ? 1 : 0;
        this.field_Qb = this.a((byte) 51, false);
        boolean discarded$1 = this.field_Qb.a(12, (byte) -35, 3096);
        var2 = 0;
        L0: while (true) {
          if (4 > var2) {
            var3 = this.field_Qb.a(7454, true);
            if (var10 == 0) {
              L1: {
                if (var3 == null) {
                  break L1;
                } else {
                  var4 = this.a(true, var3);
                  var4.a(0.0f);
                  var4.a(0.0f);
                  var4.a(0.0f);
                  var5 = 0;
                  L2: while (true) {
                    L3: {
                      if (-257 > (var5 ^ -1)) {
                        var4.a();
                        stackOut_18_0 = this.field_Qb.a(22957);
                        stackIn_19_0 = stackOut_18_0;
                        break L3;
                      } else {
                        var6 = (double)(var5 * 2) * 3.141592653589793 / 256.0;
                        var8 = (float)Math.cos(var6);
                        var9 = (float)Math.sin(var6);
                        stackOut_11_0 = jaclib.memory.Stream.b();
                        stackIn_19_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var10 != 0) {
                          break L3;
                        } else {
                          L4: {
                            if (stackIn_12_0) {
                              var4.a(var9);
                              var4.a(var8);
                              var4.a(0.0f);
                              break L4;
                            } else {
                              var4.b(var9);
                              var4.b(var8);
                              var4.b(0.0f);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                var4.a(var9);
                                var4.a(var8);
                                var4.a(0.0f);
                                break L4;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    }
                    if (!stackIn_19_0) {
                      break L1;
                    } else {
                      if (var10 != 0) {
                        break L1;
                      } else {
                        if (param0 >= -97) {
                          return;
                        } else {
                          this.field_n = this.a(new hu[]{new hu(ls.field_b)}, (byte) 50);
                          return;
                        }
                      }
                    }
                  }
                }
              }
              var2++;
              if (var10 == 0) {
                continue L0;
              } else {
                if (param0 >= -97) {
                  return;
                } else {
                  this.field_n = this.a(new hu[]{new hu(ls.field_b)}, (byte) 50);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            if (param0 >= -97) {
              return;
            } else {
              this.field_n = this.a(new hu[]{new hu(ls.field_b)}, (byte) 50);
              return;
            }
          }
        }
    }

    final static ha a(d param0, java.awt.Canvas param1, int param2, int param3) {
        String discarded$2 = null;
        RuntimeException var4 = null;
        String var5 = null;
        fr stackIn_3_0 = null;
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
        fr stackOut_2_0 = null;
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
              if (param3 == 27541) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = aw.a((String) null, (String) null, (String) null, false);
                break L1;
              }
            }
            stackOut_2_0 = new fr(param1, param0, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("aw.CB(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (ha) ((Object) stackIn_3_0);
    }

    private final void g(int param0) {
        this.o(-2);
        if (null == this.field_m) {
          if (param0 != 1) {
            this.field_ac = 74;
            return;
          } else {
            return;
          }
        } else {
          this.field_m.b(false);
          if (param0 == 1) {
            return;
          } else {
            this.field_ac = 74;
            return;
          }
        }
    }

    final void e(int param0, int param1) {
        il var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_20_0 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_66_0 = 0;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_81_0 = 0;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        Object stackOut_82_0 = null;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        Object stackOut_60_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        Object stackOut_67_0 = null;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param1 == 13) {
          if (param0 != this.field_N) {
            L0: {
              L1: {
                if (param0 != 1) {
                  break L1;
                } else {
                  var5 = 1;
                  var4 = 1;
                  var3 = sr.field_a;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param0 == 2) {
                  break L2;
                } else {
                  L3: {
                    if ((param0 ^ -1) == -129) {
                      break L3;
                    } else {
                      var5 = 0;
                      var3 = av.field_B;
                      var4 = 0;
                      if (var6 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3 = gb.field_t;
                  var5 = 1;
                  var4 = 1;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = 0;
              var4 = 1;
              var3 = lh.field_n;
              break L0;
            }
            L4: {
              if (this.field_u) {
                stackOut_55_0 = 0;
                stackIn_56_0 = stackOut_55_0;
                break L4;
              } else {
                stackOut_54_0 = 1;
                stackIn_56_0 = stackOut_54_0;
                break L4;
              }
            }
            L5: {
              stackOut_56_0 = stackIn_56_0;
              stackIn_58_0 = stackOut_56_0;
              stackIn_57_0 = stackOut_56_0;
              if (var5 != 0) {
                stackOut_58_0 = stackIn_58_0;
                stackOut_58_1 = 0;
                stackIn_59_0 = stackOut_58_0;
                stackIn_59_1 = stackOut_58_1;
                break L5;
              } else {
                stackOut_57_0 = stackIn_57_0;
                stackOut_57_1 = 1;
                stackIn_59_0 = stackOut_57_0;
                stackIn_59_1 = stackOut_57_1;
                break L5;
              }
            }
            if (stackIn_59_0 == stackIn_59_1) {
              L6: {
                if (var4 != 0) {
                  stackOut_80_0 = 0;
                  stackIn_81_0 = stackOut_80_0;
                  break L6;
                } else {
                  stackOut_79_0 = 1;
                  stackIn_81_0 = stackOut_79_0;
                  break L6;
                }
              }
              if (stackIn_81_0 != (this.field_ob ? 1 : 0)) {
                if (var3 != this.field_l) {
                  this.field_l = var3;
                  this.bb(-19519);
                  this.field_N = param0;
                  this.field_ic = this.field_ic & -29;
                  return;
                } else {
                  this.field_N = param0;
                  this.field_ic = this.field_ic & -29;
                  return;
                }
              } else {
                L7: {
                  stackOut_82_0 = this;
                  stackIn_84_0 = stackOut_82_0;
                  stackIn_83_0 = stackOut_82_0;
                  if (var4 == 0) {
                    stackOut_84_0 = this;
                    stackOut_84_1 = 0;
                    stackIn_85_0 = stackOut_84_0;
                    stackIn_85_1 = stackOut_84_1;
                    break L7;
                  } else {
                    stackOut_83_0 = this;
                    stackOut_83_1 = 1;
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_85_1 = stackOut_83_1;
                    break L7;
                  }
                }
                ((aw) (this)).field_ob = stackIn_85_1 != 0;
                this.p((byte) -4);
                if (var3 != this.field_l) {
                  this.field_l = var3;
                  this.bb(-19519);
                  this.field_N = param0;
                  this.field_ic = this.field_ic & -29;
                  return;
                } else {
                  this.field_N = param0;
                  this.field_ic = this.field_ic & -29;
                  return;
                }
              }
            } else {
              L8: {
                stackOut_60_0 = this;
                stackIn_62_0 = stackOut_60_0;
                stackIn_61_0 = stackOut_60_0;
                if (var5 == 0) {
                  stackOut_62_0 = this;
                  stackOut_62_1 = 0;
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  break L8;
                } else {
                  stackOut_61_0 = this;
                  stackOut_61_1 = 1;
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_63_1 = stackOut_61_1;
                  break L8;
                }
              }
              L9: {
                ((aw) (this)).field_u = stackIn_63_1 != 0;
                this.s(102);
                if (var4 != 0) {
                  stackOut_65_0 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  break L9;
                } else {
                  stackOut_64_0 = 1;
                  stackIn_66_0 = stackOut_64_0;
                  break L9;
                }
              }
              if (stackIn_66_0 != (this.field_ob ? 1 : 0)) {
                if (var3 != this.field_l) {
                  this.field_l = var3;
                  this.bb(-19519);
                  this.field_N = param0;
                  this.field_ic = this.field_ic & -29;
                  return;
                } else {
                  this.field_N = param0;
                  this.field_ic = this.field_ic & -29;
                  return;
                }
              } else {
                L10: {
                  stackOut_67_0 = this;
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_68_0 = stackOut_67_0;
                  if (var4 == 0) {
                    stackOut_69_0 = this;
                    stackOut_69_1 = 0;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    break L10;
                  } else {
                    stackOut_68_0 = this;
                    stackOut_68_1 = 1;
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_70_1 = stackOut_68_1;
                    break L10;
                  }
                }
                ((aw) (this)).field_ob = stackIn_70_1 != 0;
                this.p((byte) -4);
                if (var3 != this.field_l) {
                  this.field_l = var3;
                  this.bb(-19519);
                  this.field_N = param0;
                  this.field_ic = this.field_ic & -29;
                  return;
                } else {
                  this.field_N = param0;
                  this.field_ic = this.field_ic & -29;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          this.field_cb = (jaclib.memory.Stream) null;
          if (param0 != this.field_N) {
            L11: {
              L12: {
                if (param0 != 1) {
                  break L12;
                } else {
                  var5 = 1;
                  var4 = 1;
                  var3 = sr.field_a;
                  if (var6 == 0) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (param0 == 2) {
                  break L13;
                } else {
                  L14: {
                    if ((param0 ^ -1) == -129) {
                      break L14;
                    } else {
                      var5 = 0;
                      var3 = av.field_B;
                      var4 = 0;
                      if (var6 == 0) {
                        break L11;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var3 = gb.field_t;
                  var5 = 1;
                  var4 = 1;
                  if (var6 == 0) {
                    break L11;
                  } else {
                    break L13;
                  }
                }
              }
              var5 = 0;
              var4 = 1;
              var3 = lh.field_n;
              break L11;
            }
            L15: {
              if (this.field_u) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L15;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L15;
              }
            }
            L16: {
              stackOut_13_0 = stackIn_13_0;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (var5 != 0) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L16;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L16;
              }
            }
            if (stackIn_16_0 != stackIn_16_1) {
              L17: {
                stackOut_28_0 = this;
                stackIn_30_0 = stackOut_28_0;
                stackIn_29_0 = stackOut_28_0;
                if (var5 == 0) {
                  stackOut_30_0 = this;
                  stackOut_30_1 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  break L17;
                } else {
                  stackOut_29_0 = this;
                  stackOut_29_1 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  break L17;
                }
              }
              L18: {
                ((aw) (this)).field_u = stackIn_31_1 != 0;
                this.s(102);
                if (var4 != 0) {
                  stackOut_33_0 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  break L18;
                } else {
                  stackOut_32_0 = 1;
                  stackIn_34_0 = stackOut_32_0;
                  break L18;
                }
              }
              L19: {
                if (stackIn_34_0 != (this.field_ob ? 1 : 0)) {
                  break L19;
                } else {
                  L20: {
                    stackOut_35_0 = this;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_36_0 = stackOut_35_0;
                    if (var4 == 0) {
                      stackOut_37_0 = this;
                      stackOut_37_1 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L20;
                    } else {
                      stackOut_36_0 = this;
                      stackOut_36_1 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      break L20;
                    }
                  }
                  ((aw) (this)).field_ob = stackIn_38_1 != 0;
                  this.p((byte) -4);
                  break L19;
                }
              }
              if (var3 == this.field_l) {
                this.field_N = param0;
                this.field_ic = this.field_ic & -29;
                return;
              } else {
                this.field_l = var3;
                this.bb(-19519);
                this.field_N = param0;
                this.field_ic = this.field_ic & -29;
                return;
              }
            } else {
              L21: {
                if (var4 != 0) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L21;
                } else {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L21;
                }
              }
              L22: {
                if (stackIn_20_0 != (this.field_ob ? 1 : 0)) {
                  break L22;
                } else {
                  L23: {
                    stackOut_21_0 = this;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var4 == 0) {
                      stackOut_23_0 = this;
                      stackOut_23_1 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L23;
                    } else {
                      stackOut_22_0 = this;
                      stackOut_22_1 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      break L23;
                    }
                  }
                  ((aw) (this)).field_ob = stackIn_24_1 != 0;
                  this.p((byte) -4);
                  break L22;
                }
              }
              L24: {
                if (var3 == this.field_l) {
                  break L24;
                } else {
                  this.field_l = var3;
                  this.bb(-19519);
                  break L24;
                }
              }
              this.field_N = param0;
              this.field_ic = this.field_ic & -29;
              return;
            }
          } else {
            return;
          }
        }
    }

    private final boolean a(float param0, float param1, boolean param2, float param3, float param4, float param5, float param6) {
        jaclib.memory.Stream var9 = null;
        jaclib.memory.Buffer var10 = null;
        var10 = this.field_Wb.a(7454, param2);
        if (var10 != null) {
          var9 = this.a(param2, var10);
          if (!jaclib.memory.Stream.b()) {
            var9.b(param4);
            var9.b(param5);
            var9.b(param6);
            var9.b(param3);
            var9.b(param1);
            var9.b(param0);
            if (Sumoblitz.field_L) {
              var9.a(param4);
              var9.a(param5);
              var9.a(param6);
              var9.a(param3);
              var9.a(param1);
              var9.a(param0);
              var9.a();
              return this.field_Wb.a(22957);
            } else {
              var9.a();
              return this.field_Wb.a(22957);
            }
          } else {
            var9.a(param4);
            var9.a(param5);
            var9.a(param6);
            var9.a(param3);
            var9.a(param1);
            var9.a(param0);
            var9.a();
            return this.field_Wb.a(22957);
          }
        } else {
          return false;
        }
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
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        if (param1 == 4) {
          L0: {
            if (param0) {
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              break L0;
            }
          }
          L1: {
            stackOut_17_0 = stackIn_17_0;
            stackIn_19_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (this.field_i) {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              break L1;
            } else {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = 1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              break L1;
            }
          }
          if (stackIn_20_0 != stackIn_20_1) {
            L2: {
              stackOut_22_0 = this;
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (!param0) {
                stackOut_24_0 = this;
                stackOut_24_1 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L2;
              } else {
                stackOut_23_0 = this;
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L2;
              }
            }
            ((aw) (this)).field_i = stackIn_25_1 != 0;
            this.eb(120);
            this.field_ic = this.field_ic & -32;
            return;
          } else {
            return;
          }
        } else {
          L3: {
            this.f((byte) -69);
            if (param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          L4: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (this.field_i) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L4;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L4;
            }
          }
          if (stackIn_7_0 != stackIn_7_1) {
            L5: {
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (!param0) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L5;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L5;
              }
            }
            ((aw) (this)).field_i = stackIn_12_1 != 0;
            this.eb(120);
            this.field_ic = this.field_ic & -32;
            return;
          } else {
            return;
          }
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
            stackOut_0_0 = new mv((aw) (this), param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("aw.DF(");
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
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return (da) ((Object) stackIn_1_0);
    }

    final void KA(int param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackOut_53_0 = null;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_56_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        Object stackOut_59_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_62_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        if (param0 <= 0) {
          if (this.field_rb - 1 <= param2) {
            if (param1 <= 0) {
              if (this.field_Sb - 1 > param3) {
                L0: {
                  stackOut_53_0 = this;
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_54_0 = stackOut_53_0;
                  if (0 <= param1) {
                    stackOut_55_0 = this;
                    stackOut_55_1 = param1;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    break L0;
                  } else {
                    stackOut_54_0 = this;
                    stackOut_54_1 = 0;
                    stackIn_56_0 = stackOut_54_0;
                    stackIn_56_1 = stackOut_54_1;
                    break L0;
                  }
                }
                L1: {
                  ((aw) (this)).field_vb = stackIn_56_1;
                  stackOut_56_0 = this;
                  stackIn_58_0 = stackOut_56_0;
                  stackIn_57_0 = stackOut_56_0;
                  if (this.field_rb >= param3) {
                    stackOut_58_0 = this;
                    stackOut_58_1 = param3;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    break L1;
                  } else {
                    stackOut_57_0 = this;
                    stackOut_57_1 = 0;
                    stackIn_59_0 = stackOut_57_0;
                    stackIn_59_1 = stackOut_57_1;
                    break L1;
                  }
                }
                L2: {
                  ((aw) (this)).field_yc = stackIn_59_1;
                  stackOut_59_0 = this;
                  stackIn_61_0 = stackOut_59_0;
                  stackIn_60_0 = stackOut_59_0;
                  if (this.field_rb < param2) {
                    stackOut_61_0 = this;
                    stackOut_61_1 = 0;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    break L2;
                  } else {
                    stackOut_60_0 = this;
                    stackOut_60_1 = param2;
                    stackIn_62_0 = stackOut_60_0;
                    stackIn_62_1 = stackOut_60_1;
                    break L2;
                  }
                }
                L3: {
                  ((aw) (this)).field_F = stackIn_62_1;
                  stackOut_62_0 = this;
                  stackIn_64_0 = stackOut_62_0;
                  stackIn_63_0 = stackOut_62_0;
                  if (param0 < 0) {
                    stackOut_64_0 = this;
                    stackOut_64_1 = 0;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    break L3;
                  } else {
                    stackOut_63_0 = this;
                    stackOut_63_1 = param0;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_65_1 = stackOut_63_1;
                    break L3;
                  }
                }
                L4: {
                  ((aw) (this)).field_v = stackIn_65_1;
                  if (!this.field_wc) {
                    this.field_wc = true;
                    this.A(-87);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.F(4);
                this.h((byte) -82);
                return;
              } else {
                this.m(-16088);
                return;
              }
            } else {
              L5: {
                stackOut_35_0 = this;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (0 <= param1) {
                  stackOut_37_0 = this;
                  stackOut_37_1 = param1;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L5;
                } else {
                  stackOut_36_0 = this;
                  stackOut_36_1 = 0;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L5;
                }
              }
              L6: {
                ((aw) (this)).field_vb = stackIn_38_1;
                stackOut_38_0 = this;
                stackIn_40_0 = stackOut_38_0;
                stackIn_39_0 = stackOut_38_0;
                if (this.field_rb >= param3) {
                  stackOut_40_0 = this;
                  stackOut_40_1 = param3;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  break L6;
                } else {
                  stackOut_39_0 = this;
                  stackOut_39_1 = 0;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  break L6;
                }
              }
              L7: {
                ((aw) (this)).field_yc = stackIn_41_1;
                stackOut_41_0 = this;
                stackIn_43_0 = stackOut_41_0;
                stackIn_42_0 = stackOut_41_0;
                if (this.field_rb < param2) {
                  stackOut_43_0 = this;
                  stackOut_43_1 = 0;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  break L7;
                } else {
                  stackOut_42_0 = this;
                  stackOut_42_1 = param2;
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  break L7;
                }
              }
              L8: {
                ((aw) (this)).field_F = stackIn_44_1;
                stackOut_44_0 = this;
                stackIn_46_0 = stackOut_44_0;
                stackIn_45_0 = stackOut_44_0;
                if (param0 < 0) {
                  stackOut_46_0 = this;
                  stackOut_46_1 = 0;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  break L8;
                } else {
                  stackOut_45_0 = this;
                  stackOut_45_1 = param0;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  break L8;
                }
              }
              L9: {
                ((aw) (this)).field_v = stackIn_47_1;
                if (!this.field_wc) {
                  this.field_wc = true;
                  this.A(-87);
                  break L9;
                } else {
                  break L9;
                }
              }
              this.F(4);
              this.h((byte) -82);
              return;
            }
          } else {
            L10: {
              stackOut_18_0 = this;
              stackIn_20_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (0 <= param1) {
                stackOut_20_0 = this;
                stackOut_20_1 = param1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L10;
              } else {
                stackOut_19_0 = this;
                stackOut_19_1 = 0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                break L10;
              }
            }
            L11: {
              ((aw) (this)).field_vb = stackIn_21_1;
              stackOut_21_0 = this;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (this.field_rb >= param3) {
                stackOut_23_0 = this;
                stackOut_23_1 = param3;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L11;
              } else {
                stackOut_22_0 = this;
                stackOut_22_1 = 0;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L11;
              }
            }
            L12: {
              ((aw) (this)).field_yc = stackIn_24_1;
              stackOut_24_0 = this;
              stackIn_26_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (this.field_rb < param2) {
                stackOut_26_0 = this;
                stackOut_26_1 = 0;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                break L12;
              } else {
                stackOut_25_0 = this;
                stackOut_25_1 = param2;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                break L12;
              }
            }
            L13: {
              ((aw) (this)).field_F = stackIn_27_1;
              stackOut_27_0 = this;
              stackIn_29_0 = stackOut_27_0;
              stackIn_28_0 = stackOut_27_0;
              if (param0 < 0) {
                stackOut_29_0 = this;
                stackOut_29_1 = 0;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                break L13;
              } else {
                stackOut_28_0 = this;
                stackOut_28_1 = param0;
                stackIn_30_0 = stackOut_28_0;
                stackIn_30_1 = stackOut_28_1;
                break L13;
              }
            }
            L14: {
              ((aw) (this)).field_v = stackIn_30_1;
              if (!this.field_wc) {
                this.field_wc = true;
                this.A(-87);
                break L14;
              } else {
                break L14;
              }
            }
            this.F(4);
            this.h((byte) -82);
            return;
          }
        } else {
          L15: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (0 <= param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = param1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L15;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L15;
            }
          }
          L16: {
            ((aw) (this)).field_vb = stackIn_4_1;
            stackOut_4_0 = this;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (this.field_rb >= param3) {
              stackOut_6_0 = this;
              stackOut_6_1 = param3;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L16;
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L16;
            }
          }
          L17: {
            ((aw) (this)).field_yc = stackIn_7_1;
            stackOut_7_0 = this;
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if (this.field_rb < param2) {
              stackOut_9_0 = this;
              stackOut_9_1 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L17;
            } else {
              stackOut_8_0 = this;
              stackOut_8_1 = param2;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L17;
            }
          }
          L18: {
            ((aw) (this)).field_F = stackIn_10_1;
            stackOut_10_0 = this;
            stackIn_12_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (param0 < 0) {
              stackOut_12_0 = this;
              stackOut_12_1 = 0;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              break L18;
            } else {
              stackOut_11_0 = this;
              stackOut_11_1 = param0;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              break L18;
            }
          }
          L19: {
            ((aw) (this)).field_v = stackIn_13_1;
            if (!this.field_wc) {
              this.field_wc = true;
              this.A(-87);
              break L19;
            } else {
              break L19;
            }
          }
          this.F(4);
          this.h((byte) -82);
          return;
        }
    }

    abstract void s(int param0);

    private final void Q(int param0) {
        this.field_O = false;
        if (param0 != 13) {
          L0: {
            this.O(109);
            this.Z(0);
            if (mo.field_w == this.field_s) {
              this.g(1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            this.Z(0);
            if (mo.field_w == this.field_s) {
              this.g(1);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final void T(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
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
        if (param0 == -1) {
          var2 = this.field_cc - 1;
          L0: while (true) {
            if (-1 >= (var2 ^ -1)) {
              this.g(var2, -114);
              this.q((byte) -128);
              this.X(-86);
              this.l(0);
              var2--;
              if (var3 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.r(1);
              this.i(param0 + 1);
              this.o(-2);
              this.x(param0 + 1);
              this.N(-26911);
              return;
            }
          }
        } else {
          this.field_Lb = (ut) null;
          var2 = this.field_cc - 1;
          L1: while (true) {
            if (-1 >= (var2 ^ -1)) {
              this.g(var2, -114);
              this.q((byte) -128);
              this.X(-86);
              this.l(0);
              var2--;
              if (var3 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              this.r(1);
              this.i(param0 + 1);
              this.o(-2);
              this.x(param0 + 1);
              this.N(-26911);
              return;
            }
          }
        }
    }

    final void a(byte param0, tg param1, tg param2) {
        boolean discarded$2 = false;
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
                discarded$2 = this.c();
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("aw.FF(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          L6: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    abstract void X(int param0);

    aw(java.awt.Canvas param0, Object param1, d param2, ki param3, int param4, int param5) {
        super(param2);
        Throwable var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        wm var9 = null;
        int var10 = 0;
        java.awt.Dimension var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
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
                  L3: {
                    this.field_Ib = param1;
                    this.field_ab = param3;
                    this.field_Y = param4;
                    var11 = param0.getSize();
                    this.field_dc = param5;
                    this.field_Sb = var11.height;
                    this.field_rb = var11.width;
                    kr.a(true, -107, false);
                    if (null != this.field_h) {
                      break L3;
                    } else {
                      this.field_nc = new jagex3.graphics2.hw.NativeInterface(0, this.field_dc);
                      this.field_lc = null;
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_lc = new mr((aw) (this), this.field_h);
                  this.field_nc = new jagex3.graphics2.hw.NativeInterface(this.field_h.a(32075), this.field_dc);
                  var8 = 0;
                  L4: while (true) {
                    if (var8 >= this.field_h.a(32075)) {
                      break L2;
                    } else {
                      var9 = this.field_h.a(-29193, var8);
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (var9 == null) {
                            break L5;
                          } else {
                            this.field_nc.initTextureMetrics(var8, var9.field_t, var9.field_g);
                            break L5;
                          }
                        }
                        var8++;
                        if (var10 == 0) {
                          continue L4;
                        } else {
                          break L2;
                        }
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
              this.a((byte) -60);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var7_ref);
            stackOut_11_1 = new StringBuilder().append("aw.<init>(");
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
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          L7: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          L8: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          L9: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          if (this.field_tb) {
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
          if (stackIn_3_0 == (param0 ? 1 : 0)) {
            L2: {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (!param0) {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L2;
              }
            }
            L3: {
              ((aw) (this)).field_tb = stackIn_8_1 != 0;
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (param1) {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L3;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L3;
              }
            }
            this.f(stackIn_11_1 != 0);
            break L1;
          } else {
            break L1;
          }
        }
        if (!param1) {
          this.field_kc = -110;
          return;
        } else {
          return;
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
            stackOut_0_0 = new pu((aw) (this), param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("aw.TB(");
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
          L0: {
            this.field_vb = -58;
            this.V(26803);
            if (this.field_m != null) {
              this.field_m.a((byte) -92);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            this.V(26803);
            if (this.field_m != null) {
              this.field_m.a((byte) -92);
              break L1;
            } else {
              break L1;
            }
          }
          return;
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
        if (this.field_m == null) {
          if (param0 > -25) {
            return;
          } else {
            this.b(true);
            return;
          }
        } else {
          this.field_m.a(260);
          if (param0 > -25) {
            return;
          } else {
            this.b(true);
            return;
          }
        }
    }

    void Y(int param0) {
        this.field_Ab = this.field_ub;
        if (param0 >= -83) {
            this.field_vb = -113;
            this.field_ub = 0;
            return;
        }
        this.field_ub = 0;
    }

    final jaclib.memory.heap.NativeHeapBuffer a(boolean param0, boolean param1, int param2) {
        if (param0) {
            this.field_C = -95;
            return this.field_gb.a(param2, param1);
        }
        return this.field_gb.a(param2, param1);
    }

    final ut k(byte param0) {
        L0: {
          if (!this.field_R) {
            this.field_vc.a(this.field_Gb, (byte) 77, this.field_Lb);
            this.field_R = true;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 58) {
          return (ut) null;
        } else {
          return this.field_vc;
        }
    }

    abstract void a(int param0, int param1, pv param2);

    final void K(int param0) {
        L0: {
          if (4 != this.field_ic) {
            this.L(-25);
            this.c(false, -32);
            this.d(111, false);
            this.c(80, false);
            this.b(false, 4);
            this.a(-2, false, 50, false);
            this.e(1, 13);
            this.h(96, 0);
            this.field_ic = 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          this.field_Zb = (ed[]) null;
          return;
        } else {
          return;
        }
    }

    final int XA() {
        return this.field_Yb;
    }

    void f(int param0) {
        if (this.field_lc != null) {
          this.field_lc.a(125);
          this.field_kc = 2147483647 & param0;
          return;
        } else {
          this.field_kc = 2147483647 & param0;
          return;
        }
    }

    final void L(int param0) {
        za discarded$1 = null;
        hv var2 = null;
        if (param0 != -25) {
          L0: {
            discarded$1 = this.c(-125);
            if (this.field_s != vu.field_h) {
              L1: {
                var2 = this.field_s;
                this.field_s = vu.field_h;
                if (var2.a(-20011)) {
                  this.W(16);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.c((byte) -88);
              this.field_A = this.field_fc;
              this.g(param0 ^ -26);
              this.field_ic = this.field_ic & -25;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (this.field_s != vu.field_h) {
              L3: {
                var2 = this.field_s;
                this.field_s = vu.field_h;
                if (var2.a(-20011)) {
                  this.W(16);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.c((byte) -88);
              this.field_A = this.field_fc;
              this.g(param0 ^ -26);
              this.field_ic = this.field_ic & -25;
              break L2;
            } else {
              break L2;
            }
          }
          return;
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
          L0: {
            this.a(true, -85);
            if (ar.field_L != this.field_wb[this.field_mc]) {
              this.field_wb[this.field_mc] = ar.field_L;
              this.field_V[this.field_mc].a(1);
              this.j(128);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (ar.field_L != this.field_wb[this.field_mc]) {
              this.field_wb[this.field_mc] = ar.field_L;
              this.field_V[this.field_mc].a(1);
              this.j(128);
              break L1;
            } else {
              break L1;
            }
          }
          return;
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
                this.field_Wb = (pv) null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param2, 0, param0, param4, -64, 0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var6);
            stackOut_4_1 = new StringBuilder().append("aw.CE(");
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
          return this.field_X[3].b((byte) -59);
        } else {
          return this.field_X[3].b((byte) -59);
        }
    }

    abstract void q(int param0);

    abstract void eb(int param0);

    private final void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_188_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 2147483647) {
          param3 = param3 & this.o((byte) 24);
          if (!param3) {
            if ((param5 ^ -1) != -5) {
              if (8 != param5) {
                if (9 == param5) {
                  L0: {
                    param5 = 2;
                    if ((param5 ^ -1) == -5) {
                      stackOut_187_0 = 1 & param4;
                      stackIn_188_0 = stackOut_187_0;
                      break L0;
                    } else {
                      stackOut_186_0 = 1;
                      stackIn_188_0 = stackOut_186_0;
                      break L0;
                    }
                  }
                  L1: {
                    param2 = stackIn_188_0;
                    param4 = 0;
                    if (param5 == 0) {
                      break L1;
                    } else {
                      if (param1) {
                        param5 = param5 | -2147483648;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if (param5 == this.field_L) {
                      break L2;
                    } else {
                      L3: {
                        if (-1 != (this.field_L ^ -1)) {
                          this.field_X[this.field_L & 2147483647].c(false);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (param5 != 0) {
                            break L5;
                          } else {
                            this.field_m = null;
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.field_m = this.field_X[2147483647 & param5];
                        this.field_m.a(param1, 20186);
                        this.field_m.a(param1, (byte) -79);
                        this.field_m.a(param0 ^ 2147449624, param2, param4);
                        break L4;
                      }
                      this.field_L = param5;
                      this.field_ac = param2;
                      this.field_xb = param4;
                      if (var8 != 0) {
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                  if (-1 != (this.field_L ^ -1)) {
                    this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                    if (param4 == this.field_xb) {
                      if (this.field_ac != param2) {
                        this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                        this.field_xb = param4;
                        this.field_ac = param2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                      this.field_xb = param4;
                      this.field_ac = param2;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    if (param5 == 0) {
                      break L6;
                    } else {
                      if (param1) {
                        param5 = param5 | -2147483648;
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            if (param5 == this.field_L) {
                              break L8;
                            } else {
                              L9: {
                                if (-1 != (this.field_L ^ -1)) {
                                  this.field_X[this.field_L & 2147483647].c(false);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                L11: {
                                  if (param5 != 0) {
                                    break L11;
                                  } else {
                                    this.field_m = null;
                                    if (var8 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                this.field_m = this.field_X[2147483647 & param5];
                                this.field_m.a(param1, 20186);
                                this.field_m.a(param1, (byte) -79);
                                this.field_m.a(param0 ^ 2147449624, param2, param4);
                                break L10;
                              }
                              this.field_L = param5;
                              this.field_ac = param2;
                              this.field_xb = param4;
                              if (var8 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (-1 != (this.field_L ^ -1)) {
                            L12: {
                              this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                              if (param4 != this.field_xb) {
                                break L12;
                              } else {
                                if (this.field_ac != param2) {
                                  break L12;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                            this.field_xb = param4;
                            this.field_ac = param2;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L13: {
                    if (param5 == this.field_L) {
                      break L13;
                    } else {
                      L14: {
                        if (-1 != (this.field_L ^ -1)) {
                          this.field_X[this.field_L & 2147483647].c(false);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      if (param5 == 0) {
                        this.field_m = null;
                        if (var8 == 0) {
                          this.field_L = param5;
                          this.field_ac = param2;
                          this.field_xb = param4;
                          if (var8 != 0) {
                            break L13;
                          } else {
                            return;
                          }
                        } else {
                          L15: {
                            this.field_m = this.field_X[2147483647 & param5];
                            this.field_m.a(param1, 20186);
                            this.field_m.a(param1, (byte) -79);
                            this.field_m.a(param0 ^ 2147449624, param2, param4);
                            this.field_L = param5;
                            this.field_ac = param2;
                            this.field_xb = param4;
                            if (-1 != (this.field_L ^ -1)) {
                              L16: {
                                this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                                if (param4 != this.field_xb) {
                                  break L16;
                                } else {
                                  if (this.field_ac != param2) {
                                    break L16;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                              this.field_xb = param4;
                              this.field_ac = param2;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          return;
                        }
                      } else {
                        L17: {
                          this.field_m = this.field_X[2147483647 & param5];
                          this.field_m.a(param1, 20186);
                          this.field_m.a(param1, (byte) -79);
                          this.field_m.a(param0 ^ 2147449624, param2, param4);
                          this.field_L = param5;
                          this.field_ac = param2;
                          this.field_xb = param4;
                          if (var8 == 0) {
                            break L17;
                          } else {
                            if (-1 != (this.field_L ^ -1)) {
                              L18: {
                                this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                                if (param4 != this.field_xb) {
                                  break L18;
                                } else {
                                  if (this.field_ac != param2) {
                                    break L18;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                              this.field_xb = param4;
                              this.field_ac = param2;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (-1 != (this.field_L ^ -1)) {
                    this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                    if (param4 == this.field_xb) {
                      if (this.field_ac == param2) {
                        return;
                      } else {
                        this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                        this.field_xb = param4;
                        this.field_ac = param2;
                        return;
                      }
                    } else {
                      this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                      this.field_xb = param4;
                      this.field_ac = param2;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L19: {
                  param5 = 2;
                  if ((param5 ^ -1) == -5) {
                    stackOut_112_0 = 1 & param4;
                    stackIn_113_0 = stackOut_112_0;
                    break L19;
                  } else {
                    stackOut_111_0 = 1;
                    stackIn_113_0 = stackOut_111_0;
                    break L19;
                  }
                }
                L20: {
                  param2 = stackIn_113_0;
                  param4 = 0;
                  if (param5 == 0) {
                    break L20;
                  } else {
                    if (param1) {
                      param5 = param5 | -2147483648;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                L21: {
                  L22: {
                    if (param5 == this.field_L) {
                      break L22;
                    } else {
                      L23: {
                        if (-1 != (this.field_L ^ -1)) {
                          this.field_X[this.field_L & 2147483647].c(false);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        L25: {
                          if (param5 != 0) {
                            break L25;
                          } else {
                            this.field_m = null;
                            if (var8 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        this.field_m = this.field_X[2147483647 & param5];
                        this.field_m.a(param1, 20186);
                        this.field_m.a(param1, (byte) -79);
                        this.field_m.a(param0 ^ 2147449624, param2, param4);
                        break L24;
                      }
                      this.field_L = param5;
                      this.field_ac = param2;
                      this.field_xb = param4;
                      if (var8 == 0) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  if (-1 != (this.field_L ^ -1)) {
                    L26: {
                      this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                      if (param4 != this.field_xb) {
                        break L26;
                      } else {
                        if (this.field_ac != param2) {
                          break L26;
                        } else {
                          break L21;
                        }
                      }
                    }
                    this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                    this.field_xb = param4;
                    this.field_ac = param2;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                return;
              }
            } else {
              L27: {
                param5 = 2;
                if ((param5 ^ -1) == -5) {
                  stackOut_88_0 = 1 & param4;
                  stackIn_89_0 = stackOut_88_0;
                  break L27;
                } else {
                  stackOut_87_0 = 1;
                  stackIn_89_0 = stackOut_87_0;
                  break L27;
                }
              }
              L28: {
                param2 = stackIn_89_0;
                param4 = 0;
                if (param5 == 0) {
                  break L28;
                } else {
                  if (param1) {
                    param5 = param5 | -2147483648;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                L30: {
                  if (param5 == this.field_L) {
                    break L30;
                  } else {
                    L31: {
                      if (-1 != (this.field_L ^ -1)) {
                        this.field_X[this.field_L & 2147483647].c(false);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      L33: {
                        if (param5 != 0) {
                          break L33;
                        } else {
                          this.field_m = null;
                          if (var8 == 0) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      this.field_m = this.field_X[2147483647 & param5];
                      this.field_m.a(param1, 20186);
                      this.field_m.a(param1, (byte) -79);
                      this.field_m.a(param0 ^ 2147449624, param2, param4);
                      break L32;
                    }
                    this.field_L = param5;
                    this.field_ac = param2;
                    this.field_xb = param4;
                    if (var8 == 0) {
                      break L29;
                    } else {
                      break L30;
                    }
                  }
                }
                if (-1 != (this.field_L ^ -1)) {
                  L34: {
                    this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                    if (param4 != this.field_xb) {
                      break L34;
                    } else {
                      if (this.field_ac != param2) {
                        break L34;
                      } else {
                        break L29;
                      }
                    }
                  }
                  this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                  this.field_xb = param4;
                  this.field_ac = param2;
                  break L29;
                } else {
                  break L29;
                }
              }
              return;
            }
          } else {
            L35: {
              if (param5 == 0) {
                break L35;
              } else {
                if (param1) {
                  param5 = param5 | -2147483648;
                  break L35;
                } else {
                  L36: {
                    L37: {
                      if (param5 == this.field_L) {
                        break L37;
                      } else {
                        L38: {
                          if (-1 != (this.field_L ^ -1)) {
                            this.field_X[this.field_L & 2147483647].c(false);
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        L39: {
                          L40: {
                            if (param5 != 0) {
                              break L40;
                            } else {
                              this.field_m = null;
                              if (var8 == 0) {
                                break L39;
                              } else {
                                break L40;
                              }
                            }
                          }
                          this.field_m = this.field_X[2147483647 & param5];
                          this.field_m.a(param1, 20186);
                          this.field_m.a(param1, (byte) -79);
                          this.field_m.a(param0 ^ 2147449624, param2, param4);
                          break L39;
                        }
                        this.field_L = param5;
                        this.field_ac = param2;
                        this.field_xb = param4;
                        if (var8 == 0) {
                          break L36;
                        } else {
                          break L37;
                        }
                      }
                    }
                    if (-1 != (this.field_L ^ -1)) {
                      this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                      if (param4 != this.field_xb) {
                        this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                        this.field_xb = param4;
                        this.field_ac = param2;
                        break L36;
                      } else {
                        if (this.field_ac != param2) {
                          this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                          this.field_xb = param4;
                          this.field_ac = param2;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    } else {
                      break L36;
                    }
                  }
                  return;
                }
              }
            }
            L41: {
              if (param5 == this.field_L) {
                break L41;
              } else {
                L42: {
                  if (-1 != (this.field_L ^ -1)) {
                    this.field_X[this.field_L & 2147483647].c(false);
                    break L42;
                  } else {
                    break L42;
                  }
                }
                if (param5 == 0) {
                  this.field_m = null;
                  if (var8 == 0) {
                    this.field_L = param5;
                    this.field_ac = param2;
                    this.field_xb = param4;
                    if (var8 != 0) {
                      break L41;
                    } else {
                      return;
                    }
                  } else {
                    L43: {
                      this.field_m = this.field_X[2147483647 & param5];
                      this.field_m.a(param1, 20186);
                      this.field_m.a(param1, (byte) -79);
                      this.field_m.a(param0 ^ 2147449624, param2, param4);
                      this.field_L = param5;
                      this.field_ac = param2;
                      this.field_xb = param4;
                      if (-1 != (this.field_L ^ -1)) {
                        this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                        if (param4 != this.field_xb) {
                          this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                          this.field_xb = param4;
                          this.field_ac = param2;
                          break L43;
                        } else {
                          if (this.field_ac != param2) {
                            this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                            this.field_xb = param4;
                            this.field_ac = param2;
                            break L43;
                          } else {
                            break L43;
                          }
                        }
                      } else {
                        break L43;
                      }
                    }
                    return;
                  }
                } else {
                  L44: {
                    this.field_m = this.field_X[2147483647 & param5];
                    this.field_m.a(param1, 20186);
                    this.field_m.a(param1, (byte) -79);
                    this.field_m.a(param0 ^ 2147449624, param2, param4);
                    this.field_L = param5;
                    this.field_ac = param2;
                    this.field_xb = param4;
                    if (var8 == 0) {
                      break L44;
                    } else {
                      if (-1 != (this.field_L ^ -1)) {
                        L45: {
                          this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
                          if (param4 != this.field_xb) {
                            break L45;
                          } else {
                            if (this.field_ac != param2) {
                              break L45;
                            } else {
                              break L44;
                            }
                          }
                        }
                        this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                        this.field_xb = param4;
                        this.field_ac = param2;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (-1 != (this.field_L ^ -1)) {
              this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
              if (param4 == this.field_xb) {
                if (this.field_ac == param2) {
                  return;
                } else {
                  this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                  this.field_xb = param4;
                  this.field_ac = param2;
                  return;
                }
              } else {
                this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                this.field_xb = param4;
                this.field_ac = param2;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L46: {
            this.field_m = (rq) null;
            param3 = param3 & this.o((byte) 24);
            if (param3) {
              break L46;
            } else {
              L47: {
                if ((param5 ^ -1) == -5) {
                  break L47;
                } else {
                  if (8 == param5) {
                    break L47;
                  } else {
                    if (9 != param5) {
                      break L46;
                    } else {
                      break L47;
                    }
                  }
                }
              }
              L48: {
                param5 = 2;
                if ((param5 ^ -1) == -5) {
                  stackOut_8_0 = 1 & param4;
                  stackIn_9_0 = stackOut_8_0;
                  break L48;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L48;
                }
              }
              param2 = stackIn_9_0;
              param4 = 0;
              break L46;
            }
          }
          L49: {
            if (param5 == 0) {
              break L49;
            } else {
              if (param1) {
                param5 = param5 | -2147483648;
                break L49;
              } else {
                break L49;
              }
            }
          }
          L50: {
            L51: {
              if (param5 == this.field_L) {
                break L51;
              } else {
                L52: {
                  if (-1 != (this.field_L ^ -1)) {
                    this.field_X[this.field_L & 2147483647].c(false);
                    break L52;
                  } else {
                    break L52;
                  }
                }
                L53: {
                  L54: {
                    if (param5 != 0) {
                      break L54;
                    } else {
                      this.field_m = null;
                      if (var8 == 0) {
                        break L53;
                      } else {
                        break L54;
                      }
                    }
                  }
                  this.field_m = this.field_X[2147483647 & param5];
                  this.field_m.a(param1, 20186);
                  this.field_m.a(param1, (byte) -79);
                  this.field_m.a(param0 ^ 2147449624, param2, param4);
                  break L53;
                }
                this.field_L = param5;
                this.field_ac = param2;
                this.field_xb = param4;
                if (var8 == 0) {
                  break L50;
                } else {
                  break L51;
                }
              }
            }
            if (-1 != (this.field_L ^ -1)) {
              this.field_X[this.field_L & 2147483647].a(param1, (byte) -127);
              if (param4 != this.field_xb) {
                this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                this.field_xb = param4;
                this.field_ac = param2;
                break L50;
              } else {
                if (this.field_ac != param2) {
                  this.field_X[2147483647 & this.field_L].a(34023, param2, param4);
                  this.field_xb = param4;
                  this.field_ac = param2;
                  break L50;
                } else {
                  break L50;
                }
              }
            } else {
              break L50;
            }
          }
          return;
        }
    }

    abstract void db(int param0);

    final void w(int param0) {
        L0: {
          if (2 != this.field_ic) {
            this.L(-25);
            this.c(false, -32);
            this.d(param0 + 109, false);
            this.c(83, false);
            this.b(false, 4);
            this.a(-2, false, param0 + 40, false);
            this.field_ic = 2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 10) {
          this.a(-53, true, 73, false);
          return;
        } else {
          return;
        }
    }

    final int e(byte param0) {
        ru discarded$2 = null;
        iw var3 = null;
        if (param0 < 5) {
          var3 = (iw) null;
          discarded$2 = this.a((io) null, (iw) null, -127, 20, (byte) -94);
          return this.field_mb;
        } else {
          return this.field_mb;
        }
    }

    final void h(int param0, int param1) {
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 > 28) {
          if (param1 != 1) {
            if (0 == param1) {
              this.a((byte) -83, vi.field_v, vi.field_v);
              if (var4 != 0) {
                this.a((byte) -83, lf.field_e, lf.field_e);
                return;
              } else {
                return;
              }
            } else {
              if ((param1 ^ -1) == -3) {
                this.a((byte) -83, lf.field_e, ua.field_n);
                if (var4 != 0) {
                  this.a((byte) -83, vi.field_v, vi.field_v);
                  this.a((byte) -83, lf.field_e, lf.field_e);
                  return;
                } else {
                  return;
                }
              } else {
                L0: {
                  if (param1 == 3) {
                    break L0;
                  } else {
                    if (param1 == 4) {
                      this.a((byte) -83, bj.field_c, bj.field_c);
                      if (var4 != 0) {
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                this.a((byte) -83, vi.field_v, cv.field_F);
                if (var4 != 0) {
                  this.a((byte) -83, lf.field_e, ua.field_n);
                  this.a((byte) -83, vi.field_v, vi.field_v);
                  this.a((byte) -83, lf.field_e, lf.field_e);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            this.a((byte) -83, lf.field_e, lf.field_e);
            return;
          }
        } else {
          this.field_R = true;
          if (param1 != 1) {
            if (0 != param1) {
              if ((param1 ^ -1) != -3) {
                L1: {
                  if (param1 == 3) {
                    break L1;
                  } else {
                    if (param1 == 4) {
                      this.a((byte) -83, bj.field_c, bj.field_c);
                      if (var4 != 0) {
                        break L1;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                this.a((byte) -83, vi.field_v, cv.field_F);
                if (var4 != 0) {
                  this.a((byte) -83, lf.field_e, ua.field_n);
                  this.a((byte) -83, vi.field_v, vi.field_v);
                  this.a((byte) -83, lf.field_e, lf.field_e);
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  this.a((byte) -83, lf.field_e, ua.field_n);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    this.a((byte) -83, vi.field_v, vi.field_v);
                    this.a((byte) -83, lf.field_e, lf.field_e);
                    break L2;
                  }
                }
                return;
              }
            } else {
              L3: {
                this.a((byte) -83, vi.field_v, vi.field_v);
                if (var4 == 0) {
                  break L3;
                } else {
                  this.a((byte) -83, lf.field_e, lf.field_e);
                  break L3;
                }
              }
              return;
            }
          } else {
            this.a((byte) -83, lf.field_e, lf.field_e);
            return;
          }
        }
    }

    final int h(int param0) {
        int var2 = 21 % ((-37 - param0) / 47);
        return this.field_Cb + (this.field_o + this.field_pc);
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
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_135_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        if (param2 == 50) {
          if (this.field_Vb == param0) {
            L0: {
              if (this.field_fb) {
                stackOut_106_0 = 0;
                stackIn_107_0 = stackOut_106_0;
                break L0;
              } else {
                stackOut_105_0 = 1;
                stackIn_107_0 = stackOut_105_0;
                break L0;
              }
            }
            L1: {
              stackOut_107_0 = stackIn_107_0;
              stackIn_109_0 = stackOut_107_0;
              stackIn_108_0 = stackOut_107_0;
              if (this.field_bb) {
                stackOut_109_0 = stackIn_109_0;
                stackOut_109_1 = 0;
                stackIn_110_0 = stackOut_109_0;
                stackIn_110_1 = stackOut_109_1;
                break L1;
              } else {
                stackOut_108_0 = stackIn_108_0;
                stackOut_108_1 = 1;
                stackIn_110_0 = stackOut_108_0;
                stackIn_110_1 = stackOut_108_1;
                break L1;
              }
            }
            if (stackIn_110_0 != stackIn_110_1) {
              L2: {
                var5 = null;
                var6 = 0;
                var7 = 0;
                var8 = 0;
                if (!this.field_fb) {
                  stackOut_114_0 = 0;
                  stackIn_115_0 = stackOut_114_0;
                  break L2;
                } else {
                  stackOut_113_0 = 3;
                  stackIn_115_0 = stackOut_113_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_115_0;
                if (0 > param0) {
                  this.l(0);
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var5 = this.field_lc.a(param2 + 37, param0);
                      var10 = this.field_h.a(-29193, param0);
                      if (var10.field_c != 0) {
                        break L5;
                      } else {
                        if (var10.field_u != 0) {
                          break L5;
                        } else {
                          this.l(0);
                          if (var14 == 0) {
                            break L4;
                          } else {
                            L6: {
                              if (var10.field_n) {
                                stackOut_121_0 = 64;
                                stackIn_122_0 = stackOut_121_0;
                                break L6;
                              } else {
                                stackOut_120_0 = 128;
                                stackIn_122_0 = stackOut_120_0;
                                break L6;
                              }
                            }
                            L7: {
                              var11 = stackIn_122_0;
                              var12 = var11 * 50;
                              var13 = this.B(0);
                              var13.a((float)(this.field_kc % var12 * var10.field_u) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_kc % var12)) / (float)var12, param2 + -50);
                              this.a(rs.field_c, param2 + 28830);
                              var6 = var10.field_q;
                              if (!this.field_fb) {
                                var9 = var10.field_d;
                                var8 = var10.field_h;
                                var7 = var10.field_j;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              this.a(2147483647, param1, var8, param3, var7, var9);
                              if (null == this.field_m) {
                                this.a((ed) (var5), 117);
                                this.h(45, var6);
                                if (var14 == 0) {
                                  break L8;
                                } else {
                                  this.field_m.a(var6, 18834, (ed) (var5));
                                  break L8;
                                }
                              } else {
                                this.field_m.a(var6, 18834, (ed) (var5));
                                break L8;
                              }
                            }
                            this.field_bb = this.field_fb;
                            this.field_Vb = param0;
                            this.field_ic = this.field_ic & -8;
                            return;
                          }
                        }
                      }
                    }
                    L9: {
                      if (var10.field_n) {
                        stackOut_134_0 = 64;
                        stackIn_135_0 = stackOut_134_0;
                        break L9;
                      } else {
                        stackOut_133_0 = 128;
                        stackIn_135_0 = stackOut_133_0;
                        break L9;
                      }
                    }
                    var11 = stackIn_135_0;
                    var12 = var11 * 50;
                    var13 = this.B(0);
                    var13.a((float)(this.field_kc % var12 * var10.field_u) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_kc % var12)) / (float)var12, param2 + -50);
                    this.a(rs.field_c, param2 + 28830);
                    break L4;
                  }
                  var6 = var10.field_q;
                  if (!this.field_fb) {
                    var9 = var10.field_d;
                    var8 = var10.field_h;
                    var7 = var10.field_j;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              this.a(2147483647, param1, var8, param3, var7, var9);
              if (null == this.field_m) {
                this.a((ed) (var5), 117);
                this.h(45, var6);
                if (var14 != 0) {
                  this.field_m.a(var6, 18834, (ed) (var5));
                  this.field_bb = this.field_fb;
                  this.field_Vb = param0;
                  this.field_ic = this.field_ic & -8;
                  return;
                } else {
                  this.field_bb = this.field_fb;
                  this.field_Vb = param0;
                  this.field_ic = this.field_ic & -8;
                  return;
                }
              } else {
                this.field_m.a(var6, 18834, (ed) (var5));
                this.field_bb = this.field_fb;
                this.field_Vb = param0;
                this.field_ic = this.field_ic & -8;
                return;
              }
            } else {
              this.field_ic = this.field_ic & -8;
              return;
            }
          } else {
            L10: {
              var5 = null;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              if (!this.field_fb) {
                stackOut_39_0 = 0;
                stackIn_40_0 = stackOut_39_0;
                break L10;
              } else {
                stackOut_38_0 = 3;
                stackIn_40_0 = stackOut_38_0;
                break L10;
              }
            }
            var9 = stackIn_40_0;
            if (0 <= param0) {
              var5 = this.field_lc.a(param2 + 37, param0);
              var10 = this.field_h.a(-29193, param0);
              if (var10.field_c == 0) {
                if (var10.field_u == 0) {
                  this.l(0);
                  if (var14 != 0) {
                    L11: {
                      if (var10.field_n) {
                        stackOut_92_0 = 64;
                        stackIn_93_0 = stackOut_92_0;
                        break L11;
                      } else {
                        stackOut_91_0 = 128;
                        stackIn_93_0 = stackOut_91_0;
                        break L11;
                      }
                    }
                    L12: {
                      var11 = stackIn_93_0;
                      var12 = var11 * 50;
                      var13 = this.B(0);
                      var13.a((float)(this.field_kc % var12 * var10.field_u) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_kc % var12)) / (float)var12, param2 + -50);
                      this.a(rs.field_c, param2 + 28830);
                      var6 = var10.field_q;
                      if (!this.field_fb) {
                        var9 = var10.field_d;
                        var8 = var10.field_h;
                        var7 = var10.field_j;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      this.a(2147483647, param1, var8, param3, var7, var9);
                      if (null == this.field_m) {
                        this.a((ed) (var5), 117);
                        this.h(45, var6);
                        if (var14 == 0) {
                          break L13;
                        } else {
                          this.field_m.a(var6, 18834, (ed) (var5));
                          break L13;
                        }
                      } else {
                        this.field_m.a(var6, 18834, (ed) (var5));
                        break L13;
                      }
                    }
                    this.field_bb = this.field_fb;
                    this.field_Vb = param0;
                    this.field_ic = this.field_ic & -8;
                    return;
                  } else {
                    L14: {
                      var6 = var10.field_q;
                      if (!this.field_fb) {
                        var9 = var10.field_d;
                        var8 = var10.field_h;
                        var7 = var10.field_j;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      this.a(2147483647, param1, var8, param3, var7, var9);
                      if (null == this.field_m) {
                        this.a((ed) (var5), 117);
                        this.h(45, var6);
                        if (var14 == 0) {
                          break L15;
                        } else {
                          this.field_m.a(var6, 18834, (ed) (var5));
                          break L15;
                        }
                      } else {
                        this.field_m.a(var6, 18834, (ed) (var5));
                        break L15;
                      }
                    }
                    this.field_bb = this.field_fb;
                    this.field_Vb = param0;
                    this.field_ic = this.field_ic & -8;
                    return;
                  }
                } else {
                  L16: {
                    if (var10.field_n) {
                      stackOut_66_0 = 64;
                      stackIn_67_0 = stackOut_66_0;
                      break L16;
                    } else {
                      stackOut_65_0 = 128;
                      stackIn_67_0 = stackOut_65_0;
                      break L16;
                    }
                  }
                  L17: {
                    var11 = stackIn_67_0;
                    var12 = var11 * 50;
                    var13 = this.B(0);
                    var13.a((float)(this.field_kc % var12 * var10.field_u) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_kc % var12)) / (float)var12, param2 + -50);
                    this.a(rs.field_c, param2 + 28830);
                    var6 = var10.field_q;
                    if (!this.field_fb) {
                      var9 = var10.field_d;
                      var8 = var10.field_h;
                      var7 = var10.field_j;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    this.a(2147483647, param1, var8, param3, var7, var9);
                    if (null == this.field_m) {
                      this.a((ed) (var5), 117);
                      this.h(45, var6);
                      if (var14 == 0) {
                        break L18;
                      } else {
                        this.field_m.a(var6, 18834, (ed) (var5));
                        break L18;
                      }
                    } else {
                      this.field_m.a(var6, 18834, (ed) (var5));
                      break L18;
                    }
                  }
                  this.field_bb = this.field_fb;
                  this.field_Vb = param0;
                  this.field_ic = this.field_ic & -8;
                  return;
                }
              } else {
                L19: {
                  if (var10.field_n) {
                    stackOut_51_0 = 64;
                    stackIn_52_0 = stackOut_51_0;
                    break L19;
                  } else {
                    stackOut_50_0 = 128;
                    stackIn_52_0 = stackOut_50_0;
                    break L19;
                  }
                }
                L20: {
                  var11 = stackIn_52_0;
                  var12 = var11 * 50;
                  var13 = this.B(0);
                  var13.a((float)(this.field_kc % var12 * var10.field_u) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_kc % var12)) / (float)var12, param2 + -50);
                  this.a(rs.field_c, param2 + 28830);
                  var6 = var10.field_q;
                  if (!this.field_fb) {
                    var9 = var10.field_d;
                    var8 = var10.field_h;
                    var7 = var10.field_j;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  this.a(2147483647, param1, var8, param3, var7, var9);
                  if (null == this.field_m) {
                    this.a((ed) (var5), 117);
                    this.h(45, var6);
                    if (var14 == 0) {
                      break L21;
                    } else {
                      this.field_m.a(var6, 18834, (ed) (var5));
                      break L21;
                    }
                  } else {
                    this.field_m.a(var6, 18834, (ed) (var5));
                    break L21;
                  }
                }
                this.field_bb = this.field_fb;
                this.field_Vb = param0;
                this.field_ic = this.field_ic & -8;
                return;
              }
            } else {
              L22: {
                this.l(0);
                this.a(2147483647, param1, var8, param3, var7, var9);
                if (null == this.field_m) {
                  this.a((ed) (var5), 117);
                  this.h(45, var6);
                  if (var14 == 0) {
                    break L22;
                  } else {
                    this.field_m.a(var6, 18834, (ed) (var5));
                    break L22;
                  }
                } else {
                  this.field_m.a(var6, 18834, (ed) (var5));
                  break L22;
                }
              }
              this.field_bb = this.field_fb;
              this.field_Vb = param0;
              this.field_ic = this.field_ic & -8;
              return;
            }
          }
        } else {
          L23: {
            L24: {
              field_t = (tf) null;
              if (this.field_Vb != param0) {
                break L24;
              } else {
                L25: {
                  if (this.field_fb) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L25;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L25;
                  }
                }
                L26: {
                  stackOut_5_0 = stackIn_5_0;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (this.field_bb) {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L26;
                  } else {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L26;
                  }
                }
                if (stackIn_8_0 != stackIn_8_1) {
                  break L24;
                } else {
                  break L23;
                }
              }
            }
            L27: {
              var5 = null;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              if (!this.field_fb) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L27;
              } else {
                stackOut_11_0 = 3;
                stackIn_13_0 = stackOut_11_0;
                break L27;
              }
            }
            L28: {
              var9 = stackIn_13_0;
              if (0 > param0) {
                this.l(0);
                break L28;
              } else {
                L29: {
                  L30: {
                    var5 = this.field_lc.a(param2 + 37, param0);
                    var10 = this.field_h.a(-29193, param0);
                    if (var10.field_c != 0) {
                      break L30;
                    } else {
                      if (var10.field_u != 0) {
                        break L30;
                      } else {
                        this.l(0);
                        if (var14 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                  }
                  L31: {
                    if (var10.field_n) {
                      stackOut_20_0 = 64;
                      stackIn_21_0 = stackOut_20_0;
                      break L31;
                    } else {
                      stackOut_19_0 = 128;
                      stackIn_21_0 = stackOut_19_0;
                      break L31;
                    }
                  }
                  var11 = stackIn_21_0;
                  var12 = var11 * 50;
                  var13 = this.B(0);
                  var13.a((float)(this.field_kc % var12 * var10.field_u) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_kc % var12)) / (float)var12, param2 + -50);
                  this.a(rs.field_c, param2 + 28830);
                  break L29;
                }
                var6 = var10.field_q;
                if (!this.field_fb) {
                  var9 = var10.field_d;
                  var8 = var10.field_h;
                  var7 = var10.field_j;
                  break L28;
                } else {
                  break L28;
                }
              }
            }
            this.a(2147483647, param1, var8, param3, var7, var9);
            if (null == this.field_m) {
              this.a((ed) (var5), 117);
              this.h(45, var6);
              if (var14 == 0) {
                this.field_bb = this.field_fb;
                this.field_Vb = param0;
                break L23;
              } else {
                this.field_m.a(var6, 18834, (ed) (var5));
                this.field_bb = this.field_fb;
                this.field_Vb = param0;
                break L23;
              }
            } else {
              this.field_m.a(var6, 18834, (ed) (var5));
              this.field_bb = this.field_fb;
              this.field_Vb = param0;
              break L23;
            }
          }
          this.field_ic = this.field_ic & -8;
          return;
        }
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
        Enumeration var2 = null;
        java.awt.Canvas var3_ref_java_awt_Canvas = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = this.field_Q.keys();
        L0: while (true) {
          L1: {
            if (!var2.hasMoreElements()) {
              break L1;
            } else {
              var3_ref_java_awt_Canvas = (java.awt.Canvas) (var2.nextElement());
              this.a(var3_ref_java_awt_Canvas, this.field_Q.get(var3_ref_java_awt_Canvas), 0);
              if (var4 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var3 = 82 % ((11 - param0) / 51);
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
          return;
        }
    }

    final void c(boolean param0, int param1) {
        ut discarded$6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (param1 == -32) {
          if (param0 != this.field_Bb) {
            L0: {
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (!param0) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L0;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L0;
              }
            }
            ((aw) (this)).field_Bb = stackIn_13_1 != 0;
            this.i((byte) -119);
            this.field_ic = this.field_ic & -32;
            return;
          } else {
            return;
          }
        } else {
          discarded$6 = this.g((byte) -79);
          if (param0 != this.field_Bb) {
            L1: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param0) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L1;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L1;
              }
            }
            ((aw) (this)).field_Bb = stackIn_6_1 != 0;
            this.i((byte) -119);
            this.field_ic = this.field_ic & -32;
            return;
          } else {
            return;
          }
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
        Object discarded$1 = null;
        Hashtable var2 = null;
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = new Hashtable();
        if (param0 < -26) {
          if (null != this.field_Q) {
            if (!this.field_Q.isEmpty()) {
              var3 = this.field_Q.keys();
              L0: while (true) {
                if (var3.hasMoreElements()) {
                  var4 = (java.awt.Canvas) (var3.nextElement());
                  discarded$1 = var2.put(var4, this.a(var4, 3));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    return;
                  }
                } else {
                  this.field_Q = var2;
                  this.O(5);
                  this.r((byte) 121);
                  this.y(-101);
                  this.field_yb.a(117, (aw) (this));
                  return;
                }
              }
            } else {
              this.field_Q = var2;
              this.O(5);
              this.r((byte) 121);
              this.y(-101);
              this.field_yb.a(117, (aw) (this));
              return;
            }
          } else {
            this.field_Q = var2;
            this.O(5);
            this.r((byte) 121);
            this.y(-101);
            this.field_yb.a(117, (aw) (this));
            return;
          }
        } else {
          return;
        }
    }

    private final void Z(int param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float[] var9 = null;
        if (!this.field_O) {
          var9 = this.field_eb;
          var2 = var9;
          var3 = (float)this.field_oc;
          var4 = (float)this.field_Yb;
          var5 = (float)(-this.field_Hb) * this.field_qb / (float)this.field_rc;
          var6 = (float)(-this.field_P) * this.field_qb / (float)this.field_sc;
          var7 = (float)(-this.field_P + this.field_rb) * this.field_qb / (float)this.field_sc;
          var8 = (float)(this.field_Sb - this.field_Hb) * this.field_qb / (float)this.field_rc;
          if (var6 != var7) {
            if (var5 == var8) {
              var9[9] = 0.0f;
              var9[5] = 1.0f;
              var9[3] = 0.0f;
              var9[15] = 1.0f;
              var9[6] = 0.0f;
              var9[12] = 0.0f;
              var9[14] = 0.0f;
              var9[11] = 0.0f;
              var9[7] = 0.0f;
              var9[0] = 1.0f;
              var9[8] = 0.0f;
              var9[1] = 0.0f;
              var9[13] = 0.0f;
              var9[10] = 1.0f;
              var9[2] = 0.0f;
              var9[4] = 0.0f;
              this.p(param0 + 5);
              this.field_O = true;
              if (param0 != 0) {
                discarded$5 = this.i();
                return;
              } else {
                return;
              }
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
              if (!Sumoblitz.field_L) {
                this.p(param0 + 5);
                this.field_O = true;
                if (param0 != 0) {
                  discarded$6 = this.i();
                  return;
                } else {
                  return;
                }
              } else {
                var9[9] = 0.0f;
                var9[5] = 1.0f;
                var9[3] = 0.0f;
                var9[15] = 1.0f;
                var9[6] = 0.0f;
                var9[12] = 0.0f;
                var9[14] = 0.0f;
                var9[11] = 0.0f;
                var9[7] = 0.0f;
                var9[0] = 1.0f;
                var9[8] = 0.0f;
                var9[1] = 0.0f;
                var9[13] = 0.0f;
                var9[10] = 1.0f;
                var9[2] = 0.0f;
                var9[4] = 0.0f;
                this.p(param0 + 5);
                this.field_O = true;
                if (param0 != 0) {
                  discarded$7 = this.i();
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            var9[9] = 0.0f;
            var9[5] = 1.0f;
            var9[3] = 0.0f;
            var9[15] = 1.0f;
            var9[6] = 0.0f;
            var9[12] = 0.0f;
            var9[14] = 0.0f;
            var9[11] = 0.0f;
            var9[7] = 0.0f;
            var9[0] = 1.0f;
            var9[8] = 0.0f;
            var9[1] = 0.0f;
            var9[13] = 0.0f;
            var9[10] = 1.0f;
            var9[2] = 0.0f;
            var9[4] = 0.0f;
            this.p(param0 + 5);
            this.field_O = true;
            if (param0 != 0) {
              discarded$8 = this.i();
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 == 0) {
            return;
          } else {
            discarded$9 = this.i();
            return;
          }
        }
    }

    final ef d(byte param0) {
        if (param0 == 122) {
          if (this.field_uc == null) {
            return null;
          } else {
            return this.field_uc.b(param0 ^ 37);
          }
        } else {
          aw.j((byte) 73);
          if (this.field_uc == null) {
            return null;
          } else {
            return this.field_uc.b(param0 ^ 37);
          }
        }
    }

    abstract ru a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, iw param7);

    abstract void a(int param0, boolean param1, byte param2, mi param3);

    rq d(int param0, int param1) {
        hq discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        hu[] var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 0) {
          var3 = param1;
          if (var3 != 6) {
            if ((var3 ^ -1) != -2) {
              if (2 != var3) {
                if (7 == var3) {
                  if (var4 != 0) {
                    return (rq) ((Object) new oc((aw) (this)));
                  } else {
                    return (rq) ((Object) new uo((aw) (this)));
                  }
                } else {
                  return (rq) ((Object) new ni((aw) (this)));
                }
              } else {
                return (rq) ((Object) new ib((aw) (this), this.field_Mb));
              }
            } else {
              return (rq) ((Object) new ng((aw) (this)));
            }
          } else {
            if (var4 != 0) {
              if ((var3 ^ -1) != -2) {
                if (2 != var3) {
                  if (7 != var3) {
                    return (rq) ((Object) new ni((aw) (this)));
                  } else {
                    return (rq) ((Object) new oc((aw) (this)));
                  }
                } else {
                  return (rq) ((Object) new ib((aw) (this), this.field_Mb));
                }
              } else {
                return (rq) ((Object) new ng((aw) (this)));
              }
            } else {
              return (rq) ((Object) new oc((aw) (this)));
            }
          }
        } else {
          var5 = (hu[]) null;
          discarded$1 = this.a((hu[]) null, (byte) -48);
          var3 = param1;
          if (var3 == 6) {
            if (var4 != 0) {
              if ((var3 ^ -1) != -2) {
                if (2 != var3) {
                  if (7 == var3) {
                    if (var4 != 0) {
                      return (rq) ((Object) new oc((aw) (this)));
                    } else {
                      return (rq) ((Object) new uo((aw) (this)));
                    }
                  } else {
                    return (rq) ((Object) new ni((aw) (this)));
                  }
                } else {
                  return (rq) ((Object) new ib((aw) (this), this.field_Mb));
                }
              } else {
                return (rq) ((Object) new ng((aw) (this)));
              }
            } else {
              return (rq) ((Object) new oc((aw) (this)));
            }
          } else {
            if ((var3 ^ -1) != -2) {
              if (2 != var3) {
                if (7 == var3) {
                  if (var4 != 0) {
                    return (rq) ((Object) new oc((aw) (this)));
                  } else {
                    return (rq) ((Object) new uo((aw) (this)));
                  }
                } else {
                  return (rq) ((Object) new ni((aw) (this)));
                }
              } else {
                return (rq) ((Object) new ib((aw) (this), this.field_Mb));
              }
            } else {
              return (rq) ((Object) new ng((aw) (this)));
            }
          }
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
        var2 = 115 / ((39 - param0) / 47);
        if (!this.field_Jb) {
          var10 = this.field_ec;
          var9 = var10;
          var3 = var9;
          var4 = (float)(this.field_oc * -this.field_P) / (float)this.field_sc;
          var5 = (float)(this.field_oc * (-this.field_P + this.field_rb)) / (float)this.field_sc;
          var6 = (float)(this.field_Hb * this.field_oc) / (float)this.field_rc;
          var7 = (float)(this.field_oc * (this.field_Hb + -this.field_Sb)) / (float)this.field_rc;
          if (var5 == var4) {
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
            if (Sumoblitz.field_L) {
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
              this.m((byte) -83);
              this.field_Jb = true;
              return;
            } else {
              this.m((byte) -83);
              this.field_Jb = true;
              return;
            }
          } else {
            if (var7 == var6) {
              L0: {
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
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
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
                  break L0;
                }
              }
              this.m((byte) -83);
              this.field_Jb = true;
              return;
            } else {
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
              this.m((byte) -83);
              this.field_Jb = true;
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        field_t = new tf();
    }
}
