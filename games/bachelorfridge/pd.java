/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    si field_g;
    String field_c;
    String field_h;
    int field_b;
    boolean field_e;
    int field_a;
    int field_f;
    static int field_d;

    final static int a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 47) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                pd.a((byte) 78, (CharSequence) null);
                break L1;
              }
            }
            stackIn_3_0 = kna.a(10, param1, true, 24808);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pd.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    pd(int param0, String param1, String param2, int param3, si param4, int param5, boolean param6) {
        Random var8 = null;
        try {
            this.field_h = param1;
            this.field_a = param5;
            this.field_b = param0;
            this.field_e = param6 ? true : false;
            this.field_c = param2;
            this.field_g = param4;
            this.field_f = param3;
            var8 = new Random((long)param0);
            kla.a(10, var8, -2147483648);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_d = 605;
    }
}
