/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hia extends sfa {
    int field_k;
    int field_j;
    static String field_i;

    public static void d(byte param0) {
        if (param0 != -74) {
          hia.d((byte) 13);
        }
        field_i = null;
    }

    hia(int param0, aga param1) {
        super(1, param0, new nq(param1));
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lu var17 = null;
        lu var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        var16 = BachelorFridge.field_y;
        try {
          var17 = new lu(param1);
          var18 = var17;
          var18.field_g = param1.length - 2;
          ok.field_vb = var18.e((byte) 62);
          eha.field_s = new int[ok.field_vb];
          fd.field_D = new int[ok.field_vb];
          baa.field_P = new byte[ok.field_vb][];
          cea.field_d = new byte[ok.field_vb][];
          uf.field_b = new boolean[ok.field_vb];
          fl.field_j = new int[ok.field_vb];
          lq.field_A = new int[ok.field_vb];
          var18.field_g = -(8 * ok.field_vb) + param1.length - 7;
          ok.field_Bb = var18.e((byte) 101);
          kh.field_r = var18.e((byte) 60);
          var3 = (var18.b(16711935) & 255) + 1;
          for (var4 = 0; var4 < ok.field_vb; var4++) {
            fl.field_j[var4] = var17.e((byte) 57);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < ok.field_vb; var4Lifetime1++) {
            fd.field_D[var4Lifetime1] = var18.e((byte) 99);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < ok.field_vb; var4Lifetime2++) {
            lq.field_A[var4Lifetime2] = var18.e((byte) 67);
          }
          var4Lifetime3 = 7 % ((param0 - 60) / 48);
          for (var5 = 0; var5 < ok.field_vb; var5++) {
            eha.field_s[var5] = var18.e((byte) 105);
          }
          var18.field_g = param1.length - (7 + 8 * ok.field_vb + (3 * var3 - 3));
          hk.field_f = new int[var3];
          for (var5Lifetime1 = 1; var3 > var5Lifetime1; var5Lifetime1++) {
            hk.field_f[var5Lifetime1] = var18.a(3);
            if (hk.field_f[var5Lifetime1] == 0) {
              hk.field_f[var5Lifetime1] = 1;
            }
          }
          var18.field_g = 0;
          for (var5Lifetime2 = 0; ok.field_vb > var5Lifetime2; var5Lifetime2++) {
            var6 = lq.field_A[var5Lifetime2];
            var7 = eha.field_s[var5Lifetime2];
            var8 = var6 * var7;
            var21 = new byte[var8];
            var19 = var21;
            var9 = var19;
            baa.field_P[var5Lifetime2] = var21;
            var22 = new byte[var8];
            var20 = var22;
            var10 = var20;
            cea.field_d[var5Lifetime2] = var22;
            var11 = 0;
            var12 = var18.b(16711935);
            if ((1 & var12) == 0) {
              for (var13 = 0; var8 > var13; var13++) {
                var9[var13] = var18.b(true);
              }
              if ((2 & var12) != 0) {
                for (var13 = 0; var13 < var8; var13++) {
                  dupTemp$1 = var18.b(true);
                  var10[var13] = dupTemp$1;
                  var14 = dupTemp$1;
                  stackIn_29_0 = var11;
                  if (var14 == -1) {
                    stackIn_30_1 = 0;
                  } else {
                    stackIn_30_1 = 1;
                  }
                  var11 = stackIn_29_0 | stackIn_30_1;
                }
              }
            } else {
              for (var13 = 0; var6 > var13; var13++) {
                for (var14 = 0; var7 > var14; var14++) {
                  var9[var13 + var14 * var6] = var18.b(true);
                }
              }
              if (0 != (2 & var12)) {
                for (var13 = 0; var13 < var6; var13++) {
                  for (var14 = 0; var14 < var7; var14++) {
                    dupTemp$0 = var18.b(true);
                    var10[var6 * var14 + var13] = dupTemp$0;
                    var15 = dupTemp$0;
                    stackIn_45_0 = var11;
                    if (var15 == -1) {
                      stackIn_46_1 = 0;
                    } else {
                      stackIn_46_1 = 1;
                    }
                    var11 = stackIn_45_0 | stackIn_46_1;
                  }
                }
              }
            }
            uf.field_b[var5Lifetime2] = var11 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("hia.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    private final vja a(boolean param0, boolean param1, boolean param2, int param3) {
        if (((t) (al.a(param3 ^ -366, this.field_g))).field_p == 3) {
          return (vja) ((Object) new ce(this.field_g, this.field_h, this.field_j, param0, param2, param1, 0));
        }
        if (param3 != -279) {
          this.field_j = -73;
        }
        if (((t) (al.a(param3 + 240, this.field_g))).field_p == 2) {
          return (vja) ((Object) new hba(this.field_g, this.field_h, this.field_j, this.field_k, param0, param2, param1, false));
        }
        return new vja(this.field_g, this.field_h, this.field_j, this.field_k, param0, param2, param1);
    }

    final ii a(op param0, int param1) {
        vja stackIn_4_0 = null;
        vja stackIn_10_0 = null;
        vja stackIn_15_0 = null;
        hba stackIn_31_0 = null;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        t var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lu var9 = null;
        aga var10 = null;
        int var6Lifetime1;
        var8 = BachelorFridge.field_y;
        try {
          var10 = this.field_h.a(44, param0);
          if (9 == var10.field_y) {
            stackIn_4_0 = this.a(true, false, true, param1 ^ -278);
            return (ii) ((Object) stackIn_4_0);
          }
          if (param1 != 3) {
            var9 = (lu) null;
            this.a(-51, (lu) null);
          }
          if (2 == var10.field_y) {
            stackIn_10_0 = this.a(true, false, true, param1 - 282);
            return (ii) ((Object) stackIn_10_0);
          }
          if (11 == var10.field_y &&
            50 < kla.a(100, param0.field_w, -2147483648)) {
            stackIn_15_0 = this.a(false, true, true, -279);
            return (ii) ((Object) stackIn_15_0);
          }
          var4 = (t) (al.a(-107, this.field_g));
          if (var10.field_q < 10) {
          }
          kla.a(50, param0.field_w, param1 + 2147483645);
          var5 = null;
          if (var4.field_p == 3) {
            var6 = this.field_k;
            this.field_k = 0;
            var7 = 0;
            if (var4.field_u == 15 ||
              var4.field_u == 45 ||
              var4.field_u == 46) {
              var7 = 1;
            }
            var6 = om.a(this.field_j, (byte) 118, var10.field_J, var7 != 0, var6, var10, var10.field_x, param0);
            var5 = new ce(this.field_g, this.field_h, this.field_j, false, false, false, var6);
            while (var6 > this.field_k) {
              this.a(104, ((vja) (var5)).field_o, param0);
              this.field_k = this.field_k + 1;
            }
          }
          if (2 == var4.field_p) {
            var6Lifetime1 = this.field_k;
            if (!param0.a(-9, var6Lifetime1, this.field_j, var10)) {
              stackIn_31_0 = new hba(this.field_g, this.field_h, this.field_j, var6Lifetime1, false, false, false, true);
              return (ii) ((Object) stackIn_31_0);
            }
            var5 = new hba(this.field_g, this.field_h, this.field_j, var6Lifetime1, false, false, false, false);
          }
          if (var5 == null) {
            var5 = this.a(false, false, false, -279);
          }
          this.a(param1 ^ 94, ((vja) (var5)).field_o, param0);
          stackIn_36_0 = var5;
          return (ii) (stackIn_36_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("hia.A(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, eaa param1, op param2) {
        int var17 = 0;
        int stackIn_6_0 = 0;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_121_0 = 0;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_135_2 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_138_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        aga var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wia var12_ref_wia = null;
        int var13 = 0;
        aga var13_ref_aga = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        iv var17_ref_iv = null;
        int var18 = 0;
        int var19 = 0;
        wia var20 = null;
        aga var21 = null;
        sl var22_ref_sl = null;
        ro var22_ref_ro = null;
        bm var22_ref_bm = null;
        int var22 = 0;
        o var23_ref_o = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        iv var26 = null;
        int var27 = 0;
        Object var28 = null;
        t var28_ref = null;
        t var29 = null;
        int[][] var33 = null;
        var28 = null;
        var27 = BachelorFridge.field_y;
        try {
          var28_ref = (t) (al.a(-103, this.field_g));
          var29 = var28_ref;
          var5 = this.field_h.a(67, param2);
          var33 = haa.b(1, var5.d(125, this.field_g), this.field_j);
          var7 = var5.field_x;
          if (param0 <= 26) {
            this.field_j = -84;
          }
          var8 = var5.field_J;
          var9 = var29.field_q;
          stackIn_6_0 = (var9 > 0) ? 0 : 1;
          var10 = stackIn_6_0;
          if (var10 == 0) {
            var9 = (int)(var5.a(var29, -5313) * (double)var9);
          }
          var11 = 0;
          if (this.field_k != 31) {
            if (2 != this.field_j) {
              if (this.field_j != 4) {
                if (this.field_j == 1) {
                  var8 = var8 - this.field_k;
                } else {
                  if (this.field_j == 3) {
                    var8 = var8 + this.field_k;
                  }
                }
              } else {
                var7 = var7 + this.field_k;
              }
            } else {
              var7 = var7 - this.field_k;
            }
            var12 = 17;
            var13 = 17;
            var14 = -1 + var12 >> 1;
            var15 = -1 + var13 >> 1;
            for (var16 = 0; var12 > var16; var16++) {
              for (var17 = 0; var13 > var17; var17++) {
                if (var33[var16][var17] == 1) {
                  if (71 == var29.field_j ||
                    var29.field_j == 72 ||
                    var29.field_j == 73 ||
                    var29.field_j == 12 ||
                    13 == var29.field_j ||
                    var29.field_j == 14) {
                    param2.field_T.field_B[var5.field_D] = param2.field_T.field_B[var5.field_D] + 1;
                  }
                  if (9 == var29.field_j ||
                    var29.field_j == 10 ||
                    11 == var29.field_j ||
                    var29.field_j == 54 ||
                    55 == var29.field_j ||
                    var29.field_j == 56) {
                    param2.field_T.field_k[var5.field_D] = param2.field_T.field_k[var5.field_D] + 1;
                  }
                  var18 = -var14 + (var16 + var7);
                  var19 = var8 + var17 - var15;
                  if (var18 >= 0 &&
                    var18 < param2.field_z &&
                    var19 >= 0 &&
                    param2.field_B > var19) {
                    var20 = param2.field_a[var18][var19];
                    var21 = var20.field_l;
                    if (var20.b((byte) -113)) {
                      var22_ref_sl = new sl(var9, var18, var19);
                      param1.a(var22_ref_sl, true);
                      if (var20.field_n == 34) {
                        var23_ref_o = new o(50);
                        param1.a(var23_ref_o, true);
                      }
                    }
                    if (var20.field_d) {
                      var22_ref_ro = new ro(var18, var19);
                      param1.a(var22_ref_ro, true);
                    }
                    if (var29.field_j == 80) {
                      var22_ref_bm = new bm(15, var18, var19);
                      if (param2.field_a[var18][var19].field_l == null) {
                        param1.a(var22_ref_bm, true);
                      }
                    } else {
                      if (var29.field_j == 81) {
                        var22_ref_bm = new bm(14, var18, var19);
                        if (null == param2.field_a[var18][var19].field_l) {
                          param1.a(var22_ref_bm, true);
                        }
                      }
                    }
                    if (var21 != null) {
                      if (var5.field_y == 42) {
                        var5.field_G = true;
                      }
                      var22 = 0;
                      var23 = var9;
                      var24 = 1;
                      if (var29.field_p != 4) {
                        if (var20.field_n == 18) {
                          var23 = 0;
                        }
                        if (var21.field_y == 32 &&
                          !var29.c(27863)) {
                          var23 = 0;
                        }
                        var24 = ga.field_b[var29.field_c][var21.field_o.field_k.field_b];
                        if (var20.field_d) {
                          var23 = var23 >> 1;
                        }
                      }
                      if (var5.field_E != var21.field_D ||
                        var5.field_y != 37) {
                        if (var5.field_y == 53) {
                          var11++;
                        }
                        if (var5.field_y != 53) {
                          stackIn_121_0 = var29.field_u;
                        } else {
                          stackIn_121_0 = 53;
                        }
                        var25 = stackIn_121_0;
                        if (var21.field_y == 32 &&
                          !var29.c(27863)) {
                          var25 = 0;
                        }
                        var26 = new iv(new nq(var21), var22 != 0, var24, var23, var25);
                        param1.a(var26, true);
                      }
                    }
                  }
                }
              }
            }
          } else {
            var12_ref_wia = param2.field_a[var7][var8];
            var13_ref_aga = var12_ref_wia.field_l;
            if (var13_ref_aga == null) {
              return;
            }
            var14 = 0;
            var15 = var9;
            var16 = 1;
            if (var29.field_p != 4) {
              if (var12_ref_wia.field_n == 18) {
                var15 = 0;
              }
              var16 = ga.field_b[var28_ref.field_c][var13_ref_aga.field_o.field_k.field_b];
              if (var16 == 2) {
                var15 = var15 << 1;
              } else {
                if (var16 == 0) {
                  var15 = var15 >> 1;
                }
              }
            }
            if (var15 > 0) {
              param2.field_T.field_f[var5.field_D] = param2.field_T.field_f[var5.field_D] + var15;
              param2.field_T.field_b[var13_ref_aga.field_D] = param2.field_T.field_b[var13_ref_aga.field_D] + var15;
              param2.field_T.field_n[var5.field_D] = param2.field_T.field_n[var5.field_D] + var15;
              param2.field_T.field_g[var13_ref_aga.field_D] = param2.field_T.field_g[var13_ref_aga.field_D] + 1;
              param2.field_T.field_y[var5.field_D] = param2.field_T.field_y[var5.field_D] + 1;
            } else {
              stackIn_25_0 = param2.field_T.field_F;
              stackIn_25_1 = var5.field_D;
              stackIn_25_2 = param2.field_T.field_F[var5.field_D];
              if (var15 <= var13_ref_aga.field_t - var13_ref_aga.field_I) {
                stackIn_26_3 = var15;
              } else {
                stackIn_26_3 = -var13_ref_aga.field_I + var13_ref_aga.field_t;
              }
              stackIn_25_0[stackIn_25_1] = stackIn_25_2 - stackIn_26_3;
              if (var13_ref_aga.field_D != var5.field_D) {
                param2.field_T.field_j[var13_ref_aga.field_D] = true;
              }
            }
            if (-var15 + var13_ref_aga.field_I <= 0) {
              param2.field_T.field_w[var5.field_D] = param2.field_T.field_w[var5.field_D] + 1;
              if (20 == var5.field_o.field_b &&
                var13_ref_aga.field_o.field_b == 3) {
                param2.field_T.field_x[var5.field_D] = true;
              }
            }
            if (53 == var5.field_y) {
              var11++;
            }
            var17_ref_iv = new iv(new nq(var13_ref_aga), var14 != 0, var16, var15, var29.field_u);
            param1.a(var17_ref_iv, true);
          }
          if (var11 >= 3) {
            param2.field_T.field_d[var5.field_D] = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_134_0 = var4;
          stackIn_134_1 = new StringBuilder().append("hia.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_135_2 = "null";
          } else {
            stackIn_135_2 = "{...}";
          }
          stackIn_137_1 = ((StringBuilder) (Object) stackIn_134_1).append(stackIn_135_2).append(',');
          if (param2 == null) {
            stackIn_138_2 = "null";
          } else {
            stackIn_138_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_134_0), ((StringBuilder) (Object) stackIn_137_1).append(stackIn_138_2).append(')').toString());
        }
    }

    final void a(int param0, lu param1) {
        try {
          int var3_int = 84 / ((61 - param0) / 53);
          param1.d(this.field_j | this.field_k << 3, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hia.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(byte param0) {
        int var2;
        byte[] var3;
        var2 = BachelorFridge.field_y;
        if (((dfa) ((Object) dj.field_c)).field_a) {
          if ((dj.field_c.field_h.field_f & 1 << dj.field_c.field_n) == 0) {
            if (0 != dj.field_c.field_h.field_f) {
              lr.field_k[12] = wha.field_g;
            } else {
              if ((1 << dj.field_c.field_h.field_d) - 1 == (1 << dj.field_c.field_n | dj.field_c.field_V)) {
                lr.field_k[12] = ama.field_m;
              } else {
                lr.field_k[12] = rna.field_b;
              }
            }
          } else {
            lr.field_k[12] = as.field_b;
          }
        } else {
          if (0 == (1 << dj.field_c.field_n & dj.field_c.field_h.field_f)) {
            if (dj.field_c.field_h.field_f != 0) {
              lr.field_k[12] = iia.field_o;
            } else {
              if ((1 << dj.field_c.field_h.field_d) - 1 == (1 << dj.field_c.field_n | dj.field_c.field_V)) {
                lr.field_k[12] = dda.field_k;
              } else {
                lr.field_k[12] = mw.field_g;
              }
            }
          } else {
            lr.field_k[12] = dk.field_q;
          }
        }
        if (param0 > -99) {
          var3 = (byte[]) null;
          hia.a(101, (byte[]) null);
        }
    }

    static {
        field_i = "<%0> cannot join; the game has started.";
    }
}
