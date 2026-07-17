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
              int discarded$9 = 1;
              if (!so.c()) {
                break L0;
              } else {
                var1.b((byte) -35, 8);
                int fieldTemp$10 = var1.field_j + 1;
                var1.field_j = var1.field_j + 1;
                var2 = fieldTemp$10;
                hd.a(var1, param0 + 10995);
                ma.field_a.e(param0 + 11021, var1.field_j - var2);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "wp.D(" + param0 + 41);
        }
    }

    final static void c(int param0) {
        if (param0 != 8192) {
            wp.a(90);
        }
    }

    public static void a() {
        field_j = null;
        field_e = null;
        field_h = null;
        field_g = null;
        field_d = null;
        field_i = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2) {
        em.field_ab[param1][0] = param0;
        em.field_ab[param1][1] = param2;
    }

    final static void b() {
        we var1 = null;
        RuntimeException var1_ref = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              rm.field_b.a();
              ga.field_u.a();
              mn.field_p = mn.field_p - 1;
              if (mn.field_p != 0) {
                break L1;
              } else {
                mn.field_p = 200;
                var1 = (we) (Object) gb.field_e.c(75);
                L2: while (true) {
                  if (var1 == null) {
                    if (wc.field_K == null) {
                      break L1;
                    } else {
                      var1 = (we) (Object) wc.field_K.c(51);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_h.b(4)) {
                              var1.a(true);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (we) (Object) wc.field_K.b(6);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (var1.field_h.b(4)) {
                        break L5;
                      } else {
                        var1.a(true);
                        break L5;
                      }
                    }
                    var1 = (we) (Object) gb.field_e.b(6);
                    continue L2;
                  }
                }
              }
            }
            L6: {
              var1_int = 107;
              if (wd.field_L == null) {
                break L6;
              } else {
                if (!wd.field_L.c(-119)) {
                  bb.field_g = null;
                  break L6;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "wp.A(" + 127 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_b = new bo("email");
        field_d = "SCORE: <%0>";
        field_a = "Confuse their senses.";
        field_i = new int[8192];
        field_f = new int[256];
        for (var0 = 0; var0 < 255; var0++) {
            field_f[var0] = var0 * 65793;
        }
        field_c = new int[5];
    }
}
