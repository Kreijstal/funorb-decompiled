/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static er field_a;
    boolean field_f;
    int field_c;
    static int[] field_d;
    static String field_e;
    int field_g;
    static int field_b;

    public static void a(byte param0) {
        int var1 = 5 / ((13 - param0) / 51);
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final boolean a(bk param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -74 % ((param1 + 86) / 33);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("nj.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(nj param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 95) {
            stackIn_6_0 = (this.field_c == param0.field_c);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nj.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        return super.toString();
    }

    nj(int param0, int param1) {
        this.field_f = true;
        this.field_g = param1;
        this.field_c = param0;
    }

    static {
        field_a = new er(1);
        field_e = "End Game";
        field_d = new int[13];
    }
}
