/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static qb field_a;
    static String field_c;
    static kc field_g;
    static jg[] field_d;
    static ll[] field_f;
    static no field_e;
    static String field_b;

    public static void a(int param0) {
        if (param0 == 30586) {
          field_d = null;
          field_e = null;
          field_g = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_f = null;
          return;
        }
        g.a(-51);
        field_d = null;
        field_e = null;
        field_g = null;
        field_b = null;
        field_a = null;
        field_c = null;
        field_f = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 != -10400) {
                return;
              }
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(nm.a(param0, var2, -31843), "_top");
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
            stackIn_8_1 = new StringBuilder().append("g.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Unfortunately you are not eligible to create an account.";
        field_b = "Options";
    }
}
