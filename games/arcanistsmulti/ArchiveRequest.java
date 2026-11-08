/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    volatile boolean field_p;
    static IntrusiveDeque field_o;
    boolean field_n;
    boolean field_q;
    static Sprite[] field_t;
    static String field_r;
    static String field_s;
    static int field_m;

    final static void loadLobbySprites(int param0, ResourceArchive param1, int[] param2, IndexedSprite[] param3, ResourceArchive param4) {
        Sprite[] dupTemp$0 = null;
        Sprite[] dupTemp$1 = null;
        Sprite[] dupTemp$2 = null;
        Sprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        int[] var6 = null;
        IndexedSprite[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        IndexedSprite[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        BinaryBitmapFont var7 = null;
        SceneWidget var8 = null;
        SceneWidget var9 = null;
        SceneWidget var10 = null;
        SceneWidget var11 = null;
        Sprite[] var12 = null;
        Sprite[] var13 = null;
        Sprite[] var14 = null;
        SceneWidget var15 = null;
        Sprite[] var16 = null;
        Sprite[] var17 = null;
        int var7_intLifetime1;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var20 = IterableNodeHashTable.loadIndexedSpritesByName("lobby", 0, "crowns", param1);
          var5 = var20;
          NameValidator.field_u = var20.length;
          if (param3 != null) {
            var6_array = new IndexedSprite[param3.length + NameValidator.field_u];
            for (var7_int = 0; var7_int < NameValidator.field_u; var7_int++) {
              var6_array[var7_int] = var20[var7_int];
            }
            var5 = var6_array;
            for (var7_int = 0; var7_int < param3.length; var7_int++) {
              var6_array[var7_int + NameValidator.field_u] = param3[var7_int];
            }
            var23 = new int[var5.length];
            var21 = var23;
            var19 = var21;
            var24 = var19;
            var22 = var24;
            var6 = var22;
            var7_int = 0;
          } else {
            var23 = new int[var5.length];
            var21 = var23;
            var19 = var21;
            var24 = var19;
            var22 = var24;
            var6 = var22;
            var7_int = 0;
            decompiledFrameRemainder0 = !(NameValidator.field_u <= var7_int);
            if (decompiledFrameRemainder0) {
              var23[var7_int] = 10;
              var7_int++;
            }
          }
          if (decompiledFrameRemainder0) {
            while (NameValidator.field_u > var7_int) {
              var23[var7_int] = 10;
              var7_int++;
            }
          }
          if (param3 != null) {
            if (param2 == null) {
              for (var7_intLifetime1 = 0; var7_intLifetime1 < param3.length; var7_intLifetime1++) {
                var6[var7_intLifetime1 + NameValidator.field_u] = param3[var7_intLifetime1].field_k;
              }
            } else {
              for (var7_intLifetime1 = 0; var7_intLifetime1 < param3.length; var7_intLifetime1++) {
                var6[var7_intLifetime1 + NameValidator.field_u] = param2[var7_intLifetime1];
              }
            }
          }
          ImageProducerRasterBuffer.field_r = 15;
          SceneTextInput.field_Gb = 4;
          MenuButtonPainter.field_p = 2;
          IntrusiveDequeCursor.field_i = 11;
          DateHelpers.field_h = 2;
          var7 = LoadingTracker.loadBinaryFont(param4, -24755, "lobby", "largefont", param1);
          DiskCacheRequest.field_w = LoadingTracker.loadBinaryFont(param4, param0 - 24755, "lobby", "generalfont", param1);
          NameTable.field_k = LoadingTracker.loadBinaryFont(param4, -24755, "lobby", "chatfont", param1);
          var7.setInlineSprites(var5, var24);
          DiskCacheRequest.field_w.setInlineSprites(var5, var24);
          NameTable.field_k.setInlineSprites(var5, var24);
          var8 = new SceneWidget(0L, (SceneWidget) null);
          var8.field_z = ImageProducerRasterBuffer.field_r;
          var8.field_ob = 16777215;
          var8.field_Z = (BitmapFont) ((Object) var7);
          var8.field_gb = 1;
          var9 = var8;
          var9.field_X = 1;
          var10 = new SceneWidget(0L, (SceneWidget) null);
          var10.field_Z = (BitmapFont) ((Object) DiskCacheRequest.field_w);
          var10.field_ob = 16777215;
          var10.field_z = ImageProducerRasterBuffer.field_r;
          var11 = var10;
          var10.field_gb = 1;
          var11.field_X = 1;
          PlayerInfoPanel.field_Pb = new SceneWidget(0L, var8);
          PlayerInfoPanel.field_Pb.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "heading", "lobby", 66), (byte) -86);
          FlagSumHelpers.field_b = new SceneWidget(0L, (SceneWidget) null);
          FlagSumHelpers.field_b.field_v = TimedMessage.createGradientButton(false, false, param0 ^ 652, 4210752, 8421504, 120);
          MouseWheelHandler.field_c = new SceneWidget(0L, (SceneWidget) null);
          MouseWheelHandler.field_c.field_v = GradientBarPainter.createGradientFrame(3, 114, 1, 1, 6316128, 6316128);
          MusicVolumeHelpers.field_a = new SceneWidget(0L, (SceneWidget) null);
          MusicVolumeHelpers.field_a.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "popup", "lobby", 69), (byte) -105);
          var12 = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "popup_mouseover", "lobby", param0 ^ 93), (byte) -105);
          var13 = QueuedPacket.loadSpriteSheet(param1, "button", "lobby", 63);
          var14 = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "tab_active", "lobby", 110), (byte) -85);
          SectorCacheStore.field_l = new SceneWidget(0L, var8);
          SectorCacheStore.field_l.field_v = var14;
          ColourBucketTable.field_b = new SceneWidget(0L, (SceneWidget) null);
          ColourBucketTable.field_b.field_W = BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "closebutton");
          ColourBucketTable.field_b.field_lb = BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "closebutton_mouseover");
          PasswordCheckHelpers.field_b = new SceneWidget(0L, var8);
          PasswordCheckHelpers.field_b.field_v = TimedMessage.createGradientButton(true, true, 652, 2039583, 3815994, 40);
          RawDataNode.field_u = new SceneWidget(0L, var10);
          RawDataNode.field_u.field_t = 2;
          RawDataNode.field_u.field_v = TimedMessage.createGradientButton(true, false, 652, 2039583, 3815994, 30);
          EditableTextWidget.field_S = new SceneWidget(0L, var10);
          EditableTextWidget.field_S.field_t = 2;
          EditableTextWidget.field_S.field_v = TimedMessage.createGradientButton(false, false, param0 ^ 652, 2039583, 3815994, 30);
          RawDataNode.field_i = new SceneWidget((long)param0, var10);
          RawDataNode.field_i.field_t = 2;
          RawDataNode.field_i.field_v = TimedMessage.createGradientButton(false, true, 652, 2039583, 3815994, 30);
          IntrusiveNode.field_c = new SceneWidget(0L, (SceneWidget) null);
          IntrusiveNode.field_c.field_ob = 13421772;
          IntrusiveNode.field_c.field_Z = (BitmapFont) ((Object) DiskCacheRequest.field_w);
          IntrusiveNode.field_c.field_z = ImageProducerRasterBuffer.field_r;
          IntrusiveNode.field_c.field_gb = 1;
          NameCheckHelpers.field_d = new SceneWidget(0L, IntrusiveNode.field_c);
          NameCheckHelpers.field_d.field_zb = 16777215;
          NameCheckHelpers.field_d.field_eb = 16777215;
          NameCheckHelpers.field_d.field_J = 16777215;
          NameCheckHelpers.field_d.field_ob = 16764006;
          NameCheckHelpers.field_d.field_sb = 8421504;
          var15 = new SceneWidget(0L, NameCheckHelpers.field_d);
          var15.field_z = ImageProducerRasterBuffer.field_r;
          var15.field_Z = (BitmapFont) ((Object) var7);
          var15.field_ob = 16777215;
          BevelBoxPainter.field_f = new SceneWidget(0L, IntrusiveNode.field_c);
          BevelBoxPainter.field_f.field_v = TimedMessage.createGradientButton(false, false, 652, 2236962, 2236962, 16);
          BevelBoxPainter.field_f.field_t = 2;
          SpellProjectile.field_A = new SceneWidget(0L, IntrusiveNode.field_c);
          SpellProjectile.field_A.field_v = TimedMessage.createGradientButton(false, false, 652, 1513239, 1513239, 16);
          SpellProjectile.field_A.field_t = 2;
          BattleScreen.field_E = new SceneWidget(0L, BevelBoxPainter.field_f);
          BattleScreen.field_E.applyStyle(NameCheckHelpers.field_d, (byte) 118);
          NoticeHelpers.field_j = new SceneWidget(0L, SpellProjectile.field_A);
          NoticeHelpers.field_j.applyStyle(NameCheckHelpers.field_d, (byte) 119);
          var16 = QueuedPacket.loadSpriteSheet(param1, "button_mouseover", "lobby", param0 + 91);
          BattleUnit.field_H = new ContextActionMenu(MusicVolumeHelpers.field_a, var12, IntrusiveNode.field_c, NameCheckHelpers.field_d, 3, 2, MenuButtonPainter.field_p, 3, ImageProducerRasterBuffer.field_r);
          EditableTextWidget.field_L = new SceneWidget(0L, NameCheckHelpers.field_d);
          EditableTextWidget.field_L.field_Y = 1;
          EditableTextWidget.field_L.field_wb = 1;
          EditableTextWidget.field_L.field_v = var13;
          EditableTextWidget.field_L.field_S = 1;
          EditableTextWidget.field_L.field_ib = 1;
          EditableTextWidget.field_L.field_Ab = var16;
          EditableTextWidget.field_L.field_xb = QueuedPacket.loadSpriteSheet(param1, "button_mouseheld", "lobby", 89);
          EditableTextWidget.field_L.field_hb = QueuedPacket.loadSpriteSheet(param1, "button_active", "lobby", param0 + 62);
          EditableTextWidget.field_L.field_K = QueuedPacket.loadSpriteSheet(param1, "button_disabled", "lobby", 117);
          EditableTextWidget.field_L.field_X = 1;
          StatsSendHelpers.field_c = new SceneWidget(0L, NameCheckHelpers.field_d);
          StatsSendHelpers.field_c.field_X = 1;
          StatsSendHelpers.field_c.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "tab_inactive", "lobby", 52), (byte) -124);
          StatsSendHelpers.field_c.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "tab_mouseover", "lobby", 50), (byte) -99);
          StatsSendHelpers.field_c.field_hb = var14;
          MatchingFieldValidator.field_t = new SceneWidget(0L, (SceneWidget) null);
          MatchingFieldValidator.field_t.field_v = GradientBarPainter.createGradientFrame(3, 206, param0 + 1, -1, 1856141, 1127256);
          RootInputHelpers.field_a = new SceneWidget(0L, (SceneWidget) null);
          RootInputHelpers.field_a.field_v = GradientBarPainter.createGradientFrame(3, 290, 1, -1, 11579568, 6052956);
          ListEntryMenuHelpers.field_h = new SceneWidget(0L, var15);
          ListEntryMenuHelpers.field_h.field_S = 1;
          ListEntryMenuHelpers.field_h.field_Y = 1;
          ListEntryMenuHelpers.field_h.field_wb = 1;
          ListEntryMenuHelpers.field_h.field_ib = 1;
          ListEntryMenuHelpers.field_h.field_X = 1;
          QuickChatPhraseCache.field_c = new SceneWidget(0L, ListEntryMenuHelpers.field_h);
          FrameClock.field_d = new SceneWidget(0L, NameCheckHelpers.field_d);
          FrameClock.field_d.field_ib = 1;
          FrameClock.field_d.field_S = 1;
          FrameClock.field_d.field_Y = 1;
          FrameClock.field_d.field_X = 1;
          FrameClock.field_d.field_wb = 1;
          BattleUnit.field_V = new SceneWidget(0L, FrameClock.field_d);
          ScrollContainer.field_S = new SceneWidget(0L, FrameClock.field_d);
          NameTable.field_c = new SceneWidget(0L, ListEntryMenuHelpers.field_h);
          BattleUnit.field_S = new SceneWidget(0L, FrameClock.field_d);
          MouseWheelHandler.field_d = new SceneWidget(0L, FrameClock.field_d);
          Battle.field_j = new SceneWidget(0L, FrameClock.field_d);
          FrameClock.field_d.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "smallbutton", "lobby", param0 + 45), (byte) -86);
          FrameClock.field_d.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "smallbutton_mouseover", "lobby", param0 ^ 107), (byte) -94);
          dupTemp$0 = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "smallbutton_active", "lobby", 90), (byte) -104);
          FrameClock.field_d.field_hb = dupTemp$0;
          FrameClock.field_d.field_xb = dupTemp$0;
          FrameClock.field_d.field_K = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "smallbutton_disabled", "lobby", 127), (byte) -117);
          QuickChatPhraseCache.field_c.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "mediumbutton", "lobby", 57), (byte) -83);
          QuickChatPhraseCache.field_c.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "mediumbutton_mouseover", "lobby", 89), (byte) -76);
          QuickChatPhraseCache.field_c.field_xb = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "mediumbutton_mouseheld", "lobby", param0 + 44), (byte) -73);
          ListEntryMenuHelpers.field_h.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "bigbutton", "lobby", 106), (byte) -121);
          ListEntryMenuHelpers.field_h.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "bigbutton_mouseover", "lobby", 124), (byte) -95);
          ListEntryMenuHelpers.field_h.field_xb = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "bigbutton_mouseheld", "lobby", 61), (byte) -107);
          ListEntryMenuHelpers.field_h.field_K = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "bigbutton_disabled", "lobby", 112), (byte) -87);
          BattleUnit.field_V.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "greenbutton", "lobby", 94), (byte) -78);
          BattleUnit.field_V.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "greenbutton_mouseover", "lobby", 43), (byte) -79);
          BattleUnit.field_V.field_xb = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "greenbutton_mouseheld", "lobby", param0 ^ 50), (byte) -118);
          ScrollContainer.field_S.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "redbutton", "lobby", 55), (byte) -93);
          ScrollContainer.field_S.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "redbutton_mouseover", "lobby", 86), (byte) -109);
          ScrollContainer.field_S.field_xb = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "redbutton_mouseheld", "lobby", 44), (byte) -115);
          NameTable.field_c.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "backbutton", "lobby", param0 + 107), (byte) -82);
          NameTable.field_c.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "backbutton_mouseover", "lobby", param0 ^ 107), (byte) -128);
          NameTable.field_c.field_xb = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "backbutton_mouseheld", "lobby", 76), (byte) -102);
          NameTable.field_c.field_K = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "backbutton_disabled", "lobby", 70), (byte) -113);
          Battle.field_j.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "gameoptionbutton", "lobby", 84), (byte) -128);
          Battle.field_j.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "gameoptionbutton_mouseover", "lobby", param0 + 67), (byte) -83);
          dupTemp$1 = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "gameoptionbutton_active", "lobby", 100), (byte) -93);
          Battle.field_j.field_hb = dupTemp$1;
          Battle.field_j.field_xb = dupTemp$1;
          Battle.field_j.field_K = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "gameoptionbutton_disabled", "lobby", 93), (byte) -114);
          BattleUnit.field_S.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "chatbutton", "lobby", 120), (byte) -112);
          BattleUnit.field_S.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "chatbutton_mouseover", "lobby", param0 ^ 94), (byte) -115);
          dupTemp$2 = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "chatbutton_active", "lobby", 104), (byte) -128);
          BattleUnit.field_S.field_hb = dupTemp$2;
          BattleUnit.field_S.field_xb = dupTemp$2;
          MouseWheelHandler.field_d.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "chatfilterbutton", "lobby", param0 ^ 127), (byte) -79);
          MouseWheelHandler.field_d.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "chatfilterbutton_mouseover", "lobby", 47), (byte) -105);
          dupTemp$3 = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "chatfilterbutton_active", "lobby", 49), (byte) -100);
          MouseWheelHandler.field_d.field_hb = dupTemp$3;
          MouseWheelHandler.field_d.field_xb = dupTemp$3;
          var17 = QueuedPacket.loadSpriteSheet(param1, "checkbox", "lobby", 63);
          SpriteFrame.field_g = new PairedSceneWidget(0L, var17[1], var17[0], 1, NameCheckHelpers.field_d, (String) null);
          QueuedPacket.field_m = new SceneWidget(0L, (SceneWidget) null);
          QueuedPacket.field_m.field_v = EmailValidationHelpers.createCentreOnlyFrame(115, BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "slideregion"));
          QueuedPacket.field_m.field_Ab = EmailValidationHelpers.createCentreOnlyFrame(82, BitAndSpriteHelpers.loadSprite("lobby", param0 ^ -22612, param1, "slideregion_mouseover"));
          QueuedPacket.field_m.field_xb = EmailValidationHelpers.createCentreOnlyFrame(param0 + 77, BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "slideregion_mouseheld"));
          QueuedPacket.field_m.field_K = EmailValidationHelpers.createCentreOnlyFrame(53, BitAndSpriteHelpers.loadSprite("lobby", param0 - 22612, param1, "slideregion_disabled"));
          SectorCacheStore.field_b = new SceneWidget(0L, (SceneWidget) null);
          SectorCacheStore.field_b.field_v = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "dragbar", "lobby", 113), (byte) -109);
          SectorCacheStore.field_b.field_Ab = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "dragbar_mouseover", "lobby", 85), (byte) -120);
          SectorCacheStore.field_b.field_xb = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "dragbar_mouseheld", "lobby", 73), (byte) -84);
          SectorCacheStore.field_b.field_K = SpriteTrimHelpers.clearTrimOffsets(QueuedPacket.loadSpriteSheet(param1, "dragbar_disabled", "lobby", 64), (byte) -102);
          RequestQueueHelpers.field_d = new SceneWidget(0L, (SceneWidget) null);
          RequestQueueHelpers.field_d.field_W = BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "upbutton");
          RequestQueueHelpers.field_d.field_lb = BitAndSpriteHelpers.loadSprite("lobby", param0 - 22612, param1, "upbutton_mouseover");
          RequestQueueHelpers.field_d.field_vb = BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "upbutton_mouseheld");
          RequestQueueHelpers.field_d.field_R = BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "upbutton_disabled");
          Crc32Helpers.field_b = new SceneWidget(0L, (SceneWidget) null);
          Crc32Helpers.field_b.field_W = BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "downbutton");
          Crc32Helpers.field_b.field_lb = BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "downbutton_mouseover");
          Crc32Helpers.field_b.field_vb = BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "downbutton_mouseheld");
          Crc32Helpers.field_b.field_R = BitAndSpriteHelpers.loadSprite("lobby", -22612, param1, "downbutton_disabled");
          IntrusiveDeque.field_i = new SceneScrollbar(0L, RequestQueueHelpers.field_d, Crc32Helpers.field_b, QueuedPacket.field_m, SectorCacheStore.field_b);
          ReflectionCheckRequest.field_r = new SceneListPanel(0L, (SceneWidget) null, ConnectionState.field_c, IntrusiveDeque.field_i, FrameClock.field_d, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("ve.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void initializeNetworking(byte param0, int param1, int param2, int param3, PlatformTaskDispatcher param4, int param5, int param6, int param7, String param8) {
        try {
          MainMenuDialog.field_Hb = param2;
          RasterSetupHelpers.field_g = param4;
          NameTextHelpers.field_a = param6;
          PlayerActionMenu.field_b = param5;
          BevelTextPainter.field_u = param1;
          GameSelectionHelpers.field_o = param7;
          QueuedPacket.field_h = param3;
          if (param0 > -55) {
            ArchiveRequest.releaseStatics(116);
          }
          IsaacRandom.field_g = param8;
          GrowableIntList.field_c = (Js5Transport) ((Object) new SocketJs5Transport());
          MainMenuDialog.field_yb = new DiskCacheWorker(param4);
          ValidationStatusIcon.field_O = new Js5ArchiveManager(GrowableIntList.field_c, MainMenuDialog.field_yb);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ve.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    abstract int getProgressPercent(byte param0);

    abstract byte[] getData(int param0);

    public static void releaseStatics(int param0) {
        field_s = null;
        field_t = null;
        field_r = null;
        if (param0 != 2039583) {
          return;
        }
        field_o = null;
    }

    final static void updateChatInput(int param0, boolean param1, byte param2) {
        int var4 = 0;
        int var3 = 0;
        int var3Lifetime1;
        if (null != Crc32Helpers.field_a) {
          var3 = Crc32Helpers.field_a.processInput(param1, (byte) 33);
          if (var3 != -2) {
            if (var3 != -1) {
              var4 = Crc32Helpers.field_a.isSendActive((byte) 122) ? 1 : 0;
              GameListHelpers.sendPrivateMessage(118, var4 != 0, Crc32Helpers.field_a.getText((byte) 51), Crc32Helpers.field_a.field_Fb, var3, param0);
            }
            Crc32Helpers.field_a = null;
            IntrusiveDequeCursor.closePlayerMenu(false);
          }
        }
        var3Lifetime1 = 66 / ((param2 + 32) / 62);
    }

    ArchiveRequest() {
        this.field_p = true;
    }

    static {
        field_o = new IntrusiveDeque();
        field_s = "<shad><col=<%0>>FLAME</col></shad>";
        field_r = "Offensive account name";
        field_m = -1;
    }
}
