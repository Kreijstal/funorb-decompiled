/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecompressor {
    static String tutorial4;
    private java.util.zip.Inflater field_c;
    static String field_e;
    static String field_b;
    static SpriteWidget field_d;

    final static boolean containsNonAlphanumeric(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        IndexedSprite[] var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != -685) {
            var5 = (IndexedSprite[]) null;
            GzipDecompressor.loadLobbyResources((Js5Archive) null, (byte) -118, (int[]) null, (Js5Archive) null, (IndexedSprite[]) null);
          }
          for (var2_int = 0; var2_int < param1.length(); var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!CachedTextLayout.isAsciiLetter((char) var3, false) &&
              !DualLinkHashTable.isAsciiDigit(0, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void openLobbyEntryContextMenu(LobbyGame param0, int param1, boolean param2, String param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        PlayerContextMenu var7 = null;
        String var8 = null;
        PlayerContextMenu var9 = null;
        String var10 = null;
        PlayerContextMenu var11 = null;
        String var12 = null;
        PlayerContextMenu var13 = null;
        try {
          ContextMenuHelpers.openContextMenu(-1, DisplayModeInfo.field_a, (int[]) null, (String) null, 0L, (String) null, param0.getGameId((byte) -124), param0, 60);
          if (param0.field_kc && (2 == param0.field_lc ||
            !(2 > ReflectionCheckHelpers.field_d))) {
            var7 = IntKeyLookup.field_e;
            var8 = MenuScreen.formatIndexedText(new String[]{param3}, LobbyJoinTextGlobals.field_b, 2);
            var7.field_a.addItem(1, var8, 10);
          }
          IntKeyLookup.field_e.addRoomAdmissionActions((byte) 102);
          if (param2) {
            if (IntKeyLookup.field_e.field_b == AudioSetupHelpers.field_b) {
              var11 = IntKeyLookup.field_e;
              var12 = MenuScreen.formatIndexedText(new String[]{param3}, AsyncCheckResult.field_g, param1 ^ 17302);
              var11.field_a.addItem(param1 - 17299, var12, 16);
            } else {
              var9 = IntKeyLookup.field_e;
              var10 = MenuScreen.formatIndexedText(new String[]{param3}, VerticalScrollbar.field_Gb, param1 - 17298);
              var9.field_a.addItem(1, var10, 15);
            }
          }
          var13 = IntKeyLookup.field_e;
          var5 = HuffmanCodec.field_b;
          var6 = PasswordFieldPainter.field_y;
          if (param1 != 17300) {
            field_e = (String) null;
          }
          var13.field_a.openAt(0, 0, 0, var5, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("jd.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_e = null;
        if (!param0) {
          return;
        }
        tutorial4 = null;
        field_d = null;
        field_b = null;
    }

    public GzipDecompressor() {
        this(-1, 1000000, 1000000);
    }

    final static void loadLobbyResources(Js5Archive param0, byte param1, int[] param2, Js5Archive param3, IndexedSprite[] param4) {
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
        SpriteWidget var8 = null;
        SpriteWidget var9 = null;
        SpriteWidget var10 = null;
        SpriteWidget var11 = null;
        Sprite[] var12 = null;
        Sprite[] var13 = null;
        Sprite[] var14 = null;
        SpriteWidget var15 = null;
        Sprite[] var16 = null;
        Sprite[] var17 = null;
        int var7_intLifetime1;
        var18 = Virogrid.field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var20 = WidgetNode.loadIndexedSpritesByName("crowns", "lobby", param3, 32370);
          var5 = var20;
          ClientEnvironmentHelpers.field_a = var20.length;
          if (param4 != null) {
            var6_array = new IndexedSprite[param4.length + ClientEnvironmentHelpers.field_a];
            for (var7_int = 0; ClientEnvironmentHelpers.field_a > var7_int; var7_int++) {
              var6_array[var7_int] = var20[var7_int];
            }
            var5 = var6_array;
            for (var7_int = 0; param4.length > var7_int; var7_int++) {
              var6_array[var7_int + ClientEnvironmentHelpers.field_a] = param4[var7_int];
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
            decompiledFrameRemainder0 = !(ClientEnvironmentHelpers.field_a <= var7_int);
            if (decompiledFrameRemainder0) {
              var23[var7_int] = 10;
              var7_int++;
            }
          }
          if (decompiledFrameRemainder0) {
            while (ClientEnvironmentHelpers.field_a > var7_int) {
              var23[var7_int] = 10;
              var7_int++;
            }
          }
          if (param4 != null) {
            if (param2 != null) {
              for (var7_intLifetime1 = 0; var7_intLifetime1 < param4.length; var7_intLifetime1++) {
                var6[var7_intLifetime1 + ClientEnvironmentHelpers.field_a] = param2[var7_intLifetime1];
              }
            } else {
              for (var7_intLifetime1 = 0; var7_intLifetime1 < param4.length; var7_intLifetime1++) {
                var6[var7_intLifetime1 + ClientEnvironmentHelpers.field_a] = param4[var7_intLifetime1].field_i;
              }
            }
          }
          CanvasPresentHelpers.field_j = 2;
          ConnectionStage.field_b = 2;
          TriangleSortHelpers.field_e = 11;
          PopupMenuDrawHelpers.field_d = 4;
          LobbySortHelpers.field_e = 15;
          var7 = PasswordFieldPainter.loadFontByName("lobby", param3, -95, "largefont", param0);
          Bzip2State.generalFont = PasswordFieldPainter.loadFontByName("lobby", param3, -63, "generalfont", param0);
          TooltipAndOptionsHelpers.chatFont = PasswordFieldPainter.loadFontByName("lobby", param3, -56, "chatfont", param0);
          var7.setInlineSprites(var5, var24);
          Bzip2State.generalFont.setInlineSprites(var5, var24);
          TooltipAndOptionsHelpers.chatFont.setInlineSprites(var5, var24);
          var8 = new SpriteWidget(0L, (SpriteWidget) null);
          var8.field_C = (BitmapFont) ((Object) var7);
          var8.field_fb = LobbySortHelpers.field_e;
          var8.field_E = 16777215;
          var8.field_D = 1;
          var9 = var8;
          var9.field_lb = 1;
          var10 = new SpriteWidget(0L, (SpriteWidget) null);
          var10.field_E = 16777215;
          var10.field_fb = LobbySortHelpers.field_e;
          var10.field_C = (BitmapFont) ((Object) Bzip2State.generalFont);
          var11 = var10;
          var10.field_D = 1;
          var11.field_lb = 1;
          ClientServiceHelpers.field_b = new SpriteWidget(0L, var8);
          ClientServiceHelpers.field_b.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "heading"), 0);
          MidiNote.field_m = new SpriteWidget(0L, (SpriteWidget) null);
          MidiNote.field_m.field_vb = AudioPumpThread.createGradientTabSprites(4210752, 124, 120, 8421504, false, false);
          IntrusiveDeque.field_a = new SpriteWidget(0L, (SpriteWidget) null);
          IntrusiveDeque.field_a.field_vb = StatusAndUrlHelpers.createGradientFrameSprites(114, 3, 1, (byte) 106, 6316128, 6316128);
          InputSetupHelpers.field_f = new SpriteWidget(0L, (SpriteWidget) null);
          InputSetupHelpers.field_f.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "popup"), 0);
          var12 = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "popup_mouseover"), 0);
          var13 = WidgetNode.loadSpritesByName(32, param3, "lobby", "button");
          var14 = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "tab_active"), 0);
          ByteStorage.field_a = new SpriteWidget(0L, var8);
          ByteStorage.field_a.field_vb = var14;
          IterableDualLinkDeque.field_b = new SpriteWidget(0L, (SpriteWidget) null);
          IterableDualLinkDeque.field_b.normalSprite = PasswordValidator.loadSpriteByName(param3, "closebutton", "lobby", false);
          IterableDualLinkDeque.field_b.mouseOverSprite = PasswordValidator.loadSpriteByName(param3, "closebutton_mouseover", "lobby", false);
          MouseInputHandler.field_c = new SpriteWidget(0L, var8);
          MouseInputHandler.field_c.field_vb = AudioPumpThread.createGradientTabSprites(2039583, -78, 40, 3815994, true, true);
          DelegatingCanvas.field_d = new SpriteWidget(0L, var10);
          DelegatingCanvas.field_d.field_z = 2;
          DelegatingCanvas.field_d.field_vb = AudioPumpThread.createGradientTabSprites(2039583, 71, 30, 3815994, false, true);
          LobbyLayout.field_b = new SpriteWidget(0L, var10);
          LobbyLayout.field_b.field_z = 2;
          LobbyLayout.field_b.field_vb = AudioPumpThread.createGradientTabSprites(2039583, -93, 30, 3815994, false, false);
          LobbyGame.field_Jb = new SpriteWidget(0L, var10);
          LobbyGame.field_Jb.field_z = 2;
          LobbyGame.field_Jb.field_vb = AudioPumpThread.createGradientTabSprites(2039583, -17, 30, 3815994, true, false);
          LinkTextPainter.field_h = new SpriteWidget(0L, (SpriteWidget) null);
          LinkTextPainter.field_h.field_E = 13421772;
          LinkTextPainter.field_h.field_C = (BitmapFont) ((Object) Bzip2State.generalFont);
          if (param1 <= 17) {
            return;
          }
          LinkTextPainter.field_h.field_D = 1;
          LinkTextPainter.field_h.field_fb = LobbySortHelpers.field_e;
          IntrusiveDequeCursor.field_e = new SpriteWidget(0L, LinkTextPainter.field_h);
          IntrusiveDequeCursor.field_e.field_E = 16764006;
          IntrusiveDequeCursor.field_e.field_db = 8421504;
          IntrusiveDequeCursor.field_e.field_ab = 16777215;
          IntrusiveDequeCursor.field_e.field_bb = 16777215;
          IntrusiveDequeCursor.field_e.field_A = 16777215;
          var15 = new SpriteWidget(0L, IntrusiveDequeCursor.field_e);
          var15.field_E = 16777215;
          var15.field_C = (BitmapFont) ((Object) var7);
          var15.field_fb = LobbySortHelpers.field_e;
          QueuedResultSubmission.field_n = new SpriteWidget(0L, LinkTextPainter.field_h);
          QueuedResultSubmission.field_n.field_vb = AudioPumpThread.createGradientTabSprites(2236962, -38, 16, 2236962, false, false);
          QueuedResultSubmission.field_n.field_z = 2;
          WidgetNode.field_u = new SpriteWidget(0L, LinkTextPainter.field_h);
          WidgetNode.field_u.field_vb = AudioPumpThread.createGradientTabSprites(1513239, 99, 16, 1513239, false, false);
          WidgetNode.field_u.field_z = 2;
          field_d = new SpriteWidget(0L, QueuedResultSubmission.field_n);
          field_d.applyStyle(18003, IntrusiveDequeCursor.field_e);
          FadingModalPanel.field_F = new SpriteWidget(0L, WidgetNode.field_u);
          FadingModalPanel.field_F.applyStyle(18003, IntrusiveDequeCursor.field_e);
          var16 = WidgetNode.loadSpritesByName(32, param3, "lobby", "button_mouseover");
          ChatFilterHelpers.field_f = new ContextMenu(InputSetupHelpers.field_f, var12, LinkTextPainter.field_h, IntrusiveDequeCursor.field_e, 3, 2, ConnectionStage.field_b, 3, LobbySortHelpers.field_e);
          NetworkGameClient.field_y = new SpriteWidget(0L, IntrusiveDequeCursor.field_e);
          NetworkGameClient.field_y.field_x = var16;
          NetworkGameClient.field_y.field_vb = var13;
          NetworkGameClient.field_y.field_O = 1;
          NetworkGameClient.field_y.field_hb = 1;
          NetworkGameClient.field_y.field_R = 1;
          NetworkGameClient.field_y.field_zb = 1;
          NetworkGameClient.field_y.field_T = WidgetNode.loadSpritesByName(32, param3, "lobby", "button_mouseheld");
          NetworkGameClient.field_y.field_cb = WidgetNode.loadSpritesByName(32, param3, "lobby", "button_active");
          NetworkGameClient.field_y.field_L = WidgetNode.loadSpritesByName(32, param3, "lobby", "button_disabled");
          NetworkGameClient.field_y.field_lb = 1;
          EmailValidator.field_w = new SpriteWidget(0L, IntrusiveDequeCursor.field_e);
          EmailValidator.field_w.field_lb = 1;
          EmailValidator.field_w.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "tab_inactive"), 0);
          EmailValidator.field_w.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "tab_mouseover"), 0);
          EmailValidator.field_w.field_cb = var14;
          WeightedLruCache.field_h = new SpriteWidget(0L, (SpriteWidget) null);
          WeightedLruCache.field_h.field_vb = StatusAndUrlHelpers.createGradientFrameSprites(206, 3, -1, (byte) 106, 1127256, 1856141);
          TextFieldPainter.field_w = new SpriteWidget(0L, (SpriteWidget) null);
          TextFieldPainter.field_w.field_vb = StatusAndUrlHelpers.createGradientFrameSprites(290, 3, -1, (byte) 106, 6052956, 11579568);
          LoginMethodHelpers.field_b = new SpriteWidget(0L, var15);
          LoginMethodHelpers.field_b.field_zb = 1;
          LoginMethodHelpers.field_b.field_lb = 1;
          LoginMethodHelpers.field_b.field_O = 1;
          LoginMethodHelpers.field_b.field_hb = 1;
          LoginMethodHelpers.field_b.field_R = 1;
          PendingSubmission.field_n = new SpriteWidget(0L, LoginMethodHelpers.field_b);
          IterableDualLinkDeque.field_c = new SpriteWidget(0L, IntrusiveDequeCursor.field_e);
          IterableDualLinkDeque.field_c.field_lb = 1;
          IterableDualLinkDeque.field_c.field_O = 1;
          IterableDualLinkDeque.field_c.field_hb = 1;
          IterableDualLinkDeque.field_c.field_R = 1;
          IterableDualLinkDeque.field_c.field_zb = 1;
          UiTheme.field_a = new SpriteWidget(0L, IterableDualLinkDeque.field_c);
          DualLinkHashTable.field_g = new SpriteWidget(0L, IterableDualLinkDeque.field_c);
          NanoTickClock.field_j = new SpriteWidget(0L, LoginMethodHelpers.field_b);
          CredentialHelpers.field_a = new SpriteWidget(0L, IterableDualLinkDeque.field_c);
          ArchiveRequest.field_r = new SpriteWidget(0L, IterableDualLinkDeque.field_c);
          EmailDomainValidationHelpers.field_e = new SpriteWidget(0L, IterableDualLinkDeque.field_c);
          IterableDualLinkDeque.field_c.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "smallbutton"), 0);
          IterableDualLinkDeque.field_c.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "smallbutton_mouseover"), 0);
          dupTemp$0 = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "smallbutton_active"), 0);
          IterableDualLinkDeque.field_c.field_cb = dupTemp$0;
          IterableDualLinkDeque.field_c.field_T = dupTemp$0;
          IterableDualLinkDeque.field_c.field_L = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "smallbutton_disabled"), 0);
          PendingSubmission.field_n.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "mediumbutton"), 0);
          PendingSubmission.field_n.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "mediumbutton_mouseover"), 0);
          PendingSubmission.field_n.field_T = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "mediumbutton_mouseheld"), 0);
          LoginMethodHelpers.field_b.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "bigbutton"), 0);
          LoginMethodHelpers.field_b.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "bigbutton_mouseover"), 0);
          LoginMethodHelpers.field_b.field_T = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "bigbutton_mouseheld"), 0);
          LoginMethodHelpers.field_b.field_L = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "bigbutton_disabled"), 0);
          UiTheme.field_a.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "greenbutton"), 0);
          UiTheme.field_a.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "greenbutton_mouseover"), 0);
          UiTheme.field_a.field_T = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "greenbutton_mouseheld"), 0);
          DualLinkHashTable.field_g.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "redbutton"), 0);
          DualLinkHashTable.field_g.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "redbutton_mouseover"), 0);
          DualLinkHashTable.field_g.field_T = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "redbutton_mouseheld"), 0);
          NanoTickClock.field_j.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "backbutton"), 0);
          NanoTickClock.field_j.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "backbutton_mouseover"), 0);
          NanoTickClock.field_j.field_T = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "backbutton_mouseheld"), 0);
          NanoTickClock.field_j.field_L = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "backbutton_disabled"), 0);
          EmailDomainValidationHelpers.field_e.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "gameoptionbutton"), 0);
          EmailDomainValidationHelpers.field_e.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "gameoptionbutton_mouseover"), 0);
          dupTemp$1 = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "gameoptionbutton_active"), 0);
          EmailDomainValidationHelpers.field_e.field_cb = dupTemp$1;
          EmailDomainValidationHelpers.field_e.field_T = dupTemp$1;
          EmailDomainValidationHelpers.field_e.field_L = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "gameoptionbutton_disabled"), 0);
          CredentialHelpers.field_a.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "chatbutton"), 0);
          CredentialHelpers.field_a.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "chatbutton_mouseover"), 0);
          dupTemp$2 = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "chatbutton_active"), 0);
          CredentialHelpers.field_a.field_cb = dupTemp$2;
          CredentialHelpers.field_a.field_T = dupTemp$2;
          ArchiveRequest.field_r.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "chatfilterbutton"), 0);
          ArchiveRequest.field_r.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "chatfilterbutton_mouseover"), 0);
          dupTemp$3 = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "chatfilterbutton_active"), 0);
          ArchiveRequest.field_r.field_cb = dupTemp$3;
          ArchiveRequest.field_r.field_T = dupTemp$3;
          var17 = WidgetNode.loadSpritesByName(32, param3, "lobby", "checkbox");
          ValidatedTextWidget.field_Z = new IconLabelWidget(0L, var17[1], var17[0], 1, IntrusiveDequeCursor.field_e, (String) null);
          GameKeyHandler.field_b = new SpriteWidget(0L, (SpriteWidget) null);
          GameKeyHandler.field_b.field_vb = ArchiveLoadSequence.centerOnlyPanelSlices(109, PasswordValidator.loadSpriteByName(param3, "slideregion", "lobby", false));
          GameKeyHandler.field_b.field_x = ArchiveLoadSequence.centerOnlyPanelSlices(125, PasswordValidator.loadSpriteByName(param3, "slideregion_mouseover", "lobby", false));
          GameKeyHandler.field_b.field_T = ArchiveLoadSequence.centerOnlyPanelSlices(91, PasswordValidator.loadSpriteByName(param3, "slideregion_mouseheld", "lobby", false));
          GameKeyHandler.field_b.field_L = ArchiveLoadSequence.centerOnlyPanelSlices(63, PasswordValidator.loadSpriteByName(param3, "slideregion_disabled", "lobby", false));
          TextHotspot.field_p = new SpriteWidget(0L, (SpriteWidget) null);
          TextHotspot.field_p.field_vb = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "dragbar"), 0);
          TextHotspot.field_p.field_x = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "dragbar_mouseover"), 0);
          TextHotspot.field_p.field_T = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "dragbar_mouseheld"), 0);
          TextHotspot.field_p.field_L = LobbyGame.resetSpriteOffsets(WidgetNode.loadSpritesByName(32, param3, "lobby", "dragbar_disabled"), 0);
          BirthDateEntryPanel.field_K = new SpriteWidget(0L, (SpriteWidget) null);
          BirthDateEntryPanel.field_K.normalSprite = PasswordValidator.loadSpriteByName(param3, "upbutton", "lobby", false);
          BirthDateEntryPanel.field_K.mouseOverSprite = PasswordValidator.loadSpriteByName(param3, "upbutton_mouseover", "lobby", false);
          BirthDateEntryPanel.field_K.mouseHeldSprite = PasswordValidator.loadSpriteByName(param3, "upbutton_mouseheld", "lobby", false);
          BirthDateEntryPanel.field_K.disabledSprite = PasswordValidator.loadSpriteByName(param3, "upbutton_disabled", "lobby", false);
          QuickChatOpenHelpers.field_d = new SpriteWidget(0L, (SpriteWidget) null);
          QuickChatOpenHelpers.field_d.normalSprite = PasswordValidator.loadSpriteByName(param3, "downbutton", "lobby", false);
          QuickChatOpenHelpers.field_d.mouseOverSprite = PasswordValidator.loadSpriteByName(param3, "downbutton_mouseover", "lobby", false);
          QuickChatOpenHelpers.field_d.mouseHeldSprite = PasswordValidator.loadSpriteByName(param3, "downbutton_mouseheld", "lobby", false);
          QuickChatOpenHelpers.field_d.disabledSprite = PasswordValidator.loadSpriteByName(param3, "downbutton_disabled", "lobby", false);
          NetworkArchiveRequest.field_z = new VerticalScrollbar(0L, BirthDateEntryPanel.field_K, QuickChatOpenHelpers.field_d, GameKeyHandler.field_b, TextHotspot.field_p);
          FadingModalPanel.field_K = new ScrollPaneWithFooter(0L, (SpriteWidget) null, FadingModalPanel.field_M, NetworkArchiveRequest.field_z, IterableDualLinkDeque.field_c, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("jd.E(");
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
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final void inflateGzip(byte param0, byte[] param1, PacketBuffer param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 50) {
              tutorial4 = (String) null;
            }
            if (param2.payload[param2.position] == 31 &&
              param2.payload[1 + param2.position] == -117) {
              if (this.field_c == null) {
                this.field_c = new java.util.zip.Inflater(true);
              }
              try {
                this.field_c.setInput(param2.payload, 10 + param2.position, param2.payload.length - 10 + (-param2.position - 8));
                this.field_c.inflate(param1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_c.reset();
                throw new RuntimeException("");
              }
              this.field_c.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("jd.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void setSettingsCookie(int param0, String param1, java.applet.Applet param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            NamedTextResourceHelpers.field_a = param1;
            try {
              var6 = param2.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              if (param0 > -13) {
                field_d = (SpriteWidget) null;
              }
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (0 == param1.length()) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var7 + "; Expires=" + SocialListEntry.formatGmtTimestamp(94608000000L + ClockAndTextHelpers.monotonicMillis(-9986), (byte) 122) + "; Max-Age=" + 94608000L;
              }
              JavaScriptBridge.evaluateScript("document.cookie=\"" + var5Lifetime6 + "\"", -17107, param2);
            } catch (Throwable throwable) {
            }
            RasterBuffer.updatePageLinks(param2, 49);
          } catch (RuntimeException runtimeException) {
            throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private GzipDecompressor(int param0, int param1, int param2) {
    }

    static int bitXor(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void setLayoutCenter(int param0, int param1, int param2) {
        LongAndTextCredentials.field_g = param2;
        FadeLayer.field_I = param0;
        if (param1 != 11) {
          field_e = (String) null;
        }
    }

    static {
        tutorial4 = "Dominate the grid<br>to achieve victory!";
        field_e = "Enter name of friend to add to list";
    }
}
