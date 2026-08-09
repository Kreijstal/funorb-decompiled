/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static o field_a;

    final static void b(int param0) {
        ud var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        var2 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              kj.field_P.b();
              ql.field_r.b();
              vg.field_M = vg.field_M - 1;
              if (param0 == 200) {
                break L1;
              } else {
                ja.a((byte) -48);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (vg.field_M == 0) {
                    vg.field_M = 200;
                    var1 = (ud) ((Object) uc.field_j.a((byte) 51));
                    L5: while (true) {
                      L6: {
                        if (var1 == null) {
                          break L6;
                        } else {
                          stackIn_20_0 = var1.field_m.a(false);

                          if (var2 != 0) {
                            break L3;
                          } else {
                            L7: {
                              if (stackIn_20_0) {
                                break L7;
                              } else {
                                var1.c(param0 ^ 194);
                                break L7;
                              }
                            }
                            var1 = (ud) ((Object) uc.field_j.b(-105));
                            if (var2 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (null == la.field_j) {
                        break L4;
                      } else {
                        var1 = (ud) ((Object) la.field_j.a((byte) 51));
                        L8: while (true) {
                          if (var1 == null) {
                            break L4;
                          } else {
                            stackIn_20_0 = var1.field_m.a(false);

                            if (var2 != 0) {
                              break L3;
                            } else {
                              L9: {
                                if (stackIn_20_0) {
                                  break L9;
                                } else {
                                  var1.c(10);
                                  break L9;
                                }
                              }
                              var1 = (ud) ((Object) la.field_j.b(-46));
                              if (var2 == 0) {
                                continue L8;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                if (null == ua.field_I) {
                  break L2;
                } else {
                  stackIn_20_0 = ua.field_I.d(144);
                  break L3;
                }
              }
              if (stackIn_20_0) {
                break L2;
              } else {
                dj.field_j = null;
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "ja.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2) {
        if (param2 != -41) {
            return;
        }
        ql.field_v = param0;
        ch.field_b = param1;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -43) {
            ja.b(70);
        }
    }

    final static void a(int param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = md.field_t;
                        var1 = var5;
                        var2 = param0;
                        var3 = var5.length;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 >= var3) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$8 = var2;
                        var2++;
                        var5[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var5[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var5[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var5[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var5[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var5[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var5[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var5[incrementValue$15] = 0;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var1_ref), "ja.D(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
