/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class id extends ff {
    int field_C;
    static String field_x;
    static String field_A;
    int field_z;
    static ak field_B;
    int field_y;
    static int field_D;
    int field_E;

    abstract void f(byte param0);

    abstract void a(int param0, nm param1);

    final static void d(byte param0) {
        br var1 = null;
        br var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 20) {
          var1 = fd.field_M.c(49);
          L0: while (true) {
            if (!(var1 instanceof wj)) {
              var1 = qo.field_q.c(param0 ^ 68);
              L1: while (true) {
                if (!(var1 instanceof wj)) {
                  var1 = jp.field_c.c(80);
                  L2: while (true) {
                    if (!(var1 instanceof wj)) {
                      wp.b(127);
                      if (null != td.field_b) {
                        if (!wd.field_L.c(-37)) {
                          fk.a(td.field_b, true);
                          td.field_b = null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L3: {
                        var2 = var1.field_d;
                        if (((wj) (Object) var1).field_m.k()) {
                          var1.a(true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var1 = var2;
                      continue L2;
                    }
                  }
                } else {
                  L4: {
                    var2 = var1.field_d;
                    if (((wj) (Object) var1).field_m.k()) {
                      var1.a(true);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var1 = var2;
                  continue L1;
                }
              }
            } else {
              L5: {
                var2 = var1.field_d;
                if (((wj) (Object) var1).field_m.k()) {
                  var1.a(true);
                  break L5;
                } else {
                  break L5;
                }
              }
              var1 = var2;
              continue L0;
            }
          }
        } else {
          field_D = -84;
          var1 = fd.field_M.c(49);
          L6: while (true) {
            if (!(var1 instanceof wj)) {
              var1 = qo.field_q.c(param0 ^ 68);
              L7: while (true) {
                if (!(var1 instanceof wj)) {
                  var1 = jp.field_c.c(80);
                  L8: while (true) {
                    if (!(var1 instanceof wj)) {
                      L9: {
                        wp.b(127);
                        if (null == td.field_b) {
                          break L9;
                        } else {
                          if (wd.field_L.c(-37)) {
                            break L9;
                          } else {
                            fk.a(td.field_b, true);
                            td.field_b = null;
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      L10: {
                        var2 = var1.field_d;
                        if (((wj) (Object) var1).field_m.k()) {
                          var1.a(true);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var1 = var2;
                      continue L8;
                    }
                  }
                } else {
                  L11: {
                    var2 = var1.field_d;
                    if (((wj) (Object) var1).field_m.k()) {
                      var1.a(true);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var1 = var2;
                  continue L7;
                }
              }
            } else {
              L12: {
                var2 = var1.field_d;
                if (((wj) (Object) var1).field_m.k()) {
                  var1.a(true);
                  break L12;
                } else {
                  break L12;
                }
              }
              var1 = var2;
              continue L6;
            }
          }
        }
    }

    public static void e(byte param0) {
        field_B = null;
        if (param0 < 60) {
            field_x = null;
            field_x = null;
            field_A = null;
            return;
        }
        field_x = null;
        field_A = null;
    }

    final int h(int param0) {
        int var2 = 60 / ((12 - param0) / 58);
        return ((id) this).field_E >> -500960720;
    }

    final static ld a(cj param0, cj param1, byte param2, int[] param3, cj param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        ld[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        tl var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    var5 = param3.length;
                    var6 = new String[var5];
                    var14 = new char[var5];
                    var13 = var14;
                    var7 = var13;
                    var8 = new ld[var5];
                    var9 = 49;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 <= var10_int) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = bd.field_c.a(param3[var10_int], -11452);
                        var6[var10_int] = var11.e(-18572);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 == -65) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_D = -90;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 8: {
                    return new ld(0L, param0, param4, param1, var8, param3, var6, var14);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int g(int param0) {
        int var2 = -126 / ((param0 - 13) / 45);
        return ((id) this).field_z >> -735148080;
    }

    id(int param0, int param1, int param2) {
        ((id) this).field_C = param2;
        ((id) this).field_E = param1 << 1205882640;
        ((id) this).field_z = param0 << -268982768;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Unable to delete name - system busy";
        field_x = "Hide chat";
    }
}
