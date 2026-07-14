/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends ae {
    private int field_j;
    private int field_i;

    final void a(int param0, boolean param1, int param2, int param3) {
        wb var5 = null;
        Exception var5_ref = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var5 = op.field_m.a(((pc) this).field_i, false);
                        ah.field_e.c(Integer.toString(((pc) this).field_f - param3), var5.g(-41) - param2, -param0 + var5.h(76), 4, -1);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    var5_ref = (Exception) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (param1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((pc) this).field_j = -25;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = (wb) (Object) op.field_m.a(((pc) this).field_i, 105);
                        ah.field_e.c(Integer.toString(((pc) this).field_f + -param3), ((gm) (Object) var5).g(81) + -param2, -param0 + ((gm) (Object) var5).h(87), 4, -1);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var5_ref = (Exception) (Object) caughtException;
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

    final static byte[] a(String param0, byte param1) {
        if (param1 != 83) {
            return null;
        }
        return mk.field_b.a("", param0, false);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        super.a(0, param3);
        ((pc) this).field_j = param1;
        if (param2) {
            return;
        }
        ((pc) this).field_i = param0;
    }

    final void a(int param0, qd param1) {
        param1.c((byte) 118, ((pc) this).field_j, ((pc) this).field_i);
        if (param0 != 0) {
            ((pc) this).field_j = -79;
        }
    }

    final void a(byte param0) {
        if (param0 >= -47) {
          ((pc) this).field_j = -37;
          super.a((byte) -86);
          a.field_c.a((br) this, false);
          return;
        } else {
          super.a((byte) -86);
          a.field_c.a((br) this, false);
          return;
        }
    }

    pc() {
    }

    static {
    }
}
