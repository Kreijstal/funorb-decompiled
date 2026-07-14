/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static sj field_g;
    static String[] field_a;
    static String field_f;
    static dl field_b;
    static int[] field_c;
    static int field_d;
    static ai field_e;

    final static boolean a(int param0) {
        if (param0 != 100) {
            return false;
        }
        if (null == ne.field_f) {
            return false;
        }
        if (!ne.field_f.b(true)) {
            return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_c = null;
        field_g = null;
        field_a = null;
        if (param0 >= -70) {
            boolean discarded$0 = jl.a(110);
        }
    }

    final static void a(int param0, ng param1, byte[] param2, java.math.BigInteger param3, int param4, java.math.BigInteger param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = CrazyCrystals.field_B;
          var7 = eb.a((byte) -113, param4);
          if (null == sl.field_s) {
            sl.field_s = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[param6];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (4 <= var9) {
            if (null == ek.field_e) {
              ek.field_e = new ng(var7);
              ek.field_e.field_f = 0;
              ek.field_e.a(param0, param4, 97, param2);
              ek.field_e.b((byte) 105, var7);
              ek.field_e.a(-268435456, var15);
              if (ek.field_g == null) {
                ek.field_g = new ng(100);
                ek.field_g.field_f = 0;
                ek.field_g.a(true, 10);
                var11 = 0;
                var9 = var11;
                L2: while (true) {
                  if (-5 >= (var11 ^ -1)) {
                    ek.field_g.c(-161478600, param4);
                    ek.field_g.a(param5, param6 + -4, param3);
                    param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                    param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                    return;
                  } else {
                    ek.field_g.a(var15[var11], -16384);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                if (ek.field_g.field_h.length < 100) {
                  ek.field_g = new ng(100);
                  ek.field_g.field_f = 0;
                  ek.field_g.a(true, 10);
                  var11 = 0;
                  var9 = var11;
                  L3: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      ek.field_g.c(-161478600, param4);
                      ek.field_g.a(param5, param6 + -4, param3);
                      param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                      param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                      return;
                    } else {
                      ek.field_g.a(var15[var11], -16384);
                      var11++;
                      continue L3;
                    }
                  }
                } else {
                  ek.field_g.field_f = 0;
                  ek.field_g.a(true, 10);
                  var11 = 0;
                  var9 = var11;
                  L4: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      ek.field_g.c(-161478600, param4);
                      ek.field_g.a(param5, param6 + -4, param3);
                      param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                      param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                      return;
                    } else {
                      ek.field_g.a(var15[var11], -16384);
                      var11++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              if (ek.field_e.field_h.length >= var7) {
                ek.field_e.field_f = 0;
                ek.field_e.a(param0, param4, 97, param2);
                ek.field_e.b((byte) 105, var7);
                ek.field_e.a(-268435456, var15);
                if (ek.field_g == null) {
                  ek.field_g = new ng(100);
                  ek.field_g.field_f = 0;
                  ek.field_g.a(true, 10);
                  var11 = 0;
                  var9 = var11;
                  L5: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      ek.field_g.c(-161478600, param4);
                      ek.field_g.a(param5, param6 + -4, param3);
                      param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                      param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                      return;
                    } else {
                      ek.field_g.a(var15[var11], -16384);
                      var11++;
                      continue L5;
                    }
                  }
                } else {
                  if (ek.field_g.field_h.length < 100) {
                    ek.field_g = new ng(100);
                    ek.field_g.field_f = 0;
                    ek.field_g.a(true, 10);
                    var11 = 0;
                    var9 = var11;
                    L6: while (true) {
                      if (-5 >= (var11 ^ -1)) {
                        ek.field_g.c(-161478600, param4);
                        ek.field_g.a(param5, param6 + -4, param3);
                        param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                        param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                        return;
                      } else {
                        ek.field_g.a(var15[var11], -16384);
                        var11++;
                        continue L6;
                      }
                    }
                  } else {
                    ek.field_g.field_f = 0;
                    ek.field_g.a(true, 10);
                    var11 = 0;
                    var9 = var11;
                    L7: while (true) {
                      if (-5 >= (var11 ^ -1)) {
                        ek.field_g.c(-161478600, param4);
                        ek.field_g.a(param5, param6 + -4, param3);
                        param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                        param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                        return;
                      } else {
                        ek.field_g.a(var15[var11], -16384);
                        var11++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                ek.field_e = new ng(var7);
                ek.field_e.field_f = 0;
                ek.field_e.a(param0, param4, 97, param2);
                ek.field_e.b((byte) 105, var7);
                ek.field_e.a(-268435456, var15);
                if (ek.field_g == null) {
                  ek.field_g = new ng(100);
                  ek.field_g.field_f = 0;
                  ek.field_g.a(true, 10);
                  var11 = 0;
                  var9 = var11;
                  L8: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      ek.field_g.c(-161478600, param4);
                      ek.field_g.a(param5, param6 + -4, param3);
                      param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                      param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                      return;
                    } else {
                      ek.field_g.a(var15[var11], -16384);
                      var11++;
                      continue L8;
                    }
                  }
                } else {
                  if (ek.field_g.field_h.length < 100) {
                    ek.field_g = new ng(100);
                    ek.field_g.field_f = 0;
                    ek.field_g.a(true, 10);
                    var11 = 0;
                    var9 = var11;
                    L9: while (true) {
                      if (-5 >= (var11 ^ -1)) {
                        ek.field_g.c(-161478600, param4);
                        ek.field_g.a(param5, param6 + -4, param3);
                        param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                        param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                        return;
                      } else {
                        ek.field_g.a(var15[var11], -16384);
                        var11++;
                        continue L9;
                      }
                    }
                  } else {
                    ek.field_g.field_f = 0;
                    ek.field_g.a(true, 10);
                    var11 = 0;
                    var9 = var11;
                    L10: while (true) {
                      if (-5 >= (var11 ^ -1)) {
                        ek.field_g.c(-161478600, param4);
                        ek.field_g.a(param5, param6 + -4, param3);
                        param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                        param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                        return;
                      } else {
                        ek.field_g.a(var15[var11], -16384);
                        var11++;
                        continue L10;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var8[var9] = sl.field_s.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (fp.field_e == null) {
                            statePc = 6;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            fp.field_e.a(0L, -1);
                            fp.field_e.a(126, kd.field_n.field_h, kd.field_n.field_f, 24);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        kd.field_n.field_f = kd.field_n.field_f + 24;
                        if (param0 > 26) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        field_b = null;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        var1 = (Exception) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        kd.field_n.field_f = kd.field_n.field_f + 24;
                        if (param0 <= 26) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        field_b = null;
                        return;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new sj(6, 0, 4, 2);
        field_f = "Waiting for music";
        field_c = new int[]{5, 70, 12, 5, 25};
    }
}
