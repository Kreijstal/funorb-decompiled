/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolDigest {
    private int bufferBits;
    private long[] state;
    private long[] scratch;
    private long[] roundKey;
    private long[] hash;
    private byte[] buffer;
    private int bufferPosition;
    static PrimitiveType TRIANGLES;
    private long[] block;
    private byte[] bitLength;
    static char field_c;

    final void reset(int guard) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.bitLength[var2] = (byte) 0;
        }
        this.buffer[0] = (byte) 0;
        this.bufferBits = 0;
        if (guard != -9) {
          return;
        }
        this.bufferPosition = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.hash[var2Lifetime1] = 0L;
        }
    }

    public static void releaseStatics(byte param0) {
        TRIANGLES = null;
        if (param0 != -58) {
          field_c = '￲';
        }
    }

    final void finish(int offset, byte[] destination, int guard) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.buffer[this.bufferPosition] = (byte)LegacyOpenGlInterleavedStream.bitwiseOr((int) this.buffer[this.bufferPosition], 128 >>> LegacyOpenGlPostProcessManager.bitwiseAnd(7, this.bufferBits));
          this.bufferPosition = this.bufferPosition + 1;
          if (this.bufferPosition > 32) {
            while (this.bufferPosition < 64) {
              fieldTemp$0 = this.bufferPosition;
              this.bufferPosition = this.bufferPosition + 1;
              this.buffer[fieldTemp$0] = (byte) 0;
            }
            this.processBlock((byte) 99);
            this.bufferPosition = 0;
          }
          while (this.bufferPosition < 32) {
            fieldTemp$1 = this.bufferPosition;
            this.bufferPosition = this.bufferPosition + 1;
            this.buffer[fieldTemp$1] = (byte) 0;
          }
          if (guard >= -2) {
            return;
          }
          ArrayUtils.copy(this.bitLength, 0, this.buffer, 32, 32);
          this.processBlock((byte) 99);
          var4_int = 0;
          var5 = offset;
          while (var4_int < 8) {
            var6 = this.hash[var4_int];
            destination[var5] = (byte)(int)(var6 >>> 56);
            destination[1 + var5] = (byte)(int)(var6 >>> 48);
            destination[var5 + 2] = (byte)(int)(var6 >>> 40);
            destination[3 + var5] = (byte)(int)(var6 >>> 32);
            destination[var5 + 4] = (byte)(int)(var6 >>> 24);
            destination[5 + var5] = (byte)(int)(var6 >>> 16);
            destination[var5 + 6] = (byte)(int)(var6 >>> 8);
            destination[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("np.D(").append(offset).append(',');
          if (destination == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void processBlock(byte guard) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.block[var2] = ArenaBackdropPalettes.xor(ArenaBackdropPalettes.xor(SoftLruCache.bitwiseAnd(65280L, (long)this.buffer[6 + var3] << 8), ArenaBackdropPalettes.xor(ArenaBackdropPalettes.xor(ArenaBackdropPalettes.xor(ArenaBackdropPalettes.xor(ArenaBackdropPalettes.xor((long)this.buffer[var3] << 56, SoftLruCache.bitwiseAnd((long)this.buffer[var3 + 1], 255L) << 48), SoftLruCache.bitwiseAnd(255L, (long)this.buffer[2 + var3]) << 40), SoftLruCache.bitwiseAnd(255L, (long)this.buffer[var3 + 3]) << 32), SoftLruCache.bitwiseAnd(255L, (long)this.buffer[4 + var3]) << 24), SoftLruCache.bitwiseAnd(16711680L, (long)this.buffer[5 + var3] << 16))), SoftLruCache.bitwiseAnd((long)this.buffer[7 + var3], 255L));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.hash[var2Lifetime1];
          arrayValue$1 = this.block[var2Lifetime1];
          this.roundKey[var2Lifetime1] = dupTemp$0;
          this.state[var2Lifetime1] = ArenaBackdropPalettes.xor(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.scratch[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.scratch[var3Lifetime1] = ArenaBackdropPalettes.xor(this.scratch[var3Lifetime1], WhirlpoolTables.roundTables[var4][LegacyOpenGlPostProcessManager.bitwiseAnd(255, (int)(this.roundKey[LegacyOpenGlPostProcessManager.bitwiseAnd(var3Lifetime1 - var4, 7)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.roundKey[var3Lifetime1Lifetime1] = this.scratch[var3Lifetime1Lifetime1];
          }
          this.roundKey[0] = ArenaBackdropPalettes.xor(this.roundKey[0], WhirlpoolTables.roundConstants[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.scratch[var3Lifetime1Lifetime2] = this.roundKey[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.scratch[var3Lifetime1Lifetime2] = ArenaBackdropPalettes.xor(this.scratch[var3Lifetime1Lifetime2], WhirlpoolTables.roundTables[var7][LegacyOpenGlPostProcessManager.bitwiseAnd((int)(this.state[LegacyOpenGlPostProcessManager.bitwiseAnd(7, var3Lifetime1Lifetime2 - var7)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.state[var3Lifetime1Lifetime3] = this.scratch[var3Lifetime1Lifetime3];
          }
        }
        if (guard != 99) {
          WhirlpoolDigest.a(-88);
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.hash[var2Lifetime3] = ArenaBackdropPalettes.xor(this.hash[var2Lifetime3], ArenaBackdropPalettes.xor(this.block[var2Lifetime3], this.state[var2Lifetime3]));
        }
    }

    final static boolean a(int param0) {
        if (param0 != 7) {
          field_c = 'ￃ';
        }
        return null == CompactMeshGeometry.field_o ? AppletFocusState.focused : true;
    }

    final void updateBits(byte[] bytes, int alignmentMask, long bitCount) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 8 - (7 & (int)bitCount) & alignmentMask;
          var7 = this.bufferBits & 7;
          var9 = bitCount;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((255 & this.bitLength[var11]) + ((int)var9 & 255));
            this.bitLength[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (bitCount > 8L) {
            var8 = bytes[var5_int] << var6 & 255 | (bytes[var5_int + 1] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              256 > var8) {
              this.buffer[this.bufferPosition] = (byte)LegacyOpenGlInterleavedStream.bitwiseOr((int) this.buffer[this.bufferPosition], var8 >>> var7);
              this.bufferPosition = this.bufferPosition + 1;
              this.bufferBits = this.bufferBits + (-var7 + 8);
              if (512 == this.bufferBits) {
                this.processBlock((byte) 99);
                this.bufferBits = 0;
                this.bufferPosition = 0;
              }
              this.buffer[this.bufferPosition] = (byte)LegacyOpenGlPostProcessManager.bitwiseAnd(var8 << -var7 + 8, 255);
              bitCount = bitCount - 8L;
              this.bufferBits = this.bufferBits + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (bitCount <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = 255 & bytes[var5_int] << var6;
            this.buffer[this.bufferPosition] = (byte)LegacyOpenGlInterleavedStream.bitwiseOr((int) this.buffer[this.bufferPosition], var8Lifetime1 >>> var7);
          }
          if (bitCount + (long)var7 < 8L) {
            this.bufferBits = (int)((long)this.bufferBits + bitCount);
          } else {
            this.bufferPosition = this.bufferPosition + 1;
            this.bufferBits = this.bufferBits + (-var7 + 8);
            bitCount = bitCount - (long)(-var7 + 8);
            if (this.bufferBits == 512) {
              this.processBlock((byte) 99);
              this.bufferBits = 0;
              this.bufferPosition = 0;
            }
            this.buffer[this.bufferPosition] = (byte)LegacyOpenGlPostProcessManager.bitwiseAnd(255, var8Lifetime1 << 8 - var7);
            this.bufferBits = this.bufferBits + (int)bitCount;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("np.F(");
          if (bytes == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(alignmentMask).append(',').append(bitCount).append(')').toString());
        }
    }

    WhirlpoolDigest() {
        this.bufferBits = 0;
        this.scratch = new long[8];
        this.roundKey = new long[8];
        this.state = new long[8];
        this.hash = new long[8];
        this.bufferPosition = 0;
        this.buffer = new byte[64];
        this.block = new long[8];
        this.bitLength = new byte[32];
    }

    static {
        TRIANGLES = new PrimitiveType();
    }
}
