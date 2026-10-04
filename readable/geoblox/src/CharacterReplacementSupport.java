/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CharacterReplacementSupport {
    static boolean clearGameplayDuringTransition;
    static Sprite transitionCurtain;
    static TextTemplateArgumentType field_a;

    public static void clearReplacementAndTransitionResources(byte methodGuard) {
        transitionCurtain = null;
        field_a = null;
        if (methodGuard != -23) {
            CharacterReplacementSupport.getAccountAgeYears((byte) 28);
        }
    }

    final static int getAccountAgeYears(byte methodGuard) {
        if (methodGuard != 81) {
            CharacterReplacementSupport.getAccountAgeYears((byte) -12);
            return StatefulWidgetRenderer.accountCreationAgeYears;
        }
        return StatefulWidgetRenderer.accountCreationAgeYears;
    }

    final static String replaceCharacter(String text, String replacement, char character, byte methodGuard) {
        StringBuilder unusedAppendTailResult = null;
        StringBuilder unusedAppendPrefixResult = null;
        StringBuilder unusedAppendReplacementResult = null;
        int textLength = 0;
        int replacementLength = 0;
        int capacityEstimate = 0;
        int lengthDeltaPerMatch = 0;
        int capacityScanOffset = 0;
        int clientControlFlowGuard = 0;
        String replacedTextBeforeReturn = null;
        RuntimeException replacementFailureBeforeContext = null;
        StringBuilder replacementMessagePrefix = null;
        String textDescription = null;
        StringBuilder replacementMessageBeforeReplacement = null;
        String replacementDescription = null;
        RuntimeException caughtReplacementFailure = null;
        RuntimeException replacementFailureForContext = null;
        StringBuilder builder = null;
        int copyStart = 0;
        int matchOffset = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          textLength = text.length();
          replacementLength = replacement.length();
          if (methodGuard < 79) {
            clearGameplayDuringTransition = false;
          }
          capacityEstimate = textLength;
          lengthDeltaPerMatch = replacementLength - 1;
          if (0 != lengthDeltaPerMatch) {
            capacityScanOffset = 0;
            while (true) {
              capacityScanOffset = text.indexOf((int) character, capacityScanOffset);
              if (capacityScanOffset < 0) {
                break;
              }
              capacityEstimate = capacityEstimate + lengthDeltaPerMatch;
              capacityScanOffset++;
              continue;
            }
          }
          builder = new StringBuilder(capacityEstimate);
          copyStart = 0;
          while (true) {
            matchOffset = text.indexOf((int) character, copyStart);
            if (matchOffset < 0) {
              unusedAppendTailResult = builder.append(text.substring(copyStart));
              replacedTextBeforeReturn = builder.toString();
              return replacedTextBeforeReturn;
            }
            unusedAppendPrefixResult = builder.append(text.substring(copyStart, matchOffset));
            copyStart = 1 + matchOffset;
            unusedAppendReplacementResult = builder.append(replacement);
            continue;
          }
        } catch (java.lang.RuntimeException replacementFailure) {
          caughtReplacementFailure = replacementFailure;
          replacementFailureForContext = caughtReplacementFailure;
          replacementFailureBeforeContext = replacementFailureForContext;
          replacementMessagePrefix = new StringBuilder().append("qj.B(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          replacementMessageBeforeReplacement = ((StringBuilder) (Object) replacementMessagePrefix).append(textDescription).append(',');
          if (replacement == null) {
            replacementDescription = "null";
          } else {
            replacementDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) replacementFailureBeforeContext), ((StringBuilder) (Object) replacementMessageBeforeReplacement).append(replacementDescription).append(',').append(character).append(',').append(methodGuard).append(')').toString());
        }
    }

    static {
        field_a = new TextTemplateArgumentType(10, 2, 2, 0);
    }
}
