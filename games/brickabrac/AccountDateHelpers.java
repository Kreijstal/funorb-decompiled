/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountDateHelpers {
    static String field_b;
    static String field_d;
    static String field_c;
    static RgbSprite[] field_a;

    final static String decodeCp1252(int length, int obfuscationGuard, byte[] data, int offset) {
        int byteIndex = 0;
        int charIndexBeforeIncrement = 0;
        int guardCalculation = 0;
        char[] charsAlias = null;
        int charCount = 0;
        int byteOrCharacter = 0;
        int extensionCharacter = 0;
        int unusedGameFlag = 0;
        char[] charsInitialAlias = null;
        char[] chars = null;
        String decodedText = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String dataSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          guardCalculation = 62 / ((obfuscationGuard + 48) / 54);
          chars = new char[length];
          charsInitialAlias = chars;
          charsAlias = charsInitialAlias;
          charCount = 0;
          for (byteIndex = 0; length > byteIndex; byteIndex++) {
            byteOrCharacter = data[offset + byteIndex] & 255;
            if (byteOrCharacter != 0) {
              if (byteOrCharacter >= 128 &&
                byteOrCharacter < 160) {
                extensionCharacter = ParisBackground.cp1252Extensions[-128 + byteOrCharacter];
                if (extensionCharacter == 0) {
                  extensionCharacter = 63;
                }
                byteOrCharacter = extensionCharacter;
              }
              charIndexBeforeIncrement = charCount;
              charCount++;
              charsAlias[charIndexBeforeIncrement] = (char)byteOrCharacter;
            }
          }
          decodedText = new String(chars, 0, charCount);
          return decodedText;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("df.G(").append(length).append(',').append(obfuscationGuard).append(',');
          if (data == null) {
            dataSummary = "null";
          } else {
            dataSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(dataSummary).append(',').append(offset).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 112 / ((param0 + 36) / 63);
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static int pollAccountDialogResult(int obfuscationGuard, int unusedWheelDelta, int unusedLocaleId, boolean unusedFlag) {
        if (obfuscationGuard != -27790) {
          AccountDateHelpers.a((byte) 15);
          return MovingBody.pollAccountDialogResult((byte) 109);
        }
        return MovingBody.pollAccountDialogResult((byte) 109);
    }

    final static Boolean takeEmailAvailabilityReply(int obfuscationGuard) {
        Boolean reply = AchievementBrowserScreen.pendingEmailAvailabilityReply;
        AchievementBrowserScreen.pendingEmailAvailabilityReply = null;
        if (obfuscationGuard != 0) {
          return (Boolean) null;
        }
        return reply;
    }

    final static int divideFloorPositive(int divisor, byte obfuscationGuard, int dividend) {
        int var3 = dividend >>> 31;
        if (obfuscationGuard == 15) {
          return (dividend + var3) / divisor - var3;
        }
        field_c = (String) null;
        return (dividend + var3) / divisor - var3;
    }

    final static void submitAchievement(AchievementSubmission submission, int opcode, int obfuscationGuard) {
        try {
          if (obfuscationGuard != -161) {
            field_b = (String) null;
          }
          DateFieldsWidget.pendingAchievementSubmissions.addLast(submission, (byte) 3);
          LevelSelectScreen.sendAchievementSubmission(opcode, submission, (byte) 119);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "df.D(" + (submission != null ? "{...}" : "null") + ',' + opcode + ',' + obfuscationGuard + ')');
        }
    }

    final static void sendBirthDate(int year, byte obfuscationGuard, int day, int monthIndex) {
        int payloadStartAfterLength = 0;
        int payloadStart = 0;
        int alternatePayloadStart;
        if (obfuscationGuard == 103) {
          MeshAudioHelpers.accountPacketScratch.position = 0;
          MeshAudioHelpers.accountPacketScratch.writeByte(-112, 12);
          MeshAudioHelpers.accountPacketScratch.writeInt(IterableIntrusiveHashTable.packetRandom.nextInt(), (byte) -79);
          MeshAudioHelpers.accountPacketScratch.writeInt(IterableIntrusiveHashTable.packetRandom.nextInt(), (byte) -79);
          MeshAudioHelpers.accountPacketScratch.writeByte(-104, day);
          MeshAudioHelpers.accountPacketScratch.writeByte(50, monthIndex);
          MeshAudioHelpers.accountPacketScratch.writeShort((byte) 124, year);
          MeshAudioHelpers.accountPacketScratch.applyRsa(Ball.accountRsaExponent, WeightedLruCache.accountRsaModulus, obfuscationGuard + 19672);
          TextFieldValidator.outgoingPackets.writeCipheredOpcode(obfuscationGuard ^ -13316, 18);
          payloadStartAfterLength = TextFieldValidator.outgoingPackets.position + 1;
          TextFieldValidator.outgoingPackets.position = TextFieldValidator.outgoingPackets.position + 1;
          payloadStart = payloadStartAfterLength;
          TextFieldValidator.outgoingPackets.writeBytes(MeshAudioHelpers.accountPacketScratch.data, -1, 0, MeshAudioHelpers.accountPacketScratch.position);
          TextFieldValidator.outgoingPackets.backfillByteLength((byte) 125, TextFieldValidator.outgoingPackets.position - payloadStart);
          return;
        }
        field_c = (String) null;
        MeshAudioHelpers.accountPacketScratch.position = 0;
        MeshAudioHelpers.accountPacketScratch.writeByte(-112, 12);
        MeshAudioHelpers.accountPacketScratch.writeInt(IterableIntrusiveHashTable.packetRandom.nextInt(), (byte) -79);
        MeshAudioHelpers.accountPacketScratch.writeInt(IterableIntrusiveHashTable.packetRandom.nextInt(), (byte) -79);
        MeshAudioHelpers.accountPacketScratch.writeByte(-104, day);
        MeshAudioHelpers.accountPacketScratch.writeByte(50, monthIndex);
        MeshAudioHelpers.accountPacketScratch.writeShort((byte) 124, year);
        MeshAudioHelpers.accountPacketScratch.applyRsa(Ball.accountRsaExponent, WeightedLruCache.accountRsaModulus, obfuscationGuard + 19672);
        TextFieldValidator.outgoingPackets.writeCipheredOpcode(obfuscationGuard ^ -13316, 18);
        int alternatePayloadStartAfterLength = TextFieldValidator.outgoingPackets.position + 1;
        TextFieldValidator.outgoingPackets.position = TextFieldValidator.outgoingPackets.position + 1;
        alternatePayloadStart = alternatePayloadStartAfterLength;
        TextFieldValidator.outgoingPackets.writeBytes(MeshAudioHelpers.accountPacketScratch.data, -1, 0, MeshAudioHelpers.accountPacketScratch.position);
        TextFieldValidator.outgoingPackets.backfillByteLength((byte) 125, TextFieldValidator.outgoingPackets.position - alternatePayloadStart);
    }

    static {
        field_b = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_d = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_c = "Unable to add name - system busy";
    }
}
