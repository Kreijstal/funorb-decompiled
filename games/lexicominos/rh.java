/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rh extends ca {
    int field_q;
    static dg field_r;
    static sc field_p;

    public static void c(int param0) {
        field_p = null;
        if (param0 > -86) {
          field_p = (sc) null;
          field_r = null;
          return;
        }
        field_r = null;
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 0) {
            throw new IllegalArgumentException();
          }
          if (pa.a(param2, (byte) 65)) {
            stackIn_6_0 = (int)((long)param2 * ((long)param1.nextInt() & 4294967295L) >> 32);
            return stackIn_6_0;
          }
          var3_int = -(int)(4294967296L % (long)param2) + -2147483648;
          if (param0 != 14817) {
            var5 = (String) null;
            rh.a((sh) null, (byte) -41, (String) null, (String) null, (String) null);
          }
          do {
            var4 = param1.nextInt();
          } while (var3_int <= var4);
          stackIn_12_0 = gk.a(var4, param2, (byte) 71);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("rh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract Object c(byte param0);

    abstract boolean d(byte param0);

    final static String a(sh param0, byte param1, String param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 36) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (!param0.c(90)) {
            stackIn_6_0 = (String) (param4);
            return stackIn_6_0;
          }
          stackIn_8_0 = param3 + " - " + param0.b(param2, (byte) 115) + "%";
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("rh.P(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    rh(int param0) {
        this.field_q = param0;
    }

    static {
        field_r = new dg();
        field_p = new sc();
    }
}
