/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static String field_b;
    static int[] field_a;
    static kr field_c;

    final static void a(int param0, int param1, int param2, boolean param3, si param4) {
        fk stackIn_1_0 = null;
        si stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        fk stackIn_2_0 = null;
        si stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        fk stackIn_3_0 = null;
        si stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        fk stackOut_0_0 = null;
        si stackOut_0_1 = null;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        fk stackOut_2_0 = null;
        si stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        fk stackOut_1_0 = null;
        si stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        L0: {
          stackOut_0_0 = jp.field_n;
          stackOut_0_1 = (si) param4;
          stackOut_0_2 = param2;
          stackOut_0_3 = 1000000;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (param3) {
            stackOut_2_0 = (fk) (Object) stackIn_2_0;
            stackOut_2_1 = (si) (Object) stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (fk) (Object) stackIn_1_0;
            stackOut_1_1 = (si) (Object) stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        ((fk) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, (byte) 75, param1);
        if (param0 != -1) {
          field_b = null;
          return;
        } else {
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            Exception exception = null;
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = param0.getDocumentBase().getFile();
                            var3 = var2.indexOf('?');
                            var4 = "reload.ws";
                            if (-1 >= (var3 ^ -1)) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var4 = var4 + var2.substring(var3);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = new java.net.URL(param0.getCodeBase(), var4);
                            param0.getAppletContext().showDocument(ar.a(param0, var5, 0), "_self");
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        exception = (Exception) (Object) caughtException;
                        exception.printStackTrace();
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param1 != 1000000) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        field_b = null;
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

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1000000) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You appear to be telling someone your password - please don't!";
    }
}
