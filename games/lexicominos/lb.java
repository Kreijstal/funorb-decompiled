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
        boolean stackIn_4_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_10_0 = false;
        int stackOut_33_0 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (!ji.a((byte) -72)) {
                    break L3;
                  } else {
                    bc.field_H.a((byte) -43);
                    stackOut_3_0 = bc.field_H.b(true);
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          var1_int = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (13 == da.field_b) {
                        var2 = 1;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
                bc.field_H.a(rc.a(ef.field_a, param0 + 59719, ck.field_a), rc.a(bk.field_b, 29532, sh.field_e), param0 ^ -30202);
                stackOut_10_0 = bc.field_H.b(true);
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              L5: {
                if (stackIn_11_0) {
                  var1_int = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  L8: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L8;
                    } else {
                      if ((bc.field_H.field_d ^ -1) <= -1) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L6;
                  } else {
                    if (2 == sh.field_a) {
                      break L6;
                    } else {
                      aj.a((byte) 9);
                      if (var7 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var3 = ik.field_g[bc.field_H.field_d];
                if (2 == var3) {
                  aj.a((byte) 9);
                  break L6;
                } else {
                  if ((var3 ^ -1) != -6) {
                    break L6;
                  } else {
                    aj.a((byte) 9);
                    break L6;
                  }
                }
              }
              L9: {
                if (param0 == -30187) {
                  break L9;
                } else {
                  field_b = (String) null;
                  break L9;
                }
              }
              L10: {
                if (var3 != 0) {
                  break L10;
                } else {
                  if ((sh.field_a ^ -1) == -3) {
                    var4 = -ug.field_x + rf.c(0);
                    var6 = (int)((10999L + -var4) / 1000L);
                    if (var6 > 0) {
                      break L10;
                    } else {
                      id.a(5, true, (byte) 115);
                      var3 = 2;
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
              }
              stackOut_33_0 = var3;
              stackIn_34_0 = stackOut_33_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "lb.A(" + param0 + ')');
        }
        return stackIn_34_0;
    }

    public static void a(int param0) {
        if (param0 >= -11) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "To Customer Support";
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
