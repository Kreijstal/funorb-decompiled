/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    final static void a() {
        RuntimeException runtimeException = null;
        int var2 = 0;
        pha var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qa.field_o = false;
            uu.field_a = null;
            ifa.field_n = null;
            L1: {
              if (null == uma.field_b) {
                break L1;
              } else {
                uma.field_b.d(8);
                uma.field_b = null;
                break L1;
              }
            }
            L2: {
              fua.field_a = null;
              if (asa.field_j == null) {
                break L2;
              } else {
                asa.field_j.d(8);
                asa.field_j = null;
                break L2;
              }
            }
            L3: {
              jb.field_K = null;
              if (null != qha.field_g) {
                qha.field_g.d(8);
                qha.field_g = null;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              tc.field_d = null;
              if (fua.field_a == null) {
                break L4;
              } else {
                var3 = (pha) (Object) fua.field_a.b(-91);
                L5: while (true) {
                  if (var3 == null) {
                    fua.field_a = null;
                    break L4;
                  } else {
                    var3.c(-7975);
                    var3 = (pha) (Object) fua.field_a.a((byte) -112);
                    continue L5;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "ig.B(" + -125 + ')');
        }
    }

    final static void a(int param0, od param1, od param2) {
        try {
            if (null != param1.field_f) {
                param1.c(-7975);
            }
            int var3_int = 0;
            param1.field_g = param2.field_g;
            param1.field_f = param2;
            param1.field_f.field_g = param1;
            param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ig.A(" + 31 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
