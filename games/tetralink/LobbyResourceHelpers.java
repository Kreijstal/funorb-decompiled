/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyResourceHelpers {
    static int field_e;
    static String field_b;
    static int[][] field_f;
    static int[] field_d;
    static int[] field_c;
    static PcmSample[] field_a;
    static double[] field_g;

    final static void loadLobbyResources(Archive param0, byte param1, IndexedSprite[] param2, int[] param3, Archive param4) {
        Sprite[] dupTemp$0 = null;
        Sprite[] dupTemp$1 = null;
        Sprite[] dupTemp$2 = null;
        Sprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[] var6 = null;
        int var7_int = 0;
        int var18 = 0;
        IndexedSprite[] var20 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        int[] var6_array = null;
        BinaryBitmapFont var7 = null;
        UiComponent var8 = null;
        UiComponent var9 = null;
        UiComponent var10 = null;
        UiComponent var11 = null;
        Sprite[] var12 = null;
        Sprite[] var13 = null;
        Sprite[] var14 = null;
        UiComponent var15 = null;
        Sprite[] var16 = null;
        Sprite[] var17 = null;
        byte[] var19 = null;
        int[] var21 = null;
        int[] var22 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = TetraLink.field_J;
        try {
          var20 = LobbyGame.loadIndexedSpritesByName(param4, "crowns", "lobby", -1409);
          var5 = var20;
          HuffmanCodec.field_h = var20.length;
          if (param2 != null) {
            var6 = new IndexedSprite[param2.length + HuffmanCodec.field_h];
            for (var7_int = 0; HuffmanCodec.field_h > var7_int; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            var5 = var6;
            for (var7_intLifetime3 = 0; var7_intLifetime3 < param2.length; var7_intLifetime3++) {
              var6[HuffmanCodec.field_h + var7_intLifetime3] = param2[var7_intLifetime3];
            }
          }
          var22 = new int[var5.length];
          var21 = var22;
          var6_array = var21;
          for (var7_intLifetime1 = 0; HuffmanCodec.field_h > var7_intLifetime1; var7_intLifetime1++) {
            var22[var7_intLifetime1] = 10;
          }
          if (param2 != null) {
            if (param3 != null) {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param2.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + HuffmanCodec.field_h] = param3[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; param2.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[HuffmanCodec.field_h + var7_intLifetime2] = param2[var7_intLifetime2].field_f;
              }
            }
          }
          StrongCacheEntry.field_J = 2;
          GameKeyHandler.field_d = 15;
          ArchiveFactoryHelpers.field_d = 11;
          DisplayNameForm.field_Q = 4;
          QueuedStatSubmission.field_w = 2;
          var7 = FontAndBrightnessHelpers.loadFontByName("lobby", "largefont", param4, param0, -83);
          LoadingResourceHelpers.field_e = FontAndBrightnessHelpers.loadFontByName("lobby", "generalfont", param4, param0, -106);
          LoginProgressHelpers.field_g = FontAndBrightnessHelpers.loadFontByName("lobby", "chatfont", param4, param0, -58);
          var7.setInlineSprites(var5, var22);
          LoadingResourceHelpers.field_e.setInlineSprites(var5, var22);
          LoginProgressHelpers.field_g.setInlineSprites(var5, var22);
          var8 = new UiComponent(0L, (UiComponent) null);
          var8.field_N = 16777215;
          var8.field_Ib = (BitmapFont) ((Object) var7);
          var8.field_Q = GameKeyHandler.field_d;
          var8.field_J = 1;
          var9 = var8;
          var9.field_xb = 1;
          var10 = new UiComponent(0L, (UiComponent) null);
          var10.field_Q = GameKeyHandler.field_d;
          var10.field_Ib = (BitmapFont) ((Object) LoadingResourceHelpers.field_e);
          var10.field_N = 16777215;
          var10.field_J = 1;
          var11 = var10;
          var11.field_xb = 1;
          DialWidgetPainter.field_j = new UiComponent(0L, var8);
          DialWidgetPainter.field_j.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -79, param4, "lobby", "heading"));
          QuickChatPhraseCache.field_b = new UiComponent(0L, (UiComponent) null);
          QuickChatPhraseCache.field_b.field_Eb = LobbyGame.createGradientTabSprites(false, false, 8421504, false, 120, 4210752);
          NotificationToast.field_o = new UiComponent(0L, (UiComponent) null);
          NotificationToast.field_o.field_Eb = Archive.buildNineSliceSprites(1, 3, 6316128, 16, 6316128, 114);
          TextFieldValidator.field_n = new UiComponent(0L, (UiComponent) null);
          TextFieldValidator.field_n.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -121, param4, "lobby", "popup"));
          var12 = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -102, param4, "lobby", "popup_mouseover"));
          var13 = PlayingSound.loadSpritesByName((byte) -106, param4, "lobby", "button");
          var14 = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -83, param4, "lobby", "tab_active"));
          UiComponent.field_gb = new UiComponent(0L, var8);
          UiComponent.field_gb.field_Eb = var14;
          ErrorPrintHelpers.field_c = new UiComponent(0L, (UiComponent) null);
          ErrorPrintHelpers.field_c.field_vb = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "closebutton", "lobby");
          ErrorPrintHelpers.field_c.field_Ab = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "closebutton_mouseover", "lobby");
          ChatLayoutHelpers.field_d = new UiComponent(0L, var8);
          ChatLayoutHelpers.field_d.field_Eb = LobbyGame.createGradientTabSprites(true, false, 3815994, true, 40, 2039583);
          CacheEntry.field_x = new UiComponent(0L, var10);
          CacheEntry.field_x.field_V = 2;
          CacheEntry.field_x.field_Eb = LobbyGame.createGradientTabSprites(true, false, 3815994, false, 30, 2039583);
          ModelMergeHelpers.field_e = new UiComponent(0L, var10);
          ModelMergeHelpers.field_e.field_V = 2;
          ModelMergeHelpers.field_e.field_Eb = LobbyGame.createGradientTabSprites(false, false, 3815994, false, 30, 2039583);
          TextFieldValidator.field_l = new UiComponent(0L, var10);
          TextFieldValidator.field_l.field_V = 2;
          TextFieldValidator.field_l.field_Eb = LobbyGame.createGradientTabSprites(false, false, 3815994, true, 30, 2039583);
          TextLayoutLine.field_i = new UiComponent(0L, (UiComponent) null);
          TextLayoutLine.field_i.field_N = 13421772;
          TextLayoutLine.field_i.field_J = 1;
          TextLayoutLine.field_i.field_Q = GameKeyHandler.field_d;
          TextLayoutLine.field_i.field_Ib = (BitmapFont) ((Object) LoadingResourceHelpers.field_e);
          NotificationToast.field_n = new UiComponent(0L, TextLayoutLine.field_i);
          NotificationToast.field_n.field_N = 16764006;
          NotificationToast.field_n.field_ib = 16777215;
          NotificationToast.field_n.field_L = 16777215;
          NotificationToast.field_n.field_P = 8421504;
          NotificationToast.field_n.field_nb = 16777215;
          var15 = new UiComponent(0L, NotificationToast.field_n);
          var15.field_N = 16777215;
          var15.field_Ib = (BitmapFont) ((Object) var7);
          var15.field_Q = GameKeyHandler.field_d;
          ServerConnectionHelpers.field_b = new UiComponent(0L, TextLayoutLine.field_i);
          ServerConnectionHelpers.field_b.field_Eb = LobbyGame.createGradientTabSprites(false, false, 2236962, false, 16, 2236962);
          ServerConnectionHelpers.field_b.field_V = 2;
          LoginDialog.field_rb = new UiComponent(0L, TextLayoutLine.field_i);
          LoginDialog.field_rb.field_Eb = LobbyGame.createGradientTabSprites(false, false, 1513239, false, 16, 1513239);
          LoginDialog.field_rb.field_V = 2;
          JoinGameTextGlobals.field_c = new UiComponent(0L, ServerConnectionHelpers.field_b);
          JoinGameTextGlobals.field_c.applyStyle(NotificationToast.field_n, -2147483648);
          SectorCacheStore.field_h = new UiComponent(0L, LoginDialog.field_rb);
          SectorCacheStore.field_h.applyStyle(NotificationToast.field_n, -2147483648);
          var16 = PlayingSound.loadSpritesByName((byte) -115, param4, "lobby", "button_mouseover");
          TetraLink.field_P = new ContextMenu(TextFieldValidator.field_n, var12, TextLayoutLine.field_i, NotificationToast.field_n, 3, 2, QueuedStatSubmission.field_w, 3, GameKeyHandler.field_d);
          HighscoreSubmission.field_r = new UiComponent(0L, NotificationToast.field_n);
          HighscoreSubmission.field_r.field_kb = var16;
          HighscoreSubmission.field_r.field_Eb = var13;
          HighscoreSubmission.field_r.field_Jb = 1;
          HighscoreSubmission.field_r.field_Fb = 1;
          HighscoreSubmission.field_r.field_D = 1;
          HighscoreSubmission.field_r.field_E = 1;
          HighscoreSubmission.field_r.field_pb = PlayingSound.loadSpritesByName((byte) -86, param4, "lobby", "button_mouseheld");
          HighscoreSubmission.field_r.field_Gb = PlayingSound.loadSpritesByName((byte) -98, param4, "lobby", "button_active");
          HighscoreSubmission.field_r.field_H = PlayingSound.loadSpritesByName((byte) -105, param4, "lobby", "button_disabled");
          HighscoreSubmission.field_r.field_xb = 1;
          DropTargetWidget.field_O = new UiComponent(0L, NotificationToast.field_n);
          DropTargetWidget.field_O.field_xb = 1;
          DropTargetWidget.field_O.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -122, param4, "lobby", "tab_inactive"));
          DropTargetWidget.field_O.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -112, param4, "lobby", "tab_mouseover"));
          DropTargetWidget.field_O.field_Gb = var14;
          CaptionedContainer.field_S = new UiComponent(0L, (UiComponent) null);
          CaptionedContainer.field_S.field_Eb = Archive.buildNineSliceSprites(-1, 3, 1127256, 16, 1856141, 206);
          OpacityWidget.field_Q = new UiComponent(0L, (UiComponent) null);
          OpacityWidget.field_Q.field_Eb = Archive.buildNineSliceSprites(-1, 3, 6052956, 16, 11579568, 290);
          FlaggedTextValue.field_l = new UiComponent(0L, var15);
          FlaggedTextValue.field_l.field_Jb = 1;
          FlaggedTextValue.field_l.field_D = 1;
          FlaggedTextValue.field_l.field_E = 1;
          FlaggedTextValue.field_l.field_xb = 1;
          FlaggedTextValue.field_l.field_Fb = 1;
          ClockAndTextHelpers.field_a = new UiComponent(0L, FlaggedTextValue.field_l);
          ScrollPane.field_Kb = new UiComponent(0L, NotificationToast.field_n);
          ScrollPane.field_Kb.field_Jb = 1;
          ScrollPane.field_Kb.field_xb = 1;
          ScrollPane.field_Kb.field_D = 1;
          ScrollPane.field_Kb.field_Fb = 1;
          ScrollPane.field_Kb.field_E = 1;
          CameraAndChatHelpers.field_c = new UiComponent(0L, ScrollPane.field_Kb);
          LoadingStepTracker.field_l = new UiComponent(0L, ScrollPane.field_Kb);
          SecondaryNodeDeque.field_d = new UiComponent(0L, FlaggedTextValue.field_l);
          ArchiveIndex.field_o = new UiComponent(0L, ScrollPane.field_Kb);
          NetworkArchiveRequest.field_N = new UiComponent(0L, ScrollPane.field_Kb);
          AccountTermsPanel.field_L = new UiComponent(0L, ScrollPane.field_Kb);
          ScrollPane.field_Kb.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -97, param4, "lobby", "smallbutton"));
          ScrollPane.field_Kb.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -99, param4, "lobby", "smallbutton_mouseover"));
          dupTemp$0 = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -72, param4, "lobby", "smallbutton_active"));
          ScrollPane.field_Kb.field_Gb = dupTemp$0;
          ScrollPane.field_Kb.field_pb = dupTemp$0;
          ScrollPane.field_Kb.field_H = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -121, param4, "lobby", "smallbutton_disabled"));
          ClockAndTextHelpers.field_a.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -98, param4, "lobby", "mediumbutton"));
          ClockAndTextHelpers.field_a.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -114, param4, "lobby", "mediumbutton_mouseover"));
          ClockAndTextHelpers.field_a.field_pb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -90, param4, "lobby", "mediumbutton_mouseheld"));
          FlaggedTextValue.field_l.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -100, param4, "lobby", "bigbutton"));
          FlaggedTextValue.field_l.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -125, param4, "lobby", "bigbutton_mouseover"));
          FlaggedTextValue.field_l.field_pb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -118, param4, "lobby", "bigbutton_mouseheld"));
          FlaggedTextValue.field_l.field_H = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -69, param4, "lobby", "bigbutton_disabled"));
          CameraAndChatHelpers.field_c.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -128, param4, "lobby", "greenbutton"));
          CameraAndChatHelpers.field_c.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -82, param4, "lobby", "greenbutton_mouseover"));
          CameraAndChatHelpers.field_c.field_pb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -93, param4, "lobby", "greenbutton_mouseheld"));
          LoadingStepTracker.field_l.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -71, param4, "lobby", "redbutton"));
          LoadingStepTracker.field_l.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -73, param4, "lobby", "redbutton_mouseover"));
          LoadingStepTracker.field_l.field_pb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -91, param4, "lobby", "redbutton_mouseheld"));
          SecondaryNodeDeque.field_d.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -110, param4, "lobby", "backbutton"));
          SecondaryNodeDeque.field_d.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -99, param4, "lobby", "backbutton_mouseover"));
          SecondaryNodeDeque.field_d.field_pb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -120, param4, "lobby", "backbutton_mouseheld"));
          SecondaryNodeDeque.field_d.field_H = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -77, param4, "lobby", "backbutton_disabled"));
          AccountTermsPanel.field_L.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -88, param4, "lobby", "gameoptionbutton"));
          AccountTermsPanel.field_L.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -119, param4, "lobby", "gameoptionbutton_mouseover"));
          dupTemp$1 = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -84, param4, "lobby", "gameoptionbutton_active"));
          AccountTermsPanel.field_L.field_Gb = dupTemp$1;
          AccountTermsPanel.field_L.field_pb = dupTemp$1;
          AccountTermsPanel.field_L.field_H = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -86, param4, "lobby", "gameoptionbutton_disabled"));
          ArchiveIndex.field_o.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -117, param4, "lobby", "chatbutton"));
          ArchiveIndex.field_o.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -101, param4, "lobby", "chatbutton_mouseover"));
          dupTemp$2 = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -94, param4, "lobby", "chatbutton_active"));
          ArchiveIndex.field_o.field_Gb = dupTemp$2;
          ArchiveIndex.field_o.field_pb = dupTemp$2;
          NetworkArchiveRequest.field_N.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -85, param4, "lobby", "chatfilterbutton"));
          NetworkArchiveRequest.field_N.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -92, param4, "lobby", "chatfilterbutton_mouseover"));
          dupTemp$3 = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -119, param4, "lobby", "chatfilterbutton_active"));
          NetworkArchiveRequest.field_N.field_Gb = dupTemp$3;
          NetworkArchiveRequest.field_N.field_pb = dupTemp$3;
          var17 = PlayingSound.loadSpritesByName((byte) -87, param4, "lobby", "checkbox");
          GrowableIntList.field_c = new LabelPairWidget(0L, var17[1], var17[0], 1, NotificationToast.field_n, (String) null);
          PacketFlushHelpers.field_a = new UiComponent(0L, (UiComponent) null);
          PacketFlushHelpers.field_a.field_Eb = TransitionPhase.createCentreOnlyFrame(LoadingProgressDialog.loadFontByName(param4, (byte) -45, "slideregion", "lobby"), (byte) 21);
          PacketFlushHelpers.field_a.field_kb = TransitionPhase.createCentreOnlyFrame(LoadingProgressDialog.loadFontByName(param4, (byte) -45, "slideregion_mouseover", "lobby"), (byte) 21);
          PacketFlushHelpers.field_a.field_pb = TransitionPhase.createCentreOnlyFrame(LoadingProgressDialog.loadFontByName(param4, (byte) -45, "slideregion_mouseheld", "lobby"), (byte) 21);
          PacketFlushHelpers.field_a.field_H = TransitionPhase.createCentreOnlyFrame(LoadingProgressDialog.loadFontByName(param4, (byte) -45, "slideregion_disabled", "lobby"), (byte) 21);
          RasterTargetHelpers.field_g = new UiComponent(0L, (UiComponent) null);
          RasterTargetHelpers.field_g.field_Eb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -124, param4, "lobby", "dragbar"));
          RasterTargetHelpers.field_g.field_kb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -94, param4, "lobby", "dragbar_mouseover"));
          RasterTargetHelpers.field_g.field_pb = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -103, param4, "lobby", "dragbar_mouseheld"));
          RasterTargetHelpers.field_g.field_H = LoadingScreenRenderHelpers.resetSpriteOffsets(true, PlayingSound.loadSpritesByName((byte) -80, param4, "lobby", "dragbar_disabled"));
          IsaacCipher.field_j = new UiComponent(0L, (UiComponent) null);
          IsaacCipher.field_j.field_vb = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "upbutton", "lobby");
          if (param1 < 38) {
            var19 = (byte[]) null;
            LobbyResourceHelpers.computeCrc32((byte[]) null, (byte) -120, -19);
          }
          IsaacCipher.field_j.field_Ab = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "upbutton_mouseover", "lobby");
          IsaacCipher.field_j.field_sb = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "upbutton_mouseheld", "lobby");
          IsaacCipher.field_j.field_y = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "upbutton_disabled", "lobby");
          LobbyUpdateHelpers.field_c = new UiComponent(0L, (UiComponent) null);
          LobbyUpdateHelpers.field_c.field_vb = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "downbutton", "lobby");
          LobbyUpdateHelpers.field_c.field_Ab = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "downbutton_mouseover", "lobby");
          LobbyUpdateHelpers.field_c.field_sb = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "downbutton_mouseheld", "lobby");
          LobbyUpdateHelpers.field_c.field_y = LoadingProgressDialog.loadFontByName(param4, (byte) -45, "downbutton_disabled", "lobby");
          FullscreenErrorDialog.field_cb = new VerticalScrollbar(0L, IsaacCipher.field_j, LobbyUpdateHelpers.field_c, PacketFlushHelpers.field_a, RasterTargetHelpers.field_g);
          KeyEventHelpers.field_b = new TwoColumnListPanel(0L, (UiComponent) null, MatchingTextValidator.field_t, FullscreenErrorDialog.field_cb, ScrollPane.field_Kb, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_31_0 = var5_ref;
          stackIn_31_1 = new StringBuilder().append("ti.B(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final static boolean isValidAccountName(int param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          if (!ViewportController.isValidDisplayName(param2, false, param1)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (var3_int >= param1.length()) {
              var4 = 27 % ((param0 + 17) / 57);
              return true;
            }
            if (ReportAbuseDialog.isNameCharacter(param1.charAt(var3_int), false)) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ti.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int computeCrc32(byte[] param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 47 / ((param1 - 36) / 46);
          stackIn_1_0 = LinkTextPainter.crc32(param0, 2, param2, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ti.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 2) {
          field_b = (String) null;
        }
        field_b = null;
        field_d = null;
        field_g = null;
        field_f = (int[][]) null;
        field_a = null;
        field_c = null;
    }

    final static void setLegacyMenuFrameAndPadding(int param0, int param1, int param2, NineSliceFrame param3) {
        try {
          SoundEffectLibrary.field_d = param2;
          IntKeyLookup.field_b = param3;
          if (param1 != 1) {
            NineSliceFrame var5 = (NineSliceFrame) null;
            LobbyResourceHelpers.setLegacyMenuFrameAndPadding(-29, -41, 120, (NineSliceFrame) null);
          }
          NameAlphabetTable.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ti.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = -1;
        field_b = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
