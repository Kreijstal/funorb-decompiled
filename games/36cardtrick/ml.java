/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static int[] field_b;
    static int field_a;

    final static short a(bb param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        short stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < -41) {
            stackIn_4_0 = (short)param0.a((-64 + 128 * param1) / 2, (128 * param3 - 64) / 2, param2 * 4);
            return stackIn_4_0;
          }
          stackIn_2_0 = -3;
          return (short) stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ml.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Main.field_T;
        try {
          var4_int = -1;
          for (var5 = param1; param2 > var5; var5++) {
            var4_int = pc.field_b[(param0[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
          }
          if (param3 != 12011) {
            field_a = 58;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ml.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < 69) {
          field_b = (int[]) null;
        }
    }

    static {
        field_a = -1;
    }
}
