/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCommandType {
    static ValidationState field_h;
    int field_d;
    static String[] field_g;
    int field_c;
    static DualLinkNodeHashTable field_a;
    static int[] field_f;
    static Sprite field_b;
    static DualLinkNodeHashTable field_e;

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_g = null;
        field_e = null;
        field_h = null;
        field_f = null;
        field_b = null;
        if (!param0) {
          field_e = (DualLinkNodeHashTable) null;
        }
    }

    final static void initializeQuickChat(Archive param0, BitmapFont param1, int param2) {
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        QuickChatCategory var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        BitmapFont var12 = null;
        int[] var16 = null;
        var9 = TetraLink.field_J;
        try {
          var3_int = Js5Transport.field_l;
          ValidationMessageWidget.field_bb = new UiComponent(0L, (UiComponent) null);
          if (param0 == null) {
            var10 = (Throwable) null;
            HotspotTextWidget.reportClientError(-96, (Throwable) null, "QC1");
            return;
          }
          param0.field_f = false;
          param0.field_d = 0;
          NameSuggestionsPanel.field_U = new QuickChatCategoryCache(var3_int, param0, param0);
          QueuedStatSubmission.field_p = new QuickChatPhraseCache(var3_int, param0, param0, new DefaultQuickChatContext());
          var4 = MusicPatchPcmStream.findFirstActiveDefinition(false);
          if (var4 == null) {
            var11 = (Throwable) null;
            HotspotTextWidget.reportClientError(-124, (Throwable) null, "QC2");
            return;
          }
          MenuThemeHelpers.setSinglePhraseCategory(-1, var4);
          var12 = (BitmapFont) null;
          TriangleSpanHelpers.field_a = WeightedLruCache.createThemedWidget(1513239, (BitmapFont) null, 5138823, 4020342, (byte) -120, 65793, 65793, 2245737, 1127256, 65793, 8947848, 1513239, 0);
          WeightedLruCache.field_b = WeightedLruCache.createThemedWidget(0, param1, 0, 0, (byte) -120, 0, 0, 0, 0, 0, 0, 0, 16764006);
          PacketDiagnosticsHelpers.field_n = WeightedLruCache.createThemedWidget(0, param1, 0, 0, (byte) -120, 0, 0, 0, 0, 0, 0, 0, 16777215);
          if (param2 < 54) {
            field_e = (DualLinkNodeHashTable) null;
          }
          var5 = SoftwareRasterizer.field_f;
          var6 = SoftwareRasterizer.field_e;
          var16 = SoftwareRasterizer.field_b;
          ValidationStatusIcon.field_R = new Sprite(10, 14);
          ValidationStatusIcon.field_R.makeRasterTarget();
          for (var8 = 2; 7 > var8; var8++) {
            SoftwareRasterizer.drawVerticalLine(var8, 1 + var8, -(var8 << 1) + 14, 16777215);
          }
          SoftwareRasterizer.setTarget(var16, var5, var6);
          NetworkArchiveRequest.field_F = QuickChatMenuFactory.createQuickChatMenu(-122, TriangleSpanHelpers.field_a, var4, PacketDiagnosticsHelpers.field_n, WeightedLruCache.field_b);
          ValidationMessageWidget.field_bb.field_fb = new IntrusiveDeque();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("db.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void layoutLobbyWidgets(int param0) {
        TextLayoutLine.field_c = SoftwareRasterizer.field_e;
        PendingStatQuery.field_n = SoftwareRasterizer.field_f;
        NodeHashTableIterator.layoutLobbySlidePanels((byte) -94);
        PasswordLoginCredentials.field_j.layoutPanel(0, 0, DateInputWidget.field_P.field_R - 40 - 2, param0 + 48, DateInputWidget.field_P.field_Hb);
        GameClock.field_e.setBounds((byte) -107, GameClock.field_f.field_Hb, 0, GameKeyHandler.field_d, 0);
        int var1 = 2 + GameKeyHandler.field_d;
        TextMetricsGlobals.field_c.setBounds((byte) -116, GameClock.field_f.field_Hb, IntroFinalFrameHelpers.field_b ? var1 : 0, GameClock.field_f.field_R - (IntroFinalFrameHelpers.field_b ? var1 : 0), 0);
        MidiPcmStream.layoutLobbyPanels(param0 ^ 1756);
        PasswordLoginCredentials.field_i.setBounds((byte) -87, DateInputWidget.field_P.field_Hb, DateInputWidget.field_P.field_R - 40, 40, 0);
        StatefulWidgetRenderer.field_r.setBounds((byte) -123, GameKeyHandler.field_c.field_Hb, 0, 30, 0);
        CanvasAndErrorHelpers.field_f.setBounds((byte) -90, GameKeyHandler.field_c.field_Hb, 30, GameKeyHandler.field_c.field_R - 40 - 32, 0);
        QueuedListRequest.field_A.setBounds((byte) -85, 68, 5, 30, param0);
        StrongCacheEntry.field_D.setBounds((byte) -86, 78, 5, 30, 75);
        AccountTextGlobals.field_a.setBounds((byte) -125, 48, 5, 30, 155);
        LruTextureCache.field_p.setBounds((byte) -121, 48, 5, 30, 205);
        int var2 = IntroFinalFrameHelpers.field_b ? 250 : 200;
        FlaggedTextValue.field_d.setBounds((byte) -107, 363 - var2, 5, 30, var2 + 5);
        LoadingScreenHelpers.field_g.setBounds((byte) -83, GameKeyHandler.field_c.field_Hb - 10 - 365, 5, 30, 370);
        NetworkGameClient.field_t.setBoundsAndLayout(CanvasAndErrorHelpers.field_f.field_Hb - 5 - 5, MouseInputHandler.field_e, -32 + (CanvasAndErrorHelpers.field_f.field_R - 10), true, 37, 5, 2);
        int var3 = (GameKeyHandler.field_c.field_Hb + 2) / 2;
        GameSession.field_q.setBounds((byte) -116, -2 + var3, GameKeyHandler.field_c.field_R - 40, 40, 0);
        if (!IntroFinalFrameHelpers.field_b) {
          var3 = 0;
        }
        IntrusiveDeque.field_e.setBounds((byte) -91, GameKeyHandler.field_c.field_Hb - var3, GameKeyHandler.field_c.field_R - 40, 40, var3);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    QuickChatCommandType(int param0, int param1, int param2, int param3) {
        this.field_c = param3;
        this.field_d = param0;
    }

    static {
        field_h = new ValidationState();
    }
}
