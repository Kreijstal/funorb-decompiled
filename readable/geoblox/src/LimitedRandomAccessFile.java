/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class LimitedRandomAccessFile {
    static FullscreenFailureReason fullscreenTimeoutFailureReason;
    private long maximumLength;
    static String waitingForSoundEffectsText;
    static String scoreTextTemplate;
    private RandomAccessFile file;
    private long position;
    static int avatarFeedbackHoldTicks;

    final void write(byte[] source, int sourceOffset, int methodGuard, int length) throws IOException {
        try {
            if (this.maximumLength < (long)length + this.position) {
                this.file.seek(this.maximumLength);
                this.file.write(1);
                throw new EOFException();
            }
            if (methodGuard != 90) {
                LimitedRandomAccessFile.releaseStaticReferences((byte) 102);
            }
            this.file.write(source, sourceOffset, length);
            this.position = this.position + (long)length;
        } catch (RuntimeException writeFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) writeFailure), "pa.A(" + (source != null ? "{...}" : "null") + ',' + sourceOffset + ',' + methodGuard + ',' + length + ')');
        }
    }

    final int read(int length, byte[] destination, int destinationOffset, boolean methodGuard) throws IOException {
        int bytesRead = 0;
        RuntimeException readFailureForContext = null;
        int bytesReadBeforeReturn = 0;
        RuntimeException readFailureBeforeContext = null;
        StringBuilder readMessagePrefix = null;
        String destinationDescription = null;
        RuntimeException caughtReadFailure = null;
        try {
          bytesRead = this.file.read(destination, destinationOffset, length);
          if (bytesRead > 0) {
            this.position = this.position + (long)bytesRead;
          }
          if (methodGuard) {
            avatarFeedbackHoldTicks = -101;
          }
          bytesReadBeforeReturn = bytesRead;
          return bytesReadBeforeReturn;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = caughtReadFailure;
          readFailureBeforeContext = readFailureForContext;
          readMessagePrefix = new StringBuilder().append("pa.D(").append(length).append(',');
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readFailureBeforeContext), ((StringBuilder) (Object) readMessagePrefix).append(destinationDescription).append(',').append(destinationOffset).append(',').append(methodGuard).append(')').toString());
        }
    }

    final long length(int methodGuard) throws IOException {
        if (methodGuard != 1) {
            return -83L;
        }
        return this.file.length();
    }

    public static void releaseStaticReferences(byte methodGuard) {
        waitingForSoundEffectsText = null;
        if (methodGuard <= 3) {
            return;
        }
        fullscreenTimeoutFailureReason = null;
        scoreTextTemplate = null;
    }

    final static boolean isValidSignedIntText(CharSequence numberText, boolean allowLeadingPlus, int radix, int methodGuard) {
        int characterIndex = 0;
        int hasDigitsBeforeReturn = 0;
        RuntimeException validationFailureBeforeDescription = null;
        StringBuilder validationMessagePrefix = null;
        String numberDescription = null;
        RuntimeException caughtValidationFailure = null;
        int negativeNumberFlag = 0;
        RuntimeException validationFailureForContext = null;
        int hasDigitFlag = 0;
        int accumulatedValue = 0;
        int textLength = 0;
        int characterCodeThenSignedDigit = 0;
        int nextAccumulatedValue = 0;
        try {
          if ((2 <= radix) &&
              (radix <= 36)) {
            negativeNumberFlag = 0;
            hasDigitFlag = 0;
            accumulatedValue = 0;
            textLength = numberText.length();
            if (methodGuard != 87) {
              fullscreenTimeoutFailureReason = (FullscreenFailureReason) null;
            }
            for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
              signedNumberCharacter: {
                characterCodeThenSignedDigit = numberText.charAt(characterIndex);
                if (characterIndex == 0) {
                  if (45 == characterCodeThenSignedDigit) {
                    negativeNumberFlag = 1;
                    break signedNumberCharacter;
                  }
                  if ((characterCodeThenSignedDigit == 43) &&
                      (allowLeadingPlus)) {
                    break signedNumberCharacter;
                  }
                }
                if ((characterCodeThenSignedDigit >= 48) &&
                    (characterCodeThenSignedDigit <= 57)) {
                  characterCodeThenSignedDigit -= 48;
                } else if ((characterCodeThenSignedDigit >= 65) &&
                    (characterCodeThenSignedDigit <= 90)) {
                  characterCodeThenSignedDigit -= 55;
                } else if ((characterCodeThenSignedDigit >= 97) &&
                    (characterCodeThenSignedDigit <= 122)) {
                  characterCodeThenSignedDigit -= 87;
                } else {
                  return false;
                }
                if (characterCodeThenSignedDigit >= radix) {
                  return false;
                }
                if (negativeNumberFlag != 0) {
                  characterCodeThenSignedDigit = -characterCodeThenSignedDigit;
                }
                nextAccumulatedValue = accumulatedValue * radix + characterCodeThenSignedDigit;
                if (accumulatedValue != nextAccumulatedValue / radix) {
                  return false;
                }
                accumulatedValue = nextAccumulatedValue;
                hasDigitFlag = 1;
              }
            }
            hasDigitsBeforeReturn = hasDigitFlag;
            return hasDigitsBeforeReturn != 0;
          }
          throw new IllegalArgumentException("" + radix);
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeDescription = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("pa.B(");
          if (numberText == null) {
            numberDescription = "null";
          } else {
            numberDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeDescription), ((StringBuilder) (Object) validationMessagePrefix).append(numberDescription).append(',').append(allowLeadingPlus).append(',').append(radix).append(',').append(methodGuard).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.file) {
            System.out.println("");
            this.close((byte) -5);
        }
    }

    final static void openUrlInNewWindow(String urlText, byte methodGuard, boolean unusedNavigationFlag, java.applet.Applet applet) {
        try {
            int guardResidue = 0;
            RuntimeException navigationFailureBeforeContext = null;
            StringBuilder navigationMessagePrefix = null;
            String urlDescription = null;
            StringBuilder messageBeforeAppletDescription = null;
            String appletDescription = null;
            Throwable caughtNavigationFailure = null;
            java.net.MalformedURLException malformedUrlFailureForReport = null;
            RuntimeException navigationFailureForContext = null;
            try {
              if ((PlatformTaskDispatcher.osNameLowerCase.startsWith("win")) &&
                  (GameplaySession.tryOpenUrlWithWindowsShell(urlText, false))) {
                return;
              }
              try {
                guardResidue = -83 / ((methodGuard + 55) / 62);
                applet.getAppletContext().showDocument(new java.net.URL(urlText), "_blank");
              } catch (java.net.MalformedURLException malformedUrlFailure) {
                caughtNavigationFailure = malformedUrlFailure;
                malformedUrlFailureForReport = (java.net.MalformedURLException) (Object) caughtNavigationFailure;
                IterableNodeHashTable.reportClientError((Throwable) null, "MGR1: " + urlText, (byte) 125);
              }
              return;
            } catch (java.lang.RuntimeException navigationContextFailure) {
              caughtNavigationFailure = navigationContextFailure;
              navigationFailureForContext = (RuntimeException) (Object) caughtNavigationFailure;
              navigationFailureBeforeContext = navigationFailureForContext;
              navigationMessagePrefix = new StringBuilder().append("pa.F(");
              if (urlText == null) {
                urlDescription = "null";
              } else {
                urlDescription = "{...}";
              }
              messageBeforeAppletDescription = ((StringBuilder) (Object) navigationMessagePrefix).append(urlDescription).append(',').append(methodGuard).append(',').append(unusedNavigationFlag).append(',');
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) navigationFailureBeforeContext), ((StringBuilder) (Object) messageBeforeAppletDescription).append(appletDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedNavigationFailure) {
            throw uncheckedNavigationFailure;
        } catch (Throwable checkedNavigationFailure) {
            throw new RuntimeException(checkedNavigationFailure);
        }
    }

    LimitedRandomAccessFile(File path, String mode, long maximumLength) throws IOException {
        int firstByte = 0;
        try {
            if (maximumLength == -1L) {
                maximumLength = 9223372036854775807L;
            }
            if (~maximumLength > ~path.length()) {
                path.delete();
            }
            this.file = new RandomAccessFile(path, mode);
            this.maximumLength = maximumLength;
            this.position = 0L;
            firstByte = this.file.read();
            if (firstByte != -1 && !mode.equals("r")) {
                this.file.seek(0L);
                this.file.write(firstByte);
            }
            this.file.seek(0L);
        } catch (RuntimeException constructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailure), "pa.<init>(" + (path != null ? "{...}" : "null") + ',' + (mode != null ? "{...}" : "null") + ',' + maximumLength + ')');
        }
    }

    final void seek(long position, boolean methodGuard) throws IOException {
        this.file.seek(position);
        this.position = position;
        if (!methodGuard) {
            waitingForSoundEffectsText = (String) null;
        }
    }

    final void close(byte methodGuard) throws IOException {
        if (methodGuard != -5) {
            return;
        }
        if (null != this.file) {
            this.file.close();
            this.file = null;
        }
    }

    static {
        fullscreenTimeoutFailureReason = new FullscreenFailureReason();
        scoreTextTemplate = "Score: <%0>";
        waitingForSoundEffectsText = "Waiting for sound effects";
        avatarFeedbackHoldTicks = 0;
    }
}
