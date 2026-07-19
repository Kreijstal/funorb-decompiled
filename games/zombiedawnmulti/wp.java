/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static bo field_b;
    static String field_d;
    static int[] field_f;
    static String field_a;
    static qd field_h;
    static ja field_e;
    static ja[] field_j;
    static int[] field_i;
    static int[] field_c;
    static di field_g;

    final static void a(int param0) {
        int fieldTemp$5 = 0;
        ga var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -10995) {
                break L1;
              } else {
                wp.c(117);
                break L1;
              }
            }
            var1 = ma.field_a;
            L2: while (true) {
              if (!so.c(1)) {
                break L0;
              } else {
                var1.b((byte) -35, 8);
                fieldTemp$5 = var1.field_j + 1;
                var1.field_j = var1.field_j + 1;
                var2 = fieldTemp$5;
                hd.a(var1, param0 + 10995);
                ma.field_a.e(param0 + 11021, var1.field_j - var2);
                if (var3 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "wp.D(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        if (param0 != 8192) {
            wp.a(90);
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_e = null;
        field_h = null;
        if (param0 != 26) {
          field_j = (ja[]) null;
          field_g = null;
          field_d = null;
          field_i = null;
          field_b = null;
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          field_i = null;
          field_b = null;
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        em.field_ab[param1][param3] = param0;
        em.field_ab[param1][1] = param2;
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        we var1 = null;
        int var1_int = 0;
        int var2 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_16_0 = 0;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                rm.field_b.a();
                ga.field_u.a();
                mn.field_p = mn.field_p - 1;
                if (mn.field_p != 0) {
                  break L2;
                } else {
                  mn.field_p = 200;
                  var1 = (we) ((Object) gb.field_e.c(75));
                  L3: while (true) {
                    L4: {
                      if (var1 == null) {
                        break L4;
                      } else {
                        stackOut_4_0 = var1.field_h.b(4);
                        stackIn_17_0 = stackOut_4_0 ? 1 : 0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var2 != 0) {
                          break L1;
                        } else {
                          L5: {
                            if (stackIn_5_0) {
                              break L5;
                            } else {
                              var1.a(true);
                              break L5;
                            }
                          }
                          var1 = (we) ((Object) gb.field_e.b(6));
                          if (var2 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (wc.field_K == null) {
                      break L2;
                    } else {
                      var1 = (we) ((Object) wc.field_K.c(51));
                      L6: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          stackOut_11_0 = var1.field_h.b(4);
                          stackIn_17_0 = stackOut_11_0 ? 1 : 0;
                          stackIn_12_0 = stackOut_11_0;
                          if (var2 != 0) {
                            break L1;
                          } else {
                            L7: {
                              if (!stackIn_12_0) {
                                var1.a(true);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var1 = (we) ((Object) wc.field_K.b(6));
                            if (var2 == 0) {
                              continue L6;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_16_0 = 107 / ((param0 - 76) / 39);
              stackIn_17_0 = stackOut_16_0;
              break L1;
            }
            L8: {
              var1_int = stackIn_17_0;
              if (wd.field_L == null) {
                break L8;
              } else {
                if (!wd.field_L.c(-119)) {
                  bb.field_g = null;
                  break L8;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "wp.A(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        field_b = new bo("email");
        field_d = "SCORE: <%0>";
        field_a = "Confuse their senses.";
        field_i = new int[8192];
        field_f = new int[256];
        for (var0 = 0; -256 < (var0 ^ -1); var0++) {
            field_f[var0] = var0 * 65793;
        }
        field_c = new int[5];
    }
}
