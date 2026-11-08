/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientUiHelpers {
    static int[] field_c;
    static EmailFormatError field_b;
    static String field_g;
    static String[] field_e;
    static String field_f;
    static String field_d;
    static char[] field_a;

    static int bitAnd(int param0, int param1) {
        return param0 & param1;
    }

    final static byte[] readPackedByteArray(int param0, CipherPacketBuffer param1, byte[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (param3 != -13035) {
            field_c = (int[]) null;
          }
          var4_int = param1.readBits(param3 + 12957, param0);
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param2 == null ||
            param2.length != var4_int) {
            param2 = new byte[var4_int];
          }
          var5 = param1.readBits(-119, 3);
          var6 = (byte)param1.readBits(111, 8);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)(param1.readBits(33, var5) + var6);
            }
          }
          stackIn_18_0 = (byte[]) (param2);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ec.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void sendLongCommand(int param0, boolean param1, long param2) {
        CipherPacketBuffer var4 = ClockAndCookieHelpers.field_g;
        var4.writeCipheredOpcode(param0, (byte) -117);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.writeByte((byte) 127, 7);
        var4.writeLong(-28875, param2);
        var4.backpatchByteLength((byte) 105, -var5 + var4.position);
        if (param1) {
          field_c = (int[]) null;
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 24) {
          return;
        }
        field_d = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_c = null;
        field_e = null;
    }

    final static void initializeMenuLabels(int param0) {
        String[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        String stackIn_6_2 = null;
        String[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        String stackIn_9_2 = null;
        String[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_12_2 = null;
        String[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        String[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_18_2 = null;
        String[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_21_2 = null;
        if (null != ImageProducerRasterBuffer.field_A) {
          return;
        }
        ImageProducerRasterBuffer.field_A = new String[48];
        ImageProducerRasterBuffer.field_A[13] = TextAndBitHelpers.field_c;
        ImageProducerRasterBuffer.field_A[3] = CipherPacketBuffer.field_G;
        ImageProducerRasterBuffer.field_A[2] = UsernameCredentials.field_q;
        ImageProducerRasterBuffer.field_A[7] = MusicTrackHelpers.field_a;
        ImageProducerRasterBuffer.field_A[0] = BoundedUrlRequest.field_f;
        ImageProducerRasterBuffer.field_A[8] = null;
        ImageProducerRasterBuffer.field_A[6] = DirectByteStorage.field_g;
        ImageProducerRasterBuffer.field_A[5] = DualNode.field_s;
        ImageProducerRasterBuffer.field_A[9] = IntrusiveNode.field_m;
        ImageProducerRasterBuffer.field_A[1] = ParticleEffect.field_C;
        ImageProducerRasterBuffer.field_A[11] = DisplayMode.field_l;
        ImageProducerRasterBuffer.field_A[4] = IterableDualNodeDeque.field_h;
        stackIn_5_0 = ImageProducerRasterBuffer.field_A;
        stackIn_5_1 = 44;
        if (!ConditionalTextValue.field_h) {
          stackIn_6_2 = LoadingStatusHelpers.field_b;
        } else {
          stackIn_6_2 = SocialStateHelpers.field_a;
        }
        stackIn_5_0[stackIn_5_1] = stackIn_6_2;
        stackIn_8_0 = ImageProducerRasterBuffer.field_A;
        stackIn_8_1 = 43;
        if (AlphaContainer.field_G) {
          stackIn_9_2 = SessionUiHelpers.field_f;
        } else {
          stackIn_9_2 = PasswordRuleHelpers.field_i;
        }
        stackIn_8_0[stackIn_8_1] = stackIn_9_2;
        ImageProducerRasterBuffer.field_A[param0] = AccountNoticeDialog.field_pb;
        ImageProducerRasterBuffer.field_A[14] = SentinelAnimationEditor.field_d[0];
        ImageProducerRasterBuffer.field_A[23] = StatSubmission.field_v;
        stackIn_11_0 = ImageProducerRasterBuffer.field_A;
        stackIn_11_1 = 41;
        if (!CachedTextLayout.field_p) {
          stackIn_12_2 = QuickChatParameterType.field_h;
        } else {
          stackIn_12_2 = FrameStyleHelpers.field_b;
        }
        stackIn_11_0[stackIn_11_1] = stackIn_12_2;
        ImageProducerRasterBuffer.field_A[21] = PasswordFieldPainter.field_y;
        ImageProducerRasterBuffer.field_A[46] = AccountNoticeDialog.field_jb;
        ImageProducerRasterBuffer.field_A[24] = BoundedRandomAccessFile.field_h;
        ImageProducerRasterBuffer.field_A[27] = IterableNodeHashTable.field_g;
        ImageProducerRasterBuffer.field_A[16] = SentinelAnimationEditor.field_d[2];
        ImageProducerRasterBuffer.field_A[18] = MouseInputHandler.field_b[1];
        ImageProducerRasterBuffer.field_A[17] = MouseInputHandler.field_b[0];
        ImageProducerRasterBuffer.field_A[32] = LoginForm.field_P;
        ImageProducerRasterBuffer.field_A[29] = NodeIterator.field_j;
        ImageProducerRasterBuffer.field_A[31] = QuickChatMenu.field_Tb;
        ImageProducerRasterBuffer.field_A[38] = "";
        ImageProducerRasterBuffer.field_A[33] = ChatMessage.field_u;
        ImageProducerRasterBuffer.field_A[20] = CipherPacketBuffer.field_y;
        ImageProducerRasterBuffer.field_A[26] = MembershipPromotionScreen.field_b;
        ImageProducerRasterBuffer.field_A[19] = NodeDeque.field_a;
        stackIn_14_0 = ImageProducerRasterBuffer.field_A;
        stackIn_14_1 = 47;
        if (HighscoreSubmissionFactory.field_a) {
          stackIn_15_2 = SentinelAnimationEditor.field_u;
        } else {
          stackIn_15_2 = RasterBuffer.field_d;
        }
        stackIn_14_0[stackIn_14_1] = stackIn_15_2;
        ImageProducerRasterBuffer.field_A[15] = SentinelAnimationEditor.field_d[1];
        ImageProducerRasterBuffer.field_A[22] = QuickChatMenu.field_ec;
        stackIn_17_0 = ImageProducerRasterBuffer.field_A;
        stackIn_17_1 = 42;
        if (NameCheckResult.field_c) {
          stackIn_18_2 = DisplayNameAndAudioHelpers.field_c;
        } else {
          stackIn_18_2 = ClientException.field_j;
        }
        stackIn_17_0[stackIn_17_1] = stackIn_18_2;
        ImageProducerRasterBuffer.field_A[45] = ChatHistoryAllocator.field_e;
        ImageProducerRasterBuffer.field_A[30] = SessionSeedHelpers.field_e;
        stackIn_20_0 = ImageProducerRasterBuffer.field_A;
        stackIn_20_1 = 37;
        if (ModalStack.field_V) {
          stackIn_21_2 = DirectByteStorage.field_i;
        } else {
          stackIn_21_2 = RegistrationRequestDialog.field_Vb;
        }
        stackIn_20_0[stackIn_20_1] = stackIn_21_2;
        ImageProducerRasterBuffer.field_A[34] = Sprite.field_e;
        ImageProducerRasterBuffer.field_A[28] = LabeledField.field_cb;
        ImageProducerRasterBuffer.field_A[25] = RequestResendHelpers.field_a;
        ImageProducerRasterBuffer.field_A[40] = TriangleMesh.field_R;
        ImageProducerRasterBuffer.field_A[39] = QuickChatMenu.field_nc;
        GameKeyHandler.field_a = SocketConnector.formatTemplate(GameKeyHandler.field_a, param0 ^ -25, new String[]{NameValidationHelpers.replaceAllOccurrences("<img=26>", (byte) 11, "<img=17>", RasterBuffer.field_d)});
        ValidatedTextWidget.field_yb = SocketConnector.formatTemplate(ValidatedTextWidget.field_yb, param0 ^ -56, new String[]{NameValidationHelpers.replaceAllOccurrences("<img=26>", (byte) 11, "<img=17>", SentinelAnimationEditor.field_u)});
    }

    final static void drawPopupMenu(byte param0) {
        int var1 = SpriteLoadingHelpers.getMessageMenuWidth((byte) -78);
        if (param0 >= -60) {
          field_d = (String) null;
        }
        int var2 = TickClock.getPopupHeight(0);
        NanoTickClock.field_l.drawFrame((ChecksumAndFrameHelpers.field_c << 1) + var1, -15203, -ChecksumAndFrameHelpers.field_c + PendingIntArrayRequest.field_q, var2 + (LoginResultHelpers.field_b << 1), -LoginResultHelpers.field_b + ValidationIndicator.field_W);
        PopupMenuHelpers.drawPopupMenuLines(118);
    }

    final static RgbSprite[] loadRgbSpritesByName(byte param0, String param1, ResourceArchive param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        RgbSprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -27) {
            var6 = (String) null;
            ClientUiHelpers.loadRgbSpritesByName((byte) -7, (String) null, (ResourceArchive) null, (String) null);
          }
          var4_int = param2.getGroupId(param3, 27);
          var5 = param2.getFileId(var4_int, -32759, param1);
          stackIn_3_0 = KeyRoutingHelpers.loadRgbSprites(var5, param2, var4_int, (byte) 48);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ec.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_g = "Unfortunately you are not eligible to create an account.";
        field_c = new int[]{11, 14, -1, 6, -1, 3, -1, 6, -1, 6};
        field_e = new String[3];
        field_b = new EmailFormatError();
        field_f = "End mission";
        field_d = "Try again";
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
