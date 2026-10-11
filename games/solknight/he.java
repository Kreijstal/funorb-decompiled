/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static int field_b;
    static nc field_d;
    static int[] field_a;
    static String field_e;
    static hi field_c;
    static String field_f;

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        if (!param0) {
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        he.a(24, (java.applet.Applet) null);
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(int param0) {
        int var1 = -4 % ((param0 - 8) / 48);
        return !td.field_h.a(false) ? true : false;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != -1) {
                var3 = (java.applet.Applet) null;
                he.a(103, (java.applet.Applet) null);
              }
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(kk.a(122, var2, param1), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("he.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = -1;
        field_e = "LEVEL <%0><br>COMPLETE";
        field_a = new int[16384];
        field_d = new nc();
        field_f = "Use this alternative as your account name";
    }
}
