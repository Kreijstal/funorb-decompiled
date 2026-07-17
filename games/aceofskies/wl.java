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
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        pa stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        pa stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new int[param0.field_h * param0.field_c];
              var14 = var10;
              var13 = var14;
              var12 = var13;
              var11 = var12;
              var3_array = var11;
              var4 = 0;
              var5 = 0;
              if (param0.field_e != null) {
                var6_int = 0;
                L2: while (true) {
                  if (var6_int >= param0.field_c) {
                    break L1;
                  } else {
                    L3: {
                      var7 = 0;
                      if (param0.field_h <= var7) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6_int++;
                    continue L2;
                  }
                }
              } else {
                var6_int = 0;
                L4: while (true) {
                  if (var6_int >= param0.field_c) {
                    break L1;
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (param0.field_h <= var7) {
                        var6_int++;
                        continue L4;
                      } else {
                        L6: {
                          int incrementValue$2 = var4;
                          var4++;
                          var8 = param0.field_f[param0.field_d[incrementValue$2] & 255];
                          int incrementValue$3 = var5;
                          var5++;
                          stackOut_6_0 = (int[]) var10;
                          stackOut_6_1 = incrementValue$3;
                          stackIn_9_0 = stackOut_6_0;
                          stackIn_9_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var8 == 0) {
                            stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            break L6;
                          } else {
                            stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = vo.a(var8, -16777216);
                            stackIn_10_0 = stackOut_7_0;
                            stackIn_10_1 = stackOut_7_1;
                            stackIn_10_2 = stackOut_7_2;
                            break L6;
                          }
                        }
                        stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            var6 = ((wl) this).a(97, param0.field_c, var14, 0, param0.field_h, param0.field_h);
            var6.a(param0.field_a, param0.field_i, param0.field_g, param0.field_b);
            stackOut_18_0 = (pa) var6;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("wl.HA(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
        return stackIn_19_0;
    }

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (param0 != ((wl) this).field_db) {
              break L1;
            } else {
              if (((wl) this).field_Ob != param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ((wl) this).field_db = param0;
          ((wl) this).field_Ob = param1;
          int discarded$1 = 3;
          this.u();
          this.k(-107);
          if (((wl) this).field_N == 3) {
            this.d(5888);
            break L0;
          } else {
            if (2 != ((wl) this).field_N) {
              break L0;
            } else {
              this.d((byte) 125);
              break L0;
            }
          }
        }
    }

    final int[] a(int param0, int param1, byte param2, int param3, int param4) {
        int var7 = 0;
        int var8 = AceOfSkies.field_G ? 1 : 0;
        if (param2 != -78) {
            Object var9 = null;
            this.a((up) null, (byte) -74);
        }
        int[] var10 = new int[param3 * param1];
        int[] var6 = var10;
        for (var7 = 0; param1 > var7; var7++) {
            jaggl.OpenGL.glReadPixelsi(param0, -param4 + (((wl) this).field_bb - var7), param3, 1, 32993, ((wl) this).field_tb, var10, var7 * param3);
        }
        return var10;
    }

    private final void a(int param0, int param1, boolean param2) {
        L0: {
          int discarded$2 = 1;
          this.a(true, param0, (byte) 125);
          if (param1 == 4873) {
            break L0;
          } else {
            ((wl) this).c(80, -100);
            break L0;
          }
        }
    }

    final void a(rt param0, int param1) {
        rt var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        rt var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 1) {
              L1: {
                var5 = ((wl) this).field_bc[((wl) this).field_Pb];
                var3 = var5;
                if (param0 != var3) {
                  L2: {
                    if (null == param0) {
                      jaggl.OpenGL.glDisable(var5.field_f);
                      break L2;
                    } else {
                      L3: {
                        if (null == var3) {
                          jaggl.OpenGL.glEnable(param0.field_f);
                          break L3;
                        } else {
                          if (param0.field_f != var5.field_f) {
                            jaggl.OpenGL.glDisable(var5.field_f);
                            jaggl.OpenGL.glEnable(param0.field_f);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      jaggl.OpenGL.glBindTexture(param0.field_f, param0.a(125));
                      break L2;
                    }
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
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("wl.TA(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
    }

    private final void m() {
    }

    wl(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        String var13_ref = null;
        Throwable var4 = null;
        RuntimeException var4_ref = null;
        int var4_int = 0;
        Throwable var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object[] var8 = null;
        String[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        String var10_ref = null;
        Exception var11 = null;
        Object var13 = null;
        int[] var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        CharSequence var21 = null;
        CharSequence var22 = null;
        CharSequence var23 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_62_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        var13_ref = null;
        var18 = null;
        var19 = null;
        var20 = null;
        ((wl) this).field_R = new Hashtable();
        ((wl) this).field_Ab = 128;
        ((wl) this).field_q = new jk();
        tj discarded$12 = new tj();
        tj discarded$13 = new tj();
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
        tj discarded$14 = new tj();
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
        du discarded$15 = new du(8192);
        try {
          L0: {
            ((wl) this).field_Wb = param0;
            ((wl) this).field_Hb = param2;
            int discarded$16 = -16;
            if (ei.a("jaclib")) {
              int discarded$17 = -16;
              if (ei.a("jaggl")) {
                try {
                  L1: {
                    ((wl) this).field_kc = new jaggl.OpenGL();
                    long dupTemp$18 = ((wl) this).field_kc.init(param0, 8, 8, 8, 24, 0, ((wl) this).field_Hb);
                    ((wl) this).field_Db = dupTemp$18;
                    ((wl) this).field_gc = dupTemp$18;
                    if (0L == ((wl) this).field_Db) {
                      throw new RuntimeException("");
                    } else {
                      this.b(false);
                      var4_int = this.e((byte) -94);
                      if (var4_int == 0) {
                        L2: {
                          stackOut_10_0 = this;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (!((wl) this).field_V) {
                            stackOut_12_0 = this;
                            stackOut_12_1 = 5121;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L2;
                          } else {
                            stackOut_11_0 = this;
                            stackOut_11_1 = 33639;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L2;
                          }
                        }
                        L3: {
                          ((wl) this).field_tb = stackIn_13_1;
                          if (((wl) this).field_sb.indexOf("radeon") != -1) {
                            var5_int = 0;
                            var6 = 0;
                            var7 = 0;
                            var8_array = ee.a((byte) 10, ' ', ((wl) this).field_sb.replace('/', ' '));
                            var9 = 0;
                            L4: while (true) {
                              L5: {
                                if (var8_array.length <= var9) {
                                  break L5;
                                } else {
                                  var13_ref = var8_array[var9];
                                  var10_ref = var13_ref;
                                  var10_ref = var13_ref;
                                  try {
                                    L6: {
                                      L7: {
                                        if (var13_ref.length() > 0) {
                                          L8: {
                                            if (120 != var13_ref.charAt(0)) {
                                              break L8;
                                            } else {
                                              if (var13_ref.length() < 3) {
                                                break L8;
                                              } else {
                                                var21 = (CharSequence) (Object) var13_ref.substring(1, 3);
                                                if (vl.a(10, var21)) {
                                                  var7 = 1;
                                                  var10_ref = var13_ref.substring(1);
                                                  break L8;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                          if (var10_ref.equals((Object) (Object) "hd")) {
                                            var6 = 1;
                                            break L7;
                                          } else {
                                            L9: {
                                              if (!var10_ref.startsWith("hd")) {
                                                break L9;
                                              } else {
                                                var6 = 1;
                                                var10_ref = var10_ref.substring(2);
                                                break L9;
                                              }
                                            }
                                            if (var10_ref.length() < 4) {
                                              break L7;
                                            } else {
                                              var22 = (CharSequence) (Object) var10_ref.substring(0, 4);
                                              if (!vl.a(10, var22)) {
                                                break L7;
                                              } else {
                                                var23 = (CharSequence) (Object) var10_ref.substring(0, 4);
                                                int discarded$19 = 38;
                                                var5_int = td.a(var23);
                                                decompiledRegionSelector0 = 1;
                                                break L6;
                                              }
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      decompiledRegionSelector0 = 0;
                                      break L6;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L10: {
                                      var11 = (Exception) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 0;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var9++;
                                    continue L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L11: {
                                L12: {
                                  if (var6 == 0) {
                                    break L12;
                                  } else {
                                    if (var5_int >= 4000) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                ((wl) this).field_J = false;
                                break L11;
                              }
                              L13: {
                                if (var7 != 0) {
                                  break L13;
                                } else {
                                  if (var6 != 0) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (var5_int < 7000) {
                                        break L14;
                                      } else {
                                        if (7999 >= var5_int) {
                                          ((wl) this).field_M = false;
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    if (var5_int < 7000) {
                                      break L13;
                                    } else {
                                      if (var5_int <= 9250) {
                                        ((wl) this).field_G = false;
                                        break L13;
                                      } else {
                                        break L13;
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
                        L15: {
                          if (((wl) this).field_B.indexOf("intel") == -1) {
                            break L15;
                          } else {
                            ((wl) this).field_A = false;
                            break L15;
                          }
                        }
                        L16: {
                          stackOut_62_0 = this;
                          stackIn_64_0 = stackOut_62_0;
                          stackIn_63_0 = stackOut_62_0;
                          if (((wl) this).field_B.equals((Object) (Object) "s3 graphics")) {
                            stackOut_64_0 = this;
                            stackOut_64_1 = 0;
                            stackIn_65_0 = stackOut_64_0;
                            stackIn_65_1 = stackOut_64_1;
                            break L16;
                          } else {
                            stackOut_63_0 = this;
                            stackOut_63_1 = 1;
                            stackIn_65_0 = stackOut_63_0;
                            stackIn_65_1 = stackOut_63_1;
                            break L16;
                          }
                        }
                        L17: {
                          ((wl) this).field_Eb = stackIn_65_1 != 0;
                          if (!((wl) this).field_M) {
                            break L17;
                          } else {
                            try {
                              L18: {
                                var17 = new int[1];
                                jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
                                break L18;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              var5 = decompiledCaughtException;
                              throw new RuntimeException("");
                            }
                            break L17;
                          }
                        }
                        L19: {
                          int discarded$20 = 1;
                          int discarded$21 = 0;
                          fr.a(false);
                          ((wl) this).field_S = true;
                          ((wl) this).field_X = new eb((wl) this, ((wl) this).field_a);
                          int discarded$22 = -26394;
                          this.x();
                          ((wl) this).field_cc = new cs((wl) this);
                          ((wl) this).field_pc = new lu((wl) this);
                          if (!((wl) this).field_pc.b(1)) {
                            break L19;
                          } else {
                            ((wl) this).field_yb = new hp((wl) this);
                            if (!((wl) this).field_yb.e(0)) {
                              ((wl) this).field_yb.a((byte) -31);
                              ((wl) this).field_yb = null;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                        }
                        ((wl) this).field_vb = new vr((wl) this);
                        this.f((byte) -66);
                        int discarded$23 = -11103;
                        this.s();
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
          L20: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var4_ref;
            stackOut_78_1 = new StringBuilder().append("wl.<init>(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L20;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L20;
            }
          }
          L21: {
            stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(44);
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param1 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L21;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L21;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + 44 + param2 + 41);
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (((wl) this).field_kc.b()) {
            return;
          } else {
            int incrementValue$7 = var2;
            var2++;
            if (incrementValue$7 > 5) {
              throw new RuntimeException("");
            } else {
              int discarded$8 = 0;
              wf.a(1000L);
              continue L0;
            }
          }
        }
    }

    private final void a(float param0, float param1, float param2) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (((wl) this).field_Bc) {
            jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param1, param2, param0);
        jaggl.OpenGL.glMatrixMode(5888);
        ((wl) this).field_Bc = true;
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        L0: {
          L1: {
            int discarded$1 = 1;
            this.j();
            ((wl) this).b((byte) -122, param5);
            var7 = (float)param2 - (float)param0;
            var8 = (float)param3 - (float)param1;
            if (0.0f != var7) {
              break L1;
            } else {
              if (0.0f != var8) {
                break L1;
              } else {
                var7 = 1.0f;
                break L0;
              }
            }
          }
          var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var8 = var8 * var9;
          var7 = var7 * var9;
          break L0;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
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
        L0: {
          if (param0 >= 0) {
            break L0;
          } else {
            param0 = 0;
            break L0;
          }
        }
        L1: {
          if (((wl) this).field_bb >= param3) {
            break L1;
          } else {
            param3 = ((wl) this).field_bb;
            break L1;
          }
        }
        L2: {
          if (param2 <= ((wl) this).field_ec) {
            break L2;
          } else {
            param2 = ((wl) this).field_ec;
            break L2;
          }
        }
        L3: {
          if (param1 < 0) {
            param1 = 0;
            break L3;
          } else {
            break L3;
          }
        }
        ((wl) this).field_e = param1;
        ((wl) this).field_Q = param3;
        ((wl) this).field_d = param2;
        ((wl) this).field_L = param0;
        jaggl.OpenGL.glEnable(3089);
        int discarded$2 = 5149;
        this.m();
        int discarded$3 = 0;
        this.v();
    }

    final q c(boolean param0) {
        q stackIn_6_0 = null;
        q stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        L0: {
          if (param0) {
            break L0;
          } else {
            ((wl) this).a(108, (byte) -128);
            break L0;
          }
        }
        L1: {
          if (((wl) this).field_cb != null) {
            stackOut_5_0 = ((wl) this).field_cb.b((byte) 127);
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackIn_6_0 = (q) (Object) stackOut_3_0;
            break L1;
          }
        }
        return stackIn_6_0;
    }

    final void a(byte param0) {
        L0: {
          if (((wl) this).field_O != 4) {
            this.h(-84);
            this.a(false, false);
            this.b(false, (byte) -125);
            this.c(false, param0 ^ -117);
            this.a(false, (byte) -28);
            this.g(-2, -100);
            ((wl) this).b((byte) -103, 1);
            ((wl) this).field_O = 4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == 10) {
            break L1;
          } else {
            ((wl) this).g(9);
            break L1;
          }
        }
    }

    private final void f() {
        boolean discarded$0 = ((wl) this).field_kc.a();
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 1;
        this.j();
        ((wl) this).b((byte) 35, param4);
        float var6 = 0.3499999940395355f + (float)param0;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
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
        if (param1 == 1) {
          return 7681;
        } else {
          if (param1 != 0) {
            if (param1 == 2) {
              return 34165;
            } else {
              if (param1 != 3) {
                if (param1 != 4) {
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
        L0: {
          if (((wl) this).field_Pb == 0) {
            L1: {
              var4 = 0;
              if (((wl) this).field_Bb != param0) {
                jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
                ((wl) this).field_Bb = param0;
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == ((wl) this).field_W) {
                break L2;
              } else {
                jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
                ((wl) this).field_W = param2;
                var4 = 1;
                break L2;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              ((wl) this).field_O = ((wl) this).field_O & -30;
              break L0;
            }
          } else {
            jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
            jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
            break L0;
          }
        }
        L3: {
          if (param1 == -26625) {
            break L3;
          } else {
            ((wl) this).field_Xb = 59;
            break L3;
          }
        }
    }

    private final void o() {
        jaggl.OpenGL.glViewport(((wl) this).field_wc, ((wl) this).field_T, ((wl) this).field_ec, ((wl) this).field_bb);
    }

    final void a(za param0) {
        RuntimeException var2 = null;
        du var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((wl) this).field_mb = ((im) (Object) param0).field_g;
              if (null == ((wl) this).field_gb) {
                L2: {
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
                    break L2;
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
                    break L2;
                  }
                }
                ((wl) this).field_gb = ((wl) this).a((byte) -49, 20, var3.field_f, var3.field_g, false);
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
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("wl.NA(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final synchronized void d(int param0, int param1) {
        int var3 = 19 / ((param0 - -68) / 56);
        wf var4 = new wf();
        var4.field_b = (long)param1;
        ((wl) this).field_dc.a(110, var4);
    }

    private final void l() {
        ((wl) this).field_d = ((wl) this).field_ec;
        ((wl) this).field_Q = ((wl) this).field_bb;
        ((wl) this).field_L = 0;
        ((wl) this).field_e = 0;
        jaggl.OpenGL.glDisable(3089);
        int discarded$0 = 5149;
        this.m();
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
          if (var2 < 0) {
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
                if (var3 >= 8) {
                  jaggl.OpenGL.glEnable(16384);
                  jaggl.OpenGL.glEnable(16385);
                  jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                  jaggl.OpenGL.glFogi(2917, 9729);
                  jaggl.OpenGL.glHint(3156, 4353);
                  ((wl) this).field_F = -1;
                  int discarded$1 = 24643;
                  this.l();
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

    private final void a(boolean param0, int param1, byte param2) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        uh var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          var13 = AceOfSkies.field_G ? 1 : 0;
          if (param2 > 124) {
            break L0;
          } else {
            field_Ub = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 != ((wl) this).field_kb) {
              break L2;
            } else {
              L3: {
                if (((wl) this).field_qc) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L3;
                }
              }
              L4: {
                stackOut_7_0 = stackIn_7_0;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (((wl) this).field_vc) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L4;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  break L4;
                }
              }
              if (stackIn_11_0 != stackIn_11_1) {
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
              stackOut_16_0 = 3;
              stackIn_17_0 = stackOut_16_0;
              break L5;
            } else {
              stackOut_14_0 = 0;
              stackIn_17_0 = stackOut_14_0;
              break L5;
            }
          }
          L6: {
            var9 = stackIn_17_0;
            if (param1 >= 0) {
              L7: {
                L8: {
                  var5 = (Object) (Object) ((wl) this).field_X.a(param1, (byte) 14);
                  var10 = ((wl) this).field_a.a(false, param1);
                  if (0 != var10.field_n) {
                    break L8;
                  } else {
                    if (0 != var10.field_j) {
                      break L8;
                    } else {
                      this.q(67);
                      break L7;
                    }
                  }
                }
                L9: {
                  if (!var10.field_o) {
                    stackOut_27_0 = 128;
                    stackIn_28_0 = stackOut_27_0;
                    break L9;
                  } else {
                    stackOut_25_0 = 64;
                    stackIn_28_0 = stackOut_25_0;
                    break L9;
                  }
                }
                var11 = stackIn_28_0;
                var12 = 50 * var11;
                int discarded$1 = 5888;
                this.a(0.0f, (float)(((wl) this).field_hb % var12 * var10.field_n) / (float)var12, (float)(var10.field_j * (((wl) this).field_hb % var12)) / (float)var12);
                break L7;
              }
              var6 = var10.field_e;
              if (!((wl) this).field_qc) {
                var8 = var10.field_h;
                var7 = var10.field_s;
                var9 = var10.field_c;
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
            ((wl) this).field_vb.a(var9, true, 2147483647, var8, param0, var7);
            if (((wl) this).field_vb.a(var6, -1896, (rt) var5)) {
              break L10;
            } else {
              ((wl) this).a((rt) var5, 1);
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
          L1: {
            if (!((wl) this).field_ac) {
              break L1;
            } else {
              if (!((wl) this).field_xc) {
                jaggl.OpenGL.glEnable(2896);
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glDisable(2896);
          break L0;
        }
    }

    final void b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_18_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_21_0 = false;
        int stackIn_21_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        boolean stackOut_17_0 = false;
        boolean stackOut_20_0 = false;
        int stackOut_20_1 = 0;
        boolean stackOut_18_0 = false;
        int stackOut_18_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          var6 = AceOfSkies.field_G ? 1 : 0;
          if (((wl) this).field_Cb == param1) {
            break L0;
          } else {
            L1: {
              if (param1 != 1) {
                if (2 != param1) {
                  if (param1 == 128) {
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
              stackIn_11_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (((wl) this).field_hc) {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              } else {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = 1;
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_12_0 != stackIn_12_1) {
                break L3;
              } else {
                L4: {
                  jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
                  stackOut_13_0 = this;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (var3 == 0) {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L4;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L4;
                  }
                }
                ((wl) this).field_hc = stackIn_16_1 != 0;
                break L3;
              }
            }
            L5: {
              stackOut_17_0 = ((wl) this).field_k;
              stackIn_20_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (var4 != 0) {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L5;
              } else {
                stackOut_18_0 = stackIn_18_0;
                stackOut_18_1 = 1;
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                break L5;
              }
            }
            L6: {
              if ((stackIn_21_0 ? 1 : 0) == stackIn_21_1) {
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
                  stackOut_27_0 = this;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (var4 == 0) {
                    stackOut_29_0 = this;
                    stackOut_29_1 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    break L8;
                  } else {
                    stackOut_28_0 = this;
                    stackOut_28_1 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    break L8;
                  }
                }
                ((wl) this).field_k = stackIn_30_1 != 0;
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (((wl) this).field_z == var5) {
                break L9;
              } else {
                L10: {
                  if (var5 != 1) {
                    if (2 == var5) {
                      jaggl.OpenGL.glEnable(3042);
                      jaggl.OpenGL.glBlendFunc(1, 1);
                      break L10;
                    } else {
                      if (var5 != 3) {
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
        L0: {
          if (((wl) this).field_d <= param2) {
            break L0;
          } else {
            ((wl) this).field_d = param2;
            break L0;
          }
        }
        L1: {
          if (((wl) this).field_Q > param3) {
            ((wl) this).field_Q = param3;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1 > ((wl) this).field_e) {
            ((wl) this).field_e = param1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0 <= ((wl) this).field_L) {
            break L3;
          } else {
            ((wl) this).field_L = param0;
            break L3;
          }
        }
        jaggl.OpenGL.glEnable(3089);
        int discarded$2 = 5149;
        this.m();
        int discarded$3 = 0;
        this.v();
    }

    final synchronized void a(long param0, int param1) {
        if (param1 != 3) {
            return;
        }
        wf var4 = new wf();
        var4.field_b = param0;
        ((wl) this).field_f.a(param1 + 98, var4);
    }

    private final void v() {
        L0: {
          L1: {
            if (((wl) this).field_d < ((wl) this).field_L) {
              break L1;
            } else {
              if (((wl) this).field_e > ((wl) this).field_Q) {
                break L1;
              } else {
                jaggl.OpenGL.glScissor(((wl) this).field_wc + ((wl) this).field_L, -((wl) this).field_Q + ((wl) this).field_bb + ((wl) this).field_T, -((wl) this).field_L + ((wl) this).field_d, ((wl) this).field_Q + -((wl) this).field_e);
                break L0;
              }
            }
          }
          jaggl.OpenGL.glScissor(0, 0, 0, 0);
          break L0;
        }
    }

    private final void n() {
        L0: {
          L1: {
            if (!((wl) this).field_tc) {
              break L1;
            } else {
              if (((wl) this).field_C >= 0) {
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
    }

    final void g(int param0) {
        L0: {
          if (((wl) this).field_O != 2) {
            this.h(-109);
            this.a(false, false);
            this.b(false, (byte) -125);
            this.c(false, -128);
            this.a(false, (byte) -28);
            this.g(-2, 115);
            ((wl) this).field_O = 2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == 1025208104) {
            break L1;
          } else {
            this.f((byte) 124);
            break L1;
          }
        }
    }

    final void b(byte param0, up param1) {
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((wl) this).field_i) {
                this.a((byte) -94, param1);
                this.a(param1, (byte) 49);
                break L1;
              } else {
                L2: {
                  if (((wl) this).field_rc < 0) {
                    break L2;
                  } else {
                    if (((wl) this).field_Jb[((wl) this).field_rc] == param1) {
                      int fieldTemp$5 = ((wl) this).field_rc;
                      ((wl) this).field_rc = ((wl) this).field_rc - 1;
                      ((wl) this).field_Jb[fieldTemp$5] = null;
                      param1.b(10383);
                      if (((wl) this).field_rc < 0) {
                        ((wl) this).field_Rb = null;
                        ((wl) this).field_qb = null;
                        break L1;
                      } else {
                        ((wl) this).field_qb = ((wl) this).field_Jb[((wl) this).field_rc];
                        ((wl) this).field_Rb = ((wl) this).field_Jb[((wl) this).field_rc];
                        ((wl) this).field_Rb.a(param0 ^ 18952);
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                throw new RuntimeException();
              }
            }
            L3: {
              if (param0 == -113) {
                break L3;
              } else {
                ((wl) this).field_v = true;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("wl.HB(").append(param0).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
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
            if (((wl) this).field_Y >= 3) {
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
              int fieldTemp$1 = ((wl) this).field_Y + 1;
              ((wl) this).field_Y = ((wl) this).field_Y + 1;
              ((wl) this).field_ob[fieldTemp$1] = param1;
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
            stackOut_10_1 = new StringBuilder().append("wl.KC(").append(-4).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final void a(int param0, byte param1) {
        int var4 = 0;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          if (1 != param0) {
            if (param0 != 0) {
              if (param0 != 2) {
                if (param0 != 3) {
                  if (4 != param0) {
                    break L0;
                  } else {
                    ((wl) this).a(34023, param1 ^ 26662, 34023);
                    break L0;
                  }
                } else {
                  ((wl) this).a(260, -26625, 8448);
                  break L0;
                }
              } else {
                ((wl) this).a(34165, -26625, 7681);
                break L0;
              }
            } else {
              ((wl) this).a(8448, -26625, 8448);
              break L0;
            }
          } else {
            ((wl) this).a(7681, -26625, 7681);
            break L0;
          }
        }
        L1: {
          if (param1 == -39) {
            break L1;
          } else {
            this.a(-44, -126, true);
            break L1;
          }
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
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("wl.MC(").append(param0).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final void a(byte param0, boolean param1) {
        Object var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        L0: {
          if (param1) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_4_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_4_0 = stackIn_4_0;
          stackIn_7_0 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if (((wl) this).field_xc) {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L1;
          } else {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 1;
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            break L1;
          }
        }
        L2: {
          if (stackIn_8_0 != stackIn_8_1) {
            L3: {
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (!param1) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L3;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L3;
              }
            }
            ((wl) this).field_xc = stackIn_13_1 != 0;
            this.b((byte) -67);
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          if (param0 == -126) {
            break L4;
          } else {
            var4 = null;
            ((wl) this).a((byte) -46, (fq) null);
            break L4;
          }
        }
    }

    private final int w() {
        return ((wl) this).field_ib - (-((wl) this).field_lb + -((wl) this).field_yc);
    }

    final void a(up param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (((wl) this).field_i) {
                this.b(param0, param1 ^ 32993);
                this.a(-4, param0);
                break L1;
              } else {
                if (((wl) this).field_rc < 3) {
                  L2: {
                    if (((wl) this).field_rc >= 0) {
                      ((wl) this).field_Jb[((wl) this).field_rc].b(param1 ^ 43026);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  int fieldTemp$1 = ((wl) this).field_rc + 1;
                  ((wl) this).field_rc = ((wl) this).field_rc + 1;
                  ((wl) this).field_Jb[fieldTemp$1] = param0;
                  ((wl) this).field_qb = param0;
                  ((wl) this).field_Rb = param0;
                  ((wl) this).field_Rb.a(param1 + -51990);
                  break L1;
                } else {
                  throw new RuntimeException();
                }
              }
            }
            L3: {
              if (param1 == 32925) {
                break L3;
              } else {
                ((wl) this).field_D = -1.2460601329803467f;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("wl.PC(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
    }

    private final void c(boolean param0, int param1) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          if (((wl) this).field_P == param0) {
            break L0;
          } else {
            L1: {
              if (!param0) {
                jaggl.OpenGL.glDisable(2929);
                break L1;
              } else {
                jaggl.OpenGL.glEnable(2929);
                break L1;
              }
            }
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
            ((wl) this).field_P = stackIn_8_1 != 0;
            ((wl) this).field_O = ((wl) this).field_O & -32;
            break L0;
          }
        }
        L3: {
          if (param1 <= -126) {
            break L3;
          } else {
            ((wl) this).field_dc = null;
            break L3;
          }
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
          int discarded$4 = 3;
          this.u();
          int discarded$5 = 5149;
          this.m();
          if (((wl) this).field_N == 3) {
            this.d(5888);
            break L0;
          } else {
            if (((wl) this).field_N != 2) {
              break L0;
            } else {
              this.d((byte) 90);
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
              if (var2 <= 0) {
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
                      if (var2 <= 0) {
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
                          if (var2 <= 0) {
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
                                          int discarded$5 = 8705;
                                          if (this.w() <= 100663296) {
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
                                        var12 = (iq) (Object) ((wl) this).field_Gc.e(124);
                                        jaggl.OpenGL.glDeleteLists((int)var12.field_b, var12.field_f);
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var11 = ((wl) this).field_f.e(127);
                                    jaggl.OpenGL.glDeleteObjectARB(var11.field_b);
                                    continue L10;
                                  }
                                }
                              } else {
                                var10 = ((wl) this).field_dc.e(121);
                                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_b);
                                continue L9;
                              }
                            }
                          } else {
                            var9 = (iq) (Object) ((wl) this).field_Gc.e(121);
                            jaggl.OpenGL.glDeleteLists((int)var9.field_b, var9.field_f);
                            continue L8;
                          }
                        }
                      } else {
                        var8 = (iq) (Object) ((wl) this).field_Gb.e(127);
                        int incrementValue$6 = var2;
                        var2++;
                        in.field_b[incrementValue$6] = (int)var8.field_b;
                        ((wl) this).field_yc = ((wl) this).field_yc - var8.field_f;
                        if (var2 == 1000) {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, in.field_b, 0);
                          var2 = 0;
                          continue L6;
                        } else {
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var7 = (iq) (Object) ((wl) this).field_zb.e(124);
                    int incrementValue$7 = var2;
                    var2++;
                    in.field_b[incrementValue$7] = var7.field_f;
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
                  var6 = (iq) (Object) ((wl) this).field_Ac.e(121);
                  int incrementValue$8 = var2;
                  var2++;
                  in.field_b[incrementValue$8] = (int)var6.field_b;
                  ((wl) this).field_lb = ((wl) this).field_lb - var6.field_f;
                  if (var2 != 1000) {
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
              var5 = (iq) (Object) ((wl) this).field_nb.e(123);
              int incrementValue$9 = var2;
              var2++;
              in.field_b[incrementValue$9] = (int)var5.field_b;
              ((wl) this).field_ib = ((wl) this).field_ib - var5.field_f;
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
        bg.field_a[3] = (float)(param1 >>> 24) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, bg.field_a, 0);
    }

    private final void i(int param0) {
        ((wl) this).field_pb[14] = ((wl) this).field_ab;
        ((wl) this).field_pb[10] = ((wl) this).field_fb;
    }

    private final void j() {
        L0: {
          if (((wl) this).field_O != 1) {
            this.h(-114);
            this.a(false, false);
            this.b(false, (byte) -125);
            this.c(false, -128);
            this.a(false, (byte) -28);
            ((wl) this).a((rt) null, 1);
            this.g(-2, 103);
            ((wl) this).a(1, (byte) -39);
            ((wl) this).field_O = 1;
            break L0;
          } else {
            break L0;
          }
        }
    }

    private final void a(up param0, byte param1) {
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
                    if (((wl) this).field_Y >= 0) {
                      ((wl) this).field_qb = ((wl) this).field_ob[((wl) this).field_Y];
                      ((wl) this).field_qb.c(-1122);
                      break L3;
                    } else {
                      ((wl) this).field_qb = null;
                      break L3;
                    }
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
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("wl.LB(");
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    private final void a(boolean param0, byte param1) {
        int stackIn_6_0 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          if (param0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          } else {
            stackOut_3_0 = 1;
            stackIn_6_0 = stackOut_3_0;
            break L0;
          }
        }
        L1: {
          if (stackIn_6_0 == (((wl) this).field_uc ? 1 : 0)) {
            L2: {
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (!param0) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L2;
              }
            }
            ((wl) this).field_uc = stackIn_12_1 != 0;
            this.r(-126);
            ((wl) this).field_O = ((wl) this).field_O & -32;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void c() {
        wf var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var1 = ((wl) this).field_jb.d(268435455);
        L0: while (true) {
          if (var1 == null) {
            L1: {
              if (((wl) this).field_pc == null) {
                break L1;
              } else {
                ((wl) this).field_pc.a(1);
                break L1;
              }
            }
            L2: {
              if (((wl) this).field_kc != null) {
                int discarded$1 = 8960;
                this.f();
                var1_ref = ((wl) this).field_R.keys();
                L3: while (true) {
                  if (!var1_ref.hasMoreElements()) {
                    ((wl) this).field_kc.release();
                    ((wl) this).field_kc = null;
                    break L2;
                  } else {
                    var2 = (java.awt.Canvas) var1_ref.nextElement();
                    var3 = (Long) ((wl) this).field_R.get((Object) (Object) var2);
                    ((wl) this).field_kc.releaseSurface(var2, var3.longValue());
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (!((wl) this).field_S) {
                break L4;
              } else {
                da.a(120, true, false);
                ((wl) this).field_S = false;
                break L4;
              }
            }
            return;
          } else {
            ((im) (Object) var1).a(-125);
            var1 = ((wl) this).field_jb.b((byte) 103);
            continue L0;
          }
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
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        L0: {
          var7 = 0.3499999940395355f + (float)param0;
          var8 = (float)param1 + 0.3499999940395355f;
          var9 = -1.0f + (var7 + (float)param2);
          var10 = -1.0f + (var8 + (float)param3);
          int discarded$2 = 1;
          this.j();
          ((wl) this).b((byte) -124, param5);
          jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
          if (((wl) this).field_I) {
            jaggl.OpenGL.glDisable(32925);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          jaggl.OpenGL.glBegin(2);
          jaggl.OpenGL.glVertex2f(var7, var8);
          jaggl.OpenGL.glVertex2f(var7, var10);
          jaggl.OpenGL.glVertex2f(var9, var10);
          jaggl.OpenGL.glVertex2f(var9, var8);
          jaggl.OpenGL.glEnd();
          if (((wl) this).field_I) {
            jaggl.OpenGL.glEnable(32925);
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final void d(byte param0) {
        L0: {
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadMatrixf(((wl) this).field_pb, 0);
          jaggl.OpenGL.glMatrixMode(5888);
          if (param0 > 30) {
            break L0;
          } else {
            int discarded$2 = 1;
            this.a(false, -1, (byte) 62);
            break L0;
          }
        }
    }

    private final void a(byte param0, up param1) {
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
            L1: {
              if (((wl) this).field_fc < 0) {
                break L1;
              } else {
                if (((wl) this).field_Fc[((wl) this).field_fc] == param1) {
                  int fieldTemp$2 = ((wl) this).field_fc;
                  ((wl) this).field_fc = ((wl) this).field_fc - 1;
                  ((wl) this).field_Fc[fieldTemp$2] = null;
                  param1.a((byte) 97);
                  L2: {
                    if (0 <= ((wl) this).field_fc) {
                      ((wl) this).field_Rb = ((wl) this).field_Fc[((wl) this).field_fc];
                      ((wl) this).field_Rb.c((byte) 109);
                      break L2;
                    } else {
                      ((wl) this).field_Rb = null;
                      break L2;
                    }
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
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("wl.BD(").append(-94).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    private final void r(int param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
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
                stackIn_5_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        jaggl.OpenGL.glDepthMask(stackIn_5_0 != 0);
    }

    final int e(int param0, int param1) {
        if (param1 == 6406) {
          return 1;
        } else {
          if (param1 != 6409) {
            L0: {
              if (param1 == 6410) {
                break L0;
              } else {
                if (param1 == 34846) {
                  break L0;
                } else {
                  if (34844 == param1) {
                    break L0;
                  } else {
                    if (param1 == 6407) {
                      return 3;
                    } else {
                      L1: {
                        if (6408 == param1) {
                          break L1;
                        } else {
                          if (param1 == 34847) {
                            break L1;
                          } else {
                            if (param1 != 34843) {
                              if (param1 != 34842) {
                                if (6402 != param1) {
                                  if (param1 != 6401) {
                                    L2: {
                                      if (param0 == -32334) {
                                        break L2;
                                      } else {
                                        ((wl) this).field_Vb = null;
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
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        L0: {
          var7 = (float)param0 + 0.3499999940395355f;
          var8 = (float)param1 + 0.3499999940395355f;
          var9 = var7 + (float)param2;
          int discarded$2 = 1;
          this.j();
          var10 = var8 + (float)param3;
          ((wl) this).b((byte) -118, param5);
          jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
          if (!((wl) this).field_I) {
            break L0;
          } else {
            jaggl.OpenGL.glDisable(32925);
            break L0;
          }
        }
        L1: {
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glVertex2f(var7, var8);
          jaggl.OpenGL.glVertex2f(var7, var10);
          jaggl.OpenGL.glVertex2f(var9, var10);
          jaggl.OpenGL.glVertex2f(var9, var8);
          jaggl.OpenGL.glEnd();
          if (((wl) this).field_I) {
            jaggl.OpenGL.glEnable(32925);
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final void u() {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        var2 = ((wl) this).field_pb;
        var3 = (float)(((wl) this).field_db * -((wl) this).field_Ib) / (float)((wl) this).field_ub;
        var4 = (float)((-((wl) this).field_Ib + ((wl) this).field_ec) * ((wl) this).field_db) / (float)((wl) this).field_ub;
        var5 = (float)(((wl) this).field_db * ((wl) this).field_jc) / (float)((wl) this).field_mc;
        var6 = (float)(((wl) this).field_db * (-((wl) this).field_bb + ((wl) this).field_jc)) / (float)((wl) this).field_mc;
        L0: {
          L1: {
            if (var4 == var3) {
              break L1;
            } else {
              if (var5 == var6) {
                break L1;
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
                break L0;
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
          break L0;
        }
        this.i(121);
    }

    final fq a(byte param0, int param1, byte[] param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        lk stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        om stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_5_0 = null;
        om stackOut_10_0 = null;
        Object stackOut_8_0 = null;
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
                stackOut_5_0 = new lk((wl) this, param1, param2, param3, param4);
                stackIn_6_0 = stackOut_5_0;
                return (fq) (Object) stackIn_6_0;
              }
            }
            if (param0 == -49) {
              stackOut_10_0 = new om((wl) this, param1, param2, param3);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (fq) (Object) stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("wl.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 44 + param4 + 41);
        }
        return (fq) (Object) stackIn_11_0;
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return (pa) (Object) stackIn_1_0;
    }

    private final void d(int param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        L0: {
          var2 = (float)(-((wl) this).field_Ib) * ((wl) this).field_sc / (float)((wl) this).field_ub;
          var3 = (float)(-((wl) this).field_jc) * ((wl) this).field_sc / (float)((wl) this).field_mc;
          var4 = ((wl) this).field_sc * (float)(((wl) this).field_ec + -((wl) this).field_Ib) / (float)((wl) this).field_ub;
          var5 = (float)(((wl) this).field_bb + -((wl) this).field_jc) * ((wl) this).field_sc / (float)((wl) this).field_mc;
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          if (var4 == var2) {
            break L0;
          } else {
            if (var5 != var3) {
              jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)((wl) this).field_db, (double)((wl) this).field_Ob);
              break L0;
            } else {
              break L0;
            }
          }
        }
        jaggl.OpenGL.glMatrixMode(5888);
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
        L0: {
          ((wl) this).field_t = -((wl) this).field_Zb + (float)(((wl) this).field_Ob - ((wl) this).field_oc);
          ((wl) this).field_Tb = ((wl) this).field_t - (float)((wl) this).field_C * ((wl) this).field_D;
          if ((float)((wl) this).field_db > ((wl) this).field_Tb) {
            ((wl) this).field_Tb = (float)((wl) this).field_db;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 <= -83) {
            break L1;
          } else {
            ((wl) this).field_G = true;
            break L1;
          }
        }
        jaggl.OpenGL.glFogf(2915, ((wl) this).field_Tb);
        jaggl.OpenGL.glFogf(2916, ((wl) this).field_t);
        bg.field_a[2] = (float)pg.a(255, ((wl) this).field_F) / 255.0f;
        bg.field_a[1] = (float)pg.a(((wl) this).field_F, 65280) / 65280.0f;
        bg.field_a[0] = (float)pg.a(((wl) this).field_F, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, bg.field_a, 0);
    }

    final void a(boolean param0, int param1) {
        L0: {
          if (param1 == ((wl) this).field_Pb) {
            break L0;
          } else {
            jaggl.OpenGL.glActiveTexture(param1 + 33984);
            ((wl) this).field_Pb = param1;
            break L0;
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            ((wl) this).field_mb = null;
            break L1;
          }
        }
    }

    final void b(int param0, int param1) throws lp {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            ((wl) this).field_kc.swapBuffers();
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = (Exception) (Object) decompiledCaughtException;
            break L1;
          }
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
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return (sm) (Object) stackIn_1_0;
    }

    final synchronized void c(int param0, int param1, int param2) {
        iq var4 = new iq(param1);
        var4.field_b = (long)param0;
        int var5 = 112 % ((param2 - -54) / 58);
        ((wl) this).field_nb.a(96, (wf) (Object) var4);
    }

    final static int t() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            rb var2 = null;
            int stackIn_16_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_42_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_39_0 = 0;
            if (ul.field_r.field_j >= 4) {
              if (ul.field_r.field_e == -1) {
                return 3;
              } else {
                if (ul.field_r.field_e != -2) {
                  return 1;
                } else {
                  return 4;
                }
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (bm.field_z == 0) {
                      wu.field_l = cs.field_d.a(2, hi.field_x, l.field_f);
                      bm.field_z = bm.field_z + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (bm.field_z != 1) {
                      break L2;
                    } else {
                      if (wu.field_l.field_a == 2) {
                        stackOut_15_0 = tj.a(-112, -1);
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      } else {
                        if (wu.field_l.field_a != 1) {
                          break L2;
                        } else {
                          bm.field_z = bm.field_z + 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (2 == bm.field_z) {
                      du.field_m = new vf((java.net.Socket) wu.field_l.field_f, cs.field_d);
                      var2 = new rb(13);
                      tr.a(var2, uk.field_g, ob.field_e, nm.field_b, 0);
                      var2.b(-1336879960, 15);
                      var2.a((byte) 20, si.field_c);
                      du.field_m.a(13, 0, 41, var2.field_f);
                      bm.field_z = bm.field_z + 1;
                      gb.field_j = 30000L + kh.a(-70);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (bm.field_z != 3) {
                      break L4;
                    } else {
                      if (du.field_m.b(-120) <= 0) {
                        if (~kh.a(-116) < ~gb.field_j) {
                          stackOut_36_0 = tj.a(-126, -2);
                          stackIn_37_0 = stackOut_36_0;
                          return stackIn_37_0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = du.field_m.a((byte) -116);
                        if (var1_int != 0) {
                          stackOut_30_0 = tj.a(92, var1_int);
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        } else {
                          bm.field_z = bm.field_z + 1;
                          break L4;
                        }
                      }
                    }
                  }
                  if (4 != bm.field_z) {
                    stackOut_41_0 = -1;
                    stackIn_42_0 = stackOut_41_0;
                    break L0;
                  } else {
                    ul.field_r.a(3006, rs.field_C, (Object) (Object) du.field_m);
                    wu.field_l = null;
                    bm.field_z = 0;
                    du.field_m = null;
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    return stackIn_40_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return tj.a(107, -3);
              }
              return stackIn_42_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(boolean param0, byte param1) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          if (((wl) this).field_ac != param0) {
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
            ((wl) this).field_ac = stackIn_6_1 != 0;
            this.b((byte) -67);
            ((wl) this).field_O = ((wl) this).field_O & -8;
            break L0;
          } else {
            break L0;
          }
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
            ((wl) this).field_gb = null;
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
        RuntimeException runtimeException = null;
        Object var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                var3 = null;
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
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("wl.UB(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final boolean d() {
        int stackIn_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            if (((wl) this).field_yb == null) {
              break L1;
            } else {
              if (!((wl) this).field_yb.a(-118)) {
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L0;
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_7_0 != 0;
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
        if (!((wl) this).field_Eb) {
          return;
        } else {
          L0: {
            if (((wl) this).field_ec <= 0) {
              break L0;
            } else {
              if (0 >= ((wl) this).field_bb) {
                break L0;
              } else {
                var1 = ((wl) this).field_L;
                var2 = ((wl) this).field_d;
                var3 = ((wl) this).field_e;
                var4 = ((wl) this).field_Q;
                int discarded$1 = 24643;
                this.l();
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
          }
          return;
        }
    }

    final void a(pa param0, boolean param1) {
        RuntimeException var3 = null;
        gt var3_ref = null;
        cu var3_ref2 = null;
        wt var4 = null;
        int var6 = 0;
        gt var7 = null;
        gt var8 = null;
        cu var9 = null;
        cu var10 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
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
                        var3_ref2 = (cu) (Object) ((wl) this).field_s.a((byte) 106, (long)(((wl) this).field_j.a() << 16 | ((wl) this).field_j.b()));
                        if (null == var3_ref2) {
                          var9 = new cu((wl) this, 6402, ((wl) this).field_j.a(), ((wl) this).field_j.b());
                          var3_ref2 = var9;
                          ((wl) this).field_rb = ((wl) this).field_rb + var9.field_o;
                          L5: while (true) {
                            L6: {
                              if (((wl) this).field_rb <= 2097152) {
                                break L6;
                              } else {
                                var4 = ((wl) this).field_Ec.a(3);
                                if (null == var4) {
                                  break L6;
                                } else {
                                  var10 = (cu) (Object) var4;
                                  var10.d(-128);
                                  var10.c(-126);
                                  var10.d((byte) -108);
                                  ((wl) this).field_rb = ((wl) this).field_rb - var10.field_o;
                                  continue L5;
                                }
                              }
                            }
                            ((wl) this).field_s.a(106, (long)(((wl) this).field_j.a() << 16 | ((wl) this).field_j.b()), (wf) (Object) var9);
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      ((wl) this).field_Ec.a((wt) (Object) var3_ref2, (byte) 123);
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
                if (!((wl) this).field_Mb) {
                  throw new RuntimeException("");
                } else {
                  L7: {
                    var3_ref = (gt) (Object) ((wl) this).field_s.a((byte) 106, (long)(((wl) this).field_j.a() << 16 | ((wl) this).field_j.b()));
                    if (null != var3_ref) {
                      break L7;
                    } else {
                      var7 = new gt((wl) this, ((wl) this).field_j.a(), ((wl) this).field_j.b());
                      var3_ref = var7;
                      ((wl) this).field_rb = ((wl) this).field_rb + var7.field_n * 4;
                      L8: while (true) {
                        L9: {
                          if (((wl) this).field_rb <= 2097152) {
                            break L9;
                          } else {
                            var4 = ((wl) this).field_Ec.a(3);
                            if (var4 != null) {
                              var8 = (gt) (Object) var4;
                              var8.d(-127);
                              var8.c(-126);
                              ((wl) this).field_kc.releasePbuffer(var8.f(25766));
                              ((wl) this).field_rb = ((wl) this).field_rb - var8.field_n;
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((wl) this).field_s.a(115, (long)(((wl) this).field_j.a() << 16 | ((wl) this).field_j.b()), (wf) (Object) var7);
                        break L7;
                      }
                    }
                  }
                  ((wl) this).field_Ec.a((wt) (Object) var3_ref, (byte) 125);
                  ((wl) this).field_kc.setPbuffer(var3_ref.f(25766));
                  break L1;
                }
              }
            }
            ((wl) this).field_ec = param0.a();
            ((wl) this).field_bb = param0.b();
            this.p(-123);
            int discarded$2 = 0;
            this.o();
            int discarded$3 = 24643;
            this.l();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("wl.R(");
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L10;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param1 + 41);
        }
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
              boolean discarded$19 = ((wl) this).field_kc.setSurface(((wl) this).field_gc);
              break L0;
            }
          }
        }
        ((wl) this).field_bb = ((wl) this).field_Yb;
        ((wl) this).field_ec = ((wl) this).field_g;
        ((wl) this).field_j = null;
        this.p(47);
        int discarded$20 = 0;
        this.o();
        int discarded$21 = 24643;
        this.l();
    }

    private final void a(boolean param0, boolean param1) {
        if (param1 != ((wl) this).field_tc) {
            ((wl) this).field_tc = param1 ? true : false;
            int discarded$0 = -1;
            this.n();
            ((wl) this).field_O = ((wl) this).field_O & -32;
        }
    }

    final int[] Y() {
        return new int[]{((wl) this).field_Ib, ((wl) this).field_jc, ((wl) this).field_ub, ((wl) this).field_mc};
    }

    private final void h(int param0) {
        L0: {
          if (((wl) this).field_N == 1) {
            break L0;
          } else {
            L1: {
              jaggl.OpenGL.glMatrixMode(5889);
              jaggl.OpenGL.glLoadIdentity();
              if (0 >= ((wl) this).field_ec) {
                break L1;
              } else {
                if (((wl) this).field_bb <= 0) {
                  break L1;
                } else {
                  jaggl.OpenGL.glOrtho(0.0, (double)((wl) this).field_ec, (double)((wl) this).field_bb, 0.0, -1.0, 1.0);
                  break L1;
                }
              }
            }
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            ((wl) this).field_N = 1;
            ((wl) this).field_O = ((wl) this).field_O & -25;
            break L0;
          }
        }
        L2: {
          if (param0 <= -49) {
            break L2;
          } else {
            field_m = null;
            break L2;
          }
        }
    }

    private final void s() {
        java.awt.Dimension var2 = null;
        L0: {
          if (null != ((wl) this).field_Wb) {
            var2 = ((wl) this).field_Wb.getSize();
            ((wl) this).field_Yb = var2.height;
            ((wl) this).field_g = var2.width;
            break L0;
          } else {
            ((wl) this).field_Yb = 0;
            ((wl) this).field_g = 0;
            break L0;
          }
        }
        L1: {
          if (((wl) this).field_qb != null) {
            break L1;
          } else {
            ((wl) this).field_ec = ((wl) this).field_g;
            ((wl) this).field_bb = ((wl) this).field_Yb;
            int discarded$2 = 0;
            this.o();
            break L1;
          }
        }
        this.p(-98);
        int discarded$3 = 24643;
        this.l();
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
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
        return (da) (Object) stackIn_1_0;
    }

    private final int e(byte param0) {
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        NumberFormatException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int[] var10 = null;
        int stackIn_32_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var2 = 0;
          ((wl) this).field_B = jaggl.OpenGL.glGetString(7936).toLowerCase();
          ((wl) this).field_sb = jaggl.OpenGL.glGetString(7937).toLowerCase();
          if (((wl) this).field_B.indexOf("microsoft") != -1) {
            var2 = var2 | 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (((wl) this).field_B.indexOf("brian paul") != -1) {
              break L2;
            } else {
              if (((wl) this).field_B.indexOf("mesa") != -1) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          var2 = var2 | 1;
          break L1;
        }
        L3: {
          var3 = jaggl.OpenGL.glGetString(7938);
          var4 = ee.a((byte) 10, ' ', var3.replace('.', ' '));
          if (var4.length < 2) {
            var2 = var2 | 4;
            break L3;
          } else {
            try {
              L4: {
                int discarded$3 = 38;
                var5_int = td.a((CharSequence) (Object) var4[0]);
                int discarded$4 = 38;
                var6 = td.a((CharSequence) (Object) var4[1]);
                ((wl) this).field_Z = var6 + 10 * var5_int;
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var5 = (NumberFormatException) (Object) decompiledCaughtException;
                var2 = var2 | 4;
                break L5;
              }
            }
            break L3;
          }
        }
        L6: {
          if (12 <= ((wl) this).field_Z) {
            break L6;
          } else {
            var2 = var2 | 2;
            break L6;
          }
        }
        L7: {
          if (((wl) this).field_kc.a("GL_ARB_multitexture")) {
            break L7;
          } else {
            var2 = var2 | 8;
            break L7;
          }
        }
        L8: {
          if (!((wl) this).field_kc.a("GL_ARB_texture_env_combine")) {
            var2 = var2 | 32;
            break L8;
          } else {
            break L8;
          }
        }
        var10 = new int[1];
        jaggl.OpenGL.glGetIntegerv(34018, var10, 0);
        L9: {
          L10: {
            ((wl) this).field_Xb = var10[0];
            jaggl.OpenGL.glGetIntegerv(34929, var10, 0);
            ((wl) this).field_Sb = var10[0];
            jaggl.OpenGL.glGetIntegerv(34930, var10, 0);
            ((wl) this).field_K = var10[0];
            if (((wl) this).field_Xb < 2) {
              break L10;
            } else {
              if (((wl) this).field_Sb < 2) {
                break L10;
              } else {
                if (2 > ((wl) this).field_K) {
                  break L10;
                } else {
                  break L9;
                }
              }
            }
          }
          var2 = var2 | 16;
          break L9;
        }
        L11: {
          ((wl) this).field_V = jaclib.memory.Stream.b();
          ((wl) this).field_Mb = ((wl) this).field_kc.arePbuffersAvailable();
          ((wl) this).field_M = ((wl) this).field_kc.a("GL_ARB_vertex_buffer_object");
          ((wl) this).field_I = ((wl) this).field_kc.a("GL_ARB_multisample");
          ((wl) this).field_x = ((wl) this).field_kc.a("GL_ARB_vertex_program");
          boolean discarded$5 = ((wl) this).field_kc.a("GL_ARB_fragment_program");
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
          if (var2 == 0) {
            stackOut_31_0 = 0;
            stackIn_32_0 = stackOut_31_0;
            break L11;
          } else {
            stackOut_30_0 = var2;
            stackIn_32_0 = stackOut_30_0;
            break L11;
          }
        }
        return stackIn_32_0;
    }

    private final void g(int param0, int param1) {
        this.a(-2, 4873, true);
        int var3 = -24 % ((param1 - 44) / 50);
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
            stackOut_2_1 = new StringBuilder().append("wl.SA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param5 + 44 + param6 + 41);
        }
    }

    private final void b(up param0, int param1) {
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
                  boolean discarded$2 = ((wl) this).c((byte) -104);
                  break L2;
                }
              }
              int fieldTemp$3 = ((wl) this).field_fc + 1;
              ((wl) this).field_fc = ((wl) this).field_fc + 1;
              ((wl) this).field_Fc[fieldTemp$3] = param0;
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("wl.QB(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
    }

    final gd a(int param0, int param1) {
        return null;
    }

    final int i() {
        return ((wl) this).field_db;
    }

    private final void p(int param0) {
        int var2 = 0;
        L0: {
          if (((wl) this).field_N != 0) {
            ((wl) this).field_O = ((wl) this).field_O & -32;
            ((wl) this).field_N = 0;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = 39 % ((param0 - -31) / 58);
    }

    final za c(int param0) {
        im var2 = new im(param0);
        ((wl) this).field_jb.a(87, (wf) (Object) var2);
        return (za) (Object) var2;
    }

    private final void x() {
        ((wl) this).field_bc = new rt[((wl) this).field_Xb];
        ((wl) this).field_Vb = new nr((wl) this, 3553, 6408, 1, 1);
        nr discarded$26 = new nr((wl) this, 3553, 6408, 1, 1);
        nr discarded$27 = new nr((wl) this, 3553, 6408, 1, 1);
        L0: {
          nb discarded$28 = new nb((wl) this);
          nb discarded$29 = new nb((wl) this);
          nb discarded$30 = new nb((wl) this);
          nb discarded$31 = new nb((wl) this);
          nb discarded$32 = new nb((wl) this);
          nb discarded$33 = new nb((wl) this);
          nb discarded$34 = new nb((wl) this);
          nb discarded$35 = new nb((wl) this);
          nb discarded$36 = new nb((wl) this);
          nb discarded$37 = new nb((wl) this);
          if (((wl) this).field_A) {
            ((wl) this).field_o = new wj((wl) this);
            wj discarded$38 = new wj((wl) this);
            break L0;
          } else {
            break L0;
          }
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
