/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IsaacGenerator {
    static MusicTrack field_a;
    private int accumulator;
    private int[] results;
    private int remaining;
    static n field_g;
    private int blockCounter;
    static int ignoreCount;
    private int[] memory;
    private int lastResult;
    static int field_i;
    static ScrollPane field_b;
    static int field_n;
    static int field_c;
    static int field_f;

    private final void generateBlock(byte obfuscationGuard) {
        int nextBlockCounter = 0;
        int wordIndex = 0;
        int newMemoryWord = 0;
        int newResult = 0;
        int oldMemoryWord;
        int memoryWord;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard >= -64) {
          return;
        }
        nextBlockCounter = this.blockCounter + 1;
        this.blockCounter = this.blockCounter + 1;
        this.lastResult = this.lastResult + nextBlockCounter;
        for (wordIndex = 0; wordIndex < 256; wordIndex++) {
          oldMemoryWord = this.memory[wordIndex];
          if ((2 & wordIndex) == 0) {
            if ((1 & wordIndex) == 0) {
              this.accumulator = this.accumulator ^ this.accumulator << 13;
            } else {
              this.accumulator = this.accumulator ^ this.accumulator >>> 6;
            }
          } else {
            if ((wordIndex & 1) == 0) {
              this.accumulator = this.accumulator ^ this.accumulator << 2;
            } else {
              this.accumulator = this.accumulator ^ this.accumulator >>> 16;
            }
          }
          this.accumulator = this.accumulator + this.memory[255 & wordIndex + 128];
          newMemoryWord = this.lastResult + (this.accumulator + this.memory[ik.a(1020, oldMemoryWord) >> 2]);
          memoryWord = newMemoryWord;
          this.memory[wordIndex] = newMemoryWord;
          newResult = this.memory[ik.a(memoryWord >> 8 >> 2, 255)] + oldMemoryWord;
          this.lastResult = newResult;
          this.results[wordIndex] = newResult;
        }
        return;
    }

    final static void a(MusicTrack param0, int param1) {
        if (param1 != 0) {
          return;
        }
        try {
          NodeDeque.a(param0, -27300, true);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fo.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int nextBoundedInt(int obfuscationGuard, int bound) {
        int sample = 0;
        if (obfuscationGuard != -37880252) {
          this.accumulator = -10;
        }
        if (0 >= bound) {
          throw new IllegalArgumentException();
        }
        int maximumAccepted = -(int)(4294967296L % (long)bound) + 2147483647;
        while (true) {
          sample = this.nextInt(123);
          if (maximumAccepted >= sample) {
            break;
          }
        }
        return er.nonnegativeRemainder(obfuscationGuard ^ 1598127099, bound, sample);
    }

    private final void initialize(boolean obfuscationGuard) {
        int scrambleRound = 0;
        int var11 = BrickABrac.field_J ? 1 : 0;
        int mixC = -1640531527;
        int mixG = -1640531527;
        int mixA = -1640531527;
        int mixH = -1640531527;
        int mixB = -1640531527;
        int mixD = -1640531527;
        int mixE = -1640531527;
        int mixF = -1640531527;
        int seedBlockOffset;
        int memoryBlockOffset;
        for (scrambleRound = 0; scrambleRound < 4; scrambleRound++) {
          mixA = mixA ^ mixB << 11;
          mixB = mixB + mixC;
          mixD = mixD + mixA;
          mixB = mixB ^ mixC >>> 2;
          mixC = mixC + mixD;
          mixE = mixE + mixB;
          mixC = mixC ^ mixD << 8;
          mixF = mixF + mixC;
          mixD = mixD + mixE;
          mixD = mixD ^ mixE >>> 16;
          mixG = mixG + mixD;
          mixE = mixE + mixF;
          mixE = mixE ^ mixF << 10;
          mixH = mixH + mixE;
          mixF = mixF + mixG;
          mixF = mixF ^ mixG >>> 4;
          mixG = mixG + mixH;
          mixA = mixA + mixF;
          mixG = mixG ^ mixH << 8;
          mixH = mixH + mixA;
          mixB = mixB + mixG;
          mixH = mixH ^ mixA >>> 9;
          mixC = mixC + mixH;
          mixA = mixA + mixB;
        }
        if (!obfuscationGuard) {
          IsaacGenerator.a(-63);
        }
        for (seedBlockOffset = 0; 256 > seedBlockOffset; seedBlockOffset += 8) {
          mixG = mixG + this.results[6 + seedBlockOffset];
          mixF = mixF + this.results[5 + seedBlockOffset];
          mixE = mixE + this.results[seedBlockOffset + 4];
          mixB = mixB + this.results[1 + seedBlockOffset];
          mixA = mixA + this.results[seedBlockOffset];
          mixC = mixC + this.results[seedBlockOffset + 2];
          mixD = mixD + this.results[seedBlockOffset + 3];
          mixH = mixH + this.results[7 + seedBlockOffset];
          mixA = mixA ^ mixB << 11;
          mixB = mixB + mixC;
          mixD = mixD + mixA;
          mixB = mixB ^ mixC >>> 2;
          mixC = mixC + mixD;
          mixE = mixE + mixB;
          mixC = mixC ^ mixD << 8;
          mixF = mixF + mixC;
          mixD = mixD + mixE;
          mixD = mixD ^ mixE >>> 16;
          mixG = mixG + mixD;
          mixE = mixE + mixF;
          mixE = mixE ^ mixF << 10;
          mixH = mixH + mixE;
          mixF = mixF + mixG;
          mixF = mixF ^ mixG >>> 4;
          mixA = mixA + mixF;
          mixG = mixG + mixH;
          mixG = mixG ^ mixH << 8;
          mixB = mixB + mixG;
          mixH = mixH + mixA;
          mixH = mixH ^ mixA >>> 9;
          mixA = mixA + mixB;
          mixC = mixC + mixH;
          this.memory[seedBlockOffset] = mixA;
          this.memory[seedBlockOffset + 1] = mixB;
          this.memory[2 + seedBlockOffset] = mixC;
          this.memory[seedBlockOffset + 3] = mixD;
          this.memory[seedBlockOffset + 4] = mixE;
          this.memory[seedBlockOffset + 5] = mixF;
          this.memory[seedBlockOffset + 6] = mixG;
          this.memory[7 + seedBlockOffset] = mixH;
        }
        for (memoryBlockOffset = 0; memoryBlockOffset < 256; memoryBlockOffset += 8) {
          mixA = mixA + this.memory[memoryBlockOffset];
          mixB = mixB + this.memory[1 + memoryBlockOffset];
          mixF = mixF + this.memory[memoryBlockOffset + 5];
          mixE = mixE + this.memory[memoryBlockOffset + 4];
          mixD = mixD + this.memory[memoryBlockOffset + 3];
          mixG = mixG + this.memory[6 + memoryBlockOffset];
          mixH = mixH + this.memory[memoryBlockOffset + 7];
          mixC = mixC + this.memory[2 + memoryBlockOffset];
          mixA = mixA ^ mixB << 11;
          mixD = mixD + mixA;
          mixB = mixB + mixC;
          mixB = mixB ^ mixC >>> 2;
          mixC = mixC + mixD;
          mixE = mixE + mixB;
          mixC = mixC ^ mixD << 8;
          mixD = mixD + mixE;
          mixF = mixF + mixC;
          mixD = mixD ^ mixE >>> 16;
          mixE = mixE + mixF;
          mixG = mixG + mixD;
          mixE = mixE ^ mixF << 10;
          mixF = mixF + mixG;
          mixH = mixH + mixE;
          mixF = mixF ^ mixG >>> 4;
          mixG = mixG + mixH;
          mixA = mixA + mixF;
          mixG = mixG ^ mixH << 8;
          mixH = mixH + mixA;
          mixB = mixB + mixG;
          mixH = mixH ^ mixA >>> 9;
          mixC = mixC + mixH;
          mixA = mixA + mixB;
          this.memory[memoryBlockOffset] = mixA;
          this.memory[memoryBlockOffset + 1] = mixB;
          this.memory[memoryBlockOffset + 2] = mixC;
          this.memory[memoryBlockOffset + 3] = mixD;
          this.memory[4 + memoryBlockOffset] = mixE;
          this.memory[memoryBlockOffset + 5] = mixF;
          this.memory[memoryBlockOffset + 6] = mixG;
          this.memory[7 + memoryBlockOffset] = mixH;
        }
        this.generateBlock((byte) -125);
        this.remaining = 256;
    }

    final int nextInt(int obfuscationGuard) {
        if (obfuscationGuard < 88) {
          return -47;
        }
        if (this.remaining == 0) {
          this.generateBlock((byte) -111);
          this.remaining = 256;
        }
        int resultIndex = this.remaining - 1;
        this.remaining = this.remaining - 1;
        return this.results[resultIndex];
    }

    public static void a(int param0) {
        if (param0 != 2) {
          return;
        }
        field_b = null;
        field_g = null;
        field_a = null;
    }

    IsaacGenerator(int[] seed) {
        int seedIndex = 0;
        try {
          this.memory = new int[256];
          this.results = new int[256];
          for (seedIndex = 0; seed.length > seedIndex; seedIndex++) {
            this.results[seedIndex] = seed[seedIndex];
          }
          this.initialize(true);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fo.<init>(" + (seed != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new n();
        qo.a(150, 50);
    }
}
