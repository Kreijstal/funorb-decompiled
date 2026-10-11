/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static w field_a;
    static String field_b;
    static ck field_c;
    static mm field_e;
    static mm field_d;

    public static void b(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != 0) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          int var3_int = 0;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param2.getCodeBase(), param0);
              var3 = gn.a(var3, -1, param2);
              c.a((byte) 92, var3.toString(), true, param2);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            var3_int = 92 / ((44 - param1) / 48);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var3_ref2;
            stackIn_7_1 = new StringBuilder().append("aj.A(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        pk.field_r = 0;
        if (param0 != -1045) {
          return;
        }
        v.b(0);
    }

    static {
        field_b = "<%0> has left the lobby.";
    }
}
