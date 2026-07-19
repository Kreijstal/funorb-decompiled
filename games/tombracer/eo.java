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
        int var7 = 0;
        float var8 = 0.0f;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (this.field_Tb == param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        if (var7 == 0) {
          if (param1 == this.field_j) {
            if (param2 != this.field_pc) {
              L1: {
                this.field_j = param1;
                this.field_pc = param2;
                this.field_Tb = param0;
                if (var7 != 0) {
                  this.field_Kb = (float)(255 & this.field_Tb) / 255.0f;
                  this.field_sc = (float)(16711680 & this.field_Tb) / 16711680.0f;
                  this.field_yb = (float)(65280 & this.field_Tb) / 65280.0f;
                  this.r(0);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_P.setSunColour(this.field_sc, this.field_yb, this.field_Kb, param1, param2);
              this.v(86);
              if (this.field_Eb[0] == param3) {
                if (param4 != this.field_Eb[1]) {
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
                  this.q((byte) -78);
                  return;
                } else {
                  L2: {
                    if (this.field_Eb[2] != param5) {
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
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.q((byte) -78);
                  return;
                }
              } else {
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
                this.q((byte) -78);
                return;
              }
            } else {
              L3: {
                L4: {
                  if (this.field_Eb[0] != param3) {
                    break L4;
                  } else {
                    if (param4 != this.field_Eb[1]) {
                      break L4;
                    } else {
                      if (this.field_Eb[2] != param5) {
                        break L4;
                      } else {
                        break L3;
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
                break L3;
              }
              this.q((byte) -78);
              return;
            }
          } else {
            L5: {
              this.field_j = param1;
              this.field_pc = param2;
              this.field_Tb = param0;
              if (var7 != 0) {
                this.field_Kb = (float)(255 & this.field_Tb) / 255.0f;
                this.field_sc = (float)(16711680 & this.field_Tb) / 16711680.0f;
                this.field_yb = (float)(65280 & this.field_Tb) / 65280.0f;
                this.r(0);
                break L5;
              } else {
                break L5;
              }
            }
            this.field_P.setSunColour(this.field_sc, this.field_yb, this.field_Kb, param1, param2);
            this.v(86);
            if (this.field_Eb[0] == param3) {
              if (param4 != this.field_Eb[1]) {
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
                this.q((byte) -78);
                return;
              } else {
                L6: {
                  if (this.field_Eb[2] != param5) {
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
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.q((byte) -78);
                return;
              }
            } else {
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
              this.q((byte) -78);
              return;
            }
          }
        } else {
          L7: {
            this.field_j = param1;
            this.field_pc = param2;
            this.field_Tb = param0;
            if (var7 != 0) {
              this.field_Kb = (float)(255 & this.field_Tb) / 255.0f;
              this.field_sc = (float)(16711680 & this.field_Tb) / 16711680.0f;
              this.field_yb = (float)(65280 & this.field_Tb) / 65280.0f;
              this.r(0);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            L9: {
              this.field_P.setSunColour(this.field_sc, this.field_yb, this.field_Kb, param1, param2);
              this.v(86);
              if (this.field_Eb[0] != param3) {
                break L9;
              } else {
                if (param4 != this.field_Eb[1]) {
                  break L9;
                } else {
                  if (this.field_Eb[2] != param5) {
                    break L9;
                  } else {
                    break L8;
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
            break L8;
          }
          this.q((byte) -78);
          return;
        }
    }

    abstract void a(fp param0, int param1, boolean param2, int param3);

    abstract void h(boolean param0);

    final void j(byte param0) {
        if (param0 != 102) {
          L0: {
            this.field_o = (jaclib.memory.heap.NativeHeapBuffer) null;
            if (this.field_rb != 16) {
              this.G(22);
              this.b(true, -69);
              this.f(0, true);
              this.b(true, (byte) 81);
              this.c(1, 1);
              this.field_rb = 16;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_rb != 16) {
              this.G(22);
              this.b(true, -69);
              this.f(0, true);
              this.b(true, (byte) 81);
              this.c(1, 1);
              this.field_rb = 16;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void J(int param0) {
        mla var2 = null;
        if (this.field_r == nr.field_d) {
          if (param0 == 19822) {
            return;
          } else {
            this.r(87);
            return;
          }
        } else {
          var2 = this.field_r;
          this.field_r = nr.field_d;
          if (!var2.a(-101)) {
            this.P(0);
            this.field_T = this.field_Lb;
            this.l((byte) 26);
            this.field_rb = this.field_rb & -25;
            if (param0 == 19822) {
              return;
            } else {
              this.r(87);
              return;
            }
          } else {
            this.v((byte) 94);
            this.P(0);
            this.field_T = this.field_Lb;
            this.l((byte) 26);
            this.field_rb = this.field_rb & -25;
            if (param0 == 19822) {
              return;
            } else {
              this.r(87);
              return;
            }
          }
        }
    }

    final za a(int param0) {
        to var2 = new to(param0);
        this.field_ic.b((byte) -68, var2);
        return (za) ((Object) var2);
    }

    final void c(int param0, int param1) {
        gb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == this.field_wb) {
          if (param1 == 1) {
            return;
          } else {
            this.field_fc = 1.0839076042175293f;
            return;
          }
        } else {
          L0: {
            L1: {
              if (1 == param0) {
                break L1;
              } else {
                L2: {
                  if (2 == param0) {
                    break L2;
                  } else {
                    L3: {
                      if ((param0 ^ -1) != -129) {
                        break L3;
                      } else {
                        var5 = 1;
                        var4 = 1;
                        var3 = bma.field_w;
                        if (var6 == 0) {
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 = 0;
                    var5 = 0;
                    var3 = vv.field_q;
                    if (var6 == 0) {
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = 1;
                var5 = 0;
                var3 = mp.field_a;
                if (var6 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var3 = dfa.field_b;
            var5 = 1;
            var4 = 1;
            break L0;
          }
          L4: {
            if (var5 != 0) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          if (stackIn_11_0 != (this.field_m ? 1 : 0)) {
            L5: {
              if (var4 != (this.field_Yb ? 1 : 0)) {
                L6: {
                  stackOut_32_0 = this;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if (var4 == 0) {
                    stackOut_34_0 = this;
                    stackOut_34_1 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L6;
                  } else {
                    stackOut_33_0 = this;
                    stackOut_33_1 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    break L6;
                  }
                }
                ((eo) (this)).field_Yb = stackIn_35_1 != 0;
                this.M(-27581);
                break L5;
              } else {
                break L5;
              }
            }
            if (var3 == this.field_lb) {
              this.field_rb = this.field_rb & -29;
              this.field_wb = param0;
              if (param1 == 1) {
                return;
              } else {
                this.field_fc = 1.0839076042175293f;
                return;
              }
            } else {
              this.field_lb = var3;
              this.b(false);
              this.field_rb = this.field_rb & -29;
              this.field_wb = param0;
              if (param1 == 1) {
                return;
              } else {
                this.field_fc = 1.0839076042175293f;
                return;
              }
            }
          } else {
            L7: {
              stackOut_12_0 = this;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (var5 == 0) {
                stackOut_14_0 = this;
                stackOut_14_1 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L7;
              } else {
                stackOut_13_0 = this;
                stackOut_13_1 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                break L7;
              }
            }
            L8: {
              ((eo) (this)).field_m = stackIn_15_1 != 0;
              this.w(param1 ^ -128);
              if (var4 != (this.field_Yb ? 1 : 0)) {
                L9: {
                  stackOut_17_0 = this;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var4 == 0) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L9;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L9;
                  }
                }
                ((eo) (this)).field_Yb = stackIn_20_1 != 0;
                this.M(-27581);
                break L8;
              } else {
                break L8;
              }
            }
            if (var3 == this.field_lb) {
              this.field_rb = this.field_rb & -29;
              this.field_wb = param0;
              if (param1 == 1) {
                return;
              } else {
                this.field_fc = 1.0839076042175293f;
                return;
              }
            } else {
              this.field_lb = var3;
              this.b(false);
              this.field_rb = this.field_rb & -29;
              this.field_wb = param0;
              if (param1 == 1) {
                return;
              } else {
                this.field_fc = 1.0839076042175293f;
                return;
              }
            }
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
        int var3 = 0;
        Enumeration var4 = null;
        java.awt.Canvas var7 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!this.field_Fc) {
          var1 = this.field_ic.f(-80);
          L0: while (true) {
            if (var1 == null) {
              var4 = this.field_oc.keys();
              var1_ref = var4;
              L1: while (true) {
                if (var4.hasMoreElements()) {
                  var7 = (java.awt.Canvas) (var4.nextElement());
                  this.a(this.field_oc.get(var7), false, var7);
                  if (var3 != 0) {
                    this.field_Fc = true;
                    return;
                  } else {
                    continue L1;
                  }
                } else {
                  rpa.a(true, false, true);
                  this.field_P.release();
                  this.field_Fc = true;
                  return;
                }
              }
            } else {
              ((to) ((Object) var1)).b((byte) 30);
              var1 = this.field_ic.e(110);
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

    abstract void w(int param0);

    final gda b() {
        return (gda) ((Object) new asa());
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = 14 % ((param0 - 61) / 46);
        if (-2 == (param1 ^ -1)) {
          this.a(ln.field_F, (byte) -110, ln.field_F);
          if (var4 != 0) {
            if (-1 != (param1 ^ -1)) {
              if (-3 != (param1 ^ -1)) {
                if (-4 != (param1 ^ -1)) {
                  if (-5 == (param1 ^ -1)) {
                    this.a(gq.field_w, (byte) -110, gq.field_w);
                    if (var4 == 0) {
                      return;
                    } else {
                      this.a(ln.field_F, (byte) -110, r.field_m);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  this.a(iw.field_c, (byte) -110, jv.field_m);
                  if (var4 != 0) {
                    L0: {
                      if (-5 != (param1 ^ -1)) {
                        break L0;
                      } else {
                        this.a(gq.field_w, (byte) -110, gq.field_w);
                        this.a(ln.field_F, (byte) -110, r.field_m);
                        break L0;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.a(ln.field_F, (byte) -110, r.field_m);
                return;
              }
            } else {
              L1: {
                this.a(iw.field_c, (byte) -110, iw.field_c);
                if (-3 == (param1 ^ -1)) {
                  this.a(ln.field_F, (byte) -110, r.field_m);
                  break L1;
                } else {
                  L2: {
                    if (-4 != (param1 ^ -1)) {
                      break L2;
                    } else {
                      this.a(iw.field_c, (byte) -110, jv.field_m);
                      break L2;
                    }
                  }
                  if (-5 != (param1 ^ -1)) {
                    break L1;
                  } else {
                    this.a(gq.field_w, (byte) -110, gq.field_w);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      this.a(ln.field_F, (byte) -110, r.field_m);
                      break L1;
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          if (-1 != (param1 ^ -1)) {
            if (-3 != (param1 ^ -1)) {
              if (-4 != (param1 ^ -1)) {
                if (-5 == (param1 ^ -1)) {
                  this.a(gq.field_w, (byte) -110, gq.field_w);
                  if (var4 != 0) {
                    this.a(ln.field_F, (byte) -110, r.field_m);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.a(iw.field_c, (byte) -110, jv.field_m);
                if (var4 != 0) {
                  L3: {
                    if (-5 != (param1 ^ -1)) {
                      break L3;
                    } else {
                      this.a(gq.field_w, (byte) -110, gq.field_w);
                      this.a(ln.field_F, (byte) -110, r.field_m);
                      break L3;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.a(ln.field_F, (byte) -110, r.field_m);
              return;
            }
          } else {
            this.a(iw.field_c, (byte) -110, iw.field_c);
            if (var4 != 0) {
              L4: {
                if (-3 == (param1 ^ -1)) {
                  this.a(ln.field_F, (byte) -110, r.field_m);
                  break L4;
                } else {
                  L5: {
                    if (-4 != (param1 ^ -1)) {
                      break L5;
                    } else {
                      this.a(iw.field_c, (byte) -110, jv.field_m);
                      break L5;
                    }
                  }
                  if (-5 != (param1 ^ -1)) {
                    break L4;
                  } else {
                    this.a(gq.field_w, (byte) -110, gq.field_w);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      this.a(ln.field_F, (byte) -110, r.field_m);
                      break L4;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    abstract void I(int param0);

    abstract boolean a(una param0, int param1, ft param2);

    final void H(int param0) {
        if (4 == this.field_rb) {
          if (param0 < -104) {
            return;
          } else {
            this.field_peer = 17L;
            return;
          }
        } else {
          this.J(19822);
          this.b(false, -52);
          this.d(0, false);
          this.f(0, false);
          this.b(false, (byte) 81);
          this.a((byte) -80, false, false, -2);
          this.c(1, 1);
          this.a((byte) -68, 0);
          this.field_rb = 4;
          if (param0 < -104) {
            return;
          } else {
            this.field_peer = 17L;
            return;
          }
        }
    }

    final void a(float param0, int param1) {
        if (param1 != -229) {
          L0: {
            this.field_cb = (qm) null;
            if (param0 != this.field_Pb) {
              this.field_Pb = param0;
              this.R(param1 ^ -229);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 != this.field_Pb) {
              this.field_Pb = param0;
              this.R(param1 ^ -229);
              break L1;
            } else {
              break L1;
            }
          }
          return;
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          if (this.field_l != param1) {
            L1: {
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (!param1) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ((eo) (this)).field_l = stackIn_5_1 != 0;
            this.h((byte) -102);
            this.field_rb = this.field_rb & -8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 0) {
          return;
        } else {
          this.field_Pb = 0.3918037712574005f;
          return;
        }
    }

    abstract eja a(int param0, boolean param1);

    abstract void q(byte param0);

    private final void l(byte param0) {
        if (param0 != 26) {
          L0: {
            this.field_Yb = true;
            this.e((byte) 119);
            if (null != this.field_pb) {
              this.field_pb.b(param0 + 62);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            this.e((byte) 119);
            if (null != this.field_pb) {
              this.field_pb.b(param0 + 62);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void b(boolean param0, byte param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          if (this.field_qc != param0) {
            L1: {
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (!param0) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ((eo) (this)).field_qc = stackIn_5_1 != 0;
            this.b((byte) -128);
            this.field_rb = this.field_rb & -32;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 81) {
          return;
        } else {
          this.field_e = 64;
          return;
        }
    }

    private final void j(int param0) {
        if (param0 != -30801) {
          return;
        } else {
          this.field_R[10] = this.field_lc;
          this.field_R[14] = this.field_G;
          this.field_d = ((float)(-this.field_k) + this.field_R[14]) / this.field_R[10];
          return;
        }
    }

    final void F(int param0) {
        this.field_gb = false;
        if (param0 != -1662) {
            this.field_Wb = true;
            this.o(16);
            return;
        }
        this.o(16);
    }

    final nh a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        gh stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_0_0 = null;
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
            stackOut_0_0 = new gh((eo) (this), param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("eo.C(");
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

    final void O(int param0) {
        mla var2 = null;
        if (param0 != 256) {
          L0: {
            this.j(-116);
            if (tb.field_p != this.field_r) {
              L1: {
                var2 = this.field_r;
                this.field_r = tb.field_p;
                if (var2.a(-65)) {
                  this.v((byte) 94);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_rb = this.field_rb & -32;
              this.field_T = this.field_vc;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (tb.field_p != this.field_r) {
              L3: {
                var2 = this.field_r;
                this.field_r = tb.field_p;
                if (var2.a(-65)) {
                  this.v((byte) 94);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_rb = this.field_rb & -32;
              this.field_T = this.field_vc;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.a(param0, param1, param0 + param2, param1, param3, param4);
    }

    private final void o(int param0) {
        float var2 = 0.0f;
        if (param0 != 16) {
          L0: {
            this.b(107);
            if (nr.field_d != this.field_r) {
              break L0;
            } else {
              var2 = this.c((byte) -61);
              this.field_q.a(var2, param0 ^ -128, var2, 0.0f);
              break L0;
            }
          }
          L1: {
            this.field_p = false;
            this.z((byte) -73);
            if (this.field_pb != null) {
              this.field_pb.b((byte) 107);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (nr.field_d != this.field_r) {
              break L2;
            } else {
              var2 = this.c((byte) -61);
              this.field_q.a(var2, param0 ^ -128, var2, 0.0f);
              break L2;
            }
          }
          L3: {
            this.field_p = false;
            this.z((byte) -73);
            if (this.field_pb != null) {
              this.field_pb.b((byte) 107);
              break L3;
            } else {
              break L3;
            }
          }
          return;
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
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int[] var9 = null;
        float[] var10 = null;
        if (!this.field_ab) {
          var10 = this.field_Ib;
          var2 = var10;
          var3 = (float)this.field_D;
          var4 = (float)this.field_k;
          var5 = (float)(-this.field_kc) * this.field_Pb / (float)this.field_h;
          var6 = this.field_Pb * (float)(-this.field_Q) / (float)this.field_Ic;
          var7 = (float)(-this.field_Q + this.field_Hb) * this.field_Pb / (float)this.field_Ic;
          var8 = (float)(-this.field_kc + this.field_jc) * this.field_Pb / (float)this.field_h;
          if (var6 == var7) {
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
            if (!TombRacer.field_G) {
              this.L(param0 + -73);
              this.field_ab = true;
              if (param0 == 83) {
                return;
              } else {
                var9 = (int[]) null;
                this.da(-58, 96, -43, (int[]) null);
                return;
              }
            } else {
              var10[11] = 0.0f;
              var10[6] = 0.0f;
              var10[12] = (var7 + var6) / (var6 - var7);
              var10[10] = 1.0f / (var3 - var4);
              var10[9] = 0.0f;
              var10[14] = var3 / (var3 - var4);
              var10[0] = 2.0f / (-var6 + var7);
              var10[3] = 0.0f;
              var10[1] = 0.0f;
              var10[4] = 0.0f;
              var10[7] = 0.0f;
              var10[15] = 1.0f;
              var10[5] = 2.0f / (-var5 + var8);
              var10[2] = 0.0f;
              var10[8] = 0.0f;
              var10[13] = (var8 + var5) / (var8 - var5);
              this.L(param0 + -73);
              this.field_ab = true;
              if (param0 == 83) {
                return;
              } else {
                var9 = (int[]) null;
                this.da(-58, 96, -43, (int[]) null);
                return;
              }
            }
          } else {
            if (var8 != var5) {
              var10[11] = 0.0f;
              var10[6] = 0.0f;
              var10[12] = (var7 + var6) / (var6 - var7);
              var10[10] = 1.0f / (var3 - var4);
              var10[9] = 0.0f;
              var10[14] = var3 / (var3 - var4);
              var10[0] = 2.0f / (-var6 + var7);
              var10[3] = 0.0f;
              var10[1] = 0.0f;
              var10[4] = 0.0f;
              var10[7] = 0.0f;
              var10[15] = 1.0f;
              var10[5] = 2.0f / (-var5 + var8);
              var10[2] = 0.0f;
              var10[8] = 0.0f;
              var10[13] = (var8 + var5) / (var8 - var5);
              this.L(param0 + -73);
              this.field_ab = true;
              if (param0 == 83) {
                return;
              } else {
                var9 = (int[]) null;
                this.da(-58, 96, -43, (int[]) null);
                return;
              }
            } else {
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
              if (!TombRacer.field_G) {
                this.L(param0 + -73);
                this.field_ab = true;
                if (param0 == 83) {
                  return;
                } else {
                  var9 = (int[]) null;
                  this.da(-58, 96, -43, (int[]) null);
                  return;
                }
              } else {
                var10[11] = 0.0f;
                var10[6] = 0.0f;
                var10[12] = (var7 + var6) / (var6 - var7);
                var10[10] = 1.0f / (var3 - var4);
                var10[9] = 0.0f;
                var10[14] = var3 / (var3 - var4);
                var10[0] = 2.0f / (-var6 + var7);
                var10[3] = 0.0f;
                var10[1] = 0.0f;
                var10[4] = 0.0f;
                var10[7] = 0.0f;
                var10[15] = 1.0f;
                var10[5] = 2.0f / (-var5 + var8);
                var10[2] = 0.0f;
                var10[8] = 0.0f;
                var10[13] = (var8 + var5) / (var8 - var5);
                this.L(param0 + -73);
                this.field_ab = true;
                if (param0 == 83) {
                  return;
                } else {
                  var9 = (int[]) null;
                  this.da(-58, 96, -43, (int[]) null);
                  return;
                }
              }
            }
          }
        } else {
          if (param0 == 83) {
            return;
          } else {
            var9 = (int[]) null;
            this.da(-58, 96, -43, (int[]) null);
            return;
          }
        }
    }

    private final void L(int param0) {
        int[] var3 = null;
        this.field_Cb = (float)this.field_k;
        if (param0 == 10) {
          return;
        } else {
          var3 = (int[]) null;
          this.da(-108, 67, -5, (int[]) null);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
    }

    final gf a(boolean param0, int param1, boolean param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        gf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        gf stackOut_2_0 = null;
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
              if (param0) {
                break L1;
              } else {
                this.c(-115);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param4, 0, param2, param3, 0, param1, 75);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var6);
            stackOut_4_1 = new StringBuilder().append("eo.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final asa E(int param0) {
        if (param0 < 1) {
            this.field_Jb = (iva) null;
            return this.field_Qb;
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
        if (this.field_rb == 8) {
          if (param0 == 11) {
            return;
          } else {
            field_w = (fta) null;
            return;
          }
        } else {
          this.A((byte) -74);
          this.b(true, -91);
          this.f(0, true);
          this.b(true, (byte) 81);
          this.c(1, 1);
          this.field_rb = 8;
          if (param0 == 11) {
            return;
          } else {
            field_w = (fta) null;
            return;
          }
        }
    }

    abstract void f(int param0);

    abstract void a(dn param0, byte param1);

    abstract void a(Object param0, boolean param1, java.awt.Canvas param2);

    private final void P(int param0) {
        float[] var2 = null;
        float[] var3 = null;
        if (param0 == 0) {
          if (!this.field_zb) {
            var3 = this.field_Lb;
            var2 = var3;
            this.field_zb = true;
            if (0 != this.field_Hb) {
              if (-1 != (this.field_jc ^ -1)) {
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
                if (TombRacer.field_G) {
                  var3[10] = 1.0f;
                  var3[11] = 0.0f;
                  var3[6] = 0.0f;
                  var3[13] = 0.0f;
                  var3[5] = 1.0f;
                  var3[4] = 0.0f;
                  var3[2] = 0.0f;
                  var3[15] = 1.0f;
                  var3[12] = 0.0f;
                  var3[7] = 0.0f;
                  var3[3] = 0.0f;
                  var3[14] = 0.0f;
                  var3[1] = 0.0f;
                  var3[8] = 0.0f;
                  var3[9] = 0.0f;
                  var3[0] = 1.0f;
                  return;
                } else {
                  return;
                }
              } else {
                var3[10] = 1.0f;
                var3[11] = 0.0f;
                var3[6] = 0.0f;
                var3[13] = 0.0f;
                var3[5] = 1.0f;
                var3[4] = 0.0f;
                var3[2] = 0.0f;
                var3[15] = 1.0f;
                var3[12] = 0.0f;
                var3[7] = 0.0f;
                var3[3] = 0.0f;
                var3[14] = 0.0f;
                var3[1] = 0.0f;
                var3[8] = 0.0f;
                var3[9] = 0.0f;
                var3[0] = 1.0f;
                return;
              }
            } else {
              var3[10] = 1.0f;
              var3[11] = 0.0f;
              var3[6] = 0.0f;
              var3[13] = 0.0f;
              var3[5] = 1.0f;
              var3[4] = 0.0f;
              var3[2] = 0.0f;
              var3[15] = 1.0f;
              var3[12] = 0.0f;
              var3[7] = 0.0f;
              var3[3] = 0.0f;
              var3[14] = 0.0f;
              var3[1] = 0.0f;
              var3[8] = 0.0f;
              var3[9] = 0.0f;
              var3[0] = 1.0f;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_223_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        param4 = param4 & this.p(-112);
        if (param5 == -25) {
          L0: {
            if (param4) {
              break L0;
            } else {
              if ((param0 ^ -1) != -5) {
                if (8 != param0) {
                  if (-10 == (param0 ^ -1)) {
                    L1: {
                      param0 = 2;
                      if ((param0 ^ -1) != -5) {
                        stackOut_222_0 = 1;
                        stackIn_223_0 = stackOut_222_0;
                        break L1;
                      } else {
                        stackOut_221_0 = param1 & 1;
                        stackIn_223_0 = stackOut_221_0;
                        break L1;
                      }
                    }
                    param2 = stackIn_223_0;
                    param1 = 0;
                    break L0;
                  } else {
                    L2: {
                      if (param0 == 0) {
                        break L2;
                      } else {
                        if (param3) {
                          param0 = param0 | -2147483648;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      L4: {
                        if (this.field_qb == param0) {
                          break L4;
                        } else {
                          L5: {
                            if (0 == this.field_qb) {
                              break L5;
                            } else {
                              this.field_sb[this.field_qb & 2147483647].a(-79);
                              break L5;
                            }
                          }
                          L6: {
                            if (param0 == 0) {
                              this.field_pb = null;
                              break L6;
                            } else {
                              this.field_pb = this.field_sb[2147483647 & param0];
                              this.field_pb.a(-112, param3);
                              this.field_pb.a(param3, 5744);
                              this.field_pb.a((byte) 55, param1, param2);
                              if (var8 == 0) {
                                break L6;
                              } else {
                                this.field_pb = null;
                                break L6;
                              }
                            }
                          }
                          this.field_qb = param0;
                          this.field_Rb = param2;
                          this.field_Lc = param1;
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (this.field_qb == 0) {
                        break L3;
                      } else {
                        L7: {
                          this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                          if (this.field_Lc != param1) {
                            break L7;
                          } else {
                            if (this.field_Rb != param2) {
                              break L7;
                            } else {
                              break L3;
                            }
                          }
                        }
                        this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                        this.field_Rb = param2;
                        this.field_Lc = param1;
                        break L3;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    param0 = 2;
                    if ((param0 ^ -1) != -5) {
                      stackOut_141_0 = 1;
                      stackIn_142_0 = stackOut_141_0;
                      break L8;
                    } else {
                      stackOut_140_0 = param1 & 1;
                      stackIn_142_0 = stackOut_140_0;
                      break L8;
                    }
                  }
                  L9: {
                    param2 = stackIn_142_0;
                    param1 = 0;
                    if (param0 == 0) {
                      break L9;
                    } else {
                      if (param3) {
                        param0 = param0 | -2147483648;
                        break L9;
                      } else {
                        L10: {
                          L11: {
                            if (this.field_qb == param0) {
                              break L11;
                            } else {
                              L12: {
                                if (0 == this.field_qb) {
                                  break L12;
                                } else {
                                  this.field_sb[this.field_qb & 2147483647].a(-79);
                                  break L12;
                                }
                              }
                              L13: {
                                if (param0 == 0) {
                                  this.field_pb = null;
                                  break L13;
                                } else {
                                  this.field_pb = this.field_sb[2147483647 & param0];
                                  this.field_pb.a(-112, param3);
                                  this.field_pb.a(param3, 5744);
                                  this.field_pb.a((byte) 55, param1, param2);
                                  if (var8 == 0) {
                                    break L13;
                                  } else {
                                    this.field_pb = null;
                                    break L13;
                                  }
                                }
                              }
                              this.field_qb = param0;
                              this.field_Rb = param2;
                              this.field_Lc = param1;
                              if (var8 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (this.field_qb == 0) {
                            break L10;
                          } else {
                            L14: {
                              this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                              if (this.field_Lc != param1) {
                                break L14;
                              } else {
                                if (this.field_Rb != param2) {
                                  break L14;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                            this.field_Rb = param2;
                            this.field_Lc = param1;
                            break L10;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L15: {
                    if (this.field_qb == param0) {
                      break L15;
                    } else {
                      if (0 == this.field_qb) {
                        if (param0 == 0) {
                          L16: {
                            this.field_pb = null;
                            this.field_qb = param0;
                            this.field_Rb = param2;
                            this.field_Lc = param1;
                            if (var8 == 0) {
                              break L16;
                            } else {
                              if (this.field_qb == 0) {
                                break L16;
                              } else {
                                L17: {
                                  this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                                  if (this.field_Lc != param1) {
                                    break L17;
                                  } else {
                                    if (this.field_Rb != param2) {
                                      break L17;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                                this.field_Rb = param2;
                                this.field_Lc = param1;
                                break L16;
                              }
                            }
                          }
                          return;
                        } else {
                          this.field_pb = this.field_sb[2147483647 & param0];
                          this.field_pb.a(-112, param3);
                          this.field_pb.a(param3, 5744);
                          this.field_pb.a((byte) 55, param1, param2);
                          if (var8 == 0) {
                            this.field_qb = param0;
                            this.field_Rb = param2;
                            this.field_Lc = param1;
                            if (var8 != 0) {
                              break L15;
                            } else {
                              return;
                            }
                          } else {
                            L18: {
                              this.field_pb = null;
                              this.field_qb = param0;
                              this.field_Rb = param2;
                              this.field_Lc = param1;
                              if (var8 == 0) {
                                break L18;
                              } else {
                                if (this.field_qb == 0) {
                                  break L18;
                                } else {
                                  L19: {
                                    this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                                    if (this.field_Lc != param1) {
                                      break L19;
                                    } else {
                                      if (this.field_Rb != param2) {
                                        break L19;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                                  this.field_Rb = param2;
                                  this.field_Lc = param1;
                                  break L18;
                                }
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        L20: {
                          this.field_sb[this.field_qb & 2147483647].a(-79);
                          if (param0 == 0) {
                            this.field_pb = null;
                            break L20;
                          } else {
                            this.field_pb = this.field_sb[2147483647 & param0];
                            this.field_pb.a(-112, param3);
                            this.field_pb.a(param3, 5744);
                            this.field_pb.a((byte) 55, param1, param2);
                            if (var8 == 0) {
                              break L20;
                            } else {
                              this.field_pb = null;
                              break L20;
                            }
                          }
                        }
                        L21: {
                          this.field_qb = param0;
                          this.field_Rb = param2;
                          this.field_Lc = param1;
                          if (var8 == 0) {
                            break L21;
                          } else {
                            if (this.field_qb == 0) {
                              break L21;
                            } else {
                              L22: {
                                this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                                if (this.field_Lc != param1) {
                                  break L22;
                                } else {
                                  if (this.field_Rb != param2) {
                                    break L22;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                              this.field_Rb = param2;
                              this.field_Lc = param1;
                              break L21;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (this.field_qb != 0) {
                    L23: {
                      this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                      if (this.field_Lc != param1) {
                        break L23;
                      } else {
                        if (this.field_Rb != param2) {
                          break L23;
                        } else {
                          return;
                        }
                      }
                    }
                    this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                    this.field_Rb = param2;
                    this.field_Lc = param1;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L24: {
                  param0 = 2;
                  if ((param0 ^ -1) != -5) {
                    stackOut_79_0 = 1;
                    stackIn_80_0 = stackOut_79_0;
                    break L24;
                  } else {
                    stackOut_78_0 = param1 & 1;
                    stackIn_80_0 = stackOut_78_0;
                    break L24;
                  }
                }
                L25: {
                  param2 = stackIn_80_0;
                  param1 = 0;
                  if (param0 == 0) {
                    break L25;
                  } else {
                    if (param3) {
                      param0 = param0 | -2147483648;
                      break L25;
                    } else {
                      L26: {
                        L27: {
                          if (this.field_qb == param0) {
                            break L27;
                          } else {
                            L28: {
                              if (0 == this.field_qb) {
                                break L28;
                              } else {
                                this.field_sb[this.field_qb & 2147483647].a(-79);
                                break L28;
                              }
                            }
                            L29: {
                              if (param0 == 0) {
                                this.field_pb = null;
                                break L29;
                              } else {
                                this.field_pb = this.field_sb[2147483647 & param0];
                                this.field_pb.a(-112, param3);
                                this.field_pb.a(param3, 5744);
                                this.field_pb.a((byte) 55, param1, param2);
                                if (var8 == 0) {
                                  break L29;
                                } else {
                                  this.field_pb = null;
                                  break L29;
                                }
                              }
                            }
                            this.field_qb = param0;
                            this.field_Rb = param2;
                            this.field_Lc = param1;
                            if (var8 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        if (this.field_qb == 0) {
                          break L26;
                        } else {
                          L30: {
                            this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                            if (this.field_Lc != param1) {
                              break L30;
                            } else {
                              if (this.field_Rb != param2) {
                                break L30;
                              } else {
                                break L26;
                              }
                            }
                          }
                          this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                          this.field_Rb = param2;
                          this.field_Lc = param1;
                          break L26;
                        }
                      }
                      return;
                    }
                  }
                }
                L31: {
                  if (this.field_qb == param0) {
                    break L31;
                  } else {
                    if (0 == this.field_qb) {
                      if (param0 == 0) {
                        L32: {
                          this.field_pb = null;
                          this.field_qb = param0;
                          this.field_Rb = param2;
                          this.field_Lc = param1;
                          if (var8 == 0) {
                            break L32;
                          } else {
                            if (this.field_qb == 0) {
                              break L32;
                            } else {
                              L33: {
                                this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                                if (this.field_Lc != param1) {
                                  break L33;
                                } else {
                                  if (this.field_Rb != param2) {
                                    break L33;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                              this.field_Rb = param2;
                              this.field_Lc = param1;
                              break L32;
                            }
                          }
                        }
                        return;
                      } else {
                        this.field_pb = this.field_sb[2147483647 & param0];
                        this.field_pb.a(-112, param3);
                        this.field_pb.a(param3, 5744);
                        this.field_pb.a((byte) 55, param1, param2);
                        if (var8 == 0) {
                          this.field_qb = param0;
                          this.field_Rb = param2;
                          this.field_Lc = param1;
                          if (var8 != 0) {
                            break L31;
                          } else {
                            return;
                          }
                        } else {
                          L34: {
                            this.field_pb = null;
                            this.field_qb = param0;
                            this.field_Rb = param2;
                            this.field_Lc = param1;
                            if (var8 == 0) {
                              break L34;
                            } else {
                              if (this.field_qb == 0) {
                                break L34;
                              } else {
                                L35: {
                                  this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                                  if (this.field_Lc != param1) {
                                    break L35;
                                  } else {
                                    if (this.field_Rb != param2) {
                                      break L35;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                                this.field_Rb = param2;
                                this.field_Lc = param1;
                                break L34;
                              }
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L36: {
                        this.field_sb[this.field_qb & 2147483647].a(-79);
                        if (param0 == 0) {
                          this.field_pb = null;
                          break L36;
                        } else {
                          this.field_pb = this.field_sb[2147483647 & param0];
                          this.field_pb.a(-112, param3);
                          this.field_pb.a(param3, 5744);
                          this.field_pb.a((byte) 55, param1, param2);
                          if (var8 == 0) {
                            break L36;
                          } else {
                            this.field_pb = null;
                            break L36;
                          }
                        }
                      }
                      L37: {
                        this.field_qb = param0;
                        this.field_Rb = param2;
                        this.field_Lc = param1;
                        if (var8 == 0) {
                          break L37;
                        } else {
                          if (this.field_qb == 0) {
                            break L37;
                          } else {
                            L38: {
                              this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                              if (this.field_Lc != param1) {
                                break L38;
                              } else {
                                if (this.field_Rb != param2) {
                                  break L38;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                            this.field_Rb = param2;
                            this.field_Lc = param1;
                            break L37;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (this.field_qb != 0) {
                  L39: {
                    this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                    if (this.field_Lc != param1) {
                      break L39;
                    } else {
                      if (this.field_Rb != param2) {
                        break L39;
                      } else {
                        return;
                      }
                    }
                  }
                  this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                  this.field_Rb = param2;
                  this.field_Lc = param1;
                  return;
                } else {
                  return;
                }
              }
            }
          }
          L40: {
            if (param0 == 0) {
              break L40;
            } else {
              if (param3) {
                param0 = param0 | -2147483648;
                break L40;
              } else {
                L41: {
                  if (this.field_qb == param0) {
                    break L41;
                  } else {
                    L42: {
                      if (0 == this.field_qb) {
                        break L42;
                      } else {
                        this.field_sb[this.field_qb & 2147483647].a(-79);
                        break L42;
                      }
                    }
                    L43: {
                      if (param0 == 0) {
                        this.field_pb = null;
                        break L43;
                      } else {
                        this.field_pb = this.field_sb[2147483647 & param0];
                        this.field_pb.a(-112, param3);
                        this.field_pb.a(param3, 5744);
                        this.field_pb.a((byte) 55, param1, param2);
                        if (var8 == 0) {
                          break L43;
                        } else {
                          this.field_pb = null;
                          break L43;
                        }
                      }
                    }
                    this.field_qb = param0;
                    this.field_Rb = param2;
                    this.field_Lc = param1;
                    if (var8 != 0) {
                      break L41;
                    } else {
                      return;
                    }
                  }
                }
                if (this.field_qb != 0) {
                  L44: {
                    this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                    if (this.field_Lc != param1) {
                      break L44;
                    } else {
                      if (this.field_Rb != param2) {
                        break L44;
                      } else {
                        return;
                      }
                    }
                  }
                  this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                  this.field_Rb = param2;
                  this.field_Lc = param1;
                  return;
                } else {
                  return;
                }
              }
            }
          }
          L45: {
            if (this.field_qb == param0) {
              break L45;
            } else {
              if (0 == this.field_qb) {
                if (param0 == 0) {
                  this.field_pb = null;
                  this.field_qb = param0;
                  this.field_Rb = param2;
                  this.field_Lc = param1;
                  if (var8 != 0) {
                    if (this.field_qb != 0) {
                      L46: {
                        this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                        if (this.field_Lc != param1) {
                          break L46;
                        } else {
                          if (this.field_Rb != param2) {
                            break L46;
                          } else {
                            return;
                          }
                        }
                      }
                      this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                      this.field_Rb = param2;
                      this.field_Lc = param1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  this.field_pb = this.field_sb[2147483647 & param0];
                  this.field_pb.a(-112, param3);
                  this.field_pb.a(param3, 5744);
                  this.field_pb.a((byte) 55, param1, param2);
                  if (var8 == 0) {
                    this.field_qb = param0;
                    this.field_Rb = param2;
                    this.field_Lc = param1;
                    if (var8 != 0) {
                      break L45;
                    } else {
                      return;
                    }
                  } else {
                    this.field_pb = null;
                    this.field_qb = param0;
                    this.field_Rb = param2;
                    this.field_Lc = param1;
                    if (var8 != 0) {
                      if (this.field_qb != 0) {
                        L47: {
                          this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                          if (this.field_Lc != param1) {
                            break L47;
                          } else {
                            if (this.field_Rb != param2) {
                              break L47;
                            } else {
                              return;
                            }
                          }
                        }
                        this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                        this.field_Rb = param2;
                        this.field_Lc = param1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                this.field_sb[this.field_qb & 2147483647].a(-79);
                if (param0 == 0) {
                  L48: {
                    this.field_pb = null;
                    this.field_qb = param0;
                    this.field_Rb = param2;
                    this.field_Lc = param1;
                    if (var8 == 0) {
                      break L48;
                    } else {
                      if (this.field_qb == 0) {
                        break L48;
                      } else {
                        L49: {
                          this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                          if (this.field_Lc != param1) {
                            break L49;
                          } else {
                            if (this.field_Rb != param2) {
                              break L49;
                            } else {
                              break L48;
                            }
                          }
                        }
                        this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                        this.field_Rb = param2;
                        this.field_Lc = param1;
                        break L48;
                      }
                    }
                  }
                  return;
                } else {
                  this.field_pb = this.field_sb[2147483647 & param0];
                  this.field_pb.a(-112, param3);
                  this.field_pb.a(param3, 5744);
                  this.field_pb.a((byte) 55, param1, param2);
                  if (var8 == 0) {
                    this.field_qb = param0;
                    this.field_Rb = param2;
                    this.field_Lc = param1;
                    if (var8 != 0) {
                      if (this.field_qb != 0) {
                        L50: {
                          this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                          if (this.field_Lc != param1) {
                            break L50;
                          } else {
                            if (this.field_Rb != param2) {
                              break L50;
                            } else {
                              return;
                            }
                          }
                        }
                        this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                        this.field_Rb = param2;
                        this.field_Lc = param1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    L51: {
                      this.field_pb = null;
                      this.field_qb = param0;
                      this.field_Rb = param2;
                      this.field_Lc = param1;
                      if (var8 == 0) {
                        break L51;
                      } else {
                        if (this.field_qb == 0) {
                          break L51;
                        } else {
                          L52: {
                            this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                            if (this.field_Lc != param1) {
                              break L52;
                            } else {
                              if (this.field_Rb != param2) {
                                break L52;
                              } else {
                                break L51;
                              }
                            }
                          }
                          this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                          this.field_Rb = param2;
                          this.field_Lc = param1;
                          break L51;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
          if (this.field_qb != 0) {
            L53: {
              this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
              if (this.field_Lc != param1) {
                break L53;
              } else {
                if (this.field_Rb != param2) {
                  break L53;
                } else {
                  return;
                }
              }
            }
            this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
            this.field_Rb = param2;
            this.field_Lc = param1;
            return;
          } else {
            return;
          }
        } else {
          L54: {
            this.field_eb = (ld) null;
            if (param4) {
              break L54;
            } else {
              if ((param0 ^ -1) != -5) {
                if (8 != param0) {
                  if (-10 == (param0 ^ -1)) {
                    L55: {
                      param0 = 2;
                      if ((param0 ^ -1) != -5) {
                        stackOut_54_0 = 1;
                        stackIn_55_0 = stackOut_54_0;
                        break L55;
                      } else {
                        stackOut_53_0 = param1 & 1;
                        stackIn_55_0 = stackOut_53_0;
                        break L55;
                      }
                    }
                    param2 = stackIn_55_0;
                    param1 = 0;
                    break L54;
                  } else {
                    break L54;
                  }
                } else {
                  L56: {
                    param0 = 2;
                    if ((param0 ^ -1) != -5) {
                      stackOut_29_0 = 1;
                      stackIn_30_0 = stackOut_29_0;
                      break L56;
                    } else {
                      stackOut_28_0 = param1 & 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L56;
                    }
                  }
                  L57: {
                    param2 = stackIn_30_0;
                    param1 = 0;
                    if (param0 == 0) {
                      break L57;
                    } else {
                      if (param3) {
                        param0 = param0 | -2147483648;
                        break L57;
                      } else {
                        break L57;
                      }
                    }
                  }
                  L58: {
                    L59: {
                      if (this.field_qb == param0) {
                        break L59;
                      } else {
                        L60: {
                          if (0 == this.field_qb) {
                            break L60;
                          } else {
                            this.field_sb[this.field_qb & 2147483647].a(-79);
                            break L60;
                          }
                        }
                        L61: {
                          if (param0 == 0) {
                            this.field_pb = null;
                            break L61;
                          } else {
                            this.field_pb = this.field_sb[2147483647 & param0];
                            this.field_pb.a(-112, param3);
                            this.field_pb.a(param3, 5744);
                            this.field_pb.a((byte) 55, param1, param2);
                            if (var8 == 0) {
                              break L61;
                            } else {
                              this.field_pb = null;
                              break L61;
                            }
                          }
                        }
                        this.field_qb = param0;
                        this.field_Rb = param2;
                        this.field_Lc = param1;
                        if (var8 == 0) {
                          break L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                    if (this.field_qb == 0) {
                      break L58;
                    } else {
                      this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                      if (this.field_Lc != param1) {
                        this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                        this.field_Rb = param2;
                        this.field_Lc = param1;
                        break L58;
                      } else {
                        if (this.field_Rb != param2) {
                          this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                          this.field_Rb = param2;
                          this.field_Lc = param1;
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L62: {
                  param0 = 2;
                  if ((param0 ^ -1) != -5) {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    break L62;
                  } else {
                    stackOut_4_0 = param1 & 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L62;
                  }
                }
                L63: {
                  param2 = stackIn_6_0;
                  param1 = 0;
                  if (param0 == 0) {
                    break L63;
                  } else {
                    if (param3) {
                      param0 = param0 | -2147483648;
                      break L63;
                    } else {
                      break L63;
                    }
                  }
                }
                L64: {
                  L65: {
                    if (this.field_qb == param0) {
                      break L65;
                    } else {
                      L66: {
                        if (0 == this.field_qb) {
                          break L66;
                        } else {
                          this.field_sb[this.field_qb & 2147483647].a(-79);
                          break L66;
                        }
                      }
                      L67: {
                        if (param0 == 0) {
                          this.field_pb = null;
                          break L67;
                        } else {
                          this.field_pb = this.field_sb[2147483647 & param0];
                          this.field_pb.a(-112, param3);
                          this.field_pb.a(param3, 5744);
                          this.field_pb.a((byte) 55, param1, param2);
                          if (var8 == 0) {
                            break L67;
                          } else {
                            this.field_pb = null;
                            break L67;
                          }
                        }
                      }
                      this.field_qb = param0;
                      this.field_Rb = param2;
                      this.field_Lc = param1;
                      if (var8 == 0) {
                        break L64;
                      } else {
                        break L65;
                      }
                    }
                  }
                  if (this.field_qb == 0) {
                    break L64;
                  } else {
                    this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                    if (this.field_Lc != param1) {
                      this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                      this.field_Rb = param2;
                      this.field_Lc = param1;
                      break L64;
                    } else {
                      if (this.field_Rb != param2) {
                        this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
                        this.field_Rb = param2;
                        this.field_Lc = param1;
                        break L64;
                      } else {
                        break L64;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          L68: {
            if (param0 == 0) {
              break L68;
            } else {
              if (param3) {
                param0 = param0 | -2147483648;
                break L68;
              } else {
                break L68;
              }
            }
          }
          L69: {
            L70: {
              if (this.field_qb == param0) {
                break L70;
              } else {
                L71: {
                  if (0 == this.field_qb) {
                    break L71;
                  } else {
                    this.field_sb[this.field_qb & 2147483647].a(-79);
                    break L71;
                  }
                }
                L72: {
                  if (param0 == 0) {
                    this.field_pb = null;
                    break L72;
                  } else {
                    this.field_pb = this.field_sb[2147483647 & param0];
                    this.field_pb.a(-112, param3);
                    this.field_pb.a(param3, 5744);
                    this.field_pb.a((byte) 55, param1, param2);
                    if (var8 == 0) {
                      break L72;
                    } else {
                      this.field_pb = null;
                      break L72;
                    }
                  }
                }
                this.field_qb = param0;
                this.field_Rb = param2;
                this.field_Lc = param1;
                if (var8 == 0) {
                  break L69;
                } else {
                  break L70;
                }
              }
            }
            if (this.field_qb == 0) {
              break L69;
            } else {
              L73: {
                this.field_sb[this.field_qb & 2147483647].a(param3, param5 ^ -5737);
                if (this.field_Lc != param1) {
                  break L73;
                } else {
                  if (this.field_Rb != param2) {
                    break L73;
                  } else {
                    break L69;
                  }
                }
              }
              this.field_sb[this.field_qb & 2147483647].a((byte) 55, param1, param2);
              this.field_Rb = param2;
              this.field_Lc = param1;
              break L69;
            }
          }
          return;
        }
    }

    final asa y(byte param0) {
        if (param0 != -77) {
            this.field_pb = (vw) null;
            return this.field_q;
        }
        return this.field_q;
    }

    vw e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 > 37) {
          var3 = param0;
          if (6 != var3) {
            if (-2 != (var3 ^ -1)) {
              if ((var3 ^ -1) != -3) {
                if ((var3 ^ -1) != -8) {
                  return (vw) ((Object) new vu((eo) (this)));
                } else {
                  if (var4 == 0) {
                    return (vw) ((Object) new sl((eo) (this)));
                  } else {
                    return (vw) ((Object) new vta((eo) (this)));
                  }
                }
              } else {
                if (var4 == 0) {
                  return (vw) ((Object) new fn((eo) (this), this.field_Mb));
                } else {
                  if ((var3 ^ -1) != -8) {
                    return (vw) ((Object) new vu((eo) (this)));
                  } else {
                    return (vw) ((Object) new vta((eo) (this)));
                  }
                }
              }
            } else {
              return (vw) ((Object) new em((eo) (this)));
            }
          } else {
            if (var4 != 0) {
              if (-2 != (var3 ^ -1)) {
                if ((var3 ^ -1) != -3) {
                  if ((var3 ^ -1) == -8) {
                    if (var4 != 0) {
                      return (vw) ((Object) new vta((eo) (this)));
                    } else {
                      return (vw) ((Object) new sl((eo) (this)));
                    }
                  } else {
                    return (vw) ((Object) new vu((eo) (this)));
                  }
                } else {
                  if ((var3 ^ -1) != -8) {
                    return (vw) ((Object) new vu((eo) (this)));
                  } else {
                    return (vw) ((Object) new vta((eo) (this)));
                  }
                }
              } else {
                return (vw) ((Object) new em((eo) (this)));
              }
            } else {
              return (vw) ((Object) new vta((eo) (this)));
            }
          }
        } else {
          this.field_Qb = (asa) null;
          var3 = param0;
          if (6 == var3) {
            if (var4 != 0) {
              if (-2 != (var3 ^ -1)) {
                if ((var3 ^ -1) != -3) {
                  if ((var3 ^ -1) == -8) {
                    if (var4 == 0) {
                      return (vw) ((Object) new sl((eo) (this)));
                    } else {
                      return (vw) ((Object) new vta((eo) (this)));
                    }
                  } else {
                    return (vw) ((Object) new vu((eo) (this)));
                  }
                } else {
                  if (var4 != 0) {
                    if ((var3 ^ -1) == -8) {
                      return (vw) ((Object) new vta((eo) (this)));
                    } else {
                      return (vw) ((Object) new vu((eo) (this)));
                    }
                  } else {
                    return (vw) ((Object) new fn((eo) (this), this.field_Mb));
                  }
                }
              } else {
                return (vw) ((Object) new em((eo) (this)));
              }
            } else {
              return (vw) ((Object) new vta((eo) (this)));
            }
          } else {
            if (-2 != (var3 ^ -1)) {
              if ((var3 ^ -1) != -3) {
                if ((var3 ^ -1) == -8) {
                  if (var4 != 0) {
                    return (vw) ((Object) new vta((eo) (this)));
                  } else {
                    return (vw) ((Object) new sl((eo) (this)));
                  }
                } else {
                  return (vw) ((Object) new vu((eo) (this)));
                }
              } else {
                if (var4 != 0) {
                  if ((var3 ^ -1) == -8) {
                    return (vw) ((Object) new vta((eo) (this)));
                  } else {
                    return (vw) ((Object) new vu((eo) (this)));
                  }
                } else {
                  return (vw) ((Object) new fn((eo) (this), this.field_Mb));
                }
              }
            } else {
              return (vw) ((Object) new em((eo) (this)));
            }
          }
        }
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
                if (var3_int >= param0) {
                  this.field_Bc = param0;
                  break L2;
                } else {
                  this.field_ib[var3_int] = param1[var3_int];
                  var3_int++;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                if (this.field_r.a(-89)) {
                  this.g((byte) 92);
                  break L3;
                } else {
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("eo.JB(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    void c(int param0) {
        if (null != this.field_Ec) {
          this.field_Ec.a(5);
          this.field_Dc = param0 & 2147483647;
          return;
        } else {
          this.field_Dc = param0 & 2147483647;
          return;
        }
    }

    final void b(boolean param0, int param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          if (this.field_Bb != param0) {
            L1: {
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (!param0) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ((eo) (this)).field_Bb = stackIn_5_1 != 0;
            this.D(2);
            this.field_rb = this.field_rb & -32;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 < -51) {
          return;
        } else {
          this.field_Bb = false;
          return;
        }
    }

    final jaclib.memory.heap.NativeHeapBuffer a(boolean param0, int param1, boolean param2) {
        if (param0) {
            return (jaclib.memory.heap.NativeHeapBuffer) null;
        }
        return this.field_t.a(param1, param2);
    }

    private final void A(byte param0) {
        mla var3 = null;
        mla var4 = null;
        if (param0 == -74) {
          if (coa.field_s != this.field_r) {
            var4 = this.field_r;
            this.field_r = coa.field_s;
            if (!var4.a(-109)) {
              this.v((byte) 94);
              this.x(7);
              this.field_T = this.field_R;
              this.l((byte) 26);
              this.field_rb = this.field_rb & -8;
              return;
            } else {
              this.x(7);
              this.field_T = this.field_R;
              this.l((byte) 26);
              this.field_rb = this.field_rb & -8;
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_T = (float[]) null;
          if (coa.field_s != this.field_r) {
            var3 = this.field_r;
            this.field_r = coa.field_s;
            if (var3.a(-109)) {
              this.x(7);
              this.field_T = this.field_R;
              this.l((byte) 26);
              this.field_rb = this.field_rb & -8;
              return;
            } else {
              this.v((byte) 94);
              this.x(7);
              this.field_T = this.field_R;
              this.l((byte) 26);
              this.field_rb = this.field_rb & -8;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void g(int param0, int param1) {
        if (param0 != 3625) {
            return;
        }
        if (this.field_bc == param1) {
            return;
        }
        this.field_bc = param1;
        this.N(-95);
    }

    final static roa D(byte param0) {
        roa var1 = null;
        var1 = new roa();
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
        } else {
          var1.field_b = 0;
          return var1;
        }
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_3_0 = null;
        float[] stackOut_1_0 = null;
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
              stackOut_3_0 = (float[]) (param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (float[]) null;
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
            stackOut_5_1 = new StringBuilder().append("eo.JG(");
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
        eja discarded$2 = null;
        this.field_q.a();
        this.field_gb = true;
        this.o(16);
        if (param0 >= 97) {
          return;
        } else {
          discarded$2 = this.a(36, false);
          return;
        }
    }

    private final void B(int param0) {
        if (param0 != -7840) {
          L0: {
            this.field_mb = (mna) null;
            if (this.field_pb != null) {
              this.field_pb.a(true);
              break L0;
            } else {
              break L0;
            }
          }
          this.I(1);
          return;
        } else {
          L1: {
            if (this.field_pb != null) {
              this.field_pb.a(true);
              break L1;
            } else {
              break L1;
            }
          }
          this.I(1);
          return;
        }
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
        if (param0 == -19320) {
          if (this.field_r != coa.field_s) {
            return;
          } else {
            this.l((byte) 26);
            return;
          }
        } else {
          this.field_Mb = (hk) null;
          if (this.field_r != coa.field_s) {
            return;
          } else {
            this.l((byte) 26);
            return;
          }
        }
    }

    final void a(fp param0, int param1, int param2) {
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
              this.a(param0, param1, -6219, false, false);
              if (param2 < -13) {
                break L1;
              } else {
                this.field_qb = 22;
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
            stackOut_3_1 = new StringBuilder().append("eo.GF(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
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
              this.field_bb = (asa) ((Object) param0);
              this.field_Qb.a(this.field_bb, 1);
              this.field_Qb.a((byte) 42);
              this.field_rc.a((gda) (this.field_Qb), (byte) 127);
              this.field_Y.a((gda) (this.field_bb), (byte) -31);
              if (!this.field_r.a(-38)) {
                break L1;
              } else {
                this.v((byte) 94);
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
            stackOut_3_1 = new StringBuilder().append("eo.W(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        boolean discarded$0 = this.field_cb.a(24, 12, param0);
        this.field_mb = this.a(new ne[]{new ne(gj.field_p)}, 0);
    }

    final void a(boolean param0, int param1) {
        this.field_Nb = param0 ? true : false;
        this.b((byte) 117);
        if (param1 == 0) {
            return;
        }
        this.field_S = -102;
    }

    abstract void M(int param0);

    final void y(int param0) {
        this.a(vs.field_T, (byte) -32, param0);
    }

    final int Q(int param0) {
        if (param0 != 10) {
          this.xa(-0.16009120643138885f);
          return this.field_X - -this.field_Xb - -this.field_Fb;
        } else {
          return this.field_X - -this.field_Xb - -this.field_Fb;
        }
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
        float var6_float = 0.0f;
        RuntimeException var6 = null;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
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
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("eo.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
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
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        dw var15 = null;
        asa var16 = null;
        asa var17 = null;
        asa var18 = null;
        dw var19 = null;
        asa var20 = null;
        asa var21 = null;
        asa var22 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_121_0 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          if (param3 != this.field_Jc) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = this.field_L;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (this.field_V) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
              this.field_rb = this.field_rb & -8;
              if (param0 != -80) {
                this.field_Tb = 57;
                return;
              } else {
                return;
              }
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
          if (this.field_L) {
            stackOut_7_0 = 3;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 0;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_8_0;
          if ((param3 ^ -1) <= -1) {
            var5 = this.field_Ec.a(param3, 111);
            var19 = this.field_c.a((byte) -47, param3);
            if (0 == var19.field_s) {
              if (var19.field_o == 0) {
                this.p((byte) -80);
                if (var14 == 0) {
                  var6 = var19.field_q;
                  if (!this.field_L) {
                    var7 = var19.field_a;
                    var9 = var19.field_h;
                    var8 = var19.field_t;
                    break L3;
                  } else {
                    this.a(var9, var7, var8, param1, param2, -25);
                    if (null == this.field_pb) {
                      this.a(true, (iva) (var5));
                      this.a((byte) -37, var6);
                      L4: {
                        this.field_Jc = param3;
                        this.field_V = this.field_L;
                        this.field_rb = this.field_rb & -8;
                        if (param0 == -80) {
                          break L4;
                        } else {
                          this.field_Tb = 57;
                          break L4;
                        }
                      }
                      return;
                    } else {
                      this.field_pb.a(var6, (iva) (var5), 24595);
                      if (var14 == 0) {
                        this.field_Jc = param3;
                        this.field_V = this.field_L;
                        this.field_rb = this.field_rb & -8;
                        if (param0 != -80) {
                          this.field_Tb = 57;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        this.a(true, (iva) (var5));
                        this.a((byte) -37, var6);
                        this.field_Jc = param3;
                        this.field_V = this.field_L;
                        this.field_rb = this.field_rb & -8;
                        if (param0 == -80) {
                          return;
                        } else {
                          this.field_Tb = 57;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L5: {
                    if (!var19.field_g) {
                      stackOut_120_0 = 128;
                      stackIn_121_0 = stackOut_120_0;
                      break L5;
                    } else {
                      stackOut_119_0 = 64;
                      stackIn_121_0 = stackOut_119_0;
                      break L5;
                    }
                  }
                  L6: {
                    var11 = stackIn_121_0;
                    var12 = 50 * var11;
                    var22 = this.C(0);
                    var22.a((byte) 126, (float)(var19.field_o * (this.field_Dc % var12)) / (float)var12, 0.0f, (float)(var19.field_s * (this.field_Dc % var12)) / (float)var12);
                    this.a(pfa.field_i, false);
                    var6 = var19.field_q;
                    if (!this.field_L) {
                      var7 = var19.field_a;
                      var9 = var19.field_h;
                      var8 = var19.field_t;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    this.a(var9, var7, var8, param1, param2, -25);
                    if (null == this.field_pb) {
                      this.a(true, (iva) (var5));
                      this.a((byte) -37, var6);
                      break L7;
                    } else {
                      this.field_pb.a(var6, (iva) (var5), 24595);
                      if (var14 == 0) {
                        break L7;
                      } else {
                        this.a(true, (iva) (var5));
                        this.a((byte) -37, var6);
                        break L7;
                      }
                    }
                  }
                  this.field_Jc = param3;
                  this.field_V = this.field_L;
                  this.field_rb = this.field_rb & -8;
                  if (param0 != -80) {
                    this.field_Tb = 57;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  if (!var19.field_g) {
                    stackOut_90_0 = 128;
                    stackIn_91_0 = stackOut_90_0;
                    break L8;
                  } else {
                    stackOut_89_0 = 64;
                    stackIn_91_0 = stackOut_89_0;
                    break L8;
                  }
                }
                var11 = stackIn_91_0;
                var12 = 50 * var11;
                var21 = this.C(0);
                var21.a((byte) 126, (float)(var19.field_o * (this.field_Dc % var12)) / (float)var12, 0.0f, (float)(var19.field_s * (this.field_Dc % var12)) / (float)var12);
                this.a(pfa.field_i, false);
                var6 = var19.field_q;
                if (!this.field_L) {
                  var7 = var19.field_a;
                  var9 = var19.field_h;
                  var8 = var19.field_t;
                  this.a(var9, var7, var8, param1, param2, -25);
                  if (null == this.field_pb) {
                    this.a(true, (iva) (var5));
                    this.a((byte) -37, var6);
                    L9: {
                      this.field_Jc = param3;
                      this.field_V = this.field_L;
                      this.field_rb = this.field_rb & -8;
                      if (param0 == -80) {
                        break L9;
                      } else {
                        this.field_Tb = 57;
                        break L9;
                      }
                    }
                    return;
                  } else {
                    this.field_pb.a(var6, (iva) (var5), 24595);
                    if (var14 == 0) {
                      L10: {
                        this.field_Jc = param3;
                        this.field_V = this.field_L;
                        this.field_rb = this.field_rb & -8;
                        if (param0 == -80) {
                          break L10;
                        } else {
                          this.field_Tb = 57;
                          break L10;
                        }
                      }
                      return;
                    } else {
                      this.a(true, (iva) (var5));
                      this.a((byte) -37, var6);
                      L11: {
                        this.field_Jc = param3;
                        this.field_V = this.field_L;
                        this.field_rb = this.field_rb & -8;
                        if (param0 == -80) {
                          break L11;
                        } else {
                          this.field_Tb = 57;
                          break L11;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L12: {
                    this.a(var9, var7, var8, param1, param2, -25);
                    if (null == this.field_pb) {
                      this.a(true, (iva) (var5));
                      this.a((byte) -37, var6);
                      this.field_Jc = param3;
                      this.field_V = this.field_L;
                      break L12;
                    } else {
                      this.field_pb.a(var6, (iva) (var5), 24595);
                      if (var14 == 0) {
                        this.field_Jc = param3;
                        this.field_V = this.field_L;
                        break L12;
                      } else {
                        this.a(true, (iva) (var5));
                        this.a((byte) -37, var6);
                        this.field_Jc = param3;
                        this.field_V = this.field_L;
                        break L12;
                      }
                    }
                  }
                  L13: {
                    this.field_rb = this.field_rb & -8;
                    if (param0 == -80) {
                      break L13;
                    } else {
                      this.field_Tb = 57;
                      break L13;
                    }
                  }
                  return;
                }
              }
            } else {
              L14: {
                if (!var19.field_g) {
                  stackOut_60_0 = 128;
                  stackIn_61_0 = stackOut_60_0;
                  break L14;
                } else {
                  stackOut_59_0 = 64;
                  stackIn_61_0 = stackOut_59_0;
                  break L14;
                }
              }
              var11 = stackIn_61_0;
              var12 = 50 * var11;
              var20 = this.C(0);
              var20.a((byte) 126, (float)(var19.field_o * (this.field_Dc % var12)) / (float)var12, 0.0f, (float)(var19.field_s * (this.field_Dc % var12)) / (float)var12);
              this.a(pfa.field_i, false);
              var6 = var19.field_q;
              if (!this.field_L) {
                var7 = var19.field_a;
                var9 = var19.field_h;
                var8 = var19.field_t;
                this.a(var9, var7, var8, param1, param2, -25);
                if (null == this.field_pb) {
                  this.a(true, (iva) (var5));
                  this.a((byte) -37, var6);
                  L15: {
                    this.field_Jc = param3;
                    this.field_V = this.field_L;
                    this.field_rb = this.field_rb & -8;
                    if (param0 == -80) {
                      break L15;
                    } else {
                      this.field_Tb = 57;
                      break L15;
                    }
                  }
                  return;
                } else {
                  this.field_pb.a(var6, (iva) (var5), 24595);
                  if (var14 == 0) {
                    L16: {
                      this.field_Jc = param3;
                      this.field_V = this.field_L;
                      this.field_rb = this.field_rb & -8;
                      if (param0 == -80) {
                        break L16;
                      } else {
                        this.field_Tb = 57;
                        break L16;
                      }
                    }
                    return;
                  } else {
                    this.a(true, (iva) (var5));
                    this.a((byte) -37, var6);
                    L17: {
                      this.field_Jc = param3;
                      this.field_V = this.field_L;
                      this.field_rb = this.field_rb & -8;
                      if (param0 == -80) {
                        break L17;
                      } else {
                        this.field_Tb = 57;
                        break L17;
                      }
                    }
                    return;
                  }
                }
              } else {
                L18: {
                  this.a(var9, var7, var8, param1, param2, -25);
                  if (null == this.field_pb) {
                    this.a(true, (iva) (var5));
                    this.a((byte) -37, var6);
                    this.field_Jc = param3;
                    this.field_V = this.field_L;
                    break L18;
                  } else {
                    this.field_pb.a(var6, (iva) (var5), 24595);
                    if (var14 == 0) {
                      this.field_Jc = param3;
                      this.field_V = this.field_L;
                      break L18;
                    } else {
                      this.a(true, (iva) (var5));
                      this.a((byte) -37, var6);
                      this.field_Jc = param3;
                      this.field_V = this.field_L;
                      break L18;
                    }
                  }
                }
                L19: {
                  this.field_rb = this.field_rb & -8;
                  if (param0 == -80) {
                    break L19;
                  } else {
                    this.field_Tb = 57;
                    break L19;
                  }
                }
                return;
              }
            }
          } else {
            this.p((byte) 88);
            if (var14 == 0) {
              break L3;
            } else {
              var5 = this.field_Ec.a(param3, 111);
              var15 = this.field_c.a((byte) -47, param3);
              if (0 == var15.field_s) {
                if (var15.field_o != 0) {
                  L20: {
                    if (!var15.field_g) {
                      stackOut_44_0 = 128;
                      stackIn_45_0 = stackOut_44_0;
                      break L20;
                    } else {
                      stackOut_43_0 = 64;
                      stackIn_45_0 = stackOut_43_0;
                      break L20;
                    }
                  }
                  L21: {
                    var11 = stackIn_45_0;
                    var12 = 50 * var11;
                    var17 = this.C(0);
                    var17.a((byte) 126, (float)(var15.field_o * (this.field_Dc % var12)) / (float)var12, 0.0f, (float)(var15.field_s * (this.field_Dc % var12)) / (float)var12);
                    this.a(pfa.field_i, false);
                    var6 = var15.field_q;
                    if (!this.field_L) {
                      var7 = var15.field_a;
                      var9 = var15.field_h;
                      var8 = var15.field_t;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    this.a(var9, var7, var8, param1, param2, -25);
                    if (null == this.field_pb) {
                      this.a(true, (iva) (var5));
                      this.a((byte) -37, var6);
                      break L22;
                    } else {
                      this.field_pb.a(var6, (iva) (var5), 24595);
                      if (var14 == 0) {
                        break L22;
                      } else {
                        this.a(true, (iva) (var5));
                        this.a((byte) -37, var6);
                        break L22;
                      }
                    }
                  }
                  L23: {
                    this.field_Jc = param3;
                    this.field_V = this.field_L;
                    this.field_rb = this.field_rb & -8;
                    if (param0 == -80) {
                      break L23;
                    } else {
                      this.field_Tb = 57;
                      break L23;
                    }
                  }
                  return;
                } else {
                  L24: {
                    this.p((byte) -80);
                    if (var14 == 0) {
                      break L24;
                    } else {
                      L25: {
                        if (!var15.field_g) {
                          stackOut_29_0 = 128;
                          stackIn_30_0 = stackOut_29_0;
                          break L25;
                        } else {
                          stackOut_28_0 = 64;
                          stackIn_30_0 = stackOut_28_0;
                          break L25;
                        }
                      }
                      var11 = stackIn_30_0;
                      var12 = 50 * var11;
                      var18 = this.C(0);
                      var18.a((byte) 126, (float)(var15.field_o * (this.field_Dc % var12)) / (float)var12, 0.0f, (float)(var15.field_s * (this.field_Dc % var12)) / (float)var12);
                      this.a(pfa.field_i, false);
                      break L24;
                    }
                  }
                  L26: {
                    var6 = var15.field_q;
                    if (!this.field_L) {
                      var7 = var15.field_a;
                      var9 = var15.field_h;
                      var8 = var15.field_t;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    this.a(var9, var7, var8, param1, param2, -25);
                    if (null == this.field_pb) {
                      this.a(true, (iva) (var5));
                      this.a((byte) -37, var6);
                      break L27;
                    } else {
                      this.field_pb.a(var6, (iva) (var5), 24595);
                      if (var14 == 0) {
                        break L27;
                      } else {
                        this.a(true, (iva) (var5));
                        this.a((byte) -37, var6);
                        break L27;
                      }
                    }
                  }
                  L28: {
                    this.field_Jc = param3;
                    this.field_V = this.field_L;
                    this.field_rb = this.field_rb & -8;
                    if (param0 == -80) {
                      break L28;
                    } else {
                      this.field_Tb = 57;
                      break L28;
                    }
                  }
                  return;
                }
              } else {
                L29: {
                  if (!var15.field_g) {
                    stackOut_13_0 = 128;
                    stackIn_14_0 = stackOut_13_0;
                    break L29;
                  } else {
                    stackOut_12_0 = 64;
                    stackIn_14_0 = stackOut_12_0;
                    break L29;
                  }
                }
                L30: {
                  var11 = stackIn_14_0;
                  var12 = 50 * var11;
                  var16 = this.C(0);
                  var16.a((byte) 126, (float)(var15.field_o * (this.field_Dc % var12)) / (float)var12, 0.0f, (float)(var15.field_s * (this.field_Dc % var12)) / (float)var12);
                  this.a(pfa.field_i, false);
                  var6 = var15.field_q;
                  if (!this.field_L) {
                    var7 = var15.field_a;
                    var9 = var15.field_h;
                    var8 = var15.field_t;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  this.a(var9, var7, var8, param1, param2, -25);
                  if (null == this.field_pb) {
                    this.a(true, (iva) (var5));
                    this.a((byte) -37, var6);
                    break L31;
                  } else {
                    this.field_pb.a(var6, (iva) (var5), 24595);
                    if (var14 == 0) {
                      break L31;
                    } else {
                      this.a(true, (iva) (var5));
                      this.a((byte) -37, var6);
                      break L31;
                    }
                  }
                }
                L32: {
                  this.field_Jc = param3;
                  this.field_V = this.field_L;
                  this.field_rb = this.field_rb & -8;
                  if (param0 == -80) {
                    break L32;
                  } else {
                    this.field_Tb = 57;
                    break L32;
                  }
                }
                return;
              }
            }
          }
        }
        this.a(var9, var7, var8, param1, param2, -25);
        if (null == this.field_pb) {
          this.a(true, (iva) (var5));
          this.a((byte) -37, var6);
          this.field_Jc = param3;
          this.field_V = this.field_L;
          this.field_rb = this.field_rb & -8;
          if (param0 != -80) {
            this.field_Tb = 57;
            return;
          } else {
            return;
          }
        } else {
          this.field_pb.a(var6, (iva) (var5), 24595);
          if (var14 == 0) {
            this.field_Jc = param3;
            this.field_V = this.field_L;
            this.field_rb = this.field_rb & -8;
            if (param0 != -80) {
              this.field_Tb = 57;
              return;
            } else {
              return;
            }
          } else {
            this.a(true, (iva) (var5));
            this.a((byte) -37, var6);
            this.field_Jc = param3;
            this.field_V = this.field_L;
            this.field_rb = this.field_rb & -8;
            if (param0 != -80) {
              this.field_Tb = 57;
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0, iva param1) {
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
              if (this.field_N[this.field_Cc] == param1) {
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_N[this.field_Cc] = param1;
                    if (param1 != null) {
                      break L3;
                    } else {
                      this.d(1);
                      if (!TombRacer.field_G) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param1.b((byte) 89);
                  break L2;
                }
                this.field_rb = this.field_rb & -2;
                break L1;
              }
            }
            L4: {
              if (param0) {
                break L4;
              } else {
                this.field_wb = 77;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("eo.LF(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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
        } else {
          L0: {
            if (this.field_rb != 1) {
              this.J(19822);
              this.b(false, -63);
              this.d(0, false);
              this.f(0, false);
              this.b(false, (byte) 81);
              this.a((byte) -80, false, false, -2);
              this.a((byte) 118, 1);
              this.a(true, this.field_Jb);
              this.field_rb = 1;
              break L0;
            } else {
              break L0;
            }
          }
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
            var8 = (float)(-param1) + (float)param3;
            if (0.0f != var7) {
              var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
              var7 = var7 * var9;
              var8 = var8 * var9;
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            } else {
              if (0.0f == var8) {
                break L1;
              } else {
                L2: {
                  var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
                  var7 = var7 * var9;
                  var8 = var8 * var9;
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    var7 = 1.0f;
                    break L2;
                  }
                }
                if (!this.a((float)param1, 0.0f, (float)param2 + var7, (float)param3 + var8, 0.0f, (float)param0, (byte) 126)) {
                  return;
                } else {
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
                }
              }
            }
          }
          var7 = 1.0f;
          break L0;
        }
        if (!this.a((float)param1, 0.0f, (float)param2 + var7, (float)param3 + var8, 0.0f, (float)param0, (byte) 126)) {
          return;
        } else {
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
        }
    }

    final int A(int param0) {
        if (param0 != -2903) {
            return 28;
        }
        return this.field_nb;
    }

    final void a(byte param0, boolean param1) {
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
        if (stackIn_3_0 != (this.field_U ? 1 : 0)) {
          if (param0 > 42) {
            return;
          } else {
            this.field_Yb = true;
            return;
          }
        } else {
          L1: {
            stackOut_4_0 = this;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (!param1) {
              stackOut_6_0 = this;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          ((eo) (this)).field_U = stackIn_7_1 != 0;
          this.D(2);
          if (param0 > 42) {
            return;
          } else {
            this.field_Yb = true;
            return;
          }
        }
    }

    abstract lv a(byte[] param0, ft param1, byte param2, int param3, int param4, int param5);

    abstract void N(int param0);

    abstract void b(boolean param0);

    final gf a(float[] param0, ft param1, boolean param2, boolean param3, int param4, int param5) {
        gf discarded$2 = null;
        RuntimeException var7 = null;
        ft var8 = null;
        gf stackIn_3_0 = null;
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
        gf stackOut_2_0 = null;
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
              if (param2) {
                break L1;
              } else {
                var8 = (ft) null;
                discarded$2 = this.a((float[]) null, (ft) null, false, false, 69, -89);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param1, 0, 0, param3, param4, 0, param0, param5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("eo.FF(");
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    abstract void D(int param0);

    abstract void d(byte param0);

    private final boolean a(float param0, float param1, float param2, float param3, float param4, float param5, byte param6) {
        jaclib.memory.Stream var9 = null;
        int var10 = 0;
        jaclib.memory.Buffer var11 = null;
        var11 = this.field_cb.a(-15730, true);
        if (var11 != null) {
          var9 = this.a(var11, 125);
          if (jaclib.memory.Stream.b()) {
            var9.b(param5);
            var9.b(param0);
            var9.b(param1);
            var9.b(param2);
            var9.b(param3);
            var9.b(param4);
            if (TombRacer.field_G) {
              var9.a(param5);
              var9.a(param0);
              var9.a(param1);
              var9.a(param2);
              var9.a(param3);
              var9.a(param4);
              var9.a();
              var10 = 16 % ((param6 - 72) / 44);
              return this.field_cb.a(true);
            } else {
              var9.a();
              var10 = 16 % ((param6 - 72) / 44);
              return this.field_cb.a(true);
            }
          } else {
            var9.a(param5);
            var9.a(param0);
            var9.a(param1);
            var9.a(param2);
            var9.a(param3);
            var9.a(param4);
            var9.a();
            var10 = 16 % ((param6 - 72) / 44);
            return this.field_cb.a(true);
          }
        } else {
          return false;
        }
    }

    abstract void b(byte param0);

    private final void C(byte param0) {
        this.a(-126, 0, this.field_cb);
        if (param0 != -70) {
          this.e((byte) -46);
          this.a(this.field_mb, -32);
          this.a(1, io.field_c, 0, param0 + 70);
          return;
        } else {
          this.a(this.field_mb, -32);
          this.a(1, io.field_c, 0, param0 + 70);
          return;
        }
    }

    final void da(int param0, int param1, int param2, int[] param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        float var7 = 0.0f;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
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
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("eo.da(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void p(byte param0) {
        int var2 = 0;
        if (od.field_h != this.field_v[this.field_Cc]) {
          this.field_v[this.field_Cc] = od.field_h;
          this.field_hc[this.field_Cc].a();
          this.u(0);
          var2 = -62 % ((param0 - 28) / 46);
          return;
        } else {
          var2 = -62 % ((param0 - 28) / 46);
          return;
        }
    }

    final void s(byte param0) {
        Object discarded$1 = null;
        Hashtable var2 = null;
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = new Hashtable();
        if (this.field_oc != null) {
          if (!this.field_oc.isEmpty()) {
            var3 = this.field_oc.keys();
            L0: while (true) {
              if (!var3.hasMoreElements()) {
                if (param0 != 6) {
                  return;
                } else {
                  this.field_oc = var2;
                  this.l(param0 ^ 138);
                  this.f(true);
                  this.E((byte) 15);
                  this.field_kb.a(-120, (eo) (this));
                  return;
                }
              } else {
                var4 = (java.awt.Canvas) (var3.nextElement());
                discarded$1 = var2.put(var4, this.a(false, var4));
                if (var5 == 0) {
                  continue L0;
                } else {
                  return;
                }
              }
            }
          } else {
            if (param0 != 6) {
              return;
            } else {
              this.field_oc = var2;
              this.l(param0 ^ 138);
              this.f(true);
              this.E((byte) 15);
              this.field_kb.a(-120, (eo) (this));
              return;
            }
          }
        } else {
          if (param0 != 6) {
            return;
          } else {
            this.field_oc = var2;
            this.l(param0 ^ 138);
            this.f(true);
            this.E((byte) 15);
            this.field_kb.a(-120, (eo) (this));
            return;
          }
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        this.field_xb = this.c(6, false);
        boolean discarded$1 = this.field_xb.a(param0, 28, true);
        var2 = 0;
        L0: while (true) {
          if (var2 < 4) {
            var3 = this.field_xb.a(param0 + -15870, true);
            if (var5 == 0) {
              L1: {
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      var4 = this.a(var3, param0 + -14);
                      if (!jaclib.memory.Stream.b()) {
                        break L3;
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
                          break L2;
                        } else {
                          break L3;
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
                    break L2;
                  }
                  var4.a();
                  if (!this.field_xb.a(true)) {
                    break L1;
                  } else {
                    if (var5 != 0) {
                      break L1;
                    } else {
                      this.field_ub = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n, gj.field_n})}, 0);
                      return;
                    }
                  }
                }
              }
              var2++;
              if (var5 == 0) {
                continue L0;
              } else {
                this.field_ub = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n, gj.field_n})}, 0);
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_ub = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n, gj.field_n})}, 0);
            return;
          }
        }
    }

    final void L(int param0, int param1, int param2) {
        if (this.field_g == param0) {
          if (this.field_J == param1) {
            if (param2 == this.field_Ac) {
              return;
            } else {
              this.field_J = param1;
              this.field_Ac = param2;
              this.field_g = param0;
              this.B(-7840);
              this.D(2);
              return;
            }
          } else {
            this.field_J = param1;
            this.field_Ac = param2;
            this.field_g = param0;
            this.B(-7840);
            this.D(2);
            return;
          }
        } else {
          this.field_J = param1;
          this.field_Ac = param2;
          this.field_g = param0;
          this.B(-7840);
          this.D(2);
          return;
        }
    }

    abstract void a(eja param0, int param1, int param2, int param3, iw param4, int param5, int param6);

    private final boolean p(int param0) {
        iw var3 = null;
        if (param0 > -41) {
          var3 = (iw) null;
          this.a(-55, (iw) null, 17, -88);
          return this.field_sb[3].c(1185);
        } else {
          return this.field_sb[3].c(1185);
        }
    }

    void h(int param0) {
        if (param0 != -29040) {
            this.U(-18, -45, 101, 121, 112);
            this.m((byte) 97);
            return;
        }
        this.m((byte) 97);
    }

    abstract void d(int param0);

    final void a(boolean param0, byte param1) {
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
        if (param1 < 53) {
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
            if (stackIn_4_0 == (this.field_yc ? 1 : 0)) {
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
              ((eo) (this)).field_yc = stackIn_9_1 != 0;
              this.h((byte) -102);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    abstract void a(int param0, byte param1);

    final asa c(boolean param0) {
        if (!param0) {
            this.field_zb = true;
            return this.field_rc;
        }
        return this.field_rc;
    }

    private final void a(iw param0, byte param1, int param2) {
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
              this.a(-128, 0, this.field_xb);
              this.a(this.field_ub, -32);
              this.a(param2, param0, 0, 0);
              if (param1 == -32) {
                break L1;
              } else {
                this.u(-14);
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
            stackOut_3_1 = new StringBuilder().append("eo.MA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
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
        L0: {
          if (this.field_rb != 2) {
            this.J(19822);
            this.b(false, -99);
            this.d(0, false);
            this.f(0, false);
            this.b(false, (byte) 81);
            this.a((byte) -80, false, false, -2);
            this.field_rb = 2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= 104) {
          return;
        } else {
          this.field_ob = (mna) null;
          return;
        }
    }

    final void f(int param0, int param1) {
        if (this.field_D == param0) {
          if (param1 == this.field_k) {
            return;
          } else {
            this.field_D = param0;
            this.field_k = param1;
            this.k(-19320);
            this.R(0);
            this.B(-7840);
            return;
          }
        } else {
          this.field_D = param0;
          this.field_k = param1;
          this.k(-19320);
          this.R(0);
          this.B(-7840);
          return;
        }
    }

    abstract boolean a(boolean param0, una param1, ft param2);

    abstract void w(byte param0);

    abstract float c(byte param0);

    final void K(int param0) {
        mna discarded$3 = null;
        mna discarded$4 = null;
        mna discarded$5 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        this.field_N = new iva[this.field_Vb];
        this.field_hc = new asa[this.field_Vb];
        this.field_db = new ica[this.field_Vb];
        this.field_v = new ura[this.field_Vb];
        this.field_mc = new ica[this.field_Vb];
        var2 = 0;
        if (param0 <= -70) {
          L0: while (true) {
            L1: {
              if (var2 >= this.field_Vb) {
                this.field_ib = new ob[-2 + this.field_e];
                this.field_Jb = (iva) ((Object) this.a(1, 1, gpa.field_a, (byte) -63, una.field_g));
                this.a(new to(262144));
                this.field_Db = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n})}, 0);
                discarded$3 = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_b})}, 0);
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
                break L1;
              } else {
                this.field_db[var2] = iw.field_c;
                this.field_mc[var2] = iw.field_c;
                this.field_v[var2] = od.field_h;
                this.field_hc[var2] = new asa();
                var2++;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    L2: {
                      this.field_ib = new ob[-2 + this.field_e];
                      this.field_Jb = (iva) ((Object) this.a(1, 1, gpa.field_a, (byte) -63, una.field_g));
                      this.a(new to(262144));
                      this.field_Db = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n})}, 0);
                      discarded$4 = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_b})}, 0);
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
                      if (this.field_sb[2].c(1185)) {
                        break L2;
                      } else {
                        this.field_sb[2] = this.e(0, 105);
                        break L2;
                      }
                    }
                    L3: {
                      if (this.field_sb[4].c(1185)) {
                        break L3;
                      } else {
                        this.field_sb[4] = this.field_sb[2];
                        break L3;
                      }
                    }
                    L4: {
                      if (this.field_sb[8].c(1185)) {
                        break L4;
                      } else {
                        this.field_sb[8] = this.field_sb[4];
                        break L4;
                      }
                    }
                    if (this.field_sb[9].c(1185)) {
                      this.h(-29040);
                      this.la();
                      this.a();
                      return;
                    } else {
                      this.field_sb[9] = this.field_sb[8];
                      this.h(-29040);
                      this.la();
                      this.a();
                      return;
                    }
                  }
                }
              }
            }
            if (this.field_sb[2].c(1185)) {
              if (this.field_sb[4].c(1185)) {
                if (this.field_sb[8].c(1185)) {
                  if (this.field_sb[9].c(1185)) {
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  } else {
                    this.field_sb[9] = this.field_sb[8];
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  }
                } else {
                  this.field_sb[8] = this.field_sb[4];
                  if (this.field_sb[9].c(1185)) {
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  } else {
                    this.field_sb[9] = this.field_sb[8];
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  }
                }
              } else {
                this.field_sb[4] = this.field_sb[2];
                if (this.field_sb[8].c(1185)) {
                  if (this.field_sb[9].c(1185)) {
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  } else {
                    this.field_sb[9] = this.field_sb[8];
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  }
                } else {
                  this.field_sb[8] = this.field_sb[4];
                  if (this.field_sb[9].c(1185)) {
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  } else {
                    this.field_sb[9] = this.field_sb[8];
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  }
                }
              }
            } else {
              this.field_sb[2] = this.e(0, 105);
              if (!this.field_sb[4].c(1185)) {
                this.field_sb[4] = this.field_sb[2];
                if (!this.field_sb[8].c(1185)) {
                  this.field_sb[8] = this.field_sb[4];
                  if (this.field_sb[9].c(1185)) {
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  } else {
                    this.field_sb[9] = this.field_sb[8];
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  }
                } else {
                  if (this.field_sb[9].c(1185)) {
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  } else {
                    this.field_sb[9] = this.field_sb[8];
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  }
                }
              } else {
                if (this.field_sb[8].c(1185)) {
                  if (this.field_sb[9].c(1185)) {
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  } else {
                    this.field_sb[9] = this.field_sb[8];
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  }
                } else {
                  this.field_sb[8] = this.field_sb[4];
                  if (this.field_sb[9].c(1185)) {
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  } else {
                    this.field_sb[9] = this.field_sb[8];
                    this.h(-29040);
                    this.la();
                    this.a();
                    return;
                  }
                }
              }
            }
          }
        } else {
          this.field_zb = false;
          L5: while (true) {
            L6: {
              L7: {
                if (var2 >= this.field_Vb) {
                  break L7;
                } else {
                  this.field_db[var2] = iw.field_c;
                  this.field_mc[var2] = iw.field_c;
                  this.field_v[var2] = od.field_h;
                  this.field_hc[var2] = new asa();
                  var2++;
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (var3 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              this.field_ib = new ob[-2 + this.field_e];
              this.field_Jb = (iva) ((Object) this.a(1, 1, gpa.field_a, (byte) -63, una.field_g));
              this.a(new to(262144));
              this.field_Db = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n})}, 0);
              discarded$5 = this.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_b})}, 0);
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
              break L6;
            }
            L8: {
              if (this.field_sb[2].c(1185)) {
                break L8;
              } else {
                this.field_sb[2] = this.e(0, 105);
                break L8;
              }
            }
            L9: {
              if (this.field_sb[4].c(1185)) {
                break L9;
              } else {
                this.field_sb[4] = this.field_sb[2];
                break L9;
              }
            }
            L10: {
              if (this.field_sb[8].c(1185)) {
                break L10;
              } else {
                this.field_sb[8] = this.field_sb[4];
                break L10;
              }
            }
            if (this.field_sb[9].c(1185)) {
              this.h(-29040);
              this.la();
              this.a();
              return;
            } else {
              this.field_sb[9] = this.field_sb[8];
              this.h(-29040);
              this.la();
              this.a();
              return;
            }
          }
        }
    }

    abstract void a(fp param0, int param1, int param2, boolean param3, boolean param4);

    private final void E(byte param0) {
        int var2 = 0;
        int var5 = 0;
        double var6 = 0.0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        jaclib.memory.Buffer var13 = null;
        jaclib.memory.Stream var14 = null;
        jaclib.memory.Buffer var17 = null;
        jaclib.memory.Stream var18 = null;
        boolean stackIn_11_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_33_0 = false;
        boolean stackIn_40_0 = false;
        boolean stackOut_39_0 = false;
        boolean stackOut_32_0 = false;
        boolean stackOut_17_0 = false;
        boolean stackOut_10_0 = false;
        var10 = TombRacer.field_G ? 1 : 0;
        this.field_hb = this.c(6, false);
        boolean discarded$1 = this.field_hb.a(3096, 12, true);
        if (param0 >= 14) {
          var2 = 0;
          L0: while (true) {
            if (var2 < 4) {
              var17 = this.field_hb.a(-15730, true);
              if (var10 == 0) {
                L1: {
                  if (var17 == null) {
                    break L1;
                  } else {
                    var18 = this.a(var17, 125);
                    var18.b(0.0f);
                    var18.b(0.0f);
                    var18.b(0.0f);
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        if (var5 > 256) {
                          var18.a();
                          stackOut_39_0 = this.field_hb.a(true);
                          stackIn_40_0 = stackOut_39_0;
                          break L3;
                        } else {
                          var6 = (double)(var5 * 2) * 3.141592653589793 / 256.0;
                          var8 = (float)Math.cos(var6);
                          var9 = (float)Math.sin(var6);
                          stackOut_32_0 = jaclib.memory.Stream.b();
                          stackIn_40_0 = stackOut_32_0;
                          stackIn_33_0 = stackOut_32_0;
                          if (var10 != 0) {
                            break L3;
                          } else {
                            L4: {
                              if (stackIn_33_0) {
                                var18.b(var9);
                                var18.b(var8);
                                var18.b(0.0f);
                                break L4;
                              } else {
                                var18.a(var9);
                                var18.a(var8);
                                var18.a(0.0f);
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  var18.b(var9);
                                  var18.b(var8);
                                  var18.b(0.0f);
                                  break L4;
                                }
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      }
                      if (!stackIn_40_0) {
                        break L1;
                      } else {
                        if (var10 != 0) {
                          break L1;
                        } else {
                          this.field_Z = this.a(new ne[]{new ne(gj.field_p)}, 0);
                          return;
                        }
                      }
                    }
                  }
                }
                var2++;
                if (var10 == 0) {
                  continue L0;
                } else {
                  this.field_Z = this.a(new ne[]{new ne(gj.field_p)}, 0);
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_Z = this.a(new ne[]{new ne(gj.field_p)}, 0);
              return;
            }
          }
        } else {
          this.field_B = -1.9750553369522095f;
          var2 = 0;
          L5: while (true) {
            if (var2 < 4) {
              var13 = this.field_hb.a(-15730, true);
              if (var10 == 0) {
                L6: {
                  if (var13 == null) {
                    break L6;
                  } else {
                    var14 = this.a(var13, 125);
                    var14.b(0.0f);
                    var14.b(0.0f);
                    var14.b(0.0f);
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        if (var5 > 256) {
                          var14.a();
                          stackOut_17_0 = this.field_hb.a(true);
                          stackIn_18_0 = stackOut_17_0;
                          break L8;
                        } else {
                          var6 = (double)(var5 * 2) * 3.141592653589793 / 256.0;
                          var8 = (float)Math.cos(var6);
                          var9 = (float)Math.sin(var6);
                          stackOut_10_0 = jaclib.memory.Stream.b();
                          stackIn_18_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var10 != 0) {
                            break L8;
                          } else {
                            L9: {
                              if (stackIn_11_0) {
                                var14.b(var9);
                                var14.b(var8);
                                var14.b(0.0f);
                                break L9;
                              } else {
                                var14.a(var9);
                                var14.a(var8);
                                var14.a(0.0f);
                                if (var10 == 0) {
                                  break L9;
                                } else {
                                  var14.b(var9);
                                  var14.b(var8);
                                  var14.b(0.0f);
                                  break L9;
                                }
                              }
                            }
                            var5++;
                            continue L7;
                          }
                        }
                      }
                      if (!stackIn_18_0) {
                        break L6;
                      } else {
                        if (var10 != 0) {
                          break L6;
                        } else {
                          this.field_Z = this.a(new ne[]{new ne(gj.field_p)}, 0);
                          return;
                        }
                      }
                    }
                  }
                }
                var2++;
                if (var10 == 0) {
                  continue L5;
                } else {
                  this.field_Z = this.a(new ne[]{new ne(gj.field_p)}, 0);
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_Z = this.a(new ne[]{new ne(gj.field_p)}, 0);
              return;
            }
          }
        }
    }

    final void f(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          if (this.field_wc) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 != (param1 ? 1 : 0)) {
          if (param0 == 0) {
            return;
          } else {
            this.c(0, 83);
            return;
          }
        } else {
          L1: {
            stackOut_4_0 = this;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (!param1) {
              stackOut_6_0 = this;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          ((eo) (this)).field_wc = stackIn_7_1 != 0;
          this.f((byte) -69);
          this.field_rb = this.field_rb & -32;
          if (param0 == 0) {
            return;
          } else {
            this.c(0, 83);
            return;
          }
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
        Throwable var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        dw var9 = null;
        int var10 = 0;
        java.awt.Dimension var11 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
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
                  L3: {
                    this.field_Ub = param1;
                    this.field_I = param3;
                    this.field_Gc = param4;
                    var11 = param0.getSize();
                    this.field_Hb = var11.width;
                    this.field_jc = var11.height;
                    this.field_F = param5;
                    ija.a(true, (byte) 107, false);
                    if (this.field_c == null) {
                      break L3;
                    } else {
                      this.field_Ec = new kp((eo) (this), this.field_c);
                      this.field_P = new jagex3.graphics2.hw.NativeInterface(this.field_c.a(-15061), this.field_F);
                      var8 = 0;
                      L4: while (true) {
                        L5: {
                          if (var8 >= this.field_c.a(-15061)) {
                            break L5;
                          } else {
                            var9 = this.field_c.a((byte) -79, var8);
                            if (var10 != 0) {
                              break L2;
                            } else {
                              L6: {
                                if (var9 == null) {
                                  break L6;
                                } else {
                                  this.field_P.initTextureMetrics(var8, var9.field_c, var9.field_i);
                                  break L6;
                                }
                              }
                              var8++;
                              if (var10 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  this.field_P = new jagex3.graphics2.hw.NativeInterface(0, this.field_F);
                  this.field_Ec = null;
                  break L2;
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
          L7: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var7_ref);
            stackOut_12_1 = new StringBuilder().append("eo.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L7;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L7;
            }
          }
          L8: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          L9: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          L10: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ',' + param5 + ')');
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
        } else {
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
          return;
        }
    }

    final void e(int param0, boolean param1) {
        if (param1) {
          L0: {
            this.field_F = -91;
            if (param0 != this.field_Cc) {
              this.field_Cc = param0;
              this.e(false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 != this.field_Cc) {
              this.field_Cc = param0;
              this.e(false);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    abstract mna a(ne[] param0, int param1);

    private final void x(int param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float[] var8 = null;
        if (!this.field_s) {
          L0: {
            var8 = this.field_R;
            var2 = var8;
            var3 = (float)(this.field_D * -this.field_Q) / (float)this.field_Ic;
            var4 = (float)(this.field_D * (this.field_Hb + -this.field_Q)) / (float)this.field_Ic;
            var5 = (float)(this.field_kc * this.field_D) / (float)this.field_h;
            var6 = (float)((this.field_kc + -this.field_jc) * this.field_D) / (float)this.field_h;
            if (var3 == var4) {
              break L0;
            } else {
              if (var5 == var6) {
                break L0;
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
                if (!TombRacer.field_G) {
                  this.j(-30801);
                  this.field_s = true;
                  if (param0 == 7) {
                    return;
                  } else {
                    this.field_M = (float[]) null;
                    return;
                  }
                } else {
                  break L0;
                }
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
          this.j(-30801);
          this.field_s = true;
          if (param0 == 7) {
            return;
          } else {
            this.field_M = (float[]) null;
            return;
          }
        } else {
          if (param0 == 7) {
            return;
          } else {
            this.field_M = (float[]) null;
            return;
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
        if (-1 <= (param0 ^ -1)) {
          if (-1 + this.field_Hb <= param2) {
            if (-1 <= (param1 ^ -1)) {
              if (this.field_jc - 1 > param3) {
                L0: {
                  stackOut_53_0 = this;
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_54_0 = stackOut_53_0;
                  if (param2 > this.field_Hb) {
                    stackOut_55_0 = this;
                    stackOut_55_1 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    break L0;
                  } else {
                    stackOut_54_0 = this;
                    stackOut_54_1 = param2;
                    stackIn_56_0 = stackOut_54_0;
                    stackIn_56_1 = stackOut_54_1;
                    break L0;
                  }
                }
                L1: {
                  ((eo) (this)).field_C = stackIn_56_1;
                  stackOut_56_0 = this;
                  stackIn_58_0 = stackOut_56_0;
                  stackIn_57_0 = stackOut_56_0;
                  if (param0 >= 0) {
                    stackOut_58_0 = this;
                    stackOut_58_1 = param0;
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
                  ((eo) (this)).field_A = stackIn_59_1;
                  stackOut_59_0 = this;
                  stackIn_61_0 = stackOut_59_0;
                  stackIn_60_0 = stackOut_59_0;
                  if (param3 <= this.field_Hb) {
                    stackOut_61_0 = this;
                    stackOut_61_1 = param3;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    break L2;
                  } else {
                    stackOut_60_0 = this;
                    stackOut_60_1 = 0;
                    stackIn_62_0 = stackOut_60_0;
                    stackIn_62_1 = stackOut_60_1;
                    break L2;
                  }
                }
                L3: {
                  ((eo) (this)).field_jb = stackIn_62_1;
                  stackOut_62_0 = this;
                  stackIn_64_0 = stackOut_62_0;
                  stackIn_63_0 = stackOut_62_0;
                  if (0 <= param1) {
                    stackOut_64_0 = this;
                    stackOut_64_1 = param1;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    break L3;
                  } else {
                    stackOut_63_0 = this;
                    stackOut_63_1 = 0;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_65_1 = stackOut_63_1;
                    break L3;
                  }
                }
                L4: {
                  ((eo) (this)).field_K = stackIn_65_1;
                  if (!this.field_Wb) {
                    this.field_Wb = true;
                    this.d((byte) 123);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.S(-3335);
                this.r((byte) 80);
                return;
              } else {
                this.la();
                return;
              }
            } else {
              L5: {
                stackOut_35_0 = this;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (param2 > this.field_Hb) {
                  stackOut_37_0 = this;
                  stackOut_37_1 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L5;
                } else {
                  stackOut_36_0 = this;
                  stackOut_36_1 = param2;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L5;
                }
              }
              L6: {
                ((eo) (this)).field_C = stackIn_38_1;
                stackOut_38_0 = this;
                stackIn_40_0 = stackOut_38_0;
                stackIn_39_0 = stackOut_38_0;
                if (param0 >= 0) {
                  stackOut_40_0 = this;
                  stackOut_40_1 = param0;
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
                ((eo) (this)).field_A = stackIn_41_1;
                stackOut_41_0 = this;
                stackIn_43_0 = stackOut_41_0;
                stackIn_42_0 = stackOut_41_0;
                if (param3 <= this.field_Hb) {
                  stackOut_43_0 = this;
                  stackOut_43_1 = param3;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  break L7;
                } else {
                  stackOut_42_0 = this;
                  stackOut_42_1 = 0;
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  break L7;
                }
              }
              L8: {
                ((eo) (this)).field_jb = stackIn_44_1;
                stackOut_44_0 = this;
                stackIn_46_0 = stackOut_44_0;
                stackIn_45_0 = stackOut_44_0;
                if (0 <= param1) {
                  stackOut_46_0 = this;
                  stackOut_46_1 = param1;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  break L8;
                } else {
                  stackOut_45_0 = this;
                  stackOut_45_1 = 0;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  break L8;
                }
              }
              L9: {
                ((eo) (this)).field_K = stackIn_47_1;
                if (!this.field_Wb) {
                  this.field_Wb = true;
                  this.d((byte) 123);
                  break L9;
                } else {
                  break L9;
                }
              }
              this.S(-3335);
              this.r((byte) 80);
              return;
            }
          } else {
            L10: {
              stackOut_18_0 = this;
              stackIn_20_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (param2 > this.field_Hb) {
                stackOut_20_0 = this;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L10;
              } else {
                stackOut_19_0 = this;
                stackOut_19_1 = param2;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                break L10;
              }
            }
            L11: {
              ((eo) (this)).field_C = stackIn_21_1;
              stackOut_21_0 = this;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (param0 >= 0) {
                stackOut_23_0 = this;
                stackOut_23_1 = param0;
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
              ((eo) (this)).field_A = stackIn_24_1;
              stackOut_24_0 = this;
              stackIn_26_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (param3 <= this.field_Hb) {
                stackOut_26_0 = this;
                stackOut_26_1 = param3;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                break L12;
              } else {
                stackOut_25_0 = this;
                stackOut_25_1 = 0;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                break L12;
              }
            }
            L13: {
              ((eo) (this)).field_jb = stackIn_27_1;
              stackOut_27_0 = this;
              stackIn_29_0 = stackOut_27_0;
              stackIn_28_0 = stackOut_27_0;
              if (0 <= param1) {
                stackOut_29_0 = this;
                stackOut_29_1 = param1;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                break L13;
              } else {
                stackOut_28_0 = this;
                stackOut_28_1 = 0;
                stackIn_30_0 = stackOut_28_0;
                stackIn_30_1 = stackOut_28_1;
                break L13;
              }
            }
            L14: {
              ((eo) (this)).field_K = stackIn_30_1;
              if (!this.field_Wb) {
                this.field_Wb = true;
                this.d((byte) 123);
                break L14;
              } else {
                break L14;
              }
            }
            this.S(-3335);
            this.r((byte) 80);
            return;
          }
        } else {
          L15: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param2 > this.field_Hb) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L15;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = param2;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L15;
            }
          }
          L16: {
            ((eo) (this)).field_C = stackIn_4_1;
            stackOut_4_0 = this;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (param0 >= 0) {
              stackOut_6_0 = this;
              stackOut_6_1 = param0;
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
            ((eo) (this)).field_A = stackIn_7_1;
            stackOut_7_0 = this;
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if (param3 <= this.field_Hb) {
              stackOut_9_0 = this;
              stackOut_9_1 = param3;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L17;
            } else {
              stackOut_8_0 = this;
              stackOut_8_1 = 0;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L17;
            }
          }
          L18: {
            ((eo) (this)).field_jb = stackIn_10_1;
            stackOut_10_0 = this;
            stackIn_12_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (0 <= param1) {
              stackOut_12_0 = this;
              stackOut_12_1 = param1;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              break L18;
            } else {
              stackOut_11_0 = this;
              stackOut_11_1 = 0;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              break L18;
            }
          }
          L19: {
            ((eo) (this)).field_K = stackIn_13_1;
            if (!this.field_Wb) {
              this.field_Wb = true;
              this.d((byte) 123);
              break L19;
            } else {
              break L19;
            }
          }
          this.S(-3335);
          this.r((byte) 80);
          return;
        }
    }

    private final void m(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
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
        if (param0 >= 83) {
          this.M(-27581);
          this.b(false);
          this.w(-104);
          var2 = -1 + this.field_Vb;
          L0: while (true) {
            if (-1 >= (var2 ^ -1)) {
              this.e(var2, false);
              this.f(-3485);
              this.u((byte) -23);
              this.p((byte) 114);
              var2--;
              if (var3 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.N(-48);
              this.B((byte) -116);
              this.e((byte) 119);
              this.z((byte) -73);
              this.h(false);
              return;
            }
          }
        } else {
          this.field_nb = 104;
          this.M(-27581);
          this.b(false);
          this.w(-104);
          var2 = -1 + this.field_Vb;
          L1: while (true) {
            if (-1 >= (var2 ^ -1)) {
              this.e(var2, false);
              this.f(-3485);
              this.u((byte) -23);
              this.p((byte) 114);
              var2--;
              if (var3 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              this.N(-48);
              this.B((byte) -116);
              this.e((byte) 119);
              this.z((byte) -73);
              this.h(false);
              return;
            }
          }
        }
    }

    final static void q(int param0) {
        jsa.a(false, 17);
        int var1 = 36 % ((param0 - -38) / 62);
    }

    final int t(int param0) {
        if (param0 != 65280) {
            this.field_tc = (gja) null;
            return this.field_ac;
        }
        return this.field_ac;
    }

    final da a(qla param0, jpa[] param1, boolean param2) {
        RuntimeException var4 = null;
        ca stackIn_1_0 = null;
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
        ca stackOut_0_0 = null;
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
            stackOut_0_0 = new ca((eo) (this), param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("eo.I(");
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

    final ob a(int param0, int param1, int param2, int param3, int param4, float param5) {
        return (ob) ((Object) new jq(param0, param1, param2, param3, param4, param5));
    }

    final int o(byte param0) {
        if (param0 <= 82) {
            this.field_Lc = 103;
            return this.field_Cc;
        }
        return this.field_Cc;
    }

    final asa C(int param0) {
        if (param0 != 0) {
            this.a(-0.6965478658676147f, 12);
            return this.field_hc[this.field_Cc];
        }
        return this.field_hc[this.field_Cc];
    }

    final void T(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        L0: {
          var5 = 0;
          if (this.field_A < param0) {
            var5 = 1;
            this.field_A = param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_C <= param2) {
            break L1;
          } else {
            var5 = 1;
            this.field_C = param2;
            break L1;
          }
        }
        L2: {
          if (param1 > this.field_K) {
            this.field_K = param1;
            var5 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (this.field_jb > param3) {
            this.field_jb = param3;
            var5 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        if (var5 == 0) {
          return;
        } else {
          L4: {
            if (!this.field_Wb) {
              this.field_Wb = true;
              this.d((byte) 125);
              break L4;
            } else {
              break L4;
            }
          }
          this.S(-3335);
          this.r((byte) -125);
          return;
        }
    }

    final jaclib.memory.Stream a(jaclib.memory.Buffer param0, int param1) {
        int discarded$2 = 0;
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
              if (param1 >= 124) {
                break L1;
              } else {
                discarded$2 = this.d(false);
                break L1;
              }
            }
            this.field_y.a(param0);
            stackOut_2_0 = this.field_y;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("eo.RA(");
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        gja stackOut_0_0 = null;
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
            stackOut_0_0 = new gja((eo) (this), param0, param1, param3, param4, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("eo.MB(");
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
        int decompiledRegionSelector0 = 0;
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
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("eo.UF(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void h(byte param0);

    private final void v(byte param0) {
        int discarded$2 = 0;
        L0: {
          this.field_p = false;
          if (null != this.field_pb) {
            this.field_pb.b(true);
            break L0;
          } else {
            break L0;
          }
        }
        this.h(false);
        if (param0 == 94) {
          return;
        } else {
          discarded$2 = this.i();
          return;
        }
    }

    abstract void b(int param0, boolean param1);

    final int g(boolean param0) {
        if (param0) {
            this.field_nc = (mna) null;
            return this.field_u;
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
        Enumeration var2 = null;
        java.awt.Canvas var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_oc.keys();
        L0: while (true) {
          if (!var2.hasMoreElements()) {
            this.field_xb.a(12574);
            this.field_cb.a(12574);
            if (param0 == 6) {
              this.field_hb.a(12574);
              this.field_tb.e((byte) 112);
              this.field_W.e((byte) 126);
              this.field_E.e((byte) 112);
              this.field_n.e((byte) 114);
              this.field_tc.e((byte) 122);
              this.field_kb.a((byte) 86);
              this.field_z.a(param0 ^ 12568);
              return;
            } else {
              this.b(false, (byte) -31);
              this.field_hb.a(12574);
              this.field_tb.e((byte) 112);
              this.field_W.e((byte) 126);
              this.field_E.e((byte) 112);
              this.field_n.e((byte) 114);
              this.field_tc.e((byte) 122);
              this.field_kb.a((byte) 86);
              this.field_z.a(param0 ^ 12568);
              return;
            }
          } else {
            var3 = (java.awt.Canvas) (var2.nextElement());
            this.a(this.field_oc.get(var3), false, var3);
            if (var4 != 0) {
              if (param0 != 6) {
                this.b(false, (byte) -31);
                this.field_hb.a(12574);
                this.field_tb.e((byte) 112);
                this.field_W.e((byte) 126);
                this.field_E.e((byte) 112);
                this.field_n.e((byte) 114);
                this.field_tc.e((byte) 122);
                this.field_kb.a((byte) 86);
                this.field_z.a(param0 ^ 12568);
                return;
              } else {
                this.field_hb.a(12574);
                this.field_tb.e((byte) 112);
                this.field_W.e((byte) 126);
                this.field_E.e((byte) 112);
                this.field_n.e((byte) 114);
                this.field_tc.e((byte) 122);
                this.field_kb.a((byte) 86);
                this.field_z.a(param0 ^ 12568);
                return;
              }
            } else {
              if (var4 == 0) {
                continue L0;
              } else {
                this.field_xb.a(12574);
                this.field_cb.a(12574);
                if (param0 == 6) {
                  this.field_hb.a(12574);
                  this.field_tb.e((byte) 112);
                  this.field_W.e((byte) 126);
                  this.field_E.e((byte) 112);
                  this.field_n.e((byte) 114);
                  this.field_tc.e((byte) 122);
                  this.field_kb.a((byte) 86);
                  this.field_z.a(param0 ^ 12568);
                  return;
                } else {
                  this.b(false, (byte) -31);
                  this.field_hb.a(12574);
                  this.field_tb.e((byte) 112);
                  this.field_W.e((byte) 126);
                  this.field_E.e((byte) 112);
                  this.field_n.e((byte) 114);
                  this.field_tc.e((byte) 122);
                  this.field_kb.a((byte) 86);
                  this.field_z.a(param0 ^ 12568);
                  return;
                }
              }
            }
          }
        }
    }

    final gf a(int param0, byte[] param1, boolean param2, ft param3, int param4, int param5) {
        RuntimeException var7 = null;
        gf stackIn_2_0 = null;
        gf stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gf stackOut_3_0 = null;
        gf stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            if (param4 < -71) {
              stackOut_3_0 = this.a(param2, param1, 0, param0, 1, 0, param3, param5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (gf) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7);
            stackOut_5_1 = new StringBuilder().append("eo.LA(").append(param0).append(',');
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
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final nh a(jpa param0, boolean param1) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var3 = null;
        nh var3_ref = null;
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
        nh stackIn_30_0 = null;
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
        nh stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (-1 == (param0.field_i ^ -1)) {
                    break L3;
                  } else {
                    if (param0.field_a != 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var3_ref = this.a(new int[]{0}, 1, 81, 1, 1, 0);
                if (var10 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              L4: {
                L5: {
                  var12 = new int[param0.field_i * param0.field_a];
                  var11 = var12;
                  var4 = var11;
                  var5 = 0;
                  var6 = 0;
                  if (null == param0.field_h) {
                    break L5;
                  } else {
                    var7 = 0;
                    L6: while (true) {
                      L7: {
                        if (param0.field_a <= var7) {
                          break L7;
                        } else {
                          if (var10 != 0) {
                            break L4;
                          } else {
                            var8 = 0;
                            L8: while (true) {
                              L9: {
                                L10: {
                                  if (param0.field_i <= var8) {
                                    break L10;
                                  } else {
                                    incrementValue$3 = var6;
                                    var6++;
                                    var4[incrementValue$3] = fh.a(param0.field_h[var5] << -1530467880, param0.field_g[sea.c((int) param0.field_f[var5], 255)]);
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
                  if (var7 >= param0.field_a) {
                    break L4;
                  } else {
                    var8 = 0;
                    L12: while (true) {
                      L13: {
                        L14: {
                          if (var8 >= param0.field_i) {
                            break L14;
                          } else {
                            incrementValue$4 = var5;
                            var5++;
                            var9 = param0.field_g[255 & param0.field_f[incrementValue$4]];
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
                                if (0 == var9) {
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
                                  stackOut_23_2 = fh.a(-16777216, var9);
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
              var3_ref = this.a(var12, param0.field_a, 117, param0.field_i, param0.field_i, 0);
              break L1;
            }
            var3_ref.b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
            stackOut_29_0 = (nh) (var3_ref);
            stackIn_30_0 = stackOut_29_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("eo.EB(");
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
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        return stackIn_30_0;
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
