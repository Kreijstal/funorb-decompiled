/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;

    final static void a(int param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (param1 % 10L == (long)param0) {
            ji.a(-1L + param1, (byte) -33);
            ji.a(1L, (byte) -33);
        } else {
            ji.a(param1, (byte) -33);
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
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
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
              if (characterCode >= 128) {
                if (characterCode < 160) {
                  mappedCharacterCode = lf.extendedTextCharacters[-128 + characterCode];
                  if (mappedCharacterCode == 0) {
                    mappedCharacterCode = 63;
                  }
                  characterCode = mappedCharacterCode;
                }
              }
              outputIndex = decodedLength;
              decodedLength++;
              writeBuffer[outputIndex] = (char)characterCode;
            }
          }
          stackIn_14_0 = new String(decodedBuffer, 0, decodedLength);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var4_ref);
          stackIn_17_1 = new StringBuilder().append("bc.B(").append(decodeGuard).append(',');
          if (textBytes == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(offset).append(',').append(length).append(')').toString());
        }
    }

    static {
        field_a = -1;
    }
}
