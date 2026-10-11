/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static boolean field_b;
    static tg[] field_e;
    static int[] field_c;
    static String field_d;
    static int field_a;

    final static int a(byte param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0) {
          var2 += 16;
          param1 = param1 >>> 16;
        } else {
          if (param1 >= 65536) {
            var2 += 16;
            param1 = param1 >>> 16;
          }
        }
        if (param1 >= 256) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param0 != 100) {
          return -116;
        }
        if (param1 >= 4) {
          var2 += 2;
          param1 = param1 >>> 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    final static rg a(int param0, int param1, String param2) {
        rg var3 = null;
        RuntimeException var3_ref = null;
        rg stackIn_2_0 = null;
        rg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            stackIn_2_0 = (rg) null;
            return stackIn_2_0;
          }
          var3 = new rg(false);
          var3.field_c = param2;
          var3.field_g = param0;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("wb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        int var1 = -38 % ((-58 - param0) / 38);
        field_c = null;
    }

    static {
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new int[8192];
    }
}
