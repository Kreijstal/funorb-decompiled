/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static String field_e;
    static qc field_d;
    static dm[] field_g;
    static double field_a;
    static dm[] field_b;
    static volatile boolean field_f;
    static int field_c;

    final static void a(int param0) {
        RuntimeException var1 = null;
        ja var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            pf.field_D = true;
            var1_ref = (ja) (Object) a.field_d.g(0);
            L1: while (true) {
              if (var1_ref == null) {
                var2 = 0;
                var1_ref = (ja) (Object) bh.field_c.g(0);
                L2: while (true) {
                  if (var1_ref == null) {
                    break L0;
                  } else {
                    L3: {
                      L4: {
                        var1_ref.b(true);
                        if (5 == var1_ref.field_z) {
                          break L4;
                        } else {
                          if (var1_ref.field_z == 7) {
                            break L4;
                          } else {
                            if (var1_ref.field_z == 8) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      pf.field_D = false;
                      if (var1_ref.field_G < 3) {
                        break L3;
                      } else {
                        ra.field_a.a(-115, (hf) (Object) var1_ref);
                        break L3;
                      }
                    }
                    var1_ref = (ja) (Object) bh.field_c.d(1);
                    continue L2;
                  }
                }
              } else {
                L5: {
                  var1_ref.b(true);
                  if (6 == var1_ref.field_z) {
                    pf.field_D = false;
                    if (var1_ref.field_G < 3) {
                      break L5;
                    } else {
                      ra.field_a.a(-67, (hf) (Object) var1_ref);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var1_ref = (ja) (Object) a.field_d.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "fc.B(" + 19 + 41);
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (!(hj.field_a != 11)) {
            w.a(31);
        }
        try {
            int discarded$0 = -40;
            qc.a(pb.field_s, oi.field_e, lb.field_a);
            int discarded$1 = 0;
            i.a(0, (byte) 117, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "fc.A(" + 1 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_g = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Music: ";
        field_d = new qc(256);
        field_a = 0.0;
        field_f = false;
    }
}
