/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_k;
    static int field_d;
    static int field_h;
    static bd field_c;
    static bn field_b;
    static String field_l;
    static na field_j;
    static ql field_g;
    static String field_a;
    static int[][] field_e;
    static b field_i;
    static bd field_f;
    static String[] field_m;
    static int field_n;

    final static void b() {
        RuntimeException runtimeException = null;
        qb var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              uj.field_m.f();
              eb.field_e.f();
              de.field_n = de.field_n - 1;
              if (de.field_n == 0) {
                de.field_n = 200;
                var1 = (qb) (Object) jn.field_H.g(-38);
                L2: while (true) {
                  if (var1 == null) {
                    if (ej.field_g == null) {
                      break L1;
                    } else {
                      var1 = (qb) (Object) ej.field_g.g(-27);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_j.a(3000)) {
                              var1.b(-17);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (qb) (Object) ej.field_g.a(12684);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (!var1.field_j.a(3000)) {
                        var1.b(-41);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var1 = (qb) (Object) jn.field_H.a(12684);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (uh.field_l == null) {
                break L6;
              } else {
                if (!uh.field_l.f(323697071)) {
                  id.field_t = null;
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
          runtimeException = decompiledCaughtException;
          throw wg.a((Throwable) (Object) runtimeException, "q.C(" + 14470 + ')');
        }
    }

    public static void a() {
        field_m = null;
        field_f = null;
        field_g = null;
        field_l = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_j = null;
        field_i = null;
        field_b = null;
    }

    final static String c() {
        if (od.field_I == ti.field_b) {
            return qi.field_G;
        }
        return fc.field_y;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int discarded$0 = 50;
        int discarded$1 = 256;
        jn.a();
        field_l = "You destroyed the main reactor for this level. Activate another reactor to restore power to the lift.";
        field_i = null;
        field_a = "Find a way back to the lift.";
        field_n = 5701664;
        field_m = new String[]{"Highscores: Kerrus", "Highscores: Vengeance"};
    }
}
