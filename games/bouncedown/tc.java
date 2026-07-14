/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tc extends jd {
    static we[] field_s;
    static boolean field_t;
    static String field_q;
    static int[] field_r;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(ag.a(param0, var2, false), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              exception = (Exception) (Object) decompiledCaughtException;
              exception.printStackTrace();
            }
            if (param1 != 6091) {
              tc.a(true);
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    tc(int param0) {
        this(sg.field_a, param0);
    }

    public static void a(boolean param0) {
        field_q = null;
        field_s = null;
        if (param0) {
            field_q = null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    tc(tj param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_s, -1, 2147483647, false);
    }

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        int var6 = 0;
        var6 = 105 % ((-60 - param2) / 56);
        if (param3) {
          dh.a(param1.field_i + param0, 1232050056, param1.field_k, param4 + param1.field_r, param1.field_m);
          super.a(param0, param1, (byte) -125, param3, param4);
          return;
        } else {
          super.a(param0, param1, (byte) -125, param3, param4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "You are not currently logged in to the<nbsp>game.";
        field_r = new int[4];
    }
}
