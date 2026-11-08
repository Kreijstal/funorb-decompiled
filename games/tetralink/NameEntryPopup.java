/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameEntryPopup extends UiComponent {
    static String field_Pb;
    private UiComponent field_Rb;
    private UiComponent field_Sb;
    static int field_Lb;
    static AnimationSequence field_Vb;
    static long[][] field_Ub;
    static long[] field_Ob;
    private StringBuilder field_Tb;
    static String field_Kb;
    private int field_Qb;
    static String field_Mb;
    static String field_Nb;

    final int updateAndPollNameInput(boolean param0, byte param1) {
        StringBuilder discarded$1 = null;
        int var4;
        var4 = TetraLink.field_J;
        this.updateInput(0, param0);
        if (param0) {
          while (KeyEventHelpers.pollKeyEvent((byte) 28)) {
            if (WidgetStyleLayer.field_e == 85 &&
              this.field_Tb.length() > 0) {
              StringPadHelpers.resizeAndPad(-26750, this.field_Tb, this.field_Tb.length() - 1, ' ');
            }
            if (ProgressMessageDialog.canAppendNameCharacter(AnimationSequence.field_m, -1, (CharSequence) ((Object) this.field_Tb)) ||
              (this.field_Tb.length() == 0 &&
              AnimationSequence.field_m == 91 ||
              this.field_Tb.length() == 1 &&
              AnimationSequence.field_m == 35) ||
              93 == AnimationSequence.field_m) {
              discarded$1 = this.field_Tb.append(AnimationSequence.field_m);
            }
            if (WidgetStyleLayer.field_e != 84) {
              if (13 == WidgetStyleLayer.field_e) {
                return 1;
              }
              continue;
            }
            if (this.field_Tb.length() <= 0) {
              return 1;
            }
            this.field_jb = this.field_Tb.toString();
            return 2;
          }
        }
        if (param1 != 58) {
          return -78;
        }
        this.field_Rb.field_jb = this.field_Tb.toString();
        if (param0 &&
          NameAvailabilityValidator.field_t != 0 &&
          this.field_F == 0) {
          this.field_Qb = 1;
        }
        return this.field_Qb;
    }

    final static void openLoadingDialog(int param0) {
        MenuInputState.showLoadingProgressScreen(true);
        ArchiveIndex.setPendingMenuAction(4, 0);
        if (param0 != 5959) {
          Archive var2 = (Archive) null;
          NameEntryPopup.initializeSocialPanels((byte) 20, (Archive) null);
        }
    }

    public static void releaseStatics(byte param0) {
        field_Nb = null;
        field_Vb = null;
        if (param0 != 102) {
          field_Vb = (AnimationSequence) null;
        }
        field_Kb = null;
        field_Ob = null;
        field_Ub = (long[][]) null;
        field_Pb = null;
        field_Mb = null;
    }

    final boolean handleNormalizedNameKey(int param0) {
        int var2 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        if (this.field_Qb != 0) {
          return false;
        }
        if (param0 != 0) {
          field_Mb = (String) null;
        }
        if (WidgetStyleLayer.field_e == 85 &&
          !(0 >= this.field_Tb.length())) {
          StringPadHelpers.resizeAndPad(-26750, this.field_Tb, this.field_Tb.length() - 1, ' ');
        }
        if (this.field_Tb.length() < 12) {
          var2 = Character.toLowerCase(AnimationSequence.field_m);
          if (var2 == 32) {
            var2 = 95;
          }
          if (95 == var2 &&
            !(this.field_Tb.length() <= 0)) {
            discarded$0 = this.field_Tb.append((char) var2);
          }
          if (ScreenSwitchHelpers.isAsciiLetter((byte) -105, (char) var2) ||
            DiskArchiveRequest.isAsciiDigit((char) var2, (byte) 88)) {
            discarded$1 = this.field_Tb.append((char) var2);
          }
        }
        if (WidgetStyleLayer.field_e != 84) {
        } else {
          if (this.field_Tb.length() > 0) {
            this.field_jb = this.field_Tb.toString();
            this.field_Qb = 2;
          } else {
            this.field_Qb = 1;
          }
        }
        if (WidgetStyleLayer.field_e != 13) {
          return true;
        }
        this.field_Qb = 1;
        return true;
    }

    NameEntryPopup(int param0, int param1, int param2, int param3, String param4, UiComponent param5, UiComponent param6, UiComponent param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Qb = 0;
        try {
          this.field_Sb = new UiComponent(0L, param6, param4);
          this.addChild((byte) -93, this.field_Sb);
          this.field_Rb = new UiComponent(0L, param7);
          this.field_Rb.field_N = 16764006;
          this.addChild((byte) -92, this.field_Rb);
          this.field_Rb.field_O = "|";
          this.field_Tb = new StringBuilder(12);
          var9_int = this.field_Sb.measureUnconstrainedWidth(-88);
          this.field_Sb.setBounds((byte) -119, var9_int, 3, GameKeyHandler.field_d, 5);
          this.field_Rb.setBounds((byte) -100, var9_int, GameKeyHandler.field_d + 3, GameKeyHandler.field_d, 5);
          var10 = var9_int + 10;
          var11 = 3 + (GameKeyHandler.field_d * 2 + 3);
          var12 = CameraAndChatHelpers.clampPopupX(var10, (byte) 124, param0, param2);
          var13 = GameRoomPanelHelpers.placePopupVertically(param3, param1, var11, -8748);
          this.setBounds((byte) -115, var10, var13, var11, var12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("vg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void readQueuedListResponse(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        PendingListRequest var4 = null;
        int var4_int = 0;
        int var5 = 0;
        FullscreenCanvasHelpers var5_ref_bm = null;
        int[] var6 = null;
        int var8 = 0;
        BitPacketBuffer var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = TetraLink.field_J;
        try {
          var9 = BackgroundSparkle.field_q;
          var2 = var9.readUnsignedByte((byte) -99);
          if (param0 < 33) {
            return;
          }
          var3 = var9.readUnsignedByte((byte) -99);
          if (var2 == 0) {
            var4 = (PendingListRequest) (RasterTargetHelpers.field_c.first(false));
            if (var4 == null) {
              SocialTabsPanel.closeGameSocket(false);
              return;
            }
            var5 = KeyHandlerHelpers.field_d - var9.position;
            var11 = var4.field_r;
            var10 = var11;
            var6 = var10;
            if (var11.length << 2 < var5) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var7 < var5; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.readUnsignedByte((byte) -99) << (StatusRequestHelpers.bitAnd(var7, 3) << 8));
            }
            var4.unlink(false);
            return;
          }
          if (var2 == 1) {
            var4_int = var9.readSignedSmart((byte) 82);
            var5_ref_bm = (FullscreenCanvasHelpers) (QuickChatMenuFactory.field_a.first(false));
            while (var5_ref_bm != null) {
              if (var3 != var5_ref_bm.field_t ||
                var5_ref_bm.field_r != var4_int) {
                var5_ref_bm = (FullscreenCanvasHelpers) (QuickChatMenuFactory.field_a.next((byte) -70));
                continue;
              }
              break;
            }
            if (var5_ref_bm != null) {
              var5_ref_bm.unlink(false);
              return;
            }
            SocialTabsPanel.closeGameSocket(false);
            return;
          }
          HotspotTextWidget.reportClientError(-105, (Throwable) null, "LR1: " + PacketDiagnosticsHelpers.describeCurrentPacket(false));
          SocialTabsPanel.closeGameSocket(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "vg.D(" + param0 + ')');
        }
    }

    final static void initializeSocialPanels(byte param0, Archive param1) {
        QuickChatCommandType.field_b = LoadingProgressDialog.loadFontByName(param1, (byte) -45, "display_name_changed", "basic");
        TopLevelContainerHelpers.field_f = new TwoColumnListPanel(0L, KeyEventHelpers.field_b, RasterBuffer.field_d, CheckboxWidget.field_S);
        BufferedSocket.field_n = new TwoColumnListPanel(0L, KeyEventHelpers.field_b, CheckboxWidget.field_Q, MarkerSlider.field_P);
        GzipDecompressor.field_d = new UiComponent(0L, (UiComponent) null);
        LabelPairWidget.field_Kb = new UiComponent(0L, TextLayoutLine.field_i);
        LabelPairWidget.field_Kb.field_xb = 1;
        Js5Transport.field_i = new UiComponent(0L, CacheEntry.field_x, FullscreenCanvasHelpers.field_o);
        CameraAndChatHelpers.field_b = new UiComponent(0L, TextFieldValidator.field_l, FullscreenFocusCanvas.field_g);
        DualLinkNodeHashTable.field_i = new UiComponent(0L, NotificationToast.field_n);
        GzipDecompressor.field_d.addChild((byte) -85, LabelPairWidget.field_Kb);
        GzipDecompressor.field_d.addChild((byte) 59, Js5Transport.field_i);
        GzipDecompressor.field_d.addChild((byte) -107, CameraAndChatHelpers.field_b);
        GzipDecompressor.field_d.addChild((byte) -117, TopLevelContainerHelpers.field_f);
        GzipDecompressor.field_d.addChild((byte) 64, DualLinkNodeHashTable.field_i);
        TopLevelContainerHelpers.field_f.field_Rb.field_Ob.applyStyle(TextLayoutLine.field_i, -2147483648);
        TopLevelContainerHelpers.field_f.field_Rb.field_Ob.field_J = 1;
        UiComponent var5 = TopLevelContainerHelpers.field_f.field_Rb.field_Ob;
        UiComponent var6 = var5;
        var6.field_xb = 1;
        BufferedSocket.field_n.field_Rb.field_Ob.applyStyle(TextLayoutLine.field_i, -2147483648);
        UiComponent var3 = BufferedSocket.field_n.field_Rb.field_Ob;
        if (param0 <= 20) {
          return;
        }
        try {
          BufferedSocket.field_n.field_Rb.field_Ob.field_J = 1;
          var3.field_xb = 1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "vg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawViewModeTab(int param0) {
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var5_ref = null;
        Object var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var5Lifetime3;
        var9 = TetraLink.field_J;
        try {
          if (ContextMenu.field_bc == null) {
            stackIn_6_0 = (null != SocialListEntry.field_Qb) ? 1 : 0;
          } else {
            stackIn_6_0 = ContextMenu.field_bc.field_b ? 1 : 0;
          }
          var1_int = stackIn_6_0;
          if (var1_int != 0) {
            stackIn_9_0 = IsaacCipher.field_a.field_z;
          } else {
            stackIn_9_0 = 480;
          }
          var2 = stackIn_9_0;
          if (param0 < 83) {
            return;
          }
          if (0 != ContentTransitionDialog.field_ab ||
            WidgetTheme.field_u != 0) {
            var3 = 128;
            var4 = 4210752;
            if (SettingsCookieHelpers.field_a == 0) {
              var4 = 128;
            }
            if (0 == ContentTransitionDialog.field_ab) {
              var3 = RasterBuffer.field_i / 2;
            }
            if (0 == WidgetTheme.field_u) {
              var3 = (-RasterBuffer.field_i + 256) / 2;
            }
            for (var5 = 0; var5 < 18; var5++) {
              SoftwareRasterizer.drawHorizontalLineAlpha(-(int)ClientProtocolStage.field_d + (640 + var5 / 2), -var5 + var2, -(var5 / 2) + (int)ClientProtocolStage.field_d, var4, var3);
              SoftwareRasterizer.drawHorizontalLineAlpha(var5 / 2 + (638 - (int)ClientProtocolStage.field_d), var2 - var5, 2, 16777215, var3);
            }
            for (var5Lifetime3 = 18; var5Lifetime3 < 20; var5Lifetime3++) {
              SoftwareRasterizer.drawHorizontalLineAlpha(-(int)ClientProtocolStage.field_d + (638 + var5Lifetime3 / 2), -var5Lifetime3 + var2, 2 + ((int)ClientProtocolStage.field_d - var5Lifetime3 / 2), 16777215, var3);
            }
            var5_ref = null;
            if (ContentTransitionDialog.field_ab == 1) {
              var5_ref = ReflectionCheckHelpers.field_d;
            }
            if (ContentTransitionDialog.field_ab == 2) {
              var5_ref = ArchiveFactoryHelpers.field_c;
            }
            if (RasterBuffer.field_i == 0) {
              GzipDecompressor.field_g.drawLeft((String) (var5_ref), -(int)ClientProtocolStage.field_d + 652, var2 - 2, 16777215, -1);
            } else {
              var6_ref = null;
              if (1 == WidgetTheme.field_u) {
                var6_ref = ReflectionCheckHelpers.field_d;
              }
              if (WidgetTheme.field_u == 2) {
                var6_ref = ArchiveFactoryHelpers.field_c;
              }
              GzipDecompressor.field_g.drawLeftAlpha((String) (var5_ref), -(int)ClientProtocolStage.field_d + 652, -2 + var2, 16777215, -1, -RasterBuffer.field_i + 256);
              GzipDecompressor.field_g.drawLeftAlpha((String) (var6_ref), -(int)ClientProtocolStage.field_d + 652, var2 - 2, 16777215, -1, RasterBuffer.field_i);
            }
          }
          if (ContentTransitionDialog.field_ab != 2 &&
            WidgetTheme.field_u != 2) {
            return;
          }
          var2 -= 20;
          var3Lifetime1 = 128;
          var4Lifetime1 = 256;
          if (ContentTransitionDialog.field_ab != 2) {
            var3Lifetime1 = RasterBuffer.field_i / 2;
            var4Lifetime1 = RasterBuffer.field_i;
          }
          if (WidgetTheme.field_u != 2) {
            var4Lifetime1 = 256 - RasterBuffer.field_i;
            var3Lifetime1 = (256 - RasterBuffer.field_i) / 2;
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 4; var5Lifetime1++) {
            var6 = 4210752;
            if (SettingsCookieHelpers.field_a == 1 + var5Lifetime1) {
              var6 = 128;
            }
            var7 = 638 + (-(int)ClientProtocolStage.field_d - (-(26 * var5Lifetime1) - 10));
            for (var8 = 0; var8 < 18; var8++) {
              SoftwareRasterizer.drawHorizontalLineAlpha(var8 / 2 + (var7 + 2), var2 - var8, 24, var6, var3Lifetime1);
              SoftwareRasterizer.drawHorizontalLineAlpha(var8 / 2 + var7, -var8 + var2, 2, 16777215, var3Lifetime1);
            }
            if (var4Lifetime1 != 256) {
              BoardAnimator.field_c[var5Lifetime1].drawWithOpacity(12 + var7, -13 + var2, var4Lifetime1);
            } else {
              BoardAnimator.field_c[var5Lifetime1].drawTransparent(12 + var7, var2 - 13);
            }
          }
          var5Lifetime2 = 4210752;
          if (SettingsCookieHelpers.field_a == 5) {
            var5Lifetime2 = 128;
          }
          var6Lifetime1 = 104 + (638 - ((int)ClientProtocolStage.field_d - 10));
          for (var7Lifetime1 = 0; var7Lifetime1 < 18; var7Lifetime1++) {
            SoftwareRasterizer.drawHorizontalLineAlpha(var6Lifetime1 + (2 + var7Lifetime1 / 2), -var7Lifetime1 + var2, 30, var5Lifetime2, var3Lifetime1);
            SoftwareRasterizer.drawHorizontalLineAlpha(var6Lifetime1 + var7Lifetime1 / 2, -var7Lifetime1 + var2, 2, 16777215, var3Lifetime1);
          }
          if (256 == var4Lifetime1) {
            BoardAnimator.field_c[4].drawTransparent(10 + var6Lifetime1, -13 + var2);
          } else {
            BoardAnimator.field_c[4].drawWithOpacity(10 + var6Lifetime1, -13 + var2, var4Lifetime1);
          }
          for (var7Lifetime2 = -2; var7Lifetime2 < 0; var7Lifetime2++) {
            SoftwareRasterizer.drawHorizontalLineAlpha((-1 + var7Lifetime2) / 2 + (638 - (int)ClientProtocolStage.field_d + 20), var2 - 20 - var7Lifetime2, 130, 16777215, var3Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "vg.B(" + param0 + ')');
        }
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_Ob = new long[11];
        field_Ub = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (1 & var0) ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (!(var4 < 256L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_Ub[0][var0] = NameAvailabilityValidator.bitOr(NameAvailabilityValidator.bitOr(var4 << 8, NameAvailabilityValidator.bitOr(NameAvailabilityValidator.bitOr(var10 << 24, NameAvailabilityValidator.bitOr(var2 << 32, NameAvailabilityValidator.bitOr(var6 << 40, NameAvailabilityValidator.bitOr(var2 << 56, var2 << 48)))), var8 << 16)), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_Ub[var14][var0] = NameAvailabilityValidator.bitOr(field_Ub[-1 + var14][var0] << 56, field_Ub[var14 - 1][var0] >>> 8);
            }
            var0++;
        }
        field_Ob[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = 8 * var0 - 8;
            field_Ob[var0] = CacheEntry.bitXor(CacheEntry.bitXor(SocketJs5Transport.bitAnd(65280L, field_Ub[6][6 + var1]), CacheEntry.bitXor(SocketJs5Transport.bitAnd(16711680L, field_Ub[5][var1 + 5]), CacheEntry.bitXor(CacheEntry.bitXor(SocketJs5Transport.bitAnd(field_Ub[3][3 + var1], 1095216660480L), CacheEntry.bitXor(CacheEntry.bitXor(SocketJs5Transport.bitAnd(field_Ub[1][1 + var1], 71776119061217280L), SocketJs5Transport.bitAnd(-72057594037927936L, field_Ub[0][var1])), SocketJs5Transport.bitAnd(280375465082880L, field_Ub[2][2 + var1]))), SocketJs5Transport.bitAnd(field_Ub[4][var1 + 4], 4278190080L)))), SocketJs5Transport.bitAnd(field_Ub[7][var1 + 7], 255L));
        }
        field_Mb = "Please log in to access this feature.";
        field_Nb = "There are no valid types of game that match your preferences.";
    }
}
