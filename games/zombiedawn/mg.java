/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends le {
    static int field_j;
    int field_i;
    int field_h;

    final static void a() {
        hn var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              sh.field_d.g();
              cf.field_fb.g();
              d.field_b = d.field_b - 1;
              if (d.field_b == 0) {
                d.field_b = 200;
                var1 = (hn) (Object) fj.field_i.b((byte) 26);
                L2: while (true) {
                  if (var1 == null) {
                    if (sf.field_n == null) {
                      break L1;
                    } else {
                      var1 = (hn) (Object) sf.field_n.b((byte) 26);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_k.a((byte) 73)) {
                              var1.b(-27598);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (hn) (Object) sf.field_n.a(false);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (!var1.field_k.a((byte) 73)) {
                        var1.b(-27598);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var1 = (hn) (Object) fj.field_i.a(false);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (uh.field_o == null) {
                break L6;
              } else {
                if (uh.field_o.c((byte) -34)) {
                  break L6;
                } else {
                  te.field_kb = null;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1_ref, "mg.A(" + -120 + ')');
        }
    }

    final static void a(boolean param0) {
        se.field_j = oj.b(0);
        wo.field_xb = new dn();
        int discarded$0 = 122;
        ad.c();
    }

    private mg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 64;
    }
}
