/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BytePayloadRequest extends IntrusiveNode {
    final static void sleepMillis(int obfuscationGuard, long millis) {
        if (obfuscationGuard > -123) {
          BytePayloadRequest.sleepMillis(112, -29L);
          if (0L >= millis) {
            return;
          }
          if (0L != millis % 10L) {
            ArchiveSource.sleepOnce(-29869, millis);
            return;
          }
          ArchiveSource.sleepOnce(-29869, -1L + millis);
          ArchiveSource.sleepOnce(-29869, 1L);
          return;
        }
        if (0L >= millis) {
          return;
        }
        if (0L != millis % 10L) {
          ArchiveSource.sleepOnce(-29869, millis);
          return;
        }
        ArchiveSource.sleepOnce(-29869, -1L + millis);
        ArchiveSource.sleepOnce(-29869, 1L);
    }

    final static String replaceCharacter(int capacityAdjustment, String text, char character, String replacement) {
        StringBuilder tailAppendResult = null;
        StringBuilder literalAppendResult = null;
        StringBuilder replacementAppendResult = null;
        int textLength = 0;
        int replacementLength = 0;
        int outputCapacity = 0;
        int capacityDelta = 0;
        int countScanIndex = 0;
        StringBuilder resultBuilder = null;
        int literalStart = 0;
        int matchIndex = 0;
        int unusedGameFlag = 0;
        String result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String textSummary = null;
        StringBuilder replacementContextBuilder = null;
        String replacementSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          textLength = text.length();
          replacementLength = replacement.length();
          outputCapacity = textLength;
          capacityDelta = capacityAdjustment + replacementLength;
          if (capacityDelta != 0) {
            countScanIndex = 0;
            while (true) {
              countScanIndex = text.indexOf((int) character, countScanIndex);
              if (countScanIndex < 0) {
                break;
              }
              countScanIndex++;
              outputCapacity = outputCapacity + capacityDelta;
            }
          }
          resultBuilder = new StringBuilder(outputCapacity);
          literalStart = 0;
          while (true) {
            matchIndex = text.indexOf((int) character, literalStart);
            if (matchIndex < 0) {
              tailAppendResult = resultBuilder.append(text.substring(literalStart));
              result = resultBuilder.toString();
              return result;
            }
            literalAppendResult = resultBuilder.append(text.substring(literalStart, matchIndex));
            literalStart = 1 + matchIndex;
            replacementAppendResult = resultBuilder.append(replacement);
          }
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("wj.A(").append(capacityAdjustment).append(',');
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          replacementContextBuilder = ((StringBuilder) (Object) contextBuilder).append(textSummary).append(',').append(character).append(',');
          if (replacement == null) {
            replacementSummary = "null";
          } else {
            replacementSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) replacementContextBuilder).append(replacementSummary).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, MusicTrack param5, boolean param6) {
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var7 = DirectByteStorage.field_f;
          synchronized (var7) {
            ConditionalTextValue.musicSynthesizer.setChannelGain(param2, -1, 16);
            if (param3) {
              return;
            }
            IterableIntrusiveHashTable.a(25459, param6, param5, param4, param0, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("wj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) (stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param6).append(')').toString());
        }
    }

    private BytePayloadRequest() throws Throwable {
        throw new Error();
    }

    static {
    }
}
