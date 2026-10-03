/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PacketByteCipher {
    private int lastResult;
    private int[] results;
    static String field_c;
    private int generationCounter;
    static String ticketingGoToWebsiteText;
    private int[] stateWords;
    private int accumulator;
    private int remainingResults;
    static Sprite sunForegroundSprite;

    private final void initialize(boolean initializeState) {
        int mixRoundOrBlockOffset = 0;
        int unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        int mixWord5 = -1640531527;
        int mixWord2 = -1640531527;
        int mixWord3 = -1640531527;
        int mixWord7 = -1640531527;
        if (!initializeState) {
            return;
        }
        int mixWord1 = -1640531527;
        int mixWord0 = -1640531527;
        int mixWord4 = -1640531527;
        int mixWord6 = -1640531527;
        for (mixRoundOrBlockOffset = 0; 4 > mixRoundOrBlockOffset; mixRoundOrBlockOffset++) {
            mixWord0 = mixWord0 ^ mixWord1 << 11;
            mixWord3 = mixWord3 + mixWord0;
            mixWord1 = mixWord1 + mixWord2;
            mixWord1 = mixWord1 ^ mixWord2 >>> 2;
            mixWord2 = mixWord2 + mixWord3;
            mixWord4 = mixWord4 + mixWord1;
            mixWord2 = mixWord2 ^ mixWord3 << 8;
            mixWord3 = mixWord3 + mixWord4;
            mixWord5 = mixWord5 + mixWord2;
            mixWord3 = mixWord3 ^ mixWord4 >>> 16;
            mixWord6 = mixWord6 + mixWord3;
            mixWord4 = mixWord4 + mixWord5;
            mixWord4 = mixWord4 ^ mixWord5 << 10;
            mixWord7 = mixWord7 + mixWord4;
            mixWord5 = mixWord5 + mixWord6;
            mixWord5 = mixWord5 ^ mixWord6 >>> 4;
            mixWord0 = mixWord0 + mixWord5;
            mixWord6 = mixWord6 + mixWord7;
            mixWord6 = mixWord6 ^ mixWord7 << 8;
            mixWord1 = mixWord1 + mixWord6;
            mixWord7 = mixWord7 + mixWord0;
            mixWord7 = mixWord7 ^ mixWord0 >>> 9;
            mixWord0 = mixWord0 + mixWord1;
            mixWord2 = mixWord2 + mixWord7;
        }
        for (mixRoundOrBlockOffset = 0; mixRoundOrBlockOffset < 256; mixRoundOrBlockOffset += 8) {
            mixWord5 = mixWord5 + this.results[mixRoundOrBlockOffset + 5];
            mixWord3 = mixWord3 + this.results[3 + mixRoundOrBlockOffset];
            mixWord7 = mixWord7 + this.results[7 + mixRoundOrBlockOffset];
            mixWord0 = mixWord0 + this.results[mixRoundOrBlockOffset];
            mixWord2 = mixWord2 + this.results[2 + mixRoundOrBlockOffset];
            mixWord4 = mixWord4 + this.results[4 + mixRoundOrBlockOffset];
            mixWord1 = mixWord1 + this.results[1 + mixRoundOrBlockOffset];
            mixWord6 = mixWord6 + this.results[mixRoundOrBlockOffset + 6];
            mixWord0 = mixWord0 ^ mixWord1 << 11;
            mixWord1 = mixWord1 + mixWord2;
            mixWord3 = mixWord3 + mixWord0;
            mixWord1 = mixWord1 ^ mixWord2 >>> 2;
            mixWord2 = mixWord2 + mixWord3;
            mixWord4 = mixWord4 + mixWord1;
            mixWord2 = mixWord2 ^ mixWord3 << 8;
            mixWord5 = mixWord5 + mixWord2;
            mixWord3 = mixWord3 + mixWord4;
            mixWord3 = mixWord3 ^ mixWord4 >>> 16;
            mixWord6 = mixWord6 + mixWord3;
            mixWord4 = mixWord4 + mixWord5;
            mixWord4 = mixWord4 ^ mixWord5 << 10;
            mixWord7 = mixWord7 + mixWord4;
            mixWord5 = mixWord5 + mixWord6;
            mixWord5 = mixWord5 ^ mixWord6 >>> 4;
            mixWord6 = mixWord6 + mixWord7;
            mixWord0 = mixWord0 + mixWord5;
            mixWord6 = mixWord6 ^ mixWord7 << 8;
            mixWord7 = mixWord7 + mixWord0;
            mixWord1 = mixWord1 + mixWord6;
            mixWord7 = mixWord7 ^ mixWord0 >>> 9;
            mixWord2 = mixWord2 + mixWord7;
            mixWord0 = mixWord0 + mixWord1;
            this.stateWords[mixRoundOrBlockOffset] = mixWord0;
            this.stateWords[1 + mixRoundOrBlockOffset] = mixWord1;
            this.stateWords[2 + mixRoundOrBlockOffset] = mixWord2;
            this.stateWords[3 + mixRoundOrBlockOffset] = mixWord3;
            this.stateWords[mixRoundOrBlockOffset + 4] = mixWord4;
            this.stateWords[mixRoundOrBlockOffset + 5] = mixWord5;
            this.stateWords[6 + mixRoundOrBlockOffset] = mixWord6;
            this.stateWords[7 + mixRoundOrBlockOffset] = mixWord7;
        }
        for (mixRoundOrBlockOffset = 0; 256 > mixRoundOrBlockOffset; mixRoundOrBlockOffset += 8) {
            mixWord6 = mixWord6 + this.stateWords[mixRoundOrBlockOffset + 6];
            mixWord0 = mixWord0 + this.stateWords[mixRoundOrBlockOffset];
            mixWord7 = mixWord7 + this.stateWords[mixRoundOrBlockOffset + 7];
            mixWord3 = mixWord3 + this.stateWords[3 + mixRoundOrBlockOffset];
            mixWord1 = mixWord1 + this.stateWords[1 + mixRoundOrBlockOffset];
            mixWord5 = mixWord5 + this.stateWords[5 + mixRoundOrBlockOffset];
            mixWord2 = mixWord2 + this.stateWords[mixRoundOrBlockOffset + 2];
            mixWord4 = mixWord4 + this.stateWords[mixRoundOrBlockOffset + 4];
            mixWord0 = mixWord0 ^ mixWord1 << 11;
            mixWord3 = mixWord3 + mixWord0;
            mixWord1 = mixWord1 + mixWord2;
            mixWord1 = mixWord1 ^ mixWord2 >>> 2;
            mixWord4 = mixWord4 + mixWord1;
            mixWord2 = mixWord2 + mixWord3;
            mixWord2 = mixWord2 ^ mixWord3 << 8;
            mixWord3 = mixWord3 + mixWord4;
            mixWord5 = mixWord5 + mixWord2;
            mixWord3 = mixWord3 ^ mixWord4 >>> 16;
            mixWord4 = mixWord4 + mixWord5;
            mixWord6 = mixWord6 + mixWord3;
            mixWord4 = mixWord4 ^ mixWord5 << 10;
            mixWord7 = mixWord7 + mixWord4;
            mixWord5 = mixWord5 + mixWord6;
            mixWord5 = mixWord5 ^ mixWord6 >>> 4;
            mixWord0 = mixWord0 + mixWord5;
            mixWord6 = mixWord6 + mixWord7;
            mixWord6 = mixWord6 ^ mixWord7 << 8;
            mixWord1 = mixWord1 + mixWord6;
            mixWord7 = mixWord7 + mixWord0;
            mixWord7 = mixWord7 ^ mixWord0 >>> 9;
            mixWord0 = mixWord0 + mixWord1;
            mixWord2 = mixWord2 + mixWord7;
            this.stateWords[mixRoundOrBlockOffset] = mixWord0;
            this.stateWords[1 + mixRoundOrBlockOffset] = mixWord1;
            this.stateWords[mixRoundOrBlockOffset + 2] = mixWord2;
            this.stateWords[3 + mixRoundOrBlockOffset] = mixWord3;
            this.stateWords[4 + mixRoundOrBlockOffset] = mixWord4;
            this.stateWords[5 + mixRoundOrBlockOffset] = mixWord5;
            this.stateWords[6 + mixRoundOrBlockOffset] = mixWord6;
            this.stateWords[7 + mixRoundOrBlockOffset] = mixWord7;
        }
        this.generateResults(-108);
        this.remainingResults = 256;
    }

    final int nextInt(int regenerateAtRemaining) {
        if (!(this.remainingResults != regenerateAtRemaining)) {
            this.generateResults(-125);
            this.remainingResults = 256;
        }
        int resultIndex = this.remainingResults - 1;
        this.remainingResults = this.remainingResults - 1;
        return this.results[resultIndex];
    }

    private final void generateResults(int methodGuard) {
        int updatedStateWord = 0;
        int generatedResult = 0;
        int wordIndex;
        int previousStateWord;
        int stateWordForResultLookup;
        int incrementedGenerationCounter = this.generationCounter + 1;
        this.generationCounter = this.generationCounter + 1;
        this.lastResult = this.lastResult + incrementedGenerationCounter;
        wordIndex = 0;
        if (methodGuard >= -10) {
          PacketByteCipher.a((byte) 89);
        }
        while (wordIndex < 256) {
          previousStateWord = this.stateWords[wordIndex];
          if (0 == (2 & wordIndex)) {
            if ((1 & wordIndex) != 0) {
              this.accumulator = this.accumulator ^ this.accumulator >>> 6;
            } else {
              this.accumulator = this.accumulator ^ this.accumulator << 13;
            }
          } else {
            if ((wordIndex & 1) != 0) {
              this.accumulator = this.accumulator ^ this.accumulator >>> 16;
            } else {
              this.accumulator = this.accumulator ^ this.accumulator << 2;
            }
          }
          this.accumulator = this.accumulator + this.stateWords[255 & 128 + wordIndex];
          updatedStateWord = this.lastResult + (this.accumulator + this.stateWords[ProxySocketConnector.andInt(255, previousStateWord >> 2)]);
          stateWordForResultLookup = updatedStateWord;
          this.stateWords[wordIndex] = updatedStateWord;
          generatedResult = previousStateWord + this.stateWords[ProxySocketConnector.andInt(stateWordForResultLookup >> 8, 1020) >> 2];
          this.lastResult = generatedResult;
          this.results[wordIndex] = generatedResult;
          wordIndex++;
        }
    }

    final static void a(byte param0) {
        int var1 = DiskCacheWorker.avatarTintPalette[-1 + DiskCacheWorker.avatarTintPalette.length];
        SocketArchiveNetworkClient.field_x = (float)(-(255 & si.field_j) + (255 & var1));
        MenuScreen.introTintGreenDelta = (float)(-(si.field_j >> 8 & 255) + (var1 >> 8 & 255));
        TextLayoutLine.field_b = (float)(((var1 & 16735942) >> 16) - (si.field_j >> 16 & 255));
        int var2 = 80 % ((5 - param0) / 52);
        IntrusiveNodeHashTable.a(0, ll.field_d);
    }

    public static void b(byte param0) {
        sunForegroundSprite = null;
        if (param0 > -92) {
            ticketingGoToWebsiteText = (String) null;
            field_c = null;
            ticketingGoToWebsiteText = null;
            return;
        }
        field_c = null;
        ticketingGoToWebsiteText = null;
    }

    PacketByteCipher(int[] seed) {
        int seedWordIndex = 0;
        try {
            this.stateWords = new int[256];
            this.results = new int[256];
            for (seedWordIndex = 0; seed.length > seedWordIndex; seedWordIndex++) {
                this.results[seedWordIndex] = seed[seedWordIndex];
            }
            this.initialize(true);
        } catch (RuntimeException cipherConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cipherConstructionFailure), "ne.<init>(" + (seed != null ? "{...}" : "null") + ')');
        }
    }

    static {
        ticketingGoToWebsiteText = "Visit the Account Management section on the main site to view.";
        field_c = "Discard results";
    }
}
