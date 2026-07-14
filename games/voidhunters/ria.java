/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ria extends rqa {
    final nc a(nc[] param0, int param1) {
        si.a(32, 62, param0[0].a(109));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                            param1.getAppletContext().showDocument(ne.a(var2, (byte) 118, param1), "_top");
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
                        exception.printStackTrace();
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param0 != 32) {
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
                        ria.e((byte) -84);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void e(byte param0) {
        if (param0 <= 6) {
          L0: {
            int discarded$8 = ria.a(76);
            if (uga.field_d) {
              dma.e(dma.field_d, dma.field_c, -dma.field_d + dma.field_a, -dma.field_c + dma.field_f);
              tra.field_o.b(false, -111);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (uga.field_d) {
              dma.e(dma.field_d, dma.field_c, -dma.field_d + dma.field_a, -dma.field_c + dma.field_f);
              tra.field_o.b(false, -111);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static int a(int param0) {
        if (param0 != 32) {
            int discarded$0 = ria.a(9);
            return baa.field_q;
        }
        return baa.field_q;
    }

    ria(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
