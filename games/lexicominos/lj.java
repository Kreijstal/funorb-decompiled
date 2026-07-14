/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static ei field_b;
    static volatile int field_a;

    final static void a(java.applet.Applet param0, byte param1) {
        gg.a(true, param0, "");
        rf.a(20104, param0);
        if (param1 < 120) {
            field_b = null;
        }
    }

    final static void a(int param0, java.awt.Canvas param1, int param2, byte param3) {
        Exception exception = null;
        java.awt.Graphics var4 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = param1.getGraphics();
                        v.field_B.a(param0, var4, (byte) -88, param2);
                        var4.dispose();
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    exception = (Exception) (Object) caughtException;
                    param1.repaint();
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param3 >= -127) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    field_b = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static vj a(int param0, byte[] param1) {
        vj var2 = null;
        if (param1 != null) {
          var2 = new vj(param1, mg.field_x, rg.field_c, pb.field_h, bd.field_m, ci.field_b, be.field_f);
          gk.a(12428);
          if (param0 != 22076) {
            return null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
