/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    static cp field_b;
    static int field_a;

    public static void b(int param0) {
        int var1 = 32 / ((-29 - param0) / 41);
        field_b = null;
    }

    final static boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_139_0 = 0;
        int var1;
        int var2;
        int var3;
        jp var4;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        int var1Lifetime3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 2) {
          var1 = 1;
          var2 = m.field_i;
          if (var2 == 0) {
            cd.field_g = vm.a(kc.field_j, "", "BaB_title_music");
            stackIn_77_0 = (null == cd.field_g) ? 0 : 1;
            var1Lifetime3 = stackIn_77_0;
          } else {
            if (1 == var2) {
              uk.field_t = vm.a(kc.field_j, "", "BaB_panic");
              stackIn_85_0 = (uk.field_t == null) ? 0 : 1;
              var1Lifetime3 = stackIn_85_0;
            } else {
              if (var2 == 2) {
                c.field_j = vm.a(kc.field_j, "", "BaB_game_completed");
                stackIn_124_0 = (null == c.field_j) ? 0 : 1;
                var1Lifetime3 = stackIn_124_0;
              } else {
                if (var2 == 3) {
                  oj.field_q = vm.a(kc.field_j, "", "BaB_podium");
                  stackIn_95_0 = (null == oj.field_q) ? 0 : 1;
                  var1Lifetime3 = stackIn_95_0;
                } else {
                  if (4 == var2) {
                    stackIn_103_0 = (!m.field_f.a(-114, cd.field_g, 22050, ic.field_a, GameScreen.field_e)) ? 0 : 1;
                    var1Lifetime3 = stackIn_103_0;
                  } else {
                    if (var2 == 5) {
                      stackIn_132_0 = (!m.field_f.a(-112, uk.field_t, 22050, ic.field_a, GameScreen.field_e)) ? 0 : 1;
                      var1Lifetime3 = stackIn_132_0;
                    } else {
                      if (6 == var2) {
                        stackIn_139_0 = (!m.field_f.a(-111, c.field_j, 22050, ic.field_a, GameScreen.field_e)) ? 0 : 1;
                        var1Lifetime3 = stackIn_139_0;
                      } else {
                        if (7 != var2) {
                          return true;
                        }
                        stackIn_116_0 = (!m.field_f.a(-123, oj.field_q, 22050, ic.field_a, GameScreen.field_e)) ? 0 : 1;
                        var1Lifetime3 = stackIn_116_0;
                      }
                    }
                  }
                }
              }
            }
          }
          if (var1Lifetime3 != 0) {
            m.field_i = m.field_i + 1;
          }
          return false;
        }
        var4 = (jp) null;
        wo.a(-99, -77, (jp) null, -107, -18, 45, 120, 4, (jp) null, (jp) null, 24);
        var1Lifetime1 = 1;
        var2Lifetime1 = m.field_i;
        if (var2Lifetime1 == 0) {
          cd.field_g = vm.a(kc.field_j, "", "BaB_title_music");
          stackIn_5_0 = (null == cd.field_g) ? 0 : 1;
          var1Lifetime2 = stackIn_5_0;
        } else {
          if (1 == var2Lifetime1) {
            uk.field_t = vm.a(kc.field_j, "", "BaB_panic");
            stackIn_13_0 = (uk.field_t == null) ? 0 : 1;
            var1Lifetime2 = stackIn_13_0;
          } else {
            if (var2Lifetime1 == 2) {
              c.field_j = vm.a(kc.field_j, "", "BaB_game_completed");
              stackIn_52_0 = (null == c.field_j) ? 0 : 1;
              var1Lifetime2 = stackIn_52_0;
            } else {
              if (var2Lifetime1 == 3) {
                oj.field_q = vm.a(kc.field_j, "", "BaB_podium");
                stackIn_23_0 = (null == oj.field_q) ? 0 : 1;
                var1Lifetime2 = stackIn_23_0;
              } else {
                if (4 == var2Lifetime1) {
                  stackIn_31_0 = (!m.field_f.a(-114, cd.field_g, 22050, ic.field_a, GameScreen.field_e)) ? 0 : 1;
                  var1Lifetime2 = stackIn_31_0;
                } else {
                  if (var2Lifetime1 == 5) {
                    stackIn_60_0 = (!m.field_f.a(-112, uk.field_t, 22050, ic.field_a, GameScreen.field_e)) ? 0 : 1;
                    var1Lifetime2 = stackIn_60_0;
                  } else {
                    if (6 == var2Lifetime1) {
                      stackIn_68_0 = (!m.field_f.a(-111, c.field_j, 22050, ic.field_a, GameScreen.field_e)) ? 0 : 1;
                      var1Lifetime2 = stackIn_68_0;
                    } else {
                      if (7 != var2Lifetime1) {
                        return true;
                      }
                      stackIn_43_0 = (!m.field_f.a(-123, oj.field_q, 22050, ic.field_a, GameScreen.field_e)) ? 0 : 1;
                      var1Lifetime2 = stackIn_43_0;
                    }
                  }
                }
              }
            }
          }
        }
        if (var1Lifetime2 != 0) {
          m.field_i = m.field_i + 1;
        }
        return false;
    }

    final static void a(int param0, int param1, jp param2, int param3, int param4, int param5, int param6, int param7, jp param8, jp param9, int param10) {
        try {
          param9.d((param4 - param9.field_x) / 2 + (param6 + (param1 * 5 >> 16)), param0);
          uq.a(param2, 5 / param7 + (10 * param1 >> 16) + ((param4 - param2.field_x) / 2 + param6), 53 / param7 - param2.field_z + (param5 + param0 + 480));
          uq.a(param8, -(5 / param7) + (param6 - (-((param4 - param8.field_x) / 2) - (param1 * 20 >> 16))), 480 - param8.field_z);
          if (param3 <= 108) {
            jp var12 = (jp) null;
            wo.a(25, -97, (jp) null, -16, -115, 10, -8, 2, (jp) null, (jp) null, -69);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wo.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ')');
        }
    }

    static {
    }
}
