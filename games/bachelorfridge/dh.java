/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends pp {
    static String field_i;

    public static void d(byte param0) {
        if (param0 >= -39) {
          field_i = (String) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
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
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(ow.a(var2, (byte) -123, param0), "_top");
              if (param1 > 43) {
                return;
              }
              field_i = (String) null;
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
            stackIn_7_1 = new StringBuilder().append("dh.E(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public dh() {
    }

    final static void a(byte param0, int param1) {
        ala.a(param0 + 26161, wba.field_e[param1]);
        if (param0 != 58) {
          dh.a((byte) 17, -16);
        }
    }

    final void a(aga param0, op param1, int param2) {
        try {
          param1.field_R = true;
          if (param2 != 12) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dh.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(lu param0, byte param1) {
        try {
          int var3_int = -1 % ((34 - param1) / 58);
          super.a(param0, (byte) -77);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = "Return to lobby";
    }
}
