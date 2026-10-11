/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gja extends ka {
    private eo field_S;
    private int field_I;
    private short field_T;
    private gca[] field_nb;
    private int[][] field_D;
    private short[] field_m;
    private int field_i;
    private short[] field_P;
    private int field_H;
    private short[] field_lb;
    private int[] field_j;
    private int field_v;
    private hg field_d;
    private int[] field_R;
    private short[] field_M;
    private int field_Q;
    private float[] field_eb;
    private int field_L;
    private hg field_E;
    private int[] field_r;
    private boolean field_F;
    private int[] field_U;
    private short[] field_V;
    private int[][] field_q;
    private boolean field_f;
    private short[] field_jb;
    static boolean[] field_B;
    private byte[] field_C;
    private int[] field_J;
    private rga[] field_s;
    private float[] field_t;
    private hg field_ib;
    private int field_h;
    private gg field_g;
    private int field_K;
    private short[] field_G;
    private short[] field_p;
    private short[] field_kb;
    static String field_bb;
    private mca field_e;
    private ava[] field_X;
    private int field_n;
    private short[] field_hb;
    private int field_W;
    private short[] field_gb;
    static int field_x;
    private int[][] field_mb;
    private int field_fb;
    private int field_y;
    private int field_o;
    private hg field_O;
    private boolean field_A;
    private short field_ab;
    private int field_Y;
    private byte[] field_w;
    private int[] field_l;
    private ll[] field_u;
    private int[] field_Z;
    private boolean field_N;
    private short[] field_z;
    private short[] field_db;
    private int field_cb;
    static String field_k;

    gja(eo param0, oc param1, int param2, int param3, int param4, int param5) {
        this(param0, param2, param5, true, false);
        int fieldTemp$0 = 0;
        short dupTemp$1 = 0;
        short dupTemp$2 = 0;
        short dupTemp$3 = 0;
        gta dupTemp$4 = null;
        int dupTemp$6 = 0;
        int[] arrayValue$7 = null;
        int[] array$5 = null;
        int stackIn_36_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_295_0 = 0;
        oc stackIn_351_0 = null;
        int stackIn_354_0 = 0;
        int stackIn_354_1 = 0;
        int stackIn_371_0 = 0;
        int stackIn_371_1 = 0;
        RuntimeException stackIn_392_0 = null;
        StringBuilder stackIn_392_1 = null;
        String stackIn_393_2 = null;
        StringBuilder stackIn_396_1 = null;
        String stackIn_397_2 = null;
        RuntimeException decompiledCaughtException = null;
        d var7 = null;
        RuntimeException var7_ref = null;
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        dw var10_ref_dw = null;
        int var10 = 0;
        int var11_int = 0;
        eda[] var11 = null;
        int var12 = 0;
        Object var13_ref = null;
        int var13 = 0;
        int var14_int = 0;
        lp var14 = null;
        ima var14_ref = null;
        int var15_int = 0;
        gta[] var15 = null;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        jt var20_ref_jt = null;
        int var20 = 0;
        lp var21_ref_lp = null;
        int var21 = 0;
        dw var22_ref_dw = null;
        int var22 = 0;
        float var22_float = 0.0f;
        int var23_int = 0;
        float var23 = 0.0f;
        int var24_int = 0;
        float var24 = 0.0f;
        int var25_int = 0;
        float var25 = 0.0f;
        int var26_int = 0;
        float var26 = 0.0f;
        int var27_int = 0;
        float var27 = 0.0f;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        gta var31_ref_gta = null;
        eda var31_ref_eda = null;
        int var31 = 0;
        int var32_int = 0;
        long var32_long = 0L;
        gta var32 = null;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37_int = 0;
        eda var37 = null;
        float var38_float = 0.0f;
        float[] var38 = null;
        float var39_float = 0.0f;
        int var39 = 0;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43_float = 0.0f;
        int var43 = 0;
        float var44_float = 0.0f;
        int var44 = 0;
        float var45_float = 0.0f;
        int var45 = 0;
        float var46_float = 0.0f;
        int var46 = 0;
        float var47_float = 0.0f;
        int var47 = 0;
        float var48_float = 0.0f;
        int var48 = 0;
        float var49_float = 0.0f;
        int var49 = 0;
        float var50_float = 0.0f;
        int var50 = 0;
        float var51_float = 0.0f;
        int var51 = 0;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        int var63 = 0;
        var63 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = param0.field_c;
          this.field_J = new int[1 + param1.field_L];
          var8 = new int[param1.field_o];
          var9_int = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(var9_int < param1.field_o)))) {
            if (var63 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (param1.field_G == null ||
                2 != param1.field_G[var9_int]) {
                if (param1.field_r != null &&
                  param1.field_r[var9_int] != -1) {
                  var10_ref_dw = var7.a((byte) -71, param1.field_r[var9_int] & 65535);
                  decompiledFrameRemainder0 = (((64 & this.field_h) != 0 &&
                    var10_ref_dw.field_p) || !(var10_ref_dw.field_f));
                }
                if (decompiledFrameRemainder0) {
                  fieldTemp$0 = this.field_I;
                  this.field_I = this.field_I + 1;
                  var8[fieldTemp$0] = var9_int;
                  dupTemp$1 = param1.field_a[var9_int];
                  this.field_J[dupTemp$1] = this.field_J[dupTemp$1] + 1;
                  dupTemp$2 = param1.field_t[var9_int];
                  this.field_J[dupTemp$2] = this.field_J[dupTemp$2] + 1;
                  dupTemp$3 = param1.field_J[var9_int];
                  this.field_J[dupTemp$3] = this.field_J[dupTemp$3] + 1;
                }
              }
              var9_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            this.field_v = this.field_I;
          }
          var9 = new long[this.field_I];
          stackIn_36_0 = ((this.field_Y & 256) == 0) ? 0 : 1;
          var10 = stackIn_36_0;
          var11_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_I <= var11_int))) {
            var12 = var8[var11_int];
            var13_ref = null;
            var14_int = 0;
            var15_int = 0;
            var16 = 0;
            var17_int = 0;
            if (var63 == 0) {
              boolean decompiledFrameRemainder2 = true;
              if (null != param1.field_m) {
                var18 = 0;
                var19 = 0;
                while (param1.field_m.length > var19) {
                  var20_ref_jt = param1.field_m[var19];
                  stackIn_65_0 = var12;
                  stackIn_65_1 = var20_ref_jt.field_a;
                  if (stackIn_65_0 == stackIn_65_1) {
                    var21_ref_lp = fw.a(var20_ref_jt.field_d, false);
                    if (var21_ref_lp.field_i) {
                      var18 = 1;
                    }
                    if (-1 != var21_ref_lp.field_f) {
                      var22_ref_dw = var7.a((byte) 103, var21_ref_lp.field_f);
                      if (2 == var22_ref_dw.field_d) {
                        this.field_f = true;
                      }
                    }
                  }
                  var19++;
                }
                if (var18 != 0) {
                  var9[var11_int] = 9223372036854775807L;
                  this.field_v = this.field_v - 1;
                  decompiledFrameRemainder2 = false;
                }
              }
              if (decompiledFrameRemainder2) {
                var18 = -1;
                if (null != param1.field_r) {
                  var18 = param1.field_r[var12];
                  stackIn_65_0 = -1;
                  stackIn_65_1 = var18;
                  if (stackIn_65_0 != stackIn_65_1) {
                    var13_ref = var7.a((byte) -27, var18 & 65535);
                    if (0 == (this.field_h & 64) ||
                      !((dw) (var13_ref)).field_p) {
                      var17_int = ((dw) (var13_ref)).field_a;
                      var16 = ((dw) (var13_ref)).field_h;
                    } else {
                      var18 = -1;
                      var13_ref = null;
                    }
                  }
                }
                if ((null == param1.field_n ||
                  0 == param1.field_n[var12]) &&
                  (var13_ref == null ||
                  ((dw) (var13_ref)).field_d == 0)) {
                  stackIn_86_0 = 0;
                } else {
                  stackIn_86_0 = 1;
                }
                var19 = stackIn_86_0;
                if ((var10 != 0 ||
                  var19 != 0) && param1.field_C != null) {
                  var14_int = var14_int + (param1.field_C[var12] << 17);
                }
                if (var19 != 0) {
                  var14_int = var14_int + 65536;
                }
                var14_int = var14_int + (var16 << 8 & 65280);
                var15_int = var15_int + (var18 << 16 & -65536);
                var14_int = var14_int + (255 & var17_int);
                var15_int = var15_int + (65535 & var11_int);
                var9[var11_int] = (long)var15_int + ((long)var14_int << 32);
                this.field_f = this.field_f | var19 != 0;
              }
              var11_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            ofa.a(var8, var9, 67);
            this.field_hb = param1.field_y;
            this.field_W = param1.field_L;
            this.field_r = param1.field_I;
            this.field_y = param1.field_E;
            this.field_l = param1.field_p;
            this.field_Z = param1.field_b;
          }
          boolean decompiledFrameCompleted0 = true;
          var11 = new eda[this.field_W];
          this.field_s = param1.field_e;
          this.field_X = param1.field_B;
          if (null != param1.field_m) {
            this.field_L = param1.field_m.length;
            this.field_u = new ll[this.field_L];
            this.field_nb = new gca[this.field_L];
            var12 = 0;
            while (this.field_L > var12) {
              var13_ref = param1.field_m[var12];
              var14 = fw.a(((jt) (var13_ref)).field_d, false);
              var15_int = -1;
              stackIn_125_0 = 0;
              if (var63 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var16 = stackIn_125_0;
              while (this.field_I > var16) {
                stackIn_116_0 = ~((jt) (var13_ref)).field_a;
                stackIn_116_1 = ~var8[var16];
                if (stackIn_116_0 == stackIn_116_1) {
                  var15_int = var16;
                } else {
                  var16++;
                  continue;
                }
                break;
              }
              stackIn_116_0 = -1;
              stackIn_116_1 = var15_int;
              if (stackIn_116_0 == stackIn_116_1) {
                throw new RuntimeException();
              }
              var16 = 16777215 & cla.field_m[65535 & param1.field_A[((jt) (var13_ref)).field_a]];
              stackIn_122_0 = var16;
              if (param1.field_n != null) {
                stackIn_123_1 = param1.field_n[((jt) (var13_ref)).field_a];
              } else {
                stackIn_123_1 = 0;
              }
              var16 = stackIn_122_0 | -stackIn_123_1 + 255 << 24;
              this.field_u[var12] = new ll(var15_int, (int) param1.field_a[((jt) (var13_ref)).field_a], (int) param1.field_t[((jt) (var13_ref)).field_a], (int) param1.field_J[((jt) (var13_ref)).field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, ((jt) (var13_ref)).field_c);
              this.field_nb[var12] = new gca(var16);
              var12++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_125_0 = 3 * this.field_I;
          }
          var12 = stackIn_125_0;
          this.field_db = new short[var12];
          this.field_V = new short[this.field_I];
          this.field_eb = new float[var12];
          this.field_M = new short[this.field_I];
          this.field_p = new short[var12];
          this.field_C = new byte[this.field_I];
          this.field_w = new byte[var12];
          this.field_kb = new short[var12];
          this.field_ab = (short)param4;
          this.field_lb = new short[var12];
          if (null != param1.field_h) {
            this.field_jb = new short[this.field_I];
          }
          this.field_gb = new short[this.field_I];
          tl.field_q = new long[var12];
          this.field_T = (short)param3;
          this.field_t = new float[var12];
          this.field_P = new short[this.field_I];
          this.field_z = new short[this.field_I];
          this.field_G = new short[var12];
          this.field_m = new short[var12];
          var13 = 0;
          var14_int = 0;
          do {
            if (!(var14_int < param1.field_L)) {
              this.field_J[param1.field_L] = var13;
              break;
            }
            var15_int = this.field_J[var14_int];
            this.field_J[var14_int] = var13;
            var11[var14_int] = new eda();
            var13 = var13 + var15_int;
            var14_int++;
          } while (var63 == 0);
          var14_ref = qqa.a(var8, param1, this.field_I, (byte) -6);
          var15 = new gta[param1.field_o];
          var16 = 0;
          L41: while (true) {
            if (var16 < param1.field_o) {
              var17_int = param1.field_a[var16];
              var18 = param1.field_t[var16];
              var19 = param1.field_J[var16];
              var20 = this.field_Z[var18] - this.field_Z[var17_int];
              var21 = this.field_r[var18] - this.field_r[var17_int];
              var22 = -this.field_l[var17_int] + this.field_l[var18];
              var23_int = this.field_Z[var19] - this.field_Z[var17_int];
              var24_int = -this.field_r[var17_int] + this.field_r[var19];
              var25_int = this.field_l[var19] - this.field_l[var17_int];
              var26_int = -(var22 * var24_int) + var25_int * var21;
              var27_int = -(var20 * var25_int) + var23_int * var22;
              stackIn_175_0 = -(var21 * var23_int) + var24_int * var20;
              if (var63 != 0) {
                break L41;
              }
              var28 = stackIn_175_0;
              while (true) {
                if (var26_int <= 8192) {
                  stackIn_158_0 = ~var27_int;
                  stackIn_158_1 = -8193;
                }
                if (var26_int > 8192 || (stackIn_158_0 < stackIn_158_1 ||
                  var28 > 8192 ||
                  var26_int < -8192 ||
                  var27_int < -8192 ||
                  var28 < -8192)) {
                  var26_int = var26_int >> 1;
                  var27_int = var27_int >> 1;
                  stackIn_158_0 = var28;
                  stackIn_158_1 = 1;
                  var28 = stackIn_158_0 >> stackIn_158_1;
                  continue;
                }
                break;
              }
              var29 = (int)Math.sqrt((double)(var27_int * var27_int + (var26_int * var26_int + var28 * var28)));
              if (0 >= var29) {
                var29 = 1;
              }
              var26_int = 256 * var26_int / var29;
              var28 = var28 * 256 / var29;
              var27_int = 256 * var27_int / var29;
              if (null == param1.field_G) {
                stackIn_165_0 = 0;
              } else {
                stackIn_165_0 = param1.field_G[var16];
              }
              var30 = stackIn_165_0;
              if (var30 != 0) {
                if (var30 == 1) {
                  dupTemp$4 = new gta();
                  var15[var16] = dupTemp$4;
                  var31_ref_gta = dupTemp$4;
                  var31_ref_gta.field_c = var26_int;
                  var31_ref_gta.field_h = var28;
                  var31_ref_gta.field_d = var27_int;
                }
              } else {
                var31_ref_eda = var11[var17_int];
                var31_ref_eda.field_c = var31_ref_eda.field_c + 1;
                var31_ref_eda.field_b = var31_ref_eda.field_b + var26_int;
                var31_ref_eda.field_d = var31_ref_eda.field_d + var27_int;
                var31_ref_eda.field_a = var31_ref_eda.field_a + var28;
                var31_ref_eda = var11[var18];
                var31_ref_eda.field_b = var31_ref_eda.field_b + var26_int;
                var31_ref_eda.field_a = var31_ref_eda.field_a + var28;
                var31_ref_eda.field_d = var31_ref_eda.field_d + var27_int;
                var31_ref_eda.field_c = var31_ref_eda.field_c + 1;
                var31_ref_eda = var11[var19];
                var31_ref_eda.field_b = var31_ref_eda.field_b + var26_int;
                var31_ref_eda.field_c = var31_ref_eda.field_c + 1;
                var31_ref_eda.field_a = var31_ref_eda.field_a + var28;
                var31_ref_eda.field_d = var31_ref_eda.field_d + var27_int;
              }
              var16++;
              continue;
            }
            stackIn_175_0 = 0;
            break;
          }
          var16 = stackIn_175_0;
          L54: while (true) {
            if (this.field_I > var16) {
              var17_int = var8[var16];
              var18 = 65535 & param1.field_A[var17_int];
              stackIn_351_0 = (oc) (param1);
              if (var63 == 0) {
                if (stackIn_351_0.field_g != null) {
                  var19 = param1.field_g[var17_int];
                } else {
                  var19 = -1;
                }
                if (null == param1.field_n) {
                  var20 = 0;
                } else {
                  var20 = 255 & param1.field_n[var17_int];
                }
                if (null != param1.field_r) {
                  stackIn_190_0 = param1.field_r[var17_int];
                } else {
                  stackIn_190_0 = -1;
                }
                var21 = stackIn_190_0;
                if (var21 != -1 &&
                  0 != (this.field_h & 64)) {
                  var22_ref_dw = var7.a((byte) 2, 65535 & var21);
                  if (var22_ref_dw.field_p) {
                    var21 = -1;
                  }
                }
                var22_float = 0.0f;
                var23 = 0.0f;
                var24 = 0.0f;
                var25 = 0.0f;
                var26 = 0.0f;
                var27 = 0.0f;
                var28 = 0;
                var29 = 0;
                var30 = 0;
                if (var21 != -1) {
                  if (var19 == -1) {
                    var27 = 0.0f;
                    var25 = 1.0f;
                    var22_float = 0.0f;
                    var28 = 1;
                    var24 = 1.0f;
                    var26 = 0.0f;
                    var29 = 2;
                    var23 = 1.0f;
                  } else {
                    var19 = var19 & 255;
                    var31 = param1.field_u[var19];
                    if (var31 == 0) {
                      var32_int = param1.field_a[var17_int];
                      var33_int = param1.field_t[var17_int];
                      var34 = param1.field_J[var17_int];
                      var35 = param1.field_s[var19];
                      var36 = param1.field_q[var19];
                      var37_int = param1.field_K[var19];
                      var38_float = (float)param1.field_b[var35];
                      var39_float = (float)param1.field_I[var35];
                      var40 = (float)param1.field_p[var35];
                      var41 = (float)param1.field_b[var36] - var38_float;
                      var42 = (float)param1.field_I[var36] - var39_float;
                      var43_float = -var40 + (float)param1.field_p[var36];
                      var44_float = -var38_float + (float)param1.field_b[var37_int];
                      var45_float = (float)param1.field_I[var37_int] - var39_float;
                      var46_float = -var40 + (float)param1.field_p[var37_int];
                      var47_float = (float)param1.field_b[var32_int] - var38_float;
                      var48_float = (float)param1.field_I[var32_int] - var39_float;
                      var49_float = -var40 + (float)param1.field_p[var32_int];
                      var50_float = -var38_float + (float)param1.field_b[var33_int];
                      var51_float = -var39_float + (float)param1.field_I[var33_int];
                      var52 = (float)param1.field_p[var33_int] - var40;
                      var53 = (float)param1.field_b[var34] - var38_float;
                      var54 = (float)param1.field_I[var34] - var39_float;
                      var55 = (float)param1.field_p[var34] - var40;
                      var56 = -(var43_float * var45_float) + var46_float * var42;
                      var57 = -(var41 * var46_float) + var44_float * var43_float;
                      var58 = -(var42 * var44_float) + var45_float * var41;
                      var59 = var58 * var45_float - var57 * var46_float;
                      var60 = -(var58 * var44_float) + var46_float * var56;
                      var61 = -(var45_float * var56) + var44_float * var57;
                      var62 = 1.0f / (var41 * var59 + var60 * var42 + var61 * var43_float);
                      var24 = var62 * (var50_float * var59 + var60 * var51_float + var52 * var61);
                      var22_float = (var47_float * var59 + var48_float * var60 + var49_float * var61) * var62;
                      var26 = var62 * (var53 * var59 + var60 * var54 + var55 * var61);
                      var59 = -(var57 * var43_float) + var58 * var42;
                      var60 = var43_float * var56 - var58 * var41;
                      var61 = -(var42 * var56) + var41 * var57;
                      var62 = 1.0f / (var61 * var46_float + (var60 * var45_float + var59 * var44_float));
                      var27 = (var61 * var55 + (var54 * var60 + var53 * var59)) * var62;
                      var25 = (var59 * var50_float + var60 * var51_float + var52 * var61) * var62;
                      var23 = var62 * (var59 * var47_float + var48_float * var60 + var61 * var49_float);
                    } else {
                      var32_int = param1.field_a[var17_int];
                      var33_int = param1.field_t[var17_int];
                      var34 = param1.field_J[var17_int];
                      var35 = var14_ref.field_a[var19];
                      var36 = var14_ref.field_c[var19];
                      var37_int = var14_ref.field_d[var19];
                      var38 = var14_ref.field_b[var19];
                      var39 = param1.field_z[var19];
                      var40 = (float)param1.field_d[var19] / 256.0f;
                      switch (var31) {
                        default:
                          break;
                        case 3:
                          ifa.a(param1.field_p[var32_int], param1.field_b[var32_int], var36, var37_int, rn.field_a, var40, var39, var35, var38, (byte) -44, param1.field_I[var32_int]);
                          var23 = rn.field_a[1];
                          var22_float = rn.field_a[0];
                          ifa.a(param1.field_p[var33_int], param1.field_b[var33_int], var36, var37_int, rn.field_a, var40, var39, var35, var38, (byte) -44, param1.field_I[var33_int]);
                          var24 = rn.field_a[0];
                          var25 = rn.field_a[1];
                          ifa.a(param1.field_p[var34], param1.field_b[var34], var36, var37_int, rn.field_a, var40, var39, var35, var38, (byte) -44, param1.field_I[var34]);
                          var27 = rn.field_a[1];
                          var26 = rn.field_a[0];
                          if ((1 & var39) == 0) {
                            if (!(0.5f < var26 - var22_float)) {
                              if (0.5f < -var26 + var22_float) {
                                var29 = 2;
                                var26 = var26 + 1.0f;
                              }
                            } else {
                              var26 = var26 - 1.0f;
                              var29 = 1;
                            }
                            if (!(var24 - var22_float > 0.5f)) {
                              if (!(0.5f < var22_float - var24)) {
                                break;
                              }
                              var28 = 2;
                              var24 = var24 + 1.0f;
                              break;
                            }
                            var28 = 1;
                            var24 = var24 - 1.0f;
                            break;
                          }
                          if (!(0.5f < var27 - var23)) {
                            if (-var27 + var23 > 0.5f) {
                              var27 = var27 + 1.0f;
                              var29 = 2;
                            }
                          } else {
                            var27 = var27 - 1.0f;
                            var29 = 1;
                          }
                          if (0.5f < var25 - var23) {
                            var25 = var25 - 1.0f;
                            var28 = 1;
                            break;
                          }
                          if (!(0.5f < var23 - var25)) {
                            break;
                          }
                          var28 = 2;
                          var25 = var25 + 1.0f;
                          break;
                        case 2:
                          var41 = (float)param1.field_v[var19] / 256.0f;
                          var42 = (float)param1.field_c[var19] / 256.0f;
                          var43 = param1.field_b[var33_int] - param1.field_b[var32_int];
                          var44 = param1.field_I[var33_int] - param1.field_I[var32_int];
                          var45 = param1.field_p[var33_int] - param1.field_p[var32_int];
                          var46 = param1.field_b[var34] - param1.field_b[var32_int];
                          var47 = param1.field_I[var34] - param1.field_I[var32_int];
                          var48 = -param1.field_p[var32_int] + param1.field_p[var34];
                          var49 = var44 * var48 - var47 * var45;
                          var50 = -(var43 * var48) + var46 * var45;
                          var51 = -(var44 * var46) + var47 * var43;
                          var52 = 64.0f / (float)param1.field_j[var19];
                          var53 = 64.0f / (float)param1.field_f[var19];
                          var54 = 64.0f / (float)param1.field_x[var19];
                          var55 = (var38[2] * (float)var51 + (var38[0] * (float)var49 + var38[1] * (float)var50)) / var52;
                          var56 = (var38[4] * (float)var50 + var38[3] * (float)var49 + (float)var51 * var38[5]) / var53;
                          var57 = ((float)var51 * var38[8] + (var38[6] * (float)var49 + var38[7] * (float)var50)) / var54;
                          var30 = mr.a(var57, var56, false, var55);
                          as.a(var36, rn.field_a, param1.field_I[var32_int], var35, var42, var37_int, var41, param1.field_b[var32_int], var30, param1.field_p[var32_int], -102, var40, var39, var38);
                          var22_float = rn.field_a[0];
                          var23 = rn.field_a[1];
                          as.a(var36, rn.field_a, param1.field_I[var33_int], var35, var42, var37_int, var41, param1.field_b[var33_int], var30, param1.field_p[var33_int], 32, var40, var39, var38);
                          var25 = rn.field_a[1];
                          var24 = rn.field_a[0];
                          as.a(var36, rn.field_a, param1.field_I[var34], var35, var42, var37_int, var41, param1.field_b[var34], var30, param1.field_p[var34], 79, var40, var39, var38);
                          var26 = rn.field_a[0];
                          var27 = rn.field_a[1];
                          break;
                        case 1:
                          var41 = (float)param1.field_x[var19] / 1024.0f;
                          loa.a(var39, rn.field_a, var41, param1.field_p[var32_int], param1.field_I[var32_int], -126, var38, var40, var36, var37_int, param1.field_b[var32_int], var35);
                          var22_float = rn.field_a[0];
                          var23 = rn.field_a[1];
                          loa.a(var39, rn.field_a, var41, param1.field_p[var33_int], param1.field_I[var33_int], 72, var38, var40, var36, var37_int, param1.field_b[var33_int], var35);
                          var24 = rn.field_a[0];
                          var25 = rn.field_a[1];
                          loa.a(var39, rn.field_a, var41, param1.field_p[var34], param1.field_I[var34], -108, var38, var40, var36, var37_int, param1.field_b[var34], var35);
                          var27 = rn.field_a[1];
                          var26 = rn.field_a[0];
                          var42 = var41 / 2.0f;
                          if ((1 & var39) == 0) {
                            if (!(-var22_float + var24 > var42)) {
                              if (-var24 + var22_float > var42) {
                                var28 = 2;
                                var24 = var24 + var41;
                              }
                            } else {
                              var28 = 1;
                              var24 = var24 - var41;
                            }
                            if (!(var42 < var26 - var22_float)) {
                              if (!(-var26 + var22_float > var42)) {
                                break;
                              }
                              var26 = var26 + var41;
                              var29 = 2;
                              break;
                            }
                            var29 = 1;
                            var26 = var26 - var41;
                            break;
                          }
                          if (var25 - var23 > var42) {
                            var28 = 1;
                            var25 = var25 - var41;
                          } else {
                            if (-var25 + var23 > var42) {
                              var25 = var25 + var41;
                              var28 = 2;
                            }
                          }
                          if (!(-var23 + var27 > var42)) {
                            if (!(-var27 + var23 > var42)) {
                              break;
                            }
                            var27 = var27 + var41;
                            var29 = 2;
                            break;
                          }
                          var29 = 1;
                          var27 = var27 - var41;
                          break;
                      }
                    }
                  }
                }
                if (null == param1.field_G) {
                  var31 = 0;
                } else {
                  var31 = param1.field_G[var17_int];
                }
                if (0 == var31) {
                  var32_long = (long)(var19 << 2) + ((long)(var18 << 8) + (long)(var30 << 24) + (long)var20 << 32);
                  var34 = param1.field_a[var17_int];
                  var35 = param1.field_t[var17_int];
                  var36 = param1.field_J[var17_int];
                  var37 = var11[var34];
                  this.field_M[var16] = this.a(var37.field_d, var16, var22_float, var34, var37.field_a, var37.field_c, var32_long, var37.field_b, var23, true, param1);
                  var37 = var11[var35];
                  this.field_z[var16] = this.a(var37.field_d, var16, var24, var35, var37.field_a, var37.field_c, var32_long + (long)var28, var37.field_b, var25, true, param1);
                  var37 = var11[var36];
                  this.field_V[var16] = this.a(var37.field_d, var16, var26, var36, var37.field_a, var37.field_c, var32_long + (long)var29, var37.field_b, var27, true, param1);
                } else {
                  if (var31 == 1) {
                    var32 = var15[var17_int];
                    stackIn_295_0 = (0 >= var32.field_c) ? 2048 : 1024;
                    var33 = (long)(stackIn_295_0 + ((var19 << 2) + (var32.field_d + 256 << 12)) + (var32.field_h + 256 << 22)) + ((long)var20 + (long)(var30 << 24) + (long)(var18 << 8) << 32);
                    this.field_M[var16] = this.a(var32.field_d, var16, var22_float, (int) param1.field_a[var17_int], var32.field_h, 0, var33, var32.field_c, var23, true, param1);
                    this.field_z[var16] = this.a(var32.field_d, var16, var24, (int) param1.field_t[var17_int], var32.field_h, 0, (long)var28 + var33, var32.field_c, var25, true, param1);
                    this.field_V[var16] = this.a(var32.field_d, var16, var26, (int) param1.field_J[var17_int], var32.field_h, 0, (long)var29 + var33, var32.field_c, var27, true, param1);
                  }
                }
                if (null != param1.field_n) {
                  this.field_C[var16] = param1.field_n[var17_int];
                }
                if (param1.field_h != null) {
                  this.field_jb[var16] = param1.field_h[var17_int];
                }
                this.field_P[var16] = param1.field_A[var17_int];
                this.field_gb[var16] = (short) var21;
                var16++;
                continue;
              }
            } else {
              if (this.field_v > 0) {
                var16 = 1;
                var17_int = this.field_gb[0];
                var18 = 0;
                while (this.field_v > var18) {
                  var19 = this.field_gb[var18];
                  stackIn_354_0 = var19;
                  stackIn_354_1 = var17_int;
                  if (var63 != 0) {
                    break L54;
                  }
                  if (stackIn_354_0 != stackIn_354_1) {
                    var16++;
                    var17_int = var19;
                  }
                  var18++;
                }
                this.field_U = new int[var16 + 1];
                this.field_j = new int[var16];
                this.field_R = new int[var16];
                this.field_U[0] = 0;
                var18 = this.field_fb;
                var17_int = this.field_gb[0];
                var16 = 0;
                var19 = 0;
                var20 = 0;
                while (var20 < this.field_v) {
                  var21 = this.field_gb[var20];
                  stackIn_354_0 = var17_int;
                  stackIn_354_1 = var21;
                  if (var63 != 0) {
                    break L54;
                  }
                  if (stackIn_354_0 != stackIn_354_1) {
                    this.field_j[var16] = var18;
                    this.field_R[var16] = 1 + var19 - var18;
                    var16++;
                    this.field_U[var16] = var20;
                    var18 = this.field_fb;
                    var17_int = var21;
                    var19 = 0;
                  }
                  var22 = this.field_M[var20];
                  if (var22 < var18) {
                    var18 = var22;
                  }
                  if (var19 < var22) {
                    var19 = var22;
                  }
                  var22 = this.field_z[var20];
                  if (var22 > var19) {
                    var19 = var22;
                  }
                  if (var18 > var22) {
                    var18 = var22;
                  }
                  var22 = this.field_V[var20];
                  if (var19 < var22) {
                    var19 = var22;
                  }
                  if (var18 > var22) {
                    var18 = var22;
                  }
                  var20++;
                }
                this.field_j[var16] = var18;
                this.field_R[var16] = 1 - var18 + var19;
                var16++;
                this.field_U[var16] = this.field_v;
              }
              tl.field_q = null;
              this.field_kb = op.a(this.field_kb, 119, this.field_fb);
              this.field_G = op.a(this.field_G, 112, this.field_fb);
              this.field_lb = op.a(this.field_lb, 114, this.field_fb);
              this.field_m = op.a(this.field_m, 114, this.field_fb);
              this.field_p = op.a(this.field_p, 123, this.field_fb);
              this.field_w = kaa.a(0, this.field_w, this.field_fb);
              this.field_eb = fba.a(1, this.field_eb, this.field_fb);
              this.field_t = fba.a(1, this.field_t, this.field_fb);
              if (null != param1.field_l &&
                qr.d(param2, this.field_h, 32)) {
                this.field_D = param1.a(false, (byte) 64);
              }
              if (null != param1.field_m &&
                ub.a(this.field_h, param2, (byte) -122)) {
                this.field_mb = param1.b((byte) -124);
              }
              stackIn_351_0 = (oc) (param1);
            }
            if (stackIn_351_0.field_D == null) {
              return;
            }
            stackIn_354_0 = param2;
            stackIn_354_1 = this.field_h;
            break;
          }
          if (ofa.a(stackIn_354_0, stackIn_354_1, (byte) -126)) {
            var16 = 0;
            var17 = new int[256];
            var18 = 0;
            L105: while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (this.field_I > var18) {
                var19 = param1.field_D[var8[var18]];
                stackIn_371_0 = ~var19;
                stackIn_371_1 = -1;
                if (var63 != 0) {
                  if (stackIn_371_0 >= stackIn_371_1) {
                    array$5 = new int[var17[var18]];
                    this.field_q[var18] = array$5;
                    var17[var18] = 0;
                    var18++;
                    break L105;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  if (stackIn_371_0 <= stackIn_371_1) {
                    if (var16 < var19) {
                      var16 = var19;
                    }
                    var17[var19] = var17[var19] + 1;
                  }
                  var18++;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                this.field_q = new int[1 + var16][];
                var18 = 0;
                while (true) {
                  stackIn_371_0 = var16;
                  stackIn_371_1 = var18;
                  if (stackIn_371_0 < stackIn_371_1) {
                    break;
                  }
                  array$5 = new int[var17[var18]];
                  this.field_q[var18] = array$5;
                  var17[var18] = 0;
                  var18++;
                  if (var63 != 0) {
                    break L105;
                  }
                }
              }
              var18 = 0;
              break;
            }
            while (true) {
              if (this.field_I <= var18) {
                return;
              }
              var19 = param1.field_D[var8[var18]];
              if (var63 != 0) {
                return;
              }
              if (var19 >= 0) {
                dupTemp$6 = var17[var19];
                arrayValue$7 = this.field_q[var19];
                var17[var19] = dupTemp$6 + 1;
                arrayValue$7[dupTemp$6] = var18;
              }
              var18++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_392_0 = var7_ref;
          stackIn_392_1 = new StringBuilder().append("gja.<init>(");
          if (param0 == null) {
            stackIn_393_2 = "null";
          } else {
            stackIn_393_2 = "{...}";
          }
          stackIn_396_1 = ((StringBuilder) (Object) stackIn_392_1).append(stackIn_393_2).append(',');
          if (param1 == null) {
            stackIn_397_2 = "null";
          } else {
            stackIn_397_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_392_0), ((StringBuilder) (Object) stackIn_396_1).append(stackIn_397_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean NA() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_D == null) {
            return false;
          }
          var1_int = 0;
          do {
            if (var1_int >= this.field_y) {
              pb.field_k = 0;
              uu.field_c = 0;
              ina.field_a = 0;
              break;
            }
            this.field_Z[var1_int] = this.field_Z[var1_int] << 4;
            this.field_r[var1_int] = this.field_r[var1_int] << 4;
            this.field_l[var1_int] = this.field_l[var1_int] << 4;
            var1_int++;
          } while (var2 == 0);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "gja.NA()");
        }
    }

    private final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 69 / ((param0 - 66) / 38);
          if ((55 & this.field_h) == 0) {
            if (this.field_E == null) {
              return;
            }
            this.field_E.field_h = false;
            if (!TombRacer.field_G) {
              return;
            }
          }
          if (null != this.field_O) {
            this.field_O.field_h = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.R(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        ll var6 = null;
        int var7_int = 0;
        gca var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ll var6Lifetime1;
        gca var7Lifetime1;
        int stackIn_20_0Lifetime1;
        int stackIn_20_1Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = 0;
          L2: while (true) {
            if (var5_int < this.field_I) {
              var6_int = this.field_P[var5_int] & 65535;
              var7_int = (var6_int & 65039) >> 10;
              var8 = (var6_int & 951) >> 7;
              stackIn_20_0 = 0;
              stackIn_20_1 = ~param0;
              if (var10 != 0) {
                if (stackIn_20_0 > stackIn_20_1) {
                  var6 = this.field_u[var5_int];
                  var7 = this.field_nb[var5_int];
                  var7.field_h = -16777216 & var7.field_h | cla.field_m[65535 & this.field_P[var6.field_m]] & 16777215;
                  var5_int++;
                  return;
                }
                break L2;
              }
              if (stackIn_20_0 != stackIn_20_1) {
                var7_int = var7_int + (param3 * (-var7_int + param0) >> 7);
              }
              var9 = var6_int & 127;
              if (param1 != -1) {
                var8 = var8 + (param3 * (-var8 + param1) >> 7);
              }
              if (-1 != param2) {
                var9 = var9 + ((param2 - var9) * param3 >> 7);
              }
              this.field_P[var5_int] = (short)fh.a(var9, fh.a(var8 << 7, var7_int << 10));
              var5_int++;
              continue;
            }
            if (this.field_u == null) {
              break L2;
            }
            var5_int = 0;
            while (true) {
              stackIn_20_0Lifetime1 = this.field_L;
              stackIn_20_1Lifetime1 = var5_int;
              if (stackIn_20_0Lifetime1 <= stackIn_20_1Lifetime1) {
                break;
              }
              var6Lifetime1 = this.field_u[var5_int];
              var7Lifetime1 = this.field_nb[var5_int];
              var7Lifetime1.field_h = -16777216 & var7Lifetime1.field_h | cla.field_m[65535 & this.field_P[var6Lifetime1.field_m]] & 16777215;
              var5_int++;
              if (var10 != 0) {
                return;
              }
            }
            break;
          }
          this.e(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "gja.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a() {
    }

    final void a(gda param0, el param1, int param2, int param3) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        asa var5 = null;
        RuntimeException var5_ref = null;
        asa var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 == this.field_fb) {
            return;
          }
          var5 = this.field_S.field_bb;
          var6 = (asa) (param0);
          if (!this.field_A) {
            this.f(-913);
          }
          qra.field_d = var5.field_o * var6.field_q + var6.field_l * var5.field_p + var6.field_o * var5.field_h;
          gj.field_h = var6.field_e * var5.field_p + var5.field_o * var6.field_n + var6.field_i * var5.field_h + var5.field_i;
          var7 = qra.field_d * (float)this.field_o + gj.field_h;
          var8 = gj.field_h + qra.field_d * (float)this.field_n;
          if (!(var8 < var7)) {
            var9 = var7 - (float)this.field_H;
            var10 = var8 + (float)this.field_H;
          }
          if (var8 < var7 ||
            var23 != 0) {
            var9 = var8 - (float)this.field_H;
            var10 = (float)this.field_H + var7;
          }
          if (this.field_S.field_Cb <= var9) {
            return;
          }
          if ((float)this.field_S.field_D >= var10) {
            return;
          }
          vta.field_e = var6.field_q * var5.field_l + var6.field_l * var5.field_g + var6.field_o * var5.field_f;
          fba.field_a = var5.field_e + (var6.field_i * var5.field_f + (var6.field_n * var5.field_l + var5.field_g * var6.field_e));
          var11 = fba.field_a + vta.field_e * (float)this.field_o;
          var12 = (float)this.field_n * vta.field_e + fba.field_a;
          if (!(var11 > var12)) {
            var14 = (var12 + (float)this.field_H) * (float)this.field_S.field_Ic;
            var13 = (var11 - (float)this.field_H) * (float)this.field_S.field_Ic;
          }
          if (var11 > var12 ||
            var23 != 0) {
            var13 = (float)this.field_S.field_Ic * (var12 - (float)this.field_H);
            var14 = (float)this.field_S.field_Ic * ((float)this.field_H + var11);
          }
          if (var13 / (float)param2 >= this.field_S.field_uc) {
            return;
          }
          if (var14 / (float)param2 <= this.field_S.field_f) {
            return;
          }
          tu.field_g = var5.field_k * var6.field_e + var6.field_n * var5.field_q + var6.field_i * var5.field_m + var5.field_n;
          kb.field_p = var6.field_l * var5.field_k + var6.field_q * var5.field_q + var5.field_m * var6.field_o;
          var15 = tu.field_g + (float)this.field_o * kb.field_p;
          var16 = tu.field_g + (float)this.field_n * kb.field_p;
          if (!(var15 > var16)) {
            var18 = (float)this.field_S.field_h * (var16 + (float)this.field_H);
            var17 = ((float)(-this.field_H) + var15) * (float)this.field_S.field_h;
          }
          if (var15 > var16 ||
            var23 != 0) {
            var17 = (float)this.field_S.field_h * (var16 - (float)this.field_H);
            var18 = (var15 + (float)this.field_H) * (float)this.field_S.field_h;
          }
          if (this.field_S.field_H <= var17 / (float)param2) {
            return;
          }
          if (var18 / (float)param2 <= this.field_S.field_zc) {
            return;
          }
          if (null != param1 ||
            null != this.field_u) {
            vs.field_O = var5.field_k * var6.field_g + var6.field_k * var5.field_q + var5.field_m * var6.field_p;
            wka.field_b = var5.field_f * var6.field_h + (var6.field_f * var5.field_g + var5.field_l * var6.field_m);
            pl.field_a = var6.field_g * var5.field_p + var5.field_o * var6.field_k + var6.field_p * var5.field_h;
            baa.field_c = var5.field_f * var6.field_p + (var6.field_k * var5.field_l + var5.field_g * var6.field_g);
            ct.field_b = var6.field_h * var5.field_m + (var5.field_q * var6.field_m + var6.field_f * var5.field_k);
            hs.field_c = var6.field_h * var5.field_h + (var6.field_m * var5.field_o + var5.field_p * var6.field_f);
          }
          if (param1 != null) {
            var19 = this.field_K + this.field_i >> 1;
            var20 = this.field_Q + this.field_cb >> 1;
            var21 = (int)(hs.field_c * (float)var20 + (gj.field_h + pl.field_a * (float)var19 + qra.field_d * (float)this.field_o));
            var22 = (int)((float)this.field_n * qra.field_d + (gj.field_h + (float)var19 * pl.field_a) + hs.field_c * (float)var20);
            if (var21 < this.field_S.field_D &&
              var22 < this.field_S.field_D) {
            }
          }
          this.field_S.a((float)param2, -229);
          this.field_S.j((byte) 102);
          this.field_S.a(var6, (byte) 88);
          this.b((byte) -100);
          this.c(-125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_50_0 = var5_ref;
          stackIn_50_1 = new StringBuilder().append("gja.Q(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(cn param0, int param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        an var5 = null;
        int[] var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var2 = new kh(param0.a("logo.fo3d", (byte) 126, ""));
          var3 = var2.h(255);
          var2.h((byte) 119);
          ej.field_d = uea.a(var2, (byte) 8);
          tfa.field_e = new int[var3][];
          cq.field_b = new an[var3];
          var4 = 0;
          do {
            if (var3 <= var4) {
              var2.i((byte) 98);
              break;
            }
            cq.field_b[var4] = jo.a(var2, true);
            var4++;
          } while (var7 == 0);
          var4 = param1;
          while (var4 < var3) {
            var5 = cq.field_b[var4];
            var5.a(6, 6, 6, true, 1);
            var5.a((byte) -120);
            var6 = new int[]{var5.field_i + var5.field_z >> 1, var5.field_b + var5.field_m >> 1, var5.field_a + var5.field_p >> 1};
            tfa.field_e[var4] = var6;
            var5.a(-var6[2], -var6[0], (byte) -86, -var6[1]);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("gja.M(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void f(int param0) {
        ka discarded$0 = null;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
        int var14 = 0;
        int var15 = 0;
        int var14Lifetime1;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var10 >= this.field_W))) {
            var11 = this.field_Z[var10];
            var12 = this.field_r[var10];
            stackIn_32_0 = ~var12;
            stackIn_32_1 = ~var6;
            if (var15 == 0) {
              if (stackIn_32_0 < stackIn_32_1) {
                var6 = var12;
              }
              if (var3 > var12) {
                var3 = var12;
              }
              if (var11 < var2_int) {
                var2_int = var11;
              }
              var13 = this.field_l[var10];
              if (var5 < var11) {
                var5 = var11;
              }
              if (var7 < var13) {
                var7 = var13;
              }
              if (var13 < var4) {
                var4 = var13;
              }
              var14 = var13 * var13 + var11 * var11;
              if (var14 > var8) {
                var8 = var14;
              }
              var14Lifetime1 = var13 * var13 + var11 * var11 + var12 * var12;
              if (var14Lifetime1 > var9) {
                var9 = var14Lifetime1;
              }
              var10++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_Q = var7;
            this.field_n = var6;
            this.field_K = var5;
            this.field_i = var2_int;
            this.field_o = var3;
            this.field_cb = var4;
            this.field_H = (int)(Math.sqrt((double)var8) + 0.99);
            Math.sqrt((double)var9);
            this.field_A = true;
            stackIn_32_0 = param0;
            stackIn_32_1 = -913;
          }
          if (stackIn_32_0 != stackIn_32_1) {
            discarded$0 = this.a((gja) null, true, (gja) null, false, -20, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.IA(" + param0 + ')');
        }
    }

    final static byte[] a(int param0, File param1, int param2) {
        try {
          byte[] var3 = null;
          IOException var3_ref = null;
          RuntimeException var3_ref2 = null;
          byte[] stackIn_2_0 = null;
          byte[] stackIn_4_0 = null;
          Object stackIn_6_0 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var3 = new byte[param0];
              if (param2 != 0) {
                stackIn_2_0 = (byte[]) null;
                return stackIn_2_0;
              }
              nj.a(var3, 107, param0, param1);
              stackIn_4_0 = var3;
              return stackIn_4_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (IOException) (Object) decompiledCaughtException;
              stackIn_6_0 = null;
              return (byte[]) (stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var3_ref2;
            stackIn_10_1 = new StringBuilder().append("gja.K(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean h(int param0) {
        RuntimeException decompiledCaughtException = null;
        eja var2 = null;
        RuntimeException var2_ref = null;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_g.field_a) {
            return true;
          }
          if (this.field_g.field_d == null) {
            this.field_g.field_d = this.field_S.a(26, this.field_F);
          }
          if (param0 != 0) {
            this.a((byte) -37, -100, true);
          }
          var2 = this.field_g.field_d;
          var2.a(param0 + 28, 6 * this.field_v);
          var3 = var2.a(true, (byte) -10);
          if (null != var3) {
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            var4 = this.field_S.a(var3, 127);
            if (jaclib.memory.Stream.b()) {
              var5 = 0;
              while (var5 < this.field_v) {
                var4.a((int) this.field_M[var5]);
                var4.a((int) this.field_z[var5]);
                var4.a((int) this.field_V[var5]);
                var5++;
                if (var6 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                decompiledFrameRemainder0 = (var6 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1)) {
              var5Lifetime1 = 0;
              while (var5Lifetime1 < this.field_v) {
                var4.b((int) this.field_M[var5Lifetime1]);
                var4.b((int) this.field_z[var5Lifetime1]);
                var4.b((int) this.field_V[var5Lifetime1]);
                var5Lifetime1++;
                if (var6 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              var4.a();
            }
            if (var2.a((byte) 95)) {
              this.field_g.field_a = true;
              this.field_g.field_c = var2;
              this.field_N = true;
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "gja.B(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.field_N) {
            return;
          }
          this.field_N = false;
          if (null == this.field_X &&
            this.field_s == null &&
            this.field_u == null &&
            !ei.a(this.field_h, this.field_Y, (byte) 27)) {
            var2_int = 0;
            var3 = 0;
            var4 = 0;
            if (null != this.field_Z &&
              !tp.a(this.field_h, (byte) 3, this.field_Y)) {
              if (null == this.field_ib ||
                this.field_ib.b(16440)) {
                var2_int = 1;
                if (!this.field_A) {
                  this.f(-913);
                  if (var5 != 0) {
                    this.field_N = true;
                  }
                }
              } else {
                this.field_N = true;
              }
            }
            if (null != this.field_r &&
              !qr.c(458752, this.field_h, this.field_Y)) {
              if (null == this.field_ib ||
                this.field_ib.b(16440)) {
                var3 = 1;
                if (!this.field_A) {
                  this.f(-913);
                  if (var5 != 0) {
                    this.field_N = true;
                  }
                }
              } else {
                this.field_N = true;
              }
            }
            if (this.field_l != null &&
              !cu.a(-79, this.field_Y, this.field_h)) {
              if (null != this.field_ib &&
                !this.field_ib.b(16440)) {
                this.field_N = true;
                if (var5 != 0) {
                  if (!this.field_A) {
                    this.f(-913);
                  }
                  var4 = 1;
                }
              } else {
                if (!this.field_A) {
                  this.f(-913);
                }
                var4 = 1;
              }
            }
            if (var3 != 0) {
              this.field_r = null;
            }
            if (var4 != 0) {
              this.field_l = null;
            }
            if (var2_int != 0) {
              this.field_Z = null;
            }
          }
          if (this.field_db != null &&
            this.field_Z == null &&
            null == this.field_r &&
            this.field_l == null) {
            this.field_J = null;
            this.field_db = null;
          }
          boolean decompiledFrameRemainder1 = true;
          if (null != this.field_w &&
            !dba.a(this.field_h, 98, this.field_Y)) {
            boolean decompiledFrameRemainder0 = true;
            if (0 == (55 & this.field_h)) {
              decompiledFrameRemainder0 = (this.field_E == null ||
                this.field_E.b(16440));
            } else {
              decompiledFrameRemainder0 = (null == this.field_O ||
                this.field_O.b(16440));
            }
            if (decompiledFrameRemainder0) {
              this.field_lb = null;
              this.field_p = null;
              this.field_m = null;
              this.field_w = null;
              decompiledFrameRemainder1 = (var5 != 0);
            }
            if (decompiledFrameRemainder1) {
              this.field_N = true;
            }
          }
          if (null != this.field_P &&
            !th.b(this.field_Y, 8, this.field_h)) {
            if (this.field_E != null &&
              !this.field_E.b(16440)) {
              this.field_N = true;
              if (var5 != 0) {
                this.field_P = null;
              }
            } else {
              this.field_P = null;
            }
          }
          if (this.field_C != null &&
            !jda.d(this.field_h, -28090, this.field_Y)) {
            if (null == this.field_E ||
              this.field_E.b(16440)) {
              this.field_C = null;
              if (var5 != 0) {
                this.field_N = true;
              }
            } else {
              this.field_N = true;
            }
          }
          if (null != this.field_eb &&
            !ov.a((byte) -96, this.field_Y, this.field_h)) {
            if (this.field_d != null &&
              !this.field_d.b(16440)) {
              this.field_N = true;
              if (var5 != 0) {
                this.field_t = null;
                this.field_eb = null;
              }
            } else {
              this.field_t = null;
              this.field_eb = null;
            }
          }
          if (this.field_gb != null &&
            !uw.a(this.field_h, this.field_Y, -102)) {
            if (null != this.field_E &&
              !this.field_E.b(16440)) {
              this.field_N = true;
              if (var5 != 0) {
                this.field_gb = null;
              }
            } else {
              this.field_gb = null;
            }
          }
          if (null != this.field_M &&
            !kd.c(-58, this.field_Y, this.field_h)) {
            if (this.field_g != null &&
              !this.field_g.a(false) ||
              null != this.field_E &&
              !this.field_E.b(16440)) {
              this.field_N = true;
              if (var5 != 0) {
                this.field_z = null;
                this.field_M = null;
                this.field_V = null;
              }
            } else {
              this.field_z = null;
              this.field_M = null;
              this.field_V = null;
            }
          }
          if (this.field_kb != null) {
            if (this.field_ib == null ||
              this.field_ib.b(16440)) {
              this.field_kb = null;
              if (var5 != 0) {
                this.field_N = true;
              }
            } else {
              this.field_N = true;
            }
          }
          if (null != this.field_G) {
            if (this.field_E == null ||
              this.field_E.b(16440)) {
              this.field_G = null;
              if (var5 != 0) {
                this.field_N = true;
              }
            } else {
              this.field_N = true;
            }
          }
          if (null != this.field_q &&
            !ofa.a(this.field_Y, this.field_h, (byte) -126)) {
            this.field_q = (int[][]) null;
            this.field_jb = null;
          }
          var2_intLifetime1 = -112 / ((47 - param0) / 41);
          if (this.field_D != null &&
            !qr.d(this.field_Y, this.field_h, 32)) {
            this.field_D = (int[][]) null;
            this.field_hb = null;
          }
          if (this.field_mb != null &&
            !ub.a(this.field_h, this.field_Y, (byte) 21)) {
            this.field_mb = (int[][]) null;
          }
          if (this.field_U != null &&
            (2048 & this.field_Y) == 0 &&
            (262144 & this.field_Y) == 0) {
            this.field_U = null;
            this.field_j = null;
            this.field_R = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.GA(" + param0 + ')');
        }
    }

    public static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_k = null;
          if (param0 != 3) {
            field_x = 122;
          }
          field_bb = null;
          field_B = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "gja.P(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 == this.field_v) {
            return;
          }
          if (param0 > -8) {
            return;
          }
          if (this.c((byte) 66) &&
            this.h(0)) {
            this.field_S.a(-126, 0, this.field_ib.field_e);
            this.field_S.a(-128, 1, this.field_E.field_e);
            this.field_S.a(-127, 2, this.field_d.field_e);
            boolean decompiledSharedTail0 = ((55 & this.field_h) == 0);
            if (!decompiledSharedTail0) {
              this.field_S.d(0, true);
              var2_int = 1;
              this.field_S.a(-127, 3, this.field_O.field_e);
              this.field_S.a(this.field_S.field_nc, -32);
              decompiledSharedTail0 = (var7 != 0);
            }
            if (decompiledSharedTail0) {
              this.field_S.d(0, false);
              var2_int = 0;
              this.field_S.a(this.field_S.field_ob, -32);
            }
            var3 = 0;
            while (var3 < this.field_j.length) {
              var4 = this.field_U[var3];
              var5 = this.field_U[var3 + 1];
              var6 = this.field_gb[var4] & 65535;
              if (var7 != 0) {
                return;
              }
              if (var6 == 65535) {
                var6 = -1;
              }
              this.field_S.a((byte) -80, var2_int != 0, true, var6);
              this.field_S.a(this.field_g.field_c, -19394, this.field_j[var3], var4 * 3, fma.field_f, this.field_R[var3], var5 - var4);
              var3++;
            }
          }
          this.b(-46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.T(" + param0 + ')');
        }
    }

    final void H(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = 0;
          while (this.field_W > var4_int) {
            if (var5 != 0) {
              return;
            }
            if (param0 != 0) {
              this.field_Z[var4_int] = this.field_Z[var4_int] + param0;
            }
            if (param1 != 0) {
              this.field_r[var4_int] = this.field_r[var4_int] + param1;
            }
            if (0 != param2) {
              this.field_l[var4_int] = this.field_l[var4_int] + param2;
            }
            var4_int++;
          }
          this.d(1);
          this.field_A = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void wa() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          var1_int = 0;
          while (var1_int < this.field_y) {
            this.field_Z[var1_int] = this.field_Z[var1_int] + 7 >> 4;
            this.field_r[var1_int] = 7 + this.field_r[var1_int] >> 4;
            this.field_l[var1_int] = 7 + this.field_l[var1_int] >> 4;
            var1_int++;
            if (var2 != 0) {
              return;
            }
          }
          this.d(-121);
          this.field_A = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.wa()");
        }
    }

    final void b() {
    }

    private final boolean c(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_114_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        jaclib.memory.Buffer var8 = null;
        short[] var9 = null;
        short[] var10 = null;
        short[] var11 = null;
        byte[] var12 = null;
        int var13 = 0;
        qm var7Lifetime1;
        qm var7Lifetime2;
        qm var7Lifetime3;
        jaclib.memory.Buffer var8Lifetime1;
        jaclib.memory.Buffer var8Lifetime2;
        jaclib.memory.Buffer var8Lifetime3;
        short[] var9Lifetime1;
        short[] var10Lifetime1;
        short[] var11Lifetime1;
        byte[] var12Lifetime1;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          stackIn_5_0 = (this.field_E.field_h) ? 0 : 1;
          var2_int = stackIn_5_0;
          if (0 != (55 & this.field_h) &&
            !this.field_O.field_h) {
            stackIn_12_0 = 1;
          } else {
            stackIn_12_0 = 0;
          }
          var3 = stackIn_12_0;
          stackIn_16_0 = (this.field_ib.field_h) ? 0 : 1;
          var4 = stackIn_16_0;
          stackIn_20_0 = (this.field_d.field_h) ? 0 : 1;
          var5 = stackIn_20_0;
          if (var4 == 0 &&
            var2_int == 0 &&
            var3 == 0 &&
            var5 == 0) {
            return true;
          }
          if (param0 != 66) {
            return false;
          }
          var6 = 1;
          if (var4 != 0) {
            if (this.field_kb == null) {
              return true;
            }
            if (this.field_ib.field_a == null) {
              this.field_ib.field_a = this.field_S.c(6, this.field_F);
            }
            var7 = this.field_ib.field_a;
            var7.a(12 * this.field_fb, 12, true);
            var8 = var7.a(-15730, true);
            if (var8 == null) {
              var6 = 0;
              if (var13 != 0) {
                this.field_S.field_P.copyPositions(this.field_Z, this.field_r, this.field_l, this.field_kb, 0, 12, this.field_fb, var8.getAddress());
                if (var7.a(true)) {
                  this.field_ib.field_e = var7;
                  this.field_ib.field_h = true;
                  var6 = 0;
                } else {
                  var6 = 0;
                }
              }
            } else {
              this.field_S.field_P.copyPositions(this.field_Z, this.field_r, this.field_l, this.field_kb, 0, 12, this.field_fb, var8.getAddress());
              if (var7.a(true)) {
                this.field_ib.field_e = var7;
                this.field_ib.field_h = true;
                if (var13 != 0) {
                  var6 = 0;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (var2_int != 0) {
            if (null == this.field_E.field_a) {
              this.field_E.field_a = this.field_S.c(param0 - 60, this.field_F);
            }
            var7Lifetime1 = this.field_E.field_a;
            var7Lifetime1.a(this.field_fb * 4, 4, true);
            var8Lifetime1 = var7Lifetime1.a(-15730, true);
            if (var8Lifetime1 != null) {
              boolean decompiledFrameRemainder0 = true;
              if ((55 & this.field_h) != 0) {
                this.field_S.field_P.copyColours(this.field_P, this.field_C, this.field_gb, (int) this.field_T, this.field_G, 0, 4, this.field_fb, var8Lifetime1.getAddress());
                decompiledFrameRemainder0 = (var13 != 0);
              }
              if (decompiledFrameRemainder0) {
                boolean decompiledSharedTail0 = (this.field_e != null);
                if (!decompiledSharedTail0) {
                  var10 = this.field_m;
                  var9 = this.field_lb;
                  var12 = this.field_w;
                  var11 = this.field_p;
                  decompiledSharedTail0 = (var13 != 0);
                }
                if (decompiledSharedTail0) {
                  var11 = this.field_e.field_e;
                  var9 = this.field_e.field_a;
                  var10 = this.field_e.field_c;
                  var12 = this.field_e.field_b;
                }
                this.field_S.field_P.copyLighting(this.field_P, this.field_C, this.field_gb, var9, var10, var11, var12, (int) this.field_T, (int) this.field_ab, this.field_G, 0, 4, this.field_fb, var8Lifetime1.getAddress());
              }
              if (var7Lifetime1.a(true)) {
                this.field_E.field_h = true;
                this.field_E.field_e = var7Lifetime1;
                if (var13 != 0) {
                  var6 = 0;
                  var6 = 0;
                }
              } else {
                var6 = 0;
                if (var13 != 0) {
                  var6 = 0;
                }
              }
            } else {
              var6 = 0;
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (var3 != 0) {
            if (null == this.field_O.field_a) {
              this.field_O.field_a = this.field_S.c(param0 ^ 68, this.field_F);
            }
            var7Lifetime2 = this.field_O.field_a;
            var7Lifetime2.a(this.field_fb * 12, 12, true);
            var8Lifetime2 = var7Lifetime2.a(-15730, true);
            if (var8Lifetime2 == null) {
              var6 = 0;
              decompiledFrameRemainder1 = (var13 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (this.field_e == null) {
                var11Lifetime1 = this.field_p;
                var9Lifetime1 = this.field_lb;
                var10Lifetime1 = this.field_m;
                var12Lifetime1 = this.field_w;
                if (var13 != 0) {
                  var10Lifetime1 = this.field_e.field_c;
                  var9Lifetime1 = this.field_e.field_a;
                  var11Lifetime1 = this.field_e.field_e;
                  var12Lifetime1 = this.field_e.field_b;
                }
              } else {
                var10Lifetime1 = this.field_e.field_c;
                var9Lifetime1 = this.field_e.field_a;
                var11Lifetime1 = this.field_e.field_e;
                var12Lifetime1 = this.field_e.field_b;
              }
              this.field_S.field_P.copyNormals(var9Lifetime1, var10Lifetime1, var11Lifetime1, var12Lifetime1, 3.0f / (float)this.field_ab, 3.0f / (float)(this.field_ab / 2 + this.field_ab), 0, 12, this.field_fb, var8Lifetime2.getAddress());
              if (!var7Lifetime2.a(true)) {
                var6 = 0;
                if (var13 != 0) {
                  this.field_O.field_e = var7Lifetime2;
                  this.field_O.field_h = true;
                }
              } else {
                this.field_O.field_e = var7Lifetime2;
                this.field_O.field_h = true;
              }
            }
          }
          if (var5 != 0) {
            if (this.field_d.field_a == null) {
              this.field_d.field_a = this.field_S.c(6, this.field_F);
            }
            var7Lifetime3 = this.field_d.field_a;
            var7Lifetime3.a(this.field_fb * 8, 8, true);
            var8Lifetime3 = var7Lifetime3.a(-15730, true);
            if (null == var8Lifetime3) {
              var6 = 0;
              if (var13 != 0) {
                this.field_S.field_P.copyTexCoords(this.field_eb, this.field_t, 0, 8, this.field_fb, var8Lifetime3.getAddress());
                if (!var7Lifetime3.a(true)) {
                  var6 = 0;
                  this.field_d.field_h = true;
                  this.field_d.field_e = var7Lifetime3;
                } else {
                  this.field_d.field_h = true;
                  this.field_d.field_e = var7Lifetime3;
                }
              }
            } else {
              this.field_S.field_P.copyTexCoords(this.field_eb, this.field_t, 0, 8, this.field_fb, var8Lifetime3.getAddress());
              if (!var7Lifetime3.a(true)) {
                var6 = 0;
                if (var13 != 0) {
                  this.field_d.field_h = true;
                  this.field_d.field_e = var7Lifetime3;
                }
              } else {
                this.field_d.field_h = true;
                this.field_d.field_e = var7Lifetime3;
              }
            }
          }
          stackIn_114_0 = var6;
          return stackIn_114_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.L(" + param0 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        asa var3 = null;
        int var4 = 0;
        ll var5 = null;
        gca var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        eo stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        RuntimeException decompiledCaughtException = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 55 % ((param0 + 30) / 59);
          if (null != this.field_u) {
            stackIn_7_0 = this.field_S;
            stackIn_8_1 = !(this.field_f);
            ((eo) (Object) stackIn_7_0).a(stackIn_8_1, 0);
            this.field_S.d(0, false);
            this.field_S.a(pea.field_c, 1, -79);
            this.field_S.a(1, false, pea.field_c);
            var4 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var4 >= this.field_L))) {
              var5 = this.field_u[var4];
              var6 = this.field_nb[var4];
              if (var15 == 0) {
                if (!var5.field_e ||
                  !this.field_S.f()) {
                  var7 = 0.3333333134651184f * (float)(this.field_Z[var5.field_i] + (this.field_Z[var5.field_c] + this.field_Z[var5.field_k]));
                  var8 = 0.3333333134651184f * (float)(this.field_r[var5.field_k] + (this.field_r[var5.field_i] + this.field_r[var5.field_c]));
                  var9 = (float)(this.field_l[var5.field_k] + this.field_l[var5.field_c] + this.field_l[var5.field_i]) * 0.3333333134651184f;
                  var10 = var9 * wka.field_b + (vta.field_e * var8 + baa.field_c * var7) + fba.field_a;
                  var11 = var9 * ct.field_b + (kb.field_p * var8 + var7 * vs.field_O) + tu.field_g;
                  var12 = gj.field_h + (var9 * hs.field_c + (var7 * pl.field_a + qra.field_d * var8));
                  var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + var10 * var10)))) * (float)var5.field_b;
                  var3 = this.field_S.y((byte) -77);
                  var3.a(var10 + (float)var6.field_e - var10 * var13, var6.field_m * var5.field_j >> 7, var5.field_a * var6.field_k >> 7, var6.field_c, 2, var12 - var12 * var13, var11 + (float)var6.field_b - var13 * var11);
                  var3.b(this.field_S.field_Y, 3);
                  this.field_S.F(-1662);
                  var14 = var6.field_h;
                  this.field_S.a((byte) -80, false, false, (int) var5.field_l);
                  this.field_S.c((int) var5.field_f, 1);
                  this.field_S.g(3625, var14);
                  this.field_S.y(2);
                }
                var4++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              this.field_S.a(1, false, lja.field_j);
              this.field_S.a(lja.field_j, 1, -117);
            }
            this.field_S.a(true, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.D(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != this.field_E) {
            this.field_E.field_h = false;
          }
          if (param0 != 0) {
            this.I(-112, (int[]) null, 56, 86, -123, true, 104, (int[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.HA(" + param0 + ')');
        }
    }

    final void O(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = 0;
          while (var4_int < this.field_W) {
            if (var5 != 0) {
              return;
            }
            if (param0 != 128) {
              this.field_Z[var4_int] = this.field_Z[var4_int] * param0 >> 7;
            }
            if (128 != param1) {
              this.field_r[var4_int] = this.field_r[var4_int] * param1 >> 7;
            }
            if (param2 != 128) {
              this.field_l[var4_int] = param2 * this.field_l[var4_int] >> 7;
            }
            var4_int++;
          }
          this.d(11);
          this.field_A = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void FA(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = qu.field_b[param0];
          var3 = qu.field_d[param0];
          var4 = 0;
          while (var4 < this.field_W) {
            var5 = -(this.field_l[var4] * var2_int) + var3 * this.field_r[var4] >> 14;
            this.field_l[var4] = this.field_l[var4] * var3 + this.field_r[var4] * var2_int >> 14;
            this.field_r[var4] = var5;
            var4++;
            if (var6 != 0) {
              return;
            }
          }
          this.d(94);
          this.field_A = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.FA(" + param0 + ')');
        }
    }

    private final ka a(gja param0, boolean param1, gja param2, boolean param3, int param4, boolean param5) {
        int[] array$0 = null;
        int[] array$1 = null;
        int[] array$2 = null;
        short[] array$3 = null;
        byte[] array$4 = null;
        short[] array$5 = null;
        short[] array$6 = null;
        short[] array$7 = null;
        mca fieldTemp$8 = null;
        float[] array$9 = null;
        float[] array$10 = null;
        short[] array$11 = null;
        short[] array$12 = null;
        short[] array$13 = null;
        short[] array$14 = null;
        gca[] array$15 = null;
        short discarded$16 = 0;
        int stackIn_75_0 = 0;
        gja stackIn_310_0 = null;
        RuntimeException stackIn_314_0 = null;
        StringBuilder stackIn_314_1 = null;
        String stackIn_315_2 = null;
        StringBuilder stackIn_318_1 = null;
        String stackIn_319_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mca var11_ref_mca = null;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var12Lifetime1;
        int var11Lifetime1Lifetime1;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          param0.field_y = this.field_y;
          param0.field_I = this.field_I;
          param0.field_Y = param4;
          param0.field_ab = this.field_ab;
          param0.field_L = this.field_L;
          param0.field_W = this.field_W;
          param0.field_h = this.field_h;
          param0.field_fb = this.field_fb;
          if ((param4 & 256) != 0) {
            param0.field_f = true;
          }
          if ((param4 & 256) == 0 ||
            var13 != 0) {
            param0.field_f = this.field_f;
          }
          boolean decompiledFrameCompleted9 = true;
          param0.field_T = this.field_T;
          param0.field_v = this.field_v;
          var7_int = ir.a(param4, this.field_h, (byte) -100) ? 1 : 0;
          var8 = cga.a(param4, -62, this.field_h) ? 1 : 0;
          var9 = er.c(param4, this.field_h, 52) ? 1 : 0;
          var10 = var8 | var7_int | var9;
          if (var10 == 0) {
            param0.field_Z = this.field_Z;
            param0.field_r = this.field_r;
            param0.field_l = this.field_l;
          }
          if (var10 != 0 ||
            var13 != 0) {
            if (var7_int == 0) {
              param0.field_Z = this.field_Z;
              if (var13 != 0) {
                if (null != param2.field_Z &&
                  param2.field_Z.length >= this.field_y) {
                  param0.field_Z = param2.field_Z;
                  array$0 = new int[this.field_y];
                  param2.field_Z = array$0;
                  param0.field_Z = array$0;
                } else {
                  array$0 = new int[this.field_y];
                  param2.field_Z = array$0;
                  param0.field_Z = array$0;
                }
              }
            } else {
              if (null != param2.field_Z &&
                param2.field_Z.length >= this.field_y) {
                param0.field_Z = param2.field_Z;
                if (var13 != 0) {
                  array$0 = new int[this.field_y];
                  param2.field_Z = array$0;
                  param0.field_Z = array$0;
                }
              } else {
                array$0 = new int[this.field_y];
                param2.field_Z = array$0;
                param0.field_Z = array$0;
              }
            }
            if (var8 != 0) {
              if (param2.field_r == null ||
                !(this.field_y <= param2.field_r.length)) {
                array$1 = new int[this.field_y];
                param2.field_r = array$1;
                param0.field_r = array$1;
                if (var13 != 0) {
                  param0.field_r = param2.field_r;
                  param0.field_r = this.field_r;
                }
              } else {
                param0.field_r = param2.field_r;
                if (var13 != 0) {
                  param0.field_r = this.field_r;
                }
              }
            } else {
              param0.field_r = this.field_r;
            }
            if (var9 == 0) {
              param0.field_l = this.field_l;
              if (var13 != 0) {
                if (param2.field_l == null ||
                  !(param2.field_l.length >= this.field_y)) {
                  array$2 = new int[this.field_y];
                  param2.field_l = array$2;
                  param0.field_l = array$2;
                  param0.field_l = param2.field_l;
                } else {
                  param0.field_l = param2.field_l;
                }
              }
            } else {
              if (param2.field_l == null ||
                !(param2.field_l.length >= this.field_y)) {
                array$2 = new int[this.field_y];
                param2.field_l = array$2;
                param0.field_l = array$2;
                if (var13 != 0) {
                  param0.field_l = param2.field_l;
                }
              } else {
                param0.field_l = param2.field_l;
              }
            }
            var11 = 0;
            while (this.field_y > var11) {
              stackIn_75_0 = var7_int;
              if (var13 != 0) {
                decompiledFrameCompleted9 = false;
                break;
              }
              if (stackIn_75_0 != 0) {
                param0.field_Z[var11] = this.field_Z[var11];
              }
              if (var8 != 0) {
                param0.field_r[var11] = this.field_r[var11];
              }
              if (var9 != 0) {
                param0.field_l[var11] = this.field_l[var11];
              }
              var11++;
            }
          }
          if (decompiledFrameCompleted9) {
            stackIn_75_0 = uu.a(true, param4, this.field_h) ? 1 : 0;
          }
          if (stackIn_75_0 == 0) {
            if (!ss.a((byte) 114, this.field_h, param4)) {
              param0.field_ib = null;
              if (var13 != 0) {
                param0.field_ib = this.field_ib;
                param0.field_ib = param2.field_ib;
                param0.field_ib.field_h = this.field_ib.field_h;
                param0.field_ib.field_b = true;
                param0.field_ib.field_e = this.field_ib.field_e;
              }
            } else {
              param0.field_ib = this.field_ib;
              if (var13 != 0) {
                param0.field_ib = param2.field_ib;
                param0.field_ib.field_h = this.field_ib.field_h;
                param0.field_ib.field_b = true;
                param0.field_ib.field_e = this.field_ib.field_e;
              }
            }
          } else {
            param0.field_ib = param2.field_ib;
            param0.field_ib.field_h = this.field_ib.field_h;
            param0.field_ib.field_b = true;
            param0.field_ib.field_e = this.field_ib.field_e;
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameCompleted7 = true;
          boolean decompiledFrameCompleted8 = true;
          boolean decompiledFrameRemainder1 = true;
          if (!bqa.a(540800, param4, this.field_h)) {
            param0.field_P = this.field_P;
            decompiledFrameRemainder1 = (var13 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (param2.field_P != null &&
              this.field_I <= param2.field_P.length) {
              param0.field_P = param2.field_P;
              if (var13 != 0) {
                array$3 = new short[this.field_I];
                param2.field_P = array$3;
                param0.field_P = array$3;
              }
            } else {
              array$3 = new short[this.field_I];
              param2.field_P = array$3;
              param0.field_P = array$3;
            }
            var11Lifetime1 = 0;
            while (var11Lifetime1 < this.field_I) {
              param0.field_P[var11Lifetime1] = this.field_P[var11Lifetime1];
              var11Lifetime1++;
              if (var13 != 0) {
                decompiledFrameCompleted8 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted8) &&
            (go.d(this.field_h, param4, 26205))) {
            if (null == param2.field_C ||
              !(param2.field_C.length >= this.field_I)) {
              array$4 = new byte[this.field_I];
              param2.field_C = array$4;
              param0.field_C = array$4;
              if (var13 != 0) {
                param0.field_C = param2.field_C;
              }
            } else {
              param0.field_C = param2.field_C;
            }
            var11Lifetime1Lifetime1 = 0;
            while (var11Lifetime1Lifetime1 < this.field_I) {
              param0.field_C[var11Lifetime1Lifetime1] = this.field_C[var11Lifetime1Lifetime1];
              var11Lifetime1Lifetime1++;
              if (var13 != 0) {
                decompiledFrameCompleted7 = false;
                break;
              }
            }
            if (decompiledFrameCompleted7) {
              decompiledFrameRemainder2 = (var13 != 0);
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameCompleted7)) {
            param0.field_C = this.field_C;
          }
          if (no.a(this.field_h, param4, 36864)) {
            param0.field_E = param2.field_E;
            param0.field_E.field_h = this.field_E.field_h;
            param0.field_E.field_b = true;
            param0.field_E.field_e = this.field_E.field_e;
            if (var13 != 0) {
              if (lf.a(this.field_h, param4, 128)) {
                param0.field_E = this.field_E;
                param0.field_E = null;
              } else {
                param0.field_E = null;
              }
            }
          } else {
            if (lf.a(this.field_h, param4, 128)) {
              param0.field_E = this.field_E;
              if (var13 != 0) {
                param0.field_E = null;
              }
            } else {
              param0.field_E = null;
            }
          }
          if (kaa.a(this.field_h, param4, param1)) {
            if (null == param2.field_lb ||
              !(this.field_fb <= param2.field_lb.length)) {
              var11Lifetime2 = this.field_fb;
              array$5 = new short[var11Lifetime2];
              param2.field_lb = array$5;
              param0.field_lb = array$5;
              array$6 = new short[var11Lifetime2];
              param2.field_p = array$6;
              param0.field_p = array$6;
              array$7 = new short[var11Lifetime2];
              param2.field_m = array$7;
              param0.field_m = array$7;
              if (var13 != 0) {
                param0.field_p = param2.field_p;
                param0.field_lb = param2.field_lb;
                param0.field_m = param2.field_m;
              }
            } else {
              param0.field_p = param2.field_p;
              param0.field_lb = param2.field_lb;
              param0.field_m = param2.field_m;
            }
            boolean decompiledFrameCompleted6 = true;
            boolean decompiledFrameCompleted5 = true;
            boolean decompiledFrameRemainder0 = true;
            if (null != this.field_e) {
              if (param2.field_e == null) {
                param2.field_e = new mca();
              }
              fieldTemp$8 = param2.field_e;
              param0.field_e = param2.field_e;
              var11_ref_mca = fieldTemp$8;
              if (var11_ref_mca.field_a == null ||
                !(var11_ref_mca.field_a.length >= this.field_fb)) {
                var12 = this.field_fb;
                var11_ref_mca.field_a = new short[var12];
                var11_ref_mca.field_e = new short[var12];
                var11_ref_mca.field_b = new byte[var12];
                var11_ref_mca.field_c = new short[var12];
              }
              var12 = 0;
              while (this.field_fb > var12) {
                param0.field_lb[var12] = this.field_lb[var12];
                param0.field_m[var12] = this.field_m[var12];
                param0.field_p[var12] = this.field_p[var12];
                var11_ref_mca.field_a[var12] = this.field_e.field_a[var12];
                var11_ref_mca.field_c[var12] = this.field_e.field_c[var12];
                var11_ref_mca.field_e[var12] = this.field_e.field_e[var12];
                var11_ref_mca.field_b[var12] = this.field_e.field_b[var12];
                var12++;
                if (var13 != 0) {
                  decompiledFrameCompleted6 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted6) {
                decompiledFrameRemainder0 = (var13 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted6)) {
              param0.field_e = null;
              var11Lifetime2 = 0;
              while (var11Lifetime2 < this.field_fb) {
                param0.field_lb[var11Lifetime2] = this.field_lb[var11Lifetime2];
                param0.field_m[var11Lifetime2] = this.field_m[var11Lifetime2];
                param0.field_p[var11Lifetime2] = this.field_p[var11Lifetime2];
                var11Lifetime2++;
                if (var13 != 0) {
                  decompiledFrameCompleted5 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted6) &&
              (decompiledFrameCompleted5)) {
              param0.field_w = this.field_w;
            }
            if (var13 != 0) {
              param0.field_p = this.field_p;
              param0.field_m = this.field_m;
              param0.field_w = this.field_w;
              param0.field_e = this.field_e;
              param0.field_lb = this.field_lb;
            }
          } else {
            param0.field_p = this.field_p;
            param0.field_m = this.field_m;
            param0.field_w = this.field_w;
            param0.field_e = this.field_e;
            param0.field_lb = this.field_lb;
          }
          if (!oba.c(param4, this.field_h, -19531)) {
            if (vta.a(this.field_h, param4, 2048)) {
              param0.field_O = this.field_O;
              if (var13 != 0) {
                param0.field_O = null;
                param0.field_O = param2.field_O;
                param0.field_O.field_h = this.field_O.field_h;
                param0.field_O.field_e = this.field_O.field_e;
                param0.field_O.field_b = true;
              }
            } else {
              param0.field_O = null;
              if (var13 != 0) {
                param0.field_O = param2.field_O;
                param0.field_O.field_h = this.field_O.field_h;
                param0.field_O.field_e = this.field_O.field_e;
                param0.field_O.field_b = true;
              }
            }
          } else {
            param0.field_O = param2.field_O;
            param0.field_O.field_h = this.field_O.field_h;
            param0.field_O.field_e = this.field_O.field_e;
            param0.field_O.field_b = true;
          }
          boolean decompiledFrameCompleted4 = true;
          if (uk.a(this.field_h, (byte) -47, param4)) {
            if (param2.field_eb == null ||
              !(this.field_I <= param2.field_eb.length)) {
              var11Lifetime3 = this.field_fb;
              array$9 = new float[var11Lifetime3];
              param2.field_t = array$9;
              param0.field_t = array$9;
              array$10 = new float[var11Lifetime3];
              param2.field_eb = array$10;
              param0.field_eb = array$10;
              if (var13 != 0) {
                param0.field_eb = param2.field_eb;
                param0.field_t = param2.field_t;
              }
            } else {
              param0.field_eb = param2.field_eb;
              param0.field_t = param2.field_t;
            }
            var11Lifetime3 = 0;
            while (this.field_fb > var11Lifetime3) {
              param0.field_eb[var11Lifetime3] = this.field_eb[var11Lifetime3];
              param0.field_t[var11Lifetime3] = this.field_t[var11Lifetime3];
              var11Lifetime3++;
              if (var13 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted4) &&
              (var13 != 0)) {
              param0.field_t = this.field_t;
              param0.field_eb = this.field_eb;
            }
          } else {
            param0.field_t = this.field_t;
            param0.field_eb = this.field_eb;
          }
          if (pr.a(param4, -23611, this.field_h)) {
            param0.field_d = param2.field_d;
            param0.field_d.field_e = this.field_d.field_e;
            param0.field_d.field_h = this.field_d.field_h;
            param0.field_d.field_b = true;
            if (var13 != 0) {
              if (!foa.a(param4, this.field_h, 0)) {
                param0.field_d = null;
                param0.field_d = this.field_d;
              } else {
                param0.field_d = this.field_d;
              }
            }
          } else {
            if (!foa.a(param4, this.field_h, 0)) {
              param0.field_d = null;
              if (var13 != 0) {
                param0.field_d = this.field_d;
              }
            } else {
              param0.field_d = this.field_d;
            }
          }
          boolean decompiledFrameCompleted3 = true;
          if (pca.b(this.field_h, 71, param4)) {
            L67: {
              if (null != param2.field_M &&
                param2.field_M.length >= this.field_I) {
                param0.field_z = param2.field_z;
                param0.field_M = param2.field_M;
                param0.field_V = param2.field_V;
                if (var13 == 0) {
                  break L67;
                }
              }
              var11Lifetime4 = this.field_I;
              array$11 = new short[var11Lifetime4];
              param2.field_z = array$11;
              param0.field_z = array$11;
              array$12 = new short[var11Lifetime4];
              param2.field_M = array$12;
              param0.field_M = array$12;
              array$13 = new short[var11Lifetime4];
              param2.field_V = array$13;
              param0.field_V = array$13;
            }
            var11Lifetime4 = 0;
            while (this.field_I > var11Lifetime4) {
              param0.field_M[var11Lifetime4] = this.field_M[var11Lifetime4];
              param0.field_z[var11Lifetime4] = this.field_z[var11Lifetime4];
              param0.field_V[var11Lifetime4] = this.field_V[var11Lifetime4];
              var11Lifetime4++;
              if (var13 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted3) &&
              (var13 != 0)) {
              param0.field_z = this.field_z;
              param0.field_V = this.field_V;
              param0.field_M = this.field_M;
            }
          } else {
            param0.field_z = this.field_z;
            param0.field_V = this.field_V;
            param0.field_M = this.field_M;
          }
          if (!uu.a(param4, this.field_h, (byte) -116)) {
            if (!ag.b(-1, param4, this.field_h)) {
              param0.field_g = null;
              if (var13 != 0) {
                param0.field_g = this.field_g;
                param0.field_g = param2.field_g;
                param0.field_g.field_g = true;
                param0.field_g.field_a = this.field_g.field_a;
                param0.field_g.field_c = this.field_g.field_c;
              }
            } else {
              param0.field_g = this.field_g;
              if (var13 != 0) {
                param0.field_g = param2.field_g;
                param0.field_g.field_g = true;
                param0.field_g.field_a = this.field_g.field_a;
                param0.field_g.field_c = this.field_g.field_c;
              }
            }
          } else {
            param0.field_g = param2.field_g;
            param0.field_g.field_g = true;
            param0.field_g.field_a = this.field_g.field_a;
            param0.field_g.field_c = this.field_g.field_c;
          }
          boolean decompiledFrameCompleted2 = true;
          if (fua.a(98, param4, this.field_h)) {
            if (param2.field_gb != null &&
              param2.field_gb.length >= this.field_I) {
              param0.field_gb = param2.field_gb;
              if (var13 != 0) {
                var11Lifetime5 = this.field_I;
                array$14 = new short[var11Lifetime5];
                param2.field_gb = array$14;
                param0.field_gb = array$14;
              }
            } else {
              var11Lifetime5 = this.field_I;
              array$14 = new short[var11Lifetime5];
              param2.field_gb = array$14;
              param0.field_gb = array$14;
            }
            var11Lifetime5 = 0;
            while (this.field_I > var11Lifetime5) {
              param0.field_gb[var11Lifetime5] = this.field_gb[var11Lifetime5];
              var11Lifetime5++;
              if (var13 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted2) &&
              (var13 != 0)) {
              param0.field_gb = this.field_gb;
            }
          } else {
            param0.field_gb = this.field_gb;
          }
          boolean decompiledFrameCompleted0 = true;
          L81: {
            boolean decompiledFrameCompleted1 = true;
            if (!hk.a(param4, this.field_h, -93)) {
              param0.field_nb = this.field_nb;
              if (var13 == 0) {
                break L81;
              }
            }
            if (param2.field_nb != null &&
              this.field_L <= param2.field_nb.length) {
              param0.field_nb = param2.field_nb;
              var11Lifetime6 = 0;
              while (var11Lifetime6 < this.field_L) {
                param0.field_nb[var11Lifetime6].a((byte) -81, this.field_nb[var11Lifetime6]);
                var11Lifetime6++;
                if (var13 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted1) &&
                (var13 == 0)) {
                break L81;
              }
            }
            if (decompiledFrameCompleted1) {
              var11Lifetime6 = this.field_L;
              array$15 = new gca[var11Lifetime6];
              param2.field_nb = array$15;
              param0.field_nb = array$15;
              var12Lifetime1 = 0;
              while (this.field_L > var12Lifetime1) {
                param0.field_nb[var12Lifetime1] = this.field_nb[var12Lifetime1].a(6);
                var12Lifetime1++;
                if (var13 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
          }
          if (decompiledFrameCompleted0) {
            if (param1) {
              discarded$16 = this.a(119, -102, -0.9161184430122375f, 115, -91, 115, -41L, -82, 0.9345446825027466f, false, (oc) null);
            }
            param0.field_hb = this.field_hb;
            param0.field_mb = this.field_mb;
            param0.field_X = this.field_X;
            param0.field_db = this.field_db;
            param0.field_D = this.field_D;
            param0.field_R = this.field_R;
            param0.field_U = this.field_U;
            param0.field_s = this.field_s;
            param0.field_kb = this.field_kb;
            param0.field_j = this.field_j;
            param0.field_G = this.field_G;
            param0.field_jb = this.field_jb;
            param0.field_J = this.field_J;
            param0.field_u = this.field_u;
            param0.field_q = this.field_q;
          }
          if (this.field_A) {
            param0.field_H = this.field_H;
            param0.field_o = this.field_o;
            param0.field_cb = this.field_cb;
            param0.field_i = this.field_i;
            param0.field_K = this.field_K;
            param0.field_A = true;
            param0.field_Q = this.field_Q;
            param0.field_n = this.field_n;
            if (var13 != 0) {
              param0.field_A = false;
            }
          } else {
            param0.field_A = false;
          }
          stackIn_310_0 = (gja) (param0);
          return (ka) ((Object) stackIn_310_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_314_0 = var7;
          stackIn_314_1 = new StringBuilder().append("gja.S(");
          if (param0 == null) {
            stackIn_315_2 = "null";
          } else {
            stackIn_315_2 = "{...}";
          }
          stackIn_318_1 = ((StringBuilder) (Object) stackIn_314_1).append(stackIn_315_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_319_2 = "null";
          } else {
            stackIn_319_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_314_0), ((StringBuilder) (Object) stackIn_318_1).append(stackIn_319_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_219_1 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        RuntimeException stackIn_292_0 = null;
        StringBuilder stackIn_292_1 = null;
        String stackIn_293_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var11_int = 0;
        ll var11_ref = null;
        int var12 = 0;
        gca var12_ref_gca = null;
        int[] var12_ref_int__ = null;
        int var13_int = 0;
        gca var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        ll var11_refLifetime1;
        gca var12_ref_gcaLifetime1;
        ll var11_refLifetime2;
        gca var12_ref_gcaLifetime2;
        ll var11_refLifetime1Lifetime1;
        gca var12_ref_gcaLifetime1Lifetime1;
        int stackIn_85_0Lifetime1;
        int stackIn_86_0Lifetime1;
        int stackIn_86_1Lifetime1;
        int stackIn_95_0Lifetime1;
        int stackIn_95_1Lifetime1;
        int stackIn_162_0Lifetime1;
        int stackIn_174_0Lifetime1;
        int stackIn_174_1Lifetime1;
        int stackIn_215_0Lifetime1;
        int stackIn_215_1Lifetime1;
        int stackIn_229_0Lifetime1;
        int stackIn_229_1Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          var8_int = param1.length;
          if (0 == param0) {
            param3 = param3 << 4;
            param2 = param2 << 4;
            param4 = param4 << 4;
            ina.field_a = 0;
            pb.field_k = 0;
            uu.field_c = 0;
            var9 = 0;
            var10 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var10 >= var8_int))) {
              var11_int = param1[var10];
              stackIn_17_0 = var11_int;
              stackIn_17_1 = this.field_D.length;
              if (var21 == 0) {
                if (stackIn_17_0 < stackIn_17_1) {
                  var12_ref_int__ = this.field_D[var11_int];
                  var13_int = 0;
                  while (var13_int < var12_ref_int__.length) {
                    var14 = var12_ref_int__[var13_int];
                    ina.field_a = ina.field_a + this.field_Z[var14];
                    pb.field_k = pb.field_k + this.field_r[var14];
                    var9++;
                    uu.field_c = uu.field_c + this.field_l[var14];
                    var13_int++;
                  }
                }
                var10++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_17_0 = 0;
              stackIn_17_1 = var9;
            }
            if (stackIn_17_0 >= stackIn_17_1) {
              ina.field_a = param2;
              pb.field_k = param3;
              uu.field_c = param4;
              if (var21 == 0) {
                return;
              }
            }
            uu.field_c = uu.field_c / var9 + param4;
            ina.field_a = ina.field_a / var9 + param2;
            pb.field_k = param3 + pb.field_k / var9;
            return;
          }
          if (param0 == 1) {
            param3 = param3 << 4;
            param2 = param2 << 4;
            param4 = param4 << 4;
            var9 = 0;
            while (var8_int > var9) {
              boolean decompiledFrameCompleted4 = true;
              var10 = param1[var9];
              if (this.field_D.length > var10) {
                var11 = this.field_D[var10];
                var12 = 0;
                while (var12 < var11.length) {
                  var13_int = var11[var12];
                  this.field_Z[var13_int] = this.field_Z[var13_int] + param2;
                  this.field_r[var13_int] = this.field_r[var13_int] + param3;
                  this.field_l[var13_int] = this.field_l[var13_int] + param4;
                  var12++;
                  if (var21 != 0) {
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                }
              }
              if (decompiledFrameCompleted4) {
                var9++;
              }
              if (var21 == 0) {
                continue;
              }
              break;
            }
            return;
          }
          if (2 != param0) {
            if (param0 == 3) {
              var9 = 0;
              while (var8_int > var9) {
                boolean decompiledFrameCompleted3 = true;
                var10 = param1[var9];
                if (var10 < this.field_D.length) {
                  var11 = this.field_D[var10];
                  var12 = 0;
                  while (var12 < var11.length) {
                    var13_int = var11[var12];
                    this.field_Z[var13_int] = this.field_Z[var13_int] - ina.field_a;
                    this.field_r[var13_int] = this.field_r[var13_int] - pb.field_k;
                    this.field_l[var13_int] = this.field_l[var13_int] - uu.field_c;
                    this.field_Z[var13_int] = param2 * this.field_Z[var13_int] >> 7;
                    this.field_r[var13_int] = param3 * this.field_r[var13_int] >> 7;
                    this.field_l[var13_int] = this.field_l[var13_int] * param4 >> 7;
                    this.field_Z[var13_int] = this.field_Z[var13_int] + ina.field_a;
                    this.field_r[var13_int] = this.field_r[var13_int] + pb.field_k;
                    this.field_l[var13_int] = this.field_l[var13_int] + uu.field_c;
                    var12++;
                    if (var21 != 0) {
                      decompiledFrameCompleted3 = false;
                      break;
                    }
                  }
                }
                if (decompiledFrameCompleted3) {
                  var9++;
                }
                if (var21 == 0) {
                  continue;
                }
                break;
              }
              return;
            }
            if (param0 == 5) {
              if (this.field_q != null) {
                var9 = 0;
                var10 = 0;
                L43: while (true) {
                  if (var8_int > var10) {
                    var11_int = param1[var10];
                    stackIn_174_0 = var11_int;
                    stackIn_174_1 = this.field_q.length;
                    if (var21 != 0) {
                      if (stackIn_174_0 > stackIn_174_1) {
                        var11_ref = this.field_u[var10];
                        var12_ref_gca = this.field_nb[var10];
                        var12_ref_gca.field_h = 255 - (255 & this.field_C[var11_ref.field_m]) << 24 | 16777215 & var12_ref_gca.field_h;
                        var10++;
                        return;
                      }
                      break L43;
                    }
                    if (stackIn_174_0 < stackIn_174_1) {
                      var12_ref_int__ = this.field_q[var11_int];
                      var13_int = 0;
                      while (true) {
                        if (var12_ref_int__.length > var13_int) {
                          var14 = var12_ref_int__[var13_int];
                          var15 = 8 * param2 + (this.field_C[var14] & 255);
                          stackIn_162_0 = var15;
                          if (stackIn_162_0 >= 0) {
                            if (var15 > 255) {
                              var15 = 255;
                            }
                          } else {
                            var15 = 0;
                          }
                          this.field_C[var14] = (byte)var15;
                          var13_int++;
                          continue;
                        }
                        break;
                      }
                      stackIn_162_0Lifetime1 = var9;
                      if (var12_ref_int__.length <= 0) {
                        stackIn_166_1 = 0;
                      } else {
                        stackIn_166_1 = 1;
                      }
                      var9 = stackIn_162_0Lifetime1 | stackIn_166_1;
                    }
                    var10++;
                    continue;
                  }
                  if (var9 == 0) {
                    return;
                  }
                  if (this.field_u == null) {
                    break L43;
                  }
                  var10 = 0;
                  while (true) {
                    stackIn_174_0Lifetime1 = ~var10;
                    stackIn_174_1Lifetime1 = ~this.field_L;
                    if (stackIn_174_0Lifetime1 <= stackIn_174_1Lifetime1) {
                      break;
                    }
                    var11_refLifetime2 = this.field_u[var10];
                    var12_ref_gcaLifetime2 = this.field_nb[var10];
                    var12_ref_gcaLifetime2.field_h = 255 - (255 & this.field_C[var11_refLifetime2.field_m]) << 24 | 16777215 & var12_ref_gcaLifetime2.field_h;
                    var10++;
                    if (var21 != 0) {
                      return;
                    }
                  }
                  break;
                }
                this.e(0);
                return;
              }
              return;
            }
            if (param0 != 7) {
              if (param0 == 8) {
                if (this.field_mb != null) {
                  var9 = 0;
                  do {
                    if (var9 >= var8_int) {
                      return;
                    }
                    boolean decompiledFrameCompleted2 = true;
                    var10 = param1[var9];
                    if (this.field_mb.length > var10) {
                      var11 = this.field_mb[var10];
                      var12 = 0;
                      while (var12 < var11.length) {
                        var13 = this.field_nb[var11[var12]];
                        var13.field_b = var13.field_b + param3;
                        var13.field_e = var13.field_e + param2;
                        var12++;
                        if (var21 != 0) {
                          decompiledFrameCompleted2 = false;
                          break;
                        }
                      }
                    }
                    if (decompiledFrameCompleted2) {
                      var9++;
                    }
                  } while (var21 == 0);
                  return;
                }
                return;
              }
              if (10 == param0) {
                if (this.field_mb != null) {
                  var9 = 0;
                  do {
                    if (var8_int <= var9) {
                      return;
                    }
                    boolean decompiledFrameCompleted1 = true;
                    var10 = param1[var9];
                    if (var10 < this.field_mb.length) {
                      var11 = this.field_mb[var10];
                      var12 = 0;
                      while (var11.length > var12) {
                        var13 = this.field_nb[var11[var12]];
                        var13.field_k = param3 * var13.field_k >> 7;
                        var13.field_m = var13.field_m * param2 >> 7;
                        var12++;
                        if (var21 != 0) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                      }
                    }
                    if (decompiledFrameCompleted1) {
                      var9++;
                    }
                  } while (var21 == 0);
                  return;
                }
                return;
              }
              if (9 != param0) {
                return;
              }
              if (null != this.field_mb) {
                var9 = 0;
                do {
                  if (var8_int <= var9) {
                    return;
                  }
                  boolean decompiledFrameCompleted0 = true;
                  var10 = param1[var9];
                  if (this.field_mb.length > var10) {
                    var11 = this.field_mb[var10];
                    var12 = 0;
                    while (var12 < var11.length) {
                      var13 = this.field_nb[var11[var12]];
                      var13.field_c = 16383 & var13.field_c + param2;
                      var12++;
                      if (var21 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                  }
                  if (decompiledFrameCompleted0) {
                    var9++;
                  }
                } while (var21 == 0);
                return;
              }
              return;
            }
            if (null != this.field_q) {
              var9 = 0;
              var10 = 0;
              L12: while (true) {
                if (var10 < var8_int) {
                  var11_int = param1[var10];
                  stackIn_229_0 = this.field_q.length;
                  stackIn_229_1 = var11_int;
                  if (var21 != 0) {
                    if (stackIn_229_0 > stackIn_229_1) {
                      var11_refLifetime1 = this.field_u[var10];
                      var12_ref_gcaLifetime1 = this.field_nb[var10];
                      var12_ref_gcaLifetime1.field_h = 16777215 & cla.field_m[this.field_P[var11_refLifetime1.field_m] & 65535] | var12_ref_gcaLifetime1.field_h & -16777216;
                      var10++;
                      return;
                    }
                    break L12;
                  }
                  if (stackIn_229_0 > stackIn_229_1) {
                    var12_ref_int__ = this.field_q[var11_int];
                    var13_int = 0;
                    while (true) {
                      if (var13_int < var12_ref_int__.length) {
                        var14 = var12_ref_int__[var13_int];
                        var15 = this.field_P[var14] & 65535;
                        var16 = 63 & var15 >> 10;
                        var17 = (var15 & 1004) >> 7;
                        var18 = 127 & var15;
                        var16 = 63 & param2 + var16;
                        var17 = var17 + param3 / 4;
                        stackIn_215_0 = 0;
                        stackIn_215_1 = var17;
                        if (stackIn_215_0 > stackIn_215_1) {
                          var17 = 0;
                        } else {
                          if (var17 > 7) {
                            var17 = 7;
                          }
                        }
                        var18 = var18 + param4;
                        if (0 > var18) {
                          var18 = 0;
                        } else {
                          if (var18 > 127) {
                            var18 = 127;
                          }
                        }
                        this.field_P[var14] = (short)fh.a(fh.a(var17 << 7, var16 << 10), var18);
                        var13_int++;
                        continue;
                      }
                      break;
                    }
                    stackIn_215_0Lifetime1 = var9;
                    stackIn_215_1Lifetime1 = ~var12_ref_int__.length;
                    if (stackIn_215_1Lifetime1 >= -1) {
                      stackIn_219_1 = 0;
                    } else {
                      stackIn_219_1 = 1;
                    }
                    var9 = stackIn_215_0Lifetime1 | stackIn_219_1;
                  }
                  var10++;
                  continue;
                }
                if (var9 == 0) {
                  return;
                }
                if (this.field_u == null) {
                  break L12;
                }
                var10 = 0;
                while (true) {
                  stackIn_229_0Lifetime1 = ~var10;
                  stackIn_229_1Lifetime1 = ~this.field_L;
                  if (stackIn_229_0Lifetime1 <= stackIn_229_1Lifetime1) {
                    break;
                  }
                  var11_refLifetime1Lifetime1 = this.field_u[var10];
                  var12_ref_gcaLifetime1Lifetime1 = this.field_nb[var10];
                  var12_ref_gcaLifetime1Lifetime1.field_h = 16777215 & cla.field_m[this.field_P[var11_refLifetime1Lifetime1.field_m] & 65535] | var12_ref_gcaLifetime1Lifetime1.field_h & -16777216;
                  var10++;
                  if (var21 != 0) {
                    return;
                  }
                }
                break;
              }
              this.e(0);
              return;
            }
            return;
          }
          var9 = 0;
          L55: while (true) {
            stackIn_44_0 = var8_int;
            while (true) {
              stackIn_45_0 = stackIn_44_0;
              stackIn_45_1 = var9;
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_45_0 > stackIn_45_1) {
                  var10 = param1[var9];
                  stackIn_86_0 = ~var10;
                  stackIn_86_1 = ~this.field_D.length;
                  if (var21 != 0) {
                    if (stackIn_86_0 > stackIn_86_1) {
                      var10 = param1[var9];
                      return;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (stackIn_86_0 > stackIn_86_1) {
                      var11 = this.field_D[var10];
                      if ((param5 & 1) != 0) {
                        var12 = 0;
                        while (var12 < var11.length) {
                          var13_int = var11[var12];
                          this.field_Z[var13_int] = this.field_Z[var13_int] - ina.field_a;
                          this.field_r[var13_int] = this.field_r[var13_int] - pb.field_k;
                          this.field_l[var13_int] = this.field_l[var13_int] - uu.field_c;
                          stackIn_44_0 = param2;
                          if (stackIn_44_0 != 0) {
                            var14 = qu.field_b[param2];
                            var15 = qu.field_d[param2];
                            var16 = -(this.field_l[var13_int] * var14) + (this.field_r[var13_int] * var15 + 16383) >> 14;
                            this.field_l[var13_int] = this.field_r[var13_int] * var14 + (var15 * this.field_l[var13_int] + 16383) >> 14;
                            this.field_r[var13_int] = var16;
                          }
                          if (param4 != 0) {
                            var14 = qu.field_b[param4];
                            var15 = qu.field_d[param4];
                            var16 = 16383 + var14 * this.field_r[var13_int] + this.field_Z[var13_int] * var15 >> 14;
                            this.field_r[var13_int] = 16383 + (-(this.field_Z[var13_int] * var14) + var15 * this.field_r[var13_int]) >> 14;
                            this.field_Z[var13_int] = var16;
                          }
                          if (param3 != 0) {
                            var14 = qu.field_b[param3];
                            var15 = qu.field_d[param3];
                            var16 = 16383 + var14 * this.field_l[var13_int] + var15 * this.field_Z[var13_int] >> 14;
                            this.field_l[var13_int] = this.field_l[var13_int] * var15 - (this.field_Z[var13_int] * var14 - 16383) >> 14;
                            this.field_Z[var13_int] = var16;
                          }
                          this.field_Z[var13_int] = this.field_Z[var13_int] + ina.field_a;
                          this.field_r[var13_int] = this.field_r[var13_int] + pb.field_k;
                          this.field_l[var13_int] = this.field_l[var13_int] + uu.field_c;
                          var12++;
                        }
                      } else {
                        var12 = 0;
                        while (var11.length > var12) {
                          var13_int = var11[var12];
                          this.field_Z[var13_int] = this.field_Z[var13_int] - ina.field_a;
                          this.field_r[var13_int] = this.field_r[var13_int] - pb.field_k;
                          this.field_l[var13_int] = this.field_l[var13_int] - uu.field_c;
                          stackIn_45_0 = -1;
                          stackIn_45_1 = ~param4;
                          if (stackIn_45_0 != stackIn_45_1) {
                            var14 = qu.field_b[param4];
                            var15 = qu.field_d[param4];
                            var16 = 16383 + (this.field_r[var13_int] * var14 + this.field_Z[var13_int] * var15) >> 14;
                            this.field_r[var13_int] = -(var14 * this.field_Z[var13_int]) + this.field_r[var13_int] * var15 + 16383 >> 14;
                            this.field_Z[var13_int] = var16;
                          }
                          if (param2 != 0) {
                            var14 = qu.field_b[param2];
                            var15 = qu.field_d[param2];
                            var16 = 16383 - var14 * this.field_l[var13_int] + var15 * this.field_r[var13_int] >> 14;
                            this.field_l[var13_int] = 16383 + var14 * this.field_r[var13_int] + this.field_l[var13_int] * var15 >> 14;
                            this.field_r[var13_int] = var16;
                          }
                          if (param3 != 0) {
                            var14 = qu.field_b[param3];
                            var15 = qu.field_d[param3];
                            var16 = 16383 + var15 * this.field_Z[var13_int] + this.field_l[var13_int] * var14 >> 14;
                            this.field_l[var13_int] = this.field_l[var13_int] * var15 + (-(this.field_Z[var13_int] * var14) + 16383) >> 14;
                            this.field_Z[var13_int] = var16;
                          }
                          this.field_Z[var13_int] = this.field_Z[var13_int] + ina.field_a;
                          this.field_r[var13_int] = this.field_r[var13_int] + pb.field_k;
                          this.field_l[var13_int] = this.field_l[var13_int] + uu.field_c;
                          var12++;
                        }
                      }
                    }
                    var9++;
                    continue L55;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (!param6) {
                    return;
                  }
                  var9 = 0;
                  while (true) {
                    stackIn_85_0 = ~var9;
                    stackIn_86_0Lifetime1 = stackIn_85_0;
                    stackIn_86_1Lifetime1 = ~var8_int;
                    if (stackIn_86_0Lifetime1 <= stackIn_86_1Lifetime1) {
                      break;
                    }
                    var10 = param1[var9];
                    if (var21 != 0) {
                      return;
                    }
                    if (var10 < this.field_D.length) {
                      var11 = this.field_D[var10];
                      var12 = 0;
                      while (true) {
                        stackIn_95_0 = var11.length;
                        stackIn_95_1 = var12;
                        if (stackIn_95_0 <= stackIn_95_1) {
                          break;
                        }
                        var13_int = var11[var12];
                        var14 = this.field_J[var13_int];
                        var15 = this.field_J[1 + var13_int];
                        stackIn_85_0Lifetime1 = var14;
                        var16 = stackIn_85_0Lifetime1;
                        while (var16 < var15) {
                          var17 = this.field_db[var16] - 1;
                          stackIn_95_0Lifetime1 = -1;
                          stackIn_95_1Lifetime1 = var17;
                          if (stackIn_95_0Lifetime1 != stackIn_95_1Lifetime1 ||
                            var21 != 0) {
                            if (param4 != 0) {
                              var18 = qu.field_b[param4];
                              var19 = qu.field_d[param4];
                              var20 = 16383 + (this.field_lb[var17] * var19 + this.field_m[var17] * var18) >> 14;
                              this.field_m[var17] = (short)(-(var18 * this.field_lb[var17]) + this.field_m[var17] * var19 + 16383 >> 14);
                              this.field_lb[var17] = (short)var20;
                            }
                            if (param2 != 0) {
                              var18 = qu.field_b[param2];
                              var19Lifetime1 = qu.field_d[param2];
                              var20Lifetime1 = var19Lifetime1 * this.field_m[var17] + (-(this.field_p[var17] * var18) + 16383) >> 14;
                              this.field_p[var17] = (short)(this.field_m[var17] * var18 + (var19Lifetime1 * this.field_p[var17] + 16383) >> 14);
                              this.field_m[var17] = (short)var20Lifetime1;
                            }
                            if (param3 != 0) {
                              var18 = qu.field_b[param3];
                              var19Lifetime2 = qu.field_d[param3];
                              var20Lifetime2 = var18 * this.field_p[var17] - (-(this.field_lb[var17] * var19Lifetime2) - 16383) >> 14;
                              this.field_p[var17] = (short)(-(this.field_lb[var17] * var18) + (this.field_p[var17] * var19Lifetime2 + 16383) >> 14);
                              this.field_lb[var17] = (short)var20Lifetime2;
                            }
                            var16++;
                            continue;
                          }
                          break;
                        }
                        var12++;
                      }
                    }
                    var9++;
                    continue;
                  }
                }
                this.d((byte) 28);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_292_0 = var8;
          stackIn_292_1 = new StringBuilder().append("gja.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_293_2 = "null";
          } else {
            stackIn_293_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_292_0), ((StringBuilder) (Object) stackIn_292_1).append(stackIn_293_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 85 / ((param0 + 81) / 40);
          if (null != this.field_ib) {
            this.field_ib.field_h = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.J(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_ib != null) {
            this.field_ib.c(-5941);
          }
          if (null != this.field_d) {
            this.field_d.c(-5941);
          }
          if (this.field_E != null) {
            this.field_E.c(-5941);
          }
          if (null != this.field_O) {
            this.field_O.c(-5941);
          }
          if (null != this.field_g) {
            this.field_g.a(-17253);
          }
          if (param0 < 109) {
            this.field_mb = (int[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.F(" + param0 + ')');
        }
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_293_1 = 0;
        Object stackIn_298_0 = null;
        int stackIn_301_0 = 0;
        int stackIn_301_1 = 0;
        int stackIn_347_0 = 0;
        int stackIn_348_1 = 0;
        Object stackIn_353_0 = null;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        RuntimeException stackIn_421_0 = null;
        StringBuilder stackIn_421_1 = null;
        String stackIn_422_2 = null;
        StringBuilder stackIn_425_1 = null;
        String stackIn_426_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var12_int = 0;
        ll var12_ref = null;
        int var13 = 0;
        gca var13_ref_gca = null;
        int[] var13_ref_int__ = null;
        int var14_int = 0;
        gca var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var16_ref_int__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int[] var31_ref_int__ = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35_int = 0;
        int[] var35 = null;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        Object stackIn_298_0Lifetime1;
        Object stackIn_353_0Lifetime1;
        ll var12_refLifetime1;
        gca var13_ref_gcaLifetime1;
        int[] var13_ref_int__Lifetime1;
        int[] var13_ref_int__Lifetime2;
        ll var12_refLifetime2;
        gca var13_ref_gcaLifetime2;
        ll var12_refLifetime1Lifetime1;
        gca var13_ref_gcaLifetime1Lifetime1;
        int stackIn_102_0Lifetime1;
        int stackIn_102_1Lifetime1;
        int stackIn_109_0Lifetime1;
        int stackIn_109_1Lifetime1;
        int stackIn_301_0Lifetime1;
        int stackIn_301_1Lifetime1;
        int stackIn_358_0Lifetime1;
        int stackIn_358_1Lifetime1;
        var47 = TombRacer.field_G ? 1 : 0;
        try {
          var9_int = param1.length;
          if (0 == param0) {
            param3 = param3 << 4;
            param4 = param4 << 4;
            param2 = param2 << 4;
            var10 = 0;
            pb.field_k = 0;
            ina.field_a = 0;
            uu.field_c = 0;
            var11 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var11 >= var9_int))) {
              var12_int = param1[var11];
              stackIn_32_0 = var12_int;
              stackIn_32_1 = this.field_D.length;
              if (var47 == 0) {
                if (stackIn_32_0 < stackIn_32_1) {
                  var13_ref_int__ = this.field_D[var12_int];
                  var14_int = 0;
                  while (var14_int < var13_ref_int__.length) {
                    var15 = var13_ref_int__[var14_int];
                    if (null == this.field_hb ||
                      (param6 & this.field_hb[var15]) != 0) {
                      ina.field_a = ina.field_a + this.field_Z[var15];
                      pb.field_k = pb.field_k + this.field_r[var15];
                      uu.field_c = uu.field_c + this.field_l[var15];
                      var10++;
                    }
                    var14_int++;
                  }
                }
                var11++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              if (var10 <= 0) {
                uu.field_c = param4;
                pb.field_k = param3;
                ina.field_a = param2;
                if (var47 == 0) {
                  return;
                }
              }
              vr.field_o = true;
              uu.field_c = param4 + uu.field_c / var10;
              ina.field_a = ina.field_a / var10 + param2;
              stackIn_32_0 = param3;
              stackIn_32_1 = pb.field_k / var10;
            }
            pb.field_k = stackIn_32_0 + stackIn_32_1;
            return;
          }
          if (param0 == 1) {
            if (null != param7) {
              var10 = 8192 + (param3 * param7[1] + param2 * param7[0] + param4 * param7[2]) >> 14;
              var11 = 8192 + (param4 * param7[5] + param3 * param7[4] + param2 * param7[3]) >> 14;
              var12_int = 8192 + param7[8] * param4 + (param7[7] * param3 + param2 * param7[6]) >> 14;
              param3 = var11;
              param2 = var10;
              param4 = var12_int;
            }
            param3 = param3 << 4;
            param4 = param4 << 4;
            param2 = param2 << 4;
            var10 = 0;
            while (var9_int > var10) {
              boolean decompiledFrameCompleted3 = true;
              var11 = param1[var10];
              if (this.field_D.length > var11) {
                var12 = this.field_D[var11];
                var13 = 0;
                while (var13 < var12.length) {
                  var14_int = var12[var13];
                  if (var47 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (null == this.field_hb ||
                    (this.field_hb[var14_int] & param6) != 0 ||
                    var47 != 0) {
                    this.field_Z[var14_int] = this.field_Z[var14_int] + param2;
                    this.field_r[var14_int] = this.field_r[var14_int] + param3;
                    this.field_l[var14_int] = this.field_l[var14_int] + param4;
                  }
                  var13++;
                }
              }
              if (decompiledFrameCompleted3) {
                var10++;
              }
              if (var47 == 0) {
                continue;
              }
              break;
            }
            return;
          }
          if (param0 == 2) {
            if (param7 == null) {
              var10 = 0;
              L3: while (true) {
                boolean decompiledFrameRemainder3 = true;
                if (var10 < var9_int) {
                  var11 = param1[var10];
                  stackIn_102_0 = var11;
                  stackIn_102_1 = this.field_D.length;
                  if (var47 != 0) {
                    if (stackIn_102_0 < stackIn_102_1) {
                      var11 = param1[var10];
                      break L3;
                    }
                    decompiledFrameRemainder3 = false;
                  }
                  else {
                    if (stackIn_102_0 < stackIn_102_1) {
                      var12 = this.field_D[var11];
                      var13 = 0;
                      while (var12.length > var13) {
                        var14_int = var12[var13];
                        if (null == this.field_hb ||
                          (this.field_hb[var14_int] & param6) != 0) {
                          this.field_Z[var14_int] = this.field_Z[var14_int] - ina.field_a;
                          this.field_r[var14_int] = this.field_r[var14_int] - pb.field_k;
                          this.field_l[var14_int] = this.field_l[var14_int] - uu.field_c;
                          if (0 != param4) {
                            var15 = qu.field_b[param4];
                            var16 = qu.field_d[param4];
                            var17 = var16 * this.field_Z[var14_int] + var15 * this.field_r[var14_int] + 16383 >> 14;
                            this.field_r[var14_int] = 16383 + var16 * this.field_r[var14_int] - this.field_Z[var14_int] * var15 >> 14;
                            this.field_Z[var14_int] = var17;
                          }
                          if (param2 != 0) {
                            var15 = qu.field_b[param2];
                            var16 = qu.field_d[param2];
                            var17 = 16383 + (var16 * this.field_r[var14_int] - var15 * this.field_l[var14_int]) >> 14;
                            this.field_l[var14_int] = var16 * this.field_l[var14_int] + var15 * this.field_r[var14_int] + 16383 >> 14;
                            this.field_r[var14_int] = var17;
                          }
                          if (param3 != 0) {
                            var15 = qu.field_b[param3];
                            var16 = qu.field_d[param3];
                            var17 = var16 * this.field_Z[var14_int] + var15 * this.field_l[var14_int] + 16383 >> 14;
                            this.field_l[var14_int] = 16383 + var16 * this.field_l[var14_int] - var15 * this.field_Z[var14_int] >> 14;
                            this.field_Z[var14_int] = var17;
                          }
                          this.field_Z[var14_int] = this.field_Z[var14_int] + ina.field_a;
                          this.field_r[var14_int] = this.field_r[var14_int] + pb.field_k;
                          this.field_l[var14_int] = this.field_l[var14_int] + uu.field_c;
                        }
                        var13++;
                      }
                    }
                    var10++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder3) {
                  if (!param5) {
                    return;
                  }
                  var10 = 0;
                  while (true) {
                    stackIn_102_0Lifetime1 = ~var9_int;
                    stackIn_102_1Lifetime1 = ~var10;
                    if (stackIn_102_0Lifetime1 >= stackIn_102_1Lifetime1) {
                      break;
                    }
                    var11 = param1[var10];
                    if (var47 != 0) {
                      break L3;
                    }
                    if (var11 < this.field_D.length) {
                      var12 = this.field_D[var11];
                      var13 = 0;
                      while (true) {
                        stackIn_109_0 = var13;
                        stackIn_109_1 = var12.length;
                        if (stackIn_109_0 >= stackIn_109_1) {
                          break;
                        }
                        var14_int = var12[var13];
                        if (this.field_hb == null ||
                          (this.field_hb[var14_int] & param6) != 0) {
                          var15 = this.field_J[var14_int];
                          var16 = this.field_J[1 + var14_int];
                          var17 = var15;
                          while (var16 > var17) {
                            var18 = this.field_db[var17] - 1;
                            stackIn_109_0Lifetime1 = -1;
                            stackIn_109_1Lifetime1 = var18;
                            if (stackIn_109_0Lifetime1 == stackIn_109_1Lifetime1 &&
                              var47 == 0) {
                              break;
                            }
                            if (0 != param4) {
                              var19 = qu.field_b[param4];
                              var20 = qu.field_d[param4];
                              var21 = var19 * this.field_m[var18] + this.field_lb[var18] * var20 + 16383 >> 14;
                              this.field_m[var18] = (short)(-(this.field_lb[var18] * var19) + this.field_m[var18] * var20 + 16383 >> 14);
                              this.field_lb[var18] = (short)var21;
                            }
                            if (param2 != 0) {
                              var19 = qu.field_b[param2];
                              var20 = qu.field_d[param2];
                              var21 = var20 * this.field_m[var18] - this.field_p[var18] * var19 + 16383 >> 14;
                              this.field_p[var18] = (short)(16383 + (this.field_m[var18] * var19 + var20 * this.field_p[var18]) >> 14);
                              this.field_m[var18] = (short)var21;
                            }
                            if (0 != param3) {
                              var19 = qu.field_b[param3];
                              var20 = qu.field_d[param3];
                              var21 = 16383 + var19 * this.field_p[var18] + this.field_lb[var18] * var20 >> 14;
                              this.field_p[var18] = (short)(16383 + this.field_p[var18] * var20 - this.field_lb[var18] * var19 >> 14);
                              this.field_lb[var18] = (short)var21;
                            }
                            var17++;
                          }
                        }
                        var13++;
                      }
                    }
                    var10++;
                  }
                }
                this.d((byte) 123);
                break;
              }
              if (var47 == 0) {
                return;
              }
            }
            var10 = param7[9] << 4;
            var11 = param7[10] << 4;
            var12_int = param7[11] << 4;
            var13 = param7[12] << 4;
            var14_int = param7[13] << 4;
            var15 = param7[14] << 4;
            if (vr.field_o) {
              var16 = 8192 + ina.field_a * param7[0] + (param7[3] * pb.field_k + param7[6] * uu.field_c) >> 14;
              var17 = 8192 + ina.field_a * param7[1] + param7[4] * pb.field_k + uu.field_c * param7[7] >> 14;
              var18 = param7[8] * uu.field_c + param7[5] * pb.field_k + param7[2] * ina.field_a + 8192 >> 14;
              var16 = var16 + var13;
              var17 = var17 + var14_int;
              ina.field_a = var16;
              pb.field_k = var17;
              var18 = var18 + var15;
              vr.field_o = false;
              uu.field_c = var18;
            }
            var16_ref_int__ = new int[9];
            var17 = qu.field_d[param2];
            var18 = qu.field_b[param2];
            var19 = qu.field_d[param3];
            var20 = qu.field_b[param3];
            var21 = qu.field_d[param4];
            var22 = qu.field_b[param4];
            var23 = 8192 + var18 * var21 >> 14;
            var24 = var18 * var22 + 8192 >> 14;
            var16_ref_int__[8] = var17 * var19 + 8192 >> 14;
            var16_ref_int__[5] = -var18;
            var16_ref_int__[6] = var24 * var19 + (var21 * -var20 + 8192) >> 14;
            var16_ref_int__[3] = 8192 + var22 * var17 >> 14;
            var16_ref_int__[1] = 8192 + var20 * var23 + var22 * -var19 >> 14;
            var16_ref_int__[7] = var22 * var20 + var19 * var23 + 8192 >> 14;
            var16_ref_int__[2] = var17 * var20 + 8192 >> 14;
            var16_ref_int__[4] = var17 * var21 + 8192 >> 14;
            var16_ref_int__[0] = 8192 + (var21 * var19 + var20 * var24) >> 14;
            var25_int = 8192 + (var16_ref_int__[2] * -uu.field_c + -ina.field_a * var16_ref_int__[0]) + var16_ref_int__[1] * -pb.field_k >> 14;
            var26 = 8192 + (var16_ref_int__[3] * -ina.field_a - (-(var16_ref_int__[4] * -pb.field_k) - -uu.field_c * var16_ref_int__[5])) >> 14;
            var27 = 8192 + var16_ref_int__[8] * -uu.field_c + (-pb.field_k * var16_ref_int__[7] + var16_ref_int__[6] * -ina.field_a) >> 14;
            var28 = var25_int + ina.field_a;
            var29_int = pb.field_k + var26;
            var30 = var27 + uu.field_c;
            var31_ref_int__ = new int[9];
            var32 = 0;
            while (true) {
              stackIn_146_0 = 3;
              boolean decompiledFrameRemainder2 = true;
              if (stackIn_146_0 > var32) {
                stackIn_161_0 = 0;
                decompiledFrameRemainder2 = (var47 == 0);
                if (decompiledFrameRemainder2) {
                  var33 = stackIn_161_0;
                  while (var33 < 3) {
                    var34 = 0;
                    stackIn_146_0 = 0;
                    var35_int = stackIn_146_0;
                    while (var35_int < 3) {
                      var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var35_int + 3 * var33];
                      var35_int++;
                    }
                    var31_ref_int__[3 * var32 + var33] = var34 + 8192 >> 14;
                    var33++;
                  }
                  var32++;
                  continue;
                }
              }
              if (decompiledFrameRemainder2) {
                var32 = 8192 + var16_ref_int__[2] * var15 + (var13 * var16_ref_int__[0] + var14_int * var16_ref_int__[1]) >> 14;
                stackIn_161_0 = var15 * var16_ref_int__[5] + (var14_int * var16_ref_int__[4] + var16_ref_int__[3] * var13) + 8192 >> 14;
              }
              var33 = stackIn_161_0;
              var32 = var32 + var28;
              var34 = var15 * var16_ref_int__[8] + var13 * var16_ref_int__[6] + var16_ref_int__[7] * var14_int + 8192 >> 14;
              var33 = var33 + var29_int;
              var34 = var34 + var30;
              var35 = new int[9];
              var36 = 0;
              while (true) {
                stackIn_163_0 = 3;
                boolean decompiledFrameRemainder1 = true;
                if (stackIn_163_0 > var36) {
                  stackIn_178_0 = 0;
                  decompiledFrameRemainder1 = (var47 == 0);
                  if (decompiledFrameRemainder1) {
                    var37 = stackIn_178_0;
                    while (var37 < 3) {
                      var38 = 0;
                      stackIn_163_0 = 0;
                      var39 = stackIn_163_0;
                      while (3 > var39) {
                        var38 = var38 + var31_ref_int__[3 * var39 + var37] * param7[3 * var36 + var39];
                        var39++;
                      }
                      var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                      var37++;
                    }
                    var36++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder1) {
                  var36 = 8192 + var34 * param7[2] + (param7[0] * var32 + var33 * param7[1]) >> 14;
                  stackIn_178_0 = var33 * param7[4] + var32 * param7[3] - (-(param7[5] * var34) - 8192) >> 14;
                }
                var37 = stackIn_178_0;
                var38 = param7[8] * var34 + (param7[6] * var32 + param7[7] * var33 + 8192) >> 14;
                var36 = var36 + var10;
                var37 = var37 + var11;
                var38 = var38 + var12_int;
                var39 = 0;
                do {
                  if (var39 >= var9_int) {
                    return;
                  }
                  var40 = param1[var39];
                  if (var40 < this.field_D.length) {
                    L58: while (true) {
                      var41 = this.field_D[var40];
                      var42 = 0;
                      while (var42 < var41.length) {
                        var43 = var41[var42];
                        if (var47 != 0) {
                          continue L58;
                        }
                        if (this.field_hb == null ||
                          (param6 & this.field_hb[var43]) != 0) {
                          var44 = this.field_Z[var43] * var35[0] + var35[1] * this.field_r[var43] - (-(var35[2] * this.field_l[var43]) - 8192) >> 14;
                          var45 = var35[3] * this.field_Z[var43] + this.field_r[var43] * var35[4] - (-(this.field_l[var43] * var35[5]) - 8192) >> 14;
                          var45 = var45 + var37;
                          var46 = 8192 + this.field_l[var43] * var35[8] + (var35[7] * this.field_r[var43] + var35[6] * this.field_Z[var43]) >> 14;
                          var44 = var44 + var36;
                          this.field_Z[var43] = var44;
                          var46 = var46 + var38;
                          this.field_r[var43] = var45;
                          this.field_l[var43] = var46;
                        }
                        var42++;
                      }
                      break;
                    }
                  }
                  var39++;
                } while (var47 == 0);
                return;
              }
            }
          }
          if (3 == param0) {
            if (param7 == null) {
              var10 = 0;
              while (var9_int > var10) {
                var11 = param1[var10];
                if (var47 != 0) {
                  return;
                }
                if (var11 < this.field_D.length) {
                  while (true) {
                    var12 = this.field_D[var11];
                    var13 = 0;
                    while (var13 < var12.length) {
                      var14_int = var12[var13];
                      if (this.field_hb == null ||
                        (param6 & this.field_hb[var14_int]) != 0) {
                        this.field_Z[var14_int] = this.field_Z[var14_int] - ina.field_a;
                        this.field_r[var14_int] = this.field_r[var14_int] - pb.field_k;
                        this.field_l[var14_int] = this.field_l[var14_int] - uu.field_c;
                        this.field_Z[var14_int] = param2 * this.field_Z[var14_int] >> 7;
                        this.field_r[var14_int] = this.field_r[var14_int] * param3 >> 7;
                        this.field_l[var14_int] = this.field_l[var14_int] * param4 >> 7;
                        this.field_Z[var14_int] = this.field_Z[var14_int] + ina.field_a;
                        this.field_r[var14_int] = this.field_r[var14_int] + pb.field_k;
                        this.field_l[var14_int] = this.field_l[var14_int] + uu.field_c;
                      }
                      var13++;
                    }
                    break;
                  }
                }
                var10++;
              }
              if (var47 == 0) {
                return;
              }
            }
            var10 = param7[9] << 4;
            var11 = param7[10] << 4;
            var12_int = param7[11] << 4;
            var13 = param7[12] << 4;
            var14_int = param7[13] << 4;
            var15 = param7[14] << 4;
            if (vr.field_o) {
              var16 = 8192 + ina.field_a * param7[0] + (pb.field_k * param7[3] + param7[6] * uu.field_c) >> 14;
              var17 = 8192 + (param7[1] * ina.field_a - (-(pb.field_k * param7[4]) - uu.field_c * param7[7])) >> 14;
              var18 = uu.field_c * param7[8] + (param7[2] * ina.field_a + param7[5] * pb.field_k + 8192) >> 14;
              var16 = var16 + var13;
              var17 = var17 + var14_int;
              var18 = var18 + var15;
              ina.field_a = var16;
              pb.field_k = var17;
              vr.field_o = false;
              uu.field_c = var18;
            }
            var16 = param2 << 15 >> 7;
            var17 = param3 << 15 >> 7;
            var18 = param4 << 15 >> 7;
            var19 = 8192 + var16 * -ina.field_a >> 14;
            var20 = 8192 + -pb.field_k * var17 >> 14;
            var21 = 8192 + var18 * -uu.field_c >> 14;
            var22 = ina.field_a + var19;
            var23 = pb.field_k + var20;
            var24 = uu.field_c + var21;
            var25 = new int[9];
            var25[2] = var16 * param7[6] + 8192 >> 14;
            var25[0] = var16 * param7[0] + 8192 >> 14;
            var25[1] = 8192 + param7[3] * var16 >> 14;
            var25[6] = param7[2] * var18 + 8192 >> 14;
            var25[4] = 8192 + var17 * param7[4] >> 14;
            var25[5] = 8192 + param7[7] * var17 >> 14;
            var25[3] = 8192 + param7[1] * var17 >> 14;
            var25[7] = param7[5] * var18 + 8192 >> 14;
            var25[8] = var18 * param7[8] + 8192 >> 14;
            var26 = 8192 + var13 * var16 >> 14;
            var27 = var14_int * var17 + 8192 >> 14;
            var26 = var26 + var22;
            var28 = var18 * var15 + 8192 >> 14;
            var27 = var27 + var23;
            var28 = var28 + var24;
            var29 = new int[9];
            var30 = 0;
            while (true) {
              stackIn_226_0 = -4;
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_226_0 < ~var30) {
                stackIn_241_0 = 0;
                decompiledFrameRemainder0 = (var47 == 0);
                if (decompiledFrameRemainder0) {
                  var31 = stackIn_241_0;
                  while (var31 < 3) {
                    var32 = 0;
                    stackIn_226_0 = 0;
                    var33 = stackIn_226_0;
                    while (var33 < 3) {
                      var32 = var32 + param7[var33 + var30 * 3] * var25[var33 * 3 + var31];
                      var33++;
                    }
                    var29[3 * var30 + var31] = 8192 + var32 >> 14;
                    var31++;
                  }
                  var30++;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                var30 = 8192 + (var27 * param7[1] + param7[0] * var26) + param7[2] * var28 >> 14;
                stackIn_241_0 = 8192 + var28 * param7[5] + (var26 * param7[3] + param7[4] * var27) >> 14;
              }
              var31 = stackIn_241_0;
              var30 = var30 + var10;
              var32 = param7[7] * var27 + (param7[6] * var26 - (-(param7[8] * var28) - 8192)) >> 14;
              var31 = var31 + var11;
              var32 = var32 + var12_int;
              var33 = 0;
              do {
                if (var33 >= var9_int) {
                  return;
                }
                var34 = param1[var33];
                if (var34 < this.field_D.length) {
                  L83: while (true) {
                    var35 = this.field_D[var34];
                    var36 = 0;
                    while (var36 < var35.length) {
                      var37 = var35[var36];
                      if (var47 != 0) {
                        continue L83;
                      }
                      if (this.field_hb == null ||
                        (this.field_hb[var37] & param6) != 0) {
                        var38 = this.field_r[var37] * var29[1] + var29[0] * this.field_Z[var37] + var29[2] * this.field_l[var37] + 8192 >> 14;
                        var39 = this.field_r[var37] * var29[4] + var29[3] * this.field_Z[var37] + (var29[5] * this.field_l[var37] + 8192) >> 14;
                        var39 = var39 + var31;
                        var38 = var38 + var30;
                        var40 = 8192 + var29[8] * this.field_l[var37] + this.field_Z[var37] * var29[6] + var29[7] * this.field_r[var37] >> 14;
                        var40 = var40 + var32;
                        this.field_Z[var37] = var38;
                        this.field_r[var37] = var39;
                        this.field_l[var37] = var40;
                      }
                      var36++;
                    }
                    break;
                  }
                }
                var33++;
              } while (var47 == 0);
              return;
            }
          }
          if (param0 == 5) {
            if (this.field_q != null) {
              var10 = 0;
              var11 = 0;
              L122: while (true) {
                if (var11 < var9_int) {
                  var12_int = param1[var11];
                  stackIn_301_0 = ~var12_int;
                  stackIn_301_1 = ~this.field_q.length;
                  if (var47 != 0) {
                    if (stackIn_301_0 < stackIn_301_1) {
                      var12_ref = this.field_u[var11];
                      var13_ref_gca = this.field_nb[var11];
                      var13_ref_gca.field_h = var13_ref_gca.field_h & 16777215 | 255 - (this.field_C[var12_ref.field_m] & 255) << 24;
                      var11++;
                      return;
                    }
                    break L122;
                  }
                  if (stackIn_301_0 > stackIn_301_1) {
                    var13_ref_int__Lifetime1 = this.field_q[var12_int];
                    var14_int = 0;
                    while (var13_ref_int__Lifetime1.length > var14_int) {
                      var15 = var13_ref_int__Lifetime1[var14_int];
                      stackIn_298_0 = null;
                      if (stackIn_298_0 == this.field_jb ||
                        0 != (param6 & this.field_jb[var15]) ||
                        var47 != 0) {
                        var16 = 8 * param2 + (255 & this.field_C[var15]);
                        if (0 > var16) {
                          var16 = 0;
                        } else {
                          if (255 < var16) {
                            var16 = 255;
                          }
                        }
                        this.field_C[var15] = (byte)var16;
                      }
                      var14_int++;
                    }
                    stackIn_292_0 = var10;
                    if (var13_ref_int__Lifetime1.length <= 0) {
                      stackIn_293_1 = 0;
                    } else {
                      stackIn_293_1 = 1;
                    }
                    var10 = stackIn_292_0 | stackIn_293_1;
                  }
                  var11++;
                  continue;
                }
                if (var10 == 0) {
                  return;
                }
                stackIn_298_0Lifetime1 = null;
                if (stackIn_298_0Lifetime1 == this.field_u) {
                  break L122;
                }
                var11 = 0;
                while (true) {
                  stackIn_301_0Lifetime1 = ~this.field_L;
                  stackIn_301_1Lifetime1 = ~var11;
                  if (stackIn_301_0Lifetime1 >= stackIn_301_1Lifetime1) {
                    break;
                  }
                  var12_refLifetime2 = this.field_u[var11];
                  var13_ref_gcaLifetime2 = this.field_nb[var11];
                  var13_ref_gcaLifetime2.field_h = var13_ref_gcaLifetime2.field_h & 16777215 | 255 - (this.field_C[var12_refLifetime2.field_m] & 255) << 24;
                  var11++;
                  if (var47 != 0) {
                    return;
                  }
                }
                break;
              }
              this.e(0);
              return;
            }
            return;
          }
          if (param0 != 7) {
            if (param0 == 8) {
              if (null != this.field_mb) {
                var10 = 0;
                do {
                  if (var10 >= var9_int) {
                    return;
                  }
                  boolean decompiledFrameCompleted2 = true;
                  var11 = param1[var10];
                  if (this.field_mb.length > var11) {
                    var12 = this.field_mb[var11];
                    var13 = 0;
                    while (var13 < var12.length) {
                      var14 = this.field_nb[var12[var13]];
                      var14.field_b = var14.field_b + param3;
                      var14.field_e = var14.field_e + param2;
                      var13++;
                      if (var47 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                    }
                  }
                  if (decompiledFrameCompleted2) {
                    var10++;
                  }
                } while (var47 == 0);
                return;
              }
              return;
            }
            if (param0 == 10) {
              if (null != this.field_mb) {
                var10 = 0;
                do {
                  if (var10 >= var9_int) {
                    return;
                  }
                  boolean decompiledFrameCompleted1 = true;
                  var11 = param1[var10];
                  if (this.field_mb.length > var11) {
                    var12 = this.field_mb[var11];
                    var13 = 0;
                    while (var12.length > var13) {
                      var14 = this.field_nb[var12[var13]];
                      var14.field_m = var14.field_m * param2 >> 7;
                      var14.field_k = var14.field_k * param3 >> 7;
                      var13++;
                      if (var47 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    var10++;
                  }
                } while (var47 == 0);
                return;
              }
              return;
            }
            if (param0 != 9) {
              return;
            }
            if (null != this.field_mb) {
              var10 = 0;
              do {
                if (var10 >= var9_int) {
                  return;
                }
                boolean decompiledFrameCompleted0 = true;
                var11 = param1[var10];
                if (this.field_mb.length > var11) {
                  var12 = this.field_mb[var11];
                  var13 = 0;
                  while (var12.length > var13) {
                    var14 = this.field_nb[var12[var13]];
                    var14.field_c = 16383 & param2 + var14.field_c;
                    var13++;
                    if (var47 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  var10++;
                }
              } while (var47 == 0);
              return;
            }
            return;
          }
          if (null != this.field_q) {
            var10 = 0;
            var11 = 0;
            L104: while (true) {
              if (var9_int > var11) {
                var12_int = param1[var11];
                stackIn_358_0 = ~this.field_q.length;
                stackIn_358_1 = ~var12_int;
                if (var47 != 0) {
                  if (stackIn_358_0 > stackIn_358_1) {
                    var12_refLifetime1 = this.field_u[var11];
                    var13_ref_gcaLifetime1 = this.field_nb[var11];
                    var13_ref_gcaLifetime1.field_h = cla.field_m[65535 & this.field_P[var12_refLifetime1.field_m]] & 16777215 | var13_ref_gcaLifetime1.field_h & -16777216;
                    var11++;
                    return;
                  }
                  break L104;
                }
                if (stackIn_358_0 < stackIn_358_1) {
                  var13_ref_int__Lifetime2 = this.field_q[var12_int];
                  var14_int = 0;
                  while (var14_int < var13_ref_int__Lifetime2.length) {
                    var15 = var13_ref_int__Lifetime2[var14_int];
                    stackIn_353_0 = null;
                    if (stackIn_353_0 == this.field_jb ||
                      (this.field_jb[var15] & param6) != 0) {
                      var16 = this.field_P[var15] & 65535;
                      var17 = var16 >> 10 & 63;
                      var18 = 7 & var16 >> 7;
                      var18 = var18 + param3 / 4;
                      var19 = var16 & 127;
                      var17 = param2 + var17 & 63;
                      if (var18 < 0) {
                        var18 = 0;
                      } else {
                        if (var18 > 7) {
                          var18 = 7;
                        }
                      }
                      var19 = var19 + param4;
                      if (var19 < 0) {
                        var19 = 0;
                      } else {
                        if (var19 > 127) {
                          var19 = 127;
                        }
                      }
                      this.field_P[var15] = (short)fh.a(var19, fh.a(var18 << 7, var17 << 10));
                    }
                    var14_int++;
                  }
                  stackIn_347_0 = var10;
                  if (var13_ref_int__Lifetime2.length <= 0) {
                    stackIn_348_1 = 0;
                  } else {
                    stackIn_348_1 = 1;
                  }
                  var10 = stackIn_347_0 | stackIn_348_1;
                }
                var11++;
                continue;
              }
              if (var10 == 0) {
                return;
              }
              stackIn_353_0Lifetime1 = null;
              if (stackIn_353_0Lifetime1 == this.field_u) {
                break L104;
              }
              var11 = 0;
              while (true) {
                stackIn_358_0Lifetime1 = this.field_L;
                stackIn_358_1Lifetime1 = var11;
                if (stackIn_358_0Lifetime1 <= stackIn_358_1Lifetime1) {
                  break;
                }
                var12_refLifetime1Lifetime1 = this.field_u[var11];
                var13_ref_gcaLifetime1Lifetime1 = this.field_nb[var11];
                var13_ref_gcaLifetime1Lifetime1.field_h = cla.field_m[65535 & this.field_P[var12_refLifetime1Lifetime1.field_m]] & 16777215 | var13_ref_gcaLifetime1Lifetime1.field_h & -16777216;
                var11++;
                if (var47 != 0) {
                  return;
                }
              }
              break;
            }
            this.e(0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_421_0 = var9;
          stackIn_421_1 = new StringBuilder().append("gja.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_422_2 = "null";
          } else {
            stackIn_422_2 = "{...}";
          }
          stackIn_425_1 = ((StringBuilder) (Object) stackIn_421_1).append(stackIn_422_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_426_2 = "null";
          } else {
            stackIn_426_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_421_0), ((StringBuilder) (Object) stackIn_425_1).append(stackIn_426_2).append(')').toString());
        }
    }

    private final short a(int param0, int param1, float param2, int param3, int param4, int param5, long param6, int param7, float param8, boolean param9, oc param10) {
        int fieldTemp$0 = 0;
        short stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param9) {
            this.field_W = -119;
          }
          var13_int = this.field_J[param3];
          var14 = this.field_J[1 + param3];
          var15 = 0;
          var16 = var13_int;
          L2: while (true) {
            if (var14 > var16) {
              var17 = this.field_db[var16];
              stackIn_22_0 = 0;
              if (var18 != 0) {
                break L2;
              }
              if (stackIn_22_0 == var17) {
                var15 = var16;
              } else {
                if (~param6 == ~tl.field_q[var16]) {
                  stackIn_19_0 = (short)(var17 - 1);
                  return stackIn_19_0;
                }
                var16++;
                continue;
              }
            }
            this.field_db[var15] = (short)(this.field_fb + 1);
            tl.field_q[var15] = param6;
            this.field_G[this.field_fb] = (short)param1;
            this.field_kb[this.field_fb] = (short)param3;
            this.field_lb[this.field_fb] = (short)param7;
            this.field_m[this.field_fb] = (short)param0;
            this.field_p[this.field_fb] = (short)param4;
            this.field_w[this.field_fb] = (byte)param5;
            this.field_eb[this.field_fb] = param2;
            this.field_t[this.field_fb] = param8;
            fieldTemp$0 = this.field_fb;
            this.field_fb = this.field_fb + 1;
            stackIn_22_0 = (short)fieldTemp$0;
            break;
          }
          return (short) stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_26_0 = var13;
          stackIn_26_1 = new StringBuilder().append("gja.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        gja dupTemp$1 = null;
        gja var4 = null;
        RuntimeException var4_ref = null;
        gja var5 = null;
        int var6 = 0;
        Object stackIn_23_0;
        gja stackIn_23_1;
        boolean stackIn_23_2;
        gja stackIn_23_3;
        Object stackIn_24_0;
        boolean stackIn_24_4;
        ka stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 == 1) {
            var5 = this.field_S.field_tb;
            var4 = this.field_S.field_cc;
          }
          if (param0 != 1 ||
            var6 != 0) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 == 4) {
                  var5 = this.field_S.field_n;
                  var4 = this.field_S.field_O;
                }
                if (param0 != 4 ||
                  var6 != 0) {
                  if (5 != param0) {
                    dupTemp$1 = new gja(this.field_S, 0, 0, true, false);
                    var5 = dupTemp$1;
                    var4 = dupTemp$1;
                    if (var6 != 0) {
                      var5 = this.field_S.field_tc;
                      var4 = this.field_S.field_ec;
                      var4 = this.field_S.field_fb;
                      var5 = this.field_S.field_E;
                      var5 = this.field_S.field_W;
                      var4 = this.field_S.field_gc;
                    }
                  } else {
                    var5 = this.field_S.field_tc;
                    var4 = this.field_S.field_ec;
                    if (var6 != 0) {
                      var4 = this.field_S.field_fb;
                      var5 = this.field_S.field_E;
                      var5 = this.field_S.field_W;
                      var4 = this.field_S.field_gc;
                    }
                  }
                }} else {
                var4 = this.field_S.field_fb;
                var5 = this.field_S.field_E;
                if (var6 != 0) {
                  var5 = this.field_S.field_W;
                  var4 = this.field_S.field_gc;
                }
              }
            } else {
              var5 = this.field_S.field_W;
              var4 = this.field_S.field_gc;
            }
          }
          stackIn_23_0 = this;
          stackIn_23_1 = var4;
          stackIn_23_2 = false;
          stackIn_23_3 = var5;
          if (param0 == 0) {
            stackIn_24_0 = this;
            stackIn_24_4 = false;
          } else {
            stackIn_24_0 = this;
            stackIn_24_4 = true;
          }
          stackIn_25_0 = this.a(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_24_4, param1, param2);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4_ref), "gja.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(gda param0, el param1, int param2) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        asa var4 = null;
        RuntimeException var4_ref = null;
        asa var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_fb == 0) {
            return;
          }
          var4 = this.field_S.field_bb;
          var5 = (asa) (param0);
          if (!this.field_A) {
            this.f(-913);
          }
          qra.field_d = var5.field_o * var4.field_h + (var4.field_o * var5.field_q + var4.field_p * var5.field_l);
          gj.field_h = var5.field_n * var4.field_o + var5.field_e * var4.field_p + var4.field_h * var5.field_i + var4.field_i;
          var6 = gj.field_h + qra.field_d * (float)this.field_o;
          var7 = gj.field_h + (float)this.field_n * qra.field_d;
          if (!(var7 < var6)) {
            var8 = var6 - (float)this.field_H;
            var9 = (float)this.field_H + var7;
          }
          if (var7 < var6 ||
            var24 != 0) {
            var8 = (float)(-this.field_H) + var7;
            var9 = (float)this.field_H + var6;
          }
          if (var8 >= this.field_S.field_d) {
            return;
          }
          if (var9 <= (float)this.field_S.field_D) {
            return;
          }
          fba.field_a = var5.field_n * var4.field_l + var4.field_g * var5.field_e + var5.field_i * var4.field_f + var4.field_e;
          vta.field_e = var4.field_f * var5.field_o + (var5.field_l * var4.field_g + var4.field_l * var5.field_q);
          var10 = (float)this.field_o * vta.field_e + fba.field_a;
          var11 = (float)this.field_n * vta.field_e + fba.field_a;
          if (var11 < var10) {
            var13 = (var10 + (float)this.field_H) * (float)this.field_S.field_Ic;
            var12 = (float)this.field_S.field_Ic * ((float)(-this.field_H) + var11);
          }
          if (!(var11 < var10) ||
            var24 != 0) {
            var12 = (var10 - (float)this.field_H) * (float)this.field_S.field_Ic;
            var13 = (float)this.field_S.field_Ic * (var11 + (float)this.field_H);
          }
          if (this.field_S.field_uc <= var12 / var9) {
            return;
          }
          if (this.field_S.field_f >= var13 / var9) {
            return;
          }
          tu.field_g = var5.field_i * var4.field_m + (var5.field_e * var4.field_k + var4.field_q * var5.field_n) + var4.field_n;
          kb.field_p = var4.field_m * var5.field_o + (var4.field_q * var5.field_q + var4.field_k * var5.field_l);
          var14 = tu.field_g + (float)this.field_o * kb.field_p;
          var15 = tu.field_g + kb.field_p * (float)this.field_n;
          if (var15 < var14) {
            var17 = ((float)this.field_H + var14) * (float)this.field_S.field_h;
            var16 = ((float)(-this.field_H) + var15) * (float)this.field_S.field_h;
          }
          if (!(var15 < var14) ||
            var24 != 0) {
            var16 = ((float)(-this.field_H) + var14) * (float)this.field_S.field_h;
            var17 = (float)this.field_S.field_h * ((float)this.field_H + var15);
          }
          if (var16 / var9 >= this.field_S.field_H) {
            return;
          }
          if (var17 / var9 <= this.field_S.field_zc) {
            return;
          }
          if (null != param1 ||
            this.field_u != null) {
            vs.field_O = var4.field_m * var5.field_p + (var5.field_k * var4.field_q + var5.field_g * var4.field_k);
            wka.field_b = var4.field_f * var5.field_h + (var5.field_f * var4.field_g + var5.field_m * var4.field_l);
            ct.field_b = var5.field_m * var4.field_q + var5.field_f * var4.field_k + var5.field_h * var4.field_m;
            hs.field_c = var4.field_o * var5.field_m + var4.field_p * var5.field_f + var4.field_h * var5.field_h;
            pl.field_a = var4.field_o * var5.field_k + var5.field_g * var4.field_p + var4.field_h * var5.field_p;
            baa.field_c = var4.field_g * var5.field_g + var4.field_l * var5.field_k + var5.field_p * var4.field_f;
          }
          if (null != param1) {
            var18 = 0;
            var19 = 1;
            var20 = this.field_K + this.field_i >> 1;
            var21 = this.field_cb + this.field_Q >> 1;
            var22 = (int)(hs.field_c * (float)var21 + ((float)this.field_o * qra.field_d + (gj.field_h + (float)var20 * pl.field_a)));
            if (var22 < this.field_S.field_D) {
              var18 = 1;
            }
            var23 = (int)(gj.field_h + pl.field_a * (float)var20 + qra.field_d * (float)this.field_n + hs.field_c * (float)var21);
            if (this.field_S.field_D > var23) {
              var18 = 1;
            }
            if (var18 != 0) {
              if (this.field_S.field_D > var22 &&
                var23 < this.field_S.field_D) {
                var19 = 0;
              } else {
                if (var22 >= this.field_S.field_D &&
                  this.field_S.field_D <= var23) {
                }
              }
            }
            if (var19 != 0 &&
              var23 >= var22) {
            }
          }
          this.field_S.s(11);
          this.field_S.a(var5, (byte) 93);
          this.b((byte) -51);
          this.c(-119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_70_0 = var4_ref;
          stackIn_70_1 = new StringBuilder().append("gja.N(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(')').toString());
        }
    }

    gja(eo param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        this.field_I = 0;
        this.field_F = false;
        this.field_v = 0;
        this.field_f = false;
        this.field_A = false;
        this.field_fb = 0;
        this.field_y = 0;
        this.field_N = true;
        this.field_W = 0;
        try {
          this.field_F = param4;
          this.field_S = param0;
          this.field_h = param2;
          this.field_Y = param1;
          if (param3 ||
            ss.a((byte) 112, this.field_h, this.field_Y)) {
            this.field_ib = new hg(uu.a(true, this.field_Y, this.field_h));
          }
          if (param3 ||
            foa.a(this.field_Y, this.field_h, 0)) {
            this.field_d = new hg(pr.a(this.field_Y, -23611, this.field_h));
          }
          if (param3 ||
            lf.a(this.field_h, this.field_Y, 128)) {
            this.field_E = new hg(no.a(this.field_h, this.field_Y, 36864));
          }
          if (param3 ||
            vta.a(this.field_h, this.field_Y, 2048)) {
            this.field_O = new hg(oba.c(this.field_Y, this.field_h, -19531));
          }
          if (!param3 &&
            !ag.b(-1, this.field_Y, this.field_h)) {
            return;
          }
          this.field_g = new gg(uu.a(this.field_Y, this.field_h, (byte) -111));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_36_0 = var6;
          stackIn_36_1 = new StringBuilder().append("gja.<init>(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_bb = "Logging in...";
        field_k = "Auto-respond to <%0>";
    }
}
