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
        ql var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ql stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ql stackOut_3_0 = null;
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
            if (param1 != null) {
              var2 = new ql(param1, la.field_j, wb.field_g, nk.field_K, ad.field_d, field_E, lk.field_e);
              var3 = 26 / ((param0 - 56) / 51);
              tk.a(false);
              stackOut_3_0 = (ql) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("dd.J(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              gb.field_x[0] = ha.field_n.nextInt();
              gb.field_x[1] = ha.field_n.nextInt();
              vl.field_a.field_l = 0;
              gb.field_x[2] = (int)(qj.field_H >> 32);
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
                da.field_p.f(111, 18);
                break L1;
              } else {
                da.field_p.f(111, 16);
                break L1;
              }
            }
            L2: {
              da.field_p.field_l = da.field_p.field_l + 2;
              var5_int = da.field_p.field_l;
              da.field_p.a((byte) -58, oi.field_b);
              da.field_p.a((byte) -84, ih.field_i);
              var6 = 0;
              if (hc.field_b) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!mi.field_f) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (param2) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != ok.field_f) {
                var6 = var6 | 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              da.field_p.f(111, var6);
              var7 = ph.a((byte) -48, en.a(113));
              if (var7 != null) {
                break L6;
              } else {
                var7 = "";
                break L6;
              }
            }
            L7: {
              da.field_p.c(-74, var7);
              if (ok.field_f != null) {
                da.field_p.a(29336, ok.field_f);
                break L7;
              } else {
                break L7;
              }
            }
            dg.a(false, ff.field_a, vl.field_a, (th) (Object) da.field_p, ho.field_k);
            da.field_p.g(-29190, da.field_p.field_l - var5_int);
            qn.a(-1, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("dd.U(").append(0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param4 + ')');
        }
    }

    final qm a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((dd) this).field_P;
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            var5_int = param3 + (param1 * tc.field_j + -1);
            var6 = 0;
            var7 = param2.field_y;
            L1: while (true) {
              if (var7 <= 0) {
                break L0;
              } else {
                var8 = param2.field_s;
                L2: while (true) {
                  if (var8 <= 0) {
                    var5_int = var5_int + (tc.field_j - param2.field_s);
                    var7--;
                    continue L1;
                  } else {
                    L3: {
                      if (param2.field_z[var6] != 0) {
                        if (param2.field_z[var6] == 16777215) {
                          var5_int++;
                          tc.field_b[var5_int] = param4;
                          break L3;
                        } else {
                          var5_int++;
                          tc.field_b[var5_int] = param2.field_z[var6];
                          break L3;
                        }
                      } else {
                        var5_int++;
                        break L3;
                      }
                    }
                    var6++;
                    var8--;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("dd.M(").append(7090).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
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
        RuntimeException var2 = null;
        int var3 = 0;
        fo var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4 = (fo) (Object) ji.field_a.b((byte) 91);
              if (param1 >= 8) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                v.a(3, param0, var4);
                var4 = (fo) (Object) ji.field_a.c((byte) -120);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "dd.CA(" + param0 + ',' + param1 + ')');
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
        return (int)((float)((dd) this).field_I + this.e(param0, 124) * (float)(-((dd) this).field_I + ((dd) this).field_C));
    }

    public static void c(byte param0) {
        field_H = null;
        field_E = null;
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
        RuntimeException var5 = null;
        float var5_float = 0.0f;
        Object var6 = null;
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
        qm stackIn_19_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_29_0 = null;
        qm stackOut_18_0 = null;
        qm stackOut_17_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var15 = HoldTheLine.field_D;
        try {
          L0: {
            var5_float = 0.0f;
            var6 = null;
            var7 = 0;
            L1: while (true) {
              if (param2.field_e <= var7) {
                stackOut_29_0 = var6;
                stackIn_30_0 = stackOut_29_0;
                break L0;
              } else {
                var8 = (ei) param2.field_b[var7];
                var9 = 0;
                L2: while (true) {
                  if (var9 >= var8.field_e) {
                    var7++;
                    continue L1;
                  } else {
                    L3: {
                      var10 = (lb) var8.field_b[var9];
                      if (-var10.field_k + param3 < -1) {
                        break L3;
                      } else {
                        if (param3 + -var10.field_k > 1) {
                          break L3;
                        } else {
                          L4: {
                            var11 = (-var10.field_r.field_f + param4.field_f) * (-var10.field_r.field_f + var10.field_s.field_f) + (param4.field_h + -var10.field_r.field_h) * (var10.field_s.field_h + -var10.field_r.field_h);
                            if (0 > var11) {
                              break L4;
                            } else {
                              if (var10.i(-120) >= var11) {
                                L5: {
                                  var17 = var10.g(-1).a((byte) 64);
                                  var12 = Math.abs(var17.a(new in(var10.field_r, param4), (byte) -10));
                                  var13 = var12 * var12;
                                  if (var6 == null) {
                                    break L5;
                                  } else {
                                    if (var5_float > var13) {
                                      break L5;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                var5_float = var13;
                                var6 = (Object) (Object) var10.a(false, (float)var11 / (float)var10.i(-125));
                                if (param1 == null) {
                                  break L3;
                                } else {
                                  param1.field_g = var17.field_g;
                                  param1.field_j = var17.field_j;
                                  break L3;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          L6: {
                            if (var11 >= 0) {
                              var13 = (float)((param4.field_h - var10.field_s.field_h) * (param4.field_h + -var10.field_s.field_h) - -((param4.field_f + -var10.field_s.field_f) * (-var10.field_s.field_f + param4.field_f)));
                              break L6;
                            } else {
                              var13 = (float)((param4.field_h + -var10.field_r.field_h) * (-var10.field_r.field_h + param4.field_h) - -((-var10.field_r.field_f + param4.field_f) * (-var10.field_r.field_f + param4.field_f)));
                              break L6;
                            }
                          }
                          L7: {
                            if (var6 == null) {
                              break L7;
                            } else {
                              if (var13 < var5_float) {
                                break L7;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L8: {
                            var5_float = var13;
                            if (var11 < 0) {
                              stackOut_18_0 = var10.field_r;
                              stackIn_19_0 = stackOut_18_0;
                              break L8;
                            } else {
                              stackOut_17_0 = var10.field_s;
                              stackIn_19_0 = stackOut_17_0;
                              break L8;
                            }
                          }
                          var6 = (Object) (Object) stackIn_19_0;
                          var16 = var10.g(-1).a((byte) -111);
                          if (param1 != null) {
                            param1.field_j = var16.field_j;
                            param1.field_g = var16.field_g;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("dd.JA(").append(0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          L10: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          L11: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param3).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param4 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L11;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
        return (qm) (Object) stackIn_30_0;
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
        RuntimeException var23 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              ((dd) this).field_o = 0.0f;
              ((dd) this).field_R = param0;
              ((dd) this).field_L = param9;
              ((dd) this).field_z = param8;
              ((dd) this).field_N = param5;
              ((dd) this).field_Q = param11;
              ((dd) this).field_A = param10;
              ((dd) this).field_C = param6;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param18) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((dd) this).field_q = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param16) {
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
              ((dd) this).field_x = stackIn_7_1 != 0;
              ((dd) this).field_y = param21;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param14) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((dd) this).field_s = stackIn_10_1 != 0;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (!param17) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              ((dd) this).field_t = stackIn_13_1 != 0;
              ((dd) this).field_G = param20;
              ((dd) this).field_K = param7;
              ((dd) this).field_P = param1;
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (!param13) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L5;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L5;
              }
            }
            L6: {
              ((dd) this).field_w = stackIn_16_1 != 0;
              ((dd) this).field_I = param4;
              ((dd) this).field_O = param3;
              ((dd) this).field_M = param12;
              ((dd) this).field_k = param2;
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param15) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L6;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L6;
              }
            }
            ((dd) this).field_m = stackIn_19_1 != 0;
            ((dd) this).field_J = (float)Math.sqrt((double)((((dd) this).field_P.field_f - ((dd) this).field_R.field_f) * (-((dd) this).field_R.field_f + ((dd) this).field_P.field_f) + (-((dd) this).field_R.field_h + ((dd) this).field_P.field_h) * (((dd) this).field_P.field_h - ((dd) this).field_R.field_h)));
            ((dd) this).b(51, param19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var23 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var23;
            stackOut_21_1 = new StringBuilder().append("dd.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ',' + param21 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Highscores";
    }
}
