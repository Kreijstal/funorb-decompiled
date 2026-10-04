/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidator extends TextInputValidator {
    private static long[] unusedCrc64Table;
    static int archiveGameCrc;
    static boolean[] themeMusicPreparationFlags;
    static int availableSpriteVariantCount;
    static int byteArrayPool30000Count;

    final String validationMessageForText(int guard, String candidateText) {
        RuntimeException messageFailureForContext = null;
        String invalidEmailMessage = null;
        String validEmailMessage = null;
        RuntimeException messageFailureBeforeContext = null;
        StringBuilder messagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtMessageFailure = null;
        try {
          if (guard != 422) {
            archiveGameCrc = -21;
          }
          if (this.validationStateForText(-257, candidateText) != WidgetSkinState.invalidInputValidationState) {
            validEmailMessage = ClientOptionSupport.createEmailValidText;
            return validEmailMessage;
          }
          invalidEmailMessage = OpacityWidget.createInvalidEmailAlertText;
          return invalidEmailMessage;
        } catch (java.lang.RuntimeException emailMessageFailure) {
          caughtMessageFailure = emailMessageFailure;
          messageFailureForContext = caughtMessageFailure;
          messageFailureBeforeContext = messageFailureForContext;
          messagePrefix = new StringBuilder().append("ag.A(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) messageFailureBeforeContext), ((StringBuilder) (Object) messagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    final static Class resolveReflectionClass(String classNameOrPrimitiveCode, boolean methodGuard) throws ClassNotFoundException {
        RuntimeException classFailureForContext = null;
        Class byteClassBeforeReturn = null;
        Class intClassBeforeReturn = null;
        Class shortClassBeforeReturn = null;
        Class longClassBeforeReturn = null;
        Class booleanClassBeforeReturn = null;
        Class floatClassBeforeReturn = null;
        Class doubleClassBeforeReturn = null;
        Class charClassBeforeReturn = null;
        Class resolvedClassBeforeReturn = null;
        RuntimeException classFailureBeforeContext = null;
        StringBuilder classMessagePrefix = null;
        String classNameDescription = null;
        RuntimeException caughtClassFailure = null;
        try {
          if (classNameOrPrimitiveCode.equals("B")) {
            byteClassBeforeReturn = Byte.TYPE;
            return byteClassBeforeReturn;
          }
          if (classNameOrPrimitiveCode.equals("I")) {
            intClassBeforeReturn = Integer.TYPE;
            return intClassBeforeReturn;
          }
          if (classNameOrPrimitiveCode.equals("S")) {
            shortClassBeforeReturn = Short.TYPE;
            return shortClassBeforeReturn;
          }
          if (classNameOrPrimitiveCode.equals("J")) {
            longClassBeforeReturn = Long.TYPE;
            return longClassBeforeReturn;
          }
          if (classNameOrPrimitiveCode.equals("Z")) {
            booleanClassBeforeReturn = Boolean.TYPE;
            return booleanClassBeforeReturn;
          }
          if (classNameOrPrimitiveCode.equals("F")) {
            floatClassBeforeReturn = Float.TYPE;
            return floatClassBeforeReturn;
          }
          if (classNameOrPrimitiveCode.equals("D")) {
            doubleClassBeforeReturn = Double.TYPE;
            return doubleClassBeforeReturn;
          }
          if (classNameOrPrimitiveCode.equals("C")) {
            charClassBeforeReturn = Character.TYPE;
            return charClassBeforeReturn;
          }
          if (methodGuard) {
            EmailValidator.releaseEmailValidatorSharedResources(26);
          }
          resolvedClassBeforeReturn = Class.forName(classNameOrPrimitiveCode);
          return resolvedClassBeforeReturn;
        } catch (java.lang.RuntimeException reflectionClassResolutionFailure) {
          caughtClassFailure = reflectionClassResolutionFailure;
          classFailureForContext = caughtClassFailure;
          classFailureBeforeContext = classFailureForContext;
          classMessagePrefix = new StringBuilder().append("ag.E(");
          if (classNameOrPrimitiveCode == null) {
            classNameDescription = "null";
          } else {
            classNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) classFailureBeforeContext), ((StringBuilder) (Object) classMessagePrefix).append(classNameDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static String decodeTextBytes(int decodeGuard, byte[] textBytes) {
        RuntimeException decodingFailureForContext = null;
        String decodedTextBeforeReturn = null;
        RuntimeException decodingFailureBeforeDescription = null;
        StringBuilder decodingMessagePrefix = null;
        String textBytesDescription = null;
        RuntimeException caughtDecodingFailure = null;
        try {
          if (decodeGuard != 1) {
            themeMusicPreparationFlags = (boolean[]) null;
          }
          decodedTextBeforeReturn = ByteTextDecodingSupport.decodeTextSlice(-8, textBytes, 0, textBytes.length);
          return decodedTextBeforeReturn;
        } catch (java.lang.RuntimeException decodingFailure) {
          caughtDecodingFailure = decodingFailure;
          decodingFailureForContext = caughtDecodingFailure;
          decodingFailureBeforeDescription = decodingFailureForContext;
          decodingMessagePrefix = new StringBuilder().append("ag.B(").append(decodeGuard).append(',');
          if (textBytes == null) {
            textBytesDescription = "null";
          } else {
            textBytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodingFailureBeforeDescription), ((StringBuilder) (Object) decodingMessagePrefix).append(textBytesDescription).append(')').toString());
        }
    }

    final ValidationState validationStateForText(int guard, String candidateText) {
        int emailSyntaxAccepted = 0;
        RuntimeException validationFailureForContext = null;
        String unusedNullCandidateText = null;
        int emailSyntaxAcceptedBeforeStore = 0;
        ValidationState invalidEmailState = null;
        ValidationState validEmailState = null;
        RuntimeException validationFailureBeforeContext = null;
        StringBuilder validationMessagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtValidationFailure = null;
        try {
          emailSyntaxAcceptedBeforeStore = (null != FifoResponseToken.a(candidateText, 1)) ? 0 : 1;
          emailSyntaxAccepted = emailSyntaxAcceptedBeforeStore;
          if (emailSyntaxAccepted == 0) {
            invalidEmailState = WidgetSkinState.invalidInputValidationState;
            return invalidEmailState;
          }
          if (guard != -257) {
            unusedNullCandidateText = (String) null;
            this.validationMessageForText(97, (String) null);
          }
          validEmailState = SocketArchiveNetworkClient.validInputValidationState;
          return validEmailState;
        } catch (java.lang.RuntimeException emailValidationFailure) {
          caughtValidationFailure = emailValidationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeContext = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("ag.D(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeContext), ((StringBuilder) (Object) validationMessagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    final static void updateSoundEffectVolume(int volume, byte methodGuard) {
        TrackedPcmStream trackedStream = null;
        int clientControlFlowGuard = 0;
        RuntimeException caughtVolumeFailure = null;
        RuntimeException volumeFailureForContext = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          SocialListEntry.soundEffectVolume = volume;
          trackedStream = (TrackedPcmStream) ((Object) PrefixCodeDecoder.trackedSoundEffectStreams.firstForIteration(0));
          if (methodGuard != -67) {
            return;
          }
          while (trackedStream != null) {
            if (!trackedStream.lifetimeNode.isLinked(126)) {
              trackedStream.unlinkNode(false);
            } else {
              trackedStream.stream.setVolume((int)((float)(SocialListEntry.soundEffectVolume * trackedStream.initialVolume / 80) * 1.399999976158142f));
            }
            trackedStream = (TrackedPcmStream) ((Object) PrefixCodeDecoder.trackedSoundEffectStreams.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException volumeFailure) {
          caughtVolumeFailure = volumeFailure;
          volumeFailureForContext = caughtVolumeFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) volumeFailureForContext), "ag.F(" + volume + ',' + methodGuard + ')');
        }
    }

    public static void releaseEmailValidatorSharedResources(int methodGuard) {
        themeMusicPreparationFlags = null;
        if (methodGuard > -13) {
            byte[] unusedNullDecodeBytes = (byte[]) null;
            EmailValidator.decodeTextBytes(95, (byte[]) null);
            unusedCrc64Table = null;
            return;
        }
        unusedCrc64Table = null;
    }

    EmailValidator(TextInputWidget input) {
        super(input);
    }

    final static void setOptionalLoginTextAndShowLoggingIn(int methodGuard, String optionalLoginText) {
        try {
            StatefulWidgetRenderer.setOptionalLoginText(-119, optionalLoginText);
            if (methodGuard != 12607) {
                archiveGameCrc = 32;
            }
            MessageDialogSupport.showMessageDialog(DisplayModeInfo.loggingInText, 480, false);
        } catch (RuntimeException optionalLoginTextFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) optionalLoginTextFailure), "ag.G(" + methodGuard + ',' + (optionalLoginText != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int tableByteIndex = 0;
        int polynomialBitIndex = 0;
        long polynomialRemainder;
        unusedCrc64Table = new long[256];
        for (tableByteIndex = 0; tableByteIndex < 256; tableByteIndex++) {
          polynomialRemainder = (long)tableByteIndex;
          for (polynomialBitIndex = 0; polynomialBitIndex < 8; polynomialBitIndex++) {
            if (1L != (1L & polynomialRemainder)) {
              polynomialRemainder = polynomialRemainder >>> 1;
              continue;
            }
            polynomialRemainder = -3932672073523589310L ^ polynomialRemainder >>> 1;
          }
          unusedCrc64Table[tableByteIndex] = polynomialRemainder;
        }
        themeMusicPreparationFlags = new boolean[7];
        byteArrayPool30000Count = 0;
    }
}
