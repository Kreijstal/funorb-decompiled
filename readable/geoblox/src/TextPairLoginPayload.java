/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextPairLoginPayload extends LoginPayload {
    static String createUnder13TermsText;
    static String startGameText;
    private String loginText;
    static int[] field_c;
    private String base38Text;
    static int[] packedMatchCandidates;
    static volatile int keyboardIdleTicks;

    final void writePayload(int methodGuard, ByteArrayBuffer buffer) {
        try {
            if (methodGuard <= 107) {
                byte[] var4 = (byte[]) null;
                TextPairLoginPayload.copyBytesWithDestinationOffset((byte[]) null, -72);
            }
            buffer.writeZeroPrefixedNullTerminatedText(this.loginText, (byte) -126);
            buffer.writeBase38Text(this.base38Text, false);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "nk.B(" + methodGuard + ',' + (buffer != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] copyBytesWithDestinationOffset(byte[] sourceBytes, int destinationOffset) {
        int sourceLength = 0;
        RuntimeException copyFailure = null;
        byte[] copiedBytes = null;
        byte[] copiedBytesResult = null;
        RuntimeException copyFailureForDiagnostic = null;
        StringBuilder copyFailureDiagnostic = null;
        String sourceDiagnostic = null;
        RuntimeException caughtCopyFailure = null;
        try {
          sourceLength = sourceBytes.length;
          copiedBytes = new byte[sourceLength];
          ArrayOperations.copyBytes(sourceBytes, 0, copiedBytes, destinationOffset, sourceLength);
          copiedBytesResult = copiedBytes;
          return copiedBytesResult;
        } catch (java.lang.RuntimeException arrayCopyFailure) {
          caughtCopyFailure = arrayCopyFailure;
          copyFailure = caughtCopyFailure;
          copyFailureForDiagnostic = copyFailure;
          copyFailureDiagnostic = new StringBuilder().append("nk.A(");
          if (sourceBytes == null) {
            sourceDiagnostic = "null";
          } else {
            sourceDiagnostic = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) copyFailureForDiagnostic), ((StringBuilder) (Object) copyFailureDiagnostic).append(sourceDiagnostic).append(',').append(destinationOffset).append(')').toString());
        }
    }

    public static void b(int param0) {
        createUnder13TermsText = null;
        packedMatchCandidates = null;
        startGameText = null;
        field_c = null;
        if (param0 != -17226) {
            startGameText = (String) null;
        }
    }

    final LoginPayloadKind payloadKind(byte methodGuard) {
        if (methodGuard != -32) {
            field_c = (int[]) null;
            return ej.field_b;
        }
        return ej.field_b;
    }

    TextPairLoginPayload(String loginText, String base38Text) {
        try {
            this.base38Text = base38Text;
            this.loginText = loginText;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "nk.<init>(" + (loginText != null ? "{...}" : "null") + ',' + (base38Text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        startGameText = "Start Game";
        createUnder13TermsText = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        packedMatchCandidates = new int[1000];
        keyboardIdleTicks = 0;
    }
}
