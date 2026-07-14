/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static int field_a;
    static mh field_b;
    static String field_d;
    static jp[] field_c;

    final static kn b(int param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        kn var2 = null;
        int var3 = 0;
        kn stackIn_4_0 = null;
        kn stackOut_3_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = param0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = pj.field_c.a(var1_int, (byte) -97);
                        if (!var2.field_A) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = (kn) var2;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return (kn) (Object) stackIn_4_0;
                }
                case 5: {
                    try {
                        var1_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var1 = (IllegalArgumentException) (Object) caughtException;
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(eg param0, sp param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = BrickABrac.field_J ? 1 : 0;
          if (param0 == null) {
            break L0;
          } else {
            if (param0.field_n == null) {
              break L0;
            } else {
              if (param1 == null) {
                break L0;
              } else {
                if (param1.field_o == param0.field_l) {
                  var4 = param1.field_i.length;
                  var5 = param0.field_n[param3].length / var4;
                  var6 = 0;
                  L1: while (true) {
                    if (var5 <= var6) {
                      var6 = 127 / ((param2 - 59) / 36);
                      return -1;
                    } else {
                      if (param1.field_p == param0.field_r[param3][var6]) {
                        if (ci.a(param0.field_i[param3][var6], -46)) {
                          var7 = 0;
                          L2: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (param1.field_i[var7] == param0.field_n[param3][var7 + var4 * var6]) {
                                var6 = var6;
                                var7++;
                                continue L2;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -27956) {
            field_c = null;
        }
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Tutorial: <%0>";
    }
}
