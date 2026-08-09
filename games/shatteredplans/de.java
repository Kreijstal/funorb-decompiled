/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends oh {
    String field_l;
    static String field_k;
    static int field_j;
    static String field_h;
    static int field_i;

    public static void a(byte param0) {
        field_h = null;
        field_k = null;
        if (param0 != 102) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            de.a(62, (java.applet.Applet) null);
        }
    }

    de(String param0) {
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "de.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException var2_ref = null;
            java.applet.Applet var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                    param1.getAppletContext().showDocument(jg.a(param1, false, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param0 > 107) {
                  break L0;
                } else {
                  var3 = (java.applet.Applet) null;
                  de.a(-3, (java.applet.Applet) null);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("de.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_i = 250;
        field_k = "Animations speed is double. Click to halve.";
    }
}
