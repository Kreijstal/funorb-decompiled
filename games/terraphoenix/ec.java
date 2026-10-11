/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    private boolean field_f;
    static int[] field_a;
    static String[] field_d;
    static String field_c;
    private String field_b;
    private boolean field_e;

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return this.field_e;
    }

    final static qj a(String param0, int param1, fa param2, fa param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        qj stackIn_2_0 = null;
        qj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8192) {
            stackIn_2_0 = (qj) null;
            return stackIn_2_0;
          }
          var5_int = param3.c(param1 ^ -8193, param0);
          var6 = param3.a(-94, var5_int, param4);
          stackIn_4_0 = nl.a(param2, param3, (byte) 90, var6, var5_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ec.E(");
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 >= -64) {
          ec.a((byte) -113);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final boolean a(int param0) {
        if (param0 > -50) {
          field_d = (String[]) null;
          return this.field_f;
        }
        return this.field_f;
    }

    final String b(int param0) {
        if (param0 > -56) {
          return (String) null;
        }
        return this.field_b;
    }

    final void a(boolean param0, int param1) {
        this.field_f = true;
        int var3 = 47 % ((29 - param1) / 33);
        this.field_e = param0 ? true : false;
    }

    ec(String param0) {
        this.field_f = false;
        this.field_e = false;
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[8192];
        field_c = "Change display name";
    }
}
