/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleMesh {
    short[] field_A;
    short[] field_J;
    byte[] field_z;
    int[] field_M;
    short[] field_d;
    short[] field_D;
    short[] field_s;
    static AudioSetupHelpers field_v;
    int field_U;
    static int field_u;
    int[] field_R;
    int[] field_n;
    short[] field_t;
    int[] field_c;
    static SpriteWidget field_m;
    int field_T;
    short[] field_j;
    short[] field_e;
    short[] field_O;
    int field_p;
    short[] field_l;
    static ScrollPane field_r;
    short field_h;
    short[] field_S;
    short[] field_y;
    short field_k;
    short[] field_b;
    short[] field_K;
    static int field_F;
    static int[][] field_B;
    int field_C;
    static String field_Q;
    short field_i;
    short[] field_x;
    short[] field_G;
    int field_L;
    int[] field_E;
    int field_g;
    short[] field_I;
    int[] field_P;
    private boolean field_N;
    byte field_a;
    short[] field_H;
    int[] field_f;
    int[] field_o;
    int[] field_q;
    static Js5Archive field_w;

    final static void initializeLobbyUi(FrameSkin param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, FrameSkin param12, BitmapFont param13, BitmapFont param14, int param15, int param16, int param17, int param18, FrameSkin param19) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          GameOptions.field_n = param14;
          MouseTrailPoint.field_j = param13;
          TextMetricsGlobals.setTextLayoutMetrics(param7, (byte) -127, param9, param18, param4);
          FadingModalPanel.setDialogFrameStyle(param1, param19, true, param3);
          DualLinkHashTable.configureLobbyMetrics(param16 + param16, param6, param11, param5, param12, param0);
          GzipDecompressor.setLayoutCenter(param10, 11, param2);
          NetworkGameClient.setInterfaceColours(param17, param8, false, param15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_4_0 = var20;
          stackIn_4_1 = new StringBuilder().append("wm.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param13 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param14 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_w = null;
        if (param0 != 0) {
          return;
        }
        field_B = (int[][]) null;
        field_v = null;
        field_Q = null;
        field_m = null;
        field_r = null;
    }

    final void ensureBounds(byte param0) {
        int var9 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = Virogrid.field_F ? 1 : 0;
        var2 = -93 % ((56 - param0) / 45);
        if (this.field_N) {
          return;
        }
        this.field_N = true;
        var3 = 32767;
        var4 = 32767;
        var5 = 32767;
        var6 = -32768;
        var7 = -32768;
        var8 = -32768;
        for (var9 = 0; this.field_h > var9; var9++) {
          var10 = this.field_l[var9];
          var11 = this.field_b[var9];
          var12 = this.field_H[var9];
          if (var7 < var11) {
            var7 = var11;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var4 > var11) {
            var4 = var11;
          }
          if (var8 < var12) {
            var8 = var12;
          }
          if (var12 < var5) {
            var5 = var12;
          }
        }
        this.field_g = var4;
        this.field_T = var7;
        this.field_U = var3;
        this.field_L = var8;
        this.field_C = var6;
        this.field_p = var5;
    }

    final static FullscreenFocusCanvas openFullscreenCanvas(int param0, int param1, int param2, int param3, int param4, PlatformTaskDispatcher param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenFocusCanvas var7 = null;
        FrameSkin var8 = null;
        java.awt.Frame var9 = null;
        Object stackIn_4_0 = null;
        FullscreenFocusCanvas stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 5416) {
            var8 = (FrameSkin) null;
            TriangleMesh.initializeLobbyUi((FrameSkin) null, 78, 38, 112, -3, -72, -53, -93, -107, -23, -105, 2, (FrameSkin) null, (BitmapFont) null, (BitmapFont) null, 46, 115, -81, -51, (FrameSkin) null);
          }
          var9 = DialWidgetPainter.openFullscreenFrame(param3, param2, param5, param0, param1, false);
          var6 = var9;
          if (var9 == null) {
            stackIn_4_0 = null;
            return (FullscreenFocusCanvas) (stackIn_4_0);
          }
          var7 = new FullscreenFocusCanvas();
          var7.field_e = var9;
          var7.field_e.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param2);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("wm.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void commitScreenChange(byte param0) {
        TextDecodeHelpers.field_g = LobbySortHelpers.field_g;
        if (param0 != -86) {
          TriangleMesh.releaseStatics(-123);
        }
        ClientEnvironmentHelpers.field_l = 0;
        if (GameClock.field_c == MidiPcmStream.field_y) {
          return;
        }
        if (NanoTickClock.isNonNegative(param0 ^ -40, MidiPcmStream.field_y)) {
          DateOfBirthValidator.field_j[MidiPcmStream.field_y].releaseScreenAssets(-11308);
        }
        if (QuickChatPhraseDefinition.field_q) {
          DropTargetWidget.field_I = null;
          QuickChatPhraseDefinition.field_q = false;
          MusicPlaybackHelpers.field_b = null;
        }
        MidiPcmStream.field_y = GameClock.field_c;
        AccountTermsPanel.field_J = SoundPlaybackHelpers.field_e;
        if (DrawOfferMenuHelpers.field_e) {
          TriangleMesh.closeAllPopups(2);
          LobbySessionHelpers.disconnectLobby(-64);
          ResizableDialog.clearSocialLists((byte) 109);
          DrawOfferMenuHelpers.field_e = false;
        }
    }

    final static String getLoadingStatusText(byte param0) {
        if (!(2 <= PlayerContextMenu.field_n)) {
          return NameEntryPopup.field_Lb;
        }
        if (ArchiveIndex.field_l != null) {
          if (!ArchiveIndex.field_l.ensureIndexLoaded(0)) {
            return QuickChatHelpHelpers.field_d;
          }
          return GzipDecompressor.field_b;
        }
        if (!CanvasPresentHelpers.field_a.ensureIndexLoaded(0)) {
          return QuickChatHelpHelpers.field_c;
        }
        if (!CanvasPresentHelpers.field_a.ensureGroupAvailableByName((byte) -102, "commonui")) {
          return DiskCacheWorker.field_a + " - " + CanvasPresentHelpers.field_a.getGroupProgressByName("commonui", 85) + "%";
        }
        if (!GameOptions.field_j.ensureIndexLoaded(0)) {
          return IsaacRandom.field_d;
        }
        if (!GameOptions.field_j.ensureGroupAvailableByName((byte) -102, "commonui")) {
          return ClientEnvironmentHelpers.field_j + " - " + GameOptions.field_j.getGroupProgressByName("commonui", 103) + "%";
        }
        if (!DialWidget.field_I.ensureIndexLoaded(0)) {
          return SectorCacheStore.field_a;
        }
        if (param0 < 63) {
          return (String) null;
        }
        if (!DialWidget.field_I.areAllGroupsAvailable(25867)) {
          return LoadingTextGlobals.field_b + " - " + DialWidget.field_I.getOverallProgress(-2677) + "%";
        }
        return QuickChatCategoryCache.field_b;
    }

    final void translateVertices(int param0, int param1, int param2, byte param3) {
        int var6 = Virogrid.field_F ? 1 : 0;
        int var5 = 0;
        if (param3 < 39) {
          this.field_c = (int[]) null;
        }
        while (this.field_h > var5) {
          this.field_l[var5] = (short)(this.field_l[var5] + param1);
          this.field_b[var5] = (short)(this.field_b[var5] + param0);
          this.field_H[var5] = (short)(this.field_H[var5] + param2);
          var5++;
        }
        this.invalidateBounds(40);
    }

    final void scaleVertices(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        for (var6 = 0; var6 < this.field_h; var6++) {
          this.field_l[var6] = (short)(param1 * this.field_l[var6] / param2);
          this.field_b[var6] = (short)(this.field_b[var6] * param3 / param2);
          this.field_H[var6] = (short)(param4 * this.field_H[var6] / param2);
        }
        if (param0) {
          this.ensureBounds((byte) -85);
        }
        this.invalidateBounds(113);
    }

    final static void closeAllPopups(int param0) {
        if (param0 != 2) {
          return;
        }
        DisplayModeInfo.closeContextMenu(true);
        TextMetricsGlobals.closeNameEntryPopup((byte) -124);
        SpriteWidget.field_yb = null;
        DualLinkDequeIterator.closeModal((byte) -42);
    }

    private final void invalidateBounds(int param0) {
        this.field_N = false;
        if (param0 <= 33) {
          this.field_T = 84;
        }
    }

    TriangleMesh() {
        this.field_a = (byte) 0;
        this.field_N = false;
    }

    static {
        field_Q = "Disruptive behaviour";
        field_F = 0;
        field_v = new AudioSetupHelpers();
    }
}
