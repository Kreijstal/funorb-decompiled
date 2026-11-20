/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerRecordWritePackets {
    static boolean field_a;

    final static void sendIntegerRecordWrite(int param0, int param1, IntegerRecordWriteRequest param2) {
        IsaacPacketBuffer var5 = null;
        int var4 = 0;
        try {
          var5 = RequestNewestBlackboxRecording.field_p;
          var5.writeIsaacByte(24335, param0);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(0, 1);
          var5.writeByte(0, param2.recordType);
          var5.writeSignedSmart(param2.recordId, 120);
          var5.writeInt(param2.field_h, param1 ^ -332603336);
          var5.writeInt(param2.field_d, param1 ^ -332603336);
          var5.writeInt(param2.field_e, 332614536);
          var5.writeInt(param2.field_i, 332614536);
          var5.writeCrc(param1 ^ -21109, var4);
          if (param1 != -21584) {
            IntegerRecordWritePackets.selectLoadingMessageLanguage(47, -32);
          }
          var5.writeLengthByte(var5.position - var4, -129);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aeb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void selectLoadingMessageLanguage(int param0, int param1) {
        if (param1 == 1) {
          GetSpinningBladeTopSpeed.connectingToUpdateServerText = GrayscaleTextureOperation.connectingMessages[param0];
          PasswordValidator.waitingForTextMessage = GpuFaceAttachmentState.waitingForTextMessages[param0];
          WorldSpriteTiler.loadingTextMessage = SpawnChoice.loadingTextMessages[param0];
          return;
        }
        field_a = false;
        GetSpinningBladeTopSpeed.connectingToUpdateServerText = GrayscaleTextureOperation.connectingMessages[param0];
        PasswordValidator.waitingForTextMessage = GpuFaceAttachmentState.waitingForTextMessages[param0];
        WorldSpriteTiler.loadingTextMessage = SpawnChoice.loadingTextMessages[param0];
    }

    static {
    }
}
