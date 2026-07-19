/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static boolean field_a;
    static byte[] field_d;
    kf field_b;
    static vu[][] field_c;

    final static void a(int param0, sj param1, sj param2, sj param3) {
        int incrementValue$1 = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        sj var9 = null;
        ef var10 = null;
        ef var11 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            pv.field_I = new nm[5][17];
            hq.field_b = new nm[5];
            de.a(param1, param3, (byte) -69);
            var10 = new ef(0);
            var11 = var10;
            L1: while (true) {
              if (var11.g((byte) 103)) {
                L2: {
                  pe.a((byte) 82, var10);
                  pv.field_I[0][0] = new nm(param2, "characters", "ka_tank_aggressive_tackle");
                  pv.field_I[0][1] = new nm(param2, "characters", "ka_tank_fall");
                  pv.field_I[0][2] = new nm(param2, "characters", "ka_tank_fall_stand");
                  pv.field_I[0][3] = new nm(param2, "characters", "ka_tank_idle");
                  pv.field_I[0][4] = new nm(param2, "characters", "ka_striker_kick");
                  pv.field_I[0][5] = new nm(param2, "characters", "ka_tank_run");
                  pv.field_I[0][6] = new nm(param2, "characters", "ka_tank_tackle_stand");
                  pv.field_I[0][8] = new nm(param2, "characters", "ka_tank_diving_header");
                  pv.field_I[0][16] = new nm(param2, "characters", "ka_tank_aeroplane");
                  pv.field_I[0][9] = new nm(param2, "characters", "ka_tank_celebrate_new");
                  sk.a(94, 6, 1);
                  pv.field_I[3][0] = new nm(param2, "characters", "ka_scout_aggressive_tackle");
                  if (param0 == 20113) {
                    break L2;
                  } else {
                    var9 = (sj) null;
                    rf.a(103, (sj) null, (sj) null, (sj) null);
                    break L2;
                  }
                }
                pv.field_I[3][1] = new nm(param2, "characters", "ka_scout_fall");
                pv.field_I[3][2] = new nm(param2, "characters", "ka_scout_fall_stand");
                pv.field_I[3][3] = new nm(param2, "characters", "ka_scout_idle");
                pv.field_I[3][5] = new nm(param2, "characters", "ka_scout_run");
                pv.field_I[3][6] = new nm(param2, "characters", "ka_scout_tackle_stand");
                pv.field_I[3][7] = new nm(param2, "characters", "ka_scout_tackle_delay");
                pv.field_I[3][16] = new nm(param2, "characters", "ka_scout_aeroplane");
                pv.field_I[3][9] = new nm(param2, "characters", "ka_scout_celebrate_new");
                sk.a(-113, 6, 2);
                pv.field_I[2][0] = new nm(param2, "characters", "ka_specialist_aggressive_tackle");
                pv.field_I[2][1] = new nm(param2, "characters", "ka_specialist_fall");
                pv.field_I[2][2] = new nm(param2, "characters", "ka_specialist_fall_stand");
                pv.field_I[2][3] = new nm(param2, "characters", "ka_specialist_idle");
                pv.field_I[2][5] = new nm(param2, "characters", "ka_specialist_run");
                pv.field_I[2][6] = new nm(param2, "characters", "ka_specialist_tackle_stand");
                pv.field_I[2][16] = new nm(param2, "characters", "ka_specialist_aeroplane");
                pv.field_I[2][9] = new nm(param2, "characters", "ka_specialist_celebrate_new");
                sk.a(param0 ^ -20164, 6, 3);
                pv.field_I[1][0] = new nm(param2, "characters", "ka_striker_aggressive_tackle");
                pv.field_I[1][1] = new nm(param2, "characters", "ka_striker_fall");
                pv.field_I[1][2] = new nm(param2, "characters", "ka_striker_fall_stand");
                pv.field_I[1][3] = new nm(param2, "characters", "ka_striker_idle");
                pv.field_I[1][5] = new nm(param2, "characters", "ka_striker_run");
                pv.field_I[1][6] = new nm(param2, "characters", "ka_striker_tackle_stand");
                pv.field_I[1][16] = new nm(param2, "characters", "ka_striker_aeroplane");
                pv.field_I[1][9] = new nm(param2, "characters", "ka_striker_celebrate_new");
                sk.a(80, 6, 4);
                pv.field_I[4][10] = new nm(param2, "characters", "ka_keeper_basic_catch");
                pv.field_I[4][11] = new nm(param2, "characters", "ka_keeper_l_dive_stand");
                pv.field_I[4][12] = new nm(param2, "characters", "ka_keeper_l_dive_static");
                pv.field_I[4][13] = new nm(param2, "characters", "ka_keeper_r_dive_stand");
                pv.field_I[4][14] = new nm(param2, "characters", "ka_keeper_r_dive_static");
                pv.field_I[4][3] = new nm(param2, "characters", "ka_keeper_idle");
                pv.field_I[4][4] = new nm(param2, "characters", "ka_keeper_kick");
                pv.field_I[4][5] = new nm(param2, "characters", "ka_keeper_run");
                pv.field_I[4][15] = new nm(param2, "characters", "ka_keeper_l_shuffle");
                pv.field_I[4][0] = new nm(param2, "characters", "ka_keeper_aggressive_tackle");
                pv.field_I[4][6] = new nm(param2, "characters", "ka_keeper_tackle_stand");
                sk.a(89, 6, 5);
                hq.field_b[0] = new nm(param2, "fans", "fan01_cheer");
                hq.field_b[1] = new nm(param2, "fans", "fan02_cheer");
                hq.field_b[2] = new nm(param2, "fans", "fan03_cheer");
                hq.field_b[3] = new nm(param2, "fans", "fan04_cheer");
                hq.field_b[4] = new nm(param2, "fans", "fan05_cheer");
                var5 = 0;
                L3: while (true) {
                  if ((var5 ^ -1) <= -6) {
                    break L0;
                  } else {
                    var6 = 0;
                    L4: while (true) {
                      if (-18 >= (var6 ^ -1)) {
                        var5++;
                        continue L3;
                      } else {
                        var7 = 0;
                        L5: while (true) {
                          if (pv.field_I[var5][var6] != null) {
                            var6++;
                            continue L4;
                          } else {
                            incrementValue$1 = var7;
                            var7++;
                            pv.field_I[var5][var6] = pv.field_I[incrementValue$1][var6];
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("rf.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
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
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_b.a(true, param3, param0, var6, var7, param2, param1);
        du.field_f.a(true, kk.field_R.field_q, 0, 0, sh.field_c);
        int var8 = 17 % ((-10 - param4) / 63);
        pj.field_E.a(true, -2 + -oe.field_f + (kk.field_R.field_q - 80) - 2, 0, 2 + sh.field_c, 18);
        ph.field_f.a(true, 82 + oe.field_f, -80 + (-oe.field_f + kk.field_R.field_q) - 2, sh.field_c + 2, 18);
        ei.field_d.a(oe.field_f, -sh.field_c + (kk.field_R.field_mb - 22), 20, 20 + sh.field_c + 2, kk.field_R.field_q, 92, 2, 0);
        nq.field_F.a(2, oe.field_f, (byte) 19, 20);
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var13 = new int[256];
            var2 = 0;
            L1: while (true) {
              if (var2 >= var13.length) {
                var14 = new int[256];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var14.length) {
                    kj.field_b = new byte[210][];
                    qi.field_n = new int[16];
                    ac.field_a = new byte[16][];
                    var3 = 0;
                    L3: while (true) {
                      if ((var3 ^ -1) <= -211) {
                        var4 = -20 % ((param0 - -71) / 47);
                        var3 = 0;
                        L4: while (true) {
                          if (-17 >= (var3 ^ -1)) {
                            break L0;
                          } else {
                            qi.field_n[var3] = (-(90 * var3) + 1440 >> -1308703996) + 72;
                            ac.field_a[var3] = eo.a(var14, var3, 16, qi.field_n[var3]);
                            var3++;
                            continue L4;
                          }
                        }
                      } else {
                        kj.field_b[var3] = eo.a(var13, var3, 210);
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var4 = Math.min(255, 5 * var3 >> 1868992706);
                      if ((var4 ^ -1) > -129) {
                        stackOut_14_0 = var4 << 233511841;
                        stackIn_15_0 = stackOut_14_0;
                        break L5;
                      } else {
                        stackOut_13_0 = -(var4 << -984280127) + 511;
                        stackIn_15_0 = stackOut_13_0;
                        break L5;
                      }
                    }
                    var4 = stackIn_15_0;
                    var5 = 0;
                    L6: while (true) {
                      if (3 <= var5) {
                        var14[var3] = var4;
                        var3++;
                        continue L2;
                      } else {
                        var4 = var4 * var4 >> 932735528;
                        var5++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                L7: {
                  var3 = Math.min(255, 3 * var2 >> -1374590943);
                  if (var3 <= 128) {
                    stackOut_5_0 = var3 << 1073683457;
                    stackIn_6_0 = stackOut_5_0;
                    break L7;
                  } else {
                    stackOut_4_0 = 511 - (var3 << 2073551969);
                    stackIn_6_0 = stackOut_4_0;
                    break L7;
                  }
                }
                var3 = stackIn_6_0;
                var4 = 0;
                L8: while (true) {
                  if (var4 >= 3) {
                    var13[var2] = var3;
                    var2++;
                    continue L1;
                  } else {
                    var3 = var3 * var3 >> -1327680408;
                    var4++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "rf.C(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 16) {
            field_c = (vu[][]) null;
        }
        return (param0 & -param0) == param0 ? true : false;
    }

    final static void a(hr param0, int param1, boolean param2) {
        ml var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            if (!param2) {
                field_c = (vu[][]) null;
            }
            var5 = or.field_d;
            var5.b(param1, (byte) -75);
            var5.field_n = var5.field_n + 1;
            var4 = var5.field_n;
            var5.a(125, 1);
            var5.a(113, param0.field_j);
            var5.e(-109, param0.field_i);
            var5.b(-65, param0.field_e);
            var5.b(-84, param0.field_l);
            var5.b(-74, param0.field_n);
            var5.b(-75, param0.field_g);
            discarded$0 = var5.a(var4, !param2 ? true : false);
            var5.c(62, var5.field_n + -var4);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "rf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = (vu[][]) null;
        if (param0 >= -58) {
            return;
        }
        field_d = null;
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = ei.a(param0, (byte) -23);
        int var4 = we.a(param0, false);
        int var5 = ei.a(param2, (byte) -23);
        int var6 = we.a(param2, false);
        int var7 = (int)((long)var5 * (long)var3 >> 738034512);
        int var8 = (int)((long)var6 * (long)var3 >> 1323645456);
        int var9 = (int)((long)var4 * (long)var5 >> 569161232);
        int var11 = 94 % ((param1 - -46) / 59);
        int var10 = (int)((long)var4 * (long)var6 >> -1796162224);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    rf(String param0, hd param1) {
        String[] var3 = null;
        hd[] var4 = null;
        try {
            var3 = new String[]{param0, lk.field_n, at.field_Jb};
            var4 = new hd[]{param1, kk.field_R, (hd) ((Object) nq.field_F)};
            this.field_b = new kf(0L, ge.field_n, var3, ku.field_b, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = false;
    }
}
