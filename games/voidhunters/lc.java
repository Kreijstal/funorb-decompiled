/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lc {
    private int field_a;
    private Hashtable field_c;
    static bs field_b;

    final static void a(int param0, ml param1) {
        ml var4 = null;
        ml var5 = null;
        ml var6 = null;
        ml var7 = null;
        try {
            param1.a(1, 9, new ml(16));
            param1.a(1, 14, new ml(13));
            param1.a(1, 4, new ml(13));
            param1.a(1, 0, new ml(13));
            param1.a(1, 18, new ml(13));
            var4 = new ml(39);
            var5 = new ml(30);
            var5.a(1, 0, new ml(24));
            var4.a(param0 ^ 39, 3, var5);
            var4.a(param0 ^ 39, 1, new ml(13));
            param1.a(1, 3, var4);
            var6 = new ml(param0);
            var7 = new ml(30);
            var7.a(1, 1, new ml(24));
            var6.a(param0 ^ 39, 2, var7);
            var6.a(1, 4, new ml(13));
            param1.a(1, 15, var6);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 95) {
            ml var2 = (ml) null;
            lc.a(-56, (ml) null);
        }
    }

    public final String toString() {
        String var1 = "Release mode=" + jqa.field_o[this.field_a] + "\n";
        var1 = var1 + this.field_c.toString();
        return var1;
    }

    final void a(String param0, int param1, boolean param2) {
        Number var4 = null;
        try {
            param0 = param0.toLowerCase();
            if (param2) {
                this.toString();
            }
            param0 = param0.replace(' ', '_');
            var4 = (Number) (this.field_c.get(param0));
            if (var4 != null) {
                param1 = param1 + var4.intValue();
            }
            this.field_c.put(param0, new Integer(param1));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private lc() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            ml var4 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 86) {
                  break L0;
                } else {
                  var4 = (ml) null;
                  lc.a(-123, (ml) null);
                  break L0;
                }
              }
              try {
                L1: {
                  var3 = new java.net.URL(param1.getCodeBase(), param2);
                  var3 = ne.a(var3, (byte) -118, param1);
                  qp.a(true, 0, param1, var3.toString());
                  break L1;
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
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("lc.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              L3: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
