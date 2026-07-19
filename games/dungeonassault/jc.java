/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static java.awt.Color field_d;
    static String field_b;
    static int[] field_f;
    static cn field_c;
    static int field_e;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var6_int = wh.field_g.field_d;
              if (param3 == param4) {
                param2 = param2 + var6_int;
                param0 = param0 - var6_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              jh.c();
              if (2 == param5) {
                param0 = param0 - var6_int;
                break L2;
              } else {
                break L2;
              }
            }
            gf.e(param1, param2, 8 + param1, param0 + param2);
            var7 = 0;
            L3: while (true) {
              if (var7 >= param0) {
                L4: {
                  jh.b();
                  if (2 == param3) {
                    ac.field_w.j(param1, -var6_int + param2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((param5 ^ -1) == -3) {
                    ac.field_w.h(param1, param0 + param2);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (1 != param3) {
                    break L6;
                  } else {
                    var7 = 0;
                    L7: while (true) {
                      if (8 <= var7) {
                        break L6;
                      } else {
                        gf.d(param1, var7 + param2, 8, 0, -(var7 * 24) + 192);
                        var7++;
                        continue L7;
                      }
                    }
                  }
                }
                if (1 == param5) {
                  var7 = 0;
                  L8: while (true) {
                    if (-9 >= (var7 ^ -1)) {
                      break L0;
                    } else {
                      gf.d(param1, param2 + (param0 - 1) - var7, 8, 0, 192 - var7 * 24);
                      var7++;
                      continue L8;
                    }
                  }
                } else {
                  return;
                }
              } else {
                be.field_o.b(param1, param2 - -var7);
                var7 = var7 + be.field_o.field_b;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var6), "jc.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var2 = 82 % ((-4 - param1) / 40);
        if (param0 != 160) {
          if (32 != param0) {
            if (param0 != 95) {
              if (param0 == 45) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
            field_c = (cn) null;
        }
    }

    static {
        field_b = "<col=8B8B2E>Flee</col> - Attempt to avoid combat";
        field_d = new java.awt.Color(10040319);
        field_e = 0;
        field_a = "Renown lost: ";
    }
}
