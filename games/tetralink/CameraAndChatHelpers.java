/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CameraAndChatHelpers {
    static UiComponent field_b;
    static String field_a;
    static byte[] field_e;
    static UiComponent field_c;
    static String field_d;

    final static int clampPopupX(int param0, byte param1, int param2, int param3) {
        if (!(SoftwareRasterizer.field_f < param2 + param0)) {
          return param2;
        }
        if (0 <= -param0 + (param3 + param2)) {
          return -param0 + (param3 + param2);
        }
        if (param1 > 88) {
          return SoftwareRasterizer.field_f - param0;
        }
        CameraAndChatHelpers.releaseStatics((byte) -127);
        return SoftwareRasterizer.field_f - param0;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 < -100) {
          field_d = null;
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        CameraAndChatHelpers.writeChatMessagePacket(89, 53, 44, (String) null, 60, (String) null);
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
    }

    final static void updateCameraMatrix(int param0) {
        LongAndTextCredentials.field_h = CameraProjectionMath.createLookAtCamera(LobbyResourceHelpers.field_g, new double[]{0.0, 0.0, 0.0}, new double[]{0.0, 1.0, 0.0});
        RasterTargetHelpers.field_b = CameraProjectionMath.toFixedCamera(LongAndTextCredentials.field_h);
        if (param0 >= -14) {
          field_a = (String) null;
        }
    }

    final static void writeChatMessagePacket(int param0, int param1, int param2, String param3, int param4, String param5) {
        BitPacketBuffer var8 = null;
        int var7 = 0;
        try {
          var8 = QuickChatHelpDialog.field_Lb;
          BitPacketBuffer var6 = var8;
          var8.writeCipheredByte(param2, (byte) -92);
          var8.position = var8.position + 1;
          var7 = var8.position;
          var8.writeByte(param4, false);
          if (param0 == ~param4) {
            var8.writeString(param3, 0);
          }
          if (param5 == null) {
            var8.writeShort(param1, false);
          } else {
            DateInputWidget.writeCompressedString(false, param5, var8);
          }
          var8.backpatchByteLength(var8.position - var7, -2);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "eo.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "To play a multiplayer game, please log in or create a free account.";
        field_d = "<%0> cannot join; the game is full.";
    }
}
