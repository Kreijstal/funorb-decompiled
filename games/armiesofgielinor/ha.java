/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha {
    int field_db;
    int field_O;
    private int[] field_M;
    int[] field_zb;
    int field_ib;
    static String field_nb;
    int[][] field_a;
    private int field_Db;
    boolean field_X;
    private int field_ab;
    boolean field_kb;
    private int[] field_yb;
    boolean field_eb;
    float field_bb;
    int field_R;
    int[] field_h;
    int field_D;
    int field_gb;
    om field_K;
    int field_Q;
    int[] field_m;
    ln[] field_T;
    private boolean field_Fb;
    static String field_q;
    at field_l;
    go[] field_w;
    private int field_A;
    boolean field_L;
    int[] field_H;
    int field_xb;
    int[] field_fb;
    int field_e;
    private int[] field_Y;
    int field_Gb;
    boolean field_qb;
    boolean field_Cb;
    private int[] field_N;
    ne[] field_Eb;
    at field_k;
    vh field_Z;
    int[] field_S;
    boolean field_Ab;
    int field_cb;
    int field_hb;
    int field_W;
    int field_tb;
    at[] field_t;
    private int[] field_d;
    int field_C;
    int field_sb;
    private int[] field_n;
    int field_i;
    boolean field_o;
    int[] field_ub;
    boolean field_J;
    int field_u;
    boolean field_x;
    private int[] field_g;
    private int[] field_U;
    int[] field_rb;
    boolean field_b;
    int[] field_G;
    int[] field_p;
    String[] field_lb;
    boolean field_V;
    int field_v;
    boolean field_wb;
    int[][] field_z;
    int[][] field_B;
    boolean field_Bb;
    boolean field_f;
    ul field_j;
    private int field_I;
    int[][] field_c;
    private tt field_P;
    private int field_vb;
    int[][] field_E;
    int field_jb;
    int[] field_s;
    int[] field_ob;
    private int[] field_y;
    static String field_pb;
    boolean field_r;
    int[] field_mb;
    boolean field_F;

    final go d(int param0, int param1) {
        if ((param0 ^ -1) > param1) {
            return null;
        }
        if (param0 > this.field_yb.length) {
            return null;
        }
        return this.field_w[this.field_yb[param0]];
    }

    final void a(int param0, jd param1) {
        RuntimeException runtimeException = null;
        tc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_t.length <= param1.field_O) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_t[param1.field_O].a((byte) -119, (tc) (param1));
                if (param0 == 8288) {
                  break L1;
                } else {
                  this.l(-73, -26);
                  break L1;
                }
              }
              var3 = this.field_k.e((byte) 96);
              L2: while (true) {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L4: {
                        if (!(var3 instanceof mm)) {
                          break L4;
                        } else {
                          ((mm) ((Object) var3)).a(param1, (byte) -2);
                          break L4;
                        }
                      }
                      var3 = this.field_k.a((byte) 123);
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("ha.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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

    final void a(jd param0, int param1) {
        int var3_int = 0;
        try {
            if (param1 >= -87) {
                this.field_cb = -63;
            }
            if (param0 != null) {
                var3_int = this.b(31, param0.field_w, param0.field_J, param0.field_O);
                param0.field_v = -1 != (16 & var3_int ^ -1) ? true : false;
                param0.field_Z = (4 & var3_int) != 0 ? true : false;
                param0.field_eb = (var3_int & 8) != 0 ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, jd param4, boolean param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -16) {
                break L1;
              } else {
                this.field_w = (go[]) null;
                break L1;
              }
            }
            stackIn_3_0 = pj.a(this.field_v, this.field_Eb, param5, param2, param3, this.field_db, this.o(param3, param1 ^ 15), param4, param0, false, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("ha.VD(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, byte[] param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (-7 < (param1.length ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var3_int = param0 * 12 + 6;
                    if (-1 == (128 & param1[var3_int] ^ -1)) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var5 = stackIn_8_0;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        var3_int++;
                        var3_int++;
                        var4 = param1[var3_int] & 255;
                        if (!ArmiesOfGielinor.field_M) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3_int++;
                    var4 = 255 & param1[var3_int];
                    break L3;
                  }
                  L5: {
                    if (!param2) {
                      break L5;
                    } else {
                      field_nb = (String) null;
                      break L5;
                    }
                  }
                  stackIn_14_0 = var4 / param0 - -1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("ha.GC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_14_0;
        }
    }

    final void b(byte param0, int param1, int param2, int param3) {
        this.field_Eb[param2 - -(param3 * this.field_v)].field_h = param1;
        this.field_Eb[param3 * this.field_v + param2].field_b = true;
        int var5 = 96 % ((59 - param0) / 34);
    }

    final at a(boolean param0, boolean param1, int param2) {
        boolean stackIn_9_0 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_42_0 = false;
        boolean stackIn_60_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int statePc = 0;
        Object var4 = null;
        jd var5_ref_jd = null;
        int var5 = 0;
        int var6_int = 0;
        jd var6 = null;
        ne var7 = null;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var4 = null;
                    if (!this.field_b) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = new at();
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    this.g((byte) -15);
                    if (param0) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return (at) (var4);
                }
                case 5: {
                    var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].e((byte) 116));
                    if (param2 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_o = false;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var5_ref_jd == null) {
                        statePc = 30;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_36_0 = var5_ref_jd.i(-21428);
                    stackIn_9_0 = stackIn_36_0;
                    if (var8 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (!stackIn_9_0) {
                        statePc = 29;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!var5_ref_jd.t(param2 + 26440)) {
                        statePc = 12;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var6_int = var5_ref_jd.field_J - -(var5_ref_jd.field_w * this.field_v);
                    if ((var5_ref_jd.field_J ^ -1) > -1) {
                        statePc = 29;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((this.field_Eb.length ^ -1) >= (var5_ref_jd.field_J ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((var5_ref_jd.field_w ^ -1) > -1) {
                        statePc = 29;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var5_ref_jd.field_w < this.field_Eb.length) {
                        statePc = 17;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var7 = this.field_Eb[var6_int];
                    if (!var7.a(false)) {
                        statePc = 29;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var7.field_a < 0) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (!this.c(var7.field_a, -16985, this.field_gb)) {
                        statePc = 21;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var7.field_m = var7.field_m - var5_ref_jd.g((byte) 122);
                    if ((var7.field_m ^ -1) >= -1) {
                        statePc = 23;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (this.field_b) {
                        statePc = 25;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (param1) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_l.a((byte) -119, (tc) (new qq(0, var5_ref_jd.field_J, var5_ref_jd.field_w, var5_ref_jd.field_O)));
                    if (var8 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    ((at) (var4)).a((byte) -119, (tc) (new ss(var5_ref_jd.field_J, var5_ref_jd.field_w, 0, this.field_gb)));
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                    if (var8 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].e((byte) 102));
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var5_ref_jd == null) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var5_ref_jd.n((byte) -42);
                    var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                    if (var8 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var8 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = param1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (stackIn_36_0) {
                        statePc = 38;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 38: {
                    this.h((byte) 108);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].d((byte) -81));
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var5_ref_jd == null) {
                        statePc = 59;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_60_0 = var5_ref_jd.field_S;
                    stackIn_42_0 = stackIn_60_0;
                    if (var8 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (!stackIn_42_0) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var8 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!param1) {
                        statePc = 56;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (!var5_ref_jd.t(26440)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((at) (var4)).a((byte) -119, (tc) (new il(var5_ref_jd.field_J, var5_ref_jd.field_w, var5_ref_jd, this.field_Eb[var5_ref_jd.field_w * this.field_v + var5_ref_jd.field_J])));
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (!var5_ref_jd.e((byte) 79)) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if ((this.field_H[var5_ref_jd.field_O] ^ -1) > -11) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ((at) (var4)).a((byte) -119, (tc) (new pl(var5_ref_jd.field_O, var5_ref_jd, 0)));
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if ((var5_ref_jd.field_N ^ -1) != -11) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (!this.field_Eb[var5_ref_jd.field_J + var5_ref_jd.field_w * this.field_v].c(93)) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (-20 != (var5_ref_jd.field_t ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ((at) (var4)).a((byte) -119, (tc) (new dk(var5_ref_jd.field_O, this.field_W)));
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var5_ref_jd.k(-1);
                    if (!param1) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    this.h((byte) 108);
                    this.d(this.field_gb, this.field_t[this.field_gb].b(false), 91, 13);
                    this.d(this.field_gb, this.field_ob[this.field_gb], param2 ^ 82, 12);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].b((byte) 100));
                    if (var8 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = param1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (!stackIn_60_0) {
                        statePc = 72;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var5 = 0;
                    var6 = (jd) ((Object) this.field_t[this.field_gb].e((byte) 102));
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var6 == null) {
                        statePc = 68;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_69_0 = var6.field_N ^ -1;
                    stackIn_64_0 = stackIn_69_0;
                    stackIn_69_1 = -21;
                    stackIn_64_1 = stackIn_69_1;
                    if (var8 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (stackIn_64_0 == stackIn_64_1) {
                        statePc = 66;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var5++;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var6 = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                    if (var8 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = var5 ^ -1;
                    stackIn_69_1 = -26;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (stackIn_69_0 <= stackIn_69_1) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    ((at) (var4)).a((byte) -119, (tc) (new kj(this.field_gb, this.field_W)));
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    return (at) (var4);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, int param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        Object stackIn_65_0 = null;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        int[] var10 = null;
        jd var11 = null;
        jd var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.field_M ? 1 : 0;
                    this.field_e = this.field_e | 1 << param1;
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 >= this.field_W) {
                        statePc = 60;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_61_0 = this.field_n[var4];
                    stackIn_3_0 = stackIn_61_0;
                    stackIn_61_1 = param1;
                    stackIn_3_1 = stackIn_61_1;
                    if (var9 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var9 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_n[var4] < 0) {
                        statePc = 8;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_n[var4] = param1;
                    if (!this.field_wb) {
                        statePc = 44;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = 0;
                    var6 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((var6 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_18_0 = param1 ^ -1;
                    stackIn_12_0 = stackIn_18_0;
                    stackIn_18_1 = var6 ^ -1;
                    stackIn_12_1 = stackIn_18_1;
                    if (var9 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 == stackIn_12_1) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!this.c(var6, -16985, param1)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (0 != (this.field_e & 1 << var6)) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var6++;
                    if (var9 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = var5 ^ -1;
                    stackIn_18_1 = -1;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 >= stackIn_18_1) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (!param2) {
                        statePc = 26;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var11 = (jd) ((Object) this.field_t[param1].e((byte) 87));
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var11 == null) {
                        statePc = 43;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_l.a((byte) -119, (tc) (new hp(var11, true)));
                    var11 = (jd) ((Object) this.field_t[param1].a((byte) 123));
                    if (var9 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var9 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var10 = new int[var5];
                    var5 = 0;
                    var7 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((this.field_W ^ -1) >= (var7 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_36_0 = var7 ^ -1;
                    stackIn_29_0 = stackIn_36_0;
                    stackIn_36_1 = param1 ^ -1;
                    stackIn_29_1 = stackIn_36_1;
                    if (var9 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 == stackIn_29_1) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (!this.c(var7, param0 + -26986, param1)) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((1 << var7 & this.field_e ^ -1) != -1) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var10[var5] = var7;
                    var5++;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var5 = 0;
                    var7 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = this.field_Eb.length ^ -1;
                    stackIn_36_1 = var7 ^ -1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (stackIn_36_0 >= stackIn_36_1) {
                        statePc = 43;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var8 = this.field_Eb[var7].field_c;
                    stackIn_65_0 = null;
                    stackIn_38_0 = stackIn_65_0;
                    if (var9 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (stackIn_38_0 == var8) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (param1 == var8.field_O) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_l.a((byte) -119, (tc) (new as(var8, var10[var5 % var10.length], false)));
                    var5++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var9 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var5 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_db * this.field_v <= var5) {
                        statePc = 51;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_61_0 = param1;
                    stackIn_47_0 = stackIn_61_0;
                    stackIn_61_1 = this.field_Eb[var5].field_a;
                    stackIn_47_1 = stackIn_61_1;
                    if (var9 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 != stackIn_47_1) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    this.field_Eb[var5].field_a = -1;
                    if (11 != this.field_Eb[var5].field_h) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_Eb[var5].field_h = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (null == this.field_K) {
                        statePc = 60;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var12 = (jd) ((Object) this.field_t[param1].e((byte) 87));
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var12 == null) {
                        statePc = 57;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_l.a((byte) -119, (tc) (new hp(var12, true)));
                    var12 = (jd) ((Object) this.field_t[param1].a((byte) 123));
                    if (var9 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var9 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var9 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = param0;
                    stackIn_61_1 = 10001;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 == stackIn_61_1) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    return;
                }
                case 63: {
                    if (this.e((byte) -42)) {
                        statePc = 68;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = null;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 == this.field_K) {
                        statePc = 70;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if ((this.field_K.field_w ^ -1) == (param1 ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (!this.field_b) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    this.field_qb = true;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final at b(boolean param0, boolean param1, int param2) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        at stackIn_21_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        at stackIn_50_0 = null;
        int statePc = 0;
        int var4 = 0;
        int var5_int = 0;
        at var5 = null;
        jd var6 = null;
        int var7 = 0;
        jd var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (this.field_X) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    throw new IllegalStateException();
                }
                case 3: {
                    if (param2 == 30156) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return (at) null;
                }
                case 5: {
                    var4 = this.field_gb;
                    var8 = (jd) ((Object) this.field_t[this.field_gb].e((byte) 94));
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var8 == null) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var8.m((byte) -36);
                    var8 = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                    if (var7 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_mb[this.field_gb] = this.field_mb[this.field_gb] + 1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (!param0) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.a(true);
                    this.field_gb = (this.field_gb - -1) % this.field_W;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if ((this.field_gb ^ -1) == (var4 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_42_0 = -1;
                    stackIn_15_0 = stackIn_42_0;
                    stackIn_42_1 = 1 << this.field_gb & this.field_e ^ -1;
                    stackIn_15_1 = stackIn_42_1;
                    if (var7 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (stackIn_15_0 == stackIn_15_1) {
                        statePc = 34;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_gb = (this.field_gb + 1) % this.field_W;
                    if (var7 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5_int = this.field_gb - -1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var5_int == this.field_gb) {
                        statePc = 34;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_50_0 = this.field_t[(this.field_gb + 1) % this.field_W];
                    stackIn_21_0 = stackIn_50_0;
                    if (var7 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var6 = (jd) ((Object) ((at) (Object) stackIn_21_0).e((byte) 119));
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var6 == null) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var6.n((byte) -42);
                    var6 = (jd) ((Object) this.field_t[(1 + this.field_gb) % this.field_W].a((byte) 123));
                    if (var7 != 0) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var7 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var6 = (jd) ((Object) this.field_t[(this.field_gb - -1) % this.field_W].e((byte) 95));
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var6 == null) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var6.m((byte) -36);
                    var6 = (jd) ((Object) this.field_t[(1 + this.field_gb) % this.field_W].a((byte) 123));
                    if (var7 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var7 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var5_int = (1 + var5_int) % this.field_W;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (var7 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_Gb = this.field_Gb + 1;
                    this.a(this.field_gb, (byte) -102);
                    if (!param0) {
                        statePc = 39;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var4 == this.field_gb) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!this.e((byte) -42)) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    this.field_qb = true;
                    return null;
                }
                case 39: {
                    if (!param0) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (!this.i(0)) {
                        statePc = 46;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = var4 ^ -1;
                    stackIn_42_1 = this.field_gb ^ -1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 < stackIn_42_1) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!this.c((byte) 103)) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.field_qb = true;
                    return null;
                }
                case 46: {
                    stackIn_48_0 = this;
                    stackIn_47_0 = stackIn_48_0;
                    if (-1 >= (var4 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_49_0 = this;
                    stackIn_49_1 = 1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = this;
                    stackIn_49_1 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = this.a(stackIn_49_1 != 0, param1, param2 + -30156);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var5 = stackIn_50_0;
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, byte param1) {
        int var3;
        L0: {
          L1: {
            L2: {
              var3 = 124 % ((37 - param1) / 34);
              if ((this.field_sb ^ -1) > -1) {
                break L2;
              } else {
                if ((this.field_sb ^ -1) == (param0 ^ -1)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (this.field_sb < 0) {
              break L1;
            } else {
              this.field_Fb = false;
              if (!ArmiesOfGielinor.field_M) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_Fb = true;
          break L0;
        }
        L3: {
          if (0 < this.field_Gb) {
            break L3;
          } else {
            break L3;
          }
        }
    }

    final jd c(int param0, boolean param1, int param2) {
        boolean discarded$0 = false;
        if (param2 < 0) {
            return null;
        }
        if ((param0 ^ -1) > -1) {
            return null;
        }
        if ((param2 ^ -1) <= (this.field_v ^ -1)) {
            return null;
        }
        if (this.field_db <= param0) {
            return null;
        }
        ne var4 = this.field_Eb[param2 + param0 * this.field_v];
        if (!param1) {
            discarded$0 = this.a((int[]) null, -58, 5, -34);
        }
        return var4.field_c;
    }

    private final boolean a(int[] param0, int param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          L0: {
            L1: {
              var5_int = param0[param3];
              if (param2 == -24107) {
                break L1;
              } else {
                this.field_E = (int[][]) null;
                break L1;
              }
            }
            var6 = param0[param1];
            if ((var6 ^ -1) <= (var5_int ^ -1)) {
              L2: {
                if ((var6 ^ -1) != (var5_int ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    var7 = this.i(param3, -12710);
                    var8 = this.i(param1, param2 + 11397);
                    if (var8 < var7) {
                      break L3;
                    } else {
                      if ((var8 ^ -1) == (var7 ^ -1)) {
                        var9 = this.b((byte) 31, param3);
                        var10 = this.b((byte) 31, param1);
                        if ((var10 ^ -1) <= (var9 ^ -1)) {
                          L4: {
                            if ((var9 ^ -1) == (var10 ^ -1)) {
                              var11 = this.field_H[param3];
                              var12 = this.field_H[param1];
                              if ((var11 ^ -1) < (var12 ^ -1)) {
                                stackIn_22_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var11 == var12) {
                                  if (param1 > param3) {
                                    stackIn_20_0 = 1;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                          if (!ArmiesOfGielinor.field_M) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                  stackIn_25_0 = 1;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
              stackIn_27_0 = 0;
              decompiledRegionSelector0 = 5;
              break L0;
            } else {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("ha.BD(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0 != 0;
                } else {
                  return stackIn_27_0 != 0;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int statePc = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        jd var11 = null;
        int var12 = 0;
        jd var13_ref_jd = null;
        int var13 = 0;
        ne var14 = null;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (-75 != (param2 ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_Bb = true;
                    if (!this.field_b) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_N[9] >= 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_N[9] = param5;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var8 = 0;
                    var9 = bw.field_m[param2][4] + param6;
                    if (this.c(param3, true, param1) != null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.c(param3, true, param1).d(param4 ^ 91);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var10 = param4;
                    if (param2 != 74) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var10 = 2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var11 = new jd(param1, param3, param2, param5, var9, var9, var10, 0, 0, (ha) (this), 0, 0, -1, false, 0);
                    this.a(8288, var11);
                    if ((var11.g(0) ^ -1) != -5) {
                        statePc = 10;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!re.a(0, (byte) -98)) {
                        statePc = 42;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (this.field_b) {
                        statePc = 13;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (param2 == 19) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (-22 == (param2 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (param2 == 20) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (0 == param2) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_Db = this.field_Db | 1 << param5;
                    if (var16 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if ((1 << param5 & this.field_Db) != 0) {
                        statePc = 42;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (0 == (1 << param5 & this.field_I)) {
                        statePc = 22;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var12 = 0;
                    if (param2 != 19) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var12 = var12 | 1;
                    if (var16 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (-22 == (param2 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (20 != param2) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = var12 | 4;
                    if (var16 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var12 = var12 | 2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var13_ref_jd = (jd) ((Object) this.field_t[param5].e((byte) 89));
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var13_ref_jd == null) {
                        statePc = 39;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_40_0 = 19;
                    stackIn_31_0 = stackIn_40_0;
                    stackIn_40_1 = var13_ref_jd.field_N;
                    stackIn_31_1 = stackIn_40_1;
                    if (var16 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 == stackIn_31_1) {
                        statePc = 37;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var13_ref_jd.field_N == 21) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var13_ref_jd.field_N == 20) {
                        statePc = 35;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var12 = var12 | 4;
                    if (var16 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var12 = var12 | 2;
                    if (var16 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var12 = var12 | 1;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var13_ref_jd = (jd) ((Object) this.field_t[param5].a((byte) 123));
                    if (var16 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = -8;
                    stackIn_40_1 = var12 ^ -1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (stackIn_40_0 != stackIn_40_1) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_I = this.field_I | 1 << param5;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (-59 == (param2 ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var8 = ps.field_C[1];
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (-64 == (param2 ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var8 = ps.field_C[0];
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if ((param2 ^ -1) == -60) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (param2 == 53) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (param2 == 43) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var8 = 1;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if ((var8 ^ -1) < -1) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.a(param3, param1, 0, 3);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (!param0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                case 58: {
                    this.field_H[param5] = this.field_H[param5] - bw.field_m[param2][8];
                    if (!this.field_b) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    this.field_ub[param5] = this.field_ub[param5] + bw.field_m[param2][8];
                    this.d(param5, this.field_ub[param5], 106, 10);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var12 = bw.field_m[param2][2];
                    var13 = bw.field_m[param2][1];
                    var14 = this.field_Eb[this.field_v * param3 + param1];
                    if (var13 != -1) {
                        statePc = 65;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var12 != this.field_E[param5][6]) {
                        statePc = 82;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if ((this.field_E[param5][6] ^ -1) > -6) {
                        statePc = 64;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 64: {
                    this.b(6, param5, 1, (byte) 92);
                    if (var16 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    this.field_U[param5] = oe.c(this.field_U[param5], 1 << var13);
                    if (7 != var14.field_h) {
                        statePc = 75;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var12 != this.field_E[param5][var13]) {
                        statePc = 75;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var15 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (6 <= var15) {
                        statePc = 75;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_76_0 = var15 ^ -1;
                    stackIn_70_0 = stackIn_76_0;
                    stackIn_76_1 = var13 ^ -1;
                    stackIn_70_1 = stackIn_76_1;
                    if (var16 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (stackIn_70_0 != stackIn_70_1) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (5 > this.field_E[param5][var15]) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    this.b(var15, param5, 1, (byte) 92);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_76_0 = 11;
                    stackIn_76_1 = var14.field_h;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (stackIn_76_0 != stackIn_76_1) {
                        statePc = 82;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((var13 ^ -1) != (var14.field_g ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((var12 ^ -1) != (var14.field_j ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (-6 < (var14.field_j ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var14.field_j = var14.field_j + 1;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (this.field_b) {
                        statePc = 84;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.field_Y[param5] = this.field_Y[param5] + 1;
                    this.d(param5, this.field_t[param5].b(false), param4 ^ 104, 13);
                    this.d(param5, this.field_Y[param5], 119, 5);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean i(int param0) {
        int var2;
        int var3;
        int stackIn_14_0 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_V) {
          var2 = param0;
          L0: while (true) {
            L1: {
              if (var2 >= this.field_tb) {
                break L1;
              } else {
                stackIn_14_0 = var2;

                if (var3 != 0) {
                  return stackIn_14_0 != 0;
                } else {
                  if (stackIn_14_0 < 0) {
                    return false;
                  } else {
                    if (var2 < this.field_fb.length) {
                      if ((this.i(var2, param0 + -12710) ^ -1) <= (this.field_xb ^ -1)) {
                        return true;
                      } else {
                        var2++;
                        if (var3 == 0) {
                          continue L0;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            return this.c((byte) 51);
          }
        } else {
          return false;
        }
    }

    private final int f(byte param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          if (this.field_s == null) {
            break L0;
          } else {
            if ((this.field_s.length ^ -1) != -4) {
              break L0;
            } else {
              if (param0 <= -65) {
                var2 = 2 * this.field_O / 3;
                var3 = 50 * this.field_s[0] * var2;
                var3 = var3 + 75 * var2 * this.field_s[1];
                var3 = var3 + this.field_s[2] * var2 * 25;
                if (-2 > (this.field_O ^ -1)) {
                  var4 = var3 / this.field_tb;
                  var4 = var4 / 500 * 500 + 500;
                  return var4;
                } else {
                  return 0;
                }
              } else {
                return 72;
              }
            }
          }
        }
        return 0;
    }

    final boolean a(int param0, int param1, int param2, jd param3) {
        ne var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-1 < (param2 ^ -1)) {
                break L1;
              } else {
                if (param0 < 0) {
                  break L1;
                } else {
                  if ((param2 ^ -1) <= (this.field_v ^ -1)) {
                    break L1;
                  } else {
                    if ((this.field_db ^ -1) <= (param0 ^ -1)) {
                      L2: {
                        if (param1 == -26633) {
                          break L2;
                        } else {
                          this.field_N = (int[]) null;
                          break L2;
                        }
                      }
                      var5 = this.field_Eb[param2 + this.field_v * param0];
                      if (null == var5.field_c) {
                        stackIn_12_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        if (!this.c(var5.field_c.field_O, -16985, param3.field_O)) {
                          stackIn_17_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          stackIn_15_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5_ref);

            stackIn_20_1 = new StringBuilder().append("ha.JD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final void a(int param0, ne param1) {
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
              if (null == param1.field_c) {
                break L1;
              } else {
                if (param1.c(-32)) {
                  param1.i(param0 + 114);
                  if (-100 < (param1.field_c.field_t ^ -1)) {
                    this.field_l.a((byte) -119, (tc) (new st(param1.field_c, 4)));
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -100) {
                break L2;
              } else {
                this.field_t = (at[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ha.AE(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= (this.field_S.length ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_S[var2] = this.field_fb[var2];
                    var2++;
                    if (var5 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2 = -74 % ((39 - param0) / 49);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((this.field_gb ^ -1) <= -1) {
                        statePc = 8;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if ((var3 ^ -1) <= (this.field_v ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((var4 ^ -1) <= (this.field_db ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_Eb[var3 + this.field_v * var4].a(var4, var3, this.field_gb, 0);
                    var4++;
                    if (var5 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var5 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var3++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var5 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int b(int param0, int param1, int param2) {
        if (param2 != -4) {
            field_q = (String) null;
        }
        int var3 = param0;
        if (nv.c(0, param1) && -4 == (param0 ^ -1)) {
            var3 = 3;
        }
        return var3;
    }

    final void b(int param0, boolean param1, int param2, int param3, int param4) {
        ne stackIn_8_0 = null;
        ne stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ne var6;
        int var7;
        int var8;
        ne var9;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if ((param4 ^ -1) > -1) {
          return;
        } else {
          L0: {
            if ((param4 ^ -1) <= (this.field_db ^ -1)) {
              break L0;
            } else {
              if (-1 < (param0 ^ -1)) {
                break L0;
              } else {
                if ((this.field_v ^ -1) < (param0 ^ -1)) {
                  L1: {
                    var9 = this.field_Eb[param0 - -(this.field_v * param4)];
                    var6 = var9;
                    stackIn_8_0 = (ne) (var6);

                    if (!param1) {
                      stackIn_9_0 = (ne) ((Object) stackIn_8_0);
                      stackIn_9_1 = 0;
                      break L1;
                    } else {
                      stackIn_9_0 = (ne) ((Object) stackIn_8_0);
                      stackIn_9_1 = 1;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              L8: {
                                L9: {
                                  L10: {
                                    L11: {
                                      stackIn_9_0.field_b = stackIn_9_1 != 0;
                                      var7 = param2;
                                      if (14 != var7) {
                                        break L11;
                                      } else {
                                        if (var8 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (var7 != 9) {
                                        break L12;
                                      } else {
                                        if (var8 == 0) {
                                          break L10;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if ((var7 ^ -1) == -5) {
                                      break L9;
                                    } else {
                                      L13: {
                                        if (3 != var7) {
                                          break L13;
                                        } else {
                                          if (var8 == 0) {
                                            break L8;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      if ((var7 ^ -1) == -6) {
                                        break L7;
                                      } else {
                                        if (-1 == (var7 ^ -1)) {
                                          break L6;
                                        } else {
                                          if (1 == var7) {
                                            break L5;
                                          } else {
                                            if (var7 == 10) {
                                              break L4;
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (8 != var9.field_h) {
                                    break L2;
                                  } else {
                                    if (this.c(var9.field_a, -16985, param3)) {
                                      var7 = var9.e(10);
                                      var6.field_h = param2;
                                      var9.field_m = var9.field_m + (-var7 + var9.e(10));
                                      this.f(-2);
                                      this.b(2);
                                      if (var8 == 0) {
                                        break L3;
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                L14: {
                                  if (-2 == (var9.field_h ^ -1)) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if ((var9.field_h ^ -1) == -1) {
                                        break L15;
                                      } else {
                                        if (-4 == (var9.field_h ^ -1)) {
                                          break L15;
                                        } else {
                                          if (5 != var9.field_h) {
                                            break L3;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    var6.field_h = 4;
                                    if (var8 == 0) {
                                      break L3;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var6.field_h = 10;
                                if (var8 == 0) {
                                  break L3;
                                } else {
                                  break L8;
                                }
                              }
                              if (var9.field_h != 0) {
                                break L3;
                              } else {
                                var6.field_h = 3;
                                if (var8 == 0) {
                                  break L3;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L16: {
                              if (-1 == (var9.field_h ^ -1)) {
                                break L16;
                              } else {
                                if (var9.field_h == 3) {
                                  break L16;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            var6.field_h = 5;
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                          L17: {
                            if (-3 != (var9.field_h ^ -1)) {
                              break L17;
                            } else {
                              var6.field_h = 0;
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (12 == var9.field_h) {
                            var6.field_h = 13;
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          } else {
                            break L2;
                          }
                        }
                        L18: {
                          if (-1 == (var9.field_h ^ -1)) {
                            break L18;
                          } else {
                            if (var9.field_h == 3) {
                              break L18;
                            } else {
                              if ((var9.field_h ^ -1) == -6) {
                                break L18;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        var6.field_h = 1;
                        if (var8 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L19: {
                        L20: {
                          if (-7 == (var9.field_h ^ -1)) {
                            break L20;
                          } else {
                            if (4 != var9.field_h) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var6.field_h = 10;
                        break L19;
                      }
                      if (-6 == (var9.field_h ^ -1)) {
                        var6.field_h = 1;
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                    break L2;
                  }
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final boolean b(int param0, boolean param1) {
        if (!(!this.field_f)) {
            return false;
        }
        if (!(this.field_P.a((byte) -88, param0))) {
            return false;
        }
        if (!param1) {
            this.field_vb = 102;
        }
        this.b(10001, param0, false);
        return true;
    }

    final at f(int param0, int param1) {
        if (null == this.field_t) {
            return null;
        }
        if (0 > param0) {
            return null;
        }
        if ((param0 ^ -1) <= (this.field_t.length ^ -1)) {
            return null;
        }
        if (param1 != 0) {
            this.field_fb = (int[]) null;
        }
        return this.field_t[param0];
    }

    private final void b(int[] param0, int param1, int param2, int param3) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        if (param1 == 12534) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a((vh) null, (byte) -4);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((this.field_tb ^ -1) >= (var5_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param0[var5_int] = 0;
                        var5_int++;
                        if (var10 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var10 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5_int = -3;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = var5_int ^ -1;
                        stackIn_10_1 = -4;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 < stackIn_10_1) {
                            statePc = 61;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var10 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = -3;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (3 < var6) {
                            statePc = 55;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = Math.abs(var5_int) - -Math.abs(var6);
                        stackIn_10_0 = -1;
                        stackIn_15_0 = stackIn_10_0;
                        stackIn_10_1 = param3 + var5_int ^ -1;
                        stackIn_15_1 = stackIn_10_1;
                        if (var10 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 < stackIn_15_1) {
                            statePc = 54;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((param3 + var5_int ^ -1) <= (this.field_v ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var6 - -param2 ^ -1) > -1) {
                            statePc = 54;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var6 + param2 ^ -1) <= (this.field_db ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = this.field_Eb[this.field_v * (param2 + var6) + param3 + var5_int].field_c;
                        if (var8 != null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var10 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 = this.o(var8.field_O, param1 + -12535);
                        if ((var8.field_N ^ -1) != -60) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!var8.field_F) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_26_0 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 + ps.field_C[2] < var7) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        param0[var9] = oe.c(param0[var9], 4);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var8.field_N != 53) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_31_0 = var7 ^ -1;
                        stackIn_30_0 = stackIn_31_0;
                        if (var8.field_F) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_32_0 = stackIn_30_0;
                        stackIn_32_1 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = stackIn_31_0;
                        stackIn_32_1 = 1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 >= (stackIn_32_1 + ps.field_C[3] ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param0[var9] = oe.c(param0[var9], 8);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var8.field_N != 43) {
                            statePc = 42;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_38_0 = var7;
                        stackIn_37_0 = stackIn_38_0;
                        if (!var8.field_F) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_39_0 = stackIn_37_0;
                        stackIn_39_1 = 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = stackIn_38_0;
                        stackIn_39_1 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 > stackIn_39_1 + ps.field_C[4]) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (0 >= var7) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        param0[var9] = oe.c(param0[var9], 16);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var8.field_N != 63) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_45_0 = ps.field_C[0];
                        stackIn_44_0 = stackIn_45_0;
                        if (var8.field_F) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_46_0 = stackIn_44_0;
                        stackIn_46_1 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = stackIn_45_0;
                        stackIn_46_1 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((stackIn_46_0 - -stackIn_46_1 ^ -1) > (var7 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        param0[var9] = oe.c(param0[var9], 1);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (58 != var8.field_N) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_51_0 = ps.field_C[1];
                        stackIn_50_0 = stackIn_51_0;
                        if (!var8.field_F) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_52_0 = stackIn_50_0;
                        stackIn_52_1 = 1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = stackIn_51_0;
                        stackIn_52_1 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((stackIn_52_0 - -stackIn_52_1 ^ -1) > (var7 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param0[var9] = oe.c(param0[var9], 2);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var6++;
                        if (var10 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var5_int++;
                        if (var10 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_59_0 = (RuntimeException) (var5);
                    stackIn_58_0 = stackIn_59_0;
                    stackIn_59_1 = new StringBuilder().append("ha.LA(");
                    stackIn_58_1 = stackIn_59_1;
                    if (param0 == null) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_60_2 = "{...}";
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_60_2 = "null";
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw ig.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 61: {
                    return;
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        jd var8;
        L0: {
          var8 = this.c(param3, true, param2);
          if (param0 < -117) {
            break L0;
          } else {
            this.field_mb = (int[]) null;
            break L0;
          }
        }
        L1: {
          if (var8 == null) {
            break L1;
          } else {
            if (this.c(var8.field_O, -16985, param4)) {
              L2: {
                if (!var8.a(23072)) {
                  break L2;
                } else {
                  if (param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var8.field_Y = var8.field_Y + param5;
                if (!this.field_b) {
                  break L3;
                } else {
                  this.field_ob[param4] = this.field_ob[param4] + param5;
                  break L3;
                }
              }
              if (var8.field_t >= var8.field_Y) {
                break L1;
              } else {
                var8.field_Y = var8.field_t;
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
    }

    final void a(byte param0, ik param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_f) {
                  break L2;
                } else {
                  if ((param2 ^ -1) >= 0) {
                    break L2;
                  } else {
                    stackIn_4_0 = 1;
                    break L1;
                  }
                }
              }
              stackIn_4_0 = 0;
              break L1;
            }
            L3: {
              var5_int = stackIn_4_0;
              if (this.field_K == null) {
                break L3;
              } else {
                if ((param3 ^ -1) == (this.field_K.field_w ^ -1)) {
                  break L3;
                } else {
                  var5_int = 0;
                  break L3;
                }
              }
            }
            L4: {
              if (param0 == -49) {
                break L4;
              } else {
                this.b(-42, true, -106, -92, 114);
                break L4;
              }
            }
            L5: {
              if (var5_int == 0) {
                break L5;
              } else {
                this.field_B[param3][param2] = -1;
                this.field_m[param3] = this.field_m[param3] - uc.field_d[param1.field_c][0];
                break L5;
              }
            }
            this.field_J = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("ha.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean h(int param0) {
        int var2 = this.field_Fb ? 1 : 0;
        this.field_Fb = false;
        if (param0 != -293) {
            this.field_ib = 1;
        }
        return var2 != 0;
    }

    final void b(int param0, int param1, int param2, byte param3) {
        int[] dupTemp$1 = null;
        L0: {
          if ((param1 ^ -1) > -1) {
            break L0;
          } else {
            if (param1 >= this.field_E.length) {
              return;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if ((param0 ^ -1) > (this.field_E[param1].length ^ -1)) {
                  L1: {
                    dupTemp$1 = this.field_E[param1];
                    dupTemp$1[param0] = dupTemp$1[param0] + param2;
                    if (this.field_E[param1][param0] > 5) {
                      this.field_E[param1][param0] = 5;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (param3 == 92) {
                    if (param0 == -1) {
                      return;
                    } else {
                      L2: {
                        if (this.field_E[param1][param0] > this.field_E[param1][6]) {
                          this.field_E[param1][6] = this.field_E[param1][param0];
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final String[] e(int param0) {
        if (param0 != 26524) {
            this.field_qb = true;
        }
        return this.field_P.a(param0 ^ 26524);
    }

    private final void a(int param0, vh param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            var3_int = param1.k(param0 + 30531);
            var4 = param1.k(0);
            var5 = param1.k(0);
            var6 = 7 & var3_int;
            if (param0 != -30531) {
                this.a(103, false, (int[]) null);
            }
            var7 = (var3_int & 31) >> -1570697245;
            this.field_l.a((byte) -119, (tc) (new qq(var7, var4, var5, var6)));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.GD(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, gn param1, int param2) {
        int stackIn_9_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1.a(new String[]{this.e(param0, param2 + 3395), ": "}, (byte) -124);
            param1.a(0, 2);
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int >= this.field_c[param0].length) {
                    break L3;
                  } else {
                    var5 = this.field_c[param0][var4_int];
                    stackIn_9_0 = var5;

                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_9_0 >= 0) {
                          param1.a(new String[]{"god: ", wf.field_q[var5 + 1], " level: ", Integer.toString(this.field_E[param0][var5])}, (byte) -57);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                param1.a(new String[]{"mana: ", Integer.toString(this.field_H[param0]), ", collected: ", Integer.toString(this.field_fb[this.field_yb[param0]])}, (byte) -49);
                param1.a(new String[]{"turns: ", Integer.toString(this.field_mb[param0])}, (byte) -102);
                stackIn_9_0 = lf.field_i[this.field_Q] ^ -1;
                break L2;
              }
              L5: {
                if (stackIn_9_0 != -1) {
                  param1.a(new String[]{"rune cap remaining: ", Integer.toString(this.field_m[param0])}, (byte) -62);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                param1.a(0, -2);
                if (param2 == -3396) {
                  break L6;
                } else {
                  this.a(91, true);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ha.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    final int a(jd param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.a(param0.field_J - -(param0.field_w * this.field_v), -4, param0);
              if (((param2 | hh.field_e[param0.field_P]) ^ -1) != (hh.field_e[param0.field_P] ^ -1)) {
                break L1;
              } else {
                var5_int = var5_int - param0.field_o * 10;
                break L1;
              }
            }
            L2: {
              if (param1 <= -111) {
                break L2;
              } else {
                this.field_eb = false;
                break L2;
              }
            }
            stackIn_5_0 = var5_int * param3 / 100;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ha.L(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final boolean b(int param0, byte param1) {
        int var3;
        int var4;
        int stackIn_17_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -26) {
          var3 = 0;
          L0: while (true) {
            L1: {
              if ((this.field_v * this.field_db ^ -1) >= (var3 ^ -1)) {
                break L1;
              } else {
                stackIn_17_0 = this.field_Eb[var3].field_a ^ -1;

                if (var4 != 0) {
                  return stackIn_17_0 != 0;
                } else {
                  L2: {
                    L3: {
                      if (stackIn_17_0 == (param0 ^ -1)) {
                        break L3;
                      } else {
                        if (null != this.field_K) {
                          break L2;
                        } else {
                          if (!this.c(this.field_Eb[var3].field_a, -16985, param0)) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (this.field_Eb[var3].field_h != 7) {
                      if ((this.field_Eb[var3].field_h ^ -1) != -12) {
                        break L2;
                      } else {
                        if ((this.field_E[param0][this.field_Eb[var3].field_g] ^ -1) < -1) {
                          return true;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      return true;
                    }
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, boolean param1) {
        jd var3_ref_jd = null;
        int var3 = 0;
        jd var4 = null;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_34_0 = 0;
        boolean stackOut_24_0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (param1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    var3_ref_jd = (jd) ((Object) this.field_t[param0].e((byte) 116));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3_ref_jd == null) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_13_0 = var3_ref_jd.i(-21428);
                    stackIn_5_0 = stackIn_13_0;
                    if (var5 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (!var3_ref_jd.k((byte) 116)) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (!var3_ref_jd.field_S) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return true;
                }
                case 11: {
                    var3_ref_jd = (jd) ((Object) this.field_t[param0].a((byte) 123));
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = this.field_wb;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (!stackIn_13_0) {
                        statePc = 33;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null == this.field_K) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return false;
                }
                case 16: {
                    var3 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = this.field_W;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 <= var3) {
                        statePc = 33;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_34_0 = var3;
                    stackIn_20_0 = stackIn_34_0;
                    if (var5 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 == param0) {
                        statePc = 32;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (!this.c(var3, -16985, param0)) {
                        statePc = 32;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var4 = (jd) ((Object) this.field_t[var3].e((byte) 99));
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var4 == null) {
                        statePc = 32;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = var4.i(-21428);
                    stackIn_18_0 = stackOut_24_0 ? 1 : 0;
                    stackIn_25_0 = stackOut_24_0;
                    if (var5 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (!var4.k((byte) 90)) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (!var4.field_S) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return true;
                }
                case 31: {
                    var4 = (jd) ((Object) this.field_t[var3].a((byte) 123));
                    if (var5 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var3++;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return false;
                }
                case 34: {
                    return stackIn_34_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4) {
        ne var6;
        L0: {
          if (0 > param2) {
            break L0;
          } else {
            if (0 > param3) {
              break L0;
            } else {
              if ((this.field_v ^ -1) >= (param2 ^ -1)) {
                break L0;
              } else {
                if (this.field_db <= param3) {
                  break L0;
                } else {
                  var6 = this.field_Eb[param2 + this.field_v * param3];
                  if (null == var6.field_c) {
                    return false;
                  } else {
                    if (param0 >= (param4 ^ -1)) {
                      if (this.c(var6.field_c.field_O, -16985, param4)) {
                        return true;
                      } else {
                        return param1;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final int[] a(int param0, byte param1, int param2, int param3) {
        int[] var5 = null;
        ne var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var9 = new int[7];
                    var5 = var9;
                    var6 = this.field_Eb[param2 + param0 * this.field_v];
                    if (7 != var6.field_h) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (!this.c(var6.field_a, -16985, param3)) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var7 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-8 >= (var7 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var9[var7] = this.field_E[param3][var7];
                    var7++;
                    if (var8 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var8 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-12 != (var6.field_h ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (!this.c(var6.field_a, -16985, param3)) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((var9[var6.field_g] ^ -1) > (var6.field_j ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var9[var6.field_g] = var6.field_j;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param1 >= 8) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return (int[]) null;
                }
                case 14: {
                    return var9;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(boolean param0, int param1) {
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        jd var6 = null;
        int var7 = 0;
        ne var8_ref_ne = null;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var3 = this.field_jb;
                    if (this.field_Bb) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = var3 ^ 313485252;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var3 = var3 ^ this.field_cb * 137;
                    var3 = var3 ^ 783246 * this.field_hb;
                    var3 = var3 ^ this.field_Q * 545542;
                    if (param1 >= 0) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var3 = var3 ^ this.n(param1, -111) * (7 * param1 - -11);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var4 = param1;
                    if (0 <= var4) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_ib = -38;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var5 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (this.field_v <= var5) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_21_0 = 0;
                    stackIn_13_0 = stackIn_21_0;
                    if (var9 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var6_int = stackIn_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((this.field_db ^ -1) >= (var6_int ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = this.field_v * var6_int + var5;
                    var8_ref_ne = this.field_Eb[var7];
                    var3 = var3 ^ this.a((byte) 103, var4, var8_ref_ne) * (var7 * 3 + 351);
                    var6_int++;
                    if (var9 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var9 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var9 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var5 = stackIn_21_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((var5 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var6 = (jd) ((Object) this.field_t[var5].e((byte) 101));
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var6 == null) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var7 = var6.field_J;
                    var8 = var6.field_w;
                    var3 = var3 ^ this.b(-125, var6) * (var7 + 372) * (var8 + 723);
                    var6 = (jd) ((Object) this.field_t[var5].a((byte) 123));
                    if (var9 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var9 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5++;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var9 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void g(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        Object stackIn_8_0 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -36 % ((-50 - param1) / 62);
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_W <= var4) {
                break L2;
              } else {
                stackIn_8_0 = this;

                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    if ((((ha) (this)).field_e & 1 << var4) != (1 << var4 & param0)) {
                      this.b(10001, var4, false);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_8_0 = this;
            break L1;
          }
          ((ha) (this)).field_e = param0;
          return;
        }
    }

    final void c(int param0, int param1, int param2, byte param3) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        int[] dupTemp$4 = null;
        int[] dupTemp$5 = null;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        jd var10;
        ne var11;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-1 >= param2) {
            break L0;
          } else {
            var10 = this.c(param0, true, param1);
            if (var10 == null) {
              break L0;
            } else {
              if (1 != var10.field_ab) {
                break L0;
              } else {
                var10.field_ab = 0;
                break L0;
              }
            }
          }
        }
        L1: {
          var11 = this.field_Eb[param1 + param0 * this.field_v];
          var6 = var11.field_a;
          if (var6 <= -1) {
            break L1;
          } else {
            L2: {
              L3: {
                L4: {
                  var7 = var11.field_h;
                  if (-8 != (var7 ^ -1)) {
                    break L4;
                  } else {
                    if (var9 == 0) {
                      dupTemp$0 = this.field_z[this.field_yb[var6]];
                      dupTemp$0[0] = dupTemp$0[0] - 1;
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                if (-15 == (var7 ^ -1)) {
                  break L3;
                } else {
                  L5: {
                    if (var7 != 9) {
                      break L5;
                    } else {
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if ((var7 ^ -1) == -9) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              dupTemp$1 = this.field_z[this.field_yb[var6]];
              dupTemp$1[1] = dupTemp$1[1] - 1;
              if (var9 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
            dupTemp$2 = this.field_z[this.field_yb[var6]];
            dupTemp$2[2] = dupTemp$2[2] - 1;
            break L1;
          }
        }
        L6: {
          L7: {
            L8: {
              L9: {
                var11.a(-104, param2);
                var7 = var11.field_h;
                if (var7 == 7) {
                  break L9;
                } else {
                  if (-15 == (var7 ^ -1)) {
                    break L8;
                  } else {
                    L10: {
                      if ((var7 ^ -1) != -10) {
                        break L10;
                      } else {
                        if (var9 == 0) {
                          break L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if ((var7 ^ -1) != -9) {
                      break L6;
                    } else {
                      if (var9 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              dupTemp$3 = this.field_z[this.field_yb[param2]];
              dupTemp$3[0] = dupTemp$3[0] + 1;
              if (var9 == 0) {
                break L6;
              } else {
                break L8;
              }
            }
            dupTemp$4 = this.field_z[this.field_yb[param2]];
            dupTemp$4[1] = dupTemp$4[1] + 1;
            if (var9 == 0) {
              break L6;
            } else {
              break L7;
            }
          }
          dupTemp$5 = this.field_z[this.field_yb[param2]];
          dupTemp$5[2] = dupTemp$5[2] + 1;
          break L6;
        }
        L11: {
          if (param3 == -115) {
            break L11;
          } else {
            this.field_U = (int[]) null;
            break L11;
          }
        }
        L12: {
          if (!this.field_b) {
            break L12;
          } else {
            if (!this.field_wb) {
              this.d(param2, this.field_z[this.field_yb[param2]][1] + (this.field_z[this.field_yb[param2]][0] + this.field_z[this.field_yb[param2]][2]), 102, 0);
              var7 = -1 + this.field_W;
              var8 = 0;
              L13: while (true) {
                L14: {
                  L15: {
                    if (0 <= (this.field_n[var8] ^ -1)) {
                      break L15;
                    } else {
                      stackIn_43_0 = this.field_W ^ -1;

                      stackIn_43_1 = var8 ^ -1;

                      if (var9 != 0) {
                        break L14;
                      } else {
                        if (stackIn_43_0 >= stackIn_43_1) {
                          break L15;
                        } else {
                          var7--;
                          var8++;
                          if (var9 == 0) {
                            continue L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                  }
                  stackIn_43_0 = var7;
                  stackIn_43_1 = -1;
                  break L14;
                }
                L16: {
                  if (stackIn_43_0 <= stackIn_43_1) {
                    break L16;
                  } else {
                    if ((this.field_p[var7] ^ -1) != (var6 ^ -1)) {
                      break L16;
                    } else {
                      this.field_y[param2] = this.field_y[param2] + 1;
                      this.d(param2, this.field_y[param2], 104, 15);
                      break L16;
                    }
                  }
                }
                if ((this.field_p[0] ^ -1) != (var6 ^ -1)) {
                  break L12;
                } else {
                  this.field_M[param2] = this.field_M[param2] + 1;
                  this.d(param2, this.field_M[param2], param3 ^ -18, 14);
                  break L12;
                }
              }
            } else {
              break L12;
            }
          }
        }
        L17: {
          if (!var11.k(12)) {
            break L17;
          } else {
            this.b(param3 + 10116, var6, false);
            var11.d((byte) 61);
            break L17;
          }
        }
        L18: {
          if (this.field_K == null) {
            break L18;
          } else {
            if (0 == (var6 ^ -1)) {
              break L18;
            } else {
              this.b(var6, true);
              break L18;
            }
          }
        }
        this.a(1);
    }

    final void g(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (param3 == -9513) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.b(-46, 97, true);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((var5 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var7 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var6 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var6 >= 6) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_E[var5][param1] = 1;
                    this.field_E[var5][param2] = 1;
                    this.field_E[var5][param0] = 1;
                    this.field_c[var5][0] = param1;
                    this.field_c[var5][1] = param2;
                    this.field_c[var5][2] = param0;
                    var6++;
                    if (var7 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5++;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var7 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void j(int param0) {
        if (param0 != 7) {
            this.field_Bb = true;
            return;
        }
    }

    final int[] a(jd param0, int param1, byte param2, int param3, jd param4, int param5, int param6) {
        int[] stackIn_7_0 = null;
        int[] stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        int[] stackIn_80_0 = null;
        int[] stackIn_97_0 = null;
        int[] stackIn_108_0 = null;
        int[] stackIn_133_0 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        StringBuilder stackIn_139_1 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jd var8 = null;
        RuntimeException var8_ref = null;
        jd var9 = null;
        int[] var10 = null;
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
        jd var23 = null;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var23 = param4;
              var8 = var23;
              if (param2 <= -119) {
                break L1;
              } else {
                this.field_u = 42;
                break L1;
              }
            }
            L2: {
              var9 = param0;
              var10 = new int[]{0, 0, 0};
              if (var8 == null) {
                break L2;
              } else {
                if (var9 == null) {
                  break L2;
                } else {
                  L3: {
                    var11 = var23.field_N;
                    if (-35 != (var11 ^ -1)) {
                      break L3;
                    } else {
                      if (var23.field_W) {
                        var11 = 75;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var23.j((byte) 80)) {
                      break L4;
                    } else {
                      if (var9.x(-96)) {
                        stackIn_16_0 = (int[]) (var10);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var12 = Math.abs(param5) + Math.abs(param3);
                    var13 = 32;
                    var14 = 32;
                    var15 = 0;
                    var16 = 0;
                    if ((var12 ^ -1) != -2) {
                      stackIn_20_0 = 0;
                      break L5;
                    } else {
                      stackIn_20_0 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      var17 = stackIn_20_0;
                      if (var17 != 0) {
                        break L7;
                      } else {
                        L8: {
                          L9: {
                            if (34 != var23.field_N) {
                              break L9;
                            } else {
                              if (var23.field_W) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var23.field_N == 81) {
                              break L10;
                            } else {
                              if (-5 == (var23.field_N ^ -1)) {
                                break L10;
                              } else {
                                if ((var23.field_N ^ -1) == -75) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var23.g(0) == 3) {
                                      break L11;
                                    } else {
                                      var13 = 2;
                                      if (-2 != (var23.j(20640) ^ -1)) {
                                        break L6;
                                      } else {
                                        var15 = var23.d(0, 80);
                                        if (var22 == 0) {
                                          break L6;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (-3 == (var23.j(20640) ^ -1)) {
                                      var15 = var23.d(0, 58);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  var13 = 4;
                                  if (var22 == 0) {
                                    break L6;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                          var13 = 8;
                          if ((var23.j(20640) ^ -1) != -4) {
                            break L6;
                          } else {
                            var15 = var23.d(0, 106);
                            if (var22 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var13 = 8;
                        if (var23.j(20640) == 3) {
                          var15 = var23.d(0, 118);
                          if (var22 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    L13: {
                      if ((var23.field_N ^ -1) != -35) {
                        break L13;
                      } else {
                        if (!var23.field_W) {
                          break L13;
                        } else {
                          var13 = 8;
                          if ((var23.j(20640) ^ -1) == -4) {
                            var15 = var23.d(0, 55);
                            if (var22 == 0) {
                              break L6;
                            } else {
                              break L13;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L14: {
                      if (!var23.x(-126)) {
                        break L14;
                      } else {
                        L15: {
                          if ((var23.j(20640) ^ -1) != -5) {
                            break L15;
                          } else {
                            var15 = var23.d(0, -95);
                            break L15;
                          }
                        }
                        var13 = 16;
                        if (var22 == 0) {
                          break L6;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (-4 != (var23.g(0) ^ -1)) {
                        break L16;
                      } else {
                        var13 = 4;
                        if ((var23.j(20640) ^ -1) == -3) {
                          var15 = var23.d(0, -102);
                          if (var22 == 0) {
                            break L6;
                          } else {
                            break L16;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    var13 = 1;
                    if (0 == var23.j(20640)) {
                      var15 = var23.d(0, -93);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L17: {
                    if (var17 == 0) {
                      break L17;
                    } else {
                      L18: {
                        L19: {
                          if ((var9.field_N ^ -1) != -35) {
                            break L19;
                          } else {
                            if (var9.field_W) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          if (!var9.x(-109)) {
                            break L20;
                          } else {
                            var14 = 16;
                            if (-5 == (var9.j(20640) ^ -1)) {
                              var16 = var9.d(0, 122);
                              if (var22 == 0) {
                                break L17;
                              } else {
                                break L20;
                              }
                            } else {
                              break L17;
                            }
                          }
                        }
                        L21: {
                          if (3 != var9.g(0)) {
                            break L21;
                          } else {
                            L22: {
                              if (-3 == (var9.j(20640) ^ -1)) {
                                var16 = var9.d(0, 69);
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            var14 = 4;
                            if (var22 == 0) {
                              break L17;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L23: {
                          if (-1 == (var9.j(20640) ^ -1)) {
                            var16 = var9.d(0, -123);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        var14 = 1;
                        if (var22 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                      L24: {
                        if (var9.j(20640) == 3) {
                          var16 = var9.d(0, 116);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      var14 = 8;
                      break L17;
                    }
                  }
                  L25: {
                    if ((var11 ^ -1) > -1) {
                      break L25;
                    } else {
                      if ((bw.field_m.length ^ -1) >= (var11 ^ -1)) {
                        break L25;
                      } else {
                        L26: {
                          L27: {
                            L28: {
                              L29: {
                                var18 = param4.B(3257);
                                var19 = param4.l((byte) -79);
                                if (-82 == (param4.field_N ^ -1)) {
                                  break L29;
                                } else {
                                  if (4 == param4.field_N) {
                                    break L29;
                                  } else {
                                    if (-75 != (param4.field_N ^ -1)) {
                                      break L28;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                              if (-4 == (param4.j(20640) ^ -1)) {
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                            L30: {
                              L31: {
                                if (param4.g(0) != 3) {
                                  break L31;
                                } else {
                                  if (param4.j(20640) == 2) {
                                    break L30;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              if (param4.g(0) != 2) {
                                break L26;
                              } else {
                                if (1 != param4.j(20640)) {
                                  break L26;
                                } else {
                                  var18 = var18 + param4.d(1, 117);
                                  if (var22 == 0) {
                                    break L26;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                            var18 = var18 + param4.d(1, -124);
                            if (var22 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                          var18 = var18 + param4.d(1, -87);
                          break L26;
                        }
                        if ((var12 ^ -1) >= (var18 ^ -1)) {
                          L32: {
                            L33: {
                              var20 = 0;
                              var21 = 0;
                              if (var12 < var19) {
                                break L33;
                              } else {
                                L34: {
                                  var20 = this.a(var9, (byte) -123, var13, this.a(param1, 0, param6, var9, var23, (byte) -128) - -var15);
                                  if (var20 == 0) {
                                    var20 = 1;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                L35: {
                                  if (255 >= var20) {
                                    break L35;
                                  } else {
                                    var20 = 255;
                                    break L35;
                                  }
                                }
                                var10[0] = var20;
                                if (var22 == 0) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            if (var12 > 1) {
                              stackIn_108_0 = (int[]) (var10);
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              break L32;
                            }
                          }
                          L36: {
                            if (var17 == 0) {
                              break L36;
                            } else {
                              L37: {
                                if (var20 < var9.field_A + var9.field_Y) {
                                  break L37;
                                } else {
                                  if ((param0.field_P ^ -1) == -8) {
                                    break L37;
                                  } else {
                                    if (8 != param0.field_P) {
                                      break L36;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                              }
                              L38: {
                                L39: {
                                  var19 = bw.field_m[var9.field_N][6];
                                  if ((var19 ^ -1) >= -2) {
                                    break L39;
                                  } else {
                                    var21 = this.a(var8, (byte) -123, var14, this.a(param1 - -param3, var20, param6 - -param5, var23, var9, (byte) -128) * 3 / 20 + var16);
                                    if (var22 == 0) {
                                      break L38;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                                var21 = this.a(var8, (byte) -125, var14, this.a(param1 - -param3, var20, param5 + param6, var23, var9, (byte) -128) + var16);
                                if ((var21 ^ -1) != -1) {
                                  break L38;
                                } else {
                                  var21 = 1;
                                  break L38;
                                }
                              }
                              L40: {
                                if (-256 > (var21 ^ -1)) {
                                  var21 = 255;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              var10[1] = var21;
                              break L36;
                            }
                          }
                          L41: {
                            if (var23.field_A + var23.field_Y > var21) {
                              break L41;
                            } else {
                              if (param4.field_P == 7) {
                                break L41;
                              } else {
                                if (-9 != (param4.field_P ^ -1)) {
                                  var10[2] = oe.c(var10[2], 1);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                          L42: {
                            if (var20 < var9.field_Y + var9.field_A) {
                              break L42;
                            } else {
                              if (7 == param0.field_P) {
                                break L42;
                              } else {
                                if ((param0.field_P ^ -1) != -9) {
                                  var10[2] = oe.c(var10[2], 2);
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            }
                          }
                          stackIn_133_0 = (int[]) (var10);
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_97_0 = (int[]) (var10);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_80_0 = (int[]) (var10);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
            stackIn_7_0 = (int[]) (var10);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L43: {
            var8_ref = decompiledCaughtException;
            stackIn_136_0 = (RuntimeException) (var8_ref);

            stackIn_136_1 = new StringBuilder().append("ha.EC(");

            if (param0 == null) {
              stackIn_137_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackIn_137_1 = (StringBuilder) ((Object) stackIn_136_1);
              stackIn_137_2 = "null";
              break L43;
            } else {
              stackIn_137_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackIn_137_1 = (StringBuilder) ((Object) stackIn_136_1);
              stackIn_137_2 = "{...}";
              break L43;
            }
          }
          L44: {


            stackIn_139_1 = ((StringBuilder) (Object) stackIn_137_1).append(stackIn_137_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_137_0 = (RuntimeException) ((Object) stackIn_137_0);
              stackIn_140_1 = (StringBuilder) ((Object) stackIn_139_1);
              stackIn_140_2 = "null";
              break L44;
            } else {
              stackIn_137_0 = (RuntimeException) ((Object) stackIn_137_0);
              stackIn_140_1 = (StringBuilder) ((Object) stackIn_139_1);
              stackIn_140_2 = "{...}";
              break L44;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_137_0), stackIn_140_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_80_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_97_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_108_0;
                } else {
                  return stackIn_133_0;
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, jd param1, gn param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              param2.a(new String[]{"unit type: ", dn.field_Pb[param1.field_N].toLowerCase(), " at ", ci.c(param1.field_J, 0, param1.field_w)}, (byte) -120);
              param2.a(0, 2);
              param2.a(new String[]{"owner: ", this.e(param1.field_O, -1)}, (byte) -120);
              if (param1.field_I) {
                param2.a((byte) 19, "poisoned");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param1.field_W) {
                break L2;
              } else {
                param2.a((byte) 19, "deployed");
                break L2;
              }
            }
            L3: {
              if (!param1.field_s) {
                break L3;
              } else {
                param2.a((byte) 19, "moved");
                break L3;
              }
            }
            L4: {
              if (!param1.field_D) {
                break L4;
              } else {
                param2.a((byte) 19, "trinket used");
                break L4;
              }
            }
            L5: {
              param2.a((byte) 19, "attacksleft: " + param1.field_B);
              if (-1 == (param1.field_A ^ -1)) {
                break L5;
              } else {
                param2.a(new String[]{"bonus: ", Integer.toString(param1.field_A)}, (byte) -54);
                break L5;
              }
            }
            L6: {
              param2.a(new String[]{"strength: ", Integer.toString(param1.field_Y), "/", Integer.toString(param1.field_t)}, (byte) -105);
              param2.a(0, -2);
              if (!param0) {
                break L6;
              } else {
                this.a(-59, (byte) 114, 16, 49);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("ha.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L8;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    final boolean b(int param0, int param1) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.a(56, (String) null, (oj) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_e & 1 << param1) != 0) {
              break L2;
            } else {
              if (-1 == (this.field_u & 1 << param1 ^ -1)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final int a(int param0, int param1, boolean param2) {
        int var4 = -1;
        if (!((param1 ^ -1) > -1)) {
            var4 = this.o(param1, -1);
        }
        if (!param2) {
            this.field_hb = -93;
        }
        return this.field_Eb[param0].a((byte) 97, param1, var4);
    }

    private final int a(int param0, int param1, int param2, jd param3, jd param4, byte param5) {
        int discarded$0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-8 == (param3.field_P ^ -1)) {
                  break L2;
                } else {
                  if (-9 == (param3.field_P ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              param1 = 0;
              break L1;
            }
            L3: {
              var7_int = fk.field_d[param4.g(0)][param3.g(0)];
              if (param5 <= -127) {
                break L3;
              } else {
                discarded$0 = this.a((byte) -69, -60, (ne) null);
                break L3;
              }
            }
            L4: {
              if ((this.b(31, param0, param2, param4.field_O) & 16 ^ -1) == -1) {
                break L4;
              } else {
                var7_int = 90;
                break L4;
              }
            }
            L5: {
              if (!param4.n(116)) {
                break L5;
              } else {
                if (param3.x(-121)) {
                  var7_int = 90;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              var8 = var7_int * (param4.field_A + (param4.field_Y + -param1)) / 100;
              if ((var8 ^ -1) >= -1) {
                stackIn_15_0 = 0;
                break L6;
              } else {
                stackIn_15_0 = var8;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var7);

            stackIn_18_1 = new StringBuilder().append("ha.VC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param5 + ')');
        }
        return stackIn_15_0;
    }

    private final void a(int param0, int param1, vh param2, int param3) {
        int var5_int = 0;
        jd var6 = null;
        if (param1 >= -22) {
            return;
        }
        try {
            var5_int = param2.k(0);
            var6 = mb.a(var5_int, 0, param3, param0, param2, (ha) (this), -102, true);
            this.field_t[var6.field_O].a((byte) -119, (tc) (var6));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.WD(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String j(int param0, int param1) {
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ne var8 = null;
        int var9 = 0;
        gn var10 = null;
        jd var11 = null;
        gn var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var10 = new gn();
                    var12 = var10;
                    var10.a(new String[]{"seed: ", Integer.toString(this.field_jb, 16)}, (byte) -116);
                    var10.a(new String[]{"size: ", Integer.toString(this.field_cb), ", theme: ", Integer.toString(this.field_hb)}, (byte) -103);
                    if (this.field_Bb) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var12.a((byte) 19, "kbd summoned");
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((param0 ^ -1) <= -1) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.a(param0, var12, param1 + -3148);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var4 = param0;
                    if (-1 < (var4 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var5 = 0;
                    if (param1 == -248) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return (String) null;
                }
                case 11: {
                    if (var5 >= this.field_v) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_21_0 = 0;
                    stackIn_13_0 = stackIn_21_0;
                    if (var9 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var6 = stackIn_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (this.field_db <= var6) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = var6 * this.field_v - -var5;
                    var8 = this.field_Eb[var7];
                    this.a(var4, var8, (byte) -40, var6, var12, var5);
                    var6++;
                    if (var9 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var9 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var9 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var5 = stackIn_21_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (this.field_W <= var5) {
                        statePc = 30;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var11 = (jd) ((Object) this.field_t[var5].e((byte) 124));
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var11 == null) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.a(false, var11, var10);
                    var11 = (jd) ((Object) this.field_t[var5].a((byte) 123));
                    if (var9 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var9 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5++;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var9 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return var12.c(1024);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(vh param0, byte param1) {
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = param0.k(param1 ^ -84) & 31;
            if (var3_int != 13) {
              if (var3_int != 14) {
                L1: {
                  if (param1 == -84) {
                    break L1;
                  } else {
                    this.a(-22, (jd) null);
                    break L1;
                  }
                }
                L2: {
                  if (var3_int != 5) {
                    break L2;
                  } else {
                    L3: {
                      var4 = param0.k(0);
                      var5 = 15 & var4;
                      if ((var5 ^ -1) != -16) {
                        break L3;
                      } else {
                        var5 = -1;
                        break L3;
                      }
                    }
                    this.field_l.a((byte) -119, (tc) (new pj(bo.a(-1, param0, 4368051), var5, var4 >> 1831678276)));
                    break L2;
                  }
                }
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    var4 = param0.k(0);
                                    var5 = param0.k(param1 ^ -84);
                                    var6 = var3_int;
                                    if ((var6 ^ -1) == -2) {
                                      break L13;
                                    } else {
                                      if ((var6 ^ -1) == -12) {
                                        break L12;
                                      } else {
                                        L14: {
                                          if (17 != var6) {
                                            break L14;
                                          } else {
                                            if (var7 == 0) {
                                              break L11;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        if (-17 == (var6 ^ -1)) {
                                          break L10;
                                        } else {
                                          L15: {
                                            if (2 != var6) {
                                              break L15;
                                            } else {
                                              if (var7 == 0) {
                                                break L9;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (-8 != (var6 ^ -1)) {
                                              break L16;
                                            } else {
                                              if (var7 == 0) {
                                                break L8;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (-9 != (var6 ^ -1)) {
                                              break L17;
                                            } else {
                                              if (var7 == 0) {
                                                break L7;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          if (15 != var6) {
                                            break L5;
                                          } else {
                                            if (var7 == 0) {
                                              break L6;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.field_l.a((byte) -119, (tc) (new q(var4, var5)));
                                  if (var7 == 0) {
                                    break L5;
                                  } else {
                                    break L12;
                                  }
                                }
                                this.field_l.a((byte) -119, (tc) (new ec(var4, var5, param0.e((byte) -104), true)));
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  break L11;
                                }
                              }
                              this.field_l.a((byte) -119, (tc) (new ec(var4, var5, param0.e((byte) -104), false)));
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L10;
                              }
                            }
                            this.a(var4, -47, param0, var5);
                            if (var7 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                          this.field_l.a((byte) -119, (tc) (new hp(var4, var5)));
                          if (var7 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                        this.field_l.a((byte) -119, (tc) (new tr(var4, var5, 0)));
                        if (var7 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                      this.field_l.a((byte) -119, (tc) (new tr(var4, var5, param0.k(0))));
                      if (var7 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                    this.field_l.a((byte) -119, (tc) (new kf(var4, var5, param0.k(0), param0.k(param1 ^ -84), param0.k(0), param0.k(0))));
                    break L4;
                  }
                  break L4;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_l.a((byte) -119, (tc) (new vp(3, param0.k(0), this.field_sb)));
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_l.a((byte) -119, (tc) (new rl(param0.k(0))));
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var3);

            stackIn_49_1 = new StringBuilder().append("ha.LC(");

            if (param0 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L18;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L18;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param1 + ')');
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

    final int h(int param0, int param1) {
        if (param1 != 0) {
            return -38;
        }
        if (!(this.field_wb)) {
            return -1;
        }
        return this.field_w[this.field_yb[param0]].c(16648);
    }

    final void a(int param0, String param1, oj param2) {
        String var4 = null;
        try {
            var4 = param2.a((byte) -8, false);
            if (param0 != 0) {
                this.field_D = -23;
            }
            this.j(7);
            var4 = param1 + "\n" + var4;
            this.field_l.b(param0 ^ 98);
            ik.a("Dropping conection: turn: " + this.field_Gb + ", player: " + this.field_gb + "\n" + var4, (byte) 40);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.JC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0, int param1) {
        if (!(this.field_wb)) {
            return -1;
        }
        if (param0 != -9650) {
            return 126;
        }
        return this.field_w[param1].c(16648);
    }

    private final void a(vh param0, int param1) {
        at stackIn_5_0;
        int stackIn_5_1;
        ag stackIn_5_2;
        ag stackIn_5_3;
        int stackIn_5_4;
        int stackIn_5_5;
        int stackIn_5_6;
        int stackIn_5_7;
        int stackIn_5_8;
        int stackIn_5_9;
        int stackIn_5_10;
        at stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ag stackIn_6_2 = null;
        ag stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        int stackIn_6_8 = 0;
        int stackIn_6_9 = 0;
        int stackIn_6_10 = 0;
        int stackIn_6_11 = 0;
        int stackIn_9_12 = 0;
        int stackIn_11_13;
        int stackIn_11_14;
        int stackIn_12_13 = 0;
        int stackIn_12_14 = 0;
        int stackIn_12_15 = 0;
        int stackIn_15_16;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = param0.k(0);
                var4 = param0.k(0);
                var5 = param0.k(0);
                var6 = param0.k(param1 ^ -1);
                var7 = param0.e((byte) -104);
                var8 = var7 >> 2074827752;
                var9 = 255 & var7;
                var8 = (var8 ^ 128) - 128;
                var9 = (var9 ^ 128) + -128;
                var10 = param0.k(0);
                var11 = param0.k(0);
                var12 = param0.k(0);
                var13 = param0.k(0);
                if (param1 <= (4 & var3_int ^ -1)) {
                  break L2;
                } else {
                  this.field_l.a((byte) -119, (tc) (new md(var5, var6, var8, var9, var10)));
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                stackIn_5_0 = this.field_l;

                stackIn_5_1 = -119;

                stackIn_5_2 = null;

                stackIn_5_3 = null;

                stackIn_5_4 = var4;

                stackIn_5_5 = var5;

                stackIn_5_6 = var6;

                stackIn_5_7 = var8;

                stackIn_5_8 = var9;

                stackIn_5_9 = var10;

                stackIn_5_10 = var11;

                if ((var3_int & 1 ^ -1) >= -1) {
                  stackIn_6_0 = (at) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = null;
                  stackIn_6_3 = null;
                  stackIn_6_4 = stackIn_5_4;
                  stackIn_6_5 = stackIn_5_5;
                  stackIn_6_6 = stackIn_5_6;
                  stackIn_6_7 = stackIn_5_7;
                  stackIn_6_8 = stackIn_5_8;
                  stackIn_6_9 = stackIn_5_9;
                  stackIn_6_10 = stackIn_5_10;
                  stackIn_6_11 = 0;
                  break L3;
                } else {
                  stackIn_6_0 = (at) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = null;
                  stackIn_6_3 = null;
                  stackIn_6_4 = stackIn_5_4;
                  stackIn_6_5 = stackIn_5_5;
                  stackIn_6_6 = stackIn_5_6;
                  stackIn_6_7 = stackIn_5_7;
                  stackIn_6_8 = stackIn_5_8;
                  stackIn_6_9 = stackIn_5_9;
                  stackIn_6_10 = stackIn_5_10;
                  stackIn_6_11 = 1;
                  break L3;
                }
              }
              L4: {
























                if (-1 <= (var3_int & 2 ^ -1)) {
                  stackIn_6_0 = (at) ((Object) stackIn_6_0);

                  stackIn_6_2 = null;
                  stackIn_6_3 = null;








                  stackIn_9_12 = 0;
                  break L4;
                } else {
                  stackIn_6_0 = (at) ((Object) stackIn_6_0);

                  stackIn_6_2 = null;
                  stackIn_6_3 = null;








                  stackIn_9_12 = 1;
                  break L4;
                }
              }
              L5: {


























                stackIn_11_13 = 7 & var12;

                stackIn_11_14 = (var12 & 127) >> 911823460;

                if ((8 & var12 ^ -1) == -1) {
                  stackIn_6_0 = (at) ((Object) stackIn_6_0);

                  stackIn_6_2 = null;
                  stackIn_6_3 = null;









                  stackIn_12_13 = stackIn_11_13;
                  stackIn_12_14 = stackIn_11_14;
                  stackIn_12_15 = 0;
                  break L5;
                } else {
                  stackIn_6_0 = (at) ((Object) stackIn_6_0);

                  stackIn_6_2 = null;
                  stackIn_6_3 = null;









                  stackIn_12_13 = stackIn_11_13;
                  stackIn_12_14 = stackIn_11_14;
                  stackIn_12_15 = 1;
                  break L5;
                }
              }
              L6: {
































                if (-1 == (var12 & 128 ^ -1)) {
                  stackIn_6_0 = (at) ((Object) stackIn_6_0);

                  stackIn_6_2 = null;
                  stackIn_6_3 = null;












                  stackIn_15_16 = 0;
                  break L6;
                } else {
                  stackIn_6_0 = (at) ((Object) stackIn_6_0);

                  stackIn_6_2 = null;
                  stackIn_6_3 = null;












                  stackIn_15_16 = 1;
                  break L6;
                }
              }
              ((at) (Object) stackIn_6_0).a((byte) stackIn_6_1, (tc) (new ag(stackIn_6_4, stackIn_6_5, stackIn_6_6, stackIn_6_7, stackIn_6_8, stackIn_6_9, stackIn_6_10, stackIn_6_11 != 0, stackIn_9_12 != 0, stackIn_12_13, stackIn_12_14, stackIn_12_15 != 0, stackIn_15_16 != 0, var13)));
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("ha.ND(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final boolean d(byte param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if ((eb.a((byte) -95, 85 & this.field_e) ^ -1) == (this.field_W / this.field_tb ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return false;
                }
                case 3: {
                    if ((eb.a((byte) -97, this.field_e & 170) ^ -1) == (this.field_W / this.field_tb ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return true;
                }
                case 6: {
                    var2 = this.i(0, -12710);
                    if (param0 > 68) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_t = (at[]) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var3 = this.i(1, -12710);
                    if (var2 > var3) {
                        statePc = 25;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var3 != var2) {
                        statePc = 26;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4 = this.b((byte) 31, 0);
                    var5 = this.b((byte) 31, 1);
                    if (var5 < var4) {
                        statePc = 23;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((var4 ^ -1) == (var5 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((this.field_W ^ -1) >= (var8 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = var7 + this.field_H[var8 + 1];
                    var6 = var6 + this.field_H[var8];
                    var8 += 2;
                    if (var9 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var9 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var7 >= var6) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return true;
                }
                case 20: {
                    if (var6 != var7) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return true;
                }
                case 22: {
                    if (var9 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return true;
                }
                case 24: {
                    if (var9 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return true;
                }
                case 26: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 < -126) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((this.field_W ^ -1) >= (var3_int ^ -1)) {
                      break L3;
                    } else {
                      stackOut_6_0 = vr.a(11987, this.field_lb[var3_int], param0);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0) {
                          stackIn_10_0 = var3_int;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = -1;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = -8;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ha.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final int d(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        boolean stackOut_4_0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        var5 = 0;
        if (param2 == 6) {
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var6 >= this.field_W) {
                  break L2;
                } else {
                  stackOut_4_0 = this.c(var6, param2 ^ -16991, param0);
                  stackIn_11_0 = stackOut_4_0 ? 1 : 0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (!stackIn_5_0) {
                        break L3;
                      } else {
                        var4++;
                        if (0 == (this.field_e & 1 << var6)) {
                          var5++;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6++;
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_11_0 = 0;
              break L1;
            }
            if (stackIn_11_0 == var5) {
              return 0;
            } else {
              if (this.field_K != null) {
                L4: {
                  if ((this.field_K.field_w ^ -1) == (param0 ^ -1)) {
                    param1 = (int)((float)param1 * this.field_bb);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return param1;
              } else {
                return param1 * var4 / var5;
              }
            }
          }
        } else {
          return 58;
        }
    }

    final void b(int param0, vh param1) {
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        vh stackIn_97_4 = null;
        Object stackIn_97_5 = null;
        int stackIn_97_6 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        vh stackIn_98_4 = null;
        Object stackIn_98_5 = null;
        int stackIn_98_6 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        vh stackIn_99_4 = null;
        Object stackIn_99_5 = null;
        int stackIn_99_6 = 0;
        int stackIn_99_7 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ne var10_ref_ne = null;
        int var10 = 0;
        int var11 = 0;
        jd var12 = null;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_jb = param1.i(param0 + 1);
                        this.field_O = param1.e((byte) -104);
                        this.field_T = new ln[this.field_W];
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3_int ^ -1) <= (this.field_W ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_T[var3_int] = new ln();
                        tb.a(this.field_T[var3_int].field_a, param1, false, this.field_T[var3_int].field_b);
                        var3_int++;
                        if (var13 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3_int = param1.k(param0 ^ 0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_9_0 = this;
                        stackIn_8_0 = stackIn_9_0;
                        if ((var3_int & 1) <= 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_10_0 = this;
                        stackIn_10_1 = 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = this;
                        stackIn_10_1 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((ha) (this)).field_Bb = stackIn_10_1 != 0;
                        this.field_hb = (56 & var3_int) >> -1197789053;
                        this.field_cb = (6 & var3_int) >> 609155105;
                        if (-1 == (var3_int & 128 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = stackIn_13_0;
                        var5 = 0;
                        if (var4 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = param1.k(0);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_Gb = param1.k(param0 ^ 0);
                        this.field_gb = param1.k(param0 + 0);
                        this.l(param0 + 0, 0);
                        var6 = this.field_Eb.length + -1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-1 < (var6 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_Eb[var6].i(14);
                        var6--;
                        if (var13 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var13 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (0 > (this.field_sb ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((this.field_W ^ -1) >= (var6 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_mb[var6] = param1.e((byte) -104);
                        var6++;
                        if (var13 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var13 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var13 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_E[this.field_sb][6] = param1.k(0);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var6 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (this.field_c[this.field_sb].length <= var6) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7 = param1.k(param0 ^ 0);
                        this.field_c[this.field_sb][var6] = var7 >> 332258660;
                        stackIn_38_0 = this.field_c[this.field_sb][var6] ^ -1;
                        stackIn_31_0 = stackIn_38_0;
                        stackIn_38_1 = -8;
                        stackIn_31_1 = stackIn_38_1;
                        if (var13 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 > stackIn_31_1) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.field_c[this.field_sb][var6] = -1;
                        if (var13 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_E[this.field_sb][this.field_c[this.field_sb][var6]] = rn.a(15, var7);
                        this.field_D = this.field_D + 1;
                        if ((var6 ^ -1) != -3) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        this.field_Cb = true;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var6++;
                        if (var13 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_H[this.field_sb] = param1.i(1);
                        this.field_mb[this.field_sb] = param1.e((byte) -104);
                        this.field_Q = param1.k(0);
                        stackIn_38_0 = -1;
                        stackIn_38_1 = this.field_Q ^ -1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 != stackIn_38_1) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (this.field_B != null) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_B = new int[this.field_W][5];
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var6 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-6 >= (var6 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var7 = param1.e((byte) -104);
                        stackIn_50_0 = 65535;
                        stackIn_45_0 = stackIn_50_0;
                        stackIn_50_1 = var7;
                        stackIn_45_1 = stackIn_50_1;
                        if (var13 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 == stackIn_45_1) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var7 = -1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_B[this.field_sb][var6] = var7;
                        var6++;
                        if (var13 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = -1;
                        stackIn_50_1 = lf.field_i[this.field_Q] ^ -1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 != stackIn_50_1) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_m[this.field_sb] = param1.e((byte) -104);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var6 >= this.field_tb) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.field_fb[var6] = param1.e((byte) -104);
                        var6++;
                        if (var13 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var13 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var6 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var6 >= this.field_W) {
                            statePc = 68;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_69_0 = this.field_t[var6].b(false) ^ -1;
                        stackIn_62_0 = stackIn_69_0;
                        if (var13 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 >= -1) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ((jd) ((Object) this.field_t[var6].e((byte) 121))).e(-98);
                        if (var13 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var13 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var6++;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var13 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var6 = param1.e((byte) -104);
                        stackIn_69_0 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var7 = stackIn_69_0;
                        var8 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((var6 ^ -1) >= (var8 ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_94_0 = this.field_v * this.field_db ^ -1;
                        stackIn_72_0 = stackIn_94_0;
                        stackIn_94_1 = var7 ^ -1;
                        stackIn_72_1 = stackIn_94_1;
                        if (var13 != 0) {
                            statePc = 94;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (stackIn_72_0 >= stackIn_72_1) {
                            statePc = 92;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var9 = param1.k(0);
                        if ((var9 & 128) == 0) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var7 = var7 + (127 & var9);
                        if (var13 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10_ref_ne = this.field_Eb[var7];
                        if (0 < (1 & var9)) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var10_ref_ne.i(14);
                        if (var13 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var10_ref_ne.a(param0 + 63);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if ((var9 & 2) > 0) {
                            statePc = 81;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var10_ref_ne.field_h = param1.k(0);
                        var10_ref_ne.field_b = true;
                        if (-12 != (var10_ref_ne.field_h ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var11 = param1.k(0);
                        var10_ref_ne.field_g = var11 >> 1881889764 & 15;
                        var10_ref_ne.field_j = var11 & 15;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if ((16 & var9 ^ -1) >= -1) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var10_ref_ne.field_a = param1.k(0);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if ((var9 & 4) > 0) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var10_ref_ne.field_m = param1.k(0);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-1 > (64 & var9 ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var11 = param1.k(0);
                        var10_ref_ne.b(true, var11);
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var7++;
                        var8++;
                        if (var13 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var6 = param1.e((byte) -104);
                        var8 = param0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_94_0 = var8 ^ -1;
                        stackIn_94_1 = var6 ^ -1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 <= stackIn_94_1) {
                            statePc = 100;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var9 = param1.k(0);
                        var10 = param1.k(0);
                        var11 = param1.k(0);
                        if (var13 != 0) {
                            statePc = 106;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_98_0 = var11 & 127;
                        stackIn_97_0 = stackIn_98_0;
                        stackIn_98_1 = var5;
                        stackIn_97_1 = stackIn_98_1;
                        stackIn_98_2 = var10;
                        stackIn_97_2 = stackIn_98_2;
                        stackIn_98_3 = var9;
                        stackIn_97_3 = stackIn_98_3;
                        stackIn_98_4 = (vh) (param1);
                        stackIn_97_4 = stackIn_98_4;
                        stackIn_98_5 = this;
                        stackIn_97_5 = stackIn_98_5;
                        stackIn_98_6 = -94;
                        stackIn_97_6 = stackIn_98_6;
                        if (-1 == (128 & var11 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackIn_99_0 = stackIn_97_0;
                        stackIn_99_1 = stackIn_97_1;
                        stackIn_99_2 = stackIn_97_2;
                        stackIn_99_3 = stackIn_97_3;
                        stackIn_99_4 = (vh) ((Object) stackIn_97_4);
                        stackIn_99_5 = this;
                        stackIn_99_6 = stackIn_97_6;
                        stackIn_99_7 = 1;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackIn_99_0 = stackIn_98_0;
                        stackIn_99_1 = stackIn_98_1;
                        stackIn_99_2 = stackIn_98_2;
                        stackIn_99_3 = stackIn_98_3;
                        stackIn_99_4 = (vh) ((Object) stackIn_98_4);
                        stackIn_99_5 = this;
                        stackIn_99_6 = stackIn_98_6;
                        stackIn_99_7 = 0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var12 = mb.a(stackIn_99_0, stackIn_99_1, stackIn_99_2, stackIn_99_3, stackIn_99_4, (ha) (this), stackIn_99_6, stackIn_99_7 != 0);
                        this.field_t[var12.field_O].a((byte) -119, (tc) (var12));
                        var8++;
                        if (var13 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        this.k(-29673);
                        this.f(-2);
                        this.field_xb = this.f((byte) -82);
                        this.b(param0 ^ 2);
                        this.a(0, 0, param0 + 0, -1);
                        fl.a((ha) (this), -118);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_104_0 = (RuntimeException) (var3);
                    stackIn_103_0 = stackIn_104_0;
                    stackIn_104_1 = new StringBuilder().append("ha.UA(").append(param0).append(',');
                    stackIn_103_1 = stackIn_104_1;
                    if (param1 == null) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackIn_105_0 = (RuntimeException) ((Object) stackIn_103_0);
                    stackIn_105_1 = (StringBuilder) ((Object) stackIn_103_1);
                    stackIn_105_2 = "{...}";
                    statePc = 105;
                    continue stateLoop;
                }
                case 104: {
                    stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
                    stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
                    stackIn_105_2 = "null";
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    throw ig.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ')');
                }
                case 106: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.a((byte) 78);
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var3 >= this.field_W) {
                break L2;
              } else {
                stackIn_7_0 = 0;

                stackIn_7_1 = var2 & 1 << var3;

                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_7_0 == stackIn_7_1) {
                      break L3;
                    } else {
                      this.b(var3, param0);
                      break L3;
                    }
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_7_0 = param0 ? 1 : 0;
            stackIn_7_1 = 1;
            break L1;
          }
          L4: {
            if (stackIn_7_0 == stackIn_7_1) {
              break L4;
            } else {
              this.field_R = 57;
              break L4;
            }
          }
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        if (0 > (param0 ^ -1) && -1 < param2 && param0 < this.field_v) {
            if (!((this.field_db ^ -1) >= (param2 ^ -1))) {
                this.field_Eb[param0 - -(param2 * this.field_v)].b(true, param3);
            }
        }
        if (param1) {
            this.field_kb = true;
        }
    }

    final void f(int param0, int param1, int param2, int param3) {
        jd var5 = this.c(param3, true, param0);
        if (var5 != null) {
            if (!(!this.c(var5.field_O, -16985, param1))) {
                var5.field_A = 5;
            }
        }
        if (param2 < 117) {
            this.field_Cb = true;
        }
    }

    final int g(int param0) {
        if (!(param0 != (this.field_A ^ -1))) {
            return -1;
        }
        return 3 - this.field_A;
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int[] var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        int[] var12;
        L0: {
          if (param1 == 255) {
            break L0;
          } else {
            this.a(30, (gn) null, -50);
            break L0;
          }
        }
        L1: {
          var6 = 0;
          var12 = this.a(param3, (byte) 118, param4, param0);
          var11 = var12;
          var7 = var11;
          var8 = bw.field_m[param2][1];
          var9 = b.a(false, param2);
          if (-75 == (param2 ^ -1)) {
            break L1;
          } else {
            if (param2 < 8) {
              break L1;
            } else {
              if (0 == (1 << var9 & this.field_a[param0][var8 - -1])) {
                return 4;
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (this.f(bw.field_m[param2][8], this.field_H[param0], 0)) {
            break L2;
          } else {
            var6 = var6 | 1;
            break L2;
          }
        }
        L3: {
          L4: {
            if (0 != (bw.field_m[param2][1] ^ -1)) {
              break L4;
            } else {
              var10 = var12[6];
              if (!ArmiesOfGielinor.field_M) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          var10 = var7[bw.field_m[param2][1]];
          break L3;
        }
        L5: {
          if (!this.a(var10, true, bw.field_m[param2][2])) {
            var6 = var6 | 2;
            break L5;
          } else {
            break L5;
          }
        }
        return var6;
    }

    final int e(int param0, int param1, int param2) {
        if (this.field_K != null) {
            if (uc.field_d[param2][4] == 4 && 0 != uc.field_d[param2][3]) {
                return -this.field_mb[param1] + 1;
            }
            return 0;
        }
        int var4 = -66 % ((param0 - -19) / 35);
        if (this.field_mb[param1] < uc.field_d[param2][1]) {
            return uc.field_d[param2][1] - this.field_mb[param1];
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int statePc = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (param2 <= param3) {
                        statePc = 13;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var5 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_v <= var5) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var11 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var6 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var6 >= this.field_db) {
                        statePc = 10;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.b(this.field_Eb[var6 * this.field_v + var5].field_k, 12534, var6, var5);
                    if (var11 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (null == this.field_Eb[var5 + var6 * this.field_v].field_c) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_Eb[var5 + var6 * this.field_v].field_c.a((byte) -17);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var6++;
                    if (var11 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5++;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var11 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var11 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var5 = param1 + -param3;
                    var6 = param3 + param1;
                    var7 = param0 - param3;
                    var8 = param0 + param3;
                    if (var5 >= 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var5 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (0 <= var7) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var7 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_v <= var6) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var6 = -1 + this.field_v;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if ((this.field_db ^ -1) >= (var8 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var8 = this.field_db + -1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var9 = var5;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var6 < var9) {
                        statePc = 35;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var11 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var10 = var7;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var10 > var8) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.b(this.field_Eb[var10 * this.field_v + var9].field_k, 12534, var10, var9);
                    if (var11 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_Eb[var9 + var10 * this.field_v].field_c == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_Eb[this.field_v * var10 + var9].field_c.a((byte) 55);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var10++;
                    if (var11 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var9++;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (var11 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void h(byte param0) {
        oj var2 = null;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-1 <= (this.field_l.b(false) ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = (oj) ((Object) this.field_l.a(0));
                    var2.a((ha) (this), -26661);
                    if (var3 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 == 108) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int[] d(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_10_0 = null;
        int[] stackIn_16_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var2 = new int[this.field_W];
                    var3 = 0;
                    if (param0 == 10326) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_Ab = false;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var3 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var2[var3] = this.field_W;
                    var3++;
                    if (var5 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var3 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_W <= var3) {
                        statePc = 15;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_16_0 = this.field_n;
                    stackIn_10_0 = stackIn_16_0;
                    if (var5 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4 = stackIn_10_0[var3];
                    if (0 != (var4 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2[var4] = var3;
                    var3++;
                    if (var5 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return var2;
                }
                case 16: {
                    return stackIn_16_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1, int param2, byte param3) {
        int discarded$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_51_0 = 0;
        int statePc = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        ne var11 = null;
        ne var12 = null;
        ne var13 = null;
        ne var14 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (param3 <= -32) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    discarded$0 = this.a((String) null, 89);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var5 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = 0;
                    stackIn_51_0 = -this.field_ab;
                    stackIn_5_0 = stackIn_51_0;
                    if (var10 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var6 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = var6;
                    stackIn_7_1 = this.field_ab;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 >= stackIn_7_1) {
                        statePc = 49;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var7 = param2 - -var6;
                    var8 = param0 + this.field_ab;
                    stackIn_7_0 = var7;
                    stackIn_9_0 = stackIn_7_0;
                    stackIn_7_1 = -1;
                    stackIn_9_1 = stackIn_7_1;
                    if (var10 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 <= stackIn_9_1) {
                        statePc = 18;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if ((this.field_v ^ -1) >= (var7 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var8 <= -1) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if ((this.field_db ^ -1) >= (var8 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var5 = 1;
                    var11 = this.field_Eb[var7 + this.field_v * var8];
                    if (!this.c(var11.field_a, -16985, param1)) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var11.field_c != null) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var11.field_l) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (!var11.a(false)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return var7 + var8 * this.field_v;
                }
                case 18: {
                    var7 = this.field_ab + param2;
                    var8 = var6 + param0;
                    if (var7 <= -1) {
                        statePc = 28;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (this.field_v <= var7) {
                        statePc = 28;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (-1 >= var8) {
                        statePc = 28;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var8 ^ -1) <= (this.field_db ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var5 = 1;
                    var12 = this.field_Eb[var8 * this.field_v + var7];
                    if (!this.c(var12.field_a, -16985, param1)) {
                        statePc = 28;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var12.field_c != null) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var12.field_l) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var12.a(false)) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return this.field_v * var8 + var7;
                }
                case 28: {
                    var7 = -var6 + param2;
                    var8 = param0 + -this.field_ab;
                    if (0 <= (var7 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_v <= var7) {
                        statePc = 38;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((var8 ^ -1) >= 0) {
                        statePc = 38;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((var8 ^ -1) > (this.field_db ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var5 = 1;
                    var13 = this.field_Eb[var8 * this.field_v + var7];
                    if (!this.c(var13.field_a, -16985, param1)) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (null != var13.field_c) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var13.field_l) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!var13.a(false)) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    return var7 - -(var8 * this.field_v);
                }
                case 38: {
                    var7 = param2 - this.field_ab;
                    var8 = -var6 + param0;
                    if (0 <= (var7 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if ((this.field_v ^ -1) >= (var7 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if ((var8 ^ -1) >= 0) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((var8 ^ -1) > (this.field_db ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var5 = 1;
                    var14 = this.field_Eb[var7 + this.field_v * var8];
                    if (!this.c(var14.field_a, -16985, param1)) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var14.field_c != null) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var14.field_l) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (!var14.a(false)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    return var8 * this.field_v + var7;
                }
                case 48: {
                    var6++;
                    if (var10 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_ab = this.field_ab + 1;
                    if (var10 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    return -1;
                }
                case 51: {
                    return stackIn_51_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(vh param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        vh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        vh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        vh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        vh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        vh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_113_0 = 0;
        jd stackIn_116_0 = null;
        jd stackIn_119_0 = null;
        jd stackIn_119_1 = null;
        Object stackIn_128_0 = null;
        jd stackIn_129_0 = null;
        jd stackIn_130_0 = null;
        jd stackIn_133_0 = null;
        jd stackIn_134_0 = null;
        jd stackIn_134_1 = null;
        vh stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        vh stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        vh stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        int stackIn_140_2 = 0;
        Object stackIn_144_0 = null;
        RuntimeException stackIn_147_0 = null;
        StringBuilder stackIn_147_1 = null;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_149_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ne var9_ref_ne = null;
        int var9 = 0;
        jd var10 = null;
        int var11 = 0;
        int var12 = 0;
        ne var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 0;
                        param0.a((byte) -58, this.field_jb);
                        param0.b(true, this.field_O);
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 >= this.field_W) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ir.a(this.field_T[var5].field_a, (byte) 100, param0, this.field_T[var5].field_b);
                        var5++;
                        if (var12 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var12 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.field_Bb) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_9_0 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = 1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = stackIn_9_0 | this.field_cb << 2103035265 | this.field_hb << 1557648387 | 128;
                        param0.b(1, var5);
                        param0.b(param1 + 25772, 1);
                        param0.b(1, this.field_Gb);
                        param0.b(1, this.field_gb);
                        if ((param2 ^ -1) >= 0) {
                            statePc = 33;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param0.b(1, this.field_E[param2][6]);
                        var6 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var6 ^ -1) <= (this.field_c[param2].length ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_21_0 = (vh) (param0);
                        stackIn_13_0 = stackIn_21_0;
                        stackIn_21_1 = param1 + 25772;
                        stackIn_13_1 = stackIn_21_1;
                        stackIn_21_2 = 0;
                        stackIn_13_2 = stackIn_21_2;
                        if (var12 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = (vh) ((Object) stackIn_13_0);
                        stackIn_14_0 = stackIn_15_0;
                        stackIn_15_1 = stackIn_13_1;
                        stackIn_14_1 = stackIn_15_1;
                        if (stackIn_13_2 <= this.field_c[param2][var6]) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_16_0 = (vh) ((Object) stackIn_14_0);
                        stackIn_16_1 = stackIn_14_1;
                        stackIn_16_2 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = (vh) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = this.field_E[param2][this.field_c[param2][var6]];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((vh) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_16_2 | this.field_c[param2][var6] << -139163644);
                        var6++;
                        if (var12 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (this.field_H[param2] >= 1) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param0.a((byte) -104, 0);
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (vh) (param0);
                        stackIn_21_1 = -107;
                        stackIn_21_2 = this.field_H[param2];
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((vh) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_21_2);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param0.b(true, this.field_mb[param2]);
                        param0.b(1, this.field_Q);
                        if ((this.field_Q ^ -1) != -1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var6 >= 5) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param0.b(true, this.field_B[param2][var6]);
                        var6++;
                        if (var12 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var12 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((lf.field_i[this.field_Q] ^ -1) != -1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param0.b(true, this.field_m[param2]);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var12 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var6 ^ -1) <= (this.field_W ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param0.b(true, this.field_mb[var6]);
                        var6++;
                        if (var12 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var12 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var6 >= this.field_tb) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_48_0 = -2;
                        stackIn_42_0 = stackIn_48_0;
                        if (var12 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 >= (this.field_fb[var6] ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        param0.b(true, 0);
                        if (var12 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        param0.b(true, this.field_fb[var6]);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var6++;
                        if (var12 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6 = 0;
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7 = stackIn_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = this.field_v;
                        stackIn_50_1 = var7;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 <= stackIn_50_1) {
                            statePc = 66;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_67_0 = 0;
                        stackIn_52_0 = stackIn_67_0;
                        if (var12 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var8 = stackIn_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (this.field_v <= var8) {
                            statePc = 65;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var9_ref_ne = this.field_Eb[var7 - -(this.field_v * var8)];
                        stackIn_50_0 = 0;
                        stackIn_55_0 = stackIn_50_0;
                        stackIn_50_1 = var9_ref_ne.field_a ^ -1;
                        stackIn_55_1 = stackIn_50_1;
                        if (var12 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 > stackIn_55_1) {
                            statePc = 63;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var9_ref_ne.field_b) {
                            statePc = 63;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (null == var9_ref_ne.field_c) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var9_ref_ne.l(param1 ^ 25770)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var9_ref_ne.c(67)) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var9_ref_ne.c((byte) -79)) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var6++;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var7++;
                        if (var12 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = param1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 == -25771) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        this.a(89, (String) null, (oj) null);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var4_int != 0) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var6 = this.field_db * this.field_v;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        param0.b(true, var6);
                        var7 = 0;
                        var6 = 0;
                        var8 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var8 >= this.field_db * this.field_v) {
                            statePc = 112;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_113_0 = var4_int;
                        stackIn_75_0 = stackIn_113_0;
                        if (var12 != 0) {
                            statePc = 113;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (stackIn_75_0 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_78_0 = 2;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_78_0 = 0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var9 = stackIn_78_0;
                        var13 = this.field_Eb[var8];
                        if (!var13.c(param1 ^ 25807)) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var9 = var9 | 1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var13.field_b) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var9 = var9 | 2;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if ((var13.field_a ^ -1) >= 0) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var9 = var9 | 16;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (null == var13.field_c) {
                            statePc = 89;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var13.l(-1)) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var9 = var9 | 4;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (!var13.c((byte) -79)) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var9 = var9 | 64;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var9 <= 0) {
                            statePc = 111;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((var8 ^ -1) >= (var7 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_99_0 = var8 - var7;
                        stackIn_94_0 = stackIn_99_0;
                        stackIn_99_1 = 127;
                        stackIn_94_1 = stackIn_99_1;
                        if (var12 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 <= stackIn_94_1) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackIn_97_0 = 127;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_97_0 = -var7 + var8;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var11 = stackIn_97_0;
                        var7 = var7 + var11;
                        param0.b(1, var11 | 128);
                        if (var12 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        param0.b(1, var9);
                        stackIn_99_0 = 0;
                        stackIn_99_1 = var9 & 2;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (stackIn_99_0 >= stackIn_99_1) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        param0.b(1, var13.field_h);
                        if ((var13.field_h ^ -1) != -12) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        param0.b(1, var13.field_g << 1536654212 | var13.field_j);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if ((var9 & 16) <= 0) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        param0.b(1, var13.field_a);
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if ((var9 & 8) <= 0) {
                            statePc = 105;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (-1 > (4 & var9 ^ -1)) {
                            statePc = 107;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        param0.b(1, var13.field_m);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var7++;
                        if (0 < (var9 & 64)) {
                            statePc = 110;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        param0.b(param1 + 25772, var13.field_a);
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var8 = param2;
                        stackIn_113_0 = 0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var9 = stackIn_113_0;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if ((var9 ^ -1) <= (this.field_W ^ -1)) {
                            statePc = 125;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackIn_129_0 = (jd) ((Object) this.field_t[var9].e((byte) 119));
                        stackIn_116_0 = stackIn_129_0;
                        if (var12 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var10 = stackIn_116_0;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var10 == null) {
                            statePc = 124;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackIn_134_0 = (jd) (var10);
                        stackIn_119_0 = stackIn_134_0;
                        stackIn_134_1 = this.field_Eb[var10.field_J - -(var10.field_w * this.field_v)].field_c;
                        stackIn_119_1 = stackIn_134_1;
                        if (var12 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (stackIn_119_0 == stackIn_119_1) {
                            statePc = 122;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if ((var8 ^ -1) != (var9 ^ -1)) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var6++;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var10 = (jd) ((Object) this.field_t[var9].a((byte) 123));
                        if (var12 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        param0.b(true, var6);
                        var9 = 0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var9 >= this.field_W) {
                            statePc = 143;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackIn_144_0 = this;
                        stackIn_128_0 = stackIn_144_0;
                        if (var12 != 0) {
                            statePc = 144;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        stackIn_129_0 = (jd) ((Object) ((ha) (this)).field_t[var9].e((byte) 114));
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var10 = stackIn_129_0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var10 = stackIn_130_0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var10 == null) {
                            statePc = 142;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackIn_130_0 = this.field_Eb[var10.field_J + this.field_v * var10.field_w].field_c;
                        stackIn_133_0 = stackIn_130_0;
                        if (var12 != 0) {
                            statePc = 130;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackIn_134_0 = (jd) ((Object) stackIn_133_0);
                        stackIn_134_1 = (jd) (var10);
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (stackIn_134_0 == stackIn_134_1) {
                            statePc = 137;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if ((var8 ^ -1) != (var9 ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        param0.b(1, var10.field_J);
                        param0.b(1, var10.field_w);
                        stackIn_139_0 = (vh) (param0);
                        stackIn_138_0 = stackIn_139_0;
                        stackIn_139_1 = param1 + 25772;
                        stackIn_138_1 = stackIn_139_1;
                        if (var10 == this.field_Eb[this.field_v * var10.field_w + var10.field_J].field_c) {
                            statePc = 139;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackIn_140_0 = (vh) ((Object) stackIn_138_0);
                        stackIn_140_1 = stackIn_138_1;
                        stackIn_140_2 = 128;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackIn_140_0 = (vh) ((Object) stackIn_139_0);
                        stackIn_140_1 = stackIn_139_1;
                        stackIn_140_2 = 0;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        ((vh) (Object) stackIn_140_0).b(stackIn_140_1, stackIn_140_2 | var10.field_N);
                        fu.a(29712, var10, param0);
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var10 = (jd) ((Object) this.field_t[var9].a((byte) 123));
                        if (var12 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackIn_144_0 = this;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        this.b(param1 + 25773);
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 146: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_148_0 = (RuntimeException) (var4);
                    stackIn_147_0 = stackIn_148_0;
                    stackIn_148_1 = new StringBuilder().append("ha.TD(");
                    stackIn_147_1 = stackIn_148_1;
                    if (param0 == null) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackIn_149_0 = (RuntimeException) ((Object) stackIn_147_0);
                    stackIn_149_1 = (StringBuilder) ((Object) stackIn_147_1);
                    stackIn_149_2 = "{...}";
                    statePc = 149;
                    continue stateLoop;
                }
                case 148: {
                    stackIn_149_0 = (RuntimeException) ((Object) stackIn_148_0);
                    stackIn_149_1 = (StringBuilder) ((Object) stackIn_148_1);
                    stackIn_149_2 = "null";
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    throw ig.a((Throwable) ((Object) stackIn_149_0), stackIn_149_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 150: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int[] param2) {
        RuntimeException runtimeException = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                this.field_R = param0;
                if ((param0 ^ -1) != -2) {
                  break L2;
                } else {
                  this.field_gb = param2[0];
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_gb = -1;
              break L1;
            }
            L3: {
              stackIn_6_0 = this;

              if (!param1) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L3;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L3;
              }
            }
            ((ha) (this)).field_X = stackIn_7_1 != 0;
            this.field_p = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("ha.HB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final oj b(boolean param0) {
        if (0 == this.field_l.b(param0)) {
            return null;
        }
        oj var2 = (oj) ((Object) this.field_l.e((byte) 118));
        if (var2 == null) {
            return null;
        }
        return var2;
    }

    final void a(byte param0, int param1, int param2, ne[] param3) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        jd stackIn_52_0 = null;
        jd stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        int stackIn_52_5 = 0;
        int stackIn_52_6 = 0;
        int stackIn_52_7 = 0;
        jd stackIn_53_0 = null;
        jd stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        int stackIn_53_5 = 0;
        int stackIn_53_6 = 0;
        int stackIn_53_7 = 0;
        jd stackIn_54_0 = null;
        jd stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        int stackIn_54_5 = 0;
        int stackIn_54_6 = 0;
        int stackIn_54_7 = 0;
        int stackIn_54_8 = 0;
        int stackIn_91_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jd var9_ref_jd = null;
        int var9 = 0;
        jd var10_ref_jd = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jd var17 = null;
        vh var18 = null;
        ik var19 = null;
        int var20 = 0;
        ne var21 = null;
        jd var22 = null;
        at var23 = null;
        bb var24 = null;
        ne var25 = null;
        jd var26 = null;
        int[] var30 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var5_int = param1 * param2;
                        if (param3.length == var5_int) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        this.field_j = new ul((ha) (this), param3, param1, param2);
                        this.field_Eb = param3;
                        this.field_db = param2;
                        this.field_v = param1;
                        var6 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((this.field_t.length ^ -1) >= (var6 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var23 = this.field_t[var6];
                        if (var20 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var23 != null) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var20 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var23.b(false) ^ -1) != -1) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var20 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var24 = new bb(var23);
                        var9_ref_jd = (jd) ((Object) var24.c(50));
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var9_ref_jd == null) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10_ref_jd = (jd) ((Object) var24.b(50));
                        var9_ref_jd.d(70);
                        var9_ref_jd = var10_ref_jd;
                        if (var20 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var20 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6++;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var20 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param0 < -69) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.a(83, -46, -45, (byte) -10);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((var6 ^ -1) <= (this.field_Eb.length ^ -1)) {
                            statePc = 102;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var21 = this.field_Eb[var6];
                        var25 = var21;
                        if (var20 != 0) {
                            statePc = 103;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var25 == null) {
                            statePc = 101;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var22 = var25.field_c;
                        var26 = var22;
                        if (var26 == null) {
                            statePc = 72;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = var26.field_O;
                        var10 = var26.field_J;
                        var11 = var26.field_w;
                        var12 = var26.field_N;
                        var21.field_c = null;
                        var30 = bw.field_m[var12];
                        if ((var9 ^ -1) > -1) {
                            statePc = 101;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (this.field_W <= var9) {
                            statePc = 101;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (0 != var12) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = 10;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = var30[4];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var14 = stackIn_34_0;
                        if (0 != var12) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_37_0 = 10;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = var30[4];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var15 = stackIn_37_0;
                        if (-1 != (16 & var26.field_V ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var15 = var26.field_Y;
                        if (var14 < var15) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var14 = var15;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (75 != var12) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_45_0 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var16 = stackIn_45_0;
                        if (var16 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var12 = 34;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var12 != 4) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((this.field_hb ^ -1) != -3) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var12 = 81;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_53_0 = null;
                        stackIn_52_0 = stackIn_53_0;
                        stackIn_53_1 = null;
                        stackIn_52_1 = stackIn_53_1;
                        stackIn_53_2 = var10;
                        stackIn_52_2 = stackIn_53_2;
                        stackIn_53_3 = var11;
                        stackIn_52_3 = stackIn_53_3;
                        stackIn_53_4 = var12;
                        stackIn_52_4 = stackIn_53_4;
                        stackIn_53_5 = var9;
                        stackIn_52_5 = stackIn_53_5;
                        stackIn_53_6 = var14;
                        stackIn_52_6 = stackIn_53_6;
                        stackIn_53_7 = var15;
                        stackIn_52_7 = stackIn_53_7;
                        if (var12 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_54_0 = null;
                        stackIn_54_1 = null;
                        stackIn_54_2 = stackIn_52_2;
                        stackIn_54_3 = stackIn_52_3;
                        stackIn_54_4 = stackIn_52_4;
                        stackIn_54_5 = stackIn_52_5;
                        stackIn_54_6 = stackIn_52_6;
                        stackIn_54_7 = stackIn_52_7;
                        stackIn_54_8 = 8;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = null;
                        stackIn_54_1 = null;
                        stackIn_54_2 = stackIn_53_2;
                        stackIn_54_3 = stackIn_53_3;
                        stackIn_54_4 = stackIn_53_4;
                        stackIn_54_5 = stackIn_53_5;
                        stackIn_54_6 = stackIn_53_6;
                        stackIn_54_7 = stackIn_53_7;
                        stackIn_54_8 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var17 = new jd(stackIn_54_2, stackIn_54_3, stackIn_54_4, stackIn_54_5, stackIn_54_6, stackIn_54_7, stackIn_54_8 | 1, 0, 0, (ha) (this), 0, 0, -1, false, 0);
                        if (var17.p(-43)) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.a(var11, var10, 0, 3);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var16 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var17.z(10);
                        var17.field_W = true;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var17.field_H = var26.field_H;
                        var17.field_V = var26.field_V;
                        var17.field_E = var26.field_E;
                        if (var26.field_K != null) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var17.field_K = var26.field_K;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!var26.c(false)) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (this.field_K == null) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        this.field_V = false;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (-1 < (var26.field_q ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((uc.field_d[var22.field_q][4] ^ -1) == -6) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw new IllegalStateException("");
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var18 = new vh(4);
                        var18.b(true, var26.field_q);
                        var18.b(1, var26.field_J);
                        var18.b(1, var26.field_w);
                        var18.field_q = 0;
                        var19 = bo.a(var26.field_O, var18, 4368051);
                        if (var19 == null) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var19.a(var26.field_O, (ha) (this), 26123);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var21.field_c = var17;
                        this.field_t[var9].a((byte) -119, (tc) (var17));
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((var25.field_a ^ -1) < 0) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var10 = var25.field_h;
                        if (var10 != 11) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var20 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (7 == var10) {
                            statePc = 94;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((var10 ^ -1) != -15) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var20 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (-10 != (var10 ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var20 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var10 != 8) {
                            statePc = 99;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var20 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (this.field_K == null) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if ((this.field_K.field_w ^ -1) == (var25.field_a ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackIn_91_0 = 1;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackIn_91_0 = 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var9 = stackIn_91_0;
                        if (var9 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var21.field_j = this.field_E[var21.field_a][var21.field_g];
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        dupTemp$0 = this.field_z[this.o(var21.field_a, -1)];
                        dupTemp$0[0] = dupTemp$0[0] + 1;
                        if (var20 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        dupTemp$1 = this.field_z[this.o(var21.field_a, -1)];
                        dupTemp$1[1] = dupTemp$1[1] + 1;
                        if (var20 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        dupTemp$2 = this.field_z[this.o(var21.field_a, -1)];
                        dupTemp$2[2] = dupTemp$2[2] + 1;
                        if (var20 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var25.e((byte) -122)) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var25.field_a = -1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var6++;
                        if (var20 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        this.k(-29673);
                        this.f(-2);
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 103: {
                    return;
                }
                case 104: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_106_0 = (RuntimeException) (var5);
                    stackIn_105_0 = stackIn_106_0;
                    stackIn_106_1 = new StringBuilder().append("ha.OB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_105_1 = stackIn_106_1;
                    if (param3 == null) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackIn_107_0 = (RuntimeException) ((Object) stackIn_105_0);
                    stackIn_107_1 = (StringBuilder) ((Object) stackIn_105_1);
                    stackIn_107_2 = "{...}";
                    statePc = 107;
                    continue stateLoop;
                }
                case 106: {
                    stackIn_107_0 = (RuntimeException) ((Object) stackIn_106_0);
                    stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
                    stackIn_107_2 = "null";
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    throw ig.a((Throwable) ((Object) stackIn_107_0), stackIn_107_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, ne param1, byte param2, int param3, gn param4, int param5) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            if (this.a(param0, param1, param2 ^ -88)) {
              L1: {
                if (param1.field_b) {
                  break L1;
                } else {
                  if (param1.c(param2 + -35)) {
                    break L1;
                  } else {
                    if (param1.c((byte) -79)) {
                      break L1;
                    } else {
                      if (-1 == param1.field_a) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L2: {
                param4.a(new String[]{"cell at ", ci.c(param5, 0, param3), ": "}, (byte) -95);
                param4.a(0, 2);
                if (param1.field_b) {
                  param4.a(new String[]{"changed type: ", Integer.toString(param1.field_h)}, (byte) -106);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!param1.c(125)) {
                  break L3;
                } else {
                  param4.a((byte) 19, "bones");
                  break L3;
                }
              }
              L4: {
                if (!param1.c((byte) -79)) {
                  break L4;
                } else {
                  param4.a(new String[]{"fort: owner: ", this.e(param1.b((byte) -54), -1)}, (byte) -57);
                  break L4;
                }
              }
              L5: {
                if (0 == (param1.field_a ^ -1)) {
                  break L5;
                } else {
                  param4.a(new String[]{"owner: ", this.e(param1.field_a, param2 ^ 39)}, (byte) -93);
                  break L5;
                }
              }
              L6: {
                param4.a(0, -2);
                if (param2 == -40) {
                  break L6;
                } else {
                  this.a((byte) -3, (vh) null);
                  break L6;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("ha.FC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param5 + ')');
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

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (param0 == -2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_d = (int[]) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    this.field_s[1] = 0;
                    this.field_s[2] = 0;
                    this.field_s[0] = 0;
                    if (null != this.field_Eb) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var2 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var2 >= this.field_Eb.length) {
                        statePc = 22;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var3 = this.field_Eb[var2].field_h;
                    if (var4 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var3 == 7) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (14 != var3) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var4 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((var3 ^ -1) != -10) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var4 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((var3 ^ -1) == -9) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_s[0] = this.field_s[0] + 1;
                    if (var4 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_s[1] = this.field_s[1] + 1;
                    if (var4 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_s[2] = this.field_s[2] + 1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var2++;
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int[] var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int[] var11;
        int[] var12;
        L0: {
          var12 = this.a(param0, (byte) 37, param3, param4);
          var11 = var12;
          var10 = var11;
          var6 = var10;
          var7 = bw.field_m[param2][1];
          var8 = b.a(false, param2);
          if ((param2 ^ -1) == -75) {
            break L0;
          } else {
            if ((param2 ^ -1) > -9) {
              break L0;
            } else {
              if (0 != (this.field_a[param4][1 + var7] & 1 << var8)) {
                break L0;
              } else {
                return false;
              }
            }
          }
        }
        L1: {
          if (this.f(bw.field_m[param2][8], this.field_H[param4], 0)) {
            L2: {
              L3: {
                var10 = var6;
                if (-1 != bw.field_m[param2][1]) {
                  break L3;
                } else {
                  var9 = var12[6];
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var10 = var6;
              var9 = var10[bw.field_m[param2][1]];
              break L2;
            }
            if (this.a(var9, true, bw.field_m[param2][2])) {
              return true;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        if (param1 == -26813) {
          return false;
        } else {
          this.field_xb = 58;
          return false;
        }
    }

    private final int b(byte param0, int param1) {
        if (param0 != 31) {
            return -126;
        }
        return this.field_z[param1][0] * 10 - (-(5 * this.field_z[param1][1]) + -(2 * this.field_z[param1][2]));
    }

    private final boolean a(int param0, ne param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 94 % ((-56 - param2) / 50);
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("ha.TB(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final int a(jd param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 14336) {
              stackIn_4_0 = pj.a(this.field_v, this.field_Eb, param3, param4, param6, this.field_db, this.o(param6, -1), param0, param5, param1, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 112;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("ha.HC(");

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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, vh param1, byte param2) {
        try {
            if (param2 > -71) {
                this.field_W = 26;
            }
            if (!(this.field_Z != null)) {
                param0 -= 2;
                this.field_Z = new vh(param1.e((byte) -104));
            }
            param1.a(0, param0, this.field_Z.field_q, this.field_Z.field_o);
            this.field_Z.field_q = this.field_Z.field_q + param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.AC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1, int param2, int param3) {
        int var5 = -1;
        if (!(param3 < 0)) {
            var5 = this.o(param3, param0 ^ -32);
        }
        if (param0 != 31) {
            this.c(-23, -102);
        }
        return this.field_Eb[param2 + this.field_v * param1].a((byte) 97, param3, var5);
    }

    private final void a(vh param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            param0.k(0);
            if (!param1) {
                this.f(-120);
            }
            var3_int = param0.k(0);
            var4 = param0.k(0);
            var5 = param0.k(0);
            var6 = param0.k(0);
            var7 = 31 & var4;
            var7 = (16 ^ var7) - 16;
            this.field_l.a((byte) -119, (tc) (new mb(var3_int, var5, var6, var7, var4 >> 605517893)));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int b(int param0, jd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = param1.field_O;
              if (!param1.field_I) {
                break L1;
              } else {
                var3_int = var3_int ^ 5637;
                break L1;
              }
            }
            L2: {
              if (!param1.field_W) {
                break L2;
              } else {
                var3_int = var3_int ^ 757314;
                break L2;
              }
            }
            L3: {
              var3_int = var3_int ^ 12643 * param1.field_B;
              if (!param1.field_s) {
                break L3;
              } else {
                var3_int = var3_int ^ 76756163;
                break L3;
              }
            }
            L4: {
              if (param1.field_D) {
                var3_int = var3_int ^ 847523;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3_int = var3_int ^ 38 * param1.field_J;
              var3_int = var3_int ^ param1.field_w * 391;
              var3_int = var3_int ^ param1.field_A * 874;
              var3_int = var3_int ^ 23874 * param1.field_N;
              var3_int = var3_int ^ param1.field_Y * 584668;
              var3_int = var3_int ^ 445235 * param1.field_t;
              if (param0 < -6) {
                break L5;
              } else {
                this.field_rb = (int[]) null;
                break L5;
              }
            }
            stackIn_12_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ha.TC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final void e(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (param0 != 14) {
            discarded$0 = this.a(-18, (ne) null, 8);
        }
        jd var5 = this.c(param3, true, param1);
        if (var5 != null && this.c(var5.field_O, -16985, param2)) {
            var5.field_I = false;
        }
    }

    final int a(byte param0, int param1, int param2) {
        if (param0 != 11) {
            this.a((byte) 47, 3, 37, -46);
        }
        return 0;
    }

    final void d(int param0, int param1, int param2, int param3) {
        if (!(this.field_b)) {
            return;
        }
        if (param2 < 68) {
            return;
        }
        if (this.field_d[param3] < param1) {
            this.field_d[param3] = param1;
            this.field_N[param3] = param0;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int var5 = 0;
        jd var6 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (this.field_gb <= -1) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var6 = (jd) ((Object) this.field_t[this.field_gb].e((byte) 91));
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var6 == null) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6.m((byte) -36);
                    var6 = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                    if (var5 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_mb[this.field_gb] = this.field_mb[this.field_gb] + 1;
                    this.field_gb = param1;
                    this.field_Gb = param2;
                    this.a(false, false, 0);
                    this.a(1);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var5 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_gb = param1;
                    this.field_Gb = param2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    this.a(param1, (byte) 111);
                    if (param0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_n = (int[]) null;
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, int param8, int param9) {
        boolean discarded$0 = false;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_84_0 = 0;
        at stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        nw stackIn_110_2 = null;
        nw stackIn_110_3 = null;
        jd stackIn_110_4 = null;
        int stackIn_110_5 = 0;
        at stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        nw stackIn_111_2 = null;
        nw stackIn_111_3 = null;
        jd stackIn_111_4 = null;
        int stackIn_111_5 = 0;
        at stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        nw stackIn_112_2 = null;
        nw stackIn_112_3 = null;
        jd stackIn_112_4 = null;
        int stackIn_112_5 = 0;
        at stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        nw stackIn_113_2 = null;
        nw stackIn_113_3 = null;
        jd stackIn_113_4 = null;
        int stackIn_113_5 = 0;
        at stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        nw stackIn_114_2 = null;
        nw stackIn_114_3 = null;
        jd stackIn_114_4 = null;
        int stackIn_114_5 = 0;
        at stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        nw stackIn_115_2 = null;
        nw stackIn_115_3 = null;
        jd stackIn_115_4 = null;
        int stackIn_115_5 = 0;
        int stackIn_115_6 = 0;
        at stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        nw stackIn_117_2 = null;
        nw stackIn_117_3 = null;
        jd stackIn_117_4 = null;
        int stackIn_117_5 = 0;
        at stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        nw stackIn_118_2 = null;
        nw stackIn_118_3 = null;
        jd stackIn_118_4 = null;
        int stackIn_118_5 = 0;
        at stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        nw stackIn_119_2 = null;
        nw stackIn_119_3 = null;
        jd stackIn_119_4 = null;
        int stackIn_119_5 = 0;
        at stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        nw stackIn_120_2 = null;
        nw stackIn_120_3 = null;
        jd stackIn_120_4 = null;
        int stackIn_120_5 = 0;
        at stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        nw stackIn_121_2 = null;
        nw stackIn_121_3 = null;
        jd stackIn_121_4 = null;
        int stackIn_121_5 = 0;
        at stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        nw stackIn_122_2 = null;
        nw stackIn_122_3 = null;
        jd stackIn_122_4 = null;
        int stackIn_122_5 = 0;
        int stackIn_122_6 = 0;
        int stackIn_130_0 = 0;
        int stackIn_136_0 = 0;
        int statePc = 0;
        jd var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        jd var20 = null;
        jd var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var20 = this.c(param0, true, param3);
                    var21 = var20;
                    var12 = this.c(param0 + param4, true, param1 + param3);
                    var13 = Math.abs(param1) + Math.abs(param4);
                    if (var12 == null) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (var21 != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    discarded$0 = this.a(var21, param1, param7, param2, param0, -1, param4, var12, param3, param8, param9, param6, 0);
                    return;
                }
                case 4: {
                    var14 = 0;
                    var15 = 0;
                    if (var13 != 1) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_7_0 = 1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var16 = stackIn_7_0;
                    if (var16 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (-5 != (var21.g(0) ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((var21.j(20640) ^ -1) != -5) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (-2 != (var21.d(2, 122) & 1 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = 1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var14 = stackIn_13_0;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var21.g(0) != 3) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (2 != var21.j(20640)) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if ((var21.d(2, -90) & 1 ^ -1) != -2) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = 1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var14 = stackIn_19_0;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (-35 != (var21.field_N ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (!var21.field_W) {
                        statePc = 27;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (-4 != (var21.j(20640) ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-2 != (1 & var21.d(2, -97) ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = 1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var14 = stackIn_26_0;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var21.j(20640) != 0) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (-2 != (1 & var21.d(2, 121) ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = 1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var14 = stackIn_31_0;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (34 != var21.field_N) {
                        statePc = 39;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (!var21.field_W) {
                        statePc = 39;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var21.j(20640) != 3) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (1 != (1 & var21.d(2, 99))) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = 1;
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var14 = stackIn_38_0;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var21.field_N == 81) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (-5 == (var21.field_N ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (74 != var21.field_N) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (3 != var21.j(20640)) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (1 != (var21.d(2, -112) & 1)) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var14 = stackIn_47_0;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (3 != var21.g(0)) {
                        statePc = 54;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var21.j(20640) != 2) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if ((var21.d(2, -123) & 1) != 1) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_53_0 = 1;
                    statePc = 53;
                    continue stateLoop;
                }
                case 52: {
                    stackIn_53_0 = 0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var14 = stackIn_53_0;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (1 != var21.j(20640)) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if ((1 & var21.d(2, 116)) != 1) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_58_0 = 1;
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = 0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var14 = stackIn_58_0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var17 = -37 / ((35 - param5) / 34);
                    if (var16 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (4 != var12.g(0)) {
                        statePc = 66;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (4 != var12.j(20640)) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (1 != (var12.d(2, -117) & 1)) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_65_0 = 1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = 0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var15 = stackIn_65_0;
                    if (var19 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (-4 == (var12.g(0) ^ -1)) {
                        statePc = 80;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if ((var12.field_N ^ -1) != -35) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var12.field_W) {
                        statePc = 75;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (-1 != (var12.j(20640) ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if ((1 & var12.d(2, -94)) != 1) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_74_0 = 1;
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var15 = stackIn_74_0;
                    if (var19 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var12.j(20640) != 3) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (1 != (var12.d(2, -114) & 1)) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = 1;
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var15 = stackIn_79_0;
                    if (var19 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if ((var12.j(20640) ^ -1) != -3) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (1 != (1 & var12.d(2, 117))) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackIn_84_0 = 1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 83: {
                    stackIn_84_0 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var15 = stackIn_84_0;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (!param2) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (var12.field_t >= 99) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (!var21.r(-40)) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_l.a(750, new st(var12, 4));
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (!param6) {
                        statePc = 94;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (-100 >= (var21.field_t ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (var12.r(-40)) {
                        statePc = 93;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 93: {
                    this.field_l.a(750, new st(var21, 4));
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (var16 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var12.field_C) {
                        statePc = 97;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var18 = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (var18 >= param8) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_l.a(750, new st(var12, 1));
                    var18++;
                    if (var19 != 0) {
                        statePc = 109;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (var19 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var16 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (!var21.field_C) {
                        statePc = 109;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var18 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (var18 >= param7) {
                        statePc = 109;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    this.field_l.a(750, new st(var21, 1));
                    var18++;
                    if (var19 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var19 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    stackIn_112_0 = this.field_l;
                    stackIn_110_0 = stackIn_112_0;
                    stackIn_112_1 = 750;
                    stackIn_110_1 = stackIn_112_1;
                    stackIn_112_2 = null;
                    stackIn_110_2 = stackIn_112_2;
                    stackIn_112_3 = null;
                    stackIn_110_3 = stackIn_112_3;
                    stackIn_112_4 = (jd) (var21);
                    stackIn_110_4 = stackIn_112_4;
                    stackIn_112_5 = param8;
                    stackIn_110_5 = stackIn_112_5;
                    if (var12.y(-113)) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackIn_114_0 = (at) ((Object) stackIn_110_0);
                    stackIn_111_0 = stackIn_114_0;
                    stackIn_114_1 = stackIn_110_1;
                    stackIn_111_1 = stackIn_114_1;
                    stackIn_114_2 = null;
                    stackIn_111_2 = stackIn_114_2;
                    stackIn_114_3 = null;
                    stackIn_111_3 = stackIn_114_3;
                    stackIn_114_4 = (jd) ((Object) stackIn_110_4);
                    stackIn_111_4 = stackIn_114_4;
                    stackIn_114_5 = stackIn_110_5;
                    stackIn_111_5 = stackIn_114_5;
                    if (var15 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackIn_112_0 = (at) ((Object) stackIn_111_0);
                    stackIn_112_1 = stackIn_111_1;
                    stackIn_112_2 = null;
                    stackIn_112_3 = null;
                    stackIn_112_4 = (jd) ((Object) stackIn_111_4);
                    stackIn_112_5 = stackIn_111_5;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    stackIn_114_0 = (at) ((Object) stackIn_112_0);
                    stackIn_113_0 = stackIn_114_0;
                    stackIn_114_1 = stackIn_112_1;
                    stackIn_113_1 = stackIn_114_1;
                    stackIn_114_2 = null;
                    stackIn_113_2 = stackIn_114_2;
                    stackIn_114_3 = null;
                    stackIn_113_3 = stackIn_114_3;
                    stackIn_114_4 = (jd) ((Object) stackIn_112_4);
                    stackIn_113_4 = stackIn_114_4;
                    stackIn_114_5 = stackIn_112_5;
                    stackIn_113_5 = stackIn_114_5;
                    if ((param8 ^ -1) >= -1) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_115_0 = (at) ((Object) stackIn_113_0);
                    stackIn_115_1 = stackIn_113_1;
                    stackIn_115_2 = null;
                    stackIn_115_3 = null;
                    stackIn_115_4 = (jd) ((Object) stackIn_113_4);
                    stackIn_115_5 = stackIn_113_5;
                    stackIn_115_6 = 1;
                    statePc = 115;
                    continue stateLoop;
                }
                case 114: {
                    stackIn_115_0 = (at) ((Object) stackIn_114_0);
                    stackIn_115_1 = stackIn_114_1;
                    stackIn_115_2 = null;
                    stackIn_115_3 = null;
                    stackIn_115_4 = (jd) ((Object) stackIn_114_4);
                    stackIn_115_5 = stackIn_114_5;
                    stackIn_115_6 = 0;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    ((at) (Object) stackIn_115_0).a(stackIn_115_1, new nw(stackIn_115_4, stackIn_115_5, stackIn_115_6 != 0));
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    stackIn_119_0 = this.field_l;
                    stackIn_117_0 = stackIn_119_0;
                    stackIn_119_1 = 750;
                    stackIn_117_1 = stackIn_119_1;
                    stackIn_119_2 = null;
                    stackIn_117_2 = stackIn_119_2;
                    stackIn_119_3 = null;
                    stackIn_117_3 = stackIn_119_3;
                    stackIn_119_4 = (jd) (var12);
                    stackIn_117_4 = stackIn_119_4;
                    stackIn_119_5 = param7;
                    stackIn_117_5 = stackIn_119_5;
                    if (var21.y(-119)) {
                        statePc = 119;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackIn_121_0 = (at) ((Object) stackIn_117_0);
                    stackIn_118_0 = stackIn_121_0;
                    stackIn_121_1 = stackIn_117_1;
                    stackIn_118_1 = stackIn_121_1;
                    stackIn_121_2 = null;
                    stackIn_118_2 = stackIn_121_2;
                    stackIn_121_3 = null;
                    stackIn_118_3 = stackIn_121_3;
                    stackIn_121_4 = (jd) ((Object) stackIn_117_4);
                    stackIn_118_4 = stackIn_121_4;
                    stackIn_121_5 = stackIn_117_5;
                    stackIn_118_5 = stackIn_121_5;
                    if (var14 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackIn_119_0 = (at) ((Object) stackIn_118_0);
                    stackIn_119_1 = stackIn_118_1;
                    stackIn_119_2 = null;
                    stackIn_119_3 = null;
                    stackIn_119_4 = (jd) ((Object) stackIn_118_4);
                    stackIn_119_5 = stackIn_118_5;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    stackIn_121_0 = (at) ((Object) stackIn_119_0);
                    stackIn_120_0 = stackIn_121_0;
                    stackIn_121_1 = stackIn_119_1;
                    stackIn_120_1 = stackIn_121_1;
                    stackIn_121_2 = null;
                    stackIn_120_2 = stackIn_121_2;
                    stackIn_121_3 = null;
                    stackIn_120_3 = stackIn_121_3;
                    stackIn_121_4 = (jd) ((Object) stackIn_119_4);
                    stackIn_120_4 = stackIn_121_4;
                    stackIn_121_5 = stackIn_119_5;
                    stackIn_120_5 = stackIn_121_5;
                    if ((param7 ^ -1) >= -1) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_122_0 = (at) ((Object) stackIn_120_0);
                    stackIn_122_1 = stackIn_120_1;
                    stackIn_122_2 = null;
                    stackIn_122_3 = null;
                    stackIn_122_4 = (jd) ((Object) stackIn_120_4);
                    stackIn_122_5 = stackIn_120_5;
                    stackIn_122_6 = 1;
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_122_0 = (at) ((Object) stackIn_121_0);
                    stackIn_122_1 = stackIn_121_1;
                    stackIn_122_2 = null;
                    stackIn_122_3 = null;
                    stackIn_122_4 = (jd) ((Object) stackIn_121_4);
                    stackIn_122_5 = stackIn_121_5;
                    stackIn_122_6 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    ((at) (Object) stackIn_122_0).a(stackIn_122_1, new nw(stackIn_122_4, stackIn_122_5, stackIn_122_6 != 0));
                    var21.field_B = var21.field_B - 1;
                    if (this.field_b) {
                        statePc = 124;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var12.field_M = var12.field_M + 1;
                    var21.field_m = var21.field_m + 1;
                    this.d(var21.field_O, var21.field_m, 112, 7);
                    this.d(var12.field_O, var12.field_M, 79, 6);
                    var18 = 0;
                    if (param2) {
                        statePc = 126;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_g[var12.field_O] = this.field_g[var12.field_O] + 1;
                    this.d(var12.field_O, this.field_g[var12.field_O], 120, 4);
                    if (var21.field_E != 10) {
                        statePc = 129;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (11 != var12.field_E) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_130_0 = 1;
                    statePc = 130;
                    continue stateLoop;
                }
                case 129: {
                    stackIn_130_0 = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var18 = stackIn_130_0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (!param6) {
                        statePc = 137;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    this.field_g[var20.field_O] = this.field_g[var20.field_O] + 1;
                    this.d(var21.field_O, this.field_g[var20.field_O], 91, 4);
                    if ((var12.field_E ^ -1) != -11) {
                        statePc = 135;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if ((var21.field_E ^ -1) != -12) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackIn_136_0 = 1;
                    statePc = 136;
                    continue stateLoop;
                }
                case 135: {
                    stackIn_136_0 = 0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    var18 = stackIn_136_0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (var18 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (this.field_K == null) {
                        statePc = 144;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (-3 != (this.field_K.field_G.field_r ^ -1)) {
                        statePc = 144;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if ((this.field_K.field_v ^ -1) == -6) {
                        statePc = 142;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 142: {
                    rd.field_j.a(50, (byte) 30, 205);
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void l(int param0, int param1) {
        int dupTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        RuntimeException stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        RuntimeException stackIn_8_1 = null;
        String stackIn_8_2 = null;
        lo var3;
        int var4_int;
        ne[] var4;
        int var5;
        int var6;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == param1) {
            break L0;
          } else {
            this.field_cb = 0;
            break L0;
          }
        }
        L1: {
          if (-1 < (this.field_cb ^ -1)) {
            break L1;
          } else {
            if ((hs.field_G.length ^ -1) >= (this.field_cb ^ -1)) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    dupTemp$0 = hs.field_G[this.field_cb];
                    this.field_v = dupTemp$0;
                    this.field_db = dupTemp$0;
                    if (0 > this.field_cb) {
                      break L4;
                    } else {
                      if (2 >= this.field_cb) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if ((param1 ^ -1) != -1) {
                    break L3;
                  } else {
                    rn.a(-118, (ha) (this));
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (-1 == (param1 ^ -1)) {
                      break L6;
                    } else {
                      var3 = ew.field_e.a((byte) 59, param1 + -1);
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (null != this.field_K) {
                      break L7;
                    } else {
                      var4_int = ew.field_e.a(param0 + 0, this.field_cb, this.field_hb, this.field_W);
                      if (-1 > (var4_int ^ -1)) {
                        var5 = this.field_jb % var4_int;
                        var3 = ew.field_e.a(this.field_W, 4136, this.field_cb, this.field_hb, var5);
                        if (var3 == null) {
                          throw new RuntimeException((String) null);
                        } else {
                          if (var6 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        throw new RuntimeException((String) null);
                      }
                    }
                  }
                  var3 = this.field_K.a(-114);
                  break L5;
                }
                var4 = var3.a(param0 + -95, (ha) (this));
                this.a((byte) -104, var3.field_l, var3.field_n, var4);
                break L2;
              }
              return;
            }
          }
        }
        L8: {
          stackIn_7_0 = null;

          stackIn_7_1 = null;

          if (!this.field_x) {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_2 = null;
            break L8;
          } else {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_2 = "That's not a valid map size: " + this.field_cb;
            break L8;
          }
        }
        throw new RuntimeException(stackIn_8_2);
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -64) {
              L1: {
                var3_int = this.o(this.field_sb, param1 ^ 63);
                if (var3_int < 0) {
                  var4 = this.a(param0, -128);
                  var3_int = this.o(var4, -1);
                  if (-1 < (var3_int ^ -1)) {
                    var3_int = 2;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              stackIn_9_0 = op.field_c[0][var3_int];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -101;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ha.OC(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.a(127, (jd) null);
        }
        int var4 = (param2 ^ -1) >= (param0 ^ -1) ? 1 : 0;
        return var4 != 0;
    }

    private final boolean a(jd param0, int param1, int param2, boolean param3, int param4, int param5, int param6, jd param7, int param8, int param9, int param10, boolean param11, int param12) {
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var14 = null;
        String var15 = null;
        String var16 = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = new StringBuilder().append("applycombat: ").append(param12).append(", player: ").append(this.field_gb).append(", turn: ").append(this.field_Gb).append(", att: ");

              if (param0 == null) {
                stackIn_3_0 = (StringBuilder) ((Object) stackIn_2_0);
                stackIn_3_1 = -1;
                break L1;
              } else {
                stackIn_3_0 = (StringBuilder) ((Object) stackIn_2_0);
                stackIn_3_1 = param0.field_N;
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = ((StringBuilder) (Object) stackIn_3_0).append(stackIn_3_1).append(", def: ");

              if (param7 != null) {
                stackIn_6_0 = (StringBuilder) ((Object) stackIn_5_0);
                stackIn_6_1 = param7.field_N;
                break L2;
              } else {
                stackIn_6_0 = (StringBuilder) ((Object) stackIn_5_0);
                stackIn_6_1 = -1;
                break L2;
              }
            }
            var16 = String.valueOf(stackIn_6_1);
            if (param5 == -1) {
              var15 = "\ncx: " + param8 + ", cy: " + param4 + ", ax: " + param1 + ", ay: " + param6 + ", adam: " + param2 + ", ddam: " + param9 + ", creature: " + param10 + ", attdie: " + param3 + ", defdie: " + param11;
              if (!this.field_F) {
                this.field_o = true;
                System.out.println(var16 + var15);
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                af.a((Throwable) null, 115, var16 + var15);
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var14 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var14);

            stackIn_16_1 = new StringBuilder().append("ha.JA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final int k(int param0, int param1) {
        float stackIn_5_0 = 0.0f;
        float var3;
        int var4;
        L0: {
          L1: {
            if (this.field_K == null) {
              break L1;
            } else {
              if (this.field_K.field_w == param1) {
                stackIn_5_0 = this.field_bb;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_5_0 = 1.0f;
          break L0;
        }
        var3 = stackIn_5_0;
        var4 = (int)((float)(this.field_z[this.field_yb[param1]][2] * 25) * var3) + ((int)(var3 * (float)(this.field_z[this.field_yb[param1]][1] * 75)) + (int)(var3 * (float)(50 * this.field_z[this.field_yb[param1]][0])));
        if (param0 <= -95) {
          return var4;
        } else {
          return 115;
        }
    }

    final int g(int param0, int param1, int param2) {
        int var4;
        L0: {
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (param2 >= this.field_v) {
                break L0;
              } else {
                if (this.field_v <= param0) {
                  break L0;
                } else {
                  L1: {
                    if (param1 <= -28) {
                      break L1;
                    } else {
                      this.field_Fb = false;
                      break L1;
                    }
                  }
                  L2: {
                    var4 = this.field_Eb[param2 + this.field_v * param0].field_h;
                    if (6 == var4) {
                      var4 = 4;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return var4;
                }
              }
            }
          }
        }
        return -1;
    }

    final boolean c(int param0, int param1, int param2) {
        if (param1 != -16985) {
            this.field_o = false;
        }
        if (0 == (param0 ^ -1) || (param2 ^ -1) == 0 || -256 == (param0 ^ -1) || (param2 ^ -1) == -256) {
            return false;
        }
        return this.field_yb[param2] == this.field_yb[param0] ? true : false;
    }

    private final void a(byte param0, vh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = -72 % ((-9 - param0) / 57);
                        var3_int = param1.e((byte) -104) & 8191;
                        var5 = param1.k(0);
                        var6 = param1.k(0);
                        var13 = new int[var3_int];
                        var12 = var13;
                        var7 = var12;
                        var8 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = var3_int;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9 = param1.k(0);
                        if (var11 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var10 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-5 >= (var10 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_3_0 = var3_int;
                        stackIn_8_0 = stackIn_3_0;
                        if (var11 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 <= 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7[var8] = rn.a(3, var9);
                        var9 = var9 >> 2;
                        var8++;
                        var3_int--;
                        var10++;
                        if (var11 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var11 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_l.a((byte) -119, (tc) (new kr(var5, var6, var13)));
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ha.MD(").append(param0).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean f(int param0, int param1, int param2) {
        int var4 = (param1 ^ -1) <= (param0 ^ -1) ? 1 : 0;
        if (param2 != 0) {
            this.e(73, 49, -89);
        }
        return var4 != 0;
    }

    private final int b(byte param0) {
        int var2 = 1 + this.field_vb;
        if (this.field_cb < 0 || hs.field_G.length <= this.field_cb) {
            return var2 * nr.field_a[0];
        }
        int var3 = nr.field_a[this.field_cb] * var2;
        if (!(this.field_K == null)) {
            var3 = 9999;
        }
        if (param0 != 32) {
            this.field_Db = -41;
        }
        return var3;
    }

    final String e(int param0, int param1) {
        if (-1 > param0) {
            return "id: " + param0;
        }
        if (param1 < (param0 ^ -1)) {
            return "none";
        }
        return this.field_lb[param0];
    }

    final void a(vh param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        var3_int = param0.field_o[param0.field_q];
                        var4 = (var3_int & 237) >> 1448727269;
                        if (-1 != (var4 ^ -1)) {
                          break L6;
                        } else {
                          if (var5 == 0) {
                            this.a((byte) 91, param0);
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L5;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (1 != var4) {
                          break L7;
                        } else {
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (3 == var4) {
                        break L4;
                      } else {
                        if (5 == var4) {
                          break L3;
                        } else {
                          if (var4 == 6) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    this.a(param0, true);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  this.a(param0, -1);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.a(-30531, param0);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.b(param0, (byte) -84);
              break L1;
            }
            L8: {
              if (param1 < -50) {
                break L8;
              } else {
                this.a(true, 103, -100, 43, -48, -87, -117);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("ha.SA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param3 != 0) {
            return -22;
        }
        return 0;
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (this.field_V) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    if (param0 >= 45) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.a(-102, (jd) null);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var2 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (this.field_W <= var2) {
                        statePc = 21;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_22_0 = 0;
                    stackIn_7_0 = stackIn_22_0;
                    if (var3 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 > var2) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var2 < this.field_mb.length) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return false;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    if (0 == (1 << var2 & this.field_e)) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var3 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((this.field_mb[var2] ^ -1) < (this.field_O ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return true;
                }
                case 17: {
                    if ((this.field_mb[var2] ^ -1) > (this.field_O ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return false;
                }
                case 20: {
                    var2++;
                    if (var3 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return true;
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1, jd param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_Eb[param0].c((byte) -79)) {
                break L1;
              } else {
                if (this.c(this.field_Eb[param0].b((byte) -88), -16985, param2.field_O)) {
                  stackIn_4_0 = 60;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (0 == (8 & this.b(31, param2.field_w, param2.field_J, param2.field_O))) {
              L2: {
                if (-3 != (bw.field_m[param2.field_N][1] ^ -1)) {
                  stackIn_11_0 = 0;
                  break L2;
                } else {
                  stackIn_11_0 = 1;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var4_int = stackIn_11_0;
                  if (var4_int == 0) {
                    break L4;
                  } else {
                    if (-4 != (this.field_Eb[param0].field_h ^ -1)) {
                      break L4;
                    } else {
                      param0 = 70;
                      if (!ArmiesOfGielinor.field_M) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                param0 = ri.field_c[this.field_Eb[param0].field_h];
                break L3;
              }
              L5: {
                if (param1 == -4) {
                  break L5;
                } else {
                  this.field_Bb = false;
                  break L5;
                }
              }
              stackIn_18_0 = param0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_7_0 = 100;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("ha.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    private final void k(int param0) {
        boolean stackIn_39_0 = false;
        int stackIn_46_0 = 0;
        boolean stackIn_49_0 = false;
        int stackIn_66_0 = 0;
        int stackIn_76_0 = 0;
        boolean stackIn_88_0 = false;
        boolean stackOut_38_0;
        boolean stackOut_48_0;
        boolean stackOut_87_0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        boolean[] var4 = null;
        boolean[] var5 = null;
        Vector[] var6 = null;
        int var7_int = 0;
        boolean[] var7 = null;
        ne var8_ref_ne = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        jd var12 = null;
        jd[] var13 = null;
        jd var14 = null;
        jd[] var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ArmiesOfGielinor.field_M ? 1 : 0;
                    this.field_P = new tt(this.field_W);
                    var2 = 0;
                    var3 = 0;
                    var4 = new boolean[this.field_W];
                    var5 = new boolean[this.field_W];
                    var6 = new Vector[this.field_W];
                    var7_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var7_int >= this.field_Eb.length) {
                        statePc = 33;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var8_ref_ne = this.field_Eb[var7_int];
                    if (var11 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var8_ref_ne != null) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var11 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var12 = var8_ref_ne.field_c;
                    var14 = var12;
                    if (var14 != null) {
                        statePc = 8;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (!var14.c(false)) {
                        statePc = 15;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var14.field_O != -1) {
                        statePc = 11;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (null == var6[var12.field_O]) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var6[var12.field_O] = new Vector();
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var6[var12.field_O].addElement(var14);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-8 == (var14.field_N ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (0 > var14.field_O) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var3 = 1;
                    var4[var12.field_O] = true;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var14.i(-21428)) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (!var14.k((byte) 93)) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var14.field_O >= 0) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var5[var12.field_O] = true;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var8_ref_ne.d(-58)) {
                        statePc = 27;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if ((var8_ref_ne.field_a ^ -1) > -1) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var4[var8_ref_ne.field_a] = true;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var3 = 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (!var8_ref_ne.e((byte) -128)) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var2 = 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var7_int++;
                    if (var11 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (param0 == -29673) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.a(23, (gn) null, 119);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var7 = new boolean[this.field_W];
                    if (var3 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var8 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (this.field_W <= var8) {
                        statePc = 45;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackOut_38_0 = var5[var8];
                    stackIn_46_0 = stackOut_38_0 ? 1 : 0;
                    stackIn_39_0 = stackOut_38_0;
                    if (var11 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (!var4[var8]) {
                        statePc = 42;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var7[var8] = true;
                    if (var11 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var4[var8] = true;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var8 = stackIn_46_0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if ((var8 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackOut_48_0 = var4[var8];
                    stackIn_66_0 = stackOut_48_0 ? 1 : 0;
                    stackIn_49_0 = stackOut_48_0;
                    if (var11 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.field_P.a(new up(var8, (ha) (this)), (byte) 91, var8);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.field_eb = true;
                    if (var11 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var8 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if ((this.field_W ^ -1) >= (var8 ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var7[var8] = true;
                    var8++;
                    if (var11 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var11 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var8 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if ((this.field_W ^ -1) >= (var8 ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var7[var8] = true;
                    var8++;
                    if (var11 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var11 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = var2;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var8 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_W <= var8) {
                        statePc = 73;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var11 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (null == var6[var8]) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var7[var8] = true;
                    this.field_P.b(244, var8);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var11 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var8 = 0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_76_0 = var8 ^ -1;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (stackIn_76_0 <= (this.field_W ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var11 != 0) {
                        statePc = 96;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (null == var6[var8]) {
                        statePc = 93;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var13 = new jd[var6[var8].size()];
                    var15 = var13;
                    var10 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (var10 >= var6[var8].size()) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var13[var10] = (jd) (var6[var8].elementAt(var10));
                    var10++;
                    if (var11 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var11 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.field_P.a(new gm(var8, var15), (byte) 85, var8);
                    var7[var8] = true;
                    this.field_P.a((byte) 43);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var10 = 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if ((this.field_W ^ -1) >= (var10 ^ -1)) {
                        statePc = 93;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackOut_87_0 = this.c(var8, -16985, var10);
                    stackIn_76_0 = stackOut_87_0 ? 1 : 0;
                    stackIn_88_0 = stackOut_87_0;
                    if (var11 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (!stackIn_88_0) {
                        statePc = 92;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if ((var10 ^ -1) != (var8 ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var7[var10] = true;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    var10++;
                    if (var11 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var8 = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if ((var8 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var11 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var7[var8]) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.field_P.a(new mc(var8, (ha) (this)), (byte) 99, var8);
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int n(int param0, int param1) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = 0;
          if (param1 < -60) {
            break L0;
          } else {
            this.a(53, (byte) 105, 32, 124);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var4 ^ -1) <= (this.field_c[param0].length ^ -1)) {
                break L3;
              } else {
                var5 = this.field_c[param0][var4];
                stackIn_10_0 = var5 ^ -1;

                stackIn_10_1 = -1;

                if (var6 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_10_0 <= stackIn_10_1) {
                      var3 = var3 ^ (17232 - -(312 * var5)) * this.field_E[param0][var5];
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackIn_10_0 = this.field_H[param0] ^ -1;
            stackIn_10_1 = -2;
            break L2;
          }
          L5: {
            if (stackIn_10_0 > stackIn_10_1) {
              break L5;
            } else {
              var3 = var3 ^ this.field_H[param0] * 88357;
              break L5;
            }
          }
          L6: {
            if ((this.field_fb[this.field_yb[param0]] ^ -1) <= -2) {
              var3 = var3 ^ this.field_fb[this.field_yb[param0]] * 12473;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var3 = var3 ^ 7563 * this.field_mb[param0];
            if (lf.field_i[this.field_Q] == 0) {
              break L7;
            } else {
              var3 = var3 ^ 7317 * this.field_m[param0];
              break L7;
            }
          }
          return var3;
        }
    }

    final int o(int param0, int param1) {
        if (param1 < (param0 ^ -1)) {
            return -1;
        }
        return this.field_yb[param0];
    }

    final int i(int param0, int param1) {
        if (null == this.field_fb) {
            return 0;
        }
        if (-1 < (param0 ^ -1) || (param0 ^ -1) <= (this.field_W ^ -1)) {
            return 0;
        }
        int var3 = 25 * param0;
        var3 = var3 + this.field_fb[this.field_yb[param0]];
        if (!((var3 ^ -1) >= (this.field_xb ^ -1))) {
            var3 = this.field_xb;
        }
        if (param1 != -12710) {
            this.field_A = -76;
        }
        return var3;
    }

    public static void c(int param0) {
        field_pb = null;
        field_nb = null;
        field_q = null;
        if (param0 != -1) {
            field_nb = (String) null;
        }
    }

    final void b(int param0) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= (this.field_z.length ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_z[var2][0] = 0;
                    this.field_z[var2][1] = 0;
                    this.field_z[var2][2] = 0;
                    var2++;
                    if (var5 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 == 2) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.a(-11, (String) null, (oj) null);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (null == this.field_Eb) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var6 = 0;
                    var2 = var6;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (this.field_Eb.length <= var6) {
                        statePc = 28;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var3 = this.o(this.field_Eb[var6].field_a, -1);
                    if (var5 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var3 <= -1) {
                        statePc = 27;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4 = this.field_Eb[var6].field_h;
                    if (7 == var4) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var4 != 14) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var5 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (9 != var4) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var5 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var4 == 8) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 23: {
                    dupTemp$0 = this.field_z[var3];
                    dupTemp$0[0] = dupTemp$0[0] + 1;
                    if (var5 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    dupTemp$1 = this.field_z[var3];
                    dupTemp$1[1] = dupTemp$1[1] + 1;
                    if (var5 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    dupTemp$2 = this.field_z[var3];
                    dupTemp$2[2] = dupTemp$2[2] + 1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var6++;
                    if (var5 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.a(1);
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

    final int a(byte param0) {
        if (param0 != 78) {
            this.f(84, -63);
        }
        return (this.field_e ^ -1) & (1 << this.field_W) + -1;
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        L0: {
          L1: {
            var4 = 0;
            var5 = this.g(param0, param1 + -2101, param2);
            if (var5 == 4) {
              break L1;
            } else {
              if (5 != var5) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if ((this.g(param0 + -1, param1 + -2139, param2) ^ -1) == (var5 ^ -1)) {
              break L2;
            } else {
              var4 = var4 | 2;
              break L2;
            }
          }
          L3: {
            if ((var5 ^ -1) != (this.g(param0, -37, param2 + 1) ^ -1)) {
              var4 = var4 | 1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if ((var5 ^ -1) != (this.g(param0, -43, -1 + param2) ^ -1)) {
              var4 = var4 | 8;
              break L4;
            } else {
              break L4;
            }
          }
          if ((var5 ^ -1) == (this.g(1 + param0, -63, param2) ^ -1)) {
            break L0;
          } else {
            var4 = var4 | 4;
            break L0;
          }
        }
        if (-7 != (var4 ^ -1)) {
          if (-10 != (var4 ^ -1)) {
            if (-3 != (var4 ^ -1)) {
              if (param1 == 2056) {
                if ((var4 ^ -1) != -5) {
                  if (-2 == (var4 ^ -1)) {
                    return 3;
                  } else {
                    if ((var4 ^ -1) != -9) {
                      return -1;
                    } else {
                      return 0;
                    }
                  }
                } else {
                  return 1;
                }
              } else {
                return -23;
              }
            } else {
              return 2;
            }
          } else {
            return 0;
          }
        } else {
          return 1;
        }
    }

    private final boolean e(byte param0) {
        int var2 = 0;
        go[] var3 = null;
        int var4 = 0;
        go var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (param0 == -42) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return true;
                }
                case 2: {
                    if (!this.field_wb) {
                        statePc = 21;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var2 = 0;
                    var3 = this.field_w;
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = var4;
                    stackIn_5_1 = var3.length;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 >= stackIn_5_1) {
                        statePc = 16;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = var3[var4];
                    var6 = var5.field_a;
                    stackIn_17_0 = 0;
                    stackIn_7_0 = stackIn_17_0;
                    if (var9 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var7 = stackIn_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var6.length <= var7) {
                        statePc = 15;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var8 = var6[var7];
                    stackIn_5_0 = this.field_e & 1 << var8 ^ -1;
                    stackIn_10_0 = stackIn_5_0;
                    stackIn_5_1 = -1;
                    stackIn_10_1 = stackIn_5_1;
                    if (var9 != 0) {
                        statePc = 5;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 != stackIn_10_1) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2++;
                    if (var9 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 != var2) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = 1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    if (eb.a((byte) -125, this.a((byte) 78)) != 1) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = 1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1) {
        int var4 = -71 % ((param0 - -15) / 37);
        go var3 = this.d(param1, -1);
        if (!(var3 == null)) {
            var3.a(3, (ha) (this));
        }
    }

    private final int a(byte param0, int param1, ne param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 0;
            if (this.a(param1, param2, 115)) {
              L1: {
                var4_int = var4_int ^ param2.field_h * 47;
                if (param2.c(-120)) {
                  var4_int = var4_int ^ 234;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param2.c((byte) -79)) {
                  var4_int = var4_int ^ 2823;
                  var4_int = var4_int ^ param2.b((byte) -71) * 75;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0 == 103) {
                  break L3;
                } else {
                  this.c(-105, 88);
                  break L3;
                }
              }
              var4_int = var4_int ^ 7657 * param2.field_a;
              stackIn_12_0 = var4_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var4_int = var4_int ^ param2.field_h;
              stackIn_2_0 = var4_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ha.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_12_0;
        }
    }

    final boolean m(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (this.field_P.a(param1, -96)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    var3 = param0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 >= this.field_W) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_11_0 = this.c(var3, param0 ^ -16985, param1);
                    stackIn_5_0 = stackIn_11_0;
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!stackIn_5_0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var4 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.b(10001, var3, true);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var3++;
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return true;
                }
                case 11: {
                    return stackIn_11_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int c(int param0, int param1, int param2, int param3) {
        if (!(0 <= param3)) {
            return 0;
        }
        if (param0 < 0 || 0 > param2 || (param0 ^ -1) <= (this.field_v ^ -1) || (param2 ^ -1) <= (this.field_db ^ -1)) {
            return 0;
        }
        ne var7 = this.field_Eb[this.field_v * param2 + param0];
        if (var7.field_c != null) {
            return 0;
        }
        int var6 = this.c(param3, -16985, var7.field_a) ? 1 : 0;
        if (var6 != 0 && 7 == var7.field_h) {
            return 65535;
        }
        if (param1 != -27300) {
            this.a(41, 1, 42, (byte) 14);
        }
        if (var6 != 0 && -12 == (var7.field_h ^ -1)) {
            return 1 << var7.field_g;
        }
        return 0;
    }

    final void a(int param0, int param1) {
        int var3;
        int var4;
        Object stackIn_8_0 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if ((this.field_W ^ -1) >= (var3 ^ -1)) {
                break L2;
              } else {
                stackIn_8_0 = this;

                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if ((((ha) (this)).field_u & 1 << var3 ^ -1) != (1 << var3 & param1 ^ -1)) {
                      this.b(10001, var3, false);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_8_0 = this;
            break L1;
          }
          ((ha) (this)).field_u = param1;
          return;
        }
    }

    final boolean a(jd param0, int param1, int param2, int param3) {
        ne var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
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
              if (param1 < 0) {
                break L1;
              } else {
                if (param2 < 0) {
                  break L1;
                } else {
                  if ((param1 ^ -1) <= (this.field_v ^ -1)) {
                    break L1;
                  } else {
                    if ((param2 ^ -1) < (this.field_db ^ -1)) {
                      break L1;
                    } else {
                      if (param3 < -117) {
                        var5 = this.field_Eb[param2 * this.field_v + param1];
                        if (null == var5.field_c) {
                          stackIn_16_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          if (param0.field_N != 51) {
                            stackIn_14_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        stackIn_9_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5_ref);

            stackIn_19_1 = new StringBuilder().append("ha.W(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final boolean b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        ne[] var6;
        int var7;
        ne var8;
        jd var9;
        int var10;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == this.field_K) {
          return false;
        } else {
          if (!param1) {
            var4 = 0;
            var5 = 0;
            if (param2 == -1) {
              var6 = this.field_Eb;
              var7 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var6.length <= var7) {
                      break L2;
                    } else {
                      var8 = var6[var7];
                      stackIn_24_0 = var8.field_a;

                      stackIn_24_1 = param0;

                      if (var10 != 0) {
                        break L1;
                      } else {
                        L3: {
                          if (stackIn_24_0 != stackIn_24_1) {
                            break L3;
                          } else {
                            L4: {
                              if (7 == var8.field_h) {
                                break L4;
                              } else {
                                if (11 != var8.field_h) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              var4 = 1;
                              var9 = var8.field_c;
                              if (var9 == null) {
                                break L5;
                              } else {
                                if (!this.c(var9.field_O, -16985, param0)) {
                                  break L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var5 = 1;
                            break L3;
                          }
                        }
                        var7++;
                        if (var10 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L6: {
                    if (var5 != 0) {
                      break L6;
                    } else {
                      if (var4 != 0) {
                        this.field_A = this.field_A + 1;
                        stackIn_24_0 = -4;
                        stackIn_24_1 = this.field_A ^ -1;
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                  this.field_A = 0;
                  return false;
                }
                if (stackIn_24_0 >= stackIn_24_1) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            this.field_A = 0;
            return false;
          }
        }
    }

    final void a(int param0) {
        int discarded$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_64_0 = 0;
        boolean stackIn_67_0 = false;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        boolean stackOut_7_0;
        boolean stackOut_66_0;
        int statePc = 0;
        int var2_int = 0;
        int[] var2 = null;
        go[] var3_ref_go__ = null;
        int var3 = 0;
        int var4 = 0;
        go var5_ref_go = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (this.field_wb) {
                        statePc = 2;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_K == null) {
                        statePc = 23;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!this.field_qb) {
                        statePc = 23;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2_int = 0;
                    var3_ref_go__ = this.field_w;
                    var4 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = var4;
                    stackIn_6_1 = var3_ref_go__.length;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (stackIn_6_0 >= stackIn_6_1) {
                        statePc = 18;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5_ref_go = var3_ref_go__[var4];
                    stackOut_7_0 = var5_ref_go.a(this.field_K.field_w, (byte) -100);
                    stackIn_19_0 = stackOut_7_0 ? 1 : 0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var9 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0) {
                        statePc = 17;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var16 = var5_ref_go.field_a;
                    var7 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var7 >= var16.length) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var8 = var16[var7];
                    stackIn_6_0 = -1;
                    stackIn_12_0 = stackIn_6_0;
                    stackIn_6_1 = this.field_e & 1 << var8 ^ -1;
                    stackIn_12_1 = stackIn_6_1;
                    if (var9 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 == stackIn_12_1) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2_int = 1;
                    if (var9 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_R = 1;
                    stackIn_19_0 = var2_int;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.field_p[0] = 0;
                    this.field_p[1] = 1;
                    if (var9 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_p[0] = 1;
                    this.field_p[1] = 0;
                    return;
                }
                case 23: {
                    if (this.d((byte) 125)) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_p[1] = 0;
                    this.field_p[0] = 1;
                    if (var9 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_p[1] = 1;
                    this.field_p[0] = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var2_int = 0;
                    var4 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if ((var4 ^ -1) <= (this.field_tb ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_34_0 = this.field_xb ^ -1;
                    stackIn_30_0 = stackIn_34_0;
                    if (var9 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 < (this.field_fb[var4] ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var2_int++;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var3 = stackIn_34_0;
                    var4 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var4 >= this.field_W) {
                        statePc = 41;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_42_0 = this.field_mb[var4];
                    stackIn_37_0 = stackIn_42_0;
                    stackIn_42_1 = this.field_O;
                    stackIn_37_1 = stackIn_42_1;
                    if (var9 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (stackIn_37_0 >= stackIn_37_1) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var3 = 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_R = var2_int;
                    stackIn_42_0 = -1;
                    stackIn_42_1 = this.field_R ^ -1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 != stackIn_42_1) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var3 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.field_R = 1;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (0 != this.field_R) {
                        statePc = 107;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (this.e((byte) -42)) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_R = 1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    return;
                }
                case 51: {
                    if (!this.field_X) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (!this.field_b) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return;
                }
                case 55: {
                    var14 = this.d(10326);
                    var12 = var14;
                    var10 = var12;
                    var2 = var10;
                    var3 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (this.field_W <= var3) {
                        statePc = 60;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    this.field_p[var3] = var3;
                    var3++;
                    if (var9 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var9 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var3 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (-1 + this.field_W <= var3) {
                        statePc = 72;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var4 = var3;
                    stackIn_73_0 = 1 + var3;
                    stackIn_64_0 = stackIn_73_0;
                    if (var9 != 0) {
                        statePc = 73;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var5 = stackIn_64_0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (this.field_W <= var5) {
                        statePc = 70;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = this.a(var14, this.field_p[var4], -24107, this.field_p[var5]);
                    stackIn_71_0 = stackOut_66_0 ? 1 : 0;
                    stackIn_67_0 = stackOut_66_0;
                    if (var9 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (!stackIn_67_0) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var4 = var5;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = this.field_p[var3];
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var5 = stackIn_71_0;
                    this.field_p[var3] = this.field_p[var4];
                    this.field_p[var4] = var5;
                    var3++;
                    if (var9 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var3 = 0;
                    var4 = 0;
                    stackIn_73_0 = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    var5 = stackIn_73_0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (this.field_W <= var5) {
                        statePc = 84;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_85_0 = 1 << var5 & this.field_e ^ -1;
                    stackIn_76_0 = stackIn_85_0;
                    stackIn_85_1 = -1;
                    stackIn_76_1 = stackIn_85_1;
                    if (var9 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (stackIn_76_0 == stackIn_76_1) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var9 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (this.field_fb[var5] < this.field_xb) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var3++;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (this.field_mb[var5] < this.field_O) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var4 = 1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackIn_85_0 = param0;
                    stackIn_85_1 = 1;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (stackIn_85_0 == stackIn_85_1) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    discarded$0 = this.f((byte) 28);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    this.field_R = var3;
                    if (this.field_R != 0) {
                        statePc = 99;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (var4 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var5 = -1;
                    var6 = 0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if ((var6 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackIn_100_0 = this.field_fb[var6] ^ -1;
                    stackIn_93_0 = stackIn_100_0;
                    stackIn_100_1 = var5 ^ -1;
                    stackIn_93_1 = stackIn_100_1;
                    if (var9 != 0) {
                        statePc = 100;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (stackIn_93_0 == stackIn_93_1) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if ((var5 ^ -1) > (this.field_fb[var6] ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_R = 1;
                    var5 = this.field_fb[var6];
                    if (var9 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    this.field_R = this.field_R + 1;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    var6++;
                    if (var9 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackIn_100_0 = 0;
                    stackIn_100_1 = this.field_R;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 != stackIn_100_1) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (this.e((byte) -42)) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (this.field_K != null) {
                        statePc = 105;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 105: {
                    this.field_R = 1;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    return;
                }
                case 107: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.a(param1, false, param0, param3);
        this.a(param1, false, 1 + param0, param3);
        this.a(1 + param1, false, param0, param3);
        if (param2 != -13) {
            return;
        }
        this.a(1 + param1, false, 1 + param0, param3);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ne var5;
        ne var6;
        if (param0 > 19) {
          if (0 > param3) {
            return;
          } else {
            L0: {
              if (-1 < (param2 ^ -1)) {
                break L0;
              } else {
                if (param3 >= this.field_v) {
                  break L0;
                } else {
                  if (this.field_db <= param2) {
                    break L0;
                  } else {
                    L1: {
                      L2: {
                        L3: {
                          var6 = this.field_Eb[this.field_v * param2 + param3];
                          var5 = var6;
                          if (null == var6.field_c) {
                            break L3;
                          } else {
                            if (var6.field_c.field_N != 20) {
                              break L1;
                            } else {
                              if (!this.c(var6.field_c.field_O, -16985, param1)) {
                                break L2;
                              } else {
                                var6.field_c.field_Y = var6.field_c.field_t;
                                if (!ArmiesOfGielinor.field_M) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        if (var6.c(89)) {
                          var5.field_c = new jd(param3, param2, 20, param1, 15, 15, 1, 0, 0, (ha) (this), 0, 0, -1, false, 0);
                          var6.i(14);
                          this.a(8288, var6.field_c);
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                      break L1;
                    }
                    return;
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

    ha(int param0, String[] param1, int param2, int[][] param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, boolean param10, int[][] param11, int param12, int param13, int param14, om param15) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int[] array$2 = null;
        int[] array$3 = null;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int[] array$6 = null;
        int incrementValue$7 = 0;
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
        Object stackIn_14_0 = null;
        Object stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        Object stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        Object stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_179_0 = 0;
        int stackIn_179_1 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_207_0 = 0;
        int stackIn_207_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_220_0 = 0;
        RuntimeException stackIn_225_0 = null;
        StringBuilder stackIn_225_1 = null;
        RuntimeException stackIn_226_0 = null;
        StringBuilder stackIn_226_1 = null;
        RuntimeException stackIn_227_0 = null;
        StringBuilder stackIn_227_1 = null;
        String stackIn_227_2 = null;
        RuntimeException stackIn_228_0 = null;
        StringBuilder stackIn_228_1 = null;
        RuntimeException stackIn_229_0 = null;
        StringBuilder stackIn_229_1 = null;
        RuntimeException stackIn_230_0 = null;
        StringBuilder stackIn_230_1 = null;
        String stackIn_230_2 = null;
        RuntimeException stackIn_231_0 = null;
        StringBuilder stackIn_231_1 = null;
        RuntimeException stackIn_232_0 = null;
        StringBuilder stackIn_232_1 = null;
        RuntimeException stackIn_233_0 = null;
        StringBuilder stackIn_233_1 = null;
        String stackIn_233_2 = null;
        RuntimeException stackIn_234_0 = null;
        StringBuilder stackIn_234_1 = null;
        RuntimeException stackIn_235_0 = null;
        StringBuilder stackIn_235_1 = null;
        RuntimeException stackIn_236_0 = null;
        StringBuilder stackIn_236_1 = null;
        String stackIn_236_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var17_int = 0;
        int[] var17 = null;
        RuntimeException var17_ref = null;
        int var18 = 0;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var21_ref_int__ = null;
        int var22 = 0;
        int var23 = 0;
        String var23_ref_String = null;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        sd var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var25 = ArmiesOfGielinor.field_M ? 1 : 0;
                    this.field_ab = 1;
                    this.field_R = 0;
                    this.field_eb = false;
                    this.field_bb = 1.0f;
                    this.field_Z = null;
                    this.field_Cb = false;
                    this.field_D = 0;
                    this.field_J = false;
                    this.field_o = false;
                    this.field_V = true;
                    this.field_Bb = false;
                    this.field_T = null;
                    this.field_A = 0;
                    this.field_r = true;
                    this.field_qb = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_k = new at();
                    stackIn_3_0 = this;
                    stackIn_2_0 = stackIn_3_0;
                    if (!param5) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    ((ha) (this)).field_Ab = stackIn_4_1 != 0;
                    stackIn_6_0 = this;
                    stackIn_5_0 = stackIn_6_0;
                    if (!param10) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    ((ha) (this)).field_wb = stackIn_7_1 != 0;
                    this.field_W = param1.length;
                    this.field_K = param15;
                    this.field_cb = param7;
                    this.field_vb = param8;
                    stackIn_9_0 = this;
                    stackIn_8_0 = stackIn_9_0;
                    if (this.field_wb) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = this;
                    stackIn_10_1 = this.field_W;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 2;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    ((ha) (this)).field_tb = stackIn_10_1;
                    this.field_hb = param9;
                    this.field_Q = param12;
                    stackIn_12_0 = this;
                    stackIn_11_0 = stackIn_12_0;
                    if (-1 <= (param13 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = this;
                    stackIn_13_1 = 1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = this;
                    stackIn_13_1 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    ((ha) (this)).field_L = stackIn_13_1 != 0;
                    stackIn_15_0 = this;
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = this;
                    stackIn_14_1 = stackIn_15_1;
                    if (this.field_K != null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = this;
                    stackIn_16_1 = this;
                    stackIn_16_2 = 1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = this;
                    stackIn_16_1 = this;
                    stackIn_16_2 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    ((ha) (this)).field_V = stackIn_16_2 != 0;
                    ((ha) (this)).field_r = stackIn_16_2 != 0;
                    this.field_P = new tt(this.field_W);
                    if (-1 >= (this.field_cb ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_cb = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (this.field_K != null) {
                        statePc = 32;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (2 >= this.field_W) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (1 <= this.field_cb) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_cb = 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (-5 <= (this.field_W ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (2 <= this.field_cb) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_cb = 2;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (-7 <= (this.field_W ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-4 >= (this.field_cb ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_cb = 3;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    this.field_kb = false;
                    if ((this.field_W ^ -1) <= -5) {
                        statePc = 36;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_cb <= 2) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((this.field_cb ^ -1) == -5) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.field_cb = 2;
                    if (var25 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = this;
                    stackIn_33_0 = stackIn_34_0;
                    if ((mh.a(this.field_K.field_G.field_r, -126, this.field_K.field_v) ^ -1) != -1) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = this;
                    stackIn_35_1 = 1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = this;
                    stackIn_35_1 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    ((ha) (this)).field_kb = stackIn_35_1 != 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    this.field_jb = ns.a(false, 2147483647, li.field_n);
                    this.field_w = new go[this.field_tb];
                    this.field_yb = new int[this.field_W];
                    this.field_ib = param0;
                    if (!this.field_wb) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (null == this.field_K) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var17_int = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var17_int >= this.field_W) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.field_w[var17_int] = new go(param1[var17_int], new int[]{var17_int});
                    this.field_yb[var17_int] = var17_int;
                    var17_int++;
                    if (var25 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var25 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var25 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var31 = new int[this.field_W / 2];
                    var26 = var31;
                    var17 = var26;
                    var18 = 0;
                    var32 = new int[this.field_W / 2];
                    var27 = var32;
                    var19_ref_int__ = var27;
                    var20 = 0;
                    var21 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var21 >= this.field_W) {
                        statePc = 50;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_51_0 = var21 & 1 ^ -1;
                    stackIn_46_0 = stackIn_51_0;
                    stackIn_51_1 = -1;
                    stackIn_46_1 = stackIn_51_1;
                    if (var25 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 != stackIn_46_1) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    incrementValue$0 = var18;
                    var18++;
                    var17[incrementValue$0] = var21;
                    this.field_yb[var21] = 0;
                    if (var25 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    incrementValue$1 = var20;
                    var20++;
                    var19_ref_int__[incrementValue$1] = var21;
                    this.field_yb[var21] = 1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var21++;
                    if (var25 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = var20;
                    stackIn_51_1 = var18;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (stackIn_51_0 == stackIn_51_1) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    throw new IllegalStateException("");
                }
                case 53: {
                    this.field_w[0] = new go(om.field_p, var31);
                    this.field_w[1] = new go(vj.field_n, var32);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    this.field_l = new at();
                    this.field_c = new int[this.field_W][3];
                    this.field_E = new int[this.field_W][7];
                    this.field_lb = param1;
                    this.field_gb = param2;
                    this.field_n = new int[this.field_W];
                    this.field_H = new int[this.field_W];
                    this.field_db = 0;
                    stackIn_56_0 = this;
                    stackIn_55_0 = stackIn_56_0;
                    if (!param6) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_57_0 = this;
                    stackIn_57_1 = 1;
                    statePc = 57;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = this;
                    stackIn_57_1 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    ((ha) (this)).field_x = stackIn_57_1 != 0;
                    this.field_fb = new int[this.field_tb];
                    this.field_m = new int[this.field_W];
                    this.field_p = new int[this.field_tb];
                    this.field_t = new at[this.field_W];
                    this.field_sb = param4;
                    this.field_a = param3;
                    this.field_v = 0;
                    stackIn_59_0 = this;
                    stackIn_58_0 = stackIn_59_0;
                    if (!param5) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = this;
                    stackIn_60_1 = 1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = this;
                    stackIn_60_1 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    ((ha) (this)).field_b = stackIn_60_1 != 0;
                    this.field_S = new int[this.field_tb];
                    this.field_z = new int[this.field_tb][3];
                    this.field_mb = new int[this.field_W];
                    this.field_s = new int[3];
                    this.field_U = new int[this.field_W];
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (!this.field_b) {
                        statePc = 109;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (param11 != null) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.field_B = (int[][]) null;
                    if (var25 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if ((param11.length ^ -1) == -2) {
                        statePc = 81;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    this.field_B = new int[this.field_W][];
                    var17_int = 0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (var17_int >= this.field_W) {
                        statePc = 80;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var18 = param11[var17_int].length;
                    stackIn_92_0 = var18;
                    stackIn_68_0 = stackIn_92_0;
                    stackIn_92_1 = 5;
                    stackIn_68_1 = stackIn_92_1;
                    if (var25 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (stackIn_68_0 >= stackIn_68_1) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var18 = 5;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    array$2 = new int[var18];
                    this.field_B[var17_int] = array$2;
                    var19 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if ((param11[var17_int].length ^ -1) >= (var19 ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    this.field_B[var17_int][var19] = param11[var17_int][var19];
                    var19++;
                    if (var25 != 0) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var25 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var19 = param11[var17_int].length;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (var18 <= var19) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    this.field_B[var17_int][var19] = -1;
                    var19++;
                    if (var25 != 0) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var25 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var17_int++;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var25 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var25 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_B = new int[this.field_W][5];
                    var17_int = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if ((this.field_W ^ -1) >= (var17_int ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackIn_91_0 = 0;
                    stackIn_84_0 = stackIn_91_0;
                    if (var25 != 0) {
                        statePc = 91;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var18 = stackIn_84_0;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var18 >= 5) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    this.field_B[var17_int][var18] = param11[0][var18];
                    var18++;
                    if (var25 != 0) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (var25 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var17_int++;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (var25 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackIn_91_0 = param3.length ^ -1;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    stackIn_92_0 = stackIn_91_0;
                    stackIn_92_1 = -2;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (stackIn_92_0 == stackIn_92_1) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    this.field_a = param3;
                    if (var25 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    this.field_a = new int[this.field_W][];
                    var17_int = 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (var17_int >= this.field_W) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_a[var17_int] = param3[0];
                    var17_int++;
                    if (var25 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var25 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    this.field_d = new int[16];
                    this.field_N = new int[16];
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var17_int = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (var17_int >= 16) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.field_N[var17_int] = -1;
                    var17_int++;
                    if (var25 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var25 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    this.field_d[15] = 2;
                    this.field_d[12] = 30;
                    this.field_d[4] = 5;
                    this.field_d[10] = 500;
                    this.field_Y = new int[this.field_W];
                    this.field_M = new int[this.field_W];
                    this.field_g = new int[this.field_W];
                    this.field_h = new int[this.field_W];
                    this.field_d[14] = 2;
                    this.field_d[5] = 5;
                    this.field_d[8] = 5;
                    this.field_ob = new int[this.field_W];
                    this.field_d[7] = 3;
                    this.field_d[6] = 3;
                    this.field_d[11] = 30;
                    this.field_ub = new int[this.field_W];
                    this.field_d[0] = 1;
                    this.field_zb = new int[this.field_W];
                    this.field_y = new int[this.field_W];
                    this.field_d[13] = 10;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var17_int = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((var17_int ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    this.field_ub[var17_int] = 0;
                    this.field_g[var17_int] = 0;
                    this.field_h[var17_int] = 0;
                    this.field_Y[var17_int] = 0;
                    this.field_zb[var17_int] = 0;
                    this.field_ob[var17_int] = 0;
                    this.field_M[var17_int] = 0;
                    this.field_y[var17_int] = 0;
                    var17_int++;
                    if (var25 != 0) {
                        statePc = 112;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var25 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var25 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    this.field_a = new int[this.field_W][];
                    if (0 > param4) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (param4 >= this.field_a.length) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    this.field_a[param4] = param3[0];
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var17_int = 0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if ((var17_int ^ -1) <= (this.field_tb ^ -1)) {
                        statePc = 116;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    this.field_z[var17_int][0] = 0;
                    this.field_z[var17_int][1] = 0;
                    this.field_z[var17_int][2] = 0;
                    this.field_p[var17_int] = var17_int;
                    this.field_fb[var17_int] = 0;
                    var17_int++;
                    if (var25 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (var25 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var17_int = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    stackIn_118_0 = this.field_W;
                    stackIn_118_1 = var17_int;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (stackIn_118_0 <= stackIn_118_1) {
                        statePc = 158;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    this.field_n[var17_int] = -1;
                    this.field_t[var17_int] = new at();
                    stackIn_220_0 = 0;
                    stackIn_120_0 = stackIn_220_0;
                    if (var25 != 0) {
                        statePc = 220;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (stackIn_120_0 == var17_int) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    this.field_H[var17_int] = 200;
                    if (var25 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    this.field_H[var17_int] = 150;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    this.field_mb[var17_int] = 0;
                    var18 = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if ((var18 ^ -1) <= (this.field_E[var17_int].length ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    this.field_E[var17_int][var18] = 0;
                    var18++;
                    if (var25 != 0) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (var25 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (this.field_b) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (var17_int != this.field_sb) {
                        statePc = 132;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (this.field_a[var17_int][4] != 0) {
                        statePc = 132;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (0 != this.field_a[var17_int][5]) {
                        statePc = 132;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (0 == this.field_a[var17_int][6]) {
                        statePc = 152;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (this.field_L) {
                        statePc = 138;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var18 = 0;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if ((var18 ^ -1) <= -4) {
                        statePc = 137;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    this.field_c[var17_int][var18] = -1;
                    var18++;
                    if (var25 != 0) {
                        statePc = 157;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var25 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var25 == 0) {
                        statePc = 156;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var18 = 4;
                    var19 = 4;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if ((this.field_a[var17_int].length ^ -1) >= (var19 ^ -1)) {
                        statePc = 144;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    stackIn_145_0 = this.field_a[var17_int][var19];
                    stackIn_141_0 = stackIn_145_0;
                    if (var25 != 0) {
                        statePc = 145;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (stackIn_141_0 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var18++;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var19++;
                    if (var25 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    array$3 = new int[var18];
                    this.field_c[var17_int] = array$3;
                    var19 = 0;
                    stackIn_145_0 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    var20 = stackIn_145_0;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if ((this.field_a[var17_int].length ^ -1) >= (var20 ^ -1)) {
                        statePc = 151;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackIn_118_0 = 0;
                    stackIn_148_0 = stackIn_118_0;
                    stackIn_118_1 = this.field_a[var17_int][var20];
                    stackIn_148_1 = stackIn_118_1;
                    if (var25 != 0) {
                        statePc = 118;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (stackIn_148_0 == stackIn_148_1) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    incrementValue$4 = var19;
                    var19++;
                    this.field_c[var17_int][incrementValue$4] = var20;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var20++;
                    if (var25 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var25 == 0) {
                        statePc = 156;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var18 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (-4 >= (var18 ^ -1)) {
                        statePc = 156;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    this.field_c[var17_int][var18] = var18;
                    this.field_E[var17_int][this.field_c[var17_int][var18]] = 1;
                    var18++;
                    if (var25 != 0) {
                        statePc = 157;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (var25 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    this.field_E[var17_int][6] = 1;
                    this.field_m[var17_int] = lf.field_i[this.field_Q];
                    var17_int++;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (var25 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (null == this.field_K) {
                        statePc = 219;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var33 = this.field_K.a((byte) -46);
                    var28 = var33;
                    var17 = var28;
                    if (var17 == null) {
                        statePc = 191;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    this.field_tb = 0;
                    this.field_wb = true;
                    var18 = 0;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if ((var18 ^ -1) <= (var33.length ^ -1)) {
                        statePc = 166;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    stackIn_168_0 = var33[var18];
                    stackIn_163_0 = stackIn_168_0;
                    stackIn_168_1 = this.field_tb;
                    stackIn_163_1 = stackIn_168_1;
                    if (var25 != 0) {
                        statePc = 168;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (stackIn_163_0 <= stackIn_163_1) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    this.field_tb = var33[var18];
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var18++;
                    if (var25 == 0) {
                        statePc = 161;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    this.field_tb = this.field_tb + 1;
                    this.field_w = new go[this.field_tb];
                    var18 = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    stackIn_168_0 = var18 ^ -1;
                    stackIn_168_1 = this.field_tb ^ -1;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if (stackIn_168_0 <= stackIn_168_1) {
                        statePc = 191;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var19 = 0;
                    var20 = 0;
                    stackIn_192_0 = 0;
                    stackIn_170_0 = stackIn_192_0;
                    if (var25 != 0) {
                        statePc = 192;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var21 = stackIn_170_0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if ((var21 ^ -1) <= (var33.length ^ -1)) {
                        statePc = 178;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    stackIn_179_0 = var33[var21];
                    stackIn_173_0 = stackIn_179_0;
                    stackIn_179_1 = var18;
                    stackIn_173_1 = stackIn_179_1;
                    if (var25 != 0) {
                        statePc = 179;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 != stackIn_173_1) {
                        statePc = 177;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if ((var21 ^ -1) != (this.field_K.field_w ^ -1)) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var19 = 1;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    var20++;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    var21++;
                    if (var25 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    stackIn_179_0 = var20 ^ -1;
                    stackIn_179_1 = -1;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (stackIn_179_0 != stackIn_179_1) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    throw new IllegalStateException("");
                }
                case 181: {
                    var34 = new int[var20];
                    var29 = var34;
                    var21_ref_int__ = var29;
                    var22 = 0;
                    var23 = 0;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (var23 >= var33.length) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    stackIn_168_0 = var33[var23];
                    stackIn_184_0 = stackIn_168_0;
                    stackIn_168_1 = var18;
                    stackIn_184_1 = stackIn_168_1;
                    if (var25 != 0) {
                        statePc = 168;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (stackIn_184_0 != stackIn_184_1) {
                        statePc = 186;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    incrementValue$5 = var22;
                    var22++;
                    var21_ref_int__[incrementValue$5] = var23;
                    this.field_yb[var23] = var18;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    var23++;
                    if (var25 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (var19 != 0) {
                        statePc = 189;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var23_ref_String = param1[var34[0]];
                    statePc = 190;
                    continue stateLoop;
                }
                case 189: {
                    var23_ref_String = param1[this.field_K.field_w];
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    this.field_w[var18] = new go(var23_ref_String, var34);
                    var18++;
                    if (var25 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    stackIn_192_0 = 0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    var18 = stackIn_192_0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if ((var18 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 218;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    stackIn_220_0 = this.field_K.field_w ^ -1;
                    stackIn_195_0 = stackIn_220_0;
                    if (var25 != 0) {
                        statePc = 220;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (stackIn_195_0 != (var18 ^ -1)) {
                        statePc = 197;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    this.field_c[var18] = new int[]{this.field_K.field_G.field_s};
                    if (var25 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var30 = this.field_K.field_G.field_q[this.field_K.field_B[var18]];
                    var20 = 0;
                    var21 = 1;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if ((var21 ^ -1) <= (this.field_a[var18].length ^ -1)) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    stackIn_204_0 = this.field_a[var18][var21];
                    stackIn_200_0 = stackIn_204_0;
                    if (var25 != 0) {
                        statePc = 204;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (stackIn_200_0 == 0) {
                        statePc = 202;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var20++;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    var21++;
                    if (var25 == 0) {
                        statePc = 198;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    array$6 = new int[var20];
                    this.field_c[var18] = array$6;
                    var21 = 0;
                    stackIn_204_0 = 0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    var22 = stackIn_204_0;
                    var23 = 1;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (var23 >= this.field_a[var18].length) {
                        statePc = 214;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var24 = var30.field_t[var23 - 1];
                    stackIn_215_0 = this.field_a[var18][var23] ^ -1;
                    stackIn_207_0 = stackIn_215_0;
                    stackIn_215_1 = -1;
                    stackIn_207_1 = stackIn_215_1;
                    if (var25 != 0) {
                        statePc = 215;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (stackIn_207_0 != stackIn_207_1) {
                        statePc = 210;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (var22 >= var24) {
                        statePc = 213;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var22 = var24;
                    if (var25 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    this.field_E[var18][-1 + var23] = var24;
                    if ((this.field_E[var18][-1 + var23] ^ -1) >= (this.field_E[var18][0] ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    this.field_E[var18][0] = this.field_E[var18][var23 + -1];
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    incrementValue$7 = var21;
                    var21++;
                    this.field_c[var18][incrementValue$7] = var23 - 1;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    var23++;
                    if (var25 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    stackIn_215_0 = var22 ^ -1;
                    stackIn_215_1 = -1;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (stackIn_215_0 >= stackIn_215_1) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    this.field_E[var18][6] = var22;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    var18++;
                    if (var25 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    this.field_Cb = true;
                    this.field_D = 3;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    stackIn_220_0 = this.field_b ? 1 : 0;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (stackIn_220_0 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    this.field_jb = ns.a(false, 2147483647, li.field_n);
                    this.l(0, 0);
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    this.field_O = this.b((byte) 32);
                    this.f(-2);
                    this.field_xb = this.f((byte) -80);
                    this.field_F = false;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
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
        RuntimeException var3_ref = null;
        try {
          L0: {
            param2 = ia.a(param2, '_', 3, "");
            if (param1 == -26) {
              L1: {
                L2: {
                  var3 = nf.a(true, param2);
                  if ((param0.indexOf(param2) ^ -1) != 0) {
                    break L2;
                  } else {
                    if (0 == (param0.indexOf(var3) ^ -1)) {
                      stackIn_8_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_8_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("ha.ID(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_q = "AnimationEvent";
        field_nb = "Loading graphics";
        field_pb = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
