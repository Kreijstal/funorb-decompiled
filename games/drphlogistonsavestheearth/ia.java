/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static int field_c;
    static gk field_a;
    static String field_b;

    final static void a() {
        ml var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              el.field_sb.a();
              k.field_J.a();
              vb.field_k = vb.field_k - 1;
              if (vb.field_k != 0) {
                break L1;
              } else {
                vb.field_k = 200;
                var1 = (ml) (Object) ff.field_O.h(-11151);
                L2: while (true) {
                  if (var1 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var1.field_o.c(-1387)) {
                        break L3;
                      } else {
                        var1.a(-16175);
                        break L3;
                      }
                    }
                    var1 = (ml) (Object) ff.field_O.e(0);
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1_ref, "ia.D(" + 9 + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b() {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) pj.field_G;
        synchronized (var1) {
          L0: {
            db.field_a = tf.field_mb;
            th.field_e = th.field_e + 1;
            ck.field_c = e.field_q;
            ob.field_g = mj.field_u;
            var2 = -48;
            df.field_o = lk.field_j;
            lk.field_j = false;
            mh.field_f = f.field_h;
            ae.field_gb = ee.field_d;
            ih.field_R = fj.field_j;
            f.field_h = 0;
            break L0;
          }
        }
    }

    final static void a(gk param0, int param1, int param2, int param3) {
        df.field_h = param2;
        cb.field_a = param0;
        try {
            di.field_d = param3;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ia.C(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for extra data";
    }
}
