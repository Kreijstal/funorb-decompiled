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
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
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
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        pa stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        pa stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new int[param0.field_h * param0.field_c];
              var12 = var10;
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
                    var7 = 0;
                    L3: while (true) {
                      if (param0.field_h <= var7) {
                        var6_int++;
                        continue L2;
                      } else {
                        incrementValue$3 = var5;
                        var5++;
                        var3_array[incrementValue$3] = vo.a(param0.field_f[pg.a(255, (int) param0.field_d[var4])], param0.field_e[var4] << -1389705736);
                        var4++;
                        var7++;
                        continue L3;
                      }
                    }
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
                          incrementValue$4 = var4;
                          var4++;
                          var8 = param0.field_f[param0.field_d[incrementValue$4] & 255];
                          incrementValue$5 = var5;
                          var5++;
                          stackOut_6_0 = (int[]) (var10);
                          stackOut_6_1 = incrementValue$5;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var8 == 0) {
                            stackOut_8_0 = (int[]) ((Object) stackIn_8_0);
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L6;
                          } else {
                            stackOut_7_0 = (int[]) ((Object) stackIn_7_0);
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = vo.a(var8, -16777216);
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L6;
                          }
                        }
                        stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            var6 = this.a(97, param0.field_c, var12, 0, param0.field_h, param0.field_h);
            var6.a(param0.field_a, param0.field_i, param0.field_g, param0.field_b);
            stackOut_17_0 = (pa) (var6);
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("wl.HA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (param0 != this.field_db) {
              break L1;
            } else {
              if (this.field_Ob != param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          this.field_db = param0;
          this.field_Ob = param1;
          this.u(3);
          this.k(-107);
          if (this.field_N == 3) {
            this.d(5888);
            break L0;
          } else {
            if (2 == this.field_N) {
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
        for (var7 = 0; param1 > var7; var7++) {
            jaggl.OpenGL.glReadPixelsi(param0, -param4 + (this.field_bb - var7), param3, 1, 32993, this.field_tb, var10, var7 * param3);
        }
        return var10;
    }

    private final void a(int param0, int param1, boolean param2) {
        this.a(true, param0, (byte) 125, param2);
        if (param1 != 4873) {
            this.c(80, -100);
        }
    }

    final void a(rt param0, int param1) {
        rt var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 1) {
              L1: {
                var3 = this.field_bc[this.field_Pb];
                if (param0 != var3) {
                  L2: {
                    if (param0 == null) {
                      jaggl.OpenGL.glDisable(var3.field_f);
                      break L2;
                    } else {
                      L3: {
                        if (var3 == null) {
                          jaggl.OpenGL.glEnable(param0.field_f);
                          break L3;
                        } else {
                          if (param0.field_f != var3.field_f) {
                            jaggl.OpenGL.glDisable(var3.field_f);
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
                  this.field_bc[this.field_Pb] = param0;
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_O = this.field_O & -2;
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
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("wl.TA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void m(int param0) {
        if (param0 != 5149) {
            this.c(-102, -84);
        }
    }

    wl(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        long dupTemp$9 = 0L;
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
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_48_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        String var13_ref = null;
        var18 = null;
        var19 = null;
        var20 = null;
        this.field_R = new Hashtable();
        this.field_Ab = 128;
        this.field_q = new jk();
        tj discarded$5 = new tj();
        tj discarded$6 = new tj();
        this.field_S = false;
        this.field_jb = new kp();
        this.field_Fc = new up[4];
        this.field_Y = -1;
        this.field_rc = -1;
        this.field_fc = -1;
        this.field_ob = new up[4];
        this.field_Jb = new up[4];
        this.field_Ec = new er();
        this.field_s = new ph(16);
        this.field_Gc = new kp();
        this.field_nb = new kp();
        this.field_Ac = new kp();
        this.field_zb = new kp();
        this.field_Gb = new kp();
        this.field_dc = new kp();
        this.field_f = new kp();
        tj discarded$7 = new tj();
        this.field_h = new tj();
        this.field_H = new tj();
        this.field_Lb = 0;
        this.field_Bb = 8448;
        this.field_ic = 1.0f;
        this.field_w = 1.0f;
        this.field_db = 50;
        this.field_U = -1;
        this.field_D = 1.0f;
        this.field_d = 0;
        this.field_L = 0;
        this.field_p = true;
        this.field_wb = 1.0f;
        this.field_W = 8448;
        this.field_wc = 0;
        this.field_Ib = 0;
        this.field_sc = 1.0f;
        this.field_ub = 512;
        this.field_pb = new float[16];
        this.field_oc = 0;
        this.field_T = 0;
        this.field_e = 0;
        this.field_C = -1;
        this.field_F = -1;
        this.field_vc = false;
        this.field_jc = 0;
        this.field_Dc = -1;
        this.field_mc = 512;
        this.field_n = new float[4];
        this.field_Ob = 3584;
        this.field_Zb = 0.0f;
        this.field_Q = 0;
        du discarded$8 = new du(8192);
        try {
          L0: {
            this.field_Wb = param0;
            this.field_Hb = param2;
            if (ei.a("jaclib", (byte) -16)) {
              if (ei.a("jaggl", (byte) -16)) {
                try {
                  L1: {
                    this.field_kc = new jaggl.OpenGL();
                    dupTemp$9 = this.field_kc.init(param0, 8, 8, 8, 24, 0, this.field_Hb);
                    this.field_Db = dupTemp$9;
                    this.field_gc = dupTemp$9;
                    if (0L != this.field_Db) {
                      this.b(false);
                      var4_int = this.e((byte) -94);
                      if (-1 == (var4_int ^ -1)) {
                        L2: {
                          stackOut_9_0 = this;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (!this.field_V) {
                            stackOut_11_0 = this;
                            stackOut_11_1 = 5121;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            break L2;
                          } else {
                            stackOut_10_0 = this;
                            stackOut_10_1 = 33639;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            break L2;
                          }
                        }
                        L3: {
                          ((wl) (this)).field_tb = stackIn_12_1;
                          if ((this.field_sb.indexOf("radeon") ^ -1) == 0) {
                            break L3;
                          } else {
                            var5_int = 0;
                            var6 = 0;
                            var7 = 0;
                            var8_array = ee.a((byte) 10, ' ', this.field_sb.replace('/', ' '));
                            var9 = 0;
                            L4: while (true) {
                              L5: {
                                if (var8_array.length <= var9) {
                                  break L5;
                                } else {
                                  var13_ref = var8_array[var9];
                                  var10_ref = var13_ref;
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
                                                var21 = (CharSequence) ((Object) var13_ref.substring(1, 3));
                                                if (!vl.a(10, var21)) {
                                                  break L8;
                                                } else {
                                                  var7 = 1;
                                                  var10_ref = var13_ref.substring(1);
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                          if (var10_ref.equals("hd")) {
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
                                              var22 = (CharSequence) ((Object) var10_ref.substring(0, 4));
                                              if (!vl.a(10, var22)) {
                                                break L7;
                                              } else {
                                                var23 = (CharSequence) ((Object) var10_ref.substring(0, 4));
                                                var5_int = td.a(var23, (byte) 38);
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
                                    if ((var5_int ^ -1) <= -4001) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                this.field_J = false;
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
                                      if ((var5_int ^ -1) > -7001) {
                                        break L14;
                                      } else {
                                        if (7999 < var5_int) {
                                          break L14;
                                        } else {
                                          this.field_M = false;
                                          break L14;
                                        }
                                      }
                                    }
                                    if ((var5_int ^ -1) > -7001) {
                                      break L13;
                                    } else {
                                      if (var5_int > 9250) {
                                        break L13;
                                      } else {
                                        this.field_G = false;
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_u = this.field_u & this.field_kc.a("GL_ARB_half_float_pixel");
                              this.field_xb = this.field_M;
                              break L3;
                            }
                          }
                        }
                        L15: {
                          if ((this.field_B.indexOf("intel") ^ -1) == 0) {
                            break L15;
                          } else {
                            this.field_A = false;
                            break L15;
                          }
                        }
                        L16: {
                          stackOut_48_0 = this;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_49_0 = stackOut_48_0;
                          if (this.field_B.equals("s3 graphics")) {
                            stackOut_50_0 = this;
                            stackOut_50_1 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            break L16;
                          } else {
                            stackOut_49_0 = this;
                            stackOut_49_1 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            break L16;
                          }
                        }
                        L17: {
                          ((wl) (this)).field_Eb = stackIn_51_1 != 0;
                          if (!this.field_M) {
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
                          fr.a(false, 0, true);
                          this.field_S = true;
                          this.field_X = new eb((wl) (this), this.field_a);
                          this.x(-26394);
                          this.field_cc = new cs((wl) (this));
                          this.field_pc = new lu((wl) (this));
                          if (!this.field_pc.b(1)) {
                            break L19;
                          } else {
                            this.field_yb = new hp((wl) (this));
                            if (this.field_yb.e(0)) {
                              break L19;
                            } else {
                              this.field_yb.a((byte) -31);
                              this.field_yb = null;
                              break L19;
                            }
                          }
                        }
                        this.field_vb = new vr((wl) (this));
                        this.f((byte) -66);
                        this.s(-11103);
                        this.e();
                        break L1;
                      } else {
                        throw new RuntimeException("");
                      }
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var4 = decompiledCaughtException;
                  var4.printStackTrace();
                  this.c();
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
            stackOut_61_0 = (RuntimeException) (var4_ref);
            stackOut_61_1 = new StringBuilder().append("wl.<init>(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L20;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L20;
            }
          }
          L21: {
            stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L21;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L21;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        int incrementValue$0 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0) {
            this.d(56);
        }
        int var2 = 0;
        while (!this.field_kc.b()) {
            incrementValue$0 = var2;
            var2++;
            if (!(incrementValue$0 <= 5)) {
                throw new RuntimeException("");
            }
            wf.a(1000L, false);
        }
    }

    private final void a(float param0, float param1, float param2, int param3) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (this.field_Bc) {
            jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param1, param2, param0);
        jaggl.OpenGL.glMatrixMode(param3);
        this.field_Bc = true;
    }

    final void K(int[] param0) {
        try {
            param0[3] = this.field_Q;
            param0[0] = this.field_L;
            param0[2] = this.field_d;
            param0[1] = this.field_e;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "wl.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        L0: {
          L1: {
            this.j(1);
            this.b((byte) -122, param5);
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
        this.field_Ac.a(80, var4);
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (this.field_bb < param3) {
            param3 = this.field_bb;
        }
        if (param2 > this.field_ec) {
            param2 = this.field_ec;
        }
        if (!(-1 >= (param1 ^ -1))) {
            param1 = 0;
        }
        this.field_e = param1;
        this.field_Q = param3;
        this.field_d = param2;
        this.field_L = param0;
        jaggl.OpenGL.glEnable(3089);
        this.m(5149);
        this.v(0);
    }

    final q c(boolean param0) {
        if (!param0) {
            this.a(108, (byte) -128);
        }
        return this.field_cb == null ? null : this.field_cb.b((byte) 127);
    }

    final void a(byte param0) {
        if (!(-5 == (this.field_O ^ -1))) {
            this.h(-84);
            this.a(false, false);
            this.b(false, (byte) -125);
            this.c(false, param0 ^ -117);
            this.a(false, (byte) -28);
            this.g(-2, -100);
            this.b((byte) -103, 1);
            this.field_O = 4;
        }
        if (param0 != 10) {
            this.g(9);
        }
    }

    private final void f(int param0) {
        if (param0 != 8960) {
            this.d(-118);
        }
        boolean discarded$0 = this.field_kc.a();
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.j(1);
        this.b((byte) 35, param4);
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
        if (this.field_Pb != 0) {
            jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
            jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
        } else {
            var4 = 0;
            if (!(this.field_Bb == param0)) {
                jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
                this.field_Bb = param0;
                var4 = 1;
            }
            if (param2 != this.field_W) {
                jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
                this.field_W = param2;
                var4 = 1;
            }
            if (var4 != 0) {
                this.field_O = this.field_O & -30;
            }
        }
        if (param1 != -26625) {
            this.field_Xb = 59;
        }
    }

    private final void o(int param0) {
        if (param0 != 0) {
            this.field_kc = (jaggl.OpenGL) null;
        }
        jaggl.OpenGL.glViewport(this.field_wc, this.field_T, this.field_ec, this.field_bb);
    }

    final void a(za param0) {
        hl discarded$2 = null;
        hl discarded$3 = null;
        RuntimeException var2 = null;
        du var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
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
              this.field_mb = ((im) ((Object) param0)).field_g;
              if (null == this.field_gb) {
                L2: {
                  var3 = new du(80);
                  if (!this.field_V) {
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
                this.field_gb = this.a((byte) -49, 20, var3.field_f, var3.field_g, false);
                discarded$2 = new hl(this.field_gb, 5126, 3, 0);
                discarded$3 = new hl(this.field_gb, 5126, 2, 12);
                this.field_q.a((byte) 102, (wl) (this));
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
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("wl.NA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final synchronized void d(int param0, int param1) {
        int var3 = 19 / ((param0 - -68) / 56);
        wf var4 = new wf();
        var4.field_b = (long)param1;
        this.field_dc.a(110, var4);
    }

    private final void l(int param0) {
        this.field_d = this.field_ec;
        if (param0 != 24643) {
            return;
        }
        this.field_Q = this.field_bb;
        this.field_L = 0;
        this.field_e = 0;
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
        var2 = this.field_Xb - 1;
        L0: while (true) {
          if ((var2 ^ -1) > -1) {
            this.a(8448, param0 ^ 26689, 8448);
            this.a(34168, 770, param0 + 34242, 2);
            this.q(-127);
            this.field_Cb = 1;
            jaggl.OpenGL.glEnable(3042);
            jaggl.OpenGL.glBlendFunc(770, 771);
            this.field_z = 1;
            jaggl.OpenGL.glEnable(3008);
            jaggl.OpenGL.glAlphaFunc(516, 0.0f);
            this.field_k = true;
            jaggl.OpenGL.glColorMask(true, true, true, true);
            this.field_hc = true;
            this.a(false, true);
            this.b(true, (byte) -125);
            this.c(true, param0 + -61);
            this.a(true, (byte) -28);
            if (param0 == -66) {
              this.p(param0 + 189);
              this.field_kc.setSwapInterval(0);
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
                  this.field_F = -1;
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
            this.a(false, var2);
            this.a((rt) null, 1);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            var2--;
            continue L0;
          }
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
            if (param1 != this.field_kb) {
              break L2;
            } else {
              L3: {
                if (this.field_qc) {
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
                if (this.field_vc) {
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
            if (this.field_qc) {
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
                  var5 = this.field_X.a(param1, (byte) 14);
                  var10 = this.field_a.a(false, param1);
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
                this.a(0.0f, (float)(this.field_hb % var12 * var10.field_n) / (float)var12, (float)(var10.field_j * (this.field_hb % var12)) / (float)var12, 5888);
                break L7;
              }
              var6 = var10.field_e;
              if (!this.field_qc) {
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
            this.field_vb.a(var9, param3, 2147483647, var8, param0, var7);
            if (this.field_vb.a(var6, -1896, (rt) (var5))) {
              break L10;
            } else {
              this.a((rt) (var5), 1);
              this.a(var6, (byte) -39);
              break L10;
            }
          }
          this.field_vc = this.field_qc;
          this.field_kb = param1;
          break L1;
        }
        this.field_O = this.field_O & -8;
    }

    private final void b(byte param0) {
        L0: {
          if (param0 == -67) {
            break L0;
          } else {
            this.a((byte) -71);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_ac) {
              break L2;
            } else {
              if (!this.field_xc) {
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
          if (this.field_Cb == param1) {
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
              if (this.field_hc) {
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
                ((wl) (this)).field_hc = stackIn_15_1 != 0;
                break L3;
              }
            }
            L5: {
              stackOut_16_0 = this.field_k;
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
                ((wl) (this)).field_k = stackIn_27_1 != 0;
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (this.field_z == var5) {
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
                this.field_z = var5;
                break L9;
              }
            }
            this.field_Cb = param1;
            this.field_O = this.field_O & -29;
            break L0;
          }
        }
        var3 = 78 / ((param0 - -41) / 36);
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (this.field_d > param2) {
            this.field_d = param2;
        }
        if (!(this.field_Q <= param3)) {
            this.field_Q = param3;
        }
        if (!(param1 <= this.field_e)) {
            this.field_e = param1;
        }
        if (param0 > this.field_L) {
            this.field_L = param0;
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
        this.field_f.a(param1 + 98, var4);
    }

    private final void v(int param0) {
        if (param0 == 0) {
          L0: {
            L1: {
              if (this.field_d < this.field_L) {
                break L1;
              } else {
                if (this.field_e > this.field_Q) {
                  break L1;
                } else {
                  jaggl.OpenGL.glScissor(this.field_wc + this.field_L, -this.field_Q + this.field_bb + this.field_T, -this.field_L + this.field_d, this.field_Q + -this.field_e);
                  break L0;
                }
              }
            }
            jaggl.OpenGL.glScissor(0, 0, 0, 0);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    private final void n(int param0) {
        L0: {
          L1: {
            if (!this.field_tc) {
              break L1;
            } else {
              if ((this.field_C ^ -1) <= -1) {
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
            this.a(-19, -108, -19);
            break L2;
          }
        }
    }

    final void g(int param0) {
        if (!((this.field_O ^ -1) == -3)) {
            this.h(-109);
            this.a(false, false);
            this.b(false, (byte) -125);
            this.c(false, -128);
            this.a(false, (byte) -28);
            this.g(-2, 115);
            this.field_O = 2;
        }
        if (param0 != 1025208104) {
            this.f((byte) 124);
        }
    }

    final void b(byte param0, up param1) {
        int fieldTemp$5 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_i) {
                this.a((byte) -94, param1);
                this.a(param1, (byte) 49);
                break L1;
              } else {
                L2: {
                  if (-1 < (this.field_rc ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_Jb[this.field_rc] == param1) {
                      fieldTemp$5 = this.field_rc;
                      this.field_rc = this.field_rc - 1;
                      this.field_Jb[fieldTemp$5] = null;
                      param1.b(10383);
                      if ((this.field_rc ^ -1) > -1) {
                        this.field_Rb = null;
                        this.field_qb = null;
                        break L1;
                      } else {
                        this.field_qb = this.field_Jb[this.field_rc];
                        this.field_Rb = this.field_Jb[this.field_rc];
                        this.field_Rb.a(param0 ^ 18952);
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
                this.field_v = true;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("wl.HB(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    private final void a(int param0, up param1) {
        int fieldTemp$0 = 0;
        try {
            if (!((this.field_Y ^ -1) > param0)) {
                throw new RuntimeException();
            }
            if (!(-1 < (this.field_Y ^ -1))) {
                this.field_ob[this.field_Y].b((byte) -40);
            }
            fieldTemp$0 = this.field_Y + 1;
            this.field_Y = this.field_Y + 1;
            this.field_ob[fieldTemp$0] = param1;
            this.field_qb = param1;
            this.field_qb.c(-1122);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "wl.KC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (1 == param0) {
            this.a(7681, -26625, 7681);
        } else {
            if (-1 == (param0 ^ -1)) {
                this.a(8448, -26625, 8448);
            } else {
                if (-3 == (param0 ^ -1)) {
                    this.a(34165, -26625, 7681);
                } else {
                    if (-4 == (param0 ^ -1)) {
                        this.a(260, -26625, 8448);
                    } else {
                        if (4 == param0) {
                            this.a(34023, param1 ^ 26662, 34023);
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
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param0 == -120) {
                break L1;
              } else {
                this.field_ob = (up[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_Qb != param1) {
                L3: {
                  if (!this.field_M) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glBindBufferARB(34962, param1.a(param0 + 6650));
                    break L3;
                  }
                }
                this.field_Qb = param1;
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
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("wl.MC(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        if (!((!param1 ? 1 : 0) == (!this.field_xc ? 1 : 0))) {
            this.field_xc = param1 ? true : false;
            this.b((byte) -67);
        }
        if (param0 != -126) {
            fq var4 = (fq) null;
            this.a((byte) -46, (fq) null);
        }
    }

    private final int w(int param0) {
        if (param0 != 8705) {
            this.field_ob = (up[]) null;
        }
        return this.field_ib - (-this.field_lb + -this.field_yc);
    }

    final void a(up param0, int param1) {
        int fieldTemp$2 = 0;
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              if (this.field_i) {
                this.b(param0, param1 ^ 32993);
                this.a(-4, param0);
                break L1;
              } else {
                if (this.field_rc < 3) {
                  L2: {
                    if (-1 >= (this.field_rc ^ -1)) {
                      this.field_Jb[this.field_rc].b(param1 ^ 43026);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  fieldTemp$2 = this.field_rc + 1;
                  this.field_rc = this.field_rc + 1;
                  this.field_Jb[fieldTemp$2] = param0;
                  this.field_qb = param0;
                  this.field_Rb = param0;
                  this.field_Rb.a(param1 + -51990);
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
                this.field_D = -1.2460601329803467f;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("wl.PC(");
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
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    private final void c(boolean param0, int param1) {
        if (this.field_P != param0) {
            if (param0) {
                jaggl.OpenGL.glEnable(2929);
            } else {
                jaggl.OpenGL.glDisable(2929);
            }
            this.field_P = param0 ? true : false;
            this.field_O = this.field_O & -32;
        }
        if (param1 > -126) {
            this.field_dc = (kp) null;
        }
    }

    final int XA() {
        return this.field_Ob;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        L0: {
          this.field_jc = param1;
          this.field_ub = param2;
          this.field_mc = param3;
          this.field_Ib = param0;
          this.u(3);
          this.m(5149);
          if (-4 == (this.field_N ^ -1)) {
            this.d(5888);
            break L0;
          } else {
            if (this.field_N == 2) {
              this.d((byte) 90);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    final synchronized void b(int param0) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
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
          if (this.field_nb.a(true)) {
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
              if (this.field_Ac.a(true)) {
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
                  if (this.field_zb.a(true)) {
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
                      if (this.field_Gb.a(true)) {
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
                          if (this.field_Gc.a(true)) {
                            L9: while (true) {
                              if (this.field_dc.a(true)) {
                                L10: while (true) {
                                  if (this.field_f.a(true)) {
                                    L11: while (true) {
                                      if (this.field_Gc.a(true)) {
                                        L12: {
                                          this.field_X.a(64);
                                          if (this.w(8705) <= 100663296) {
                                            break L12;
                                          } else {
                                            if (60000L + this.field_l >= kh.a(-57)) {
                                              break L12;
                                            } else {
                                              System.gc();
                                              this.field_l = kh.a(-109);
                                              break L12;
                                            }
                                          }
                                        }
                                        this.field_hb = param0;
                                        return;
                                      } else {
                                        var12 = (iq) ((Object) this.field_Gc.e(124));
                                        jaggl.OpenGL.glDeleteLists((int)var12.field_b, var12.field_f);
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var11 = this.field_f.e(127);
                                    jaggl.OpenGL.glDeleteObjectARB(var11.field_b);
                                    continue L10;
                                  }
                                }
                              } else {
                                var10 = this.field_dc.e(121);
                                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_b);
                                continue L9;
                              }
                            }
                          } else {
                            var9 = (iq) ((Object) this.field_Gc.e(121));
                            jaggl.OpenGL.glDeleteLists((int)var9.field_b, var9.field_f);
                            continue L8;
                          }
                        }
                      } else {
                        var8 = (iq) ((Object) this.field_Gb.e(127));
                        incrementValue$4 = var2;
                        var2++;
                        in.field_b[incrementValue$4] = (int)var8.field_b;
                        this.field_yc = this.field_yc - var8.field_f;
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
                    var7 = (iq) ((Object) this.field_zb.e(124));
                    incrementValue$5 = var2;
                    var2++;
                    in.field_b[incrementValue$5] = var7.field_f;
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
                var6 = (iq) ((Object) this.field_Ac.e(121));
                incrementValue$6 = var2;
                var2++;
                in.field_b[incrementValue$6] = (int)var6.field_b;
                this.field_lb = this.field_lb - var6.field_f;
                if (-1001 != (var2 ^ -1)) {
                  continue L2;
                } else {
                  jaggl.OpenGL.glDeleteTextures(var2, in.field_b, 0);
                  var2 = 0;
                  continue L2;
                }
              }
            }
          } else {
            var5 = (iq) ((Object) this.field_nb.e(123));
            incrementValue$7 = var2;
            var2++;
            in.field_b[incrementValue$7] = (int)var5.field_b;
            this.field_ib = this.field_ib - var5.field_f;
            if (1000 != var2) {
              continue L0;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, in.field_b, 0);
              var2 = 0;
              continue L0;
            }
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
            this.field_E = 48;
        }
        this.field_pb[14] = this.field_ab;
        this.field_pb[10] = this.field_fb;
    }

    private final void j(int param0) {
        if (!(this.field_O == param0)) {
            this.h(-114);
            this.a(false, false);
            this.b(false, (byte) -125);
            this.c(false, -128);
            this.a(false, (byte) -28);
            this.a((rt) null, param0 ^ 0);
            this.g(-2, 103);
            this.a(1, (byte) -39);
            this.field_O = 1;
        }
    }

    private final void a(up param0, byte param1) {
        int fieldTemp$2 = 0;
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
              if (-1 < (this.field_Y ^ -1)) {
                break L1;
              } else {
                if (param0 == this.field_ob[this.field_Y]) {
                  L2: {
                    fieldTemp$2 = this.field_Y;
                    this.field_Y = this.field_Y - 1;
                    this.field_ob[fieldTemp$2] = null;
                    param0.b((byte) -128);
                    if (param1 > 7) {
                      break L2;
                    } else {
                      this.field_ac = true;
                      break L2;
                    }
                  }
                  L3: {
                    if ((this.field_Y ^ -1) <= -1) {
                      this.field_qb = this.field_ob[this.field_Y];
                      this.field_qb.c(-1122);
                      break L3;
                    } else {
                      this.field_qb = null;
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
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("wl.LB(");
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        if (param1 != -28) {
            this.field_D = -1.1227154731750488f;
        }
        if (!((!param0 ? 1 : 0) != (this.field_uc ? 1 : 0))) {
            this.field_uc = param0 ? true : false;
            this.r(param1 ^ 102);
            this.field_O = this.field_O & -32;
        }
    }

    final void c() {
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        wf var1 = this.field_jb.d(268435455);
        while (var1 != null) {
            ((im) ((Object) var1)).a(-125);
            var1 = this.field_jb.b((byte) 103);
        }
        if (this.field_pc != null) {
            this.field_pc.a(1);
        }
        if (!(this.field_kc == null)) {
            this.f(8960);
            var1_ref = this.field_R.keys();
            while (var1_ref.hasMoreElements()) {
                var2 = (java.awt.Canvas) (var1_ref.nextElement());
                var3 = (Long) (this.field_R.get(var2));
                this.field_kc.releaseSurface(var2, var3.longValue());
            }
            this.field_kc.release();
            this.field_kc = null;
        }
        if (this.field_S) {
            da.a(120, true, false);
            this.field_S = false;
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -85) {
            this.r(8);
        }
        iq var3 = new iq(param1);
        this.field_zb.a(118, var3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = -1.0f + (var7 + (float)param2);
        float var10 = -1.0f + (var8 + (float)param3);
        this.j(1);
        this.b((byte) -124, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> -1199065968), (byte)(param4 >> -516294904), (byte)param4, (byte)(param4 >> 1702528024));
        if (!(!this.field_I)) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(2);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (!(!this.field_I)) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void d(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_pb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0 <= 30) {
            this.a(false, -1, (byte) 62, true);
        }
    }

    private final void a(byte param0, up param1) {
        int fieldTemp$2 = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
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
              if ((this.field_fc ^ -1) > -1) {
                break L1;
              } else {
                if (this.field_Fc[this.field_fc] == param1) {
                  fieldTemp$2 = this.field_fc;
                  this.field_fc = this.field_fc - 1;
                  this.field_Fc[fieldTemp$2] = null;
                  param1.a((byte) 97);
                  if (param0 == -94) {
                    L2: {
                      if (0 <= this.field_fc) {
                        this.field_Rb = this.field_Fc[this.field_fc];
                        this.field_Rb.c((byte) 109);
                        break L2;
                      } else {
                        this.field_Rb = null;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
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
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("wl.BD(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void r(int param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 70 % ((param0 - -17) / 58);
            if (!this.field_uc) {
              break L1;
            } else {
              if (!this.field_p) {
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
                                        this.field_Vb = (nr) null;
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
        this.b((byte) -118, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> -595524080), (byte)(param4 >> 1025208104), (byte)param4, (byte)(param4 >> -265091240));
        if (this.field_I) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (!(!this.field_I)) {
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
          var8 = this.field_pb;
          var2 = var8;
          var3 = (float)(this.field_db * -this.field_Ib) / (float)this.field_ub;
          var4 = (float)((-this.field_Ib + this.field_ec) * this.field_db) / (float)this.field_ub;
          var5 = (float)(this.field_db * this.field_jc) / (float)this.field_mc;
          var6 = (float)(this.field_db * (-this.field_bb + this.field_jc)) / (float)this.field_mc;
          if (param0 == 3) {
            break L0;
          } else {
            this.field_Eb = true;
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
                var7 = 2.0f * (float)this.field_db;
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
                this.field_fb = (float)(-(this.field_Ob + this.field_db)) / (float)(-this.field_db + this.field_Ob);
                var8[10] = (float)(-(this.field_Ob + this.field_db)) / (float)(-this.field_db + this.field_Ob);
                this.field_ab = -((float)this.field_Ob * var7) / (float)(-this.field_db + this.field_Ob);
                var8[14] = -((float)this.field_Ob * var7) / (float)(-this.field_db + this.field_Ob);
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
        RuntimeException var6 = null;
        lk stackIn_5_0 = null;
        fq stackIn_8_0 = null;
        om stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_4_0 = null;
        om stackOut_9_0 = null;
        fq stackOut_7_0 = null;
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
              if (!this.field_M) {
                break L1;
              } else {
                L2: {
                  if (!param4) {
                    break L2;
                  } else {
                    if (this.field_xb) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_4_0 = new lk((wl) (this), param1, param2, param3, param4);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            if (param0 == -49) {
              stackOut_9_0 = new om((wl) (this), param1, param2, param3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_7_0 = (fq) null;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("wl.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fq) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (fq) ((Object) stackIn_10_0);
          }
        }
    }

    final pa a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        tm stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        tm stackOut_0_0 = null;
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
            stackOut_0_0 = new tm((wl) (this), param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("wl.O(");
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
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (pa) ((Object) stackIn_1_0);
    }

    private final void d(int param0) {
        float var2 = (float)(-this.field_Ib) * this.field_sc / (float)this.field_ub;
        float var3 = (float)(-this.field_jc) * this.field_sc / (float)this.field_mc;
        float var4 = this.field_sc * (float)(this.field_ec + -this.field_Ib) / (float)this.field_ub;
        float var5 = (float)(this.field_bb + -this.field_jc) * this.field_sc / (float)this.field_mc;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (var4 != var2) {
            if (!(var5 == var3)) {
                jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field_db, (double)this.field_Ob);
            }
        }
        jaggl.OpenGL.glMatrixMode(param0);
    }

    final boolean c(byte param0) {
        if (param0 != 16) {
            return false;
        }
        return this.field_vb.a((byte) -118, 3);
    }

    private final void q(int param0) {
        if (this.field_Bc) {
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            this.field_Bc = false;
        }
        int var2 = -124 % ((param0 - 6) / 58);
    }

    final void a(float param0, float param1, int param2) {
        this.field_D = param0;
        if (param2 < 8) {
            return;
        }
        this.field_Zb = param1;
        this.k(-91);
    }

    private final void k(int param0) {
        this.field_t = -this.field_Zb + (float)(this.field_Ob - this.field_oc);
        this.field_Tb = this.field_t - (float)this.field_C * this.field_D;
        if (!((float)this.field_db <= this.field_Tb)) {
            this.field_Tb = (float)this.field_db;
        }
        if (param0 > -83) {
            this.field_G = true;
        }
        jaggl.OpenGL.glFogf(2915, this.field_Tb);
        jaggl.OpenGL.glFogf(2916, this.field_t);
        bg.field_a[2] = (float)pg.a(255, this.field_F) / 255.0f;
        bg.field_a[1] = (float)pg.a(this.field_F, 65280) / 65280.0f;
        bg.field_a[0] = (float)pg.a(this.field_F, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, bg.field_a, 0);
    }

    final void a(boolean param0, int param1) {
        if (param1 != this.field_Pb) {
            jaggl.OpenGL.glActiveTexture(param1 + 33984);
            this.field_Pb = param1;
        }
        if (param0) {
            this.field_mb = (jaclib.memory.heap.NativeHeap) null;
        }
    }

    final void b(int param0, int param1) throws lp {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            this.field_kc.swapBuffers();
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
        Object stackOut_0_0 = null;
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
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("wl.G(");
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
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return (sm) ((Object) stackIn_1_0);
    }

    final synchronized void c(int param0, int param1, int param2) {
        iq var4 = new iq(param1);
        var4.field_b = (long)param0;
        int var5 = 112 % ((param2 - -54) / 58);
        this.field_nb.a(96, var4);
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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_19_0 = 0;
            if ((ul.field_r.field_j ^ -1) <= -5) {
              if (ul.field_r.field_e == -1) {
                return 3;
              } else {
                if (1 != (ul.field_r.field_e ^ -1)) {
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
                    if (-2 != (bm.field_z ^ -1)) {
                      break L2;
                    } else {
                      if ((wu.field_l.field_a ^ -1) == -3) {
                        stackOut_14_0 = tj.a(-112, -1);
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
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
                  if (param0 == 19078) {
                    L3: {
                      if (2 == bm.field_z) {
                        du.field_m = new vf((java.net.Socket) (wu.field_l.field_f), cs.field_d);
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
                      if ((bm.field_z ^ -1) != -4) {
                        break L4;
                      } else {
                        if (-1 <= (du.field_m.b(-120) ^ -1)) {
                          if ((kh.a(-116) ^ -1L) < (gb.field_j ^ -1L)) {
                            stackOut_33_0 = tj.a(-126, -2);
                            stackIn_34_0 = stackOut_33_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L4;
                          }
                        } else {
                          var1_int = du.field_m.a((byte) -116);
                          if (-1 != (var1_int ^ -1)) {
                            stackOut_28_0 = tj.a(92, var1_int);
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            bm.field_z = bm.field_z + 1;
                            break L4;
                          }
                        }
                      }
                    }
                    if (4 != bm.field_z) {
                      stackOut_38_0 = -1;
                      stackIn_39_0 = stackOut_38_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      ul.field_r.a(param0 ^ 16696, rs.field_C, du.field_m);
                      wu.field_l = null;
                      bm.field_z = 0;
                      du.field_m = null;
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_19_0 = -63;
                    stackIn_20_0 = stackOut_19_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return tj.a(107, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_29_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_34_0;
                    } else {
                      if (decompiledRegionSelector0 == 4) {
                        return stackIn_37_0;
                      } else {
                        return stackIn_39_0;
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(boolean param0, byte param1) {
        if (!(this.field_ac == param0)) {
            this.field_ac = param0 ? true : false;
            this.b((byte) -67);
            this.field_O = this.field_O & -8;
        }
        if (param1 != -125) {
            pa var4 = (pa) null;
            this.a((pa) null, true);
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
            this.field_gb = (fq) null;
        }
        jaggl.OpenGL.glTexEnvi(8960, param2 + 34200, param0);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        za discarded$0 = null;
        if (param0 != -126) {
            discarded$0 = this.c(27);
        }
        iq var4 = new iq(param1);
        var4.field_b = (long)param2;
        this.field_Gb.a(93, var4);
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            if (param1 != -3) {
                java.awt.Component var3 = (java.awt.Component) null;
                wl.a((java.awt.Component) null, (byte) -81);
            }
            param0.removeKeyListener(ua.field_d);
            param0.removeFocusListener(ua.field_d);
            fb.field_a = -1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "wl.UB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d() {
        return this.field_yb != null && this.field_yb.a(-118);
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
        if (!this.field_Eb) {
          return;
        } else {
          L0: {
            if (-1 <= (this.field_ec ^ -1)) {
              break L0;
            } else {
              if (0 >= this.field_bb) {
                break L0;
              } else {
                var1 = this.field_L;
                var2 = this.field_d;
                var3 = this.field_e;
                var4 = this.field_Q;
                this.l(24643);
                jaggl.OpenGL.glReadBuffer(1028);
                jaggl.OpenGL.glDrawBuffer(1029);
                this.p(65);
                this.a(false, false);
                this.b(false, (byte) -125);
                this.c(false, -127);
                this.a(false, (byte) -28);
                this.a((rt) null, 1);
                this.g(-2, 126);
                this.a(1, (byte) -39);
                this.b((byte) -97, 0);
                jaggl.OpenGL.glMatrixMode(5889);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                jaggl.OpenGL.glMatrixMode(5888);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glRasterPos2i(0, 0);
                jaggl.OpenGL.glCopyPixels(0, 0, this.field_ec, this.field_bb, 6144);
                jaggl.OpenGL.glFlush();
                jaggl.OpenGL.glReadBuffer(1029);
                jaggl.OpenGL.glDrawBuffer(1029);
                this.KA(var1, var3, var2, var4);
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
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_j = (tm) ((Object) param0);
              if (this.field_A) {
                L2: {
                  if (null == this.field_y) {
                    this.field_y = new wj((wl) (this));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (this.field_qb != this.field_y) {
                  L3: {
                    this.a(this.field_y, 32925);
                    if (!param1) {
                      break L3;
                    } else {
                      L4: {
                        var3_ref2 = (cu) ((Object) this.field_s.a((byte) 106, (long)(this.field_j.a() << -1671693488 | this.field_j.b())));
                        if (var3_ref2 == null) {
                          var9 = new cu((wl) (this), 6402, this.field_j.a(), this.field_j.b());
                          var3_ref2 = var9;
                          this.field_rb = this.field_rb + var9.field_o;
                          L5: while (true) {
                            L6: {
                              if (-2097153 <= (this.field_rb ^ -1)) {
                                break L6;
                              } else {
                                var4 = this.field_Ec.a(3);
                                if (var4 == null) {
                                  break L6;
                                } else {
                                  var10 = (cu) ((Object) var4);
                                  var10.d(-128);
                                  var10.c(-126);
                                  var10.d((byte) -108);
                                  this.field_rb = this.field_rb - var10.field_o;
                                  continue L5;
                                }
                              }
                            }
                            this.field_s.a(106, (long)(this.field_j.a() << -1176907408 | this.field_j.b()), var9);
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      this.field_Ec.a(var3_ref2, (byte) 123);
                      this.field_y.a(var3_ref2, 8, (byte) 119);
                      break L3;
                    }
                  }
                  this.field_y.a(0, this.field_j.field_j, -5531);
                  break L1;
                } else {
                  throw new RuntimeException();
                }
              } else {
                if (!this.field_Mb) {
                  throw new RuntimeException("");
                } else {
                  L7: {
                    var3_ref = (gt) ((Object) this.field_s.a((byte) 106, (long)(this.field_j.a() << 1788082032 | this.field_j.b())));
                    if (var3_ref != null) {
                      break L7;
                    } else {
                      var7 = new gt((wl) (this), this.field_j.a(), this.field_j.b());
                      var3_ref = var7;
                      this.field_rb = this.field_rb + var7.field_n * 4;
                      L8: while (true) {
                        L9: {
                          if (this.field_rb <= 2097152) {
                            break L9;
                          } else {
                            var4 = this.field_Ec.a(3);
                            if (var4 != null) {
                              var8 = (gt) ((Object) var4);
                              var8.d(-127);
                              var8.c(-126);
                              this.field_kc.releasePbuffer(var8.f(25766));
                              this.field_rb = this.field_rb - var8.field_n;
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        this.field_s.a(115, (long)(this.field_j.a() << -218937200 | this.field_j.b()), var7);
                        break L7;
                      }
                    }
                  }
                  this.field_Ec.a(var3_ref, (byte) 125);
                  this.field_kc.setPbuffer(var3_ref.f(25766));
                  break L1;
                }
              }
            }
            this.field_ec = param0.a();
            this.field_bb = param0.b();
            this.p(-123);
            this.o(0);
            this.l(24643);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("wl.R(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
    }

    final void a() {
        boolean discarded$14 = false;
        L0: {
          if (this.field_A) {
            if (this.field_qb == this.field_y) {
              this.field_y.a(0, (byte) -54);
              this.field_y.a(8, (byte) -24);
              this.b((byte) -113, this.field_y);
              break L0;
            } else {
              throw new RuntimeException();
            }
          } else {
            if (!this.field_Mb) {
              throw new RuntimeException("");
            } else {
              this.field_j.b(this.field_ec, 0, 0, 0, 0, -14164, this.field_bb);
              discarded$14 = this.field_kc.setSurface(this.field_gc);
              break L0;
            }
          }
        }
        this.field_bb = this.field_Yb;
        this.field_ec = this.field_g;
        this.field_j = null;
        this.p(47);
        this.o(0);
        this.l(24643);
    }

    private final void a(boolean param0, boolean param1) {
        if (param1 != this.field_tc) {
            this.field_tc = param1 ? true : false;
            this.n(-1);
            this.field_O = this.field_O & -32;
        }
        if (param0) {
            this.c();
        }
    }

    final int[] Y() {
        return new int[]{this.field_Ib, this.field_jc, this.field_ub, this.field_mc};
    }

    private final void h(int param0) {
        if (this.field_N != 1) {
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glLoadIdentity();
            if (0 < this.field_ec) {
                if (this.field_bb > 0) {
                    jaggl.OpenGL.glOrtho(0.0, (double)this.field_ec, (double)this.field_bb, 0.0, -1.0, 1.0);
                }
            }
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            this.field_N = 1;
            this.field_O = this.field_O & -25;
        }
        if (param0 > -49) {
            field_m = (int[]) null;
        }
    }

    private final void s(int param0) {
        java.awt.Dimension var2 = null;
        if (null == this.field_Wb) {
            this.field_Yb = 0;
            this.field_g = 0;
        } else {
            var2 = this.field_Wb.getSize();
            this.field_Yb = var2.height;
            this.field_g = var2.width;
        }
        if (this.field_qb == null) {
            this.field_ec = this.field_g;
            this.field_bb = this.field_Yb;
            this.o(0);
        }
        this.p(-98);
        if (param0 != -11103) {
            this.f(-17, -62);
        }
        this.l(24643);
    }

    final void a(sm param0) {
    }

    final da a(vs param0, vd[] param1, boolean param2) {
        RuntimeException var4 = null;
        mu stackIn_1_0 = null;
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
        mu stackOut_0_0 = null;
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
            stackOut_0_0 = new mu((wl) (this), param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("wl.E(");
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
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return (da) ((Object) stackIn_1_0);
    }

    private final int e(byte param0) {
        boolean discarded$1 = false;
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
        int stackIn_29_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          var2 = 0;
          this.field_B = jaggl.OpenGL.glGetString(7936).toLowerCase();
          this.field_sb = jaggl.OpenGL.glGetString(7937).toLowerCase();
          if (0 != (this.field_B.indexOf("microsoft") ^ -1)) {
            var2 = var2 | 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_B.indexOf("brian paul") ^ -1) != 0) {
              break L2;
            } else {
              if (0 != (this.field_B.indexOf("mesa") ^ -1)) {
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
                var5_int = td.a((CharSequence) ((Object) var4[0]), (byte) 38);
                var6 = td.a((CharSequence) ((Object) var4[1]), (byte) 38);
                this.field_Z = var6 + 10 * var5_int;
                break L4;
              }
            } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
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
          if (12 <= this.field_Z) {
            break L6;
          } else {
            var2 = var2 | 2;
            break L6;
          }
        }
        L7: {
          if (this.field_kc.a("GL_ARB_multitexture")) {
            break L7;
          } else {
            var2 = var2 | 8;
            break L7;
          }
        }
        L8: {
          if (!this.field_kc.a("GL_ARB_texture_env_combine")) {
            var2 = var2 | 32;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var11 = new int[1];
          var9 = var11;
          var7 = var9;
          var13 = var7;
          jaggl.OpenGL.glGetIntegerv(34018, var13, 0);
          if (param0 == -94) {
            break L9;
          } else {
            this.field_pc = (lu) null;
            break L9;
          }
        }
        L10: {
          L11: {
            this.field_Xb = var11[0];
            jaggl.OpenGL.glGetIntegerv(34929, var11, 0);
            this.field_Sb = var11[0];
            jaggl.OpenGL.glGetIntegerv(34930, var11, 0);
            this.field_K = var11[0];
            if ((this.field_Xb ^ -1) > -3) {
              break L11;
            } else {
              if (-3 < (this.field_Sb ^ -1)) {
                break L11;
              } else {
                if (2 > this.field_K) {
                  break L11;
                } else {
                  break L10;
                }
              }
            }
          }
          var2 = var2 | 16;
          break L10;
        }
        L12: {
          this.field_V = jaclib.memory.Stream.b();
          this.field_Mb = this.field_kc.arePbuffersAvailable();
          this.field_M = this.field_kc.a("GL_ARB_vertex_buffer_object");
          this.field_I = this.field_kc.a("GL_ARB_multisample");
          this.field_x = this.field_kc.a("GL_ARB_vertex_program");
          discarded$1 = this.field_kc.a("GL_ARB_fragment_program");
          this.field_v = this.field_kc.a("GL_ARB_vertex_shader");
          this.field_lc = this.field_kc.a("GL_ARB_fragment_shader");
          this.field_G = this.field_kc.a("GL_EXT_texture3D");
          this.field_u = this.field_kc.a("GL_ARB_texture_rectangle");
          this.field_nc = this.field_kc.a("GL_ARB_texture_cube_map");
          this.field_J = this.field_kc.a("GL_ARB_texture_float");
          this.field_Cc = false;
          this.field_A = this.field_kc.a("GL_EXT_framebuffer_object");
          this.field_i = this.field_kc.a("GL_EXT_framebuffer_blit");
          this.field_Nb = this.field_kc.a("GL_EXT_framebuffer_multisample");
          this.field_eb = rr.field_b.startsWith("mac");
          jaggl.OpenGL.glGetFloatv(2834, bg.field_a, 0);
          if (var2 == 0) {
            stackOut_28_0 = 0;
            stackIn_29_0 = stackOut_28_0;
            break L12;
          } else {
            stackOut_27_0 = var2;
            stackIn_29_0 = stackOut_27_0;
            break L12;
          }
        }
        return stackIn_29_0;
    }

    private final void g(int param0, int param1) {
        this.a(param0, 4873, true);
        int var3 = -24 % ((param1 - 44) / 50);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            this.h(-59);
            this.a((rt) null, 1);
            this.b((byte) -118, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_tb, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "wl.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void b(up param0, int param1) {
        boolean discarded$0 = false;
        int fieldTemp$1 = 0;
        try {
            if ((this.field_fc ^ -1) <= -4) {
                throw new RuntimeException();
            }
            if (!(this.field_fc < 0)) {
                this.field_Fc[this.field_fc].a((byte) 125);
            }
            if (param1 < 95) {
                discarded$0 = this.c((byte) -104);
            }
            fieldTemp$1 = this.field_fc + 1;
            this.field_fc = this.field_fc + 1;
            this.field_Fc[fieldTemp$1] = param0;
            this.field_Rb = param0;
            this.field_Rb.c((byte) 82);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "wl.QB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final gd a(int param0, int param1) {
        return null;
    }

    final int i() {
        return this.field_db;
    }

    private final void p(int param0) {
        if (!(this.field_N == 0)) {
            this.field_O = this.field_O & -32;
            this.field_N = 0;
        }
        int var2 = 39 % ((param0 - -31) / 58);
    }

    final za c(int param0) {
        im var2 = new im(param0);
        this.field_jb.a(87, var2);
        return (za) ((Object) var2);
    }

    private final void x(int param0) {
        wj discarded$15 = null;
        this.field_bc = new rt[this.field_Xb];
        this.field_Vb = new nr((wl) (this), 3553, 6408, 1, 1);
        nr discarded$0 = new nr((wl) (this), 3553, 6408, 1, 1);
        nr discarded$2 = new nr((wl) (this), 3553, 6408, 1, 1);
        if (param0 != -26394) {
            this.field_Bc = false;
        }
        nb discarded$3 = new nb((wl) (this));
        nb discarded$4 = new nb((wl) (this));
        nb discarded$5 = new nb((wl) (this));
        nb discarded$6 = new nb((wl) (this));
        nb discarded$7 = new nb((wl) (this));
        nb discarded$8 = new nb((wl) (this));
        nb discarded$9 = new nb((wl) (this));
        nb discarded$10 = new nb((wl) (this));
        nb discarded$11 = new nb((wl) (this));
        nb discarded$14 = new nb((wl) (this));
        if (!(!this.field_A)) {
            this.field_o = new wj((wl) (this));
            discarded$15 = new wj((wl) (this));
        }
    }

    static {
        field_Ub = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        field_zc = "MY HIGHSCORES";
        field_m = new int[2];
    }
}
