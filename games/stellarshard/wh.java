/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_c;
    static pb[] field_e;
    int field_b;
    static String field_d;
    static pb field_a;

    final static byte[] a(int param0, ha param1, byte[] param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = stellarshard.field_B;
        try {
          var4_int = 69 % ((param3 + 61) / 48);
          var5 = param1.e(param0, 8);
          if (0 == var5) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param2 == null ||
            param2.length != var5) {
            param2 = new byte[var5];
          }
          var6 = param1.e(3, 8);
          var7 = (byte)param1.e(8, 8);
          if (var6 > 0) {
            for (var8 = 0; var8 < var5; var8++) {
              param2[var8] = (byte)(var7 + param1.e(var6, 8));
            }
          } else {
            for (var8 = 0; var8 < var5; var8++) {
              param2[var8] = (byte)var7;
            }
          }
          stackIn_16_0 = (byte[]) (param2);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("wh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(byte param0) {
        if (o.field_l == dj.field_a) {
          return kc.field_c;
        }
        if (param0 < 79) {
          wh.a(-83);
        }
        return wb.field_c;
    }

    public static void b(int param0) {
        if (param0 != -1) {
          wh.a(-125);
        }
        field_a = null;
        field_d = null;
        field_e = null;
    }

    final static void a(int param0) {
        if (param0 > -31) {
          return;
        }
        gg.field_f = ee.a(5, 0, (byte) -119, 1);
    }

    static {
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
