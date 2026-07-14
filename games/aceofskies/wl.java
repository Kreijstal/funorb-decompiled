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
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        pa var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          var9 = AceOfSkies.field_G ? 1 : 0;
          var10 = new int[((vd) param0).field_h * ((vd) param0).field_c];
          var14 = var10;
          var13 = var14;
          var12 = var13;
          var11 = var12;
          var3 = var11;
          var4 = 0;
          var5 = 0;
          if (((vd) param0).field_e != null) {
            var6_int = 0;
            L1: while (true) {
              if ((var6_int ^ -1) <= (((vd) param0).field_c ^ -1)) {
                break L0;
              } else {
                var7 = 0;
                L2: while (true) {
                  if (((vd) param0).field_h <= var7) {
                    var6_int++;
                    continue L1;
                  } else {
                    var5++;
                    var3[var5] = vo.a(((vd) param0).field_f[pg.a(255, (int) ((vd) param0).field_d[var4])], ((vd) param0).field_e[var4] << -1389705736);
                    var4++;
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var6_int = 0;
            L3: while (true) {
              if ((var6_int ^ -1) <= (((vd) param0).field_c ^ -1)) {
                break L0;
              } else {
                var7 = 0;
                L4: while (true) {
                  if ((((vd) param0).field_h ^ -1) >= (var7 ^ -1)) {
                    var6_int++;
                    continue L3;
                  } else {
                    L5: {
                      var4++;
                      var8 = ((vd) param0).field_f[((vd) param0).field_d[var4] & 255];
                      var5++;
                      stackOut_5_0 = (int[]) var10;
                      stackOut_5_1 = var5;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if ((var8 ^ -1) == -1) {
                        stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        break L5;
                      } else {
                        stackOut_6_0 = (int[]) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = vo.a(var8, -16777216);
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L5;
                      }
                    }
                    stackIn_8_0[stackIn_8_1] = stackIn_8_2;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        var6 = ((wl) this).a(97, ((vd) param0).field_c, var14, 0, ((vd) param0).field_h, ((vd) param0).field_h);
        var6.a(((vd) param0).field_a, ((vd) param0).field_i, ((vd) param0).field_g, ((vd) param0).field_b);
        return var6;
    }

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (param0 != ((wl) this).field_db) {
              break L1;
            } else {
              if ((((wl) this).field_Ob ^ -1) != (param1 ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ((wl) this).field_db = param0;
          ((wl) this).field_Ob = param1;
          this.u(3);
          this.k(-107);
          if (((wl) this).field_N == 3) {
            this.d(5888);
            break L0;
          } else {
            if (2 == ((wl) this).field_N) {
              this.d((byte) 125);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    final int[] a(int param0, int param1, byte param2, int param3, int param4) {
        int var7 = 0;
        int var8 = AceOfSkies.field_G ? 1 : 0;
        if (param2 != -78) {
            up var9 = (up) null;
            this.a((up) null, (byte) -74);
        }
        int[] var10 = new int[param3 * param1];
        int[] var6 = var10;
        for (var7 = 0; (param1 ^ -1) < (var7 ^ -1); var7++) {
            jaggl.OpenGL.glReadPixelsi(param0, -param4 + (((wl) this).field_bb - var7), param3, 1, 32993, ((wl) this).field_tb, var10, var7 * param3);
        }
        return var10;
    }

    private final void a(int param0, int param1, boolean param2) {
        this.a(true, param0, (byte) 125, param2);
        if (param1 != 4873) {
            ((wl) this).c(80, -100);
        }
    }

    final void a(rt param0, int param1) {
        rt var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (param1 == 1) {
          L0: {
            var3 = ((wl) this).field_bc[((wl) this).field_Pb];
            if (param0 != var3) {
              L1: {
                if (param0 == null) {
                  jaggl.OpenGL.glDisable(((rt) var3).field_f);
                  break L1;
                } else {
                  L2: {
                    if (var3 == null) {
                      jaggl.OpenGL.glEnable(((rt) param0).field_f);
                      break L2;
                    } else {
                      if ((((rt) param0).field_f ^ -1) != (((rt) var3).field_f ^ -1)) {
                        jaggl.OpenGL.glDisable(((rt) var3).field_f);
                        jaggl.OpenGL.glEnable(((rt) param0).field_f);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  jaggl.OpenGL.glBindTexture(((rt) param0).field_f, param0.a(125));
                  break L1;
                }
              }
              ((wl) this).field_bc[((wl) this).field_Pb] = param0;
              break L0;
            } else {
              break L0;
            }
          }
          ((wl) this).field_O = ((wl) this).field_O & -2;
          return;
        } else {
          return;
        }
    }

    private final void m(int param0) {
        if (param0 != 5149) {
            ((wl) this).c(-102, -84);
        }
    }

    wl(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        Throwable var4 = null;
        int var4_int = 0;
        Throwable var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object[] var8 = null;
        String[] var8_array = null;
        int var9 = 0;
        String var10 = null;
        Exception var11 = null;
        String var13 = null;
        int[] var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        CharSequence var21 = null;
        CharSequence var22 = null;
        CharSequence var23 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = null;
                    var20 = null;
                    ((wl) this).field_R = new Hashtable();
                    ((wl) this).field_Ab = 128;
                    ((wl) this).field_q = new jk();
                    tj discarded$4 = new tj();
                    tj discarded$5 = new tj();
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
                    tj discarded$6 = new tj();
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
                    du discarded$7 = new du(8192);
                    ((wl) this).field_Wb = param0;
                    ((wl) this).field_Hb = param2;
                    if (ei.a("jaclib", (byte) -16)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    throw new RuntimeException("");
                }
                case 2: {
                    if (ei.a("jaggl", (byte) -16)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    throw new RuntimeException("");
                }
                case 4: {
                    try {
                        ((wl) this).field_kc = new jaggl.OpenGL();
                        ((wl) this).field_Db = ((wl) this).field_kc.init(param0, 8, 8, 8, 24, 0, ((wl) this).field_Hb);
                        ((wl) this).field_gc = ((wl) this).field_kc.init(param0, 8, 8, 8, 24, 0, ((wl) this).field_Hb);
                        if (0L != ((wl) this).field_Db) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.b(false);
                        var4_int = this.e((byte) -94);
                        if (-1 == (var4_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (!((wl) this).field_V) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 33639;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 5121;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((wl) this).field_tb = stackIn_11_1;
                        if ((((wl) this).field_sb.indexOf("radeon") ^ -1) == 0) {
                            statePc = 45;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        var7 = 0;
                        var8_array = ee.a((byte) 10, ' ', ((wl) this).field_sb.replace('/', ' '));
                        var9 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8_array.length <= var9) {
                            statePc = 33;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var13 = var8_array[var9];
                        var10 = var13;
                        var10 = var13;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var13.length() > 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (120 != var13.charAt(0)) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var13.length() < 3) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var21 = (CharSequence) var13.substring(1, 3);
                        if (!vl.a(10, var21)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = 1;
                        var10 = var13.substring(1);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var10.equals((Object) (Object) "hd")) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!var10.startsWith("hd")) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var6 = 1;
                        var10 = var10.substring(2);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = (stateCaught_26 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var10.length() < 4) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var22 = (CharSequence) var10.substring(0, 4);
                        if (!vl.a(10, var22)) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var23 = (CharSequence) var10.substring(0, 4);
                        var5_int = td.a(var23, (byte) 38);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 31 : 59);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = (Exception) (Object) caughtException;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var6 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var5_int ^ -1) <= -4001) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((wl) this).field_J = false;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var7 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var6 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var5_int ^ -1) > -7001) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (7999 < var5_int) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((wl) this).field_M = false;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var5_int ^ -1) > -7001) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5_int > 9250) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((wl) this).field_G = false;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((wl) this).field_u = ((wl) this).field_u & ((wl) this).field_kc.a("GL_ARB_half_float_pixel");
                        ((wl) this).field_xb = ((wl) this).field_M;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((((wl) this).field_B.indexOf("intel") ^ -1) == 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((wl) this).field_A = false;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = this;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_48_0 = stackOut_47_0;
                        if (((wl) this).field_B.equals((Object) (Object) "s3 graphics")) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = this;
                        stackOut_48_1 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = this;
                        stackOut_49_1 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((wl) this).field_Eb = stackIn_50_1 != 0;
                        if (!((wl) this).field_M) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var17 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var5 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        fr.a(false, 0, true);
                        ((wl) this).field_S = true;
                        ((wl) this).field_X = new eb((wl) this, ((wl) this).field_a);
                        this.x(-26394);
                        ((wl) this).field_cc = new cs((wl) this);
                        ((wl) this).field_pc = new lu((wl) this);
                        if (!((wl) this).field_pc.b(1)) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((wl) this).field_yb = new hp((wl) this);
                        if (((wl) this).field_yb.e(0)) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ((wl) this).field_yb.a((byte) -31);
                        ((wl) this).field_yb = null;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ((wl) this).field_vb = new vr((wl) this);
                        this.f((byte) -66);
                        this.s(-11103);
                        ((wl) this).e();
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var4 = caughtException;
                    var4.printStackTrace();
                    ((wl) this).c();
                    throw new RuntimeException("");
                }
                case 60: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(boolean param0) {
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0) {
            this.d(56);
        }
        int var2 = 0;
        while (!((wl) this).field_kc.b()) {
            var2++;
            if (!(var2 <= 5)) {
                throw new RuntimeException("");
            }
            wf.a(1000L, false);
        }
    }

    private final void a(float param0, float param1, float param2, int param3) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (((wl) this).field_Bc) {
            jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param1, param2, param0);
        jaggl.OpenGL.glMatrixMode(param3);
        ((wl) this).field_Bc = true;
    }

    final void K(int[] param0) {
        param0[3] = ((wl) this).field_Q;
        param0[0] = ((wl) this).field_L;
        param0[2] = ((wl) this).field_d;
        param0[1] = ((wl) this).field_e;
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var9 = 0.0f;
        this.j(1);
        ((wl) this).b((byte) -122, param5);
        float var7 = (float)param2 - (float)param0;
        float var8 = (float)param3 - (float)param1;
        if (0.0f == var7) {
            // ifne L48
            var7 = 1.0f;
        } else {
            var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var8 = var8 * var9;
            var7 = var7 * var9;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 1863956528), (byte)(param4 >> 880821000), (byte)param4, (byte)(param4 >> 928589304));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param0, (float)param1 + 0.3499999940395355f);
        jaggl.OpenGL.glVertex2f(var7 + (float)param2 + 0.3499999940395355f, 0.3499999940395355f + (var8 + (float)param3));
        jaggl.OpenGL.glEnd();
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var5 = 40 / ((69 - param2) / 47);
        iq var4 = new iq(param1);
        var4.field_b = (long)param0;
        ((wl) this).field_Ac.a(80, (wf) (Object) var4);
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if ((((wl) this).field_bb ^ -1) > (param3 ^ -1)) {
            param3 = ((wl) this).field_bb;
        }
        if (param2 > ((wl) this).field_ec) {
            param2 = ((wl) this).field_ec;
        }
        if (!(-1 >= (param1 ^ -1))) {
            param1 = 0;
        }
        ((wl) this).field_e = param1;
        ((wl) this).field_Q = param3;
        ((wl) this).field_d = param2;
        ((wl) this).field_L = param0;
        jaggl.OpenGL.glEnable(3089);
        this.m(5149);
        this.v(0);
    }

    final q c(boolean param0) {
        if (!param0) {
            ((wl) this).a(108, (byte) -128);
        }
        return ((wl) this).field_cb == null ? null : ((wl) this).field_cb.b((byte) 127);
    }

    final void a(byte param0) {
        if (!(-5 == (((wl) this).field_O ^ -1))) {
            this.h(-84);
            this.a(false, false);
            this.b(false, (byte) -125);
            this.c(false, param0 ^ -117);
            this.a(false, (byte) -28);
            this.g(-2, -100);
            ((wl) this).b((byte) -103, 1);
            ((wl) this).field_O = 4;
        }
        if (param0 != 10) {
            ((wl) this).g(9);
        }
    }

    private final void f(int param0) {
        if (param0 != 8960) {
            this.d(-118);
        }
        boolean discarded$0 = ((wl) this).field_kc.a();
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.j(1);
        ((wl) this).b((byte) 35, param4);
        float var6 = 0.3499999940395355f + (float)param0;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> -721223632), (byte)(param3 >> 641383176), (byte)param3, (byte)(param3 >> -905635816));
        float var7 = 0.3499999940395355f + (float)param1;
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
        jaggl.OpenGL.glEnd();
    }

    final int b(boolean param0, int param1) {
        L0: {
          if (param0) {
            break L0;
          } else {
            this.a(-87, -43, true);
            break L0;
          }
        }
        if (-2 == (param1 ^ -1)) {
          return 7681;
        } else {
          if (-1 != (param1 ^ -1)) {
            if ((param1 ^ -1) == -3) {
              return 34165;
            } else {
              if ((param1 ^ -1) != -4) {
                if (-5 != (param1 ^ -1)) {
                  throw new IllegalArgumentException();
                } else {
                  return 34023;
                }
              } else {
                return 260;
              }
            }
          } else {
            return 8448;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        if (((wl) this).field_Pb != 0) {
            jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
            jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
        } else {
            var4 = 0;
            if (!((((wl) this).field_Bb ^ -1) == (param0 ^ -1))) {
                jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
                ((wl) this).field_Bb = param0;
                var4 = 1;
            }
            if (param2 != ((wl) this).field_W) {
                jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
                ((wl) this).field_W = param2;
                var4 = 1;
            }
            if (var4 != 0) {
                ((wl) this).field_O = ((wl) this).field_O & -30;
            }
        }
        if (param1 != -26625) {
            ((wl) this).field_Xb = 59;
        }
    }

    private final void o(int param0) {
        if (param0 != 0) {
            ((wl) this).field_kc = (jaggl.OpenGL) null;
        }
        jaggl.OpenGL.glViewport(((wl) this).field_wc, ((wl) this).field_T, ((wl) this).field_ec, ((wl) this).field_bb);
    }

    final void a(za param0) {
        du var3 = null;
        L0: {
          ((wl) this).field_mb = ((im) param0).field_g;
          if (null == ((wl) this).field_gb) {
            L1: {
              var3 = new du(80);
              if (!((wl) this).field_V) {
                var3.b((byte) -90, -1.0f);
                var3.b((byte) -90, -1.0f);
                var3.b((byte) -90, 0.0f);
                var3.b((byte) -90, 0.0f);
                var3.b((byte) -90, 1.0f);
                var3.b((byte) -90, 1.0f);
                var3.b((byte) -90, -1.0f);
                var3.b((byte) -90, 0.0f);
                var3.b((byte) -90, 1.0f);
                var3.b((byte) -90, 1.0f);
                var3.b((byte) -90, 1.0f);
                var3.b((byte) -90, 1.0f);
                var3.b((byte) -90, 0.0f);
                var3.b((byte) -90, 1.0f);
                var3.b((byte) -90, 0.0f);
                var3.b((byte) -90, -1.0f);
                var3.b((byte) -90, 1.0f);
                var3.b((byte) -90, 0.0f);
                var3.b((byte) -90, 0.0f);
                var3.b((byte) -90, 0.0f);
                break L1;
              } else {
                var3.a((byte) 125, -1.0f);
                var3.a((byte) 127, -1.0f);
                var3.a((byte) 115, 0.0f);
                var3.a((byte) 108, 0.0f);
                var3.a((byte) 82, 1.0f);
                var3.a((byte) 64, 1.0f);
                var3.a((byte) 102, -1.0f);
                var3.a((byte) 90, 0.0f);
                var3.a((byte) 116, 1.0f);
                var3.a((byte) 82, 1.0f);
                var3.a((byte) 87, 1.0f);
                var3.a((byte) 102, 1.0f);
                var3.a((byte) 75, 0.0f);
                var3.a((byte) 81, 1.0f);
                var3.a((byte) 113, 0.0f);
                var3.a((byte) 60, -1.0f);
                var3.a((byte) 72, 1.0f);
                var3.a((byte) 104, 0.0f);
                var3.a((byte) 95, 0.0f);
                var3.a((byte) 60, 0.0f);
                break L1;
              }
            }
            ((wl) this).field_gb = ((wl) this).a((byte) -49, 20, ((du) var3).field_f, ((du) var3).field_g, false);
            hl discarded$2 = new hl(((wl) this).field_gb, 5126, 3, 0);
            hl discarded$3 = new hl(((wl) this).field_gb, 5126, 2, 12);
            ((wl) this).field_q.a((byte) 102, (wl) this);
            break L0;
          } else {
            break L0;
          }
        }
    }

    final synchronized void d(int param0, int param1) {
        int var3 = 19 / ((param0 - -68) / 56);
        wf var4 = new wf();
        var4.field_b = (long)param1;
        ((wl) this).field_dc.a(110, var4);
    }

    private final void l(int param0) {
        ((wl) this).field_d = ((wl) this).field_ec;
        if (param0 != 24643) {
            return;
        }
        ((wl) this).field_Q = ((wl) this).field_bb;
        ((wl) this).field_L = 0;
        ((wl) this).field_e = 0;
        jaggl.OpenGL.glDisable(3089);
        this.m(5149);
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        this.g(-2, -88);
        var2 = ((wl) this).field_Xb - 1;
        L0: while (true) {
          if ((var2 ^ -1) > -1) {
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
              var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
              var3 = 0;
              L1: while (true) {
                if (-9 >= (var3 ^ -1)) {
                  jaggl.OpenGL.glEnable(16384);
                  jaggl.OpenGL.glEnable(16385);
                  jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                  jaggl.OpenGL.glFogi(2917, 9729);
                  jaggl.OpenGL.glHint(3156, 4353);
                  ((wl) this).field_F = -1;
                  this.l(24643);
                  return;
                } else {
                  var4 = var3 + 16384;
                  jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
                  jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
                  jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
                  var3++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            ((wl) this).a(false, var2);
            ((wl) this).a((rt) null, 1);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            var2--;
            continue L0;
          }
        }
    }

    private final void a(boolean param0, int param1, byte param2, boolean param3) {
        nr var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        uh var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var13 = AceOfSkies.field_G ? 1 : 0;
          if (param2 > 124) {
            break L0;
          } else {
            field_Ub = (float[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param1 ^ -1) != (((wl) this).field_kb ^ -1)) {
              break L2;
            } else {
              L3: {
                if (((wl) this).field_qc) {
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
                if (((wl) this).field_vc) {
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
            if (((wl) this).field_qc) {
              stackOut_13_0 = 3;
              stackIn_14_0 = stackOut_13_0;
              break L5;
            } else {
              stackOut_12_0 = 0;
              stackIn_14_0 = stackOut_12_0;
              break L5;
            }
          }
          L6: {
            var9 = stackIn_14_0;
            if (-1 >= (param1 ^ -1)) {
              L7: {
                L8: {
                  var5 = ((wl) this).field_X.a(param1, (byte) 14);
                  var10 = ((wl) this).field_a.a(false, param1);
                  if (0 != ((uh) var10).field_n) {
                    break L8;
                  } else {
                    if (0 != ((uh) var10).field_j) {
                      break L8;
                    } else {
                      this.q(67);
                      break L7;
                    }
                  }
                }
                L9: {
                  if (!((uh) var10).field_o) {
                    stackOut_21_0 = 128;
                    stackIn_22_0 = stackOut_21_0;
                    break L9;
                  } else {
                    stackOut_20_0 = 64;
                    stackIn_22_0 = stackOut_20_0;
                    break L9;
                  }
                }
                var11 = stackIn_22_0;
                var12 = 50 * var11;
                this.a(0.0f, (float)(((wl) this).field_hb % var12 * ((uh) var10).field_n) / (float)var12, (float)(((uh) var10).field_j * (((wl) this).field_hb % var12)) / (float)var12, 5888);
                break L7;
              }
              var6 = ((uh) var10).field_e;
              if (!((wl) this).field_qc) {
                var8 = ((uh) var10).field_h;
                var7 = ((uh) var10).field_s;
                var9 = ((uh) var10).field_c;
                break L6;
              } else {
                break L6;
              }
            } else {
              this.q(116);
              break L6;
            }
          }
          L10: {
            ((wl) this).field_vb.a(var9, param3, 2147483647, var8, param0, var7);
            if (((wl) this).field_vb.a(var6, -1896, (rt) (Object) var5)) {
              break L10;
            } else {
              ((wl) this).a((rt) (Object) var5, 1);
              ((wl) this).a(var6, (byte) -39);
              break L10;
            }
          }
          ((wl) this).field_vc = ((wl) this).field_qc;
          ((wl) this).field_kb = param1;
          break L1;
        }
        ((wl) this).field_O = ((wl) this).field_O & -8;
    }

    private final void b(byte param0) {
        L0: {
          if (param0 == -67) {
            break L0;
          } else {
            ((wl) this).a((byte) -71);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((wl) this).field_ac) {
              break L2;
            } else {
              if (!((wl) this).field_xc) {
                jaggl.OpenGL.glEnable(2896);
                break L1;
              } else {
                break L2;
              }
            }
          }
          jaggl.OpenGL.glDisable(2896);
          break L1;
        }
    }

    final void b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_19_0 = false;
        int stackIn_19_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        boolean stackOut_16_0 = false;
        boolean stackOut_18_0 = false;
        int stackOut_18_1 = 0;
        boolean stackOut_17_0 = false;
        int stackOut_17_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        L0: {
          var6 = AceOfSkies.field_G ? 1 : 0;
          if (((wl) this).field_Cb == param1) {
            break L0;
          } else {
            L1: {
              if (-2 != (param1 ^ -1)) {
                if (2 != param1) {
                  if ((param1 ^ -1) == -129) {
                    var4 = 1;
                    var3 = 1;
                    var5 = 3;
                    break L1;
                  } else {
                    var3 = 1;
                    var4 = 0;
                    var5 = 0;
                    break L1;
                  }
                } else {
                  var3 = 1;
                  var4 = 0;
                  var5 = 2;
                  break L1;
                }
              } else {
                var5 = 1;
                var4 = 1;
                var3 = 1;
                break L1;
              }
            }
            L2: {
              stackOut_8_0 = var3;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (((wl) this).field_hc) {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              } else {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_11_0 != stackIn_11_1) {
                break L3;
              } else {
                L4: {
                  jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
                  stackOut_12_0 = this;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (var3 == 0) {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L4;
                  } else {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L4;
                  }
                }
                ((wl) this).field_hc = stackIn_15_1 != 0;
                break L3;
              }
            }
            L5: {
              stackOut_16_0 = ((wl) this).field_k;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (var4 != 0) {
                stackOut_18_0 = stackIn_18_0;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L5;
              } else {
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L5;
              }
            }
            L6: {
              if ((stackIn_19_0 ? 1 : 0) == stackIn_19_1) {
                L7: {
                  if (var4 != 0) {
                    jaggl.OpenGL.glEnable(3008);
                    break L7;
                  } else {
                    jaggl.OpenGL.glDisable(3008);
                    break L7;
                  }
                }
                L8: {
                  stackOut_24_0 = this;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (var4 == 0) {
                    stackOut_26_0 = this;
                    stackOut_26_1 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L8;
                  } else {
                    stackOut_25_0 = this;
                    stackOut_25_1 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    break L8;
                  }
                }
                ((wl) this).field_k = stackIn_27_1 != 0;
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if ((((wl) this).field_z ^ -1) == (var5 ^ -1)) {
                break L9;
              } else {
                L10: {
                  if ((var5 ^ -1) != -2) {
                    if (2 == var5) {
                      jaggl.OpenGL.glEnable(3042);
                      jaggl.OpenGL.glBlendFunc(1, 1);
                      break L10;
                    } else {
                      if (-4 != (var5 ^ -1)) {
                        jaggl.OpenGL.glDisable(3042);
                        break L10;
                      } else {
                        jaggl.OpenGL.glEnable(3042);
                        jaggl.OpenGL.glBlendFunc(774, 1);
                        break L10;
                      }
                    }
                  } else {
                    jaggl.OpenGL.glEnable(3042);
                    jaggl.OpenGL.glBlendFunc(770, 771);
                    break L10;
                  }
                }
                ((wl) this).field_z = var5;
                break L9;
              }
            }
            ((wl) this).field_Cb = param1;
            ((wl) this).field_O = ((wl) this).field_O & -29;
            break L0;
          }
        }
        var3 = 78 / ((param0 - -41) / 36);
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (((wl) this).field_d > param2) {
            ((wl) this).field_d = param2;
        }
        if (!((((wl) this).field_Q ^ -1) >= (param3 ^ -1))) {
            ((wl) this).field_Q = param3;
        }
        if (!(param1 <= ((wl) this).field_e)) {
            ((wl) this).field_e = param1;
        }
        if (param0 > ((wl) this).field_L) {
            ((wl) this).field_L = param0;
        }
        jaggl.OpenGL.glEnable(3089);
        this.m(5149);
        this.v(0);
    }

    final synchronized void a(long param0, int param1) {
        if (param1 != 3) {
            return;
        }
        wf var4 = new wf();
        var4.field_b = param0;
        ((wl) this).field_f.a(param1 + 98, var4);
    }

    private final void v(int param0) {
        if (param0 != 0) {
            return;
        }
        if ((((wl) this).field_d ^ -1) <= (((wl) this).field_L ^ -1)) {
            // if_icmpgt L81
            jaggl.OpenGL.glScissor(((wl) this).field_wc + ((wl) this).field_L, -((wl) this).field_Q + ((wl) this).field_bb + ((wl) this).field_T, -((wl) this).field_L + ((wl) this).field_d, ((wl) this).field_Q + -((wl) this).field_e);
        } else {
            jaggl.OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    private final void n(int param0) {
        L0: {
          L1: {
            if (!((wl) this).field_tc) {
              break L1;
            } else {
              if ((((wl) this).field_C ^ -1) <= -1) {
                jaggl.OpenGL.glEnable(2912);
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glDisable(2912);
          break L0;
        }
        L2: {
          if (param0 == -1) {
            break L2;
          } else {
            ((wl) this).a(-19, -108, -19);
            break L2;
          }
        }
    }

    final void g(int param0) {
        if (!((((wl) this).field_O ^ -1) == -3)) {
            this.h(-109);
            this.a(false, false);
            this.b(false, (byte) -125);
            this.c(false, -128);
            this.a(false, (byte) -28);
            this.g(-2, 115);
            ((wl) this).field_O = 2;
        }
        if (param0 != 1025208104) {
            this.f((byte) 124);
        }
    }

    final void b(byte param0, up param1) {
        int var4 = 0;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          if (((wl) this).field_i) {
            this.a((byte) -94, param1);
            this.a(param1, (byte) 49);
            break L0;
          } else {
            L1: {
              if (-1 < (((wl) this).field_rc ^ -1)) {
                break L1;
              } else {
                if (((wl) this).field_Jb[((wl) this).field_rc] == param1) {
                  ((wl) this).field_rc = ((wl) this).field_rc - 1;
                  ((wl) this).field_Jb[((wl) this).field_rc] = null;
                  ((up) param1).b(10383);
                  if ((((wl) this).field_rc ^ -1) > -1) {
                    ((wl) this).field_Rb = null;
                    ((wl) this).field_qb = null;
                    break L0;
                  } else {
                    ((wl) this).field_qb = ((wl) this).field_Jb[((wl) this).field_rc];
                    ((wl) this).field_Rb = ((wl) this).field_Jb[((wl) this).field_rc];
                    ((wl) this).field_Rb.a(param0 ^ 18952);
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        }
        L2: {
          if (param0 == -113) {
            break L2;
          } else {
            ((wl) this).field_v = true;
            break L2;
          }
        }
    }

    private final void a(int param0, up param1) {
        if (!((((wl) this).field_Y ^ -1) > param0)) {
            throw new RuntimeException();
        }
        if (!(-1 < (((wl) this).field_Y ^ -1))) {
            ((wl) this).field_ob[((wl) this).field_Y].b((byte) -40);
        }
        ((wl) this).field_Y = ((wl) this).field_Y + 1;
        ((wl) this).field_ob[((wl) this).field_Y + 1] = param1;
        ((wl) this).field_qb = param1;
        ((wl) this).field_qb.c(-1122);
    }

    final void a(int param0, byte param1) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (1 == param0) {
            ((wl) this).a(7681, -26625, 7681);
        } else {
            if (-1 == (param0 ^ -1)) {
                ((wl) this).a(8448, -26625, 8448);
            } else {
                if (-3 == (param0 ^ -1)) {
                    ((wl) this).a(34165, -26625, 7681);
                } else {
                    if (-4 == (param0 ^ -1)) {
                        ((wl) this).a(260, -26625, 8448);
                    } else {
                        if (4 == param0) {
                            ((wl) this).a(34023, param1 ^ 26662, 34023);
                        }
                    }
                }
            }
        }
        if (param1 != -39) {
            this.a(-44, -126, true);
        }
    }

    public static void y(int param0) {
        if (param0 != 32598) {
            wl.y(40);
        }
        field_m = null;
        field_Ub = null;
        field_r = null;
        field_zc = null;
        field_Kb = null;
    }

    final void a(byte param0, fq param1) {
        if (param0 != -120) {
            ((wl) this).field_ob = (up[]) null;
        }
        if (!(((wl) this).field_Qb == param1)) {
            if (((wl) this).field_M) {
                jaggl.OpenGL.glBindBufferARB(34962, ((fq) param1).a(param0 + 6650));
            }
            ((wl) this).field_Qb = param1;
        }
    }

    final void a(byte param0, boolean param1) {
        if (!((!param1 ? 1 : 0) == (!((wl) this).field_xc ? 1 : 0))) {
            ((wl) this).field_xc = param1 ? true : false;
            this.b((byte) -67);
        }
        if (param0 != -126) {
            fq var4 = (fq) null;
            ((wl) this).a((byte) -46, (fq) null);
        }
    }

    private final int w(int param0) {
        if (param0 != 8705) {
            ((wl) this).field_ob = (up[]) null;
        }
        return ((wl) this).field_ib - (-((wl) this).field_lb + -((wl) this).field_yc);
    }

    final void a(up param0, int param1) {
        if (!((wl) this).field_i) {
            if (((wl) this).field_rc >= 3) {
                throw new RuntimeException();
            }
            if (!(-1 < (((wl) this).field_rc ^ -1))) {
                ((wl) this).field_Jb[((wl) this).field_rc].b(param1 ^ 43026);
            }
            ((wl) this).field_rc = ((wl) this).field_rc + 1;
            ((wl) this).field_Jb[((wl) this).field_rc + 1] = param0;
            ((wl) this).field_qb = param0;
            ((wl) this).field_Rb = param0;
            ((wl) this).field_Rb.a(param1 + -51990);
        } else {
            this.b(param0, param1 ^ 32993);
            this.a(-4, param0);
        }
        if (param1 != 32925) {
            ((wl) this).field_D = -1.2460601329803467f;
        }
    }

    private final void c(boolean param0, int param1) {
        if (((wl) this).field_P != param0) {
            if (param0) {
                jaggl.OpenGL.glEnable(2929);
            } else {
                jaggl.OpenGL.glDisable(2929);
            }
            ((wl) this).field_P = param0 ? true : false;
            ((wl) this).field_O = ((wl) this).field_O & -32;
        }
        if (param1 > -126) {
            ((wl) this).field_dc = (kp) null;
        }
    }

    final int XA() {
        return ((wl) this).field_Ob;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        L0: {
          ((wl) this).field_jc = param1;
          ((wl) this).field_ub = param2;
          ((wl) this).field_mc = param3;
          ((wl) this).field_Ib = param0;
          this.u(3);
          this.m(5149);
          if (-4 == (((wl) this).field_N ^ -1)) {
            this.d(5888);
            break L0;
          } else {
            if (((wl) this).field_N == 2) {
              this.d((byte) 90);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    final synchronized void b(int param0) {
        int var2 = 0;
        int var4 = 0;
        iq var5 = null;
        iq var6 = null;
        iq var7 = null;
        iq var8 = null;
        iq var9 = null;
        wf var10 = null;
        wf var11 = null;
        iq var12 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          if (((wl) this).field_nb.a(true)) {
            L1: {
              if ((var2 ^ -1) >= -1) {
                break L1;
              } else {
                jaggl.OpenGL.glDeleteBuffersARB(var2, in.field_b, 0);
                var2 = 0;
                break L1;
              }
            }
            L2: while (true) {
              if (((wl) this).field_Ac.a(true)) {
                L3: {
                  if (0 >= var2) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glDeleteTextures(var2, in.field_b, 0);
                    var2 = 0;
                    break L3;
                  }
                }
                L4: while (true) {
                  if (((wl) this).field_zb.a(true)) {
                    L5: {
                      if (-1 <= (var2 ^ -1)) {
                        break L5;
                      } else {
                        jaggl.OpenGL.glDeleteFramebuffersEXT(var2, in.field_b, 0);
                        var2 = 0;
                        break L5;
                      }
                    }
                    L6: while (true) {
                      if (((wl) this).field_Gb.a(true)) {
                        L7: {
                          if (-1 <= (var2 ^ -1)) {
                            break L7;
                          } else {
                            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, in.field_b, 0);
                            var2 = 0;
                            break L7;
                          }
                        }
                        L8: while (true) {
                          if (((wl) this).field_Gc.a(true)) {
                            L9: while (true) {
                              if (((wl) this).field_dc.a(true)) {
                                L10: while (true) {
                                  if (((wl) this).field_f.a(true)) {
                                    L11: while (true) {
                                      if (((wl) this).field_Gc.a(true)) {
                                        L12: {
                                          ((wl) this).field_X.a(64);
                                          if (this.w(8705) <= 100663296) {
                                            break L12;
                                          } else {
                                            if (60000L + ((wl) this).field_l >= kh.a(-57)) {
                                              break L12;
                                            } else {
                                              System.gc();
                                              ((wl) this).field_l = kh.a(-109);
                                              break L12;
                                            }
                                          }
                                        }
                                        ((wl) this).field_hb = param0;
                                        return;
                                      } else {
                                        var12 = (iq) ((wl) this).field_Gc.e(124);
                                        jaggl.OpenGL.glDeleteLists((int)((iq) var12).field_b, ((iq) var12).field_f);
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var11 = ((wl) this).field_f.e(127);
                                    jaggl.OpenGL.glDeleteObjectARB(((wf) var11).field_b);
                                    continue L10;
                                  }
                                }
                              } else {
                                var10 = ((wl) this).field_dc.e(121);
                                jaggl.OpenGL.glDeleteProgramARB((int)((wf) var10).field_b);
                                continue L9;
                              }
                            }
                          } else {
                            var9 = (iq) ((wl) this).field_Gc.e(121);
                            jaggl.OpenGL.glDeleteLists((int)((iq) var9).field_b, ((iq) var9).field_f);
                            continue L8;
                          }
                        }
                      } else {
                        var8 = (iq) ((wl) this).field_Gb.e(127);
                        var2++;
                        in.field_b[var2] = (int)((iq) var8).field_b;
                        ((wl) this).field_yc = ((wl) this).field_yc - ((iq) var8).field_f;
                        if ((var2 ^ -1) == -1001) {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, in.field_b, 0);
                          var2 = 0;
                          continue L6;
                        } else {
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var7 = (iq) ((wl) this).field_zb.e(124);
                    var2++;
                    in.field_b[var2] = ((iq) var7).field_f;
                    if (1000 == var2) {
                      jaggl.OpenGL.glDeleteFramebuffersEXT(var2, in.field_b, 0);
                      var2 = 0;
                      continue L4;
                    } else {
                      continue L4;
                    }
                  }
                }
              } else {
                L13: {
                  var6 = (iq) ((wl) this).field_Ac.e(121);
                  var2++;
                  in.field_b[var2] = (int)((iq) var6).field_b;
                  ((wl) this).field_lb = ((wl) this).field_lb - ((iq) var6).field_f;
                  if (-1001 != (var2 ^ -1)) {
                    break L13;
                  } else {
                    jaggl.OpenGL.glDeleteTextures(var2, in.field_b, 0);
                    var2 = 0;
                    break L13;
                  }
                }
                continue L2;
              }
            }
          } else {
            L14: {
              var5 = (iq) ((wl) this).field_nb.e(123);
              var2++;
              in.field_b[var2] = (int)((iq) var5).field_b;
              ((wl) this).field_ib = ((wl) this).field_ib - ((iq) var5).field_f;
              if (1000 != var2) {
                break L14;
              } else {
                jaggl.OpenGL.glDeleteBuffersARB(var2, in.field_b, 0);
                var2 = 0;
                break L14;
              }
            }
            continue L0;
          }
        }
    }

    final void c(int param0, int param1) {
        bg.field_a[0] = (float)pg.a(16711680, param1) / 16711680.0f;
        bg.field_a[1] = (float)pg.a(65280, param1) / 65280.0f;
        bg.field_a[param0] = (float)pg.a(255, param1) / 255.0f;
        bg.field_a[3] = (float)(param1 >>> 336202712) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, bg.field_a, 0);
    }

    private final void i(int param0) {
        if (param0 <= 44) {
            ((wl) this).field_E = 48;
        }
        ((wl) this).field_pb[14] = ((wl) this).field_ab;
        ((wl) this).field_pb[10] = ((wl) this).field_fb;
    }

    private final void j(int param0) {
        if (!(((wl) this).field_O == param0)) {
            this.h(-114);
            this.a(false, false);
            this.b(false, (byte) -125);
            this.c(false, -128);
            this.a(false, (byte) -28);
            ((wl) this).a((rt) null, param0 ^ 0);
            this.g(-2, 103);
            ((wl) this).a(1, (byte) -39);
            ((wl) this).field_O = 1;
        }
    }

    private final void a(up param0, byte param1) {
        L0: {
          if (-1 < (((wl) this).field_Y ^ -1)) {
            break L0;
          } else {
            if (param0 == ((wl) this).field_ob[((wl) this).field_Y]) {
              L1: {
                ((wl) this).field_Y = ((wl) this).field_Y - 1;
                ((wl) this).field_ob[((wl) this).field_Y] = null;
                ((up) param0).b((byte) -128);
                if (param1 > 7) {
                  break L1;
                } else {
                  ((wl) this).field_ac = true;
                  break L1;
                }
              }
              L2: {
                if ((((wl) this).field_Y ^ -1) <= -1) {
                  ((wl) this).field_qb = ((wl) this).field_ob[((wl) this).field_Y];
                  ((wl) this).field_qb.c(-1122);
                  break L2;
                } else {
                  ((wl) this).field_qb = null;
                  break L2;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    private final void a(boolean param0, byte param1) {
        if (param1 != -28) {
            ((wl) this).field_D = -1.1227154731750488f;
        }
        if (!((!param0 ? 1 : 0) != (((wl) this).field_uc ? 1 : 0))) {
            ((wl) this).field_uc = param0 ? true : false;
            this.r(param1 ^ 102);
            ((wl) this).field_O = ((wl) this).field_O & -32;
        }
    }

    final void c() {
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        wf var1 = ((wl) this).field_jb.d(268435455);
        while (var1 != null) {
            ((im) var1).a(-125);
            var1 = ((wl) this).field_jb.b((byte) 103);
        }
        if (((wl) this).field_pc != null) {
            ((wl) this).field_pc.a(1);
        }
        if (!(((wl) this).field_kc == null)) {
            this.f(8960);
            var1 = (wf) (Object) ((wl) this).field_R.keys();
            while (((Enumeration) var1).hasMoreElements()) {
                var2 = (java.awt.Canvas) ((Enumeration) var1).nextElement();
                var3 = (Long) ((wl) this).field_R.get((Object) (Object) var2);
                ((wl) this).field_kc.releaseSurface(var2, var3.longValue());
            }
            ((wl) this).field_kc.release();
            ((wl) this).field_kc = null;
        }
        if (((wl) this).field_S) {
            da.a(120, true, false);
            ((wl) this).field_S = false;
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -85) {
            this.r(8);
        }
        iq var3 = new iq(param1);
        ((wl) this).field_zb.a(118, (wf) (Object) var3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = -1.0f + (var7 + (float)param2);
        float var10 = -1.0f + (var8 + (float)param3);
        this.j(1);
        ((wl) this).b((byte) -124, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> -1199065968), (byte)(param4 >> -516294904), (byte)param4, (byte)(param4 >> 1702528024));
        if (!(!((wl) this).field_I)) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(2);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (!(!((wl) this).field_I)) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void d(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(((wl) this).field_pb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0 <= 30) {
            this.a(false, -1, (byte) 62, true);
        }
    }

    private final void a(byte param0, up param1) {
        L0: {
          if ((((wl) this).field_fc ^ -1) > -1) {
            break L0;
          } else {
            if (((wl) this).field_Fc[((wl) this).field_fc] == param1) {
              ((wl) this).field_fc = ((wl) this).field_fc - 1;
              ((wl) this).field_Fc[((wl) this).field_fc] = null;
              ((up) param1).a((byte) 97);
              if (param0 == -94) {
                L1: {
                  if (0 <= ((wl) this).field_fc) {
                    ((wl) this).field_Rb = ((wl) this).field_Fc[((wl) this).field_fc];
                    ((wl) this).field_Rb.c((byte) 109);
                    break L1;
                  } else {
                    ((wl) this).field_Rb = null;
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    private final void r(int param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 70 % ((param0 - -17) / 58);
            if (!((wl) this).field_uc) {
              break L1;
            } else {
              if (!((wl) this).field_p) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        jaggl.OpenGL.glDepthMask(stackIn_4_0 != 0);
    }

    final int e(int param0, int param1) {
        if (param1 == 6406) {
          return 1;
        } else {
          if ((param1 ^ -1) != -6410) {
            L0: {
              if ((param1 ^ -1) == -6411) {
                break L0;
              } else {
                if (param1 == 34846) {
                  break L0;
                } else {
                  if (34844 == param1) {
                    break L0;
                  } else {
                    if ((param1 ^ -1) == -6408) {
                      return 3;
                    } else {
                      L1: {
                        if (6408 == param1) {
                          break L1;
                        } else {
                          if (param1 == 34847) {
                            break L1;
                          } else {
                            if (-34844 != (param1 ^ -1)) {
                              if ((param1 ^ -1) != -34843) {
                                if (6402 != param1) {
                                  if (-6402 != (param1 ^ -1)) {
                                    L2: {
                                      if (param0 == -32334) {
                                        break L2;
                                      } else {
                                        ((wl) this).field_Vb = (nr) null;
                                        break L2;
                                      }
                                    }
                                    throw new IllegalArgumentException("");
                                  } else {
                                    return 1;
                                  }
                                } else {
                                  return 3;
                                }
                              } else {
                                return 8;
                              }
                            } else {
                              return 6;
                            }
                          }
                        }
                      }
                      return 4;
                    }
                  }
                }
              }
            }
            return 2;
          } else {
            return 1;
          }
        }
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = (float)param0 + 0.3499999940395355f;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = var7 + (float)param2;
        this.j(1);
        float var10 = var8 + (float)param3;
        ((wl) this).b((byte) -118, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> -595524080), (byte)(param4 >> 1025208104), (byte)param4, (byte)(param4 >> -265091240));
        if (((wl) this).field_I) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (!(!((wl) this).field_I)) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void u(int param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float[] var8 = null;
        L0: {
          var8 = ((wl) this).field_pb;
          var2 = var8;
          var3 = (float)(((wl) this).field_db * -((wl) this).field_Ib) / (float)((wl) this).field_ub;
          var4 = (float)((-((wl) this).field_Ib + ((wl) this).field_ec) * ((wl) this).field_db) / (float)((wl) this).field_ub;
          var5 = (float)(((wl) this).field_db * ((wl) this).field_jc) / (float)((wl) this).field_mc;
          var6 = (float)(((wl) this).field_db * (-((wl) this).field_bb + ((wl) this).field_jc)) / (float)((wl) this).field_mc;
          if (param0 == 3) {
            break L0;
          } else {
            ((wl) this).field_Eb = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var4 == var3) {
              break L2;
            } else {
              if (var5 == var6) {
                break L2;
              } else {
                var7 = 2.0f * (float)((wl) this).field_db;
                var8[5] = var7 / (-var6 + var5);
                var8[7] = 0.0f;
                var8[2] = 0.0f;
                var8[12] = 0.0f;
                var8[1] = 0.0f;
                var8[13] = 0.0f;
                var8[4] = 0.0f;
                var8[8] = (var3 + var4) / (var4 - var3);
                var8[15] = 0.0f;
                var8[9] = (var5 + var6) / (-var6 + var5);
                var8[0] = var7 / (var4 - var3);
                var8[3] = 0.0f;
                ((wl) this).field_fb = (float)(-(((wl) this).field_Ob + ((wl) this).field_db)) / (float)(-((wl) this).field_db + ((wl) this).field_Ob);
                var8[10] = (float)(-(((wl) this).field_Ob + ((wl) this).field_db)) / (float)(-((wl) this).field_db + ((wl) this).field_Ob);
                ((wl) this).field_ab = -((float)((wl) this).field_Ob * var7) / (float)(-((wl) this).field_db + ((wl) this).field_Ob);
                var8[14] = -((float)((wl) this).field_Ob * var7) / (float)(-((wl) this).field_db + ((wl) this).field_Ob);
                var8[11] = -1.0f;
                var8[6] = 0.0f;
                break L1;
              }
            }
          }
          var8[4] = 0.0f;
          var8[15] = 1.0f;
          var8[7] = 0.0f;
          var8[10] = 1.0f;
          var8[6] = 0.0f;
          var8[8] = 0.0f;
          var8[13] = 0.0f;
          var8[9] = 0.0f;
          var8[5] = 1.0f;
          var8[12] = 0.0f;
          var8[3] = 0.0f;
          var8[11] = 0.0f;
          var8[1] = 0.0f;
          var8[0] = 1.0f;
          var8[2] = 0.0f;
          var8[14] = 0.0f;
          break L1;
        }
        this.i(121);
    }

    final fq a(byte param0, int param1, byte[] param2, int param3, boolean param4) {
        if (((wl) this).field_M) {
            if (param4) {
                // ifne L22
            } else {
                return (fq) (Object) new lk((wl) this, param1, param2, param3, param4);
            }
        }
        if (param0 != -49) {
            return (fq) null;
        }
        return (fq) (Object) new om((wl) this, param1, param2, param3);
    }

    final pa a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        return (pa) (Object) new tm((wl) this, param3, param4, param0, param1, param2);
    }

    private final void d(int param0) {
        float var2 = (float)(-((wl) this).field_Ib) * ((wl) this).field_sc / (float)((wl) this).field_ub;
        float var3 = (float)(-((wl) this).field_jc) * ((wl) this).field_sc / (float)((wl) this).field_mc;
        float var4 = ((wl) this).field_sc * (float)(((wl) this).field_ec + -((wl) this).field_Ib) / (float)((wl) this).field_ub;
        float var5 = (float)(((wl) this).field_bb + -((wl) this).field_jc) * ((wl) this).field_sc / (float)((wl) this).field_mc;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (var4 != var2) {
            if (!(var5 == var3)) {
                jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)((wl) this).field_db, (double)((wl) this).field_Ob);
            }
        }
        jaggl.OpenGL.glMatrixMode(param0);
    }

    final boolean c(byte param0) {
        if (param0 != 16) {
            return false;
        }
        return ((wl) this).field_vb.a((byte) -118, 3);
    }

    private final void q(int param0) {
        if (((wl) this).field_Bc) {
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            ((wl) this).field_Bc = false;
        }
        int var2 = -124 % ((param0 - 6) / 58);
    }

    final void a(float param0, float param1, int param2) {
        ((wl) this).field_D = param0;
        if (param2 < 8) {
            return;
        }
        ((wl) this).field_Zb = param1;
        this.k(-91);
    }

    private final void k(int param0) {
        ((wl) this).field_t = -((wl) this).field_Zb + (float)(((wl) this).field_Ob - ((wl) this).field_oc);
        ((wl) this).field_Tb = ((wl) this).field_t - (float)((wl) this).field_C * ((wl) this).field_D;
        if (!((float)((wl) this).field_db <= ((wl) this).field_Tb)) {
            ((wl) this).field_Tb = (float)((wl) this).field_db;
        }
        if (param0 > -83) {
            ((wl) this).field_G = true;
        }
        jaggl.OpenGL.glFogf(2915, ((wl) this).field_Tb);
        jaggl.OpenGL.glFogf(2916, ((wl) this).field_t);
        bg.field_a[2] = (float)pg.a(255, ((wl) this).field_F) / 255.0f;
        bg.field_a[1] = (float)pg.a(((wl) this).field_F, 65280) / 65280.0f;
        bg.field_a[0] = (float)pg.a(((wl) this).field_F, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, bg.field_a, 0);
    }

    final void a(boolean param0, int param1) {
        if (param1 != ((wl) this).field_Pb) {
            jaggl.OpenGL.glActiveTexture(param1 + 33984);
            ((wl) this).field_Pb = param1;
        }
        if (param0) {
            ((wl) this).field_mb = (jaclib.memory.heap.NativeHeap) null;
        }
    }

    final void b(int param0, int param1) throws lp {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          ((wl) this).field_kc.swapBuffers();
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (Exception) (Object) decompiledCaughtException;
    }

    final sm a(ra param0, gd param1) {
        return null;
    }

    final synchronized void c(int param0, int param1, int param2) {
        iq var4 = new iq(param1);
        var4.field_b = (long)param0;
        int var5 = 112 % ((param2 - -54) / 58);
        ((wl) this).field_nb.a(96, (wf) (Object) var4);
    }

    final static int t(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            rb var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_20_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_39_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_19_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_38_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if ((ul.field_r.field_j ^ -1) <= -5) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (ul.field_r.field_e == -1) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 3;
                    }
                    case 5: {
                        if (1 != (ul.field_r.field_e ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return 4;
                    }
                    case 7: {
                        return 1;
                    }
                    case 8: {
                        try {
                            if (bm.field_z == 0) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            wu.field_l = cs.field_d.a(2, hi.field_x, l.field_f);
                            bm.field_z = bm.field_z + 1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (-2 != (bm.field_z ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if ((wu.field_l.field_a ^ -1) == -3) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = tj.a(-112, -1);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (wu.field_l.field_a != 1) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            bm.field_z = bm.field_z + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (param0 == 19078) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            stackOut_19_0 = -63;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return stackIn_20_0;
                    }
                    case 21: {
                        try {
                            if (2 == bm.field_z) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            du.field_m = new vf((java.net.Socket) wu.field_l.field_f, cs.field_d);
                            var2 = new rb(13);
                            tr.a(var2, uk.field_g, ob.field_e, nm.field_b, 0);
                            var2.b(-1336879960, 15);
                            var2.a((byte) 20, si.field_c);
                            du.field_m.a(13, 0, 41, ((rb) var2).field_f);
                            bm.field_z = bm.field_z + 1;
                            gb.field_j = 30000L + kh.a(-70);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((bm.field_z ^ -1) != -4) {
                                statePc = 35;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-1 <= (du.field_m.b(-120) ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var1_int = du.field_m.a((byte) -116);
                            if (-1 != (var1_int ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = tj.a(92, var1_int);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            bm.field_z = bm.field_z + 1;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((kh.a(-116) ^ -1L) < (gb.field_j ^ -1L)) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = tj.a(-126, -2);
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        try {
                            if (4 != bm.field_z) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            ul.field_r.a(param0 ^ 16696, rs.field_C, (Object) (Object) du.field_m);
                            wu.field_l = null;
                            bm.field_z = 0;
                            du.field_m = null;
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        return stackIn_37_0;
                    }
                    case 38: {
                        try {
                            stackOut_38_0 = -1;
                            stackIn_39_0 = stackOut_38_0;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        return stackIn_39_0;
                    }
                    case 40: {
                        var1 = (IOException) (Object) caughtException;
                        return tj.a(107, -3);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(boolean param0, byte param1) {
        if (!(((wl) this).field_ac == param0)) {
            ((wl) this).field_ac = param0 ? true : false;
            this.b((byte) -67);
            ((wl) this).field_O = ((wl) this).field_O & -8;
        }
        if (param1 != -125) {
            pa var4 = (pa) null;
            ((wl) this).a((pa) null, true);
        }
    }

    final boolean b() {
        return true;
    }

    final void a(float param0, float param1, float param2, float param3, byte param4) {
        bg.field_a[1] = param1;
        bg.field_a[2] = param0;
        bg.field_a[0] = param2;
        if (param4 != 35) {
            return;
        }
        bg.field_a[3] = param3;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, bg.field_a, 0);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 + param2, param1);
        if (param3 <= 74) {
            ((wl) this).field_gb = (fq) null;
        }
        jaggl.OpenGL.glTexEnvi(8960, param2 + 34200, param0);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        if (param0 != -126) {
            za discarded$0 = ((wl) this).c(27);
        }
        iq var4 = new iq(param1);
        var4.field_b = (long)param2;
        ((wl) this).field_Gb.a(93, (wf) (Object) var4);
    }

    final static void a(java.awt.Component param0, byte param1) {
        if (param1 != -3) {
            java.awt.Component var3 = (java.awt.Component) null;
            wl.a((java.awt.Component) null, (byte) -81);
        }
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) ua.field_d);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) ua.field_d);
        fb.field_a = -1;
    }

    final boolean d() {
        return ((wl) this).field_yb != null && ((wl) this).field_yb.a(-118);
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, param3 + param2, param0);
        jaggl.OpenGL.glTexEnvi(8960, 34192 - -param3, param1);
    }

    final void e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (((wl) this).field_Eb) {
            if (-1 > (((wl) this).field_ec ^ -1)) {
                // if_icmpge L28
            } else {
                return;
            }
            var1 = ((wl) this).field_L;
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
            ((wl) this).KA(var1, var3, var2, var4);
            return;
        }
    }

    final void a(pa param0, boolean param1) {
        gt var3 = null;
        gt var3_ref = null;
        cu var3_ref2 = null;
        wt var4 = null;
        int var6 = 0;
        gt var7 = null;
        gt var8 = null;
        cu var9 = null;
        cu var10 = null;
        L0: {
          var6 = AceOfSkies.field_G ? 1 : 0;
          ((wl) this).field_j = (tm) param0;
          if (((wl) this).field_A) {
            L1: {
              if (null == ((wl) this).field_y) {
                ((wl) this).field_y = new wj((wl) this);
                break L1;
              } else {
                break L1;
              }
            }
            if ((Object) (Object) ((wl) this).field_qb != (Object) (Object) ((wl) this).field_y) {
              L2: {
                ((wl) this).a((up) (Object) ((wl) this).field_y, 32925);
                if (!param1) {
                  break L2;
                } else {
                  L3: {
                    var3_ref2 = (cu) ((wl) this).field_s.a((byte) 106, (long)(((wl) this).field_j.a() << -1671693488 | ((wl) this).field_j.b()));
                    if (var3_ref2 == null) {
                      var9 = new cu((wl) this, 6402, ((wl) this).field_j.a(), ((wl) this).field_j.b());
                      var3_ref = (gt) (Object) var9;
                      ((wl) this).field_rb = ((wl) this).field_rb + ((cu) var9).field_o;
                      L4: while (true) {
                        L5: {
                          if (-2097153 <= (((wl) this).field_rb ^ -1)) {
                            break L5;
                          } else {
                            var4 = ((wl) this).field_Ec.a(3);
                            if (var4 == null) {
                              break L5;
                            } else {
                              var10 = (cu) var4;
                              var10.d(-128);
                              var10.c(-126);
                              var10.d((byte) -108);
                              ((wl) this).field_rb = ((wl) this).field_rb - ((cu) var10).field_o;
                              continue L4;
                            }
                          }
                        }
                        ((wl) this).field_s.a(106, (long)(((wl) this).field_j.a() << -1176907408 | ((wl) this).field_j.b()), (wf) (Object) var9);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  ((wl) this).field_Ec.a((wt) (Object) var3_ref, (byte) 123);
                  ((wl) this).field_y.a((cu) (Object) var3_ref, 8, (byte) 119);
                  break L2;
                }
              }
              ((wl) this).field_y.a(0, (nr) (Object) ((wl) this).field_j.field_j, -5531);
              break L0;
            } else {
              throw new RuntimeException();
            }
          } else {
            if (!((wl) this).field_Mb) {
              throw new RuntimeException("");
            } else {
              L6: {
                var3 = (gt) ((wl) this).field_s.a((byte) 106, (long)(((wl) this).field_j.a() << 1788082032 | ((wl) this).field_j.b()));
                if (var3 != null) {
                  break L6;
                } else {
                  var7 = new gt((wl) this, ((wl) this).field_j.a(), ((wl) this).field_j.b());
                  var3_ref = var7;
                  ((wl) this).field_rb = ((wl) this).field_rb + ((gt) var7).field_n * 4;
                  L7: while (true) {
                    L8: {
                      if (((wl) this).field_rb <= 2097152) {
                        break L8;
                      } else {
                        var4 = ((wl) this).field_Ec.a(3);
                        if (var4 != null) {
                          var8 = (gt) var4;
                          var8.d(-127);
                          var8.c(-126);
                          ((wl) this).field_kc.releasePbuffer(var8.f(25766));
                          ((wl) this).field_rb = ((wl) this).field_rb - ((gt) var8).field_n;
                          continue L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((wl) this).field_s.a(115, (long)(((wl) this).field_j.a() << -218937200 | ((wl) this).field_j.b()), (wf) (Object) var7);
                    break L6;
                  }
                }
              }
              ((wl) this).field_Ec.a((wt) (Object) var3_ref, (byte) 125);
              ((wl) this).field_kc.setPbuffer(var3_ref.f(25766));
              break L0;
            }
          }
        }
        ((wl) this).field_ec = param0.a();
        ((wl) this).field_bb = param0.b();
        this.p(-123);
        this.o(0);
        this.l(24643);
    }

    final void a() {
        L0: {
          if (((wl) this).field_A) {
            if ((Object) (Object) ((wl) this).field_qb == (Object) (Object) ((wl) this).field_y) {
              ((wl) this).field_y.a(0, (byte) -54);
              ((wl) this).field_y.a(8, (byte) -24);
              ((wl) this).b((byte) -113, (up) (Object) ((wl) this).field_y);
              break L0;
            } else {
              throw new RuntimeException();
            }
          } else {
            if (!((wl) this).field_Mb) {
              throw new RuntimeException("");
            } else {
              ((wl) this).field_j.b(((wl) this).field_ec, 0, 0, 0, 0, -14164, ((wl) this).field_bb);
              boolean discarded$14 = ((wl) this).field_kc.setSurface(((wl) this).field_gc);
              break L0;
            }
          }
        }
        ((wl) this).field_bb = ((wl) this).field_Yb;
        ((wl) this).field_ec = ((wl) this).field_g;
        ((wl) this).field_j = null;
        this.p(47);
        this.o(0);
        this.l(24643);
    }

    private final void a(boolean param0, boolean param1) {
        if (param1 != ((wl) this).field_tc) {
            ((wl) this).field_tc = param1 ? true : false;
            this.n(-1);
            ((wl) this).field_O = ((wl) this).field_O & -32;
        }
        if (param0) {
            ((wl) this).c();
        }
    }

    final int[] Y() {
        return new int[]{((wl) this).field_Ib, ((wl) this).field_jc, ((wl) this).field_ub, ((wl) this).field_mc};
    }

    private final void h(int param0) {
        if (((wl) this).field_N != 1) {
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glLoadIdentity();
            if (0 < ((wl) this).field_ec) {
                if (((wl) this).field_bb > 0) {
                    jaggl.OpenGL.glOrtho(0.0, (double)((wl) this).field_ec, (double)((wl) this).field_bb, 0.0, -1.0, 1.0);
                }
            }
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            ((wl) this).field_N = 1;
            ((wl) this).field_O = ((wl) this).field_O & -25;
        }
        if (param0 > -49) {
            field_m = (int[]) null;
        }
    }

    private final void s(int param0) {
        java.awt.Dimension var2 = null;
        if (null == ((wl) this).field_Wb) {
            ((wl) this).field_Yb = 0;
            ((wl) this).field_g = 0;
        } else {
            var2 = ((wl) this).field_Wb.getSize();
            ((wl) this).field_Yb = ((java.awt.Dimension) var2).height;
            ((wl) this).field_g = ((java.awt.Dimension) var2).width;
        }
        if (((wl) this).field_qb == null) {
            ((wl) this).field_ec = ((wl) this).field_g;
            ((wl) this).field_bb = ((wl) this).field_Yb;
            this.o(0);
        }
        this.p(-98);
        if (param0 != -11103) {
            ((wl) this).f(-17, -62);
        }
        this.l(24643);
    }

    final void a(sm param0) {
    }

    final da a(vs param0, vd[] param1, boolean param2) {
        return (da) (Object) new mu((wl) this, param0, param1, param2);
    }

    private final int e(byte param0) {
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        NumberFormatException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int stackIn_29_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = 0;
                    ((wl) this).field_B = jaggl.OpenGL.glGetString(7936).toLowerCase();
                    ((wl) this).field_sb = jaggl.OpenGL.glGetString(7937).toLowerCase();
                    if (0 != (((wl) this).field_B.indexOf("microsoft") ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = var2 | 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((((wl) this).field_B.indexOf("brian paul") ^ -1) != 0) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (0 != (((wl) this).field_B.indexOf("mesa") ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2 = var2 | 1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var3 = jaggl.OpenGL.glGetString(7938);
                    var4 = ee.a((byte) 10, ' ', var3.replace('.', ' '));
                    if (var4.length < 2) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    try {
                        var5_int = td.a((CharSequence) (Object) var4[0], (byte) 38);
                        var6 = td.a((CharSequence) (Object) var4[1], (byte) 38);
                        ((wl) this).field_Z = var6 + 10 * var5_int;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var5 = (NumberFormatException) (Object) caughtException;
                    var2 = var2 | 4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    var2 = var2 | 4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (12 <= ((wl) this).field_Z) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2 = var2 | 2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (((wl) this).field_kc.a("GL_ARB_multitexture")) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var2 = var2 | 8;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (!((wl) this).field_kc.a("GL_ARB_texture_env_combine")) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var2 = var2 | 32;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var15 = new int[1];
                    var13 = var15;
                    var11 = var13;
                    var9 = var11;
                    var7 = var9;
                    var14 = var7;
                    jaggl.OpenGL.glGetIntegerv(34018, var14, 0);
                    if (param0 == -94) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((wl) this).field_pc = (lu) null;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    ((wl) this).field_Xb = var15[0];
                    jaggl.OpenGL.glGetIntegerv(34929, var15, 0);
                    ((wl) this).field_Sb = var15[0];
                    jaggl.OpenGL.glGetIntegerv(34930, var15, 0);
                    ((wl) this).field_K = var15[0];
                    if ((((wl) this).field_Xb ^ -1) > -3) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (-3 < (((wl) this).field_Sb ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (2 > ((wl) this).field_K) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var2 = var2 | 16;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    ((wl) this).field_V = jaclib.memory.Stream.b();
                    ((wl) this).field_Mb = ((wl) this).field_kc.arePbuffersAvailable();
                    ((wl) this).field_M = ((wl) this).field_kc.a("GL_ARB_vertex_buffer_object");
                    ((wl) this).field_I = ((wl) this).field_kc.a("GL_ARB_multisample");
                    ((wl) this).field_x = ((wl) this).field_kc.a("GL_ARB_vertex_program");
                    boolean discarded$2 = ((wl) this).field_kc.a("GL_ARB_fragment_program");
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
                    if ((var2 ^ -1) == -1) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = var2;
                    stackIn_29_0 = stackOut_27_0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    return stackIn_29_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(int param0, int param1) {
        this.a(param0, 4873, true);
        int var3 = -24 % ((param1 - 44) / 50);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        this.h(-59);
        ((wl) this).a((rt) null, 1);
        ((wl) this).b((byte) -118, 0);
        jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
        jaggl.OpenGL.glRasterPos2i(param0, param1);
        jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((wl) this).field_tb, param4, param5);
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
    }

    private final void b(up param0, int param1) {
        if ((((wl) this).field_fc ^ -1) <= -4) {
            throw new RuntimeException();
        }
        if (!(((wl) this).field_fc < 0)) {
            ((wl) this).field_Fc[((wl) this).field_fc].a((byte) 125);
        }
        if (param1 < 95) {
            boolean discarded$0 = ((wl) this).c((byte) -104);
        }
        ((wl) this).field_fc = ((wl) this).field_fc + 1;
        ((wl) this).field_Fc[((wl) this).field_fc + 1] = param0;
        ((wl) this).field_Rb = param0;
        ((wl) this).field_Rb.c((byte) 82);
    }

    final gd a(int param0, int param1) {
        return null;
    }

    final int i() {
        return ((wl) this).field_db;
    }

    private final void p(int param0) {
        if (!((((wl) this).field_N ^ -1) == -1)) {
            ((wl) this).field_O = ((wl) this).field_O & -32;
            ((wl) this).field_N = 0;
        }
        int var2 = 39 % ((param0 - -31) / 58);
    }

    final za c(int param0) {
        im var2 = new im(param0);
        ((wl) this).field_jb.a(87, (wf) (Object) var2);
        return (za) (Object) var2;
    }

    private final void x(int param0) {
        ((wl) this).field_bc = new rt[((wl) this).field_Xb];
        ((wl) this).field_Vb = new nr((wl) this, 3553, 6408, 1, 1);
        nr discarded$0 = new nr((wl) this, 3553, 6408, 1, 1);
        nr discarded$2 = new nr((wl) this, 3553, 6408, 1, 1);
        if (param0 != -26394) {
            ((wl) this).field_Bc = false;
        }
        nb discarded$3 = new nb((wl) this);
        nb discarded$4 = new nb((wl) this);
        nb discarded$5 = new nb((wl) this);
        nb discarded$6 = new nb((wl) this);
        nb discarded$7 = new nb((wl) this);
        nb discarded$8 = new nb((wl) this);
        nb discarded$9 = new nb((wl) this);
        nb discarded$10 = new nb((wl) this);
        nb discarded$11 = new nb((wl) this);
        nb discarded$14 = new nb((wl) this);
        if (!(!((wl) this).field_A)) {
            ((wl) this).field_o = new wj((wl) this);
            wj discarded$15 = new wj((wl) this);
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
