/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static sa field_a;
    static String field_d;
    static wm field_b;
    static int field_c;

    final static void a(int param0, byte param1) {
        te var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            bp.field_e = param0;
            var2 = (te) (Object) bl.field_h.e((byte) 110);
            L1: while (true) {
              if (var2 == null) {
                L2: {
                  if (ts.field_e != null) {
                    var2 = (te) (Object) ts.field_e.e((byte) 95);
                    L3: while (true) {
                      if (var2 == null) {
                        break L2;
                      } else {
                        L4: {
                          if (!var2.field_k.c(65280)) {
                            var2.d(47);
                            break L4;
                          } else {
                            var2.field_q.i(128 + bp.field_e * var2.field_o >> 8);
                            break L4;
                          }
                        }
                        var2 = (te) (Object) ts.field_e.a((byte) 123);
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                if (param1 < -26) {
                  break L0;
                } else {
                  field_d = null;
                  return;
                }
              } else {
                L5: {
                  if (!var2.field_k.c(65280)) {
                    var2.d(-110);
                    break L5;
                  } else {
                    var2.field_q.i(var2.field_o * bp.field_e - -128 >> 8);
                    break L5;
                  }
                }
                var2 = (te) (Object) bl.field_h.a((byte) 123);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "mh.A(" + param0 + 44 + param1 + 41);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (pg.field_d != null) {
          if (null != pg.field_d.field_g) {
            if (param1 >= -111) {
              field_b = null;
              return pg.field_d.field_g.a(param0, 127, param2);
            } else {
              return pg.field_d.field_g.a(param0, 127, param2);
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 >= -83) {
            mh.a((byte) 62);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new sa();
        field_d = "Guthix Awakens Highscores";
        field_c = 0;
    }
}
