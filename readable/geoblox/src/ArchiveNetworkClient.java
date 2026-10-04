/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveNetworkClient {
    SecondaryDeque pendingPriorityRequests;
    static IntrusiveDeque movingEntities;
    static String createWelcomeText;
    SecondaryDeque sentPriorityRequests;
    static int difficultyStep;
    SecondaryDeque pendingBackgroundRequests;
    static String createPasswordLengthAlertText;
    static String[] gmtWeekdayAbbreviations;
    static String waitingForMusicText;
    SecondaryDeque sentBackgroundRequests;
    int responseIdleMillis;
    long lastPollMillis;
    ByteArrayBuffer outboundPacketBuffer;
    volatile int failureCount;
    byte responseXorKey;
    volatile int failureCode;
    ByteArrayBuffer responseHeaderBuffer;
    NetworkArchiveRequest currentResponseRequest;

    abstract void closeSocket(int methodGuard);

    final static void sendReadyReflectionCheckReplies(int methodGuard) {
        int replyPayloadStartSnapshot = 0;
        RuntimeException caughtReplyFailure = null;
        PacketBuffer packet = null;
        RuntimeException replyFailureForContext = null;
        int payloadStart = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard > -99) {
            return;
          }
          packet = CacheReference.outgoingSessionBuffer;
          while (AgeValidator.isFirstReflectionCheckReady((byte) -114)) {
            packet.writeCipherByte(8, (byte) -71);
            replyPayloadStartSnapshot = packet.position + 1;
            packet.position = packet.position + 1;
            payloadStart = replyPayloadStartSnapshot;
            LoginPanel.writeReflectionCheckReply(46, packet);
            CacheReference.outgoingSessionBuffer.backpatchLengthByte(11700, packet.position - payloadStart);
          }
          return;
        } catch (java.lang.RuntimeException replyFailure) {
          caughtReplyFailure = replyFailure;
          replyFailureForContext = caughtReplyFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) replyFailureForContext), "ji.B(" + methodGuard + ')');
        }
    }

    abstract void attachSocket(Object socketObject, boolean methodGuard, boolean useControlOpcode2);

    final NetworkArchiveRequest queueRequest(byte reservedTailBytes, int archiveId, int methodGuard, int groupId, boolean priority) {
        long requestKey = ((long)archiveId << 32) + (long)groupId;
        NetworkArchiveRequest request = new NetworkArchiveRequest();
        request.secondaryKey = requestKey;
        request.priority = priority ? true : false;
        request.reservedTailBytes = reservedTailBytes;
        if (!priority) {
            if (this.countBackgroundRequests(false) >= 20) {
                throw new RuntimeException();
            }
            this.pendingBackgroundRequests.addLast(8, request);
        } else {
            if (this.countPriorityRequests(methodGuard ^ 108) >= 20) {
                throw new RuntimeException();
            }
            this.pendingPriorityRequests.addLast(methodGuard ^ -123, request);
        }
        if (methodGuard == -21) {
            return request;
        }
        this.pendingPriorityRequests = (SecondaryDeque) null;
        return request;
    }

    final int countPriorityRequests(int methodGuard) {
        if (methodGuard < -39) {
            return this.pendingPriorityRequests.countNodes((byte) 67) + this.sentPriorityRequests.countNodes((byte) 67);
        }
        ArchiveNetworkClient.sleepIgnoringInterrupt(49L, (byte) 33);
        return this.pendingPriorityRequests.countNodes((byte) 67) + this.sentPriorityRequests.countNodes((byte) 67);
    }

    final static void sleepIgnoringInterrupt(long durationMillis, byte methodGuard) {
        try {
            Throwable caughtSleepFailure = null;
            InterruptedException ignoredSleepInterruption = null;
            try {
              Thread.sleep(durationMillis);
              if (methodGuard != -33) {
                gmtWeekdayAbbreviations = (String[]) null;
                return;
              }
            } catch (java.lang.InterruptedException sleepInterruption) {
              caughtSleepFailure = sleepInterruption;
              ignoredSleepInterruption = (InterruptedException) (Object) caughtSleepFailure;
            }
        } catch (RuntimeException | Error uncheckedSleepFailure) {
            throw uncheckedSleepFailure;
        } catch (Throwable checkedSleepFailure) {
            throw new RuntimeException(checkedSleepFailure);
        }
    }

    final boolean isPriorityQueueFull(int methodGuard) {
        if (methodGuard == 20) {
            return this.countPriorityRequests(-104) >= 20 ? true : false;
        }
        createWelcomeText = (String) null;
        return this.countPriorityRequests(-104) >= 20 ? true : false;
    }

    abstract void resetAfterValidationFailure(int methodGuard);

    final int countBackgroundRequests(boolean methodGuard) {
        if (!methodGuard) {
            return this.pendingBackgroundRequests.countNodes((byte) 67) + this.sentBackgroundRequests.countNodes((byte) 67);
        }
        this.responseIdleMillis = -38;
        return this.pendingBackgroundRequests.countNodes((byte) 67) + this.sentBackgroundRequests.countNodes((byte) 67);
    }

    final static short[] readPackedShortArray(short[] destination, int lengthBitCount, int nullLengthSentinel, PacketBuffer packet) {
        int elementCount = 0;
        int deltaBitCount = 0;
        int signedBaseValue = 0;
        int elementIndex = 0;
        int unusedClientControlSnapshot = 0;
        short[] destinationBeforeReturn = null;
        RuntimeException readFailureBeforeDescription = null;
        StringBuilder readMessagePrefix = null;
        String destinationDescription = null;
        StringBuilder messageBeforePacket = null;
        String packetDescription = null;
        RuntimeException caughtReadFailure = null;
        RuntimeException readFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          elementCount = packet.readBits((byte) -17, lengthBitCount);
          if (elementCount == nullLengthSentinel) {
            return null;
          }
          if (!((destination != null) &&
                (elementCount == destination.length))) {
            destination = new short[elementCount];
          }
          deltaBitCount = packet.readBits((byte) -17, 4);
          signedBaseValue = (short)packet.readBits((byte) -17, 16);
          if (deltaBitCount <= 0) {
            for (elementIndex = 0; elementCount > elementIndex; elementIndex++) {
              destination[elementIndex] = (short)signedBaseValue;
            }
          } else {
            for (elementIndex = 0; elementCount > elementIndex; elementIndex++) {
              destination[elementIndex] = (short)(signedBaseValue + packet.readBits((byte) -17, deltaBitCount));
            }
          }
          destinationBeforeReturn = (short[]) (destination);
          return destinationBeforeReturn;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = caughtReadFailure;
          readFailureBeforeDescription = readFailureForContext;
          readMessagePrefix = new StringBuilder().append("ji.J(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          messageBeforePacket = ((StringBuilder) (Object) readMessagePrefix).append(destinationDescription).append(',').append(lengthBitCount).append(',').append(nullLengthSentinel).append(',');
          if (packet == null) {
            packetDescription = "null";
          } else {
            packetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readFailureBeforeDescription), ((StringBuilder) (Object) messageBeforePacket).append(packetDescription).append(')').toString());
        }
    }

    abstract boolean pollResponses(byte methodGuard);

    final boolean isBackgroundQueueFull(int methodGuard) {
        if (methodGuard == -21) {
            return this.countBackgroundRequests(false) >= 20 ? true : false;
        }
        this.pollResponses((byte) 74);
        return this.countBackgroundRequests(false) >= 20 ? true : false;
    }

    final static IndexedSprite[] buildIndexedSpritesFromDecodedSheet(int firstSpriteIndex) {
        int spriteIndex = 0;
        int unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        IndexedSprite[] sprites = new IndexedSprite[ClientTimingSupport.decodedSpriteCount];
        for (spriteIndex = firstSpriteIndex; ClientTimingSupport.decodedSpriteCount > spriteIndex; spriteIndex++) {
            sprites[spriteIndex] = new IndexedSprite(GameplaySetupSupport.decodedSpriteCanvasWidth, FadingDialog.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], GmtTimestampSupport.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], ProgressBarWidget.decodedSpriteHeights[spriteIndex], TextConcatenationSupport.decodedSpriteIndices[spriteIndex], NanoFrameTimer.decodedSpritePalette);
        }
        MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
        return sprites;
    }

    public static void releaseStaticReferences(int methodGuard) {
        waitingForMusicText = null;
        movingEntities = null;
        gmtWeekdayAbbreviations = null;
        createPasswordLengthAlertText = null;
        createWelcomeText = null;
        int guardQuotient = 78 / ((15 - methodGuard) / 56);
    }

    ArchiveNetworkClient() {
        this.pendingPriorityRequests = new SecondaryDeque();
        this.sentPriorityRequests = new SecondaryDeque();
        this.pendingBackgroundRequests = new SecondaryDeque();
        this.sentBackgroundRequests = new SecondaryDeque();
        this.outboundPacketBuffer = new ByteArrayBuffer(6);
        this.failureCount = 0;
        this.responseXorKey = (byte) 0;
        this.failureCode = 0;
        this.responseHeaderBuffer = new ByteArrayBuffer(10);
    }

    static {
        createWelcomeText = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        movingEntities = new IntrusiveDeque();
        difficultyStep = 0;
        createPasswordLengthAlertText = "Passwords must be between 5 and 20 characters long";
        waitingForMusicText = "Waiting for music";
        gmtWeekdayAbbreviations = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
