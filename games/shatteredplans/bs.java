/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs {
    static bi field_a;
    static int field_b;
    static String field_c;

    public static void a(int param0) {
        if (param0 <= 35) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        wo.field_a = param2;
        if (param3 <= 22) {
          bs.a(true, (byte) -46);
        }
        em.field_j = param1;
        ih.field_b = param0;
    }

    final static void a(bi param0, int param1) {
        try {
          ra.a(-127);
          param0.e();
          if (param1 < 74) {
            field_b = -100;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "bs.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != 72) {
          field_c = (String) null;
        }
        wh.field_a.a(param0, 88);
    }

    final static int a(int param0, byte[] param1, byte param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = -1;
          if (param2 >= -41) {
            stackIn_3_0 = -36;
            return stackIn_3_0;
          }
          for (var5 = param3; var5 < param0; var5++) {
            var4_int = var4_int >>> 8 ^ vg.field_w[255 & (var4_int ^ param1[var5])];
          }
          var4_int = ~var4_int;
          stackIn_8_0 = var4_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("bs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = "Play the game without logging in just yet";
    }
}
