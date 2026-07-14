/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ts {
    private qfa field_b;
    long field_c;
    static String field_a;

    final static void a(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) wj.field_q;
                    // monitorenter wj.field_q
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        hu.field_b = am.field_q;
                        rpa.field_b = rpa.field_b + 1;
                        kc.field_b = wt.field_a;
                        uia.field_b = kv.field_e;
                        upb.field_c = hda.field_a;
                        hda.field_a = false;
                        pba.field_o = ro.field_a;
                        oq.field_H = cma.field_a;
                        if (param0 == 1001) {
                            statePc = 4;
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
                        // monitorexit var1_ref
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        qs.field_a = nlb.field_p;
                        ro.field_a = 0;
                        ds.field_g = tda.field_K;
                        // monitorexit var1_ref
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
                        // monitorexit var1_ref
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

    final static void a(boolean param0, int param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param1);
        var2.c(0, 1);
        var2.c(0, 1);
        if (param0) {
            ts.a(-12);
        }
    }

    ts(qfa param0, long param1, int param2) {
        ((ts) this).field_b = param0;
        ((ts) this).field_c = param1;
    }

    final static void a(java.awt.Component param0, int param1) {
        if (param1 != 1) {
            return;
        }
        param0.addMouseListener((java.awt.event.MouseListener) (Object) wj.field_q);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wj.field_q);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) wj.field_q);
    }

    final static void a(byte param0, eab param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        if (param1.field_n == null) {
          return;
        } else {
          var3_int = 0;
          if (param0 > 55) {
            L0: while (true) {
              L1: {
                if ((var3_int ^ -1) <= -51) {
                  break L1;
                } else {
                  if (param1.field_n.peekEvent() == null) {
                    break L1;
                  } else {
                    gdb.b(-84, 1L);
                    var3_int++;
                    continue L0;
                  }
                }
              }
              try {
                L2: {
                  if (param2 != null) {
                    param1.field_n.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
              }
              var3 = (Exception) (Object) decompiledCaughtException;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 7) {
            return;
        }
        field_a = null;
    }

    protected final void finalize() throws Throwable {
        ((ts) this).field_b.a((byte) 18, ((ts) this).field_c);
        super.finalize();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Withdraw invitation to <%0> to join this game";
    }
}
