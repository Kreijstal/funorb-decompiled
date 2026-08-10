/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static o field_a;

    final static void b(int param0) {
        ud var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
              if (vg.field_M == 0) {
                vg.field_M = 200;
                var1 = (ud) ((Object) uc.field_j.a((byte) 51));
                L3: while (true) {
                  if (var1 == null) {
                    if (null == la.field_j) {
                      break L2;
                    } else {
                      var1 = (ud) ((Object) la.field_j.a((byte) 51));
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (var1.field_m.a(false)) {
                              break L5;
                            } else {
                              var1.c(10);
                              break L5;
                            }
                          }
                          var1 = (ud) ((Object) la.field_j.b(-46));
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L6: {
                      if (var1.field_m.a(false)) {
                        break L6;
                      } else {
                        var1.c(param0 ^ 194);
                        break L6;
                      }
                    }
                    var1 = (ud) ((Object) uc.field_j.b(-105));
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (null == ua.field_I) {
                break L7;
              } else {
                stackIn_20_0 = ua.field_I.d(144);
                if (stackIn_20_0) {
                  break L7;
                } else {
                  dj.field_j = null;
                  return;
                }
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
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5 = md.field_t;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "ja.D(" + param0 + ')');
        }
    }

    static {
    }
}
