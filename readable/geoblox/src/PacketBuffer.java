/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PacketBuffer extends ByteArrayBuffer {
    static String field_r;
    static int field_n;
    private PacketByteCipher cipher;
    private int bitPosition;
    static ClientProtocolStage currentProtocolStage;
    static String field_q;
    static Sprite resultBubbleSprite;
    static boolean[] connectivityVisitedByEntityId;
    static int field_m;

    final void readCipherBytes(int methodGuard, int destinationOffset, byte[] destination, int length) {
        int copiedByteCount = 0;
        int packetByteIndex = 0;
        RuntimeException readFailureBeforeDescription = null;
        StringBuilder readMessagePrefix = null;
        String destinationDescription = null;
        RuntimeException caughtReadFailure = null;
        int sentinelRemainder = 0;
        RuntimeException readFailureForContext = null;
        int unusedClientGuardSnapshot = 0;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          sentinelRemainder = 31 % ((methodGuard + 36) / 37);
          for (copiedByteCount = 0; copiedByteCount < length; copiedByteCount++) {
            packetByteIndex = this.position;
            this.position = this.position + 1;
            destination[copiedByteCount + destinationOffset] = (byte)(this.bytes[packetByteIndex] - this.cipher.nextInt(0));
          }
          return;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = caughtReadFailure;
          readFailureBeforeDescription = readFailureForContext;
          readMessagePrefix = new StringBuilder().append("pk.FB(").append(methodGuard).append(',').append(destinationOffset).append(',');
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readFailureBeforeDescription), ((StringBuilder) (Object) readMessagePrefix).append(destinationDescription).append(',').append(length).append(')').toString());
        }
    }

    final static int divideFloorWithPositiveDivisor(int divisor, byte methodGuard, int numerator) {
        int numeratorSign = numerator >>> 31;
        if (methodGuard != -6) {
            PacketBuffer.k((byte) 101);
        }
        return -numeratorSign + (numerator + numeratorSign) / divisor;
    }

    final static void k(byte param0) {
        da.field_a = 0;
        if (param0 != -13) {
            PacketBuffer.divideFloorWithPositiveDivisor(106, (byte) 22, 96);
        }
    }

    final void initializeCipher(int[] seed, boolean finishBitAccess) {
        try {
            this.cipher = new PacketByteCipher(seed);
            if (finishBitAccess) {
                this.endBitAccess(-68);
            }
        } catch (RuntimeException cipherInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cipherInitializationFailure), "pk.JB(" + (seed != null ? "{...}" : "null") + ',' + finishBitAccess + ')');
        }
    }

    final void beginBitAccess(int bitsPerByte) {
        this.bitPosition = bitsPerByte * this.position;
    }

    PacketBuffer(byte[] bytes) {
        super(bytes);
    }

    final static void prepareThemeSoundSamples(int methodGuard, int themeId) {
        int soundIndexThenFlagReset = 0;
        RuntimeException caughtSamplePreparationFailure = null;
        RuntimeException samplePreparationFailureForContext = null;
        PcmSample sampleBeforeResampling = null;
        int preparedFlagIndex = 0;
        try {
          soundIndexThenFlagReset = 0;
          if (methodGuard >= -117) {
            return;
          }
          while (33 > soundIndexThenFlagReset) {
            if (themeId != TextTemplateArgumentType.gameSoundThemeIds[soundIndexThenFlagReset]) {
              soundIndexThenFlagReset++;
              continue;
            }
            if (!SecondaryNodeHashTable.gameSoundPreparationFlags[soundIndexThenFlagReset]) {
              if ((10 <= soundIndexThenFlagReset) &&
                  (26 >= soundIndexThenFlagReset)) {
                sampleBeforeResampling = te.gameSoundSampleCache.getVorbisSampleByName(-1879044097, w.gameSoundResourceNames[soundIndexThenFlagReset]);
              } else {
                sampleBeforeResampling = te.gameSoundSampleCache.getSynthesizedSampleByName(1, w.gameSoundResourceNames[soundIndexThenFlagReset]);
              }
              GameSoundResources.gameSoundSamples[soundIndexThenFlagReset] = sampleBeforeResampling.resampleInPlace(AchievementSubmission.gameSoundResampler);
              SecondaryNodeHashTable.gameSoundPreparationFlags[soundIndexThenFlagReset] = true;
            }
            soundIndexThenFlagReset++;
          }
          preparedFlagIndex = 0;
          soundIndexThenFlagReset = preparedFlagIndex;
          while (preparedFlagIndex < 33) {
            if (!SecondaryNodeHashTable.gameSoundPreparationFlags[preparedFlagIndex]) {
              return;
            }
            preparedFlagIndex++;
          }
          AchievementSubmission.gameSoundResampler = null;
          return;
        } catch (java.lang.RuntimeException samplePreparationFailure) {
          caughtSamplePreparationFailure = samplePreparationFailure;
          samplePreparationFailureForContext = caughtSamplePreparationFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) samplePreparationFailureForContext), "pk.IB(" + methodGuard + ',' + themeId + ')');
        }
    }

    public static void j(int param0) {
        connectivityVisitedByEntityId = null;
        resultBubbleSprite = null;
        if (param0 != 0) {
            field_r = (String) null;
        }
        field_r = null;
        field_q = null;
        currentProtocolStage = null;
    }

    final int readBits(byte methodGuard, int remainingBitCount) {
        int consumedByteIndex = 0;
        int unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        int byteIndex = this.bitPosition >> 3;
        if (methodGuard != -17) {
            return -69;
        }
        int bitsAvailableInByte = 8 - (7 & this.bitPosition);
        int readValue = 0;
        this.bitPosition = this.bitPosition + remainingBitCount;
        while (bitsAvailableInByte < remainingBitCount) {
            consumedByteIndex = byteIndex;
            byteIndex++;
            readValue = readValue + ((this.bytes[consumedByteIndex] & MidiPcmStream.lowBitMasks[bitsAvailableInByte]) << -bitsAvailableInByte + remainingBitCount);
            remainingBitCount = remainingBitCount - bitsAvailableInByte;
            bitsAvailableInByte = 8;
        }
        if (remainingBitCount == bitsAvailableInByte) {
            readValue = readValue + (this.bytes[byteIndex] & MidiPcmStream.lowBitMasks[bitsAvailableInByte]);
        } else {
            readValue = readValue + (this.bytes[byteIndex] >> bitsAvailableInByte - remainingBitCount & MidiPcmStream.lowBitMasks[remainingBitCount]);
        }
        return readValue;
    }

    final void writeCipherByte(int value, byte methodGuard) {
        int packetByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[packetByteIndex] = (byte)(value + this.cipher.nextInt(0));
        if (methodGuard >= -12) {
            PacketBuffer.prepareThemeSoundSamples(-6, -80);
        }
    }

    final void endBitAccess(int methodGuard) {
        this.position = (7 + this.bitPosition) / 8;
        if (methodGuard != -16989) {
            this.cipher = (PacketByteCipher) null;
        }
    }

    final int readCipherByte(byte methodGuard) {
        if (methodGuard != 122) {
            this.beginBitAccess(-51);
        }
        int packetByteIndex = this.position;
        this.position = this.position + 1;
        return 255 & this.bytes[packetByteIndex] - this.cipher.nextInt(0);
    }

    PacketBuffer(int capacity) {
        super(capacity);
    }

    static {
        field_r = "   ";
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_m = 15;
        connectivityVisitedByEntityId = new boolean[1000];
    }
}
