/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_g;
    static PcmSample field_a;
    static String field_d;
    static String field_f;
    static int field_c;
    static String field_e;
    static nn field_b;

    final static void a(int param0) {
        ImageProducerRasterBuffer.d(param0 ^ 36);
        WhirlpoolHasher.a(param0, 30);
    }

    final static NameAvailabilityResult a(String param0, int param1, int param2) {
        String stackIn_7_2 = null;
        try {
          NameAvailabilityResult var3 = new NameAvailabilityResult(false);
          var3.field_g = param1;
          if (param2 != 4) {
            field_g = (String) null;
          }
          var3.field_f = param0;
          NameAvailabilityResult stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bm.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_d = null;
        if (guard == 110) {
          field_b = null;
          field_f = null;
          field_g = null;
          field_a = null;
          field_e = null;
          return;
        }
        bm.a(95);
        field_b = null;
        field_f = null;
        field_g = null;
        field_a = null;
        field_e = null;
    }

    final static void b(byte param0) {
        if (param0 != 62) {
          bm.releaseStatics((byte) -121);
        }
    }

    static {
        field_c = 0;
        field_f = "Waiting for music";
        field_d = "Continue";
        field_e = "virtual_layer3_tile.jpg";
    }
}
