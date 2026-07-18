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
        if (~param0 > param1) {
            return null;
        }
        if (param0 > ((ha) this).field_yb.length) {
            return null;
        }
        return ((ha) this).field_w[((ha) this).field_yb[param0]];
    }

    final void a(int param0, jd param1) {
        tc var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((ha) this).field_t.length <= param1.field_O) {
              return;
            } else {
              L1: {
                ((ha) this).field_t[param1.field_O].a((byte) -119, (tc) (Object) param1);
                if (param0 == 8288) {
                  break L1;
                } else {
                  ((ha) this).l(-73, -26);
                  break L1;
                }
              }
              var3 = ((ha) this).field_k.e((byte) 96);
              L2: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  L3: {
                    if (!(var3 instanceof mm)) {
                      break L3;
                    } else {
                      ((mm) (Object) var3).a(param1, (byte) -2);
                      break L3;
                    }
                  }
                  var3 = ((ha) this).field_k.a((byte) 123);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("ha.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void a(jd param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        jd stackIn_4_0 = null;
        jd stackIn_5_0 = null;
        jd stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jd stackIn_7_0 = null;
        jd stackIn_8_0 = null;
        jd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        jd stackIn_10_0 = null;
        jd stackIn_11_0 = null;
        jd stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd stackOut_3_0 = null;
        jd stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jd stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        jd stackOut_6_0 = null;
        jd stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        jd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        jd stackOut_9_0 = null;
        jd stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        jd stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -87) {
                break L1;
              } else {
                ((ha) this).field_cb = -63;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                L3: {
                  var3_int = ((ha) this).b(31, param0.field_w, param0.field_J, param0.field_O);
                  stackOut_3_0 = (jd) param0;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if ((16 & var3_int) == 0) {
                    stackOut_5_0 = (jd) (Object) stackIn_5_0;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L3;
                  } else {
                    stackOut_4_0 = (jd) (Object) stackIn_4_0;
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L3;
                  }
                }
                L4: {
                  stackIn_6_0.field_v = stackIn_6_1 != 0;
                  stackOut_6_0 = (jd) param0;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if ((4 & var3_int) == 0) {
                    stackOut_8_0 = (jd) (Object) stackIn_8_0;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L4;
                  } else {
                    stackOut_7_0 = (jd) (Object) stackIn_7_0;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L4;
                  }
                }
                L5: {
                  stackIn_9_0.field_Z = stackIn_9_1 != 0;
                  stackOut_9_0 = (jd) param0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if ((var3_int & 8) == 0) {
                    stackOut_11_0 = (jd) (Object) stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L5;
                  } else {
                    stackOut_10_0 = (jd) (Object) stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L5;
                  }
                }
                stackIn_12_0.field_eb = stackIn_12_1 != 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ha.DA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, jd param4, boolean param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param1 == -16) {
                break L1;
              } else {
                ((ha) this).field_w = null;
                break L1;
              }
            }
            int discarded$2 = 1;
            stackOut_2_0 = pj.a(((ha) this).field_v, ((ha) this).field_Eb, param5, param2, param3, ((ha) this).field_db, ((ha) this).o(param3, param1 ^ 15), param4, param0, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("ha.VD(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, byte[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (-7 < param1.length) {
                  break L1;
                } else {
                  L2: {
                    var3_int = param0 * 12 + 6;
                    if (-1 == (128 & param1[var3_int])) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L2;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = stackIn_8_0;
                    if (var5 == 0) {
                      var3_int++;
                      var4 = 255 & param1[var3_int];
                      break L3;
                    } else {
                      var3_int++;
                      var3_int++;
                      var4 = param1[var3_int] & 255;
                      break L3;
                    }
                  }
                  stackOut_11_0 = var4 / param0 - -1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ha.GC(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + false + ')');
        }
        return stackIn_12_0;
    }

    final void b(byte param0, int param1, int param2, int param3) {
        ((ha) this).field_Eb[param2 - -(param3 * ((ha) this).field_v)].field_h = param1;
        ((ha) this).field_Eb[param3 * ((ha) this).field_v + param2].field_b = true;
        int var5 = 96 % ((59 - param0) / 34);
    }

    final at a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        jd var5_ref_jd = null;
        int var5 = 0;
        int var6_int = 0;
        jd var6 = null;
        ne var7 = null;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = null;
          if (!((ha) this).field_b) {
            break L0;
          } else {
            var4 = (Object) (Object) new at();
            break L0;
          }
        }
        int discarded$3 = -15;
        this.g();
        if (param0) {
          return (at) var4;
        } else {
          L1: {
            var5_ref_jd = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].e((byte) 116);
            if (param2 == 0) {
              break L1;
            } else {
              ((ha) this).field_o = false;
              break L1;
            }
          }
          L2: while (true) {
            if (var5_ref_jd == null) {
              var5_ref_jd = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].e((byte) 102);
              L3: while (true) {
                if (var5_ref_jd == null) {
                  L4: {
                    if (param1) {
                      int discarded$4 = 108;
                      this.h();
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var5_ref_jd = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].d((byte) -81);
                  L5: while (true) {
                    if (var5_ref_jd == null) {
                      L6: {
                        if (!param1) {
                          break L6;
                        } else {
                          var5 = 0;
                          var6 = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].e((byte) 102);
                          L7: while (true) {
                            if (var6 == null) {
                              if (var5 >= 25) {
                                ((at) var4).a((byte) -119, (tc) (Object) new kj(((ha) this).field_gb, ((ha) this).field_W));
                                break L6;
                              } else {
                                break L6;
                              }
                            } else {
                              L8: {
                                if (var6.field_N == 20) {
                                  var5++;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              var6 = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].a((byte) 123);
                              continue L7;
                            }
                          }
                        }
                      }
                      return (at) var4;
                    } else {
                      L9: {
                        if (!var5_ref_jd.field_S) {
                          L10: {
                            if (!param1) {
                              break L10;
                            } else {
                              L11: {
                                if (!var5_ref_jd.t(26440)) {
                                  break L11;
                                } else {
                                  ((at) var4).a((byte) -119, (tc) (Object) new il(var5_ref_jd.field_J, var5_ref_jd.field_w, var5_ref_jd, ((ha) this).field_Eb[var5_ref_jd.field_w * ((ha) this).field_v + var5_ref_jd.field_J]));
                                  break L11;
                                }
                              }
                              L12: {
                                if (!var5_ref_jd.e((byte) 79)) {
                                  break L12;
                                } else {
                                  if (((ha) this).field_H[var5_ref_jd.field_O] < 10) {
                                    ((at) var4).a((byte) -119, (tc) (Object) new pl(var5_ref_jd.field_O, var5_ref_jd, 0));
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (var5_ref_jd.field_N != 10) {
                                break L10;
                              } else {
                                if (!((ha) this).field_Eb[var5_ref_jd.field_J + var5_ref_jd.field_w * ((ha) this).field_v].c(93)) {
                                  break L10;
                                } else {
                                  if (var5_ref_jd.field_t != 19) {
                                    break L10;
                                  } else {
                                    ((at) var4).a((byte) -119, (tc) (Object) new dk(var5_ref_jd.field_O, ((ha) this).field_W));
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                          var5_ref_jd.k(-1);
                          if (!param1) {
                            break L9;
                          } else {
                            int discarded$5 = 108;
                            this.h();
                            ((ha) this).d(((ha) this).field_gb, ((ha) this).field_t[((ha) this).field_gb].b(false), 91, 13);
                            ((ha) this).d(((ha) this).field_gb, ((ha) this).field_ob[((ha) this).field_gb], param2 ^ 82, 12);
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                      var5_ref_jd = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].b((byte) 100);
                      continue L5;
                    }
                  }
                } else {
                  var5_ref_jd.n((byte) -42);
                  var5_ref_jd = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].a((byte) 123);
                  continue L3;
                }
              }
            } else {
              L13: {
                if (!var5_ref_jd.i(-21428)) {
                  break L13;
                } else {
                  if (!var5_ref_jd.t(param2 + 26440)) {
                    var6_int = var5_ref_jd.field_J - -(var5_ref_jd.field_w * ((ha) this).field_v);
                    if (var5_ref_jd.field_J < 0) {
                      break L13;
                    } else {
                      if (((ha) this).field_Eb.length <= var5_ref_jd.field_J) {
                        break L13;
                      } else {
                        if (var5_ref_jd.field_w < 0) {
                          break L13;
                        } else {
                          if (var5_ref_jd.field_w < ((ha) this).field_Eb.length) {
                            var7 = ((ha) this).field_Eb[var6_int];
                            if (!var7.a(false)) {
                              break L13;
                            } else {
                              L14: {
                                if (var7.field_a < 0) {
                                  break L14;
                                } else {
                                  if (!((ha) this).c(var7.field_a, -16985, ((ha) this).field_gb)) {
                                    break L14;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var7.field_m = var7.field_m - var5_ref_jd.g((byte) 122);
                              if (var7.field_m <= 0) {
                                if (((ha) this).field_b) {
                                  if (param1) {
                                    ((at) var4).a((byte) -119, (tc) (Object) new ss(var5_ref_jd.field_J, var5_ref_jd.field_w, 0, ((ha) this).field_gb));
                                    break L13;
                                  } else {
                                    ((ha) this).field_l.a((byte) -119, (tc) (Object) new qq(0, var5_ref_jd.field_J, var5_ref_jd.field_w, var5_ref_jd.field_O));
                                    break L13;
                                  }
                                } else {
                                  var5_ref_jd = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].a((byte) 123);
                                  continue L2;
                                }
                              } else {
                                break L13;
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              var5_ref_jd = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].a((byte) 123);
              continue L2;
            }
          }
        }
    }

    final void b(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        jd var12 = null;
        jd var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((ha) this).field_e = ((ha) this).field_e | 1 << param1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= ((ha) this).field_W) {
              break L1;
            } else {
              if (((ha) this).field_n[var4] != param1) {
                if (((ha) this).field_n[var4] < 0) {
                  ((ha) this).field_n[var4] = param1;
                  if (!((ha) this).field_wb) {
                    var5 = 0;
                    L2: while (true) {
                      if (((ha) this).field_db * ((ha) this).field_v <= var5) {
                        if (null == ((ha) this).field_K) {
                          break L1;
                        } else {
                          var13 = (jd) (Object) ((ha) this).field_t[param1].e((byte) 87);
                          L3: while (true) {
                            if (var13 == null) {
                              break L1;
                            } else {
                              ((ha) this).field_l.a((byte) -119, (tc) (Object) new hp(var13, true));
                              var13 = (jd) (Object) ((ha) this).field_t[param1].a((byte) 123);
                              continue L3;
                            }
                          }
                        }
                      } else {
                        if (param1 == ((ha) this).field_Eb[var5].field_a) {
                          ((ha) this).field_Eb[var5].field_a = -1;
                          if (11 == ((ha) this).field_Eb[var5].field_h) {
                            ((ha) this).field_Eb[var5].field_h = 0;
                            var5++;
                            continue L2;
                          } else {
                            var5++;
                            continue L2;
                          }
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var5 = 0;
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= ((ha) this).field_W) {
                        L5: {
                          if (var5 <= 0) {
                            break L5;
                          } else {
                            if (!param2) {
                              var15 = new int[var5];
                              var14 = var15;
                              var10 = var14;
                              var5 = 0;
                              var7 = 0;
                              L6: while (true) {
                                if (((ha) this).field_W <= var7) {
                                  var5 = 0;
                                  var11 = 0;
                                  var7 = var11;
                                  L7: while (true) {
                                    if (((ha) this).field_Eb.length <= var11) {
                                      break L1;
                                    } else {
                                      var8 = ((ha) this).field_Eb[var11].field_c;
                                      if (var8 != null) {
                                        if (param1 == var8.field_O) {
                                          ((ha) this).field_l.a((byte) -119, (tc) (Object) new as(var8, var10[var5 % var15.length], false));
                                          var5++;
                                          var11++;
                                          continue L7;
                                        } else {
                                          var11++;
                                          continue L7;
                                        }
                                      } else {
                                        var11++;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  if (var7 != param1) {
                                    if (((ha) this).c(var7, param0 + -26986, param1)) {
                                      if ((1 << var7 & ((ha) this).field_e) == 0) {
                                        var15[var5] = var7;
                                        var5++;
                                        var7++;
                                        continue L6;
                                      } else {
                                        var7++;
                                        continue L6;
                                      }
                                    } else {
                                      var7++;
                                      continue L6;
                                    }
                                  } else {
                                    var7++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        var12 = (jd) (Object) ((ha) this).field_t[param1].e((byte) 87);
                        L8: while (true) {
                          if (var12 == null) {
                            break L1;
                          } else {
                            ((ha) this).field_l.a((byte) -119, (tc) (Object) new hp(var12, true));
                            var12 = (jd) (Object) ((ha) this).field_t[param1].a((byte) 123);
                            continue L8;
                          }
                        }
                      } else {
                        if (param1 != var6) {
                          if (((ha) this).c(var6, -16985, param1)) {
                            if (0 == (((ha) this).field_e & 1 << var6)) {
                              var5++;
                              var6++;
                              continue L4;
                            } else {
                              var6++;
                              continue L4;
                            }
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                break L1;
              }
            }
          }
          if (param0 == 10001) {
            L9: {
              L10: {
                int discarded$1 = -42;
                if (this.e()) {
                  break L10;
                } else {
                  if (null == ((ha) this).field_K) {
                    break L9;
                  } else {
                    if (((ha) this).field_K.field_w == param1) {
                      break L10;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              if (!((ha) this).field_b) {
                break L9;
              } else {
                ((ha) this).field_qb = true;
                break L9;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final at b(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        at var5 = null;
        jd var6 = null;
        int var7 = 0;
        jd var8 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ha) this).field_X) {
          throw new IllegalStateException();
        } else {
          if (param2 == 30156) {
            var4 = ((ha) this).field_gb;
            var8 = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].e((byte) 94);
            L0: while (true) {
              if (var8 == null) {
                L1: {
                  ((ha) this).field_mb[((ha) this).field_gb] = ((ha) this).field_mb[((ha) this).field_gb] + 1;
                  if (!param0) {
                    var5_int = ((ha) this).field_gb - -1;
                    L2: while (true) {
                      if (var5_int == ((ha) this).field_gb) {
                        break L1;
                      } else {
                        var6 = (jd) (Object) ((ha) this).field_t[(((ha) this).field_gb + 1) % ((ha) this).field_W].e((byte) 119);
                        L3: while (true) {
                          if (var6 == null) {
                            var6 = (jd) (Object) ((ha) this).field_t[(((ha) this).field_gb - -1) % ((ha) this).field_W].e((byte) 95);
                            L4: while (true) {
                              if (var6 == null) {
                                var5_int = (1 + var5_int) % ((ha) this).field_W;
                                continue L2;
                              } else {
                                var6.m((byte) -36);
                                var6 = (jd) (Object) ((ha) this).field_t[(1 + ((ha) this).field_gb) % ((ha) this).field_W].a((byte) 123);
                                continue L4;
                              }
                            }
                          } else {
                            var6.n((byte) -42);
                            var6 = (jd) (Object) ((ha) this).field_t[(1 + ((ha) this).field_gb) % ((ha) this).field_W].a((byte) 123);
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    int discarded$3 = 1;
                    this.a();
                    ((ha) this).field_gb = (((ha) this).field_gb - -1) % ((ha) this).field_W;
                    L5: while (true) {
                      if (((ha) this).field_gb == var4) {
                        break L1;
                      } else {
                        if ((1 << ((ha) this).field_gb & ((ha) this).field_e) == 0) {
                          break L1;
                        } else {
                          ((ha) this).field_gb = (((ha) this).field_gb + 1) % ((ha) this).field_W;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  ((ha) this).field_Gb = ((ha) this).field_Gb + 1;
                  this.a(((ha) this).field_gb, (byte) -102);
                  if (!param0) {
                    break L6;
                  } else {
                    L7: {
                      if (var4 == ((ha) this).field_gb) {
                        break L7;
                      } else {
                        int discarded$4 = -42;
                        if (!this.e()) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    ((ha) this).field_qb = true;
                    return null;
                  }
                }
                L8: {
                  if (!param0) {
                    break L8;
                  } else {
                    int discarded$5 = 0;
                    if (!this.i()) {
                      break L8;
                    } else {
                      L9: {
                        if (var4 > ((ha) this).field_gb) {
                          break L9;
                        } else {
                          if (!this.c((byte) 103)) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((ha) this).field_qb = true;
                      return null;
                    }
                  }
                }
                L10: {
                  stackOut_33_0 = this;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_34_0 = stackOut_33_0;
                  if (var4 >= 0) {
                    stackOut_35_0 = this;
                    stackOut_35_1 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L10;
                  } else {
                    stackOut_34_0 = this;
                    stackOut_34_1 = 1;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    break L10;
                  }
                }
                var5 = ((ha) this).a(stackIn_36_1 != 0, param1, param2 + -30156);
                return var5;
              } else {
                var8.m((byte) -36);
                var8 = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].a((byte) 123);
                continue L0;
              }
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = 124 % ((37 - param1) / 34);
              if (((ha) this).field_sb < 0) {
                break L2;
              } else {
                if (((ha) this).field_sb == param0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (((ha) this).field_sb < 0) {
              break L1;
            } else {
              ((ha) this).field_Fb = false;
              break L0;
            }
          }
          ((ha) this).field_Fb = true;
          break L0;
        }
        L3: {
          if (0 < ((ha) this).field_Gb) {
            break L3;
          } else {
            break L3;
          }
        }
    }

    final jd c(int param0, boolean param1, int param2) {
        if (param2 < 0) {
            return null;
        }
        if (param0 < 0) {
            return null;
        }
        if (param2 >= ((ha) this).field_v) {
            return null;
        }
        if (((ha) this).field_db <= param0) {
            return null;
        }
        ne var4 = ((ha) this).field_Eb[param2 + param0 * ((ha) this).field_v];
        if (!param1) {
            Object var5 = null;
            boolean discarded$0 = this.a((int[]) null, -58, 5, -34);
        }
        return var4.field_c;
    }

    private final boolean a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param0[param3];
              if (param2 == -24107) {
                break L1;
              } else {
                ((ha) this).field_E = null;
                break L1;
              }
            }
            var6 = param0[param1];
            if (var6 >= var5_int) {
              L2: {
                if (var6 != var5_int) {
                  break L2;
                } else {
                  var7 = ((ha) this).i(param3, -12710);
                  var8 = ((ha) this).i(param1, param2 + 11397);
                  if (var8 < var7) {
                    stackOut_24_0 = 1;
                    stackIn_25_0 = stackOut_24_0;
                    return stackIn_25_0 != 0;
                  } else {
                    if (var8 == var7) {
                      var9 = this.b((byte) 31, param3);
                      var10 = this.b((byte) 31, param1);
                      if (var10 >= var9) {
                        if (var9 == var10) {
                          var11 = ((ha) this).field_H[param3];
                          var12 = ((ha) this).field_H[param1];
                          if (var11 > var12) {
                            stackOut_21_0 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0 != 0;
                          } else {
                            if (var11 == var12) {
                              L3: {
                                if (param1 > param3) {
                                  stackOut_19_0 = 1;
                                  stackIn_20_0 = stackOut_19_0;
                                  break L3;
                                } else {
                                  stackOut_18_0 = 0;
                                  stackIn_20_0 = stackOut_18_0;
                                  break L3;
                                }
                              }
                              return stackIn_20_0 != 0;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("ha.BD(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L4;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_27_0 != 0;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        L0: {
          var16 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param2 != 74) {
            break L0;
          } else {
            ((ha) this).field_Bb = true;
            if (!((ha) this).field_b) {
              break L0;
            } else {
              if (((ha) this).field_N[9] >= 0) {
                break L0;
              } else {
                ((ha) this).field_N[9] = param5;
                break L0;
              }
            }
          }
        }
        L1: {
          var8 = 0;
          var9 = bw.field_m[param2][4] + param6;
          if (((ha) this).c(param3, true, param1) != null) {
            ((ha) this).c(param3, true, param1).d(param4 ^ 91);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var10 = param4;
          if (param2 != 74) {
            break L2;
          } else {
            var10 = 2;
            break L2;
          }
        }
        L3: {
          var11 = new jd(param1, param3, param2, param5, var9, var9, var10, 0, 0, (ha) this, 0, 0, -1, false, 0);
          ((ha) this).a(8288, var11);
          if (var11.g(0) != 4) {
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          int discarded$2 = -98;
          int discarded$3 = 0;
          if (!re.a()) {
            break L4;
          } else {
            if (((ha) this).field_b) {
              L5: {
                if (param2 == 19) {
                  break L5;
                } else {
                  if (param2 == 21) {
                    break L5;
                  } else {
                    if (param2 == 20) {
                      break L5;
                    } else {
                      if (0 == param2) {
                        break L5;
                      } else {
                        ((ha) this).field_Db = ((ha) this).field_Db | 1 << param5;
                        break L4;
                      }
                    }
                  }
                }
              }
              if ((1 << param5 & ((ha) this).field_Db) != 0) {
                break L4;
              } else {
                if (0 == (1 << param5 & ((ha) this).field_I)) {
                  L6: {
                    var12 = 0;
                    if (param2 != 19) {
                      if (param2 == 21) {
                        var12 = var12 | 2;
                        break L6;
                      } else {
                        if (20 != param2) {
                          break L6;
                        } else {
                          var12 = var12 | 4;
                          break L6;
                        }
                      }
                    } else {
                      var12 = var12 | 1;
                      break L6;
                    }
                  }
                  var13_ref_jd = (jd) (Object) ((ha) this).field_t[param5].e((byte) 89);
                  L7: while (true) {
                    if (var13_ref_jd == null) {
                      if (var12 != 7) {
                        break L4;
                      } else {
                        ((ha) this).field_I = ((ha) this).field_I | 1 << param5;
                        break L4;
                      }
                    } else {
                      L8: {
                        if (19 == var13_ref_jd.field_N) {
                          var12 = var12 | 1;
                          break L8;
                        } else {
                          if (var13_ref_jd.field_N == 21) {
                            var12 = var12 | 2;
                            break L8;
                          } else {
                            if (var13_ref_jd.field_N == 20) {
                              var12 = var12 | 4;
                              break L8;
                            } else {
                              var13_ref_jd = (jd) (Object) ((ha) this).field_t[param5].a((byte) 123);
                              continue L7;
                            }
                          }
                        }
                      }
                      var13_ref_jd = (jd) (Object) ((ha) this).field_t[param5].a((byte) 123);
                      continue L7;
                    }
                  }
                } else {
                  break L4;
                }
              }
            } else {
              break L4;
            }
          }
        }
        L9: {
          if (param2 == 58) {
            var8 = ps.field_C[1];
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (param2 == 63) {
            var8 = ps.field_C[0];
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          L12: {
            if (param2 == 59) {
              break L12;
            } else {
              if (param2 == 53) {
                break L12;
              } else {
                if (param2 == 43) {
                  break L12;
                } else {
                  break L11;
                }
              }
            }
          }
          var8 = 1;
          break L11;
        }
        L13: {
          if (var8 > 0) {
            ((ha) this).a(param3, param1, 0, 3);
            break L13;
          } else {
            break L13;
          }
        }
        if (!param0) {
          L14: {
            ((ha) this).field_H[param5] = ((ha) this).field_H[param5] - bw.field_m[param2][8];
            if (!((ha) this).field_b) {
              break L14;
            } else {
              ((ha) this).field_ub[param5] = ((ha) this).field_ub[param5] + bw.field_m[param2][8];
              ((ha) this).d(param5, ((ha) this).field_ub[param5], 106, 10);
              break L14;
            }
          }
          L15: {
            var12 = bw.field_m[param2][2];
            var13 = bw.field_m[param2][1];
            var14 = ((ha) this).field_Eb[((ha) this).field_v * param3 + param1];
            if (var13 != -1) {
              L16: {
                ((ha) this).field_U[param5] = oe.c(((ha) this).field_U[param5], 1 << var13);
                if (7 != var14.field_h) {
                  break L16;
                } else {
                  if (var12 != ((ha) this).field_E[param5][var13]) {
                    break L16;
                  } else {
                    var15 = 0;
                    L17: while (true) {
                      if (6 <= var15) {
                        break L16;
                      } else {
                        L18: {
                          if (~var15 != ~var13) {
                            break L18;
                          } else {
                            if (5 > ((ha) this).field_E[param5][var15]) {
                              ((ha) this).b(var15, param5, 1, (byte) 92);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                        var15++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              if (11 != var14.field_h) {
                break L15;
              } else {
                if (~var13 != ~var14.field_g) {
                  break L15;
                } else {
                  if (~var12 != ~var14.field_j) {
                    break L15;
                  } else {
                    if (var14.field_j < 5) {
                      var14.field_j = var14.field_j + 1;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
              }
            } else {
              if (var12 != ((ha) this).field_E[param5][6]) {
                break L15;
              } else {
                if (((ha) this).field_E[param5][6] < 5) {
                  ((ha) this).b(6, param5, 1, (byte) 92);
                  break L15;
                } else {
                  break L15;
                }
              }
            }
          }
          L19: {
            if (((ha) this).field_b) {
              ((ha) this).field_Y[param5] = ((ha) this).field_Y[param5] + 1;
              ((ha) this).d(param5, ((ha) this).field_t[param5].b(false), param4 ^ 104, 13);
              ((ha) this).d(param5, ((ha) this).field_Y[param5], 119, 5);
              break L19;
            } else {
              break L19;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean i() {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ha) this).field_V) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((ha) this).field_tb) {
              return this.c((byte) 51);
            } else {
              if (var2 < 0) {
                return false;
              } else {
                if (var2 < ((ha) this).field_fb.length) {
                  if (((ha) this).i(var2, -12710) >= ((ha) this).field_xb) {
                    return true;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    private final int f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (((ha) this).field_s == null) {
            break L0;
          } else {
            if (((ha) this).field_s.length != 3) {
              break L0;
            } else {
              if (param0 <= -65) {
                var2 = 2 * ((ha) this).field_O / 3;
                var3 = 50 * ((ha) this).field_s[0] * var2;
                var3 = var3 + 75 * var2 * ((ha) this).field_s[1];
                var3 = var3 + ((ha) this).field_s[2] * var2 * 25;
                if (((ha) this).field_O > 1) {
                  var4 = var3 / ((ha) this).field_tb;
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param2 >= ((ha) this).field_v) {
                    break L1;
                  } else {
                    if (((ha) this).field_db >= param0) {
                      L2: {
                        if (param1 == -26633) {
                          break L2;
                        } else {
                          ((ha) this).field_N = null;
                          break L2;
                        }
                      }
                      var5 = ((ha) this).field_Eb[param2 + ((ha) this).field_v * param0];
                      if (null == var5.field_c) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      } else {
                        if (!((ha) this).c(var5.field_c.field_O, -16985, param3.field_O)) {
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          break L0;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0 != 0;
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("ha.JD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void a(int param0, ne param1) {
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
              if (null == param1.field_c) {
                break L1;
              } else {
                if (param1.c(-32)) {
                  param1.i(param0 + 114);
                  if (param1.field_c.field_t < 99) {
                    ((ha) this).field_l.a((byte) -119, (tc) (Object) new st(param1.field_c, 4));
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
                ((ha) this).field_t = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ha.AE(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private final void g() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = 0; var2 < ((ha) this).field_S.length; var2++) {
            ((ha) this).field_S[var2] = ((ha) this).field_fb[var2];
        }
        var2 = 0;
        if (!(((ha) this).field_gb < 0)) {
            for (var3 = 0; var3 < ((ha) this).field_v; var3++) {
                for (var4 = 0; var4 < ((ha) this).field_db; var4++) {
                    ((ha) this).field_Eb[var3 + ((ha) this).field_v * var4].a(var4, var3, ((ha) this).field_gb, 0);
                }
            }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = param0;
        if (nv.c(0, param1)) {
            if (param0 == 3) {
                var3 = 3;
            }
        }
        return var3;
    }

    final void b(int param0, boolean param1, int param2, int param3, int param4) {
        ne var6 = null;
        int var7 = 0;
        int var8 = 0;
        ne var9 = null;
        ne stackIn_7_0 = null;
        ne stackIn_8_0 = null;
        ne stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ne stackOut_6_0 = null;
        ne stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ne stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param4 < 0) {
          return;
        } else {
          L0: {
            if (~param4 <= ~((ha) this).field_db) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (~((ha) this).field_v < ~param0) {
                  L1: {
                    var9 = ((ha) this).field_Eb[param0 - -(((ha) this).field_v * param4)];
                    var6 = var9;
                    stackOut_6_0 = (ne) var6;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (!param1) {
                      stackOut_8_0 = (ne) (Object) stackIn_8_0;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L1;
                    } else {
                      stackOut_7_0 = (ne) (Object) stackIn_7_0;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      stackIn_9_0.field_b = stackIn_9_1 != 0;
                      var7 = param2;
                      if (14 != var7) {
                        if (var7 != 9) {
                          L4: {
                            if (var7 == 4) {
                              if (var9.field_h == 1) {
                                var6.field_h = 10;
                                break L2;
                              } else {
                                L5: {
                                  if (var9.field_h == 0) {
                                    break L5;
                                  } else {
                                    if (var9.field_h == 3) {
                                      break L5;
                                    } else {
                                      if (5 != var9.field_h) {
                                        break L4;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                var6.field_h = 4;
                                break L2;
                              }
                            } else {
                              if (3 != var7) {
                                if (var7 == 5) {
                                  L6: {
                                    if (var9.field_h == 0) {
                                      break L6;
                                    } else {
                                      if (var9.field_h == 3) {
                                        break L6;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                  var6.field_h = 5;
                                  break L2;
                                } else {
                                  if (var7 == 0) {
                                    if (var9.field_h != 2) {
                                      if (12 == var9.field_h) {
                                        var6.field_h = 13;
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      var6.field_h = 0;
                                      break L2;
                                    }
                                  } else {
                                    if (1 == var7) {
                                      L7: {
                                        if (var9.field_h == 0) {
                                          break L7;
                                        } else {
                                          if (var9.field_h == 3) {
                                            break L7;
                                          } else {
                                            if (var9.field_h == 5) {
                                              break L7;
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                      var6.field_h = 1;
                                      break L2;
                                    } else {
                                      if (var7 == 10) {
                                        L8: {
                                          L9: {
                                            if (var9.field_h == 6) {
                                              break L9;
                                            } else {
                                              if (4 != var9.field_h) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          var6.field_h = 10;
                                          break L8;
                                        }
                                        if (var9.field_h == 5) {
                                          var6.field_h = 1;
                                          break L4;
                                        } else {
                                          break L2;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (var9.field_h != 0) {
                                  break L4;
                                } else {
                                  var6.field_h = 3;
                                  break L2;
                                }
                              }
                            }
                          }
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    if (8 != var9.field_h) {
                      break L2;
                    } else {
                      if (((ha) this).c(var9.field_a, -16985, param3)) {
                        var7 = var9.e(10);
                        var6.field_h = param2;
                        var9.field_m = var9.field_m + (-var7 + var9.e(10));
                        ((ha) this).f(-2);
                        ((ha) this).b(2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
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
        if (!(!((ha) this).field_f)) {
            return false;
        }
        if (!(((ha) this).field_P.a((byte) -88, param0))) {
            return false;
        }
        if (!param1) {
            ((ha) this).field_vb = 102;
        }
        ((ha) this).b(10001, param0, false);
        return true;
    }

    final at f(int param0, int param1) {
        if (null == ((ha) this).field_t) {
            return null;
        }
        if (0 > param0) {
            return null;
        }
        if (param0 >= ((ha) this).field_t.length) {
            return null;
        }
        if (param1 != 0) {
            ((ha) this).field_fb = null;
        }
        return ((ha) this).field_t[param0];
    }

    private final void b(int[] param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (((ha) this).field_tb <= var5_int) {
                var5_int = -3;
                L2: while (true) {
                  if (var5_int > 3) {
                    break L0;
                  } else {
                    var6 = -3;
                    L3: while (true) {
                      if (3 < var6) {
                        var5_int++;
                        continue L2;
                      } else {
                        L4: {
                          var7 = Math.abs(var5_int) - -Math.abs(var6);
                          if (param3 + var5_int < 0) {
                            break L4;
                          } else {
                            if (param3 + var5_int >= ((ha) this).field_v) {
                              break L4;
                            } else {
                              if (var6 - -param2 < 0) {
                                break L4;
                              } else {
                                if (var6 + param2 >= ((ha) this).field_db) {
                                  break L4;
                                } else {
                                  var8 = ((ha) this).field_Eb[((ha) this).field_v * (param2 + var6) + param3 + var5_int].field_c;
                                  if (var8 != null) {
                                    L5: {
                                      var9 = ((ha) this).o(var8.field_O, -1);
                                      if (var8.field_N != 59) {
                                        break L5;
                                      } else {
                                        L6: {
                                          if (!var8.field_F) {
                                            stackOut_17_0 = 0;
                                            stackIn_18_0 = stackOut_17_0;
                                            break L6;
                                          } else {
                                            stackOut_16_0 = 1;
                                            stackIn_18_0 = stackOut_16_0;
                                            break L6;
                                          }
                                        }
                                        if (stackIn_18_0 + ps.field_C[2] < var7) {
                                          break L5;
                                        } else {
                                          param0[var9] = oe.c(param0[var9], 4);
                                          break L5;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var8.field_N != 53) {
                                        break L7;
                                      } else {
                                        L8: {
                                          stackOut_21_0 = var7;
                                          stackIn_23_0 = stackOut_21_0;
                                          stackIn_22_0 = stackOut_21_0;
                                          if (var8.field_F) {
                                            stackOut_23_0 = stackIn_23_0;
                                            stackOut_23_1 = 1;
                                            stackIn_24_0 = stackOut_23_0;
                                            stackIn_24_1 = stackOut_23_1;
                                            break L8;
                                          } else {
                                            stackOut_22_0 = stackIn_22_0;
                                            stackOut_22_1 = 0;
                                            stackIn_24_0 = stackOut_22_0;
                                            stackIn_24_1 = stackOut_22_1;
                                            break L8;
                                          }
                                        }
                                        if (stackIn_24_0 <= stackIn_24_1 + ps.field_C[3]) {
                                          param0[var9] = oe.c(param0[var9], 8);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (var8.field_N != 43) {
                                        break L9;
                                      } else {
                                        L10: {
                                          stackOut_28_0 = var7;
                                          stackIn_30_0 = stackOut_28_0;
                                          stackIn_29_0 = stackOut_28_0;
                                          if (!var8.field_F) {
                                            stackOut_30_0 = stackIn_30_0;
                                            stackOut_30_1 = 0;
                                            stackIn_31_0 = stackOut_30_0;
                                            stackIn_31_1 = stackOut_30_1;
                                            break L10;
                                          } else {
                                            stackOut_29_0 = stackIn_29_0;
                                            stackOut_29_1 = 1;
                                            stackIn_31_0 = stackOut_29_0;
                                            stackIn_31_1 = stackOut_29_1;
                                            break L10;
                                          }
                                        }
                                        if (stackIn_31_0 > stackIn_31_1 + ps.field_C[4]) {
                                          break L9;
                                        } else {
                                          if (0 >= var7) {
                                            break L9;
                                          } else {
                                            param0[var9] = oe.c(param0[var9], 16);
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      if (var8.field_N != 63) {
                                        break L11;
                                      } else {
                                        L12: {
                                          stackOut_35_0 = ps.field_C[0];
                                          stackIn_37_0 = stackOut_35_0;
                                          stackIn_36_0 = stackOut_35_0;
                                          if (var8.field_F) {
                                            stackOut_37_0 = stackIn_37_0;
                                            stackOut_37_1 = 1;
                                            stackIn_38_0 = stackOut_37_0;
                                            stackIn_38_1 = stackOut_37_1;
                                            break L12;
                                          } else {
                                            stackOut_36_0 = stackIn_36_0;
                                            stackOut_36_1 = 0;
                                            stackIn_38_0 = stackOut_36_0;
                                            stackIn_38_1 = stackOut_36_1;
                                            break L12;
                                          }
                                        }
                                        if (stackIn_38_0 - -stackIn_38_1 < var7) {
                                          break L11;
                                        } else {
                                          param0[var9] = oe.c(param0[var9], 1);
                                          break L11;
                                        }
                                      }
                                    }
                                    if (58 != var8.field_N) {
                                      break L4;
                                    } else {
                                      L13: {
                                        stackOut_41_0 = ps.field_C[1];
                                        stackIn_43_0 = stackOut_41_0;
                                        stackIn_42_0 = stackOut_41_0;
                                        if (!var8.field_F) {
                                          stackOut_43_0 = stackIn_43_0;
                                          stackOut_43_1 = 0;
                                          stackIn_44_0 = stackOut_43_0;
                                          stackIn_44_1 = stackOut_43_1;
                                          break L13;
                                        } else {
                                          stackOut_42_0 = stackIn_42_0;
                                          stackOut_42_1 = 1;
                                          stackIn_44_0 = stackOut_42_0;
                                          stackIn_44_1 = stackOut_42_1;
                                          break L13;
                                        }
                                      }
                                      if (stackIn_44_0 - -stackIn_44_1 < var7) {
                                        break L4;
                                      } else {
                                        param0[var9] = oe.c(param0[var9], 2);
                                        break L4;
                                      }
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                param0[var5_int] = 0;
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var5;
            stackOut_49_1 = new StringBuilder().append("ha.LA(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L14;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L14;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + 12534 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        jd var8 = null;
        L0: {
          var8 = ((ha) this).c(param3, true, param2);
          if (param0 < -117) {
            break L0;
          } else {
            ((ha) this).field_mb = null;
            break L0;
          }
        }
        L1: {
          if (var8 == null) {
            break L1;
          } else {
            if (((ha) this).c(var8.field_O, -16985, param4)) {
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
                if (!((ha) this).field_b) {
                  break L3;
                } else {
                  ((ha) this).field_ob[param4] = ((ha) this).field_ob[param4] + param5;
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
        int stackIn_6_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (!((ha) this).field_f) {
                if (param2 > -1) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 0;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var5_int = stackIn_6_0;
              if (((ha) this).field_K == null) {
                break L2;
              } else {
                if (param3 == ((ha) this).field_K.field_w) {
                  break L2;
                } else {
                  var5_int = 0;
                  break L2;
                }
              }
            }
            L3: {
              if (param0 == -49) {
                break L3;
              } else {
                ((ha) this).b(-42, true, -106, -92, 114);
                break L3;
              }
            }
            L4: {
              if (var5_int == 0) {
                break L4;
              } else {
                ((ha) this).field_B[param3][param2] = -1;
                ((ha) this).field_m[param3] = ((ha) this).field_m[param3] - uc.field_d[param1.field_c][0];
                break L4;
              }
            }
            ((ha) this).field_J = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("ha.TA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean h(int param0) {
        int var2 = ((ha) this).field_Fb ? 1 : 0;
        ((ha) this).field_Fb = false;
        if (param0 != -293) {
            ((ha) this).field_ib = 1;
        }
        return var2 != 0;
    }

    final void b(int param0, int param1, int param2, byte param3) {
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (param1 >= ((ha) this).field_E.length) {
              return;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (param0 < ((ha) this).field_E[param1].length) {
                  L1: {
                    ((ha) this).field_E[param1][param0] = ((ha) this).field_E[param1][param0] + param2;
                    if (((ha) this).field_E[param1][param0] > 5) {
                      ((ha) this).field_E[param1][param0] = 5;
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
                        if (((ha) this).field_E[param1][param0] > ((ha) this).field_E[param1][6]) {
                          ((ha) this).field_E[param1][6] = ((ha) this).field_E[param1][param0];
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
            ((ha) this).field_qb = true;
        }
        return ((ha) this).field_P.a(param0 ^ 26524);
    }

    private final void a(int param0, vh param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            var3_int = param1.k(0);
            var4 = param1.k(0);
            var5 = param1.k(0);
            var6 = 7 & var3_int;
            var7 = (var3_int & 31) >> 3;
            ((ha) this).field_l.a((byte) -119, (tc) (Object) new qq(var7, var4, var5, var6));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ha.GD(" + -30531 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, gn param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1.a(new String[2], (byte) -124);
            param1.a(0, 2);
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= ((ha) this).field_c[param0].length) {
                L2: {
                  param1.a(new String[4], (byte) -49);
                  param1.a(new String[2], (byte) -102);
                  if (lf.field_i[((ha) this).field_Q] != 0) {
                    param1.a(new String[2], (byte) -62);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  param1.a(0, -2);
                  if (param2 == -3396) {
                    break L3;
                  } else {
                    boolean discarded$1 = ((ha) this).a(91, true);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var5 = ((ha) this).field_c[param0][var4_int];
                  if (var5 >= 0) {
                    param1.a(new String[4], (byte) -57);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ha.G(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final int a(jd param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
              var5_int = ((ha) this).a(param0.field_J - -(param0.field_w * ((ha) this).field_v), -4, param0);
              if ((param2 | hh.field_e[param0.field_P]) != hh.field_e[param0.field_P]) {
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
                ((ha) this).field_eb = false;
                break L2;
              }
            }
            stackOut_4_0 = var5_int * param3 / 100;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ha.L(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final boolean b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -26) {
          var3 = 0;
          L0: while (true) {
            if (((ha) this).field_v * ((ha) this).field_db <= var3) {
              return false;
            } else {
              L1: {
                if (((ha) this).field_Eb[var3].field_a == param0) {
                  break L1;
                } else {
                  if (null == ((ha) this).field_K) {
                    if (((ha) this).c(((ha) this).field_Eb[var3].field_a, -16985, param0)) {
                      break L1;
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              if (((ha) this).field_Eb[var3].field_h != 7) {
                if (((ha) this).field_Eb[var3].field_h == 11) {
                  if (((ha) this).field_E[param0][((ha) this).field_Eb[var3].field_g] > 0) {
                    return true;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
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
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1) {
          var3_ref_jd = (jd) (Object) ((ha) this).field_t[param0].e((byte) 116);
          L0: while (true) {
            if (var3_ref_jd == null) {
              L1: {
                if (!((ha) this).field_wb) {
                  break L1;
                } else {
                  if (null == ((ha) this).field_K) {
                    var3 = 0;
                    L2: while (true) {
                      if (((ha) this).field_W <= var3) {
                        break L1;
                      } else {
                        if (var3 != param0) {
                          if (((ha) this).c(var3, -16985, param0)) {
                            var4 = (jd) (Object) ((ha) this).field_t[var3].e((byte) 99);
                            L3: while (true) {
                              if (var4 != null) {
                                L4: {
                                  L5: {
                                    if (var4.i(-21428)) {
                                      break L5;
                                    } else {
                                      if (!var4.k((byte) 90)) {
                                        break L4;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  if (!var4.field_S) {
                                    return true;
                                  } else {
                                    break L4;
                                  }
                                }
                                var4 = (jd) (Object) ((ha) this).field_t[var3].a((byte) 123);
                                continue L3;
                              } else {
                                var3++;
                                continue L2;
                              }
                            }
                          } else {
                            var3++;
                            continue L2;
                          }
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                }
              }
              return false;
            } else {
              L6: {
                L7: {
                  if (var3_ref_jd.i(-21428)) {
                    break L7;
                  } else {
                    if (!var3_ref_jd.k((byte) 116)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (!var3_ref_jd.field_S) {
                  return true;
                } else {
                  break L6;
                }
              }
              var3_ref_jd = (jd) (Object) ((ha) this).field_t[param0].a((byte) 123);
              continue L0;
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4) {
        ne var6 = null;
        L0: {
          if (0 > param2) {
            break L0;
          } else {
            if (0 > param3) {
              break L0;
            } else {
              if (((ha) this).field_v <= param2) {
                break L0;
              } else {
                if (((ha) this).field_db <= param3) {
                  break L0;
                } else {
                  var6 = ((ha) this).field_Eb[param2 + ((ha) this).field_v * param3];
                  if (null == var6.field_c) {
                    return false;
                  } else {
                    if (param0 >= ~param4) {
                      if (((ha) this).c(var6.field_c.field_O, -16985, param4)) {
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
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        int[] var9 = new int[7];
        int[] var5 = var9;
        ne var6 = ((ha) this).field_Eb[param2 + param0 * ((ha) this).field_v];
        if (7 == var6.field_h) {
            if (((ha) this).c(var6.field_a, -16985, param3)) {
                for (var7 = 0; var7 < 7; var7++) {
                    var9[var7] = ((ha) this).field_E[param3][var7];
                }
            }
        }
        if (var6.field_h == 11) {
            if (((ha) this).c(var6.field_a, -16985, param3)) {
                if (!(~var5[var6.field_g] <= ~var6.field_j)) {
                    var5[var6.field_g] = var6.field_j;
                }
            }
        }
        if (param1 < 8) {
            return null;
        }
        return var5;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        jd var6 = null;
        int var7 = 0;
        ne var8_ref_ne = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = ((ha) this).field_jb;
          if (((ha) this).field_Bb) {
            var3 = var3 ^ 313485252;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = var3 ^ ((ha) this).field_cb * 137;
          var3 = var3 ^ 783246 * ((ha) this).field_hb;
          var3 = var3 ^ ((ha) this).field_Q * 545542;
          if (param1 >= 0) {
            int discarded$1 = -111;
            var3 = var3 ^ this.n(param1) * (7 * param1 - -11);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var4 = param1;
          if (0 <= var4) {
            break L2;
          } else {
            var4 = 0;
            break L2;
          }
        }
        L3: {
          if (param0) {
            break L3;
          } else {
            ((ha) this).field_ib = -38;
            break L3;
          }
        }
        var5 = 0;
        L4: while (true) {
          if (((ha) this).field_v <= var5) {
            var5 = 0;
            L5: while (true) {
              if (var5 >= ((ha) this).field_W) {
                return var3;
              } else {
                var6 = (jd) (Object) ((ha) this).field_t[var5].e((byte) 101);
                L6: while (true) {
                  if (var6 == null) {
                    var5++;
                    continue L5;
                  } else {
                    var7 = var6.field_J;
                    var8 = var6.field_w;
                    var3 = var3 ^ this.b(-125, var6) * (var7 + 372) * (var8 + 723);
                    var6 = (jd) (Object) ((ha) this).field_t[var5].a((byte) 123);
                    continue L6;
                  }
                }
              }
            }
          } else {
            var6_int = 0;
            L7: while (true) {
              if (((ha) this).field_db <= var6_int) {
                var5++;
                continue L4;
              } else {
                var7 = ((ha) this).field_v * var6_int + var5;
                var8_ref_ne = ((ha) this).field_Eb[var7];
                var3 = var3 ^ this.a((byte) 103, var4, var8_ref_ne) * (var7 * 3 + 351);
                var6_int++;
                continue L7;
              }
            }
          }
        }
    }

    final void g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -36 % ((-50 - param1) / 62);
        var4 = 0;
        L0: while (true) {
          if (((ha) this).field_W <= var4) {
            ((ha) this).field_e = param0;
            return;
          } else {
            if ((((ha) this).field_e & 1 << var4) != (1 << var4 & param0)) {
              ((ha) this).b(10001, var4, false);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void c(int param0, int param1, int param2, byte param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jd var10 = null;
        ne var11 = null;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-1 >= param2) {
            break L0;
          } else {
            var10 = ((ha) this).c(param0, true, param1);
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
          var11 = ((ha) this).field_Eb[param1 + param0 * ((ha) this).field_v];
          var6 = var11.field_a;
          if (var6 <= -1) {
            break L1;
          } else {
            var7 = var11.field_h;
            if (var7 != 7) {
              L2: {
                if (var7 == 14) {
                  break L2;
                } else {
                  if (var7 != 9) {
                    if (var7 == 8) {
                      ((ha) this).field_z[((ha) this).field_yb[var6]][2] = ((ha) this).field_z[((ha) this).field_yb[var6]][2] - 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              ((ha) this).field_z[((ha) this).field_yb[var6]][1] = ((ha) this).field_z[((ha) this).field_yb[var6]][1] - 1;
              break L1;
            } else {
              ((ha) this).field_z[((ha) this).field_yb[var6]][0] = ((ha) this).field_z[((ha) this).field_yb[var6]][0] - 1;
              break L1;
            }
          }
        }
        L3: {
          var11.a(-104, param2);
          var7 = var11.field_h;
          if (var7 == 7) {
            ((ha) this).field_z[((ha) this).field_yb[param2]][0] = ((ha) this).field_z[((ha) this).field_yb[param2]][0] + 1;
            break L3;
          } else {
            L4: {
              if (var7 == 14) {
                break L4;
              } else {
                if (var7 != 9) {
                  if (var7 != 8) {
                    break L3;
                  } else {
                    ((ha) this).field_z[((ha) this).field_yb[param2]][2] = ((ha) this).field_z[((ha) this).field_yb[param2]][2] + 1;
                    break L3;
                  }
                } else {
                  break L4;
                }
              }
            }
            ((ha) this).field_z[((ha) this).field_yb[param2]][1] = ((ha) this).field_z[((ha) this).field_yb[param2]][1] + 1;
            break L3;
          }
        }
        L5: {
          if (param3 == -115) {
            break L5;
          } else {
            ((ha) this).field_U = null;
            break L5;
          }
        }
        L6: {
          if (!((ha) this).field_b) {
            break L6;
          } else {
            if (!((ha) this).field_wb) {
              ((ha) this).d(param2, ((ha) this).field_z[((ha) this).field_yb[param2]][1] + (((ha) this).field_z[((ha) this).field_yb[param2]][0] + ((ha) this).field_z[((ha) this).field_yb[param2]][2]), 102, 0);
              var7 = -1 + ((ha) this).field_W;
              var8 = 0;
              L7: while (true) {
                L8: {
                  if (((ha) this).field_n[var8] <= -1) {
                    break L8;
                  } else {
                    if (~((ha) this).field_W >= ~var8) {
                      break L8;
                    } else {
                      var7--;
                      var8++;
                      continue L7;
                    }
                  }
                }
                L9: {
                  if (var7 <= -1) {
                    break L9;
                  } else {
                    if (~((ha) this).field_p[var7] != ~var6) {
                      break L9;
                    } else {
                      ((ha) this).field_y[param2] = ((ha) this).field_y[param2] + 1;
                      ((ha) this).d(param2, ((ha) this).field_y[param2], 104, 15);
                      break L9;
                    }
                  }
                }
                if (~((ha) this).field_p[0] != ~var6) {
                  break L6;
                } else {
                  ((ha) this).field_M[param2] = ((ha) this).field_M[param2] + 1;
                  ((ha) this).d(param2, ((ha) this).field_M[param2], param3 ^ -18, 14);
                  break L6;
                }
              }
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (!var11.k(12)) {
            break L10;
          } else {
            ((ha) this).b(param3 + 10116, var6, false);
            var11.d((byte) 61);
            break L10;
          }
        }
        L11: {
          if (((ha) this).field_K == null) {
            break L11;
          } else {
            if (var6 == -1) {
              break L11;
            } else {
              boolean discarded$1 = ((ha) this).b(var6, true);
              break L11;
            }
          }
        }
        ((ha) this).a(1);
    }

    final void g(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 != -9513) {
            ((ha) this).b(-46, 97, true);
        }
        for (var5 = 0; var5 < ((ha) this).field_W; var5++) {
            for (var6 = 0; var6 < 6; var6++) {
                ((ha) this).field_E[var5][param1] = 1;
                ((ha) this).field_E[var5][param2] = 1;
                ((ha) this).field_E[var5][param0] = 1;
                ((ha) this).field_c[var5][0] = param1;
                ((ha) this).field_c[var5][1] = param2;
                ((ha) this).field_c[var5][2] = param0;
            }
        }
    }

    private final void j() {
    }

    final int[] a(jd param0, int param1, byte param2, int param3, jd param4, int param5, int param6) {
        RuntimeException var8 = null;
        jd var8_ref = null;
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
        int[] stackIn_7_0 = null;
        int[] stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        int[] stackIn_80_0 = null;
        int[] stackIn_97_0 = null;
        int[] stackIn_108_0 = null;
        int[] stackIn_133_0 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_15_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int[] stackOut_107_0 = null;
        int[] stackOut_132_0 = null;
        int[] stackOut_96_0 = null;
        int[] stackOut_79_0 = null;
        int[] stackOut_6_0 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        String stackOut_138_2 = null;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var23 = param4;
              var8_ref = var23;
              if (param2 <= -119) {
                break L1;
              } else {
                ((ha) this).field_u = 42;
                break L1;
              }
            }
            L2: {
              var9 = param0;
              var10 = new int[]{0, 0, 0};
              if (var8_ref == null) {
                break L2;
              } else {
                if (var9 == null) {
                  break L2;
                } else {
                  L3: {
                    var11 = var23.field_N;
                    if (var11 != 34) {
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
                        stackOut_15_0 = (int[]) var10;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
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
                    if (var12 != 1) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L5;
                    } else {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L5;
                    }
                  }
                  L6: {
                    var17 = stackIn_20_0;
                    if (var17 != 0) {
                      L7: {
                        if (var23.field_N != 34) {
                          break L7;
                        } else {
                          if (!var23.field_W) {
                            break L7;
                          } else {
                            var13 = 8;
                            if (var23.j(20640) == 3) {
                              var15 = var23.d(0, 55);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (!var23.x(-126)) {
                        if (var23.g(0) != 3) {
                          var13 = 1;
                          if (0 == var23.j(20640)) {
                            var15 = var23.d(0, -93);
                            break L6;
                          } else {
                            break L6;
                          }
                        } else {
                          var13 = 4;
                          if (var23.j(20640) == 2) {
                            var15 = var23.d(0, -102);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        L8: {
                          if (var23.j(20640) != 4) {
                            break L8;
                          } else {
                            var15 = var23.d(0, -95);
                            break L8;
                          }
                        }
                        var13 = 16;
                        break L6;
                      }
                    } else {
                      L9: {
                        if (34 != var23.field_N) {
                          break L9;
                        } else {
                          if (var23.field_W) {
                            var13 = 8;
                            if (var23.j(20640) == 3) {
                              var15 = var23.d(0, 118);
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var23.field_N == 81) {
                          break L10;
                        } else {
                          if (var23.field_N == 4) {
                            break L10;
                          } else {
                            if (var23.field_N == 74) {
                              break L10;
                            } else {
                              if (var23.g(0) == 3) {
                                L11: {
                                  if (var23.j(20640) == 2) {
                                    var15 = var23.d(0, 58);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var13 = 4;
                                break L6;
                              } else {
                                var13 = 2;
                                if (var23.j(20640) != 1) {
                                  break L6;
                                } else {
                                  var15 = var23.d(0, 80);
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                      }
                      var13 = 8;
                      if (var23.j(20640) != 3) {
                        break L6;
                      } else {
                        var15 = var23.d(0, 106);
                        break L6;
                      }
                    }
                  }
                  L12: {
                    if (var17 == 0) {
                      break L12;
                    } else {
                      L13: {
                        if (var9.field_N != 34) {
                          break L13;
                        } else {
                          if (var9.field_W) {
                            L14: {
                              if (var9.j(20640) == 3) {
                                var16 = var9.d(0, 116);
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            var14 = 8;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (!var9.x(-109)) {
                        if (3 != var9.g(0)) {
                          L15: {
                            if (var9.j(20640) == 0) {
                              var16 = var9.d(0, -123);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          var14 = 1;
                          break L12;
                        } else {
                          L16: {
                            if (var9.j(20640) == 2) {
                              var16 = var9.d(0, 69);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          var14 = 4;
                          break L12;
                        }
                      } else {
                        var14 = 16;
                        if (var9.j(20640) == 4) {
                          var16 = var9.d(0, 122);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  L17: {
                    if (var11 < 0) {
                      break L17;
                    } else {
                      if (~bw.field_m.length >= ~var11) {
                        break L17;
                      } else {
                        L18: {
                          L19: {
                            L20: {
                              var18 = param4.B(3257);
                              var19 = param4.l((byte) -79);
                              if (param4.field_N == 81) {
                                break L20;
                              } else {
                                if (4 == param4.field_N) {
                                  break L20;
                                } else {
                                  if (param4.field_N != 74) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            if (param4.j(20640) == 3) {
                              var18 = var18 + param4.d(1, -87);
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                          L21: {
                            if (param4.g(0) != 3) {
                              break L21;
                            } else {
                              if (param4.j(20640) == 2) {
                                var18 = var18 + param4.d(1, -124);
                                break L18;
                              } else {
                                break L21;
                              }
                            }
                          }
                          if (param4.g(0) != 2) {
                            break L18;
                          } else {
                            if (1 != param4.j(20640)) {
                              break L18;
                            } else {
                              var18 = var18 + param4.d(1, 117);
                              break L18;
                            }
                          }
                        }
                        if (~var12 >= ~var18) {
                          L22: {
                            var20 = 0;
                            var21 = 0;
                            if (var12 < var19) {
                              if (var12 > 1) {
                                stackOut_107_0 = (int[]) var10;
                                stackIn_108_0 = stackOut_107_0;
                                return stackIn_108_0;
                              } else {
                                break L22;
                              }
                            } else {
                              L23: {
                                int discarded$3 = -128;
                                var20 = ((ha) this).a(var9, (byte) -123, var13, this.a(param1, 0, param6, var9, var8_ref) - -var15);
                                if (var20 == 0) {
                                  var20 = 1;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L24: {
                                if (255 >= var20) {
                                  break L24;
                                } else {
                                  var20 = 255;
                                  break L24;
                                }
                              }
                              var10[0] = var20;
                              break L22;
                            }
                          }
                          L25: {
                            if (var17 == 0) {
                              break L25;
                            } else {
                              L26: {
                                if (var20 < var9.field_A + var9.field_Y) {
                                  break L26;
                                } else {
                                  if (param0.field_P == 7) {
                                    break L26;
                                  } else {
                                    if (8 != param0.field_P) {
                                      break L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                              }
                              L27: {
                                var19 = bw.field_m[var9.field_N][6];
                                if (var19 <= 1) {
                                  int discarded$4 = -128;
                                  var21 = ((ha) this).a(var8_ref, (byte) -125, var14, this.a(param1 - -param3, var20, param5 + param6, var8_ref, var9) + var16);
                                  if (var21 != 0) {
                                    break L27;
                                  } else {
                                    var21 = 1;
                                    break L27;
                                  }
                                } else {
                                  int discarded$5 = -128;
                                  var21 = ((ha) this).a(var8_ref, (byte) -123, var14, this.a(param1 - -param3, var20, param6 - -param5, var8_ref, var9) * 3 / 20 + var16);
                                  break L27;
                                }
                              }
                              L28: {
                                if (var21 > 255) {
                                  var21 = 255;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              var10[1] = var21;
                              break L25;
                            }
                          }
                          L29: {
                            if (var23.field_A + var23.field_Y > var21) {
                              break L29;
                            } else {
                              if (param4.field_P == 7) {
                                break L29;
                              } else {
                                if (param4.field_P != 8) {
                                  var10[2] = oe.c(var10[2], 1);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var20 < var9.field_Y + var9.field_A) {
                              break L30;
                            } else {
                              if (7 == param0.field_P) {
                                break L30;
                              } else {
                                if (param0.field_P != 8) {
                                  var10[2] = oe.c(var10[2], 2);
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                          stackOut_132_0 = (int[]) var10;
                          stackIn_133_0 = stackOut_132_0;
                          break L0;
                        } else {
                          stackOut_96_0 = (int[]) var10;
                          stackIn_97_0 = stackOut_96_0;
                          return stackIn_97_0;
                        }
                      }
                    }
                  }
                  stackOut_79_0 = (int[]) var10;
                  stackIn_80_0 = stackOut_79_0;
                  return stackIn_80_0;
                }
              }
            }
            stackOut_6_0 = (int[]) var10;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var8 = decompiledCaughtException;
            stackOut_134_0 = (RuntimeException) var8;
            stackOut_134_1 = new StringBuilder().append("ha.EC(");
            stackIn_136_0 = stackOut_134_0;
            stackIn_136_1 = stackOut_134_1;
            stackIn_135_0 = stackOut_134_0;
            stackIn_135_1 = stackOut_134_1;
            if (param0 == null) {
              stackOut_136_0 = (RuntimeException) (Object) stackIn_136_0;
              stackOut_136_1 = (StringBuilder) (Object) stackIn_136_1;
              stackOut_136_2 = "null";
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              stackIn_137_2 = stackOut_136_2;
              break L31;
            } else {
              stackOut_135_0 = (RuntimeException) (Object) stackIn_135_0;
              stackOut_135_1 = (StringBuilder) (Object) stackIn_135_1;
              stackOut_135_2 = "{...}";
              stackIn_137_0 = stackOut_135_0;
              stackIn_137_1 = stackOut_135_1;
              stackIn_137_2 = stackOut_135_2;
              break L31;
            }
          }
          L32: {
            stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
            stackOut_137_1 = ((StringBuilder) (Object) stackIn_137_1).append(stackIn_137_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_139_0 = stackOut_137_0;
            stackIn_139_1 = stackOut_137_1;
            stackIn_138_0 = stackOut_137_0;
            stackIn_138_1 = stackOut_137_1;
            if (param4 == null) {
              stackOut_139_0 = (RuntimeException) (Object) stackIn_139_0;
              stackOut_139_1 = (StringBuilder) (Object) stackIn_139_1;
              stackOut_139_2 = "null";
              stackIn_140_0 = stackOut_139_0;
              stackIn_140_1 = stackOut_139_1;
              stackIn_140_2 = stackOut_139_2;
              break L32;
            } else {
              stackOut_138_0 = (RuntimeException) (Object) stackIn_138_0;
              stackOut_138_1 = (StringBuilder) (Object) stackIn_138_1;
              stackOut_138_2 = "{...}";
              stackIn_140_0 = stackOut_138_0;
              stackIn_140_1 = stackOut_138_1;
              stackIn_140_2 = stackOut_138_2;
              break L32;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_140_0, stackIn_140_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_133_0;
    }

    private final void a(boolean param0, jd param1, gn param2) {
        RuntimeException var4 = null;
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
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            L1: {
              param2.a(new String[4], (byte) -120);
              param2.a(0, 2);
              param2.a(new String[2], (byte) -120);
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
              if (param1.field_A == 0) {
                break L5;
              } else {
                param2.a(new String[2], (byte) -54);
                break L5;
              }
            }
            param2.a(new String[4], (byte) -105);
            param2.a(0, -2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ha.T(").append(false).append(',');
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final boolean b(int param0, int param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            var4 = null;
            ((ha) this).a(56, (String) null, (oj) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((((ha) this).field_e & 1 << param1) != 0) {
              break L2;
            } else {
              if ((((ha) this).field_u & 1 << param1) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final int a(int param0, int param1, boolean param2) {
        int var4 = -1;
        if (!(param1 < 0)) {
            var4 = ((ha) this).o(param1, -1);
        }
        if (!param2) {
            ((ha) this).field_hb = -93;
        }
        return ((ha) this).field_Eb[param0].a((byte) 97, param1, var4);
    }

    private final int a(int param0, int param1, int param2, jd param3, jd param4) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int stackIn_13_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
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
        try {
          L0: {
            L1: {
              L2: {
                if (-8 == param3.field_P) {
                  break L2;
                } else {
                  if (-9 == param3.field_P) {
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
              if ((((ha) this).b(31, param0, param2, param4.field_O) & 16) == 0) {
                break L3;
              } else {
                var7_int = 90;
                break L3;
              }
            }
            L4: {
              if (!param4.n(116)) {
                break L4;
              } else {
                if (param3.x(-121)) {
                  var7_int = 90;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var8 = var7_int * (param4.field_A + (param4.field_Y + -param1)) / 100;
              if (var8 <= 0) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = var8;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var7;
            stackOut_14_1 = new StringBuilder().append("ha.VC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + -128 + ')');
        }
        return stackIn_13_0;
    }

    private final void a(int param0, int param1, vh param2, int param3) {
        int var5_int = 0;
        jd var6 = null;
        try {
            var5_int = param2.k(0);
            var6 = mb.a(var5_int, 0, param3, param0, param2, (ha) this, -102, true);
            ((ha) this).field_t[var6.field_O].a((byte) -119, (tc) (Object) var6);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ha.WD(" + param0 + ',' + -47 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String j(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ne var8 = null;
        int var9 = 0;
        gn var10 = null;
        jd var11 = null;
        gn var12 = null;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          var10 = new gn();
          var12 = var10;
          var10.a(new String[2], (byte) -116);
          var10.a(new String[4], (byte) -103);
          if (((ha) this).field_Bb) {
            var12.a((byte) 19, "kbd summoned");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 >= 0) {
            this.a(param0, var12, param1 + -3148);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var4 = param0;
          if (var4 < 0) {
            var4 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        var5 = 0;
        if (param1 == -248) {
          L3: while (true) {
            if (var5 >= ((ha) this).field_v) {
              var5 = 0;
              L4: while (true) {
                if (((ha) this).field_W <= var5) {
                  return var12.c(1024);
                } else {
                  var11 = (jd) (Object) ((ha) this).field_t[var5].e((byte) 124);
                  L5: while (true) {
                    if (var11 == null) {
                      var5++;
                      continue L4;
                    } else {
                      this.a(false, var11, var12);
                      var11 = (jd) (Object) ((ha) this).field_t[var5].a((byte) 123);
                      continue L5;
                    }
                  }
                }
              }
            } else {
              var6 = 0;
              L6: while (true) {
                if (((ha) this).field_db <= var6) {
                  var5++;
                  continue L3;
                } else {
                  var7 = var6 * ((ha) this).field_v - -var5;
                  var8 = ((ha) this).field_Eb[var7];
                  this.a(var4, var8, (byte) -40, var6, var12, var5);
                  var6++;
                  continue L6;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void b(vh param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = param0.k(0) & 31;
            if (var3_int != 13) {
              if (var3_int != 14) {
                L1: {
                  if (var3_int != 5) {
                    break L1;
                  } else {
                    L2: {
                      var4 = param0.k(0);
                      var5 = 15 & var4;
                      if (var5 != 15) {
                        break L2;
                      } else {
                        var5 = -1;
                        break L2;
                      }
                    }
                    ((ha) this).field_l.a((byte) -119, (tc) (Object) new pj(bo.a(-1, param0, 4368051), var5, var4 >> 4));
                    break L1;
                  }
                }
                L3: {
                  var4 = param0.k(0);
                  var5 = param0.k(0);
                  var6 = var3_int;
                  if (var6 == 1) {
                    ((ha) this).field_l.a((byte) -119, (tc) (Object) new q(var4, var5));
                    break L3;
                  } else {
                    if (var6 == 11) {
                      ((ha) this).field_l.a((byte) -119, (tc) (Object) new ec(var4, var5, param0.e((byte) -104), true));
                      break L3;
                    } else {
                      if (17 != var6) {
                        if (var6 == 16) {
                          this.a(var4, -47, param0, var5);
                          break L3;
                        } else {
                          if (2 != var6) {
                            if (var6 != 7) {
                              if (var6 != 8) {
                                if (15 != var6) {
                                  break L3;
                                } else {
                                  ((ha) this).field_l.a((byte) -119, (tc) (Object) new kf(var4, var5, param0.k(0), param0.k(0), param0.k(0), param0.k(0)));
                                  break L3;
                                }
                              } else {
                                ((ha) this).field_l.a((byte) -119, (tc) (Object) new tr(var4, var5, param0.k(0)));
                                break L3;
                              }
                            } else {
                              ((ha) this).field_l.a((byte) -119, (tc) (Object) new tr(var4, var5, 0));
                              break L3;
                            }
                          } else {
                            ((ha) this).field_l.a((byte) -119, (tc) (Object) new hp(var4, var5));
                            break L3;
                          }
                        }
                      } else {
                        ((ha) this).field_l.a((byte) -119, (tc) (Object) new ec(var4, var5, param0.e((byte) -104), false));
                        break L3;
                      }
                    }
                  }
                }
                break L0;
              } else {
                ((ha) this).field_l.a((byte) -119, (tc) (Object) new vp(3, param0.k(0), ((ha) this).field_sb));
                return;
              }
            } else {
              ((ha) this).field_l.a((byte) -119, (tc) (Object) new rl(param0.k(0)));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("ha.LC(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L4;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + -84 + ')');
        }
    }

    final int h(int param0, int param1) {
        if (param1 != 0) {
            return -38;
        }
        if (!(((ha) this).field_wb)) {
            return -1;
        }
        return ((ha) this).field_w[((ha) this).field_yb[param0]].c(16648);
    }

    final void a(int param0, String param1, oj param2) {
        String var4 = null;
        try {
            var4 = param2.a((byte) -8, false);
            if (param0 != 0) {
                ((ha) this).field_D = -23;
            }
            int discarded$0 = 7;
            this.j();
            var4 = param1 + "\n" + var4;
            ((ha) this).field_l.b(param0 ^ 98);
            int discarded$1 = 40;
            ik.a("Dropping conection: turn: " + ((ha) this).field_Gb + ", player: " + ((ha) this).field_gb + "\n" + var4);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ha.JC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0, int param1) {
        if (!(((ha) this).field_wb)) {
            return -1;
        }
        if (param0 != -9650) {
            return 126;
        }
        return ((ha) this).field_w[param1].c(16648);
    }

    private final void a(vh param0) {
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
        at stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ag stackIn_3_2 = null;
        ag stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        int stackIn_3_5 = 0;
        int stackIn_3_6 = 0;
        int stackIn_3_7 = 0;
        int stackIn_3_8 = 0;
        int stackIn_3_9 = 0;
        int stackIn_3_10 = 0;
        at stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ag stackIn_4_2 = null;
        ag stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        int stackIn_4_6 = 0;
        int stackIn_4_7 = 0;
        int stackIn_4_8 = 0;
        int stackIn_4_9 = 0;
        int stackIn_4_10 = 0;
        at stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        ag stackIn_5_2 = null;
        ag stackIn_5_3 = null;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        int stackIn_5_8 = 0;
        int stackIn_5_9 = 0;
        int stackIn_5_10 = 0;
        int stackIn_5_11 = 0;
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
        at stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ag stackIn_7_2 = null;
        ag stackIn_7_3 = null;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        int stackIn_7_9 = 0;
        int stackIn_7_10 = 0;
        int stackIn_7_11 = 0;
        at stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ag stackIn_8_2 = null;
        ag stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_8_8 = 0;
        int stackIn_8_9 = 0;
        int stackIn_8_10 = 0;
        int stackIn_8_11 = 0;
        int stackIn_8_12 = 0;
        at stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ag stackIn_9_2 = null;
        ag stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        int stackIn_9_9 = 0;
        int stackIn_9_10 = 0;
        int stackIn_9_11 = 0;
        int stackIn_9_12 = 0;
        int stackIn_9_13 = 0;
        int stackIn_9_14 = 0;
        at stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ag stackIn_10_2 = null;
        ag stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackIn_10_9 = 0;
        int stackIn_10_10 = 0;
        int stackIn_10_11 = 0;
        int stackIn_10_12 = 0;
        int stackIn_10_13 = 0;
        int stackIn_10_14 = 0;
        at stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ag stackIn_11_2 = null;
        ag stackIn_11_3 = null;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_11_9 = 0;
        int stackIn_11_10 = 0;
        int stackIn_11_11 = 0;
        int stackIn_11_12 = 0;
        int stackIn_11_13 = 0;
        int stackIn_11_14 = 0;
        int stackIn_11_15 = 0;
        at stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ag stackIn_12_2 = null;
        ag stackIn_12_3 = null;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_12_8 = 0;
        int stackIn_12_9 = 0;
        int stackIn_12_10 = 0;
        int stackIn_12_11 = 0;
        int stackIn_12_12 = 0;
        int stackIn_12_13 = 0;
        int stackIn_12_14 = 0;
        int stackIn_12_15 = 0;
        at stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ag stackIn_13_2 = null;
        ag stackIn_13_3 = null;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        int stackIn_13_9 = 0;
        int stackIn_13_10 = 0;
        int stackIn_13_11 = 0;
        int stackIn_13_12 = 0;
        int stackIn_13_13 = 0;
        int stackIn_13_14 = 0;
        int stackIn_13_15 = 0;
        at stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ag stackIn_14_2 = null;
        ag stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        int stackIn_14_11 = 0;
        int stackIn_14_12 = 0;
        int stackIn_14_13 = 0;
        int stackIn_14_14 = 0;
        int stackIn_14_15 = 0;
        int stackIn_14_16 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        at stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ag stackOut_2_2 = null;
        ag stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        int stackOut_2_5 = 0;
        int stackOut_2_6 = 0;
        int stackOut_2_7 = 0;
        int stackOut_2_8 = 0;
        int stackOut_2_9 = 0;
        int stackOut_2_10 = 0;
        at stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        ag stackOut_4_2 = null;
        ag stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        int stackOut_4_8 = 0;
        int stackOut_4_9 = 0;
        int stackOut_4_10 = 0;
        int stackOut_4_11 = 0;
        at stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ag stackOut_3_2 = null;
        ag stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        int stackOut_3_6 = 0;
        int stackOut_3_7 = 0;
        int stackOut_3_8 = 0;
        int stackOut_3_9 = 0;
        int stackOut_3_10 = 0;
        int stackOut_3_11 = 0;
        at stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ag stackOut_5_2 = null;
        ag stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        int stackOut_5_9 = 0;
        int stackOut_5_10 = 0;
        int stackOut_5_11 = 0;
        at stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ag stackOut_7_2 = null;
        ag stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        int stackOut_7_9 = 0;
        int stackOut_7_10 = 0;
        int stackOut_7_11 = 0;
        int stackOut_7_12 = 0;
        at stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ag stackOut_6_2 = null;
        ag stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        int stackOut_6_9 = 0;
        int stackOut_6_10 = 0;
        int stackOut_6_11 = 0;
        int stackOut_6_12 = 0;
        at stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ag stackOut_8_2 = null;
        ag stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        int stackOut_8_9 = 0;
        int stackOut_8_10 = 0;
        int stackOut_8_11 = 0;
        int stackOut_8_12 = 0;
        int stackOut_8_13 = 0;
        int stackOut_8_14 = 0;
        at stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ag stackOut_10_2 = null;
        ag stackOut_10_3 = null;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        int stackOut_10_9 = 0;
        int stackOut_10_10 = 0;
        int stackOut_10_11 = 0;
        int stackOut_10_12 = 0;
        int stackOut_10_13 = 0;
        int stackOut_10_14 = 0;
        int stackOut_10_15 = 0;
        at stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ag stackOut_9_2 = null;
        ag stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        int stackOut_9_9 = 0;
        int stackOut_9_10 = 0;
        int stackOut_9_11 = 0;
        int stackOut_9_12 = 0;
        int stackOut_9_13 = 0;
        int stackOut_9_14 = 0;
        int stackOut_9_15 = 0;
        at stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ag stackOut_11_2 = null;
        ag stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_11_9 = 0;
        int stackOut_11_10 = 0;
        int stackOut_11_11 = 0;
        int stackOut_11_12 = 0;
        int stackOut_11_13 = 0;
        int stackOut_11_14 = 0;
        int stackOut_11_15 = 0;
        at stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ag stackOut_13_2 = null;
        ag stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        int stackOut_13_9 = 0;
        int stackOut_13_10 = 0;
        int stackOut_13_11 = 0;
        int stackOut_13_12 = 0;
        int stackOut_13_13 = 0;
        int stackOut_13_14 = 0;
        int stackOut_13_15 = 0;
        int stackOut_13_16 = 0;
        at stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ag stackOut_12_2 = null;
        ag stackOut_12_3 = null;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        int stackOut_12_9 = 0;
        int stackOut_12_10 = 0;
        int stackOut_12_11 = 0;
        int stackOut_12_12 = 0;
        int stackOut_12_13 = 0;
        int stackOut_12_14 = 0;
        int stackOut_12_15 = 0;
        int stackOut_12_16 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.k(0);
              var4 = param0.k(0);
              var5 = param0.k(0);
              var6 = param0.k(0);
              var7 = param0.e((byte) -104);
              var8 = var7 >> 8;
              var9 = 255 & var7;
              var8 = (var8 ^ 128) - 128;
              var9 = (var9 ^ 128) + -128;
              var10 = param0.k(0);
              var11 = param0.k(0);
              var12 = param0.k(0);
              var13 = param0.k(0);
              if ((4 & var3_int) <= 0) {
                L2: {
                  stackOut_2_0 = ((ha) this).field_l;
                  stackOut_2_1 = -119;
                  stackOut_2_2 = null;
                  stackOut_2_3 = null;
                  stackOut_2_4 = var4;
                  stackOut_2_5 = var5;
                  stackOut_2_6 = var6;
                  stackOut_2_7 = var8;
                  stackOut_2_8 = var9;
                  stackOut_2_9 = var10;
                  stackOut_2_10 = var11;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  stackIn_4_3 = stackOut_2_3;
                  stackIn_4_4 = stackOut_2_4;
                  stackIn_4_5 = stackOut_2_5;
                  stackIn_4_6 = stackOut_2_6;
                  stackIn_4_7 = stackOut_2_7;
                  stackIn_4_8 = stackOut_2_8;
                  stackIn_4_9 = stackOut_2_9;
                  stackIn_4_10 = stackOut_2_10;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  stackIn_3_2 = stackOut_2_2;
                  stackIn_3_3 = stackOut_2_3;
                  stackIn_3_4 = stackOut_2_4;
                  stackIn_3_5 = stackOut_2_5;
                  stackIn_3_6 = stackOut_2_6;
                  stackIn_3_7 = stackOut_2_7;
                  stackIn_3_8 = stackOut_2_8;
                  stackIn_3_9 = stackOut_2_9;
                  stackIn_3_10 = stackOut_2_10;
                  if ((var3_int & 1) >= -1) {
                    stackOut_4_0 = (at) (Object) stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = null;
                    stackOut_4_3 = null;
                    stackOut_4_4 = stackIn_4_4;
                    stackOut_4_5 = stackIn_4_5;
                    stackOut_4_6 = stackIn_4_6;
                    stackOut_4_7 = stackIn_4_7;
                    stackOut_4_8 = stackIn_4_8;
                    stackOut_4_9 = stackIn_4_9;
                    stackOut_4_10 = stackIn_4_10;
                    stackOut_4_11 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    stackIn_5_4 = stackOut_4_4;
                    stackIn_5_5 = stackOut_4_5;
                    stackIn_5_6 = stackOut_4_6;
                    stackIn_5_7 = stackOut_4_7;
                    stackIn_5_8 = stackOut_4_8;
                    stackIn_5_9 = stackOut_4_9;
                    stackIn_5_10 = stackOut_4_10;
                    stackIn_5_11 = stackOut_4_11;
                    break L2;
                  } else {
                    stackOut_3_0 = (at) (Object) stackIn_3_0;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = null;
                    stackOut_3_3 = null;
                    stackOut_3_4 = stackIn_3_4;
                    stackOut_3_5 = stackIn_3_5;
                    stackOut_3_6 = stackIn_3_6;
                    stackOut_3_7 = stackIn_3_7;
                    stackOut_3_8 = stackIn_3_8;
                    stackOut_3_9 = stackIn_3_9;
                    stackOut_3_10 = stackIn_3_10;
                    stackOut_3_11 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    stackIn_5_3 = stackOut_3_3;
                    stackIn_5_4 = stackOut_3_4;
                    stackIn_5_5 = stackOut_3_5;
                    stackIn_5_6 = stackOut_3_6;
                    stackIn_5_7 = stackOut_3_7;
                    stackIn_5_8 = stackOut_3_8;
                    stackIn_5_9 = stackOut_3_9;
                    stackIn_5_10 = stackOut_3_10;
                    stackIn_5_11 = stackOut_3_11;
                    break L2;
                  }
                }
                L3: {
                  stackOut_5_0 = (at) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = null;
                  stackOut_5_3 = null;
                  stackOut_5_4 = stackIn_5_4;
                  stackOut_5_5 = stackIn_5_5;
                  stackOut_5_6 = stackIn_5_6;
                  stackOut_5_7 = stackIn_5_7;
                  stackOut_5_8 = stackIn_5_8;
                  stackOut_5_9 = stackIn_5_9;
                  stackOut_5_10 = stackIn_5_10;
                  stackOut_5_11 = stackIn_5_11;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_7_3 = stackOut_5_3;
                  stackIn_7_4 = stackOut_5_4;
                  stackIn_7_5 = stackOut_5_5;
                  stackIn_7_6 = stackOut_5_6;
                  stackIn_7_7 = stackOut_5_7;
                  stackIn_7_8 = stackOut_5_8;
                  stackIn_7_9 = stackOut_5_9;
                  stackIn_7_10 = stackOut_5_10;
                  stackIn_7_11 = stackOut_5_11;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  stackIn_6_4 = stackOut_5_4;
                  stackIn_6_5 = stackOut_5_5;
                  stackIn_6_6 = stackOut_5_6;
                  stackIn_6_7 = stackOut_5_7;
                  stackIn_6_8 = stackOut_5_8;
                  stackIn_6_9 = stackOut_5_9;
                  stackIn_6_10 = stackOut_5_10;
                  stackIn_6_11 = stackOut_5_11;
                  if (-1 >= (var3_int & 2)) {
                    stackOut_7_0 = (at) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = null;
                    stackOut_7_3 = null;
                    stackOut_7_4 = stackIn_7_4;
                    stackOut_7_5 = stackIn_7_5;
                    stackOut_7_6 = stackIn_7_6;
                    stackOut_7_7 = stackIn_7_7;
                    stackOut_7_8 = stackIn_7_8;
                    stackOut_7_9 = stackIn_7_9;
                    stackOut_7_10 = stackIn_7_10;
                    stackOut_7_11 = stackIn_7_11;
                    stackOut_7_12 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    stackIn_8_4 = stackOut_7_4;
                    stackIn_8_5 = stackOut_7_5;
                    stackIn_8_6 = stackOut_7_6;
                    stackIn_8_7 = stackOut_7_7;
                    stackIn_8_8 = stackOut_7_8;
                    stackIn_8_9 = stackOut_7_9;
                    stackIn_8_10 = stackOut_7_10;
                    stackIn_8_11 = stackOut_7_11;
                    stackIn_8_12 = stackOut_7_12;
                    break L3;
                  } else {
                    stackOut_6_0 = (at) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = null;
                    stackOut_6_3 = null;
                    stackOut_6_4 = stackIn_6_4;
                    stackOut_6_5 = stackIn_6_5;
                    stackOut_6_6 = stackIn_6_6;
                    stackOut_6_7 = stackIn_6_7;
                    stackOut_6_8 = stackIn_6_8;
                    stackOut_6_9 = stackIn_6_9;
                    stackOut_6_10 = stackIn_6_10;
                    stackOut_6_11 = stackIn_6_11;
                    stackOut_6_12 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    stackIn_8_4 = stackOut_6_4;
                    stackIn_8_5 = stackOut_6_5;
                    stackIn_8_6 = stackOut_6_6;
                    stackIn_8_7 = stackOut_6_7;
                    stackIn_8_8 = stackOut_6_8;
                    stackIn_8_9 = stackOut_6_9;
                    stackIn_8_10 = stackOut_6_10;
                    stackIn_8_11 = stackOut_6_11;
                    stackIn_8_12 = stackOut_6_12;
                    break L3;
                  }
                }
                L4: {
                  stackOut_8_0 = (at) (Object) stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = null;
                  stackOut_8_3 = null;
                  stackOut_8_4 = stackIn_8_4;
                  stackOut_8_5 = stackIn_8_5;
                  stackOut_8_6 = stackIn_8_6;
                  stackOut_8_7 = stackIn_8_7;
                  stackOut_8_8 = stackIn_8_8;
                  stackOut_8_9 = stackIn_8_9;
                  stackOut_8_10 = stackIn_8_10;
                  stackOut_8_11 = stackIn_8_11;
                  stackOut_8_12 = stackIn_8_12;
                  stackOut_8_13 = 7 & var12;
                  stackOut_8_14 = (var12 & 127) >> 4;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  stackIn_10_3 = stackOut_8_3;
                  stackIn_10_4 = stackOut_8_4;
                  stackIn_10_5 = stackOut_8_5;
                  stackIn_10_6 = stackOut_8_6;
                  stackIn_10_7 = stackOut_8_7;
                  stackIn_10_8 = stackOut_8_8;
                  stackIn_10_9 = stackOut_8_9;
                  stackIn_10_10 = stackOut_8_10;
                  stackIn_10_11 = stackOut_8_11;
                  stackIn_10_12 = stackOut_8_12;
                  stackIn_10_13 = stackOut_8_13;
                  stackIn_10_14 = stackOut_8_14;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  stackIn_9_5 = stackOut_8_5;
                  stackIn_9_6 = stackOut_8_6;
                  stackIn_9_7 = stackOut_8_7;
                  stackIn_9_8 = stackOut_8_8;
                  stackIn_9_9 = stackOut_8_9;
                  stackIn_9_10 = stackOut_8_10;
                  stackIn_9_11 = stackOut_8_11;
                  stackIn_9_12 = stackOut_8_12;
                  stackIn_9_13 = stackOut_8_13;
                  stackIn_9_14 = stackOut_8_14;
                  if ((8 & var12) == -1) {
                    stackOut_10_0 = (at) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = null;
                    stackOut_10_3 = null;
                    stackOut_10_4 = stackIn_10_4;
                    stackOut_10_5 = stackIn_10_5;
                    stackOut_10_6 = stackIn_10_6;
                    stackOut_10_7 = stackIn_10_7;
                    stackOut_10_8 = stackIn_10_8;
                    stackOut_10_9 = stackIn_10_9;
                    stackOut_10_10 = stackIn_10_10;
                    stackOut_10_11 = stackIn_10_11;
                    stackOut_10_12 = stackIn_10_12;
                    stackOut_10_13 = stackIn_10_13;
                    stackOut_10_14 = stackIn_10_14;
                    stackOut_10_15 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    stackIn_11_4 = stackOut_10_4;
                    stackIn_11_5 = stackOut_10_5;
                    stackIn_11_6 = stackOut_10_6;
                    stackIn_11_7 = stackOut_10_7;
                    stackIn_11_8 = stackOut_10_8;
                    stackIn_11_9 = stackOut_10_9;
                    stackIn_11_10 = stackOut_10_10;
                    stackIn_11_11 = stackOut_10_11;
                    stackIn_11_12 = stackOut_10_12;
                    stackIn_11_13 = stackOut_10_13;
                    stackIn_11_14 = stackOut_10_14;
                    stackIn_11_15 = stackOut_10_15;
                    break L4;
                  } else {
                    stackOut_9_0 = (at) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = null;
                    stackOut_9_3 = null;
                    stackOut_9_4 = stackIn_9_4;
                    stackOut_9_5 = stackIn_9_5;
                    stackOut_9_6 = stackIn_9_6;
                    stackOut_9_7 = stackIn_9_7;
                    stackOut_9_8 = stackIn_9_8;
                    stackOut_9_9 = stackIn_9_9;
                    stackOut_9_10 = stackIn_9_10;
                    stackOut_9_11 = stackIn_9_11;
                    stackOut_9_12 = stackIn_9_12;
                    stackOut_9_13 = stackIn_9_13;
                    stackOut_9_14 = stackIn_9_14;
                    stackOut_9_15 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_11_3 = stackOut_9_3;
                    stackIn_11_4 = stackOut_9_4;
                    stackIn_11_5 = stackOut_9_5;
                    stackIn_11_6 = stackOut_9_6;
                    stackIn_11_7 = stackOut_9_7;
                    stackIn_11_8 = stackOut_9_8;
                    stackIn_11_9 = stackOut_9_9;
                    stackIn_11_10 = stackOut_9_10;
                    stackIn_11_11 = stackOut_9_11;
                    stackIn_11_12 = stackOut_9_12;
                    stackIn_11_13 = stackOut_9_13;
                    stackIn_11_14 = stackOut_9_14;
                    stackIn_11_15 = stackOut_9_15;
                    break L4;
                  }
                }
                L5: {
                  stackOut_11_0 = (at) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = null;
                  stackOut_11_3 = null;
                  stackOut_11_4 = stackIn_11_4;
                  stackOut_11_5 = stackIn_11_5;
                  stackOut_11_6 = stackIn_11_6;
                  stackOut_11_7 = stackIn_11_7;
                  stackOut_11_8 = stackIn_11_8;
                  stackOut_11_9 = stackIn_11_9;
                  stackOut_11_10 = stackIn_11_10;
                  stackOut_11_11 = stackIn_11_11;
                  stackOut_11_12 = stackIn_11_12;
                  stackOut_11_13 = stackIn_11_13;
                  stackOut_11_14 = stackIn_11_14;
                  stackOut_11_15 = stackIn_11_15;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_13_3 = stackOut_11_3;
                  stackIn_13_4 = stackOut_11_4;
                  stackIn_13_5 = stackOut_11_5;
                  stackIn_13_6 = stackOut_11_6;
                  stackIn_13_7 = stackOut_11_7;
                  stackIn_13_8 = stackOut_11_8;
                  stackIn_13_9 = stackOut_11_9;
                  stackIn_13_10 = stackOut_11_10;
                  stackIn_13_11 = stackOut_11_11;
                  stackIn_13_12 = stackOut_11_12;
                  stackIn_13_13 = stackOut_11_13;
                  stackIn_13_14 = stackOut_11_14;
                  stackIn_13_15 = stackOut_11_15;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  stackIn_12_3 = stackOut_11_3;
                  stackIn_12_4 = stackOut_11_4;
                  stackIn_12_5 = stackOut_11_5;
                  stackIn_12_6 = stackOut_11_6;
                  stackIn_12_7 = stackOut_11_7;
                  stackIn_12_8 = stackOut_11_8;
                  stackIn_12_9 = stackOut_11_9;
                  stackIn_12_10 = stackOut_11_10;
                  stackIn_12_11 = stackOut_11_11;
                  stackIn_12_12 = stackOut_11_12;
                  stackIn_12_13 = stackOut_11_13;
                  stackIn_12_14 = stackOut_11_14;
                  stackIn_12_15 = stackOut_11_15;
                  if (-1 == (var12 & 128)) {
                    stackOut_13_0 = (at) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = null;
                    stackOut_13_3 = null;
                    stackOut_13_4 = stackIn_13_4;
                    stackOut_13_5 = stackIn_13_5;
                    stackOut_13_6 = stackIn_13_6;
                    stackOut_13_7 = stackIn_13_7;
                    stackOut_13_8 = stackIn_13_8;
                    stackOut_13_9 = stackIn_13_9;
                    stackOut_13_10 = stackIn_13_10;
                    stackOut_13_11 = stackIn_13_11;
                    stackOut_13_12 = stackIn_13_12;
                    stackOut_13_13 = stackIn_13_13;
                    stackOut_13_14 = stackIn_13_14;
                    stackOut_13_15 = stackIn_13_15;
                    stackOut_13_16 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    stackIn_14_4 = stackOut_13_4;
                    stackIn_14_5 = stackOut_13_5;
                    stackIn_14_6 = stackOut_13_6;
                    stackIn_14_7 = stackOut_13_7;
                    stackIn_14_8 = stackOut_13_8;
                    stackIn_14_9 = stackOut_13_9;
                    stackIn_14_10 = stackOut_13_10;
                    stackIn_14_11 = stackOut_13_11;
                    stackIn_14_12 = stackOut_13_12;
                    stackIn_14_13 = stackOut_13_13;
                    stackIn_14_14 = stackOut_13_14;
                    stackIn_14_15 = stackOut_13_15;
                    stackIn_14_16 = stackOut_13_16;
                    break L5;
                  } else {
                    stackOut_12_0 = (at) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = null;
                    stackOut_12_3 = null;
                    stackOut_12_4 = stackIn_12_4;
                    stackOut_12_5 = stackIn_12_5;
                    stackOut_12_6 = stackIn_12_6;
                    stackOut_12_7 = stackIn_12_7;
                    stackOut_12_8 = stackIn_12_8;
                    stackOut_12_9 = stackIn_12_9;
                    stackOut_12_10 = stackIn_12_10;
                    stackOut_12_11 = stackIn_12_11;
                    stackOut_12_12 = stackIn_12_12;
                    stackOut_12_13 = stackIn_12_13;
                    stackOut_12_14 = stackIn_12_14;
                    stackOut_12_15 = stackIn_12_15;
                    stackOut_12_16 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_14_5 = stackOut_12_5;
                    stackIn_14_6 = stackOut_12_6;
                    stackIn_14_7 = stackOut_12_7;
                    stackIn_14_8 = stackOut_12_8;
                    stackIn_14_9 = stackOut_12_9;
                    stackIn_14_10 = stackOut_12_10;
                    stackIn_14_11 = stackOut_12_11;
                    stackIn_14_12 = stackOut_12_12;
                    stackIn_14_13 = stackOut_12_13;
                    stackIn_14_14 = stackOut_12_14;
                    stackIn_14_15 = stackOut_12_15;
                    stackIn_14_16 = stackOut_12_16;
                    break L5;
                  }
                }
                ((at) (Object) stackIn_14_0).a((byte) stackIn_14_1, (tc) (Object) new ag(stackIn_14_4, stackIn_14_5, stackIn_14_6, stackIn_14_7, stackIn_14_8, stackIn_14_9, stackIn_14_10, stackIn_14_11 != 0, stackIn_14_12 != 0, stackIn_14_13, stackIn_14_14, stackIn_14_15 != 0, stackIn_14_16 != 0, var13));
                break L1;
              } else {
                ((ha) this).field_l.a((byte) -119, (tc) (Object) new md(var5, var6, var8, var9, var10));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ha.ND(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + -1 + ')');
        }
    }

    private final boolean d() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (eb.a((byte) -95, 85 & ((ha) this).field_e) == ((ha) this).field_W / ((ha) this).field_tb) {
          return false;
        } else {
          if (eb.a((byte) -97, ((ha) this).field_e & 170) == ((ha) this).field_W / ((ha) this).field_tb) {
            return true;
          } else {
            L0: {
              var2 = ((ha) this).i(0, -12710);
              var3 = ((ha) this).i(1, -12710);
              if (var2 > var3) {
                stackOut_20_0 = 1;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                if (var3 != var2) {
                  return false;
                } else {
                  var4 = this.b((byte) 31, 0);
                  var5 = this.b((byte) 31, 1);
                  if (var5 < var4) {
                    return true;
                  } else {
                    if (var4 == var5) {
                      var6 = 0;
                      var7 = 0;
                      var8 = 0;
                      L1: while (true) {
                        if (((ha) this).field_W <= var8) {
                          if (var7 >= var6) {
                            if (var6 != var7) {
                              stackOut_19_0 = 0;
                              stackIn_21_0 = stackOut_19_0;
                              break L0;
                            } else {
                              return true;
                            }
                          } else {
                            return true;
                          }
                        } else {
                          var7 = var7 + ((ha) this).field_H[var8 + 1];
                          var6 = var6 + ((ha) this).field_H[var8];
                          var8 += 2;
                          continue L1;
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            return stackIn_21_0 != 0;
          }
        }
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 < -126) {
              var3_int = 0;
              L1: while (true) {
                if (((ha) this).field_W <= var3_int) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (vr.a(11987, ((ha) this).field_lb[var3_int], param0)) {
                    stackOut_8_0 = var3_int;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = -8;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ha.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final int d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        var5 = 0;
        if (param2 == 6) {
          var6 = 0;
          L0: while (true) {
            if (var6 >= ((ha) this).field_W) {
              if (0 == var5) {
                return 0;
              } else {
                if (((ha) this).field_K != null) {
                  L1: {
                    if (((ha) this).field_K.field_w == param0) {
                      param1 = (int)((float)param1 * ((ha) this).field_bb);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return param1;
                } else {
                  return param1 * var4 / var5;
                }
              }
            } else {
              if (((ha) this).c(var6, param2 ^ -16991, param0)) {
                var4++;
                if (0 == (((ha) this).field_e & 1 << var6)) {
                  var5++;
                  var6++;
                  continue L0;
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return 58;
        }
    }

    final void b(int param0, vh param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ne var10_ref_ne = null;
        int var11 = 0;
        jd var12 = null;
        int var13 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        vh stackIn_71_4 = null;
        Object stackIn_71_5 = null;
        int stackIn_71_6 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        vh stackIn_72_4 = null;
        Object stackIn_72_5 = null;
        int stackIn_72_6 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        vh stackIn_73_4 = null;
        Object stackIn_73_5 = null;
        int stackIn_73_6 = 0;
        int stackIn_73_7 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        vh stackOut_70_4 = null;
        Object stackOut_70_5 = null;
        int stackOut_70_6 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        vh stackOut_72_4 = null;
        Object stackOut_72_5 = null;
        int stackOut_72_6 = 0;
        int stackOut_72_7 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        vh stackOut_71_4 = null;
        Object stackOut_71_5 = null;
        int stackOut_71_6 = 0;
        int stackOut_71_7 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((ha) this).field_jb = param1.i(param0 + 1);
            ((ha) this).field_O = param1.e((byte) -104);
            ((ha) this).field_T = new ln[((ha) this).field_W];
            var3_int = 0;
            L1: while (true) {
              if (~var3_int <= ~((ha) this).field_W) {
                L2: {
                  var3_int = param1.k(param0);
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if ((var3_int & 1) <= 0) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L2;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                }
                L3: {
                  ((ha) this).field_Bb = stackIn_7_1 != 0;
                  ((ha) this).field_hb = (56 & var3_int) >> 3;
                  ((ha) this).field_cb = (6 & var3_int) >> 1;
                  if ((var3_int & 128) == 0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var4 = stackIn_10_0;
                  var5 = 0;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    var5 = param1.k(0);
                    break L4;
                  }
                }
                ((ha) this).field_Gb = param1.k(param0);
                ((ha) this).field_gb = param1.k(param0);
                ((ha) this).l(param0, 0);
                var6 = ((ha) this).field_Eb.length + -1;
                L5: while (true) {
                  if (var6 < 0) {
                    L6: {
                      if (((ha) this).field_sb > -1) {
                        ((ha) this).field_E[((ha) this).field_sb][6] = param1.k(0);
                        var6 = 0;
                        L7: while (true) {
                          if (((ha) this).field_c[((ha) this).field_sb].length <= var6) {
                            L8: {
                              ((ha) this).field_H[((ha) this).field_sb] = param1.i(1);
                              ((ha) this).field_mb[((ha) this).field_sb] = param1.e((byte) -104);
                              ((ha) this).field_Q = param1.k(0);
                              if (((ha) this).field_Q != 0) {
                                L9: {
                                  if (((ha) this).field_B != null) {
                                    break L9;
                                  } else {
                                    ((ha) this).field_B = new int[((ha) this).field_W][5];
                                    break L9;
                                  }
                                }
                                var6 = 0;
                                L10: while (true) {
                                  if (var6 >= 5) {
                                    break L8;
                                  } else {
                                    L11: {
                                      var7 = param1.e((byte) -104);
                                      if (65535 == var7) {
                                        var7 = -1;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    ((ha) this).field_B[((ha) this).field_sb][var6] = var7;
                                    var6++;
                                    continue L10;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                            if (lf.field_i[((ha) this).field_Q] != 0) {
                              ((ha) this).field_m[((ha) this).field_sb] = param1.e((byte) -104);
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            L12: {
                              var7 = param1.k(param0);
                              ((ha) this).field_c[((ha) this).field_sb][var6] = var7 >> 4;
                              if (((ha) this).field_c[((ha) this).field_sb][var6] < 7) {
                                ((ha) this).field_E[((ha) this).field_sb][((ha) this).field_c[((ha) this).field_sb][var6]] = rn.a(15, var7);
                                ((ha) this).field_D = ((ha) this).field_D + 1;
                                if (var6 != 2) {
                                  break L12;
                                } else {
                                  ((ha) this).field_Cb = true;
                                  break L12;
                                }
                              } else {
                                ((ha) this).field_c[((ha) this).field_sb][var6] = -1;
                                break L12;
                              }
                            }
                            var6++;
                            continue L7;
                          }
                        }
                      } else {
                        var6 = 0;
                        L13: while (true) {
                          if (~((ha) this).field_W >= ~var6) {
                            break L6;
                          } else {
                            ((ha) this).field_mb[var6] = param1.e((byte) -104);
                            var6++;
                            continue L13;
                          }
                        }
                      }
                    }
                    var6 = 0;
                    L14: while (true) {
                      if (var6 >= ((ha) this).field_tb) {
                        var6 = 0;
                        L15: while (true) {
                          if (var6 >= ((ha) this).field_W) {
                            var6 = param1.e((byte) -104);
                            var7 = 0;
                            var8 = 0;
                            L16: while (true) {
                              L17: {
                                if (~var6 >= ~var8) {
                                  break L17;
                                } else {
                                  if (~(((ha) this).field_v * ((ha) this).field_db) >= ~var7) {
                                    break L17;
                                  } else {
                                    var9 = param1.k(0);
                                    if ((var9 & 128) == 0) {
                                      L18: {
                                        var10_ref_ne = ((ha) this).field_Eb[var7];
                                        if (0 < (1 & var9)) {
                                          var10_ref_ne.a(param0 + 63);
                                          break L18;
                                        } else {
                                          var10_ref_ne.i(14);
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        if ((var9 & 2) > 0) {
                                          var10_ref_ne.field_h = param1.k(0);
                                          var10_ref_ne.field_b = true;
                                          if (var10_ref_ne.field_h != 11) {
                                            break L19;
                                          } else {
                                            var11 = param1.k(0);
                                            var10_ref_ne.field_g = var11 >> 4 & 15;
                                            var10_ref_ne.field_j = var11 & 15;
                                            break L19;
                                          }
                                        } else {
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        if ((16 & var9) <= 0) {
                                          break L20;
                                        } else {
                                          var10_ref_ne.field_a = param1.k(0);
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if ((var9 & 4) > 0) {
                                          var10_ref_ne.field_m = param1.k(0);
                                          break L21;
                                        } else {
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        if ((64 & var9) > 0) {
                                          var11 = param1.k(0);
                                          var10_ref_ne.b(true, var11);
                                          break L22;
                                        } else {
                                          break L22;
                                        }
                                      }
                                      var7++;
                                      var8++;
                                      continue L16;
                                    } else {
                                      var7 = var7 + (127 & var9);
                                      continue L16;
                                    }
                                  }
                                }
                              }
                              var6 = param1.e((byte) -104);
                              var8 = param0;
                              L23: while (true) {
                                if (~var8 <= ~var6) {
                                  int discarded$1 = -29673;
                                  this.k();
                                  ((ha) this).f(-2);
                                  ((ha) this).field_xb = this.f((byte) -82);
                                  ((ha) this).b(param0 ^ 2);
                                  ((ha) this).a(0, 0, param0, -1);
                                  fl.a((ha) this, -118);
                                  break L0;
                                } else {
                                  L24: {
                                    var9 = param1.k(0);
                                    var10 = param1.k(0);
                                    var11 = param1.k(0);
                                    stackOut_70_0 = var11 & 127;
                                    stackOut_70_1 = var5;
                                    stackOut_70_2 = var10;
                                    stackOut_70_3 = var9;
                                    stackOut_70_4 = (vh) param1;
                                    stackOut_70_5 = this;
                                    stackOut_70_6 = -94;
                                    stackIn_72_0 = stackOut_70_0;
                                    stackIn_72_1 = stackOut_70_1;
                                    stackIn_72_2 = stackOut_70_2;
                                    stackIn_72_3 = stackOut_70_3;
                                    stackIn_72_4 = stackOut_70_4;
                                    stackIn_72_5 = stackOut_70_5;
                                    stackIn_72_6 = stackOut_70_6;
                                    stackIn_71_0 = stackOut_70_0;
                                    stackIn_71_1 = stackOut_70_1;
                                    stackIn_71_2 = stackOut_70_2;
                                    stackIn_71_3 = stackOut_70_3;
                                    stackIn_71_4 = stackOut_70_4;
                                    stackIn_71_5 = stackOut_70_5;
                                    stackIn_71_6 = stackOut_70_6;
                                    if ((128 & var11) == 0) {
                                      stackOut_72_0 = stackIn_72_0;
                                      stackOut_72_1 = stackIn_72_1;
                                      stackOut_72_2 = stackIn_72_2;
                                      stackOut_72_3 = stackIn_72_3;
                                      stackOut_72_4 = (vh) (Object) stackIn_72_4;
                                      stackOut_72_5 = this;
                                      stackOut_72_6 = stackIn_72_6;
                                      stackOut_72_7 = 0;
                                      stackIn_73_0 = stackOut_72_0;
                                      stackIn_73_1 = stackOut_72_1;
                                      stackIn_73_2 = stackOut_72_2;
                                      stackIn_73_3 = stackOut_72_3;
                                      stackIn_73_4 = stackOut_72_4;
                                      stackIn_73_5 = stackOut_72_5;
                                      stackIn_73_6 = stackOut_72_6;
                                      stackIn_73_7 = stackOut_72_7;
                                      break L24;
                                    } else {
                                      stackOut_71_0 = stackIn_71_0;
                                      stackOut_71_1 = stackIn_71_1;
                                      stackOut_71_2 = stackIn_71_2;
                                      stackOut_71_3 = stackIn_71_3;
                                      stackOut_71_4 = (vh) (Object) stackIn_71_4;
                                      stackOut_71_5 = this;
                                      stackOut_71_6 = stackIn_71_6;
                                      stackOut_71_7 = 1;
                                      stackIn_73_0 = stackOut_71_0;
                                      stackIn_73_1 = stackOut_71_1;
                                      stackIn_73_2 = stackOut_71_2;
                                      stackIn_73_3 = stackOut_71_3;
                                      stackIn_73_4 = stackOut_71_4;
                                      stackIn_73_5 = stackOut_71_5;
                                      stackIn_73_6 = stackOut_71_6;
                                      stackIn_73_7 = stackOut_71_7;
                                      break L24;
                                    }
                                  }
                                  var12 = mb.a(stackIn_73_0, stackIn_73_1, stackIn_73_2, stackIn_73_3, stackIn_73_4, (ha) this, stackIn_73_6, stackIn_73_7 != 0);
                                  ((ha) this).field_t[var12.field_O].a((byte) -119, (tc) (Object) var12);
                                  var8++;
                                  continue L23;
                                }
                              }
                            }
                          } else {
                            L25: while (true) {
                              if (((ha) this).field_t[var6].b(false) <= 0) {
                                var6++;
                                continue L15;
                              } else {
                                ((jd) (Object) ((ha) this).field_t[var6].e((byte) 121)).e(-98);
                                continue L25;
                              }
                            }
                          }
                        }
                      } else {
                        ((ha) this).field_fb[var6] = param1.e((byte) -104);
                        var6++;
                        continue L14;
                      }
                    }
                  } else {
                    ((ha) this).field_Eb[var6].i(14);
                    var6--;
                    continue L5;
                  }
                }
              } else {
                ((ha) this).field_T[var3_int] = new ln();
                tb.a(((ha) this).field_T[var3_int].field_a, param1, false, ((ha) this).field_T[var3_int].field_b);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var3 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var3;
            stackOut_76_1 = new StringBuilder().append("ha.UA(").append(param0).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param1 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L26;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L26;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + ')');
        }
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = ((ha) this).a((byte) 78);
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((ha) this).field_W) {
            return;
          } else {
            if (0 != (var2 & 1 << var3)) {
              boolean discarded$1 = ((ha) this).b(var3, true);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        if (param0 > -1) {
            if (-1 < param2) {
                if (param0 < ((ha) this).field_v) {
                    if (!(((ha) this).field_db <= param2)) {
                        ((ha) this).field_Eb[param0 - -(param2 * ((ha) this).field_v)].b(true, param3);
                    }
                }
            }
        }
    }

    final void f(int param0, int param1, int param2, int param3) {
        jd var5 = ((ha) this).c(param3, true, param0);
        if (var5 != null) {
            if (!(!((ha) this).c(var5.field_O, -16985, param1))) {
                var5.field_A = 5;
            }
        }
        if (param2 < 117) {
            ((ha) this).field_Cb = true;
        }
    }

    final int g(int param0) {
        if (!(param0 != ~((ha) this).field_A)) {
            return -1;
        }
        return 3 - ((ha) this).field_A;
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        if (param1 != 255) {
            Object var11 = null;
            this.a(30, (gn) null, -50);
        }
        int var6 = 0;
        int[] var15 = ((ha) this).a(param3, (byte) 118, param4, param0);
        int[] var14 = var15;
        int[] var13 = var14;
        int[] var12 = var13;
        int[] var7 = var12;
        int var8 = bw.field_m[param2][1];
        int var9 = b.a(false, param2);
        if (param2 != 74) {
            if (param2 >= 8) {
                if (!(0 != (1 << var9 & ((ha) this).field_a[param0][var8 - -1]))) {
                    return 4;
                }
            }
        }
        if (!this.f(bw.field_m[param2][8], ((ha) this).field_H[param0], 0)) {
            var6 = var6 | 1;
        }
        if (bw.field_m[param2][1] == -1) {
            var10 = var15[6];
        } else {
            var10 = var7[bw.field_m[param2][1]];
        }
        if (!(this.a(var10, true, bw.field_m[param2][2]))) {
            var6 = var6 | 2;
        }
        return var6;
    }

    final int e(int param0, int param1, int param2) {
        if (((ha) this).field_K != null) {
            if (uc.field_d[param2][4] == 4) {
                if (0 != uc.field_d[param2][3]) {
                    return -((ha) this).field_mb[param1] + 1;
                }
            }
            return 0;
        }
        int var4 = -66 % ((param0 - -19) / 35);
        if (((ha) this).field_mb[param1] < uc.field_d[param2][1]) {
            return uc.field_d[param2][1] - ((ha) this).field_mb[param1];
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param2 <= param3) {
            L1: {
              var5 = param1 + -param3;
              var6 = param3 + param1;
              var7 = param0 - param3;
              var8 = param0 + param3;
              if (var5 >= 0) {
                break L1;
              } else {
                var5 = 0;
                break L1;
              }
            }
            L2: {
              if (0 <= var7) {
                break L2;
              } else {
                var7 = 0;
                break L2;
              }
            }
            L3: {
              if (((ha) this).field_v <= var6) {
                var6 = -1 + ((ha) this).field_v;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((ha) this).field_db <= var8) {
                var8 = ((ha) this).field_db + -1;
                break L4;
              } else {
                break L4;
              }
            }
            var9 = var5;
            L5: while (true) {
              if (var6 < var9) {
                break L0;
              } else {
                var10 = var7;
                L6: while (true) {
                  if (var10 > var8) {
                    var9++;
                    continue L5;
                  } else {
                    this.b(((ha) this).field_Eb[var10 * ((ha) this).field_v + var9].field_k, 12534, var10, var9);
                    if (((ha) this).field_Eb[var9 + var10 * ((ha) this).field_v].field_c != null) {
                      ((ha) this).field_Eb[((ha) this).field_v * var10 + var9].field_c.a((byte) 55);
                      var10++;
                      continue L6;
                    } else {
                      var10++;
                      continue L6;
                    }
                  }
                }
              }
            }
          } else {
            var5 = 0;
            L7: while (true) {
              if (((ha) this).field_v <= var5) {
                break L0;
              } else {
                var6 = 0;
                L8: while (true) {
                  if (var6 >= ((ha) this).field_db) {
                    var5++;
                    continue L7;
                  } else {
                    this.b(((ha) this).field_Eb[var6 * ((ha) this).field_v + var5].field_k, 12534, var6, var5);
                    if (null != ((ha) this).field_Eb[var5 + var6 * ((ha) this).field_v].field_c) {
                      ((ha) this).field_Eb[var5 + var6 * ((ha) this).field_v].field_c.a((byte) -17);
                      var6++;
                      continue L8;
                    } else {
                      var6++;
                      continue L8;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void h() {
        oj var2 = null;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        while (((ha) this).field_l.b(false) > 0) {
            var2 = (oj) (Object) ((ha) this).field_l.a(0);
            var2.a((ha) this, -26661);
        }
    }

    private final int[] d(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int[] var6 = new int[((ha) this).field_W];
        int[] var2 = var6;
        for (var3 = 0; var3 < ((ha) this).field_W; var3++) {
            var6[var3] = ((ha) this).field_W;
        }
        int var7 = 0;
        var3 = var7;
        while (((ha) this).field_W > var7) {
            var4 = ((ha) this).field_n[var7];
            if (var4 == -1) {
                break;
            }
            var2[var4] = var7;
            var7++;
        }
        return var2;
    }

    final int a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        Object var11 = null;
        ne var12 = null;
        ne var13 = null;
        ne var14 = null;
        ne var15 = null;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param3 <= -32) {
            break L0;
          } else {
            var11 = null;
            int discarded$1 = this.a((String) null, 89);
            break L0;
          }
        }
        var5 = 1;
        L1: while (true) {
          if (var5 == 0) {
            return -1;
          } else {
            var5 = 0;
            var6 = -((ha) this).field_ab;
            L2: while (true) {
              if (var6 >= ((ha) this).field_ab) {
                ((ha) this).field_ab = ((ha) this).field_ab + 1;
                continue L1;
              } else {
                L3: {
                  var7 = param2 - -var6;
                  var8 = param0 + ((ha) this).field_ab;
                  if (var7 <= -1) {
                    break L3;
                  } else {
                    if (((ha) this).field_v <= var7) {
                      break L3;
                    } else {
                      if (var8 <= -1) {
                        break L3;
                      } else {
                        if (((ha) this).field_db <= var8) {
                          break L3;
                        } else {
                          var5 = 1;
                          var12 = ((ha) this).field_Eb[var7 + ((ha) this).field_v * var8];
                          if (!((ha) this).c(var12.field_a, -16985, param1)) {
                            break L3;
                          } else {
                            if (var12.field_c != null) {
                              break L3;
                            } else {
                              if (var12.field_l) {
                                break L3;
                              } else {
                                if (!var12.a(false)) {
                                  break L3;
                                } else {
                                  return var7 + var8 * ((ha) this).field_v;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L4: {
                  var7 = ((ha) this).field_ab + param2;
                  var8 = var6 + param0;
                  if (var7 <= -1) {
                    break L4;
                  } else {
                    if (((ha) this).field_v <= var7) {
                      break L4;
                    } else {
                      if (-1 >= var8) {
                        break L4;
                      } else {
                        if (var8 >= ((ha) this).field_db) {
                          break L4;
                        } else {
                          var5 = 1;
                          var13 = ((ha) this).field_Eb[var8 * ((ha) this).field_v + var7];
                          if (!((ha) this).c(var13.field_a, -16985, param1)) {
                            break L4;
                          } else {
                            if (var13.field_c != null) {
                              break L4;
                            } else {
                              if (var13.field_l) {
                                break L4;
                              } else {
                                if (var13.a(false)) {
                                  return ((ha) this).field_v * var8 + var7;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L5: {
                  var7 = -var6 + param2;
                  var8 = param0 + -((ha) this).field_ab;
                  if (var7 <= -1) {
                    break L5;
                  } else {
                    if (((ha) this).field_v <= var7) {
                      break L5;
                    } else {
                      if (var8 <= -1) {
                        break L5;
                      } else {
                        if (var8 < ((ha) this).field_db) {
                          var5 = 1;
                          var14 = ((ha) this).field_Eb[var8 * ((ha) this).field_v + var7];
                          if (!((ha) this).c(var14.field_a, -16985, param1)) {
                            break L5;
                          } else {
                            if (null != var14.field_c) {
                              break L5;
                            } else {
                              if (var14.field_l) {
                                break L5;
                              } else {
                                if (!var14.a(false)) {
                                  break L5;
                                } else {
                                  return var7 - -(var8 * ((ha) this).field_v);
                                }
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                var7 = param2 - ((ha) this).field_ab;
                var8 = -var6 + param0;
                if (var7 > -1) {
                  if (((ha) this).field_v > var7) {
                    if (var8 > -1) {
                      if (var8 < ((ha) this).field_db) {
                        var5 = 1;
                        var15 = ((ha) this).field_Eb[var7 + ((ha) this).field_v * var8];
                        if (((ha) this).c(var15.field_a, -16985, param1)) {
                          if (var15.field_c == null) {
                            if (!var15.field_l) {
                              if (var15.a(false)) {
                                return var8 * ((ha) this).field_v + var7;
                              } else {
                                var6++;
                                continue L2;
                              }
                            } else {
                              var6++;
                              continue L2;
                            }
                          } else {
                            var6++;
                            continue L2;
                          }
                        } else {
                          var6++;
                          continue L2;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(vh param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ne var9_ref_ne = null;
        int var9 = 0;
        Object var10 = null;
        jd var10_ref = null;
        int var12 = 0;
        Object var13 = null;
        ne var14 = null;
        int stackIn_7_0 = 0;
        vh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        vh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        vh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_59_0 = 0;
        vh stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        vh stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        vh stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        vh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        vh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        vh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        vh stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        vh stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        vh stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        var10 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            param0.a((byte) -58, ((ha) this).field_jb);
            param0.b(true, ((ha) this).field_O);
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((ha) this).field_W) {
                L2: {
                  if (((ha) this).field_Bb) {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var5 = stackIn_7_0 | ((ha) this).field_cb << 1 | ((ha) this).field_hb << 3 | 128;
                  param0.b(1, var5);
                  param0.b(param1 + 25772, 1);
                  param0.b(1, ((ha) this).field_Gb);
                  param0.b(1, ((ha) this).field_gb);
                  if (param2 <= -1) {
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= ((ha) this).field_W) {
                        break L3;
                      } else {
                        param0.b(true, ((ha) this).field_mb[var6]);
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    param0.b(1, ((ha) this).field_E[param2][6]);
                    var6 = 0;
                    L5: while (true) {
                      if (var6 >= ((ha) this).field_c[param2].length) {
                        L6: {
                          if (((ha) this).field_H[param2] >= 1) {
                            param0.a((byte) -107, ((ha) this).field_H[param2]);
                            break L6;
                          } else {
                            param0.a((byte) -104, 0);
                            break L6;
                          }
                        }
                        L7: {
                          param0.b(true, ((ha) this).field_mb[param2]);
                          param0.b(1, ((ha) this).field_Q);
                          if (((ha) this).field_Q != 0) {
                            var6 = 0;
                            L8: while (true) {
                              if (var6 >= 5) {
                                break L7;
                              } else {
                                param0.b(true, ((ha) this).field_B[param2][var6]);
                                var6++;
                                continue L8;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        if (lf.field_i[((ha) this).field_Q] != 0) {
                          param0.b(true, ((ha) this).field_m[param2]);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        L9: {
                          stackOut_10_0 = (vh) param0;
                          stackOut_10_1 = param1 + 25772;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          if (0 <= ((ha) this).field_c[param2][var6]) {
                            stackOut_12_0 = (vh) (Object) stackIn_12_0;
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = ((ha) this).field_E[param2][((ha) this).field_c[param2][var6]];
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            break L9;
                          } else {
                            stackOut_11_0 = (vh) (Object) stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = 0;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            break L9;
                          }
                        }
                        ((vh) (Object) stackIn_13_0).b(stackIn_13_1, stackIn_13_2 | ((ha) this).field_c[param2][var6] << 4);
                        var6++;
                        continue L5;
                      }
                    }
                  }
                }
                var6 = 0;
                L10: while (true) {
                  if (var6 >= ((ha) this).field_tb) {
                    var6 = 0;
                    var7 = 0;
                    L11: while (true) {
                      if (((ha) this).field_v <= var7) {
                        L12: {
                          if (param1 == -25771) {
                            break L12;
                          } else {
                            var13 = null;
                            ((ha) this).a(89, (String) null, (oj) null);
                            break L12;
                          }
                        }
                        L13: {
                          if (var4_int != 0) {
                            var6 = ((ha) this).field_db * ((ha) this).field_v;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        param0.b(true, var6);
                        var7 = 0;
                        var6 = 0;
                        var8 = 0;
                        L14: while (true) {
                          if (var8 >= ((ha) this).field_db * ((ha) this).field_v) {
                            var8 = param2;
                            var9 = 0;
                            L15: while (true) {
                              if (var9 >= ((ha) this).field_W) {
                                param0.b(true, var6);
                                var9 = 0;
                                L16: while (true) {
                                  if (var9 >= ((ha) this).field_W) {
                                    ((ha) this).b(param1 + 25773);
                                    break L0;
                                  } else {
                                    var10_ref = (jd) (Object) ((ha) this).field_t[var9].e((byte) 114);
                                    L17: while (true) {
                                      if (var10_ref == null) {
                                        var9++;
                                        continue L16;
                                      } else {
                                        L18: {
                                          L19: {
                                            if (((ha) this).field_Eb[var10_ref.field_J + ((ha) this).field_v * var10_ref.field_w].field_c == var10_ref) {
                                              break L19;
                                            } else {
                                              if (var8 != var9) {
                                                break L18;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L20: {
                                            param0.b(1, var10_ref.field_J);
                                            param0.b(1, var10_ref.field_w);
                                            stackOut_92_0 = (vh) param0;
                                            stackOut_92_1 = param1 + 25772;
                                            stackIn_94_0 = stackOut_92_0;
                                            stackIn_94_1 = stackOut_92_1;
                                            stackIn_93_0 = stackOut_92_0;
                                            stackIn_93_1 = stackOut_92_1;
                                            if (var10_ref == ((ha) this).field_Eb[((ha) this).field_v * var10_ref.field_w + var10_ref.field_J].field_c) {
                                              stackOut_94_0 = (vh) (Object) stackIn_94_0;
                                              stackOut_94_1 = stackIn_94_1;
                                              stackOut_94_2 = 0;
                                              stackIn_95_0 = stackOut_94_0;
                                              stackIn_95_1 = stackOut_94_1;
                                              stackIn_95_2 = stackOut_94_2;
                                              break L20;
                                            } else {
                                              stackOut_93_0 = (vh) (Object) stackIn_93_0;
                                              stackOut_93_1 = stackIn_93_1;
                                              stackOut_93_2 = 128;
                                              stackIn_95_0 = stackOut_93_0;
                                              stackIn_95_1 = stackOut_93_1;
                                              stackIn_95_2 = stackOut_93_2;
                                              break L20;
                                            }
                                          }
                                          ((vh) (Object) stackIn_95_0).b(stackIn_95_1, stackIn_95_2 | var10_ref.field_N);
                                          fu.a(29712, var10_ref, param0);
                                          break L18;
                                        }
                                        var10_ref = (jd) (Object) ((ha) this).field_t[var9].a((byte) 123);
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var10_ref = (jd) (Object) ((ha) this).field_t[var9].e((byte) 119);
                                L21: while (true) {
                                  if (var10_ref == null) {
                                    var9++;
                                    continue L15;
                                  } else {
                                    L22: {
                                      L23: {
                                        if (var10_ref == ((ha) this).field_Eb[var10_ref.field_J - -(var10_ref.field_w * ((ha) this).field_v)].field_c) {
                                          break L23;
                                        } else {
                                          if (var8 != var9) {
                                            break L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      var6++;
                                      break L22;
                                    }
                                    var10_ref = (jd) (Object) ((ha) this).field_t[var9].a((byte) 123);
                                    continue L21;
                                  }
                                }
                              }
                            }
                          } else {
                            L24: {
                              if (var4_int == 0) {
                                stackOut_58_0 = 0;
                                stackIn_59_0 = stackOut_58_0;
                                break L24;
                              } else {
                                stackOut_57_0 = 2;
                                stackIn_59_0 = stackOut_57_0;
                                break L24;
                              }
                            }
                            L25: {
                              var9 = stackIn_59_0;
                              var14 = ((ha) this).field_Eb[var8];
                              if (!var14.c(param1 ^ 25807)) {
                                break L25;
                              } else {
                                var9 = var9 | 1;
                                break L25;
                              }
                            }
                            L26: {
                              if (var14.field_b) {
                                var9 = var9 | 2;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            L27: {
                              if (var14.field_a <= -1) {
                                break L27;
                              } else {
                                var9 = var9 | 16;
                                break L27;
                              }
                            }
                            L28: {
                              if (null == var14.field_c) {
                                break L28;
                              } else {
                                if (var14.l(-1)) {
                                  var9 = var9 | 4;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            L29: {
                              if (!var14.c((byte) -79)) {
                                break L29;
                              } else {
                                var9 = var9 | 64;
                                break L29;
                              }
                            }
                            L30: {
                              if (var9 <= 0) {
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            var8++;
                            continue L14;
                          }
                        }
                      } else {
                        var8 = 0;
                        L31: while (true) {
                          if (((ha) this).field_v <= var8) {
                            var7++;
                            continue L11;
                          } else {
                            L32: {
                              L33: {
                                var9_ref_ne = ((ha) this).field_Eb[var7 - -(((ha) this).field_v * var8)];
                                if (var9_ref_ne.field_a > -1) {
                                  break L33;
                                } else {
                                  if (var9_ref_ne.field_b) {
                                    break L33;
                                  } else {
                                    L34: {
                                      if (null == var9_ref_ne.field_c) {
                                        break L34;
                                      } else {
                                        if (var9_ref_ne.l(param1 ^ 25770)) {
                                          break L33;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                    if (var9_ref_ne.c(67)) {
                                      break L33;
                                    } else {
                                      if (var9_ref_ne.c((byte) -79)) {
                                        break L33;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                              }
                              var6++;
                              break L32;
                            }
                            var8++;
                            continue L31;
                          }
                        }
                      }
                    }
                  } else {
                    L35: {
                      if (((ha) this).field_fb[var6] >= 1) {
                        param0.b(true, ((ha) this).field_fb[var6]);
                        break L35;
                      } else {
                        param0.b(true, 0);
                        break L35;
                      }
                    }
                    var6++;
                    continue L10;
                  }
                }
              } else {
                ir.a(((ha) this).field_T[var5].field_a, (byte) 100, param0, ((ha) this).field_T[var5].field_b);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var4 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) var4;
            stackOut_100_1 = new StringBuilder().append("ha.TD(");
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param0 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L36;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L36;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_103_0, stackIn_103_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, boolean param1, int[] param2) {
        try {
            ((ha) this).field_R = param0;
            if (param0 == 1) {
                ((ha) this).field_gb = param2[0];
            } else {
                ((ha) this).field_gb = -1;
            }
            ((ha) this).field_X = param1 ? true : false;
            ((ha) this).field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ha.HB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final oj b(boolean param0) {
        if (0 == ((ha) this).field_l.b(param0)) {
            return null;
        }
        oj var2 = (oj) (Object) ((ha) this).field_l.e((byte) 118);
        if (var2 == null) {
            return null;
        }
        return var2;
    }

    final void a(byte param0, int param1, int param2, ne[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        int var23 = 0;
        at var24 = null;
        bb var25 = null;
        ne var26 = null;
        jd var27 = null;
        int[] var31 = null;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        jd stackIn_45_0 = null;
        jd stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        int stackIn_45_5 = 0;
        int stackIn_45_6 = 0;
        int stackIn_45_7 = 0;
        jd stackIn_46_0 = null;
        jd stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        int stackIn_46_6 = 0;
        int stackIn_46_7 = 0;
        jd stackIn_47_0 = null;
        jd stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int stackIn_47_6 = 0;
        int stackIn_47_7 = 0;
        int stackIn_47_8 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        jd stackOut_44_0 = null;
        jd stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        int stackOut_44_5 = 0;
        int stackOut_44_6 = 0;
        int stackOut_44_7 = 0;
        jd stackOut_46_0 = null;
        jd stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        int stackOut_46_7 = 0;
        int stackOut_46_8 = 0;
        jd stackOut_45_0 = null;
        jd stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_45_6 = 0;
        int stackOut_45_7 = 0;
        int stackOut_45_8 = 0;
        int stackOut_78_0 = 0;
        int stackOut_79_0 = 0;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              return;
            } else {
              var5_int = param1 * param2;
              if (param3.length == var5_int) {
                ((ha) this).field_j = new ul((ha) this, param3, param1, param2);
                ((ha) this).field_Eb = param3;
                ((ha) this).field_db = param2;
                ((ha) this).field_v = param1;
                var6 = 0;
                L1: while (true) {
                  if (~((ha) this).field_t.length >= ~var6) {
                    L2: {
                      if (param0 < -69) {
                        break L2;
                      } else {
                        int discarded$5 = ((ha) this).a(83, -46, -45, (byte) -10);
                        break L2;
                      }
                    }
                    var23 = 0;
                    var6 = var23;
                    L3: while (true) {
                      if (~var23 <= ~((ha) this).field_Eb.length) {
                        int discarded$6 = -29673;
                        this.k();
                        ((ha) this).f(-2);
                        break L0;
                      } else {
                        L4: {
                          var21 = ((ha) this).field_Eb[var23];
                          var26 = var21;
                          if (var26 == null) {
                            break L4;
                          } else {
                            L5: {
                              var22 = var26.field_c;
                              var27 = var22;
                              if (var27 == null) {
                                break L5;
                              } else {
                                var9 = var27.field_O;
                                var10 = var27.field_J;
                                var11 = var27.field_w;
                                var12 = var27.field_N;
                                var21.field_c = null;
                                var31 = bw.field_m[var12];
                                if (var9 < 0) {
                                  break L4;
                                } else {
                                  if (((ha) this).field_W <= var9) {
                                    break L4;
                                  } else {
                                    L6: {
                                      if (0 != var12) {
                                        stackOut_26_0 = var31[4];
                                        stackIn_27_0 = stackOut_26_0;
                                        break L6;
                                      } else {
                                        stackOut_25_0 = 10;
                                        stackIn_27_0 = stackOut_25_0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      var14 = stackIn_27_0;
                                      if (0 != var12) {
                                        stackOut_29_0 = var31[4];
                                        stackIn_30_0 = stackOut_29_0;
                                        break L7;
                                      } else {
                                        stackOut_28_0 = 10;
                                        stackIn_30_0 = stackOut_28_0;
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      var15 = stackIn_30_0;
                                      if ((16 & var27.field_V) != 0) {
                                        var15 = var27.field_Y;
                                        if (var14 < var15) {
                                          var14 = var15;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      if (75 != var12) {
                                        stackOut_37_0 = 0;
                                        stackIn_38_0 = stackOut_37_0;
                                        break L9;
                                      } else {
                                        stackOut_36_0 = 1;
                                        stackIn_38_0 = stackOut_36_0;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      var16 = stackIn_38_0;
                                      if (var16 != 0) {
                                        var12 = 34;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (var12 != 4) {
                                        break L11;
                                      } else {
                                        if (((ha) this).field_hb != 2) {
                                          break L11;
                                        } else {
                                          var12 = 81;
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      stackOut_44_0 = null;
                                      stackOut_44_1 = null;
                                      stackOut_44_2 = var10;
                                      stackOut_44_3 = var11;
                                      stackOut_44_4 = var12;
                                      stackOut_44_5 = var9;
                                      stackOut_44_6 = var14;
                                      stackOut_44_7 = var15;
                                      stackIn_46_0 = stackOut_44_0;
                                      stackIn_46_1 = stackOut_44_1;
                                      stackIn_46_2 = stackOut_44_2;
                                      stackIn_46_3 = stackOut_44_3;
                                      stackIn_46_4 = stackOut_44_4;
                                      stackIn_46_5 = stackOut_44_5;
                                      stackIn_46_6 = stackOut_44_6;
                                      stackIn_46_7 = stackOut_44_7;
                                      stackIn_45_0 = stackOut_44_0;
                                      stackIn_45_1 = stackOut_44_1;
                                      stackIn_45_2 = stackOut_44_2;
                                      stackIn_45_3 = stackOut_44_3;
                                      stackIn_45_4 = stackOut_44_4;
                                      stackIn_45_5 = stackOut_44_5;
                                      stackIn_45_6 = stackOut_44_6;
                                      stackIn_45_7 = stackOut_44_7;
                                      if (var12 != 0) {
                                        stackOut_46_0 = null;
                                        stackOut_46_1 = null;
                                        stackOut_46_2 = stackIn_46_2;
                                        stackOut_46_3 = stackIn_46_3;
                                        stackOut_46_4 = stackIn_46_4;
                                        stackOut_46_5 = stackIn_46_5;
                                        stackOut_46_6 = stackIn_46_6;
                                        stackOut_46_7 = stackIn_46_7;
                                        stackOut_46_8 = 0;
                                        stackIn_47_0 = stackOut_46_0;
                                        stackIn_47_1 = stackOut_46_1;
                                        stackIn_47_2 = stackOut_46_2;
                                        stackIn_47_3 = stackOut_46_3;
                                        stackIn_47_4 = stackOut_46_4;
                                        stackIn_47_5 = stackOut_46_5;
                                        stackIn_47_6 = stackOut_46_6;
                                        stackIn_47_7 = stackOut_46_7;
                                        stackIn_47_8 = stackOut_46_8;
                                        break L12;
                                      } else {
                                        stackOut_45_0 = null;
                                        stackOut_45_1 = null;
                                        stackOut_45_2 = stackIn_45_2;
                                        stackOut_45_3 = stackIn_45_3;
                                        stackOut_45_4 = stackIn_45_4;
                                        stackOut_45_5 = stackIn_45_5;
                                        stackOut_45_6 = stackIn_45_6;
                                        stackOut_45_7 = stackIn_45_7;
                                        stackOut_45_8 = 8;
                                        stackIn_47_0 = stackOut_45_0;
                                        stackIn_47_1 = stackOut_45_1;
                                        stackIn_47_2 = stackOut_45_2;
                                        stackIn_47_3 = stackOut_45_3;
                                        stackIn_47_4 = stackOut_45_4;
                                        stackIn_47_5 = stackOut_45_5;
                                        stackIn_47_6 = stackOut_45_6;
                                        stackIn_47_7 = stackOut_45_7;
                                        stackIn_47_8 = stackOut_45_8;
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      var17 = new jd(stackIn_47_2, stackIn_47_3, stackIn_47_4, stackIn_47_5, stackIn_47_6, stackIn_47_7, stackIn_47_8 | 1, 0, 0, (ha) this, 0, 0, -1, false, 0);
                                      if (var17.p(-43)) {
                                        ((ha) this).a(var11, var10, 0, 3);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (var16 == 0) {
                                        break L14;
                                      } else {
                                        var17.z(10);
                                        var17.field_W = true;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      var17.field_H = var27.field_H;
                                      var17.field_V = var27.field_V;
                                      var17.field_E = var27.field_E;
                                      if (var27.field_K != null) {
                                        var17.field_K = var27.field_K;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      if (!var27.c(false)) {
                                        break L16;
                                      } else {
                                        if (((ha) this).field_K == null) {
                                          break L16;
                                        } else {
                                          ((ha) this).field_V = false;
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (var27.field_q < 0) {
                                        break L17;
                                      } else {
                                        if (uc.field_d[var22.field_q][4] == 5) {
                                          throw new IllegalStateException("");
                                        } else {
                                          var18 = new vh(4);
                                          var18.b(true, var27.field_q);
                                          var18.b(1, var27.field_J);
                                          var18.b(1, var27.field_w);
                                          var18.field_q = 0;
                                          var19 = bo.a(var27.field_O, var18, 4368051);
                                          if (var19 == null) {
                                            break L17;
                                          } else {
                                            var19.a(var27.field_O, (ha) this, 26123);
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    var21.field_c = var17;
                                    ((ha) this).field_t[var9].a((byte) -119, (tc) (Object) var17);
                                    break L5;
                                  }
                                }
                              }
                            }
                            if (var26.field_a > -1) {
                              L18: {
                                var10 = var26.field_h;
                                if (var10 != 11) {
                                  if (7 == var10) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if (var10 != 14) {
                                        if (var10 != 9) {
                                          if (var10 != 8) {
                                            if (var26.e((byte) -122)) {
                                              break L4;
                                            } else {
                                              var26.field_a = -1;
                                              break L4;
                                            }
                                          } else {
                                            int[] dupTemp$7 = ((ha) this).field_z[((ha) this).o(var26.field_a, -1)];
                                            dupTemp$7[2] = dupTemp$7[2] + 1;
                                            break L4;
                                          }
                                        } else {
                                          break L19;
                                        }
                                      } else {
                                        break L19;
                                      }
                                    }
                                    int[] dupTemp$8 = ((ha) this).field_z[((ha) this).o(var26.field_a, -1)];
                                    dupTemp$8[1] = dupTemp$8[1] + 1;
                                    break L4;
                                  }
                                } else {
                                  L20: {
                                    L21: {
                                      if (((ha) this).field_K == null) {
                                        break L21;
                                      } else {
                                        if (~((ha) this).field_K.field_w == ~var26.field_a) {
                                          break L21;
                                        } else {
                                          stackOut_78_0 = 1;
                                          stackIn_80_0 = stackOut_78_0;
                                          break L20;
                                        }
                                      }
                                    }
                                    stackOut_79_0 = 0;
                                    stackIn_80_0 = stackOut_79_0;
                                    break L20;
                                  }
                                  var9 = stackIn_80_0;
                                  if (var9 != 0) {
                                    var26.field_j = ((ha) this).field_E[var26.field_a][var26.field_g];
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              int[] dupTemp$9 = ((ha) this).field_z[((ha) this).o(var26.field_a, -1)];
                              dupTemp$9[0] = dupTemp$9[0] + 1;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var23++;
                        continue L3;
                      }
                    }
                  } else {
                    L22: {
                      var24 = ((ha) this).field_t[var6];
                      if (var24 != null) {
                        if (var24.b(false) != 0) {
                          var25 = new bb(var24);
                          var9_ref_jd = (jd) (Object) var25.c(50);
                          L23: while (true) {
                            if (var9_ref_jd == null) {
                              break L22;
                            } else {
                              var10_ref_jd = (jd) (Object) var25.b(50);
                              var9_ref_jd.d(70);
                              var9_ref_jd = var10_ref_jd;
                              continue L23;
                            }
                          }
                        } else {
                          break L22;
                        }
                      } else {
                        break L22;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var5 = decompiledCaughtException;
            stackOut_91_0 = (RuntimeException) var5;
            stackOut_91_1 = new StringBuilder().append("ha.OB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param3 == null) {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L24;
            } else {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L24;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_94_0, stackIn_94_2 + ')');
        }
    }

    private final void a(int param0, ne param1, byte param2, int param3, gn param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (this.a(param0, param1, 112)) {
              L1: {
                if (param1.field_b) {
                  break L1;
                } else {
                  if (param1.c(-75)) {
                    break L1;
                  } else {
                    if (param1.c((byte) -79)) {
                      break L1;
                    } else {
                      if (-1 == param1.field_a) {
                        return;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L2: {
                param4.a(new String[3], (byte) -95);
                param4.a(0, 2);
                if (param1.field_b) {
                  param4.a(new String[2], (byte) -106);
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
                  param4.a(new String[2], (byte) -57);
                  break L4;
                }
              }
              L5: {
                if (param1.field_a != -1) {
                  param4.a(new String[2], (byte) -93);
                  param4.a(0, -2);
                  break L5;
                } else {
                  param4.a(0, -2);
                  break L5;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var7;
            stackOut_20_1 = new StringBuilder().append("ha.FC(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(-40).append(',').append(param3).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param5 + ')');
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == -2) {
            break L0;
          } else {
            ((ha) this).field_d = null;
            break L0;
          }
        }
        ((ha) this).field_s[1] = 0;
        ((ha) this).field_s[2] = 0;
        ((ha) this).field_s[0] = 0;
        if (null != ((ha) this).field_Eb) {
          var2 = 0;
          L1: while (true) {
            if (var2 >= ((ha) this).field_Eb.length) {
              return;
            } else {
              var3 = ((ha) this).field_Eb[var2].field_h;
              if (var3 == 7) {
                ((ha) this).field_s[0] = ((ha) this).field_s[0] + 1;
                var2++;
                continue L1;
              } else {
                L2: {
                  if (14 != var3) {
                    if (var3 != 9) {
                      if (var3 == 8) {
                        ((ha) this).field_s[2] = ((ha) this).field_s[2] + 1;
                        var2++;
                        continue L1;
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((ha) this).field_s[1] = ((ha) this).field_s[1] + 1;
                var2++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var9 = 0;
        int[] var14 = ((ha) this).a(param0, (byte) 37, param3, param4);
        int[] var13 = var14;
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var6 = var10;
        int var7 = bw.field_m[param2][1];
        int var8 = b.a(false, param2);
        if (param2 != 74) {
            if (param2 >= 8) {
                if (0 == (((ha) this).field_a[param4][1 + var7] & 1 << var8)) {
                    return false;
                }
            }
        }
        if (!this.f(bw.field_m[param2][8], ((ha) this).field_H[param4], 0)) {
        } else {
            if (-1 == bw.field_m[param2][1]) {
                var9 = var14[6];
            } else {
                var10 = var6;
                var9 = var10[bw.field_m[param2][1]];
            }
            if (!(!this.a(var9, true, bw.field_m[param2][2]))) {
                return true;
            }
        }
        if (param1 != -26813) {
            ((ha) this).field_xb = 58;
            return false;
        }
        return false;
    }

    private final int b(byte param0, int param1) {
        return ((ha) this).field_z[param1][0] * 10 - (-(5 * ((ha) this).field_z[param1][1]) + -(2 * ((ha) this).field_z[param1][2]));
    }

    private final boolean a(int param0, ne param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
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
            var4_int = 94 % ((-56 - param2) / 50);
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("ha.TB(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final int a(jd param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param2 == 14336) {
              int discarded$2 = 1;
              stackOut_3_0 = pj.a(((ha) this).field_v, ((ha) this).field_Eb, param3, param4, param6, ((ha) this).field_db, ((ha) this).o(param6, -1), param0, param5, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 112;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("ha.HC(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, vh param1, byte param2) {
        try {
            if (param2 > -71) {
                ((ha) this).field_W = 26;
            }
            if (!(((ha) this).field_Z != null)) {
                param0 -= 2;
                ((ha) this).field_Z = new vh(param1.e((byte) -104));
            }
            param1.a(0, param0, ((ha) this).field_Z.field_q, ((ha) this).field_Z.field_o);
            ((ha) this).field_Z.field_q = ((ha) this).field_Z.field_q + param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ha.AC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1, int param2, int param3) {
        int var5 = -1;
        if (!(param3 < 0)) {
            var5 = ((ha) this).o(param3, param0 ^ -32);
        }
        if (param0 != 31) {
            int discarded$0 = ((ha) this).c(-23, -102);
        }
        return ((ha) this).field_Eb[param2 + ((ha) this).field_v * param1].a((byte) 97, param3, var5);
    }

    private final void a(vh param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            int discarded$0 = param0.k(0);
            var3_int = param0.k(0);
            var4 = param0.k(0);
            var5 = param0.k(0);
            var6 = param0.k(0);
            var7 = 31 & var4;
            var7 = (16 ^ var7) - 16;
            ((ha) this).field_l.a((byte) -119, (tc) (Object) new mb(var3_int, var5, var6, var7, var4 >> 5));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ha.CB(" + (param0 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    private final int b(int param0, jd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            var3_int = var3_int ^ 38 * param1.field_J;
            var3_int = var3_int ^ param1.field_w * 391;
            var3_int = var3_int ^ param1.field_A * 874;
            var3_int = var3_int ^ 23874 * param1.field_N;
            var3_int = var3_int ^ param1.field_Y * 584668;
            var3_int = var3_int ^ 445235 * param1.field_t;
            stackOut_9_0 = var3_int;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ha.TC(").append(-125).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final void e(int param0, int param1, int param2, int param3) {
        if (param0 != 14) {
            Object var6 = null;
            boolean discarded$0 = this.a(-18, (ne) null, 8);
        }
        jd var5 = ((ha) this).c(param3, true, param1);
        if (var5 != null) {
            if (((ha) this).c(var5.field_O, -16985, param2)) {
                var5.field_I = false;
            }
        }
    }

    final int a(byte param0, int param1, int param2) {
        if (param0 != 11) {
            ((ha) this).a((byte) 47, 3, 37, -46);
        }
        return 0;
    }

    final void d(int param0, int param1, int param2, int param3) {
        if (!(((ha) this).field_b)) {
            return;
        }
        if (param2 < 68) {
            return;
        }
        if (((ha) this).field_d[param3] < param1) {
            ((ha) this).field_d[param3] = param1;
            ((ha) this).field_N[param3] = param0;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        jd var6 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ha) this).field_gb > -1) {
            var6 = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].e((byte) 91);
            while (var6 != null) {
                var6.m((byte) -36);
                var6 = (jd) (Object) ((ha) this).field_t[((ha) this).field_gb].a((byte) 123);
            }
            ((ha) this).field_mb[((ha) this).field_gb] = ((ha) this).field_mb[((ha) this).field_gb] + 1;
            ((ha) this).field_gb = param1;
            ((ha) this).field_Gb = param2;
            at discarded$0 = ((ha) this).a(false, false, 0);
            ((ha) this).a(1);
        } else {
            ((ha) this).field_gb = param1;
            ((ha) this).field_Gb = param2;
        }
        this.a(param1, (byte) 111);
        if (!param0) {
            ((ha) this).field_n = null;
            return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, int param8, int param9) {
        jd var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        jd var20 = null;
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
        at stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        nw stackIn_106_2 = null;
        nw stackIn_106_3 = null;
        jd stackIn_106_4 = null;
        int stackIn_106_5 = 0;
        at stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        nw stackIn_107_2 = null;
        nw stackIn_107_3 = null;
        jd stackIn_107_4 = null;
        int stackIn_107_5 = 0;
        at stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        nw stackIn_108_2 = null;
        nw stackIn_108_3 = null;
        jd stackIn_108_4 = null;
        int stackIn_108_5 = 0;
        at stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        nw stackIn_109_2 = null;
        nw stackIn_109_3 = null;
        jd stackIn_109_4 = null;
        int stackIn_109_5 = 0;
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
        int stackIn_111_6 = 0;
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
        at stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        nw stackIn_116_2 = null;
        nw stackIn_116_3 = null;
        jd stackIn_116_4 = null;
        int stackIn_116_5 = 0;
        at stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        nw stackIn_117_2 = null;
        nw stackIn_117_3 = null;
        jd stackIn_117_4 = null;
        int stackIn_117_5 = 0;
        int stackIn_117_6 = 0;
        int stackIn_125_0 = 0;
        int stackIn_131_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_64_0 = 0;
        at stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        nw stackOut_105_2 = null;
        nw stackOut_105_3 = null;
        jd stackOut_105_4 = null;
        int stackOut_105_5 = 0;
        at stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        nw stackOut_106_2 = null;
        nw stackOut_106_3 = null;
        jd stackOut_106_4 = null;
        int stackOut_106_5 = 0;
        at stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        nw stackOut_107_2 = null;
        nw stackOut_107_3 = null;
        jd stackOut_107_4 = null;
        int stackOut_107_5 = 0;
        at stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        nw stackOut_108_2 = null;
        nw stackOut_108_3 = null;
        jd stackOut_108_4 = null;
        int stackOut_108_5 = 0;
        at stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        nw stackOut_109_2 = null;
        nw stackOut_109_3 = null;
        jd stackOut_109_4 = null;
        int stackOut_109_5 = 0;
        int stackOut_109_6 = 0;
        at stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        nw stackOut_110_2 = null;
        nw stackOut_110_3 = null;
        jd stackOut_110_4 = null;
        int stackOut_110_5 = 0;
        int stackOut_110_6 = 0;
        at stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        nw stackOut_111_2 = null;
        nw stackOut_111_3 = null;
        jd stackOut_111_4 = null;
        int stackOut_111_5 = 0;
        at stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        nw stackOut_112_2 = null;
        nw stackOut_112_3 = null;
        jd stackOut_112_4 = null;
        int stackOut_112_5 = 0;
        at stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        nw stackOut_113_2 = null;
        nw stackOut_113_3 = null;
        jd stackOut_113_4 = null;
        int stackOut_113_5 = 0;
        at stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        nw stackOut_114_2 = null;
        nw stackOut_114_3 = null;
        jd stackOut_114_4 = null;
        int stackOut_114_5 = 0;
        at stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        nw stackOut_115_2 = null;
        nw stackOut_115_3 = null;
        jd stackOut_115_4 = null;
        int stackOut_115_5 = 0;
        int stackOut_115_6 = 0;
        at stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        nw stackOut_116_2 = null;
        nw stackOut_116_3 = null;
        jd stackOut_116_4 = null;
        int stackOut_116_5 = 0;
        int stackOut_116_6 = 0;
        int stackOut_123_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_130_0 = 0;
        L0: {
          var19 = ArmiesOfGielinor.field_M ? 1 : 0;
          var20 = ((ha) this).c(param0, true, param3);
          var12 = ((ha) this).c(param0 + param4, true, param1 + param3);
          var13 = Math.abs(param1) + Math.abs(param4);
          if (var12 == null) {
            break L0;
          } else {
            if (var20 != null) {
              L1: {
                var14 = 0;
                var15 = 0;
                if (var13 != 1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var16 = stackIn_7_0;
                if (var16 == 0) {
                  L3: {
                    if (34 != var20.field_N) {
                      break L3;
                    } else {
                      if (!var20.field_W) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            if (var20.j(20640) != 3) {
                              break L5;
                            } else {
                              if (1 != (1 & var20.d(2, 99))) {
                                break L5;
                              } else {
                                stackOut_36_0 = 1;
                                stackIn_38_0 = stackOut_36_0;
                                break L4;
                              }
                            }
                          }
                          stackOut_37_0 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          break L4;
                        }
                        var14 = stackIn_38_0;
                        break L2;
                      }
                    }
                  }
                  L6: {
                    if (var20.field_N == 81) {
                      break L6;
                    } else {
                      if (var20.field_N == 4) {
                        break L6;
                      } else {
                        if (74 != var20.field_N) {
                          if (3 != var20.g(0)) {
                            L7: {
                              L8: {
                                if (1 != var20.j(20640)) {
                                  break L8;
                                } else {
                                  if ((1 & var20.d(2, 116)) != 1) {
                                    break L8;
                                  } else {
                                    stackOut_56_0 = 1;
                                    stackIn_58_0 = stackOut_56_0;
                                    break L7;
                                  }
                                }
                              }
                              stackOut_57_0 = 0;
                              stackIn_58_0 = stackOut_57_0;
                              break L7;
                            }
                            var14 = stackIn_58_0;
                            break L2;
                          } else {
                            L9: {
                              L10: {
                                if (var20.j(20640) != 2) {
                                  break L10;
                                } else {
                                  if ((var20.d(2, -123) & 1) != 1) {
                                    break L10;
                                  } else {
                                    stackOut_51_0 = 1;
                                    stackIn_53_0 = stackOut_51_0;
                                    break L9;
                                  }
                                }
                              }
                              stackOut_52_0 = 0;
                              stackIn_53_0 = stackOut_52_0;
                              break L9;
                            }
                            var14 = stackIn_53_0;
                            break L2;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (3 != var20.j(20640)) {
                        break L12;
                      } else {
                        if (1 != (var20.d(2, -112) & 1)) {
                          break L12;
                        } else {
                          stackOut_45_0 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          break L11;
                        }
                      }
                    }
                    stackOut_46_0 = 0;
                    stackIn_47_0 = stackOut_46_0;
                    break L11;
                  }
                  var14 = stackIn_47_0;
                  break L2;
                } else {
                  if (var20.g(0) != 4) {
                    if (var20.g(0) != 3) {
                      L13: {
                        if (var20.field_N != 34) {
                          break L13;
                        } else {
                          if (!var20.field_W) {
                            break L13;
                          } else {
                            L14: {
                              L15: {
                                if (var20.j(20640) != 3) {
                                  break L15;
                                } else {
                                  if ((1 & var20.d(2, -97)) != 1) {
                                    break L15;
                                  } else {
                                    stackOut_24_0 = 1;
                                    stackIn_26_0 = stackOut_24_0;
                                    break L14;
                                  }
                                }
                              }
                              stackOut_25_0 = 0;
                              stackIn_26_0 = stackOut_25_0;
                              break L14;
                            }
                            var14 = stackIn_26_0;
                            break L2;
                          }
                        }
                      }
                      L16: {
                        L17: {
                          if (var20.j(20640) != 0) {
                            break L17;
                          } else {
                            if ((1 & var20.d(2, 121)) != 1) {
                              break L17;
                            } else {
                              stackOut_29_0 = 1;
                              stackIn_31_0 = stackOut_29_0;
                              break L16;
                            }
                          }
                        }
                        stackOut_30_0 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        break L16;
                      }
                      var14 = stackIn_31_0;
                      break L2;
                    } else {
                      L18: {
                        L19: {
                          if (2 != var20.j(20640)) {
                            break L19;
                          } else {
                            if ((var20.d(2, -90) & 1) != 1) {
                              break L19;
                            } else {
                              stackOut_17_0 = 1;
                              stackIn_19_0 = stackOut_17_0;
                              break L18;
                            }
                          }
                        }
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L18;
                      }
                      var14 = stackIn_19_0;
                      break L2;
                    }
                  } else {
                    L20: {
                      L21: {
                        if (var20.j(20640) != 4) {
                          break L21;
                        } else {
                          if ((var20.d(2, 122) & 1) != 1) {
                            break L21;
                          } else {
                            stackOut_11_0 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            break L20;
                          }
                        }
                      }
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L20;
                    }
                    var14 = stackIn_13_0;
                    break L2;
                  }
                }
              }
              L22: {
                var17 = -37 / ((35 - param5) / 34);
                if (var16 == 0) {
                  break L22;
                } else {
                  if (4 != var12.g(0)) {
                    if (var12.g(0) == 3) {
                      L23: {
                        L24: {
                          if (var12.j(20640) != 2) {
                            break L24;
                          } else {
                            if (1 != (1 & var12.d(2, 117))) {
                              break L24;
                            } else {
                              stackOut_82_0 = 1;
                              stackIn_84_0 = stackOut_82_0;
                              break L23;
                            }
                          }
                        }
                        stackOut_83_0 = 0;
                        stackIn_84_0 = stackOut_83_0;
                        break L23;
                      }
                      var15 = stackIn_84_0;
                      break L22;
                    } else {
                      L25: {
                        if (var12.field_N != 34) {
                          break L25;
                        } else {
                          if (var12.field_W) {
                            L26: {
                              L27: {
                                if (var12.j(20640) != 3) {
                                  break L27;
                                } else {
                                  if (1 != (var12.d(2, -114) & 1)) {
                                    break L27;
                                  } else {
                                    stackOut_77_0 = 1;
                                    stackIn_79_0 = stackOut_77_0;
                                    break L26;
                                  }
                                }
                              }
                              stackOut_78_0 = 0;
                              stackIn_79_0 = stackOut_78_0;
                              break L26;
                            }
                            var15 = stackIn_79_0;
                            break L22;
                          } else {
                            break L25;
                          }
                        }
                      }
                      L28: {
                        L29: {
                          if (var12.j(20640) != 0) {
                            break L29;
                          } else {
                            if ((1 & var12.d(2, -94)) != 1) {
                              break L29;
                            } else {
                              stackOut_72_0 = 1;
                              stackIn_74_0 = stackOut_72_0;
                              break L28;
                            }
                          }
                        }
                        stackOut_73_0 = 0;
                        stackIn_74_0 = stackOut_73_0;
                        break L28;
                      }
                      var15 = stackIn_74_0;
                      break L22;
                    }
                  } else {
                    L30: {
                      L31: {
                        if (4 != var12.j(20640)) {
                          break L31;
                        } else {
                          if (1 != (var12.d(2, -117) & 1)) {
                            break L31;
                          } else {
                            stackOut_63_0 = 1;
                            stackIn_65_0 = stackOut_63_0;
                            break L30;
                          }
                        }
                      }
                      stackOut_64_0 = 0;
                      stackIn_65_0 = stackOut_64_0;
                      break L30;
                    }
                    var15 = stackIn_65_0;
                    break L22;
                  }
                }
              }
              L32: {
                if (!param2) {
                  break L32;
                } else {
                  if (var12.field_t >= 99) {
                    break L32;
                  } else {
                    if (!var20.r(-40)) {
                      break L32;
                    } else {
                      ((ha) this).field_l.a(750, (tc) (Object) new st(var12, 4));
                      break L32;
                    }
                  }
                }
              }
              L33: {
                if (!param6) {
                  break L33;
                } else {
                  if (var20.field_t >= 99) {
                    break L33;
                  } else {
                    if (var12.r(-40)) {
                      ((ha) this).field_l.a(750, (tc) (Object) new st(var20, 4));
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                }
              }
              L34: {
                if (var16 == 0) {
                  break L34;
                } else {
                  if (var12.field_C) {
                    var18 = 0;
                    L35: while (true) {
                      if (var18 >= param8) {
                        break L34;
                      } else {
                        ((ha) this).field_l.a(750, (tc) (Object) new st(var12, 1));
                        var18++;
                        continue L35;
                      }
                    }
                  } else {
                    break L34;
                  }
                }
              }
              L36: {
                if (var16 == 0) {
                  break L36;
                } else {
                  if (!var20.field_C) {
                    break L36;
                  } else {
                    var18 = 0;
                    L37: while (true) {
                      if (var18 >= param7) {
                        break L36;
                      } else {
                        ((ha) this).field_l.a(750, (tc) (Object) new st(var20, 1));
                        var18++;
                        continue L37;
                      }
                    }
                  }
                }
              }
              L38: {
                L39: {
                  L40: {
                    stackOut_105_0 = ((ha) this).field_l;
                    stackOut_105_1 = 750;
                    stackOut_105_2 = null;
                    stackOut_105_3 = null;
                    stackOut_105_4 = (jd) var20;
                    stackOut_105_5 = param8;
                    stackIn_108_0 = stackOut_105_0;
                    stackIn_108_1 = stackOut_105_1;
                    stackIn_108_2 = stackOut_105_2;
                    stackIn_108_3 = stackOut_105_3;
                    stackIn_108_4 = stackOut_105_4;
                    stackIn_108_5 = stackOut_105_5;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    stackIn_106_2 = stackOut_105_2;
                    stackIn_106_3 = stackOut_105_3;
                    stackIn_106_4 = stackOut_105_4;
                    stackIn_106_5 = stackOut_105_5;
                    if (var12.y(-113)) {
                      break L40;
                    } else {
                      stackOut_106_0 = (at) (Object) stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackOut_106_2 = null;
                      stackOut_106_3 = null;
                      stackOut_106_4 = (jd) (Object) stackIn_106_4;
                      stackOut_106_5 = stackIn_106_5;
                      stackIn_110_0 = stackOut_106_0;
                      stackIn_110_1 = stackOut_106_1;
                      stackIn_110_2 = stackOut_106_2;
                      stackIn_110_3 = stackOut_106_3;
                      stackIn_110_4 = stackOut_106_4;
                      stackIn_110_5 = stackOut_106_5;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      stackIn_107_2 = stackOut_106_2;
                      stackIn_107_3 = stackOut_106_3;
                      stackIn_107_4 = stackOut_106_4;
                      stackIn_107_5 = stackOut_106_5;
                      if (var15 == 0) {
                        break L39;
                      } else {
                        stackOut_107_0 = (at) (Object) stackIn_107_0;
                        stackOut_107_1 = stackIn_107_1;
                        stackOut_107_2 = null;
                        stackOut_107_3 = null;
                        stackOut_107_4 = (jd) (Object) stackIn_107_4;
                        stackOut_107_5 = stackIn_107_5;
                        stackIn_108_0 = stackOut_107_0;
                        stackIn_108_1 = stackOut_107_1;
                        stackIn_108_2 = stackOut_107_2;
                        stackIn_108_3 = stackOut_107_3;
                        stackIn_108_4 = stackOut_107_4;
                        stackIn_108_5 = stackOut_107_5;
                        break L40;
                      }
                    }
                  }
                  stackOut_108_0 = (at) (Object) stackIn_108_0;
                  stackOut_108_1 = stackIn_108_1;
                  stackOut_108_2 = null;
                  stackOut_108_3 = null;
                  stackOut_108_4 = (jd) (Object) stackIn_108_4;
                  stackOut_108_5 = stackIn_108_5;
                  stackIn_110_0 = stackOut_108_0;
                  stackIn_110_1 = stackOut_108_1;
                  stackIn_110_2 = stackOut_108_2;
                  stackIn_110_3 = stackOut_108_3;
                  stackIn_110_4 = stackOut_108_4;
                  stackIn_110_5 = stackOut_108_5;
                  stackIn_109_0 = stackOut_108_0;
                  stackIn_109_1 = stackOut_108_1;
                  stackIn_109_2 = stackOut_108_2;
                  stackIn_109_3 = stackOut_108_3;
                  stackIn_109_4 = stackOut_108_4;
                  stackIn_109_5 = stackOut_108_5;
                  if (param8 <= 0) {
                    break L39;
                  } else {
                    stackOut_109_0 = (at) (Object) stackIn_109_0;
                    stackOut_109_1 = stackIn_109_1;
                    stackOut_109_2 = null;
                    stackOut_109_3 = null;
                    stackOut_109_4 = (jd) (Object) stackIn_109_4;
                    stackOut_109_5 = stackIn_109_5;
                    stackOut_109_6 = 1;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_111_1 = stackOut_109_1;
                    stackIn_111_2 = stackOut_109_2;
                    stackIn_111_3 = stackOut_109_3;
                    stackIn_111_4 = stackOut_109_4;
                    stackIn_111_5 = stackOut_109_5;
                    stackIn_111_6 = stackOut_109_6;
                    break L38;
                  }
                }
                stackOut_110_0 = (at) (Object) stackIn_110_0;
                stackOut_110_1 = stackIn_110_1;
                stackOut_110_2 = null;
                stackOut_110_3 = null;
                stackOut_110_4 = (jd) (Object) stackIn_110_4;
                stackOut_110_5 = stackIn_110_5;
                stackOut_110_6 = 0;
                stackIn_111_0 = stackOut_110_0;
                stackIn_111_1 = stackOut_110_1;
                stackIn_111_2 = stackOut_110_2;
                stackIn_111_3 = stackOut_110_3;
                stackIn_111_4 = stackOut_110_4;
                stackIn_111_5 = stackOut_110_5;
                stackIn_111_6 = stackOut_110_6;
                break L38;
              }
              L41: {
                L42: {
                  L43: {
                    ((at) (Object) stackIn_111_0).a(stackIn_111_1, (tc) (Object) new nw(stackIn_111_4, stackIn_111_5, stackIn_111_6 != 0));
                    stackOut_111_0 = ((ha) this).field_l;
                    stackOut_111_1 = 750;
                    stackOut_111_2 = null;
                    stackOut_111_3 = null;
                    stackOut_111_4 = (jd) var12;
                    stackOut_111_5 = param7;
                    stackIn_114_0 = stackOut_111_0;
                    stackIn_114_1 = stackOut_111_1;
                    stackIn_114_2 = stackOut_111_2;
                    stackIn_114_3 = stackOut_111_3;
                    stackIn_114_4 = stackOut_111_4;
                    stackIn_114_5 = stackOut_111_5;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    stackIn_112_2 = stackOut_111_2;
                    stackIn_112_3 = stackOut_111_3;
                    stackIn_112_4 = stackOut_111_4;
                    stackIn_112_5 = stackOut_111_5;
                    if (var20.y(-119)) {
                      break L43;
                    } else {
                      stackOut_112_0 = (at) (Object) stackIn_112_0;
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = null;
                      stackOut_112_3 = null;
                      stackOut_112_4 = (jd) (Object) stackIn_112_4;
                      stackOut_112_5 = stackIn_112_5;
                      stackIn_116_0 = stackOut_112_0;
                      stackIn_116_1 = stackOut_112_1;
                      stackIn_116_2 = stackOut_112_2;
                      stackIn_116_3 = stackOut_112_3;
                      stackIn_116_4 = stackOut_112_4;
                      stackIn_116_5 = stackOut_112_5;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      stackIn_113_2 = stackOut_112_2;
                      stackIn_113_3 = stackOut_112_3;
                      stackIn_113_4 = stackOut_112_4;
                      stackIn_113_5 = stackOut_112_5;
                      if (var14 == 0) {
                        break L42;
                      } else {
                        stackOut_113_0 = (at) (Object) stackIn_113_0;
                        stackOut_113_1 = stackIn_113_1;
                        stackOut_113_2 = null;
                        stackOut_113_3 = null;
                        stackOut_113_4 = (jd) (Object) stackIn_113_4;
                        stackOut_113_5 = stackIn_113_5;
                        stackIn_114_0 = stackOut_113_0;
                        stackIn_114_1 = stackOut_113_1;
                        stackIn_114_2 = stackOut_113_2;
                        stackIn_114_3 = stackOut_113_3;
                        stackIn_114_4 = stackOut_113_4;
                        stackIn_114_5 = stackOut_113_5;
                        break L43;
                      }
                    }
                  }
                  stackOut_114_0 = (at) (Object) stackIn_114_0;
                  stackOut_114_1 = stackIn_114_1;
                  stackOut_114_2 = null;
                  stackOut_114_3 = null;
                  stackOut_114_4 = (jd) (Object) stackIn_114_4;
                  stackOut_114_5 = stackIn_114_5;
                  stackIn_116_0 = stackOut_114_0;
                  stackIn_116_1 = stackOut_114_1;
                  stackIn_116_2 = stackOut_114_2;
                  stackIn_116_3 = stackOut_114_3;
                  stackIn_116_4 = stackOut_114_4;
                  stackIn_116_5 = stackOut_114_5;
                  stackIn_115_0 = stackOut_114_0;
                  stackIn_115_1 = stackOut_114_1;
                  stackIn_115_2 = stackOut_114_2;
                  stackIn_115_3 = stackOut_114_3;
                  stackIn_115_4 = stackOut_114_4;
                  stackIn_115_5 = stackOut_114_5;
                  if (param7 <= 0) {
                    break L42;
                  } else {
                    stackOut_115_0 = (at) (Object) stackIn_115_0;
                    stackOut_115_1 = stackIn_115_1;
                    stackOut_115_2 = null;
                    stackOut_115_3 = null;
                    stackOut_115_4 = (jd) (Object) stackIn_115_4;
                    stackOut_115_5 = stackIn_115_5;
                    stackOut_115_6 = 1;
                    stackIn_117_0 = stackOut_115_0;
                    stackIn_117_1 = stackOut_115_1;
                    stackIn_117_2 = stackOut_115_2;
                    stackIn_117_3 = stackOut_115_3;
                    stackIn_117_4 = stackOut_115_4;
                    stackIn_117_5 = stackOut_115_5;
                    stackIn_117_6 = stackOut_115_6;
                    break L41;
                  }
                }
                stackOut_116_0 = (at) (Object) stackIn_116_0;
                stackOut_116_1 = stackIn_116_1;
                stackOut_116_2 = null;
                stackOut_116_3 = null;
                stackOut_116_4 = (jd) (Object) stackIn_116_4;
                stackOut_116_5 = stackIn_116_5;
                stackOut_116_6 = 0;
                stackIn_117_0 = stackOut_116_0;
                stackIn_117_1 = stackOut_116_1;
                stackIn_117_2 = stackOut_116_2;
                stackIn_117_3 = stackOut_116_3;
                stackIn_117_4 = stackOut_116_4;
                stackIn_117_5 = stackOut_116_5;
                stackIn_117_6 = stackOut_116_6;
                break L41;
              }
              L44: {
                ((at) (Object) stackIn_117_0).a(stackIn_117_1, (tc) (Object) new nw(stackIn_117_4, stackIn_117_5, stackIn_117_6 != 0));
                var20.field_B = var20.field_B - 1;
                if (((ha) this).field_b) {
                  L45: {
                    var12.field_M = var12.field_M + 1;
                    var20.field_m = var20.field_m + 1;
                    ((ha) this).d(var20.field_O, var20.field_m, 112, 7);
                    ((ha) this).d(var12.field_O, var12.field_M, 79, 6);
                    var18 = 0;
                    if (param2) {
                      L46: {
                        L47: {
                          ((ha) this).field_g[var12.field_O] = ((ha) this).field_g[var12.field_O] + 1;
                          ((ha) this).d(var12.field_O, ((ha) this).field_g[var12.field_O], 120, 4);
                          if (var20.field_E != 10) {
                            break L47;
                          } else {
                            if (11 != var12.field_E) {
                              break L47;
                            } else {
                              stackOut_123_0 = 1;
                              stackIn_125_0 = stackOut_123_0;
                              break L46;
                            }
                          }
                        }
                        stackOut_124_0 = 0;
                        stackIn_125_0 = stackOut_124_0;
                        break L46;
                      }
                      var18 = stackIn_125_0;
                      break L45;
                    } else {
                      break L45;
                    }
                  }
                  L48: {
                    if (!param6) {
                      break L48;
                    } else {
                      L49: {
                        L50: {
                          ((ha) this).field_g[var20.field_O] = ((ha) this).field_g[var20.field_O] + 1;
                          ((ha) this).d(var20.field_O, ((ha) this).field_g[var20.field_O], 91, 4);
                          if (var12.field_E != 10) {
                            break L50;
                          } else {
                            if (var20.field_E != 11) {
                              break L50;
                            } else {
                              stackOut_129_0 = 1;
                              stackIn_131_0 = stackOut_129_0;
                              break L49;
                            }
                          }
                        }
                        stackOut_130_0 = 0;
                        stackIn_131_0 = stackOut_130_0;
                        break L49;
                      }
                      var18 = stackIn_131_0;
                      break L48;
                    }
                  }
                  if (var18 == 0) {
                    break L44;
                  } else {
                    L51: {
                      if (((ha) this).field_K == null) {
                        break L51;
                      } else {
                        if (((ha) this).field_K.field_G.field_r != 2) {
                          break L51;
                        } else {
                          if (((ha) this).field_K.field_v == 5) {
                            rd.field_j.a(50, (byte) 30, 205);
                            break L51;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    break L44;
                  }
                } else {
                  break L44;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        int discarded$2 = 0;
        boolean discarded$3 = this.a(var20, param1, param7, param2, param0, -1, param4, var12, param3, param8, param9, param6);
    }

    final void l(int param0, int param1) {
        lo var3 = null;
        int var4_int = 0;
        ne[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Object var8 = null;
        RuntimeException stackIn_6_0 = null;
        RuntimeException stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        RuntimeException stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        RuntimeException stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_5_0 = null;
        RuntimeException stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        RuntimeException stackOut_7_1 = null;
        Object stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        RuntimeException stackOut_6_1 = null;
        String stackOut_6_2 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == param1) {
            break L0;
          } else {
            ((ha) this).field_cb = 0;
            break L0;
          }
        }
        L1: {
          if (((ha) this).field_cb < 0) {
            break L1;
          } else {
            if (~hs.field_G.length >= ~((ha) this).field_cb) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    ((ha) this).field_v = hs.field_G[((ha) this).field_cb];
                    ((ha) this).field_db = hs.field_G[((ha) this).field_cb];
                    if (0 > ((ha) this).field_cb) {
                      break L4;
                    } else {
                      if (2 >= ((ha) this).field_cb) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param1 != 0) {
                    break L3;
                  } else {
                    rn.a(-118, (ha) this);
                    break L2;
                  }
                }
                L5: {
                  if (param1 == 0) {
                    if (null != ((ha) this).field_K) {
                      var3 = ((ha) this).field_K.a(-114);
                      break L5;
                    } else {
                      var4_int = ew.field_e.a(param0, ((ha) this).field_cb, ((ha) this).field_hb, ((ha) this).field_W);
                      if (var4_int > 0) {
                        var5 = ((ha) this).field_jb % var4_int;
                        var3 = ew.field_e.a(((ha) this).field_W, 4136, ((ha) this).field_cb, ((ha) this).field_hb, var5);
                        if (var3 == null) {
                          var8 = null;
                          throw new RuntimeException((String) null);
                        } else {
                          break L5;
                        }
                      } else {
                        var7 = null;
                        throw new RuntimeException((String) null);
                      }
                    }
                  } else {
                    var3 = ew.field_e.a((byte) 59, param1 + -1);
                    break L5;
                  }
                }
                var4 = var3.a(param0 + -95, (ha) this);
                ((ha) this).a((byte) -104, var3.field_l, var3.field_n, var4);
                break L2;
              }
              return;
            }
          }
        }
        L6: {
          stackOut_5_0 = null;
          stackOut_5_1 = null;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          stackIn_6_0 = stackOut_5_0;
          stackIn_6_1 = stackOut_5_1;
          if (!((ha) this).field_x) {
            stackOut_7_0 = null;
            stackOut_7_1 = null;
            stackOut_7_2 = null;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = (String) (Object) stackOut_7_2;
            break L6;
          } else {
            stackOut_6_0 = null;
            stackOut_6_1 = null;
            stackOut_6_2 = "That's not a valid map size: " + ((ha) this).field_cb;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            break L6;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 == -64) {
              L1: {
                var3_int = ((ha) this).o(((ha) this).field_sb, param1 ^ 63);
                if (var3_int < 0) {
                  var4 = this.a(param0, -128);
                  var3_int = ((ha) this).o(var4, -1);
                  if (var3_int < 0) {
                    var3_int = 2;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              stackOut_8_0 = op.field_c[0][var3_int];
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_1_0 = -101;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ha.OC(");
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final boolean a(int param0, boolean param1, int param2) {
        int var4 = ~param2 >= ~param0 ? 1 : 0;
        return var4 != 0;
    }

    private final boolean a(jd param0, int param1, int param2, boolean param3, int param4, int param5, int param6, jd param7, int param8, int param9, int param10, boolean param11) {
        RuntimeException var14 = null;
        String var15 = null;
        String var16 = null;
        StringBuilder stackIn_1_0 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_0_0 = null;
        StringBuilder stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        StringBuilder stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        StringBuilder stackOut_3_0 = null;
        StringBuilder stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        StringBuilder stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
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
        try {
          L0: {
            L1: {
              stackOut_0_0 = new StringBuilder().append("applycombat: ").append(0).append(", player: ").append(((ha) this).field_gb).append(", turn: ").append(((ha) this).field_Gb).append(", att: ");
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param0 == null) {
                stackOut_2_0 = (StringBuilder) (Object) stackIn_2_0;
                stackOut_2_1 = -1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (StringBuilder) (Object) stackIn_1_0;
                stackOut_1_1 = param0.field_N;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = ((StringBuilder) (Object) stackIn_3_0).append(stackIn_3_1).append(", def: ");
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param7 != null) {
                stackOut_5_0 = (StringBuilder) (Object) stackIn_5_0;
                stackOut_5_1 = param7.field_N;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = (StringBuilder) (Object) stackIn_4_0;
                stackOut_4_1 = -1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            var16 = String.valueOf(stackIn_6_1);
            var15 = "\ncx: " + param8 + ", cy: " + param4 + ", ax: " + param1 + ", ay: " + param6 + ", adam: " + param2 + ", ddam: " + param9 + ", creature: " + param10 + ", attdie: " + param3 + ", defdie: " + param11;
            if (!((ha) this).field_F) {
              ((ha) this).field_o = true;
              System.out.println(var16 + var15);
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              af.a((Throwable) null, 115, var16 + var15);
              stackOut_9_0 = 1;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var14 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var14;
            stackOut_13_1 = new StringBuilder().append("ha.JA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(-1).append(',').append(param6).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param7 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + 0 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final int k(int param0, int param1) {
        float var3 = 0.0f;
        int var4 = 0;
        float stackIn_5_0 = 0.0f;
        float stackOut_4_0 = 0.0f;
        float stackOut_3_0 = 0.0f;
        L0: {
          L1: {
            if (((ha) this).field_K == null) {
              break L1;
            } else {
              if (((ha) this).field_K.field_w == param1) {
                stackOut_4_0 = ((ha) this).field_bb;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1.0f;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        var3 = stackIn_5_0;
        var4 = (int)((float)(((ha) this).field_z[((ha) this).field_yb[param1]][2] * 25) * var3) + ((int)(var3 * (float)(((ha) this).field_z[((ha) this).field_yb[param1]][1] * 75)) + (int)(var3 * (float)(50 * ((ha) this).field_z[((ha) this).field_yb[param1]][0])));
        if (param0 <= -95) {
          return var4;
        } else {
          return 115;
        }
    }

    final int g(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          if (param2 < 0) {
            break L0;
          } else {
            if (param0 < 0) {
              break L0;
            } else {
              if (param2 >= ((ha) this).field_v) {
                break L0;
              } else {
                if (((ha) this).field_v <= param0) {
                  break L0;
                } else {
                  L1: {
                    if (param1 <= -28) {
                      break L1;
                    } else {
                      ((ha) this).field_Fb = false;
                      break L1;
                    }
                  }
                  L2: {
                    var4 = ((ha) this).field_Eb[param2 + ((ha) this).field_v * param0].field_h;
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
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param1 == -16985) {
            break L0;
          } else {
            ((ha) this).field_o = false;
            break L0;
          }
        }
        L1: {
          if (param0 == -1) {
            break L1;
          } else {
            if (param2 == -1) {
              break L1;
            } else {
              if (param0 == 255) {
                break L1;
              } else {
                if (param2 != 255) {
                  L2: {
                    if (((ha) this).field_yb[param2] != ((ha) this).field_yb[param0]) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  return stackIn_11_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    private final void a(byte param0, vh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = 0;
            var3_int = param1.e((byte) -104) & 8191;
            var5 = param1.k(0);
            var6 = param1.k(0);
            var7 = new int[var3_int];
            var8 = 0;
            L1: while (true) {
              if (var3_int <= 0) {
                ((ha) this).field_l.a((byte) -119, (tc) (Object) new kr(var5, var6, var7));
                break L0;
              } else {
                var9 = param1.k(0);
                var10 = 0;
                L2: while (true) {
                  if (var10 >= 4) {
                    continue L1;
                  } else {
                    if (var3_int <= 0) {
                      continue L1;
                    } else {
                      var7[var8] = rn.a(3, var9);
                      var9 = var9 >> 2;
                      var8++;
                      var3_int--;
                      var10++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ha.MD(").append(91).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final boolean f(int param0, int param1, int param2) {
        int var4 = ~param1 <= ~param0 ? 1 : 0;
        return var4 != 0;
    }

    private final int b() {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 1 + ((ha) this).field_vb;
          if (((ha) this).field_cb < 0) {
            break L0;
          } else {
            if (hs.field_G.length > ((ha) this).field_cb) {
              L1: {
                var3 = nr.field_a[((ha) this).field_cb] * var2;
                if (((ha) this).field_K != null) {
                  var3 = 9999;
                  break L1;
                } else {
                  break L1;
                }
              }
              return var3;
            } else {
              break L0;
            }
          }
        }
        return var2 * nr.field_a[0];
    }

    final String e(int param0, int param1) {
        if (-1 > param0) {
            return "id: " + param0;
        }
        if (param1 < ~param0) {
            return "none";
        }
        return ((ha) this).field_lb[param0];
    }

    final void a(vh param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0.field_o[param0.field_q];
              var4 = (var3_int & 237) >> 5;
              if (var4 != 0) {
                if (1 != var4) {
                  if (3 == var4) {
                    int discarded$2 = -1;
                    this.a(param0);
                    break L1;
                  } else {
                    if (5 == var4) {
                      this.a(-30531, param0);
                      break L1;
                    } else {
                      if (var4 == 6) {
                        int discarded$3 = -84;
                        this.b(param0);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  this.a(param0, true);
                  break L1;
                }
              } else {
                this.a((byte) 91, param0);
                break L1;
              }
            }
            L2: {
              if (param1 < -50) {
                break L2;
              } else {
                ((ha) this).a(true, 103, -100, 43, -48, -87, -117);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("ha.SA(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
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
        Object var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ha) this).field_V) {
          L0: {
            if (param0 >= 45) {
              break L0;
            } else {
              var4 = null;
              ((ha) this).a(-102, (jd) null);
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (((ha) this).field_W <= var2) {
              return true;
            } else {
              if (0 > var2) {
                return false;
              } else {
                if (var2 < ((ha) this).field_mb.length) {
                  if (0 == (1 << var2 & ((ha) this).field_e)) {
                    if (((ha) this).field_mb[var2] > ((ha) this).field_O) {
                      return true;
                    } else {
                      if (((ha) this).field_mb[var2] < ((ha) this).field_O) {
                        return false;
                      } else {
                        var2++;
                        continue L1;
                      }
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final int a(int param0, int param1, jd param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (!((ha) this).field_Eb[param0].c((byte) -79)) {
                break L1;
              } else {
                if (((ha) this).c(((ha) this).field_Eb[param0].b((byte) -88), -16985, param2.field_O)) {
                  stackOut_3_0 = 60;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                } else {
                  break L1;
                }
              }
            }
            if (0 == (8 & ((ha) this).b(31, param2.field_w, param2.field_J, param2.field_O))) {
              L2: {
                if (-3 != bw.field_m[param2.field_N][1]) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var4_int = stackIn_11_0;
                  if (var4_int == 0) {
                    break L4;
                  } else {
                    if (-4 != ((ha) this).field_Eb[param0].field_h) {
                      break L4;
                    } else {
                      param0 = 70;
                      break L3;
                    }
                  }
                }
                param0 = ri.field_c[((ha) this).field_Eb[param0].field_h];
                break L3;
              }
              L5: {
                if (param1 == -4) {
                  break L5;
                } else {
                  ((ha) this).field_Bb = false;
                  break L5;
                }
              }
              stackOut_17_0 = param0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_6_0 = 100;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("ha.U(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    private final void k() {
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
        int var14 = 0;
        jd var15 = null;
        jd[] var16 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((ha) this).field_P = new tt(((ha) this).field_W);
        var2 = 0;
        var3 = 0;
        var4 = new boolean[((ha) this).field_W];
        var5 = new boolean[((ha) this).field_W];
        var6 = new Vector[((ha) this).field_W];
        var7_int = 0;
        L0: while (true) {
          if (var7_int >= ((ha) this).field_Eb.length) {
            L1: {
              var7 = new boolean[((ha) this).field_W];
              if (var3 == 0) {
                var8 = 0;
                L2: while (true) {
                  if (((ha) this).field_W <= var8) {
                    break L1;
                  } else {
                    var7[var8] = true;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (((ha) this).field_W <= var8) {
                    var8 = 0;
                    L4: while (true) {
                      if (var8 >= ((ha) this).field_W) {
                        ((ha) this).field_eb = true;
                        break L1;
                      } else {
                        if (var4[var8]) {
                          ((ha) this).field_P.a((lv) (Object) new up(var8, (ha) this), (byte) 91, var8);
                          var8++;
                          continue L4;
                        } else {
                          var8++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    if (var5[var8]) {
                      var4[var8] = true;
                      var8++;
                      continue L3;
                    } else {
                      if (!var4[var8]) {
                        var7[var8] = true;
                        var8++;
                        continue L3;
                      } else {
                        var8++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              if (var2 != 0) {
                var8 = 0;
                L6: while (true) {
                  if (var8 >= ((ha) this).field_W) {
                    break L5;
                  } else {
                    if (null != var6[var8]) {
                      var13 = new jd[var6[var8].size()];
                      var16 = var13;
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= var6[var8].size()) {
                          ((ha) this).field_P.a((lv) (Object) new gm(var8, var16), (byte) 85, var8);
                          var7[var8] = true;
                          ((ha) this).field_P.a((byte) 43);
                          var14 = 0;
                          var10 = var14;
                          L8: while (true) {
                            if (((ha) this).field_W > var14) {
                              if (((ha) this).c(var8, -16985, var14)) {
                                if (var14 != var8) {
                                  var7[var14] = true;
                                  var14++;
                                  continue L8;
                                } else {
                                  var14++;
                                  continue L8;
                                }
                              } else {
                                var14++;
                                continue L8;
                              }
                            } else {
                              var8++;
                              continue L6;
                            }
                          }
                        } else {
                          var13[var10] = (jd) var6[var8].elementAt(var10);
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var8++;
                      continue L6;
                    }
                  }
                }
              } else {
                var8 = 0;
                L9: while (true) {
                  if (((ha) this).field_W <= var8) {
                    break L5;
                  } else {
                    if (null != var6[var8]) {
                      var7[var8] = true;
                      ((ha) this).field_P.b(244, var8);
                      var8++;
                      continue L9;
                    } else {
                      var8++;
                      continue L9;
                    }
                  }
                }
              }
            }
            var8 = 0;
            L10: while (true) {
              if (var8 >= ((ha) this).field_W) {
                return;
              } else {
                if (var7[var8]) {
                  ((ha) this).field_P.a((lv) (Object) new mc(var8, (ha) this), (byte) 99, var8);
                  var8++;
                  continue L10;
                } else {
                  var8++;
                  continue L10;
                }
              }
            }
          } else {
            var8_ref_ne = ((ha) this).field_Eb[var7_int];
            if (var8_ref_ne != null) {
              L11: {
                var12 = var8_ref_ne.field_c;
                var15 = var12;
                if (var15 != null) {
                  L12: {
                    if (!var15.c(false)) {
                      break L12;
                    } else {
                      if (var15.field_O != -1) {
                        L13: {
                          if (null == var6[var12.field_O]) {
                            var6[var12.field_O] = new Vector();
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        var6[var12.field_O].addElement((Object) (Object) var15);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    if (var15.field_N == 7) {
                      if (0 > var15.field_O) {
                        break L14;
                      } else {
                        var3 = 1;
                        var4[var12.field_O] = true;
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var15.i(-21428)) {
                      break L15;
                    } else {
                      if (!var15.k((byte) 93)) {
                        break L11;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (var15.field_O >= 0) {
                    var5[var12.field_O] = true;
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              L16: {
                if (var8_ref_ne.d(-58)) {
                  L17: {
                    if (var8_ref_ne.field_a < 0) {
                      break L17;
                    } else {
                      var4[var8_ref_ne.field_a] = true;
                      break L17;
                    }
                  }
                  var3 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              if (var8_ref_ne.e((byte) -128)) {
                var2 = 1;
                var7_int++;
                continue L0;
              } else {
                var7_int++;
                continue L0;
              }
            } else {
              var7_int++;
              continue L0;
            }
          }
        }
    }

    private final int n(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ha) this).field_c[param0].length) {
            L1: {
              if (((ha) this).field_H[param0] < 1) {
                break L1;
              } else {
                var3 = var3 ^ ((ha) this).field_H[param0] * 88357;
                break L1;
              }
            }
            L2: {
              if (((ha) this).field_fb[((ha) this).field_yb[param0]] >= 1) {
                var3 = var3 ^ ((ha) this).field_fb[((ha) this).field_yb[param0]] * 12473;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var3 = var3 ^ 7563 * ((ha) this).field_mb[param0];
              if (lf.field_i[((ha) this).field_Q] == 0) {
                break L3;
              } else {
                var3 = var3 ^ 7317 * ((ha) this).field_m[param0];
                break L3;
              }
            }
            return var3;
          } else {
            var5 = ((ha) this).field_c[param0][var4];
            if (var5 >= 0) {
              var3 = var3 ^ (17232 - -(312 * var5)) * ((ha) this).field_E[param0][var5];
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final int o(int param0, int param1) {
        if (param1 < ~param0) {
            return -1;
        }
        return ((ha) this).field_yb[param0];
    }

    final int i(int param0, int param1) {
        int var3 = 0;
        if (null != ((ha) this).field_fb) {
          if (param0 < 0) {
            return 0;
          } else {
            if (param0 < ((ha) this).field_W) {
              L0: {
                var3 = 25 * param0;
                var3 = var3 + ((ha) this).field_fb[((ha) this).field_yb[param0]];
                if (var3 > ((ha) this).field_xb) {
                  var3 = ((ha) this).field_xb;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param1 == -12710) {
                  break L1;
                } else {
                  ((ha) this).field_A = -76;
                  break L1;
                }
              }
              return var3;
            } else {
              return 0;
            }
          }
        } else {
          return 0;
        }
    }

    public static void c() {
        field_pb = null;
        field_nb = null;
        field_q = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((ha) this).field_z.length) {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                var6 = null;
                ((ha) this).a(-11, (String) null, (oj) null);
                break L1;
              }
            }
            if (null == ((ha) this).field_Eb) {
              return;
            } else {
              var7 = 0;
              var2 = var7;
              L2: while (true) {
                if (((ha) this).field_Eb.length <= var7) {
                  ((ha) this).a(1);
                  return;
                } else {
                  var3 = ((ha) this).o(((ha) this).field_Eb[var7].field_a, -1);
                  if (var3 > -1) {
                    var4 = ((ha) this).field_Eb[var7].field_h;
                    if (7 == var4) {
                      ((ha) this).field_z[var3][0] = ((ha) this).field_z[var3][0] + 1;
                      var7++;
                      continue L2;
                    } else {
                      L3: {
                        if (var4 != 14) {
                          if (9 != var4) {
                            if (var4 == 8) {
                              ((ha) this).field_z[var3][2] = ((ha) this).field_z[var3][2] + 1;
                              var7++;
                              continue L2;
                            } else {
                              var7++;
                              continue L2;
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      ((ha) this).field_z[var3][1] = ((ha) this).field_z[var3][1] + 1;
                      var7++;
                      continue L2;
                    }
                  } else {
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            ((ha) this).field_z[var2][0] = 0;
            ((ha) this).field_z[var2][1] = 0;
            ((ha) this).field_z[var2][2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final int a(byte param0) {
        if (param0 != 78) {
            at discarded$0 = ((ha) this).f(84, -63);
        }
        return ~((ha) this).field_e & (1 << ((ha) this).field_W) + -1;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var4 = 0;
            var5 = ((ha) this).g(param0, param1 + -2101, param2);
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
            if (~((ha) this).g(param0 + -1, param1 + -2139, param2) == ~var5) {
              break L2;
            } else {
              var4 = var4 | 2;
              break L2;
            }
          }
          L3: {
            if (~var5 != ~((ha) this).g(param0, -37, param2 + 1)) {
              var4 = var4 | 1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (~var5 != ~((ha) this).g(param0, -43, -1 + param2)) {
              var4 = var4 | 8;
              break L4;
            } else {
              break L4;
            }
          }
          if (~var5 == ~((ha) this).g(1 + param0, -63, param2)) {
            break L0;
          } else {
            var4 = var4 | 4;
            break L0;
          }
        }
        if (var4 != 6) {
          if (var4 != 9) {
            if (var4 != 2) {
              if (param1 == 2056) {
                if (var4 != 4) {
                  if (var4 == 1) {
                    return 3;
                  } else {
                    if (var4 != 8) {
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

    private final boolean e() {
        int var2 = 0;
        go[] var3 = null;
        int var4 = 0;
        go var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!((ha) this).field_wb) {
          L0: {
            if (eb.a((byte) -125, ((ha) this).a((byte) 78)) != 1) {
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              break L0;
            }
          }
          return stackIn_17_0 != 0;
        } else {
          var2 = 0;
          var3 = ((ha) this).field_w;
          var4 = 0;
          L1: while (true) {
            if (var4 >= var3.length) {
              L2: {
                if (1 != var2) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              return stackIn_13_0 != 0;
            } else {
              var5 = var3[var4];
              var6 = var5.field_a;
              var7 = 0;
              L3: while (true) {
                if (var6.length > var7) {
                  var8 = var6[var7];
                  if ((((ha) this).field_e & 1 << var8) != 0) {
                    var7++;
                    continue L3;
                  } else {
                    var2++;
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(byte param0, int param1) {
        int var4 = -71 % ((param0 - -15) / 37);
        go var3 = ((ha) this).d(param1, -1);
        if (!(var3 == null)) {
            var3.a(3, (ha) this);
        }
    }

    private final int a(byte param0, int param1, ne param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
              var4_int = var4_int ^ 7657 * param2.field_a;
              stackOut_9_0 = var4_int;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              var4_int = var4_int ^ param2.field_h;
              stackOut_1_0 = var4_int;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ha.KA(").append(103).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final boolean m(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ha) this).field_P.a(param1, -96)) {
          var3 = param0;
          L0: while (true) {
            if (var3 >= ((ha) this).field_W) {
              return true;
            } else {
              if (!((ha) this).c(var3, param0 ^ -16985, param1)) {
                ((ha) this).b(10001, var3, true);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final int c(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        ne var7 = null;
        if (0 > param3) {
          return 0;
        } else {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (0 > param2) {
                break L0;
              } else {
                if (param0 >= ((ha) this).field_v) {
                  break L0;
                } else {
                  if (param2 < ((ha) this).field_db) {
                    var7 = ((ha) this).field_Eb[((ha) this).field_v * param2 + param0];
                    if (var7.field_c == null) {
                      L1: {
                        var6 = ((ha) this).c(param3, -16985, var7.field_a) ? 1 : 0;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          if (7 != var7.field_h) {
                            break L1;
                          } else {
                            return 65535;
                          }
                        }
                      }
                      L2: {
                        if (param1 == -27300) {
                          break L2;
                        } else {
                          int discarded$2 = ((ha) this).a(41, 1, 42, (byte) 14);
                          break L2;
                        }
                      }
                      L3: {
                        if (var6 == 0) {
                          break L3;
                        } else {
                          if (var7.field_h != 11) {
                            break L3;
                          } else {
                            return 1 << var7.field_g;
                          }
                        }
                      }
                      return 0;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                }
              }
            }
          }
          return 0;
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = param0;
        L0: while (true) {
          if (((ha) this).field_W <= var3) {
            ((ha) this).field_u = param1;
            return;
          } else {
            if ((((ha) this).field_u & 1 << var3) != (1 << var3 & param1)) {
              ((ha) this).b(10001, var3, false);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean a(jd param0, int param1, int param2, int param3) {
        ne var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (param1 >= ((ha) this).field_v) {
                    break L1;
                  } else {
                    if (param2 > ((ha) this).field_db) {
                      break L1;
                    } else {
                      if (param3 < -117) {
                        var5 = ((ha) this).field_Eb[param2 * ((ha) this).field_v + param1];
                        if (null == var5.field_c) {
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          break L0;
                        } else {
                          if (param0.field_N != 51) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5_ref;
            stackOut_17_1 = new StringBuilder().append("ha.W(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final boolean b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ne[] var6 = null;
        int var7 = 0;
        ne var8 = null;
        jd var9 = null;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == ((ha) this).field_K) {
          return false;
        } else {
          if (!param1) {
            var4 = 0;
            var5 = 0;
            if (param2 == -1) {
              var6 = ((ha) this).field_Eb;
              var7 = 0;
              L0: while (true) {
                if (var6.length <= var7) {
                  L1: {
                    if (var5 != 0) {
                      break L1;
                    } else {
                      if (var4 != 0) {
                        ((ha) this).field_A = ((ha) this).field_A + 1;
                        if (((ha) this).field_A >= 3) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((ha) this).field_A = 0;
                  return false;
                } else {
                  var8 = var6[var7];
                  if (var8.field_a == param0) {
                    L2: {
                      if (7 == var8.field_h) {
                        break L2;
                      } else {
                        if (11 == var8.field_h) {
                          break L2;
                        } else {
                          var7++;
                          continue L0;
                        }
                      }
                    }
                    L3: {
                      var4 = 1;
                      var9 = var8.field_c;
                      if (var9 == null) {
                        break L3;
                      } else {
                        if (((ha) this).c(var9.field_O, -16985, param0)) {
                          break L3;
                        } else {
                          var7++;
                          continue L0;
                        }
                      }
                    }
                    var5 = 1;
                    var7++;
                    continue L0;
                  } else {
                    var7++;
                    continue L0;
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            ((ha) this).field_A = 0;
            return false;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        go[] var3_ref_go__ = null;
        int var3 = 0;
        int var4 = 0;
        go var5_ref_go = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var16 = null;
        int[] var17 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ha) this).field_wb) {
          L0: {
            L1: {
              if (((ha) this).field_K == null) {
                break L1;
              } else {
                if (!((ha) this).field_qb) {
                  break L1;
                } else {
                  var2 = 0;
                  var3_ref_go__ = ((ha) this).field_w;
                  var4 = 0;
                  L2: while (true) {
                    L3: {
                      if (var4 >= var3_ref_go__.length) {
                        break L3;
                      } else {
                        var5_ref_go = var3_ref_go__[var4];
                        if (!var5_ref_go.a(((ha) this).field_K.field_w, (byte) -100)) {
                          var16 = var5_ref_go.field_a;
                          var7 = 0;
                          L4: while (true) {
                            if (var7 < var16.length) {
                              var8 = var16[var7];
                              if ((((ha) this).field_e & 1 << var8) == 0) {
                                var2 = 1;
                                break L3;
                              } else {
                                var7++;
                                continue L4;
                              }
                            } else {
                              var4++;
                              continue L2;
                            }
                          }
                        } else {
                          var4++;
                          continue L2;
                        }
                      }
                    }
                    ((ha) this).field_R = 1;
                    if (var2 != 0) {
                      ((ha) this).field_p[0] = 1;
                      ((ha) this).field_p[1] = 0;
                      return;
                    } else {
                      ((ha) this).field_p[0] = 0;
                      ((ha) this).field_p[1] = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            L5: {
              int discarded$4 = 125;
              if (this.d()) {
                ((ha) this).field_p[1] = 1;
                ((ha) this).field_p[0] = 0;
                break L5;
              } else {
                ((ha) this).field_p[1] = 0;
                ((ha) this).field_p[0] = 1;
                break L5;
              }
            }
            var2 = 0;
            var4 = 0;
            L6: while (true) {
              if (var4 >= ((ha) this).field_tb) {
                var3 = 0;
                var4 = 0;
                L7: while (true) {
                  if (var4 >= ((ha) this).field_W) {
                    L8: {
                      ((ha) this).field_R = var2;
                      if (((ha) this).field_R != 0) {
                        break L8;
                      } else {
                        if (var3 != 0) {
                          ((ha) this).field_R = 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (0 != ((ha) this).field_R) {
                      break L0;
                    } else {
                      L9: {
                        int discarded$5 = -42;
                        if (this.e()) {
                          ((ha) this).field_R = 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    if (((ha) this).field_mb[var4] >= ((ha) this).field_O) {
                      var3 = 1;
                      var4++;
                      continue L7;
                    } else {
                      var4++;
                      continue L7;
                    }
                  }
                }
              } else {
                if (((ha) this).field_xb <= ((ha) this).field_fb[var4]) {
                  var2++;
                  var4++;
                  continue L6;
                } else {
                  var4++;
                  continue L6;
                }
              }
            }
          }
          return;
        } else {
          L10: {
            if (!((ha) this).field_X) {
              break L10;
            } else {
              if (!((ha) this).field_b) {
                return;
              } else {
                break L10;
              }
            }
          }
          var17 = this.d(10326);
          var3 = 0;
          L11: while (true) {
            if (((ha) this).field_W <= var3) {
              var3 = 0;
              L12: while (true) {
                if (-1 + ((ha) this).field_W <= var3) {
                  var3 = 0;
                  var4 = 0;
                  var5 = 0;
                  L13: while (true) {
                    if (((ha) this).field_W <= var5) {
                      L14: {
                        if (param0 == 1) {
                          break L14;
                        } else {
                          int discarded$6 = this.f((byte) 28);
                          break L14;
                        }
                      }
                      L15: {
                        ((ha) this).field_R = var3;
                        if (((ha) this).field_R != 0) {
                          break L15;
                        } else {
                          if (var4 != 0) {
                            var5 = -1;
                            var6 = 0;
                            L16: while (true) {
                              if (var6 >= ((ha) this).field_W) {
                                break L15;
                              } else {
                                if (((ha) this).field_fb[var6] == var5) {
                                  ((ha) this).field_R = ((ha) this).field_R + 1;
                                  var6++;
                                  continue L16;
                                } else {
                                  if (var5 < ((ha) this).field_fb[var6]) {
                                    ((ha) this).field_R = 1;
                                    var5 = ((ha) this).field_fb[var6];
                                    var6++;
                                    continue L16;
                                  } else {
                                    var6++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          L19: {
                            if (0 != ((ha) this).field_R) {
                              break L19;
                            } else {
                              int discarded$7 = -42;
                              if (this.e()) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          if (((ha) this).field_K != null) {
                            break L18;
                          } else {
                            break L17;
                          }
                        }
                        ((ha) this).field_R = 1;
                        break L17;
                      }
                      return;
                    } else {
                      if ((1 << var5 & ((ha) this).field_e) == 0) {
                        L20: {
                          if (((ha) this).field_fb[var5] < ((ha) this).field_xb) {
                            break L20;
                          } else {
                            var3++;
                            break L20;
                          }
                        }
                        if (((ha) this).field_mb[var5] >= ((ha) this).field_O) {
                          var4 = 1;
                          var5++;
                          continue L13;
                        } else {
                          var5++;
                          continue L13;
                        }
                      } else {
                        var5++;
                        continue L13;
                      }
                    }
                  }
                } else {
                  var4 = var3;
                  var5 = 1 + var3;
                  L21: while (true) {
                    if (((ha) this).field_W <= var5) {
                      var5 = ((ha) this).field_p[var3];
                      ((ha) this).field_p[var3] = ((ha) this).field_p[var4];
                      ((ha) this).field_p[var4] = var5;
                      var3++;
                      continue L12;
                    } else {
                      if (this.a(var17, ((ha) this).field_p[var4], -24107, ((ha) this).field_p[var5])) {
                        var4 = var5;
                        var5++;
                        continue L21;
                      } else {
                        var5++;
                        continue L21;
                      }
                    }
                  }
                }
              }
            } else {
              ((ha) this).field_p[var3] = var3;
              var3++;
              continue L11;
            }
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
        ne var5 = null;
        ne var6 = null;
        if (param0 > 19) {
          if (0 > param3) {
            return;
          } else {
            L0: {
              if (param2 < 0) {
                break L0;
              } else {
                if (param3 >= ((ha) this).field_v) {
                  break L0;
                } else {
                  if (((ha) this).field_db <= param2) {
                    break L0;
                  } else {
                    L1: {
                      var6 = ((ha) this).field_Eb[((ha) this).field_v * param2 + param3];
                      var5 = var6;
                      if (null == var6.field_c) {
                        if (var6.c(89)) {
                          var5.field_c = new jd(param3, param2, 20, param1, 15, 15, 1, 0, 0, (ha) this, 0, 0, -1, false, 0);
                          var6.i(14);
                          ((ha) this).a(8288, var6.field_c);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (var6.field_c.field_N != 20) {
                          break L1;
                        } else {
                          if (!((ha) this).c(var6.field_c.field_O, -16985, param1)) {
                            break L1;
                          } else {
                            var6.field_c.field_Y = var6.field_c.field_t;
                            break L1;
                          }
                        }
                      }
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
        int var17_int = 0;
        int[] var17 = null;
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
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        sd var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        Object stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        Object stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        Object stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_49_0 = null;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_52_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        L0: {
          ((ha) this).field_ab = 1;
          ((ha) this).field_R = 0;
          ((ha) this).field_eb = false;
          ((ha) this).field_bb = 1.0f;
          ((ha) this).field_Z = null;
          ((ha) this).field_Cb = false;
          ((ha) this).field_D = 0;
          ((ha) this).field_J = false;
          ((ha) this).field_o = false;
          ((ha) this).field_V = true;
          ((ha) this).field_Bb = false;
          ((ha) this).field_T = null;
          ((ha) this).field_A = 0;
          ((ha) this).field_r = true;
          ((ha) this).field_qb = false;
          ((ha) this).field_k = new at();
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param5) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((ha) this).field_Ab = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param10) {
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
        L2: {
          ((ha) this).field_wb = stackIn_6_1 != 0;
          ((ha) this).field_W = param1.length;
          ((ha) this).field_K = param15;
          ((ha) this).field_cb = param7;
          ((ha) this).field_vb = param8;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (((ha) this).field_wb) {
            stackOut_8_0 = this;
            stackOut_8_1 = 2;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = ((ha) this).field_W;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((ha) this).field_tb = stackIn_9_1;
          ((ha) this).field_hb = param9;
          ((ha) this).field_Q = param12;
          stackOut_9_0 = this;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (param13 <= 0) {
            stackOut_11_0 = this;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = this;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          ((ha) this).field_L = stackIn_12_1 != 0;
          stackOut_12_0 = this;
          stackOut_12_1 = this;
          stackIn_14_0 = stackOut_12_0;
          stackIn_14_1 = stackOut_12_1;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          if (((ha) this).field_K != null) {
            stackOut_14_0 = this;
            stackOut_14_1 = this;
            stackOut_14_2 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            stackIn_15_2 = stackOut_14_2;
            break L4;
          } else {
            stackOut_13_0 = this;
            stackOut_13_1 = this;
            stackOut_13_2 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_15_2 = stackOut_13_2;
            break L4;
          }
        }
        L5: {
          ((ha) this).field_V = stackIn_15_2 != 0;
          ((ha) this).field_r = stackIn_15_2 != 0;
          ((ha) this).field_P = new tt(((ha) this).field_W);
          if (((ha) this).field_cb >= 0) {
            break L5;
          } else {
            ((ha) this).field_cb = 0;
            break L5;
          }
        }
        L6: {
          if (((ha) this).field_K != null) {
            L7: {
              stackOut_31_0 = this;
              stackIn_33_0 = stackOut_31_0;
              stackIn_32_0 = stackOut_31_0;
              if (mh.a(((ha) this).field_K.field_G.field_r, -126, ((ha) this).field_K.field_v) != 0) {
                stackOut_33_0 = this;
                stackOut_33_1 = 0;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                break L7;
              } else {
                stackOut_32_0 = this;
                stackOut_32_1 = 1;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                break L7;
              }
            }
            ((ha) this).field_kb = stackIn_34_1 != 0;
            break L6;
          } else {
            L8: {
              if (2 >= ((ha) this).field_W) {
                break L8;
              } else {
                if (1 <= ((ha) this).field_cb) {
                  break L8;
                } else {
                  ((ha) this).field_cb = 1;
                  break L8;
                }
              }
            }
            L9: {
              if (-5 <= ((ha) this).field_W) {
                break L9;
              } else {
                if (2 <= ((ha) this).field_cb) {
                  break L9;
                } else {
                  ((ha) this).field_cb = 2;
                  break L9;
                }
              }
            }
            L10: {
              if (-7 >= ((ha) this).field_W) {
                break L10;
              } else {
                if (((ha) this).field_cb >= 3) {
                  break L10;
                } else {
                  ((ha) this).field_cb = 3;
                  break L10;
                }
              }
            }
            ((ha) this).field_kb = false;
            if (((ha) this).field_W >= 4) {
              break L6;
            } else {
              if (((ha) this).field_cb <= 2) {
                break L6;
              } else {
                if (((ha) this).field_cb == 4) {
                  break L6;
                } else {
                  ((ha) this).field_cb = 2;
                  break L6;
                }
              }
            }
          }
        }
        L11: {
          L12: {
            ((ha) this).field_jb = ns.a(false, 2147483647, li.field_n);
            ((ha) this).field_w = new go[((ha) this).field_tb];
            ((ha) this).field_yb = new int[((ha) this).field_W];
            ((ha) this).field_ib = param0;
            if (!((ha) this).field_wb) {
              break L12;
            } else {
              if (null == ((ha) this).field_K) {
                var40 = new int[((ha) this).field_W / 2];
                var36 = var40;
                var32 = var36;
                var27 = var32;
                var17 = var27;
                var18 = 0;
                var41 = new int[((ha) this).field_W / 2];
                var37 = var41;
                var33 = var37;
                var28 = var33;
                var19_ref_int__ = var28;
                var20 = 0;
                var21 = 0;
                L13: while (true) {
                  if (var21 >= ((ha) this).field_W) {
                    if (var20 == var18) {
                      ((ha) this).field_w[0] = new go(om.field_p, var40);
                      ((ha) this).field_w[1] = new go(vj.field_n, var41);
                      break L11;
                    } else {
                      throw new IllegalStateException("");
                    }
                  } else {
                    L14: {
                      if ((var21 & 1) != 0) {
                        int incrementValue$6 = var20;
                        var20++;
                        var19_ref_int__[incrementValue$6] = var21;
                        ((ha) this).field_yb[var21] = 1;
                        break L14;
                      } else {
                        int incrementValue$7 = var18;
                        var18++;
                        var17[incrementValue$7] = var21;
                        ((ha) this).field_yb[var21] = 0;
                        break L14;
                      }
                    }
                    var21++;
                    continue L13;
                  }
                }
              } else {
                break L12;
              }
            }
          }
          var17_int = 0;
          L15: while (true) {
            if (var17_int >= ((ha) this).field_W) {
              break L11;
            } else {
              ((ha) this).field_w[var17_int] = new go(param1[var17_int], new int[1]);
              ((ha) this).field_yb[var17_int] = var17_int;
              var17_int++;
              continue L15;
            }
          }
        }
        L16: {
          ((ha) this).field_l = new at();
          ((ha) this).field_c = new int[((ha) this).field_W][3];
          ((ha) this).field_E = new int[((ha) this).field_W][7];
          ((ha) this).field_lb = param1;
          ((ha) this).field_gb = param2;
          ((ha) this).field_n = new int[((ha) this).field_W];
          ((ha) this).field_H = new int[((ha) this).field_W];
          ((ha) this).field_db = 0;
          stackOut_49_0 = this;
          stackIn_51_0 = stackOut_49_0;
          stackIn_50_0 = stackOut_49_0;
          if (!param6) {
            stackOut_51_0 = this;
            stackOut_51_1 = 0;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            break L16;
          } else {
            stackOut_50_0 = this;
            stackOut_50_1 = 1;
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            break L16;
          }
        }
        L17: {
          ((ha) this).field_x = stackIn_52_1 != 0;
          ((ha) this).field_fb = new int[((ha) this).field_tb];
          ((ha) this).field_m = new int[((ha) this).field_W];
          ((ha) this).field_p = new int[((ha) this).field_tb];
          ((ha) this).field_t = new at[((ha) this).field_W];
          ((ha) this).field_sb = param4;
          ((ha) this).field_a = param3;
          ((ha) this).field_v = 0;
          stackOut_52_0 = this;
          stackIn_54_0 = stackOut_52_0;
          stackIn_53_0 = stackOut_52_0;
          if (!param5) {
            stackOut_54_0 = this;
            stackOut_54_1 = 0;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            break L17;
          } else {
            stackOut_53_0 = this;
            stackOut_53_1 = 1;
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            break L17;
          }
        }
        L18: {
          ((ha) this).field_b = stackIn_55_1 != 0;
          ((ha) this).field_S = new int[((ha) this).field_tb];
          ((ha) this).field_z = new int[((ha) this).field_tb][3];
          ((ha) this).field_mb = new int[((ha) this).field_W];
          ((ha) this).field_s = new int[3];
          ((ha) this).field_U = new int[((ha) this).field_W];
          if (!((ha) this).field_b) {
            ((ha) this).field_a = new int[((ha) this).field_W][];
            if (0 > param4) {
              break L18;
            } else {
              if (param4 >= ((ha) this).field_a.length) {
                break L18;
              } else {
                ((ha) this).field_a[param4] = param3[0];
                break L18;
              }
            }
          } else {
            L19: {
              if (param11 != null) {
                if (param11.length == 1) {
                  ((ha) this).field_B = new int[((ha) this).field_W][5];
                  var17_int = 0;
                  L20: while (true) {
                    if (((ha) this).field_W <= var17_int) {
                      break L19;
                    } else {
                      var18 = 0;
                      L21: while (true) {
                        if (var18 >= 5) {
                          var17_int++;
                          continue L20;
                        } else {
                          ((ha) this).field_B[var17_int][var18] = param11[0][var18];
                          var18++;
                          continue L21;
                        }
                      }
                    }
                  }
                } else {
                  ((ha) this).field_B = new int[((ha) this).field_W][];
                  var17_int = 0;
                  L22: while (true) {
                    if (var17_int >= ((ha) this).field_W) {
                      break L19;
                    } else {
                      L23: {
                        var18 = param11[var17_int].length;
                        if (var18 >= 5) {
                          break L23;
                        } else {
                          var18 = 5;
                          break L23;
                        }
                      }
                      ((ha) this).field_B[var17_int] = new int[var18];
                      var19 = 0;
                      L24: while (true) {
                        if (param11[var17_int].length <= var19) {
                          var19 = param11[var17_int].length;
                          L25: while (true) {
                            if (var18 <= var19) {
                              var17_int++;
                              continue L22;
                            } else {
                              ((ha) this).field_B[var17_int][var19] = -1;
                              var19++;
                              continue L25;
                            }
                          }
                        } else {
                          ((ha) this).field_B[var17_int][var19] = param11[var17_int][var19];
                          var19++;
                          continue L24;
                        }
                      }
                    }
                  }
                }
              } else {
                ((ha) this).field_B = null;
                break L19;
              }
            }
            L26: {
              if (param3.length == 1) {
                ((ha) this).field_a = new int[((ha) this).field_W][];
                var17_int = 0;
                L27: while (true) {
                  if (var17_int >= ((ha) this).field_W) {
                    break L26;
                  } else {
                    ((ha) this).field_a[var17_int] = param3[0];
                    var17_int++;
                    continue L27;
                  }
                }
              } else {
                ((ha) this).field_a = param3;
                break L26;
              }
            }
            ((ha) this).field_d = new int[16];
            ((ha) this).field_N = new int[16];
            var17_int = 0;
            L28: while (true) {
              if (var17_int >= 16) {
                ((ha) this).field_d[15] = 2;
                ((ha) this).field_d[12] = 30;
                ((ha) this).field_d[4] = 5;
                ((ha) this).field_d[10] = 500;
                ((ha) this).field_Y = new int[((ha) this).field_W];
                ((ha) this).field_M = new int[((ha) this).field_W];
                ((ha) this).field_g = new int[((ha) this).field_W];
                ((ha) this).field_h = new int[((ha) this).field_W];
                ((ha) this).field_d[14] = 2;
                ((ha) this).field_d[5] = 5;
                ((ha) this).field_d[8] = 5;
                ((ha) this).field_ob = new int[((ha) this).field_W];
                ((ha) this).field_d[7] = 3;
                ((ha) this).field_d[6] = 3;
                ((ha) this).field_d[11] = 30;
                ((ha) this).field_ub = new int[((ha) this).field_W];
                ((ha) this).field_d[0] = 1;
                ((ha) this).field_zb = new int[((ha) this).field_W];
                ((ha) this).field_y = new int[((ha) this).field_W];
                ((ha) this).field_d[13] = 10;
                var17_int = 0;
                L29: while (true) {
                  if (var17_int >= ((ha) this).field_W) {
                    break L18;
                  } else {
                    ((ha) this).field_ub[var17_int] = 0;
                    ((ha) this).field_g[var17_int] = 0;
                    ((ha) this).field_h[var17_int] = 0;
                    ((ha) this).field_Y[var17_int] = 0;
                    ((ha) this).field_zb[var17_int] = 0;
                    ((ha) this).field_ob[var17_int] = 0;
                    ((ha) this).field_M[var17_int] = 0;
                    ((ha) this).field_y[var17_int] = 0;
                    var17_int++;
                    continue L29;
                  }
                }
              } else {
                ((ha) this).field_N[var17_int] = -1;
                var17_int++;
                continue L28;
              }
            }
          }
        }
        var17_int = 0;
        L30: while (true) {
          if (var17_int >= ((ha) this).field_tb) {
            var17_int = 0;
            L31: while (true) {
              if (((ha) this).field_W <= var17_int) {
                L32: {
                  if (null == ((ha) this).field_K) {
                    break L32;
                  } else {
                    L33: {
                      var42 = ((ha) this).field_K.a((byte) -46);
                      var38 = var42;
                      var34 = var38;
                      var29 = var34;
                      var17 = var29;
                      if (var17 == null) {
                        break L33;
                      } else {
                        ((ha) this).field_tb = 0;
                        ((ha) this).field_wb = true;
                        var18 = 0;
                        L34: while (true) {
                          if (var18 >= var42.length) {
                            ((ha) this).field_tb = ((ha) this).field_tb + 1;
                            ((ha) this).field_w = new go[((ha) this).field_tb];
                            var18 = 0;
                            L35: while (true) {
                              if (var18 >= ((ha) this).field_tb) {
                                break L33;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                var21 = 0;
                                L36: while (true) {
                                  if (var21 >= var42.length) {
                                    if (var20 != 0) {
                                      var43 = new int[var20];
                                      var39 = var43;
                                      var35 = var39;
                                      var30 = var35;
                                      var21_ref_int__ = var30;
                                      var22 = 0;
                                      var23 = 0;
                                      L37: while (true) {
                                        if (var23 >= var42.length) {
                                          L38: {
                                            if (var19 != 0) {
                                              var23_ref_String = param1[((ha) this).field_K.field_w];
                                              break L38;
                                            } else {
                                              var23_ref_String = param1[var43[0]];
                                              break L38;
                                            }
                                          }
                                          ((ha) this).field_w[var18] = new go(var23_ref_String, var43);
                                          var18++;
                                          continue L35;
                                        } else {
                                          L39: {
                                            if (var42[var23] != var18) {
                                              break L39;
                                            } else {
                                              int incrementValue$8 = var22;
                                              var22++;
                                              var21_ref_int__[incrementValue$8] = var23;
                                              ((ha) this).field_yb[var23] = var18;
                                              break L39;
                                            }
                                          }
                                          var23++;
                                          continue L37;
                                        }
                                      }
                                    } else {
                                      throw new IllegalStateException("");
                                    }
                                  } else {
                                    L40: {
                                      if (var42[var21] != var18) {
                                        break L40;
                                      } else {
                                        L41: {
                                          if (var21 != ((ha) this).field_K.field_w) {
                                            break L41;
                                          } else {
                                            var19 = 1;
                                            break L41;
                                          }
                                        }
                                        var20++;
                                        break L40;
                                      }
                                    }
                                    var21++;
                                    continue L36;
                                  }
                                }
                              }
                            }
                          } else {
                            L42: {
                              if (var42[var18] <= ((ha) this).field_tb) {
                                break L42;
                              } else {
                                ((ha) this).field_tb = var42[var18];
                                break L42;
                              }
                            }
                            var18++;
                            continue L34;
                          }
                        }
                      }
                    }
                    var18 = 0;
                    L43: while (true) {
                      if (var18 >= ((ha) this).field_W) {
                        ((ha) this).field_Cb = true;
                        ((ha) this).field_D = 3;
                        break L32;
                      } else {
                        L44: {
                          if (((ha) this).field_K.field_w != var18) {
                            var31 = ((ha) this).field_K.field_G.field_q[((ha) this).field_K.field_B[var18]];
                            var20 = 0;
                            var21 = 1;
                            L45: while (true) {
                              if (var21 >= ((ha) this).field_a[var18].length) {
                                ((ha) this).field_c[var18] = new int[var20];
                                var21 = 0;
                                var22 = 0;
                                var26 = 1;
                                var23 = var26;
                                L46: while (true) {
                                  if (var26 >= ((ha) this).field_a[var18].length) {
                                    if (var22 <= 0) {
                                      break L44;
                                    } else {
                                      ((ha) this).field_E[var18][6] = var22;
                                      break L44;
                                    }
                                  } else {
                                    L47: {
                                      var24 = var31.field_t[var26 - 1];
                                      if (((ha) this).field_a[var18][var26] != 0) {
                                        L48: {
                                          ((ha) this).field_E[var18][-1 + var26] = var24;
                                          if (((ha) this).field_E[var18][-1 + var26] <= ((ha) this).field_E[var18][0]) {
                                            break L48;
                                          } else {
                                            ((ha) this).field_E[var18][0] = ((ha) this).field_E[var18][var26 + -1];
                                            break L48;
                                          }
                                        }
                                        int incrementValue$9 = var21;
                                        var21++;
                                        ((ha) this).field_c[var18][incrementValue$9] = var26 - 1;
                                        break L47;
                                      } else {
                                        if (var22 >= var24) {
                                          break L47;
                                        } else {
                                          var22 = var24;
                                          break L47;
                                        }
                                      }
                                    }
                                    var26++;
                                    continue L46;
                                  }
                                }
                              } else {
                                L49: {
                                  if (((ha) this).field_a[var18][var21] == 0) {
                                    break L49;
                                  } else {
                                    var20++;
                                    break L49;
                                  }
                                }
                                var21++;
                                continue L45;
                              }
                            }
                          } else {
                            ((ha) this).field_c[var18] = new int[1];
                            break L44;
                          }
                        }
                        var18++;
                        continue L43;
                      }
                    }
                  }
                }
                L50: {
                  if (!((ha) this).field_b) {
                    break L50;
                  } else {
                    ((ha) this).field_jb = ns.a(false, 2147483647, li.field_n);
                    ((ha) this).l(0, 0);
                    break L50;
                  }
                }
                int discarded$10 = 32;
                ((ha) this).field_O = this.b();
                ((ha) this).f(-2);
                ((ha) this).field_xb = this.f((byte) -80);
                ((ha) this).field_F = false;
                return;
              } else {
                L51: {
                  ((ha) this).field_n[var17_int] = -1;
                  ((ha) this).field_t[var17_int] = new at();
                  if (0 == var17_int) {
                    ((ha) this).field_H[var17_int] = 150;
                    break L51;
                  } else {
                    ((ha) this).field_H[var17_int] = 200;
                    break L51;
                  }
                }
                ((ha) this).field_mb[var17_int] = 0;
                var18 = 0;
                L52: while (true) {
                  if (var18 >= ((ha) this).field_E[var17_int].length) {
                    L53: {
                      L54: {
                        L55: {
                          if (((ha) this).field_b) {
                            break L55;
                          } else {
                            if (var17_int != ((ha) this).field_sb) {
                              break L54;
                            } else {
                              break L55;
                            }
                          }
                        }
                        if (((ha) this).field_a[var17_int][4] != 0) {
                          break L54;
                        } else {
                          if (0 != ((ha) this).field_a[var17_int][5]) {
                            break L54;
                          } else {
                            if (0 == ((ha) this).field_a[var17_int][6]) {
                              var18 = 0;
                              L56: while (true) {
                                if (var18 >= 3) {
                                  break L53;
                                } else {
                                  ((ha) this).field_c[var17_int][var18] = var18;
                                  ((ha) this).field_E[var17_int][((ha) this).field_c[var17_int][var18]] = 1;
                                  var18++;
                                  continue L56;
                                }
                              }
                            } else {
                              break L54;
                            }
                          }
                        }
                      }
                      if (((ha) this).field_L) {
                        var18 = 4;
                        var19 = 4;
                        L57: while (true) {
                          if (((ha) this).field_a[var17_int].length <= var19) {
                            ((ha) this).field_c[var17_int] = new int[var18];
                            var19 = 0;
                            var20 = 0;
                            L58: while (true) {
                              if (((ha) this).field_a[var17_int].length <= var20) {
                                break L53;
                              } else {
                                L59: {
                                  if (0 == ((ha) this).field_a[var17_int][var20]) {
                                    break L59;
                                  } else {
                                    int incrementValue$11 = var19;
                                    var19++;
                                    ((ha) this).field_c[var17_int][incrementValue$11] = var20;
                                    break L59;
                                  }
                                }
                                var20++;
                                continue L58;
                              }
                            }
                          } else {
                            L60: {
                              if (((ha) this).field_a[var17_int][var19] == 0) {
                                break L60;
                              } else {
                                var18++;
                                break L60;
                              }
                            }
                            var19++;
                            continue L57;
                          }
                        }
                      } else {
                        var18 = 0;
                        L61: while (true) {
                          if (var18 >= 3) {
                            break L53;
                          } else {
                            ((ha) this).field_c[var17_int][var18] = -1;
                            var18++;
                            continue L61;
                          }
                        }
                      }
                    }
                    ((ha) this).field_E[var17_int][6] = 1;
                    ((ha) this).field_m[var17_int] = lf.field_i[((ha) this).field_Q];
                    var17_int++;
                    continue L31;
                  } else {
                    ((ha) this).field_E[var17_int][var18] = 0;
                    var18++;
                    continue L52;
                  }
                }
              }
            }
          } else {
            ((ha) this).field_z[var17_int][0] = 0;
            ((ha) this).field_z[var17_int][1] = 0;
            ((ha) this).field_z[var17_int][2] = 0;
            ((ha) this).field_p[var17_int] = var17_int;
            ((ha) this).field_fb[var17_int] = 0;
            var17_int++;
            continue L30;
          }
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            param2 = ia.a(param2, '_', 3, "");
            L1: {
              L2: {
                var3 = nf.a(true, param2);
                if (param0.indexOf(param2) != 0) {
                  break L2;
                } else {
                  if (0 == param0.indexOf(var3)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ha.ID(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(-26).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "AnimationEvent";
        field_nb = "Loading graphics";
        field_pb = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
