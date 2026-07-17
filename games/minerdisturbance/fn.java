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

    final static int b() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            sb var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_30_0 = 0;
            if (4 <= aj.field_c.field_o) {
              if (aj.field_c.field_j != -1) {
                if (aj.field_c.field_j != -2) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (tl.field_m == 0) {
                      em.field_B = jl.field_fb.a(fb.field_a, kb.field_a, (byte) 60);
                      tl.field_m = tl.field_m + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (1 != tl.field_m) {
                      break L2;
                    } else {
                      if (em.field_B.field_c != 2) {
                        if (em.field_B.field_c != 1) {
                          break L2;
                        } else {
                          tl.field_m = tl.field_m + 1;
                          break L2;
                        }
                      } else {
                        stackOut_12_0 = tg.a(-1, -106);
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      }
                    }
                  }
                  L3: {
                    if (tl.field_m == 2) {
                      mb.field_c = new ll((java.net.Socket) em.field_B.field_a, jl.field_fb);
                      var2 = new sb(13);
                      le.a(da.field_a, var2, ph.field_f, i.field_a, -91);
                      var2.c(15, 25564);
                      var2.a((byte) 120, gd.field_y);
                      mb.field_c.a((byte) 104, var2.field_u, 13, 0);
                      tl.field_m = tl.field_m + 1;
                      sk.field_a = 30000L + sf.a((byte) -54);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (tl.field_m != 3) {
                      break L4;
                    } else {
                      if (mb.field_c.c(0) > 0) {
                        var1_int = mb.field_c.a(false);
                        if (var1_int == 0) {
                          tl.field_m = tl.field_m + 1;
                          break L4;
                        } else {
                          stackOut_26_0 = tg.a(var1_int, -118);
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        }
                      } else {
                        if (~sf.a((byte) -5) < ~sk.field_a) {
                          stackOut_23_0 = tg.a(-2, -115);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (tl.field_m != 4) {
                    stackOut_32_0 = -1;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    aj.field_c.a((Object) (Object) mb.field_c, gl.field_o, 24458);
                    tl.field_m = 0;
                    em.field_B = null;
                    mb.field_c = null;
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return tg.a(-3, -74);
              }
              return stackIn_33_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
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
        RuntimeException decompiledCaughtException = null;
        var26 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var27 = kj.field_a;
              var2 = var27.d((byte) -54);
              if (var2 != 0) {
                if (var2 != 1) {
                  di.a((Throwable) null, 1, "HS1: " + hj.a((byte) 68));
                  si.a(-108);
                  break L1;
                } else {
                  var3 = var27.e(-89);
                  var4_ref = (wb) (Object) hj.field_k.b(71);
                  L2: while (true) {
                    L3: {
                      if (var4_ref == null) {
                        break L3;
                      } else {
                        if (var4_ref.field_w == var3) {
                          break L3;
                        } else {
                          var4_ref = (wb) (Object) hj.field_k.b((byte) 56);
                          continue L2;
                        }
                      }
                    }
                    if (var4_ref == null) {
                      si.a(-41);
                      return;
                    } else {
                      var4_ref.b(34);
                      break L1;
                    }
                  }
                }
              } else {
                var3 = var27.e(-78);
                var4 = (lc) (Object) sj.field_g.b(115);
                L4: while (true) {
                  L5: {
                    if (var4 == null) {
                      break L5;
                    } else {
                      if (var4.field_q == var3) {
                        break L5;
                      } else {
                        var4 = (lc) (Object) sj.field_g.b((byte) 56);
                        continue L4;
                      }
                    }
                  }
                  if (var4 == null) {
                    si.a(-32);
                    return;
                  } else {
                    L6: {
                      var5 = var27.d((byte) -54);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        var6 = var4.field_r;
                        fm.field_S[0].field_f = null;
                        fm.field_S[0].field_g = false;
                        var7 = var4.field_v;
                        fm.field_S[0].field_a = ti.field_J;
                        var8_int = 1;
                        L7: while (true) {
                          if (var5 <= var8_int) {
                            String[][] dupTemp$5 = new String[3][var6];
                            var4.field_p = dupTemp$5;
                            var8 = dupTemp$5;
                            var9 = new String[3][var6];
                            var31 = new long[3][var6];
                            int[][] dupTemp$6 = new int[3][var6 * var7];
                            var4.field_n = dupTemp$6;
                            var11 = dupTemp$6;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.d((byte) -54);
                            if (var18 > 0) {
                              var19 = 0;
                              L8: while (true) {
                                if (var19 >= var18) {
                                  break L6;
                                } else {
                                  L9: {
                                    var20 = var27.d((byte) -54);
                                    var21 = fm.field_S[var20].field_a;
                                    var22 = var27.h(65);
                                    var24 = var27.field_o;
                                    if (var19 >= var6) {
                                      break L9;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = fm.field_S[var20].field_f;
                                      var31[0][var12] = var22;
                                      var25 = 0;
                                      L10: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L9;
                                        } else {
                                          int incrementValue$7 = var15;
                                          var15++;
                                          var11[0][incrementValue$7] = var27.b((byte) 76);
                                          var25++;
                                          continue L10;
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var21 == null) {
                                      break L11;
                                    } else {
                                      if (ci.a(-27933, var21)) {
                                        var8[1][var13] = ti.field_J;
                                        var9[1][var13] = null;
                                        var31[1][var13] = var22;
                                        var13++;
                                        var27.field_o = var24;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            int incrementValue$8 = var16;
                                            var16++;
                                            var11[1][incrementValue$8] = var27.b((byte) 40);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var6 <= var14) {
                                      break L13;
                                    } else {
                                      if (!fm.field_S[var20].field_g) {
                                        fm.field_S[var20].field_g = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = fm.field_S[var20].field_f;
                                        var31[2][var14] = var22;
                                        var14++;
                                        var27.field_o = var24;
                                        var25 = 0;
                                        L14: while (true) {
                                          if (var7 <= var25) {
                                            break L13;
                                          } else {
                                            int incrementValue$9 = var17;
                                            var17++;
                                            var11[2][incrementValue$9] = var27.b((byte) 15);
                                            var25++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L8;
                                }
                              }
                            } else {
                              break L6;
                            }
                          } else {
                            L15: {
                              fm.field_S[var8_int].field_a = var27.a(false);
                              fm.field_S[var8_int].field_g = false;
                              if (1 == var27.d((byte) -54)) {
                                fm.field_S[var8_int].field_f = var27.a(false);
                                break L15;
                              } else {
                                fm.field_S[var8_int].field_f = null;
                                break L15;
                              }
                            }
                            var8_int++;
                            continue L7;
                          }
                        }
                      }
                    }
                    var4.field_t = true;
                    var4.b(34);
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "fn.B(" + 0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (!qm.field_f) {
          L0: {
            if (null == sj.field_d) {
              int discarded$4 = 0;
              sj.field_d = hk.b();
              int discarded$5 = 0;
              di.field_x = hk.b();
              break L0;
            } else {
              break L0;
            }
          }
          int discarded$6 = -827843803;
          if (!nm.a(param0, sj.field_d)) {
            L1: {
              var3_int = param0;
              if (0 == ((1633100126 ^ pe.field_sb) & 1 << var3_int % 32)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            L2: {
              var4 = stackIn_10_0;
              if (var4 == 0) {
                var5 = pe.field_sb ^ 1633100126;
                pe.field_sb = (var5 | 1 << var3_int) ^ 1633100126;
                pn.field_b = pn.field_b - (1 << var3_int);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var6 = sj.field_d;
                var3 = var6;
                var4 = param0;
                var3[var4 >> 5] = hi.a(var6[var4 >> 5], 1 << c.a(31, var4));
                var7 = di.field_x;
                var3 = var7;
                var4 = param0;
                var3[var4 >> 5] = hi.a(var7[var4 >> 5], 1 << c.a(var4, 31));
                ce.field_a.a((byte) 40, (pi) (Object) new cm(param0));
                if (kj.a(false)) {
                  break L4;
                } else {
                  if (!wf.q(89)) {
                    break L4;
                  } else {
                    sl discarded$7 = qa.a(pn.field_b, hl.field_b, param0, pe.field_sb, (byte) 56, 4, param1, aa.field_b);
                    r.field_d = gk.b(4, 1);
                    break L3;
                  }
                }
              }
              vb.field_c.a((byte) -116, (pi) (Object) new sl(param0, param1, pe.field_sb, pn.field_b, aa.field_b, hl.field_b));
              break L3;
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
        return je.field_O.f(hf.field_t, 2, ca.field_k);
    }

    final static void b(int param0, int param1) {
        sj.field_f = sj.field_f + 1;
        if (25 == sj.field_f) {
            sj.field_f = 0;
        }
        dn.field_t[sj.field_f] = rc.a(re.field_a[18], 100, oc.field_f);
        sa discarded$0 = mg.a(1963987425, dn.field_t[sj.field_f]);
        rb.field_l[sj.field_f] = param0;
    }

    public static void a() {
        field_q = null;
        field_r = null;
        int var1 = 0;
    }

    final static void a(byte[] param0) {
        if (param0 == null) {
            aa.field_j = new th();
            return;
        }
        ld var2 = new ld(param0);
        if (!(var2.d((byte) -54) == 2)) {
            aa.field_j = new th();
            return;
        }
        try {
            aa.field_j = new th(var2);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fn.F(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final static af a(int param0, int param1) {
        af var2 = new af();
        ag.field_b.a((byte) 47, (pi) (Object) var2);
        ca.a(6, 1);
        return var2;
    }

    fn(String[] param0) {
        try {
            ((fn) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fn.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Ranking: Pit Lord";
        field_q = "Orb points: <%0>";
    }
}
