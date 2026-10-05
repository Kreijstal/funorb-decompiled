/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipInflater {
    static int pendingLoginUiAction;
    static ResourceArchive initialMusicScoreArchive;
    static int nextRenderTimeHistoryIndex;
    private static TextTemplateArgumentType textTemplateArgumentTypeFifteen;
    static MusicScore currentMusicTrack;
    static IndexedSprite sunBackgroundSprite;
    static int threeKindFourRemovalAchievementId;
    private java.util.zip.Inflater inflater;
    static boolean loginResponseFlagFourSet;
    static int decodedRankedRatioThirdComponent;
    static float avatarTintGreenDelta;

    public static void releaseStaticReferences(int methodGuard) {
        textTemplateArgumentTypeFifteen = null;
        int guardRemainder = 122 % ((methodGuard + 22) / 63);
        sunBackgroundSprite = null;
        currentMusicTrack = null;
        initialMusicScoreArchive = null;
    }

    final void inflateInto(int methodGuard, ByteArrayBuffer buffer, byte[] destination) {
        try {
            Exception inflateException = null;
            RuntimeException inflateFailureForContext = null;
            RuntimeException inflateFailureBeforeContext = null;
            StringBuilder inflateMessagePrefix = null;
            String bufferDescription = null;
            StringBuilder inflateMessageBeforeDestination = null;
            String destinationDescription = null;
            Throwable caughtInflateFailure = null;
            try {
              if (buffer.bytes[buffer.position] == 31 &&
                  -117 == buffer.bytes[1 + buffer.position]) {
                if (this.inflater == null) {
                  this.inflater = new java.util.zip.Inflater(true);
                }
                try {
                  this.inflater.setInput(buffer.bytes, buffer.position + 10, buffer.bytes.length - 8 - (buffer.position + 10));
                  if (methodGuard != -1) {
                    GzipInflater.textTemplateArgumentTypes(76);
                  }
                  this.inflater.inflate(destination);
                } catch (java.lang.Exception inflateOperationException) {
                  caughtInflateFailure = inflateOperationException;
                  inflateException = (Exception) (Object) caughtInflateFailure;
                  this.inflater.reset();
                  throw new RuntimeException("");
                }
                this.inflater.reset();
                return;
              }
              throw new RuntimeException("");
            } catch (java.lang.RuntimeException inflateFailure) {
              caughtInflateFailure = inflateFailure;
              inflateFailureForContext = (RuntimeException) (Object) caughtInflateFailure;
              inflateFailureBeforeContext = inflateFailureForContext;
              inflateMessagePrefix = new StringBuilder().append("fe.D(").append(methodGuard).append(',');
              if (buffer == null) {
                bufferDescription = "null";
              } else {
                bufferDescription = "{...}";
              }
              inflateMessageBeforeDestination = ((StringBuilder) (Object) inflateMessagePrefix).append(bufferDescription).append(',');
              if (destination == null) {
                destinationDescription = "null";
              } else {
                destinationDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) inflateFailureBeforeContext), ((StringBuilder) (Object) inflateMessageBeforeDestination).append(destinationDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedInflateFailure) {
            throw uncheckedInflateFailure;
        } catch (Throwable checkedInflateFailure) {
            throw new RuntimeException(checkedInflateFailure);
        }
    }

    final static int getLogoStartDelayMillis(int methodGuard) {
        if (methodGuard <= 103) {
            return 4;
        }
        return FullscreenEntrySupport.configuredLogoStartDelayMillis;
    }

    final static TextTemplateArgumentType[] textTemplateArgumentTypes(int methodGuard) {
        if (methodGuard == -1) {
            return new TextTemplateArgumentType[]{InstrumentNoteMask.textTemplateArgumentTypeZero, SessionSocketSupport.textTemplateArgumentTypeOne, EntityMotionSupport.textTemplateArgumentTypeTwo, AsyncResourceDownloader.textTemplateArgumentTypeFour, PointerMenuState.textTemplateArgumentTypeSix, Under13TermsPanel.textTemplateArgumentTypeSeven, ProxySocketConnector.textTemplateArgumentTypeEight, SpriteState.textTemplateArgumentTypeNine, CharacterReplacementSupport.textTemplateArgumentTypeTen, DropTargetWidget.textTemplateArgumentTypeEleven, IntKeyLookup.textTemplateArgumentTypeTwelve, ProxyAuthenticationRequiredException.textTemplateArgumentTypeThirteen, MeshPrioritySupport.textTemplateArgumentTypeFourteen, textTemplateArgumentTypeFifteen};
        }
        avatarTintGreenDelta = -1.1302366256713867f;
        return new TextTemplateArgumentType[]{InstrumentNoteMask.textTemplateArgumentTypeZero, SessionSocketSupport.textTemplateArgumentTypeOne, EntityMotionSupport.textTemplateArgumentTypeTwo, AsyncResourceDownloader.textTemplateArgumentTypeFour, PointerMenuState.textTemplateArgumentTypeSix, Under13TermsPanel.textTemplateArgumentTypeSeven, ProxySocketConnector.textTemplateArgumentTypeEight, SpriteState.textTemplateArgumentTypeNine, CharacterReplacementSupport.textTemplateArgumentTypeTen, DropTargetWidget.textTemplateArgumentTypeEleven, IntKeyLookup.textTemplateArgumentTypeTwelve, ProxyAuthenticationRequiredException.textTemplateArgumentTypeThirteen, MeshPrioritySupport.textTemplateArgumentTypeFourteen, textTemplateArgumentTypeFifteen};
    }

    public GzipInflater() {
        this(-1, 1000000, 1000000);
    }

    final static TextValidationFailure validateDomainText(String domainText, boolean skipValidation) {
        int labelIndex = 0;
        int textLength = 0;
        RuntimeException validationFailureForContext = null;
        String[] domainLabels = null;
        String[] labelsForIteration = null;
        String domainLabel = null;
        TextValidationFailure labelFailure = null;
        int unusedClientControlSnapshot = 0;
        TextValidationFailure skippedValidationResultBeforeReturn = null;
        TextValidationFailure emptyTextFailureBeforeReturn = null;
        TextValidationFailure overlongTextFailureBeforeReturn = null;
        TextValidationFailure missingLabelFailureBeforeReturn = null;
        TextValidationFailure labelFailureBeforeReturn = null;
        TextValidationFailure numericFinalLabelFailureBeforeReturn = null;
        RuntimeException validationFailureBeforeDescription = null;
        StringBuilder validationMessagePrefix = null;
        String domainDescription = null;
        RuntimeException caughtValidationFailure = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (skipValidation) {
            skippedValidationResultBeforeReturn = (TextValidationFailure) null;
            return skippedValidationResultBeforeReturn;
          }
          textLength = domainText.length();
          if (textLength == 0) {
            emptyTextFailureBeforeReturn = InstrumentNoteMask.missingTextComponentFailure;
            return emptyTextFailureBeforeReturn;
          }
          if (255 < textLength) {
            overlongTextFailureBeforeReturn = ButtonWidget.overlongTextFailure;
            return overlongTextFailureBeforeReturn;
          }
          domainLabels = FullscreenFailureReason.splitAtCharacter('.', true, domainText);
          if (domainLabels.length < 2) {
            missingLabelFailureBeforeReturn = InstrumentNoteMask.missingTextComponentFailure;
            return missingLabelFailureBeforeReturn;
          }
          labelsForIteration = domainLabels;
          for (labelIndex = 0; labelsForIteration.length > labelIndex; labelIndex++) {
            domainLabel = labelsForIteration[labelIndex];
            labelFailure = FullscreenSupport.validateDomainLabel(255, domainLabel);
            if (labelFailure != null) {
              labelFailureBeforeReturn = labelFailure;
              return labelFailureBeforeReturn;
            }
          }
          numericFinalLabelFailureBeforeReturn = TextConcatenationSupport.validateAsciiDigits(domainLabels[-1 + domainLabels.length], (byte) -97);
          return numericFinalLabelFailureBeforeReturn;
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeDescription = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("fe.B(");
          if (domainText == null) {
            domainDescription = "null";
          } else {
            domainDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeDescription), ((StringBuilder) (Object) validationMessagePrefix).append(domainDescription).append(',').append(skipValidation).append(')').toString());
        }
    }

    private GzipInflater(int unusedFirstArgument, int unusedSecondArgument, int unusedThirdArgument) {
    }

    static {
        pendingLoginUiAction = -1;
        threeKindFourRemovalAchievementId = 7;
        textTemplateArgumentTypeFifteen = new TextTemplateArgumentType(15, 0, 1, 0);
    }
}
