/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolHasher {
    static BufferedSocket field_g;
    private byte[] field_f;
    private long[] field_k;
    static Sprite[] field_l;
    static int field_b;
    private long[] field_h;
    private int field_j;
    static ClientProtocolStage field_a;
    private int field_e;
    private long[] field_d;
    private byte[] field_n;
    static int field_o;
    private long[] field_c;
    private long[] field_i;
    static int[] field_m;

    final static void updateLobbyPanels(int param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9) {
        int var11;
        var11 = TetraLink.field_J;
        if (!param6 && (SoftwareRasterizer.field_f != PendingStatQuery.field_n ||
          SoftwareRasterizer.field_e != TextLayoutLine.field_c) && (WidgetContainer.field_O.field_j == SoftwareRasterizer.field_e &&
          WidgetContainer.field_O.field_h == SoftwareRasterizer.field_f)) {
          if (null != AccountWelcomePanel.field_N) {
            DialWidgetPainter.layoutLobbyComponents(false, true);
          } else {
            if (null == GameKeyHandler.field_a) {
              QuickChatCommandType.layoutLobbyWidgets(5);
            } else {
              DialWidgetPainter.layoutLobbyComponents(true, true);
            }
          }
        }
        if (param6) {
          LoadingStatusHelpers.field_d = SocialListEntry.field_Ob;
        } else {
          LoadingStatusHelpers.field_d = (PendingStatQuery.field_n - 640) / 2;
        }
        SocketConnector.advanceLobbyTransitions(param6, (byte) 16);
        if (DialWidget.field_ab > 0) {
          ClientException.updateCreateGameControls(param6, param8, 21485, param9);
        }
        if (param0 >= -33) {
          return;
        }
        ServerConnectionHelpers.field_a.field_V = ServerConnectionHelpers.field_b.field_V;
        ServerConnectionHelpers.field_a.field_xb = 1;
        if (0 < MusicPatch.field_t) {
          WidgetStyleLayer.updateGameSetupPanel(param9, false, param6, param8);
        }
        if (0 < MiscTextGlobals.field_f) {
          GameRoomPanelHelpers.updateGameRoomPanel(param5, param6, param8, param9, -87);
        }
        if (StripedProgressBar.field_S &&
          AccountWelcomePanel.field_N.field_jc >= AccountWelcomePanel.field_N.field_rc) {
          DateInputWidget.field_Q.field_Ob.field_jb = MatchingTextValidator.field_s;
          TextMetricsGlobals.field_c.field_S = false;
          EmailAvailabilityValidator.resetChildLayouts(DateInputWidget.field_Q.field_Pb, (byte) -104);
        } else {
          DateInputWidget.field_Q.field_Ob.field_jb = null;
          TextMetricsGlobals.field_c.field_S = true;
          PasswordFieldPainter.layoutLobbyGameRows(param3, DateInputWidget.field_Q, param7, -1, param8);
        }
        SpriteState.updateLobbyGameList(param8, param2, param7, param3, (byte) -73, param1, param4);
        PasswordFieldPainter.layoutLobbyGameRows(param3, QueuedListRequest.field_x, param7, -1, param8);
        MatchingTextValidator.field_u = MatchingTextValidator.field_u + 1;
    }

    final void updateBits(byte[] param0, long param1, boolean param2) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        var13 = TetraLink.field_J;
        try {
          var5_int = 0;
          var6 = 7 & -(7 & (int)param1) + 8;
          var7 = this.field_j & 7;
          if (!param2) {
            WhirlpoolHasher.releaseStatics(-105);
          }
          var9 = param1;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((255 & this.field_f[var11]) + ((int)var9 & 255));
            this.field_f[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (8L < param1) {
            var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> 8 - var6;
            if (var8 >= 0 &&
              256 > var8) {
              this.field_n[this.field_e] = (byte)IntrusiveNode.bitOr((int) this.field_n[this.field_e], var8 >>> var7);
              this.field_e = this.field_e + 1;
              this.field_j = this.field_j + (8 - var7);
              if (this.field_j == 512) {
                this.processBlock(31);
                this.field_e = 0;
                this.field_j = 0;
              }
              this.field_n[this.field_e] = (byte)StatusRequestHelpers.bitAnd(255, var8 << -var7 + 8);
              var5_int++;
              param1 = param1 - 8L;
              this.field_j = this.field_j + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L < param1) {
            stackIn_17_0 = param0[var5_int] << var6;
            stackIn_17_1 = 255;
            var8Lifetime1 = stackIn_17_0 & stackIn_17_1;
            this.field_n[this.field_e] = (byte)IntrusiveNode.bitOr((int) this.field_n[this.field_e], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if ((long)var7 + param1 < 8L) {
            this.field_j = (int)((long)this.field_j + param1);
          } else {
            param1 = param1 - (long)(-var7 + 8);
            this.field_j = this.field_j + (-var7 + 8);
            this.field_e = this.field_e + 1;
            if (this.field_j == 512) {
              this.processBlock(31);
              this.field_e = 0;
              this.field_j = 0;
            }
            this.field_n[this.field_e] = (byte)StatusRequestHelpers.bitAnd(var8Lifetime1 << -var7 + 8, 255);
            this.field_j = this.field_j + (int)param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("li.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void processBlock(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = TetraLink.field_J;
        var2 = 0;
        var3 = 0;
        while (8 > var2) {
          this.field_i[var2] = CacheEntry.bitXor(CacheEntry.bitXor(SocketJs5Transport.bitAnd(65280L, (long)this.field_n[6 + var3] << 8), CacheEntry.bitXor(CacheEntry.bitXor(CacheEntry.bitXor(CacheEntry.bitXor(SocketJs5Transport.bitAnd((long)this.field_n[var3 + 2], 255L) << 40, CacheEntry.bitXor(SocketJs5Transport.bitAnd((long)this.field_n[1 + var3], 255L) << 48, (long)this.field_n[var3] << 56)), SocketJs5Transport.bitAnd(255L, (long)this.field_n[3 + var3]) << 32), SocketJs5Transport.bitAnd((long)this.field_n[4 + var3], 255L) << 24), SocketJs5Transport.bitAnd((long)this.field_n[var3 + 5], 255L) << 16)), SocketJs5Transport.bitAnd(255L, (long)this.field_n[var3 + 7]));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_k[var2Lifetime1];
          arrayValue$1 = this.field_i[var2Lifetime1];
          this.field_c[var2Lifetime1] = dupTemp$0;
          this.field_d[var2Lifetime1] = CacheEntry.bitXor(arrayValue$1, dupTemp$0);
        }
        if (param0 != 31) {
          return;
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_h[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_h[var3Lifetime1] = CacheEntry.bitXor(this.field_h[var3Lifetime1], NameEntryPopup.field_Ub[var4][StatusRequestHelpers.bitAnd((int)(this.field_c[StatusRequestHelpers.bitAnd(-var4 + var3Lifetime1, 7)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_c[var3Lifetime1Lifetime1] = this.field_h[var3Lifetime1Lifetime1];
          }
          this.field_c[0] = CacheEntry.bitXor(this.field_c[0], NameEntryPopup.field_Ob[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_h[var3Lifetime1Lifetime2] = this.field_c[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_h[var3Lifetime1Lifetime2] = CacheEntry.bitXor(this.field_h[var3Lifetime1Lifetime2], NameEntryPopup.field_Ub[var7][StatusRequestHelpers.bitAnd(255, (int)(this.field_d[StatusRequestHelpers.bitAnd(7, -var7 + var3Lifetime1Lifetime2)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_d[var3Lifetime1Lifetime3] = this.field_h[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_k[var2Lifetime3] = CacheEntry.bitXor(this.field_k[var2Lifetime3], CacheEntry.bitXor(this.field_i[var2Lifetime3], this.field_d[var2Lifetime3]));
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_a = null;
        if (param0 != 255) {
          field_g = (BufferedSocket) null;
        }
        field_m = null;
        field_l = null;
    }

    final static String requestAddIgnore(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        BitPacketBuffer var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param1);
          if (!InterfaceTextLoader.isValidPlayerName(false, var6)) {
            stackIn_2_0 = WidgetNode.field_u;
            return stackIn_2_0;
          }
          if (PieceDropAnimation.matchesNormalizedSessionName(param1, param2 ^ 6)) {
            stackIn_5_0 = UiComponent.field_A;
            return stackIn_5_0;
          }
          if (TwoColumnListPanel.field_Tb != 2) {
            stackIn_8_0 = AnimationFrameSet.field_w;
            return stackIn_8_0;
          }
          if (ArchiveGroupHelpers.areAllGroupsReady((byte) 2, param1)) {
            stackIn_12_0 = SectorCacheStore.formatTemplate(new String[]{param1}, UiComponent.field_B, 127);
            return stackIn_12_0;
          }
          if (100 <= SocketConnector.field_c) {
            stackIn_16_0 = CanvasAndErrorHelpers.field_c;
            return stackIn_16_0;
          }
          if (IsaacCipher.isFriend(1, param1)) {
            stackIn_19_0 = SectorCacheStore.formatTemplate(new String[]{param1}, TwoColumnListPanel.field_Vb, param2 + 119);
            return stackIn_19_0;
          }
          var5 = QuickChatHelpDialog.field_Lb;
          var5.writeCipheredByte(param0, (byte) -92);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(param2, false);
          var5.writeString(param1, 0);
          var5.backpatchByteLength(-var4 + var5.position, param2 ^ -4);
          stackIn_21_0 = null;
          return (String) (stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("li.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    final void reset(boolean param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_f[var2] = (byte) 0;
        }
        this.field_e = 0;
        this.field_j = 0;
        this.field_n[0] = (byte) 0;
        if (param0) {
          return;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_k[var2Lifetime1] = 0L;
        }
    }

    final static void configureUiTheme(int param0, Sprite[] param1, int param2, boolean param3, int param4, int param5, int param6, Sprite[] param7, int param8, int param9, BitmapFont param10, int param11, BitmapFont param12, int param13, int param14) {
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
        RuntimeException var15 = null;
        Sprite[] var16 = null;
        try {
          var16 = (Sprite[]) null;
          ArchiveRequest.configureUiTheme(param13, (Sprite[]) null, param10, ProgressMessageDialog.field_wb, IntrusiveNode.field_b, -11319, param5, 0, param2, param14, 0, param8, param9, param7, NineSliceFrame.field_b, param6, param12, param0, param11, param1, 480);
          DualLinkNode.enterFullscreen((byte) -75, param3);
          if (param4 >= -72) {
            WhirlpoolHasher.updateLobbyPanels(4, 80, -105, 93, true, true, true, true, 64, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_5_0 = var15;
          stackIn_5_1 = new StringBuilder().append("li.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    final static void pumpPlatformEvents(PlatformTaskDispatcher param0, Object param1, byte param2) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = TetraLink.field_J;
        try {
          if (param2 > -92) {
            return;
          }
          if (null == param0.field_p) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (param0.field_p.peekEvent() != null) {
              AnimationSequence.sleepMillis(false, 1L);
              continue;
            }
            break;
          }
          try {
            if (param1 != null) {
              param0.field_p.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("li.I(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final void finishDigest(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = TetraLink.field_J;
        try {
          this.field_n[this.field_e] = (byte)IntrusiveNode.bitOr((int) this.field_n[this.field_e], 128 >>> StatusRequestHelpers.bitAnd(this.field_j, 7));
          this.field_e = this.field_e + 1;
          if (this.field_e > 32) {
            while (this.field_e < 64) {
              fieldTemp$0 = this.field_e;
              this.field_e = this.field_e + 1;
              this.field_n[fieldTemp$0] = (byte) 0;
            }
            this.processBlock(31);
            this.field_e = 0;
          }
          while (this.field_e < 32) {
            fieldTemp$1 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_n[fieldTemp$1] = (byte) 0;
          }
          ArraySupport.copy(this.field_f, 0, this.field_n, 32, 32);
          this.processBlock(31);
          var4_int = 0;
          var5 = param1;
          if (param2 >= -39) {
            this.field_c = (long[]) null;
          }
          while (var4_int < 8) {
            var6 = this.field_k[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[var5 + 1] = (byte)(int)(var6 >>> 48);
            param0[var5 + 2] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[var5 + 7] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("li.G(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    WhirlpoolHasher() {
        this.field_f = new byte[32];
        this.field_k = new long[8];
        this.field_j = 0;
        this.field_h = new long[8];
        this.field_e = 0;
        this.field_d = new long[8];
        this.field_n = new byte[64];
        this.field_c = new long[8];
        this.field_i = new long[8];
    }

    static {
        field_b = 0;
        field_o = 0;
        field_a = new ClientProtocolStage();
    }
}
