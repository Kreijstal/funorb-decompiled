/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static long field_c;
    static int field_b;
    static pi field_e;
    static jp field_d;
    static int field_a;

    final static void b(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        fr var4_ref_fr = null;
        int var4 = 0;
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
        fr var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = BrickABrac.field_J ? 1 : 0;
        kk.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = gg.field_i.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var1) {
            L1: {
              var3 = kk.field_e[9] >> -634629272;
              var4 = kk.field_e[10] >> 317243528;
              var5 = kk.field_e[11] >> -1099106168;
              var6 = ld.field_t << 1717570244;
              var7 = 0;
              var8 = sa.a(var6, -4097) >> -659055544;
              var9 = BrickABrac.c(2048, var6) >> -2110180792;
              if (-1 == pq.field_k) {
                break L1;
              } else {
                if (-1 == po.field_a) {
                  break L1;
                } else {
                  var8 = -po.field_a + 240;
                  var9 = -128;
                  var7 = pq.field_k + -320;
                  break L1;
                }
              }
            }
            L2: {
              var10 = 256.0 / Math.sqrt((double)(var9 * var9 + var8 * var8 + var7 * var7));
              var9 = (int)((double)var9 * var10);
              var8 = (int)((double)var8 * var10);
              var7 = (int)((double)var7 * var10);
              var12 = var7 - var3;
              var13 = var8 - var4;
              var14 = -var5 + var9;
              var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 - -(var13 * var13)));
              if (param0 < -114) {
                break L2;
              } else {
                field_a = -44;
                break L2;
              }
            }
            var12 = (int)((double)var12 * var10);
            var13 = (int)((double)var13 * var10);
            var14 = (int)((double)var14 * var10);
            var15 = 0;
            L3: while (true) {
              if (gg.field_i.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (var17_int >= gg.field_i.length) {
                    var23[var16] = -2147483648;
                    var17 = gg.field_i[var16];
                    fk.a(var16, (byte) 77);
                    var18 = 0;
                    L5: while (true) {
                      if (-4 >= (var18 ^ -1)) {
                        ka.a(kk.field_e, -16283, ld.field_w, false, true, var17, false);
                        mp.a(var14, var7, var12, var9, var17, (byte) -105, var13, var8);
                        var15++;
                        continue L3;
                      } else {
                        ld.field_w[var18] = ld.field_w[var18] + rn.field_e[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var23[var16] < var23[var17_int]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_fr = gg.field_i[var3];
            var4_ref_fr.c(23);
            fk.a(var3, (byte) 77);
            var5 = var4_ref_fr.field_f - -var4_ref_fr.field_N >> -474946335;
            var6 = var4_ref_fr.field_d + var4_ref_fr.field_y >> 658007009;
            var7 = var4_ref_fr.field_x + var4_ref_fr.field_q >> -2041587071;
            var8 = kk.field_e[9] >> -1885820670;
            var9 = kk.field_e[10] >> 1507565858;
            var10_int = kk.field_e[11] >> -1981792158;
            var11 = var10_int * ld.field_w[5] + (ld.field_w[4] * var9 + ld.field_w[3] * var8) >> -1733160242;
            var12 = var8 * ld.field_w[6] + (var9 * ld.field_w[7] - -(var10_int * ld.field_w[8])) >> -2024745074;
            var13 = var9 * ld.field_w[10] + (var8 * ld.field_w[9] - -(ld.field_w[11] * var10_int)) >> 594840878;
            var2[var3] = var7 * var13 + var12 * var6 + var5 * var11 >> -643133872;
            var3++;
            continue L0;
          }
        }
    }

    final static boolean a(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0;
        int stackOut_5_0;
        int stackOut_7_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) gp.field_c;
                    // monitorenter gp.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (si.field_m != fm.field_d) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        dc.field_b = ef.field_d[si.field_m];
                        go.field_b = vp.field_r[si.field_m];
                        if (param0 == 5) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        // monitorexit var1_ref
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        si.field_m = si.field_m - -1 & 127;
                        // monitorexit var1_ref
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        if (param0 != 31186) {
            Object var2 = null;
            String discarded$0 = jl.a(-88, (String) null, -64);
        }
    }

    final static String a(int param0, String param1, int param2) {
        CharSequence var6 = (CharSequence) (Object) param1;
        if (!(tk.a(var6, false))) {
            return om.field_Xb;
        }
        if (!((wk.field_m ^ -1) == -3)) {
            return kd.field_b;
        }
        if (!(!ci.a(param1, -19))) {
            return rj.field_a;
        }
        if (nc.a(0, param1)) {
            return rd.a(gh.field_d, new String[1], (byte) 103);
        }
        if (ol.field_w <= -101) {
            if (-1 >= go.field_c) {
                return er.field_e;
            }
        }
        if (200 <= ol.field_w) {
            return er.field_e;
        }
        if (af.a(121, param1)) {
            return rd.a(sn.field_u, new String[1], (byte) 103);
        }
        if (param0 != 24943) {
            field_c = -99L;
        }
        pi var5 = k.field_h;
        var5.e(-13413, param2);
        var5.field_l = var5.field_l + 1;
        int var4 = var5.field_l;
        var5.a(-107, 0);
        var5.a(param1, param0 + -24944);
        var5.d((byte) 122, -var4 + var5.field_l);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 64;
    }
}
