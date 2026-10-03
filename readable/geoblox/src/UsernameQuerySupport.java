/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameQuerySupport {
    static java.security.SecureRandom payloadKeyRandom;
    static String continueText;
    static DiskCacheWorker archiveDiskWorker;
    static int field_a;
    static Sprite logoFinalFrameBottom;

    public static void releaseStaticReferences(int methodGuard) {
        continueText = null;
        payloadKeyRandom = null;
        archiveDiskWorker = null;
        if (methodGuard != -9474) {
            UsernameQuerySupport.releaseStaticReferences(62);
            logoFinalFrameBottom = null;
            return;
        }
        logoFinalFrameBottom = null;
    }

    final static UsernameAvailabilityQuery requestOrReuseUsernameQuery(byte methodGuard, String candidateText) {
        RuntimeException requestFailureForContext = null;
        UsernameAvailabilityQuery cachedQueryBeforeReturn = null;
        Object nullQueryBeforeReturn = null;
        RuntimeException requestFailureBeforeDescription = null;
        StringBuilder requestMessagePrefix = null;
        String candidateTextDescription = null;
        RuntimeException caughtRequestFailure = null;
        try {
          if (methodGuard <= 56) {
            field_a = -115;
          }
          if (IntrusiveDeque.field_d == WidgetSkinState.field_g) {
            return null;
          }
          if ((WidgetSkinState.field_g == MeshPrioritySupport.field_e) &&
              (candidateText.equals(DelayedPcmStream.field_k))) {
            WidgetSkinState.field_g = DiskCacheWorker.field_l;
            cachedQueryBeforeReturn = ScorePopup.field_g;
            return cachedQueryBeforeReturn;
          }
          WidgetSkinState.field_g = IntrusiveDeque.field_d;
          DelayedPcmStream.field_k = candidateText;
          ScorePopup.field_g = null;
          nullQueryBeforeReturn = null;
          return (UsernameAvailabilityQuery) (nullQueryBeforeReturn);
        } catch (java.lang.RuntimeException requestFailure) {
          caughtRequestFailure = requestFailure;
          requestFailureForContext = caughtRequestFailure;
          requestFailureBeforeDescription = requestFailureForContext;
          requestMessagePrefix = new StringBuilder().append("cl.A(").append(methodGuard).append(',');
          if (candidateText == null) {
            candidateTextDescription = "null";
          } else {
            candidateTextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) requestFailureBeforeDescription), ((StringBuilder) (Object) requestMessagePrefix).append(candidateTextDescription).append(')').toString());
        }
    }

    static {
        field_a = 10;
        continueText = "Continue";
    }
}
