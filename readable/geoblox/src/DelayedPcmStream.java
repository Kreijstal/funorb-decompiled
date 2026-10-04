/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPcmStream extends PcmStream {
    private PcmStream wrappedStream;
    private int remainingDelayFrames;
    static String usernameQueryCandidate;

    final static int countCharacterOccurrences(CharSequence text, boolean methodGuard, char character) {
        int characterIndex = 0;
        int occurrenceCount = 0;
        RuntimeException countFailure = null;
        int textLength = 0;
        int returnedOccurrenceCount = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String textDescription = null;
        RuntimeException caughtCountFailure = null;
        try {
          occurrenceCount = 0;
          if (!methodGuard) {
            DelayedPcmStream.beginSessionRetryAndCheckStageEleven(false);
          }
          textLength = text.length();
          for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
            if (text.charAt(characterIndex) == character) {
              occurrenceCount++;
            }
          }
          returnedOccurrenceCount = occurrenceCount;
          return returnedOccurrenceCount;
        } catch (java.lang.RuntimeException countParameterFailure) {
          caughtCountFailure = countParameterFailure;
          countFailure = caughtCountFailure;
          failureContextCause = countFailure;
          failureContextBuilder = new StringBuilder().append("cg.K(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(textDescription).append(',').append(methodGuard).append(',').append(character).append(')').toString());
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final static boolean beginSessionRetryAndCheckStageEleven(boolean suppressReconnectPageNotification) {
        TextWidgetRenderer.suppressReconnectErrorPage = suppressReconnectPageNotification ? true : false;
        DisplayNamePanel.connectionRetryDeadlineMillis = 15000L + ClientClockSupport.correctedCurrentTimeMillis(-12520);
        return SpriteConstructionSupport.clientScreenStage == 11 ? true : false;
    }

    final void skipFrames(int frameCount) {
        if (frameCount < this.remainingDelayFrames) {
            this.remainingDelayFrames = this.remainingDelayFrames - frameCount;
            return;
        }
        frameCount = frameCount - this.remainingDelayFrames;
        this.remainingDelayFrames = 0;
        this.wrappedStream.previousNode = this.previousNode;
        this.wrappedStream.nextNode = this.nextNode;
        this.previousNode.nextNode = (IntrusiveNode) ((Object) this.wrappedStream);
        this.nextNode.previousNode = (IntrusiveNode) ((Object) this.wrappedStream);
        this.previousNode = null;
        this.nextNode = null;
        if (!(0 >= frameCount)) {
            this.wrappedStream.skipFrames(frameCount);
        }
    }

    final PcmStream firstChildStream() {
        return null;
    }

    final int getSchedulingPriority() {
        return this.wrappedStream.getSchedulingPriority();
    }

    public static void clearUsernameQueryCandidate(byte methodGuard) {
        if (methodGuard > -107) {
            DelayedPcmStream.clearUsernameQueryCandidate((byte) -13);
        }
        usernameQueryCandidate = null;
    }

    final PcmStream nextChildStream() {
        return null;
    }

    final static boolean getAccountNewsOptIn(byte methodGuard) {
        if (methodGuard <= 18) {
            return false;
        }
        return CachedArchiveSource.accountCreationNewsOptIn;
    }

    final void mixInto(int[] destination, int destinationOffset, int frameCount) {
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String destinationDescription = null;
        RuntimeException caughtMixFailure = null;
        RuntimeException mixFailure = null;
        try {
          if (this.remainingDelayFrames > frameCount) {
            this.remainingDelayFrames = this.remainingDelayFrames - frameCount;
            return;
          }
          destinationOffset = destinationOffset + this.remainingDelayFrames;
          frameCount = frameCount - this.remainingDelayFrames;
          this.remainingDelayFrames = 0;
          this.wrappedStream.nextNode = this.nextNode;
          this.wrappedStream.previousNode = this.previousNode;
          this.previousNode.nextNode = (IntrusiveNode) ((Object) this.wrappedStream);
          this.nextNode.previousNode = (IntrusiveNode) ((Object) this.wrappedStream);
          this.previousNode = null;
          this.nextNode = null;
          if (frameCount > 0) {
            this.wrappedStream.mixInto(destination, destinationOffset, frameCount);
          }
          return;
        } catch (java.lang.RuntimeException mixParameterFailure) {
          caughtMixFailure = mixParameterFailure;
          mixFailure = caughtMixFailure;
          failureContextCause = mixFailure;
          failureContextBuilder = new StringBuilder().append("cg.C(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(destinationDescription).append(',').append(destinationOffset).append(',').append(frameCount).append(')').toString());
        }
    }

    DelayedPcmStream(PcmStream stream, int delayFrames) {
        try {
            this.wrappedStream = stream;
            this.sample = this.wrappedStream.sample;
            this.remainingDelayFrames = delayFrames;
        } catch (RuntimeException delayConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) delayConstructionFailure), "cg.<init>(" + (stream != null ? "{...}" : "null") + ',' + delayFrames + ')');
        }
    }

    static {
    }
}
