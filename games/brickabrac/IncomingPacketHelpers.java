/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IncomingPacketHelpers {
    static int decodedSpriteCount;
    static RgbSprite chocolateNearSprite;
    static ResourceArchive field_a;
    static LobbyGame pendingLobbyGame;
    static RgbSprite field_e;
    static RgbSprite gameLogoSprite;

    public static void a(int param0) {
        field_a = null;
        chocolateNearSprite = null;
        pendingLobbyGame = null;
        field_e = null;
        gameLogoSprite = null;
        if (param0 > -68) {
          int[] var2 = (int[]) null;
          IncomingPacketHelpers.readNextGamePacket((int[]) null, (byte) -73);
          return;
        }
    }

    final static boolean readNextGamePacket(int[] packetLengths, byte obfuscationGuard) {
        int queuedByteIndex = 0;
        int receivedByteIndex = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String packetLengthsSummary = null;
        RuntimeException caughtFailure = null;
        long nowMillis = 0L;
        RuntimeException failure = null;
        DelayedPacket queuedPacket = null;
        int delayMillis = 0;
        DelayedPacket delayedPacket = null;
        int clientBranchFlag = 0;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (MenuButton.loggedInConnection != GameConnectionHelpers.connectionPhase) {
            return false;
          }
          if (obfuscationGuard != 64) {
            pendingLobbyGame = (LobbyGame) null;
          }
          nowMillis = MonotonicTime.nowMillis(false);
          if (0 != MonotonicTime.packetDelayMillis &&
            PasswordFieldRenderer.pendingPacketOpcode < 0) {
            queuedPacket = (DelayedPacket) (AchievementMaskRequest.delayedPackets.first(-124));
            if (queuedPacket != null &&
              nowMillis > queuedPacket.deliverAfterMillis) {
              queuedPacket.unlink((byte) 111);
              ga.incomingPacketLength = queuedPacket.data.length;
              LogoRenderHelpers.incomingPackets.position = 0;
              for (queuedByteIndex = 0; ga.incomingPacketLength > queuedByteIndex; queuedByteIndex++) {
                LogoRenderHelpers.incomingPackets.data[queuedByteIndex] = queuedPacket.data[queuedByteIndex];
              }
              TextFieldRenderer.thirdPreviousPacketOpcode = we.secondPreviousPacketOpcode;
              we.secondPreviousPacketOpcode = UiComponent.previousPacketOpcode;
              UiComponent.previousPacketOpcode = IntrusiveHashTable.currentPacketOpcode;
              IntrusiveHashTable.currentPacketOpcode = queuedPacket.opcodeOrByteCount;
              return true;
            }
          }
          while (true) {
            if (0 > PasswordFieldRenderer.pendingPacketOpcode) {
              LogoRenderHelpers.incomingPackets.position = 0;
              if (!PacketReceiveHelpers.ensureGamePacketBytes(20, 1)) {
                return false;
              }
              PasswordFieldRenderer.pendingPacketOpcode = LogoRenderHelpers.incomingPackets.readCipheredOpcode(true);
              LogoRenderHelpers.incomingPackets.position = 0;
              ga.incomingPacketLength = packetLengths[PasswordFieldRenderer.pendingPacketOpcode];
            }
            if (!TextWidgetRenderer.ensureGamePacketBody((byte) -104)) {
              return false;
            }
            if (MonotonicTime.packetDelayMillis == 0) {
              TextFieldRenderer.thirdPreviousPacketOpcode = we.secondPreviousPacketOpcode;
              we.secondPreviousPacketOpcode = UiComponent.previousPacketOpcode;
              UiComponent.previousPacketOpcode = IntrusiveHashTable.currentPacketOpcode;
              IntrusiveHashTable.currentPacketOpcode = PasswordFieldRenderer.pendingPacketOpcode;
              PasswordFieldRenderer.pendingPacketOpcode = -1;
              return true;
            }
            delayMillis = MonotonicTime.packetDelayMillis;
            if (0.0 != StrongCacheEntry.packetDelayJitter) {
              delayMillis = (int)((double)delayMillis + IterableIntrusiveHashTable.packetDelayRandom.nextGaussian() * StrongCacheEntry.packetDelayJitter);
              if (0 > delayMillis) {
                delayMillis = 0;
              }
            }
            delayedPacket = new DelayedPacket(nowMillis + (long)delayMillis, PasswordFieldRenderer.pendingPacketOpcode, new byte[ga.incomingPacketLength]);
            for (receivedByteIndex = 0; ga.incomingPacketLength > receivedByteIndex; receivedByteIndex++) {
              delayedPacket.data[receivedByteIndex] = LogoRenderHelpers.incomingPackets.data[receivedByteIndex];
            }
            AchievementMaskRequest.delayedPackets.addLast(delayedPacket, (byte) 3);
            PasswordFieldRenderer.pendingPacketOpcode = -1;
          }
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("nl.A(");
          if (packetLengths == null) {
            packetLengthsSummary = "null";
          } else {
            packetLengthsSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(packetLengthsSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static String formatScaledDecimal(boolean obfuscationGuard, boolean groupThousands, int fractionDigits, long scaledValue, int localeId) {
        StringBuilder discardedFractionAppend = null;
        StringBuilder discardedDecimalAppend = null;
        StringBuilder discardedIntegerAppend = null;
        StringBuilder discardedSignAppend = null;
        StringBuilder discardedGroupAppend = null;
        StringBuilder alternateDiscardedFractionAppend = null;
        StringBuilder alternateDiscardedDecimalAppend = null;
        StringBuilder alternateDiscardedIntegerAppend = null;
        StringBuilder alternateDiscardedSignAppend = null;
        StringBuilder alternateDiscardedGroupAppend = null;
        int decimalSeparator;
        int groupSeparator;
        int negativeFlag;
        StringBuilder alternateBuilderAlias;
        int fractionIndex;
        int fractionLowWord;
        int unusedGameFlag;
        StringBuilder alternateBuilder;
        StringBuilder builder;
        int alternateNegativeFlag;
        int alternateFractionIndex;
        int alternateGroupDigitCount;
        int alternateFractionLowWord;
        int alternateIntegerLowWord;
        int groupDigitCount;
        int integerLowWord;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        decimalSeparator = 44;
        groupSeparator = 46;
        if (0 == localeId) {
          decimalSeparator = 46;
          groupSeparator = 44;
        }
        if (localeId == 2) {
          groupSeparator = 160;
        }
        if (obfuscationGuard) {
          negativeFlag = 0;
          if (scaledValue < 0L) {
            scaledValue = -scaledValue;
            negativeFlag = 1;
          }
          builder = new StringBuilder(26);
          if (fractionDigits > 0) {
            for (fractionIndex = 0; fractionDigits > fractionIndex; fractionIndex++) {
              fractionLowWord = (int)scaledValue;
              scaledValue = scaledValue / 10L;
              discardedFractionAppend = builder.append((char)(-((int)scaledValue * 10) + (48 + fractionLowWord)));
            }
            discardedDecimalAppend = builder.append((char) decimalSeparator);
          }
          groupDigitCount = 0;
          while (true) {
            integerLowWord = (int)scaledValue;
            scaledValue = scaledValue / 10L;
            discardedIntegerAppend = builder.append((char)(-(10 * (int)scaledValue) + integerLowWord + 48));
            if (scaledValue == 0L) {
              if (negativeFlag == 0) {
                return builder.reverse().toString();
              }
              discardedSignAppend = builder.append('-');
              return builder.reverse().toString();
            }
            if (!groupThousands) {
              continue;
            }
            groupDigitCount++;
            if (groupDigitCount % 3 != 0) {
              continue;
            }
            discardedGroupAppend = builder.append((char) groupSeparator);
          }
        }
        field_a = (ResourceArchive) null;
        alternateNegativeFlag = 0;
        if (scaledValue < 0L) {
          scaledValue = -scaledValue;
          alternateNegativeFlag = 1;
        }
        alternateBuilder = new StringBuilder(26);
        alternateBuilderAlias = alternateBuilder;
        if (fractionDigits > 0) {
          for (alternateFractionIndex = 0; fractionDigits > alternateFractionIndex; alternateFractionIndex++) {
            alternateFractionLowWord = (int)scaledValue;
            scaledValue = scaledValue / 10L;
            alternateDiscardedFractionAppend = alternateBuilder.append((char)(-((int)scaledValue * 10) + (48 + alternateFractionLowWord)));
          }
          alternateDiscardedDecimalAppend = alternateBuilder.append((char) decimalSeparator);
        }
        alternateGroupDigitCount = 0;
        while (true) {
          alternateIntegerLowWord = (int)scaledValue;
          scaledValue = scaledValue / 10L;
          alternateDiscardedIntegerAppend = alternateBuilder.append((char)(-(10 * (int)scaledValue) + alternateIntegerLowWord + 48));
          if (scaledValue == 0L) {
            if (alternateNegativeFlag == 0) {
              return alternateBuilder.reverse().toString();
            }
            alternateDiscardedSignAppend = alternateBuilder.append('-');
            return alternateBuilder.reverse().toString();
          }
          if (!groupThousands) {
            continue;
          }
          alternateGroupDigitCount++;
          if (alternateGroupDigitCount % 3 != 0) {
            continue;
          }
          alternateDiscardedGroupAppend = alternateBuilder.append((char) groupSeparator);
        }
    }

    static {
    }
}
