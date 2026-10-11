/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int[] field_b;
    static String field_a;
    static String field_f;
    static int field_e;
    static String field_d;
    static boolean[] field_c;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 256) {
            ql.a(58, (byte) -83);
          }
          var3_int = 1;
          while (param2 > 1) {
            if ((1 & param2) != 0) {
              var3_int = var3_int * param1;
            }
            param2 = param2 >> 1;
            param1 = param1 * param1;
          }
          if (param2 != 1) {
            stackIn_13_0 = var3_int;
            return stackIn_13_0;
          }
          stackIn_11_0 = param1 * var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3), "ql.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        fb var3 = null;
        int var4 = 0;
        qf var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          var5 = (qf) (vb.field_h.b((byte) 119));
          while (var5 != null) {
            ol.a(-30329, var5, param0);
            var5 = (qf) (vb.field_h.d(853));
          }
          var2_int = -104 / ((param1 + 19) / 32);
          var3 = (fb) (mg.field_l.b((byte) 122));
          while (var3 != null) {
            ia.a(-86, param0, var3);
            var3 = (fb) (mg.field_l.d(853));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "ql.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(ki param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 82 % ((-20 - param3) / 32);
          if (param0.b(-1)) {
            stackIn_4_0 = param1 + " - " + param0.a(20147) + "%";
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) (param2);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ql.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static aa a(int param0) {
        if (param0 != 65280) {
          return (aa) null;
        }
        return (aa) ((Object) new g());
    }

    public static void a(byte param0) {
        if (param0 != 50) {
          return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_d = null;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime2Lifetime1;
        field_b = new int[128];
        for (var0 = 0; var0 < 64; var0++) {
          var1 = var0 * var0 * 192 / 4096;
          var2 = var0 * (var0 * (var0 * var0) * 128) / 16777216;
          var3 = var0 * var0 * (var0 * 255) / 262144;
          field_b[var0] = (var2 << 8) + ((var1 << 16) + var3);
        }
        for (var0Lifetime1 = 0; 64 > var0Lifetime1; var0Lifetime1++) {
          var1Lifetime1 = 96 * (var0Lifetime1 * var0Lifetime1) / 4096;
          var2Lifetime1 = 32 * (var0Lifetime1 * (var0Lifetime1 * var0Lifetime1)) / 262144;
          var3Lifetime1 = 128 * var0Lifetime1 * var0Lifetime1 / 4096;
          field_b[-var0Lifetime1 + 127] = var3Lifetime1 + ((var2Lifetime1 << 8) + (var1Lifetime1 << 16));
        }
        var0Lifetime2 = field_b[63] & 16711935;
        var1Lifetime2 = field_b[63] & 65280;
        for (var2Lifetime2 = 0; var2Lifetime2 < 2; var2Lifetime2++) {
          var3Lifetime2 = field_b[64 + var2Lifetime2];
          var4 = -(var2Lifetime2 * 256 / 2) + 256;
          var5 = 16711935 & var3Lifetime2;
          var6 = 65280 & var3Lifetime2;
          var5 = var5 * (256 - var4);
          var5 = var5 + var0Lifetime2 * var4;
          var6 = var6 * (256 - var4);
          var6 = var6 + var1Lifetime2 * var4;
          var3Lifetime2Lifetime1 = (var5 & -16711936 | var6 & 16711680) >>> 8;
          field_b[64 + var2Lifetime2] = var3Lifetime2Lifetime1;
        }
        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Please wait...";
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_e = 0;
    }
}
