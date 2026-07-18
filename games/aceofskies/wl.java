/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class wl extends ha {
    private int field_ec;
    jaggl.OpenGL field_kc;
    static float[] field_Ub;
    private long field_gc;
    static int[] field_m;
    private java.awt.Canvas field_Wb;
    static Object field_r;
    static Object field_Kb;
    private int field_Yb;
    private Hashtable field_R;
    private long field_Db;
    static String field_zc;
    int field_bb;
    private int field_g;
    private lu field_pc;
    int field_Ab;
    private jk field_q;
    private vr field_vb;
    private hp field_yb;
    int field_Hb;
    private eb field_X;
    private boolean field_S;
    jaclib.memory.heap.NativeHeap field_mb;
    cs field_cc;
    private kp field_jb;
    int field_hb;
    private wj field_y;
    private int field_fc;
    private up[] field_Fc;
    private er field_Ec;
    private tm field_j;
    private int field_rc;
    private up field_Rb;
    private int field_Y;
    private up field_qb;
    private up[] field_ob;
    private up[] field_Jb;
    private ph field_s;
    private int field_rb;
    private kp field_Gc;
    int field_lb;
    int field_ib;
    private int field_yc;
    private kp field_nb;
    private kp field_Ac;
    private kp field_zb;
    private kp field_Gb;
    private kp field_dc;
    private kp field_f;
    private boolean field_uc;
    private boolean field_hc;
    private boolean field_k;
    private boolean field_P;
    private int field_z;
    private int field_Cb;
    private long field_l;
    private int field_O;
    tj field_h;
    tj field_H;
    private boolean field_V;
    int field_Lb;
    private int field_jc;
    private ee field_cb;
    private int field_e;
    private int field_oc;
    boolean field_u;
    private int field_Bb;
    private boolean field_xb;
    private boolean field_ac;
    private fq field_gb;
    private boolean field_tc;
    private boolean field_p;
    boolean field_v;
    private int field_L;
    private int field_Pb;
    float field_Fb;
    boolean field_eb;
    private int field_T;
    private int field_d;
    wj field_o;
    private float field_sc;
    int field_U;
    float field_ic;
    int field_E;
    float field_w;
    boolean field_i;
    private int field_db;
    boolean field_x;
    private boolean field_Bc;
    private int field_Q;
    private float field_D;
    private float field_fb;
    boolean field_G;
    private int field_kb;
    private int field_Ib;
    boolean field_Cc;
    nr field_Vb;
    private boolean field_vc;
    float field_wb;
    boolean field_J;
    private int field_Sb;
    private String field_sb;
    private float field_ab;
    private int field_W;
    private float[] field_pb;
    private int field_wc;
    private int field_K;
    private boolean field_xc;
    private int field_F;
    int field_Xb;
    private boolean field_Mb;
    private rt[] field_bc;
    private boolean field_Eb;
    private int field_ub;
    private boolean field_I;
    private float field_t;
    int field_C;
    float field_Tb;
    int field_tb;
    boolean field_Nb;
    private boolean field_M;
    private fq field_Qb;
    private boolean field_qc;
    private float field_Zb;
    boolean field_A;
    boolean field_nc;
    private int field_Z;
    private int field_mc;
    float[] field_n;
    private int field_N;
    int field_Dc;
    boolean field_lc;
    private int field_Ob;
    private String field_B;

    final pa a(vd param0, boolean param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        pa var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        pa stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        pa stackOut_28_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_array = new int[param0.field_h * param0.field_c];
                var4 = 0;
                var5 = 0;
                if (param0.field_e != null) {
                  break L2;
                } else {
                  var6_int = 0;
                  L3: while (true) {
                    L4: {
                      if (~var6_int <= ~param0.field_c) {
                        break L4;
                      } else {
                        if (var9 != 0) {
                          break L1;
                        } else {
                          var7 = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (~param0.field_h >= ~var7) {
                                  break L7;
                                } else {
                                  int incrementValue$3 = var4;
                                  var4++;
                                  var8 = param0.field_f[param0.field_d[incrementValue$3] & 255];
                                  if (var9 != 0) {
                                    break L6;
                                  } else {
                                    L8: {
                                      int incrementValue$4 = var5;
                                      var5++;
                                      stackOut_8_0 = (int[]) var3_array;
                                      stackOut_8_1 = incrementValue$4;
                                      stackIn_13_0 = stackOut_8_0;
                                      stackIn_13_1 = stackOut_8_1;
                                      stackIn_9_0 = stackOut_8_0;
                                      stackIn_9_1 = stackOut_8_1;
                                      if (var8 == 0) {
                                        stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                                        stackOut_13_1 = stackIn_13_1;
                                        stackOut_13_2 = 0;
                                        stackIn_14_0 = stackOut_13_0;
                                        stackIn_14_1 = stackOut_13_1;
                                        stackIn_14_2 = stackOut_13_2;
                                        break L8;
                                      } else {
                                        stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                                        stackOut_9_1 = stackIn_9_1;
                                        stackIn_11_0 = stackOut_9_0;
                                        stackIn_11_1 = stackOut_9_1;
                                        stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                                        stackOut_11_1 = stackIn_11_1;
                                        stackOut_11_2 = vo.a(var8, -16777216);
                                        stackIn_14_0 = stackOut_11_0;
                                        stackIn_14_1 = stackOut_11_1;
                                        stackIn_14_2 = stackOut_11_2;
                                        break L8;
                                      }
                                    }
                                    stackIn_14_0[stackIn_14_1] = stackIn_14_2;
                                    var7++;
                                    if (var9 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var6_int++;
                              break L6;
                            }
                            if (var9 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var6_int = 0;
              L9: while (true) {
                if (~var6_int <= ~param0.field_c) {
                  break L1;
                } else {
                  var7 = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (param0.field_h <= var7) {
                          break L12;
                        } else {
                          int incrementValue$5 = var5;
                          var5++;
                          var3_array[incrementValue$5] = vo.a(param0.field_f[pg.a(255, (int) param0.field_d[var4])], param0.field_e[var4] << -1389705736);
                          var4++;
                          var7++;
                          if (var9 != 0) {
                            break L11;
                          } else {
                            if (var9 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var6_int++;
                      break L11;
                    }
                    if (var9 == 0) {
                      continue L9;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var6 = ((wl) this).a(97, param0.field_c, var3_array, 0, param0.field_h, param0.field_h);
            var6.a(param0.field_a, param0.field_i, param0.field_g, param0.field_b);
            stackOut_28_0 = (pa) var6;
            stackIn_29_0 = stackOut_28_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("wl.HA(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L13;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L13;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
        }
        return stackIn_29_0;
    }

    final void f(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != ((wl) this).field_db) {
                  break L2;
                } else {
                  if (~((wl) this).field_Ob != ~param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                ((wl) this).field_db = param0;
                ((wl) this).field_Ob = param1;
                this.u(3);
                this.k(-107);
                if (((wl) this).field_N == 3) {
                  break L3;
                } else {
                  if (2 == ((wl) this).field_N) {
                    this.d((byte) 125);
                    if (!AceOfSkies.field_G) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              this.d(5888);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.f(" + param0 + ',' + param1 + ')');
        }
    }

    final int[] a(int param0, int param1, byte param2, int param3, int param4) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_7_0 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -78) {
                break L1;
              } else {
                this.a((up) null, (byte) -74);
                break L1;
              }
            }
            var6 = new int[param3 * param1];
            var7 = 0;
            L2: while (true) {
              L3: {
                if (~param1 >= ~var7) {
                  break L3;
                } else {
                  jaggl.OpenGL.glReadPixelsi(param0, -param4 + (((wl) this).field_bb - var7), param3, 1, 32993, ((wl) this).field_tb, var6, var7 * param3);
                  var7++;
                  if (var8 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = (int[]) var6;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var6_ref, "wl.BC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_8_0;
    }

    private final void a(int param0, int param1, boolean param2) {
        try {
            this.a(true, param0, (byte) 125, param2);
            if (param1 != 4873) {
                ((wl) this).c(80, -100);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.TC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(rt param0, int param1) {
        RuntimeException runtimeException = null;
        rt var3 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 1) {
              L1: {
                var3 = ((wl) this).field_bc[((wl) this).field_Pb];
                if (param0 != var3) {
                  L2: {
                    L3: {
                      if (null == param0) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            if (null == var3) {
                              break L5;
                            } else {
                              if (~param0.field_f != ~var3.field_f) {
                                jaggl.OpenGL.glDisable(var3.field_f);
                                jaggl.OpenGL.glEnable(param0.field_f);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          jaggl.OpenGL.glEnable(param0.field_f);
                          break L4;
                        }
                        jaggl.OpenGL.glBindTexture(param0.field_f, param0.a(125));
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    jaggl.OpenGL.glDisable(var3.field_f);
                    break L2;
                  }
                  ((wl) this).field_bc[((wl) this).field_Pb] = param0;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((wl) this).field_O = ((wl) this).field_O & -2;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) runtimeException;
            stackOut_24_1 = new StringBuilder().append("wl.TA(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
    }

    private final void m(int param0) {
        try {
            if (param0 != 5149) {
                ((wl) this).c(-102, -84);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.RC(" + param0 + ')');
        }
    }

    wl(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        Throwable var4 = null;
        RuntimeException var4_ref = null;
        int var4_int = 0;
        Throwable var5 = null;
        int var5_int = 0;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        Object[] var8 = null;
        String[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        String var10_ref = null;
        Exception var11 = null;
        int var12 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_54_0 = 0;
        Object stackIn_85_0 = null;
        Object stackIn_87_0 = null;
        Object stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_53_0 = 0;
        Object stackOut_84_0 = null;
        Object stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        ((wl) this).field_R = new Hashtable();
        ((wl) this).field_Ab = 128;
        ((wl) this).field_q = new jk();
        tj discarded$5 = new tj();
        tj discarded$6 = new tj();
        ((wl) this).field_S = false;
        ((wl) this).field_jb = new kp();
        ((wl) this).field_Fc = new up[4];
        ((wl) this).field_Y = -1;
        ((wl) this).field_rc = -1;
        ((wl) this).field_fc = -1;
        ((wl) this).field_ob = new up[4];
        ((wl) this).field_Jb = new up[4];
        ((wl) this).field_Ec = new er();
        ((wl) this).field_s = new ph(16);
        ((wl) this).field_Gc = new kp();
        ((wl) this).field_nb = new kp();
        ((wl) this).field_Ac = new kp();
        ((wl) this).field_zb = new kp();
        ((wl) this).field_Gb = new kp();
        ((wl) this).field_dc = new kp();
        ((wl) this).field_f = new kp();
        tj discarded$7 = new tj();
        ((wl) this).field_h = new tj();
        ((wl) this).field_H = new tj();
        ((wl) this).field_Lb = 0;
        ((wl) this).field_Bb = 8448;
        ((wl) this).field_ic = 1.0f;
        ((wl) this).field_w = 1.0f;
        ((wl) this).field_db = 50;
        ((wl) this).field_U = -1;
        ((wl) this).field_D = 1.0f;
        ((wl) this).field_d = 0;
        ((wl) this).field_L = 0;
        ((wl) this).field_p = true;
        ((wl) this).field_wb = 1.0f;
        ((wl) this).field_W = 8448;
        ((wl) this).field_wc = 0;
        ((wl) this).field_Ib = 0;
        ((wl) this).field_sc = 1.0f;
        ((wl) this).field_ub = 512;
        ((wl) this).field_pb = new float[16];
        ((wl) this).field_oc = 0;
        ((wl) this).field_T = 0;
        ((wl) this).field_e = 0;
        ((wl) this).field_C = -1;
        ((wl) this).field_F = -1;
        ((wl) this).field_vc = false;
        ((wl) this).field_jc = 0;
        ((wl) this).field_Dc = -1;
        ((wl) this).field_mc = 512;
        ((wl) this).field_n = new float[4];
        ((wl) this).field_Ob = 3584;
        ((wl) this).field_Zb = 0.0f;
        ((wl) this).field_Q = 0;
        du discarded$8 = new du(8192);
        try {
          L0: {
            ((wl) this).field_Wb = param0;
            ((wl) this).field_Hb = param2;
            if (ei.a("jaclib", (byte) -16)) {
              if (ei.a("jaggl", (byte) -16)) {
                try {
                  L1: {
                    ((wl) this).field_kc = new jaggl.OpenGL();
                    long dupTemp$9 = ((wl) this).field_kc.init(param0, 8, 8, 8, 24, 0, ((wl) this).field_Hb);
                    ((wl) this).field_Db = dupTemp$9;
                    ((wl) this).field_gc = dupTemp$9;
                    if (0L == ((wl) this).field_Db) {
                      throw new RuntimeException("");
                    } else {
                      this.b(false);
                      var4_int = this.e((byte) -94);
                      if (var4_int == 0) {
                        L2: {
                          stackOut_13_0 = this;
                          stackIn_16_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (!((wl) this).field_V) {
                            stackOut_16_0 = this;
                            stackOut_16_1 = 5121;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            break L2;
                          } else {
                            stackOut_14_0 = this;
                            stackOut_14_1 = 33639;
                            stackIn_17_0 = stackOut_14_0;
                            stackIn_17_1 = stackOut_14_1;
                            break L2;
                          }
                        }
                        L3: {
                          ((wl) this).field_tb = stackIn_17_1;
                          if (((wl) this).field_sb.indexOf("radeon") != -1) {
                            var5_int = 0;
                            var6 = 0;
                            var7 = 0;
                            var8_array = ee.a((byte) 10, ' ', ((wl) this).field_sb.replace('/', ' '));
                            var9 = 0;
                            L4: while (true) {
                              L5: {
                                L6: {
                                  if (var8_array.length <= var9) {
                                    break L6;
                                  } else {
                                    var10_ref = var8_array[var9];
                                    try {
                                      L7: {
                                        stackOut_23_0 = var10_ref.length();
                                        stackIn_54_0 = stackOut_23_0;
                                        stackIn_24_0 = stackOut_23_0;
                                        if (var12 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L7;
                                        } else {
                                          L8: {
                                            L9: {
                                              if (stackIn_24_0 > 0) {
                                                break L9;
                                              } else {
                                                if (var12 == 0) {
                                                  break L8;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            L10: {
                                              if (120 != var10_ref.charAt(0)) {
                                                break L10;
                                              } else {
                                                if (var10_ref.length() < 3) {
                                                  break L10;
                                                } else {
                                                  if (vl.a(10, (CharSequence) (Object) var10_ref.substring(1, 3))) {
                                                    var7 = 1;
                                                    var10_ref = var10_ref.substring(1);
                                                    break L10;
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                              }
                                            }
                                            L11: {
                                              if (var10_ref.equals((Object) (Object) "hd")) {
                                                var6 = 1;
                                                if (var12 == 0) {
                                                  break L8;
                                                } else {
                                                  break L11;
                                                }
                                              } else {
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              if (!var10_ref.startsWith("hd")) {
                                                break L12;
                                              } else {
                                                var6 = 1;
                                                var10_ref = var10_ref.substring(2);
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              if (var10_ref.length() < 4) {
                                                break L13;
                                              } else {
                                                if (!vl.a(10, (CharSequence) (Object) var10_ref.substring(0, 4))) {
                                                  break L13;
                                                } else {
                                                  var5_int = td.a((CharSequence) (Object) var10_ref.substring(0, 4), (byte) 38);
                                                  decompiledRegionSelector0 = 3;
                                                  break L7;
                                                }
                                              }
                                            }
                                            decompiledRegionSelector0 = 2;
                                            break L7;
                                          }
                                          decompiledRegionSelector0 = 1;
                                          break L7;
                                        }
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L14: {
                                        var11 = (Exception) (Object) decompiledCaughtException;
                                        decompiledRegionSelector0 = 1;
                                        break L14;
                                      }
                                    }
                                    if (decompiledRegionSelector0 == 0) {
                                      break L5;
                                    } else {
                                      L15: {
                                        if (decompiledRegionSelector0 == 1) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (decompiledRegionSelector0 == 2) {
                                              break L16;
                                            } else {
                                              if (var12 == 0) {
                                                break L6;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          break L15;
                                        }
                                      }
                                      var9++;
                                      if (var12 == 0) {
                                        continue L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                stackOut_53_0 = var6;
                                stackIn_54_0 = stackOut_53_0;
                                break L5;
                              }
                              L17: {
                                L18: {
                                  if (stackIn_54_0 == 0) {
                                    break L18;
                                  } else {
                                    if (var5_int >= 4000) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                ((wl) this).field_J = false;
                                break L17;
                              }
                              L19: {
                                if (var7 != 0) {
                                  break L19;
                                } else {
                                  if (var6 != 0) {
                                    break L19;
                                  } else {
                                    L20: {
                                      if (var5_int < 7000) {
                                        break L20;
                                      } else {
                                        if (7999 >= var5_int) {
                                          ((wl) this).field_M = false;
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    if (var5_int < 7000) {
                                      break L19;
                                    } else {
                                      if (var5_int <= 9250) {
                                        ((wl) this).field_G = false;
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                              }
                              ((wl) this).field_u = ((wl) this).field_u & ((wl) this).field_kc.a("GL_ARB_half_float_pixel");
                              ((wl) this).field_xb = ((wl) this).field_M;
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        }
                        L21: {
                          if (((wl) this).field_B.indexOf("intel") == -1) {
                            break L21;
                          } else {
                            ((wl) this).field_A = false;
                            break L21;
                          }
                        }
                        L22: {
                          stackOut_84_0 = this;
                          stackIn_87_0 = stackOut_84_0;
                          stackIn_85_0 = stackOut_84_0;
                          if (((wl) this).field_B.equals((Object) (Object) "s3 graphics")) {
                            stackOut_87_0 = this;
                            stackOut_87_1 = 0;
                            stackIn_88_0 = stackOut_87_0;
                            stackIn_88_1 = stackOut_87_1;
                            break L22;
                          } else {
                            stackOut_85_0 = this;
                            stackOut_85_1 = 1;
                            stackIn_88_0 = stackOut_85_0;
                            stackIn_88_1 = stackOut_85_1;
                            break L22;
                          }
                        }
                        L23: {
                          ((wl) this).field_Eb = stackIn_88_1 != 0;
                          if (!((wl) this).field_M) {
                            break L23;
                          } else {
                            try {
                              L24: {
                                var5_array = new int[1];
                                jaggl.OpenGL.glGenBuffersARB(1, var5_array, 0);
                                break L24;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              var5 = decompiledCaughtException;
                              throw new RuntimeException("");
                            }
                            break L23;
                          }
                        }
                        L25: {
                          fr.a(false, 0, true);
                          ((wl) this).field_S = true;
                          ((wl) this).field_X = new eb((wl) this, ((wl) this).field_a);
                          this.x(-26394);
                          ((wl) this).field_cc = new cs((wl) this);
                          ((wl) this).field_pc = new lu((wl) this);
                          if (!((wl) this).field_pc.b(1)) {
                            break L25;
                          } else {
                            ((wl) this).field_yb = new hp((wl) this);
                            if (!((wl) this).field_yb.e(0)) {
                              ((wl) this).field_yb.a((byte) -31);
                              ((wl) this).field_yb = null;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                        }
                        ((wl) this).field_vb = new vr((wl) this);
                        this.f((byte) -66);
                        this.s(-11103);
                        ((wl) this).e();
                        break L1;
                      } else {
                        throw new RuntimeException("");
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var4 = decompiledCaughtException;
                  var4.printStackTrace();
                  ((wl) this).c();
                  throw new RuntimeException("");
                }
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          L26: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_103_0 = (RuntimeException) var4_ref;
            stackOut_103_1 = new StringBuilder().append("wl.<init>(");
            stackIn_106_0 = stackOut_103_0;
            stackIn_106_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param0 == null) {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L26;
            } else {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "{...}";
              stackIn_107_0 = stackOut_104_0;
              stackIn_107_1 = stackOut_104_1;
              stackIn_107_2 = stackOut_104_2;
              break L26;
            }
          }
          L27: {
            stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
            stackOut_107_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_107_2).append(',');
            stackIn_110_0 = stackOut_107_0;
            stackIn_110_1 = stackOut_107_1;
            stackIn_108_0 = stackOut_107_0;
            stackIn_108_1 = stackOut_107_1;
            if (param1 == null) {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L27;
            } else {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "{...}";
              stackIn_111_0 = stackOut_108_0;
              stackIn_111_1 = stackOut_108_1;
              stackIn_111_2 = stackOut_108_2;
              break L27;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_111_0, stackIn_111_2 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.d(56);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (((wl) this).field_kc.b()) {
                    break L4;
                  } else {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      int incrementValue$2 = var2_int;
                      var2_int++;
                      if (incrementValue$2 > 5) {
                        throw new RuntimeException("");
                      } else {
                        wf.a(1000L, false);
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.UA(" + param0 + ')');
        }
    }

    private final void a(float param0, float param1, float param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glMatrixMode(5890);
              if (!((wl) this).field_Bc) {
                break L1;
              } else {
                jaggl.OpenGL.glLoadIdentity();
                break L1;
              }
            }
            jaggl.OpenGL.glTranslatef(param1, param2, param0);
            jaggl.OpenGL.glMatrixMode(param3);
            ((wl) this).field_Bc = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var5, "wl.AC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void K(int[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param0[3] = ((wl) this).field_Q;
            param0[0] = ((wl) this).field_L;
            param0[2] = ((wl) this).field_d;
            param0[1] = ((wl) this).field_e;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wl.K(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7_float = 0.0f;
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                this.j(1);
                ((wl) this).b((byte) -122, param5);
                var7_float = (float)param2 - (float)param0;
                var8 = (float)param3 - (float)param1;
                if (0.0f != var7_float) {
                  break L2;
                } else {
                  if (0.0f != var8) {
                    break L2;
                  } else {
                    var7_float = 1.0f;
                    if (!AceOfSkies.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var9 = (float)(1.0 / Math.sqrt((double)(var7_float * var7_float + var8 * var8)));
              var8 = var8 * var9;
              var7_float = var7_float * var9;
              break L1;
            }
            jaggl.OpenGL.glColor4ub((byte)(param4 >> 1863956528), (byte)(param4 >> 880821000), (byte)param4, (byte)(param4 >> 928589304));
            jaggl.OpenGL.glBegin(1);
            jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param0, (float)param1 + 0.3499999940395355f);
            jaggl.OpenGL.glVertex2f(var7_float + (float)param2 + 0.3499999940395355f, 0.3499999940395355f + (var8 + (float)param3));
            jaggl.OpenGL.glEnd();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var7, "wl.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        iq var4 = null;
        try {
            int var5 = 40 / ((69 - param2) / 47);
            var4 = new iq(param1);
            var4.field_b = (long)param0;
            ((wl) this).field_Ac.a(80, (wf) (Object) var4);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.CD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 0) {
                break L1;
              } else {
                param0 = 0;
                break L1;
              }
            }
            L2: {
              if (~((wl) this).field_bb <= ~param3) {
                break L2;
              } else {
                param3 = ((wl) this).field_bb;
                break L2;
              }
            }
            L3: {
              if (param2 <= ((wl) this).field_ec) {
                break L3;
              } else {
                param2 = ((wl) this).field_ec;
                break L3;
              }
            }
            L4: {
              if (param1 < 0) {
                param1 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            ((wl) this).field_e = param1;
            ((wl) this).field_Q = param3;
            ((wl) this).field_d = param2;
            ((wl) this).field_L = param0;
            jaggl.OpenGL.glEnable(3089);
            this.m(5149);
            this.v(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "wl.KA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final q c(boolean param0) {
        RuntimeException var2 = null;
        q stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        q stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((wl) this).a(108, (byte) -128);
                break L1;
              }
            }
            L2: {
              if (((wl) this).field_cb != null) {
                stackOut_6_0 = ((wl) this).field_cb.b((byte) 127);
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = null;
                stackIn_7_0 = (q) (Object) stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.DC(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_O != 4) {
                this.h(-84);
                this.a(false, false);
                this.b(false, (byte) -125);
                this.c(false, param0 ^ -117);
                this.a(false, (byte) -28);
                this.g(-2, -100);
                ((wl) this).b((byte) -103, 1);
                ((wl) this).field_O = 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 10) {
                break L2;
              } else {
                ((wl) this).g(9);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.FA(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 8960) {
                break L1;
              } else {
                this.d(-118);
                break L1;
              }
            }
            boolean discarded$2 = ((wl) this).field_kc.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.FC(" + param0 + ')');
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        float var6_float = 0.0f;
        float var7 = 0.0f;
        try {
            this.j(1);
            ((wl) this).b((byte) 35, param4);
            var6_float = 0.3499999940395355f + (float)param0;
            jaggl.OpenGL.glColor4ub((byte)(param3 >> -721223632), (byte)(param3 >> 641383176), (byte)param3, (byte)(param3 >> -905635816));
            var7 = 0.3499999940395355f + (float)param1;
            jaggl.OpenGL.glBegin(1);
            jaggl.OpenGL.glVertex2f(var6_float, var7);
            jaggl.OpenGL.glVertex2f(var6_float + (float)param2, var7);
            jaggl.OpenGL.glEnd();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int b(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            if (param0) {
              break L0;
            } else {
              this.a(-87, -43, true);
              break L0;
            }
          }
          if (param1 == 1) {
            stackOut_20_0 = 7681;
            stackIn_21_0 = stackOut_20_0;
            return stackIn_21_0;
          } else {
            if (param1 != 0) {
              if (param1 == 2) {
                stackOut_18_0 = 34165;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0;
              } else {
                if (param1 != 3) {
                  if (param1 != 4) {
                    throw new IllegalArgumentException();
                  } else {
                    stackOut_16_0 = 34023;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  }
                } else {
                  stackOut_13_0 = 260;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              }
            } else {
              stackOut_7_0 = 8448;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.VB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((wl) this).field_Pb == 0) {
                  break L2;
                } else {
                  jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
                  jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
                  if (!AceOfSkies.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var4_int = 0;
                if (~((wl) this).field_Bb != ~param0) {
                  jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
                  ((wl) this).field_Bb = param0;
                  var4_int = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param2 == ((wl) this).field_W) {
                  break L4;
                } else {
                  jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
                  ((wl) this).field_W = param2;
                  var4_int = 1;
                  break L4;
                }
              }
              if (var4_int == 0) {
                break L1;
              } else {
                ((wl) this).field_O = ((wl) this).field_O & -30;
                break L1;
              }
            }
            L5: {
              if (param1 == -26625) {
                break L5;
              } else {
                ((wl) this).field_Xb = 59;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "wl.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void o(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((wl) this).field_kc = null;
                break L1;
              }
            }
            jaggl.OpenGL.glViewport(((wl) this).field_wc, ((wl) this).field_T, ((wl) this).field_ec, ((wl) this).field_bb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.CC(" + param0 + ')');
        }
    }

    final void a(za param0) {
        RuntimeException var2 = null;
        du var2_ref = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              ((wl) this).field_mb = ((im) (Object) param0).field_g;
              if (null == ((wl) this).field_gb) {
                L2: {
                  L3: {
                    var2_ref = new du(80);
                    if (!((wl) this).field_V) {
                      break L3;
                    } else {
                      var2_ref.a((byte) 125, -1.0f);
                      var2_ref.a((byte) 127, -1.0f);
                      var2_ref.a((byte) 115, 0.0f);
                      var2_ref.a((byte) 108, 0.0f);
                      var2_ref.a((byte) 82, 1.0f);
                      var2_ref.a((byte) 64, 1.0f);
                      var2_ref.a((byte) 102, -1.0f);
                      var2_ref.a((byte) 90, 0.0f);
                      var2_ref.a((byte) 116, 1.0f);
                      var2_ref.a((byte) 82, 1.0f);
                      var2_ref.a((byte) 87, 1.0f);
                      var2_ref.a((byte) 102, 1.0f);
                      var2_ref.a((byte) 75, 0.0f);
                      var2_ref.a((byte) 81, 1.0f);
                      var2_ref.a((byte) 113, 0.0f);
                      var2_ref.a((byte) 60, -1.0f);
                      var2_ref.a((byte) 72, 1.0f);
                      var2_ref.a((byte) 104, 0.0f);
                      var2_ref.a((byte) 95, 0.0f);
                      var2_ref.a((byte) 60, 0.0f);
                      if (!AceOfSkies.field_G) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_ref.b((byte) -90, -1.0f);
                  var2_ref.b((byte) -90, -1.0f);
                  var2_ref.b((byte) -90, 0.0f);
                  var2_ref.b((byte) -90, 0.0f);
                  var2_ref.b((byte) -90, 1.0f);
                  var2_ref.b((byte) -90, 1.0f);
                  var2_ref.b((byte) -90, -1.0f);
                  var2_ref.b((byte) -90, 0.0f);
                  var2_ref.b((byte) -90, 1.0f);
                  var2_ref.b((byte) -90, 1.0f);
                  var2_ref.b((byte) -90, 1.0f);
                  var2_ref.b((byte) -90, 1.0f);
                  var2_ref.b((byte) -90, 0.0f);
                  var2_ref.b((byte) -90, 1.0f);
                  var2_ref.b((byte) -90, 0.0f);
                  var2_ref.b((byte) -90, -1.0f);
                  var2_ref.b((byte) -90, 1.0f);
                  var2_ref.b((byte) -90, 0.0f);
                  var2_ref.b((byte) -90, 0.0f);
                  var2_ref.b((byte) -90, 0.0f);
                  break L2;
                }
                ((wl) this).field_gb = ((wl) this).a((byte) -49, 20, var2_ref.field_f, var2_ref.field_g, false);
                hl discarded$2 = new hl(((wl) this).field_gb, 5126, 3, 0);
                hl discarded$3 = new hl(((wl) this).field_gb, 5126, 2, 12);
                ((wl) this).field_q.a((byte) 102, (wl) this);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("wl.NA(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final synchronized void d(int param0, int param1) {
        wf var4 = null;
        try {
            int var3_int = 19 / ((param0 - -68) / 56);
            var4 = new wf();
            var4.field_b = (long)param1;
            ((wl) this).field_dc.a(110, var4);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.IC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void l(int param0) {
        ((wl) this).field_d = ((wl) this).field_ec;
        if (param0 != 24643) {
            return;
        }
        try {
            ((wl) this).field_Q = ((wl) this).field_bb;
            ((wl) this).field_L = 0;
            ((wl) this).field_e = 0;
            jaggl.OpenGL.glDisable(3089);
            this.m(5149);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.TB(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        float[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            this.g(-2, -88);
            var2_int = ((wl) this).field_Xb - 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int < 0) {
                    break L3;
                  } else {
                    ((wl) this).a(false, var2_int);
                    ((wl) this).a((rt) null, 1);
                    jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
                    var2_int--;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((wl) this).a(8448, param0 ^ 26689, 8448);
                ((wl) this).a(34168, 770, param0 + 34242, 2);
                this.q(-127);
                ((wl) this).field_Cb = 1;
                jaggl.OpenGL.glEnable(3042);
                jaggl.OpenGL.glBlendFunc(770, 771);
                ((wl) this).field_z = 1;
                jaggl.OpenGL.glEnable(3008);
                jaggl.OpenGL.glAlphaFunc(516, 0.0f);
                ((wl) this).field_k = true;
                jaggl.OpenGL.glColorMask(true, true, true, true);
                ((wl) this).field_hc = true;
                this.a(false, true);
                this.b(true, (byte) -125);
                this.c(true, param0 + -61);
                this.a(true, (byte) -28);
                break L2;
              }
              if (param0 == -66) {
                this.p(param0 + 189);
                ((wl) this).field_kc.setSwapInterval(0);
                jaggl.OpenGL.glShadeModel(7425);
                jaggl.OpenGL.glClearDepth(1.0f);
                jaggl.OpenGL.glDepthFunc(515);
                jaggl.OpenGL.glPolygonMode(1028, 6914);
                jaggl.OpenGL.glEnable(2884);
                jaggl.OpenGL.glCullFace(1029);
                jaggl.OpenGL.glMatrixMode(5888);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glColorMaterial(1028, 5634);
                jaggl.OpenGL.glEnable(2903);
                var2_array = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
                var3 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var3 >= 8) {
                        break L6;
                      } else {
                        var4 = var3 + 16384;
                        jaggl.OpenGL.glLightfv(var4, 4608, var2_array, 0);
                        jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
                        jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
                        var3++;
                        if (var5 != 0) {
                          break L5;
                        } else {
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    jaggl.OpenGL.glEnable(16384);
                    jaggl.OpenGL.glEnable(16385);
                    jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                    jaggl.OpenGL.glFogi(2917, 9729);
                    jaggl.OpenGL.glHint(3156, 4353);
                    ((wl) this).field_F = -1;
                    this.l(24643);
                    break L5;
                  }
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.DD(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, byte param2, boolean param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        uh var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        var13 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 124) {
                break L1;
              } else {
                field_Ub = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (~param1 != ~((wl) this).field_kb) {
                  break L3;
                } else {
                  L4: {
                    if (((wl) this).field_qc) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L4;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      break L4;
                    }
                  }
                  L5: {
                    stackOut_11_0 = stackIn_11_0;
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (((wl) this).field_vc) {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L5;
                    } else {
                      stackOut_12_0 = stackIn_12_0;
                      stackOut_12_1 = 1;
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_15_1 = stackOut_12_1;
                      break L5;
                    }
                  }
                  if (stackIn_15_0 != stackIn_15_1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                var5 = null;
                var6 = 0;
                var7 = 0;
                var8 = 0;
                if (((wl) this).field_qc) {
                  stackOut_20_0 = 3;
                  stackIn_21_0 = stackOut_20_0;
                  break L6;
                } else {
                  stackOut_18_0 = 0;
                  stackIn_21_0 = stackOut_18_0;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var9 = stackIn_21_0;
                  if (param1 >= 0) {
                    break L8;
                  } else {
                    this.q(116);
                    if (var13 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  L10: {
                    var5 = (Object) (Object) ((wl) this).field_X.a(param1, (byte) 14);
                    var10 = ((wl) this).field_a.a(false, param1);
                    if (0 != var10.field_n) {
                      break L10;
                    } else {
                      if (0 != var10.field_j) {
                        break L10;
                      } else {
                        this.q(67);
                        if (var13 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    if (!var10.field_o) {
                      stackOut_37_0 = 128;
                      stackIn_38_0 = stackOut_37_0;
                      break L11;
                    } else {
                      stackOut_35_0 = 64;
                      stackIn_38_0 = stackOut_35_0;
                      break L11;
                    }
                  }
                  var11 = stackIn_38_0;
                  var12 = 50 * var11;
                  this.a(0.0f, (float)(((wl) this).field_hb % var12 * var10.field_n) / (float)var12, (float)(var10.field_j * (((wl) this).field_hb % var12)) / (float)var12, 5888);
                  break L9;
                }
                var6 = var10.field_e;
                if (!((wl) this).field_qc) {
                  var8 = var10.field_h;
                  var7 = var10.field_s;
                  var9 = var10.field_c;
                  break L7;
                } else {
                  break L7;
                }
              }
              L12: {
                ((wl) this).field_vb.a(var9, param3, 2147483647, var8, param0, var7);
                if (((wl) this).field_vb.a(var6, -1896, (rt) var5)) {
                  break L12;
                } else {
                  ((wl) this).a((rt) var5, 1);
                  ((wl) this).a(var6, (byte) -39);
                  break L12;
                }
              }
              ((wl) this).field_vc = ((wl) this).field_qc;
              ((wl) this).field_kb = param1;
              break L2;
            }
            ((wl) this).field_O = ((wl) this).field_O & -8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (Object) (Object) decompiledCaughtException;
          throw pn.a((Throwable) var5, "wl.MB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -67) {
                break L1;
              } else {
                ((wl) this).a((byte) -71);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (!((wl) this).field_ac) {
                    break L4;
                  } else {
                    if (!((wl) this).field_xc) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                jaggl.OpenGL.glDisable(2896);
                if (!AceOfSkies.field_G) {
                  break L2;
                } else {
                  break L3;
                }
              }
              jaggl.OpenGL.glEnable(2896);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.P(" + param0 + ')');
        }
    }

    final void b(byte param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        boolean stackIn_23_0 = false;
        boolean stackIn_25_0 = false;
        boolean stackIn_26_0 = false;
        int stackIn_26_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        boolean stackOut_22_0 = false;
        boolean stackOut_25_0 = false;
        int stackOut_25_1 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_23_1 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((wl) this).field_Cb == param1) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (param1 != 1) {
                      break L3;
                    } else {
                      var5 = 1;
                      var4 = 1;
                      var3_int = 1;
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (2 != param1) {
                      break L4;
                    } else {
                      var3_int = 1;
                      var4 = 0;
                      var5 = 2;
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param1 == 128) {
                      break L5;
                    } else {
                      var3_int = 1;
                      var4 = 0;
                      var5 = 0;
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var4 = 1;
                  var3_int = 1;
                  var5 = 3;
                  break L2;
                }
                L6: {
                  stackOut_15_0 = var3_int;
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (((wl) this).field_hc) {
                    stackOut_18_0 = stackIn_18_0;
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L6;
                  } else {
                    stackOut_16_0 = stackIn_16_0;
                    stackOut_16_1 = 1;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    break L6;
                  }
                }
                L7: {
                  if (stackIn_19_0 != stackIn_19_1) {
                    break L7;
                  } else {
                    jaggl.OpenGL.glColorMask(var3_int != 0, var3_int != 0, var3_int != 0, true);
                    ((wl) this).field_hc = var3_int != 0;
                    break L7;
                  }
                }
                L8: {
                  stackOut_22_0 = ((wl) this).field_k;
                  stackIn_25_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (var4 != 0) {
                    stackOut_25_0 = stackIn_25_0;
                    stackOut_25_1 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    break L8;
                  } else {
                    stackOut_23_0 = stackIn_23_0;
                    stackOut_23_1 = 1;
                    stackIn_26_0 = stackOut_23_0;
                    stackIn_26_1 = stackOut_23_1;
                    break L8;
                  }
                }
                L9: {
                  if ((stackIn_26_0 ? 1 : 0) == stackIn_26_1) {
                    L10: {
                      L11: {
                        if (var4 != 0) {
                          break L11;
                        } else {
                          jaggl.OpenGL.glDisable(3008);
                          if (var6 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      jaggl.OpenGL.glEnable(3008);
                      break L10;
                    }
                    ((wl) this).field_k = var4 != 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L12: {
                  if (~((wl) this).field_z == ~var5) {
                    break L12;
                  } else {
                    L13: {
                      L14: {
                        if (var5 != 1) {
                          break L14;
                        } else {
                          jaggl.OpenGL.glEnable(3042);
                          jaggl.OpenGL.glBlendFunc(770, 771);
                          if (var6 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (2 == var5) {
                          break L15;
                        } else {
                          L16: {
                            if (var5 != 3) {
                              break L16;
                            } else {
                              jaggl.OpenGL.glEnable(3042);
                              jaggl.OpenGL.glBlendFunc(774, 1);
                              if (var6 == 0) {
                                break L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                          jaggl.OpenGL.glDisable(3042);
                          if (var6 == 0) {
                            break L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                      jaggl.OpenGL.glEnable(3042);
                      jaggl.OpenGL.glBlendFunc(1, 1);
                      break L13;
                    }
                    ((wl) this).field_z = var5;
                    break L12;
                  }
                }
                ((wl) this).field_Cb = param1;
                ((wl) this).field_O = ((wl) this).field_O & -29;
                break L1;
              }
            }
            var3_int = 78 / ((param0 - -41) / 36);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.GD(" + param0 + ',' + param1 + ')');
        }
    }

    final void T(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_d <= param2) {
                break L1;
              } else {
                ((wl) this).field_d = param2;
                break L1;
              }
            }
            L2: {
              if (~((wl) this).field_Q < ~param3) {
                ((wl) this).field_Q = param3;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 > ((wl) this).field_e) {
                ((wl) this).field_e = param1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 <= ((wl) this).field_L) {
                break L4;
              } else {
                ((wl) this).field_L = param0;
                break L4;
              }
            }
            jaggl.OpenGL.glEnable(3089);
            this.m(5149);
            this.v(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var5, "wl.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(long param0, int param1) {
        wf var4 = null;
        if (param1 != 3) {
            return;
        }
        try {
            var4 = new wf();
            var4.field_b = param0;
            ((wl) this).field_f.a(param1 + 98, var4);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.JB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void v(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                L2: {
                  if (~((wl) this).field_d > ~((wl) this).field_L) {
                    break L2;
                  } else {
                    if (((wl) this).field_e > ((wl) this).field_Q) {
                      break L2;
                    } else {
                      jaggl.OpenGL.glScissor(((wl) this).field_wc + ((wl) this).field_L, -((wl) this).field_Q + ((wl) this).field_bb + ((wl) this).field_T, -((wl) this).field_L + ((wl) this).field_d, ((wl) this).field_Q + -((wl) this).field_e);
                      if (!AceOfSkies.field_G) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                jaggl.OpenGL.glScissor(0, 0, 0, 0);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.JC(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!((wl) this).field_tc) {
                    break L3;
                  } else {
                    if (((wl) this).field_C >= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                jaggl.OpenGL.glDisable(2912);
                if (!AceOfSkies.field_G) {
                  break L1;
                } else {
                  break L2;
                }
              }
              jaggl.OpenGL.glEnable(2912);
              break L1;
            }
            L4: {
              if (param0 == -1) {
                break L4;
              } else {
                ((wl) this).a(-19, -108, -19);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.RB(" + param0 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_O != 2) {
                this.h(-109);
                this.a(false, false);
                this.b(false, (byte) -125);
                this.c(false, -128);
                this.a(false, (byte) -28);
                this.g(-2, 115);
                ((wl) this).field_O = 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 1025208104) {
                break L2;
              } else {
                this.f((byte) 124);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.MA(" + param0 + ')');
        }
    }

    final void b(byte param0, up param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((wl) this).field_i) {
                  break L2;
                } else {
                  L3: {
                    if (((wl) this).field_rc < 0) {
                      break L3;
                    } else {
                      if (((wl) this).field_Jb[((wl) this).field_rc] == param1) {
                        L4: {
                          int fieldTemp$2 = ((wl) this).field_rc;
                          ((wl) this).field_rc = ((wl) this).field_rc - 1;
                          ((wl) this).field_Jb[fieldTemp$2] = null;
                          param1.b(10383);
                          if (((wl) this).field_rc < 0) {
                            break L4;
                          } else {
                            ((wl) this).field_qb = ((wl) this).field_Jb[((wl) this).field_rc];
                            ((wl) this).field_Rb = ((wl) this).field_Jb[((wl) this).field_rc];
                            ((wl) this).field_Rb.a(param0 ^ 18952);
                            if (var4 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        ((wl) this).field_Rb = null;
                        ((wl) this).field_qb = null;
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              }
              this.a((byte) -94, param1);
              this.a(param1, (byte) 49);
              break L1;
            }
            L5: {
              if (param0 == -113) {
                break L5;
              } else {
                ((wl) this).field_v = true;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("wl.HB(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    private final void a(int param0, up param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (~((wl) this).field_Y <= param0) {
              throw new RuntimeException();
            } else {
              L1: {
                if (((wl) this).field_Y >= 0) {
                  ((wl) this).field_ob[((wl) this).field_Y].b((byte) -40);
                  break L1;
                } else {
                  break L1;
                }
              }
              int fieldTemp$2 = ((wl) this).field_Y + 1;
              ((wl) this).field_Y = ((wl) this).field_Y + 1;
              ((wl) this).field_ob[fieldTemp$2] = param1;
              ((wl) this).field_qb = param1;
              ((wl) this).field_qb.c(-1122);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("wl.KC(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (1 != param0) {
                  break L2;
                } else {
                  ((wl) this).a(7681, -26625, 7681);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 != 0) {
                  break L3;
                } else {
                  ((wl) this).a(8448, -26625, 8448);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 != 2) {
                  break L4;
                } else {
                  ((wl) this).a(34165, -26625, 7681);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (param0 != 3) {
                  break L5;
                } else {
                  ((wl) this).a(260, -26625, 8448);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              if (4 != param0) {
                break L1;
              } else {
                ((wl) this).a(34023, param1 ^ 26662, 34023);
                break L1;
              }
            }
            L6: {
              if (param1 == -39) {
                break L6;
              } else {
                this.a(-44, -126, true);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.GB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void y(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 32598) {
                break L1;
              } else {
                wl.y(40);
                break L1;
              }
            }
            field_m = null;
            field_Ub = null;
            field_r = null;
            field_zc = null;
            field_Kb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "wl.SC(" + param0 + ')');
        }
    }

    final void a(byte param0, fq param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -120) {
                break L1;
              } else {
                ((wl) this).field_ob = null;
                break L1;
              }
            }
            L2: {
              if (((wl) this).field_Qb != param1) {
                L3: {
                  if (!((wl) this).field_M) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glBindBufferARB(34962, param1.a(param0 + 6650));
                    break L3;
                  }
                }
                ((wl) this).field_Qb = param1;
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("wl.MC(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        try {
          L0: {
            L1: {
              if (param1) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              stackOut_4_0 = stackIn_4_0;
              stackIn_7_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (((wl) this).field_xc) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_8_0 = stackOut_5_0;
                stackIn_8_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_8_0 != stackIn_8_1) {
                ((wl) this).field_xc = param1;
                this.b((byte) -67);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 == -126) {
                break L4;
              } else {
                ((wl) this).a((byte) -46, (fq) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.OB(" + param0 + ',' + param1 + ')');
        }
    }

    private final int w(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 8705) {
                break L1;
              } else {
                ((wl) this).field_ob = null;
                break L1;
              }
            }
            stackOut_3_0 = ((wl) this).field_ib - (-((wl) this).field_lb + -((wl) this).field_yc);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.CB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(up param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((wl) this).field_i) {
                  break L2;
                } else {
                  if (((wl) this).field_rc < 3) {
                    L3: {
                      if (((wl) this).field_rc >= 0) {
                        ((wl) this).field_Jb[((wl) this).field_rc].b(param1 ^ 43026);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    int fieldTemp$2 = ((wl) this).field_rc + 1;
                    ((wl) this).field_rc = ((wl) this).field_rc + 1;
                    ((wl) this).field_Jb[fieldTemp$2] = param0;
                    ((wl) this).field_qb = param0;
                    ((wl) this).field_Rb = param0;
                    ((wl) this).field_Rb.a(param1 + -51990);
                    if (!AceOfSkies.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              this.b(param0, param1 ^ 32993);
              this.a(-4, param0);
              break L1;
            }
            L4: {
              if (param1 == 32925) {
                break L4;
              } else {
                ((wl) this).field_D = -1.2460601329803467f;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("wl.PC(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final void c(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_P == param0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      jaggl.OpenGL.glEnable(2929);
                      if (!AceOfSkies.field_G) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  jaggl.OpenGL.glDisable(2929);
                  break L2;
                }
                ((wl) this).field_P = param0;
                ((wl) this).field_O = ((wl) this).field_O & -32;
                break L1;
              }
            }
            L4: {
              if (param1 <= -126) {
                break L4;
              } else {
                ((wl) this).field_dc = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.NC(" + param0 + ',' + param1 + ')');
        }
    }

    final int XA() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = ((wl) this).field_Ob;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "wl.XA()");
        }
        return stackIn_1_0;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                ((wl) this).field_jc = param1;
                ((wl) this).field_ub = param2;
                ((wl) this).field_mc = param3;
                ((wl) this).field_Ib = param0;
                this.u(3);
                this.m(5149);
                if (((wl) this).field_N == 3) {
                  break L2;
                } else {
                  if (((wl) this).field_N == 2) {
                    this.d((byte) 90);
                    if (!AceOfSkies.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              this.d(5888);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var5, "wl.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        iq var3 = null;
        wf var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            param0 = param0 & 2147483647;
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((wl) this).field_nb.a(true)) {
                    break L3;
                  } else {
                    var3 = (iq) (Object) ((wl) this).field_nb.e(123);
                    int incrementValue$4 = var2_int;
                    var2_int++;
                    in.field_b[incrementValue$4] = (int)var3.field_b;
                    ((wl) this).field_ib = ((wl) this).field_ib - var3.field_f;
                    stackOut_3_0 = 1000;
                    stackOut_3_1 = var2_int;
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_10_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != stackIn_4_1) {
                          break L4;
                        } else {
                          jaggl.OpenGL.glDeleteBuffersARB(var2_int, in.field_b, 0);
                          var2_int = 0;
                          break L4;
                        }
                      }
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = ~var2_int;
                stackOut_9_1 = -1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              }
              L5: {
                if (stackIn_10_0 >= stackIn_10_1) {
                  break L5;
                } else {
                  jaggl.OpenGL.glDeleteBuffersARB(var2_int, in.field_b, 0);
                  var2_int = 0;
                  break L5;
                }
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if (((wl) this).field_Ac.a(true)) {
                      break L8;
                    } else {
                      var3 = (iq) (Object) ((wl) this).field_Ac.e(121);
                      int incrementValue$5 = var2_int;
                      var2_int++;
                      in.field_b[incrementValue$5] = (int)var3.field_b;
                      ((wl) this).field_lb = ((wl) this).field_lb - var3.field_f;
                      stackOut_13_0 = -1001;
                      stackOut_13_1 = ~var2_int;
                      stackIn_20_0 = stackOut_13_0;
                      stackIn_20_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (var4 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (stackIn_14_0 != stackIn_14_1) {
                            break L9;
                          } else {
                            jaggl.OpenGL.glDeleteTextures(var2_int, in.field_b, 0);
                            var2_int = 0;
                            break L9;
                          }
                        }
                        if (var4 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_19_0 = 0;
                  stackOut_19_1 = var2_int;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L7;
                }
                L10: {
                  if (stackIn_20_0 >= stackIn_20_1) {
                    break L10;
                  } else {
                    jaggl.OpenGL.glDeleteTextures(var2_int, in.field_b, 0);
                    var2_int = 0;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    L13: {
                      if (((wl) this).field_zb.a(true)) {
                        break L13;
                      } else {
                        var3 = (iq) (Object) ((wl) this).field_zb.e(124);
                        int incrementValue$6 = var2_int;
                        var2_int++;
                        in.field_b[incrementValue$6] = var3.field_f;
                        stackOut_23_0 = 1000;
                        stackOut_23_1 = var2_int;
                        stackIn_31_0 = stackOut_23_0;
                        stackIn_31_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (var4 != 0) {
                          break L12;
                        } else {
                          L14: {
                            if (stackIn_24_0 == stackIn_24_1) {
                              jaggl.OpenGL.glDeleteFramebuffersEXT(var2_int, in.field_b, 0);
                              var2_int = 0;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          if (var4 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    stackOut_30_0 = -1;
                    stackOut_30_1 = ~var2_int;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    break L12;
                  }
                  L15: {
                    if (stackIn_31_0 <= stackIn_31_1) {
                      break L15;
                    } else {
                      jaggl.OpenGL.glDeleteFramebuffersEXT(var2_int, in.field_b, 0);
                      var2_int = 0;
                      break L15;
                    }
                  }
                  L16: while (true) {
                    L17: {
                      L18: {
                        if (((wl) this).field_Gb.a(true)) {
                          break L18;
                        } else {
                          var3 = (iq) (Object) ((wl) this).field_Gb.e(127);
                          int incrementValue$7 = var2_int;
                          var2_int++;
                          in.field_b[incrementValue$7] = (int)var3.field_b;
                          ((wl) this).field_yc = ((wl) this).field_yc - var3.field_f;
                          stackOut_34_0 = ~var2_int;
                          stackOut_34_1 = -1001;
                          stackIn_42_0 = stackOut_34_0;
                          stackIn_42_1 = stackOut_34_1;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          if (var4 != 0) {
                            break L17;
                          } else {
                            L19: {
                              if (stackIn_35_0 == stackIn_35_1) {
                                jaggl.OpenGL.glDeleteRenderbuffersEXT(var2_int, in.field_b, 0);
                                var2_int = 0;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            if (var4 == 0) {
                              continue L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      stackOut_41_0 = -1;
                      stackOut_41_1 = ~var2_int;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      break L17;
                    }
                    L20: {
                      if (stackIn_42_0 <= stackIn_42_1) {
                        break L20;
                      } else {
                        jaggl.OpenGL.glDeleteRenderbuffersEXT(var2_int, in.field_b, 0);
                        var2_int = 0;
                        break L20;
                      }
                    }
                    L21: while (true) {
                      L22: {
                        L23: {
                          L24: {
                            L25: {
                              if (((wl) this).field_Gc.a(true)) {
                                break L25;
                              } else {
                                var3 = (iq) (Object) ((wl) this).field_Gc.e(121);
                                jaggl.OpenGL.glDeleteLists((int)var3.field_b, var3.field_f);
                                if (var4 != 0) {
                                  break L24;
                                } else {
                                  if (var4 == 0) {
                                    continue L21;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            L26: while (true) {
                              if (((wl) this).field_dc.a(true)) {
                                break L24;
                              } else {
                                var3_ref = ((wl) this).field_dc.e(121);
                                jaggl.OpenGL.glDeleteProgramARB((int)var3_ref.field_b);
                                if (var4 != 0) {
                                  break L23;
                                } else {
                                  if (var4 == 0) {
                                    continue L26;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                          }
                          L27: while (true) {
                            if (((wl) this).field_f.a(true)) {
                              break L23;
                            } else {
                              var3_ref = ((wl) this).field_f.e(127);
                              jaggl.OpenGL.glDeleteObjectARB(var3_ref.field_b);
                              if (var4 != 0) {
                                break L22;
                              } else {
                                if (var4 == 0) {
                                  continue L27;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        }
                        L28: while (true) {
                          L29: {
                            if (((wl) this).field_Gc.a(true)) {
                              break L29;
                            } else {
                              var3 = (iq) (Object) ((wl) this).field_Gc.e(124);
                              jaggl.OpenGL.glDeleteLists((int)var3.field_b, var3.field_f);
                              if (var4 != 0) {
                                break L22;
                              } else {
                                if (var4 == 0) {
                                  continue L28;
                                } else {
                                  break L29;
                                }
                              }
                            }
                          }
                          ((wl) this).field_X.a(64);
                          break L22;
                        }
                      }
                      L30: {
                        if (this.w(8705) <= 100663296) {
                          break L30;
                        } else {
                          if (60000L + ((wl) this).field_l >= kh.a(-57)) {
                            break L30;
                          } else {
                            System.gc();
                            ((wl) this).field_l = kh.a(-109);
                            break L30;
                          }
                        }
                      }
                      ((wl) this).field_hb = param0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.LA(" + param0 + ')');
        }
    }

    final void c(int param0, int param1) {
        try {
            bg.field_a[0] = (float)pg.a(16711680, param1) / 16711680.0f;
            bg.field_a[1] = (float)pg.a(65280, param1) / 65280.0f;
            bg.field_a[param0] = (float)pg.a(255, param1) / 255.0f;
            bg.field_a[3] = (float)(param1 >>> 336202712) / 255.0f;
            jaggl.OpenGL.glTexEnvfv(8960, 8705, bg.field_a, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.EC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void i(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 44) {
                break L1;
              } else {
                ((wl) this).field_E = 48;
                break L1;
              }
            }
            ((wl) this).field_pb[14] = ((wl) this).field_ab;
            ((wl) this).field_pb[10] = ((wl) this).field_fb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.OC(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_O != param0) {
                this.h(-114);
                this.a(false, false);
                this.b(false, (byte) -125);
                this.c(false, -128);
                this.a(false, (byte) -28);
                ((wl) this).a((rt) null, param0);
                this.g(-2, 103);
                ((wl) this).a(1, (byte) -39);
                ((wl) this).field_O = 1;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.IB(" + param0 + ')');
        }
    }

    private final void a(up param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_Y < 0) {
                break L1;
              } else {
                if (param0 == ((wl) this).field_ob[((wl) this).field_Y]) {
                  L2: {
                    int fieldTemp$2 = ((wl) this).field_Y;
                    ((wl) this).field_Y = ((wl) this).field_Y - 1;
                    ((wl) this).field_ob[fieldTemp$2] = null;
                    param0.b((byte) -128);
                    if (param1 > 7) {
                      break L2;
                    } else {
                      ((wl) this).field_ac = true;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (((wl) this).field_Y >= 0) {
                        break L4;
                      } else {
                        ((wl) this).field_qb = null;
                        if (!AceOfSkies.field_G) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((wl) this).field_qb = ((wl) this).field_ob[((wl) this).field_Y];
                    ((wl) this).field_qb.c(-1122);
                    break L3;
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("wl.LB(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -28) {
                break L1;
              } else {
                ((wl) this).field_D = -1.1227154731750488f;
                break L1;
              }
            }
            L2: {
              if (param0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              if (stackIn_7_0 == (((wl) this).field_uc ? 1 : 0)) {
                ((wl) this).field_uc = param0;
                this.r(param1 ^ 102);
                ((wl) this).field_O = ((wl) this).field_O & -32;
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.EB(" + param0 + ',' + param1 + ')');
        }
    }

    final void c() {
        RuntimeException runtimeException = null;
        wf var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var1 = ((wl) this).field_jb.d(268435455);
            L1: while (true) {
              L2: {
                L3: {
                  if (var1 == null) {
                    break L3;
                  } else {
                    ((im) (Object) var1).a(-125);
                    var1 = ((wl) this).field_jb.b((byte) 103);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (((wl) this).field_pc == null) {
                  break L2;
                } else {
                  ((wl) this).field_pc.a(1);
                  break L2;
                }
              }
              L4: {
                if (((wl) this).field_kc != null) {
                  this.f(8960);
                  var1_ref = ((wl) this).field_R.keys();
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (!var1_ref.hasMoreElements()) {
                          break L7;
                        } else {
                          var2 = (java.awt.Canvas) var1_ref.nextElement();
                          var3 = (Long) ((wl) this).field_R.get((Object) (Object) var2);
                          ((wl) this).field_kc.releaseSurface(var2, var3.longValue());
                          if (var4 != 0) {
                            break L6;
                          } else {
                            if (var4 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      ((wl) this).field_kc.release();
                      break L6;
                    }
                    ((wl) this).field_kc = null;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L8: {
                if (!((wl) this).field_S) {
                  break L8;
                } else {
                  da.a(120, true, false);
                  ((wl) this).field_S = false;
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "wl.S()");
        }
    }

    final synchronized void a(byte param0, int param1) {
        iq var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -85) {
                break L1;
              } else {
                this.r(8);
                break L1;
              }
            }
            var3 = new iq(param1);
            ((wl) this).field_zb.a(118, (wf) (Object) var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3_ref, "wl.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        float var7_float = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7_float = 0.3499999940395355f + (float)param0;
              var8 = (float)param1 + 0.3499999940395355f;
              var9 = -1.0f + (var7_float + (float)param2);
              var10 = -1.0f + (var8 + (float)param3);
              this.j(1);
              ((wl) this).b((byte) -124, param5);
              jaggl.OpenGL.glColor4ub((byte)(param4 >> -1199065968), (byte)(param4 >> -516294904), (byte)param4, (byte)(param4 >> 1702528024));
              if (((wl) this).field_I) {
                jaggl.OpenGL.glDisable(32925);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              jaggl.OpenGL.glBegin(2);
              jaggl.OpenGL.glVertex2f(var7_float, var8);
              jaggl.OpenGL.glVertex2f(var7_float, var10);
              jaggl.OpenGL.glVertex2f(var9, var10);
              jaggl.OpenGL.glVertex2f(var9, var8);
              jaggl.OpenGL.glEnd();
              if (((wl) this).field_I) {
                jaggl.OpenGL.glEnable(32925);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "wl.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void d(byte param0) {
        try {
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glLoadMatrixf(((wl) this).field_pb, 0);
            jaggl.OpenGL.glMatrixMode(5888);
            if (param0 <= 30) {
                this.a(false, -1, (byte) 62, true);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.VA(" + param0 + ')');
        }
    }

    private final void a(byte param0, up param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_fc < 0) {
                break L1;
              } else {
                if (((wl) this).field_Fc[((wl) this).field_fc] == param1) {
                  int fieldTemp$2 = ((wl) this).field_fc;
                  ((wl) this).field_fc = ((wl) this).field_fc - 1;
                  ((wl) this).field_Fc[fieldTemp$2] = null;
                  param1.a((byte) 97);
                  if (param0 == -94) {
                    L2: {
                      L3: {
                        if (0 <= ((wl) this).field_fc) {
                          break L3;
                        } else {
                          ((wl) this).field_Rb = null;
                          if (!AceOfSkies.field_G) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((wl) this).field_Rb = ((wl) this).field_Fc[((wl) this).field_fc];
                      ((wl) this).field_Rb.c((byte) 109);
                      break L2;
                    }
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("wl.BD(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    private final void r(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 70 % ((param0 - -17) / 58);
                if (!((wl) this).field_uc) {
                  break L2;
                } else {
                  if (!((wl) this).field_p) {
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            jaggl.OpenGL.glDepthMask(stackIn_7_0 != 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "wl.ID(" + param0 + ')');
        }
    }

    final int e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            if (param1 == 6406) {
              break L0;
            } else {
              if (param1 != 6409) {
                L1: {
                  if (param1 == 6410) {
                    break L1;
                  } else {
                    if (param1 == 34846) {
                      break L1;
                    } else {
                      if (34844 == param1) {
                        break L1;
                      } else {
                        if (param1 == 6407) {
                          stackOut_38_0 = 3;
                          stackIn_39_0 = stackOut_38_0;
                          return stackIn_39_0;
                        } else {
                          L2: {
                            if (6408 == param1) {
                              break L2;
                            } else {
                              if (param1 == 34847) {
                                break L2;
                              } else {
                                if (param1 != 34843) {
                                  if (param1 != 34842) {
                                    if (6402 != param1) {
                                      if (param1 != 6401) {
                                        L3: {
                                          if (param0 == -32334) {
                                            break L3;
                                          } else {
                                            ((wl) this).field_Vb = null;
                                            break L3;
                                          }
                                        }
                                        throw new IllegalArgumentException("");
                                      } else {
                                        stackOut_34_0 = 1;
                                        stackIn_35_0 = stackOut_34_0;
                                        return stackIn_35_0;
                                      }
                                    } else {
                                      stackOut_31_0 = 3;
                                      stackIn_32_0 = stackOut_31_0;
                                      return stackIn_32_0;
                                    }
                                  } else {
                                    stackOut_28_0 = 8;
                                    stackIn_29_0 = stackOut_28_0;
                                    return stackIn_29_0;
                                  }
                                } else {
                                  stackOut_25_0 = 6;
                                  stackIn_26_0 = stackOut_25_0;
                                  return stackIn_26_0;
                                }
                              }
                            }
                          }
                          stackOut_36_0 = 4;
                          stackIn_37_0 = stackOut_36_0;
                          return stackIn_37_0;
                        }
                      }
                    }
                  }
                }
                stackOut_40_0 = 2;
                stackIn_41_0 = stackOut_40_0;
                return stackIn_41_0;
              } else {
                break L0;
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_5_0 = stackOut_4_0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.FD(" + param0 + ',' + param1 + ')');
        }
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        float var7_float = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7_float = (float)param0 + 0.3499999940395355f;
              var8 = (float)param1 + 0.3499999940395355f;
              var9 = var7_float + (float)param2;
              this.j(1);
              var10 = var8 + (float)param3;
              ((wl) this).b((byte) -118, param5);
              jaggl.OpenGL.glColor4ub((byte)(param4 >> -595524080), (byte)(param4 >> 1025208104), (byte)param4, (byte)(param4 >> -265091240));
              if (!((wl) this).field_I) {
                break L1;
              } else {
                jaggl.OpenGL.glDisable(32925);
                break L1;
              }
            }
            L2: {
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glVertex2f(var7_float, var8);
              jaggl.OpenGL.glVertex2f(var7_float, var10);
              jaggl.OpenGL.glVertex2f(var9, var10);
              jaggl.OpenGL.glVertex2f(var9, var8);
              jaggl.OpenGL.glEnd();
              if (((wl) this).field_I) {
                jaggl.OpenGL.glEnable(32925);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "wl.aa(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void u(int param0) {
        float[] var2 = null;
        RuntimeException var2_ref = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = ((wl) this).field_pb;
              var3 = (float)(((wl) this).field_db * -((wl) this).field_Ib) / (float)((wl) this).field_ub;
              var4 = (float)((-((wl) this).field_Ib + ((wl) this).field_ec) * ((wl) this).field_db) / (float)((wl) this).field_ub;
              var5 = (float)(((wl) this).field_db * ((wl) this).field_jc) / (float)((wl) this).field_mc;
              var6 = (float)(((wl) this).field_db * (-((wl) this).field_bb + ((wl) this).field_jc)) / (float)((wl) this).field_mc;
              if (param0 == 3) {
                break L1;
              } else {
                ((wl) this).field_Eb = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var4 == var3) {
                  break L3;
                } else {
                  if (var5 == var6) {
                    break L3;
                  } else {
                    var7 = 2.0f * (float)((wl) this).field_db;
                    var2[5] = var7 / (-var6 + var5);
                    var2[7] = 0.0f;
                    var2[2] = 0.0f;
                    var2[12] = 0.0f;
                    var2[1] = 0.0f;
                    var2[13] = 0.0f;
                    var2[4] = 0.0f;
                    var2[8] = (var3 + var4) / (var4 - var3);
                    var2[15] = 0.0f;
                    var2[9] = (var5 + var6) / (-var6 + var5);
                    var2[0] = var7 / (var4 - var3);
                    var2[3] = 0.0f;
                    ((wl) this).field_fb = (float)(-(((wl) this).field_Ob + ((wl) this).field_db)) / (float)(-((wl) this).field_db + ((wl) this).field_Ob);
                    var2[10] = (float)(-(((wl) this).field_Ob + ((wl) this).field_db)) / (float)(-((wl) this).field_db + ((wl) this).field_Ob);
                    ((wl) this).field_ab = -((float)((wl) this).field_Ob * var7) / (float)(-((wl) this).field_db + ((wl) this).field_Ob);
                    var2[14] = -((float)((wl) this).field_Ob * var7) / (float)(-((wl) this).field_db + ((wl) this).field_Ob);
                    var2[11] = -1.0f;
                    var2[6] = 0.0f;
                    if (!AceOfSkies.field_G) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var2[4] = 0.0f;
              var2[15] = 1.0f;
              var2[7] = 0.0f;
              var2[10] = 1.0f;
              var2[6] = 0.0f;
              var2[8] = 0.0f;
              var2[13] = 0.0f;
              var2[9] = 0.0f;
              var2[5] = 1.0f;
              var2[12] = 0.0f;
              var2[3] = 0.0f;
              var2[11] = 0.0f;
              var2[1] = 0.0f;
              var2[0] = 1.0f;
              var2[2] = 0.0f;
              var2[14] = 0.0f;
              break L2;
            }
            this.i(121);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2_ref, "wl.DB(" + param0 + ')');
        }
    }

    final fq a(byte param0, int param1, byte[] param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        lk stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        om stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_9_0 = null;
        om stackOut_14_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!((wl) this).field_M) {
                break L1;
              } else {
                L2: {
                  if (!param4) {
                    break L2;
                  } else {
                    if (((wl) this).field_xb) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = new lk((wl) this, param1, param2, param3, param4);
                stackIn_10_0 = stackOut_9_0;
                return (fq) (Object) stackIn_10_0;
              }
            }
            if (param0 == -49) {
              stackOut_14_0 = new om((wl) this, param1, param2, param3);
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              stackOut_12_0 = null;
              stackIn_13_0 = stackOut_12_0;
              return (fq) (Object) stackIn_13_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("wl.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ',' + param4 + ')');
        }
        return (fq) (Object) stackIn_15_0;
    }

    final pa a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        tm stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        tm stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new tm((wl) this, param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("wl.O(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (pa) (Object) stackIn_1_0;
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        float var2_float = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_float = (float)(-((wl) this).field_Ib) * ((wl) this).field_sc / (float)((wl) this).field_ub;
              var3 = (float)(-((wl) this).field_jc) * ((wl) this).field_sc / (float)((wl) this).field_mc;
              var4 = ((wl) this).field_sc * (float)(((wl) this).field_ec + -((wl) this).field_Ib) / (float)((wl) this).field_ub;
              var5 = (float)(((wl) this).field_bb + -((wl) this).field_jc) * ((wl) this).field_sc / (float)((wl) this).field_mc;
              jaggl.OpenGL.glMatrixMode(5889);
              jaggl.OpenGL.glLoadIdentity();
              if (var4 == var2_float) {
                break L1;
              } else {
                if (var5 != var3) {
                  jaggl.OpenGL.glOrtho((double)var2_float, (double)var4, (double)(-var5), (double)(-var3), (double)((wl) this).field_db, (double)((wl) this).field_Ob);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            jaggl.OpenGL.glMatrixMode(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "wl.WC(" + param0 + ')');
        }
    }

    final boolean c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 16) {
              stackOut_3_0 = ((wl) this).field_vb.a((byte) -118, 3);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.OA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void q(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!((wl) this).field_Bc) {
                break L1;
              } else {
                jaggl.OpenGL.glMatrixMode(5890);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glMatrixMode(5888);
                ((wl) this).field_Bc = false;
                break L1;
              }
            }
            var2_int = -124 % ((param0 - 6) / 58);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.QC(" + param0 + ')');
        }
    }

    final void a(float param0, float param1, int param2) {
        ((wl) this).field_D = param0;
        if (param2 < 8) {
            return;
        }
        try {
            ((wl) this).field_Zb = param1;
            this.k(-91);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.SB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((wl) this).field_t = -((wl) this).field_Zb + (float)(((wl) this).field_Ob - ((wl) this).field_oc);
              ((wl) this).field_Tb = ((wl) this).field_t - (float)((wl) this).field_C * ((wl) this).field_D;
              if ((float)((wl) this).field_db > ((wl) this).field_Tb) {
                ((wl) this).field_Tb = (float)((wl) this).field_db;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 <= -83) {
                break L2;
              } else {
                ((wl) this).field_G = true;
                break L2;
              }
            }
            jaggl.OpenGL.glFogf(2915, ((wl) this).field_Tb);
            jaggl.OpenGL.glFogf(2916, ((wl) this).field_t);
            bg.field_a[2] = (float)pg.a(255, ((wl) this).field_F) / 255.0f;
            bg.field_a[1] = (float)pg.a(((wl) this).field_F, 65280) / 65280.0f;
            bg.field_a[0] = (float)pg.a(((wl) this).field_F, 16711680) / 16711680.0f;
            jaggl.OpenGL.glFogfv(2918, bg.field_a, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.HC(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == ((wl) this).field_Pb) {
                break L1;
              } else {
                jaggl.OpenGL.glActiveTexture(param1 + 33984);
                ((wl) this).field_Pb = param1;
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                ((wl) this).field_mb = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.LC(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) throws lp {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                ((wl) this).field_kc.swapBuffers();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3_ref, "wl.QA(" + param0 + ',' + param1 + ')');
        }
    }

    final sm a(ra param0, gd param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("wl.G(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return (sm) (Object) stackIn_1_0;
    }

    final synchronized void c(int param0, int param1, int param2) {
        iq var4 = null;
        try {
            var4 = new iq(param1);
            var4.field_b = (long)param0;
            int var5 = 112 % ((param2 - -54) / 58);
            ((wl) this).field_nb.a(96, (wf) (Object) var4);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.VC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int t(int param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            rb var1_ref2 = null;
            int var1_int = 0;
            int stackIn_7_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_56_0 = 0;
            int stackIn_58_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_57_0 = 0;
            try {
              if (ul.field_r.field_j >= 4) {
                if (ul.field_r.field_e == -1) {
                  stackOut_6_0 = 3;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (ul.field_r.field_e != -2) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    stackOut_9_0 = 4;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              } else {
                L0: {
                  if (bm.field_z == 0) {
                    wu.field_l = cs.field_d.a(2, hi.field_x, l.field_f);
                    bm.field_z = bm.field_z + 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (bm.field_z != 1) {
                    break L1;
                  } else {
                    if (wu.field_l.field_a == 2) {
                      stackOut_23_0 = tj.a(-112, -1);
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0;
                    } else {
                      if (wu.field_l.field_a != 1) {
                        break L1;
                      } else {
                        bm.field_z = bm.field_z + 1;
                        break L1;
                      }
                    }
                  }
                }
                if (param0 == 19078) {
                  L2: {
                    if (2 == bm.field_z) {
                      du.field_m = new vf((java.net.Socket) wu.field_l.field_f, cs.field_d);
                      var1_ref2 = new rb(13);
                      tr.a(var1_ref2, uk.field_g, ob.field_e, nm.field_b, 0);
                      var1_ref2.b(-1336879960, 15);
                      var1_ref2.a((byte) 20, si.field_c);
                      du.field_m.a(13, 0, 41, var1_ref2.field_f);
                      bm.field_z = bm.field_z + 1;
                      gb.field_j = 30000L + kh.a(-70);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (bm.field_z != 3) {
                      break L3;
                    } else {
                      L4: {
                        if (du.field_m.b(-120) <= 0) {
                          break L4;
                        } else {
                          var1_int = du.field_m.a((byte) -116);
                          if (var1_int != 0) {
                            stackOut_42_0 = tj.a(92, var1_int);
                            stackIn_43_0 = stackOut_42_0;
                            return stackIn_43_0;
                          } else {
                            bm.field_z = bm.field_z + 1;
                            if (!AceOfSkies.field_G) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (~kh.a(-116) < ~gb.field_j) {
                        stackOut_50_0 = tj.a(-126, -2);
                        stackIn_51_0 = stackOut_50_0;
                        return stackIn_51_0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (4 != bm.field_z) {
                    stackOut_55_0 = -1;
                    stackIn_56_0 = stackOut_55_0;
                    return stackIn_56_0;
                  } else {
                    ul.field_r.a(param0 ^ 16696, rs.field_C, (Object) (Object) du.field_m);
                    wu.field_l = null;
                    bm.field_z = 0;
                    du.field_m = null;
                    stackOut_53_0 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    return stackIn_54_0;
                  }
                } else {
                  stackOut_29_0 = -63;
                  stackIn_30_0 = stackOut_29_0;
                  return stackIn_30_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (IOException) (Object) decompiledCaughtException;
              stackOut_57_0 = tj.a(107, -3);
              stackIn_58_0 = stackOut_57_0;
              return stackIn_58_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw pn.a((Throwable) (Object) var1_ref, "wl.AA(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(boolean param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_ac != param0) {
                ((wl) this).field_ac = param0;
                this.b((byte) -67);
                ((wl) this).field_O = ((wl) this).field_O & -8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -125) {
                break L2;
              } else {
                ((wl) this).a((pa) null, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.KB(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean b() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "wl.F()");
        }
        return stackIn_1_0 != 0;
    }

    final void a(float param0, float param1, float param2, float param3, byte param4) {
        bg.field_a[1] = param1;
        bg.field_a[2] = param0;
        bg.field_a[0] = param2;
        if (param4 != 35) {
            return;
        }
        try {
            bg.field_a[3] = param3;
            jaggl.OpenGL.glTexEnvfv(8960, 8705, bg.field_a, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.FB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glTexEnvi(8960, 34184 + param2, param1);
              if (param3 > 74) {
                break L1;
              } else {
                ((wl) this).field_gb = null;
                break L1;
              }
            }
            jaggl.OpenGL.glTexEnvi(8960, param2 + 34200, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var5, "wl.WB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        iq var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -126) {
                break L1;
              } else {
                za discarded$2 = ((wl) this).c(27);
                break L1;
              }
            }
            var4 = new iq(param1);
            var4.field_b = (long)param2;
            ((wl) this).field_Gb.a(93, (wf) (Object) var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4_ref, "wl.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                wl.a((java.awt.Component) null, (byte) -81);
                break L1;
              }
            }
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) ua.field_d);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) ua.field_d);
            fb.field_a = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("wl.UB(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final boolean d() {
        RuntimeException var1 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((wl) this).field_yb == null) {
                  break L2;
                } else {
                  if (!((wl) this).field_yb.a(-118)) {
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "wl.A()");
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        try {
            jaggl.OpenGL.glTexEnvi(8960, param3 + param2, param0);
            jaggl.OpenGL.glTexEnvi(8960, 34192 - -param3, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void e() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!((wl) this).field_Eb) {
                break L1;
              } else {
                if (((wl) this).field_ec <= 0) {
                  break L1;
                } else {
                  if (0 >= ((wl) this).field_bb) {
                    break L1;
                  } else {
                    var1_int = ((wl) this).field_L;
                    var2 = ((wl) this).field_d;
                    var3 = ((wl) this).field_e;
                    var4 = ((wl) this).field_Q;
                    this.l(24643);
                    jaggl.OpenGL.glReadBuffer(1028);
                    jaggl.OpenGL.glDrawBuffer(1029);
                    this.p(65);
                    this.a(false, false);
                    this.b(false, (byte) -125);
                    this.c(false, -127);
                    this.a(false, (byte) -28);
                    ((wl) this).a((rt) null, 1);
                    this.g(-2, 126);
                    ((wl) this).a(1, (byte) -39);
                    ((wl) this).b((byte) -97, 0);
                    jaggl.OpenGL.glMatrixMode(5889);
                    jaggl.OpenGL.glLoadIdentity();
                    jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                    jaggl.OpenGL.glMatrixMode(5888);
                    jaggl.OpenGL.glLoadIdentity();
                    jaggl.OpenGL.glRasterPos2i(0, 0);
                    jaggl.OpenGL.glCopyPixels(0, 0, ((wl) this).field_ec, ((wl) this).field_bb, 6144);
                    jaggl.OpenGL.glFlush();
                    jaggl.OpenGL.glReadBuffer(1029);
                    jaggl.OpenGL.glDrawBuffer(1029);
                    ((wl) this).KA(var1_int, var3, var2, var4);
                    break L0;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "wl.V()");
        }
    }

    final void a(pa param0, boolean param1) {
        RuntimeException var3 = null;
        gt var3_ref = null;
        cu var3_ref2 = null;
        wt var4 = null;
        gt var5 = null;
        cu var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ((wl) this).field_j = (tm) (Object) param0;
              if (((wl) this).field_A) {
                L2: {
                  if (null == ((wl) this).field_y) {
                    ((wl) this).field_y = new wj((wl) this);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if ((Object) (Object) ((wl) this).field_qb != (Object) (Object) ((wl) this).field_y) {
                  L3: {
                    ((wl) this).a((up) (Object) ((wl) this).field_y, 32925);
                    if (!param1) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          var3_ref2 = (cu) (Object) ((wl) this).field_s.a((byte) 106, (long)(((wl) this).field_j.a() << -1671693488 | ((wl) this).field_j.b()));
                          if (null == var3_ref2) {
                            var3_ref2 = new cu((wl) this, 6402, ((wl) this).field_j.a(), ((wl) this).field_j.b());
                            ((wl) this).field_rb = ((wl) this).field_rb + var3_ref2.field_o;
                            L6: while (true) {
                              L7: {
                                if (((wl) this).field_rb <= 2097152) {
                                  break L7;
                                } else {
                                  var4 = ((wl) this).field_Ec.a(3);
                                  if (var6 != 0) {
                                    break L4;
                                  } else {
                                    if (null == var4) {
                                      break L7;
                                    } else {
                                      var5_ref = (cu) (Object) var4;
                                      var5_ref.d(-128);
                                      var5_ref.c(-126);
                                      var5_ref.d((byte) -108);
                                      ((wl) this).field_rb = ((wl) this).field_rb - var5_ref.field_o;
                                      if (var6 == 0) {
                                        continue L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                              ((wl) this).field_s.a(106, (long)(((wl) this).field_j.a() << -1176907408 | ((wl) this).field_j.b()), (wf) (Object) var3_ref2);
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        ((wl) this).field_Ec.a((wt) (Object) var3_ref2, (byte) 123);
                        break L4;
                      }
                      ((wl) this).field_y.a(var3_ref2, 8, (byte) 119);
                      break L3;
                    }
                  }
                  ((wl) this).field_y.a(0, (nr) (Object) ((wl) this).field_j.field_j, -5531);
                  break L1;
                } else {
                  throw new RuntimeException();
                }
              } else {
                L8: {
                  if (!((wl) this).field_Mb) {
                    break L8;
                  } else {
                    L9: {
                      L10: {
                        var3_ref = (gt) (Object) ((wl) this).field_s.a((byte) 106, (long)(((wl) this).field_j.a() << 1788082032 | ((wl) this).field_j.b()));
                        if (null != var3_ref) {
                          break L10;
                        } else {
                          var3_ref = new gt((wl) this, ((wl) this).field_j.a(), ((wl) this).field_j.b());
                          ((wl) this).field_rb = ((wl) this).field_rb + var3_ref.field_n * 4;
                          L11: while (true) {
                            L12: {
                              if (((wl) this).field_rb <= 2097152) {
                                break L12;
                              } else {
                                var4 = ((wl) this).field_Ec.a(3);
                                if (var6 != 0) {
                                  break L9;
                                } else {
                                  L13: {
                                    if (var4 != null) {
                                      break L13;
                                    } else {
                                      if (var6 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var5 = (gt) (Object) var4;
                                  var5.d(-127);
                                  var5.c(-126);
                                  ((wl) this).field_kc.releasePbuffer(var5.f(25766));
                                  ((wl) this).field_rb = ((wl) this).field_rb - var5.field_n;
                                  if (var6 == 0) {
                                    continue L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            ((wl) this).field_s.a(115, (long)(((wl) this).field_j.a() << -218937200 | ((wl) this).field_j.b()), (wf) (Object) var3_ref);
                            break L10;
                          }
                        }
                      }
                      ((wl) this).field_Ec.a((wt) (Object) var3_ref, (byte) 125);
                      ((wl) this).field_kc.setPbuffer(var3_ref.f(25766));
                      break L9;
                    }
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            }
            ((wl) this).field_ec = param0.a();
            ((wl) this).field_bb = param0.b();
            this.p(-123);
            this.o(0);
            this.l(24643);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var3;
            stackOut_45_1 = new StringBuilder().append("wl.R(");
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L14;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L14;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param1 + ')');
        }
    }

    final void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_A) {
                if ((Object) (Object) ((wl) this).field_qb == (Object) (Object) ((wl) this).field_y) {
                  ((wl) this).field_y.a(0, (byte) -54);
                  ((wl) this).field_y.a(8, (byte) -24);
                  ((wl) this).b((byte) -113, (up) (Object) ((wl) this).field_y);
                  break L1;
                } else {
                  throw new RuntimeException();
                }
              } else {
                L2: {
                  if (!((wl) this).field_Mb) {
                    break L2;
                  } else {
                    ((wl) this).field_j.b(((wl) this).field_ec, 0, 0, 0, 0, -14164, ((wl) this).field_bb);
                    boolean discarded$4 = ((wl) this).field_kc.setSurface(((wl) this).field_gc);
                    if (!AceOfSkies.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            }
            ((wl) this).field_bb = ((wl) this).field_Yb;
            ((wl) this).field_ec = ((wl) this).field_g;
            ((wl) this).field_j = null;
            this.p(47);
            this.o(0);
            this.l(24643);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "wl.JA()");
        }
    }

    private final void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == ((wl) this).field_tc) {
                break L1;
              } else {
                ((wl) this).field_tc = param1;
                this.n(-1);
                ((wl) this).field_O = ((wl) this).field_O & -32;
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                ((wl) this).c();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.HD(" + param0 + ',' + param1 + ')');
        }
    }

    final int[] Y() {
        RuntimeException var1 = null;
        int[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = new int[]{((wl) this).field_Ib, ((wl) this).field_jc, ((wl) this).field_ub, ((wl) this).field_mc};
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "wl.Y()");
        }
        return stackIn_1_0;
    }

    private final void h(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_N == 1) {
                break L1;
              } else {
                L2: {
                  jaggl.OpenGL.glMatrixMode(5889);
                  jaggl.OpenGL.glLoadIdentity();
                  if (0 >= ((wl) this).field_ec) {
                    break L2;
                  } else {
                    if (((wl) this).field_bb <= 0) {
                      break L2;
                    } else {
                      jaggl.OpenGL.glOrtho(0.0, (double)((wl) this).field_ec, (double)((wl) this).field_bb, 0.0, -1.0, 1.0);
                      break L2;
                    }
                  }
                }
                jaggl.OpenGL.glMatrixMode(5888);
                jaggl.OpenGL.glLoadIdentity();
                ((wl) this).field_N = 1;
                ((wl) this).field_O = ((wl) this).field_O & -25;
                break L1;
              }
            }
            L3: {
              if (param0 <= -49) {
                break L3;
              } else {
                field_m = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.ED(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        java.awt.Dimension var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((wl) this).field_Wb) {
                  break L2;
                } else {
                  ((wl) this).field_Yb = 0;
                  ((wl) this).field_g = 0;
                  if (!AceOfSkies.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = ((wl) this).field_Wb.getSize();
              ((wl) this).field_Yb = var2.height;
              ((wl) this).field_g = var2.width;
              break L1;
            }
            L3: {
              if (((wl) this).field_qb != null) {
                break L3;
              } else {
                ((wl) this).field_ec = ((wl) this).field_g;
                ((wl) this).field_bb = ((wl) this).field_Yb;
                this.o(0);
                break L3;
              }
            }
            L4: {
              this.p(-98);
              if (param0 == -11103) {
                break L4;
              } else {
                ((wl) this).f(-17, -62);
                break L4;
              }
            }
            this.l(24643);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2_ref, "wl.AD(" + param0 + ')');
        }
    }

    final void a(sm param0) {
    }

    final da a(vs param0, vd[] param1, boolean param2) {
        RuntimeException var4 = null;
        mu stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        mu stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            stackOut_0_0 = new mu((wl) this, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("wl.E(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return (da) (Object) stackIn_1_0;
    }

    private final int e(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String[] var4 = null;
        NumberFormatException var5 = null;
        int var5_int = 0;
        int[] var5_array = null;
        int var6 = 0;
        int stackIn_41_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              ((wl) this).field_B = jaggl.OpenGL.glGetString(7936).toLowerCase();
              ((wl) this).field_sb = jaggl.OpenGL.glGetString(7937).toLowerCase();
              if (((wl) this).field_B.indexOf("microsoft") != -1) {
                var2_int = var2_int | 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (((wl) this).field_B.indexOf("brian paul") != -1) {
                  break L3;
                } else {
                  if (((wl) this).field_B.indexOf("mesa") != -1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var2_int = var2_int | 1;
              break L2;
            }
            L4: {
              L5: {
                var3 = jaggl.OpenGL.glGetString(7938);
                var4 = ee.a((byte) 10, ' ', var3.replace('.', ' '));
                if (var4.length < 2) {
                  break L5;
                } else {
                  try {
                    L6: {
                      var5_int = td.a((CharSequence) (Object) var4[0], (byte) 38);
                      var6 = td.a((CharSequence) (Object) var4[1], (byte) 38);
                      ((wl) this).field_Z = var6 + 10 * var5_int;
                      decompiledRegionSelector0 = 0;
                      break L6;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L7: {
                      var5 = (NumberFormatException) (Object) decompiledCaughtException;
                      var2_int = var2_int | 4;
                      if (!AceOfSkies.field_G) {
                        decompiledRegionSelector0 = 0;
                        break L7;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L7;
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var2_int = var2_int | 4;
              break L4;
            }
            L8: {
              if (12 <= ((wl) this).field_Z) {
                break L8;
              } else {
                var2_int = var2_int | 2;
                break L8;
              }
            }
            L9: {
              if (((wl) this).field_kc.a("GL_ARB_multitexture")) {
                break L9;
              } else {
                var2_int = var2_int | 8;
                break L9;
              }
            }
            L10: {
              if (!((wl) this).field_kc.a("GL_ARB_texture_env_combine")) {
                var2_int = var2_int | 32;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var5_array = new int[1];
              jaggl.OpenGL.glGetIntegerv(34018, var5_array, 0);
              if (param0 == -94) {
                break L11;
              } else {
                ((wl) this).field_pc = null;
                break L11;
              }
            }
            L12: {
              L13: {
                ((wl) this).field_Xb = var5_array[0];
                jaggl.OpenGL.glGetIntegerv(34929, var5_array, 0);
                ((wl) this).field_Sb = var5_array[0];
                jaggl.OpenGL.glGetIntegerv(34930, var5_array, 0);
                ((wl) this).field_K = var5_array[0];
                if (((wl) this).field_Xb < 2) {
                  break L13;
                } else {
                  if (((wl) this).field_Sb < 2) {
                    break L13;
                  } else {
                    if (2 > ((wl) this).field_K) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              var2_int = var2_int | 16;
              break L12;
            }
            L14: {
              ((wl) this).field_V = jaclib.memory.Stream.b();
              ((wl) this).field_Mb = ((wl) this).field_kc.arePbuffersAvailable();
              ((wl) this).field_M = ((wl) this).field_kc.a("GL_ARB_vertex_buffer_object");
              ((wl) this).field_I = ((wl) this).field_kc.a("GL_ARB_multisample");
              ((wl) this).field_x = ((wl) this).field_kc.a("GL_ARB_vertex_program");
              boolean discarded$1 = ((wl) this).field_kc.a("GL_ARB_fragment_program");
              ((wl) this).field_v = ((wl) this).field_kc.a("GL_ARB_vertex_shader");
              ((wl) this).field_lc = ((wl) this).field_kc.a("GL_ARB_fragment_shader");
              ((wl) this).field_G = ((wl) this).field_kc.a("GL_EXT_texture3D");
              ((wl) this).field_u = ((wl) this).field_kc.a("GL_ARB_texture_rectangle");
              ((wl) this).field_nc = ((wl) this).field_kc.a("GL_ARB_texture_cube_map");
              ((wl) this).field_J = ((wl) this).field_kc.a("GL_ARB_texture_float");
              ((wl) this).field_Cc = false;
              ((wl) this).field_A = ((wl) this).field_kc.a("GL_EXT_framebuffer_object");
              ((wl) this).field_i = ((wl) this).field_kc.a("GL_EXT_framebuffer_blit");
              ((wl) this).field_Nb = ((wl) this).field_kc.a("GL_EXT_framebuffer_multisample");
              ((wl) this).field_eb = rr.field_b.startsWith("mac");
              jaggl.OpenGL.glGetFloatv(2834, bg.field_a, 0);
              if (var2_int == 0) {
                stackOut_40_0 = 0;
                stackIn_41_0 = stackOut_40_0;
                break L14;
              } else {
                stackOut_38_0 = var2_int;
                stackIn_41_0 = stackOut_38_0;
                break L14;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.NB(" + param0 + ')');
        }
        return stackIn_41_0;
    }

    private final void g(int param0, int param1) {
        try {
            this.a(param0, 4873, true);
            int var3_int = -24 % ((param1 - 44) / 50);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wl.UC(" + param0 + ',' + param1 + ')');
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.h(-59);
            ((wl) this).a((rt) null, 1);
            ((wl) this).b((byte) -118, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((wl) this).field_tb, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wl.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void b(up param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (((wl) this).field_fc < 3) {
              L1: {
                if (((wl) this).field_fc >= 0) {
                  ((wl) this).field_Fc[((wl) this).field_fc].a((byte) 125);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 >= 95) {
                  break L2;
                } else {
                  boolean discarded$4 = ((wl) this).c((byte) -104);
                  break L2;
                }
              }
              int fieldTemp$5 = ((wl) this).field_fc + 1;
              ((wl) this).field_fc = ((wl) this).field_fc + 1;
              ((wl) this).field_Fc[fieldTemp$5] = param0;
              ((wl) this).field_Rb = param0;
              ((wl) this).field_Rb.c((byte) 82);
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("wl.QB(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final gd a(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "wl.J(" + param0 + ',' + param1 + ')');
        }
        return (gd) (Object) stackIn_1_0;
    }

    final int i() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = ((wl) this).field_db;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "wl.i()");
        }
        return stackIn_1_0;
    }

    private final void p(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_N != 0) {
                ((wl) this).field_O = ((wl) this).field_O & -32;
                ((wl) this).field_N = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = 39 % ((param0 - -31) / 58);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.PB(" + param0 + ')');
        }
    }

    final za c(int param0) {
        im var2 = null;
        RuntimeException var2_ref = null;
        im stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        im stackOut_0_0 = null;
        try {
          L0: {
            var2 = new im(param0);
            ((wl) this).field_jb.a(87, (wf) (Object) var2);
            stackOut_0_0 = (im) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2_ref, "wl.B(" + param0 + ')');
        }
        return (za) (Object) stackIn_1_0;
    }

    private final void x(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((wl) this).field_bc = new rt[((wl) this).field_Xb];
              ((wl) this).field_Vb = new nr((wl) this, 3553, 6408, 1, 1);
              nr discarded$27 = new nr((wl) this, 3553, 6408, 1, 1);
              nr discarded$28 = new nr((wl) this, 3553, 6408, 1, 1);
              if (param0 == -26394) {
                break L1;
              } else {
                ((wl) this).field_Bc = false;
                break L1;
              }
            }
            L2: {
              nb discarded$29 = new nb((wl) this);
              nb discarded$30 = new nb((wl) this);
              nb discarded$31 = new nb((wl) this);
              nb discarded$32 = new nb((wl) this);
              nb discarded$33 = new nb((wl) this);
              nb discarded$34 = new nb((wl) this);
              nb discarded$35 = new nb((wl) this);
              nb discarded$36 = new nb((wl) this);
              nb discarded$37 = new nb((wl) this);
              nb discarded$38 = new nb((wl) this);
              if (((wl) this).field_A) {
                ((wl) this).field_o = new wj((wl) this);
                wj discarded$39 = new wj((wl) this);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "wl.GC(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ub = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        field_zc = "MY HIGHSCORES";
        field_m = new int[2];
    }
}
