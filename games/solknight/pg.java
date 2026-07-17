/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pg {
    static int field_b;
    static long[] field_d;
    static o field_a;
    static String field_c;
    static boolean field_e;

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sd var4_ref_sd = null;
        long var4 = 0L;
        int var5 = 0;
        qc var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
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
        jd var27 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var27 = te.field_N;
              var2 = var27.j(255);
              if (var2 != 0) {
                if (1 == var2) {
                  var3 = var27.i(-4);
                  var4 = var27.a(10526);
                  var6 = (qc) (Object) sb.field_c.a((byte) 51);
                  L2: while (true) {
                    L3: {
                      if (var6 == null) {
                        break L3;
                      } else {
                        if (var6.field_u != var3) {
                          var6 = (qc) (Object) sb.field_c.b(-111);
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var6 == null) {
                      je.a(false);
                      return;
                    } else {
                      var6.field_n = var4;
                      var6.c(10);
                      break L1;
                    }
                  }
                } else {
                  int discarded$7 = 1;
                  hi.a((Throwable) null, "HS1: " + oc.a(false));
                  je.a(false);
                  break L1;
                }
              } else {
                var3 = var27.i(-109);
                var4_ref_sd = (sd) (Object) r.field_b.a((byte) 51);
                L4: while (true) {
                  L5: {
                    if (var4_ref_sd == null) {
                      break L5;
                    } else {
                      if (var3 == var4_ref_sd.field_o) {
                        break L5;
                      } else {
                        var4_ref_sd = (sd) (Object) r.field_b.b(-125);
                        continue L4;
                      }
                    }
                  }
                  if (var4_ref_sd == null) {
                    je.a(false);
                    return;
                  } else {
                    L6: {
                      var5 = var27.j(255);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        var6_int = var4_ref_sd.field_k;
                        da.field_a[0].field_c = false;
                        da.field_a[0].field_d = ne.field_g;
                        var7 = var4_ref_sd.field_l;
                        da.field_a[0].field_a = null;
                        var8_int = 1;
                        L7: while (true) {
                          if (var5 <= var8_int) {
                            String[][] dupTemp$8 = new String[3][var6_int];
                            var4_ref_sd.field_n = dupTemp$8;
                            var8 = dupTemp$8;
                            var9 = new String[3][var6_int];
                            long[][] dupTemp$9 = new long[3][var6_int];
                            var4_ref_sd.field_m = dupTemp$9;
                            var10 = dupTemp$9;
                            int[][] dupTemp$10 = new int[3][var7 * var6_int];
                            var4_ref_sd.field_i = dupTemp$10;
                            var11 = dupTemp$10;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.j(255);
                            if (0 >= var18) {
                              break L6;
                            } else {
                              var19 = 0;
                              L8: while (true) {
                                if (var18 <= var19) {
                                  break L6;
                                } else {
                                  L9: {
                                    var20 = var27.j(255);
                                    var21 = da.field_a[var20].field_d;
                                    var22 = var27.a(10526);
                                    var24 = var27.field_m;
                                    if (var6_int > var19) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = da.field_a[var20].field_a;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L10: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L9;
                                        } else {
                                          int incrementValue$11 = var15;
                                          var15++;
                                          var11[0][incrementValue$11] = var27.e(true);
                                          var25++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L11: {
                                    if (var21 == null) {
                                      break L11;
                                    } else {
                                      if (kj.a(var21, (byte) -47)) {
                                        var8[1][var13] = ne.field_g;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var27.field_m = var24;
                                        var13++;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            int incrementValue$12 = var16;
                                            var16++;
                                            var11[1][incrementValue$12] = var27.e(true);
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
                                    if (var14 >= var6_int) {
                                      break L13;
                                    } else {
                                      if (!da.field_a[var20].field_c) {
                                        da.field_a[var20].field_c = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = da.field_a[var20].field_a;
                                        var10[2][var14] = var22;
                                        var27.field_m = var24;
                                        var14++;
                                        var25 = 0;
                                        L14: while (true) {
                                          if (var7 <= var25) {
                                            break L13;
                                          } else {
                                            int incrementValue$13 = var17;
                                            var17++;
                                            var11[2][incrementValue$13] = var27.e(true);
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
                            }
                          } else {
                            L15: {
                              da.field_a[var8_int].field_d = var27.h(115);
                              da.field_a[var8_int].field_c = false;
                              if (var27.j(255) != 1) {
                                da.field_a[var8_int].field_a = null;
                                break L15;
                              } else {
                                da.field_a[var8_int].field_a = var27.h(105);
                                break L15;
                              }
                            }
                            var8_int++;
                            continue L7;
                          }
                        }
                      }
                    }
                    var4_ref_sd.field_h = true;
                    var4_ref_sd.c(10);
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
          throw fc.a((Throwable) (Object) var1, "pg.A(" + -117 + 41);
        }
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            gb var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_32_0 = 0;
            if (il.field_c.field_l >= 4) {
              if (-1 != il.field_c.field_c) {
                if (il.field_c.field_c == -2) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (0 == ug.field_f) {
                      ik.field_b = n.field_a.a(qk.field_o, ue.field_a, -28148);
                      ug.field_f = ug.field_f + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (ug.field_f != 1) {
                      break L2;
                    } else {
                      if (2 != ik.field_b.field_c) {
                        if (ik.field_b.field_c == 1) {
                          ug.field_f = ug.field_f + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_12_0 = ua.a(-1, (byte) -86);
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      }
                    }
                  }
                  L3: {
                    if (ug.field_f != 2) {
                      break L3;
                    } else {
                      qf.field_a = new ad((java.net.Socket) ik.field_b.field_e, n.field_a);
                      var2 = new gb(13);
                      si.a(hj.field_x, (byte) 22, sa.field_o, q.field_a, var2);
                      var2.c(param0 + 35, 15);
                      var2.b(nc.field_a, false);
                      qf.field_a.a(-28748, 0, 13, var2.field_l);
                      ug.field_f = ug.field_f + 1;
                      cj.field_c = 30000L + je.a(1);
                      break L3;
                    }
                  }
                  L4: {
                    if (ug.field_f != 3) {
                      break L4;
                    } else {
                      if (qf.field_a.b(-30119) <= 0) {
                        if (~cj.field_c <= ~je.a(param0 ^ 82)) {
                          break L4;
                        } else {
                          stackOut_27_0 = ua.a(-2, (byte) -86);
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        }
                      } else {
                        var1_int = qf.field_a.a(-116);
                        if (0 != var1_int) {
                          stackOut_23_0 = ua.a(var1_int, (byte) -86);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          ug.field_f = ug.field_f + 1;
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if (param0 == 83) {
                      break L5;
                    } else {
                      int discarded$1 = pg.a((byte) 9);
                      break L5;
                    }
                  }
                  if (ug.field_f != 4) {
                    stackOut_34_0 = -1;
                    stackIn_35_0 = stackOut_34_0;
                    break L0;
                  } else {
                    il.field_c.a(la.field_n, (byte) 106, (Object) (Object) qf.field_a);
                    ug.field_f = 0;
                    ik.field_b = null;
                    qf.field_a = null;
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ua.a(-3, (byte) -86);
              }
              return stackIn_35_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        uc.field_b = 21845;
        uc.field_c = 133;
        uc.field_e = 33;
    }

    public static void b() {
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new long[32];
        field_c = "Menu: 'ESC'";
    }
}
