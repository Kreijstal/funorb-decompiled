/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ah {
    static String[] field_n;
    private ul field_o;

    public static void g(int param0) {
        if (param0 != -17318) {
            return;
        }
        field_n = null;
    }

    final String a(byte param0, String param1) {
        el var3_ref = null;
        if (!(!(((lb) this).field_o instanceof og))) {
            var3_ref = ((og) (Object) ((lb) this).field_o).a((byte) -89);
            if (var3_ref != null) {
                if (var3_ref.a(17124) == df.field_h) {
                    if (!(param1.equals((Object) (Object) ((lb) this).field_o.field_l))) {
                        return me.field_n;
                    }
                }
                return var3_ref.b(54);
            }
        }
        int var3 = 126 % ((10 - param0) / 51);
        if (param1.equals((Object) (Object) ((lb) this).field_o.field_l)) {
            return null;
        }
        return me.field_n;
    }

    final rf a(int param0, String param1) {
        el var3 = null;
        if (param0 != -1) {
            field_n = null;
        }
        if (((lb) this).field_o instanceof og) {
            var3 = ((og) (Object) ((lb) this).field_o).a((byte) -89);
            if (var3 != null) {
                if (var3.a(17124) != df.field_h) {
                    return ob.field_a;
                }
            }
        }
        return !param1.equals((Object) (Object) ((lb) this).field_o.field_l) ? ob.field_a : df.field_h;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static boolean b(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = EscapeVector.field_A;
          if (param0 <= -1) {
            break L0;
          } else {
            field_n = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= param1.length()) {
            return false;
          } else {
            var3 = param1.charAt(var2);
            if (!of.a((char) var3, (byte) 103)) {
              if (!on.a((char) var3, false)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    lb(ul param0, ul param1) {
        super(param0);
        ((lb) this).field_o = param1;
    }

    final static void c(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (om.field_b == null) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) om.field_b;
                    // monitorenter om.field_b
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        om.field_b = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var2;
                }
                case 6: {
                    if (param0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_n = null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0, String param1) {
        p.field_i = param1;
        if (param0 != -10002) {
            field_n = null;
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4) {
        mj.field_b.g();
        em.d();
        fh.field_g.c(param1, 160, 22, param2, -1);
        md.field_D.a(122);
        cf.a(mj.field_b, true, 1);
        if (param3 > -109) {
            return;
        }
        mj.field_b.h(5267536);
        mj.field_b.e(param4 - 160, -22 + param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
