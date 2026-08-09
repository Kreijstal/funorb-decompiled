/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static he[] field_g;
    static String field_b;
    static he[] field_f;
    static String field_a;
    int[] field_h;
    bf[] field_c;
    static he[] field_e;
    static String field_d;

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            ae.a(1, pf.field_f, cc.field_B, gg.field_b, true, 0, param1);
            var3 = 77 / ((param0 - 21) / 63);
            var2_int = 0;
            L1: while (true) {
              if (gg.field_b <= var2_int) {
                L2: {
                  ae.a(1, mh.field_b, ha.field_c, gg.field_b - -param1, false, param1, param1 - -param1);
                  if (gg.field_b <= param1) {
                    break L2;
                  } else {
                    gg.field_b = param1;
                    break L2;
                  }
                }
                break L0;
              } else {
                bj.field_a[var2_int + param1] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "mk.A(" + param0 + ',' + param1 + ')');
        }
    }

    mk() {
        this.field_c = new bf[8000];
    }

    mk(byte[] param0, int param1) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        od var14 = null;
        od var15 = null;
        this.field_c = new bf[8000];
        try {
          L0: {
            L1: {
              var14 = new od(param0);
              var15 = var14;
              var4 = var15.l(31760);
              if (0 != var4) {
                break L1;
              } else {
                var5 = var15.h(-123);
                var6 = var15.h(-91);
                this.field_h = new int[var5];
                var15.n(-75);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var5) {
                    var7 = 0;
                    L3: while (true) {
                      if (var6 <= var7) {
                        break L1;
                      } else {
                        L4: {
                          var8 = var15.n(89);
                          var9 = var15.n(118);
                          var11 = var15.h(102);
                          if (param1 == 0) {
                            break L4;
                          } else {
                            L5: {
                              if ((var8 ^ -1) == -6) {
                                break L5;
                              } else {
                                if (11 == var8) {
                                  break L5;
                                } else {
                                  if ((var8 ^ -1) == -18) {
                                    break L5;
                                  } else {
                                    if (-19 == (var8 ^ -1)) {
                                      break L5;
                                    } else {
                                      if (42 != var8) {
                                        break L4;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var9 = param1;
                            break L4;
                          }
                        }
                        L6: {
                          var10 = 0;
                          var12 = var15.j(-788751192);
                          if (var8 < 0) {
                            break L6;
                          } else {
                            this.field_c[var7] = new bf(var8, var9, var10, var11, var12, false);
                            break L6;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_h[var7] = var14.j(-788751192);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("mk.<init>(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    static {
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
        field_g = new he[8];
        field_a = "Cycle weapon";
        field_d = "Creating your account";
    }
}
