/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private String field_d;
    static String field_a;
    private boolean field_c;
    private boolean field_b;

    final static void a(byte param0, int param1, wf param2, int param3, int param4) {
        try {
          param2.c(12, param0 + 47);
          param2.e(106, 17);
          param2.e(62, param3);
          param2.e(104, param1);
          param2.c(param4, -1);
          if (param0 != -48) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "la.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(boolean param0) {
        if (param0) {
          this.field_d = (String) null;
          return this.field_d;
        }
        return this.field_d;
    }

    final void a(byte param0, boolean param1) {
        this.field_c = param1 ? true : false;
        if (param0 == 121) {
          this.field_b = true;
          return;
        }
        this.b(10);
        this.field_b = true;
    }

    public static void a(byte param0) {
        if (param0 < 118) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final boolean b(int param0) {
        if (param0 != 12) {
          this.b(13);
          return this.field_b;
        }
        return this.field_b;
    }

    final boolean a(int param0) {
        if (param0 != 12) {
          return true;
        }
        return this.field_c;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
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
              if (!param1) {
                return;
              }
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(gf.a(3, var2, param0), "_top");
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
            stackIn_8_1 = new StringBuilder().append("la.G(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    la(String param0) {
        this.field_c = false;
        this.field_b = false;
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "la.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Connection restored.";
    }
}
