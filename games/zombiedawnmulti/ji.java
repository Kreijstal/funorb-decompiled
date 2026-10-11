/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static boolean field_c;
    static String field_d;
    static String field_e;
    static String field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 13377) {
          return;
        }
        field_e = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(gf.a(param1, true, var2), "_top");
              if (param0 == 8355711) {
                return;
              }
              field_c = true;
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
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("ji.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        al.j(-1);
        int var1 = -108 / ((param0 - 38) / 61);
        ud.field_ab = true;
        ch.field_e = true;
        nb.field_a.h(-120);
        qj.a(pn.field_i, false, 127);
    }

    static {
        field_d = "Show private chat from my friends and opponents";
        field_e = "OK";
        field_a = "Fullscreen mode";
        field_b = 0;
    }
}
