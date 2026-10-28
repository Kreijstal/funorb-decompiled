/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolHasher {
    static int field_f;
    private int field_b;
    private long[] field_e;
    private byte[] field_j;
    private long[] field_i;
    private int field_c;
    private long[] field_k;
    private long[] field_d;
    private byte[] field_h;
    private long[] field_a;
    static String field_g;

    final void updateBits(long bitCount, byte[] input, int guard) {
        String stackIn_28_2 = null;
        int var8Lifetime1;
        int var13 = EscapeVector.obfuscationControl;
        try {
          int var5_int = 0;
          if (guard != 2) {
            byte[] var14 = (byte[]) null;
            this.finish(5, (byte[]) null, true);
          }
          int var6 = 7 & -(7 & (int)bitCount) + 8;
          int var7 = 7 & this.field_c;
          long var9 = bitCount;
          int var11 = 31;
          int var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((255 & (int)var9) + (this.field_j[var11] & 255));
            this.field_j[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (bitCount > 8L) {
            int var8 = 255 & input[var5_int] << var6 | (255 & input[1 + var5_int]) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_h[this.field_b] = (byte)MatchingTextValidator.a((int) this.field_h[this.field_b], var8 >>> var7);
              this.field_b = this.field_b + 1;
              this.field_c = this.field_c + (8 - var7);
              if (this.field_c == 512) {
                this.compressBlock((byte) -41);
                this.field_c = 0;
                this.field_b = 0;
              }
              this.field_h[this.field_b] = (byte)SpriteCheckboxPainter.bitwiseAnd(255, var8 << -var7 + 8);
              bitCount = bitCount - 8L;
              this.field_c = this.field_c + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L < bitCount) {
            int stackIn_17_0 = 255;
            int stackIn_17_1 = input[var5_int] << var6;
            var8Lifetime1 = stackIn_17_0 & stackIn_17_1;
            this.field_h[this.field_b] = (byte)MatchingTextValidator.a((int) this.field_h[this.field_b], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (8L > bitCount + (long)var7) {
            this.field_c = (int)((long)this.field_c + bitCount);
          } else {
            this.field_c = this.field_c + (-var7 + 8);
            this.field_b = this.field_b + 1;
            bitCount = bitCount - (long)(8 - var7);
            if (this.field_c == 512) {
              this.compressBlock((byte) -34);
              this.field_c = 0;
              this.field_b = 0;
            }
            this.field_h[this.field_b] = (byte)SpriteCheckboxPainter.bitwiseAnd(var8Lifetime1 << 8 - var7, 255);
            this.field_c = this.field_c + (int)bitCount;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var5;
          StringBuilder stackIn_27_1 = new StringBuilder().append("lj.C(").append(bitCount).append(',');
          if (input == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(boolean guard) {
        if (!guard) {
          field_f = 69;
        }
        field_g = null;
    }

    final void reset(boolean guard) {
        int var3 = EscapeVector.obfuscationControl;
        for (int var2 = 0; var2 < 32; var2++) {
          this.field_j[var2] = (byte) 0;
        }
        this.field_b = 0;
        this.field_h[0] = (byte) 0;
        this.field_c = 0;
        int var2Lifetime1 = 0;
        if (guard) {
          this.field_d = (long[]) null;
        }
        while (var2Lifetime1 < 8) {
          this.field_k[var2Lifetime1] = 0L;
          var2Lifetime1++;
        }
    }

    final static void a(int param0, int param1) {
        ValidationState.field_a = param0;
        if (param1 <= 11) {
          WhirlpoolHasher.releaseStatics(false);
        }
    }

    final void finish(int offset, byte[] output, boolean guard) {
        String stackIn_16_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          this.field_h[this.field_b] = (byte)MatchingTextValidator.a((int) this.field_h[this.field_b], 128 >>> SpriteCheckboxPainter.bitwiseAnd(this.field_c, 7));
          this.field_b = this.field_b + 1;
          if (32 < this.field_b) {
            while (this.field_b < 64) {
              int fieldTemp$0 = this.field_b;
              this.field_b = this.field_b + 1;
              this.field_h[fieldTemp$0] = (byte) 0;
            }
            this.compressBlock((byte) -75);
            this.field_b = 0;
          }
          while (32 > this.field_b) {
            int fieldTemp$1 = this.field_b;
            this.field_b = this.field_b + 1;
            this.field_h[fieldTemp$1] = (byte) 0;
          }
          ArraySupport.copy(this.field_j, 0, this.field_h, 32, 32);
          if (guard) {
            byte[] var9 = (byte[]) null;
            this.updateBits(105L, (byte[]) null, -56);
          }
          this.compressBlock((byte) -95);
          int var4_int = 0;
          int var5 = offset;
          while (var4_int < 8) {
            long var6 = this.field_k[var4_int];
            output[var5] = (byte)(int)(var6 >>> 56);
            output[var5 + 1] = (byte)(int)(var6 >>> 48);
            output[var5 + 2] = (byte)(int)(var6 >>> 40);
            output[var5 + 3] = (byte)(int)(var6 >>> 32);
            output[4 + var5] = (byte)(int)(var6 >>> 24);
            output[5 + var5] = (byte)(int)(var6 >>> 16);
            output[6 + var5] = (byte)(int)(var6 >>> 8);
            output[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("lj.B(").append(offset).append(',');
          if (output == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void compressBlock(byte guard) {
        int var6 = EscapeVector.obfuscationControl;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
          this.field_i[var2] = DisplayModeInfo.bitwiseOr(DisplayModeInfo.bitwiseOr(SpriteOffset.a((long)this.field_h[6 + var3] << 8, 65280L), DisplayModeInfo.bitwiseOr(SpriteOffset.a(16711680L, (long)this.field_h[5 + var3] << 16), DisplayModeInfo.bitwiseOr(SpriteOffset.a(255L, (long)this.field_h[var3 + 4]) << 24, DisplayModeInfo.bitwiseOr(SpriteOffset.a(255L, (long)this.field_h[3 + var3]) << 32, DisplayModeInfo.bitwiseOr(SpriteOffset.a(255L, (long)this.field_h[2 + var3]) << 40, DisplayModeInfo.bitwiseOr(SpriteOffset.a(71776119061217280L, (long)this.field_h[var3 + 1] << 48), (long)this.field_h[var3] << 56)))))), SpriteOffset.a((long)this.field_h[7 + var3], 255L));
          var2++;
          var3 += 8;
        }
        for (int var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          long dupTemp$0 = this.field_k[var2Lifetime1];
          long arrayValue$1 = this.field_i[var2Lifetime1];
          this.field_e[var2Lifetime1] = dupTemp$0;
          this.field_d[var2Lifetime1] = DisplayModeInfo.bitwiseOr(arrayValue$1, dupTemp$0);
        }
        if (guard > -22) {
          this.field_i = (long[]) null;
        }
        for (int var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (int var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_a[var3Lifetime1] = 0L;
            int var4 = 0;
            int var5 = 56;
            while (var4 < 8) {
              this.field_a[var3Lifetime1] = DisplayModeInfo.bitwiseOr(this.field_a[var3Lifetime1], AccountNoticeDialog.field_db[var4][SpriteCheckboxPainter.bitwiseAnd((int)(this.field_e[SpriteCheckboxPainter.bitwiseAnd(7, var3Lifetime1 - var4)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (int var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_e[var3Lifetime1Lifetime1] = this.field_a[var3Lifetime1Lifetime1];
          }
          this.field_e[0] = DisplayModeInfo.bitwiseOr(this.field_e[0], AccountNoticeDialog.field_ab[var2Lifetime2]);
          for (int var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_a[var3Lifetime1Lifetime2] = this.field_e[var3Lifetime1Lifetime2];
            int var7 = 0;
            int var4Lifetime1 = var7;
            int var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_a[var3Lifetime1Lifetime2] = DisplayModeInfo.bitwiseOr(this.field_a[var3Lifetime1Lifetime2], AccountNoticeDialog.field_db[var7][SpriteCheckboxPainter.bitwiseAnd((int)(this.field_d[SpriteCheckboxPainter.bitwiseAnd(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (int var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_d[var3Lifetime1Lifetime3] = this.field_a[var3Lifetime1Lifetime3];
          }
        }
        for (int var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_k[var2Lifetime3] = DisplayModeInfo.bitwiseOr(this.field_k[var2Lifetime3], DisplayModeInfo.bitwiseOr(this.field_i[var2Lifetime3], this.field_d[var2Lifetime3]));
        }
    }

    WhirlpoolHasher() {
        this.field_e = new long[8];
        this.field_k = new long[8];
        this.field_j = new byte[32];
        this.field_c = 0;
        this.field_i = new long[8];
        this.field_b = 0;
        this.field_h = new byte[64];
        this.field_d = new long[8];
        this.field_a = new long[8];
    }

    static {
        field_f = -1;
        field_g = "Change display name";
    }
}
