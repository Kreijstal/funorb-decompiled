/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends li {
    ra field_r;
    int field_p;
    static cr field_o;
    static int[] field_n;
    li field_q;
    static String field_s;

    final static void a(String param0, boolean param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            StringBuilder stackIn_9_1 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var3 = new java.net.URL(param2.getCodeBase(), param0);
                  var3 = ar.a(param2, var3, 0);
                  hc.a(var3.toString(), 16011, param1, param2);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var3_ref2);

                stackIn_6_1 = new StringBuilder().append("gg.A(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              L2: {


                stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_s = null;
        field_o = null;
        field_n = null;
        if (param0 > -68) {
            field_n = (int[]) null;
        }
    }

    gg(ra param0, li param1) {
        try {
            this.field_r = param0;
            this.field_p = param0.h();
            this.field_q = param1;
            this.field_r.g(tg.field_e * this.field_p + 128 >> 1665928232);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new int[5];
        field_s = "Pick up a paint pot by moving over it and then paint all the tiles purple! Be careful not to fall off the bottom of the level or you'll lose a life.";
    }
}
