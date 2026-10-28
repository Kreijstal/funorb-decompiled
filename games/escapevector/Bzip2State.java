/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2State {
    int bitCount;
    int transformPosition;
    byte outputByte;
    int bitBuffer;
    int[] minimumCodeLengths;
    int[][] huffmanPermutations;
    int repeatRemaining;
    int[][] huffmanLimits;
    boolean[] symbolsInUse;
    static int field_p;
    int inputPosition;
    int originalPointer;
    static int[] field_y;
    int blockBytesUsed;
    byte[] mtfSymbols;
    int outputRemaining;
    byte[] input;
    byte[] symbolMap;
    int totalOutputBytes;
    int[] symbolFrequencies;
    int[][] huffmanBases;
    int usedSymbolCount;
    byte[] selectorMtf;
    int outputPosition;
    int blockLength;
    static int[] field_v;
    byte[][] codeLengths;
    int totalInputBytes;
    int[] mtfBaseIndices;
    static PcmSample field_G;
    boolean[] symbolGroupsInUse;
    int nextByte;
    byte[] output;
    int[] cumulativeFrequencies;
    int blockSize100k;
    byte[] selectors;

    public static void releaseStatics(int guard) {
        field_y = null;
        field_G = null;
        if (guard != 8192) {
          field_y = (int[]) null;
          field_v = null;
          return;
        }
        field_v = null;
    }

    final static void openBrowserUrl(boolean guard, boolean unusedFlag, java.applet.Applet applet, String url) {
        try {
          String stackIn_14_2 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (SystemTaskService.osNameLowerCase.startsWith("win") &&
              RasterRestoreSupport.openWindowsUrl((byte) 38, url)) {
              return;
            }
            try {
              applet.getAppletContext().showDocument(new java.net.URL(url), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              java.net.MalformedURLException var4_ref = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              GameModeSelectScreen.reportClientError(false, "MGR1: " + url, (Throwable) null);
            }
            if (guard) {
              return;
            }
            field_p = -75;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var4 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_13_0 = var4;
            StringBuilder stackIn_13_1 = new StringBuilder().append("th.B(").append(guard).append(',').append(unusedFlag).append(',');
            if (applet == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (url == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    Bzip2State() {
        this.symbolsInUse = new boolean[256];
        this.mtfSymbols = new byte[4096];
        this.huffmanPermutations = new int[6][258];
        this.symbolMap = new byte[256];
        this.inputPosition = 0;
        this.huffmanBases = new int[6][258];
        this.outputPosition = 0;
        this.symbolFrequencies = new int[256];
        this.codeLengths = new byte[6][258];
        this.huffmanLimits = new int[6][258];
        this.symbolGroupsInUse = new boolean[16];
        this.cumulativeFrequencies = new int[257];
        this.minimumCodeLengths = new int[6];
        this.mtfBaseIndices = new int[16];
        this.selectorMtf = new byte[18002];
        this.selectors = new byte[18002];
    }

    static {
        field_p = 0;
        field_y = new int[8192];
    }
}
