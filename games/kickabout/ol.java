/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends hs {
    private boolean field_t;
    private int field_B;
    private int field_mb;
    tf field_bb;
    static String field_n;
    private int[] field_hb;
    private int[] field_J;
    private int field_G;
    private int field_cb;
    private int field_lb;
    private String[][] field_w;
    private int field_P;
    private int field_j;
    static String field_E;
    private int field_X;
    private int field_L;
    private int field_Y;
    private int[] field_l;
    private tf field_gb;
    private boolean field_K;
    private boolean field_U;
    private int field_ib;
    private int[] field_m;
    int[] field_k;
    private int field_kb;
    private int field_S;
    int[] field_u;
    private boolean field_C;
    private int field_V;
    private boolean field_N;
    private kq[] field_o;
    private boolean field_F;
    private int field_A;
    private int[][] field_O;
    private int field_Q;
    private int field_eb;
    private int field_M;
    private int field_r;
    private int field_v;
    private hd[] field_s;
    private int field_H;
    private int field_db;
    private int field_x;
    private String[] field_I;
    static boolean field_R;
    private boolean field_D;
    static int field_z;
    private boolean field_y;
    private int field_jb;
    private String field_Z;
    private boolean field_W;
    private ut[] field_fb;
    private int field_T;
    tf field_q;
    int[][] field_p;
    int[][] field_ab;

    private final boolean b(byte param0) {
        int discarded$1 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        up var3 = null;
        int var4 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (param0 != -109) {
            discarded$1 = this.a((tf) null, -84, -44, false);
          }
          if (0 > this.field_g) {
            return false;
          }
          if (this.field_a.field_e) {
            return false;
          }
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int >= 4))) {
            stackIn_32_0 = ~this.field_hb[var2_int];
            if (var4 == 0) {
              if (stackIn_32_0 != 0) {
                var3 = tu.field_E.field_i[this.field_hb[var2_int]];
                if (100 <= var3.field_r && (!(var3.field_n >= 100) ||
                  !(100 <= var3.field_g) ||
                  !(var3.field_o >= 100))) {
                  return true;
                }
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_32_0 = 0;
          }
          return stackIn_32_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "ol.I(" + param0 + ')');
        }
    }

    private final void i(int param0) {
        cn stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_8_4 = 0;
        cn stackIn_11_0 = null;
        String stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_15_4;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_72_0;
        int stackIn_72_1;
        int stackIn_72_2;
        int stackIn_72_3;
        int stackIn_72_4;
        int stackIn_75_5;
        cn stackIn_82_0;
        String stackIn_82_1;
        int stackIn_82_2;
        int stackIn_82_3;
        int stackIn_83_4 = 0;
        cn stackIn_89_0;
        String stackIn_89_1;
        int stackIn_89_2;
        int stackIn_89_3;
        int stackIn_90_4 = 0;
        int stackIn_99_0;
        int stackIn_99_1;
        int stackIn_99_2;
        int stackIn_99_3;
        int stackIn_99_4;
        int stackIn_100_5 = 0;
        cn stackIn_103_0;
        String stackIn_103_1;
        int stackIn_103_2;
        int stackIn_103_3;
        int stackIn_104_4;
        int stackIn_111_0;
        int stackIn_111_1;
        int stackIn_111_2;
        int stackIn_111_3;
        int stackIn_111_4;
        int stackIn_112_5 = 0;
        cn stackIn_115_0;
        String stackIn_115_1;
        int stackIn_115_2;
        int stackIn_115_3;
        int stackIn_116_4;
        int stackIn_121_0;
        int stackIn_121_1;
        int stackIn_121_2;
        int stackIn_121_3;
        int stackIn_121_4;
        int stackIn_124_5 = 0;
        cn stackIn_128_0;
        String stackIn_128_1;
        int stackIn_128_2;
        int stackIn_128_3;
        int stackIn_131_4 = 0;
        cn stackIn_135_0;
        String stackIn_135_1;
        int stackIn_135_2;
        int stackIn_135_3;
        int stackIn_138_4 = 0;
        int stackIn_147_0;
        int stackIn_147_1;
        int stackIn_147_2;
        int stackIn_147_3;
        int stackIn_147_4;
        int stackIn_148_5 = 0;
        cn stackIn_151_0;
        String stackIn_151_1;
        int stackIn_151_2;
        int stackIn_151_3;
        int stackIn_152_4;
        int stackIn_159_0;
        int stackIn_159_1;
        int stackIn_159_2;
        int stackIn_159_3;
        int stackIn_159_4;
        int stackIn_160_5 = 0;
        cn stackIn_163_0;
        String stackIn_163_1;
        int stackIn_163_2;
        int stackIn_163_3;
        int stackIn_164_4;
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
        gt var10 = null;
        tf var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        gt var10Lifetime1;
        tf var10_refLifetime1;
        int stackIn_34_0Lifetime1;
        int stackIn_34_1Lifetime1;
        int stackIn_61_0Lifetime1;
        int stackIn_61_1Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var14Lifetime1;
        var15 = Kickabout.field_G;
        try {
          on.a(22, 95, 596, 225, 10, 0, 96);
          pt.a(618, param0 ^ -16754303, 22, 305, 110);
          var2_int = this.field_ib;
          un.field_d.d("<u=FFFFFF>" + dw.field_b.toUpperCase() + "</u>", 320 + var2_int, 125 + this.field_Q, 16777215, -1);
          un.field_d.d(he.field_Ub.toUpperCase(), var2_int + 140, this.field_Q + 130, 16777215, -1);
          un.field_d.d(nu.field_a.toUpperCase(), 500 + var2_int, this.field_Q + 130, 16777215, -1);
          var3 = this.field_Q + 140;
          var4 = 360 + var2_int;
          st.b(var4, param0 ^ 16777113, var3);
          jk.a(param0 ^ 0);
          var5 = this.field_u[this.field_h];
          var6 = this.field_u[1 - this.field_h];
          stackIn_4_0 = un.field_d;
          stackIn_4_1 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ei.field_c, new String[]{Integer.toString(var5)});
          stackIn_4_2 = -40 + var4;
          stackIn_4_3 = var3 + 46;
          if (var6 >= var5) {
            if (var5 >= var6) {
              stackIn_8_4 = 255;
            } else {
              stackIn_8_4 = 16711680;
            }
          } else {
            stackIn_8_4 = 65280;
          }
          ((cn) (Object) stackIn_4_0).d(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_8_4, -1);
          stackIn_11_0 = un.field_d;
          stackIn_11_1 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ei.field_c, new String[]{Integer.toString(var6)});
          stackIn_11_2 = var4 - 40;
          stackIn_11_3 = 87 + var3;
          if (var5 >= var6) {
            if (var6 < var5) {
              stackIn_15_4 = 16711680;
            } else {
              stackIn_15_4 = 255;
            }
          } else {
            stackIn_15_4 = 65280;
          }
          ((cn) (Object) stackIn_11_0).d(stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_15_4, -1);
          var7 = var2_int + 60;
          var8 = this.field_Q + 140;
          pt.a(160 + var7, -22914, var7, var8 + 21, var8);
          on.i(var7, var8, 160, 42, 10, 65793);
          un.field_d.d(ib.field_H, 80 + var7, 17 + var8, 16777215, -1);
          ta.e(124);
          var8 += 40;
          var9 = 0;
          L3: while (true) {
            boolean decompiledFrameRemainder1 = true;
            if (var9 < this.field_a.field_g.length) {
              stackIn_34_0 = 0;
              stackIn_34_1 = this.field_a.field_g[var9].field_p;
              if (var15 != 0) {
                if (stackIn_34_0 > stackIn_34_1) {
                  on.c(var7, var9 + (4 + (var8 - 21)), 160, 65793, -(var9 << 3) + 128);
                  on.c(160 + var7 + 2, 4 + var8 - (21 - var9), 40, 65793, -(var9 << 3) + 128);
                  var9++;
                  break L3;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (stackIn_34_0 == stackIn_34_1 ||
                  var15 != 0) {
                  var10 = this.field_a.field_R[var9];
                  var11 = var10.field_v ? 1 : 0;
                  stackIn_28_0 = (var11 != 0) ? 11184810 : 16777215;
                  var12 = stackIn_28_0;
                  var13 = 65793;
                  var14 = 128;
                  if (~var9 == ~this.field_g) {
                    var13 = 16777215;
                    var14 = 50;
                  }
                  on.a(var7, -17 + var8, 160, 21, var13, var14);
                  un.field_d.d(this.field_a.field_S[var9], var7 + 80, var8, var12, -1);
                  on.a(2 + var7 + 160, -17 + var8, 40, 21, var13, var14);
                  un.field_d.d(vo.$cfr$intArgs$a$53ce4ab4c593(-18, ei.field_c, new String[]{Integer.toString(this.field_k[var9])}), 160 + (var7 + 22), var8, var12, -1);
                  var8 += 23;
                }
                var9++;
                continue;
              }
            }
            if (decompiledFrameRemainder1) {
              var9 = 0;
              while (true) {
                stackIn_34_0Lifetime1 = 16;
                stackIn_34_1Lifetime1 = var9;
                if (stackIn_34_0Lifetime1 <= stackIn_34_1Lifetime1) {
                  break;
                }
                on.c(var7, var9 + (4 + (var8 - 21)), 160, 65793, -(var9 << 3) + 128);
                on.c(160 + var7 + 2, 4 + var8 - (21 - var9), 40, 65793, -(var9 << 3) + 128);
                var9++;
                if (var15 != 0) {
                  break L3;
                }
              }
            }
            var8 = 140 + this.field_Q;
            var7 = var2_int + 420;
            pt.a(var7 + 160, param0 - 16800129, var7, var8 + 21, var8);
            on.i(var7, var8, 160, 42, 10, 65793);
            un.field_d.d(ib.field_H, var7 + 80, var8 + 17, 16777215, -1);
            ta.e(117);
            var8 += 40;
            break;
          }
          var9 = 0;
          L14: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (this.field_a.field_g.length > var9) {
              stackIn_61_0 = -2;
              stackIn_61_1 = ~this.field_a.field_g[var9].field_p;
              if (var15 != 0) {
                if (stackIn_61_0 < stackIn_61_1) {
                  on.c(var7, var9 - 17 + var8, 160, 65793, 128 - (var9 << 3));
                  on.c(-42 + var7, var9 - 21 + (var8 + 4), 40, 65793, -(var9 << 3) + 128);
                  var9++;
                  break L14;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_61_0 == stackIn_61_1 ||
                  var15 != 0) {
                  var10Lifetime1 = this.field_a.field_R[var9];
                  var11Lifetime1 = var10Lifetime1.field_v ? 1 : 0;
                  stackIn_55_0 = (var11Lifetime1 != 0) ? 11184810 : 16777215;
                  var12Lifetime1 = stackIn_55_0;
                  var13Lifetime1 = 65793;
                  var14Lifetime1 = 128;
                  if (~var9 == ~this.field_g) {
                    var13Lifetime1 = 16777215;
                    var14Lifetime1 = 50;
                  }
                  on.a(var7, var8 - 17, 160, 21, var13Lifetime1, var14Lifetime1);
                  un.field_d.d(this.field_a.field_S[var9], var7 + 80, var8, var12Lifetime1, -1);
                  on.a(var7 - 42, var8 - 17, 40, 21, var13Lifetime1, var14Lifetime1);
                  un.field_d.d(vo.$cfr$intArgs$a$53ce4ab4c593(-18, ei.field_c, new String[]{Integer.toString(this.field_k[var9])}), -22 + var7, var8, var12Lifetime1, -1);
                  var8 += 23;
                }
                var9++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var9 = 0;
              while (true) {
                stackIn_61_0Lifetime1 = var9;
                stackIn_61_1Lifetime1 = 16;
                if (stackIn_61_0Lifetime1 >= stackIn_61_1Lifetime1) {
                  break;
                }
                on.c(var7, var9 - 17 + var8, 160, 65793, 128 - (var9 << 3));
                on.c(-42 + var7, var9 - 21 + (var8 + 4), 40, 65793, -(var9 << 3) + 128);
                var9++;
                if (var15 != 0) {
                  break L14;
                }
              }
            }
            stackIn_72_0 = this.field_eb;
            stackIn_72_1 = this.field_db;
            stackIn_72_2 = 32;
            stackIn_72_3 = 195;
            stackIn_72_4 = 8;
            if (!this.field_K &&
              !this.field_W) {
              stackIn_75_5 = this.field_cb;
            } else {
              stackIn_75_5 = 11184810;
            }
            on.a(stackIn_72_0, stackIn_72_1, stackIn_72_2, stackIn_72_3, stackIn_72_4, stackIn_75_5, 128);
            break;
          }
          stackIn_82_0 = un.field_d;
          stackIn_82_1 = qb.field_Vb;
          stackIn_82_2 = this.field_eb + 14;
          stackIn_82_3 = this.field_db + 97 + (un.field_d.a(qb.field_Vb) >> 1);
          if (!this.field_K &&
            !this.field_W) {
            stackIn_83_4 = 11184810;
          } else {
            stackIn_83_4 = 65793;
          }
          ((cn) (Object) stackIn_82_0).b(stackIn_82_1, stackIn_82_2, stackIn_82_3, stackIn_83_4, -1);
          var2_int += 596;
          stackIn_89_0 = un.field_d;
          stackIn_89_1 = dw.field_b;
          stackIn_89_2 = this.field_eb + 29;
          stackIn_89_3 = 97 + this.field_db + (un.field_d.a(dw.field_b) >> 1);
          if (!this.field_K &&
            !this.field_W) {
            stackIn_90_4 = 11184810;
          } else {
            stackIn_90_4 = 65793;
          }
          ((cn) (Object) stackIn_89_0).b(stackIn_89_1, stackIn_89_2, stackIn_89_3, stackIn_90_4, -1);
          var9 = this.field_Q;
          un.field_d.d("<u=FFFFFF>" + qb.field_Vb.toUpperCase() + "</u>", 320 + var2_int, 125 + var9, 16777215, -1);
          var9 += 160;
          on.a(var2_int + 42, var9 - 20, 552, 28, 10, 65793, 128);
          un.field_d.d(he.field_Ub.toUpperCase(), var2_int + 320, var9, param0, -1);
          var9 += 20;
          var10_ref = this.field_bb;
          var9 = this.a(var10_ref, var2_int, var9, true);
          var9 += 35;
          on.a(42 + var2_int, var9 - 20, 552, 28, 10, 65793, 128);
          un.field_d.d(nu.field_a.toUpperCase(), var2_int + 320, var9, 16777215, -1);
          var10_refLifetime1 = this.field_q;
          var9 += 20;
          var9 = this.a(var10_refLifetime1, var2_int, var9, true);
          if (this.field_P != 0 &&
            this.field_M > this.field_P) {
            ta.e(param0 - 16777091);
            pt.a(618, -22914, 22, 320, 110);
            stackIn_99_0 = this.field_x;
            stackIn_99_1 = this.field_B;
            stackIn_99_2 = 570;
            stackIn_99_3 = 24;
            stackIn_99_4 = 8;
            if (this.field_y) {
              stackIn_100_5 = 11184810;
            } else {
              stackIn_100_5 = this.field_cb;
            }
            on.a(stackIn_99_0, stackIn_99_1, stackIn_99_2, stackIn_99_3, stackIn_99_4, stackIn_100_5, 128);
            stackIn_103_0 = un.field_d;
            stackIn_103_1 = qt.field_h;
            stackIn_103_2 = this.field_x + 285;
            stackIn_103_3 = this.field_B + 12;
            if (this.field_y) {
              stackIn_104_4 = 65793;
            } else {
              stackIn_104_4 = 11184810;
            }
            ((cn) (Object) stackIn_103_0).d(stackIn_103_1, stackIn_103_2, stackIn_103_3, stackIn_104_4, -1);
            ta.e(param0 - 16777088);
            pt.a(618, -22914, 22, 305, 110);
          }
          if (this.field_M != 0) {
            ta.e(119);
            pt.a(618, -22914, 22, 320, 95);
            stackIn_111_0 = this.field_T;
            stackIn_111_1 = this.field_kb;
            stackIn_111_2 = 570;
            stackIn_111_3 = 24;
            stackIn_111_4 = 8;
            if (this.field_F) {
              stackIn_112_5 = 11184810;
            } else {
              stackIn_112_5 = this.field_cb;
            }
            on.a(stackIn_111_0, stackIn_111_1, stackIn_111_2, stackIn_111_3, stackIn_111_4, stackIn_112_5, 128);
            stackIn_115_0 = un.field_d;
            stackIn_115_1 = gu.field_Ib;
            stackIn_115_2 = this.field_T + 285;
            stackIn_115_3 = this.field_kb + 24 - 1;
            if (this.field_F) {
              stackIn_116_4 = 65793;
            } else {
              stackIn_116_4 = 11184810;
            }
            ((cn) (Object) stackIn_115_0).d(stackIn_115_1, stackIn_115_2, stackIn_115_3, stackIn_116_4, -1);
            ta.e(127);
            pt.a(618, -22914, 22, 305, 110);
          }
          stackIn_121_0 = this.field_L;
          stackIn_121_1 = this.field_r;
          stackIn_121_2 = 32;
          stackIn_121_3 = 195;
          stackIn_121_4 = 8;
          if (!this.field_C &&
            !this.field_D) {
            stackIn_124_5 = this.field_cb;
          } else {
            stackIn_124_5 = 11184810;
          }
          on.a(stackIn_121_0, stackIn_121_1, stackIn_121_2, stackIn_121_3, stackIn_121_4, stackIn_124_5, 128);
          stackIn_128_0 = un.field_d;
          stackIn_128_1 = rd.field_d;
          stackIn_128_2 = this.field_L + 14;
          stackIn_128_3 = this.field_r - (-97 - (un.field_d.a(rd.field_d) >> 1));
          if (!this.field_C &&
            !this.field_D) {
            stackIn_131_4 = 11184810;
          } else {
            stackIn_131_4 = 65793;
          }
          ((cn) (Object) stackIn_128_0).b(stackIn_128_1, stackIn_128_2, stackIn_128_3, stackIn_131_4, -1);
          var2_int += 596;
          stackIn_135_0 = un.field_d;
          stackIn_135_1 = qb.field_Vb;
          stackIn_135_2 = 29 + this.field_L;
          stackIn_135_3 = this.field_r + (97 + (un.field_d.a(qb.field_Vb) >> 1));
          if (!this.field_C &&
            !this.field_D) {
            stackIn_138_4 = 11184810;
          } else {
            stackIn_138_4 = 65793;
          }
          ((cn) (Object) stackIn_135_0).b(stackIn_135_1, stackIn_135_2, stackIn_135_3, stackIn_138_4, -1);
          var9 = this.field_Q;
          un.field_d.d("<u=FFFFFF>" + rd.field_d.toUpperCase() + "</u>", 320 + var2_int, 125 + this.field_Q, 16777215, -1);
          var9 += 160;
          on.a(42 + var2_int, -20 + var9, 552, 28, 10, 65793, 128);
          un.field_d.d(lw.field_f.toUpperCase(), var2_int + 320, var9, 16777215, -1);
          var11Lifetime2 = var2_int + 240;
          var12Lifetime2 = 80 + var9;
          eo.a(var11Lifetime2, var12Lifetime2, qe.field_j, this.field_p, (String[]) null, 160, 21, this.field_a.field_I, this.field_a.field_S, this.field_g);
          var9 = var9 + (140 + 25 * (this.field_a.field_I + 1));
          on.a(var2_int + 42, -20 + var9, 552, 28, 10, 65793, 128);
          var12Lifetime3 = var9 + 80;
          un.field_d.d(ad.field_b.toUpperCase(), var2_int + 320, var9, 16777215, -1);
          eo.a(var11Lifetime2, var12Lifetime3, d.field_c, this.field_ab, (String[]) null, 160, 21, this.field_a.field_I, this.field_a.field_S, this.field_g);
          var9 = var9 + ((1 + this.field_a.field_I) * 25 + 140);
          if (this.field_lb != 0 &&
            this.field_lb < this.field_M) {
            ta.e(122);
            pt.a(618, param0 ^ -16754303, 22, 320, 110);
            stackIn_147_0 = this.field_H;
            stackIn_147_1 = this.field_jb;
            stackIn_147_2 = 570;
            stackIn_147_3 = 24;
            stackIn_147_4 = 8;
            if (!this.field_U) {
              stackIn_148_5 = this.field_cb;
            } else {
              stackIn_148_5 = 11184810;
            }
            on.a(stackIn_147_0, stackIn_147_1, stackIn_147_2, stackIn_147_3, stackIn_147_4, stackIn_148_5, 128);
            stackIn_151_0 = un.field_d;
            stackIn_151_1 = qt.field_h;
            stackIn_151_2 = 285 + this.field_H;
            stackIn_151_3 = 12 + this.field_jb;
            if (this.field_U) {
              stackIn_152_4 = 65793;
            } else {
              stackIn_152_4 = 11184810;
            }
            ((cn) (Object) stackIn_151_0).d(stackIn_151_1, stackIn_151_2, stackIn_151_3, stackIn_152_4, -1);
            ta.e(117);
            pt.a(618, param0 ^ -16754303, 22, 305, 110);
          }
          if (this.field_M != 0) {
            ta.e(param0 ^ 16777090);
            pt.a(618, -22914, 22, 320, 95);
            stackIn_159_0 = this.field_v;
            stackIn_159_1 = this.field_A;
            stackIn_159_2 = 570;
            stackIn_159_3 = 24;
            stackIn_159_4 = 8;
            if (!this.field_t) {
              stackIn_160_5 = this.field_cb;
            } else {
              stackIn_160_5 = 11184810;
            }
            on.a(stackIn_159_0, stackIn_159_1, stackIn_159_2, stackIn_159_3, stackIn_159_4, stackIn_160_5, 128);
            stackIn_163_0 = un.field_d;
            stackIn_163_1 = gu.field_Ib;
            stackIn_163_2 = 285 + this.field_v;
            stackIn_163_3 = -1 + this.field_A + 24;
            if (!this.field_t) {
              stackIn_164_4 = 11184810;
            } else {
              stackIn_164_4 = 65793;
            }
            ((cn) (Object) stackIn_163_0).d(stackIn_163_1, stackIn_163_2, stackIn_163_3, stackIn_164_4, -1);
            ta.e(param0 - 16777089);
            pt.a(618, param0 ^ -16754303, 22, 305, 110);
          }
          ta.e(127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "ol.K(" + param0 + ')');
        }
    }

    final boolean e(int param0, int param1) {
        boolean stackIn_40_0 = false;
        boolean stackIn_69_0 = false;
        boolean stackIn_80_0 = false;
        boolean stackIn_88_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = this.field_c[param0].field_m;
          if (param1 != 50) {
            return false;
          }
          if (this.field_g == -2) {
            if (!this.field_a.field_L) {
              stackIn_88_0 = (var3_int == 12) || (56 == var3_int);
              return stackIn_88_0;
            }
            stackIn_80_0 = (var3_int == 55) || (56 == var3_int);
            return stackIn_80_0;
          }
          if (this.field_a.field_L) {
            boolean decompiledFrameRemainder1 = true;
            if (var3_int != 55 && ((this.field_a.field_e ||
              var3_int != 47) &&
              (this.field_a.field_e ||
              50 != var3_int) &&
              (!this.field_a.field_e ||
              56 != var3_int) &&
              (44 != var3_int ||
              !(ok.field_a.a(false) > 0)))) {
              stackIn_69_0 = false;
              decompiledFrameRemainder1 = false;
            }
            else {
              stackIn_69_0 = true;
            }
            return stackIn_69_0;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var3_int != 12 && (this.field_a.field_e ||
            47 != var3_int) && (this.field_a.field_e ||
            var3_int != 50) && (!this.field_a.field_e ||
            var3_int != 56) && var3_int != 11 && (44 != var3_int ||
            !(ok.field_a.a(false) > 0))) {
            stackIn_40_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_40_0 = true;
          }
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.N(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        String var6 = null;
        up var7 = null;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        StringBuilder stackIn_30_0 = null;
        String stackIn_31_1 = null;
        StringBuilder stackIn_34_0 = null;
        String stackIn_35_1 = null;
        RuntimeException decompiledCaughtException = null;
        String var7_refLifetime1;
        var10 = Kickabout.field_G;
        try {
          var6_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6_int >= 4))) {
            stackIn_25_0 = 0;
            stackIn_25_1 = ~this.field_hb[var6_int];
            if (var10 == 0) {
              if (stackIn_25_0 != stackIn_25_1) {
                var7 = this.field_o[var6_int].field_Eb;
                on.a(-30 + this.field_o[var6_int].field_F, 92, 110, 180, 10, 0, 128);
                this.field_o[var6_int].h((byte) -116);
                this.field_s[var6_int].a(59, true);
                if (var7.field_n >= 100 &&
                  100 <= var7.field_g &&
                  100 <= var7.field_o) {
                  wq.a(-23 + this.field_o[var6_int].field_F, param1, 150, (byte) 32, hv.field_b, 100);
                } else {
                  var8 = Math.abs(this.field_j);
                  var8 = var8 | Math.abs(this.field_j) << 8;
                  var8 = var8 | 16711680;
                  eo.a(this.field_o[var6_int].field_F - 25, this.field_o[var6_int].field_T + 80, var7.field_r, 3, false, 0);
                  var9 = "";
                  if (this.field_l[var6_int] > 0) {
                    var9 = var9 + rg.field_d + "+" + this.field_l[var6_int];
                  }
                  if (var7.field_r >= 100) {
                    var9 = var9 + "<br>" + ss.field_e + "<col=" + Integer.toHexString(var8) + ">Max</col>";
                  } else {
                    var9 = var9 + "<br>" + ss.field_e + var7.field_r;
                  }
                  wq.a(-30 + this.field_o[var6_int].field_F, param1, 164, (byte) 32, var9, 110);
                }
              }
              var6_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            param4 += 6;
            on.b(159, param4 + 36, 159, 63 + param4, 4473924);
            on.b(160, param4 + 35, 160, 64 + param4, 11184810);
            on.b(161, 36 + param4, 161, param4 + 63, 4473924);
            on.b(469, 36 + param4, 469, param4 + 63, 4473924);
            on.b(470, param4 + 35, 470, param4 + 64, 11184810);
            on.b(471, param4 + 36, 471, 63 + param4, 4473924);
            on.b(33, param4 + 71, 602, param4 + 71, 4473924);
            on.b(32, 72 + param4, 603, param4 + 72, 11184810);
            on.b(33, 73 + param4, 602, 73 + param4, 4473924);
            stackIn_25_0 = param3;
            stackIn_25_1 = 119;
          }
          if (stackIn_25_0 != stackIn_25_1) {
            return;
          }
          wq.a(param2, param1, param4, (byte) 32, gn.field_c, param0);
          var6 = pj.field_D + "+" + ad.a(this.field_G, 26300);
          var6 = var6 + "<br>" + ss.field_e + ad.a(tu.field_E.field_x, 26300);
          wq.a(25, param1, param4, (byte) 32, var6, 140);
          stackIn_30_0 = new StringBuilder().append(bt.field_c);
          if (this.field_Y > 0) {
            stackIn_31_1 = "+";
          } else {
            stackIn_31_1 = "";
          }
          var7_ref = ((StringBuilder) (Object) stackIn_30_0).append(stackIn_31_1).append(Integer.toString(this.field_Y)).toString();
          stackIn_34_0 = new StringBuilder().append(var7_ref).append("<br>").append(ss.field_e);
          if (tu.field_E.field_t == 6) {
            stackIn_35_1 = Integer.toString(tu.field_E.field_r);
          } else {
            stackIn_35_1 = Integer.toString(tu.field_E.field_E);
          }
          var7_refLifetime1 = ((StringBuilder) (Object) stackIn_34_0).append(stackIn_35_1).toString();
          wq.a(475, param1, param4, (byte) 32, var7_refLifetime1, 135);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) runtimeException), "ol.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var4 = ne.field_G;
          if (!var4[rb.field_Kb] &&
            !var4[98] &&
            param2 != 98) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = 1;
          }
          var5 = stackIn_10_0;
          if (!var4[uv.field_e] &&
            !var4[96] &&
            param2 != 96) {
            stackIn_20_0 = 0;
          } else {
            stackIn_20_0 = 1;
          }
          var6 = stackIn_20_0;
          if (!var4[oc.field_e] &&
            !var4[99] &&
            param2 != 99) {
            stackIn_30_0 = 0;
          } else {
            stackIn_30_0 = 1;
          }
          var7 = stackIn_30_0;
          if (!var4[pb.field_A] &&
            !var4[97] &&
            param2 != 97) {
            stackIn_40_0 = 0;
          } else {
            stackIn_40_0 = 1;
          }
          var8 = stackIn_40_0;
          if ((this.field_ib == 0 ||
            this.field_ib == -596) && var8 != 0) {
            this.field_X = this.field_X - 596;
            return true;
          }
          if ((this.field_ib == -596 ||
            this.field_ib == -1192) &&
            var6 != 0) {
            this.field_X = this.field_X + 596;
            return true;
          }
          if (this.field_P != 0 &&
            this.field_M > this.field_P &&
            var7 != 0) {
            this.field_M = this.field_M - 32;
            return true;
          }
          if (this.field_M < 0 &&
            var5 != 0) {
            this.field_M = this.field_M + 32;
            return true;
          }
          if (0 != this.field_lb &&
            this.field_M > this.field_lb &&
            var7 != 0) {
            this.field_M = this.field_M - 32;
            return true;
          }
          if (0 > this.field_M &&
            var5 != 0) {
            this.field_M = this.field_M + 32;
            return true;
          }
          if (param1 != 1670) {
            this.field_Y = 19;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4_ref), "ol.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final tf h(int param0) {
        RuntimeException var2 = null;
        tf stackIn_2_0 = null;
        tf stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -19510) {
            stackIn_4_0 = this.field_gb;
            return stackIn_4_0;
          }
          stackIn_2_0 = (tf) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "ol.E(" + param0 + ')');
        }
    }

    ol(nu param0, int param1, boolean param2) {
        super(param0, param1, param2, (int[]) null);
        int dupTemp$0 = 0;
        String[] arrayValue$1 = null;
        int incrementValue$2 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_73_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_20_0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        it var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_64_0Lifetime1;
        int stackIn_64_1Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6_intLifetime1;
        int var8Lifetime1;
        var10 = Kickabout.field_G;
        this.field_cb = 65793;
        this.field_kb = 83;
        this.field_u = new int[2];
        this.field_mb = 0;
        this.field_B = 307;
        this.field_db = 110;
        this.field_V = 0;
        this.field_r = 110;
        this.field_jb = 307;
        this.field_A = 83;
        this.field_Q = 0;
        this.field_S = 0;
        this.field_M = this.field_Q;
        this.field_ib = 0;
        this.field_H = 32 + (this.field_ib + 1192);
        this.field_L = this.field_ib + 596 + 600;
        this.field_eb = 600 + this.field_ib;
        this.field_X = this.field_ib;
        this.field_x = 32 + this.field_ib + 596;
        this.field_T = 596 + (this.field_ib + 32);
        this.field_v = this.field_ib + 1192 + 32;
        this.field_bb = new tf();
        this.field_q = new tf();
        try {
          boolean decompiledFrameCompleted3 = true;
          var4 = new int[]{47, 56, 50, 44, 11, 12, 55};
          if (var4 != null) {
            var5 = 120;
            this.field_c = new io[var4.length];
            var6_int = 0;
            while (var6_int < var4.length) {
              this.field_c[var6_int] = new io(var5, 7126504, var4[var6_int]);
              var6_int++;
              if (var10 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
            if (decompiledFrameCompleted3) {
              this.a(-26254);
            }
          }
          if (decompiledFrameCompleted3) {
            ia.field_c = false;
            this.field_gb = new tf();
            this.field_Z = rl.field_u;
          }
          if (null != param0.field_X) {
            this.field_Z = mu.field_S;
            if (param0.field_X.field_j[1] > param0.field_X.field_j[0]) {
              this.field_Z = qq.field_J;
            }
            this.field_Z = vo.$cfr$intArgs$a$53ce4ab4c593(-18, this.field_Z, new String[]{Integer.toString(param0.field_X.field_j[0]), Integer.toString(param0.field_X.field_j[1])});
          }
          this.field_m = new int[2];
          this.field_w = new String[2][8];
          this.field_O = new int[2][8];
          this.field_J = new int[]{-1, -1};
          var5Lifetime1 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var5Lifetime1 < param0.field_I)))) {
            stackOut_20_0 = param0.field_g[var5Lifetime1].field_l;
            stackIn_33_0 = stackOut_20_0 ? 1 : 0;
            stackIn_21_0 = stackOut_20_0;
            if (var10 == 0) {
              stackIn_27_0 = (stackIn_21_0) ? 0 : 1;
              var6_intLifetime1 = stackIn_27_0;
              if (~param1 == ~var5Lifetime1) {
                this.field_J[var6_intLifetime1] = this.field_m[var6_intLifetime1];
              }
              this.field_O[var6_intLifetime1][this.field_m[var6_intLifetime1]] = var5Lifetime1;
              dupTemp$0 = this.field_m[var6_intLifetime1];
              arrayValue$1 = this.field_w[var6_intLifetime1];
              this.field_m[var6_intLifetime1] = dupTemp$0 + 1;
              arrayValue$1[dupTemp$0] = param0.field_S[var5Lifetime1].toLowerCase();
              var5Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_I = new String[]{lr.field_l, of.field_c};
            stackIn_33_0 = 0;
          }
          if (stackIn_33_0 == ~param0.field_Z ||
            param0.field_Z == -3 ||
            param0.field_L &&
            (0 == this.field_m[0] ||
            this.field_m[1] == 0)) {
            this.field_I[0] = ve.field_Q;
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted2 = true;
          if (0 <= param1) {
            var5Lifetime2 = 0;
            var6 = param0.field_g[param1];
            this.field_N = param0.field_R[param1].field_n;
            this.field_G = var6.field_g;
            if (!this.field_a.field_e) {
              this.field_hb = new int[]{-1, -1, -1, -1};
              this.field_Y = var6.field_k;
              var7 = 0;
              var8 = 0;
              while (4 > var8) {
                stackIn_64_0 = ~this.field_a.field_i[this.field_h][var8];
                stackIn_64_1 = ~this.field_g;
                if (var10 != 0) {
                  if (stackIn_64_0 >= stackIn_64_1) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                  this.field_o[var8] = new kq();
                  stackIn_76_0 = var8 * 155;
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_64_0 == stackIn_64_1) {
                  var5Lifetime2++;
                  incrementValue$2 = var7;
                  var7++;
                  this.field_hb[incrementValue$2] = this.field_a.field_k[this.field_h][var8];
                }
                var8++;
                if (var10 == 0) {
                  continue;
                }
                break;
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1)) {
                this.field_s = new hd[4];
                this.field_l = var6.field_o;
                this.field_o = new kq[4];
                var8Lifetime1 = 0;
                while (true) {
                  stackIn_64_0Lifetime1 = -5;
                  stackIn_64_1Lifetime1 = ~var8Lifetime1;
                  if (stackIn_64_0Lifetime1 >= stackIn_64_1Lifetime1) {
                    break;
                  }
                  this.field_o[var8Lifetime1] = new kq();
                  stackIn_76_0 = var8Lifetime1 * 155;
                  if (var10 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  stackIn_73_1 = 300;
                  if (1 < var5Lifetime2) {
                    stackIn_74_2 = (var5Lifetime2 - 1) * 80;
                  } else {
                    stackIn_74_2 = 0;
                  }
                  var9 = stackIn_76_0 + (stackIn_73_1 - stackIn_74_2);
                  this.field_o[var8Lifetime1].a(true, 50, var9, 100, 100);
                  this.field_s[var8Lifetime1] = eo.a(so.field_a.toLowerCase(), 7126504, un.field_d, 80, true);
                  this.field_s[var8Lifetime1].a(true, this.field_s[var8Lifetime1].field_q, var9 - 15, 230, this.field_s[var8Lifetime1].field_mb);
                  var8Lifetime1++;
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            st.a((nu) null, this.field_g, 50);
            oa.b(-23217);
            stackIn_76_0 = 111;
          }
          mv.$cfr$intArgs$a$6121ff5511c4(stackIn_76_0);
          this.field_fb = new ut[2];
          this.field_j = 256;
          this.field_fb[0] = ae.a(true, (byte) -52, 0, 80, 7126504);
          this.field_fb[1] = ae.a(true, (byte) -52, 1, 80, 7126504);
          if (this.field_p == null) {
            this.field_p = new int[this.field_a.field_I][4];
          }
          if (null == this.field_ab) {
            this.field_ab = new int[this.field_a.field_I][4];
          }
          this.field_u = new int[2];
          this.field_k = new int[this.field_a.field_I];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_88_0 = var4_ref;
          stackIn_88_1 = new StringBuilder().append("ol.<init>(");
          if (param0 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Kickabout.field_G;
        try {
          this.c(param0 + 121);
          this.a(false, this.field_Z);
          stackIn_4_0 = 15;
          if (this.field_S == param0) {
            stackIn_5_1 = -44;
          } else {
            stackIn_5_1 = 0;
          }
          stackIn_8_1 = stackIn_5_1 + 325;
          stackIn_8_2 = 610;
          if (this.field_S == 1) {
            stackIn_9_3 = 44;
          } else {
            stackIn_9_3 = 0;
          }
          on.a(stackIn_4_0, stackIn_8_1, stackIn_8_2, stackIn_9_3 + 35, 10, 0, 128);
          this.d(123);
          if (this.e(3, 50) &&
            this.field_S == 0) {
            var3 = this.d(127, 3);
            var4 = this.c(342, 3);
            pt.a(31 + var3, -22914, var3 - 31, var4 - 17, var4 - 37);
            on.a(-30 + var3, var4 - 32, 60, 30, 8, 65793, 128);
            ta.e(param0 + 116);
            uv.a(var3 - 19, (byte) -82, -22 + var4);
            pb.field_C.a(eq.field_b, -6 + var3, -16 + var4, 16777215, -1);
          }
          var2_int = 245;
          if (this.e(0, param0 ^ 51) &&
            0 == this.field_S &&
            0 <= this.field_g &&
            this.b((byte) -109)) {
            var3Lifetime1 = this.d(param0 ^ 126, 0);
            var4Lifetime1 = this.c(342, 0);
            pt.a(31 + var3Lifetime1, -22914, -31 + var3Lifetime1, var4Lifetime1 - 17, -37 + var4Lifetime1);
            on.a(var3Lifetime1 - 30, -32 + var4Lifetime1, 60, 30, 8, 65793, 128);
            ta.e(126);
            uv.a(var3Lifetime1 - 19, (byte) 99, var4Lifetime1 - 22);
            pb.field_C.a(eq.field_b, var3Lifetime1 - 6, -16 + var4Lifetime1, 16777215, -1);
          }
          if (this.field_S != 2) {
            if (0 == this.field_S ||
              !(this.field_g >= 0) ||
              this.field_a.field_e) {
              this.f(86);
              if ((var5 != 0) &&
                (1 == this.field_S &&
                !(0 > this.field_g) &&
                !this.field_a.field_e)) {
                this.a(300, 100, 170, (byte) 119, var2_int);
                this.i(16777215);
              }
            } else {
              if (1 == this.field_S &&
                !(0 > this.field_g) &&
                !this.field_a.field_e) {
                this.a(300, 100, 170, (byte) 119, var2_int);
                if (var5 != 0) {
                  this.i(16777215);
                }
              }
            }
          } else {
            this.i(16777215);
          }
          if (this.field_a.field_f) {
            un.field_d.a("FB", 5, 17, 16777215, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "ol.S(" + param0 + ')');
        }
    }

    final void a(int param0, hn param1, int param2, int param3) {
        up dupTemp$0 = null;
        up dupTemp$1 = null;
        up dupTemp$2 = null;
        up dupTemp$3 = null;
        boolean stackIn_6_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        hn var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          if (this.field_a.field_e) {
            return;
          }
          var5 = (hn) (this.field_gb.g(24009));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var5))) {
            stackOut_5_0 = param1.a(var5, 114);
            stackIn_13_0 = stackOut_5_0 ? 1 : 0;
            stackIn_6_0 = stackOut_5_0;
            if (var6 == 0) {
              if (stackIn_6_0) {
                return;
              }
              var5 = (hn) (this.field_gb.c(param0 ^ 32));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = -1;
          }
          if (stackIn_13_0 == ~param3) {
            dupTemp$0 = tu.field_E.field_i[this.field_hb[param2]];
            dupTemp$0.field_n = dupTemp$0.field_n + 1;
          }
          if (param3 == param0) {
            dupTemp$1 = tu.field_E.field_i[this.field_hb[param2]];
            dupTemp$1.field_g = dupTemp$1.field_g + 1;
          }
          if (2 == param3) {
            dupTemp$2 = tu.field_E.field_i[this.field_hb[param2]];
            dupTemp$2.field_o = dupTemp$2.field_o + 1;
          }
          dupTemp$3 = tu.field_E.field_i[this.field_hb[param2]];
          dupTemp$3.field_r = dupTemp$3.field_r - 100;
          this.field_gb.a(param1, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_30_0 = var5_ref;
          stackIn_30_1 = new StringBuilder().append("ol.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(tf param0, int param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ch var11_ref_ch = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        var15 = Kickabout.field_G;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (param0.a(false) != 0) {
            var5_int = 150 + param1;
            var6 = 2 + (160 + var5_int);
            var7 = 244 + var5_int;
            var8 = 160;
            pt.a(4 + (var5_int + 320), -22914, var5_int, param2 + 21, param2);
            var9 = 80;
            on.i(var5_int, param2, var8, 42, 10, 65793);
            on.i(var6, param2, var9, 42, 10, 65793);
            on.i(var7, param2, var9, 42, 10, 65793);
            un.field_d.d(ib.field_H, var5_int + (var8 >> 1), param2 + 17, 16777215, -1);
            un.field_d.d(et.field_e, var6 + (var9 >> 1), param2 + 17, 16777215, -1);
            un.field_d.d(lt.field_e, var7 + (var9 >> 1), 17 + param2, 16777215, -1);
            ta.e(122);
            var10 = 0;
            var11_ref_ch = (ch) (param0.g(24009));
            while (null != var11_ref_ch) {
              param2 += 23;
              var12 = 65793;
              var13 = 128;
              var14 = this.field_a.field_S[var11_ref_ch.field_s].toLowerCase();
              stackIn_23_0 = ~var11_ref_ch.field_k;
              stackIn_23_1 = ~var11_ref_ch.field_f;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_23_0 != stackIn_23_1) {
                var14 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ae.field_P, new String[]{this.field_a.field_S[var11_ref_ch.field_s].toLowerCase()});
              }
              if (this.field_g == var11_ref_ch.field_s) {
                var13 = 50;
                var12 = 16777215;
              }
              on.a(-26 + var5_int, param2, 24, 21, var12, var13);
              on.a(var5_int, param2, var8, 21, var12, var13);
              on.a(var6, param2, var9, 21, var12, var13);
              on.a(var7, param2, var9, 21, var12, var13);
              var10++;
              un.field_d.d(Integer.toString(var10), -14 + var5_int, 16 + param2, 16777215, -1);
              un.field_d.d(var14, (var8 >> 1) + var5_int, 16 + param2, 16777215, -1);
              un.field_d.d(this.g(var11_ref_ch.field_t, -16305), var6 + (var9 >> 1), param2 + 16, 16777215, -1);
              un.field_d.d(this.a((byte) -110, var11_ref_ch.field_l), (var9 >> 1) + var7, 16 + param2, 16777215, -1);
              var11_ref_ch = (ch) (param0.c(33));
            }
            if (decompiledFrameCompleted0) {
              param2 += 23;
              var11 = 0;
              while (true) {
                if (16 > var11) {
                  on.c(-26 + var5_int, param2 + var11, 24, 65793, 128 - (var11 << 3));
                  on.c(var5_int, param2 + var11, var8, 65793, 128 - (var11 << 3));
                  on.c(var6, param2 + var11, var9, 65793, 128 - (var11 << 3));
                  on.c(var7, param2 + var11, var9, 65793, -(var11 << 3) + 128);
                  var11++;
                  if (var15 == 0) {
                    continue;
                  }
                } else {
                  param2 += 10;
                }
                break;
              }
              if (var15 != 0) {
                param2 += 10;
                un.field_d.d(jl.field_c, param1 + 320, param2, 16777215, -1);
              }
            }
          } else {
            param2 += 10;
            un.field_d.d(jl.field_c, param1 + 320, param2, 16777215, -1);
          }
          if (decompiledFrameCompleted0) {
            stackIn_23_0 = param3 ? 1 : 0;
            stackIn_23_1 = 1;
          }
          if (stackIn_23_0 != stackIn_23_1) {
            this.field_U = false;
          }
          stackIn_27_0 = param2;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("ol.M(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          if (param1 == 11 &&
            this.field_f &&
            this.field_g >= 0) {
            or.field_d.b(75, (byte) -55);
            or.field_d.a(117, 3);
          }
          if (44 == param1) {
            ek.g(-29315);
          }
          if (param0 < 98) {
            this.field_T = 67;
          }
          if (param1 == 50) {
            if (this.field_S != 2) {
              this.field_mb = this.field_S;
            }
            this.field_S = 2;
          }
          if (47 == param1) {
            if (this.field_S == 2) {
              this.field_S = this.field_mb;
              if (var4 != 0) {
                this.field_mb = this.field_S;
                this.field_S = -this.field_S + 1;
              }
            } else {
              this.field_mb = this.field_S;
              this.field_S = -this.field_S + 1;
            }
          }
          if (56 == param1) {
            if (this.field_S == 2) {
              this.field_S = this.field_mb;
              if (var4 != 0) {
                this.field_mb = 0;
                this.field_S = 2;
              }
            } else {
              this.field_mb = 0;
              this.field_S = 2;
            }
          }
          ii.a((byte) -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void f(int param0) {
        int stackIn_5_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_16_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gt var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_40_0Lifetime1;
        int var9Lifetime1;
        var13 = Kickabout.field_G;
        try {
          stackIn_5_0 = (this.field_m[1] != 0) ? 250 : 0;
          var2_int = stackIn_5_0;
          var3 = new int[]{640 - (var2_int + 160) >> 1, var2_int + 480 >> 1};
          var4_int = -107 % ((-1 - param0) / 61);
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (2 <= var5))) {
            var6 = this.field_m[var5];
            stackIn_49_0 = 0;
            stackIn_49_1 = var6;
            if (var13 == 0) {
              if (stackIn_49_0 != stackIn_49_1) {
                var7 = var3[var5];
                wj.a(this.field_J[var5], var6, this.field_I[var5], var7, 100, 124);
                var8 = 140;
                var9 = 0;
                while (this.field_m[var5] > var9) {
                  var10 = this.field_a.field_R[this.field_O[var5][var9]];
                  var11 = var10.field_v ? 1 : 0;
                  stackOut_16_0 = this.field_a.field_g[this.field_O[var5][var9]].field_i;
                  stackIn_40_0 = stackOut_16_0 ? 1 : 0;
                  stackIn_17_0 = stackOut_16_0;
                  if (stackIn_17_0) {
                    uv.a(var7 + 10, (byte) -119, var8 - 6);
                  }
                  b.field_U[this.field_a.field_g[this.field_O[var5][var9]].field_f].c(var7, var8 - 16);
                  stackIn_26_0 = (var11 == 0) ? 16777215 : 11184810;
                  var12 = stackIn_26_0;
                  un.field_d.d(this.field_w[var5][var9], 80 + var7, var8, var12, -1);
                  if (var11 == 0) {
                    if (var10.field_k) {
                      hn.a(8, 16777215, 90, var7, var8, 16777215, wq.field_e);
                    }
                  } else {
                    hn.a(8, 14492194, 110, var7, var8, 11184810, vc.field_A);
                  }
                  if (var10.field_s) {
                    qq.a(110, (byte) -101, 13421772, ss.field_g, var8, var7, 14492194);
                  }
                  var8 += 23;
                  var9++;
                }
                var8 -= 17;
                stackIn_40_0Lifetime1 = 0;
                var9Lifetime1 = stackIn_40_0Lifetime1;
                while (var9Lifetime1 < 16) {
                  on.c(var3[var5], var9Lifetime1 + var8, 160, 65793, -(var9Lifetime1 << 3) + 128);
                  var9Lifetime1++;
                }
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_49_0 = -1;
            stackIn_49_1 = ~this.field_g;
          }
          if (stackIn_49_0 >= stackIn_49_1) {
            if (this.field_a.field_g[this.field_g].field_l &&
              this.field_a.field_Z == -3) {
              var4 = jl.field_b;
            } else {
              if (!um.field_e.field_s) {
                if (this.field_N) {
                  if (this.field_a.field_e) {
                    var4 = je.field_p + "<br>" + vo.$cfr$intArgs$a$53ce4ab4c593(-18, jg.field_I, new String[]{ad.a(this.field_G, 26300)});
                  } else {
                    var4 = mc.field_b + "<br>" + vk.field_a + " " + tq.field_E;
                  }
                } else {
                  var4 = pe.field_c;
                }
              } else {
                var4 = ar.field_d;
                if (um.field_e.field_q) {
                  var4 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, oe.field_m + " " + tq.field_E, new String[]{this.field_a.field_S[1 - this.field_g]});
                  if ((var13 != 0) &&
                    (!this.field_N)) {
                    var4 = pe.field_c;
                  }
                } else {
                  if (!this.field_N) {
                    var4 = pe.field_c;
                  }
                }
                var5 = this.field_a.field_g[this.field_g].field_f;
                if (this.field_a.field_g[this.field_g].field_i) {
                  var5--;
                }
                if (!um.field_e.field_q &&
                  this.field_a.field_g[this.field_g].field_l &&
                  pr.field_a[var5] > this.field_a.field_g[this.field_g].field_h) {
                  var4 = var4 + "<br>" + vo.$cfr$intArgs$a$53ce4ab4c593(-18, ja.field_L, new String[]{q.field_h[var5], Integer.toString(pr.field_a[var5]), Integer.toString(this.field_a.field_g[this.field_g].field_h)});
                }
              }
            }
            var5 = pb.field_C.c(var4, 380, 16);
            wb.a(var4, 400, var5, -5 + (300 - var5), 120, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "ol.P(" + param0 + ')');
        }
    }

    final int d(int param0, int param1) {
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        boolean stackOut_22_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          var3_int = 0;
          var4 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(this.field_c.length > var4)))) {
            stackOut_3_0 = this.e(var4, 50);
            stackIn_10_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var10 == 0) {
              if (stackIn_4_0) {
                var3_int++;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            var4 = 140;
            stackIn_10_0 = 610;
          }
          var5 = stackIn_10_0;
          if (this.e(3, 50)) {
            var4 = 120;
          }
          if (param0 <= 106) {
            this.a('ﾖ', 56, 92);
          }
          var6 = (640 - var5 >> 1) + 3;
          if (1 == var3_int) {
            stackIn_19_0 = var5 + var6 - (var4 >> 1);
            return stackIn_19_0;
          }
          var7 = (-var4 + var5) / (-1 + var3_int);
          var8 = (var4 >> 1) + var6;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 >= param1))) {
            stackOut_22_0 = this.e(var9, 50);
            stackIn_29_0 = stackOut_22_0 ? 1 : 0;
            stackIn_23_0 = stackOut_22_0;
            if (var10 == 0) {
              if (stackIn_23_0) {
                var8 = var8 + var7;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_29_0 = -2 + var8;
          }
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        var5 = Kickabout.field_G;
        try {
          if (~param2 != ~param0) {
            var4_int = param2 - param0 >> 3;
            if (var4_int != 0) {
              param0 = param0 + var4_int;
              if (var5 != 0) {
                if (param2 <= param0) {
                  param0--;
                  param0++;
                } else {
                  param0++;
                }
              }
            } else {
              if (param2 <= param0) {
                param0--;
                if (var5 != 0) {
                  param0++;
                }
              } else {
                param0++;
              }
            }
          }
          if (param1 == -49) {
            stackIn_18_0 = param0;
            return stackIn_18_0;
          }
          stackIn_16_0 = -98;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4), "ol.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, bu param4, int param5) {
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_36_0 = 0;
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_41_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_51_0 = null;
        java.awt.Frame stackIn_53_0 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        cl[] var6 = null;
        wu var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        try {
          if (!param4.b(param0 ^ 9073)) {
            stackIn_5_0 = null;
            return (java.awt.Frame) (stackIn_5_0);
          }
          if (param5 == 0) {
            var6 = kr.a((byte) 124, param4);
            if (var6 == null) {
              stackIn_9_0 = null;
              return (java.awt.Frame) (stackIn_9_0);
            }
            var7_int = 0;
            var8 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var8 < var6.length) {
                stackIn_36_0 = var6[var8].field_f;
                decompiledFrameRemainder0 = (var9 == 0);
                if (decompiledFrameRemainder0) {
                  if (stackIn_36_0 == param1 &&
                    ~param2 == ~var6[var8].field_b && ((param3 == 0 ||
                    ~param3 == ~var6[var8].field_a) &&
                    (var7_int == 0 ||
                    !(var6[var8].field_e <= param5)))) {
                    param5 = var6[var8].field_e;
                    var7_int = 1;
                  }
                  var8++;
                  if (var9 == 0) {
                    continue;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_36_0 = var7_int;
              }
              if (stackIn_36_0 != 0) {
                break;
              }
              stackIn_38_0 = null;
              return (java.awt.Frame) (stackIn_38_0);
            }
          }
          var6_ref = param4.a(param2, param3, false, param1, param5);
          if (param0 != -9027) {
            stackIn_41_0 = (java.awt.Frame) null;
            return stackIn_41_0;
          }
          while (var6_ref.field_a == 0) {
            aj.a(10L, 1);
            if (var9 == 0) {
              continue;
            }
            break;
          }
          var7 = (java.awt.Frame) (var6_ref.field_b);
          if (null == var7) {
            stackIn_48_0 = null;
            return (java.awt.Frame) (stackIn_48_0);
          }
          if (var6_ref.field_a != 2) {
            stackIn_53_0 = var7;
            return stackIn_53_0;
          }
          dq.a(param4, var7, 0);
          stackIn_51_0 = null;
          return (java.awt.Frame) (stackIn_51_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref2 = decompiledCaughtException;
          stackIn_57_0 = var6_ref2;
          stackIn_57_1 = new StringBuilder().append("ol.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_5_1 = 0;
        boolean stackIn_60_1 = false;
        boolean stackIn_73_1 = false;
        boolean stackIn_86_1 = false;
        boolean stackIn_99_1 = false;
        boolean stackIn_112_1 = false;
        boolean stackIn_125_1 = false;
        boolean stackIn_138_1 = false;
        boolean stackIn_151_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13 = 0;
        up var14 = null;
        int var15 = 0;
        var15 = Kickabout.field_G;
        try {
          super.a(-94, param1);
          var3_int = this.field_bb.a(false) + this.field_q.a(false);
          this.field_lb = -((this.field_a.field_I + 1) * 50 + 100);
          if (0 >= var3_int) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 32 * -var3_int;
          }
          boolean decompiledFrameRemainder1 = true;
          this.field_P = stackIn_5_1;
          if (!this.field_a.field_e && (!this.field_a.field_L ||
            this.field_g != -2)) {
            if (0 == this.field_S ||
              this.field_S == 2 &&
              1 == this.field_mb) {
              this.field_c[0].field_p = ni.field_e.toLowerCase();
              decompiledFrameRemainder1 = (var15 != 0);
            }
            if (decompiledFrameRemainder1) {
              this.field_c[0].field_p = oh.field_g.toLowerCase();
              if (var15 != 0) {
                if (0 != this.field_S) {
                  this.field_c[1].field_p = oh.field_g.toLowerCase();
                  this.field_c[1].field_p = q.field_f.toLowerCase();
                } else {
                  this.field_c[1].field_p = q.field_f.toLowerCase();
                }
              }
            }
          } else {
            if (0 != this.field_S) {
              this.field_c[1].field_p = oh.field_g.toLowerCase();
              if (var15 != 0) {
                this.field_c[1].field_p = q.field_f.toLowerCase();
              }
            } else {
              this.field_c[1].field_p = q.field_f.toLowerCase();
            }
          }
          if (this.field_j <= -255) {
            this.field_j = 255;
            if (var15 != 0) {
              this.field_j = this.field_j - 5;
            }
          } else {
            this.field_j = this.field_j - 5;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_S == 2) {
            if (this.field_X != this.field_ib) {
              this.field_M = 0;
            }
            this.field_ib = this.a(this.field_ib, (byte) -49, this.field_X);
            this.field_Q = this.a(this.field_Q, (byte) -49, this.field_M);
            this.field_T = 596 + this.field_ib + 32;
            this.field_H = 32 + (1192 + this.field_ib);
            this.field_v = 32 + (1192 + this.field_ib);
            this.field_eb = 600 + this.field_ib;
            this.field_x = 32 + (this.field_ib + 596);
            this.field_L = 1196 + this.field_ib;
            stackIn_60_1 = (el.field_A >= this.field_H) && (el.field_A <= 570 + this.field_H) && (n.field_m >= this.field_jb) && (n.field_m <= this.field_jb + 12);
            this.field_U = stackIn_60_1;
            stackIn_73_1 = (el.field_A >= 16 + this.field_L) && (32 + this.field_L >= el.field_A) && (this.field_r <= n.field_m) && (n.field_m <= this.field_r + 195);
            this.field_D = stackIn_73_1;
            stackIn_86_1 = (el.field_A >= this.field_T) && (el.field_A <= this.field_T + 570) && (this.field_kb + 12 <= n.field_m) && (n.field_m <= (this.field_kb + 24));
            this.field_F = stackIn_86_1;
            stackIn_99_1 = (this.field_L <= el.field_A) && (16 + this.field_L >= el.field_A) && (this.field_r <= n.field_m) && (n.field_m <= (this.field_r + 195));
            this.field_C = stackIn_99_1;
            stackIn_112_1 = ((16 + this.field_eb) <= el.field_A) && (el.field_A <= 32 + this.field_eb) && (n.field_m >= this.field_db) && (this.field_db + 195 >= n.field_m);
            this.field_W = stackIn_112_1;
            stackIn_125_1 = (this.field_v <= el.field_A) && ((this.field_v + 570) >= el.field_A) && (n.field_m >= (12 + this.field_A)) && ((this.field_A + 24) >= n.field_m);
            this.field_t = stackIn_125_1;
            stackIn_138_1 = (el.field_A >= this.field_eb) && (el.field_A <= (this.field_eb + 16)) && (this.field_db <= n.field_m) && (n.field_m <= this.field_db + 195);
            this.field_K = stackIn_138_1;
            stackIn_151_1 = (el.field_A >= this.field_x) && (el.field_A <= 570 + this.field_x) && (n.field_m >= this.field_B) && (this.field_B + 12 >= n.field_m);
            this.field_y = stackIn_151_1;
            if (this.field_K &&
              wj.field_A == 1 &&
              this.field_ib == 0) {
              ii.a((byte) -124);
              this.field_X = this.field_X - 596;
            }
            if (this.field_W &&
              wj.field_A == 1 &&
              this.field_ib == -596) {
              ii.a((byte) -119);
              this.field_X = this.field_X + 596;
            }
            if (this.field_C &&
              wj.field_A == 1 &&
              -596 == this.field_ib) {
              ii.a((byte) -117);
              this.field_X = this.field_X - 596;
            }
            if (this.field_D &&
              wj.field_A == 1 &&
              this.field_ib == -1192) {
              ii.a((byte) -125);
              this.field_X = this.field_X + 596;
            }
            if (this.field_y &&
              nl.field_p == 1 &&
              this.field_P != 0 &&
              this.field_M > this.field_P) {
              if (wj.field_A == 1) {
                ii.a((byte) -118);
              }
              this.field_M = this.field_M - 32;
            }
            if (this.field_F &&
              1 == nl.field_p &&
              this.field_M < 0) {
              if (wj.field_A == 1) {
                ii.a((byte) -122);
              }
              this.field_M = this.field_M + 32;
            }
            if (this.field_U &&
              nl.field_p == 1 &&
              this.field_lb != 0 &&
              this.field_M > this.field_lb) {
              if (wj.field_A == 1) {
                ii.a((byte) -121);
              }
              this.field_M = this.field_M - 32;
            }
            if (this.field_t &&
              nl.field_p == 1 &&
              this.field_M < 0) {
              if (wj.field_A == 1) {
                ii.a((byte) -127);
              }
              this.field_M = this.field_M + 32;
            }
            if (this.field_X == this.field_ib) {
              this.field_M = this.field_M - 32 * id.field_v;
            }
            if (this.field_M > 0) {
              this.field_M = 0;
            }
            if (this.field_ib == -596 &&
              this.field_P > this.field_M) {
              this.field_M = this.field_P;
              decompiledFrameRemainder0 = (var15 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_ib != -1192 ||
                this.field_lb <= this.field_M) {
                if (this.field_ib == 0) {
                  this.field_M = 0;
                  if (var15 != 0) {
                    this.field_M = this.field_lb;
                  }
                }
              } else {
                this.field_M = this.field_lb;
              }
            }
          }
          var4 = (double)(this.field_V % 151);
          var6 = var4 / 2.0;
          var8 = -37.5 + var6;
          var10 = (int)Math.abs(var8) << 2;
          this.field_cb = var10 << 16 | (65793 | var10 | var10 << 8);
          this.field_V = this.field_V + 1;
          if (param0 >= -92) {
            return;
          }
          if (this.field_g == -2) {
            return;
          }
          var11 = 0;
          var12_int = 0;
          while (var12_int < this.field_a.field_I) {
            if (!this.field_a.field_R[var12_int].field_v) {
              var11++;
            }
            var12_int++;
            if (var15 == 0) {
              continue;
            }
            break;
          }
          var12 = nj.field_c;
          if (var11 == 1) {
            var12 = ig.field_k;
          }
          if ((var11 != 1 ||
            var15 != 0) &&
            this.field_a.field_R[this.field_g].field_k) {
            var12 = gw.field_e;
          }
          this.field_c[4].field_p = var12.toLowerCase();
          if (1 == this.field_S &&
            !this.field_a.field_e) {
            var13 = 0;
            while (4 > var13) {
              if (var15 != 0) {
                return;
              }
              if (this.field_hb[var13] != -1) {
                var14 = tu.field_E.field_i[this.field_hb[var13]];
                this.field_o[var13].b(0, param1);
                this.field_o[var13].a(this.field_a.field_Q[this.field_h], this.field_a.field_H[this.field_h], (byte) 126, this.field_a.field_d[this.field_h], var14);
                this.field_s[var13].b(0, param1);
                if (100 > var14.field_r) {
                  this.field_s[var13].field_lb = false;
                } else {
                  this.field_s[var13].field_lb = true;
                }
                if (var14.field_n >= 100 &&
                  var14.field_g >= 100 &&
                  var14.field_o >= 100) {
                  this.field_s[var13].field_lb = false;
                }
                if (1 == this.field_s[var13].field_sb) {
                  if (100 <= var14.field_r) {
                    if (100 <= var14.field_n &&
                      var14.field_o >= 100 &&
                      var14.field_g >= 100) {
                      sk.a(7, 16586, var14);
                      sp.c(49, -122);
                    } else {
                      dg.a((byte) -120, var13, this.field_hb[var13], var14);
                      sp.c(49, -121);
                    }
                  } else {
                    if (var14.field_n >= 100 &&
                      var14.field_o >= 100 &&
                      var14.field_g >= 100) {
                      sk.a(7, 16586, var14);
                      sp.c(49, 52);
                    }
                  }
                  kj.a((byte) 61);
                }
              }
              var13++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.H(" + param0 + ',' + param1 + ')');
        }
    }

    public static void g(int param0) {
        try {
          field_E = null;
          field_n = null;
          if (param0 > 0) {
            field_E = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ol.A(" + param0 + ')');
        }
    }

    private final String g(int param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -16305) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (param0 == 2) {
            stackIn_5_0 = dn.field_Ab;
            return stackIn_5_0;
          }
          if (param0 == 3) {
            stackIn_15_0 = fb.field_S;
            return stackIn_15_0;
          }
          if (param0 != 1) {
            stackIn_13_0 = rb.field_Ib;
            return stackIn_13_0;
          }
          stackIn_11_0 = cu.field_g;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final String a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1 = -param1 + this.field_a.field_O;
          var3_int = param1 / 50;
          var4 = var3_int / 60;
          var6 = 121 % ((param0 - 27) / 45);
          var5 = -(var4 * 60) + var3_int;
          if (var4 == 0) {
            stackIn_2_0 = Integer.toString(var5) + "s";
            return stackIn_2_0;
          }
          if (10 > var5) {
            stackIn_7_0 = Integer.toString(var4) + ":" + Integer.toString(0) + Integer.toString(var5);
            return stackIn_7_0;
          }
          stackIn_5_0 = var4 + ":" + var5;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.R(" + param0 + ',' + param1 + ')');
        }
    }

    final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 342) {
            this.d(-95, 21);
          }
          stackIn_4_0 = 342;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_n = "Discard";
        field_E = "You have entered another game.";
        field_R = false;
    }
}
