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
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var3 = var2.indexOf('?');
              if (param1 != 5836) {
                kr.a(-122);
              }
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4);
              param0.getAppletContext().showDocument(ne.a(var5, (byte) 113, param0), "_self");
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
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("kr.A(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
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
          vda.a(param2, param4, param3, param1, param5, 1024, (byte) 21, param5);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "kr.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
    }
}
