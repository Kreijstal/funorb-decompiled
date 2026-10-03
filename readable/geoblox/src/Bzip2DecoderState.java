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

    final static boolean a(ByteArrayBuffer param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            Bzip2DecoderState.closeSessionSocket((byte) 47);
          }
          var2_int = param0.readUnsignedByte((byte) 34);
          stackIn_5_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("jl.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void closeSessionSocket(byte methodGuard) {
        if (methodGuard < -113) {
            if (!(SpriteCheckboxRenderer.field_e == null)) {
                SpriteCheckboxRenderer.field_e.close(-122);
                SpriteCheckboxRenderer.field_e = null;
            }
            return;
        }
        avatarShockContactPending = true;
        if (!(SpriteCheckboxRenderer.field_e == null)) {
            SpriteCheckboxRenderer.field_e.close(-122);
            SpriteCheckboxRenderer.field_e = null;
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
