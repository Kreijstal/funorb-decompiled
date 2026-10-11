/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nf {
    int field_mb;
    private int field_w;
    private tg field_I;
    ll field_V;
    private int[] field_ib;
    int field_t;
    int field_hb;
    th field_Ib;
    int field_q;
    int[] field_pb;
    private boolean field_Gb;
    static String[] field_qb;
    private int[] field_a;
    private boolean field_Mb;
    boolean field_M;
    private int[] field_E;
    private boolean field_zb;
    int[] field_Eb;
    int field_Q;
    private mo field_B;
    int field_Hb;
    int field_tb;
    int[] field_Ab;
    boolean[] field_u;
    int field_y;
    int field_G;
    int[] field_Ob;
    private int[] field_ob;
    static Calendar field_Bb;
    int[] field_c;
    int[] field_U;
    static int[] field_z;
    int[] field_X;
    vn field_kb;
    int[] field_R;
    int field_bb;
    private int field_nb;
    int field_C;
    private int field_m;
    wf[] field_rb;
    vn field_Kb;
    private int field_Cb;
    int[] field_cb;
    vn field_i;
    int[] field_o;
    int[] field_ab;
    private int field_jb;
    int[] field_s;
    private int field_xb;
    int[] field_wb;
    static kc field_j;
    int[] field_b;
    private vn field_Db;
    private int[][] field_lb;
    boolean field_D;
    String[] field_k;
    boolean field_f;
    int[] field_db;
    int[] field_x;
    int[] field_n;
    int[] field_p;
    int[] field_K;
    private ll field_Jb;
    int[] field_Nb;
    tg field_h;
    int field_H;
    int[] field_S;
    int field_Y;
    boolean field_d;
    private boolean field_l;
    private int[] field_fb;
    private boolean field_eb;
    private int[][] field_v;
    boolean field_Z;
    wf[] field_sb;
    int[] field_T;
    int field_F;
    vn field_r;
    private int[][] field_vb;
    int[][] field_N;
    private int field_J;
    static int field_W;
    private boolean[][] field_L;
    private boolean field_ub;
    int[] field_Fb;
    static hn field_P;
    int[] field_gb;
    int[] field_g;
    private int field_O;
    static String field_yb;
    static String field_e;
    static kc field_A;
    static int[] field_Lb;

    private final int c(int param0, boolean param1) {
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        boolean stackOut_9_0;
        boolean stackOut_16_0;
        int var3;
        oc var4;
        ml var5_ref_ml;
        mi var5_ref_mi;
        int var5;
        int var6;
        int var7;
        mi var5_ref_miLifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = 0;
        var4 = new oc(this.field_i);
        var5_ref_ml = (ml) (var4.b(-99));
        while (true) {
          if (var5_ref_ml == null) {
            var4.a((byte) 82, this.field_Kb);
            break;
          }
          var3 = var3 + ((var5_ref_ml.field_R + 11) * (var5_ref_ml.field_X + 5) + (var5_ref_ml.field_q * 13 + (7 * var5_ref_ml.field_ib + var5_ref_ml.field_jb)) * (1 + var5_ref_ml.field_T));
          if (var7 == 0) {
            if (param1) {
              System.out.println("UNIT:" + var5_ref_ml.field_T);
              System.out.println("X:" + var5_ref_ml.field_lb + " Y:" + var5_ref_ml.field_db);
              System.out.println("Health:" + var5_ref_ml.field_ib + " TYPE:" + var5_ref_ml.field_jb);
              System.out.println("TOWER HEALTH:" + var5_ref_ml.field_q);
            }
            var5_ref_ml = (ml) (var4.d(-18502));
            continue;
          }
          break;
        }
        var5_ref_mi = (mi) (var4.b(-60));
        while (true) {
          if (var5_ref_mi == null) {
            var4.a((byte) 31, this.field_r);
            stackIn_14_0 = -104 / ((-60 - param0) / 40);
            break;
          }
          stackOut_9_0 = var5_ref_mi.k(-36);
          stackIn_14_0 = stackOut_9_0 ? 1 : 0;
          stackIn_10_0 = stackOut_9_0;
          if (var7 == 0) {
            if (!stackIn_10_0) {
              var3 = var3 + ((var5_ref_mi.field_y + var5_ref_mi.field_H * 29) * (23 + var5_ref_mi.field_I) + (var5_ref_mi.field_o + 17) * 19 * var5_ref_mi.field_z);
            }
            var5_ref_mi = (mi) (var4.d(-18502));
            continue;
          }
          break;
        }
        var6 = stackIn_14_0;
        var5_ref_miLifetime1 = (mi) (var4.b(-104));
        while (true) {
          if (var5_ref_miLifetime1 == null) {
            var3 = var3 + this.field_mb;
            stackIn_22_0 = 999;
            break;
          }
          stackOut_16_0 = var5_ref_miLifetime1.k(-83);
          stackIn_22_0 = stackOut_16_0 ? 1 : 0;
          stackIn_17_0 = stackOut_16_0;
          if (var7 == 0) {
            if (!stackIn_17_0) {
              var3 = var3 + (19 * (var5_ref_miLifetime1.field_z * (var5_ref_miLifetime1.field_o + 17)) + (23 + var5_ref_miLifetime1.field_I) * (var5_ref_miLifetime1.field_H * 29 + var5_ref_miLifetime1.field_y));
            }
            var5_ref_miLifetime1 = (mi) (var4.d(-18502));
            continue;
          }
          break;
        }
        if (stackIn_22_0 != ~this.field_mb) {
          var3 = var3 + this.field_t * 1001;
        }
        var5 = this.field_Jb.field_m.length - 1;
        while (0 <= var5) {
          stackIn_31_0 = ~this.field_Jb.field_m[var5];
          if (var7 != 0) {
            return stackIn_31_0;
          }
          if (stackIn_31_0 != -1) {
            var3 = var3 + (37 + (var5 & 7) * 37);
          }
          var5--;
        }
        return var3;
    }

    final ml a(int param0, boolean param1) {
        if (!param1) {
          this.field_u = (boolean[]) null;
        }
        return (ml) (this.field_B.a((long)param0, (byte) -87));
    }

    final boolean b(int param0, int param1, int param2, qb param3) {
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            nf.r(-29);
          }
          stackIn_3_0 = fk.a(this, param0, this.field_Jb, param2, (byte) -1, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("nf.JC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void b(byte param0) {
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        byte stackIn_43_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        byte stackOut_42_1;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_37_0Lifetime1;
        int stackIn_37_1Lifetime1;
        int stackIn_51_0Lifetime1;
        int stackIn_51_1Lifetime1;
        int var2Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var5Lifetime2;
        int var7Lifetime2;
        int var8Lifetime2;
        int var6Lifetime1Lifetime1;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != ti.field_I) {
          var2 = ti.field_I[this.field_O].field_m.length - 1;
          while (true) {
            if (var2 >= 0) {
              var2--;
              if (var10 == 0) {
                continue;
              }
            } else {
              mn.field_y.field_l[253] = 11184810;
              mn.field_y.field_l[251] = 16777215;
              mn.field_y.field_l[252] = 16777215;
            }
            break;
          }
          mn.field_y.field_l[254] = 7829367;
        }
        var2Lifetime1 = 16384;
        var3 = 18048;
        if (var3 > ti.field_I[this.field_O].field_m.length) {
          var3 = ti.field_I[this.field_O].field_m.length;
        }
        var4 = 2;
        if (0 == this.field_O) {
          var4 = 4;
        }
        if (this.field_O == 5) {
          var4 = 4;
        }
        L7: {
          var5 = 0;
          if (this.field_O != 6) {
            var6 = 0;
            L8: while (true) {
              stackIn_19_0 = ~this.field_H;
              stackIn_19_1 = ~var6;
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_19_0 < stackIn_19_1) {
                stackIn_49_0 = 0;
                decompiledFrameRemainder0 = (var10 == 0);
                if (decompiledFrameRemainder0) {
                  var7 = stackIn_49_0;
                  while (true) {
                    stackIn_23_0 = ~this.field_y;
                    stackIn_23_1 = ~var7;
                    if (stackIn_23_0 < stackIn_23_1) {
                      stackIn_19_0 = this.field_y;
                      stackIn_19_1 = var5;
                      if (stackIn_19_0 <= stackIn_19_1 &&
                        mn.field_y.field_m[var5] == -5 &&
                        -5 != mn.field_y.field_m[var5 - this.field_y]) {
                        var8 = var6 - 5;
                        var9 = (127 & var7) + var2Lifetime1;
                        while (var9 < var3) {
                          stackIn_37_0 = -1;
                          stackIn_37_1 = ~ti.field_I[this.field_O].field_m[var9];
                          if (stackIn_37_0 != stackIn_37_1) {
                            sn.a(var7, this.field_V, 0, 125, this, false, var8 - var4, ti.field_I[this.field_O].field_m[var9]);
                          }
                          var8++;
                          var9 += 128;
                        }
                      }
                      stackIn_37_0Lifetime1 = ~(-this.field_y + mn.field_y.field_m.length);
                      stackIn_37_1Lifetime1 = ~var5;
                      if (stackIn_37_0Lifetime1 < stackIn_37_1Lifetime1 &&
                        mn.field_y.field_m[var5] == -5 &&
                        mn.field_y.field_m[this.field_y + var5] != -5) {
                        var8 = var6 - 1;
                        var9Lifetime1 = (var7 & 127) + var3;
                        while (!(var9Lifetime1 >= ti.field_I[this.field_O].field_m.length)) {
                          stackIn_23_0 = 0;
                          stackOut_42_1 = ti.field_I[this.field_O].field_m[var9Lifetime1];
                          stackIn_23_1 = stackOut_42_1;
                          stackIn_43_1 = stackOut_42_1;
                          if (stackIn_23_0 != stackIn_43_1) {
                            sn.a(var7, this.field_V, 0, 125, this, false, var8, ti.field_I[this.field_O].field_m[var9Lifetime1]);
                          }
                          var8++;
                          var9Lifetime1 += 128;
                        }
                      }
                      var5++;
                      var7++;
                      continue;
                    }
                    break;
                  }
                  var6++;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                var5 = 0;
                stackIn_49_0 = 0;
              }
              var6 = stackIn_49_0;
              while (true) {
                stackIn_51_0 = this.field_H;
                stackIn_51_1 = var6;
                if (stackIn_51_0 <= stackIn_51_1) {
                  break L8;
                }
                stackIn_72_0 = 0;
                if (var10 != 0) {
                  break L7;
                }
                var7Lifetime2 = stackIn_72_0;
                while (this.field_y > var7Lifetime2) {
                  stackIn_51_0Lifetime1 = -1;
                  stackIn_51_1Lifetime1 = ~var5;
                  if (stackIn_51_0Lifetime1 > stackIn_51_1Lifetime1 &&
                    mn.field_y.field_m[var5] == -5 &&
                    mn.field_y.field_m[-1 + var5] != -5 &&
                    0 == mn.field_y.field_m[-1 + var5] ||
                    !(var5 >= (-1 + mn.field_y.field_m.length)) &&
                    mn.field_y.field_m[var5] == -5 &&
                    -5 != mn.field_y.field_m[1 + var5] &&
                    mn.field_y.field_m[var5 + 1] == 0) {
                    var8Lifetime2 = (var7Lifetime2 & 127) + var3 - 128;
                    if (ti.field_I[this.field_O].field_m[var8Lifetime2] != 0) {
                      sn.a(var7Lifetime2, this.field_V, 0, 12, this, false, var6, ti.field_I[this.field_O].field_m[var8Lifetime2]);
                    }
                  }
                  var5++;
                  var7Lifetime2++;
                }
                var6++;
              }
            }
          }
          var5Lifetime2 = 0;
          stackIn_72_0 = param0;
        }
        if (stackIn_72_0 != 5) {
          this.field_K = (int[]) null;
        }
        if (null != ti.field_I) {
          var6Lifetime1 = 0;
          var7Lifetime1 = 0;
          while (true) {
            stackIn_77_0 = ~var7Lifetime1;
            stackIn_77_1 = ~this.field_H;
            if (stackIn_77_0 > stackIn_77_1) {
              var6Lifetime1Lifetime1 = (127 & var7Lifetime1) << 7;
              var5Lifetime1 = var7Lifetime1 * this.field_y;
              if (var10 != 0) {
                break;
              }
              var8Lifetime1 = 0;
              while (var8Lifetime1 < this.field_y) {
                stackIn_77_0 = 4;
                stackIn_77_1 = ~this.field_V.field_m[var5Lifetime1];
                if (stackIn_77_0 == stackIn_77_1) {
                  this.field_V.field_m[var5Lifetime1] = ti.field_I[this.field_O].field_m[var6Lifetime1Lifetime1];
                }
                var5Lifetime1++;
                var6Lifetime1Lifetime1 = 1 + var6Lifetime1Lifetime1 & 16383;
                var8Lifetime1++;
              }
              var7Lifetime1++;
              continue;
            }
            break;
          }
        }
    }

    private final void a(int[] param0, jd param1, byte param2) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        byte stackIn_9_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_117_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_8_1;
        int var4_int = 0;
        RuntimeException var4 = null;
        ll var5 = null;
        int var6 = 0;
        qb var7 = null;
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
        ll var20 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4_int = uj.a(param1, 8, (byte) -61) + 8 * this.field_O;
          var6 = -115 % ((param2 + 59) / 54);
          var5 = go.field_j[var4_int];
          var7 = new qb(512, 512);
          var8 = 128;
          L0: while (var8 < -128 + this.field_y) {
            var9 = 0;
            if (var19 != 0) {
              return;
            }
            var10 = 0;
            L2: while (true) {
              var10++;
              var11 = 0;
              var12 = 0;
              var13 = -(var5.field_h / 4) + var8;
              while (true) {
                stackIn_7_0 = ~var11;
                stackIn_7_1 = ~(-8 + this.field_H);
                if (stackIn_7_0 > stackIn_7_1) {
                  stackIn_12_0 = 0;
                  stackOut_8_1 = mn.field_y.field_m[var13];
                  stackIn_12_1 = stackOut_8_1;
                  stackIn_9_1 = stackOut_8_1;
                  if (stackIn_12_0 == stackIn_9_1) {
                    var13 = var13 + this.field_y;
                    var11++;
                    continue;
                  }
                }
                stackIn_12_0 = var5.field_h / 2;
                stackIn_12_1 = var8;
                var13 = stackIn_12_0 + stackIn_12_1;
                while (var12 < -8 + this.field_H) {
                  stackIn_18_0 = -1;
                  stackIn_18_1 = ~mn.field_y.field_m[var13];
                  if (stackIn_18_0 == stackIn_18_1) {
                    var12++;
                    var13 = var13 + this.field_y;
                    continue;
                  }
                  break;
                }
                stackIn_18_0 = var8;
                stackIn_18_1 = var5.field_h / 4;
                L10: {
                  boolean decompiledFrameRemainder1 = true;
                  boolean decompiledFrameRemainder0 = true;
                  var13 = stackIn_18_0 - stackIn_18_1;
                  if (tc.field_D[var4_int]) {
                    stackIn_21_0 = Math.abs(var11 - var12);
                    if (ig.field_a[var4_int]) {
                      stackIn_22_1 = var5.field_h / 2;
                    } else {
                      stackIn_22_1 = var5.field_h;
                    }
                    decompiledFrameRemainder0 = !(stackIn_21_0 >= stackIn_22_1);
                  }
                  if (decompiledFrameRemainder0) {
                    decompiledFrameRemainder1 = !((2 * var5.field_c) < (var12 + var11));
                  }
                  if (decompiledFrameRemainder1) {
                    var4_int = uj.a(param1, 8, (byte) -26) + 8 * this.field_O;
                    var5 = go.field_j[var4_int];
                    break L10;
                  }
                  var9 = 1;
                  var14 = (var12 + var11) / 2;
                  var15 = 0;
                  var15 = -on.a(var5.field_h / 2, (-var11 + var12) / 4, (byte) 98);
                  var15 = var15 & 8191;
                  if (4096 <= var15) {
                    var14 = var12;
                    var8 = var8 + var5.field_h / 4;
                  } else {
                    var8 = var8 - var5.field_h / 4;
                    var14 = var11;
                  }
                  if (!ig.field_a[var4_int]) {
                    var15 = 0;
                  }
                  L19: {
                    if (var4_int != 25 &&
                      26 != var4_int &&
                      var4_int != 27 &&
                      6 != var4_int) {
                      switch (var4_int) {
                        default:
                          break L19;
                        case 7:
                        case 33:
                        case 34:
                        case 35:
                        case 39:
                        case 40:
                        case 42:
                        case 43:
                        case 46:
                        case 47:
                        case 58:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                          break;
                      }
                    }
                    sn.a(var8, mn.field_y, var5.field_c / 2, 124, this, false, -(var5.field_c / 4) + var14, (byte) 0);
                    sn.a(var8, this.field_V, var5.field_c / 2, 122, this, false, -(var5.field_c / 4) + var14, (byte) 0);
                    var16 = -var5.field_h / 3;
                    while (!(var16 >= (var5.field_h / 3))) {
                      var17 = (var16 * j.a(var15, -111) >> 16) + var8;
                      var18 = var14 + var5.field_c * 4 / 10 - (of.a(127, var15) * var16 >> 16);
                      sn.a(var17, mn.field_y, 2 * var5.field_c / 10, -58, this, false, var18, (byte) -5);
                      sn.a(var17, this.field_V, 2 * var5.field_c / 10, 124, this, false, var18, (byte) -5);
                      var16++;
                    }
                  }
                  var7.a();
                  de.d(0, 0, 512, 512, 0);
                  var16 = var5.field_f + 8 * var5.field_c / 10;
                  var17 = 1;
                  if (var4_int == 25) {
                    var16 -= 16;
                  }
                  if (var4_int == 26) {
                    var16 -= 4;
                  }
                  if (var4_int == 27) {
                    var16 -= 8;
                  }
                  if (var4_int == 28) {
                    var17 = 0;
                    var16 += 8;
                  }
                  if (var4_int == 29) {
                    var17 = 0;
                    var16 += 8;
                  }
                  if (var4_int == 30) {
                    var16 += 16;
                    var17 = 0;
                  }
                  if (var4_int == 31) {
                    var17 = 0;
                  }
                  if (56 == var4_int) {
                    var17 = 0;
                    var16 += 0;
                  }
                  if (57 == var4_int) {
                    var17 = 0;
                    var16 += 16;
                  }
                  if (59 == var4_int) {
                    var16 += 8;
                    var17 = 0;
                  }
                  if (var4_int >= 0 &&
                    8 > var4_int &&
                    0 != var4_int &&
                    var4_int != 2) {
                    var17 = 0;
                  }
                  if (8 <= var4_int &&
                    var4_int < 16) {
                    var17 = 0;
                  }
                  if (40 <= var4_int &&
                    48 > var4_int) {
                    var17 = 0;
                  }
                  if (var4_int >= 32 &&
                    var4_int < 40 &&
                    var4_int != 39) {
                    var17 = 0;
                  }
                  var5.b().b(var5.field_h / 2 + var5.field_j << 4, var16 << 4, 4096, 4096, var15 << 3, 4096);
                  this.a(false, -256 + var8, this.field_V, var17 != 0, -256 + var14, var7);
                  if (26 == var4_int) {
                    var8 += 24;
                  }
                }
                if (var9 == 0 &&
                  var10 < 50) {
                  continue L2;
                }
                var4_int = uj.a(param1, 8, (byte) -83) + this.field_O * 8;
                var20 = go.field_j[var4_int];
                var8 = var8 + var20.field_h / 2;
                stackIn_7_0 = 26;
                stackIn_7_1 = var4_int;
                if (stackIn_7_0 == stackIn_7_1) {
                  var8 += 24;
                }
                var8 = var8 + (32 + uj.a(param1, 128, (byte) -62));
                continue L0;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_113_0 = var4;
          stackIn_113_1 = new StringBuilder().append("nf.I(");
          if (param0 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          stackIn_116_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',');
          if (param1 == null) {
            stackIn_117_2 = "null";
          } else {
            stackIn_117_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_116_1).append(stackIn_117_2).append(',').append(param2).append(')').toString());
        }
    }

    final void t(int param0) {
        int[] dupTemp$0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        ml var6;
        int var7;
        int var3Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_Y = -1;
        this.field_bb = -1;
        this.field_tb = 0;
        this.field_C = -1;
        this.field_D = false;
        this.field_Gb = false;
        var2 = -13 % ((param0 + 59) / 42);
        if (2 < this.field_q) {
          var3 = 0;
          var4 = 250;
          var5 = 0;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (this.field_q > var5) {
              var6 = this.a(var5, true);
              if (var7 == 0) {
                if (var6 != null &&
                  var6.field_ib > 0) {
                  if (this.field_C > -1 &&
                    var3 == var6.field_ib) {
                    this.field_C = -2;
                  }
                  if (this.field_bb > -1 &&
                    var4 == var6.field_ib) {
                    this.field_bb = -2;
                  }
                  if (-1 == this.field_C ||
                    !(var3 >= var6.field_ib)) {
                    this.field_C = var5;
                    var3 = var6.field_ib;
                  }
                  if (this.field_bb == -1 ||
                    !(var4 <= var6.field_ib)) {
                    var4 = var6.field_ib;
                    this.field_bb = var5;
                  }
                }
                var5++;
                continue;
              }
            } else {
              decompiledFrameRemainder0 = (-2 == this.field_C);
            }
            if (decompiledFrameRemainder0) {
              this.field_C = -1;
            }
            if (this.field_bb != -2) {
              break;
            }
            this.field_bb = -1;
            break;
          }
        }
        if (this.field_jb >= this.l(4)) {
          this.i(-17837);
        }
        var3Lifetime1 = 0;
        while (var3Lifetime1 < 16) {
          if (var7 == 0) {
            if (this.field_lb[this.field_J][var3Lifetime1] > 0) {
              dupTemp$0 = this.field_lb[this.field_J];
              dupTemp$0[var3Lifetime1] = dupTemp$0[var3Lifetime1] - 1;
              if (this.field_lb[this.field_J][var3Lifetime1] <= 0 &&
                87 != this.field_v[this.field_J][var3Lifetime1] &&
                this.field_v[this.field_J][var3Lifetime1] != 116) {
                this.field_vb[this.field_J][var3Lifetime1] = 1;
              }
            }
            var3Lifetime1++;
            continue;
          }
          break;
        }
        this.o((byte) 69);
        return;
    }

    final int d(boolean param0) {
        if (param0) {
          return -114;
        }
        return this.field_J;
    }

    final boolean d(int param0) {
        if (param0 != 1) {
          this.a(false, (ml) null, 79, -2, -47);
        }
        return this.field_fb != null ? true : false;
    }

    private final int[] c(jd param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
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
        int[] var19 = null;
        int[] var20 = null;
        ll var21 = null;
        ll var22 = null;
        ll var23 = null;
        ll var24 = null;
        ll var25 = null;
        ll var26 = null;
        ll var27 = null;
        ll var28 = null;
        ll var29 = null;
        ll var30 = null;
        ll var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var40 = null;
        int[] var41 = null;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        Object stackIn_62_0 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = -128 + (this.field_H - 256);
          var4 = 170;
          var34 = new int[6];
          var19 = var34;
          var5 = var19;
          var5[0] = var4 * 3 / 2 + uj.a(param0, -(3 * var4) + (this.field_y >> 1), (byte) -90);
          var5[1] = var34[0] - (uj.a(param0, var4 / 2, (byte) -39) + var4 / 2);
          var5[2] = var4 / 2 + var34[0] + uj.a(param0, var4 / 2, (byte) -97);
          var5[3] = 3 * var4 / 2 + (uj.a(param0, -(var4 * 3) + (this.field_y >> 1), (byte) -32) + (this.field_y >> 1));
          var5[4] = -(var4 / 2) + (var34[3] - uj.a(param0, var4 / 2, (byte) -44));
          var5[5] = var4 / 2 + var34[3] + uj.a(param0, var4 / 2, (byte) -83);
          var7 = var3_int;
          if (var7 < 257) {
            var7 = 257;
          }
          var35 = new int[6];
          var20 = var35;
          var8 = var20;
          var35[3] = var7;
          var35[0] = var7;
          var8[1] = 128 + uj.a(param0, var7 - 256, (byte) -113);
          var8[4] = uj.a(param0, -256 + var7, (byte) -125) + 128;
          var8[2] = var35[0] - var35[1];
          var8[5] = var35[3] - var35[4];
          var9 = 0;
          while (true) {
            stackIn_6_0 = 6;
            boolean decompiledFrameRemainder0 = true;
            if ((stackIn_6_0 > var9) &&
              (decompiledFrameRemainder0 = (var18 == 0))) {
              if (var34[var9] < (var4 >> 1)) {
                var5[var9] = var4 >> 1;
              }
              if (var34[var9] >= this.field_y - (var4 >> 1)) {
                var5[var9] = -(var4 >> 1) + (this.field_y - 1);
              }
              var10 = 0;
              L7: while (true) {
                stackIn_16_0 = ~var4;
                stackIn_16_1 = ~var10;
                if (stackIn_16_0 < stackIn_16_1) {
                  stackIn_6_0 = -var35[var9] + this.field_H;
                  var11 = stackIn_6_0;
                  while (var11 < this.field_H) {
                    var6 = -(var4 >> 1) + var10 + var34[var9] + var11 * this.field_y;
                    mn.field_y.field_m[var6] = (byte)-5;
                    stackIn_16_0 = -1;
                    stackIn_16_1 = ~var10;
                    if (stackIn_16_0 == stackIn_16_1) {
                      mn.field_y.field_m[var6] = (byte) 1;
                    }
                    if (var10 == 1) {
                      mn.field_y.field_m[var6] = (byte)2;
                    }
                    if (var4 - 2 == var10) {
                      mn.field_y.field_m[var6] = (byte)3;
                    }
                    if (var10 == -1 + var4) {
                      mn.field_y.field_m[var6] = (byte)4;
                    }
                    var11++;
                  }
                  var10++;
                  continue L7;
                }
                break;
              }
              var9++;
              continue;
            }
            if (decompiledFrameRemainder0) {
              System.gc();
              this.field_V = new ll(this.field_y, this.field_H, gg.field_c);
            }
            if (null != ti.field_I) {
              this.field_V.field_l = ti.field_I[this.field_O].field_l;
            }
            this.a(0, 120, mn.field_y, 0, this.field_V);
            var21 = go.field_j[0 + this.field_O * 8];
            this.a(false, -32 + (var34[0] - 128), this.field_V, true, -var35[0] + (this.field_H - 256) - 120, var21.b());
            var22 = go.field_j[this.field_O * 8 + 1];
            this.a(false, -96 + var34[3], this.field_V, true, -376 + (this.field_H - var35[3]), var22.b());
            var23 = go.field_j[3 + this.field_O * 8];
            this.a(false, var34[4] - 128, this.field_V, true, -32 + (-256 + this.field_H) - var35[4], var23.b());
            var24 = var23.a();
            this.a(false, -128 + var34[2], this.field_V, true, -256 + this.field_H + (-var35[2] - param1), var24.b());
            var10 = 0;
            do {
              if (var10 >= 3) {
                var10 = 3;
                break;
              }
              var25 = go.field_j[8 * this.field_O + 2];
              this.a(false, 3 + (var34[var10] - 128), this.field_V, true, -256 + this.field_H - var35[var10], var25.b());
              var26 = go.field_j[uj.a(param0, 4, (byte) -39) - (-4 - this.field_O * 8)];
              this.a(false, -192 + var34[var10] + 3, this.field_V, true, -160 + this.field_H, var26.b());
              var27 = go.field_j[4 + (uj.a(param0, 4, (byte) -100) + this.field_O * 8)];
              this.a(false, 3 + (-64 + var34[var10]), this.field_V, true, this.field_H - 160, var27.b());
              var10++;
            } while (var18 == 0);
            while (var10 < 6) {
              var28 = go.field_j[this.field_O * 8 + 2];
              this.a(false, 3 + var34[var10] - 128, this.field_V, true, -256 + (this.field_H - var35[var10]), var28.b());
              var29 = go.field_j[4 + (uj.a(param0, 4, (byte) -56) + this.field_O * 8)];
              this.a(false, 3 + (var34[var10] - 192), this.field_V, true, -160 + this.field_H, var29.b());
              var30 = go.field_j[4 + (uj.a(param0, 4, (byte) -127) + 8 * this.field_O)];
              this.a(false, 3 + (var34[var10] - 64), this.field_V, true, this.field_H - 160, var30.b());
              var10++;
              if (var18 == 0) {
                continue;
              }
              break;
            }
            var40 = new int[1000];
            var41 = new int[1000];
            var12 = 0;
            var13 = 0;
            L22: while (true) {
              stackIn_48_0 = 1000;
              stackIn_48_1 = var13;
              if (stackIn_48_0 > stackIn_48_1) {
                var33 = go.field_j[4 + (uj.a(param0, 4, (byte) -60) + this.field_O * 8)];
                var14 = uj.a(param0, -256 + this.field_y, (byte) -115);
                var15 = uj.a(param0, -256 + this.field_H, (byte) -68);
                var16 = 1;
                if (var18 != 0) {
                  return null;
                }
                var17 = 0;
                while (var17 < var12) {
                  stackIn_48_0 = Math.abs(var40[var17] - var14);
                  stackIn_48_1 = 192;
                  if (stackIn_48_0 < stackIn_48_1 &&
                    Math.abs(var41[var17] - var15) < 192) {
                    var16 = 0;
                  }
                  var17++;
                }
                if (var16 != 0) {
                  var40[var12] = var14;
                  var41[var12] = var15;
                  var12++;
                  this.a(false, var14, this.field_V, false, var15, var33.b());
                }
                var13++;
                continue L22;
              }
              break;
            }
            this.a(0, 121, this.field_V, 0, mn.field_y);
            this.b((byte) 5);
            stackIn_62_0 = null;
            return (int[]) (stackIn_62_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_65_0 = var3;
          stackIn_65_1 = new StringBuilder().append("nf.NA(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int[] param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_63_0Lifetime1;
        int stackIn_63_1Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int stackIn_63_0Lifetime2;
        int stackIn_63_1Lifetime2;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4 = 32;
          if (this.field_w == -320) {
            var4 = 0;
          }
          var5 = 0;
          L1: while (true) {
            stackIn_5_0 = -1 + param0.length;
            while (true) {
              stackIn_6_0 = stackIn_5_0;
              stackIn_6_1 = var5;
              while (true) {
                if (stackIn_6_0 > stackIn_6_1) {
                  var6 = var5 * (this.field_y - 2 * var4) / (param0.length - 1) + var4;
                  var7 = var4 + (var5 + 1) * (this.field_y - var4 * 2) / (param0.length - 1);
                  var8 = 32 + param0[var5];
                  var9 = param0[var5 + 1] + 32;
                  var10 = (var9 - var8) / (-var6 + var7);
                  var11 = 0;
                  stackIn_100_0 = 1;
                  stackIn_100_1 = Math.abs(var10);
                  if (var21 == 0) {
                    boolean decompiledFrameCompleted0 = true;
                    if (stackIn_100_0 < stackIn_100_1) {
                      L8: do {
                        boolean decompiledFrameRemainder1 = true;
                        var11 = 0;
                        if (var5 < -2 + param0.length) {
                          var5++;
                          var11 = 1;
                          var12 = (this.field_y - 2 * var4) * var5 / (-1 + param0.length) + var4;
                          var13 = (1 + var5) * (this.field_y - 2 * var4) / (-1 + param0.length) + var4;
                          var14 = 32 + param0[var5];
                          var15 = param0[1 + var5] + 32;
                          var16 = (-var14 + var15) / (var13 - var12);
                          if (Math.abs(var16) > 1) {
                            stackIn_15_0 = (0 < var16) ? 1 : -1;
                            if (var10 > 0) {
                              stackIn_18_1 = 1;
                            } else {
                              stackIn_18_1 = -1;
                            }
                            if (stackIn_15_0 == stackIn_18_1) {
                              var9 = var15;
                              var7 = var13;
                              decompiledFrameRemainder1 = false;
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            var5--;
                            var11 = 0;
                          }
                        }
                        stackIn_22_0 = var11;
                      } while (stackIn_22_0 != 0);
                      stackIn_22_0 = var9;
                      boolean decompiledFrameRemainder0 = true;
                      if (stackIn_22_0 <= var8) {
                        var3_int = var9;
                        while (var3_int < var8) {
                          var12 = var3_int;
                          var13 = var6;
                          var14 = -var6 + var7;
                          var15 = -var8 + var9;
                          var16 = 8192 * (var3_int - var9) / var15;
                          var17 = of.a(-122, var16);
                          var18 = var14 / 2 * (var17 + (var3_int - var8) * 131072 / var15) >> 16;
                          var13 = var13 + var18;
                          var18 = -var18 + (var7 - var6);
                          stackIn_63_0 = 0;
                          stackIn_63_1 = var12;
                          if (stackIn_63_0 <= stackIn_63_1 &&
                            this.field_H > var12) {
                            if (var13 < 0) {
                              var18 = var18 - (0 - var13);
                              var13 = 0;
                            }
                            if ((var18 + var13) > this.field_y) {
                              var18 = -var13 + this.field_y;
                            }
                            var19 = var13 + var12 * this.field_y;
                            var20 = 0;
                            while (var20 < var18) {
                              mn.field_y.field_m[var19 + var20] = (byte)-5;
                              var20++;
                            }
                          }
                          var3_int++;
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var3_int = var8;
                        while (var9 > var3_int) {
                          var12 = var3_int;
                          var13 = var6;
                          var14 = -var6 + var7;
                          var15 = var9 - var8;
                          var16 = (var3_int - var9) * 8192 / var15;
                          var17 = of.a(-107, var16);
                          var18Lifetime1 = ((-var8 + var3_int) * 131072 / var15 + var17) * (var14 / 2) >> 16;
                          stackIn_63_0Lifetime2 = -1;
                          stackIn_63_1Lifetime2 = ~var12;
                          if (stackIn_63_0Lifetime2 >= stackIn_63_1Lifetime2 &&
                            this.field_H > var12) {
                            if (var13 < 0) {
                              var18Lifetime1 = var18Lifetime1 + var13;
                              var13 = 0;
                            }
                            if (this.field_y < var13 + var18Lifetime1) {
                              var18Lifetime1 = this.field_y - var13;
                            }
                            var19Lifetime1 = var12 * this.field_y + var13;
                            var20Lifetime1 = 0;
                            while (var18Lifetime1 > var20Lifetime1) {
                              mn.field_y.field_m[var20Lifetime1 + var19Lifetime1] = (byte)-5;
                              var20Lifetime1++;
                            }
                          }
                          var3_int++;
                        }
                      }
                      var3_int = var6;
                      while (true) {
                        stackIn_63_0Lifetime1 = ~var3_int;
                        stackIn_63_1Lifetime1 = ~var7;
                        if (stackIn_63_0Lifetime1 <= stackIn_63_1Lifetime1) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var12 = var8;
                        stackIn_6_0 = var8;
                        stackIn_6_1 = var9;
                        if (stackIn_6_0 < stackIn_6_1) {
                          var12 = var9;
                        }
                        var13 = this.field_H - var12;
                        if (var3_int >= 0 &&
                          var3_int < this.field_y) {
                          if (var12 < 0) {
                            var13 = var13 - (0 - var12);
                            var12 = 0;
                          }
                          if (this.field_H < var12 + var13) {
                            var13 = this.field_H - var12;
                          }
                          var14 = var3_int + this.field_y * var12;
                          var15 = 0;
                          while (var15 < var13) {
                            mn.field_y.field_m[var14 + var15 * this.field_y] = (byte)-5;
                            var15++;
                          }
                        }
                        var3_int++;
                      }
                    }
                    if (decompiledFrameCompleted0) {
                      var3_int = var6;
                      while (var3_int < var7) {
                        var12 = (var3_int - var6) * 4096 / (var7 - var6);
                        var13 = j.a(var12, -115);
                        var14 = (var8 << 16) + (var9 - var8) * ((-var13 + 65536) / 2) >> 16;
                        var15 = this.field_H - var14;
                        stackIn_5_0 = var3_int;
                        if (stackIn_5_0 >= 0 &&
                          this.field_y > var3_int) {
                          if (0 > var14) {
                            var15 = var15 - (-var14 + 0);
                            var14 = 0;
                          }
                          if (this.field_H < (var14 + var15)) {
                            var15 = this.field_H - var14;
                          }
                          var16 = var3_int + var14 * this.field_y;
                          var17 = 0;
                          while (var17 < var15) {
                            mn.field_y.field_m[this.field_y * var17 + var16] = (byte)-5;
                            var17++;
                          }
                        }
                        var3_int++;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                } else {
                  stackIn_100_0 = param1;
                  stackIn_100_1 = -103;
                }
                if (stackIn_100_0 >= stackIn_100_1) {
                  field_qb = (String[]) null;
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_105_0 = var3;
          stackIn_105_1 = new StringBuilder().append("nf.KB(");
          if (param0 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, nf param1) {
        ml stackIn_54_0 = null;
        Object stackIn_59_0 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_53_0;
        int var3_int = 0;
        ml var3 = null;
        mi var3_ref = null;
        RuntimeException var3_ref2 = null;
        mi var4 = null;
        int var5 = 0;
        ml var6 = null;
        ml var7 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1.field_Jb == null) {
            return;
          }
          this.field_Cb = param1.field_Cb;
          this.field_ub = param1.field_ub;
          this.field_jb = param1.field_jb;
          this.field_J = param1.field_J;
          this.field_f = param1.field_f;
          sf.a(param1.field_V.field_m, 0, this.field_V.field_m, 0, this.field_V.field_m.length);
          sf.a(param1.field_Jb.field_m, 0, this.field_Jb.field_m, 0, this.field_Jb.field_m.length);
          var3_int = 0;
          do {
            if (var3_int >= this.field_v.length) {
              var3_int = 0;
              break;
            }
            sf.a(param1.field_v[var3_int], 0, this.field_v[var3_int], 0, 16);
            var3_int++;
          } while (var5 == 0);
          do {
            if (var3_int >= this.field_lb.length) {
              var3_int = 0;
              break;
            }
            sf.a(param1.field_lb[var3_int], 0, this.field_lb[var3_int], 0, 16);
            var3_int++;
          } while (var5 == 0);
          do {
            if (var3_int >= this.field_vb.length) {
              var3_int = 0;
              break;
            }
            sf.a(param1.field_vb[var3_int], 0, this.field_vb[var3_int], 0, 16);
            var3_int++;
          } while (var5 == 0);
          L10: while (true) {
            if (this.field_L.length > var3_int) {
              sf.a(param1.field_L[var3_int], 0, this.field_L[var3_int], 0, 16);
              var3_int++;
              if (var5 == 0) {
                continue;
              }
            } else {
              var3 = (ml) (this.field_i.b(12623));
              while (true) {
                if (var3 != null) {
                  var3.a(true);
                  var3.a((byte) 88);
                  var3 = (ml) (this.field_i.a(0));
                  if (var5 == 0) {
                    continue;
                  }
                } else {
                  var3_ref = (mi) (this.field_Kb.b(12623));
                  do {
                    if (var3_ref == null) {
                      var3_ref = (mi) (this.field_r.b(12623));
                      break;
                    }
                    var3_ref.f(0);
                    var3_ref = (mi) (this.field_Kb.a(0));
                  } while (var5 == 0);
                  do {
                    if (var3_ref == null) {
                      this.field_Kb.c(-3);
                      this.field_r.c(3);
                      break;
                    }
                    var3_ref.f(0);
                    var3_ref = (mi) (this.field_r.a(0));
                  } while (var5 == 0);
                  var3 = (ml) (param1.field_i.b(12623));
                }
                break;
              }
              do {
                if (var3 == null) {
                  var3 = (ml) (this.field_i.b(12623));
                  break;
                }
                var6 = var3.a(this, (byte) 59);
                this.field_i.b(var6, -1);
                this.field_B.a(var6, (long)var6.field_T, (byte) 121);
                var3 = (ml) (param1.field_i.a(0));
              } while (var5 == 0);
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
                stackOut_53_0 = param1.a(var3.field_T, true);
                stackIn_59_0 = stackOut_53_0;
                stackIn_54_0 = stackOut_53_0;
                if (var5 == 0) {
                  var7 = stackIn_54_0;
                  if (null != var7.field_s) {
                    var3.field_s = this.a(var7.field_s.field_T, true);
                  }
                  var3 = (ml) (this.field_i.a(0));
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_59_0 = param1.field_Kb.b(12623);
              }
              var3_ref = (mi) (stackIn_59_0);
              do {
                if (var3_ref == null) {
                  var3_ref = (mi) (param1.field_r.b(12623));
                  break;
                }
                var4 = var3_ref.b(21310, this);
                this.field_Kb.b(var4, -1);
                var3_ref = (mi) (param1.field_Kb.a(0));
              } while (var5 == 0);
              do {
                if (var3_ref == null) {
                  if (param1.field_I.b(116) == null &&
                    param1.field_kb.b(true) &&
                    param1.field_h.d(122)) {
                    this.field_I.a(17);
                    this.field_kb.c(74);
                    this.field_h.a(17);
                    var3_int = 0;
                    break L10;
                  }
                  break;
                }
                var4 = var3_ref.b(21310, this);
                this.field_r.b(var4, -1);
                var3_ref = (mi) (param1.field_r.a(0));
              } while (var5 == 0);
              throw new RuntimeException();
            }
            break;
          }
          do {
            if (this.field_N.length <= var3_int) {
              var3_int = 0;
              break;
            }
            sf.a(param1.field_N[var3_int], 0, this.field_N[var3_int], 0, 18);
            var3_int++;
          } while (var5 == 0);
          do {
            if (var3_int >= this.field_v.length) {
              sf.a(param1.field_x, 0, this.field_x, 0, this.field_x.length);
              sf.a(param1.field_X, 0, this.field_X, 0, this.field_X.length);
              sf.a(param1.field_Ab, 0, this.field_Ab, 0, this.field_Ab.length);
              sf.a(param1.field_o, 0, this.field_o, 0, this.field_o.length);
              sf.a(param1.field_K, 0, this.field_K, 0, this.field_K.length);
              sf.a(param1.field_g, 0, this.field_g, 0, this.field_g.length);
              sf.a(param1.field_db, 0, this.field_db, 0, this.field_db.length);
              sf.a(param1.field_s, 0, this.field_s, 0, this.field_s.length);
              sf.a(param1.field_ib, 0, this.field_ib, 0, this.field_ib.length);
              sf.a(param1.field_ob, 0, this.field_ob, 0, this.field_ob.length);
              sf.a(param1.field_U, 0, this.field_U, 0, this.field_U.length);
              sf.a(param1.field_ab, 0, this.field_ab, 0, this.field_ab.length);
              sf.a(param1.field_Eb, 0, this.field_Eb, 0, this.field_Eb.length);
              sf.a(param1.field_wb, 0, this.field_wb, 0, this.field_wb.length);
              sf.a(param1.field_Nb, 0, this.field_Nb, 0, this.field_Nb.length);
              break;
            }
            sf.a(param1.field_v[var3_int], 0, this.field_v[var3_int], 0, 16);
            var3_int++;
          } while (var5 == 0);
          if (param0 <= 71) {
            return;
          }
          sf.a(param1.field_T, 0, this.field_T, 0, this.field_T.length);
          sf.a(param1.field_n, 0, this.field_n, 0, this.field_n.length);
          sf.a(param1.field_gb, 0, this.field_gb, 0, this.field_gb.length);
          sf.a(param1.field_Fb, 0, this.field_Fb, 0, this.field_Fb.length);
          sf.a(param1.field_Ob, 0, this.field_Ob, 0, this.field_Ob.length);
          sf.a(param1.field_c, 0, this.field_c, 0, this.field_c.length);
          sf.a(param1.field_b, 0, this.field_b, 0, this.field_b.length);
          sf.a(param1.field_u, 0, this.field_u, 0, this.field_u.length);
          sf.a(param1.field_R, 0, this.field_R, 0, this.field_R.length);
          sf.a(param1.field_cb, 0, this.field_cb, 0, this.field_cb.length);
          sf.a(param1.field_a, 0, this.field_a, 0, this.field_a.length);
          sf.a(param1.field_p, 0, this.field_p, 0, this.field_p.length);
          this.field_t = param1.field_t;
          this.field_mb = param1.field_mb;
          this.field_nb = param1.field_nb;
          if (param1.field_Gb) {
            throw new IllegalStateException();
          }
          this.field_Gb = false;
          if (param1.field_zb) {
            throw new IllegalStateException();
          }
          this.field_zb = false;
          if (param1.field_Mb) {
            throw new IllegalStateException();
          }
          this.field_Mb = false;
          if (!param1.field_Db.b(true)) {
            throw new IllegalStateException();
          }
          this.field_Db.c(29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_104_0 = var3_ref2;
          stackIn_104_1 = new StringBuilder().append("nf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 19) {
          this.a(103, (ml) null);
        }
        var2 = 0;
        while (var2 < 16) {
          this.field_vb[0][var2] = 0;
          this.field_lb[0][var2] = 0;
          this.field_v[0][var2] = -1;
          var2++;
          if (var3 == 0) {
            continue;
          }
          break;
        }
    }

    final int h(int param0) {
        if (param0 >= -69) {
          this.a(118, (ml) null);
        }
        int fieldTemp$0 = this.field_nb;
        this.field_nb = this.field_nb + 1;
        return fieldTemp$0;
    }

    final int f(int param0) {
        if (param0 != 12955) {
          this.field_N = (int[][]) null;
        }
        return gj.field_a[this.field_F];
    }

    private final int[] a(int param0, jd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_3 = 0;
        int[] stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var11 = new int[10];
          var10 = var11;
          var9 = var10;
          var5 = var9;
          var6_int = 0;
          do {
            if ((var11.length - 1) <= var6_int) {
              var9[1 + uj.a(param1, -2 + var11.length, (byte) -71)] = this.field_H * 3 / 8 - uj.a(param1, 2 * this.field_H / 8, (byte) -104);
              var9[uj.a(param1, -2 + var11.length, (byte) -103) + 1] = this.field_H * 3 / 8 - uj.a(param1, 2 * this.field_H / 8, (byte) -127);
              var9[1 + uj.a(param1, -2 + var11.length, (byte) -119)] = this.field_H * 3 / 8 - uj.a(param1, 2 * this.field_H / 8, (byte) -91);
              var9[uj.a(param1, var11.length - 2, (byte) -34) + 1] = this.field_H * 3 / param0 - uj.a(param1, this.field_H * 2 / 8, (byte) -59);
              var9[0] = 64 + this.field_H;
              break;
            }
            var9[var6_int] = 7 * this.field_H / 8 - uj.a(param1, this.field_H * 2 / 8, (byte) -113);
            var6_int++;
          } while (var8 == 0);
          var9[-1 + var11.length] = var11[0];
          while (true) {
            stackIn_9_0 = var5.length;
            stackIn_9_1 = this.field_y / 2;
            if (stackIn_9_0 < stackIn_9_1) {
              var3_int = 100;
              if (var8 == 0) {
                if (this.field_y / 8 < var5.length) {
                  var3_int = 5;
                }
                var6 = new int[var5.length * 2 - 2 + 1];
                var6[0] = var5[0];
                var7 = 1;
                while (var5.length > var7) {
                  var4 = (Math.abs(-var5[var7] + var5[var7 - 1]) + 5) * var3_int / 100;
                  stackIn_9_0 = this.field_H / 2;
                  stackIn_9_1 = var5[var7];
                  if (stackIn_9_0 < stackIn_9_1) {
                    var4 = 2 * this.field_H / var5.length;
                  }
                  stackIn_20_0 = var6;
                  stackIn_20_1 = 2 * var7 - 1;
                  stackIn_20_2 = var5[var7] + (var5[-1 + var7] - var4) >> 1;
                  if (var4 == 0) {
                    stackIn_21_3 = 0;
                  } else {
                    stackIn_21_3 = uj.a(param1, var4, (byte) -57);
                  }
                  stackIn_20_0[stackIn_20_1] = stackIn_20_2 + stackIn_21_3;
                  var6[2 * var7] = var5[var7];
                  var7++;
                }
                var5 = var6;
                continue;
              }
            }
            this.a(var5, (byte) -121);
            stackIn_25_0 = var5;
            return stackIn_25_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("nf.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void b(int param0, boolean param1, int param2) {
        int[] discarded$1 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_4_0Lifetime1;
        int stackIn_4_1Lifetime1;
        boolean decompiledFrameCompleted0 = true;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_Cb = this.field_J;
        this.field_jb = param0;
        this.field_J = param2;
        this.field_f = false;
        if (this.field_jb < this.field_q &&
          mj.field_p == 7) {
          var4 = 0;
          while (true) {
            stackIn_4_0 = this.field_q;
            stackIn_4_1 = var4;
            if (stackIn_4_0 <= stackIn_4_1) {
              break;
            }
            stackIn_15_0 = 0;
            if (var6 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            var5 = stackIn_15_0;
            while (var5 < this.field_v[var4].length) {
              stackIn_4_0Lifetime1 = 11;
              stackIn_4_1Lifetime1 = this.field_v[var4][var5];
              if (stackIn_4_0Lifetime1 == stackIn_4_1Lifetime1) {
                this.field_f = true;
              }
              var5++;
            }
            var4++;
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_15_0 = param1 ? 1 : 0;
        }
        if (stackIn_15_0 != 1) {
          discarded$1 = this.d(67, (jd) null);
        }
    }

    final void f(byte param0) {
        ml var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        mk.field_J.a((byte) 72, this.field_i);
        if (param0 != -20) {
          return;
        }
        var2 = (ml) (mk.field_J.b(-64));
        while (var2 != null) {
          if (var3 == 0) {
            if (~var2.field_u == ~this.field_J) {
              var2.field_D = false;
            }
            var2 = (ml) (mk.field_J.d(param0 - 18482));
            continue;
          }
          break;
        }
    }

    final boolean g(int param0) {
        if (param0 < 115) {
          this.e((byte) 27);
        }
        return this.field_Mb;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_v[param0][param1] = param4;
        if (param3 < 12) {
          this.field_X = (int[]) null;
        }
        this.field_vb[param0][param1] = param2;
        this.field_lb[param0][param1] = 0;
    }

    final void a(ml param0, int param1) {
        try {
          pe.a(-(param0.field_Y >> 1) + param0.field_lb, this, (byte) 0, param0.field_db - param0.field_Y, 21374, param0.field_w, this.field_Jb);
          if (param1 != 0) {
            this.a((int[]) null, (byte) 67);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nf.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        int var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_Cb == this.field_J) {
          this.field_Cb = this.field_Cb - 1;
        }
        if (param0 != -1) {
          field_e = (String) null;
        }
        L2: {
          boolean decompiledFrameRemainder0 = true;
          var2 = this.field_J;
          if (!this.field_d) {
            L4: while (true) {
              this.field_jb = this.field_jb + 1;
              this.field_J = (this.field_J + 1) % this.field_q;
              do {
                if (this.a(this.field_J, true) == null) {
                  continue L4;
                }
              } while (var3 != 0);
              break;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_J = this.field_Cb;
            L6: while (true) {
              this.field_J = (this.field_J + 2) % this.field_q;
              this.field_jb = this.field_jb + 1;
              do {
                if (this.a(this.field_J, true) == null) {
                  continue L6;
                }
              } while (var3 != 0);
              break;
            }
            break L2;
          }
          L8: while (true) {
            this.field_jb = this.field_jb + 1;
            this.field_J = (this.field_J + 1) % this.field_q;
            do {
              if (this.a(this.field_J, true) == null) {
                continue L8;
              }
            } while (var3 != 0);
            break;
          }
        }
        this.field_Cb = var2;
    }

    final boolean a(int param0, int param1, byte param2, ml param3) {
        boolean discarded$3 = false;
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.p(-8323);
          if (var5_int <= param0 &&
            param0 <= (-var5_int + this.field_y) &&
            param1 >= var5_int &&
            -16 + this.field_H >= param1) {
            discarded$3 = this.a(param0, var5_int >> 1, this.field_H - 16, -59);
            if (param2 != -75) {
              this.field_i = (vn) null;
            }
            stackIn_12_0 = !(jo.field_b);
            return stackIn_12_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("nf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final vn g(byte param0) {
        if (param0 <= 33) {
          this.p(-3);
        }
        return this.field_i;
    }

    final boolean c(byte param0) {
        if (param0 != 89) {
          this.b(-39, (ml) null, 42, -60);
        }
        return this.field_Gb;
    }

    final int a(byte param0, int param1) {
        if (param0 < 97) {
          this.a(55, -107, -93, -42, -41);
        }
        return this.field_fb[param1];
    }

    final int l(int param0) {
        if (7 == this.field_O &&
          lk.a(0, (byte) -52)) {
          return 0;
        }
        if (param0 != 4) {
          return -60;
        }
        return 10 * this.field_q;
    }

    private final int[] b(jd param0, int param1) {
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_65_0 = 0;
        int[] stackIn_68_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[][] var7_array = null;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var3_intLifetime2;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var17 = new int[7];
          var14 = var17;
          var5 = var14;
          this.field_w = -320;
          var6 = 0;
          L1: while (true) {
            if (var17.length > var6) {
              var5[var6] = this.field_H - (uj.a(param0, this.field_H / 3, (byte) -126) + Math.abs((this.field_y / 2 - this.field_y * var6 / var17.length) * this.field_H / this.field_y));
              var6++;
              if (var13 == 0) {
                continue;
              }
            } else {
              L4: while (true) {
                if (var5.length < (this.field_y / 64)) {
                  var3_int = 100;
                  stackIn_21_0 = var5.length;
                  stackIn_21_1 = this.field_y / 8;
                  if (var13 != 0) {
                    break L1;
                  }
                  if (stackIn_21_0 > stackIn_21_1) {
                    var3_intLifetime2 = 5;
                  }
                  var7 = new int[1 + 2 * (-1 + var5.length)];
                  stackIn_11_0 = var7;
                  stackIn_11_1 = 0;
                  stackIn_11_2 = var5[0];
                  while (true) {
                    stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                    var6 = 1;
                    while (var6 < var5.length) {
                      var4 = this.field_H / var5.length;
                      stackIn_11_0 = var7;
                      stackIn_11_1 = -1 + 2 * var6;
                      stackIn_11_2 = (var5[var6] + var5[-1 + var6]) / 2;
                      if (var4 > 0) {
                        stackIn_17_3 = uj.a(param0, var4, (byte) -33);
                      } else {
                        stackIn_17_3 = 0;
                      }
                      stackIn_11_0[stackIn_11_1] = stackIn_11_2 + (stackIn_17_3 - var4 / 2);
                      var7[var6 * 2] = var5[var6];
                      var6++;
                    }
                    var5 = var7;
                    continue L4;
                  }
                }
                break;
              }
              this.a(var5, (byte) -107);
            }
            stackIn_21_0 = 2;
            stackIn_21_1 = 7;
            break;
          }
          var18 = new int[stackIn_21_0][stackIn_21_1];
          var15 = var18;
          var7_array = var15;
          var6 = 1;
          do {
            if (var6 >= -1 + var18[0].length) {
              var18[0][0] = 448;
              var18[1][0] = 576;
              var18[0][var18[0].length - 1] = var18[0][0];
              var18[1][-1 + var18[0].length] = var18[1][0];
              break;
            }
            var18[0][var6] = (-(2 * uj.a(param0, 450, (byte) -74)) + 1400) / 3;
            var18[1][var6] = 2 * (700 - uj.a(param0, 450, (byte) -27)) / 3;
            var6++;
          } while (var13 == 0);
          var8 = 0;
          while (true) {
            stackIn_29_0 = -3;
            stackIn_29_1 = ~var8;
            L16: {
              if (stackIn_29_0 < stackIn_29_1) {
                L18: while (true) {
                  stackIn_47_0 = ~this.field_y;
                  if (var13 != 0) {
                    break L16;
                  }
                  if (stackIn_47_0 < ~var18[var8].length) {
                    var3_intLifetime1 = 100;
                    stackIn_29_0 = this.field_y / 8;
                    stackIn_29_1 = var18[var8].length;
                    if (stackIn_29_0 < stackIn_29_1) {
                      var3_intLifetime1 = 5;
                    }
                    var19 = new int[-1 + 2 * var18[var8].length];
                    var16 = var19;
                    var9_ref_int__ = var16;
                    stackIn_37_0 = var9_ref_int__;
                    stackIn_37_1 = 0;
                    stackIn_37_2 = var18[var8][0];
                    while (true) {
                      stackIn_37_0[stackIn_37_1] = stackIn_37_2;
                      var6 = 1;
                      while (var18[var8].length > var6) {
                        var4Lifetime1 = (5 + Math.abs(var18[var8][var6 - 1] - var18[var8][var6])) * var3_intLifetime1 / 100;
                        stackIn_37_0 = var9_ref_int__;
                        stackIn_37_1 = -1 + 2 * var6;
                        stackIn_37_2 = (var18[var8][var6 - 1] + var18[var8][var6]) / 2;
                        if (0 >= var4Lifetime1) {
                          stackIn_43_3 = 0;
                        } else {
                          stackIn_43_3 = uj.a(param0, var4Lifetime1, (byte) -37);
                        }
                        stackIn_37_0[stackIn_37_1] = stackIn_37_2 + (stackIn_43_3 - var4Lifetime1 / 2);
                        var9_ref_int__[var6 * 2] = var18[var8][var6];
                        var6++;
                      }
                      var7_array[var8] = var19;
                      continue L18;
                    }
                  }
                  break;
                }
                var8++;
                continue;
              }
              var8 = 0;
              stackIn_47_0 = 0;
            }
            var9 = stackIn_47_0;
            while (true) {
              stackIn_49_0 = ~var9;
              stackIn_49_1 = ~this.field_y;
              if (stackIn_49_0 > stackIn_49_1) {
                var8 = var9;
                var10 = var18[0].length * var9 / this.field_y;
                stackIn_65_0 = 0;
                if (var13 == 0) {
                  var11 = stackIn_65_0;
                  while (var11 < this.field_H) {
                    var12 = 0;
                    stackIn_49_0 = var18[0][var10];
                    stackIn_49_1 = var18[1][var10];
                    if (stackIn_49_0 > stackIn_49_1) {
                      if (var18[0][var10] < var11) {
                        var12++;
                      }
                      if (var18[1][var10] < var11) {
                        var12++;
                      }
                    }
                    if (var12 % 2 == 1) {
                      mn.field_y.field_m[var8] = (byte)-5;
                    }
                    var8 = var8 + this.field_y;
                    var11++;
                  }
                  var9++;
                  continue;
                }
              } else {
                stackIn_65_0 = param1;
              }
              if (stackIn_65_0 != -30390) {
                this.field_H = -55;
              }
              stackIn_68_0 = var5;
              return stackIn_68_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_71_0 = var3;
          stackIn_71_1 = new StringBuilder().append("nf.JD(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(')').toString());
        }
    }

    final int s(int param0) {
        if (param0 != 0) {
          this.h(114);
        }
        return this.field_q;
    }

    final boolean a(int param0, ml param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param3 = param3 - bg.field_e.field_w;
          if (param2 != 30882) {
            this.field_Kb = (vn) null;
          }
          param0 = param0 - bg.field_e.field_n / 2;
          if (0 <= param0 &&
            param0 <= this.field_y - bg.field_e.field_n &&
            param3 >= 0) {
            if ((this.field_H - bg.field_e.field_w) < param3) {
              return false;
            }
            stackIn_12_0 = !(this.b(param3, 2, param0, bg.field_e));
            return stackIn_12_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("nf.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final vn e(int param0) {
        int var2 = -15 / ((-54 - param0) / 34);
        return this.field_Kb;
    }

    final boolean a(int param0, int param1, ml param2, byte param3, int param4) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb var6 = null;
        RuntimeException var6_ref = null;
        try {
          var6 = uj.field_i[0];
          if (param0 == 55) {
            var6 = uj.field_i[1];
          }
          if (31 == param0) {
            var6 = uj.field_i[2];
          }
          if (param0 == 60) {
            var6 = uj.field_i[3];
          }
          if (param0 == 81) {
            var6 = uj.field_i[4];
          }
          if (param0 == 91) {
            var6 = uj.field_i[5];
          }
          if (param0 == 114) {
            var6 = uj.field_i[6];
          }
          if (param1 < var6.field_w + 2) {
            return false;
          }
          discarded$0 = this.a(param2, var6, 0, param1 - var6.field_w, -(var6.field_n / 2) + param4);
          if (jo.field_b) {
            return false;
          }
          discarded$1 = this.a(param2, var6, 0, 2 + (param1 - var6.field_w), param4 - var6.field_n / 2);
          if (jo.field_b) {
            return false;
          }
          if (param3 > 27) {
            return true;
          }
          this.field_w = -39;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("nf.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3) {
        int var5 = -106 / ((9 - param3) / 60);
        return ko.a(this, param2, param0, param1, this.field_Jb, 16777215);
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4;
        int var5;
        int stackIn_12_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > param1) {
          return false;
        }
        if (param0 < 0) {
          return false;
        }
        var4 = param2;
        while (var4 < 16) {
          stackIn_12_0 = ~param1;
          if (var5 != 0) {
            return stackIn_12_0 != 0;
          }
          if (stackIn_12_0 == ~this.field_v[param0][var4]) {
            return true;
          }
          var4++;
        }
        return false;
    }

    final void a(int param0, int param1, ll param2, int param3) {
        try {
          int var5_int = 37 % ((-78 - param0) / 34);
          this.a(param3, this.field_Jb, param2, param1, -126);
          this.a(param3, 117, param2, param1, this.field_V);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nf.JB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, ml param1) {
        try {
          pe.a(param1.field_lb - (param1.field_Y >> 1), this, (byte) -1, -param1.field_Y + param1.field_db, 21374, param1.field_w, this.field_Jb);
          if (param0 > -36) {
            field_z = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nf.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void o(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_87_0 = 0;
        ml stackIn_106_0 = null;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        Object stackIn_111_0 = null;
        int stackIn_131_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int stackIn_250_0 = 0;
        int stackIn_250_1 = 0;
        ml stackIn_254_0 = null;
        ml stackOut_253_0;
        ml stackOut_105_0;
        int var3_int = 0;
        ml var3 = null;
        mi var3_ref = null;
        int var4_int = 0;
        Object var4 = null;
        double var4_double = 0.0;
        mi var5_ref_mi = null;
        double var5_double = 0.0;
        jd var5_ref_jd = null;
        int var5 = 0;
        double var6_double = 0.0;
        int var6_int = 0;
        mi var6 = null;
        double var7_double = 0.0;
        int var7 = 0;
        double var8_double = 0.0;
        int var8 = 0;
        double var9 = 0.0;
        double var10 = 0.0;
        double var11 = 0.0;
        double var12 = 0.0;
        double var13 = 0.0;
        double var14 = 0.0;
        double var15 = 0.0;
        double var16 = 0.0;
        double var17 = 0.0;
        double var18 = 0.0;
        double var19 = 0.0;
        double var20 = 0.0;
        double var21 = 0.0;
        double var22 = 0.0;
        double var23 = 0.0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        mi var29_ref_mi = null;
        int var29 = 0;
        mi var30 = null;
        int var31 = 0;
        mi var32 = null;
        ml var33 = null;
        mi var34 = null;
        ml var35 = null;
        mi var36 = null;
        mi var37 = null;
        ml var38 = null;
        mi var39 = null;
        mi var40 = null;
        mi var41 = null;
        Object var4Lifetime1;
        int stackIn_7_0Lifetime1;
        int stackIn_7_1Lifetime1;
        int stackIn_131_0Lifetime1;
        int stackIn_150_0Lifetime1;
        int stackIn_150_1Lifetime1;
        int var4_intLifetime1;
        int var6_intLifetime1;
        int var8Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var4_intLifetime1Lifetime1;
        var31 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 69) {
          this.a(38, (mi) null);
        }
        boolean decompiledFrameCompleted2 = true;
        var35 = this.a(this.field_J, true);
        this.field_f = false;
        if (this.field_q > this.field_jb &&
          mj.field_p == -1) {
          var3_int = 0;
          while (true) {
            stackIn_7_0 = this.field_q;
            stackIn_7_1 = var3_int;
            if (stackIn_7_0 <= stackIn_7_1) {
              break;
            }
            if (var31 != 0) {
              decompiledFrameCompleted2 = false;
              break;
            }
            var4_int = 0;
            while (var4_int < this.field_v[var3_int].length) {
              stackIn_7_0Lifetime1 = this.field_v[var3_int][var4_int];
              stackIn_7_1Lifetime1 = 11;
              if (stackIn_7_0Lifetime1 == stackIn_7_1Lifetime1) {
                this.field_f = true;
              }
              var4_int++;
            }
            var3_int++;
          }
        }
        if (decompiledFrameCompleted2) {
          ge.field_p.a((byte) 31, this.field_i);
        }
        var3 = (ml) (ge.field_p.b(-98));
        L9: while (true) {
          boolean decompiledFrameCompleted1 = true;
          if (var3 != null) {
            stackIn_250_0 = ~var3.field_u;
            stackIn_250_1 = ~this.field_J;
            if (var31 != 0) {
              while (true) {
                if (stackIn_250_0 == stackIn_250_1) {
                  var3.a(false, true);
                }
                var3.field_W = 0;
                var3.field_G = -1;
                var3 = (ml) (ge.field_p.d(-18502));
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if (decompiledFrameCompleted1) {
              if (stackIn_250_0 == stackIn_250_1 &&
                var3.field_ib > 0) {
                boolean decompiledFrameCompleted0 = true;
                if (5 == this.field_x[this.field_J] &&
                  0 < this.field_X[this.field_J] &&
                  var3.field_jb != 12 &&
                  !var3.field_U) {
                  var4 = null;
                  var5_ref_mi = (mi) (this.field_Kb.b(12623));
                  while (var5_ref_mi != null) {
                    stackIn_41_0 = -107;
                    stackIn_41_1 = ~var5_ref_mi.field_I;
                    if (var31 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_41_0 == stackIn_41_1 &&
                      var5_ref_mi.field_t == var3) {
                      var4 = var5_ref_mi;
                    }
                    var5_ref_mi = (mi) (this.field_Kb.a(0));
                  }
                  if (decompiledFrameCompleted0) {
                    if (var4 != null) {
                      ((mi) (var4)).field_y = ((mi) (var4)).field_y - this.field_X[this.field_J] / 20;
                      if (!(((mi) (var4)).field_y >= 0)) {
                        ((mi) (var4)).field_y = 0;
                        if (var31 != 0) {
                          var32 = j.a(var3, var3.field_db, (byte) 35, this, 145, var3.field_lb, 106);
                          var34 = var32;
                          var32.field_y = 50 - this.field_X[this.field_J] / 20;
                          this.b(52, var34);
                        }
                      }
                    } else {
                      var32 = j.a(var3, var3.field_db, (byte) 35, this, 145, var3.field_lb, 106);
                      var34 = var32;
                      var32.field_y = 50 - this.field_X[this.field_J] / 20;
                      this.b(52, var34);
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_41_0 = 16;
                  stackIn_41_1 = var3.field_jb;
                }
                if (stackIn_41_0 == stackIn_41_1 ||
                  23 == var3.field_jb) {
                  stackIn_47_0 = (var3.field_jb == 16) ? 71 : 60;
                  var4_intLifetime1 = stackIn_47_0;
                  var36 = j.a(var35, var3.field_db, (byte) 49, this, var4_intLifetime1, var3.field_lb, 111);
                  var36.field_H = 4;
                  this.b(52, var36);
                }
                if (var3.field_jb == 6 ||
                  var3.field_jb == 26 ||
                  var3.field_U &&
                  var3.field_jb == 17) {
                  stackIn_56_0 = (var3.field_jb != 6) ? 76 : 64;
                  var4_intLifetime1Lifetime1 = stackIn_56_0;
                  var37 = j.a(var3, var3.field_db, (byte) 11, this, var4_intLifetime1Lifetime1, var3.field_lb, 55);
                  var37.field_H = 4;
                  this.b(52, var37);
                }
                if (var3.field_U &&
                  16 != var3.field_jb) {
                  var3.field_ib = var3.field_ib - 5;
                  if (var3.field_ib < 1) {
                    var3.field_ib = 1;
                  }
                }
                if (var3.field_jb == 23) {
                  var3.field_q = var3.field_q + 30;
                  if (var3.field_q > 75) {
                    var3.field_q = 75;
                  }
                }
                if (12 == var3.field_jb) {
                  var3.field_x = var3.field_x + 15;
                }
                if (var3.field_jb == 39) {
                  var3.field_ib = var3.field_ib + 25;
                  if (var3.field_ib > 100) {
                    var3.field_ib = 100;
                  }
                }
                if (var3.field_jb == 24 ||
                  var3.field_jb == 18) {
                  var3.a(10, -28922);
                }
                if (var3.field_jb == 36) {
                  var4_double = (double)(var3.w(24501).field_lb - var3.field_lb << 4);
                  var6_double = (double)(256 + (var3.w(param0 + 24432).field_db - var3.field_db << 4));
                  var8_double = 64.0;
                  var10 = var4_double * 4.0 * var4_double / (2.0 * var8_double * var8_double);
                  var12 = var4_double;
                  var14 = -var6_double + var4_double * (4.0 * var4_double) / (var8_double * 2.0 * var8_double);
                  while (true) {
                    boolean decompiledFrameRemainder0 = true;
                    if (var10 != 0.0) {
                      stackIn_87_0 = $cfr$dcmpg(var12 * var12 - var14 * (var10 * 4.0), 0.0);
                      decompiledFrameRemainder0 = (var31 == 0);
                      if ((decompiledFrameRemainder0) && (stackIn_87_0 < 0 &&
                        768.0 > var8_double)) {
                        var8_double = var8_double + 8.0;
                        var14 = var4_double * (4.0 * var4_double) / (var8_double * (2.0 * var8_double)) - var6_double;
                        var12 = var4_double;
                        var10 = var4_double * (var4_double * 4.0) / (2.0 * var8_double * var8_double);
                        continue;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      stackIn_87_0 = $cfr$dcmpl(var10, 0.0);
                    }
                    if (stackIn_87_0 == 0) {
                      break;
                    }
                    if (!(0.0 <= -(var14 * (var10 * 4.0)) + var12 * var12)) {
                      break;
                    }
                    var16 = (-var12 + Math.sqrt(-(var14 * (4.0 * var10)) + var12 * var12)) / (2.0 * var10);
                    var18 = (-var12 - Math.sqrt(-(var10 * 4.0 * var14) + var12 * var12)) / (2.0 * var10);
                    if (Math.abs(var16) > Math.abs(var18)) {
                      var16 = var18;
                    }
                    var20 = var8_double * var8_double / (var16 * var16 + 1.0);
                    var22 = var8_double * var8_double / (1.0 / (var16 * var16) + 1.0);
                    var24 = (int)Math.sqrt(var20);
                    var25 = (int)Math.sqrt(var22);
                    if (!(0.0 < var16)) {
                      if (var4_double > 0.0) {
                        var25 = -var25;
                        if (var31 != 0 &&
                          0.0 > var4_double) {
                          var25 = -var25;
                        }
                      }
                    } else {
                      if (0.0 > var4_double) {
                        var25 = -var25;
                      }
                    }
                    if (var24 > 0 &&
                      0.0 > var4_double) {
                      var24 = -var24;
                    }
                    var26 = 8;
                    var27 = (int)((double)(var24 * (4 + (var3.field_Y / 2 + var26))) / var8_double + (double)var3.field_lb);
                    var28 = (int)((double)(-(var3.field_Y / 2)) + ((double)var3.field_db + (double)(var25 * (var26 + (var3.field_Y / 2 + 4))) / var8_double));
                    var29_ref_mi = j.a(this.a(var3.field_u, true), var28, (byte) 18, this, -1, var27, 153);
                    this.b(52, var29_ref_mi);
                    var29_ref_mi.field_y = 20;
                    var29_ref_mi.field_u = var24;
                    var29_ref_mi.field_F = var25;
                    var29_ref_mi.field_w = true;
                    break;
                  }
                }
              }
              var3 = (ml) (ge.field_p.d(-18502));
              if (var31 == 0) {
                continue;
              }
            }
          }
          if (decompiledFrameCompleted1) {
            var3 = (ml) (ge.field_p.b(-102));
            while (var3 != null) {
              stackOut_105_0 = var3;
              stackIn_111_0 = stackOut_105_0;
              stackIn_106_0 = stackOut_105_0;
              if (var31 != 0) {
                break L9;
              }
              stackIn_107_0 = ~stackIn_106_0.field_jb;
              stackIn_107_1 = -36;
              if (stackIn_107_0 == stackIn_107_1) {
                var3.a(false, true);
              }
              var3.field_W = 0;
              var3.field_G = -1;
              var3 = (ml) (ge.field_p.d(-18502));
            }
          }
          stackIn_111_0 = this.field_Kb.b(12623);
          break;
        }
        var3_ref = (mi) (stackIn_111_0);
        while (var3_ref != null) {
          if (var31 != 0) {
            return;
          }
          if (var3_ref.field_I == 69) {
            var3_ref.field_y = 0;
            this.field_Gb = true;
          }
          if (var3_ref.field_I == 123) {
            n.field_d.a((byte) 41, this.field_i);
            var4Lifetime1 = (ml) (n.field_d.b(-96));
            while (var4Lifetime1 != null) {
              stackIn_150_0 = ~((ml) (var4Lifetime1)).field_jb;
              stackIn_150_1 = -34;
              if (stackIn_150_0 == stackIn_150_1 &&
                ~this.field_J == ~((ml) (var4Lifetime1)).field_u) {
                var5_double = (double)(-((ml) (var4Lifetime1)).field_lb + var3_ref.field_v << 4);
                var7_double = (double)((var3_ref.field_G - ((ml) (var4Lifetime1)).field_db << 4) + 256);
                var9 = 64.0;
                var11 = var5_double * (4.0 * var5_double) / (var9 * 2.0 * var9);
                var13 = var5_double;
                var15 = var5_double * (var5_double * 4.0) / (var9 * (2.0 * var9)) - var7_double;
                while (true) {
                  if (var11 != 0.0) {
                    stackIn_131_0 = $cfr$dcmpg(-(4.0 * var11 * var15) + var13 * var13, 0.0);
                    if (stackIn_131_0 < 0 &&
                      768.0 > var9) {
                      var9 = var9 + 8.0;
                      var11 = var5_double * (var5_double * 4.0) / (var9 * (2.0 * var9));
                      var13 = var5_double;
                      var15 = var5_double * (4.0 * var5_double) / (var9 * (var9 * 2.0)) - var7_double;
                      continue;
                    }
                  }
                  stackIn_131_0Lifetime1 = $cfr$dcmpl(var11, 0.0);
                  if (stackIn_131_0Lifetime1 == 0) {
                    break;
                  }
                  if (!(0.0 <= -(var15 * (4.0 * var11)) + var13 * var13)) {
                    break;
                  }
                  var17 = (-var13 + Math.sqrt(var13 * var13 - var15 * (4.0 * var11))) / (var11 * 2.0);
                  var19 = (-Math.sqrt(-(4.0 * var11 * var15) + var13 * var13) + -var13) / (2.0 * var11);
                  if (Math.abs(var17) > Math.abs(var19)) {
                    var17 = var19;
                  }
                  var21 = var9 * var9 / (var17 * var17 + 1.0);
                  var23 = var9 * var9 / (1.0 + 1.0 / (var17 * var17));
                  var25Lifetime1 = (int)Math.sqrt(var21);
                  var26Lifetime1 = (int)Math.sqrt(var23);
                  if (!(0.0 < var17)) {
                    if (var5_double > 0.0) {
                      var26Lifetime1 = -var26Lifetime1;
                    }
                  } else {
                    if (var5_double < 0.0) {
                      var26Lifetime1 = -var26Lifetime1;
                    }
                  }
                  if (var25Lifetime1 > 0 &&
                    0.0 > var5_double) {
                    var25Lifetime1 = -var25Lifetime1;
                  }
                  var27Lifetime1 = 8;
                  var28Lifetime1 = (int)((double)((ml) (var4Lifetime1)).field_lb + (double)(var25Lifetime1 * (4 + ((ml) (var4Lifetime1)).field_Y / 2 + var27Lifetime1)) / var9);
                  var29 = (int)((double)((ml) (var4Lifetime1)).field_db + (double)((var27Lifetime1 - (-(((ml) (var4Lifetime1)).field_Y / 2) - 4)) * var26Lifetime1) / var9 - (double)(((ml) (var4Lifetime1)).field_Y / 2));
                  var30 = j.a(this.a(((ml) (var4Lifetime1)).field_u, true), var29, (byte) -122, this, 148, var28Lifetime1, 125);
                  this.b(52, var30);
                  var30.field_y = 20;
                  if (this.field_x[((ml) (var4Lifetime1)).field_u] == 6) {
                    var30.field_y = var30.field_y - this.field_X[((ml) (var4Lifetime1)).field_u] / 4;
                  }
                  var30.field_u = var25Lifetime1;
                  var30.field_F = var26Lifetime1;
                  break;
                }
              }
              var4Lifetime1 = (ml) (n.field_d.d(-18502));
            }
          }
          stackIn_150_0Lifetime1 = 149;
          stackIn_150_1Lifetime1 = var3_ref.field_I;
          if (stackIn_150_0Lifetime1 == stackIn_150_1Lifetime1 &&
            var3_ref.field_y == 256) {
            var3_ref.field_y = 0;
          }
          boolean decompiledFrameRemainder1 = true;
          if (var3_ref.field_t != null &&
            var3_ref.field_t.field_u == this.field_J) {
            if (127 == var3_ref.field_I) {
              var33 = var3_ref.field_t;
              var38 = var33;
              if (var38 != null) {
                var5_ref_jd = new jd(new int[]{this.field_Q, this.field_jb, var33.field_lb, var33.field_db});
                var6_int = 0;
                while (var6_int < 5) {
                  var39 = j.a((ml) null, var38.field_db - var38.field_Y / 2, (byte) 51, this, 95, var38.field_lb, 116);
                  var8 = u.a(var5_ref_jd, param0 + 2147483579, 8192);
                  var39.field_u = of.a(-56, var8) >> 9;
                  var39.field_F = (j.a(var8, -109) * 3 >> 11) - 64;
                  this.b(52, var39);
                  var6_int++;
                }
                var6_intLifetime1 = 0;
                while (5 > var6_intLifetime1) {
                  var40 = j.a((ml) null, -(var38.field_Y / 2) + var38.field_db, (byte) -97, this, 95, var38.field_lb, 122);
                  var8Lifetime1 = u.a(var5_ref_jd, -2147483648, 8192);
                  var40.field_u = of.a(-8, var8Lifetime1) >> 9;
                  var40.field_F = -64 + (3 * j.a(var8Lifetime1, -113) >> 11);
                  this.b(param0 ^ 113, var40);
                  var6_intLifetime1++;
                }
                this.a(var38, 0);
                var38.field_ib = 0;
                var38.d(this.field_J, param0 + 51);
              }
            }
            if (var3_ref.field_I == 148) {
              var3_ref.field_y = var3_ref.field_y + 5;
              this.field_Gb = true;
            }
            if (var3_ref.field_I == 29 &&
              var3_ref.field_y > 0) {
              var3_ref.field_H = var3_ref.field_H + 1;
              this.field_Gb = true;
            }
            if (var3_ref.field_I == 19 ||
              var3_ref.field_I == 62) {
              this.field_Gb = true;
              var3_ref.field_y = var3_ref.field_y + 1;
            }
            if (var3_ref.field_I != 47 &&
              var3_ref.field_I != 71) {
              if (var3_ref.field_I != 142) {
                if (var3_ref.field_I == 36) {
                  var3_ref.field_y = var3_ref.field_y + 1;
                  this.field_Gb = true;
                } else {
                  if (134 != var3_ref.field_I) {
                    if (var3_ref.field_I != 68) {
                      if (var3_ref.field_I == 138) {
                        var3_ref.field_y = 0;
                        this.field_Gb = true;
                      } else {
                        if (var3_ref.field_I == 15) {
                          var3_ref.field_H = var3_ref.field_H + 1;
                          var3_ref.field_y = 0;
                          this.field_Gb = true;
                          if (!(var3_ref.field_H < 5)) {
                            var3_ref.f(param0 - 69);
                          }
                        } else {
                          if (var3_ref.field_I != 69 &&
                            var3_ref.field_I != 107) {
                            if (var3_ref.field_I == 148 ||
                              70 == var3_ref.field_I ||
                              var3_ref.field_I == 55 ||
                              111 == var3_ref.field_I) {
                              var3_ref.field_H = var3_ref.field_H + 1;
                              var3_ref.field_y = 0;
                              this.field_Gb = true;
                              if (!(var3_ref.field_H < 5)) {
                                var3_ref.f(param0 - 69);
                              }
                            } else {
                              if ((var3_ref.field_I == 157 ||
                                var3_ref.field_I == 168)) {
                                this.field_Gb = true;
                                var3_ref.field_H = var3_ref.field_H + 1;
                                if (!(3 > var3_ref.field_H)) {
                                  var3_ref.field_y = -1;
                                  var3_ref.a(this.field_jb, (byte) -67, this.field_t, this.field_mb);
                                  var3_ref.f(param0 ^ 69);
                                }
                              }
                            }
                          } else {
                            var3_ref.field_H = var3_ref.field_H + 1;
                            this.field_Gb = true;
                            var3_ref.field_y = 0;
                            if (!(var3_ref.field_H < 3)) {
                              var3_ref.f(0);
                            }
                          }
                        }
                      }
                    } else {
                      this.field_Gb = true;
                      var3_ref.field_H = var3_ref.field_H + 1;
                      var3_ref.field_y = 0;
                      if (!(var3_ref.field_H < 5)) {
                        var3_ref.f(0);
                      }
                    }
                  } else {
                    var3_ref.field_y = var3_ref.field_y + 1;
                    this.field_Gb = true;
                  }
                }
              } else {
                this.field_Gb = true;
                var3_ref.field_y = var3_ref.field_y + 1;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              var3_ref.field_y = var3_ref.field_y + 1;
              this.field_Gb = true;
              if (var3_ref.field_t != null &&
                var3_ref.field_t.field_jb == 5) {
                var3_ref.field_y = 301;
              }
            }
          }
          if (var3_ref.field_I == 16) {
            var3_ref.field_H = var3_ref.field_H + 1;
            this.field_Gb = true;
            if (var3_ref.field_H > this.field_q * 5) {
              var3_ref.f(0);
            }
          }
          if (117 == var3_ref.field_I) {
            this.field_Gb = true;
            var3_ref.field_H = var3_ref.field_H + 1;
            if (var3_ref.field_H > this.field_q * 20) {
              var3_ref.a(0, 16, 32, 8);
              var3_ref.f(param0 ^ 69);
            }
          }
          if (var3_ref.field_I == 127) {
            var3_ref.field_t.field_D = true;
          }
          if (var3_ref.field_I == 165) {
            this.field_Gb = true;
            var3_ref.field_H = var3_ref.field_H - 1;
            if (var3_ref.field_H <= 0) {
              var41 = aj.a((ml) null, var3_ref.field_G, false, 163, this, var3_ref.field_v);
              this.b(52, var41);
              var3_ref.a(50, 100, 100, param0 ^ 77);
              var3_ref.f(0);
              var5 = 0;
              while (var5 < 5) {
                var6 = j.a(var3_ref.field_t, var3_ref.field_G, (byte) -109, this, 117, var3_ref.field_v, 159);
                var7 = var5 * 8192 / 5;
                var6.field_u = of.a(-93, var7) >> 10;
                var6.field_F = (j.a(var7, -112) >> 11) - 64;
                this.b(param0 ^ 113, var6);
                var5++;
              }
            }
          }
          var3_ref = (mi) (this.field_Kb.a(0));
        }
        this.p((byte) 123);
        return;
    }

    private final void i(int param0) {
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int var3 = 0;
        ml var5 = null;
        int var6 = 0;
        ml var6_ref_ml = null;
        ml var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jd var12 = null;
        mi var13 = null;
        mi var14 = null;
        mi var15 = null;
        mi var16 = null;
        mi var17 = null;
        mi var18 = null;
        mi var19 = null;
        int stackIn_68_0Lifetime1;
        int stackIn_68_1Lifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_mb = -1000;
        if (param0 != -17837) {
          return;
        }
        var12 = new jd(new int[]{this.field_Q, this.field_jb});
        var3 = uj.a(var12, 2, (byte) -68);
        if (var3 != 0) {
          var3 = -128 + this.field_y - uj.a(var12, (this.field_jb - this.l(4)) / this.field_q * 128 + 1, (byte) -57);
          if (!(var3 >= 128)) {
            var3 = 128 + uj.a(var12, -256 + this.field_y, (byte) -32);
            if (var11 != 0) {
              var3 = 128 + uj.a(var12, 128 * ((this.field_jb - this.l(4)) / this.field_q) + 1, (byte) -66);
              if ((-128 + this.field_y) < var3) {
                var3 = uj.a(var12, -256 + this.field_y, (byte) -31) + 128;
              }
            }
          }
        } else {
          var3 = 128 + uj.a(var12, 128 * ((this.field_jb - this.l(4)) / this.field_q) + 1, (byte) -66);
          if ((-128 + this.field_y) < var3) {
            var3 = uj.a(var12, -256 + this.field_y, (byte) -31) + 128;
          }
        }
        boolean decompiledFrameRemainder6 = true;
        var5 = this.a(this.field_J, true);
        var6 = this.field_O;
        if (var6 != 3 ||
          var11 != 0) {
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          if ((0 != var6 ||
            var11 != 0) &&
            (decompiledFrameRemainder0 = (2 != var6 ||
            var11 != 0)) &&
            (decompiledFrameRemainder1 = (5 != var6 ||
            var11 != 0)) &&
            (decompiledFrameRemainder2 = (var6 != 1 ||
            var11 != 0)) &&
            (decompiledFrameRemainder3 = (4 != var6)) &&
            (decompiledFrameRemainder4 = (var6 != 6)) &&
            (decompiledFrameRemainder5 = (7 != var6 ||
            var11 != 0))) {
            decompiledFrameRemainder7 = (var6 == 8);
            if ((decompiledFrameRemainder7) &&
              (var11 == 0)) {
              var19 = j.a(var5, this.field_H, (byte) 19, this, 0, var3, 74);
              var19.field_y = 0 - this.field_jb;
              var19.field_F = -512;
              var19.field_u = 0;
              if (var19.field_y < -100) {
                var19.field_y = -100;
              }
              this.b(52, var19);
              this.field_mb = -1;
              var6 = 0;
              var7 = (ml) (this.field_i.b(param0 ^ -29924));
              while (var7 != null) {
                stackIn_68_0 = ~var7.field_jb;
                stackIn_68_1 = -12;
                if (stackIn_68_0 == stackIn_68_1) {
                  var8 = var7.field_X >> 4;
                  var9 = var7.field_R >> 4;
                  var10 = Math.abs(-var3 + var8) + Math.abs(-this.field_H + var8);
                  if (this.field_mb == -1 ||
                    var10 < var6) {
                    var6 = var10;
                    this.field_mb = var8;
                    this.field_t = var9;
                  }
                }
                if (var7.t(94) &&
                  var7.field_jb != 20 &&
                  this.field_jb > (20 * this.field_q) &&
                  var7 == var5) {
                  this.field_t = var7.field_R >> 4;
                  this.field_mb = var7.field_X >> 4;
                }
                var7 = (ml) (this.field_i.a(0));
              }
              stackIn_68_0Lifetime1 = -1;
              stackIn_68_1Lifetime1 = this.field_mb;
              decompiledFrameRemainder6 = (stackIn_68_0Lifetime1 == stackIn_68_1Lifetime1);
              if (decompiledFrameRemainder6) {
                this.field_mb = 128 + uj.a(var12, this.field_y - 256, (byte) -121);
                this.field_t = 128 + uj.a(var12, this.field_H - 128, (byte) -32);
                decompiledFrameRemainder7 = false;
              }
            }
          }
          if (((decompiledFrameRemainder7) && (decompiledFrameRemainder6) && (decompiledFrameRemainder5) && (decompiledFrameRemainder4) && (decompiledFrameRemainder3) && (decompiledFrameRemainder2) && (decompiledFrameRemainder1) && (decompiledFrameRemainder0)) &&
            (decompiledFrameRemainder6 = (this.field_jb % 5 == 0))) {
            var13 = j.a(var5, this.field_H, (byte) 82, this, 22, var3, 19);
            var13.field_w = true;
            this.b(52, var13);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if (((decompiledFrameRemainder7) && (decompiledFrameRemainder6) && (decompiledFrameRemainder5) && (decompiledFrameRemainder4) && (decompiledFrameRemainder3) && (decompiledFrameRemainder2) && (decompiledFrameRemainder1)) &&
            (decompiledFrameRemainder7 = (0 == this.field_jb % 2))) {
            var14 = j.a(var5, this.field_H, (byte) -97, this, 35, var3, 29);
            var14.field_w = true;
            this.b(52, var14);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            var6 = this.field_H / 2;
            var7_int = gf.a((480 + var6) * 32 / 4, -266740663);
            var8Lifetime2 = -96 + 192 * (1 & var3);
            var9Lifetime1 = 1;
            var10Lifetime1 = 0;
            while (true) {
              if (var10Lifetime1 < 7) {
                var9Lifetime1 = -var9Lifetime1;
                var15 = j.a(var5, -544, (byte) 99, this, 61, -(var8Lifetime2 * var9Lifetime1 * var7_int / 16) + (-3 + var10Lifetime1) * 48 + var3, 50);
                var15.field_F = 0;
                var15.field_u = var9Lifetime1 * var8Lifetime2;
                var15.field_w = true;
                this.b(52, var15);
                var10Lifetime1++;
                if (var11 == 0) {
                  continue;
                }
              } else {
                this.field_t = var6;
                this.field_mb = var3;
              }
              break;
            }
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            var6 = this.field_H / 2;
            var7_intLifetime1 = gf.a((15360 + 32 * var6) / 4, param0 ^ 266757658);
            var8Lifetime1 = (var3 & 1) * 192 - 96;
            var16 = j.a(var5, -544, (byte) -117, this, 58, var3 - var7_intLifetime1 * var8Lifetime1 / 16, 49);
            var16.field_w = true;
            var16.field_F = 0;
            var16.field_u = var8Lifetime1;
            this.b(52, var16);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            var17 = j.a(var5, -480, (byte) -93, this, 46, var3, 36);
            var17.field_w = true;
            var17.field_F = 0;
            var17.field_u = 0;
            this.b(52, var17);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if (((decompiledFrameRemainder7) && (decompiledFrameRemainder6) && (decompiledFrameRemainder5)) &&
            (decompiledFrameRemainder7 = (this.field_jb % 2 == 0))) {
            var18 = j.a(var5, -480, (byte) -125, this, 73, var3, 60);
            var18.field_w = true;
            this.b(param0 ^ -17817, var18);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if ((decompiledFrameRemainder7) && ((decompiledFrameRemainder6) &&
            (decompiledFrameRemainder6 = !(this.c((byte) -119, this.field_J) >= 4)))) {
            var6_ref_ml = new ml(36, var3, -480, this.h(param0 ^ 17881), this, var5);
            this.a((byte) -117, var6_ref_ml);
            this.field_ob[this.field_J] = this.field_ob[this.field_J] + 1;
          }
        }

    }

    final void b(byte param0, int param1) {
        int var4;
        ml var5;
        int var6;
        ml var7;
        int stackIn_20_0 = 0;
        int var4Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_J >= 0 &&
          this.field_ib[this.field_J] < this.field_tb) {
          this.field_ib[this.field_J] = this.field_tb;
        }
        var7 = this.a(this.field_J, true);
        if (var7 != null &&
          128 + this.field_H <= var7.field_db) {
          var4 = var7.field_ib / 2;
          if (var4 < 25) {
            var4 = 25;
          }
          var7.field_x = var7.field_x + var4;
          var7.field_z = true;
        }
        var4Lifetime1 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (this.field_q <= var4Lifetime1))) {
          stackIn_20_0 = 1 << var4Lifetime1 & param1;
          if (var6 == 0) {
            if (stackIn_20_0 != 0) {
              var5 = this.a(var4Lifetime1, true);
              if (var5 != null) {
                var5.field_ib = 0;
                var5.field_x = 1;
              }
            }
            var4Lifetime1++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_20_0 = param0;
        }
        if (stackIn_20_0 != 88) {
          this.b((byte) -37, -9);
        }
        return;
    }

    final boolean a(ml param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        ll var6 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var6 = go.field_j[29];
          param1 = param1 - var6.field_k;
          if (param3 != -5) {
            discarded$1 = this.c(-47, -85, 123);
          }
          param2 = param2 - var6.field_g / 2;
          if (var6.field_j + param2 >= 0 &&
            var6.field_j + (param2 + var6.field_h) <= this.field_y &&
            param1 + var6.field_f >= 0) {
            if (param1 + var6.field_k >= -5 + this.field_H) {
              return false;
            }
            stackIn_14_0 = !(this.b(param1, param3 + 7, param2, var6.b())) || !(jo.field_b);
            return stackIn_14_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("nf.OB(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, ll param2, int param3, ll param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var12Lifetime1;
        int var12Lifetime2;
        try {
          if (param4 == null) {
            return;
          }
          param0 = param0 + param2.field_f;
          param3 = param3 + param2.field_j;
          var6_int = param0 * this.field_y + param3;
          var7 = 0;
          if (param1 < 103) {
            this.b(-7, -107);
          }
          var8 = param2.field_c;
          var9 = param2.field_h;
          var10 = this.field_y - var9;
          var11 = 0;
          if (param0 < 0) {
            var12 = 0 - param0;
            var6_int = var6_int + this.field_y * var12;
            var7 = var7 + var12 * var9;
            var8 = var8 - var12;
            param0 = 0;
          }
          if (0 > param3) {
            var12Lifetime1 = 0 - param3;
            var6_int = var6_int + var12Lifetime1;
            param3 = 0;
            var10 = var10 + var12Lifetime1;
            var7 = var7 + var12Lifetime1;
            var9 = var9 - var12Lifetime1;
            var11 = var11 + var12Lifetime1;
          }
          if ((param0 + var8) > (-1 + this.field_H)) {
            var8 = var8 - (1 - this.field_H + (var8 + param0));
          }
          if (-1 + this.field_y < var9 + param3) {
            var12Lifetime2 = var9 + param3 + (-this.field_y + 1);
            var10 = var10 + var12Lifetime2;
            var9 = var9 - var12Lifetime2;
            var11 = var11 + var12Lifetime2;
          }
          if (var9 > 0 &&
            var8 > 0) {
            vn.a(param2.field_m, var9, var7, 111, var6_int, var11, var8, param4.field_m, var10, true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("nf.HC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int d(int param0, int param1) {
        int var3 = -119 % ((param0 + 17) / 56);
        return this.field_E[param1];
    }

    final void a(int param0, byte param1, int param2) {
        boolean discarded$0 = false;
        if (param1 < 18) {
          discarded$0 = this.k((byte) 46);
        }
        this.field_J = param0;
        this.field_ub = true;
        this.a(9, param2);
    }

    final boolean b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        ml var6;
        int var7;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        ml var6Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_ub) {
          throw new IllegalStateException();
        }
        boolean decompiledFrameCompleted0 = true;
        if (this.field_d) {
          var3 = 0;
          var4 = -1;
          var5 = 0;
          while (true) {
            if (var5 < this.field_q) {
              var6 = this.a(var5, true);
              if (var7 == 0) {
                if (var6 != null) {
                  var3 = var3 | (var5 & 1) + 1;
                  var4 = var5;
                }
                var5++;
                continue;
              }
            } else {
              if (1 < tm.a(var3, (byte) -68)) {
                if (var7 == 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                break;
              }
              this.a(var4, (byte) 98, param0);
            }
            return true;
          }
        }
        if (decompiledFrameCompleted0) {
          var3Lifetime2 = -1;
          var4Lifetime1 = 0;
          var5Lifetime1 = 0;
          while (true) {
            if (var5Lifetime1 < this.field_q) {
              var6Lifetime1 = this.a(var5Lifetime1, true);
              if (var7 == 0) {
                if (var6Lifetime1 != null) {
                  var4Lifetime1++;
                  var3Lifetime2 = var5Lifetime1;
                }
                var5Lifetime1++;
                continue;
              }
            } else {
              if (1 < var4Lifetime1) {
                break;
              }
              this.a(var3Lifetime2, (byte) 46, param0);
            }
            return true;
          }
        }
        var3Lifetime1 = 119 / ((-1 - param1) / 56);
        return false;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_Db.b(new ge(param0, param7, param4, param5, param8, param6, param1, param3), -1);
        int var10 = -97 % ((param2 + 41) / 40);
    }

    final boolean d(byte param0) {
        int[] discarded$1 = null;
        boolean stackIn_7_0 = false;
        if (param0 != -128) {
          discarded$1 = this.a(-37, (jd) null);
        }
        stackIn_7_0 = (this.j((byte) -94)) || !(this.field_Db.b(true));
        return stackIn_7_0;
    }

    final int b(boolean param0) {
        if (!param0) {
          this.b(20, true, -2);
        }
        return this.field_w;
    }

    final int e(byte param0) {
        int var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          this.a(false, (ol) null, 106);
          if (!this.d((byte) -128) &&
            !this.field_zb &&
            var3 == 0) {
            if (param0 != 72) {
              this.field_b = (int[]) null;
            }
            return var2;
          }
          var2++;
          do {
            if (4096 >= var2) {
              continue L0;
            }
          } while (var3 != 0);
          break;
        }
        throw new qg();
    }

    final void b(int param0, mi param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (!param1.k(param0 - 149)) {
            this.field_Gb = true;
            decompiledFrameRemainder0 = !(!ArcanistsMulti.field_G);
          }
          if ((decompiledFrameRemainder0) &&
            (this.field_l)) {
            return;
          }
          this.field_kb.b(param1, -1);
          if (param0 != 52) {
            this.field_Z = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("nf.AD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean a(int param0, ml param1, int param2) {
        int stackIn_96_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_105_0 = 0;
        boolean stackIn_114_0 = false;
        boolean stackIn_117_0 = false;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (120 == param0 &&
            param1.field_jb == 11) {
            return true;
          }
          if (param0 == 121 &&
            4 == param1.field_jb) {
            return true;
          }
          if (param0 == 122 &&
            param1.field_jb == 5) {
            return true;
          }
          if (param0 == 123 &&
            param1.field_jb == 5) {
            return true;
          }
          if (124 == param0 &&
            param1.field_jb == 1) {
            return true;
          }
          if (125 == param0 &&
            param1.field_jb == 1) {
            return true;
          }
          if (param0 == 137 &&
            2 == param1.field_jb) {
            return true;
          }
          if (param0 == 126 &&
            3 == param1.field_jb) {
            return true;
          }
          if (127 == param0 &&
            param1.field_jb == 13) {
            return true;
          }
          if (param0 == 128 &&
            param1.field_jb == 15) {
            return true;
          }
          if (param0 == 129 &&
            14 == param1.field_jb) {
            return true;
          }
          if (param0 == 136 &&
            param1.field_jb == 26) {
            return true;
          }
          if (param0 == 130 &&
            7 == param1.field_jb) {
            return true;
          }
          if (param0 == 131 &&
            8 == param1.field_jb) {
            return true;
          }
          if (138 == param0 &&
            param1.field_jb == 9) {
            return true;
          }
          if (param0 == 132 &&
            10 == param1.field_jb) {
            return true;
          }
          if (param0 == 154 &&
            param1.field_jb == 37) {
            return true;
          }
          if (param0 == 155 &&
            param1.field_jb == 39) {
            return true;
          }
          if (param0 == 149 &&
            param1.field_jb == 31) {
            return true;
          }
          if (param0 == 148 &&
            33 == param1.field_jb) {
            return true;
          }
          if (133 == param0 &&
            param1.field_jb == 25) {
            return true;
          }
          if (62 == param0 &&
            10 == param1.field_jb) {
            stackIn_96_0 = 1;
            if (param1.field_U) {
              stackIn_97_1 = 0;
            } else {
              stackIn_97_1 = 1;
            }
            if (stackIn_96_0 != stackIn_97_1) {
              return true;
            }
          }
          if (param0 == 62 &&
            param1.field_jb == 17) {
            stackIn_105_0 = (param1.field_U) ? 0 : 1;
            if (stackIn_105_0 != 1) {
              return true;
            }
          }
          if (param2 != 1) {
            this.b(40, true);
          }
          if (135 == param0) {
            stackIn_114_0 = this.c(param1.field_u, 72, 0);
            return stackIn_114_0;
          }
          if (param0 != 134) {
            return false;
          }
          stackIn_117_0 = this.c(param1.field_u, 41, 0);
          return stackIn_117_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_122_0 = var4;
          stackIn_122_1 = new StringBuilder().append("nf.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_123_2 = "null";
          } else {
            stackIn_123_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_122_0), ((StringBuilder) (Object) stackIn_122_1).append(stackIn_123_2).append(',').append(param2).append(')').toString());
        }
    }

    final vn l(byte param0) {
        if (param0 != 48) {
          this.field_t = -21;
        }
        return this.field_r;
    }

    final int c(byte param0, int param1) {
        int[] discarded$1 = null;
        int var3;
        ml var4;
        int var5;
        int stackIn_11_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        gh.field_D.a((byte) 102, this.field_i);
        var3 = 0;
        if (param0 >= -101) {
          discarded$1 = this.c((jd) null, -100);
        }
        var4 = (ml) (gh.field_D.b(-107));
        while (var4 != null) {
          stackIn_11_0 = 12;
          if (var5 != 0) {
            return stackIn_11_0;
          }
          if (stackIn_11_0 != var4.field_jb &&
            var4.field_s != null &&
            param1 == var4.field_u) {
            var3++;
          }
          var4 = (ml) (gh.field_D.d(-18502));
        }
        return var3;
    }

    final void c(boolean param0) {
        int[] discarded$0 = null;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int[] array$5 = null;
        int[] array$6 = null;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_131_0 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        qb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        jd var24 = null;
        ml var25 = null;
        ml var26 = null;
        ml var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_16_0Lifetime1;
        int stackIn_16_1Lifetime1;
        int stackIn_27_0Lifetime1;
        int stackIn_27_1Lifetime1;
        int stackIn_39_0Lifetime1;
        int stackIn_49_0Lifetime1;
        int stackIn_49_1Lifetime1;
        int stackIn_61_0Lifetime1;
        int stackIn_61_1Lifetime1;
        int stackIn_67_0Lifetime1;
        int stackIn_67_1Lifetime1;
        int stackIn_98_0Lifetime1;
        int stackIn_98_1Lifetime1;
        int stackIn_109_0Lifetime1;
        int stackIn_109_1Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var13Lifetime2;
        int var14Lifetime2;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        var24 = new jd(new int[]{this.field_Q, -2});
        if (!param0) {
          discarded$0 = this.d(-68, (jd) null);
        }
        boolean decompiledFrameRemainder3 = true;
        var3 = 0;
        var4 = this.field_q;
        var7 = new qb(36, 36);
        var7.a();
        de.i(18, 18, 16, 16777215);
        if (this.field_d) {
          var8 = 0;
          var9 = this.field_q;
          L4: while (true) {
            var29 = new int[var4];
            var21 = var29;
            var6 = var21;
            var3 = 0;
            var28 = new int[var4];
            var20 = var28;
            var5 = var20;
            var12 = 0;
            L5: while (true) {
              stackIn_6_0 = ~var4;
              L6: while (true) {
                if (stackIn_6_0 < ~var12) {
                  var13 = this.field_y / 2 * (1 + var12) / (1 + var4);
                  stackIn_33_0 = var12 & 1;
                  if (var16 == 0) {
                    boolean decompiledFrameRemainder1 = true;
                    if (stackIn_33_0 == 0) {
                      var14 = this.field_H - 64;
                      while (kk.a(var7, var13 - 18, var14 - 34, this.field_V, 0, 0)) {
                        stackIn_16_0 = var14;
                        stackIn_16_1 = 64;
                        if (stackIn_16_0 >= stackIn_16_1) {
                          var14--;
                          continue;
                        }
                        break;
                      }
                      stackIn_16_0Lifetime1 = ~(this.field_H - 64);
                      stackIn_16_1Lifetime1 = ~var14;
                      if (stackIn_16_0Lifetime1 != stackIn_16_1Lifetime1 &&
                        var14 > 64) {
                        var28[var3] = var13;
                        var29[var3] = var14;
                        var3++;
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var14 = 64;
                      while (true) {
                        if (!kk.a(var7, var13 - 18, var14 - 33, this.field_V, 0, 0)) {
                          stackIn_27_0 = ~(this.field_H - 64);
                          stackIn_27_1 = ~var14;
                          if (stackIn_27_0 <= stackIn_27_1) {
                            var14++;
                            continue;
                          }
                        }
                        stackIn_27_0Lifetime1 = ~(-64 + this.field_H);
                        stackIn_27_1Lifetime1 = ~var14;
                        if (stackIn_27_0Lifetime1 >= stackIn_27_1Lifetime1) {
                          break;
                        }
                        if (var14 == 64) {
                          break;
                        }
                        var28[var3] = var13;
                        var29[var3] = var14;
                        var3++;
                        break;
                      }
                    }
                    var12++;
                    continue L5;
                  }
                } else {
                  stackIn_33_0 = ~this.field_q;
                }
                if (stackIn_33_0 < ~var3) {
                  var4 += 4;
                  if (var4 < 100) {
                    continue L4;
                  }
                }
                while (true) {
                  var30 = new int[var9];
                  var22 = var30;
                  var10_ref_int__ = var22;
                  var8 = 0;
                  var31 = new int[var9];
                  var23 = var31;
                  var17 = var23;
                  var11 = var17;
                  stackIn_6_0 = 0;
                  if (var16 != 0) {
                    continue L6;
                  }
                  var12 = stackIn_6_0;
                  while (true) {
                    stackIn_39_0 = var12;
                    if (stackIn_39_0 < var9) {
                      var13Lifetime2 = this.field_y / 2 + (var12 + 1) * (this.field_y / 2) / (1 + var9);
                      stackIn_67_0 = ~(var12 & 1);
                      stackIn_67_1 = -1;
                      boolean decompiledFrameRemainder2 = true;
                      if (stackIn_67_0 == stackIn_67_1) {
                        var14Lifetime2 = -64 + this.field_H;
                        while (kk.a(var7, var13Lifetime2 - 18, var14Lifetime2 - 34, this.field_V, 0, 0)) {
                          stackIn_49_0 = -65;
                          stackIn_49_1 = ~var14Lifetime2;
                          if (stackIn_49_0 >= stackIn_49_1) {
                            var14Lifetime2--;
                            continue;
                          }
                          break;
                        }
                        stackIn_49_0Lifetime1 = ~(-64 + this.field_H);
                        stackIn_49_1Lifetime1 = ~var14Lifetime2;
                        if (stackIn_49_0Lifetime1 != stackIn_49_1Lifetime1 &&
                          64 < var14Lifetime2) {
                          var30[var8] = var13Lifetime2;
                          var31[var8] = var14Lifetime2;
                          var8++;
                        }
                        decompiledFrameRemainder2 = false;
                      }
                      else {
                        var14Lifetime2 = 64;
                        while (true) {
                          if (!kk.a(var7, var13Lifetime2 - 18, var14Lifetime2 - 33, this.field_V, 0, 0)) {
                            stackIn_61_0 = ~(this.field_H - 64);
                            stackIn_61_1 = ~var14Lifetime2;
                            if (stackIn_61_0 <= stackIn_61_1) {
                              var14Lifetime2++;
                              continue;
                            }
                          }
                          stackIn_61_0Lifetime1 = this.field_H - 64;
                          stackIn_61_1Lifetime1 = var14Lifetime2;
                          if (stackIn_61_0Lifetime1 <= stackIn_61_1Lifetime1) {
                            break;
                          }
                          if (var14Lifetime2 == 64) {
                            break;
                          }
                          var30[var8] = var13Lifetime2;
                          var31[var8] = var14Lifetime2;
                          var8++;
                          break;
                        }
                      }
                      var12++;
                      continue;
                    }
                    break;
                  }
                  stackIn_67_0Lifetime1 = ~var8;
                  stackIn_67_1Lifetime1 = ~this.field_q;
                  if (stackIn_67_0Lifetime1 > stackIn_67_1Lifetime1 ||
                    var16 != 0) {
                    var9 += 4;
                    if (100 > var9) {
                      continue;
                    }
                  }
                  break;
                }
                break;
              }
              break;
            }
            break;
          }
          this.field_nb = 0;
          stackIn_39_0Lifetime1 = 0;
          var12Lifetime1 = stackIn_39_0Lifetime1;
          while (this.field_q > var12Lifetime1) {
            var13Lifetime1 = 0;
            stackIn_131_0 = -1;
            if (stackIn_131_0 == ~(1 & var12Lifetime1)) {
              if (0 != var3) {
                var14Lifetime1 = uj.a(var24, var3, (byte) -110);
                fieldTemp$1 = this.field_nb;
                this.field_nb = this.field_nb + 1;
                this.a((byte) -123, new ml(var13Lifetime1, var28[var14Lifetime1], var29[var14Lifetime1], fieldTemp$1, this, var12Lifetime1));
                var3--;
                var5[var14Lifetime1] = var28[var3];
                var6[var14Lifetime1] = var29[var3];
              } else {
                var14Lifetime1 = uj.a(var24, var12Lifetime1, (byte) -123);
                var25 = this.a(var14Lifetime1, true);
                fieldTemp$2 = this.field_nb;
                this.field_nb = this.field_nb + 1;
                this.a((byte) -124, new ml(var13Lifetime1, var25.field_lb, -32 + var25.field_db, fieldTemp$2, this, var12Lifetime1));
              }
            } else if (var8 == 0) {
              var14Lifetime1 = uj.a(var24, var12Lifetime1, (byte) -81);
              var26 = this.a(var14Lifetime1, true);
              fieldTemp$3 = this.field_nb;
              this.field_nb = this.field_nb + 1;
              this.a((byte) -122, new ml(var13Lifetime1, var26.field_lb, var26.field_db - 32, fieldTemp$3, this, var12Lifetime1));
            } else {
              var14Lifetime1 = uj.a(var24, var8, (byte) -53);
              var8--;
              fieldTemp$4 = this.field_nb;
              this.field_nb = this.field_nb + 1;
              this.a((byte) -116, new ml(var13Lifetime1, var30[var14Lifetime1], var31[var14Lifetime1], fieldTemp$4, this, var12Lifetime1));
              var10_ref_int__[var14Lifetime1] = var30[var8];
              var17[var14Lifetime1] = var31[var8];
            }
            var12Lifetime1++;
          }
          decompiledFrameRemainder3 = false;
        }
        else {
          L41: while (true) {
            array$5 = new int[var4];
            var19 = array$5;
            var6 = array$5;
            array$6 = new int[var4];
            var18 = array$6;
            var5 = array$6;
            var3 = 0;
            var8 = 0;
            L42: while (true) {
              stackIn_88_0 = ~var4;
              do {
                if (stackIn_88_0 < ~var8) {
                  var9 = this.field_y * (var8 + 1) / (1 + var4);
                  stackIn_115_0 = 0;
                  stackIn_115_1 = var8 & 1;
                  if (var16 == 0) {
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_115_0 == stackIn_115_1) {
                      var10 = this.field_H - 64;
                      while (kk.a(var7, -18 + var9, var10 - 34, this.field_V, 0, 0)) {
                        stackIn_98_0 = 64;
                        stackIn_98_1 = var10;
                        if (stackIn_98_0 <= stackIn_98_1) {
                          var10--;
                          continue;
                        }
                        break;
                      }
                      stackIn_98_0Lifetime1 = var10;
                      stackIn_98_1Lifetime1 = -64 + this.field_H;
                      if (stackIn_98_0Lifetime1 != stackIn_98_1Lifetime1 &&
                        64 < var10) {
                        var18[var3] = var9;
                        var19[var3] = var10;
                        var3++;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var10 = 64;
                      while (true) {
                        if (!kk.a(var7, -18 + var9, 1 + var10 - 34, this.field_V, 0, 0)) {
                          stackIn_109_0 = ~var10;
                          stackIn_109_1 = ~(-64 + this.field_H);
                          if (stackIn_109_0 >= stackIn_109_1) {
                            var10++;
                            continue;
                          }
                        }
                        stackIn_109_0Lifetime1 = this.field_H - 64;
                        stackIn_109_1Lifetime1 = var10;
                        if (stackIn_109_0Lifetime1 <= stackIn_109_1Lifetime1) {
                          break;
                        }
                        if (var10 == 64) {
                          break;
                        }
                        var18[var3] = var9;
                        var19[var3] = var10;
                        var3++;
                        break;
                      }
                    }
                    var8++;
                    continue L42;
                  }
                } else {
                  stackIn_115_0 = ~var3;
                  stackIn_115_1 = ~this.field_q;
                }
                if (stackIn_115_0 > stackIn_115_1 ||
                  var16 != 0) {
                  var4 += 4;
                  if (var4 < 100) {
                    continue L41;
                  }
                }
                this.field_nb = 0;
                stackIn_88_0 = 0;
              } while (var16 != 0);
              break;
            }
            break;
          }
          var8 = stackIn_88_0;
          while (this.field_q > var8) {
            var9 = 0;
            stackIn_131_0 = -10;
            if (stackIn_131_0 == ~this.field_x[var8]) {
              var9 = 27;
            }
            if (var3 != 0) {
              var10 = uj.a(var24, var3, (byte) -79);
              fieldTemp$7 = this.field_nb;
              this.field_nb = this.field_nb + 1;
              this.a((byte) -127, new ml(var9, var18[var10], var19[var10], fieldTemp$7, this, var8));
              var3--;
              var18[var10] = var18[var3];
              var19[var10] = var19[var3];
            } else {
              var10 = uj.a(var24, var8, (byte) -124);
              var27 = this.a(var10, true);
              fieldTemp$8 = this.field_nb;
              this.field_nb = this.field_nb + 1;
              this.a((byte) -118, new ml(var9, var27.field_lb, -32 + var27.field_db, fieldTemp$8, this, var8));
            }
            var8++;
          }
        }
        stackIn_131_0 = this.e((byte) 72);
    }

    final int[] e(int param0, int param1) {
        if (param0 != 3) {
          field_P = (hn) null;
        }
        return this.field_v[param1];
    }

    final void a(boolean param0, ol param1, int param2) {
        int[] discarded$0 = null;
        int stackIn_4_0 = 0;
        mi stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        mi stackOut_9_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        mi var5 = null;
        ml var5_ref = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          stackIn_4_0 = (this.j((byte) -104)) ? 0 : 1;
          var4_int = stackIn_4_0;
          this.field_zb = false;
          this.field_Gb = false;
          this.field_Mb = false;
          if (var4_int != 0) {
            this.a(-109, param1);
          }
          var5 = (mi) (this.field_Kb.b(12623));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var5 == null))) {
            var5.a(this.field_jb, (byte) -47, this.field_t, this.field_mb);
            stackOut_9_0 = var5;
            stackIn_14_0 = stackOut_9_0;
            stackIn_10_0 = stackOut_9_0;
            if (var6 == 0) {
              if (((mi) (Object) stackIn_10_0).b((byte) -32)) {
                this.field_Gb = this.field_Gb | var5.h(-139);
              }
              var5 = (mi) (this.field_Kb.a(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            u.field_f.a((byte) 120, this.field_i);
            stackIn_14_0 = u.field_f.b(-67);
          }
          var5_ref = (ml) (stackIn_14_0);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5_ref == null))) {
            stackIn_30_0 = var5_ref.field_M;
            if (var6 == 0) {
              if (stackIn_30_0 != 0) {
                this.field_zb = true;
              }
              if (var5_ref.field_z &&
                var5_ref.field_x == 0) {
                this.field_zb = true;
              }
              var5_ref.k(-55);
              if (var5_ref.b((byte) -32)) {
                this.field_Gb = this.field_Gb | var5_ref.f(true);
                this.field_Mb = this.field_Mb | var5_ref.e(120);
              } else {
                this.field_Gb = true;
              }
              var5_ref = (ml) (u.field_f.d(-18502));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_30_0 = param2;
          }
          if (stackIn_30_0 < 103) {
            discarded$0 = this.b(126, (jd) null);
          }
          this.p((byte) 78);
          if (this.field_Gb) {
            this.field_zb = false;
          }
          if (this.field_zb) {
            this.field_Gb = true;
          }
          if (!param0 &&
            this.k((byte) -127)) {
            this.field_D = true;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("nf.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int[] c(int param0, jd param1) {
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int[] stackIn_105_0 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[][] var6_array = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[][] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[][] var17 = null;
        int[] var18 = null;
        int var3_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_w = -320;
          var16 = new int[7];
          var13 = var16;
          var4 = var13;
          var5 = 0;
          do {
            if (var5 >= (-1 + var16.length)) {
              var4[-1 + var16.length] = var16[0];
              var5 = uj.a(param1, var16.length - 4, (byte) -103) + 2;
              var4[var5] = this.field_H + (-100 - uj.a(param1, 250, (byte) -34));
              var4[var5 - 1] = (var4[var5 - 1] + var16[var5]) / 2;
              break;
            }
            var4[var5] = this.field_H / 2 - uj.a(param1, this.field_H / 2, (byte) -26);
            var5++;
          } while (var12 == 0);
          var4[1 + var5] = (var4[param0 + var5] + var16[var5]) / 2;
          L3: while (true) {
            if (var4.length < this.field_y) {
              var6 = new int[var4.length * 2 - 1];
              stackIn_10_0 = var6;
              stackIn_10_1 = 0;
              stackIn_10_2 = var4[0];
              while (true) {
                stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                stackIn_20_0 = 1;
                if (var12 != 0) {
                  break L3;
                }
                var5 = stackIn_20_0;
                while (var5 < var4.length) {
                  var3_int = this.field_H / var4.length;
                  stackIn_10_0 = var6;
                  stackIn_10_1 = -1 + var5 * 2;
                  stackIn_10_2 = (var4[var5 - 1] + var4[var5]) / 2;
                  if (var3_int != 0) {
                    stackIn_17_3 = uj.a(param1, var3_int, (byte) -30);
                  } else {
                    stackIn_17_3 = 0;
                  }
                  stackIn_10_0[stackIn_10_1] = stackIn_10_2 + stackIn_17_3 - var3_int / 2;
                  var6[2 * var5] = var4[var5];
                  var5++;
                }
                var4 = var6;
                continue L3;
              }
            }
            stackIn_20_0 = 6;
            break;
          }
          var17 = new int[stackIn_20_0][7];
          var14 = var17;
          var6_array = var14;
          var5 = 0;
          while (var17[0].length > var5) {
            var17[0][var5] = this.field_H - uj.a(param1, this.field_H - 250, (byte) -103);
            var17[1][var5] = this.field_H - uj.a(param1, -200 + this.field_H, (byte) -100);
            var17[2][var5] = this.field_H - uj.a(param1, -150 + this.field_H, (byte) -107);
            var17[3][var5] = this.field_H - uj.a(param1, this.field_H - 100, (byte) -121);
            var17[4][var5] = this.field_H - uj.a(param1, -50 + this.field_H, (byte) -60);
            var17[5][var5] = this.field_H - uj.a(param1, this.field_H, (byte) -60);
            var5++;
            if (var12 == 0) {
              continue;
            }
            break;
          }
          var7 = 0;
          while (true) {
            stackIn_25_0 = ~var7;
            L14: {
              if (stackIn_25_0 > -7) {
                L16: while (true) {
                  stackIn_40_0 = ~var17[var7].length;
                  if (var12 != 0) {
                    break L14;
                  }
                  if (stackIn_40_0 > ~this.field_y) {
                    var18 = new int[1 + 2 * (var17[var7].length - 1)];
                    var15 = var18;
                    var8_ref_int__ = var15;
                    stackIn_29_0 = var8_ref_int__;
                    stackIn_29_1 = 0;
                    stackIn_29_2 = var17[var7][0];
                    while (true) {
                      stackIn_29_0[stackIn_29_1] = stackIn_29_2;
                      stackIn_25_0 = 1;
                      var5 = stackIn_25_0;
                      while (var17[var7].length > var5) {
                        var3_intLifetime1 = 4 * (this.field_H / var17[var7].length);
                        stackIn_29_0 = var8_ref_int__;
                        stackIn_29_1 = -1 + 2 * var5;
                        stackIn_29_2 = -(var3_intLifetime1 / 2) + (var17[var7][var5 - 1] + var17[var7][var5]) / 2;
                        if (var3_intLifetime1 == 0) {
                          stackIn_36_3 = 0;
                        } else {
                          stackIn_36_3 = uj.a(param1, var3_intLifetime1, (byte) -78);
                        }
                        stackIn_29_0[stackIn_29_1] = stackIn_29_2 + stackIn_36_3;
                        var8_ref_int__[2 * var5] = var17[var7][var5];
                        var5++;
                      }
                      var6_array[var7] = var18;
                      continue L16;
                    }
                  }
                  break;
                }
                var7++;
                continue;
              }
              var7 = 0;
              stackIn_40_0 = 0;
            }
            var8 = stackIn_40_0;
            while (true) {
              stackIn_42_0 = ~this.field_y;
              stackIn_42_1 = ~var8;
              if (stackIn_42_0 < stackIn_42_1) {
                var7 = var8;
                var9 = var17[0].length * var8 / this.field_y;
                stackIn_70_0 = 0;
                if (var12 == 0) {
                  var10 = stackIn_70_0;
                  while (this.field_H > var10) {
                    var11 = 0;
                    stackIn_42_0 = ~var10;
                    stackIn_42_1 = ~var4[var9 / 32];
                    if (stackIn_42_0 < stackIn_42_1) {
                      var11++;
                    }
                    if (var17[1][var9] < var17[1][var9]) {
                      if (var17[1][var9] < var10) {
                        var11++;
                      }
                      if (var10 > var17[2][var9]) {
                        var11++;
                      }
                    }
                    if (var17[4][var9] < var17[3][var9]) {
                      if (var10 > var17[3][var9]) {
                        var11++;
                      }
                      if (var10 > var17[4][var9]) {
                        var11++;
                      }
                    }
                    if (var17[5][var9] < var10) {
                      var11++;
                    }
                    if (var11 % 2 == 0 &&
                      var4[var9] < var10) {
                      mn.field_y.field_m[var7] = (byte)-5;
                    }
                    var7 = var7 + this.field_y;
                    var10++;
                  }
                  var8++;
                  continue;
                }
              } else {
                var7 = 0;
                stackIn_70_0 = 0;
              }
              var8 = stackIn_70_0;
              while (true) {
                stackIn_72_0 = ~var8;
                stackIn_72_1 = ~this.field_y;
                if (stackIn_72_0 > stackIn_72_1) {
                  var7 = var8;
                  stackIn_105_0 = var17[0];
                  if (var12 == 0) {
                    var9Lifetime1 = stackIn_105_0.length * var8 / this.field_y;
                    var10Lifetime1 = 0;
                    while (var10Lifetime1 < this.field_H) {
                      var11Lifetime1 = 0;
                      stackIn_72_0 = var17[0][var9Lifetime1];
                      stackIn_72_1 = var17[1][var9Lifetime1];
                      if (stackIn_72_0 > stackIn_72_1) {
                        if (var10Lifetime1 > var17[0][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var17[1][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                      }
                      if (var17[3][var9Lifetime1] < var17[2][var9Lifetime1]) {
                        if (var10Lifetime1 > var17[2][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var10Lifetime1 > var17[3][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                      }
                      if (var17[5][var9Lifetime1] < var17[4][var9Lifetime1]) {
                        if (var17[4][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                        if (var17[5][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                      }
                      if (1 == var11Lifetime1 % 2 && (var11Lifetime1 > 0 ||
                        var10Lifetime1 > var4[var9Lifetime1])) {
                        mn.field_y.field_m[var7] = (byte) 0;
                      }
                      var7 = var7 + this.field_y;
                      var10Lifetime1++;
                    }
                    var8++;
                    continue;
                  }
                } else {
                  stackIn_105_0 = var4;
                }
                return stackIn_105_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_108_0 = var3;
          stackIn_108_1 = new StringBuilder().append("nf.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_108_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, ml param1, int param2, int param3, int param4) {
        boolean stackIn_56_0 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          if (16384 < (-param4 + param1.field_lb) * (-param4 + param1.field_lb) + (-param3 + param1.field_db) * (-param3 + param1.field_db)) {
            return false;
          }
          var6_int = 32;
          if (param2 == 57) {
            var6_int = 64;
          }
          if (param2 == 33) {
            var6_int = 64;
          }
          if (param0) {
            return false;
          }
          if (param2 == 42) {
            var6_int = 64;
          }
          if (param2 == 23) {
            var6_int = 100;
          }
          if (param2 == 59) {
            var6_int = 100;
          }
          if (param2 == 47) {
            var6_int = 100;
          }
          if (65 == param2) {
            var6_int = 48;
          }
          if (67 == param2) {
            var6_int = 48;
          }
          if (76 == param2) {
            var6_int = 80;
          }
          if (77 == param2) {
            var6_int = 48;
          }
          if (param2 == 6) {
            var6_int = 96;
          }
          if (param2 == 79) {
            var6_int = 96;
          }
          if (param2 == 98) {
            var6_int = 96;
          }
          if (92 == param2) {
            var6_int = 96;
          }
          if (param2 == 90) {
            var6_int = 64;
          }
          if (107 == param2) {
            var6_int = 128;
          }
          if (param2 == 118) {
            var6_int = 100;
          }
          if ((var6_int / 2) <= param4 &&
            param4 <= (this.field_y - var6_int / 2) &&
            var6_int <= param3) {
            if (param3 > (this.field_H - var6_int / 2)) {
              return false;
            }
            stackIn_56_0 = !(this.a(param4, var6_int >> 1, param3, 124));
            return stackIn_56_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_59_0 = var6;
          stackIn_59_1 = new StringBuilder().append("nf.UB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean n(int param0) {
        if (param0 != 4) {
          field_Bb = (Calendar) null;
        }
        return this.field_ub;
    }

    final boolean m(int param0) {
        boolean discarded$0 = false;
        if (param0 != -28046) {
          discarded$0 = this.a((ml) null, (qb) null, 91, 30, -97);
        }
        return this.field_l;
    }

    final boolean d(byte param0, int param1) {
        if (param1 == 158) {
          return true;
        }
        if (param1 == 157) {
          return true;
        }
        if (param1 == 159) {
          return true;
        }
        if (param0 != 66) {
          this.a((ml) null, 31, 63, -105);
        }
        if (3 == param1) {
          return true;
        }
        if (param1 == 4) {
          return true;
        }
        if (param1 == 5) {
          return true;
        }
        if (param1 == 2) {
          return true;
        }
        if (param1 == 55) {
          return true;
        }
        if (param1 == 54) {
          return true;
        }
        if (param1 == 31) {
          return true;
        }
        if (param1 == 81) {
          return true;
        }
        if (param1 == 60) {
          return true;
        }
        if (param1 == 91) {
          return true;
        }
        if (72 == param1) {
          return true;
        }
        if (38 == param1) {
          return true;
        }
        if (param1 == 16) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (param1 == 152) {
          return true;
        }
        if (param1 == 87) {
          return true;
        }
        if (param1 == 78) {
          return true;
        }
        if (param1 == 30) {
          return true;
        }
        if (rd.field_e[param1] == 4) {
          return true;
        }
        if (param1 == 114) {
          return true;
        }
        if (param1 == 108) {
          return true;
        }
        if (109 == param1) {
          return true;
        }
        if (88 == param1) {
          return true;
        }
        if (param1 == 112) {
          return true;
        }
        return false;
    }

    final boolean a(int param0, qb param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 22) {
            this.field_ob = (int[]) null;
          }
          stackIn_3_0 = ti.a(param2, param4, false, param1, this.field_Jb, this, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("nf.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        this.field_Cb = -1 + param1;
        this.field_J = param1;
        if (this.field_Cb < 0) {
          this.field_Cb = this.field_Cb + this.field_q;
        }
        if (param0 != -4207) {
          this.field_hb = -48;
        }
    }

    final void a(int param0, int param1, int param2, qb param3) {
        try {
          if (param1 > -3) {
            this.c((byte) 69);
          }
          this.a(param2, (byte) -79, param0, this.field_Jb, param3);
          this.a(false, param2, this.field_V, true, param0, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nf.LC(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) {
        ml var2 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_nb = 0;
        var2 = (ml) (this.field_i.b(param0 ^ -12561));
        while (var2 != null) {
          var2.a(true);
          var2.a((byte) 88);
          var2 = (ml) (this.field_i.a(0));
          if (var3 != 0) {
            return;
          }
        }
        if (param0 != -96) {
          return;
        }
        this.field_Kb.c(param0 + 91);
        this.field_r.c(-126);
        return;
    }

    final void b(int param0, boolean param1) {
        int stackIn_78_0 = 0;
        int var4_int = 0;
        Object var4 = null;
        int[] var4_array = null;
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
        jd var16 = null;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 649860712) {
          this.field_Jb = (ll) null;
        }
        var16 = new jd(new int[]{this.field_Q, -1});
        this.field_O = this.field_xb;
        if (this.field_O == 9) {
          this.field_O = dh.a(this.field_Q, true, 8);
        }
        if (ed.field_Cb != -1) {
          this.field_O = ed.field_Cb;
        }
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder1 = true;
        if (param1) {
          this.field_Hb = this.field_H / 2;
          this.field_hb = this.field_y / 2;
          if (null == mn.field_y ||
            this.field_y != mn.field_y.field_g ||
            mn.field_y.field_k != this.field_H) {
            mn.field_y = new ll(this.field_y, this.field_H, gg.field_c);
            decompiledFrameRemainder2 = (null != go.field_j);
            if (decompiledFrameRemainder2) {
              mn.field_y.field_l = go.field_j[8 * this.field_O].field_l;
              decompiledFrameRemainder2 = (var15 != 0);
            }
          }
          if (decompiledFrameRemainder2) {
            var4_int = 0;
            while (!(mn.field_y.field_m.length <= var4_int)) {
              mn.field_y.field_m[var4_int] = (byte) 0;
              var4_int++;
              if (var15 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            decompiledFrameRemainder1 = !(decompiledFrameCompleted1);
          }
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1) &&
          (decompiledFrameCompleted1)) {
          if (this.field_O == 8) {
            this.field_y = 3840;
            this.field_H = 480;
            if (var15 != 0) {
              this.field_y = 1920;
              this.field_H = 960;
            }
          } else {
            this.field_y = 1920;
            this.field_H = 960;
          }
          this.field_Hb = this.field_H / 2;
          this.field_hb = this.field_y / 2;
          if (null == mn.field_y ||
            this.field_y != mn.field_y.field_g ||
            mn.field_y.field_k != this.field_H) {
            mn.field_y = new ll(this.field_y, this.field_H, gg.field_c);
            decompiledFrameRemainder2 = (null != go.field_j);
            if (decompiledFrameRemainder2) {
              mn.field_y.field_l = go.field_j[8 * this.field_O].field_l;
              decompiledFrameRemainder2 = (var15 != 0);
            }
          }
          if (decompiledFrameRemainder2) {
            var4_intLifetime1 = 0;
            while (!(mn.field_y.field_m.length <= var4_intLifetime1)) {
              mn.field_y.field_m[var4_intLifetime1] = (byte) 0;
              var4_intLifetime1++;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          decompiledFrameRemainder2 = (go.field_j != null);
        }
        if (decompiledFrameRemainder2) {
          mn.field_y.field_l = go.field_j[this.field_O * 8].field_l;
        }
        boolean decompiledFrameRemainder3 = true;
        boolean decompiledFrameRemainder0 = true;
        var4 = null;
        this.field_w = 320;
        var5 = this.field_O;
        if (var5 != 0) {
          if (var5 != 1 ||
            var15 != 0) {
            if (var5 == 2) {
              var4_array = this.b((byte) 34, var16);
              decompiledFrameRemainder3 = false;
            }
            else {
              if (var5 == 3) {
                var4_array = this.a(var16, -12260);
                decompiledFrameRemainder3 = false;
              }
              else {
                if (var5 == 4 &&
                  var15 == 0) {
                  var4_array = this.c(param0 ^ 649860713, var16);
                  decompiledFrameRemainder3 = false;
                }
                else {
                  if (var5 == 5) {
                    var4_array = this.b(var16, -30390);
                    decompiledFrameRemainder3 = false;
                  }
                  else {
                    if (var5 == 6 &&
                      var15 == 0) {
                      var4_array = this.c(var16, 32);
                      decompiledFrameRemainder3 = false;
                    }
                    else {
                      if (var5 == 7) {
                        var4_array = this.d(-22070, var16);
                        decompiledFrameRemainder3 = false;
                      }
                      else {
                        if ((var5 == 8) &&
                          (decompiledFrameRemainder0 = (var15 == 0))) {
                          var4_array = this.b(0, var16);
                          decompiledFrameRemainder3 = false;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder0)) {
            var4_array = this.a((byte) -70, var16);
            decompiledFrameRemainder3 = false;
          }
        }
        if (decompiledFrameRemainder3) {
          var4_array = this.a(param0 ^ 649860704, var16);
        }
        if (var4_array != null) {
          System.gc();
          this.field_V = new ll(this.field_y, this.field_H, gg.field_c);
          if (ti.field_I != null) {
            this.field_V.field_l = ti.field_I[this.field_O].field_l;
          }
          this.a(0, 117, mn.field_y, 0, this.field_V);
          this.a(var4_array, var16, (byte) -121);
          this.a(0, 113, this.field_V, 0, mn.field_y);
          this.b((byte) 5);
        }
        this.field_Jb = new ll(this.field_hb, this.field_Hb, gg.field_c);
        this.field_Jb.field_l = this.field_V.field_l;
        this.a(0, this.field_Jb, this.field_V, 0, -126);
        var5Lifetime1 = 0;
        var6 = 0;
        while (true) {
          if (this.field_q <= var6) {
            stackIn_78_0 = var5Lifetime1;
            break;
          }
          stackIn_78_0 = ~this.field_x[var6];
          if (var15 == 0) {
            if (stackIn_78_0 == -10) {
              var5Lifetime1 = 1;
            }
            var6++;
            continue;
          }
          break;
        }
        if (stackIn_78_0 == 0) {
          this.field_pb = null;
        }
        if (stackIn_78_0 != 0 ||
          var15 != 0) {
          var6Lifetime1 = this.field_V.field_l.length;
          this.field_pb = new int[var6Lifetime1];
          var7 = 0;
          while (var6Lifetime1 > var7) {
            var8 = this.field_V.field_l[var7];
            var9 = var8 >> 16 & 255;
            var10 = (65280 & var8) >> 8;
            var11 = var8 & 255;
            var12 = (var10 + var9) / 2;
            var13 = (var11 + var9) / 2;
            var14 = (var10 + var11) / 2;
            this.field_pb[var7] = (var12 << 16) + (var13 << 8) + var14;
            var7++;
            if (var15 != 0) {
              return;
            }
          }
        }
        System.gc();
        return;
    }

    final void a(boolean param0, int param1, boolean param2) {
        if (param1 != -1) {
          this.o((byte) -114);
        }
        this.field_M = param0 ? true : false;
        this.field_eb = param2 ? true : false;
    }

    private final int[] b(byte param0, jd param1) {
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_51_3;
        int stackIn_52_4 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int[] stackIn_116_0 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int[][] var6_array = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int var3_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var7Lifetime1;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var17 = new int[7];
          var14 = var17;
          var4 = var14;
          this.field_w = -320;
          var5 = 0;
          do {
            if (var5 >= var17.length - 1) {
              var4[-1 + var17.length] = var17[0];
              var5 = uj.a(param1, -4 + var17.length, (byte) -80) + 2;
              var4[var5] = -100 + this.field_H - uj.a(param1, 250, (byte) -82);
              var4[var5 - 1] = (var17[var5] + var4[-1 + var5]) / 2;
              break;
            }
            var4[var5] = this.field_H / 2 + 150 - uj.a(param1, -100 + this.field_H / 2, (byte) -24);
            var5++;
          } while (var12 == 0);
          var4[var5 + 1] = (var17[var5] + var4[1 + var5]) / 2;
          L3: while (true) {
            if (var4.length < this.field_y) {
              var13 = new int[2 * (var4.length - 1) + 1];
              var6 = var13;
              stackIn_10_0 = var13;
              stackIn_10_1 = 0;
              stackIn_10_2 = var4[0];
              while (true) {
                stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                stackIn_20_0 = 1;
                if (var12 != 0) {
                  break L3;
                }
                var5 = stackIn_20_0;
                while (var4.length > var5) {
                  var3_int = this.field_H / var4.length;
                  stackIn_10_0 = var6;
                  stackIn_10_1 = -1 + 2 * var5;
                  stackIn_10_2 = (var4[-1 + var5] + var4[var5]) / 2;
                  if (0 == var3_int) {
                    stackIn_17_3 = 0;
                  } else {
                    stackIn_17_3 = uj.a(param1, var3_int, (byte) -81);
                  }
                  stackIn_10_0[stackIn_10_1] = stackIn_10_2 - (-stackIn_17_3 + var3_int / 2);
                  var13[2 * var5] = var4[var5];
                  var5++;
                }
                var4 = var6;
                continue L3;
              }
            }
            stackIn_20_0 = 0;
            break;
          }
          var5 = stackIn_20_0;
          L10: while (true) {
            if (var4.length > var5) {
              var6_int = this.field_y * var5 / var4.length + this.field_y * var4[var5];
              stackIn_31_0 = 0;
              if (var12 != 0) {
                break L10;
              }
              var7 = stackIn_31_0;
              while (var7 < this.field_H - var4[var5]) {
                mn.field_y.field_m[var6_int] = (byte)-5;
                var6_int = var6_int + this.field_y;
                var7++;
              }
              var5++;
              continue L10;
            }
            stackIn_31_0 = 6;
            break;
          }
          var18 = new int[stackIn_31_0][7];
          var15 = var18;
          var6_array = var15;
          if (param0 < 18) {
            this.a(-85, (byte) 104, 4, (ll) null, (qb) null);
          }
          var5 = 0;
          do {
            if ((-1 + var18[0].length) <= var5) {
              var18[0][-1 + var18[0].length] = var18[0][0];
              var18[1][-1 + var18[0].length] = var18[1][0];
              var18[2][var18[0].length - 1] = var18[2][0];
              var18[3][var18[0].length - 1] = var18[3][0];
              var18[4][var18[0].length - 1] = var18[4][0];
              var18[5][var18[0].length - 1] = var18[5][0];
              break;
            }
            var18[0][var5] = this.field_H - 250 - uj.a(param1, this.field_H - 300, (byte) -73);
            var18[1][var5] = -200 + (this.field_H - uj.a(param1, this.field_H - 250, (byte) -30));
            var18[2][var5] = -150 + (this.field_H - uj.a(param1, -200 + this.field_H, (byte) -39));
            var18[3][var5] = this.field_H - 100 - uj.a(param1, -150 + this.field_H, (byte) -122);
            var18[4][var5] = this.field_H - 50 - uj.a(param1, -100 + this.field_H, (byte) -54);
            var18[5][var5] = this.field_H - uj.a(param1, -50 + this.field_H, (byte) -117);
            var5++;
          } while (var12 == 0);
          var7Lifetime1 = 0;
          while (true) {
            stackIn_41_0 = -7;
            L22: {
              if (stackIn_41_0 < ~var7Lifetime1) {
                L24: while (true) {
                  stackIn_56_0 = ~var18[var7Lifetime1].length;
                  if (var12 != 0) {
                    break L22;
                  }
                  if (stackIn_56_0 > ~this.field_y) {
                    var19 = new int[-2 + (var18[var7Lifetime1].length * 2 + 1)];
                    var16 = var19;
                    var8_ref_int__ = var16;
                    stackIn_45_0 = var8_ref_int__;
                    stackIn_45_1 = 0;
                    stackIn_45_2 = var18[var7Lifetime1][0];
                    while (true) {
                      stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                      stackIn_41_0 = 1;
                      var5 = stackIn_41_0;
                      while (var5 < var18[var7Lifetime1].length) {
                        var3_intLifetime1 = this.field_H / var18[var7Lifetime1].length;
                        stackIn_45_0 = var8_ref_int__;
                        stackIn_45_1 = var5 * 2 - 1;
                        stackIn_45_2 = -(var3_intLifetime1 / 2);
                        stackIn_51_3 = (var18[var7Lifetime1][-1 + var5] + var18[var7Lifetime1][var5]) / 2;
                        if (var3_intLifetime1 != 0) {
                          stackIn_52_4 = uj.a(param1, var3_intLifetime1, (byte) -83);
                        } else {
                          stackIn_52_4 = 0;
                        }
                        stackIn_45_0[stackIn_45_1] = stackIn_45_2 + (stackIn_51_3 + stackIn_52_4);
                        var8_ref_int__[2 * var5] = var18[var7Lifetime1][var5];
                        var5++;
                      }
                      var6_array[var7Lifetime1] = var19;
                      continue L24;
                    }
                  }
                  break;
                }
                var7Lifetime1++;
                continue;
              }
              var7Lifetime1 = 0;
              stackIn_56_0 = 0;
            }
            var8 = stackIn_56_0;
            while (true) {
              stackIn_58_0 = var8;
              stackIn_58_1 = this.field_y;
              if (stackIn_58_0 < stackIn_58_1) {
                var9 = var8 * var18[0].length / this.field_y;
                var7Lifetime1 = var8;
                stackIn_84_0 = 0;
                if (var12 == 0) {
                  var10 = stackIn_84_0;
                  while (var10 < this.field_H) {
                    var11 = 0;
                    stackIn_58_0 = ~var10;
                    stackIn_58_1 = ~var18[0][var9];
                    if (stackIn_58_0 < stackIn_58_1) {
                      var11++;
                    }
                    if (var10 > var18[1][var9]) {
                      var11++;
                    }
                    if (var18[2][var9] < var10) {
                      var11++;
                    }
                    if (var10 > var18[3][var9]) {
                      var11++;
                    }
                    if (var18[4][var9] < var10) {
                      var11++;
                    }
                    if (var10 > var18[5][var9]) {
                      var11++;
                    }
                    if (0 == var11 % 2 &&
                      var11 > 0) {
                      mn.field_y.field_m[var7Lifetime1] = (byte)-5;
                    }
                    var7Lifetime1 = var7Lifetime1 + this.field_y;
                    var10++;
                  }
                  var8++;
                  continue;
                }
              } else {
                var7Lifetime1 = 0;
                stackIn_84_0 = 0;
              }
              var8 = stackIn_84_0;
              while (true) {
                stackIn_86_0 = this.field_y;
                stackIn_86_1 = var8;
                if (stackIn_86_0 > stackIn_86_1) {
                  var7Lifetime1 = var8;
                  stackIn_116_0 = var18[0];
                  if (var12 == 0) {
                    var9Lifetime1 = stackIn_116_0.length * var8 / this.field_y;
                    var10Lifetime1 = 0;
                    while (var10Lifetime1 < this.field_H) {
                      var11Lifetime1 = 0;
                      stackIn_86_0 = var18[0][var9Lifetime1];
                      stackIn_86_1 = var18[1][var9Lifetime1];
                      if (stackIn_86_0 > stackIn_86_1) {
                        if (var10Lifetime1 > var18[0][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var10Lifetime1 > var18[1][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                      }
                      if (var18[3][var9Lifetime1] < var18[2][var9Lifetime1]) {
                        if (var10Lifetime1 > var18[2][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var18[3][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                      }
                      if (var18[5][var9Lifetime1] < var18[4][var9Lifetime1]) {
                        if (var10Lifetime1 > var18[4][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var18[5][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                      }
                      if (var11Lifetime1 % 2 == 1) {
                        mn.field_y.field_m[var7Lifetime1] = (byte) 0;
                      }
                      var7Lifetime1 = var7Lifetime1 + this.field_y;
                      var10Lifetime1++;
                    }
                    var8++;
                    continue;
                  }
                } else {
                  stackIn_116_0 = var4;
                }
                return stackIn_116_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_119_0 = var3;
          stackIn_119_1 = new StringBuilder().append("nf.MB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_120_2 = "null";
          } else {
            stackIn_120_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_119_0), ((StringBuilder) (Object) stackIn_119_1).append(stackIn_120_2).append(')').toString());
        }
    }

    final boolean j(int param0) {
        if (param0 != 39) {
          return true;
        }
        return this.field_zb;
    }

    final int a(int param0) {
        if (param0 != -31497) {
          return -27;
        }
        return this.field_O;
    }

    final void a(int param0, byte param1) {
        int var3 = 12 % ((-31 - param1) / 48);
        this.field_q = param0;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          this.field_T = (int[]) null;
        }
        return this.field_D;
    }

    final void q(int param0) {
        this.field_ub = false;
        if (param0 != -256) {
          this.field_o = (int[]) null;
        }
    }

    final void a(byte param0, ml param1) {
        try {
          this.field_i.b(param1, -1);
          if (param0 > -114) {
            this.field_f = false;
          }
          this.field_B.a(param1, (long)param1.field_T, (byte) 110);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nf.KD(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, ll param3, qb param4) {
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var6 = null;
        RuntimeException var6_ref = null;
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
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        byte[] var27 = null;
        byte[] var28 = null;
        int[] var29 = null;
        byte[] var30 = null;
        int[] var31 = null;
        var26 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var30 = new byte[param4.field_A.length];
          var28 = var30;
          var27 = var28;
          var6 = var27;
          param2 = param2 >> 1;
          var7 = 0;
          do {
            if (!(var7 < param4.field_A.length)) {
              param0 = param0 >> 1;
              var7 = param4.field_q >> 1;
              break;
            }
            var27[var7] = (byte)hk.field_p[this.field_O].a(param4.field_A[var7], 510);
            var7++;
          } while (var26 == 0);
          var8 = param4.field_y >> 1;
          if (param1 > -55) {
            this.a((ml) null, 126, -2, -112, 24);
          }
          param2 = param2 + param4.field_o / 2;
          param0 = param0 + param4.field_x / 2;
          var9 = 0;
          var10 = 0;
          var11 = this.field_hb;
          var12 = this.field_Hb;
          if (param0 < var9) {
            stackIn_12_0 = var9 - param0 << 1;
          } else {
            stackIn_12_0 = 0;
          }
          var13 = stackIn_12_0;
          if (var11 >= (param0 + var7)) {
            stackIn_15_0 = -2 + param4.field_q;
          } else {
            stackIn_15_0 = -2 + (var11 - param0 << 1);
          }
          var14 = stackIn_15_0;
          if (param2 < var10) {
            stackIn_18_0 = var10 - param2 << 1;
          } else {
            stackIn_18_0 = 0;
          }
          var15 = stackIn_18_0;
          if (var12 >= param2 + var8) {
            stackIn_21_0 = param4.field_y - 2;
          } else {
            stackIn_21_0 = (-param2 + var12 << 1) - 2;
          }
          var16 = stackIn_21_0;
          var31 = new int[4];
          var29 = var31;
          var17 = var29;
          var18 = var15;
          L8: while (true) {
            stackIn_23_0 = var18;
            if (stackIn_23_0 <= var16) {
              if (var26 != 0) {
                return;
              }
              var19 = var13;
              L11: while (true) {
                stackIn_27_0 = var19;
                stackIn_27_1 = var14;
                if (stackIn_27_0 <= stackIn_27_1) {
                  var20 = var19 + param4.field_q * var18;
                  var21 = (var19 >> 1) + param0 + (param2 + (var18 >> 1)) * this.field_hb;
                  var17[0] = param3.field_l[dg.a(255, (int) var30[var20])];
                  var17[1] = param3.field_l[dg.a((int) var27[1 + var20], 255)];
                  var17[2] = param3.field_l[dg.a((int) var27[var20 + param4.field_q], 255)];
                  var17[3] = param3.field_l[dg.a(255, (int) var27[1 + var20])];
                  var22 = 0;
                  var23 = 0;
                  var24 = 0;
                  stackIn_23_0 = 0;
                  var25 = stackIn_23_0;
                  while (var25 < 4) {
                    stackIn_27_0 = ~var31[var25];
                    stackIn_27_1 = -1;
                    if (stackIn_27_0 == stackIn_27_1) {
                      var17[var25] = param3.field_l[dg.a(255, (int) param3.field_m[var21])];
                    }
                    var22 = var22 + (var31[var25] >> 16);
                    var24 = var24 + (255 & var31[var25]);
                    var23 = var23 + (var31[var25] >> 8 & 255);
                    var25++;
                  }
                  param3.field_m[var21] = (byte)hk.field_p[this.field_O].a(fj.b(fj.b(var23 >> 2 << 8, var22 >> 2 << 16), var24 >> 2), 510);
                  var19 += 2;
                  continue L11;
                }
                break;
              }
              var18 += 2;
              continue L8;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_40_0 = var6_ref;
          stackIn_40_1 = new StringBuilder().append("nf.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param4 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, int param2) {
        ml var4 = this.a(param2, param1);
        if (var4 == null) {
          return false;
        }
        return this.a(param0, var4, param1);
    }

    final int n(byte param0) {
        if (param0 != -75) {
          this.d(-46);
        }
        return this.field_jb;
    }

    final void e(boolean param0) {
        this.field_D = param0 ? true : false;
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int stackIn_16_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 == 153) {
          return this.a(39, param1, -770226943);
        }
        if (param0 < 0) {
          return 0;
        }
        if (param1 < 0) {
          return 0;
        }
        var4 = 0;
        if (param2 != -770226943) {
          return -40;
        }
        while (var4 < 16) {
          stackIn_16_0 = param0;
          if (var5 != 0) {
            return stackIn_16_0;
          }
          if (stackIn_16_0 == this.field_v[param1][var4]) {
            return this.field_vb[param1][var4];
          }
          var4++;
        }
        return 0;
    }

    private final int[] b(int param0, jd param1) {
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_16_3;
        int stackIn_17_4 = 0;
        int stackIn_20_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int[] stackIn_62_0 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var7_int = 0;
        ll var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var20 = null;
        int[] var25 = null;
        int[] var26 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_w = -320;
          var20 = new int[30];
          var17 = var20;
          var16 = var17;
          var4 = var16;
          var5 = 0;
          do {
            if ((-1 + var20.length) <= var5) {
              var20[0] = 0;
              break;
            }
            var16[var5] = 10 * this.field_H / 8 - uj.a(param1, this.field_H, (byte) -65);
            var5++;
          } while (var15 == 0);
          var16[var20.length - 1] = var20[0];
          L3: while (true) {
            if (var4.length < (this.field_y / 32)) {
              var6_ref_int__ = new int[1 + (2 * var4.length - 2)];
              stackIn_10_0 = var6_ref_int__;
              stackIn_10_1 = 0;
              stackIn_10_2 = var4[0];
              while (true) {
                stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                stackIn_20_0 = 1;
                if (var15 != 0) {
                  break L3;
                }
                var5 = stackIn_20_0;
                while (var4.length > var5) {
                  var3_int = this.field_H / var4.length;
                  stackIn_10_0 = var6_ref_int__;
                  stackIn_10_1 = 2 * var5 - 1;
                  stackIn_10_2 = -(var3_int / 2);
                  stackIn_16_3 = (var4[-1 + var5] + var4[var5]) / 2;
                  if (var3_int != 0) {
                    stackIn_17_4 = param1.a(var3_int, (byte) -116);
                  } else {
                    stackIn_17_4 = 0;
                  }
                  stackIn_10_0[stackIn_10_1] = stackIn_10_2 + (stackIn_16_3 + stackIn_17_4);
                  var6_ref_int__[var5 * 2] = var4[var5];
                  var5++;
                }
                var4 = var6_ref_int__;
                continue L3;
              }
            }
            this.a(var4, (byte) -113);
            var5 = 0;
            stackIn_20_0 = 0;
            break;
          }
          var6 = stackIn_20_0;
          L10: while (true) {
            var5++;
            var7_int = uj.a(param1, this.field_y / 2, (byte) -94) + this.field_y / 4;
            var8 = 2;
            L11: while (true) {
              var9 = this.field_y * var8 + var7_int;
              while (this.field_H > var8) {
                if (mn.field_y.field_m[var9] == 0) {
                  var7_int = var7_int + (-1 + var5 % 3);
                  var8++;
                  var9 = var9 + this.field_y;
                  var9 = var9 + (var5 % 3 - 1);
                  if (0 > var7_int) {
                    var9 = var9 + this.field_y;
                    var7_int = var7_int + this.field_y;
                  }
                  if (var7_int < this.field_y) {
                    continue;
                  }
                  var7_int = var7_int - this.field_y;
                  var9 = var9 - this.field_y;
                  if (var15 != 0) {
                    continue L11;
                  }
                  continue;
                }
                break;
              }
              break;
            }
            var10 = (this.field_H - var8) * 64 / this.field_H + uj.a(param1, 16, (byte) -37);
            do {
              if (this.field_H > var8 &&
                (32 + var10) < var8 &&
                var10 < var7_int &&
                var7_int < this.field_y - var10) {
                o.a(mn.field_y, (byte) -47, var10, (byte) -5, var8, var7_int, this);
                var6 = var8;
              }
              if (var8 < 32 + var10) {
                var6 = 0;
              }
              if (var6 > 128) {
                continue L10;
              }
              System.gc();
              this.field_V = new ll(this.field_y, this.field_H, gg.field_c);
            } while (var15 != 0);
            break;
          }
          if (ti.field_I != null) {
            this.field_V.field_l = ti.field_I[this.field_O].field_l;
          }
          this.a(0, 120, mn.field_y, 0, this.field_V);
          var25 = new int[1000];
          var26 = new int[1000];
          var10 = param0;
          var5 = 0;
          L19: while (true) {
            stackIn_47_0 = -11;
            stackIn_47_1 = ~var5;
            if (stackIn_47_0 < stackIn_47_1) {
              var7 = go.field_j[4 + (uj.a(param1, 4, (byte) -124) + this.field_O * 8)];
              var11 = uj.a(param1, this.field_y - 256, (byte) -69);
              var12 = uj.a(param1, -256 + this.field_H, (byte) -86);
              var13 = 1;
              var14 = 0;
              while (var14 < var10) {
                stackIn_47_0 = -193;
                stackIn_47_1 = ~Math.abs(var25[var14] - var11);
                if (stackIn_47_0 < stackIn_47_1 &&
                  192 > Math.abs(var26[var14] - var12)) {
                  var13 = 0;
                }
                var14++;
              }
              if (var13 != 0) {
                var25[var10] = var11;
                var26[var10] = var12;
                var10++;
                this.a(false, var11, this.field_V, false, var12, var7.b());
              }
              var5++;
              continue L19;
            }
            break;
          }
          this.a(0, 114, this.field_V, 0, mn.field_y);
          stackIn_62_0 = var4;
          return stackIn_62_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_65_0 = var3;
          stackIn_65_1 = new StringBuilder().append("nf.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    final void p(int param0) {
        if (param0 <= 40) {
          this.a(-94, 10, (byte) 54, 18);
        }
        this.b(649860712, false);
    }

    private final void a(int param0, ll param1, ll param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        var25 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param0 = param0 >> 1;
          param3 = param3 >> 1;
          var6_int = param2.field_h >> 1;
          param3 = param3 + param2.field_j / 2;
          var7 = param2.field_c >> 1;
          param0 = param0 + param2.field_f / 2;
          var8 = 0;
          var9 = 0;
          var10 = this.field_hb;
          var11 = this.field_Hb;
          if (param4 > -123) {
            return;
          }
          if (param3 < var8) {
            stackIn_6_0 = -param3 + var8 << 1;
          } else {
            stackIn_6_0 = 0;
          }
          var12 = stackIn_6_0;
          if (var10 < (param3 + var6_int)) {
            stackIn_9_0 = -2 + (var10 - param3 << 1);
          } else {
            stackIn_9_0 = -2 + param2.field_h;
          }
          var13 = stackIn_9_0;
          if (var9 <= param0) {
            stackIn_12_0 = 0;
          } else {
            stackIn_12_0 = -param0 + var9 << 1;
          }
          var14 = stackIn_12_0;
          if ((var7 + param0) > var11) {
            stackIn_15_0 = (-param0 + var11 << 1) - 2;
          } else {
            stackIn_15_0 = param2.field_c - 2;
          }
          var15 = stackIn_15_0;
          var27 = new int[4];
          var26 = var27;
          var16 = var26;
          var17 = var14;
          L4: while (true) {
            stackIn_17_0 = var15;
            if (stackIn_17_0 >= var17) {
              if (var25 != 0) {
                return;
              }
              var18 = var12;
              L7: while (true) {
                stackIn_21_0 = ~var13;
                stackIn_21_1 = ~var18;
                if (stackIn_21_0 <= stackIn_21_1) {
                  var19 = var18 + param2.field_h * var17;
                  var16[0] = param2.field_l[dg.a((int) param2.field_m[var19], 255)];
                  var20 = this.field_hb * ((var17 >> 1) + param0) - (-(var18 >> 1) - param3);
                  var16[1] = param2.field_l[dg.a(255, (int) param2.field_m[1 + var19])];
                  var16[2] = param2.field_l[dg.a(255, (int) param2.field_m[param2.field_h + var19])];
                  var16[3] = param2.field_l[dg.a(255, (int) param2.field_m[1 + var19])];
                  var21 = 0;
                  var22 = 0;
                  var23 = 0;
                  stackIn_17_0 = 0;
                  var24 = stackIn_17_0;
                  while (var24 < 4) {
                    stackIn_21_0 = -1;
                    stackIn_21_1 = ~var27[var24];
                    if (stackIn_21_0 == stackIn_21_1) {
                      var16[var24] = param1.field_l[dg.a((int) param1.field_m[var20], 255)];
                    }
                    var23 = var23 + (var27[var24] & 255);
                    var22 = var22 + ((var27[var24] & 65305) >> 8);
                    var21 = var21 + (var27[var24] >> 16);
                    var24++;
                  }
                  param1.field_m[var20] = (byte)hk.field_p[this.field_O].a(fj.b(var23 >> 2, fj.b(var21 >> 2 << 16, var22 >> 2 << 8)), 510);
                  var18 += 2;
                  continue L7;
                }
                break;
              }
              var17 += 2;
              continue L4;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("nf.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void e(int param0, boolean param1) {
        ml dupTemp$0 = null;
        ml dupTemp$1 = null;
        int stackIn_35_1 = 0;
        boolean stackIn_36_2 = false;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ml var7 = null;
        ml var8 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 0) {
          return;
        }
        if (param0 >= this.field_q) {
          return;
        }
        var7 = this.a(param0, true);
        var8 = var7;
        if (var8 == null) {
          return;
        }
        if (var8.field_ib <= 20) {
          return;
        }
        if (param1) {
          this.field_Q = 81;
        }
        var4 = 100;
        if (this.field_x[param0] == 4) {
          var4 = 5 * (this.field_X[param0] / 5) + 5;
          if (0 < this.field_X[param0] &&
            5 + this.field_X[param0] == var4) {
            var4 = this.field_X[param0];
          }
        }
        if (this.field_X[param0] >= var4) {
          return;
        }
        if (9 != this.field_x[param0]) {
          dupTemp$0 = this.a(param0, true);
          dupTemp$0.field_ib = dupTemp$0.field_ib - 20;
          if (this.field_x[param0] == 4) {
            this.field_X[param0] = this.field_X[param0] + 1;
            if (var6 != 0) {
              this.field_X[param0] = this.field_X[param0] + 20;
            }
          } else {
            this.field_X[param0] = this.field_X[param0] + 20;
          }
          if (this.field_x[param0] == 4 ||
            this.field_X[param0] == 20) {
            this.field_Ab[param0] = var7.field_lb;
            this.field_o[param0] = var7.field_db;
          }
          if (this.field_sb == null) {
            return;
          }
          if (this.field_sb[ah.field_f[0 + this.field_x[param0]]] == null) {
            return;
          }
          ti.a((byte) -30, to.field_r[ah.field_f[0 + this.field_x[param0] + 0]], this.field_sb[ah.field_f[this.field_x[param0] + 0]]);
          if (var6 == 0) {
            return;
          }
        }
        stackIn_35_1 = param0;
        stackIn_36_2 = !(param1);
        dupTemp$1 = this.a(stackIn_35_1, stackIn_36_2);
        dupTemp$1.field_ib = dupTemp$1.field_ib - 100;
        var5 = 0;
        while (this.field_q > var5) {
          this.field_X[var5] = 0;
          var5++;
          if (var6 != 0) {
            return;
          }
        }
        return;
    }

    final void a(int param0, int param1, boolean param2) {
        int[] dupTemp$1 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > param0) {
          return;
        }
        if (0 > param1) {
          return;
        }
        var4 = 0;
        if (!param2) {
          this.a(true, (ml) null, 10, -31, 10);
        }
        while (var4 < 16 &&
          var5 == 0) {
          if (~param0 == ~this.field_v[param1][var4]) {
            if (-1 == mj.field_p) {
              dupTemp$1 = this.field_vb[param1];
              dupTemp$1[var4] = dupTemp$1[var4] + 1;
            }
            this.field_lb[param1][var4] = 0;
            return;
          }
          var4++;
        }
        return;
    }

    final boolean a(ml param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_3_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_25_0 = false;
        boolean stackIn_31_0 = false;
        boolean stackIn_34_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_65_0 = false;
        boolean stackIn_69_0 = false;
        boolean stackIn_75_0 = false;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4 == 153) {
            stackIn_3_0 = this.a(param0, param1, param2, param3 ^ 0, 39);
            return stackIn_3_0;
          }
          if (param4 == 151) {
            return false;
          }
          if (this.field_f &&
            !this.d((byte) 66, param4)) {
            return false;
          }
          if (2 != param4 &&
            param4 != 81 &&
            91 != param4 &&
            param4 != 31 &&
            param4 != 60 &&
            param4 != 55 &&
            param4 != 114) {
            if (30 == param4) {
              stackIn_25_0 = this.a(param2, param0, param3 + 31011, param1);
              return stackIn_25_0;
            }
            if (param3 != -129) {
              return false;
            }
            if (param4 == 78) {
              stackIn_31_0 = this.a(param0, param1, param2, -5);
              return stackIn_31_0;
            }
            if (param4 == 4) {
              stackIn_34_0 = this.b(param2, param0, -16, param1);
              return stackIn_34_0;
            }
            if (param4 == 150) {
              stackIn_38_0 = this.a(param2, param1, (byte) -75, param0);
              return stackIn_38_0;
            }
            if (param4 != 56 &&
              57 != param4 &&
              param4 != 32 &&
              param4 != 33 &&
              param4 != 42 &&
              param4 != 17 &&
              param4 != 23 &&
              param4 != 59 &&
              param4 != 47 &&
              param4 != 65 &&
              param4 != 67 &&
              64 != param4 &&
              44 != param4 &&
              77 != param4 &&
              param4 != 76 &&
              param4 != 6 &&
              param4 != 79 &&
              param4 != 98 &&
              param4 != 90 &&
              107 != param4 &&
              param4 != 104 &&
              param4 != 92 &&
              param4 != 112 &&
              118 != param4) {
              if (9 == param4) {
                stackIn_69_0 = this.a(false, param2, param1);
                return stackIn_69_0;
              }
              if (5 != ti.field_N) {
                if (param4 != 11) {
                  return true;
                }
                return false;
              }
              stackIn_75_0 = (this.a(false, param2, param1)) && (this.a(false, param0.field_lb, -32 + (param0.field_db - param0.field_Y)));
              return stackIn_75_0;
            }
            stackIn_65_0 = this.a(false, param0, param4, param1, param2);
            return stackIn_65_0;
          }
          stackIn_21_0 = this.a(param4, param1, param0, (byte) 74, param2);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_83_0 = var6;
          stackIn_83_1 = new StringBuilder().append("nf.HD(");
          if (param0 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean k(int param0) {
        int var2 = 16 % ((param0 - 46) / 48);
        return !this.field_Db.b(true) ? true : false;
    }

    final void d(int param0, boolean param1) {
        if (!param1) {
          this.a((byte) -37);
        }
        this.field_Q = param0;
    }

    private final boolean a(ml param0, qb param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, param2 + param2);
          var6_int = this.b(param3, 2, param4, param1) ? 1 : 0;
          this.a(-62, param0);
          stackIn_1_0 = var6_int;
          return stackIn_1_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("nf.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_200_0 = 0;
        int stackIn_200_1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ml var10 = null;
        int var4Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var4Lifetime1Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.field_ub) {
          throw new IllegalStateException();
        }
        if (this.field_J >= 0) {
          var10 = this.a(this.field_J, true);
          if (var10 != null) {
            if (var10.field_ib != 1) {
            }
            var4 = 0;
            var5 = 0;
            var6_ref_ml = (ml) (this.field_i.b(12623));
            while (true) {
              if (var6_ref_ml != null) {
                stackIn_18_0 = var6_ref_ml.field_jb;
                stackIn_18_1 = 26;
                if (var9 == 0) {
                  if (stackIn_18_0 == stackIn_18_1) {
                    var5++;
                  }
                  if (var6_ref_ml.field_jb == 30) {
                    var4++;
                  }
                  var6_ref_ml = (ml) (this.field_i.a(0));
                  continue;
                }
              } else {
                stackIn_18_0 = 16;
                stackIn_18_1 = var10.field_jb;
              }
              break;
            }
            if (stackIn_18_0 == stackIn_18_1 &&
              var5 <= 0) {
            }
          }
        }
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder0 = true;
        this.field_E = new int[this.field_q];
        this.field_fb = new int[17];
        var3 = 0;
        if (this.field_J >= 0) {
          if (!this.field_d) {
            var3++;
            this.field_E[this.field_J] = this.field_E[this.field_J] + 1;
            decompiledFrameRemainder0 = (var9 != 0);
          }
          if (decompiledFrameRemainder0) {
            var4Lifetime1 = this.field_J & 1;
            while (var4Lifetime1 < this.field_q) {
              var3++;
              this.field_E[var4Lifetime1] = this.field_E[var4Lifetime1] + 1;
              var4Lifetime1 += 2;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
        }
        if (decompiledFrameCompleted0) {
          var4Lifetime1Lifetime1 = 44 % ((param0 - 74) / 52);
        }
        var5 = 0;
        do {
          if (var5 >= 17) {
            var5 = 0;
            break;
          }
          this.field_fb[var5] = -1;
          var5++;
        } while (var9 == 0);
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (this.field_q <= var5))) {
          var6 = 0;
          stackIn_138_0 = -1;
          stackIn_138_1 = this.field_fb[var6];
          if (var9 == 0) {
            if ((stackIn_138_0 == stackIn_138_1 ||
              this.field_K[var5] > this.field_K[this.field_fb[var6]]) &&
              this.field_K[var5] >= 1000) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_ib[this.field_fb[var6]] < this.field_ib[var5]) && this.field_ib[var5] >= 100) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_g[var5] > this.field_g[this.field_fb[var6]]) && this.field_g[var5] >= 100) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((-1 == this.field_fb[var6] ||
              this.field_ob[var5] > this.field_ob[this.field_fb[var6]]) && 3 < this.field_ob[var5]) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_U[var5] > this.field_U[this.field_fb[var6]]) && this.field_U[var5] > 1) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_ab[var5] > this.field_ab[this.field_fb[var6]]) && this.field_ab[var5] >= 5) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((-1 == this.field_fb[var6] ||
              this.field_Eb[this.field_fb[var6]] < this.field_Eb[var5]) && this.field_Eb[var5] > 1) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_K[var5] < this.field_K[this.field_fb[var6]]) && this.field_K[var5] <= 250) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_wb[this.field_fb[var6]] < this.field_wb[var5]) && 200 <= this.field_wb[var5]) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_Nb[this.field_fb[var6]] < this.field_Nb[var5]) && this.field_Nb[var5] >= 100) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_T[var5] > this.field_T[this.field_fb[var6]]) && 250 <= this.field_T[var5]) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_n[var5] > this.field_n[this.field_fb[var6]]) && this.field_n[var5] >= 5) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((-1 == this.field_fb[var6] ||
              this.field_gb[this.field_fb[var6]] < this.field_gb[var5]) && this.field_gb[var5] > 1) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((-1 == this.field_fb[var6] ||
              this.field_Fb[this.field_fb[var6]] < this.field_Fb[var5]) && this.field_Fb[var5] > 1) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_Ob[var5] > this.field_Ob[this.field_fb[var6]]) && this.field_Ob[var5] >= 3000) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_c[var5] > this.field_c[this.field_fb[var6]]) && 50 <= this.field_c[var5]) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if (lk.a(0, (byte) -63) && (-1 == this.field_fb[var6] ||
              this.field_b[this.field_fb[var6]] < this.field_b[var5]) && this.field_b[var5] >= 1) {
              this.field_fb[var6] = var5;
            }
            var5++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_138_0 = -1;
          stackIn_138_1 = this.field_fb[11];
        }
        if (stackIn_138_0 != stackIn_138_1 &&
          this.field_fb[0] == -1 &&
          this.field_fb[1] == -1) {
          this.field_fb[11] = -1;
        }
        if (this.field_fb[7] != -1 &&
          this.field_fb[0] == -1 &&
          this.field_fb[1] == -1) {
          this.field_fb[7] = -1;
        }
        if (this.field_fb[13] == this.field_fb[12]) {
          this.field_fb[12] = -1;
          this.field_fb[13] = -1;
        }
        if (this.field_fb[7] == this.field_fb[1]) {
          this.field_fb[1] = -1;
        }
        if (this.field_fb[7] == this.field_fb[0]) {
          this.field_fb[0] = -1;
        }
        var5 = -1 + this.field_q * 2;
        if (var5 > (-2 + this.field_jb / this.field_q)) {
          var5 = -2 + this.field_jb / this.field_q;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        var6Lifetime1 = 0;
        while (this.field_fb.length > var6Lifetime1) {
          var7 = this.field_fb[var6Lifetime1];
          stackIn_200_0 = 0;
          stackIn_200_1 = ~var7;
          if (var9 != 0) {
            return;
          }
          if (stackIn_200_0 != stackIn_200_1) {
            if ((param1 & 1 << var7) == 0) {
              this.field_E[var7] = this.field_E[var7] + 1;
            }
            var3++;
          }
          var6Lifetime1++;
        }
        var6Lifetime2 = 0;
        while (true) {
          if (var6Lifetime2 >= this.field_q) {
            return;
          }
          if (var9 != 0) {
            return;
          }
          if (0 < this.field_E[var6Lifetime2]) {
            this.field_E[var6Lifetime2] = this.field_E[var6Lifetime2] * var5 / var3;
            if (this.field_E[var6Lifetime2] == 0) {
              this.field_E[var6Lifetime2] = 1;
            }
            var7Lifetime1 = 250 * this.field_S[var6Lifetime2];
            if (var7Lifetime1 > this.field_m) {
              var8 = 1 + (var7Lifetime1 - this.field_m) / 250;
              if (this.field_E[var6Lifetime2] < var8) {
                var8 = this.field_E[var6Lifetime2];
              }
              this.field_E[var6Lifetime2] = this.field_E[var6Lifetime2] - var8;
            }
          }
          var6Lifetime2++;
        }
    }

    final boolean a(boolean param0, int param1, int param2) {
        int var4;
        boolean stackIn_11_0 = false;
        if (param0) {
          this.field_fb = (int[]) null;
        }
        var4 = 32;
        if (param1 >= var4 &&
          param1 <= (this.field_y - var4) &&
          var4 <= param2 &&
          (this.field_H - var4) >= param2) {
          stackIn_11_0 = !(this.a(param1, var4 >> 1, param2, -66));
          return stackIn_11_0;
        }
        return false;
    }

    private final boolean k(byte param0) {
        int var2;
        int var3;
        int var4;
        ml var5;
        int var6;
        boolean stackIn_10_0 = false;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        var3 = -5 / ((param0 + 57) / 54);
        var4 = 0;
        L1: while (true) {
          if (var4 < this.field_q) {
            var5 = this.a(var4, true);
            if (var6 == 0) {
              if (var5 != null) {
                var2++;
              }
              var4++;
              continue;
            }
          } else {
            if (var2 <= 1) {
              stackIn_10_0 = true;
              break L1;
            }
          }
          stackIn_10_0 = false;
          break;
        }
        return stackIn_10_0;
    }

    private final int[] d(int param0, jd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        qb var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_26_3;
        int stackIn_27_4 = 0;
        int stackIn_30_0 = 0;
        Object stackIn_67_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        var24 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var27 = new int[20];
          var26 = var27;
          var25 = var26;
          var4 = var25;
          var5 = 0;
          do {
            if (var5 >= var27.length) {
              var25[0] = this.field_H + 64;
              var25[19] = 64 + this.field_H;
              break;
            }
            var25[var5] = 64 + (this.field_H - uj.a(param1, 256, (byte) -123));
            var5++;
          } while (var24 == 0);
          var6 = uj.a(param1, 5, (byte) -110) + 1;
          var7 = -2 + (uj.a(param1, 5, (byte) -90) + 10);
          var8 = -6 + uj.a(param1, 5, (byte) -80) + 20;
          if (var6 <= 1) {
            var25[3 + var6] = this.field_H * 6 / 8 - uj.a(param1, this.field_H * 3 / 8, (byte) -69);
          }
          if (var6 > 1 ||
            var24 != 0) {
            var25[-1 + var6] = this.field_H * 6 / 8 - uj.a(param1, 5 * this.field_H / 8, (byte) -28);
          }
          var25[var6] = 6 * this.field_H / 8 - uj.a(param1, this.field_H * 5 / 8, (byte) -30);
          var25[var6 + 1] = this.field_H * 6 / 8 - uj.a(param1, this.field_H * 5 / 8, (byte) -23);
          var25[var6 + 2] = 6 * this.field_H / 8 - uj.a(param1, 4 * this.field_H / 8, (byte) -27);
          var9 = var27[var6];
          var25[var8 - 1] = 6 * this.field_H / 8 - uj.a(param1, this.field_H * 5 / 8, (byte) -54);
          var25[var8 - 2] = this.field_H * 6 / 8 - uj.a(param1, 4 * this.field_H / 8, (byte) -93);
          var25[var8] = 6 * this.field_H / 8 - uj.a(param1, 5 * this.field_H / 8, (byte) -97);
          if (var8 >= 17) {
            var25[var8 - 3] = 6 * this.field_H / 8 - uj.a(param1, 3 * this.field_H / 8, (byte) -115);
          }
          if (var8 < 17 ||
            var24 != 0) {
            var25[1 + var8] = 6 * this.field_H / 8 - uj.a(param1, this.field_H * 5 / 8, (byte) -57);
          }
          var10 = var27[var8];
          var25[-2 + var7] = 6 * this.field_H / 8 - uj.a(param1, this.field_H * 3 / 8, (byte) -100);
          var25[-1 + var7] = 6 * this.field_H / 8 - uj.a(param1, this.field_H * 4 / 8, (byte) -95);
          var25[var7] = 6 * this.field_H / 8 - uj.a(param1, 5 * this.field_H / 8, (byte) -74);
          if (param0 != -22070) {
            this.field_y = 13;
          }
          var25[1 + var7] = 6 * this.field_H / 8 - uj.a(param1, this.field_H * 4 / 8, (byte) -114);
          var25[var7 + 2] = 6 * this.field_H / 8 - uj.a(param1, this.field_H * 3 / 8, (byte) -30);
          var11 = var27[var7];
          var25[(var7 + var6) / 2] = 64 + this.field_H;
          var25[(var7 + var8) / 2] = this.field_H + 64;
          L8: while (true) {
            if (this.field_y / 32 > var4.length) {
              var12_ref_int__ = new int[(-1 + var4.length) * 2 + 1];
              stackIn_20_0 = var12_ref_int__;
              stackIn_20_1 = 0;
              stackIn_20_2 = var4[0];
              while (true) {
                stackIn_20_0[stackIn_20_1] = stackIn_20_2;
                stackIn_30_0 = 1;
                if (var24 != 0) {
                  break L8;
                }
                var5 = stackIn_30_0;
                while (var4.length > var5) {
                  var3_int = this.field_H / var4.length;
                  stackIn_20_0 = var12_ref_int__;
                  stackIn_20_1 = -1 + 2 * var5;
                  stackIn_20_2 = -(var3_int / 2);
                  stackIn_26_3 = (var4[var5] + var4[var5 - 1]) / 2;
                  if (0 == var3_int) {
                    stackIn_27_4 = 0;
                  } else {
                    stackIn_27_4 = param1.a(var3_int, (byte) -116);
                  }
                  stackIn_20_0[stackIn_20_1] = stackIn_20_2 + (stackIn_26_3 + stackIn_27_4);
                  var12_ref_int__[var5 * 2] = var4[var5];
                  var5++;
                }
                var4 = var12_ref_int__;
                continue L8;
              }
            }
            var6 = (var6 + 1) * var4.length / 20;
            stackIn_30_0 = var4.length * (var8 - 1) / 20;
            break;
          }
          var12 = stackIn_30_0;
          var8 = var4.length * (var7 + 2) / 20;
          var9 = var4[var6] + 24;
          var7 = (var7 - 2) * var4.length / 20;
          var10 = var4[var8] + 24;
          var11 = 24 + var4[var7];
          var13 = 24 + var4[var12];
          var14 = -1;
          do {
            if (1 <= var14) {
              var14 = -1;
              break;
            }
            var4[var14 + var6] = var4[var6];
            var4[var14 + var7] = var4[var7];
            var4[var14 + var8] = var4[var8];
            var4[var14 + var12] = var4[var12];
            var14++;
          } while (var24 == 0);
          do {
            if (var14 >= 1) {
              this.a(var4, (byte) -106);
              System.gc();
              this.field_V = new ll(this.field_y, this.field_H, gg.field_c);
              break;
            }
            var4[var14 + var6] = var4[var14 + var6] - 64;
            var4[var7 + var14] = var4[var7 + var14] - 64;
            var4[var8 + var14] = var4[var8 + var14] - 64;
            var4[var12 + var14] = var4[var12 + var14] - 64;
            var14++;
          } while (var24 == 0);
          if (ti.field_I != null) {
            this.field_V.field_l = ti.field_I[this.field_O].field_l;
          }
          this.a(0, 127, mn.field_y, 0, this.field_V);
          var14 = this.field_y * var6 / var4.length;
          var15 = this.field_y * var7 / var4.length;
          var16 = var8 * this.field_y / var4.length;
          var17 = var12 * this.field_y / var4.length;
          var18 = new qb(20, 20);
          var18.a();
          gj.field_f[5].a(2, 2);
          var19 = 0;
          do {
            if (!(var19 < var18.field_A.length)) {
              var18.d(0, 0, 9584406);
              var18.d(1);
              var18.d(1);
              var19 = -var14 + var15;
              break;
            }
            var18.field_A[var19] = 65793 * dg.a(var18.field_A[var19], 255);
            var19++;
          } while (var24 == 0);
          boolean decompiledFrameCompleted0 = true;
          var20 = -var9 + var11;
          if (Math.abs(var20) < var19) {
            var21 = var14;
            while (var15 > var21) {
              var22 = Math.abs(var19 / 2 - var21 + var14);
              var23 = (-(var22 * var22) + var19 * var19 / 4) / (var19 * 4);
              this.a(false, var21 - 10, this.field_V, false, var23 + (var9 + var20 * (var21 - var14) / var19) - 10, var18);
              var21 += 14;
              if (var24 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var20 = -var10 + var13;
            var19 = -var16 + var17;
          }
          if (Math.abs(var20) < var19) {
            var21Lifetime1 = var16;
            while (var21Lifetime1 < var17) {
              var22Lifetime1 = Math.abs(-var21Lifetime1 + var16 + var19 / 2);
              var23Lifetime1 = (-(var22Lifetime1 * var22Lifetime1) + var19 * var19 / 4) / (var19 * 4);
              this.a(false, var21Lifetime1 - 10, this.field_V, false, var23Lifetime1 + (-10 + (-var16 + var21Lifetime1) * var20 / var19 + var10), var18);
              var21Lifetime1 += 14;
              if (var24 != 0) {
                return null;
              }
            }
          }
          this.a(var4, param1, (byte) 75);
          this.a(0, 121, this.field_V, 0, mn.field_y);
          this.b((byte) 5);
          stackIn_67_0 = null;
          return (int[]) (stackIn_67_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_70_0 = var3;
          stackIn_70_1 = new StringBuilder().append("nf.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    final ll m(byte param0) {
        if (param0 != 69) {
          return (ll) null;
        }
        return this.field_Jb;
    }

    final int o(int param0) {
        boolean discarded$0 = false;
        if (param0 != 4) {
          discarded$0 = this.c(-95, 63, -13);
        }
        return this.c(106, false);
    }

    public static void r(int param0) {
        if (param0 != 0) {
          return;
        }
        field_P = null;
        field_Bb = null;
        field_yb = null;
        field_e = null;
        field_j = null;
        field_qb = null;
        field_A = null;
        field_Lb = null;
        field_z = null;
    }

    private final void i(byte param0) {
        oc var2 = null;
        ml var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = new oc(this.field_i);
        if (param0 != 86) {
          this.field_Kb = (vn) null;
        }
        var3 = (ml) (var2.b(-42));
        while (var3 != null) {
          this.a(-100, var3);
          var3 = (ml) (var2.d(-18502));
          if (var4 == 0) {
            continue;
          }
          break;
        }
    }

    private final int[] a(jd param0, int param1) {
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_18_3 = 0;
        int[] stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var9 = new int[10];
          var8 = var9;
          var4 = var8;
          var5 = 0;
          if (param1 != -12260) {
            this.field_n = (int[]) null;
          }
          do {
            if ((-1 + var9.length) <= var5) {
              var4[0] = this.field_H + 64;
              var4[1] = var9[1] / 2;
              var4[var9.length - 2] = var4[-2 + var9.length] / 2;
              break;
            }
            var4[var5] = this.field_H * 6 / 8 - uj.a(param0, this.field_H * 5 / 8, (byte) -125);
            var5++;
          } while (var7 == 0);
          var4[var9.length - 1] = var9[0];
          L4: while (true) {
            if ((this.field_y / 32) > var4.length) {
              var6 = new int[1 + 2 * (-1 + var4.length)];
              stackIn_11_0 = var6;
              stackIn_11_1 = 0;
              stackIn_11_2 = var4[0];
              while (true) {
                stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                if (var7 != 0) {
                  break L4;
                }
                var5 = 1;
                while (var4.length > var5) {
                  var3_int = this.field_H / var4.length;
                  stackIn_11_0 = var6;
                  stackIn_11_1 = 2 * var5 - 1;
                  stackIn_11_2 = (var4[var5 - 1] + var4[var5]) / 2;
                  if (var3_int == 0) {
                    stackIn_18_3 = 0;
                  } else {
                    stackIn_18_3 = param0.a(var3_int, (byte) -116);
                  }
                  stackIn_11_0[stackIn_11_1] = stackIn_11_2 + stackIn_18_3 - var3_int / 2;
                  var6[2 * var5] = var4[var5];
                  var5++;
                }
                var4 = var6;
                continue L4;
              }
            }
            this.a(var4, (byte) -115);
            break;
          }
          stackIn_22_0 = var4;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("nf.GD(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final int q(byte param0) {
        if (param0 >= -109) {
          field_z = (int[]) null;
        }
        if (!this.field_d) {
          return this.field_J;
        }
        return 1 & this.field_J;
    }

    final boolean a(int param0, int param1, byte param2) {
        if (param2 != -83) {
          this.a(1, (byte) 42, 71, (ll) null, (qb) null);
        }
        return ee.a(this.field_Jb, param0, param1, 96);
    }

    private final void p(byte param0) {
        mi var2 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = (mi) (this.field_I.b(117));
        do {
          if (var2 == null) {
            var2 = (mi) (this.field_h.b(117));
            break;
          }
          var2.a(true);
          var2 = (mi) (this.field_I.e(-124));
        } while (var3 == 0);
        do {
          if (var2 == null) {
            this.field_kb.a(this.field_Kb, false);
            this.field_I.a(17);
            break;
          }
          this.field_r.b(var2, -1);
          var2 = (mi) (this.field_h.e(123));
        } while (var3 == 0);
        if (param0 <= 71) {
          this.a(-89, (byte) 119, 52, (ll) null, (qb) null);
        }
        this.field_h.a(17);
        this.field_kb.c(-128);
        return;
    }

    private final void a(boolean param0, int param1, ll param2, boolean param3, int param4, qb param5) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        byte[] var17 = null;
        int var13_intLifetime1;
        int var13_intLifetime2;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param2 == null) {
            return;
          }
          param1 = param1 + param5.field_x;
          param4 = param4 + param5.field_o;
          var7_int = param1 + param4 * this.field_y;
          var8 = 0;
          var9 = param5.field_y;
          var10 = param5.field_q;
          var11 = this.field_y - var10;
          if (param4 < 0) {
            var13_int = 0 - param4;
            var7_int = var7_int + var13_int * this.field_y;
            var8 = var8 + var10 * var13_int;
            param4 = 0;
            var9 = var9 - var13_int;
          }
          if (param0) {
            return;
          }
          var12 = 0;
          if (var9 + param4 > this.field_H - 1) {
            var9 = var9 - (1 - this.field_H + param4 + var9);
          }
          if (param1 < 0) {
            var13_intLifetime1 = -param1 + 0;
            var8 = var8 + var13_intLifetime1;
            param1 = 0;
            var11 = var11 + var13_intLifetime1;
            var7_int = var7_int + var13_intLifetime1;
            var12 = var12 + var13_intLifetime1;
            var10 = var10 - var13_intLifetime1;
          }
          if ((this.field_y - 1) < (param1 + var10)) {
            var13_intLifetime2 = -this.field_y + 1 + var10 + param1;
            var10 = var10 - var13_intLifetime2;
            var11 = var11 + var13_intLifetime2;
            var12 = var12 + var13_intLifetime2;
          }
          if (var10 > 0 &&
            0 < var9) {
            var17 = new byte[param5.field_A.length];
            var16 = var17;
            var13 = var16;
            var14 = 0;
            while (var14 < param5.field_A.length) {
              var13[var14] = (byte)hk.field_p[this.field_O].a(param5.field_A[var14], 510);
              var14++;
              if (var15 != 0) {
                return;
              }
            }
            vn.a(var17, var10, var8, 115, var7_int, var12, var9, param2.field_m, var11, param3);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("nf.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    private final boolean j(byte param0) {
        boolean stackIn_9_0 = false;
        if (param0 > -62) {
          this.field_Ab = (int[]) null;
        }
        stackIn_9_0 = ((this.field_Gb &&
          !(this.field_zb)) ||
          this.field_Mb);
        return stackIn_9_0;
    }

    private final void a(int param0, ol param1) {
        int stackIn_312_0 = 0;
        int stackIn_312_1 = 0;
        int stackIn_320_0 = 0;
        int stackIn_339_0 = 0;
        int stackIn_456_0 = 0;
        int stackIn_456_1 = 0;
        int stackIn_470_0 = 0;
        int stackIn_470_1 = 0;
        int stackIn_480_0 = 0;
        int stackIn_480_1 = 0;
        int stackIn_501_0 = 0;
        int stackIn_522_0 = 0;
        int stackIn_522_1 = 0;
        int stackIn_524_0 = 0;
        int stackIn_524_1 = 0;
        ml stackIn_541_0 = null;
        int stackIn_631_0 = 0;
        int stackIn_631_1 = 0;
        ml stackIn_689_0 = null;
        ml stackIn_689_1 = null;
        RuntimeException stackIn_717_0 = null;
        StringBuilder stackIn_717_1 = null;
        String stackIn_718_2 = null;
        RuntimeException decompiledCaughtException = null;
        ge var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ml var12 = null;
        mi var13_ref_mi = null;
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
        Object var24_ref = null;
        mi var24_ref_mi = null;
        int var24 = 0;
        ml var24_ref_ml = null;
        int[] var24_ref_int__ = null;
        int var25_int = 0;
        mi var25 = null;
        ml var25_ref = null;
        int[] var25_array = null;
        int var26 = 0;
        double var26_double = 0.0;
        int[] var26_ref_int__ = null;
        mi var26_ref_mi = null;
        int var27 = 0;
        int[] var27_ref_int__ = null;
        mi var27_ref_mi = null;
        mi var28 = null;
        double var28_double = 0.0;
        int var28_int = 0;
        ml var28_ref = null;
        qb var29 = null;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        mi var46 = null;
        int var47 = 0;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        mi var24_ref_miLifetime1;
        mi var24_ref_miLifetime2;
        mi var24_ref_miLifetime3;
        mi var24_ref_miLifetime4;
        mi var24_ref_miLifetime5;
        mi var24_ref_miLifetime6;
        mi var24_ref_miLifetime7;
        mi var24_ref_miLifetime8;
        mi var24_ref_miLifetime9;
        mi var24_ref_miLifetime10;
        mi var24_ref_miLifetime11;
        mi var24_ref_miLifetime12;
        mi var24_ref_miLifetime13;
        mi var24_ref_miLifetime14;
        mi var24_ref_miLifetime15;
        mi var24_ref_miLifetime16;
        mi var24_ref_miLifetime17;
        mi var24_ref_miLifetime18;
        mi var24_ref_miLifetime19;
        mi var24_ref_miLifetime20;
        mi var24_ref_miLifetime21;
        ml var24_ref_mlLifetime1;
        ml var24_ref_mlLifetime2;
        ml var24_ref_mlLifetime3;
        ml var24_ref_mlLifetime4;
        ml var24_ref_mlLifetime5;
        ml var24_ref_mlLifetime6;
        ml var24_ref_mlLifetime7;
        ml var24_ref_mlLifetime8;
        ml var24_ref_mlLifetime9;
        ml var24_ref_mlLifetime10;
        ml var24_ref_mlLifetime11;
        ml var24_ref_mlLifetime12;
        ml var24_ref_mlLifetime13;
        ml var24_ref_mlLifetime14;
        ml var24_ref_mlLifetime15;
        ml var24_ref_mlLifetime16;
        ml var24_ref_mlLifetime17;
        ml var24_ref_mlLifetime18;
        ml var24_ref_mlLifetime19;
        ml var24_ref_mlLifetime20;
        ml var24_ref_mlLifetime21;
        ml var24_ref_mlLifetime22;
        ml var24_ref_mlLifetime23;
        mi var25Lifetime1;
        mi var25Lifetime2;
        mi var25Lifetime3;
        mi var25Lifetime4;
        mi var25Lifetime5;
        mi var25Lifetime6;
        mi var25Lifetime7;
        mi var25Lifetime8;
        mi var25Lifetime9;
        mi var25Lifetime10;
        mi var25Lifetime11;
        mi var25Lifetime12;
        mi var25Lifetime13;
        mi var25Lifetime14;
        mi var25Lifetime15;
        mi var25Lifetime16;
        mi var25Lifetime17;
        mi var25Lifetime18;
        mi var25Lifetime19;
        mi var26_ref_miLifetime1;
        mi var28Lifetime1;
        mi var28Lifetime2;
        mi var25Lifetime20;
        mi var24_ref_miLifetime9Lifetime1;
        mi var24_ref_miLifetime13Lifetime1;
        mi var24_ref_miLifetime13Lifetime2;
        mi var24_ref_miLifetime15Lifetime1;
        mi var24_ref_miLifetime16Lifetime1;
        mi var24_ref_miLifetime17Lifetime1;
        mi var24_ref_miLifetime17Lifetime2;
        ml var24_ref_mlLifetime5Lifetime1;
        ml var24_ref_mlLifetime6Lifetime1;
        mi var25Lifetime3Lifetime1;
        mi var25Lifetime5Lifetime1;
        mi var25Lifetime11Lifetime1;
        mi var25Lifetime11Lifetime2;
        mi var25Lifetime11Lifetime3;
        mi var25Lifetime12Lifetime1;
        mi var25Lifetime13Lifetime1;
        mi var25Lifetime15Lifetime1;
        int stackIn_501_0Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        int var11Lifetime8;
        int var11Lifetime9;
        int var11Lifetime10;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var24Lifetime3;
        int var24Lifetime4;
        int var24Lifetime5;
        int var24Lifetime6;
        int var24Lifetime7;
        int var24Lifetime8;
        int var25_intLifetime1;
        int var25_intLifetime2;
        int var25_intLifetime3;
        int var25_intLifetime4;
        int var25_intLifetime5;
        int var25_intLifetime6;
        int var25_intLifetime7;
        int var26Lifetime1;
        int var26Lifetime2;
        int var26Lifetime3;
        int var26Lifetime4;
        int var26Lifetime5;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        var24_ref = null;
        var47 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.j((byte) -82)) {
            throw new IllegalStateException();
          }
          var3 = (ge) (this.field_Db.c(true));
          if (var3 == null) {
            return;
          }
          this.field_Z = false;
          this.field_tb = 0;
          var4 = var3.field_t;
          var5 = var3.field_o;
          var6 = var3.field_j;
          var7 = var3.field_q;
          var8 = var3.field_s;
          var9 = var3.field_k;
          var10 = var3.field_m;
          var11 = var3.field_h;
          if (var4 < 0) {
            throw new IllegalArgumentException();
          }
          if (this.field_ub) {
            throw new IllegalStateException();
          }
          var12 = this.a(var5, true);
          if (var12 == null) {
            return;
          }
          if (var10 == 157) {
            if (param1 != null) {
              param1.a(-85, var12);
              if (this.field_sb != null &&
                this.field_sb[225] != null) {
                ti.a((byte) -30, to.field_r[225], this.field_sb[225]);
              }
            }
            return;
          }
          if (var10 == 158) {
            if (var8 == 0) {
              var12.field_M = -1;
            }
            if (var8 == 1) {
              var12.field_M = 1;
            }
            if (var8 == 2) {
              var12.field_E = -1;
              var12.field_M = 2;
            }
            if (var8 == 3) {
              var12.field_E = -1;
              var12.field_M = 3;
            }
            if (4 == var8) {
              var12.field_M = 2;
              var12.field_E = 1;
            }
            var11--;
            if (5 == var8) {
              var12.field_M = 3;
              var12.field_E = 1;
            }
            if (var11 > 0) {
              var3.field_h = var11;
              this.field_Db.a((pg) (var3), (byte) -58);
            }
            return;
          }
          if (var10 == 159) {
            this.e(var4, false);
            return;
          }
          boolean decompiledFrameCompleted14 = true;
          if (null == var12.field_s) {
            var13_ref_mi = (mi) (this.field_Kb.b(12623));
            while (var13_ref_mi != null) {
              if (var47 != 0) {
                decompiledFrameCompleted14 = false;
                break;
              }
              if (var12 == var13_ref_mi.field_t &&
                var13_ref_mi.field_I == 107) {
                var13_ref_mi.f(0);
              }
              var13_ref_mi = (mi) (this.field_Kb.a(0));
            }
          }
          if ((decompiledFrameCompleted14) &&
            (var6 < -640)) {
            var6 = -640;
          }
          if (this.field_sb != null &&
            null != this.field_sb[64 + var10]) {
            ti.a((byte) -30, to.field_r[64 + var10], this.field_sb[64 + var10]);
          }
          if (var7 < -480) {
            var7 = -480;
          }
          if (var6 > this.field_y + 640) {
            var6 = 640 + this.field_y;
          }
          if ((480 + this.field_H) < var7) {
            var7 = this.field_H + 480;
          }
          var13 = var6 - var12.field_lb;
          var14 = (var12.field_Y >> 1) + var7 - var12.field_db;
          var15 = var13 * var13 + var14 * var14;
          if (var15 <= 0) {
            return;
          }
          var15Lifetime1 = am.a(var14, var13, false);
          this.field_mb = var8;
          if (var13 <= 0) {
            var12.field_E = -1;
          }
          if (var13 > 0 ||
            var47 != 0) {
            var12.field_E = 1;
          }
          this.field_t = var9;
          if (!this.field_Gb) {
            if (1 == rd.field_e[var10] &&
              var8 == -1000 &&
              var15Lifetime1 > 32) {
              var11 = 0;
            }
            if (2 == rd.field_e[var10] ||
              rd.field_e[var10] == 4) {
              var9 = var7;
              var8 = var6;
            }
            if (var10 == 4 &&
              this.b(-var12.field_Y + var9, 2, var8 - (var12.field_Y >> 1), var12.field_w) &&
              32 < var15Lifetime1) {
              var11 = 0;
            }
          }
          if (rd.field_e[var10] == 0 &&
            var12.t(44)) {
            this.field_Z = true;
          }
          this.field_Y = var10;
          var16 = 0;
          var17 = 8;
          var18 = -1;
          var19 = 1;
          if (62 == var10) {
            var18 = 52;
          }
          if (131 == var10) {
            var18 = 52;
          }
          if (var10 == 63) {
            var18 = 53;
            var19 = 1;
            var16 = 1;
          }
          if (66 == var10) {
            var18 = 54;
          }
          if (var10 == 69) {
            var18 = 56;
          }
          if (0 == var10) {
            var18 = 74;
          }
          if (10 == var10) {
            var18 = 2;
            var19 = 0;
          }
          if (var10 == 12) {
            var18 = 10;
          }
          if (var10 == 13) {
            var18 = 11;
          }
          if (14 == var10) {
            var19 = 1;
            var16 = 1;
            var18 = 12;
          }
          if (var10 == 15) {
            var18 = 13;
            var19 = 1;
            var16 = 1;
          }
          if (var10 == 16) {
            var18 = 68;
          }
          if (72 == var10) {
            var18 = 106;
          }
          if (var10 == 135) {
            var18 = 106;
          }
          if (var10 == 82) {
            var18 = 107;
          }
          if (var10 == 84) {
            var18 = 115;
          }
          if (var10 == 85) {
            var19 = 1;
            var18 = 116;
            var16 = 1;
          }
          if (86 == var10) {
            var18 = 118;
            var11 = 48;
          }
          if (var10 == 149) {
            var11 = 48;
            var18 = 118;
          }
          if (var10 == 87) {
            var18 = 119;
            var11 = 48;
          }
          if (99 == var10) {
            var18 = 140;
          }
          if (96 == var10) {
            var18 = 133;
          }
          if (var10 == 18) {
            var18 = 73;
            var11 = 48;
            var19 = 0;
          }
          if (var10 == 19) {
            var19 = 1;
            var18 = 67;
            var16 = 1;
          }
          if (var10 == 52) {
            var18 = 45;
          }
          if (var10 == 74) {
            var18 = 61;
          }
          if (50 == var10) {
            var11 = 48;
            var18 = 75;
          }
          if (var10 == 51) {
            var18 = 44;
          }
          if (var10 == 48) {
            var18 = 40;
          }
          if (var10 == 49) {
            var19 = 1;
            var18 = 41;
            var16 = 1;
          }
          if (var10 == 80) {
            var18 = 66;
          }
          if (var10 == 121) {
            var18 = 97;
            var11 = 48;
          }
          if (122 == var10) {
            var18 = 40;
          }
          if (var10 == 123) {
            var18 = 78;
            var19 = 0;
          }
          if (var10 == 137) {
            var19 = 0;
            var18 = 78;
          }
          if (var10 == 138) {
            var18 = 78;
            var19 = 0;
          }
          if (var10 == 155) {
            var19 = 0;
            var12.field_F = -3.0;
            var18 = 78;
          }
          if (24 == var10) {
            var11 = 48;
            var18 = 81;
          }
          if (var10 == 26) {
            var18 = 22;
          }
          if (var10 == 28) {
            var17 = 16;
            var18 = 24;
          }
          if (var10 == 25) {
            var18 = 21;
          }
          if (var10 == 27) {
            var17 = 16;
            var18 = 23;
          }
          if (29 == var10) {
            var17 = 16;
            var18 = 25;
            var19 = 1;
          }
          if (var10 == 124) {
            var18 = 79;
          }
          if (var10 == 125) {
            var18 = 80;
            var19 = 0;
          }
          if (36 == var10) {
            var18 = 84;
            var11 = 48;
          }
          if (var10 == 126) {
            var18 = 84;
            var11 = 48;
          }
          if (var10 == 88) {
            var18 = 120;
          }
          if (var10 == 89) {
            var16 = 1;
            var18 = 122;
            var19 = 1;
          }
          if (var10 == 1) {
            var19 = 1;
            var18 = 147;
            var16 = 1;
          }
          if (var10 == 3) {
            var18 = 148;
          }
          if (var10 == 102) {
            var18 = 144;
            var19 = 0;
            var11 = 48;
          }
          if (var10 == 103) {
            var16 = 1;
            var18 = 146;
            var19 = 1;
          }
          if (var10 == 108) {
            var19 = 0;
            var18 = 156;
          }
          if (var10 == 109) {
            var18 = 157;
            var19 = 0;
          }
          if (var10 == 110) {
            var18 = 158;
            var19 = 0;
          }
          if (var10 == 113) {
            var19 = 0;
            var18 = 161;
          }
          if (var10 == 115) {
            var18 = 162;
          }
          if (116 == var10) {
            if (this.b(116, -102, var12.field_u) > 0) {
              return;
            }
            var19 = 1;
            var11 = 48;
            var18 = 164;
          }
          if (var10 == 117) {
            var16 = 1;
            var19 = 1;
            var18 = 165;
          }
          if ((130 == var10 ||
            var10 == 127 ||
            128 == var10 ||
            var10 == 129 ||
            var10 == 136 ||
            var10 == 155) &&
            Math.abs(var13) < Math.abs(var14)) {
            var14 = (var14 >= 0) && (var47 == 0) ? (64) : (-64);
            var13 = 64 * var12.field_E;
            var15Lifetime1 = am.a(var14, var13, false);
          }
          if (var10 == 127) {
            var11 = 48;
            var18 = 91;
            var12.field_F = -3.0;
          }
          if (128 == var10) {
            var18 = 92;
            var11 = 48;
            var12.field_F = -3.0;
          }
          if (var10 == 129) {
            var12.field_F = -3.0;
            var11 = 48;
            var18 = 93;
          }
          if (var10 == 136) {
            var12.field_F = -3.0;
            var18 = 113;
            var11 = 48;
          }
          if (var10 == 38 ||
            var10 == 133) {
            var18 = 69;
          }
          if (var10 == 40) {
            var19 = 1;
            var16 = 1;
            var18 = 33;
          }
          if (var10 == 37) {
            var18 = 31;
            var19 = 1;
            var11 = 48;
          }
          if (var10 == 41 ||
            var10 == 134) {
            var18 = 70;
          }
          if (var10 == 43) {
            var18 = 34;
            var19 = 1;
            var17 = 16;
          }
          var17 += 2;
          if (var10 == 130) {
            var18 = 98;
          }
          if (var16 != 0 &&
            !var12.s(-1) &&
            !var12.g((byte) 113)) {
          }
          var20 = (var12.field_Y / 2 + (var17 + 4)) * var13 / var15Lifetime1;
          var21 = (var12.field_Y / 2 + var17 + 4) * var14 / var15Lifetime1 - var12.field_Y / 2;
          var22 = var11 * var13 / var15Lifetime1;
          var23 = var14 * var11 / var15Lifetime1;
          if (var19 != 0) {
            var21 = var17 * var14 / var15Lifetime1 - var12.field_Y / 2;
            if (var11 < 10) {
              var11 = 10;
            }
            var20 = var13 * var17 / var15Lifetime1;
            var23 = var11 * var14 / var15Lifetime1;
            var22 = var11 * var13 / var15Lifetime1;
          }
          if (var18 >= 0) {
            if (var22 > 0) {
              var12.field_E = 1;
            }
            if (var22 <= 0 ||
              var47 != 0) {
              var12.field_E = -1;
            }
            boolean decompiledFrameCompleted13 = true;
            boolean decompiledFrameCompleted12 = true;
            if (var18 == 69 ||
              var18 == 70 ||
              var18 == 68 ||
              var18 == 157) {
              var24_ref_mi = (mi) (this.field_Kb.b(12623));
              while (var24_ref_mi != null) {
                stackIn_312_0 = var18;
                stackIn_312_1 = var24_ref_mi.field_I;
                if (var47 != 0) {
                  decompiledFrameCompleted13 = false;
                  break;
                }
                if (stackIn_312_0 == stackIn_312_1 &&
                  var24_ref_mi.field_t == var12) {
                  var24_ref_mi.f(0);
                }
                var24_ref_mi = (mi) (this.field_Kb.a(0));
              }
            }
            if (decompiledFrameCompleted13) {
              var24_ref_mi = (mi) (this.field_Kb.b(12623));
              while (var24_ref_mi != null) {
                stackIn_312_0 = 69;
                stackIn_312_1 = var24_ref_mi.field_I;
                if (var47 != 0) {
                  decompiledFrameCompleted12 = false;
                  break;
                }
                if (stackIn_312_0 == stackIn_312_1) {
                  var24_ref_mi.field_y = 0;
                }
                var24_ref_mi = (mi) (this.field_Kb.a(0));
              }
              if (decompiledFrameCompleted12) {
                this.a((byte) 80, var10, var4);
                var24_ref_mi = j.a(var12, var12.field_db + var21, (byte) 36, this, var10, var12.field_lb + var20, var18);
                var24_ref_mi.field_F = 8 * var23;
                var24_ref_mi.field_u = var22 * 8;
                this.b(52, var24_ref_mi);
                stackIn_312_0 = var18;
                stackIn_312_1 = 119;
              }
            }
            if (stackIn_312_0 != stackIn_312_1 &&
              var18 != 164) {
              this.field_D = true;
            }
            var11Lifetime1 = 0;
            if (param1 != null) {
              param1.a(var24_ref_mi, -126);
            }
          }
          boolean decompiledFrameCompleted11 = true;
          if (var10 == 119) {
            var24 = 0;
            while (true) {
              stackIn_320_0 = ~this.field_q;
              if (stackIn_320_0 < ~var24) {
                stackIn_339_0 = 0;
                if (var47 != 0) {
                  decompiledFrameCompleted11 = false;
                  break;
                }
                var25_int = stackIn_339_0;
                while (16 > var25_int) {
                  this.field_lb[var24][var25_int] = 0;
                  stackIn_320_0 = ~this.field_v[var24][var25_int];
                  if (stackIn_320_0 != 0 &&
                    this.field_v[var24][var25_int] < 156 &&
                    this.field_v[var24][var25_int] != 119) {
                    this.field_vb[var24][var25_int] = hh.field_b[this.field_v[var24][var25_int]];
                    if (-1 == this.field_vb[var24][var25_int]) {
                      this.field_vb[var24][var25_int] = 1;
                    } else if (0 == this.field_vb[var24][var25_int]) {
                      this.field_vb[var24][var25_int] = -1;
                    }
                  } else {
                    this.field_v[var24][var25_int] = -1;
                  }
                  var25_int++;
                }
                var24++;
                continue;
              }
              break;
            }
            if (decompiledFrameCompleted11) {
              this.field_D = true;
            }
          }
          if (decompiledFrameCompleted11) {
            stackIn_339_0 = 78;
          }
          if (stackIn_339_0 == var10) {
            this.a((byte) 80, var10, var4);
            var24_ref_ml = new ml(12, var8, var9, this.h(-111), this, var12);
            this.a((byte) -120, var24_ref_ml);
            var8 = -1000;
            this.field_D = true;
          }
          if (var10 == 23) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime1 = new ml(13, var8, var9, this.h(-92), this, var12);
            this.a((byte) -124, var24_ref_mlLifetime1);
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (118 == var10) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime2 = new ml(39, var8, var9, this.h(-98), this, var12);
            var8 = -1000;
            this.a((byte) -116, var24_ref_mlLifetime2);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 59) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime3 = new ml(15, var8, var9, this.h(-107), this, var12);
            var8 = -1000;
            this.a((byte) -123, var24_ref_mlLifetime3);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 47) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime4 = new ml(14, var8, var9, this.h(-119), this, var12);
            var8 = -1000;
            this.a((byte) -120, var24_ref_mlLifetime4);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 98) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime5 = new ml(28, -32 + var8, var9, this.h(-81), this, var12);
            this.a((byte) -124, var24_ref_mlLifetime5);
            var25 = aj.a(var24_ref_mlLifetime5, var24_ref_mlLifetime5.field_db, false, 138, this, var24_ref_mlLifetime5.field_lb);
            this.b(52, var25);
            var24_ref_mlLifetime5Lifetime1 = new ml(28, 32 + var8, var9, this.h(-98), this, var12);
            this.a((byte) -124, var24_ref_mlLifetime5Lifetime1);
            var25Lifetime20 = aj.a(var24_ref_mlLifetime5Lifetime1, var24_ref_mlLifetime5Lifetime1.field_db, false, 138, this, var24_ref_mlLifetime5Lifetime1.field_lb);
            this.b(52, var25Lifetime20);
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 2;
          }
          if (92 == var10) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime6 = new ml(33, var8 - 32, var9, this.h(-113), this, var12);
            this.a((byte) -119, var24_ref_mlLifetime6);
            var24_ref_mlLifetime6Lifetime1 = new ml(33, var8 + 32, var9, this.h(-118), this, var12);
            var8 = -1000;
            this.a((byte) -128, var24_ref_mlLifetime6Lifetime1);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 2;
          }
          if (90 == var10) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime7 = new ml(31, var8, var9, this.h(-80), this, var12);
            this.a((byte) -119, var24_ref_mlLifetime7);
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (107 == var10) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime8 = new ml(32, var8, var9, this.h(-124), this, var12);
            this.a((byte) -128, var24_ref_mlLifetime8);
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 56) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime9 = new ml(4, var8, var9, this.h(-120), this, var12);
            this.a((byte) -116, var24_ref_mlLifetime9);
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 112) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime10 = new ml(37, var8, var9, this.h(-93), this, var12);
            var8 = -1000;
            this.a((byte) -118, var24_ref_mlLifetime10);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (104 == var10) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime11 = new ml(34, var8, var9, this.h(-107), this, var12);
            this.a((byte) -121, var24_ref_mlLifetime11);
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 64) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime12 = new ml(6, var8, var9, this.h(-122), this, var12);
            this.a((byte) -127, var24_ref_mlLifetime12);
            var8 = -1000;
            this.field_D = true;
            var25Lifetime1 = j.a(var24_ref_mlLifetime12, var24_ref_mlLifetime12.field_db, (byte) 17, this, var10, var24_ref_mlLifetime12.field_lb, 55);
            var25Lifetime1.field_H = 4;
            this.b(52, var25Lifetime1);
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 44) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime13 = new ml(25, var8, var9, this.h(-122), this, var12);
            var8 = -1000;
            this.a((byte) -119, var24_ref_mlLifetime13);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 57) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime14 = new ml(5, var8, var9, this.h(-98), this, var12);
            this.a((byte) -120, var24_ref_mlLifetime14);
            var8 = -1000;
            var25Lifetime2 = j.a(var24_ref_mlLifetime14, -480, (byte) -103, this, var10, var8, 71);
            var25Lifetime2.field_u = 0;
            var25Lifetime2.field_F = 0;
            this.b(52, var25Lifetime2);
            this.field_ob[var4] = this.field_ob[var4] + 1;
            this.field_D = true;
          }
          if (var10 == 42) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime15 = new ml(3, var8, var9, this.h(-91), this, var12);
            this.a((byte) -115, var24_ref_mlLifetime15);
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (65 == var10) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime16 = new ml(7, var8, var9, this.h(-82), this, var12);
            this.a((byte) -121, var24_ref_mlLifetime16);
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 67) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime17 = new ml(8, var8, var9, this.h(-99), this, var12);
            var8 = -1000;
            this.a((byte) -127, var24_ref_mlLifetime17);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 6) {
            this.a((byte) 80, var10, var4);
            this.a((byte) -115, new ml(11, -32 + var8, var9, this.h(-93), this, var12));
            this.a((byte) -120, new ml(11, var8, var9 - 16, this.h(-84), this, var12));
            this.a((byte) -121, new ml(11, var8 + 32, var9, this.h(-120), this, var12));
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 32) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime18 = new ml(1, var8, var9, this.h(-77), this, var12);
            var8 = -1000;
            this.a((byte) -115, var24_ref_mlLifetime18);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 33) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime19 = new ml(2, var8, var9, this.h(-78), this, var12);
            var8 = -1000;
            this.a((byte) -120, var24_ref_mlLifetime19);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 79) {
            this.a((byte) 80, var10, var4);
            this.a((byte) -116, new ml(10, var8 - 32, var9, this.h(-76), this, var12));
            this.a((byte) -124, new ml(10, var8, -16 + var9, this.h(-87), this, var12));
            this.a((byte) -127, new ml(10, var8 + 32, var9, this.h(-108), this, var12));
            var8 = -1000;
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 77) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime20 = new ml(9, var8, var9, this.h(-83), this, var12);
            var8 = -1000;
            this.a((byte) -124, var24_ref_mlLifetime20);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (76 == var10) {
            this.a((byte) 80, var10, var4);
            var24_ref_mlLifetime21 = new ml(17, var8, var9, this.h(-112), this, var12);
            var8 = -1000;
            this.a((byte) -118, var24_ref_mlLifetime21);
            this.field_D = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 54) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime1 = j.a(var12, var12.field_db, (byte) -106, this, var10, var12.field_lb, 72);
            this.b(52, var24_ref_miLifetime1);
          }
          if (var10 == 39 ||
            var10 == 153) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime2 = j.a(var12, var12.field_db, (byte) 37, this, var10, var12.field_lb, 32);
            this.b(52, var24_ref_miLifetime2);
            if (153 == var10) {
              var12.field_z = true;
              var12.field_ib = 0;
            }
            this.field_D = true;
          }
          if (var10 == 106) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime3 = j.a(var12, var12.field_db, (byte) -110, this, var10, var12.field_lb, 136);
            this.b(52, var24_ref_miLifetime3);
            this.field_D = true;
          }
          if (var10 == 8) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime4 = j.a(var12, var12.field_db, (byte) -97, this, var10, var12.field_lb, 83);
            this.b(52, var24_ref_miLifetime4);
            this.field_D = true;
          }
          if (var10 == 26) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime5 = j.a(var12, var12.field_db, (byte) -113, this, var10, var12.field_lb, 22);
            this.b(52, var24_ref_miLifetime5);
            this.field_D = true;
          }
          if (var10 == 35) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime6 = j.a(var12, this.field_H, (byte) -96, this, var10, var8, 29);
            this.b(52, var24_ref_miLifetime6);
            this.field_D = true;
          }
          if (var10 == 73) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime7 = j.a(var12, -480, (byte) -96, this, var10, var8, 60);
            this.b(52, var24_ref_miLifetime7);
            this.field_D = true;
          }
          if (120 == var10) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime8 = j.a(var12, var12.field_db, (byte) -101, this, var10, var12.field_lb, 77);
            this.b(52, var24_ref_miLifetime8);
            this.field_D = true;
          }
          if (60 == var10) {
            this.a((byte) 80, var10, var4);
            var12.field_jb = 23;
            var12.e((byte) 6);
            this.a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, -(var12.field_Y >> 1) + (var12.field_db - 10));
            i.a(this.field_V, -var12.field_Y + var12.field_db, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, this, var12.field_w, 0);
            this.i((byte) 86);
            var11Lifetime2 = 0;
            this.field_D = true;
            var24_ref_miLifetime9 = aj.a(var12, var12.field_db - var12.field_Y / 2, false, 103, this, var12.field_lb);
            this.b(52, var24_ref_miLifetime9);
            var24_ref_miLifetime9Lifetime1 = j.a(var12, -(var12.field_Y / 2) + var12.field_db, (byte) -107, this, var10, var12.field_lb, 111);
            var24_ref_miLifetime9Lifetime1.field_H = 4;
            this.b(52, var24_ref_miLifetime9Lifetime1);
          }
          if (var10 == 81) {
            this.a((byte) 80, var10, var4);
            var12.field_jb = 24;
            var12.e((byte) 6);
            this.a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, -10 + (var12.field_db - (var12.field_Y >> 1)));
            i.a(this.field_V, var12.field_db - var12.field_Y, var12.field_lb - (var12.field_Y >> 1), (byte) 0, this, var12.field_w, 0);
            this.i((byte) 86);
            this.field_D = true;
            var11Lifetime3 = 0;
            var24_ref_miLifetime10 = aj.a(var12, -(var12.field_Y / 2) + var12.field_db, false, 108, this, var12.field_lb);
            this.b(52, var24_ref_miLifetime10);
          }
          if (91 == var10) {
            this.a((byte) 80, var10, var4);
            var12.field_jb = 35;
            var12.e((byte) 6);
            this.a(var12.field_lb, (var12.field_Y >> 1) + 10, (byte) 51, -10 + (-(var12.field_Y >> 1) + var12.field_db));
            i.a(this.field_V, -var12.field_Y + var12.field_db, var12.field_lb - (var12.field_Y >> 1), (byte) 0, this, var12.field_w, 0);
            this.i((byte) 86);
            this.field_D = true;
            var11Lifetime4 = 0;
            var24_ref_miLifetime11 = aj.a(var12, var12.field_db - var12.field_Y / 2, false, 154, this, var12.field_lb);
            this.b(52, var24_ref_miLifetime11);
          }
          boolean decompiledFrameCompleted10 = true;
          if (var10 == 61) {
            this.a((byte) 80, var10, var4);
            var24Lifetime1 = gf.a((var9 + 480) * 32 / 4, -266740663);
            var25_intLifetime1 = -96 + 192 * (1 & var8);
            var26 = 1;
            var27 = 0;
            while (var27 < 7) {
              var26 = -var26;
              var28 = j.a(var12, -544, (byte) 55, this, var10, -(var24Lifetime1 * (var25_intLifetime1 * var26) / 16) + (48 * var27 - 144 + var8), 50);
              var28.field_u = var26 * var25_intLifetime1;
              var28.field_F = 0;
              this.b(52, var28);
              var27++;
              if (var47 != 0) {
                decompiledFrameCompleted10 = false;
                break;
              }
            }
            if (decompiledFrameCompleted10) {
              this.field_D = true;
            }
          }
          if (var10 == 68) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime12 = j.a(var12, var9, (byte) -104, this, var10, var8, 55);
            this.b(52, var24_ref_miLifetime12);
            this.field_D = true;
          }
          if (var10 == 9) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime13 = j.a(var12, -24 + var9, (byte) 121, this, var10, var8, 3);
            this.b(52, var24_ref_miLifetime13);
            var24_ref_miLifetime13Lifetime1 = j.a(var12, -11 + var9, (byte) -122, this, var10, -8 + var8, 3);
            this.b(52, var24_ref_miLifetime13Lifetime1);
            var24_ref_miLifetime13Lifetime2 = j.a(var12, var9 - 12, (byte) -114, this, var10, 8 + var8, 3);
            this.b(52, var24_ref_miLifetime13Lifetime2);
            this.field_D = true;
          }
          boolean decompiledFrameCompleted9 = true;
          if (var10 == 7) {
            this.a((byte) 80, var10, var4);
            n.field_d.a((byte) 96, this.field_i);
            var24_ref_mlLifetime22 = (ml) (n.field_d.b(-74));
            while (var24_ref_mlLifetime22 != null) {
              stackIn_456_0 = -12;
              stackIn_456_1 = ~var24_ref_mlLifetime22.field_jb;
              if (var47 != 0) {
                decompiledFrameCompleted9 = false;
                break;
              }
              if (stackIn_456_0 == stackIn_456_1) {
                var25Lifetime3 = aj.a(this.a(var24_ref_mlLifetime22.field_u, true), var24_ref_mlLifetime22.field_db, false, 101, this, var24_ref_mlLifetime22.field_lb);
                this.b(52, var25Lifetime3);
                var25Lifetime3Lifetime1 = j.a(var12, var24_ref_mlLifetime22.field_db, (byte) 38, this, var10, var24_ref_mlLifetime22.field_lb, 74);
                var25Lifetime3Lifetime1.field_y = -(var24_ref_mlLifetime22.field_ib / 2) + 20;
                var25Lifetime3Lifetime1.field_u = 0;
                var25Lifetime3Lifetime1.field_F = -var24_ref_mlLifetime22.field_ib;
                this.b(52, var25Lifetime3Lifetime1);
                var24_ref_mlLifetime22.field_ib = 0;
                var24_ref_mlLifetime22.d(var4, 116);
              }
              var24_ref_mlLifetime22 = (ml) (n.field_d.d(-18502));
            }
            if (decompiledFrameCompleted9) {
              this.field_D = true;
            }
          }
          if (decompiledFrameCompleted9) {
            stackIn_456_0 = -96;
            stackIn_456_1 = ~var10;
          }
          if (stackIn_456_0 == stackIn_456_1) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime14 = j.a(var12, var12.field_db, (byte) 95, this, var10, var12.field_lb, 127);
            this.b(52, var24_ref_miLifetime14);
            this.field_D = true;
          }
          boolean decompiledFrameCompleted8 = true;
          if (var10 == 94) {
            this.a((byte) 80, var10, var4);
            n.field_d.a((byte) 83, this.field_Kb);
            var24_ref_miLifetime15 = (mi) (n.field_d.b(-105));
            while (var24_ref_miLifetime15 != null) {
              stackIn_470_0 = ~var24_ref_miLifetime15.field_I;
              stackIn_470_1 = -127;
              if (var47 != 0) {
                decompiledFrameCompleted8 = false;
                break;
              }
              if (stackIn_470_0 == stackIn_470_1) {
                var24_ref_miLifetime15.f(0);
              }
              if (var24_ref_miLifetime15.field_I == 117) {
                var24_ref_miLifetime15.a(0, 0, 16, 8);
              }
              var24_ref_miLifetime15 = (mi) (n.field_d.d(-18502));
            }
            if (decompiledFrameCompleted8) {
              var24_ref_miLifetime15Lifetime1 = j.a(var12, 0, (byte) -125, this, var10, var8, 126);
              this.b(52, var24_ref_miLifetime15Lifetime1);
              this.field_D = true;
            }
          }
          if (decompiledFrameCompleted8) {
            stackIn_470_0 = ~var10;
            stackIn_470_1 = -149;
          }
          boolean decompiledFrameCompleted7 = true;
          if (stackIn_470_0 == stackIn_470_1) {
            this.a((byte) 80, var10, var4);
            n.field_d.a((byte) 67, this.field_Kb);
            var24_ref_miLifetime16 = (mi) (n.field_d.b(-57));
            while (var24_ref_miLifetime16 != null) {
              stackIn_480_0 = -124;
              stackIn_480_1 = ~var24_ref_miLifetime16.field_I;
              if (var47 != 0) {
                decompiledFrameCompleted7 = false;
                break;
              }
              if (stackIn_480_0 == stackIn_480_1) {
                var24_ref_miLifetime16.f(0);
              }
              var24_ref_miLifetime16 = (mi) (n.field_d.d(-18502));
            }
            if (decompiledFrameCompleted7) {
              var24_ref_miLifetime16Lifetime1 = j.a(var12, var9, (byte) -105, this, var10, var8, 123);
              this.b(52, var24_ref_miLifetime16Lifetime1);
              this.field_D = true;
            }
          }
          if (decompiledFrameCompleted7) {
            stackIn_480_0 = -94;
            stackIn_480_1 = ~var10;
          }
          boolean decompiledFrameCompleted6 = true;
          if (stackIn_480_0 == stackIn_480_1) {
            this.a((byte) 80, var10, var4);
            n.field_d.a((byte) 40, this.field_Kb);
            var24Lifetime2 = 0;
            var25Lifetime4 = (mi) (n.field_d.b(-83));
            while (var25Lifetime4 != null) {
              stackIn_524_0 = var25Lifetime4.field_I;
              stackIn_524_1 = 123;
              if (var47 != 0) {
                decompiledFrameCompleted6 = false;
                break;
              }
              if (stackIn_524_0 == stackIn_524_1) {
                var25Lifetime4.f(0);
              }
              var25Lifetime4 = (mi) (n.field_d.d(-18502));
            }
            if (decompiledFrameCompleted6) {
              n.field_d.a((byte) 69, this.field_i);
              var25_ref = (ml) (n.field_d.b(-50));
              while (true) {
                if (var25_ref != null) {
                  stackIn_522_0 = -34;
                  stackIn_522_1 = ~var25_ref.field_jb;
                  if (var47 == 0) {
                    if (stackIn_522_0 == stackIn_522_1) {
                      var14Lifetime1 = (var9 - var25_ref.field_db << 4) + 256;
                      var13Lifetime1 = -var25_ref.field_lb + var8 << 4;
                      var26_double = 64.0;
                      var28_double = (double)(var13Lifetime1 * (4 * var13Lifetime1)) / (var26_double * (var26_double * 2.0));
                      var30 = (double)var13Lifetime1;
                      var32 = (double)(var13Lifetime1 * var13Lifetime1 * 4) / (var26_double * (2.0 * var26_double)) - (double)var14Lifetime1;
                      while (true) {
                        if (0.0 != var28_double) {
                          stackIn_501_0 = $cfr$dcmpl(0.0, var30 * var30 - var32 * (var28_double * 4.0));
                          if (stackIn_501_0 > 0 &&
                            768.0 > var26_double) {
                            var26_double = var26_double + 8.0;
                            var28_double = (double)(var13Lifetime1 * var13Lifetime1 * 4) / (2.0 * var26_double * var26_double);
                            var30 = (double)var13Lifetime1;
                            var32 = (double)(-var14Lifetime1) + (double)(var13Lifetime1 * (4 * var13Lifetime1)) / (var26_double * (2.0 * var26_double));
                            continue;
                          }
                        }
                        stackIn_501_0Lifetime1 = $cfr$dcmpl(var28_double, 0.0);
                        if (stackIn_501_0Lifetime1 == 0) {
                          break;
                        }
                        if (!(0.0 <= var30 * var30 - var28_double * 4.0 * var32)) {
                          break;
                        }
                        var34 = (Math.sqrt(-(var32 * (var28_double * 4.0)) + var30 * var30) + -var30) / (var28_double * 2.0);
                        var36 = (-var30 - Math.sqrt(-(var28_double * 4.0 * var32) + var30 * var30)) / (var28_double * 2.0);
                        if (Math.abs(var34) > Math.abs(var36)) {
                          var34 = var36;
                        }
                        var38 = var26_double * var26_double / (1.0 + var34 * var34);
                        var40 = var26_double * var26_double / (1.0 / (var34 * var34) + 1.0);
                        var42 = (int)Math.sqrt(var38);
                        var43 = (int)Math.sqrt(var40);
                        if (var42 > 0 &&
                          var13Lifetime1 < 0) {
                          var42 = -var42;
                        }
                        if (!(0.0 < var34)) {
                          if (var13Lifetime1 > 0) {
                            var43 = -var43;
                          }
                        } else {
                          if (0 > var13Lifetime1) {
                            var43 = -var43;
                          }
                        }
                        var44 = (int)((double)((4 + (var25_ref.field_Y / 2 + var17)) * var42) / var26_double + (double)var25_ref.field_lb);
                        var45 = (int)((double)(-(var12.field_Y / 2)) + ((double)(var43 * (var17 + (var25_ref.field_Y / 2 + 4))) / var26_double + (double)var25_ref.field_db));
                        var46 = j.a(this.a(var25_ref.field_u, true), var45, (byte) -95, this, var10, var44, 125);
                        this.b(52, var46);
                        var46.field_y = 10;
                        if (this.field_x[var25_ref.field_u] == 6) {
                          var46.field_y = var46.field_y - this.field_X[var25_ref.field_u] / 2;
                          if (this.field_X[var25_ref.field_u] == 100) {
                            var24Lifetime2++;
                          }
                        }
                        var46.field_u = var42;
                        var46.field_F = var43;
                        break;
                      }
                    }
                    var25_ref = (ml) (n.field_d.d(-18502));
                    continue;
                  }
                } else {
                  this.field_D = true;
                  stackIn_522_0 = var24Lifetime2;
                  stackIn_522_1 = 4;
                }
                break;
              }
            }
          }
          if (decompiledFrameCompleted6) {
            stackIn_524_0 = -71;
            stackIn_524_1 = ~var10;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted5 = true;
          if (stackIn_524_0 == stackIn_524_1) {
            this.a((byte) 80, var10, var4);
            n.field_d.a((byte) 99, this.field_i);
            var24_ref_mlLifetime23 = (ml) (n.field_d.b(-113));
            while (var24_ref_mlLifetime23 != null) {
              stackIn_541_0 = var24_ref_mlLifetime23.field_s;
              if (var47 != 0) {
                decompiledFrameCompleted5 = false;
                break;
              }
              if (stackIn_541_0 != null &&
                !var24_ref_mlLifetime23.field_U &&
                var24_ref_mlLifetime23.field_jb != 12) {
                var25Lifetime5 = aj.a(this.a(var24_ref_mlLifetime23.field_u, true), var24_ref_mlLifetime23.field_db, false, 103, this, var24_ref_mlLifetime23.field_lb);
                this.b(52, var25Lifetime5);
                var25Lifetime5Lifetime1 = j.a(var12, var24_ref_mlLifetime23.field_db, (byte) 40, this, var10, var24_ref_mlLifetime23.field_lb, 55);
                this.b(52, var25Lifetime5Lifetime1);
                var24_ref_mlLifetime23.field_ib = 0;
                var24_ref_mlLifetime23.d(var4, 24);
              }
              var24_ref_mlLifetime23 = (ml) (n.field_d.d(-18502));
            }
            if (decompiledFrameCompleted5) {
              this.field_D = true;
            }
          }
          if (decompiledFrameCompleted5) {
            if (83 == var10) {
              this.a((byte) 80, var10, var4);
              var12.field_eb = -50;
              var12.field_jb = 18;
              var12.field_z = true;
              var24_ref_miLifetime17 = aj.a(var12, var12.field_db - (var12.field_Y >> 1), false, 108, this, var12.field_lb);
              this.b(52, var24_ref_miLifetime17);
              this.field_D = true;
            }
            decompiledFrameRemainder1 = (var10 == 71);
            if (decompiledFrameRemainder1) {
              this.a((byte) 80, var10, var4);
              var12.field_U = true;
              var12.field_jb = 16;
              stackIn_541_0 = var12;
            }
          }
          if (decompiledFrameRemainder1) {
            if (stackIn_541_0.field_I != null) {
              var12.field_I.a();
              de.d(0, 0, var12.field_I.field_n, var12.field_I.field_w, 0);
              if (null != tk.field_x) {
                var48 = new int[]{255, 0, 0};
                var24_ref_int__ = var48;
                var49 = new int[]{0, 255, 0};
                var25_array = var49;
                var50 = new int[]{0, 0, 255};
                var26_ref_int__ = var50;
                var51 = new int[]{255, 255, 255};
                var27_ref_int__ = var51;
                var28_int = var12.field_u;
                if (0 == var28_int ||
                  var28_int == 3 ||
                  var28_int == 4) {
                  var48[1] = 255;
                  var48[2] = 255;
                }
                if (var28_int == 1 ||
                  var28_int == 3 ||
                  var28_int == 5) {
                  var49[2] = 255;
                  var49[0] = 255;
                }
                if (var28_int == 2 ||
                  4 == var28_int ||
                  var28_int == 5) {
                  var50[0] = 255;
                  var50[2] = 255;
                }
                if (this.field_N != null) {
                  var24_ref_int__[0] = this.field_N[var28_int][0];
                  var24_ref_int__[1] = this.field_N[var28_int][1];
                  var24_ref_int__[2] = this.field_N[var28_int][2];
                  var25_array[0] = this.field_N[var28_int][3];
                  var25_array[1] = this.field_N[var28_int][4];
                  var25_array[2] = this.field_N[var28_int][5];
                  var26_ref_int__[0] = this.field_N[var28_int][6];
                  var26_ref_int__[1] = this.field_N[var28_int][7];
                  var26_ref_int__[2] = this.field_N[var28_int][8];
                  var27_ref_int__[0] = this.field_N[var28_int][9];
                  var27_ref_int__[1] = this.field_N[var28_int][10];
                  var27_ref_int__[2] = this.field_N[var28_int][11];
                }
                var29 = new qb(64, 96);
                var29.a();
                pc.$cfr$intArgs$a$5f050b8899ac(var50, 16, var51, var48, 80, var49, tk.field_x[2], 0);
                var12.field_I.f();
                var12.field_I.a();
                de.d(0, 0, 32, 48, 0);
                var29.a(16, 24, 0, 2048);
                var12.field_I.e();
              }
            }
            var24_ref_miLifetime17Lifetime1 = j.a(var12, var12.field_db, (byte) 32, this, var10, var12.field_lb, 111);
            var24_ref_miLifetime17Lifetime1.field_H = 4;
            this.b(52, var24_ref_miLifetime17Lifetime1);
            var24_ref_miLifetime17Lifetime2 = aj.a((ml) null, var12.field_db - var12.field_Y / 2, false, 103, this, var12.field_lb);
            this.b(52, var24_ref_miLifetime17Lifetime2);
            this.field_D = true;
          }
          if (45 == var10) {
            this.a((byte) 80, var10, var4);
            var12.field_z = true;
            var12.field_eb = -50;
            var12.field_jb = 19;
          }
          if (var10 == 58) {
            this.a((byte) 80, var10, var4);
            var24Lifetime3 = gf.a((480 + var9) * 32 / 4, -266740663);
            var25_intLifetime2 = -96 + (var8 & 1) * 192;
            var26_ref_mi = j.a(var12, -544, (byte) -128, this, var10, var8 - var24Lifetime3 * var25_intLifetime2 / 16, 49);
            var26_ref_mi.field_u = var25_intLifetime2;
            var26_ref_mi.field_F = 0;
            this.b(52, var26_ref_mi);
            this.field_D = true;
          }
          if (var10 == 17) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime18 = j.a(var12, var9, (byte) 103, this, var10, var8, 15);
            this.b(52, var24_ref_miLifetime18);
            this.field_D = true;
          }
          if (var10 == 34) {
            this.a((byte) 80, var10, var4);
            var24Lifetime4 = gf.a((var9 + 480) * 32 / 4, -266740663);
            var25_intLifetime3 = (1 & var8) * 192 - 96;
            var26_ref_miLifetime1 = j.a(var12, -544, (byte) -119, this, var10, var8 - var24Lifetime4 * var25_intLifetime3 / 16, 28);
            var26_ref_miLifetime1.field_u = var25_intLifetime3;
            var26_ref_miLifetime1.field_F = 0;
            this.b(52, var26_ref_miLifetime1);
            this.field_D = true;
          }
          boolean decompiledFrameCompleted4 = true;
          if (var10 == 20) {
            this.a((byte) 80, var10, var4);
            var24Lifetime5 = gf.a((var9 + 480) * 32 / 4, -266740663);
            var25_intLifetime4 = (1 & var8) * 192 - 96;
            var26Lifetime1 = 5;
            if (0 == this.field_x[var4]) {
              var26Lifetime1 = var26Lifetime1 + this.field_X[var4] / 40;
            }
            var27Lifetime1 = 0;
            while (var26Lifetime1 > var27Lifetime1) {
              var28Lifetime1 = j.a(var12, -544, (byte) -94, this, var10, -(var24Lifetime5 * var25_intLifetime4 / 16) + (64 * var27Lifetime1 - 128 + var8), 17);
              var28Lifetime1.field_u = var25_intLifetime4;
              var28Lifetime1.field_F = 0;
              this.b(52, var28Lifetime1);
              var27Lifetime1++;
              if (var47 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
            }
            if (decompiledFrameCompleted4) {
              this.field_D = true;
            }
          }
          boolean decompiledFrameCompleted3 = true;
          if (var10 == 105) {
            this.a((byte) 80, var10, var4);
            var24Lifetime6 = gf.a((15360 + var9 * 32) / 4, -266740663);
            var25_intLifetime5 = -96 + 192 * (var8 & 1);
            var26Lifetime2 = 0;
            while (var26Lifetime2 < 5) {
              var27_ref_mi = j.a(var12, -544, (byte) 17, this, var10, var8 - (192 - 96 * var26Lifetime2) - var24Lifetime6 * var25_intLifetime5 / 16, 143);
              var27_ref_mi.field_u = var25_intLifetime5;
              var27_ref_mi.field_F = 0;
              this.b(52, var27_ref_mi);
              var26Lifetime2++;
              if (var47 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
            if (decompiledFrameCompleted3) {
              this.field_D = true;
            }
          }
          boolean decompiledFrameCompleted2 = true;
          if (var10 == 21) {
            this.a((byte) 80, var10, var4);
            var24Lifetime7 = gf.a(32 * (var9 + 480) / 4, -266740663);
            var25_intLifetime6 = -96 + 192 * (1 & var8);
            var26Lifetime3 = 5;
            if (this.field_x[var4] == 0) {
              var26Lifetime3 = var26Lifetime3 + this.field_X[var4] / 40;
            }
            var27Lifetime2 = 0;
            while (var26Lifetime3 > var27Lifetime2) {
              var28Lifetime2 = j.a(var12, -544, (byte) -128, this, var10, var8 - (-(64 * (-2 + var27Lifetime2)) + var25_intLifetime6 * var24Lifetime7 / 16), 18);
              this.b(52, var28Lifetime2);
              var27Lifetime2++;
              if (var47 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
            if (decompiledFrameCompleted2) {
              this.field_D = true;
            }
          }
          if (var10 == 22) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime19 = j.a(var12, this.field_H, (byte) -109, this, var10, var8, 19);
            var24_ref_miLifetime19.field_F = 0;
            var24_ref_miLifetime19.field_u = 0;
            this.b(52, var24_ref_miLifetime19);
            this.field_D = true;
          }
          if (var10 == 75) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime20 = j.a(var12, -480, (byte) -98, this, var10, var8, 62);
            var24_ref_miLifetime20.field_u = 0;
            var24_ref_miLifetime20.field_F = 0;
            this.b(52, var24_ref_miLifetime20);
            this.field_D = true;
          }
          if (var10 == 53) {
            this.a((byte) 80, var10, var4);
            var24_ref_miLifetime21 = j.a(var12, -480, (byte) 30, this, var10, var8, 47);
            var24_ref_miLifetime21.field_u = 0;
            var24_ref_miLifetime21.field_F = 0;
            this.b(52, var24_ref_miLifetime21);
            this.field_D = true;
          }
          var24Lifetime8 = -115 % ((param0 + 53) / 37);
          if (var10 == 100) {
            this.a((byte) 80, var10, var4);
            var25Lifetime6 = j.a(var12, -480, (byte) -120, this, var10, var8, 141);
            var25Lifetime6.field_u = 0;
            var25Lifetime6.field_F = 0;
            this.b(52, var25Lifetime6);
            this.field_D = true;
          }
          if (111 == var10) {
            this.a((byte) 80, var10, var4);
            var25Lifetime7 = j.a(var12, -480, (byte) 124, this, var10, var8, 160);
            var25Lifetime7.field_F = 0;
            var25Lifetime7.field_u = 0;
            this.b(52, var25Lifetime7);
            this.field_D = true;
          }
          if (var10 == 101) {
            this.a((byte) 80, var10, var4);
            var25Lifetime8 = j.a(var12, -480, (byte) 118, this, var10, var8, 142);
            var25Lifetime8.field_u = 0;
            var25Lifetime8.field_F = 0;
            this.b(52, var25Lifetime8);
            this.field_D = true;
          }
          if (var10 == 97) {
            this.a((byte) 80, var10, var4);
            var25Lifetime9 = j.a(var12, this.field_H, (byte) -93, this, var10, var8, 134);
            var25Lifetime9.field_u = 0;
            var25Lifetime9.field_F = 0;
            this.b(52, var25Lifetime9);
            this.field_D = true;
          }
          if (46 == var10) {
            this.a((byte) 80, var10, var4);
            var25Lifetime10 = j.a(var12, -480, (byte) 29, this, var10, var8, 36);
            var25Lifetime10.field_F = 0;
            var25Lifetime10.field_u = 0;
            this.b(52, var25Lifetime10);
            this.field_D = true;
          }
          boolean decompiledFrameCompleted1 = true;
          if (var10 == 5) {
            this.a((byte) 80, var10, var4);
            var25Lifetime11 = aj.a(var12, var9, false, 101, this, var8);
            this.b(52, var25Lifetime11);
            var25Lifetime11Lifetime1 = aj.a(var12, -32 - var12.field_Y + var12.field_db, false, 101, this, var12.field_lb);
            this.b(52, var25Lifetime11Lifetime1);
            var25Lifetime11Lifetime2 = (mi) (this.field_Kb.b(12623));
            while (var25Lifetime11Lifetime2 != null) {
              stackIn_631_0 = var25Lifetime11Lifetime2.field_I;
              stackIn_631_1 = 149;
              if (var47 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_631_0 == stackIn_631_1 &&
                var12 == var25Lifetime11Lifetime2.field_t) {
                var25Lifetime11Lifetime2.f(0);
              }
              var25Lifetime11Lifetime2 = (mi) (this.field_Kb.a(0));
            }
            if (decompiledFrameCompleted1) {
              var25Lifetime11Lifetime3 = j.a(var12, -32 + (var12.field_db - var12.field_Y), (byte) 29, this, var10, var12.field_lb, 149);
              var25Lifetime11Lifetime3.field_F = -var12.field_db - (-var12.field_Y - 32) + var9;
              var25Lifetime11Lifetime3.field_u = var8 - var12.field_lb;
              this.b(52, var25Lifetime11Lifetime3);
              this.field_D = true;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_631_0 = var10;
            stackIn_631_1 = 4;
          }
          if (stackIn_631_0 == stackIn_631_1) {
            if (var12.field_db >= this.field_H) {
              var25_intLifetime7 = this.a(4, var4, -770226943);
              if (0 >= var25_intLifetime7) {
                var26Lifetime4 = var12.field_ib / 3;
                if (5 > var26Lifetime4) {
                  var26Lifetime4 = 5;
                }
                var12.field_ib = var12.field_ib - var26Lifetime4;
                if (var12.field_ib < 1) {
                  var12.field_ib = 1;
                }
              }
            }
            var25Lifetime12 = aj.a(var12, var9, false, 101, this, var8);
            this.b(52, var25Lifetime12);
            var25Lifetime12Lifetime1 = aj.a(var12, var12.field_db, false, 101, this, var12.field_lb);
            this.b(52, var25Lifetime12Lifetime1);
            this.a((byte) 80, var10, var4);
            this.a(var12, 0);
            if (var12.field_jb != 20) {
              var12.field_q = 0;
              if (var12.g((byte) 111)) {
                var12.field_db = var12.field_db - var12.field_Y / 2;
                var12.field_q = 0;
                var12.field_Y = 32;
                var12.field_R = var12.field_db << 4;
                var12.field_jb = 0;
                var12.field_w = new qb(var12.field_Y, var12.field_Y);
                var12.field_w.a();
                de.i(var12.field_Y >> 1, var12.field_Y >> 1, var12.field_Y >> 1, 16777215);
              }
              if (var12.field_jb == 19) {
                var12.field_jb = 0;
              }
            }
            var12.field_db = var9;
            var12.field_lb = var8;
            var11Lifetime5 = 0;
            var12.field_z = true;
            this.field_D = true;
            var12.field_R = var12.field_db << 4;
            var12.field_eb = 0;
            var12.field_X = var12.field_lb << 4;
            var12.field_kb = 0;
          }
          if (var10 == 150) {
            var25Lifetime13 = aj.a(var12, var12.field_db, false, 137, this, var8);
            this.b(52, var25Lifetime13);
            var25Lifetime13Lifetime1 = aj.a(var12, var12.field_db, false, 137, this, var12.field_lb);
            this.b(52, var25Lifetime13Lifetime1);
            this.a((byte) 80, var10, var4);
            this.a(var12, 0);
            if (var12.x(32) &&
              var12.field_s.field_q <= 0) {
              this.a(var12.field_s, 0);
              var13Lifetime2 = -var12.field_lb + var12.field_s.field_lb;
              var14Lifetime2 = -(var12.field_s.field_Y / 2) + (var12.field_s.field_db - var12.field_db + var12.field_Y / 2);
              if (var13Lifetime2 * var13Lifetime2 + var14Lifetime2 * var14Lifetime2 < (var12.field_Y + var12.field_s.field_Y) * (var12.field_Y + var12.field_s.field_Y) >> 2) {
                var12.field_s.field_R = var12.field_R - (var12.field_Y << 3);
                var12.field_s.field_X = (var8 << 4) - var12.field_E * (var12.field_Y << 1);
                if (32 < var12.field_s.field_Y) {
                  var12.field_s.field_R = var12.field_s.field_R + 192;
                  var12.field_s.field_X = var12.field_s.field_X + 0 * var12.field_E;
                }
                var12.field_db = var12.field_R >> 4;
                var12.field_lb = var12.field_X >> 4;
                var12.field_s.field_E = var12.field_E;
                var12.field_s.field_db = var12.field_s.field_R >> 4;
                var12.field_s.field_lb = var12.field_s.field_X >> 4;
              }
            }
            var12.field_lb = var8;
            var12.field_db = this.field_H;
            var12.field_z = true;
            var12.field_eb = 0;
            this.field_D = true;
            var12.field_kb = 0;
            var12.field_R = var12.field_db << 4;
            var12.field_X = var12.field_lb << 4;
            var11Lifetime6 = 0;
          }
          if (var10 == 139) {
            var12.field_ib = 0;
            var12.field_x = 1;
            var25Lifetime14 = aj.a(var12, var12.field_db, false, 101, this, var12.field_lb);
            this.b(52, var25Lifetime14);
            var25Lifetime14.a(0, 0, 32, 8);
          }
          if (var10 == 152) {
            this.a((byte) 80, var10, var4);
            var12.field_z = true;
            var12.field_jb = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (var10 == 132) {
            var25Lifetime15 = aj.a(var12, var12.field_db, false, 108, this, var12.field_lb);
            this.b(52, var25Lifetime15);
            var26Lifetime5 = var12.field_lb;
            var27Lifetime3 = var12.field_db;
            if (var26Lifetime5 < 96) {
              var26Lifetime5 = 96;
            }
            if (var27Lifetime3 < 128) {
              var27Lifetime3 = 128;
            }
            if ((this.field_y - 96) < var26Lifetime5) {
              var26Lifetime5 = this.field_y - 96;
            }
            var25Lifetime15.field_v = var26Lifetime5;
            var25Lifetime15.field_G = var27Lifetime3;
            var25Lifetime15.a(0, 0, 64, 8);
            var25Lifetime15.field_v = var12.field_lb;
            var25Lifetime15.field_G = var12.field_db;
            n.field_d.a((byte) 83, this.field_i);
            var28_ref = (ml) (n.field_d.b(-44));
            while (var28_ref != null) {
              stackIn_689_0 = var28_ref;
              stackIn_689_1 = var12;
              if (var47 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_689_0 != stackIn_689_1 &&
                var28_ref.field_u == var4 &&
                12 != var28_ref.field_jb) {
                var14Lifetime3 = var28_ref.field_db - var9;
                var13Lifetime3 = var28_ref.field_lb - var8;
                if (Math.abs(var13Lifetime3) < 64 &&
                  Math.abs(var14Lifetime3) < 64) {
                  if (var28_ref.field_jb != 20) {
                    var28_ref.field_q = 0;
                  }
                  this.a(var28_ref, 0);
                  var28_ref.field_lb = var13Lifetime3 + var26Lifetime5;
                  var28_ref.field_db = var14Lifetime3 + var27Lifetime3;
                  var28_ref.field_z = true;
                  var28_ref.field_X = var28_ref.field_lb << 4;
                  var28_ref.field_R = var28_ref.field_db << 4;
                }
              }
              var28_ref = (ml) (n.field_d.d(-18502));
            }
            if (decompiledFrameCompleted0) {
              this.field_D = true;
              var12.field_ib = 0;
              var12.field_x = 1;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (decompiledFrameRemainder0 = (var10 == 154))) {
            stackIn_689_0 = var12;
            stackIn_689_1 = var12;
          }
          if (decompiledFrameRemainder0) {
            var25Lifetime15Lifetime1 = aj.a(stackIn_689_0, stackIn_689_1.field_db, false, 86, this, var12.field_lb);
            this.b(52, var25Lifetime15Lifetime1);
            this.a(var12.field_s, 0);
            if (var12.field_s.i((byte) -3) > this.field_H) {
              this.field_D = true;
            }
            var12.field_s.field_R = var12.field_R;
            var12.field_s.field_lb = var12.field_lb;
            var12.field_z = true;
            var12.field_s.field_db = var12.field_db;
            var12.field_s.field_X = var12.field_X;
            var12.field_s.field_z = true;
            var12.field_x = 1;
            var12.field_ib = 0;
          }
          if (var10 == 2) {
            this.a((byte) 80, var10, var4);
            var12.field_jb = 20;
            var12.e((byte) 6);
            this.a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, var12.field_db + (-(var12.field_Y >> 1) - 10));
            i.a(this.field_V, var12.field_db - var12.field_Y, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, this, var12.field_w, 0);
            this.i((byte) 86);
            var11Lifetime7 = 0;
            this.field_D = true;
            var25Lifetime16 = aj.a(var12, -(var12.field_Y / 2) + var12.field_db, false, 101, this, var12.field_lb);
            this.b(52, var25Lifetime16);
          }
          if (var10 == 114) {
            this.a((byte) 80, var10, var4);
            var12.field_jb = 38;
            var12.e((byte) 6);
            this.a(var12.field_lb, (var12.field_Y >> 1) + 10, (byte) 51, -10 + (-(var12.field_Y >> 1) + var12.field_db));
            i.a(this.field_V, var12.field_db - var12.field_Y, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, this, var12.field_w, 0);
            this.i((byte) 86);
            var11Lifetime8 = 0;
            this.field_D = true;
            var25Lifetime17 = aj.a(var12, -(var12.field_Y / 2) + var12.field_db, false, 86, this, var12.field_lb);
            this.b(52, var25Lifetime17);
          }
          if (55 == var10) {
            this.a((byte) 80, var10, var4);
            var12.field_jb = 22;
            var12.e((byte) 6);
            this.a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, var12.field_db + (-(var12.field_Y >> 1) - 10));
            i.a(this.field_V, -var12.field_Y + var12.field_db, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, this, var12.field_w, 0);
            this.i((byte) 86);
            var11Lifetime9 = 0;
            this.field_D = true;
            var25Lifetime18 = aj.a(var12, var12.field_db - var12.field_Y / 2, false, 94, this, var12.field_lb);
            this.b(52, var25Lifetime18);
          }
          if (var10 == 31) {
            this.a((byte) 80, var10, var4);
            var12.field_jb = 21;
            var12.e((byte) 6);
            this.a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, -(var12.field_Y >> 1) + var12.field_db - 10);
            i.a(this.field_V, var12.field_db - var12.field_Y, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, this, var12.field_w, 0);
            this.i((byte) 86);
            this.field_D = true;
            var11Lifetime10 = 0;
            var25Lifetime19 = aj.a(var12, var12.field_db - var12.field_Y / 2, false, 89, this, var12.field_lb);
            this.b(52, var25Lifetime19);
          }
          if (30 == var10) {
            this.a(false, var8 - (bg.field_e.field_n >> 1), this.field_V, true, var9 - bg.field_e.field_w, bg.field_e);
            this.a(-(bg.field_e.field_n >> 1) + var8, (byte) -91, -bg.field_e.field_w + var9, this.field_Jb, bg.field_e);
            this.field_D = true;
          }
          this.field_mb = var8;
          this.field_t = var9;
          if (var10 != 116 &&
            var10 != 87 &&
            var10 != 45 &&
            54 != var10 &&
            var10 != 154 &&
            var10 != 139 &&
            var10 != 152 &&
            !this.field_D) {
            throw new IllegalStateException();
          }
          this.p((byte) 99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_717_0 = var3_ref;
          stackIn_717_1 = new StringBuilder().append("nf.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_718_2 = "null";
          } else {
            stackIn_718_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_717_0), ((StringBuilder) (Object) stackIn_717_1).append(stackIn_718_2).append(')').toString());
        }
    }

    private final int[] a(byte param0, jd param1) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_24_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int[] stackIn_48_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var15 = new int[20];
          var14 = var15;
          var13 = var14;
          var5 = var13;
          var6 = -87 / ((param0 - 75) / 49);
          var7 = 0;
          do {
            if (var7 >= -1 + var15.length) {
              var13[1 + uj.a(param1, var15.length - 2, (byte) -26)] = 32 + this.field_H;
              var13[uj.a(param1, var15.length - 2, (byte) -111) + 1] = this.field_H + 32;
              var13[uj.a(param1, -2 + var15.length, (byte) -111) + 1] = this.field_H + 32;
              var13[1 + uj.a(param1, var15.length - 2, (byte) -81)] = 32 + this.field_H;
              var13[0] = this.field_H + 64;
              break;
            }
            var13[var7] = 7 * this.field_H / 8 - uj.a(param1, this.field_H * 2 / 8, (byte) -25);
            var7++;
          } while (var12 == 0);
          var13[-1 + var15.length] = var15[0];
          while (true) {
            stackIn_9_0 = this.field_y / 64;
            stackIn_9_1 = var5.length;
            if (stackIn_9_0 > stackIn_9_1) {
              var3_int = 100;
              stackIn_24_0 = ~var5.length;
              if (var12 == 0) {
                if (stackIn_24_0 < ~(this.field_y / 8)) {
                  var3_int = 5;
                }
                var6_ref_int__ = new int[1 + (var5.length - 1) * 2];
                var6_ref_int__[0] = var5[0];
                var7 = 1;
                while (var7 < var5.length) {
                  var4 = (5 + Math.abs(-var5[var7] + var5[-1 + var7])) * var3_int / 100;
                  stackIn_9_0 = this.field_H / 2;
                  stackIn_9_1 = var5[var7];
                  if (stackIn_9_0 < stackIn_9_1) {
                    var4 = 2 * this.field_H / var5.length;
                  }
                  stackIn_20_0 = var6_ref_int__;
                  stackIn_20_1 = var7 * 2 - 1;
                  stackIn_20_2 = -var4 + (var5[-1 + var7] + var5[var7]) >> 1;
                  if (var4 == 0) {
                    stackIn_21_3 = 0;
                  } else {
                    stackIn_21_3 = uj.a(param1, var4, (byte) -62);
                  }
                  stackIn_20_0[stackIn_20_1] = stackIn_20_2 + stackIn_21_3;
                  var6_ref_int__[2 * var7] = var5[var7];
                  var7++;
                }
                var5 = var6_ref_int__;
                continue;
              }
            } else {
              this.a(var5, (byte) -109);
              stackIn_24_0 = 0;
            }
            var6 = stackIn_24_0;
            var7 = 0;
            L12: while (true) {
              var7++;
              var8 = uj.a(param1, this.field_y, (byte) -36);
              var9 = 2;
              var10 = var8 + this.field_y * var9;
              L14: while (true) {
                if (this.field_H > var9) {
                  stackIn_36_0 = ~mn.field_y.field_m[var10];
                  stackIn_36_1 = -1;
                  if (var12 != 0) {
                    break L14;
                  }
                  if (stackIn_36_0 == stackIn_36_1) {
                    var10 = var10 + this.field_y;
                    var9++;
                    var8 = var8 + (-1 + var7 % 3);
                    var10 = var10 + (-1 + var7 % 3);
                    if (var8 < 0) {
                      var8 = var8 + this.field_y;
                      var10 = var10 + this.field_y;
                    }
                    if (this.field_y > var8) {
                      continue;
                    }
                    var8 = var8 - this.field_y;
                    var10 = var10 - this.field_y;
                    continue;
                  }
                }
                stackIn_36_0 = 64 * (-var9 + this.field_H) / this.field_H;
                stackIn_36_1 = uj.a(param1, 16, (byte) -34);
                break;
              }
              var11 = stackIn_36_0 + stackIn_36_1;
              do {
                if (var9 < this.field_H &&
                  var9 > (var11 + 32) &&
                  var11 < var8 &&
                  -var11 + this.field_y > var8) {
                  o.a(mn.field_y, (byte) -47, var11, (byte) -5, var9, var8, this);
                  var6 = var9;
                }
                if (var9 < 32 + var11) {
                  var6 = 0;
                }
                if (var6 > 128) {
                  continue L12;
                }
              } while (var12 != 0);
              break;
            }
            stackIn_48_0 = var5;
            return stackIn_48_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_51_0 = var3;
          stackIn_51_1 = new StringBuilder().append("nf.VB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    private final boolean a(int param0, ml param1, boolean param2) {
        boolean stackIn_4_0 = false;
        int stackIn_87_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_233_0 = 0;
        RuntimeException stackIn_236_0 = null;
        StringBuilder stackIn_236_1 = null;
        String stackIn_237_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4_intLifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 == 153) {
            stackIn_4_0 = this.a(39, param1, true);
            return stackIn_4_0;
          }
          if (param0 == 11) {
            return false;
          }
          if (param0 == 159) {
            var4_int = 100;
            if (this.field_x[param1.field_u] == 4) {
              var4_int = this.field_X[param1.field_u] / 5 * 5 + 5;
              if (this.field_X[param1.field_u] > 0 &&
                ~var4_int == ~(this.field_X[param1.field_u] + 5)) {
                var4_int = this.field_X[param1.field_u];
              }
            }
            if (20 < param1.field_ib &&
              param1.t(29) &&
              this.field_x[param1.field_u] != 10) {
              if (var4_int <= this.field_X[param1.field_u]) {
                return false;
              }
              if (9 == this.field_x[param1.field_u] && (!(param1.field_ib > 100) ||
                param1.field_jb != 27)) {
                return false;
              }
              return true;
            }
            return false;
          }
          if (this.field_f &&
            !this.d((byte) 66, param0)) {
            return false;
          }
          if (param0 == 87 &&
            0 < this.b(param0, -102, param1.field_u)) {
            return false;
          }
          if (param0 == 116 &&
            0 < this.b(param0, -102, param1.field_u)) {
            return false;
          }
          if ((param0 == 124 ||
            param0 == 130) &&
            param1.field_D) {
            return false;
          }
          cf.field_f = false;
          if (param0 == 139 &&
            null != param1.field_s) {
            return true;
          }
          if (param0 == 152 &&
            param1.field_jb == 19) {
            return true;
          }
          if (152 == param0 &&
            param1.field_jb != 19) {
            return false;
          }
          if (param0 == 87 &&
            param1.field_jb == 19) {
            return false;
          }
          if (150 == param0 &&
            -16 + this.field_H <= param1.field_db) {
            return true;
          }
          if (param0 == 158) {
            return true;
          }
          boolean decompiledFrameCompleted1 = true;
          if (null != param1.field_s) {
            if (this.a(param0, param1, 1)) {
              return true;
            }
            var4 = gj.field_c[param1.field_jb];
            if (param1.field_jb == 17 &&
              param1.field_U) {
              var4 = lj.field_u;
            }
            if (param1.field_jb == 10) {
              stackIn_87_0 = 1;
              if (param1.field_U) {
                stackIn_88_1 = 0;
              } else {
                stackIn_88_1 = 1;
              }
              if (stackIn_87_0 != stackIn_88_1) {
                var4 = vi.field_N;
              }
            }
            var5 = 0;
            var6 = 0;
            while (var6 < var4.length) {
              stackIn_100_0 = var4[var6];
              stackIn_100_1 = param0;
              if (var7 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_100_0 == stackIn_100_1) {
                var5 = 1;
              }
              var6++;
            }
            if ((decompiledFrameCompleted1) &&
              (var5 == 0)) {
              return false;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_100_0 = param0;
            stackIn_100_1 = 6;
          }
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_100_0 != stackIn_100_1 &&
            param0 != 79) {
            if ((98 != param0 &&
              param0 != 92) &&
              (decompiledFrameRemainder0 = !(param0 >= 156)) &&
              (decompiledFrameRemainder0 = !(param0 <= -1)) &&
              (decompiledFrameRemainder0 = (rd.field_e[param0] == 4))) {
              if (4 < 1 + this.c((byte) -116, param1.field_u)) {
                cf.field_f = true;
                return false;
              }
              decompiledFrameRemainder0 = !(this.b(12) + 1 <= 4 * this.field_q);
              if (decompiledFrameRemainder0) {
                cf.field_f = true;
                return false;
              }
            }
            if (decompiledFrameRemainder0) {
              if (4 < 2 + this.c((byte) -113, param1.field_u)) {
                cf.field_f = true;
                return false;
              }
              decompiledFrameRemainder0 = !(2 + this.b(12) <= this.field_q * 4);
              if (decompiledFrameRemainder0) {
                cf.field_f = true;
                return false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (3 + this.c((byte) -128, param1.field_u) > 4) {
              cf.field_f = true;
              return false;
            }
            if (3 + this.b(12) > 4 * this.field_q) {
              cf.field_f = true;
              return false;
            }
          }
          if (param0 == 93 &&
            param1.t(57)) {
            return false;
          }
          if (param0 == 95 &&
            param1.t(27)) {
            return false;
          }
          if (2 == param0 &&
            param1.field_jb != 0) {
            return false;
          }
          if (param0 == 55 &&
            param1.field_jb != 0) {
            return false;
          }
          if (31 == param0 &&
            param1.field_jb != 0) {
            return false;
          }
          if (param0 == 60 &&
            0 != param1.field_jb) {
            return false;
          }
          if (param0 == 81 &&
            param1.field_jb != 0) {
            return false;
          }
          if (param0 == 91 &&
            param1.field_jb != 0) {
            return false;
          }
          if (param0 == 114 &&
            0 != param1.field_jb) {
            return false;
          }
          if (!param2) {
            this.field_ib = (int[]) null;
          }
          if (param0 == 71 &&
            param1.field_jb != 0 &&
            param1.field_jb != 19) {
            return false;
          }
          if (param0 == 83 &&
            param1.field_jb != 0 &&
            param1.field_jb != 19) {
            return false;
          }
          if (param0 == 45 &&
            param1.g((byte) 90)) {
            return false;
          }
          if (param0 == 45 &&
            27 == param1.field_jb) {
            return false;
          }
          if (param1.field_jb == 16) {
            if ((60 > param0 ||
              71 < param0) && param0 >= 12) {
              return false;
            }
          } else {
            if (param1.field_jb == 18 && (param0 < 72 ||
              param0 > 83) && param0 >= 12) {
              return false;
            }
          }
          if (param0 < 0) {
            return true;
          }
          if (param1.field_db > this.field_H) {
            return (param0 == 4);
          }
          if (param0 == 4 &&
            param1.field_gb != null &&
            param1.field_gb.field_I == 121) {
            return false;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_J >= 0) {
            var4_intLifetime1 = 0;
            while (16 > var4_intLifetime1) {
              stackIn_233_0 = param0;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_233_0 != this.field_v[this.field_J][var4_intLifetime1]) {
                var4_intLifetime1++;
                continue;
              }
              if (0 == this.field_vb[this.field_J][var4_intLifetime1]) {
                return false;
              }
              if ((this.field_jb / this.field_q) >= le.field_d[param0]) {
                return true;
              }
              return false;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_233_0 = 0;
          }
          return stackIn_233_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_236_0 = var4_ref;
          stackIn_236_1 = new StringBuilder().append("nf.CC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_237_2 = "null";
          } else {
            stackIn_237_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_236_0), ((StringBuilder) (Object) stackIn_236_1).append(stackIn_237_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, mi param1) {
        try {
          if (param0 != -1) {
            this.field_fb = (int[]) null;
          }
          this.field_I.a(param1, 15893);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nf.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] discarded$3 = null;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int var4;
        int var5;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 < 0) {
          return;
        }
        if (param2 < 0) {
          return;
        }
        if (param1 == 153) {
          this.a((byte) 80, 39, param2);
          return;
        }
        if (152 == param1) {
          var4 = 0;
          do {
            if (var4 >= 16) {
              return;
            }
            if (152 == this.field_v[param2][var4]) {
              if (this.field_vb[param2][var4] <= 0) {
                return;
              }
              this.field_vb[param2][var4] = 0;
              this.field_lb[param2][var4] = 1;
              if (var5 == 0) {
                return;
              }
            }
            var4++;
          } while (var5 == 0);
          return;
        }
        var4 = 0;
        L1: while (true) {
          boolean decompiledFrameRemainder0 = true;
          if (var4 < 16) {
            stackIn_45_0 = param1;
            stackIn_45_1 = this.field_v[param2][var4];
            if (var5 != 0) {
              break L1;
            }
            if (stackIn_45_0 == stackIn_45_1) {
              this.field_L[param2][var4] = true;
              if (hh.field_b[param1] != -1) {
                if (this.field_vb[param2][var4] > 0 && (-1 == mj.field_p ||
                  param1 == 5)) {
                  dupTemp$0 = this.field_vb[param2];
                  dupTemp$0[var4] = dupTemp$0[var4] - 1;
                }
              } else {
                this.field_lb[param2][var4] = 5;
                if (param1 == 46 &&
                  2 == this.field_x[param2]) {
                  dupTemp$1 = this.field_lb[param2];
                  dupTemp$1[var4] = dupTemp$1[var4] - this.field_X[param2] / 20;
                }
                if (0 < this.field_vb[param2][var4]) {
                  dupTemp$2 = this.field_vb[param2];
                  dupTemp$2[var4] = dupTemp$2[var4] - 1;
                }
                if (this.field_lb[param2][var4] <= 0) {
                  this.field_vb[param2][var4] = 1;
                  this.field_lb[param2][var4] = 0;
                }
              }
              if (param1 == 87) {
                this.field_lb[param2][var4] = 1;
              }
              if ((116 == param1)) {
                this.field_lb[param2][var4] = 1;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var4++;
              continue;
            }
          }
          stackIn_45_0 = param0;
          stackIn_45_1 = 80;
          break;
        }
        if (stackIn_45_0 != stackIn_45_1) {
          discarded$3 = this.c(18, (jd) null);
        }
        return;
    }

    final int b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int stackIn_16_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > param0) {
          return 0;
        }
        if (0 > param2) {
          return 0;
        }
        if (param1 != -102) {
          return 57;
        }
        if (param0 == 153) {
          return this.b(39, -102, param2);
        }
        var4 = 0;
        while (var4 < 16) {
          stackIn_16_0 = param0;
          if (var5 != 0) {
            return stackIn_16_0;
          }
          if (stackIn_16_0 == this.field_v[param2][var4]) {
            return this.field_lb[param2][var4];
          }
          var4++;
        }
        return -1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!this.field_eb) {
          return;
        }
        th.a(this, this.field_V, -1, 4 + param1, param0, param3);
        if (param2 != 51) {
          this.field_D = false;
        }
        o.a(this.field_V, (byte) -47, param1, (byte) 0, param3, param0, this);
        hj.a(this.field_Jb, param1, param3, this, (byte) 0, param0, param2 ^ -95);
    }

    final boolean b(int param0, ml param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.p(-8323);
          if (param2 != -16) {
            this.field_lb = (int[][]) null;
          }
          if (var5_int <= param0 &&
            param0 <= (this.field_y - var5_int) &&
            param3 >= var5_int &&
            -16 + this.field_H >= param3) {
            if (null != param1.field_gb &&
              121 == param1.field_gb.field_I) {
              return false;
            }
            stackIn_17_0 = !(this.a(param0, var5_int >> 1, param3, param2 ^ -70));
            return stackIn_17_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("nf.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    nf(boolean param0, boolean param1, int param2, int param3, boolean param4, String[] param5, int param6, int param7, int[][] param8, int[][] param9, int[] param10, int param11, boolean[] param12) {
        boolean stackIn_4_1 = false;
        boolean stackIn_10_1 = false;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_110_2 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_113_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int stackIn_61_0Lifetime1;
        int stackIn_61_1Lifetime1;
        int stackIn_89_0Lifetime1;
        int stackIn_89_1Lifetime1;
        int var16Lifetime1;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_M = true;
        this.field_E = null;
        this.field_C = -1;
        this.field_y = 1920;
        this.field_tb = 0;
        this.field_H = 960;
        this.field_Hb = this.field_H / 2;
        this.field_eb = true;
        this.field_hb = this.field_y / 2;
        this.field_Z = false;
        this.field_bb = -1;
        this.field_fb = null;
        this.field_nb = 0;
        this.field_Y = -1;
        try {
          gh.field_D = new oc();
          n.field_d = new oc();
          u.field_f = new oc();
          mk.field_J = new oc();
          ge.field_p = new oc();
          this.field_m = param11;
          stackIn_4_1 = (param0);
          this.field_l = stackIn_4_1;
          var14_int = param5.length;
          this.field_Cb = param7 - 1;
          if (var14_int != 4 &&
            var14_int != 6) {
            this.field_d = false;
          }
          if (var14_int == 4 ||
            var14_int == 6 || var19 != 0) {
            stackIn_10_1 = (param4);
            this.field_d = stackIn_10_1;
          }
          this.field_J = param7;
          this.field_xb = param3;
          this.field_Q = param6;
          if (!this.field_d) {
            nj.field_n = nj.field_a;
            if (var19 != 0) {
              nj.field_n = ke.field_M;
            }
          } else {
            nj.field_n = ke.field_M;
          }
          this.field_k = param5;
          if (0 > this.field_Cb) {
            this.field_Cb = this.field_Cb + var14_int;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param8 != null) {
            this.field_N = new int[var14_int][18];
            var15 = 0;
            while (var14_int > var15) {
              stackIn_29_0 = 0;
              if (var19 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              var16 = stackIn_29_0;
              while (var16 < 18) {
                this.field_N[var15][var16] = param8[var15][var16];
                var16++;
              }
              var15++;
            }
          }
          if (decompiledFrameCompleted1) {
            if (param10 == null) {
              this.field_S = new int[var14_int];
              decompiledFrameRemainder0 = (var19 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.field_S = new int[var14_int];
              stackIn_29_0 = 0;
            }
          }
          if (decompiledFrameRemainder0) {
            var15 = stackIn_29_0;
            while (var14_int > var15) {
              this.field_S[var15] = param10[var15];
              var15++;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_g = new int[var14_int];
            this.field_R = new int[var14_int];
            this.field_Ob = new int[var14_int];
            this.field_T = new int[var14_int];
            this.field_U = new int[var14_int];
            this.field_c = new int[var14_int];
            this.field_db = new int[var14_int];
            this.field_K = new int[var14_int];
            this.field_wb = new int[var14_int];
            this.field_b = new int[var14_int];
            this.field_s = new int[var14_int];
            this.field_ob = new int[var14_int];
            this.field_gb = new int[var14_int];
            this.field_F = param2;
            this.field_ab = new int[var14_int];
            this.field_Nb = new int[var14_int];
            this.field_u = new boolean[var14_int];
            this.field_Fb = new int[var14_int];
            this.field_ib = new int[var14_int];
            this.field_a = new int[var14_int];
            this.field_Eb = new int[var14_int];
            this.field_cb = new int[var14_int];
            this.field_p = new int[var14_int];
            this.field_n = new int[var14_int];
            this.field_q = param5.length;
          }
          var15 = 0;
          do {
            if (var15 >= this.field_q) {
              this.field_i = new vn();
              this.field_B = new mo(32);
              this.field_Kb = new vn();
              this.field_I = new tg();
              this.field_kb = new vn();
              this.field_Db = new vn();
              this.field_r = new vn();
              this.field_h = new tg();
              this.field_v = new int[this.field_q][16];
              this.field_x = new int[this.field_q];
              this.field_lb = new int[this.field_q][];
              this.field_f = false;
              this.field_L = new boolean[this.field_q][16];
              this.field_vb = new int[this.field_q][];
              this.field_o = new int[this.field_q];
              this.field_X = new int[this.field_q];
              this.field_Ab = new int[this.field_q];
              break;
            }
            var15++;
          } while (var19 == 0);
          var15 = 0;
          while (true) {
            stackIn_41_0 = ~this.field_q;
            stackIn_41_1 = ~var15;
            if (stackIn_41_0 < stackIn_41_1) {
              this.field_x[var15] = 10;
              this.field_X[var15] = 0;
              this.field_Ab[var15] = 0;
              this.field_o[var15] = 0;
              if (var19 != 0) {
                return;
              }
              if (param9 != null) {
                var16Lifetime1 = 0;
                while (var16Lifetime1 < 16) {
                  this.field_v[var15][var16Lifetime1] = param9[var15][var16Lifetime1];
                  stackIn_61_0 = ~this.field_v[var15][var16Lifetime1];
                  stackIn_61_1 = -12;
                  if (stackIn_61_0 == stackIn_61_1) {
                    this.field_f = true;
                  }
                  var16Lifetime1++;
                }
              } else {
                var16Lifetime1 = 1;
                if (2 == var16Lifetime1) {
                  this.field_v[var15][0] = 0;
                  this.field_v[var15][1] = 4;
                  this.field_v[var15][2] = 6;
                  this.field_v[var15][3] = 45;
                  this.field_v[var15][4] = 8;
                  this.field_v[var15][5] = 36;
                  this.field_v[var15][6] = 37;
                  this.field_v[var15][7] = 38;
                  this.field_v[var15][8] = 39;
                  this.field_v[var15][9] = 40;
                  this.field_v[var15][10] = 41;
                  this.field_v[var15][11] = 42;
                  this.field_v[var15][12] = 43;
                  this.field_v[var15][13] = 44;
                  this.field_v[var15][14] = 46;
                  this.field_v[var15][15] = 47;
                }
                if (3 == var16Lifetime1) {
                  this.field_v[var15][0] = 0;
                  this.field_v[var15][1] = 4;
                  this.field_v[var15][2] = 6;
                  this.field_v[var15][3] = 17;
                  this.field_v[var15][4] = 8;
                  this.field_v[var15][5] = 12;
                  this.field_v[var15][6] = 13;
                  this.field_v[var15][7] = 14;
                  this.field_v[var15][8] = 15;
                  this.field_v[var15][9] = 16;
                  this.field_v[var15][10] = 18;
                  this.field_v[var15][11] = 19;
                  this.field_v[var15][12] = 20;
                  this.field_v[var15][13] = 21;
                  this.field_v[var15][14] = 22;
                  this.field_v[var15][15] = 10;
                }
                if (4 == var16Lifetime1) {
                  this.field_v[var15][0] = 0;
                  this.field_v[var15][1] = 4;
                  this.field_v[var15][2] = 6;
                  this.field_v[var15][3] = 10;
                  this.field_v[var15][4] = 8;
                  this.field_v[var15][5] = 48;
                  this.field_v[var15][6] = 50;
                  this.field_v[var15][7] = 52;
                  this.field_v[var15][8] = 56;
                  this.field_v[var15][9] = 49;
                  this.field_v[var15][10] = 51;
                  this.field_v[var15][11] = 53;
                  this.field_v[var15][12] = 57;
                  this.field_v[var15][13] = 58;
                  this.field_v[var15][14] = 54;
                  this.field_v[var15][15] = 55;
                }
                if (var16Lifetime1 == 1) {
                  this.field_v[var15][0] = 0;
                  this.field_v[var15][1] = 4;
                  this.field_v[var15][2] = 6;
                  this.field_v[var15][3] = 10;
                  this.field_v[var15][4] = 35;
                  this.field_v[var15][5] = 24;
                  this.field_v[var15][6] = 28;
                  this.field_v[var15][7] = 30;
                  this.field_v[var15][8] = 32;
                  this.field_v[var15][9] = 25;
                  this.field_v[var15][10] = 27;
                  this.field_v[var15][11] = 29;
                  this.field_v[var15][12] = 33;
                  this.field_v[var15][13] = 34;
                  this.field_v[var15][14] = 26;
                  this.field_v[var15][15] = 31;
                }
              }
              this.field_lb[var15] = new int[16];
              this.field_vb[var15] = new int[16];
              var16Lifetime1Lifetime1 = 0;
              while (true) {
                stackIn_61_0Lifetime1 = ~var16Lifetime1Lifetime1;
                stackIn_61_1Lifetime1 = -17;
                if (stackIn_61_0Lifetime1 <= stackIn_61_1Lifetime1) {
                  break;
                }
                stackIn_89_0 = -1;
                stackIn_89_1 = this.field_v[var15][var16Lifetime1Lifetime1];
                if (stackIn_89_0 == stackIn_89_1 ||
                  this.field_v[var15][var16Lifetime1Lifetime1] >= 156) {
                  this.field_v[var15][var16Lifetime1Lifetime1] = -1;
                } else {
                  this.field_vb[var15][var16Lifetime1Lifetime1] = hh.field_b[this.field_v[var15][var16Lifetime1Lifetime1]];
                  if (-1 == this.field_vb[var15][var16Lifetime1Lifetime1]) {
                    this.field_vb[var15][var16Lifetime1Lifetime1] = 1;
                  } else {
                    if (this.field_vb[var15][var16Lifetime1Lifetime1] == 0) {
                      this.field_vb[var15][var16Lifetime1Lifetime1] = -1;
                    }
                  }
                }
                var16Lifetime1Lifetime1++;
              }
              if (param12[var15]) {
                var16Lifetime1Lifetime2 = 0;
                while (var16Lifetime1Lifetime2 <= 4) {
                  stackIn_41_0 = ~this.field_v[var15][var16Lifetime1Lifetime2];
                  stackIn_41_1 = -1;
                  if (stackIn_41_0 <= stackIn_41_1 &&
                    this.field_v[var15][var16Lifetime1Lifetime2] % 12 == 0 &&
                    this.field_v[var15][11 + var16Lifetime1Lifetime2] == 11 + this.field_v[var15][var16Lifetime1Lifetime2]) {
                    this.field_x[var15] = this.field_v[var15][var16Lifetime1Lifetime2] / 12 - 1;
                    if (this.field_x[var15] == -1) {
                      this.field_x[var15] = 9;
                      var17 = new int[nj.field_n.length];
                      var18 = 0;
                      while (true) {
                        if (nj.field_n.length > var18) {
                          var17[var18] = nj.field_n[var18];
                          var18++;
                          continue;
                        }
                        break;
                      }
                      nj.field_n = var17;
                      nj.field_n[var15] = 13413102;
                    }
                  }
                  var16Lifetime1Lifetime2++;
                }
              } else {
                var16Lifetime1Lifetime2 = 0;
                while (true) {
                  stackIn_89_0Lifetime1 = -5;
                  stackIn_89_1Lifetime1 = ~var16Lifetime1Lifetime2;
                  if (stackIn_89_0Lifetime1 > stackIn_89_1Lifetime1) {
                    break;
                  }
                  stackIn_41_0 = ~this.field_v[var15][var16Lifetime1Lifetime2];
                  stackIn_41_1 = -13;
                  if (stackIn_41_0 <= stackIn_41_1 &&
                    this.field_v[var15][var16Lifetime1Lifetime2] % 12 == 0 &&
                    this.field_v[var15][var16Lifetime1Lifetime2 + 11] == 11 + this.field_v[var15][var16Lifetime1Lifetime2]) {
                    this.field_x[var15] = -1 + this.field_v[var15][var16Lifetime1Lifetime2] / 12;
                  }
                  var16Lifetime1Lifetime2++;
                }
              }
              var15++;
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_100_0 = var14;
          stackIn_100_1 = new StringBuilder().append("nf.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
          if (param9 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          stackIn_109_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',');
          if (param10 == null) {
            stackIn_110_2 = "null";
          } else {
            stackIn_110_2 = "{...}";
          }
          stackIn_112_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_113_2 = "null";
          } else {
            stackIn_113_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_112_1).append(stackIn_113_2).append(')').toString());
        }
    }

    final int b(int param0) {
        int var2;
        ml var3;
        int var4;
        int stackIn_11_0 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        if (param0 != 12) {
          this.f(-25);
        }
        gh.field_D.a((byte) 78, this.field_i);
        var3 = (ml) (gh.field_D.b(-43));
        while (var3 != null) {
          stackIn_11_0 = 12;
          if (var4 != 0) {
            return stackIn_11_0;
          }
          if (stackIn_11_0 != var3.field_jb &&
            null != var3.field_s) {
            var2++;
          }
          var3 = (ml) (gh.field_D.d(param0 ^ -18506));
        }
        return var2;
    }

    static {
        field_qb = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_W = -1;
        field_Bb = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_yb = "Become a member to earn wands and unlock this spellbook.";
        field_e = "Book of Nature";
        field_Lb = new int[8192];
    }

    private static int $cfr$dcmpl(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }

    private static int $cfr$dcmpg(double left, double right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
