/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static java.security.SecureRandom field_e;
    static String continueText;
    static DiskCacheWorker archiveDiskWorker;
    static int field_a;
    static Sprite field_b;

    public static void a(int param0) {
        continueText = null;
        field_e = null;
        archiveDiskWorker = null;
        if (param0 != -9474) {
            cl.a(62);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static UsernameAvailabilityQuery a(byte param0, String param1) {
        RuntimeException var2 = null;
        UsernameAvailabilityQuery stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 56) {
            field_a = -115;
          }
          if (IntrusiveDeque.field_d == WidgetSkinState.field_g) {
            return null;
          }
          if ((WidgetSkinState.field_g == va.field_e) &&
              (param1.equals(DelayedPcmStream.field_k))) {
            WidgetSkinState.field_g = DiskCacheWorker.field_l;
            stackIn_8_0 = ScorePopup.field_g;
            return stackIn_8_0;
          }
          WidgetSkinState.field_g = IntrusiveDeque.field_d;
          DelayedPcmStream.field_k = param1;
          ScorePopup.field_g = null;
          stackIn_10_0 = null;
          return (UsernameAvailabilityQuery) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("cl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_a = 10;
        continueText = "Continue";
    }
}
