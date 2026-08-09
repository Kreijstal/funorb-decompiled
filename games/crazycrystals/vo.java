/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo {
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            RuntimeException var3_ref = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var3_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = new java.net.URL(param2.getCodeBase(), param1);
                    var3 = gh.a(param2, var3, (byte) 67);
                    ec.a(true, var3.toString(), param2, (byte) -17);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    var3_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param0 == 31251) {
                  break L0;
                } else {
                  field_b = (String) null;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref);

                stackIn_8_1 = new StringBuilder().append("vo.A(").append(param0).append(',');

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
              L4: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Checking";
        field_a = "to store your progress.";
    }
}
