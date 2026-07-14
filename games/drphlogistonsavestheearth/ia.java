/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static int field_c;
    static gk field_a;
    static String field_b;

    final static void a(byte param0) {
        ml var1 = null;
        int var2 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        el.field_sb.a();
        k.field_J.a();
        vb.field_k = vb.field_k - 1;
        if (param0 >= 4) {
          if (-1 == (vb.field_k ^ -1)) {
            vb.field_k = 200;
            var1 = (ml) (Object) ff.field_O.h(-11151);
            L0: while (true) {
              if (var1 != null) {
                L1: {
                  if (var1.field_o.c(-1387)) {
                    break L1;
                  } else {
                    var1.a(-16175);
                    break L1;
                  }
                }
                var1 = (ml) (Object) ff.field_O.e(0);
                continue L0;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          field_c = -62;
          if (-1 == (vb.field_k ^ -1)) {
            vb.field_k = 200;
            var1 = (ml) (Object) ff.field_O.h(-11151);
            L2: while (true) {
              if (var1 != null) {
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
              } else {
                return;
              }
            }
          } else {
            return;
          }
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) pj.field_G;
                    // monitorenter pj.field_G
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
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
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(gk param0, int param1, int param2, int param3) {
        df.field_h = param2;
        cb.field_a = param0;
        if (param1 != 0) {
            return;
        }
        di.field_d = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for extra data";
    }
}
