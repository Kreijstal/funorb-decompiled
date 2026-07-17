/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends l {
    int[] field_h;
    static int field_j;
    static int field_k;
    boolean field_l;
    static int field_m;
    static volatile int field_i;
    int field_g;
    static String field_n;

    final static void a(int param0) {
        if (!oi.field_d) {
            throw new IllegalStateException();
        }
        pg.field_h = true;
        j.a(false, -125);
        j.field_l = 0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 <= param6) {
              return;
            } else {
              if (param6 - -1 >= param3) {
                return;
              } else {
                L1: {
                  if (5 + param6 >= param3) {
                    break L1;
                  } else {
                    if (param4 == param0) {
                      break L1;
                    } else {
                      var7_int = (1 & (param4 & param0)) + ((param4 >> 1) + (param0 >> 1));
                      var8 = param6;
                      var9 = param0;
                      var10 = param4;
                      var11 = param6;
                      L2: while (true) {
                        if (var11 >= param3) {
                          ka.a(param0, param1, param2, var8, var9, param5 + param5, param6);
                          ka.a(var10, param1, param2, param3, param4, 0, var8);
                          break L0;
                        } else {
                          L3: {
                            var12 = lk.field_Tb[var11];
                            if (!param2) {
                              stackOut_23_0 = vl.field_i[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = wh.field_c[var12];
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var7_int < var13) {
                              lk.field_Tb[var11] = lk.field_Tb[var8];
                              int incrementValue$1 = var8;
                              var8++;
                              lk.field_Tb[incrementValue$1] = var12;
                              if (var13 < var9) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param3;
                L5: while (true) {
                  if (param6 >= var7_int) {
                    return;
                  } else {
                    var8 = param6;
                    L6: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = lk.field_Tb[var8];
                          var10 = lk.field_Tb[1 + var8];
                          if (!bd.a(param5 ^ 3005, param2, var9, var10)) {
                            break L7;
                          } else {
                            lk.field_Tb[var8] = var10;
                            lk.field_Tb[1 + var8] = var9;
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var7, "ka.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static void a(boolean param0, byte param1) {
        gb.field_H = new jf(bc.field_c);
        ln.field_g = -1;
        gb.field_H.field_d = gb.field_H.field_d | param0;
    }

    public static void c(int param0) {
        int var1 = 9;
        field_n = null;
    }

    ka() {
        ((ka) this).field_l = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
        field_n = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
