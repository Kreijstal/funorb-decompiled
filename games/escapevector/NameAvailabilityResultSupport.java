/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameAvailabilityResultSupport {
    static String field_g;
    static PcmSample field_a;
    static String field_d;
    static String field_f;
    static int field_c;
    static String field_e;
    static SecondaryNodeHashTable field_b;

    final static void chooseGuestSession(int action) {
        ImageProducerRasterBuffer.showLoadingProgressDialog(action ^ 36);
        WhirlpoolHasher.a(action, 30);
    }

    final static NameAvailabilityResult createTextResponse(String message, int responseCode, int guard) {
        String stackIn_7_2 = null;
        try {
          NameAvailabilityResult var3 = new NameAvailabilityResult(false);
          var3.field_g = responseCode;
          if (guard != 4) {
            field_g = (String) null;
          }
          var3.field_f = message;
          NameAvailabilityResult stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bm.B(");
          if (message == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(responseCode).append(',').append(guard).append(')').toString());
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
        NameAvailabilityResultSupport.chooseGuestSession(95);
        field_b = null;
        field_f = null;
        field_g = null;
        field_a = null;
        field_e = null;
    }

    final static void loadingRenderHook(byte guard) {
        if (guard != 62) {
          NameAvailabilityResultSupport.releaseStatics((byte) -121);
        }
    }

    static {
        field_c = 0;
        field_f = "Waiting for music";
        field_d = "Continue";
        field_e = "virtual_layer3_tile.jpg";
    }
}
