/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uw {
    static String field_a;
    static int field_e;
    private ev field_d;
    private iq field_f;
    static String field_b;
    static wv[] field_g;
    private vf[] field_c;

    final iq c(int param0) {
        if (param0 != 0) {
            ((uw) this).a(101);
        }
        return ((uw) this).field_f;
    }

    final void d(int param0) {
        int var3 = 0;
        vf var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        ((uw) this).field_f.a((byte) 119);
        vf[] var6 = ((uw) this).field_c;
        vf[] var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.a(1);
        }
    }

    final void a(int param0, iq param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((uw) this).field_f = param1;
              if (param0 == -24343) {
                break L1;
              } else {
                ((uw) this).field_f = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("uw.G(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static boolean a(int param0, int param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var3 = 30;
          if ((param1 & 2048) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            if (stackIn_3_0 != 0 | fua.a(110, param1, param0)) {
              break L2;
            } else {
              int discarded$3 = 36864;
              if (!no.a(param0, param1)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final ev a(byte param0) {
        if (param0 != 59) {
            return null;
        }
        return ((uw) this).field_d;
    }

    final void a(int param0, fo param1, byte param2) {
        if (param2 != -33) {
            return;
        }
        try {
            ((uw) this).field_c[param0].a((byte) 64, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uw.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(int param0, ev param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((uw) this).field_d = param1;
              if (param0 == -28265) {
                break L1;
              } else {
                ((uw) this).field_c = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("uw.J(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
            field_g = null;
        }
        field_g = null;
        field_b = null;
        field_a = null;
    }

    final void b(int param0) {
        ((uw) this).field_f.a(false);
        if (param0 != 1909106792) {
            field_b = null;
        }
    }

    final void a(byte param0, int param1, fo param2) {
        try {
            ((uw) this).field_c[param1].a(param2, (byte) -61);
            int var4_int = -46 % ((param0 - -45) / 37);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uw.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0) {
        int var3 = 0;
        vf var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (!(((uw) this).field_d == null)) {
            ((uw) this).field_d.a(13113);
        }
        vf[] var6 = ((uw) this).field_c;
        vf[] var2 = var6;
        if (param0 != 10) {
            field_e = 75;
        }
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.b(331);
        }
    }

    final void e(int param0) {
        int var2 = 0;
        vf[] var3 = null;
        int var4 = 0;
        vf var5 = null;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (null != ((uw) this).field_d) {
            ((uw) this).field_d.a(((uw) this).field_f, -15530);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = 0;
          if (param0 == 30057) {
            break L1;
          } else {
            ((uw) this).field_f = null;
            break L1;
          }
        }
        var3 = ((uw) this).field_c;
        var4 = 0;
        L2: while (true) {
          if (var3.length <= var4) {
            L3: {
              if (null != ((uw) this).field_d) {
                ((uw) this).field_d.a(-16188, ((uw) this).field_f);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              var5 = var3[var4];
              if (null != ((uw) this).field_d) {
                ((uw) this).field_d.a(var2, var5, ((uw) this).field_f, 11180543);
                break L4;
              } else {
                break L4;
              }
            }
            var5.a(((uw) this).field_f, 1);
            var5.a(false, ((uw) this).field_f);
            if (null != ((uw) this).field_d) {
              ((uw) this).field_d.a(var5, var2, ((uw) this).field_f, true);
              var2++;
              var4++;
              continue L2;
            } else {
              var2++;
              var4++;
              continue L2;
            }
          }
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        an var4_ref_an = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        an var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            vs.field_P = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = cq.field_b.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = vs.field_P[9] >> 8;
                  var4 = vs.field_P[10] >> 8;
                  var5 = vs.field_P[11] >> 8;
                  var6 = tl.field_r << 4;
                  var7 = 0;
                  var8 = cr.a(true, var6) >> 8;
                  var9 = pla.b(119, var6) >> 8;
                  if (jba.field_j == -1) {
                    break L2;
                  } else {
                    if (sta.field_B != -1) {
                      var7 = -320 + jba.field_j;
                      var8 = 240 + -sta.field_B;
                      var9 = -128;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + var8 * var8 + var7 * var7));
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var8 = (int)((double)var8 * var10);
                var12 = var7 - var3;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + var12 * var12 - -(var14 * var14)));
                var14 = (int)((double)var14 * var10);
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var15 = 0;
                L3: while (true) {
                  if (cq.field_b.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= cq.field_b.length) {
                        var23[var16] = -2147483648;
                        var17 = cq.field_b[var16];
                        oka.b((byte) 86, var16);
                        var18 = 0;
                        L5: while (true) {
                          if (var18 >= 3) {
                            int discarded$4 = 0;
                            int discarded$5 = 0;
                            int discarded$6 = 1;
                            ft.a(var17, 1251086882, nba.field_a, vs.field_P);
                            int discarded$7 = -23;
                            dh.a(var9, var8, var13, var17, var7, var14, var12);
                            var15++;
                            continue L3;
                          } else {
                            nba.field_a[var18] = nba.field_a[var18] + tfa.field_e[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var16] < var23[var17_int]) {
                            var16 = var17_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_an = cq.field_b[var3];
                var4_ref_an.a((byte) -117);
                oka.b((byte) 17, var3);
                var5 = var4_ref_an.field_i + var4_ref_an.field_z >> 1;
                var6 = var4_ref_an.field_m + var4_ref_an.field_b >> 1;
                var7 = var4_ref_an.field_p + var4_ref_an.field_a >> 1;
                var8 = vs.field_P[9] >> 2;
                var9 = vs.field_P[10] >> 2;
                var10_int = vs.field_P[11] >> 2;
                var11 = nba.field_a[5] * var10_int + (nba.field_a[4] * var9 + var8 * nba.field_a[3]) >> 14;
                var12 = nba.field_a[8] * var10_int + (var8 * nba.field_a[6] + nba.field_a[7] * var9) >> 14;
                var13 = var10_int * nba.field_a[11] + var8 * nba.field_a[9] - -(var9 * nba.field_a[10]) >> 14;
                var2[var3] = var5 * var11 - (-(var6 * var12) + -(var7 * var13)) >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "uw.B(" + 0 + 41);
        }
    }

    uw(int param0) {
        int var2 = 0;
        ((uw) this).field_c = new vf[param0];
        for (var2 = 0; param0 > var2; var2++) {
            ((uw) this).field_c[var2] = new vf((uw) this);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Player";
        field_b = "Treasure adds to your score - and in multiplayer mode, the player with the most treasure wins. Escape the chamber to bank your treasure and earn points.";
    }
}
