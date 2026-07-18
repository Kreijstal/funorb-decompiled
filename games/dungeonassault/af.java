/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static String field_a;

    final static void a(boolean param0, tc param1, int param2, int param3, java.awt.Component param4, int param5, int param6, qg param7) {
        try {
            vn.a(22050, true, 10);
            int var8_int = 0;
            ub.field_n = vn.a(param7, param4, 0, 22050);
            hm.field_n = vn.a(param7, param4, 1, 2048);
            wa.field_j = new mb();
            kc.field_U = 2048;
            hm.field_n.a((qb) (Object) wa.field_j);
            ek.field_b = param1;
            ek.field_b.a(ql.field_d, 256);
            ub.field_n.a((qb) (Object) ek.field_b);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "af.A(" + true + ',' + (param1 != null ? "{...}" : "null") + ',' + 22050 + ',' + 22050 + ',' + (param4 != null ? "{...}" : "null") + ',' + -126 + ',' + 2048 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            if (co.field_G != null) {
              L1: {
                co.field_G = null;
                bd.field_f = 0;
                if (param0 >= 5) {
                  break L1;
                } else {
                  af.a(37);
                  break L1;
                }
              }
              L2: {
                if (!gh.field_f) {
                  break L2;
                } else {
                  ik.field_e.c();
                  gh.field_f = false;
                  nf.field_A = false;
                  ik.field_e = null;
                  break L2;
                }
              }
              L3: {
                if (!wa.field_a) {
                  break L3;
                } else {
                  ll.field_i = new md();
                  var4 = gj.field_c;
                  var1 = var4;
                  var2 = 0;
                  L4: while (true) {
                    if (var2 >= 8) {
                      var5 = bp.field_e;
                      var1 = var5;
                      var6 = 0;
                      var2 = var6;
                      L5: while (true) {
                        if (var6 >= 8) {
                          wa.field_a = false;
                          break L3;
                        } else {
                          var5[var6] = 0;
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      var4[var2] = 0;
                      var2++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "af.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Monster";
    }
}
