/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static int decodedSpriteCount;
    static RgbSprite chocolateNearSprite;
    static ResourceArchive field_a;
    static LobbyGame pendingLobbyGame;
    static RgbSprite field_e;
    static RgbSprite field_b;

    public static void a(int param0) {
        field_a = null;
        chocolateNearSprite = null;
        pendingLobbyGame = null;
        field_e = null;
        field_b = null;
        if (param0 > -68) {
          int[] var2 = (int[]) null;
          nl.readNextGamePacket((int[]) null, (byte) -73);
          return;
        }
    }

    final static boolean readNextGamePacket(int[] packetLengths, byte obfuscationGuard) {
        int queuedByteIndex = 0;
        int receivedByteIndex = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        long nowMillis = 0L;
        RuntimeException var2 = null;
        DelayedPacket queuedPacket = null;
        int delayMillis = 0;
        DelayedPacket delayedPacket = null;
        int clientBranchFlag = 0;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (MenuButton.field_i != rf.field_b) {
            return false;
          }
          if (obfuscationGuard != 64) {
            pendingLobbyGame = (LobbyGame) null;
          }
          nowMillis = MonotonicTime.nowMillis(false);
          if (0 != MonotonicTime.packetDelayMillis &&
            ob.pendingPacketOpcode < 0) {
            queuedPacket = (DelayedPacket) (AchievementMaskRequest.delayedPackets.first(-124));
            if (queuedPacket != null &&
              nowMillis > queuedPacket.deliverAfterMillis) {
              queuedPacket.unlink((byte) 111);
              ga.incomingPacketLength = queuedPacket.data.length;
              jl.incomingPackets.position = 0;
              for (queuedByteIndex = 0; ga.incomingPacketLength > queuedByteIndex; queuedByteIndex++) {
                jl.incomingPackets.data[queuedByteIndex] = queuedPacket.data[queuedByteIndex];
              }
              r.thirdPreviousPacketOpcode = we.secondPreviousPacketOpcode;
              we.secondPreviousPacketOpcode = UiComponent.previousPacketOpcode;
              UiComponent.previousPacketOpcode = IntrusiveHashTable.currentPacketOpcode;
              IntrusiveHashTable.currentPacketOpcode = queuedPacket.opcode;
              return true;
            }
          }
          while (true) {
            if (0 > ob.pendingPacketOpcode) {
              jl.incomingPackets.position = 0;
              if (!vd.ensureGamePacketBytes(20, 1)) {
                return false;
              }
              ob.pendingPacketOpcode = jl.incomingPackets.readCipheredOpcode(true);
              jl.incomingPackets.position = 0;
              ga.incomingPacketLength = packetLengths[ob.pendingPacketOpcode];
            }
            if (!um.ensureGamePacketBody((byte) -104)) {
              return false;
            }
            if (MonotonicTime.packetDelayMillis == 0) {
              r.thirdPreviousPacketOpcode = we.secondPreviousPacketOpcode;
              we.secondPreviousPacketOpcode = UiComponent.previousPacketOpcode;
              UiComponent.previousPacketOpcode = IntrusiveHashTable.currentPacketOpcode;
              IntrusiveHashTable.currentPacketOpcode = ob.pendingPacketOpcode;
              ob.pendingPacketOpcode = -1;
              return true;
            }
            delayMillis = MonotonicTime.packetDelayMillis;
            if (0.0 != ej.packetDelayJitter) {
              delayMillis = (int)((double)delayMillis + ji.packetDelayRandom.nextGaussian() * ej.packetDelayJitter);
              if (0 > delayMillis) {
                delayMillis = 0;
              }
            }
            delayedPacket = new DelayedPacket(nowMillis + (long)delayMillis, ob.pendingPacketOpcode, new byte[ga.incomingPacketLength]);
            for (receivedByteIndex = 0; ga.incomingPacketLength > receivedByteIndex; receivedByteIndex++) {
              delayedPacket.data[receivedByteIndex] = jl.incomingPackets.data[receivedByteIndex];
            }
            AchievementMaskRequest.delayedPackets.addLast(delayedPacket, (byte) 3);
            ob.pendingPacketOpcode = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("nl.A(");
          if (packetLengths == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, int param2, long param3, int param4) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        int var6;
        int var7;
        int var8;
        StringBuilder var9;
        int var10;
        int var11;
        int var12;
        StringBuilder var13;
        StringBuilder var14;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime3;
        int var11Lifetime3;
        var12 = BrickABrac.field_J ? 1 : 0;
        var6 = 44;
        var7 = 46;
        if (0 == param4) {
          var6 = 46;
          var7 = 44;
        }
        if (param4 == 2) {
          var7 = 160;
        }
        if (param0) {
          var8 = 0;
          if (param3 < 0L) {
            param3 = -param3;
            var8 = 1;
          }
          var14 = new StringBuilder(26);
          if (param2 > 0) {
            for (var10 = 0; param2 > var10; var10++) {
              var11 = (int)param3;
              param3 = param3 / 10L;
              discarded$1 = var14.append((char)(-((int)param3 * 10) + (48 + var11)));
            }
            discarded$0 = var14.append((char) var6);
          }
          var10Lifetime3 = 0;
          while (true) {
            var11Lifetime3 = (int)param3;
            param3 = param3 / 10L;
            discarded$2 = var14.append((char)(-(10 * (int)param3) + var11Lifetime3 + 48));
            if (param3 == 0L) {
              if (var8 == 0) {
                return var14.reverse().toString();
              }
              discarded$3 = var14.append('-');
              return var14.reverse().toString();
            }
            if (!param1) {
              continue;
            }
            var10Lifetime3++;
            if (var10Lifetime3 % 3 != 0) {
              continue;
            }
            discarded$4 = var14.append((char) var7);
          }
        }
        field_a = (ResourceArchive) null;
        var8Lifetime1 = 0;
        if (param3 < 0L) {
          param3 = -param3;
          var8Lifetime1 = 1;
        }
        var13 = new StringBuilder(26);
        var9 = var13;
        if (param2 > 0) {
          for (var10Lifetime1 = 0; param2 > var10Lifetime1; var10Lifetime1++) {
            var11Lifetime1 = (int)param3;
            param3 = param3 / 10L;
            discarded$6 = var13.append((char)(-((int)param3 * 10) + (48 + var11Lifetime1)));
          }
          discarded$5 = var13.append((char) var6);
        }
        var10Lifetime2 = 0;
        while (true) {
          var11Lifetime2 = (int)param3;
          param3 = param3 / 10L;
          discarded$7 = var13.append((char)(-(10 * (int)param3) + var11Lifetime2 + 48));
          if (param3 == 0L) {
            if (var8Lifetime1 == 0) {
              return var13.reverse().toString();
            }
            discarded$8 = var13.append('-');
            return var13.reverse().toString();
          }
          if (!param1) {
            continue;
          }
          var10Lifetime2++;
          if (var10Lifetime2 % 3 != 0) {
            continue;
          }
          discarded$9 = var13.append((char) var7);
        }
    }

    static {
    }
}
