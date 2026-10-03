/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;

    final static void sleepMillis(int splitRemainder, long durationMillis) {
        if (!(durationMillis > 0L)) {
            return;
        }
        if (durationMillis % 10L == (long)splitRemainder) {
            ArchiveNetworkClient.sleepIgnoringInterrupt(-1L + durationMillis, (byte) -33);
            ArchiveNetworkClient.sleepIgnoringInterrupt(1L, (byte) -33);
        } else {
            ArchiveNetworkClient.sleepIgnoringInterrupt(durationMillis, (byte) -33);
        }
    }

    final static String decodeTextSlice(int decodeGuard, byte[] textBytes, int offset, int length) {
        int byteIndex = 0;
        int outputIndex = 0;
        char[] decodedCharacters = null;
        int decodedLength = 0;
        int characterCode = 0;
        int mappedCharacterCode = 0;
        char[] writeBuffer = null;
        char[] sharedBuffer = null;
        char[] decodedBuffer = null;
        String decodedTextBeforeReturn = null;
        RuntimeException decodingFailureBeforeDescription = null;
        StringBuilder decodingMessagePrefix = null;
        String textBytesDescription = null;
        RuntimeException caughtDecodingFailure = null;
        RuntimeException decodingFailureForContext = null;
        try {
          decodedBuffer = new char[length];
          sharedBuffer = decodedBuffer;
          writeBuffer = sharedBuffer;
          decodedCharacters = writeBuffer;
          if (decodeGuard > 0) {
            field_a = 49;
          }
          decodedLength = 0;
          for (byteIndex = 0; length > byteIndex; byteIndex++) {
            characterCode = textBytes[offset + byteIndex] & 255;
            if (characterCode != 0) {
              if ((characterCode >= 128) &&
                  (characterCode < 160)) {
                mappedCharacterCode = lf.extendedTextCharacters[-128 + characterCode];
                if (mappedCharacterCode == 0) {
                  mappedCharacterCode = 63;
                }
                characterCode = mappedCharacterCode;
              }
              outputIndex = decodedLength;
              decodedLength++;
              writeBuffer[outputIndex] = (char)characterCode;
            }
          }
          decodedTextBeforeReturn = new String(decodedBuffer, 0, decodedLength);
          return decodedTextBeforeReturn;
        } catch (java.lang.RuntimeException decodingFailure) {
          caughtDecodingFailure = decodingFailure;
          decodingFailureForContext = caughtDecodingFailure;
          decodingFailureBeforeDescription = decodingFailureForContext;
          decodingMessagePrefix = new StringBuilder().append("bc.B(").append(decodeGuard).append(',');
          if (textBytes == null) {
            textBytesDescription = "null";
          } else {
            textBytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodingFailureBeforeDescription), ((StringBuilder) (Object) decodingMessagePrefix).append(textBytesDescription).append(',').append(offset).append(',').append(length).append(')').toString());
        }
    }

    static {
        field_a = -1;
    }
}
