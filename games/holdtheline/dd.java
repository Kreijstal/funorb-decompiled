/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends wd {
    qm field_P;
    float field_G;
    static String field_H;
    int field_I;
    int field_A;
    int field_z;
    float field_y;
    float field_D;
    int field_K;
    int field_L;
    static int[] field_E;
    int field_N;
    int field_M;
    int field_C;
    int field_O;
    float field_J;
    float field_B;
    qm field_R;
    int field_Q;

    final qm l(int param0) {
        if (param0 != 8421504) {
            ((dd) this).field_C = 36;
        }
        if (3.141592653589793 == (double)((dd) this).field_y) {
            return new qm((int)((float)((dd) this).field_P.field_h + (float)((dd) this).field_L * ((dd) this).field_D), (int)((float)((dd) this).field_P.field_f + (float)((dd) this).field_L * ((dd) this).field_B));
        }
        return ((dd) this).c(1.0f, 94);
    }

    final qm a(int param0, float param1) {
        float var3 = (float)((dd) this).c(36, param1);
        if (param0 != -851) {
            qm discarded$0 = ((dd) this).a(0.5826309323310852f, true);
        }
        float var4 = var3 * ((dd) this).field_D + (param1 * (float)(((dd) this).field_P.field_h - ((dd) this).field_R.field_h) + (float)((dd) this).field_R.field_h);
        float var5 = var3 * ((dd) this).field_B + ((float)((dd) this).field_R.field_f + (float)(((dd) this).field_P.field_f - ((dd) this).field_R.field_f) * param1);
        return new qm((int)var4, (int)var5);
    }

    final qm p(int param0) {
        float var2 = -((float)((dd) this).field_Q * ((dd) this).field_D) + (float)((dd) this).field_R.field_h;
        if (param0 != -1) {
            qm discarded$0 = ((dd) this).a((byte) -67);
        }
        float var3 = (float)((dd) this).field_R.field_f - (float)((dd) this).field_Q * ((dd) this).field_B;
        return new qm((int)var2, (int)var3);
    }

    final qm a(boolean param0, float param1) {
        float var3 = (float)((dd) this).field_R.field_h + (float)(-((dd) this).field_R.field_h + ((dd) this).field_P.field_h) * param1;
        float var4 = (float)((dd) this).field_R.field_f + (float)(((dd) this).field_P.field_f - ((dd) this).field_R.field_f) * param1;
        if (param0) {
            qm discarded$0 = ((dd) this).a(-19, -1.8915660381317139f);
        }
        return new qm((int)var3, (int)var4);
    }

    final qm a(byte param0) {
        if (!(3.141592653589793 != (double)((dd) this).field_y)) {
            return new qm((int)((float)((dd) this).field_P.field_h + (float)((dd) this).field_C * ((dd) this).field_D), (int)((float)((dd) this).field_P.field_f + ((dd) this).field_B * (float)((dd) this).field_C));
        }
        if (param0 != 29) {
            qm discarded$0 = ((dd) this).o(-11);
        }
        return ((dd) this).a(1.0f, false);
    }

    final qm a(float param0, int param1) {
        float var3 = (float)this.b((byte) -125, param0);
        if (param1 != 255) {
            ((dd) this).field_J = 0.6247459650039673f;
        }
        float var4 = (float)(-((dd) this).field_R.field_h + ((dd) this).field_P.field_h) * param0 + (float)((dd) this).field_R.field_h + ((dd) this).field_D * var3;
        float var5 = ((dd) this).field_B * var3 + (param0 * (float)(((dd) this).field_P.field_f - ((dd) this).field_R.field_f) + (float)((dd) this).field_R.field_f);
        return new qm((int)var4, (int)var5);
    }

    final void b(int param0, float param1) {
        if (param0 <= 12) {
            return;
        }
        ((dd) this).field_D = (float)Math.cos((double)param1);
        ((dd) this).field_B = -(float)Math.sin((double)param1);
    }

    private final int b(byte param0, float param1) {
        if (param0 > -120) {
            Object var4 = null;
            ql discarded$0 = dd.a((byte) -17, (byte[]) null);
        }
        return (int)((float)((dd) this).field_O + this.e(param1, 6) * (float)(-((dd) this).field_O + ((dd) this).field_N));
    }

    private final float e(float param0, int param1) {
        int var3 = -12 / ((86 - param1) / 38);
        return (1.0f - (float)Math.cos((double)((-((dd) this).field_G + ((dd) this).field_y) * param0 + ((dd) this).field_G))) / 2.0f;
    }

    final int c(int param0, float param1) {
        if (param0 < 33) {
            dd.a(55, (byte) -61);
        }
        return (int)((float)((dd) this).field_z + this.e(param1, 124) * (float)(((dd) this).field_A + -((dd) this).field_z));
    }

    final static ql a(byte param0, byte[] param1) {
        if (param1 == null) {
            return null;
        }
        ql var2 = new ql(param1, la.field_j, wb.field_g, nk.field_K, ad.field_d, field_E, lk.field_e);
        int var3 = 26 / ((param0 - 56) / 51);
        tk.a(false);
        return var2;
    }

    final qm c(float param0, int param1) {
        float var3 = (float)((dd) this).d(param0, 0);
        float var4 = var3 * ((dd) this).field_D + ((float)((dd) this).field_R.field_h + (float)(-((dd) this).field_R.field_h + ((dd) this).field_P.field_h) * param0);
        if (param1 < 90) {
            ((dd) this).field_Q = 69;
        }
        float var5 = ((dd) this).field_B * var3 + (param0 * (float)(-((dd) this).field_R.field_f + ((dd) this).field_P.field_f) + (float)((dd) this).field_R.field_f);
        return new qm((int)var4, (int)var5);
    }

    final qm m(int param0) {
        if ((double)((dd) this).field_y == 3.141592653589793) {
            return new qm((int)((float)((dd) this).field_A * ((dd) this).field_D + (float)((dd) this).field_P.field_h), (int)((float)((dd) this).field_P.field_f + ((dd) this).field_B * (float)((dd) this).field_A));
        }
        if (param0 != -14) {
            dd.a(-103, -92, 89, -67, (byte) -96);
        }
        return ((dd) this).a(-851, 1.0f);
    }

    final qm h(int param0) {
        if (!(3.141592653589793 != (double)((dd) this).field_y)) {
            return new qm((int)((float)((dd) this).field_P.field_h + ((dd) this).field_D * (float)((dd) this).field_N), (int)(((dd) this).field_B * (float)((dd) this).field_N + (float)((dd) this).field_P.field_f));
        }
        if (param0 != 7560980) {
            ((dd) this).field_A = 66;
        }
        return ((dd) this).a(1.0f, 255);
    }

    final static void a(int param0, int param1, boolean param2, sd param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          gb.field_x[0] = ha.field_n.nextInt();
          gb.field_x[1] = ha.field_n.nextInt();
          vl.field_a.field_l = 0;
          gb.field_x[2] = (int)(qj.field_H >> -1344116576);
          gb.field_x[3] = (int)qj.field_H;
          vl.field_a.a((byte) -58, gb.field_x[0]);
          vl.field_a.a((byte) -58, gb.field_x[1]);
          vl.field_a.a((byte) -58, gb.field_x[2]);
          vl.field_a.a((byte) -58, gb.field_x[3]);
          q.a(125, vl.field_a);
          vl.field_a.b(-652561784, param1);
          param3.a(0, vl.field_a);
          da.field_p.field_l = 0;
          if (param4) {
            da.field_p.f(param0 ^ 111, 18);
            break L0;
          } else {
            da.field_p.f(111, 16);
            break L0;
          }
        }
        L1: {
          da.field_p.field_l = da.field_p.field_l + 2;
          var5 = da.field_p.field_l;
          da.field_p.a((byte) -58, oi.field_b);
          da.field_p.a((byte) -84, ih.field_i);
          var6 = param0;
          if (hc.field_b) {
            var6 = var6 | 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!mi.field_f) {
            break L2;
          } else {
            var6 = var6 | 4;
            break L2;
          }
        }
        L3: {
          if (param2) {
            var6 = var6 | 8;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (null != ok.field_f) {
            var6 = var6 | 16;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          da.field_p.f(111, var6);
          var7 = ph.a((byte) -48, en.a(113));
          if (var7 != null) {
            break L5;
          } else {
            var7 = "";
            break L5;
          }
        }
        L6: {
          da.field_p.c(-74, var7);
          if (ok.field_f != null) {
            da.field_p.a(29336, ok.field_f);
            break L6;
          } else {
            break L6;
          }
        }
        dg.a(false, ff.field_a, vl.field_a, (th) (Object) da.field_p, ho.field_k);
        da.field_p.g(-29190, da.field_p.field_l - var5);
        qn.a(-1, 0);
    }

    final qm a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((dd) this).field_P;
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        var5 = param3 + (param1 * tc.field_j + -1);
        var6 = 0;
        if (param0 == 7090) {
          var7 = param2.field_y;
          L0: while (true) {
            if (-1 <= (var7 ^ -1)) {
              return;
            } else {
              var8 = param2.field_s;
              L1: while (true) {
                if (var8 >= -1) {
                  var5 = var5 + (tc.field_j - param2.field_s);
                  var7--;
                  continue L0;
                } else {
                  if (-1 != param2.field_z[var6]) {
                    if (-16777216 == (param2.field_z[var6] ^ -1)) {
                      var5++;
                      tc.field_b[var5] = param4;
                      var6++;
                      var8--;
                      continue L1;
                    } else {
                      var5++;
                      tc.field_b[var5] = param2.field_z[var6];
                      var6++;
                      var8--;
                      continue L1;
                    }
                  } else {
                    var5++;
                    var6++;
                    var8--;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        hn.field_M = param3;
        if (param4 > -55) {
            Object var6 = null;
            ql discarded$0 = dd.a((byte) -63, (byte[]) null);
        }
        gh.field_i = param0;
        wg.field_b = param1;
        w.field_b = param2;
    }

    final qm c(boolean param0) {
        if (!param0) {
            in discarded$0 = ((dd) this).g(34);
        }
        if (0.0f == ((dd) this).field_G) {
            return new qm((int)(((dd) this).field_D * (float)((dd) this).field_O + (float)((dd) this).field_R.field_h), (int)((float)((dd) this).field_R.field_f + (float)((dd) this).field_O * ((dd) this).field_B));
        }
        return ((dd) this).a(0.0f, 255);
    }

    final static void a(int param0, byte param1) {
        int var3 = HoldTheLine.field_D;
        fo var2 = (fo) (Object) ji.field_a.b((byte) 91);
        if (param1 < 8) {
            field_H = null;
        }
        while (var2 != null) {
            v.a(3, param0, var2);
            var2 = (fo) (Object) ji.field_a.c((byte) -120);
        }
    }

    final qm n(int param0) {
        if (((dd) this).field_G == 0.0f) {
            return new qm((int)((float)((dd) this).field_z * ((dd) this).field_D + (float)((dd) this).field_R.field_h), (int)((float)((dd) this).field_z * ((dd) this).field_B + (float)((dd) this).field_R.field_f));
        }
        if (param0 != 3337) {
            ((dd) this).field_K = -37;
        }
        return ((dd) this).a(-851, 0.0f);
    }

    final qm k(int param0) {
        if (param0 != 255) {
            return null;
        }
        if (!(0.0f != ((dd) this).field_G)) {
            return new qm((int)((float)((dd) this).field_R.field_h + ((dd) this).field_D * (float)((dd) this).field_K), (int)((float)((dd) this).field_R.field_f + (float)((dd) this).field_K * ((dd) this).field_B));
        }
        return ((dd) this).c(0.0f, 112);
    }

    final qm b(byte param0) {
        float var2 = (float)((dd) this).field_P.field_h - (float)((dd) this).field_M * ((dd) this).field_D;
        float var3 = (float)((dd) this).field_P.field_f - ((dd) this).field_B * (float)((dd) this).field_M;
        if (param0 >= -65) {
            ((dd) this).field_Q = -102;
        }
        return new qm((int)var2, (int)var3);
    }

    final qm a(float param0, boolean param1) {
        float var3 = (float)this.b(param0, true);
        float var4 = (float)((dd) this).field_R.field_h + param0 * (float)(((dd) this).field_P.field_h + -((dd) this).field_R.field_h) + ((dd) this).field_D * var3;
        if (param1) {
            field_H = null;
        }
        float var5 = (float)((dd) this).field_R.field_f + (float)(-((dd) this).field_R.field_f + ((dd) this).field_P.field_f) * param0 + ((dd) this).field_B * var3;
        return new qm((int)var4, (int)var5);
    }

    final in a(boolean param0) {
        if (param0) {
            int discarded$0 = ((dd) this).c(93, -0.584915816783905f);
        }
        return ((dd) this).g(-1);
    }

    private final int b(float param0, boolean param1) {
        if (!param1) {
            ((dd) this).field_G = -0.8879954218864441f;
        }
        return (int)((float)((dd) this).field_I + this.e(param0, 124) * (float)(-((dd) this).field_I + ((dd) this).field_C));
    }

    public static void c(byte param0) {
        field_H = null;
        field_E = null;
        if (param0 > -14) {
            dd.a(-28, -9, -41, 91, (byte) 43);
        }
    }

    final qm o(int param0) {
        if (param0 != -14) {
            return null;
        }
        if (0.0f == ((dd) this).field_G) {
            return new qm((int)((float)((dd) this).field_R.field_h + ((dd) this).field_D * (float)((dd) this).field_I), (int)(((dd) this).field_B * (float)((dd) this).field_I + (float)((dd) this).field_R.field_f));
        }
        return ((dd) this).a(0.0f, false);
    }

    final in a(byte param0, float param1) {
        if (param0 <= 117) {
            return null;
        }
        return ((dd) this).g(-1);
    }

    final int d(float param0, int param1) {
        if (param1 != 0) {
            return -16;
        }
        return (int)((float)((dd) this).field_K + this.e(param0, param1 + 35) * (float)(((dd) this).field_L + -((dd) this).field_K));
    }

    final static qm a(int param0, in param1, ei param2, int param3, qm param4) {
        float var5 = 0.0f;
        qm var6 = null;
        int var7 = 0;
        ei var8 = null;
        int var9 = 0;
        lb var10 = null;
        int var11 = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var15 = 0;
        in var16 = null;
        in var17 = null;
        qm stackIn_20_0 = null;
        qm stackOut_19_0 = null;
        qm stackOut_18_0 = null;
        var15 = HoldTheLine.field_D;
        var5 = 0.0f;
        var6 = null;
        var7 = param0;
        L0: while (true) {
          if (param2.field_e <= var7) {
            return var6;
          } else {
            var8 = (ei) param2.field_b[var7];
            var9 = 0;
            L1: while (true) {
              if (var9 >= var8.field_e) {
                var7++;
                continue L0;
              } else {
                var10 = (lb) var8.field_b[var9];
                if (-var10.field_k + param3 >= -1) {
                  if (-2 <= (param3 + -var10.field_k ^ -1)) {
                    L2: {
                      var11 = (-var10.field_r.field_f + param4.field_f) * (-var10.field_r.field_f + var10.field_s.field_f) + (param4.field_h + -var10.field_r.field_h) * (var10.field_s.field_h + -var10.field_r.field_h);
                      if (0 > var11) {
                        break L2;
                      } else {
                        if (var10.i(-120) >= var11) {
                          L3: {
                            var17 = var10.g(-1).a((byte) 64);
                            var12 = Math.abs(var17.a(new in(var10.field_r, param4), (byte) -10));
                            var13 = var12 * var12;
                            if (var6 == null) {
                              break L3;
                            } else {
                              if (var5 > var13) {
                                break L3;
                              } else {
                                var9++;
                                continue L1;
                              }
                            }
                          }
                          var5 = var13;
                          var6 = var10.a(false, (float)var11 / (float)var10.i(-125));
                          if (param1 != null) {
                            param1.field_g = var17.field_g;
                            param1.field_j = var17.field_j;
                            var9++;
                            continue L1;
                          } else {
                            var9++;
                            continue L1;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var11 >= 0) {
                        var13 = (float)((param4.field_h - var10.field_s.field_h) * (param4.field_h + -var10.field_s.field_h) - -((param4.field_f + -var10.field_s.field_f) * (-var10.field_s.field_f + param4.field_f)));
                        break L4;
                      } else {
                        var13 = (float)((param4.field_h + -var10.field_r.field_h) * (-var10.field_r.field_h + param4.field_h) - -((-var10.field_r.field_f + param4.field_f) * (-var10.field_r.field_f + param4.field_f)));
                        break L4;
                      }
                    }
                    L5: {
                      if (var6 == null) {
                        break L5;
                      } else {
                        if (var13 < var5) {
                          break L5;
                        } else {
                          var9++;
                          continue L1;
                        }
                      }
                    }
                    L6: {
                      var5 = var13;
                      if (-1 < (var11 ^ -1)) {
                        stackOut_19_0 = var10.field_r;
                        stackIn_20_0 = stackOut_19_0;
                        break L6;
                      } else {
                        stackOut_18_0 = var10.field_s;
                        stackIn_20_0 = stackOut_18_0;
                        break L6;
                      }
                    }
                    var6 = stackIn_20_0;
                    var16 = var10.g(-1).a((byte) -111);
                    if (param1 != null) {
                      param1.field_j = var16.field_j;
                      param1.field_g = var16.field_g;
                      var9++;
                      continue L1;
                    } else {
                      var9++;
                      continue L1;
                    }
                  } else {
                    var9++;
                    continue L1;
                  }
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final qm b(float param0, int param1) {
        if (param1 != 7560980) {
            ((dd) this).field_A = -56;
        }
        float var3 = (float)(((dd) this).field_M + -((dd) this).field_Q) * param0 + (float)((dd) this).field_Q;
        float var4 = (float)(-((dd) this).field_R.field_h + ((dd) this).field_P.field_h) * param0 + (float)((dd) this).field_R.field_h - var3 * ((dd) this).field_D;
        float var5 = (float)((dd) this).field_R.field_f + param0 * (float)(((dd) this).field_P.field_f + -((dd) this).field_R.field_f) - ((dd) this).field_B * var3;
        return new qm((int)var4, (int)var5);
    }

    final float f(int param0) {
        if (param0 != 50) {
            return 1.8018358945846558f;
        }
        return ((dd) this).field_J;
    }

    final in g(int param0) {
        if (param0 != -1) {
            ((dd) this).field_M = 97;
        }
        return new in(((dd) this).field_B, -((dd) this).field_D);
    }

    dd(qm param0, qm param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, boolean param14, boolean param15, boolean param16, boolean param17, boolean param18, float param19, float param20, float param21) {
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
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
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
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          ((dd) this).field_o = 0.0f;
          ((dd) this).field_R = param0;
          ((dd) this).field_L = param9;
          ((dd) this).field_z = param8;
          ((dd) this).field_N = param5;
          ((dd) this).field_Q = param11;
          ((dd) this).field_A = param10;
          ((dd) this).field_C = param6;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param18) {
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
          ((dd) this).field_q = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param16) {
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
          ((dd) this).field_x = stackIn_6_1 != 0;
          ((dd) this).field_y = param21;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param14) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((dd) this).field_s = stackIn_9_1 != 0;
          stackOut_9_0 = this;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (!param17) {
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
          ((dd) this).field_t = stackIn_12_1 != 0;
          ((dd) this).field_G = param20;
          ((dd) this).field_K = param7;
          ((dd) this).field_P = param1;
          stackOut_12_0 = this;
          stackIn_14_0 = stackOut_12_0;
          stackIn_13_0 = stackOut_12_0;
          if (!param13) {
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
        L5: {
          ((dd) this).field_w = stackIn_15_1 != 0;
          ((dd) this).field_I = param4;
          ((dd) this).field_O = param3;
          ((dd) this).field_M = param12;
          ((dd) this).field_k = param2;
          stackOut_15_0 = this;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if (!param15) {
            stackOut_17_0 = this;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L5;
          } else {
            stackOut_16_0 = this;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L5;
          }
        }
        ((dd) this).field_m = stackIn_18_1 != 0;
        ((dd) this).field_J = (float)Math.sqrt((double)((((dd) this).field_P.field_f - ((dd) this).field_R.field_f) * (-((dd) this).field_R.field_f + ((dd) this).field_P.field_f) + (-((dd) this).field_R.field_h + ((dd) this).field_P.field_h) * (((dd) this).field_P.field_h - ((dd) this).field_R.field_h)));
        ((dd) this).b(51, param19);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Highscores";
    }
}
