/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private String field_d;
    static String field_a;
    private boolean field_c;
    private boolean field_b;

    final static void a(byte param0, int param1, wf param2, int param3, int param4) {
        param2.c(12, param0 + 47);
        param2.e(106, 17);
        param2.e(62, param3);
        param2.e(104, param1);
        param2.c(param4, -1);
        if (param0 != -48) {
            field_a = null;
        }
    }

    final String a(boolean param0) {
        if (param0) {
            ((la) this).field_d = null;
            return ((la) this).field_d;
        }
        return ((la) this).field_d;
    }

    final void a(byte param0, boolean param1) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((la) this).field_c = stackIn_3_1 != 0;
        if (param0 != 121) {
          boolean discarded$2 = ((la) this).b(10);
          ((la) this).field_b = true;
          return;
        } else {
          ((la) this).field_b = true;
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 < 118) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final boolean b(int param0) {
        if (param0 != 12) {
            boolean discarded$0 = ((la) this).b(13);
            return ((la) this).field_b;
        }
        return ((la) this).field_b;
    }

    final boolean a(int param0) {
        if (param0 != 12) {
            return true;
        }
        return ((la) this).field_c;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            if (!param1) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(gf.a(3, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    la(String param0) {
        ((la) this).field_c = false;
        ((la) this).field_b = false;
        ((la) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Connection restored.";
    }
}
