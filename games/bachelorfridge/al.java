/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int field_a;
    private Object field_b;

    final hs a(int param0) {
        IllegalAccessException var2 = null;
        java.lang.reflect.InvocationTargetException var2_ref = null;
        Object var3 = null;
        hs stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        hs stackOut_2_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!(((al) this).field_b instanceof hs)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (hs) ((al) this).field_b;
                }
                case 2: {
                    try {
                        var3 = null;
                        stackOut_2_0 = (hs) vb.field_n.invoke(((al) this).field_b, (Object[]) null);
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IllegalAccessException ? 4 : 5);
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (hs) (Object) stackIn_3_0;
                }
                case 4: {
                    var2 = (IllegalAccessException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    var2_ref = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param0 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    oha discarded$2 = al.a(-107, -17);
                    return null;
                }
                case 8: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    al(hs param0) {
        IllegalAccessException var2 = null;
        java.lang.reflect.InvocationTargetException var2_ref = null;
        InstantiationException var2_ref2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((al) this).field_b = (Object) (Object) param0;
                    if (null == vb.field_g) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    lv.field_m[0] = (Object) (Object) param0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        ((al) this).field_b = vb.field_g.newInstance(lv.field_m);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IllegalAccessException ? 4 : (stateCaught_2 instanceof java.lang.reflect.InvocationTargetException ? 5 : 6));
                        continue stateLoop;
                    }
                }
                case 3: {
                }
                case 4: {
                    var2 = (IllegalAccessException) (Object) caughtException;
                }
                case 5: {
                    var2_ref = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                }
                case 6: {
                    var2_ref2 = (InstantiationException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        if (param0 != -18073) {
            return;
        }
        eha.field_s = null;
        baa.field_P = null;
        fd.field_D = null;
        hk.field_f = null;
        lq.field_A = null;
        fl.field_j = null;
    }

    final static oha a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = -33 % ((param0 - 28) / 58);
        var3 = 0;
        L0: while (true) {
          if (ur.field_e.length > var3) {
            if (null == ur.field_e[var3]) {
              var3++;
              var3++;
              var3++;
              continue L0;
            } else {
              if (param1 == ur.field_e[var3].field_j) {
                return ur.field_e[var3];
              } else {
                var3++;
                var3++;
                continue L0;
              }
            }
          } else {
            return null;
          }
        }
    }

    static {
    }
}
