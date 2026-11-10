/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPacketHelpers {
    static int field_a;
    static Font field_b;

    final static void writeLoginPacket(boolean param0, LoginCredentials param1, boolean param2, int param3, int param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        java.awt.Component var8 = null;
        try {
          HighscoresScreen.field_t[0] = SessionSocketHelpers.field_b.nextInt();
          HighscoresScreen.field_t[1] = SessionSocketHelpers.field_b.nextInt();
          HighscoresScreen.field_t[3] = (int)RasterBuffer.field_b;
          RasterBuffer.field_e.position = 0;
          if (param3 != -27886) {
            var8 = (java.awt.Component) null;
            LoginPacketHelpers.attachKeyboardInput((byte) 84, (java.awt.Component) null);
          }
          HighscoresScreen.field_t[2] = (int)(RasterBuffer.field_b >> 32);
          RasterBuffer.field_e.writeInt(-115, HighscoresScreen.field_t[0]);
          RasterBuffer.field_e.writeInt(30, HighscoresScreen.field_t[1]);
          RasterBuffer.field_e.writeInt(85, HighscoresScreen.field_t[2]);
          RasterBuffer.field_e.writeInt(80, HighscoresScreen.field_t[3]);
          PowerupCard.writeMachineId(RasterBuffer.field_e, 10);
          RasterBuffer.field_e.writeShort(param4, (byte) 105);
          param1.writePayload(false, RasterBuffer.field_e);
          LinkTextPainter.field_e.position = 0;
          if (!param2) {
            LinkTextPainter.field_e.writeByte(16, -122);
          } else {
            LinkTextPainter.field_e.writeByte(18, 110);
          }
          LinkTextPainter.field_e.position = LinkTextPainter.field_e.position + 2;
          var5_int = LinkTextPainter.field_e.position;
          LinkTextPainter.field_e.writeInt(-108, MouseInputHandler.field_b);
          LinkTextPainter.field_e.writeLong(ViewportController.field_u, -80);
          var6 = 0;
          if (LoginPanel.field_S) {
            var6 = var6 | 1;
          }
          if (ReflectionQueueHelpers.field_a) {
            var6 = var6 | 4;
          }
          if (param0) {
            var6 = var6 | 8;
          }
          if (MenuFontGlobals.field_b != null) {
            var6 = var6 | 16;
          }
          LinkTextPainter.field_e.writeByte(var6, param3 + 27799);
          var7 = SettingsCookieHelpers.readSettingsCookie(AppletHostHelpers.getHostApplet(0), (byte) 42);
          if (var7 == null) {
            var7 = "";
          }
          LinkTextPainter.field_e.writeTerminatedString(param3 ^ -27758, var7);
          if (MenuFontGlobals.field_b != null) {
            LinkTextPainter.field_e.writeTerminatedStringWithHeader((byte) -88, MenuFontGlobals.field_b);
          }
          NanoTickClock.writeRsaEncryptedBlock(RasterBuffer.field_e, TextFieldValidator.field_c, (byte) -105, LinkTextPainter.field_e, ArchiveRequest.field_p);
          LinkTextPainter.field_e.writeLengthPrefixShort(57, -var5_int + LinkTextPainter.field_e.position);
          CheckboxPainter.flushOutgoingPackets((byte) -46, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("rk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 16) {
          java.awt.Component var2 = (java.awt.Component) null;
          LoginPacketHelpers.attachKeyboardInput((byte) -88, (java.awt.Component) null);
        }
    }

    final static void attachKeyboardInput(byte param0, java.awt.Component param1) {
        try {
          if (param0 >= -13) {
            java.awt.Component var3 = (java.awt.Component) null;
            LoginPacketHelpers.attachKeyboardInput((byte) -12, (java.awt.Component) null);
          }
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(KeyHandlerHolder.field_c);
          param1.addFocusListener(KeyHandlerHolder.field_c);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "rk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 0;
    }
}
