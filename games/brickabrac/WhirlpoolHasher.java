/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolHasher {
    static String field_b;
    private int bufferPosition;
    private byte[] inputBlock;
    private long[] cipherState;
    private long[] roundTemporary;
    private long[] blockWords;
    private long[] roundKey;
    private byte[] bitLength;
    private int bufferedBits;
    private long[] hashState;
    static String field_i;
    static BufferedSocket gameTransport;
    static SecondaryHashTable lobbyPlayerIndex;

    final static void a(int param0) {
        ActivityIndicatorWidget.f((byte) -45);
        if (param0 != 7) {
          gameTransport = (BufferedSocket) null;
        }
        SecondaryNodeQueue.d(125);
        CircleBody.reportAbuseDialog = null;
        GamePresentationHelpers.closeQuickChatMenu(param0 - 8);
    }

    final void reset(byte obfuscationGuard) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; 32 > var2; var2++) {
          this.bitLength[var2] = (byte) 0;
        }
        if (obfuscationGuard != 99) {
          this.updateBits((byte[]) null, -112, 22L);
        }
        this.bufferedBits = 0;
        this.inputBlock[0] = (byte) 0;
        this.bufferPosition = 0;
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          this.hashState[var2Lifetime1] = 0L;
        }
    }

    final static String c(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 >= -58) {
          WhirlpoolHasher.c((byte) -29);
        }
        var6 = "(" + TextFieldRenderer.thirdPreviousPacketOpcode + " " + ReflectionCheckHelpers.secondPreviousPacketOpcode + " " + UiComponent.previousPacketOpcode + ") " + IntrusiveHashTable.currentPacketOpcode;
        var1 = var6;
        if (LobbyOverlayHelpers.incomingPacketLength > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < LobbyOverlayHelpers.incomingPacketLength; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & LogoRenderHelpers.incomingPackets.data[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            if (10 > var3) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    private final void compressBlock(byte obfuscationGuard) {
        long hashWord = 0L;
        long blockWord = 0L;
        int blockWordIndex;
        int inputOffset;
        int keyTableIndex;
        int keyByteShift;
        int unusedGameFlag;
        int cipherTableIndex;
        int initialWordIndex;
        int round;
        int feedForwardIndex;
        int keyWordIndex;
        int unusedCipherIndex;
        int cipherByteShift;
        int keyCopyIndex;
        int cipherWordIndex;
        int cipherCopyIndex;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        blockWordIndex = 0;
        inputOffset = 0;
        if (obfuscationGuard <= 19) {
          this.roundTemporary = (long[]) null;
        }
        while (blockWordIndex < 8) {
          this.blockWords[blockWordIndex] = RegistrationResponseDialog.a(RegistrationResponseDialog.a(RegistrationResponseDialog.a(RegistrationResponseDialog.a(RegistrationResponseDialog.a(SocialListResponseHelpers.bitwiseAnd(255L, (long)this.inputBlock[inputOffset + 3]) << 32, RegistrationResponseDialog.a(SocialListResponseHelpers.bitwiseAnd((long)this.inputBlock[2 + inputOffset], 255L) << 40, RegistrationResponseDialog.a(SocialListResponseHelpers.bitwiseAnd((long)this.inputBlock[1 + inputOffset], 255L) << 48, (long)this.inputBlock[inputOffset] << 56))), SocialListResponseHelpers.bitwiseAnd((long)this.inputBlock[inputOffset + 4], 255L) << 24), SocialListResponseHelpers.bitwiseAnd((long)this.inputBlock[inputOffset + 5], 255L) << 16), SocialListResponseHelpers.bitwiseAnd(65280L, (long)this.inputBlock[6 + inputOffset] << 8)), SocialListResponseHelpers.bitwiseAnd((long)this.inputBlock[inputOffset + 7], 255L));
          blockWordIndex++;
          inputOffset += 8;
        }
        for (initialWordIndex = 0; initialWordIndex < 8; initialWordIndex++) {
          hashWord = this.hashState[initialWordIndex];
          blockWord = this.blockWords[initialWordIndex];
          this.roundKey[initialWordIndex] = hashWord;
          this.cipherState[initialWordIndex] = RegistrationResponseDialog.a(blockWord, hashWord);
        }
        for (round = 1; round <= 10; round++) {
          for (keyWordIndex = 0; keyWordIndex < 8; keyWordIndex++) {
            this.roundTemporary[keyWordIndex] = 0L;
            keyTableIndex = 0;
            keyByteShift = 56;
            while (8 > keyTableIndex) {
              this.roundTemporary[keyWordIndex] = RegistrationResponseDialog.a(this.roundTemporary[keyWordIndex], TabbedPane.whirlpoolRoundTables[keyTableIndex][IntrusiveHashIterator.a((int)(this.roundKey[IntrusiveHashIterator.a(keyWordIndex - keyTableIndex, 7)] >>> keyByteShift), 255)]);
              keyTableIndex++;
              keyByteShift -= 8;
            }
          }
          for (keyCopyIndex = 0; 8 > keyCopyIndex; keyCopyIndex++) {
            this.roundKey[keyCopyIndex] = this.roundTemporary[keyCopyIndex];
          }
          this.roundKey[0] = RegistrationResponseDialog.a(this.roundKey[0], TabbedPane.whirlpoolRoundConstants[round]);
          for (cipherWordIndex = 0; cipherWordIndex < 8; cipherWordIndex++) {
            this.roundTemporary[cipherWordIndex] = this.roundKey[cipherWordIndex];
            cipherTableIndex = 0;
            unusedCipherIndex = cipherTableIndex;
            cipherByteShift = 56;
            while (cipherTableIndex < 8) {
              this.roundTemporary[cipherWordIndex] = RegistrationResponseDialog.a(this.roundTemporary[cipherWordIndex], TabbedPane.whirlpoolRoundTables[cipherTableIndex][IntrusiveHashIterator.a(255, (int)(this.cipherState[IntrusiveHashIterator.a(cipherWordIndex - cipherTableIndex, 7)] >>> cipherByteShift))]);
              cipherTableIndex++;
              cipherByteShift -= 8;
            }
          }
          for (cipherCopyIndex = 0; cipherCopyIndex < 8; cipherCopyIndex++) {
            this.cipherState[cipherCopyIndex] = this.roundTemporary[cipherCopyIndex];
          }
        }
        for (feedForwardIndex = 0; feedForwardIndex < 8; feedForwardIndex++) {
          this.hashState[feedForwardIndex] = RegistrationResponseDialog.a(this.hashState[feedForwardIndex], RegistrationResponseDialog.a(this.cipherState[feedForwardIndex], this.blockWords[feedForwardIndex]));
        }
    }

    final void finishDigest(byte[] output, int obfuscationGuard, int outputOffset) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int digestWordIndex = 0;
        int digestByteOffset = 0;
        long digestWord = 0L;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          this.inputBlock[this.bufferPosition] = (byte)LevelSelectScreen.d((int) this.inputBlock[this.bufferPosition], 128 >>> IntrusiveHashIterator.a(7, this.bufferedBits));
          var4_int = -48 % ((-28 - obfuscationGuard) / 38);
          this.bufferPosition = this.bufferPosition + 1;
          if (this.bufferPosition > 32) {
            while (this.bufferPosition < 64) {
              fieldTemp$0 = this.bufferPosition;
              this.bufferPosition = this.bufferPosition + 1;
              this.inputBlock[fieldTemp$0] = (byte) 0;
            }
            this.compressBlock((byte) 109);
            this.bufferPosition = 0;
          }
          while (this.bufferPosition < 32) {
            fieldTemp$1 = this.bufferPosition;
            this.bufferPosition = this.bufferPosition + 1;
            this.inputBlock[fieldTemp$1] = (byte) 0;
          }
          ArrayOperations.copy(this.bitLength, 0, this.inputBlock, 32, 32);
          this.compressBlock((byte) 47);
          digestWordIndex = 0;
          digestByteOffset = outputOffset;
          while (digestWordIndex < 8) {
            digestWord = this.hashState[digestWordIndex];
            output[digestByteOffset] = (byte)(int)(digestWord >>> 56);
            output[digestByteOffset + 1] = (byte)(int)(digestWord >>> 48);
            output[2 + digestByteOffset] = (byte)(int)(digestWord >>> 40);
            output[3 + digestByteOffset] = (byte)(int)(digestWord >>> 32);
            output[digestByteOffset + 4] = (byte)(int)(digestWord >>> 24);
            output[5 + digestByteOffset] = (byte)(int)(digestWord >>> 16);
            output[digestByteOffset + 6] = (byte)(int)(digestWord >>> 8);
            output[7 + digestByteOffset] = (byte)(int)digestWord;
            digestWordIndex++;
            digestByteOffset += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("eq.E(");
          if (output == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(',').append(outputOffset).append(')').toString());
        }
    }

    final void updateBits(byte[] input, int obfuscationGuard, long bitCount) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int inputByteIndex = 0;
        RuntimeException var5 = null;
        int inputPaddingBits = 0;
        int bufferBitOffset = 0;
        int alignedByte = 0;
        long remainingLengthBits = 0L;
        int lengthByteIndex = 0;
        int lengthCarry = 0;
        int unusedGameFlag = 0;
        int finalAlignedByte;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          inputByteIndex = 0;
          inputPaddingBits = 8 - ((int)bitCount & 7) & 7;
          bufferBitOffset = this.bufferedBits & 7;
          if (obfuscationGuard != 540) {
            this.compressBlock((byte) -98);
          }
          remainingLengthBits = bitCount;
          lengthByteIndex = 31;
          lengthCarry = 0;
          while (0 <= lengthByteIndex) {
            lengthCarry = lengthCarry + ((255 & (int)remainingLengthBits) + (255 & this.bitLength[lengthByteIndex]));
            this.bitLength[lengthByteIndex] = (byte)lengthCarry;
            lengthCarry = lengthCarry >>> 8;
            remainingLengthBits = remainingLengthBits >>> 8;
            lengthByteIndex--;
          }
          while (8L < bitCount) {
            alignedByte = input[inputByteIndex] << inputPaddingBits & 255 | (input[inputByteIndex + 1] & 255) >>> -inputPaddingBits + 8;
            if (alignedByte >= 0 &&
              256 > alignedByte) {
              this.inputBlock[this.bufferPosition] = (byte)LevelSelectScreen.d((int) this.inputBlock[this.bufferPosition], alignedByte >>> bufferBitOffset);
              this.bufferPosition = this.bufferPosition + 1;
              this.bufferedBits = this.bufferedBits + (-bufferBitOffset + 8);
              if (this.bufferedBits == 512) {
                this.compressBlock((byte) 38);
                this.bufferedBits = 0;
                this.bufferPosition = 0;
              }
              this.inputBlock[this.bufferPosition] = (byte)IntrusiveHashIterator.a(255, alignedByte << 8 - bufferBitOffset);
              this.bufferedBits = this.bufferedBits + bufferBitOffset;
              inputByteIndex++;
              bitCount = bitCount - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (bitCount <= 0L) {
            finalAlignedByte = 0;
          } else {
            finalAlignedByte = 255 & input[inputByteIndex] << inputPaddingBits;
            this.inputBlock[this.bufferPosition] = (byte)LevelSelectScreen.d((int) this.inputBlock[this.bufferPosition], finalAlignedByte >>> bufferBitOffset);
          }
          if ((long)bufferBitOffset + bitCount >= 8L) {
            bitCount = bitCount - (long)(8 - bufferBitOffset);
            this.bufferPosition = this.bufferPosition + 1;
            this.bufferedBits = this.bufferedBits + (8 - bufferBitOffset);
            if (this.bufferedBits == 512) {
              this.compressBlock((byte) 41);
              this.bufferedBits = 0;
              this.bufferPosition = 0;
            }
            this.inputBlock[this.bufferPosition] = (byte)IntrusiveHashIterator.a(255, finalAlignedByte << 8 - bufferBitOffset);
            this.bufferedBits = this.bufferedBits + (int)bitCount;
          } else {
            this.bufferedBits = (int)((long)this.bufferedBits + bitCount);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("eq.D(");
          if (input == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(obfuscationGuard).append(',').append(bitCount).append(')').toString());
        }
    }

    public static void b(int param0) {
        lobbyPlayerIndex = null;
        field_b = null;
        gameTransport = null;
        field_i = null;
        if (param0 != -1) {
          lobbyPlayerIndex = (SecondaryHashTable) null;
        }
    }

    WhirlpoolHasher() {
        this.blockWords = new long[8];
        this.inputBlock = new byte[64];
        this.bitLength = new byte[32];
        this.roundKey = new long[8];
        this.roundTemporary = new long[8];
        this.cipherState = new long[8];
        this.bufferPosition = 0;
        this.bufferedBits = 0;
        this.hashState = new long[8];
    }

    static {
        field_b = "The game options are not all set.";
        field_i = "This password contains repeated characters, and would be easy to guess";
    }
}
