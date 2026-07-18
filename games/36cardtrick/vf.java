/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vf {
    static cc field_a;
    static int field_b;

    abstract void a(byte[] param0, byte param1);

    abstract byte[] a(byte param0);

    public static void b() {
        field_a = null;
    }

    final static String a(int param0, int param1) {
        int var4 = 0;
        int var5 = Main.field_T;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; var4 < param1; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    final static int b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_9_0 = 0;
        var2 = Main.field_T;
        try {
          L0: {
            boolean discarded$28 = sd.field_c.a((byte) -116, lg.field_E, te.field_a, true);
            sd.field_c.l(-2054);
            L1: while (true) {
              int discarded$29 = -114;
              if (!ge.b()) {
                if (ml.field_a != -1) {
                  var1_int = ml.field_a;
                  gh.a(-1, 31888);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (param0 >= 63) {
                    if (r.field_p) {
                      stackOut_13_0 = 3;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      if (ei.field_d == hh.field_g) {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        if (wh.field_a.a(640)) {
                          if (hh.field_g != jc.field_P) {
                            stackOut_25_0 = -1;
                            stackIn_26_0 = stackOut_25_0;
                            break L0;
                          } else {
                            stackOut_23_0 = 2;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          }
                        } else {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    }
                  } else {
                    stackOut_9_0 = 44;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              } else {
                boolean discarded$30 = sd.field_c.a(fd.field_n, 34, tb.field_d);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "vf.F(" + param0 + ')');
        }
        return stackIn_26_0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        mf var3 = null;
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
        w var14 = null;
        int[][] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Main.field_T;
        try {
          L0: {
            L1: {
              var14 = rd.field_j;
              if (param0 == -28037) {
                break L1;
              } else {
                vf.a(-72);
                break L1;
              }
            }
            var2 = var14.f(param0 ^ 28154);
            var3 = (mf) (Object) wg.field_b.a((byte) 74);
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var3.field_k != var2) {
                    var3 = (mf) (Object) wg.field_b.b((byte) -115);
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var3 != null) {
                L4: {
                  var4 = var14.f(64);
                  if (0 != var4) {
                    ad.field_i[0] = ri.field_c;
                    var5 = var3.field_h;
                    var6_int = 1;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        wd.a((byte) 36, var5, var4);
                        var6_int = 0;
                        L6: while (true) {
                          if (var6_int >= var4) {
                            rf.a(-23243, var5);
                            var6 = new String[2][var5];
                            var18 = new int[2][var5 * 4];
                            var8 = ei.field_f;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var9 >= var8) {
                                var9 = 0;
                                var13 = 0;
                                var10 = var13;
                                L8: while (true) {
                                  if (var8 > var9) {
                                    L9: {
                                      var11 = re.field_c[var5 - -var9];
                                      var6[1][var13] = ad.field_i[var11];
                                      var18[1][var13 * 4] = p.field_n[var11];
                                      var18[1][1 + 4 * var13] = q.field_h[var11];
                                      var18[1][2 + 4 * var13] = mj.field_b[var11];
                                      var18[1][4 * var13 + 3] = ij.field_c[var11];
                                      if (!rc.a(true, ad.field_i[var11])) {
                                        break L9;
                                      } else {
                                        if (q.field_h[var11] - (-mj.field_b[var11] + -ij.field_c[var11]) != 0) {
                                          break L9;
                                        } else {
                                          var6[1][var13] = null;
                                          var13--;
                                          break L9;
                                        }
                                      }
                                    }
                                    var9++;
                                    var13++;
                                    continue L8;
                                  } else {
                                    var3.c(95);
                                    break L4;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = re.field_c[var9];
                                  var6[0][var10] = ad.field_i[var11];
                                  var18[0][4 * var10] = p.field_n[var11];
                                  var18[0][1 + var10 * 4] = q.field_h[var11];
                                  var18[0][2 + 4 * var10] = mj.field_b[var11];
                                  var18[0][var10 * 4 + 3] = ij.field_c[var11];
                                  if (!rc.a(true, ad.field_i[var11])) {
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              bc.a(false, (pb) (Object) var14);
                              if (var6_int == 0) {
                                a.a(sa.field_a, nl.field_b, cg.field_h, -23576, var6_int, pc.field_c);
                                break L11;
                              } else {
                                a.a(sa.field_a, nl.field_b, cg.field_h, param0 ^ 12691, var6_int, pc.field_c);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        ad.field_i[var6_int] = var14.c(false);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var3.c(95);
                    break L4;
                  }
                }
                break L0;
              } else {
                mc.a((byte) -125);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "vf.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new cc();
        field_b = -2014707693;
    }
}
