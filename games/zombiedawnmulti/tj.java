/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static String field_d;
    static int field_c;
    static eq field_a;
    static cj field_b;
    static boolean field_f;
    static String[][] field_e;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        we var2_ref = null;
        int var3 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_10_0 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            db.field_c = param1;
            var2_ref = (we) ((Object) gb.field_e.c(72));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_ref == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2_ref.field_h.b(param0 ^ 3277);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          var2_ref.a(true);
                          break L4;
                        } else {
                          var2_ref.field_f.d(128 + var2_ref.field_m * db.field_c >> -256714680);
                          if (var3 == 0) {
                            break L4;
                          } else {
                            var2_ref.a(true);
                            break L4;
                          }
                        }
                      }
                      var2_ref = (we) ((Object) gb.field_e.b(6));
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = param0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              L5: {
                if (stackIn_11_0 == 3273) {
                  break L5;
                } else {
                  tj.a(30, 48);
                  break L5;
                }
              }
              if (null != wc.field_K) {
                var2_ref = (we) ((Object) wc.field_K.c(119));
                L6: while (true) {
                  if (var2_ref == null) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      L7: {
                        L8: {
                          if (var2_ref.field_h.b(param0 ^ 3277)) {
                            break L8;
                          } else {
                            var2_ref.a(true);
                            if (var3 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var2_ref.field_f.d(128 + db.field_c * var2_ref.field_m >> 22700296);
                        break L7;
                      }
                      var2_ref = (we) ((Object) wc.field_K.b(6));
                      continue L6;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "tj.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_e = (String[][]) null;
        field_b = null;
        if (param0) {
            tj.a(true);
        }
    }

    static {
        field_d = "Solicitation";
        field_c = -1;
        field_e = new String[][]{new String[]{"Mall", "Power Plant", "Precinct", "White House", "Random"}, new String[]{}};
    }
}
