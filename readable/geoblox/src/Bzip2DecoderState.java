/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2DecoderState {
    static boolean avatarShockContactPending;
    int blockLength;
    int outputBytesWritten;
    byte[] moveToFrontBytes;
    byte pendingRunByte;
    byte[] huffmanSelectors;
    int outputPosition;
    int inputPosition;
    int[][] huffmanLimits;
    int[][] huffmanBases;
    byte[] inputBytes;
    int inputBytesRead;
    boolean[] usedByteGroups;
    byte[] outputBytes;
    int bufferedBitCount;
    int pendingRunLength;
    int[][] huffmanSymbols;
    byte[] alphabetBytes;
    int[] byteFrequencies;
    int[] moveToFrontBlockStarts;
    byte[][] huffmanCodeLengths;
    int originalPointer;
    int blockSize100k;
    int transformPositionOrEntry;
    int[] minimumCodeLengths;
    int alphabetSize;
    int remainingOutputBytes;
    int bitBuffer;
    int[] byteBucketPositions;
    boolean[] usedBytes;
    int currentByte;
    int blockBytesConsumed;
    byte[] selectorMoveToFrontValues;

    final static boolean readByteEqualsOne(ByteArrayBuffer buffer, int methodGuard) {
        int unsignedByteValue = 0;
        RuntimeException readFailureForContext = null;
        int equalsOneFlag = 0;
        int equalsOneFlagBeforeStore = 0;
        int equalsOneFlagBeforeReturn = 0;
        RuntimeException readFailureBeforeDescription = null;
        StringBuilder readMessagePrefix = null;
        String bufferDescription = null;
        RuntimeException caughtReadFailure = null;
        try {
          if (methodGuard != 0) {
            Bzip2DecoderState.closeSessionSocket((byte) 47);
          }
          unsignedByteValue = buffer.readUnsignedByte((byte) 34);
          equalsOneFlagBeforeStore = (unsignedByteValue == 1) ? 1 : 0;
          equalsOneFlag = equalsOneFlagBeforeStore;
          equalsOneFlagBeforeReturn = equalsOneFlag;
          return equalsOneFlagBeforeReturn != 0;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = caughtReadFailure;
          readFailureBeforeDescription = readFailureForContext;
          readMessagePrefix = new StringBuilder().append("jl.B(");
          if (buffer == null) {
            bufferDescription = "null";
          } else {
            bufferDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readFailureBeforeDescription), ((StringBuilder) (Object) readMessagePrefix).append(bufferDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static void closeSessionSocket(byte methodGuard) {
        if (methodGuard < -113) {
            if (SpriteCheckboxRenderer.sessionSocket != null) {
                SpriteCheckboxRenderer.sessionSocket.close(-122);
                SpriteCheckboxRenderer.sessionSocket = null;
            }
            return;
        }
        avatarShockContactPending = true;
        if (SpriteCheckboxRenderer.sessionSocket != null) {
            SpriteCheckboxRenderer.sessionSocket.close(-122);
            SpriteCheckboxRenderer.sessionSocket = null;
        }
    }

    Bzip2DecoderState() {
        this.outputPosition = 0;
        this.inputPosition = 0;
        this.huffmanLimits = new int[6][258];
        this.huffmanSelectors = new byte[18002];
        this.usedByteGroups = new boolean[16];
        this.alphabetBytes = new byte[256];
        this.moveToFrontBlockStarts = new int[16];
        this.huffmanSymbols = new int[6][258];
        this.byteFrequencies = new int[256];
        this.minimumCodeLengths = new int[6];
        this.huffmanBases = new int[6][258];
        this.byteBucketPositions = new int[257];
        this.moveToFrontBytes = new byte[4096];
        this.selectorMoveToFrontValues = new byte[18002];
        this.huffmanCodeLengths = new byte[6][258];
        this.usedBytes = new boolean[256];
    }

    static {
    }
}
