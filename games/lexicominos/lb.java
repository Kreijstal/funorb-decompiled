/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_a;
    static String field_b;

    final static int b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!ji.a((byte) -72)) {
                L2: {
                  bc.field_H.a(rc.a(ef.field_a, param0 + 59719, ck.field_a), rc.a(bk.field_b, 29532, sh.field_e), param0 ^ -30202);
                  if (bc.field_H.b(true)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (bc.field_H.field_d >= 0) {
                        var3 = ik.field_g[bc.field_H.field_d];
                        if (2 == var3) {
                          aj.a((byte) 9);
                          break L3;
                        } else {
                          if (var3 != 5) {
                            break L3;
                          } else {
                            aj.a((byte) 9);
                            break L3;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (2 == sh.field_a) {
                      break L3;
                    } else {
                      aj.a((byte) 9);
                      break L3;
                    }
                  }
                }
                L5: {
                  if (param0 == -30187) {
                    break L5;
                  } else {
                    field_b = null;
                    break L5;
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (sh.field_a == 2) {
                      var4 = -ug.field_x + rf.c(0);
                      var6 = (int)((10999L + -var4) / 1000L);
                      if (var6 > 0) {
                        break L6;
                      } else {
                        id.a(5, true, (byte) 115);
                        var3 = 2;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackOut_30_0 = var3;
                stackIn_31_0 = stackOut_30_0;
                break L0;
              } else {
                L7: {
                  bc.field_H.a((byte) -43);
                  if (bc.field_H.b(true)) {
                    var1_int = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (13 == da.field_b) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "lb.A(" + param0 + ')');
        }
        return stackIn_31_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "To Customer Support";
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
