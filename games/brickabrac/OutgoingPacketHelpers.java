/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OutgoingPacketHelpers {
    private static long[] crc64LookupTable;
    static boolean[] decodedSpriteHasAlpha;
    static String field_h;
    static NodeDeque pendingTableSubmissions;
    static int field_a;
    static String field_e;
    static String field_d;
    static int field_g;

    final static void writeEncryptedPayload(PacketBuffer destination, int length, byte obfuscationGuard, java.math.BigInteger rsaExponent, int offset, byte[] source, java.math.BigInteger rsaModulus) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String destinationSummary = null;
        StringBuilder exponentContextBuilder = null;
        String exponentSummary = null;
        StringBuilder sourceContextBuilder = null;
        String sourceSummary = null;
        StringBuilder modulusContextBuilder = null;
        String modulusSummary = null;
        RuntimeException caughtFailure = null;
        int paddedLength = 0;
        RuntimeException failure = null;
        int[] keyWordsAlias = null;
        int randomWordIndex = 0;
        int unusedGameFlag = 0;
        int headerWordIndex = 0;
        int[] keyWordsInitialAlias = null;
        int[] keyWords = null;
        int discardedHeaderStartIndex;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          paddedLength = ProxySocketConnector.roundUpToEight((byte) -98, length);
          if (null == ReflectionCheck.payloadKeyRandom) {
            ReflectionCheck.payloadKeyRandom = new java.security.SecureRandom();
          }
          keyWords = new int[4];
          keyWordsInitialAlias = keyWords;
          keyWordsAlias = keyWordsInitialAlias;
          for (randomWordIndex = 0; randomWordIndex < 4; randomWordIndex++) {
            keyWordsAlias[randomWordIndex] = ReflectionCheck.payloadKeyRandom.nextInt();
          }
          if (RadialSelectorWidget.encryptedPayloadScratch == null ||
            !(RadialSelectorWidget.encryptedPayloadScratch.data.length >= paddedLength)) {
            RadialSelectorWidget.encryptedPayloadScratch = new PacketBuffer(paddedLength);
          }
          RadialSelectorWidget.encryptedPayloadScratch.position = 0;
          RadialSelectorWidget.encryptedPayloadScratch.writeBytes(source, -1, offset, length);
          RadialSelectorWidget.encryptedPayloadScratch.padToPosition((byte) -74, paddedLength);
          RadialSelectorWidget.encryptedPayloadScratch.encryptBlocks(18146, keyWords);
          if (null == RectangleBody.encryptedKeyHeaderScratch ||
            !(RectangleBody.encryptedKeyHeaderScratch.data.length >= 100)) {
            RectangleBody.encryptedKeyHeaderScratch = new PacketBuffer(100);
          }
          RectangleBody.encryptedKeyHeaderScratch.position = 0;
          RectangleBody.encryptedKeyHeaderScratch.writeByte(21, 10);
          if (obfuscationGuard <= 115) {
            OutgoingPacketHelpers.getChatFilter(-128, (byte) -47);
          }
          headerWordIndex = 0;
          discardedHeaderStartIndex = headerWordIndex;
          while (4 > headerWordIndex) {
            RectangleBody.encryptedKeyHeaderScratch.writeInt(keyWords[headerWordIndex], (byte) -79);
            headerWordIndex++;
          }
          RectangleBody.encryptedKeyHeaderScratch.writeShort((byte) 122, length);
          RectangleBody.encryptedKeyHeaderScratch.applyRsa(rsaExponent, rsaModulus, 19775);
          destination.writeBytes(RectangleBody.encryptedKeyHeaderScratch.data, -1, 0, RectangleBody.encryptedKeyHeaderScratch.position);
          destination.writeBytes(RadialSelectorWidget.encryptedPayloadScratch.data, -1, 0, RadialSelectorWidget.encryptedPayloadScratch.position);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("tm.B(");
          if (destination == null) {
            destinationSummary = "null";
          } else {
            destinationSummary = "{...}";
          }
          exponentContextBuilder = ((StringBuilder) (Object) contextBuilder).append(destinationSummary).append(',').append(length).append(',').append(obfuscationGuard).append(',');
          if (rsaExponent == null) {
            exponentSummary = "null";
          } else {
            exponentSummary = "{...}";
          }
          sourceContextBuilder = ((StringBuilder) (Object) exponentContextBuilder).append(exponentSummary).append(',').append(offset).append(',');
          if (source == null) {
            sourceSummary = "null";
          } else {
            sourceSummary = "{...}";
          }
          modulusContextBuilder = ((StringBuilder) (Object) sourceContextBuilder).append(sourceSummary).append(',');
          if (rsaModulus == null) {
            modulusSummary = "null";
          } else {
            modulusSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) modulusContextBuilder).append(modulusSummary).append(')').toString());
        }
    }

    final static void flushGamePackets(byte obfuscationGuard, int keepaliveOpcode) {
        RuntimeException caughtFailure = null;
        long nowMillis = 0L;
        RuntimeException failure = null;
        int delayMillis = 0;
        int copyIndex = 0;
        DelayedPacket queuedPacket = null;
        int unusedGameFlag = 0;
        byte[] payloadCopy = null;
        DelayedPacket headPacket = null;
        int deliveryIndex = 0;
        byte[] payloadCopyAlias = null;
        DelayedPacket duePacket = null;
        byte[] allocatedPayload = null;
        byte[] queuedPayload = null;
        int discardedDeliveryStartIndex;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (TabbedPane.outgoingDelayMillis != 0) {
            nowMillis = MonotonicTime.nowMillis(false);
            delayMillis = TabbedPane.outgoingDelayMillis;
            if (HuffmanCodec.outgoingDelayJitterMillis != 0.0) {
              delayMillis = (int)((double)delayMillis + IterableIntrusiveHashTable.packetDelayRandom.nextGaussian() * HuffmanCodec.outgoingDelayJitterMillis);
              if (0 > delayMillis) {
                delayMillis = 0;
              }
            }
            if (0 < TextFieldValidator.outgoingPackets.position) {
              allocatedPayload = new byte[TextFieldValidator.outgoingPackets.position];
              payloadCopyAlias = allocatedPayload;
              payloadCopy = payloadCopyAlias;
              queuedPayload = payloadCopy;
              for (copyIndex = 0; allocatedPayload.length > copyIndex; copyIndex++) {
                payloadCopy[copyIndex] = TextFieldValidator.outgoingPackets.data[copyIndex];
              }
              queuedPacket = new DelayedPacket(nowMillis + (long)delayMillis, TextFieldValidator.outgoingPackets.position, queuedPayload);
              DisplayModeInfo.delayedOutgoingPackets.addLast(queuedPacket, (byte) 3);
              TextFieldValidator.outgoingPackets.position = 0;
            }
            headPacket = (DelayedPacket) (DisplayModeInfo.delayedOutgoingPackets.first(-62));
            duePacket = headPacket;
            if (duePacket != null &&
              duePacket.deliverAfterMillis < nowMillis) {
              duePacket.unlink((byte) 111);
              deliveryIndex = 0;
              discardedDeliveryStartIndex = deliveryIndex;
              while (deliveryIndex < duePacket.opcodeOrByteCount) {
                TextFieldValidator.outgoingPackets.data[deliveryIndex] = headPacket.data[deliveryIndex];
                deliveryIndex++;
              }
              TextFieldValidator.outgoingPackets.position = duePacket.opcodeOrByteCount;
            }
          }
          if (obfuscationGuard != 110) {
            decodedSpriteHasAlpha = (boolean[]) null;
          }
          ActivityIndicatorWidget.flushTransportPackets(keepaliveOpcode, 10000);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "tm.D(" + obfuscationGuard + ',' + keepaliveOpcode + ')');
        }
    }

    public static void a(boolean param0) {
        crc64LookupTable = null;
        field_h = null;
        if (!param0) {
          return;
        }
        decodedSpriteHasAlpha = null;
        pendingTableSubmissions = null;
        field_e = null;
        field_d = null;
    }

    final static int getChatFilter(int channel, byte obfuscationGuard) {
        int filter = 0;
        if (channel == 0) {
          filter = InstructionsScreen.lobbyChatFilter;
        }
        if (obfuscationGuard != 18) {
          java.math.BigInteger unusedModulus = (java.math.BigInteger) null;
          OutgoingPacketHelpers.writeEncryptedPayload((PacketBuffer) null, 46, (byte) -64, (java.math.BigInteger) null, -75, (byte[]) null, (java.math.BigInteger) null);
        }
        if (channel == 1) {
          filter = InstructionsScreen.gameChatFilter;
        }
        if (channel == 2) {
          filter = WeightedLruCache.privateChatFilter;
        }
        return filter;
    }

    static {
        int tableIndex = 0;
        int bitIndex = 0;
        long remainder;
        crc64LookupTable = new long[256];
        for (tableIndex = 0; tableIndex < 256; tableIndex++) {
          remainder = (long)tableIndex;
          for (bitIndex = 0; bitIndex < 8; bitIndex++) {
            if ((1L & remainder) == 1L) {
              remainder = -3932672073523589310L ^ remainder >>> 1;
            } else {
              remainder = remainder >>> 1;
            }
          }
          crc64LookupTable[tableIndex] = remainder;
        }
        field_h = "Ninja skills!";
        field_e = "Waiting for graphics";
        pendingTableSubmissions = new NodeDeque();
        field_d = "Strong: balls destroy bricks without bouncing.";
    }
}
