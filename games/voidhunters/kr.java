/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    static String[] field_a;

    public static void a() {
        field_a = null;
        int var1 = 87;
    }

    final static void a(java.applet.Applet param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = param0.getDocumentBase().getFile();
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (var3 >= 0) {
                      var4 = var4 + var2.substring(var3);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var5 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(ne.a(var5, (byte) 113, param0), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var2_ref2;
                stackOut_7_1 = new StringBuilder().append("kr.A(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L2;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + 5836 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, boolean param1, eab param2, java.awt.Component param3, dra param4) {
        try {
            int discarded$0 = 22050;
            int discarded$1 = 21;
            int discarded$2 = 1024;
            int discarded$3 = 22050;
            int discarded$4 = 1;
            vda.a(param2, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kr.C(" + -32 + ',' + true + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + 22050 + ')');
        }
    }

    static {
    }
}
