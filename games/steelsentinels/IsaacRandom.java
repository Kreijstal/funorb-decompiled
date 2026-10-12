/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IsaacRandom {
    static ResourceArchive field_k;
    static boolean field_c;
    private int[] results;
    static String field_a;
    static int[][] field_f;
    private int accumulator;
    private int generationCounter;
    private int lastResult;
    static IndexedSprite[] field_d;
    private int[] memory;
    private int remainingResults;

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = SteelSentinels.obfuscationControl;
        try {
          for (var1_int = 0; var1_int < uc.field_a; var1_int++) {
            ph.field_e[var1_int] = null;
          }
          if (param0 != 124) {
            IsaacRandom.b((byte) 117);
          }
          uc.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ie.A(" + param0 + ')');
        }
    }

    private final void initializeState(int obfuscationGuard) {
        int var2 = 0;
        int var11 = SteelSentinels.obfuscationControl;
        int var9 = -1640531527;
        int var4 = -1640531527;
        int var7 = -1640531527;
        int var6 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        if (obfuscationGuard < 30) {
          IsaacRandom.b((byte) -19);
        }
        int var10 = -1640531527;
        int var5 = -1640531527;
        int var3 = -1640531527;
        int var8 = -1640531527;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var9 = var9 + this.results[var2Lifetime1 + 6];
          var3 = var3 + this.results[var2Lifetime1];
          var10 = var10 + this.results[7 + var2Lifetime1];
          var7 = var7 + this.results[4 + var2Lifetime1];
          var6 = var6 + this.results[3 + var2Lifetime1];
          var8 = var8 + this.results[5 + var2Lifetime1];
          var5 = var5 + this.results[2 + var2Lifetime1];
          var4 = var4 + this.results[1 + var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.memory[var2Lifetime1] = var3;
          this.memory[var2Lifetime1 + 1] = var4;
          this.memory[var2Lifetime1 + 2] = var5;
          this.memory[var2Lifetime1 + 3] = var6;
          this.memory[var2Lifetime1 + 4] = var7;
          this.memory[var2Lifetime1 + 5] = var8;
          this.memory[var2Lifetime1 + 6] = var9;
          this.memory[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var6 = var6 + this.memory[var2Lifetime2 + 3];
          var5 = var5 + this.memory[var2Lifetime2 + 2];
          var3 = var3 + this.memory[var2Lifetime2];
          var4 = var4 + this.memory[1 + var2Lifetime2];
          var10 = var10 + this.memory[7 + var2Lifetime2];
          var9 = var9 + this.memory[6 + var2Lifetime2];
          var7 = var7 + this.memory[var2Lifetime2 + 4];
          var8 = var8 + this.memory[5 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.memory[var2Lifetime2] = var3;
          this.memory[var2Lifetime2 + 1] = var4;
          this.memory[var2Lifetime2 + 2] = var5;
          this.memory[3 + var2Lifetime2] = var6;
          this.memory[var2Lifetime2 + 4] = var7;
          this.memory[var2Lifetime2 + 5] = var8;
          this.memory[6 + var2Lifetime2] = var9;
          this.memory[var2Lifetime2 + 7] = var10;
        }
        this.generateResults(116);
        this.remainingResults = 256;
    }

    private final void generateResults(int obfuscationGuard) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        int fieldTemp$0 = this.generationCounter + 1;
        this.generationCounter = this.generationCounter + 1;
        this.lastResult = this.lastResult + fieldTemp$0;
        for (var2 = 0; 256 > var2; var2++) {
          var3 = this.memory[var2];
          if (0 == (var2 & 2)) {
            if ((1 & var2) != 0) {
              this.accumulator = this.accumulator ^ this.accumulator >>> 6;
            } else {
              this.accumulator = this.accumulator ^ this.accumulator << 13;
            }
          } else {
            if (0 == (var2 & 1)) {
              this.accumulator = this.accumulator ^ this.accumulator << 2;
            } else {
              this.accumulator = this.accumulator ^ this.accumulator >>> 16;
            }
          }
          this.accumulator = this.accumulator + this.memory[var2 + 128 & 255];
          dupTemp$1 = this.lastResult + (this.memory[ec.a(var3, 1020) >> 2] + this.accumulator);
          var4 = dupTemp$1;
          this.memory[var2] = dupTemp$1;
          dupTemp$2 = this.memory[ec.a(261147, var4) >> 8 >> 2] + var3;
          this.lastResult = dupTemp$2;
          this.results[var2] = dupTemp$2;
        }
        var5 = -1 / ((obfuscationGuard - 54) / 60);
    }

    final int nextIntBounded(int obfuscationGuard, int bound) {
        int sample = 0;
        int var6 = SteelSentinels.obfuscationControl;
        if (bound <= 0) {
          throw new IllegalArgumentException();
        }
        int guardArithmetic = -9 % ((-40 - obfuscationGuard) / 54);
        int maximumAcceptedSample = 2147483647 - (int)(4294967296L % (long)bound);
        do {
          sample = this.nextInt(-104);
        } while (maximumAcceptedSample < sample);
        return NodeHashTable.nonnegativeRemainder(false, sample, bound);
    }

    public static void a(byte param0) {
        if (param0 > -24) {
          field_a = (String) null;
        }
        field_d = null;
        field_f = (int[][]) null;
        field_a = null;
        field_k = null;
    }

    final int nextInt(int obfuscationGuard) {
        if (obfuscationGuard >= -86) {
          this.generateResults(74);
        }
        if (this.remainingResults == 0) {
          this.generateResults(126);
          this.remainingResults = 256;
        }
        int fieldTemp$0 = this.remainingResults - 1;
        this.remainingResults = this.remainingResults - 1;
        return this.results[fieldTemp$0];
    }

    final static void insertNodeBefore(IntrusiveNode existingNode, int obfuscationGuard, IntrusiveNode node) {
        if (node.previous != null) {
          node.unlink(4);
        }
        node.next = existingNode;
        node.previous = existingNode.previous;
        node.previous.next = node;
        if (obfuscationGuard != 30) {
          return;
        }
        try {
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ie.G(" + (existingNode != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    IsaacRandom(int[] seed) {
        int var2_int = 0;
        try {
          this.results = new int[256];
          this.memory = new int[256];
          for (var2_int = 0; var2_int < seed.length; var2_int++) {
            this.results[var2_int] = seed[var2_int];
          }
          this.initializeState(55);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (seed != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_f = new int[36][];
        field_f[35] = new int[]{131, 42};
        field_f[11] = new int[]{32, 12};
        field_f[12] = new int[]{32, 10};
        field_f[3] = new int[]{32, 23};
        field_f[30] = new int[]{94, 58};
        field_f[10] = new int[]{32, 22};
        field_f[2] = new int[]{32, 26};
        field_f[14] = new int[]{64, 23};
        field_f[21] = new int[]{132, 96};
        field_f[29] = new int[]{22, 95};
        field_f[4] = new int[]{32, 14};
        field_f[18] = new int[]{97, 106};
        field_f[0] = new int[]{32, 24};
        field_f[5] = new int[]{32, 16};
        field_f[17] = new int[]{45, 4};
        field_f[1] = new int[]{32, 22};
        field_f[13] = new int[]{32, 12};
        field_f[16] = new int[]{60, 45};
        field_f[15] = new int[]{77, 11};
        field_f[26] = new int[]{83, 22};
        field_f[28] = new int[]{128, 48};
        field_f[31] = new int[]{97, 69};
        field_f[27] = new int[]{99, 68};
    }
}
