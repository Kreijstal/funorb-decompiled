/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPacket extends IntrusiveNode {
    byte[] field_m;
    static IntrusiveDeque field_i;
    int field_j;
    static String field_n;
    long field_h;
    static int field_k;
    static InputValidationResult field_l;
    static Sprite[] field_o;

    public static void releaseStatics(byte param0) {
        if (param0 != -44) {
          DelayedPacket.pollLoginDialogs(-106, 54, false, -127);
        }
        field_o = null;
        field_i = null;
        field_n = null;
        field_l = null;
    }

    DelayedPacket(long param0, int param1, byte[] param2) {
        try {
          this.field_h = param0;
          this.field_m = param2;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "bg.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int pollLoginDialogs(int param0, int param1, boolean param2, int param3) {
        int var4 = -43 % ((-39 - param0) / 61);
        return StatefulWidgetRenderer.pollAccountUiAction((byte) -123);
    }

    final static boolean isDisplayModeChangePending(int param0) {
        if (param0 != 2) {
          field_k = -82;
        }
        return ~PendingRecordRequest.field_x != ~PendingRecordRequest.field_p ? true : false;
    }

    final static int pollAccountServerRequest(int param0, int param1, LoginNameValue param2, String param3, LoginNameValue param4, int param5, boolean param6) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        PacketBuffer stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_21_2 = null;
        PacketBuffer stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        String stackIn_24_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = ZombieDawn.field_J;
        try {
          var14 = param2.getName(-1);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param4.getName(param0 ^ -106);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (param0 != 105) {
            stackIn_3_0 = 44;
            return stackIn_3_0;
          }
          if (LoginMethod.field_c == null &&
            !FullscreenErrorDialog.pollGameSocketConnection(false, true)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (AudioMixerHelpers.field_g == ValidatedTextWidget.field_T) {
            LinkTextPainter.field_e.position = 0;
            Bzip2State.field_g = null;
            if (param3 == null) {
              RasterBuffer.field_e.position = 0;
              RasterBuffer.field_e.writeInt(-127, SessionSocketHelpers.field_b.nextInt());
              RasterBuffer.field_e.writeInt(-119, SessionSocketHelpers.field_b.nextInt());
              stackIn_20_0 = RasterBuffer.field_e;
              stackIn_20_1 = -88;
              if (!param2.isEmail(32)) {
                stackIn_21_2 = "";
              } else {
                stackIn_21_2 = var14;
              }
              ((PacketBuffer) (Object) stackIn_20_0).writeTerminatedStringWithHeader((byte) stackIn_20_1, stackIn_21_2);
              stackIn_23_0 = RasterBuffer.field_e;
              stackIn_23_1 = -88;
              if (!param4.isEmail(param0 ^ 73)) {
                stackIn_24_2 = "";
              } else {
                stackIn_24_2 = var8;
              }
              ((PacketBuffer) (Object) stackIn_23_0).writeTerminatedStringWithHeader((byte) stackIn_23_1, stackIn_24_2);
              LinkTextPainter.field_e.writeByte(16, 64);
              LinkTextPainter.field_e.position = LinkTextPainter.field_e.position + 1;
              var9 = LinkTextPainter.field_e.position;
              NanoTickClock.writeRsaEncryptedBlock(RasterBuffer.field_e, TextFieldValidator.field_c, (byte) 108, LinkTextPainter.field_e, ArchiveRequest.field_p);
              LinkTextPainter.field_e.writeLengthPrefixByte(param0 - 211, -var9 + LinkTextPainter.field_e.position);
            } else {
              var9 = 0;
              RasterBuffer.field_e.position = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              RasterBuffer.field_e.writeInt(23, SessionSocketHelpers.field_b.nextInt());
              RasterBuffer.field_e.writeInt(-117, SessionSocketHelpers.field_b.nextInt());
              RasterBuffer.field_e.writeTerminatedStringWithHeader((byte) -88, var14);
              RasterBuffer.field_e.writeTerminatedStringWithHeader((byte) -88, var8);
              var15 = (CharSequence) ((Object) param3);
              RasterBuffer.field_e.writeTerminatedStringWithHeader((byte) -88, AbstractSprite.normalizeAsciiIdentifier(-122, var15));
              RasterBuffer.field_e.writeShort(param5, (byte) 105);
              RasterBuffer.field_e.writeByte(param1, 53);
              RasterBuffer.field_e.writeByte(var9, 66);
              LinkTextPainter.field_e.writeByte(18, 125);
              LinkTextPainter.field_e.position = LinkTextPainter.field_e.position + 2;
              var10 = LinkTextPainter.field_e.position;
              var11_ref_StringLifetime4 = SettingsCookieHelpers.readSettingsCookie(AppletHostHelpers.getHostApplet(0), (byte) -128);
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              LinkTextPainter.field_e.writeTerminatedString(param0 + 23, var11_ref_StringLifetime4);
              NanoTickClock.writeRsaEncryptedBlock(RasterBuffer.field_e, TextFieldValidator.field_c, (byte) -109, LinkTextPainter.field_e, ArchiveRequest.field_p);
              LinkTextPainter.field_e.writeLengthPrefixShort(57, -var10 + LinkTextPainter.field_e.position);
            }
            CheckboxPainter.flushOutgoingPackets((byte) -46, -1);
            ValidatedTextWidget.field_T = TextLayoutLine.field_a;
          }
          if (TextLayoutLine.field_a == ValidatedTextWidget.field_T &&
            Blast.fillIncomingBuffer((byte) -125, 1)) {
            var9Lifetime1 = MatchingTextValidator.field_g.readUnsignedByte((byte) -119);
            MatchingTextValidator.field_g.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ValidatedTextWidget.field_T = NetworkArchiveRequest.field_B;
              TileOccupancyHelpers.field_a = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                HighscoreRequest.setTuhstatbutCookie((byte) 34, AppletHostHelpers.getHostApplet(0));
                MasterIndexHelpers.field_d = Camera.field_z;
                SessionSocketHelpers.closeSessionSocket(param0 - 104);
                IntRecordReplyHelpers.field_d = false;
                stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (99 != var9Lifetime1) {
                ValidatedTextWidget.field_T = StatefulWidgetRenderer.field_w;
                MeshDepthBuckets.field_b = -1;
                TextAndNameCredentials.field_d = var9Lifetime1;
              } else {
                Blast.fillIncomingBuffer((byte) -103, SavedDataRequest.getFlagReplyLength(false));
                Bzip2State.field_g = new Boolean(PowerupBar.readBooleanByte((byte) -36, MatchingTextValidator.field_g));
                MatchingTextValidator.field_g.position = 0;
              }
            }
          }
          if (NetworkArchiveRequest.field_B == ValidatedTextWidget.field_T) {
            var9Lifetime2 = 2;
            if (Blast.fillIncomingBuffer((byte) -128, var9Lifetime2)) {
              var10Lifetime1 = MatchingTextValidator.field_g.readUnsignedShort(param0 ^ 107);
              MatchingTextValidator.field_g.position = 0;
              if (Blast.fillIncomingBuffer((byte) -100, var10Lifetime1)) {
                var11 = TileOccupancyHelpers.field_a.length;
                for (var12 = 0; var12 < var11; var12++) {
                  TileOccupancyHelpers.field_a[var12] = MatchingTextValidator.field_g.readString(19988);
                }
                SessionSocketHelpers.closeSessionSocket(1);
                IntRecordReplyHelpers.field_d = false;
                stackIn_49_0 = 100 + var11;
                return stackIn_49_0;
              }
            }
          }
          if (StatefulWidgetRenderer.field_w == ValidatedTextWidget.field_T &&
            PendingHighscoreRequest.isPacketPayloadReady(-2887)) {
            if (TextAndNameCredentials.field_d != 255) {
              MasterIndexHelpers.field_d = MatchingTextValidator.field_g.readNullTerminatedString(true);
            } else {
              var9_ref_String = MatchingTextValidator.field_g.readOptionalString(-1);
              if (var9_ref_String != null) {
                SocketConnector.writeSettingsCookie(165, AppletHostHelpers.getHostApplet(0), var9_ref_String);
              }
            }
            SessionSocketHelpers.closeSessionSocket(1);
            IntRecordReplyHelpers.field_d = false;
            stackIn_57_0 = TextAndNameCredentials.field_d;
            return stackIn_57_0;
          }
          if (null == LoginMethod.field_c) {
            if (IntRecordReplyHelpers.field_d) {
              if (30000L >= TriangleMesh.getMillisSinceLastReceive(-127)) {
                MasterIndexHelpers.field_d = GrowableIntList.field_a;
              } else {
                MasterIndexHelpers.field_d = NodeHashTable.field_b;
              }
              IntRecordReplyHelpers.field_d = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = GzipDecompressor.field_c;
            GzipDecompressor.field_c = DisplayState.field_j;
            IntRecordReplyHelpers.field_d = true;
            DisplayState.field_j = var9Lifetime3;
          }
          stackIn_67_0 = -1;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("bg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_n = "Quit";
        field_i = new IntrusiveDeque();
        field_k = 2;
        field_l = new InputValidationResult();
    }
}
