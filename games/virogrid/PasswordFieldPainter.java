/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordFieldPainter extends TextFieldPainter {
    static int field_y;
    static int[] field_F;
    static int[] field_C;
    static int[] field_J;
    static LogoAndLoginHelpers field_H;
    static int[] field_B;
    static int[] field_G;
    static boolean field_D;
    static String field_A;
    static int[] field_E;
    static String field_z;

    PasswordFieldPainter(int param0) {
        this(PlayerContextMenu.arezzo14Font, param0);
    }

    final static void initializeMenuLabels(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (LoginDialog.field_pb != null) {
            return;
          }
          TypeCode.field_e = new String[12];
          TypeCode.field_e[2] = PasswordValidator.field_p;
          TypeCode.field_e[3] = DialWidgetPainter.field_j;
          TypeCode.field_e[1] = DialWidgetPainter.field_j;
          TypeCode.field_e[7] = LobbyGameListHelpers.field_d;
          TypeCode.field_e[11] = LogoRenderHelpers.hotseatmenulabel;
          TypeCode.field_e[5] = DialWidgetPainter.field_j;
          TypeCode.field_e[8] = GameBoard.field_F;
          TypeCode.field_e[6] = NodeHashTableIterator.field_a;
          if (param0 != 69) {
            field_E = (int[]) null;
          }
          TypeCode.field_e[9] = VerticalScrollbar.textError;
          LoginDialog.field_pb = new String[29];
          TypeCode.field_e[4] = DialWidgetPainter.field_j;
          TypeCode.field_e[0] = StrongCacheReference.textGamename;
          LoginDialog.field_pb[14] = LoadingTextGlobals.field_c;
          LoginDialog.field_pb[13] = LobbyLayout.field_d;
          LoginDialog.field_pb[15] = ChatFilterHelpers.field_d;
          LoginDialog.field_pb[4] = NodeHashTableIterator.field_a;
          LoginDialog.field_pb[0] = LogoRenderHelpers.hotseatmenulabel;
          LoginDialog.field_pb[16] = ClientEnvironmentHelpers.field_b;
          LoginDialog.field_pb[6] = WidgetFactoryHelpers.textFullscreenToggle;
          LoginDialog.field_pb[9] = AsyncCheckResult.field_h;
          LoginDialog.field_pb[11] = QuickChatPhraseDefinition.field_s;
          LoginDialog.field_pb[19] = IconTextComponent.field_Gb;
          LoginDialog.field_pb[2] = ChatMessage.field_f;
          LoginDialog.field_pb[3] = GameBoard.field_F;
          LoginDialog.field_pb[10] = CommonUiHelpers.field_a;
          LoginDialog.field_pb[12] = NanoTickClock.field_i;
          LoginDialog.field_pb[8] = ContextMenuHelpers.textBack;
          LoginDialog.field_pb[7] = MouseHandlerSupport.field_d;
          LoginDialog.field_pb[18] = CipherPacketBuffer.textPlayAgain;
          LoginDialog.field_pb[17] = ChatPanelUpdateHelpers.textDetail;
          LoginDialog.field_pb[1] = Js5ArchiveManager.field_g;
          LoginDialog.field_pb[5] = LobbyGameListHelpers.field_d;
          LoginDialog.field_pb[23] = RenderTargetHelpers.textOptions;
          LoginDialog.field_pb[28] = RankingsRequest.field_v + ": ";
          LoginDialog.field_pb[27] = SocialListEntry.hotseatoptionAilevelColon;
          LoginDialog.field_pb[22] = MidiNote.field_z;
          LoginDialog.field_pb[21] = LoadingProgressHelpers.textRankingsBywinpercentage;
          LoginDialog.field_pb[25] = LobbySortHelpers.hotseatoptionGridwidthColon;
          LoginDialog.field_pb[20] = BoundedUrlRequest.field_t[0];
          LoginDialog.field_pb[24] = ProxyAuthenticationRequiredException.field_c;
          LoginDialog.field_pb[26] = RasterEffectHelpers.hotseatoptionTurndurationColon;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "a.S(" + param0 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_J = null;
        field_C = null;
        field_z = null;
        field_F = null;
        field_E = null;
        field_G = null;
        field_H = null;
        if (param0) {
          return;
        }
        try {
          field_A = null;
          field_B = null;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "a.M(" + param0 + ')');
        }
    }

    private PasswordFieldPainter(BitmapFont param0, int param1) {
        super(param0, param1);
    }

    final String getDisplayText(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 218479361) {
            PasswordFieldPainter.clearFaceGroupCounts(117);
          }
          stackIn_4_0 = DualLinkDequeIterator.repeatChar('*', param0.field_n.length(), (byte) -99);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("a.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static BinaryBitmapFont loadFontByName(String param0, Js5Archive param1, int param2, String param3, Js5Archive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        BinaryBitmapFont stackIn_2_0 = null;
        BinaryBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -52) {
            stackIn_2_0 = (BinaryBitmapFont) null;
            return stackIn_2_0;
          }
          var5_int = param1.findGroupId(-1, param0);
          var6 = param1.getFileId(-127, var5_int, param3);
          stackIn_4_0 = TooltipAndOptionsHelpers.loadFont(var5_int, var6, param1, false, param4);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("a.Q(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void handleLoginResult(String param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          NameEntryPopup.field_Fb = param2;
          LoginMethod.field_d = false;
          if (ThreeSliceButtonPainter.field_w != null &&
            ThreeSliceButtonPainter.field_w.field_G) {
            if (8 == param1) {
              param1 = 2;
              if (ChatPanelSetupHelpers.field_c) {
                param0 = DecodedSpriteHelpers.field_c;
                if (Virogrid.field_F) {
                  param0 = DualLinkNode.field_g;
                }
              } else {
                param0 = DualLinkNode.field_g;
              }
              QuickChatHelpHelpers.field_a.setAccountAndClearPassword(-113, MouseTrailPoint.field_g);
            }
            var3_int = 1;
            if (10 == param1) {
              var3_int = 0;
              AccountCreationForm.showDisplayNameForm((byte) 98);
            }
            if (var3_int != 0) {
              if (LoginMethod.field_d) {
                param0 = MenuScreen.formatIndexedText(new String[]{param0}, RasterEffectHelpers.field_h, 2);
              }
              if (IntrusiveDeque.field_f) {
                param0 = BitwiseHelpers.field_a;
              }
              ThreeSliceButtonPainter.field_w.showResult(param1, true, param0);
            }
            if (param1 != 256 &&
              param1 != 10 &&
              !ChatPanelSetupHelpers.field_c) {
              QuickChatHelpHelpers.field_a.clearInputs((byte) -125);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("a.N(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void clearFaceGroupCounts(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 12) {
            PasswordFieldPainter.clearFaceGroupCounts(19);
          }
          var1 = QueuedResultSubmission.field_g;
          var2 = 0;
          var3 = var1.length;
          while (var2 < var3) {
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1_ref), "a.O(" + param0 + ')');
        }
    }

    final static void loadLocalizedText(int param0, Js5Archive param1) {
        RuntimeException stackIn_376_0 = null;
        StringBuilder stackIn_376_1 = null;
        String stackIn_377_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        byte[] var2Lifetime103;
        try {
          DialWidgetPainter.field_m = param1;
          var2 = AccountChoicePanel.readTextResourceBytes("waitingfor_patches", true);
          if (null != var2) {
            MidiPcmStream.decodeText(-2022, var2);
          }
          var2Lifetime1 = AccountChoicePanel.readTextResourceBytes("loading_patches", true);
          if (var2Lifetime1 != null) {
            MidiPcmStream.decodeText(param0 ^ -2034, var2Lifetime1);
          }
          var2Lifetime2 = AccountChoicePanel.readTextResourceBytes("TEXT_GAMENAME", true);
          if (null != var2Lifetime2) {
            StrongCacheReference.textGamename = MidiPcmStream.decodeText(-2022, var2Lifetime2);
          }
          var2Lifetime3 = AccountChoicePanel.readTextResourceBytes("TEXT_CREATE_ACCOUNT1", true);
          if (var2Lifetime3 != null) {
            SpriteLoadHelpers.textCreateAccount1 = MidiPcmStream.decodeText(-2022, var2Lifetime3);
          }
          var2Lifetime4 = AccountChoicePanel.readTextResourceBytes("TEXT_CREATE_ACCOUNT2", true);
          if (var2Lifetime4 != null) {
            DecodedSpriteHelpers.textCreateAccount2 = MidiPcmStream.decodeText(-2022, var2Lifetime4);
          }
          var2Lifetime5 = AccountChoicePanel.readTextResourceBytes("TEXT_FULLSCREEN_TOGGLE", true);
          if (null != var2Lifetime5) {
            WidgetFactoryHelpers.textFullscreenToggle = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime5);
          }
          var2Lifetime6 = AccountChoicePanel.readTextResourceBytes("TEXT_MODE", true);
          if (var2Lifetime6 != null) {
            MidiPcmStream.decodeText(param0 - 2042, var2Lifetime6);
          }
          var2Lifetime7 = AccountChoicePanel.readTextResourceBytes("TEXT_DETAIL", true);
          if (null != var2Lifetime7) {
            ChatPanelUpdateHelpers.textDetail = MidiPcmStream.decodeText(-2022, var2Lifetime7);
          }
          var2Lifetime8 = AccountChoicePanel.readTextResourceBytes("TEXT_OPTIONS", true);
          if (var2Lifetime8 != null) {
            RenderTargetHelpers.textOptions = MidiPcmStream.decodeText(-2022, var2Lifetime8);
          }
          var2Lifetime9 = AccountChoicePanel.readTextResourceBytes("TEXT_RANKINGS_BYWINPERCENTAGE", true);
          if (null != var2Lifetime9) {
            LoadingProgressHelpers.textRankingsBywinpercentage = MidiPcmStream.decodeText(-2022, var2Lifetime9);
          }
          var2Lifetime10 = AccountChoicePanel.readTextResourceBytes("TEXT_YOURCOLOUR", true);
          if (null != var2Lifetime10) {
            TriangleSortHelpers.textYourcolour = MidiPcmStream.decodeText(-2022, var2Lifetime10);
          }
          var2Lifetime11 = AccountChoicePanel.readTextResourceBytes("TEXT_OPPONENT", true);
          if (var2Lifetime11 != null) {
            SpriteLoadHelpers.textOpponent = MidiPcmStream.decodeText(-2022, var2Lifetime11);
          }
          var2Lifetime12 = AccountChoicePanel.readTextResourceBytes("TEXT_PLAYERS", true);
          if (var2Lifetime12 != null) {
            AudioPumpThread.textPlayers = MidiPcmStream.decodeText(param0 ^ -2034, var2Lifetime12);
          }
          var2Lifetime13 = AccountChoicePanel.readTextResourceBytes("TEXT_YOUR_TURN_PLAYING", true);
          if (var2Lifetime13 != null) {
            ArrayWidgetContainer.textYourTurnPlaying = MidiPcmStream.decodeText(-2022, var2Lifetime13);
          }
          var2Lifetime14 = AccountChoicePanel.readTextResourceBytes("TEXT_X_TURN_PLAYING", true);
          if (null != var2Lifetime14) {
            TextLayout.textXTurnPlaying = MidiPcmStream.decodeText(-2022, var2Lifetime14);
          }
          var2Lifetime15 = AccountChoicePanel.readTextResourceBytes("TEXT_X_TURN", true);
          if (null != var2Lifetime15) {
            ClockAndTextHelpers.textXTurn = MidiPcmStream.decodeText(-2022, var2Lifetime15);
          }
          var2Lifetime16 = AccountChoicePanel.readTextResourceBytes("TEXT_COLOUR_WHITE", true);
          if (null != var2Lifetime16) {
            TextHotspot.textColourWhite = MidiPcmStream.decodeText(-2022, var2Lifetime16);
          }
          var2Lifetime17 = AccountChoicePanel.readTextResourceBytes("TEXT_COLOUR_BLUE", true);
          if (null != var2Lifetime17) {
            GameApplet.textColourBlue = MidiPcmStream.decodeText(-2022, var2Lifetime17);
          }
          var2Lifetime18 = AccountChoicePanel.readTextResourceBytes("TEXT_DRAWN", true);
          if (var2Lifetime18 != null) {
            MidiPcmStream.decodeText(-2022, var2Lifetime18);
          }
          var2Lifetime19 = AccountChoicePanel.readTextResourceBytes("TEXT_WINS", true);
          if (var2Lifetime19 != null) {
            MidiPcmStream.decodeText(-2022, var2Lifetime19);
          }
          var2Lifetime20 = AccountChoicePanel.readTextResourceBytes("TEXT_2D", true);
          if (var2Lifetime20 != null) {
            ChatFilterHelpers.text2d = MidiPcmStream.decodeText(param0 ^ -2034, var2Lifetime20);
          }
          var2Lifetime21 = AccountChoicePanel.readTextResourceBytes("TEXT_3D", true);
          if (null != var2Lifetime21) {
            GameKeyHandler.text3d = MidiPcmStream.decodeText(-2022, var2Lifetime21);
          }
          var2Lifetime22 = AccountChoicePanel.readTextResourceBytes("TEXT_SWITCH_2D", true);
          if (var2Lifetime22 != null) {
            WeightedLruCache.textSwitch2d = MidiPcmStream.decodeText(-2022, var2Lifetime22);
          }
          var2Lifetime23 = AccountChoicePanel.readTextResourceBytes("TEXT_SWITCH_3D", true);
          if (null != var2Lifetime23) {
            RequestResendSupport.textSwitch3d = MidiPcmStream.decodeText(-2022, var2Lifetime23);
          }
          var2Lifetime24 = AccountChoicePanel.readTextResourceBytes("TEXT_BACK", true);
          if (null != var2Lifetime24) {
            ContextMenuHelpers.textBack = MidiPcmStream.decodeText(-2022, var2Lifetime24);
          }
          var2Lifetime25 = AccountChoicePanel.readTextResourceBytes("TEXT_NOT_AVAILABLE_IN_2D", true);
          if (null != var2Lifetime25) {
            LobbySessionHelpers.textNotAvailableIn2d = MidiPcmStream.decodeText(-2022, var2Lifetime25);
          }
          var2Lifetime26 = AccountChoicePanel.readTextResourceBytes("TEXT_RESET_VIEW", true);
          if (var2Lifetime26 != null) {
            MidiPcmStream.decodeText(-2022, var2Lifetime26);
          }
          var2Lifetime27 = AccountChoicePanel.readTextResourceBytes("TEXT_ERROR", true);
          if (null != var2Lifetime27) {
            VerticalScrollbar.textError = MidiPcmStream.decodeText(-2022, var2Lifetime27);
          }
          if (param0 != 20) {
            field_E = (int[]) null;
          }
          var2Lifetime28 = AccountChoicePanel.readTextResourceBytes("TEXT_PLAY_AGAIN", true);
          if (var2Lifetime28 != null) {
            CipherPacketBuffer.textPlayAgain = MidiPcmStream.decodeText(-2022, var2Lifetime28);
          }
          var2Lifetime29 = AccountChoicePanel.readTextResourceBytes("TEXT_RATED_ACHIEVEMENTS", true);
          if (var2Lifetime29 != null) {
            StripedProgressBar.textRatedAchievements = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime29);
          }
          var2Lifetime30 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_ENTRAPMENT", true);
          if (var2Lifetime30 != null) {
            GuestPlayHelpers.textEndgameEntrapment = MidiPcmStream.decodeText(-2022, var2Lifetime30);
          }
          var2Lifetime31 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_ENTRAPMENT_YOU", true);
          if (var2Lifetime31 != null) {
            LoadingProgressDialog.textEndgameEntrapmentYou = MidiPcmStream.decodeText(-2022, var2Lifetime31);
          }
          var2Lifetime32 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_BOARDFILLED", true);
          if (null != var2Lifetime32) {
            MusicPatch.textEndgameBoardfilled = MidiPcmStream.decodeText(-2022, var2Lifetime32);
          }
          var2Lifetime33 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_BOARDFILLED_YOU", true);
          if (null != var2Lifetime33) {
            CameraAndLogoHelpers.textEndgameBoardfilledYou = MidiPcmStream.decodeText(-2022, var2Lifetime33);
          }
          var2Lifetime34 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_BOARDFILLED_DRAW", true);
          if (var2Lifetime34 != null) {
            EmailDomainValidationHelpers.textEndgameBoardfilledDraw = MidiPcmStream.decodeText(-2022, var2Lifetime34);
          }
          var2Lifetime35 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_NOPIECES", true);
          if (var2Lifetime35 != null) {
            OverlayDrawHelpers.textEndgameNopieces = MidiPcmStream.decodeText(-2022, var2Lifetime35);
          }
          var2Lifetime36 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_NOPIECES_YOU", true);
          if (var2Lifetime36 != null) {
            UiTheme.textEndgameNopiecesYou = MidiPcmStream.decodeText(-2022, var2Lifetime36);
          }
          var2Lifetime37 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_NOTIME", true);
          if (null != var2Lifetime37) {
            DecodedSpriteHelpers.textEndgameNotime = MidiPcmStream.decodeText(param0 ^ -2034, var2Lifetime37);
          }
          var2Lifetime38 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_NOTIME_YOU", true);
          if (null != var2Lifetime38) {
            ScrollPaneWithFooter.textEndgameNotimeYou = MidiPcmStream.decodeText(-2022, var2Lifetime38);
          }
          var2Lifetime39 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_RESIGNED", true);
          if (var2Lifetime39 != null) {
            SoundPlaybackHelpers.textEndgameResigned = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime39);
          }
          var2Lifetime40 = AccountChoicePanel.readTextResourceBytes("TEXT_ENDGAME_RESIGNED_YOU", true);
          if (null != var2Lifetime40) {
            LobbySortHelpers.textEndgameResignedYou = MidiPcmStream.decodeText(param0 ^ -2034, var2Lifetime40);
          }
          var2Lifetime41 = AccountChoicePanel.readTextResourceBytes("TEXT_VIEWCONTROLS_LEFT", true);
          if (var2Lifetime41 != null) {
            PopupInputHelpers.textViewcontrolsLeft = MidiPcmStream.decodeText(-2022, var2Lifetime41);
          }
          var2Lifetime42 = AccountChoicePanel.readTextResourceBytes("TEXT_VIEWCONTROLS_RIGHT", true);
          if (var2Lifetime42 != null) {
            SocketJs5Transport.textViewcontrolsRight = MidiPcmStream.decodeText(-2022, var2Lifetime42);
          }
          var2Lifetime43 = AccountChoicePanel.readTextResourceBytes("TEXT_VIEWCONTROLS_ZOOMOUT", true);
          if (null != var2Lifetime43) {
            TextMetricsGlobals.textViewcontrolsZoomout = MidiPcmStream.decodeText(param0 ^ -2034, var2Lifetime43);
          }
          var2Lifetime44 = AccountChoicePanel.readTextResourceBytes("TEXT_VIEWCONTROLS_ZOOMIN", true);
          if (null != var2Lifetime44) {
            MouseWheelInput.textViewcontrolsZoomin = MidiPcmStream.decodeText(param0 ^ -2034, var2Lifetime44);
          }
          var2Lifetime45 = AccountChoicePanel.readTextResourceBytes("TEXT_VIEWCONTROLS_CENTRE", true);
          if (var2Lifetime45 != null) {
            ViewControlStrings.textViewcontrolsCentre = MidiPcmStream.decodeText(-2022, var2Lifetime45);
          }
          var2Lifetime46 = AccountChoicePanel.readTextResourceBytes("TEXT_VIEWCONTROLS_MODE", true);
          if (var2Lifetime46 != null) {
            ScrollPane.textViewcontrolsMode = MidiPcmStream.decodeText(-2022, var2Lifetime46);
          }
          var2Lifetime47 = AccountChoicePanel.readTextResourceBytes("PLAYERNAME_HOTSEAT_2", true);
          if (var2Lifetime47 != null) {
            TooltipAndOptionsHelpers.playernameHotseat2 = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime47);
          }
          var2Lifetime48 = AccountChoicePanel.readTextResourceBytes("PLAYERNAME_HOTSEAT_1", true);
          if (var2Lifetime48 != null) {
            ContentTransitionDialog.playernameHotseat1 = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime48);
          }
          var2Lifetime49 = AccountChoicePanel.readTextResourceBytes("TEXT_BOOTSEQUENCE", true);
          if (var2Lifetime49 != null) {
            BitCountAndDialogHelpers.textBootsequence = MidiPcmStream.decodeText(-2022, var2Lifetime49);
          }
          var2Lifetime50 = AccountChoicePanel.readTextResourceBytes("TEXT_BOOTSEQUENCE_HALLOWEEN", true);
          if (null != var2Lifetime50) {
            AccountDialogHelpers.textBootsequenceHalloween = MidiPcmStream.decodeText(-2022, var2Lifetime50);
          }
          var2Lifetime51 = AccountChoicePanel.readTextResourceBytes("DETAIL_NAMES,0", true);
          if (var2Lifetime51 != null) {
            TextFieldPainter.detailNames[0] = MidiPcmStream.decodeText(-2022, var2Lifetime51);
          }
          var2Lifetime52 = AccountChoicePanel.readTextResourceBytes("DETAIL_NAMES,1", true);
          if (var2Lifetime52 != null) {
            TextFieldPainter.detailNames[1] = MidiPcmStream.decodeText(-2022, var2Lifetime52);
          }
          var2Lifetime53 = AccountChoicePanel.readTextResourceBytes("DETAIL_NAMES,2", true);
          if (var2Lifetime53 != null) {
            TextFieldPainter.detailNames[2] = MidiPcmStream.decodeText(-2022, var2Lifetime53);
          }
          var2Lifetime54 = AccountChoicePanel.readTextResourceBytes("DETAIL_NAMES,3", true);
          if (null != var2Lifetime54) {
            TextFieldPainter.detailNames[3] = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime54);
          }
          var2Lifetime55 = AccountChoicePanel.readTextResourceBytes("achievement_names,0", true);
          if (null != var2Lifetime55) {
            DualLinkDeque.achievementTitles[0] = MidiPcmStream.decodeText(-2022, var2Lifetime55);
          }
          var2Lifetime56 = AccountChoicePanel.readTextResourceBytes("achievement_names,1", true);
          if (null != var2Lifetime56) {
            DualLinkDeque.achievementTitles[1] = MidiPcmStream.decodeText(-2022, var2Lifetime56);
          }
          var2Lifetime57 = AccountChoicePanel.readTextResourceBytes("achievement_names,2", true);
          if (null != var2Lifetime57) {
            DualLinkDeque.achievementTitles[2] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, -2034), var2Lifetime57);
          }
          var2Lifetime58 = AccountChoicePanel.readTextResourceBytes("achievement_names,3", true);
          if (null != var2Lifetime58) {
            DualLinkDeque.achievementTitles[3] = MidiPcmStream.decodeText(-2022, var2Lifetime58);
          }
          var2Lifetime59 = AccountChoicePanel.readTextResourceBytes("achievement_names,4", true);
          if (null != var2Lifetime59) {
            DualLinkDeque.achievementTitles[4] = MidiPcmStream.decodeText(-2022, var2Lifetime59);
          }
          var2Lifetime60 = AccountChoicePanel.readTextResourceBytes("achievement_names,5", true);
          if (var2Lifetime60 != null) {
            DualLinkDeque.achievementTitles[5] = MidiPcmStream.decodeText(-2022, var2Lifetime60);
          }
          var2Lifetime61 = AccountChoicePanel.readTextResourceBytes("achievement_names,6", true);
          if (var2Lifetime61 != null) {
            DualLinkDeque.achievementTitles[6] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, -2034), var2Lifetime61);
          }
          var2Lifetime62 = AccountChoicePanel.readTextResourceBytes("achievement_names,7", true);
          if (null != var2Lifetime62) {
            DualLinkDeque.achievementTitles[7] = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime62);
          }
          var2Lifetime63 = AccountChoicePanel.readTextResourceBytes("achievement_names,8", true);
          if (null != var2Lifetime63) {
            DualLinkDeque.achievementTitles[8] = MidiPcmStream.decodeText(-2022, var2Lifetime63);
          }
          var2Lifetime64 = AccountChoicePanel.readTextResourceBytes("achievement_names,9", true);
          if (null != var2Lifetime64) {
            DualLinkDeque.achievementTitles[9] = MidiPcmStream.decodeText(-2022, var2Lifetime64);
          }
          var2Lifetime65 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,0", true);
          if (null != var2Lifetime65) {
            TextEncodingHelpers.achievementCriteria[0] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, -2034), var2Lifetime65);
          }
          var2Lifetime66 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,1", true);
          if (null != var2Lifetime66) {
            TextEncodingHelpers.achievementCriteria[1] = MidiPcmStream.decodeText(-2022, var2Lifetime66);
          }
          var2Lifetime67 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,2", true);
          if (null != var2Lifetime67) {
            TextEncodingHelpers.achievementCriteria[2] = MidiPcmStream.decodeText(-2022, var2Lifetime67);
          }
          var2Lifetime68 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,3", true);
          if (var2Lifetime68 != null) {
            TextEncodingHelpers.achievementCriteria[3] = MidiPcmStream.decodeText(-2022, var2Lifetime68);
          }
          var2Lifetime69 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,4", true);
          if (null != var2Lifetime69) {
            TextEncodingHelpers.achievementCriteria[4] = MidiPcmStream.decodeText(-2022, var2Lifetime69);
          }
          var2Lifetime70 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,5", true);
          if (var2Lifetime70 != null) {
            TextEncodingHelpers.achievementCriteria[5] = MidiPcmStream.decodeText(-2022, var2Lifetime70);
          }
          var2Lifetime71 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,6", true);
          if (var2Lifetime71 != null) {
            TextEncodingHelpers.achievementCriteria[6] = MidiPcmStream.decodeText(-2022, var2Lifetime71);
          }
          var2Lifetime72 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,7", true);
          if (null != var2Lifetime72) {
            TextEncodingHelpers.achievementCriteria[7] = MidiPcmStream.decodeText(-2022, var2Lifetime72);
          }
          var2Lifetime73 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,8", true);
          if (null != var2Lifetime73) {
            TextEncodingHelpers.achievementCriteria[8] = MidiPcmStream.decodeText(-2022, var2Lifetime73);
          }
          var2Lifetime74 = AccountChoicePanel.readTextResourceBytes("achievement_criteria,9", true);
          if (var2Lifetime74 != null) {
            TextEncodingHelpers.achievementCriteria[9] = MidiPcmStream.decodeText(-2022, var2Lifetime74);
          }
          var2Lifetime75 = AccountChoicePanel.readTextResourceBytes("text_login_or_discard", true);
          if (var2Lifetime75 != null) {
            MidiPcmStream.decodeText(-2022, var2Lifetime75);
          }
          var2Lifetime76 = AccountChoicePanel.readTextResourceBytes("gameoptlabels,0", true);
          if (null != var2Lifetime76) {
            RasterBuffer.gameOptionLabels[0] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, -2034), var2Lifetime76);
          }
          var2Lifetime77 = AccountChoicePanel.readTextResourceBytes("gameoptlabels,1", true);
          if (null != var2Lifetime77) {
            RasterBuffer.gameOptionLabels[1] = MidiPcmStream.decodeText(-2022, var2Lifetime77);
          }
          var2Lifetime78 = AccountChoicePanel.readTextResourceBytes("gameoptnames,0,0", true);
          if (null != var2Lifetime78) {
            QuickChatCategoryCache.gameOptionNames[0][0] = MidiPcmStream.decodeText(-2022, var2Lifetime78);
          }
          var2Lifetime79 = AccountChoicePanel.readTextResourceBytes("gameoptnames,0,1", true);
          if (var2Lifetime79 != null) {
            QuickChatCategoryCache.gameOptionNames[0][1] = MidiPcmStream.decodeText(-2022, var2Lifetime79);
          }
          var2Lifetime80 = AccountChoicePanel.readTextResourceBytes("gameoptnames,0,2", true);
          if (var2Lifetime80 != null) {
            QuickChatCategoryCache.gameOptionNames[0][2] = MidiPcmStream.decodeText(-2022, var2Lifetime80);
          }
          var2Lifetime81 = AccountChoicePanel.readTextResourceBytes("gameoptnames,0,3", true);
          if (var2Lifetime81 != null) {
            QuickChatCategoryCache.gameOptionNames[0][3] = MidiPcmStream.decodeText(-2022, var2Lifetime81);
          }
          var2Lifetime82 = AccountChoicePanel.readTextResourceBytes("gameoptnames,0,4", true);
          if (var2Lifetime82 != null) {
            QuickChatCategoryCache.gameOptionNames[0][4] = MidiPcmStream.decodeText(-2022, var2Lifetime82);
          }
          var2Lifetime83 = AccountChoicePanel.readTextResourceBytes("gameoptnames,0,5", true);
          if (var2Lifetime83 != null) {
            QuickChatCategoryCache.gameOptionNames[0][5] = MidiPcmStream.decodeText(-2022, var2Lifetime83);
          }
          var2Lifetime84 = AccountChoicePanel.readTextResourceBytes("gameoptnames,0,6", true);
          if (var2Lifetime84 != null) {
            QuickChatCategoryCache.gameOptionNames[0][6] = MidiPcmStream.decodeText(-2022, var2Lifetime84);
          }
          var2Lifetime85 = AccountChoicePanel.readTextResourceBytes("gameoptnames,1,0", true);
          if (null != var2Lifetime85) {
            QuickChatCategoryCache.gameOptionNames[1][0] = MidiPcmStream.decodeText(-2022, var2Lifetime85);
          }
          var2Lifetime86 = AccountChoicePanel.readTextResourceBytes("gameoptnames,1,1", true);
          if (null != var2Lifetime86) {
            QuickChatCategoryCache.gameOptionNames[1][1] = MidiPcmStream.decodeText(-2022, var2Lifetime86);
          }
          var2Lifetime87 = AccountChoicePanel.readTextResourceBytes("gameoptnames,1,2", true);
          if (null != var2Lifetime87) {
            QuickChatCategoryCache.gameOptionNames[1][2] = MidiPcmStream.decodeText(-2022, var2Lifetime87);
          }
          var2Lifetime88 = AccountChoicePanel.readTextResourceBytes("hotseatmenulabel", true);
          if (var2Lifetime88 != null) {
            LogoRenderHelpers.hotseatmenulabel = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime88);
          }
          var2Lifetime89 = AccountChoicePanel.readTextResourceBytes("hotseatoption_gridwidth_colon", true);
          if (var2Lifetime89 != null) {
            LobbySortHelpers.hotseatoptionGridwidthColon = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime89);
          }
          var2Lifetime90 = AccountChoicePanel.readTextResourceBytes("hotseatoption_turnduration_colon", true);
          if (null != var2Lifetime90) {
            RasterEffectHelpers.hotseatoptionTurndurationColon = MidiPcmStream.decodeText(-2022, var2Lifetime90);
          }
          var2Lifetime91 = AccountChoicePanel.readTextResourceBytes("hotseatoption_ailevel_colon", true);
          if (var2Lifetime91 != null) {
            SocialListEntry.hotseatoptionAilevelColon = MidiPcmStream.decodeText(-2022, var2Lifetime91);
          }
          var2Lifetime92 = AccountChoicePanel.readTextResourceBytes("ailevelnames,0", true);
          if (var2Lifetime92 != null) {
            LongAndTextCredentials.aiLevelNames[0] = MidiPcmStream.decodeText(-2022, var2Lifetime92);
          }
          var2Lifetime93 = AccountChoicePanel.readTextResourceBytes("ailevelnames,1", true);
          if (null != var2Lifetime93) {
            LongAndTextCredentials.aiLevelNames[1] = MidiPcmStream.decodeText(-2022, var2Lifetime93);
          }
          var2Lifetime94 = AccountChoicePanel.readTextResourceBytes("ailevelnames,2", true);
          if (var2Lifetime94 != null) {
            LongAndTextCredentials.aiLevelNames[2] = MidiPcmStream.decodeText(-2022, var2Lifetime94);
          }
          var2Lifetime95 = AccountChoicePanel.readTextResourceBytes("ailevelnames,3", true);
          if (var2Lifetime95 != null) {
            LongAndTextCredentials.aiLevelNames[3] = MidiPcmStream.decodeText(-2022, var2Lifetime95);
          }
          var2Lifetime96 = AccountChoicePanel.readTextResourceBytes("tutorial1", true);
          if (var2Lifetime96 != null) {
            GuestPlayHelpers.tutorial1 = MidiPcmStream.decodeText(-2022, var2Lifetime96);
          }
          var2Lifetime97 = AccountChoicePanel.readTextResourceBytes("tutorial2", true);
          if (null != var2Lifetime97) {
            SectorCacheStore.tutorial2 = MidiPcmStream.decodeText(-2022, var2Lifetime97);
          }
          var2Lifetime98 = AccountChoicePanel.readTextResourceBytes("tutorial3", true);
          if (var2Lifetime98 != null) {
            PendingSubmission.tutorial3 = MidiPcmStream.decodeText(-2022, var2Lifetime98);
          }
          var2Lifetime99 = AccountChoicePanel.readTextResourceBytes("tutorial4", true);
          if (var2Lifetime99 != null) {
            GzipDecompressor.tutorial4 = MidiPcmStream.decodeText(param0 ^ -2034, var2Lifetime99);
          }
          var2Lifetime100 = AccountChoicePanel.readTextResourceBytes("text_removed_from_game", true);
          if (var2Lifetime100 != null) {
            DebouncedValidator.textRemovedFromGame = MidiPcmStream.decodeText(param0 - 2042, var2Lifetime100);
          }
          var2Lifetime101 = AccountChoicePanel.readTextResourceBytes("text_lobby_pleaselogin", true);
          if (null != var2Lifetime101) {
            LobbyGame.textLobbyPleaselogin = MidiPcmStream.decodeText(-2022, var2Lifetime101);
          }
          var2Lifetime102 = AccountChoicePanel.readTextResourceBytes("instructions_pages,0", true);
          if (null != var2Lifetime102) {
            TooltipAndOptionsHelpers.instructionPages[0] = MidiPcmStream.decodeText(-2022, var2Lifetime102);
          }
          var2Lifetime103 = AccountChoicePanel.readTextResourceBytes("instructions_pages,1", true);
          if (null != var2Lifetime103) {
            TooltipAndOptionsHelpers.instructionPages[1] = MidiPcmStream.decodeText(-2022, var2Lifetime103);
          }
          DialWidgetPainter.field_m = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_376_0 = var2_ref;
          stackIn_376_1 = new StringBuilder().append("a.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_377_2 = "null";
          } else {
            stackIn_377_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_376_0), ((StringBuilder) (Object) stackIn_376_1).append(stackIn_377_2).append(')').toString());
        }
    }

    static {
        field_y = 0;
        field_G = new int[10];
        field_F = new int[10];
        field_B = new int[10];
        field_J = new int[10];
        field_C = new int[10];
        field_H = new LogoAndLoginHelpers();
        field_z = "<%0> is not on your ignore list.";
        field_A = "Remove name";
    }
}
