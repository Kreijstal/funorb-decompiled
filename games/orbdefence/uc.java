/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends wj {
    byte[] field_u;
    eh field_s;
    static String field_r;
    int field_t;
    static qj field_q;

    final static qg a(boolean param0, String param1, ki param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_r = (String) null;
          }
          var4_int = param2.a(param1, 0);
          var5 = param2.a(param3, 5187, var4_int);
          stackIn_3_0 = e.a(var4_int, var5, param2, 26052);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("uc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int e(int param0) {
        if (param0 != 100) {
          String var3 = (String) null;
          uc.a(false, (String) null, (ki) null, (String) null);
          if (this.field_l) {
            return 0;
          }
          return 100;
        }
        if (this.field_l) {
          return 0;
        }
        return 100;
    }

    final byte[] f(int param0) {
        if (param0 != 0) {
          return (byte[]) null;
        }
        if (this.field_l) {
          throw new RuntimeException();
        }
        return this.field_u;
    }

    public static void d(byte param0) {
        field_q = null;
        field_r = null;
        if (param0 >= -67) {
          field_r = (String) null;
        }
    }

    uc() {
    }

    static {
    }
}
