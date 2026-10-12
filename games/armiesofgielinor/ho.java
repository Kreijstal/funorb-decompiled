/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    int field_c;
    static String field_d;
    static je field_a;
    int field_b;

    final static void a(int param0) {
        int var1 = 20 % ((param0 + 6) / 45);
        ud.field_X = null;
        kr.field_C.a(123);
    }

    public final String toString() {
        return "(turnsTaken: " + this.field_b + " damageTaken: " + this.field_c + ")";
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException var2_ref = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(ck.a(-3780, var2, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param1 == -3) {
              return;
            }
            var3 = (java.applet.Applet) null;
            ho.a((java.applet.Applet) null, (byte) -10);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("ho.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 >= -113) {
          ho.a(3);
          field_d = null;
          field_a = null;
          return;
        }
        field_d = null;
        field_a = null;
    }

    ho(int param0, int param1) {
        this.field_b = param0;
        this.field_c = param1;
    }

    static {
        field_d = "Ask to join <%0>'s game";
    }
}
