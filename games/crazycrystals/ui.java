/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int field_a;
    static byte[][] field_c;
    static String field_b;

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = CrazyCrystals.field_B;
        try {
          if (param3 > -29) {
            field_a = 8;
          }
          while (true) {
            param1--;
            if (param1 < 0) {
              return;
            }
            var9 = param0;
            var5 = var9;
            var6 = param4;
            var7 = param2;
            var9[var6] = var7 + (pf.b(16711422, var9[var6]) >> 1);
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("ui.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > 109) {
          field_c = (byte[][]) null;
          field_b = null;
          return;
        }
        int[] var2 = (int[]) null;
        ui.a((int[]) null, 61, 21, -49, 90);
        field_c = (byte[][]) null;
        field_b = null;
    }

    final static int b(byte param0) {
        if (param0 > -62) {
          ui.a((byte) -27);
          return 1;
        }
        return 1;
    }

    static {
        field_a = 0;
        field_b = "Age:";
    }
}
