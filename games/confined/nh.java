/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static int field_b;
    static String field_a;

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) tf.field_a;
                    // monitorenter tf.field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ka.field_L = ka.field_L + 1;
                        Confined.field_I = pe.field_n;
                        ld.field_l = r.field_a;
                        jh.field_R = rd.field_Nb;
                        hn.field_D = th.field_cb;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 1;
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        th.field_cb = stackIn_4_0 != 0;
                        rh.field_X = sh.field_K;
                        wm.field_hb = va.field_a;
                        m.field_a = qf.field_f;
                        sh.field_K = 0;
                        b.field_f = mg.field_e;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(sf param0, int param1, int param2) {
        int var4 = 0;
        Object var5 = null;
        hb var6 = null;
        var6 = vh.field_a;
        var6.b(true, param2);
        var6.field_n = var6.field_n + 1;
        var4 = var6.field_n;
        var6.f(100, 1);
        var6.f(117, param0.field_r);
        var6.f(param1 ^ 119, param0.field_u);
        var6.d(-90, param0.field_n);
        var6.d(-99, param0.field_v);
        var6.d(-95, param0.field_m);
        var6.d(-120, param0.field_q);
        int discarded$49 = var6.e(26199, var4);
        var6.a(25859, -var4 + var6.field_n);
        if (param1 != 0) {
          var5 = null;
          nh.a((sf) null, 93, 84);
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            fg discarded$0 = nh.a((String) null, -4);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static fg a(String param0, int param1) {
        String var2 = null;
        fg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Confined.field_J ? 1 : 0;
        if (null != ij.field_t) {
          L0: {
            var6 = (CharSequence) (Object) param0;
            var2 = hh.a(param1 + param1, var6);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (String) (Object) var6;
              break L0;
            }
          }
          var3 = (fg) (Object) ij.field_t.a((long)var2.hashCode(), -1);
          L1: while (true) {
            if (var3 != null) {
              L2: {
                var7 = (CharSequence) (Object) var3.field_ob;
                var4 = hh.a(param1 + 0, var7);
                if (var4 == null) {
                  var4 = var3.field_ob;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (var4.equals((Object) (Object) var2)) {
                return var3;
              } else {
                var3 = (fg) (Object) ij.field_t.a(param1 ^ 114);
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Discard";
    }
}
