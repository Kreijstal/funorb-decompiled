/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseDefinition extends DualLinkNode {
    int[] field_C;
    private String[] field_A;
    private int[] field_z;
    static long field_y;
    static int[] field_B;
    private int[][] field_x;
    static PlayingSound[] field_D;
    static int field_E;
    static int field_G;
    static String retry;
    static boolean[] field_w;

    final String getTemplateText(int firstSegmentIndex) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Pool.field_O;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_A) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_A[firstSegmentIndex]);
        for (var3 = 1; this.field_A.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_A[var3]);
        }
        return var2.toString();
    }

    final void markExtendedLinks(boolean obfuscationGuard) {
        int var2 = 0;
        int var3 = Pool.field_O;
        if (this.field_C != null) {
          for (var2 = 0; this.field_C.length > var2; var2++) {
            this.field_C[var2] = RenderingInitializationSupport.bitwiseOr(this.field_C[var2], 32768);
          }
        }
        if (!obfuscationGuard) {
          field_y = 55L;
        }
    }

    final static void setMusicVolume(int volume, int obfuscationGuard) {
        TranslatedUiText.field_h = volume;
        if (obfuscationGuard != 3815994) {
          return;
        }
        if (null != RankingsScreen.field_N) {
          RankingsScreen.field_N.setMasterVolume(volume, (byte) -46);
        }
        if (SpriteState.field_C != null) {
          SpriteState.field_C.setMasterGain(volume, obfuscationGuard - 3804437);
        }
    }

    QuickChatPhraseDefinition() {
    }

    final static short[] resizeShortArray(short[] values, byte obfuscationGuard, int size) {
        RuntimeException var3 = null;
        short[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -73) {
            field_w = (boolean[]) null;
          }
          stackIn_3_0 = PaletteFontLoader.extendShortArray((byte) -123, size, values, (short) 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ap.F(");
          if (values == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(',').append(size).append(')').toString());
        }
    }

    final void decode(int obfuscationGuard, PacketBuffer buffer) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          if (obfuscationGuard != -20678) {
            field_D = (PlayingSound[]) null;
          }
          while (true) {
            var3_int = buffer.readUnsignedByte(obfuscationGuard ^ 20652);
            if (var3_int == 0) {
              return;
            }
            this.decodeOpcode(var3_int, buffer, (byte) -17);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ap.D(").append(obfuscationGuard).append(',');
          if (buffer == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_B = null;
        if (param0 != -111) {
          short[] var2 = (short[]) null;
          QuickChatPhraseDefinition.resizeShortArray((short[]) null, (byte) -77, 7);
        }
        retry = null;
        field_w = null;
        field_D = null;
    }

    final static void loadLobbyTheme(ResourceArchive param0, boolean param1, IndexedSprite[] param2, int[] param3, ResourceArchive param4) {
        Sprite[] dupTemp$0 = null;
        Sprite[] dupTemp$1 = null;
        Sprite[] dupTemp$2 = null;
        Sprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        IndexedSprite[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
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
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = Pool.field_O;
        try {
          var20 = ArchiveRequest.loadIndexedSpritesByName(param4, "lobby", -24155, "crowns");
          var5 = var20;
          UsernameSuggestionSupport.field_a = var20.length;
          if (param2 != null) {
            var6 = new IndexedSprite[param2.length + UsernameSuggestionSupport.field_a];
            for (var7_int = 0; UsernameSuggestionSupport.field_a > var7_int; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; var7_intLifetime3 < param2.length; var7_intLifetime3++) {
              var6[var7_intLifetime3 + UsernameSuggestionSupport.field_a] = param2[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; UsernameSuggestionSupport.field_a > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param2 != null) {
            if (param3 != null) {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param2.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + UsernameSuggestionSupport.field_a] = param3[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param2.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + UsernameSuggestionSupport.field_a] = param2[var7_intLifetime2].fullHeight;
              }
            }
          }
          CueAim.field_j = 4;
          QuickChatPhraseRegistry.field_b = 11;
          DualLinkNodeHashTable.field_i = 2;
          ArchiveIndex.field_x = 15;
          ByteArrayPool.field_b = 2;
          var7 = CanvasInputSupport.loadBinaryFontByName(param4, "largefont", 0, param0, "lobby");
          MembershipBenefitsLoader.field_a = CanvasInputSupport.loadBinaryFontByName(param4, "generalfont", 0, param0, "lobby");
          FixedPointVectorSupport.field_c = CanvasInputSupport.loadBinaryFontByName(param4, "chatfont", 0, param0, "lobby");
          var7.setInlineSprites(var5, var24);
          MembershipBenefitsLoader.field_a.setInlineSprites(var5, var24);
          FixedPointVectorSupport.field_c.setInlineSprites(var5, var24);
          var8 = new UiComponent(0L, (UiComponent) null);
          var8.font = (BitmapFont) ((Object) var7);
          var8.lineSpacing = ArchiveIndex.field_x;
          var8.textColor = 16777215;
          var9 = var8;
          var8.verticalAlignment = 1;
          var9.horizontalAlignment = 1;
          var10 = new UiComponent(0L, (UiComponent) null);
          var10.lineSpacing = ArchiveIndex.field_x;
          var10.textColor = 16777215;
          var10.font = (BitmapFont) ((Object) MembershipBenefitsLoader.field_a);
          var10.verticalAlignment = 1;
          var11 = var10;
          var11.horizontalAlignment = 1;
          MonotonicClock.field_d = new UiComponent(0L, var8);
          MonotonicClock.field_d.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "heading"), 12519);
          RenderingInitializationSupport.field_d = new UiComponent(0L, (UiComponent) null);
          RenderingInitializationSupport.field_d.frameSprites = IterableDualLinkDeque.createGradientPanelSprites(8421504, 4210752, false, 120, -86, false);
          ScreenProjectionSupport.field_f = new UiComponent(0L, (UiComponent) null);
          ScreenProjectionSupport.field_f.frameSprites = NineSliceFrameSupport.buildNineSliceFrameSprites(32450, 3, 1, 114, 6316128, 6316128);
          ProgressDialog.field_qb = new UiComponent(0L, (UiComponent) null);
          ProgressDialog.field_qb.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "popup"), 12519);
          var12 = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "popup_mouseover"), 12519);
          var13 = NameEntryPopup.loadSpritesByName(0, "lobby", param4, "button");
          var14 = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "tab_active"), 12519);
          DiskArchiveRequest.field_J = new UiComponent(0L, var8);
          DiskArchiveRequest.field_J.frameSprites = var14;
          VertexTransformSupport.field_f = new UiComponent(0L, (UiComponent) null);
          VertexTransformSupport.field_f.sprite = WidgetStyleLayer.loadSprite("lobby", (byte) 115, "closebutton", param4);
          VertexTransformSupport.field_f.activeSprite = WidgetStyleLayer.loadSprite("lobby", (byte) 101, "closebutton_mouseover", param4);
          MirroredSceneSupport.field_b = new UiComponent(0L, var8);
          MirroredSceneSupport.field_b.frameSprites = IterableDualLinkDeque.createGradientPanelSprites(3815994, 2039583, true, 40, -86, true);
          LoginEncryptionSupport.field_d = new UiComponent(0L, var10);
          LoginEncryptionSupport.field_d.textInset = 2;
          LoginEncryptionSupport.field_d.frameSprites = IterableDualLinkDeque.createGradientPanelSprites(3815994, 2039583, false, 30, -111, true);
          LobbyPanelLayoutSupport.field_e = new UiComponent(0L, var10);
          LobbyPanelLayoutSupport.field_e.textInset = 2;
          LobbyPanelLayoutSupport.field_e.frameSprites = IterableDualLinkDeque.createGradientPanelSprites(3815994, 2039583, false, 30, -123, false);
          Under13NoticePanel.field_Q = new UiComponent(0L, var10);
          Under13NoticePanel.field_Q.textInset = 2;
          Under13NoticePanel.field_Q.frameSprites = IterableDualLinkDeque.createGradientPanelSprites(3815994, 2039583, true, 30, -107, false);
          AlignedIconLabel.field_Lb = new UiComponent(0L, (UiComponent) null);
          AlignedIconLabel.field_Lb.verticalAlignment = 1;
          AlignedIconLabel.field_Lb.font = (BitmapFont) ((Object) MembershipBenefitsLoader.field_a);
          AlignedIconLabel.field_Lb.textColor = 13421772;
          AlignedIconLabel.field_Lb.lineSpacing = ArchiveIndex.field_x;
          UiWidget.field_A = new UiComponent(0L, AlignedIconLabel.field_Lb);
          UiWidget.field_A.capturedTextColor = 16777215;
          UiWidget.field_A.activeTextColor = 16777215;
          UiWidget.field_A.textColor = 16764006;
          UiWidget.field_A.selectedTextColor = 16777215;
          UiWidget.field_A.disabledTextColor = 8421504;
          var15 = new UiComponent(0L, UiWidget.field_A);
          var15.lineSpacing = ArchiveIndex.field_x;
          var15.textColor = 16777215;
          var15.font = (BitmapFont) ((Object) var7);
          TimeTrialSelectScreen.field_M = new UiComponent(0L, AlignedIconLabel.field_Lb);
          TimeTrialSelectScreen.field_M.frameSprites = IterableDualLinkDeque.createGradientPanelSprites(2236962, 2236962, false, 16, -125, false);
          TimeTrialSelectScreen.field_M.textInset = 2;
          GameApplet.field_a = new UiComponent(0L, AlignedIconLabel.field_Lb);
          GameApplet.field_a.frameSprites = IterableDualLinkDeque.createGradientPanelSprites(1513239, 1513239, false, 16, -97, false);
          GameApplet.field_a.textInset = 2;
          BallSkin.field_d = new UiComponent(0L, TimeTrialSelectScreen.field_M);
          BallSkin.field_d.copyStyle((byte) -87, UiWidget.field_A);
          PacketBuffer.field_s = new UiComponent(0L, GameApplet.field_a);
          PacketBuffer.field_s.copyStyle((byte) -87, UiWidget.field_A);
          var16 = NameEntryPopup.loadSpritesByName(0, "lobby", param4, "button_mouseover");
          IntrusiveDeque.field_c = new ContextMenu(ProgressDialog.field_qb, var12, AlignedIconLabel.field_Lb, UiWidget.field_A, 3, 2, ByteArrayPool.field_b, 3, ArchiveIndex.field_x);
          SocketArchiveNetworkClient.field_x = new UiComponent(0L, UiWidget.field_A);
          SocketArchiveNetworkClient.field_x.selectedOffsetY = 1;
          SocketArchiveNetworkClient.field_x.selectedOffsetX = 1;
          SocketArchiveNetworkClient.field_x.activeFrameSprites = var16;
          SocketArchiveNetworkClient.field_x.capturedOffsetX = 1;
          SocketArchiveNetworkClient.field_x.frameSprites = var13;
          SocketArchiveNetworkClient.field_x.capturedOffsetY = 1;
          SocketArchiveNetworkClient.field_x.capturedFrameSprites = NameEntryPopup.loadSpritesByName(0, "lobby", param4, "button_mouseheld");
          SocketArchiveNetworkClient.field_x.selectedFrameSprites = NameEntryPopup.loadSpritesByName(0, "lobby", param4, "button_active");
          SocketArchiveNetworkClient.field_x.disabledFrameSprites = NameEntryPopup.loadSpritesByName(0, "lobby", param4, "button_disabled");
          SocketArchiveNetworkClient.field_x.horizontalAlignment = 1;
          IndexedSpriteState.field_c = new UiComponent(0L, UiWidget.field_A);
          IndexedSpriteState.field_c.horizontalAlignment = 1;
          IndexedSpriteState.field_c.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "tab_inactive"), 12519);
          IndexedSpriteState.field_c.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "tab_mouseover"), 12519);
          IndexedSpriteState.field_c.selectedFrameSprites = var14;
          RankingsRequest.field_u = new UiComponent(0L, (UiComponent) null);
          RankingsRequest.field_u.frameSprites = NineSliceFrameSupport.buildNineSliceFrameSprites(32450, 3, -1, 206, 1856141, 1127256);
          CheckboxWidget.field_P = new UiComponent(0L, (UiComponent) null);
          CheckboxWidget.field_P.frameSprites = NineSliceFrameSupport.buildNineSliceFrameSprites(32450, 3, -1, 290, 11579568, 6052956);
          LobbyPlayerLookupSupport.field_c = new UiComponent(0L, var15);
          LobbyPlayerLookupSupport.field_c.selectedOffsetY = 1;
          LobbyPlayerLookupSupport.field_c.horizontalAlignment = 1;
          LobbyPlayerLookupSupport.field_c.capturedOffsetX = 1;
          LobbyPlayerLookupSupport.field_c.capturedOffsetY = 1;
          LobbyPlayerLookupSupport.field_c.selectedOffsetX = 1;
          NineSliceFrameSupport.field_d = new UiComponent(0L, LobbyPlayerLookupSupport.field_c);
          ButtonPainter.field_a = new UiComponent(0L, UiWidget.field_A);
          ButtonPainter.field_a.capturedOffsetY = 1;
          ButtonPainter.field_a.horizontalAlignment = 1;
          ButtonPainter.field_a.capturedOffsetX = 1;
          ButtonPainter.field_a.selectedOffsetX = 1;
          ButtonPainter.field_a.selectedOffsetY = 1;
          ModelInstance.field_i = new UiComponent(0L, ButtonPainter.field_a);
          ArchiveProvider.field_g = new UiComponent(0L, ButtonPainter.field_a);
          ScoreboardNameRecord.field_d = new UiComponent(0L, LobbyPlayerLookupSupport.field_c);
          AchievementSubmission.field_l = new UiComponent(0L, ButtonPainter.field_a);
          TutorialFactory.field_d = new UiComponent(0L, ButtonPainter.field_a);
          FaceNormal.field_c = new UiComponent(0L, ButtonPainter.field_a);
          ButtonPainter.field_a.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "smallbutton"), 12519);
          ButtonPainter.field_a.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "smallbutton_mouseover"), 12519);
          dupTemp$0 = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "smallbutton_active"), 12519);
          ButtonPainter.field_a.selectedFrameSprites = dupTemp$0;
          ButtonPainter.field_a.capturedFrameSprites = dupTemp$0;
          ButtonPainter.field_a.disabledFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "smallbutton_disabled"), 12519);
          NineSliceFrameSupport.field_d.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "mediumbutton"), 12519);
          NineSliceFrameSupport.field_d.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "mediumbutton_mouseover"), 12519);
          NineSliceFrameSupport.field_d.capturedFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "mediumbutton_mouseheld"), 12519);
          LobbyPlayerLookupSupport.field_c.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "bigbutton"), 12519);
          LobbyPlayerLookupSupport.field_c.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "bigbutton_mouseover"), 12519);
          LobbyPlayerLookupSupport.field_c.capturedFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "bigbutton_mouseheld"), 12519);
          LobbyPlayerLookupSupport.field_c.disabledFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "bigbutton_disabled"), 12519);
          ModelInstance.field_i.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "greenbutton"), 12519);
          ModelInstance.field_i.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "greenbutton_mouseover"), 12519);
          ModelInstance.field_i.capturedFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "greenbutton_mouseheld"), 12519);
          ArchiveProvider.field_g.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "redbutton"), 12519);
          ArchiveProvider.field_g.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "redbutton_mouseover"), 12519);
          ArchiveProvider.field_g.capturedFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "redbutton_mouseheld"), 12519);
          ScoreboardNameRecord.field_d.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "backbutton"), 12519);
          ScoreboardNameRecord.field_d.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "backbutton_mouseover"), 12519);
          ScoreboardNameRecord.field_d.capturedFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "backbutton_mouseheld"), 12519);
          ScoreboardNameRecord.field_d.disabledFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "backbutton_disabled"), 12519);
          FaceNormal.field_c.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "gameoptionbutton"), 12519);
          FaceNormal.field_c.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "gameoptionbutton_mouseover"), 12519);
          if (param1) {
            return;
          }
          dupTemp$1 = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "gameoptionbutton_active"), 12519);
          FaceNormal.field_c.selectedFrameSprites = dupTemp$1;
          FaceNormal.field_c.capturedFrameSprites = dupTemp$1;
          FaceNormal.field_c.disabledFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "gameoptionbutton_disabled"), 12519);
          AchievementSubmission.field_l.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "chatbutton"), 12519);
          AchievementSubmission.field_l.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "chatbutton_mouseover"), 12519);
          dupTemp$2 = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "chatbutton_active"), 12519);
          AchievementSubmission.field_l.selectedFrameSprites = dupTemp$2;
          AchievementSubmission.field_l.capturedFrameSprites = dupTemp$2;
          TutorialFactory.field_d.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "chatfilterbutton"), 12519);
          TutorialFactory.field_d.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "chatfilterbutton_mouseover"), 12519);
          dupTemp$3 = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "chatfilterbutton_active"), 12519);
          TutorialFactory.field_d.selectedFrameSprites = dupTemp$3;
          TutorialFactory.field_d.capturedFrameSprites = dupTemp$3;
          var17 = NameEntryPopup.loadSpritesByName(0, "lobby", param4, "checkbox");
          ChoiceButtonSupport.field_e = new StateIconLabel(0L, var17[1], var17[0], 1, UiWidget.field_A, (String) null);
          LabeledChildWidget.field_R = new UiComponent(0L, (UiComponent) null);
          LabeledChildWidget.field_R.frameSprites = NodeHashTableIterator.createCenterOnlyFrameSprites(-32344, WidgetStyleLayer.loadSprite("lobby", (byte) 121, "slideregion", param4));
          LabeledChildWidget.field_R.activeFrameSprites = NodeHashTableIterator.createCenterOnlyFrameSprites(-32344, WidgetStyleLayer.loadSprite("lobby", (byte) 74, "slideregion_mouseover", param4));
          LabeledChildWidget.field_R.capturedFrameSprites = NodeHashTableIterator.createCenterOnlyFrameSprites(-32344, WidgetStyleLayer.loadSprite("lobby", (byte) 47, "slideregion_mouseheld", param4));
          LabeledChildWidget.field_R.disabledFrameSprites = NodeHashTableIterator.createCenterOnlyFrameSprites(-32344, WidgetStyleLayer.loadSprite("lobby", (byte) 95, "slideregion_disabled", param4));
          ArchiveRequest.field_y = new UiComponent(0L, (UiComponent) null);
          ArchiveRequest.field_y.frameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "dragbar"), 12519);
          ArchiveRequest.field_y.activeFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "dragbar_mouseover"), 12519);
          ArchiveRequest.field_y.capturedFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "dragbar_mouseheld"), 12519);
          ArchiveRequest.field_y.disabledFrameSprites = CachedArchiveSource.a(NameEntryPopup.loadSpritesByName(0, "lobby", param4, "dragbar_disabled"), 12519);
          RasterStateSupport.field_a = new UiComponent(0L, (UiComponent) null);
          RasterStateSupport.field_a.sprite = WidgetStyleLayer.loadSprite("lobby", (byte) 86, "upbutton", param4);
          RasterStateSupport.field_a.activeSprite = WidgetStyleLayer.loadSprite("lobby", (byte) 111, "upbutton_mouseover", param4);
          RasterStateSupport.field_a.capturedSprite = WidgetStyleLayer.loadSprite("lobby", (byte) 64, "upbutton_mouseheld", param4);
          RasterStateSupport.field_a.disabledSprite = WidgetStyleLayer.loadSprite("lobby", (byte) 97, "upbutton_disabled", param4);
          ByteRecordSubmission.field_r = new UiComponent(0L, (UiComponent) null);
          ByteRecordSubmission.field_r.sprite = WidgetStyleLayer.loadSprite("lobby", (byte) 73, "downbutton", param4);
          ByteRecordSubmission.field_r.activeSprite = WidgetStyleLayer.loadSprite("lobby", (byte) 88, "downbutton_mouseover", param4);
          ByteRecordSubmission.field_r.capturedSprite = WidgetStyleLayer.loadSprite("lobby", (byte) 105, "downbutton_mouseheld", param4);
          ByteRecordSubmission.field_r.disabledSprite = WidgetStyleLayer.loadSprite("lobby", (byte) 94, "downbutton_disabled", param4);
          RasterBuffer.field_f = new VerticalScrollbar(0L, RasterStateSupport.field_a, ByteRecordSubmission.field_r, LabeledChildWidget.field_R, ArchiveRequest.field_y);
          HighscoresScreen.field_J = new ScrollPaneWithFooter(0L, (UiComponent) null, AlternateLongAndTextLoginPayload.field_n, RasterBuffer.field_f, ButtonPainter.field_a, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("ap.G(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final void decodeOpcode(int opcode, PacketBuffer buffer, byte obfuscationGuard) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        QuickChatDynamicCommand var7 = null;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          if (obfuscationGuard >= -16) {
            retry = (String) null;
          }
          if (opcode != 1) {
            if (opcode == 2) {
              var4_int = buffer.readUnsignedByte(-105);
              this.field_C = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_C[var5] = buffer.readUnsignedShort(-1034);
              }
            } else if (opcode == 3) {
              var4_int = buffer.readUnsignedByte(-107);
              this.field_x = new int[var4_int][];
              this.field_z = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                var6 = buffer.readUnsignedShort(-1034);
                var7 = BallSkin.findDynamicCommand(var6, -124);
                if (var7 != null) {
                  this.field_z[var5] = var6;
                  array$0 = new int[var7.field_b];
                  this.field_x[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_b; var8++) {
                    this.field_x[var5][var8] = buffer.readUnsignedShort(-1034);
                  }
                }
              }
            } else {
              if (4 != opcode) {
                return;
              }
            }
          } else {
            this.field_A = AppletUrlSupport.splitString(30634, buffer.readNullTerminatedString(-25), '<');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("ap.B(").append(opcode).append(',');
          if (buffer == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_B = new int[8192];
        retry = "Retry";
        field_G = 320;
        field_w = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }
}
