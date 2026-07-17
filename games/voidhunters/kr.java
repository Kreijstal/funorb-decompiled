/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    static String[] field_a;

    public static void a(int param0) {
        field_a = null;
        int var1 = 87 / ((-33 - param0) / 63);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = param0.getDocumentBase().getFile();
                    var3 = var2.indexOf('?');
                    if (param1 == 5836) {
                      break L1;
                    } else {
                      kr.a(-122);
                      break L1;
                    }
                  }
                  L2: {
                    var4 = "reload.ws";
                    if (var3 >= 0) {
                      var4 = var4 + var2.substring(var3);
                      break L2;
                    } else {
                      break L2;
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
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var2_ref2;
                stackOut_9_1 = new StringBuilder().append("kr.A(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, boolean param1, eab param2, java.awt.Component param3, dra param4, int param5) {
        if (param0 != -32) {
            return;
        }
        try {
            vda.a(param2, param4, param3, param1, 22050, 1024, (byte) 21, 22050);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kr.C(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + 22050 + 41);
        }
    }

    static {
    }
}
