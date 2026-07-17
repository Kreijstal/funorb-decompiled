/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_c;
    static int[] field_d;
    static volatile boolean field_e;
    private int[] field_b;
    static bd field_a;

    final static boolean a(byte param0) {
        int var1 = -58 % ((param0 - 55) / 62);
        return uk.a(bm.field_b, 0);
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -109) {
            break L0;
          } else {
            field_e = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (param1 != 45) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static pg b(int param0) {
        pg var1 = new pg(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], ja.field_e[0], bf.field_d);
        uj.d(-43);
        return var1;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        qj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        en var14 = null;
        int[][] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var14 = sc.field_g;
            var2 = var14.l(32270);
            var3 = (qj) (Object) rj.field_G.g(-83);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_i != var2) {
                    var3 = (qj) (Object) rj.field_G.a(12684);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var14.l(32270);
                  if (0 != var4) {
                    var5 = var3.field_j;
                    al.field_M[0] = qg.field_r;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        qh.a(var4, var5, 96);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            ve.a((byte) -125, var5);
                            var6 = new String[2][var5];
                            var18 = new int[2][var5 * 4];
                            var8 = fc.field_z;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var9 = 0;
                                var13 = 0;
                                var10 = var13;
                                L7: while (true) {
                                  if (var9 >= var8) {
                                    var3.b(108);
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = db.field_s[var5 - -var9];
                                      var6[1][var13] = al.field_M[var11];
                                      var18[1][var13 * 4] = qa.field_d[var11];
                                      var18[1][var13 * 4 - -1] = ta.field_mb[var11];
                                      var18[1][2 + var13 * 4] = og.field_b[var11];
                                      var18[1][var13 * 4 + 3] = db.field_t[var11];
                                      if (!pc.a(14088, al.field_M[var11])) {
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var9++;
                                    var13++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = db.field_s[var9];
                                  var6[0][var10] = al.field_M[var11];
                                  var18[0][4 * var10] = qa.field_d[var11];
                                  var18[0][4 * var10 + 1] = ta.field_mb[var11];
                                  var18[0][4 * var10 - -2] = og.field_b[var11];
                                  var18[0][3 + 4 * var10] = db.field_t[var11];
                                  if (!pc.a(14088, al.field_M[var11])) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              qj.a((vi) (Object) var14, (byte) -12);
                              if (var6_int != 0) {
                                pm.a(var6_int, s.field_e, 75, sm.field_g, jn.field_J, hf.field_a);
                                break L10;
                              } else {
                                pm.a(var6_int, s.field_e, 80, sm.field_g, jn.field_J, hf.field_a);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        al.field_M[var6_int] = var14.o(32);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.b(108);
                    break L3;
                  }
                }
                break L0;
              } else {
                le.c((byte) 41);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "rg.E(" + 1 + 41);
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = -1 + (((rg) this).field_b.length >> 1);
        if (param0) {
          var4 = var3 & param1;
          L0: while (true) {
            var5 = ((rg) this).field_b[1 + (var4 - -var4)];
            if (var5 == -1) {
              return -1;
            } else {
              if (((rg) this).field_b[var4 - -var4] == param1) {
                return var5;
              } else {
                var4 = var3 & 1 + var4;
                continue L0;
              }
            }
          }
        } else {
          return -37;
        }
    }

    rg(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (param0.length - -(param0.length >> 1) < var2_int) {
                ((rg) this).field_b = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int - 1;
                        L4: while (true) {
                          if (((rg) this).field_b[var4 + (var4 + 1)] == -1) {
                            ((rg) this).field_b[var4 + var4] = param0[var3];
                            ((rg) this).field_b[var4 + var4 - -1] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((rg) this).field_b[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("rg.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Destroy all the spawn eggs in this area, then exit via the lift.";
        field_e = false;
    }
}
