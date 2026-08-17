/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class oe {
    na field_eb;
    private int field_T;
    int[][] field_V;
    static String field_cc;
    private int field_sc;
    int field_Mb;
    private int field_c;
    private int field_S;
    Vector field_kb;
    int field_Fb;
    private int[][] field_Vb;
    private int field_L;
    private va field_Ab;
    boolean field_rc;
    boolean field_gb;
    boolean field_F;
    int field_D;
    static int[] field_xb;
    cn field_k;
    private int field_Rb;
    int field_Q;
    private int field_Yb;
    private int field_nc;
    private int field_P;
    private byte[][] field_Nb;
    private ce field_Y;
    int field_Pb;
    int field_fc;
    int field_n;
    private cn field_vb;
    private od field_Db;
    private oc field_Xb;
    int field_t;
    private int field_I;
    private int field_Kb;
    int field_H;
    private int field_qc;
    private boolean field_lb;
    private int field_ib;
    private int field_Ob;
    private boolean field_W;
    private int field_O;
    private int field_pc;
    private int field_ac;
    private int field_E;
    private int field_mc;
    private int field_x;
    private int field_o;
    private int field_bb;
    private int field_e;
    private boolean field_Bb;
    private int field_Tb;
    private int field_mb;
    private hg field_nb;
    private int field_U;
    private int field_tb;
    private int field_Sb;
    int field_p;
    int field_Ub;
    private int field_hc;
    private int field_gc;
    private cn field_G;
    int field_M;
    private int field_qb;
    boolean field_ec;
    private cn field_N;
    private int field_w;
    boolean field_Jb;
    private int field_J;
    int field_Zb;
    private int field_m;
    private int field_Hb;
    boolean field_Gb;
    int field_ob;
    private boolean field_q;
    private int field_yb;
    private int field_A;
    private cn field_tc;
    boolean field_Ib;
    private boolean field_jc;
    int field_cb;
    private boolean field_rb;
    private int field_pb;
    private int field_ic;
    boolean field_Cb;
    private cn field_hb;
    private int field_u;
    private boolean field_kc;
    private int field_bc;
    private int field_d;
    private int[] field_g;
    private ed field_i;
    boolean field_a;
    private String field_h;
    int field_X;
    private int field_y;
    private int field_sb;
    private int field_Qb;
    private boolean field_db;
    private int[] field_Lb;
    private int field_l;
    private int field_dc;
    private int field_z;
    private int field_ab;
    private int field_j;
    li field_B;
    private cn field_s;
    private boolean field_zb;
    private hl field_f;
    private hl field_wb;
    private m field_fb;
    private hl field_v;
    private hl field_Eb;
    private hl field_Wb;
    private hl field_r;
    private cn field_C;
    hl field_lc;
    private hl field_Z;
    private int field_ub;
    private hl field_jb;
    private hl field_R;
    private int field_oc;
    private boolean field_b;

    private final void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int discarded$0 = 0;
        int var11 = 0;
        int var12 = EscapeVector.field_A;
        int var9 = (param5 << -632036123) - param1;
        if (param3 != 1395798865) {
            oe.c(true, -95);
        }
        int var10 = -param4 + (param2 << 997126533);
        if ((var9 ^ -1) < -1) {
            var10 = this.b(param0, param2, -var9 + 32, -1 + param5, param7, var10, 32, 1299998021);
        }
        for (var11 = param5; (var11 ^ -1) > (param6 ^ -1); var11++) {
            var10 = this.b(param0, param2, 0, var11, param7, var10, 32, 1299998021);
        }
        var11 = 31 & -var9 + 480;
        if ((var11 ^ -1) < -1) {
            discarded$0 = this.b(param0, param2, 0, param6, param7, var10, var11, 1299998021);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int statePc = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        hg var21_ref_hg = null;
        int var21 = 0;
        int var22 = 0;
        int var24 = 0;
        pi var25 = null;
        int[] var26 = null;
        Object var27 = null;
        am var27_ref = null;
        int[] var28 = null;
        Object var29 = null;
        am var29_ref = null;
        int[] var30 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = null;
                    var29 = null;
                    var24 = EscapeVector.field_A;
                    var30 = this.a(param14, -1, param8);
                    var28 = var30;
                    var26 = var28;
                    var16 = var26;
                    if (param1 >= 78) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var25 = (pi) null;
                    this.a((pi) null, -78);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var26 != null) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-1 == (vh.field_i ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    param8 = param8 << 16;
                    param14 = param14 << 16;
                    var17 = param11;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = param9;
                    stackIn_8_1 = var17;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 < stackIn_8_1) {
                        statePc = 61;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var18 = param7;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = var18 ^ -1;
                    stackIn_11_1 = param2 ^ -1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 < stackIn_11_1) {
                        statePc = 60;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var19 = (var18 << -1579586485) + param8;
                    var20 = param14 + (var17 << -348567861);
                    stackIn_8_0 = (param13 - param12) * (var20 - param3);
                    stackIn_13_0 = stackIn_8_0;
                    stackIn_8_1 = (-param12 + var19) * (-param3 + param4);
                    stackIn_13_1 = stackIn_8_1;
                    if (false) {
                        statePc = 8;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (stackIn_13_0 <= stackIn_13_1) {
                        statePc = 36;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (((var19 + -param0) * (-param5 + param4) ^ -1) >= ((-param5 + var20) * (-param0 + param13) ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (((-param5 + param3) * (-param0 + var19) ^ -1) <= ((-param0 + param12) * (var20 + -param5) ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var21_ref_hg = cn.field_f.a(false);
                    var22 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((vh.field_i ^ -1) >= (var22 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var27_ref = (am) ((Object) var21_ref_hg);
                    stackIn_11_0 = var20 ^ -1;
                    stackIn_19_0 = stackIn_11_0;
                    stackIn_11_1 = var27_ref.field_j ^ -1;
                    stackIn_19_1 = stackIn_11_1;
                    if (false) {
                        statePc = 11;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 != stackIn_19_1) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if ((var19 ^ -1) > (var27_ref.field_i ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var27_ref.field_h ^ -1) >= (var19 ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_q = true;
                    return;
                }
                case 23: {
                    var21_ref_hg = var21_ref_hg.field_b;
                    var22++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 24: {
                    if (this.field_rb) {
                        statePc = 59;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var26 == null) {
                        statePc = 59;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (!this.a(var30, var18, (byte) -74, var17)) {
                        statePc = 59;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if ((255 & this.field_I - -24 ^ -1) < -49) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.field_q = true;
                    return;
                }
                case 30: {
                    if (((this.field_hc >> -786964824) * (this.field_hc >> -450318776) + (this.field_mc >> 2140965768) * (this.field_mc >> -1668044184) ^ -1) < -65537) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_q = true;
                    return;
                }
                case 33: {
                    var21 = var19 + -param0;
                    var22 = -param5 + var20;
                    if (var21 * var21 + var22 * var22 < 150994944) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_q = true;
                    return;
                }
                case 35: {
                    this.field_jc = true;
                    statePc = 59;
                    continue stateLoop;
                }
                case 36: {
                    if (((param13 - param10) * (var20 - param6) ^ -1) >= ((param4 + -param6) * (-param10 + var19) ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if ((-param10 + param12) * (var20 - param6) < (param3 + -param6) * (-param10 + var19)) {
                        statePc = 39;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var21_ref_hg = cn.field_f.a(false);
                    var22 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if ((vh.field_i ^ -1) >= (var22 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var29_ref = (am) ((Object) var21_ref_hg);
                    stackIn_11_0 = var20 ^ -1;
                    stackIn_42_0 = stackIn_11_0;
                    stackIn_11_1 = var29_ref.field_j ^ -1;
                    stackIn_42_1 = stackIn_11_1;
                    if (false) {
                        statePc = 11;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 == stackIn_42_1) {
                        statePc = 44;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var29_ref.field_i > var19) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if ((var29_ref.field_h ^ -1) >= (var19 ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.field_q = true;
                    return;
                }
                case 47: {
                    var21_ref_hg = var21_ref_hg.field_b;
                    var22++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 48: {
                    if (this.field_rb) {
                        statePc = 59;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var26 == null) {
                        statePc = 59;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (!this.a(var30, var18, (byte) -74, var17)) {
                        statePc = 59;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if ((255 & 24 + this.field_I ^ -1) < -49) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.field_q = true;
                    return;
                }
                case 54: {
                    if (65536 >= (this.field_mc >> 1911913960) * (this.field_mc >> -68661304) + (this.field_hc >> 83943336) * (this.field_hc >> 1244153832)) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.field_q = true;
                    return;
                }
                case 56: {
                    var21 = -param10 + var19;
                    var22 = -param6 + var20;
                    if ((var22 * var22 + var21 * var21 ^ -1) <= -150994945) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    this.field_kc = true;
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    this.field_q = true;
                    return;
                }
                case 59: {
                    var18++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 60: {
                    var17++;
                    statePc = 7;
                    continue stateLoop;
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, byte param1) {
        if (10 != param0) {
            return;
        }
        this.field_lb = true;
        af.a(0);
        this.a(-128, hd.field_a);
        if (param1 != 59) {
            this.field_oc = -54;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        if ((param4 ^ param6) >> 1982194341 == 0) {
            this.a(param11, 94, param9, param3, param0, param10, param13, param5, param12, param4 & 31, param2, param6 & 31, param1, param8, param6 >> 496863941);
        } else {
            this.a(param11, 106, param9, param3, param0, param10, param13, param5, param12, 31, param2, 31 & param6, param1, param8, param6 >> -1669657531);
            if (!(!this.field_q)) {
                return;
            }
            this.a(param11, 104, param9, param3, param0, param10, param13, param5, param12, param4 & 31, param2, 0, param1, param8, param4 >> 453783365);
        }
        int var15 = -29 / ((param7 - 71) / 38);
    }

    private final int b(int param0, int param1) {
        if (param1 != 16082) {
            return -27;
        }
        return (param0 & 65280) >> -695166424;
    }

    final void D(int param0) {
        int var2 = 0;
        int[][] var3 = null;
        int var5 = 0;
        int var4 = 0;
        if (param0 >= this.field_D) {
            var2 = param0 + 1;
            var3 = new int[this.field_Mb * var2][];
            for (var4 = 0; var4 < this.field_Mb * this.field_D; var4++) {
                var3[var4] = this.field_V[var4];
            }
            var5 = this.field_Mb * this.field_D;
            var4 = var5;
            while (var5 < this.field_Mb * var2) {
                var3[var5] = si.field_v;
                var5++;
            }
            this.field_D = var2;
            this.field_Fb = this.field_D << 5;
            this.field_V = var3;
            return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        hg var8;
        Object var7;
        vh var7_ref;
        L0: {
          L1: {
            param1 = ((this.field_n << 1326342256) + param1) % (this.field_n << -811048912);
            if ((this.field_O ^ -1) == -1) {
              break L1;
            } else {
              if ((this.field_O ^ -1) != (this.field_x ^ -1)) {
                L2: {
                  var7 = null;
                  if (this.field_nb != null) {
                    var7_ref = (vh) ((Object) this.field_nb.field_b);
                    break L2;
                  } else {
                    var7_ref = (vh) ((Object) this.field_G.a(false));
                    break L2;
                  }
                }
                var7_ref.a(param1, false, param5, param2, (byte) -124, param4, param0, 250);
                this.field_x = this.field_x + 1;
                this.field_nb = (hg) ((Object) var7_ref);
                break L0;
              } else {
                break L1;
              }
            }
          }
          var8 = (hg) ((Object) new vh(param1, param0, param5, param2, param4, 250));
          this.field_G.a(-12328, var8);
          this.field_O = this.field_O + 1;
          this.field_x = this.field_x + 1;
          this.field_nb = var8;
          break L0;
        }
        L3: {
          if (param3 == 256) {
            break L3;
          } else {
            this.D(-37);
            break L3;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2, DataInputStream param3) throws IOException {
        vc var5 = new vc(param3, param1);
        vl.b(1, var5.field_c);
        if (param2 != 640) {
            this.x(-13);
        }
        this.field_P = var5.field_c;
        this.field_Yb = var5.field_b;
        if (param0) {
            return;
        }
        try {
            this.field_V = var5.field_d;
            this.field_n = var5.field_h;
            this.field_Fb = var5.field_g;
            this.field_Mb = var5.field_a;
            this.field_D = var5.field_f;
            this.l((byte) 111);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.SF(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void t(int param0) {
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int var2;
        int var3;
        sa var4;
        int var5;
        L0: {
          var5 = EscapeVector.field_A;
          ce.field_f.c(0, this.field_fc, this.field_Pb);
          this.o(0);
          if ((this.field_Pb ^ -1) == -16) {
            if (-1 > (this.field_Rb ^ -1)) {
              break L0;
            } else {
              L1: {
                if (90000 < this.field_cb) {
                  break L1;
                } else {
                  this.a(this.field_fc, false, 9, 246);
                  break L1;
                }
              }
              if (-60001 > (this.field_cb ^ -1)) {
                break L0;
              } else {
                this.a(this.field_fc, false, 10, 245);
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (this.field_ac > 2500) {
            this.a(this.field_fc, false, 6, 249);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (this.field_b) {
            this.a(this.field_fc, false, 7, 248);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 != this.field_Pb) {
            break L4;
          } else {
            if (1700 != this.field_ib) {
              break L4;
            } else {
              this.a(this.field_fc, false, 13, 242);
              break L4;
            }
          }
        }
        L5: {
          if (9 != this.field_Pb) {
            break L5;
          } else {
            if (this.field_db) {
              break L5;
            } else {
              if ((this.field_m ^ -1) <= -1) {
                break L5;
              } else {
                this.a(this.field_fc, false, 14, 241);
                break L5;
              }
            }
          }
        }
        L6: {
          if (-11 != (this.field_Pb ^ -1)) {
            break L6;
          } else {
            var2 = 0;
            var3 = 0;
            L7: while (true) {
              L8: {
                if ((var3 ^ -1) <= (this.field_kb.size() ^ -1)) {
                  stackIn_28_0 = 8;
                  stackIn_28_1 = var2;
                  break L8;
                } else {
                  var4 = (sa) (this.field_kb.elementAt(var3));
                  stackIn_28_0 = var4.field_n;

                  stackIn_28_1 = 2;

                  L9: {
                    if (stackIn_28_0 != stackIn_28_1) {
                      break L9;
                    } else {
                      var2++;
                      break L9;
                    }
                  }
                  var3++;
                  continue L7;
                }
              }
              if (stackIn_28_0 > stackIn_28_1) {
                break L6;
              } else {
                this.a(this.field_fc, false, 15, 240);
                break L6;
              }
            }
          }
        }
        L10: {
          if (-15 != (this.field_Pb ^ -1)) {
            break L10;
          } else {
            if (!this.field_db) {
              this.a(this.field_fc, false, 16, 239);
              break L10;
            } else {
              break L10;
            }
          }
        }
    }

    final int b(int param0, int param1, int param2, int param3) {
        int var6 = EscapeVector.field_A;
        param1 = param1 - this.field_H;
        param3 = param3 - this.field_p;
        while (-this.field_n << -1657314193 > param1) {
            param1 = param1 + (this.field_n << -1669585584);
        }
        while (this.field_n << -914171601 < param1) {
            param1 = param1 - (this.field_n << 1517542768);
        }
        int var5 = (int)Math.sqrt((double)param3 * (double)param3 + (double)param1 * (double)param1);
        if ((var5 ^ -1) >= (param0 ^ -1)) {
            return qm.field_c * 6144 / 64;
        }
        if (param2 != 96) {
            am var7 = (am) null;
            this.a((am) null, (byte) 83);
        }
        return qm.field_c * param0 / (var5 / 96);
    }

    private final String d(boolean param0, int param1) {
        String var3;
        int var4;
        var4 = EscapeVector.field_A;
        if (!param0) {
          L0: {
            L1: {
              var3 = "";
              if ((this.field_tb ^ -1) != -1) {
                break L1;
              } else {
                if (-2 != (param1 ^ -1)) {
                  break L1;
                } else {
                  var3 = ef.field_k;
                  break L0;
                }
              }
            }
            if (param1 != 1) {
              L2: {
                if ((this.field_tb ^ -1) != -1) {
                  break L2;
                } else {
                  if ((param1 ^ -1) != -6) {
                    break L2;
                  } else {
                    var3 = dd.field_b;
                    break L0;
                  }
                }
              }
              if (5 != param1) {
                break L0;
              } else {
                var3 = af.field_g;
                break L0;
              }
            } else {
              var3 = li.field_p;
              break L0;
            }
          }
          return var3;
        } else {
          return (String) null;
        }
    }

    private final void a(int param0, boolean param1) {
        this.s((byte) -41);
        this.field_vb.a((byte) 118);
        this.field_Db = new od((oe) (this));
        this.field_Xb.f((byte) -125);
        if (param0 != 24661) {
            hh var4 = (hh) null;
            this.a(-10, -80, (ed) null, 116, (hh) null);
        }
        ji.a(true);
        this.field_pc = 0;
        this.field_qc = 0;
        this.field_tc = new cn();
        this.field_sb = 0;
    }

    private final void c(int param0) {
        rb var2 = null;
        if (!(this.field_ab <= param0)) {
            this.field_ab = this.field_ab - 1;
            if (!(0 != this.field_ab)) {
                this.field_h = null;
            }
        }
        if (this.field_h == null) {
            var2 = this.B(-27521);
            if (var2 == null) {
                return;
            }
            this.field_h = var2.field_g;
            this.field_ab = var2.field_i;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        this.field_C.a(new am(param2, param0, param1), 8364);
        if (param3 != 2134602960) {
            this.field_j = 65;
        }
        this.field_ub = this.field_ub + 1;
    }

    private final sa a(DataInputStream param0, byte param1, int param2, int param3) throws IOException {
        sa var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        sa stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = param0.readUnsignedByte();
              if ((param3 ^ -1) <= -3) {
                break L1;
              } else {
                if ((var6 ^ -1) <= -9) {
                  var6++;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var7 = param0.readUnsignedShort();
              var8 = -8 / ((param1 - -7) / 47);
              var9 = param0.readUnsignedShort();
              if (-6 < (param3 ^ -1)) {
                var5 = new sa(param2, var6, var7, var9);
                break L2;
              } else {
                var5 = this.a(param0, var7, param3, false, var6, var9, param2);
                break L2;
              }
            }
            L3: {
              if (-3 != (var6 ^ -1)) {
                break L3;
              } else {
                if (11 > param3) {
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackIn_11_0 = (sa) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("oe.IF(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    private final void v(int param0) {
        if (!(-3 == (this.field_fc ^ -1))) {
            return;
        }
        if (!(null != ua.field_c)) {
            return;
        }
        if (!(ua.field_c.c(115))) {
            return;
        }
        int var3 = 28;
        int var4 = var3 ^ 255;
        this.a(this.field_fc, false, var3, var4);
        if (param0 != -33) {
            this.field_O = -80;
        }
    }

    private final int a(uk param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        ga var6 = null;
        ga var7 = null;
        ga var8 = null;
        ga var9 = null;
        int var10 = 0;
        int var11 = 0;
        ga var12 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var12 = param0.field_e;
              var6 = param0.field_d;
              var7 = param0.field_k;
              var8 = param0.field_c;
              if (param1 == 15) {
                break L1;
              } else {
                this.field_kc = false;
                break L1;
              }
            }
            var9 = param0.field_g;
            var10 = var12.field_a + param3 << 2094435435;
            var11 = param2 + var12.field_c << 1531045291;
            if (((var10 + -var6.field_a) * (-var6.field_c + var7.field_c) ^ -1) <= ((-var6.field_a + var7.field_a) * (var11 - var6.field_c) ^ -1)) {
              if ((-var9.field_c + var7.field_c) * (-var9.field_a + var10) < (var11 + -var9.field_c) * (-var9.field_a + var7.field_a)) {
                if ((var11 - var9.field_c) * (var6.field_a - var9.field_a) < (var6.field_c + -var9.field_c) * (var10 - var9.field_a)) {
                  stackIn_14_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                return 0;
              }
            } else {
              L2: {
                if ((var7.field_c + -var8.field_c) * (-var8.field_a + var10) <= (-var8.field_c + var11) * (var7.field_a - var8.field_a)) {
                  break L2;
                } else {
                  if (((var6.field_c - var8.field_c) * (-var8.field_a + var10) ^ -1) <= ((-var8.field_c + var11) * (-var8.field_a + var6.field_a) ^ -1)) {
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("oe.RF(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    private final void l(byte param0) {
        int var2;
        int var4;
        int var3;
        var4 = EscapeVector.field_A;
        this.field_nc = this.field_D;
        if (param0 > 110) {
          this.field_Vb = new int[this.field_V.length][];
          var2 = 0;
          L0: while (true) {
            if (this.field_V.length <= var2) {
              return;
            } else {
              L1: {
                L2: {
                  if (this.field_V[var2] == null) {
                    break L2;
                  } else {
                    if (this.field_V[var2] != si.field_v) {
                      this.field_Vb[var2] = new int[32];
                      var3 = 0;
                      L3: while (true) {
                        if ((var3 ^ -1) <= -33) {
                          break L1;
                        } else {
                          this.field_Vb[var2][var3] = this.field_V[var2][var3];
                          var3++;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_Vb[var2] = this.field_V[var2];
                break L1;
              }
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        ed var2_ref_ed;
        int var3;
        int var4;
        int var2;
        int var5;
        L0: {
          if (!this.field_Gb) {
            break L0;
          } else {
            if (this.field_A != 0) {
              break L0;
            } else {
              L1: {
                var2_ref_ed = ij.field_g;
                var3 = -var2_ref_ed.field_A + 640 >> -987500575;
                var4 = 480 + -var2_ref_ed.field_z >> 770774689;
                if (!this.field_a) {
                  break L1;
                } else {
                  if ((this.field_X ^ -1) > -1) {
                    var5 = 1;
                    var2_ref_ed.a(var3, var4, var5);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var2_ref_ed.e(var3, var4);
              break L0;
            }
          }
        }
        var2 = -51 % ((-2 - param0) / 46);
    }

    private final void a(int param0) {
        int stackIn_15_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        pi var3 = null;
        ic var3_ref = null;
        int var5 = 0;
        L0: {
          var5 = EscapeVector.field_A;
          pl.field_n.b(this.field_jb);
          pl.field_n.b(this.field_Z);
          pl.field_n.b(this.field_v);
          if (null == this.field_R) {
            break L0;
          } else {
            pl.field_n.b(this.field_R);
            break L0;
          }
        }
        L1: {
          if (null == this.field_f) {
            break L1;
          } else {
            pl.field_n.b(this.field_f);
            break L1;
          }
        }
        L2: {
          if (this.field_Eb != null) {
            this.field_Eb.h(0);
            break L2;
          } else {
            break L2;
          }
        }
        pl.field_n.b(this.field_Wb);
        pl.field_n.b(this.field_wb);
        pl.field_n.b(this.field_r);
        pl.field_n.b(this.field_lc);
        pl.field_n.b(this.field_fb);
        var2 = pl.field_n;
        synchronized (var2) {
          L3: {
            var3 = (pi) ((Object) this.field_hb.a(false));
            L4: while (true) {
              L5: {
                if (var3 == null) {
                  stackIn_15_0 = param0;
                  break L5;
                } else {
                  stackIn_15_0 = var3.field_r;

                  L6: {
                    if (stackIn_15_0 == 0) {
                      break L6;
                    } else {
                      pl.field_n.b(var3.field_o);
                      break L6;
                    }
                  }
                  var3 = (pi) ((Object) this.field_hb.b((byte) 70));
                  continue L4;
                }
              }
              L7: {
                if (stackIn_15_0 > 60) {
                  break L7;
                } else {
                  this.a(93, 112, 30, 56, 98, -40, 38, -71);
                  break L7;
                }
              }
              var3_ref = (ic) ((Object) this.field_N.a(false));
              L8: while (true) {
                if (var3_ref == null) {
                  break L3;
                } else {
                  L9: {
                    if (null != var3_ref.field_g) {
                      pl.field_n.b(var3_ref.field_g);
                      pl.field_n.b(var3_ref.field_m);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var3_ref = (ic) ((Object) this.field_N.b((byte) 70));
                  continue L8;
                }
              }
            }
          }
        }
    }

    private final boolean a(boolean param0, int param1, int param2, ed param3) {
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var31 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param2 = param2 + param3.field_q;
                        param1 = param1 + param3.field_v;
                        var5_int = param3.field_s + param2 - 1;
                        var6 = -1 + (param3.field_x + param1);
                        var7 = (double)this.field_I * 0.02454369260617026;
                        var9 = (int)(2048.0 * Math.sin(var7));
                        var10 = -(int)(2048.0 * Math.cos(var7));
                        var11 = -var10;
                        var12 = var9;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_Fb = 6;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var13 = this.field_H >> 15291397;
                        var13 = var13 + (this.field_n << -435032725);
                        var14 = this.field_p >> 1949498693;
                        var15 = var13 + var9 * 10;
                        var16 = var13 + -(2 * var9);
                        var17 = var14 + var10 * 10;
                        var18 = var14 + -(var10 * 2);
                        var19 = var13 + (-(var9 * 6) - 8 * var11);
                        var20 = -(var9 * 6) + var13 - -(var11 * 8);
                        var21 = -(6 * var10) + var14 - var12 * 8;
                        var22 = var12 * 8 + (var14 - 6 * var10);
                        var23 = var15;
                        if ((var23 ^ -1) < (var19 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var23 = var19;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var20 >= var23) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var23 = var20;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var24 = var17;
                        if ((var24 ^ -1) < (var21 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var24 = var21;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var22 < var24) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var24 = var22;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var25 = var15;
                        if ((var25 ^ -1) > (var19 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var25 = var19;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var25 >= var20) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var25 = var20;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var26 = var17;
                        if (var21 > var26) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var26 = var21;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var23 = var23 >> 11;
                        var25 = var25 >> 11;
                        if (var26 < var22) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var26 = var22;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var24 = var24 >> 11;
                        if (var24 >= param1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var24 = param1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var5_int ^ -1) <= (var25 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var25 = var5_int;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((var23 ^ -1) <= (param2 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var23 = param2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var26 = var26 >> 11;
                        if ((var26 ^ -1) >= (var6 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var26 = var6;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var27 = var24;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = var26;
                        stackIn_35_1 = var27;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 < stackIn_35_1) {
                            statePc = 53;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var28 = var23;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var25 ^ -1) > (var28 ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_35_0 = 0;
                        stackIn_39_0 = stackIn_35_0;
                        stackIn_35_1 = param3.field_B[-param2 + ((var27 + -param1) * param3.field_s - -var28)];
                        stackIn_39_1 = stackIn_35_1;
                        if (false) {
                            statePc = 35;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 == stackIn_39_1) {
                            statePc = 51;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var29 = var28 << -1608543221;
                        var30 = var27 << -2092347221;
                        if (((var30 + -var18) * (-var16 + var15) ^ -1) < ((-var16 + var29) * (var17 + -var18) ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((-var21 + var17) * (-var19 + var29) >= (-var19 + var15) * (var30 - var21)) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((-var19 + var16) * (var30 + -var21) ^ -1) <= ((var29 - var19) * (var18 + -var21) ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = 1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return stackIn_44_0 != 0;
                }
                case 45: {
                    try {
                        if ((var17 - var22) * (var29 - var20) > (var30 + -var22) * (-var20 + var15)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var16 - var20) * (var30 + -var22) > (-var22 + var18) * (-var20 + var29)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    return stackIn_50_0 != 0;
                }
                case 51: {
                    try {
                        var28++;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var27++;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    return stackIn_54_0 != 0;
                }
                case 55: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_57_0 = (RuntimeException) (var5);
                    stackIn_56_0 = stackIn_57_0;
                    stackIn_57_1 = new StringBuilder().append("oe.UE(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_56_1 = stackIn_57_1;
                    if (param3 == null) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_58_2 = "{...}";
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackIn_58_2 = "null";
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    throw t.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final hg a(hg param0, int param1, int param2, boolean param3, int param4) {
        Object var6 = null;
        am var6_ref = null;
        RuntimeException var6_ref2 = null;
        am stackIn_8_0 = null;
        am stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                this.field_S = -120;
                break L1;
              }
            }
            L2: {
              if (aa.field_a == 0) {
                break L2;
              } else {
                if ((vh.field_i ^ -1) == (aa.field_a ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    var6 = null;
                    if (param0 == null) {
                      var6_ref = (am) ((Object) cn.field_f.a(false));
                      break L3;
                    } else {
                      var6_ref = (am) ((Object) param0.field_b);
                      break L3;
                    }
                  }
                  vh.field_i = vh.field_i + 1;
                  var6_ref.field_j = param4;
                  var6_ref.field_h = param1;
                  var6_ref.field_i = param2;
                  stackIn_8_0 = (am) (var6_ref);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6_ref = new am(param2, param1, param4);
            cn.field_f.a(-12328, var6_ref);
            aa.field_a = aa.field_a + 1;
            vh.field_i = vh.field_i + 1;
            stackIn_10_0 = (am) (var6_ref);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6_ref2);

            stackIn_13_1 = new StringBuilder().append("oe.BD(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hg) ((Object) stackIn_8_0);
        } else {
          return (hg) ((Object) stackIn_10_0);
        }
    }

    private final boolean a(int param0, ed param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var11 = null;
        RuntimeException var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        hg var16 = null;
        int var17 = 0;
        Object var18 = null;
        am var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var22 = this.a(param6, param4, param3);
                        var21 = var22;
                        var20 = var21;
                        var11 = var20;
                        if (var20 != null) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 == vh.field_i) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        param6 = param6 << 5;
                        param3 = param3 << 5;
                        var12 = param5;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = param7 ^ -1;
                        stackIn_8_1 = var12 ^ -1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 > stackIn_8_1) {
                            statePc = 32;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var13 = param2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = param8;
                        stackIn_11_1 = var13;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 < stackIn_11_1) {
                            statePc = 31;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14 = param9 - -var13;
                        var15 = var12 + param0;
                        stackIn_8_0 = -1;
                        stackIn_13_0 = stackIn_8_0;
                        stackIn_8_1 = param1.field_B[param1.field_s * var15 - -var14] ^ -1;
                        stackIn_13_1 = stackIn_8_1;
                        if (false) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 != stackIn_13_1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var16 = cn.field_f.a(false);
                        var17 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (vh.field_i <= var17) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var18_ref = (am) ((Object) var16);
                        stackIn_11_0 = var12 + param6;
                        stackIn_18_0 = stackIn_11_0;
                        stackIn_11_1 = var18_ref.field_j;
                        stackIn_18_1 = stackIn_11_1;
                        if (false) {
                            statePc = 11;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 == stackIn_18_1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var13 + param3 ^ -1) > (var18_ref.field_i ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var13 + param3 ^ -1) > (var18_ref.field_h ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    try {
                        var16 = var16.field_b;
                        var17++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var20 == null) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!this.a(var22, var13, (byte) -74, var12)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    try {
                        var13++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var12++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0 != 0;
                }
                case 34: {
                    var11_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_36_0 = (RuntimeException) (var11_ref);
                    stackIn_35_0 = stackIn_36_0;
                    stackIn_36_1 = new StringBuilder().append("oe.MB(").append(param0).append(',');
                    stackIn_35_1 = stackIn_36_1;
                    if (param1 == null) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_37_2 = "{...}";
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_37_2 = "null";
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    throw t.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void x(int param0) {
        if (!(!ua.field_c.b(15954, this.field_fc, this.field_Pb))) {
            ua.field_c.a(-15748, this.field_fc, this.field_Pb, oj.k(64));
        }
        if (param0 != 6324320) {
            this.b((byte) 87, 37);
        }
    }

    private final void A(byte param0) {
        double var2;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        hg var23;
        int var24;
        Object var25;
        am var25_ref;
        int var26;
        L0: {
          var25 = null;
          var26 = EscapeVector.field_A;
          var2 = (double)this.field_I * 0.02454369260617026;
          var4 = (int)(Math.sin(var2) * 2048.0);
          var5 = -(int)(Math.cos(var2) * 2048.0);
          var6 = -var5;
          var7 = var4;
          var8 = this.field_H >> 1911908005;
          var8 = var8 + (this.field_n << 1482934859);
          var9 = this.field_p >> -642041499;
          var10 = var4 * 10 + var8;
          var11 = -(2 * var4) + var8;
          var12 = var5 * 10 + var9;
          var13 = 26 / ((-43 - param0) / 47);
          var14 = var9 - var5 * 2;
          var15 = -(8 * var6) + (-(6 * var4) + var8);
          var16 = var6 * 8 + (var8 - var4 * 6);
          var17 = -(8 * var7) + (var9 + -(var5 * 6));
          var18 = -(var5 * 6) + (var9 - -(8 * var7));
          var19 = var10;
          if (var19 > var15) {
            var19 = var15;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var16 < var19) {
            var19 = var16;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var20 = var12;
          if (var17 >= var20) {
            break L2;
          } else {
            var20 = var17;
            break L2;
          }
        }
        L3: {
          if (var20 > var18) {
            var20 = var18;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var21 = var10;
          if (var21 >= var15) {
            break L4;
          } else {
            var21 = var15;
            break L4;
          }
        }
        L5: {
          if (var21 < var16) {
            var21 = var16;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var22 = var12;
          if ((var17 ^ -1) >= (var22 ^ -1)) {
            break L6;
          } else {
            var22 = var17;
            break L6;
          }
        }
        L7: {
          var21 = var21 >> 11;
          var19 = var19 >> 11;
          if ((var22 ^ -1) <= (var18 ^ -1)) {
            break L7;
          } else {
            var22 = var18;
            break L7;
          }
        }
        var20 = var20 >> 11;
        var22 = var22 >> 11;
        this.a(94, var22, var20, var19, var21);
        var23 = cn.field_f.a(false);
        var24 = 0;
        L8: while (true) {
          if (vh.field_i <= var24) {
            L9: {
              if (!this.field_rb) {
                break L9;
              } else {
                if (vh.field_i == 0) {
                  return;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (-1 != ((var21 ^ var19) >> -941723835 ^ -1)) {
                this.a(var12, var11, var15, var14, var22, 31 & var19, var20, -5, var10, 31, var18, var16, var19 >> -724628507, var17);
                if (this.field_q) {
                  return;
                } else {
                  this.a(var12, var11, var15, var14, var22, 0, var20, 112, var10, 31 & var21, var18, var16, var21 >> -2032439387, var17);
                  break L10;
                }
              } else {
                this.a(var12, var11, var15, var14, var22, 31 & var19, var20, -98, var10, var21 & 31, var18, var16, var19 >> -358103195, var17);
                break L10;
              }
            }
            return;
          } else {
            var25_ref = (am) ((Object) var23);
            var23 = var23.field_b;
            var25_ref.field_i = var25_ref.field_i << 11;
            var25_ref.field_h = var25_ref.field_h << 11;
            var25_ref.field_j = var25_ref.field_j << 11;
            var24++;
            continue L8;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        if (((param0 ^ param6) >> 1396028293 ^ -1) != -1) {
            this.a(param4, 31 & param0, param1, param2, param0 >> -62330971, param3, (byte) 119, param7, 31);
            this.a(param4, 0, param1, param2, param6 >> 1546093125, param3, (byte) 123, param7, 31 & param6);
        } else {
            this.a(param4, 31 & param0, param1, param2, param0 >> -1321314331, param3, (byte) 123, param7, 31 & param6);
        }
        if (!param5) {
            this.field_y = 64;
        }
    }

    private final void a(byte param0, DataInputStream param1, int param2) throws IOException {
        try {
            if (-4 < (param2 ^ -1)) {
                this.field_bb = -8388608;
                this.field_t = this.field_n << 910066895;
                this.field_U = 2500;
            } else {
                this.field_t = param1.readInt();
                this.field_bb = param1.readInt();
                this.field_U = param1.readInt();
                if (!(-1 > (this.field_U ^ -1))) {
                    this.field_U = 2500;
                }
            }
            int var4_int = -29 / ((79 - param0) / 37);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        int var12;
        var12 = EscapeVector.field_A;
        if (param5 == 0) {
          L0: while (true) {
            if (-1 <= (param0 ^ -1)) {
              return true;
            } else {
              L1: while (true) {
                if (0 <= param3) {
                  L2: while (true) {
                    if (param3 < this.field_n << -735816528) {
                      L3: {
                        var7 = param3 >> -234856208;
                        var8 = param2 >> 872735504;
                        var9 = var7 & 31;
                        var7 = var7 >> 5;
                        var10 = var8 & 31;
                        var8 = var8 >> 5;
                        if ((var8 ^ -1) <= -1) {
                          if ((var8 ^ -1) > (this.field_D ^ -1)) {
                            var11 = this.field_V[var7 + var8 * this.field_Mb];
                            if (var11 != null) {
                              L4: {
                                if (var11 == si.field_v) {
                                  break L4;
                                } else {
                                  if (-1 != (var11[var10] & 1 << var9 ^ -1)) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              return false;
                            } else {
                              break L3;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          break L3;
                        }
                      }
                      param2 = param2 + param1;
                      param0--;
                      param3 = param3 + param4;
                      continue L0;
                    } else {
                      param3 = param3 - (this.field_n << 1616897616);
                      continue L2;
                    }
                  }
                } else {
                  param3 = param3 + (this.field_n << 1754410416);
                  continue L1;
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    private final boolean i(int param0) {
        int var2 = 92 / ((param0 - -57) / 36);
        if (!(this.field_l != 0)) {
            return false;
        }
        if (!(0 != this.field_Q)) {
            if (!((this.field_l ^ -1) != -2)) {
                return true;
            }
        }
        if (this.field_Q != 1) {
            return false;
        }
        if (this.field_l == 2) {
            return true;
        }
        return false;
    }

    private final void a(int param0, int param1, ed param2, int param3, hh param4) {
        int var6_int = 0;
        oc var7 = null;
        if (param1 != -28311553) {
            return;
        }
        try {
            var6_int = this.n(8192) ? 1 : 0;
            var7 = ci.a((byte) -43, param4, param3, param2, var6_int != 0, param0);
            this.field_vb.a(-12328, var7);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void u(int param0) {
        if (param0 != -15474) {
            this.b(-86, -60, (byte) -9);
            return;
        }
    }

    private final int a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int[] param8) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int[] var11 = null;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_j = -67;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var23 = this.a(param7, (byte) -82, param1);
                        var21 = var23;
                        var18 = var21;
                        var10 = var18;
                        var22 = this.a(param1, -1, param7);
                        var20 = var22;
                        var11 = var20;
                        if (var18 == null) {
                            statePc = 47;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12_ref_int__ = dd.field_a[this.field_P].field_B;
                        if (var18 != si.field_v) {
                            statePc = 26;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var13 = param6;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = var13;
                        stackIn_7_1 = param4;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 >= stackIn_7_1) {
                            statePc = 50;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var14 = 0;
                        var15 = param5;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var15 ^ -1) <= (param2 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_7_0 = param8[var15];
                        stackIn_11_0 = stackIn_7_0;
                        stackIn_7_1 = 3840;
                        stackIn_11_1 = stackIn_7_1;
                        if (false) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 < stackIn_11_1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (0 > var15 + param0) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var11 == null) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (si.field_v == var11) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 != (var22[var13] >>> var15 & 1)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var16 = var12_ref_int__[param8[var15]];
                        if (-1 != (var16 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        em.field_i[param0 + var15] = var16;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var14 = 1;
                        param8[var15] = param8[var15] + 256;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var15++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var14 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param0 = param0 + 640 * (-var13 + param4);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        param0 += 640;
                        var13++;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var13 = param6;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = var13 ^ -1;
                        stackIn_28_1 = param4 ^ -1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 <= stackIn_28_1) {
                            statePc = 50;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var14 = var23[var13];
                        var19 = param5;
                        var15 = var19;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((var19 ^ -1) <= (param2 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_28_0 = -1;
                        stackIn_32_0 = stackIn_28_0;
                        stackIn_28_1 = 1 & var14 >>> var19 ^ -1;
                        stackIn_32_1 = stackIn_28_1;
                        if (false) {
                            statePc = 28;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 == stackIn_32_1) {
                            statePc = 44;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-3841 < (param8[var19] ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param0 - -var19 < 0) {
                            statePc = 43;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var11 == null) {
                            statePc = 43;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (si.field_v == var11) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((1 & var22[var13] >>> var19 ^ -1) != -1) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        param8[var19] = param8[var19] + 256;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var16 = var12_ref_int__[param8[var19]];
                        if (var16 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        em.field_i[param0 + var19] = var16;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        param8[var19] = param8[var19] + 256;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        param8[var19] = ae.a(var19 + (param7 << 1534168677), 255);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var19++;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        param0 += 640;
                        var13++;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        param0 = param0 + 640 * (-param6 + param4);
                        var12 = param5;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((param2 ^ -1) >= (var12 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param8[var12] = ae.a(255, (param7 << 1199552869) - -var12);
                        var12++;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = param0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return stackIn_51_0;
                }
                case 52: {
                    var10_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_54_0 = (RuntimeException) (var10_ref);
                    stackIn_53_0 = stackIn_54_0;
                    stackIn_54_1 = new StringBuilder().append("oe.SD(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
                    stackIn_53_1 = stackIn_54_1;
                    if (param8 == null) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_55_0 = (RuntimeException) ((Object) stackIn_53_0);
                    stackIn_55_1 = (StringBuilder) ((Object) stackIn_53_1);
                    stackIn_55_2 = "{...}";
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
                    stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                    stackIn_55_2 = "null";
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    throw t.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void m(int param0) {
        tj var3 = null;
        tj var4 = null;
        tj var5 = null;
        tj var6 = null;
        tj var7 = null;
        if (!hi.a(this.field_fc, -2)) {
            return;
        }
        if (-1 == (this.field_Pb ^ -1)) {
            sa.a(1, (byte) -86);
        }
        if (!((this.field_Pb ^ -1) != -1)) {
            var3 = new tj(ma.field_c, ae.field_c, se.field_a, false);
            re.a(1820, var3);
        }
        if (!(2 != this.field_Pb)) {
            var4 = new tj(bg.field_c, ae.field_c, ae.field_e, false);
            re.a(1820, var4);
        }
        if (4 == this.field_Pb) {
            var5 = new tj(na.field_i, ae.field_c, co.field_e, false);
            re.a(1820, var5);
        }
        if (!(param0 != (this.field_Pb ^ -1))) {
            var6 = new tj(bj.field_F, ae.field_c, me.field_g, false);
            re.a(param0 + 1829, var6);
        }
        if (!((this.field_Pb ^ -1) != -13)) {
            var7 = new tj(vl.field_c, ae.field_c, tl.field_t, false);
            re.a(1820, var7);
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        double var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        L0: {
          var25 = EscapeVector.field_A;
          var4 = 0.02454369260617026 * (double)this.field_I;
          var6 = (int)(2048.0 * Math.sin(var4));
          var7 = -(int)(Math.cos(var4) * 2048.0);
          var8 = -var7;
          var9 = var6;
          var10 = this.field_H >> -1284677723;
          var10 = var10 + (this.field_n << -2100162901);
          var11 = this.field_p >> -1224287515;
          var12 = var6 * 10 + var10;
          var13 = -(2 * var6) + var10;
          var14 = var11 + var7 * 10;
          var15 = var11 - var7 * 2;
          var16 = var10 - 6 * var6 + -(var8 * 8);
          var17 = var8 * 8 + var10 + -(6 * var6);
          var18 = -(var9 * 8) + (var11 - var7 * 6);
          var19 = -(6 * var7) + (var11 + 8 * var9);
          var20 = 48 % ((param0 - 62) / 40);
          var21 = var12;
          if (var16 >= var21) {
            break L0;
          } else {
            var21 = var16;
            break L0;
          }
        }
        L1: {
          if (var21 <= var17) {
            break L1;
          } else {
            var21 = var17;
            break L1;
          }
        }
        L2: {
          var22 = var14;
          if (var22 > var18) {
            var22 = var18;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var19 < var22) {
            var22 = var19;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var23 = var12;
          if ((var16 ^ -1) >= (var23 ^ -1)) {
            break L4;
          } else {
            var23 = var16;
            break L4;
          }
        }
        L5: {
          if (var17 <= var23) {
            break L5;
          } else {
            var23 = var17;
            break L5;
          }
        }
        L6: {
          var24 = var14;
          if (var18 <= var24) {
            break L6;
          } else {
            var24 = var18;
            break L6;
          }
        }
        L7: {
          if ((var24 ^ -1) > (var19 ^ -1)) {
            var24 = var19;
            break L7;
          } else {
            break L7;
          }
        }
        param2 = param2 << 11;
        param1 = param1 << 11;
        L8: while (true) {
          if (var21 <= param2) {
            L9: {
              if ((var23 ^ -1) > (param2 ^ -1)) {
                break L9;
              } else {
                if (param1 < var22) {
                  break L9;
                } else {
                  if ((var24 ^ -1) > (param1 ^ -1)) {
                    break L9;
                  } else {
                    L10: {
                      if ((param2 + -var13) * (var14 - var15) < (var12 - var13) * (param1 + -var15)) {
                        if ((param2 + -var17) * (-var19 + var14) > (-var19 + param1) * (-var17 + var12)) {
                          if ((var13 + -var17) * (param1 + -var19) > (-var17 + param2) * (var15 - var19)) {
                            this.h((byte) -118);
                            return true;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      } else {
                        if ((-var16 + param2) * (-var18 + var14) >= (-var18 + param1) * (-var16 + var12)) {
                          break L10;
                        } else {
                          if (((param1 - var18) * (-var16 + var13) ^ -1) > ((-var16 + param2) * (-var18 + var15) ^ -1)) {
                            this.h((byte) -62);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    return false;
                  }
                }
              }
            }
            return false;
          } else {
            param2 = param2 + (this.field_n << -1006344693);
            continue L8;
          }
        }
    }

    private final boolean n(byte param0) {
        if (param0 < 26) {
            return false;
        }
        int var2 = 1;
        if (6 == this.field_Yb) {
            var2 = fg.c(0) ? 1 : 0;
        }
        var2 = var2 != 0 & mm.a(4, this.field_P) ? 1 : 0;
        return var2 != 0;
    }

    final int m(byte param0) {
        if (4 > this.field_Pb) {
            return 0;
        }
        if (!(this.field_Pb >= 12)) {
            return 1;
        }
        if (param0 != -84) {
            return -54;
        }
        return 2;
    }

    private final void a(byte[] param0, int param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var3 = null;
            RuntimeException var3_ref = null;
            try {
              L0: {
                try {
                  L1: {
                    this.a((InputStream) ((Object) new ByteArrayInputStream(param0)), false);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3 = (IOException) (Object) decompiledCaughtException;
                    break L2;
                  }
                }
                L3: {
                  if (param1 >= 36) {
                    break L3;
                  } else {
                    this.field_Db = (od) null;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref);

                stackIn_8_1 = new StringBuilder().append("oe.OD(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean k(int param0, int param1, int param2) {
        int var5;
        int var6;
        int var7;
        ed var8;
        L0: {
          var7 = EscapeVector.field_A;
          if (this.field_Ub < 0) {
            break L0;
          } else {
            if (0 != this.field_e) {
              break L0;
            } else {
              var8 = mb.field_f[this.field_Ub];
              var5 = this.field_n + ((this.field_mb - (var8.field_A << 2075331727) >> -845206512) + var8.field_q);
              var6 = (-(var8.field_z << -573167409) + this.field_E >> -2001192912) - -var8.field_v;
              L1: while (true) {
                if ((param1 ^ -1) <= (var5 ^ -1)) {
                  L2: {
                    if ((param1 ^ -1) <= (var8.field_s + var5 ^ -1)) {
                      break L2;
                    } else {
                      if ((param2 ^ -1) > (var6 ^ -1)) {
                        break L2;
                      } else {
                        if ((param2 ^ -1) > (var6 + var8.field_x ^ -1)) {
                          if (var8.field_B[param1 + (param2 - var6) * var8.field_x + -var5] == 0) {
                            return false;
                          } else {
                            this.k((byte) 81);
                            return true;
                          }
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  param1 = param1 + this.field_n;
                  continue L1;
                }
              }
            }
          }
        }
        L3: {
          if (param0 == -2) {
            break L3;
          } else {
            this.field_Nb = (byte[][]) null;
            break L3;
          }
        }
        return false;
    }

    final static void c(boolean param0, int param1) {
        pg.field_b = true;
        if (param1 != 2560) {
            oe.c((byte) 49);
        }
        hm.field_o = new pf(param0);
        di.field_d = null;
        mj.field_d = 0;
        gi.a((byte) -93);
    }

    final void j(int param0) {
        this.e((byte) 94);
        if (param0 != 256) {
            this.b(63, -69, (byte) -63);
        }
        this.l(10974);
    }

    private final void k(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            try {
              L0: {
                L1: {
                  this.a((InputStream) ((Object) new ByteArrayInputStream(this.field_Nb[this.field_Pb])), false);
                  if (param0 <= -123) {
                    break L1;
                  } else {
                    this.a(42, false);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (IOException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final oc i(int param0, int param1) {
        int var3 = this.n(8192) ? 1 : 0;
        if (param1 != -22944) {
            return (oc) null;
        }
        return ma.a(param0, var3 != 0, 8);
    }

    private final boolean a(int[] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -74) {
              if (si.field_v == param0) {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if ((param0[param3] & 1 << param1 ^ -1) == -1) {
                    stackIn_10_0 = 0;
                    break L1;
                  } else {
                    stackIn_10_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("oe.LF(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    private final boolean n(int param0) {
        if (param0 != 8192) {
            return false;
        }
        return -5 == (this.field_P ^ -1) ? true : false;
    }

    private final oc a(sa param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        oc var4 = null;
        oc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = this.n(8192) ? 1 : 0;
              var4 = ee.a(param0, 14, var3_int != 0);
              this.field_vb.a(-12328, var4);
              if (param1 == 42) {
                break L1;
              } else {
                field_xb = (int[]) null;
                break L1;
              }
            }
            stackIn_3_0 = (oc) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("oe.AC(");

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final void b(int param0, int param1, byte param2) {
        ed var4 = null;
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        if (!(-1 >= (this.field_Pb ^ -1))) {
            var4 = qf.field_d;
            if (var4 == null) {
                return;
            }
            for (var5 = -param0; var5 > -1024; var5 -= 1024) {
            }
            while ((var5 ^ -1) > -641) {
                var4.e(480 - -var5, -param1);
                var5 += 1024;
            }
        }
        if (param2 != -14) {
            this.field_fb = (m) null;
        }
    }

    private final void f(int param0, int param1) {
        if (!(this.field_l != 0)) {
            return;
        }
        if (!(param1 == this.field_l)) {
            return;
        }
        this.field_a = true;
        int var3 = 100;
        if (-4 == (param1 ^ -1)) {
            var3 = 164;
        }
        this.a(var3, (byte) 72, di.field_c);
        int var4 = -77 / ((param0 - -30) / 34);
    }

    private final void e(int param0, int param1, int param2) {
        int var10 = EscapeVector.field_A;
        if (!(dd.field_a[this.field_P] != null)) {
            return;
        }
        while (0 > param2) {
            param2 = param2 + this.field_n;
        }
        int var4 = 31 + param2 >> -767699867;
        int var5 = param0 + 16 >> -219405499;
        int var6 = param2 - -640 >> 999639173;
        int var7 = param0 + 480 >> -1127271483;
        int var8 = -param2 + (var4 << 2083070437);
        if (0 < var8) {
            this.a(-1 + var4, var5, param0, var7, 32 - var8, param2, 10943, 32);
        }
        int var9 = var4;
        if (param1 != 8192) {
            this.field_fc = -7;
        }
        while ((var6 ^ -1) < (var9 ^ -1)) {
            this.a(var9, var5, param0, var7, 0, param2, param1 + 2751, 32);
            var9++;
        }
        var9 = 31 & -var8 + 640;
        if (!(var9 <= 0)) {
            this.a(var6, var5, param0, var7, 0, param2, 10943, var9);
        }
    }

    private final void F(int param0) {
        int var2;
        int var3;
        hg var4;
        int var5;
        vh var6;
        int var8;
        hg var7;
        var8 = EscapeVector.field_A;
        var2 = -49 % ((82 - param0) / 43);
        var3 = 0;
        var4 = this.field_G.a(false);
        var5 = 0;
        L0: while (true) {
          if (this.field_x <= var5) {
            this.field_x = this.field_x - var3;
            return;
          } else {
            L1: {
              var6 = (vh) ((Object) var4);
              if (!var6.field_h) {
                var4 = var4.field_b;
                break L1;
              } else {
                L2: {
                  var6.d(-37);
                  var3++;
                  if (0 == this.field_x + -var3) {
                    this.field_nb = null;
                    break L2;
                  } else {
                    if (this.field_nb == var4) {
                      this.field_nb = var4.field_d;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = var4;
                var4 = var4.field_b;
                var7.c((byte) -14);
                this.field_G.a(-12328, var7);
                break L1;
              }
            }
            var5++;
            continue L0;
          }
        }
    }

    private final void f(boolean param0) {
        int var2 = this.field_ob + this.field_J;
        ce.field_f.d((byte) -101, this.field_fc, var2);
        if (param0) {
            this.field_Mb = -77;
        }
    }

    private final void e(byte param0) {
        tj var9 = null;
        tj var5 = null;
        tj var6 = null;
        tj var7 = null;
        tj var8 = null;
        int var4 = EscapeVector.field_A;
        if (!hi.a(this.field_fc, -2)) {
            return;
        }
        int var2 = 95 / ((51 - param0) / 36);
        if (this.field_Pb < 2) {
            var5 = new tj(ma.field_c, ae.field_c, se.field_a, false);
            re.a(1820, var5);
        } else {
            if (this.field_Pb < 4) {
                var6 = new tj(bg.field_c, ae.field_c, ae.field_e, false);
                re.a(1820, var6);
            } else {
                if (-9 < (this.field_Pb ^ -1)) {
                    var7 = new tj(na.field_i, ae.field_c, co.field_e, false);
                    re.a(1820, var7);
                } else {
                    if (-13 < (this.field_Pb ^ -1)) {
                        var8 = new tj(bj.field_F, ae.field_c, me.field_g, false);
                        re.a(1820, var8);
                    } else {
                        var9 = new tj(vl.field_c, ae.field_c, tl.field_t, false);
                        re.a(1820, var9);
                    }
                }
            }
        }
    }

    private final void a(int param0, String param1) {
        try {
            int var3_int = -72 / ((param0 - -38) / 58);
            this.a(100, (byte) 91, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.QB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, hl param1) {
        boolean discarded$0 = false;
        if (!(param1 != null)) {
            return;
        }
        try {
            if (param0 != 4) {
                ed var4 = (ed) null;
                discarded$0 = this.a((ed) null, -82, -79, -108, -58, 107, 91, -47);
            }
            param1.f(0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int[] var9;
        ed var10;
        int[] var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        int[] var18;
        int[] var19;
        L0: {
          var16 = EscapeVector.field_A;
          var19 = this.a(param3, param7 ^ -1299998022, param1);
          var18 = var19;
          var17 = var18;
          var9 = var17;
          if (param7 == 1299998021) {
            break L0;
          } else {
            this.g(-25, 18);
            break L0;
          }
        }
        L1: {
          if (var17 == null) {
            param5 = param5 + (-param2 + param6) * 640;
            break L1;
          } else {
            L2: {
              var10 = tk.field_a[this.field_P];
              var11 = var10.field_B;
              var12 = (param1 << -338564091) % var10.field_s + (param2 + (param3 << 1299998021)) % var10.field_x * var10.field_s;
              if (si.field_v == var17) {
                var13 = param2;
                L3: while (true) {
                  if ((var13 ^ -1) <= (param6 ^ -1)) {
                    break L2;
                  } else {
                    var14 = param0;
                    L4: while (true) {
                      if (param4 <= var14) {
                        var12 = var12 + var10.field_s;
                        param5 += 640;
                        var13++;
                        continue L3;
                      } else {
                        em.field_i[var14 + param5] = var11[var12 - -var14];
                        var14++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var13 = param2;
                L5: while (true) {
                  if (param6 <= var13) {
                    break L2;
                  } else {
                    var14 = var19[var13];
                    var15 = param0;
                    L6: while (true) {
                      L7: {
                        if ((var15 ^ -1) <= (param4 ^ -1)) {
                          stackIn_14_0 = var12;
                          stackIn_14_1 = var10.field_s;
                          break L7;
                        } else {
                          stackIn_14_0 = 0;

                          stackIn_14_1 = var14 >>> var15 & 1;

                          L8: {
                            if (stackIn_14_0 != stackIn_14_1) {
                              em.field_i[var15 + param5] = var11[var12 - -var15];
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var15++;
                          continue L6;
                        }
                      }
                      var12 = stackIn_14_0 + stackIn_14_1;
                      param5 += 640;
                      var13++;
                      continue L5;
                    }
                  }
                }
              }
            }
            break L1;
          }
        }
        return param5;
    }

    private final String r(int param0) {
        if (param0 != 4251) {
            this.q(11);
        }
        return wk.a(ah.field_l, false, sm.field_d, da.field_d[this.field_P], fi.field_j);
    }

    private final void c(int param0, int param1, int param2) {
        ed var4 = sl.field_b[this.field_Yb][3];
        int var5 = -128 / ((43 - param2) / 45);
        if (var4 != null) {
            param1 = param1 + var4.field_z;
        }
        ed var6 = pf.field_g[this.field_Yb];
        if (!(var6 != null)) {
            return;
        }
        this.a(true, false, 94, var6, param1, param0);
    }

    private final void a(int param0, DataInputStream param1, boolean param2) throws IOException {
        int var4_int = 0;
        int var5 = 0;
        sa var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              this.field_L = 0;
              this.field_k = null;
              if (param2) {
                break L1;
              } else {
                this.o((byte) 113);
                break L1;
              }
            }
            this.field_S = 0;
            this.field_Ab = null;
            var4_int = param1.readUnsignedByte();
            this.field_kb.setSize(var4_int);
            var5 = 0;
            L2: while (true) {
              if ((var4_int ^ -1) >= (var5 ^ -1)) {
                break L0;
              } else {
                L3: {
                  var6 = this.a(param1, (byte) -67, var5, param0);
                  this.field_kb.setElementAt(var6, var5);
                  if (var6.e((byte) -5)) {
                    this.field_L = this.field_L + 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("oe.UA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    final boolean g(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (-1 == (this.field_Q ^ -1)) {
          L0: {
            L1: {
              if (!this.field_Ib) {
                break L1;
              } else {
                if (1 != this.field_Ub) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          if (this.field_Q != 1) {
            if (param0 <= -14) {
              return false;
            } else {
              this.field_Nb = (byte[][]) null;
              return false;
            }
          } else {
            L2: {
              L3: {
                if (!this.field_Ib) {
                  break L3;
                } else {
                  if (!this.e(119)) {
                    break L3;
                  } else {
                    stackIn_12_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_12_0 = 0;
              break L2;
            }
            return stackIn_12_0 != 0;
          }
        }
    }

    final void e(int param0, int param1) {
        if ((param0 ^ -1) > -1) {
            return;
        }
        if (param0 >= this.field_Nb.length) {
            return;
        }
        this.field_Pb = param0;
        this.a(false, this.field_Nb[param0], true);
        int var3 = 20 / ((28 - param1) / 51);
    }

    private final void w(int param0) {
        int var3;
        L0: {
          var3 = EscapeVector.field_A;
          if (param0 == this.field_Q) {
            if (this.e(true)) {
              this.field_Ib = true;
              if (1 != this.field_Ub) {
                L1: {
                  if (0 <= this.field_Pb) {
                    break L1;
                  } else {
                    if (!this.field_ec) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
                this.a(-98, ki.field_I);
                break L0;
              } else {
                L2: {
                  vj.b(97);
                  pl.field_n.a(jh.field_k, 100, qm.field_c * 6144 / 64, 8192);
                  if (!this.field_rc) {
                    break L2;
                  } else {
                    L3: {
                      if (this.field_Pb >= 0) {
                        this.field_c = -150;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.x(param0 + 6324320);
                    this.t(7);
                    break L2;
                  }
                }
                this.b((byte) -109, 1);
                break L0;
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (-2 == (this.field_Q ^ -1)) {
            if (!this.e(98)) {
              if (this.e(true)) {
                this.field_Ib = true;
                pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
                this.a(param0 ^ -101, jl.field_c);
                break L4;
              } else {
                break L4;
              }
            } else {
              L5: {
                if (!this.i(-108)) {
                  break L5;
                } else {
                  if (this.e(true)) {
                    break L5;
                  } else {
                    return;
                  }
                }
              }
              L6: {
                this.field_Ib = true;
                vj.b(104);
                pl.field_n.a(jh.field_k, 100, 6144 * qm.field_c / 64, 8192);
                if (this.field_rc) {
                  L7: {
                    if (0 <= this.field_Pb) {
                      this.field_c = -150;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.x(param0 + 6324320);
                  this.t(7);
                  break L6;
                } else {
                  break L6;
                }
              }
              this.b((byte) -124, 1);
              break L4;
            }
          } else {
            break L4;
          }
        }
    }

    private final void a(int param0, byte param1, String param2) {
        rb var4 = null;
        int[] discarded$0 = null;
        try {
            var4 = new rb(param2, param0);
            if (param1 <= 52) {
                discarded$0 = this.a(-114, (byte) -86, 65);
            }
            this.field_tc.a(-12328, var4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.SB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void g(int param0, int param1) {
        if (param0 != 320) {
            this.field_tb = -112;
        }
        int var3 = 0;
        if (-13 == (param1 ^ -1)) {
            var3 = 1;
        }
        if (param1 == 13) {
            var3 = 5;
        }
        if (!(0 != var3)) {
            return;
        }
        String var4 = this.d(false, var3);
        this.a(param0 + -430, var4);
        this.field_tb = this.field_tb + var3;
        bf.a(var3, -15655);
    }

    final void y(byte param0) {
        this.m(-9);
        if (param0 != -40) {
            this.field_dc = -86;
        }
        this.C(-122);
    }

    private final void a(int param0, DataInputStream param1, int param2) throws IOException {
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            this.field_qb = param0;
            if ((param2 ^ -1) > -9) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4_int = param1.readUnsignedShort();
                if (-513 == (var4_int ^ -1)) {
                  this.field_qb = 512;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4_int == 768) {
                  this.field_qb = 768;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (16 != var4_int) {
                  break L3;
                } else {
                  this.field_qb = 16;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("oe.RB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final rb B(int param0) {
        if (this.field_tc == null) {
            return null;
        }
        if (param0 != -27521) {
            this.a(-27, true);
        }
        if (this.field_tc.a(-97)) {
            return null;
        }
        hg var2 = this.field_tc.a(false);
        if (var2 == null) {
            return null;
        }
        var2.c((byte) -59);
        return (rb) ((Object) var2);
    }

    private final int a(int param0, int param1) {
        int var3 = 51 / ((-3 - param0) / 63);
        return param1 & 255;
    }

    private final void E(int param0) {
        tj var2 = null;
        String var2_ref = null;
        String var3 = null;
        ed[] var4 = null;
        String[] var5 = null;
        tj var6 = null;
        if (!(!hi.a(this.field_fc, -2))) {
            var2 = new tj(fn.field_e, ae.field_c, mb.field_b, true);
            var2.field_m = false;
            re.a(1820, var2);
        }
        if (!((this.field_fc ^ -1) != param0)) {
            var2_ref = "vengeance_concl";
            var3 = "scene";
            var4 = ug.field_a;
            var5 = de.field_h;
            var6 = new tj(var2_ref, var3, var4, var5, true);
            re.a(1820, var6);
        }
    }

    private final boolean t(byte param0) {
        int var5 = 0;
        ce var6 = null;
        int var2 = 1;
        int var3 = this.c(true);
        if (param0 != -48) {
            this.field_g = (int[]) null;
        }
        boolean[] var4 = wk.field_b;
        if (var4 != null && -1 >= (var3 ^ -1) && (var4.length ^ -1) < (var3 ^ -1)) {
            var2 = var4[var3] ? 1 : 0;
        }
        if (!(null == this.field_Db)) {
            var5 = 0;
            var6 = this.field_Db.b(true);
            if (!(var6 == null)) {
                var2 = var5;
            }
        }
        return var2 != 0;
    }

    private final int s(int param0) {
        int var5 = 0;
        int var2 = -1;
        int var3 = this.c(true);
        if (param0 != -68661304) {
            ed var6 = (ed) null;
            this.a(-94, (ed) null, -116, 123);
        }
        int[] var4 = wi.field_h;
        if (var4 != null && (var3 ^ -1) <= -1 && var3 < var4.length && var4[var3] >= 0) {
            var2 = var4[var3];
        }
        if (!(null == this.field_Db)) {
            var5 = this.field_Db.c(true);
            if ((var5 ^ -1) <= -1) {
                var2 = var5;
            }
        }
        return var2;
    }

    private final void o(byte param0) {
        int var3 = 0;
        int var2 = 124 % ((param0 - 56) / 62);
        if (this.field_Bb) {
            var3 = 10053375;
            em.g(319, 239, 10, var3, 48);
            em.g(320, 239, 10, var3, 48);
            em.g(319, 240, 10, var3, 48);
            em.g(320, 240, 10, var3, 48);
        }
    }

    private final void i(int param0, int param1, int param2) {
        param2 -= 64;
        this.a(this.r((byte) 90), false, 117, sl.field_b[this.field_Yb][0], (-param2 >> -1856356093) - (this.field_pc >> -12112863), -param1 >> -1729454909);
        int var4 = 26 / ((16 - param0) / 39);
        this.h(-1, param2);
        this.a(false, false, 124, sl.field_b[this.field_Yb][1], -param2 * 5 >> -774923805, 5 * -param1 >> -1913984381);
        this.a(false, false, 74, sl.field_b[this.field_Yb][2], -param2 + (param2 >> 38426274), (param1 >> -1021480446) + -param1);
        this.a(false, true, 92, sl.field_b[this.field_Yb][3], (param2 >> -1927967901) - param2, -param1 + (param1 >> -1340688445));
        this.c(-param1 + (param1 >> 1164719139), -param2 + (param2 >> -276113053), -36);
        this.g(param2, -7778, param1);
    }

    private final void a(boolean param0, int param1, InputStream param2) throws IOException {
        DataInputStream var4 = null;
        int var5 = 0;
        try {
            var4 = new DataInputStream(param2);
            var5 = var4.readByte();
            this.a(var5, var4, (byte) 126);
            this.a(var5, -8277, var4);
            this.a(param0, var5, 640, var4);
            this.a(var5, var4, true);
            this.b(var5, var4, (byte) -17);
            this.a((byte) 121, var4, var5);
            if (param1 != -1) {
                this.q((byte) -88);
            }
            this.b(-112, var4, var5);
            this.a(var4, var5, (byte) 71);
            this.a(512, var4, var5);
            var4.close();
            this.field_rb = false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.FD(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        if (this.field_e > 0) {
            this.field_e = this.field_e - 1;
            if (!((this.field_e ^ -1) != -1)) {
                this.k(-123, this.field_Ub);
                pl.field_n.a(nm.field_a, 100, qm.field_c * 6144 / 64, 8192);
                var2 = qj.a((byte) -38, this.field_Ub, this.field_fc);
                this.field_J = this.field_J + var2;
                v.a(8, var2);
                this.field_Ub = -1;
                if (!(!this.field_rc)) {
                    this.field_u = this.field_u + 1;
                    mh.a((byte) 119);
                    if ((this.field_u ^ -1) == -20) {
                        this.a(this.field_fc, false, 11, 244);
                    }
                }
            }
        }
        if (!param0) {
            this.field_Gb = true;
        }
    }

    private final boolean a(ed param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param6 == 31) {
              if ((param5 ^ param2) >> -1384464251 == 0) {
                stackIn_10_0 = this.a(-(31 & param2), param0, param3, param1, param6 + -32, 31 & param2, param2 >> 823115461, param5 & 31, param7, param4);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (!this.a(-(31 & param2), param0, param3, param1, -1, 31 & param2, param2 >> -937096347, 31, param7, param4)) {
                  stackIn_8_0 = this.a(-param2 & 31, param0, param3, param1, -1, 0, param5 >> -1987197243, 31 & param5, param7, param4);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var9);

            stackIn_13_1 = new StringBuilder().append("oe.RA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    private final int g(int param0) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        int var2 = 0;
        for (var3 = 0; var3 < this.field_fc; var3++) {
            var2 = var2 + je.a(false, var3);
        }
        var2 = var2 + this.field_Pb;
        if (param0 != 20824) {
            this.field_M = -70;
        }
        return var2;
    }

    private final void p(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int var2_int;
        ed var2;
        ed var3_ref_ed;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        sa var8;
        L0: {
          var7 = EscapeVector.field_A;
          if (this.field_Pb >= 0) {
            break L0;
          } else {
            if (this.field_zb) {
              break L0;
            } else {
              if (-1 <= (this.field_z ^ -1)) {
                L1: {
                  if (this.field_Gb) {
                    break L1;
                  } else {
                    if (this.field_Ib) {
                      break L1;
                    } else {
                      if (this.field_ec) {
                        break L1;
                      } else {
                        L2: {
                          if ((this.field_ab ^ -1) <= -61) {
                            break L2;
                          } else {
                            L3: {
                              if ((this.field_y ^ -1) != -1) {
                                break L3;
                              } else {
                                if (58720256 > this.field_p) {
                                  this.field_y = 1;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L4: {
                              if (-2 != (this.field_y ^ -1)) {
                                break L4;
                              } else {
                                if (!this.field_rb) {
                                  break L4;
                                } else {
                                  this.field_y = 2;
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              if (this.field_y > 3) {
                                break L5;
                              } else {
                                if ((this.field_p ^ -1) <= -33554433) {
                                  break L5;
                                } else {
                                  this.field_y = 4;
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              L7: {
                                if (4 == this.field_y) {
                                  break L7;
                                } else {
                                  if ((this.field_y ^ -1) != -6) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (-33554433 < (this.field_p ^ -1)) {
                                break L6;
                              } else {
                                this.field_y = 3;
                                break L6;
                              }
                            }
                            L8: {
                              if (4 != this.field_y) {
                                break L8;
                              } else {
                                if (this.field_db) {
                                  this.field_y = 5;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if ((this.field_Ub ^ -1) != -2) {
                                break L9;
                              } else {
                                if ((this.field_y ^ -1) <= -7) {
                                  break L9;
                                } else {
                                  this.field_y = 6;
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              var2_int = 0;
                              if (-20971521 >= (this.field_p ^ -1)) {
                                break L10;
                              } else {
                                if (this.field_y < 5) {
                                  break L10;
                                } else {
                                  if (0 >= this.field_kb.size()) {
                                    break L10;
                                  } else {
                                    var8 = (sa) (this.field_kb.elementAt(0));
                                    if (var8.field_n == 8) {
                                      var2_int = 1;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            L11: {
                              if (var2_int != 0) {
                                this.field_y = 7;
                                break L11;
                              } else {
                                if (this.field_y == 7) {
                                  if (this.field_Ub >= 0) {
                                    this.field_y = 8;
                                    break L11;
                                  } else {
                                    this.field_y = 5;
                                    break L11;
                                  }
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (this.field_y != 8) {
                              break L2;
                            } else {
                              if (20971520 > this.field_p) {
                                break L2;
                              } else {
                                this.field_y = 9;
                                break L2;
                              }
                            }
                          }
                        }
                        L12: {
                          if ((this.field_y ^ -1) == (this.field_dc ^ -1)) {
                            break L12;
                          } else {
                            L13: {
                              if (this.field_Qb <= 0) {
                                break L13;
                              } else {
                                this.field_Qb = this.field_Qb - 1;
                                break L13;
                              }
                            }
                            if ((this.field_Qb ^ -1) != -1) {
                              break L12;
                            } else {
                              this.field_dc = this.field_y;
                              var2 = this.field_i;
                              this.field_i.field_A = 638;
                              var2.field_s = 638;
                              var3_ref_ed = this.field_i;
                              this.field_i.field_z = 60;
                              var3_ref_ed.field_x = 60;
                              this.field_i.g();
                              em.d();
                              fh.field_g.c(ic.field_k[3 * this.field_y], 319, 20, 16777215, -1);
                              fh.field_g.c(ic.field_k[this.field_y * 3 + 1], 319, 40, 16777215, -1);
                              fh.field_g.c(ic.field_k[2 + this.field_y * 3], 319, 60, 16777215, -1);
                              md.field_D.a(126);
                              break L12;
                            }
                          }
                        }
                        if ((this.field_dc ^ -1) != (this.field_y ^ -1)) {
                          break L0;
                        } else {
                          if (this.field_Qb >= 31) {
                            break L0;
                          } else {
                            this.field_Qb = this.field_Qb + 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                L14: {
                  if (-32 <= this.field_c) {
                    break L14;
                  } else {
                    if (this.field_Qb >= 31) {
                      break L0;
                    } else {
                      break L14;
                    }
                  }
                }
                if ((this.field_Qb ^ -1) < -1) {
                  this.field_Qb = this.field_Qb - 1;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                L15: {
                  if (0 >= this.field_Qb) {
                    break L15;
                  } else {
                    this.field_Qb = this.field_Qb - 1;
                    break L15;
                  }
                }
                if (this.field_Qb == 0) {
                  this.field_zb = true;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L16: {
          if (param0 == 9) {
            break L16;
          } else {
            this.b(-119, (byte) 66, 9);
            break L16;
          }
        }
        L17: {
          L18: {
            if (-1 >= (this.field_Pb ^ -1)) {
              break L18;
            } else {
              if (!this.field_zb) {
                break L17;
              } else {
                break L18;
              }
            }
          }
          L19: {
            if (-1 > (this.field_Qb ^ -1)) {
              this.field_Qb = this.field_Qb - 1;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            L21: {
              L22: {
                if ((this.field_Qb ^ -1) != -1) {
                  break L22;
                } else {
                  if (-1 > (this.field_z ^ -1)) {
                    this.field_d = 0;
                    L23: while (true) {
                      L24: {
                        if ((this.field_z ^ -1) >= -1) {
                          break L24;
                        } else {
                          stackIn_86_0 = this.field_d;

                          stackIn_86_1 = 3;

                          if (stackIn_86_0 >= stackIn_86_1) {
                            break L24;
                          } else {
                            fieldTemp$0 = this.field_d;
                            this.field_d = this.field_d + 1;
                            this.field_g[fieldTemp$0] = this.field_Lb[0];
                            this.field_z = this.field_z - 1;
                            qg.a(this.field_Lb, 1, this.field_Lb, 0, this.field_z);
                            continue L23;
                          }
                        }
                      }
                      this.field_i.field_A = -20 + this.field_d * 160;
                      this.field_i.field_s = -20 + this.field_d * 160;
                      this.field_Qb = 150;
                      this.field_i.field_z = 40;
                      var2 = this.field_i;
                      var2.field_x = 40;
                      this.field_i.g();
                      em.d();
                      var3 = 0;
                      var4 = 0;
                      L25: while (true) {
                        if ((var4 ^ -1) <= (this.field_d ^ -1)) {
                          md.field_D.a(113);
                          break L22;
                        } else {
                          var5 = this.field_g[var4];
                          mi.field_m[var5].e(var3, 4);
                          var6 = 39 + -(fh.field_g.a(hk.field_r[var5], 100) * 10);
                          fh.field_g.a(hk.field_r[var5], var3 - -40, var6 + -fh.field_g.field_r, 100, 1000, 16777215, -1, 0, 0, 20);
                          var3 += 160;
                          var4++;
                          continue L25;
                        }
                      }
                    }
                  } else {
                    break L22;
                  }
                }
              }
              if (this.field_Qb != 0) {
                break L20;
              } else {
                stackIn_86_0 = this.field_z ^ -1;
                stackIn_86_1 = -1;
                break L21;
              }
            }
            if (stackIn_86_0 != stackIn_86_1) {
              break L20;
            } else {
              if (0 > this.field_Pb) {
                this.field_zb = false;
                this.field_dc = -1;
                this.p((byte) 9);
                break L20;
              } else {
                break L17;
              }
            }
          }
          break L17;
        }
    }

    private final ce w(byte param0) {
        ce var5 = null;
        Object var2 = null;
        int var3 = this.c(true);
        ce[] var4 = rk.field_d;
        if (var4 != null && (var3 ^ -1) <= -1 && var4.length > var3) {
            if (!(var4[var3] == null)) {
                var2 = var4[var3];
            }
        }
        if (param0 >= -122) {
            this.field_C = (cn) null;
        }
        if (this.field_Db != null) {
            var5 = this.field_Db.b(true);
            if (!(var5 == null)) {
                var2 = var5;
            }
        }
        return (ce) (var2);
    }

    private final sa b(boolean param0) {
        int var2;
        int var3;
        sa var4;
        int var5;
        var5 = EscapeVector.field_A;
        if (this.field_kb != null) {
          var2 = this.field_kb.size();
          var3 = 0;
          if (!param0) {
            L0: while (true) {
              if (var2 > var3) {
                var4 = (sa) (this.field_kb.elementAt(var3));
                if ((var4.field_n ^ -1) != -2) {
                  var3++;
                  continue L0;
                } else {
                  return var4;
                }
              } else {
                return null;
              }
            }
          } else {
            return (sa) null;
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, byte param1) {
        int discarded$0 = 0;
        if (param0 != 5) {
            return;
        }
        String var3 = b.field_a;
        this.a(param1 ^ 101, var3);
        if (param1 != -9) {
            discarded$0 = this.b(-46, -122);
        }
    }

    private final void b(byte param0, int param1) {
        if (aj.b(-100)) {
            return;
        }
        if (od.field_k) {
            return;
        }
        int var3 = this.g(20824);
        if (param0 >= -99) {
            this.field_F = true;
        }
        if (!(-1 >= (var3 ^ -1))) {
            return;
        }
        int var4 = this.field_sb / (th.field_p + 1);
        if (!(var4 >= 0)) {
            return;
        }
        ua.a(var3, var4, param1, 1);
    }

    private final void j(int param0, int param1, int param2) {
        int var4;
        int var5;
        sa var6;
        ed var7;
        int var8;
        int var9;
        int var10;
        var10 = EscapeVector.field_A;
        var4 = -54 / ((param0 - 18) / 38);
        var5 = 0;
        L0: while (true) {
          if (this.field_kb.size() <= var5) {
            return;
          } else {
            L1: {
              var6 = (sa) (this.field_kb.elementAt(var5));
              if (-7 == (var6.field_n ^ -1)) {
                break L1;
              } else {
                if (-8 != (var6.field_n ^ -1)) {
                  var7 = var6.field_i;
                  var8 = var7.field_v + var6.field_g;
                  if (param1 < var8) {
                    break L1;
                  } else {
                    if (param1 >= var7.field_x + var8) {
                      break L1;
                    } else {
                      var9 = var6.field_k + var7.field_q;
                      L2: while (true) {
                        if ((param2 ^ -1) >= (var9 ^ -1)) {
                          L3: while (true) {
                            if (param2 >= var9) {
                              if ((var7.field_s + var9 ^ -1) < (param2 ^ -1)) {
                                if (var7.field_B[(param1 - var8) * var7.field_s + (-var9 + param2)] != 0) {
                                  this.a(var6, -120, var5);
                                  return;
                                } else {
                                  break L1;
                                }
                              } else {
                                break L1;
                              }
                            } else {
                              var9 = var9 - this.field_n;
                              continue L3;
                            }
                          }
                        } else {
                          var9 = var9 + this.field_n;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var5++;
            continue L0;
          }
        }
    }

    private final void f(int param0, int param1, int param2) {
        int var4;
        ic var5;
        int var6;
        int var7;
        int var8;
        ed var9;
        int var10;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        var10 = EscapeVector.field_A;
        var4 = this.n(8192) ? 1 : 0;
        if (param2 == 8) {
          var5 = (ic) ((Object) this.field_N.a(false));
          L0: while (true) {
            if (var5 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (null == var5.field_m) {
                    break L2;
                  } else {
                    if ((65536 & var5.field_m.field_r ^ -1) == -1) {
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              var6 = stackIn_8_0;
              var7 = -16 + (var5.field_p >> 1591496432) - param0;
              stackIn_9_0 = -param1 + (var5.field_q >> -1243546160) - 16;
              L3: while (true) {
                var8 = stackIn_9_0;
                L4: while (true) {
                  if ((-od.field_b.field_A ^ -1) <= (var7 ^ -1)) {
                    var7 = var7 + this.field_n;
                    L5: while (true) {
                      if (640 <= var7) {
                        var5 = (ic) ((Object) this.field_N.b((byte) 70));
                        continue L0;
                      } else {
                        var9 = s.field_H;
                        stackIn_9_0 = var4;

                        L6: {
                          if (stackIn_9_0 == 0) {
                            break L6;
                          } else {
                            if (null == ka.field_a) {
                              break L6;
                            } else {
                              var9 = ka.field_a;
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var9.e(8 + var7, var8 + 8);
                          if (var6 == 0) {
                            break L7;
                          } else {
                            od.field_b.c(var7, var8, 128);
                            break L7;
                          }
                        }
                        var7 = var7 + this.field_n;
                        continue L5;
                      }
                    }
                  } else {
                    var7 = var7 - this.field_n;
                    continue L4;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(ed param0, int param1, int param2, byte param3) {
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param2 = param2 + param0.field_q;
                        param1 = param1 + param0.field_v;
                        var5_int = -1 + param2 + param0.field_s;
                        var6 = -1 + param0.field_x + param1;
                        var7 = this.field_H >> 596434981;
                        var9 = -53 % ((32 - param3) / 41);
                        var7 = var7 + (this.field_n << 1258293163);
                        var8 = this.field_p >> -1699990107;
                        var10 = var7 - 24576;
                        var11 = -24576 + var8;
                        var12 = 24576 + var7;
                        var13 = var8 - -24576;
                        var12 = var12 >> 11;
                        var10 = var10 >> 11;
                        var11 = var11 >> 11;
                        if (var10 >= param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var10 = param2;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var5_int < var12) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var12 = var5_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var13 = var13 >> 11;
                        if (var11 < param1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var11 = param1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var6 ^ -1) <= (var13 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var13 = var6;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var14 = var11;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = var14;
                        stackIn_13_1 = var13;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 > stackIn_13_1) {
                            statePc = 27;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var15 = var10;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var12 < var15) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var16 = (var15 << 546673995) - var7;
                        var17 = -var8 + (var14 << 1499119147);
                        var18 = var16 * var16 + var17 * var17;
                        stackIn_13_0 = var18;
                        stackIn_17_0 = stackIn_13_0;
                        stackIn_13_1 = 603979776;
                        stackIn_17_1 = stackIn_13_1;
                        if (false) {
                            statePc = 13;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 >= stackIn_17_1) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((param0.field_B[-param2 + ((var14 - param1) * param0.field_s + var15)] ^ -1) == -1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_Hb = this.field_Hb + var16;
                        this.field_pb = this.field_pb + var17;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var15++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var14++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_25_0 = (RuntimeException) (var5);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = new StringBuilder().append("oe.NC(");
                    stackIn_24_1 = stackIn_25_1;
                    if (param0 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void o(int param0) {
        boolean discarded$0 = false;
        this.u((byte) 102);
        this.v(-33);
        if (param0 != 0) {
            ed var3 = (ed) null;
            discarded$0 = this.a((ed) null, -1, 116, -120, 58, 99, 61, 108);
        }
    }

    private final void a(int param0, int param1, byte param2) {
        sa discarded$0 = null;
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        if (!(tk.field_a[this.field_P] != null)) {
            return;
        }
        if (param2 >= -53) {
            discarded$0 = this.b(false);
        }
        while (-1 < (param1 ^ -1)) {
            param1 = param1 + this.field_n;
        }
        int var4 = 31 + param1 >> 609347941;
        int var5 = param0 - -31 >> -205547931;
        int var6 = 640 + param1 >> -721256219;
        int var7 = 480 + param0 >> 689260805;
        int var8 = (var4 << -1385988091) + -param1;
        if (!(-1 <= (var8 ^ -1))) {
            this.c(-var8 + 32, param0, var4 - 1, 1395798865, param1, var5, var7, 32);
        }
        for (var9 = var4; var9 < var6; var9++) {
            this.c(0, param0, var9, 1395798865, param1, var5, var7, 32);
        }
        var9 = -var8 + 640 & 31;
        if (!(0 >= var9)) {
            this.c(0, param0, var6, 1395798865, param1, var5, var7, var9);
        }
    }

    private final void b(boolean param0, int param1) {
        if (!(-12 == (param1 ^ -1))) {
            return;
        }
        this.field_ib = 2550;
        bh.c(-64);
        if (param0) {
            this.field_O = -101;
        }
        this.a(113, oh.field_g);
    }

    private final void a(boolean param0, boolean param1, int param2, ed param3, int param4, int param5) {
        int var8 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            if (param3 != null) {
              param4 -= 48;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((param4 ^ -1) <= -481) {
                      break L3;
                    } else {
                      L4: while (true) {
                        stackIn_17_0 = param5 ^ -1;

                        stackIn_17_1 = -1;

                        if (stackIn_17_0 >= stackIn_17_1) {
                          L5: while (true) {
                            if (param5 >= 640) {
                              param4 = param4 + param3.field_z;
                              if (!param0) {
                                break L3;
                              } else {
                                continue L1;
                              }
                            } else {
                              param3.e(param5, param4);
                              param5 = param5 + param3.field_A;
                              continue L5;
                            }
                          }
                        } else {
                          param5 = param5 - param3.field_A;
                          continue L4;
                        }
                      }
                    }
                  }
                  L6: {
                    if (!param1) {
                      break L6;
                    } else {
                      if (480 > param4) {
                        var7_int = param3.field_B[(-1 + param3.field_x) * param3.field_s];
                        em.a(0, param4, 640, 480 + -param4, var7_int);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackIn_17_0 = param2;
                  stackIn_17_1 = 66;
                  break L2;
                }
                L7: {
                  if (stackIn_17_0 >= stackIn_17_1) {
                    break L7;
                  } else {
                    oe.c((byte) -67);
                    break L7;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("oe.HD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, DataInputStream param1, int param2) throws IOException {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -5) {
                this.field_gc = 150;
                break L1;
              } else {
                this.field_gc = param1.readInt();
                if (-1 > (this.field_gc ^ -1)) {
                  break L1;
                } else {
                  this.field_gc = 150;
                  break L1;
                }
              }
            }
            var4_int = -51 % ((10 - param0) / 61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("oe.HF(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int statePc = 0;
        int var3 = 0;
        sa var4 = null;
        int var5_int = 0;
        en var5 = null;
        sa var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        sa var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = EscapeVector.field_A;
                    this.field_ub = 0;
                    this.field_b = false;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackIn_2_0 = this.field_kb.size() ^ -1;
                    stackIn_2_1 = var3 ^ -1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 >= stackIn_2_1) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var10 = (sa) (this.field_kb.elementAt(var3));
                    var10.a(true, (oe) (this));
                    stackIn_17_0 = -7;
                    stackIn_4_0 = stackIn_17_0;
                    stackIn_17_1 = var10.field_n ^ -1;
                    stackIn_4_1 = stackIn_17_1;
                    if (false) {
                        statePc = 17;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 != stackIn_4_1) {
                        statePc = 15;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5_int = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((var5_int ^ -1) <= (this.field_kb.size() ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6 = (sa) (this.field_kb.elementAt(var5_int));
                    stackIn_2_0 = -8;
                    stackIn_8_0 = stackIn_2_0;
                    stackIn_2_1 = var6.field_n ^ -1;
                    stackIn_8_1 = stackIn_2_1;
                    if (false) {
                        statePc = 2;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 != stackIn_8_1) {
                        statePc = 14;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var10.field_g != var6.field_g) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var7 = (20 + var10.field_k) % this.field_n;
                    var8 = var6.field_k;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if ((var7 ^ -1) >= (var8 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var8 = var8 + this.field_n;
                    statePc = 11;
                    continue stateLoop;
                }
                case 13: {
                    this.a(var8, var10.field_g + 14, var7, 2134602960);
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    var5_int++;
                    statePc = 6;
                    continue stateLoop;
                }
                case 15: {
                    var3++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 16: {
                    var3 = -109 % ((-71 - param1) / 35);
                    this.b((byte) -101);
                    this.field_Zb = 0;
                    this.field_oc = 0;
                    stackIn_17_0 = this.field_J;
                    stackIn_17_1 = 128;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    td.a(stackIn_17_0, stackIn_17_1);
                    this.field_J = 0;
                    if (this.field_gb) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_cb = this.field_T;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    ck.a(111, -this.field_u);
                    mn.a(-this.field_bc, (byte) 44);
                    this.field_bc = this.field_w;
                    this.field_u = this.field_ic;
                    ck.a(77, this.field_ic);
                    mn.a(this.field_w, (byte) 44);
                    if (0 > this.field_Pb) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_db = false;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    this.field_Xb = this.i(512, -22944);
                    if (!this.n(8192)) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (!param0) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_eb = new na(this.field_V, si.field_v, (int[]) null, this.field_Mb, this.field_D);
                    ic.a(-101, this.field_eb.field_B);
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    this.field_eb = null;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    this.f(-75, 3);
                    this.h(false);
                    var4 = this.b(false);
                    this.field_B = new li((oe) (this), var4, gj.a(this.field_Pb, this.field_fc, (byte) 54));
                    this.z((byte) 0);
                    var5 = ce.field_f;
                    if (var5 != null) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5.a((byte) 36);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(ic param0, int param1) {
        try {
            if (!(null == param0.field_g)) {
                pl.field_n.b(param0.field_g);
                pl.field_n.b(param0.field_m);
                param0.field_m = null;
                param0.field_g = null;
            }
            if (param1 != 5) {
                this.field_G = (cn) null;
            }
            this.a(125, param0.field_q, ve.field_d, param0.field_p);
            param0.c((byte) -11);
            this.q((byte) -128);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.RC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        if (param1) {
            this.field_i = (ed) null;
        }
        if (ce.field_f.a((byte) 54, param3, param2, param0)) {
            fieldTemp$0 = this.field_z;
            this.field_z = this.field_z + 1;
            this.field_Lb[fieldTemp$0] = param2;
        }
    }

    private final sa a(DataInputStream param0, int param1, int param2, boolean param3, int param4, int param5, int param6) throws IOException {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        sa stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          L0: {
            L1: {
              var9 = param0.readByte();
              if (-1 == (var9 ^ -1)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              var10 = stackIn_3_0;
              var11 = 0;
              if (!param3) {
                break L2;
              } else {
                this.field_jc = false;
                break L2;
              }
            }
            L3: {
              if (param2 < 6) {
                break L3;
              } else {
                L4: {
                  var12 = param0.readByte();
                  if (-1 == (var12 ^ -1)) {
                    stackIn_9_0 = 0;
                    break L4;
                  } else {
                    stackIn_9_0 = 1;
                    break L4;
                  }
                }
                var11 = stackIn_9_0;
                break L3;
              }
            }
            L5: {
              if (-10 >= (param2 ^ -1)) {
                var12 = param0.readInt();
                var8 = new sa(param6, param4, param1, param5, var10 != 0, var11 != 0, var12);
                break L5;
              } else {
                var8 = new sa(param6, param4, param1, param5, var10 != 0, var11 != 0);
                break L5;
              }
            }
            L6: {
              if (var10 == 0) {
                break L6;
              } else {
                L7: {
                  if (null == this.field_k) {
                    this.field_k = new cn();
                    this.field_Ab = new va();
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.field_k.a(-12328, var8);
                break L6;
              }
            }
            stackIn_19_0 = (sa) (var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8_ref);

            stackIn_22_1 = new StringBuilder().append("oe.EA(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_19_0;
    }

    private final int a(byte param0, int param1, int param2, int param3) {
        int var6 = 0;
        if (!this.field_a) {
            return param2;
        }
        if ((this.field_X ^ -1) >= -1) {
            return param3;
        }
        int var5 = this.field_X % param1;
        param1 = param1 / 2;
        if (!((var5 ^ -1) <= (param1 ^ -1))) {
            var6 = param3;
            param3 = param2;
            param2 = var6;
        }
        var5 = this.field_X % param1;
        if (param0 < 72) {
            return -91;
        }
        var6 = this.d(param3, 30351) + -this.d(param2, 30351);
        int var7 = this.b(param3, 16082) - this.b(param2, 16082);
        int var8 = this.a(-99, param3) + -this.a(87, param2);
        int var9 = this.d(param2, 30351) + var6 * var5 / param1;
        int var10 = var7 * var5 / param1 + this.b(param2, 16082);
        int var11 = var5 * var8 / param1 + this.a(-128, param2);
        return this.a(var11, var9, true, var10);
    }

    private final boolean d(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int stackIn_13_0 = 0;
        L0: {
          var11 = EscapeVector.field_A;
          var4 = this.field_H >> 1102145317;
          var4 = var4 + (this.field_n << -1910936437);
          var5 = this.field_p >> -179025595;
          var6 = -24576 + var4;
          var7 = -24576 + var5;
          var8 = 24576 + var4;
          param2 = param2 << 11;
          var9 = var5 + 24576;
          if (param1 == 32) {
            break L0;
          } else {
            this.field_q = true;
            break L0;
          }
        }
        param0 = param0 << 11;
        L1: while (true) {
          if ((param0 ^ -1) <= (var6 ^ -1)) {
            L2: {
              if (var8 < param0) {
                break L2;
              } else {
                if ((var7 ^ -1) < (param2 ^ -1)) {
                  break L2;
                } else {
                  if ((param2 ^ -1) >= (var9 ^ -1)) {
                    L3: {
                      param0 = param0 - var4;
                      param2 = param2 - var5;
                      var10 = param2 * param2 + param0 * param0;
                      if ((var10 ^ -1) <= -603979777) {
                        stackIn_13_0 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = 1;
                        break L3;
                      }
                    }
                    return stackIn_13_0 != 0;
                  } else {
                    return false;
                  }
                }
              }
            }
            return false;
          } else {
            param0 = param0 + (this.field_n << 1519147275);
            continue L1;
          }
        }
    }

    private final void a(boolean param0, byte[] param1, boolean param2) {
        try {
            if (!param2) {
                this.m(-93);
            }
            this.a(24661, param0);
            this.a(param1, 100);
            this.a(param0, -119);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int[] a(int param0, int param1, int param2) {
        int[] stackIn_7_0 = null;
        if (param1 == -1) {
          if ((param0 ^ -1) <= -1) {
            L0: {
              if ((param0 ^ -1) <= (this.field_D ^ -1)) {
                stackIn_7_0 = si.field_v;
                break L0;
              } else {
                stackIn_7_0 = this.field_V[this.field_Mb * param0 + param2 % this.field_Mb];
                break L0;
              }
            }
            return stackIn_7_0;
          } else {
            return null;
          }
        } else {
          return (int[]) null;
        }
    }

    private final void C(int param0) {
        boolean discarded$0 = false;
        int[] var32 = null;
        String[] var13 = null;
        tj var14 = null;
        int[] var33 = null;
        String[] var16 = null;
        tj var17 = null;
        int[] var34 = null;
        String[] var19 = null;
        tj var20 = null;
        int[] var35 = null;
        String[] var22 = null;
        tj var23 = null;
        if ((this.field_fc ^ -1) != -3) {
            return;
        }
        ed[] var12 = ae.field_c;
        if (this.field_Pb == 0) {
            sa.a(2, (byte) -116);
        }
        if (param0 >= -13) {
            int[] var6 = (int[]) null;
            discarded$0 = this.a((int[]) null, 7, (byte) -46, -81);
        }
        if (!(0 != this.field_Pb)) {
            var32 = uj.field_e;
            var13 = lh.field_c;
            var14 = new tj(var32, var12, var13, false);
            re.a(1820, var14);
        }
        if (!(4 != this.field_Pb)) {
            var33 = p.field_j;
            var16 = rb.field_j;
            var17 = new tj(var33, var12, var16, false);
            re.a(1820, var17);
        }
        if (!(this.field_Pb != 8)) {
            var34 = ha.field_e;
            var19 = pc.field_b;
            var20 = new tj(var34, var12, var19, false);
            re.a(1820, var20);
        }
        if (!(-13 != (this.field_Pb ^ -1))) {
            var35 = w.field_bb;
            var22 = vd.field_i;
            var23 = new tj(var35, var12, var22, false);
            re.a(1820, var23);
        }
    }

    private final void d(boolean param0) {
        int var3 = EscapeVector.field_A;
        if (!param0) {
            this.b(-35, -120, (byte) -53);
        }
        oc var2 = (oc) ((Object) this.field_vb.a(false));
        while (var2 != null) {
            if (!var2.field_B) {
                var2.a();
            } else {
                var2.c((byte) -71);
            }
            var2 = (oc) ((Object) this.field_vb.b((byte) 70));
        }
        this.f(-20320);
    }

    private final void p(int param0) {
        L0: {
          L1: {
            this.a(72);
            dh.field_b = ma.field_a.field_fc;
            ma.field_a = null;
            pl.field_q = new t();
            oe.c((byte) -28);
            mj.field_d = param0;
            if (!aj.b(-89)) {
              break L1;
            } else {
              L2: {
                if (null != de.field_i) {
                  break L2;
                } else {
                  if (ce.field_f.b(-49)) {
                    break L2;
                  } else {
                    if (ua.field_c.d(17523)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              n.field_h = true;
              di.field_d = new wc(2);
              di.field_d.a(gb.a(dh.field_d, bj.field_y, 8158), true, 4767999);
              break L0;
            }
          }
          ci.a(0);
          break L0;
        }
        gi.a((byte) -77);
    }

    private final void a(pi param0, int param1) {
        pl.field_n.b(param0.field_o);
        param0.field_o = null;
        if (param1 < 7) {
            return;
        }
        try {
            this.a(123, param0.field_g, td.field_c, param0.field_n);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.MC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void c(int param0, byte param1) {
        if (!(9 == param0)) {
            return;
        }
        this.field_Tb = this.field_Tb + 150;
        if (param1 > -107) {
            this.a(105);
        }
        if (!(this.field_Tb < 500)) {
            this.field_Tb = 500;
        }
        this.a(-116, qh.field_e);
    }

    private final void g(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        ed var10;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        L0: {
          var9 = EscapeVector.field_A;
          if (param1 == -7778) {
            break L0;
          } else {
            discarded$1 = this.e(-71);
            break L0;
          }
        }
        L1: {
          if (this.field_Pb < 0) {
            var10 = c.field_n;
            if (var10 == null) {
              return;
            } else {
              L2: {
                var5 = (param2 >> 273363267) - param2;
                var6 = (param0 >> -786039677) - param0;
                var6 += 240;
                if (-1 > (var6 ^ -1)) {
                  em.f(0, var6, 640, 480);
                  break L2;
                } else {
                  break L2;
                }
              }
              var7 = 0;
              L3: while (true) {
                L4: {
                  if (0 >= var5) {
                    stackIn_18_0 = var6;
                    break L4;
                  } else {
                    stackIn_18_0 = var7;

                    L5: {
                      if (stackIn_18_0 != 0) {
                        stackIn_16_0 = 0;
                        break L5;
                      } else {
                        stackIn_16_0 = 1;
                        break L5;
                      }
                    }
                    var7 = stackIn_16_0;
                    var5 = var5 - var10.field_A;
                    continue L3;
                  }
                }
                var8 = stackIn_18_0;
                L6: while (true) {
                  if (-641 >= (var5 ^ -1)) {
                    em.c();
                    break L1;
                  } else {
                    L7: {
                      if (var7 != 0) {
                        var6 = var6 - var10.field_z / 2;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: while (true) {
                      if ((var6 ^ -1) <= -481) {
                        L9: {
                          var5 = var5 + var10.field_A;
                          if (var7 != 0) {
                            stackIn_28_0 = 0;
                            break L9;
                          } else {
                            stackIn_28_0 = 1;
                            break L9;
                          }
                        }
                        var7 = stackIn_28_0;
                        var6 = var8;
                        continue L6;
                      } else {
                        var10.e(var5, var6);
                        var6 = var6 + var10.field_z;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    private final void z(byte param0) {
        de var6 = null;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        if (!(this.field_s != null)) {
            return;
        }
        if (this.field_s.a(-97)) {
            return;
        }
        int var2 = 9;
        int var3 = 5 + (var2 + -1);
        int var4 = -54 / ((param0 - 75) / 48);
        hg var5 = this.field_s.a(false);
        while (var5 != null) {
            var6 = (de) ((Object) var5);
            var7 = var6.field_g;
            if ((var7 ^ -1) <= (var2 ^ -1)) {
                if (!((var3 ^ -1) > (var7 ^ -1))) {
                    this.k(-122, var7);
                }
            }
            var5 = this.field_s.b((byte) 70);
        }
    }

    private final void a(int param0, int param1, DataInputStream param2) throws IOException {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 < 6) {
                this.field_a = false;
                this.field_X = 0;
                this.field_l = 0;
                break L1;
              } else {
                this.field_l = param2.readUnsignedByte();
                this.field_X = param2.readInt();
                this.field_a = false;
                break L1;
              }
            }
            L2: {
              this.d(param1 + 29079);
              if (param1 == -8277) {
                break L2;
              } else {
                this.field_kc = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("oe.TF(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void f(byte param0) {
        field_xb = null;
        if (param0 != 69) {
            field_cc = (String) null;
        }
        field_cc = null;
    }

    private final int a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
            return -55;
        }
        param3 = param3 << 1994524168;
        param1 = param1 << 1628227792;
        int var5 = param1 & 16711680;
        var5 = var5 | param3 & 65280;
        var5 = var5 | 255 & param0;
        return var5;
    }

    private final void h(int param0, int param1) {
        if (!(param0 > (this.field_j ^ -1))) {
            return;
        }
        mj.field_b.g();
        em.d();
        String var3 = ce.a((byte) 120, this.field_fc, this.field_Pb);
        fh.field_g.c(var3, 160, 22, 7899280, -1);
        md.field_D.a(126);
        cf.a(mj.field_b, true, 1);
        mj.field_b.h(5267536);
        int var4 = this.field_j;
        if ((var4 ^ -1) < -129) {
            var4 = 128;
        }
        mj.field_b.a(-mj.field_b.field_A + 320, (-param1 >> 1287372067) + 40 - 44, 2 * mj.field_b.field_A, mj.field_b.field_z * 2, var4);
    }

    private final void a(am param0, byte param1) {
        try {
            param0.c((byte) -25);
            if (param1 <= 10) {
                this.field_c = -106;
            }
            this.field_b = true;
            this.field_ub = this.field_ub - 1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(byte param0) {
        wa.field_c = new cn();
        si.field_u = new cn();
        mh.field_e = 0;
        hi.field_q = 6324320;
        int var1 = -7 / ((70 - param0) / 32);
    }

    private final void a(int param0, int param1, hh param2, int param3) {
        int var5_int = 0;
        oc var6 = null;
        byte[] var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.n(8192) ? 1 : 0;
              var6 = eg.a(param1, param3, var5_int != 0, true, param2);
              this.field_vb.a(-12328, var6);
              if (param0 > 120) {
                break L1;
              } else {
                var7 = (byte[]) null;
                this.a(true, (byte[]) null, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var5);

            stackIn_5_1 = new StringBuilder().append("oe.LD(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    private final void a(sa param0, int param1, int param2) {
        int var5 = 0;
        oc var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              param0.a((oe) (this), (byte) 76);
              var6 = this.a(param0, (byte) 42);
              this.field_kb.removeElementAt(param2);
              if (!this.field_Gb) {
                var5 = mf.b(this.field_fc, param0.field_n, -2);
                this.field_J = this.field_J + var5;
                v.a(8, var5);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = 33 % ((6 - param1) / 44);
              if (1 != param0.field_n) {
                if (9 <= param0.field_n) {
                  break L2;
                } else {
                  if (-6 != (param0.field_n ^ -1)) {
                    this.q((byte) -117);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                this.b(0);
                break L2;
              }
            }
            L3: {
              this.a(param0, var6, -2);
              this.a((byte) 124, param0);
              if (this.field_B != null) {
                this.field_B.a(param0, 4236);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("oe.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean e(int param0) {
        int stackIn_8_0 = 0;
        if (param0 > 90) {
          L0: {
            L1: {
              if (this.field_Gb) {
                break L1;
              } else {
                if (this.field_k == null) {
                  break L1;
                } else {
                  if (!this.field_k.a(-128)) {
                    break L1;
                  } else {
                    if (!this.field_Ab.b(-182442704)) {
                      break L1;
                    } else {
                      stackIn_8_0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = 0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final void e(boolean param0, int param1) {
        ce var3;
        int var4;
        int var5;
        if (param1 == 0) {
          L0: {
            var3 = this.w((byte) -123);
            var4 = this.s(-68661304);
            var5 = this.t((byte) -48) ? 1 : 0;
            if (var3 == null) {
              break L0;
            } else {
              if (var4 < 0) {
                break L0;
              } else {
                L1: {
                  if (this.field_Y != var3) {
                    break L1;
                  } else {
                    if (param0) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                vc.a(var4, var3, var5 != 0, (byte) -93);
                this.field_sc = var4;
                this.field_Y = var3;
                break L0;
              }
            }
          }
          this.z(86);
          return;
        } else {
          return;
        }
    }

    private final void u(byte param0) {
        if (!(-4 == (this.field_fc ^ -1))) {
            return;
        }
        if (ua.field_c == null) {
            return;
        }
        if (!(ua.field_c.a(this.field_fc, false))) {
            return;
        }
        int var3 = 29;
        if (param0 != 102) {
            this.h(-34);
        }
        int var4 = 255 ^ var3;
        this.a(this.field_fc, false, var3, var4);
    }

    private final boolean e(boolean param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            this.field_G = (cn) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_Gb) {
              break L2;
            } else {
              if (-16777216 <= this.field_p) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void G(int param0) {
        int stackIn_31_0 = 0;
        int stackIn_91_0 = 0;
        int var2;
        int var3;
        int var4;
        pi var5_ref_pi;
        ed var5_ref_ed;
        int var5;
        int var6;
        int var7;
        ed var8_ref_ed;
        int var8;
        int var9;
        int var10;
        int var11;
        oc var12;
        var11 = EscapeVector.field_A;
        if (!this.n((byte) 59)) {
          em.d();
          fh.field_g.c(this.r(4251), 320, 250, 16777215, -1);
          return;
        } else {
          L0: {
            var2 = this.n(8192) ? 1 : 0;
            var3 = (this.field_H >> -1689667728) + -319;
            var4 = (this.field_p >> -1741010384) - 239;
            this.i(param0 + -48, (this.field_H >> -14547472) - -this.field_Kb, this.field_p >> 1406984880);
            if (this.field_eb == null) {
              break L0;
            } else {
              this.field_eb.e(param0 + 640, var3, var4);
              break L0;
            }
          }
          this.b(var3, var4, (byte) -14);
          var5_ref_pi = (pi) ((Object) this.field_hb.a(false));
          L1: while (true) {
            if (var5_ref_pi == null) {
              this.field_Xb.a(82, var3, var4);
              var12 = (oc) ((Object) this.field_vb.a(false));
              L2: while (true) {
                if (var12 == null) {
                  L3: {
                    if (null != this.field_eb) {
                      break L3;
                    } else {
                      this.a(var4, var3, (byte) -115);
                      this.e(var4, param0 + 8192, var3);
                      break L3;
                    }
                  }
                  this.h(11905, var3, var4);
                  var5_ref_pi = (pi) ((Object) this.field_hb.a(false));
                  L4: while (true) {
                    L5: {
                      if (var5_ref_pi == null) {
                        stackIn_31_0 = -1;
                        break L5;
                      } else {
                        stackIn_31_0 = var5_ref_pi.field_r;

                        L6: {
                          if (stackIn_31_0 != 0) {
                            var6 = (var5_ref_pi.field_n >> -1246105168) + (-var3 + 1);
                            var7 = 1 + ((var5_ref_pi.field_g >> 582894160) - var4);
                            L7: while (true) {
                              if ((var6 ^ -1) >= 6) {
                                var6 = var6 + this.field_n;
                                L8: while (true) {
                                  if (var6 >= 647) {
                                    break L6;
                                  } else {
                                    var8_ref_ed = mf.field_m;
                                    stackIn_31_0 = var2;

                                    L9: {
                                      if (stackIn_31_0 == 0) {
                                        break L9;
                                      } else {
                                        if (ej.field_a != null) {
                                          var8_ref_ed = ej.field_a;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var8_ref_ed.a(var6, (byte) 34, 4096, -var5_ref_pi.field_m << 1073707144, var7);
                                    var6 = var6 + this.field_n;
                                    continue L8;
                                  }
                                }
                              } else {
                                var6 = var6 - this.field_n;
                                continue L7;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        var5_ref_pi = (pi) ((Object) this.field_hb.b((byte) 70));
                        continue L4;
                      }
                    }
                    L10: {
                      if (stackIn_31_0 < (this.field_Ub ^ -1)) {
                        break L10;
                      } else {
                        L11: {
                          var5_ref_ed = mb.field_f[this.field_Ub];
                          if (var2 == 0) {
                            break L11;
                          } else {
                            if (ob.field_b[this.field_Ub] != null) {
                              var5_ref_ed = ob.field_b[this.field_Ub];
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          var6 = (this.field_mb - (var5_ref_ed.field_A << -1823054129) >> 1988116816) - var3;
                          var7 = (this.field_E - (var5_ref_ed.field_z << 903732335) >> -1839815536) - var4;
                          if (640 - this.field_n >> -1454189599 > var6) {
                            var6 = var6 + this.field_n;
                            break L12;
                          } else {
                            if ((var6 ^ -1) > (640 + this.field_n >> 1321581793 ^ -1)) {
                              break L12;
                            } else {
                              var6 = var6 - this.field_n;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          var8 = var5_ref_ed.field_s;
                          var9 = var5_ref_ed.field_x;
                          if (-1 > (this.field_e ^ -1)) {
                            var7 = this.field_e * (-240 + var7) / 50 + 240;
                            var9 = var9 * this.field_e / 50;
                            var8 = this.field_e * var8 / 50;
                            var6 = this.field_e * (-320 + var6) / 50 + 320;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (this.field_Gb) {
                            break L14;
                          } else {
                            L15: {
                              var10 = 16777215;
                              if (var2 == 0) {
                                break L15;
                              } else {
                                if (this.field_eb != null) {
                                  var10 = this.field_eb.field_z;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            em.d(320, 240, var6 + (var8 >> 678382945), var7 - -(var9 >> 183960673), var10);
                            break L14;
                          }
                        }
                        if (this.field_e > 0) {
                          var5_ref_ed.b(var6, var7, var8, var9);
                          break L10;
                        } else {
                          var5_ref_ed.e(var6, var7);
                          break L10;
                        }
                      }
                    }
                    L16: {
                      if (!this.field_Gb) {
                        this.a(var4, (ed) null, 65793, var3);
                        this.o((byte) -110);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      this.f(var3, var4, 8);
                      this.b(var3, var4, param0);
                      this.b(var3, (byte) -108, var4);
                      if (null == this.field_Db) {
                        break L17;
                      } else {
                        this.field_Db.a((byte) -87, var3, var4);
                        break L17;
                      }
                    }
                    L18: {
                      this.y(param0 ^ -32369);
                      if ((this.field_Pb ^ -1) <= -1) {
                        this.q(3);
                        break L18;
                      } else {
                        if (null != da.field_c) {
                          break L18;
                        } else {
                          if (!this.field_Jb) {
                            dc.a((byte) 57, ek.field_c, 320, 476);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    L19: {
                      if (da.field_c != null) {
                        break L19;
                      } else {
                        L20: {
                          if (!this.g((byte) -91)) {
                            break L20;
                          } else {
                            L21: {
                              if (!this.field_rc) {
                                break L21;
                              } else {
                                if (0 <= this.field_Pb) {
                                  L22: {
                                    ga.field_b.e(640 - ga.field_b.field_A >> 1573998881, -ga.field_b.field_z + 212);
                                    if (-100 > this.field_c) {
                                      oj.a(266, 340, (byte) -106, en.field_e);
                                      EscapeVector.a(Integer.toString(this.field_J), 340, 266, (byte) 110);
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    if ((this.field_c ^ -1) > 74) {
                                      oj.a(286, 340, (byte) -102, dg.field_s);
                                      EscapeVector.a(Integer.toString(this.field_ac), 340, 286, (byte) -5);
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  L24: {
                                    if ((this.field_c ^ -1) > 49) {
                                      oj.a(306, 340, (byte) -116, fl.field_g);
                                      EscapeVector.a(Integer.toString(this.field_Tb + this.field_Tb), 340, 306, (byte) -43);
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  oj.a(336, 340, (byte) 85, ad.field_c);
                                  EscapeVector.a(Integer.toString(this.field_ob), 340, 336, (byte) 119);
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            ga.field_b.e(640 - ga.field_b.field_A >> 1067405953, 480 - ga.field_b.field_z >> -1887725567);
                            break L20;
                          }
                        }
                        this.a((byte) -76);
                        if (0 >= this.field_ab) {
                          break L19;
                        } else {
                          if ((this.field_ab ^ -1) < -101) {
                            break L19;
                          } else {
                            fh.field_g.b(this.field_h, 320, 174 + (this.field_ab >> 2095199905), 16777215, -1, (this.field_ab << 726558696) / 100);
                            break L19;
                          }
                        }
                      }
                    }
                    L25: {
                      if (this.field_c <= 0) {
                        break L25;
                      } else {
                        L26: {
                          L27: {
                            if (this.field_Gb) {
                              break L27;
                            } else {
                              L28: {
                                if (!this.field_ec) {
                                  break L28;
                                } else {
                                  if ((this.field_Pb ^ -1) > -1) {
                                    break L27;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              if (!this.field_Ib) {
                                stackIn_91_0 = 0;
                                break L26;
                              } else {
                                break L27;
                              }
                            }
                          }
                          stackIn_91_0 = 1;
                          break L26;
                        }
                        var5 = stackIn_91_0;
                        gh.a(this.field_c + 1, 256 - (this.field_c << -262269790), var5 != 0, var5 != 0);
                        break L25;
                      }
                    }
                    L29: {
                      if (null == this.field_B) {
                        break L29;
                      } else {
                        if (!this.field_B.b((byte) -122)) {
                          break L29;
                        } else {
                          this.field_B.a((byte) -120);
                          break L29;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  var12.a(99, var3, var4);
                  var12 = (oc) ((Object) this.field_vb.b((byte) 70));
                  continue L2;
                }
              }
            } else {
              var5_ref_pi.field_i.a(param0 ^ 97, var3, var4);
              var5_ref_pi = (pi) ((Object) this.field_hb.b((byte) 70));
              continue L1;
            }
          }
        }
    }

    final void x(byte param0) {
        int var2 = 92 % ((-5 - param0) / 38);
        if (!(this.field_c >= 0)) {
            if (this.g((byte) -127) && this.field_rc && (this.field_Pb ^ -1) <= -1) {
                if (!((this.field_c ^ -1) <= 99)) {
                    this.field_ob = this.field_ob + this.field_J;
                    this.field_J = 0;
                    this.field_T = this.field_cb;
                }
                if (-75 > this.field_c) {
                    this.field_ob = this.field_ob + this.field_ac;
                    v.a(8, this.field_ac);
                }
                if (!((this.field_c ^ -1) <= 49)) {
                    this.field_ob = this.field_ob + (this.field_Tb - -this.field_Tb);
                    v.a(8, this.field_Tb - -this.field_Tb);
                }
                this.f(false);
            }
            this.field_c = 0;
        }
    }

    private final void a(InputStream param0, boolean param1) throws IOException {
        try {
            this.a(param1, -1, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.TC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void d(int param0) {
        if (param0 != 20802) {
            return;
        }
    }

    private final int d(int param0, int param1) {
        if (param1 != 30351) {
            return -77;
        }
        return (16711680 & param0) >> -72468432;
    }

    private final void h(byte param0) {
        if (!(!this.field_F)) {
            return;
        }
        this.a(0, mf.field_a, 65793, 0);
        this.a(0, -28311553, mf.field_a, 0, ib.field_a);
        if (!(-1 < (this.field_Ub ^ -1))) {
            if (!(this.field_e <= 0)) {
                this.field_e = 0;
                this.field_Ub = -1;
            }
            pl.field_n.a(bc.field_c, 100, 6144 * qm.field_c / 64, 8192);
        }
        this.field_Gb = true;
        if (!this.field_gb && this.field_Pb >= 0) {
            this.field_A = this.field_A - 1;
            jc.a(1);
            this.b((byte) -106, 0);
        }
        if (param0 >= -34) {
            this.field_P = 112;
        }
    }

    private final String g(boolean param0) {
        String var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var2 = "12:00:00+";
          if (param0) {
            break L0;
          } else {
            this.field_i = (ed) null;
            break L0;
          }
        }
        L1: {
          var3 = this.field_cb;
          if (this.field_a) {
            var3 = this.field_X;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          L3: {
            if (2160000 > this.field_cb) {
              break L3;
            } else {
              if (this.field_a) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          var4 = var3 / 50;
          var5 = var4 / 60;
          var4 = var4 - var5 * 60;
          var6 = var5 / 60;
          var5 = var5 - var6 * 60;
          var2 = var6 + ":" + var5 / 10 + var5 % 10 + ":" + var4 / 10 + var4 % 10;
          break L2;
        }
        return var2;
    }

    private final void h(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        sa var7;
        L0: {
          var6 = EscapeVector.field_A;
          if (param0 == 11905) {
            break L0;
          } else {
            this.o(65);
            break L0;
          }
        }
        L1: {
          if ((this.field_Pb ^ -1) <= -1) {
            break L1;
          } else {
            if (fa.field_c[5]) {
              var4 = -param1;
              L2: while (true) {
                if (1023 <= (var4 ^ -1)) {
                  L3: while (true) {
                    if ((var4 ^ -1) <= -641) {
                      break L1;
                    } else {
                      em.h(0, 0, 448 - -var4, 480);
                      var5 = 0;
                      L4: while (true) {
                        if ((var5 ^ -1) <= -513) {
                          bf.field_T.e(var4 + 224, -param2 + 96);
                          var5 = 256;
                          L5: while (true) {
                            if (512 <= var5) {
                              em.c();
                              em.h(var4 + 576, 0, 640, 480);
                              var5 = 512;
                              L6: while (true) {
                                if (1024 <= var5) {
                                  var5 = 512;
                                  L7: while (true) {
                                    if (var5 >= 768) {
                                      kn.field_h.e(var4 + 768, 96 + -param2);
                                      em.c();
                                      uf.field_e.e(var4 + 448, -param2);
                                      wa.field_b.e(544 + var4, -param2);
                                      gm.field_a.e(448 + var4, 288 - param2);
                                      gm.field_a.e(448 + var4, -param2 + 480);
                                      em.h(0, 128 + -param2, 640, 480);
                                      var5 = 128;
                                      L8: while (true) {
                                        if ((var5 ^ -1) <= -1025) {
                                          em.c();
                                          ej.field_e.e(var4 + 224, 1024 - param2);
                                          var5 = 256;
                                          L9: while (true) {
                                            if ((var5 ^ -1) <= -769) {
                                              q.field_G.e(768 + var4, -param2 + 1024);
                                              var4 += 1024;
                                              continue L3;
                                            } else {
                                              dg.field_r.e(var5 + var4, -param2 + 1024);
                                              var5 += 32;
                                              continue L9;
                                            }
                                          }
                                        } else {
                                          n.field_l.e(var4 + 224, -param2 + var5);
                                          cj.field_a.e(768 - -var4, -param2 + var5);
                                          var5 += 32;
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      mj.field_f.e(var5 - -var4, 96 - param2);
                                      var5 += 32;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  wa.field_e.e(var5 + var4, -param2);
                                  var5 += 32;
                                  continue L6;
                                }
                              }
                            } else {
                              mj.field_f.e(var5 - -var4, 96 - param2);
                              var5 += 32;
                              continue L5;
                            }
                          }
                        } else {
                          wa.field_e.e(var4 + var5, -param2);
                          var5 += 32;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  var4 -= 1024;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
        }
        var4 = 0;
        L10: while (true) {
          if (this.field_kb.size() <= var4) {
            return;
          } else {
            var7 = (sa) (this.field_kb.elementAt(var4));
            var7.a(param2, (byte) 109, param1);
            var4++;
            continue L10;
          }
        }
    }

    private final void a(byte param0, sa param1) {
        if (!(param1 != null)) {
            return;
        }
        if (!param1.e((byte) -5)) {
            return;
        }
        this.field_S = this.field_S + 1;
        if (this.field_L != this.field_S) {
            return;
        }
        try {
            ua.field_c.a((byte) -64, this.field_fc, oj.k(64), this.field_Pb);
            int var3_int = 90 % ((42 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.VF(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(int param0, int param1) {
        int var3 = 71 % ((param1 - 6) / 36);
    }

    private final void b(int param0, DataInputStream param1, byte param2) throws IOException {
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int var4_int = 0;
        int var5 = 0;
        ic var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              this.field_N = new cn();
              if (param0 >= 1) {
                var4_int = param1.readUnsignedByte();
                var5 = 0;
                L2: while (true) {
                  if ((var5 ^ -1) <= (var4_int ^ -1)) {
                    break L1;
                  } else {
                    var6 = new ic();
                    dupTemp$2 = param1.readUnsignedShort() << -1567031952;
                    var6.field_j = dupTemp$2;
                    var6.field_p = dupTemp$2;
                    dupTemp$3 = param1.readUnsignedShort() << 2117868784;
                    var6.field_l = dupTemp$3;
                    var6.field_q = dupTemp$3;
                    var6.field_i = (int)(32769.0 * Math.random()) + -16384;
                    var6.field_h = -16384 + (int)(32769.0 * Math.random());
                    this.field_N.a(-12328, var6);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param2 == -17) {
                break L3;
              } else {
                this.field_lb = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("oe.GB(").append(param0).append(',');

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    private final void A(int param0) {
        double var2;
        double var4;
        double var6;
        int var8;
        L0: {
          var2 = (double)this.field_Hb;
          var4 = (double)this.field_pb;
          if (param0 <= -123) {
            break L0;
          } else {
            this.field_O = 85;
            break L0;
          }
        }
        L1: {
          var6 = 1.0 / Math.sqrt(var4 * var4 + var2 * var2);
          var2 = var2 * var6;
          var4 = var4 * var6;
          var6 = (double)this.field_hc * var4 + var2 * (double)this.field_mc;
          if (var6 <= -32768.0) {
            break L1;
          } else {
            if (524288.0 < var6) {
              this.h((byte) -50);
              if (!this.field_rc) {
                return;
              } else {
                L2: {
                  if ((this.field_Pb ^ -1) <= -1) {
                    break L2;
                  } else {
                    if (33554432 <= this.field_p) {
                      this.a(this.field_fc, false, 8, 247);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                return;
              }
            } else {
              L3: {
                if (32768.0 >= var6) {
                  var6 = var6 + 32768.0;
                  break L3;
                } else {
                  var6 = 2.0 * var6;
                  break L3;
                }
              }
              L4: {
                this.field_mc = (int)((double)this.field_mc - var6 * var2);
                this.field_hc = (int)((double)this.field_hc - var6 * var4);
                var8 = (int)var6 >> 1407232868;
                if (-6145 <= (var8 ^ -1)) {
                  break L4;
                } else {
                  var8 = 6144;
                  break L4;
                }
              }
              pl.field_n.a(co.field_d, 100, qm.field_c * var8 / 64, 8192);
              break L1;
            }
          }
        }
    }

    private final void z(int param0) {
        boolean discarded$0 = false;
        if (this.field_Y == null) {
          return;
        } else {
          if (this.field_sc < 0) {
            return;
          } else {
            L0: {
              L1: {
                L2: {
                  if (!this.field_Gb) {
                    break L2;
                  } else {
                    if ((this.field_A ^ -1) == -1) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!this.g((byte) -113)) {
                    break L3;
                  } else {
                    if (!kl.a(this.field_Pb - -1, this.field_fc, true)) {
                      break L3;
                    } else {
                      break L1;
                    }
                  }
                }
                L4: {
                  if (this.field_Jb) {
                    break L4;
                  } else {
                    if (!this.field_Cb) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                if (this.field_c < 0) {
                  break L0;
                } else {
                  if (32 >= this.field_c) {
                    wa.a((32 - this.field_c) * this.field_sc / 32, 32471);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              if (63 < (this.field_c ^ -1)) {
                break L0;
              } else {
                if (-1 <= (this.field_c ^ -1)) {
                  wa.a(this.field_sc * -this.field_c / 64, 32471);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            L5: {
              if (param0 >= 28) {
                break L5;
              } else {
                discarded$0 = this.e(71);
                break L5;
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int discarded$0 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = EscapeVector.field_A;
        int[] var14 = new int[32];
        int[] var18 = var14;
        for (var10 = param4; (param7 ^ -1) < (var10 ^ -1); var10++) {
            var14[var10] = ae.a((param0 << -1411963195) + var10, 255);
        }
        var10 = 15 - param2 + (param1 << -1855958331);
        int var11 = -param5 + ((param0 << -1337214875) - 9600);
        if (param6 != 10943) {
            return;
        }
        if (!(var10 <= 0)) {
            var11 = this.a(var11, param1 + -1, param7, false, 32, param4, -var10 + 32, param0, var18);
        }
        for (var12 = param1; var12 < param3; var12++) {
            var11 = this.a(var11, var12, param7, false, 32, param4, 0, param0, var18);
        }
        var12 = param2 + 480 & 31;
        if (var12 > 0) {
            discarded$0 = this.a(var11, param3, param7, false, var12, param4, 0, param0, var18);
        }
    }

    private final void q(byte param0) {
        if (this.field_rc || this.field_F) {
            if (this.field_Pb >= 0) {
                if (!(this.field_Gb)) {
                    this.field_bc = this.field_bc + 1;
                    c.m(-45);
                    if (!(-77 != (this.field_bc ^ -1))) {
                        this.a(this.field_fc, false, 12, 243);
                    }
                }
            }
        }
        if (param0 >= -115) {
            this.field_i = (ed) null;
        }
    }

    private final void b(int param0, byte param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int statePc = 0;
        hg var4 = null;
        int var5 = 0;
        am var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        byte[] var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = EscapeVector.field_A;
                    if ((this.field_oc ^ -1) <= -51) {
                        statePc = 25;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = this.field_C.a(false);
                    var5 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = this.field_ub;
                    stackIn_3_1 = var5;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                        statePc = 25;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var6 = (am) ((Object) var4);
                    var7 = var6.field_j - param2;
                    stackIn_26_0 = -1;
                    stackIn_5_0 = stackIn_26_0;
                    stackIn_26_1 = var7;
                    stackIn_5_1 = stackIn_26_1;
                    if (false) {
                        statePc = 26;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 > stackIn_5_1) {
                        statePc = 24;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if ((var7 ^ -1) > -482) {
                        statePc = 8;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var8 = var6.field_i - param0;
                    var9 = var6.field_h + -param0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (0 >= var9) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var9 = var9 - this.field_n;
                    var8 = var8 - this.field_n;
                    statePc = 9;
                    continue stateLoop;
                }
                case 11: {
                    var9 = var9 + this.field_n;
                    var8 = var8 + this.field_n;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-641 >= (var8 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_3_0 = var8 ^ -1;
                    stackIn_14_0 = stackIn_3_0;
                    stackIn_3_1 = -1;
                    stackIn_14_1 = stackIn_3_1;
                    if (false) {
                        statePc = 3;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 > stackIn_14_1) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = var8;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var10 = stackIn_17_0;
                    if (var9 > 640) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = var9;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = 640;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var11 = stackIn_20_0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var10 >= var11) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    em.a(var10, var7, 16744512);
                    em.a(var10, var7 + -1, 8396804);
                    em.a(var10, 1 + var7, 8396804);
                    var10++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 23: {
                    var8 = var8 + this.field_n;
                    var9 = var9 + this.field_n;
                    statePc = 12;
                    continue stateLoop;
                }
                case 24: {
                    var5++;
                    var4 = var4.field_b;
                    statePc = 2;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = param1;
                    stackIn_26_1 = -108;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 == stackIn_26_1) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var13 = (byte[]) null;
                    this.a(true, (byte[]) null, true);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(DataInputStream param0, int param1, byte param2) throws IOException {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        de var8 = null;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            this.field_s = new cn();
            if (-8 < (param1 ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = 28 % ((param2 - -29) / 46);
              var5 = param0.readUnsignedByte();
              if (0 != var5) {
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var5) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      var7 = param0.readUnsignedByte();
                      if (!mf.a(var7, -64)) {
                        break L2;
                      } else {
                        var8 = new de(var7);
                        this.field_s.a(-12328, var8);
                        this.j(var7, 101);
                        break L2;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("oe.HB(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, DataInputStream param1, byte param2) throws IOException {
        int discarded$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (5 > param0) {
                this.field_Q = 0;
                break L1;
              } else {
                this.field_Q = param1.readUnsignedByte();
                if ((this.field_Q ^ -1) == -1) {
                  break L1;
                } else {
                  if ((this.field_Q ^ -1) != -2) {
                    this.field_Q = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param2 >= 28) {
                break L2;
              } else {
                discarded$0 = this.a(-118, -50, true, 65);
                break L2;
              }
            }
            this.u(-15474);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("oe.WA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    private final void y(int param0) {
        int var2;
        int var3;
        L0: {
          var3 = EscapeVector.field_A;
          if (param0 == -32369) {
            break L0;
          } else {
            this.field_Jb = true;
            break L0;
          }
        }
        L1: {
          if (-1 > (this.field_Qb ^ -1)) {
            L2: {
              var2 = -(this.field_i.field_A / 2) + 320;
              if (this.field_Qb < 31) {
                if (null != da.field_c) {
                  break L2;
                } else {
                  if (!this.field_Jb) {
                    mf.a(4, var2, 31 - this.field_Qb, this.field_i, -99);
                    break L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                if ((this.field_Qb ^ -1) >= -121) {
                  ge.a(-this.field_i.field_A, this.field_i.field_B, 0, -this.field_i.field_A + em.field_l, (byte) -126, 0, 0, -this.field_i.field_z, em.field_i, 3 * em.field_l + (-1 + var2));
                  ge.a(-this.field_i.field_A, this.field_i.field_B, 0, -this.field_i.field_A + em.field_l, (byte) -84, 0, 0, -this.field_i.field_z, em.field_i, var2 + 1 + 3 * em.field_l);
                  ge.a(-this.field_i.field_A, this.field_i.field_B, 0, -this.field_i.field_A + em.field_l, (byte) -100, 0, 0, -this.field_i.field_z, em.field_i, -1 + (var2 - -(5 * em.field_l)));
                  ge.a(-this.field_i.field_A, this.field_i.field_B, 0, em.field_l - this.field_i.field_A, (byte) -81, 0, 0, -this.field_i.field_z, em.field_i, 1 + (var2 - -(5 * em.field_l)));
                  this.field_i.e(var2, 4);
                  break L1;
                } else {
                  if (da.field_c != null) {
                    break L1;
                  } else {
                    if (this.field_Jb) {
                      break L2;
                    } else {
                      mf.a(4, var2, -120 + this.field_Qb, this.field_i, -123);
                      break L1;
                    }
                  }
                }
              }
            }
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final int c(boolean param0) {
        int var2;
        ic var3;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = (ic) null;
            this.a((ic) null, 48);
            break L0;
          }
        }
        var2 = this.field_P;
        if (-1 != (var2 ^ -1)) {
          if (-3 == (var2 ^ -1)) {
            return 1;
          } else {
            if (-2 == (var2 ^ -1)) {
              return 2;
            } else {
              if (-4 == (var2 ^ -1)) {
                return 3;
              } else {
                if (var2 == 4) {
                  return 4;
                } else {
                  if ((var2 ^ -1) == -6) {
                    return 0;
                  } else {
                    return 0;
                  }
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    final void h(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        boolean stackIn_137_0 = false;
        hl stackIn_227_0 = null;
        int stackIn_227_1 = 0;
        hl stackIn_228_0 = null;
        int stackIn_228_1 = 0;
        int stackIn_228_2 = 0;
        hl stackIn_230_0 = null;
        int stackIn_230_1 = 0;
        hl stackIn_231_0 = null;
        int stackIn_231_1 = 0;
        int stackIn_231_2 = 0;
        hl stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        int stackIn_246_2 = 0;
        hl stackIn_247_0;
        int stackIn_247_1;
        int stackIn_247_2;
        int stackIn_247_3;
        int stackIn_260_0 = 0;
        double stackIn_288_0 = 0.0;
        int stackIn_324_0 = 0;
        int stackIn_324_1 = 0;
        int stackIn_337_0 = 0;
        int stackIn_340_0 = 0;
        int stackIn_343_0 = 0;
        int stackIn_449_0 = 0;
        int stackIn_449_1 = 0;
        int stackIn_457_0 = 0;
        int stackIn_462_0 = 0;
        int stackIn_466_0 = 0;
        int stackIn_543_0 = 0;
        int stackIn_543_1 = 0;
        int stackIn_581_0 = 0;
        int stackIn_581_1 = 0;
        int[] stackIn_586_0 = null;
        int stackIn_608_0 = 0;
        int stackIn_608_1 = 0;
        boolean stackIn_613_0 = false;
        int stackIn_618_0 = 0;
        int stackIn_650_0 = 0;
        int stackIn_650_1 = 0;
        int stackIn_675_0 = 0;
        int stackIn_675_1 = 0;
        int stackIn_713_0 = 0;
        int stackIn_713_1 = 0;
        hl stackIn_717_0 = null;
        int stackIn_717_1 = 0;
        hl stackIn_718_0 = null;
        int stackIn_718_1 = 0;
        int stackIn_718_2 = 0;
        Throwable caughtException = null;
        Throwable decompiledCaughtException = null;
        boolean stackOut_612_0;
        int var2 = 0;
        double var2_double = 0.0;
        int var3 = 0;
        ic var3_ref_ic = null;
        int var4 = 0;
        long var4_long = 0L;
        Object var4_ref = null;
        double var4_double = 0.0;
        double var5_double = 0.0;
        long var5_long = 0L;
        int var5 = 0;
        hl var5_ref_hl = null;
        hg var5_ref_hg = null;
        hg var6_ref_hg = null;
        double var6_double = 0.0;
        int var6 = 0;
        pi var6_ref_pi = null;
        double var7_double = 0.0;
        long var7_long = 0L;
        int var7 = 0;
        int var8 = 0;
        double var8_double = 0.0;
        ed var8_ref_ed = null;
        int var9 = 0;
        Object var9_ref_Object = null;
        ed var9_ref_ed = null;
        int var10 = 0;
        double var10_double = 0.0;
        ed var10_ref_ed = null;
        double var11_double = 0.0;
        int var11 = 0;
        ic var11_ref_ic = null;
        ed var11_ref_ed = null;
        int var12 = 0;
        int[] var12_ref_int__ = null;
        double var12_double = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        int var14 = 0;
        double var14_double = 0.0;
        int var15_int = 0;
        double var15 = 0.0;
        int var16 = 0;
        double var16_double = 0.0;
        int var17_int = 0;
        double var17 = 0.0;
        int var18 = 0;
        ed var18_ref_ed = null;
        int var19 = 0;
        double var20_double = 0.0;
        long var20_long = 0L;
        int var20 = 0;
        Object var21_ref = null;
        ic var21_ref_ic = null;
        int var21 = 0;
        Object var22 = null;
        double var22_double = 0.0;
        int var22_int = 0;
        sa var22_ref = null;
        int var23_int = 0;
        ed var23 = null;
        double var24_double = 0.0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hg var27 = null;
        int var28 = 0;
        Object var29 = null;
        am var29_ref = null;
        int var30 = 0;
        hl var31 = null;
        Object var32 = null;
        sa var32_ref = null;
        Object var33 = null;
        am var33_ref = null;
        Object var34 = null;
        sa var34_ref = null;
        hl var35 = null;
        hl var36 = null;
        Object var37 = null;
        sa var37_ref = null;
        ed var38 = null;
        ed var39 = null;
        Object var40 = null;
        vh var40_ref = null;
        ed var41 = null;
        int[] var42 = null;
        pi var43 = null;
        Object var44 = null;
        sa var44_ref = null;
        fn var45 = null;
        int[] var46 = null;
        L0: {
          var32 = null;
          var33 = null;
          var34 = null;
          var37 = null;
          var40 = null;
          var21_ref = null;
          var22 = null;
          var29 = null;
          var44 = null;
          var30 = EscapeVector.field_A;
          if (this.field_eb == null) {
            break L0;
          } else {
            pf.e((byte) -106);
            break L0;
          }
        }
        L1: {
          if (-1 >= (this.field_Pb ^ -1)) {
            break L1;
          } else {
            this.field_pc = -1 + this.field_pc & 1023;
            break L1;
          }
        }
        L2: {
          if (this.field_B == null) {
            break L2;
          } else {
            this.field_B.field_c = this.field_B.field_c + 1;
            break L2;
          }
        }
        L3: while (true) {
          L4: {
            L5: {
              L6: {
                if (!pn.p(-116)) {
                  if (this.field_B.b((byte) -110)) {
                    return;
                  } else {
                    this.field_sb = this.field_sb + 1;
                    if (this.n((byte) 94)) {
                      L7: {
                        this.c(0);
                        if (this.field_j > 0) {
                          this.field_j = this.field_j - 1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (this.field_Gb) {
                          break L8;
                        } else {
                          if (this.field_Ib) {
                            break L8;
                          } else {
                            if (this.field_Jb) {
                              break L8;
                            } else {
                              L9: {
                                if (!this.field_ec) {
                                  break L9;
                                } else {
                                  if (0 > this.field_Pb) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (-1 <= (this.field_c ^ -1)) {
                                if (this.field_Pb < 0) {
                                  break L4;
                                } else {
                                  if (2160000 <= this.field_cb) {
                                    break L4;
                                  } else {
                                    this.field_cb = this.field_cb + 1;
                                    hi.d(false);
                                    break L4;
                                  }
                                }
                              } else {
                                L10: {
                                  if (this.field_c == 64) {
                                    pl.field_n.a(dd.field_g, 100, qm.field_c * 1024 / 64, 8192);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                L11: {
                                  this.field_c = this.field_c - 1;
                                  if (0 != this.field_c) {
                                    break L11;
                                  } else {
                                    this.field_c = -64;
                                    break L11;
                                  }
                                }
                                this.s((byte) -41);
                                return;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        if (this.field_Jb) {
                          break L12;
                        } else {
                          if (-1 < (this.field_c ^ -1)) {
                            break L12;
                          } else {
                            if (this.field_Qb == 0) {
                              break L12;
                            } else {
                              if (this.field_Pb >= 0) {
                                break L5;
                              } else {
                                if (this.field_z != 0) {
                                  break L5;
                                } else {
                                  if (!this.field_zb) {
                                    break L12;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_82_0 = -1;
                      stackIn_82_1 = this.field_c ^ -1;
                      break L6;
                    } else {
                      return;
                    }
                  }
                } else {
                  L13: {
                    if ((nk.field_n ^ -1) != (of.field_c ^ -1)) {
                      break L13;
                    } else {
                      if (this.field_B == null) {
                        break L13;
                      } else {
                        this.field_B.e((byte) -101);
                        if (this.field_B.b((byte) -107)) {
                          this.s((byte) -41);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  L14: {
                    if (this.field_B == null) {
                      break L14;
                    } else {
                      if (!this.field_B.b((byte) -114)) {
                        break L14;
                      } else {
                        if ((nk.field_n ^ -1) != -14) {
                          break L14;
                        } else {
                          this.field_B.e((byte) -101);
                          break L14;
                        }
                      }
                    }
                  }
                  L15: {
                    if ((nk.field_n ^ -1) == -14) {
                      L16: {
                        if (!this.field_Gb) {
                          break L16;
                        } else {
                          if (-1 == (this.field_A ^ -1)) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (!this.field_Jb) {
                        L17: {
                          if (!this.field_B.b((byte) -122)) {
                            break L17;
                          } else {
                            this.field_B.e((byte) -101);
                            break L17;
                          }
                        }
                        this.s((byte) -41);
                        da.field_c = new tf();
                        mj.field_d = 0;
                        gi.a((byte) -56);
                        return;
                      } else {
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L18: {
                    if (!od.field_k) {
                      break L18;
                    } else {
                      if (-13 != (nk.field_n ^ -1)) {
                        break L18;
                      } else {
                        this.field_c = 63;
                        this.field_Ub = 1;
                        this.field_Ib = true;
                        this.field_Gb = false;
                        this.field_rc = false;
                        System.out.println("Level skip cheat activated");
                        break L18;
                      }
                    }
                  }
                  L19: {
                    if (!od.field_k) {
                      break L19;
                    } else {
                      if (nk.field_n == 11) {
                        L20: {
                          stackIn_34_0 = this;

                          if (this.field_F) {
                            stackIn_35_0 = this;
                            stackIn_35_1 = 0;
                            break L20;
                          } else {
                            stackIn_35_0 = this;
                            stackIn_35_1 = 1;
                            break L20;
                          }
                        }
                        L21: {
                          ((oe) (this)).field_F = stackIn_35_1 != 0;
                          stackIn_37_0 = this;

                          if (this.field_F) {
                            stackIn_38_0 = this;
                            stackIn_38_1 = 0;
                            break L21;
                          } else {
                            stackIn_38_0 = this;
                            stackIn_38_1 = 1;
                            break L21;
                          }
                        }
                        ((oe) (this)).field_rc = stackIn_38_1 != 0;
                        System.out.println("Easypeasy cheat activated");
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (!od.field_k) {
                    continue L3;
                  } else {
                    stackIn_82_0 = nk.field_n ^ -1;

                    stackIn_82_1 = -11;

                    if (stackIn_82_0 == stackIn_82_1) {
                      L22: {
                        stackIn_45_0 = this;

                        if (this.field_gb) {
                          stackIn_46_0 = this;
                          stackIn_46_1 = 0;
                          break L22;
                        } else {
                          stackIn_46_0 = this;
                          stackIn_46_1 = 1;
                          break L22;
                        }
                      }
                      L23: {
                        ((oe) (this)).field_gb = stackIn_46_1 != 0;
                        stackIn_48_0 = this;

                        if (this.field_gb) {
                          stackIn_49_0 = this;
                          stackIn_49_1 = 0;
                          break L23;
                        } else {
                          stackIn_49_0 = this;
                          stackIn_49_1 = 1;
                          break L23;
                        }
                      }
                      ((oe) (this)).field_rc = stackIn_49_1 != 0;
                      System.out.println("Timehack checking cheat activated");
                      continue L3;
                    } else {
                      continue L3;
                    }
                  }
                }
              }
              L24: {
                if (stackIn_82_0 == stackIn_82_1) {
                  var31 = hl.c(dd.field_g, 100, qm.field_c * 1024 / 64, 8192);
                  var31.e();
                  pl.field_n.a(var31);
                  break L24;
                } else {
                  break L24;
                }
              }
              this.field_c = this.field_c + 1;
              break L5;
            }
            L25: {
              if (!this.g((byte) -61)) {
                break L25;
              } else {
                if (!this.field_rc) {
                  break L25;
                } else {
                  if (0 > this.field_Pb) {
                    break L25;
                  } else {
                    L26: {
                      if (this.field_c != -100) {
                        break L26;
                      } else {
                        this.field_ob = this.field_ob + this.field_J;
                        this.field_T = this.field_cb;
                        this.field_J = 0;
                        pl.field_n.a(pl.field_o, 100, qm.field_c * 6144 / 64, 8192);
                        break L26;
                      }
                    }
                    L27: {
                      if (this.field_c == -75) {
                        var2 = ei.a(0, this.field_ac, this.field_fc);
                        this.field_ob = this.field_ob + var2;
                        v.a(8, var2);
                        pl.field_n.a(pl.field_o, 100, qm.field_c * 6144 / 64, 8192);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (49 == (this.field_c ^ -1)) {
                        var2 = ei.a(0, this.field_Tb * 2, this.field_fc);
                        this.field_ob = this.field_ob + var2;
                        v.a(8, var2);
                        pl.field_n.a(pl.field_o, 100, qm.field_c * 6144 / 64, 8192);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    this.f(false);
                    break L25;
                  }
                }
              }
            }
            if (-65 >= (this.field_c ^ -1)) {
              L29: {
                L30: {
                  L31: {
                    if (this.field_Gb) {
                      break L31;
                    } else {
                      if (!this.field_Jb) {
                        break L30;
                      } else {
                        break L31;
                      }
                    }
                  }
                  if (this.field_Cb) {
                    break L30;
                  } else {
                    L32: {
                      if (this.field_A == 0) {
                        break L32;
                      } else {
                        if (!this.field_Jb) {
                          break L29;
                        } else {
                          break L32;
                        }
                      }
                    }
                    L33: {
                      if ((this.field_Pb ^ -1) > -1) {
                        break L33;
                      } else {
                        this.b((byte) 36, this.field_ob - -this.field_J, this.field_Pb);
                        break L33;
                      }
                    }
                    this.p(0);
                    return;
                  }
                }
                L34: {
                  if (this.g((byte) -122)) {
                    break L34;
                  } else {
                    if (!this.field_Cb) {
                      break L29;
                    } else {
                      break L34;
                    }
                  }
                }
                L35: {
                  L36: {
                    this.field_Jb = false;
                    this.field_Pb = this.field_Pb + 1;
                    this.field_w = this.field_bc;
                    this.field_Cb = false;
                    this.field_ic = this.field_u;
                    if ((this.field_Pb ^ -1) == -3) {
                      break L36;
                    } else {
                      if (-1 != (this.field_Pb & 3 ^ -1)) {
                        break L35;
                      } else {
                        break L36;
                      }
                    }
                  }
                  L37: {
                    if (this.field_Pb == 0) {
                      this.field_Qb = 0;
                      this.a(164, (byte) 55, m.field_n);
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  this.y((byte) -40);
                  break L35;
                }
                L38: {
                  if (this.field_Nb == null) {
                    break L38;
                  } else {
                    if (this.field_Nb.length != this.field_Pb) {
                      break L38;
                    } else {
                      this.b((byte) -122, this.field_ob, this.field_Nb.length);
                      this.E(-3);
                      this.p(0);
                      return;
                    }
                  }
                }
                this.field_j = 314;
                break L29;
              }
              this.j((byte) -110);
              return;
            } else {
              L39: {
                if (this.field_Ib) {
                  break L39;
                } else {
                  if (!this.field_Jb) {
                    break L4;
                  } else {
                    break L39;
                  }
                }
              }
              this.s((byte) -41);
              this.p((byte) 9);
              return;
            }
          }
          var2 = 0;
          L40: while (true) {
            L41: {
              if (var2 >= 64) {
                this.field_Xb.a();
                this.field_Zb = 15 & 1 + this.field_Zb;
                this.d(true);
                stackIn_137_0 = this.field_Gb;
                break L41;
              } else {
                stackIn_137_0 = this.field_Xb.field_E[this.field_Sb - -var2];

                L42: {
                  if (stackIn_137_0) {
                    this.field_qc = this.field_qc - 1;
                    this.field_Xb.field_E[this.field_Sb + var2] = false;
                    break L42;
                  } else {
                    break L42;
                  }
                }
                var2++;
                continue L40;
              }
            }
            L43: {
              if (!stackIn_137_0) {
                L44: {
                  if (!this.field_rb) {
                    L45: {
                      if (!ik.field_h[97]) {
                        break L45;
                      } else {
                        if (ik.field_h[96]) {
                          break L45;
                        } else {
                          if (!this.field_jc) {
                            this.field_I = 252 & 7 + this.field_I;
                            break L45;
                          } else {
                            this.field_I = this.field_I - -2 & 255;
                            break L45;
                          }
                        }
                      }
                    }
                    this.field_hc = this.field_hc + this.field_qb;
                    if (!ik.field_h[96]) {
                      break L44;
                    } else {
                      if (!ik.field_h[97]) {
                        if (!this.field_kc) {
                          this.field_I = -4 + this.field_I & 252;
                          break L44;
                        } else {
                          this.field_I = -2 + this.field_I & 255;
                          break L44;
                        }
                      } else {
                        break L44;
                      }
                    }
                  } else {
                    break L44;
                  }
                }
                L46: {
                  if (!ik.field_h[98]) {
                    break L46;
                  } else {
                    if ((this.field_ac ^ -1) >= -1) {
                      break L46;
                    } else {
                      if (0 != this.field_e) {
                        break L46;
                      } else {
                        L47: {
                          this.field_jb.f(1024 * qm.field_c / 64);
                          this.field_kc = false;
                          this.field_rb = false;
                          this.field_jc = false;
                          var2_double = 0.02454369260617026 * (double)this.field_I;
                          this.field_mc = this.field_mc + (int)((double)this.field_ib * Math.sin(var2_double));
                          this.field_hc = this.field_hc - (int)((double)this.field_ib * Math.cos(var2_double));
                          if (-1 < (this.field_Pb ^ -1)) {
                            break L47;
                          } else {
                            L48: {
                              if (!this.field_F) {
                                this.field_ac = this.field_ac - 1;
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            ji.a(true, -1);
                            break L47;
                          }
                        }
                        L49: {
                          if (this.field_ac != 0) {
                            break L49;
                          } else {
                            this.a(-111, rl.field_l);
                            break L49;
                          }
                        }
                        var4 = 0;
                        L50: while (true) {
                          if (var4 >= 64) {
                            this.field_qc = this.field_qc + 64;
                            break L43;
                          } else {
                            this.field_Xb.field_E[this.field_Sb - -var4] = true;
                            var5_double = var2_double + 0.2 * Math.random() - 0.1;
                            var7_double = (double)this.field_ib * 616.8094117647058 * (0.5 + Math.random());
                            var9 = -(int)(var7_double * Math.sin(var5_double));
                            var10 = (int)(var7_double * Math.cos(var5_double));
                            this.field_Xb.field_x[this.field_Sb - -var4] = this.field_H + this.field_mc;
                            this.field_Xb.field_A[this.field_Sb + var4] = this.field_p + this.field_hc;
                            var11_double = Math.random();
                            this.field_Xb.field_y[var4 + this.field_Sb] = (int)((double)var9 * var11_double);
                            this.field_Xb.field_C[this.field_Sb + var4] = (int)(var11_double * (double)var10);
                            this.field_Xb.field_w[this.field_Sb - -var4] = 0;
                            this.field_Xb.i(var4 + this.field_Sb);
                            this.field_Xb.field_y[this.field_Sb - -var4] = var9 + this.field_mc;
                            this.field_Xb.field_C[var4 + this.field_Sb] = var10 + this.field_hc;
                            var4++;
                            continue L50;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_jb.j(0);
                break L43;
              } else {
                this.field_jb.j(0);
                break L43;
              }
            }
            L51: {
              var2 = 0;
              if ((this.field_Pb ^ -1) <= -1) {
                break L51;
              } else {
                L52: {
                  if ((this.field_p ^ -1) <= -33554433) {
                    L53: {
                      L54: {
                        if (18874368 > this.field_H) {
                          break L54;
                        } else {
                          if ((this.field_H ^ -1) <= -48234497) {
                            break L54;
                          } else {
                            break L53;
                          }
                        }
                      }
                      var2 = 1;
                      break L53;
                    }
                    if (-35651585 >= (this.field_p ^ -1)) {
                      break L52;
                    } else {
                      if ((this.field_H ^ -1) > -28311553) {
                        break L52;
                      } else {
                        if ((this.field_H ^ -1) > -38797313) {
                          var2 = 1;
                          break L52;
                        } else {
                          break L52;
                        }
                      }
                    }
                  } else {
                    break L52;
                  }
                }
                var3 = (this.field_hc >> -300898904) * (this.field_hc >> 81975624) + (this.field_mc >> -1586532408) * (this.field_mc >> 48860008);
                if ((this.field_p ^ -1) > -65011713) {
                  break L51;
                } else {
                  if (-50177 > (var3 ^ -1)) {
                    L55: {
                      var4 = -this.field_p + 67108864;
                      if (1048576 > var4) {
                        break L55;
                      } else {
                        if ((-1048576 + var4 >> 729782918) + 50176 >= var3) {
                          break L51;
                        } else {
                          break L55;
                        }
                      }
                    }
                    var2 = 1;
                    break L51;
                  } else {
                    break L51;
                  }
                }
              }
            }
            L56: {
              L57: {
                if (this.field_Gb) {
                  break L57;
                } else {
                  L58: {
                    L59: {
                      if (bc.field_d) {
                        break L59;
                      } else {
                        if (ik.field_h[83]) {
                          break L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                    if (ik.field_h[81]) {
                      break L58;
                    } else {
                      if (var2 == 0) {
                        break L57;
                      } else {
                        break L58;
                      }
                    }
                  }
                  if ((this.field_Tb ^ -1) >= -1) {
                    break L57;
                  } else {
                    if (-1 != (this.field_e ^ -1)) {
                      break L57;
                    } else {
                      L60: {
                        if (var2 == 0) {
                          this.field_db = true;
                          break L60;
                        } else {
                          break L60;
                        }
                      }
                      L61: {
                        if (this.field_Pb < 0) {
                          break L61;
                        } else {
                          this.field_Tb = this.field_Tb - 1;
                          ca.b((byte) 76);
                          break L61;
                        }
                      }
                      L62: {
                        if (0 != this.field_Tb) {
                          break L62;
                        } else {
                          this.a(-107, rc.field_c);
                          pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
                          break L62;
                        }
                      }
                      this.field_Bb = true;
                      this.field_rb = false;
                      this.field_v.f(qm.field_c * 16384 / 64);
                      break L56;
                    }
                  }
                }
              }
              this.field_Bb = false;
              this.field_v.f(0);
              break L56;
            }
            this.a(true);
            var3 = 0;
            var4 = 0;
            var5_long = 0L;
            var7_long = 0L;
            var9 = 0;
            L63: while (true) {
              L64: {
                L65: {
                  if ((this.field_kb.size() ^ -1) >= (var9 ^ -1)) {
                    L66: {
                      stackIn_227_0 = this.field_Wb;

                      stackIn_227_1 = (int)Math.sqrt((double)var3 + 0.5);

                      if (0 == var3) {
                        stackIn_228_0 = (hl) ((Object) stackIn_227_0);
                        stackIn_228_1 = stackIn_227_1;
                        stackIn_228_2 = 8192;
                        break L66;
                      } else {
                        stackIn_228_0 = (hl) ((Object) stackIn_227_0);
                        stackIn_228_1 = stackIn_227_1;
                        stackIn_228_2 = (int)(var5_long / (long)var3);
                        break L66;
                      }
                    }
                    L67: {
                      ((hl) (Object) stackIn_228_0).f(stackIn_228_1, stackIn_228_2);
                      stackIn_230_0 = this.field_wb;

                      stackIn_230_1 = (int)Math.sqrt((double)var4 + 0.5);

                      if (-1 != (var4 ^ -1)) {
                        stackIn_231_0 = (hl) ((Object) stackIn_230_0);
                        stackIn_231_1 = stackIn_230_1;
                        stackIn_231_2 = (int)(var7_long / (long)var4);
                        break L67;
                      } else {
                        stackIn_231_0 = (hl) ((Object) stackIn_230_0);
                        stackIn_231_1 = stackIn_230_1;
                        stackIn_231_2 = 8192;
                        break L67;
                      }
                    }
                    L68: {
                      ((hl) (Object) stackIn_231_0).f(stackIn_231_1, stackIn_231_2);
                      var3 = 0;
                      var4_long = 0L;
                      if (this.field_oc < 50) {
                        var6_ref_hg = this.field_C.a(false);
                        var7 = 0;
                        L69: while (true) {
                          if ((var7 ^ -1) <= (this.field_ub ^ -1)) {
                            break L68;
                          } else {
                            var33_ref = (am) ((Object) var6_ref_hg);
                            var9 = var33_ref.field_i << -106068848;
                            var10 = var33_ref.field_i << -289017136;
                            var11 = var33_ref.field_j << 2134602960;
                            L70: while (true) {
                              if (this.field_H >= var9) {
                                L71: {
                                  if ((var10 ^ -1) >= (this.field_H ^ -1)) {
                                    if (this.field_H >= this.field_n + var10 >> 1717008929) {
                                      var12 = var9;
                                      break L71;
                                    } else {
                                      var12 = var10;
                                      break L71;
                                    }
                                  } else {
                                    var12 = this.field_H;
                                    break L71;
                                  }
                                }
                                var13_int = this.b(1310720, var12, 96, var11);
                                var13_int = var13_int * var13_int;
                                var4_long = var4_long + (long)this.c(var12, 123) * (long)var13_int;
                                var3 = var3 + var13_int;
                                var6_ref_hg = var6_ref_hg.field_b;
                                var7++;
                                continue L69;
                              } else {
                                var9 = var9 - (this.field_n << 1265958928);
                                var10 = var10 - (this.field_n << -392601232);
                                continue L70;
                              }
                            }
                          }
                        }
                      } else {
                        break L68;
                      }
                    }
                    L72: {
                      stackIn_246_0 = this.field_r;

                      stackIn_246_1 = ie.field_q / 100;

                      stackIn_246_2 = (int)Math.sqrt(0.5 + (double)var3);

                      if (-1 == (var3 ^ -1)) {
                        stackIn_247_0 = (hl) ((Object) stackIn_246_0);
                        stackIn_247_1 = stackIn_246_1;
                        stackIn_247_2 = stackIn_246_2;
                        stackIn_247_3 = 8192;
                        break L72;
                      } else {
                        stackIn_247_0 = (hl) ((Object) stackIn_246_0);
                        stackIn_247_1 = stackIn_246_1;
                        stackIn_247_2 = stackIn_246_2;
                        stackIn_247_3 = (int)(var4_long / (long)var3);
                        break L72;
                      }
                    }
                    ((hl) (Object) stackIn_247_0).a(stackIn_247_1, stackIn_247_2, stackIn_247_3);
                    var3_ref_ic = (ic) ((Object) this.field_N.a(false));
                    L73: while (true) {
                      if (var3_ref_ic == null) {
                        L74: {
                          this.field_oc = (1 + this.field_oc) % 200;
                          if (!this.field_Gb) {
                            break L74;
                          } else {
                            if ((this.field_Ub ^ -1) <= -1) {
                              break L74;
                            } else {
                              break L64;
                            }
                          }
                        }
                        L75: {
                          var3 = 0;
                          var4 = 0;
                          if (this.field_Gb) {
                            break L75;
                          } else {
                            var4 = this.field_hc;
                            var3 = this.field_mc;
                            break L75;
                          }
                        }
                        stackIn_324_0 = this.field_Ub ^ -1;
                        stackIn_324_1 = -1;
                        break L65;
                      } else {
                        L76: {
                          if (null == var3_ref_ic.field_g) {
                            var3_ref_ic.field_m = new tl();
                            var3_ref_ic.field_g = hl.a(ci.field_a, 256, 0, 8192);
                            var3_ref_ic.field_m.field_k = hl.a(qi.field_J, 256, 0, 8192);
                            var3_ref_ic.field_m.field_q = hl.a(qi.field_J, 256, 0, 8192);
                            var3_ref_ic.field_g.h(-1);
                            var3_ref_ic.field_m.field_k.h(-1);
                            var3_ref_ic.field_m.field_q.h(-1);
                            var3_ref_ic.field_g.e((int)(Math.random() * (double)ci.field_a.field_h.length));
                            pl.field_n.a(var3_ref_ic.field_g);
                            pl.field_n.a(var3_ref_ic.field_m);
                            break L76;
                          } else {
                            break L76;
                          }
                        }
                        L77: {
                          var4 = this.field_H + -var3_ref_ic.field_p;
                          var5 = this.field_p + -var3_ref_ic.field_q;
                          if (-this.field_n << 1144939663 <= var4) {
                            if (var4 < this.field_n << -1606377937) {
                              break L77;
                            } else {
                              var4 = var4 - (this.field_n << 818017296);
                              break L77;
                            }
                          } else {
                            var4 = var4 + (this.field_n << -284659920);
                            break L77;
                          }
                        }
                        L78: {
                          L79: {
                            var6_double = (double)var5 * (double)var5 + (double)var4 * (double)var4;
                            if (this.field_Gb) {
                              break L79;
                            } else {
                              if (171798691840000.0 <= var6_double) {
                                break L79;
                              } else {
                                stackIn_260_0 = 1;
                                break L78;
                              }
                            }
                          }
                          stackIn_260_0 = 0;
                          break L78;
                        }
                        L80: {
                          var8 = stackIn_260_0;
                          if (var8 == 0) {
                            L81: {
                              var3_ref_ic.field_m.field_p = 0;
                              var4 = var3_ref_ic.field_j + -var3_ref_ic.field_p;
                              if (-this.field_n << 1062449455 > var4) {
                                var4 = var4 + (this.field_n << 1253586768);
                                break L81;
                              } else {
                                if ((this.field_n << 966841487 ^ -1) >= (var4 ^ -1)) {
                                  var4 = var4 - (this.field_n << 690342960);
                                  break L81;
                                } else {
                                  break L81;
                                }
                              }
                            }
                            L82: {
                              var4 = 32 + var4 >> -1262963386;
                              var5 = var3_ref_ic.field_l + -var3_ref_ic.field_q - -16 >> 1257587653;
                              if ((var5 ^ -1) >= 63) {
                                break L82;
                              } else {
                                if (var5 >= 64) {
                                  break L82;
                                } else {
                                  if (0 >= var5) {
                                    var5 = -64;
                                    break L82;
                                  } else {
                                    var5 = 64;
                                    break L82;
                                  }
                                }
                              }
                            }
                            L83: {
                              if (var4 <= -64) {
                                break L83;
                              } else {
                                if ((var4 ^ -1) > -65) {
                                  if ((var4 ^ -1) < -1) {
                                    var4 = 64;
                                    break L83;
                                  } else {
                                    var4 = -64;
                                    break L83;
                                  }
                                } else {
                                  break L83;
                                }
                              }
                            }
                            var9 = 30000 + -(var3_ref_ic.field_h >> -789613498);
                            break L80;
                          } else {
                            var6_double = Math.sqrt(var6_double);
                            var3_ref_ic.field_m.field_k.i((int)(Math.pow(0.8464491362763915, var6_double / 13107200.0) * 6668800.0) / ie.field_q);
                            var3_ref_ic.field_m.field_q.i((int)(Math.pow(0.5646606914212549, var6_double / 13107200.0) * 59980800.0) / ie.field_q);
                            var3_ref_ic.field_m.field_p = (int)(Math.pow(0.1, var6_double / 13107200.0) * 26214.4);
                            var3_ref_ic.field_l = var3_ref_ic.field_q;
                            var6_double = 2949.12 / var6_double;
                            var3_ref_ic.field_j = var3_ref_ic.field_p;
                            var9 = 40000;
                            var5 = (int)((double)var5 * var6_double);
                            var4 = (int)((double)var4 * var6_double);
                            break L80;
                          }
                        }
                        L84: {
                          if (-1 == (var3_ref_ic.field_o ^ -1)) {
                            var3_ref_ic.field_o = var9;
                            break L84;
                          } else {
                            var3_ref_ic.field_o = var3_ref_ic.field_o + (4 + -var3_ref_ic.field_o + var9 >> 77019427);
                            break L84;
                          }
                        }
                        L85: {
                          var3_ref_ic.field_g.i(var3_ref_ic.field_o * 256 / ie.field_q);
                          var3_ref_ic.field_h = var3_ref_ic.field_h + var5;
                          var3_ref_ic.field_i = var3_ref_ic.field_i + var4;
                          if (var8 == 0) {
                            var3_ref_ic.field_i = var3_ref_ic.field_i + (32 + var3_ref_ic.field_i >> -589437466);
                            var3_ref_ic.field_h = var3_ref_ic.field_h + (var3_ref_ic.field_h - -32 >> -1942076442);
                            break L85;
                          } else {
                            var3_ref_ic.field_h = var3_ref_ic.field_h - (var3_ref_ic.field_h + 32 >> 1136355846);
                            var3_ref_ic.field_i = var3_ref_ic.field_i - (var3_ref_ic.field_i + 32 >> 722894950);
                            break L85;
                          }
                        }
                        L86: {
                          var6_double = (double)var3_ref_ic.field_i * (double)var3_ref_ic.field_i + (double)var3_ref_ic.field_h * (double)var3_ref_ic.field_h;
                          if (var8 != 0) {
                            stackIn_288_0 = 38654705664.0;
                            break L86;
                          } else {
                            stackIn_288_0 = 9663676416.0;
                            break L86;
                          }
                        }
                        L87: {
                          var10_double = stackIn_288_0;
                          if (var10_double < var6_double) {
                            var6_double = Math.sqrt(var10_double / var6_double);
                            var3_ref_ic.field_h = (int)((double)var3_ref_ic.field_h * var6_double);
                            var3_ref_ic.field_i = (int)((double)var3_ref_ic.field_i * var6_double);
                            break L87;
                          } else {
                            break L87;
                          }
                        }
                        L88: {
                          L89: {
                            var3_ref_ic.field_q = var3_ref_ic.field_q + var3_ref_ic.field_h;
                            var3_ref_ic.field_p = ((this.field_n << 261668336) + (var3_ref_ic.field_p - -var3_ref_ic.field_i)) % (this.field_n << -1414490096);
                            var12 = this.b(4194304, var3_ref_ic.field_p, 96, var3_ref_ic.field_q);
                            var13_int = this.c(var3_ref_ic.field_p, 117);
                            var3_ref_ic.field_g.f(var12 >> -2106626911, var13_int);
                            var3_ref_ic.field_m.field_s = var12;
                            var3_ref_ic.field_m.field_n = var13_int;
                            var14 = this.field_n + (var3_ref_ic.field_p >> 1479385296);
                            var15_int = var3_ref_ic.field_q >> 81160400;
                            var16 = var14 + -8;
                            var17_int = -8 + var15_int;
                            if (this.field_Gb) {
                              break L89;
                            } else {
                              if (!this.field_Bb) {
                                if (!this.a(false, var17_int, var16, s.field_H)) {
                                  break L89;
                                } else {
                                  this.h((byte) -62);
                                  this.a(var3_ref_ic, 5);
                                  break L88;
                                }
                              } else {
                                this.field_Hb = 0;
                                this.field_pb = 0;
                                this.a(s.field_H, var17_int, var16, (byte) 83);
                                if ((this.field_Hb | this.field_pb) != 0) {
                                  L90: {
                                    var18 = var3_ref_ic.field_i + 3 * this.field_mc >> -1958849342;
                                    this.field_mc = this.field_mc - var18;
                                    var19 = this.field_hc * 3 + var3_ref_ic.field_h >> 1949905346;
                                    this.field_hc = this.field_hc - var19;
                                    var20_double = (double)this.field_Hb;
                                    var22_double = (double)this.field_pb;
                                    var24_double = 1.0 / Math.sqrt(var20_double * var20_double + var22_double * var22_double);
                                    var22_double = var22_double * var24_double;
                                    var20_double = var20_double * var24_double;
                                    var24_double = 49152.0 + ((double)this.field_mc * var20_double + (double)this.field_hc * var22_double);
                                    if (var24_double > 0.0) {
                                      this.field_hc = (int)((double)this.field_hc - var24_double * var22_double);
                                      this.field_mc = (int)((double)this.field_mc - var24_double * var20_double);
                                      break L90;
                                    } else {
                                      break L90;
                                    }
                                  }
                                  L91: {
                                    this.field_mc = this.field_mc + var18;
                                    this.field_hc = this.field_hc + var19;
                                    this.a(var3_ref_ic, 5);
                                    var12 = (int)var24_double >> 1393950820;
                                    if (var12 > 6144) {
                                      var12 = 6144;
                                      break L91;
                                    } else {
                                      break L91;
                                    }
                                  }
                                  pl.field_n.a(co.field_d, 100, var12 * qm.field_c / 64, 8192);
                                  break L88;
                                } else {
                                  break L89;
                                }
                              }
                            }
                          }
                          L92: {
                            if (0 > this.field_Ub) {
                              break L92;
                            } else {
                              if (this.field_e != 0) {
                                break L92;
                              } else {
                                var18_ref_ed = mb.field_f[this.field_Ub];
                                var19 = -var16 + (this.field_mb - (var18_ref_ed.field_A << -806356337) >> 1544671664);
                                L93: while (true) {
                                  if (-this.field_n >> -75635903 <= var19) {
                                    L94: while (true) {
                                      if (var19 < this.field_n >> 387449601) {
                                        if (!ln.a(s.field_H, 0, var17_int, var18_ref_ed, var19, -(var18_ref_ed.field_z << -1512645169) + this.field_E >> -391802224)) {
                                          break L92;
                                        } else {
                                          this.k((byte) 64);
                                          this.a(var3_ref_ic, 5);
                                          break L88;
                                        }
                                      } else {
                                        var19 = var19 - this.field_n;
                                        continue L94;
                                      }
                                    }
                                  } else {
                                    var19 = var19 + this.field_n;
                                    continue L93;
                                  }
                                }
                              }
                            }
                          }
                          if (!this.b(var16, s.field_H, var17_int, -1)) {
                            break L88;
                          } else {
                            L95: {
                              if (this.field_Gb) {
                                break L95;
                              } else {
                                var18 = hc.a(this.field_fc, (byte) 77);
                                this.field_J = this.field_J + var18;
                                v.a(8, var18);
                                break L95;
                              }
                            }
                            this.a(var3_ref_ic, 5);
                            break L88;
                          }
                        }
                        var3_ref_ic = (ic) ((Object) this.field_N.b((byte) 70));
                        continue L73;
                      }
                    }
                  } else {
                    var32_ref = (sa) (this.field_kb.elementAt(var9));
                    stackIn_324_0 = var32_ref.field_n ^ -1;

                    stackIn_324_1 = -4;

                    L96: {
                      L97: {
                        if (stackIn_324_0 == stackIn_324_1) {
                          break L97;
                        } else {
                          if (4 != var32_ref.field_n) {
                            break L96;
                          } else {
                            break L97;
                          }
                        }
                      }
                      var32_ref.field_h = false;
                      if (this.field_Gb) {
                        break L96;
                      } else {
                        L98: {
                          var11 = 12 + var32_ref.field_k << -781954320;
                          var12 = var32_ref.field_g + 12 << 875048656;
                          var13 = (double)(-var11 + this.field_H);
                          var15 = (double)(this.field_p + -var12);
                          if ((double)(-this.field_n << -2030461297) > var13) {
                            var13 = var13 + (double)(this.field_n << -1675959216);
                            break L98;
                          } else {
                            if ((double)(this.field_n << -1145467601) > var13) {
                              break L98;
                            } else {
                              var13 = var13 - (double)(this.field_n << -1922388976);
                              break L98;
                            }
                          }
                        }
                        var17 = var15 * var15 + var13 * var13;
                        if (var17 >= 171798691840000.0) {
                          break L96;
                        } else {
                          L99: {
                            var32_ref.field_h = true;
                            var19 = this.b(1310720, var11, 96, var12);
                            var19 = var19 * var19;
                            var20_long = (long)this.c(var11, 106) * (long)var19;
                            if ((var32_ref.field_n ^ -1) == -4) {
                              var4 = var4 + var19;
                              var7_long = var7_long + var20_long;
                              break L99;
                            } else {
                              var5_long = var5_long + var20_long;
                              var3 = var3 + var19;
                              break L99;
                            }
                          }
                          if (this.field_rb) {
                            break L96;
                          } else {
                            L100: {
                              var22_int = (int)(var13 * 4294967296.0 / var17);
                              var23_int = (int)(4294967296.0 * var15 / var17);
                              if (var32_ref.field_n == 3) {
                                var22_int = -var22_int;
                                var23_int = -var23_int;
                                break L100;
                              } else {
                                break L100;
                              }
                            }
                            this.field_hc = this.field_hc + var23_int;
                            this.field_mc = this.field_mc + var22_int;
                            break L96;
                          }
                        }
                      }
                    }
                    var9++;
                    continue L63;
                  }
                }
                L101: {
                  if (stackIn_324_0 <= stackIn_324_1) {
                    var3 = (this.field_Ob >> 1546827202) + var3 - (var3 >> -2100683806);
                    var4 = (this.field_o >> -104173022) + (var4 - (var4 >> 1469362434));
                    break L101;
                  } else {
                    break L101;
                  }
                }
                var5_double = (double)var4 * (double)var4 + (double)var3 * (double)var3;
                if (1717986918400.0 > var5_double) {
                  break L64;
                } else {
                  var5_double = Math.sqrt(1717986918400.0 / var5_double);
                  this.field_mc = (int)((double)this.field_mc * var5_double);
                  this.field_Ob = (int)((double)this.field_Ob * var5_double);
                  this.field_o = (int)((double)this.field_o * var5_double);
                  this.field_hc = (int)((double)this.field_hc * var5_double);
                  break L64;
                }
              }
              L102: {
                var3 = 0;
                if (!this.field_Gb) {
                  L103: {
                    if (!this.field_rb) {
                      L104: {
                        if (-33554433 < (this.field_p ^ -1)) {
                          stackIn_337_0 = 0;
                          break L104;
                        } else {
                          stackIn_337_0 = 1;
                          break L104;
                        }
                      }
                      L105: {
                        var4 = stackIn_337_0;
                        this.field_M = this.field_M + this.field_mc;
                        this.field_H = this.field_H + this.field_mc;
                        this.field_p = this.field_p + this.field_hc;
                        if (!this.field_kc) {
                          stackIn_340_0 = 0;
                          break L105;
                        } else {
                          stackIn_340_0 = 1;
                          break L105;
                        }
                      }
                      L106: {
                        var5 = stackIn_340_0;
                        if (!this.field_jc) {
                          stackIn_343_0 = 0;
                          break L106;
                        } else {
                          stackIn_343_0 = 1;
                          break L106;
                        }
                      }
                      L107: {
                        var6 = stackIn_343_0;
                        this.field_q = false;
                        this.field_jc = false;
                        this.field_kc = false;
                        if (!this.field_Bb) {
                          this.A((byte) -102);
                          if (this.field_q) {
                            this.h((byte) -70);
                            break L107;
                          } else {
                            L108: {
                              if (this.field_kc) {
                                break L108;
                              } else {
                                if (!this.field_jc) {
                                  break L107;
                                } else {
                                  break L108;
                                }
                              }
                            }
                            L109: {
                              if (var5 == 0) {
                                if (!this.field_kc) {
                                  break L109;
                                } else {
                                  pl.field_n.a(ka.field_e, 100, qm.field_c * 6144 / 64, 8192);
                                  break L109;
                                }
                              } else {
                                this.field_kc = true;
                                break L109;
                              }
                            }
                            L110: {
                              if (var6 != 0) {
                                this.field_jc = true;
                                break L110;
                              } else {
                                if (!this.field_jc) {
                                  break L110;
                                } else {
                                  pl.field_n.a(ri.field_b, 100, 6144 * qm.field_c / 64, 8192);
                                  break L110;
                                }
                              }
                            }
                            L111: {
                              this.field_mc = this.field_mc >> 1;
                              if (-65537 <= (this.field_hc ^ -1)) {
                                break L111;
                              } else {
                                this.field_hc = 65536;
                                break L111;
                              }
                            }
                            L112: {
                              if (!this.field_kc) {
                                break L112;
                              } else {
                                if (this.field_jc) {
                                  L113: {
                                    if (this.field_hc > 0) {
                                      this.field_hc = 0;
                                      break L113;
                                    } else {
                                      break L113;
                                    }
                                  }
                                  this.field_p = this.field_p - 65536;
                                  if (-256 > this.field_mc) {
                                    break L107;
                                  } else {
                                    if (this.field_mc > 256) {
                                      break L107;
                                    } else {
                                      this.field_hc = 0;
                                      var3 = 1;
                                      this.field_mc = 0;
                                      this.field_rb = true;
                                      break L107;
                                    }
                                  }
                                } else {
                                  break L112;
                                }
                              }
                            }
                            if (this.field_kc) {
                              this.field_M = this.field_M + 16384;
                              this.field_H = this.field_H + 16384;
                              this.field_I = this.field_I + 1 & 255;
                              break L107;
                            } else {
                              this.field_H = this.field_H - 16384;
                              this.field_I = -1 + this.field_I & 255;
                              this.field_M = this.field_M - 16384;
                              break L107;
                            }
                          }
                        } else {
                          this.field_Hb = 0;
                          this.field_pb = 0;
                          this.v((byte) 69);
                          if (0 == (this.field_Hb | this.field_pb)) {
                            break L107;
                          } else {
                            this.A(-125);
                            break L107;
                          }
                        }
                      }
                      L114: {
                        if (this.field_Pb >= 0) {
                          break L114;
                        } else {
                          if (this.field_ec) {
                            break L114;
                          } else {
                            L115: {
                              if (var4 == 0) {
                                break L115;
                              } else {
                                if (this.field_p >= 33554432) {
                                  break L115;
                                } else {
                                  this.a(-114, bh.field_e);
                                  pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
                                  break L115;
                                }
                              }
                            }
                            L116: {
                              if (var4 != 0) {
                                break L116;
                              } else {
                                if ((this.field_p ^ -1) > -33554433) {
                                  break L116;
                                } else {
                                  this.a(67, ge.field_a);
                                  pl.field_n.a(gm.field_b, 100, 6144 * qm.field_c / 64, 8192);
                                  break L103;
                                }
                              }
                            }
                            break L103;
                          }
                        }
                      }
                      break L103;
                    } else {
                      this.field_q = false;
                      this.A((byte) 72);
                      if (!this.field_q) {
                        break L103;
                      } else {
                        this.h((byte) -112);
                        break L103;
                      }
                    }
                  }
                  L117: while (true) {
                    if (this.field_H >= 0) {
                      L118: while (true) {
                        if (this.field_H < this.field_n << 1287967280) {
                          break L102;
                        } else {
                          this.field_H = this.field_H - (this.field_n << 610633680);
                          this.field_Kb = this.field_Kb + this.field_n;
                          continue L118;
                        }
                      }
                    } else {
                      this.field_H = this.field_H + (this.field_n << 2090196656);
                      this.field_Kb = this.field_Kb - this.field_n;
                      continue L117;
                    }
                  }
                } else {
                  break L102;
                }
              }
              var4_ref = this.field_f;
              var5_ref_hl = this.field_Eb;
              this.field_f = null;
              this.field_Eb = null;
              var6 = 0;
              L119: while (true) {
                L120: {
                  L121: {
                    L122: {
                      if (var6 >= this.field_kb.size()) {
                        L123: {
                          if (var4_ref == null) {
                            break L123;
                          } else {
                            if (this.field_f == null) {
                              pl.field_n.b((wg) (var4_ref));
                              pl.field_n.b(this.field_R);
                              this.field_R = null;
                              pl.field_n.a(al.field_b, 100, 6144 * qm.field_c / 64, 8192);
                              break L123;
                            } else {
                              break L123;
                            }
                          }
                        }
                        L124: {
                          if (var5_ref_hl == null) {
                            break L124;
                          } else {
                            if (null != this.field_Eb) {
                              break L124;
                            } else {
                              var5_ref_hl.h(0);
                              break L124;
                            }
                          }
                        }
                        L125: {
                          if (this.field_Gb) {
                            break L125;
                          } else {
                            if (!this.field_rb) {
                              break L125;
                            } else {
                              if (this.field_ac == 0) {
                                this.h((byte) -61);
                                break L125;
                              } else {
                                break L125;
                              }
                            }
                          }
                        }
                        L126: {
                          if (this.field_Gb) {
                            break L126;
                          } else {
                            if (!this.field_rb) {
                              break L126;
                            } else {
                              if (this.field_Ub < 0) {
                                var4_ref = null;
                                var5 = 0;
                                L127: while (true) {
                                  stackIn_449_0 = var5 ^ -1;
                                  stackIn_449_1 = -4;
                                  L128: while (true) {
                                    if (stackIn_449_0 <= stackIn_449_1) {
                                      if (var3 == 0) {
                                        break L126;
                                      } else {
                                        if (var4_ref != null) {
                                          pl.field_n.a(gm.field_b, 100, 6144 * qm.field_c / 64, 8192);
                                          this.a(127, (String) (var4_ref));
                                          break L126;
                                        } else {
                                          break L126;
                                        }
                                      }
                                    } else {
                                      var6 = 0;
                                      L129: while (true) {
                                        if ((var6 ^ -1) <= (this.field_kb.size() ^ -1)) {
                                          var5++;
                                          continue L127;
                                        } else {
                                          var37_ref = (sa) (this.field_kb.elementAt(var6));
                                          stackIn_449_0 = var5 ^ -1;

                                          stackIn_449_1 = -1;

                                          L130: {
                                            if (stackIn_449_0 != stackIn_449_1) {
                                              if (-2 != (var5 ^ -1)) {
                                                L131: {
                                                  if (var37_ref.field_n != 1) {
                                                    stackIn_466_0 = 0;
                                                    break L131;
                                                  } else {
                                                    stackIn_466_0 = 1;
                                                    break L131;
                                                  }
                                                }
                                                var8 = stackIn_466_0;
                                                break L130;
                                              } else {
                                                L132: {
                                                  if (5 != var37_ref.field_n) {
                                                    stackIn_462_0 = 0;
                                                    break L132;
                                                  } else {
                                                    stackIn_462_0 = 1;
                                                    break L132;
                                                  }
                                                }
                                                var8 = stackIn_462_0;
                                                break L130;
                                              }
                                            } else {
                                              L133: {
                                                if (!mf.a(var37_ref.field_n, -64)) {
                                                  stackIn_457_0 = 0;
                                                  break L133;
                                                } else {
                                                  stackIn_457_0 = 1;
                                                  break L133;
                                                }
                                              }
                                              var8 = stackIn_457_0;
                                              break L130;
                                            }
                                          }
                                          L134: {
                                            if (var8 == 0) {
                                              break L134;
                                            } else {
                                              var38 = var37_ref.field_i;
                                              var10 = ((var37_ref.field_k << 220453424) - -(var38.field_A << 1396780047)) % (this.field_n << -1537080912);
                                              var11 = (var38.field_z << 1965256463) + (var37_ref.field_g << 1434884784);
                                              var12 = -(var10 >> -1049496016) + (this.field_H >> 894192368);
                                              L135: while (true) {
                                                if ((-this.field_n >> -2131027135 ^ -1) >= (var12 ^ -1)) {
                                                  L136: while (true) {
                                                    if (this.field_n >> 452110241 > var12) {
                                                      L137: {
                                                        var13_int = (this.field_p >> -123368176) - (var11 >> 932257040);
                                                        if (-5 > var12) {
                                                          break L137;
                                                        } else {
                                                          if ((var12 ^ -1) < -6) {
                                                            break L137;
                                                          } else {
                                                            if (-10 - var38.field_z / 2 > var13_int) {
                                                              break L137;
                                                            } else {
                                                              if (var13_int <= -(var38.field_z / 2) + -2) {
                                                                if (-10 >= (var37_ref.field_n ^ -1)) {
                                                                  var4_ref = on.field_d;
                                                                  break L134;
                                                                } else {
                                                                  var13_int = 0;
                                                                  var12 = 0;
                                                                  break L137;
                                                                }
                                                              } else {
                                                                break L137;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L138: {
                                                        if (-5 > var13_int) {
                                                          break L138;
                                                        } else {
                                                          if ((var13_int ^ -1) < -6) {
                                                            break L138;
                                                          } else {
                                                            if (-32 > var12) {
                                                              break L138;
                                                            } else {
                                                              if (-33 <= (var12 ^ -1)) {
                                                                L139: {
                                                                  this.field_kb.removeElementAt(var6);
                                                                  var37_ref.a((oe) (this), (byte) 75);
                                                                  var6--;
                                                                  if (this.field_B == null) {
                                                                    break L139;
                                                                  } else {
                                                                    this.field_B.a(var37_ref, 4236);
                                                                    break L139;
                                                                  }
                                                                }
                                                                L140: {
                                                                  this.field_Ub = var37_ref.field_n;
                                                                  this.f(-118, 1);
                                                                  this.field_mb = var10;
                                                                  this.field_o = 0;
                                                                  this.field_E = var11;
                                                                  this.field_Ob = 0;
                                                                  this.field_W = false;
                                                                  if (-10 < (this.field_Ub ^ -1)) {
                                                                    var14 = qj.a((byte) -38, this.field_Ub, this.field_fc);
                                                                    this.field_J = this.field_J + var14;
                                                                    v.a(8, var14);
                                                                    this.a(this.field_Ub, (byte) -9);
                                                                    break L140;
                                                                  } else {
                                                                    this.field_e = 50;
                                                                    break L140;
                                                                  }
                                                                }
                                                                pl.field_n.a(fg.field_a, 100, qm.field_c * 6144 / 64, 8192);
                                                                break L126;
                                                              } else {
                                                                break L138;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L141: {
                                                        if (var4_ref == on.field_d) {
                                                          break L141;
                                                        } else {
                                                          if (14 < (var13_int ^ -1)) {
                                                            break L141;
                                                          } else {
                                                            if (var13_int > 15) {
                                                              break L141;
                                                            } else {
                                                              if (31 < (var12 ^ -1)) {
                                                                break L141;
                                                              } else {
                                                                if (32 >= var12) {
                                                                  if (1 == var37_ref.field_n) {
                                                                    var4_ref = ff.field_f;
                                                                    break L134;
                                                                  } else {
                                                                    if (5 != var37_ref.field_n) {
                                                                      var4_ref = nn.field_c;
                                                                      break L134;
                                                                    } else {
                                                                      var4_ref = ui.field_d;
                                                                      break L134;
                                                                    }
                                                                  }
                                                                } else {
                                                                  break L141;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (var4_ref != null) {
                                                        break L134;
                                                      } else {
                                                        if ((var13_int ^ -1) > 14) {
                                                          break L134;
                                                        } else {
                                                          if (15 < var13_int) {
                                                            break L134;
                                                          } else {
                                                            if (63 < (var12 ^ -1)) {
                                                              break L134;
                                                            } else {
                                                              if (-65 <= (var12 ^ -1)) {
                                                                var4_ref = fd.field_e;
                                                                break L134;
                                                              } else {
                                                                break L134;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var12 = var12 - this.field_n;
                                                      continue L136;
                                                    }
                                                  }
                                                } else {
                                                  var12 = var12 + this.field_n;
                                                  continue L135;
                                                }
                                              }
                                            }
                                          }
                                          var6++;
                                          continue L129;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L126;
                              }
                            }
                          }
                        }
                        if (this.field_Ub >= 0) {
                          L142: {
                            L143: {
                              if (this.field_W) {
                                break L143;
                              } else {
                                if (!this.field_Gb) {
                                  L144: {
                                    var4 = this.field_H + -this.field_mb >> -889911608;
                                    if (-this.field_n << 1721118855 > var4) {
                                      var4 = var4 + (this.field_n << -1159927224);
                                      break L144;
                                    } else {
                                      if ((this.field_n << -173172537 ^ -1) < (var4 ^ -1)) {
                                        break L144;
                                      } else {
                                        var4 = var4 - (this.field_n << 1236942472);
                                        break L144;
                                      }
                                    }
                                  }
                                  L145: {
                                    var5 = -this.field_E + this.field_p >> -758215832;
                                    var6 = this.field_mc;
                                    var7 = this.field_hc;
                                    if (-1 > (this.field_e ^ -1)) {
                                      var6 = var6 + (var4 << 1312769064) * (-this.field_e + 50) / 2500;
                                      var7 = var7 + (-this.field_e + 50) * (var5 << -1601174136) / 2500;
                                      var5 = (125 + -this.field_e) * var5 / 75;
                                      var4 = var4 * (125 + -this.field_e) / 75;
                                      break L145;
                                    } else {
                                      break L145;
                                    }
                                  }
                                  var8 = var4 * var4 - -(var5 * var5);
                                  var9_ref_Object = pl.field_n;
                                  synchronized (var9_ref_Object) {
                                    L146: {
                                      L147: {
                                        L148: {
                                          var10_double = 0.000244140625 * Math.sqrt((double)var8);
                                          var5 = (int)((double)var5 / var10_double);
                                          var4 = (int)((double)var4 / var10_double);
                                          var12 = ((var6 >> 1774682372) * var4 - -(var5 * (var7 >> 932969284))) * qm.field_c / 64 >> -1915439802;
                                          if ((this.field_e ^ -1) != -1) {
                                            break L148;
                                          } else {
                                            if ((var8 ^ -1) > -150994945) {
                                              break L148;
                                            } else {
                                              pl.field_n.a(rk.field_c, 100, var12 >> 1385672203);
                                              this.field_W = true;
                                              this.field_fb.field_l = 0;
                                              break L147;
                                            }
                                          }
                                        }
                                        this.field_fb.field_l = var12;
                                        this.field_fb.field_o = var8 / 2304;
                                        break L147;
                                      }
                                      break L146;
                                    }
                                  }
                                  break L142;
                                } else {
                                  break L143;
                                }
                              }
                            }
                            this.field_fb.field_l = 0;
                            break L142;
                          }
                          if (this.field_W) {
                            this.field_mb = this.field_mb + this.field_Ob;
                            this.field_o = this.field_o + this.field_qb;
                            this.field_E = this.field_E + this.field_o;
                            if (!this.field_Gb) {
                              stackIn_543_0 = -this.field_H;
                              stackIn_543_1 = this.field_mb;
                              break L122;
                            } else {
                              break L121;
                            }
                          } else {
                            break L120;
                          }
                        } else {
                          this.field_fb.field_l = 0;
                          break L120;
                        }
                      } else {
                        var34_ref = (sa) (this.field_kb.elementAt(var6));
                        stackIn_543_0 = -1;

                        stackIn_543_1 = var34_ref.field_n ^ -1;

                        L149: {
                          if (stackIn_543_0 != stackIn_543_1) {
                            break L149;
                          } else {
                            var34_ref.field_h = false;
                            if (this.field_Gb) {
                              break L149;
                            } else {
                              if (this.field_rb) {
                                L150: {
                                  var8 = (-var34_ref.field_k + ((this.field_H >> -973015856) + this.field_n)) % this.field_n;
                                  var9 = -var34_ref.field_g + (this.field_p >> -39610736);
                                  if ((var8 ^ -1) > -8) {
                                    break L150;
                                  } else {
                                    if (var8 >= 23) {
                                      break L150;
                                    } else {
                                      if (var9 < 50) {
                                        break L150;
                                      } else {
                                        if (-56 >= (var9 ^ -1)) {
                                          break L150;
                                        } else {
                                          if ((this.field_ac ^ -1) > -5001) {
                                            L151: {
                                              var34_ref.field_h = true;
                                              var10 = 5000 - this.field_ac;
                                              if ((var10 ^ -1) >= -14) {
                                                break L151;
                                              } else {
                                                var10 = 13;
                                                break L151;
                                              }
                                            }
                                            L152: {
                                              ji.a(true, var10);
                                              this.field_ac = this.field_ac + 13;
                                              if ((this.field_ac ^ -1) < -5001) {
                                                this.field_ac = 5000;
                                                break L152;
                                              } else {
                                                break L152;
                                              }
                                            }
                                            L153: {
                                              if (var4_ref != null) {
                                                ((hl) (var4_ref)).f(6144 * qm.field_c / 64);
                                                this.field_R.f(6144 * qm.field_c / 64);
                                                break L153;
                                              } else {
                                                this.field_R = hl.c(qa.field_E, 100, 6144 * qm.field_c / 64, 8192);
                                                pl.field_n.a(this.field_R);
                                                var36 = hl.c(lm.field_d, 100, qm.field_c * 6144 / 64, 8192);
                                                var4_ref = var36;
                                                var36.h(-1);
                                                pl.field_n.a(var36);
                                                break L153;
                                              }
                                            }
                                            this.field_f = (hl) (var4_ref);
                                            break L150;
                                          } else {
                                            L154: {
                                              if (var4_ref == null) {
                                                break L154;
                                              } else {
                                                pl.field_n.b((wg) (var4_ref));
                                                pl.field_n.b(this.field_R);
                                                var4_ref = null;
                                                this.field_R = null;
                                                break L154;
                                              }
                                            }
                                            L155: {
                                              if (var5_ref_hl != null) {
                                                break L155;
                                              } else {
                                                var35 = hl.c(fn.field_f, 100, 3584 * qm.field_c / 64, 8192);
                                                var5_ref_hl = var35;
                                                var35.h(-1);
                                                pl.field_n.a(var35);
                                                break L155;
                                              }
                                            }
                                            this.field_Eb = var5_ref_hl;
                                            break L150;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                if ((var8 ^ -1) > -4) {
                                  break L149;
                                } else {
                                  if (27 <= var8) {
                                    break L149;
                                  } else {
                                    if (48 > var9) {
                                      break L149;
                                    } else {
                                      if (-58 < (var9 ^ -1)) {
                                        var3 = 0;
                                        break L149;
                                      } else {
                                        break L149;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L149;
                              }
                            }
                          }
                        }
                        L156: {
                          if (!this.field_rc) {
                            break L156;
                          } else {
                            if (this.field_Pb != 7) {
                              break L156;
                            } else {
                              if (this.field_Gb) {
                                break L156;
                              } else {
                                if (!this.field_rb) {
                                  break L156;
                                } else {
                                  if (var34_ref.field_n != 3) {
                                    break L156;
                                  } else {
                                    var8 = this.field_H >> -1896244016;
                                    var9 = this.field_p >> -388713008;
                                    if ((var8 ^ -1) > (var34_ref.field_k + -20 ^ -1)) {
                                      break L156;
                                    } else {
                                      if (var34_ref.field_k - -40 <= var8) {
                                        break L156;
                                      } else {
                                        if (var9 < -30 + var34_ref.field_g) {
                                          break L156;
                                        } else {
                                          if (var34_ref.field_g > var9) {
                                            this.a(this.field_fc, false, 17, 238);
                                            break L156;
                                          } else {
                                            break L156;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var6++;
                        continue L119;
                      }
                    }
                    L157: {
                      var4_double = (double)(stackIn_543_0 + stackIn_543_1);
                      if ((double)(-this.field_n << 701506735) > var4_double) {
                        var4_double = var4_double + (double)(this.field_n << 1568001584);
                        break L157;
                      } else {
                        if ((double)(this.field_n << -1580062545) > var4_double) {
                          break L157;
                        } else {
                          var4_double = var4_double - (double)(this.field_n << 443250288);
                          break L157;
                        }
                      }
                    }
                    L158: {
                      var6_double = (double)(this.field_E - this.field_p);
                      var8_double = Math.sqrt(var6_double * var6_double + var4_double * var4_double);
                      var4_double = var4_double / var8_double;
                      var10_double = var8_double - 3145728.0;
                      var6_double = var6_double / var8_double;
                      var12 = (int)(var4_double * var10_double);
                      var13_int = (int)(var10_double * var6_double);
                      if (!this.field_rb) {
                        this.field_p = this.field_p + (var13_int >> 327409730);
                        this.field_E = this.field_E - (var13_int + -(var13_int >> 1642247266));
                        this.field_H = this.field_H + (var12 >> 1482532514);
                        this.field_mb = this.field_mb - (-(var12 >> -1531429566) + var12);
                        this.field_H = ((this.field_n << -823490448) + this.field_H) % (this.field_n << 378123344);
                        this.field_M = this.field_M + (var12 >> -1129728734);
                        break L158;
                      } else {
                        this.field_mb = this.field_mb - var12;
                        this.field_E = this.field_E - var13_int;
                        break L158;
                      }
                    }
                    var14_double = (double)(this.field_o - this.field_hc) * var6_double + (double)(this.field_Ob + -this.field_mc) * var4_double;
                    var16 = (int)(var14_double * var4_double);
                    var17_int = (int)(var6_double * var14_double);
                    if (this.field_rb) {
                      this.field_o = this.field_o - var17_int;
                      this.field_Ob = this.field_Ob - var16;
                      break L121;
                    } else {
                      this.field_mc = this.field_mc + (var16 >> -1975925086);
                      this.field_hc = this.field_hc + (var17_int >> -690033982);
                      this.field_Ob = this.field_Ob - (-(var16 >> -953387646) + var16);
                      this.field_o = this.field_o - (-(var17_int >> -642903006) + var17_int);
                      break L121;
                    }
                  }
                  this.field_mb = (this.field_mb - -(this.field_n << 226068144)) % (this.field_n << -372871600);
                  this.field_o = this.field_o - this.field_o / 256;
                  this.field_Ob = this.field_Ob - this.field_Ob / 256;
                  var39 = mb.field_f[this.field_Ub];
                  var5 = (-(var39.field_A << -1637800401) + this.field_mb >> -143010704) + this.field_n;
                  var6 = this.field_E - (var39.field_z << -1025441009) >> 1031914992;
                  if (this.b(var5, var39, var6, -1)) {
                    this.k((byte) 9);
                    break L120;
                  } else {
                    break L120;
                  }
                }
                var4 = 0;
                var5_ref_hg = this.field_G.a(false);
                var6 = 0;
                L159: while (true) {
                  L160: {
                    if (var6 >= this.field_x) {
                      L161: {
                        if (var4 == 0) {
                          break L161;
                        } else {
                          this.F(127);
                          break L161;
                        }
                      }
                      var4 = this.field_qc * qm.field_c / 32;
                      stackIn_608_0 = var4;
                      stackIn_608_1 = 8192;
                      break L160;
                    } else {
                      var40_ref = (vh) ((Object) var5_ref_hg);
                      fieldTemp$0 = var40_ref.field_m - 1;
                      var40_ref.field_m = var40_ref.field_m - 1;
                      stackIn_608_0 = fieldTemp$0 ^ -1;

                      stackIn_608_1 = -1;

                      L162: {
                        if (stackIn_608_0 == stackIn_608_1) {
                          var4 = 1;
                          var40_ref.field_h = true;
                          break L162;
                        } else {
                          L163: {
                            L164: {
                              var8 = (var40_ref.field_j + var40_ref.field_n - -(this.field_n << 1957767472)) % (this.field_n << -1425211376);
                              var9 = var40_ref.field_g + var40_ref.field_l;
                              var40_ref.field_j = var8;
                              var40_ref.field_l = var9;
                              var8 = var8 >> 16;
                              var9 = var9 >> 16;
                              if ((var40_ref.field_k ^ -1) == -1) {
                                var41 = s.field_H;
                                var11_ref_ic = (ic) ((Object) this.field_N.a(false));
                                L165: while (true) {
                                  if (var11_ref_ic == null) {
                                    break L164;
                                  } else {
                                    var12 = var41.field_v + ((var11_ref_ic.field_q >> 241941168) - 8);
                                    stackIn_581_0 = var12 ^ -1;

                                    stackIn_581_1 = var9 ^ -1;

                                    L166: {
                                      if (stackIn_581_0 < stackIn_581_1) {
                                        break L166;
                                      } else {
                                        if ((var41.field_x + var12 ^ -1) >= (var9 ^ -1)) {
                                          break L166;
                                        } else {
                                          var13_int = var8 + (-(var11_ref_ic.field_p >> 658169488) + (8 - var41.field_q));
                                          L167: while (true) {
                                            if ((var13_int ^ -1) <= -1) {
                                              var13_int = var13_int % this.field_n;
                                              if (var41.field_s <= var13_int) {
                                                break L166;
                                              } else {
                                                if (-1 != (var41.field_B[(var9 + -var12) * var41.field_s + var13_int] ^ -1)) {
                                                  L168: {
                                                    if (!this.field_Gb) {
                                                      var14 = hc.a(this.field_fc, (byte) 112);
                                                      this.field_J = this.field_J + var14;
                                                      v.a(8, var14);
                                                      break L168;
                                                    } else {
                                                      break L168;
                                                    }
                                                  }
                                                  this.a(var11_ref_ic, 5);
                                                  var40_ref.field_h = true;
                                                  var4 = 1;
                                                  break L162;
                                                } else {
                                                  break L166;
                                                }
                                              }
                                            } else {
                                              var13_int = var13_int + this.field_n;
                                              continue L167;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var11_ref_ic = (ic) ((Object) this.field_N.b((byte) 70));
                                    continue L165;
                                  }
                                }
                              } else {
                                break L164;
                              }
                            }
                            stackIn_581_0 = var8;
                            stackIn_581_1 = 31;
                            break L163;
                          }
                          L169: {
                            var10 = stackIn_581_0 & stackIn_581_1;
                            var8 = var8 >> 5;
                            var11 = var9 & 31;
                            var9 = var9 >> 5;
                            if (0 <= var9) {
                              L170: {
                                if ((this.field_D ^ -1) >= (var9 ^ -1)) {
                                  stackIn_586_0 = si.field_v;
                                  break L170;
                                } else {
                                  stackIn_586_0 = this.field_V[var9 * this.field_Mb - -var8];
                                  break L170;
                                }
                              }
                              var46 = stackIn_586_0;
                              var42 = var46;
                              var12_ref_int__ = var42;
                              if (var12_ref_int__ == null) {
                                break L169;
                              } else {
                                L171: {
                                  if (var12_ref_int__ == si.field_v) {
                                    break L171;
                                  } else {
                                    if ((var46[var11] & 1 << var10 ^ -1) == -1) {
                                      break L169;
                                    } else {
                                      break L171;
                                    }
                                  }
                                }
                                L172: {
                                  if (0 == var40_ref.field_k) {
                                    this.j(-90, var11 | var9 << -218969339, var10 | var8 << 853528005);
                                    break L172;
                                  } else {
                                    break L172;
                                  }
                                }
                                var4 = 1;
                                var40_ref.field_h = true;
                                break L162;
                              }
                            } else {
                              break L169;
                            }
                          }
                          if ((var40_ref.field_k ^ -1) != -2) {
                            break L162;
                          } else {
                            if (!this.field_Gb) {
                              L173: {
                                L174: {
                                  if (!this.field_Bb) {
                                    break L174;
                                  } else {
                                    if (this.d(var8 << 265359141 | var10, 32, var9 << 406496869 | var11)) {
                                      break L173;
                                    } else {
                                      break L174;
                                    }
                                  }
                                }
                                if (this.a((byte) 105, var9 << -1937998427 | var11, var8 << -651994555 | var10)) {
                                  break L173;
                                } else {
                                  if (this.k(-2, var10 | var8 << -873242427, var9 << 1182993765 | var11)) {
                                    break L173;
                                  } else {
                                    break L162;
                                  }
                                }
                              }
                              var4 = 1;
                              var40_ref.field_h = true;
                              break L162;
                            } else {
                              break L162;
                            }
                          }
                        }
                      }
                      var5_ref_hg = var5_ref_hg.field_b;
                      var6++;
                      continue L159;
                    }
                  }
                  var5 = stackIn_608_0 * stackIn_608_1;
                  var6_ref_pi = (pi) ((Object) this.field_hb.a(false));
                  L175: while (true) {
                    L176: {
                      L177: {
                        if (var6_ref_pi == null) {
                          if (this.field_Gb) {
                            break L176;
                          } else {
                            stackIn_675_0 = -1;
                            stackIn_675_1 = this.field_m ^ -1;
                            break L177;
                          }
                        } else {
                          var7 = 0;
                          L178: while (true) {
                            L179: {
                              if (var7 >= 32) {
                                var6_ref_pi.field_i.a();
                                stackIn_618_0 = -1;
                                break L179;
                              } else {
                                stackOut_612_0 = var6_ref_pi.field_i.field_E[var7 + var6_ref_pi.field_q];
                                stackIn_618_0 = stackOut_612_0 ? 1 : 0;
                                stackIn_613_0 = stackOut_612_0;
                                L180: {
                                  if (stackIn_613_0) {
                                    var6_ref_pi.field_l = var6_ref_pi.field_l - 1;
                                    var6_ref_pi.field_i.field_E[var6_ref_pi.field_q + var7] = false;
                                    break L180;
                                  } else {
                                    break L180;
                                  }
                                }
                                var7++;
                                continue L178;
                              }
                            }
                            L181: {
                              if (stackIn_618_0 > (var6_ref_pi.field_r ^ -1)) {
                                var7_double = 0.02454369260617026 * (double)var6_ref_pi.field_m;
                                var6_ref_pi.field_k = var6_ref_pi.field_k + (int)(2000.0 * Math.sin(var7_double));
                                var6_ref_pi.field_p = var6_ref_pi.field_p - (int)(2000.0 * Math.cos(var7_double));
                                var9 = 0;
                                L182: while (true) {
                                  if (32 <= var9) {
                                    var6_ref_pi.field_l = var6_ref_pi.field_l + 32;
                                    break L181;
                                  } else {
                                    var6_ref_pi.field_i.field_E[var9 + var6_ref_pi.field_q] = true;
                                    var10_double = Math.random() * 0.2 + var7_double - 0.1;
                                    var12_double = (0.5 + Math.random()) * 524288.0;
                                    var14 = -(int)(Math.sin(var10_double) * var12_double);
                                    var15_int = (int)(var12_double * Math.cos(var10_double));
                                    var6_ref_pi.field_i.field_x[var9 + var6_ref_pi.field_q] = var6_ref_pi.field_n + var6_ref_pi.field_k;
                                    var6_ref_pi.field_i.field_A[var9 + var6_ref_pi.field_q] = var6_ref_pi.field_g - -var6_ref_pi.field_p;
                                    var16_double = Math.random();
                                    var6_ref_pi.field_i.field_y[var6_ref_pi.field_q - -var9] = (int)(var16_double * (double)var14);
                                    var6_ref_pi.field_i.field_C[var6_ref_pi.field_q - -var9] = (int)(var16_double * (double)var15_int);
                                    var6_ref_pi.field_i.field_w[var9 + var6_ref_pi.field_q] = 0;
                                    var6_ref_pi.field_i.i(var9 + var6_ref_pi.field_q);
                                    var6_ref_pi.field_i.field_y[var6_ref_pi.field_q - -var9] = var6_ref_pi.field_k - -var14;
                                    var6_ref_pi.field_i.field_C[var6_ref_pi.field_q - -var9] = var15_int + var6_ref_pi.field_p;
                                    var9++;
                                    continue L182;
                                  }
                                }
                              } else {
                                break L181;
                              }
                            }
                            L183: {
                              var7 = var6_ref_pi.field_l * this.b(2097152, var6_ref_pi.field_n, 96, var6_ref_pi.field_g) / 1024;
                              var4 = var4 + var7;
                              var5 = var5 + var7 * this.c(var6_ref_pi.field_n, 124);
                              var6_ref_pi.field_q = (32 + var6_ref_pi.field_q) % 256;
                              if (0 != var6_ref_pi.field_r) {
                                fieldTemp$1 = var6_ref_pi.field_r - 1;
                                var6_ref_pi.field_r = var6_ref_pi.field_r - 1;
                                if (-1 == (fieldTemp$1 ^ -1)) {
                                  this.a(var6_ref_pi, 49);
                                  break L183;
                                } else {
                                  mf.field_a.field_v = 0;
                                  var8_ref_ed = mf.field_a;
                                  var8_ref_ed.field_q = 0;
                                  var9_ref_ed = mf.field_a;
                                  var10_ref_ed = mf.field_a;
                                  mf.field_a.field_x = 7;
                                  var11_ref_ed = mf.field_a;
                                  var9_ref_ed.field_A = 7;
                                  var11_ref_ed.field_s = 7;
                                  var10_ref_ed.field_z = 7;
                                  mf.field_a.g();
                                  em.d();
                                  mf.field_m.a(4, (byte) 34, 4096, -var6_ref_pi.field_m << 980086184, 4);
                                  md.field_D.a(120);
                                  var12 = (int)Math.sqrt((double)var6_ref_pi.field_p * (double)var6_ref_pi.field_p + (double)var6_ref_pi.field_k * (double)var6_ref_pi.field_k);
                                  var13_int = var12 / 196608 + 1;
                                  var14 = var6_ref_pi.field_k;
                                  var15_int = var6_ref_pi.field_p;
                                  var16 = var13_int;
                                  L184: while (true) {
                                    if (0 >= var16) {
                                      L185: {
                                        if (!var6_ref_pi.field_h) {
                                          break L185;
                                        } else {
                                          var6_ref_pi.field_h = false;
                                          pl.field_n.a(var6_ref_pi.field_o);
                                          break L185;
                                        }
                                      }
                                      var6_ref_pi.field_o.f(this.b(2097152, var6_ref_pi.field_n, 96, var6_ref_pi.field_g), this.c(var6_ref_pi.field_n, 125));
                                      break L183;
                                    } else {
                                      var17_int = var14 / var16;
                                      var18 = var15_int / var16;
                                      var19 = ((this.field_n << -1221322160) + var6_ref_pi.field_n + var17_int) % (this.field_n << 1342642800);
                                      var6_ref_pi.field_n = var19;
                                      var20 = var18 + var6_ref_pi.field_g;
                                      var14 = var14 - var17_int;
                                      var19 = var19 >> 16;
                                      var15_int = var15_int - var18;
                                      var6_ref_pi.field_g = var20;
                                      var19 -= 4;
                                      var20 = var20 >> 16;
                                      var20 -= 4;
                                      var21_ref_ic = (ic) ((Object) this.field_N.a(false));
                                      L186: while (true) {
                                        if (var21_ref_ic == null) {
                                          if (this.b(this.field_n + var19, mf.field_a, var20, -1)) {
                                            var21 = 0;
                                            L187: while (true) {
                                              stackIn_650_0 = this.field_kb.size();
                                              stackIn_650_1 = var21;
                                              L188: while (true) {
                                                if (stackIn_650_0 <= stackIn_650_1) {
                                                  this.a(var6_ref_pi, 78);
                                                  var6_ref_pi.field_r = 0;
                                                  break L183;
                                                } else {
                                                  var22_ref = (sa) (this.field_kb.elementAt(var21));
                                                  var23 = var22_ref.field_i;
                                                  var24 = -var19 + var22_ref.field_k;
                                                  L189: while (true) {
                                                    if (this.field_n >> 1014857569 >= var24) {
                                                      L190: while (true) {
                                                        if ((-this.field_n >> -1917178591 ^ -1) >= (var24 ^ -1)) {
                                                          L191: {
                                                            var25 = var22_ref.field_g + -var20;
                                                            if (!ln.a(mf.field_a, 0, 0, var23, var24, var25)) {
                                                              break L191;
                                                            } else {
                                                              L192: {
                                                                this.a(var22_ref, 67, var21);
                                                                if (-7 == (var22_ref.field_n ^ -1)) {
                                                                  break L192;
                                                                } else {
                                                                  if ((var22_ref.field_n ^ -1) == -8) {
                                                                    break L192;
                                                                  } else {
                                                                    break L191;
                                                                  }
                                                                }
                                                              }
                                                              var26 = var22_ref.field_g - -14;
                                                              var27 = this.field_C.a(false);
                                                              var28 = 0;
                                                              L193: while (true) {
                                                                if (this.field_ub <= var28) {
                                                                  break L191;
                                                                } else {
                                                                  var29_ref = (am) ((Object) var27);
                                                                  stackIn_650_0 = var29_ref.field_j;

                                                                  stackIn_650_1 = var26;

                                                                  if (stackIn_650_0 != stackIn_650_1) {
                                                                    var28++;
                                                                    var27 = var27.field_b;
                                                                    continue L193;
                                                                  } else {
                                                                    this.a(var29_ref, (byte) 27);
                                                                    break L191;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var21++;
                                                          continue L187;
                                                        } else {
                                                          var24 = var24 + this.field_n;
                                                          continue L190;
                                                        }
                                                      }
                                                    } else {
                                                      var24 = var24 - this.field_n;
                                                      continue L189;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var16--;
                                            continue L184;
                                          }
                                        } else {
                                          var22_int = -(var21_ref_ic.field_p >> 1941825968) + var19 + 8;
                                          stackIn_675_0 = -(this.field_n >> 28189441);

                                          stackIn_675_1 = var22_int;

                                          L194: {
                                            if (stackIn_675_0 <= stackIn_675_1) {
                                              if ((this.field_n >> -1358558463 ^ -1) > (var22_int ^ -1)) {
                                                var22_int = var22_int - this.field_n;
                                                break L194;
                                              } else {
                                                break L194;
                                              }
                                            } else {
                                              var22_int = var22_int + this.field_n;
                                              break L194;
                                            }
                                          }
                                          var23_int = var20 + (-(var21_ref_ic.field_q >> 1540090832) - -8);
                                          if (!ln.a(s.field_H, 0, 0, mf.field_a, var22_int, var23_int)) {
                                            var21_ref_ic = (ic) ((Object) this.field_N.b((byte) 70));
                                            continue L186;
                                          } else {
                                            L195: {
                                              if (this.field_Gb) {
                                                break L195;
                                              } else {
                                                var24 = hc.a(this.field_fc, (byte) 105);
                                                this.field_J = this.field_J + var24;
                                                v.a(8, var24);
                                                break L195;
                                              }
                                            }
                                            this.a(var21_ref_ic, 5);
                                            this.a(var6_ref_pi, 82);
                                            var6_ref_pi.field_r = 0;
                                            break L183;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (var6_ref_pi.field_l == 0) {
                                  var6_ref_pi.c((byte) -52);
                                  break L183;
                                } else {
                                  var6_ref_pi = (pi) ((Object) this.field_hb.b((byte) 70));
                                  continue L175;
                                }
                              }
                            }
                            var6_ref_pi = (pi) ((Object) this.field_hb.b((byte) 70));
                            continue L175;
                          }
                        }
                      }
                      L196: {
                        if (stackIn_675_0 > stackIn_675_1) {
                          this.field_m = this.field_m - 1;
                          break L196;
                        } else {
                          if (ik.field_p) {
                            break L196;
                          } else {
                            if (!ik.field_h[82]) {
                              break L196;
                            } else {
                              L197: {
                                var6_double = (double)this.field_I * 0.02454369260617026;
                                var8 = (int)(Math.sin(var6_double) * 131072.0);
                                var9 = -(int)(Math.cos(var6_double) * 131072.0);
                                this.b(this.field_p + 5 * var9, this.field_H - -(5 * var8), this.field_hc + var9, 256, 0, var8 + this.field_mc);
                                if (!this.field_lb) {
                                  pl.field_n.a(ni.field_M, 100, qm.field_c * 6144 / 64, 8192);
                                  break L197;
                                } else {
                                  this.b(this.field_p - -(var9 * 5), this.field_H + var8 * 5, (var8 >> 1943108803) + -(var9 >> -57061405) + (this.field_hc + var9), 256, 0, this.field_mc + (var8 - ((var8 >> 1772032739) + (var9 >> 236999907))));
                                  this.b(this.field_p - -(var9 * 5), 5 * var8 + this.field_H, -(var8 >> -481961245) + -(var9 >> -1927298365) + (var9 + this.field_hc), 256, 0, (var9 >> 1530121411) + this.field_mc + (var8 + -(var8 >> -1053259997)));
                                  pl.field_n.a(gn.field_e, 100, 6144 * qm.field_c / 64, 8192);
                                  break L197;
                                }
                              }
                              this.field_m = 9;
                              break L196;
                            }
                          }
                        }
                      }
                      if (0 >= this.field_yb) {
                        if (this.field_tb <= 0) {
                          break L176;
                        } else {
                          if (!this.d((byte) 61)) {
                            break L176;
                          } else {
                            var6_double = 0.02454369260617026 * (double)this.field_I;
                            var8 = (int)(131072.0 * Math.sin(var6_double));
                            var9 = -(int)(Math.cos(var6_double) * 131072.0);
                            var43 = new pi();
                            var43.field_p = this.field_hc + var9;
                            var43.field_n = (this.field_H + (5 * var8 - -(this.field_n << 1736695120))) % (this.field_n << 1984592112);
                            var43.field_r = 100;
                            var43.field_m = this.field_I;
                            var43.field_k = this.field_mc + var8;
                            var43.field_g = this.field_p + 5 * var9;
                            var43.field_i = this.i(256, -22944);
                            var43.field_o = hl.c(kf.field_p, 100, this.b(2097152, var43.field_n, 96, var43.field_g), this.c(var43.field_n, 116));
                            pl.field_n.a(var43.field_o);
                            this.field_hb.a(-12328, var43);
                            this.field_tb = this.field_tb - 1;
                            fk.b(0);
                            this.field_yb = 24;
                            break L176;
                          }
                        }
                      } else {
                        this.field_yb = this.field_yb - 1;
                        break L176;
                      }
                    }
                    var6 = 0;
                    L198: while (true) {
                      L199: {
                        if ((var6 ^ -1) <= (this.field_kb.size() ^ -1)) {
                          L200: {
                            this.B((byte) 109);
                            if (null != this.field_Db) {
                              this.field_Db.c(-1);
                              break L200;
                            } else {
                              break L200;
                            }
                          }
                          this.w(0);
                          stackIn_713_0 = param0;
                          stackIn_713_1 = -7;
                          break L199;
                        } else {
                          var44_ref = (sa) (this.field_kb.elementAt(var6));
                          stackIn_713_0 = var44_ref.field_n;

                          stackIn_713_1 = 2;

                          L201: {
                            if (stackIn_713_0 != stackIn_713_1) {
                              break L201;
                            } else {
                              if ((var44_ref.field_o ^ -1) < -1) {
                                var44_ref.field_o = var44_ref.field_o - 1;
                                break L201;
                              } else {
                                if (!this.field_Gb) {
                                  var45 = rf.a(var44_ref.field_l, 16384);
                                  if (var45 != null) {
                                    L202: {
                                      var9 = var44_ref.field_k - -var45.field_c << -140978416;
                                      var10 = var45.field_b + var44_ref.field_g << 2065882160;
                                      var11 = this.field_H - var9;
                                      var12 = this.field_p + -var10;
                                      if ((var11 ^ -1) <= (-this.field_n << -259926321 ^ -1)) {
                                        if ((var11 ^ -1) <= (this.field_n << -2121753329 ^ -1)) {
                                          var11 = var11 - (this.field_n << -693682640);
                                          break L202;
                                        } else {
                                          break L202;
                                        }
                                      } else {
                                        var11 = var11 + (this.field_n << -790048944);
                                        break L202;
                                      }
                                    }
                                    L203: {
                                      var13 = (double)var11;
                                      var15 = (double)var12;
                                      var17 = Math.sqrt(var15 * var15 + var13 * var13);
                                      if (13107200.0 <= var17) {
                                        break L203;
                                      } else {
                                        var13 = var13 / var17;
                                        var15 = var15 / var17;
                                        var11 = (int)(131072.0 * var13);
                                        var12 = (int)(var15 * 131072.0);
                                        if (this.a((int)var17 >> 1395798865, var12, 5 * var12 + var10, 5 * var11 + var9, var11, 0)) {
                                          this.b(var10 + 5 * var12, var11 * 5 + var9, var12, 256, 1, var11);
                                          var44_ref.field_o = 49;
                                          pl.field_n.a(uk.field_j, 100, this.b(6553600, var9, 96, var10), this.c(var9, 120));
                                          break L203;
                                        } else {
                                          break L201;
                                        }
                                      }
                                    }
                                    break L201;
                                  } else {
                                    break L201;
                                  }
                                } else {
                                  break L201;
                                }
                              }
                            }
                          }
                          var6++;
                          continue L198;
                        }
                      }
                      if (stackIn_713_0 <= stackIn_713_1) {
                        L204: {
                          stackIn_717_0 = this.field_Z;

                          stackIn_717_1 = var4;

                          if (-1 == (var4 ^ -1)) {
                            stackIn_718_0 = (hl) ((Object) stackIn_717_0);
                            stackIn_718_1 = stackIn_717_1;
                            stackIn_718_2 = 8192;
                            break L204;
                          } else {
                            stackIn_718_0 = (hl) ((Object) stackIn_717_0);
                            stackIn_718_1 = stackIn_717_1;
                            stackIn_718_2 = var5 / var4;
                            break L204;
                          }
                        }
                        L205: {
                          ((hl) (Object) stackIn_718_0).f(stackIn_718_1, stackIn_718_2);
                          this.field_Sb = (64 + this.field_Sb) % 512;
                          if (!this.field_rc) {
                            break L205;
                          } else {
                            if (this.field_Pb >= 0) {
                              this.f(false);
                              break L205;
                            } else {
                              break L205;
                            }
                          }
                        }
                        L206: {
                          this.p((byte) 9);
                          if (!ik.field_h[82]) {
                            ik.field_p = false;
                            break L206;
                          } else {
                            break L206;
                          }
                        }
                        L207: {
                          if (ik.field_h[84]) {
                            break L207;
                          } else {
                            s.field_E = false;
                            break L207;
                          }
                        }
                        L208: {
                          if (ik.field_h[83]) {
                            break L208;
                          } else {
                            bc.field_d = false;
                            break L208;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int statePc = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        hg var16 = null;
        int var17 = 0;
        Object var18 = null;
        am var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = EscapeVector.field_A;
                    if (param6 > 115) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var20 = this.a(param4, -1, param0);
                    var22 = var20;
                    var21 = var22;
                    var10 = var21;
                    if (var20 != null) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (0 == vh.field_i) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    param0 = param0 << 16;
                    param4 = param4 << 16;
                    var11 = param1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = param8 ^ -1;
                    stackIn_8_1 = var11 ^ -1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 > stackIn_8_1) {
                        statePc = 29;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var12 = param7;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = var12 ^ -1;
                    stackIn_11_1 = param2 ^ -1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 < stackIn_11_1) {
                        statePc = 28;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var13 = param0 + (var12 << -1358461589) + -param3;
                    var14 = -param5 + (var11 << 223701579) + param4;
                    var15 = var13 * var13 + var14 * var14;
                    stackIn_8_0 = var15;
                    stackIn_13_0 = stackIn_8_0;
                    stackIn_8_1 = 603979776;
                    stackIn_13_1 = stackIn_8_1;
                    if (false) {
                        statePc = 8;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (stackIn_13_0 < stackIn_13_1) {
                        statePc = 15;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var10 == null) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (!this.a(var22, var12, (byte) -74, var11)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_Hb = this.field_Hb + var13;
                    this.field_pb = this.field_pb + var14;
                    statePc = 27;
                    continue stateLoop;
                }
                case 18: {
                    var16 = cn.field_f.a(false);
                    var17 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if ((vh.field_i ^ -1) >= (var17 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var18_ref = (am) ((Object) var16);
                    stackIn_11_0 = var18_ref.field_j ^ -1;
                    stackIn_21_0 = stackIn_11_0;
                    stackIn_11_1 = var14 ^ -1;
                    stackIn_21_1 = stackIn_11_1;
                    if (false) {
                        statePc = 11;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0 == stackIn_21_1) {
                        statePc = 23;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((var18_ref.field_i ^ -1) < (var13 ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var18_ref.field_h <= var13) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_Hb = this.field_Hb + var13;
                    this.field_pb = this.field_pb + var14;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    var16 = var16.field_b;
                    var17++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 27: {
                    var12++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 28: {
                    var11++;
                    statePc = 7;
                    continue stateLoop;
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void q(int param0) {
        int stackIn_16_0 = 0;
        int stackIn_44_0 = 0;
        ih stackIn_47_0;
        String stackIn_47_1;
        int stackIn_47_2;
        int stackIn_47_3;
        ih stackIn_48_0 = null;
        String stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11_int;
        String var11;
        int var12;
        ih var13;
        L0: {
          var13 = fh.field_g;
          var3 = var13.b(di.field_b);
          var4 = var13.b(k.field_p);
          if (var4 > var3) {
            var3 = var4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var5 = var13.b("0000");
          var6 = 40;
          var7 = 18;
          if (0 < this.field_tb) {
            var4 = var13.b(af.field_f);
            var6 = var6 + var7;
            if (var3 < var4) {
              var3 = var4;
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (-2 == (this.field_Q ^ -1)) {
            var6 = var6 + var7;
            var4 = var13.b(hg.field_f);
            if (var3 < var4) {
              var3 = var4;
              break L2;
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          var8 = 0;
          if (var8 >= 20) {
            stackIn_16_0 = 0;
            break L3;
          } else {
            stackIn_16_0 = (-var8 + 20) * 160 / 20;
            break L3;
          }
        }
        L4: {
          var9 = stackIn_16_0;
          if (param0 == 3) {
            break L4;
          } else {
            this.field_tb = 30;
            break L4;
          }
        }
        L5: {
          eh.a(var9, -4, -4, 6320248, -2, var6 - -6, param0 ^ -2, var5 + var3 + 6 + 10, 12110032, 3160124, 2 * var8);
          var10 = 22;
          var13.b(di.field_b, var3 + 6, var10, 10004656, -1);
          var13.a(Integer.toString(this.field_ac), 6 + var3, var10, 16777215, -1);
          var10 = var10 + var7;
          var13.b(k.field_p, var3 + 6, var10, 10004656, -1);
          var13.a(Integer.toString(this.field_Tb + this.field_Tb), 6 - -var3, var10, 16777215, -1);
          var10 = var10 + var7;
          if (this.field_tb > 0) {
            var13.b(af.field_f, var3 + 6, var10, 10004656, -1);
            var13.a(Integer.toString(this.field_tb), 6 - -var3, var10, 16777215, -1);
            var10 = var10 + var7;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if ((this.field_Q ^ -1) != -2) {
            break L6;
          } else {
            L7: {
              var11_int = 0;
              if (this.field_k != null) {
                var11_int = this.field_k.c((byte) 49);
                break L7;
              } else {
                break L7;
              }
            }
            var13.b(hg.field_f, 6 + var3, var10, 10004656, -1);
            var13.a(Integer.toString(var11_int), var3 + 6, var10, 16777215, -1);
            var10 = var10 + var7;
            break L6;
          }
        }
        L8: {
          var3 = var13.b(jf.field_K);
          var4 = var13.b(vd.field_c);
          var5 = var13.b(Integer.toString(this.field_Pb - -1));
          if (var3 >= var4) {
            break L8;
          } else {
            var3 = var4;
            break L8;
          }
        }
        L9: {
          var4 = var13.b(Integer.toString(this.field_A));
          if ((var5 ^ -1) <= (var4 ^ -1)) {
            break L9;
          } else {
            var5 = var4;
            break L9;
          }
        }
        L10: {
          var6 = 40;
          var11 = this.g(true);
          var6 += 18;
          var4 = var13.b(uk.field_a);
          if (var4 <= var3) {
            break L10;
          } else {
            var3 = var4;
            break L10;
          }
        }
        L11: {
          var4 = var13.b(Integer.toString(this.field_J + this.field_ob));
          if (var5 >= var4) {
            break L11;
          } else {
            var5 = var4;
            break L11;
          }
        }
        L12: {
          L13: {
            if (nf.field_r) {
              break L13;
            } else {
              if (this.field_a) {
                break L13;
              } else {
                break L12;
              }
            }
          }
          L14: {
            var6 += 18;
            var4 = var13.b(hn.field_f);
            if (var3 >= var4) {
              break L14;
            } else {
              var3 = var4;
              break L14;
            }
          }
          var4 = var13.b(var11);
          if ((var5 ^ -1) <= (var4 ^ -1)) {
            break L12;
          } else {
            var5 = var4;
            break L12;
          }
        }
        L15: {
          var8 = 0;
          if (20 > var8) {
            stackIn_44_0 = (3200 - var8 * 160) / 20;
            break L15;
          } else {
            stackIn_44_0 = 0;
            break L15;
          }
        }
        L16: {
          L17: {
            var9 = stackIn_44_0;
            eh.a(var9, 634 + -var5 + -var3 - 10, -4, 6320248, -2, var6 + 6, -3, 644, 12110032, 3160124, var8 * 2);
            var13.b(jf.field_K, -var5 + 634, 22, 10004656, -1);
            var13.a(Integer.toString(this.field_Pb - -1), -var5 + 634, 22, 16777215, -1);
            var13.b(vd.field_c, -var5 + 634, 40, 10004656, -1);
            var13.a(Integer.toString(this.field_A), -var5 + 634, 40, 16777215, -1);
            var13.b(uk.field_a, -var5 + 634, 58, 10004656, -1);
            stackIn_47_0 = (ih) (var13);

            stackIn_47_1 = Integer.toString(this.field_ob + this.field_J);

            stackIn_47_2 = -var5 + 634;

            stackIn_47_3 = 58;

            if (this.field_gb) {
              break L17;
            } else {
              stackIn_47_0 = (ih) ((Object) stackIn_47_0);

              stackIn_47_1 = (String) ((Object) stackIn_47_1);

              if (this.field_rc) {
                break L17;
              } else {
                stackIn_48_0 = (ih) ((Object) stackIn_47_0);
                stackIn_48_1 = (String) ((Object) stackIn_47_1);
                stackIn_48_2 = stackIn_47_2;
                stackIn_48_3 = stackIn_47_3;
                stackIn_48_4 = 4227327;
                break L16;
              }
            }
          }
          stackIn_48_0 = (ih) ((Object) stackIn_47_0);
          stackIn_48_1 = (String) ((Object) stackIn_47_1);
          stackIn_48_2 = stackIn_47_2;
          stackIn_48_3 = stackIn_47_3;
          stackIn_48_4 = 16777215;
          break L16;
        }
        L18: {
          L19: {
            ((ih) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2, stackIn_48_3, stackIn_48_4, -1);
            if (nf.field_r) {
              break L19;
            } else {
              if (this.field_a) {
                break L19;
              } else {
                break L18;
              }
            }
          }
          var12 = this.a((byte) 114, 50, 16777215, 16711680);
          var13.b(hn.field_f, -var5 + 634, 76, 10004656, -1);
          var13.a(var11, -var5 + 634, 76, var12, -1);
          break L18;
        }
    }

    private final void a(byte param0, int param1) {
        if (param0 != 84) {
            this.field_oc = 82;
        }
        if (1 == param1) {
        }
        if (0 != param1) {
        }
    }

    private final void j(byte param0) {
        this.a(24661, true);
        if (-1 >= (this.field_Pb ^ -1)) {
            this.k(param0 + -17);
        } else {
            this.i((byte) -120);
        }
        this.a(true, 19);
        if (param0 != -110) {
            this.m(110);
        }
    }

    private final boolean d(byte param0) {
        int var2 = -2 / ((param0 - -28) / 60);
        if (!s.field_E) {
            if (!(!ik.field_h[84])) {
                return true;
            }
        }
        if (ik.field_h[jl.field_a]) {
            return true;
        }
        if (ik.field_h[86]) {
            return true;
        }
        return false;
    }

    final void s(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        pi var3 = null;
        ic var3_ref = null;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        this.a(param0 + 45, this.field_jb);
        if (param0 == -41) {
          L0: {
            this.a(4, this.field_Z);
            this.a(4, this.field_v);
            this.a(4, this.field_R);
            this.a(4, this.field_f);
            if (null == this.field_Eb) {
              break L0;
            } else {
              this.field_Eb.h(0);
              this.field_Eb = null;
              break L0;
            }
          }
          L1: {
            this.a(4, this.field_Wb);
            this.a(4, this.field_wb);
            if (this.field_r != null) {
              this.field_r.c(ie.field_q / 100, 0);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (this.field_lc != null) {
              this.a(param0 ^ -45, this.field_lc);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null == this.field_fb) {
              break L3;
            } else {
              this.field_fb.field_l = 0;
              break L3;
            }
          }
          L4: {
            if (null != this.field_hb) {
              var2 = pl.field_n;
              synchronized (var2) {
                L5: {
                  var3 = (pi) ((Object) this.field_hb.a(false));
                  L6: while (true) {
                    if (var3 == null) {
                      var3_ref = (ic) ((Object) this.field_N.a(false));
                      L7: while (true) {
                        if (var3_ref == null) {
                          break L5;
                        } else {
                          L8: {
                            if (null == var3_ref.field_g) {
                              break L8;
                            } else {
                              pl.field_n.b(var3_ref.field_g);
                              pl.field_n.b(var3_ref.field_m);
                              var3_ref.field_g = null;
                              var3_ref.field_m = null;
                              break L8;
                            }
                          }
                          var3_ref = (ic) ((Object) this.field_N.b((byte) 70));
                          continue L7;
                        }
                      }
                    } else {
                      L9: {
                        if ((var3.field_r ^ -1) == -1) {
                          break L9;
                        } else {
                          if (!var3.field_o.b((byte) 48)) {
                            break L9;
                          } else {
                            pl.field_n.b(var3.field_o);
                            var3.field_h = true;
                            break L9;
                          }
                        }
                      }
                      var3 = (pi) ((Object) this.field_hb.b((byte) 70));
                      continue L6;
                    }
                  }
                }
              }
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0) {
        this.field_Tb = this.field_gc;
        this.field_M = 0;
        this.field_lb = false;
        this.field_tb = 0;
        this.field_Bb = false;
        this.field_ib = 1700;
        this.field_I = 0;
        this.field_e = 0;
        this.field_ac = this.field_U;
        this.field_Kb = 0;
        this.field_hc = 0;
        if (param0 > -71) {
            this.field_ub = 121;
        }
        this.field_mc = 0;
        this.field_H = this.field_t;
        this.field_ec = false;
        this.field_h = null;
        this.field_Ub = -1;
        this.field_m = -1;
        this.field_ab = 0;
        this.field_p = this.field_bb;
        this.field_hb = new cn();
        this.field_jc = false;
        this.field_yb = 0;
        this.field_Gb = false;
        this.field_kc = false;
        this.field_Ib = false;
        this.field_q = false;
        this.field_G = new cn();
        this.field_x = 0;
        this.field_nb = null;
        this.field_O = 0;
        cn.field_f = new cn();
        aa.field_a = 0;
        vh.field_i = 0;
    }

    private final void b(int param0, int param1, int param2) {
        int var5 = 0;
        vh var6 = null;
        int var7 = EscapeVector.field_A;
        hg var4 = this.field_G.a(false);
        for (var5 = param2; (this.field_x ^ -1) < (var5 ^ -1); var5++) {
            var6 = (vh) ((Object) var4);
            var6.a(param0, false, param1);
            var4 = var4.field_b;
        }
    }

    private final void k(byte param0) {
        int var2_int = 0;
        if (this.field_F && -2 == (this.field_Ub ^ -1)) {
            return;
        }
        if (!(this.field_Gb)) {
            var2_int = mf.b(this.field_fc, this.field_Ub, -2);
            this.field_J = this.field_J + var2_int;
            v.a(8, var2_int);
        }
        ed var3 = mb.field_f[this.field_Ub];
        ed var2 = var3;
        this.a(-(var3.field_A << -2091453361) + this.field_mb >> 624829104, -28311553, var2, -(var3.field_z << 2079145583) + this.field_E >> 788758448, sf.field_e[this.field_Ub]);
        if (!(-2 != (this.field_Ub ^ -1))) {
            this.b(0);
        }
        if (param0 < 6) {
            return;
        }
        this.field_Ub = -1;
        if (!this.field_Gb) {
            pl.field_n.a(bc.field_c, 100, qm.field_c * 6144 / 64, 8192);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        Object var6;
        hg var7;
        int var8;
        am var9_ref_am;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        var13 = EscapeVector.field_A;
        vh.field_i = 0;
        var6 = null;
        if (50 <= this.field_oc) {
          return;
        } else {
          var7 = this.field_C.a(false);
          var8 = 0;
          L0: while (true) {
            L1: {
              if (this.field_ub <= var8) {
                stackIn_18_0 = -42;
                stackIn_18_1 = (45 - param0) / 34;
                break L1;
              } else {
                var9_ref_am = (am) ((Object) var7);
                var10 = var9_ref_am.field_j;
                stackIn_18_0 = param2;

                stackIn_18_1 = var10;

                L2: {
                  if (stackIn_18_0 > stackIn_18_1) {
                    break L2;
                  } else {
                    if ((var10 ^ -1) >= (param1 ^ -1)) {
                      var11 = var9_ref_am.field_i;
                      var12 = var9_ref_am.field_h;
                      L3: while (true) {
                        if ((param3 ^ -1) <= (var12 ^ -1)) {
                          L4: while (true) {
                            if (param3 < var12) {
                              L5: while (true) {
                                if (param4 < var11) {
                                  break L2;
                                } else {
                                  var6 = this.a((hg) (var6), var12, var11, true, var10);
                                  var11 = var11 + this.field_n;
                                  var12 = var12 + this.field_n;
                                  continue L5;
                                }
                              }
                            } else {
                              var12 = var12 + this.field_n;
                              var11 = var11 + this.field_n;
                              continue L4;
                            }
                          }
                        } else {
                          var11 = var11 - this.field_n;
                          var12 = var12 - this.field_n;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var8++;
                var7 = var7.field_b;
                continue L0;
              }
            }
            var9 = stackIn_18_0 / stackIn_18_1;
            return;
          }
        }
    }

    private final void b(int param0) {
        if (this.field_Q != param0) {
            return;
        }
        this.field_ec = true;
        if (!this.field_Gb) {
            this.a(50, 0 > this.field_Pb ? qc.field_xb : hi.field_n);
        }
    }

    private final void k(int param0, int param1) {
        this.c(param1, (byte) -111);
        this.b(param1, (byte) 59);
        this.b(false, param1);
        this.g(320, param1);
        if (param0 > -70) {
            this.d(44);
        }
    }

    private final void l(int param0) {
        int var6;
        ed[] var12;
        String[] var13;
        tj var14;
        String[] var16;
        tj var17;
        int[] var32;
        int[] var33;
        String[] var19;
        tj var20;
        String[] var22;
        tj var23;
        int[] var34;
        int[] var35;
        var6 = EscapeVector.field_A;
        if (this.field_fc == 2) {
          L0: {
            if (param0 == 10974) {
              break L0;
            } else {
              this.E(-55);
              break L0;
            }
          }
          L1: {
            var12 = ae.field_c;
            if ((this.field_Pb ^ -1) > -5) {
              var35 = uj.field_e;
              var22 = lh.field_c;
              var23 = new tj(var35, var12, var22, false);
              re.a(1820, var23);
              break L1;
            } else {
              if ((this.field_Pb ^ -1) > -9) {
                var34 = p.field_j;
                var19 = rb.field_j;
                var20 = new tj(var34, var12, var19, false);
                re.a(1820, var20);
                break L1;
              } else {
                if (-13 < (this.field_Pb ^ -1)) {
                  var33 = ha.field_e;
                  var16 = pc.field_b;
                  var17 = new tj(var33, var12, var16, false);
                  re.a(1820, var17);
                  break L1;
                } else {
                  var32 = w.field_bb;
                  var13 = vd.field_i;
                  var14 = new tj(var32, var12, var13, false);
                  re.a(param0 + -9154, var14);
                  break L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int[] param1, byte param2, int param3, int param4, uk param5) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        ga var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ga var14 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            var14 = param5.field_f;
            if (param2 == 43) {
              var8 = param5.field_i;
              var9 = var14.field_c * param3;
              var10 = var14.field_c;
              L1: while (true) {
                if ((var8.field_c ^ -1) > (var10 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var11 = var14.field_a;
                  L2: while (true) {
                    L3: {
                      if ((var11 ^ -1) < (var8.field_a ^ -1)) {
                        stackIn_15_0 = var9;
                        stackIn_15_1 = param3;
                        break L3;
                      } else {
                        var12 = this.a(param5, (byte) 15, var10, var11);
                        stackIn_15_0 = var12 ^ -1;

                        stackIn_15_1 = -1;

                        L4: {
                          if (stackIn_15_0 < stackIn_15_1) {
                            param1[var9 - -var11] = param4;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (0 <= var12) {
                            break L5;
                          } else {
                            param1[var9 + var11] = param0;
                            break L5;
                          }
                        }
                        var11++;
                        continue L2;
                      }
                    }
                    var9 = stackIn_15_0 + stackIn_15_1;
                    var10++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var7);

            stackIn_19_1 = new StringBuilder().append("oe.IC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void v(byte param0) {
        int var9 = 0;
        am var10 = null;
        int var11 = EscapeVector.field_A;
        int var2 = this.field_H >> 2072705637;
        var2 = var2 + (this.field_n << 520993739);
        int var3 = this.field_p >> -63711547;
        int var4 = var2 + -24576;
        int var5 = -24576 + var3;
        int var6 = 24576 + var2;
        var4 = var4 >> 11;
        int var7 = 24576 + var3;
        var6 = var6 >> 11;
        var5 = var5 >> 11;
        var7 = var7 >> 11;
        if (param0 < 55) {
            this.field_hb = (cn) null;
        }
        this.a(98, var7, var5, var4, var6);
        hg var8 = cn.field_f.a(false);
        for (var9 = 0; var9 < vh.field_i; var9++) {
            var10 = (am) ((Object) var8);
            var10.field_i = -var2 + (var10.field_i << -1626298229);
            var10.field_h = -var2 + (var10.field_h << 525097451);
            var8 = var8.field_b;
            var10.field_j = (var10.field_j << 1520095019) - var3;
        }
        if ((var6 ^ var4) >> 1514039109 == 0) {
            this.a(var5, 31 & var6, var2, var3, var4 >> -841071035, true, var7, 31 & var4);
        } else {
            this.a(var5, 31, var2, var3, var4 >> 880270117, true, var7, var4 & 31);
            this.a(var5, var6 & 31, var2, var3, var6 >> -118282811, true, var7, 0);
        }
    }

    private final void a(sa param0, oc param1, int param2) {
        hg var4 = null;
        sa var5 = null;
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if ((this.field_Q ^ -1) == param2) {
              if (this.field_k != null) {
                if (this.field_k.a(-113)) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0 == null) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param0.field_r) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var4 = this.field_k.a(false);
                      L1: while (true) {
                        if (var4 == null) {
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          var5 = (sa) ((Object) var4);
                          if (var5.field_j == param0.field_j) {
                            L2: {
                              if (!param0.field_p) {
                                break L2;
                              } else {
                                this.f(27, 2);
                                break L2;
                              }
                            }
                            var4.c((byte) -101);
                            this.field_Ab.a(param2 + 1, param1);
                            this.a(-111, oi.field_J);
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            var4 = this.field_k.b((byte) 70);
                            continue L1;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4_ref);

            stackIn_26_1 = new StringBuilder().append("oe.UB(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final int c(int param0, int param1) {
        int var4 = EscapeVector.field_A;
        for (param0 = param0 - this.field_H; (-this.field_n << -1498065905 ^ -1) < (param0 ^ -1); param0 = param0 + (this.field_n << -2114255312)) {
        }
        while (this.field_n << 1184366799 < param0) {
            param0 = param0 - (this.field_n << -654113904);
        }
        if (param0 < -this.field_n << -744080946) {
            param0 = -param0 + (-this.field_n << -1009816049);
        }
        if (!(param0 <= this.field_n << 464193422)) {
            param0 = (this.field_n << 1247146575) + -param0;
        }
        if (!(20971519 > (param0 ^ -1))) {
            return 0;
        }
        if ((param0 ^ -1) <= -20971521) {
            return 16384;
        }
        if (param1 <= 94) {
            return 5;
        }
        return 8192 - -(param0 / 2560);
    }

    private final void h(boolean param0) {
        if (!(0 != this.field_Q)) {
            this.a(164, (byte) 127, tf.field_i);
        }
        if (!(1 != this.field_Q)) {
            this.a(164, (byte) 92, gl.field_r);
        }
        if (param0) {
            this.j(70, -118, 0);
        }
    }

    private final int[] a(int param0, byte param1, int param2) {
        int[] stackIn_7_0 = null;
        if (param1 == -82) {
          if ((param2 ^ -1) <= -1) {
            L0: {
              if ((this.field_nc ^ -1) < (param2 ^ -1)) {
                stackIn_7_0 = this.field_Vb[param2 * this.field_Mb + param0 % this.field_Mb];
                break L0;
              } else {
                stackIn_7_0 = si.field_v;
                break L0;
              }
            }
            return stackIn_7_0;
          } else {
            return null;
          }
        } else {
          return (int[]) null;
        }
    }

    private final boolean b(int param0, ed param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0 = param0 + param1.field_q;
            param2 = param2 + param1.field_v;
            var5_int = param3 + (param1.field_s + param0);
            var6 = -1 + (param2 - -param1.field_x);
            this.a(96, var6, param2, param0, var5_int);
            if (-1 == ((var5_int ^ param0) >> -1987490203 ^ -1)) {
              stackIn_8_0 = this.a(param1, param0 >> 868605637, param2, 31 & param0, -(31 & param0), var6, 31, 31 & var5_int);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (this.a(param1, param0 >> -969045947, param2, 31 & param0, -(31 & param0), var6, 31, 31)) {
                stackIn_4_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackIn_6_0 = this.a(param1, var5_int >> 728523237, param2, 0, -param0 & 31, var6, 31, 31 & var5_int);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("oe.EE(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var10;
        int[] var11;
        L0: {
          L1: {
            if (this.field_rc) {
              if ((param1 ^ -1) < -1) {
                if (-1 < (param2 ^ -1)) {
                  pf.a(false, "EV1: " + param1, (Throwable) null);
                  return;
                } else {
                  L2: {
                    var4 = this.field_Rb;
                    if (-1 >= (var4 ^ -1)) {
                      break L2;
                    } else {
                      var4 = 0;
                      break L2;
                    }
                  }
                  param1 = tj.a(this.field_fc, (byte) 126, param1);
                  var5 = -var4 + param2;
                  var6 = var5 + 50 * (param2 + param1 * 50);
                  var7 = al.a(this.field_fc, 26504);
                  if (-1 < (var7 ^ -1)) {
                    return;
                  } else {
                    lh.a((byte) 99, param1);
                    var11 = jm.j(-3282);
                    var10 = var11;
                    var8 = var10;
                    if (var8 == null) {
                      return;
                    } else {
                      if (4 != var11.length) {
                        return;
                      } else {
                        de.field_i = new ik(var7, var7 ^ 65535, var11[0], var11[1], var11[2], var11[3], new int[]{var6});
                        if (aj.b(-98)) {
                          break L1;
                        } else {
                          ml.a(de.field_i, 3, (byte) 101);
                          break L1;
                        }
                      }
                    }
                  }
                }
              } else {
                var4 = -40 % ((param0 - 78) / 38);
                break L0;
              }
            } else {
              break L1;
            }
          }
          var4 = -40 % ((param0 - 78) / 38);
          break L0;
        }
    }

    private final void f(int param0) {
        fl var2;
        oc var3;
        int var4;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        boolean stackOut_5_0;
        var4 = EscapeVector.field_A;
        if (this.field_Ab == null) {
          return;
        } else {
          if (!this.field_Ab.b(-182442704)) {
            var2 = this.field_Ab.a(0);
            L0: while (true) {
              L1: {
                if (var2 == null) {
                  stackIn_10_0 = param0;
                  break L1;
                } else {
                  var3 = (oc) ((Object) var2);
                  stackOut_5_0 = var3.field_B;
                  stackIn_10_0 = stackOut_5_0 ? 1 : 0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!stackIn_6_0) {
                    var2 = this.field_Ab.a((byte) 124);
                    continue L0;
                  } else {
                    var2.d(param0 ^ 20281);
                    return;
                  }
                }
              }
              L2: {
                if (stackIn_10_0 == -20320) {
                  break L2;
                } else {
                  this.x((byte) 44);
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void B(byte param0) {
        if ((this.field_l ^ -1) == -1) {
          return;
        } else {
          if (param0 > 99) {
            L0: {
              if (!this.field_a) {
                break L0;
              } else {
                if (0 <= this.field_X) {
                  L1: {
                    this.field_X = this.field_X - 1;
                    if (this.field_X >= 0) {
                      break L1;
                    } else {
                      if (this.field_Gb) {
                        break L1;
                      } else {
                        this.h((byte) -79);
                        break L0;
                      }
                    }
                  }
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final boolean r(byte param0) {
        if (!(this.field_Pb >= 0)) {
            return true;
        }
        if (param0 != 90) {
            return true;
        }
        if ((this.field_Yb ^ -1) != -7) {
            return false;
        }
        return true;
    }

    private final void i(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var2;
        int var3;
        int var5;
        sa var6;
        sa var7;
        L0: {
          var5 = EscapeVector.field_A;
          if (this.field_y >= 2) {
            this.field_y = 2;
            break L0;
          } else {
            this.field_y = 0;
            break L0;
          }
        }
        this.field_dc = -1;
        this.field_Mb = 32;
        this.field_n = this.field_Mb << 582987845;
        this.field_D = 32;
        this.field_Fb = this.field_D << -203316731;
        this.field_Yb = 5;
        this.field_P = 5;
        vl.b(1, 0);
        this.field_V = new int[this.field_D * this.field_Mb][];
        var2 = 0;
        L1: while (true) {
          if (4 <= var2) {
            L2: {
              if (param0 <= -29) {
                break L2;
              } else {
                this.field_t = -97;
                break L2;
              }
            }
            var2 = 4;
            L3: while (true) {
              if (var2 >= 32) {
                var2 = 14;
                L4: while (true) {
                  if (var2 >= 18) {
                    var2 = 14;
                    L5: while (true) {
                      if (-19 >= (var2 ^ -1)) {
                        this.l((byte) 124);
                        var2 = 2;
                        var3 = 0;
                        this.field_kb.setSize(var2);
                        incrementValue$0 = var3;
                        var3++;
                        var6 = new sa(incrementValue$0, 8, 480, -mb.field_f[8].field_z + 128);
                        this.field_kb.setElementAt(var6, 0);
                        incrementValue$1 = var3;
                        var3++;
                        var7 = new sa(incrementValue$1, 1, 512 - mb.field_f[1].field_A / 2, 480 - mb.field_f[1].field_z);
                        this.field_kb.setElementAt(var7, 1);
                        this.field_N = new cn();
                        this.field_bb = 66715648;
                        this.field_qb = 512;
                        this.field_t = this.field_n << -1159988593;
                        this.field_gc = 150;
                        this.field_U = 2500;
                        this.field_rb = true;
                        return;
                      } else {
                        this.field_V[var2 + this.field_Mb * 15] = si.field_v;
                        var2++;
                        continue L5;
                      }
                    }
                  } else {
                    this.field_V[9 * this.field_Mb + var2] = si.field_v;
                    var2++;
                    continue L4;
                  }
                }
              } else {
                var3 = 0;
                L6: while (true) {
                  if (-9 >= (var3 ^ -1)) {
                    var3 = 24;
                    L7: while (true) {
                      if ((var3 ^ -1) <= -33) {
                        var2++;
                        continue L3;
                      } else {
                        this.field_V[var2 * this.field_Mb - -var3] = si.field_v;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    this.field_V[var2 * this.field_Mb - -var3] = si.field_v;
                    var3++;
                    continue L6;
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L8: while (true) {
              if (var3 >= 15) {
                var3 = 17;
                L9: while (true) {
                  if (32 <= var3) {
                    var2++;
                    continue L1;
                  } else {
                    this.field_V[var3 + this.field_Mb * var2] = si.field_v;
                    var3++;
                    continue L9;
                  }
                }
              } else {
                this.field_V[this.field_Mb * var2 - -var3] = si.field_v;
                var3++;
                continue L8;
              }
            }
          }
        }
    }

    private final void a(int param0, ed param1, int param2, int param3) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var5_double = 0.0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        uk var32 = null;
        int var33 = 0;
        var33 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var5_double = (double)this.field_I * 0.02454369260617026;
              var7 = (int)(Math.sin(var5_double) * 2048.0);
              var8 = -(int)(Math.cos(var5_double) * 2048.0);
              var9 = -var8;
              var10 = var7;
              var11 = this.field_H >> 65525573;
              var12 = this.field_p >> 308083781;
              var13 = var11 + 10 * var7;
              var14 = -(var7 * 2) + var11;
              var15 = var12 - -(var8 * 10);
              var16 = -(var8 * 2) + var12;
              var17 = -(6 * var7) + (var11 + -(8 * var9));
              var18 = var11 + (-(6 * var7) - -(8 * var9));
              var19 = -(var10 * 8) + (-(6 * var8) + var12);
              var20 = 8 * var10 + -(var8 * 6) + var12;
              var21 = var13;
              if (var21 > var17) {
                var21 = var17;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var18 >= var21) {
                break L2;
              } else {
                var21 = var18;
                break L2;
              }
            }
            L3: {
              var22 = var15;
              if ((var19 ^ -1) > (var22 ^ -1)) {
                var22 = var19;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var22 <= var20) {
                break L4;
              } else {
                var22 = var20;
                break L4;
              }
            }
            L5: {
              var23 = var13;
              if ((var23 ^ -1) > (var17 ^ -1)) {
                var23 = var17;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var18 > var23) {
                var23 = var18;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var24 = var15;
              if (var19 > var24) {
                var24 = var19;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var21 = -param3 + (var21 >> 1825947147);
              if ((var24 ^ -1) > (var20 ^ -1)) {
                var24 = var20;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var22 = -param0 + (var22 >> 206707339);
              var23 = -param3 + (var23 >> -490349397);
              var24 = -param0 + (var24 >> 1786771563);
              if (param1 != null) {
                L10: {
                  param1.field_v = var22;
                  var23 = var23 - var21;
                  param1.field_q = var21;
                  var24 = var24 - var22;
                  var21 = var21 << 11;
                  var22 = var22 << 11;
                  var13 = var13 - var21;
                  var11 = var11 - var21;
                  var18 = var18 - var21;
                  var14 = var14 - var21;
                  var15 = var15 - var22;
                  var20 = var20 - var22;
                  var19 = var19 - var22;
                  var16 = var16 - var22;
                  var12 = var12 - var22;
                  var17 = var17 - var21;
                  param1.field_x = 1 + var24;
                  var21 = 0;
                  param1.field_s = var23 + 1;
                  var22 = 0;
                  param1.field_z = param1.field_x + param1.field_v;
                  param1.field_A = param1.field_q + param1.field_s;
                  var27 = param1.field_s * param1.field_x;
                  if ((param1.field_B.length ^ -1) <= (var27 ^ -1)) {
                    var28 = 0;
                    L11: while (true) {
                      if (var28 >= var27) {
                        break L10;
                      } else {
                        param1.field_B[var28] = 0;
                        var28++;
                        continue L11;
                      }
                    }
                  } else {
                    param1.field_B = new int[var27];
                    break L10;
                  }
                }
                var25 = param1.field_B;
                var26 = param1.field_s;
                break L9;
              } else {
                L12: {
                  if (-1 >= (var22 ^ -1)) {
                    break L12;
                  } else {
                    var22 = 0;
                    break L12;
                  }
                }
                L13: {
                  if (var23 <= 639) {
                    break L13;
                  } else {
                    var23 = 639;
                    break L13;
                  }
                }
                L14: {
                  var25 = em.field_i;
                  if ((var24 ^ -1) >= -480) {
                    break L14;
                  } else {
                    var24 = 479;
                    break L14;
                  }
                }
                var26 = 640;
                if (var21 >= 0) {
                  break L9;
                } else {
                  var21 = 0;
                  break L9;
                }
              }
            }
            L15: {
              var27 = -(var9 >> -1214779515) - -(var7 >> 1540445575);
              var28 = -(var10 >> 2116932005) + (var8 >> 200407239);
              var29 = param2 * (-(var27 >> 79500033) + (128 - var28));
              var27 = (var7 >> -216634233) + (var9 >> 1976685317);
              var28 = (var8 >> -1727014041) + (var10 >> -730499899);
              var30 = 65793 * (-var28 + (128 - (var27 >> 1776349921)));
              if (!this.n(8192)) {
                break L15;
              } else {
                if (se.field_b == null) {
                  break L15;
                } else {
                  var30 = se.field_b.field_b;
                  var29 = se.field_b.field_b;
                  break L15;
                }
              }
            }
            var32 = ae.field_b;
            var32.field_e.a(param3, param2 ^ 65913, param0);
            var32.field_k.a(var13, 126, var15);
            var32.field_d.a(var14, param2 ^ 65914, var16);
            var32.field_g.a(var17, 124, var19);
            var32.field_c.a(var18, 125, var20);
            var32.field_f.a(var21, 127, var22);
            var32.field_i.a(var23, 122, var24);
            this.a(var29, var25, (byte) 43, var26, var30, var32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var5);

            stackIn_45_1 = new StringBuilder().append("oe.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L16;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L16;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    oe(byte[][] param0, int param1, int param2, int param3) {
        try {
            this.field_F = false;
            this.field_rc = true;
            this.field_gb = false;
            this.field_Q = 0;
            this.field_kb = new Vector();
            this.field_vb = new cn();
            this.field_Db = new od((oe) (this));
            this.field_Xb = new oc(512);
            this.field_Sb = 0;
            this.field_qc = 0;
            this.field_nb = null;
            this.field_G = new cn();
            this.field_A = 3;
            this.field_tc = new cn();
            this.field_X = 0;
            this.field_a = false;
            this.field_g = new int[3];
            this.field_sb = 0;
            this.field_l = 0;
            this.field_Lb = new int[32];
            this.field_i = new ed(638, 60);
            this.field_s = new cn();
            this.field_C = new cn();
            try {
                od.field_k = l.a((byte) -111);
                if (od.field_k) {
                    System.out.println("Mod logged in: Cheats activated");
                }
                this.field_jb = hl.a(oj.field_N, 100, 0);
                this.field_jb.h(-1);
                pl.field_n.a(this.field_jb);
                this.field_Z = hl.a(ng.field_mb, 100, 0);
                this.field_Z.h(-1);
                pl.field_n.a(this.field_Z);
                this.field_v = hl.a(th.field_G, 100, 0);
                this.field_v.h(-1);
                pl.field_n.a(this.field_v);
                this.field_Wb = hl.a(vi.field_c, 100, 0);
                this.field_Wb.h(-1);
                pl.field_n.a(this.field_Wb);
                this.field_wb = hl.a(w.field_hb, 100, 0);
                this.field_wb.h(-1);
                pl.field_n.a(this.field_wb);
                this.field_r = hl.a(of.field_h, 100, 0);
                this.field_r.h(-1);
                pl.field_n.a(this.field_r);
                this.field_lc = hl.a(pa.field_a, 100, 0);
                this.field_lc.h(-1);
                pl.field_n.a(this.field_lc);
                this.field_fb = new m();
                pl.field_n.a(this.field_fb);
                g.a(127, param3);
                this.field_Nb = param0;
                this.field_Pb = param3;
                this.field_fc = param2;
                this.field_Rb = param3;
                this.j((byte) -110);
                this.field_c = 64;
                if (param3 >= 0) {
                    this.a(164, (byte) 122, m.field_n);
                    this.field_j = 314;
                }
                this.a((byte) 84, param1);
                this.o(0);
            } catch (RuntimeException runtimeException) {
                throw t.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    oe(byte[][] param0) {
        try {
            this.field_F = false;
            this.field_rc = true;
            this.field_gb = false;
            this.field_Q = 0;
            this.field_kb = new Vector();
            this.field_vb = new cn();
            this.field_Db = new od((oe) (this));
            this.field_Xb = new oc(512);
            this.field_Sb = 0;
            this.field_qc = 0;
            this.field_nb = null;
            this.field_G = new cn();
            this.field_A = 3;
            this.field_tc = new cn();
            this.field_X = 0;
            this.field_a = false;
            this.field_g = new int[3];
            this.field_sb = 0;
            this.field_l = 0;
            this.field_Lb = new int[32];
            this.field_i = new ed(638, 60);
            this.field_s = new cn();
            this.field_C = new cn();
            try {
                this.field_Nb = param0;
            } catch (RuntimeException runtimeException) {
                throw t.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_cc = "...";
        field_xb = new int[8192];
    }
}
