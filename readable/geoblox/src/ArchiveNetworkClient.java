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
    static String[] field_a;
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

    final static void f(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        PacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          if (param0 > -99) {
            return;
          }
          var1 = fj.field_q;
          while (cf.c((byte) -114)) {
            var1.writeCipherByte(8, (byte) -71);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            pf.a(46, var1);
            fj.field_q.backpatchLengthByte(11700, var1.position - var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1_ref), "ji.B(" + param0 + ')');
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
                field_a = (String[]) null;
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

    final static short[] a(short[] param0, int param1, int param2, PacketBuffer param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          var4_int = param3.readBits((byte) -17, param1);
          if (var4_int == param2) {
            return null;
          }
          if (!((param0 != null) &&
                (var4_int == param0.length))) {
            param0 = new short[var4_int];
          }
          var5 = param3.readBits((byte) -17, 4);
          var6 = (short)param3.readBits((byte) -17, 16);
          if (var5 <= 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)(var6 + param3.readBits((byte) -17, var5));
            }
          }
          stackIn_16_0 = (short[]) (param0);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var4);
          stackIn_19_1 = new StringBuilder().append("ji.J(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
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
        IndexedSprite[] sprites = new IndexedSprite[sb.decodedSpriteCount];
        for (spriteIndex = firstSpriteIndex; sb.decodedSpriteCount > spriteIndex; spriteIndex++) {
            sprites[spriteIndex] = new IndexedSprite(pg.decodedSpriteCanvasWidth, dd.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], md.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], hl.decodedSpriteHeights[spriteIndex], mj.decodedSpriteIndices[spriteIndex], cm.decodedSpritePalette);
        }
        kj.clearDecodedSpriteWorkingArrays(true);
        return sprites;
    }

    public static void d(int param0) {
        waitingForMusicText = null;
        movingEntities = null;
        field_a = null;
        createPasswordLengthAlertText = null;
        createWelcomeText = null;
        int var1 = 78 / ((15 - param0) / 56);
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
        field_a = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
