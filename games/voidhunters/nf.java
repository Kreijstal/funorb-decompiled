/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf implements dja {
    static llb field_c;
    static int field_a;
    static String field_b;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_b = null;
            return (tv[]) (Object) new pca[param1];
        }
        return (tv[]) (Object) new pca[param1];
    }

    public static void a(int param0) {
        if (param0 != 27167) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 14194) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_a = 27;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (wj.field_q != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) wj.field_q;
                    // monitorenter wj.field_q
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        wj.field_q = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static vu a(String param0, boolean param1) {
        String var2 = null;
        vu var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = VoidHunters.field_G;
        if (null != om.field_c) {
          L0: {
            var6 = (CharSequence) (Object) param0;
            var2 = jwa.a(param1, var6);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (String) (Object) var6;
              break L0;
            }
          }
          var3 = (vu) (Object) om.field_c.a(-1, (long)var2.hashCode());
          L1: while (true) {
            if (var3 != null) {
              L2: {
                var7 = (CharSequence) (Object) var3.field_Fb;
                var4 = jwa.a(param1, var7);
                if (var4 != null) {
                  break L2;
                } else {
                  var4 = var3.field_Fb;
                  break L2;
                }
              }
              if (!var4.equals((Object) (Object) var2)) {
                var3 = (vu) (Object) om.field_c.e(-88);
                continue L1;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public final tv a(byte param0) {
        int var2 = 20 / ((-64 - param0) / 50);
        return (tv) (Object) new pca();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unable to delete name - system busy";
    }
}
