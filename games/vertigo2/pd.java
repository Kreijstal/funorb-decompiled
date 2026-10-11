/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static String field_b;
    static int[] field_a;
    static kr field_c;

    final static void a(int param0, int param1, int param2, boolean param3, si param4) {
        RuntimeException var5 = null;
        fk stackIn_2_0;
        si stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        boolean stackIn_3_4 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = jp.field_n;
          stackIn_2_1 = (si) (param4);
          stackIn_2_2 = param2;
          stackIn_2_3 = 1000000;
          stackIn_3_4 = !(param3);
          ((fk) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4, (byte) 75, param1);
          if (param0 == -1) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          RuntimeException var2_ref = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref2 = null;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var3 = var2.indexOf('?');
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4);
              param0.getAppletContext().showDocument(ar.a(param0, var5, 0), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param1 == 1000000) {
              return;
            }
            field_b = (String) null;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref;
            stackIn_11_1 = new StringBuilder().append("pd.A(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1000000) {
          return;
        }
        field_c = null;
    }

    static {
        field_b = "You appear to be telling someone your password - please don't!";
    }
}
