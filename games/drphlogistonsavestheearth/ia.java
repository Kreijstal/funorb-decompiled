/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static int field_c;
    static gk field_a;
    static String field_b;

    final static void a(byte param0) {
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
              if (param0 >= 4) {
                break L1;
              } else {
                field_c = -62;
                break L1;
              }
            }
            L2: {
              if (-1 != (vb.field_k ^ -1)) {
                break L2;
              } else {
                vb.field_k = 200;
                var1 = (ml) ((Object) ff.field_O.h(-11151));
                L3: while (true) {
                  if (var1 == null) {
                    break L2;
                  } else {
                    L4: {
                      if (var1.field_o.c(-1387)) {
                        break L4;
                      } else {
                        var1.a(-16175);
                        break L4;
                      }
                    }
                    var1 = (ml) ((Object) ff.field_O.e(0));
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1_ref), "ia.D(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 27174) {
            ia.a((byte) 30);
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = pj.field_G;
        synchronized (var1) {
          L0: {
            db.field_a = tf.field_mb;
            th.field_e = th.field_e + 1;
            ck.field_c = e.field_q;
            ob.field_g = mj.field_u;
            var2 = -96 / ((27 - param0) / 56);
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
        if (param1 != 0) {
            return;
        }
        try {
            di.field_d = param3;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ia.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = "Waiting for extra data";
    }
}
