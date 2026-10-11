/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends eca {
    static int[] field_f;

    final static String d(byte param0) {
        if (param0 != 106) {
          field_f = (int[]) null;
          if (jib.field_o) {
            return null;
          }
          if (fra.field_b > od.field_a) {
            return null;
          }
          if (!(od.field_a >= fra.field_b + k.field_r)) {
            return rfa.field_o;
          }
          return null;
        }
        if (jib.field_o) {
          return null;
        }
        if (fra.field_b > od.field_a) {
          return null;
        }
        if (!(od.field_a >= fra.field_b + k.field_r)) {
          return rfa.field_o;
        }
        return null;
    }

    rm(uf param0) {
        super(param0);
    }

    final String b(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, 16384) == cca.field_o) {
            stackIn_3_0 = it.field_m;
            return stackIn_3_0;
          }
          if (param1 == -1) {
            stackIn_8_0 = bqa.field_f;
            return stackIn_8_0;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("rm.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != 2) {
          field_f = (int[]) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    final qrb a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        qrb stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 16384) {
            field_f = (int[]) null;
          }
          stackIn_5_0 = (null != lkb.a(param0, (byte) -116)) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            return lea.field_o;
          }
          stackIn_8_0 = cca.field_o;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("rm.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = new int[2];
    }
}
