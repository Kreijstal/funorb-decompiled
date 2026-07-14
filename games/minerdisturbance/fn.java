/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fn extends pi {
    static boolean field_o;
    static String field_r;
    String[] field_n;
    static String field_q;
    static int field_p;

    final static int b(boolean param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            sb var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_34_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        af discarded$2 = fn.a(-74, -57);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (4 <= aj.field_c.field_o) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (aj.field_c.field_j != -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 3;
                    }
                    case 6: {
                        if ((aj.field_c.field_j ^ -1) != 1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return 4;
                    }
                    case 8: {
                        return 1;
                    }
                    case 9: {
                        try {
                            if (tl.field_m == 0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            em.field_B = jl.field_fb.a(fb.field_a, kb.field_a, (byte) 60);
                            tl.field_m = tl.field_m + 1;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (1 != tl.field_m) {
                                statePc = 18;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (em.field_B.field_c != 2) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = tg.a(-1, -106);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (em.field_B.field_c != 1) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            tl.field_m = tl.field_m + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if ((tl.field_m ^ -1) == -3) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            mb.field_c = new ll((java.net.Socket) em.field_B.field_a, jl.field_fb);
                            var2 = new sb(13);
                            le.a(da.field_a, var2, ph.field_f, i.field_a, -91);
                            var2.c(15, 25564);
                            var2.a((byte) 120, gd.field_y);
                            mb.field_c.a((byte) 104, var2.field_u, 13, 0);
                            tl.field_m = tl.field_m + 1;
                            sk.field_a = 30000L + sf.a((byte) -54);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (-4 != tl.field_m) {
                                statePc = 31;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (-1 < mb.field_c.c(0)) {
                                statePc = 27;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if ((sf.a((byte) -5) ^ -1L) < (sk.field_a ^ -1L)) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = tg.a(-2, -115);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            var1_int = mb.field_c.a(false);
                            if (-1 == var1_int) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = tg.a(var1_int, -118);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            tl.field_m = tl.field_m + 1;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (-5 != tl.field_m) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            aj.field_c.a((Object) (Object) mb.field_c, gl.field_o, 24458);
                            tl.field_m = 0;
                            em.field_B = null;
                            mb.field_c = null;
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return stackIn_33_0;
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = -1;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        var1 = (IOException) (Object) caughtException;
                        return tg.a(-3, -74);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        lc var4 = null;
        wb var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ld var27 = null;
        long[][] var31 = null;
        L0: {
          var26 = MinerDisturbance.field_ab;
          var27 = kj.field_a;
          var2 = var27.d((byte) -54);
          if (var2 != param0) {
            if (-2 != (var2 ^ -1)) {
              di.a((Throwable) null, 1, "HS1: " + hj.a((byte) 68));
              si.a(-108);
              break L0;
            } else {
              var3 = var27.e(param0 + -89);
              var4_ref = (wb) (Object) hj.field_k.b(71);
              L1: while (true) {
                L2: {
                  if (var4_ref == null) {
                    break L2;
                  } else {
                    if (var4_ref.field_w == var3) {
                      break L2;
                    } else {
                      var4_ref = (wb) (Object) hj.field_k.b((byte) 56);
                      continue L1;
                    }
                  }
                }
                if (var4_ref == null) {
                  si.a(param0 + -41);
                  return;
                } else {
                  var4_ref.b(34);
                  break L0;
                }
              }
            }
          } else {
            var3 = var27.e(-78);
            var4 = (lc) (Object) sj.field_g.b(115);
            L3: while (true) {
              L4: {
                if (var4 == null) {
                  break L4;
                } else {
                  if (var4.field_q == var3) {
                    break L4;
                  } else {
                    var4 = (lc) (Object) sj.field_g.b((byte) 56);
                    continue L3;
                  }
                }
              }
              if (var4 == null) {
                si.a(param0 ^ -32);
                return;
              } else {
                L5: {
                  var5 = var27.d((byte) -54);
                  if (-1 == (var5 ^ -1)) {
                    break L5;
                  } else {
                    var6 = var4.field_r;
                    fm.field_S[0].field_f = null;
                    fm.field_S[0].field_g = false;
                    var7 = var4.field_v;
                    fm.field_S[0].field_a = ti.field_J;
                    var8_int = 1;
                    L6: while (true) {
                      if (var5 <= var8_int) {
                        var4.field_p = new String[3][var6];
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var31 = new long[3][var6];
                        var4.field_n = new int[3][var6 * var7];
                        var11 = new int[3][var6 * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.d((byte) -54);
                        if (-1 > (var18 ^ -1)) {
                          var19 = 0;
                          L7: while (true) {
                            if (var19 >= var18) {
                              break L5;
                            } else {
                              L8: {
                                var20 = var27.d((byte) -54);
                                var21 = fm.field_S[var20].field_a;
                                var22 = var27.h(65);
                                var24 = var27.field_o;
                                if (var19 >= var6) {
                                  break L8;
                                } else {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = fm.field_S[var20].field_f;
                                  var31[0][var12] = var22;
                                  var25 = 0;
                                  L9: while (true) {
                                    if (var7 <= var25) {
                                      var12++;
                                      break L8;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var27.b((byte) 76);
                                      var25++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (var21 == null) {
                                  break L10;
                                } else {
                                  if (ci.a(-27933, var21)) {
                                    var8[1][var13] = ti.field_J;
                                    var9[1][var13] = null;
                                    var31[1][var13] = var22;
                                    var13++;
                                    var27.field_o = var24;
                                    var25 = 0;
                                    L11: while (true) {
                                      if (var7 <= var25) {
                                        break L10;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var27.b((byte) 40);
                                        var25++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (var6 > var14) {
                                if (!fm.field_S[var20].field_g) {
                                  fm.field_S[var20].field_g = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = fm.field_S[var20].field_f;
                                  var31[2][var14] = var22;
                                  var14++;
                                  var27.field_o = var24;
                                  var25 = 0;
                                  L12: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var27.b((byte) 15);
                                      var25++;
                                      continue L12;
                                    } else {
                                      var19++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L7;
                                }
                              } else {
                                var19++;
                                continue L7;
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        fm.field_S[var8_int].field_a = var27.a(false);
                        fm.field_S[var8_int].field_g = false;
                        if (1 == var27.d((byte) -54)) {
                          fm.field_S[var8_int].field_f = var27.a(false);
                          var8_int++;
                          continue L6;
                        } else {
                          fm.field_S[var8_int].field_f = null;
                          var8_int++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
                var4.field_t = true;
                var4.b(34);
                break L0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (!qm.field_f) {
          L0: {
            if (null == sj.field_d) {
              sj.field_d = hk.b(param2 ^ 3);
              di.field_x = hk.b(0);
              break L0;
            } else {
              break L0;
            }
          }
          if (!nm.a(param0, sj.field_d, -827843803)) {
            L1: {
              var3_int = param0;
              if (param2 == 3) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            L2: {
              if (0 == ((1633100126 ^ pe.field_sb) & 1 << var3_int % 32)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_12_0;
              if (var4 == 0) {
                var5 = pe.field_sb ^ 1633100126;
                pe.field_sb = (var5 | 1 << var3_int) ^ 1633100126;
                pn.field_b = pn.field_b - (1 << var3_int);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                var6 = sj.field_d;
                var3 = var6;
                var4 = param0;
                var3[var4 >> -293986971] = hi.a(var6[var4 >> -293986971], 1 << c.a(31, var4));
                var7 = di.field_x;
                var3 = var7;
                var4 = param0;
                var3[var4 >> 92802565] = hi.a(var7[var4 >> 92802565], 1 << c.a(var4, 31));
                ce.field_a.a((byte) 40, (pi) (Object) new cm(param0));
                if (kj.a(false)) {
                  break L5;
                } else {
                  if (!wf.q(89)) {
                    break L5;
                  } else {
                    sl discarded$1 = qa.a(pn.field_b, hl.field_b, param0, pe.field_sb, (byte) 56, 4, param1, aa.field_b);
                    r.field_d = gk.b(4, 1);
                    break L4;
                  }
                }
              }
              vb.field_c.a((byte) -116, (pi) (Object) new sl(param0, param1, pe.field_sb, pn.field_b, aa.field_b, hl.field_b));
              break L4;
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            fn.a((byte[]) null, false);
        }
        return je.field_O.f(hf.field_t, 2, ca.field_k);
    }

    final static void b(int param0, int param1) {
        sj.field_f = sj.field_f + 1;
        if (25 == sj.field_f) {
            sj.field_f = 0;
        }
        dn.field_t[sj.field_f] = rc.a(re.field_a[18], param1, oc.field_f);
        sa discarded$0 = mg.a(1963987425, dn.field_t[sj.field_f]);
        rb.field_l[sj.field_f] = param0;
    }

    public static void a(byte param0) {
        field_q = null;
        field_r = null;
        int var1 = 124 % ((param0 - -18) / 45);
    }

    final static void a(byte[] param0, boolean param1) {
        if (param0 == null) {
            aa.field_j = new th();
            return;
        }
        if (!param1) {
            fn.a(100);
        }
        ld var2 = new ld(param0);
        if (!((var2.d((byte) -54) ^ -1) == -3)) {
            aa.field_j = new th();
            return;
        }
        aa.field_j = new th(var2);
    }

    final static af a(int param0, int param1) {
        af var2 = new af();
        ag.field_b.a((byte) 47, (pi) (Object) var2);
        if (param0 != 0) {
            return null;
        }
        ca.a(param1, 1);
        return var2;
    }

    fn(String[] param0) {
        ((fn) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Ranking: Pit Lord";
        field_q = "Orb points: <%0>";
    }
}
