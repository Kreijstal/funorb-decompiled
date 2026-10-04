/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameQuerySupport {
    static java.security.SecureRandom payloadKeyRandom;
    static String continueText;
    static DiskCacheWorker archiveDiskWorker;
    static int tooltipSuppressionResetAge;
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
            tooltipSuppressionResetAge = -115;
          }
          if (IntrusiveDeque.pendingClientFlowToken == WidgetSkinState.usernameQueryFlowState) {
            return null;
          }
          if ((WidgetSkinState.usernameQueryFlowState == MeshPrioritySupport.completedClientFlowToken) &&
              (candidateText.equals(DelayedPcmStream.usernameQueryCandidate))) {
            WidgetSkinState.usernameQueryFlowState = DiskCacheWorker.idleClientFlowToken;
            cachedQueryBeforeReturn = ScorePopup.pendingUsernameResult;
            return cachedQueryBeforeReturn;
          }
          WidgetSkinState.usernameQueryFlowState = IntrusiveDeque.pendingClientFlowToken;
          DelayedPcmStream.usernameQueryCandidate = candidateText;
          ScorePopup.pendingUsernameResult = null;
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
        tooltipSuppressionResetAge = 10;
        continueText = "Continue";
    }
}
